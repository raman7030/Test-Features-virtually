package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.io.IOException;
import java.nio.file.ClosedFileSystemException;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import org.bouncycastle.crypto.digests.SkeinEngine;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.᩶ۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21378 {

    /* JADX INFO: renamed from: ۡ֫ */
    public static final C6468 f67386 = new C6468();

    /* JADX INFO: renamed from: ֨ */
    public final C23623 f67388;

    /* JADX INFO: renamed from: ֫ */
    public boolean f67389;

    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC13035 f67391;

    /* JADX INFO: renamed from: ۗ */
    public int[] f67392;

    /* JADX INFO: renamed from: ۘ */
    public boolean f67393;

    /* JADX INFO: renamed from: ۙ */
    public C2601[] f67394;

    /* JADX INFO: renamed from: ۚ */
    public boolean f67395;

    /* JADX INFO: renamed from: ۛ */
    public boolean f67396;

    /* JADX INFO: renamed from: ۜ֫ */
    public C8374 f67398;

    /* JADX INFO: renamed from: ۠ */
    public int f67400;

    /* JADX INFO: renamed from: ۡ */
    public C4271 f67401;

    /* JADX INFO: renamed from: ۤ */
    public final EnumC8045 f67404;

    /* JADX INFO: renamed from: ۧ */
    public boolean f67405;

    /* JADX INFO: renamed from: ۧ֫ */
    public int f67406;

    /* JADX INFO: renamed from: ۨ */
    public C4614 f67407;

    /* JADX INFO: renamed from: ۫ */
    public C24387 f67408;

    /* JADX INFO: renamed from: ۬ */
    public C21457 f67409;

    /* JADX INFO: renamed from: ܰ */
    public boolean f67410;

    /* JADX INFO: renamed from: ܳ */
    public int f67411;

    /* JADX INFO: renamed from: ܳ֫ */
    public C22004 f67412;

    /* JADX INFO: renamed from: ܶ */
    public int f67413;

    /* JADX INFO: renamed from: ܺ */
    public C8005 f67414;

    /* JADX INFO: renamed from: ܽ */
    public boolean f67415;

    /* JADX INFO: renamed from: ܽ֫ */
    public byte[] f67416;

    /* JADX INFO: renamed from: ܿ */
    public HashMap f67417;

    /* JADX INFO: renamed from: ܿ֫ */
    public int f67418;

    /* JADX INFO: renamed from: ᩳ */
    public final C15099 f67419;

    /* JADX INFO: renamed from: ᩴ */
    public C4848 f67421;

    /* JADX INFO: renamed from: ᩶ */
    public int[] f67423;

    /* JADX INFO: renamed from: ᩷֫ */
    public AbstractC15689 f67425;

    /* JADX INFO: renamed from: ᩸ */
    public C4848 f67426;

    /* JADX INFO: renamed from: ᩹ */
    public final C8200 f67427;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f67428;

    /* JADX INFO: renamed from: ᩻֫ */
    public C4614 f67430;

    /* JADX INFO: renamed from: ֡ */
    public C4848 f67387 = C4848.m10283();

    /* JADX INFO: renamed from: ᩵ */
    public C4848 f67422 = C4848.m10283();

    /* JADX INFO: renamed from: ۜ */
    public InterfaceC19740 f67397 = null;

    /* JADX INFO: renamed from: ۢ */
    public AbstractC7783 f67402 = null;

    /* JADX INFO: renamed from: ᩷ */
    public C2417 f67424 = null;

    /* JADX INFO: renamed from: ᩻ */
    public C16525 f67429 = new C16525(65520);

    /* JADX INFO: renamed from: ۢ֫ */
    public HashSet f67403 = new HashSet();

    /* JADX INFO: renamed from: ֫֫ */
    public boolean f67390 = false;

    /* JADX INFO: renamed from: ᩳ֫ */
    public byte[] f67420 = new byte[0];

    /* JADX INFO: renamed from: ۟ */
    public int f67399 = 0;

    /* JADX INFO: renamed from: ֫ */
    public static C21378 m48420(C5127 c5127) {
        C21378 c21378 = (C21378) c5127.m10905(f67386);
        return c21378 == null ? new C21378(c5127) : c21378;
    }

    public C21378(C5127 c5127) {
        EnumC8637 enumC8637 = EnumC8637.CLASS;
        EnumSet enumSetOf = EnumSet.of(enumC8637);
        EnumC8637 enumC8638 = EnumC8637.MEMBER;
        EnumSet enumSetOf2 = EnumSet.of(enumC8638);
        EnumSet enumSetOf3 = EnumSet.of(enumC8637, enumC8638);
        this.f67417 = new HashMap();
        this.f67396 = false;
        this.f67426 = C4848.m10283();
        this.f67421 = C4848.m10283();
        this.f67393 = false;
        c5127.m10908(f67386, this);
        this.f67419 = C15099.m34493(c5127);
        C8200 c8200M18988 = C8200.m18988(c5127);
        this.f67427 = c8200M18988;
        C22004 c22004M49577 = C22004.m49577(c5127);
        this.f67412 = c22004M49577;
        this.f67398 = C8374.m19396(c5127);
        InterfaceC13035 interfaceC13035 = (InterfaceC13035) c5127.m10904(InterfaceC13035.class);
        this.f67391 = interfaceC13035;
        if (interfaceC13035 == null) {
            throw new AssertionError("FileManager initialization error");
        }
        this.f67414 = C8005.m18541(c5127);
        this.f67401 = C4271.m8674(c5127);
        this.f67388 = C23623.m52439(c5127);
        C13565 c13565M30871 = C13565.m30871(c5127);
        c13565M30871.m30880(EnumC2483.f3917);
        EnumC17840 enumC17840M40515 = EnumC17840.m40515(c5127);
        this.f67408 = C24387.m53737(c5127);
        this.f67389 = EnumC12477.f34980.m28726(enumC17840M40515);
        this.f67405 = EnumC12477.f34978.m28726(enumC17840M40515);
        this.f67415 = EnumC12477.f34959.m28726(enumC17840M40515);
        this.f67428 = c13565M30871.m30880(EnumC2483.f3966);
        this.f67404 = EnumC8045.m18667(c5127);
        this.f67425 = AbstractC15689.m35727(c22004M49577.f69157);
        this.f67395 = C6953.m15930(c5127).m15935(EnumC21706.CLASSFILE);
        AbstractC12224 abstractC12224 = c8200M18988.f21684;
        EnumC18497 enumC18497 = EnumC18497.V45_3;
        C8439 c8439 = new C8439(this, abstractC12224, enumC18497, enumSetOf2);
        C13804 c13804 = new C13804(this, c8200M18988.f21650, enumC18497, enumSetOf2);
        C24532 c24532 = new C24532(this, c8200M18988.f21658, enumC18497, enumSetOf3);
        C15814 c15814 = new C15814(this, c8200M18988.f21638, enumC18497, enumSetOf3);
        C9780 c9780 = new C9780(this, c8200M18988.f21642, enumC18497, enumSetOf);
        C3943 c3943 = new C3943(this, c8200M18988.f21751, enumC18497, enumSetOf3);
        C12661 c12661 = new C12661(this, c8200M18988.f21720, enumC18497, enumSetOf);
        C18024 c18024 = new C18024(this, c8200M18988.f21740, enumC18497, enumSetOf3);
        AbstractC12224 abstractC12225 = c8200M18988.f21735;
        EnumC18497 enumC18498 = EnumC18497.V49;
        C22522 c22522 = new C22522(this, abstractC12225, enumC18498, enumSetOf);
        C11793 c11793 = new C11793(this, c8200M18988.f21685, enumC18498, enumSetOf3);
        C11122 c11122 = new C11122(this, c8200M18988.f21723, enumC18498, enumSetOf3);
        C17826 c17826 = new C17826(this, c8200M18988.f21732, enumC18498, enumSetOf3);
        C5087 c5087 = new C5087(this, c8200M18988.f21728, enumC18498, enumSetOf3);
        C6428 c6428 = new C6428(this, c8200M18988.f21763, enumC18498, enumSetOf3);
        C20510 c20510 = new C20510(this, c8200M18988.f21674, enumC18498, enumSetOf3);
        C21181 c21181 = new C21181(this, c8200M18988.f21695, enumC18498, enumSetOf3);
        C3074 c3074 = new C3074(this, c8200M18988.f21762, enumC18498, enumSetOf2);
        C7769 c7769 = new C7769(this, c8200M18988.f21739, enumC18498, enumSetOf3);
        C10451 c10451 = new C10451(this, c8200M18988.f21716, enumC18498, enumSetOf3);
        AbstractC12224 abstractC12226 = c8200M18988.f21748;
        EnumC18497 enumC18499 = EnumC18497.V52;
        C17155 c17155 = new C17155(this, abstractC12226, enumC18499, enumSetOf3);
        C23192 c23192 = new C23192(this, c8200M18988.f21712, enumC18499, enumSetOf3);
        C23862 c23862 = new C23862(this, c8200M18988.f21705, enumC18499, enumSetOf2);
        AbstractC12224 abstractC12227 = c8200M18988.f21702;
        EnumC18497 enumC184910 = EnumC18497.V53;
        AbstractC22049[] abstractC22049Arr = {c8439, c13804, c24532, c15814, c9780, c3943, c12661, c18024, c22522, c11793, c11122, c17826, c5087, c6428, c20510, c21181, c3074, c7769, c10451, c17155, c23192, c23862, new C7098(this, abstractC12227, enumC184910, enumSetOf), new C5757(this, c8200M18988.f21692, enumC184910, enumSetOf), new C15144(this, c8200M18988.f21724, EnumC18497.V58, enumSetOf), new C14474(this, c8200M18988.f21677, EnumC18497.V59, enumSetOf)};
        for (int i = 0; i < 26; i++) {
            AbstractC22049 abstractC22049 = abstractC22049Arr[i];
            this.f67417.put(abstractC22049.f69374, abstractC22049);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48422(C15828 c15828, AbstractC7783 abstractC7783) {
        if ((abstractC7783.f20409 & 2147487744L) != ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF || abstractC7783.f20408.m28205(this.f67427.f21664)) {
            c15828.f45850.mo28415(abstractC7783);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C22635 m48431(String str, Object... objArr) {
        return new C22635(this.f67402.m17990(), this.f67397, this.f67414.m18548(str, objArr), this.f67414, this.f67401);
    }

    /* JADX INFO: renamed from: ۧ */
    public final char m48439() {
        char cM37506 = this.f67429.m37506(this.f67411);
        this.f67411 += 2;
        return cM37506;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m48427() {
        int i = this.f67411;
        this.f67411 = i + 1;
        return this.f67429.f48563[i] & 255;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m48443() {
        int iM37505 = this.f67429.m37505(this.f67411);
        this.f67411 += 4;
        return iM37505;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC6462 m48450() {
        AbstractC6462 abstractC6462Mo18010;
        byte[] bArr;
        int i;
        byte[] bArr2 = this.f67416;
        int i2 = this.f67418;
        byte b = bArr2[i2];
        char c = (char) b;
        C22004 c22004 = this.f67412;
        if (c == '(') {
            this.f67418 = i2 + 1;
            C4848 c4848M48428 = m48428(')');
            AbstractC6462 abstractC6462M48450 = m48450();
            C4848 c4848M10283 = C4848.m10283();
            while (true) {
                int i3 = this.f67418;
                if (i3 >= this.f67406 || this.f67416[i3] != 94) {
                    break;
                }
                this.f67418 = i3 + 1;
                c4848M10283 = c4848M10283.m10290(m48450());
            }
            for (C4848 c4848 = c4848M10283; c4848.m10293(); c4848 = c4848.f11035) {
                if (((AbstractC6462) c4848.f11034).m14777(EnumC11353.TYPEVAR)) {
                    ((AbstractC6462) c4848.f11034).f16705.f20409 |= 140737488355328L;
                }
            }
            return new C12497(c4848M48428, abstractC6462M48450, c4848M10283.m10294(), c22004.f69163);
        }
        if (c == '-') {
            this.f67418 = i2 + 1;
            return new C21215(m48450(), EnumC17268.SUPER, c22004.f69162);
        }
        if (c == '<') {
            this.f67425 = this.f67425.mo28413(this.f67402);
            C11945 c11945 = new C11945(m48450(), m48449());
            this.f67425 = this.f67425.mo28410();
            return c11945;
        }
        if (c == 'F') {
            this.f67418 = i2 + 1;
            return c22004.f69165;
        }
        C8200 c8200 = this.f67427;
        if (c != 'L') {
            if (c == 'V') {
                this.f67418 = i2 + 1;
                return c22004.f69183;
            }
            if (c == '*') {
                this.f67418 = i2 + 1;
                return new C21215(c22004.f69208, EnumC17268.UNBOUND, c22004.f69162);
            }
            if (c == '+') {
                this.f67418 = i2 + 1;
                return new C21215(m48450(), EnumC17268.EXTENDS, c22004.f69162);
            }
            if (c == 'I') {
                this.f67418 = i2 + 1;
                return c22004.f69134;
            }
            if (c == 'J') {
                this.f67418 = i2 + 1;
                return c22004.f69152;
            }
            if (c == 'S') {
                this.f67418 = i2 + 1;
                return c22004.f69195;
            }
            if (c == 'T') {
                int i4 = i2 + 1;
                this.f67418 = i4;
                while (true) {
                    bArr = this.f67416;
                    i = this.f67418;
                    if (bArr[i] == 59) {
                        break;
                    }
                    this.f67418 = i + 1;
                }
                this.f67418 = i + 1;
                return this.f67390 ? AbstractC6462.f16700 : m48430(c8200.f21738.mo17847(i4, i - i4, bArr));
            }
            if (c == 'Z') {
                this.f67418 = i2 + 1;
                return c22004.f69151;
            }
            if (c == '[') {
                this.f67418 = i2 + 1;
                return new C7251(m48450(), c22004.f69187);
            }
            switch (c) {
                case 'B':
                    this.f67418 = i2 + 1;
                    return c22004.f69184;
                case 'C':
                    this.f67418 = i2 + 1;
                    return c22004.f69136;
                case 'D':
                    this.f67418 = i2 + 1;
                    return c22004.f69181;
                default:
                    throw m48431("bad.signature", C14514.m33173(i2, 10, bArr2));
            }
        }
        if (b != 76) {
            throw m48431("bad.class.signature", C14514.m33173(i2, 10, bArr2));
        }
        this.f67418 = i2 + 1;
        AbstractC6462 c21333 = AbstractC6462.f16700;
        int i5 = this.f67399;
        while (true) {
            byte[] bArr3 = this.f67416;
            int i6 = this.f67418;
            this.f67418 = i6 + 1;
            byte b2 = bArr3[i6];
            if (b2 == 46) {
                if (c21333 != AbstractC6462.f16700) {
                    c21333 = new C21333(c22004.m49587(this.f67424, c8200.f21738.mo17847(i5, this.f67399 - i5, this.f67420)), c21333, C4848.m10283());
                }
                byte[] bArr4 = this.f67420;
                int i7 = this.f67399;
                this.f67399 = i7 + 1;
                bArr4[i7] = 36;
            } else if (b2 == 47) {
                byte[] bArr5 = this.f67420;
                int i8 = this.f67399;
                this.f67399 = i8 + 1;
                bArr5[i8] = 46;
            } else {
                if (b2 == 59) {
                    C15828 c15828M49587 = c22004.m49587(this.f67424, c8200.f21738.mo17847(i5, this.f67399 - i5, this.f67420));
                    try {
                        abstractC6462Mo18010 = c21333 == AbstractC6462.f16700 ? c15828M49587.mo18010(this.f67398) : new C21333(c15828M49587, c21333, C4848.m10283());
                        this.f67399 = i5;
                        break;
                    } catch (Throwable th) {
                        this.f67399 = i5;
                        throw th;
                    }
                }
                if (b2 != 60) {
                    byte[] bArr6 = this.f67420;
                    int i9 = this.f67399;
                    this.f67399 = i9 + 1;
                    bArr6[i9] = b2;
                } else {
                    abstractC6462Mo18010 = new C3745(this, c21333, m48428('>'), c22004.m49587(this.f67424, c8200.f21738.mo17847(i5, this.f67399 - i5, this.f67420)));
                    byte[] bArr7 = this.f67416;
                    int i10 = this.f67418;
                    int i11 = i10 + 1;
                    this.f67418 = i11;
                    byte b3 = bArr7[i10];
                    if (b3 == 46) {
                        byte[] bArr8 = this.f67420;
                        int i12 = this.f67399;
                        this.f67399 = i12 + 1;
                        bArr8[i12] = 36;
                    } else {
                        if (b3 != 59) {
                            throw new AssertionError((int) this.f67416[this.f67418 - 1]);
                        }
                        if (i11 >= this.f67406 || bArr7[i11] != 46) {
                            this.f67399 = i5;
                            break;
                        }
                        int i13 = this.f67399;
                        this.f67418 = (i13 - i5) + 3 + i11;
                        byte[] bArr9 = this.f67420;
                        this.f67399 = i13 + 1;
                        bArr9[i13] = 36;
                    }
                    c21333 = abstractC6462Mo18010;
                }
            }
        }
        int i14 = this.f67418;
        if (i14 >= this.f67406 || this.f67416[i14] != 46) {
            return abstractC6462Mo18010;
        }
        throw m48431("deprecated inner class signature syntax (please recompile from source)", new Object[0]);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m48428(char c) {
        C4848 c4848M10276of = C4848.m10276of((Object) null);
        C4848 c4848Mo10295 = c4848M10276of;
        while (true) {
            byte[] bArr = this.f67416;
            int i = this.f67418;
            if (bArr[i] != c) {
                c4848Mo10295 = c4848Mo10295.mo10295(C4848.m10276of((Object) m48450()));
            } else {
                this.f67418 = i + 1;
                return c4848M10276of.f11035;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final C4848 m48449() {
        int i;
        C4848 c4848M10283 = C4848.m10283();
        byte[] bArr = this.f67416;
        int i2 = this.f67418;
        if (bArr[i2] == 60) {
            int i3 = i2 + 1;
            this.f67418 = i3;
            this.f67390 = true;
            while (this.f67416[this.f67418] != 62) {
                c4848M10283 = c4848M10283.m10290(m48437());
            }
            this.f67390 = false;
            this.f67418 = i3;
            while (true) {
                byte[] bArr2 = this.f67416;
                i = this.f67418;
                if (bArr2[i] == 62) {
                    break;
                }
                m48437();
            }
            this.f67418 = i + 1;
        }
        return c4848M10283.m10294();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX INFO: renamed from: ۜ */
    public final C10485 m48437() {
        byte[] bArr;
        int i;
        C10485 c10485;
        boolean z;
        int i2 = this.f67418;
        while (true) {
            bArr = this.f67416;
            i = this.f67418;
            if (bArr[i] == 58) {
                break;
            }
            this.f67418 = i + 1;
        }
        AbstractC12224 abstractC12224Mo17847 = this.f67427.f21738.mo17847(i2, i - i2, bArr);
        if (this.f67390) {
            c10485 = new C10485(this.f67402, this.f67412.f69204, abstractC12224Mo17847);
            this.f67425.mo28415(c10485.f16705);
        } else {
            c10485 = (C10485) m48430(abstractC12224Mo17847);
        }
        C4848 c4848M10283 = C4848.m10283();
        byte[] bArr2 = this.f67416;
        int i3 = this.f67418;
        if (bArr2[i3] == 58) {
            z = true;
            int i4 = i3 + 1;
            if (bArr2[i4] == 58) {
                this.f67418 = i4;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        while (true) {
            byte[] bArr3 = this.f67416;
            int i5 = this.f67418;
            if (bArr3[i5] != 58) {
                break;
            }
            this.f67418 = i5 + 1;
            c4848M10283 = c4848M10283.m10290(m48450());
        }
        if (!this.f67390) {
            this.f67398.m19441(c10485, c4848M10283.m10294(), z);
        }
        return c10485;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m48430(AbstractC12224 abstractC12224) {
        AbstractC7783 abstractC7783Mo22458 = this.f67425.mo22458(abstractC12224, (Predicate) null);
        if (abstractC7783Mo22458 != null) {
            return abstractC7783Mo22458.f20406;
        }
        if (this.f67396) {
            C10485 c10485 = new C10485(this.f67402, this.f67412.f69204, abstractC12224);
            this.f67426 = this.f67426.m10290(c10485);
            return c10485;
        }
        throw m48431("undecl.type.var", abstractC12224);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m48448(AbstractC7783 abstractC7783) {
        char cCharAt;
        abstractC7783.f20407.mo17983().mo28417(abstractC7783);
        C15828 c15828 = (C15828) abstractC7783;
        C15828 c15828M48596 = this.f67409.m48596(m48439());
        char cM48439 = m48439();
        final C21457 c21457 = this.f67409;
        C12826.requireNonNull(c21457);
        C16761 c16761 = (C16761) m48418(cM48439, new IntFunction() { // from class: l.ۜ᩻۠
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return c21457.m48602(i);
            }
        }, (Object) null);
        AbstractC9655 abstractC9655 = c15828M48596.f45850;
        int i = 1;
        if (abstractC9655 == null || c15828M48596.f20405 != EnumC3600.f7354) {
            throw m48431("bad.enclosing.class", c15828, c15828M48596);
        }
        c15828.mo18020();
        C5771 c5771M48419 = m48419(c16761, abstractC9655, c15828.f20409);
        if (c16761 != null && c5771M48419 == null) {
            C15828 c15828M17990 = this.f67402.m17990();
            InterfaceC19740 interfaceC19740 = this.f67397;
            C13370 c13370 = C13665.f38450;
            throw new C23305(c15828M17990, interfaceC19740, this.f67414.m18543(new C13370("compiler", "bad.enclosing.method", c15828)), this.f67414, this.f67401);
        }
        AbstractC12224 abstractC12224 = c15828.f45859;
        AbstractC12224 abstractC12225 = c15828M48596.f45859;
        if (!abstractC12224.m28205(abstractC12225)) {
            throw m48431("bad.enclosing.method", abstractC12224);
        }
        String strSubstring = abstractC12224.toString().substring(abstractC12225.toString().length());
        if (strSubstring.length() < 1 || strSubstring.charAt(0) != '$') {
            throw m48431("bad.enclosing.method", abstractC12224);
        }
        while (i < strSubstring.length() && '0' <= (cCharAt = strSubstring.charAt(i)) && cCharAt <= '9') {
            i++;
        }
        String strSubstring2 = strSubstring.substring(i);
        C8200 c8200 = this.f67427;
        AbstractC12224 abstractC12224M32717 = c8200.f21738.m32717(strSubstring2);
        c15828.f20408 = abstractC12224M32717;
        c15828.f20407 = c5771M48419 != null ? c5771M48419 : c15828M48596;
        if (abstractC12224M32717.isEmpty()) {
            c15828.f45855 = c8200.f21725;
        } else {
            c15828.f45855 = AbstractC21195.m47864(c15828.f20408, c15828.f20407);
        }
        if (c5771M48419 != null) {
            ((C21333) abstractC7783.f20406).mo7202(c5771M48419.f20406);
        } else if ((c15828.f20409 & 8) == 0) {
            ((C21333) abstractC7783.f20406).mo7202(c15828M48596.f20406);
        } else {
            ((C21333) abstractC7783.f20406).mo7202(AbstractC6462.f16700);
        }
        m48433(c15828, c15828.f20406);
        if (!this.f67426.isEmpty()) {
            C20271 c20271 = new C20271();
            Iterator it = this.f67426.iterator();
            while (it.hasNext()) {
                c20271.m45777(m48430(((AbstractC6462) it.next()).f16705.f20408));
            }
            this.f67421 = c20271.m45783();
            return;
        }
        this.f67421 = C4848.m10283();
    }

    /* JADX INFO: renamed from: ֫ */
    private C5771 m48419(C16761 c16761, AbstractC9655 abstractC9655, long j) {
        if (c16761 == null) {
            return null;
        }
        AbstractC12224 abstractC12224 = c16761.f49397;
        AbstractC6462 abstractC6462 = c16761.f49398;
        C12497 c12497Mo14809 = abstractC6462.mo14809();
        for (AbstractC7783 abstractC7783 : abstractC9655.m22456(abstractC12224)) {
            if (abstractC7783.f20405 == EnumC3600.f7343) {
                C12497 c12497Mo148010 = abstractC7783.f20406.mo14809();
                C4848 c4848 = c12497Mo148010.f35030;
                C8374 c8374 = this.f67398;
                C4848 c4848M10290 = c8374.m19460(c4848).m10290(c8374.m19459(c12497Mo148010.f35031));
                C4848 c4848M10291 = c12497Mo14809.f35030.m10290(c12497Mo14809.f35031);
                while (true) {
                    if (!c4848M10290.isEmpty() && !c4848M10291.isEmpty()) {
                        if (((AbstractC6462) c4848M10290.f11034).f16705 != ((AbstractC6462) c4848M10291.f11034).f16705) {
                            break;
                        }
                        c4848M10290 = c4848M10290.f11035;
                        c4848M10291 = c4848M10291.f11035;
                    } else {
                        if (!c4848M10290.isEmpty() || !c4848M10291.isEmpty()) {
                            break;
                        }
                        return (C5771) abstractC7783;
                    }
                }
            }
        }
        if (abstractC12224 == this.f67427.f21737 && (512 & j) == 0 && !abstractC6462.mo14797().isEmpty()) {
            return m48419(new C16761(abstractC12224, new C12497(abstractC6462.mo14797().f11035, abstractC6462.mo14787(), abstractC6462.mo14794(), this.f67412.f69163)), abstractC9655, j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48434(AbstractC7783 abstractC7783, EnumC8637 enumC8637) {
        char cM48439 = m48439();
        for (int i = 0; i < cM48439; i++) {
            AbstractC12224 abstractC12224M48603 = this.f67409.m48603(m48439());
            int iM48443 = m48443();
            AbstractC22049 abstractC22049 = (AbstractC22049) this.f67417.get(abstractC12224M48603);
            if (abstractC22049 != null && abstractC22049.mo12848(enumC8637)) {
                abstractC22049.mo5187(iM48443, abstractC7783);
            } else {
                this.f67411 += iM48443;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m48440(AbstractC7783 abstractC7783) {
        char cM48439 = m48439();
        C20271 c20271 = new C20271();
        for (int i = 0; i < cM48439; i++) {
            c20271.m45777(m48445());
        }
        C4848<C4614> c4848M45783 = c20271.m45783();
        if (c4848M45783.isEmpty()) {
            return;
        }
        C20271 c20272 = new C20271();
        for (C4614 c4614 : c4848M45783) {
            AbstractC6462 abstractC6462 = c4614.f29256;
            AbstractC12224 abstractC12224Mo18002 = abstractC6462.f16705.mo18002();
            C22004 c22004 = this.f67412;
            if (abstractC12224Mo18002 == c22004.f69150.f16705.mo18002()) {
                abstractC7783.f20409 |= 274877906944L;
            } else {
                AbstractC12224 abstractC12224Mo18003 = abstractC6462.f16705.mo18002();
                AbstractC12224 abstractC12224Mo18004 = c22004.f69166.f16705.mo18002();
                C8200 c8200 = this.f67427;
                if (abstractC12224Mo18003 == abstractC12224Mo18004) {
                    EnumC8045 enumC8045 = EnumC8045.f21174;
                    EnumC8045 enumC8046 = this.f67404;
                    if (enumC8046 != enumC8045) {
                        for (C24293 c24293 : c4614.f10344) {
                            if (c24293.f76952 == c8200.f21718) {
                                Object obj = c24293.f76953;
                                if (obj instanceof C19281) {
                                    C19281 c19281 = (C19281) obj;
                                    if (c19281.f29256 == c22004.f69134 && ((Integer) c19281.f57613).intValue() > enumC8046.f21177) {
                                        abstractC7783.f20409 |= 35184372088832L;
                                    }
                                }
                            }
                        }
                    }
                } else if (abstractC6462.f16705.mo18002() == c22004.f69175.f16705.mo18002()) {
                    abstractC7783.f20409 |= 72057594037927936L;
                    m48421(c4614, abstractC7783, c8200.f21750, 288230376151711744L);
                } else if (abstractC6462.f16705.mo18002() == c22004.f69148.f16705.mo18002()) {
                    C1446.m31704(abstractC7783.f20405 == EnumC3600.f7354);
                    abstractC7783.f20409 |= 9007199254740992L;
                } else {
                    AbstractC21195 abstractC21195 = abstractC6462.f16705;
                    if (abstractC21195 == c22004.f69133.f16705) {
                        this.f67430 = c4614;
                    } else if (abstractC21195 == c22004.f69212.f16705) {
                        this.f67407 = c4614;
                    } else if (abstractC21195 == c22004.f69130.f16705) {
                        abstractC7783.f20409 |= 18014398509613056L;
                        m48421(c4614, abstractC7783, c8200.f21690, 36028797018963968L);
                    } else if (abstractC21195 == c22004.f69173.f16705) {
                        abstractC7783.f20409 |= 72057594037927936L;
                        m48421(c4614, abstractC7783, c8200.f21750, 288230376151711744L);
                    } else if (abstractC21195 == c22004.f69132.f16705 && abstractC7783.f20405 == EnumC3600.f7354) {
                        abstractC7783.f20409 |= 9007199254740992L;
                    }
                    c20272.m45777(c4614);
                }
            }
        }
        this.f67419.m34507(new RunnableC19366(this, abstractC7783, c20272.m45783()));
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48421(C4614 c4614, AbstractC7783 abstractC7783, AbstractC12224 abstractC12224, long j) {
        for (C24293 c24293 : c4614.f10344) {
            if (c24293.f76952 == abstractC12224) {
                Object obj = c24293.f76953;
                if (obj instanceof C19281) {
                    C19281 c19281 = (C19281) obj;
                    if (c19281.f29256 == this.f67412.f69151 && ((Integer) c19281.f57613).intValue() != 0) {
                        abstractC7783.f20409 |= j;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m48446(AbstractC7783 abstractC7783) {
        int i = this.f67411;
        this.f67411 = i + 1;
        int i2 = this.f67429.f48563[i] & 255;
        C2601[] c2601Arr = this.f67394;
        if (c2601Arr == null) {
            this.f67394 = new C2601[i2];
        } else if (c2601Arr.length != i2) {
            throw m48431("bad.runtime.invisible.param.annotations", abstractC7783);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C2601[] c2601Arr2 = this.f67394;
            if (c2601Arr2[i3] == null) {
                c2601Arr2[i3] = new C2601();
            }
            C2601 c2601 = c2601Arr2[i3];
            char cM48439 = m48439();
            C20271 c20271 = new C20271();
            for (int i4 = 0; i4 < cM48439; i4++) {
                c20271.m45777(m48445());
            }
            C4848 c4848M45783 = c20271.m45783();
            C4848 c4848 = c2601.f4308;
            if (c4848 == null) {
                c2601.f4308 = c4848M45783;
            } else {
                c2601.f4308 = c4848.m10292(c4848M45783);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m48444(AbstractC7783 abstractC7783) {
        C11827 c11827M27112;
        C11827 c11827M27110;
        char cM48439 = m48439();
        if (cM48439 != 0) {
            C20271 c20271 = new C20271();
            for (int i = 0; i < cM48439; i++) {
                int iM48427 = m48427();
                if (!EnumC11275.m26200(iM48427)) {
                    throw m48431("bad.type.annotation.value", String.format("0x%02X", Integer.valueOf(iM48427)));
                }
                EnumC11275 enumC11275M26199 = EnumC11275.m26199(iM48427);
                switch (C12463.f34873[enumC11275M26199.ordinal()]) {
                    case 1:
                        char cM484310 = m48439();
                        c11827M27112 = C11827.m27112(m48442(), null, -1);
                        c11827M27112.f33013 = cM484310;
                        break;
                    case 2:
                        char cM484311 = m48439();
                        c11827M27112 = C11827.m27114(m48442(), null, -1);
                        c11827M27112.f33013 = cM484311;
                        break;
                    case 3:
                        char cM484312 = m48439();
                        c11827M27112 = C11827.m27096(m48442(), null, -1);
                        c11827M27112.f33013 = cM484312;
                        break;
                    case 4:
                        char cM484313 = m48439();
                        c11827M27112 = C11827.m27116(m48442(), null, -1);
                        c11827M27112.f33013 = cM484313;
                        break;
                    case 5:
                        int iM48439 = m48439();
                        int[] iArr = new int[iM48439];
                        int[] iArr2 = new int[iM48439];
                        int[] iArr3 = new int[iM48439];
                        for (int i2 = 0; i2 < iM48439; i2++) {
                            iArr[i2] = m48439();
                            iArr2[i2] = m48439();
                            iArr3[i2] = m48439();
                        }
                        c11827M27110 = C11827.m27110(m48442(), null, -1);
                        c11827M27110.f33004 = iArr;
                        c11827M27110.f33014 = iArr2;
                        c11827M27110.f33008 = iArr3;
                        continue;
                        c20271.m45777(new C22719(m48445(), c11827M27110));
                        break;
                    case 6:
                        int iM484310 = m48439();
                        int[] iArr4 = new int[iM484310];
                        int[] iArr5 = new int[iM484310];
                        int[] iArr6 = new int[iM484310];
                        for (int i3 = 0; i3 < iM484310; i3++) {
                            iArr4[i3] = m48439();
                            iArr5[i3] = m48439();
                            iArr6[i3] = m48439();
                        }
                        c11827M27110 = C11827.m27101(m48442(), null, -1);
                        c11827M27110.f33004 = iArr4;
                        c11827M27110.f33014 = iArr5;
                        c11827M27110.f33008 = iArr6;
                        continue;
                        c20271.m45777(new C22719(m48445(), c11827M27110));
                        break;
                    case 7:
                        char cM484314 = m48439();
                        c11827M27112 = C11827.m27103(m48442(), null, -1);
                        c11827M27112.m27119(cM484314);
                        break;
                    case 8:
                        c11827M27110 = C11827.m27106(m48442(), null, -1);
                        continue;
                        c20271.m45777(new C22719(m48445(), c11827M27110));
                        break;
                    case 9:
                        c11827M27110 = C11827.m27102(m48442(), null, m48427(), -1);
                        continue;
                        c20271.m45777(new C22719(m48445(), c11827M27110));
                        break;
                    case 10:
                        c11827M27110 = C11827.m27100(m48442(), null, m48427(), -1);
                        continue;
                        c20271.m45777(new C22719(m48445(), c11827M27110));
                        break;
                    case 11:
                        c11827M27110 = C11827.m27105(m48442(), null, m48427(), m48427(), -1);
                        continue;
                        c20271.m45777(new C22719(m48445(), c11827M27110));
                        break;
                    case 12:
                        c11827M27110 = C11827.m27098(m48442(), null, m48427(), m48427(), -1);
                        continue;
                        c20271.m45777(new C22719(m48445(), c11827M27110));
                        break;
                    case 13:
                        c11827M27110 = C11827.m27097(m48442(), null, m48439(), -1);
                        continue;
                        c20271.m45777(new C22719(m48445(), c11827M27110));
                        break;
                    case 14:
                        c11827M27110 = C11827.m27117(m48442(), null, m48439(), -1);
                        continue;
                        c20271.m45777(new C22719(m48445(), c11827M27110));
                        break;
                    case 15:
                        c11827M27110 = C11827.m27111(m48442(), null, m48427(), -1);
                        continue;
                        c20271.m45777(new C22719(m48445(), c11827M27110));
                        break;
                    case 16:
                        char cM484315 = m48439();
                        c11827M27112 = C11827.m27115(m48442(), null, m48427(), -1);
                        c11827M27112.f33013 = cM484315;
                        break;
                    case 17:
                        char cM484316 = m48439();
                        c11827M27112 = C11827.m27104(m48442(), null, m48427(), -1);
                        c11827M27112.f33013 = cM484316;
                        break;
                    case 18:
                        char cM484317 = m48439();
                        c11827M27112 = C11827.m27113(m48442(), null, m48427(), -1);
                        c11827M27112.f33013 = cM484317;
                        break;
                    case 19:
                        char cM484318 = m48439();
                        c11827M27112 = C11827.m27109(m48442(), null, m48427(), -1);
                        c11827M27112.f33013 = cM484318;
                        break;
                    case 20:
                        char cM484319 = m48439();
                        c11827M27112 = C11827.m27107(m48442(), null, m48427(), -1);
                        c11827M27112.f33013 = cM484319;
                        break;
                    case 21:
                        c11827M27110 = C11827.m27099(m48442(), null, -1);
                        continue;
                        c20271.m45777(new C22719(m48445(), c11827M27110));
                        break;
                    case 22:
                        c11827M27110 = C11827.m27108(m48442(), null, -1);
                        continue;
                        c20271.m45777(new C22719(m48445(), c11827M27110));
                        break;
                    case 23:
                        throw new AssertionError("jvm.ClassReader: UNKNOWN target type should never occur!");
                    default:
                        throw new AssertionError("jvm.ClassReader: Unknown target type for position: " + enumC11275M26199);
                }
                c11827M27110 = c11827M27112;
                c20271.m45777(new C22719(m48445(), c11827M27110));
            }
            this.f67419.m34507(new C16682(this, abstractC7783, c20271.m45783()));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48432(AbstractC7783 abstractC7783) {
        C5771 c5771 = (C5771) abstractC7783;
        AbstractC10564 abstractC10564M48447 = m48447();
        c5771.f14175 = abstractC10564M48447;
        this.f67419.m34507(new RunnableC18695(this, c5771, abstractC10564M48447));
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m48429(int i) {
        if (this.f67424.f3687 == this.f67402) {
            return new C7296(this, i);
        }
        return this.f67409.m48604(i);
    }

    /* JADX INFO: renamed from: ܿ */
    public final C4614 m48445() {
        AbstractC6462 abstractC6462M48429;
        if (this.f67424.f3687 != this.f67402) {
            abstractC6462M48429 = m48429((int) m48439());
        } else {
            abstractC6462M48429 = new C7296(this, m48439());
        }
        char cM48439 = m48439();
        C20271 c20271 = new C20271();
        for (int i = 0; i < cM48439; i++) {
            c20271.m45777(new C24293(this.f67409.m48603(m48439()), m48447()));
        }
        return new C4614(abstractC6462M48429, c20271.m45783());
    }

    /* JADX INFO: renamed from: ܳ */
    public final C4848 m48442() {
        C14508 c14508;
        int iM48427 = m48427();
        C20271 c20271 = new C20271();
        for (int i = 0; i < iM48427 * 2; i++) {
            c20271.m45777(Integer.valueOf(m48427()));
        }
        C4848 c4848M45783 = c20271.m45783();
        C4848 c4848 = C11827.f32999;
        C20271 c20272 = new C20271();
        Iterator it = c4848M45783.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C1446.m31704(it.hasNext());
            Integer num2 = (Integer) it.next();
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            C14508 c14509 = C14508.f41418;
            C1446.m31704(iIntValue2 == 0 || iIntValue == EnumC13838.TYPE_ARGUMENT.f39105);
            if (iIntValue == 0) {
                c14508 = C14508.f41418;
            } else if (iIntValue == 1) {
                c14508 = C14508.f41420;
            } else if (iIntValue == 2) {
                c14508 = C14508.f41419;
            } else {
                if (iIntValue != 3) {
                    C1446.m31702("Invalid TypePathEntryKind tag: " + iIntValue);
                    throw null;
                }
                c14508 = new C14508(EnumC13838.TYPE_ARGUMENT, iIntValue2);
            }
            c20272.m45777(c14508);
        }
        return c20272.m45783();
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m48418(int i, IntFunction intFunction, Object obj) {
        return i == 0 ? obj : intFunction.apply(i);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC10564 m48447() {
        int i = this.f67411;
        this.f67411 = i + 1;
        char c = (char) this.f67429.f48563[i];
        if (c != '@') {
            C22004 c22004 = this.f67412;
            if (c == 'F') {
                return new C19281(this.f67409.m48597(m48439()), c22004.f69165);
            }
            if (c == 'S') {
                return new C19281(this.f67409.m48597(m48439()), c22004.f69195);
            }
            if (c == 'c') {
                AbstractC6462 abstractC6462M48429 = m48429((int) m48439());
                C11320 c11320 = new C11320(null);
                c11320.f31520 = abstractC6462M48429;
                return c11320;
            }
            if (c == 'e') {
                AbstractC6462 abstractC6462M484210 = m48429((int) m48439());
                AbstractC12224 abstractC12224M48603 = this.f67409.m48603(m48439());
                C5955 c5955 = new C5955(null);
                c5955.f14713 = abstractC6462M484210;
                c5955.f14714 = abstractC12224M48603;
                return c5955;
            }
            if (c == 's') {
                return new C19281(this.f67409.m48603(m48439()).toString(), c22004.f69215);
            }
            if (c == 'I') {
                return new C19281(this.f67409.m48597(m48439()), c22004.f69134);
            }
            if (c == 'J') {
                return new C19281(this.f67409.m48597(m48439()), c22004.f69152);
            }
            if (c == 'Z') {
                return new C19281(this.f67409.m48597(m48439()), c22004.f69151);
            }
            if (c != '[') {
                switch (c) {
                    case 'B':
                        return new C19281(this.f67409.m48597(m48439()), c22004.f69184);
                    case 'C':
                        return new C19281(this.f67409.m48597(m48439()), c22004.f69136);
                    case 'D':
                        return new C19281(this.f67409.m48597(m48439()), c22004.f69181);
                    default:
                        throw new AssertionError("unknown annotation tag '" + c + "'");
                }
            }
            char cM48439 = m48439();
            C20271 c20271 = new C20271();
            for (int i2 = 0; i2 < cM48439; i2++) {
                c20271.m45777(m48447());
            }
            C4848 c4848M45783 = c20271.m45783();
            C24730 c24730 = new C24730(null);
            c24730.f78296 = c4848M45783;
            return c24730;
        }
        return m48445();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48435(AbstractC12224 abstractC12224, AbstractC6462 abstractC6462) {
        if ((!abstractC6462.m14777(EnumC11353.METHOD) && !abstractC6462.m14777(EnumC11353.FORALL)) || (abstractC12224 == this.f67427.f21737 && !abstractC6462.mo14787().m14777(EnumC11353.VOID))) {
            throw m48431("method.descriptor.invalid", abstractC12224);
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m48438() {
        this.f67411 += 6;
        char cM48439 = m48439();
        for (int i = 0; i < cM48439; i++) {
            this.f67411 += 2;
            this.f67411 += m48443();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48433(AbstractC7783 abstractC7783, AbstractC6462 abstractC6462) {
        if (abstractC6462.mo7201() != null) {
            if (!abstractC6462.mo7201().m14777(EnumC11353.NONE)) {
                m48433(abstractC7783.f20407, abstractC6462.mo7201());
            }
        } else if (abstractC7783.f20405 == EnumC3600.f7343 && !abstractC7783.mo17483()) {
            AbstractC7783 abstractC7784 = abstractC7783.f20407;
            m48433(abstractC7784, abstractC7784.f20406);
        }
        for (C4848 c4848Mo14802 = abstractC6462.mo14802(); c4848Mo14802.m10293(); c4848Mo14802 = c4848Mo14802.f11035) {
            this.f67425.mo28415(((AbstractC6462) c4848Mo14802.f11034).f16705);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m48441(C15828 c15828) {
        char cM48439 = m48439();
        for (int i = 0; i < cM48439; i++) {
            m48439();
            char cM484310 = m48439();
            char cM484311 = m48439();
            final C21457 c21457 = this.f67409;
            C12826.requireNonNull(c21457);
            C15828 c15829 = (C15828) m48418(cM484310, new IntFunction() { // from class: l.᩻᩻۠
                @Override // java.util.function.IntFunction
                public final Object apply(int i2) {
                    return c21457.m48596(i2);
                }
            }, (Object) null);
            C21457 c21458 = this.f67409;
            C12826.requireNonNull(c21458);
            C16485 c16485 = new C16485(c21458);
            C8200 c8200 = this.f67427;
            AbstractC12224 abstractC12224 = c8200.f21725;
            AbstractC12224 abstractC12225 = c8200.f21725;
            AbstractC12224 abstractC12226 = (AbstractC12224) m48418(cM484311, c16485, abstractC12224);
            if (abstractC12226 == null) {
                abstractC12226 = abstractC12225;
            }
            long jM48439 = m48439();
            if ((X931RNG.BLOCK64_RESEED_MAX & jM48439) != 0) {
                jM48439 = (jM48439 & (-32769)) | 2251799813685248L;
            }
            long j = (-33) & jM48439;
            if (c15829 != null) {
                if (abstractC12226 == abstractC12225) {
                    abstractC12226 = c8200.f21679;
                }
                C15828 c15828M49588 = this.f67412.m49588(this.f67424, abstractC12226, c15829);
                if ((jM48439 & 8) == 0) {
                    ((C21333) c15828M49588.f20406).mo7202(c15829.f20406);
                    AbstractC6462 abstractC6462 = c15828M49588.f20411;
                    if (abstractC6462 != null) {
                        ((C21333) abstractC6462).mo7202(this.f67398.m19459(c15829.f20406));
                    }
                }
                if (c15828 == c15829) {
                    c15828M49588.f20409 = j;
                    m48422(c15828, c15828M49588);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m48426(C15828 c15828) {
        C8374 c8374;
        C5771 c5771;
        int iM7029;
        AbstractC6462 abstractC6462;
        AbstractC12224 abstractC12224M32717;
        AbstractC12224 abstractC12224;
        long j;
        C2601 c2601;
        C4848 c4848;
        int i;
        int i2;
        boolean z;
        char c = 0;
        if (m48443() != -889275714) {
            throw m48431("illegal.start.of.class.file", new Object[0]);
        }
        this.f67413 = m48439();
        this.f67400 = m48439();
        int i3 = EnumC18497.m42040().f55255;
        int i4 = EnumC18497.m42040().f55256;
        int i5 = this.f67413;
        boolean z2 = i5 == 65535;
        int i6 = this.f67400;
        int i7 = 2;
        C23623 c23623 = this.f67388;
        if (i6 > i3 || (i6 * 1000) + i5 < (EnumC18497.m42041().f55255 * 1000) + EnumC18497.m42041().f55256) {
            int i8 = this.f67400;
            if (i8 != i3 + 1 || z2) {
                throw m48431("wrong.version", Integer.toString(i8), Integer.toString(this.f67413), Integer.toString(i3), Integer.toString(i4));
            }
            InterfaceC19740 interfaceC19740 = this.f67397;
            C12895 c12895 = C15675.f45417;
            c23623.m9354(new C12895("compiler", "big.major.version", interfaceC19740, Integer.valueOf(i8), Integer.valueOf(i3)));
        }
        if (z2) {
            C24387 c24387 = this.f67408;
            if (c24387.m53743()) {
                c24387.m53746(c15828.f45854, this.f67400);
            } else {
                c23623.m9355(c24387.m53739(this.f67397, this.f67400));
            }
        }
        C16525 c16525 = this.f67429;
        C8200 c8200 = this.f67427;
        C22004 c22004 = this.f67412;
        C21457 c21457 = new C21457(this, c16525, c8200, c22004);
        this.f67409 = c21457;
        int iM48594 = c21457.m48594(c16525, this.f67411);
        this.f67411 = iM48594;
        if (this.f67420.length < iM48594) {
            this.f67420 = new byte[Integer.highestOneBit(iM48594) << 1];
        }
        C21333 c21333 = (C21333) c15828.f20406;
        c15828.f45850 = AbstractC15689.m35727(c15828);
        this.f67425 = this.f67425.mo28413(this.f67402);
        if (c21333.mo7201().m14777(EnumC11353.CLASS)) {
            m48433(c15828.f20407, c21333.mo7201());
        }
        long jM48439 = m48439();
        if ((X931RNG.BLOCK64_RESEED_MAX & jM48439) != 0) {
            jM48439 = (jM48439 & (-32769)) | 2251799813685248L;
        }
        long j2 = (-33) & jM48439;
        long j3 = jM48439 & 2251799813685248L;
        if (j3 == 0) {
            EnumC3600 enumC3600 = c15828.f20407.f20405;
            if (enumC3600 == EnumC3600.f7351 || enumC3600 == EnumC3600.f7353) {
                c15828.f20409 = j2;
            }
            this.f67424 = c15828.m18008().f27063;
            C15828 c15828M48596 = this.f67409.m48596(m48439());
            if (c15828 != c15828M48596) {
                throw m48431("class.file.wrong.class", c15828M48596.f45859);
            }
        } else {
            int i9 = this.f67400;
            if (i9 < EnumC18497.V53.f55255) {
                throw m48431("anachronistic.module.info", Integer.toString(i9), Integer.toString(this.f67413));
            }
            c15828.f20409 = j2;
            AbstractC7783 abstractC7783 = c15828.f20407;
            if (abstractC7783.f20405 != EnumC3600.f7340) {
                throw m48431("module.info.definition.expected", new Object[0]);
            }
            this.f67424 = (C2417) abstractC7783;
            m48439();
        }
        int i10 = this.f67411;
        m48439();
        this.f67411 = (m48439() * 2) + this.f67411;
        char cM48439 = m48439();
        for (int i11 = 0; i11 < cM48439; i11++) {
            m48438();
        }
        char cM484310 = m48439();
        for (int i12 = 0; i12 < cM484310; i12++) {
            m48438();
        }
        m48434(c15828, EnumC8637.CLASS);
        C4848 c4849 = c15828.f45853;
        if (c4849 != null && !c4849.isEmpty()) {
            c15828.f20409 |= SkeinEngine.UbiTweak.T1_FIRST;
        }
        this.f67411 = i10;
        char cM484311 = m48439();
        if (j3 != 0 && cM484311 > 0) {
            throw m48431("module.info.invalid.super.class", new Object[0]);
        }
        if (c21333.f67259 == null) {
            c21333.f67259 = (AbstractC6462) m48418(cM484311, new IntFunction() { // from class: l.ܿ᩻۠
                @Override // java.util.function.IntFunction
                public final Object apply(int i13) {
                    C21378 c21378 = this.f57269;
                    return c21378.f67409.m48596(i13).mo18010(c21378.f67398);
                }
            }, AbstractC6462.f16700);
        }
        char cM484312 = m48439();
        C4848 c4848M10283 = C4848.m10283();
        int i13 = 0;
        while (true) {
            c8374 = this.f67398;
            if (i13 >= cM484312) {
                break;
            }
            c4848M10283 = c4848M10283.m10290(this.f67409.m48596(m48439()).mo18010(c8374));
            i13++;
        }
        if (c21333.f67261 == null) {
            c21333.f67261 = c4848M10283.m10294();
        }
        C1446.m31704(cM48439 == m48439());
        for (int i14 = 0; i14 < cM48439; i14++) {
            AbstractC7783 c13818 = new C13818(m48439(), this.f67409.m48603(m48439()), this.f67409.m48604(m48439()), this.f67402);
            m48434(c13818, EnumC8637.MEMBER);
            m48422(c15828, c13818);
        }
        C1446.m31704(cM484310 == m48439());
        int i15 = 0;
        while (i15 < cM484310) {
            long jM484310 = m48439();
            if ((64 & jM484310) != 0) {
                jM484310 = (jM484310 & (-65)) | 2147483648L;
            }
            if ((128 & jM484310) != 0) {
                jM484310 = (jM484310 & (-129)) | 17179869184L;
            }
            AbstractC12224 abstractC12224M48603 = this.f67409.m48603(m48439());
            AbstractC6462 abstractC6462M48604 = this.f67409.m48604(m48439());
            if (this.f67402.m17989() && (jM484310 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0 && !abstractC12224M48603.equals(c8200.f21700)) {
                int i16 = this.f67400;
                EnumC18497 enumC18497 = EnumC18497.V52;
                int i17 = enumC18497.f55255;
                if (i16 <= i17 && (i16 != i17 || this.f67413 < enumC18497.f55256)) {
                    String str = (8 & jM484310) == 0 ? "invalid.default.interface" : "invalid.static.interface";
                    Object string = Integer.toString(i16);
                    Object string2 = Integer.toString(this.f67413);
                    Object[] objArr = new Object[i7];
                    objArr[c] = string;
                    objArr[1] = string2;
                    throw m48431(str, objArr);
                }
                if ((10 & jM484310) == 0) {
                    this.f67402.f20409 |= 8796093022208L;
                    jM484310 |= 8796093023232L;
                }
            }
            m48435(abstractC12224M48603, abstractC6462M48604);
            if (abstractC12224M48603 == c8200.f21737 && this.f67402.m18006()) {
                AbstractC15689 abstractC15689Mo17983 = this.f67402.f20407.mo17983();
                AbstractC7783 abstractC7784 = this.f67402;
                EnumC3620 enumC3620 = EnumC3620.NON_RECURSIVE;
                abstractC15689Mo17983.getClass();
                boolean zHasNext = abstractC15689Mo17983.mo22457(abstractC7784.f20408, new C9635(abstractC7784), enumC3620).iterator().hasNext();
                if (!this.f67402.f20408.isEmpty() && zHasNext) {
                    C4848<AbstractC6462> c4848Mo14797 = abstractC6462M48604.mo14797();
                    if (!c4848Mo14797.isEmpty()) {
                        if ((jM484310 & 17179869184L) != 0) {
                            AbstractC6462 abstractC6463 = (AbstractC6462) c4848Mo14797.last();
                            C20271 c20271 = new C20271();
                            for (AbstractC6462 abstractC6462M16606 : c4848Mo14797) {
                                if (abstractC6462M16606 == abstractC6463) {
                                    abstractC6462M16606 = ((C7251) abstractC6462M16606).m16606();
                                }
                                c20271.m45777(abstractC6462M16606);
                            }
                            c4848Mo14797 = c20271.m45783();
                        }
                        c4848Mo14797 = c4848Mo14797.f11035;
                    }
                    abstractC6462M48604 = new C12497(c4848Mo14797, abstractC6462M48604.mo14787(), abstractC6462M48604.mo14794(), c22004.f69163);
                }
            }
            C5771 c5772 = new C5771(jM484310, abstractC12224M48603, abstractC6462M48604, this.f67402);
            if (c8374.m19443(c5772)) {
                c5772.f20409 |= 70368744177664L;
            }
            if (this.f67428) {
                int iM7019 = C3666.m7019(c5772.f20406.mo14797()) + 4;
                int[] iArr = this.f67392;
                if (iArr == null || iArr.length < iM7019) {
                    this.f67392 = new int[iM7019];
                    z = false;
                } else {
                    z = false;
                    Arrays.fill(iArr, 0);
                }
                this.f67410 = z;
            }
            AbstractC7783 abstractC7785 = this.f67402;
            this.f67402 = c5772;
            try {
                m48434(c5772, EnumC8637.MEMBER);
                this.f67402 = abstractC7785;
                m48435(abstractC12224M48603, c5772.f20406);
                if (this.f67410) {
                    iM7029 = 0;
                } else {
                    iM7029 = (c5772.f20409 & 8) == 0 ? 1 : 0;
                    if (c5772.f20408 == c8200.f21737 && this.f67402.m18006() && !this.f67402.f20408.isEmpty()) {
                        iM7029++;
                    }
                    if (c5772.f20406 != abstractC6462M48604) {
                        iM7029 += C3666.m7019(abstractC6462M48604.mo14797()) - C3666.m7019(c5772.f20406.mo14797());
                    }
                }
                HashSet hashSet = new HashSet();
                C20271 c20272 = new C20271();
                int i18 = 0;
                for (AbstractC6462 abstractC6464 : c5772.f20406.mo14797()) {
                    C22004 c22005 = c22004;
                    int[] iArr2 = this.f67423;
                    long j4 = 8589934592L;
                    char c2 = cM484310;
                    if (iArr2 != null && iM7029 < iArr2.length && (i2 = iArr2[iM7029]) != 0) {
                        j4 = ((long) i2) | 8589934592L;
                    }
                    int[] iArr3 = this.f67392;
                    if (iArr3 == null || iM7029 >= iArr3.length || (i = iArr3[iM7029]) == 0) {
                        String strM40053 = "arg";
                        while (true) {
                            StringBuilder sbM17248 = C7470.m17248(strM40053);
                            sbM17248.append(hashSet.size());
                            abstractC12224M32717 = c8200.f21738.m32717(sbM17248.toString());
                            if (!hashSet.contains(abstractC12224M32717)) {
                                break;
                            } else {
                                strM40053 = C17588.m40053(strM40053, "$");
                            }
                        }
                        abstractC12224 = abstractC12224M32717;
                        j = j4;
                    } else {
                        C21457 c21458 = this.f67409;
                        C12826.requireNonNull(c21458);
                        abstractC12224 = (AbstractC12224) m48418(i, new C16485(c21458), c8200.f21725);
                        j = j4 | 4503599627370496L;
                    }
                    hashSet.add(abstractC12224);
                    C16499 c16499 = new C16499(j, abstractC12224, abstractC6464, c5772);
                    c20272.m45777(c16499);
                    C2601[] c2601Arr = this.f67394;
                    if (c2601Arr != null && (c2601 = c2601Arr[i18]) != null && (c4848 = c2601.f4308) != null && !c4848.isEmpty()) {
                        this.f67419.m34507(new RunnableC19366(this, c16499, c2601.f4308));
                    }
                    iM7029 += this.f67410 ? 1 : C3666.m7029(abstractC6464);
                    i18++;
                    c22004 = c22005;
                    cM484310 = c2;
                    abstractC6462M48604 = abstractC6462M48604;
                }
                C22004 c22006 = c22004;
                char c3 = cM484310;
                AbstractC6462 abstractC6465 = abstractC6462M48604;
                C2601[] c2601Arr2 = this.f67394;
                if (c2601Arr2 != null && c2601Arr2.length != i18) {
                    throw m48431("bad.runtime.invisible.param.annotations", c5772);
                }
                C1446.m31706(c5772.f14172);
                c5772.f14172 = c20272.m45783();
                this.f67394 = null;
                this.f67392 = null;
                this.f67423 = null;
                if ((jM484310 & 17179869184L) != 0 && ((abstractC6462 = (AbstractC6462) abstractC6465.mo14797().last()) == null || !abstractC6462.m14777(EnumC11353.ARRAY))) {
                    c5772.f20409 &= -17179869185L;
                    throw m48431("malformed.vararg.method", c5772);
                }
                m48422(c15828, c5772);
                i15++;
                c = 0;
                i7 = 2;
                c22004 = c22006;
                cM484310 = c3;
            } catch (Throwable th) {
                this.f67402 = abstractC7785;
                throw th;
            }
        }
        if (c15828.m35942()) {
            for (C22536 c22536 : c15828.m35943()) {
                AbstractC12224 abstractC12225 = c22536.f20408;
                C4848 c4848M10284 = C4848.m10283();
                c15828.mo18020();
                AbstractC15689 abstractC15689 = c15828.f45850;
                C19384 c19384 = new C19384(1);
                abstractC15689.getClass();
                Iterator it = abstractC15689.mo22457(abstractC12225, c19384, EnumC3620.RECURSIVE).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c5771 = null;
                        break;
                    }
                    AbstractC7783 abstractC7786 = (AbstractC7783) it.next();
                    if (c8374.m19489(abstractC7786.f20406.mo14797(), c4848M10284)) {
                        c5771 = (C5771) abstractC7786;
                        break;
                    }
                }
                c22536.f71074 = c5771;
            }
        }
        this.f67425 = this.f67425.mo28410();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48436(C15828 c15828) {
        C8374 c8374 = this.f67398;
        this.f67402 = c15828;
        this.f67397 = c15828.f45854;
        this.f67403.clear();
        this.f67393 = true;
        this.f67430 = null;
        this.f67407 = null;
        try {
            try {
                this.f67411 = 0;
                C16525 c16525 = this.f67429;
                c16525.f48564 = 0;
                c16525.m37502(c15828.f45854.mo22776());
                m48426(c15828);
                if (!this.f67426.isEmpty() && !this.f67421.isEmpty()) {
                    C4848 c4848 = this.f67426;
                    C4848 c4849 = this.f67421;
                    this.f67426 = C4848.m10283();
                    this.f67421 = C4848.m10283();
                    this.f67387 = C4848.m10283();
                    this.f67422 = C4848.m10283();
                    this.f67393 = false;
                    C21333 c21333 = (C21333) this.f67402.f20406;
                    c21333.f67259 = c8374.m19428(c21333.f67259, c4848, c4849);
                    c21333.f67261 = c8374.m19421(c21333.f67261, c4848, c4849);
                    C4848 c4848M19461 = c8374.m19461(c21333.f67257, c4848, c4849);
                    c21333.f67257 = c4848M19461;
                    while (c4848M19461.m10293()) {
                        Object obj = c4848M19461.f11034;
                        ((AbstractC6462) obj).f16705.f20406 = (AbstractC6462) obj;
                        c4848M19461 = c4848M19461.f11035;
                    }
                } else if (this.f67426.isEmpty() != this.f67421.isEmpty()) {
                    throw m48431("undecl.type.var", ((AbstractC6462) this.f67426.f11034).f16705.f20408);
                }
                if ((c15828.f20409 & 8192) != 0) {
                    c15828.m35937(new C23147(c15828, new C17353(this, c15828, this.f67430, this.f67407)));
                } else {
                    c15828.m35937(C23147.m51602());
                }
                if (c15828 == this.f67424.f3687) {
                    if (this.f67387.m10293() || this.f67422.m10293()) {
                        C1446.m31704(this.f67424.f20410.mo9173());
                        C2417 c2417 = this.f67424;
                        c2417.f3699 = new C23389(this, c2417, this.f67387, this.f67422);
                    } else {
                        this.f67424.f3693 = C4848.m10283();
                        this.f67424.f3701 = C4848.m10283();
                    }
                }
                this.f67387 = C4848.m10283();
                this.f67422 = C4848.m10283();
                this.f67426 = C4848.m10283();
                this.f67421 = C4848.m10283();
                this.f67393 = false;
            } catch (IOException e) {
                e = e;
                throw m48431("unable.to.access.file", e.toString());
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw m48431("bad.class.file", c15828.f45859);
            } catch (ClosedFileSystemException e2) {
                e = e2;
                throw m48431("unable.to.access.file", e.toString());
            }
        } catch (Throwable th) {
            this.f67387 = C4848.m10283();
            this.f67422 = C4848.m10283();
            this.f67426 = C4848.m10283();
            this.f67421 = C4848.m10283();
            this.f67393 = false;
            throw th;
        }
    }
}
