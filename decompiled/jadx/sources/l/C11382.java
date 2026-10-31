package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۨ֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z72Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C11382 implements InterfaceC0091 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f34046 = "payload.bin".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C11506 f34047;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f34048;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C18437 f34049;

    public C11382(C18437 c18437, int i, C11506 c11506) {
        this.f34049 = c18437;
        this.f34048 = i;
        this.f34047 = c11506;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11382 m28133(String str, String str2, int i, C11506 c11506, C22670 c22670) throws Throwable {
        C17209 c17209M14323 = C4925.m14323();
        if (i > 0 && i <= 16) {
            C22794 c22794 = new C22794(c17209M14323, str, str2, c11506, c22670);
            C11506 c11506M50883 = c22794.m50883();
            C23411 c23411M1200 = C0127.m1200(c22794);
            try {
                long length = c23411M1200.length();
                C18090 c18090M42169 = C18090.m42169(c23411M1200, new C8083());
                try {
                    try {
                        C3545 entry = c18090M42169.getEntry("payload.bin");
                        if (entry == null) {
                            throw new C19401(R.string.MT_Protector);
                        }
                        m28134(entry, length);
                        C23411 c23411Mo21176 = c18090M42169.m42214().mo21176(entry.m10811(), entry.getSize());
                        try {
                            C18437 c18437 = new C18437(c23411Mo21176);
                            String strM28132 = m28132(c18437);
                            if (c11506 != null) {
                                c11506.m28332(strM28132);
                            }
                            try {
                                C11382 c11382 = new C11382(c18437, i, c11506M50883.m28334(strM28132));
                                c18090M42169.close();
                                return c11382;
                            } catch (Throwable th) {
                                th = th;
                                c23411Mo21176 = null;
                                if (c23411Mo21176 != null) {
                                    c23411Mo21176.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        try {
                            c18090M42169.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    c23411M1200 = null;
                    if (c23411M1200 != null) {
                        c23411M1200.close();
                    }
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } else {
            throw new IOException("Download thread count must be between 1 and 16");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m28132(C18437 c18437) {
        MessageDigest messageDigestM34534 = C14460.m34534();
        C10130 c10130 = new C10130();
        ArrayList<C13621> arrayList = (ArrayList) c18437.mo1052();
        c10130.writeInt(arrayList.size());
        c10130.m25433(messageDigestM34534);
        c10130.m25440();
        for (C13621 c13621 : arrayList) {
            byte[] byteArray = c13621.f40625.toByteArray();
            c10130.writeInt(byteArray.length);
            c10130.m25431(c13621.m32741());
            c10130.m25431(c13621.m32739());
            c10130.m25433(messageDigestM34534);
            c10130.m25440();
            messageDigestM34534.update(byteArray);
        }
        return C14460.m34531(messageDigestM34534.digest());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28134(C3545 c3545, long j) throws IOException {
        if (c3545.m10808()) {
            throw new IOException("payload.bin is encrypted");
        }
        if (c3545.m10767() != 0) {
            throw new IOException("payload.bin is compressed");
        }
        long size = c3545.getSize();
        long jM10793 = c3545.m10793();
        long jM10811 = c3545.m10811();
        if (size <= 0 || jM10793 != size) {
            throw new IOException("payload.bin has inconsistent ZIP sizes");
        }
        if (jM10811 < 0 || jM10811 > j || size > j - jM10811) {
            throw new IOException("payload.bin exceeds the remote ZIP bounds");
        }
    }

    @Override // l.InterfaceC0091
    /* JADX INFO: renamed from: ᩶ۧ */
    public final List mo1052() {
        return C20195.unmodifiableList(this.f34049.mo1052());
    }

    @Override // l.InterfaceC0091
    public final C13621 getEntry(String str) {
        return this.f34049.getEntry(str);
    }

    @Override // l.InterfaceC0091
    /* JADX INFO: renamed from: ᩷ */
    public final C13621 mo1053(String str) {
        return this.f34049.mo1053(str);
    }

    @Override // l.InterfaceC0091
    /* JADX INFO: renamed from: ֫ */
    public final void mo1051(C13621 c13621, C23411 c23411, InterfaceC8559 interfaceC8559) throws IOException {
        try {
            m28137(c13621, c23411, interfaceC8559, this.f34048);
        } catch (InterruptedIOException e) {
            if (!interfaceC8559.mo17797()) {
                throw e;
            }
        }
    }

    @Override // l.InterfaceC0091
    /* JADX INFO: renamed from: ֫ */
    public final C18030 mo1050(C13621 c13621) throws IOException {
        if (c13621 != null) {
            String strM32740 = c13621.m32740();
            C18437 c18437 = this.f34049;
            if (c18437.getEntry(strM32740) == c13621) {
                return c18437.mo1050(c13621);
            }
        }
        throw new IOException("Payload entry does not belong to this remote payload");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28137(C13621 c13621, C23411 c23411, InterfaceC8559 interfaceC8559, int i) throws IOException {
        if (i <= 0 || i > 16) {
            throw new IOException("Download thread count must be between 1 and 16");
        }
        String strM32740 = c13621.m32740();
        C18437 c18437 = this.f34049;
        if (c18437.getEntry(strM32740) != c13621) {
            throw new IOException("Payload entry does not belong to this remote payload");
        }
        C8971 c8971 = c13621.f40625;
        if (!c8971.hasNewPartitionInfo()) {
            throw new IOException("Missing new partition info: " + c13621.m32740());
        }
        C14614 newPartitionInfo = c8971.getNewPartitionInfo();
        if (!newPartitionInfo.hasSize() || !newPartitionInfo.hasHash()) {
            throw new IOException("Missing partition size or hash: " + c13621.m32740());
        }
        long size = newPartitionInfo.getSize();
        byte[] bArrM16503 = newPartitionInfo.getHash().m16503();
        if (size != c13621.m32741() || bArrM16503.length != 32) {
            throw new IOException("Invalid partition verification metadata: " + c13621.m32740());
        }
        c18437.m42916(c13621, c23411, interfaceC8559, i);
        if (interfaceC8559.mo17797()) {
            throw new InterruptedIOException("Payload extraction was canceled");
        }
        C19277 c19277 = new C19277(Math.max(size, 1L));
        c19277.m44459(new C23684(3, interfaceC8559));
        c19277.m44460(0);
        c23411.flush();
        long length = c23411.length();
        if (length != size) {
            StringBuilder sbM31106 = C12803.m31106("Extracted partition size mismatch: expected ", ", actual ", size);
            sbM31106.append(length);
            sbM31106.append(" (");
            sbM31106.append(c13621.m32740());
            sbM31106.append(')');
            throw new IOException(sbM31106.toString());
        }
        MessageDigest messageDigestM34534 = C14460.m34534();
        int i2 = 524288;
        byte[] bArr = new byte[524288];
        long j = 0;
        c23411.seek(0L);
        long j2 = size;
        while (j2 > j) {
            if (interfaceC8559.mo17797()) {
                throw new InterruptedIOException("Payload extraction was canceled");
            }
            int iMin = (int) Math.min(j2, i2);
            c23411.m51858(bArr, 0, iMin);
            messageDigestM34534.update(bArr, 0, iMin);
            j2 -= (long) iMin;
            c19277.m44460(iMin);
            i2 = 524288;
            j = 0;
        }
        if (size == j) {
            c19277.m44460(1);
        }
        byte[] bArrDigest = messageDigestM34534.digest();
        if (MessageDigest.isEqual(bArrM16503, bArrDigest)) {
            return;
        }
        throw new IOException("Partition SHA-256 mismatch: expected " + C14460.m34531(bArrM16503) + ", actual " + C14460.m34531(bArrDigest) + " (" + c13621.m32740() + ')');
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11506 m28136() {
        return this.f34047;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f34049.close();
    }
}
