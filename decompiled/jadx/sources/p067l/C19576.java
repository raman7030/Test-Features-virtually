package p067l;

import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩳܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q886 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19576 implements InterfaceC16992 {

    /* JADX INFO: renamed from: ᩸ */
    public final C21688 f59574;

    public C19576(C21688 c21688) {
        this.f59574 = c21688;
    }

    @Override // p067l.InterfaceC16992
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10288 mo10810(C14271 c14271, C18020 c18020) {
        AbstractC10288 abstractC10288M32800;
        Type typeM41005 = c18020.m41005();
        Class clsM41004 = c18020.m41004();
        if (!Map.class.isAssignableFrom(clsM41004)) {
            return null;
        }
        Type[] typeArrM19069 = C8276.m19069(clsM41004, typeM41005);
        Type type = typeArrM19069[0];
        Type type2 = typeArrM19069[1];
        if (type == Boolean.TYPE || type == Boolean.class) {
            abstractC10288M32800 = C23188.f72863;
        } else {
            abstractC10288M32800 = c14271.m32800(C18020.m41002(type));
        }
        return new C18234(this, new C22929(c14271, abstractC10288M32800, type), new C22929(c14271, c14271.m32800(C18020.m41002(type2)), type2), this.f59574.m48962(c18020, false));
    }
}
