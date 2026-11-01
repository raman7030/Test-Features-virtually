package p067l;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ܶ֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59PE */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16521 {

    /* JADX INFO: renamed from: ֫ */
    public Unsafe f48557;

    /* JADX INFO: renamed from: ֫ */
    public abstract byte mo5305(long j);

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo5306(Field field);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo5307(long j, byte[] bArr, long j2, long j3);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo5308(Object obj, long j, byte b);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo5309(Object obj, long j, double d);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo5310(Object obj, long j, float f);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo5311(Object obj, long j, boolean z);

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo5312(long j, Object obj);

    /* JADX INFO: renamed from: ۧ */
    public abstract byte mo5313(long j, Object obj);

    /* JADX INFO: renamed from: ۧ */
    public abstract boolean mo5314();

    /* JADX INFO: renamed from: ܽ */
    public abstract double mo5315(long j, Object obj);

    /* JADX INFO: renamed from: ᩳ */
    public abstract float mo5316(long j, Object obj);

    public AbstractC16521(Unsafe unsafe) {
        this.f48557 = unsafe;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m37485(Field field) {
        return this.f48557.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m37480(Class cls) {
        return this.f48557.arrayBaseOffset(cls);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m37484(Class cls) {
        return this.f48557.arrayIndexScale(cls);
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo22896() {
        Unsafe unsafe = this.f48557;
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
            C22558.m50562(th);
            return false;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m37487(long j, Object obj) {
        return this.f48557.getInt(obj, j);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37481(int i, long j, Object obj) {
        this.f48557.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: ܳ */
    public final long m37486(long j, Object obj) {
        return this.f48557.getLong(obj, j);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37483(Object obj, long j, long j2) {
        this.f48557.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final Object m37488(long j, Object obj) {
        return this.f48557.getObject(obj, j);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37482(long j, Object obj, Object obj2) {
        this.f48557.putObject(obj, j, obj2);
    }
}
