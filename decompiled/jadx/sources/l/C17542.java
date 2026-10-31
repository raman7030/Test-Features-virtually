package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.alipay.sdk.m.o.b;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ܿᩴ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AFL */
/* JADX INFO: loaded from: classes5.dex */
public final class C17542 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f53589;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14719 f53590;

    public C17542(AbstractActivityC3346 abstractActivityC3346, C14719 c14719) {
        this.f53589 = abstractActivityC3346;
        this.f53590 = c14719;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f53589, this.f53590.f44954 != -1 ? R.string.MT_Protector : R.string.MT_Protector);
        C13136 c13136 = this.f23322;
        C11003.requireNonNull(c13136);
        c13136.m31860(new RunnableC22934(3, c13136));
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0196  */
    /* JADX WARN: Code duplicated, block: B:70:0x019b  */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws Throwable {
        C7381 c7381M46770;
        C7381 c7381M46771;
        C7381 c7381M46772;
        C14719 c14719 = this.f53590;
        if (c14719.f44954 != -1) {
            C2292 c2292M35018 = c14719.m35018();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            C20413 c20413 = new C20413();
            try {
                c7381M46771 = c20413.m46770(c2292M35018.f7411, c2292M35018.f7415, c2292M35018.f7409);
                C9782.m24785(c7381M46771);
                try {
                    if (c2292M35018.f7414) {
                        c7381M46771.m19859(c2292M35018.f7410, c2292M35018.m7556());
                    } else {
                        c7381M46771.m19875(c2292M35018.f7413);
                    }
                    boolean z = c2292M35018.f7414;
                    c7381M46771.m19864(new C1314(z ? null : c2292M35018.f7413, z ? c2292M35018.m7556() : null));
                    c7381M46771.m19858(new Runnable() { // from class: l.ܽᩴ᩻
                        @Override // java.lang.Runnable
                        public final void run() {
                            C17542.m41017(this.f51690, atomicBoolean);
                        }
                    });
                    try {
                        c7381M46771.m19857();
                        if (this.f23322.m31868()) {
                            c7381M46771.m19870();
                            return;
                        }
                        int iM19855 = c7381M46771.m19855("127.0.0.1", 0, c14719.f44955, c14719.f44950);
                        atomicBoolean.set(false);
                        this.f23322.m31858(R.string.MT_Protector);
                        c7381M46772 = c20413.m46770(iM19855, c14719.f44949, "127.0.0.1");
                        C9782.m24785(c7381M46772);
                        try {
                            if (c14719.f44956) {
                                c7381M46772.m19859(c14719.f44953, c14719.f44951.isEmpty() ? null : c14719.f44951);
                            } else {
                                c7381M46772.m19875(c14719.f44948);
                            }
                            boolean z2 = c14719.f44956;
                            c7381M46772.m19864(new C1314(z2 ? null : c14719.f44948, (!z2 || c14719.f44951.isEmpty()) ? null : c14719.f44951));
                            c7381M46772.m19858(new Runnable() { // from class: l.ᩳᩴ᩻
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C17542.m41019(this.f56726, atomicBoolean);
                                }
                            });
                            try {
                                c7381M46772.m19857();
                                this.f23322.m31863(R.string.MT_Protector);
                                C1654 c1654 = (C1654) c7381M46772.m19869("sftp");
                                c1654.m5589(Charset.forName(c14719.f44947));
                                c1654.mo22199(b.j0);
                                c1654.m5586(".");
                                c7381M46771.m19870();
                                c7381M46772.m19870();
                            } catch (IOException e) {
                                if (atomicBoolean.get()) {
                                    throw new Exception(C4925.m14327(R.string.MT_Protector) + ": " + e.getMessage(), e);
                                }
                                throw new Exception(C4925.m14327(R.string.MT_Protector) + ": " + e.getMessage(), e);
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (c7381M46771 != null) {
                                c7381M46771.m19870();
                            }
                            if (c7381M46772 != null) {
                                c7381M46772.m19870();
                            }
                            throw th;
                        }
                    } catch (IOException e2) {
                        if (atomicBoolean.get()) {
                            throw new Exception(C4925.m14327(R.string.MT_Protector) + ": " + e2.getMessage(), e2);
                        }
                        throw new Exception(C4925.m14327(R.string.MT_Protector) + ": " + e2.getMessage(), e2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c7381M46772 = null;
                    if (c7381M46771 != null) {
                        c7381M46771.m19870();
                    }
                    if (c7381M46772 != null) {
                        c7381M46772.m19870();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                c7381M46771 = null;
            }
        } else {
            final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
            try {
                c7381M46770 = new C20413().m46770(c14719.f44955, c14719.f44949, c14719.f44950);
                C9782.m24785(c7381M46770);
                try {
                    if (c14719.f44956) {
                        c7381M46770.m19859(c14719.f44953, c14719.f44951.isEmpty() ? null : c14719.f44951);
                    } else {
                        c7381M46770.m19875(c14719.f44948);
                    }
                    boolean z3 = c14719.f44956;
                    c7381M46770.m19864(new C1314(z3 ? null : c14719.f44948, (!z3 || c14719.f44951.isEmpty()) ? null : c14719.f44951));
                    c7381M46770.m19858(new Runnable() { // from class: l.ۧᩴ᩻
                        @Override // java.lang.Runnable
                        public final void run() {
                            C17542.m41018(this.f33598, atomicBoolean2);
                        }
                    });
                    try {
                        c7381M46770.m19857();
                        if (this.f23322.m31868()) {
                            c7381M46770.m19870();
                            return;
                        }
                        this.f23322.m31863(R.string.MT_Protector);
                        C1654 c1655 = (C1654) c7381M46770.m19869("sftp");
                        c1655.m5589(Charset.forName(c14719.f44947));
                        c1655.mo22199(b.j0);
                        c1655.m5586(".");
                        c7381M46770.m19870();
                    } catch (IOException e3) {
                        if (atomicBoolean2.get()) {
                            throw new Exception(C4925.m14327(R.string.MT_Protector) + ": " + e3.getMessage(), e3);
                        }
                        throw new Exception(C4925.m14327(R.string.MT_Protector) + ": " + e3.getMessage(), e3);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (c7381M46770 != null) {
                        c7381M46770.m19870();
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                c7381M46770 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m41018(C17542 c17542, AtomicBoolean atomicBoolean) {
        c17542.f23322.m31858(R.string.MT_Protector);
        atomicBoolean.set(true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m41017(C17542 c17542, AtomicBoolean atomicBoolean) {
        c17542.f23322.m31858(R.string.MT_Protector);
        atomicBoolean.set(true);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m41019(C17542 c17542, AtomicBoolean atomicBoolean) {
        c17542.f23322.m31858(R.string.MT_Protector);
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
        this.f53589.m10223(exc, (DialogInterface.OnDismissListener) null);
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
