package l;

import android.content.Context;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩷۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: M70U */
/* JADX INFO: loaded from: classes5.dex */
public final class C20735 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6807 f66756;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9446 f66757;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8740 f66758;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16684 f66759;

    public C20735(C8740 c8740, C6807 c6807, C9446 c9446, C16684 c16684) {
        this.f66758 = c8740;
        this.f66756 = c6807;
        this.f66757 = c9446;
        this.f66759 = c16684;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() throws Throwable {
        C6807 c6807 = this.f66756;
        C1868 c1868M27416 = c6807.f21109.m27416();
        C8740 c8740 = this.f66758;
        c8740.f26616 = c1868M27416;
        Context context = c6807.getContext();
        if (c8740.f26616 == null || !(context instanceof AbstractActivityC3346)) {
            return;
        }
        final C9446 c9446 = this.f66757;
        m20269((AbstractActivityC3346) context, R.string.MT_Protector, 200, new Runnable() { // from class: l.ۜ۟ܿ
            @Override // java.lang.Runnable
            public final void run() {
                this.f20392.f23322.m31860(new RunnableC17206(c9446));
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m47343(C20735 c20735) {
        if (c20735.f66757.mo1526()) {
            return true;
        }
        C13136 c13136 = c20735.f23322;
        return c13136 != null && c13136.m31868();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C13136 c13136;
        C8740 c8740 = this.f66758;
        C16684 c16684 = this.f66759;
        if (c16684.m39218()) {
            try {
                if (c8740.f26616 != null) {
                    if (!(this.f66757.mo1526() || ((c13136 = this.f23322) != null && c13136.m31868()))) {
                        c8740.f26614 = this.f66756.f21109.m27389(c8740.f26616, new C23556(this));
                        c8740.f26613 = true;
                    }
                }
            } finally {
                c16684.m39221();
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        this.f66759.m39219();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (exc instanceof C23821) {
            return;
        }
        C6807 c6807 = this.f66756;
        if (c6807.f21109.m27395(this.f66758.f26616)) {
            Context context = c6807.getContext();
            if (context instanceof AbstractActivityC3346) {
                AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) context;
                if (abstractActivityC3346.isFinishing() || abstractActivityC3346.isDestroyed()) {
                    return;
                }
            }
            if (exc instanceof C7161) {
                C21374.m48457(R.string.MT_Protector);
            } else if (exc instanceof IOException) {
                c6807.m18479((IOException) exc);
            } else {
                c6807.m18479(new IOException("Unable to paste hex range", exc));
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C16684 c16684 = this.f66759;
        c16684.m39221();
        c16684.m39219();
        C8740 c8740 = this.f66758;
        if (c8740.f26616 != null) {
            try {
                c8740.f26616.close();
            } catch (IOException unused) {
            }
        }
        m20273();
        c16684.close();
    }
}
