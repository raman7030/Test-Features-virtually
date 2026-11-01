package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩴۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8K8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20119 {

    /* JADX INFO: renamed from: ֫ */
    public final int f62252;

    /* JADX INFO: renamed from: ۧ */
    public final int f62253;

    /* JADX INFO: renamed from: ܽ */
    public final int f62254;

    /* JADX INFO: renamed from: ᩳ */
    public final byte[] f62255;

    public C20119(int i, byte[] bArr, int i2, int i3) {
        this.f62253 = i;
        this.f62255 = bArr;
        this.f62254 = i2;
        this.f62252 = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20119.class == obj.getClass()) {
            C20119 c20119 = (C20119) obj;
            if (this.f62253 == c20119.f62253 && this.f62254 == c20119.f62254 && this.f62252 == c20119.f62252 && Arrays.equals(this.f62255, c20119.f62255)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f62255) + (this.f62253 * 31)) * 31) + this.f62254) * 31) + this.f62252;
    }
}
