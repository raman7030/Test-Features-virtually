package l;

/* JADX INFO: renamed from: l.ۡۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC8700 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f26489;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f26490;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f26491;

    public /* synthetic */ RunnableC8700(int i, Object obj, Object obj2) {
        this.f26490 = i;
        this.f26491 = obj;
        this.f26489 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26490) {
            case 0:
                C12392.m30139((C12392) this.f26491, (C5753) this.f26489);
                break;
            default:
                C6458.m17843((C6458) this.f26491, (C17041) this.f26489);
                break;
        }
    }
}
