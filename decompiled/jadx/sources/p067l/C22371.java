package p067l;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩷ᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31A6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22371 {
    /* JADX INFO: renamed from: ֫ */
    public static byte[] m50221(C20359 c20359, byte[] bArr) throws EOFException {
        if (!c20359.m45959()) {
            return null;
        }
        c20359.m45952(c20359.m45960());
        long jM45955 = c20359.m45955() - 24;
        while (jM45955 > 0 && jM45955 >= 12) {
            long jM45956 = c20359.m45955();
            if (jM45956 < 4 || jM45956 > jM45955 - 8) {
                return null;
            }
            long jM45963 = c20359.m45963() + jM45956;
            if (c20359.m45956() == 1896449818) {
                try {
                    return m50220(c20359, jM45963, bArr);
                } catch (RuntimeException | C22271 unused) {
                    return null;
                }
            }
            jM45955 -= jM45956 + 8;
            c20359.m45952(jM45963);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m50220(C20359 c20359, long j, byte[] bArr) throws EOFException, C22271 {
        long jM50217 = m50217(c20359, m50217(c20359, j));
        long jM50218 = m50217(c20359, jM50217);
        c20359.m45952(m50217(c20359, jM50218));
        byte[] bArrM50222 = m50222(c20359, m50217(c20359, jM50218), bArr);
        if (bArrM50222 == null) {
            return null;
        }
        m50217(c20359, jM50218);
        c20359.m45952(jM50218);
        if (jM50217 - c20359.m45963() < 8) {
            throw new C22271("V2 signer is missing signatures or public key");
        }
        c20359.m45952(m50217(c20359, jM50217));
        c20359.m45952(m50217(c20359, jM50217));
        return bArrM50222;
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m50217(C20359 c20359, long j) throws EOFException, C22271 {
        if (j - c20359.m45963() < 4) {
            throw new C22271("Length-prefixed field is missing its length");
        }
        int iM45956 = c20359.m45956();
        long jM45963 = j - c20359.m45963();
        if (iM45956 >= 0) {
            long j2 = iM45956;
            if (j2 <= jM45963) {
                return c20359.m45963() + j2;
            }
        }
        throw new C22271("Length-prefixed field exceeds its container");
    }

    /* JADX INFO: renamed from: ۧ */
    public static byte[] m50222(C20359 c20359, long j, byte[] bArr) {
        try {
            if (j - c20359.m45963() > 4194304) {
                throw new C22271("Signing certificate sequence exceeds safety limit");
            }
            byte[] bArr2 = null;
            byte[] bArr3 = null;
            while (c20359.m45963() < j) {
                long jM50217 = m50217(c20359, j);
                int iM45963 = (int) (jM50217 - c20359.m45963());
                if (iM45963 == 0) {
                    throw new C22271("Signing certificate is empty");
                }
                if (iM45963 > 1048576) {
                    throw new C22271("Signing certificate exceeds safety limit");
                }
                if (bArr3 == null || (bArr != null && bArr.length == iM45963)) {
                    byte[] bArrM45953 = c20359.m45953(iM45963);
                    if (bArr3 == null) {
                        bArr3 = bArrM45953;
                    }
                    if (bArr != null && Arrays.equals(bArr, bArrM45953)) {
                        bArr2 = bArrM45953;
                    }
                } else {
                    c20359.m45952(jM50217);
                }
            }
            if (bArr2 == null) {
                bArr2 = bArr3;
            }
            c20359.m45952(j);
            return bArr2;
        } catch (Throwable th) {
            c20359.m45952(j);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m50218(C20359 c20359, InterfaceC18588 interfaceC18588) throws EOFException {
        if (!c20359.m45959()) {
            return false;
        }
        c20359.m45952(c20359.m45960());
        long jM45955 = c20359.m45955() - 24;
        while (jM45955 > 0 && jM45955 >= 12) {
            long jM45956 = c20359.m45955();
            if (jM45956 < 4 || jM45956 > jM45955 - 8) {
                return false;
            }
            long jM45963 = c20359.m45963() + jM45956;
            if (c20359.m45956() != 1896449818) {
                jM45955 -= jM45956 + 8;
                c20359.m45952(jM45963);
            } else {
                try {
                    int iM50217 = (int) (m50217(c20359, jM45963) - c20359.m45963());
                    if (iM50217 <= 16777216) {
                        return m50219(c20359.m45953(iM50217), c20359.m45961(), c20359, interfaceC18588);
                    }
                    throw new C22271("Signer sequence exceeds safety limit");
                } catch (RuntimeException | C22271 | Exception unused) {
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m50219(byte[] bArr, InterfaceC9866 interfaceC9866, C20359 c20359, InterfaceC18588 interfaceC18588) throws IOException, CertificateException, C22271 {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        while (byteBufferOrder.position() < byteBufferOrder.limit()) {
            ByteBuffer byteBufferM26607 = C11542.m26607(byteBufferOrder);
            byte[] bArrM26608 = C11542.m26608(byteBufferM26607);
            ByteBuffer byteBufferM26608 = C11542.m26607(byteBufferM26607);
            byte[] bArrM26609 = C11542.m26608(byteBufferM26607);
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            ByteBuffer byteBufferOrder2 = ByteBuffer.wrap(bArrM26608).order(ByteOrder.LITTLE_ENDIAN);
            ByteBuffer byteBufferM26609 = C11542.m26607(byteBufferOrder2);
            while (byteBufferM26609.hasRemaining()) {
                ByteBuffer byteBufferM266010 = C11542.m26607(byteBufferM26609);
                if (map.put(Integer.valueOf(byteBufferM266010.getInt()), C11542.m26608(byteBufferM266010)) != null) {
                    return false;
                }
            }
            ByteBuffer byteBufferM266011 = C11542.m26607(byteBufferOrder2);
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            while (byteBufferM266011.hasRemaining()) {
                arrayList.add((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(C11542.m26608(byteBufferM266011))));
            }
            C11542.m26607(byteBufferOrder2);
            ArrayList<C8959> arrayList2 = new ArrayList();
            while (byteBufferM26608.hasRemaining()) {
                ByteBuffer byteBufferM266012 = C11542.m26607(byteBufferM26608);
                int i = byteBufferM266012.getInt();
                byte[] bArrM266010 = C11542.m26608(byteBufferM266012);
                if (AbstractC16964.f50193.containsKey(Integer.valueOf(i))) {
                    arrayList2.add(new C8959(i, bArrM266010));
                }
            }
            if (!arrayList2.isEmpty()) {
                for (C8959 c8959 : arrayList2) {
                    AbstractC16964 abstractC16964M38556 = AbstractC16964.m38556(c8959.f24276);
                    try {
                        if (abstractC16964M38556.m38558(KeyFactory.getInstance(abstractC16964M38556.mo6339()).generatePublic(new X509EncodedKeySpec(bArrM26609)), bArrM26608, c8959.f24277) && Arrays.equals(bArrM26609, ((X509Certificate) arrayList.get(0)).getPublicKey().getEncoded())) {
                        }
                    } catch (NoSuchAlgorithmException unused) {
                    }
                }
                C3574 c3574M17547 = C7598.m17547(interfaceC9866, 0L, c20359.m45960());
                C3574 c3574M17548 = C7598.m17547(interfaceC9866, c20359.m45951(), c20359.m45957());
                long jM45962 = c20359.m45962();
                C10951 c10951M14196 = C6257.m14196(C7598.m17547(interfaceC9866, jM45962, c20359.m45954() - jM45962));
                int iM45951 = (int) (c20359.m45951() - c20359.m45960());
                byte[] bArrM25233 = c10951M14196.m25233();
                int iM25232 = c10951M14196.m25232() + 16;
                C24185.m53472(C24185.m53468(iM25232, bArrM25233) - ((long) iM45951), iM25232, bArrM25233);
                boolean z = false;
                for (C8959 c89510 : arrayList2) {
                    AbstractC16964 abstractC16964M38557 = AbstractC16964.m38556(c89510.f24276);
                    if (z) {
                        InterfaceC2903[] interfaceC2903Arr = {c3574M17547, c3574M17548, c10951M14196};
                        for (int i2 = 0; i2 < 3; i2++) {
                            interfaceC2903Arr[i2].reset();
                        }
                    }
                    abstractC16964M38557.mo6338(c3574M17547, c3574M17548, c10951M14196, interfaceC18588);
                    if (!interfaceC18588.mo3924() && Arrays.equals(abstractC16964M38557.f50194, (byte[]) map.get(Integer.valueOf(c89510.f24276)))) {
                        z = true;
                    }
                }
            }
            return false;
        }
        return true;
    }
}
