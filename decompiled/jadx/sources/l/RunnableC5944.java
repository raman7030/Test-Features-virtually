package l;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: S566 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC5944 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Typeface f18238;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18239;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f18240;

    public RunnableC5944(TextView textView, Typeface typeface, int i) {
        this.f18240 = textView;
        this.f18238 = typeface;
        this.f18239 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18240.setTypeface(this.f18238, this.f18239);
    }
}
