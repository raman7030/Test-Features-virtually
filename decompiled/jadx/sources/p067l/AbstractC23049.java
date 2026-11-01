package p067l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩸ᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9PY */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC23049 extends AbstractC5951 {

    /* JADX INFO: renamed from: ᩶ */
    public static ConcurrentMapC12768 f72435 = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: ᩸ */
    public int f72436 = -1;

    /* JADX INFO: renamed from: ᩹ */
    public C10487 f72437 = C10487.m24203();

    /* JADX INFO: renamed from: ֫ */
    public abstract Object m51429();

    /* JADX INFO: renamed from: ۧ */
    public final boolean m51430() {
        return (this.f72436 & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m51431() {
        this.f72436 &= Integer.MAX_VALUE;
    }

    @Override // p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        EnumC10308 enumC10308 = EnumC10308.GET_MEMOIZED_IS_INITIALIZED;
        return (InterfaceC13820) m51429();
    }

    @Override // p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public InterfaceC10467 getDefaultInstanceForType() {
        EnumC10308 enumC10308 = EnumC10308.GET_MEMOIZED_IS_INITIALIZED;
        return (AbstractC23049) m51429();
    }

    @Override // p067l.InterfaceC10467
    public InterfaceC11138 newBuilderForType() {
        EnumC10308 enumC10308 = EnumC10308.GET_MEMOIZED_IS_INITIALIZED;
        return (AbstractC21038) m51429();
    }

    public final String toString() {
        return C4432.m9264(this, super.toString());
    }

    public final int hashCode() {
        if (m51430()) {
            C13150 c13150M30098 = C13150.m30098();
            c13150M30098.getClass();
            return c13150M30098.m30099(getClass()).mo26206(this);
        }
        if (this.memoizedHashCode == 0) {
            C13150 c13150M30099 = C13150.m30098();
            c13150M30099.getClass();
            this.memoizedHashCode = c13150M30099.m30099(getClass()).mo26206(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C13150 c13150M30098 = C13150.m30098();
        c13150M30098.getClass();
        return c13150M30098.m30099(getClass()).mo26212(this, (AbstractC23049) obj);
    }

    @Override // p067l.InterfaceC10467
    public final AbstractC21038 toBuilder() {
        EnumC10308 enumC10308 = EnumC10308.GET_MEMOIZED_IS_INITIALIZED;
        ((AbstractC21038) m51429()).getClass();
        throw null;
    }

    @Override // p067l.AbstractC5951
    public final int getMemoizedSerializedSize() {
        return this.f72436 & Integer.MAX_VALUE;
    }

    @Override // p067l.AbstractC5951
    public final void setMemoizedSerializedSize(int i) {
        if (i < 0) {
            throw new IllegalStateException(C20778.m46922(i, "serialized size must be non-negative, was "));
        }
        this.f72436 = (i & Integer.MAX_VALUE) | (this.f72436 & Integer.MIN_VALUE);
    }

    @Override // p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        C13150 c13150M30098 = C13150.m30098();
        c13150M30098.getClass();
        c13150M30098.m30099(getClass()).mo26210((Object) this, (InterfaceC8672) C25120.m55133(abstractC16402));
    }

    @Override // p067l.AbstractC5951
    public final int getSerializedSize(InterfaceC11277 interfaceC11277) {
        int iMo26205;
        int iMo26206;
        if (m51430()) {
            if (interfaceC11277 == null) {
                C13150 c13150M30098 = C13150.m30098();
                c13150M30098.getClass();
                iMo26206 = c13150M30098.m30099(getClass()).mo26205((AbstractC5951) this);
            } else {
                iMo26206 = interfaceC11277.mo26205((AbstractC5951) this);
            }
            if (iMo26206 >= 0) {
                return iMo26206;
            }
            throw new IllegalStateException(C20778.m46922(iMo26206, "serialized size must be non-negative, was "));
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        if (interfaceC11277 == null) {
            C13150 c13150M30099 = C13150.m30098();
            c13150M30099.getClass();
            iMo26205 = c13150M30099.m30099(getClass()).mo26205((AbstractC5951) this);
        } else {
            iMo26205 = interfaceC11277.mo26205((AbstractC5951) this);
        }
        setMemoizedSerializedSize(iMo26205);
        return iMo26205;
    }

    @Override // p067l.InterfaceC10467
    public final int getSerializedSize() {
        return getSerializedSize(null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC23049 m51428(Class cls) {
        ConcurrentMapC12768 concurrentMapC12768 = f72435;
        AbstractC23049 abstractC23049 = (AbstractC23049) concurrentMapC12768.get(cls);
        if (abstractC23049 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC23049 = (AbstractC23049) concurrentMapC12768.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC23049 != null) {
            return abstractC23049;
        }
        AbstractC23049 abstractC230410 = (AbstractC23049) C22558.m50551(cls);
        abstractC230410.getClass();
        EnumC10308 enumC10308 = EnumC10308.GET_MEMOIZED_IS_INITIALIZED;
        AbstractC23049 abstractC230411 = (AbstractC23049) abstractC230410.m51429();
        if (abstractC230411 == null) {
            throw new IllegalStateException();
        }
        concurrentMapC12768.put(cls, abstractC230411);
        return abstractC230411;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m51427(Method method, AbstractC23049 abstractC23049, Object... objArr) {
        try {
            return method.invoke(abstractC23049, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    @Override // p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        EnumC10308 enumC10308 = EnumC10308.GET_MEMOIZED_IS_INITIALIZED;
        byte bByteValue = ((Byte) m51429()).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C13150 c13150M30098 = C13150.m30098();
        c13150M30098.getClass();
        boolean zMo26213 = c13150M30098.m30099(getClass()).mo26213(this);
        m51429();
        return zMo26213;
    }
}
