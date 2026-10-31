package l;

/* JADX INFO: renamed from: l.ۧ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC11222 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f33660;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f33661;

    public /* synthetic */ RunnableC11222(int i, Object obj) {
        this.f33660 = i;
        this.f33661 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f33660;
        Object obj = this.f33661;
        switch (i) {
            case 0:
                C21100.m48034(((C11197) obj).f33614);
                break;
            default:
                C15807 c15807 = (C15807) obj;
                int i2 = ActivityC10227.f30722;
                if (c15807 != null) {
                    c15807.close();
                }
                break;
        }
    }
}
