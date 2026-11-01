package p067l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.۫᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AXS */
/* JADX INFO: loaded from: classes3.dex */
public class C14425 {
    /* JADX INFO: renamed from: ֫ */
    public void mo31340(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        C13045.m29867(th, "cause");
        C13045.m29867(th2, "exception");
        Method method = C15095.f43085;
        if (method != null) {
            method.invoke(th, th2);
        }
    }
}
