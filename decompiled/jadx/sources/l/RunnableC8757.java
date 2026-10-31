package l;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: l.ۡ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8GM */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC8757 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f26677;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f26678;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f26679;

    public /* synthetic */ RunnableC8757(int i, Object obj, Object obj2) {
        this.f26678 = i;
        this.f26679 = obj;
        this.f26677 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26678) {
            case 0:
                C18635.m43192((C18635) this.f26679, (Bitmap) this.f26677);
                break;
            default:
                C14169 c14169 = (C14169) this.f26679;
                C9938 c9938 = (C9938) this.f26677;
                C2735 c2735 = (C2735) c14169.f42776;
                c2735.f8521 = C2609.m8237(c9938, c2735.f8521);
                break;
        }
    }
}
