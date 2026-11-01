package p067l;

/* JADX INFO: renamed from: l.ܳ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C16443 implements Cloneable {

    /* JADX INFO: renamed from: ᩸ */
    public int f48320;

    public C16443(byte[] bArr) {
        int i = (bArr[1] << 8) & 65280;
        this.f48320 = i;
        this.f48320 = i + (bArr[0] & 255);
    }

    public C16443() {
        this.f48320 = 38651;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C16443)) {
            if (this.f48320 == ((C16443) obj).f48320) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m37361() {
        return this.f48320;
    }

    public final int hashCode() {
        return this.f48320;
    }
}
