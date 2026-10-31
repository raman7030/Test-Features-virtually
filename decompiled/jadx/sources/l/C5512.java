package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۚᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9JA */
/* JADX INFO: loaded from: classes3.dex */
public final class C5512 extends AbstractRunnableC0572 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final byte[] f17067;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC9436 f17068;

    public C5512(String str, InputStream inputStream, InterfaceC9436 interfaceC9436, InterfaceC8730 interfaceC8730) {
        super(str, inputStream, interfaceC8730);
        this.f17067 = new byte[4];
        this.f17068 = interfaceC9436;
    }

    @Override // l.AbstractRunnableC0572
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC5386 mo2341() throws C2380 {
        try {
            byte[] bArr = new byte[m15644()];
            m15643(bArr);
            return this.f17068.read(bArr);
        } catch (C2380 e) {
            throw e;
        } catch (IOException e2) {
            e = e2;
            throw new C2380(e);
        } catch (C13146 e3) {
            e = e3;
            throw new C2380(e);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private int m15644() throws IOException {
        byte[] bArr = this.f17067;
        m15643(bArr);
        return (bArr[3] & 255) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15643(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = 0;
        while (length > 0) {
            int i2 = this.f2259.read(bArr, i, length);
            if (i2 == -1) {
                throw new C2380(new EOFException("EOF while reading packet"));
            }
            length -= i2;
            i += i2;
        }
    }
}
