package p067l;

import android.view.View;
import android.widget.ProgressBar;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.᩹ۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AIV */
/* JADX INFO: loaded from: classes.dex */
public final class C23298 extends C24164 {
    @Override // p067l.C24164
    /* JADX INFO: renamed from: ֫ */
    public final C24164 mo51877(View.OnClickListener onClickListener) {
        throw null;
    }

    public C23298(AbstractActivityC5549 abstractActivityC5549) {
        super(abstractActivityC5549);
        this.f76640.setVisibility(0);
        this.f76632.setVisibility(0);
    }

    @Override // p067l.C24164
    /* JADX INFO: renamed from: ֫ */
    public final C24164 mo51878(Runnable runnable) {
        super.mo51878((Runnable) null);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51879(Runnable runnable) {
        super.mo51878(runnable);
    }

    @Override // p067l.C24164
    /* JADX INFO: renamed from: ۡ */
    public final C24164 mo51883() {
        super.mo51883();
        return this;
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m51884() {
        super.mo51883();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m51894(int i) {
        super.m53440(i);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m51890(CharSequence charSequence) {
        super.m53437(charSequence);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m51892(CharSequence charSequence) {
        super.m53431(charSequence);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m51885(long j, long j2) {
        super.m53430(j, j2);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m51889(int i) {
        super.m53436(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51880(ViewOnClickListenerC4464 viewOnClickListenerC4464) {
        super.mo51877((View.OnClickListener) viewOnClickListenerC4464);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m51891(final int i) {
        if (C12799.m29347()) {
            this.f76640.setMax(i);
        } else {
            C7050.m16212(new Runnable() { // from class: l.ܶۗܿ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48731.f76640.setMax(i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m51888(long j, long j2) {
        if (j2 == 0) {
            m51886(0);
        } else {
            m51886((int) ((j * 100) / j2));
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m51886(int i) {
        ProgressBar progressBar = this.f76640;
        if (progressBar.getProgress() != i) {
            boolean zM29347 = C12799.m29347();
            AtomicInteger atomicInteger = this.f76629;
            if (zM29347) {
                atomicInteger.set(-1);
                progressBar.setProgress(i);
            } else {
                atomicInteger.set(i);
                m53443();
            }
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public final int m51887() {
        return this.f76640.getProgress();
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m51881() {
        ProgressBar progressBar = this.f76640;
        if (progressBar.getVisibility() == 8) {
            return;
        }
        if (C12799.m29347()) {
            progressBar.setVisibility(8);
            this.f76632.setVisibility(8);
        } else {
            C7050.m16212(new Runnable() { // from class: l.۠ۗܿ
                @Override // java.lang.Runnable
                public final void run() {
                    C23298 c23298 = this.f27411;
                    c23298.f76640.setVisibility(8);
                    c23298.f76632.setVisibility(8);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ᩴ */
    public final void m51893() {
        ProgressBar progressBar = this.f76640;
        if (progressBar.getVisibility() == 0) {
            return;
        }
        if (C12799.m29347()) {
            progressBar.setVisibility(0);
            this.f76632.setVisibility(0);
        } else {
            C7050.m16212(new Runnable() { // from class: l.֨ۗܿ
                @Override // java.lang.Runnable
                public final void run() {
                    C23298 c23298 = this.f6111;
                    c23298.f76640.setVisibility(0);
                    c23298.f76632.setVisibility(0);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۘ */
    public final InterfaceC10630 m51882() {
        return new C22628(this);
    }
}
