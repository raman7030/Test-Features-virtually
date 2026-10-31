package l;

/* JADX INFO: renamed from: l.᩶ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N8CI */
/* JADX INFO: loaded from: classes5.dex */
public final class C20156 extends AbstractC2988 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final AbstractC2988 f65267 = new C20156(9);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f65268;

    public C20156(int i) {
        super(2);
        this.f65268 = 1 << (i - 1);
    }

    @Override // l.AbstractC2988
    /* JADX INFO: renamed from: ֫ */
    public final int mo9121(int i, int i2, byte[] bArr, byte[] bArr2) {
        C12394 c12394;
        C12394 c12395;
        byte[] bArr3 = bArr;
        int i3 = 0;
        C6322.m17572(0, i, bArr3);
        C6322.m17572(0, i2, bArr2);
        int i4 = i - 12;
        int i5 = i - 5;
        C22272 c22272 = new C22272(this);
        C12394 c12396 = new C12394();
        C12394 c12397 = new C12394();
        C12394 c12398 = new C12394();
        int iM30545 = 1;
        int iM31759 = 0;
        while (iM30545 < i4) {
            if (c22272.m50000(bArr3, iM30545, i5, c12396)) {
                int i6 = c12396.f37324;
                int iM30546 = i3;
                int iM317510 = iM31759;
                int i7 = c12396.f37326;
                int i8 = c12396.f37325;
                int i9 = i6;
                while (true) {
                    if (c12396.m30545() < i4) {
                        int i10 = i8;
                        int i11 = i7;
                        int i12 = i9;
                        C12394 c12399 = c12398;
                        C12394 c123910 = c12397;
                        if (c22272.m49999(bArr, c12396.m30545() - 2, c12396.f37326 + 1, i5, c12396.f37324, c12397)) {
                            int i13 = c12396.f37326;
                            c12397 = c123910;
                            if (i11 < i13 && c12397.f37326 < i13 + i12) {
                                c12396.f37324 = i12;
                                c12396.f37326 = i11;
                                c12396.f37325 = i10;
                            }
                            if (c12397.f37326 - c12396.f37326 < 3) {
                                C10278.m26026(c12397, c12396);
                                i8 = i10;
                                i7 = i11;
                                i9 = i12;
                                c12398 = c12399;
                            } else {
                                while (true) {
                                    int i14 = c12397.f37326;
                                    int i15 = c12396.f37326;
                                    if (i14 - i15 < 18) {
                                        int i16 = c12396.f37324;
                                        if (i16 > 18) {
                                            i16 = 18;
                                        }
                                        if (i15 + i16 > c12397.m30545() - 4) {
                                            i16 = ((c12397.f37326 - c12396.f37326) + c12397.f37324) - 4;
                                        }
                                        int i17 = i16 - (c12397.f37326 - c12396.f37326);
                                        if (i17 > 0) {
                                            c12397.m30546(i17);
                                        }
                                    }
                                    if (c12397.f37326 + c12397.f37324 < i4) {
                                        c12395 = c12397;
                                        if (c22272.m49999(bArr, c12397.m30545() - 3, c12397.f37326, i5, c12397.f37324, c12399)) {
                                            C12394 c123911 = c12399;
                                            if (c123911.f37326 >= c12396.m30545() + 3) {
                                                if (c12395.f37326 < c12396.m30545()) {
                                                    int i18 = c12395.f37326 - c12396.f37326;
                                                    if (i18 < 15) {
                                                        if (c12396.f37324 > 18) {
                                                            c12396.f37324 = 18;
                                                        }
                                                        if (c12396.m30545() > c12395.m30545() - 4) {
                                                            c12396.f37324 = (c12395.m30545() - c12396.f37326) - 4;
                                                        }
                                                        c12395.m30546(c12396.m30545() - c12395.f37326);
                                                    } else {
                                                        c12396.f37324 = i18;
                                                    }
                                                }
                                                C12394 c123912 = c12396;
                                                iM317510 = C13099.m31759(bArr, bArr2, iM30546, c12396.f37326, c12396.f37325, c12396.f37324, iM317510, i2);
                                                iM30546 = c123912.m30545();
                                                C10278.m26026(c12395, c123912);
                                                C10278.m26026(c123911, c12395);
                                                c12399 = c123911;
                                                c12396 = c123912;
                                            } else if (c123911.f37326 >= c12396.m30545()) {
                                                if (c12395.f37326 < c12396.m30545()) {
                                                    c12395.m30546(c12396.m30545() - c12395.f37326);
                                                    if (c12395.f37324 < 4) {
                                                        C10278.m26026(c123911, c12395);
                                                    }
                                                }
                                                C12394 c123913 = c12396;
                                                iM317510 = C13099.m31759(bArr, bArr2, iM30546, c12396.f37326, c12396.f37325, c12396.f37324, iM317510, i2);
                                                iM30546 = c123913.m30545();
                                                C10278.m26026(c123911, c123913);
                                                i9 = c12395.f37324;
                                                i7 = c12395.f37326;
                                                i8 = c12395.f37325;
                                                c12398 = c123911;
                                                c12396 = c123913;
                                                c12397 = c12395;
                                            } else {
                                                C10278.m26026(c123911, c12395);
                                                c12399 = c123911;
                                            }
                                            c12397 = c12395;
                                        }
                                    } else {
                                        c12395 = c12397;
                                    }
                                    c12396 = c12396;
                                    c12394 = c12399;
                                    if (c12395.f37326 < c12396.m30545()) {
                                        c12396.f37324 = c12395.f37326 - c12396.f37326;
                                    }
                                    iM31759 = C13099.m31759(bArr, bArr2, c12396.m30545(), c12395.f37326, c12395.f37325, c12395.f37324, C13099.m31759(bArr, bArr2, iM30546, c12396.f37326, c12396.f37325, c12396.f37324, iM317510, i2), i2);
                                    iM30545 = c12395.m30545();
                                }
                            }
                        } else {
                            c12394 = c12399;
                            c12395 = c123910;
                        }
                        i3 = iM30545;
                        c12398 = c12394;
                        c12396 = c12396;
                        c12397 = c12395;
                        bArr3 = bArr;
                    } else {
                        c12394 = c12398;
                        c12395 = c12397;
                    }
                    iM31759 = C13099.m31759(bArr, bArr2, iM30546, c12396.f37326, c12396.f37325, c12396.f37324, iM317510, i2);
                    iM30545 = c12396.m30545();
                    i3 = iM30545;
                    c12398 = c12394;
                    c12396 = c12396;
                    c12397 = c12395;
                    bArr3 = bArr;
                }
            } else {
                iM30545++;
            }
        }
        return C13099.m31758(bArr, i3, i - i3, bArr2, iM31759, i2);
    }
}
