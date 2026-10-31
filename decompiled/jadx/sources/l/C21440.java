package l;

import android.content.Context;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩸۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4M8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21440 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6807 f69019;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CharSequence f69020;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12267 f69021;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22145 f69022;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f69023;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12972 f69024;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16684 f69025;

    public C21440(C6807 c6807, C22145 c22145, C12972 c12972, C16684 c16684, C12267 c12267, CharSequence charSequence, int i) {
        this.f69019 = c6807;
        this.f69022 = c22145;
        this.f69024 = c12972;
        this.f69025 = c16684;
        this.f69021 = c12267;
        this.f69020 = charSequence;
        this.f69023 = i;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        Context context = this.f69019.getContext();
        if (context instanceof AbstractActivityC3346) {
            final C22145 c22145 = this.f69022;
            m20269((AbstractActivityC3346) context, R.string.MT_Protector, 200, new Runnable() { // from class: l.ܶ۟ܿ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f46087.f23322.m31860(new RunnableC0272(c22145));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean m48562() {
        if (this.f69022.mo1526()) {
            return true;
        }
        C13136 c13136 = this.f23322;
        return (c13136 != null && c13136.m31868()) || !this.f69024.m31539(this.f69019);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C16684 c16684 = this.f69025;
        if (c16684.m39218()) {
            try {
                if (!m48562()) {
                    this.f69021.f36545 = C5917.m16583(this.f69019, this.f69024, this.f69020, this.f69023, new C8034(this));
                }
            } finally {
                c16684.m39221();
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        this.f69025.m39219();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (exc instanceof C23821) {
            return;
        }
        C6807 c6807 = this.f69019;
        if (c6807.f21109.m27414() == this.f69024.f38873) {
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
                c6807.m18479(new IOException("Unable to paste external hex text", exc));
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C16684 c16684 = this.f69025;
        c16684.m39221();
        c16684.m39219();
        m20273();
        c16684.close();
    }
}
