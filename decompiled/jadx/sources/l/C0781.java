package l;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.֨֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59PE */
/* JADX INFO: loaded from: classes2.dex */
public final class C0781 extends AbstractC14892 {
    @Override // l.AbstractC14892
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo2985() {
        return false;
    }

    @Override // l.AbstractC14892
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo2977(Field field) {
        try {
            return field.get(null);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    @Override // l.AbstractC14892
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte mo2984(long j, Object obj) {
        if (C21244.f68468) {
            return C21244.m48217(j, obj);
        }
        return C21244.m48235(j, obj);
    }

    @Override // l.AbstractC14892
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2979(Object obj, long j, byte b) {
        if (C21244.f68468) {
            C21244.m48244(obj, j, b);
        } else {
            C21244.m48249(obj, j, b);
        }
    }

    @Override // l.AbstractC14892
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo2983(long j, Object obj) {
        if (C21244.f68468) {
            return C21244.m48246(j, obj);
        }
        return C21244.m48251(j, obj);
    }

    @Override // l.AbstractC14892
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2982(Object obj, long j, boolean z) {
        if (C21244.f68468) {
            C21244.m48230(obj, j, z);
        } else {
            C21244.m48240(obj, j, z);
        }
    }

    @Override // l.AbstractC14892
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float mo2987(long j, Object obj) {
        return Float.intBitsToFloat(m35335(j, obj));
    }

    @Override // l.AbstractC14892
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2981(Object obj, long j, float f) {
        m35329(Float.floatToIntBits(f), j, obj);
    }

    @Override // l.AbstractC14892
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final double mo2986(long j, Object obj) {
        return Double.longBitsToDouble(m35334(j, obj));
    }

    @Override // l.AbstractC14892
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2980(Object obj, long j, double d) {
        m35331(obj, j, Double.doubleToLongBits(d));
    }

    @Override // l.AbstractC14892
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte mo2976(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC14892
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2978(long j, byte[] bArr, long j2, long j3) {
        throw new UnsupportedOperationException();
    }
}
