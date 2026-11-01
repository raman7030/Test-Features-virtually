package p067l;

import java.io.DataInputStream;

/* JADX INFO: renamed from: l.᩸֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: O7F3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22576 {

    /* JADX INFO: renamed from: ֫ */
    public EnumC6799 f71280;

    /* JADX INFO: renamed from: ۧ */
    public byte[] f71281;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC21279 f71282;

    /* JADX INFO: renamed from: ܿ */
    public int f71283;

    /* JADX INFO: renamed from: ᩳ */
    public int f71284;

    public C22576(AbstractC21279 abstractC21279, EnumC6799 enumC6799) {
        this.f71282 = abstractC21279;
        this.f71280 = enumC6799;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50604(int i, int i2, DataInputStream dataInputStream) {
        AbstractC21279 abstractC21279 = this.f71282;
        this.f71283 = i;
        this.f71284 = i2;
        try {
            byte[] bArr = new byte[i2];
            this.f71281 = bArr;
            dataInputStream.readFully(bArr);
            abstractC21279.m48090("AttrData:#%d length=%d", Integer.valueOf(i), Integer.valueOf(i2));
        } catch (ArrayIndexOutOfBoundsException | NegativeArraySizeException unused) {
            throw new C6526(abstractC21279.m48082(), "{0}: Invalid attribute length #{1}", this.f71280.m15522(), Integer.valueOf(i2));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m50602() {
        byte[] bArr = this.f71281;
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        String str = (String) C15487.range(0, Math.min(10, bArr.length)).mapToObj(new C16539(0)).collect(C24205.joining(", "));
        return this.f71281.length > 10 ? C17588.m40053(str, ", ...") : str;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m50606(int i) {
        this.f71283 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50603(int i) {
        this.f71284 = i;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m50608() {
        return this.f71283;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m50607() {
        return this.f71284;
    }

    /* JADX INFO: renamed from: ۧ */
    public final EnumC6799 m50605() {
        return this.f71280;
    }
}
