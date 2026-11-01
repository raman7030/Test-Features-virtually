package p067l;

import android.content.Context;
import bin.p000mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩸۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4M8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22745 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C8838 f71716;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ CharSequence f71717;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ C14027 f71718;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C23415 f71719;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ int f71720;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ C14697 f71721;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C18225 f71722;

    public C22745(C8838 c8838, C23415 c23415, C14697 c14697, C18225 c18225, C14027 c14027, CharSequence charSequence, int i) {
        this.f71716 = c8838;
        this.f71719 = c23415;
        this.f71721 = c14697;
        this.f71722 = c18225;
        this.f71718 = c14027;
        this.f71717 = charSequence;
        this.f71720 = i;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        Context context = this.f71716.getContext();
        if (context instanceof AbstractActivityC5549) {
            final C23415 c23415 = this.f71719;
            m22245((AbstractActivityC5549) context, R.string.MT_Protector, 200, new Runnable() { // from class: l.ܶ۟ܿ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49204.f26234.m33952(new RunnableC2627(c23415));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۜ */
    public boolean m50899() {
        if (this.f71719.mo3924()) {
            return true;
        }
        C14853 c14853 = this.f26234;
        return (c14853 != null && c14853.m33960()) || !this.f71721.m33624(this.f71716);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C18225 c18225 = this.f71722;
        if (c18225.m41453()) {
            try {
                if (!m50899()) {
                    this.f71718.f39561 = C7992.m18509(this.f71716, this.f71721, this.f71717, this.f71720, new C10004(this));
                }
            } finally {
                c18225.m41456();
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        this.f71722.m41454();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (exc instanceof C25008) {
            return;
        }
        C8838 c8838 = this.f71716;
        if (c8838.f23986.m29476() == this.f71721.f41917) {
            Context context = c8838.getContext();
            if (context instanceof AbstractActivityC5549) {
                AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) context;
                if (abstractActivityC5549.isFinishing() || abstractActivityC5549.isDestroyed()) {
                    return;
                }
            }
            if (exc instanceof C9174) {
                C22682.m50793(R.string.MT_Protector);
            } else if (exc instanceof IOException) {
                c8838.m20428((IOException) exc);
            } else {
                c8838.m20428(new IOException("Unable to paste external hex text", exc));
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C18225 c18225 = this.f71722;
        c18225.m41456();
        c18225.m41454();
        m22249();
        c18225.close();
    }
}
