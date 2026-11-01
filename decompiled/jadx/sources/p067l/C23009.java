package p067l;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: l.᩸ܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8827 */
/* JADX INFO: loaded from: classes.dex */
public class C23009 implements InterfaceC16992 {
    @Override // p067l.InterfaceC16992
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10288 mo10810(C14271 c14271, C18020 c18020) {
        Type componentType;
        Type typeM41005 = c18020.m41005();
        boolean z = typeM41005 instanceof GenericArrayType;
        if (!z && (!(typeM41005 instanceof Class) || !((Class) typeM41005).isArray())) {
            return null;
        }
        if (z) {
            componentType = ((GenericArrayType) typeM41005).getGenericComponentType();
        } else {
            componentType = ((Class) typeM41005).getComponentType();
        }
        return new C23679(c14271, c14271.m32800(C18020.m41002(componentType)), C8276.m19070(componentType));
    }
}
