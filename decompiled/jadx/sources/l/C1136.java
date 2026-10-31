package l;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.֨۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A9CK */
/* JADX INFO: loaded from: classes2.dex */
public final class C1136 implements InvocationHandler {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C16418 f4110;

    public C1136(C16418 c16418) {
        this.f4110 = c16418;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        if (objArr == null || objArr.length <= 0 || (obj2 = objArr[0]) == null) {
            return null;
        }
        this.f4110.m38689(new C5370(obj2));
        return null;
    }
}
