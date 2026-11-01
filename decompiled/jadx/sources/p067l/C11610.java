package p067l;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۢܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U87V */
/* JADX INFO: loaded from: classes3.dex */
public final class C11610 extends AbstractC17643 {

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ Method f32420;

    public C11610(Method method) {
        this.f32420 = method;
    }

    @Override // p067l.AbstractC17643
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo25212(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.f32420.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e) {
            throw new RuntimeException("Failed invoking canAccess", e);
        }
    }
}
