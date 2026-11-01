package p067l;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 11AO */
/* JADX INFO: loaded from: classes3.dex */
public final class C13045 {
    /* JADX INFO: renamed from: ᩳ */
    public static String m29868(Object obj, String str) {
        return str + obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29861(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        m29863((RuntimeException) nullPointerException, C13045.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29862(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        m29863((RuntimeException) nullPointerException, C13045.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m29866(String str) {
        C3321 c3321 = new C3321(C6988.m16053("lateinit property ", str, " has not been initialized"));
        m29863((RuntimeException) c3321, C13045.class.getName());
        throw c3321;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m29865(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        m29863((RuntimeException) nullPointerException, C13045.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29860(View view) {
        if (view != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(m29859("view"));
        m29863((RuntimeException) illegalArgumentException, C13045.class.getName());
        throw illegalArgumentException;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m29867(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(m29859(str));
        m29863((RuntimeException) nullPointerException, C13045.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m29859(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = C13045.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        StringBuilder sbM12525 = C5633.m12525("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        sbM12525.append(str);
        return sbM12525.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m29864(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29863(RuntimeException runtimeException, String str) {
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
