package l;

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
public final class C22676 implements InterfaceC12798 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final byte[] f73185;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f73186 = C11321.m27961(C22676.class);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final byte[] f73187;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f73188;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f73189;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C11388 f73190;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C2215 f73191;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f73192;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f73193 = new AtomicInteger(0);

    static {
        Charset charset = StandardCharsets.US_ASCII;
        f73185 = "session key to client-to-server signing key magic constant\u0000".getBytes(charset);
        f73187 = "session key to client-to-server sealing key magic constant\u0000".getBytes(charset);
    }

    public C22676(C11388 c11388) {
        this.f73190 = c11388;
    }

    @Override // l.InterfaceC12798
    /* JADX INFO: renamed from: ֫ */
    public final C23415 mo28153(C2921 c2921, byte[] bArr, C6717 c6717) throws IOException {
        byte[] bArrCopyOf;
        C23415 c23415Mo28153 = this.f73190.mo28153(c2921, bArr, c6717);
        if (c23415Mo28153 == null) {
            return null;
        }
        byte[] bArrM51873 = c23415Mo28153.m51873();
        Set setM51868 = c23415Mo28153.m51868();
        InterfaceC2148 interfaceC2148 = f73186;
        if (bArrM51873 != null) {
            interfaceC2148.mo7088("Calculating signing and sealing keys for NTLM Extended Session Security");
            EnumC20909 enumC20909 = EnumC20909.NTLMSSP_NEGOTIATE_EXTENDED_SESSIONSECURITY;
            this.f73192 = setM51868.contains(enumC20909) ? C16674.m39202(this.f73191, bArrM51873, f73185) : null;
            C19498 c19498M51867 = c23415Mo28153.m51867();
            if (setM51868.contains(enumC20909)) {
                if (!setM51868.contains(EnumC20909.NTLMSSP_NEGOTIATE_128)) {
                    if (setM51868.contains(EnumC20909.NTLMSSP_NEGOTIATE_56)) {
                        bArrM51873 = Arrays.copyOf(bArrM51873, 7);
                    } else {
                        bArrM51873 = Arrays.copyOf(bArrM51873, 5);
                    }
                }
                bArrCopyOf = C16674.m39202(this.f73191, bArrM51873, f73187);
            } else if (setM51868.contains(EnumC20909.NTLMSSP_NEGOTIATE_LM_KEY) || (setM51868.contains(EnumC20909.NTLMSSP_NEGOTIATE_DATAGRAM) && c19498M51867.m44908().getValue() >= EnumC2564.NTLMSSP_REVISION_W2K3.getValue())) {
                bArrCopyOf = new byte[8];
                if (setM51868.contains(EnumC20909.NTLMSSP_NEGOTIATE_56)) {
                    System.arraycopy(bArrM51873, 0, bArrCopyOf, 0, 7);
                    bArrCopyOf[7] = -96;
                } else {
                    System.arraycopy(bArrM51873, 0, bArrCopyOf, 0, 5);
                    bArrCopyOf[5] = -27;
                    bArrCopyOf[6] = 56;
                    bArrCopyOf[7] = -80;
                }
            } else {
                bArrCopyOf = Arrays.copyOf(bArrM51873, bArrM51873.length);
            }
            this.f73189 = bArrCopyOf;
        }
        if (c23415Mo28153.m51862() instanceof C15388) {
            this.f73188 = ((C15388) c23415Mo28153.m51862()).m36426();
        }
        if (this.f73192 == null || !(c23415Mo28153.m51862() instanceof C21740)) {
            return c23415Mo28153;
        }
        C21740 c21740 = (C21740) c23415Mo28153.m51862();
        interfaceC2148.mo7088("Signing with NTLM Extended Session Security");
        int andIncrement = this.f73193.getAndIncrement();
        byte[] bArr2 = this.f73192;
        byte[] bArr3 = {(byte) (andIncrement & 255), (byte) ((andIncrement >> 8) & 255), (byte) ((andIncrement >> 16) & 255), (byte) ((andIncrement >> 24) & 255)};
        C1818 c1818 = new C1818(new ArrayList(this.f73188));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C15948 c15948 = new C15948(new C8377(), byteArrayOutputStream);
        try {
            c15948.m37722(c1818);
            c15948.close();
            byte[] bArrM39200 = new byte[8];
            System.arraycopy(C16674.m39201(this.f73191, bArr2, bArr3, byteArrayOutputStream.toByteArray()), 0, bArrM39200, 0, 8);
            if (setM51868.contains(EnumC20909.NTLMSSP_NEGOTIATE_KEY_EXCH)) {
                bArrM39200 = C16674.m39200(this.f73191, this.f73189, bArrM39200);
            }
            C0097 c0097 = new C0097();
            c0097.m26088(1L);
            c0097.m26077(8, bArrM39200);
            c0097.m26088(andIncrement);
            c21740.m49068(c0097.m26098());
            return c23415Mo28153;
        } catch (Throwable th) {
            try {
                c15948.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // l.InterfaceC12798
    /* JADX INFO: renamed from: ֫ */
    public final void mo28154(C4332 c4332) {
        this.f73190.mo28154(c4332);
        this.f73191 = c4332.m13038();
    }

    @Override // l.InterfaceC12798
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo28155(C2921 c2921) {
        return this.f73190.mo28155(c2921);
    }
}
