package l;

/* JADX INFO: renamed from: l.ᩴۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC18678 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f59033;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f59034;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f59035;

    public /* synthetic */ RunnableC18678(int i, int i2, Object obj) {
        this.f59034 = i2;
        this.f59035 = obj;
        this.f59033 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f59034) {
            case 0:
                C12327.m29901((C12327) this.f59035, this.f59033);
                break;
            default:
                ((C2664) this.f59035).setItemChecked(this.f59033, true);
                break;
        }
    }
}
