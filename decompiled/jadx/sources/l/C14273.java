package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.color.MaterialColors;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
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
public final class C14273 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C11576[][] f42978;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C22364 f42979;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C6136 f42980;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17013 f42981;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C3440 f42982;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public EnumC16280 f42983;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f42984;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C9378 f42985;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f42987;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AbstractC12117 f42989;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C8630 f42990;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C22036 f42993;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f42994;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C2280 f42997;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f42998;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f42999;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f43000;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C23168 f43002;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f43004;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f43006;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C2609 f42992 = C2609.m8239();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f43005 = false;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f42986 = 0;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f43001 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f42996 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f43003 = 0;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public ArrayList f42988 = new ArrayList();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public ArrayList f42995 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C18411 f42991 = new C18411(5);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33974(int i, AbstractC12612 abstractC12612, C18837 c18837) {
        C17013 c17013 = this.f42981;
        c17013.f52172 = i;
        C10496 c10496M39953 = c17013.m39953(m34001(abstractC12612));
        AbstractC12117 abstractC12117 = this.f42989;
        c18837.m43511(abstractC12117.mo29524(c10496M39953));
        while (this.f42993.f70640 == EnumC19920.f64384) {
            m34012();
            int i2 = this.f42993.f70641;
            AbstractC12612 abstractC12612M34014 = m34014(1);
            c17013.f52172 = i2;
            c18837.m43511(abstractC12117.mo29524(c17013.m39953(m34001(abstractC12612M34014))));
        }
    }

    public C14273(C15684 c15684, C2280 c2280, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC12117 c22700;
        this.f42997 = c2280;
        m34012();
        C17013 c17013 = c15684.f48345;
        this.f42981 = c17013;
        this.f42979 = c15684.f48346;
        this.f42980 = c15684.f48348;
        EnumC16280 enumC16280 = c15684.f48351;
        this.f42983 = enumC16280;
        this.f43002 = c15684.f48349;
        String strM28824 = c15684.f48350.m28824("allowStringFolding");
        this.f42994 = strM28824 == null ? true : Boolean.parseBoolean(strM28824);
        this.f42984 = z;
        this.f43004 = z4;
        this.f42990 = z ? new C8630(c15684) : null;
        this.f43000 = z2;
        this.f42982 = c17013.m39948();
        if (z3) {
            c22700 = new C17096(this);
        } else {
            c22700 = new C22700(this);
        }
        this.f42989 = c22700;
        this.f42987 = EnumC10637.f32008.m26686(enumC16280);
        this.f42999 = EnumC10637.f32007.m26686(enumC16280);
        this.f42998 = EnumC10637.f31988.m26686(enumC16280);
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m33942() {
        this.f42986 = (this.f42986 & 32) | 1;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m33990() {
        this.f42986 = (this.f42986 & 32) | 2;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m34012() {
        C2280 c2280 = this.f42997;
        c2280.m7521();
        this.f42993 = c2280.m7520(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33982(int i, Predicate predicate) {
        return predicate.test(this.f42997.m7520(i + 1).f70640);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33983(int i, Predicate predicate, Predicate predicate2) {
        C2280 c2280 = this.f42997;
        return predicate.test(c2280.m7520(i + 1).f70640) && predicate2.test(c2280.m7520(i + 2).f70640);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33981(boolean z, boolean z2, boolean z3, boolean z4) {
        while (true) {
            switch (C12822.f38471[this.f42993.f70640.ordinal()]) {
                case 1:
                    m34012();
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
            m34012();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C3440 m33997(int i, C12281 c12281) {
        return m33952(i, C2609.m8239(), c12281);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3440 m33952(int i, C2609 c2609, C12281 c12281) {
        AbstractC5144 abstractC5144;
        m34004(i);
        C17013 c17013 = this.f42981;
        c17013.f52172 = i;
        C3440 c3440M39949 = c17013.m39949(c2609);
        m33975(c3440M39949, c12281);
        if (c2609 != null && (abstractC5144 = (AbstractC5144) c2609.last()) != null) {
            m33976(abstractC5144, i);
        }
        return (C3440) this.f42989.mo29524(c3440M39949);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33973(int i, C12281 c12281) {
        m33975(new C7342(i), c12281);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33975(InterfaceC3109 interfaceC3109, C12281 c12281) {
        int iMo9480 = interfaceC3109.mo9480();
        C2280 c2280 = this.f42997;
        if (iMo9480 > c2280.m7517() || iMo9480 == -1) {
            EnumC19920 enumC19920 = this.f42993.f70640;
            EnumC19920 enumC19921 = EnumC19920.f64381;
            C22364 c22364 = this.f42979;
            if (enumC19920 == enumC19921) {
                c22364.m7280(EnumC20043.SYNTAX, interfaceC3109, C6241.f19217);
            } else {
                c22364.m7280(EnumC20043.SYNTAX, interfaceC3109, c12281);
            }
        }
        c2280.m7518(iMo9480);
        C22036 c22036 = this.f42993;
        int i = c22036.f70641;
        if (i == this.f42996 && c22036.f70640 != EnumC19920.f64381) {
            int i2 = this.f43003;
            this.f43003 = i2 + 1;
            C12171.m29642(i2 < 50);
        } else {
            this.f43003 = 0;
            this.f42996 = i;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33979(EnumC19920 enumC19920) {
        m33980(enumC19920, new C13216(5));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33980(EnumC19920 enumC19920, Function function) {
        C22036 c22036 = this.f42993;
        if (c22036.f70640 == enumC19920) {
            m34012();
        } else {
            m34004(c22036.f70641);
            m33973(this.f42997.m7523().f70639, (C12281) function.apply(enumC19920));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3440 m33951(int i) {
        m34004(i);
        if ((this.f42986 & 1) != 0) {
            return m33997(i, C6241.f19177);
        }
        return m33997(i, C6241.f19205);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C3440 m33994() {
        return m33951(this.f42993.f70641);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33977(AbstractC5144 abstractC5144, InterfaceC5102 interfaceC5102) {
        if (!this.f42984 || interfaceC5102 == null) {
            return;
        }
        this.f42990.m22392(abstractC5144, interfaceC5102);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33976(AbstractC5144 abstractC5144, int i) {
        this.f42989.mo6595(abstractC5144, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC12612 m33929(AbstractC12612 abstractC12612, C2609 c2609, boolean z) {
        EnumC18550 enumC18550;
        EnumC18550 enumC18551;
        AbstractC12117 abstractC12117 = this.f42989;
        int iMo6593 = abstractC12117.mo6593(abstractC12612);
        C23901 c23901 = null;
        AbstractC12612 abstractC12613 = abstractC12612;
        while (C7260.m19465(abstractC12613).m14709(EnumC18550.f57518)) {
            c23901 = (C23901) C7260.m19465(abstractC12613);
            abstractC12613 = c23901.f77274;
        }
        C17013 c17013 = this.f42981;
        if (z) {
            c17013.f52172 = this.f42993.f70641;
            abstractC12613 = (AbstractC12612) abstractC12117.mo29523(c17013.m39969(abstractC12613));
            iMo6593 = abstractC12117.mo6593(abstractC12613);
        }
        if (c2609.m8249()) {
            AbstractC12612 abstractC12614 = abstractC12613;
            AbstractC12612 abstractC12615 = abstractC12614;
            while (true) {
                AbstractC12612 abstractC12612M19465 = C7260.m19465(abstractC12614);
                enumC18550 = EnumC18550.f57581;
                if (!abstractC12612M19465.m14709(enumC18550)) {
                    AbstractC12612 abstractC12612M19466 = C7260.m19465(abstractC12614);
                    enumC18551 = EnumC18550.f57521;
                    if (!abstractC12612M19466.m14709(enumC18551)) {
                        break;
                    }
                }
                while (C7260.m19465(abstractC12614).m14709(EnumC18550.f57581)) {
                    abstractC12615 = abstractC12614;
                    abstractC12614 = ((C6262) C7260.m19465(abstractC12614)).f19397;
                }
                while (C7260.m19465(abstractC12614).m14709(EnumC18550.f57521)) {
                    abstractC12615 = abstractC12614;
                    abstractC12614 = ((C16432) C7260.m19465(abstractC12614)).f50542;
                }
            }
            c17013.f52172 = ((C17551) c2609.f8240).f16085;
            C18257 c18257M39937 = c17013.m39937(abstractC12614, c2609);
            if (C7260.m19465(abstractC12615).m14709(enumC18551)) {
                ((C16432) C7260.m19465(abstractC12615)).f50542 = c18257M39937;
            } else if (C7260.m19465(abstractC12615).m14709(enumC18550)) {
                ((C6262) C7260.m19465(abstractC12615)).f19397 = c18257M39937;
            } else {
                abstractC12613 = c18257M39937;
            }
        }
        if (c23901 == null) {
            return abstractC12613;
        }
        c23901.f77274 = abstractC12613;
        m33976(abstractC12612, iMo6593);
        return abstractC12612;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 m33958(boolean z) {
        C22036 c22036 = this.f42993;
        EnumC19920 enumC19920 = c22036.f70640;
        int i = c22036.f70641;
        EnumC19920 enumC19921 = EnumC19920.f64412;
        if (enumC19920 == enumC19921) {
            AbstractC10370 abstractC10370Mo3194 = c22036.mo3194();
            m34012();
            return abstractC10370Mo3194;
        }
        EnumC19920 enumC19922 = EnumC19920.f64394;
        C6136 c6136 = this.f42980;
        C22364 c22364 = this.f42979;
        if (enumC19920 == enumC19922) {
            c22364.m7279(EnumC20043.SYNTAX, i, C6241.f19149);
            m34012();
            return c6136.f18855;
        }
        if (enumC19920 == EnumC19920.f64388) {
            c22364.m7279(EnumC20043.SYNTAX, i, C6241.f19253);
            m34012();
            return c6136.f18855;
        }
        if (enumC19920 == EnumC19920.f64383) {
            if (this.f43006) {
                m33978(EnumC10637.f31996);
                AbstractC10370 abstractC10370Mo3195 = this.f42993.mo3194();
                m34012();
                return abstractC10370Mo3195;
            }
            c22364.m7279(EnumC20043.SYNTAX, i, C6241.f19159);
            m34012();
            return c6136.f18855;
        }
        if (enumC19920 == EnumC19920.f64437) {
            if (EnumC10637.f31992.m26686(this.f42983)) {
                c22364.m7268(this.f42993.f70641, C14001.f42351);
            } else {
                c22364.m7279(EnumC20043.SYNTAX, this.f42993.f70641, C6241.f19262);
            }
            AbstractC10370 abstractC10370Mo3196 = this.f42993.mo3194();
            m34012();
            return abstractC10370Mo3196;
        }
        m33979(enumC19921);
        if (z && this.f42993.f70640 == EnumC19920.f64408) {
            m34012();
            return c6136.f18894;
        }
        return c6136.f18855;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34025(boolean z) {
        int i = this.f42993.f70641;
        C17013 c17013 = this.f42981;
        c17013.f52172 = i;
        C7673 c7673M39951 = c17013.m39951(m33958(false));
        AbstractC12117 abstractC12117 = this.f42989;
        AbstractC12612 abstractC12612 = (AbstractC12612) abstractC12117.mo29524(c7673M39951);
        while (true) {
            C22036 c22036 = this.f42993;
            if (c22036.f70640 != EnumC19920.f64405) {
                return abstractC12612;
            }
            int i2 = c22036.f70641;
            m34012();
            C2609 c2609M33949 = z ? m33949(EnumC18550.f57483) : null;
            c17013.f52172 = i2;
            abstractC12612 = (AbstractC12612) abstractC12117.mo29524(c17013.m39912(abstractC12612, m33958(false)));
            if (c2609M33949 != null && c2609M33949.m8249()) {
                c17013.f52172 = ((C17551) c2609M33949.f8240).f16085;
                abstractC12612 = (AbstractC12612) abstractC12117.mo29524(c17013.m39937(abstractC12612, c2609M33949));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x022b  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m33963(AbstractC10370 abstractC10370, int i) {
        char c;
        long j;
        AbstractC12612 abstractC12612M39944;
        int i2;
        int i3;
        Float fValueOf;
        Double dValueOf;
        int i4 = C12822.f38471[this.f42993.f70640.ordinal()];
        C22364 c22364 = this.f42979;
        C17013 c17013 = this.f42981;
        C3440 c3440 = this.f42982;
        switch (i4) {
            case 52:
                try {
                    c17013.f52172 = i;
                    EnumC9454 enumC9454 = EnumC9454.INT;
                    String strM33944 = m33944(abstractC10370);
                    int iMo21214 = this.f42993.mo21214();
                    if (iMo21214 == 10) {
                        i2 = Integer.parseInt(strM33944, iMo21214);
                    } else {
                        int i5 = Integer.MAX_VALUE / (iMo21214 / 2);
                        int i6 = 0;
                        for (char c2 : strM33944.toCharArray()) {
                            int iDigit = Character.digit(c2, iMo21214);
                            if (i6 < 0 || i6 > i5 || (i3 = i6 * iMo21214) > Integer.MAX_VALUE - iDigit) {
                                throw new NumberFormatException();
                            }
                            i6 = i3 + iDigit;
                        }
                        i2 = i6;
                    }
                    abstractC12612M39944 = c17013.m39944(enumC9454, Integer.valueOf(i2));
                } catch (NumberFormatException unused) {
                    EnumC20043 enumC20043 = EnumC20043.SYNTAX;
                    int i7 = this.f42993.f70641;
                    String strM33945 = m33944(abstractC10370);
                    C12281 c12281 = C6241.f19132;
                    c22364.m7279(enumC20043, i7, new C12281("compiler", "int.number.too.large", strM33945));
                    abstractC12612M39944 = c3440;
                }
                if (abstractC12612M39944 == c3440) {
                    c17013.f52172 = i;
                    abstractC12612M39944 = c17013.m39948();
                }
                m33976(abstractC12612M39944, this.f42993.f70639);
                m34012();
                return abstractC12612M39944;
            case 53:
                try {
                    c17013.f52172 = i;
                    EnumC9454 enumC9455 = EnumC9454.LONG;
                    String strM33946 = m33944(abstractC10370);
                    int iMo21215 = this.f42993.mo21214();
                    if (iMo21215 == 10) {
                        j = Long.parseLong(strM33946, iMo21215);
                    } else {
                        char[] charArray = strM33946.toCharArray();
                        long j2 = C13132.FOREVER_NS / ((long) (iMo21215 / 2));
                        int length = charArray.length;
                        int i8 = 0;
                        long j3 = 0;
                        while (i8 < length) {
                            int iDigit2 = Character.digit(charArray[i8], iMo21215);
                            if (j3 >= 0 && j3 <= j2) {
                                char[] cArr = charArray;
                                int i9 = length;
                                long j4 = j3 * ((long) iMo21215);
                                long j5 = iDigit2;
                                if (j4 <= C13132.FOREVER_NS - j5) {
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
                        abstractC12612M39944 = c17013.m39944(enumC9455, Long.valueOf(j));
                    } catch (NumberFormatException unused2) {
                        EnumC20043 enumC20044 = EnumC20043.SYNTAX;
                        int i10 = this.f42993.f70641;
                        String strM33947 = m33944(abstractC10370);
                        C12281 c12282 = C6241.f19132;
                        Object[] objArr = new Object[1];
                        objArr[c] = strM33947;
                        c22364.m7279(enumC20044, i10, new C12281("compiler", "int.number.too.large", objArr));
                        abstractC12612M39944 = c3440;
                    }
                    break;
                } catch (NumberFormatException unused3) {
                    c = 0;
                }
                if (abstractC12612M39944 == c3440) {
                    c17013.f52172 = i;
                    abstractC12612M39944 = c17013.m39948();
                }
                m33976(abstractC12612M39944, this.f42993.f70639);
                m34012();
                return abstractC12612M39944;
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                String strMo35462 = this.f42993.mo21214() == 16 ? "0x" + this.f42993.mo35462() : this.f42993.mo35462();
                try {
                    fValueOf = Float.valueOf(strMo35462);
                    break;
                } catch (NumberFormatException unused4) {
                    fValueOf = Float.valueOf(Float.NaN);
                }
                if (fValueOf.floatValue() != 0.0f || m33930(strMo35462)) {
                    if (fValueOf.floatValue() == Float.POSITIVE_INFINITY) {
                        c22364.m7279(EnumC20043.SYNTAX, this.f42993.f70641, C6241.f19236);
                    } else {
                        c17013.f52172 = i;
                        abstractC12612M39944 = c17013.m39944(EnumC9454.FLOAT, fValueOf);
                    }
                    if (abstractC12612M39944 == c3440) {
                        c17013.f52172 = i;
                        abstractC12612M39944 = c17013.m39948();
                    }
                    m33976(abstractC12612M39944, this.f42993.f70639);
                    m34012();
                    return abstractC12612M39944;
                }
                c22364.m7279(EnumC20043.SYNTAX, this.f42993.f70641, C6241.f19288);
                abstractC12612M39944 = c3440;
                if (abstractC12612M39944 == c3440) {
                    c17013.f52172 = i;
                    abstractC12612M39944 = c17013.m39948();
                }
                m33976(abstractC12612M39944, this.f42993.f70639);
                m34012();
                return abstractC12612M39944;
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                String strMo35463 = this.f42993.mo21214() == 16 ? "0x" + this.f42993.mo35462() : this.f42993.mo35462();
                try {
                    dValueOf = Double.valueOf(strMo35463);
                    break;
                } catch (NumberFormatException unused5) {
                    dValueOf = Double.valueOf(Double.NaN);
                }
                if (dValueOf.doubleValue() != 0.0d || m33930(strMo35463)) {
                    if (dValueOf.doubleValue() == Double.POSITIVE_INFINITY) {
                        c22364.m7279(EnumC20043.SYNTAX, this.f42993.f70641, C6241.f19236);
                    } else {
                        c17013.f52172 = i;
                        abstractC12612M39944 = c17013.m39944(EnumC9454.DOUBLE, dValueOf);
                    }
                    if (abstractC12612M39944 == c3440) {
                        c17013.f52172 = i;
                        abstractC12612M39944 = c17013.m39948();
                    }
                    m33976(abstractC12612M39944, this.f42993.f70639);
                    m34012();
                    return abstractC12612M39944;
                }
                c22364.m7279(EnumC20043.SYNTAX, this.f42993.f70641, C6241.f19288);
                abstractC12612M39944 = c3440;
                if (abstractC12612M39944 == c3440) {
                    c17013.f52172 = i;
                    abstractC12612M39944 = c17013.m39948();
                }
                m33976(abstractC12612M39944, this.f42993.f70639);
                m34012();
                return abstractC12612M39944;
            case 56:
                c17013.f52172 = i;
                abstractC12612M39944 = c17013.m39944(EnumC9454.CHAR, Integer.valueOf(this.f42993.mo35462().charAt(0)));
                if (abstractC12612M39944 == c3440) {
                    c17013.f52172 = i;
                    abstractC12612M39944 = c17013.m39948();
                }
                m33976(abstractC12612M39944, this.f42993.f70639);
                m34012();
                return abstractC12612M39944;
            case 57:
                c17013.f52172 = i;
                abstractC12612M39944 = c17013.m39944(EnumC9454.CLASS, this.f42993.mo35462());
                if (abstractC12612M39944 == c3440) {
                    c17013.f52172 = i;
                    abstractC12612M39944 = c17013.m39948();
                }
                m33976(abstractC12612M39944, this.f42993.f70639);
                m34012();
                return abstractC12612M39944;
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                c17013.f52172 = i;
                abstractC12612M39944 = c17013.m39944(EnumC9454.BOOLEAN, Integer.valueOf(this.f42993.f70640 != EnumC19920.f64425 ? 0 : 1));
                if (abstractC12612M39944 == c3440) {
                    c17013.f52172 = i;
                    abstractC12612M39944 = c17013.m39948();
                }
                m33976(abstractC12612M39944, this.f42993.f70639);
                m34012();
                return abstractC12612M39944;
            case 60:
                c17013.f52172 = i;
                abstractC12612M39944 = c17013.m39944(EnumC9454.BOT, (Object) null);
                if (abstractC12612M39944 == c3440) {
                    c17013.f52172 = i;
                    abstractC12612M39944 = c17013.m39948();
                }
                m33976(abstractC12612M39944, this.f42993.f70639);
                m34012();
                return abstractC12612M39944;
            default:
                C12171.m29636();
                throw null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m33930(String str) {
        char c;
        char[] charArray = str.toCharArray();
        int i = (charArray.length <= 1 || Character.toLowerCase(charArray[1]) != 'x') ? 10 : 16;
        int i2 = i == 16 ? 2 : 0;
        while (i2 < charArray.length && ((c = charArray[i2]) == '0' || c == '.')) {
            i2++;
        }
        return i2 >= charArray.length || Character.digit(charArray[i2], i) <= 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m33944(AbstractC10370 abstractC10370) {
        String strMo35462 = this.f42993.mo35462();
        if (abstractC10370.isEmpty()) {
            return strMo35462;
        }
        return ((Object) abstractC10370) + strMo35462;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC21932 m33970(int i, C2176 c2176, AbstractC12612 abstractC12612, boolean z) {
        AbstractC21932 abstractC21932;
        C22036 c22036 = this.f42993;
        EnumC19920 enumC19920 = c22036.f70640;
        EnumC19920 enumC19921 = EnumC19920.f64470;
        AbstractC12117 abstractC12117 = this.f42989;
        C17013 c17013 = this.f42981;
        if (enumC19920 == enumC19921 && abstractC12612 == null) {
            int i2 = c22036.f70641;
            m33979(enumC19921);
            AbstractC21932 abstractC21932M33970 = m33970(this.f42993.f70641, (C2176) null, (AbstractC12612) null, false);
            m33979(EnumC19920.f64413);
            c17013.f52172 = i2;
            C21227 c21227 = new C21227();
            c21227.f68420 = abstractC21932M33970;
            c21227.f16085 = c17013.f52172;
            abstractC21932 = (AbstractC21932) abstractC12117.mo29524(c21227);
        } else {
            if (c2176 == null) {
                c2176 = m33945(0L);
            }
            if (abstractC12612 == null) {
                abstractC12612 = m34014(34);
            }
            c17013.f52172 = this.f42993.f70641;
            C9378 c9378 = (C9378) abstractC12117.mo29524(c17013.m39920(c2176, m33958(false), abstractC12612, (AbstractC12612) null));
            c17013.f52172 = i;
            C16139 c16139 = new C16139();
            c16139.f49721 = c9378;
            c16139.f16085 = c17013.f52172;
            abstractC21932 = (AbstractC21932) abstractC12117.mo29524(c16139);
        }
        if (z || this.f42993.f70640 != EnumC19920.f64430) {
            return abstractC21932;
        }
        m33978(EnumC10637.f31989);
        m34012();
        AbstractC12612 abstractC12612M34014 = m34014(33);
        c17013.f52172 = i;
        C14022 c14022 = new C14022();
        c14022.f42404 = abstractC21932;
        c14022.f42403 = abstractC12612M34014;
        c14022.f16085 = c17013.f52172;
        return c14022;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34034(boolean z) {
        AbstractC12612 abstractC12612M34014 = m34014(2);
        AbstractC10370 abstractC10370M33957 = m33957(abstractC12612M34014, !z);
        if (abstractC10370M33957 != null && (!z || abstractC10370M33957 != this.f42980.f18888)) {
            int i = abstractC12612M34014.f16085;
            C12281 c12281 = C6241.f19132;
            m33997(i, new C12281("compiler", "restricted.type.not.allowed.here", abstractC10370M33957));
        }
        return abstractC12612M34014;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34014(int i) {
        int i2 = this.f42986;
        this.f42986 = i;
        AbstractC12612 abstractC12612M33992 = m33992();
        this.f43001 = this.f42986;
        this.f42986 = i2;
        return abstractC12612M33992;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m33992() {
        AbstractC12612 abstractC12612M34011 = m34011();
        if ((this.f42986 & 1) == 0) {
            return abstractC12612M34011;
        }
        EnumC19920 enumC19920 = this.f42993.f70640;
        return (enumC19920 == EnumC19920.f64431 || (EnumC19920.f64375.compareTo(enumC19920) <= 0 && this.f42993.f70640.compareTo(EnumC19920.f64467) <= 0)) ? m34010(abstractC12612M34011) : abstractC12612M34011;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34010(AbstractC12612 abstractC12612) {
        int i = C12822.f38471[this.f42993.f70640.ordinal()];
        C17013 c17013 = this.f42981;
        switch (i) {
            case 61:
                int i2 = this.f42993.f70641;
                m34012();
                m33942();
                AbstractC12612 abstractC12612M33992 = m33992();
                c17013.f52172 = i2;
                return (AbstractC12612) this.f42989.mo29524(c17013.m39941(abstractC12612, abstractC12612M33992));
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
                C22036 c22036 = this.f42993;
                int i3 = c22036.f70641;
                EnumC19920 enumC19920 = c22036.f70640;
                m34012();
                m33942();
                AbstractC12612 abstractC12612M33993 = m33992();
                c17013.f52172 = i3;
                return c17013.m39924(m33938(enumC19920), (AbstractC5144) abstractC12612, (AbstractC5144) abstractC12612M33993);
            default:
                return abstractC12612;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34023(AbstractC12612 abstractC12612) {
        C22036 c22036 = this.f42993;
        if (c22036.f70640 != EnumC19920.f64440) {
            return abstractC12612;
        }
        int i = c22036.f70641;
        m34012();
        AbstractC12612 abstractC12612M33992 = m33992();
        m33979(EnumC19920.f64377);
        AbstractC12612 abstractC12612M34011 = m34011();
        C17013 c17013 = this.f42981;
        c17013.f52172 = i;
        return c17013.m39916(abstractC12612, abstractC12612M33992, abstractC12612M34011);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34011() {
        AbstractC12612 abstractC12612M34030 = m34030();
        if ((this.f42986 & 1) != 0 && m33939(this.f42993.f70640) >= 4) {
            m33942();
            abstractC12612M34030 = m34020(abstractC12612M34030);
        }
        if ((this.f42986 & 1) == 0 || this.f42993.f70640 != EnumC19920.f64440) {
            return abstractC12612M34030;
        }
        m33942();
        return m34023(abstractC12612M34030);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33984(C18837 c18837, C18837 c18838) {
        if (c18837.isEmpty()) {
            return false;
        }
        if (c18837.size() == 1) {
            c18838.m43515((AbstractC12612) c18837.first());
            return false;
        }
        C23342 c23342 = (C23342) c18837.first();
        c23342.getClass();
        int iM19455 = C7260.m19455(c23342);
        C17013 c17013 = this.f42981;
        c17013.f52172 = iM19455;
        C23342 c23342M39944 = c17013.m39944(EnumC9454.CLASS, C5378.stream(c18837).map(new C7915(6)).collect(C22976.joining()));
        C23342 c23343 = (C23342) c18837.last();
        c23343.getClass();
        m33976(c23342M39944, C7260.m19431(c23343, this.f42989));
        c18838.m43515(c23342M39944);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m33931(AbstractC12612 abstractC12612, C18837 c18837, C18837 c18838, boolean z) {
        C23342 c23342;
        if (abstractC12612.m14709(EnumC18550.f57580)) {
            c23342 = (C23342) abstractC12612;
            if (c23342.f74996 != EnumC9454.CLASS) {
                c23342 = null;
            }
        } else {
            c23342 = null;
        }
        if (c23342 != null) {
            c18837.m43515(c23342);
            return z && m33984(c18837, c18838);
        }
        boolean zM33984 = m33984(c18837, c18838);
        c18837.clear();
        c18838.m43515(abstractC12612);
        return zM33984;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34020(AbstractC12612 abstractC12612) {
        C17013 c17013;
        AbstractC21932 abstractC21932M33970;
        AbstractC21932 abstractC21932M33929;
        ArrayList arrayList = this.f42988;
        boolean z = true;
        AbstractC12612[] abstractC12612Arr = arrayList.isEmpty() ? new AbstractC12612[11] : (AbstractC12612[]) C4248.m12790(arrayList, 1);
        ArrayList arrayList2 = this.f42995;
        C22036[] c22036Arr = arrayList2.isEmpty() ? new C22036[11] : (C22036[]) C4248.m12790(arrayList2, 1);
        boolean z2 = false;
        abstractC12612Arr[0] = abstractC12612;
        int i = this.f42993.f70641;
        C22036 c22036 = C4397.f14081;
        int i2 = 0;
        while (true) {
            int iM33939 = m33939(this.f42993.f70640);
            c17013 = this.f42981;
            if (iM33939 < 4) {
                break;
            }
            c22036Arr[i2] = c22036;
            C22036 c22037 = this.f42993;
            if (c22037.f70640 == EnumC19920.f64385) {
                int i3 = c22037.f70641;
                m34012();
                C22036 c22038 = this.f42993;
                EnumC19920 enumC19920 = c22038.f70640;
                int i4 = c22038.f70641;
                if (enumC19920 == EnumC19920.f64470) {
                    m33972(i4, EnumC10637.f31989);
                    abstractC21932M33970 = m33970(this.f42993.f70641, (C2176) null, (AbstractC12612) null, z);
                } else {
                    C2176 c2176M33945 = m33945(0L);
                    int i5 = this.f42993.f70641;
                    AbstractC12612 abstractC12612M34034 = m34034(z2);
                    C22036 c22039 = this.f42993;
                    if (c22039.f70640 == EnumC19920.f64412) {
                        m33972(c22039.f70641, EnumC10637.f31990);
                        abstractC21932M33970 = m33970(i4, c2176M33945, abstractC12612M34034, true);
                    } else {
                        long j = c2176M33945.f7169 & (-131073);
                        if (j != 0) {
                            long j2 = (-j) & j;
                            EnumC20043 enumC20043 = EnumC20043.SYNTAX;
                            EnumSet enumSetM45150 = C19642.m45150(j2);
                            C12281 c12281 = C6241.f19132;
                            this.f42979.m7279(enumC20043, i5, new C12281("compiler", "mod.not.allowed.here", enumSetM45150));
                        }
                        abstractC21932M33929 = abstractC12612M34034;
                        if (c2176M33945.f7168.m8249()) {
                            m33972(((C17551) c2176M33945.f7168.f8240).f16085, EnumC10637.f31996);
                            abstractC21932M33929 = m33929(abstractC12612M34034, c2176M33945.f7168.m8243(new Function() { // from class: l.ۗۖ۠
                                @Override // java.util.function.Function
                                /* JADX INFO: renamed from: andThen */
                                public /* synthetic */ Function mo22274andThen(Function function) {
                                    return C20696.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public /* synthetic */ Function compose(Function function) {
                                    return C20696.$default$compose(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    C17551 c17551 = (C17551) obj;
                                    C14273 c14273 = this.f9345;
                                    C17013 c17014 = c14273.f42981;
                                    c17014.f52172 = c17551.f16085;
                                    C17551 c17551M39966 = c17014.m39966(c17551.f53650, c17551.f53653);
                                    c14273.f42989.mo6594(c17551, c17551M39966);
                                    return c17551M39966;
                                }
                            }), false);
                        }
                    }
                    c17013.f52172 = i3;
                    AbstractC12612 abstractC12613 = abstractC12612Arr[i2];
                    C16286 c16286 = new C16286();
                    c16286.f50075 = abstractC12613;
                    c16286.f50076 = abstractC21932M33929;
                    c16286.f16085 = c17013.f52172;
                    abstractC12612Arr[i2] = c16286;
                    c22036 = c22036;
                }
                arrayList = arrayList;
                abstractC12612Arr = abstractC12612Arr;
                abstractC21932M33929 = abstractC21932M33970;
                c22036 = c22036;
                c17013.f52172 = i3;
                AbstractC12612 abstractC12614 = abstractC12612Arr[i2];
                C16286 c16287 = new C16286();
                c16287.f50075 = abstractC12614;
                c16287.f50076 = abstractC21932M33929;
                c16287.f16085 = c17013.f52172;
                abstractC12612Arr[i2] = c16287;
                c22036 = c22036;
            } else {
                arrayList = arrayList;
                abstractC12612Arr = abstractC12612Arr;
                m34012();
                i2++;
                abstractC12612Arr[i2] = m34030();
                c22036 = c22037;
            }
            while (i2 > 0 && m33939(c22036.f70640) >= m33939(this.f42993.f70640)) {
                int i6 = i2 - 1;
                c17013.f52172 = c22036.f70641;
                abstractC12612Arr[i6] = c17013.m39919(m33938(c22036.f70640), abstractC12612Arr[i6], abstractC12612Arr[i2]);
                i2--;
                c22036 = c22036Arr[i2];
            }
            z = true;
            z2 = false;
            arrayList = arrayList;
            abstractC12612Arr = abstractC12612Arr;
        }
        ArrayList arrayList3 = arrayList;
        AbstractC12612[] abstractC12612Arr2 = abstractC12612Arr;
        C12171.m29642(i2 == 0);
        AbstractC12612 abstractC12615 = abstractC12612Arr2[0];
        if (abstractC12615.m14709(EnumC18550.f57545) && this.f42994) {
            C18837 c18837 = new C18837();
            C18837 c18838 = new C18837();
            boolean zM33931 = false;
            AbstractC12612 abstractC12616 = abstractC12615;
            while (abstractC12616.m14709(EnumC18550.f57545)) {
                C9085 c9085 = (C9085) abstractC12616;
                zM33931 |= m33931(c9085.f27532, c18838, c18837, false);
                abstractC12616 = c9085.f27533;
            }
            if (m33931(abstractC12616, c18838, c18837, true) | zM33931) {
                C2609 c2609M43517 = c18837.m43517();
                AbstractC12612 abstractC12612M39919 = (AbstractC12612) c2609M43517.f8240;
                for (AbstractC12612 abstractC12617 : c2609M43517.f8241) {
                    abstractC12617.getClass();
                    c17013.f52172 = C7260.m19455(abstractC12617);
                    abstractC12612M39919 = c17013.m39919(m33938(EnumC19920.f64403), abstractC12612M39919, abstractC12617);
                    m33976(abstractC12612M39919, this.f42989.mo6593(abstractC12617));
                }
                abstractC12615 = abstractC12612M39919;
            }
        }
        arrayList3.add(abstractC12612Arr2);
        arrayList2.add(c22036Arr);
        return abstractC12615;
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
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final l.AbstractC12612 m34030() {
        /*
            Method dump skipped, instruction units count: 2850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14273.m34030():l.۫᩵۠");
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34024(AbstractC12612 abstractC12612, C2609 c2609) {
        C17013 c17013;
        AbstractC12117 abstractC12117;
        EnumC19920 enumC19920;
        if (c2609 != null) {
            m33994();
        }
        while (true) {
            int i = this.f42993.f70641;
            EnumC18550 enumC18550 = EnumC18550.f57483;
            C2609 c2609M33949 = m33949(enumC18550);
            EnumC19920 enumC19921 = this.f42993.f70640;
            EnumC19920 enumC19922 = EnumC19920.f64371;
            c17013 = this.f42981;
            abstractC12117 = this.f42989;
            if (enumC19921 == enumC19922) {
                m34012();
                int i2 = this.f42986;
                if ((i2 & 2) != 0) {
                    m33990();
                    if (this.f42993.f70640 == EnumC19920.f64400) {
                        m34012();
                        AbstractC12612 abstractC12612M33934 = m33934(abstractC12612);
                        c17013.f52172 = i;
                        abstractC12612 = (AbstractC12612) abstractC12117.mo29524(c17013.m39969(abstractC12612M33934));
                        if (this.f42993.f70640 != EnumC19920.f64444) {
                            if (!c2609M33949.m8249()) {
                                return abstractC12612;
                            }
                            c17013.f52172 = i;
                            return (AbstractC12612) abstractC12117.mo29524(c17013.m39937(abstractC12612, c2609M33949));
                        }
                        m33942();
                    } else {
                        this.f42986 = i2;
                    }
                }
                if ((this.f42986 & 1) != 0) {
                    m33942();
                    AbstractC12612 abstractC12612M33992 = m33992();
                    c17013.f52172 = i;
                    abstractC12612 = (AbstractC12612) abstractC12117.mo29523(c17013.m39956(abstractC12612, abstractC12612M33992));
                }
                m33979(EnumC19920.f64400);
            } else if (enumC19921 == EnumC19920.f64405) {
                m34012();
                C2609 c2609M34022 = m34022(1);
                EnumC19920 enumC19923 = this.f42993.f70640;
                if (enumC19923 == EnumC19920.f64474 && (this.f42986 & 1) != 0) {
                    m33942();
                    c17013.f52172 = i;
                    AbstractC12612 abstractC12613 = (AbstractC12612) abstractC12117.mo29523(c17013.m39912(abstractC12612, this.f42980.f18898));
                    m34012();
                    abstractC12612 = m33965(abstractC12613, c2609M34022);
                } else if (enumC19923 != EnumC19920.f64416 || (this.f42986 & 1) == 0) {
                    C2609 c2609M339410 = ((this.f42986 & 2) == 0 || enumC19923 != EnumC19920.f64432) ? null : m33949(enumC18550);
                    c17013.f52172 = i;
                    abstractC12612 = (AbstractC12612) abstractC12117.mo29524(c17013.m39912(abstractC12612, m33958(true)));
                    C22036 c22036 = this.f42993;
                    if (c22036.f70641 <= abstractC12117.f36194 && c22036.f70640 == EnumC19920.f64432) {
                        break;
                    }
                    if (c2609M339410 != null && c2609M339410.m8249()) {
                        c17013.f52172 = ((C17551) c2609M339410.f8240).f16085;
                        abstractC12612 = (AbstractC12612) abstractC12117.mo29524(c17013.m39937(abstractC12612, c2609M339410));
                    }
                    abstractC12612 = m34002(m34033(abstractC12612), c2609M34022);
                } else {
                    if (c2609M34022 != null) {
                        return m33994();
                    }
                    m33942();
                    int i3 = this.f42993.f70641;
                    m34012();
                    if (this.f42993.f70640 == EnumC19920.f64473) {
                        c2609M34022 = m34008(false);
                    }
                    abstractC12612 = m33968(i3, abstractC12612, c2609M34022);
                }
                c2609 = null;
            } else {
                if ((this.f42986 & 1) == 0 || enumC19921 != (enumC19920 = EnumC19920.f64444)) {
                    if (c2609M33949.isEmpty()) {
                        break;
                    }
                    if (!this.f43005) {
                        return m33951(((C17551) c2609M33949.f8240).f16085);
                    }
                    this.f42992 = c2609M33949;
                    break;
                }
                m33942();
                if (c2609 != null) {
                    return m33994();
                }
                m33979(enumC19920);
                abstractC12612 = m34015(abstractC12612);
            }
        }
        while (true) {
            EnumC19920 enumC19924 = this.f42993.f70640;
            EnumC19920 enumC19925 = EnumC19920.f64420;
            if ((enumC19924 != enumC19925 && enumC19924 != EnumC19920.f64471) || (this.f42986 & 1) == 0) {
                break;
            }
            m33942();
            C22036 c22037 = this.f42993;
            c17013.f52172 = c22037.f70641;
            abstractC12612 = (AbstractC12612) abstractC12117.mo29523(c17013.m39913(c22037.f70640 == enumC19925 ? EnumC18550.f57499 : EnumC18550.f57567, abstractC12612));
            m34012();
        }
        return (AbstractC12612) abstractC12117.mo29524(abstractC12612);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private int m33940(int i) {
        int i2 = i + 1;
        while (m33982(i2, EnumC19920.f64405)) {
            i2 += 2;
        }
        if (m33982(i2, EnumC19920.f64470)) {
            i2++;
            int i3 = 0;
            while (true) {
                int i4 = C12822.f38471[this.f42997.m7520(i2).f70640.ordinal()];
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m33962(int i, boolean z, boolean z2) {
        C2609<C9378> c2609M43517;
        C22364 c22364;
        char c;
        AbstractC10370 abstractC10370M33957;
        C12281 c12281;
        C17013 c17013 = this.f42981;
        boolean z3 = false;
        if (z2) {
            c2609M43517 = m33996(true, false);
        } else {
            if (z) {
                m33979(EnumC19920.f64470);
            }
            C18837 c18837 = new C18837();
            C22036 c22036 = this.f42993;
            EnumC19920 enumC19920 = c22036.f70640;
            if (enumC19920 != EnumC19920.f64413 && enumC19920 != EnumC19920.f64414) {
                c17013.f52172 = c22036.f70641;
                c18837.m43511(m33955(c17013.m39899(8589934592L), (AbstractC12612) null, true, false));
                while (this.f42993.f70640 == EnumC19920.f64384) {
                    m34012();
                    c17013.f52172 = this.f42993.f70641;
                    c18837.m43511(m33955(c17013.m39899(8589934592L), (AbstractC12612) null, true, false));
                }
            }
            if (z) {
                m33979(EnumC19920.f64413);
            }
            c2609M43517 = c18837.m43517();
        }
        if (z2) {
            C1574 c1574 = new C1574(this);
            Iterator it = c2609M43517.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c22364 = this.f42979;
                if (!zHasNext) {
                    c = 0;
                    break;
                }
                C9378 c9378 = (C9378) it.next();
                AbstractC12612 abstractC12612 = c9378.f28488;
                if (abstractC12612 == null || (abstractC10370M33957 = m33957(abstractC12612, z3)) == null || !c9378.f28488.m14709(EnumC18550.f57518)) {
                    c = 0;
                } else {
                    EnumC20043 enumC20043 = EnumC20043.SYNTAX;
                    int i2 = c9378.f16085;
                    c = 0;
                    if (EnumC10637.f31985.m26686(this.f42983)) {
                        C12281 c12282 = C6241.f19132;
                        c12281 = new C12281("compiler", "restricted.type.not.allowed.array", abstractC10370M33957);
                    } else {
                        C12281 c12283 = C6241.f19132;
                        c12281 = new C12281("compiler", "restricted.type.not.allowed.here", abstractC10370M33957);
                    }
                    c22364.m7279(enumC20043, i2, c12281);
                }
                c1574.m5391(c9378);
                if (c1574.f5578 == EnumC10747.ERROR) {
                    break;
                }
                z3 = false;
            }
            C11576 c11576 = c1574.f5577;
            if (c11576 != null) {
                EnumC20043 enumC20044 = EnumC20043.SYNTAX;
                C12281 c12284 = C6241.f19132;
                Object[] objArr = new Object[1];
                objArr[c] = c11576;
                c22364.m7279(enumC20044, i, new C12281("compiler", "invalid.lambda.parameter.declaration", objArr));
            }
            for (C9378 c9379 : c2609M43517) {
                AbstractC12612 abstractC12613 = c9379.f28488;
                if (abstractC12613 != null && m33957(abstractC12613, true) != null) {
                    m33972(c9379.f16085, EnumC10637.f31985);
                    c9379.f28485 = C7260.m19455(c9379.f28488);
                    c9379.f28488 = null;
                }
            }
        }
        m33978(EnumC10637.f32004);
        m33979(EnumC19920.f64414);
        C22036 c22037 = this.f42993;
        EnumC19920 enumC19921 = c22037.f70640;
        EnumC19920 enumC19922 = EnumC19920.f64392;
        AbstractC12117 abstractC12117 = this.f42989;
        if (enumC19921 == enumC19922) {
            C2735 c2735M33950 = m33950(c22037.f70641, 0L);
            c17013.f52172 = i;
            return (AbstractC12612) abstractC12117.mo29524(c17013.m39955(c2735M33950, c2609M43517));
        }
        AbstractC12612 abstractC12612M34014 = m34014(1);
        c17013.f52172 = i;
        return (AbstractC12612) abstractC12117.mo29524(c17013.m39955((AbstractC5144) abstractC12612M34014, c2609M43517));
    }

    static {
        C11576 c11576 = C11886.f35467;
        C11576 c11577 = C11886.f35464;
        C11576 c11578 = C11886.f35466;
        f42978 = new C11576[][]{new C11576[]{null, c11576, c11577}, new C11576[]{c11576, null, c11578}, new C11576[]{c11577, c11578, null}};
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34016(AbstractC12612 abstractC12612, C2609 c2609) {
        m34012();
        C22036 c22036 = this.f42993;
        EnumC19920 enumC19920 = c22036.f70640;
        if (enumC19920 == EnumC19920.f64470 || c2609 != null) {
            return m33965(abstractC12612, c2609);
        }
        EnumC19920 enumC19921 = EnumC19920.f64444;
        if (enumC19920 == enumC19921) {
            if (c2609 != null) {
                return m33994();
            }
            m33979(enumC19921);
            return m34015(abstractC12612);
        }
        int i = c22036.f70641;
        m33979(EnumC19920.f64405);
        C2609 c2609M34008 = this.f42993.f70640 == EnumC19920.f64473 ? m34008(false) : null;
        C17013 c17013 = this.f42981;
        c17013.f52172 = i;
        return m34002((AbstractC12612) this.f42989.mo29524(c17013.m39912(abstractC12612, m33958(false))), c2609M34008);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C2882 m34019() {
        EnumC9454 enumC9454;
        C22036 c22036 = this.f42993;
        int i = c22036.f70641;
        C17013 c17013 = this.f42981;
        c17013.f52172 = i;
        switch (C12822.f38471[c22036.f70640.ordinal()]) {
            case 22:
                enumC9454 = EnumC9454.BYTE;
                break;
            case 23:
                enumC9454 = EnumC9454.SHORT;
                break;
            case 24:
                enumC9454 = EnumC9454.CHAR;
                break;
            case 25:
                enumC9454 = EnumC9454.INT;
                break;
            case 26:
                enumC9454 = EnumC9454.LONG;
                break;
            case 27:
                enumC9454 = EnumC9454.FLOAT;
                break;
            case 28:
                enumC9454 = EnumC9454.DOUBLE;
                break;
            case 29:
                enumC9454 = EnumC9454.BOOLEAN;
                break;
            default:
                enumC9454 = EnumC9454.NONE;
                break;
        }
        C2882 c2882 = (C2882) this.f42989.mo29523(c17013.m39903(enumC9454));
        m34012();
        return c2882;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34002(AbstractC12612 abstractC12612, C2609 c2609) {
        if (((this.f42986 & 1) == 0 || this.f42993.f70640 != EnumC19920.f64470) && c2609 == null) {
            return abstractC12612;
        }
        m33942();
        return m33965(abstractC12612, c2609);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2609 m34013() {
        C18837 c18837 = new C18837();
        C22036 c22036 = this.f42993;
        EnumC19920 enumC19920 = c22036.f70640;
        EnumC19920 enumC19921 = EnumC19920.f64470;
        if (enumC19920 == enumC19921) {
            m34012();
            if (this.f42993.f70640 != EnumC19920.f64413) {
                c18837.m43511(m34014(1));
                while (this.f42993.f70640 == EnumC19920.f64384) {
                    m34012();
                    c18837.m43511(m34014(1));
                }
            }
            m33979(EnumC19920.f64413);
        } else {
            m33997(c22036.f70641, C6241.m17188(enumC19921));
        }
        return c18837.m43517();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m33965(AbstractC12612 abstractC12612, C2609 c2609) {
        int i = this.f42993.f70641;
        C2609 c2609M34013 = m34013();
        C17013 c17013 = this.f42981;
        c17013.f52172 = i;
        AbstractC5144 abstractC5144M39929 = c17013.m39929(abstractC12612, c2609, c2609M34013);
        if (abstractC12612.m14709(EnumC18550.f57566)) {
            C7673 c7673 = (C7673) abstractC12612;
            int i2 = c7673.f16085;
            if (c7673.f23696 == this.f42980.f18799) {
                boolean z = this.f42987;
                C22364 c22364 = this.f42979;
                if (z) {
                    c22364.m7280(EnumC20043.SYNTAX, abstractC12612, C6241.f19237);
                    abstractC5144M39929 = c17013.m39949(C2609.of((Object) abstractC5144M39929));
                } else {
                    c22364.m7268(i2, C14001.f42352);
                }
            }
        }
        return (AbstractC12612) this.f42989.mo29524(abstractC5144M39929);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34033(AbstractC12612 abstractC12612) {
        if (this.f42993.f70640 != EnumC19920.f64473) {
            return abstractC12612;
        }
        int i = this.f42986;
        if ((i & 2) == 0 || (i & 4) != 0) {
            return abstractC12612;
        }
        m33990();
        return m34003(abstractC12612, false);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2609 m34022(int i) {
        if (this.f42993.f70640 != EnumC19920.f64473) {
            return null;
        }
        int i2 = this.f42986;
        if ((i2 & i) == 0 || (i2 & 4) != 0) {
            m33994();
        }
        this.f42986 = i;
        return m34008(false);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C2609 m34008(boolean z) {
        EnumC19920 enumC19920;
        C22036 c22036 = this.f42993;
        EnumC19920 enumC19921 = c22036.f70640;
        EnumC19920 enumC19922 = EnumC19920.f64473;
        if (enumC19921 == enumC19922) {
            m34012();
            if (this.f42993.f70640 == EnumC19920.f64454 && z) {
                m33978(EnumC10637.f31994);
                this.f42986 |= 16;
                m34012();
                return C2609.m8239();
            }
            C18837 c18837 = new C18837();
            c18837.m43511((this.f42986 & 1) == 0 ? m34031() : m34017(false));
            while (true) {
                enumC19920 = this.f42993.f70640;
                if (enumC19920 != EnumC19920.f64384) {
                    break;
                }
                m34012();
                c18837.m43511((this.f42986 & 1) == 0 ? m34031() : m34017(false));
            }
            int i = C12822.f38471[enumC19920.ordinal()];
            if (i == 71 || i == 72 || i == 93) {
                this.f42993 = this.f42997.m7522();
            } else {
                switch (i) {
                    case 89:
                    case 90:
                        this.f42993 = this.f42997.m7522();
                        break;
                    case 91:
                        m34012();
                        break;
                    default:
                        c18837.m43511(m33997(this.f42993.f70641, C6241.m17188(EnumC19920.f64454)));
                        break;
                }
            }
            return c18837.m43517();
        }
        return C2609.of((Object) m33997(c22036.f70641, C6241.m17188(enumC19922)));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C16432 m34003(AbstractC12612 abstractC12612, boolean z) {
        int i = this.f42993.f70641;
        C2609 c2609M34008 = m34008(z);
        C17013 c17013 = this.f42981;
        c17013.f52172 = i;
        return (C16432) this.f42989.mo29524(c17013.m39960(abstractC12612, c2609M34008));
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private AbstractC12612 m33934(AbstractC12612 abstractC12612) {
        return m33941(abstractC12612, C2609.m8239());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private AbstractC12612 m33936(int i, AbstractC12612 abstractC12612, C2609 c2609) {
        m33979(EnumC19920.f64400);
        AbstractC12612 abstractC12612M33934 = m33934(abstractC12612);
        C17013 c17013 = this.f42981;
        c17013.f52172 = i;
        C23901 c23901M39969 = c17013.m39969(abstractC12612M33934);
        AbstractC12117 abstractC12117 = this.f42989;
        AbstractC12612 abstractC12613 = (AbstractC12612) abstractC12117.mo29524(c23901M39969);
        if (!c2609.m8249()) {
            return abstractC12613;
        }
        c17013.f52172 = i;
        return (AbstractC12612) abstractC12117.mo29524(c17013.m39937(abstractC12613, c2609));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m33964(AbstractC12612 abstractC12612) {
        AbstractC10370 abstractC10370Mo3194;
        int i = this.f42986;
        if ((i & 1) == 0 || this.f42993.f70640 != EnumC19920.f64405) {
            if ((i & 2) != 0) {
                if (this.f42993.f70640 != EnumC19920.f64444) {
                    m33990();
                    return abstractC12612;
                }
            } else {
                C22036 c22036 = this.f42993;
                if (c22036.f70640 != EnumC19920.f64444) {
                    m33997(c22036.f70641, C6241.f19209);
                }
            }
            return abstractC12612;
        }
        m33942();
        int i2 = this.f42993.f70641;
        m34012();
        m33979(EnumC19920.f64408);
        C22036 c22037 = this.f42993;
        int i3 = c22037.f70641;
        AbstractC12117 abstractC12117 = this.f42989;
        int i4 = abstractC12117.f36194;
        C17013 c17013 = this.f42981;
        C6136 c6136 = this.f42980;
        if (i3 == i4) {
            if (this.f42991.test(c22037.f70640)) {
                abstractC10370Mo3194 = this.f42993.mo3194();
                m34012();
            } else {
                abstractC10370Mo3194 = c6136.f18855;
            }
            c17013.f52172 = i2;
            return c17013.m39949(C2609.of((Object) abstractC12117.mo29524(c17013.m39912(abstractC12612, abstractC10370Mo3194))));
        }
        EnumC18550 enumC18550Mo989 = abstractC12612.mo989();
        if ((enumC18550Mo989 == EnumC18550.f57518 && C7260.m19460((AbstractC5144) abstractC12612)) || enumC18550Mo989 == EnumC18550.f57497) {
            m33997(this.f42993.f70641, C6241.f19284);
        }
        c17013.f52172 = i2;
        return (AbstractC12612) abstractC12117.mo29524(c17013.m39912(abstractC12612, c6136.f18894));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34015(AbstractC12612 abstractC12612) {
        EnumC11091 enumC11091;
        AbstractC10370 abstractC10370M33958;
        m33978(EnumC10637.f31986);
        m33942();
        C2609 c2609M34008 = this.f42993.f70640 == EnumC19920.f64473 ? m34008(false) : null;
        if (this.f42993.f70640 == EnumC19920.f64416) {
            enumC11091 = EnumC11091.NEW;
            abstractC10370M33958 = this.f42980.f18879;
            m34012();
        } else {
            enumC11091 = EnumC11091.INVOKE;
            abstractC10370M33958 = m33958(false);
        }
        abstractC12612.getClass();
        int iM19455 = C7260.m19455(abstractC12612);
        C17013 c17013 = this.f42981;
        c17013.f52172 = iM19455;
        C9232 c9232 = new C9232(enumC11091, abstractC10370M33958, abstractC12612, c2609M34008);
        c9232.f16085 = c17013.f52172;
        return (AbstractC12612) this.f42989.mo29524(c9232);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19110 m33969(int i, AbstractC12612 abstractC12612, C2609 c2609, AbstractC12612 abstractC12613) {
        C5557 c5557;
        C2609 c2609M34013 = m34013();
        C22036 c22036 = this.f42993;
        EnumC19920 enumC19920 = c22036.f70640;
        EnumC19920 enumC19921 = EnumC19920.f64392;
        AbstractC12117 abstractC12117 = this.f42989;
        C17013 c17013 = this.f42981;
        if (enumC19920 == enumC19921) {
            int i2 = c22036.f70641;
            C2609 c2609M33948 = m33948(this.f42980.f18867, false, false);
            c17013.f52172 = -1;
            C2176 c2176M39899 = c17013.m39899(0L);
            c17013.f52172 = i2;
            c5557 = (C5557) abstractC12117.mo29524(c17013.m39907(c2176M39899, c2609M33948));
        } else {
            c5557 = null;
        }
        c17013.f52172 = i;
        return (C19110) abstractC12117.mo29524(c17013.m39939(abstractC12612, c2609, abstractC12613, c2609M34013, c5557, false));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34000(int i, AbstractC12612 abstractC12612) {
        C2609 c2609M34021 = m34021();
        C17013 c17013 = this.f42981;
        c17013.f52172 = i;
        return (AbstractC12612) this.f42989.mo29524(c17013.m39958(abstractC12612, C2609.m8239(), c2609M34021));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2609 m34021() {
        m33979(EnumC19920.f64392);
        C18837 c18837 = new C18837();
        EnumC19920 enumC19920 = this.f42993.f70640;
        if (enumC19920 == EnumC19920.f64384) {
            m34012();
        } else if (enumC19920 != EnumC19920.f64481) {
            c18837.m43511(m34006());
            while (this.f42993.f70640 == EnumC19920.f64384) {
                m34012();
                if (this.f42993.f70640 == EnumC19920.f64481) {
                    break;
                }
                c18837.m43511(m34006());
            }
        }
        m33979(EnumC19920.f64481);
        return c18837.m43517();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34006() {
        C22036 c22036 = this.f42993;
        return c22036.f70640 == EnumC19920.f64392 ? m34000(c22036.f70641, (AbstractC12612) null) : m34014(1);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m33986() {
        int i = this.f42993.f70641;
        m33979(EnumC19920.f64470);
        AbstractC12612 abstractC12612M34014 = m34014(1);
        m33979(EnumC19920.f64413);
        C17013 c17013 = this.f42981;
        c17013.f52172 = i;
        C14875 c14875 = new C14875();
        c14875.f45392 = abstractC12612M34014;
        c14875.f16085 = c17013.f52172;
        return (AbstractC12612) this.f42989.mo29524(c14875);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2735 m33950(int i, long j) {
        m33979(EnumC19920.f64392);
        C2609 c2609M33991 = m33991();
        C17013 c17013 = this.f42981;
        c17013.f52172 = i;
        C2735 c2735M39902 = c17013.m39902(j, c2609M33991);
        while (true) {
            C22036 c22036 = this.f42993;
            EnumC19920 enumC19920 = c22036.f70640;
            int i2 = c22036.f70641;
            if (enumC19920 == EnumC19920.f64479 || enumC19920 == EnumC19920.f64391) {
                C12281 c12281 = C6241.f19132;
                m33997(i2, new C12281("compiler", "orphaned", enumC19920));
                m33943();
            } else {
                c2735M39902.f8520 = i2;
                m33979(EnumC19920.f64481);
                return (C2735) this.f42989.mo29524(c2735M39902);
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C2735 m34009() {
        return m33950(this.f42993.f70641, 0L);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C2609 m33991() {
        C18837 c18837 = new C18837();
        int i = -1;
        while (true) {
            C2609 c2609M34032 = m34032();
            if (c2609M34032.isEmpty()) {
                return c18837.m43517();
            }
            int i2 = this.f42993.f70641;
            if (i2 == i) {
                return c18837.m43517();
            }
            if (i2 <= this.f42989.f36194) {
                m33981(false, true, true, true);
                i = this.f42993.f70641;
            }
            c18837.addAll(c2609M34032);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC11349 m34026() {
        C12281 c12281;
        int i = this.f42993.f70641;
        C2609 c2609M34032 = m34032();
        boolean zIsEmpty = c2609M34032.isEmpty();
        AbstractC12117 abstractC12117 = this.f42989;
        C17013 c17013 = this.f42981;
        if (zIsEmpty) {
            C3440 c3440M33997 = m33997(i, C6241.f19134);
            c17013.f52172 = i;
            return (AbstractC11349) abstractC12117.mo29524(c17013.m39953(c3440M33997));
        }
        AbstractC11349 abstractC11349 = (AbstractC11349) c2609M34032.f8240;
        int i2 = C12822.f38472[abstractC11349.mo989().ordinal()];
        if (i2 == 3) {
            c12281 = C6241.f19144;
        } else {
            c12281 = i2 != 4 ? null : C6241.f19142;
        }
        if (c12281 == null) {
            return abstractC11349;
        }
        this.f42979.m7280(EnumC20043.SYNTAX, abstractC11349, c12281);
        c17013.f52172 = abstractC11349.f16085;
        C2609 c2609Of = C2609.of((Object) c17013.m39902(0L, c2609M34032));
        c17013.f52172 = abstractC11349.f16085;
        return (AbstractC11349) abstractC12117.mo29524(c17013.m39953(c17013.m39949(c2609Of)));
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
    
        if (r6.m7520(1).f70640 != l.EnumC19920.f64410) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f3, code lost:
    
        if (r6.m7520(2).f70640 != l.EnumC19920.f64410) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0129, code lost:
    
        if (r7 == l.EnumC19920.f64414) goto L76;
     */
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2609 m34032() {
        Object objM34009;
        Object obj;
        AbstractC12612 abstractC12612;
        long j;
        C2609 c2609M43517;
        AbstractC12612 abstractC12612M34014;
        C22036 c22036;
        EnumC19920 enumC19920;
        EnumC19920 enumC19921;
        C2609 c2609M43518;
        C9378 c9378;
        EnumC19920 enumC19922;
        EnumC19920 enumC19923;
        C2735 c2735M34009;
        C22036 c22037 = this.f42993;
        int i = c22037.f70641;
        int[] iArr = C12822.f38471;
        int i2 = iArr[c22037.f70640.ordinal()];
        C18411 c18411 = this.f42991;
        boolean z = false;
        C6136 c6136 = this.f42980;
        AbstractC12117 abstractC12117 = this.f42989;
        C22364 c22364 = this.f42979;
        C17013 c17013 = this.f42981;
        if (i2 != 1 && i2 != 51 && i2 != 11) {
            if (i2 != 12) {
                if (i2 != 19) {
                    if (i2 != 20) {
                        boolean z2 = this.f42999;
                        switch (i2) {
                            case 3:
                            case 5:
                                C22036 c22038 = this.f42993;
                                EnumC0162 enumC0162 = EnumC0162.LINE;
                                InterfaceC5102 interfaceC5102M49578 = c22038.m49578();
                                C2176 c2176M33946 = m33946((C2176) null);
                                EnumC19920 enumC19924 = this.f42993.f70640;
                                return (enumC19924 == EnumC19920.f64460 || enumC19924 == EnumC19920.f64408 || enumC19924 == EnumC19920.f64388 || m33993()) ? C2609.of((Object) m33959(c2176M33946, interfaceC5102M49578)) : m33926(c2176M33946, m34017(true));
                            case 4:
                                break;
                            case 6:
                                break;
                            case 7:
                            case 8:
                                C22036 c22039 = this.f42993;
                                EnumC0162 enumC0163 = EnumC0162.LINE;
                                return C2609.of((Object) m33959(m33946((C2176) null), c22039.m49578()));
                            case 9:
                                if (!z2) {
                                    c22364.m7279(EnumC20043.SYNTAX, this.f42993.f70641, C6241.f19211);
                                }
                                C22036 c220310 = this.f42993;
                                EnumC0162 enumC0164 = EnumC0162.LINE;
                                return C2609.of((Object) m33959(m33946((C2176) null), c220310.m49578()));
                            default:
                                switch (i2) {
                                    case 32:
                                        AbstractC10370 abstractC10370Mo3194 = this.f42993.mo3194();
                                        AbstractC10370 abstractC10370 = c6136.f18799;
                                        C2280 c2280 = this.f42997;
                                        if (abstractC10370Mo3194 == abstractC10370 && this.f42987) {
                                            int i3 = iArr[c2280.m7520(1).f70640.ordinal()];
                                            if (i3 != 1 && i3 != 32 && i3 != 40) {
                                                if (i3 == 74) {
                                                    int i4 = 2;
                                                    int i5 = 1;
                                                    while (true) {
                                                        EnumC19920 enumC19925 = c2280.m7520(i4).f70640;
                                                        if (enumC19925 != EnumC19920.f64381 && i5 != 0) {
                                                            int i6 = C12822.f38471[enumC19925.ordinal()];
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
                                                                    m34012();
                                                                    AbstractC12612 abstractC12612M34015 = m34014(1);
                                                                    m33979(EnumC19920.f64410);
                                                                    c17013.f52172 = i;
                                                                    return C2609.of(abstractC12117.mo29524(c17013.m39959(abstractC12612M34015)));
                                                            }
                                                        case 48:
                                                        case 49:
                                                        case 50:
                                                            m34012();
                                                            AbstractC12612 abstractC12612M34016 = m34014(1);
                                                            m33979(EnumC19920.f64410);
                                                            c17013.f52172 = i;
                                                            return C2609.of(abstractC12117.mo29524(c17013.m39959(abstractC12612M34016)));
                                                    }
                                                }
                                            }
                                            m34012();
                                            AbstractC12612 abstractC12612M34017 = m34014(1);
                                            m33979(EnumC19920.f64410);
                                            c17013.f52172 = i;
                                            return C2609.of(abstractC12117.mo29524(c17013.m39959(abstractC12612M34017)));
                                        }
                                        if (m33985(this.f42993, 0) ? m33932(c2280.m7520(3), true, true) : false) {
                                            c22364.m7269(this.f42993.f70641, C6241.f19245);
                                            m34012();
                                            m34012();
                                            m34012();
                                            C2176 c2176M33947 = m33946((C2176) null);
                                            C22036 c220311 = this.f42993;
                                            EnumC0162 enumC0165 = EnumC0162.LINE;
                                            return C2609.of((Object) m33959(c2176M33947, c220311.m49578()));
                                        }
                                        if (m34005(true)) {
                                            m33978(EnumC10637.f31988);
                                            c22364.m7269(this.f42993.f70641, C6241.f19245);
                                            m34012();
                                            C2176 c2176M33948 = m33946((C2176) null);
                                            C22036 c220312 = this.f42993;
                                            EnumC0162 enumC0166 = EnumC0162.LINE;
                                            return C2609.of((Object) m33959(c2176M33948, c220312.m49578()));
                                        }
                                        break;
                                }
                                if (m33993() && z2) {
                                    C22036 c220313 = this.f42993;
                                    EnumC0162 enumC0167 = EnumC0162.LINE;
                                    InterfaceC5102 interfaceC5102M49579 = c220313.m49578();
                                    c17013.f52172 = i;
                                    return C2609.of((Object) m33998(c17013.m39899(0L), interfaceC5102M49579));
                                }
                                C22036 c220314 = this.f42993;
                                AbstractC12612 abstractC12612M34018 = m34014(3);
                                if (this.f42993.f70640 == EnumC19920.f64377 && abstractC12612M34018.m14709(EnumC18550.f57566)) {
                                    m34012();
                                    AbstractC11349 abstractC11349M34026 = m34026();
                                    c17013.f52172 = i;
                                    AbstractC10370 abstractC10370Mo3195 = c220314.mo3194();
                                    C17698 c17698 = new C17698();
                                    c17698.f54160 = abstractC10370Mo3195;
                                    c17698.f54159 = abstractC11349M34026;
                                    c17698.f16085 = c17013.f52172;
                                    return C2609.of((Object) c17698);
                                }
                                if ((this.f43001 & 2) == 0 || !c18411.test(this.f42993.f70640)) {
                                    AbstractC12612 abstractC12612M34001 = m34001(abstractC12612M34018);
                                    m33979(EnumC19920.f64410);
                                    c17013.f52172 = i;
                                    return C2609.of(abstractC12117.mo29524(c17013.m39953(abstractC12612M34001)));
                                }
                                int i7 = this.f42993.f70641;
                                c17013.f52172 = -1;
                                C2176 c2176M39899 = c17013.m39899(0L);
                                c17013.f52172 = i7;
                                return m33926(c2176M39899, abstractC12612M34018);
                        }
                    }
                    C22036 c220315 = this.f42993;
                    EnumC0162 enumC0168 = EnumC0162.LINE;
                    return C2609.of((Object) m33959(m33946((C2176) null), c220315.m49578()));
                }
            }
            return C2609.m8239();
        }
        C22036 c220316 = this.f42993;
        int i8 = c220316.f70641;
        int i9 = iArr[c220316.f70640.ordinal()];
        if (i9 == 1) {
            m34012();
            c17013.f52172 = i8;
            objM34009 = (AbstractC11349) abstractC12117.mo29524(c17013.m39963());
        } else if (i9 != 11) {
            if (i9 == 19) {
                m34012();
                AbstractC12612 abstractC12612M33986 = m33986();
                C2735 c2735M340010 = m34009();
                c17013.f52172 = i8;
                C7115 c7115 = new C7115();
                c7115.f21831 = abstractC12612M33986;
                c7115.f21830 = c2735M340010;
                c7115.f16085 = c17013.f52172;
                obj = c7115;
            } else if (i9 != 51) {
                switch (i9) {
                    case 35:
                        AbstractC11349 abstractC11349M34027 = null;
                        m34012();
                        AbstractC12612 abstractC12612M33987 = m33986();
                        AbstractC11349 abstractC11349M34028 = m34026();
                        if (this.f42993.f70640 == EnumC19920.f64463) {
                            m34012();
                            abstractC11349M34027 = m34026();
                        }
                        c17013.f52172 = i8;
                        objM34009 = c17013.m39898(abstractC12612M33987, abstractC11349M34028, abstractC11349M34027);
                        break;
                    case 36:
                        m34012();
                        m33979(EnumC19920.f64470);
                        EnumC19920 enumC19926 = this.f42993.f70640;
                        EnumC19920 enumC19927 = EnumC19920.f64410;
                        if (enumC19926 != enumC19927) {
                            C18837 c18837 = new C18837();
                            C22036 c220317 = this.f42993;
                            int i10 = c220317.f70641;
                            EnumC19920 enumC19928 = c220317.f70640;
                            if (enumC19928 != EnumC19920.f64476) {
                                if (enumC19928 == EnumC19920.f64432) {
                                    j = 0;
                                    abstractC12612 = null;
                                } else {
                                    AbstractC12612 abstractC12612M34019 = m34014(3);
                                    if ((this.f43001 & 2) != 0 && c18411.test(this.f42993.f70640)) {
                                        m33971(this.f42993.f70641, m33946((C2176) null), abstractC12612M34019, m33958(false), false, (InterfaceC5102) null, c18837, true);
                                        c2609M43517 = c18837.m43517();
                                    } else if ((this.f43001 & 2) == 0 || this.f42993.f70640 != EnumC19920.f64377) {
                                        abstractC12612M34014 = null;
                                        m33974(i10, abstractC12612M34019, c18837);
                                        c2609M43517 = c18837.m43517();
                                    } else {
                                        EnumC20043 enumC20043 = EnumC20043.SYNTAX;
                                        C12281 c12281 = C6241.f19132;
                                        c22364.m7279(enumC20043, i10, new C12281("compiler", "bad.initializer", "for-loop"));
                                        c17013.f52172 = i10;
                                        abstractC12612M34014 = null;
                                        c2609M43517 = C2609.of((Object) c17013.m39920(m33946((C2176) null), c6136.f18855, abstractC12612M34019, (AbstractC12612) null));
                                    }
                                }
                                if (c2609M43517.m8245() == 1 && ((AbstractC11349) c2609M43517.f8240).m14709(EnumC18550.f57578)) {
                                    c9378 = (C9378) c2609M43517.f8240;
                                    if (c9378.f28487 == null) {
                                        enumC19922 = this.f42993.f70640;
                                        enumC19923 = EnumC19920.f64377;
                                        if (enumC19922 == enumC19923) {
                                            m33979(enumC19923);
                                            AbstractC12612 abstractC12612M340110 = m34014(1);
                                            m33979(EnumC19920.f64413);
                                            AbstractC11349 abstractC11349M34029 = m34026();
                                            c17013.f52172 = i8;
                                            C4851 c4851 = new C4851();
                                            c4851.f15325 = c9378;
                                            c4851.f15326 = abstractC12612M340110;
                                            c4851.f15324 = abstractC11349M34029;
                                            c4851.f16085 = c17013.f52172;
                                            obj = c4851;
                                        }
                                    }
                                }
                                m33979(enumC19927);
                                if (this.f42993.f70640 != enumC19927) {
                                    abstractC12612M34014 = m34014(1);
                                }
                                m33979(enumC19927);
                                c22036 = this.f42993;
                                enumC19920 = c22036.f70640;
                                enumC19921 = EnumC19920.f64413;
                                if (enumC19920 == enumC19921) {
                                    c2609M43518 = C2609.m8239();
                                } else {
                                    int i11 = c22036.f70641;
                                    AbstractC12612 abstractC12612M340111 = m34014(1);
                                    C18837 c18838 = new C18837();
                                    m33974(i11, abstractC12612M340111, c18838);
                                    c2609M43518 = c18838.m43517();
                                }
                                m33979(enumC19921);
                                AbstractC11349 abstractC11349M340210 = m34026();
                                c17013.f52172 = i8;
                                objM34009 = c17013.m39926(c2609M43517, abstractC12612M34014, c2609M43518, abstractC11349M340210);
                            } else {
                                abstractC12612 = null;
                                j = 0;
                            }
                            m33971(this.f42993.f70641, m33945(j), m34017(true), m33958(false), false, (InterfaceC5102) null, c18837, true);
                            c2609M43517 = c18837.m43517();
                            abstractC12612M34014 = abstractC12612;
                            if (c2609M43517.m8245() == 1) {
                                c9378 = (C9378) c2609M43517.f8240;
                                if (c9378.f28487 == null) {
                                    enumC19922 = this.f42993.f70640;
                                    enumC19923 = EnumC19920.f64377;
                                    if (enumC19922 == enumC19923) {
                                        m33979(enumC19923);
                                        AbstractC12612 abstractC12612M340112 = m34014(1);
                                        m33979(EnumC19920.f64413);
                                        AbstractC11349 abstractC11349M340211 = m34026();
                                        c17013.f52172 = i8;
                                        C4851 c4852 = new C4851();
                                        c4852.f15325 = c9378;
                                        c4852.f15326 = abstractC12612M340112;
                                        c4852.f15324 = abstractC11349M340211;
                                        c4852.f16085 = c17013.f52172;
                                        obj = c4852;
                                    }
                                }
                            }
                            m33979(enumC19927);
                            if (this.f42993.f70640 != enumC19927) {
                                abstractC12612M34014 = m34014(1);
                            }
                            m33979(enumC19927);
                            c22036 = this.f42993;
                            enumC19920 = c22036.f70640;
                            enumC19921 = EnumC19920.f64413;
                            if (enumC19920 == enumC19921) {
                                c2609M43518 = C2609.m8239();
                            } else {
                                int i12 = c22036.f70641;
                                AbstractC12612 abstractC12612M340113 = m34014(1);
                                C18837 c18839 = new C18837();
                                m33974(i12, abstractC12612M340113, c18839);
                                c2609M43518 = c18839.m43517();
                            }
                            m33979(enumC19921);
                            AbstractC11349 abstractC11349M340212 = m34026();
                            c17013.f52172 = i8;
                            objM34009 = c17013.m39926(c2609M43517, abstractC12612M34014, c2609M43518, abstractC11349M340212);
                        } else {
                            c2609M43517 = C2609.m8239();
                        }
                        abstractC12612M34014 = null;
                        if (c2609M43517.m8245() == 1) {
                            c9378 = (C9378) c2609M43517.f8240;
                            if (c9378.f28487 == null) {
                                enumC19922 = this.f42993.f70640;
                                enumC19923 = EnumC19920.f64377;
                                if (enumC19922 == enumC19923) {
                                    m33979(enumC19923);
                                    AbstractC12612 abstractC12612M340114 = m34014(1);
                                    m33979(EnumC19920.f64413);
                                    AbstractC11349 abstractC11349M340213 = m34026();
                                    c17013.f52172 = i8;
                                    C4851 c4853 = new C4851();
                                    c4853.f15325 = c9378;
                                    c4853.f15326 = abstractC12612M340114;
                                    c4853.f15324 = abstractC11349M340213;
                                    c4853.f16085 = c17013.f52172;
                                    obj = c4853;
                                }
                            }
                        }
                        m33979(enumC19927);
                        if (this.f42993.f70640 != enumC19927) {
                            abstractC12612M34014 = m34014(1);
                        }
                        m33979(enumC19927);
                        c22036 = this.f42993;
                        enumC19920 = c22036.f70640;
                        enumC19921 = EnumC19920.f64413;
                        if (enumC19920 == enumC19921) {
                            c2609M43518 = C2609.m8239();
                        } else {
                            int i13 = c22036.f70641;
                            AbstractC12612 abstractC12612M340115 = m34014(1);
                            C18837 c188310 = new C18837();
                            m33974(i13, abstractC12612M340115, c188310);
                            c2609M43518 = c188310.m43517();
                        }
                        m33979(enumC19921);
                        AbstractC11349 abstractC11349M340214 = m34026();
                        c17013.f52172 = i8;
                        objM34009 = c17013.m39926(c2609M43517, abstractC12612M34014, c2609M43518, abstractC11349M340214);
                        break;
                    case 37:
                        m34012();
                        AbstractC12612 abstractC12612M33988 = m33986();
                        AbstractC11349 abstractC11349M340215 = m34026();
                        c17013.f52172 = i8;
                        C8672 c8672 = new C8672();
                        c8672.f26445 = abstractC12612M33988;
                        c8672.f26444 = abstractC11349M340215;
                        c8672.f16085 = c17013.f52172;
                        obj = c8672;
                        break;
                    case 38:
                        m34012();
                        AbstractC11349 abstractC11349M340216 = m34026();
                        m33979(EnumC19920.f64421);
                        AbstractC12612 abstractC12612M33989 = m33986();
                        m33979(EnumC19920.f64410);
                        c17013.f52172 = i8;
                        C20374 c20374 = new C20374();
                        c20374.f65770 = abstractC11349M340216;
                        c20374.f65771 = abstractC12612M33989;
                        c20374.f16085 = c17013.f52172;
                        objM34009 = (C20374) abstractC12117.mo29524(c20374);
                        break;
                    case 39:
                        m34012();
                        C2609 c2609M8239 = C2609.m8239();
                        if (this.f42993.f70640 == EnumC19920.f64470) {
                            m34012();
                            C18837 c188311 = new C18837();
                            c188311.m43511(m34027());
                            while (this.f42993.f70640 == EnumC19920.f64410) {
                                m33976((AbstractC5144) c188311.last(), this.f42993.f70639);
                                int i14 = this.f42993.f70641;
                                m34012();
                                if (this.f42993.f70640 == EnumC19920.f64413) {
                                    c2609M8239 = c188311.m43517();
                                    m33979(EnumC19920.f64413);
                                } else {
                                    c188311.m43511(m34027());
                                }
                            }
                            c2609M8239 = c188311.m43517();
                            m33979(EnumC19920.f64413);
                        }
                        C2735 c2735M340011 = m34009();
                        C18837 c188312 = new C18837();
                        EnumC19920 enumC19929 = this.f42993.f70640;
                        if (enumC19929 == EnumC19920.f64398 || enumC19929 == EnumC19920.f64435) {
                            while (true) {
                                EnumC19920 enumC199210 = this.f42993.f70640;
                                if (enumC199210 != EnumC19920.f64398) {
                                    if (enumC199210 == EnumC19920.f64435) {
                                        m34012();
                                        c2735M34009 = m34009();
                                    }
                                    c17013.f52172 = i8;
                                    objM34009 = c17013.m39925(c2609M8239, c2735M340011, c188312.m43517(), c2735M34009);
                                } else {
                                    c188312.m43511(m34029());
                                }
                            }
                        } else if (c2609M8239.isEmpty()) {
                            c22364.m7279(EnumC20043.SYNTAX, i8, C6241.f19169);
                        }
                        c2735M34009 = null;
                        c17013.f52172 = i8;
                        objM34009 = c17013.m39925(c2609M8239, c2735M340011, c188312.m43517(), c2735M34009);
                        break;
                    case 40:
                        m34012();
                        AbstractC12612 abstractC12612M339810 = m33986();
                        m33979(EnumC19920.f64392);
                        C2609 c2609M33943 = m33943();
                        c17013.f52172 = i8;
                        C22637 c22637 = (C22637) abstractC12117.mo29523(c17013.m39972(abstractC12612M339810, c2609M33943));
                        c22637.f73106 = this.f42993.f70639;
                        m33979(EnumC19920.f64481);
                        objM34009 = c22637;
                        break;
                    case 41:
                        m34012();
                        EnumC19920 enumC199211 = this.f42993.f70640;
                        EnumC19920 enumC199212 = EnumC19920.f64410;
                        AbstractC12612 abstractC12612M340116 = enumC199211 == enumC199212 ? null : m34014(1);
                        m33979(enumC199212);
                        c17013.f52172 = i8;
                        objM34009 = (C9938) abstractC12117.mo29524(c17013.m39964(abstractC12612M340116));
                        break;
                    case 42:
                        m34012();
                        AbstractC12612 abstractC12612M340117 = m34014(1);
                        m33979(EnumC19920.f64410);
                        c17013.f52172 = i8;
                        objM34009 = (C1616) abstractC12117.mo29524(c17013.m39971(abstractC12612M340117));
                        break;
                    case 43:
                        m34012();
                        AbstractC10370 abstractC10370M33958 = c18411.test(this.f42993.f70640) ? m33958(false) : null;
                        m33979(EnumC19920.f64410);
                        c17013.f52172 = i8;
                        objM34009 = (C4146) abstractC12117.mo29524(c17013.m39906(abstractC10370M33958));
                        break;
                    case 44:
                        m34012();
                        AbstractC10370 abstractC10370M33959 = c18411.test(this.f42993.f70640) ? m33958(false) : null;
                        m33979(EnumC19920.f64410);
                        c17013.f52172 = i8;
                        C15433 c15433 = new C15433();
                        c15433.f47247 = abstractC10370M33959;
                        c15433.f47248 = null;
                        c15433.f16085 = c17013.f52172;
                        objM34009 = (C15433) abstractC12117.mo29524(c15433);
                        break;
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                        int i15 = this.f42993.f70641;
                        m34012();
                        objM34009 = m33928(i15, EnumC11412.f34112, C6241.f19133);
                        break;
                    case 46:
                        int i16 = this.f42993.f70641;
                        m34012();
                        objM34009 = m33928(i16, EnumC11412.f34112, C6241.f19161);
                        break;
                    case 47:
                        objM34009 = m33928(this.f42993.f70641, EnumC11412.f34110, C6241.f19155);
                        break;
                    default:
                        C12171.m29636();
                        throw null;
                }
            } else {
                AbstractC12612 abstractC12612M340118 = null;
                m34012();
                AbstractC12612 abstractC12612M340119 = m34014(1);
                if (this.f42993.f70640 == EnumC19920.f64377) {
                    m34012();
                    abstractC12612M340118 = m34014(1);
                }
                m33979(EnumC19920.f64410);
                c17013.f52172 = i8;
                C6968 c6968 = new C6968();
                c6968.f21475 = abstractC12612M340119;
                c6968.f21476 = abstractC12612M340118;
                c6968.f16085 = c17013.f52172;
                objM34009 = (C6968) abstractC12117.mo29524(c6968);
            }
            objM34009 = obj;
        } else {
            objM34009 = m34009();
        }
        return C2609.of(objM34009);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C2609 m33926(C2176 c2176, AbstractC12612 abstractC12612) {
        C18837 c18837 = new C18837();
        m33971(this.f42993.f70641, c2176, abstractC12612, m33958(false), false, (InterfaceC5102) null, c18837, true);
        m33979(EnumC19920.f64410);
        m33976((AbstractC5144) c18837.last(), this.f42997.m7523().f70639);
        return c18837.m43517();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC11349 m33928(int i, EnumC11412 enumC11412, C12281 c12281) {
        C2280 c2280 = this.f42997;
        int iM7517 = c2280.m7517();
        AbstractC5144 abstractC5144Mo16224 = enumC11412.mo16224(this);
        c2280.m7518(iM7517);
        return (AbstractC11349) this.f42989.mo29524(this.f42981.m39953(m33952(i, C2609.of((Object) abstractC5144Mo16224), c12281)));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C0617 m34029() {
        AbstractC12612 abstractC12612;
        int i = this.f42993.f70641;
        m33979(EnumC19920.f64398);
        m33979(EnumC19920.f64470);
        C2176 c2176M33945 = m33945(8589934592L);
        C18837 c18837 = new C18837();
        while (true) {
            c18837.m43511(m34017(false));
            if (this.f42993.f70640 != EnumC19920.f64434) {
                break;
            }
            m34012();
        }
        C2609 c2609M43517 = c18837.m43517();
        int iM8245 = c2609M43517.m8245();
        C17013 c17013 = this.f42981;
        if (iM8245 > 1) {
            AbstractC12612 abstractC12613 = (AbstractC12612) c2609M43517.f8240;
            abstractC12613.getClass();
            c17013.f52172 = C7260.m19455(abstractC12613);
            C23488 c23488 = new C23488();
            c23488.f75416 = c2609M43517;
            c23488.f16085 = c17013.f52172;
            abstractC12612 = (AbstractC12612) this.f42989.mo29524(c23488);
        } else {
            abstractC12612 = (AbstractC12612) c2609M43517.f8240;
        }
        C9378 c9378M33955 = m33955(c2176M33945, abstractC12612, false, false);
        m33979(EnumC19920.f64413);
        C2735 c2735M34009 = m34009();
        c17013.f52172 = i;
        return c17013.m39897(c9378M33955, c2735M34009);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C2609 m33943() {
        EnumC19920 enumC19920;
        EnumC6652 enumC6652;
        C2609 c2609M33991;
        C2609 c2609M43517;
        EnumC6652 enumC6653;
        C2609 c2609M33992;
        C18837 c18837 = new C18837();
        while (true) {
            C22036 c22036 = this.f42993;
            int i = c22036.f70641;
            int[] iArr = C12822.f38471;
            int i2 = iArr[c22036.f70640.ordinal()];
            if (i2 == 6 || i2 == 12) {
                break;
            }
            if (i2 != 33 && i2 != 34) {
                m34012();
                m33997(i, C6241.m17190(EnumC19920.f64479, EnumC19920.f64391, EnumC19920.f64481));
            } else {
                int i3 = this.f42993.f70641;
                C18837 c18838 = new C18837();
                int i4 = iArr[this.f42993.f70640.ordinal()];
                C2280 c2280 = this.f42997;
                C22364 c22364 = this.f42979;
                AbstractC5144 abstractC5144 = null;
                C17013 c17013 = this.f42981;
                if (i4 == 33) {
                    m34012();
                    C18837 c18839 = new C18837();
                    while (true) {
                        c18839.m43511(m33933());
                        enumC19920 = this.f42993.f70640;
                        if (enumC19920 != EnumC19920.f64384) {
                            break;
                        }
                        m34012();
                        m33978(EnumC10637.f31982);
                    }
                    EnumC19920 enumC19921 = EnumC19920.f64414;
                    if (enumC19920 == enumC19921) {
                        m33978(EnumC10637.f31980);
                        m33979(enumC19921);
                        enumC6652 = C18963.f59811;
                        AbstractC11349 abstractC11349M34026 = m34026();
                        if (!abstractC11349M34026.m14709(EnumC18550.f57478) && !abstractC11349M34026.m14709(EnumC18550.f57550) && !abstractC11349M34026.m14709(EnumC18550.f57584)) {
                            c22364.m7273(abstractC11349M34026, C6241.f19185);
                        }
                        c2609M33991 = C2609.of((Object) abstractC11349M34026);
                        abstractC5144 = (AbstractC5144) c2609M33991.f8240;
                    } else {
                        m33980(EnumC19920.f64377, new C5851(10));
                        enumC6652 = C18963.f59812;
                        c2609M33991 = m33991();
                    }
                    c17013.f52172 = i3;
                    C18963 c18963M39938 = c17013.m39938(enumC6652, c18839.m43517(), c2609M33991, abstractC5144);
                    if (c2609M33991.isEmpty()) {
                        m33976(c18963M39938, c2280.m7523().f70639);
                    }
                    c18838.m43511(c18963M39938);
                    c2609M43517 = c18838.m43517();
                } else if (i4 == 34) {
                    m34012();
                    C22036 c22037 = this.f42993;
                    int i5 = c22037.f70641;
                    EnumC19920 enumC19922 = c22037.f70640;
                    EnumC19920 enumC19923 = EnumC19920.f64414;
                    if (enumC19922 == enumC19923) {
                        m33978(EnumC10637.f31980);
                        m33979(enumC19923);
                        enumC6653 = C18963.f59811;
                        AbstractC11349 abstractC11349M34027 = m34026();
                        if (!abstractC11349M34027.m14709(EnumC18550.f57478) && !abstractC11349M34027.m14709(EnumC18550.f57550) && !abstractC11349M34027.m14709(EnumC18550.f57584)) {
                            c22364.m7273(abstractC11349M34027, C6241.f19185);
                        }
                        c2609M33992 = C2609.of((Object) abstractC11349M34027);
                        abstractC5144 = (AbstractC5144) c2609M33992.f8240;
                    } else {
                        m33980(EnumC19920.f64377, new C11213(6));
                        enumC6653 = C18963.f59812;
                        c2609M33992 = m33991();
                    }
                    c17013.f52172 = i5;
                    AbstractC19669 abstractC19669 = (AbstractC19669) this.f42989.mo29524(c17013.m39942());
                    c17013.f52172 = i3;
                    C18963 c18963M39939 = c17013.m39938(enumC6653, C2609.of((Object) abstractC19669), c2609M33992, abstractC5144);
                    if (c2609M33992.isEmpty()) {
                        m33976(c18963M39939, c2280.m7523().f70639);
                    }
                    c18838.m43511(c18963M39939);
                    c2609M43517 = c18838.m43517();
                } else {
                    throw new AssertionError("should not reach here");
                }
                c18837.m43512(c2609M43517);
            }
        }
        return c18837.m43517();
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ce A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    private AbstractC19669 m33933() {
        C2280 c2280;
        EnumC17802 enumC17802;
        C22036 c22036 = this.f42993;
        int i = c22036.f70641;
        if (c22036.f70640 == EnumC19920.f64391) {
            m33972(i, EnumC10637.f31989);
            m34012();
            C17013 c17013 = this.f42981;
            c17013.f52172 = i;
            return (AbstractC19669) this.f42989.mo29524(c17013.m39942());
        }
        int iM33940 = 0;
        while (true) {
            c2280 = this.f42997;
            if (c2280.m7520(iM33940).f70640 != EnumC19920.f64470) {
                break;
            }
            iM33940++;
        }
        C2176 c2176M33945 = m33945(0L);
        if (c2176M33945.f7169 == 0 && !c2176M33945.f7168.m8249()) {
            int i2 = 0;
            while (true) {
                int i3 = C12822.f38471[c2280.m7520(iM33940).f70640.ordinal()];
                if (i3 != 5) {
                    C18411 c18411 = this.f42991;
                    if (i3 == 9) {
                        if (i2 != 0 && m33982(iM33940, c18411)) {
                            enumC17802 = EnumC17802.PATTERN;
                        }
                    } else if (i3 == 49) {
                        continue;
                    } else if (i3 == 51) {
                        if (i2 != 0) {
                            continue;
                        }
                    } else if (i3 == 73) {
                        EnumC19920 enumC19920 = EnumC19920.f64400;
                        if (m33983(iM33940, enumC19920, c18411)) {
                            enumC17802 = EnumC17802.PATTERN;
                        } else if (m33982(iM33940, enumC19920)) {
                            iM33940++;
                        } else {
                            enumC17802 = EnumC17802.EXPRESSION;
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
                                                enumC17802 = EnumC17802.EXPRESSION;
                                            }
                                        } else if (!m33982(iM33940, c18411)) {
                                            enumC17802 = EnumC17802.EXPRESSION;
                                        } else {
                                            enumC17802 = EnumC17802.PATTERN;
                                        }
                                        break;
                                    default:
                                        enumC17802 = EnumC17802.EXPRESSION;
                                        break;
                                }
                                break;
                        }
                    }
                } else {
                    iM33940 = m33940(iM33940);
                }
                iM33940++;
            }
            if (enumC17802 != EnumC17802.PATTERN) {
                return m34014(33);
            }
        }
        m33972(this.f42993.f70641, EnumC10637.f31989);
        return m33970(i, c2176M33945, (AbstractC12612) null, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m33949(EnumC18550 enumC18550) {
        if (this.f42993.f70640 != EnumC19920.f64432) {
            return C2609.m8239();
        }
        C18837 c18837 = new C18837();
        int i = this.f42986;
        while (true) {
            C22036 c22036 = this.f42993;
            if (c22036.f70640 == EnumC19920.f64432) {
                int i2 = c22036.f70641;
                m34012();
                c18837.m43511(m33967(enumC18550, i2));
            } else {
                this.f43001 = this.f42986;
                this.f42986 = i;
                return c18837.m43517();
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private AbstractC12612 m33941(AbstractC12612 abstractC12612, C2609 c2609) {
        C2609 c2609M33949 = m33949(EnumC18550.f57483);
        C22036 c22036 = this.f42993;
        if (c22036.f70640 == EnumC19920.f64371) {
            int i = c22036.f70641;
            m34012();
            abstractC12612 = m33936(i, abstractC12612, c2609M33949);
        } else if (!c2609M33949.isEmpty()) {
            if (this.f43005) {
                this.f42992 = c2609M33949;
            } else {
                return m33951(((C17551) c2609M33949.f8240).f16085);
            }
        }
        if (c2609.isEmpty()) {
            return abstractC12612;
        }
        int i2 = this.f42993.f70641;
        C17013 c17013 = this.f42981;
        c17013.f52172 = i2;
        return (AbstractC12612) this.f42989.mo29524(c17013.m39937(abstractC12612, c2609));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m33961(int i, AbstractC12612 abstractC12612) {
        C22036 c22036;
        EnumC19920 enumC19920;
        C2609 c2609M33949 = m33949(EnumC18550.f57483);
        m33979(EnumC19920.f64371);
        EnumC19920 enumC19921 = this.f42993.f70640;
        EnumC19920 enumC19922 = EnumC19920.f64400;
        AbstractC12117 abstractC12117 = this.f42989;
        C17013 c17013 = this.f42981;
        if (enumC19921 == enumC19922) {
            m33979(enumC19922);
            AbstractC12612 abstractC12612M33941 = m33941(abstractC12612, c2609M33949);
            if (this.f42993.f70640 != EnumC19920.f64392) {
                c17013.f52172 = i;
                return m33952(this.f42993.f70641, C2609.of(abstractC12117.mo29524(c17013.m39958(abstractC12612M33941, C2609.m8239(), null))), C6241.f19138);
            }
            C18404 c18404 = (C18404) m34000(i, abstractC12612M33941);
            if (c2609M33949.m8249()) {
                C18257 c18257 = (C18257) abstractC12612M33941;
                c18404.f57137 = c18257.f56778;
                c18404.f57138 = c18257.f56779;
            }
            return c18404;
        }
        C18837 c18837 = new C18837();
        C18837 c18838 = new C18837();
        c18838.m43511((Object) c2609M33949);
        c18837.m43511(m34014(1));
        m33979(enumC19922);
        while (true) {
            c22036 = this.f42993;
            enumC19920 = c22036.f70640;
            if (enumC19920 != EnumC19920.f64371 && enumC19920 != EnumC19920.f64432) {
                break;
            }
            C2609 c2609M339410 = m33949(EnumC18550.f57483);
            int i2 = this.f42993.f70641;
            m34012();
            EnumC19920 enumC19923 = this.f42993.f70640;
            EnumC19920 enumC19924 = EnumC19920.f64400;
            if (enumC19923 == enumC19924) {
                abstractC12612 = m33936(i2, abstractC12612, c2609M339410);
            } else {
                c18838.m43511((Object) c2609M339410);
                c18837.m43511(m34014(1));
                m33979(enumC19924);
            }
        }
        int i3 = c22036.f70641;
        C2609 c2609M34021 = enumC19920 == EnumC19920.f64392 ? m34021() : null;
        c17013.f52172 = i;
        C18404 c18405 = (C18404) abstractC12117.mo29524(c17013.m39958(abstractC12612, c18837.m43517(), c2609M34021));
        c18405.f57141 = c18838.m43517();
        return c2609M34021 != null ? m33952(i3, C2609.of((Object) c18405), C6241.f19156) : c18405;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19110 m33968(int i, AbstractC12612 abstractC12612, C2609 c2609) {
        C2609 c2609M33949 = m33949(EnumC18550.f57483);
        int i2 = this.f42993.f70641;
        C17013 c17013 = this.f42981;
        c17013.f52172 = i2;
        C7673 c7673M39951 = c17013.m39951(m33958(false));
        AbstractC12117 abstractC12117 = this.f42989;
        AbstractC12612 abstractC12612M34003 = (AbstractC12612) abstractC12117.mo29524(c7673M39951);
        if (c2609M33949.m8249()) {
            c17013.f52172 = ((C17551) c2609M33949.f8240).f16085;
            abstractC12612M34003 = (AbstractC12612) abstractC12117.mo29524(c17013.m39937(abstractC12612M34003, c2609M33949));
        }
        if (this.f42993.f70640 == EnumC19920.f64473) {
            int i3 = this.f42986;
            abstractC12612M34003 = m34003(abstractC12612M34003, true);
            this.f42986 = i3;
        }
        return m33969(i, abstractC12612, c2609, abstractC12612M34003);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34017(boolean z) {
        C2609 c2609M33949 = m33949(EnumC18550.f57483);
        AbstractC12612 abstractC12612M34034 = m34034(z);
        return c2609M33949.m8249() ? m33929(abstractC12612M34034, c2609M33949, false) : abstractC12612M34034;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34031() {
        AbstractC12612 abstractC12612M39949;
        C2609 c2609M33949 = m33949(EnumC18550.f57483);
        C22036 c22036 = this.f42993;
        if (c22036.f70640 != EnumC19920.f64440) {
            AbstractC12612 abstractC12612M34034 = m34034(false);
            return c2609M33949.m8249() ? m33929(abstractC12612M34034, c2609M33949, false) : abstractC12612M34034;
        }
        int i = c22036.f70641;
        m34012();
        EnumC19920 enumC19920 = this.f42993.f70640;
        EnumC19920 enumC19921 = EnumC19920.f64395;
        AbstractC12117 abstractC12117 = this.f42989;
        C17013 c17013 = this.f42981;
        if (enumC19920 == enumC19921) {
            c17013.f52172 = i;
            C19256 c19256 = (C19256) abstractC12117.mo29523(c17013.m39940(EnumC15678.EXTENDS));
            m34012();
            AbstractC12612 abstractC12612M34017 = m34017(false);
            c17013.f52172 = i;
            abstractC12612M39949 = c17013.m39930(c19256, (AbstractC5144) abstractC12612M34017);
        } else {
            EnumC19920 enumC19922 = EnumC19920.f64474;
            if (enumC19920 == enumC19922) {
                c17013.f52172 = i;
                C19256 c19257 = (C19256) abstractC12117.mo29523(c17013.m39940(EnumC15678.SUPER));
                m34012();
                AbstractC12612 abstractC12612M34018 = m34017(false);
                c17013.f52172 = i;
                abstractC12612M39949 = c17013.m39930(c19257, (AbstractC5144) abstractC12612M34018);
            } else if (this.f42991.test(enumC19920)) {
                c17013.f52172 = -1;
                C19256 c19256M39940 = c17013.m39940(EnumC15678.UNBOUND);
                c17013.f52172 = i;
                AbstractC12612 abstractC12612 = (AbstractC12612) abstractC12117.mo29524(c17013.m39930(c19256M39940, (AbstractC5144) null));
                c17013.f52172 = this.f42993.f70641;
                C7673 c7673 = (C7673) abstractC12117.mo29524(c17013.m39951(m33958(false)));
                c17013.f52172 = i;
                abstractC12612M39949 = c17013.m39949(C2609.of((Object) abstractC12612, (Object) c7673));
                m33975(abstractC12612M39949, C6241.m17190(EnumC19920.f64454, enumC19921, enumC19922));
            } else {
                c17013.f52172 = i;
                C19256 c19258 = (C19256) abstractC12117.mo29524(c17013.m39940(EnumC15678.UNBOUND));
                c17013.f52172 = i;
                abstractC12612M39949 = (AbstractC12612) abstractC12117.mo29524(c17013.m39930(c19258, (AbstractC5144) null));
            }
        }
        if (c2609M33949.isEmpty()) {
            return abstractC12612M39949;
        }
        c17013.f52172 = ((C17551) c2609M33949.f8240).f16085;
        return (AbstractC12612) abstractC12117.mo29524(c17013.m39937(abstractC12612M39949, c2609M33949));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2176 m33945(long j) {
        C2176 c2176M33946 = m33946((C2176) null);
        long j2 = c2176M33946.f7169 & (-131089);
        int i = this.f42993.f70641;
        if (j2 != 0) {
            EnumC20043 enumC20043 = EnumC20043.SYNTAX;
            EnumSet enumSetM45150 = C19642.m45150(j2 & (-j2));
            C12281 c12281 = C6241.f19132;
            this.f42979.m7279(enumC20043, i, new C12281("compiler", "mod.not.allowed.here", enumSetM45150));
        }
        c2176M33946.f7169 = j | c2176M33946.f7169;
        return c2176M33946;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final l.C2176 m33946(l.C2176 r19) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14273.m33946(l.ۖ֡۠):l.ۖ֡۠");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17551 m33967(EnumC18550 enumC18550, int i) {
        C2609 c2609M8239;
        C17551 c17551M39966;
        if (enumC18550 == EnumC18550.f57483) {
            m33978(EnumC10637.f31996);
        }
        AbstractC12612 abstractC12612M34025 = m34025(false);
        EnumC19920 enumC19920 = this.f42993.f70640;
        EnumC19920 enumC19921 = EnumC19920.f64470;
        if (enumC19920 != enumC19921) {
            c2609M8239 = C2609.m8239();
        } else {
            m33979(enumC19921);
            C18837 c18837 = new C18837();
            if (this.f42993.f70640 != EnumC19920.f64413) {
                c18837.m43511(m33960());
                while (this.f42993.f70640 == EnumC19920.f64384) {
                    m34012();
                    c18837.m43511(m33960());
                }
            }
            m33979(EnumC19920.f64413);
            c2609M8239 = c18837.m43517();
        }
        EnumC18550 enumC18551 = EnumC18550.f57490;
        C17013 c17013 = this.f42981;
        if (enumC18550 == enumC18551) {
            c17013.f52172 = i;
            c17551M39966 = c17013.m39932((AbstractC5144) abstractC12612M34025, c2609M8239);
        } else if (enumC18550 == EnumC18550.f57483) {
            c17013.f52172 = i;
            c17551M39966 = c17013.m39966((AbstractC5144) abstractC12612M34025, c2609M8239);
        } else {
            throw new AssertionError("Unhandled annotation kind: " + enumC18550);
        }
        m33976(c17551M39966, this.f42997.m7523().f70639);
        return c17551M39966;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m33960() {
        if (this.f42991.test(this.f42993.f70640)) {
            m33942();
            AbstractC12612 abstractC12612M34011 = m34011();
            if (!abstractC12612M34011.m14709(EnumC18550.f57566)) {
                return abstractC12612M34011;
            }
            C22036 c22036 = this.f42993;
            EnumC19920 enumC19920 = c22036.f70640;
            EnumC19920 enumC19921 = EnumC19920.f64431;
            if (enumC19920 != enumC19921) {
                return abstractC12612M34011;
            }
            int i = c22036.f70641;
            m33979(enumC19921);
            AbstractC12612 abstractC12612M33999 = m33999();
            C17013 c17013 = this.f42981;
            c17013.f52172 = i;
            return (AbstractC12612) this.f42989.mo29524(c17013.m39941(abstractC12612M34011, abstractC12612M33999));
        }
        return m33999();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m33999() {
        int i = C12822.f38471[this.f42993.f70640.ordinal()];
        if (i == 5) {
            int i2 = this.f42993.f70641;
            m34012();
            return m33967(EnumC18550.f57490, i2);
        }
        if (i == 11) {
            int i3 = this.f42993.f70641;
            m33979(EnumC19920.f64392);
            C18837 c18837 = new C18837();
            EnumC19920 enumC19920 = this.f42993.f70640;
            if (enumC19920 == EnumC19920.f64384) {
                m34012();
            } else if (enumC19920 != EnumC19920.f64481) {
                c18837.m43511(m33999());
                while (this.f42993.f70640 == EnumC19920.f64384) {
                    m34012();
                    if (this.f42993.f70640 == EnumC19920.f64481) {
                        break;
                    }
                    c18837.m43511(m33999());
                }
            }
            m33979(EnumC19920.f64481);
            C17013 c17013 = this.f42981;
            c17013.f52172 = i3;
            return (AbstractC12612) this.f42989.mo29524(c17013.m39958(null, C2609.m8239(), c18837.m43517()));
        }
        m33942();
        return m34011();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33971(int i, C2176 c2176, AbstractC12612 abstractC12612, AbstractC10370 abstractC10370, boolean z, InterfaceC5102 interfaceC5102, C18837 c18837, boolean z2) {
        c18837.m43511(m33954(i, c2176, abstractC12612, abstractC10370, z, interfaceC5102, z2, false));
        while (this.f42993.f70640 == EnumC19920.f64384) {
            m33976((AbstractC5144) c18837.last(), this.f42993.f70639);
            m34012();
            c18837.m43511(m33954(this.f42993.f70641, c2176, abstractC12612, m33958(false), z, interfaceC5102, z2, true));
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9378 m33954(int i, C2176 c2176, AbstractC12612 abstractC12612, AbstractC10370 abstractC10370, boolean z, InterfaceC5102 interfaceC5102, boolean z2, boolean z3) {
        AbstractC12612 abstractC12612M34006;
        int iM19455;
        AbstractC12612 abstractC12613;
        boolean z4;
        AbstractC12612 abstractC12612M33934 = m33934(abstractC12612);
        C22036 c22036 = this.f42993;
        EnumC19920 enumC19920 = c22036.f70640;
        EnumC19920 enumC19921 = EnumC19920.f64431;
        if (enumC19920 == enumC19921) {
            m34012();
            abstractC12612M34006 = m34006();
        } else {
            if (z) {
                m33997(c22036.f70641, C6241.m17188(enumC19921));
            }
            abstractC12612M34006 = null;
        }
        AbstractC5144 abstractC5144M19437 = C7260.m19437((AbstractC5144) abstractC12612M33934, true);
        if (abstractC5144M19437.m14709(EnumC18550.f57566)) {
            AbstractC10370 abstractC10371 = ((C7673) abstractC5144M19437).f23696;
            if (m33966(abstractC10371, i, !z3 && z2) == null) {
                iM19455 = -1;
                abstractC12613 = abstractC12612M33934;
                z4 = false;
            } else {
                if (abstractC10371 != this.f42980.f18888) {
                    int i2 = abstractC5144M19437.f16085;
                    C12281 c12281 = C6241.f19132;
                    m33973(i2, new C12281("compiler", "restricted.type.not.allowed.here", abstractC10371));
                } else if (abstractC12612M33934.m14709(EnumC18550.f57518) && !z3) {
                    int i3 = abstractC5144M19437.f16085;
                    C12281 c12282 = C6241.f19132;
                    m33973(i3, new C12281("compiler", "restricted.type.not.allowed.array", abstractC10371));
                } else {
                    if (z3) {
                        int i4 = abstractC5144M19437.f16085;
                        C12281 c12283 = C6241.f19132;
                        m33973(i4, new C12281("compiler", "restricted.type.not.allowed.compound", abstractC10371));
                    }
                    iM19455 = C7260.m19455(c2176);
                    if (iM19455 == -1) {
                        iM19455 = C7260.m19455(abstractC12612M33934);
                    }
                    abstractC12613 = null;
                    z4 = true;
                }
                iM19455 = -1;
                abstractC12613 = abstractC12612M33934;
                z4 = false;
            }
        } else {
            iM19455 = -1;
            abstractC12613 = abstractC12612M33934;
            z4 = false;
        }
        C17013 c17013 = this.f42981;
        c17013.f52172 = i;
        C9378 c9378 = (C9378) this.f42989.mo29524(c17013.m39921(c2176, abstractC10370, abstractC12613, abstractC12612M34006, z4));
        m33977(c9378, interfaceC5102);
        c9378.f28485 = iM19455;
        return c9378;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 m33957(AbstractC12612 abstractC12612, boolean z) {
        int i = C12822.f38472[abstractC12612.mo989().ordinal()];
        if (i != 5) {
            if (i != 6) {
                return null;
            }
            return m33957(((C23901) abstractC12612).f77274, z);
        }
        C7673 c7673 = (C7673) abstractC12612;
        if (m33966(c7673.f23696, abstractC12612.f16085, z) != null) {
            return c7673.f23696;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC16280 m33966(AbstractC10370 abstractC10370, int i, boolean z) {
        C6136 c6136 = this.f42980;
        AbstractC10370 abstractC10371 = c6136.f18888;
        C22364 c22364 = this.f42979;
        if (abstractC10370 == abstractC10371) {
            if (EnumC10637.f32000.m26686(this.f42983)) {
                return EnumC16280.JDK10;
            }
            if (z) {
                C11076 c11076 = C14001.f42334;
                c22364.m7268(i, new C11076("compiler", "restricted.type.not.allowed", abstractC10370, EnumC16280.JDK10));
            }
        }
        if (abstractC10370 == c6136.f18799) {
            if (this.f42987) {
                return EnumC16280.JDK14;
            }
            if (z) {
                C11076 c11077 = C14001.f42334;
                c22364.m7268(i, new C11076("compiler", "restricted.type.not.allowed", abstractC10370, EnumC16280.JDK14));
            }
        }
        if (abstractC10370 == c6136.f18818) {
            if (this.f42999) {
                return EnumC16280.JDK14;
            }
            if (z) {
                C11076 c11078 = C14001.f42334;
                c22364.m7268(i, new C11076("compiler", "restricted.type.not.allowed.preview", abstractC10370, EnumC16280.JDK14));
            }
        }
        AbstractC10370 abstractC10372 = c6136.f18864;
        boolean z2 = this.f42998;
        if (abstractC10370 == abstractC10372) {
            if (z2) {
                return EnumC16280.JDK15;
            }
            if (z) {
                C11076 c11079 = C14001.f42334;
                c22364.m7268(i, new C11076("compiler", "restricted.type.not.allowed.preview", abstractC10370, EnumC16280.JDK15));
            }
        }
        if (abstractC10370 != c6136.f18872) {
            return null;
        }
        if (z2) {
            return EnumC16280.JDK15;
        }
        if (!z) {
            return null;
        }
        C11076 c110710 = C14001.f42334;
        c22364.m7268(i, new C11076("compiler", "restricted.type.not.allowed.preview", abstractC10370, EnumC16280.JDK15));
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9378 m33955(C2176 c2176, AbstractC12612 abstractC12612, boolean z, boolean z2) {
        AbstractC10370 abstractC10370;
        AbstractC10370 abstractC10370Mo3194;
        C22036 c22036 = this.f42993;
        int i = c22036.f70641;
        EnumC19920 enumC19920 = c22036.f70640;
        AbstractC12117 abstractC12117 = this.f42989;
        C17013 c17013 = this.f42981;
        boolean z3 = false;
        C6136 c6136 = this.f42980;
        C22364 c22364 = this.f42979;
        if (z && enumC19920 == EnumC19920.f64437) {
            c22364.m7269(i, C6241.f19256);
            abstractC10370Mo3194 = this.f42993.mo3194();
            m34012();
        } else if (this.f43006 || !z || this.f42991.test(enumC19920) || c2176.f7169 != 8589934592L || c2176.f7168.m8249()) {
            AbstractC12612 abstractC12612M34025 = m34025(false);
            if (!abstractC12612M34025.m14709(EnumC18550.f57566) || (abstractC10370 = ((C7673) abstractC12612M34025).f23696) == c6136.f18886) {
                if (this.f43006) {
                    if ((17179869184L & c2176.f7169) != 0) {
                        c22364.m7269(this.f42993.f70641, C6241.f19190);
                    }
                    C22036 c22037 = this.f42993;
                    if (c22037.f70640 == EnumC19920.f64371) {
                        c22364.m7269(c22037.f70641, C6241.f19240);
                    }
                    if (abstractC12612M34025.m14709(EnumC18550.f57581) && ((C6262) abstractC12612M34025).f19395 != c6136.f18886) {
                        c22364.m7269(this.f42993.f70641, C6241.f19274);
                    }
                }
                c17013.f52172 = i;
                return (C9378) abstractC12117.mo29524(c17013.m39922(c2176, abstractC12612M34025, abstractC12612));
            }
            abstractC10370Mo3194 = abstractC10370;
        } else {
            abstractC10370Mo3194 = c6136.f18867;
        }
        if ((17179869184L & c2176.f7169) != 0) {
            C22036 c22038 = this.f42993;
            if (c22038.f70640 == EnumC19920.f64371) {
                c22364.m7269(c22038.f70641, C6241.f19196);
            }
        }
        if (z2) {
            C22036 c22039 = this.f42993;
            if (c22039.f70640 == EnumC19920.f64371) {
                c22364.m7269(c22039.f70641, C6241.f19208);
            }
        }
        AbstractC12612 abstractC12612M33934 = m33934(abstractC12612);
        c17013.f52172 = i;
        if (abstractC12612M33934 != null && abstractC12612M33934.m14709(EnumC18550.f57566) && ((C7673) abstractC12612M33934).f23696 == c6136.f18888) {
            z3 = true;
        }
        return (C9378) abstractC12117.mo29524(c17013.m39921(c2176, abstractC10370Mo3194, abstractC12612M33934, null, z3));
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AbstractC5144 m34027() {
        C22036 c22036 = this.f42993;
        int i = c22036.f70641;
        EnumC19920 enumC19920 = c22036.f70640;
        if (enumC19920 == EnumC19920.f64476 || enumC19920 == EnumC19920.f64432) {
            return m33954(this.f42993.f70641, m33945(16L), m34017(true), m33958(false), true, (InterfaceC5102) null, true, false);
        }
        AbstractC12612 abstractC12612M34014 = m34014(3);
        if ((this.f43001 & 2) != 0) {
            if (this.f42991.test(this.f42993.f70640)) {
                C17013 c17013 = this.f42981;
                c17013.f52172 = i;
                return m33954(this.f42993.f70641, (C2176) this.f42989.mo29524(c17013.m39899(16L)), abstractC12612M34014, m33958(false), true, (InterfaceC5102) null, true, false);
            }
        }
        m33978(EnumC10637.f31987);
        if (!abstractC12612M34014.m14709(EnumC18550.f57566) && !abstractC12612M34014.m14709(EnumC18550.f57581)) {
            this.f42979.m7273(abstractC12612M34014, C6241.f19202);
        }
        return abstractC12612M34014;
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
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C1323 m33988() {
        boolean z;
        boolean z2;
        C2280 c2280;
        C22036 c22036;
        boolean z3;
        boolean z4;
        String str;
        String str2;
        InterfaceC5102 interfaceC5102M49578;
        C22364 c22364;
        String str3;
        C22036 c22037;
        String str4;
        AbstractC5144 abstractC5144M33959;
        C22036 c22038;
        EnumC19920 enumC19920;
        EnumC19920 enumC19921;
        EnumC6857 enumC6857;
        EnumC6857 enumC6858;
        C22036 c22039;
        C22364 c22365;
        String str5;
        AbstractC12612 abstractC12612;
        C2176 c2176;
        InterfaceC5102 interfaceC5102;
        C2609 c2609M34018;
        AbstractC5144 abstractC5144;
        EnumC19920 enumC19922;
        boolean z5;
        String str6;
        String str7;
        AbstractC12612 abstractC12613;
        C2176 c2177;
        C22036 c220310 = this.f42993;
        C18837 c18837 = new C18837();
        C2176 c2176M33946 = this.f42993.f70640 == EnumC19920.f64432 ? m33946((C2176) null) : null;
        C22036 c220311 = this.f42993;
        EnumC19920 enumC19923 = c220311.f70640;
        EnumC19920 enumC19924 = EnumC19920.f64424;
        String str8 = "mod.not.allowed.here";
        String str9 = "compiler";
        C22364 c22366 = this.f42979;
        C17013 c17013 = this.f42981;
        AbstractC12117 abstractC12117 = this.f42989;
        if (enumC19923 == enumC19924) {
            int i = c220311.f70641;
            C2609 c2609M8239 = C2609.m8239();
            if (c2176M33946 != null) {
                long j = c2176M33946.f7169 & (-131073);
                int i2 = this.f42993.f70641;
                if (j != 0) {
                    EnumC20043 enumC20043 = EnumC20043.SYNTAX;
                    EnumSet enumSetM45150 = C19642.m45150(j & (-j));
                    C12281 c12281 = C6241.f19132;
                    c22366.m7279(enumC20043, i2, new C12281("compiler", "mod.not.allowed.here", enumSetM45150));
                }
                c2609M8239 = c2176M33946.f7168;
                c2177 = null;
            } else {
                c2177 = c2176M33946;
            }
            m34012();
            AbstractC12612 abstractC12612M34025 = m34025(false);
            m33979(EnumC19920.f64410);
            c17013.f52172 = i;
            C12171.m29637(c2609M8239);
            C12171.m29637(abstractC12612M34025);
            C7820 c7820 = new C7820();
            c7820.f24198 = c2609M8239;
            c7820.f24199 = abstractC12612M34025;
            c7820.f16085 = c17013.f52172;
            AbstractC5144 abstractC5145 = (C7820) abstractC12117.mo29524(c7820);
            EnumC0162 enumC0162 = EnumC0162.LINE;
            m33977(abstractC5145, c220310.m49578());
            c18837.m43511(abstractC5145);
            c2176M33946 = c2177;
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
            C22036 c220312 = this.f42993;
            EnumC19920 enumC19925 = c220312.f70640;
            boolean z9 = z;
            EnumC19920 enumC19926 = EnumC19920.f64381;
            C22364 c22367 = c22366;
            c2280 = this.f42997;
            if (enumC19925 != enumC19926) {
                if (c220312.f70641 <= abstractC12117.f36194) {
                    m33981(z6, false, false, false);
                    if (this.f42993.f70640 == enumC19926) {
                    }
                }
                C6136 c6136 = this.f42980;
                if (z6 && c2176M33946 == null) {
                    C22036 c220313 = this.f42993;
                    z4 = z6;
                    if (c220313.f70640 == EnumC19920.f64378) {
                        int i3 = c220313.f70641;
                        m34012();
                        if (this.f42993.f70640 == EnumC19920.f64369) {
                            m34012();
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        c17013.f52172 = this.f42993.f70641;
                        AbstractC12612 abstractC12614 = (AbstractC12612) abstractC12117.mo29524(c17013.m39951(m33958(false)));
                        while (true) {
                            int i4 = this.f42993.f70641;
                            EnumC19920 enumC19927 = EnumC19920.f64405;
                            m33979(enumC19927);
                            str6 = str8;
                            str7 = str9;
                            if (this.f42993.f70640 == EnumC19920.f64458) {
                                c17013.f52172 = i4;
                                abstractC12613 = (AbstractC12612) abstractC12117.mo29523(c17013.m39912(abstractC12614, c6136.f18835));
                                m34012();
                                break;
                            }
                            c17013.f52172 = i4;
                            abstractC12614 = (AbstractC12612) abstractC12117.mo29524(c17013.m39912(abstractC12614, m33958(false)));
                            if (this.f42993.f70640 != enumC19927) {
                                abstractC12613 = abstractC12614;
                                break;
                            }
                            str8 = str6;
                            str9 = str7;
                        }
                        m33979(EnumC19920.f64410);
                        c17013.f52172 = i3;
                        C10643 c10643 = new C10643();
                        c10643.f32021 = abstractC12613;
                        c10643.f32020 = z5;
                        c10643.f16085 = c17013.f52172;
                        c18837.m43511(abstractC12117.mo29524(c10643));
                        z7 = true;
                        z = z9;
                        c22366 = c22367;
                        z6 = z4;
                        str8 = str6;
                        str9 = str7;
                    } else {
                        str = str8;
                        str2 = str9;
                        C22036 c220314 = this.f42993;
                        EnumC0162 enumC0163 = EnumC0162.LINE;
                        interfaceC5102M49578 = c220314.m49578();
                        if (z8) {
                            interfaceC5102M49578 = c220310.m49578();
                            z9 = true;
                        }
                        if (c2176M33946 == null) {
                            c2176M33946 = m33946(c2176M33946);
                        } else {
                            c2176M33946 = m33946(c2176M33946);
                        }
                        if (z8) {
                            c22038 = this.f42993;
                            enumC19920 = c22038.f70640;
                            enumC19921 = EnumC19920.f64412;
                            if (enumC19920 == enumC19921) {
                                enumC6857 = EnumC6857.STRONG;
                                if (c22038.mo3194() == c6136.f18791) {
                                    enumC6858 = EnumC6857.OPEN;
                                    m34012();
                                } else {
                                    enumC6858 = enumC6857;
                                }
                                c22039 = this.f42993;
                                if (c22039.f70640 != enumC19921) {
                                }
                                c22364 = c22367;
                                str3 = str2;
                                c22037 = c220310;
                                str4 = str;
                                if (enumC6858 != enumC6857) {
                                    m33973(this.f42993.f70641, C6241.f19150);
                                }
                            } else {
                                c22364 = c22367;
                                str3 = str2;
                                c22037 = c220310;
                                str4 = str;
                            }
                        } else {
                            c22364 = c22367;
                            str3 = str2;
                            c22037 = c220310;
                            str4 = str;
                        }
                        C22036 c220315 = this.f42993;
                        int i5 = c220315.f70641;
                        if (c2176M33946 == null) {
                            abstractC5144M33959 = m33959(m33946(c2176M33946), interfaceC5102M49578);
                        } else {
                            abstractC5144M33959 = m33959(m33946(c2176M33946), interfaceC5102M49578);
                        }
                        if (abstractC5144M33959 instanceof C10496) {
                            abstractC5144M33959 = ((C10496) abstractC5144M33959).f31483;
                        }
                        c18837.m43511(abstractC5144M33959);
                        if (abstractC5144M33959 instanceof C5557) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                        c2176M33946 = null;
                        str8 = str4;
                        str9 = str3;
                        c22366 = c22364;
                        z = z9;
                        c220310 = c22037;
                        z8 = false;
                    }
                } else {
                    z4 = z6;
                    str = str8;
                    str2 = str9;
                    C22036 c220316 = this.f42993;
                    EnumC0162 enumC0164 = EnumC0162.LINE;
                    interfaceC5102M49578 = c220316.m49578();
                    if (z8 && !z7 && !z2) {
                        interfaceC5102M49578 = c220310.m49578();
                        z9 = true;
                    }
                    if (c2176M33946 == null || this.f42993.f70640 != EnumC19920.f64410) {
                        c2176M33946 = m33946(c2176M33946);
                    }
                    if (z8) {
                        c22038 = this.f42993;
                        enumC19920 = c22038.f70640;
                        enumC19921 = EnumC19920.f64412;
                        if (enumC19920 == enumC19921) {
                            enumC6857 = EnumC6857.STRONG;
                            if (c22038.mo3194() == c6136.f18791) {
                                enumC6858 = EnumC6857.OPEN;
                                m34012();
                            } else {
                                enumC6858 = enumC6857;
                            }
                            c22039 = this.f42993;
                            if (c22039.f70640 != enumC19921 && c22039.mo3194() == c6136.f18814) {
                                if (c2176M33946 != null) {
                                    long j2 = c2176M33946.f7169 & (-131073);
                                    int i6 = this.f42993.f70641;
                                    if (j2 != 0) {
                                        EnumC20043 enumC20044 = EnumC20043.SYNTAX;
                                        EnumSet enumSetM45151 = C19642.m45150((-j2) & j2);
                                        C12281 c12282 = C6241.f19132;
                                        str5 = str2;
                                        c22365 = c22367;
                                        c22365.m7279(enumC20044, i6, new C12281(str5, str, enumSetM45151));
                                    } else {
                                        c22365 = c22367;
                                        str5 = str2;
                                    }
                                } else {
                                    c22365 = c22367;
                                    str5 = str2;
                                }
                                int i7 = this.f42993.f70641;
                                m33978(EnumC10637.f32009);
                                m34012();
                                AbstractC12612 abstractC12612M34026 = m34025(false);
                                m33979(EnumC19920.f64392);
                                C18837 c18838 = new C18837();
                                while (true) {
                                    C22036 c220317 = this.f42993;
                                    EnumC19920 enumC19928 = c220317.f70640;
                                    c22036 = c220310;
                                    EnumC19920 enumC19929 = EnumC19920.f64412;
                                    if (enumC19928 != enumC19929) {
                                        abstractC12612 = abstractC12612M34026;
                                        c2176 = c2176M33946;
                                        interfaceC5102 = interfaceC5102M49578;
                                        break;
                                    }
                                    int i8 = c220317.f70641;
                                    AbstractC10370 abstractC10370Mo3194 = c220317.mo3194();
                                    interfaceC5102 = interfaceC5102M49578;
                                    AbstractC10370 abstractC10370 = c6136.f18829;
                                    abstractC12612 = abstractC12612M34026;
                                    AbstractC10370 abstractC10371 = c6136.f18807;
                                    c2176 = c2176M33946;
                                    AbstractC10370 abstractC10372 = c6136.f18817;
                                    if (abstractC10370Mo3194 != abstractC10370) {
                                        if (this.f42993.mo3194() != abstractC10372 && this.f42993.mo3194() != c6136.f18840) {
                                            if (this.f42993.mo3194() != c6136.f18907) {
                                                if (this.f42993.mo3194() != c6136.f18825) {
                                                    m34004(i8);
                                                    m33973(i8, C6241.f19183);
                                                    break;
                                                }
                                                m34012();
                                                AbstractC12612 abstractC12612M34027 = m34025(false);
                                                m33979(EnumC19920.f64410);
                                                c17013.f52172 = i8;
                                                C20667 c20667 = new C20667();
                                                c20667.f66557 = abstractC12612M34027;
                                                c20667.f16085 = c17013.f52172;
                                                c18838.m43511((AbstractC22490) abstractC12117.mo29524(c20667));
                                            } else {
                                                m34012();
                                                AbstractC12612 abstractC12612M34028 = m34025(false);
                                                C22036 c220318 = this.f42993;
                                                if (c220318.f70640 == enumC19929 && c220318.mo3194() == abstractC10371) {
                                                    m34012();
                                                    C2609 c2609M34019 = m34018(false);
                                                    m33979(EnumC19920.f64410);
                                                    c17013.f52172 = i8;
                                                    C12759 c12759 = new C12759();
                                                    c12759.f38349 = abstractC12612M34028;
                                                    c12759.f38348 = c2609M34019;
                                                    c12759.f16085 = c17013.f52172;
                                                    c18838.m43511((AbstractC22490) abstractC12117.mo29524(c12759));
                                                } else {
                                                    C12281 c12283 = C6241.f19132;
                                                    c22365.m7279(EnumC20043.SYNTAX, this.f42993.f70641, new C12281(str5, "expected.str", "'" + ((Object) abstractC10371) + "'"));
                                                    m33981(false, false, false, false);
                                                }
                                            }
                                        } else {
                                            boolean z10 = this.f42993.mo3194() == abstractC10372;
                                            m34012();
                                            AbstractC12612 abstractC12612M34029 = m34025(false);
                                            C22036 c220319 = this.f42993;
                                            if (c220319.f70640 == enumC19929 && c220319.mo3194() == c6136.f18884) {
                                                m34012();
                                                c2609M34018 = m34018(false);
                                            } else {
                                                c2609M34018 = null;
                                            }
                                            m33979(EnumC19920.f64410);
                                            if (z10) {
                                                c17013.f52172 = i8;
                                                C13317 c13317 = new C13317();
                                                c13317.f39865 = abstractC12612M34029;
                                                c13317.f39866 = c2609M34018;
                                                c13317.f16085 = c17013.f52172;
                                                abstractC5144 = c13317;
                                            } else {
                                                c17013.f52172 = i8;
                                                C0058 c0058 = new C0058();
                                                c0058.f946 = abstractC12612M34029;
                                                c0058.f947 = c2609M34018;
                                                c0058.f16085 = c17013.f52172;
                                                abstractC5144 = c0058;
                                            }
                                            c18838.m43511((AbstractC22490) abstractC12117.mo29524(abstractC5144));
                                        }
                                    } else {
                                        m34012();
                                        boolean z11 = false;
                                        boolean z12 = false;
                                        while (true) {
                                            int i9 = C12822.f38471[this.f42993.f70640.ordinal()];
                                            if (i9 == 15) {
                                                if (z11) {
                                                    c22365.m7279(EnumC20043.SYNTAX, this.f42993.f70641, C6241.f19307);
                                                }
                                                z11 = true;
                                            } else {
                                                if (i9 != 32 || this.f42993.mo3194() != c6136.f18811 || z12 || (enumC19922 = c2280.m7520(1).f70640) == EnumC19920.f64410 || enumC19922 == EnumC19920.f64405) {
                                                    break;
                                                }
                                                z12 = true;
                                            }
                                            m34012();
                                        }
                                        AbstractC12612 abstractC12612M340210 = m34025(false);
                                        m33979(EnumC19920.f64410);
                                        c17013.f52172 = i8;
                                        C12054 c12054 = new C12054();
                                        c12054.f36053 = z12;
                                        c12054.f36054 = z11;
                                        c12054.f36052 = abstractC12612M340210;
                                        c12054.f16085 = c17013.f52172;
                                        c18838.m43511((AbstractC22490) abstractC12117.mo29524(c12054));
                                    }
                                    abstractC12612M34026 = abstractC12612;
                                    c220310 = c22036;
                                    interfaceC5102M49578 = interfaceC5102;
                                    c2176M33946 = c2176;
                                }
                                z3 = true;
                                C2609 c2609M43517 = c18838.m43517();
                                m33979(EnumC19920.f64481);
                                m33979(EnumC19920.f64381);
                                c17013.f52172 = i7;
                                AbstractC5144 abstractC5146 = (C3587) abstractC12117.mo29524(c17013.m39904(c2176, enumC6858, abstractC12612, c2609M43517));
                                m33977(abstractC5146, interfaceC5102);
                                c18837 = c18837;
                                c18837.m43511(abstractC5146);
                                break;
                            }
                            c22364 = c22367;
                            str3 = str2;
                            c22037 = c220310;
                            str4 = str;
                            if (enumC6858 != enumC6857) {
                                m33973(this.f42993.f70641, C6241.f19150);
                            }
                        } else {
                            c22364 = c22367;
                            str3 = str2;
                            c22037 = c220310;
                            str4 = str;
                        }
                    } else {
                        c22364 = c22367;
                        str3 = str2;
                        c22037 = c220310;
                        str4 = str;
                    }
                    C22036 c2203110 = this.f42993;
                    int i10 = c2203110.f70641;
                    if (c2176M33946 == null || c2203110.f70640 != EnumC19920.f64410) {
                        abstractC5144M33959 = m33959(m33946(c2176M33946), interfaceC5102M49578);
                    } else {
                        m34012();
                        c17013.f52172 = i10;
                        abstractC5144M33959 = abstractC12117.mo29524(c17013.m39963());
                    }
                    if (abstractC5144M33959 instanceof C10496) {
                        abstractC5144M33959 = ((C10496) abstractC5144M33959).f31483;
                    }
                    c18837.m43511(abstractC5144M33959);
                    if (abstractC5144M33959 instanceof C5557) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    c2176M33946 = null;
                    str8 = str4;
                    str9 = str3;
                    c22366 = c22364;
                    z = z9;
                    c220310 = c22037;
                    z8 = false;
                }
            }
            c22036 = c220310;
            z3 = z9;
            break;
        }
        C22036 c220320 = c22036;
        c17013.f52172 = c220320.f70641;
        C1323 c1323M39970 = c17013.m39970(c18837.m43517());
        if (!z3) {
            EnumC0162 enumC0165 = EnumC0162.LINE;
            m33977(c1323M39970, c220320.m49578());
        }
        if (c18837.isEmpty()) {
            m33976(c1323M39970, c2280.m7523().f70639);
        }
        if (this.f42984) {
            c1323M39970.f4744 = this.f42990;
        }
        if (this.f43000) {
            c1323M39970.f4741 = c2280.m7519();
        }
        abstractC12117.f36195 = null;
        c1323M39970.f4743 = abstractC12117;
        return c1323M39970;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0117  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ac  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC11349 m33959(C2176 c2176, InterfaceC5102 interfaceC5102) {
        C2609 c2609Of;
        C3440 c3440M33952;
        boolean z;
        boolean z2;
        boolean z3;
        C2609 c2609;
        EnumC19920 enumC19920;
        boolean z4;
        int i;
        EnumC13527 enumC13527;
        C18837 c18837;
        C2280 c2280;
        boolean z5;
        C6136 c6136;
        C5557 c5557;
        AbstractC12612 abstractC12612M34017;
        C22036 c22036 = this.f42993;
        EnumC19920 enumC19921 = c22036.f70640;
        EnumC19920 enumC19922 = EnumC19920.f64408;
        AbstractC12117 abstractC12117 = this.f42989;
        C17013 c17013 = this.f42981;
        if (enumC19921 == enumC19922) {
            int i2 = c22036.f70641;
            m33979(enumC19922);
            AbstractC10370 abstractC10370M33989 = m33989();
            C2609 c2609M34007 = m34007();
            if (this.f42993.f70640 == EnumC19920.f64395) {
                m34012();
                abstractC12612M34017 = m34017(false);
            } else {
                abstractC12612M34017 = null;
            }
            C2609 c2609M8239 = C2609.m8239();
            if (this.f42993.f70640 == EnumC19920.f64445) {
                m34012();
                c2609M8239 = m34028();
            }
            C2609 c2609M33947 = m33947(c2176, Name.LABEL);
            C2609 c2609M33948 = m33948(abstractC10370M33989, false, false);
            c17013.f52172 = i2;
            C5557 c5558 = (C5557) abstractC12117.mo29524(c17013.m39909(c2176, abstractC10370M33989, c2609M34007, abstractC12612M34017, c2609M8239, c2609M33947, c2609M33948));
            m33977(c5558, interfaceC5102);
            return c5558;
        }
        if (m33993()) {
            return m33998(c2176, interfaceC5102);
        }
        C22036 c22037 = this.f42993;
        EnumC19920 enumC19923 = c22037.f70640;
        int i3 = c22037.f70641;
        EnumC19920 enumC19924 = EnumC19920.f64460;
        if (enumC19923 == enumC19924) {
            m33979(enumC19924);
            AbstractC10370 abstractC10370M339810 = m33989();
            C2609 c2609M34008 = m34007();
            C2609 c2609M82310 = C2609.m8239();
            if (this.f42993.f70640 == EnumC19920.f64395) {
                m34012();
                c2609M82310 = m34028();
            }
            C2609 c2609M33949 = m33947(c2176, "interface");
            C2609 c2609M339410 = m33948(abstractC10370M339810, true, false);
            c17013.f52172 = i3;
            C5557 c5559 = (C5557) abstractC12117.mo29524(c17013.m39909(c2176, abstractC10370M339810, c2609M34008, null, c2609M82310, c2609M33949, c2609M339410));
            m33977(c5559, interfaceC5102);
            return c5559;
        }
        EnumC19920 enumC19925 = EnumC19920.f64388;
        C6136 c6137 = this.f42980;
        boolean z6 = this.f42999;
        if (enumC19923 != enumC19925) {
            if (enumC19923 == EnumC19920.f64412 && c22037.mo3194() == c6137.f18818) {
                m33978(EnumC10637.f32007);
                return (AbstractC11349) abstractC12117.mo29524(c17013.m39953(m33952(this.f42993.f70641, C2609.of((Object) c2176), C6241.f19251)));
            }
            if (this.f42991.test(this.f42993.f70640)) {
                c17013.f52172 = i3;
                c2609Of = C2609.of((Object) c2176, (Object) abstractC12117.mo29524(c17013.m39951(m33958(false))));
                m34004(this.f42993.f70641);
            } else {
                c2609Of = C2609.of((Object) c2176);
            }
            if (this.f43004) {
                c3440M33952 = m33952(i3, c2609Of, C6241.f19265);
            } else if (z6) {
                C12281 c12281 = C6241.f19132;
                c3440M33952 = m33952(i3, c2609Of, new C12281("compiler", "expected4", enumC19922, enumC19924, enumC19925, "record"));
            } else {
                c3440M33952 = m33952(i3, c2609Of, C6241.m17190(enumC19922, enumC19924, enumC19925));
            }
            return (AbstractC11349) abstractC12117.mo29524(c17013.m39953(c3440M33952));
        }
        m33979(enumC19925);
        AbstractC10370 abstractC10370M339811 = m33989();
        C2609 c2609M82311 = C2609.m8239();
        if (this.f42993.f70640 == EnumC19920.f64445) {
            m34012();
            c2609M82311 = m34028();
        }
        C2609 c26010 = c2609M82311;
        m33979(EnumC19920.f64392);
        C18837 c18838 = new C18837();
        EnumC19920 enumC19926 = this.f42993.f70640;
        EnumC19920 enumC19927 = EnumC19920.f64384;
        C2280 c2281 = this.f42997;
        if (enumC19926 == enumC19927) {
            m34012();
            EnumC19920 enumC19928 = this.f42993.f70640;
            EnumC19920 enumC19929 = EnumC19920.f64410;
            if (enumC19928 == enumC19929) {
                m34012();
                z = true;
                z3 = false;
                z2 = false;
            } else {
                EnumC19920 enumC199210 = EnumC19920.f64481;
                if (enumC19928 != enumC199210) {
                    m33973(c2281.m7523().f70639, C6241.m17189(enumC199210, enumC19929));
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
            EnumC19920 enumC199211 = this.f42993.f70640;
            boolean z7 = z;
            EnumC19920 enumC199212 = EnumC19920.f64481;
            if (enumC199211 == enumC199212 || enumC199211 == (enumC19920 = EnumC19920.f64381)) {
                break;
            }
            c2609 = c26010;
            EnumC19920 enumC199213 = EnumC19920.f64410;
            if (enumC199211 == enumC199213) {
                m33979(enumC199213);
                EnumC19920 enumC199214 = this.f42993.f70640;
                if (enumC199214 != enumC199212 && enumC199214 != enumC19920) {
                    z4 = true;
                }
            } else {
                z4 = z7;
            }
            C22036 c22038 = this.f42993;
            int i4 = i3;
            EnumC19920 enumC199215 = c22038.f70640;
            if ((enumC199215 == EnumC19920.f64412 || enumC199215 == EnumC19920.f64437) && c22038.mo3194() != abstractC10370M339811 && (!(z6 && m33993()) && ((i = C12822.f38471[c2281.m7520(1).f70640.ordinal()]) == 1 || i == 11 || i == 74 || i == 88))) {
                enumC13527 = EnumC13527.ENUMERATOR;
            } else {
                int i5 = C12822.f38471[this.f42993.f70640.ordinal()];
                if (i5 == 5 || i5 == 21 || i5 == 31) {
                    enumC13527 = EnumC13527.UNKNOWN;
                } else if (i5 != 32) {
                    enumC13527 = EnumC13527.MEMBER;
                } else if (z6 && m33993()) {
                    enumC13527 = EnumC13527.MEMBER;
                } else {
                    enumC13527 = EnumC13527.UNKNOWN;
                }
            }
            if (enumC13527 == EnumC13527.UNKNOWN) {
                enumC13527 = z4 ? EnumC13527.MEMBER : EnumC13527.ENUMERATOR;
            }
            if (enumC13527 == EnumC13527.ENUMERATOR) {
                if (z4 && !z3) {
                    m33973(this.f42993.f70641, C6241.f19171);
                    z3 = true;
                }
                C22036 c22039 = this.f42993;
                EnumC0162 enumC0162 = EnumC0162.LINE;
                InterfaceC5102 interfaceC5102M49578 = c22039.m49578();
                int i6 = this.f42993.m49579() ? 147481 : 16409;
                int i7 = this.f42993.f70641;
                C2609 c2609M339411 = m33949(EnumC18550.f57490);
                c17013.f52172 = c2609M339411.isEmpty() ? -1 : i7;
                C2280 c2282 = c2281;
                C2176 c2176M39947 = c17013.m39947(i6, c2609M339411);
                C2609 c2609M34022 = m34022(2);
                int i8 = this.f42993.f70641;
                AbstractC10370 abstractC10370M33958 = m33958(false);
                C22036 c220310 = this.f42993;
                int i9 = c220310.f70641;
                C2609 c2609M34013 = c220310.f70640 == EnumC19920.f64470 ? m34013() : C2609.m8239();
                z5 = z6;
                if (this.f42993.f70640 == EnumC19920.f64392) {
                    c17013.f52172 = -1;
                    C2176 c2176M39899 = c17013.m39899(16384L);
                    C2609 c2609M339412 = m33948(c6137.f18867, false, false);
                    c17013.f52172 = i8;
                    c5557 = (C5557) abstractC12117.mo29524(c17013.m39907(c2176M39899, c2609M339412));
                } else {
                    c5557 = null;
                }
                int i10 = (c2609M34013.isEmpty() && c5557 == null) ? i8 : i9;
                c17013.f52172 = i8;
                C7673 c7673M39951 = c17013.m39951(abstractC10370M339811);
                c17013.f52172 = i10;
                C18837 c18839 = c18838;
                c2280 = c2282;
                c6136 = c6137;
                C19110 c19110M39939 = c17013.m39939((AbstractC12612) null, c2609M34022, (AbstractC12612) c7673M39951, c2609M34013, c5557, false);
                if (i10 != i8) {
                    m33976(c19110M39939, c2280.m7523().f70639);
                }
                c17013.f52172 = i8;
                C7673 c7673M39952 = c17013.m39951(abstractC10370M339811);
                c17013.f52172 = i7;
                AbstractC5144 abstractC5144Mo29524 = abstractC12117.mo29524(c17013.m39920(c2176M39947, abstractC10370M33958, c7673M39952, c19110M39939));
                m33977(abstractC5144Mo29524, interfaceC5102M49578);
                c18837 = c18839;
                c18837.m43511(abstractC5144Mo29524);
                C22036 c220311 = this.f42993;
                int i11 = c220311.f70641;
                if (i11 <= abstractC12117.f36194) {
                    m33981(false, true, true, false);
                } else {
                    EnumC19920 enumC199216 = c220311.f70640;
                    if (enumC199216 != enumC199212 && enumC199216 != enumC199213 && enumC199216 != enumC19920) {
                        EnumC19920 enumC199217 = EnumC19920.f64384;
                        if (enumC199216 == enumC199217) {
                            m34012();
                        } else {
                            m34004(i11);
                            m33973(c2280.m7523().f70639, C6241.m17190(enumC199217, enumC199212, enumC199213));
                            z3 = z3;
                            z2 = true;
                        }
                        c18838 = c18837;
                        c26010 = c2609;
                        z = z4;
                        i3 = i4;
                        c2281 = c2280;
                        z6 = z5;
                        c6137 = c6136;
                    }
                }
                z3 = z3;
            } else {
                c18837 = c18838;
                c2280 = c2281;
                z5 = z6;
                c6136 = c6137;
                if (!z4 && !z3 && !z2) {
                    m33973(this.f42993.f70641, C6241.f19303);
                    z3 = true;
                }
                c18837.m43512(m33995(abstractC10370M339811, false, false));
                if (this.f42993.f70641 <= abstractC12117.f36194) {
                    m33981(false, true, true, false);
                }
            }
            z2 = false;
            c18838 = c18837;
            c26010 = c2609;
            z = z4;
            i3 = i4;
            c2281 = c2280;
            z6 = z5;
            c6137 = c6136;
            m33979(enumC199212);
            C2609 c2609M43517 = c18838.m43517();
            c2176.f7169 |= 16384;
            c17013.f52172 = i3;
            C5557 c55510 = (C5557) abstractC12117.mo29524(c17013.m39908(c2176, abstractC10370M339811, C2609.m8239(), (AbstractC12612) null, c2609, c2609M43517));
            m33977(c55510, interfaceC5102);
            return c55510;
        }
        c2609 = c26010;
        m33979(enumC199212);
        C2609 c2609M43518 = c18838.m43517();
        c2176.f7169 |= 16384;
        c17013.f52172 = i3;
        C5557 c55511 = (C5557) abstractC12117.mo29524(c17013.m39908(c2176, abstractC10370M339811, C2609.m8239(), (AbstractC12612) null, c2609, c2609M43518));
        m33977(c55511, interfaceC5102);
        return c55511;
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
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C5557 m33998(C2176 c2176, InterfaceC5102 interfaceC5102) {
        C17013 c17013;
        C2609 c2609;
        C2609 c26010;
        int i = this.f42993.f70641;
        m34012();
        c2176.f7169 |= 2305843009213693952L;
        AbstractC10370 abstractC10370M33989 = m33989();
        C2609 c2609M34007 = m34007();
        C2609<C9378> c2609M33996 = m33996(false, true);
        C2609 c2609M8239 = C2609.m8239();
        if (this.f42993.f70640 == EnumC19920.f64445) {
            m34012();
            c2609M8239 = m34028();
        }
        C2609 c2609M33948 = m33948(abstractC10370M33989, false, true);
        ArrayList arrayList = new ArrayList();
        Iterator it = c2609M33996.iterator();
        while (it.hasNext()) {
            arrayList.add((C9378) it.next());
        }
        Iterator it2 = c2609M33948.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            c17013 = this.f42981;
            if (!zHasNext) {
                break;
            }
            AbstractC5144 abstractC5144 = (AbstractC5144) it2.next();
            if (abstractC5144.m14709(EnumC18550.f57511)) {
                C8526 c8526 = (C8526) abstractC5144;
                if (c8526.f26044 == this.f42980.f18879 && c8526.f26048.isEmpty() && (c8526.f26046.f7169 & 2251799813685248L) != 0) {
                    C18837 c18837 = new C18837();
                    for (C9378 c9378 : c2609M33996) {
                        c17013.m39946((InterfaceC3109) c9378);
                        C2176 c2177 = c9378.f28486;
                        c18837.m43511(c17013.m39920(c17013.m39947((c2177.f7169 & 17179869184L) | 8606711808L, c2177.f7168), c9378.f28484, c9378.f28488, (AbstractC12612) null));
                        c2609M33996 = c2609M33996;
                        c2609M8239 = c2609M8239;
                    }
                    c2609 = c2609M33996;
                    c26010 = c2609M8239;
                    c8526.f26048 = c18837.m43517();
                } else {
                    c2609 = c2609M33996;
                    c26010 = c2609M8239;
                }
            } else {
                c2609 = c2609M33996;
                c26010 = c2609M8239;
            }
            c2609M33996 = c2609;
            c2609M8239 = c26010;
        }
        C2609 c26011 = c2609M8239;
        C2609 c2609M8246 = c2609M33948;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c2609M8246 = c2609M8246.m8246((C9378) arrayList.get(size));
        }
        c17013.f52172 = i;
        C5557 c5557 = (C5557) this.f42989.mo29524(c17013.m39908(c2176, abstractC10370M33989, c2609M34007, (AbstractC12612) null, c26011, c2609M8246));
        m33977(c5557, interfaceC5102);
        return c5557;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 m33989() {
        int i = this.f42993.f70641;
        AbstractC10370 abstractC10370M33958 = m33958(false);
        EnumC16280 enumC16280M33966 = m33966(abstractC10370M33958, i, true);
        if (enumC16280M33966 != null) {
            C12281 c12281 = C6241.f19132;
            m33973(i, new C12281("compiler", "restricted.type.not.allowed", abstractC10370M33958, enumC16280M33966));
        }
        return abstractC10370M33958;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m33947(C2176 c2176, String str) {
        if (this.f42998) {
            C22036 c22036 = this.f42993;
            if (c22036.f70640 == EnumC19920.f64412 && c22036.mo3194() == this.f42980.f18872) {
                m33978(EnumC10637.f31988);
                if ((c2176.f7169 & SkeinEngine.UbiTweak.T1_FIRST) == 0) {
                    this.f42979.m7269(this.f42993.f70641, C6241.m17186(new C11576("compiler", "class.is.not.sealed", str)));
                }
                m34012();
                return m34018(false);
            }
        }
        return C2609.m8239();
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C2609 m34028() {
        C18837 c18837 = new C18837();
        c18837.m43511(m34017(false));
        while (this.f42993.f70640 == EnumC19920.f64384) {
            m34012();
            c18837.m43511(m34017(false));
        }
        return c18837.m43517();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m33948(AbstractC10370 abstractC10370, boolean z, boolean z2) {
        EnumC19920 enumC19920;
        EnumC19920 enumC19921 = EnumC19920.f64392;
        m33979(enumC19921);
        int i = this.f42993.f70641;
        AbstractC12117 abstractC12117 = this.f42989;
        if (i <= abstractC12117.f36194) {
            m33981(false, true, false, false);
            if (this.f42993.f70640 == enumC19921) {
                m34012();
            } else {
                return C2609.m8239();
            }
        }
        C18837 c18837 = new C18837();
        while (true) {
            EnumC19920 enumC19922 = this.f42993.f70640;
            enumC19920 = EnumC19920.f64481;
            if (enumC19922 == enumC19920 || enumC19922 == EnumC19920.f64381) {
                break;
            }
            c18837.m43512(m33995(abstractC10370, z, z2));
            if (this.f42993.f70641 <= abstractC12117.f36194) {
                m33981(false, true, true, false);
            }
        }
        m33979(enumC19920);
        return c18837.m43517();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2609 m33995(AbstractC10370 abstractC10370, boolean z, boolean z2) {
        EnumC19920 enumC19920;
        AbstractC12612 abstractC12612M34034;
        C2609 c2609Of;
        C22036 c22036 = this.f42993;
        EnumC19920 enumC19921 = c22036.f70640;
        EnumC19920 enumC19922 = EnumC19920.f64410;
        if (enumC19921 == enumC19922) {
            m34012();
            return C2609.m8239();
        }
        EnumC0162 enumC0162 = EnumC0162.LINE;
        InterfaceC5102 interfaceC5102M49578 = c22036.m49578();
        int i = this.f42993.f70641;
        C2176 c2176M33946 = m33946((C2176) null);
        if (this.f42993.f70640 == EnumC19920.f64408 || ((this.f42999 && m33993()) || (enumC19920 = this.f42993.f70640) == EnumC19920.f64460 || enumC19920 == EnumC19920.f64388)) {
            return C2609.of((Object) m33959(c2176M33946, interfaceC5102M49578));
        }
        EnumC19920 enumC19923 = EnumC19920.f64392;
        C22364 c22364 = this.f42979;
        if (enumC19920 == enumC19923 && (c2176M33946.f7169 & 4087) == 0 && c2176M33946.f7168.isEmpty()) {
            if (z) {
                c22364.m7279(EnumC20043.SYNTAX, this.f42993.f70641, C6241.f19283);
            } else if (z2 && (c2176M33946.f7169 & 8) == 0) {
                c22364.m7279(EnumC20043.SYNTAX, this.f42993.f70641, C6241.f19194);
            }
            return C2609.of((Object) m33950(i, c2176M33946.f7169));
        }
        int i2 = this.f42993.f70641;
        C2609 c2609M34007 = m34007();
        if (c2609M34007.m8249() && c2176M33946.f16085 == -1) {
            c2176M33946.f16085 = i2;
            m33976(c2176M33946, i2);
        }
        C2609 c2609M33949 = m33949(EnumC18550.f57490);
        if (c2609M33949.m8249()) {
            m33972(((C17551) c2609M33949.f8240).f16085, EnumC10637.f31997);
            C2609 c2609 = c2176M33946.f7168;
            c2609.getClass();
            C2609 c2609M8248 = c2609M33949.m8248(c2609);
            c2176M33946.f7168 = c2609M8248;
            if (c2176M33946.f16085 == -1) {
                c2176M33946.f16085 = ((C17551) c2609M8248.f8240).f16085;
            }
        }
        C22036 c22037 = this.f42993;
        int i3 = c22037.f70641;
        boolean z3 = c22037.f70640 == EnumC19920.f64404;
        AbstractC12117 abstractC12117 = this.f42989;
        C17013 c17013 = this.f42981;
        if (z3) {
            c17013.f52172 = i3;
            abstractC12612M34034 = (AbstractC12612) abstractC12117.mo29523(c17013.m39903(EnumC9454.VOID));
            m34012();
        } else {
            abstractC12612M34034 = m34034(false);
        }
        EnumC19920 enumC19924 = this.f42993.f70640;
        EnumC19920 enumC19925 = EnumC19920.f64470;
        C6136 c6136 = this.f42980;
        if (((enumC19924 == enumC19925 && !z) || (z2 && enumC19924 == enumC19923)) && abstractC12612M34034.m14709(EnumC18550.f57566)) {
            if (z || c22037.mo3194() != abstractC10370) {
                c22364.m7279(EnumC20043.SYNTAX, i3, C6241.f19129);
            } else if (c2609M33949.m8249()) {
                m33951(((C17551) c2609M33949.f8240).f16085);
            }
            if (z2 && this.f42993.f70640 == enumC19923) {
                c2176M33946.f7169 |= 2251799813685248L;
            }
            return C2609.of((Object) m33953(i3, c2176M33946, null, c6136.f18879, c2609M34007, z, true, z2, interfaceC5102M49578));
        }
        if (z2 && abstractC12612M34034.m14709(EnumC18550.f57566)) {
            C22036 c22038 = this.f42993;
            if (c22038.f70640 == EnumC19920.f64429) {
                EnumC20043 enumC20043 = EnumC20043.SYNTAX;
                int i4 = c22038.f70641;
                C11576 c11576 = C11886.f35486;
                c22364.m7279(enumC20043, i4, C6241.m17187(c11576, abstractC10370, new C11576("compiler", "throws.clause.not.allowed.for.canonical.constructor", c11576)));
                m33981(false, true, false, false);
                return C2609.of((Object) m33953(i3, c2176M33946, null, c6136.f18879, c2609M34007, z, true, z2, interfaceC5102M49578));
            }
        }
        int i5 = this.f42993.f70641;
        AbstractC10370 abstractC10370M33958 = m33958(false);
        if (this.f42993.f70640 == enumC19925) {
            return C2609.of((Object) m33953(i5, c2176M33946, abstractC12612M34034, abstractC10370M33958, c2609M34007, z, z3, false, interfaceC5102M49578));
        }
        if (z3 || !c2609M34007.isEmpty()) {
            int i6 = this.f42993.f70641;
            if (z3 || c2609M34007.m8249()) {
                c17013.f52172 = i6;
                C8526 c8526 = (C8526) abstractC12117.mo29524(c17013.m39917(c2176M33946, abstractC10370M33958, abstractC12612M34034, c2609M34007, null, C2609.m8239(), C2609.m8239(), null, null));
                m33977(c8526, interfaceC5102M49578);
                c2609Of = C2609.of((Object) c8526);
            } else {
                c2609Of = C2609.m8239();
            }
            return C2609.of((Object) m33952(this.f42993.f70641, c2609Of, C6241.m17188(enumC19925)));
        }
        if (!z2 || (z2 && (c2176M33946.f7169 & 8) != 0)) {
            C18837 c18837 = new C18837();
            m33971(i5, c2176M33946, abstractC12612M34034, abstractC10370M33958, z, interfaceC5102M49578, c18837, false);
            C2609 c2609M43517 = c18837.m43517();
            m33979(enumC19922);
            m33976((AbstractC5144) c2609M43517.last(), this.f42997.m7523().f70639);
            return c2609M43517;
        }
        C18837 c18838 = new C18837();
        m33971(i5, c2176M33946, abstractC12612M34034, abstractC10370M33958, z, interfaceC5102M49578, c18838, false);
        c18838.m43517();
        m33979(enumC19922);
        return C2609.of((Object) m33952(i5, (C2609) null, C6241.f19179));
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m33993() {
        C22036 c22036 = this.f42993;
        EnumC19920 enumC19920 = c22036.f70640;
        EnumC19920 enumC19921 = EnumC19920.f64412;
        if (enumC19920 != enumC19921 || c22036.mo3194() != this.f42980.f18818 || (!m33983(0, enumC19921, EnumC19920.f64470) && !m33983(0, enumC19921, EnumC19920.f64381) && !m33983(0, enumC19921, EnumC19920.f64473))) {
            return false;
        }
        m33978(EnumC10637.f32007);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33985(C22036 c22036, int i) {
        AbstractC10370 abstractC10370Mo3194 = c22036.mo3194();
        C6136 c6136 = this.f42980;
        if (abstractC10370Mo3194 != c6136.f18852 || !m33983(i, EnumC19920.f64407, EnumC19920.f64412)) {
            return false;
        }
        C2280 c2280 = this.f42997;
        C22036 c22036M7520 = c2280.m7520(i + 1);
        C22036 c22036M7521 = c2280.m7520(i + 2);
        if (c22036.f70639 != c22036M7520.f70641 || c22036M7520.f70639 != c22036M7521.f70641 || c22036M7521.mo3194() != c6136.f18864) {
            return false;
        }
        m33978(EnumC10637.f31988);
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m34005(boolean z) {
        if (this.f42993.mo3194() != this.f42980.f18864 || !m33932(this.f42997.m7520(1), z, false)) {
            return false;
        }
        m33978(EnumC10637.f31988);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m33932(C22036 c22036, boolean z, boolean z2) {
        C2280 c2280 = this.f42997;
        if (z) {
            int i = C12822.f38471[c22036.f70640.ordinal()];
            if (i != 3 && i != 4) {
                if (i != 5) {
                    if (i != 7 && i != 8 && i != 9 && i != 20) {
                        return false;
                    }
                } else if (c2280.m7520(2).f70640 == EnumC19920.f64460 && !z2) {
                    return false;
                }
            }
        } else {
            int i2 = C12822.f38471[c22036.f70640.ordinal()];
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
                            if (!m33985(c22036, z2 ? 3 : 1) && c22036.mo3194() != this.f42980.f18864) {
                                return false;
                            }
                        }
                    }
                } else if (c2280.m7520(2).f70640 == EnumC19920.f64460 && !z2) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8526 m33953(int i, C2176 c2176, AbstractC12612 abstractC12612, AbstractC10370 abstractC10370, C2609 c2609, boolean z, boolean z2, boolean z3, InterfaceC5102 interfaceC5102) {
        AbstractC12612 abstractC12612M33934;
        AbstractC12612 abstractC12612M33999;
        C2735 c2735M34009;
        AbstractC12612 abstractC12613;
        if (z) {
            if ((c2176.f7169 & 8) != 0) {
                m33978(EnumC10637.f32001);
            }
            if ((c2176.f7169 & 2) != 0) {
                m33978(EnumC10637.f31981);
            }
        }
        C9378 c9378 = this.f42985;
        C2735 c2735M340010 = null;
        try {
            this.f42985 = null;
            C2609 c2609M8239 = C2609.m8239();
            C2609 c2609M82310 = C2609.m8239();
            if (z3 && abstractC10370 == this.f42980.f18879 && this.f42993.f70640 != EnumC19920.f64470) {
                abstractC12612M33934 = abstractC12612;
            } else {
                c2609M8239 = m33996(false, false);
                abstractC12612M33934 = !z2 ? m33934(abstractC12612) : abstractC12612;
                if (this.f42993.f70640 == EnumC19920.f64429) {
                    m34012();
                    c2609M82310 = m34018(true);
                }
            }
            C2609 c26010 = c2609M8239;
            C2609 c26011 = c2609M82310;
            EnumC19920 enumC19920 = this.f42993.f70640;
            EnumC19920 enumC19921 = EnumC19920.f64392;
            AbstractC12117 abstractC12117 = this.f42989;
            if (enumC19920 == enumC19921) {
                abstractC12613 = null;
                c2735M34009 = m34009();
            } else {
                EnumC19920 enumC19922 = EnumC19920.f64391;
                if (enumC19920 == enumC19922) {
                    m33979(enumC19922);
                    abstractC12612M33999 = m33999();
                } else {
                    abstractC12612M33999 = null;
                }
                m33979(EnumC19920.f64410);
                if (this.f42993.f70641 <= abstractC12117.f36194) {
                    m33981(false, true, false, false);
                    if (this.f42993.f70640 == enumC19921) {
                        c2735M340010 = m34009();
                    }
                }
                c2735M34009 = c2735M340010;
                abstractC12613 = abstractC12612M33999;
            }
            C17013 c17013 = this.f42981;
            c17013.f52172 = i;
            C8526 c8526 = (C8526) abstractC12117.mo29524(c17013.m39917(c2176, abstractC10370, abstractC12612M33934, c2609, this.f42985, c26010, c26011, c2735M34009, abstractC12613));
            m33977(c8526, interfaceC5102);
            return c8526;
        } finally {
            this.f42985 = c9378;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C2609 m34018(boolean z) {
        C2609 c2609M8239;
        C2609 c2609M82310;
        C18837 c18837 = new C18837();
        if (z) {
            c2609M8239 = m33949(EnumC18550.f57483);
        } else {
            c2609M8239 = C2609.m8239();
        }
        AbstractC12612 abstractC12612M34025 = m34025(z);
        if (!c2609M8239.isEmpty()) {
            c18837.m43511(m33929(abstractC12612M34025, c2609M8239, false));
        } else {
            c18837.m43511(abstractC12612M34025);
        }
        while (this.f42993.f70640 == EnumC19920.f64384) {
            m34012();
            if (z) {
                c2609M82310 = m33949(EnumC18550.f57483);
            } else {
                c2609M82310 = C2609.m8239();
            }
            AbstractC12612 abstractC12612M34026 = m34025(z);
            if (!c2609M82310.isEmpty()) {
                c18837.m43511(m33929(abstractC12612M34026, c2609M82310, false));
            } else {
                c18837.m43511(abstractC12612M34026);
            }
        }
        return c18837.m43517();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C2609 m34007() {
        if (this.f42993.f70640 == EnumC19920.f64473) {
            C18837 c18837 = new C18837();
            m34012();
            c18837.m43511(m33987());
            while (this.f42993.f70640 == EnumC19920.f64384) {
                m34012();
                c18837.m43511(m33987());
            }
            m33979(EnumC19920.f64454);
            return c18837.m43517();
        }
        return C2609.m8239();
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C14315 m33987() {
        int i = this.f42993.f70641;
        C2609 c2609M33949 = m33949(EnumC18550.f57483);
        AbstractC10370 abstractC10370M33989 = m33989();
        C18837 c18837 = new C18837();
        if (this.f42993.f70640 == EnumC19920.f64395) {
            m34012();
            c18837.m43511(m34017(false));
            while (this.f42993.f70640 == EnumC19920.f64380) {
                m34012();
                c18837.m43511(m34017(false));
            }
        }
        C17013 c17013 = this.f42981;
        c17013.f52172 = i;
        C2609 c2609M43517 = c18837.m43517();
        C14315 c14315 = new C14315();
        c14315.f43169 = abstractC10370M33989;
        c14315.f43170 = c2609M43517;
        c14315.f43168 = c2609M33949;
        c14315.f16085 = c17013.f52172;
        return (C14315) this.f42989.mo29524(c14315);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2609 m33996(boolean z, boolean z2) {
        C18837 c18837 = new C18837();
        m33979(EnumC19920.f64470);
        if (this.f42993.f70640 != EnumC19920.f64413) {
            this.f43006 = (z || z2) ? false : true;
            C9378 c9378M33956 = m33956(z, z2);
            if (c9378M33956.f28483 != null) {
                this.f42985 = c9378M33956;
            } else {
                c18837.m43511(c9378M33956);
            }
            this.f43006 = false;
            while (this.f42993.f70640 == EnumC19920.f64384) {
                if ((c9378M33956.f28486.f7169 & 17179869184L) != 0) {
                    this.f42979.m7280(EnumC20043.SYNTAX, c9378M33956, C6241.f19244);
                }
                m34012();
                c9378M33956 = m33956(z, z2);
                c18837.m43511(c9378M33956);
            }
        }
        C22036 c22036 = this.f42993;
        EnumC19920 enumC19920 = c22036.f70640;
        EnumC19920 enumC19921 = EnumC19920.f64413;
        if (enumC19920 == enumC19921) {
            m34012();
        } else {
            m34004(c22036.f70641);
            m33973(this.f42997.m7523().f70639, C6241.m17190(EnumC19920.f64384, enumC19921, EnumC19920.f64371));
        }
        return c18837.m43517();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9378 m33956(boolean z, boolean z2) {
        C2176 c2176M33946;
        if (z2) {
            c2176M33946 = m33946((C2176) null);
        } else {
            c2176M33946 = m33945(8589934592L);
        }
        if (z2 && c2176M33946.f7169 != 0) {
            this.f42979.m7269(c2176M33946.f16085, C6241.f19137);
        }
        if (z2) {
            c2176M33946.f7169 |= 2305843009230471186L;
        }
        this.f43005 = true;
        AbstractC12612 abstractC12612M34017 = m34017(z);
        this.f43005 = false;
        if (this.f42993.f70640 == EnumC19920.f64472) {
            C2609 c2609 = this.f42992;
            this.f42992 = C2609.m8239();
            c2176M33946.f7169 |= 17179869184L;
            abstractC12612M34017 = m33929(abstractC12612M34017, c2609, true);
            m34012();
        } else {
            if (this.f42992.m8249()) {
                m33973(((C17551) this.f42992.f8240).f16085, C6241.f19205);
            }
            this.f42992 = C2609.m8239();
        }
        return m33955(c2176M33946, abstractC12612M34017, z, z2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34001(AbstractC12612 abstractC12612) {
        if (C7260.m19447(abstractC12612)) {
            return abstractC12612;
        }
        int i = abstractC12612.f16085;
        C17013 c17013 = this.f42981;
        c17013.f52172 = i;
        C3440 c3440M39949 = c17013.m39949(C2609.of((Object) abstractC12612));
        this.f42979.m7280(EnumC20043.SYNTAX, c3440M39949, C6241.f19295);
        return c3440M39949;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m33939(EnumC19920 enumC19920) {
        EnumC18550 enumC18550M33938 = m33938(enumC19920);
        if (enumC18550M33938 != EnumC18550.f57495) {
            return C7260.m19433(enumC18550M33938);
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC18550 m33938(EnumC19920 enumC19920) {
        int i = C12822.f38471[enumC19920.ordinal()];
        if (i == 21) {
            return EnumC18550.f57539;
        }
        if (i == 82) {
            return EnumC18550.f57545;
        }
        if (i != 83) {
            switch (i) {
                case 62:
                    return EnumC18550.f57573;
                case 63:
                    return EnumC18550.f57526;
                case 64:
                    return EnumC18550.f57508;
                case 65:
                    return EnumC18550.f57487;
                case 66:
                    return EnumC18550.f57542;
                case 67:
                    return EnumC18550.f57579;
                case 68:
                    return EnumC18550.f57510;
                case 69:
                    return EnumC18550.f57525;
                case 70:
                    return EnumC18550.f57486;
                case 71:
                    return EnumC18550.f57552;
                case 72:
                    return EnumC18550.f57574;
                default:
                    switch (i) {
                        case 89:
                            return EnumC18550.f57546;
                        case 90:
                            return EnumC18550.f57527;
                        case 91:
                            return EnumC18550.f57572;
                        case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                            return EnumC18550.f57528;
                        case 93:
                            return EnumC18550.f57544;
                        default:
                            switch (i) {
                                case 95:
                                    return EnumC18550.f57479;
                                case 96:
                                    return EnumC18550.f57565;
                                case 97:
                                    return EnumC18550.f57538;
                                case 98:
                                    return EnumC18550.f57484;
                                case q.f /* 99 */:
                                    return EnumC18550.f57559;
                                case 100:
                                    return EnumC18550.f57570;
                                case 101:
                                    return EnumC18550.f57505;
                                case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                    return EnumC18550.f57512;
                                case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                                    return EnumC18550.f57583;
                                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                    return EnumC18550.f57547;
                                case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                                    return EnumC18550.f57551;
                                case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                                    return EnumC18550.f57480;
                                default:
                                    return EnumC18550.f57495;
                            }
                    }
            }
        }
        return EnumC18550.f57485;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33978(EnumC10637 enumC10637) {
        m33972(this.f42993.f70641, enumC10637);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33972(int i, EnumC10637 enumC10637) {
        C23168 c23168 = this.f43002;
        boolean zM51351 = c23168.m51351(enumC10637);
        C22364 c22364 = this.f42979;
        if (zM51351 && !c23168.m51347()) {
            c22364.m7279(EnumC20043.SOURCE_LEVEL, i, c23168.m51342(enumC10637));
            return;
        }
        EnumC16280 enumC16280 = this.f42983;
        if (!enumC10637.m26686(enumC16280)) {
            c22364.m7279(EnumC20043.SOURCE_LEVEL, i, enumC10637.m26684(enumC16280.f50071));
        } else if (c23168.m51351(enumC10637)) {
            c23168.m51344(new C7342(i), enumC10637);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34004(int i) {
        AbstractC12117 abstractC12117 = this.f42989;
        if (i > abstractC12117.f36194) {
            abstractC12117.f36194 = i;
        }
    }
}
