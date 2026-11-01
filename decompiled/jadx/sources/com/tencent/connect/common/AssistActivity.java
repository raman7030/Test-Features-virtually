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
import com.alipay.sdk.p010m.p052u0.C0227c;
import com.alipay.sdk.p010m.p058y.C0252o;
import org.json.JSONObject;
import p067l.C10880;
import p067l.C11060;
import p067l.C12892;
import p067l.C16243;
import p067l.C19777;
import p067l.C19797;
import p067l.C21139;
import p067l.C21720;
import p067l.C21789;
import p067l.C4174;
import p067l.C8868;
import p067l.C9538;
import p067l.HandlerC18255;
import p067l.InterfaceC6386;
import p067l.RunnableC18926;
import p067l.ViewOnTouchListenerC19597;

/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public class AssistActivity extends Activity {

    /* JADX INFO: renamed from: ۗ */
    public String f2084;

    /* JADX INFO: renamed from: ۫ */
    public boolean f2087;

    /* JADX INFO: renamed from: ۬ */
    public C16243 f2088;

    /* JADX INFO: renamed from: ᩶ */
    public final String f2089 = "openSDK_LOG.AssistActivity_" + hashCode();

    /* JADX INFO: renamed from: ۙ */
    public boolean f2085 = false;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f2090 = false;

    /* JADX INFO: renamed from: ۤ */
    public C4174 f2086 = new C4174();

    /* JADX INFO: renamed from: ᩹ */
    public Handler f2091 = new HandlerC18255(this, Looper.getMainLooper());

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
        InterfaceC6386 interfaceC6386M25067;
        getWindow().addFlags(67108864);
        boolean z = true;
        requestWindowFeature(1);
        C21789.m49156(this);
        super.onCreate(bundle);
        String str5 = null;
        this.f2086.m8453(0);
        boolean zM29532 = C12892.m29532(this);
        String str6 = this.f2089;
        if (zM29532) {
            C11060.m25467(str6, "--onCreate-- callPack: " + getCallingPackage());
            finish();
            return;
        }
        this.f2087 = getIntent().getBooleanExtra(C8868.f24054, false);
        C11060.m25469(str6, "--onCreate-- mRestoreLandscape=" + this.f2087);
        if (getIntent() == null) {
            C11060.m25467(str6, "-->onCreate--getIntent() returns null");
            finish();
        }
        Intent intent = (Intent) getIntent().getParcelableExtra("openSDK_LOG.AssistActivity.ExtraIntent");
        int intExtra = intent == null ? 0 : intent.getIntExtra("key_request_code", 0);
        str5 = "";
        this.f2084 = intent == null ? "" : intent.getStringExtra(C0227c.f1027d);
        Bundle bundleExtra = getIntent().getBundleExtra("h5_share_data");
        if (bundle != null) {
            this.f2085 = bundle.getBoolean("RESTART_FLAG");
            this.f2090 = bundle.getBoolean("RESUME_FLAG", false);
        }
        if (this.f2085) {
            C11060.m25464(str6, "is restart");
        } else if (bundleExtra == null) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("key_extra_pending_intent");
            if (intent != null && pendingIntent != null) {
                C11060.m25469(str6, "--onCreate--activityIntent not null, will start activity, reqcode = " + intExtra);
                try {
                    Uri data = intent.getData();
                    if (data != null) {
                        IntentFilter intentFilter = new IntentFilter("com.tencent.tauth.opensdk.SHARE_SUCCESS_AND_STAY_QQ_" + data.getQueryParameter("share_id"));
                        if (this.f2088 == null) {
                            this.f2088 = new C16243(this);
                        }
                        if (Build.VERSION.SDK_INT >= 33) {
                            registerReceiver(this.f2088, intentFilter, 2);
                        } else {
                            registerReceiver(this.f2088, intentFilter);
                        }
                    }
                } catch (Exception e) {
                    C11060.m25465(str6, "registerReceiver exception: ", e);
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
                                m2005(intent, true);
                            } catch (ActivityNotFoundException e2) {
                                e = e2;
                                C11060.m25467(str6, "--onCreate--startActivity exception, ActivityNotFoundException : " + e);
                                InterfaceC6386 interfaceC6386M25066 = C10880.m25064().m25066(intExtra);
                                if (interfaceC6386M25066 != null) {
                                    interfaceC6386M25066.mo5757(new C21139(-20, "手Q版本过低，请下载安装最新版手Q", str5));
                                }
                                m2005(intent, false);
                            }
                        } catch (Exception e3) {
                            try {
                                C11060.m25467(str6, "--onCreate--startActivity exception: " + e3.getMessage());
                                C11060.m25467(str6, "--onCreate--startActException");
                                finish();
                            } catch (Throwable th) {
                                th = th;
                                if (z) {
                                    C11060.m25467(str6, "--onCreate--startActException");
                                    finish();
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z = false;
                        if (z) {
                            C11060.m25467(str6, "--onCreate--startActException");
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
                C11060.m25467(str6, sb.toString());
                finish();
            }
        } else {
            C11060.m25470(str6, "--onCreate--h5 bundle not null, will open browser");
            String string = bundleExtra.getString("viaShareType");
            String string2 = bundleExtra.getString("callbackAction");
            String string3 = bundleExtra.getString("url");
            String string4 = bundleExtra.getString("openId");
            String string5 = bundleExtra.getString(AlipayApi.f219c);
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
                if (!C19797.m45002(this, string3)) {
                    interfaceC6386M25067 = C10880.m25064().m25067(string2);
                    if (interfaceC6386M25067 != null) {
                        interfaceC6386M25067.mo5757(new C21139(-6, "打开浏览器失败!", null));
                    }
                    C9538.m22234().getClass();
                    C19777.m44948().m44950(C19797.m44997(string4, str, "3", str2, string5, "1", string, "", "", "0", "2", "0"), string5, false);
                    finish();
                } else {
                    C9538.m22234().getClass();
                    C19777.m44948().m44950(C19797.m44997(string4, str, "3", str2, string5, "0", string, "", "", "0", "2", "0"), string5, false);
                }
                getIntent().removeExtra("shareH5");
            }
            str2 = str3;
            str = str4;
            if (!C19797.m45002(this, string3)) {
                interfaceC6386M25067 = C10880.m25064().m25067(string2);
                if (interfaceC6386M25067 != null) {
                    interfaceC6386M25067.mo5757(new C21139(-6, "打开浏览器失败!", null));
                }
                C9538.m22234().getClass();
                C19777.m44948().m44950(C19797.m44997(string4, str, "3", str2, string5, "1", string, "", "", "0", "2", "0"), string5, false);
                finish();
            } else {
                C9538.m22234().getClass();
                C19777.m44948().m44950(C19797.m44997(string4, str, "3", str2, string5, "0", string, "", "", "0", "2", "0"), string5, false);
            }
            getIntent().removeExtra("shareH5");
        }
        View viewFindViewById = findViewById(R.id.content);
        if (viewFindViewById == null) {
            return;
        }
        viewFindViewById.setOnTouchListener(new ViewOnTouchListenerC19597(this));
    }

    /* JADX INFO: renamed from: ֫ */
    private void m2005(Intent intent, boolean z) {
        Bundle bundleExtra = intent.getBundleExtra(C8868.f24052);
        if (bundleExtra != null) {
            bundleExtra.putString(C0252o.f1208c, z ? "0" : "1");
            C19777.m44948().m44950(bundleExtra, this.f2084, intent.getBooleanExtra(C8868.f24053, false));
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        C11060.m25469(this.f2089, "-->onStart");
        super.onStart();
        this.f2086.m8453(1);
    }

    @Override // android.app.Activity
    public final void onResume() {
        C11060.m25469(this.f2089, "-->onResume");
        super.onResume();
        C4174 c4174 = this.f2086;
        c4174.m8453(2);
        Intent intent = getIntent();
        if (intent.getBooleanExtra("is_login", false)) {
            return;
        }
        if (!intent.getBooleanExtra("is_qq_mobile_share", false) && this.f2085 && !isFinishing()) {
            finish();
        }
        if (this.f2090 && c4174.m8454()) {
            Handler handler = this.f2091;
            handler.sendMessage(handler.obtainMessage(0));
        } else {
            this.f2090 = true;
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        C11060.m25469(this.f2089, "-->onPause");
        this.f2091.removeMessages(0);
        super.onPause();
        this.f2086.m8453(3);
    }

    @Override // android.app.Activity
    public final void onStop() {
        String str = this.f2089;
        C11060.m25469(str, "-->onStop");
        super.onStop();
        this.f2086.m8453(4);
        try {
            int intExtra = getIntent().getIntExtra("key_request_orientation", -1);
            C11060.m25469(str, "getRequestedOrientation= " + intExtra);
            if (intExtra != -1) {
                setRequestedOrientation(intExtra);
            }
        } catch (Throwable th) {
            C11060.m25465(str, "reset requestedOrientation catch exception", th);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        C11060.m25469(this.f2089, "-->onDestroy");
        super.onDestroy();
        this.f2086.m8453(5);
        C16243 c16243 = this.f2088;
        if (c16243 != null) {
            unregisterReceiver(c16243);
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        String str = "--onNewIntent: " + hashCode();
        String str2 = this.f2089;
        C11060.m25469(str2, str);
        super.onNewIntent(intent);
        this.f2086.m8453(6);
        if (intent != null) {
            intent.setFlags(intent.getFlags() & (-196));
        }
        int intExtra = intent.getIntExtra("key_request_code", -1);
        C11060.m25469(str2, "--onNewIntent callbackRequestCode= " + intExtra);
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
            C11060.m25469(str2, "--onNewIntent--activity not finished, finish now");
            finish();
            return;
        }
        if (intExtra == 10114) {
            intent.putExtra("key_action", intent.getStringExtra("action"));
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            C11060.m25469(str2, "--onNewIntent--activity not finished, finish now");
            finish();
            return;
        }
        intent.putExtra("key_action", "action_share");
        setResult(-1, intent);
        if (isFinishing()) {
            return;
        }
        C11060.m25469(str2, "--onNewIntent--activity not finished, finish now");
        finish();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C11060.m25469(this.f2089, "--onSaveInstanceState--");
        bundle.putBoolean("RESTART_FLAG", true);
        bundle.putBoolean("RESUME_FLAG", this.f2090);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        StringBuilder sbM49005 = C21720.m49005("--onActivityResult--requestCode: ", i, " | resultCode: ", "data = null ? ", i2);
        sbM49005.append(intent == null);
        String string = sbM49005.toString();
        String str = this.f2089;
        C11060.m25469(str, string);
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            return;
        }
        if (C12892.m29532(this)) {
            C11060.m25467(str, "onActivityResult callPack: " + getCallingPackage());
            finish();
            return;
        }
        if (intent != null) {
            intent.putExtra("key_action", "action_login");
        }
        Bundle extras = intent == null ? null : intent.getExtras();
        if (extras == null) {
            C11060.m25470(str, "--setResultData--bundle is null, setResult ACTIVITY_CANCEL");
            setResult(0);
            if (i == 11101) {
                C9538 c9538M22234 = C9538.m22234();
                String str2 = this.f2084;
                c9538M22234.getClass();
                C9538.m22235("", str2, "2");
            }
        } else {
            try {
                String string2 = extras.getString("key_response");
                C11060.m25464(str, "--setResultDataForLogin-- ");
                Intent intent2 = new Intent();
                intent2.putExtras(extras);
                if (TextUtils.isEmpty(string2)) {
                    C11060.m25470(str, "--setResultData--response is empty, setResult ACTIVITY_OK");
                    setResult(-1, intent2);
                } else {
                    JSONObject jSONObject = new JSONObject(string2);
                    String strOptString = jSONObject.optString("openid");
                    String strOptString2 = jSONObject.optString("access_token");
                    String strOptString3 = jSONObject.optString("proxy_code");
                    long jOptLong = jSONObject.optLong("proxy_expires_in");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        C11060.m25469(str, "--setResultData--openid and token not empty, setResult ACTIVITY_OK");
                        setResult(-1, intent2);
                        C9538 c9538M22235 = C9538.m22234();
                        String str3 = this.f2084;
                        c9538M22235.getClass();
                        C9538.m22235(strOptString, str3, "0");
                    } else if (TextUtils.isEmpty(strOptString3) || jOptLong == 0) {
                        C11060.m25470(str, "--setResultData--openid or token is empty, setResult ACTIVITY_CANCEL");
                        setResult(0, intent2);
                        C9538 c9538M22236 = C9538.m22234();
                        String str4 = this.f2084;
                        c9538M22236.getClass();
                        C9538.m22235("", str4, "1");
                    } else {
                        C11060.m25469(str, "--setResultData--proxy_code and proxy_expires_in are valid");
                        setResult(-1, intent2);
                    }
                }
            } catch (Exception e) {
                C11060.m25467(str, "--setResultData--parse response failed");
                C11060.m25465(str, "--setResultData--parse response exception", e);
            }
        }
        if (this.f2087) {
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC18926(this), 200L);
        } else {
            C11060.m25469(str, "onActivityResult finish immediate");
            finish();
        }
    }

    @Override // android.app.Activity
    public final void setRequestedOrientation(int i) {
        if (C21789.m49157(this)) {
            return;
        }
        super.setRequestedOrientation(i);
    }
}
