package p067l;

import com.umeng.analytics.pro.C0698cb;
import java.math.BigInteger;
import java.util.ArrayList;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.util.encoders.Base32Encoder;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۖۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7X1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4690 extends AbstractC19442 {

    /* JADX INFO: renamed from: ۖ */
    public AbstractC19442 f10587;

    /* JADX INFO: renamed from: ܰ */
    public static final byte[] f10578 = {42, -122, 72, -122, -9, C0698cb.f2569k, 1, 1, 1};

    /* JADX INFO: renamed from: ֨ */
    public static final byte[] f10564 = {42, -122, 72, -50, 56, 4, 1};

    /* JADX INFO: renamed from: ۠ */
    public static final byte[] f10572 = {42, -122, 72, -50, Base32Encoder.DEFAULT_PADDING, 2, 1};

    /* JADX INFO: renamed from: ܶ */
    public static final byte[] f10579 = {43, 101, KeyFactorySpi.Ed25519_type};

    /* JADX INFO: renamed from: ᩸ */
    public static final byte[] f10584 = {43, 101, KeyFactorySpi.Ed448_type};

    /* JADX INFO: renamed from: ֫֫ */
    public static final byte[] f10565 = {42, -122, 72, -50, Base32Encoder.DEFAULT_PADDING, 3, 1, 7};

    /* JADX INFO: renamed from: ۧ֫ */
    public static final byte[] f10574 = {43, -127, 4, 0, 34};

    /* JADX INFO: renamed from: ܽ֫ */
    public static final byte[] f10580 = {43, -127, 4, 0, 35};

    /* JADX INFO: renamed from: ۤ */
    public static final byte[] f10573 = {42, -122, 72, -122, -9, C0698cb.f2569k, 1, 5, C0698cb.f2569k};

    /* JADX INFO: renamed from: ۛ */
    public static final byte[] f10570 = {42, -122, 72, -122, -9, C0698cb.f2569k, 1, 5, 12};

    /* JADX INFO: renamed from: ۟ */
    public static final byte[] f10571 = {43, 6, 1, 4, 1, -38, 71, 4, 11};

    /* JADX INFO: renamed from: ۘ */
    public static final byte[] f10567 = {UTF8.S_P4B, -122, 72, 1, 101, 3, 4, 1, 2};

    /* JADX INFO: renamed from: ᩴ */
    public static final byte[] f10581 = {UTF8.S_P4B, -122, 72, 1, 101, 3, 4, 1, 22};

    /* JADX INFO: renamed from: ᩵ */
    public static final byte[] f10582 = {UTF8.S_P4B, -122, 72, 1, 101, 3, 4, 1, 42};

    /* JADX INFO: renamed from: ۚ */
    public static final byte[] f10569 = {43, C0698cb.f2570l, 3, 2, 7};

    /* JADX INFO: renamed from: ֡ */
    public static final byte[] f10563 = {42, -122, 72, -122, -9, C0698cb.f2569k, 3, 7};

    /* JADX INFO: renamed from: ۨ */
    public static final byte[] f10575 = {42, -122, 72, -122, -9, C0698cb.f2569k, 3, 2};

    /* JADX INFO: renamed from: ᩺ */
    public static final byte[] f10586 = {42, -122, 72, -122, -9, C0698cb.f2569k, 3, 9};

    /* JADX INFO: renamed from: ᩹ */
    public static final byte[] f10585 = {42, -122, 72, -122, -9, C0698cb.f2569k, 1, 5, 1};

    /* JADX INFO: renamed from: ᩶ */
    public static final byte[] f10583 = {42, -122, 72, -122, -9, C0698cb.f2569k, 1, 5, 4};

    /* JADX INFO: renamed from: ۙ */
    public static final byte[] f10568 = {42, -122, 72, -122, -9, C0698cb.f2569k, 1, 5, 3};

    /* JADX INFO: renamed from: ۗ */
    public static final byte[] f10566 = {42, -122, 72, -122, -9, C0698cb.f2569k, 1, 5, 6};

    /* JADX INFO: renamed from: ۬ */
    public static final byte[] f10577 = {42, -122, 72, -122, -9, C0698cb.f2569k, 1, 5, 10};

    /* JADX INFO: renamed from: ۫ */
    public static final byte[] f10576 = {42, -122, 72, -122, -9, C0698cb.f2569k, 1, 5, 11};

    static {
        C20764.m46893("-----BEGIN DSA PRIVATE KEY-----");
        C20764.m46893("-----END DSA PRIVATE KEY-----");
    }

    public C4690(C23780 c23780) {
        super(c23780);
        this.f10587 = null;
    }

    /* JADX WARN: Code duplicated, block: B:295:0x04ba A[PHI: r2 r3 r5 r9
      0x04ba: PHI (r2v8 java.lang.Object) = (r2v120 java.lang.Object), (r2v121 java.lang.Object) binds: [B:289:0x04a1, B:294:0x04b8] A[DONT_GENERATE, DONT_INLINE]
      0x04ba: PHI (r3v10 l.ᩳۢۘ) = (r3v81 l.ᩳۢۘ), (r3v82 l.ᩳۢۘ) binds: [B:289:0x04a1, B:294:0x04b8] A[DONT_GENERATE, DONT_INLINE]
      0x04ba: PHI (r5v7 byte[]) = (r5v5 byte[]), (r5v8 byte[]) binds: [B:289:0x04a1, B:294:0x04b8] A[DONT_GENERATE, DONT_INLINE]
      0x04ba: PHI (r9v8 ??) = (r9v59 ??), (r9v60 ??) binds: [B:289:0x04a1, B:294:0x04b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:301:0x04d0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v128 */
    /* JADX WARN: Type inference failed for: r2v129 */
    /* JADX WARN: Type inference failed for: r2v5, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [l.ᩳۢۘ] */
    /* JADX WARN: Type inference failed for: r3v89 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r9v52 */
    /* JADX WARN: Type inference failed for: r9v53 */
    /* JADX WARN: Type inference failed for: r9v56 */
    /* JADX WARN: Type inference failed for: r9v57 */
    /* JADX WARN: Type inference failed for: r9v58 */
    /* JADX WARN: Type inference failed for: r9v59 */
    /* JADX WARN: Type inference failed for: r9v6, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r9v60 */
    /* JADX WARN: Type inference failed for: r9v61 */
    /* JADX WARN: Type inference failed for: r9v62 */
    /* JADX WARN: Type inference failed for: r9v63 */
    /* JADX WARN: Type inference failed for: r9v64 */
    /* JADX WARN: Type inference failed for: r9v65 */
    /* JADX WARN: Type inference failed for: r9v66 */
    /* JADX WARN: Type inference failed for: r9v67 */
    /* JADX WARN: Type inference failed for: r9v68 */
    /* JADX WARN: Type inference failed for: r9v69 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v70 */
    /* JADX WARN: Type inference failed for: r9v71 */
    /* JADX WARN: Type inference failed for: r9v72 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [byte[]] */
    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo9933(byte[] bArr) throws Throwable {
        ?? r2;
        ?? r3;
        ?? r9;
        byte[] bArr2;
        AbstractC19442 abstractC19442;
        ?? r10;
        byte[] bArr3;
        AbstractC19442 abstractC19443;
        ?? r11;
        ?? r12;
        ?? r13;
        AbstractC19442 abstractC19444;
        Object obj;
        Object obj2;
        C8713 c8713;
        byte[] bArr4;
        C8713 c8714;
        byte[] bArr5;
        C8713 c8715;
        ?? r14;
        ?? r15;
        ?? r16;
        Object obj3;
        Object obj4;
        AbstractC19442 abstractC19445;
        byte[] bArr6;
        AbstractC19442 abstractC19446;
        byte[] bArr7;
        Object obj5;
        C8713 c8716;
        byte[] bArr8;
        C8713 c8717;
        byte[] bArr9;
        C8713 c8718;
        byte[] bArrM46893;
        C7352 c7352;
        byte[] bArrM17037;
        C18771 c18771;
        C23780 c23780 = this.f59228;
        Object obj6 = "unsupported privateKeyAlgorithm oid: ";
        Object obj7 = "unsupported named curve oid: ";
        byte[] bArr10 = null;
        ?? r5 = 0;
        ?? r6 = 0;
        ?? r7 = 0;
        bArr10 = null;
        bArr10 = null;
        byte[] bArr11 = null;
        try {
            try {
                C7352 c7353 = new C7352(bArr);
                if (!c7353.m17044()) {
                    throw new C3328();
                }
                C7352[] c7352ArrM17039 = c7353.m17039();
                if (c7352ArrM17039.length >= 3) {
                    ?? r17 = 4;
                    ?? r18 = 4;
                    ?? r19 = 4;
                    if (c7352ArrM17039.length <= 4) {
                        if (!c7352ArrM17039[0].m17040()) {
                            throw new C3328();
                        }
                        if (!c7352ArrM17039[1].m17044()) {
                            throw new C3328();
                        }
                        if (!c7352ArrM17039[2].m17038()) {
                            throw new C3328();
                        }
                        if (c7352ArrM17039.length > 3 && !c7352ArrM17039[3].m17036(0)) {
                            throw new C3328();
                        }
                        if (C7352.m17034(c7352ArrM17039[0].m17037()) != 0) {
                            throw new C3328();
                        }
                        C7352 c7354 = c7352ArrM17039[1];
                        C7352 c7355 = c7352ArrM17039[2];
                        C7352[] c7352ArrM170310 = c7354.m17039();
                        if (c7352ArrM170310.length == 0) {
                            throw new C3328();
                        }
                        if (!c7352ArrM170310[0].m17045()) {
                            throw new C3328();
                        }
                        byte[] bArrM17038 = c7352ArrM170310[0].m17037();
                        byte[] bArrM17039 = c7355.m17037();
                        try {
                            if (C20764.m46885(bArrM17038, f10578)) {
                                if (c7352ArrM170310.length != 2) {
                                    throw new C3328();
                                }
                                if (!(c7352ArrM170310[1].m17043() == 5)) {
                                    throw new C3328();
                                }
                                C6031 c6031 = new C6031(c23780);
                                c6031.m44227(this);
                                if (!c6031.mo9933(bArrM17039)) {
                                    throw new C14392("failed to parse RSA");
                                }
                                this.f10587 = c6031;
                                C20764.m46890(bArrM17039);
                                return true;
                            }
                            if (C20764.m46885(bArrM17038, f10564)) {
                                ArrayList arrayList = new ArrayList(3);
                                if (c7352ArrM170310.length > 1 && c7352ArrM170310[1].m17044()) {
                                    C7352[] c7352ArrM170311 = c7352ArrM170310[1].m17039();
                                    if (c7352ArrM170311.length != 3) {
                                        throw new C3328();
                                    }
                                    if (!c7352ArrM170311[0].m17040()) {
                                        throw new C3328();
                                    }
                                    if (!c7352ArrM170311[1].m17040()) {
                                        throw new C3328();
                                    }
                                    if (!c7352ArrM170311[2].m17040()) {
                                        throw new C3328();
                                    }
                                    arrayList.add(c7352ArrM170311[0].m17037());
                                    arrayList.add(c7352ArrM170311[1].m17037());
                                    arrayList.add(c7352ArrM170311[2].m17037());
                                }
                                C7352 c7356 = new C7352(bArrM17039);
                                if (arrayList.size() == 0) {
                                    if (!c7356.m17044()) {
                                        throw new C3328();
                                    }
                                    C7352[] c7352ArrM170312 = c7356.m17039();
                                    if (c7352ArrM170312.length != 2) {
                                        throw new C3328();
                                    }
                                    if (!c7352ArrM170312[0].m17044()) {
                                        throw new C3328();
                                    }
                                    if (!c7352ArrM170312[1].m17040()) {
                                        throw new C3328();
                                    }
                                    byte[] bArrM170310 = c7352ArrM170312[1].m17037();
                                    try {
                                        C7352[] c7352ArrM170313 = c7352ArrM170312[0].m17039();
                                        if (c7352ArrM170313.length != 3) {
                                            throw new C3328();
                                        }
                                        if (!c7352ArrM170313[0].m17040()) {
                                            throw new C3328();
                                        }
                                        if (!c7352ArrM170313[1].m17040()) {
                                            throw new C3328();
                                        }
                                        if (!c7352ArrM170313[2].m17040()) {
                                            throw new C3328();
                                        }
                                        arrayList.add(c7352ArrM170313[0].m17037());
                                        arrayList.add(c7352ArrM170313[1].m17037());
                                        arrayList.add(c7352ArrM170313[2].m17037());
                                        bArrM17037 = bArrM170310;
                                    } catch (C3328 unused) {
                                        bArr7 = null;
                                        abstractC19446 = null;
                                        r16 = bArrM170310;
                                        bArr10 = bArrM17039;
                                        bArr3 = bArr7;
                                        abstractC19443 = abstractC19446;
                                        r11 = r16;
                                        c23780.getClass();
                                        C21769.f68542.getClass();
                                        C20764.m46890(bArr10);
                                        C20764.m46890((byte[]) r11);
                                        C20764.m46890(bArr3);
                                        obj = bArr3;
                                        abstractC19444 = abstractC19443;
                                        r13 = r11;
                                        obj6 = bArr3;
                                        obj7 = abstractC19443;
                                        r12 = r11;
                                        if (abstractC19443 != null) {
                                            abstractC19444.mo13547();
                                            obj6 = obj;
                                            obj7 = abstractC19444;
                                            r12 = r13;
                                        }
                                        return false;
                                    } catch (Exception unused2) {
                                        bArr6 = null;
                                        abstractC19445 = null;
                                        r15 = bArrM170310;
                                        bArr10 = bArrM17039;
                                        bArr2 = bArr6;
                                        abstractC19442 = abstractC19445;
                                        r10 = r15;
                                        c23780.getClass();
                                        C21769.f68542.getClass();
                                        C20764.m46890(bArr10);
                                        C20764.m46890((byte[]) r10);
                                        C20764.m46890(bArr2);
                                        obj = bArr2;
                                        abstractC19444 = abstractC19442;
                                        r13 = r10;
                                        obj6 = bArr2;
                                        obj7 = abstractC19442;
                                        r12 = r10;
                                        if (abstractC19442 != null) {
                                            abstractC19444.mo13547();
                                            obj6 = obj;
                                            obj7 = abstractC19444;
                                            r12 = r13;
                                        }
                                        return false;
                                    } catch (Throwable th) {
                                        th = th;
                                        obj4 = null;
                                        obj3 = null;
                                        r14 = bArrM170310;
                                        bArr11 = bArrM17039;
                                        r2 = obj4;
                                        r3 = obj3;
                                        r9 = r14;
                                        C20764.m46890(bArr11);
                                        C20764.m46890((byte[]) r9);
                                        C20764.m46890((byte[]) r2);
                                        if (r3 != 0) {
                                            r3.mo13547();
                                        }
                                        throw th;
                                    }
                                } else {
                                    if (!c7356.m17040()) {
                                        throw new C3328();
                                    }
                                    bArrM17037 = c7356.m17037();
                                }
                                try {
                                    byte[] bArr12 = (byte[]) arrayList.get(0);
                                    byte[] bArr13 = (byte[]) arrayList.get(1);
                                    byte[] bArr14 = (byte[]) arrayList.get(2);
                                    c18771 = new C18771(this.f59228, bArr12, bArr13, bArr14, new BigInteger(bArr14).modPow(new BigInteger(bArrM17037), new BigInteger(bArr12)).toByteArray(), bArrM17037);
                                    try {
                                        byte[] bArrM42804 = c18771.m42804();
                                        C18771 c18772 = new C18771(c23780);
                                        c18772.m44227(this);
                                        if (!c18772.mo9933(bArrM42804)) {
                                            throw new C14392("failed to parse DSA");
                                        }
                                        this.f10587 = c18772;
                                        C20764.m46890(bArrM17039);
                                        C20764.m46890(bArrM17037);
                                        C20764.m46890(bArrM42804);
                                        c18771.mo13547();
                                        return true;
                                    } catch (C3328 unused3) {
                                        abstractC19446 = c18771;
                                        bArr7 = null;
                                        r16 = bArrM17037;
                                        bArr10 = bArrM17039;
                                        bArr3 = bArr7;
                                        abstractC19443 = abstractC19446;
                                        r11 = r16;
                                        c23780.getClass();
                                        C21769.f68542.getClass();
                                        C20764.m46890(bArr10);
                                        C20764.m46890((byte[]) r11);
                                        C20764.m46890(bArr3);
                                        obj = bArr3;
                                        abstractC19444 = abstractC19443;
                                        r13 = r11;
                                        obj6 = bArr3;
                                        obj7 = abstractC19443;
                                        r12 = r11;
                                        if (abstractC19443 != null) {
                                            abstractC19444.mo13547();
                                            obj6 = obj;
                                            obj7 = abstractC19444;
                                            r12 = r13;
                                        }
                                        return false;
                                    } catch (Exception unused4) {
                                        abstractC19445 = c18771;
                                        bArr6 = null;
                                        r15 = bArrM17037;
                                        bArr10 = bArrM17039;
                                        bArr2 = bArr6;
                                        abstractC19442 = abstractC19445;
                                        r10 = r15;
                                        c23780.getClass();
                                        C21769.f68542.getClass();
                                        C20764.m46890(bArr10);
                                        C20764.m46890((byte[]) r10);
                                        C20764.m46890(bArr2);
                                        obj = bArr2;
                                        abstractC19444 = abstractC19442;
                                        r13 = r10;
                                        obj6 = bArr2;
                                        obj7 = abstractC19442;
                                        r12 = r10;
                                        if (abstractC19442 != null) {
                                            abstractC19444.mo13547();
                                            obj6 = obj;
                                            obj7 = abstractC19444;
                                            r12 = r13;
                                        }
                                        return false;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        obj3 = c18771;
                                        obj4 = null;
                                        r14 = bArrM17037;
                                        bArr11 = bArrM17039;
                                        r2 = obj4;
                                        r3 = obj3;
                                        r9 = r14;
                                        C20764.m46890(bArr11);
                                        C20764.m46890((byte[]) r9);
                                        C20764.m46890((byte[]) r2);
                                        if (r3 != 0) {
                                            r3.mo13547();
                                        }
                                        throw th;
                                    }
                                } catch (C3328 unused5) {
                                    c18771 = null;
                                } catch (Exception unused6) {
                                    c18771 = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                    c18771 = null;
                                }
                            } else {
                                try {
                                    if (!C20764.m46885(bArrM17038, f10572)) {
                                        byte[] bArr15 = f10579;
                                        if (!C20764.m46885(bArrM17038, bArr15) && !C20764.m46885(bArrM17038, f10584)) {
                                            throw new C14392("unsupported privateKeyAlgorithm oid: " + C20764.m46895(bArrM17038));
                                        }
                                        if (c7352ArrM170310.length != 1) {
                                            throw new C3328();
                                        }
                                        C7352 c7357 = new C7352(bArrM17039);
                                        if (!c7357.m17038()) {
                                            throw new C3328();
                                        }
                                        byte[] bArrM170311 = c7357.m17037();
                                        AbstractC19442 c22125 = C20764.m46885(bArrM17038, bArr15) ? new C22125(c23780) : new C11396(c23780);
                                        c22125.m44227(this);
                                        if (!c22125.mo9933(bArrM170311)) {
                                            throw new C14392("failed to parse EdDSA");
                                        }
                                        this.f10587 = c22125;
                                        C20764.m46890(bArrM17039);
                                        C20764.m46890(bArrM170311);
                                        return true;
                                    }
                                    if (c7352ArrM170310.length != 2) {
                                        throw new C3328();
                                    }
                                    if (!c7352ArrM170310[1].m17045()) {
                                        throw new C3328();
                                    }
                                    byte[] bArrM170312 = c7352ArrM170310[1].m17037();
                                    if (!C20764.m46885(bArrM170312, f10565)) {
                                        bArrM46893 = C20764.m46893("nistp256");
                                    } else if (!C20764.m46885(bArrM170312, f10574)) {
                                        bArrM46893 = C20764.m46893("nistp384");
                                    } else {
                                        if (C20764.m46885(bArrM170312, f10580)) {
                                            throw new C14392("unsupported named curve oid: " + C20764.m46895(bArrM170312));
                                        }
                                        bArrM46893 = C20764.m46893("nistp521");
                                    }
                                    byte[] bArr16 = bArrM46893;
                                    C7352 c7358 = new C7352(bArrM17039);
                                    if (!c7358.m17044()) {
                                        throw new C3328();
                                    }
                                    C7352[] c7352ArrM170314 = c7358.m17039();
                                    if (c7352ArrM170314.length < 3 || c7352ArrM170314.length > 4) {
                                        throw new C3328();
                                    }
                                    if (!c7352ArrM170314[0].m17040()) {
                                        throw new C3328();
                                    }
                                    if (!c7352ArrM170314[1].m17038()) {
                                        throw new C3328();
                                    }
                                    if (C7352.m17034(c7352ArrM170314[0].m17037()) != 1) {
                                        throw new C3328();
                                    }
                                    byte[] bArrM170313 = c7352ArrM170314[1].m17037();
                                    if (c7352ArrM170314.length == 3) {
                                        c7352 = c7352ArrM170314[2];
                                    } else {
                                        C7352 c7359 = c7352ArrM170314[3];
                                        if (!c7352ArrM170314[2].m17036(0)) {
                                            throw new C3328();
                                        }
                                        C7352[] c7352ArrM170315 = c7352ArrM170314[2].m17039();
                                        if (c7352ArrM170315.length != 1) {
                                            throw new C3328();
                                        }
                                        if (!c7352ArrM170315[0].m17045()) {
                                            throw new C3328();
                                        }
                                        if (!C20764.m46885(c7352ArrM170315[0].m17037(), bArrM170312)) {
                                            throw new C3328();
                                        }
                                        c7352 = c7359;
                                    }
                                    if (!c7352.m17036(1)) {
                                        throw new C3328();
                                    }
                                    C7352[] c7352ArrM170316 = c7352.m17039();
                                    if (c7352ArrM170316.length != 1) {
                                        throw new C3328();
                                    }
                                    if (!c7352ArrM170316[0].m17042()) {
                                        throw new C3328();
                                    }
                                    byte[][] bArrM20158 = C8713.m20158(c7352ArrM170316[0].m17037());
                                    C8713 c8719 = new C8713(this.f59228, bArr16, bArrM20158[0], bArrM20158[1], bArrM170313);
                                    try {
                                        byte[] bArrM20159 = c8719.m20159();
                                        C8713 c87110 = new C8713(c23780);
                                        c87110.m44227(this);
                                        if (!c87110.mo9933(bArrM20159)) {
                                            throw new C14392("failed to parse ECDSA");
                                        }
                                        this.f10587 = c87110;
                                        C20764.m46890(bArrM17039);
                                        C20764.m46890(bArrM170313);
                                        C20764.m46890(bArrM20159);
                                        c8719.mo13547();
                                        return true;
                                    } catch (C3328 unused7) {
                                        c8718 = c8719;
                                        bArr9 = null;
                                        r18 = bArrM170313;
                                        r5 = r18;
                                        bArr5 = bArr9;
                                        c8715 = c8718;
                                        r16 = r5;
                                        bArr7 = bArr5;
                                        abstractC19446 = c8715;
                                        bArr10 = bArrM17039;
                                        bArr3 = bArr7;
                                        abstractC19443 = abstractC19446;
                                        r11 = r16;
                                        c23780.getClass();
                                        C21769.f68542.getClass();
                                        C20764.m46890(bArr10);
                                        C20764.m46890((byte[]) r11);
                                        C20764.m46890(bArr3);
                                        obj = bArr3;
                                        abstractC19444 = abstractC19443;
                                        r13 = r11;
                                        obj6 = bArr3;
                                        obj7 = abstractC19443;
                                        r12 = r11;
                                        if (abstractC19443 != null) {
                                            abstractC19444.mo13547();
                                            obj6 = obj;
                                            obj7 = abstractC19444;
                                            r12 = r13;
                                        }
                                        return false;
                                    } catch (Exception unused8) {
                                        c8717 = c8719;
                                        bArr8 = null;
                                        r19 = bArrM170313;
                                        r6 = r19;
                                        bArr4 = bArr8;
                                        c8714 = c8717;
                                        r15 = r6;
                                        bArr6 = bArr4;
                                        abstractC19445 = c8714;
                                        bArr10 = bArrM17039;
                                        bArr2 = bArr6;
                                        abstractC19442 = abstractC19445;
                                        r10 = r15;
                                        c23780.getClass();
                                        C21769.f68542.getClass();
                                        C20764.m46890(bArr10);
                                        C20764.m46890((byte[]) r10);
                                        C20764.m46890(bArr2);
                                        obj = bArr2;
                                        abstractC19444 = abstractC19442;
                                        r13 = r10;
                                        obj6 = bArr2;
                                        obj7 = abstractC19442;
                                        r12 = r10;
                                        if (abstractC19442 != null) {
                                            abstractC19444.mo13547();
                                            obj6 = obj;
                                            obj7 = abstractC19444;
                                            r12 = r13;
                                        }
                                        return false;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        c8716 = c8719;
                                        obj5 = null;
                                        r17 = bArrM170313;
                                        r7 = r17;
                                        obj2 = obj5;
                                        c8713 = c8716;
                                        r14 = r7;
                                        obj4 = obj2;
                                        obj3 = c8713;
                                        bArr11 = bArrM17039;
                                        r2 = obj4;
                                        r3 = obj3;
                                        r9 = r14;
                                        C20764.m46890(bArr11);
                                        C20764.m46890((byte[]) r9);
                                        C20764.m46890((byte[]) r2);
                                        if (r3 != 0) {
                                            r3.mo13547();
                                        }
                                        throw th;
                                    }
                                } catch (C3328 unused9) {
                                    bArr9 = null;
                                    c8718 = null;
                                } catch (Exception unused10) {
                                    bArr8 = null;
                                    c8717 = null;
                                } catch (Throwable th5) {
                                    th = th5;
                                    obj5 = null;
                                    c8716 = null;
                                }
                            }
                        } catch (C3328 unused11) {
                            bArr5 = null;
                            c8715 = null;
                        } catch (Exception unused12) {
                            bArr4 = null;
                            c8714 = null;
                        } catch (Throwable th6) {
                            th = th6;
                            obj2 = null;
                            c8713 = null;
                        }
                    }
                }
                throw new C3328();
            } catch (Throwable th7) {
                th = th7;
                r9 = r12;
                bArr11 = bArr10;
                r3 = obj7;
                r2 = obj6;
            }
        } catch (C3328 unused13) {
            bArr3 = null;
            abstractC19443 = null;
            r11 = 0;
        } catch (Exception unused14) {
            bArr2 = null;
            abstractC19442 = null;
            r10 = 0;
        } catch (Throwable th8) {
            th = th8;
            r2 = 0;
            r3 = 0;
            r9 = 0;
        }
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ܿ */
    public final byte[] mo9934() {
        AbstractC19442 abstractC19442 = this.f10587;
        if (abstractC19442 != null) {
            return abstractC19442.mo9934();
        }
        return super.mo9934();
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ᩳ */
    public final byte[] mo9935() {
        AbstractC19442 abstractC19442 = this.f10587;
        return abstractC19442 != null ? abstractC19442.mo9935() : new byte[0];
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo9932(byte[] bArr) {
        return this.f10587.mo9932(bArr);
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo9930(String str, byte[] bArr) {
        return this.f10587.mo9930(str, bArr);
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo9931() {
        return this.f10587.mo9931();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9929(byte[] bArr) throws Throwable {
        byte[] bArr2;
        byte[] bArrMo8022;
        byte[] bArr3;
        byte[] bArr4;
        String str;
        String str2;
        InterfaceC4019 interfaceC4019M9927;
        C23780 c23780 = this.f59228;
        boolean z = this.f59227;
        if (!z) {
            return true;
        }
        if (bArr == null) {
            return !z;
        }
        byte[] bArr5 = null;
        try {
            try {
                C7352 c7352 = new C7352(this.f59225);
                if (!c7352.m17044()) {
                    throw new C3328();
                }
                C7352[] c7352ArrM17039 = c7352.m17039();
                if (c7352ArrM17039.length != 2) {
                    throw new C3328();
                }
                if (!c7352ArrM17039[0].m17044()) {
                    throw new C3328();
                }
                if (!c7352ArrM17039[1].m17038()) {
                    throw new C3328();
                }
                byte[] bArrM17037 = c7352ArrM17039[1].m17037();
                try {
                    C7352[] c7352ArrM170310 = c7352ArrM17039[0].m17039();
                    if (c7352ArrM170310.length != 2) {
                        throw new C3328();
                    }
                    if (!c7352ArrM170310[0].m17045()) {
                        throw new C3328();
                    }
                    if (!c7352ArrM170310[1].m17044()) {
                        throw new C3328();
                    }
                    byte[] bArrM17038 = c7352ArrM170310[0].m17037();
                    C7352 c7353 = c7352ArrM170310[1];
                    if (!C20764.m46885(bArrM17038, f10573)) {
                        if (C20764.m46885(bArrM17038, f10585)) {
                            str = "pbeWithMD2AndDES-CBC unsupported";
                        } else if (C20764.m46885(bArrM17038, f10583)) {
                            str = "pbeWithMD2AndRC2-CBC unsupported";
                        } else if (C20764.m46885(bArrM17038, f10568)) {
                            str = "pbeWithMD5AndDES-CBC unsupported";
                        } else if (C20764.m46885(bArrM17038, f10566)) {
                            str = "pbeWithMD5AndRC2-CBC unsupported";
                        } else if (C20764.m46885(bArrM17038, f10577)) {
                            str = "pbeWithSHA1AndDES-CBC unsupported";
                        } else if (C20764.m46885(bArrM17038, f10576)) {
                            str = "pbeWithSHA1AndRC2-CBC unsupported";
                        } else {
                            str = "unsupported encryption oid: " + C20764.m46895(bArrM17038);
                        }
                        throw new C14392(str);
                    }
                    C7352[] c7352ArrM170311 = c7353.m17039();
                    if (c7352ArrM170311.length != 2) {
                        throw new C3328();
                    }
                    C7352 c7354 = c7352ArrM170311[0];
                    C7352 c7355 = c7352ArrM170311[1];
                    if (!c7354.m17044()) {
                        throw new C3328();
                    }
                    if (!c7355.m17044()) {
                        throw new C3328();
                    }
                    C7352[] c7352ArrM170312 = c7355.m17039();
                    if (c7352ArrM170312.length != 2) {
                        throw new C3328();
                    }
                    if (!c7352ArrM170312[0].m17045()) {
                        throw new C3328();
                    }
                    byte[] bArrM17039 = c7352ArrM170312[0].m17037();
                    C7352 c7356 = c7352ArrM170312[1];
                    C7352[] c7352ArrM170313 = c7354.m17039();
                    if (c7352ArrM170313.length != 2) {
                        throw new C3328();
                    }
                    if (!c7352ArrM170313[0].m17045()) {
                        throw new C3328();
                    }
                    if (!c7352ArrM170313[1].m17044()) {
                        throw new C3328();
                    }
                    byte[] bArrM170310 = c7352ArrM170313[0].m17037();
                    if (C20764.m46885(bArrM170310, f10570)) {
                        str2 = "pbkdf2";
                        interfaceC4019M9927 = m9927("pbkdf2");
                        interfaceC4019M9927.mo8023(c7352ArrM170313[1].m17041());
                    } else {
                        if (!C20764.m46885(bArrM170310, f10571)) {
                            throw new C14392("unsupported kdf oid: " + C20764.m46895(bArrM170310));
                        }
                        str2 = "scrypt";
                        interfaceC4019M9927 = m9927("scrypt");
                        interfaceC4019M9927.mo8023(c7352ArrM170313[1].m17041());
                    }
                    byte[][] bArr6 = new byte[1][];
                    InterfaceC24727 interfaceC24727M9928 = m9928(bArrM17039, c7356, bArr6);
                    byte[] bArr7 = bArr6[0];
                    bArrMo8022 = interfaceC4019M9927.mo8022(interfaceC24727M9928.getBlockSize(), bArr);
                    try {
                        if (bArrMo8022 == null) {
                            throw new C14392("failed to generate key from KDF ".concat(str2));
                        }
                        interfaceC24727M9928.mo4571(1, bArrMo8022, bArr7);
                        byte[] bArr8 = new byte[bArrM17037.length];
                        interfaceC24727M9928.mo4570(0, bArrM17037, bArrM17037.length, bArr8, 0);
                        if (!mo9933(bArr8)) {
                            throw new C14392("failed to parse decrypted key");
                        }
                        this.f59227 = false;
                        C20764.m46890(this.f59225);
                        C20764.m46890(bArrM17037);
                        C20764.m46890(bArrMo8022);
                        C20764.m46890(bArr8);
                        return true;
                    } catch (C3328 unused) {
                        bArr4 = null;
                        bArr5 = bArrM17037;
                        c23780.getClass();
                        C21769.f68542.getClass();
                        C20764.m46890(bArr5);
                        C20764.m46890(bArrMo8022);
                        C20764.m46890(bArr4);
                        return false;
                    } catch (Exception unused2) {
                        bArr3 = null;
                        bArr5 = bArrM17037;
                        c23780.getClass();
                        C21769.f68542.getClass();
                        C20764.m46890(bArr5);
                        C20764.m46890(bArrMo8022);
                        C20764.m46890(bArr3);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        bArr2 = 0;
                        bArr5 = bArrM17037;
                        C20764.m46890(bArr5);
                        C20764.m46890(bArrMo8022);
                        C20764.m46890(bArr2);
                        throw th;
                    }
                } catch (C3328 unused3) {
                    bArrMo8022 = null;
                } catch (Exception unused4) {
                    bArrMo8022 = null;
                } catch (Throwable th2) {
                    th = th2;
                    bArrMo8022 = null;
                }
            } catch (Throwable th3) {
                th = th3;
                bArr5 = null;
                bArr2 = "unsupported encryption oid: ";
            }
        } catch (C3328 unused5) {
            bArr4 = null;
            bArrMo8022 = null;
        } catch (Exception unused6) {
            bArr3 = null;
            bArrMo8022 = null;
        } catch (Throwable th4) {
            th = th4;
            bArr2 = 0;
            bArrMo8022 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC4019 m9927(String str) throws C14392 {
        try {
            return (InterfaceC4019) Class.forName(C21769.m49091(str)).asSubclass(InterfaceC4019.class).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception | LinkageError e) {
            throw new C14392(str.concat(" is not supported"), e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC24727 m9928(byte[] bArr, C7352 c7352, byte[][] bArr2) throws C3328, C14392 {
        String str;
        if (C20764.m46885(bArr, f10567)) {
            str = "aes128-cbc";
        } else if (C20764.m46885(bArr, f10581)) {
            str = "aes192-cbc";
        } else if (C20764.m46885(bArr, f10582)) {
            str = "aes256-cbc";
        } else {
            if (C20764.m46885(bArr, f10569)) {
                throw new C14392("unsupported cipher function: des-cbc");
            }
            if (C20764.m46885(bArr, f10563)) {
                throw new C14392("unsupported cipher function: 3des-cbc");
            }
            if (C20764.m46885(bArr, f10575)) {
                throw new C14392("unsupported cipher function: rc2-cbc");
            }
            if (C20764.m46885(bArr, f10586)) {
                throw new C14392("unsupported cipher function: rc5-cbc");
            }
            str = null;
        }
        if (str == null) {
            throw new C14392("unsupported cipher function oid: " + C20764.m46895(bArr));
        }
        if (!c7352.m17038()) {
            throw new C3328();
        }
        bArr2[0] = c7352.m17037();
        try {
            return (InterfaceC24727) Class.forName(C21769.m49091(str)).asSubclass(InterfaceC24727.class).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception | LinkageError e) {
            throw new C14392(str.concat(" is not supported"), e);
        }
    }
}
