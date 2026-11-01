package p067l;

import android.graphics.Typeface;

/* JADX INFO: renamed from: l.᩶ۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC21380 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f67432;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f67433;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f67434;

    public /* synthetic */ RunnableC21380(int i, Object obj, Object obj2) {
        this.f67433 = i;
        this.f67434 = obj;
        this.f67432 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f67433) {
            case 0:
                C16408.m37278((C16408) this.f67434, (C18498) this.f67432);
                break;
            case 1:
                ((AbstractC1584) this.f67434).m37569((Typeface) this.f67432);
                break;
            default:
                C18285.m41630((C18285) this.f67434, (C6691) this.f67432);
                break;
        }
    }
}
