package p067l;

/* JADX INFO: renamed from: l.֫᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7W7 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4406 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ int f9896;

    public /* synthetic */ AbstractC4406(int i) {
        this.f9896 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo9165(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC9480 mo9166(String str);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo9167(InterfaceC5655 interfaceC5655, C14174 c14174);

    public String toString() {
        switch (this.f9896) {
            case 0:
                return getClass().getSimpleName();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC20877 m9164(C14645 c14645, int i, int i2) {
        switch (i) {
            case 0:
                return new C14859(c14645, i2);
            case 1:
                return new C14189(c14645, i2);
            case 2:
                return c14645.m33499(i2);
            case 3:
                return c14645.m33495(i2);
            case 4:
                return new C21566(c14645, i2);
            case 5:
                return new C10166(c14645, i2);
            case 6:
                return new C22907(c14645, i2);
            default:
                throw new C17034(null, "Invalid reference type: %d", Integer.valueOf(i));
        }
    }
}
