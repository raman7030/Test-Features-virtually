package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: renamed from: l.᩹ۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4D9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23385 extends C13997 {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ۗ */
    public final int f74517;

    /* JADX INFO: renamed from: ۬ */
    public final int f74518;

    @Override // p067l.C13997, p067l.AbstractC7962
    /* JADX INFO: renamed from: ֫ */
    public final byte mo18419(int i) {
        int i2 = this.f74517;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f39501[this.f74518 + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(C20778.m46922(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(C19768.m44907("Index > length: ", i, i2, ", "));
    }

    public C23385(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC7962.m18418(i, i + i2, bArr.length);
        this.f74518 = i;
        this.f74517 = i2;
    }

    @Override // p067l.C13997, p067l.AbstractC7962
    /* JADX INFO: renamed from: ۧ */
    public final byte mo18424(int i) {
        return this.f39501[this.f74518 + i];
    }

    @Override // p067l.C13997, p067l.AbstractC7962
    public final int size() {
        return this.f74517;
    }

    @Override // p067l.C13997, p067l.AbstractC7962
    /* JADX INFO: renamed from: ֫ */
    public final void mo18422(int i, byte[] bArr, int i2, int i3) {
        System.arraycopy(this.f39501, this.f74518 + i, bArr, i2, i3);
    }

    @Override // p067l.C13997
    /* JADX INFO: renamed from: ᩻ */
    public final int mo31801() {
        return this.f74518;
    }

    public Object writeReplace() {
        return new C13997(m18429());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }
}
