package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p039o.C0180b;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ܿᩴ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AFL */
/* JADX INFO: loaded from: classes5.dex */
public final class C19041 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ AbstractActivityC5549 f56779;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C16358 f56780;

    public C19041(AbstractActivityC5549 abstractActivityC5549, C16358 c16358) {
        this.f56779 = abstractActivityC5549;
        this.f56780 = c16358;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f56779, this.f56780.f48067 != -1 ? R.string.MT_Protector : R.string.MT_Protector);
        C14853 c14853 = this.f26234;
        C12826.requireNonNull(c14853);
        c14853.m33952(new RunnableC24165(3, c14853));
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0196  */
    /* JADX WARN: Code duplicated, block: B:70:0x019b  */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws Throwable {
        C9383 c9383M49093;
        C9383 c9383M49094;
        C9383 c9383M49095;
        C16358 c16358 = this.f56780;
        if (c16358.f48067 != -1) {
            C4547 c4547M37165 = c16358.m37165();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            C21769 c21769 = new C21769();
            try {
                c9383M49094 = c21769.m49093(c4547M37165.f10197, c4547M37165.f10201, c4547M37165.f10195);
                C11666.m26799(c9383M49094);
                try {
                    if (c4547M37165.f10200) {
                        c9383M49094.m21832(c4547M37165.f10196, c4547M37165.m9624());
                    } else {
                        c9383M49094.m21848(c4547M37165.f10199);
                    }
                    boolean z = c4547M37165.f10200;
                    c9383M49094.m21837(new C3618(z ? null : c4547M37165.f10199, z ? c4547M37165.m9624() : null));
                    c9383M49094.m21831(new Runnable() { // from class: l.ܽᩴ᩻
                        @Override // java.lang.Runnable
                        public final void run() {
                            C19041.m43262(this.f54870, atomicBoolean);
                        }
                    });
                    try {
                        c9383M49094.m21830();
                        if (this.f26234.m33960()) {
                            c9383M49094.m21843();
                            return;
                        }
                        int iM21828 = c9383M49094.m21828("127.0.0.1", 0, c16358.f48068, c16358.f48063);
                        atomicBoolean.set(false);
                        this.f26234.m33950(R.string.MT_Protector);
                        c9383M49095 = c21769.m49093(iM21828, c16358.f48062, "127.0.0.1");
                        C11666.m26799(c9383M49095);
                        try {
                            if (c16358.f48069) {
                                c9383M49095.m21832(c16358.f48066, c16358.f48064.isEmpty() ? null : c16358.f48064);
                            } else {
                                c9383M49095.m21848(c16358.f48061);
                            }
                            boolean z2 = c16358.f48069;
                            c9383M49095.m21837(new C3618(z2 ? null : c16358.f48061, (!z2 || c16358.f48064.isEmpty()) ? null : c16358.f48064));
                            c9383M49095.m21831(new Runnable() { // from class: l.ᩳᩴ᩻
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C19041.m43264(this.f59943, atomicBoolean);
                                }
                            });
                            try {
                                c9383M49095.m21830();
                                this.f26234.m33955(R.string.MT_Protector);
                                C3940 c3940 = (C3940) c9383M49095.m21842("sftp");
                                c3940.m7819(Charset.forName(c16358.f48060));
                                c3940.mo24167(C0180b.f790j0);
                                c3940.m7816(".");
                                c9383M49094.m21843();
                                c9383M49095.m21843();
                            } catch (IOException e) {
                                if (atomicBoolean.get()) {
                                    throw new Exception(C7050.m16224(R.string.MT_Protector) + ": " + e.getMessage(), e);
                                }
                                throw new Exception(C7050.m16224(R.string.MT_Protector) + ": " + e.getMessage(), e);
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (c9383M49094 != null) {
                                c9383M49094.m21843();
                            }
                            if (c9383M49095 != null) {
                                c9383M49095.m21843();
                            }
                            throw th;
                        }
                    } catch (IOException e2) {
                        if (atomicBoolean.get()) {
                            throw new Exception(C7050.m16224(R.string.MT_Protector) + ": " + e2.getMessage(), e2);
                        }
                        throw new Exception(C7050.m16224(R.string.MT_Protector) + ": " + e2.getMessage(), e2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c9383M49095 = null;
                    if (c9383M49094 != null) {
                        c9383M49094.m21843();
                    }
                    if (c9383M49095 != null) {
                        c9383M49095.m21843();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                c9383M49094 = null;
            }
        } else {
            final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
            try {
                c9383M49093 = new C21769().m49093(c16358.f48068, c16358.f48062, c16358.f48063);
                C11666.m26799(c9383M49093);
                try {
                    if (c16358.f48069) {
                        c9383M49093.m21832(c16358.f48066, c16358.f48064.isEmpty() ? null : c16358.f48064);
                    } else {
                        c9383M49093.m21848(c16358.f48061);
                    }
                    boolean z3 = c16358.f48069;
                    c9383M49093.m21837(new C3618(z3 ? null : c16358.f48061, (!z3 || c16358.f48064.isEmpty()) ? null : c16358.f48064));
                    c9383M49093.m21831(new Runnable() { // from class: l.ۧᩴ᩻
                        @Override // java.lang.Runnable
                        public final void run() {
                            C19041.m43263(this.f36597, atomicBoolean2);
                        }
                    });
                    try {
                        c9383M49093.m21830();
                        if (this.f26234.m33960()) {
                            c9383M49093.m21843();
                            return;
                        }
                        this.f26234.m33955(R.string.MT_Protector);
                        C3940 c3941 = (C3940) c9383M49093.m21842("sftp");
                        c3941.m7819(Charset.forName(c16358.f48060));
                        c3941.mo24167(C0180b.f790j0);
                        c3941.m7816(".");
                        c9383M49093.m21843();
                    } catch (IOException e3) {
                        if (atomicBoolean2.get()) {
                            throw new Exception(C7050.m16224(R.string.MT_Protector) + ": " + e3.getMessage(), e3);
                        }
                        throw new Exception(C7050.m16224(R.string.MT_Protector) + ": " + e3.getMessage(), e3);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (c9383M49093 != null) {
                        c9383M49093.m21843();
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                c9383M49093 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m43263(C19041 c19041, AtomicBoolean atomicBoolean) {
        c19041.f26234.m33950(R.string.MT_Protector);
        atomicBoolean.set(true);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m43262(C19041 c19041, AtomicBoolean atomicBoolean) {
        c19041.f26234.m33950(R.string.MT_Protector);
        atomicBoolean.set(true);
    }

    /* JADX INFO: renamed from: ܽ */
    public static /* synthetic */ void m43264(C19041 c19041, AtomicBoolean atomicBoolean) {
        c19041.f26234.m33950(R.string.MT_Protector);
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
        this.f56779.m12259(exc, (DialogInterface.OnDismissListener) null);
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
