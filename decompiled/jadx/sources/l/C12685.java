package l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.۫᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AXS */
/* JADX INFO: loaded from: classes3.dex */
public class C12685 {
    /* JADX INFO: renamed from: ֫ */
    public void mo29285(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        C11233.m27805(th, "cause");
        C11233.m27805(th2, "exception");
        Method method = C13390.f40014;
        if (method != null) {
            method.invoke(th, th2);
        }
    }
}
