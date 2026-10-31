package l;

import java.util.Map;

/* JADX INFO: renamed from: l.۠᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes4.dex */
public final class C8430 extends C5503 implements Cloneable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C8430 f25822;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C8430 f25823;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f25824;

    public C8430() {
        super(0, null);
    }

    public C8430(int i, Object obj) {
        super(i, obj);
        this.f25824 = -1073741824;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C8430 m22108() {
        if ((this.f25824 & 1073741824) != 0) {
            return null;
        }
        return this.f25823;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C8430 m22101() {
        if ((this.f25824 & Integer.MIN_VALUE) != 0) {
            return null;
        }
        return this.f25822;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m22102() {
        return (this.f25824 & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m22110() {
        return (this.f25824 & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m22106(boolean z) {
        if (z) {
            this.f25824 |= 1073741824;
        } else {
            this.f25824 &= -1073741825;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m22109(boolean z) {
        this.f25824 &= Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22098(C8430 c8430) {
        this.f25824 |= 1073741824;
        this.f25823 = c8430;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m22105(C8430 c8430) {
        this.f25824 |= Integer.MIN_VALUE;
        this.f25822 = c8430;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22103(C8430 c8430) {
        this.f25824 &= Integer.MAX_VALUE;
        this.f25822 = c8430;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m22107() {
        return (this.f25824 & 1) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22099(boolean z) {
        if (z) {
            this.f25824 |= 1;
        } else {
            this.f25824 &= -2;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C8430 m22104() {
        C8430 c8430 = this.f25822;
        if ((this.f25824 & Integer.MIN_VALUE) == 0) {
            while ((c8430.f25824 & 1073741824) == 0) {
                c8430 = c8430.f25823;
            }
        }
        return c8430;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C8430 m22100() {
        C8430 c8430 = this.f25823;
        if ((this.f25824 & 1073741824) == 0) {
            while ((c8430.f25824 & Integer.MIN_VALUE) == 0) {
                c8430 = c8430.f25822;
            }
        }
        return c8430;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f17058;
        this.f17058 = obj;
        return obj2;
    }

    public final C8430 clone() {
        try {
            C8430 c8430 = (C8430) super.clone();
            c8430.f17057 = this.f17057;
            c8430.f17058 = this.f17058;
            c8430.f25824 = this.f25824;
            return c8430;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.f17057 == ((Integer) entry.getKey()).intValue() && C11003.equals(this.f17058, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i = this.f17057;
        Object obj = this.f17058;
        return i ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return this.f17057 + "=>" + this.f17058;
    }
}
