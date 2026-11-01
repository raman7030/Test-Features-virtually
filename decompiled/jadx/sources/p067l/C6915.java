package p067l;

import java.lang.reflect.Type;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۙܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: O878 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6915 implements InterfaceC16992 {

    /* JADX INFO: renamed from: ᩸ */
    public final C21688 f18004;

    public C6915(C21688 c21688) {
        this.f18004 = c21688;
    }

    @Override // p067l.InterfaceC16992
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10288 mo10810(C14271 c14271, C18020 c18020) {
        Type typeM41005 = c18020.m41005();
        Class clsM41004 = c18020.m41004();
        if (!Collection.class.isAssignableFrom(clsM41004)) {
            return null;
        }
        Type typeM19061 = C8276.m19061(clsM41004, typeM41005);
        return new C21668(new C22929(c14271, c14271.m32800(C18020.m41002(typeM19061)), typeM19061), this.f18004.m48962(c18020, false));
    }
}
