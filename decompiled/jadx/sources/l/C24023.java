package l;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: renamed from: l.᩻᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: RAHB */
/* JADX INFO: loaded from: classes.dex */
public final class C24023 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f77841;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f77842;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f77843;

    public C24023(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                this.f77842 = byteArray;
                this.f77843 = byteArray.length;
                this.f77841 = 0;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m52862() {
        return this.f77841;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private byte m52861() throws EOFException {
        int i = this.f77841;
        if (i >= this.f77843) {
            throw new EOFException("Reached EOF, file size=" + this.f77843);
        }
        this.f77841 = i + 1;
        return this.f77842[i];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte m52865() {
        return m52861();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m52863(int i) throws EOFException {
        int i2 = this.f77841;
        if (i + i2 > this.f77843) {
            throw new EOFException("Reached EOF, file size=" + this.f77843);
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f77842, i2, bArr, 0, i);
        this.f77841 += i;
        return new String(bArr, (i <= 0 || bArr[0] != 0) ? LocalizedMessage.DEFAULT_ENCODING : "UTF-16BE");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m52866(int i) throws EOFException {
        int i2 = this.f77841;
        if (i + i2 > this.f77843) {
            throw new EOFException("Reached EOF, file size=" + this.f77843);
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f77842, i2, bArr, 0, i);
        this.f77841 += i;
        return new String(bArr, "UTF-16BE");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m52868() throws EOFException {
        byte bM52861 = m52861();
        return bM52861 < 0 ? bM52861 + 256 : bM52861;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m52870() {
        return (((((((long) m52868()) << 8) + ((long) m52868())) << 8) + ((long) m52868())) << 8) + ((long) m52868());
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m52869() {
        return m52868() + (m52868() << 8);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52864(long j) throws EOFException {
        if (j > this.f77843 || j < 0) {
            throw new EOFException("Reached EOF, file size=" + this.f77843 + " offset=" + j);
        }
        this.f77841 = (int) j;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52867(long j) throws EOFException {
        m52864(((long) this.f77841) + j);
    }
}
