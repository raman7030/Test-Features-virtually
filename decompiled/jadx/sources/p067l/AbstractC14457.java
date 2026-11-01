package p067l;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.۫᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A21P */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14457 {

    /* JADX INFO: renamed from: ֫ */
    public final C0977 f41298;

    /* JADX INFO: renamed from: ۧ */
    public final C0977 f41299;

    /* JADX INFO: renamed from: ܽ */
    public final C0977 f41300;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo28647();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo28648(Parcelable parcelable);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo28649(CharSequence charSequence);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo28650(String str);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo28651(boolean z);

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo28652(int i);

    /* JADX INFO: renamed from: ۜ */
    public abstract String mo28653();

    /* JADX INFO: renamed from: ۧ */
    public abstract AbstractC14457 mo28654();

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo28655(int i);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo28656(byte[] bArr);

    /* JADX INFO: renamed from: ܳ */
    public abstract int mo28657();

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo28658(int i);

    /* JADX INFO: renamed from: ܽ */
    public abstract boolean mo28659();

    /* JADX INFO: renamed from: ܿ */
    public abstract CharSequence mo28660();

    /* JADX INFO: renamed from: ᩳ */
    public abstract byte[] mo28661();

    /* JADX INFO: renamed from: ᩻ */
    public abstract Parcelable mo28662();

    public AbstractC14457(C0977 c0977, C0977 c0978, C0977 c0979) {
        this.f41299 = c0977;
        this.f41300 = c0978;
        this.f41298 = c0979;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m33075(int i, boolean z) {
        mo28655(i);
        mo28651(z);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m33079(byte[] bArr) {
        mo28655(2);
        mo28656(bArr);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m33073(int i, CharSequence charSequence) {
        mo28655(i);
        mo28649(charSequence);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m33072(int i, int i2) {
        mo28655(i2);
        mo28658(i);
    }

    /* JADX INFO: renamed from: ۧ */
    private Method m33064(String str) throws NoSuchMethodException {
        C0977 c0977 = this.f41299;
        Method method = (Method) c0977.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC14457.class.getClassLoader()).getDeclaredMethod("read", AbstractC14457.class);
        c0977.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m33074(int i, String str) {
        mo28655(i);
        mo28650(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m33076(Parcelable parcelable, int i) {
        mo28655(i);
        mo28648(parcelable);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m33070(int i, boolean z) {
        return !mo28652(i) ? z : mo28659();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m33065(int i, int i2) {
        return !mo28652(i2) ? i : mo28657();
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m33068(int i, String str) {
        return !mo28652(i) ? str : mo28653();
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m33071(byte[] bArr) {
        return !mo28652(2) ? bArr : mo28661();
    }

    /* JADX INFO: renamed from: ֫ */
    public final Parcelable m33066(Parcelable parcelable, int i) {
        return !mo28652(i) ? parcelable : mo28662();
    }

    /* JADX INFO: renamed from: ֫ */
    public final CharSequence m33067(int i, CharSequence charSequence) {
        return !mo28652(i) ? charSequence : mo28660();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m33077(InterfaceC8422 interfaceC8422) {
        mo28655(1);
        m33078(interfaceC8422);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m33078(InterfaceC8422 interfaceC8422) {
        if (interfaceC8422 == null) {
            mo28650((String) null);
            return;
        }
        try {
            mo28650(m33062(interfaceC8422.getClass()).getName());
            AbstractC14457 abstractC14457Mo28654 = mo28654();
            try {
                m33063(interfaceC8422.getClass()).invoke(null, interfaceC8422, abstractC14457Mo28654);
                abstractC14457Mo28654.mo28647();
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
            throw new RuntimeException(interfaceC8422.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC8422 m33069(InterfaceC8422 interfaceC8422) {
        return !mo28652(1) ? interfaceC8422 : m33080();
    }

    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC8422 m33080() {
        String strMo28653 = mo28653();
        if (strMo28653 == null) {
            return null;
        }
        try {
            return (InterfaceC8422) m33064(strMo28653).invoke(null, mo28654());
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
    /* JADX INFO: renamed from: ۧ */
    private Method m33063(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C0977 c0977 = this.f41300;
        Method method = (Method) c0977.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        Class clsM33062 = m33062(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM33062.getDeclaredMethod("write", cls, AbstractC14457.class);
        c0977.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: ֫ */
    private Class m33062(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C0977 c0977 = this.f41298;
        Class cls2 = (Class) c0977.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0977.put(cls.getName(), cls3);
        return cls3;
    }
}
