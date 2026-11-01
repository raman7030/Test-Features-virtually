package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.ܰ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes4.dex */
public final class C15823 extends C7599 implements Cloneable {

    /* JADX INFO: renamed from: ۗ */
    public C15823 f45804;

    /* JADX INFO: renamed from: ۙ */
    public C15823 f45805;

    /* JADX INFO: renamed from: ᩶ */
    public int f45806;

    public C15823() {
        super(0, null);
    }

    public C15823(int i, Object obj) {
        super(i, obj);
        this.f45806 = -1073741824;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C15823 m35906() {
        if ((this.f45806 & 1073741824) != 0) {
            return null;
        }
        return this.f45805;
    }

    /* JADX INFO: renamed from: ۖ */
    public final C15823 m35901() {
        if ((this.f45806 & Integer.MIN_VALUE) != 0) {
            return null;
        }
        return this.f45804;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m35905() {
        return (this.f45806 & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m35902() {
        return (this.f45806 & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35900(boolean z) {
        if (z) {
            this.f45806 |= 1073741824;
        } else {
            this.f45806 &= -1073741825;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m35907(boolean z) {
        if (z) {
            this.f45806 |= Integer.MIN_VALUE;
        } else {
            this.f45806 &= Integer.MAX_VALUE;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35899(C15823 c15823) {
        this.f45806 |= 1073741824;
        this.f45805 = c15823;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m35904(C15823 c15823) {
        this.f45806 |= Integer.MIN_VALUE;
        this.f45804 = c15823;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35898(int i) {
        this.f45806 = (i & 255) | (this.f45806 & (-256));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C15823 m35908() {
        C15823 c15823 = this.f45804;
        if ((this.f45806 & Integer.MIN_VALUE) == 0) {
            while ((c15823.f45806 & 1073741824) == 0) {
                c15823 = c15823.f45805;
            }
        }
        return c15823;
    }

    /* JADX INFO: renamed from: ۜ */
    public final C15823 m35903() {
        C15823 c15823 = this.f45805;
        if ((this.f45806 & 1073741824) == 0) {
            while ((c15823.f45806 & Integer.MIN_VALUE) == 0) {
                c15823 = c15823.f45804;
            }
        }
        return c15823;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f19897;
        this.f19897 = obj;
        return obj2;
    }

    public final C15823 clone() {
        try {
            C15823 c15823 = (C15823) super.clone();
            c15823.f19896 = this.f19896;
            c15823.f19897 = this.f19897;
            c15823.f45806 = this.f45806;
            return c15823;
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
        return this.f19896 == ((Integer) entry.getKey()).intValue() && C12826.equals(this.f19897, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i = this.f19896;
        Object obj = this.f19897;
        return i ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return this.f19896 + "=>" + this.f19897;
    }
}
