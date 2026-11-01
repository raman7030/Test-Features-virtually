package org.lsposed.lsplant;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import p067l.InterfaceC24491;

/* JADX INFO: loaded from: classes2.dex */
public class Hooker {

    /* JADX INFO: renamed from: ܽ */
    public static Method f81810;

    /* JADX INFO: renamed from: ֫ */
    public Method f81811;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC24491 f81812;

    private native boolean check();

    private native Method doHook(Member member, Method method);

    private native boolean doUnhook(Member member);

    static {
        try {
            System.loadLibrary("hook");
            f81810 = Hooker.class.getDeclaredMethod("֫", Object[].class);
        } catch (Throwable unused) {
            f81810 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public Object m55462(Object[] objArr) {
        return this.f81812.mo6307(this.f81811, objArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m55461(Method method, InterfaceC24491 interfaceC24491) {
        Method methodDoHook;
        Method method2 = f81810;
        if (method2 == null) {
            return;
        }
        Hooker hooker = new Hooker();
        if (hooker.check() && (methodDoHook = hooker.doHook(method, method2)) != null) {
            hooker.f81811 = methodDoHook;
            hooker.f81812 = interfaceC24491;
        }
    }
}
