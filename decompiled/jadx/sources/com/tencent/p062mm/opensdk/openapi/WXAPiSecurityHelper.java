package com.tencent.p062mm.opensdk.openapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.alipay.sdk.p010m.p037n.C0172c;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.tencent.p062mm.opensdk.modelbase.BaseReq;
import com.tencent.p062mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p062mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.p062mm.opensdk.utils.C0626d;
import com.tencent.p062mm.opensdk.utils.Log;
import com.umeng.analytics.pro.C0655am;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONArray;
import org.json.JSONObject;
import p067l.C10878;
import p067l.C14523;

/* JADX INFO: loaded from: classes.dex */
public class WXAPiSecurityHelper {
    public static final int MAX_STORE_KEY = 100;
    public static final int MAX_STORE_VALUE = 2048;
    public static final String SECURITY_KEY_TIMESTAMP_SECOND = "security_key_timestamp_second";
    public static final String STORE_VALUE_DATA = "security_key_resp";
    public static final String TAG = "MicroMsg.SDK.WXAPiSecurityHelper";
    public final Context context;
    public final CopyOnWriteArraySet overtimeSyncReqSet = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: sp */
    public final SharedPreferences f2126sp;

    public class CheckRuleResult {
        public static final int NoPass = 2;
        public static final int Pass = 1;
        public static final int Unknown = 0;
    }

    public class ExtraSecurityCheckRes {
        public static final int Directly_NoPass = 1;
        public static final int Directly_Pass = 0;
        public static final int Need_Deep_Check = 2;
    }

    public interface IHttpCheckCallback {
        void onHttpCheckFinish(PromiseShareRule promiseShareRule);
    }

    public interface ISecurityCheck {
        void onCheckFinish(boolean z);
    }

    public interface ISecuritySyncCheck {
        void onSyncCheckFinish(boolean z);
    }

    public class PassContext {
        public String appid;
        public String inputUrl;
        public PromiseShareRule localRule;
        public String reqSessionId;
        public String version;

        public PassContext() {
            this.reqSessionId = "";
            this.appid = "";
            this.inputUrl = "";
            this.version = "";
            this.localRule = new PromiseShareRule();
        }
    }

    public class PromiseShareRule {
        public String appidInRule;
        public String buffer;
        public long nextRequestIntervalSecond;
        public String orgJsonData;
        public String reqAppid;
        public int state;
        public List urlRuleList;
        public long userWaitTimeMs;

        public PromiseShareRule() {
            this.orgJsonData = "";
            this.reqAppid = "";
            this.appidInRule = "";
            this.urlRuleList = new ArrayList();
            this.buffer = "";
        }

        public long getLegalReqInterval() {
            long j = this.nextRequestIntervalSecond;
            if (j <= 0 || j >= 86400) {
                j = 3600;
            }
            Log.m2020d(WXAPiSecurityHelper.TAG, "getLegalReqInterval = ".concat(String.valueOf(j)));
            return j;
        }

        public long getLegalUserWaitTime() {
            long j = this.userWaitTimeMs;
            if (j <= 100 || j >= 60000) {
                j = 5000;
            }
            Log.m2020d(WXAPiSecurityHelper.TAG, "getLegalUserWaitTime = ".concat(String.valueOf(j)));
            return j;
        }
    }

    public class RuleState {
        public static final int InRule = 1;
        public static final int None = 0;
        public static final int NotInRule = 2;
    }

    public class UrlRule {
        public String host;
        public List mustQueryKey;

        public UrlRule() {
            this.host = "";
            this.mustQueryKey = new ArrayList();
        }
    }

    public class WXSecurityData {
        public String appid;
        public long lastStoreTimeStampSecond;
        public String respDataJson;

        public WXSecurityData() {
            this.appid = "";
            this.respDataJson = "";
        }

        public boolean isBasicParamsAllowed() {
            long j = this.lastStoreTimeStampSecond;
            return (!((j > 0L ? 1 : (j == 0L ? 0 : -1)) > 0 && (j > (System.currentTimeMillis() / 1000) ? 1 : (j == (System.currentTimeMillis() / 1000) ? 0 : -1)) < 0) || C0626d.m2033b(this.appid) || C0626d.m2033b(this.respDataJson)) ? false : true;
        }
    }

    public WXAPiSecurityHelper(Context context) {
        this.context = context;
        this.f2126sp = context.getSharedPreferences("__wx_opensdk_sp__", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int checkRuleCanPass(String str, PromiseShareRule promiseShareRule) {
        String str2;
        Log.m2020d(TAG, "checkRuleCanPass, start check!");
        if (promiseShareRule.orgJsonData.length() > 2048) {
            Log.m2024w(TAG, "response json is too long!");
            return 0;
        }
        int i = promiseShareRule.state;
        if (i == 2) {
            str2 = "checkRuleCanPass, not in rule";
        } else {
            if (i != 1 || !promiseShareRule.appidInRule.equals(promiseShareRule.reqAppid)) {
                Log.m2020d(TAG, "checkRuleCanPass, unknown");
                return 0;
            }
            if (promiseShareRule.urlRuleList.size() == 0) {
                str2 = "checkRuleCanPass, urlRuleList empty!";
            } else {
                boolean zCheckUrlParametersLegal = checkUrlParametersLegal(str, promiseShareRule);
                Log.m2020d(TAG, "checkRuleCanPass, urlCheckResult = ".concat(String.valueOf(zCheckUrlParametersLegal)));
                if (!zCheckUrlParametersLegal) {
                    Log.m2020d(TAG, "checkRuleCanPass, no pass");
                    return 2;
                }
                str2 = "checkRuleCanPass, pass";
            }
        }
        Log.m2020d(TAG, str2);
        return 1;
    }

    private void doRequest(final PassContext passContext, final IHttpCheckCallback iHttpCheckCallback) {
        C0626d.m2031b().submit(new Runnable() { // from class: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.6
            @Override // java.lang.Runnable
            public void run() {
                WXAPiSecurityHelper wXAPiSecurityHelper = WXAPiSecurityHelper.this;
                PassContext passContext2 = passContext;
                iHttpCheckCallback.onHttpCheckFinish(WXAPiSecurityHelper.this.convert2ShareRule(passContext.appid, wXAPiSecurityHelper.postHttpRequest(passContext2.appid, passContext2.version, passContext2.localRule.buffer).toString()));
            }
        });
    }

    private void doRequestAsync(PassContext passContext) {
        Log.m2020d(TAG, "doRequestAsync");
        doRequest(passContext, new IHttpCheckCallback() { // from class: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.3
            @Override // com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.IHttpCheckCallback
            public void onHttpCheckFinish(PromiseShareRule promiseShareRule) {
                WXAPiSecurityHelper.this.storeIfNecessary(promiseShareRule);
            }
        });
    }

    private void doRequestSync(final PassContext passContext, final ISecuritySyncCheck iSecuritySyncCheck) {
        Log.m2022i(TAG, "requestId = " + passContext.reqSessionId);
        final Timer timer = new Timer(passContext.reqSessionId);
        timer.schedule(new TimerTask() { // from class: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.4
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                Log.m2022i(WXAPiSecurityHelper.TAG, "sync request overtime, requestId = " + passContext.reqSessionId);
                WXAPiSecurityHelper.this.overtimeSyncReqSet.add(passContext.reqSessionId);
                ISecuritySyncCheck iSecuritySyncCheck2 = iSecuritySyncCheck;
                if (iSecuritySyncCheck2 != null) {
                    iSecuritySyncCheck2.onSyncCheckFinish(true);
                }
            }
        }, passContext.localRule.getLegalUserWaitTime());
        doRequest(passContext, new IHttpCheckCallback() { // from class: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.5
            @Override // com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.IHttpCheckCallback
            public void onHttpCheckFinish(PromiseShareRule promiseShareRule) {
                ISecuritySyncCheck iSecuritySyncCheck2;
                timer.cancel();
                if (WXAPiSecurityHelper.this.overtimeSyncReqSet.contains(passContext.reqSessionId)) {
                    WXAPiSecurityHelper.this.overtimeSyncReqSet.remove(passContext.reqSessionId);
                } else if (iSecuritySyncCheck != null) {
                    int iCheckRuleCanPass = WXAPiSecurityHelper.this.checkRuleCanPass(passContext.inputUrl, promiseShareRule);
                    boolean z = true;
                    if (iCheckRuleCanPass == 1) {
                        iSecuritySyncCheck2 = iSecuritySyncCheck;
                    } else {
                        if (iCheckRuleCanPass == 2) {
                            iSecuritySyncCheck2 = iSecuritySyncCheck;
                        } else {
                            int iCheckRuleCanPass2 = WXAPiSecurityHelper.this.checkRuleCanPass(passContext.inputUrl, WXAPiSecurityHelper.this.convert2ShareRule(passContext.appid, WXAPiSecurityHelper.this.getStoredData(passContext.appid).respDataJson));
                            ISecuritySyncCheck iSecuritySyncCheck3 = iSecuritySyncCheck;
                            if (iCheckRuleCanPass2 != 2) {
                                iSecuritySyncCheck2 = iSecuritySyncCheck3;
                            } else {
                                iSecuritySyncCheck2 = iSecuritySyncCheck3;
                            }
                        }
                        z = false;
                    }
                    iSecuritySyncCheck2.onSyncCheckFinish(z);
                }
                WXAPiSecurityHelper.this.storeIfNecessary(promiseShareRule);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void extraSecurityCheckDoCallback(final ISecurityCheck iSecurityCheck, final boolean z) {
        if (iSecurityCheck != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.2
                @Override // java.lang.Runnable
                public void run() {
                    Log.m2020d(WXAPiSecurityHelper.TAG, "has got result, callback on Main Thread.");
                    iSecurityCheck.onCheckFinish(z);
                }
            });
        }
    }

    private String getStoreKey(String str) {
        return "security_key_appid_".concat(String.valueOf(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void storeIfNecessary(PromiseShareRule promiseShareRule) {
        String str;
        Log.m2020d(TAG, "storeIfNecessary");
        if (C0626d.m2033b(promiseShareRule.reqAppid) || promiseShareRule.reqAppid.length() > 100) {
            str = "store fail! reqAppid illegal!";
        } else {
            if (!C0626d.m2033b(promiseShareRule.orgJsonData) && promiseShareRule.orgJsonData.length() <= 2048) {
                if (promiseShareRule.state == 1 && promiseShareRule.reqAppid.equals(promiseShareRule.appidInRule)) {
                    Log.m2020d(TAG, "storeIfNecessary, in rule");
                    storeCheckResp(promiseShareRule.reqAppid, promiseShareRule);
                }
                if (promiseShareRule.state == 2) {
                    Log.m2020d(TAG, "storeIfNecessary, not rule");
                    storeCheckResp(promiseShareRule.reqAppid, promiseShareRule);
                    return;
                }
                return;
            }
            str = "store fail! response json illegal!";
        }
        Log.m2022i(TAG, str);
    }

    public void commitSp(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.f2126sp.edit();
        editorEdit.putString(getStoreKey(str), str2);
        editorEdit.commit();
    }

    public int doExtraSecurityCheck(String str, String str2, String str3, final ISecurityCheck iSecurityCheck) {
        Log.m2022i(TAG, "doExtraSecurityCheck: start!");
        if (C0626d.m2033b(str) || C0626d.m2033b(str3)) {
            Log.m2021e(TAG, "doExtraSecurityCheck: appid or inputurl is empty!");
            return 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        PassContext passContext = new PassContext();
        StringBuilder sb = new StringBuilder();
        sb.append(jCurrentTimeMillis);
        sb.append(new Random().nextInt(9999));
        passContext.reqSessionId = sb.toString();
        passContext.appid = str;
        passContext.inputUrl = str3;
        passContext.version = str2;
        WXSecurityData storedData = getStoredData(str);
        if (this.context.getPackageManager().checkPermission("android.permission.INTERNET", this.context.getPackageName()) != 0) {
            Log.m2024w(TAG, "doExtraSecurityCheck: No Internet permission!");
            return 0;
        }
        if (!storedData.isBasicParamsAllowed()) {
            Log.m2020d(TAG, "doExtraSecurityCheck: local data illegal!");
            doRequestAsync(passContext);
            return 0;
        }
        PromiseShareRule promiseShareRuleConvert2ShareRule = convert2ShareRule(passContext.appid, storedData.respDataJson);
        passContext.localRule = promiseShareRuleConvert2ShareRule;
        boolean z = (storedData.lastStoreTimeStampSecond + promiseShareRuleConvert2ShareRule.getLegalReqInterval()) * 1000 < System.currentTimeMillis();
        Log.m2020d(TAG, "doExtraSecurityCheck: needDoNextReq: " + z + ", last req time stamp:" + storedData.lastStoreTimeStampSecond);
        if (!z) {
            int iCheckRuleCanPass = checkRuleCanPass(passContext.inputUrl, passContext.localRule);
            Log.m2020d(TAG, "doExtraSecurityCheck: no needDoNextReq, read local rule: ".concat(String.valueOf(iCheckRuleCanPass)));
            return iCheckRuleCanPass == 2 ? 1 : 0;
        }
        Log.m2020d(TAG, "doExtraSecurityCheck: needDoNextReq, state: " + passContext.localRule.state);
        if (passContext.localRule.state != 1) {
            doRequestAsync(passContext);
            return 0;
        }
        doRequestSync(passContext, new ISecuritySyncCheck() { // from class: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.1
            @Override // com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.ISecuritySyncCheck
            public void onSyncCheckFinish(boolean z2) {
                WXAPiSecurityHelper.this.extraSecurityCheckDoCallback(iSecurityCheck, z2);
            }
        });
        return 2;
    }

    public String extractMayNeedDoSecurityCheckUrl(String str, BaseReq baseReq) {
        if (baseReq.getType() != 2) {
            return "";
        }
        SendMessageToWX.Req req = (SendMessageToWX.Req) baseReq;
        if (req.message.getType() != 5) {
            return "";
        }
        WXWebpageObject wXWebpageObject = (WXWebpageObject) req.message.mediaObject;
        if (C0626d.m2033b(wXWebpageObject.webpageUrl)) {
            Log.m2022i(TAG, "webpageUrl empty, don't need check.");
            return "";
        }
        Log.m2022i(TAG, "need check.");
        return wXWebpageObject.webpageUrl;
    }

    public String getLocalStoredJson(String str) {
        return getStoredData(str).respDataJson;
    }

    public WXSecurityData getStoredData(String str) {
        String str2;
        WXSecurityData wXSecurityData = new WXSecurityData();
        Log.m2020d(TAG, "getStoredData, appid = ".concat(String.valueOf(str)));
        try {
            if (this.f2126sp.contains(getStoreKey(str))) {
                JSONObject jSONObject = new JSONObject(this.f2126sp.getString(getStoreKey(str), ""));
                long jOptLong = jSONObject.optLong(SECURITY_KEY_TIMESTAMP_SECOND);
                String strOptString = jSONObject.optString(STORE_VALUE_DATA);
                wXSecurityData.appid = str;
                wXSecurityData.lastStoreTimeStampSecond = jOptLong;
                wXSecurityData.respDataJson = strOptString;
                str2 = "getStoredData, Ok, appid = " + str + "timeStampSecond: " + wXSecurityData.lastStoreTimeStampSecond;
            } else {
                str2 = "getStoredData, fail, not exist!";
            }
            Log.m2020d(TAG, str2);
            return wXSecurityData;
        } catch (Exception e) {
            C10878.m25049(e, new StringBuilder("getStoredData fail, ex = "), TAG);
            return wXSecurityData;
        }
    }

    private boolean checkUrlParametersLegal(String str, PromiseShareRule promiseShareRule) {
        Uri uri = Uri.parse(str);
        String host = uri.getHost();
        if (C0626d.m2033b(host)) {
            Log.m2022i(TAG, "checkUrlParameters, host empty!");
            return false;
        }
        for (int i = 0; i < promiseShareRule.urlRuleList.size(); i++) {
            UrlRule urlRule = (UrlRule) promiseShareRule.urlRuleList.get(i);
            if (host.equals(urlRule.host)) {
                int i2 = 0;
                for (int i3 = 0; i3 < urlRule.mustQueryKey.size(); i3++) {
                    try {
                        String str2 = (String) urlRule.mustQueryKey.get(i3);
                        Log.m2020d(TAG, "checkRuleCanPass, key = ".concat(String.valueOf(str2)));
                        if (!C0626d.m2033b(uri.getQueryParameter(str2))) {
                            i2++;
                        }
                    } catch (Exception e) {
                        C10878.m25049(e, new StringBuilder("checkRuleCanPass, parse fail, e = %s"), TAG);
                    }
                }
                boolean z = i2 == urlRule.mustQueryKey.size();
                Log.m2020d(TAG, "checkRuleCanPass, rule.host = " + urlRule.host + ", queryOk = " + z);
                return z;
            }
        }
        return false;
    }

    private void storeCheckResp(String str, PromiseShareRule promiseShareRule) {
        String strCookStoreJson = cookStoreJson(str, promiseShareRule);
        Log.m2020d(TAG, "cookStoreJson = ".concat(String.valueOf(strCookStoreJson)));
        if (C0626d.m2033b(strCookStoreJson)) {
            Log.m2024w(TAG, "cookStoreJson get null!");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(SECURITY_KEY_TIMESTAMP_SECOND, System.currentTimeMillis() / 1000);
            jSONObject.put(STORE_VALUE_DATA, strCookStoreJson);
            commitSp(str, jSONObject.toString());
        } catch (Exception e) {
            C10878.m25049(e, new StringBuilder("storeCheckResp fail, ex = "), TAG);
        }
    }

    public PromiseShareRule convert2ShareRule(String str, String str2) {
        PromiseShareRule promiseShareRule = new PromiseShareRule();
        promiseShareRule.reqAppid = str;
        promiseShareRule.orgJsonData = str2;
        if (C0626d.m2033b(str2)) {
            Log.m2020d(TAG, "convert2ShareRule: jsonRespData is empty");
            return promiseShareRule;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            promiseShareRule.state = jSONObject.optInt("state", 0);
            promiseShareRule.appidInRule = jSONObject.optString("appid_rule", "");
            promiseShareRule.userWaitTimeMs = jSONObject.optLong("wait_time", 0L);
            promiseShareRule.nextRequestIntervalSecond = jSONObject.optLong(C0655am.f2293aU, 0L);
            promiseShareRule.buffer = jSONObject.optString("buffer", "");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rules");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    UrlRule urlRule = new UrlRule();
                    urlRule.host = jSONObject2.optString(C0172c.f710f);
                    JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("querys");
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                            if (!C0626d.m2033b(jSONArrayOptJSONArray2.optString(i2, ""))) {
                                urlRule.mustQueryKey.add(jSONArrayOptJSONArray2.optString(i2, ""));
                            }
                        }
                    }
                    promiseShareRule.urlRuleList.add(urlRule);
                }
            }
            return promiseShareRule;
        } catch (Exception e) {
            C10878.m25049(e, new StringBuilder("coverJson2ShareRule fail, ex = "), TAG);
            return promiseShareRule;
        }
    }

    public String cookStoreJson(String str, PromiseShareRule promiseShareRule) {
        if (promiseShareRule != null && !C0626d.m2033b(str)) {
            try {
                int i = promiseShareRule.state;
                if (i != 2) {
                    return i == 1 ? covertShareRule2Json(promiseShareRule) : "";
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("state", promiseShareRule.state);
                jSONObject.put(C0655am.f2293aU, promiseShareRule.getLegalReqInterval());
                jSONObject.put("buffer", promiseShareRule.buffer.length() > 64 ? "" : promiseShareRule.buffer);
                return jSONObject.toString();
            } catch (Exception e) {
                C10878.m25049(e, new StringBuilder("storeCheckResp fail, ex = "), TAG);
            }
        }
        return "";
    }

    public String covertShareRule2Json(PromiseShareRule promiseShareRule) {
        if (promiseShareRule == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("state", promiseShareRule.state);
            jSONObject.put("appid_rule", promiseShareRule.appidInRule);
            jSONObject.put("wait_time", promiseShareRule.userWaitTimeMs);
            jSONObject.put(C0655am.f2293aU, promiseShareRule.nextRequestIntervalSecond);
            jSONObject.put("buffer", promiseShareRule.buffer.length() > 64 ? "" : promiseShareRule.buffer);
            JSONArray jSONArray = new JSONArray();
            for (UrlRule urlRule : promiseShareRule.urlRuleList) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(C0172c.f710f, urlRule.host);
                jSONObject2.put("querys", new JSONArray((Collection) urlRule.mustQueryKey));
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("rules", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            C10878.m25049(e, new StringBuilder("covertShareRule2Json fail, ex = "), TAG);
            return "";
        }
    }

    public StringBuffer postHttpRequest(String str, String str2, String str3) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            String strEncode = C14523.encode(str, C0233a.f1077D);
            String strEncode2 = C14523.encode(str3, C0233a.f1077D);
            String str4 = "https://mp.weixin.qq.com/publicpoc/opensdkconf?action=GetShareConf&appid=" + strEncode + "&sdkVersion=" + str2 + "&buffer=" + strEncode2;
            Log.m2020d(TAG, "request http, url = " + str4 + ", appid = " + strEncode + ", version = " + str2 + ", buffer = " + strEncode2);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str4).openConnection();
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(60000);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            Log.m2022i(TAG, "http respCode = ".concat(String.valueOf(responseCode)));
            if (responseCode == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    stringBuffer.append(line);
                }
                Log.m2020d(TAG, "http response = ".concat(String.valueOf(stringBuffer)));
                bufferedReader.close();
            }
            httpURLConnection.disconnect();
            return stringBuffer;
        } catch (Exception e) {
            C10878.m25049(e, new StringBuilder("http request fail, ex = "), TAG);
            return stringBuffer;
        }
    }
}
