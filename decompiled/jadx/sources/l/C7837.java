package l;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.۠֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59PE */
/* JADX INFO: loaded from: classes3.dex */
public final class C7837 extends AbstractC14892 {
    @Override // l.AbstractC14892
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2977(Field field) {
        return m35336(this.f45442.staticFieldOffset(field), this.f45442.staticFieldBase(field));
    }

    @Override // l.AbstractC14892
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo20931() {
        if (!super.mo20931()) {
            return false;
        }
        try {
            Class<?> cls = this.f45442.getClass();
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
            C21244.m48231(th);
            return false;
        }
    }

    @Override // l.AbstractC14892
    /* JADX INFO: renamed from: ۧ */
    public final byte mo2984(long j, Object obj) {
        return this.f45442.getByte(obj, j);
    }

    @Override // l.AbstractC14892
    /* JADX INFO: renamed from: ֫ */
    public final void mo2979(Object obj, long j, byte b) {
        this.f45442.putByte(obj, j, b);
    }

    @Override // l.AbstractC14892
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2983(long j, Object obj) {
        return this.f45442.getBoolean(obj, j);
    }

    @Override // l.AbstractC14892
    /* JADX INFO: renamed from: ֫ */
    public final void mo2982(Object obj, long j, boolean z) {
        this.f45442.putBoolean(obj, j, z);
    }

    @Override // l.AbstractC14892
    /* JADX INFO: renamed from: ᩳ */
    public final float mo2987(long j, Object obj) {
        return this.f45442.getFloat(obj, j);
    }

    @Override // l.AbstractC14892
    /* JADX INFO: renamed from: ֫ */
    public final void mo2981(Object obj, long j, float f) {
        this.f45442.putFloat(obj, j, f);
    }

    @Override // l.AbstractC14892
    /* JADX INFO: renamed from: ܽ */
    public final double mo2986(long j, Object obj) {
        return this.f45442.getDouble(obj, j);
    }

    @Override // l.AbstractC14892
    /* JADX INFO: renamed from: ֫ */
    public final void mo2980(Object obj, long j, double d) {
        this.f45442.putDouble(obj, j, d);
    }

    @Override // l.AbstractC14892
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo2985() {
        Unsafe unsafe = this.f45442;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (C21244.m48238() != null) {
                    try {
                        Class<?> cls3 = this.f45442.getClass();
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
                        C21244.m48231(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                C21244.m48231(th2);
                return false;
            }
        }
        return false;
    }

    @Override // l.AbstractC14892
    /* JADX INFO: renamed from: ֫ */
    public final byte mo2976(long j) {
        return this.f45442.getByte(j);
    }

    @Override // l.AbstractC14892
    /* JADX INFO: renamed from: ֫ */
    public final void mo2978(long j, byte[] bArr, long j2, long j3) {
        this.f45442.copyMemory((Object) null, j, bArr, C21244.f68465 + j2, j3);
    }
}
