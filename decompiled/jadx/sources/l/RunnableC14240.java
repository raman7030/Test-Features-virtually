package l;

/* JADX INFO: renamed from: l.ܳۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5MD */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC14240 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f42914;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f42915;

    public /* synthetic */ RunnableC14240(int i, Object obj) {
        this.f42914 = i;
        this.f42915 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42914) {
            case 0:
                ((C15651) this.f42915).showDropDown();
                break;
            case 1:
                C9068.m23408((byte[]) this.f42915);
                break;
            default:
                ((C16475) this.f42915).m34227(new C20501());
                break;
        }
    }
}
