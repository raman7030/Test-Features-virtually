package p067l;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۢ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: W88T */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11159 {

    /* JADX INFO: renamed from: ֫ */
    public final AtomicInteger f30972 = new AtomicInteger();

    /* JADX INFO: renamed from: ۧ */
    public int f30973 = 16384;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo24212(byte[] bArr);

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo24213(byte[] bArr, byte[] bArr2);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo24214(byte[] bArr);

    /* JADX INFO: renamed from: ֫ */
    public final void m25749(EnumC15970 enumC15970, EnumC15970 enumC15971) throws IOException {
        C20666 c20666 = new C20666(enumC15970, enumC15971);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C4572 c4572 = new C4572(byteArrayOutputStream);
        c20666.m42409(this.f30972.getAndIncrement());
        c20666.m42405(EnumSet.of(EnumC22007.FIRST_FRAGMENT, EnumC22007.LAST_FRAGMENT));
        c20666.mo5579(c4572);
        byte[] bArr = new byte[this.f30973];
        mo24214(byteArrayOutputStream.toByteArray());
        C17311 c17311 = new C17311(new ByteArrayInputStream(bArr, 0, mo24212(bArr)));
        C7254 c7254 = new C7254();
        c7254.mo16609(c17311);
        if (!EnumC8595.BIND_ACK.equals(c7254.m42410())) {
            throw new IOException(C21459.m48622("BIND ", enumC15970.getName(), " (", enumC15970.m36312(), ") failed."));
        }
        this.f30973 = c7254.m16610();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13289 m25748(C11948 c11948) throws IOException {
        int iM39280;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C4572 c4572 = new C4572(byteArrayOutputStream);
        C3230 c3230 = new C3230();
        c3230.m42406(EnumC8595.REQUEST);
        c3230.m42409(this.f30972.getAndIncrement());
        c3230.m42405(EnumSet.of(EnumC22007.FIRST_FRAGMENT, EnumC22007.LAST_FRAGMENT));
        c3230.m5581(c11948.m23235());
        C13383 c13383 = new C13383();
        c11948.m18297(new C4572(c13383));
        c3230.m5580(c13383.mo18597());
        c3230.mo5579(c4572);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byte[] bArr = new byte[this.f30973];
        C10896 c10896 = new C10896();
        c10896.m25125(mo24213(byteArray, bArr));
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        C22677 c22677 = new C22677();
        c22677.m42406(EnumC8595.RESPONSE);
        while (true) {
            c22677.mo16609(new C17311(new ByteArrayInputStream(bArr, 0, c10896.getValue().intValue())));
            byteArrayOutputStream2.write(c22677.m50767());
            if (c22677.m42411().contains(EnumC22007.LAST_FRAGMENT)) {
                break;
            }
            c10896.m25125(mo24212(bArr));
        }
        C17311 c17311 = new C17311(new ByteArrayInputStream(byteArrayOutputStream2.toByteArray()));
        EnumC8595 enumC8595M42410 = c22677.m42410();
        EnumC8595 enumC8595 = EnumC8595.RESPONSE;
        if (enumC8595M42410 == enumC8595) {
            C13289 c13289 = new C13289();
            c13289.m37709(c17311);
            return c13289;
        }
        if (c22677.m42410() == EnumC8595.FAULT || c22677.m42410() == EnumC8595.REJECT) {
            int i = C5794.f14232;
            try {
                iM39280 = c17311.m39280();
            } catch (EOFException unused) {
                iM39280 = -1;
            }
            throw new C5794(iM39280);
        }
        throw new IOException("Expected PDU " + enumC8595 + " but got: " + c22677.m42410());
    }
}
