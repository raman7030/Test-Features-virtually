package p067l;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ۚ֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59PE */
/* JADX INFO: loaded from: classes3.dex */
public final class C7134 extends AbstractC16521 {
    @Override // p067l.AbstractC16521
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo5314() {
        return false;
    }

    @Override // p067l.AbstractC16521
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5306(Field field) {
        try {
            return field.get(null);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    @Override // p067l.AbstractC16521
    /* JADX INFO: renamed from: ۧ */
    public final byte mo5313(long j, Object obj) {
        if (C22558.f71150) {
            return C22558.m50548(j, obj);
        }
        return C22558.m50566(j, obj);
    }

    @Override // p067l.AbstractC16521
    /* JADX INFO: renamed from: ֫ */
    public final void mo5308(Object obj, long j, byte b) {
        if (C22558.f71150) {
            C22558.m50575(obj, j, b);
        } else {
            C22558.m50580(obj, j, b);
        }
    }

    @Override // p067l.AbstractC16521
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5312(long j, Object obj) {
        if (C22558.f71150) {
            return C22558.m50577(j, obj);
        }
        return C22558.m50582(j, obj);
    }

    @Override // p067l.AbstractC16521
    /* JADX INFO: renamed from: ֫ */
    public final void mo5311(Object obj, long j, boolean z) {
        if (C22558.f71150) {
            C22558.m50561(obj, j, z);
        } else {
            C22558.m50571(obj, j, z);
        }
    }

    @Override // p067l.AbstractC16521
    /* JADX INFO: renamed from: ᩳ */
    public final float mo5316(long j, Object obj) {
        return Float.intBitsToFloat(m37487(j, obj));
    }

    @Override // p067l.AbstractC16521
    /* JADX INFO: renamed from: ֫ */
    public final void mo5310(Object obj, long j, float f) {
        m37481(Float.floatToIntBits(f), j, obj);
    }

    @Override // p067l.AbstractC16521
    /* JADX INFO: renamed from: ܽ */
    public final double mo5315(long j, Object obj) {
        return Double.longBitsToDouble(m37486(j, obj));
    }

    @Override // p067l.AbstractC16521
    /* JADX INFO: renamed from: ֫ */
    public final void mo5309(Object obj, long j, double d) {
        m37483(obj, j, Double.doubleToLongBits(d));
    }

    @Override // p067l.AbstractC16521
    /* JADX INFO: renamed from: ֫ */
    public final byte mo5305(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC16521
    /* JADX INFO: renamed from: ֫ */
    public final void mo5307(long j, byte[] bArr, long j2, long j3) {
        throw new UnsupportedOperationException();
    }
}
