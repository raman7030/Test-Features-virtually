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

/* JADX INFO: renamed from: l.ܺᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: PB28 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17675 {
    /* JADX INFO: renamed from: ֫ */
    public static C1349 m40204(C20359 c20359, boolean z, byte[] bArr) throws EOFException {
        if (!c20359.m45959()) {
            return null;
        }
        c20359.m45952(c20359.m45960());
        long jM45955 = c20359.m45955() - 24;
        int i = z ? 462663009 : -262969152;
        while (jM45955 > 0 && jM45955 >= 12) {
            long jM45956 = c20359.m45955();
            if (jM45956 < 4 || jM45956 > jM45955 - 8) {
                return null;
            }
            long jM45963 = c20359.m45963() + jM45956;
            if (c20359.m45956() == i) {
                try {
                    return m40203(c20359, jM45963, bArr);
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
    public static C1349 m40203(C20359 c20359, long j, byte[] bArr) throws EOFException, C22271 {
        long jM50217 = C22371.m50217(c20359, C22371.m50217(c20359, j));
        long jM50218 = C22371.m50217(c20359, jM50217);
        c20359.m45952(C22371.m50217(c20359, jM50218));
        byte[] bArrM50222 = C22371.m50222(c20359, C22371.m50217(c20359, jM50218), bArr);
        if (bArrM50222 == null) {
            return null;
        }
        if (jM50218 - c20359.m45963() < 12) {
            throw new C22271("V3 signed data is missing SDK range or attributes");
        }
        int iM45956 = c20359.m45956();
        int iM45957 = c20359.m45956();
        long jM50219 = C22371.m50217(c20359, jM50218);
        long jM45963 = c20359.m45963();
        long j2 = 0;
        while (true) {
            byte[] bArr2 = bArrM50222;
            int i = iM45957;
            if (c20359.m45963() >= jM50219) {
                c20359.m45952(jM45963);
                C23001 c23001M51388 = null;
                while (c20359.m45963() < jM50219) {
                    long jM502110 = C22371.m50217(c20359, jM50219);
                    if (jM502110 - c20359.m45963() < 4) {
                        throw new C22271("V3 signing attribute is missing its ID");
                    }
                    if (c20359.m45956() != 1000370060) {
                        c20359.m45952(jM502110);
                    } else {
                        try {
                            C23001 c23001M51389 = C23001.m51389(c20359.m45953((int) (jM502110 - c20359.m45963())));
                            c23001M51388 = c23001M51388 == null ? c23001M51389 : C23001.m51388(Arrays.asList(c23001M51388, c23001M51389));
                        } catch (Exception e) {
                            throw new C22271("Failed to parse V3 signing certificate lineage", e);
                        }
                    }
                }
                c20359.m45952(jM50218);
                if (jM50217 - c20359.m45963() < 16) {
                    throw new C22271("V3 signer is missing SDK range, signatures, or public key");
                }
                int iM45958 = c20359.m45956();
                int iM45959 = c20359.m45956();
                if (iM45956 != iM45958 || i != iM45959) {
                    throw new C22271("V3 signer SDK range does not match signed data");
                }
                c20359.m45952(C22371.m50217(c20359, jM50217));
                c20359.m45952(C22371.m50217(c20359, jM50217));
                return new C1349(bArr2, c23001M51388);
            }
            long jM502111 = C22371.m50217(c20359, jM50219);
            if (jM502111 - c20359.m45963() < 4) {
                throw new C22271("V3 signing attribute is missing its ID");
            }
            if (c20359.m45956() == 1000370060) {
                long jM45964 = (jM502111 - c20359.m45963()) + j2;
                if (jM45964 > 4194304) {
                    throw new C22271("V3 proof-of-rotation data exceeds safety limit");
                }
                j2 = jM45964;
            }
            c20359.m45952(jM502111);
            bArrM50222 = bArr2;
            iM45957 = i;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m40205(C20359 c20359, boolean z, InterfaceC18588 interfaceC18588) throws EOFException {
        if (!c20359.m45959()) {
            return false;
        }
        c20359.m45952(c20359.m45960());
        long jM45955 = c20359.m45955() - 24;
        int i = z ? 462663009 : -262969152;
        while (jM45955 > 0 && jM45955 >= 12) {
            long jM45956 = c20359.m45955();
            if (jM45956 < 4 || jM45956 > jM45955 - 8) {
                return false;
            }
            long jM45963 = c20359.m45963() + jM45956;
            if (c20359.m45956() == i) {
                try {
                    int iM50217 = (int) (C22371.m50217(c20359, jM45963) - c20359.m45963());
                    if (iM50217 <= 16777216) {
                        return m40206(c20359.m45953(iM50217), c20359.m45961(), c20359, interfaceC18588);
                    }
                    throw new C22271("Signer sequence exceeds safety limit");
                } catch (RuntimeException | C22271 | Exception unused) {
                    return false;
                }
            }
            jM45955 -= jM45956 + 8;
            c20359.m45952(jM45963);
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m40206(byte[] bArr, InterfaceC9866 interfaceC9866, C20359 c20359, InterfaceC18588 interfaceC18588) throws IOException, CertificateException, C22271 {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        while (byteBufferOrder.position() < byteBufferOrder.limit()) {
            ByteBuffer byteBufferM26607 = C11542.m26607(byteBufferOrder);
            byte[] bArrM26608 = C11542.m26608(byteBufferM26607);
            int i = byteBufferM26607.getInt();
            int i2 = byteBufferM26607.getInt();
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
            int i3 = byteBufferOrder2.getInt();
            int i4 = byteBufferOrder2.getInt();
            C11542.m26607(byteBufferOrder2);
            if (i3 == i && i4 == i2) {
                ArrayList<C10971> arrayList2 = new ArrayList();
                while (byteBufferM26608.hasRemaining()) {
                    ByteBuffer byteBufferM266012 = C11542.m26607(byteBufferM26608);
                    int i5 = byteBufferM266012.getInt();
                    byte[] bArrM266010 = C11542.m26608(byteBufferM266012);
                    if (AbstractC16964.f50193.containsKey(Integer.valueOf(i5))) {
                        arrayList2.add(new C10971(i5, bArrM266010));
                    }
                }
                if (!arrayList2.isEmpty()) {
                    for (C10971 c10971 : arrayList2) {
                        AbstractC16964 abstractC16964M38556 = AbstractC16964.m38556(c10971.f30388);
                        try {
                            if (abstractC16964M38556.m38558(KeyFactory.getInstance(abstractC16964M38556.mo6339()).generatePublic(new X509EncodedKeySpec(bArrM26609)), bArrM26608, c10971.f30389) && Arrays.equals(bArrM26609, ((X509Certificate) arrayList.get(0)).getPublicKey().getEncoded())) {
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
                    for (C10971 c10972 : arrayList2) {
                        AbstractC16964 abstractC16964M38557 = AbstractC16964.m38556(c10972.f30388);
                        if (z) {
                            InterfaceC2903[] interfaceC2903Arr = {c3574M17547, c3574M17548, c10951M14196};
                            for (int i6 = 0; i6 < 3; i6++) {
                                interfaceC2903Arr[i6].reset();
                            }
                        }
                        abstractC16964M38557.mo6338(c3574M17547, c3574M17548, c10951M14196, interfaceC18588);
                        if (!interfaceC18588.mo3924() && Arrays.equals(abstractC16964M38557.f50194, (byte[]) map.get(Integer.valueOf(c10972.f30388)))) {
                            z = true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
}
