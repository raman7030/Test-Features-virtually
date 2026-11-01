package p067l;

import com.google.android.material.slider.BaseSlider;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.᩷ܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 67EL */
/* JADX INFO: loaded from: classes5.dex */
public final class C22242 extends C4136 {

    /* JADX INFO: renamed from: ᩳ */
    public final C24923 f70315;

    public C22242(C13524 c13524, C24923 c24923) {
        this.f9120 = c13524.f9120;
        this.f9122 = c13524.f9122;
        this.f9121 = c13524;
        this.f70315 = c24923;
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
    /* JADX INFO: renamed from: ֫ */
    public final void m50075() {
        char c;
        C8773 c8773M30740;
        C20726 c20726M24751;
        int iM44277;
        boolean z;
        EnumC12758 enumC12758;
        Object objM30728;
        EnumC17134 enumC17134;
        C8773 c8773;
        Object obj;
        C8655 c8655 = this.f9122;
        EnumC16818 enumC16818 = c8655.f23232;
        EnumC16818 enumC16819 = EnumC16818.f49668;
        if (enumC16818 == enumC16819) {
            c8655.m20078();
        }
        C8655 c8656 = this.f9122;
        if (c8656.f23232 == enumC16819) {
            c8656.m20078();
        }
        C8655 c8657 = this.f9122;
        if (c8657.f23232 == EnumC16818.f49722) {
            c8657.m20078();
        }
        while (true) {
            EnumC16818 enumC168110 = this.f9122.f23232;
            EnumC16818 enumC168111 = EnumC16818.f49736;
            if (enumC168110 != enumC168111 && !enumC168110.m38121(EnumC16818.f49720, EnumC16818.f49630, EnumC16818.f49602)) {
                return;
            }
            C8655 c8658 = this.f9122;
            String str = c8658.f23234;
            long j = c8658.f23240;
            c8658.m20078();
            C8655 c8659 = this.f9122;
            if (c8659.f23232 != EnumC16818.f49722) {
                EnumC17134 enumC17134M52912 = C23841.m52912(str);
                if (enumC17134M52912 == null) {
                    throw C20865.m47156(this.f9120, j, "Invalid mnemocode ({0})", new Object[]{str});
                }
                EnumC23171 enumC23171M38776 = enumC17134M52912.m38776();
                C8655 c86510 = this.f9122;
                String strM16053 = C6988.m16053("parseInstr: MnemoCode '", enumC17134M52912.m38779(), "'");
                if (c86510.f9120.m48080()) {
                    long jM13865 = c86510.f9120.m13865(j);
                    c = 0;
                    c86510.m20079(String.format("[%4d,%-2d] ", Long.valueOf(jM13865), Long.valueOf(((C7196) c86510.f9120.m48082()).m16531(jM13865, j))).concat(strM16053));
                } else {
                    c = 0;
                }
                int i = C8830.f23970[enumC23171M38776.ordinal()];
                Object objM30729 = null;
                objM30729 = null;
                objM30729 = null;
                objM30729 = null;
                objM30729 = null;
                objM30729 = null;
                objM30729 = null;
                objM30729 = null;
                objM30729 = null;
                C8773 c8773M30741 = null;
                objM30729 = null;
                if (i != 1) {
                    if (i == 2) {
                        c8773M30740 = this.f9121.m30740();
                        if (enumC17134M52912 == EnumC17134.f50696) {
                            this.f9122.m20084(EnumC16818.f49716);
                            objM30729 = this.f9121.m30728(2, enumC17134M52912.m38779());
                        }
                    } else {
                        if (i != 3 && i != 4) {
                            C6091 c6091 = this.f9120;
                            long j2 = this.f9122.f23241;
                            Object[] objArr = new Object[1];
                            objArr[c] = str;
                            throw C20865.m47156(c6091, j2, "Invalid mnemocode ({0})", objArr);
                        }
                        enumC17134 = enumC17134M52912;
                        c8773 = null;
                        obj = null;
                    }
                    this.f9121.f38018.m24747(j, enumC17134, c8773, obj);
                    return;
                }
                int i2 = C8830.f23969[enumC17134M52912.ordinal()];
                C24923 c24923 = this.f70315;
                switch (i2) {
                    case 1:
                        while (true) {
                            C8655 c86511 = this.f9122;
                            if (c86511.f23232 == EnumC16818.f49736) {
                                EnumC17134 enumC17134M52913 = C23841.m52912(c86511.f23227);
                                if (enumC17134M52913 == null) {
                                    C6091 c6092 = this.f9120;
                                    C8655 c86512 = this.f9122;
                                    throw C20865.m47156(c6092, c86512.f23240, "Unknown bytecode ({0})", new Object[]{c86512.f23227});
                                }
                                this.f9121.f38018.m24747(j, EnumC17134.f50602, new C8773(enumC17134M52913.m38775().intValue()), null);
                                this.f9122.m20078();
                            } else {
                                C13524 c13524 = this.f9121;
                                c13524.f38018.m24747(j, EnumC17134.f50602, c13524.m30727(1), null);
                            }
                            C8655 c86513 = this.f9122;
                            if (c86513.f23232 != EnumC16818.f49716) {
                                return;
                            } else {
                                c86513.m20078();
                            }
                        }
                        break;
                    case 2:
                        while (true) {
                            C13524 c13525 = this.f9121;
                            C10746 c10746 = c13525.f38018;
                            long j3 = this.f9122.f23240;
                            C8655 c86514 = c13525.f9122;
                            String str2 = c86514.f23234;
                            c86514.m20084(EnumC16818.f49736);
                            C11417 c11417M24746 = c10746.m24746(j3, str2);
                            if (c11417M24746.f31861 != -1) {
                                c10746.f29778.mo13866("<try {0}> redeclared", str2);
                            } else {
                                c11417M24746.f31861 = c10746.f29767;
                            }
                            C8655 c86515 = this.f9122;
                            if (c86515.f23232 != EnumC16818.f49716) {
                                return;
                            } else {
                                c86515.m20078();
                            }
                        }
                        break;
                    case 3:
                        while (true) {
                            C13524 c13526 = this.f9121;
                            C10746 c10747 = c13526.f38018;
                            long j4 = this.f9122.f23240;
                            C8655 c86516 = c13526.f9122;
                            String str3 = c86516.f23234;
                            c86516.m20084(EnumC16818.f49736);
                            C11417 c11417M24747 = c10747.m24746(j4, str3);
                            if (c11417M24747.f31860 != -1) {
                                c10747.f29778.mo13866("<endtry {0}> redeclared", str3);
                            } else {
                                c11417M24747.f31860 = c10747.f29767;
                            }
                            C8655 c86517 = this.f9122;
                            if (c86517.f23232 != EnumC16818.f49716) {
                                return;
                            } else {
                                c86517.m20078();
                            }
                        }
                        break;
                    case 4:
                        C13524 c13527 = this.f9121;
                        C10746 c10748 = c13527.f38018;
                        long j5 = this.f9122.f23240;
                        C8655 c86518 = c13527.f9122;
                        String str4 = c86518.f23234;
                        c86518.m20084(enumC168111);
                        C17450 c17450M54790 = c24923.m54790(EnumC12758.f35925, null, false);
                        C11417 c11417M24748 = c10748.m24746(j5, str4);
                        c11417M24748.f70060 = true;
                        int i3 = c10748.f29767;
                        C19502 c19502 = new C19502();
                        c19502.f59404 = j5;
                        c19502.f59403 = c11417M24748;
                        c19502.f59406 = i3;
                        c19502.f59405 = c17450M54790;
                        c10748.f29777.f20859.add(c19502);
                        return;
                    case 5:
                        while (true) {
                            this.f9121.m30732(EnumC17134.f50932);
                            C8655 c86519 = this.f9122;
                            if (c86519.f23232 != EnumC16818.f49716) {
                                return;
                            } else {
                                c86519.m20078();
                            }
                        }
                        break;
                    case 6:
                        while (true) {
                            this.f9121.m30737(EnumC17134.f50932);
                            C8655 c86520 = this.f9122;
                            if (c86520.f23232 != EnumC16818.f49716) {
                                return;
                            } else {
                                c86520.m20078();
                            }
                        }
                        break;
                    case 7:
                        while (true) {
                            this.f9121.m30732(EnumC17134.f50723);
                            C8655 c86521 = this.f9122;
                            if (c86521.f23232 != EnumC16818.f49716) {
                                return;
                            } else {
                                c86521.m20078();
                            }
                        }
                        break;
                    case 8:
                        while (true) {
                            this.f9121.m30737(EnumC17134.f50723);
                            C8655 c86522 = this.f9122;
                            if (c86522.f23232 != EnumC16818.f49716) {
                                return;
                            } else {
                                c86522.m20078();
                            }
                        }
                        break;
                    case 9:
                        C20726 c20726M24752 = this.f9121.f38018.m24751();
                        if (c20726M24752.f63964 != null) {
                            this.f9120.mo11117(this.f9122.f23240, "{0} redeclared", EnumC17134.f50913.m38779());
                        }
                        C7945 c7945 = new C7945();
                        c20726M24752.f63964 = c7945;
                        c20726M24752.m46801(this.f9122.f23240);
                        if (this.f9122.f23232 == EnumC16818.f49604) {
                            return;
                        }
                        while (true) {
                            this.f9121.m30731(c7945);
                            C8655 c86523 = this.f9122;
                            if (c86523.f23232 != EnumC16818.f49716) {
                                return;
                            } else {
                                c86523.m20078();
                            }
                        }
                        break;
                    case 10:
                        C20726 c20726M24753 = this.f9121.f38018.m24751();
                        if (c20726M24753.f63966 != null) {
                            this.f9120.mo11117(this.f9122.f23240, "{0} redeclared", EnumC17134.f50921.m38779());
                        }
                        C7945 c7946 = new C7945();
                        c20726M24753.f63966 = c7946;
                        c20726M24753.m46801(this.f9122.f23240);
                        if (this.f9122.f23232 == EnumC16818.f49604) {
                            return;
                        }
                        while (true) {
                            this.f9121.m30731(c7946);
                            C8655 c86524 = this.f9122;
                            if (c86524.f23232 != EnumC16818.f49716) {
                                return;
                            } else {
                                c86524.m20078();
                            }
                        }
                        break;
                    case 11:
                        C20726 c20726M24754 = this.f9121.f38018.m24751();
                        if (!c20726M24754.m46807()) {
                            this.f9120.mo11117(this.f9122.f23240, "{0} are only eligible in stack_map_frame {1}", EnumC17134.f50833.m38779(), EnumC24233.EARLY_LARVAL.m53547());
                        }
                        if (c20726M24754.f63965 != null) {
                            this.f9120.mo11117(this.f9122.f23240, "{0} redeclared", EnumC17134.f50833.m38779());
                        }
                        C7945 c7947 = new C7945();
                        c20726M24754.f63965 = c7947;
                        c20726M24754.m46801(this.f9122.f23240);
                        C8655 c86525 = this.f9122;
                        if (c86525.f23232 == EnumC16818.f49604) {
                            c86525.m20078();
                            C8655 c86526 = this.f9122;
                            Object[] objArr2 = {EnumC17134.f50745.m38779(), EnumC17134.f50701.m38779()};
                            ArrayList arrayList = new ArrayList(2);
                            int iM25047 = 0;
                            while (iM25047 < 2) {
                                Object obj2 = objArr2[iM25047];
                                iM25047 = C10878.m25047(obj2, arrayList, obj2, iM25047, 1);
                            }
                            c86526.m20080(C21562.unmodifiableList(arrayList), EnumC16818.f49706, EnumC16818.f49601);
                        } else {
                            while (true) {
                                this.f9121.m30736(c7947);
                                C8655 c86527 = this.f9122;
                                if (c86527.f23232 != EnumC16818.f49716) {
                                    c86527.m20084(EnumC16818.f49604);
                                    C8655 c86528 = this.f9122;
                                    Object[] objArr3 = {EnumC17134.f50745.m38779(), EnumC17134.f50701.m38779()};
                                    ArrayList arrayList2 = new ArrayList(2);
                                    int iM25048 = 0;
                                    while (iM25048 < 2) {
                                        Object obj3 = objArr3[iM25048];
                                        iM25048 = C10878.m25047(obj3, arrayList2, obj3, iM25048, 1);
                                    }
                                    c86528.m20080(C21562.unmodifiableList(arrayList2), EnumC16818.f49706, EnumC16818.f49601);
                                } else {
                                    c86527.m20078();
                                }
                            }
                        }
                        EnumC17134 enumC17135 = EnumC17134.f50711;
                        this.f9122.m20078();
                        c20726M24751 = this.f9121.f38018.m24751();
                        if (c20726M24751.m46808()) {
                            if (c20726M24751.m46807()) {
                                C10746 c10749 = this.f9121.f38018;
                                C20726 c20726 = new C20726(c10749.f29778, c10749.f29768.f44273.m52373());
                                c10749.f29787.add(c20726);
                                c20726M24751 = c20726;
                            } else {
                                this.f9120.mo11117(this.f9122.f23240, "A method''s Code attribute already has a StackMapTable attribute", new Object[0]);
                            }
                        }
                        c20726M24751.m46801(this.f9122.f23240);
                        C8655 c86529 = this.f9121.f9122;
                        String str5 = c86529.f23234;
                        c86529.m20084(EnumC16818.f49736);
                        c20726M24751.m46802(str5);
                        return;
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        c20726M24751 = this.f9121.f38018.m24751();
                        if (c20726M24751.m46808()) {
                            if (c20726M24751.m46807()) {
                                C10746 c107410 = this.f9121.f38018;
                                C20726 c20727 = new C20726(c107410.f29778, c107410.f29768.f44273.m52373());
                                c107410.f29787.add(c20727);
                                c20726M24751 = c20727;
                            } else {
                                this.f9120.mo11117(this.f9122.f23240, "A method''s Code attribute already has a StackMapTable attribute", new Object[0]);
                            }
                        }
                        c20726M24751.m46801(this.f9122.f23240);
                        C8655 c865210 = this.f9121.f9122;
                        String str6 = c865210.f23234;
                        c865210.m20084(EnumC16818.f49736);
                        c20726M24751.m46802(str6);
                        return;
                    case 16:
                        C20726 c20726M24755 = this.f9121.f38018.m24751();
                        if (c20726M24755.m46808()) {
                            this.f9120.mo11117(this.f9122.f23240, "A method''s Code attribute already has a StackMapTable attribute", new Object[0]);
                        }
                        c20726M24755.m46801(this.f9122.f23240);
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
                        c8773M30740 = this.f9121.m30740();
                        break;
                    case 39:
                        c8773M30741 = this.f9121.m30740();
                        this.f9122.m20084(EnumC16818.f49716);
                        objM30728 = this.f9121.m30728(1, enumC17134M52912.m38779());
                        C8773 c8774 = c8773M30741;
                        objM30729 = objM30728;
                        c8773M30740 = c8774;
                        break;
                    case 40:
                    case 41:
                        this.f9122.m20084(EnumC16818.f49767);
                        C6091 c6093 = this.f9120;
                        C7314 c7314 = new C7314();
                        c7314.f19137 = null;
                        c7314.f19142 = new ArrayList();
                        c7314.f19143 = new ArrayList();
                        c7314.f19139 = c6093;
                        int i4 = 0;
                        while (true) {
                            int i5 = C23841.f75751;
                            if (i4 < 2048) {
                                int i6 = C8830.f23968[this.f9122.f23232.ordinal()];
                                if (i6 == 1) {
                                    C8655 c86530 = this.f9122;
                                    int i7 = c86530.f23237 * c86530.f23230;
                                    c86530.m20078();
                                    this.f9122.m20084(EnumC16818.f49722);
                                    C8773 c8773M50076 = m50076();
                                    c7314.f19143.add(Integer.valueOf(i7));
                                    c7314.f19142.add(c8773M50076);
                                    i4++;
                                    C8655 c86531 = this.f9122;
                                    if (c86531.f23232 == EnumC16818.f49604) {
                                        c86531.m20078();
                                    }
                                } else if (i6 == 2) {
                                    this.f9122.m20078();
                                    this.f9122.m20084(EnumC16818.f49722);
                                    if (c7314.f19137 != null) {
                                        this.f9120.mo13866("Default statement already declared in this table", new Object[0]);
                                    }
                                    c7314.f19137 = m50076();
                                    C8655 c86532 = this.f9122;
                                    if (c86532.f23232 == EnumC16818.f49604) {
                                        c86532.m20078();
                                    }
                                }
                                C8773 c8775 = c8773M30741;
                                objM30729 = objM30728;
                                c8773M30740 = c8775;
                            } else {
                                this.f9120.mo13866("Switch table is too long {0}", 2048);
                            }
                            break;
                        }
                        this.f9122.m20084(EnumC16818.f49567);
                        objM30728 = c7314;
                        C8773 c8776 = c8773M30741;
                        objM30729 = objM30728;
                        c8773M30740 = c8776;
                        break;
                    case 42:
                        C8655 c86533 = this.f9122;
                        if (c86533.f23232 == EnumC16818.f49668) {
                            iM44277 = c86533.f23237;
                        } else {
                            iM44277 = C19463.m44277(c86533.f23234);
                            if (iM44277 == -1) {
                                throw C20865.m47156(this.f9120, this.f9122.f23240, "Array type code expected", new Object[0]);
                            }
                        }
                        this.f9122.m20078();
                        c8773M30740 = new C8773(iM44277);
                        break;
                    case 43:
                    case 44:
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    case 46:
                        z = false;
                        enumC12758 = EnumC12758.f35925;
                        c8773M30740 = c24923.m54790(enumC12758, null, z);
                        break;
                    case 47:
                        c8773M30740 = this.f9121.m30728(1, enumC17134M52912.m38779());
                        break;
                    case 48:
                        c8773M30740 = this.f9121.m30728(2, enumC17134M52912.m38779());
                        break;
                    case 49:
                    case 50:
                    case 51:
                        c8773M30740 = c24923.m54790(null, null, false);
                        break;
                    case 52:
                    case 53:
                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                        z = false;
                        enumC12758 = EnumC12758.f35902;
                        c8773M30740 = c24923.m54790(enumC12758, null, z);
                        break;
                    case 56:
                        z = false;
                        enumC12758 = EnumC12758.f35914;
                        c8773M30740 = c24923.m54790(enumC12758, null, z);
                        break;
                    case 57:
                    case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                        EnumC12758 enumC12759 = EnumC12758.f35914;
                        EnumC12758 enumC127510 = EnumC12758.f35919;
                        if (Modifier.isInterface(this.f9121.f38026.f40157)) {
                            enumC127510 = enumC12759;
                            enumC12759 = enumC127510;
                        }
                        c8773M30740 = c24923.m54790(enumC12759, enumC127510, false);
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
                        c8773M30740 = m50076();
                        break;
                    case 79:
                        c8773M30741 = c24923.m54790(EnumC12758.f35919, null, false);
                        this.f9122.m20084(EnumC16818.f49716);
                        objM30728 = this.f9121.m30727(1);
                        C8773 c8777 = c8773M30741;
                        objM30729 = objM30728;
                        c8773M30740 = c8777;
                        break;
                    case 80:
                        z = false;
                        enumC12758 = EnumC12758.f35920;
                        c8773M30740 = c24923.m54790(enumC12758, null, z);
                        break;
                    case 81:
                        c8773M30741 = c24923.m54790(EnumC12758.f35925, null, false);
                        this.f9122.m20084(EnumC16818.f49716);
                        objM30728 = this.f9121.m30727(1);
                        C8773 c8778 = c8773M30741;
                        objM30729 = objM30728;
                        c8773M30740 = c8778;
                        break;
                    case 82:
                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                    case 84:
                        enumC17134M52912 = C23841.m52911(Integer.valueOf((enumC17134M52912.m38775().intValue() << 8) | this.f9121.m30727(1).f23817));
                        c8773M30740 = null;
                        break;
                    default:
                        c8773M30740 = null;
                        break;
                }
                enumC17134 = enumC17134M52912;
                c8773 = c8773M30740;
                obj = objM30729;
                this.f9121.f38018.m24747(j, enumC17134, c8773, obj);
                return;
            }
            c8659.m20078();
            C10746 c107411 = this.f9121.f38018;
            C8734 c8734M24745 = c107411.m24745(str);
            if (c8734M24745.f70061) {
                c107411.f29778.mo11117(j, "Label {0} redeclared", str);
            } else {
                c8734M24745.f70061 = true;
                c8734M24745.f23817 = c107411.f29767;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C8773 m50076() {
        int i = C8830.f23968[this.f9122.f23232.ordinal()];
        if (i == 1) {
            C8655 c8655 = this.f9122;
            int i2 = c8655.f23237 * c8655.f23230;
            c8655.m20078();
            return new C8773(i2);
        }
        if (i == 3) {
            C8655 c8656 = this.f9122;
            String str = c8656.f23227;
            c8656.m20078();
            C8734 c8734M24745 = this.f9121.f38018.m24745(str);
            c8734M24745.f70060 = true;
            return c8734M24745;
        }
        this.f9120.mo13866("Label expected", new Object[0]);
        throw new C13902();
    }
}
