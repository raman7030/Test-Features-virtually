package l;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.֨ۚܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0917 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f3505;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10671 f3506;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C12906 f3507;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f3508;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C22933 f3509;

    public C0917(C10671 c10671, int i) {
        this.f3506 = c10671;
        this.f3508 = i;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C10671 c10671 = this.f3506;
        C22933 c22933 = new C22933(c10671.f32087);
        c22933.m51049(R.string.MT_Protector);
        c22933.m51040(c10671.getFileName());
        c22933.mo49541(new View.OnClickListener() { // from class: l.֡ۚܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f1465.f3509.m51051();
            }
        });
        c22933.mo49547();
        this.f3509 = c22933;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        int i;
        String strValueOf;
        String str;
        synchronized (C20549.f66203) {
            String str2 = "-r -t -d " + C11356.m28107(this.f3506.f32090);
            if (Build.VERSION.SDK_INT <= 23) {
                try {
                    i = Integer.parseInt(C16293.f50120.getName());
                } catch (NumberFormatException unused) {
                    i = 0;
                }
                strValueOf = String.valueOf(i);
            } else {
                strValueOf = "current";
            }
            String strM31436 = C12925.m31436(false);
            if (strM31436 == null) {
                strM31436 = "su";
            }
            this.f3507 = new C12906(strM31436, false);
            if (strValueOf.equals("current") && !this.f3506.f32090.isEmpty()) {
                C12201 c12201Mo25344 = this.f3507.mo25344("am get-current-user", true);
                String strTrim = c12201Mo25344.m29682().trim();
                if (!c12201Mo25344.m29683()) {
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
            C11356.m28104(this.f3507, strValueOf, this.f3506.f32090);
            int i3 = this.f3508;
            if (i3 == 0) {
                str = "pm install " + str3 + C9255.m23755(this.f3506.f32088.mo23554());
            } else if (i3 == 1) {
                str = "cat " + C9255.m23755(this.f3506.f32088.mo23554()) + " | pm install " + str3 + "-S " + this.f3506.f32088.mo23127();
            } else if (i3 == 2) {
                this.f3505 = C16999.m39866("/data/local/tmp/mt_install.apk", new String[0]);
                this.f3509.mo49542((Runnable) null);
                this.f3506.f32088.m36500(this.f3505, (C17558) null, new C5151(this));
                if (this.f3509.m51053()) {
                    return;
                }
                this.f3509.m51048();
                str = "pm install " + str3 + "/data/local/tmp/mt_install.apk";
            } else {
                throw new RuntimeException();
            }
            this.f3509.m51041(true);
            C12906 c12906 = this.f3507;
            c12906.getClass();
            C20549.m47078(c12906.mo25342(0L, str).m29682());
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f3509.m51053()) {
            return;
        }
        C10671 c10671 = this.f3506;
        C20549.m47079(c10671.f32087, c10671.getFileName(), c10671.f32091);
        C20549.f66200.mo1669((Object) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if ((exc instanceof CancellationException) || this.f3509.m51053()) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        boolean z = exc instanceof C0086;
        C10671 c10671 = this.f3506;
        if (z) {
            C0086 c0086 = (C0086) exc;
            if (c0086.m1046()) {
                Intent intent = new Intent("bin.mt.plus.ACTION_INSTALL_FAILED_DOWNGRADE");
                intent.putExtra("pkgName", c10671.f32091);
                C2234.m7411(C4925.m14335()).m7415(intent);
                return;
            } else if (c0086.m1047()) {
                AbstractActivityC3346 abstractActivityC3346 = c10671.f32087;
                String message = c0086.getMessage();
                String strM1045 = c0086.m1045();
                abstractActivityC3346.getClass();
                abstractActivityC3346.runOnUiThread(new RunnableC9697(abstractActivityC3346, message, strM1045, false));
                return;
            }
        }
        c10671.m26776(exc);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f3509.m51051();
        C12906 c12906 = this.f3507;
        if (c12906 != null) {
            c12906.close();
        }
        AbstractC15440 abstractC15440 = this.f3505;
        if (abstractC15440 != null) {
            abstractC15440.mo23552();
        }
    }
}
