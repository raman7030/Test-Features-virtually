package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ܰ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes4.dex */
public final class C14156 extends C5503 implements Cloneable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C14156 f42715;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C14156 f42716;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f42717;

    public C14156() {
        super(0, null);
    }

    public C14156(int i, Object obj) {
        super(i, obj);
        this.f42717 = -1073741824;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14156 m33773() {
        if ((this.f42717 & 1073741824) != 0) {
            return null;
        }
        return this.f42716;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C14156 m33768() {
        if ((this.f42717 & Integer.MIN_VALUE) != 0) {
            return null;
        }
        return this.f42715;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m33772() {
        return (this.f42717 & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m33769() {
        return (this.f42717 & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33767(boolean z) {
        if (z) {
            this.f42717 |= 1073741824;
        } else {
            this.f42717 &= -1073741825;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m33774(boolean z) {
        if (z) {
            this.f42717 |= Integer.MIN_VALUE;
        } else {
            this.f42717 &= Integer.MAX_VALUE;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33766(C14156 c14156) {
        this.f42717 |= 1073741824;
        this.f42716 = c14156;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m33771(C14156 c14156) {
        this.f42717 |= Integer.MIN_VALUE;
        this.f42715 = c14156;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33765(int i) {
        this.f42717 = (i & 255) | (this.f42717 & (-256));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C14156 m33775() {
        C14156 c14156 = this.f42715;
        if ((this.f42717 & Integer.MIN_VALUE) == 0) {
            while ((c14156.f42717 & 1073741824) == 0) {
                c14156 = c14156.f42716;
            }
        }
        return c14156;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C14156 m33770() {
        C14156 c14156 = this.f42716;
        if ((this.f42717 & 1073741824) == 0) {
            while ((c14156.f42717 & Integer.MIN_VALUE) == 0) {
                c14156 = c14156.f42715;
            }
        }
        return c14156;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f17058;
        this.f17058 = obj;
        return obj2;
    }

    public final C14156 clone() {
        try {
            C14156 c14156 = (C14156) super.clone();
            c14156.f17057 = this.f17057;
            c14156.f17058 = this.f17058;
            c14156.f42717 = this.f42717;
            return c14156;
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
