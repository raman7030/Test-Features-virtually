package com.tencent.p062mm.opensdk.diffdev.p064a;

import android.os.AsyncTask;
import android.util.Base64;
import com.tencent.p062mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.p062mm.opensdk.diffdev.OAuthListener;
import com.tencent.p062mm.opensdk.utils.Log;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.d */
/* JADX INFO: loaded from: classes.dex */
public final class AsyncTaskC0610d extends AsyncTask {

    /* JADX INFO: renamed from: h */
    public static String f2099h = "https://open.weixin.qq.com/connect/sdk/qrconnect?appid=%s&noncestr=%s&timestamp=%s&scope=%s&signature=%s";
    public String appId;

    /* JADX INFO: renamed from: i */
    public String f2100i;

    /* JADX INFO: renamed from: j */
    public String f2101j;

    /* JADX INFO: renamed from: k */
    public OAuthListener f2102k;

    /* JADX INFO: renamed from: l */
    public AsyncTaskC0612f f2103l;
    public String scope;
    public String signature;

    /* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.d$a */
    public final class a {

        /* JADX INFO: renamed from: m */
        public OAuthErrCode f2104m;

        /* JADX INFO: renamed from: n */
        public String f2105n;

        /* JADX INFO: renamed from: o */
        public String f2106o;

        /* JADX INFO: renamed from: p */
        public String f2107p;

        /* JADX INFO: renamed from: q */
        public int f2108q;

        /* JADX INFO: renamed from: r */
        public String f2109r;

        /* JADX INFO: renamed from: s */
        public byte[] f2110s;

        /* JADX INFO: renamed from: a */
        public static a m2012a(byte[] bArr) {
            OAuthErrCode oAuthErrCode;
            String message;
            StringBuilder sb;
            String str;
            a aVar = new a();
            if (bArr == null || bArr.length == 0) {
                Log.m2021e("MicroMsg.SDK.GetQRCodeResult", "parse fail, buf is null");
                oAuthErrCode = OAuthErrCode.WechatAuth_Err_NetworkErr;
            } else {
                try {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(bArr, "utf-8"));
                        int i = jSONObject.getInt("errcode");
                        if (i != 0) {
                            Log.m2021e("MicroMsg.SDK.GetQRCodeResult", String.format("resp errcode = %d", Integer.valueOf(i)));
                            aVar.f2104m = OAuthErrCode.WechatAuth_Err_NormalErr;
                            aVar.f2108q = i;
                            aVar.f2109r = jSONObject.optString("errmsg");
                            return aVar;
                        }
                        String string = jSONObject.getJSONObject("qrcode").getString("qrcodebase64");
                        if (string == null || string.length() == 0) {
                            str = "parse fail, qrcodeBase64 is null";
                        } else {
                            byte[] bArrDecode = Base64.decode(string, 0);
                            if (bArrDecode != null && bArrDecode.length != 0) {
                                aVar.f2104m = OAuthErrCode.WechatAuth_Err_OK;
                                aVar.f2110s = bArrDecode;
                                aVar.f2105n = jSONObject.getString("uuid");
                                String string2 = jSONObject.getString("appname");
                                aVar.f2106o = string2;
                                Log.m2020d("MicroMsg.SDK.GetQRCodeResult", String.format("parse succ, save in memory, uuid = %s, appname = %s, imgBufLength = %d", aVar.f2105n, string2, Integer.valueOf(aVar.f2110s.length)));
                                return aVar;
                            }
                            str = "parse fail, qrcodeBuf is null";
                        }
                        Log.m2021e("MicroMsg.SDK.GetQRCodeResult", str);
                        aVar.f2104m = OAuthErrCode.WechatAuth_Err_JsonDecodeErr;
                        return aVar;
                    } catch (Exception e) {
                        message = e.getMessage();
                        sb = new StringBuilder("parse json fail, ex = ");
                        sb.append(message);
                        Log.m2021e("MicroMsg.SDK.GetQRCodeResult", sb.toString());
                        oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                        aVar.f2104m = oAuthErrCode;
                        return aVar;
                    }
                } catch (Exception e2) {
                    message = e2.getMessage();
                    sb = new StringBuilder("parse fail, build String fail, ex = ");
                }
            }
            aVar.f2104m = oAuthErrCode;
            return aVar;
        }
    }

    public AsyncTaskC0610d(String str, String str2, String str3, String str4, String str5, OAuthListener oAuthListener) {
        this.appId = str;
        this.scope = str2;
        this.f2100i = str3;
        this.f2101j = str4;
        this.signature = str5;
        this.f2102k = oAuthListener;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2011a() {
        Log.m2022i("MicroMsg.SDK.GetQRCodeTask", "cancelTask");
        AsyncTaskC0612f asyncTaskC0612f = this.f2103l;
        return asyncTaskC0612f == null ? cancel(true) : asyncTaskC0612f.cancel(true);
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) throws Throwable {
        Thread.currentThread().setName("OpenSdkGetQRCodeTask");
        Log.m2022i("MicroMsg.SDK.GetQRCodeTask", "doInBackground");
        String str = String.format(f2099h, this.appId, this.f2100i, this.f2101j, this.scope, this.signature);
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] bArrM2013a = C0611e.m2013a(str);
        Log.m2020d("MicroMsg.SDK.GetQRCodeTask", String.format("doInBackground, url = %s, time consumed = %d(ms)", str, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
        return a.m2012a(bArrM2013a);
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        a aVar = (a) obj;
        OAuthErrCode oAuthErrCode = aVar.f2104m;
        if (oAuthErrCode != OAuthErrCode.WechatAuth_Err_OK) {
            Log.m2021e("MicroMsg.SDK.GetQRCodeTask", "onPostExecute, get qrcode fail, OAuthErrCode = " + oAuthErrCode);
            this.f2102k.onAuthFinish(aVar.f2104m, null);
            return;
        }
        Log.m2020d("MicroMsg.SDK.GetQRCodeTask", "onPostExecute, get qrcode success imgBufSize = " + aVar.f2110s.length);
        this.f2102k.onAuthGotQrcode(aVar.f2107p, aVar.f2110s);
        AsyncTaskC0612f asyncTaskC0612f = new AsyncTaskC0612f(aVar.f2105n, this.f2102k);
        this.f2103l = asyncTaskC0612f;
        asyncTaskC0612f.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
