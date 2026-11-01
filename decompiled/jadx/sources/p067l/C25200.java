package p067l;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: renamed from: l.᩻᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: RAHB */
/* JADX INFO: loaded from: classes.dex */
public final class C25200 {

    /* JADX INFO: renamed from: ֫ */
    public int f80593;

    /* JADX INFO: renamed from: ۧ */
    public byte[] f80594;

    /* JADX INFO: renamed from: ܽ */
    public int f80595;

    public C25200(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                this.f80594 = byteArray;
                this.f80595 = byteArray.length;
                this.f80593 = 0;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m55268() {
        return this.f80593;
    }

    /* JADX INFO: renamed from: ܳ */
    private byte m55267() throws EOFException {
        int i = this.f80593;
        if (i >= this.f80595) {
            throw new EOFException("Reached EOF, file size=" + this.f80595);
        }
        this.f80593 = i + 1;
        return this.f80594[i];
    }

    /* JADX INFO: renamed from: ۧ */
    public final byte m55271() {
        return m55267();
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m55269(int i) throws EOFException {
        int i2 = this.f80593;
        if (i + i2 > this.f80595) {
            throw new EOFException("Reached EOF, file size=" + this.f80595);
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f80594, i2, bArr, 0, i);
        this.f80593 += i;
        return new String(bArr, (i <= 0 || bArr[0] != 0) ? LocalizedMessage.DEFAULT_ENCODING : "UTF-16BE");
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m55272(int i) throws EOFException {
        int i2 = this.f80593;
        if (i + i2 > this.f80595) {
            throw new EOFException("Reached EOF, file size=" + this.f80595);
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f80594, i2, bArr, 0, i);
        this.f80593 += i;
        return new String(bArr, "UTF-16BE");
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m55274() throws EOFException {
        byte bM55267 = m55267();
        return bM55267 < 0 ? bM55267 + 256 : bM55267;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final long m55276() {
        return (((((((long) m55274()) << 8) + ((long) m55274())) << 8) + ((long) m55274())) << 8) + ((long) m55274());
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m55275() {
        return m55274() + (m55274() << 8);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55270(long j) throws EOFException {
        if (j > this.f80595 || j < 0) {
            throw new EOFException("Reached EOF, file size=" + this.f80595 + " offset=" + j);
        }
        this.f80593 = (int) j;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m55273(long j) throws EOFException {
        m55270(((long) this.f80593) + j);
    }
}
