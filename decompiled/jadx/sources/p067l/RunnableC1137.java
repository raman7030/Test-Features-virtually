package p067l;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۛۡ */
/* JADX INFO: compiled from: S566 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC1137 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Typeface f21093;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f21094;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ TextView f21095;

    public RunnableC1137(TextView textView, Typeface typeface, int i) {
        this.f21095 = textView;
        this.f21093 = typeface;
        this.f21094 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21095.setTypeface(this.f21093, this.f21094);
    }
}
