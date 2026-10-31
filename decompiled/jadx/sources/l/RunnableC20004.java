package l;

import android.graphics.Typeface;

/* JADX INFO: renamed from: l.᩶ۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC20004 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f64790;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f64791;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f64792;

    public /* synthetic */ RunnableC20004(int i, Object obj, Object obj2) {
        this.f64791 = i;
        this.f64792 = obj;
        this.f64790 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f64791) {
            case 0:
                C14772.m35131((C14772) this.f64792, (C16971) this.f64790);
                break;
            case 1:
                ((AbstractC14951) this.f64792).m35417((Typeface) this.f64790);
                break;
            default:
                C16747.m39394((C16747) this.f64792, (C4548) this.f64790);
                break;
        }
    }
}
