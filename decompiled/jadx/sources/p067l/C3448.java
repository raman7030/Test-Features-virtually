package p067l;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.֨۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A9CK */
/* JADX INFO: loaded from: classes2.dex */
public final class C3448 implements InvocationHandler {

    /* JADX INFO: renamed from: ᩸ */
    public final C17972 f6879;

    public C3448(C17972 c17972) {
        this.f6879 = c17972;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        if (objArr == null || objArr.length <= 0 || (obj2 = objArr[0]) == null) {
            return null;
        }
        this.f6879.m40906(new C7472(obj2));
        return null;
    }
}
