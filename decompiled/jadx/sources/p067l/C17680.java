package p067l;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* JADX INFO: renamed from: l.ܺᩴ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L72M */
/* JADX INFO: loaded from: classes4.dex */
public final class C17680 {
    /* JADX INFO: renamed from: ֫ */
    public static Object m40207(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(C17680.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
