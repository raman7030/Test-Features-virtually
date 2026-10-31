package l;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: l.᩸ܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8827 */
/* JADX INFO: loaded from: classes.dex */
public class C21718 implements InterfaceC15387 {
    @Override // l.InterfaceC15387
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8333 mo8743(C12524 c12524, C16469 c16469) {
        Type componentType;
        Type typeM38779 = c16469.m38779();
        boolean z = typeM38779 instanceof GenericArrayType;
        if (!z && (!(typeM38779 instanceof Class) || !((Class) typeM38779).isArray())) {
            return null;
        }
        if (z) {
            componentType = ((GenericArrayType) typeM38779).getGenericComponentType();
        } else {
            componentType = ((Class) typeM38779).getComponentType();
        }
        return new C22423(c12524, c12524.m30728(C16469.m38776(componentType)), C6216.m17138(componentType));
    }
}
