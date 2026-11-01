package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۡ۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes4.dex */
public final class C10666 extends C18887 implements Cloneable {

    /* JADX INFO: renamed from: ۗ */
    public C10666 f29501;

    /* JADX INFO: renamed from: ۙ */
    public C10666 f29502;

    /* JADX INFO: renamed from: ᩶ */
    public int f29503;

    public C10666() {
        super((char) 0, null);
    }

    public C10666(char c, Object obj) {
        super(c, obj);
        this.f29503 = -1073741824;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C10666 m24539() {
        if ((this.f29503 & 1073741824) != 0) {
            return null;
        }
        return this.f29502;
    }

    /* JADX INFO: renamed from: ۖ */
    public final C10666 m24534() {
        if ((this.f29503 & Integer.MIN_VALUE) != 0) {
            return null;
        }
        return this.f29501;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m24538() {
        return (this.f29503 & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m24535() {
        return (this.f29503 & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24533(boolean z) {
        if (z) {
            this.f29503 |= 1073741824;
        } else {
            this.f29503 &= -1073741825;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m24540(boolean z) {
        if (z) {
            this.f29503 |= Integer.MIN_VALUE;
        } else {
            this.f29503 &= Integer.MAX_VALUE;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24532(C10666 c10666) {
        this.f29503 |= 1073741824;
        this.f29502 = c10666;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24537(C10666 c10666) {
        this.f29503 |= Integer.MIN_VALUE;
        this.f29501 = c10666;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24531(int i) {
        this.f29503 = (i & 255) | (this.f29503 & (-256));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C10666 m24541() {
        C10666 c10666 = this.f29501;
        if ((this.f29503 & Integer.MIN_VALUE) == 0) {
            while ((c10666.f29503 & 1073741824) == 0) {
                c10666 = c10666.f29502;
            }
        }
        return c10666;
    }

    /* JADX INFO: renamed from: ۜ */
    public final C10666 m24536() {
        C10666 c10666 = this.f29502;
        if ((this.f29503 & 1073741824) == 0) {
            while ((c10666.f29503 & Integer.MIN_VALUE) == 0) {
                c10666 = c10666.f29501;
            }
        }
        return c10666;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f56388;
        this.f56388 = obj;
        return obj2;
    }

    public final C10666 clone() {
        try {
            C10666 c10666 = (C10666) super.clone();
            c10666.f56387 = this.f56387;
            c10666.f56388 = this.f56388;
            c10666.f29503 = this.f29503;
            return c10666;
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
        return this.f56387 == ((Character) entry.getKey()).charValue() && C12826.equals(this.f56388, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        char c = this.f56387;
        Object obj = this.f56388;
        return c ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return this.f56387 + "=>" + this.f56388;
    }
}
