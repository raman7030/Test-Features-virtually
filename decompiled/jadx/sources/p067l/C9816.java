package p067l;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.۠֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59PE */
/* JADX INFO: loaded from: classes3.dex */
public final class C9816 extends AbstractC16521 {
    @Override // p067l.AbstractC16521
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5306(Field field) {
        return m37488(this.f48557.staticFieldOffset(field), this.f48557.staticFieldBase(field));
    }

    @Override // p067l.AbstractC16521
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22896() {
        if (!super.mo22896()) {
            return false;
        }
        try {
            Class<?> cls = this.f48557.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            C22558.m50562(th);
            return false;
        }
    }

    @Override // p067l.AbstractC16521
    /* JADX INFO: renamed from: ۧ */
    public final byte mo5313(long j, Object obj) {
        return this.f48557.getByte(obj, j);
    }

    @Override // p067l.AbstractC16521
    /* JADX INFO: renamed from: ֫ */
    public final void mo5308(Object obj, long j, byte b) {
        this.f48557.putByte(obj, j, b);
    }

    @Override // p067l.AbstractC16521
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5312(long j, Object obj) {
        return this.f48557.getBoolean(obj, j);
    }

    @Override // p067l.AbstractC16521
    /* JADX INFO: renamed from: ֫ */
    public final void mo5311(Object obj, long j, boolean z) {
        this.f48557.putBoolean(obj, j, z);
    }

    @Override // p067l.AbstractC16521
    /* JADX INFO: renamed from: ᩳ */
    public final float mo5316(long j, Object obj) {
        return this.f48557.getFloat(obj, j);
    }

    @Override // p067l.AbstractC16521
    /* JADX INFO: renamed from: ֫ */
    public final void mo5310(Object obj, long j, float f) {
        this.f48557.putFloat(obj, j, f);
    }

    @Override // p067l.AbstractC16521
    /* JADX INFO: renamed from: ܽ */
    public final double mo5315(long j, Object obj) {
        return this.f48557.getDouble(obj, j);
    }

    @Override // p067l.AbstractC16521
    /* JADX INFO: renamed from: ֫ */
    public final void mo5309(Object obj, long j, double d) {
        this.f48557.putDouble(obj, j, d);
    }

    @Override // p067l.AbstractC16521
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo5314() {
        Unsafe unsafe = this.f48557;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (C22558.m50569() != null) {
                    try {
                        Class<?> cls3 = this.f48557.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        C22558.m50562(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                C22558.m50562(th2);
                return false;
            }
        }
        return false;
    }

    @Override // p067l.AbstractC16521
    /* JADX INFO: renamed from: ֫ */
    public final byte mo5305(long j) {
        return this.f48557.getByte(j);
    }

    @Override // p067l.AbstractC16521
    /* JADX INFO: renamed from: ֫ */
    public final void mo5307(long j, byte[] bArr, long j2, long j3) {
        this.f48557.copyMemory((Object) null, j, bArr, C22558.f71147 + j2, j3);
    }
}
