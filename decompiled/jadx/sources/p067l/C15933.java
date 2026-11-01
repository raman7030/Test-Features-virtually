package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.color.MaterialColors;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.digests.SkeinEngine;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ܳۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K434 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15933 {

    /* JADX INFO: renamed from: ۤ */
    public static final C13370[][] f46071;

    /* JADX INFO: renamed from: ֡ */
    public C23623 f46072;

    /* JADX INFO: renamed from: ֨ */
    public C8200 f46073;

    /* JADX INFO: renamed from: ֫ */
    public C18537 f46074;

    /* JADX INFO: renamed from: ۖ */
    public C5638 f46075;

    /* JADX INFO: renamed from: ۗ */
    public EnumC17840 f46076;

    /* JADX INFO: renamed from: ۘ */
    public boolean f46077;

    /* JADX INFO: renamed from: ۙ */
    public C11281 f46078;

    /* JADX INFO: renamed from: ۜ */
    public boolean f46080;

    /* JADX INFO: renamed from: ۡ */
    public final AbstractC13884 f46082;

    /* JADX INFO: renamed from: ۢ */
    public final C10570 f46083;

    /* JADX INFO: renamed from: ۬ */
    public C23311 f46086;

    /* JADX INFO: renamed from: ܳ */
    public boolean f46087;

    /* JADX INFO: renamed from: ܽ */
    public C4535 f46090;

    /* JADX INFO: renamed from: ܿ */
    public boolean f46091;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f46092;

    /* JADX INFO: renamed from: ᩴ */
    public boolean f46093;

    /* JADX INFO: renamed from: ᩶ */
    public C24387 f46095;

    /* JADX INFO: renamed from: ᩸ */
    public final boolean f46097;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f46099;

    /* JADX INFO: renamed from: ۫ */
    public C4848 f46085 = C4848.m10283();

    /* JADX INFO: renamed from: ᩹ */
    public boolean f46098 = false;

    /* JADX INFO: renamed from: ۚ */
    public int f46079 = 0;

    /* JADX INFO: renamed from: ᩵ */
    public int f46094 = 0;

    /* JADX INFO: renamed from: ܺ */
    public int f46089 = -1;

    /* JADX INFO: renamed from: ᩷ */
    public int f46096 = 0;

    /* JADX INFO: renamed from: ۠ */
    public ArrayList f46081 = new ArrayList();

    /* JADX INFO: renamed from: ܶ */
    public ArrayList f46088 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public C19866 f46084 = new C19866(5);

    /* JADX INFO: renamed from: ֫ */
    public final void m36107(int i, AbstractC14355 abstractC14355, C20271 c20271) {
        C18537 c18537 = this.f46074;
        c18537.f55352 = i;
        C12344 c12344M42196 = c18537.m42196(m36134(abstractC14355));
        AbstractC13884 abstractC13884 = this.f46082;
        c20271.m45777(abstractC13884.mo31589(c12344M42196));
        while (this.f46086.f73357 == EnumC21300.f67022) {
            m36145();
            int i2 = this.f46086.f73358;
            AbstractC14355 abstractC14355M36147 = m36147(1);
            c18537.f55352 = i2;
            c20271.m45777(abstractC13884.mo31589(c18537.m42196(m36134(abstractC14355M36147))));
        }
    }

    public C15933(C17274 c17274, C4535 c4535, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC13884 c23942;
        this.f46090 = c4535;
        m36145();
        C18537 c18537 = c17274.f51483;
        this.f46074 = c18537;
        this.f46072 = c17274.f51484;
        this.f46073 = c17274.f51486;
        EnumC17840 enumC17840 = c17274.f51489;
        this.f46076 = enumC17840;
        this.f46095 = c17274.f51487;
        String strM30872 = c17274.f51488.m30872("allowStringFolding");
        this.f46087 = strM30872 == null ? true : Boolean.parseBoolean(strM30872);
        this.f46077 = z;
        this.f46097 = z4;
        this.f46083 = z ? new C10570(c17274) : null;
        this.f46093 = z2;
        this.f46075 = c18537.m42191();
        if (z3) {
            c23942 = new C18616(this);
        } else {
            c23942 = new C23942(this);
        }
        this.f46082 = c23942;
        this.f46080 = EnumC12477.f34979.m28726(enumC17840);
        this.f46092 = EnumC12477.f34978.m28726(enumC17840);
        this.f46091 = EnumC12477.f34959.m28726(enumC17840);
    }

    /* JADX INFO: renamed from: ֡ */
    public final void m36075() {
        this.f46079 = (this.f46079 & 32) | 1;
    }

    /* JADX INFO: renamed from: ۚ */
    public final void m36123() {
        this.f46079 = (this.f46079 & 32) | 2;
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m36145() {
        C4535 c4535 = this.f46090;
        c4535.m9589();
        this.f46086 = c4535.m9588(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m36115(int i, Predicate predicate) {
        return predicate.test(this.f46090.m9588(i + 1).f73357);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m36116(int i, Predicate predicate, Predicate predicate2) {
        C4535 c4535 = this.f46090;
        return predicate.test(c4535.m9588(i + 1).f73357) && predicate2.test(c4535.m9588(i + 2).f73357);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36114(boolean z, boolean z2, boolean z3, boolean z4) {
        while (true) {
            switch (C14554.f41514[this.f46086.f73357.ordinal()]) {
                case 1:
                    m36145();
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return;
                case 10:
                    if (z) {
                        return;
                    }
                    break;
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                    if (z2) {
                        return;
                    }
                    break;
                case 31:
                case 32:
                    if (z3) {
                        return;
                    }
                    break;
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    if (z4) {
                        return;
                    }
                    break;
                case 51:
                    if (z4) {
                        return;
                    }
                    break;
            }
            m36145();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C5638 m36130(int i, C14040 c14040) {
        return m36085(i, C4848.m10283(), c14040);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5638 m36085(int i, C4848 c4848, C14040 c14040) {
        AbstractC7257 abstractC7257;
        m36137(i);
        C18537 c18537 = this.f46074;
        c18537.f55352 = i;
        C5638 c5638M42192 = c18537.m42192(c4848);
        m36108(c5638M42192, c14040);
        if (c4848 != null && (abstractC7257 = (AbstractC7257) c4848.last()) != null) {
            m36109(abstractC7257, i);
        }
        return (C5638) this.f46082.mo31589(c5638M42192);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36106(int i, C14040 c14040) {
        m36108(new C9346(i), c14040);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36108(InterfaceC5323 interfaceC5323, C14040 c14040) {
        int iMo11523 = interfaceC5323.mo11523();
        C4535 c4535 = this.f46090;
        if (iMo11523 > c4535.m9585() || iMo11523 == -1) {
            EnumC21300 enumC21300 = this.f46086.f73357;
            EnumC21300 enumC21301 = EnumC21300.f67019;
            C23623 c23623 = this.f46072;
            if (enumC21300 == enumC21301) {
                c23623.m9359(EnumC21417.SYNTAX, interfaceC5323, C8300.f22082);
            } else {
                c23623.m9359(EnumC21417.SYNTAX, interfaceC5323, c14040);
            }
        }
        c4535.m9586(iMo11523);
        C23311 c23311 = this.f46086;
        int i = c23311.f73358;
        if (i == this.f46089 && c23311.f73357 != EnumC21300.f67019) {
            int i2 = this.f46096;
            this.f46096 = i2 + 1;
            C1446.m31704(i2 < 50);
        } else {
            this.f46096 = 0;
            this.f46089 = i;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36112(EnumC21300 enumC21300) {
        m36113(enumC21300, new C14929(5));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36113(EnumC21300 enumC21300, Function function) {
        C23311 c23311 = this.f46086;
        if (c23311.f73357 == enumC21300) {
            m36145();
        } else {
            m36137(c23311.f73358);
            m36106(this.f46090.m9591().f73356, (C14040) function.apply(enumC21300));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5638 m36084(int i) {
        m36137(i);
        if ((this.f46079 & 1) != 0) {
            return m36130(i, C8300.f22042);
        }
        return m36130(i, C8300.f22070);
    }

    /* JADX INFO: renamed from: ۢ */
    public final C5638 m36127() {
        return m36084(this.f46086.f73358);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36110(AbstractC7257 abstractC7257, InterfaceC7217 interfaceC7217) {
        if (!this.f46077 || interfaceC7217 == null) {
            return;
        }
        this.f46083.m24361(abstractC7257, interfaceC7217);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36109(AbstractC7257 abstractC7257, int i) {
        this.f46082.mo8721(abstractC7257, i);
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC14355 m36062(AbstractC14355 abstractC14355, C4848 c4848, boolean z) {
        EnumC19998 enumC19998;
        EnumC19998 enumC19999;
        AbstractC13884 abstractC13884 = this.f46082;
        int iMo8719 = abstractC13884.mo8719(abstractC14355);
        C25084 c25084 = null;
        AbstractC14355 abstractC14356 = abstractC14355;
        while (C9268.m21431(abstractC14356).m16617(EnumC19998.f60742)) {
            c25084 = (C25084) C9268.m21431(abstractC14356);
            abstractC14356 = c25084.f80025;
        }
        C18537 c18537 = this.f46074;
        if (z) {
            c18537.f55352 = this.f46086.f73358;
            abstractC14356 = (AbstractC14355) abstractC13884.mo31588(c18537.m42212(abstractC14356));
            iMo8719 = abstractC13884.mo8719(abstractC14356);
        }
        if (c4848.m10293()) {
            AbstractC14355 abstractC14357 = abstractC14356;
            AbstractC14355 abstractC14358 = abstractC14357;
            while (true) {
                AbstractC14355 abstractC14355M21431 = C9268.m21431(abstractC14357);
                enumC19998 = EnumC19998.f60805;
                if (!abstractC14355M21431.m16617(enumC19998)) {
                    AbstractC14355 abstractC14355M21432 = C9268.m21431(abstractC14357);
                    enumC19999 = EnumC19998.f60745;
                    if (!abstractC14355M21432.m16617(enumC19999)) {
                        break;
                    }
                }
                while (C9268.m21431(abstractC14357).m16617(EnumC19998.f60805)) {
                    abstractC14358 = abstractC14357;
                    abstractC14357 = ((C8320) C9268.m21431(abstractC14357)).f22261;
                }
                while (C9268.m21431(abstractC14357).m16617(EnumC19998.f60745)) {
                    abstractC14358 = abstractC14357;
                    abstractC14357 = ((C17985) C9268.m21431(abstractC14357)).f53722;
                }
            }
            c18537.f55352 = ((C19049) c4848.f11034).f18924;
            C19720 c19720M42180 = c18537.m42180(abstractC14357, c4848);
            if (C9268.m21431(abstractC14358).m16617(enumC19999)) {
                ((C17985) C9268.m21431(abstractC14358)).f53722 = c19720M42180;
            } else if (C9268.m21431(abstractC14358).m16617(enumC19998)) {
                ((C8320) C9268.m21431(abstractC14358)).f22261 = c19720M42180;
            } else {
                abstractC14356 = c19720M42180;
            }
        }
        if (c25084 == null) {
            return abstractC14356;
        }
        c25084.f80025 = abstractC14356;
        m36109(abstractC14355, iMo8719);
        return abstractC14355;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC12224 m36091(boolean z) {
        C23311 c23311 = this.f46086;
        EnumC21300 enumC21300 = c23311.f73357;
        int i = c23311.f73358;
        EnumC21300 enumC21301 = EnumC21300.f67050;
        if (enumC21300 == enumC21301) {
            AbstractC12224 abstractC12224Mo5508 = c23311.mo5508();
            m36145();
            return abstractC12224Mo5508;
        }
        EnumC21300 enumC21302 = EnumC21300.f67032;
        C8200 c8200 = this.f46073;
        C23623 c23623 = this.f46072;
        if (enumC21300 == enumC21302) {
            c23623.m9358(EnumC21417.SYNTAX, i, C8300.f22014);
            m36145();
            return c8200.f21713;
        }
        if (enumC21300 == EnumC21300.f67026) {
            c23623.m9358(EnumC21417.SYNTAX, i, C8300.f22118);
            m36145();
            return c8200.f21713;
        }
        if (enumC21300 == EnumC21300.f67021) {
            if (this.f46099) {
                m36111(EnumC12477.f34967);
                AbstractC12224 abstractC12224Mo5509 = this.f46086.mo5508();
                m36145();
                return abstractC12224Mo5509;
            }
            c23623.m9358(EnumC21417.SYNTAX, i, C8300.f22024);
            m36145();
            return c8200.f21713;
        }
        if (enumC21300 == EnumC21300.f67075) {
            if (EnumC12477.f34963.m28726(this.f46076)) {
                c23623.m9347(this.f46086.f73358, C15675.f45434);
            } else {
                c23623.m9358(EnumC21417.SYNTAX, this.f46086.f73358, C8300.f22127);
            }
            AbstractC12224 abstractC12224Mo55010 = this.f46086.mo5508();
            m36145();
            return abstractC12224Mo55010;
        }
        m36112(enumC21301);
        if (z && this.f46086.f73357 == EnumC21300.f67046) {
            m36145();
            return c8200.f21752;
        }
        return c8200.f21713;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC14355 m36158(boolean z) {
        int i = this.f46086.f73358;
        C18537 c18537 = this.f46074;
        c18537.f55352 = i;
        C9661 c9661M42194 = c18537.m42194(m36091(false));
        AbstractC13884 abstractC13884 = this.f46082;
        AbstractC14355 abstractC14355 = (AbstractC14355) abstractC13884.mo31589(c9661M42194);
        while (true) {
            C23311 c23311 = this.f46086;
            if (c23311.f73357 != EnumC21300.f67043) {
                return abstractC14355;
            }
            int i2 = c23311.f73358;
            m36145();
            C4848 c4848M36082 = z ? m36082(EnumC19998.f60707) : null;
            c18537.f55352 = i2;
            abstractC14355 = (AbstractC14355) abstractC13884.mo31589(c18537.m42155(abstractC14355, m36091(false)));
            if (c4848M36082 != null && c4848M36082.m10293()) {
                c18537.f55352 = ((C19049) c4848M36082.f11034).f18924;
                abstractC14355 = (AbstractC14355) abstractC13884.mo31589(c18537.m42180(abstractC14355, c4848M36082));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x022b  */
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14355 m36096(AbstractC12224 abstractC12224, int i) {
        char c;
        long j;
        AbstractC14355 abstractC14355M42187;
        int i2;
        int i3;
        Float fValueOf;
        Double dValueOf;
        int i4 = C14554.f41514[this.f46086.f73357.ordinal()];
        C23623 c23623 = this.f46072;
        C18537 c18537 = this.f46074;
        C5638 c5638 = this.f46075;
        switch (i4) {
            case 52:
                try {
                    c18537.f55352 = i;
                    EnumC11353 enumC11353 = EnumC11353.INT;
                    String strM36077 = m36077(abstractC12224);
                    int iMo23180 = this.f46086.mo23180();
                    if (iMo23180 == 10) {
                        i2 = Integer.parseInt(strM36077, iMo23180);
                    } else {
                        int i5 = Integer.MAX_VALUE / (iMo23180 / 2);
                        int i6 = 0;
                        for (char c2 : strM36077.toCharArray()) {
                            int iDigit = Character.digit(c2, iMo23180);
                            if (i6 < 0 || i6 > i5 || (i3 = i6 * iMo23180) > Integer.MAX_VALUE - iDigit) {
                                throw new NumberFormatException();
                            }
                            i6 = i3 + iDigit;
                        }
                        i2 = i6;
                    }
                    abstractC14355M42187 = c18537.m42187(enumC11353, Integer.valueOf(i2));
                } catch (NumberFormatException unused) {
                    EnumC21417 enumC21417 = EnumC21417.SYNTAX;
                    int i7 = this.f46086.f73358;
                    String strM36078 = m36077(abstractC12224);
                    C14040 c14040 = C8300.f21997;
                    c23623.m9358(enumC21417, i7, new C14040("compiler", "int.number.too.large", strM36078));
                    abstractC14355M42187 = c5638;
                }
                if (abstractC14355M42187 == c5638) {
                    c18537.f55352 = i;
                    abstractC14355M42187 = c18537.m42191();
                }
                m36109(abstractC14355M42187, this.f46086.f73356);
                m36145();
                return abstractC14355M42187;
            case 53:
                try {
                    c18537.f55352 = i;
                    EnumC11353 enumC11354 = EnumC11353.LONG;
                    String strM36079 = m36077(abstractC12224);
                    int iMo23181 = this.f46086.mo23180();
                    if (iMo23181 == 10) {
                        j = Long.parseLong(strM36079, iMo23181);
                    } else {
                        char[] charArray = strM36079.toCharArray();
                        long j2 = C14849.FOREVER_NS / ((long) (iMo23181 / 2));
                        int length = charArray.length;
                        int i8 = 0;
                        long j3 = 0;
                        while (i8 < length) {
                            int iDigit2 = Character.digit(charArray[i8], iMo23181);
                            if (j3 >= 0 && j3 <= j2) {
                                char[] cArr = charArray;
                                int i9 = length;
                                long j4 = j3 * ((long) iMo23181);
                                long j5 = iDigit2;
                                if (j4 <= C14849.FOREVER_NS - j5) {
                                    j3 = j4 + j5;
                                    i8++;
                                    charArray = cArr;
                                    length = i9;
                                }
                            }
                            throw new NumberFormatException();
                        }
                        j = j3;
                    }
                    c = 0;
                    try {
                        abstractC14355M42187 = c18537.m42187(enumC11354, Long.valueOf(j));
                    } catch (NumberFormatException unused2) {
                        EnumC21417 enumC21418 = EnumC21417.SYNTAX;
                        int i10 = this.f46086.f73358;
                        String strM360710 = m36077(abstractC12224);
                        C14040 c14041 = C8300.f21997;
                        Object[] objArr = new Object[1];
                        objArr[c] = strM360710;
                        c23623.m9358(enumC21418, i10, new C14040("compiler", "int.number.too.large", objArr));
                        abstractC14355M42187 = c5638;
                    }
                    break;
                } catch (NumberFormatException unused3) {
                    c = 0;
                }
                if (abstractC14355M42187 == c5638) {
                    c18537.f55352 = i;
                    abstractC14355M42187 = c18537.m42191();
                }
                m36109(abstractC14355M42187, this.f46086.f73356);
                m36145();
                return abstractC14355M42187;
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                String strMo37618 = this.f46086.mo23180() == 16 ? "0x" + this.f46086.mo37618() : this.f46086.mo37618();
                try {
                    fValueOf = Float.valueOf(strMo37618);
                    break;
                } catch (NumberFormatException unused4) {
                    fValueOf = Float.valueOf(Float.NaN);
                }
                if (fValueOf.floatValue() != 0.0f || m36063(strMo37618)) {
                    if (fValueOf.floatValue() == Float.POSITIVE_INFINITY) {
                        c23623.m9358(EnumC21417.SYNTAX, this.f46086.f73358, C8300.f22101);
                    } else {
                        c18537.f55352 = i;
                        abstractC14355M42187 = c18537.m42187(EnumC11353.FLOAT, fValueOf);
                    }
                    if (abstractC14355M42187 == c5638) {
                        c18537.f55352 = i;
                        abstractC14355M42187 = c18537.m42191();
                    }
                    m36109(abstractC14355M42187, this.f46086.f73356);
                    m36145();
                    return abstractC14355M42187;
                }
                c23623.m9358(EnumC21417.SYNTAX, this.f46086.f73358, C8300.f22153);
                abstractC14355M42187 = c5638;
                if (abstractC14355M42187 == c5638) {
                    c18537.f55352 = i;
                    abstractC14355M42187 = c18537.m42191();
                }
                m36109(abstractC14355M42187, this.f46086.f73356);
                m36145();
                return abstractC14355M42187;
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                String strMo37619 = this.f46086.mo23180() == 16 ? "0x" + this.f46086.mo37618() : this.f46086.mo37618();
                try {
                    dValueOf = Double.valueOf(strMo37619);
                    break;
                } catch (NumberFormatException unused5) {
                    dValueOf = Double.valueOf(Double.NaN);
                }
                if (dValueOf.doubleValue() != 0.0d || m36063(strMo37619)) {
                    if (dValueOf.doubleValue() == Double.POSITIVE_INFINITY) {
                        c23623.m9358(EnumC21417.SYNTAX, this.f46086.f73358, C8300.f22101);
                    } else {
                        c18537.f55352 = i;
                        abstractC14355M42187 = c18537.m42187(EnumC11353.DOUBLE, dValueOf);
                    }
                    if (abstractC14355M42187 == c5638) {
                        c18537.f55352 = i;
                        abstractC14355M42187 = c18537.m42191();
                    }
                    m36109(abstractC14355M42187, this.f46086.f73356);
                    m36145();
                    return abstractC14355M42187;
                }
                c23623.m9358(EnumC21417.SYNTAX, this.f46086.f73358, C8300.f22153);
                abstractC14355M42187 = c5638;
                if (abstractC14355M42187 == c5638) {
                    c18537.f55352 = i;
                    abstractC14355M42187 = c18537.m42191();
                }
                m36109(abstractC14355M42187, this.f46086.f73356);
                m36145();
                return abstractC14355M42187;
            case 56:
                c18537.f55352 = i;
                abstractC14355M42187 = c18537.m42187(EnumC11353.CHAR, Integer.valueOf(this.f46086.mo37618().charAt(0)));
                if (abstractC14355M42187 == c5638) {
                    c18537.f55352 = i;
                    abstractC14355M42187 = c18537.m42191();
                }
                m36109(abstractC14355M42187, this.f46086.f73356);
                m36145();
                return abstractC14355M42187;
            case 57:
                c18537.f55352 = i;
                abstractC14355M42187 = c18537.m42187(EnumC11353.CLASS, this.f46086.mo37618());
                if (abstractC14355M42187 == c5638) {
                    c18537.f55352 = i;
                    abstractC14355M42187 = c18537.m42191();
                }
                m36109(abstractC14355M42187, this.f46086.f73356);
                m36145();
                return abstractC14355M42187;
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                c18537.f55352 = i;
                abstractC14355M42187 = c18537.m42187(EnumC11353.BOOLEAN, Integer.valueOf(this.f46086.f73357 != EnumC21300.f67063 ? 0 : 1));
                if (abstractC14355M42187 == c5638) {
                    c18537.f55352 = i;
                    abstractC14355M42187 = c18537.m42191();
                }
                m36109(abstractC14355M42187, this.f46086.f73356);
                m36145();
                return abstractC14355M42187;
            case 60:
                c18537.f55352 = i;
                abstractC14355M42187 = c18537.m42187(EnumC11353.BOT, (Object) null);
                if (abstractC14355M42187 == c5638) {
                    c18537.f55352 = i;
                    abstractC14355M42187 = c18537.m42191();
                }
                m36109(abstractC14355M42187, this.f46086.f73356);
                m36145();
                return abstractC14355M42187;
            default:
                C1446.m31698();
                throw null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m36063(String str) {
        char c;
        char[] charArray = str.toCharArray();
        int i = (charArray.length <= 1 || Character.toLowerCase(charArray[1]) != 'x') ? 10 : 16;
        int i2 = i == 16 ? 2 : 0;
        while (i2 < charArray.length && ((c = charArray[i2]) == '0' || c == '.')) {
            i2++;
        }
        return i2 >= charArray.length || Character.digit(charArray[i2], i) <= 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m36077(AbstractC12224 abstractC12224) {
        String strMo37618 = this.f46086.mo37618();
        if (abstractC12224.isEmpty()) {
            return strMo37618;
        }
        return ((Object) abstractC12224) + strMo37618;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC23212 m36103(int i, C4436 c4436, AbstractC14355 abstractC14355, boolean z) {
        AbstractC23212 abstractC23212;
        C23311 c23311 = this.f46086;
        EnumC21300 enumC21300 = c23311.f73357;
        EnumC21300 enumC21301 = EnumC21300.f67108;
        AbstractC13884 abstractC13884 = this.f46082;
        C18537 c18537 = this.f46074;
        if (enumC21300 == enumC21301 && abstractC14355 == null) {
            int i2 = c23311.f73358;
            m36112(enumC21301);
            AbstractC23212 abstractC23212M36103 = m36103(this.f46086.f73358, (C4436) null, (AbstractC14355) null, false);
            m36112(EnumC21300.f67051);
            c18537.f55352 = i2;
            C22542 c22542 = new C22542();
            c22542.f71103 = abstractC23212M36103;
            c22542.f18924 = c18537.f55352;
            abstractC23212 = (AbstractC23212) abstractC13884.mo31589(c22542);
        } else {
            if (c4436 == null) {
                c4436 = m36078(0L);
            }
            if (abstractC14355 == null) {
                abstractC14355 = m36147(34);
            }
            c18537.f55352 = this.f46086.f73358;
            C11281 c11281 = (C11281) abstractC13884.mo31589(c18537.m42163(c4436, m36091(false), abstractC14355, (AbstractC14355) null));
            c18537.f55352 = i;
            C17707 c17707 = new C17707();
            c17707.f52887 = c11281;
            c17707.f18924 = c18537.f55352;
            abstractC23212 = (AbstractC23212) abstractC13884.mo31589(c17707);
        }
        if (z || this.f46086.f73357 != EnumC21300.f67068) {
            return abstractC23212;
        }
        m36111(EnumC12477.f34960);
        m36145();
        AbstractC14355 abstractC14355M36147 = m36147(33);
        c18537.f55352 = i;
        C15695 c15695 = new C15695();
        c15695.f45487 = abstractC23212;
        c15695.f45486 = abstractC14355M36147;
        c15695.f18924 = c18537.f55352;
        return c15695;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC14355 m36167(boolean z) {
        AbstractC14355 abstractC14355M36147 = m36147(2);
        AbstractC12224 abstractC12224M36090 = m36090(abstractC14355M36147, !z);
        if (abstractC12224M36090 != null && (!z || abstractC12224M36090 != this.f46073.f21746)) {
            int i = abstractC14355M36147.f18924;
            C14040 c14040 = C8300.f21997;
            m36130(i, new C14040("compiler", "restricted.type.not.allowed.here", abstractC12224M36090));
        }
        return abstractC14355M36147;
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC14355 m36147(int i) {
        int i2 = this.f46079;
        this.f46079 = i;
        AbstractC14355 abstractC14355M36125 = m36125();
        this.f46094 = this.f46079;
        this.f46079 = i2;
        return abstractC14355M36125;
    }

    /* JADX INFO: renamed from: ۠ */
    public final AbstractC14355 m36125() {
        AbstractC14355 abstractC14355M36144 = m36144();
        if ((this.f46079 & 1) == 0) {
            return abstractC14355M36144;
        }
        EnumC21300 enumC21300 = this.f46086.f73357;
        return (enumC21300 == EnumC21300.f67069 || (EnumC21300.f67013.compareTo(enumC21300) <= 0 && this.f46086.f73357.compareTo(EnumC21300.f67105) <= 0)) ? m36143(abstractC14355M36144) : abstractC14355M36144;
    }

    /* JADX INFO: renamed from: ܳ */
    public final AbstractC14355 m36143(AbstractC14355 abstractC14355) {
        int i = C14554.f41514[this.f46086.f73357.ordinal()];
        C18537 c18537 = this.f46074;
        switch (i) {
            case 61:
                int i2 = this.f46086.f73358;
                m36145();
                m36075();
                AbstractC14355 abstractC14355M36125 = m36125();
                c18537.f55352 = i2;
                return (AbstractC14355) this.f46082.mo31589(c18537.m42184(abstractC14355, abstractC14355M36125));
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
                C23311 c23311 = this.f46086;
                int i3 = c23311.f73358;
                EnumC21300 enumC21300 = c23311.f73357;
                m36145();
                m36075();
                AbstractC14355 abstractC14355M36126 = m36125();
                c18537.f55352 = i3;
                return c18537.m42167(m36071(enumC21300), (AbstractC7257) abstractC14355, (AbstractC7257) abstractC14355M36126);
            default:
                return abstractC14355;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC14355 m36156(AbstractC14355 abstractC14355) {
        C23311 c23311 = this.f46086;
        if (c23311.f73357 != EnumC21300.f67078) {
            return abstractC14355;
        }
        int i = c23311.f73358;
        m36145();
        AbstractC14355 abstractC14355M36125 = m36125();
        m36112(EnumC21300.f67015);
        AbstractC14355 abstractC14355M36144 = m36144();
        C18537 c18537 = this.f46074;
        c18537.f55352 = i;
        return c18537.m42159(abstractC14355, abstractC14355M36125, abstractC14355M36144);
    }

    /* JADX INFO: renamed from: ܶ */
    public final AbstractC14355 m36144() {
        AbstractC14355 abstractC14355M36163 = m36163();
        if ((this.f46079 & 1) != 0 && m36072(this.f46086.f73357) >= 4) {
            m36075();
            abstractC14355M36163 = m36153(abstractC14355M36163);
        }
        if ((this.f46079 & 1) == 0 || this.f46086.f73357 != EnumC21300.f67078) {
            return abstractC14355M36163;
        }
        m36075();
        return m36156(abstractC14355M36163);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m36117(C20271 c20271, C20271 c20272) {
        if (c20271.isEmpty()) {
            return false;
        }
        if (c20271.size() == 1) {
            c20272.m45781((AbstractC14355) c20271.first());
            return false;
        }
        C24552 c24552 = (C24552) c20271.first();
        c24552.getClass();
        int iM21421 = C9268.m21421(c24552);
        C18537 c18537 = this.f46074;
        c18537.f55352 = iM21421;
        C24552 c24552M42187 = c18537.m42187(EnumC11353.CLASS, C7480.stream(c20271).map(new C9891(6)).collect(C24205.joining()));
        C24552 c24553 = (C24552) c20271.last();
        c24553.getClass();
        m36109(c24552M42187, C9268.m21397(c24553, this.f46082));
        c20272.m45781(c24552M42187);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    /* JADX INFO: renamed from: ֫ */
    private boolean m36064(AbstractC14355 abstractC14355, C20271 c20271, C20271 c20272, boolean z) {
        C24552 c24552;
        if (abstractC14355.m16617(EnumC19998.f60804)) {
            c24552 = (C24552) abstractC14355;
            if (c24552.f77743 != EnumC11353.CLASS) {
                c24552 = null;
            }
        } else {
            c24552 = null;
        }
        if (c24552 != null) {
            c20271.m45781(c24552);
            return z && m36117(c20271, c20272);
        }
        boolean zM36117 = m36117(c20271, c20272);
        c20271.clear();
        c20272.m45781(abstractC14355);
        return zM36117;
    }

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC14355 m36153(AbstractC14355 abstractC14355) {
        C18537 c18537;
        AbstractC23212 abstractC23212M36103;
        AbstractC23212 abstractC23212M36062;
        ArrayList arrayList = this.f46081;
        boolean z = true;
        AbstractC14355[] abstractC14355Arr = arrayList.isEmpty() ? new AbstractC14355[11] : (AbstractC14355[]) C6406.m14670(arrayList, 1);
        ArrayList arrayList2 = this.f46088;
        C23311[] c23311Arr = arrayList2.isEmpty() ? new C23311[11] : (C23311[]) C6406.m14670(arrayList2, 1);
        boolean z2 = false;
        abstractC14355Arr[0] = abstractC14355;
        int i = this.f46086.f73358;
        C23311 c23311 = C6547.f16897;
        int i2 = 0;
        while (true) {
            int iM36072 = m36072(this.f46086.f73357);
            c18537 = this.f46074;
            if (iM36072 < 4) {
                break;
            }
            c23311Arr[i2] = c23311;
            C23311 c23312 = this.f46086;
            if (c23312.f73357 == EnumC21300.f67023) {
                int i3 = c23312.f73358;
                m36145();
                C23311 c23313 = this.f46086;
                EnumC21300 enumC21300 = c23313.f73357;
                int i4 = c23313.f73358;
                if (enumC21300 == EnumC21300.f67108) {
                    m36105(i4, EnumC12477.f34960);
                    abstractC23212M36103 = m36103(this.f46086.f73358, (C4436) null, (AbstractC14355) null, z);
                } else {
                    C4436 c4436M36078 = m36078(0L);
                    int i5 = this.f46086.f73358;
                    AbstractC14355 abstractC14355M36167 = m36167(z2);
                    C23311 c23314 = this.f46086;
                    if (c23314.f73357 == EnumC21300.f67050) {
                        m36105(c23314.f73358, EnumC12477.f34961);
                        abstractC23212M36103 = m36103(i4, c4436M36078, abstractC14355M36167, true);
                    } else {
                        long j = c4436M36078.f9954 & (-131073);
                        if (j != 0) {
                            long j2 = (-j) & j;
                            EnumC21417 enumC21417 = EnumC21417.SYNTAX;
                            EnumSet enumSetM47446 = C21036.m47446(j2);
                            C14040 c14040 = C8300.f21997;
                            this.f46072.m9358(enumC21417, i5, new C14040("compiler", "mod.not.allowed.here", enumSetM47446));
                        }
                        abstractC23212M36062 = abstractC14355M36167;
                        if (c4436M36078.f9953.m10293()) {
                            m36105(((C19049) c4436M36078.f9953.f11034).f18924, EnumC12477.f34967);
                            abstractC23212M36062 = m36062(abstractC14355M36167, c4436M36078.f9953.m10287(new Function() { // from class: l.ۗۖ۠
                                @Override // java.util.function.Function
                                /* JADX INFO: renamed from: andThen */
                                public /* synthetic */ Function mo56417andThen(Function function) {
                                    return C22038.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public /* synthetic */ Function compose(Function function) {
                                    return C22038.$default$compose(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    C19049 c19049 = (C19049) obj;
                                    C15933 c15933 = this.f12145;
                                    C18537 c18538 = c15933.f46074;
                                    c18538.f55352 = c19049.f18924;
                                    C19049 c19049M42209 = c18538.m42209(c19049.f56840, c19049.f56843);
                                    c15933.f46082.mo8720(c19049, c19049M42209);
                                    return c19049M42209;
                                }
                            }), false);
                        }
                    }
                    c18537.f55352 = i3;
                    AbstractC14355 abstractC14356 = abstractC14355Arr[i2];
                    C17846 c17846 = new C17846();
                    c17846.f53242 = abstractC14356;
                    c17846.f53243 = abstractC23212M36062;
                    c17846.f18924 = c18537.f55352;
                    abstractC14355Arr[i2] = c17846;
                    c23311 = c23311;
                }
                arrayList = arrayList;
                abstractC14355Arr = abstractC14355Arr;
                abstractC23212M36062 = abstractC23212M36103;
                c23311 = c23311;
                c18537.f55352 = i3;
                AbstractC14355 abstractC14357 = abstractC14355Arr[i2];
                C17846 c17847 = new C17846();
                c17847.f53242 = abstractC14357;
                c17847.f53243 = abstractC23212M36062;
                c17847.f18924 = c18537.f55352;
                abstractC14355Arr[i2] = c17847;
                c23311 = c23311;
            } else {
                arrayList = arrayList;
                abstractC14355Arr = abstractC14355Arr;
                m36145();
                i2++;
                abstractC14355Arr[i2] = m36163();
                c23311 = c23312;
            }
            while (i2 > 0 && m36072(c23311.f73357) >= m36072(this.f46086.f73357)) {
                int i6 = i2 - 1;
                c18537.f55352 = c23311.f73358;
                abstractC14355Arr[i6] = c18537.m42162(m36071(c23311.f73357), abstractC14355Arr[i6], abstractC14355Arr[i2]);
                i2--;
                c23311 = c23311Arr[i2];
            }
            z = true;
            z2 = false;
            arrayList = arrayList;
            abstractC14355Arr = abstractC14355Arr;
        }
        ArrayList arrayList3 = arrayList;
        AbstractC14355[] abstractC14355Arr2 = abstractC14355Arr;
        C1446.m31704(i2 == 0);
        AbstractC14355 abstractC14358 = abstractC14355Arr2[0];
        if (abstractC14358.m16617(EnumC19998.f60769) && this.f46087) {
            C20271 c20271 = new C20271();
            C20271 c20272 = new C20271();
            boolean zM36064 = false;
            AbstractC14355 abstractC14359 = abstractC14358;
            while (abstractC14359.m16617(EnumC19998.f60769)) {
                C11003 c11003 = (C11003) abstractC14359;
                zM36064 |= m36064(c11003.f30469, c20272, c20271, false);
                abstractC14359 = c11003.f30470;
            }
            if (m36064(abstractC14359, c20272, c20271, true) | zM36064) {
                C4848 c4848M45783 = c20271.m45783();
                AbstractC14355 abstractC14355M42162 = (AbstractC14355) c4848M45783.f11034;
                for (AbstractC14355 abstractC143510 : c4848M45783.f11035) {
                    abstractC143510.getClass();
                    c18537.f55352 = C9268.m21421(abstractC143510);
                    abstractC14355M42162 = c18537.m42162(m36071(EnumC21300.f67041), abstractC14355M42162, abstractC143510);
                    m36109(abstractC14355M42162, this.f46082.mo8719(abstractC143510));
                }
                abstractC14358 = abstractC14355M42162;
            }
        }
        arrayList3.add(abstractC14355Arr2);
        arrayList2.add(c23311Arr);
        return abstractC14358;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:462:0x0976 A[PHI: r4
      0x0976: PHI (r4v9 int) = (r4v8 int), (r4v8 int), (r4v8 int), (r4v8 int), (r4v8 int), (r4v8 int), (r4v11 int), (r4v8 int) binds: [B:411:0x0894, B:413:0x0898, B:415:0x089c, B:417:0x08a0, B:419:0x08a4, B:420:0x08a6, B:425:0x08b3, B:421:0x08a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:465:0x0982  */
    /* JADX WARN: Code duplicated, block: B:489:0x017a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:490:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:491:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0136 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0138  */
    /* JADX WARN: Code duplicated, block: B:64:0x015a  */
    /* JADX WARN: Code duplicated, block: B:74:0x018d  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:90:0x0207 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0209  */
    /* JADX WARN: Code duplicated, block: B:93:0x020f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0238  */
    /* JADX WARN: Failed to find 'out' block for switch in B:420:0x08a6. Please report as an issue. */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0184 -> B:55:0x0127). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: ᩸ */
    public final p067l.AbstractC14355 m36163() {
        /*
            Method dump skipped, instruction units count: 2850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C15933.m36163():l.۫᩵۠");
    }

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC14355 m36157(AbstractC14355 abstractC14355, C4848 c4848) {
        C18537 c18537;
        AbstractC13884 abstractC13884;
        EnumC21300 enumC21300;
        if (c4848 != null) {
            m36127();
        }
        while (true) {
            int i = this.f46086.f73358;
            EnumC19998 enumC19998 = EnumC19998.f60707;
            C4848 c4848M36082 = m36082(enumC19998);
            EnumC21300 enumC21301 = this.f46086.f73357;
            EnumC21300 enumC21302 = EnumC21300.f67009;
            c18537 = this.f46074;
            abstractC13884 = this.f46082;
            if (enumC21301 == enumC21302) {
                m36145();
                int i2 = this.f46079;
                if ((i2 & 2) != 0) {
                    m36123();
                    if (this.f46086.f73357 == EnumC21300.f67038) {
                        m36145();
                        AbstractC14355 abstractC14355M36067 = m36067(abstractC14355);
                        c18537.f55352 = i;
                        abstractC14355 = (AbstractC14355) abstractC13884.mo31589(c18537.m42212(abstractC14355M36067));
                        if (this.f46086.f73357 != EnumC21300.f67082) {
                            if (!c4848M36082.m10293()) {
                                return abstractC14355;
                            }
                            c18537.f55352 = i;
                            return (AbstractC14355) abstractC13884.mo31589(c18537.m42180(abstractC14355, c4848M36082));
                        }
                        m36075();
                    } else {
                        this.f46079 = i2;
                    }
                }
                if ((this.f46079 & 1) != 0) {
                    m36075();
                    AbstractC14355 abstractC14355M36125 = m36125();
                    c18537.f55352 = i;
                    abstractC14355 = (AbstractC14355) abstractC13884.mo31588(c18537.m42199(abstractC14355, abstractC14355M36125));
                }
                m36112(EnumC21300.f67038);
            } else if (enumC21301 == EnumC21300.f67043) {
                m36145();
                C4848 c4848M36155 = m36155(1);
                EnumC21300 enumC21303 = this.f46086.f73357;
                if (enumC21303 == EnumC21300.f67112 && (this.f46079 & 1) != 0) {
                    m36075();
                    c18537.f55352 = i;
                    AbstractC14355 abstractC14356 = (AbstractC14355) abstractC13884.mo31588(c18537.m42155(abstractC14355, this.f46073.f21756));
                    m36145();
                    abstractC14355 = m36098(abstractC14356, c4848M36155);
                } else if (enumC21303 != EnumC21300.f67054 || (this.f46079 & 1) == 0) {
                    C4848 c4848M36083 = ((this.f46079 & 2) == 0 || enumC21303 != EnumC21300.f67070) ? null : m36082(enumC19998);
                    c18537.f55352 = i;
                    abstractC14355 = (AbstractC14355) abstractC13884.mo31589(c18537.m42155(abstractC14355, m36091(true)));
                    C23311 c23311 = this.f46086;
                    if (c23311.f73358 <= abstractC13884.f39206 && c23311.f73357 == EnumC21300.f67070) {
                        break;
                    }
                    if (c4848M36083 != null && c4848M36083.m10293()) {
                        c18537.f55352 = ((C19049) c4848M36083.f11034).f18924;
                        abstractC14355 = (AbstractC14355) abstractC13884.mo31589(c18537.m42180(abstractC14355, c4848M36083));
                    }
                    abstractC14355 = m36135(m36166(abstractC14355), c4848M36155);
                } else {
                    if (c4848M36155 != null) {
                        return m36127();
                    }
                    m36075();
                    int i3 = this.f46086.f73358;
                    m36145();
                    if (this.f46086.f73357 == EnumC21300.f67111) {
                        c4848M36155 = m36141(false);
                    }
                    abstractC14355 = m36101(i3, abstractC14355, c4848M36155);
                }
                c4848 = null;
            } else {
                if ((this.f46079 & 1) == 0 || enumC21301 != (enumC21300 = EnumC21300.f67082)) {
                    if (c4848M36082.isEmpty()) {
                        break;
                    }
                    if (!this.f46098) {
                        return m36084(((C19049) c4848M36082.f11034).f18924);
                    }
                    this.f46085 = c4848M36082;
                    break;
                }
                m36075();
                if (c4848 != null) {
                    return m36127();
                }
                m36112(enumC21300);
                abstractC14355 = m36148(abstractC14355);
            }
        }
        while (true) {
            EnumC21300 enumC21304 = this.f46086.f73357;
            EnumC21300 enumC21305 = EnumC21300.f67058;
            if ((enumC21304 != enumC21305 && enumC21304 != EnumC21300.f67109) || (this.f46079 & 1) == 0) {
                break;
            }
            m36075();
            C23311 c23312 = this.f46086;
            c18537.f55352 = c23312.f73358;
            abstractC14355 = (AbstractC14355) abstractC13884.mo31588(c18537.m42156(c23312.f73357 == enumC21305 ? EnumC19998.f60723 : EnumC19998.f60791, abstractC14355));
            m36145();
        }
        return (AbstractC14355) abstractC13884.mo31589(abstractC14355);
    }

    /* JADX INFO: renamed from: ܿ */
    private int m36073(int i) {
        int i2 = i + 1;
        while (m36115(i2, EnumC21300.f67043)) {
            i2 += 2;
        }
        if (m36115(i2, EnumC21300.f67108)) {
            i2++;
            int i3 = 0;
            while (true) {
                int i4 = C14554.f41514[this.f46090.m9588(i2).f73357.ordinal()];
                if (i4 == 6) {
                    break;
                }
                if (i4 == 74) {
                    i3++;
                } else if (i4 == 85 && (i3 = i3 - 1) == 0) {
                    break;
                }
                i2++;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14355 m36095(int i, boolean z, boolean z2) {
        C4848<C11281> c4848M45783;
        C23623 c23623;
        char c;
        AbstractC12224 abstractC12224M36090;
        C14040 c14040;
        C18537 c18537 = this.f46074;
        boolean z3 = false;
        if (z2) {
            c4848M45783 = m36129(true, false);
        } else {
            if (z) {
                m36112(EnumC21300.f67108);
            }
            C20271 c20271 = new C20271();
            C23311 c23311 = this.f46086;
            EnumC21300 enumC21300 = c23311.f73357;
            if (enumC21300 != EnumC21300.f67051 && enumC21300 != EnumC21300.f67052) {
                c18537.f55352 = c23311.f73358;
                c20271.m45777(m36088(c18537.m42142(8589934592L), (AbstractC14355) null, true, false));
                while (this.f46086.f73357 == EnumC21300.f67022) {
                    m36145();
                    c18537.f55352 = this.f46086.f73358;
                    c20271.m45777(m36088(c18537.m42142(8589934592L), (AbstractC14355) null, true, false));
                }
            }
            if (z) {
                m36112(EnumC21300.f67051);
            }
            c4848M45783 = c20271.m45783();
        }
        if (z2) {
            C3864 c3864 = new C3864(this);
            Iterator it = c4848M45783.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c23623 = this.f46072;
                if (!zHasNext) {
                    c = 0;
                    break;
                }
                C11281 c11281 = (C11281) it.next();
                AbstractC14355 abstractC14355 = c11281.f31437;
                if (abstractC14355 == null || (abstractC12224M36090 = m36090(abstractC14355, z3)) == null || !c11281.f31437.m16617(EnumC19998.f60742)) {
                    c = 0;
                } else {
                    EnumC21417 enumC21417 = EnumC21417.SYNTAX;
                    int i2 = c11281.f18924;
                    c = 0;
                    if (EnumC12477.f34956.m28726(this.f46076)) {
                        C14040 c14041 = C8300.f21997;
                        c14040 = new C14040("compiler", "restricted.type.not.allowed.array", abstractC12224M36090);
                    } else {
                        C14040 c14042 = C8300.f21997;
                        c14040 = new C14040("compiler", "restricted.type.not.allowed.here", abstractC12224M36090);
                    }
                    c23623.m9358(enumC21417, i2, c14040);
                }
                c3864.m7620(c11281);
                if (c3864.f8359 == EnumC12582.ERROR) {
                    break;
                }
                z3 = false;
            }
            C13370 c13370 = c3864.f8358;
            if (c13370 != null) {
                EnumC21417 enumC21418 = EnumC21417.SYNTAX;
                C14040 c14043 = C8300.f21997;
                Object[] objArr = new Object[1];
                objArr[c] = c13370;
                c23623.m9358(enumC21418, i, new C14040("compiler", "invalid.lambda.parameter.declaration", objArr));
            }
            for (C11281 c11282 : c4848M45783) {
                AbstractC14355 abstractC14356 = c11282.f31437;
                if (abstractC14356 != null && m36090(abstractC14356, true) != null) {
                    m36105(c11282.f18924, EnumC12477.f34956);
                    c11282.f31434 = C9268.m21421(c11282.f31437);
                    c11282.f31437 = null;
                }
            }
        }
        m36111(EnumC12477.f34975);
        m36112(EnumC21300.f67052);
        C23311 c23312 = this.f46086;
        EnumC21300 enumC21301 = c23312.f73357;
        EnumC21300 enumC21302 = EnumC21300.f67030;
        AbstractC13884 abstractC13884 = this.f46082;
        if (enumC21301 == enumC21302) {
            C4968 c4968M36083 = m36083(c23312.f73358, 0L);
            c18537.f55352 = i;
            return (AbstractC14355) abstractC13884.mo31589(c18537.m42198(c4968M36083, c4848M45783));
        }
        AbstractC14355 abstractC14355M36147 = m36147(1);
        c18537.f55352 = i;
        return (AbstractC14355) abstractC13884.mo31589(c18537.m42198((AbstractC7257) abstractC14355M36147, c4848M45783));
    }

    static {
        C13370 c13370 = C13665.f38477;
        C13370 c13371 = C13665.f38474;
        C13370 c13372 = C13665.f38476;
        f46071 = new C13370[][]{new C13370[]{null, c13370, c13371}, new C13370[]{c13370, null, c13372}, new C13370[]{c13371, c13372, null}};
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC14355 m36149(AbstractC14355 abstractC14355, C4848 c4848) {
        m36145();
        C23311 c23311 = this.f46086;
        EnumC21300 enumC21300 = c23311.f73357;
        if (enumC21300 == EnumC21300.f67108 || c4848 != null) {
            return m36098(abstractC14355, c4848);
        }
        EnumC21300 enumC21301 = EnumC21300.f67082;
        if (enumC21300 == enumC21301) {
            if (c4848 != null) {
                return m36127();
            }
            m36112(enumC21301);
            return m36148(abstractC14355);
        }
        int i = c23311.f73358;
        m36112(EnumC21300.f67043);
        C4848 c4848M36141 = this.f46086.f73357 == EnumC21300.f67111 ? m36141(false) : null;
        C18537 c18537 = this.f46074;
        c18537.f55352 = i;
        return m36135((AbstractC14355) this.f46082.mo31589(c18537.m42155(abstractC14355, m36091(false))), c4848M36141);
    }

    /* JADX INFO: renamed from: ܿ */
    public final C5107 m36152() {
        EnumC11353 enumC11353;
        C23311 c23311 = this.f46086;
        int i = c23311.f73358;
        C18537 c18537 = this.f46074;
        c18537.f55352 = i;
        switch (C14554.f41514[c23311.f73357.ordinal()]) {
            case 22:
                enumC11353 = EnumC11353.BYTE;
                break;
            case 23:
                enumC11353 = EnumC11353.SHORT;
                break;
            case 24:
                enumC11353 = EnumC11353.CHAR;
                break;
            case 25:
                enumC11353 = EnumC11353.INT;
                break;
            case 26:
                enumC11353 = EnumC11353.LONG;
                break;
            case 27:
                enumC11353 = EnumC11353.FLOAT;
                break;
            case 28:
                enumC11353 = EnumC11353.DOUBLE;
                break;
            case 29:
                enumC11353 = EnumC11353.BOOLEAN;
                break;
            default:
                enumC11353 = EnumC11353.NONE;
                break;
        }
        C5107 c5107 = (C5107) this.f46082.mo31588(c18537.m42146(enumC11353));
        m36145();
        return c5107;
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC14355 m36135(AbstractC14355 abstractC14355, C4848 c4848) {
        if (((this.f46079 & 1) == 0 || this.f46086.f73357 != EnumC21300.f67108) && c4848 == null) {
            return abstractC14355;
        }
        m36075();
        return m36098(abstractC14355, c4848);
    }

    /* JADX INFO: renamed from: ܽ */
    public final C4848 m36146() {
        C20271 c20271 = new C20271();
        C23311 c23311 = this.f46086;
        EnumC21300 enumC21300 = c23311.f73357;
        EnumC21300 enumC21301 = EnumC21300.f67108;
        if (enumC21300 == enumC21301) {
            m36145();
            if (this.f46086.f73357 != EnumC21300.f67051) {
                c20271.m45777(m36147(1));
                while (this.f46086.f73357 == EnumC21300.f67022) {
                    m36145();
                    c20271.m45777(m36147(1));
                }
            }
            m36112(EnumC21300.f67051);
        } else {
            m36130(c23311.f73358, C8300.m19126(enumC21301));
        }
        return c20271.m45783();
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14355 m36098(AbstractC14355 abstractC14355, C4848 c4848) {
        int i = this.f46086.f73358;
        C4848 c4848M36146 = m36146();
        C18537 c18537 = this.f46074;
        c18537.f55352 = i;
        AbstractC7257 abstractC7257M42172 = c18537.m42172(abstractC14355, c4848, c4848M36146);
        if (abstractC14355.m16617(EnumC19998.f60790)) {
            C9661 c9661 = (C9661) abstractC14355;
            int i2 = c9661.f18924;
            if (c9661.f26610 == this.f46073.f21657) {
                boolean z = this.f46080;
                C23623 c23623 = this.f46072;
                if (z) {
                    c23623.m9359(EnumC21417.SYNTAX, abstractC14355, C8300.f22102);
                    abstractC7257M42172 = c18537.m42192(C4848.m10276of((Object) abstractC7257M42172));
                } else {
                    c23623.m9347(i2, C15675.f45435);
                }
            }
        }
        return (AbstractC14355) this.f46082.mo31589(abstractC7257M42172);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC14355 m36166(AbstractC14355 abstractC14355) {
        if (this.f46086.f73357 != EnumC21300.f67111) {
            return abstractC14355;
        }
        int i = this.f46079;
        if ((i & 2) == 0 || (i & 4) != 0) {
            return abstractC14355;
        }
        m36123();
        return m36136(abstractC14355, false);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C4848 m36155(int i) {
        if (this.f46086.f73357 != EnumC21300.f67111) {
            return null;
        }
        int i2 = this.f46079;
        if ((i2 & i) == 0 || (i2 & 4) != 0) {
            m36127();
        }
        this.f46079 = i;
        return m36141(false);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX INFO: renamed from: ܳ */
    public final C4848 m36141(boolean z) {
        EnumC21300 enumC21300;
        C23311 c23311 = this.f46086;
        EnumC21300 enumC21301 = c23311.f73357;
        EnumC21300 enumC21302 = EnumC21300.f67111;
        if (enumC21301 == enumC21302) {
            m36145();
            if (this.f46086.f73357 == EnumC21300.f67092 && z) {
                m36111(EnumC12477.f34965);
                this.f46079 |= 16;
                m36145();
                return C4848.m10283();
            }
            C20271 c20271 = new C20271();
            c20271.m45777((this.f46079 & 1) == 0 ? m36164() : m36150(false));
            while (true) {
                enumC21300 = this.f46086.f73357;
                if (enumC21300 != EnumC21300.f67022) {
                    break;
                }
                m36145();
                c20271.m45777((this.f46079 & 1) == 0 ? m36164() : m36150(false));
            }
            int i = C14554.f41514[enumC21300.ordinal()];
            if (i == 71 || i == 72 || i == 93) {
                this.f46086 = this.f46090.m9590();
            } else {
                switch (i) {
                    case 89:
                    case 90:
                        this.f46086 = this.f46090.m9590();
                        break;
                    case 91:
                        m36145();
                        break;
                    default:
                        c20271.m45777(m36130(this.f46086.f73358, C8300.m19126(EnumC21300.f67092)));
                        break;
                }
            }
            return c20271.m45783();
        }
        return C4848.m10276of((Object) m36130(c23311.f73358, C8300.m19126(enumC21302)));
    }

    /* JADX INFO: renamed from: ۧ */
    public final C17985 m36136(AbstractC14355 abstractC14355, boolean z) {
        int i = this.f46086.f73358;
        C4848 c4848M36141 = m36141(z);
        C18537 c18537 = this.f46074;
        c18537.f55352 = i;
        return (C17985) this.f46082.mo31589(c18537.m42203(abstractC14355, c4848M36141));
    }

    /* JADX INFO: renamed from: ۜ */
    private AbstractC14355 m36067(AbstractC14355 abstractC14355) {
        return m36074(abstractC14355, C4848.m10283());
    }

    /* JADX INFO: renamed from: ۧ */
    private AbstractC14355 m36069(int i, AbstractC14355 abstractC14355, C4848 c4848) {
        m36112(EnumC21300.f67038);
        AbstractC14355 abstractC14355M36067 = m36067(abstractC14355);
        C18537 c18537 = this.f46074;
        c18537.f55352 = i;
        C25084 c25084M42212 = c18537.m42212(abstractC14355M36067);
        AbstractC13884 abstractC13884 = this.f46082;
        AbstractC14355 abstractC14356 = (AbstractC14355) abstractC13884.mo31589(c25084M42212);
        if (!c4848.m10293()) {
            return abstractC14356;
        }
        c18537.f55352 = i;
        return (AbstractC14355) abstractC13884.mo31589(c18537.m42180(abstractC14356, c4848));
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14355 m36097(AbstractC14355 abstractC14355) {
        AbstractC12224 abstractC12224Mo5508;
        int i = this.f46079;
        if ((i & 1) == 0 || this.f46086.f73357 != EnumC21300.f67043) {
            if ((i & 2) != 0) {
                if (this.f46086.f73357 != EnumC21300.f67082) {
                    m36123();
                    return abstractC14355;
                }
            } else {
                C23311 c23311 = this.f46086;
                if (c23311.f73357 != EnumC21300.f67082) {
                    m36130(c23311.f73358, C8300.f22074);
                }
            }
            return abstractC14355;
        }
        m36075();
        int i2 = this.f46086.f73358;
        m36145();
        m36112(EnumC21300.f67046);
        C23311 c23312 = this.f46086;
        int i3 = c23312.f73358;
        AbstractC13884 abstractC13884 = this.f46082;
        int i4 = abstractC13884.f39206;
        C18537 c18537 = this.f46074;
        C8200 c8200 = this.f46073;
        if (i3 == i4) {
            if (this.f46084.test(c23312.f73357)) {
                abstractC12224Mo5508 = this.f46086.mo5508();
                m36145();
            } else {
                abstractC12224Mo5508 = c8200.f21713;
            }
            c18537.f55352 = i2;
            return c18537.m42192(C4848.m10276of((Object) abstractC13884.mo31589(c18537.m42155(abstractC14355, abstractC12224Mo5508))));
        }
        EnumC19998 enumC19998Mo3383 = abstractC14355.mo3383();
        if ((enumC19998Mo3383 == EnumC19998.f60742 && C9268.m21426((AbstractC7257) abstractC14355)) || enumC19998Mo3383 == EnumC19998.f60721) {
            m36130(this.f46086.f73358, C8300.f22149);
        }
        c18537.f55352 = i2;
        return (AbstractC14355) abstractC13884.mo31589(c18537.m42155(abstractC14355, c8200.f21752));
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC14355 m36148(AbstractC14355 abstractC14355) {
        EnumC12909 enumC12909;
        AbstractC12224 abstractC12224M36091;
        m36111(EnumC12477.f34957);
        m36075();
        C4848 c4848M36141 = this.f46086.f73357 == EnumC21300.f67111 ? m36141(false) : null;
        if (this.f46086.f73357 == EnumC21300.f67054) {
            enumC12909 = EnumC12909.NEW;
            abstractC12224M36091 = this.f46073.f21737;
            m36145();
        } else {
            enumC12909 = EnumC12909.INVOKE;
            abstractC12224M36091 = m36091(false);
        }
        abstractC14355.getClass();
        int iM21421 = C9268.m21421(abstractC14355);
        C18537 c18537 = this.f46074;
        c18537.f55352 = iM21421;
        C11142 c11142 = new C11142(enumC12909, abstractC12224M36091, abstractC14355, c4848M36141);
        c11142.f18924 = c18537.f55352;
        return (AbstractC14355) this.f46082.mo31589(c11142);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20530 m36102(int i, AbstractC14355 abstractC14355, C4848 c4848, AbstractC14355 abstractC14356) {
        C7650 c7650;
        C4848 c4848M36146 = m36146();
        C23311 c23311 = this.f46086;
        EnumC21300 enumC21300 = c23311.f73357;
        EnumC21300 enumC21301 = EnumC21300.f67030;
        AbstractC13884 abstractC13884 = this.f46082;
        C18537 c18537 = this.f46074;
        if (enumC21300 == enumC21301) {
            int i2 = c23311.f73358;
            C4848 c4848M36081 = m36081(this.f46073.f21725, false, false);
            c18537.f55352 = -1;
            C4436 c4436M42142 = c18537.m42142(0L);
            c18537.f55352 = i2;
            c7650 = (C7650) abstractC13884.mo31589(c18537.m42150(c4436M42142, c4848M36081));
        } else {
            c7650 = null;
        }
        c18537.f55352 = i;
        return (C20530) abstractC13884.mo31589(c18537.m42182(abstractC14355, c4848, abstractC14356, c4848M36146, c7650, false));
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC14355 m36133(int i, AbstractC14355 abstractC14355) {
        C4848 c4848M36154 = m36154();
        C18537 c18537 = this.f46074;
        c18537.f55352 = i;
        return (AbstractC14355) this.f46082.mo31589(c18537.m42201(abstractC14355, C4848.m10283(), c4848M36154));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C4848 m36154() {
        m36112(EnumC21300.f67030);
        C20271 c20271 = new C20271();
        EnumC21300 enumC21300 = this.f46086.f73357;
        if (enumC21300 == EnumC21300.f67022) {
            m36145();
        } else if (enumC21300 != EnumC21300.f67119) {
            c20271.m45777(m36139());
            while (this.f46086.f73357 == EnumC21300.f67022) {
                m36145();
                if (this.f46086.f73357 == EnumC21300.f67119) {
                    break;
                }
                c20271.m45777(m36139());
            }
        }
        m36112(EnumC21300.f67119);
        return c20271.m45783();
    }

    /* JADX INFO: renamed from: ۫ */
    public final AbstractC14355 m36139() {
        C23311 c23311 = this.f46086;
        return c23311.f73357 == EnumC21300.f67030 ? m36133(c23311.f73358, (AbstractC14355) null) : m36147(1);
    }

    /* JADX INFO: renamed from: ۖ */
    public final AbstractC14355 m36119() {
        int i = this.f46086.f73358;
        m36112(EnumC21300.f67108);
        AbstractC14355 abstractC14355M36147 = m36147(1);
        m36112(EnumC21300.f67051);
        C18537 c18537 = this.f46074;
        c18537.f55352 = i;
        C16505 c16505 = new C16505();
        c16505.f48507 = abstractC14355M36147;
        c16505.f18924 = c18537.f55352;
        return (AbstractC14355) this.f46082.mo31589(c16505);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4968 m36083(int i, long j) {
        m36112(EnumC21300.f67030);
        C4848 c4848M36124 = m36124();
        C18537 c18537 = this.f46074;
        c18537.f55352 = i;
        C4968 c4968M42145 = c18537.m42145(j, c4848M36124);
        while (true) {
            C23311 c23311 = this.f46086;
            EnumC21300 enumC21300 = c23311.f73357;
            int i2 = c23311.f73358;
            if (enumC21300 == EnumC21300.f67117 || enumC21300 == EnumC21300.f67029) {
                C14040 c14040 = C8300.f21997;
                m36130(i2, new C14040("compiler", "orphaned", enumC21300));
                m36076();
            } else {
                c4968M42145.f11315 = i2;
                m36112(EnumC21300.f67119);
                return (C4968) this.f46082.mo31589(c4968M42145);
            }
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final C4968 m36142() {
        return m36083(this.f46086.f73358, 0L);
    }

    /* JADX INFO: renamed from: ۜ */
    public final C4848 m36124() {
        C20271 c20271 = new C20271();
        int i = -1;
        while (true) {
            C4848 c4848M36165 = m36165();
            if (c4848M36165.isEmpty()) {
                return c20271.m45783();
            }
            int i2 = this.f46086.f73358;
            if (i2 == i) {
                return c20271.m45783();
            }
            if (i2 <= this.f46082.f39206) {
                m36114(false, true, true, true);
                i = this.f46086.f73358;
            }
            c20271.addAll(c4848M36165);
        }
    }

    /* JADX INFO: renamed from: ᩴ */
    public final AbstractC13154 m36159() {
        C14040 c14040;
        int i = this.f46086.f73358;
        C4848 c4848M36165 = m36165();
        boolean zIsEmpty = c4848M36165.isEmpty();
        AbstractC13884 abstractC13884 = this.f46082;
        C18537 c18537 = this.f46074;
        if (zIsEmpty) {
            C5638 c5638M36130 = m36130(i, C8300.f21999);
            c18537.f55352 = i;
            return (AbstractC13154) abstractC13884.mo31589(c18537.m42196(c5638M36130));
        }
        AbstractC13154 abstractC13154 = (AbstractC13154) c4848M36165.f11034;
        int i2 = C14554.f41515[abstractC13154.mo3383().ordinal()];
        if (i2 == 3) {
            c14040 = C8300.f22009;
        } else {
            c14040 = i2 != 4 ? null : C8300.f22007;
        }
        if (c14040 == null) {
            return abstractC13154;
        }
        this.f46072.m9359(EnumC21417.SYNTAX, abstractC13154, c14040);
        c18537.f55352 = abstractC13154.f18924;
        C4848 c4848M10276of = C4848.m10276of((Object) c18537.m42145(0L, c4848M36165));
        c18537.f55352 = abstractC13154.f18924;
        return (AbstractC13154) abstractC13884.mo31589(c18537.m42196(c18537.m42192(c4848M10276of)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:192:0x0517  */
    /* JADX WARN: Code duplicated, block: B:196:0x052b  */
    /* JADX WARN: Code duplicated, block: B:198:0x0533  */
    /* JADX WARN: Code duplicated, block: B:203:0x0561  */
    /* JADX WARN: Code duplicated, block: B:206:0x0570  */
    /* JADX WARN: Code duplicated, block: B:207:0x0575  */
    /* JADX WARN: Code duplicated, block: B:74:0x0127  */
    /* JADX WARN: Code duplicated, block: B:76:0x012b A[FALL_THROUGH] */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e8, code lost:
    
        if (r6.m9588(1).f73357 != p067l.EnumC21300.f67048) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f3, code lost:
    
        if (r6.m9588(2).f73357 != p067l.EnumC21300.f67048) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0129, code lost:
    
        if (r7 == p067l.EnumC21300.f67052) goto L76;
     */
    /* JADX INFO: renamed from: ᩻ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C4848 m36165() {
        Object objM36142;
        Object obj;
        AbstractC14355 abstractC14355;
        long j;
        C4848 c4848M45783;
        AbstractC14355 abstractC14355M36147;
        C23311 c23311;
        EnumC21300 enumC21300;
        EnumC21300 enumC21301;
        C4848 c4848M45784;
        C11281 c11281;
        EnumC21300 enumC21302;
        EnumC21300 enumC21303;
        C4968 c4968M36142;
        C23311 c23312 = this.f46086;
        int i = c23312.f73358;
        int[] iArr = C14554.f41514;
        int i2 = iArr[c23312.f73357.ordinal()];
        C19866 c19866 = this.f46084;
        boolean z = false;
        C8200 c8200 = this.f46073;
        AbstractC13884 abstractC13884 = this.f46082;
        C23623 c23623 = this.f46072;
        C18537 c18537 = this.f46074;
        if (i2 != 1 && i2 != 51 && i2 != 11) {
            if (i2 != 12) {
                if (i2 != 19) {
                    if (i2 != 20) {
                        boolean z2 = this.f46092;
                        switch (i2) {
                            case 3:
                            case 5:
                                C23311 c23313 = this.f46086;
                                EnumC2522 enumC2522 = EnumC2522.LINE;
                                InterfaceC7217 interfaceC7217M51914 = c23313.m51914();
                                C4436 c4436M36079 = m36079((C4436) null);
                                EnumC21300 enumC21304 = this.f46086.f73357;
                                return (enumC21304 == EnumC21300.f67098 || enumC21304 == EnumC21300.f67046 || enumC21304 == EnumC21300.f67026 || m36126()) ? C4848.m10276of((Object) m36092(c4436M36079, interfaceC7217M51914)) : m36059(c4436M36079, m36150(true));
                            case 4:
                                break;
                            case 6:
                                break;
                            case 7:
                            case 8:
                                C23311 c23314 = this.f46086;
                                EnumC2522 enumC2523 = EnumC2522.LINE;
                                return C4848.m10276of((Object) m36092(m36079((C4436) null), c23314.m51914()));
                            case 9:
                                if (!z2) {
                                    c23623.m9358(EnumC21417.SYNTAX, this.f46086.f73358, C8300.f22076);
                                }
                                C23311 c23315 = this.f46086;
                                EnumC2522 enumC2524 = EnumC2522.LINE;
                                return C4848.m10276of((Object) m36092(m36079((C4436) null), c23315.m51914()));
                            default:
                                switch (i2) {
                                    case 32:
                                        AbstractC12224 abstractC12224Mo5508 = this.f46086.mo5508();
                                        AbstractC12224 abstractC12224 = c8200.f21657;
                                        C4535 c4535 = this.f46090;
                                        if (abstractC12224Mo5508 == abstractC12224 && this.f46080) {
                                            int i3 = iArr[c4535.m9588(1).f73357.ordinal()];
                                            if (i3 != 1 && i3 != 32 && i3 != 40) {
                                                if (i3 == 74) {
                                                    int i4 = 2;
                                                    int i5 = 1;
                                                    while (true) {
                                                        EnumC21300 enumC21305 = c4535.m9588(i4).f73357;
                                                        if (enumC21305 != EnumC21300.f67019 && i5 != 0) {
                                                            int i6 = C14554.f41514[enumC21305.ordinal()];
                                                            if (i6 == 74) {
                                                                i5++;
                                                            } else if (i6 == 85) {
                                                                i5--;
                                                            } else if (i6 == 88 && i5 == 1) {
                                                                z = true;
                                                            }
                                                            i4++;
                                                        }
                                                    }
                                                    if (!z) {
                                                        if (i4 == 3) {
                                                        }
                                                    }
                                                    break;
                                                } else {
                                                    switch (i3) {
                                                        default:
                                                            switch (i3) {
                                                                default:
                                                                    switch (i3) {
                                                                        case 78:
                                                                        case 79:
                                                                            break;
                                                                        case 80:
                                                                        case 81:
                                                                            break;
                                                                    }
                                                                case 52:
                                                                case 53:
                                                                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                                                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                                                case 56:
                                                                case 57:
                                                                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                                                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                                                case 60:
                                                                    m36145();
                                                                    AbstractC14355 abstractC14355M36148 = m36147(1);
                                                                    m36112(EnumC21300.f67048);
                                                                    c18537.f55352 = i;
                                                                    return C4848.m10276of(abstractC13884.mo31589(c18537.m42202(abstractC14355M36148)));
                                                            }
                                                        case 48:
                                                        case 49:
                                                        case 50:
                                                            m36145();
                                                            AbstractC14355 abstractC14355M36149 = m36147(1);
                                                            m36112(EnumC21300.f67048);
                                                            c18537.f55352 = i;
                                                            return C4848.m10276of(abstractC13884.mo31589(c18537.m42202(abstractC14355M36149)));
                                                    }
                                                }
                                            }
                                            m36145();
                                            AbstractC14355 abstractC14355M361410 = m36147(1);
                                            m36112(EnumC21300.f67048);
                                            c18537.f55352 = i;
                                            return C4848.m10276of(abstractC13884.mo31589(c18537.m42202(abstractC14355M361410)));
                                        }
                                        if (m36118(this.f46086, 0) ? m36065(c4535.m9588(3), true, true) : false) {
                                            c23623.m9348(this.f46086.f73358, C8300.f22110);
                                            m36145();
                                            m36145();
                                            m36145();
                                            C4436 c4436M360710 = m36079((C4436) null);
                                            C23311 c23316 = this.f46086;
                                            EnumC2522 enumC2525 = EnumC2522.LINE;
                                            return C4848.m10276of((Object) m36092(c4436M360710, c23316.m51914()));
                                        }
                                        if (m36138(true)) {
                                            m36111(EnumC12477.f34959);
                                            c23623.m9348(this.f46086.f73358, C8300.f22110);
                                            m36145();
                                            C4436 c4436M360711 = m36079((C4436) null);
                                            C23311 c23317 = this.f46086;
                                            EnumC2522 enumC2526 = EnumC2522.LINE;
                                            return C4848.m10276of((Object) m36092(c4436M360711, c23317.m51914()));
                                        }
                                        break;
                                }
                                if (m36126() && z2) {
                                    C23311 c23318 = this.f46086;
                                    EnumC2522 enumC2527 = EnumC2522.LINE;
                                    InterfaceC7217 interfaceC7217M51915 = c23318.m51914();
                                    c18537.f55352 = i;
                                    return C4848.m10276of((Object) m36131(c18537.m42142(0L), interfaceC7217M51915));
                                }
                                C23311 c23319 = this.f46086;
                                AbstractC14355 abstractC14355M361411 = m36147(3);
                                if (this.f46086.f73357 == EnumC21300.f67015 && abstractC14355M361411.m16617(EnumC19998.f60790)) {
                                    m36145();
                                    AbstractC13154 abstractC13154M36159 = m36159();
                                    c18537.f55352 = i;
                                    AbstractC12224 abstractC12224Mo5509 = c23319.mo5508();
                                    C19188 c19188 = new C19188();
                                    c19188.f57352 = abstractC12224Mo5509;
                                    c19188.f57351 = abstractC13154M36159;
                                    c19188.f18924 = c18537.f55352;
                                    return C4848.m10276of((Object) c19188);
                                }
                                if ((this.f46094 & 2) == 0 || !c19866.test(this.f46086.f73357)) {
                                    AbstractC14355 abstractC14355M36134 = m36134(abstractC14355M361411);
                                    m36112(EnumC21300.f67048);
                                    c18537.f55352 = i;
                                    return C4848.m10276of(abstractC13884.mo31589(c18537.m42196(abstractC14355M36134)));
                                }
                                int i7 = this.f46086.f73358;
                                c18537.f55352 = -1;
                                C4436 c4436M42142 = c18537.m42142(0L);
                                c18537.f55352 = i7;
                                return m36059(c4436M42142, abstractC14355M361411);
                        }
                    }
                    C23311 c233110 = this.f46086;
                    EnumC2522 enumC2528 = EnumC2522.LINE;
                    return C4848.m10276of((Object) m36092(m36079((C4436) null), c233110.m51914()));
                }
            }
            return C4848.m10283();
        }
        C23311 c233111 = this.f46086;
        int i8 = c233111.f73358;
        int i9 = iArr[c233111.f73357.ordinal()];
        if (i9 == 1) {
            m36145();
            c18537.f55352 = i8;
            objM36142 = (AbstractC13154) abstractC13884.mo31589(c18537.m42206());
        } else if (i9 != 11) {
            if (i9 == 19) {
                m36145();
                AbstractC14355 abstractC14355M36119 = m36119();
                C4968 c4968M36143 = m36142();
                c18537.f55352 = i8;
                C9130 c9130 = new C9130();
                c9130.f24711 = abstractC14355M36119;
                c9130.f24710 = c4968M36143;
                c9130.f18924 = c18537.f55352;
                obj = c9130;
            } else if (i9 != 51) {
                switch (i9) {
                    case 35:
                        AbstractC13154 abstractC13154M361510 = null;
                        m36145();
                        AbstractC14355 abstractC14355M361110 = m36119();
                        AbstractC13154 abstractC13154M361511 = m36159();
                        if (this.f46086.f73357 == EnumC21300.f67101) {
                            m36145();
                            abstractC13154M361510 = m36159();
                        }
                        c18537.f55352 = i8;
                        objM36142 = c18537.m42141(abstractC14355M361110, abstractC13154M361511, abstractC13154M361510);
                        break;
                    case 36:
                        m36145();
                        m36112(EnumC21300.f67108);
                        EnumC21300 enumC21306 = this.f46086.f73357;
                        EnumC21300 enumC21307 = EnumC21300.f67048;
                        if (enumC21306 != enumC21307) {
                            C20271 c20271 = new C20271();
                            C23311 c233112 = this.f46086;
                            int i10 = c233112.f73358;
                            EnumC21300 enumC21308 = c233112.f73357;
                            if (enumC21308 != EnumC21300.f67114) {
                                if (enumC21308 == EnumC21300.f67070) {
                                    j = 0;
                                    abstractC14355 = null;
                                } else {
                                    AbstractC14355 abstractC14355M361412 = m36147(3);
                                    if ((this.f46094 & 2) != 0 && c19866.test(this.f46086.f73357)) {
                                        m36104(this.f46086.f73358, m36079((C4436) null), abstractC14355M361412, m36091(false), false, (InterfaceC7217) null, c20271, true);
                                        c4848M45783 = c20271.m45783();
                                    } else if ((this.f46094 & 2) == 0 || this.f46086.f73357 != EnumC21300.f67015) {
                                        abstractC14355M36147 = null;
                                        m36107(i10, abstractC14355M361412, c20271);
                                        c4848M45783 = c20271.m45783();
                                    } else {
                                        EnumC21417 enumC21417 = EnumC21417.SYNTAX;
                                        C14040 c14040 = C8300.f21997;
                                        c23623.m9358(enumC21417, i10, new C14040("compiler", "bad.initializer", "for-loop"));
                                        c18537.f55352 = i10;
                                        abstractC14355M36147 = null;
                                        c4848M45783 = C4848.m10276of((Object) c18537.m42163(m36079((C4436) null), c8200.f21713, abstractC14355M361412, (AbstractC14355) null));
                                    }
                                }
                                if (c4848M45783.m10289() == 1 && ((AbstractC13154) c4848M45783.f11034).m16617(EnumC19998.f60802)) {
                                    c11281 = (C11281) c4848M45783.f11034;
                                    if (c11281.f31436 == null) {
                                        enumC21302 = this.f46086.f73357;
                                        enumC21303 = EnumC21300.f67015;
                                        if (enumC21302 == enumC21303) {
                                            m36112(enumC21303);
                                            AbstractC14355 abstractC14355M361413 = m36147(1);
                                            m36112(EnumC21300.f67051);
                                            AbstractC13154 abstractC13154M361512 = m36159();
                                            c18537.f55352 = i8;
                                            C6979 c6979 = new C6979();
                                            c6979.f18157 = c11281;
                                            c6979.f18158 = abstractC14355M361413;
                                            c6979.f18156 = abstractC13154M361512;
                                            c6979.f18924 = c18537.f55352;
                                            obj = c6979;
                                        }
                                    }
                                }
                                m36112(enumC21307);
                                if (this.f46086.f73357 != enumC21307) {
                                    abstractC14355M36147 = m36147(1);
                                }
                                m36112(enumC21307);
                                c23311 = this.f46086;
                                enumC21300 = c23311.f73357;
                                enumC21301 = EnumC21300.f67051;
                                if (enumC21300 == enumC21301) {
                                    c4848M45784 = C4848.m10283();
                                } else {
                                    int i11 = c23311.f73358;
                                    AbstractC14355 abstractC14355M361414 = m36147(1);
                                    C20271 c20272 = new C20271();
                                    m36107(i11, abstractC14355M361414, c20272);
                                    c4848M45784 = c20272.m45783();
                                }
                                m36112(enumC21301);
                                AbstractC13154 abstractC13154M361513 = m36159();
                                c18537.f55352 = i8;
                                objM36142 = c18537.m42169(c4848M45783, abstractC14355M36147, c4848M45784, abstractC13154M361513);
                            } else {
                                abstractC14355 = null;
                                j = 0;
                            }
                            m36104(this.f46086.f73358, m36078(j), m36150(true), m36091(false), false, (InterfaceC7217) null, c20271, true);
                            c4848M45783 = c20271.m45783();
                            abstractC14355M36147 = abstractC14355;
                            if (c4848M45783.m10289() == 1) {
                                c11281 = (C11281) c4848M45783.f11034;
                                if (c11281.f31436 == null) {
                                    enumC21302 = this.f46086.f73357;
                                    enumC21303 = EnumC21300.f67015;
                                    if (enumC21302 == enumC21303) {
                                        m36112(enumC21303);
                                        AbstractC14355 abstractC14355M361415 = m36147(1);
                                        m36112(EnumC21300.f67051);
                                        AbstractC13154 abstractC13154M361514 = m36159();
                                        c18537.f55352 = i8;
                                        C6979 c69710 = new C6979();
                                        c69710.f18157 = c11281;
                                        c69710.f18158 = abstractC14355M361415;
                                        c69710.f18156 = abstractC13154M361514;
                                        c69710.f18924 = c18537.f55352;
                                        obj = c69710;
                                    }
                                }
                            }
                            m36112(enumC21307);
                            if (this.f46086.f73357 != enumC21307) {
                                abstractC14355M36147 = m36147(1);
                            }
                            m36112(enumC21307);
                            c23311 = this.f46086;
                            enumC21300 = c23311.f73357;
                            enumC21301 = EnumC21300.f67051;
                            if (enumC21300 == enumC21301) {
                                c4848M45784 = C4848.m10283();
                            } else {
                                int i12 = c23311.f73358;
                                AbstractC14355 abstractC14355M361416 = m36147(1);
                                C20271 c20273 = new C20271();
                                m36107(i12, abstractC14355M361416, c20273);
                                c4848M45784 = c20273.m45783();
                            }
                            m36112(enumC21301);
                            AbstractC13154 abstractC13154M361515 = m36159();
                            c18537.f55352 = i8;
                            objM36142 = c18537.m42169(c4848M45783, abstractC14355M36147, c4848M45784, abstractC13154M361515);
                        } else {
                            c4848M45783 = C4848.m10283();
                        }
                        abstractC14355M36147 = null;
                        if (c4848M45783.m10289() == 1) {
                            c11281 = (C11281) c4848M45783.f11034;
                            if (c11281.f31436 == null) {
                                enumC21302 = this.f46086.f73357;
                                enumC21303 = EnumC21300.f67015;
                                if (enumC21302 == enumC21303) {
                                    m36112(enumC21303);
                                    AbstractC14355 abstractC14355M361417 = m36147(1);
                                    m36112(EnumC21300.f67051);
                                    AbstractC13154 abstractC13154M361516 = m36159();
                                    c18537.f55352 = i8;
                                    C6979 c69711 = new C6979();
                                    c69711.f18157 = c11281;
                                    c69711.f18158 = abstractC14355M361417;
                                    c69711.f18156 = abstractC13154M361516;
                                    c69711.f18924 = c18537.f55352;
                                    obj = c69711;
                                }
                            }
                        }
                        m36112(enumC21307);
                        if (this.f46086.f73357 != enumC21307) {
                            abstractC14355M36147 = m36147(1);
                        }
                        m36112(enumC21307);
                        c23311 = this.f46086;
                        enumC21300 = c23311.f73357;
                        enumC21301 = EnumC21300.f67051;
                        if (enumC21300 == enumC21301) {
                            c4848M45784 = C4848.m10283();
                        } else {
                            int i13 = c23311.f73358;
                            AbstractC14355 abstractC14355M361418 = m36147(1);
                            C20271 c20274 = new C20271();
                            m36107(i13, abstractC14355M361418, c20274);
                            c4848M45784 = c20274.m45783();
                        }
                        m36112(enumC21301);
                        AbstractC13154 abstractC13154M361517 = m36159();
                        c18537.f55352 = i8;
                        objM36142 = c18537.m42169(c4848M45783, abstractC14355M36147, c4848M45784, abstractC13154M361517);
                        break;
                    case 37:
                        m36145();
                        AbstractC14355 abstractC14355M361111 = m36119();
                        AbstractC13154 abstractC13154M361518 = m36159();
                        c18537.f55352 = i8;
                        C10610 c10610 = new C10610();
                        c10610.f29370 = abstractC14355M361111;
                        c10610.f29369 = abstractC13154M361518;
                        c10610.f18924 = c18537.f55352;
                        obj = c10610;
                        break;
                    case 38:
                        m36145();
                        AbstractC13154 abstractC13154M361519 = m36159();
                        m36112(EnumC21300.f67059);
                        AbstractC14355 abstractC14355M361112 = m36119();
                        m36112(EnumC21300.f67048);
                        c18537.f55352 = i8;
                        C21732 c21732 = new C21732();
                        c21732.f68446 = abstractC13154M361519;
                        c21732.f68447 = abstractC14355M361112;
                        c21732.f18924 = c18537.f55352;
                        objM36142 = (C21732) abstractC13884.mo31589(c21732);
                        break;
                    case 39:
                        m36145();
                        C4848 c4848M10283 = C4848.m10283();
                        if (this.f46086.f73357 == EnumC21300.f67108) {
                            m36145();
                            C20271 c20275 = new C20271();
                            c20275.m45777(m36160());
                            while (this.f46086.f73357 == EnumC21300.f67048) {
                                m36109((AbstractC7257) c20275.last(), this.f46086.f73356);
                                int i14 = this.f46086.f73358;
                                m36145();
                                if (this.f46086.f73357 == EnumC21300.f67051) {
                                    c4848M10283 = c20275.m45783();
                                    m36112(EnumC21300.f67051);
                                } else {
                                    c20275.m45777(m36160());
                                }
                            }
                            c4848M10283 = c20275.m45783();
                            m36112(EnumC21300.f67051);
                        }
                        C4968 c4968M36144 = m36142();
                        C20271 c20276 = new C20271();
                        EnumC21300 enumC21309 = this.f46086.f73357;
                        if (enumC21309 == EnumC21300.f67036 || enumC21309 == EnumC21300.f67073) {
                            while (true) {
                                EnumC21300 enumC213010 = this.f46086.f73357;
                                if (enumC213010 != EnumC21300.f67036) {
                                    if (enumC213010 == EnumC21300.f67073) {
                                        m36145();
                                        c4968M36142 = m36142();
                                    }
                                    c18537.f55352 = i8;
                                    objM36142 = c18537.m42168(c4848M10283, c4968M36144, c20276.m45783(), c4968M36142);
                                } else {
                                    c20276.m45777(m36162());
                                }
                            }
                        } else if (c4848M10283.isEmpty()) {
                            c23623.m9358(EnumC21417.SYNTAX, i8, C8300.f22034);
                        }
                        c4968M36142 = null;
                        c18537.f55352 = i8;
                        objM36142 = c18537.m42168(c4848M10283, c4968M36144, c20276.m45783(), c4968M36142);
                        break;
                    case 40:
                        m36145();
                        AbstractC14355 abstractC14355M361113 = m36119();
                        m36112(EnumC21300.f67030);
                        C4848 c4848M36076 = m36076();
                        c18537.f55352 = i8;
                        C23882 c23882 = (C23882) abstractC13884.mo31588(c18537.m42215(abstractC14355M361113, c4848M36076));
                        c23882.f75832 = this.f46086.f73356;
                        m36112(EnumC21300.f67119);
                        objM36142 = c23882;
                        break;
                    case 41:
                        m36145();
                        EnumC21300 enumC213011 = this.f46086.f73357;
                        EnumC21300 enumC213012 = EnumC21300.f67048;
                        AbstractC14355 abstractC14355M361419 = enumC213011 == enumC213012 ? null : m36147(1);
                        m36112(enumC213012);
                        c18537.f55352 = i8;
                        objM36142 = (C11813) abstractC13884.mo31589(c18537.m42207(abstractC14355M361419));
                        break;
                    case 42:
                        m36145();
                        AbstractC14355 abstractC14355M361420 = m36147(1);
                        m36112(EnumC21300.f67048);
                        c18537.f55352 = i8;
                        objM36142 = (C3904) abstractC13884.mo31589(c18537.m42214(abstractC14355M361420));
                        break;
                    case 43:
                        m36145();
                        AbstractC12224 abstractC12224M36091 = c19866.test(this.f46086.f73357) ? m36091(false) : null;
                        m36112(EnumC21300.f67048);
                        c18537.f55352 = i8;
                        objM36142 = (C6309) abstractC13884.mo31589(c18537.m42149(abstractC12224M36091));
                        break;
                    case 44:
                        m36145();
                        AbstractC12224 abstractC12224M36092 = c19866.test(this.f46086.f73357) ? m36091(false) : null;
                        m36112(EnumC21300.f67048);
                        c18537.f55352 = i8;
                        C17036 c17036 = new C17036();
                        c17036.f50376 = abstractC12224M36092;
                        c17036.f50377 = null;
                        c17036.f18924 = c18537.f55352;
                        objM36142 = (C17036) abstractC13884.mo31589(c17036);
                        break;
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                        int i15 = this.f46086.f73358;
                        m36145();
                        objM36142 = m36061(i15, EnumC13214.f37109, C8300.f21998);
                        break;
                    case 46:
                        int i16 = this.f46086.f73358;
                        m36145();
                        objM36142 = m36061(i16, EnumC13214.f37109, C8300.f22026);
                        break;
                    case 47:
                        objM36142 = m36061(this.f46086.f73358, EnumC13214.f37107, C8300.f22020);
                        break;
                    default:
                        C1446.m31698();
                        throw null;
                }
            } else {
                AbstractC14355 abstractC14355M361421 = null;
                m36145();
                AbstractC14355 abstractC14355M361422 = m36147(1);
                if (this.f46086.f73357 == EnumC21300.f67015) {
                    m36145();
                    abstractC14355M361421 = m36147(1);
                }
                m36112(EnumC21300.f67048);
                c18537.f55352 = i8;
                C8991 c8991 = new C8991();
                c8991.f24356 = abstractC14355M361422;
                c8991.f24357 = abstractC14355M361421;
                c8991.f18924 = c18537.f55352;
                objM36142 = (C8991) abstractC13884.mo31589(c8991);
            }
            objM36142 = obj;
        } else {
            objM36142 = m36142();
        }
        return C4848.m10276of(objM36142);
    }

    /* JADX INFO: renamed from: ֫ */
    private C4848 m36059(C4436 c4436, AbstractC14355 abstractC14355) {
        C20271 c20271 = new C20271();
        m36104(this.f46086.f73358, c4436, abstractC14355, m36091(false), false, (InterfaceC7217) null, c20271, true);
        m36112(EnumC21300.f67048);
        m36109((AbstractC7257) c20271.last(), this.f46090.m9591().f73356);
        return c20271.m45783();
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC13154 m36061(int i, EnumC13214 enumC13214, C14040 c14040) {
        C4535 c4535 = this.f46090;
        int iM9585 = c4535.m9585();
        AbstractC7257 abstractC7257Mo18143 = enumC13214.mo18143(this);
        c4535.m9586(iM9585);
        return (AbstractC13154) this.f46082.mo31589(this.f46074.m42196(m36085(i, C4848.m10276of((Object) abstractC7257Mo18143), c14040)));
    }

    /* JADX INFO: renamed from: ᩷ */
    public final C2955 m36162() {
        AbstractC14355 abstractC14355;
        int i = this.f46086.f73358;
        m36112(EnumC21300.f67036);
        m36112(EnumC21300.f67108);
        C4436 c4436M36078 = m36078(8589934592L);
        C20271 c20271 = new C20271();
        while (true) {
            c20271.m45777(m36150(false));
            if (this.f46086.f73357 != EnumC21300.f67072) {
                break;
            }
            m36145();
        }
        C4848 c4848M45783 = c20271.m45783();
        int iM10289 = c4848M45783.m10289();
        C18537 c18537 = this.f46074;
        if (iM10289 > 1) {
            AbstractC14355 abstractC14356 = (AbstractC14355) c4848M45783.f11034;
            abstractC14356.getClass();
            c18537.f55352 = C9268.m21421(abstractC14356);
            C24691 c24691 = new C24691();
            c24691.f78164 = c4848M45783;
            c24691.f18924 = c18537.f55352;
            abstractC14355 = (AbstractC14355) this.f46082.mo31589(c24691);
        } else {
            abstractC14355 = (AbstractC14355) c4848M45783.f11034;
        }
        C11281 c11281M36088 = m36088(c4436M36078, abstractC14355, false, false);
        m36112(EnumC21300.f67051);
        C4968 c4968M36142 = m36142();
        c18537.f55352 = i;
        return c18537.m42140(c11281M36088, c4968M36142);
    }

    /* JADX INFO: renamed from: ֨ */
    public final C4848 m36076() {
        EnumC21300 enumC21300;
        EnumC8690 enumC8690;
        C4848 c4848M36124;
        C4848 c4848M45783;
        EnumC8690 enumC8691;
        C4848 c4848M36125;
        C20271 c20271 = new C20271();
        while (true) {
            C23311 c23311 = this.f46086;
            int i = c23311.f73358;
            int[] iArr = C14554.f41514;
            int i2 = iArr[c23311.f73357.ordinal()];
            if (i2 == 6 || i2 == 12) {
                break;
            }
            if (i2 != 33 && i2 != 34) {
                m36145();
                m36130(i, C8300.m19128(EnumC21300.f67117, EnumC21300.f67029, EnumC21300.f67119));
            } else {
                int i3 = this.f46086.f73358;
                C20271 c20272 = new C20271();
                int i4 = iArr[this.f46086.f73357.ordinal()];
                C4535 c4535 = this.f46090;
                C23623 c23623 = this.f46072;
                AbstractC7257 abstractC7257 = null;
                C18537 c18537 = this.f46074;
                if (i4 == 33) {
                    m36145();
                    C20271 c20273 = new C20271();
                    while (true) {
                        c20273.m45777(m36066());
                        enumC21300 = this.f46086.f73357;
                        if (enumC21300 != EnumC21300.f67022) {
                            break;
                        }
                        m36145();
                        m36111(EnumC12477.f34953);
                    }
                    EnumC21300 enumC21301 = EnumC21300.f67052;
                    if (enumC21300 == enumC21301) {
                        m36111(EnumC12477.f34951);
                        m36112(enumC21301);
                        enumC8690 = C20391.f63040;
                        AbstractC13154 abstractC13154M36159 = m36159();
                        if (!abstractC13154M36159.m16617(EnumC19998.f60702) && !abstractC13154M36159.m16617(EnumC19998.f60774) && !abstractC13154M36159.m16617(EnumC19998.f60808)) {
                            c23623.m9352(abstractC13154M36159, C8300.f22050);
                        }
                        c4848M36124 = C4848.m10276of((Object) abstractC13154M36159);
                        abstractC7257 = (AbstractC7257) c4848M36124.f11034;
                    } else {
                        m36113(EnumC21300.f67015, new C7929(10));
                        enumC8690 = C20391.f63041;
                        c4848M36124 = m36124();
                    }
                    c18537.f55352 = i3;
                    C20391 c20391M42181 = c18537.m42181(enumC8690, c20273.m45783(), c4848M36124, abstractC7257);
                    if (c4848M36124.isEmpty()) {
                        m36109(c20391M42181, c4535.m9591().f73356);
                    }
                    c20272.m45777(c20391M42181);
                    c4848M45783 = c20272.m45783();
                } else if (i4 == 34) {
                    m36145();
                    C23311 c23312 = this.f46086;
                    int i5 = c23312.f73358;
                    EnumC21300 enumC21302 = c23312.f73357;
                    EnumC21300 enumC21303 = EnumC21300.f67052;
                    if (enumC21302 == enumC21303) {
                        m36111(EnumC12477.f34951);
                        m36112(enumC21303);
                        enumC8691 = C20391.f63040;
                        AbstractC13154 abstractC13154M361510 = m36159();
                        if (!abstractC13154M361510.m16617(EnumC19998.f60702) && !abstractC13154M361510.m16617(EnumC19998.f60774) && !abstractC13154M361510.m16617(EnumC19998.f60808)) {
                            c23623.m9352(abstractC13154M361510, C8300.f22050);
                        }
                        c4848M36125 = C4848.m10276of((Object) abstractC13154M361510);
                        abstractC7257 = (AbstractC7257) c4848M36125.f11034;
                    } else {
                        m36113(EnumC21300.f67015, new C13026(6));
                        enumC8691 = C20391.f63041;
                        c4848M36125 = m36124();
                    }
                    c18537.f55352 = i5;
                    AbstractC21062 abstractC21062 = (AbstractC21062) this.f46082.mo31589(c18537.m42185());
                    c18537.f55352 = i3;
                    C20391 c20391M42182 = c18537.m42181(enumC8691, C4848.m10276of((Object) abstractC21062), c4848M36125, abstractC7257);
                    if (c4848M36125.isEmpty()) {
                        m36109(c20391M42182, c4535.m9591().f73356);
                    }
                    c20272.m45777(c20391M42182);
                    c4848M45783 = c20272.m45783();
                } else {
                    throw new AssertionError("should not reach here");
                }
                c20271.m45778(c4848M45783);
            }
        }
        return c20271.m45783();
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ce A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: ۛ */
    private AbstractC21062 m36066() {
        C4535 c4535;
        EnumC19287 enumC19287;
        C23311 c23311 = this.f46086;
        int i = c23311.f73358;
        if (c23311.f73357 == EnumC21300.f67029) {
            m36105(i, EnumC12477.f34960);
            m36145();
            C18537 c18537 = this.f46074;
            c18537.f55352 = i;
            return (AbstractC21062) this.f46082.mo31589(c18537.m42185());
        }
        int iM36073 = 0;
        while (true) {
            c4535 = this.f46090;
            if (c4535.m9588(iM36073).f73357 != EnumC21300.f67108) {
                break;
            }
            iM36073++;
        }
        C4436 c4436M36078 = m36078(0L);
        if (c4436M36078.f9954 == 0 && !c4436M36078.f9953.m10293()) {
            int i2 = 0;
            while (true) {
                int i3 = C14554.f41514[c4535.m9588(iM36073).f73357.ordinal()];
                if (i3 != 5) {
                    C19866 c19866 = this.f46084;
                    if (i3 == 9) {
                        if (i2 != 0 && m36115(iM36073, c19866)) {
                            enumC19287 = EnumC19287.PATTERN;
                        }
                    } else if (i3 == 49) {
                        continue;
                    } else if (i3 == 51) {
                        if (i2 != 0) {
                            continue;
                        }
                    } else if (i3 == 73) {
                        EnumC21300 enumC21300 = EnumC21300.f67038;
                        if (m36116(iM36073, enumC21300, c19866)) {
                            enumC19287 = EnumC19287.PATTERN;
                        } else if (m36115(iM36073, enumC21300)) {
                            iM36073++;
                        } else {
                            enumC19287 = EnumC19287.EXPRESSION;
                        }
                    } else if (i3 != 75 && i3 != 77 && i3 != 86) {
                        switch (i3) {
                            case 21:
                                i2++;
                                continue;
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                                if (i2 != 0) {
                                }
                                break;
                            default:
                                switch (i3) {
                                    case 88:
                                        break;
                                    case 89:
                                        i2--;
                                    case 90:
                                        i2--;
                                    case 91:
                                        i2--;
                                        if (i2 != 0) {
                                            if (i2 < 0) {
                                                enumC19287 = EnumC19287.EXPRESSION;
                                            }
                                        } else if (!m36115(iM36073, c19866)) {
                                            enumC19287 = EnumC19287.EXPRESSION;
                                        } else {
                                            enumC19287 = EnumC19287.PATTERN;
                                        }
                                        break;
                                    default:
                                        enumC19287 = EnumC19287.EXPRESSION;
                                        break;
                                }
                                break;
                        }
                    }
                } else {
                    iM36073 = m36073(iM36073);
                }
                iM36073++;
            }
            if (enumC19287 != EnumC19287.PATTERN) {
                return m36147(33);
            }
        }
        m36105(this.f46086.f73358, EnumC12477.f34960);
        return m36103(i, c4436M36078, (AbstractC14355) null, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m36082(EnumC19998 enumC19998) {
        if (this.f46086.f73357 != EnumC21300.f67070) {
            return C4848.m10283();
        }
        C20271 c20271 = new C20271();
        int i = this.f46079;
        while (true) {
            C23311 c23311 = this.f46086;
            if (c23311.f73357 == EnumC21300.f67070) {
                int i2 = c23311.f73358;
                m36145();
                c20271.m45777(m36100(enumC19998, i2));
            } else {
                this.f46094 = this.f46079;
                this.f46079 = i;
                return c20271.m45783();
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private AbstractC14355 m36074(AbstractC14355 abstractC14355, C4848 c4848) {
        C4848 c4848M36082 = m36082(EnumC19998.f60707);
        C23311 c23311 = this.f46086;
        if (c23311.f73357 == EnumC21300.f67009) {
            int i = c23311.f73358;
            m36145();
            abstractC14355 = m36069(i, abstractC14355, c4848M36082);
        } else if (!c4848M36082.isEmpty()) {
            if (this.f46098) {
                this.f46085 = c4848M36082;
            } else {
                return m36084(((C19049) c4848M36082.f11034).f18924);
            }
        }
        if (c4848.isEmpty()) {
            return abstractC14355;
        }
        int i2 = this.f46086.f73358;
        C18537 c18537 = this.f46074;
        c18537.f55352 = i2;
        return (AbstractC14355) this.f46082.mo31589(c18537.m42180(abstractC14355, c4848));
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14355 m36094(int i, AbstractC14355 abstractC14355) {
        C23311 c23311;
        EnumC21300 enumC21300;
        C4848 c4848M36082 = m36082(EnumC19998.f60707);
        m36112(EnumC21300.f67009);
        EnumC21300 enumC21301 = this.f46086.f73357;
        EnumC21300 enumC21302 = EnumC21300.f67038;
        AbstractC13884 abstractC13884 = this.f46082;
        C18537 c18537 = this.f46074;
        if (enumC21301 == enumC21302) {
            m36112(enumC21302);
            AbstractC14355 abstractC14355M36074 = m36074(abstractC14355, c4848M36082);
            if (this.f46086.f73357 != EnumC21300.f67030) {
                c18537.f55352 = i;
                return m36085(this.f46086.f73358, C4848.m10276of(abstractC13884.mo31589(c18537.m42201(abstractC14355M36074, C4848.m10283(), null))), C8300.f22003);
            }
            C19859 c19859 = (C19859) m36133(i, abstractC14355M36074);
            if (c4848M36082.m10293()) {
                C19720 c19720 = (C19720) abstractC14355M36074;
                c19859.f60357 = c19720.f59995;
                c19859.f60358 = c19720.f59996;
            }
            return c19859;
        }
        C20271 c20271 = new C20271();
        C20271 c20272 = new C20271();
        c20272.m45777((Object) c4848M36082);
        c20271.m45777(m36147(1));
        m36112(enumC21302);
        while (true) {
            c23311 = this.f46086;
            enumC21300 = c23311.f73357;
            if (enumC21300 != EnumC21300.f67009 && enumC21300 != EnumC21300.f67070) {
                break;
            }
            C4848 c4848M36083 = m36082(EnumC19998.f60707);
            int i2 = this.f46086.f73358;
            m36145();
            EnumC21300 enumC21303 = this.f46086.f73357;
            EnumC21300 enumC21304 = EnumC21300.f67038;
            if (enumC21303 == enumC21304) {
                abstractC14355 = m36069(i2, abstractC14355, c4848M36083);
            } else {
                c20272.m45777((Object) c4848M36083);
                c20271.m45777(m36147(1));
                m36112(enumC21304);
            }
        }
        int i3 = c23311.f73358;
        C4848 c4848M36154 = enumC21300 == EnumC21300.f67030 ? m36154() : null;
        c18537.f55352 = i;
        C19859 c198510 = (C19859) abstractC13884.mo31589(c18537.m42201(abstractC14355, c20271.m45783(), c4848M36154));
        c198510.f60361 = c20272.m45783();
        return c4848M36154 != null ? m36085(i3, C4848.m10276of((Object) c198510), C8300.f22021) : c198510;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20530 m36101(int i, AbstractC14355 abstractC14355, C4848 c4848) {
        C4848 c4848M36082 = m36082(EnumC19998.f60707);
        int i2 = this.f46086.f73358;
        C18537 c18537 = this.f46074;
        c18537.f55352 = i2;
        C9661 c9661M42194 = c18537.m42194(m36091(false));
        AbstractC13884 abstractC13884 = this.f46082;
        AbstractC14355 abstractC14355M36136 = (AbstractC14355) abstractC13884.mo31589(c9661M42194);
        if (c4848M36082.m10293()) {
            c18537.f55352 = ((C19049) c4848M36082.f11034).f18924;
            abstractC14355M36136 = (AbstractC14355) abstractC13884.mo31589(c18537.m42180(abstractC14355M36136, c4848M36082));
        }
        if (this.f46086.f73357 == EnumC21300.f67111) {
            int i3 = this.f46079;
            abstractC14355M36136 = m36136(abstractC14355M36136, true);
            this.f46079 = i3;
        }
        return m36102(i, abstractC14355, c4848, abstractC14355M36136);
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC14355 m36150(boolean z) {
        C4848 c4848M36082 = m36082(EnumC19998.f60707);
        AbstractC14355 abstractC14355M36167 = m36167(z);
        return c4848M36082.m10293() ? m36062(abstractC14355M36167, c4848M36082, false) : abstractC14355M36167;
    }

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC14355 m36164() {
        AbstractC14355 abstractC14355M42192;
        C4848 c4848M36082 = m36082(EnumC19998.f60707);
        C23311 c23311 = this.f46086;
        if (c23311.f73357 != EnumC21300.f67078) {
            AbstractC14355 abstractC14355M36167 = m36167(false);
            return c4848M36082.m10293() ? m36062(abstractC14355M36167, c4848M36082, false) : abstractC14355M36167;
        }
        int i = c23311.f73358;
        m36145();
        EnumC21300 enumC21300 = this.f46086.f73357;
        EnumC21300 enumC21301 = EnumC21300.f67033;
        AbstractC13884 abstractC13884 = this.f46082;
        C18537 c18537 = this.f46074;
        if (enumC21300 == enumC21301) {
            c18537.f55352 = i;
            C20669 c20669 = (C20669) abstractC13884.mo31588(c18537.m42183(EnumC17268.EXTENDS));
            m36145();
            AbstractC14355 abstractC14355M36150 = m36150(false);
            c18537.f55352 = i;
            abstractC14355M42192 = c18537.m42173(c20669, (AbstractC7257) abstractC14355M36150);
        } else {
            EnumC21300 enumC21302 = EnumC21300.f67112;
            if (enumC21300 == enumC21302) {
                c18537.f55352 = i;
                C20669 c206610 = (C20669) abstractC13884.mo31588(c18537.m42183(EnumC17268.SUPER));
                m36145();
                AbstractC14355 abstractC14355M36151 = m36150(false);
                c18537.f55352 = i;
                abstractC14355M42192 = c18537.m42173(c206610, (AbstractC7257) abstractC14355M36151);
            } else if (this.f46084.test(enumC21300)) {
                c18537.f55352 = -1;
                C20669 c20669M42183 = c18537.m42183(EnumC17268.UNBOUND);
                c18537.f55352 = i;
                AbstractC14355 abstractC14355 = (AbstractC14355) abstractC13884.mo31589(c18537.m42173(c20669M42183, (AbstractC7257) null));
                c18537.f55352 = this.f46086.f73358;
                C9661 c9661 = (C9661) abstractC13884.mo31589(c18537.m42194(m36091(false)));
                c18537.f55352 = i;
                abstractC14355M42192 = c18537.m42192(C4848.m10277of((Object) abstractC14355, (Object) c9661));
                m36108(abstractC14355M42192, C8300.m19128(EnumC21300.f67092, enumC21301, enumC21302));
            } else {
                c18537.f55352 = i;
                C20669 c206611 = (C20669) abstractC13884.mo31589(c18537.m42183(EnumC17268.UNBOUND));
                c18537.f55352 = i;
                abstractC14355M42192 = (AbstractC14355) abstractC13884.mo31589(c18537.m42173(c206611, (AbstractC7257) null));
            }
        }
        if (c4848M36082.isEmpty()) {
            return abstractC14355M42192;
        }
        c18537.f55352 = ((C19049) c4848M36082.f11034).f18924;
        return (AbstractC14355) abstractC13884.mo31589(c18537.m42180(abstractC14355M42192, c4848M36082));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4436 m36078(long j) {
        C4436 c4436M36079 = m36079((C4436) null);
        long j2 = c4436M36079.f9954 & (-131089);
        int i = this.f46086.f73358;
        if (j2 != 0) {
            EnumC21417 enumC21417 = EnumC21417.SYNTAX;
            EnumSet enumSetM47446 = C21036.m47446(j2 & (-j2));
            C14040 c14040 = C8300.f21997;
            this.f46072.m9358(enumC21417, i, new C14040("compiler", "mod.not.allowed.here", enumSetM47446));
        }
        c4436M36079.f9954 = j | c4436M36079.f9954;
        return c4436M36079;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x004f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Code duplicated, block: B:30:0x0067  */
    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x006f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    /* JADX WARN: Code duplicated, block: B:35:0x007d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:55:0x00da  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:65:0x0101  */
    /* JADX WARN: Code duplicated, block: B:68:0x0109  */
    /* JADX WARN: Code duplicated, block: B:71:0x0121  */
    /* JADX WARN: Code duplicated, block: B:79:0x0141  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x013b -> B:80:0x0146). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:47:0x00c4
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: ֫ */
    public final p067l.C4436 m36079(p067l.C4436 r19) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C15933.m36079(l.ۖ֡۠):l.ۖ֡۠");
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19049 m36100(EnumC19998 enumC19998, int i) {
        C4848 c4848M10283;
        C19049 c19049M42209;
        if (enumC19998 == EnumC19998.f60707) {
            m36111(EnumC12477.f34967);
        }
        AbstractC14355 abstractC14355M36158 = m36158(false);
        EnumC21300 enumC21300 = this.f46086.f73357;
        EnumC21300 enumC21301 = EnumC21300.f67108;
        if (enumC21300 != enumC21301) {
            c4848M10283 = C4848.m10283();
        } else {
            m36112(enumC21301);
            C20271 c20271 = new C20271();
            if (this.f46086.f73357 != EnumC21300.f67051) {
                c20271.m45777(m36093());
                while (this.f46086.f73357 == EnumC21300.f67022) {
                    m36145();
                    c20271.m45777(m36093());
                }
            }
            m36112(EnumC21300.f67051);
            c4848M10283 = c20271.m45783();
        }
        EnumC19998 enumC19999 = EnumC19998.f60714;
        C18537 c18537 = this.f46074;
        if (enumC19998 == enumC19999) {
            c18537.f55352 = i;
            c19049M42209 = c18537.m42175((AbstractC7257) abstractC14355M36158, c4848M10283);
        } else if (enumC19998 == EnumC19998.f60707) {
            c18537.f55352 = i;
            c19049M42209 = c18537.m42209((AbstractC7257) abstractC14355M36158, c4848M10283);
        } else {
            throw new AssertionError("Unhandled annotation kind: " + enumC19998);
        }
        m36109(c19049M42209, this.f46090.m9591().f73356);
        return c19049M42209;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14355 m36093() {
        if (this.f46084.test(this.f46086.f73357)) {
            m36075();
            AbstractC14355 abstractC14355M36144 = m36144();
            if (!abstractC14355M36144.m16617(EnumC19998.f60790)) {
                return abstractC14355M36144;
            }
            C23311 c23311 = this.f46086;
            EnumC21300 enumC21300 = c23311.f73357;
            EnumC21300 enumC21301 = EnumC21300.f67069;
            if (enumC21300 != enumC21301) {
                return abstractC14355M36144;
            }
            int i = c23311.f73358;
            m36112(enumC21301);
            AbstractC14355 abstractC14355M36132 = m36132();
            C18537 c18537 = this.f46074;
            c18537.f55352 = i;
            return (AbstractC14355) this.f46082.mo31589(c18537.m42184(abstractC14355M36144, abstractC14355M36132));
        }
        return m36132();
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC14355 m36132() {
        int i = C14554.f41514[this.f46086.f73357.ordinal()];
        if (i == 5) {
            int i2 = this.f46086.f73358;
            m36145();
            return m36100(EnumC19998.f60714, i2);
        }
        if (i == 11) {
            int i3 = this.f46086.f73358;
            m36112(EnumC21300.f67030);
            C20271 c20271 = new C20271();
            EnumC21300 enumC21300 = this.f46086.f73357;
            if (enumC21300 == EnumC21300.f67022) {
                m36145();
            } else if (enumC21300 != EnumC21300.f67119) {
                c20271.m45777(m36132());
                while (this.f46086.f73357 == EnumC21300.f67022) {
                    m36145();
                    if (this.f46086.f73357 == EnumC21300.f67119) {
                        break;
                    }
                    c20271.m45777(m36132());
                }
            }
            m36112(EnumC21300.f67119);
            C18537 c18537 = this.f46074;
            c18537.f55352 = i3;
            return (AbstractC14355) this.f46082.mo31589(c18537.m42201(null, C4848.m10283(), c20271.m45783()));
        }
        m36075();
        return m36144();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36104(int i, C4436 c4436, AbstractC14355 abstractC14355, AbstractC12224 abstractC12224, boolean z, InterfaceC7217 interfaceC7217, C20271 c20271, boolean z2) {
        c20271.m45777(m36087(i, c4436, abstractC14355, abstractC12224, z, interfaceC7217, z2, false));
        while (this.f46086.f73357 == EnumC21300.f67022) {
            m36109((AbstractC7257) c20271.last(), this.f46086.f73356);
            m36145();
            c20271.m45777(m36087(this.f46086.f73358, c4436, abstractC14355, m36091(false), z, interfaceC7217, z2, true));
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
    /* JADX INFO: renamed from: ֫ */
    public final C11281 m36087(int i, C4436 c4436, AbstractC14355 abstractC14355, AbstractC12224 abstractC12224, boolean z, InterfaceC7217 interfaceC7217, boolean z2, boolean z3) {
        AbstractC14355 abstractC14355M36139;
        int iM21421;
        AbstractC14355 abstractC14356;
        boolean z4;
        AbstractC14355 abstractC14355M36067 = m36067(abstractC14355);
        C23311 c23311 = this.f46086;
        EnumC21300 enumC21300 = c23311.f73357;
        EnumC21300 enumC21301 = EnumC21300.f67069;
        if (enumC21300 == enumC21301) {
            m36145();
            abstractC14355M36139 = m36139();
        } else {
            if (z) {
                m36130(c23311.f73358, C8300.m19126(enumC21301));
            }
            abstractC14355M36139 = null;
        }
        AbstractC7257 abstractC7257M21403 = C9268.m21403((AbstractC7257) abstractC14355M36067, true);
        if (abstractC7257M21403.m16617(EnumC19998.f60790)) {
            AbstractC12224 abstractC12225 = ((C9661) abstractC7257M21403).f26610;
            if (m36099(abstractC12225, i, !z3 && z2) == null) {
                iM21421 = -1;
                abstractC14356 = abstractC14355M36067;
                z4 = false;
            } else {
                if (abstractC12225 != this.f46073.f21746) {
                    int i2 = abstractC7257M21403.f18924;
                    C14040 c14040 = C8300.f21997;
                    m36106(i2, new C14040("compiler", "restricted.type.not.allowed.here", abstractC12225));
                } else if (abstractC14355M36067.m16617(EnumC19998.f60742) && !z3) {
                    int i3 = abstractC7257M21403.f18924;
                    C14040 c14041 = C8300.f21997;
                    m36106(i3, new C14040("compiler", "restricted.type.not.allowed.array", abstractC12225));
                } else {
                    if (z3) {
                        int i4 = abstractC7257M21403.f18924;
                        C14040 c14042 = C8300.f21997;
                        m36106(i4, new C14040("compiler", "restricted.type.not.allowed.compound", abstractC12225));
                    }
                    iM21421 = C9268.m21421(c4436);
                    if (iM21421 == -1) {
                        iM21421 = C9268.m21421(abstractC14355M36067);
                    }
                    abstractC14356 = null;
                    z4 = true;
                }
                iM21421 = -1;
                abstractC14356 = abstractC14355M36067;
                z4 = false;
            }
        } else {
            iM21421 = -1;
            abstractC14356 = abstractC14355M36067;
            z4 = false;
        }
        C18537 c18537 = this.f46074;
        c18537.f55352 = i;
        C11281 c11281 = (C11281) this.f46082.mo31589(c18537.m42164(c4436, abstractC12224, abstractC14356, abstractC14355M36139, z4));
        m36110(c11281, interfaceC7217);
        c11281.f31434 = iM21421;
        return c11281;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC12224 m36090(AbstractC14355 abstractC14355, boolean z) {
        int i = C14554.f41515[abstractC14355.mo3383().ordinal()];
        if (i != 5) {
            if (i != 6) {
                return null;
            }
            return m36090(((C25084) abstractC14355).f80025, z);
        }
        C9661 c9661 = (C9661) abstractC14355;
        if (m36099(c9661.f26610, abstractC14355.f18924, z) != null) {
            return c9661.f26610;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC17840 m36099(AbstractC12224 abstractC12224, int i, boolean z) {
        C8200 c8200 = this.f46073;
        AbstractC12224 abstractC12225 = c8200.f21746;
        C23623 c23623 = this.f46072;
        if (abstractC12224 == abstractC12225) {
            if (EnumC12477.f34971.m28726(this.f46076)) {
                return EnumC17840.JDK10;
            }
            if (z) {
                C12895 c12895 = C15675.f45417;
                c23623.m9347(i, new C12895("compiler", "restricted.type.not.allowed", abstractC12224, EnumC17840.JDK10));
            }
        }
        if (abstractC12224 == c8200.f21657) {
            if (this.f46080) {
                return EnumC17840.JDK14;
            }
            if (z) {
                C12895 c12896 = C15675.f45417;
                c23623.m9347(i, new C12895("compiler", "restricted.type.not.allowed", abstractC12224, EnumC17840.JDK14));
            }
        }
        if (abstractC12224 == c8200.f21676) {
            if (this.f46092) {
                return EnumC17840.JDK14;
            }
            if (z) {
                C12895 c12897 = C15675.f45417;
                c23623.m9347(i, new C12895("compiler", "restricted.type.not.allowed.preview", abstractC12224, EnumC17840.JDK14));
            }
        }
        AbstractC12224 abstractC12226 = c8200.f21722;
        boolean z2 = this.f46091;
        if (abstractC12224 == abstractC12226) {
            if (z2) {
                return EnumC17840.JDK15;
            }
            if (z) {
                C12895 c12898 = C15675.f45417;
                c23623.m9347(i, new C12895("compiler", "restricted.type.not.allowed.preview", abstractC12224, EnumC17840.JDK15));
            }
        }
        if (abstractC12224 != c8200.f21730) {
            return null;
        }
        if (z2) {
            return EnumC17840.JDK15;
        }
        if (!z) {
            return null;
        }
        C12895 c12899 = C15675.f45417;
        c23623.m9347(i, new C12895("compiler", "restricted.type.not.allowed.preview", abstractC12224, EnumC17840.JDK15));
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11281 m36088(C4436 c4436, AbstractC14355 abstractC14355, boolean z, boolean z2) {
        AbstractC12224 abstractC12224;
        AbstractC12224 abstractC12224Mo5508;
        C23311 c23311 = this.f46086;
        int i = c23311.f73358;
        EnumC21300 enumC21300 = c23311.f73357;
        AbstractC13884 abstractC13884 = this.f46082;
        C18537 c18537 = this.f46074;
        boolean z3 = false;
        C8200 c8200 = this.f46073;
        C23623 c23623 = this.f46072;
        if (z && enumC21300 == EnumC21300.f67075) {
            c23623.m9348(i, C8300.f22121);
            abstractC12224Mo5508 = this.f46086.mo5508();
            m36145();
        } else if (this.f46099 || !z || this.f46084.test(enumC21300) || c4436.f9954 != 8589934592L || c4436.f9953.m10293()) {
            AbstractC14355 abstractC14355M36158 = m36158(false);
            if (!abstractC14355M36158.m16617(EnumC19998.f60790) || (abstractC12224 = ((C9661) abstractC14355M36158).f26610) == c8200.f21744) {
                if (this.f46099) {
                    if ((17179869184L & c4436.f9954) != 0) {
                        c23623.m9348(this.f46086.f73358, C8300.f22055);
                    }
                    C23311 c23312 = this.f46086;
                    if (c23312.f73357 == EnumC21300.f67009) {
                        c23623.m9348(c23312.f73358, C8300.f22105);
                    }
                    if (abstractC14355M36158.m16617(EnumC19998.f60805) && ((C8320) abstractC14355M36158).f22259 != c8200.f21744) {
                        c23623.m9348(this.f46086.f73358, C8300.f22139);
                    }
                }
                c18537.f55352 = i;
                return (C11281) abstractC13884.mo31589(c18537.m42165(c4436, abstractC14355M36158, abstractC14355));
            }
            abstractC12224Mo5508 = abstractC12224;
        } else {
            abstractC12224Mo5508 = c8200.f21725;
        }
        if ((17179869184L & c4436.f9954) != 0) {
            C23311 c23313 = this.f46086;
            if (c23313.f73357 == EnumC21300.f67009) {
                c23623.m9348(c23313.f73358, C8300.f22061);
            }
        }
        if (z2) {
            C23311 c23314 = this.f46086;
            if (c23314.f73357 == EnumC21300.f67009) {
                c23623.m9348(c23314.f73358, C8300.f22073);
            }
        }
        AbstractC14355 abstractC14355M36067 = m36067(abstractC14355);
        c18537.f55352 = i;
        if (abstractC14355M36067 != null && abstractC14355M36067.m16617(EnumC19998.f60790) && ((C9661) abstractC14355M36067).f26610 == c8200.f21746) {
            z3 = true;
        }
        return (C11281) abstractC13884.mo31589(c18537.m42164(c4436, abstractC12224Mo5508, abstractC14355M36067, null, z3));
    }

    /* JADX INFO: renamed from: ᩵ */
    public final AbstractC7257 m36160() {
        C23311 c23311 = this.f46086;
        int i = c23311.f73358;
        EnumC21300 enumC21300 = c23311.f73357;
        if (enumC21300 == EnumC21300.f67114 || enumC21300 == EnumC21300.f67070) {
            return m36087(this.f46086.f73358, m36078(16L), m36150(true), m36091(false), true, (InterfaceC7217) null, true, false);
        }
        AbstractC14355 abstractC14355M36147 = m36147(3);
        if ((this.f46094 & 2) != 0) {
            if (this.f46084.test(this.f46086.f73357)) {
                C18537 c18537 = this.f46074;
                c18537.f55352 = i;
                return m36087(this.f46086.f73358, (C4436) this.f46082.mo31589(c18537.m42142(16L)), abstractC14355M36147, m36091(false), true, (InterfaceC7217) null, true, false);
            }
        }
        m36111(EnumC12477.f34958);
        if (!abstractC14355M36147.m16617(EnumC19998.f60790) && !abstractC14355M36147.m16617(EnumC19998.f60805)) {
            this.f46072.m9352(abstractC14355M36147, C8300.f22067);
        }
        return abstractC14355M36147;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:132:0x0403  */
    /* JADX WARN: Code duplicated, block: B:138:0x0427  */
    /* JADX WARN: Code duplicated, block: B:141:0x0433  */
    /* JADX WARN: Code duplicated, block: B:144:0x043e  */
    /* JADX WARN: Code duplicated, block: B:145:0x0441  */
    /* JADX WARN: Code duplicated, block: B:52:0x018b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0191  */
    /* JADX WARN: Code duplicated, block: B:56:0x0199  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ea  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۘ */
    public final C3626 m36121() {
        boolean z;
        boolean z2;
        C4535 c4535;
        C23311 c23311;
        boolean z3;
        boolean z4;
        String str;
        String str2;
        InterfaceC7217 interfaceC7217M51914;
        C23623 c23623;
        String str3;
        C23311 c23312;
        String str4;
        AbstractC7257 abstractC7257M36092;
        C23311 c23313;
        EnumC21300 enumC21300;
        EnumC21300 enumC21301;
        EnumC8885 enumC8885;
        EnumC8885 enumC8886;
        C23311 c23314;
        C23623 c23624;
        String str5;
        AbstractC14355 abstractC14355;
        C4436 c4436;
        InterfaceC7217 interfaceC7217;
        C4848 c4848M36151;
        AbstractC7257 abstractC7257;
        EnumC21300 enumC21302;
        boolean z5;
        String str6;
        String str7;
        AbstractC14355 abstractC14356;
        C4436 c4437;
        C23311 c23315 = this.f46086;
        C20271 c20271 = new C20271();
        C4436 c4436M36079 = this.f46086.f73357 == EnumC21300.f67070 ? m36079((C4436) null) : null;
        C23311 c23316 = this.f46086;
        EnumC21300 enumC21303 = c23316.f73357;
        EnumC21300 enumC21304 = EnumC21300.f67062;
        String str8 = "mod.not.allowed.here";
        String str9 = "compiler";
        C23623 c23625 = this.f46072;
        C18537 c18537 = this.f46074;
        AbstractC13884 abstractC13884 = this.f46082;
        if (enumC21303 == enumC21304) {
            int i = c23316.f73358;
            C4848 c4848M10283 = C4848.m10283();
            if (c4436M36079 != null) {
                long j = c4436M36079.f9954 & (-131073);
                int i2 = this.f46086.f73358;
                if (j != 0) {
                    EnumC21417 enumC21417 = EnumC21417.SYNTAX;
                    EnumSet enumSetM47446 = C21036.m47446(j & (-j));
                    C14040 c14040 = C8300.f21997;
                    c23625.m9358(enumC21417, i2, new C14040("compiler", "mod.not.allowed.here", enumSetM47446));
                }
                c4848M10283 = c4436M36079.f9953;
                c4437 = null;
            } else {
                c4437 = c4436M36079;
            }
            m36145();
            AbstractC14355 abstractC14355M36158 = m36158(false);
            m36112(EnumC21300.f67048);
            c18537.f55352 = i;
            C1446.m31699(c4848M10283);
            C1446.m31699(abstractC14355M36158);
            C9800 c9800 = new C9800();
            c9800.f27114 = c4848M10283;
            c9800.f27115 = abstractC14355M36158;
            c9800.f18924 = c18537.f55352;
            AbstractC7257 abstractC7258 = (C9800) abstractC13884.mo31589(c9800);
            EnumC2522 enumC2522 = EnumC2522.LINE;
            m36110(abstractC7258, c23315.m51914());
            c20271.m45777(abstractC7258);
            c4436M36079 = c4437;
            z = true;
            z2 = true;
        } else {
            z = false;
            z2 = false;
        }
        boolean z6 = true;
        boolean z7 = false;
        boolean z8 = true;
        while (true) {
            C23311 c23317 = this.f46086;
            EnumC21300 enumC21305 = c23317.f73357;
            boolean z9 = z;
            EnumC21300 enumC21306 = EnumC21300.f67019;
            C23623 c23626 = c23625;
            c4535 = this.f46090;
            if (enumC21305 != enumC21306) {
                if (c23317.f73358 <= abstractC13884.f39206) {
                    m36114(z6, false, false, false);
                    if (this.f46086.f73357 == enumC21306) {
                    }
                }
                C8200 c8200 = this.f46073;
                if (z6 && c4436M36079 == null) {
                    C23311 c23318 = this.f46086;
                    z4 = z6;
                    if (c23318.f73357 == EnumC21300.f67016) {
                        int i3 = c23318.f73358;
                        m36145();
                        if (this.f46086.f73357 == EnumC21300.f67007) {
                            m36145();
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        c18537.f55352 = this.f46086.f73358;
                        AbstractC14355 abstractC14357 = (AbstractC14355) abstractC13884.mo31589(c18537.m42194(m36091(false)));
                        while (true) {
                            int i4 = this.f46086.f73358;
                            EnumC21300 enumC21307 = EnumC21300.f67043;
                            m36112(enumC21307);
                            str6 = str8;
                            str7 = str9;
                            if (this.f46086.f73357 == EnumC21300.f67096) {
                                c18537.f55352 = i4;
                                abstractC14356 = (AbstractC14355) abstractC13884.mo31588(c18537.m42155(abstractC14357, c8200.f21693));
                                m36145();
                                break;
                            }
                            c18537.f55352 = i4;
                            abstractC14357 = (AbstractC14355) abstractC13884.mo31589(c18537.m42155(abstractC14357, m36091(false)));
                            if (this.f46086.f73357 != enumC21307) {
                                abstractC14356 = abstractC14357;
                                break;
                            }
                            str8 = str6;
                            str9 = str7;
                        }
                        m36112(EnumC21300.f67048);
                        c18537.f55352 = i3;
                        C12483 c12483 = new C12483();
                        c12483.f34992 = abstractC14356;
                        c12483.f34991 = z5;
                        c12483.f18924 = c18537.f55352;
                        c20271.m45777(abstractC13884.mo31589(c12483));
                        z7 = true;
                        z = z9;
                        c23625 = c23626;
                        z6 = z4;
                        str8 = str6;
                        str9 = str7;
                    } else {
                        str = str8;
                        str2 = str9;
                        C23311 c23319 = this.f46086;
                        EnumC2522 enumC2523 = EnumC2522.LINE;
                        interfaceC7217M51914 = c23319.m51914();
                        if (z8) {
                            interfaceC7217M51914 = c23315.m51914();
                            z9 = true;
                        }
                        if (c4436M36079 == null) {
                            c4436M36079 = m36079(c4436M36079);
                        } else {
                            c4436M36079 = m36079(c4436M36079);
                        }
                        if (z8) {
                            c23313 = this.f46086;
                            enumC21300 = c23313.f73357;
                            enumC21301 = EnumC21300.f67050;
                            if (enumC21300 == enumC21301) {
                                enumC8885 = EnumC8885.STRONG;
                                if (c23313.mo5508() == c8200.f21649) {
                                    enumC8886 = EnumC8885.OPEN;
                                    m36145();
                                } else {
                                    enumC8886 = enumC8885;
                                }
                                c23314 = this.f46086;
                                if (c23314.f73357 != enumC21301) {
                                }
                                c23623 = c23626;
                                str3 = str2;
                                c23312 = c23315;
                                str4 = str;
                                if (enumC8886 != enumC8885) {
                                    m36106(this.f46086.f73358, C8300.f22015);
                                }
                            } else {
                                c23623 = c23626;
                                str3 = str2;
                                c23312 = c23315;
                                str4 = str;
                            }
                        } else {
                            c23623 = c23626;
                            str3 = str2;
                            c23312 = c23315;
                            str4 = str;
                        }
                        C23311 c233110 = this.f46086;
                        int i5 = c233110.f73358;
                        if (c4436M36079 == null) {
                            abstractC7257M36092 = m36092(m36079(c4436M36079), interfaceC7217M51914);
                        } else {
                            abstractC7257M36092 = m36092(m36079(c4436M36079), interfaceC7217M51914);
                        }
                        if (abstractC7257M36092 instanceof C12344) {
                            abstractC7257M36092 = ((C12344) abstractC7257M36092).f34446;
                        }
                        c20271.m45777(abstractC7257M36092);
                        if (abstractC7257M36092 instanceof C7650) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                        c4436M36079 = null;
                        str8 = str4;
                        str9 = str3;
                        c23625 = c23623;
                        z = z9;
                        c23315 = c23312;
                        z8 = false;
                    }
                } else {
                    z4 = z6;
                    str = str8;
                    str2 = str9;
                    C23311 c233111 = this.f46086;
                    EnumC2522 enumC2524 = EnumC2522.LINE;
                    interfaceC7217M51914 = c233111.m51914();
                    if (z8 && !z7 && !z2) {
                        interfaceC7217M51914 = c23315.m51914();
                        z9 = true;
                    }
                    if (c4436M36079 == null || this.f46086.f73357 != EnumC21300.f67048) {
                        c4436M36079 = m36079(c4436M36079);
                    }
                    if (z8) {
                        c23313 = this.f46086;
                        enumC21300 = c23313.f73357;
                        enumC21301 = EnumC21300.f67050;
                        if (enumC21300 == enumC21301) {
                            enumC8885 = EnumC8885.STRONG;
                            if (c23313.mo5508() == c8200.f21649) {
                                enumC8886 = EnumC8885.OPEN;
                                m36145();
                            } else {
                                enumC8886 = enumC8885;
                            }
                            c23314 = this.f46086;
                            if (c23314.f73357 != enumC21301 && c23314.mo5508() == c8200.f21672) {
                                if (c4436M36079 != null) {
                                    long j2 = c4436M36079.f9954 & (-131073);
                                    int i6 = this.f46086.f73358;
                                    if (j2 != 0) {
                                        EnumC21417 enumC21418 = EnumC21417.SYNTAX;
                                        EnumSet enumSetM47447 = C21036.m47446((-j2) & j2);
                                        C14040 c14041 = C8300.f21997;
                                        str5 = str2;
                                        c23624 = c23626;
                                        c23624.m9358(enumC21418, i6, new C14040(str5, str, enumSetM47447));
                                    } else {
                                        c23624 = c23626;
                                        str5 = str2;
                                    }
                                } else {
                                    c23624 = c23626;
                                    str5 = str2;
                                }
                                int i7 = this.f46086.f73358;
                                m36111(EnumC12477.f34980);
                                m36145();
                                AbstractC14355 abstractC14355M36159 = m36158(false);
                                m36112(EnumC21300.f67030);
                                C20271 c20272 = new C20271();
                                while (true) {
                                    C23311 c233112 = this.f46086;
                                    EnumC21300 enumC21308 = c233112.f73357;
                                    c23311 = c23315;
                                    EnumC21300 enumC21309 = EnumC21300.f67050;
                                    if (enumC21308 != enumC21309) {
                                        abstractC14355 = abstractC14355M36159;
                                        c4436 = c4436M36079;
                                        interfaceC7217 = interfaceC7217M51914;
                                        break;
                                    }
                                    int i8 = c233112.f73358;
                                    AbstractC12224 abstractC12224Mo5508 = c233112.mo5508();
                                    interfaceC7217 = interfaceC7217M51914;
                                    AbstractC12224 abstractC12224 = c8200.f21687;
                                    abstractC14355 = abstractC14355M36159;
                                    AbstractC12224 abstractC12225 = c8200.f21665;
                                    c4436 = c4436M36079;
                                    AbstractC12224 abstractC12226 = c8200.f21675;
                                    if (abstractC12224Mo5508 != abstractC12224) {
                                        if (this.f46086.mo5508() != abstractC12226 && this.f46086.mo5508() != c8200.f21698) {
                                            if (this.f46086.mo5508() != c8200.f21765) {
                                                if (this.f46086.mo5508() != c8200.f21683) {
                                                    m36137(i8);
                                                    m36106(i8, C8300.f22048);
                                                    break;
                                                }
                                                m36145();
                                                AbstractC14355 abstractC14355M361510 = m36158(false);
                                                m36112(EnumC21300.f67048);
                                                c18537.f55352 = i8;
                                                C22010 c22010 = new C22010();
                                                c22010.f69239 = abstractC14355M361510;
                                                c22010.f18924 = c18537.f55352;
                                                c20272.m45777((AbstractC23743) abstractC13884.mo31589(c22010));
                                            } else {
                                                m36145();
                                                AbstractC14355 abstractC14355M361511 = m36158(false);
                                                C23311 c233113 = this.f46086;
                                                if (c233113.f73357 == enumC21309 && c233113.mo5508() == abstractC12225) {
                                                    m36145();
                                                    C4848 c4848M36152 = m36151(false);
                                                    m36112(EnumC21300.f67048);
                                                    c18537.f55352 = i8;
                                                    C14494 c14494 = new C14494();
                                                    c14494.f41389 = abstractC14355M361511;
                                                    c14494.f41388 = c4848M36152;
                                                    c14494.f18924 = c18537.f55352;
                                                    c20272.m45777((AbstractC23743) abstractC13884.mo31589(c14494));
                                                } else {
                                                    C14040 c14042 = C8300.f21997;
                                                    c23624.m9358(EnumC21417.SYNTAX, this.f46086.f73358, new C14040(str5, "expected.str", "'" + ((Object) abstractC12225) + "'"));
                                                    m36114(false, false, false, false);
                                                }
                                            }
                                        } else {
                                            boolean z10 = this.f46086.mo5508() == abstractC12226;
                                            m36145();
                                            AbstractC14355 abstractC14355M361512 = m36158(false);
                                            C23311 c233114 = this.f46086;
                                            if (c233114.f73357 == enumC21309 && c233114.mo5508() == c8200.f21742) {
                                                m36145();
                                                c4848M36151 = m36151(false);
                                            } else {
                                                c4848M36151 = null;
                                            }
                                            m36112(EnumC21300.f67048);
                                            if (z10) {
                                                c18537.f55352 = i8;
                                                C15025 c15025 = new C15025();
                                                c15025.f42932 = abstractC14355M361512;
                                                c15025.f42933 = c4848M36151;
                                                c15025.f18924 = c18537.f55352;
                                                abstractC7257 = c15025;
                                            } else {
                                                c18537.f55352 = i8;
                                                C2423 c2423 = new C2423();
                                                c2423.f3722 = abstractC14355M361512;
                                                c2423.f3723 = c4848M36151;
                                                c2423.f18924 = c18537.f55352;
                                                abstractC7257 = c2423;
                                            }
                                            c20272.m45777((AbstractC23743) abstractC13884.mo31589(abstractC7257));
                                        }
                                    } else {
                                        m36145();
                                        boolean z11 = false;
                                        boolean z12 = false;
                                        while (true) {
                                            int i9 = C14554.f41514[this.f46086.f73357.ordinal()];
                                            if (i9 == 15) {
                                                if (z11) {
                                                    c23624.m9358(EnumC21417.SYNTAX, this.f46086.f73358, C8300.f22172);
                                                }
                                                z11 = true;
                                            } else {
                                                if (i9 != 32 || this.f46086.mo5508() != c8200.f21669 || z12 || (enumC21302 = c4535.m9588(1).f73357) == EnumC21300.f67048 || enumC21302 == EnumC21300.f67043) {
                                                    break;
                                                }
                                                z12 = true;
                                            }
                                            m36145();
                                        }
                                        AbstractC14355 abstractC14355M361513 = m36158(false);
                                        m36112(EnumC21300.f67048);
                                        c18537.f55352 = i8;
                                        C13824 c13824 = new C13824();
                                        c13824.f39064 = z12;
                                        c13824.f39065 = z11;
                                        c13824.f39063 = abstractC14355M361513;
                                        c13824.f18924 = c18537.f55352;
                                        c20272.m45777((AbstractC23743) abstractC13884.mo31589(c13824));
                                    }
                                    abstractC14355M36159 = abstractC14355;
                                    c23315 = c23311;
                                    interfaceC7217M51914 = interfaceC7217;
                                    c4436M36079 = c4436;
                                }
                                z3 = true;
                                C4848 c4848M45783 = c20272.m45783();
                                m36112(EnumC21300.f67119);
                                m36112(EnumC21300.f67019);
                                c18537.f55352 = i7;
                                AbstractC7257 abstractC7259 = (C5777) abstractC13884.mo31589(c18537.m42147(c4436, enumC8886, abstractC14355, c4848M45783));
                                m36110(abstractC7259, interfaceC7217);
                                c20271 = c20271;
                                c20271.m45777(abstractC7259);
                                break;
                            }
                            c23623 = c23626;
                            str3 = str2;
                            c23312 = c23315;
                            str4 = str;
                            if (enumC8886 != enumC8885) {
                                m36106(this.f46086.f73358, C8300.f22015);
                            }
                        } else {
                            c23623 = c23626;
                            str3 = str2;
                            c23312 = c23315;
                            str4 = str;
                        }
                    } else {
                        c23623 = c23626;
                        str3 = str2;
                        c23312 = c23315;
                        str4 = str;
                    }
                    C23311 c233115 = this.f46086;
                    int i10 = c233115.f73358;
                    if (c4436M36079 == null || c233115.f73357 != EnumC21300.f67048) {
                        abstractC7257M36092 = m36092(m36079(c4436M36079), interfaceC7217M51914);
                    } else {
                        m36145();
                        c18537.f55352 = i10;
                        abstractC7257M36092 = abstractC13884.mo31589(c18537.m42206());
                    }
                    if (abstractC7257M36092 instanceof C12344) {
                        abstractC7257M36092 = ((C12344) abstractC7257M36092).f34446;
                    }
                    c20271.m45777(abstractC7257M36092);
                    if (abstractC7257M36092 instanceof C7650) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    c4436M36079 = null;
                    str8 = str4;
                    str9 = str3;
                    c23625 = c23623;
                    z = z9;
                    c23315 = c23312;
                    z8 = false;
                }
            }
            c23311 = c23315;
            z3 = z9;
            break;
        }
        C23311 c233116 = c23311;
        c18537.f55352 = c233116.f73358;
        C3626 c3626M42213 = c18537.m42213(c20271.m45783());
        if (!z3) {
            EnumC2522 enumC2525 = EnumC2522.LINE;
            m36110(c3626M42213, c233116.m51914());
        }
        if (c20271.isEmpty()) {
            m36109(c3626M42213, c4535.m9591().f73356);
        }
        if (this.f46077) {
            c3626M42213.f7515 = this.f46083;
        }
        if (this.f46093) {
            c3626M42213.f7512 = c4535.m9587();
        }
        abstractC13884.f39207 = null;
        c3626M42213.f7514 = abstractC13884;
        return c3626M42213;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0117  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ac  */
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC13154 m36092(C4436 c4436, InterfaceC7217 interfaceC7217) {
        C4848 c4848M10276of;
        C5638 c5638M36085;
        boolean z;
        boolean z2;
        boolean z3;
        C4848 c4848;
        EnumC21300 enumC21300;
        boolean z4;
        int i;
        EnumC15224 enumC15224;
        C20271 c20271;
        C4535 c4535;
        boolean z5;
        C8200 c8200;
        C7650 c7650;
        AbstractC14355 abstractC14355M36150;
        C23311 c23311 = this.f46086;
        EnumC21300 enumC21301 = c23311.f73357;
        EnumC21300 enumC21302 = EnumC21300.f67046;
        AbstractC13884 abstractC13884 = this.f46082;
        C18537 c18537 = this.f46074;
        if (enumC21301 == enumC21302) {
            int i2 = c23311.f73358;
            m36112(enumC21302);
            AbstractC12224 abstractC12224M36122 = m36122();
            C4848 c4848M36140 = m36140();
            if (this.f46086.f73357 == EnumC21300.f67033) {
                m36145();
                abstractC14355M36150 = m36150(false);
            } else {
                abstractC14355M36150 = null;
            }
            C4848 c4848M10283 = C4848.m10283();
            if (this.f46086.f73357 == EnumC21300.f67083) {
                m36145();
                c4848M10283 = m36161();
            }
            C4848 c4848M36080 = m36080(c4436, Name.LABEL);
            C4848 c4848M36081 = m36081(abstractC12224M36122, false, false);
            c18537.f55352 = i2;
            C7650 c7651 = (C7650) abstractC13884.mo31589(c18537.m42152(c4436, abstractC12224M36122, c4848M36140, abstractC14355M36150, c4848M10283, c4848M36080, c4848M36081));
            m36110(c7651, interfaceC7217);
            return c7651;
        }
        if (m36126()) {
            return m36131(c4436, interfaceC7217);
        }
        C23311 c23312 = this.f46086;
        EnumC21300 enumC21303 = c23312.f73357;
        int i3 = c23312.f73358;
        EnumC21300 enumC21304 = EnumC21300.f67098;
        if (enumC21303 == enumC21304) {
            m36112(enumC21304);
            AbstractC12224 abstractC12224M36123 = m36122();
            C4848 c4848M36141 = m36140();
            C4848 c4848M10284 = C4848.m10283();
            if (this.f46086.f73357 == EnumC21300.f67033) {
                m36145();
                c4848M10284 = m36161();
            }
            C4848 c4848M36082 = m36080(c4436, "interface");
            C4848 c4848M36083 = m36081(abstractC12224M36123, true, false);
            c18537.f55352 = i3;
            C7650 c7652 = (C7650) abstractC13884.mo31589(c18537.m42152(c4436, abstractC12224M36123, c4848M36141, null, c4848M10284, c4848M36082, c4848M36083));
            m36110(c7652, interfaceC7217);
            return c7652;
        }
        EnumC21300 enumC21305 = EnumC21300.f67026;
        C8200 c8201 = this.f46073;
        boolean z6 = this.f46092;
        if (enumC21303 != enumC21305) {
            if (enumC21303 == EnumC21300.f67050 && c23312.mo5508() == c8201.f21676) {
                m36111(EnumC12477.f34978);
                return (AbstractC13154) abstractC13884.mo31589(c18537.m42196(m36085(this.f46086.f73358, C4848.m10276of((Object) c4436), C8300.f22116)));
            }
            if (this.f46084.test(this.f46086.f73357)) {
                c18537.f55352 = i3;
                c4848M10276of = C4848.m10277of((Object) c4436, (Object) abstractC13884.mo31589(c18537.m42194(m36091(false))));
                m36137(this.f46086.f73358);
            } else {
                c4848M10276of = C4848.m10276of((Object) c4436);
            }
            if (this.f46097) {
                c5638M36085 = m36085(i3, c4848M10276of, C8300.f22130);
            } else if (z6) {
                C14040 c14040 = C8300.f21997;
                c5638M36085 = m36085(i3, c4848M10276of, new C14040("compiler", "expected4", enumC21302, enumC21304, enumC21305, "record"));
            } else {
                c5638M36085 = m36085(i3, c4848M10276of, C8300.m19128(enumC21302, enumC21304, enumC21305));
            }
            return (AbstractC13154) abstractC13884.mo31589(c18537.m42196(c5638M36085));
        }
        m36112(enumC21305);
        AbstractC12224 abstractC12224M36124 = m36122();
        C4848 c4848M10285 = C4848.m10283();
        if (this.f46086.f73357 == EnumC21300.f67083) {
            m36145();
            c4848M10285 = m36161();
        }
        C4848 c4849 = c4848M10285;
        m36112(EnumC21300.f67030);
        C20271 c20272 = new C20271();
        EnumC21300 enumC21306 = this.f46086.f73357;
        EnumC21300 enumC21307 = EnumC21300.f67022;
        C4535 c4536 = this.f46090;
        if (enumC21306 == enumC21307) {
            m36145();
            EnumC21300 enumC21308 = this.f46086.f73357;
            EnumC21300 enumC21309 = EnumC21300.f67048;
            if (enumC21308 == enumC21309) {
                m36145();
                z = true;
                z3 = false;
                z2 = false;
            } else {
                EnumC21300 enumC213010 = EnumC21300.f67119;
                if (enumC21308 != enumC213010) {
                    m36106(c4536.m9591().f73356, C8300.m19127(enumC213010, enumC21309));
                    z = false;
                    z3 = false;
                    z2 = true;
                } else {
                    z = false;
                    z3 = false;
                    z2 = false;
                }
            }
        } else {
            z = false;
            z3 = false;
            z2 = false;
        }
        while (true) {
            EnumC21300 enumC213011 = this.f46086.f73357;
            boolean z7 = z;
            EnumC21300 enumC213012 = EnumC21300.f67119;
            if (enumC213011 == enumC213012 || enumC213011 == (enumC21300 = EnumC21300.f67019)) {
                break;
            }
            c4848 = c4849;
            EnumC21300 enumC213013 = EnumC21300.f67048;
            if (enumC213011 == enumC213013) {
                m36112(enumC213013);
                EnumC21300 enumC213014 = this.f46086.f73357;
                if (enumC213014 != enumC213012 && enumC213014 != enumC21300) {
                    z4 = true;
                }
            } else {
                z4 = z7;
            }
            C23311 c23313 = this.f46086;
            int i4 = i3;
            EnumC21300 enumC213015 = c23313.f73357;
            if ((enumC213015 == EnumC21300.f67050 || enumC213015 == EnumC21300.f67075) && c23313.mo5508() != abstractC12224M36124 && (!(z6 && m36126()) && ((i = C14554.f41514[c4536.m9588(1).f73357.ordinal()]) == 1 || i == 11 || i == 74 || i == 88))) {
                enumC15224 = EnumC15224.ENUMERATOR;
            } else {
                int i5 = C14554.f41514[this.f46086.f73357.ordinal()];
                if (i5 == 5 || i5 == 21 || i5 == 31) {
                    enumC15224 = EnumC15224.UNKNOWN;
                } else if (i5 != 32) {
                    enumC15224 = EnumC15224.MEMBER;
                } else if (z6 && m36126()) {
                    enumC15224 = EnumC15224.MEMBER;
                } else {
                    enumC15224 = EnumC15224.UNKNOWN;
                }
            }
            if (enumC15224 == EnumC15224.UNKNOWN) {
                enumC15224 = z4 ? EnumC15224.MEMBER : EnumC15224.ENUMERATOR;
            }
            if (enumC15224 == EnumC15224.ENUMERATOR) {
                if (z4 && !z3) {
                    m36106(this.f46086.f73358, C8300.f22036);
                    z3 = true;
                }
                C23311 c23314 = this.f46086;
                EnumC2522 enumC2522 = EnumC2522.LINE;
                InterfaceC7217 interfaceC7217M51914 = c23314.m51914();
                int i6 = this.f46086.m51915() ? 147481 : 16409;
                int i7 = this.f46086.f73358;
                C4848 c4848M36084 = m36082(EnumC19998.f60714);
                c18537.f55352 = c4848M36084.isEmpty() ? -1 : i7;
                C4535 c4537 = c4536;
                C4436 c4436M42190 = c18537.m42190(i6, c4848M36084);
                C4848 c4848M36155 = m36155(2);
                int i8 = this.f46086.f73358;
                AbstractC12224 abstractC12224M36091 = m36091(false);
                C23311 c23315 = this.f46086;
                int i9 = c23315.f73358;
                C4848 c4848M36146 = c23315.f73357 == EnumC21300.f67108 ? m36146() : C4848.m10283();
                z5 = z6;
                if (this.f46086.f73357 == EnumC21300.f67030) {
                    c18537.f55352 = -1;
                    C4436 c4436M42142 = c18537.m42142(16384L);
                    C4848 c4848M36085 = m36081(c8201.f21725, false, false);
                    c18537.f55352 = i8;
                    c7650 = (C7650) abstractC13884.mo31589(c18537.m42150(c4436M42142, c4848M36085));
                } else {
                    c7650 = null;
                }
                int i10 = (c4848M36146.isEmpty() && c7650 == null) ? i8 : i9;
                c18537.f55352 = i8;
                C9661 c9661M42194 = c18537.m42194(abstractC12224M36124);
                c18537.f55352 = i10;
                C20271 c20273 = c20272;
                c4535 = c4537;
                c8200 = c8201;
                C20530 c20530M42182 = c18537.m42182((AbstractC14355) null, c4848M36155, (AbstractC14355) c9661M42194, c4848M36146, c7650, false);
                if (i10 != i8) {
                    m36109(c20530M42182, c4535.m9591().f73356);
                }
                c18537.f55352 = i8;
                C9661 c9661M42195 = c18537.m42194(abstractC12224M36124);
                c18537.f55352 = i7;
                AbstractC7257 abstractC7257Mo31589 = abstractC13884.mo31589(c18537.m42163(c4436M42190, abstractC12224M36091, c9661M42195, c20530M42182));
                m36110(abstractC7257Mo31589, interfaceC7217M51914);
                c20271 = c20273;
                c20271.m45777(abstractC7257Mo31589);
                C23311 c23316 = this.f46086;
                int i11 = c23316.f73358;
                if (i11 <= abstractC13884.f39206) {
                    m36114(false, true, true, false);
                } else {
                    EnumC21300 enumC213016 = c23316.f73357;
                    if (enumC213016 != enumC213012 && enumC213016 != enumC213013 && enumC213016 != enumC21300) {
                        EnumC21300 enumC213017 = EnumC21300.f67022;
                        if (enumC213016 == enumC213017) {
                            m36145();
                        } else {
                            m36137(i11);
                            m36106(c4535.m9591().f73356, C8300.m19128(enumC213017, enumC213012, enumC213013));
                            z3 = z3;
                            z2 = true;
                        }
                        c20272 = c20271;
                        c4849 = c4848;
                        z = z4;
                        i3 = i4;
                        c4536 = c4535;
                        z6 = z5;
                        c8201 = c8200;
                    }
                }
                z3 = z3;
            } else {
                c20271 = c20272;
                c4535 = c4536;
                z5 = z6;
                c8200 = c8201;
                if (!z4 && !z3 && !z2) {
                    m36106(this.f46086.f73358, C8300.f22168);
                    z3 = true;
                }
                c20271.m45778(m36128(abstractC12224M36124, false, false));
                if (this.f46086.f73358 <= abstractC13884.f39206) {
                    m36114(false, true, true, false);
                }
            }
            z2 = false;
            c20272 = c20271;
            c4849 = c4848;
            z = z4;
            i3 = i4;
            c4536 = c4535;
            z6 = z5;
            c8201 = c8200;
            m36112(enumC213012);
            C4848 c4848M45783 = c20272.m45783();
            c4436.f9954 |= 16384;
            c18537.f55352 = i3;
            C7650 c7653 = (C7650) abstractC13884.mo31589(c18537.m42151(c4436, abstractC12224M36124, C4848.m10283(), (AbstractC14355) null, c4848, c4848M45783));
            m36110(c7653, interfaceC7217);
            return c7653;
        }
        c4848 = c4849;
        m36112(enumC213012);
        C4848 c4848M45784 = c20272.m45783();
        c4436.f9954 |= 16384;
        c18537.f55352 = i3;
        C7650 c7654 = (C7650) abstractC13884.mo31589(c18537.m42151(c4436, abstractC12224M36124, C4848.m10283(), (AbstractC14355) null, c4848, c4848M45784));
        m36110(c7654, interfaceC7217);
        return c7654;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00d9  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۧ */
    public final C7650 m36131(C4436 c4436, InterfaceC7217 interfaceC7217) {
        C18537 c18537;
        C4848 c4848;
        C4848 c4849;
        int i = this.f46086.f73358;
        m36145();
        c4436.f9954 |= 2305843009213693952L;
        AbstractC12224 abstractC12224M36122 = m36122();
        C4848 c4848M36140 = m36140();
        C4848<C11281> c4848M36129 = m36129(false, true);
        C4848 c4848M10283 = C4848.m10283();
        if (this.f46086.f73357 == EnumC21300.f67083) {
            m36145();
            c4848M10283 = m36161();
        }
        C4848 c4848M36081 = m36081(abstractC12224M36122, false, true);
        ArrayList arrayList = new ArrayList();
        Iterator it = c4848M36129.iterator();
        while (it.hasNext()) {
            arrayList.add((C11281) it.next());
        }
        Iterator it2 = c4848M36081.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            c18537 = this.f46074;
            if (!zHasNext) {
                break;
            }
            AbstractC7257 abstractC7257 = (AbstractC7257) it2.next();
            if (abstractC7257.m16617(EnumC19998.f60735)) {
                C10471 c10471 = (C10471) abstractC7257;
                if (c10471.f28959 == this.f46073.f21737 && c10471.f28963.isEmpty() && (c10471.f28961.f9954 & 2251799813685248L) != 0) {
                    C20271 c20271 = new C20271();
                    for (C11281 c11281 : c4848M36129) {
                        c18537.m42189((InterfaceC5323) c11281);
                        C4436 c4437 = c11281.f31435;
                        c20271.m45777(c18537.m42163(c18537.m42190((c4437.f9954 & 17179869184L) | 8606711808L, c4437.f9953), c11281.f31433, c11281.f31437, (AbstractC14355) null));
                        c4848M36129 = c4848M36129;
                        c4848M10283 = c4848M10283;
                    }
                    c4848 = c4848M36129;
                    c4849 = c4848M10283;
                    c10471.f28963 = c20271.m45783();
                } else {
                    c4848 = c4848M36129;
                    c4849 = c4848M10283;
                }
            } else {
                c4848 = c4848M36129;
                c4849 = c4848M10283;
            }
            c4848M36129 = c4848;
            c4848M10283 = c4849;
        }
        C4848 c48410 = c4848M10283;
        C4848 c4848M10290 = c4848M36081;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c4848M10290 = c4848M10290.m10290((C11281) arrayList.get(size));
        }
        c18537.f55352 = i;
        C7650 c7650 = (C7650) this.f46082.mo31589(c18537.m42151(c4436, abstractC12224M36122, c4848M36140, (AbstractC14355) null, c48410, c4848M10290));
        m36110(c7650, interfaceC7217);
        return c7650;
    }

    /* JADX INFO: renamed from: ۙ */
    public final AbstractC12224 m36122() {
        int i = this.f46086.f73358;
        AbstractC12224 abstractC12224M36091 = m36091(false);
        EnumC17840 enumC17840M36099 = m36099(abstractC12224M36091, i, true);
        if (enumC17840M36099 != null) {
            C14040 c14040 = C8300.f21997;
            m36106(i, new C14040("compiler", "restricted.type.not.allowed", abstractC12224M36091, enumC17840M36099));
        }
        return abstractC12224M36091;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m36080(C4436 c4436, String str) {
        if (this.f46091) {
            C23311 c23311 = this.f46086;
            if (c23311.f73357 == EnumC21300.f67050 && c23311.mo5508() == this.f46073.f21730) {
                m36111(EnumC12477.f34959);
                if ((c4436.f9954 & SkeinEngine.UbiTweak.T1_FIRST) == 0) {
                    this.f46072.m9348(this.f46086.f73358, C8300.m19124(new C13370("compiler", "class.is.not.sealed", str)));
                }
                m36145();
                return m36151(false);
            }
        }
        return C4848.m10283();
    }

    /* JADX INFO: renamed from: ᩶ */
    public final C4848 m36161() {
        C20271 c20271 = new C20271();
        c20271.m45777(m36150(false));
        while (this.f46086.f73357 == EnumC21300.f67022) {
            m36145();
            c20271.m45777(m36150(false));
        }
        return c20271.m45783();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m36081(AbstractC12224 abstractC12224, boolean z, boolean z2) {
        EnumC21300 enumC21300;
        EnumC21300 enumC21301 = EnumC21300.f67030;
        m36112(enumC21301);
        int i = this.f46086.f73358;
        AbstractC13884 abstractC13884 = this.f46082;
        if (i <= abstractC13884.f39206) {
            m36114(false, true, false, false);
            if (this.f46086.f73357 == enumC21301) {
                m36145();
            } else {
                return C4848.m10283();
            }
        }
        C20271 c20271 = new C20271();
        while (true) {
            EnumC21300 enumC21302 = this.f46086.f73357;
            enumC21300 = EnumC21300.f67119;
            if (enumC21302 == enumC21300 || enumC21302 == EnumC21300.f67019) {
                break;
            }
            c20271.m45778(m36128(abstractC12224, z, z2));
            if (this.f46086.f73358 <= abstractC13884.f39206) {
                m36114(false, true, true, false);
            }
        }
        m36112(enumC21300);
        return c20271.m45783();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4848 m36128(AbstractC12224 abstractC12224, boolean z, boolean z2) {
        EnumC21300 enumC21300;
        AbstractC14355 abstractC14355M36167;
        C4848 c4848M10276of;
        C23311 c23311 = this.f46086;
        EnumC21300 enumC21301 = c23311.f73357;
        EnumC21300 enumC21302 = EnumC21300.f67048;
        if (enumC21301 == enumC21302) {
            m36145();
            return C4848.m10283();
        }
        EnumC2522 enumC2522 = EnumC2522.LINE;
        InterfaceC7217 interfaceC7217M51914 = c23311.m51914();
        int i = this.f46086.f73358;
        C4436 c4436M36079 = m36079((C4436) null);
        if (this.f46086.f73357 == EnumC21300.f67046 || ((this.f46092 && m36126()) || (enumC21300 = this.f46086.f73357) == EnumC21300.f67098 || enumC21300 == EnumC21300.f67026)) {
            return C4848.m10276of((Object) m36092(c4436M36079, interfaceC7217M51914));
        }
        EnumC21300 enumC21303 = EnumC21300.f67030;
        C23623 c23623 = this.f46072;
        if (enumC21300 == enumC21303 && (c4436M36079.f9954 & 4087) == 0 && c4436M36079.f9953.isEmpty()) {
            if (z) {
                c23623.m9358(EnumC21417.SYNTAX, this.f46086.f73358, C8300.f22148);
            } else if (z2 && (c4436M36079.f9954 & 8) == 0) {
                c23623.m9358(EnumC21417.SYNTAX, this.f46086.f73358, C8300.f22059);
            }
            return C4848.m10276of((Object) m36083(i, c4436M36079.f9954));
        }
        int i2 = this.f46086.f73358;
        C4848 c4848M36140 = m36140();
        if (c4848M36140.m10293() && c4436M36079.f18924 == -1) {
            c4436M36079.f18924 = i2;
            m36109(c4436M36079, i2);
        }
        C4848 c4848M36082 = m36082(EnumC19998.f60714);
        if (c4848M36082.m10293()) {
            m36105(((C19049) c4848M36082.f11034).f18924, EnumC12477.f34968);
            C4848 c4848 = c4436M36079.f9953;
            c4848.getClass();
            C4848 c4848M10292 = c4848M36082.m10292(c4848);
            c4436M36079.f9953 = c4848M10292;
            if (c4436M36079.f18924 == -1) {
                c4436M36079.f18924 = ((C19049) c4848M10292.f11034).f18924;
            }
        }
        C23311 c23312 = this.f46086;
        int i3 = c23312.f73358;
        boolean z3 = c23312.f73357 == EnumC21300.f67042;
        AbstractC13884 abstractC13884 = this.f46082;
        C18537 c18537 = this.f46074;
        if (z3) {
            c18537.f55352 = i3;
            abstractC14355M36167 = (AbstractC14355) abstractC13884.mo31588(c18537.m42146(EnumC11353.VOID));
            m36145();
        } else {
            abstractC14355M36167 = m36167(false);
        }
        EnumC21300 enumC21304 = this.f46086.f73357;
        EnumC21300 enumC21305 = EnumC21300.f67108;
        C8200 c8200 = this.f46073;
        if (((enumC21304 == enumC21305 && !z) || (z2 && enumC21304 == enumC21303)) && abstractC14355M36167.m16617(EnumC19998.f60790)) {
            if (z || c23312.mo5508() != abstractC12224) {
                c23623.m9358(EnumC21417.SYNTAX, i3, C8300.f21994);
            } else if (c4848M36082.m10293()) {
                m36084(((C19049) c4848M36082.f11034).f18924);
            }
            if (z2 && this.f46086.f73357 == enumC21303) {
                c4436M36079.f9954 |= 2251799813685248L;
            }
            return C4848.m10276of((Object) m36086(i3, c4436M36079, null, c8200.f21737, c4848M36140, z, true, z2, interfaceC7217M51914));
        }
        if (z2 && abstractC14355M36167.m16617(EnumC19998.f60790)) {
            C23311 c23313 = this.f46086;
            if (c23313.f73357 == EnumC21300.f67067) {
                EnumC21417 enumC21417 = EnumC21417.SYNTAX;
                int i4 = c23313.f73358;
                C13370 c13370 = C13665.f38496;
                c23623.m9358(enumC21417, i4, C8300.m19125(c13370, abstractC12224, new C13370("compiler", "throws.clause.not.allowed.for.canonical.constructor", c13370)));
                m36114(false, true, false, false);
                return C4848.m10276of((Object) m36086(i3, c4436M36079, null, c8200.f21737, c4848M36140, z, true, z2, interfaceC7217M51914));
            }
        }
        int i5 = this.f46086.f73358;
        AbstractC12224 abstractC12224M36091 = m36091(false);
        if (this.f46086.f73357 == enumC21305) {
            return C4848.m10276of((Object) m36086(i5, c4436M36079, abstractC14355M36167, abstractC12224M36091, c4848M36140, z, z3, false, interfaceC7217M51914));
        }
        if (z3 || !c4848M36140.isEmpty()) {
            int i6 = this.f46086.f73358;
            if (z3 || c4848M36140.m10293()) {
                c18537.f55352 = i6;
                C10471 c10471 = (C10471) abstractC13884.mo31589(c18537.m42160(c4436M36079, abstractC12224M36091, abstractC14355M36167, c4848M36140, null, C4848.m10283(), C4848.m10283(), null, null));
                m36110(c10471, interfaceC7217M51914);
                c4848M10276of = C4848.m10276of((Object) c10471);
            } else {
                c4848M10276of = C4848.m10283();
            }
            return C4848.m10276of((Object) m36085(this.f46086.f73358, c4848M10276of, C8300.m19126(enumC21305)));
        }
        if (!z2 || (z2 && (c4436M36079.f9954 & 8) != 0)) {
            C20271 c20271 = new C20271();
            m36104(i5, c4436M36079, abstractC14355M36167, abstractC12224M36091, z, interfaceC7217M51914, c20271, false);
            C4848 c4848M45783 = c20271.m45783();
            m36112(enumC21302);
            m36109((AbstractC7257) c4848M45783.last(), this.f46090.m9591().f73356);
            return c4848M45783;
        }
        C20271 c20272 = new C20271();
        m36104(i5, c4436M36079, abstractC14355M36167, abstractC12224M36091, z, interfaceC7217M51914, c20272, false);
        c20272.m45783();
        m36112(enumC21302);
        return C4848.m10276of((Object) m36085(i5, (C4848) null, C8300.f22044));
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m36126() {
        C23311 c23311 = this.f46086;
        EnumC21300 enumC21300 = c23311.f73357;
        EnumC21300 enumC21301 = EnumC21300.f67050;
        if (enumC21300 != enumC21301 || c23311.mo5508() != this.f46073.f21676 || (!m36116(0, enumC21301, EnumC21300.f67108) && !m36116(0, enumC21301, EnumC21300.f67019) && !m36116(0, enumC21301, EnumC21300.f67111))) {
            return false;
        }
        m36111(EnumC12477.f34978);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m36118(C23311 c23311, int i) {
        AbstractC12224 abstractC12224Mo5508 = c23311.mo5508();
        C8200 c8200 = this.f46073;
        if (abstractC12224Mo5508 != c8200.f21710 || !m36116(i, EnumC21300.f67045, EnumC21300.f67050)) {
            return false;
        }
        C4535 c4535 = this.f46090;
        C23311 c23311M9588 = c4535.m9588(i + 1);
        C23311 c23311M9589 = c4535.m9588(i + 2);
        if (c23311.f73356 != c23311M9588.f73358 || c23311M9588.f73356 != c23311M9589.f73358 || c23311M9589.mo5508() != c8200.f21722) {
            return false;
        }
        m36111(EnumC12477.f34959);
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m36138(boolean z) {
        if (this.f46086.mo5508() != this.f46073.f21722 || !m36065(this.f46090.m9588(1), z, false)) {
            return false;
        }
        m36111(EnumC12477.f34959);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m36065(C23311 c23311, boolean z, boolean z2) {
        C4535 c4535 = this.f46090;
        if (z) {
            int i = C14554.f41514[c23311.f73357.ordinal()];
            if (i != 3 && i != 4) {
                if (i != 5) {
                    if (i != 7 && i != 8 && i != 9 && i != 20) {
                        return false;
                    }
                } else if (c4535.m9588(2).f73357 == EnumC21300.f67098 && !z2) {
                    return false;
                }
            }
        } else {
            int i2 = C14554.f41514[c23311.f73357.ordinal()];
            if (i2 != 2 && i2 != 3 && i2 != 4) {
                if (i2 != 5) {
                    if (i2 != 7 && i2 != 8 && i2 != 9 && i2 != 20) {
                        if (i2 != 32) {
                            switch (i2) {
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                default:
                                    return false;
                            }
                        } else {
                            if (!m36118(c23311, z2 ? 3 : 1) && c23311.mo5508() != this.f46073.f21722) {
                                return false;
                            }
                        }
                    }
                } else if (c4535.m9588(2).f73357 == EnumC21300.f67098 && !z2) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10471 m36086(int i, C4436 c4436, AbstractC14355 abstractC14355, AbstractC12224 abstractC12224, C4848 c4848, boolean z, boolean z2, boolean z3, InterfaceC7217 interfaceC7217) {
        AbstractC14355 abstractC14355M36067;
        AbstractC14355 abstractC14355M36132;
        C4968 c4968M36142;
        AbstractC14355 abstractC14356;
        if (z) {
            if ((c4436.f9954 & 8) != 0) {
                m36111(EnumC12477.f34972);
            }
            if ((c4436.f9954 & 2) != 0) {
                m36111(EnumC12477.f34952);
            }
        }
        C11281 c11281 = this.f46078;
        C4968 c4968M36143 = null;
        try {
            this.f46078 = null;
            C4848 c4848M10283 = C4848.m10283();
            C4848 c4848M10284 = C4848.m10283();
            if (z3 && abstractC12224 == this.f46073.f21737 && this.f46086.f73357 != EnumC21300.f67108) {
                abstractC14355M36067 = abstractC14355;
            } else {
                c4848M10283 = m36129(false, false);
                abstractC14355M36067 = !z2 ? m36067(abstractC14355) : abstractC14355;
                if (this.f46086.f73357 == EnumC21300.f67067) {
                    m36145();
                    c4848M10284 = m36151(true);
                }
            }
            C4848 c4849 = c4848M10283;
            C4848 c48410 = c4848M10284;
            EnumC21300 enumC21300 = this.f46086.f73357;
            EnumC21300 enumC21301 = EnumC21300.f67030;
            AbstractC13884 abstractC13884 = this.f46082;
            if (enumC21300 == enumC21301) {
                abstractC14356 = null;
                c4968M36142 = m36142();
            } else {
                EnumC21300 enumC21302 = EnumC21300.f67029;
                if (enumC21300 == enumC21302) {
                    m36112(enumC21302);
                    abstractC14355M36132 = m36132();
                } else {
                    abstractC14355M36132 = null;
                }
                m36112(EnumC21300.f67048);
                if (this.f46086.f73358 <= abstractC13884.f39206) {
                    m36114(false, true, false, false);
                    if (this.f46086.f73357 == enumC21301) {
                        c4968M36143 = m36142();
                    }
                }
                c4968M36142 = c4968M36143;
                abstractC14356 = abstractC14355M36132;
            }
            C18537 c18537 = this.f46074;
            c18537.f55352 = i;
            C10471 c10471 = (C10471) abstractC13884.mo31589(c18537.m42160(c4436, abstractC12224, abstractC14355M36067, c4848, this.f46078, c4849, c48410, c4968M36142, abstractC14356));
            m36110(c10471, interfaceC7217);
            return c10471;
        } finally {
            this.f46078 = c11281;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final C4848 m36151(boolean z) {
        C4848 c4848M10283;
        C4848 c4848M10284;
        C20271 c20271 = new C20271();
        if (z) {
            c4848M10283 = m36082(EnumC19998.f60707);
        } else {
            c4848M10283 = C4848.m10283();
        }
        AbstractC14355 abstractC14355M36158 = m36158(z);
        if (!c4848M10283.isEmpty()) {
            c20271.m45777(m36062(abstractC14355M36158, c4848M10283, false));
        } else {
            c20271.m45777(abstractC14355M36158);
        }
        while (this.f46086.f73357 == EnumC21300.f67022) {
            m36145();
            if (z) {
                c4848M10284 = m36082(EnumC19998.f60707);
            } else {
                c4848M10284 = C4848.m10283();
            }
            AbstractC14355 abstractC14355M36159 = m36158(z);
            if (!c4848M10284.isEmpty()) {
                c20271.m45777(m36062(abstractC14355M36159, c4848M10284, false));
            } else {
                c20271.m45777(abstractC14355M36159);
            }
        }
        return c20271.m45783();
    }

    /* JADX INFO: renamed from: ۬ */
    public final C4848 m36140() {
        if (this.f46086.f73357 == EnumC21300.f67111) {
            C20271 c20271 = new C20271();
            m36145();
            c20271.m45777(m36120());
            while (this.f46086.f73357 == EnumC21300.f67022) {
                m36145();
                c20271.m45777(m36120());
            }
            m36112(EnumC21300.f67092);
            return c20271.m45783();
        }
        return C4848.m10283();
    }

    /* JADX INFO: renamed from: ۗ */
    public final C15973 m36120() {
        int i = this.f46086.f73358;
        C4848 c4848M36082 = m36082(EnumC19998.f60707);
        AbstractC12224 abstractC12224M36122 = m36122();
        C20271 c20271 = new C20271();
        if (this.f46086.f73357 == EnumC21300.f67033) {
            m36145();
            c20271.m45777(m36150(false));
            while (this.f46086.f73357 == EnumC21300.f67018) {
                m36145();
                c20271.m45777(m36150(false));
            }
        }
        C18537 c18537 = this.f46074;
        c18537.f55352 = i;
        C4848 c4848M45783 = c20271.m45783();
        C15973 c15973 = new C15973();
        c15973.f46261 = abstractC12224M36122;
        c15973.f46262 = c4848M45783;
        c15973.f46260 = c4848M36082;
        c15973.f18924 = c18537.f55352;
        return (C15973) this.f46082.mo31589(c15973);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4848 m36129(boolean z, boolean z2) {
        C20271 c20271 = new C20271();
        m36112(EnumC21300.f67108);
        if (this.f46086.f73357 != EnumC21300.f67051) {
            this.f46099 = (z || z2) ? false : true;
            C11281 c11281M36089 = m36089(z, z2);
            if (c11281M36089.f31432 != null) {
                this.f46078 = c11281M36089;
            } else {
                c20271.m45777(c11281M36089);
            }
            this.f46099 = false;
            while (this.f46086.f73357 == EnumC21300.f67022) {
                if ((c11281M36089.f31435.f9954 & 17179869184L) != 0) {
                    this.f46072.m9359(EnumC21417.SYNTAX, c11281M36089, C8300.f22109);
                }
                m36145();
                c11281M36089 = m36089(z, z2);
                c20271.m45777(c11281M36089);
            }
        }
        C23311 c23311 = this.f46086;
        EnumC21300 enumC21300 = c23311.f73357;
        EnumC21300 enumC21301 = EnumC21300.f67051;
        if (enumC21300 == enumC21301) {
            m36145();
        } else {
            m36137(c23311.f73358);
            m36106(this.f46090.m9591().f73356, C8300.m19128(EnumC21300.f67022, enumC21301, EnumC21300.f67009));
        }
        return c20271.m45783();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11281 m36089(boolean z, boolean z2) {
        C4436 c4436M36079;
        if (z2) {
            c4436M36079 = m36079((C4436) null);
        } else {
            c4436M36079 = m36078(8589934592L);
        }
        if (z2 && c4436M36079.f9954 != 0) {
            this.f46072.m9348(c4436M36079.f18924, C8300.f22002);
        }
        if (z2) {
            c4436M36079.f9954 |= 2305843009230471186L;
        }
        this.f46098 = true;
        AbstractC14355 abstractC14355M36150 = m36150(z);
        this.f46098 = false;
        if (this.f46086.f73357 == EnumC21300.f67110) {
            C4848 c4848 = this.f46085;
            this.f46085 = C4848.m10283();
            c4436M36079.f9954 |= 17179869184L;
            abstractC14355M36150 = m36062(abstractC14355M36150, c4848, true);
            m36145();
        } else {
            if (this.f46085.m10293()) {
                m36106(((C19049) this.f46085.f11034).f18924, C8300.f22070);
            }
            this.f46085 = C4848.m10283();
        }
        return m36088(c4436M36079, abstractC14355M36150, z, z2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC14355 m36134(AbstractC14355 abstractC14355) {
        if (C9268.m21413(abstractC14355)) {
            return abstractC14355;
        }
        int i = abstractC14355.f18924;
        C18537 c18537 = this.f46074;
        c18537.f55352 = i;
        C5638 c5638M42192 = c18537.m42192(C4848.m10276of((Object) abstractC14355));
        this.f46072.m9359(EnumC21417.SYNTAX, c5638M42192, C8300.f22160);
        return c5638M42192;
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m36072(EnumC21300 enumC21300) {
        EnumC19998 enumC19998M36071 = m36071(enumC21300);
        if (enumC19998M36071 != EnumC19998.f60719) {
            return C9268.m21399(enumC19998M36071);
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۧ */
    public static EnumC19998 m36071(EnumC21300 enumC21300) {
        int i = C14554.f41514[enumC21300.ordinal()];
        if (i == 21) {
            return EnumC19998.f60763;
        }
        if (i == 82) {
            return EnumC19998.f60769;
        }
        if (i != 83) {
            switch (i) {
                case 62:
                    return EnumC19998.f60797;
                case 63:
                    return EnumC19998.f60750;
                case 64:
                    return EnumC19998.f60732;
                case 65:
                    return EnumC19998.f60711;
                case 66:
                    return EnumC19998.f60766;
                case 67:
                    return EnumC19998.f60803;
                case 68:
                    return EnumC19998.f60734;
                case 69:
                    return EnumC19998.f60749;
                case 70:
                    return EnumC19998.f60710;
                case 71:
                    return EnumC19998.f60776;
                case 72:
                    return EnumC19998.f60798;
                default:
                    switch (i) {
                        case 89:
                            return EnumC19998.f60770;
                        case 90:
                            return EnumC19998.f60751;
                        case 91:
                            return EnumC19998.f60796;
                        case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                            return EnumC19998.f60752;
                        case 93:
                            return EnumC19998.f60768;
                        default:
                            switch (i) {
                                case 95:
                                    return EnumC19998.f60703;
                                case 96:
                                    return EnumC19998.f60789;
                                case 97:
                                    return EnumC19998.f60762;
                                case 98:
                                    return EnumC19998.f60708;
                                case C0254q.f1216f /* 99 */:
                                    return EnumC19998.f60783;
                                case 100:
                                    return EnumC19998.f60794;
                                case 101:
                                    return EnumC19998.f60729;
                                case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                    return EnumC19998.f60736;
                                case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                                    return EnumC19998.f60807;
                                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                    return EnumC19998.f60771;
                                case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                                    return EnumC19998.f60775;
                                case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                                    return EnumC19998.f60704;
                                default:
                                    return EnumC19998.f60719;
                            }
                    }
            }
        }
        return EnumC19998.f60709;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36111(EnumC12477 enumC12477) {
        m36105(this.f46086.f73358, enumC12477);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36105(int i, EnumC12477 enumC12477) {
        C24387 c24387 = this.f46095;
        boolean zM53747 = c24387.m53747(enumC12477);
        C23623 c23623 = this.f46072;
        if (zM53747 && !c24387.m53743()) {
            c23623.m9358(EnumC21417.SOURCE_LEVEL, i, c24387.m53738(enumC12477));
            return;
        }
        EnumC17840 enumC17840 = this.f46076;
        if (!enumC12477.m28726(enumC17840)) {
            c23623.m9358(EnumC21417.SOURCE_LEVEL, i, enumC12477.m28724(enumC17840.f53238));
        } else if (c24387.m53747(enumC12477)) {
            c24387.m53740(new C9346(i), enumC12477);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m36137(int i) {
        AbstractC13884 abstractC13884 = this.f46082;
        if (i > abstractC13884.f39206) {
            abstractC13884.f39206 = i;
        }
    }
}
