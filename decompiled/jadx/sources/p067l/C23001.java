package p067l;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩸ܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6B02 */
/* JADX INFO: loaded from: classes.dex */
public final class C23001 {

    /* JADX INFO: renamed from: ֫ */
    public final int f72373;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f72374;

    public C23001(ArrayList arrayList, int i) {
        this.f72373 = i;
        this.f72374 = arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23001 m51389(byte[] bArr) throws IOException {
        int iMo6340;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        ByteBuffer byteBufferOrder = byteBufferWrap.order(byteOrder);
        ArrayList arrayList = new ArrayList();
        C17575 c17575 = null;
        if (byteBufferOrder == null || !byteBufferOrder.hasRemaining()) {
            arrayList = null;
        } else {
            if (byteBufferOrder.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int i = 0;
            try {
                if (byteBufferOrder.getInt() != 1) {
                    throw new IllegalArgumentException("Encoded SigningCertificateLineage has a version different than any of which we are aware");
                }
                HashSet hashSet = new HashSet();
                int i2 = 0;
                while (byteBufferOrder.hasRemaining()) {
                    i++;
                    ByteBuffer byteBufferM26607 = C11542.m26607(byteBufferOrder);
                    ByteBuffer byteBufferM26608 = C11542.m26607(byteBufferM26607);
                    int i3 = byteBufferM26607.getInt();
                    int i4 = byteBufferM26607.getInt();
                    AbstractC16964 abstractC16964M38554 = AbstractC16964.m38554(i2);
                    byte[] bArrM26608 = C11542.m26608(byteBufferM26607);
                    if (c17575 != null) {
                        C12826.requireNonNull(abstractC16964M38554);
                        String strMo6342 = abstractC16964M38554.mo6342();
                        AlgorithmParameterSpec algorithmParameterSpecMo6341 = abstractC16964M38554.mo6341();
                        PublicKey publicKey = c17575.getPublicKey();
                        Signature signature = Signature.getInstance(strMo6342);
                        signature.initVerify(publicKey);
                        if (algorithmParameterSpecMo6341 != null) {
                            signature.setParameter(algorithmParameterSpecMo6341);
                        }
                        signature.update(byteBufferM26608);
                        if (!signature.verify(bArrM26608)) {
                            throw new SecurityException("Unable to verify signature of certificate #" + i + " using " + strMo6342 + " when verifying V3SigningCertificateLineage object");
                        }
                    }
                    byteBufferM26608.rewind();
                    byte[] bArrM26609 = C11542.m26608(byteBufferM26608);
                    int i5 = byteBufferM26608.getInt();
                    if (c17575 != null && i2 != i5) {
                        throw new SecurityException("Signing algorithm ID mismatch for certificate #" + byteBufferM26607 + " when verifying V3SigningCertificateLineage object");
                    }
                    C17575 c17576 = new C17575(C4836.m10262(bArrM26609), bArrM26609);
                    if (hashSet.contains(c17576)) {
                        throw new SecurityException("Encountered duplicate entries in SigningCertificateLineage at certificate #" + i + ".  All signing certificates should be unique");
                    }
                    hashSet.add(c17576);
                    arrayList.add(new C4936(c17576, AbstractC16964.m38554(i5), AbstractC16964.m38554(i4), bArrM26608, i3));
                    byteBufferOrder = byteBufferOrder;
                    c17575 = c17576;
                    i2 = i4;
                }
            } catch (BufferUnderflowException e) {
                e = e;
                throw new IOException("Failed to parse V3SigningCertificateLineage object", e);
            } catch (InvalidAlgorithmParameterException e2) {
                e = e2;
                throw new SecurityException(C19768.m44906(0, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
            } catch (InvalidKeyException e3) {
                e = e3;
                throw new SecurityException(C19768.m44906(0, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
            } catch (NoSuchAlgorithmException e4) {
                e = e4;
                throw new SecurityException(C19768.m44906(0, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
            } catch (SignatureException e5) {
                e = e5;
                throw new SecurityException(C19768.m44906(0, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
            } catch (CertificateException e6) {
                throw new SecurityException(C19768.m44906(0, "Failed to decode certificate #", " when parsing V3SigningCertificateLineage object"), e6);
            } catch (C22271 e7) {
                e = e7;
                throw new IOException("Failed to parse V3SigningCertificateLineage object", e);
            }
        }
        if (arrayList == null) {
            throw new IllegalArgumentException("Can't calculate minimum SDK version of null nodes");
        }
        Iterator it = arrayList.iterator();
        int i6 = 28;
        while (it.hasNext()) {
            AbstractC16964 abstractC16964 = ((C4936) it.next()).f11238;
            if (abstractC16964 != null && (iMo6340 = abstractC16964.mo6340()) > i6) {
                i6 = iMo6340;
            }
        }
        return new C23001(arrayList, i6);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m51390() {
        return this.f72374.size();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23001 m51391(X509Certificate x509Certificate) {
        if (x509Certificate == null) {
            throw new NullPointerException("x509Certificate == null");
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f72374;
            if (i < arrayList.size()) {
                if (((C4936) arrayList.get(i)).f11239.equals(x509Certificate)) {
                    return new C23001(new ArrayList(arrayList.subList(0, i + 1)), this.f72373);
                }
                i++;
            } else {
                throw new IllegalArgumentException("Certificate not found in SigningCertificateLineage");
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23001 m51388(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int size = ((C23001) list.get(i3)).f72374.size();
            if (size > i2) {
                i = i3;
                i2 = size;
            }
        }
        ArrayList arrayList = ((C23001) list.get(i)).f72374;
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (i4 != i) {
                ArrayList arrayList2 = ((C23001) list.get(i4)).f72374;
                if (!arrayList2.equals(arrayList.subList(0, arrayList2.size()))) {
                    throw new IllegalArgumentException("Inconsistent SigningCertificateLineages. Not all lineages are subsets of each other.");
                }
            }
        }
        return (C23001) list.get(i);
    }
}
