package p067l;

/* JADX INFO: renamed from: l.ۛܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47S6 */
/* JADX INFO: loaded from: classes3.dex */
public class C8256 implements InterfaceC16992 {
    @Override // p067l.InterfaceC16992
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10288 mo10810(C14271 c14271, C18020 c18020) {
        Class clsM41004 = c18020.m41004();
        if (!Enum.class.isAssignableFrom(clsM41004) || clsM41004 == Enum.class) {
            return null;
        }
        if (!clsM41004.isEnum()) {
            clsM41004 = clsM41004.getSuperclass();
        }
        return new C13621(clsM41004);
    }
}
