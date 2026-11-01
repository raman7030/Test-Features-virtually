package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.p010m.p033l.C0162b;
import com.alipay.sdk.p010m.p035m.C0167a;
import com.alipay.sdk.p010m.p035m.C0168b;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0252o;
import p067l.C9179;
import p067l.ConcurrentMapC12768;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class APayEntranceActivity extends Activity {

    /* JADX INFO: renamed from: d */
    public static final String f209d = "ap_order_info";

    /* JADX INFO: renamed from: e */
    public static final String f210e = "ap_target_packagename";

    /* JADX INFO: renamed from: f */
    public static final String f211f = "ap_session";

    /* JADX INFO: renamed from: g */
    public static final String f212g = "ap_local_info";

    /* JADX INFO: renamed from: h */
    public static final ConcurrentMapC12768 f213h = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: a */
    public String f214a;

    /* JADX INFO: renamed from: b */
    public String f215b;

    /* JADX INFO: renamed from: c */
    public C0233a f216c;

    /* JADX INFO: renamed from: com.alipay.sdk.app.APayEntranceActivity$a */
    /* JADX INFO: compiled from: N673 */
    public interface InterfaceC0068a {
        /* JADX INFO: renamed from: a */
        void mo388a(String str);
    }

    @Override // android.app.Activity
    public void finish() {
        String str = this.f215b;
        C0233a c0233a = this.f216c;
        StringBuilder sbM21133 = C9179.m21133(str, "|");
        sbM21133.append(TextUtils.isEmpty(this.f214a));
        C0167a.m750a(c0233a, C0168b.f618l, "BSAFinish", sbM21133.toString());
        if (TextUtils.isEmpty(this.f214a)) {
            this.f214a = C0162b.m728a();
            C0233a c0233a2 = this.f216c;
            if (c0233a2 != null) {
                c0233a2.m1104b(true);
            }
        }
        if (str != null) {
            InterfaceC0068a interfaceC0068a = (InterfaceC0068a) f213h.remove(str);
            if (interfaceC0068a != null) {
                interfaceC0068a.mo388a(this.f214a);
            } else {
                C0167a.m755b(this.f216c, "wr", "refNull", "session=".concat(str));
            }
        }
        try {
            super.finish();
        } catch (Throwable th) {
            C0167a.m751a(this.f216c, "wr", "APStartFinish", th);
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C0167a.m750a(this.f216c, C0168b.f618l, "BSAOnAR", this.f215b + "|" + i + "," + i2);
        if (i == 1000) {
            if (intent != null) {
                try {
                    this.f214a = intent.getStringExtra(C0252o.f1208c);
                } catch (Throwable unused) {
                }
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            String string = extras.getString(f209d);
            String string2 = extras.getString(f210e);
            this.f215b = extras.getString(f211f);
            String string3 = extras.getString(f212g, "{}");
            if (!TextUtils.isEmpty(this.f215b)) {
                C0233a c0233aM1118a = C0233a.a.m1118a(this.f215b);
                this.f216c = c0233aM1118a;
                C0167a.m750a(c0233aM1118a, C0168b.f618l, "BSAEntryCreate", this.f215b + "|" + SystemClock.elapsedRealtime());
            }
            Intent intent = new Intent();
            intent.putExtra("order_info", string);
            intent.putExtra("localInfo", string3);
            intent.setClassName(string2, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity");
            try {
                startActivityForResult(intent, 1000);
            } catch (Throwable th) {
                C0167a.m751a(this.f216c, "wr", "APStartEx", th);
                finish();
            }
            if (this.f216c != null) {
                Context applicationContext = getApplicationContext();
                C0233a c0233a = this.f216c;
                C0167a.m748a(applicationContext, c0233a, string, c0233a.f1098d);
                this.f216c.m1099a(true);
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}
