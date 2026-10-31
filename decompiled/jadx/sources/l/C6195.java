package l;

/* JADX INFO: renamed from: l.ۛܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47S6 */
/* JADX INFO: loaded from: classes3.dex */
public class C6195 implements InterfaceC15387 {
    @Override // l.InterfaceC15387
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8333 mo8743(C12524 c12524, C16469 c16469) {
        Class clsM38778 = c16469.m38778();
        if (!Enum.class.isAssignableFrom(clsM38778) || clsM38778 == Enum.class) {
            return null;
        }
        if (!clsM38778.isEnum()) {
            clsM38778 = clsM38778.getSuperclass();
        }
        return new C11840(clsM38778);
    }
}
