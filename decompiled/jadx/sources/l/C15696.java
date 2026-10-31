package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ܺۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 27JL */
/* JADX INFO: loaded from: classes4.dex */
public final class C15696 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f48385;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2292 f48386;

    public C15696(AbstractActivityC3346 abstractActivityC3346, C2292 c2292) {
        this.f48385 = abstractActivityC3346;
        this.f48386 = c2292;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f48385, R.string.MT_Protector);
        C13136 c13136 = this.f23322;
        C11003.requireNonNull(c13136);
        c13136.m31860(new RunnableC22934(3, c13136));
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws Throwable {
        C2292 c2292 = this.f48386;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C7381 c7381 = null;
        try {
            C7381 c7381M46770 = new C20413().m46770(c2292.f7411, c2292.f7415, c2292.f7409);
            C9782.m24785(c7381M46770);
            try {
                if (c2292.f7414) {
                    c7381M46770.m19859(c2292.f7410, c2292.m7556());
                } else {
                    c7381M46770.m19875(c2292.f7413);
                }
                c7381M46770.m19858(new Runnable() { // from class: l.ۡۘ᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        C15696.m36987(this.f26388, atomicBoolean);
                    }
                });
                try {
                    c7381M46770.m19857();
                    c7381M46770.m19870();
                } catch (IOException e) {
                    if (!atomicBoolean.get()) {
                        throw new Exception(C4925.m14327(R.string.MT_Protector) + ": " + e.getMessage(), e);
                    }
                    throw new Exception(C4925.m14327(R.string.MT_Protector) + ": " + e.getMessage(), e);
                }
            } catch (Throwable th) {
                th = th;
                c7381 = c7381M46770;
                if (c7381 != null) {
                    c7381.m19870();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m36987(C15696 c15696, AtomicBoolean atomicBoolean) {
        c15696.f23322.m31858(R.string.MT_Protector);
        atomicBoolean.set(true);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f23322.m31868()) {
            return;
        }
        C21374.m48457(R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f23322.m31868()) {
            return;
        }
        this.f48385.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        if (this.f23322.m31868()) {
            return;
        }
        m20273();
    }
}
