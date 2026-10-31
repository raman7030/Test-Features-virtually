package l;

/* JADX INFO: renamed from: l.ܳ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C14809 implements Cloneable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f45204;

    public C14809(byte[] bArr) {
        int i = (bArr[1] << 8) & 65280;
        this.f45204 = i;
        this.f45204 = i + (bArr[0] & 255);
    }

    public C14809() {
        this.f45204 = 38651;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14809)) {
            if (this.f45204 == ((C14809) obj).f45204) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m35213() {
        return this.f45204;
    }

    public final int hashCode() {
        return this.f45204;
    }
}
