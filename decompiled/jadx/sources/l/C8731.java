package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۡ۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes4.dex */
public final class C8731 extends C17381 implements Cloneable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C8731 f26576;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C8731 f26577;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f26578;

    public C8731() {
        super((char) 0, null);
    }

    public C8731(char c, Object obj) {
        super(c, obj);
        this.f26578 = -1073741824;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C8731 m22569() {
        if ((this.f26578 & 1073741824) != 0) {
            return null;
        }
        return this.f26577;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C8731 m22564() {
        if ((this.f26578 & Integer.MIN_VALUE) != 0) {
            return null;
        }
        return this.f26576;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m22568() {
        return (this.f26578 & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m22565() {
        return (this.f26578 & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22563(boolean z) {
        if (z) {
            this.f26578 |= 1073741824;
        } else {
            this.f26578 &= -1073741825;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m22570(boolean z) {
        if (z) {
            this.f26578 |= Integer.MIN_VALUE;
        } else {
            this.f26578 &= Integer.MAX_VALUE;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22562(C8731 c8731) {
        this.f26578 |= 1073741824;
        this.f26577 = c8731;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22567(C8731 c8731) {
        this.f26578 |= Integer.MIN_VALUE;
        this.f26576 = c8731;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22561(int i) {
        this.f26578 = (i & 255) | (this.f26578 & (-256));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C8731 m22571() {
        C8731 c8731 = this.f26576;
        if ((this.f26578 & Integer.MIN_VALUE) == 0) {
            while ((c8731.f26578 & 1073741824) == 0) {
                c8731 = c8731.f26577;
            }
        }
        return c8731;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C8731 m22566() {
        C8731 c8731 = this.f26577;
        if ((this.f26578 & 1073741824) == 0) {
            while ((c8731.f26578 & Integer.MIN_VALUE) == 0) {
                c8731 = c8731.f26576;
            }
        }
        return c8731;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f53202;
        this.f53202 = obj;
        return obj2;
    }

    public final C8731 clone() {
        try {
            C8731 c8731 = (C8731) super.clone();
            c8731.f53201 = this.f53201;
            c8731.f53202 = this.f53202;
            c8731.f26578 = this.f26578;
            return c8731;
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
        return this.f53201 == ((Character) entry.getKey()).charValue() && C11003.equals(this.f53202, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        char c = this.f53201;
        Object obj = this.f53202;
        return c ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return this.f53201 + "=>" + this.f53202;
    }
}
