package com.tencent.mm.opensdk.diffdev.a;

import android.os.AsyncTask;
import android.util.Base64;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.utils.Log;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AsyncTask {
    public static String h = "https://open.weixin.qq.com/connect/sdk/qrconnect?appid=%s&noncestr=%s&timestamp=%s&scope=%s&signature=%s";
    public String appId;
    public String i;
    public String j;
    public OAuthListener k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f77921l;
    public String scope;
    public String signature;

    public final class a {
        public OAuthErrCode m;
        public String n;
        public String o;
        public String p;
        public int q;
        public String r;
        public byte[] s;

        public static a a(byte[] bArr) {
            OAuthErrCode oAuthErrCode;
            String message;
            StringBuilder sb;
            String str;
            a aVar = new a();
            if (bArr == null || bArr.length == 0) {
                Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, buf is null");
                oAuthErrCode = OAuthErrCode.WechatAuth_Err_NetworkErr;
            } else {
                try {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(bArr, "utf-8"));
                        int i = jSONObject.getInt("errcode");
                        if (i != 0) {
                            Log.e("MicroMsg.SDK.GetQRCodeResult", String.format("resp errcode = %d", Integer.valueOf(i)));
                            aVar.m = OAuthErrCode.WechatAuth_Err_NormalErr;
                            aVar.q = i;
                            aVar.r = jSONObject.optString("errmsg");
                            return aVar;
                        }
                        String string = jSONObject.getJSONObject("qrcode").getString("qrcodebase64");
                        if (string == null || string.length() == 0) {
                            str = "parse fail, qrcodeBase64 is null";
                        } else {
                            byte[] bArrDecode = Base64.decode(string, 0);
                            if (bArrDecode != null && bArrDecode.length != 0) {
                                aVar.m = OAuthErrCode.WechatAuth_Err_OK;
                                aVar.s = bArrDecode;
                                aVar.n = jSONObject.getString("uuid");
                                String string2 = jSONObject.getString("appname");
                                aVar.o = string2;
                                Log.d("MicroMsg.SDK.GetQRCodeResult", String.format("parse succ, save in memory, uuid = %s, appname = %s, imgBufLength = %d", aVar.n, string2, Integer.valueOf(aVar.s.length)));
                                return aVar;
                            }
                            str = "parse fail, qrcodeBuf is null";
                        }
                        Log.e("MicroMsg.SDK.GetQRCodeResult", str);
                        aVar.m = OAuthErrCode.WechatAuth_Err_JsonDecodeErr;
                        return aVar;
                    } catch (Exception e) {
                        message = e.getMessage();
                        sb = new StringBuilder("parse json fail, ex = ");
                        sb.append(message);
                        Log.e("MicroMsg.SDK.GetQRCodeResult", sb.toString());
                        oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                        aVar.m = oAuthErrCode;
                        return aVar;
                    }
                } catch (Exception e2) {
                    message = e2.getMessage();
                    sb = new StringBuilder("parse fail, build String fail, ex = ");
                }
            }
            aVar.m = oAuthErrCode;
            return aVar;
        }
    }

    public d(String str, String str2, String str3, String str4, String str5, OAuthListener oAuthListener) {
        this.appId = str;
        this.scope = str2;
        this.i = str3;
        this.j = str4;
        this.signature = str5;
        this.k = oAuthListener;
    }

    public final boolean a() {
        Log.i("MicroMsg.SDK.GetQRCodeTask", "cancelTask");
        f fVar = this.f77921l;
        return fVar == null ? cancel(true) : fVar.cancel(true);
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) throws Throwable {
        Thread.currentThread().setName("OpenSdkGetQRCodeTask");
        Log.i("MicroMsg.SDK.GetQRCodeTask", "doInBackground");
        String str = String.format(h, this.appId, this.i, this.j, this.scope, this.signature);
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] bArrA = e.a(str);
        Log.d("MicroMsg.SDK.GetQRCodeTask", String.format("doInBackground, url = %s, time consumed = %d(ms)", str, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
        return a.a(bArrA);
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        a aVar = (a) obj;
        OAuthErrCode oAuthErrCode = aVar.m;
        if (oAuthErrCode != OAuthErrCode.WechatAuth_Err_OK) {
            Log.e("MicroMsg.SDK.GetQRCodeTask", "onPostExecute, get qrcode fail, OAuthErrCode = " + oAuthErrCode);
            this.k.onAuthFinish(aVar.m, null);
            return;
        }
        Log.d("MicroMsg.SDK.GetQRCodeTask", "onPostExecute, get qrcode success imgBufSize = " + aVar.s.length);
        this.k.onAuthGotQrcode(aVar.p, aVar.s);
        f fVar = new f(aVar.n, this.k);
        this.f77921l = fVar;
        fVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
