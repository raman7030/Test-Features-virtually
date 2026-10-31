package l;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ܶ֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59PE */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14892 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Unsafe f45442;

    /* JADX INFO: renamed from: ֫ */
    public abstract byte mo2976(long j);

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo2977(Field field);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo2978(long j, byte[] bArr, long j2, long j3);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo2979(Object obj, long j, byte b);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo2980(Object obj, long j, double d);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo2981(Object obj, long j, float f);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo2982(Object obj, long j, boolean z);

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo2983(long j, Object obj);

    /* JADX INFO: renamed from: ۧ */
    public abstract byte mo2984(long j, Object obj);

    /* JADX INFO: renamed from: ۧ */
    public abstract boolean mo2985();

    /* JADX INFO: renamed from: ܽ */
    public abstract double mo2986(long j, Object obj);

    /* JADX INFO: renamed from: ᩳ */
    public abstract float mo2987(long j, Object obj);

    public AbstractC14892(Unsafe unsafe) {
        this.f45442 = unsafe;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m35333(Field field) {
        return this.f45442.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m35328(Class cls) {
        return this.f45442.arrayBaseOffset(cls);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m35332(Class cls) {
        return this.f45442.arrayIndexScale(cls);
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo20931() {
        Unsafe unsafe = this.f45442;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            C21244.m48231(th);
            return false;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m35335(long j, Object obj) {
        return this.f45442.getInt(obj, j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35329(int i, long j, Object obj) {
        this.f45442.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m35334(long j, Object obj) {
        return this.f45442.getLong(obj, j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35331(Object obj, long j, long j2) {
        this.f45442.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Object m35336(long j, Object obj) {
        return this.f45442.getObject(obj, j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35330(long j, Object obj, Object obj2) {
        this.f45442.putObject(obj, j, obj2);
    }
}
