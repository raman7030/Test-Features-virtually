package l;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* JADX INFO: renamed from: l.ܺᩴ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L72M */
/* JADX INFO: loaded from: classes4.dex */
public final class C16111 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m38016(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(C16111.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
