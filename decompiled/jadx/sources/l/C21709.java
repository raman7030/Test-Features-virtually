package l;

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
public final class C21709 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f69668;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f69669;

    public C21709(ArrayList arrayList, int i) {
        this.f69668 = i;
        this.f69669 = arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21709 m49040(byte[] bArr) throws IOException {
        int iMo4096;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        ByteBuffer byteBufferOrder = byteBufferWrap.order(byteOrder);
        ArrayList arrayList = new ArrayList();
        C16000 c16000 = null;
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
                    ByteBuffer byteBufferM24593 = C9652.m24593(byteBufferOrder);
                    ByteBuffer byteBufferM24594 = C9652.m24593(byteBufferM24593);
                    int i3 = byteBufferM24593.getInt();
                    int i4 = byteBufferM24593.getInt();
                    AbstractC15357 abstractC15357M36396 = AbstractC15357.m36396(i2);
                    byte[] bArrM24594 = C9652.m24594(byteBufferM24593);
                    if (c16000 != null) {
                        C11003.requireNonNull(abstractC15357M36396);
                        String strMo4098 = abstractC15357M36396.mo4098();
                        AlgorithmParameterSpec algorithmParameterSpecMo4097 = abstractC15357M36396.mo4097();
                        PublicKey publicKey = c16000.getPublicKey();
                        Signature signature = Signature.getInstance(strMo4098);
                        signature.initVerify(publicKey);
                        if (algorithmParameterSpecMo4097 != null) {
                            signature.setParameter(algorithmParameterSpecMo4097);
                        }
                        signature.update(byteBufferM24594);
                        if (!signature.verify(bArrM24594)) {
                            throw new SecurityException("Unable to verify signature of certificate #" + i + " using " + strMo4098 + " when verifying V3SigningCertificateLineage object");
                        }
                    }
                    byteBufferM24594.rewind();
                    byte[] bArrM24595 = C9652.m24594(byteBufferM24594);
                    int i5 = byteBufferM24594.getInt();
                    if (c16000 != null && i2 != i5) {
                        throw new SecurityException("Signing algorithm ID mismatch for certificate #" + byteBufferM24593 + " when verifying V3SigningCertificateLineage object");
                    }
                    C16000 c16001 = new C16000(C2596.m8223(bArrM24595), bArrM24595);
                    if (hashSet.contains(c16001)) {
                        throw new SecurityException("Encountered duplicate entries in SigningCertificateLineage at certificate #" + i + ".  All signing certificates should be unique");
                    }
                    hashSet.add(c16001);
                    arrayList.add(new C2701(c16001, AbstractC15357.m36396(i5), AbstractC15357.m36396(i4), bArrM24594, i3));
                    byteBufferOrder = byteBufferOrder;
                    c16000 = c16001;
                    i2 = i4;
                }
            } catch (BufferUnderflowException e) {
                e = e;
                throw new IOException("Failed to parse V3SigningCertificateLineage object", e);
            } catch (InvalidAlgorithmParameterException e2) {
                e = e2;
                throw new SecurityException(C18307.m42645(0, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
            } catch (InvalidKeyException e3) {
                e = e3;
                throw new SecurityException(C18307.m42645(0, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
            } catch (NoSuchAlgorithmException e4) {
                e = e4;
                throw new SecurityException(C18307.m42645(0, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
            } catch (SignatureException e5) {
                e = e5;
                throw new SecurityException(C18307.m42645(0, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
            } catch (CertificateException e6) {
                throw new SecurityException(C18307.m42645(0, "Failed to decode certificate #", " when parsing V3SigningCertificateLineage object"), e6);
            } catch (C20941 e7) {
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
            AbstractC15357 abstractC15357 = ((C2701) it.next()).f8444;
            if (abstractC15357 != null && (iMo4096 = abstractC15357.mo4096()) > i6) {
                i6 = iMo4096;
            }
        }
        return new C21709(arrayList, i6);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m49041() {
        return this.f69669.size();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21709 m49042(X509Certificate x509Certificate) {
        if (x509Certificate == null) {
            throw new NullPointerException("x509Certificate == null");
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f69669;
            if (i < arrayList.size()) {
                if (((C2701) arrayList.get(i)).f8445.equals(x509Certificate)) {
                    return new C21709(new ArrayList(arrayList.subList(0, i + 1)), this.f69668);
                }
                i++;
            } else {
                throw new IllegalArgumentException("Certificate not found in SigningCertificateLineage");
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21709 m49039(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int size = ((C21709) list.get(i3)).f69669.size();
            if (size > i2) {
                i = i3;
                i2 = size;
            }
        }
        ArrayList arrayList = ((C21709) list.get(i)).f69669;
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (i4 != i) {
                ArrayList arrayList2 = ((C21709) list.get(i4)).f69669;
                if (!arrayList2.equals(arrayList.subList(0, arrayList2.size()))) {
                    throw new IllegalArgumentException("Inconsistent SigningCertificateLineages. Not all lineages are subsets of each other.");
                }
            }
        }
        return (C21709) list.get(i);
    }
}
