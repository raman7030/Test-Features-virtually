package l;

/* JADX INFO: renamed from: l.᩻᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC23951 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f77666;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f77667;

    public /* synthetic */ RunnableC23951(int i, Object obj) {
        this.f77666 = i;
        this.f77667 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f77666) {
            case 0:
                ((ActivityC1748) this.f77667).finish();
                break;
            case 1:
                ((ActivityC16315) this.f77667).m38449(false);
                break;
            case 2:
                C7473.m20045((C7473) this.f77667);
                break;
            default:
                C19839.m45617((C13136) this.f77667);
                break;
        }
    }
}
