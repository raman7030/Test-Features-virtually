package l;

/* JADX INFO: renamed from: l.᩺ۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC22934 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f73913;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f73914;

    public /* synthetic */ RunnableC22934(int i, Object obj) {
        this.f73913 = i;
        this.f73914 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f73913) {
            case 0:
                C12392.m30261((C12392) this.f73914);
                break;
            case 1:
                ((ActivityC23809) this.f73914).invalidateOptionsMenu();
                break;
            case 2:
                ((C2937) this.f73914).mo4385();
                break;
            default:
                ((C13136) this.f73914).m31857();
                break;
        }
    }
}
