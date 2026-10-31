package l;

import android.view.View;
import android.widget.ProgressBar;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.᩹ۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AIV */
/* JADX INFO: loaded from: classes.dex */
public final class C22022 extends C22933 {
    @Override // l.C22933
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22933 mo49541(View.OnClickListener onClickListener) {
        throw null;
    }

    public C22022(AbstractActivityC3346 abstractActivityC3346) {
        super(abstractActivityC3346);
        this.f73911.setVisibility(0);
        this.f73903.setVisibility(0);
    }

    @Override // l.C22933
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22933 mo49542(Runnable runnable) {
        super.mo49542((Runnable) null);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49543(Runnable runnable) {
        super.mo49542(runnable);
    }

    @Override // l.C22933
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C22933 mo49547() {
        super.mo49547();
        return this;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m49548() {
        super.mo49547();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m49558(int i) {
        super.m51049(i);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m49554(CharSequence charSequence) {
        super.m51046(charSequence);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m49556(CharSequence charSequence) {
        super.m51040(charSequence);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49549(long j, long j2) {
        super.m51039(j, j2);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m49553(int i) {
        super.m51045(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49544(ViewOnClickListenerC2205 viewOnClickListenerC2205) {
        super.mo49541((View.OnClickListener) viewOnClickListenerC2205);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m49555(final int i) {
        if (C10975.m27285()) {
            this.f73911.setMax(i);
        } else {
            C4925.m14315(new Runnable() { // from class: l.ܶۗܿ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45620.f73911.setMax(i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m49552(long j, long j2) {
        if (j2 == 0) {
            m49550(0);
        } else {
            m49550((int) ((j * 100) / j2));
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m49550(int i) {
        ProgressBar progressBar = this.f73911;
        if (progressBar.getProgress() != i) {
            boolean zM27285 = C10975.m27285();
            AtomicInteger atomicInteger = this.f73900;
            if (zM27285) {
                atomicInteger.set(-1);
                progressBar.setProgress(i);
            } else {
                atomicInteger.set(i);
                m51052();
            }
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m49551() {
        return this.f73911.getProgress();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m49545() {
        ProgressBar progressBar = this.f73911;
        if (progressBar.getVisibility() == 8) {
            return;
        }
        if (C10975.m27285()) {
            progressBar.setVisibility(8);
            this.f73903.setVisibility(8);
        } else {
            C4925.m14315(new Runnable() { // from class: l.۠ۗܿ
                @Override // java.lang.Runnable
                public final void run() {
                    C22022 c22022 = this.f24496;
                    c22022.f73911.setVisibility(8);
                    c22022.f73903.setVisibility(8);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m49557() {
        ProgressBar progressBar = this.f73911;
        if (progressBar.getVisibility() == 0) {
            return;
        }
        if (C10975.m27285()) {
            progressBar.setVisibility(0);
            this.f73903.setVisibility(0);
        } else {
            C4925.m14315(new Runnable() { // from class: l.֨ۗܿ
                @Override // java.lang.Runnable
                public final void run() {
                    C22022 c22022 = this.f3338;
                    c22022.f73911.setVisibility(0);
                    c22022.f73903.setVisibility(0);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8693 m49546() {
        return new C21317(this);
    }
}
