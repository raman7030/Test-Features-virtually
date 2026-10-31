package l;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.۫᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A21P */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12719 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2727 f38269;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2727 f38270;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2727 f38271;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo26608();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo26609(Parcelable parcelable);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo26610(CharSequence charSequence);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo26611(String str);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo26612(boolean z);

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo26613(int i);

    /* JADX INFO: renamed from: ۜ */
    public abstract String mo26614();

    /* JADX INFO: renamed from: ۧ */
    public abstract AbstractC12719 mo26615();

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo26616(int i);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo26617(byte[] bArr);

    /* JADX INFO: renamed from: ܳ */
    public abstract int mo26618();

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo26619(int i);

    /* JADX INFO: renamed from: ܽ */
    public abstract boolean mo26620();

    /* JADX INFO: renamed from: ܿ */
    public abstract CharSequence mo26621();

    /* JADX INFO: renamed from: ᩳ */
    public abstract byte[] mo26622();

    /* JADX INFO: renamed from: ᩻ */
    public abstract Parcelable mo26623();

    public AbstractC12719(C2727 c2727, C2727 c2728, C2727 c2729) {
        this.f38270 = c2727;
        this.f38271 = c2728;
        this.f38269 = c2729;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m30995(int i, boolean z) {
        mo26616(i);
        mo26612(z);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m30999(byte[] bArr) {
        mo26616(2);
        mo26617(bArr);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m30993(int i, CharSequence charSequence) {
        mo26616(i);
        mo26610(charSequence);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m30992(int i, int i2) {
        mo26616(i2);
        mo26619(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private Method m30984(String str) throws NoSuchMethodException {
        C2727 c2727 = this.f38270;
        Method method = (Method) c2727.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC12719.class.getClassLoader()).getDeclaredMethod("read", AbstractC12719.class);
        c2727.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m30994(int i, String str) {
        mo26616(i);
        mo26611(str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m30996(Parcelable parcelable, int i) {
        mo26616(i);
        mo26609(parcelable);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30990(int i, boolean z) {
        return !mo26613(i) ? z : mo26620();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m30985(int i, int i2) {
        return !mo26613(i2) ? i : mo26618();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m30988(int i, String str) {
        return !mo26613(i) ? str : mo26614();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m30991(byte[] bArr) {
        return !mo26613(2) ? bArr : mo26622();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Parcelable m30986(Parcelable parcelable, int i) {
        return !mo26613(i) ? parcelable : mo26623();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence m30987(int i, CharSequence charSequence) {
        return !mo26613(i) ? charSequence : mo26621();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m30997(InterfaceC6369 interfaceC6369) {
        mo26616(1);
        m30998(interfaceC6369);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m30998(InterfaceC6369 interfaceC6369) {
        if (interfaceC6369 == null) {
            mo26611((String) null);
            return;
        }
        try {
            mo26611(m30982(interfaceC6369.getClass()).getName());
            AbstractC12719 abstractC12719Mo26615 = mo26615();
            try {
                m30983(interfaceC6369.getClass()).invoke(null, interfaceC6369, abstractC12719Mo26615);
                abstractC12719Mo26615.mo26608();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(interfaceC6369.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC6369 m30989(InterfaceC6369 interfaceC6369) {
        return !mo26613(1) ? interfaceC6369 : m31000();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC6369 m31000() {
        String strMo26614 = mo26614();
        if (strMo26614 == null) {
            return null;
        }
        try {
            return (InterfaceC6369) m30984(strMo26614).invoke(null, mo26615());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private Method m30983(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C2727 c2727 = this.f38271;
        Method method = (Method) c2727.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        Class clsM30982 = m30982(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM30982.getDeclaredMethod("write", cls, AbstractC12719.class);
        c2727.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Class m30982(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C2727 c2727 = this.f38269;
        Class cls2 = (Class) c2727.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c2727.put(cls.getName(), cls3);
        return cls3;
    }
}
