package p067l;

/* JADX INFO: renamed from: l.ۢܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5UB */
/* JADX INFO: loaded from: classes4.dex */
public class C11612 implements InterfaceC18987, InterfaceC24331 {

    /* JADX INFO: renamed from: ᩸ */
    public final float f32425;

    @Override // p067l.InterfaceC12262
    /* JADX INFO: renamed from: ۖ */
    public final int mo4670() {
        return 16;
    }

    public C11612(float f) {
        this.f32425 = f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC12262 interfaceC12262 = (InterfaceC12262) obj;
        int iCompare = Integer.compare(16, interfaceC12262.mo4670());
        if (iCompare != 0) {
            return iCompare;
        }
        return Float.compare(this.f32425, ((InterfaceC24331) interfaceC12262).getValue());
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof InterfaceC24331) && Float.floatToRawIntBits(this.f32425) == Float.floatToRawIntBits(((InterfaceC24331) obj).getValue());
    }

    @Override // p067l.InterfaceC24331
    public final float getValue() {
        return this.f32425;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f32425);
    }
}
