package p067l;

import bin.p000mt.plus.R;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۨ֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z72Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C13186 implements InterfaceC2455 {

    /* JADX INFO: renamed from: ۙ */
    public static final byte[] f37044 = "payload.bin".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: ᩶ */
    public final C13304 f37045;

    /* JADX INFO: renamed from: ᩸ */
    public final int f37046;

    /* JADX INFO: renamed from: ᩹ */
    public final C19891 f37047;

    public C13186(C19891 c19891, int i, C13304 c13304) {
        this.f37047 = c19891;
        this.f37046 = i;
        this.f37045 = c13304;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13186 m30177(String str, String str2, int i, C13304 c13304, C23914 c23914) throws Throwable {
        C18724 c18724M16220 = C7050.m16220();
        if (i > 0 && i <= 16) {
            C24032 c24032 = new C24032(c18724M16220, str, str2, c13304, c23914);
            C13304 c13304M53273 = c24032.m53273();
            C24618 c24618M3601 = C2489.m3601(c24032);
            try {
                long length = c24618M3601.length();
                C19561 c19561M44428 = C19561.m44428(c24618M3601, new C10050());
                try {
                    try {
                        C5738 entry = c19561M44428.getEntry("payload.bin");
                        if (entry == null) {
                            throw new C20807(R.string.MT_Protector);
                        }
                        m30178(entry, length);
                        C24618 c24618Mo23141 = c19561M44428.m44473().mo23141(entry.m12792(), entry.getSize());
                        try {
                            C19891 c19891 = new C19891(c24618Mo23141);
                            String strM30176 = m30176(c19891);
                            if (c13304 != null) {
                                c13304.m30376(strM30176);
                            }
                            try {
                                C13186 c13186 = new C13186(c19891, i, c13304M53273.m30378(strM30176));
                                c19561M44428.close();
                                return c13186;
                            } catch (Throwable th) {
                                th = th;
                                c24618Mo23141 = null;
                                if (c24618Mo23141 != null) {
                                    c24618Mo23141.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        try {
                            c19561M44428.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    c24618M3601 = null;
                    if (c24618M3601 != null) {
                        c24618M3601.close();
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

    /* JADX INFO: renamed from: ֫ */
    public static String m30176(C19891 c19891) {
        MessageDigest messageDigestM36668 = C16111.m36668();
        C11996 c11996 = new C11996();
        ArrayList<C15314> arrayList = (ArrayList) c19891.mo3448();
        c11996.writeInt(arrayList.size());
        c11996.m27453(messageDigestM36668);
        c11996.m27460();
        for (C15314 c15314 : arrayList) {
            byte[] byteArray = c15314.f43705.toByteArray();
            c11996.writeInt(byteArray.length);
            c11996.m27451(c15314.m34855());
            c11996.m27451(c15314.m34853());
            c11996.m27453(messageDigestM36668);
            c11996.m27460();
            messageDigestM36668.update(byteArray);
        }
        return C16111.m36665(messageDigestM36668.digest());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m30178(C5738 c5738, long j) throws IOException {
        if (c5738.m12789()) {
            throw new IOException("payload.bin is encrypted");
        }
        if (c5738.m12748() != 0) {
            throw new IOException("payload.bin is compressed");
        }
        long size = c5738.getSize();
        long jM12774 = c5738.m12774();
        long jM12792 = c5738.m12792();
        if (size <= 0 || jM12774 != size) {
            throw new IOException("payload.bin has inconsistent ZIP sizes");
        }
        if (jM12792 < 0 || jM12792 > j || size > j - jM12792) {
            throw new IOException("payload.bin exceeds the remote ZIP bounds");
        }
    }

    @Override // p067l.InterfaceC2455
    /* JADX INFO: renamed from: ᩶ۧ */
    public final List mo3448() {
        return C21562.unmodifiableList(this.f37047.mo3448());
    }

    @Override // p067l.InterfaceC2455
    public final C15314 getEntry(String str) {
        return this.f37047.getEntry(str);
    }

    @Override // p067l.InterfaceC2455
    /* JADX INFO: renamed from: ᩷ */
    public final C15314 mo3449(String str) {
        return this.f37047.mo3449(str);
    }

    @Override // p067l.InterfaceC2455
    /* JADX INFO: renamed from: ֫ */
    public final void mo3447(C15314 c15314, C24618 c24618, InterfaceC10503 interfaceC10503) throws IOException {
        try {
            m30181(c15314, c24618, interfaceC10503, this.f37046);
        } catch (InterruptedIOException e) {
            if (!interfaceC10503.mo19744()) {
                throw e;
            }
        }
    }

    @Override // p067l.InterfaceC2455
    /* JADX INFO: renamed from: ֫ */
    public final C19504 mo3446(C15314 c15314) throws IOException {
        if (c15314 != null) {
            String strM34854 = c15314.m34854();
            C19891 c19891 = this.f37047;
            if (c19891.getEntry(strM34854) == c15314) {
                return c19891.mo3446(c15314);
            }
        }
        throw new IOException("Payload entry does not belong to this remote payload");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30181(C15314 c15314, C24618 c24618, InterfaceC10503 interfaceC10503, int i) throws IOException {
        if (i <= 0 || i > 16) {
            throw new IOException("Download thread count must be between 1 and 16");
        }
        String strM34854 = c15314.m34854();
        C19891 c19891 = this.f37047;
        if (c19891.getEntry(strM34854) != c15314) {
            throw new IOException("Payload entry does not belong to this remote payload");
        }
        C10895 c10895 = c15314.f43705;
        if (!c10895.hasNewPartitionInfo()) {
            throw new IOException("Missing new partition info: " + c15314.m34854());
        }
        C16258 newPartitionInfo = c10895.getNewPartitionInfo();
        if (!newPartitionInfo.hasSize() || !newPartitionInfo.hasHash()) {
            throw new IOException("Missing partition size or hash: " + c15314.m34854());
        }
        long size = newPartitionInfo.getSize();
        byte[] bArrM18429 = newPartitionInfo.getHash().m18429();
        if (size != c15314.m34855() || bArrM18429.length != 32) {
            throw new IOException("Invalid partition verification metadata: " + c15314.m34854());
        }
        c19891.m45189(c15314, c24618, interfaceC10503, i);
        if (interfaceC10503.mo19744()) {
            throw new InterruptedIOException("Payload extraction was canceled");
        }
        C20689 c20689 = new C20689(Math.max(size, 1L));
        c20689.m46753(new C24878(3, interfaceC10503));
        c20689.m46754(0);
        c24618.flush();
        long length = c24618.length();
        if (length != size) {
            StringBuilder sbM33191 = C14536.m33191("Extracted partition size mismatch: expected ", ", actual ", size);
            sbM33191.append(length);
            sbM33191.append(" (");
            sbM33191.append(c15314.m34854());
            sbM33191.append(')');
            throw new IOException(sbM33191.toString());
        }
        MessageDigest messageDigestM36668 = C16111.m36668();
        int i2 = 524288;
        byte[] bArr = new byte[524288];
        long j = 0;
        c24618.seek(0L);
        long j2 = size;
        while (j2 > j) {
            if (interfaceC10503.mo19744()) {
                throw new InterruptedIOException("Payload extraction was canceled");
            }
            int iMin = (int) Math.min(j2, i2);
            c24618.m54256(bArr, 0, iMin);
            messageDigestM36668.update(bArr, 0, iMin);
            j2 -= (long) iMin;
            c20689.m46754(iMin);
            i2 = 524288;
            j = 0;
        }
        if (size == j) {
            c20689.m46754(1);
        }
        byte[] bArrDigest = messageDigestM36668.digest();
        if (MessageDigest.isEqual(bArrM18429, bArrDigest)) {
            return;
        }
        throw new IOException("Partition SHA-256 mismatch: expected " + C16111.m36665(bArrM18429) + ", actual " + C16111.m36665(bArrDigest) + " (" + c15314.m34854() + ')');
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13304 m30180() {
        return this.f37045;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f37047.close();
    }
}
