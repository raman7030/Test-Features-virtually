package p067l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.᩺֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9H1 */
/* JADX INFO: loaded from: classes.dex */
public final class C23919 implements InterfaceC14531 {

    /* JADX INFO: renamed from: ۜ */
    public static final byte[] f75910;

    /* JADX INFO: renamed from: ᩷ */
    public static final InterfaceC4410 f75911 = C13128.m30022(C23919.class);

    /* JADX INFO: renamed from: ᩻ */
    public static final byte[] f75912;

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f75913;

    /* JADX INFO: renamed from: ۧ */
    public byte[] f75914;

    /* JADX INFO: renamed from: ܳ */
    public C13191 f75915;

    /* JADX INFO: renamed from: ܽ */
    public C4473 f75916;

    /* JADX INFO: renamed from: ܿ */
    public byte[] f75917;

    /* JADX INFO: renamed from: ᩳ */
    public AtomicInteger f75918 = new AtomicInteger(0);

    static {
        Charset charset = StandardCharsets.US_ASCII;
        f75910 = "session key to client-to-server signing key magic constant\u0000".getBytes(charset);
        f75912 = "session key to client-to-server sealing key magic constant\u0000".getBytes(charset);
    }

    public C23919(C13191 c13191) {
        this.f75915 = c13191;
    }

    @Override // p067l.InterfaceC14531
    /* JADX INFO: renamed from: ֫ */
    public final C24622 mo30197(C5144 c5144, byte[] bArr, C8752 c8752) throws IOException {
        byte[] bArrCopyOf;
        C24622 c24622Mo30197 = this.f75915.mo30197(c5144, bArr, c8752);
        if (c24622Mo30197 == null) {
            return null;
        }
        byte[] bArrM54271 = c24622Mo30197.m54271();
        Set setM54266 = c24622Mo30197.m54266();
        InterfaceC4410 interfaceC4410 = f75911;
        if (bArrM54271 != null) {
            interfaceC4410.mo9183("Calculating signing and sealing keys for NTLM Extended Session Security");
            EnumC22240 enumC22240 = EnumC22240.NTLMSSP_NEGOTIATE_EXTENDED_SESSIONSECURITY;
            this.f75917 = setM54266.contains(enumC22240) ? C18215.m41437(this.f75916, bArrM54271, f75910) : null;
            C20899 c20899M54265 = c24622Mo30197.m54265();
            if (setM54266.contains(enumC22240)) {
                if (!setM54266.contains(EnumC22240.NTLMSSP_NEGOTIATE_128)) {
                    if (setM54266.contains(EnumC22240.NTLMSSP_NEGOTIATE_56)) {
                        bArrM54271 = Arrays.copyOf(bArrM54271, 7);
                    } else {
                        bArrM54271 = Arrays.copyOf(bArrM54271, 5);
                    }
                }
                bArrCopyOf = C18215.m41437(this.f75916, bArrM54271, f75912);
            } else if (setM54266.contains(EnumC22240.NTLMSSP_NEGOTIATE_LM_KEY) || (setM54266.contains(EnumC22240.NTLMSSP_NEGOTIATE_DATAGRAM) && c20899M54265.m47206().getValue() >= EnumC4805.NTLMSSP_REVISION_W2K3.getValue())) {
                bArrCopyOf = new byte[8];
                if (setM54266.contains(EnumC22240.NTLMSSP_NEGOTIATE_56)) {
                    System.arraycopy(bArrM54271, 0, bArrCopyOf, 0, 7);
                    bArrCopyOf[7] = -96;
                } else {
                    System.arraycopy(bArrM54271, 0, bArrCopyOf, 0, 5);
                    bArrCopyOf[5] = -27;
                    bArrCopyOf[6] = 56;
                    bArrCopyOf[7] = -80;
                }
            } else {
                bArrCopyOf = Arrays.copyOf(bArrM54271, bArrM54271.length);
            }
            this.f75914 = bArrCopyOf;
        }
        if (c24622Mo30197.m54260() instanceof C16993) {
            this.f75913 = ((C16993) c24622Mo30197.m54260()).m38584();
        }
        if (this.f75917 == null || !(c24622Mo30197.m54260() instanceof C23030)) {
            return c24622Mo30197;
        }
        C23030 c23030 = (C23030) c24622Mo30197.m54260();
        interfaceC4410.mo9183("Signing with NTLM Extended Session Security");
        int andIncrement = this.f75918.getAndIncrement();
        byte[] bArr2 = this.f75917;
        byte[] bArr3 = {(byte) (andIncrement & 255), (byte) ((andIncrement >> 8) & 255), (byte) ((andIncrement >> 16) & 255), (byte) ((andIncrement >> 24) & 255)};
        C4096 c4096 = new C4096(new ArrayList(this.f75913));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C17525 c17525 = new C17525(new C10330(), byteArrayOutputStream);
        try {
            c17525.m39897(c4096);
            c17525.close();
            byte[] bArrM41435 = new byte[8];
            System.arraycopy(C18215.m41436(this.f75916, bArr2, bArr3, byteArrayOutputStream.toByteArray()), 0, bArrM41435, 0, 8);
            if (setM54266.contains(EnumC22240.NTLMSSP_NEGOTIATE_KEY_EXCH)) {
                bArrM41435 = C18215.m41435(this.f75916, this.f75914, bArrM41435);
            }
            C2460 c2460 = new C2460();
            c2460.m28113(1L);
            c2460.m28102(8, bArrM41435);
            c2460.m28113(andIncrement);
            c23030.m51417(c2460.m28123());
            return c24622Mo30197;
        } catch (Throwable th) {
            try {
                c17525.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // p067l.InterfaceC14531
    /* JADX INFO: renamed from: ֫ */
    public final void mo30198(C6485 c6485) {
        this.f75915.mo30198(c6485);
        this.f75916 = c6485.m14902();
    }

    @Override // p067l.InterfaceC14531
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo30199(C5144 c5144) {
        return this.f75915.mo30199(c5144);
    }
}
