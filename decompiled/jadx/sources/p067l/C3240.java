package p067l;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.֨ۚܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3240 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public AbstractC17043 f6280;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ C12510 f6281;

    /* JADX INFO: renamed from: ܳ */
    public C14634 f6282;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ int f6283;

    /* JADX INFO: renamed from: ᩻ */
    public C24164 f6284;

    public C3240(C12510 c12510, int i) {
        this.f6281 = c12510;
        this.f6283 = i;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C12510 c12510 = this.f6281;
        C24164 c24164 = new C24164(c12510.f35058);
        c24164.m53440(R.string.MT_Protector);
        c24164.m53431(c12510.getFileName());
        c24164.mo51877(new View.OnClickListener() { // from class: l.֡ۚܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4244.f6284.m53442();
            }
        });
        c24164.mo51883();
        this.f6284 = c24164;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        int i;
        String strValueOf;
        String str;
        synchronized (C21898.f68880) {
            String str2 = "-r -t -d " + C13161.m30151(this.f6281.f35061);
            if (Build.VERSION.SDK_INT <= 23) {
                try {
                    i = Integer.parseInt(C17853.f53287.getName());
                } catch (NumberFormatException unused) {
                    i = 0;
                }
                strValueOf = String.valueOf(i);
            } else {
                strValueOf = "current";
            }
            String strM33522 = C14652.m33522(false);
            if (strM33522 == null) {
                strM33522 = "su";
            }
            this.f6282 = new C14634(strM33522, false);
            if (strValueOf.equals("current") && !this.f6281.f35061.isEmpty()) {
                C13964 c13964Mo27363 = this.f6282.mo27363("am get-current-user", true);
                String strTrim = c13964Mo27363.m31744().trim();
                if (!c13964Mo27363.m31745()) {
                    try {
                        int i2 = Integer.parseInt(strTrim);
                        if (i2 >= 0) {
                            strValueOf = String.valueOf(i2);
                        }
                    } catch (NumberFormatException unused2) {
                    }
                }
                throw new IOException("Unable to resolve current installation user: " + strTrim);
            }
            String str3 = str2 + "--user " + strValueOf + " ";
            if (Build.VERSION.SDK_INT >= 34) {
                str3 = str3 + "--bypass-low-target-sdk-block ";
            }
            C13161.m30148(this.f6282, strValueOf, this.f6281.f35061);
            int i3 = this.f6283;
            if (i3 == 0) {
                str = "pm install " + str3 + C11164.m25756(this.f6281.f35059.mo25505());
            } else if (i3 == 1) {
                str = "cat " + C11164.m25756(this.f6281.f35059.mo25505()) + " | pm install " + str3 + "-S " + this.f6281.f35059.mo25101();
            } else if (i3 == 2) {
                this.f6280 = C18524.m42109("/data/local/tmp/mt_install.apk", new String[0]);
                this.f6284.mo51878((Runnable) null);
                this.f6281.f35059.m38658(this.f6280, (C19056) null, new C7264(this));
                if (this.f6284.m53444()) {
                    return;
                }
                this.f6284.m53439();
                str = "pm install " + str3 + "/data/local/tmp/mt_install.apk";
            } else {
                throw new RuntimeException();
            }
            this.f6284.m53432(true);
            C14634 c14634 = this.f6282;
            c14634.getClass();
            C21898.m49401(c14634.mo27361(0L, str).m31744());
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f6284.m53444()) {
            return;
        }
        C12510 c12510 = this.f6281;
        C21898.m49402(c12510.f35058, c12510.getFileName(), c12510.f35062);
        C21898.f68877.mo4067((Object) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if ((exc instanceof CancellationException) || this.f6284.m53444()) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        boolean z = exc instanceof C2450;
        C12510 c12510 = this.f6281;
        if (z) {
            C2450 c2450 = (C2450) exc;
            if (c2450.m3442()) {
                Intent intent = new Intent("bin.mt.plus.ACTION_INSTALL_FAILED_DOWNGRADE");
                intent.putExtra("pkgName", c12510.f35062);
                C4491.m9493(C7050.m16232()).m9497(intent);
                return;
            } else if (c2450.m3443()) {
                AbstractActivityC5549 abstractActivityC5549 = c12510.f35058;
                String message = c2450.getMessage();
                String strM3441 = c2450.m3441();
                abstractActivityC5549.getClass();
                abstractActivityC5549.runOnUiThread(new RunnableC11585(abstractActivityC5549, message, strM3441, false));
                return;
            }
        }
        c12510.m28815(exc);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f6284.m53442();
        C14634 c14634 = this.f6282;
        if (c14634 != null) {
            c14634.close();
        }
        AbstractC17043 abstractC17043 = this.f6280;
        if (abstractC17043 != null) {
            abstractC17043.mo25503();
        }
    }
}
