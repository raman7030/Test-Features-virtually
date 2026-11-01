package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.۠᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes4.dex */
public final class C10381 extends C7599 implements Cloneable {

    /* JADX INFO: renamed from: ۗ */
    public C10381 f28735;

    /* JADX INFO: renamed from: ۙ */
    public C10381 f28736;

    /* JADX INFO: renamed from: ᩶ */
    public int f28737;

    public C10381() {
        super(0, null);
    }

    public C10381(int i, Object obj) {
        super(i, obj);
        this.f28737 = -1073741824;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C10381 m24078() {
        if ((this.f28737 & 1073741824) != 0) {
            return null;
        }
        return this.f28736;
    }

    /* JADX INFO: renamed from: ۘ */
    public final C10381 m24071() {
        if ((this.f28737 & Integer.MIN_VALUE) != 0) {
            return null;
        }
        return this.f28735;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m24072() {
        return (this.f28737 & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final boolean m24080() {
        return (this.f28737 & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m24076(boolean z) {
        if (z) {
            this.f28737 |= 1073741824;
        } else {
            this.f28737 &= -1073741825;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m24079(boolean z) {
        this.f28737 &= Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24068(C10381 c10381) {
        this.f28737 |= 1073741824;
        this.f28736 = c10381;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m24075(C10381 c10381) {
        this.f28737 |= Integer.MIN_VALUE;
        this.f28735 = c10381;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24073(C10381 c10381) {
        this.f28737 &= Integer.MAX_VALUE;
        this.f28735 = c10381;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m24077() {
        return (this.f28737 & 1) != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24069(boolean z) {
        if (z) {
            this.f28737 |= 1;
        } else {
            this.f28737 &= -2;
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final C10381 m24074() {
        C10381 c10381 = this.f28735;
        if ((this.f28737 & Integer.MIN_VALUE) == 0) {
            while ((c10381.f28737 & 1073741824) == 0) {
                c10381 = c10381.f28736;
            }
        }
        return c10381;
    }

    /* JADX INFO: renamed from: ۖ */
    public final C10381 m24070() {
        C10381 c10381 = this.f28736;
        if ((this.f28737 & 1073741824) == 0) {
            while ((c10381.f28737 & Integer.MIN_VALUE) == 0) {
                c10381 = c10381.f28735;
            }
        }
        return c10381;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f19897;
        this.f19897 = obj;
        return obj2;
    }

    public final C10381 clone() {
        try {
            C10381 c10381 = (C10381) super.clone();
            c10381.f19896 = this.f19896;
            c10381.f19897 = this.f19897;
            c10381.f28737 = this.f28737;
            return c10381;
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
