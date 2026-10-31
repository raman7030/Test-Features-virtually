package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: renamed from: l.᩹ۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4D9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22114 extends C12236 {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f71795;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f71796;

    @Override // l.C12236, l.AbstractC5886
    /* JADX INFO: renamed from: ֫ */
    public final byte mo16493(int i) {
        int i2 = this.f71795;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f36484[this.f71796 + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(C19370.m44628(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(C18307.m42646("Index > length: ", i, i2, ", "));
    }

    public C22114(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC5886.m16492(i, i + i2, bArr.length);
        this.f71796 = i;
        this.f71795 = i2;
    }

    @Override // l.C12236, l.AbstractC5886
    /* JADX INFO: renamed from: ۧ */
    public final byte mo16498(int i) {
        return this.f36484[this.f71796 + i];
    }

    @Override // l.C12236, l.AbstractC5886
    public final int size() {
        return this.f71795;
    }

    @Override // l.C12236, l.AbstractC5886
    /* JADX INFO: renamed from: ֫ */
    public final void mo16496(int i, byte[] bArr, int i2, int i3) {
        System.arraycopy(this.f36484, this.f71796 + i, bArr, i2, i3);
    }

    @Override // l.C12236
    /* JADX INFO: renamed from: ᩻ */
    public final int mo29739() {
        return this.f71796;
    }

    public Object writeReplace() {
        return new C12236(m16503());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }
}
