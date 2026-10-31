package l;

import com.google.android.material.slider.BaseSlider;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.᩷ܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 67EL */
/* JADX INFO: loaded from: classes5.dex */
public final class C20911 extends C1860 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23732 f67630;

    public C20911(C11738 c11738, C23732 c23732) {
        this.f6339 = c11738.f6339;
        this.f6341 = c11738.f6341;
        this.f6340 = c11738;
        this.f67630 = c23732;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:113:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:115:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:116:0x03d5  */
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47745() {
        char c;
        C6739 c6739M28692;
        C19316 c19316M22781;
        int iM42027;
        boolean z;
        EnumC10932 enumC10932;
        Object objM28680;
        EnumC15536 enumC15536;
        C6739 c6739;
        Object obj;
        C6615 c6615 = this.f6341;
        EnumC15204 enumC15204 = c6615.f20355;
        EnumC15204 enumC15205 = EnumC15204.f46543;
        if (enumC15204 == enumC15205) {
            c6615.m18126();
        }
        C6615 c6616 = this.f6341;
        if (c6616.f20355 == enumC15205) {
            c6616.m18126();
        }
        C6615 c6617 = this.f6341;
        if (c6617.f20355 == EnumC15204.f46597) {
            c6617.m18126();
        }
        while (true) {
            EnumC15204 enumC15206 = this.f6341.f20355;
            EnumC15204 enumC15207 = EnumC15204.f46611;
            if (enumC15206 != enumC15207 && !enumC15206.m35961(EnumC15204.f46595, EnumC15204.f46505, EnumC15204.f46477)) {
                return;
            }
            C6615 c6618 = this.f6341;
            String str = c6618.f20357;
            long j = c6618.f20363;
            c6618.m18126();
            C6615 c6619 = this.f6341;
            if (c6619.f20355 != EnumC15204.f46597) {
                EnumC15536 enumC15536M50570 = C22593.m50570(str);
                if (enumC15536M50570 == null) {
                    throw C19462.m44860(this.f6339, j, "Invalid mnemocode ({0})", new Object[]{str});
                }
                EnumC21888 enumC21888M36615 = enumC15536M50570.m36615();
                C6615 c66110 = this.f6341;
                String strM14172 = C4860.m14172("parseInstr: MnemoCode '", enumC15536M50570.m36618(), "'");
                if (c66110.f6339.m45768()) {
                    long jM11945 = c66110.f6339.m11945(j);
                    c = 0;
                    c66110.m18127(String.format("[%4d,%-2d] ", Long.valueOf(jM11945), Long.valueOf(((C5080) c66110.f6339.m45770()).m14623(jM11945, j))).concat(strM14172));
                } else {
                    c = 0;
                }
                int i = C6799.f21092[enumC21888M36615.ordinal()];
                Object objM28681 = null;
                objM28681 = null;
                objM28681 = null;
                objM28681 = null;
                objM28681 = null;
                objM28681 = null;
                objM28681 = null;
                objM28681 = null;
                objM28681 = null;
                C6739 c6739M28693 = null;
                objM28681 = null;
                if (i != 1) {
                    if (i == 2) {
                        c6739M28692 = this.f6340.m28692();
                        if (enumC15536M50570 == EnumC15536.f47564) {
                            this.f6341.m18132(EnumC15204.f46591);
                            objM28681 = this.f6340.m28680(2, enumC15536M50570.m36618());
                        }
                    } else {
                        if (i != 3 && i != 4) {
                            C3917 c3917 = this.f6339;
                            long j2 = this.f6341.f20364;
                            Object[] objArr = new Object[1];
                            objArr[c] = str;
                            throw C19462.m44860(c3917, j2, "Invalid mnemocode ({0})", objArr);
                        }
                        enumC15536 = enumC15536M50570;
                        c6739 = null;
                        obj = null;
                    }
                    this.f6340.f35018.m22777(j, enumC15536, c6739, obj);
                    return;
                }
                int i2 = C6799.f21091[enumC15536M50570.ordinal()];
                C23732 c23732 = this.f67630;
                switch (i2) {
                    case 1:
                        while (true) {
                            C6615 c66111 = this.f6341;
                            if (c66111.f20355 == EnumC15204.f46611) {
                                EnumC15536 enumC15536M50571 = C22593.m50570(c66111.f20350);
                                if (enumC15536M50571 == null) {
                                    C3917 c3918 = this.f6339;
                                    C6615 c66112 = this.f6341;
                                    throw C19462.m44860(c3918, c66112.f20363, "Unknown bytecode ({0})", new Object[]{c66112.f20350});
                                }
                                this.f6340.f35018.m22777(j, EnumC15536.f47470, new C6739(enumC15536M50571.m36614().intValue()), null);
                                this.f6341.m18126();
                            } else {
                                C11738 c11738 = this.f6340;
                                c11738.f35018.m22777(j, EnumC15536.f47470, c11738.m28679(1), null);
                            }
                            C6615 c66113 = this.f6341;
                            if (c66113.f20355 != EnumC15204.f46591) {
                                return;
                            } else {
                                c66113.m18126();
                            }
                        }
                        break;
                    case 2:
                        while (true) {
                            C11738 c11739 = this.f6340;
                            C8815 c8815 = c11739.f35018;
                            long j3 = this.f6341.f20363;
                            C6615 c66114 = c11739.f6341;
                            String str2 = c66114.f20357;
                            c66114.m18132(EnumC15204.f46611);
                            C9521 c9521M22776 = c8815.m22776(j3, str2);
                            if (c9521M22776.f28914 != -1) {
                                c8815.f26853.mo11946("<try {0}> redeclared", str2);
                            } else {
                                c9521M22776.f28914 = c8815.f26842;
                            }
                            C6615 c66115 = this.f6341;
                            if (c66115.f20355 != EnumC15204.f46591) {
                                return;
                            } else {
                                c66115.m18126();
                            }
                        }
                        break;
                    case 3:
                        while (true) {
                            C11738 c117310 = this.f6340;
                            C8815 c8816 = c117310.f35018;
                            long j4 = this.f6341.f20363;
                            C6615 c66116 = c117310.f6341;
                            String str3 = c66116.f20357;
                            c66116.m18132(EnumC15204.f46611);
                            C9521 c9521M22777 = c8816.m22776(j4, str3);
                            if (c9521M22777.f28913 != -1) {
                                c8816.f26853.mo11946("<endtry {0}> redeclared", str3);
                            } else {
                                c9521M22777.f28913 = c8816.f26842;
                            }
                            C6615 c66117 = this.f6341;
                            if (c66117.f20355 != EnumC15204.f46591) {
                                return;
                            } else {
                                c66117.m18126();
                            }
                        }
                        break;
                    case 4:
                        C11738 c117311 = this.f6340;
                        C8815 c8817 = c117311.f35018;
                        long j5 = this.f6341.f20363;
                        C6615 c66118 = c117311.f6341;
                        String str4 = c66118.f20357;
                        c66118.m18132(enumC15207);
                        C15869 c15869M52383 = c23732.m52383(EnumC10932.f32947, null, false);
                        C9521 c9521M22778 = c8817.m22776(j5, str4);
                        c9521M22778.f67377 = true;
                        int i3 = c8817.f26842;
                        C18028 c18028 = new C18028();
                        c18028.f56206 = j5;
                        c18028.f56205 = c9521M22778;
                        c18028.f56208 = i3;
                        c18028.f56207 = c15869M52383;
                        c8817.f26852.f18006.add(c18028);
                        return;
                    case 5:
                        while (true) {
                            this.f6340.m28684(EnumC15536.f47800);
                            C6615 c66119 = this.f6341;
                            if (c66119.f20355 != EnumC15204.f46591) {
                                return;
                            } else {
                                c66119.m18126();
                            }
                        }
                        break;
                    case 6:
                        while (true) {
                            this.f6340.m28689(EnumC15536.f47800);
                            C6615 c66120 = this.f6341;
                            if (c66120.f20355 != EnumC15204.f46591) {
                                return;
                            } else {
                                c66120.m18126();
                            }
                        }
                        break;
                    case 7:
                        while (true) {
                            this.f6340.m28684(EnumC15536.f47591);
                            C6615 c66121 = this.f6341;
                            if (c66121.f20355 != EnumC15204.f46591) {
                                return;
                            } else {
                                c66121.m18126();
                            }
                        }
                        break;
                    case 8:
                        while (true) {
                            this.f6340.m28689(EnumC15536.f47591);
                            C6615 c66122 = this.f6341;
                            if (c66122.f20355 != EnumC15204.f46591) {
                                return;
                            } else {
                                c66122.m18126();
                            }
                        }
                        break;
                    case 9:
                        C19316 c19316M22782 = this.f6340.f35018.m22781();
                        if (c19316M22782.f60734 != null) {
                            this.f6339.mo9065(this.f6341.f20363, "{0} redeclared", EnumC15536.f47781.m36618());
                        }
                        C5868 c5868 = new C5868();
                        c19316M22782.f60734 = c5868;
                        c19316M22782.m44507(this.f6341.f20363);
                        if (this.f6341.f20355 == EnumC15204.f46479) {
                            return;
                        }
                        while (true) {
                            this.f6340.m28683(c5868);
                            C6615 c66123 = this.f6341;
                            if (c66123.f20355 != EnumC15204.f46591) {
                                return;
                            } else {
                                c66123.m18126();
                            }
                        }
                        break;
                    case 10:
                        C19316 c19316M22783 = this.f6340.f35018.m22781();
                        if (c19316M22783.f60736 != null) {
                            this.f6339.mo9065(this.f6341.f20363, "{0} redeclared", EnumC15536.f47789.m36618());
                        }
                        C5868 c5869 = new C5868();
                        c19316M22783.f60736 = c5869;
                        c19316M22783.m44507(this.f6341.f20363);
                        if (this.f6341.f20355 == EnumC15204.f46479) {
                            return;
                        }
                        while (true) {
                            this.f6340.m28683(c5869);
                            C6615 c66124 = this.f6341;
                            if (c66124.f20355 != EnumC15204.f46591) {
                                return;
                            } else {
                                c66124.m18126();
                            }
                        }
                        break;
                    case 11:
                        C19316 c19316M22784 = this.f6340.f35018.m22781();
                        if (!c19316M22784.m44513()) {
                            this.f6339.mo9065(this.f6341.f20363, "{0} are only eligible in stack_map_frame {1}", EnumC15536.f47701.m36618(), EnumC23006.EARLY_LARVAL.m51154());
                        }
                        if (c19316M22784.f60735 != null) {
                            this.f6339.mo9065(this.f6341.f20363, "{0} redeclared", EnumC15536.f47701.m36618());
                        }
                        C5868 c58610 = new C5868();
                        c19316M22784.f60735 = c58610;
                        c19316M22784.m44507(this.f6341.f20363);
                        C6615 c66125 = this.f6341;
                        if (c66125.f20355 == EnumC15204.f46479) {
                            c66125.m18126();
                            C6615 c66126 = this.f6341;
                            Object[] objArr2 = {EnumC15536.f47613.m36618(), EnumC15536.f47569.m36618()};
                            ArrayList arrayList = new ArrayList(2);
                            int iM23073 = 0;
                            while (iM23073 < 2) {
                                Object obj2 = objArr2[iM23073];
                                iM23073 = C8954.m23073(obj2, arrayList, obj2, iM23073, 1);
                            }
                            c66126.m18128(C20195.unmodifiableList(arrayList), EnumC15204.f46581, EnumC15204.f46476);
                        } else {
                            while (true) {
                                this.f6340.m28688(c58610);
                                C6615 c66127 = this.f6341;
                                if (c66127.f20355 != EnumC15204.f46591) {
                                    c66127.m18132(EnumC15204.f46479);
                                    C6615 c66128 = this.f6341;
                                    Object[] objArr3 = {EnumC15536.f47613.m36618(), EnumC15536.f47569.m36618()};
                                    ArrayList arrayList2 = new ArrayList(2);
                                    int iM23074 = 0;
                                    while (iM23074 < 2) {
                                        Object obj3 = objArr3[iM23074];
                                        iM23074 = C8954.m23073(obj3, arrayList2, obj3, iM23074, 1);
                                    }
                                    c66128.m18128(C20195.unmodifiableList(arrayList2), EnumC15204.f46581, EnumC15204.f46476);
                                } else {
                                    c66127.m18126();
                                }
                            }
                        }
                        EnumC15536 enumC15537 = EnumC15536.f47579;
                        this.f6341.m18126();
                        c19316M22781 = this.f6340.f35018.m22781();
                        if (c19316M22781.m44514()) {
                            if (c19316M22781.m44513()) {
                                C8815 c8818 = this.f6340.f35018;
                                C19316 c19316 = new C19316(c8818.f26853, c8818.f26843.f41195.m50043());
                                c8818.f26862.add(c19316);
                                c19316M22781 = c19316;
                            } else {
                                this.f6339.mo9065(this.f6341.f20363, "A method''s Code attribute already has a StackMapTable attribute", new Object[0]);
                            }
                        }
                        c19316M22781.m44507(this.f6341.f20363);
                        C6615 c66129 = this.f6340.f6341;
                        String str5 = c66129.f20357;
                        c66129.m18132(EnumC15204.f46611);
                        c19316M22781.m44508(str5);
                        return;
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        c19316M22781 = this.f6340.f35018.m22781();
                        if (c19316M22781.m44514()) {
                            if (c19316M22781.m44513()) {
                                C8815 c8819 = this.f6340.f35018;
                                C19316 c19317 = new C19316(c8819.f26853, c8819.f26843.f41195.m50043());
                                c8819.f26862.add(c19317);
                                c19316M22781 = c19317;
                            } else {
                                this.f6339.mo9065(this.f6341.f20363, "A method''s Code attribute already has a StackMapTable attribute", new Object[0]);
                            }
                        }
                        c19316M22781.m44507(this.f6341.f20363);
                        C6615 c661210 = this.f6340.f6341;
                        String str6 = c661210.f20357;
                        c661210.m18132(EnumC15204.f46611);
                        c19316M22781.m44508(str6);
                        return;
                    case 16:
                        C19316 c19316M22785 = this.f6340.f35018.m22781();
                        if (c19316M22785.m44514()) {
                            this.f6339.mo9065(this.f6341.f20363, "A method''s Code attribute already has a StackMapTable attribute", new Object[0]);
                        }
                        c19316M22785.m44507(this.f6341.f20363);
                        return;
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
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                        c6739M28692 = this.f6340.m28692();
                        break;
                    case 39:
                        c6739M28693 = this.f6340.m28692();
                        this.f6341.m18132(EnumC15204.f46591);
                        objM28680 = this.f6340.m28680(1, enumC15536M50570.m36618());
                        C6739 c67310 = c6739M28693;
                        objM28681 = objM28680;
                        c6739M28692 = c67310;
                        break;
                    case 40:
                    case 41:
                        this.f6341.m18132(EnumC15204.f46642);
                        C3917 c3919 = this.f6339;
                        C5204 c5204 = new C5204();
                        c5204.f16296 = null;
                        c5204.f16301 = new ArrayList();
                        c5204.f16302 = new ArrayList();
                        c5204.f16298 = c3919;
                        int i4 = 0;
                        while (true) {
                            int i5 = C22593.f73024;
                            if (i4 < 2048) {
                                int i6 = C6799.f21090[this.f6341.f20355.ordinal()];
                                if (i6 == 1) {
                                    C6615 c66130 = this.f6341;
                                    int i7 = c66130.f20360 * c66130.f20353;
                                    c66130.m18126();
                                    this.f6341.m18132(EnumC15204.f46597);
                                    C6739 c6739M47746 = m47746();
                                    c5204.f16302.add(Integer.valueOf(i7));
                                    c5204.f16301.add(c6739M47746);
                                    i4++;
                                    C6615 c66131 = this.f6341;
                                    if (c66131.f20355 == EnumC15204.f46479) {
                                        c66131.m18126();
                                    }
                                } else if (i6 == 2) {
                                    this.f6341.m18126();
                                    this.f6341.m18132(EnumC15204.f46597);
                                    if (c5204.f16296 != null) {
                                        this.f6339.mo11946("Default statement already declared in this table", new Object[0]);
                                    }
                                    c5204.f16296 = m47746();
                                    C6615 c66132 = this.f6341;
                                    if (c66132.f20355 == EnumC15204.f46479) {
                                        c66132.m18126();
                                    }
                                }
                                C6739 c67311 = c6739M28693;
                                objM28681 = objM28680;
                                c6739M28692 = c67311;
                            } else {
                                this.f6339.mo11946("Switch table is too long {0}", 2048);
                            }
                            break;
                        }
                        this.f6341.m18132(EnumC15204.f46442);
                        objM28680 = c5204;
                        C6739 c67312 = c6739M28693;
                        objM28681 = objM28680;
                        c6739M28692 = c67312;
                        break;
                    case 42:
                        C6615 c66133 = this.f6341;
                        if (c66133.f20355 == EnumC15204.f46543) {
                            iM42027 = c66133.f20360;
                        } else {
                            iM42027 = C17987.m42027(c66133.f20357);
                            if (iM42027 == -1) {
                                throw C19462.m44860(this.f6339, this.f6341.f20363, "Array type code expected", new Object[0]);
                            }
                        }
                        this.f6341.m18126();
                        c6739M28692 = new C6739(iM42027);
                        break;
                    case 43:
                    case 44:
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    case 46:
                        z = false;
                        enumC10932 = EnumC10932.f32947;
                        c6739M28692 = c23732.m52383(enumC10932, null, z);
                        break;
                    case 47:
                        c6739M28692 = this.f6340.m28680(1, enumC15536M50570.m36618());
                        break;
                    case 48:
                        c6739M28692 = this.f6340.m28680(2, enumC15536M50570.m36618());
                        break;
                    case 49:
                    case 50:
                    case 51:
                        c6739M28692 = c23732.m52383(null, null, false);
                        break;
                    case 52:
                    case 53:
                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                        z = false;
                        enumC10932 = EnumC10932.f32924;
                        c6739M28692 = c23732.m52383(enumC10932, null, z);
                        break;
                    case 56:
                        z = false;
                        enumC10932 = EnumC10932.f32936;
                        c6739M28692 = c23732.m52383(enumC10932, null, z);
                        break;
                    case 57:
                    case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                        EnumC10932 enumC10933 = EnumC10932.f32936;
                        EnumC10932 enumC10934 = EnumC10932.f32941;
                        if (Modifier.isInterface(this.f6340.f35026.f37140)) {
                            enumC10934 = enumC10933;
                            enumC10933 = enumC10934;
                        }
                        c6739M28692 = c23732.m52383(enumC10933, enumC10934, false);
                        break;
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    case 60:
                    case 61:
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
                    case 73:
                    case 74:
                    case 75:
                    case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                    case 77:
                    case 78:
                        c6739M28692 = m47746();
                        break;
                    case 79:
                        c6739M28693 = c23732.m52383(EnumC10932.f32941, null, false);
                        this.f6341.m18132(EnumC15204.f46591);
                        objM28680 = this.f6340.m28679(1);
                        C6739 c67313 = c6739M28693;
                        objM28681 = objM28680;
                        c6739M28692 = c67313;
                        break;
                    case 80:
                        z = false;
                        enumC10932 = EnumC10932.f32942;
                        c6739M28692 = c23732.m52383(enumC10932, null, z);
                        break;
                    case 81:
                        c6739M28693 = c23732.m52383(EnumC10932.f32947, null, false);
                        this.f6341.m18132(EnumC15204.f46591);
                        objM28680 = this.f6340.m28679(1);
                        C6739 c67314 = c6739M28693;
                        objM28681 = objM28680;
                        c6739M28692 = c67314;
                        break;
                    case 82:
                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                    case 84:
                        enumC15536M50570 = C22593.m50569(Integer.valueOf((enumC15536M50570.m36614().intValue() << 8) | this.f6340.m28679(1).f20943));
                        c6739M28692 = null;
                        break;
                    default:
                        c6739M28692 = null;
                        break;
                }
                enumC15536 = enumC15536M50570;
                c6739 = c6739M28692;
                obj = objM28681;
                this.f6340.f35018.m22777(j, enumC15536, c6739, obj);
                return;
            }
            c6619.m18126();
            C8815 c88110 = this.f6340.f35018;
            C6698 c6698M22775 = c88110.m22775(str);
            if (c6698M22775.f67378) {
                c88110.f26853.mo9065(j, "Label {0} redeclared", str);
            } else {
                c6698M22775.f67378 = true;
                c6698M22775.f20943 = c88110.f26842;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C6739 m47746() {
        int i = C6799.f21090[this.f6341.f20355.ordinal()];
        if (i == 1) {
            C6615 c6615 = this.f6341;
            int i2 = c6615.f20360 * c6615.f20353;
            c6615.m18126();
            return new C6739(i2);
        }
        if (i == 3) {
            C6615 c6616 = this.f6341;
            String str = c6616.f20350;
            c6616.m18126();
            C6698 c6698M22775 = this.f6340.f35018.m22775(str);
            c6698M22775.f67377 = true;
            return c6698M22775;
        }
        this.f6339.mo11946("Label expected", new Object[0]);
        throw new C12136();
    }
}
