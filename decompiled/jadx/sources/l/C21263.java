package l;

import java.io.DataInputStream;

/* JADX INFO: renamed from: l.᩸֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: O7F3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21263 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC4662 f68597;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f68598;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC19898 f68599;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f68600;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f68601;

    public C21263(AbstractC19898 abstractC19898, EnumC4662 enumC4662) {
        this.f68599 = abstractC19898;
        this.f68597 = enumC4662;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48273(int i, int i2, DataInputStream dataInputStream) {
        AbstractC19898 abstractC19898 = this.f68599;
        this.f68600 = i;
        this.f68601 = i2;
        try {
            byte[] bArr = new byte[i2];
            this.f68598 = bArr;
            dataInputStream.readFully(bArr);
            abstractC19898.m45778("AttrData:#%d length=%d", Integer.valueOf(i), Integer.valueOf(i2));
        } catch (ArrayIndexOutOfBoundsException | NegativeArraySizeException unused) {
            throw new C4375(abstractC19898.m45770(), "{0}: Invalid attribute length #{1}", this.f68597.m13647(), Integer.valueOf(i2));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m48271() {
        byte[] bArr = this.f68598;
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        String str = (String) C13803.range(0, Math.min(10, bArr.length)).mapToObj(new C14911(0)).collect(C22976.joining(", "));
        return this.f68598.length > 10 ? C16014.m37867(str, ", ...") : str;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48275(int i) {
        this.f68600 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48272(int i) {
        this.f68601 = i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m48277() {
        return this.f68600;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m48276() {
        return this.f68601;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC4662 m48274() {
        return this.f68597;
    }
}
