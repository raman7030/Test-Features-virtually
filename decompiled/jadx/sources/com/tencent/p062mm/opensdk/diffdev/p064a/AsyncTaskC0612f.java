package com.tencent.p062mm.opensdk.diffdev.p064a;

import android.os.AsyncTask;
import com.tencent.p062mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.p062mm.opensdk.diffdev.OAuthListener;
import com.tencent.p062mm.opensdk.utils.Log;
import org.json.JSONObject;
import p067l.C21466;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.f */
/* JADX INFO: loaded from: classes.dex */
public final class AsyncTaskC0612f extends AsyncTask {

    /* JADX INFO: renamed from: k */
    public OAuthListener f2111k;

    /* JADX INFO: renamed from: n */
    public String f2112n;

    /* JADX INFO: renamed from: t */
    public int f2113t;
    public String url;

    /* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.f$a */
    public final class a {

        /* JADX INFO: renamed from: m */
        public OAuthErrCode f2114m;

        /* JADX INFO: renamed from: u */
        public String f2115u;

        /* JADX INFO: renamed from: v */
        public int f2116v;

        /* JADX WARN: Code duplicated, block: B:19:0x005e A[Catch: Exception -> 0x0063, TryCatch #1 {Exception -> 0x0063, blocks: (B:8:0x001a, B:12:0x0044, B:14:0x0048, B:16:0x0055, B:20:0x0060, B:17:0x0058, B:18:0x005b, B:19:0x005e), top: B:32:0x001a }] */
        /* JADX INFO: renamed from: b */
        public static a m2014b(byte[] bArr) {
            OAuthErrCode oAuthErrCode;
            String message;
            StringBuilder sb;
            OAuthErrCode oAuthErrCode2;
            a aVar = new a();
            Log.m2020d("MicroMsg.SDK.NoopingResult", "star parse NoopingResult");
            if (bArr == null || bArr.length == 0) {
                Log.m2021e("MicroMsg.SDK.NoopingResult", "parse fail, buf is null");
                oAuthErrCode = OAuthErrCode.WechatAuth_Err_NetworkErr;
            } else {
                try {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(bArr, "utf-8"));
                        int i = jSONObject.getInt("wx_errcode");
                        aVar.f2116v = i;
                        Log.m2020d("MicroMsg.SDK.NoopingResult", String.format("nooping uuidStatusCode = %d", Integer.valueOf(i)));
                        int i2 = aVar.f2116v;
                        if (i2 == 408) {
                            oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_OK;
                        } else {
                            if (i2 != 500) {
                                switch (i2) {
                                    case 402:
                                        oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_Timeout;
                                        break;
                                    case 403:
                                        oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_Cancel;
                                        break;
                                    case 404:
                                        oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_OK;
                                        break;
                                    case 405:
                                        aVar.f2114m = OAuthErrCode.WechatAuth_Err_OK;
                                        aVar.f2115u = jSONObject.getString("wx_code");
                                        break;
                                    default:
                                        oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_NormalErr;
                                        break;
                                }
                                return aVar;
                            }
                            oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_NormalErr;
                        }
                        aVar.f2114m = oAuthErrCode2;
                        return aVar;
                    } catch (Exception e) {
                        message = e.getMessage();
                        sb = new StringBuilder("parse json fail, ex = ");
                        sb.append(message);
                        Log.m2021e("MicroMsg.SDK.NoopingResult", sb.toString());
                        oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                        aVar.f2114m = oAuthErrCode;
                        return aVar;
                    }
                } catch (Exception e2) {
                    message = e2.getMessage();
                    sb = new StringBuilder("parse fail, build String fail, ex = ");
                }
            }
            aVar.f2114m = oAuthErrCode;
            return aVar;
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) throws Throwable {
        a aVar;
        OAuthErrCode oAuthErrCode;
        String str;
        Thread.currentThread().setName("OpenSdkNoopingTask");
        String str2 = this.f2112n;
        if (str2 == null || str2.length() == 0) {
            Log.m2021e("MicroMsg.SDK.NoopingTask", "run fail, uuid is null");
            aVar = new a();
            oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
        } else {
            Log.m2022i("MicroMsg.SDK.NoopingTask", "doInBackground start " + isCancelled());
            while (!isCancelled()) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.url);
                if (this.f2113t == 0) {
                    str = "";
                } else {
                    str = "&last=" + this.f2113t;
                }
                sb.append(str);
                String string = sb.toString();
                long jCurrentTimeMillis = System.currentTimeMillis();
                byte[] bArrM2013a = C0611e.m2013a(string);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                a aVarM2014b = a.m2014b(bArrM2013a);
                Log.m2020d("MicroMsg.SDK.NoopingTask", String.format("nooping, url = %s, errCode = %s, uuidStatusCode = %d, time consumed = %d(ms)", string, aVarM2014b.f2114m.toString(), Integer.valueOf(aVarM2014b.f2116v), Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis)));
                OAuthErrCode oAuthErrCode2 = aVarM2014b.f2114m;
                if (oAuthErrCode2 != OAuthErrCode.WechatAuth_Err_OK) {
                    Log.m2021e("MicroMsg.SDK.NoopingTask", String.format("nooping fail, errCode = %s, uuidStatusCode = %d", oAuthErrCode2.toString(), Integer.valueOf(aVarM2014b.f2116v)));
                    return aVarM2014b;
                }
                int i = aVarM2014b.f2116v;
                this.f2113t = i;
                if (i == EnumC0613g.UUID_SCANED.getCode()) {
                    this.f2111k.onQrcodeScanned();
                } else if (aVarM2014b.f2116v != EnumC0613g.UUID_KEEP_CONNECT.getCode() && aVarM2014b.f2116v == EnumC0613g.UUID_CONFIRM.getCode()) {
                    String str3 = aVarM2014b.f2115u;
                    if (str3 != null && str3.length() != 0) {
                        return aVarM2014b;
                    }
                    Log.m2021e("MicroMsg.SDK.NoopingTask", "nooping fail, confirm with an empty code!!!");
                    aVarM2014b.f2114m = OAuthErrCode.WechatAuth_Err_NormalErr;
                    return aVarM2014b;
                }
            }
            Log.m2022i("MicroMsg.SDK.NoopingTask", "IDiffDevOAuth.stopAuth / detach invoked");
            aVar = new a();
            oAuthErrCode = OAuthErrCode.WechatAuth_Err_Auth_Stopped;
        }
        aVar.f2114m = oAuthErrCode;
        return aVar;
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        a aVar = (a) obj;
        this.f2111k.onAuthFinish(aVar.f2114m, aVar.f2115u);
    }

    public AsyncTaskC0612f(String str, OAuthListener oAuthListener) {
        this.f2112n = str;
        this.f2111k = oAuthListener;
        this.url = C21466.m48631("https://long.open.weixin.qq.com/connect/l/qrconnect?f=json&uuid=", str);
    }
}
