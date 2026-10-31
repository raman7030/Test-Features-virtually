package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩴۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8K8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18677 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f59029;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f59030;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f59031;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] f59032;

    public C18677(int i, byte[] bArr, int i2, int i3) {
        this.f59030 = i;
        this.f59032 = bArr;
        this.f59031 = i2;
        this.f59029 = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C18677.class == obj.getClass()) {
            C18677 c18677 = (C18677) obj;
            if (this.f59030 == c18677.f59030 && this.f59031 == c18677.f59031 && this.f59029 == c18677.f59029 && Arrays.equals(this.f59032, c18677.f59032)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f59032) + (this.f59030 * 31)) * 31) + this.f59031) * 31) + this.f59029;
    }
}
