package l;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 11AO */
/* JADX INFO: loaded from: classes3.dex */
public final class C11233 {
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m27806(Object obj, String str) {
        return str + obj;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27799(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        m27801((RuntimeException) nullPointerException, C11233.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27800(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        m27801((RuntimeException) nullPointerException, C11233.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m27804(String str) {
        C1002 c1002 = new C1002(C4860.m14172("lateinit property ", str, " has not been initialized"));
        m27801((RuntimeException) c1002, C11233.class.getName());
        throw c1002;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m27803(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        m27801((RuntimeException) nullPointerException, C11233.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27798(View view) {
        if (view != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(m27797("view"));
        m27801((RuntimeException) illegalArgumentException, C11233.class.getName());
        throw illegalArgumentException;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m27805(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(m27797(str));
        m27801((RuntimeException) nullPointerException, C11233.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m27797(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = C11233.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        StringBuilder sbM10501 = C3435.m10501("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        sbM10501.append(str);
        return sbM10501.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m27802(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27801(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }
}
