package p067l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.֫ۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4026 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f8805;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f8806;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f8807;

    public /* synthetic */ RunnableC4026(int i, int i2, Object obj) {
        this.f8806 = i2;
        this.f8807 = obj;
        this.f8805 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8806) {
            case 0:
                TextView textView = (TextView) this.f8807;
                if (textView.getVisibility() != 0) {
                    textView.setVisibility(0);
                }
                textView.setText(this.f8805 + "%");
                break;
            default:
                C2753.m4289((C2753) this.f8807, this.f8805);
                break;
        }
    }
}
