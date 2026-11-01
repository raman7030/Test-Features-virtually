package p067l;

import android.content.Context;
import bin.p000mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩷۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: M70U */
/* JADX INFO: loaded from: classes5.dex */
public final class C22075 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C8838 f69437;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C11346 f69438;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ C10675 f69439;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C18225 f69440;

    public C22075(C10675 c10675, C8838 c8838, C11346 c11346, C18225 c18225) {
        this.f69439 = c10675;
        this.f69437 = c8838;
        this.f69438 = c11346;
        this.f69440 = c18225;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() throws Throwable {
        C8838 c8838 = this.f69437;
        C4144 c4144M29478 = c8838.f23986.m29478();
        C10675 c10675 = this.f69439;
        c10675.f29541 = c4144M29478;
        Context context = c8838.getContext();
        if (c10675.f29541 == null || !(context instanceof AbstractActivityC5549)) {
            return;
        }
        final C11346 c11346 = this.f69438;
        m22245((AbstractActivityC5549) context, R.string.MT_Protector, 200, new Runnable() { // from class: l.ۜ۟ܿ
            @Override // java.lang.Runnable
            public final void run() {
                this.f23268.f26234.m33952(new RunnableC18721(c11346));
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m49670(C22075 c22075) {
        if (c22075.f69438.mo3924()) {
            return true;
        }
        C14853 c14853 = c22075.f26234;
        return c14853 != null && c14853.m33960();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C14853 c14853;
        C10675 c10675 = this.f69439;
        C18225 c18225 = this.f69440;
        if (c18225.m41453()) {
            try {
                if (c10675.f29541 != null) {
                    if (!(this.f69438.mo3924() || ((c14853 = this.f26234) != null && c14853.m33960()))) {
                        c10675.f29539 = this.f69437.f23986.m29451(c10675.f29541, new C24756(this));
                        c10675.f29538 = true;
                    }
                }
            } finally {
                c18225.m41456();
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        this.f69440.m41454();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (exc instanceof C25008) {
            return;
        }
        C8838 c8838 = this.f69437;
        if (c8838.f23986.m29457(this.f69439.f29541)) {
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
                c8838.m20428(new IOException("Unable to paste hex range", exc));
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C18225 c18225 = this.f69440;
        c18225.m41456();
        c18225.m41454();
        C10675 c10675 = this.f69439;
        if (c10675.f29541 != null) {
            try {
                c10675.f29541.close();
            } catch (IOException unused) {
            }
        }
        m22249();
        c18225.close();
    }
}
