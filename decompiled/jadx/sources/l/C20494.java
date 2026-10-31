package l;

/* JADX INFO: renamed from: l.᩶᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E23G */
/* JADX INFO: loaded from: classes4.dex */
public class C20494 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C3432 f66066 = new C3432();

    /* JADX INFO: renamed from: ֫ */
    public ComponentCallbacksC9205 mo41848(String str) {
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m46959(ClassLoader classLoader, String str) {
        try {
            return ComponentCallbacksC9205.class.isAssignableFrom(m46960(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Class m46961(ClassLoader classLoader, String str) {
        try {
            return m46960(classLoader, str);
        } catch (ClassCastException e) {
            throw new C24021(C4860.m14172("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new C24021(C4860.m14172("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Class m46960(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C3432 c3432 = f66066;
        C3432 c3433 = (C3432) c3432.getOrDefault(classLoader, null);
        if (c3433 == null) {
            c3433 = new C3432();
            c3432.put(classLoader, c3433);
        }
        Class cls = (Class) c3433.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c3433.put(str, cls2);
        return cls2;
    }
}
