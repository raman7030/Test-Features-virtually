package com.tencent.mm.opensdk.diffdev.a;

import android.os.AsyncTask;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.utils.Log;
import l.C20094;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AsyncTask {
    public OAuthListener k;
    public String n;
    public int t;
    public String url;

    public final class a {
        public OAuthErrCode m;
        public String u;
        public int v;

        /* JADX WARN: Code duplicated, block: B:19:0x005e A[Catch: Exception -> 0x0063, TryCatch #1 {Exception -> 0x0063, blocks: (B:8:0x001a, B:12:0x0044, B:14:0x0048, B:16:0x0055, B:20:0x0060, B:17:0x0058, B:18:0x005b, B:19:0x005e), top: B:32:0x001a }] */
        public static a b(byte[] bArr) {
            OAuthErrCode oAuthErrCode;
            String message;
            StringBuilder sb;
            OAuthErrCode oAuthErrCode2;
            a aVar = new a();
            Log.d("MicroMsg.SDK.NoopingResult", "star parse NoopingResult");
            if (bArr == null || bArr.length == 0) {
                Log.e("MicroMsg.SDK.NoopingResult", "parse fail, buf is null");
                oAuthErrCode = OAuthErrCode.WechatAuth_Err_NetworkErr;
            } else {
                try {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(bArr, "utf-8"));
                        int i = jSONObject.getInt("wx_errcode");
                        aVar.v = i;
                        Log.d("MicroMsg.SDK.NoopingResult", String.format("nooping uuidStatusCode = %d", Integer.valueOf(i)));
                        int i2 = aVar.v;
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
                                        aVar.m = OAuthErrCode.WechatAuth_Err_OK;
                                        aVar.u = jSONObject.getString("wx_code");
                                        break;
                                    default:
                                        oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_NormalErr;
                                        break;
                                }
                                return aVar;
                            }
                            oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_NormalErr;
                        }
                        aVar.m = oAuthErrCode2;
                        return aVar;
                    } catch (Exception e) {
                        message = e.getMessage();
                        sb = new StringBuilder("parse json fail, ex = ");
                        sb.append(message);
                        Log.e("MicroMsg.SDK.NoopingResult", sb.toString());
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

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) throws Throwable {
        a aVar;
        OAuthErrCode oAuthErrCode;
        String str;
        Thread.currentThread().setName("OpenSdkNoopingTask");
        String str2 = this.n;
        if (str2 == null || str2.length() == 0) {
            Log.e("MicroMsg.SDK.NoopingTask", "run fail, uuid is null");
            aVar = new a();
            oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
        } else {
            Log.i("MicroMsg.SDK.NoopingTask", "doInBackground start " + isCancelled());
            while (!isCancelled()) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.url);
                if (this.t == 0) {
                    str = "";
                } else {
                    str = "&last=" + this.t;
                }
                sb.append(str);
                String string = sb.toString();
                long jCurrentTimeMillis = System.currentTimeMillis();
                byte[] bArrA = e.a(string);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                a aVarB = a.b(bArrA);
                Log.d("MicroMsg.SDK.NoopingTask", String.format("nooping, url = %s, errCode = %s, uuidStatusCode = %d, time consumed = %d(ms)", string, aVarB.m.toString(), Integer.valueOf(aVarB.v), Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis)));
                OAuthErrCode oAuthErrCode2 = aVarB.m;
                if (oAuthErrCode2 != OAuthErrCode.WechatAuth_Err_OK) {
                    Log.e("MicroMsg.SDK.NoopingTask", String.format("nooping fail, errCode = %s, uuidStatusCode = %d", oAuthErrCode2.toString(), Integer.valueOf(aVarB.v)));
                    return aVarB;
                }
                int i = aVarB.v;
                this.t = i;
                if (i == g.UUID_SCANED.getCode()) {
                    this.k.onQrcodeScanned();
                } else if (aVarB.v != g.UUID_KEEP_CONNECT.getCode() && aVarB.v == g.UUID_CONFIRM.getCode()) {
                    String str3 = aVarB.u;
                    if (str3 != null && str3.length() != 0) {
                        return aVarB;
                    }
                    Log.e("MicroMsg.SDK.NoopingTask", "nooping fail, confirm with an empty code!!!");
                    aVarB.m = OAuthErrCode.WechatAuth_Err_NormalErr;
                    return aVarB;
                }
            }
            Log.i("MicroMsg.SDK.NoopingTask", "IDiffDevOAuth.stopAuth / detach invoked");
            aVar = new a();
            oAuthErrCode = OAuthErrCode.WechatAuth_Err_Auth_Stopped;
        }
        aVar.m = oAuthErrCode;
        return aVar;
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        a aVar = (a) obj;
        this.k.onAuthFinish(aVar.m, aVar.u);
    }

    public f(String str, OAuthListener oAuthListener) {
        this.n = str;
        this.k = oAuthListener;
        this.url = C20094.m46315("https://long.open.weixin.qq.com/connect/l/qrconnect?f=json&uuid=", str);
    }
}
