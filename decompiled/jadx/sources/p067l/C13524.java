package p067l;

import com.google.android.material.motion.MotionUtils;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۨܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes4.dex */
public final class C13524 extends C4136 {

    /* JADX INFO: renamed from: ۖ */
    public final C22242 f38013;

    /* JADX INFO: renamed from: ۡ */
    public C23563 f38017;

    /* JADX INFO: renamed from: ۢ */
    public C10746 f38018;

    /* JADX INFO: renamed from: ܿ */
    public final C9759 f38021;

    /* JADX INFO: renamed from: ᩳ */
    public final C24511 f38022;

    /* JADX INFO: renamed from: ᩴ */
    public C7748 f38023;

    /* JADX INFO: renamed from: ᩷ */
    public final C24923 f38025;

    /* JADX INFO: renamed from: ۜ */
    public final ArrayList f38016 = new ArrayList();

    /* JADX INFO: renamed from: ֨ */
    public C5263 f38012 = null;

    /* JADX INFO: renamed from: ᩻ */
    public C15496 f38026 = null;

    /* JADX INFO: renamed from: ֡ */
    public String f38011 = null;

    /* JADX INFO: renamed from: ۚ */
    public String f38015 = "";

    /* JADX INFO: renamed from: ᩵ */
    public ArrayList f38024 = null;

    /* JADX INFO: renamed from: ܳ */
    public ArrayList f38019 = null;

    /* JADX INFO: renamed from: ۘ */
    public ArrayList f38014 = null;

    /* JADX INFO: renamed from: ܺ */
    public boolean f38020 = false;

    public C13524(C6091 c6091, C23563 c23563) {
        this.f9120 = c6091;
        this.f9122 = new C8655(c6091);
        this.f9121 = this;
        C24923 c24923 = new C24923(this);
        this.f38025 = c24923;
        this.f38022 = new C24511(this);
        this.f38013 = new C22242(this, c24923);
        C9759 c9759 = new C9759();
        c9759.f9120 = this.f9120;
        c9759.f9122 = this.f9122;
        c9759.f9121 = this;
        this.f38021 = c9759;
        this.f38017 = C23563.m52363(c23563);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m30742() {
        this.f9122.getClass();
        this.f38025.getClass();
        this.f38022.getClass();
        this.f38013.getClass();
        this.f38021.getClass();
    }

    /* JADX INFO: renamed from: ᩶ */
    private C8537 m30723() {
        C8655 c8655 = this.f9122;
        if (c8655.f23232 == EnumC16818.f49667) {
            c8655.m20078();
            C8655 c8656 = this.f9122;
            EnumC16818 enumC16818 = c8656.f23232;
            EnumC16818 enumC16819 = EnumC16818.f49668;
            if (enumC16818 == enumC16819) {
                int i = c8656.f23237;
                c8656.m20078();
                C8655 c8657 = this.f9122;
                if (c8657.f23232 == EnumC16818.f49722) {
                    c8657.m20078();
                    C8655 c8658 = this.f9122;
                    if (c8658.f23232 == enumC16819) {
                        int i2 = c8658.f23237;
                        this.f38026.f44273.m52367(i, i2);
                        this.f9122.m20078();
                        "parseVersion: ".concat(this.f38026.f44273.m52365());
                        return new C8537(Integer.valueOf(i), Integer.valueOf(i2));
                    }
                }
            }
        }
        throw C20865.m47156(this.f9120, this.f9122.f23240, "class file version expected", new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0128  */
    /* JADX WARN: Code duplicated, block: B:50:0x012e A[LOOP:0: B:38:0x0112->B:50:0x012e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [l.ܳۤۚ] */
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
    /* JADX INFO: renamed from: ֫ */
    public final void m30732(EnumC17134 enumC17134) {
        char c;
        ArrayList arrayList;
        EnumC24866 enumC24866M11900;
        C5420 c5420;
        boolean z;
        C8655 c8655 = this.f9122;
        long j = c8655.f23240;
        if (c8655.f23232 != EnumC16818.f49668) {
            this.f9120.m13871(j, "A valid index into the local variable array of the current frame expected", new Object[0]);
            throw null;
        }
        final int i = c8655.f23237;
        C8773 c8773 = this.f38018.f29783;
        if (i >= 0) {
            if (i < c8773.f23817) {
                c8655.m20078();
                C17450 c17450M30738 = m30738();
                this.f9122.m20084(EnumC16818.f49722);
                long j2 = this.f9122.f23240;
                C17450 c17450M30739 = m30738();
                EnumC17134 enumC17135 = EnumC17134.f50932;
                if (enumC17134 == enumC17135) {
                    if (EnumC24866.m54622(((String) c17450M30739.f52180.f10654).charAt(0)) == null) {
                        this.f9120.m13871(j2, "Valid field descriptor of the local variable \"{0}\" expected instead of \"{1}\"", Integer.valueOf(i), c17450M30739.f52180.f10654.toString());
                        throw null;
                    }
                } else {
                    EnumC17134 enumC17136 = EnumC17134.f50723;
                    if (enumC17134 == enumC17136) {
                        try {
                            new C12869(c17450M30739.f52180.f10654.toString()).m29496((C12102) null).toString();
                        } catch (Exception unused) {
                            this.f9120.mo13869(j2, "Invalid field signature found for local variable in slot \"{0}\": \"{1}\"", Integer.valueOf(i), c17450M30739.f52180.f10654.toString());
                        }
                    } else {
                        this.f9120.m13871(j2, "Either \"{0}\" or \"{1}\" token is expected", enumC17135.m38779(), enumC17136.m38779());
                        throw null;
                    }
                }
                C10746 c10746 = this.f38018;
                C8773 c8774 = c10746.f29783;
                C7945 c7945 = c10746.f29784;
                C13467 c13467 = c10746.f29780;
                C6091 c6091 = c10746.f29778;
                C5420 c5421 = new C5420((short) i, (short) c10746.f29767, c17450M30738, c17450M30739);
                if (enumC17134 == EnumC17134.f50932) {
                    arrayList = c10746.f29771;
                    enumC24866M11900 = c5421.m11900();
                    if (c10746.f29775 == null) {
                        C9286 c9286 = new C9286(c13467.f40167, EnumC6799.f17642);
                        c10746.f29775 = c9286;
                        c7945.m18356(c9286);
                    }
                    c10746.f29775.m21502(c5421);
                } else {
                    arrayList = c10746.f29766;
                    C9286 c9287 = c10746.f29775;
                    enumC24866M11900 = (c9287 == 0 || (c5420 = (C5420) c9287.m21499((C16109) new Predicate() { // from class: l.ܳۤۚ
                        @Override // java.util.function.Predicate
                        public /* synthetic */ Predicate and(Predicate predicate) {
                            return C20697.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* JADX INFO: renamed from: negate */
                        public /* synthetic */ Predicate mo55838negate() {
                            return C20697.$default$negate(this);
                        }

                        /* JADX INFO: renamed from: or */
                        public /* synthetic */ Predicate m36652or(Predicate predicate) {
                            return C20697.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return ((C5420) obj).m11902() == i;
                        }
                    }).orElse(null)) == null) ? null : c5420.m11900();
                    if (c10746.f29781 == null) {
                        C9286 c9288 = new C9286(c13467.f40167, EnumC6799.f17644);
                        c10746.f29781 = c9288;
                        c7945.m18356(c9288);
                    }
                    c10746.f29781.m21502(c5421);
                }
                if (enumC24866M11900 == null) {
                    c6091.m13871(j, "Field type isn't declared for the slot \"{0}\"", Integer.valueOf(i));
                    throw null;
                }
                c5421.f12911 = enumC24866M11900;
                for (int i2 = 0; i2 < enumC24866M11900.m54624(); i2++) {
                    int i3 = i + i2;
                    if (i3 >= 0) {
                        z = i3 < c8774.f23817;
                        if (z) {
                            c6091.m13871(j, "The index in the local variable array \"{0}\" is not in the range [0..{1}] [0..Code_attribute.max_locals-1]", Integer.valueOf(i3), Integer.valueOf(c8774.f23817 - 1));
                            throw null;
                        }
                        if (arrayList.get(i3) == null) {
                            c6091.m13871(j, "The slot \"{0}\" is occupied by another local variable", Integer.valueOf(i3));
                            throw null;
                        }
                        arrayList.set(i3, c5421);
                    } else {
                        c8774.getClass();
                    }
                    if (z) {
                        c6091.m13871(j, "The index in the local variable array \"{0}\" is not in the range [0..{1}] [0..Code_attribute.max_locals-1]", Integer.valueOf(i3), Integer.valueOf(c8774.f23817 - 1));
                        throw null;
                    }
                    if (arrayList.get(i3) == null) {
                        c6091.m13871(j, "The slot \"{0}\" is occupied by another local variable", Integer.valueOf(i3));
                        throw null;
                    }
                    arrayList.set(i3, c5421);
                }
                return;
            }
            c = 0;
        } else {
            c = 0;
            c8773.getClass();
        }
        C6091 c6092 = this.f9120;
        Integer numValueOf = Integer.valueOf(i);
        Integer numValueOf2 = Integer.valueOf(this.f38018.f29783.f23817 - 1);
        Object[] objArr = new Object[2];
        objArr[c] = numValueOf;
        objArr[1] = numValueOf2;
        c6092.m13871(j, "The index in the local variable array \"{0}\" is not in the range [0..{1}] [0..Code_attribute.max_locals-1]", objArr);
        throw null;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C8773 m30740() {
        C8655 c8655 = this.f9122;
        if (c8655.f23232 != EnumC16818.f49668) {
            throw C20865.m47156(this.f9120, c8655.f23240, "A valid index into the local variable array of the current frame expected", new Object[0]);
        }
        int i = c8655.f23237;
        c8655.m20078();
        return new C8773(i);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:52:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0094 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۧ */
    public final void m30737(EnumC17134 enumC17134) {
        boolean z;
        EnumC17134 enumC17135;
        Object obj;
        C5420 c5420;
        int i;
        int iM54624;
        int i2;
        int i3;
        C8655 c8655 = this.f9122;
        long j = c8655.f23240;
        if (c8655.f23232 != EnumC16818.f49668) {
            throw C20865.m47156(this.f9120, j, "A valid index into the local variable array of the current frame expected", new Object[0]);
        }
        int i4 = c8655.f23237;
        C10746 c10746 = this.f38018;
        short s = (short) i4;
        ArrayList arrayList = c10746.f29766;
        ArrayList arrayList2 = c10746.f29771;
        C6091 c6091 = c10746.f29778;
        C8773 c8773 = c10746.f29783;
        if (s >= 0) {
            z = s < c8773.f23817;
            if (z) {
                c6091.m13871(j, "The index in the local variable array \"{0}\" is not in the range [0..{1}] [0..Code_attribute.max_locals-1]", Short.valueOf(s), Integer.valueOf(c8773.f23817 - 1));
                throw null;
            }
            enumC17135 = EnumC17134.f50932;
            if (enumC17134 == enumC17135) {
                obj = arrayList2.get(s);
            } else {
                obj = arrayList.get(s);
            }
            c5420 = (C5420) obj;
            if (c5420 != null) {
                c6091.m13871(j, "Local variable isn't declared for the slot \"{0}\"", Short.valueOf(s));
                throw null;
            }
            c5420.m11901(c10746.f29767);
            if (enumC17134 == enumC17135) {
                arrayList = arrayList2;
            }
            i = 0;
            while (true) {
                if (c5420.m11900() == null) {
                    iM54624 = 0;
                } else {
                    iM54624 = c5420.f12911.m54624();
                }
                if (i < iM54624) {
                    this.f9122.m20078();
                    return;
                }
                if (i <= 0 && ((i3 = s + i) < 0 || i3 >= c8773.f23817)) {
                    break;
                }
                if (i > 0) {
                    i2 = s + i;
                    if (arrayList.get(i2) != null) {
                        throw C20865.m47156(c6091, j, "Local variable isn't declared for the slot \"{0}\"", new Object[]{Integer.valueOf(i2)});
                    }
                }
                arrayList.set(s + i, null);
                i++;
            }
            throw C20865.m47156(c6091, j, "The index in the local variable array \"{0}\" is not in the range [0..{1}] [0..Code_attribute.max_locals-1]", new Object[]{Integer.valueOf(i3), Integer.valueOf(c8773.f23817 - 1)});
        }
        c8773.getClass();
        if (z) {
            c6091.m13871(j, "The index in the local variable array \"{0}\" is not in the range [0..{1}] [0..Code_attribute.max_locals-1]", Short.valueOf(s), Integer.valueOf(c8773.f23817 - 1));
            throw null;
        }
        enumC17135 = EnumC17134.f50932;
        if (enumC17134 == enumC17135) {
            obj = arrayList2.get(s);
        } else {
            obj = arrayList.get(s);
        }
        c5420 = (C5420) obj;
        if (c5420 != null) {
            c6091.m13871(j, "Local variable isn't declared for the slot \"{0}\"", Short.valueOf(s));
            throw null;
        }
        c5420.m11901(c10746.f29767);
        if (enumC17134 == enumC17135) {
            arrayList = arrayList2;
        }
        i = 0;
        while (true) {
            if (c5420.m11900() == null) {
                iM54624 = 0;
            } else {
                iM54624 = c5420.f12911.m54624();
            }
            if (i < iM54624) {
                this.f9122.m20078();
                return;
            }
            if (i <= 0) {
            }
            if (i > 0) {
                i2 = s + i;
                if (arrayList.get(i2) != null) {
                    throw C20865.m47156(c6091, j, "Local variable isn't declared for the slot \"{0}\"", new Object[]{Integer.valueOf(i2)});
                }
            }
            arrayList.set(s + i, null);
            i++;
        }
        throw C20865.m47156(c6091, j, "The index in the local variable array \"{0}\" is not in the range [0..{1}] [0..Code_attribute.max_locals-1]", new Object[]{Integer.valueOf(i3), Integer.valueOf(c8773.f23817 - 1)});
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m30736(C7945 c7945) {
        C8655 c8655 = this.f9122;
        if (c8655.f23232 == EnumC16818.f49704) {
            int i = c8655.f23237;
            C11969 c11969 = new C11969();
            c11969.f33368 = null;
            c11969.f33367 = i;
            c7945.m18356(c11969);
            this.f9122.m20078();
            return;
        }
        C17450 c17450M30738 = m30738();
        this.f9122.m20084(EnumC16818.f49722);
        C17450 c17450M11356 = this.f38012.m11356((AbstractC4711) new C3251(c17450M30738, m30738()));
        C11969 c119610 = new C11969();
        c119610.f33367 = -1;
        c119610.f33368 = c17450M11356;
        c7945.m18356(c119610);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30731(C7945 c7945) {
        EnumC12758 enumC12758M44285;
        EnumC16818 enumC16818;
        EnumC15515 enumC15515M22083 = C9481.m22083(this.f9122.f23237, C18189.empty());
        C8655 c8655 = this.f9122;
        EnumC16818 enumC16819 = c8655.f23232;
        int i = c8655.f23237;
        String str = c8655.f23227;
        c8655.m20078();
        int i2 = C14864.f42366[enumC16819.ordinal()];
        C17450 c17450M11356 = null;
        if (i2 == 1) {
            enumC12758M44285 = null;
        } else if (i2 == 2) {
            enumC15515M22083 = EnumC15515.ITEM_Object;
            enumC12758M44285 = EnumC12758.f35925;
        } else if (i2 == 3) {
            enumC15515M22083 = EnumC15515.ITEM_Object;
            c17450M11356 = this.f38012.m11353(i);
            enumC12758M44285 = null;
        } else {
            if (i2 != 4) {
                enumC12758M44285 = null;
            } else {
                enumC15515M22083 = EnumC15515.m35307(str);
                enumC12758M44285 = C19463.m44285(str);
                if (enumC15515M22083 != null) {
                    if (enumC12758M44285 != null && (enumC16818 = this.f9122.f23232) != EnumC16818.f49604 && enumC16818 != EnumC16818.f49716) {
                        enumC15515M22083 = EnumC15515.ITEM_Object;
                    }
                } else if (enumC12758M44285 != null) {
                    enumC15515M22083 = EnumC15515.ITEM_Object;
                }
            }
            enumC15515M22083 = EnumC15515.ITEM_Bogus;
            this.f9120.mo13866("StackMap entry type expected instead of {0}", "<" + enumC16819.m38122() + ">");
        }
        int i3 = C14864.f42364[enumC15515M22083.ordinal()];
        if (i3 == 1) {
            if (c17450M11356 == null) {
                c17450M11356 = this.f38012.m11356(this.f38025.m54788(enumC12758M44285));
            }
            c7945.f20859.add(new C20055(enumC15515M22083, c17450M11356));
        } else {
            if (i3 == 2) {
                c7945.f20859.add(new C20055(enumC15515M22083, this.f38013.m50076()));
                return;
            }
            C5973 c5973 = new C5973();
            c5973.f14774 = enumC15515M22083;
            c7945.f20859.add(c5973);
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final C17450 m30738() {
        C8655 c8655 = this.f9122;
        EnumC16818 enumC16818 = c8655.f23232;
        if (enumC16818 == EnumC16818.f49704) {
            int i = c8655.f23237;
            c8655.m20078();
            return this.f38012.m11353(i);
        }
        if (enumC16818 == EnumC16818.f49772) {
            String str = c8655.f23227;
            c8655.m20078();
            return this.f38012.m11354(str);
        }
        if (enumC16818.m38124()) {
            C8655 c8656 = this.f9122;
            String str2 = c8656.f23234;
            c8656.m20078();
            return this.f38012.m11354(str2);
        }
        throw C20865.m47156(this.f9120, this.f9122.f23240, "Either name or Constant Pool index expected, got {0}", new Object[]{"\"" + this.f9122.f23232 + "\""});
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17450 m30729(EnumC18121 enumC18121) {
        int i = C14864.f42365[enumC18121.ordinal()];
        C24923 c24923 = this.f38025;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                return this.f38012.m11356(c24923.m54788(EnumC12758.f35902));
            case 5:
            case 6:
                c24923.m54792(true);
                EnumC12758 enumC12758 = EnumC12758.f35914;
                C17450 c17450M54790 = c24923.m54790(enumC12758, EnumC12758.f35919, false);
                c24923.m54792(false);
                m30697(this.f9120.m13868(), enumC12758, null);
                return c17450M54790;
            case 7:
            case 8:
                EnumC12758 enumC12759 = EnumC12758.f35914;
                EnumC12758 enumC127510 = EnumC12758.f35919;
                if (this.f38026.f44273.m52375() >= 52 && EnumC8140.m18877(this.f38026.f40157)) {
                    enumC127510 = enumC12759;
                    enumC12759 = enumC127510;
                }
                c24923.m54792(true);
                C17450 c17450M54791 = c24923.m54790(enumC12759, enumC127510, false);
                c24923.m54792(false);
                m30697(this.f9120.m13868(), enumC12759, enumC127510);
                return c17450M54791;
            case 9:
                c24923.m54792(true);
                EnumC12758 enumC127511 = EnumC12758.f35919;
                C17450 c17450M54792 = c24923.m54790(enumC127511, EnumC12758.f35914, false);
                c24923.m54792(false);
                m30697(this.f9120.m13868(), enumC127511, null);
                return c17450M54792;
            default:
                throw new C13902();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m30697(long j, EnumC12758 enumC12758, EnumC12758 enumC12759) {
        if (this.f9122.f23232.m38121(EnumC16818.f49722, EnumC16818.f49604, EnumC16818.f49716)) {
            return;
        }
        if (enumC12759 != null) {
            this.f9120.mo11117(j, "Wrong tag: Either {0} or {1} expected", enumC12758.m29301(), enumC12759.m29301());
        } else {
            this.f9120.mo11117(j, "Wrong tag: {0} expected", enumC12758.m29301());
        }
        C13902 c13902 = new C13902();
        c13902.m31626();
        throw c13902;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final EnumC18121 m30743() {
        EnumC18121 enumC18121M44283;
        int i = C14864.f42366[this.f9122.f23232.ordinal()];
        if (i != 1) {
            enumC18121M44283 = i != 4 ? null : C19463.m44284(this.f9122.f23227);
        } else {
            enumC18121M44283 = C19463.m44283(this.f9122.f23237);
        }
        if (enumC18121M44283 == null) {
            this.f9120.mo13866("Subtag expected", new Object[0]);
            throw new C13902();
        }
        this.f9122.m20078();
        return enumC18121M44283;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C17450 m30739() {
        C8655 c8655 = this.f9122;
        EnumC16818 enumC16818 = c8655.f23232;
        if (enumC16818 == EnumC16818.f49704) {
            int i = c8655.f23237;
            c8655.m20078();
            return this.f38012.m11353(i);
        }
        if (enumC16818 == EnumC16818.f49772 || enumC16818.m38124()) {
            C8655 c8656 = this.f9122;
            String str = c8656.f23227;
            c8656.m20078();
            C5263 c5263 = this.f38012;
            c5263.getClass();
            return c5263.m11356((AbstractC4711) new C18674(EnumC12758.f35894, c5263.m11354(str)));
        }
        m30698("Either package name or Constant Pool index expected, got {0}");
        throw null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C17450 m30735() {
        C8655 c8655 = this.f9122;
        EnumC16818 enumC16818 = c8655.f23232;
        if (enumC16818 == EnumC16818.f49704) {
            int i = c8655.f23237;
            c8655.m20078();
            return this.f38012.m11353(i);
        }
        if (enumC16818 == EnumC16818.f49772 || enumC16818.m38128()) {
            C8655 c8656 = this.f9122;
            String str = c8656.f23227;
            c8656.m20078();
            C5263 c5263 = this.f38012;
            c5263.getClass();
            return c5263.m11356((AbstractC4711) new C18674(EnumC12758.f35924, c5263.m11354(str)));
        }
        m30698("Either a module name or Constant Pool index expected, got {0}");
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17450 m30730(boolean z) {
        C8655 c8655 = this.f9122;
        EnumC16818 enumC16818 = c8655.f23232;
        if (enumC16818 == EnumC16818.f49704) {
            int i = c8655.f23237;
            c8655.m20078();
            return this.f38012.m11353(i);
        }
        if (enumC16818 != EnumC16818.f49772 && !enumC16818.m38124()) {
            m30698("Either a class name or Constant Pool index expected, got {0}");
            throw null;
        }
        C8655 c8656 = this.f9122;
        String strM25286 = c8656.f23227;
        c8656.m20078();
        if ((z || this.f9122.f23232 == EnumC16818.f49724) && !strM25286.contains("/") && !strM25286.contains("[")) {
            strM25286 = C10965.m25286(new StringBuilder(), this.f38015, strM25286);
        }
        return this.f38012.m11354(strM25286);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m30698(String str) {
        EnumC12758 enumC12758M44280 = C19463.m44280(this.f9122.f23232.m38125());
        this.f9120.m48090("Unrecognized token %s: %s", this.f9122.f23232.toString(), enumC12758M44280 == null ? "null" : enumC12758M44280.m29301());
        throw C20865.m47156(this.f9120, this.f9122.f23241, str, new Object[]{C22934.m51254(this.f9122.f23232, new StringBuilder("\""), "\"")});
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8773 m30728(int i, String str) {
        C8655 c8655 = this.f9122;
        if (c8655.f23232 == EnumC16818.f49697) {
            c8655.m20078();
        }
        C8655 c8656 = this.f9122;
        if (c8656.f23232 != EnumC16818.f49668) {
            throw C20865.m47156(this.f9120, c8656.f23240, "Integer expected", new Object[0]);
        }
        int i2 = c8656.f23237 * c8656.f23230;
        if (i != 1) {
            if (i != 2) {
                throw new InternalError(C19768.m44906(i, "parseInt(", MotionUtils.EASING_TYPE_FORMAT_END));
            }
            if (i2 > 65535 || i2 < -32768) {
                throw C20865.m47156(this.f9120, c8656.f23240, "{0} value {1} does not fit in {2}", new Object[]{str, Integer.valueOf(i2), "2 bytes"});
            }
        } else if (i2 > 255 || i2 < -128) {
            throw C20865.m47156(this.f9120, c8656.f23240, "{0} value {1} does not fit in {2}", new Object[]{str, Integer.valueOf(i2), "1 byte"});
        }
        c8656.m20078();
        return new C8773(i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8773 m30727(int i) {
        C8655 c8655 = this.f9122;
        if (c8655.f23232 != EnumC16818.f49668) {
            throw C20865.m47156(this.f9120, c8655.f23240, "Integer expected", new Object[0]);
        }
        if (c8655.f23230 == -1) {
            throw C20865.m47156(this.f9120, c8655.f23240, "Negative integer is not allowed", new Object[0]);
        }
        int i2 = c8655.f23237;
        if (i != 1) {
            if (i != 2) {
                throw new InternalError(C19768.m44906(i, "parseUInt(", MotionUtils.EASING_TYPE_FORMAT_END));
            }
            if (i2 > 65535) {
                throw C20865.m47156(this.f9120, c8655.f23240, "{0} value {1} does not fit in {2}", new Object[]{"ushort", Integer.valueOf(i2), "2 bytes"});
            }
        } else if (i2 > 255) {
            throw C20865.m47156(this.f9120, c8655.f23240, "{0} value {1} does not fit in {2}", new Object[]{"ubyte", Integer.valueOf(i2), "1 byte"});
        }
        c8655.m20078();
        return new C8773(i2);
    }

    /* JADX INFO: renamed from: ۘ */
    private void m30705() {
        while (true) {
            C8655 c8655 = this.f9122;
            if (c8655.f23232 == EnumC16818.f49704) {
                int i = c8655.f23237;
                c8655.m20078();
                this.f9122.m20084(EnumC16818.f49733);
                String.format("\ncpIndex: %d", Integer.valueOf(i));
                this.f38012.m11359(i, this.f38025.m54794());
                C8655 c8656 = this.f9122;
                if (c8656.f23232 != EnumC16818.f49716) {
                    c8656.m20084(EnumC16818.f49604);
                    return;
                }
                c8656.m20078();
            } else {
                this.f9120.mo13866("Constant declaration expected", new Object[0]);
                throw new C13902();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:41:0x00eb A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۜ */
    public final int m30734() {
        int iM18907;
        int iM18908;
        int iM18909;
        int i = 0;
        while (true) {
            int i2 = C14864.f42366[this.f9122.f23232.ordinal()];
            if (i2 != 1) {
                switch (i2) {
                    case 5:
                        iM18907 = EnumC8140.f21493.m18907();
                        break;
                    case 6:
                        iM18907 = EnumC8140.f21482.m18907();
                        break;
                    case 7:
                        iM18907 = EnumC8140.f21477.m18907();
                        break;
                    case 8:
                        iM18907 = EnumC8140.f21459.m18907();
                        break;
                    case 9:
                        iM18907 = EnumC8140.f21469.m18907();
                        break;
                    case 10:
                        iM18907 = EnumC8140.f21479.m18907();
                        break;
                    case 11:
                        iM18907 = EnumC8140.f21463.m18907();
                        break;
                    case 12:
                        iM18908 = EnumC8140.f21491.m18907();
                        iM18909 = EnumC8140.f21481.m18907();
                        iM18907 = iM18908 | iM18909;
                        break;
                    case 13:
                        iM18908 = EnumC8140.f21486.m18907();
                        iM18909 = EnumC8140.f21481.m18907();
                        iM18907 = iM18908 | iM18909;
                        break;
                    case 14:
                        iM18907 = EnumC8140.f21456.m18907();
                        break;
                    case 15:
                        iM18907 = EnumC8140.f21465.m18907();
                        break;
                    case 16:
                        iM18907 = EnumC8140.f21454.m18907();
                        break;
                    case 17:
                        iM18907 = EnumC8140.f21447.m18907();
                        break;
                    case 18:
                        iM18907 = EnumC8140.f21467.m18907();
                        break;
                    case 19:
                        iM18907 = EnumC8140.f21475.m18907();
                        break;
                    case 20:
                        iM18907 = EnumC8140.f21473.m18907();
                        break;
                    case 21:
                        iM18907 = EnumC8140.f21464.m18907();
                        break;
                    case 22:
                        iM18907 = EnumC8140.f21457.m18907();
                        break;
                    case 23:
                        if (this.f38026.f44273.m52374()) {
                            iM18907 = EnumC8140.f21468.m18907();
                        } else {
                            iM18907 = EnumC8140.f21451.m18907();
                        }
                        break;
                    case 24:
                        iM18907 = EnumC8140.f21471.m18907();
                        break;
                    case 25:
                        iM18907 = EnumC8140.f21448.m18907();
                        break;
                    case 26:
                        iM18907 = EnumC8140.f21460.m18907();
                        break;
                    default:
                        iM18907 = 0;
                        break;
                }
                if (iM18907 == 0) {
                    return i;
                }
                i |= iM18907;
            } else {
                iM18907 = this.f9122.f23237;
            }
            C8655 c8655 = this.f9122;
            long j = c8655.f23240;
            c8655.m20078();
            if ((i & iM18907) != 0) {
                this.f9120.mo13869(j, "Ambiguous use of similar modifiers", new Object[0]);
            } else {
                if (iM18907 == 0) {
                    return i;
                }
                i |= iM18907;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m30718(int i) {
        C15496 c15496 = this.f38026;
        long j = this.f9122.f23241;
        C6091 c6091 = (C6091) c15496.m32176();
        int iM18879 = EnumC8140.m18879(i, EnumC8140.f21448, EnumC8140.f21468);
        if (EnumC8140.m18877(c15496.f40157)) {
            int i2 = EnumC8140.m18870(iM18879) ? (~EnumC8140.f21451.m18907()) & iM18879 : iM18879;
            if (EnumC8140.m18900(i2)) {
                i2 &= ~EnumC8140.f21464.m18907();
            }
            if (!EnumC8140.m18887(i2, EnumC8140.f21493, EnumC8140.f21459, EnumC8140.f21469)) {
                c6091.mo13869(j, "\"{0}\": Interface field must be ACC_PUBLIC, ACC_STATIC, and ACC_FINAL only and may have ACC_STRICT_INIT or ACC_SYNTHETIC flag set", EnumC8140.m18880(iM18879, EnumC21552.FIELD));
            }
            if (!EnumC8140.m18857(iM18879)) {
                c6091.mo13869(j, "\"{0}\": Interface field must be ACC_PUBLIC, ACC_STATIC, and ACC_FINAL only and may have ACC_STRICT_INIT or ACC_SYNTHETIC flag set", EnumC8140.m18880(iM18879, EnumC21552.FIELD));
            }
        } else {
            if (EnumC8140.m18889() == EnumC21552.VALUE_OBJECTS && !EnumC8140.m18899(c15496.f40157) && !EnumC8140.m18867(iM18879, EnumC8140.f21459, EnumC8140.f21464)) {
                c6091.mo13869(j, "\"{0}\": Each field of a value class must have at least one of its ACC_STATIC or ACC_STRICT_INIT flags set", EnumC8140.m18880(iM18879, EnumC21552.FIELD));
            }
            int iM18894 = EnumC8140.m18894(iM18879, EnumC8140.f21487);
            if (iM18894 != 0) {
                c6091.mo13869(j, "Invalid modifier(s) for a field {0}", EnumC8140.m18880(iM18894, EnumC21552.FIELD));
            }
            if (!EnumC8140.m18903(iM18879, EnumC8140.f21493, EnumC8140.f21482, EnumC8140.f21477)) {
                c6091.mo13869(j, "\"{0}\": Each field of a class may have at most one of its ACC_PUBLIC, ACC_PRIVATE, and ACC_PROTECTED flags set", EnumC8140.m18880(iM18879, EnumC21552.FIELD));
            }
            if (EnumC8140.m18866(iM18879, EnumC8140.f21469, EnumC8140.f21456)) {
                c6091.mo13869(j, "\"{0}\": Each field of a class must not have both its ACC_FINAL and ACC_VOLATILE flags set", EnumC8140.m18880(iM18879, EnumC21552.FIELD));
            }
        }
        while (true) {
            C17450 c17450M30738 = m30738();
            C8655 c8655 = this.f9122;
            EnumC16818 enumC16818 = EnumC16818.f49722;
            c8655.m20084(enumC16818);
            C17450 c17450M30739 = m30738();
            C15496 c15497 = this.f38026;
            c15497.getClass();
            C16148 c16148M35267 = c15497.m35267(i, new C22028(c17450M30738, c17450M30739));
            ArrayList arrayList = this.f38014;
            if (arrayList != null) {
                c16148M35267.m32173(arrayList);
            }
            C8655 c8656 = this.f9122;
            if (c8656.f23232 == enumC16818) {
                c8656.m20078();
                C8655 c8657 = this.f9122;
                if (c8657.f23232 == EnumC16818.f49655) {
                    c8657.m20078();
                }
                c16148M35267.m32174(m30738());
            }
            C8655 c8658 = this.f9122;
            if (c8658.f23232 == EnumC16818.f49733) {
                c8658.m20078();
                c16148M35267.m36735(this.f38025.m54790(null, null, false));
            }
            C8655 c8659 = this.f9122;
            if (c8659.f23232 == enumC16818) {
                c8659.m20078();
                EnumC6799 enumC6799 = EnumC6799.f17627;
                c16148M35267.getClass();
                if (C18831.f56231[enumC6799.ordinal()] != 1) {
                    throw new IllegalStateException(C20865.m47154("Unexpected attribute: ", enumC6799.m15521(), " in ", c16148M35267.f40165.name()));
                }
                if (c16148M35267.f40158 != null) {
                    this.f9120.mo13869(this.f9122.f23240, "Signature attribute repeated", new Object[0]);
                }
                C8655 c86510 = this.f9122;
                if (c86510.f23232 == EnumC16818.f49655) {
                    c86510.m20078();
                }
                c16148M35267.m32174(m30738());
            }
            C8655 c86511 = this.f9122;
            if (c86511.f23232 != EnumC16818.f49716) {
                c86511.m20084(EnumC16818.f49604);
                return;
            }
            c86511.m20078();
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0166  */
    /* JADX WARN: Code duplicated, block: B:43:0x016c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0176  */
    /* JADX WARN: Code duplicated, block: B:52:0x018d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0219  */
    /* JADX WARN: Code duplicated, block: B:87:0x021d  */
    /* JADX WARN: Code duplicated, block: B:88:0x021f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0233 A[PHI: r5
      0x0233: PHI (r5v82 int) = (r5v80 int), (r5v86 int), (r5v80 int), (r5v80 int), (r5v80 int), (r5v80 int) binds: [B:67:0x01de, B:305:0x0233, B:73:0x01ea, B:75:0x01ee, B:79:0x01f6, B:82:0x01fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:82:0x01fc. Please report as an issue. */
    /* JADX INFO: renamed from: ܳ */
    private void m30715(int i) {
        char c;
        EnumC8140[] enumC8140Arr;
        int i2;
        String str;
        C24511 c24511;
        EnumC16818 enumC16818;
        C8773 c8773M30727;
        int i3;
        C8773 c8773;
        TreeMap treeMap;
        ArrayList arrayList;
        C17450 c17450M30738;
        int i4;
        int i5;
        int i6;
        String str2;
        char c2;
        int i7;
        long j = this.f9122.f23241;
        C17450 c17450M30739 = m30738();
        String str3 = (String) ((C23368) c17450M30739.f52180).f10654;
        boolean zEquals = str3.equals("<clinit>");
        boolean z = str3.equals("<init>") && !EnumC8140.m18874(i);
        C15496 c15496 = this.f38026;
        C6091 c6091 = (C6091) c15496.m32176();
        C23563 c23563 = c15496.f44273;
        int iM52375 = c23563.m52375();
        int iM18879 = EnumC8140.m18879(i, EnumC8140.f21448, EnumC8140.f21468);
        EnumC8140[] enumC8140Arr2 = EnumC8140.f21472;
        if (!EnumC8140.m18887(iM18879, enumC8140Arr2)) {
            c6091.mo13869(j, "Invalid modifier(s) for a method {0}", EnumC8140.m18880((~EnumC8140.m18860(enumC8140Arr2)) & iM18879, EnumC21552.METHOD));
        }
        EnumC8140 enumC8140 = EnumC8140.f21493;
        EnumC8140 enumC8141 = EnumC8140.f21482;
        EnumC8140 enumC8142 = EnumC8140.f21477;
        if (EnumC8140.m18903(iM18879, enumC8140, enumC8141, enumC8142)) {
            c = 3;
        } else {
            c = 3;
            c6091.mo13869(j, "Each method of a class may have at most one of its ACC_PUBLIC, ACC_PRIVATE, and ACC_PROTECTED flags set {0}", EnumC8140.m18880(iM18879, EnumC21552.METHOD));
        }
        if (zEquals) {
            if (c23563.m52375() > 51 && !EnumC8140.m18874(iM18879)) {
                c6091.mo13869(j, "In a class file whose version number is 51.0 or above, a method whose name is <clinit> must have its ACC_STATIC flag set {0}", EnumC8140.m18880(iM18879, EnumC21552.METHOD));
            }
        } else if (EnumC8140.m18877(c15496.f40157)) {
            if (z) {
                c6091.mo13869(j, "<init> method cannot be an interface method", new Object[0]);
            } else {
                int iM52376 = c23563.m52375();
                C6091 c6092 = (C6091) c15496.m32176();
                EnumC8140[] enumC8140Arr3 = new EnumC8140[4];
                enumC8140Arr3[0] = enumC8142;
                enumC8140Arr3[1] = EnumC8140.f21469;
                enumC8140Arr3[2] = EnumC8140.f21479;
                enumC8140Arr3[c] = EnumC8140.f21467;
                if (EnumC8140.m18867(iM18879, enumC8140Arr3)) {
                    c6092.mo13869(j, "Methods of interfaces  must not have ACC_PROTECTED, ACC_FINAL, ACC_SYNCHRONIZED and ACC_NATIVE flags set {0}", EnumC8140.m18880(iM18879, EnumC21552.METHOD));
                }
                if (iM52376 < 52) {
                    if (!EnumC8140.m18866(iM18879, enumC8140, EnumC8140.f21473)) {
                        c6092.mo13869(j, "In a class file whose version number is less than 52.0, each method of interface must be abstract public only {0}", EnumC8140.m18880(iM18879, EnumC21552.METHOD));
                    } else if (!EnumC8140.m18903(iM18879, enumC8140, enumC8141)) {
                        c6092.mo13869(j, "In a class file whose version number is 52.0 or above, each method of an interface must have exactly one of its ACC_PUBLIC and ACC_PRIVATE flags set {0}", EnumC8140.m18880(iM18879, EnumC21552.METHOD));
                    }
                }
            }
        } else if (z) {
            EnumC8140[] enumC8140Arr4 = EnumC8140.f21455;
            if (((~EnumC8140.m18860(enumC8140Arr4)) & iM18879) != 0) {
                c6091.mo13869(j, "Invalid modifier(s) for <init> method {0}", EnumC8140.m18880((~EnumC8140.m18860(enumC8140Arr4)) & iM18879, EnumC21552.METHOD));
            } else if (EnumC8140.m18881(iM18879)) {
                enumC8140Arr = EnumC8140.f21489;
                if (((~EnumC8140.m18860(enumC8140Arr)) & iM18879) == 0) {
                    c6091.mo13869(j, "Invalid modifier(s) for abstract method {0}", EnumC8140.m18880((~EnumC8140.m18860(enumC8140Arr)) & iM18879, EnumC21552.METHOD));
                } else if (EnumC8140.m18900(iM18879) && iM52375 >= 46 && iM52375 <= 60) {
                    c6091.mo13869(j, "If a method of a class or interface (whose major version number is at least 46 and at most 60) has its ACC_ABSTRACT flag set, it must not have its ACC_STRICT flag set", new Object[0]);
                }
            }
        } else if (EnumC8140.m18881(iM18879)) {
            enumC8140Arr = EnumC8140.f21489;
            if (((~EnumC8140.m18860(enumC8140Arr)) & iM18879) == 0) {
                c6091.mo13869(j, "Invalid modifier(s) for abstract method {0}", EnumC8140.m18880((~EnumC8140.m18860(enumC8140Arr)) & iM18879, EnumC21552.METHOD));
            } else if (EnumC8140.m18900(iM18879)) {
                c6091.mo13869(j, "If a method of a class or interface (whose major version number is at least 46 and at most 60) has its ACC_ABSTRACT flag set, it must not have its ACC_STRICT flag set", new Object[0]);
            }
        }
        this.f9122.m20084(EnumC16818.f49722);
        C17450 c17450M307310 = m30738();
        try {
            String str4 = (String) ((C23368) c17450M307310.f52180).f10654;
            int length = str4.length();
            String str5 = "\"({JavaTypeSignature})Result\" is missing.";
            if (length <= 0) {
                i4 = 0;
                i5 = 0;
                i6 = i4;
                i2 = i5;
                str2 = str5;
                c2 = 1;
                C6091 c6093 = this.f9120;
                long j2 = this.f9122.f23241;
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(i6 + 1);
                objArr[c2] = str2;
                c6093.mo13869(j2, "Malformed method signature at position {0}. {1}", objArr);
            } else if (str4.charAt(0) != '(') {
                str5 = "A \"(\" token is expected in \"({JavaTypeSignature})Result\"";
                i4 = 0;
                i5 = 0;
                i6 = i4;
                i2 = i5;
                str2 = str5;
                c2 = 1;
                C6091 c6094 = this.f9120;
                long j3 = this.f9122.f23241;
                Object[] objArr2 = new Object[2];
                objArr2[0] = Integer.valueOf(i6 + 1);
                objArr2[c2] = str2;
                c6094.mo13869(j3, "Malformed method signature at position {0}. {1}", objArr2);
            } else {
                i6 = 1;
                boolean z2 = false;
                i2 = 0;
                while (true) {
                    if (i6 < length) {
                        char cCharAt = str4.charAt(i6);
                        if (cCharAt != ')') {
                            if (cCharAt == 'F') {
                                i2++;
                                z2 = false;
                            } else if (cCharAt == 'L' || cCharAt == 'Q') {
                                while (true) {
                                    if (i6 >= length) {
                                        str5 = "ClassTypeSignature is not properly terminated: L{PackageSpecifier/}SimpleClassTypeSignature;";
                                    } else if (str4.charAt(i6) == ';') {
                                        i2++;
                                        z2 = false;
                                    } else {
                                        i6++;
                                    }
                                }
                            } else if (cCharAt == 'S' || cCharAt == 'I') {
                                i2++;
                                z2 = false;
                            } else if (cCharAt == 'J') {
                                i7 = i2 + 1;
                                if (z2) {
                                    i2 = i7;
                                    z2 = false;
                                } else {
                                    i2 += 2;
                                }
                            } else {
                                if (cCharAt != 'Z') {
                                    if (cCharAt != '[') {
                                        switch (cCharAt) {
                                            case 'B':
                                            case 'C':
                                                break;
                                            case 'D':
                                                i7 = i2 + 1;
                                                if (z2) {
                                                    i2 = i7;
                                                    z2 = false;
                                                } else {
                                                    i2 += 2;
                                                }
                                                break;
                                            default:
                                                str5 = "Unknown token \"" + str4.charAt(i6) + "\" in \"({JavaTypeSignature})Result\"";
                                                break;
                                        }
                                    } else {
                                        z2 = true;
                                    }
                                }
                                i2++;
                                z2 = false;
                            }
                            i6++;
                        } else {
                            c2 = 1;
                            if (z2) {
                                str2 = "An array type signature is expected: \"[JavaTypeSignature\"";
                                C6091 c6095 = this.f9120;
                                long j4 = this.f9122.f23241;
                                Object[] objArr3 = new Object[2];
                                objArr3[0] = Integer.valueOf(i6 + 1);
                                objArr3[c2] = str2;
                                c6095.mo13869(j4, "Malformed method signature at position {0}. {1}", objArr3);
                            }
                        }
                    }
                    i4 = i6;
                    i5 = i2;
                    i6 = i4;
                    i2 = i5;
                    str2 = str5;
                    c2 = 1;
                    C6091 c6096 = this.f9120;
                    long j5 = this.f9122.f23241;
                    Object[] objArr4 = new Object[2];
                    objArr4[0] = Integer.valueOf(i6 + 1);
                    objArr4[c2] = str2;
                    c6096.mo13869(j5, "Malformed method signature at position {0}. {1}", objArr4);
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
            i2 = 0;
        }
        if (!EnumC8140.m18874(i) && !zEquals) {
            i2++;
        }
        if (i2 > 255) {
            this.f9120.mo13869(this.f9122.f23240, "Number of parameters too large ({0}>255)", Integer.toString(i2));
        }
        C13467 c13467M35266 = this.f38026.m35266(i, c17450M30739, c17450M307310);
        c13467M35266.m32173(this.f38014);
        C15496 c15497 = c13467M35266.f37798;
        C8655 c8655 = this.f9122;
        if (c8655.f23232 == EnumC16818.f49722) {
            c8655.m20078();
            if (!this.f9122.m20082(EnumC16818.f49704, EnumC16818.f49736, EnumC16818.f49772)) {
                throw C20865.m47156(this.f9120, this.f9122.f23240, "Either name or Constant Pool index expected, got {0}", new Object[]{C22934.m51254(this.f9122.f23232, new StringBuilder("\""), "\"")});
            }
            c13467M35266.m32174(m30738());
        }
        boolean z3 = this.f9122.f23232 == EnumC16818.f49604;
        boolean z4 = false;
        boolean z5 = true;
        do {
            int i8 = C14864.f42366[this.f9122.f23232.ordinal()];
            str = "\"{0}\" token is expected";
            c24511 = this.f38022;
            EnumC12758 enumC12758 = null;
            switch (i8) {
                case 27:
                    if (c13467M35266.f37799 != null) {
                        this.f9120.mo13869(this.f9122.f23240, "The {0} attribute repeated in the method_info structure", EnumC6799.f17638.m15521());
                    }
                    this.f9122.m20078();
                    ArrayList arrayList2 = new ArrayList();
                    while (true) {
                        arrayList2.add(this.f38025.m54790(EnumC12758.f35925, enumC12758, false));
                        C8655 c8656 = this.f9122;
                        EnumC16818 enumC16819 = c8656.f23232;
                        enumC16818 = EnumC16818.f49604;
                        if (enumC16819 != enumC16818 && enumC16819 == EnumC16818.f49716) {
                            enumC12758 = null;
                            c8656.m20078();
                        }
                    }
                    c13467M35266.getClass();
                    if (!arrayList2.isEmpty()) {
                        C9286 c9286 = c13467M35266.f37799;
                        if (c9286 == null) {
                            c13467M35266.f37799 = new C9286(c13467M35266.f37798.f40167, EnumC6799.f17638, arrayList2);
                        } else {
                            c9286.addAll(arrayList2);
                        }
                    }
                    C8655 c8657 = this.f9122;
                    if (c8657.f23232 != enumC16818) {
                        if (c8657.m20082(EnumC16818.f49689, EnumC16818.f49726, EnumC16818.f49767)) {
                        }
                        z4 = false;
                    } else {
                        c8657.m20078();
                    }
                    z5 = false;
                    z4 = false;
                    break;
                case 28:
                    if (c13467M35266.f37795 != null) {
                        this.f9120.m13871(this.f9122.f23240, "The {0} attribute repeated in the method_info structure", EnumC6799.f17636.m15521());
                        throw null;
                    }
                    c13467M35266.f37795 = c24511.m54093();
                    C8655 c8658 = this.f9122;
                    if (c8658.f23232 == EnumC16818.f49604) {
                        z3 = true;
                        z5 = false;
                    } else if (!c8658.m20082(EnumC16818.f49655, EnumC16818.f49565)) {
                    }
                    this.f9122.m20078();
                    break;
                    break;
                case 29:
                    this.f9122.m20078();
                    if (c13467M35266.f40158 != null) {
                        this.f9120.mo13869(this.f9122.f23240, "The {0} attribute repeated in the method_info structure", EnumC6799.f17627.m15521());
                    }
                    c13467M35266.m32174(m30738());
                    z4 = false;
                    break;
                case 30:
                    this.f9122.m20078();
                    z5 = false;
                    break;
                case 31:
                    this.f9122.m20078();
                    z4 = true;
                    break;
                default:
                    if (z4) {
                        ArrayList<EnumC16818> arrayList3 = new ArrayList();
                        if (c13467M35266.f37795 == null) {
                            arrayList3.add(EnumC16818.f49734);
                        }
                        if (c13467M35266.f37799 == null) {
                            arrayList3.add(EnumC16818.f49565);
                        }
                        if (c13467M35266.f40158 == null) {
                            arrayList3.add(EnumC16818.f49655);
                        }
                        if (arrayList3.size() == 1) {
                            this.f9120.m13871(this.f9122.f23241, "\"{0}\" token is expected", ((EnumC16818) arrayList3.get(0)).m38127());
                            throw null;
                        }
                        C6091 c6097 = this.f9120;
                        long j6 = this.f9122.f23241;
                        StringBuilder sb = new StringBuilder("");
                        for (EnumC16818 enumC168110 : arrayList3) {
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append('\'');
                            sb.append(enumC168110.m38127());
                            sb.append('\'');
                        }
                        c6097.m13871(j6, "One of {0} tokens is expected", sb.toString());
                        throw null;
                    }
                    z5 = false;
                    break;
            }
        } while (z5);
        if (!z3) {
            C8773 c8774 = null;
            C8773 c8773M30728 = null;
            while (true) {
                C8655 c8659 = this.f9122;
                if (c8659.f23232 == EnumC16818.f49689) {
                    c8659.m20078();
                    i3 = 2;
                    c8773M30727 = m30727(2);
                } else {
                    c8773M30727 = c8774;
                    i3 = 2;
                }
                C8655 c86510 = this.f9122;
                if (c86510.f23232 == EnumC16818.f49726) {
                    c86510.m20078();
                    c8773M30728 = m30727(i3);
                }
                if (this.f9122.f23232 == EnumC16818.f49668) {
                    c24511.f9122.m20079(C19768.m44906(i2, " - - - > [ParserAnnotation.parseParamAnnots]: Begin, totalParams =  ", " "));
                    TreeMap treeMap2 = new TreeMap();
                    while (true) {
                        C8655 c86511 = c24511.f9122;
                        if (c86511.f23232 == EnumC16818.f49668) {
                            int i9 = c86511.f23237;
                            Integer numValueOf = Integer.valueOf(i9);
                            if (i9 < 0 || i9 >= i2) {
                                c24511.f9120.mo11117(c24511.f9122.f23240, "Invalid Parameter Number: {0}", Integer.valueOf(i9));
                            }
                            if (treeMap2.get(numValueOf) != null) {
                                c24511.f9120.mo11117(c24511.f9122.f23240, "Duplicate Parameter Number: {0}", Integer.valueOf(i9));
                            }
                            c24511.f9122.m20078();
                            c24511.f9122.m20084(EnumC16818.f49722);
                            C8655 c86512 = c24511.f9122;
                            if (c86512.f23232 == EnumC16818.f49719) {
                                c86512.m20079(" - - - > [ParserAnnotation.scanParamName]: Begin ");
                                c24511.f9122.m20078();
                                c24511.f9122.m20084(EnumC16818.f49767);
                                EnumC16818 enumC168111 = c24511.f9122.f23232;
                                if (enumC168111 == EnumC16818.f49736 || enumC168111.m38126()) {
                                    c17450M30738 = c24511.f9121.m30738();
                                } else {
                                    C8655 c86513 = c24511.f9122;
                                    if (c86513.f23232 != EnumC16818.f49704) {
                                        throw C20865.m47156(c24511.f9120, c86513.f23240, "Incorrect ParamName, unrecognized token: \"{0}\"", new Object[]{c86513.f23227});
                                    }
                                    int i10 = c86513.f23237;
                                    c17450M30738 = c24511.f9121.f38012.m11353(i10);
                                    if (!(c17450M30738.f52180 instanceof C23368)) {
                                        throw C20865.m47156(c24511.f9120, c24511.f9122.f23240, "ParameterName CPX at {0} is not a ConstantString", new Object[]{Integer.valueOf(i10)});
                                    }
                                }
                                int iM30734 = c24511.f9121.m30734();
                                c24511.f9122.m20084(EnumC16818.f49567);
                                C6091 c6098 = (C6091) c13467M35266.m32176();
                                StringBuilder sbM34408 = C15033.m34408(i9, "addMethodParameter Param[", "] (name: ");
                                sbM34408.append(c17450M30738.toString());
                                sbM34408.append(", Flags (");
                                sbM34408.append(iM30734);
                                sbM34408.append(").");
                                int i11 = 0;
                                c6098.m48090(sbM34408.toString(), new Object[0]);
                                if (c13467M35266.f37800 == null) {
                                    c13467M35266.f37800 = new C9286(c15497.f40167, EnumC6799.f17639, 0);
                                    int i12 = 0;
                                    while (i12 < i2) {
                                        c13467M35266.f37800.m21502(new C8102(i11, null));
                                        i12++;
                                        i11 = 0;
                                        c8773M30728 = c8773M30728;
                                    }
                                }
                                c8773 = c8773M30728;
                                c13467M35266.f37800.m21500(i9, new C8102(iM30734, c17450M30738));
                                c24511.f9122.m20079(" - - - > [ParserAnnotation.scanParamName]: End ");
                            } else {
                                c8773 = c8773M30728;
                            }
                            if (c24511.f9122.f23232 == EnumC16818.f49684) {
                                ArrayList<C18179> arrayListM54092 = c24511.m54092();
                                treeMap2.put(numValueOf, arrayListM54092);
                                for (C18179 c18179 : arrayListM54092) {
                                    if (c18179.f54266) {
                                        if (c13467M35266.f37796 == null) {
                                            c13467M35266.f37796 = new C12126(c15497.f40167, EnumC6799.f17645, i2);
                                        }
                                        treeMap = c13467M35266.f37796.f33888;
                                        arrayList = (ArrayList) treeMap.get(Integer.valueOf(i9));
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            treeMap.put(Integer.valueOf(i9), arrayList);
                                        }
                                    } else {
                                        if (c13467M35266.f37793 == null) {
                                            c13467M35266.f37793 = new C12126(c15497.f40167, EnumC6799.f17622, i2);
                                        }
                                        treeMap = c13467M35266.f37793.f33888;
                                        arrayList = (ArrayList) treeMap.get(Integer.valueOf(i9));
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            treeMap.put(Integer.valueOf(i9), arrayList);
                                        }
                                    }
                                    arrayList.add(c18179);
                                }
                            }
                            str = str;
                            c8773M30728 = c8773;
                        }
                    }
                }
                C8773 c8775 = c8773M30728;
                String str6 = str;
                if (this.f9122.f23232.m38121(EnumC16818.f49689, EnumC16818.f49726, EnumC16818.f49668)) {
                    c8773M30728 = c8775;
                    c8774 = c8773M30727;
                    str = str6;
                } else if (this.f9122.f23232 == EnumC16818.f49604) {
                    if (c8773M30727 != null || c8775 != null) {
                        this.f9120.mo13866(str6, EnumC16818.f49767.m38127());
                    }
                    this.f9122.m20078();
                } else if (EnumC8140.m18881(i)) {
                    C8655 c86514 = this.f9122;
                    if (c86514.f23232 == EnumC16818.f49767) {
                        c86514.m20078();
                        C10746 c10746 = new C10746(c13467M35266, i2, c8773M30727, c8775);
                        c13467M35266.f37794 = c10746;
                        this.f38018 = c10746;
                        m30703();
                        this.f38018.m24752();
                        this.f9122.m20084(EnumC16818.f49567);
                    }
                } else {
                    this.f9122.m20084(EnumC16818.f49767);
                    C10746 c10747 = new C10746(c13467M35266, i2, c8773M30727, c8775);
                    c13467M35266.f37794 = c10747;
                    this.f38018 = c10747;
                    m30703();
                    this.f38018.m24752();
                    this.f9122.m20084(EnumC16818.f49567);
                }
            }
        }
        this.f38026.f44285 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:194:0x0480  */
    /* JADX WARN: Code duplicated, block: B:197:0x048f  */
    /* JADX WARN: Code duplicated, block: B:200:0x049e  */
    /* JADX WARN: Code duplicated, block: B:301:0x0753  */
    /* JADX WARN: Code duplicated, block: B:304:0x0762  */
    /* JADX WARN: Code duplicated, block: B:307:0x0771  */
    /* JADX WARN: Code duplicated, block: B:338:0x0849  */
    /* JADX WARN: Code duplicated, block: B:341:0x0858  */
    /* JADX WARN: Code duplicated, block: B:344:0x0867  */
    /* JADX WARN: Code duplicated, block: B:401:0x04c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x0796 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:418:0x088c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x04da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:460:0x0493 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:462:0x04d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:463:0x04c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:466:0x0487 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:467:0x0766 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:469:0x07ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:470:0x07b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:471:0x0793 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:474:0x075a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:0x08a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:476:0x085c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:0x08a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:479:0x0889 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:482:0x0850 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۖ */
    private void m30703() {
        EnumC16818 enumC16818;
        C8655 c8655;
        EnumC16818 enumC16819;
        C9759 c9759;
        char c;
        C8655 c8656;
        EnumC16818 enumC168110;
        EnumC16818 enumC168111;
        C8655 c8657;
        EnumC16818 enumC168112;
        C8655 c8658;
        EnumC16818 enumC168113;
        EnumC16818 enumC168114;
        C8655 c8659;
        EnumC16818 enumC168115;
        C8655 c86510;
        EnumC16818 enumC168116;
        EnumC16818 enumC168117;
        C8655 c86511;
        EnumC16818 enumC168118;
        while (true) {
            while (true) {
                EnumC16818 enumC168119 = this.f9122.f23232;
                if (enumC168119 == EnumC16818.f49679 || enumC168119 == (enumC16818 = EnumC16818.f49567)) {
                    return;
                }
                this.f38013.m50075();
                c8655 = this.f9122;
                enumC16819 = c8655.f23232;
                if (enumC16819 == enumC16818) {
                    return;
                }
                EnumC16818 enumC168120 = EnumC16818.f49662;
                c9759 = this.f38021;
                if (enumC16819 == enumC168120) {
                    C10746 c10746 = this.f38018;
                    c9759.getClass();
                    ArrayList arrayList = new ArrayList();
                    c9759.f9122.m20078();
                    C8655 c86512 = c9759.f9122;
                    if (c86512.f23232 == EnumC16818.f49722) {
                        c86512.m20078();
                    }
                    int i = -1;
                    boolean z = true;
                    boolean z2 = false;
                    while (true) {
                        EnumC16818 enumC168121 = c9759.f9122.f23232;
                        if (enumC168121 != EnumC16818.f49679 && enumC168121 != EnumC16818.f49567) {
                            int i2 = C15793.f45692[enumC168121.ordinal()];
                            if (i2 != 7) {
                                if (i2 == 20) {
                                    if (z) {
                                        c9759.f9120.m13871(c9759.f9122.f23240, "The LineNumberTable format is incorrect; \"{0}\" is expected", "line keyword");
                                        throw null;
                                    }
                                    if (i == -1) {
                                        c9759.f9120.m13871(c9759.f9122.f23240, "The LineNumberTable format is incorrect; \"{0}\" is expected", "line_number:");
                                        throw null;
                                    }
                                    if (z2) {
                                        c9759.f9120.m13871(c9759.f9122.f23240, "The LineNumberTable format is incorrect; \"{0}\" is expected", "start_pc");
                                        throw null;
                                    }
                                    z2 = true;
                                } else if (i2 == 21) {
                                    if (!z) {
                                        c9759.f9120.m13871(c9759.f9122.f23240, "The LineNumberTable format is incorrect; \"{0}\" is expected", "line  line_number:  start_pc");
                                        throw null;
                                    }
                                    z = false;
                                } else if (i != -1 || !z) {
                                    c9759.f9120.m13871(c9759.f9122.f23240, "The LineNumberTable format is incorrect; \"{0}\" is expected", "line  line_number:  start_pc");
                                    throw null;
                                }
                            } else if (i == -1) {
                                i = c9759.f9122.f23237;
                            } else {
                                arrayList.add(new C21514(c9759.f9122.f23237, i));
                                i = -1;
                                z = true;
                                z2 = false;
                            }
                            c9759.f9122.m20078();
                        }
                    }
                    C9286 c9286 = c10746.f29779;
                    if (c9286 != null) {
                        c9286.clear();
                    } else {
                        C9286 c9287 = new C9286(c10746.f29780.f40167, EnumC6799.f17616);
                        c10746.f29779 = c9287;
                        c10746.f29784.m18356(c9287);
                    }
                    c10746.f29779.addAll(arrayList);
                } else if (enumC16819 == EnumC16818.f49696) {
                    this.f38018.m24749(c9759.m22785(false), false);
                } else if (enumC16819 == EnumC16818.f49775) {
                    this.f38018.m24749(c9759.m22785(true), true);
                } else if (enumC16819 == EnumC16818.f49684) {
                    C10746 c10747 = this.f38018;
                    ArrayList<C18179> arrayListM54092 = this.f38022.m54092();
                    C13467 c13467 = c10747.f29780;
                    for (C18179 c18179 : arrayListM54092) {
                        boolean z3 = c18179.f54266;
                        if (c18179 instanceof C9996) {
                            C9996 c9996 = (C9996) c18179;
                            if (z3) {
                                if (c10747.f29774 == null) {
                                    c10747.f29774 = new C9286(c13467.f40167, EnumC6799.f17646);
                                }
                                c10747.f29774.m21502(c9996);
                            } else {
                                if (c10747.f29773 == null) {
                                    c10747.f29773 = new C9286(c13467.f40167, EnumC6799.f17615);
                                }
                                c10747.f29773.m21502(c9996);
                            }
                        }
                    }
                }
            }
            if (enumC16819 == EnumC16818.f49659) {
                C10746 c10748 = this.f38018;
                C8655 c86513 = c9759.f9122;
                if (c86513.f23232 == EnumC16818.f49722) {
                    c86513.m20078();
                }
                ArrayList arrayList2 = new ArrayList();
                EnumC24233 enumC24233 = EnumC24233.UNKNOWN_TYPE;
                C20726 c20726 = null;
                while (true) {
                    EnumC16818 enumC168122 = c9759.f9122.f23232;
                    if (enumC168122 != EnumC16818.f49679 && enumC168122 != EnumC16818.f49567) {
                        switch (C15793.f45692[enumC168122.ordinal()]) {
                            case 10:
                                c9759.f9122.m20078();
                                c9759.f9122.m20084(EnumC16818.f49733);
                                C8655 c86514 = c9759.f9122;
                                if (c86514.f23232 != EnumC16818.f49668) {
                                    c9759.f9120.m13871(c86514.f23240, "{0} is expected", "\"number of entries\"");
                                    throw null;
                                }
                                c9759.f9122.m20078();
                                break;
                            case 11:
                                if (c20726 != null) {
                                    arrayList2.add(c20726);
                                }
                                c9759.f9122.m20078();
                                c9759.f9122.m20084(EnumC16818.f49733);
                                C8655 c86515 = c9759.f9122;
                                if (c86515.f23232 != EnumC16818.f49668) {
                                    c9759.f9120.m13871(c86515.f23240, "{0} is expected", "The offset value");
                                    throw null;
                                }
                                c20726 = new C20726(c9759.f9120, false);
                                c20726.m46804(c9759.f9122.f23237);
                                c9759.f9122.m20078();
                                break;
                                break;
                            case 12:
                                if (c20726 == null) {
                                    c9759.f9120.m13871(c9759.f9122.f23240, "{0} is expected", C6988.m16053("\"", EnumC16818.f49651.m38127(), "\""));
                                    throw null;
                                }
                                C7945 c7945 = c20726.f63964;
                                if (c7945 != null && c7945.f20859.size() > 0) {
                                    c9759.f9120.mo13869(c9759.f9122.f23240, "The {0} overwrites an already declared one.", C6988.m16053("\"", EnumC16818.f49720.m38127(), "\""));
                                }
                                c9759.f9122.m20078();
                                c9759.f9122.m20084(EnumC16818.f49733);
                                C8655 c86516 = c9759.f9122;
                                if (c86516.f23232 == EnumC16818.f49736) {
                                    if (c86516.f23227.equals(EnumC16818.f49708.m38127() + EnumC16818.f49743.m38127())) {
                                        c20726.f63964 = new C7945();
                                        c9759.f9122.m20078();
                                    }
                                }
                                c9759.f9122.m20086(EnumC16818.f49708);
                                C7945 c7946 = new C7945();
                                c20726.f63964 = c7946;
                                while (true) {
                                    C8655 c86517 = c9759.f9122;
                                    EnumC16818 enumC168123 = c86517.f23232;
                                    if (enumC168123 == EnumC16818.f49679) {
                                    }
                                    EnumC16818 enumC168124 = EnumC16818.f49604;
                                    if (enumC168123 == enumC168124) {
                                        c86517.m20078();
                                        c9759.f9122.m20086(EnumC16818.f49743);
                                    }
                                    if (enumC168123 == EnumC16818.f49736 && c86517.f23227.equals(EnumC16818.f49743.m38127())) {
                                    }
                                    c9759.f9121.m30731(c7946);
                                    C8655 c86518 = c9759.f9122;
                                    EnumC16818 enumC168125 = c86518.f23232;
                                    if (enumC168125 == EnumC16818.f49716) {
                                        c86518.m20078();
                                    } else if (enumC168125 != enumC168124) {
                                        c9759.f9120.m13871(c86518.f23240, "\"{0}\" token is expected", C22934.m51254(enumC168124, new StringBuilder("\""), "\""));
                                        throw null;
                                    }
                                    break;
                                    break;
                                    break;
                                }
                                break;
                                break;
                            case 13:
                                if (c20726 == null) {
                                    c9759.f9120.m13871(c9759.f9122.f23240, "{0} is expected", C6988.m16053("\"", EnumC16818.f49651.m38127(), "\""));
                                    throw null;
                                }
                                C7945 c7947 = c20726.f63966;
                                if (c7947 == null || c7947.f20859.size() <= 0) {
                                    c = 0;
                                } else {
                                    c = 0;
                                    c9759.f9120.mo13869(c9759.f9122.f23240, "The {0} overwrites an already declared one.", C6988.m16053("\"", EnumC16818.f49630.m38127(), "\""));
                                }
                                c9759.f9122.m20078();
                                c9759.f9122.m20084(EnumC16818.f49733);
                                C8655 c86519 = c9759.f9122;
                                if (c86519.f23232 == EnumC16818.f49736) {
                                    if (c86519.f23227.equals(EnumC16818.f49708.m38127() + EnumC16818.f49743.m38127())) {
                                        c20726.f63966 = new C7945();
                                        c9759.f9122.m20078();
                                    }
                                }
                                c9759.f9122.m20086(EnumC16818.f49708);
                                C7945 c7948 = new C7945();
                                c20726.f63966 = c7948;
                                while (true) {
                                    C8655 c86520 = c9759.f9122;
                                    EnumC16818 enumC168126 = c86520.f23232;
                                    if (enumC168126 == EnumC16818.f49679) {
                                    }
                                    EnumC16818 enumC168127 = EnumC16818.f49604;
                                    if (enumC168126 == enumC168127) {
                                        c86520.m20078();
                                        c9759.f9122.m20086(EnumC16818.f49743);
                                    }
                                    if (enumC168126 == EnumC16818.f49736 && c86520.f23227.equals(EnumC16818.f49743.m38127())) {
                                    }
                                    c9759.f9121.m30731(c7948);
                                    C8655 c86521 = c9759.f9122;
                                    EnumC16818 enumC168128 = c86521.f23232;
                                    if (enumC168128 == EnumC16818.f49716) {
                                        c86521.m20078();
                                    } else if (enumC168128 != enumC168127) {
                                        C6091 c6091 = c9759.f9120;
                                        long j = c86521.f23240;
                                        Object[] objArr = new Object[1];
                                        objArr[c] = C22934.m51254(enumC168127, new StringBuilder("\""), "\"");
                                        c6091.m13871(j, "\"{0}\" token is expected", objArr);
                                        throw null;
                                    }
                                    break;
                                    break;
                                    break;
                                }
                                break;
                                break;
                            default:
                                c9759.f9122.m20078();
                                break;
                        }
                    }
                }
                if (c20726 != null) {
                    arrayList2.add(c20726);
                }
                c10748.m24748(arrayList2);
            } else if (enumC16819 == EnumC16818.f49577) {
                C10746 c10749 = this.f38018;
                c9759.getClass();
                ArrayList arrayList3 = new ArrayList();
                EnumC24233 enumC24234 = EnumC24233.UNKNOWN_TYPE;
                c9759.f9122.m20078();
                C8655 c86522 = c9759.f9122;
                if (c86522.f23232 == EnumC16818.f49722) {
                    c86522.m20078();
                }
                EnumC24233 enumC24233M53543 = enumC24234;
                C20726 c20727 = null;
                int i3 = -1;
                int i4 = 1;
                int i5 = 0;
                while (true) {
                    EnumC16818 enumC168129 = c9759.f9122.f23232;
                    if (enumC168129 != EnumC16818.f49679) {
                        switch (C15793.f45692[enumC168129.ordinal()]) {
                            case 10:
                                c9759.f9122.m20078();
                                c9759.f9122.m20084(EnumC16818.f49733);
                                C8655 c86523 = c9759.f9122;
                                if (c86523.f23232 != EnumC16818.f49668) {
                                    c9759.f9120.m13871(c86523.f23240, "{0} is expected", "\"number of entries\"");
                                    throw null;
                                }
                                c9759.f9122.m20078();
                                i4 = 1;
                                break;
                            case 11:
                            default:
                                c9759.f9122.m20078();
                                i4 = 1;
                                break;
                            case 12:
                                if (c20727 == null || c20727.m46805() == EnumC24233.SAME_FRAME) {
                                    if (i5 > 0) {
                                        c9759.f9120.m13871(c9759.f9122.f23240, "\"{0}\" token is expected", EnumC16818.f49567.m38127());
                                        throw null;
                                    }
                                    c9759.f9120.m13871(c9759.f9122.f23240, "{0} is expected", C6988.m16053("\"", EnumC16818.f49706.m38127(), "\""));
                                    throw null;
                                }
                                EnumC16818 enumC16818M46799 = c20727.m46799();
                                if (enumC16818M46799 != EnumC16818.f49720) {
                                    c9759.f9120.m13871(c9759.f9122.f23240, "{0} is expected", C6988.m16053("\"", enumC16818M46799.m38127(), "\""));
                                    throw null;
                                }
                                c9759.f9122.m20078();
                                c9759.f9122.m20084(EnumC16818.f49733);
                                c20727.f63964 = new C7945();
                                C8655 c86524 = c9759.f9122;
                                if (c86524.f23232 == EnumC16818.f49736) {
                                    if (c86524.f23227.equals(EnumC16818.f49708.m38127() + EnumC16818.f49743.m38127())) {
                                        c9759.f9122.m20078();
                                    } else {
                                        c9759.f9122.m20086(EnumC16818.f49708);
                                        while (true) {
                                            c8656 = c9759.f9122;
                                            enumC168110 = c8656.f23232;
                                            if (enumC168110 == EnumC16818.f49679) {
                                                enumC168111 = EnumC16818.f49604;
                                                if (enumC168110 == enumC168111) {
                                                    c8656.m20078();
                                                    c9759.f9122.m20086(EnumC16818.f49743);
                                                } else if (enumC168110 == EnumC16818.f49736 || !c8656.f23227.equals(EnumC16818.f49743.m38127())) {
                                                    c9759.f9121.m30731(c20727.f63964);
                                                    c8657 = c9759.f9122;
                                                    enumC168112 = c8657.f23232;
                                                    if (enumC168112 != EnumC16818.f49716) {
                                                        c8657.m20078();
                                                    } else if (enumC168112 == enumC168111) {
                                                        c9759.f9120.m13871(c8657.f23240, "\"{0}\" token is expected", C22934.m51254(enumC168111, new StringBuilder("\""), "\""));
                                                        throw null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    c9759.f9122.m20086(EnumC16818.f49708);
                                    while (true) {
                                        c8656 = c9759.f9122;
                                        enumC168110 = c8656.f23232;
                                        if (enumC168110 == EnumC16818.f49679) {
                                            enumC168111 = EnumC16818.f49604;
                                            if (enumC168110 == enumC168111) {
                                                c8656.m20078();
                                                c9759.f9122.m20086(EnumC16818.f49743);
                                            } else {
                                                if (enumC168110 == EnumC16818.f49736) {
                                                }
                                                c9759.f9121.m30731(c20727.f63964);
                                                c8657 = c9759.f9122;
                                                enumC168112 = c8657.f23232;
                                                if (enumC168112 != EnumC16818.f49716) {
                                                    c8657.m20078();
                                                } else if (enumC168112 == enumC168111) {
                                                    c9759.f9120.m13871(c8657.f23240, "\"{0}\" token is expected", C22934.m51254(enumC168111, new StringBuilder("\""), "\""));
                                                    throw null;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (c20727.m46799() == null) {
                                    arrayList3.add(c20727);
                                    i4 = 1;
                                    c20727 = null;
                                }
                                i4 = 1;
                                break;
                                break;
                            case 13:
                                if (c20727 == null || c20727.m46805() == EnumC24233.SAME_FRAME) {
                                    if (i5 > 0) {
                                        c9759.f9120.m13871(c9759.f9122.f23240, "\"{0}\" token is expected", EnumC16818.f49567.m38127());
                                        throw null;
                                    }
                                    c9759.f9120.m13871(c9759.f9122.f23240, "{0} is expected", C6988.m16053("\"", EnumC16818.f49706.m38127(), "\""));
                                    throw null;
                                }
                                EnumC16818 enumC16818M467910 = c20727.m46799();
                                if (enumC16818M467910 != EnumC16818.f49630 && (enumC16818M467910 != EnumC16818.f49720 || c20727.m46805() != EnumC24233.FULL_FRAME)) {
                                    c9759.f9120.m13871(c9759.f9122.f23240, "{0} is expected", C6988.m16053("\"", enumC16818M467910.m38127(), "\""));
                                    throw null;
                                }
                                c9759.f9122.m20078();
                                c9759.f9122.m20084(EnumC16818.f49733);
                                c20727.f63966 = new C7945();
                                C8655 c86525 = c9759.f9122;
                                if (c86525.f23232 == EnumC16818.f49736) {
                                    if (c86525.f23227.equals(EnumC16818.f49708.m38127() + EnumC16818.f49743.m38127())) {
                                        c9759.f9122.m20078();
                                    } else {
                                        c9759.f9122.m20086(EnumC16818.f49708);
                                        while (true) {
                                            c8658 = c9759.f9122;
                                            enumC168113 = c8658.f23232;
                                            if (enumC168113 == EnumC16818.f49679) {
                                                enumC168114 = EnumC16818.f49604;
                                                if (enumC168113 == enumC168114) {
                                                    c8658.m20078();
                                                    c9759.f9122.m20086(EnumC16818.f49743);
                                                } else if (enumC168113 == EnumC16818.f49736 || !c8658.f23227.equals(EnumC16818.f49743.m38127())) {
                                                    c9759.f9121.m30731(c20727.f63966);
                                                    c8659 = c9759.f9122;
                                                    enumC168115 = c8659.f23232;
                                                    if (enumC168115 != EnumC16818.f49716) {
                                                        c8659.m20078();
                                                    } else if (enumC168115 == enumC168114) {
                                                        c9759.f9120.m13871(c8659.f23240, "\"{0}\" token is expected", C22934.m51254(enumC168114, new StringBuilder("\""), "\""));
                                                        throw null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    c9759.f9122.m20086(EnumC16818.f49708);
                                    while (true) {
                                        c8658 = c9759.f9122;
                                        enumC168113 = c8658.f23232;
                                        if (enumC168113 == EnumC16818.f49679) {
                                            enumC168114 = EnumC16818.f49604;
                                            if (enumC168113 == enumC168114) {
                                                c8658.m20078();
                                                c9759.f9122.m20086(EnumC16818.f49743);
                                            } else {
                                                if (enumC168113 == EnumC16818.f49736) {
                                                }
                                                c9759.f9121.m30731(c20727.f63966);
                                                c8659 = c9759.f9122;
                                                enumC168115 = c8659.f23232;
                                                if (enumC168115 != EnumC16818.f49716) {
                                                    c8659.m20078();
                                                } else if (enumC168115 == enumC168114) {
                                                    c9759.f9120.m13871(c8659.f23240, "\"{0}\" token is expected", C22934.m51254(enumC168114, new StringBuilder("\""), "\""));
                                                    throw null;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (c20727.m46799() == null) {
                                    arrayList3.add(c20727);
                                    i4 = 1;
                                    c20727 = null;
                                }
                                i4 = 1;
                                break;
                                break;
                            case 14:
                                if (i5 == 0) {
                                    c9759.f9120.m13871(c9759.f9122.f23240, "early_larval_frame must be declared before the wrapped base_frame.", new Object[0]);
                                    throw null;
                                }
                                c9759.f9122.m20078();
                                i4 = 1;
                                break;
                            case 15:
                                if (i5 != 0) {
                                    i5--;
                                    c9759.f9122.m20078();
                                    i4 = 1;
                                }
                                break;
                            case 16:
                            case 17:
                                c9759.f9122.m20078();
                                c9759.f9122.m20084(EnumC16818.f49733);
                                C8655 c86526 = c9759.f9122;
                                if (c86526.f23232 == EnumC16818.f49668) {
                                    int i6 = c86526.f23237;
                                    i3 = i6;
                                    enumC24233M53543 = EnumC24233.m53543(i6);
                                }
                                if (enumC24233M53543 == EnumC24233.UNKNOWN_TYPE) {
                                    c9759.f9120.m13871(c9759.f9122.f23240, "{0} is expected", "An integer within the range of [0 to 255]");
                                    throw null;
                                }
                                if (enumC24233M53543 == EnumC24233.EARLY_LARVAL) {
                                    if (i5 > 2) {
                                        c9759.f9120.m13871(c9759.f9122.f23240, "base_frame is expected", new Object[0]);
                                        throw null;
                                    }
                                    i5++;
                                }
                                if (c20727 == null) {
                                    c20727 = new C20726(c9759.f9120, c9759.f9121.f38018.f29768.f44273.m52373());
                                } else {
                                    EnumC16818 enumC16818M467911 = c20727.m46799();
                                    if (enumC16818M467911 == null) {
                                        arrayList3.add(c20727);
                                        c20727 = new C20726(c9759.f9120, c9759.f9121.f38018.f29768.f44273.m52373());
                                    } else {
                                        if (enumC16818M467911 != EnumC16818.f49630 && c20727.m46805() != EnumC24233.FULL_FRAME) {
                                            c9759.f9120.m13871(c9759.f9122.f23240, "{0} is expected", C6988.m16053("\"", enumC16818M467911.m38127(), "\""));
                                            throw null;
                                        }
                                        c20727.f63966 = new C7945();
                                        arrayList3.add(c20727);
                                        c20727 = new C20726(c9759.f9120, c9759.f9121.f38018.f29768.f44273.m52373());
                                        c9759.f9120.mo13869(c9759.f9122.f23240, "{0} is expected", C6988.m16053("\"", enumC16818M467911.m38127(), "\""));
                                    }
                                }
                                c20727.m46806(i3);
                                if (c20727.m46799() == null) {
                                    arrayList3.add(c20727);
                                    c20727 = null;
                                }
                                i4 = 1;
                                break;
                                break;
                            case 18:
                                if (c20727 == null || c20727.m46805() == EnumC24233.SAME_FRAME) {
                                    if (i5 > 0) {
                                        c9759.f9120.m13871(c9759.f9122.f23240, "\"{0}\" token is expected", EnumC16818.f49567.m38127());
                                        throw null;
                                    }
                                    c9759.f9120.m13871(c9759.f9122.f23240, "{0} is expected", C6988.m16053("\"", EnumC16818.f49706.m38127(), "\""));
                                    throw null;
                                }
                                EnumC16818 enumC16818M467912 = c20727.m46799();
                                if (enumC16818M467912 != EnumC16818.f49631) {
                                    c9759.f9120.m13871(c9759.f9122.f23240, "{0} is expected", C6988.m16053("\"", enumC16818M467912.m38127(), "\""));
                                    throw null;
                                }
                                c9759.f9122.m20078();
                                c9759.f9122.m20084(EnumC16818.f49733);
                                C8655 c86527 = c9759.f9122;
                                if (c86527.f23232 != EnumC16818.f49668) {
                                    c9759.f9120.m13871(c86527.f23240, "{0} is expected", "The offset_delta value");
                                    throw null;
                                }
                                c20727.m46800(c86527.f23237);
                                if (c20727.m46799() == null) {
                                    arrayList3.add(c20727);
                                    c20727 = null;
                                }
                                c9759.f9122.m20078();
                                i4 = 1;
                                break;
                                break;
                            case 19:
                                if (c20727 == null || c20727.m46805() == EnumC24233.SAME_FRAME) {
                                    if (i5 > 0) {
                                        C6091 c6092 = c9759.f9120;
                                        long j2 = c9759.f9122.f23240;
                                        Object[] objArr2 = new Object[i4];
                                        objArr2[0] = EnumC16818.f49567.m38127();
                                        c6092.m13871(j2, "\"{0}\" token is expected", objArr2);
                                        throw null;
                                    }
                                    C6091 c6093 = c9759.f9120;
                                    long j3 = c9759.f9122.f23240;
                                    Object[] objArr3 = new Object[i4];
                                    objArr3[0] = C6988.m16053("\"", EnumC16818.f49706.m38127(), "\"");
                                    c6093.m13871(j3, "{0} is expected", objArr3);
                                    throw null;
                                }
                                EnumC16818 enumC16818M467913 = c20727.m46799();
                                if (enumC16818M467913 != EnumC16818.f49602) {
                                    c9759.f9120.m13871(c9759.f9122.f23240, "{0} is expected", C6988.m16053("\"", enumC16818M467913.m38127(), "\""));
                                    throw null;
                                }
                                c9759.f9122.m20078();
                                c9759.f9122.m20084(EnumC16818.f49733);
                                c20727.f63965 = new C7945();
                                C8655 c86528 = c9759.f9122;
                                if (c86528.f23232 == EnumC16818.f49736) {
                                    if (c86528.f23227.equals(EnumC16818.f49708.m38127() + EnumC16818.f49743.m38127())) {
                                        c9759.f9122.m20078();
                                    } else {
                                        c9759.f9122.m20086(EnumC16818.f49708);
                                        while (true) {
                                            c86510 = c9759.f9122;
                                            enumC168116 = c86510.f23232;
                                            if (enumC168116 == EnumC16818.f49679) {
                                                enumC168117 = EnumC16818.f49604;
                                                if (enumC168116 == enumC168117) {
                                                    c86510.m20078();
                                                    c9759.f9122.m20086(EnumC16818.f49743);
                                                } else if (enumC168116 == EnumC16818.f49736 || !c86510.f23227.equals(EnumC16818.f49743.m38127())) {
                                                    c9759.f9121.m30736(c20727.f63965);
                                                    c86511 = c9759.f9122;
                                                    enumC168118 = c86511.f23232;
                                                    if (enumC168118 != EnumC16818.f49716) {
                                                        c86511.m20078();
                                                    } else if (enumC168118 == enumC168117) {
                                                        c9759.f9120.m13871(c86511.f23240, "\"{0}\" token is expected", enumC168117.m38127());
                                                        throw null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    c9759.f9122.m20086(EnumC16818.f49708);
                                    while (true) {
                                        c86510 = c9759.f9122;
                                        enumC168116 = c86510.f23232;
                                        if (enumC168116 == EnumC16818.f49679) {
                                            enumC168117 = EnumC16818.f49604;
                                            if (enumC168116 == enumC168117) {
                                                c86510.m20078();
                                                c9759.f9122.m20086(EnumC16818.f49743);
                                            } else {
                                                if (enumC168116 == EnumC16818.f49736) {
                                                }
                                                c9759.f9121.m30736(c20727.f63965);
                                                c86511 = c9759.f9122;
                                                enumC168118 = c86511.f23232;
                                                if (enumC168118 != EnumC16818.f49716) {
                                                    c86511.m20078();
                                                } else if (enumC168118 == enumC168117) {
                                                    c9759.f9120.m13871(c86511.f23240, "\"{0}\" token is expected", enumC168117.m38127());
                                                    throw null;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (c20727.m46799() == null) {
                                    arrayList3.add(c20727);
                                    i4 = 1;
                                    c20727 = null;
                                } else {
                                    i4 = 1;
                                }
                                break;
                                break;
                        }
                    }
                }
                c10749.m24748(arrayList3);
            } else {
                c8655.m20084(EnumC16818.f49604);
            }
        }
    }

    /* JADX INFO: renamed from: ܺ */
    private void m30717() throws Throwable {
        this.f9122.m20078();
        this.f9122.m20084(EnumC16818.f49767);
        int i = 1;
        Object[] objArr = {EnumC16818.f49668};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        C12826.requireNonNull(obj);
        arrayList.add(obj);
        List listUnmodifiableList = C21562.unmodifiableList(arrayList);
        int i2 = 10;
        ArrayList arrayList2 = new ArrayList(10);
        Throwable th = null;
        C17450 c17450M30691 = null;
        while (true) {
            int i3 = C14864.f42366[this.f9122.f23232.ordinal()];
            if (i3 != i) {
                if (i3 != 32) {
                    if (i3 != 33) {
                        String str = (String) C7480.stream(listUnmodifiableList).map(new C6705(i2)).collect(C24205.joining(", "));
                        C6091 c6091 = this.f9120;
                        long j = this.f9122.f23240;
                        String str2 = listUnmodifiableList.size() != i ? "One of {0} tokens is expected" : "\"{0}\" token is expected";
                        Object[] objArr2 = new Object[i];
                        objArr2[0] = str;
                        c6091.m13871(j, str2, objArr2);
                        throw th;
                    }
                    if (listUnmodifiableList.contains(this.f9122.f23232)) {
                        if (c17450M30691 != null) {
                            this.f38026.m35273(new C11475(c17450M30691, arrayList2));
                        }
                        this.f9122.m20078();
                        return;
                    } else {
                        C6091 c6092 = this.f9120;
                        long j2 = this.f9122.f23240;
                        Object[] objArr3 = new Object[i];
                        objArr3[0] = EnumC16818.f49567.m38127();
                        c6092.m13871(j2, "\"{0}\" token is expected", objArr3);
                        throw th;
                    }
                }
                if (!listUnmodifiableList.contains(this.f9122.f23232)) {
                    Throwable th2 = th;
                    this.f9120.m13871(this.f9122.f23240, "\"{0}\" token is not expected", EnumC16818.f49575.m38127());
                    throw th2;
                }
                this.f9122.m20078();
                this.f9122.m20084(EnumC16818.f49722);
                C24923 c24923 = this.f38025;
                c24923.m54793();
                ArrayList arrayList3 = new ArrayList(i2);
                Object[] objArr4 = new Object[3];
                objArr4[0] = EnumC16818.f49704;
                objArr4[i] = EnumC16818.f49736;
                objArr4[2] = EnumC16818.f49658;
                ArrayList arrayList4 = new ArrayList(3);
                int iM25047 = 0;
                while (iM25047 < 3) {
                    Object obj2 = objArr4[iM25047];
                    iM25047 = C10878.m25047(obj2, arrayList4, obj2, iM25047, i);
                }
                List listUnmodifiableList2 = C21562.unmodifiableList(arrayList4);
                while (true) {
                    EnumC16818 enumC16818 = this.f9122.f23232;
                    EnumC16818 enumC16819 = EnumC16818.f49704;
                    EnumC16818 enumC168110 = EnumC16818.f49736;
                    if (!enumC16818.m38121(enumC16819, enumC168110, EnumC16818.f49658)) {
                        EnumC16818 enumC168111 = this.f9122.f23232;
                        EnumC16818 enumC168112 = EnumC16818.f49716;
                        if (enumC168111 != enumC168112) {
                            EnumC16818 enumC168113 = EnumC16818.f49604;
                            if (enumC168111 != enumC168113) {
                                if (arrayList3.isEmpty()) {
                                    this.f9120.m13871(this.f9122.f23240, "BootstrapMethod argument is expected", new Object[0]);
                                    throw null;
                                }
                                this.f9120.m13871(this.f9122.f23240, "One of {0} tokens is expected", (String) C7480.stream(listUnmodifiableList2).map(new C6705(10)).collect(C24205.joining(", ")));
                                throw null;
                            }
                            if (!listUnmodifiableList2.contains(enumC168111)) {
                                this.f9120.m13871(this.f9122.f23240, "\"{0}\" token is not expected", enumC168113.m38127());
                                throw null;
                            }
                            c24923.m54791();
                            this.f9122.m20078();
                            this.f38026.m35273(new C11475(c17450M30691, arrayList3));
                            arrayList2 = new ArrayList(10);
                            Object[] objArr5 = {EnumC16818.f49668, EnumC16818.f49567};
                            ArrayList arrayList5 = new ArrayList(2);
                            int iM25048 = 0;
                            while (iM25048 < 2) {
                                Object obj3 = objArr5[iM25048];
                                iM25048 = C10878.m25047(obj3, arrayList5, obj3, iM25048, 1);
                            }
                            listUnmodifiableList = C21562.unmodifiableList(arrayList5);
                            i = 1;
                            i2 = 10;
                            th = null;
                            c17450M30691 = null;
                            break;
                        }
                        if (!listUnmodifiableList2.contains(enumC168111)) {
                            this.f9120.m13871(this.f9122.f23240, "\"{0}\" token is not expected", enumC168112.m38127());
                            throw null;
                        }
                        this.f9122.m20078();
                        Object[] objArr6 = {enumC16819, enumC168110};
                        ArrayList arrayList6 = new ArrayList(2);
                        int iM25049 = 0;
                        while (iM25049 < 2) {
                            Object obj4 = objArr6[iM25049];
                            iM25049 = C10878.m25047(obj4, arrayList6, obj4, iM25049, 1);
                        }
                        listUnmodifiableList2 = C21562.unmodifiableList(arrayList6);
                    } else {
                        if (!listUnmodifiableList2.contains(this.f9122.f23232)) {
                            this.f9120.m13871(this.f9122.f23240, "BootstrapMethod argument is not expected", new Object[0]);
                            throw null;
                        }
                        arrayList3.add(c24923.m54790(null, null, false));
                        Object[] objArr7 = {EnumC16818.f49716, EnumC16818.f49604};
                        ArrayList arrayList7 = new ArrayList(2);
                        int iM250410 = 0;
                        while (iM250410 < 2) {
                            Object obj5 = objArr7[iM250410];
                            iM250410 = C10878.m25047(obj5, arrayList7, obj5, iM250410, 1);
                        }
                        listUnmodifiableList2 = C21562.unmodifiableList(arrayList7);
                    }
                }
            } else {
                if (!listUnmodifiableList.contains(this.f9122.f23232)) {
                    this.f9120.m13871(this.f9122.f23240, "\"{0}\" token is expected", EnumC16818.f49668.m38127());
                    throw null;
                }
                if (c17450M30691 != null) {
                    this.f38026.m35273(new C11475(c17450M30691, arrayList2));
                }
                C8655 c8655 = this.f9122;
                EnumC16818 enumC168114 = EnumC16818.f49668;
                c8655.m20084(enumC168114);
                C8655 c8656 = this.f9122;
                int i4 = c8656.f23237;
                c8656.m20084(EnumC16818.f49722);
                c17450M30691 = m30691();
                C8655 c8657 = this.f9122;
                if (c8657.f23232 == EnumC16818.f49704) {
                    c8657.m20078();
                    this.f9122.m20084(EnumC16818.f49604);
                }
                Object[] objArr8 = {EnumC16818.f49575, enumC168114, EnumC16818.f49567};
                ArrayList arrayList8 = new ArrayList(3);
                int iM250411 = 0;
                while (iM250411 < 3) {
                    Object obj6 = objArr8[iM250411];
                    iM250411 = C10878.m25047(obj6, arrayList8, obj6, iM250411, 1);
                }
                listUnmodifiableList = C21562.unmodifiableList(arrayList8);
                i = 1;
                th = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۡ */
    private void m30709() {
        ArrayList arrayList = new ArrayList(256);
        C17450 c17450M30691 = m30691();
        C8655 c8655 = this.f9122;
        EnumC16818 enumC16818 = c8655.f23232;
        EnumC16818 enumC16819 = EnumC16818.f49767;
        if (enumC16818 != enumC16819) {
            c8655.m20078();
        }
        C8655 c8656 = this.f9122;
        EnumC16818 enumC168110 = c8656.f23232;
        EnumC16818 enumC168111 = EnumC16818.f49604;
        C24923 c24923 = this.f38025;
        if (enumC168110 == enumC168111) {
            c8656.m20078();
            C8655 c8657 = this.f9122;
            if (c8657.f23232 == enumC16819) {
                c8657.m20078();
                c24923.m54793();
                if (this.f9122.f23232 == EnumC16818.f49567) {
                    this.f38026.m35273(new C11475(c17450M30691, Collections.EMPTY_LIST));
                    this.f9122.m20078();
                    return;
                }
                while (true) {
                    arrayList.add(c24923.m54790(null, null, false));
                    EnumC16818 enumC168112 = this.f9122.f23232;
                    EnumC16818 enumC168113 = EnumC16818.f49716;
                    EnumC16818 enumC168114 = EnumC16818.f49604;
                    if (!enumC168112.m38121(enumC168113, enumC168114)) {
                        C8655 c8658 = this.f9122;
                        EnumC16818 enumC168115 = c8658.f23232;
                        EnumC16818 enumC168116 = EnumC16818.f49567;
                        if (enumC168115 == enumC168116) {
                            c24923.m54791();
                            this.f9122.m20078();
                            break;
                        }
                        this.f9120.m13871(c8658.f23240, "One of {0} tokens is expected", enumC168113.m38122() + ", " + enumC168114.m38122() + ", or " + enumC168116.m38122());
                        throw null;
                    }
                    this.f9122.m20078();
                    if (this.f9122.f23232 == EnumC16818.f49567) {
                        c24923.m54791();
                        this.f9122.m20078();
                        break;
                    }
                }
            }
            this.f38026.m35273(new C11475(c17450M30691, arrayList));
        }
        C8655 c8659 = this.f9122;
        EnumC16818 enumC168117 = c8659.f23232;
        if (enumC168117 == EnumC16818.f49767) {
            c8659.m20078();
            c24923.m54793();
            if (this.f9122.f23232 == EnumC16818.f49567) {
                this.f38026.m35273(new C11475(c17450M30691, Collections.EMPTY_LIST));
                this.f9122.m20078();
                return;
            }
            do {
                arrayList.add(c24923.m54790(null, null, false));
                EnumC16818 enumC168118 = this.f9122.f23232;
                EnumC16818 enumC168119 = EnumC16818.f49716;
                EnumC16818 enumC168120 = EnumC16818.f49604;
                if (enumC168118.m38121(enumC168119, enumC168120)) {
                    this.f9122.m20078();
                } else {
                    C8655 c86510 = this.f9122;
                    EnumC16818 enumC168121 = c86510.f23232;
                    EnumC16818 enumC168122 = EnumC16818.f49567;
                    if (enumC168121 != enumC168122) {
                        this.f9120.m13871(c86510.f23240, "One of {0} tokens is expected", enumC168119.m38122() + ", " + enumC168120.m38122() + ", or " + enumC168122.m38122());
                        throw null;
                    }
                    c24923.m54791();
                    this.f9122.m20078();
                }
                this.f38026.m35273(new C11475(c17450M30691, arrayList));
                return;
            } while (this.f9122.f23232 != EnumC16818.f49567);
            c24923.m54791();
            this.f9122.m20078();
            this.f38026.m35273(new C11475(c17450M30691, arrayList));
            return;
        }
        if (enumC168117 != EnumC16818.f49704) {
            return;
        }
        arrayList.add(this.f38012.m11353(c8659.f23237));
        this.f9122.m20078();
        while (true) {
            C8655 c86511 = this.f9122;
            EnumC16818 enumC168123 = c86511.f23232;
            if (enumC168123 == EnumC16818.f49604) {
                this.f38026.m35273(new C11475(c17450M30691, arrayList));
                return;
            } else {
                if (enumC168123 != EnumC16818.f49704) {
                    this.f9120.m13871(c86511.f23240, "invalid.bootstrapmethod", new Object[0]);
                    throw null;
                }
                arrayList.add(this.f38012.m11353(c86511.f23237));
                this.f9122.m20078();
            }
        }
    }

    /* JADX INFO: renamed from: ֡ */
    private C17450 m30691() {
        C17450 c17450M30729;
        C8655 c8655 = this.f9122;
        EnumC16818 enumC16818 = c8655.f23232;
        EnumC16818 enumC16819 = EnumC16818.f49704;
        if (enumC16818 == enumC16819) {
            return this.f38012.m11353(c8655.f23237);
        }
        EnumC18121 enumC18121M30743 = this.f9121.m30743();
        this.f9122.m20084(EnumC16818.f49722);
        C8655 c8656 = this.f9122;
        if (c8656.f23232 == enumC16819) {
            c17450M30729 = this.f38012.m11353(c8656.f23237);
            this.f9122.m20078();
        } else {
            c17450M30729 = this.f9121.m30729(enumC18121M30743);
        }
        this.f9122.m20084(EnumC16818.f49604);
        return c17450M30729;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m30700(Consumer consumer) {
        C8655 c8655 = this.f9122;
        if (c8655.f23232 == EnumC16818.f49722) {
            c8655.m20078();
        }
        consumer.m45213n(this.f38025.m54790(EnumC12758.f35925, null, true));
    }

    /* JADX INFO: renamed from: ᩹ */
    private void m30725() {
        C5263 c5263 = this.f38012;
        EnumC6799 enumC6799 = EnumC6799.f17649;
        c5263.m11354(enumC6799.m15521());
        final String strM48088 = this.f9120.m48088();
        C17450 c17450M11355 = this.f38012.m11355(new Function() { // from class: l.ۘܰۚ
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
                Boolean bool;
                String str = (String) obj;
                boolean z = false;
                if (str.contains(strM48088)) {
                    Object[] objArr = {".java", ".jcod", ".jasm", ".class"};
                    ArrayList arrayList = new ArrayList(4);
                    int iM25047 = 0;
                    while (iM25047 < 4) {
                        Object obj2 = objArr[iM25047];
                        iM25047 = C10878.m25047(obj2, arrayList, obj2, iM25047, 1);
                    }
                    Iterator it = C21562.unmodifiableList(arrayList).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            bool = Boolean.FALSE;
                            break;
                        }
                        if (str.contains((String) it.next())) {
                            bool = Boolean.TRUE;
                            break;
                        }
                    }
                    if (bool.booleanValue()) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        });
        String str = c17450M11355 != null ? (String) c17450M11355.f52180.f10654 : null;
        C17450 c17450M30738 = m30738();
        if (c17450M30738.f52180 == null && c17450M30738.f23817 != -1) {
            throw C20865.m47156(this.f9120, this.f9122.f23241, "SourceFile attribute incorrectly points to the ConstantPool", new Object[0]);
        }
        c17450M30738.toString();
        if (str != null && !str.equals(c17450M30738.f52180.f10654)) {
            this.f9120.mo13869(this.f9122.f23241, "The \"{0}\" attribute is already declared in the constant pool structure. A new value \"{1}\" is used.", enumC6799.m15521(), c17450M30738.f52180.f10654);
        }
        C15496 c15496 = this.f38026;
        c15496.f44289 = new C20863(c15496.f40167, enumC6799, c17450M30738);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x013f A[Catch: IllegalArgumentException -> 0x015d, TRY_LEAVE, TryCatch #1 {IllegalArgumentException -> 0x015d, blocks: (B:50:0x0135, B:52:0x013f, B:55:0x0155, B:56:0x015c), top: B:61:0x0135 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0155 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᩸ */
    private void m30724() {
        int i;
        C15496 c15496 = this.f38026;
        C11338 c11338 = new C11338(c15496.f40167, EnumC6799.f17640);
        c11338.f31565 = new StringBuilder();
        c11338.f31567 = new ArrayList();
        c11338.f31566 = EnumC22067.NONE;
        c15496.f44279 = c11338;
        this.f9122.m20084(EnumC16818.f49767);
        boolean zIsEmpty = true;
        boolean z = true;
        while (true) {
            int i2 = C14864.f42366[this.f9122.f23232.ordinal()];
            if (i2 == 1) {
                try {
                    i = this.f9122.f23237;
                    if (c11338.f31566 != EnumC22067.UTF8) {
                        throw new IllegalArgumentException("The byte representation of the string is expected.");
                    }
                    c11338.f31567.add(Byte.valueOf((byte) i));
                    c11338.f31566 = EnumC22067.BYTE;
                    z = false;
                } catch (IllegalArgumentException unused) {
                    throw C20865.m47156(this.f9120, this.f9122.f23240, "\"{0}\" token is expected", new Object[]{EnumC16818.f49772.m38127()});
                }
            } else if (i2 != 30) {
                switch (i2) {
                    case 33:
                        if (!z) {
                            throw C20865.m47156(this.f9120, this.f9122.f23240, "\"{0}\" token is expected", new Object[]{EnumC16818.f49604.m38127()});
                        }
                        int iOrdinal = c11338.f31566.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                if (iOrdinal != 2) {
                                    throw new IncompatibleClassChangeError();
                                }
                                zIsEmpty = c11338.f31567.isEmpty();
                            } else if (c11338.f31565.length() != 0) {
                                zIsEmpty = false;
                            }
                        }
                        if (zIsEmpty) {
                            this.f9120.mo13869(this.f9122.f23240, "The SourceDebugExtension attribute has the empty debug_extension structure.", new Object[0]);
                        }
                        this.f9122.m20078();
                        return;
                    case 34:
                    case 35:
                        i = this.f9122.f23237;
                        if (c11338.f31566 != EnumC22067.UTF8) {
                            throw new IllegalArgumentException("The byte representation of the string is expected.");
                        }
                        c11338.f31567.add(Byte.valueOf((byte) i));
                        c11338.f31566 = EnumC22067.BYTE;
                        break;
                        break;
                    case 36:
                        if (!z) {
                            throw C20865.m47156(this.f9120, this.f9122.f23240, "\"{0}\" token is expected", new Object[]{EnumC16818.f49604.m38127()});
                        }
                        try {
                            String str = this.f9122.f23227;
                            if (c11338.f31566 == EnumC22067.BYTE) {
                                throw new IllegalArgumentException("The valid modified UTF-8 string is expected.");
                            }
                            c11338.f31565.append(str);
                            c11338.f31566 = EnumC22067.UTF8;
                        } catch (IllegalArgumentException unused2) {
                            throw C20865.m47156(this.f9120, this.f9122.f23240, "\"{0}\" token is expected", new Object[]{EnumC16818.f49613.m38127()});
                        }
                        break;
                        break;
                    default:
                        if (z) {
                            this.f9120.mo11117(this.f9122.f23240, "Either \"{0}\" or \"{1}\" token is expected", EnumC16818.f49772.m38127(), EnumC16818.f49567.m38127());
                        } else {
                            this.f9120.mo11117(this.f9122.f23240, "\"{0}\" token is expected", EnumC16818.f49604.m38127());
                        }
                        throw new C13902();
                }
                z = false;
            } else {
                if (z) {
                    throw C20865.m47156(this.f9120, this.f9122.f23240, "\"{0}\" token is expected", new Object[]{(c11338.f31566 == EnumC22067.BYTE ? EnumC16818.f49613 : EnumC16818.f49772).m38127()});
                }
                z = true;
            }
            this.f9122.m20078();
        }
    }

    /* JADX INFO: renamed from: ֨ */
    private void m30692() {
        C17450 c17450M30730 = m30730(true);
        if (!c17450M30730.m39779().m29299(EnumC12758.f35904, EnumC12758.f35925)) {
            m30698("Either a class name or Constant Pool index expected, got {0}");
            throw null;
        }
        this.f38026.m35278(c17450M30730);
        c17450M30730.toString();
        this.f9122.m20084(EnumC16818.f49604);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m30714(Consumer consumer) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            C17450 c17450M30730 = m30730(true);
            if (!c17450M30730.m39779().m29299(EnumC12758.f35904, EnumC12758.f35925)) {
                m30698("Either a class name or Constant Pool index expected, got {0}");
                throw null;
            }
            arrayList.add(c17450M30730);
            c17450M30730.toString();
            C8655 c8655 = this.f9122;
            if (c8655.f23232 != EnumC16818.f49716) {
                c8655.m20084(EnumC16818.f49604);
                consumer.m45213n(arrayList);
                return;
            }
            c8655.m20078();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m30701(C6818 c6818) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            C17450 c17450M30738 = m30738();
            if (!c17450M30738.m39779().m29298(EnumC12758.f35904)) {
                m30698("Either a field descriptor or Constant Pool index expected, got {0}");
                throw null;
            }
            arrayList.add(c17450M30738);
            c17450M30738.toString();
            C8655 c8655 = this.f9122;
            if (c8655.f23232 != EnumC16818.f49716) {
                c8655.m20084(EnumC16818.f49604);
                c6818.m45213n(arrayList);
                return;
            }
            c8655.m20078();
        }
    }

    /* JADX INFO: renamed from: ᩴ */
    private void m30721() {
        C17450 c17450M11356;
        EnumC12758 enumC12758 = EnumC12758.f35925;
        C24923 c24923 = this.f38025;
        C17450 c17450M54790 = c24923.m54790(enumC12758, null, true);
        C8655 c8655 = this.f9122;
        if (c8655.f23232 == EnumC16818.f49604) {
            this.f38026.m35274(c17450M54790, (C17450) null);
            return;
        }
        c8655.m20084(EnumC16818.f49722);
        if (this.f9122.f23232.m38121(EnumC16818.f49704, EnumC16818.f49668)) {
            int i = this.f9122.f23237;
            c17450M11356 = i != 0 ? this.f38012.m11353(i) : null;
            this.f9122.m20078();
        } else {
            c17450M11356 = this.f38012.m11356(c24923.m54788(EnumC12758.f35921));
        }
        this.f38026.m35274(c17450M54790, c17450M11356);
    }

    /* JADX INFO: renamed from: ۠ */
    private void m30708() {
        C17450 c17450M30738;
        this.f9122.m20084(EnumC16818.f49767);
        C3961 c3961M35265 = this.f38026.m35265(this.f9122.f23240);
        while (true) {
            EnumC16818 enumC16818 = this.f9122.f23232;
            if (enumC16818 == EnumC16818.f49567) {
                if (c3961M35265.isEmpty()) {
                    this.f9120.mo13869(this.f9122.f23240, "Record should have at least one component", new Object[0]);
                    this.f38026.m35282();
                }
                this.f9122.m20078();
                return;
            }
            ArrayList arrayListM54092 = enumC16818 == EnumC16818.f49684 ? this.f38022.m54092() : null;
            this.f9122.m20084(EnumC16818.f49771);
            C17450 c17450M30739 = m30738();
            this.f9122.m20084(EnumC16818.f49722);
            C17450 c17450M307310 = m30738();
            int i = C14864.f42366[this.f9122.f23232.ordinal()];
            if (i == 30 || i == 31) {
                this.f9122.m20078();
                C8655 c8655 = this.f9122;
                if (c8655.f23232 == EnumC16818.f49655) {
                    c8655.m20078();
                    c17450M30738 = m30738();
                } else {
                    c3961M35265.m7907(c17450M30739, c17450M307310, null, arrayListM54092);
                }
            } else if (i != 37) {
                c17450M30738 = null;
            } else {
                this.f9122.m20078();
                C8655 c8656 = this.f9122;
                if (c8656.f23232 == EnumC16818.f49655) {
                    c8656.m20078();
                }
                c17450M30738 = m30738();
            }
            c3961M35265.m7907(c17450M30739, c17450M307310, c17450M30738, arrayListM54092);
            EnumC16818 enumC16819 = this.f9122.f23232;
            EnumC16818 enumC168110 = EnumC16818.f49716;
            EnumC16818 enumC168111 = EnumC16818.f49604;
            if (!enumC16819.m38121(enumC168110, enumC168111)) {
                this.f9120.m13871(this.f9122.f23240, "Either \"{0}\" or \"{1}\" token is expected", "<" + enumC168111.m38122() + ">", "<" + enumC168110.m38122() + ">");
                throw null;
            }
            this.f9122.m20078();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private void m30719(int i) {
        if (i != 0) {
            this.f9120.mo13869(this.f9122.f23240, "Modifier(s) are ignored as they cannot be applied to a group of inner classes", new Object[0]);
        }
        this.f9122.m20084(EnumC16818.f49767);
        while (true) {
            C8655 c8655 = this.f9122;
            if (c8655.f23232 == EnumC16818.f49567) {
                if (this.f38026.f44282 == null) {
                    this.f9120.mo13869(c8655.f23240, "InnerClasses group should have at least one inner class", new Object[0]);
                }
                this.f9122.m20078();
                return;
            }
            m30720(0);
            EnumC16818 enumC16818 = this.f9122.f23232;
            EnumC16818 enumC16819 = EnumC16818.f49716;
            EnumC16818 enumC168110 = EnumC16818.f49604;
            if (!enumC16818.m38121(enumC16819, enumC168110)) {
                this.f9120.m13871(this.f9122.f23240, "Either \"{0}\" or \"{1}\" token is expected", "<" + enumC168110.m38122() + ">", "<" + enumC16819.m38122() + ">");
                throw null;
            }
            this.f9122.m20078();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m30720(int i) {
        C15496 c15496 = this.f38026;
        long j = this.f9122.f23240;
        C6091 c6091 = (C6091) c15496.m32176();
        int iM18879 = EnumC8140.m18879(i, EnumC8140.f21448, EnumC8140.f21468);
        EnumC8140[] enumC8140Arr = EnumC8140.f21476;
        if (((~EnumC8140.m18860(enumC8140Arr)) & iM18879) != 0) {
            c6091.mo13869(j, "Invalid modifier(s) for an inner class {0}", EnumC8140.m18880(iM18879 & (~EnumC8140.m18860(enumC8140Arr)), EnumC21552.INNER_CLASS));
        }
        int iM30734 = m30734();
        if (i != 0 && iM30734 != 0) {
            C6091 c6092 = this.f9120;
            long j2 = this.f9122.f23240;
            String strM18861 = EnumC8140.m18861(i | iM30734, EnumC21552.INNER_CLASS);
            int length = strM18861.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iCodePointAt = strM18861.codePointAt(iCharCount);
                if (!Character.isWhitespace(iCodePointAt)) {
                    break;
                } else {
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
            while (length > iCharCount) {
                int iCodePointBefore = Character.codePointBefore(strM18861, length);
                if (!Character.isWhitespace(iCodePointBefore)) {
                    break;
                } else {
                    length -= Character.charCount(iCodePointBefore);
                }
            }
            c6092.mo13869(j2, "Combined \"{0}\" modifiers apply to the InnerClass", strM18861.substring(iCharCount, length));
        }
        int i2 = i | iM30734;
        EnumC16818 enumC16818 = this.f9122.f23232;
        if (enumC16818 == EnumC16818.f49658) {
            m30713(i2, this.f38012.m11353(0));
            return;
        }
        if (enumC16818 == EnumC16818.f49736 && enumC16818.m38126()) {
            m30695(i2, m30738());
            return;
        }
        C8655 c8655 = this.f9122;
        EnumC16818 enumC16819 = c8655.f23232;
        if (enumC16819 == EnumC16818.f49704) {
            C17450 c17450M11353 = this.f38012.m11353(c8655.f23237);
            if (!(c17450M11353.f52180 instanceof C23368)) {
                m30713(i2, this.f38012.m11353(0));
                return;
            } else {
                this.f9122.m20078();
                m30695(i2, c17450M11353);
                return;
            }
        }
        if (!enumC16819.m38126()) {
            m30706();
            throw null;
        }
        C17450 c17450M11354 = this.f38012.m11354(this.f9122.f23232.m38127());
        this.f9122.m20078();
        m30695(i2, c17450M11354);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m30695(int i, C17450 c17450) {
        C8655 c8655 = this.f9122;
        if (c8655.f23232 == EnumC16818.f49733) {
            c8655.m20078();
            m30713(i, c17450);
        } else {
            m30706();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m30713(int i, C17450 c17450) {
        C17450 c17450M54790;
        EnumC16818 enumC16818 = this.f9122.f23232;
        EnumC16818 enumC16819 = EnumC16818.f49704;
        if (enumC16818 == enumC16819 || enumC16818 == EnumC16818.f49658) {
            C24923 c24923 = this.f38025;
            C17450 c17450M54791 = enumC16818 == enumC16819 ? c24923.m54790(EnumC12758.f35925, null, false) : null;
            C8655 c8655 = this.f9122;
            EnumC16818 enumC168110 = c8655.f23232;
            EnumC16818 enumC168111 = EnumC16818.f49658;
            if (enumC168110 == enumC168111) {
                c8655.m20078();
                c17450M54791 = c24923.m54790(EnumC12758.f35925, null, true);
            }
            C8655 c8656 = this.f9122;
            EnumC16818 enumC168112 = c8656.f23232;
            EnumC16818 enumC168113 = EnumC16818.f49604;
            if (enumC168112 == enumC168113) {
                C17450 c17450M11353 = this.f38012.m11353(0);
                m30696(i, c17450, c17450M54791, c17450M11353);
                this.f38026.m35268(i, c17450, c17450M54791, c17450M11353);
                return;
            }
            if (enumC168112 != EnumC16818.f49690) {
                m30706();
                throw null;
            }
            c8656.m20078();
            C8655 c8657 = this.f9122;
            EnumC16818 enumC168114 = c8657.f23232;
            if (enumC168114 == enumC168111 || enumC168114 == enumC16819) {
                if (enumC168114 == enumC168111) {
                    c8657.m20078();
                    c17450M54790 = c24923.m54790(EnumC12758.f35925, null, true);
                } else {
                    c17450M54790 = null;
                }
                if (this.f9122.f23232 == enumC16819) {
                    c17450M54790 = c24923.m54790(EnumC12758.f35925, null, false);
                }
                if (this.f9122.f23232 == enumC168113) {
                    m30696(i, c17450, c17450M54791, c17450M54790);
                    this.f38026.m35268(i, c17450, c17450M54791, c17450M54790);
                    return;
                } else {
                    m30706();
                    throw null;
                }
            }
            m30706();
            throw null;
        }
        m30706();
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m30696(int i, C17450 c17450, C17450 c17451, C17450 c17452) {
        AbstractC4711 abstractC4711;
        this.f9120.m48087("[" + EnumC8140.m18880(i, EnumC21552.INNER_CLASS) + "], ", new Object[0]);
        if (c17450 != this.f38012.m11353(0) && (abstractC4711 = c17450.f52180) != null) {
            this.f9120.m48087(abstractC4711 + " =\n\t\t", new Object[0]);
        }
        C17450 c17453 = (C17450) ((C18674) c17451.f52180).f10654;
        AbstractC4711 abstractC4712 = c17453.f52180;
        if (abstractC4712 == null) {
            this.f9120.m48087("<#cpx-unresolved> ", new Object[0]);
        } else if (abstractC4712.f10654 == null) {
            this.f9120.m48087("<#cpx-0> ", new Object[0]);
        } else {
            this.f9120.m48087(c17453.f52180.f10654 + " ", new Object[0]);
        }
        if (c17452 != this.f38012.m11353(0) && c17452.f23817 != 0) {
            AbstractC4711 abstractC4713 = ((C17450) ((C18674) c17452.f52180).f10654).f52180;
            if (abstractC4713 == null) {
                this.f9120.m48087("\n\t\tof <#cpx-unresolved>  ", new Object[0]);
            } else {
                C23368 c23368 = (C23368) abstractC4713;
                if (c23368.f10654 == null) {
                    this.f9120.m48087("\n\t\tof <#cpx-0>  ", new Object[0]);
                } else {
                    this.f9120.m48087("\n\t\tof " + ((String) c23368.f10654), new Object[0]);
                }
            }
        }
        this.f9120.m48087("\n", new Object[0]);
    }

    /* JADX INFO: renamed from: ۙ */
    private void m30706() {
        throw C20865.m47156(this.f9120, this.f9122.f23240, "Invalid declaration of Inner Class", new Object[0]);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m30702(EnumC16818 enumC16818, EnumC16818 enumC16819) {
        int i = 1;
        while (true) {
            this.f9122.m20078();
            C8655 c8655 = this.f9122;
            EnumC16818 enumC168110 = c8655.f23232;
            if (enumC168110 == enumC16818) {
                i++;
            } else if (enumC168110 == enumC16819) {
                i--;
                if (i == 0) {
                    return;
                }
            } else if (enumC168110 == EnumC16818.f49679) {
                this.f9120.mo11117(c8655.f23240, "Unbalanced parentheses", new Object[0]);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m30712(int i) throws Throwable {
        char c;
        C17450 c17450M54790;
        String str;
        int iM18907 = i;
        C8655 c8655 = this.f9122;
        long j = c8655.f23240;
        if (EnumC8140.m18878(i)) {
            EnumC8140.m18864(EnumC21552.VALUE_OBJECTS);
        }
        int iM18879 = EnumC8140.m18879(iM18907, EnumC8140.f21448, EnumC8140.f21468, EnumC8140.f21481);
        if (EnumC8140.m18893(iM18879, EnumC8140.f21493, EnumC8140.f21477, EnumC8140.f21482)) {
            c8655.f9120.mo13869(c8655.f23240, "Ambiguous use of similar modifiers", new Object[0]);
        }
        EnumC16818 enumC16818 = c8655.f23232;
        EnumC16818 enumC16819 = EnumC16818.f49658;
        if (enumC16818 == enumC16819 || EnumC8140.m18877(iM18879)) {
            c = 0;
        } else {
            c = 0;
            c8655.f9120.mo13869(c8655.f23240, "Expected \"{0}\" or \"{1}\" token; interpreted as \"{2}\"", enumC16819.m38127(), EnumC16818.f49616.m38127(), enumC16819.m38127());
        }
        if (EnumC8140.m18877(iM18879)) {
            if (!EnumC8140.m18881(iM18879)) {
                C6091 c6091 = c8655.f9120;
                long j2 = c8655.f23240;
                Object[] objArr = new Object[1];
                objArr[c] = EnumC8140.m18880(iM18879, EnumC21552.CLASS);
                c6091.mo13869(j2, "\"{0}\": If the ACC_INTERFACE flag is set, the ACC_ABSTRACT flag must also be set", objArr);
            }
            EnumC8140[] enumC8140Arr = new EnumC8140[4];
            enumC8140Arr[c] = EnumC8140.f21469;
            enumC8140Arr[1] = EnumC8140.f21457;
            enumC8140Arr[2] = EnumC8140.f21491;
            enumC8140Arr[3] = EnumC8140.f21449;
            if (EnumC8140.m18867(iM18879, enumC8140Arr)) {
                if (EnumC8140.m18889() == EnumC21552.VALUE_OBJECTS) {
                    C6091 c6092 = c8655.f9120;
                    long j3 = c8655.f23240;
                    Object[] objArr2 = new Object[1];
                    objArr2[c] = EnumC8140.m18880(iM18879, EnumC21552.CLASS);
                    c6092.mo13869(j3, "\"{0}\": If the ACC_INTERFACE flag is set, the ACC_FINAL, ACC_IDENTITY, ACC_ENUM, and ACC_MODULE flags must not be set.", objArr2);
                } else {
                    C6091 c6093 = c8655.f9120;
                    long j4 = c8655.f23240;
                    Object[] objArr3 = new Object[1];
                    objArr3[c] = EnumC8140.m18880(iM18879, EnumC21552.CLASS);
                    c6093.mo13869(j4, "\"{0}\": If the ACC_INTERFACE flag is set, the ACC_FINAL, ACC_SUPER, ACC_ENUM, and ACC_MODULE flags must not be set.", objArr3);
                }
            }
        } else {
            EnumC8140[] enumC8140Arr2 = new EnumC8140[2];
            enumC8140Arr2[c] = EnumC8140.f21471;
            enumC8140Arr2[1] = EnumC8140.f21449;
            if (EnumC8140.m18867(iM18879, enumC8140Arr2)) {
                C6091 c6094 = c8655.f9120;
                long j5 = c8655.f23240;
                Object[] objArr4 = new Object[1];
                objArr4[c] = EnumC8140.m18880(iM18879, EnumC21552.CLASS);
                c6094.mo13869(j5, "\"{0}\": If the ACC_INTERFACE flag is not set ACC_ANNOTATION, and ACC_MODULE flags must not be set.", objArr4);
            }
            if (EnumC8140.m18889() == EnumC21552.VALUE_OBJECTS) {
                EnumC8140[] enumC8140Arr3 = new EnumC8140[3];
                enumC8140Arr3[c] = EnumC8140.f21469;
                enumC8140Arr3[1] = EnumC8140.f21491;
                enumC8140Arr3[2] = EnumC8140.f21473;
                if (!EnumC8140.m18867(iM18879, enumC8140Arr3)) {
                    String strM18880 = EnumC8140.m18880(iM18879, EnumC21552.CLASS);
                    String strConcat = strM18880.isEmpty() ? "ACC_VALUE" : "ACC_VALUE, ".concat(strM18880);
                    C6091 c6095 = c8655.f9120;
                    long j6 = c8655.f23240;
                    Object[] objArr5 = new Object[1];
                    objArr5[c] = strConcat;
                    c6095.mo13869(j6, "\"{0}\": If the ACC_INTERFACE flag is not set a value class must have at least one of its ACC_FINAL, ACC_IDENTITY, or ACC_ABSTRACT flags set", objArr5);
                }
            }
            EnumC8140[] enumC8140Arr4 = EnumC8140.f21490;
            if (!EnumC8140.m18887(iM18879, enumC8140Arr4)) {
                C6091 c6096 = c8655.f9120;
                long j7 = c8655.f23240;
                Object[] objArr6 = new Object[1];
                objArr6[c] = EnumC8140.m18880((~EnumC8140.m18860(enumC8140Arr4)) & iM18879, EnumC21552.CLASS);
                c6096.mo13869(j7, "Invalid modifier(s) for a class: \"{0}\"", objArr6);
            }
        }
        if (EnumC8140.m18866(iM18879, EnumC8140.f21473, EnumC8140.f21469)) {
            C6091 c6097 = c8655.f9120;
            long j8 = c8655.f23240;
            String strM18881 = EnumC8140.m18880(iM18879, EnumC21552.CLASS);
            Object[] objArr7 = new Object[1];
            objArr7[c] = strM18881;
            c6097.mo13869(j8, "\"{0}\": Class cannot be both abstract and final", objArr7);
        }
        ArrayList arrayList = this.f38019;
        if (arrayList != null) {
            this.f38026.m32173(arrayList);
        }
        C8655 c8656 = this.f9122;
        EnumC16818 enumC168110 = c8656.f23232;
        if (enumC168110 == enumC16819) {
            c8656.m20078();
        } else {
            EnumC16818 enumC168111 = EnumC16818.f49684;
            if (enumC168110 == enumC168111) {
                c8656.m20078();
                C8655 c8657 = this.f9122;
                EnumC16818 enumC168112 = c8657.f23232;
                EnumC16818 enumC168113 = EnumC16818.f49616;
                if (enumC168112 != enumC168113) {
                    C6091 c6098 = this.f9120;
                    long j9 = c8657.f23241;
                    String strM38127 = enumC168111.m38127();
                    String strM38128 = enumC168113.m38127();
                    Object[] objArr8 = new Object[2];
                    objArr8[c] = strM38127;
                    objArr8[1] = strM38128;
                    throw C20865.m47156(c6098, j9, "Either \"{0}\" or \"{1}\" token is expected", objArr8);
                }
                iM18907 |= EnumC8140.f21471.m18907() | EnumC8140.f21475.m18907();
                this.f9122.m20078();
            }
        }
        EnumC12758 enumC12758 = EnumC12758.f35925;
        C24923 c24923 = this.f38025;
        C17450 c17450M54791 = c24923.m54790(enumC12758, null, true);
        C8655 c8658 = this.f9122;
        EnumC16818 enumC168114 = c8658.f23232;
        if (enumC168114 == EnumC16818.f49724) {
            c8658.m20078();
            int i2 = C14864.f42366[this.f9122.f23232.ordinal()];
            if (i2 == 2) {
                str = this.f9122.f23227;
            } else if (i2 != 4) {
                if (i2 != 36) {
                    C6091 c6099 = this.f9120;
                    long j10 = this.f9122.f23240;
                    Object[] objArr9 = new Object[1];
                    objArr9[c] = C22934.m51254(this.f9122.f23232, new StringBuilder("\""), "\"");
                    throw C20865.m47156(c6099, j10, "Either name or Constant Pool index expected, got {0}", objArr9);
                }
                str = this.f9122.f23227;
            } else {
                str = this.f9122.f23234;
            }
            this.f9122.m20078();
            this.f38026.f44277 = C21466.m48631(".", str);
        } else {
            if (enumC168114 == EnumC16818.f49568) {
                throw C20865.m47156(this.f9120, c8658.f23241, "\"{0}\" token is expected", new Object[]{C22934.m51254(EnumC16818.f49579, new StringBuilder("\""), "\"")});
            }
            if (enumC168114 == EnumC16818.f49604) {
                c8658.m20078();
            } else if (enumC168114 == EnumC16818.f49722) {
                c8658.m20078();
                C17450 c17450M30738 = m30738();
                c17450M30738.toString();
                this.f38026.m32174(c17450M30738);
            }
        }
        C8655 c8659 = this.f9122;
        if (c8659.f23232 == EnumC16818.f49660) {
            c8659.m20078();
            c17450M54790 = c24923.m54790(enumC12758, null, true);
            while (true) {
                C8655 c86510 = this.f9122;
                if (c86510.f23232 != EnumC16818.f49716) {
                    break;
                }
                c86510.m20078();
                this.f9120.mo13869(j, "Multiple inheritance is not supported", new Object[0]);
                c17450M54790 = c24923.m54790(EnumC12758.f35925, null, true);
            }
        } else {
            c17450M54790 = null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (this.f9122.f23232 == EnumC16818.f49572) {
            do {
                this.f9122.m20078();
                C17450 c17450M54792 = c24923.m54790(EnumC12758.f35925, null, true);
                if (arrayList2.contains(c17450M54792)) {
                    this.f9120.mo13869(j, "Interface {0} repeated", c17450M54792);
                } else {
                    arrayList2.add(c17450M54792);
                }
            } while (this.f9122.f23232 == EnumC16818.f49716);
        }
        EnumC16818 enumC168115 = this.f9122.f23232;
        EnumC16818 enumC168116 = EnumC16818.f49767;
        if (enumC168115 != enumC168116) {
            if (this.f38026.f44273.m52372()) {
                this.f38026.f44273.getClass();
            }
            m30723();
            if (EnumC8140.m18889() == EnumC21552.VALUE_OBJECTS && !this.f38026.f44273.m52371()) {
                this.f9120.mo13869(this.f9122.f23241, "Class file version {0} does not conform to the new kind of objects; expected version {1}", this.f38026.f44273.m52365(), C23563.m52364().m52365());
            }
        } else if (!this.f38026.f44273.m52372()) {
            this.f38026.f44273.getClass();
            this.f38026.f44273.m52369();
            this.f9120.mo13869(this.f9122.f23241, "Class file version not specified in file or by -cv parameter. Defaulting to version \"{0}\"", this.f38026.f44273.m52365());
        }
        this.f9122.m20084(enumC168116);
        C15496 c15496 = this.f38026;
        C24214 c24214 = c15496.f44284;
        c15496.f40157 = iM18907;
        if (EnumC8140.m18865(iM18907)) {
            c15496.m32172();
        }
        EnumC13486 enumC13486 = EnumC13486.HEADER;
        c24214.getClass();
        C8537 c8537 = c24214.f76743;
        C8537 c8538 = c24214.f76741;
        EnumC13486 enumC13487 = EnumC13486.CLASSFILE;
        if (enumC13486 == enumC13487) {
            c8538.f22916 = c17450M54791;
        } else {
            c8537.f22916 = c17450M54791;
        }
        if (enumC13486 == enumC13487) {
            c8538.f22917 = c17450M54790;
        } else {
            c8537.f22917 = c17450M54790;
        }
        c15496.f44287 = arrayList2;
        c15496.f44273.m52369();
        while (true) {
            C8655 c86511 = this.f9122;
            EnumC16818 enumC168117 = c86511.f23232;
            if (enumC168117 == EnumC16818.f49679 || enumC168117 == EnumC16818.f49567) {
                c86511.m20084(EnumC16818.f49567);
                m30710();
                return;
            }
            int[] iArr = C14864.f42366;
            int i3 = iArr[enumC168117.ordinal()];
            if (i3 == 30) {
                this.f9122.m20078();
            } else if (i3 != 44) {
                if (this.f9122.f23232 == EnumC16818.f49684) {
                    this.f38014 = this.f38022.m54092();
                }
                int iM30734 = m30734();
                try {
                    int i4 = iArr[this.f9122.f23232.ordinal()];
                    if (i4 != 29) {
                        switch (i4) {
                            case 53:
                                this.f9122.m20078();
                                m30718(iM30734);
                                break;
                            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                this.f9122.m20078();
                                m30715(iM30734);
                                break;
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                this.f9122.m20078();
                                if (!this.f9122.f23227.equals(EnumC16818.f49591.m38119())) {
                                    m30720(iM30734);
                                } else {
                                    m30719(iM30734);
                                }
                                break;
                            case 56:
                                if (!this.f9122.f23227.equals(EnumC16818.f49600.m38119())) {
                                    this.f9122.m20078();
                                    m30709();
                                } else {
                                    m30717();
                                }
                                break;
                            case 57:
                                this.f9122.m20078();
                                m30700(new C16875(0, this));
                                this.f9122.m20084(EnumC16818.f49604);
                                break;
                            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                this.f9122.m20078();
                                m30700(new Consumer() { // from class: l.᩸ܰۚ
                                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return C24719.$default$andThen(this, consumer);
                                    }

                                    @Override // java.util.function.Consumer
                                    /* JADX INFO: renamed from: accept */
                                    public final void m45213n(Object obj) {
                                        C24214 c24215 = this.f72097.f38026.f44284;
                                        EnumC13486 enumC13488 = EnumC13486.HEADER;
                                        c24215.getClass();
                                        c24215.f76741.f22917 = (C17450) obj;
                                    }
                                });
                                this.f9122.m20084(EnumC16818.f49604);
                                break;
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                this.f38026.m35271(EnumC6799.f17649, this.f9122.f23240);
                                this.f9122.m20078();
                                m30725();
                                this.f9122.m20084(EnumC16818.f49604);
                                break;
                            case 60:
                                this.f38026.m35271(EnumC6799.f17640, this.f9122.f23240);
                                this.f9122.m20078();
                                m30724();
                                break;
                            case 61:
                                C15496 c15497 = this.f38026;
                                c15497.m35271(EnumC6799.f17629, this.f9122.f23240);
                                if (c15497.m35275(EnumC6799.f17628)) {
                                    this.f9120.mo13869(this.f9122.f23240, "The attribute table of a ClassFile structure must not contain both a NestMembers attribute and a NestHost attribute", new Object[0]);
                                }
                                this.f9122.m20078();
                                m30692();
                                break;
                            case 62:
                                C15496 c15498 = this.f38026;
                                c15498.m35271(EnumC6799.f17628, this.f9122.f23240);
                                if (c15498.m35275(EnumC6799.f17629)) {
                                    this.f9120.mo13869(this.f9122.f23240, "The attribute table of a ClassFile structure must not contain both a NestMembers attribute and a NestHost attribute", new Object[0]);
                                }
                                this.f9122.m20078();
                                m30714(new Consumer() { // from class: l.᩹ܰۚ
                                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return C24719.$default$andThen(this, consumer);
                                    }

                                    @Override // java.util.function.Consumer
                                    /* JADX INFO: renamed from: accept */
                                    public final void m45213n(Object obj) {
                                        this.f75069.f38026.m35280((ArrayList) obj);
                                    }
                                });
                                break;
                            case 63:
                                this.f38026.m35271(EnumC6799.f17641, this.f9122.f23240);
                                this.f9122.m20078();
                                m30714(new Consumer() { // from class: l.᩶ܰۚ
                                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return C24719.$default$andThen(this, consumer);
                                    }

                                    @Override // java.util.function.Consumer
                                    /* JADX INFO: renamed from: accept */
                                    public final void m45213n(Object obj) {
                                        this.f68022.f38026.m35283((ArrayList) obj);
                                    }
                                });
                                break;
                            case 64:
                                this.f38026.m35271(EnumC6799.f17617, this.f9122.f23240);
                                this.f9122.m20078();
                                m30708();
                                break;
                            case 65:
                                this.f38026.m35271(EnumC6799.f17632, this.f9122.f23240);
                                this.f9122.m20078();
                                m30701(new C6818(this));
                                break;
                            case 66:
                                this.f38026.m35271(EnumC6799.f17651, this.f9122.f23240);
                                this.f9122.m20078();
                                m30721();
                                break;
                            default:
                                this.f9120.mo11117(this.f9122.f23240, "Class member declaration expected", new Object[0]);
                                C13902 c13902 = new C13902();
                                c13902.m31626();
                                throw c13902;
                        }
                    } else {
                        this.f9122.m20078();
                        this.f38026.m32175(m30738(), this.f9122.f23240);
                        this.f9122.m20084(EnumC16818.f49604);
                    }
                } catch (C13902 e) {
                    if (e.m31625()) {
                        C13902 c13903 = new C13902();
                        c13903.m31626();
                        throw c13903;
                    }
                    while (true) {
                        int i5 = C14864.f42366[this.f9122.f23232.ordinal()];
                        if (i5 != 2) {
                            if (i5 != 14 && i5 != 16 && i5 != 24) {
                                if (i5 != 33) {
                                    switch (i5) {
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                            break;
                                        default:
                                            switch (i5) {
                                                case 18:
                                                case 20:
                                                    break;
                                                case 19:
                                                    break;
                                                default:
                                                    switch (i5) {
                                                        case 38:
                                                            break;
                                                        case 39:
                                                            m30702(EnumC16818.f49767, EnumC16818.f49567);
                                                            this.f9122.m20078();
                                                            break;
                                                        case 40:
                                                            m30702(EnumC16818.f49649, EnumC16818.f49755);
                                                            this.f9122.m20078();
                                                            break;
                                                        case 41:
                                                            m30702(EnumC16818.f49708, EnumC16818.f49743);
                                                            this.f9122.m20078();
                                                            break;
                                                        case 42:
                                                        case 43:
                                                            break;
                                                        default:
                                                            this.f9122.m20078();
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                }
                            }
                        }
                        m30710();
                        String.format("scanner position %d", Long.valueOf(this.f9122.f23240));
                        C13902 c13904 = new C13902();
                        c13904.m31626();
                        throw c13904;
                    }
                }
                this.f38014 = null;
            } else {
                this.f9122.m20078();
                m30705();
                this.f38020 = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ */
    public C3724 m30707() {
        C3724 c3724 = new C3724();
        C8655 c8655 = this.f9122;
        EnumC16818 enumC16818 = c8655.f23232;
        if (enumC16818 != EnumC16818.f49736) {
            if (enumC16818 != EnumC16818.f49704) {
                throw C21466.m48634(this.f9120, c8655.f23240, "Either a module name or Constant Pool index expected, got {0}", new Object[]{C22934.m51254(this.f9122.f23232, new StringBuilder("\""), "\"")});
            }
            c3724.f22916 = Integer.valueOf(c8655.f23237);
            this.f9122.m20078();
            return c3724;
        }
        String string = "";
        while (this.f9122.f23232.m38128()) {
            c3724.f22917 = ((String) c3724.f22917) + string + this.f9122.f23234;
            this.f9122.m20083();
            EnumC16818 enumC16819 = this.f9122.f23232;
            if (enumC16819 != EnumC16818.f49724) {
                return c3724;
            }
            string = Character.toString((char) enumC16819.m38125());
            this.f9122.m20083();
        }
        throw C21466.m48634(this.f9120, this.f9122.f23240, "Either a module name or Constant Pool index expected, got {0}", new Object[]{C22934.m51254(this.f9122.f23232, new StringBuilder("\""), "\"")});
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m30726(int i) {
        C8655 c8655;
        int iM18907;
        if (i != 0) {
            this.f9120.mo13869(this.f9122.f23240, "The class access modifier(s) {0} ignored", EnumC8140.m18880(i, EnumC21552.MODULE));
        }
        ArrayList arrayList = this.f38019;
        if (arrayList != null) {
            this.f38026.m32173(arrayList);
        }
        C7748 c7748 = new C7748(this.f38026);
        this.f38023 = c7748;
        if (this.f9122.f23232 == EnumC16818.f49579) {
            c7748.m17904();
            this.f9122.m20078();
        }
        C8655 c8656 = this.f9122;
        EnumC16818 enumC16818 = c8656.f23232;
        EnumC16818 enumC16819 = EnumC16818.f49568;
        if (enumC16818 != enumC16819) {
            throw C21466.m48634(this.f9120, c8656.f23240, "\"{0}\" token is expected", new Object[]{enumC16819.m38127()});
        }
        c8656.m20083();
        C3724 c3724M30707 = m30707();
        if (c3724M30707.m7173()) {
            throw C21466.m48634(this.f9120, this.f9122.f23240, "Either name or Constant Pool index expected, got {0}", new Object[]{"\"" + this.f9122.f23232 + "\""});
        }
        if (c3724M30707.m7172() != 0) {
            this.f38023.m17902(c3724M30707.m7172());
        } else {
            this.f38023.m17903((String) c3724M30707.f22917);
        }
        EnumC16818 enumC168110 = this.f9122.f23232;
        EnumC16818 enumC168111 = EnumC16818.f49767;
        if (enumC168110 == enumC168111) {
            C23563 c23563 = this.f38026.f44273;
            if (!c23563.m52372()) {
                c23563.m52367(53, 0);
            }
            this.f9120.mo13869(this.f9122.f23240, "Class file version not specified in file or by -cv parameter. Defaulting to version \"{0}\"", this.f38026.f44273.m52365());
        } else {
            m30723();
        }
        this.f9122.m20084(enumC168111);
        C15496 c15496 = this.f38026;
        c15496.getClass();
        c15496.f40157 = EnumC8140.f21449.m18907();
        C24214 c24214 = c15496.f44284;
        EnumC13486 enumC13486 = EnumC13486.HEADER;
        C17450 c17450 = new C17450(0, null);
        c24214.getClass();
        if (enumC13486 == EnumC13486.CLASSFILE) {
            c24214.f76741.f22917 = c17450;
        } else {
            c24214.f76743.f22917 = c17450;
        }
        C23563 c23564 = c15496.f44273;
        if (!c23564.m52372()) {
            c23564.m52367(53, 0);
        }
        while (true) {
            c8655 = this.f9122;
            EnumC16818 enumC168112 = c8655.f23232;
            if (enumC168112 != EnumC16818.f49679 && enumC168112 != EnumC16818.f49567) {
                int i2 = C14864.f42366[enumC168112.ordinal()];
                if (i2 != 30) {
                    switch (i2) {
                        case 44:
                            this.f9122.m20078();
                            m30705();
                            this.f38020 = true;
                            break;
                        case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                            C24195 c24195 = this.f38023.f20323;
                            C3724 c3724 = new C3724();
                            this.f9122.m20083();
                            int i3 = 0;
                            while (true) {
                                EnumC16818 enumC168113 = this.f9122.f23232;
                                if (enumC168113 == EnumC16818.f49604) {
                                    if (!c3724.m7173()) {
                                        c24195.m45213n(new C2909((String) c3724.f22917, c3724.m7172(), i3, null));
                                        this.f9122.m20083();
                                        break;
                                    }
                                    throw C21466.m48634(this.f9120, this.f9122.f23240, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new Object[0]);
                                }
                                int i4 = C14864.f42366[enumC168113.ordinal()];
                                if (i4 != 3 && i4 != 4) {
                                    if (i4 != 8) {
                                        if (i4 != 23) {
                                            if (i4 != 26) {
                                                if (i4 != 50) {
                                                    throw C21466.m48634(this.f9120, this.f9122.f23240, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new Object[0]);
                                                }
                                                if (EnumC8140.m18884(i3) || !c3724.m7173()) {
                                                    throw C21466.m48634(this.f9120, this.f9122.f23240, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new Object[0]);
                                                }
                                                iM18907 = EnumC8140.f21485.m18907();
                                            } else {
                                                if (EnumC8140.m18875(i3) || !c3724.m7173()) {
                                                    throw C21466.m48634(this.f9120, this.f9122.f23240, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new Object[0]);
                                                }
                                                iM18907 = EnumC8140.f21460.m18907();
                                            }
                                        } else {
                                            if (EnumC8140.m18870(i3) || !c3724.m7173()) {
                                                throw C21466.m48634(this.f9120, this.f9122.f23240, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new Object[0]);
                                            }
                                            iM18907 = EnumC8140.f21451.m18907();
                                        }
                                    } else {
                                        if (EnumC8140.m18888(i3) || !c3724.m7173()) {
                                            throw C21466.m48634(this.f9120, this.f9122.f23240, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new Object[0]);
                                        }
                                        iM18907 = EnumC8140.f21488.m18907();
                                    }
                                    i3 |= iM18907;
                                    this.f9122.m20083();
                                } else {
                                    if (!c3724.m7173()) {
                                        throw C21466.m48634(this.f9120, this.f9122.f23240, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new Object[0]);
                                    }
                                    c3724 = m30707();
                                }
                            }
                            break;
                        case 46:
                            m30699(this.f38023.f20315, new InterfaceC8159() { // from class: l.ۢܰۚ
                                @Override // p067l.InterfaceC8159
                                public final C3724 get() {
                                    C13524 c13524 = this.f32116;
                                    C8655 c8657 = c13524.f9122;
                                    EnumC16818 enumC168114 = c8657.f23232;
                                    String string = "";
                                    int i5 = 0;
                                    if (enumC168114 == EnumC16818.f49736) {
                                        String str = "";
                                        while (c13524.f9122.f23232.m38124()) {
                                            StringBuilder sbM21133 = C9179.m21133(string, str);
                                            sbM21133.append(c13524.f9122.f23234);
                                            string = sbM21133.toString();
                                            c13524.f9122.m20078();
                                            C8655 c8658 = c13524.f9122;
                                            if (c8658.f23232 == EnumC16818.f49724) {
                                                c13524.f9120.mo13869(c8658.f23240, "Forward slash \"/\" expected instead of dot \".\". The dot is replaced by \"/\"", new Object[0]);
                                                c13524.f9122.m20078();
                                                str = "/";
                                            }
                                        }
                                        throw C20865.m47156(c13524.f9120, c13524.f9122.f23240, "Either name or Constant Pool index expected, got {0}", new Object[]{C22934.m51254(c13524.f9122.f23232, new StringBuilder("\""), "\"")});
                                    }
                                    if (enumC168114 == EnumC16818.f49704) {
                                        i5 = c8657.f23237;
                                        c8657.m20078();
                                    }
                                    return new C3724(Integer.valueOf(i5), string);
                                }
                            }, new InterfaceC8159() { // from class: l.ۚܰۚ
                                @Override // p067l.InterfaceC8159
                                public final C3724 get() {
                                    return this.f19579.m30707();
                                }
                            }, EnumC16818.f49608, true, "Module statement \"exports [mandated | synthetic] PackageName [to ModuleName(1)[,ModuleName(2)[...]]];\" expected");
                            break;
                        case 47:
                            m30699(this.f38023.f20316, new InterfaceC8159() { // from class: l.ۢܰۚ
                                @Override // p067l.InterfaceC8159
                                public final C3724 get() {
                                    C13524 c13524 = this.f32116;
                                    C8655 c8657 = c13524.f9122;
                                    EnumC16818 enumC168114 = c8657.f23232;
                                    String string = "";
                                    int i5 = 0;
                                    if (enumC168114 == EnumC16818.f49736) {
                                        String str = "";
                                        while (c13524.f9122.f23232.m38124()) {
                                            StringBuilder sbM21133 = C9179.m21133(string, str);
                                            sbM21133.append(c13524.f9122.f23234);
                                            string = sbM21133.toString();
                                            c13524.f9122.m20078();
                                            C8655 c8658 = c13524.f9122;
                                            if (c8658.f23232 == EnumC16818.f49724) {
                                                c13524.f9120.mo13869(c8658.f23240, "Forward slash \"/\" expected instead of dot \".\". The dot is replaced by \"/\"", new Object[0]);
                                                c13524.f9122.m20078();
                                                str = "/";
                                            }
                                        }
                                        throw C20865.m47156(c13524.f9120, c13524.f9122.f23240, "Either name or Constant Pool index expected, got {0}", new Object[]{C22934.m51254(c13524.f9122.f23232, new StringBuilder("\""), "\"")});
                                    }
                                    if (enumC168114 == EnumC16818.f49704) {
                                        i5 = c8657.f23237;
                                        c8657.m20078();
                                    }
                                    return new C3724(Integer.valueOf(i5), string);
                                }
                            }, new InterfaceC8159() { // from class: l.ۚܰۚ
                                @Override // p067l.InterfaceC8159
                                public final C3724 get() {
                                    return this.f19579.m30707();
                                }
                            }, EnumC16818.f49608, true, "Module statement \"opens [mandated | synthetic] PackageName [to ModuleName(1)[,ModuleName(2)[...]]];\" expected");
                            break;
                        case 48:
                            m30699(this.f38023.f20318, new InterfaceC8159() { // from class: l.ۢܰۚ
                                @Override // p067l.InterfaceC8159
                                public final C3724 get() {
                                    C13524 c13524 = this.f32116;
                                    C8655 c8657 = c13524.f9122;
                                    EnumC16818 enumC168114 = c8657.f23232;
                                    String string = "";
                                    int i5 = 0;
                                    if (enumC168114 == EnumC16818.f49736) {
                                        String str = "";
                                        while (c13524.f9122.f23232.m38124()) {
                                            StringBuilder sbM21133 = C9179.m21133(string, str);
                                            sbM21133.append(c13524.f9122.f23234);
                                            string = sbM21133.toString();
                                            c13524.f9122.m20078();
                                            C8655 c8658 = c13524.f9122;
                                            if (c8658.f23232 == EnumC16818.f49724) {
                                                c13524.f9120.mo13869(c8658.f23240, "Forward slash \"/\" expected instead of dot \".\". The dot is replaced by \"/\"", new Object[0]);
                                                c13524.f9122.m20078();
                                                str = "/";
                                            }
                                        }
                                        throw C20865.m47156(c13524.f9120, c13524.f9122.f23240, "Either name or Constant Pool index expected, got {0}", new Object[]{C22934.m51254(c13524.f9122.f23232, new StringBuilder("\""), "\"")});
                                    }
                                    if (enumC168114 == EnumC16818.f49704) {
                                        i5 = c8657.f23237;
                                        c8657.m20078();
                                    }
                                    return new C3724(Integer.valueOf(i5), string);
                                }
                            }, new InterfaceC8159() { // from class: l.ۢܰۚ
                                @Override // p067l.InterfaceC8159
                                public final C3724 get() {
                                    C13524 c13524 = this.f32116;
                                    C8655 c8657 = c13524.f9122;
                                    EnumC16818 enumC168114 = c8657.f23232;
                                    String string = "";
                                    int i5 = 0;
                                    if (enumC168114 == EnumC16818.f49736) {
                                        String str = "";
                                        while (c13524.f9122.f23232.m38124()) {
                                            StringBuilder sbM21133 = C9179.m21133(string, str);
                                            sbM21133.append(c13524.f9122.f23234);
                                            string = sbM21133.toString();
                                            c13524.f9122.m20078();
                                            C8655 c8658 = c13524.f9122;
                                            if (c8658.f23232 == EnumC16818.f49724) {
                                                c13524.f9120.mo13869(c8658.f23240, "Forward slash \"/\" expected instead of dot \".\". The dot is replaced by \"/\"", new Object[0]);
                                                c13524.f9122.m20078();
                                                str = "/";
                                            }
                                        }
                                        throw C20865.m47156(c13524.f9120, c13524.f9122.f23240, "Either name or Constant Pool index expected, got {0}", new Object[]{C22934.m51254(c13524.f9122.f23232, new StringBuilder("\""), "\"")});
                                    }
                                    if (enumC168114 == EnumC16818.f49704) {
                                        i5 = c8657.f23237;
                                        c8657.m20078();
                                    }
                                    return new C3724(Integer.valueOf(i5), string);
                                }
                            }, EnumC16818.f49663, false, "Module statement \"provides ClassName with ClassName(1)[,ClassName(2)[...]]];\" expected");
                            break;
                        case 49:
                            final C13113 c13113 = this.f38023.f20321;
                            HashSet hashSetM30693 = m30693(new InterfaceC12183() { // from class: l.ܺܰۚ
                                @Override // p067l.InterfaceC12183
                                public final void call() {
                                    this.f52438.f9122.m20078();
                                }
                            }, new InterfaceC8159() { // from class: l.ۢܰۚ
                                @Override // p067l.InterfaceC8159
                                public final C3724 get() {
                                    C13524 c13524 = this.f32116;
                                    C8655 c8657 = c13524.f9122;
                                    EnumC16818 enumC168114 = c8657.f23232;
                                    String string = "";
                                    int i5 = 0;
                                    if (enumC168114 == EnumC16818.f49736) {
                                        String str = "";
                                        while (c13524.f9122.f23232.m38124()) {
                                            StringBuilder sbM21133 = C9179.m21133(string, str);
                                            sbM21133.append(c13524.f9122.f23234);
                                            string = sbM21133.toString();
                                            c13524.f9122.m20078();
                                            C8655 c8658 = c13524.f9122;
                                            if (c8658.f23232 == EnumC16818.f49724) {
                                                c13524.f9120.mo13869(c8658.f23240, "Forward slash \"/\" expected instead of dot \".\". The dot is replaced by \"/\"", new Object[0]);
                                                c13524.f9122.m20078();
                                                str = "/";
                                            }
                                        }
                                        throw C20865.m47156(c13524.f9120, c13524.f9122.f23240, "Either name or Constant Pool index expected, got {0}", new Object[]{C22934.m51254(c13524.f9122.f23232, new StringBuilder("\""), "\"")});
                                    }
                                    if (enumC168114 == EnumC16818.f49704) {
                                        i5 = c8657.f23237;
                                        c8657.m20078();
                                    }
                                    return new C3724(Integer.valueOf(i5), string);
                                }
                            }, "Module statement \"uses ClassName;\" expected", true);
                            if (hashSetM30693.size() != 1) {
                                throw C21466.m48634(this.f9120, this.f9122.f23240, "Module statement \"uses ClassName;\" expected", new Object[0]);
                            }
                            C21230.forEach(hashSetM30693, new Consumer() { // from class: l.ۖܰۚ
                                public /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return C24719.$default$andThen(this, consumer);
                                }

                                @Override // java.util.function.Consumer
                                /* JADX INFO: renamed from: accept */
                                public final void m45213n(Object obj) {
                                    C3724 c3725 = (C3724) obj;
                                    EnumC14113 enumC14113 = EnumC14113.CONSTANT_NULL;
                                    c13113.m45213n(new C23697(c3725.m7172(), (String) c3725.f22917));
                                }
                            });
                            this.f9122.m20078();
                            break;
                            break;
                        default:
                            throw C21466.m48634(this.f9120, this.f9122.f23240, "Module statement expected", new Object[0]);
                    }
                } else {
                    this.f9122.m20078();
                }
            }
        }
        c8655.m20084(EnumC16818.f49567);
        if (this.f38020) {
            this.f38012.m11375();
            if (this.f38026.f44289 == null) {
                String strM48089 = this.f9120.m48089();
                C15496 c15497 = this.f38026;
                C10667 c10667 = new C10667(c15497.f40167, strM48089);
                c10667.m24542(this.f38026.f40167, new C10842(0));
                c15497.f44289 = c10667;
            }
        } else {
            C15496 c15498 = this.f38026;
            if (c15498.f44289 == null) {
                C5263 c5263 = this.f38012;
                c15498.f44289 = new C20863(c5263, EnumC6799.f17649, c5263.m11354(this.f9120.m48089()));
            }
        }
        this.f38026.m35272(this.f38023);
        this.f38016.add(this.f38026);
        this.f38026 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m30699(BiConsumer biConsumer, InterfaceC8159 interfaceC8159, InterfaceC8159 interfaceC81510, EnumC16818 enumC16818, boolean z, String str) {
        int iM18907;
        boolean z2 = enumC16818 == EnumC16818.f49663;
        C3724 c3724 = new C3724();
        HashSet hashSet = new HashSet();
        this.f9122.m20078();
        int i = 0;
        while (true) {
            EnumC16818 enumC16819 = this.f9122.f23232;
            if (enumC16819 == EnumC16818.f49604) {
                if (c3724.m7173() || (hashSet.isEmpty() && !z)) {
                    throw C21466.m48634(this.f9120, this.f9122.f23240, str, new Object[0]);
                }
                if (z2) {
                    Set set = (Set) C7480.stream(hashSet).map(new C2794()).collect(C24205.toSet());
                    EnumC14113 enumC14113 = EnumC14113.CONSTANT_NULL;
                    biConsumer.accept(new C3580(c3724.m7172(), (String) c3724.f22917, i, EnumC21552.MODULE), set);
                } else {
                    Set set2 = (Set) C7480.stream(hashSet).map(new C9982(8)).collect(C24205.toSet());
                    EnumC14113 enumC14114 = EnumC14113.CONSTANT_NULL;
                    biConsumer.accept(new C3580(c3724.m7172(), (String) c3724.f22917, i, EnumC21552.MODULE), set2);
                }
                this.f9122.m20078();
                return;
            }
            int i2 = C14864.f42366[enumC16819.ordinal()];
            if (i2 != 3 && i2 != 4) {
                if (i2 != 23) {
                    if (i2 != 26) {
                        if (i2 != 51 && i2 != 52) {
                            throw C21466.m48634(this.f9120, this.f9122.f23240, str, new Object[0]);
                        }
                        hashSet = m30693(z2 ? new InterfaceC12183() { // from class: l.ᩴܰۚ
                            @Override // p067l.InterfaceC12183
                            public final void call() {
                                this.f62541.f9122.m20078();
                            }
                        } : new InterfaceC12183() { // from class: l.᩵ܰۚ
                            @Override // p067l.InterfaceC12183
                            public final void call() {
                                this.f65638.f9122.m20083();
                            }
                        }, interfaceC81510, str, false);
                    } else {
                        if (EnumC8140.m18875(i) || !c3724.m7173() || z2) {
                            throw C21466.m48634(this.f9120, this.f9122.f23240, str, new Object[0]);
                        }
                        iM18907 = EnumC8140.f21460.m18907();
                    }
                } else {
                    if (EnumC8140.m18870(i) || !c3724.m7173() || z2) {
                        throw C21466.m48634(this.f9120, this.f9122.f23240, str, new Object[0]);
                    }
                    iM18907 = EnumC8140.f21451.m18907();
                }
                i |= iM18907;
                if (z2) {
                    this.f9122.m20078();
                } else {
                    this.f9122.m20083();
                }
            } else {
                if (!c3724.m7173()) {
                    throw C21466.m48634(this.f9120, this.f9122.f23240, str, new Object[0]);
                }
                c3724 = interfaceC8159.get();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private HashSet m30693(InterfaceC12183 interfaceC12183, InterfaceC8159 interfaceC8159, String str, boolean z) {
        HashSet hashSet = new HashSet();
        interfaceC12183.call();
        boolean z2 = false;
        boolean z3 = true;
        while (true) {
            EnumC16818 enumC16818 = this.f9122.f23232;
            if (enumC16818 == EnumC16818.f49604) {
                if (hashSet.isEmpty() || z2) {
                    throw C21466.m48634(this.f9120, this.f9122.f23240, str, new Object[0]);
                }
                return hashSet;
            }
            int i = C14864.f42366[enumC16818.ordinal()];
            if (i == 3 || i == 4) {
                if (!z3 && !z2) {
                    throw C21466.m48634(this.f9120, this.f9122.f23240, str, new Object[0]);
                }
                hashSet.add(interfaceC8159.get());
                z2 = false;
                z3 = false;
            } else {
                if (i != 31) {
                    throw C21466.m48634(this.f9120, this.f9122.f23240, str, new Object[0]);
                }
                if (z2 || z3 || z) {
                    throw C21466.m48634(this.f9120, this.f9122.f23240, str, new Object[0]);
                }
                this.f9122.m20078();
                z2 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۗ */
    private void m30704() {
        while (true) {
            this.f9120.m48074(new Supplier() { // from class: l.۠ܰۚ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return "recoverFile: scanner.token=" + this.f28140.f9122.f23232;
                }
            });
            int i = C14864.f42366[this.f9122.f23232.ordinal()];
            if (i != 2 && i != 19) {
                switch (i) {
                    case 38:
                        return;
                    case 39:
                        m30702(EnumC16818.f49767, EnumC16818.f49567);
                        this.f9122.m20078();
                        break;
                    case 40:
                        m30702(EnumC16818.f49649, EnumC16818.f49755);
                        this.f9122.m20078();
                        break;
                    case 41:
                        m30702(EnumC16818.f49708, EnumC16818.f49743);
                        this.f9122.m20078();
                        break;
                    default:
                        this.f9122.m20078();
                        break;
                }
            } else {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۢ */
    private void m30710() {
        if (this.f38020) {
            this.f38012.m11375();
            this.f38026.m35281();
            if (this.f38026.f44289 == null) {
                String strM48089 = this.f9120.m48089();
                final String strM48088 = this.f9120.m48088();
                C15496 c15496 = this.f38026;
                C10667 c10667 = new C10667(c15496.f40167, strM48089);
                c10667.m24542(this.f38026.f40167, new Function() { // from class: l.ۗܰۚ
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
                        Boolean bool;
                        String str = (String) obj;
                        boolean z = false;
                        if (str.contains(strM48088)) {
                            Object[] objArr = {".java", ".jcod", ".jasm", ".class"};
                            ArrayList arrayList = new ArrayList(4);
                            int iM25047 = 0;
                            while (iM25047 < 4) {
                                Object obj2 = objArr[iM25047];
                                iM25047 = C10878.m25047(obj2, arrayList, obj2, iM25047, 1);
                            }
                            Iterator it = C21562.unmodifiableList(arrayList).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    bool = Boolean.FALSE;
                                    break;
                                }
                                if (str.contains((String) it.next())) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                            }
                            if (bool.booleanValue()) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    }
                });
                c15496.f44289 = c10667;
            }
        } else {
            C15496 c15497 = this.f38026;
            if (c15497.f44289 == null) {
                C5263 c5263 = this.f38012;
                c15497.f44289 = new C20863(c5263, EnumC6799.f17649, c5263.m11354(this.f9120.m48089()));
            }
        }
        this.f38026.m35279();
        this.f38016.add(this.f38026);
        C15496 c15498 = new C15496(this.f9120, C23563.m52363(this.f38017));
        this.f38026 = c15498;
        this.f38012 = c15498.f40167;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15496[] m30733() {
        return (C15496[]) this.f38016.toArray(new C15496[0]);
    }

    /* JADX INFO: renamed from: ᩵ */
    private void m30722() {
        EnumC16818 enumC16818;
        ArrayList arrayList;
        if (this.f9122.f23232.m38121(EnumC16818.f49746, EnumC16818.f49684, EnumC16818.f49725)) {
            boolean z = true;
            while (true) {
                try {
                    EnumC16818 enumC16819 = this.f9122.f23232;
                    if (enumC16819 == EnumC16818.f49679 || !z) {
                        break;
                    }
                    int i = C14864.f42366[enumC16819.ordinal()];
                    if (i == 30) {
                        this.f9122.m20078();
                    } else if (i != 67) {
                        if (i == 43) {
                            this.f9122.m20078();
                            C8655 c8655 = this.f9122;
                            long j = c8655.f23240;
                            String str = c8655.f23234;
                            c8655.m20084(EnumC16818.f49736);
                            EnumC16818 enumC168110 = this.f9122.f23232;
                            EnumC16818 enumC168111 = EnumC16818.f49604;
                            if (enumC168110 != enumC168111) {
                                m30723();
                                this.f9122.m20084(enumC168111);
                            }
                            if (this.f38011 == null) {
                                this.f38011 = str;
                                this.f38015 = str + "/";
                            } else {
                                this.f9120.mo11117(j, "Package statement repeated", new Object[0]);
                            }
                        } else if (i == 44) {
                            this.f9122.m20078();
                            m30705();
                            this.f38020 = true;
                        }
                        z = false;
                    } else {
                        this.f38024 = this.f38022.m54092();
                    }
                } catch (C13902 unused) {
                    m30704();
                }
            }
            while (true) {
                C8655 c8656 = this.f9122;
                enumC16818 = c8656.f23232;
                if (enumC16818 != EnumC16818.f49604) {
                    break;
                } else {
                    c8656.m20078();
                }
            }
            if (enumC16818 != EnumC16818.f49679) {
                if (this.f38011 != null || (arrayList = this.f38024) == null) {
                    return;
                }
                this.f38019 = arrayList;
                this.f38024 = null;
                return;
            }
            this.f9120.m48090("Scanner:  EOF", new Object[0]);
            if (this.f9120.m48089().contains("package-info")) {
                this.f9120.m48074(new Supplier() { // from class: l.֨ܰۚ
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return C13524.m30711(this.f6940);
                    }
                });
                int iM18907 = EnumC8140.f21475.m18907() | EnumC8140.f21473.m18907();
                if (this.f38026.f44273.m52375() > 49) {
                    iM18907 |= EnumC8140.f21468.m18907();
                }
                C15496 c15496 = this.f38026;
                String strM25286 = C10965.m25286(new StringBuilder(), this.f38015, "package-info");
                c15496.f40157 = iM18907;
                c15496.f44272 = strM25286;
                c15496.f44273.m52369();
                ArrayList arrayList2 = this.f38024;
                if (arrayList2 != null) {
                    this.f38026.m32173(arrayList2);
                }
                if (this.f38020) {
                    this.f38012.m11375();
                    if (this.f38026.f44289 == null) {
                        String strM48089 = this.f9120.m48089();
                        C15496 c15497 = this.f38026;
                        C10667 c10667 = new C10667(c15497.f40167, strM48089);
                        c10667.m24542(this.f38026.f40167, new C5270(5));
                        c15497.f44289 = c10667;
                    }
                } else {
                    C15496 c15498 = this.f38026;
                    if (c15498.f44289 == null) {
                        C5263 c5263 = this.f38012;
                        c15498.f44289 = new C20863(c5263, EnumC6799.f17649, c5263.m11354(this.f9120.m48089()));
                    }
                }
                C15496 c15499 = this.f38026;
                C24214 c24214 = c15499.f44284;
                C5263 c5264 = c15499.f40167;
                String str2 = c15499.f44272;
                c5264.getClass();
                EnumC12758 enumC12758 = EnumC12758.f35925;
                c24214.m53530(c5264.m11356((AbstractC4711) new C18674(enumC12758, c5264.m11354(str2))));
                C8537 c8537 = c24214.f76743;
                C8537 c8538 = c24214.f76741;
                C17450 c17450M11356 = c5264.m11356((AbstractC4711) new C18674(enumC12758, c5264.m11354("java/lang/Object")));
                if (c8538.f22917 != null) {
                    c8538.f22917 = c17450M11356;
                } else {
                    c8537.f22917 = c17450M11356;
                }
                c5264.m11370();
                C17450 c17450M11371 = c5264.m11371(c24214.m53531());
                if (c8538.f22917 != null) {
                    c8538.f22917 = c17450M11371;
                } else {
                    c8537.f22917 = c17450M11371;
                }
                c24214.m53530(c5264.m11371(c24214.m53532()));
                c5264.m11366();
                this.f38016.add(this.f38026);
                this.f38026 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ String m30711(C13524 c13524) {
        return "Creating \"package-info.jasm\": package: " + c13524.f38011 + " " + c13524.f38026.f44273.m52365();
    }

    /* JADX INFO: renamed from: ܶ */
    private String m30716() {
        if (!this.f9122.f23232.m38121(EnumC16818.f49694, EnumC16818.f49710)) {
            return null;
        }
        boolean z = false;
        String string = null;
        while (true) {
            EnumC16818 enumC16818 = this.f9122.f23232;
            if (enumC16818 == EnumC16818.f49679) {
                return string;
            }
            int i = C14864.f42366[enumC16818.ordinal()];
            if (i != 2 && i != 4) {
                if (i == 30) {
                    if (string == null) {
                        this.f9120.m13871(this.f9122.f23240, "\"{0}\" token is expected", z ? "CLASSNAME" : "FILENAME");
                        throw null;
                    }
                    this.f9122.m20078();
                    return string.concat(z ? ".class" : "");
                }
                switch (i) {
                    case 70:
                        if (string != null) {
                            this.f9120.m13871(this.f9122.f23240, "\"{0}\" token is expected", EnumC16818.f49604.m38127());
                            throw null;
                        }
                        break;
                        break;
                    case 71:
                        if (string != null) {
                            this.f9120.m13871(this.f9122.f23240, "\"{0}\" token is expected", EnumC16818.f49604.m38122());
                            throw null;
                        }
                        z = true;
                        break;
                        break;
                    case 72:
                        string = string != null ? string.concat(".") : ".";
                        break;
                    default:
                        if (string == null) {
                            this.f9120.m13871(this.f9122.f23240, "\"{0}\" token is expected", z ? "CLASSNAME" : "FILENAME");
                            throw null;
                        }
                        this.f9120.m13871(this.f9122.f23240, "\"{0}\" token is expected", EnumC16818.f49604.m38122());
                        throw null;
                }
            } else if (string == null) {
                string = this.f9122.f23227;
            } else {
                StringBuilder sbM17248 = C7470.m17248(string);
                sbM17248.append(this.f9122.f23227);
                string = sbM17248.toString();
            }
            this.f9122.m20078();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m30741() throws Throwable {
        try {
            C15496 c15496 = new C15496(this.f9120, C23563.m52363(this.f38017));
            this.f38026 = c15496;
            this.f38012 = c15496.f40167;
            String strM30716 = m30716();
            if (strM30716 != null) {
                InterfaceC3446 interfaceC3446M48092 = this.f9120.m48092();
                if (interfaceC3446M48092 instanceof AbstractC6129) {
                    ((AbstractC6129) interfaceC3446M48092).m13921(strM30716);
                }
            }
            m30722();
            while (true) {
                EnumC16818 enumC16818 = this.f9122.f23232;
                if (enumC16818 == EnumC16818.f49679) {
                    return;
                }
                try {
                    if (enumC16818 == EnumC16818.f49684) {
                        this.f38019 = this.f38022.m54092();
                    }
                    int iM30734 = m30734();
                    if (iM30734 == 0) {
                        int i = C14864.f42366[this.f9122.f23232.ordinal()];
                        if (i != 2 && i != 3 && i != 4 && i != 19) {
                            if (i == 30) {
                                this.f9122.m20078();
                            } else if (i != 36 && i != 68 && i != 69) {
                                this.f9120.mo11117(this.f9122.f23240, "Class, module or interface declaration expected", new Object[0]);
                                throw new C13902();
                            }
                        }
                    } else if (EnumC8140.m18877(iM30734) && this.f9122.f23232 != EnumC16818.f49658) {
                        iM30734 |= EnumC8140.f21473.m18907();
                    }
                    EnumC16818 enumC16819 = this.f9122.f23232;
                    if (enumC16819 == EnumC16818.f49568 || enumC16819 == EnumC16818.f49579) {
                        m30726(iM30734);
                    } else {
                        m30712(iM30734);
                    }
                    this.f38019 = null;
                } catch (C13902 e) {
                    this.f9120.m48090("^^^^^^^ Syntax Error ^^^^^^^^^^^^", new Object[0]);
                    this.f9122.f9120.getClass();
                    if (e.m31625()) {
                        return;
                    }
                    m30704();
                    return;
                }
            }
        } catch (IOException unused) {
            C6091 c6091 = this.f9120;
            c6091.mo11117(this.f9122.f23240, "I/O error in {0}", c6091.m48089());
        } catch (Error unused2) {
        }
    }
}
