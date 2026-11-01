package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ܺۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 27JL */
/* JADX INFO: loaded from: classes4.dex */
public final class C17286 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ AbstractActivityC5549 f51523;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C4547 f51524;

    public C17286(AbstractActivityC5549 abstractActivityC5549, C4547 c4547) {
        this.f51523 = abstractActivityC5549;
        this.f51524 = c4547;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f51523, R.string.MT_Protector);
        C14853 c14853 = this.f26234;
        C12826.requireNonNull(c14853);
        c14853.m33952(new RunnableC24165(3, c14853));
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws Throwable {
        C4547 c4547 = this.f51524;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C9383 c9383 = null;
        try {
            C9383 c9383M49093 = new C21769().m49093(c4547.f10197, c4547.f10201, c4547.f10195);
            C11666.m26799(c9383M49093);
            try {
                if (c4547.f10200) {
                    c9383M49093.m21832(c4547.f10196, c4547.m9624());
                } else {
                    c9383M49093.m21848(c4547.f10199);
                }
                c9383M49093.m21831(new Runnable() { // from class: l.ۡۘ᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        C17286.m39153(this.f29306, atomicBoolean);
                    }
                });
                try {
                    c9383M49093.m21830();
                    c9383M49093.m21843();
                } catch (IOException e) {
                    if (!atomicBoolean.get()) {
                        throw new Exception(C7050.m16224(R.string.MT_Protector) + ": " + e.getMessage(), e);
                    }
                    throw new Exception(C7050.m16224(R.string.MT_Protector) + ": " + e.getMessage(), e);
                }
            } catch (Throwable th) {
                th = th;
                c9383 = c9383M49093;
                if (c9383 != null) {
                    c9383.m21843();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m39153(C17286 c17286, AtomicBoolean atomicBoolean) {
        c17286.f26234.m33950(R.string.MT_Protector);
        atomicBoolean.set(true);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f26234.m33960()) {
            return;
        }
        C22682.m50793(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (this.f26234.m33960()) {
            return;
        }
        this.f51523.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        if (this.f26234.m33960()) {
            return;
        }
        m22249();
    }
}
