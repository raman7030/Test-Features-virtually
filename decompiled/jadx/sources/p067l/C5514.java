package p067l;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipOutputStream;

/* JADX INFO: renamed from: l.ۗܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S50A */
/* JADX INFO: loaded from: classes2.dex */
public final class C5514 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC10630 f13187;

    /* JADX INFO: renamed from: ۧ */
    public final C11750 f13188;

    /* JADX INFO: renamed from: ܽ */
    public int f13189;

    /* JADX INFO: renamed from: ֫ */
    public static C5514 m12155(ByteBuffer byteBuffer) {
        return new C5514(new C11750(byteBuffer));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5514 m12154(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i <= 0) {
                return new C5514(new C11750(ByteBuffer.wrap(byteArrayOutputStream.toByteArray())));
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public C5514(C11750 c11750) {
        this.f13188 = c11750;
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m12158() {
        C6365 c6365 = new C6365();
        C11750 c11750 = this.f13188;
        c6365.mo14575(c11750.m26977());
        c11750.m26976(c6365, 0, this.f13189 | 32);
        Object[] objArr = {null};
        new C6855(this).m6276(c6365, new C16912(objArr), new C20689(1L));
        return (byte[]) objArr[0];
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12159() {
        this.f13189 |= 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12156(OutputStream outputStream) throws IOException {
        if (!(outputStream instanceof BufferedOutputStream)) {
            outputStream = new BufferedOutputStream(outputStream);
        }
        ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream);
        C6365 c6365 = new C6365();
        C6855 c6855 = new C6855(this);
        C23619 c23619 = new C23619(zipOutputStream);
        C11750 c11750 = this.f13188;
        C20689 c20689 = new C20689(c11750.m26973());
        c20689.m46753(this.f13187);
        c11750.m26975(new C21608(c6365, c6365, c6855, c23619, c20689), this.f13189 | 32);
        zipOutputStream.close();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12157(InterfaceC10630 interfaceC10630) {
        this.f13187 = interfaceC10630;
    }
}
