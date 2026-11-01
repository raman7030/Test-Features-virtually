package p067l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۚᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9JA */
/* JADX INFO: loaded from: classes3.dex */
public final class C7607 extends AbstractRunnableC2912 {

    /* JADX INFO: renamed from: ۫ */
    public final byte[] f19908;

    /* JADX INFO: renamed from: ۬ */
    public final InterfaceC11336 f19909;

    public C7607(String str, InputStream inputStream, InterfaceC11336 interfaceC11336, InterfaceC10665 interfaceC10665) {
        super(str, inputStream, interfaceC10665);
        this.f19908 = new byte[4];
        this.f19909 = interfaceC11336;
    }

    @Override // p067l.AbstractRunnableC2912
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC7487 mo4712() throws C4630 {
        try {
            byte[] bArr = new byte[m17559()];
            m17558(bArr);
            return this.f19909.read(bArr);
        } catch (C4630 e) {
            throw e;
        } catch (IOException e2) {
            e = e2;
            throw new C4630(e);
        } catch (C14862 e3) {
            e = e3;
            throw new C4630(e);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private int m17559() throws IOException {
        byte[] bArr = this.f19908;
        m17558(bArr);
        return (bArr[3] & 255) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m17558(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = 0;
        while (length > 0) {
            int i2 = this.f5034.read(bArr, i, length);
            if (i2 == -1) {
                throw new C4630(new EOFException("EOF while reading packet"));
            }
            length -= i2;
            i += i2;
        }
    }
}
