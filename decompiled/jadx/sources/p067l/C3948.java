package p067l;

import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.Adler32;

/* JADX INFO: renamed from: l.֫ۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85A3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3948 {

    /* JADX INFO: renamed from: ֡ */
    public final C18423 f8589;

    /* JADX INFO: renamed from: ֨ */
    public final C6630 f8590;

    /* JADX INFO: renamed from: ֫ */
    public final C6630 f8591;

    /* JADX INFO: renamed from: ۖ */
    public final C11995 f8592;

    /* JADX INFO: renamed from: ۘ */
    public final AbstractC7971[] f8593;

    /* JADX INFO: renamed from: ۚ */
    public final C6630 f8594;

    /* JADX INFO: renamed from: ۜ */
    public int f8595;

    /* JADX INFO: renamed from: ۡ */
    public final C9983 f8596;

    /* JADX INFO: renamed from: ۢ */
    public final C6630 f8597;

    /* JADX INFO: renamed from: ۧ */
    public final C23197 f8598;

    /* JADX INFO: renamed from: ܳ */
    public int f8599;

    /* JADX INFO: renamed from: ܺ */
    public final C22724 f8600;

    /* JADX INFO: renamed from: ܽ */
    public final C6630 f8601;

    /* JADX INFO: renamed from: ܿ */
    public final C11619 f8602;

    /* JADX INFO: renamed from: ᩳ */
    public final C15149 f8603;

    /* JADX INFO: renamed from: ᩴ */
    public final C6630 f8604;

    /* JADX INFO: renamed from: ᩵ */
    public final C4342 f8605;

    /* JADX INFO: renamed from: ᩷ */
    public final C11325 f8606;

    /* JADX INFO: renamed from: ᩻ */
    public final C8642 f8607;

    public C3948(C11619 c11619) {
        this.f8602 = c11619;
        C11325 c11325 = new C11325(this);
        this.f8606 = c11325;
        EnumC21383 enumC21383 = EnumC21383.NONE;
        C6630 c6630 = new C6630(null, this, 4, enumC21383);
        this.f8594 = c6630;
        EnumC21383 enumC21384 = EnumC21383.TYPE;
        C6630 c6631 = new C6630("word_data", this, 4, enumC21384);
        this.f8590 = c6631;
        C6630 c6632 = new C6630("string_data", this, 1, EnumC21383.INSTANCE);
        this.f8604 = c6632;
        C6630 c6633 = new C6630(null, this, 1, enumC21383);
        this.f8601 = c6633;
        C6630 c6634 = new C6630("byte_data", this, 1, enumC21384);
        this.f8591 = c6634;
        C4342 c4342 = new C4342(this);
        this.f8605 = c4342;
        C18423 c18423 = new C18423(this);
        this.f8589 = c18423;
        C11995 c11995 = new C11995(this);
        this.f8592 = c11995;
        C8642 c8642 = new C8642(this);
        this.f8607 = c8642;
        C22724 c22724 = new C22724(this);
        this.f8600 = c22724;
        C15149 c15149 = new C15149(this);
        this.f8603 = c15149;
        C6630 c6635 = new C6630("map", this, 4, enumC21383);
        this.f8597 = c6635;
        if (c11619.m26738(26)) {
            C23197 c23197 = new C23197(this);
            this.f8598 = c23197;
            C9983 c9983 = new C9983(this);
            this.f8596 = c9983;
            this.f8593 = new AbstractC7971[]{c11325, c4342, c18423, c11995, c8642, c22724, c15149, c23197, c9983, c6631, c6630, c6632, c6634, c6633, c6635};
        } else {
            this.f8598 = null;
            this.f8596 = null;
            this.f8593 = new AbstractC7971[]{c11325, c4342, c18423, c11995, c8642, c22724, c15149, c6631, c6630, c6632, c6634, c6633, c6635};
        }
        this.f8595 = -1;
        this.f8599 = 79;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C11619 m7859() {
        return this.f8602;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7847(C5762 c5762) {
        this.f8603.m34578(c5762);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19705 m7846(C9785 c9785) {
        return m7841(false, c9785);
    }

    /* JADX INFO: renamed from: ֨ */
    public final byte[] m7843() {
        return m7841(false, null).m44774();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m7864() {
        int i = this.f8595;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("file size not yet known");
    }

    /* JADX INFO: renamed from: ۘ */
    public final C6630 m7849() {
        return this.f8604;
    }

    /* JADX INFO: renamed from: ۚ */
    public final C6630 m7850() {
        return this.f8590;
    }

    /* JADX INFO: renamed from: ֡ */
    public final C6630 m7842() {
        return this.f8594;
    }

    /* JADX INFO: renamed from: ۢ */
    public final C6630 m7853() {
        return this.f8597;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final C4342 m7861() {
        return this.f8605;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C15149 m7860() {
        return this.f8603;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C6630 m7858() {
        return this.f8601;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final C18423 m7862() {
        return this.f8589;
    }

    /* JADX INFO: renamed from: ۖ */
    public final C11995 m7848() {
        return this.f8592;
    }

    /* JADX INFO: renamed from: ܳ */
    public final C8642 m7856() {
        return this.f8607;
    }

    /* JADX INFO: renamed from: ܺ */
    public final C22724 m7857() {
        return this.f8600;
    }

    /* JADX INFO: renamed from: ۡ */
    public final C9983 m7852() {
        return this.f8596;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C23197 m7854() {
        return this.f8598;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C6630 m7844() {
        return this.f8591;
    }

    /* JADX INFO: renamed from: ۜ */
    public final C6630 m7851() {
        return this.f8590;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final C6630 m7863() {
        return this.f8597;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m7855(AbstractC15405 abstractC15405) {
        if (abstractC15405 == null) {
            throw new NullPointerException("cst == null");
        }
        if (abstractC15405 instanceof C14930) {
            this.f8605.m8958((C14930) abstractC15405);
            return;
        }
        if (abstractC15405 instanceof C14260) {
            this.f8589.m41991((C14260) abstractC15405);
            return;
        }
        if (abstractC15405 instanceof AbstractC18283) {
            this.f8600.m50876((AbstractC18283) abstractC15405);
            return;
        }
        boolean z = abstractC15405 instanceof C10908;
        C8642 c8642 = this.f8607;
        if (z) {
            c8642.m20056((C10908) abstractC15405);
            return;
        }
        if (abstractC15405 instanceof C11579) {
            c8642.m20056(((C11579) abstractC15405).m26649());
            return;
        }
        if (abstractC15405 instanceof C6884) {
            this.f8592.m27432(((C6884) abstractC15405).m15778());
        } else if (abstractC15405 instanceof C22978) {
            this.f8596.m23291((C22978) abstractC15405);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17358 m7845(AbstractC15405 abstractC15405) {
        if (abstractC15405 instanceof C14930) {
            return this.f8605.m8957(abstractC15405);
        }
        if (abstractC15405 instanceof C14260) {
            return this.f8589.m41990(abstractC15405);
        }
        if (abstractC15405 instanceof AbstractC18283) {
            return this.f8600.m50875(abstractC15405);
        }
        boolean z = abstractC15405 instanceof C10908;
        C8642 c8642 = this.f8607;
        if (z) {
            return c8642.m20055(abstractC15405);
        }
        if (abstractC15405 instanceof C11579) {
            return c8642.m20056(((C11579) abstractC15405).m26649());
        }
        if (abstractC15405 instanceof C6884) {
            return this.f8592.m27431(abstractC15405);
        }
        if (abstractC15405 instanceof C22978) {
            return this.f8596.m23290(abstractC15405);
        }
        if (abstractC15405 instanceof C24989) {
            return this.f8598.m51676(abstractC15405);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    private C19705 m7841(boolean z, C9785 c9785) {
        byte[] bArr;
        this.f8603.m18449();
        this.f8601.m18449();
        C6630 c6630 = this.f8590;
        c6630.m18449();
        C11619 c11619 = this.f8602;
        boolean zM26738 = c11619.m26738(26);
        C23197 c23197 = this.f8598;
        if (zM26738) {
            c23197.m18449();
        }
        this.f8591.m18449();
        boolean zM26739 = c11619.m26738(26);
        C9983 c9983 = this.f8596;
        if (zM26739) {
            c9983.m18449();
        }
        this.f8600.m18449();
        this.f8607.m18449();
        this.f8592.m18449();
        this.f8594.m18449();
        this.f8589.m18449();
        this.f8605.m18449();
        this.f8604.m18449();
        this.f8606.m18449();
        AbstractC7971[] abstractC7971Arr = this.f8593;
        int length = abstractC7971Arr.length;
        int iMo15108 = 0;
        for (int i = 0; i < length; i++) {
            AbstractC7971 abstractC7971 = abstractC7971Arr[i];
            if ((abstractC7971 != c23197 && abstractC7971 != c9983) || !abstractC7971.mo8960().isEmpty()) {
                int iM18446 = abstractC7971.m18446(iMo15108);
                if (iM18446 < iMo15108) {
                    throw new RuntimeException(C20778.m46922(i, "bogus placement for section "));
                }
                C6630 c6631 = this.f8597;
                if (abstractC7971 == c6631) {
                    try {
                        C20042.m45398(abstractC7971Arr, c6631);
                        c6631.m18449();
                    } catch (RuntimeException e) {
                        throw C10101.m23569("...while writing section " + i, e);
                    }
                }
                if (abstractC7971 instanceof C6630) {
                    ((C6630) abstractC7971).m15104();
                }
                iMo15108 = abstractC7971.mo15108() + iM18446;
            }
        }
        this.f8595 = iMo15108;
        if (c9785 == null) {
            bArr = new byte[iMo15108];
        } else {
            if (c9785.f27028.length < iMo15108) {
                Logger.getAnonymousLogger().log(Level.FINER, "DexFile storage too small  " + c9785.f27028.length + " vs " + iMo15108);
                c9785.f27028 = new byte[iMo15108];
            }
            bArr = c9785.f27028;
        }
        C19705 c19705 = new C19705(bArr);
        if (z) {
            c19705.m44772(this.f8599);
        }
        for (int i2 = 0; i2 < length; i2++) {
            try {
                AbstractC7971 abstractC7972 = abstractC7971Arr[i2];
                if ((abstractC7972 != c23197 && abstractC7972 != c9983) || !abstractC7972.mo8960().isEmpty()) {
                    int iM18448 = abstractC7972.m18448() - c19705.m44769();
                    if (iM18448 < 0) {
                        throw new C10101("excess write of " + (-iM18448), null);
                    }
                    c19705.m44777(iM18448);
                    abstractC7972.m18444(c19705);
                }
            } catch (RuntimeException e2) {
                C10101 c10101 = e2 instanceof C10101 ? (C10101) e2 : new C10101(null, e2);
                c10101.m23570("...while writing section " + i2);
                throw c10101;
            }
        }
        if (c19705.m44769() != this.f8595) {
            throw new RuntimeException("foreshortened write");
        }
        int iM44769 = c19705.m44769();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr, 32, iM44769 - 32);
            try {
                int iDigest = messageDigest.digest(bArr, 12, 20);
                if (iDigest != 20) {
                    throw new RuntimeException("unexpected digest write: " + iDigest + " bytes");
                }
                int iM447610 = c19705.m44769();
                Adler32 adler32 = new Adler32();
                adler32.update(bArr, 12, iM447610 - 12);
                int value = (int) adler32.getValue();
                bArr[8] = (byte) value;
                bArr[9] = (byte) (value >> 8);
                bArr[10] = (byte) (value >> 16);
                bArr[11] = (byte) (value >> 24);
                if (z) {
                    c6630.m15103(c19705, EnumC5960.TYPE_CODE_ITEM);
                    C24064 c24064 = new C24064();
                    for (AbstractC7971 abstractC7973 : abstractC7971Arr) {
                        c24064.m53328(abstractC7973);
                    }
                    c24064.m53329(c19705);
                    c19705.m44771();
                }
                return c19705;
            } catch (DigestException e3) {
                throw new RuntimeException(e3);
            }
        } catch (NoSuchAlgorithmException e4) {
            throw new RuntimeException(e4);
        }
    }
}
