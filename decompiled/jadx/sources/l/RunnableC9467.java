package l;

import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۢ۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9467 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8761 f28788;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f28789 = false;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ImageView f28790;

    public RunnableC9467(C8761 c8761) {
        this.f28788 = c8761;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8761 c8761 = this.f28788;
        C2910 c2910 = c8761.f26709;
        c8761.f26712 = c2910.m8891(c8761.f26713);
        String strM8898 = c2910.m8898();
        synchronized (C3822.f12232) {
            C3822.f12232.m4554(strM8898, this.f28788.f26712);
        }
        C4925.m14315(new Runnable() { // from class: l.᩷۠ܿ
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC9467 runnableC9467 = this.f67237;
                C8761 c8762 = runnableC9467.f28788;
                C2910 c2911 = c8762.f26709;
                ImageView imageView = runnableC9467.f28790;
                if (imageView.getTag() == c2911) {
                    imageView.setImageDrawable(c8762.f26712);
                }
            }
        });
    }
}
