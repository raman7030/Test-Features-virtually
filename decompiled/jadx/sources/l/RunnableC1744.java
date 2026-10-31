package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.֫ۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1744 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f6028;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f6029;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f6030;

    public /* synthetic */ RunnableC1744(int i, int i2, Object obj) {
        this.f6029 = i2;
        this.f6030 = obj;
        this.f6028 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6029) {
            case 0:
                TextView textView = (TextView) this.f6030;
                if (textView.getVisibility() != 0) {
                    textView.setVisibility(0);
                }
                textView.setText(this.f6028 + "%");
                break;
            default:
                C0405.m1897((C0405) this.f6030, this.f6028);
                break;
        }
    }
}
