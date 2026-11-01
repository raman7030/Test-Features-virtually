package p067l;

/* JADX INFO: renamed from: l.᩶᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E23G */
/* JADX INFO: loaded from: classes4.dex */
public class C21846 {

    /* JADX INFO: renamed from: ֫ */
    public static final C1012 f68745 = new C1012();

    /* JADX INFO: renamed from: ֫ */
    public ComponentCallbacksC11117 mo44095(String str) {
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m49282(ClassLoader classLoader, String str) {
        try {
            return ComponentCallbacksC11117.class.isAssignableFrom(m49283(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static Class m49284(ClassLoader classLoader, String str) {
        try {
            return m49283(classLoader, str);
        } catch (ClassCastException e) {
            throw new C25198(C6988.m16053("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new C25198(C6988.m16053("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static Class m49283(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C1012 c1012 = f68745;
        C1012 c1013 = (C1012) c1012.getOrDefault(classLoader, null);
        if (c1013 == null) {
            c1013 = new C1012();
            c1012.put(classLoader, c1013);
        }
        Class cls = (Class) c1013.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c1013.put(str, cls2);
        return cls2;
    }
}
