package com.tencent.connect.common;

import android.R;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.alipay.sdk.app.AlipayApi;
import com.alipay.sdk.m.u0.c;
import com.alipay.sdk.m.y.o;
import l.C11073;
import l.C14599;
import l.C18317;
import l.C18338;
import l.C1900;
import l.C19750;
import l.C20361;
import l.C20434;
import l.C6839;
import l.C7544;
import l.C8956;
import l.C9145;
import l.HandlerC16716;
import l.InterfaceC4227;
import l.RunnableC17422;
import l.ViewOnTouchListenerC18128;
import org.json.JSONObject;

/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public class AssistActivity extends Activity {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f887;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f890;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C14599 f891;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f892 = "openSDK_LOG.AssistActivity_" + hashCode();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f888 = false;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f893 = false;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C1900 f889 = new C1900();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Handler f894 = new HandlerC16716(this, Looper.getMainLooper());

    /* JADX WARN: Code duplicated, block: B:66:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:88:0x0222  */
    /* JADX WARN: Code duplicated, block: B:90:0x022c  */
    /* JADX WARN: Code duplicated, block: B:92:0x025f  */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        String str;
        String str2;
        String str3;
        String str4;
        InterfaceC4227 interfaceC4227M23093;
        getWindow().addFlags(67108864);
        boolean z = true;
        requestWindowFeature(1);
        C20434.m46833(this);
        super.onCreate(bundle);
        String str5 = null;
        this.f889.m6251(0);
        boolean zM27470 = C11073.m27470(this);
        String str6 = this.f892;
        if (zM27470) {
            C9145.m23516(str6, "--onCreate-- callPack: " + getCallingPackage());
            finish();
            return;
        }
        this.f890 = getIntent().getBooleanExtra(C6839.f21175, false);
        C9145.m23518(str6, "--onCreate-- mRestoreLandscape=" + this.f890);
        if (getIntent() == null) {
            C9145.m23516(str6, "-->onCreate--getIntent() returns null");
            finish();
        }
        Intent intent = (Intent) getIntent().getParcelableExtra("openSDK_LOG.AssistActivity.ExtraIntent");
        int intExtra = intent == null ? 0 : intent.getIntExtra("key_request_code", 0);
        str5 = "";
        this.f887 = intent == null ? "" : intent.getStringExtra(c.d);
        Bundle bundleExtra = getIntent().getBundleExtra("h5_share_data");
        if (bundle != null) {
            this.f888 = bundle.getBoolean("RESTART_FLAG");
            this.f893 = bundle.getBoolean("RESUME_FLAG", false);
        }
        if (this.f888) {
            C9145.m23513(str6, "is restart");
        } else if (bundleExtra == null) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("key_extra_pending_intent");
            if (intent != null && pendingIntent != null) {
                C9145.m23518(str6, "--onCreate--activityIntent not null, will start activity, reqcode = " + intExtra);
                try {
                    Uri data = intent.getData();
                    if (data != null) {
                        IntentFilter intentFilter = new IntentFilter("com.tencent.tauth.opensdk.SHARE_SUCCESS_AND_STAY_QQ_" + data.getQueryParameter("share_id"));
                        if (this.f891 == null) {
                            this.f891 = new C14599(this);
                        }
                        if (Build.VERSION.SDK_INT >= 33) {
                            registerReceiver(this.f891, intentFilter, 2);
                        } else {
                            registerReceiver(this.f891, intentFilter);
                        }
                    }
                } catch (Exception e) {
                    C9145.m23514(str6, "registerReceiver exception: ", e);
                }
                try {
                    try {
                        try {
                            IntentSender intentSender = pendingIntent.getIntentSender();
                            try {
                                if (intent.getBooleanExtra("for_result", true)) {
                                    startIntentSenderForResult(intentSender, intExtra, null, 0, 0, 0);
                                } else {
                                    startIntentSender(intentSender, null, 0, 0, 0);
                                }
                                m919(intent, true);
                            } catch (ActivityNotFoundException e2) {
                                e = e2;
                                C9145.m23516(str6, "--onCreate--startActivity exception, ActivityNotFoundException : " + e);
                                InterfaceC4227 interfaceC4227M23092 = C8956.m23090().m23092(intExtra);
                                if (interfaceC4227M23092 != null) {
                                    interfaceC4227M23092.mo3454(new C19750(-20, "手Q版本过低，请下载安装最新版手Q", str5));
                                }
                                m919(intent, false);
                            }
                        } catch (Exception e3) {
                            try {
                                C9145.m23516(str6, "--onCreate--startActivity exception: " + e3.getMessage());
                                C9145.m23516(str6, "--onCreate--startActException");
                                finish();
                            } catch (Throwable th) {
                                th = th;
                                if (z) {
                                    C9145.m23516(str6, "--onCreate--startActException");
                                    finish();
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z = false;
                        if (z) {
                            C9145.m23516(str6, "--onCreate--startActException");
                            finish();
                        }
                        throw th;
                    }
                } catch (ActivityNotFoundException e4) {
                    e = e4;
                    str5 = "";
                    intExtra = intExtra;
                }
            } else {
                StringBuilder sb = new StringBuilder("--onCreate--activityIntent or pendingIntent is null. activityIntent is null? ");
                sb.append(intent == null);
                sb.append(", pendingIntent is null? ");
                sb.append(pendingIntent == null);
                C9145.m23516(str6, sb.toString());
                finish();
            }
        } else {
            C9145.m23519(str6, "--onCreate--h5 bundle not null, will open browser");
            String string = bundleExtra.getString("viaShareType");
            String string2 = bundleExtra.getString("callbackAction");
            String string3 = bundleExtra.getString("url");
            String string4 = bundleExtra.getString("openId");
            String string5 = bundleExtra.getString(AlipayApi.c);
            if ("shareToQQ".equals(string2)) {
                str3 = "ANDROIDQQ.SHARETOQQ.XX";
                str4 = "10";
            } else {
                if ("shareToQzone".equals(string2)) {
                    str3 = "ANDROIDQQ.SHARETOQZ.XX";
                    str4 = "11";
                } else {
                    str = "";
                    str2 = str;
                }
                if (!C18338.m42740(this, string3)) {
                    interfaceC4227M23093 = C8956.m23090().m23093(string2);
                    if (interfaceC4227M23093 != null) {
                        interfaceC4227M23093.mo3454(new C19750(-6, "打开浏览器失败!", null));
                    }
                    C7544.m20258().getClass();
                    C18317.m42686().m42688(C18338.m42735(string4, str, "3", str2, string5, "1", string, "", "", "0", "2", "0"), string5, false);
                    finish();
                } else {
                    C7544.m20258().getClass();
                    C18317.m42686().m42688(C18338.m42735(string4, str, "3", str2, string5, "0", string, "", "", "0", "2", "0"), string5, false);
                }
                getIntent().removeExtra("shareH5");
            }
            str2 = str3;
            str = str4;
            if (!C18338.m42740(this, string3)) {
                interfaceC4227M23093 = C8956.m23090().m23093(string2);
                if (interfaceC4227M23093 != null) {
                    interfaceC4227M23093.mo3454(new C19750(-6, "打开浏览器失败!", null));
                }
                C7544.m20258().getClass();
                C18317.m42686().m42688(C18338.m42735(string4, str, "3", str2, string5, "1", string, "", "", "0", "2", "0"), string5, false);
                finish();
            } else {
                C7544.m20258().getClass();
                C18317.m42686().m42688(C18338.m42735(string4, str, "3", str2, string5, "0", string, "", "", "0", "2", "0"), string5, false);
            }
            getIntent().removeExtra("shareH5");
        }
        View viewFindViewById = findViewById(R.id.content);
        if (viewFindViewById == null) {
            return;
        }
        viewFindViewById.setOnTouchListener(new ViewOnTouchListenerC18128(this));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m919(Intent intent, boolean z) {
        Bundle bundleExtra = intent.getBundleExtra(C6839.f21173);
        if (bundleExtra != null) {
            bundleExtra.putString(o.c, z ? "0" : "1");
            C18317.m42686().m42688(bundleExtra, this.f887, intent.getBooleanExtra(C6839.f21174, false));
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        C9145.m23518(this.f892, "-->onStart");
        super.onStart();
        this.f889.m6251(1);
    }

    @Override // android.app.Activity
    public final void onResume() {
        C9145.m23518(this.f892, "-->onResume");
        super.onResume();
        C1900 c1900 = this.f889;
        c1900.m6251(2);
        Intent intent = getIntent();
        if (intent.getBooleanExtra("is_login", false)) {
            return;
        }
        if (!intent.getBooleanExtra("is_qq_mobile_share", false) && this.f888 && !isFinishing()) {
            finish();
        }
        if (this.f893 && c1900.m6252()) {
            Handler handler = this.f894;
            handler.sendMessage(handler.obtainMessage(0));
        } else {
            this.f893 = true;
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        C9145.m23518(this.f892, "-->onPause");
        this.f894.removeMessages(0);
        super.onPause();
        this.f889.m6251(3);
    }

    @Override // android.app.Activity
    public final void onStop() {
        String str = this.f892;
        C9145.m23518(str, "-->onStop");
        super.onStop();
        this.f889.m6251(4);
        try {
            int intExtra = getIntent().getIntExtra("key_request_orientation", -1);
            C9145.m23518(str, "getRequestedOrientation= " + intExtra);
            if (intExtra != -1) {
                setRequestedOrientation(intExtra);
            }
        } catch (Throwable th) {
            C9145.m23514(str, "reset requestedOrientation catch exception", th);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        C9145.m23518(this.f892, "-->onDestroy");
        super.onDestroy();
        this.f889.m6251(5);
        C14599 c14599 = this.f891;
        if (c14599 != null) {
            unregisterReceiver(c14599);
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        String str = "--onNewIntent: " + hashCode();
        String str2 = this.f892;
        C9145.m23518(str2, str);
        super.onNewIntent(intent);
        this.f889.m6251(6);
        if (intent != null) {
            intent.setFlags(intent.getFlags() & (-196));
        }
        int intExtra = intent.getIntExtra("key_request_code", -1);
        C9145.m23518(str2, "--onNewIntent callbackRequestCode= " + intExtra);
        if (intExtra == 10108) {
            intent.putExtra("key_action", "action_request_avatar");
            if (intent.getBooleanExtra("stay_back_stack", false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10109) {
            intent.putExtra("key_action", "action_request_set_emotion");
            if (intent.getBooleanExtra("stay_back_stack", false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10110) {
            intent.putExtra("key_action", "action_request_dynamic_avatar");
            if (intent.getBooleanExtra("stay_back_stack", false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10111) {
            intent.putExtra("key_action", "joinGroup");
            if (intent.getBooleanExtra("stay_back_stack", false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10112) {
            intent.putExtra("key_action", "bindGroup");
            if (intent.getBooleanExtra("stay_back_stack", false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10113) {
            intent.putExtra("key_action", intent.getStringExtra("action"));
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            C9145.m23518(str2, "--onNewIntent--activity not finished, finish now");
            finish();
            return;
        }
        if (intExtra == 10114) {
            intent.putExtra("key_action", intent.getStringExtra("action"));
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            C9145.m23518(str2, "--onNewIntent--activity not finished, finish now");
            finish();
            return;
        }
        intent.putExtra("key_action", "action_share");
        setResult(-1, intent);
        if (isFinishing()) {
            return;
        }
        C9145.m23518(str2, "--onNewIntent--activity not finished, finish now");
        finish();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C9145.m23518(this.f892, "--onSaveInstanceState--");
        bundle.putBoolean("RESTART_FLAG", true);
        bundle.putBoolean("RESUME_FLAG", this.f893);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        StringBuilder sbM46682 = C20361.m46682("--onActivityResult--requestCode: ", i, " | resultCode: ", "data = null ? ", i2);
        sbM46682.append(intent == null);
        String string = sbM46682.toString();
        String str = this.f892;
        C9145.m23518(str, string);
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            return;
        }
        if (C11073.m27470(this)) {
            C9145.m23516(str, "onActivityResult callPack: " + getCallingPackage());
            finish();
            return;
        }
        if (intent != null) {
            intent.putExtra("key_action", "action_login");
        }
        Bundle extras = intent == null ? null : intent.getExtras();
        if (extras == null) {
            C9145.m23519(str, "--setResultData--bundle is null, setResult ACTIVITY_CANCEL");
            setResult(0);
            if (i == 11101) {
                C7544 c7544M20258 = C7544.m20258();
                String str2 = this.f887;
                c7544M20258.getClass();
                C7544.m20259("", str2, "2");
            }
        } else {
            try {
                String string2 = extras.getString("key_response");
                C9145.m23513(str, "--setResultDataForLogin-- ");
                Intent intent2 = new Intent();
                intent2.putExtras(extras);
                if (TextUtils.isEmpty(string2)) {
                    C9145.m23519(str, "--setResultData--response is empty, setResult ACTIVITY_OK");
                    setResult(-1, intent2);
                } else {
                    JSONObject jSONObject = new JSONObject(string2);
                    String strOptString = jSONObject.optString("openid");
                    String strOptString2 = jSONObject.optString("access_token");
                    String strOptString3 = jSONObject.optString("proxy_code");
                    long jOptLong = jSONObject.optLong("proxy_expires_in");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        C9145.m23518(str, "--setResultData--openid and token not empty, setResult ACTIVITY_OK");
                        setResult(-1, intent2);
                        C7544 c7544M20259 = C7544.m20258();
                        String str3 = this.f887;
                        c7544M20259.getClass();
                        C7544.m20259(strOptString, str3, "0");
                    } else if (TextUtils.isEmpty(strOptString3) || jOptLong == 0) {
                        C9145.m23519(str, "--setResultData--openid or token is empty, setResult ACTIVITY_CANCEL");
                        setResult(0, intent2);
                        C7544 c7544M202510 = C7544.m20258();
                        String str4 = this.f887;
                        c7544M202510.getClass();
                        C7544.m20259("", str4, "1");
                    } else {
                        C9145.m23518(str, "--setResultData--proxy_code and proxy_expires_in are valid");
                        setResult(-1, intent2);
                    }
                }
            } catch (Exception e) {
                C9145.m23516(str, "--setResultData--parse response failed");
                C9145.m23514(str, "--setResultData--parse response exception", e);
            }
        }
        if (this.f890) {
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC17422(this), 200L);
        } else {
            C9145.m23518(str, "onActivityResult finish immediate");
            finish();
        }
    }

    @Override // android.app.Activity
    public final void setRequestedOrientation(int i) {
        if (C20434.m46834(this)) {
            return;
        }
        super.setRequestedOrientation(i);
    }
}
