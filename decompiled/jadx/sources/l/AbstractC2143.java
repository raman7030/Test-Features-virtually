package l;

/* JADX INFO: renamed from: l.֫᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7W7 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2143 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f7110;

    public /* synthetic */ AbstractC2143(int i) {
        this.f7110 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract int mo7070(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract AbstractC7483 mo7071(String str);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo7072(InterfaceC3458 interfaceC3458, C12422 c12422);

    public String toString() {
        switch (this.f7110) {
            case 0:
                return getClass().getSimpleName();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC19475 m7069(C12918 c12918, int i, int i2) {
        switch (i) {
            case 0:
                return new C13143(c12918, i2);
            case 1:
                return new C12438(c12918, i2);
            case 2:
                return c12918.m31413(i2);
            case 3:
                return c12918.m31409(i2);
            case 4:
                return new C20200(c12918, i2);
            case 5:
                return new C8205(c12918, i2);
            case 6:
                return new C21611(c12918, i2);
            default:
                throw new C15431(null, "Invalid reference type: %d", Integer.valueOf(i));
        }
    }
}
