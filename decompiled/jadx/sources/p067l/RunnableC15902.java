package p067l;

/* JADX INFO: renamed from: l.ܳۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5MD */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC15902 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f46006;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f46007;

    public /* synthetic */ RunnableC15902(int i, Object obj) {
        this.f46006 = i;
        this.f46007 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f46006) {
            case 0:
                ((C17243) this.f46007).showDropDown();
                break;
            case 1:
                C10987.m25354((byte[]) this.f46007);
                break;
            default:
                ((C18026) this.f46007).m36360(new C21853());
                break;
        }
    }
}
