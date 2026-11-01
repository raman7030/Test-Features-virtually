package p067l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۨ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC13744 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractActivityC5549 f38846;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ TextView f38847;

    public RunnableC13744(AbstractActivityC5549 abstractActivityC5549, TextView textView) {
        this.f38846 = abstractActivityC5549;
        this.f38847 = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C19799.m45023(this.f38846, this.f38847);
        C19799.m45022(this);
    }
}
