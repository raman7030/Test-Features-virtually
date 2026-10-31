package l;

import com.google.android.material.motion.MotionUtils;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
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
public final class C11738 extends C1860 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C20911 f35013;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C22301 f35017;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C8815 f35018;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7776 f35021;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23298 f35022;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C5660 f35023;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23732 f35025;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList f35016 = new ArrayList();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C3046 f35012 = null;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C13813 f35026 = null;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f35011 = null;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f35015 = "";

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public ArrayList f35024 = null;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f35019 = null;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public ArrayList f35014 = null;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f35020 = false;

    public C11738(C3917 c3917, C22301 c22301) {
        this.f6339 = c3917;
        this.f6341 = new C6615(c3917);
        this.f6340 = this;
        C23732 c23732 = new C23732(this);
        this.f35025 = c23732;
        this.f35022 = new C23298(this);
        this.f35013 = new C20911(this, c23732);
        C7776 c7776 = new C7776();
        c7776.f6339 = this.f6339;
        c7776.f6341 = this.f6341;
        c7776.f6340 = this;
        this.f35021 = c7776;
        this.f35017 = C22301.m50033(c22301);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m28694() {
        this.f6341.getClass();
        this.f35025.getClass();
        this.f35022.getClass();
        this.f35013.getClass();
        this.f35021.getClass();
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private C6491 m28675() {
        C6615 c6615 = this.f6341;
        if (c6615.f20355 == EnumC15204.f46542) {
            c6615.m18126();
            C6615 c6616 = this.f6341;
            EnumC15204 enumC15204 = c6616.f20355;
            EnumC15204 enumC15205 = EnumC15204.f46543;
            if (enumC15204 == enumC15205) {
                int i = c6616.f20360;
                c6616.m18126();
                C6615 c6617 = this.f6341;
                if (c6617.f20355 == EnumC15204.f46597) {
                    c6617.m18126();
                    C6615 c6618 = this.f6341;
                    if (c6618.f20355 == enumC15205) {
                        int i2 = c6618.f20360;
                        this.f35026.f41195.m50037(i, i2);
                        this.f6341.m18126();
                        "parseVersion: ".concat(this.f35026.f41195.m50035());
                        return new C6491(Integer.valueOf(i), Integer.valueOf(i2));
                    }
                }
            }
        }
        throw C19462.m44860(this.f6339, this.f6341.f20363, "class file version expected", new Object[0]);
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28684(EnumC15536 enumC15536) {
        char c;
        ArrayList arrayList;
        EnumC23672 enumC23672M9853;
        C3211 c3211;
        boolean z;
        C6615 c6615 = this.f6341;
        long j = c6615.f20363;
        if (c6615.f20355 != EnumC15204.f46543) {
            this.f6339.m11951(j, "A valid index into the local variable array of the current frame expected", new Object[0]);
            throw null;
        }
        final int i = c6615.f20360;
        C6739 c6739 = this.f35018.f26858;
        if (i >= 0) {
            if (i < c6739.f20943) {
                c6615.m18126();
                C15869 c15869M28690 = m28690();
                this.f6341.m18132(EnumC15204.f46597);
                long j2 = this.f6341.f20363;
                C15869 c15869M28691 = m28690();
                EnumC15536 enumC15537 = EnumC15536.f47800;
                if (enumC15536 == enumC15537) {
                    if (EnumC23672.m52219(((String) c15869M28691.f49042.f7866).charAt(0)) == null) {
                        this.f6339.m11951(j2, "Valid field descriptor of the local variable \"{0}\" expected instead of \"{1}\"", Integer.valueOf(i), c15869M28691.f49042.f7866.toString());
                        throw null;
                    }
                } else {
                    EnumC15536 enumC15538 = EnumC15536.f47591;
                    if (enumC15536 == enumC15538) {
                        try {
                            new C11049(c15869M28691.f49042.f7866.toString()).m27434((C10242) null).toString();
                        } catch (Exception unused) {
                            this.f6339.mo11949(j2, "Invalid field signature found for local variable in slot \"{0}\": \"{1}\"", Integer.valueOf(i), c15869M28691.f49042.f7866.toString());
                        }
                    } else {
                        this.f6339.m11951(j2, "Either \"{0}\" or \"{1}\" token is expected", enumC15537.m36618(), enumC15538.m36618());
                        throw null;
                    }
                }
                C8815 c8815 = this.f35018;
                C6739 c67310 = c8815.f26858;
                C5868 c5868 = c8815.f26859;
                C11678 c11678 = c8815.f26855;
                C3917 c3917 = c8815.f26853;
                C3211 c3212 = new C3211((short) i, (short) c8815.f26842, c15869M28690, c15869M28691);
                if (enumC15536 == EnumC15536.f47800) {
                    arrayList = c8815.f26846;
                    enumC23672M9853 = c3212.m9853();
                    if (c8815.f26850 == null) {
                        C7279 c7279 = new C7279(c11678.f37150, EnumC4662.f14812);
                        c8815.f26850 = c7279;
                        c5868.m16430(c7279);
                    }
                    c8815.f26850.m19535(c3212);
                } else {
                    arrayList = c8815.f26841;
                    C7279 c72710 = c8815.f26850;
                    enumC23672M9853 = (c72710 == 0 || (c3211 = (C3211) c72710.m19532((C14458) new Predicate() { // from class: l.ܳۤۚ
                        @Override // java.util.function.Predicate
                        public /* synthetic */ Predicate and(Predicate predicate) {
                            return C19285.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* JADX INFO: renamed from: negate */
                        public /* synthetic */ Predicate mo4928negate() {
                            return C19285.$default$negate(this);
                        }

                        public /* synthetic */ Predicate or(Predicate predicate) {
                            return C19285.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return ((C3211) obj).m9855() == i;
                        }
                    }).orElse(null)) == null) ? null : c3211.m9853();
                    if (c8815.f26856 == null) {
                        C7279 c72711 = new C7279(c11678.f37150, EnumC4662.f14814);
                        c8815.f26856 = c72711;
                        c5868.m16430(c72711);
                    }
                    c8815.f26856.m19535(c3212);
                }
                if (enumC23672M9853 == null) {
                    c3917.m11951(j, "Field type isn't declared for the slot \"{0}\"", Integer.valueOf(i));
                    throw null;
                }
                c3212.f10104 = enumC23672M9853;
                for (int i2 = 0; i2 < enumC23672M9853.m52221(); i2++) {
                    int i3 = i + i2;
                    if (i3 >= 0) {
                        z = i3 < c67310.f20943;
                        if (z) {
                            c3917.m11951(j, "The index in the local variable array \"{0}\" is not in the range [0..{1}] [0..Code_attribute.max_locals-1]", Integer.valueOf(i3), Integer.valueOf(c67310.f20943 - 1));
                            throw null;
                        }
                        if (arrayList.get(i3) == null) {
                            c3917.m11951(j, "The slot \"{0}\" is occupied by another local variable", Integer.valueOf(i3));
                            throw null;
                        }
                        arrayList.set(i3, c3212);
                    } else {
                        c67310.getClass();
                    }
                    if (z) {
                        c3917.m11951(j, "The index in the local variable array \"{0}\" is not in the range [0..{1}] [0..Code_attribute.max_locals-1]", Integer.valueOf(i3), Integer.valueOf(c67310.f20943 - 1));
                        throw null;
                    }
                    if (arrayList.get(i3) == null) {
                        c3917.m11951(j, "The slot \"{0}\" is occupied by another local variable", Integer.valueOf(i3));
                        throw null;
                    }
                    arrayList.set(i3, c3212);
                }
                return;
            }
            c = 0;
        } else {
            c = 0;
            c6739.getClass();
        }
        C3917 c3918 = this.f6339;
        Integer numValueOf = Integer.valueOf(i);
        Integer numValueOf2 = Integer.valueOf(this.f35018.f26858.f20943 - 1);
        Object[] objArr = new Object[2];
        objArr[c] = numValueOf;
        objArr[1] = numValueOf2;
        c3918.m11951(j, "The index in the local variable array \"{0}\" is not in the range [0..{1}] [0..Code_attribute.max_locals-1]", objArr);
        throw null;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C6739 m28692() {
        C6615 c6615 = this.f6341;
        if (c6615.f20355 != EnumC15204.f46543) {
            throw C19462.m44860(this.f6339, c6615.f20363, "A valid index into the local variable array of the current frame expected", new Object[0]);
        }
        int i = c6615.f20360;
        c6615.m18126();
        return new C6739(i);
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
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28689(EnumC15536 enumC15536) {
        boolean z;
        EnumC15536 enumC15537;
        Object obj;
        C3211 c3211;
        int i;
        int iM52221;
        int i2;
        int i3;
        C6615 c6615 = this.f6341;
        long j = c6615.f20363;
        if (c6615.f20355 != EnumC15204.f46543) {
            throw C19462.m44860(this.f6339, j, "A valid index into the local variable array of the current frame expected", new Object[0]);
        }
        int i4 = c6615.f20360;
        C8815 c8815 = this.f35018;
        short s = (short) i4;
        ArrayList arrayList = c8815.f26841;
        ArrayList arrayList2 = c8815.f26846;
        C3917 c3917 = c8815.f26853;
        C6739 c6739 = c8815.f26858;
        if (s >= 0) {
            z = s < c6739.f20943;
            if (z) {
                c3917.m11951(j, "The index in the local variable array \"{0}\" is not in the range [0..{1}] [0..Code_attribute.max_locals-1]", Short.valueOf(s), Integer.valueOf(c6739.f20943 - 1));
                throw null;
            }
            enumC15537 = EnumC15536.f47800;
            if (enumC15536 == enumC15537) {
                obj = arrayList2.get(s);
            } else {
                obj = arrayList.get(s);
            }
            c3211 = (C3211) obj;
            if (c3211 != null) {
                c3917.m11951(j, "Local variable isn't declared for the slot \"{0}\"", Short.valueOf(s));
                throw null;
            }
            c3211.m9854(c8815.f26842);
            if (enumC15536 == enumC15537) {
                arrayList = arrayList2;
            }
            i = 0;
            while (true) {
                if (c3211.m9853() == null) {
                    iM52221 = 0;
                } else {
                    iM52221 = c3211.f10104.m52221();
                }
                if (i < iM52221) {
                    this.f6341.m18126();
                    return;
                }
                if (i <= 0 && ((i3 = s + i) < 0 || i3 >= c6739.f20943)) {
                    break;
                }
                if (i > 0) {
                    i2 = s + i;
                    if (arrayList.get(i2) != null) {
                        throw C19462.m44860(c3917, j, "Local variable isn't declared for the slot \"{0}\"", new Object[]{Integer.valueOf(i2)});
                    }
                }
                arrayList.set(s + i, null);
                i++;
            }
            throw C19462.m44860(c3917, j, "The index in the local variable array \"{0}\" is not in the range [0..{1}] [0..Code_attribute.max_locals-1]", new Object[]{Integer.valueOf(i3), Integer.valueOf(c6739.f20943 - 1)});
        }
        c6739.getClass();
        if (z) {
            c3917.m11951(j, "The index in the local variable array \"{0}\" is not in the range [0..{1}] [0..Code_attribute.max_locals-1]", Short.valueOf(s), Integer.valueOf(c6739.f20943 - 1));
            throw null;
        }
        enumC15537 = EnumC15536.f47800;
        if (enumC15536 == enumC15537) {
            obj = arrayList2.get(s);
        } else {
            obj = arrayList.get(s);
        }
        c3211 = (C3211) obj;
        if (c3211 != null) {
            c3917.m11951(j, "Local variable isn't declared for the slot \"{0}\"", Short.valueOf(s));
            throw null;
        }
        c3211.m9854(c8815.f26842);
        if (enumC15536 == enumC15537) {
            arrayList = arrayList2;
        }
        i = 0;
        while (true) {
            if (c3211.m9853() == null) {
                iM52221 = 0;
            } else {
                iM52221 = c3211.f10104.m52221();
            }
            if (i < iM52221) {
                this.f6341.m18126();
                return;
            }
            if (i <= 0) {
            }
            if (i > 0) {
                i2 = s + i;
                if (arrayList.get(i2) != null) {
                    throw C19462.m44860(c3917, j, "Local variable isn't declared for the slot \"{0}\"", new Object[]{Integer.valueOf(i2)});
                }
            }
            arrayList.set(s + i, null);
            i++;
        }
        throw C19462.m44860(c3917, j, "The index in the local variable array \"{0}\" is not in the range [0..{1}] [0..Code_attribute.max_locals-1]", new Object[]{Integer.valueOf(i3), Integer.valueOf(c6739.f20943 - 1)});
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28688(C5868 c5868) {
        C6615 c6615 = this.f6341;
        if (c6615.f20355 == EnumC15204.f46579) {
            int i = c6615.f20360;
            C10102 c10102 = new C10102();
            c10102.f30409 = null;
            c10102.f30408 = i;
            c5868.m16430(c10102);
            this.f6341.m18126();
            return;
        }
        C15869 c15869M28690 = m28690();
        this.f6341.m18132(EnumC15204.f46597);
        C15869 c15869M9314 = this.f35012.m9314((AbstractC2465) new C0929(c15869M28690, m28690()));
        C10102 c10103 = new C10102();
        c10103.f30408 = -1;
        c10103.f30409 = c15869M9314;
        c5868.m16430(c10103);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28683(C5868 c5868) {
        EnumC10932 enumC10932M42035;
        EnumC15204 enumC15204;
        EnumC13833 enumC13833M20107 = C7484.m20107(this.f6341.f20360, C16646.empty());
        C6615 c6615 = this.f6341;
        EnumC15204 enumC15205 = c6615.f20355;
        int i = c6615.f20360;
        String str = c6615.f20350;
        c6615.m18126();
        int i2 = C13148.f39311[enumC15205.ordinal()];
        C15869 c15869M9314 = null;
        if (i2 == 1) {
            enumC10932M42035 = null;
        } else if (i2 == 2) {
            enumC13833M20107 = EnumC13833.ITEM_Object;
            enumC10932M42035 = EnumC10932.f32947;
        } else if (i2 == 3) {
            enumC13833M20107 = EnumC13833.ITEM_Object;
            c15869M9314 = this.f35012.m9311(i);
            enumC10932M42035 = null;
        } else {
            if (i2 != 4) {
                enumC10932M42035 = null;
            } else {
                enumC13833M20107 = EnumC13833.m33189(str);
                enumC10932M42035 = C17987.m42035(str);
                if (enumC13833M20107 != null) {
                    if (enumC10932M42035 != null && (enumC15204 = this.f6341.f20355) != EnumC15204.f46479 && enumC15204 != EnumC15204.f46591) {
                        enumC13833M20107 = EnumC13833.ITEM_Object;
                    }
                } else if (enumC10932M42035 != null) {
                    enumC13833M20107 = EnumC13833.ITEM_Object;
                }
            }
            enumC13833M20107 = EnumC13833.ITEM_Bogus;
            this.f6339.mo11946("StackMap entry type expected instead of {0}", "<" + enumC15205.m35962() + ">");
        }
        int i3 = C13148.f39309[enumC13833M20107.ordinal()];
        if (i3 == 1) {
            if (c15869M9314 == null) {
                c15869M9314 = this.f35012.m9314(this.f35025.m52381(enumC10932M42035));
            }
            c5868.f18006.add(new C18610(enumC13833M20107, c15869M9314));
        } else {
            if (i3 == 2) {
                c5868.f18006.add(new C18610(enumC13833M20107, this.f35013.m47746()));
                return;
            }
            C3793 c3793 = new C3793();
            c3793.f11968 = enumC13833M20107;
            c5868.f18006.add(c3793);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C15869 m28690() {
        C6615 c6615 = this.f6341;
        EnumC15204 enumC15204 = c6615.f20355;
        if (enumC15204 == EnumC15204.f46579) {
            int i = c6615.f20360;
            c6615.m18126();
            return this.f35012.m9311(i);
        }
        if (enumC15204 == EnumC15204.f46647) {
            String str = c6615.f20350;
            c6615.m18126();
            return this.f35012.m9312(str);
        }
        if (enumC15204.m35964()) {
            C6615 c6616 = this.f6341;
            String str2 = c6616.f20357;
            c6616.m18126();
            return this.f35012.m9312(str2);
        }
        throw C19462.m44860(this.f6339, this.f6341.f20363, "Either name or Constant Pool index expected, got {0}", new Object[]{"\"" + this.f6341.f20355 + "\""});
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15869 m28681(EnumC16575 enumC16575) {
        int i = C13148.f39310[enumC16575.ordinal()];
        C23732 c23732 = this.f35025;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                return this.f35012.m9314(c23732.m52381(EnumC10932.f32924));
            case 5:
            case 6:
                c23732.m52385(true);
                EnumC10932 enumC10932 = EnumC10932.f32936;
                C15869 c15869M52383 = c23732.m52383(enumC10932, EnumC10932.f32941, false);
                c23732.m52385(false);
                m28649(this.f6339.m11948(), enumC10932, null);
                return c15869M52383;
            case 7:
            case 8:
                EnumC10932 enumC10933 = EnumC10932.f32936;
                EnumC10932 enumC10934 = EnumC10932.f32941;
                if (this.f35026.f41195.m50045() >= 52 && EnumC6073.m16948(this.f35026.f37140)) {
                    enumC10934 = enumC10933;
                    enumC10933 = enumC10934;
                }
                c23732.m52385(true);
                C15869 c15869M52384 = c23732.m52383(enumC10933, enumC10934, false);
                c23732.m52385(false);
                m28649(this.f6339.m11948(), enumC10933, enumC10934);
                return c15869M52384;
            case 9:
                c23732.m52385(true);
                EnumC10932 enumC10935 = EnumC10932.f32941;
                C15869 c15869M52385 = c23732.m52383(enumC10935, EnumC10932.f32936, false);
                c23732.m52385(false);
                m28649(this.f6339.m11948(), enumC10935, null);
                return c15869M52385;
            default:
                throw new C12136();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m28649(long j, EnumC10932 enumC10932, EnumC10932 enumC10933) {
        if (this.f6341.f20355.m35961(EnumC15204.f46597, EnumC15204.f46479, EnumC15204.f46591)) {
            return;
        }
        if (enumC10933 != null) {
            this.f6339.mo9065(j, "Wrong tag: Either {0} or {1} expected", enumC10932.m27257(), enumC10933.m27257());
        } else {
            this.f6339.mo9065(j, "Wrong tag: {0} expected", enumC10932.m27257());
        }
        C12136 c12136 = new C12136();
        c12136.m29561();
        throw c12136;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final EnumC16575 m28695() {
        EnumC16575 enumC16575M42033;
        int i = C13148.f39311[this.f6341.f20355.ordinal()];
        if (i != 1) {
            enumC16575M42033 = i != 4 ? null : C17987.m42034(this.f6341.f20350);
        } else {
            enumC16575M42033 = C17987.m42033(this.f6341.f20360);
        }
        if (enumC16575M42033 == null) {
            this.f6339.mo11946("Subtag expected", new Object[0]);
            throw new C12136();
        }
        this.f6341.m18126();
        return enumC16575M42033;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15869 m28691() {
        C6615 c6615 = this.f6341;
        EnumC15204 enumC15204 = c6615.f20355;
        if (enumC15204 == EnumC15204.f46579) {
            int i = c6615.f20360;
            c6615.m18126();
            return this.f35012.m9311(i);
        }
        if (enumC15204 == EnumC15204.f46647 || enumC15204.m35964()) {
            C6615 c6616 = this.f6341;
            String str = c6616.f20350;
            c6616.m18126();
            C3046 c3046 = this.f35012;
            c3046.getClass();
            return c3046.m9314((AbstractC2465) new C17157(EnumC10932.f32916, c3046.m9312(str)));
        }
        m28650("Either package name or Constant Pool index expected, got {0}");
        throw null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15869 m28687() {
        C6615 c6615 = this.f6341;
        EnumC15204 enumC15204 = c6615.f20355;
        if (enumC15204 == EnumC15204.f46579) {
            int i = c6615.f20360;
            c6615.m18126();
            return this.f35012.m9311(i);
        }
        if (enumC15204 == EnumC15204.f46647 || enumC15204.m35968()) {
            C6615 c6616 = this.f6341;
            String str = c6616.f20350;
            c6616.m18126();
            C3046 c3046 = this.f35012;
            c3046.getClass();
            return c3046.m9314((AbstractC2465) new C17157(EnumC10932.f32946, c3046.m9312(str)));
        }
        m28650("Either a module name or Constant Pool index expected, got {0}");
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15869 m28682(boolean z) {
        C6615 c6615 = this.f6341;
        EnumC15204 enumC15204 = c6615.f20355;
        if (enumC15204 == EnumC15204.f46579) {
            int i = c6615.f20360;
            c6615.m18126();
            return this.f35012.m9311(i);
        }
        if (enumC15204 != EnumC15204.f46647 && !enumC15204.m35964()) {
            m28650("Either a class name or Constant Pool index expected, got {0}");
            throw null;
        }
        C6615 c6616 = this.f6341;
        String strM23341 = c6616.f20350;
        c6616.m18126();
        if ((z || this.f6341.f20355 == EnumC15204.f46599) && !strM23341.contains("/") && !strM23341.contains("[")) {
            strM23341 = C9045.m23341(new StringBuilder(), this.f35015, strM23341);
        }
        return this.f35012.m9312(strM23341);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m28650(String str) {
        EnumC10932 enumC10932M42030 = C17987.m42030(this.f6341.f20355.m35965());
        this.f6339.m45778("Unrecognized token %s: %s", this.f6341.f20355.toString(), enumC10932M42030 == null ? "null" : enumC10932M42030.m27257());
        throw C19462.m44860(this.f6339, this.f6341.f20364, str, new Object[]{C21639.m48906(this.f6341.f20355, new StringBuilder("\""), "\"")});
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6739 m28680(int i, String str) {
        C6615 c6615 = this.f6341;
        if (c6615.f20355 == EnumC15204.f46572) {
            c6615.m18126();
        }
        C6615 c6616 = this.f6341;
        if (c6616.f20355 != EnumC15204.f46543) {
            throw C19462.m44860(this.f6339, c6616.f20363, "Integer expected", new Object[0]);
        }
        int i2 = c6616.f20360 * c6616.f20353;
        if (i != 1) {
            if (i != 2) {
                throw new InternalError(C18307.m42645(i, "parseInt(", MotionUtils.EASING_TYPE_FORMAT_END));
            }
            if (i2 > 65535 || i2 < -32768) {
                throw C19462.m44860(this.f6339, c6616.f20363, "{0} value {1} does not fit in {2}", new Object[]{str, Integer.valueOf(i2), "2 bytes"});
            }
        } else if (i2 > 255 || i2 < -128) {
            throw C19462.m44860(this.f6339, c6616.f20363, "{0} value {1} does not fit in {2}", new Object[]{str, Integer.valueOf(i2), "1 byte"});
        }
        c6616.m18126();
        return new C6739(i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6739 m28679(int i) {
        C6615 c6615 = this.f6341;
        if (c6615.f20355 != EnumC15204.f46543) {
            throw C19462.m44860(this.f6339, c6615.f20363, "Integer expected", new Object[0]);
        }
        if (c6615.f20353 == -1) {
            throw C19462.m44860(this.f6339, c6615.f20363, "Negative integer is not allowed", new Object[0]);
        }
        int i2 = c6615.f20360;
        if (i != 1) {
            if (i != 2) {
                throw new InternalError(C18307.m42645(i, "parseUInt(", MotionUtils.EASING_TYPE_FORMAT_END));
            }
            if (i2 > 65535) {
                throw C19462.m44860(this.f6339, c6615.f20363, "{0} value {1} does not fit in {2}", new Object[]{"ushort", Integer.valueOf(i2), "2 bytes"});
            }
        } else if (i2 > 255) {
            throw C19462.m44860(this.f6339, c6615.f20363, "{0} value {1} does not fit in {2}", new Object[]{"ubyte", Integer.valueOf(i2), "1 byte"});
        }
        c6615.m18126();
        return new C6739(i2);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m28657() {
        while (true) {
            C6615 c6615 = this.f6341;
            if (c6615.f20355 == EnumC15204.f46579) {
                int i = c6615.f20360;
                c6615.m18126();
                this.f6341.m18132(EnumC15204.f46608);
                String.format("\ncpIndex: %d", Integer.valueOf(i));
                this.f35012.m9317(i, this.f35025.m52387());
                C6615 c6616 = this.f6341;
                if (c6616.f20355 != EnumC15204.f46591) {
                    c6616.m18132(EnumC15204.f46479);
                    return;
                }
                c6616.m18126();
            } else {
                this.f6339.mo11946("Constant declaration expected", new Object[0]);
                throw new C12136();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:41:0x00eb A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m28686() {
        int iM16978;
        int iM16979;
        int iM169710;
        int i = 0;
        while (true) {
            int i2 = C13148.f39311[this.f6341.f20355.ordinal()];
            if (i2 != 1) {
                switch (i2) {
                    case 5:
                        iM16978 = EnumC6073.f18637.m16978();
                        break;
                    case 6:
                        iM16978 = EnumC6073.f18626.m16978();
                        break;
                    case 7:
                        iM16978 = EnumC6073.f18621.m16978();
                        break;
                    case 8:
                        iM16978 = EnumC6073.f18603.m16978();
                        break;
                    case 9:
                        iM16978 = EnumC6073.f18613.m16978();
                        break;
                    case 10:
                        iM16978 = EnumC6073.f18623.m16978();
                        break;
                    case 11:
                        iM16978 = EnumC6073.f18607.m16978();
                        break;
                    case 12:
                        iM16979 = EnumC6073.f18635.m16978();
                        iM169710 = EnumC6073.f18625.m16978();
                        iM16978 = iM16979 | iM169710;
                        break;
                    case 13:
                        iM16979 = EnumC6073.f18630.m16978();
                        iM169710 = EnumC6073.f18625.m16978();
                        iM16978 = iM16979 | iM169710;
                        break;
                    case 14:
                        iM16978 = EnumC6073.f18600.m16978();
                        break;
                    case 15:
                        iM16978 = EnumC6073.f18609.m16978();
                        break;
                    case 16:
                        iM16978 = EnumC6073.f18598.m16978();
                        break;
                    case 17:
                        iM16978 = EnumC6073.f18591.m16978();
                        break;
                    case 18:
                        iM16978 = EnumC6073.f18611.m16978();
                        break;
                    case 19:
                        iM16978 = EnumC6073.f18619.m16978();
                        break;
                    case 20:
                        iM16978 = EnumC6073.f18617.m16978();
                        break;
                    case 21:
                        iM16978 = EnumC6073.f18608.m16978();
                        break;
                    case 22:
                        iM16978 = EnumC6073.f18601.m16978();
                        break;
                    case 23:
                        if (this.f35026.f41195.m50044()) {
                            iM16978 = EnumC6073.f18612.m16978();
                        } else {
                            iM16978 = EnumC6073.f18595.m16978();
                        }
                        break;
                    case 24:
                        iM16978 = EnumC6073.f18615.m16978();
                        break;
                    case 25:
                        iM16978 = EnumC6073.f18592.m16978();
                        break;
                    case 26:
                        iM16978 = EnumC6073.f18604.m16978();
                        break;
                    default:
                        iM16978 = 0;
                        break;
                }
                if (iM16978 == 0) {
                    return i;
                }
                i |= iM16978;
            } else {
                iM16978 = this.f6341.f20360;
            }
            C6615 c6615 = this.f6341;
            long j = c6615.f20363;
            c6615.m18126();
            if ((i & iM16978) != 0) {
                this.f6339.mo11949(j, "Ambiguous use of similar modifiers", new Object[0]);
            } else {
                if (iM16978 == 0) {
                    return i;
                }
                i |= iM16978;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m28670(int i) {
        C13813 c13813 = this.f35026;
        long j = this.f6341.f20364;
        C3917 c3917 = (C3917) c13813.m30112();
        int iM16950 = EnumC6073.m16950(i, EnumC6073.f18592, EnumC6073.f18612);
        if (EnumC6073.m16948(c13813.f37140)) {
            int i2 = EnumC6073.m16941(iM16950) ? (~EnumC6073.f18595.m16978()) & iM16950 : iM16950;
            if (EnumC6073.m16971(i2)) {
                i2 &= ~EnumC6073.f18608.m16978();
            }
            if (!EnumC6073.m16958(i2, EnumC6073.f18637, EnumC6073.f18603, EnumC6073.f18613)) {
                c3917.mo11949(j, "\"{0}\": Interface field must be ACC_PUBLIC, ACC_STATIC, and ACC_FINAL only and may have ACC_STRICT_INIT or ACC_SYNTHETIC flag set", EnumC6073.m16951(iM16950, EnumC20185.FIELD));
            }
            if (!EnumC6073.m16928(iM16950)) {
                c3917.mo11949(j, "\"{0}\": Interface field must be ACC_PUBLIC, ACC_STATIC, and ACC_FINAL only and may have ACC_STRICT_INIT or ACC_SYNTHETIC flag set", EnumC6073.m16951(iM16950, EnumC20185.FIELD));
            }
        } else {
            if (EnumC6073.m16960() == EnumC20185.VALUE_OBJECTS && !EnumC6073.m16970(c13813.f37140) && !EnumC6073.m16938(iM16950, EnumC6073.f18603, EnumC6073.f18608)) {
                c3917.mo11949(j, "\"{0}\": Each field of a value class must have at least one of its ACC_STATIC or ACC_STRICT_INIT flags set", EnumC6073.m16951(iM16950, EnumC20185.FIELD));
            }
            int iM16965 = EnumC6073.m16965(iM16950, EnumC6073.f18631);
            if (iM16965 != 0) {
                c3917.mo11949(j, "Invalid modifier(s) for a field {0}", EnumC6073.m16951(iM16965, EnumC20185.FIELD));
            }
            if (!EnumC6073.m16974(iM16950, EnumC6073.f18637, EnumC6073.f18626, EnumC6073.f18621)) {
                c3917.mo11949(j, "\"{0}\": Each field of a class may have at most one of its ACC_PUBLIC, ACC_PRIVATE, and ACC_PROTECTED flags set", EnumC6073.m16951(iM16950, EnumC20185.FIELD));
            }
            if (EnumC6073.m16937(iM16950, EnumC6073.f18613, EnumC6073.f18600)) {
                c3917.mo11949(j, "\"{0}\": Each field of a class must not have both its ACC_FINAL and ACC_VOLATILE flags set", EnumC6073.m16951(iM16950, EnumC20185.FIELD));
            }
        }
        while (true) {
            C15869 c15869M28690 = m28690();
            C6615 c6615 = this.f6341;
            EnumC15204 enumC15204 = EnumC15204.f46597;
            c6615.m18132(enumC15204);
            C15869 c15869M28691 = m28690();
            C13813 c13814 = this.f35026;
            c13814.getClass();
            C14499 c14499M33150 = c13814.m33150(i, new C20686(c15869M28690, c15869M28691));
            ArrayList arrayList = this.f35014;
            if (arrayList != null) {
                c14499M33150.m30109(arrayList);
            }
            C6615 c6616 = this.f6341;
            if (c6616.f20355 == enumC15204) {
                c6616.m18126();
                C6615 c6617 = this.f6341;
                if (c6617.f20355 == EnumC15204.f46530) {
                    c6617.m18126();
                }
                c14499M33150.m30110(m28690());
            }
            C6615 c6618 = this.f6341;
            if (c6618.f20355 == EnumC15204.f46608) {
                c6618.m18126();
                c14499M33150.m34594(this.f35025.m52383(null, null, false));
            }
            C6615 c6619 = this.f6341;
            if (c6619.f20355 == enumC15204) {
                c6619.m18126();
                EnumC4662 enumC4662 = EnumC4662.f14797;
                c14499M33150.getClass();
                if (C17322.f53049[enumC4662.ordinal()] != 1) {
                    throw new IllegalStateException(C19462.m44858("Unexpected attribute: ", enumC4662.m13646(), " in ", c14499M33150.f37148.name()));
                }
                if (c14499M33150.f37141 != null) {
                    this.f6339.mo11949(this.f6341.f20363, "Signature attribute repeated", new Object[0]);
                }
                C6615 c66110 = this.f6341;
                if (c66110.f20355 == EnumC15204.f46530) {
                    c66110.m18126();
                }
                c14499M33150.m30110(m28690());
            }
            C6615 c66111 = this.f6341;
            if (c66111.f20355 != EnumC15204.f46591) {
                c66111.m18132(EnumC15204.f46479);
                return;
            }
            c66111.m18126();
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
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m28667(int i) {
        char c;
        EnumC6073[] enumC6073Arr;
        int i2;
        String str;
        C23298 c23298;
        EnumC15204 enumC15204;
        C6739 c6739M28679;
        int i3;
        C6739 c6739;
        TreeMap treeMap;
        ArrayList arrayList;
        C15869 c15869M28690;
        int i4;
        int i5;
        int i6;
        String str2;
        char c2;
        int i7;
        long j = this.f6341.f20364;
        C15869 c15869M28691 = m28690();
        String str3 = (String) ((C22096) c15869M28691.f49042).f7866;
        boolean zEquals = str3.equals("<clinit>");
        boolean z = str3.equals("<init>") && !EnumC6073.m16945(i);
        C13813 c13813 = this.f35026;
        C3917 c3917 = (C3917) c13813.m30112();
        C22301 c22301 = c13813.f41195;
        int iM50045 = c22301.m50045();
        int iM16950 = EnumC6073.m16950(i, EnumC6073.f18592, EnumC6073.f18612);
        EnumC6073[] enumC6073Arr2 = EnumC6073.f18616;
        if (!EnumC6073.m16958(iM16950, enumC6073Arr2)) {
            c3917.mo11949(j, "Invalid modifier(s) for a method {0}", EnumC6073.m16951((~EnumC6073.m16931(enumC6073Arr2)) & iM16950, EnumC20185.METHOD));
        }
        EnumC6073 enumC6073 = EnumC6073.f18637;
        EnumC6073 enumC6074 = EnumC6073.f18626;
        EnumC6073 enumC6075 = EnumC6073.f18621;
        if (EnumC6073.m16974(iM16950, enumC6073, enumC6074, enumC6075)) {
            c = 3;
        } else {
            c = 3;
            c3917.mo11949(j, "Each method of a class may have at most one of its ACC_PUBLIC, ACC_PRIVATE, and ACC_PROTECTED flags set {0}", EnumC6073.m16951(iM16950, EnumC20185.METHOD));
        }
        if (zEquals) {
            if (c22301.m50045() > 51 && !EnumC6073.m16945(iM16950)) {
                c3917.mo11949(j, "In a class file whose version number is 51.0 or above, a method whose name is <clinit> must have its ACC_STATIC flag set {0}", EnumC6073.m16951(iM16950, EnumC20185.METHOD));
            }
        } else if (EnumC6073.m16948(c13813.f37140)) {
            if (z) {
                c3917.mo11949(j, "<init> method cannot be an interface method", new Object[0]);
            } else {
                int iM50046 = c22301.m50045();
                C3917 c3918 = (C3917) c13813.m30112();
                EnumC6073[] enumC6073Arr3 = new EnumC6073[4];
                enumC6073Arr3[0] = enumC6075;
                enumC6073Arr3[1] = EnumC6073.f18613;
                enumC6073Arr3[2] = EnumC6073.f18623;
                enumC6073Arr3[c] = EnumC6073.f18611;
                if (EnumC6073.m16938(iM16950, enumC6073Arr3)) {
                    c3918.mo11949(j, "Methods of interfaces  must not have ACC_PROTECTED, ACC_FINAL, ACC_SYNCHRONIZED and ACC_NATIVE flags set {0}", EnumC6073.m16951(iM16950, EnumC20185.METHOD));
                }
                if (iM50046 < 52) {
                    if (!EnumC6073.m16937(iM16950, enumC6073, EnumC6073.f18617)) {
                        c3918.mo11949(j, "In a class file whose version number is less than 52.0, each method of interface must be abstract public only {0}", EnumC6073.m16951(iM16950, EnumC20185.METHOD));
                    } else if (!EnumC6073.m16974(iM16950, enumC6073, enumC6074)) {
                        c3918.mo11949(j, "In a class file whose version number is 52.0 or above, each method of an interface must have exactly one of its ACC_PUBLIC and ACC_PRIVATE flags set {0}", EnumC6073.m16951(iM16950, EnumC20185.METHOD));
                    }
                }
            }
        } else if (z) {
            EnumC6073[] enumC6073Arr4 = EnumC6073.f18599;
            if (((~EnumC6073.m16931(enumC6073Arr4)) & iM16950) != 0) {
                c3917.mo11949(j, "Invalid modifier(s) for <init> method {0}", EnumC6073.m16951((~EnumC6073.m16931(enumC6073Arr4)) & iM16950, EnumC20185.METHOD));
            } else if (EnumC6073.m16952(iM16950)) {
                enumC6073Arr = EnumC6073.f18633;
                if (((~EnumC6073.m16931(enumC6073Arr)) & iM16950) == 0) {
                    c3917.mo11949(j, "Invalid modifier(s) for abstract method {0}", EnumC6073.m16951((~EnumC6073.m16931(enumC6073Arr)) & iM16950, EnumC20185.METHOD));
                } else if (EnumC6073.m16971(iM16950) && iM50045 >= 46 && iM50045 <= 60) {
                    c3917.mo11949(j, "If a method of a class or interface (whose major version number is at least 46 and at most 60) has its ACC_ABSTRACT flag set, it must not have its ACC_STRICT flag set", new Object[0]);
                }
            }
        } else if (EnumC6073.m16952(iM16950)) {
            enumC6073Arr = EnumC6073.f18633;
            if (((~EnumC6073.m16931(enumC6073Arr)) & iM16950) == 0) {
                c3917.mo11949(j, "Invalid modifier(s) for abstract method {0}", EnumC6073.m16951((~EnumC6073.m16931(enumC6073Arr)) & iM16950, EnumC20185.METHOD));
            } else if (EnumC6073.m16971(iM16950)) {
                c3917.mo11949(j, "If a method of a class or interface (whose major version number is at least 46 and at most 60) has its ACC_ABSTRACT flag set, it must not have its ACC_STRICT flag set", new Object[0]);
            }
        }
        this.f6341.m18132(EnumC15204.f46597);
        C15869 c15869M28692 = m28690();
        try {
            String str4 = (String) ((C22096) c15869M28692.f49042).f7866;
            int length = str4.length();
            String str5 = "\"({JavaTypeSignature})Result\" is missing.";
            if (length <= 0) {
                i4 = 0;
                i5 = 0;
                i6 = i4;
                i2 = i5;
                str2 = str5;
                c2 = 1;
                C3917 c3919 = this.f6339;
                long j2 = this.f6341.f20364;
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(i6 + 1);
                objArr[c2] = str2;
                c3919.mo11949(j2, "Malformed method signature at position {0}. {1}", objArr);
            } else if (str4.charAt(0) != '(') {
                str5 = "A \"(\" token is expected in \"({JavaTypeSignature})Result\"";
                i4 = 0;
                i5 = 0;
                i6 = i4;
                i2 = i5;
                str2 = str5;
                c2 = 1;
                C3917 c39110 = this.f6339;
                long j3 = this.f6341.f20364;
                Object[] objArr2 = new Object[2];
                objArr2[0] = Integer.valueOf(i6 + 1);
                objArr2[c2] = str2;
                c39110.mo11949(j3, "Malformed method signature at position {0}. {1}", objArr2);
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
                                C3917 c39111 = this.f6339;
                                long j4 = this.f6341.f20364;
                                Object[] objArr3 = new Object[2];
                                objArr3[0] = Integer.valueOf(i6 + 1);
                                objArr3[c2] = str2;
                                c39111.mo11949(j4, "Malformed method signature at position {0}. {1}", objArr3);
                            }
                        }
                    }
                    i4 = i6;
                    i5 = i2;
                    i6 = i4;
                    i2 = i5;
                    str2 = str5;
                    c2 = 1;
                    C3917 c39112 = this.f6339;
                    long j5 = this.f6341.f20364;
                    Object[] objArr4 = new Object[2];
                    objArr4[0] = Integer.valueOf(i6 + 1);
                    objArr4[c2] = str2;
                    c39112.mo11949(j5, "Malformed method signature at position {0}. {1}", objArr4);
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
            i2 = 0;
        }
        if (!EnumC6073.m16945(i) && !zEquals) {
            i2++;
        }
        if (i2 > 255) {
            this.f6339.mo11949(this.f6341.f20363, "Number of parameters too large ({0}>255)", Integer.toString(i2));
        }
        C11678 c11678M33149 = this.f35026.m33149(i, c15869M28691, c15869M28692);
        c11678M33149.m30109(this.f35014);
        C13813 c13814 = c11678M33149.f34799;
        C6615 c6615 = this.f6341;
        if (c6615.f20355 == EnumC15204.f46597) {
            c6615.m18126();
            if (!this.f6341.m18130(EnumC15204.f46579, EnumC15204.f46611, EnumC15204.f46647)) {
                throw C19462.m44860(this.f6339, this.f6341.f20363, "Either name or Constant Pool index expected, got {0}", new Object[]{C21639.m48906(this.f6341.f20355, new StringBuilder("\""), "\"")});
            }
            c11678M33149.m30110(m28690());
        }
        boolean z3 = this.f6341.f20355 == EnumC15204.f46479;
        boolean z4 = false;
        boolean z5 = true;
        do {
            int i8 = C13148.f39311[this.f6341.f20355.ordinal()];
            str = "\"{0}\" token is expected";
            c23298 = this.f35022;
            EnumC10932 enumC10932 = null;
            switch (i8) {
                case 27:
                    if (c11678M33149.f34800 != null) {
                        this.f6339.mo11949(this.f6341.f20363, "The {0} attribute repeated in the method_info structure", EnumC4662.f14808.m13646());
                    }
                    this.f6341.m18126();
                    ArrayList arrayList2 = new ArrayList();
                    while (true) {
                        arrayList2.add(this.f35025.m52383(EnumC10932.f32947, enumC10932, false));
                        C6615 c6616 = this.f6341;
                        EnumC15204 enumC15205 = c6616.f20355;
                        enumC15204 = EnumC15204.f46479;
                        if (enumC15205 != enumC15204 && enumC15205 == EnumC15204.f46591) {
                            enumC10932 = null;
                            c6616.m18126();
                        }
                    }
                    c11678M33149.getClass();
                    if (!arrayList2.isEmpty()) {
                        C7279 c7279 = c11678M33149.f34800;
                        if (c7279 == null) {
                            c11678M33149.f34800 = new C7279(c11678M33149.f34799.f37150, EnumC4662.f14808, arrayList2);
                        } else {
                            c7279.addAll(arrayList2);
                        }
                    }
                    C6615 c6617 = this.f6341;
                    if (c6617.f20355 != enumC15204) {
                        if (c6617.m18130(EnumC15204.f46564, EnumC15204.f46601, EnumC15204.f46642)) {
                        }
                        z4 = false;
                    } else {
                        c6617.m18126();
                    }
                    z5 = false;
                    z4 = false;
                    break;
                case 28:
                    if (c11678M33149.f34796 != null) {
                        this.f6339.m11951(this.f6341.f20363, "The {0} attribute repeated in the method_info structure", EnumC4662.f14806.m13646());
                        throw null;
                    }
                    c11678M33149.f34796 = c23298.m51697();
                    C6615 c6618 = this.f6341;
                    if (c6618.f20355 == EnumC15204.f46479) {
                        z3 = true;
                        z5 = false;
                    } else if (!c6618.m18130(EnumC15204.f46530, EnumC15204.f46440)) {
                    }
                    this.f6341.m18126();
                    break;
                    break;
                case 29:
                    this.f6341.m18126();
                    if (c11678M33149.f37141 != null) {
                        this.f6339.mo11949(this.f6341.f20363, "The {0} attribute repeated in the method_info structure", EnumC4662.f14797.m13646());
                    }
                    c11678M33149.m30110(m28690());
                    z4 = false;
                    break;
                case 30:
                    this.f6341.m18126();
                    z5 = false;
                    break;
                case 31:
                    this.f6341.m18126();
                    z4 = true;
                    break;
                default:
                    if (z4) {
                        ArrayList<EnumC15204> arrayList3 = new ArrayList();
                        if (c11678M33149.f34796 == null) {
                            arrayList3.add(EnumC15204.f46609);
                        }
                        if (c11678M33149.f34800 == null) {
                            arrayList3.add(EnumC15204.f46440);
                        }
                        if (c11678M33149.f37141 == null) {
                            arrayList3.add(EnumC15204.f46530);
                        }
                        if (arrayList3.size() == 1) {
                            this.f6339.m11951(this.f6341.f20364, "\"{0}\" token is expected", ((EnumC15204) arrayList3.get(0)).m35967());
                            throw null;
                        }
                        C3917 c39113 = this.f6339;
                        long j6 = this.f6341.f20364;
                        StringBuilder sb = new StringBuilder("");
                        for (EnumC15204 enumC15206 : arrayList3) {
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append('\'');
                            sb.append(enumC15206.m35967());
                            sb.append('\'');
                        }
                        c39113.m11951(j6, "One of {0} tokens is expected", sb.toString());
                        throw null;
                    }
                    z5 = false;
                    break;
            }
        } while (z5);
        if (!z3) {
            C6739 c67310 = null;
            C6739 c6739M286710 = null;
            while (true) {
                C6615 c6619 = this.f6341;
                if (c6619.f20355 == EnumC15204.f46564) {
                    c6619.m18126();
                    i3 = 2;
                    c6739M28679 = m28679(2);
                } else {
                    c6739M28679 = c67310;
                    i3 = 2;
                }
                C6615 c66110 = this.f6341;
                if (c66110.f20355 == EnumC15204.f46601) {
                    c66110.m18126();
                    c6739M286710 = m28679(i3);
                }
                if (this.f6341.f20355 == EnumC15204.f46543) {
                    c23298.f6341.m18127(C18307.m42645(i2, " - - - > [ParserAnnotation.parseParamAnnots]: Begin, totalParams =  ", " "));
                    TreeMap treeMap2 = new TreeMap();
                    while (true) {
                        C6615 c66111 = c23298.f6341;
                        if (c66111.f20355 == EnumC15204.f46543) {
                            int i9 = c66111.f20360;
                            Integer numValueOf = Integer.valueOf(i9);
                            if (i9 < 0 || i9 >= i2) {
                                c23298.f6339.mo9065(c23298.f6341.f20363, "Invalid Parameter Number: {0}", Integer.valueOf(i9));
                            }
                            if (treeMap2.get(numValueOf) != null) {
                                c23298.f6339.mo9065(c23298.f6341.f20363, "Duplicate Parameter Number: {0}", Integer.valueOf(i9));
                            }
                            c23298.f6341.m18126();
                            c23298.f6341.m18132(EnumC15204.f46597);
                            C6615 c66112 = c23298.f6341;
                            if (c66112.f20355 == EnumC15204.f46594) {
                                c66112.m18127(" - - - > [ParserAnnotation.scanParamName]: Begin ");
                                c23298.f6341.m18126();
                                c23298.f6341.m18132(EnumC15204.f46642);
                                EnumC15204 enumC15207 = c23298.f6341.f20355;
                                if (enumC15207 == EnumC15204.f46611 || enumC15207.m35966()) {
                                    c15869M28690 = c23298.f6340.m28690();
                                } else {
                                    C6615 c66113 = c23298.f6341;
                                    if (c66113.f20355 != EnumC15204.f46579) {
                                        throw C19462.m44860(c23298.f6339, c66113.f20363, "Incorrect ParamName, unrecognized token: \"{0}\"", new Object[]{c66113.f20350});
                                    }
                                    int i10 = c66113.f20360;
                                    c15869M28690 = c23298.f6340.f35012.m9311(i10);
                                    if (!(c15869M28690.f49042 instanceof C22096)) {
                                        throw C19462.m44860(c23298.f6339, c23298.f6341.f20363, "ParameterName CPX at {0} is not a ConstantString", new Object[]{Integer.valueOf(i10)});
                                    }
                                }
                                int iM28686 = c23298.f6340.m28686();
                                c23298.f6341.m18132(EnumC15204.f46442);
                                C3917 c39114 = (C3917) c11678M33149.m30112();
                                StringBuilder sbM32308 = C13325.m32308(i9, "addMethodParameter Param[", "] (name: ");
                                sbM32308.append(c15869M28690.toString());
                                sbM32308.append(", Flags (");
                                sbM32308.append(iM28686);
                                sbM32308.append(").");
                                int i11 = 0;
                                c39114.m45778(sbM32308.toString(), new Object[0]);
                                if (c11678M33149.f34801 == null) {
                                    c11678M33149.f34801 = new C7279(c13814.f37150, EnumC4662.f14809, 0);
                                    int i12 = 0;
                                    while (i12 < i2) {
                                        c11678M33149.f34801.m19535(new C6033(i11, null));
                                        i12++;
                                        i11 = 0;
                                        c6739M286710 = c6739M286710;
                                    }
                                }
                                c6739 = c6739M286710;
                                c11678M33149.f34801.m19533(i9, new C6033(iM28686, c15869M28690));
                                c23298.f6341.m18127(" - - - > [ParserAnnotation.scanParamName]: End ");
                            } else {
                                c6739 = c6739M286710;
                            }
                            if (c23298.f6341.f20355 == EnumC15204.f46559) {
                                ArrayList<C16636> arrayListM51696 = c23298.m51696();
                                treeMap2.put(numValueOf, arrayListM51696);
                                for (C16636 c16636 : arrayListM51696) {
                                    if (c16636.f51086) {
                                        if (c11678M33149.f34797 == null) {
                                            c11678M33149.f34797 = new C10267(c13814.f37150, EnumC4662.f14815, i2);
                                        }
                                        treeMap = c11678M33149.f34797.f30924;
                                        arrayList = (ArrayList) treeMap.get(Integer.valueOf(i9));
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            treeMap.put(Integer.valueOf(i9), arrayList);
                                        }
                                    } else {
                                        if (c11678M33149.f34794 == null) {
                                            c11678M33149.f34794 = new C10267(c13814.f37150, EnumC4662.f14792, i2);
                                        }
                                        treeMap = c11678M33149.f34794.f30924;
                                        arrayList = (ArrayList) treeMap.get(Integer.valueOf(i9));
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            treeMap.put(Integer.valueOf(i9), arrayList);
                                        }
                                    }
                                    arrayList.add(c16636);
                                }
                            }
                            str = str;
                            c6739M286710 = c6739;
                        }
                    }
                }
                C6739 c67311 = c6739M286710;
                String str6 = str;
                if (this.f6341.f20355.m35961(EnumC15204.f46564, EnumC15204.f46601, EnumC15204.f46543)) {
                    c6739M286710 = c67311;
                    c67310 = c6739M28679;
                    str = str6;
                } else if (this.f6341.f20355 == EnumC15204.f46479) {
                    if (c6739M28679 != null || c67311 != null) {
                        this.f6339.mo11946(str6, EnumC15204.f46642.m35967());
                    }
                    this.f6341.m18126();
                } else if (EnumC6073.m16952(i)) {
                    C6615 c66114 = this.f6341;
                    if (c66114.f20355 == EnumC15204.f46642) {
                        c66114.m18126();
                        C8815 c8815 = new C8815(c11678M33149, i2, c6739M28679, c67311);
                        c11678M33149.f34795 = c8815;
                        this.f35018 = c8815;
                        m28655();
                        this.f35018.m22782();
                        this.f6341.m18132(EnumC15204.f46442);
                    }
                } else {
                    this.f6341.m18132(EnumC15204.f46642);
                    C8815 c8816 = new C8815(c11678M33149, i2, c6739M28679, c67311);
                    c11678M33149.f34795 = c8816;
                    this.f35018 = c8816;
                    m28655();
                    this.f35018.m22782();
                    this.f6341.m18132(EnumC15204.f46442);
                }
            }
        }
        this.f35026.f41207 = null;
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
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m28655() {
        EnumC15204 enumC15204;
        C6615 c6615;
        EnumC15204 enumC15205;
        C7776 c7776;
        char c;
        C6615 c6616;
        EnumC15204 enumC15206;
        EnumC15204 enumC15207;
        C6615 c6617;
        EnumC15204 enumC15208;
        C6615 c6618;
        EnumC15204 enumC15209;
        EnumC15204 enumC152010;
        C6615 c6619;
        EnumC15204 enumC152011;
        C6615 c66110;
        EnumC15204 enumC152012;
        EnumC15204 enumC152013;
        C6615 c66111;
        EnumC15204 enumC152014;
        while (true) {
            while (true) {
                EnumC15204 enumC152015 = this.f6341.f20355;
                if (enumC152015 == EnumC15204.f46554 || enumC152015 == (enumC15204 = EnumC15204.f46442)) {
                    return;
                }
                this.f35013.m47745();
                c6615 = this.f6341;
                enumC15205 = c6615.f20355;
                if (enumC15205 == enumC15204) {
                    return;
                }
                EnumC15204 enumC152016 = EnumC15204.f46537;
                c7776 = this.f35021;
                if (enumC15205 == enumC152016) {
                    C8815 c8815 = this.f35018;
                    c7776.getClass();
                    ArrayList arrayList = new ArrayList();
                    c7776.f6341.m18126();
                    C6615 c66112 = c7776.f6341;
                    if (c66112.f20355 == EnumC15204.f46597) {
                        c66112.m18126();
                    }
                    int i = -1;
                    boolean z = true;
                    boolean z2 = false;
                    while (true) {
                        EnumC15204 enumC152017 = c7776.f6341.f20355;
                        if (enumC152017 != EnumC15204.f46554 && enumC152017 != EnumC15204.f46442) {
                            int i2 = C14125.f42606[enumC152017.ordinal()];
                            if (i2 != 7) {
                                if (i2 == 20) {
                                    if (z) {
                                        c7776.f6339.m11951(c7776.f6341.f20363, "The LineNumberTable format is incorrect; \"{0}\" is expected", "line keyword");
                                        throw null;
                                    }
                                    if (i == -1) {
                                        c7776.f6339.m11951(c7776.f6341.f20363, "The LineNumberTable format is incorrect; \"{0}\" is expected", "line_number:");
                                        throw null;
                                    }
                                    if (z2) {
                                        c7776.f6339.m11951(c7776.f6341.f20363, "The LineNumberTable format is incorrect; \"{0}\" is expected", "start_pc");
                                        throw null;
                                    }
                                    z2 = true;
                                } else if (i2 == 21) {
                                    if (!z) {
                                        c7776.f6339.m11951(c7776.f6341.f20363, "The LineNumberTable format is incorrect; \"{0}\" is expected", "line  line_number:  start_pc");
                                        throw null;
                                    }
                                    z = false;
                                } else if (i != -1 || !z) {
                                    c7776.f6339.m11951(c7776.f6341.f20363, "The LineNumberTable format is incorrect; \"{0}\" is expected", "line  line_number:  start_pc");
                                    throw null;
                                }
                            } else if (i == -1) {
                                i = c7776.f6341.f20360;
                            } else {
                                arrayList.add(new C20145(c7776.f6341.f20360, i));
                                i = -1;
                                z = true;
                                z2 = false;
                            }
                            c7776.f6341.m18126();
                        }
                    }
                    C7279 c7279 = c8815.f26854;
                    if (c7279 != null) {
                        c7279.clear();
                    } else {
                        C7279 c72710 = new C7279(c8815.f26855.f37150, EnumC4662.f14786);
                        c8815.f26854 = c72710;
                        c8815.f26859.m16430(c72710);
                    }
                    c8815.f26854.addAll(arrayList);
                } else if (enumC15205 == EnumC15204.f46571) {
                    this.f35018.m22779(c7776.m20804(false), false);
                } else if (enumC15205 == EnumC15204.f46650) {
                    this.f35018.m22779(c7776.m20804(true), true);
                } else if (enumC15205 == EnumC15204.f46559) {
                    C8815 c8816 = this.f35018;
                    ArrayList<C16636> arrayListM51696 = this.f35022.m51696();
                    C11678 c11678 = c8816.f26855;
                    for (C16636 c16636 : arrayListM51696) {
                        boolean z3 = c16636.f51086;
                        if (c16636 instanceof C8026) {
                            C8026 c8026 = (C8026) c16636;
                            if (z3) {
                                if (c8816.f26849 == null) {
                                    c8816.f26849 = new C7279(c11678.f37150, EnumC4662.f14816);
                                }
                                c8816.f26849.m19535(c8026);
                            } else {
                                if (c8816.f26848 == null) {
                                    c8816.f26848 = new C7279(c11678.f37150, EnumC4662.f14785);
                                }
                                c8816.f26848.m19535(c8026);
                            }
                        }
                    }
                }
            }
            if (enumC15205 == EnumC15204.f46534) {
                C8815 c8817 = this.f35018;
                C6615 c66113 = c7776.f6341;
                if (c66113.f20355 == EnumC15204.f46597) {
                    c66113.m18126();
                }
                ArrayList arrayList2 = new ArrayList();
                EnumC23006 enumC23006 = EnumC23006.UNKNOWN_TYPE;
                C19316 c19316 = null;
                while (true) {
                    EnumC15204 enumC152018 = c7776.f6341.f20355;
                    if (enumC152018 != EnumC15204.f46554 && enumC152018 != EnumC15204.f46442) {
                        switch (C14125.f42606[enumC152018.ordinal()]) {
                            case 10:
                                c7776.f6341.m18126();
                                c7776.f6341.m18132(EnumC15204.f46608);
                                C6615 c66114 = c7776.f6341;
                                if (c66114.f20355 != EnumC15204.f46543) {
                                    c7776.f6339.m11951(c66114.f20363, "{0} is expected", "\"number of entries\"");
                                    throw null;
                                }
                                c7776.f6341.m18126();
                                break;
                            case 11:
                                if (c19316 != null) {
                                    arrayList2.add(c19316);
                                }
                                c7776.f6341.m18126();
                                c7776.f6341.m18132(EnumC15204.f46608);
                                C6615 c66115 = c7776.f6341;
                                if (c66115.f20355 != EnumC15204.f46543) {
                                    c7776.f6339.m11951(c66115.f20363, "{0} is expected", "The offset value");
                                    throw null;
                                }
                                c19316 = new C19316(c7776.f6339, false);
                                c19316.m44510(c7776.f6341.f20360);
                                c7776.f6341.m18126();
                                break;
                                break;
                            case 12:
                                if (c19316 == null) {
                                    c7776.f6339.m11951(c7776.f6341.f20363, "{0} is expected", C4860.m14172("\"", EnumC15204.f46526.m35967(), "\""));
                                    throw null;
                                }
                                C5868 c5868 = c19316.f60734;
                                if (c5868 != null && c5868.f18006.size() > 0) {
                                    c7776.f6339.mo11949(c7776.f6341.f20363, "The {0} overwrites an already declared one.", C4860.m14172("\"", EnumC15204.f46595.m35967(), "\""));
                                }
                                c7776.f6341.m18126();
                                c7776.f6341.m18132(EnumC15204.f46608);
                                C6615 c66116 = c7776.f6341;
                                if (c66116.f20355 == EnumC15204.f46611) {
                                    if (c66116.f20350.equals(EnumC15204.f46583.m35967() + EnumC15204.f46618.m35967())) {
                                        c19316.f60734 = new C5868();
                                        c7776.f6341.m18126();
                                    }
                                }
                                c7776.f6341.m18134(EnumC15204.f46583);
                                C5868 c5869 = new C5868();
                                c19316.f60734 = c5869;
                                while (true) {
                                    C6615 c66117 = c7776.f6341;
                                    EnumC15204 enumC152019 = c66117.f20355;
                                    if (enumC152019 == EnumC15204.f46554) {
                                    }
                                    EnumC15204 enumC152020 = EnumC15204.f46479;
                                    if (enumC152019 == enumC152020) {
                                        c66117.m18126();
                                        c7776.f6341.m18134(EnumC15204.f46618);
                                    }
                                    if (enumC152019 == EnumC15204.f46611 && c66117.f20350.equals(EnumC15204.f46618.m35967())) {
                                    }
                                    c7776.f6340.m28683(c5869);
                                    C6615 c66118 = c7776.f6341;
                                    EnumC15204 enumC152021 = c66118.f20355;
                                    if (enumC152021 == EnumC15204.f46591) {
                                        c66118.m18126();
                                    } else if (enumC152021 != enumC152020) {
                                        c7776.f6339.m11951(c66118.f20363, "\"{0}\" token is expected", C21639.m48906(enumC152020, new StringBuilder("\""), "\""));
                                        throw null;
                                    }
                                    break;
                                    break;
                                    break;
                                }
                                break;
                                break;
                            case 13:
                                if (c19316 == null) {
                                    c7776.f6339.m11951(c7776.f6341.f20363, "{0} is expected", C4860.m14172("\"", EnumC15204.f46526.m35967(), "\""));
                                    throw null;
                                }
                                C5868 c58610 = c19316.f60736;
                                if (c58610 == null || c58610.f18006.size() <= 0) {
                                    c = 0;
                                } else {
                                    c = 0;
                                    c7776.f6339.mo11949(c7776.f6341.f20363, "The {0} overwrites an already declared one.", C4860.m14172("\"", EnumC15204.f46505.m35967(), "\""));
                                }
                                c7776.f6341.m18126();
                                c7776.f6341.m18132(EnumC15204.f46608);
                                C6615 c66119 = c7776.f6341;
                                if (c66119.f20355 == EnumC15204.f46611) {
                                    if (c66119.f20350.equals(EnumC15204.f46583.m35967() + EnumC15204.f46618.m35967())) {
                                        c19316.f60736 = new C5868();
                                        c7776.f6341.m18126();
                                    }
                                }
                                c7776.f6341.m18134(EnumC15204.f46583);
                                C5868 c58611 = new C5868();
                                c19316.f60736 = c58611;
                                while (true) {
                                    C6615 c66120 = c7776.f6341;
                                    EnumC15204 enumC152022 = c66120.f20355;
                                    if (enumC152022 == EnumC15204.f46554) {
                                    }
                                    EnumC15204 enumC152023 = EnumC15204.f46479;
                                    if (enumC152022 == enumC152023) {
                                        c66120.m18126();
                                        c7776.f6341.m18134(EnumC15204.f46618);
                                    }
                                    if (enumC152022 == EnumC15204.f46611 && c66120.f20350.equals(EnumC15204.f46618.m35967())) {
                                    }
                                    c7776.f6340.m28683(c58611);
                                    C6615 c66121 = c7776.f6341;
                                    EnumC15204 enumC152024 = c66121.f20355;
                                    if (enumC152024 == EnumC15204.f46591) {
                                        c66121.m18126();
                                    } else if (enumC152024 != enumC152023) {
                                        C3917 c3917 = c7776.f6339;
                                        long j = c66121.f20363;
                                        Object[] objArr = new Object[1];
                                        objArr[c] = C21639.m48906(enumC152023, new StringBuilder("\""), "\"");
                                        c3917.m11951(j, "\"{0}\" token is expected", objArr);
                                        throw null;
                                    }
                                    break;
                                    break;
                                    break;
                                }
                                break;
                                break;
                            default:
                                c7776.f6341.m18126();
                                break;
                        }
                    }
                }
                if (c19316 != null) {
                    arrayList2.add(c19316);
                }
                c8817.m22778(arrayList2);
            } else if (enumC15205 == EnumC15204.f46452) {
                C8815 c8818 = this.f35018;
                c7776.getClass();
                ArrayList arrayList3 = new ArrayList();
                EnumC23006 enumC23007 = EnumC23006.UNKNOWN_TYPE;
                c7776.f6341.m18126();
                C6615 c66122 = c7776.f6341;
                if (c66122.f20355 == EnumC15204.f46597) {
                    c66122.m18126();
                }
                EnumC23006 enumC23006M51150 = enumC23007;
                C19316 c19317 = null;
                int i3 = -1;
                int i4 = 1;
                int i5 = 0;
                while (true) {
                    EnumC15204 enumC152025 = c7776.f6341.f20355;
                    if (enumC152025 != EnumC15204.f46554) {
                        switch (C14125.f42606[enumC152025.ordinal()]) {
                            case 10:
                                c7776.f6341.m18126();
                                c7776.f6341.m18132(EnumC15204.f46608);
                                C6615 c66123 = c7776.f6341;
                                if (c66123.f20355 != EnumC15204.f46543) {
                                    c7776.f6339.m11951(c66123.f20363, "{0} is expected", "\"number of entries\"");
                                    throw null;
                                }
                                c7776.f6341.m18126();
                                i4 = 1;
                                break;
                            case 11:
                            default:
                                c7776.f6341.m18126();
                                i4 = 1;
                                break;
                            case 12:
                                if (c19317 == null || c19317.m44511() == EnumC23006.SAME_FRAME) {
                                    if (i5 > 0) {
                                        c7776.f6339.m11951(c7776.f6341.f20363, "\"{0}\" token is expected", EnumC15204.f46442.m35967());
                                        throw null;
                                    }
                                    c7776.f6339.m11951(c7776.f6341.f20363, "{0} is expected", C4860.m14172("\"", EnumC15204.f46581.m35967(), "\""));
                                    throw null;
                                }
                                EnumC15204 enumC15204M44505 = c19317.m44505();
                                if (enumC15204M44505 != EnumC15204.f46595) {
                                    c7776.f6339.m11951(c7776.f6341.f20363, "{0} is expected", C4860.m14172("\"", enumC15204M44505.m35967(), "\""));
                                    throw null;
                                }
                                c7776.f6341.m18126();
                                c7776.f6341.m18132(EnumC15204.f46608);
                                c19317.f60734 = new C5868();
                                C6615 c66124 = c7776.f6341;
                                if (c66124.f20355 == EnumC15204.f46611) {
                                    if (c66124.f20350.equals(EnumC15204.f46583.m35967() + EnumC15204.f46618.m35967())) {
                                        c7776.f6341.m18126();
                                    } else {
                                        c7776.f6341.m18134(EnumC15204.f46583);
                                        while (true) {
                                            c6616 = c7776.f6341;
                                            enumC15206 = c6616.f20355;
                                            if (enumC15206 == EnumC15204.f46554) {
                                                enumC15207 = EnumC15204.f46479;
                                                if (enumC15206 == enumC15207) {
                                                    c6616.m18126();
                                                    c7776.f6341.m18134(EnumC15204.f46618);
                                                } else if (enumC15206 == EnumC15204.f46611 || !c6616.f20350.equals(EnumC15204.f46618.m35967())) {
                                                    c7776.f6340.m28683(c19317.f60734);
                                                    c6617 = c7776.f6341;
                                                    enumC15208 = c6617.f20355;
                                                    if (enumC15208 != EnumC15204.f46591) {
                                                        c6617.m18126();
                                                    } else if (enumC15208 == enumC15207) {
                                                        c7776.f6339.m11951(c6617.f20363, "\"{0}\" token is expected", C21639.m48906(enumC15207, new StringBuilder("\""), "\""));
                                                        throw null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    c7776.f6341.m18134(EnumC15204.f46583);
                                    while (true) {
                                        c6616 = c7776.f6341;
                                        enumC15206 = c6616.f20355;
                                        if (enumC15206 == EnumC15204.f46554) {
                                            enumC15207 = EnumC15204.f46479;
                                            if (enumC15206 == enumC15207) {
                                                c6616.m18126();
                                                c7776.f6341.m18134(EnumC15204.f46618);
                                            } else {
                                                if (enumC15206 == EnumC15204.f46611) {
                                                }
                                                c7776.f6340.m28683(c19317.f60734);
                                                c6617 = c7776.f6341;
                                                enumC15208 = c6617.f20355;
                                                if (enumC15208 != EnumC15204.f46591) {
                                                    c6617.m18126();
                                                } else if (enumC15208 == enumC15207) {
                                                    c7776.f6339.m11951(c6617.f20363, "\"{0}\" token is expected", C21639.m48906(enumC15207, new StringBuilder("\""), "\""));
                                                    throw null;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (c19317.m44505() == null) {
                                    arrayList3.add(c19317);
                                    i4 = 1;
                                    c19317 = null;
                                }
                                i4 = 1;
                                break;
                                break;
                            case 13:
                                if (c19317 == null || c19317.m44511() == EnumC23006.SAME_FRAME) {
                                    if (i5 > 0) {
                                        c7776.f6339.m11951(c7776.f6341.f20363, "\"{0}\" token is expected", EnumC15204.f46442.m35967());
                                        throw null;
                                    }
                                    c7776.f6339.m11951(c7776.f6341.f20363, "{0} is expected", C4860.m14172("\"", EnumC15204.f46581.m35967(), "\""));
                                    throw null;
                                }
                                EnumC15204 enumC15204M44506 = c19317.m44505();
                                if (enumC15204M44506 != EnumC15204.f46505 && (enumC15204M44506 != EnumC15204.f46595 || c19317.m44511() != EnumC23006.FULL_FRAME)) {
                                    c7776.f6339.m11951(c7776.f6341.f20363, "{0} is expected", C4860.m14172("\"", enumC15204M44506.m35967(), "\""));
                                    throw null;
                                }
                                c7776.f6341.m18126();
                                c7776.f6341.m18132(EnumC15204.f46608);
                                c19317.f60736 = new C5868();
                                C6615 c66125 = c7776.f6341;
                                if (c66125.f20355 == EnumC15204.f46611) {
                                    if (c66125.f20350.equals(EnumC15204.f46583.m35967() + EnumC15204.f46618.m35967())) {
                                        c7776.f6341.m18126();
                                    } else {
                                        c7776.f6341.m18134(EnumC15204.f46583);
                                        while (true) {
                                            c6618 = c7776.f6341;
                                            enumC15209 = c6618.f20355;
                                            if (enumC15209 == EnumC15204.f46554) {
                                                enumC152010 = EnumC15204.f46479;
                                                if (enumC15209 == enumC152010) {
                                                    c6618.m18126();
                                                    c7776.f6341.m18134(EnumC15204.f46618);
                                                } else if (enumC15209 == EnumC15204.f46611 || !c6618.f20350.equals(EnumC15204.f46618.m35967())) {
                                                    c7776.f6340.m28683(c19317.f60736);
                                                    c6619 = c7776.f6341;
                                                    enumC152011 = c6619.f20355;
                                                    if (enumC152011 != EnumC15204.f46591) {
                                                        c6619.m18126();
                                                    } else if (enumC152011 == enumC152010) {
                                                        c7776.f6339.m11951(c6619.f20363, "\"{0}\" token is expected", C21639.m48906(enumC152010, new StringBuilder("\""), "\""));
                                                        throw null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    c7776.f6341.m18134(EnumC15204.f46583);
                                    while (true) {
                                        c6618 = c7776.f6341;
                                        enumC15209 = c6618.f20355;
                                        if (enumC15209 == EnumC15204.f46554) {
                                            enumC152010 = EnumC15204.f46479;
                                            if (enumC15209 == enumC152010) {
                                                c6618.m18126();
                                                c7776.f6341.m18134(EnumC15204.f46618);
                                            } else {
                                                if (enumC15209 == EnumC15204.f46611) {
                                                }
                                                c7776.f6340.m28683(c19317.f60736);
                                                c6619 = c7776.f6341;
                                                enumC152011 = c6619.f20355;
                                                if (enumC152011 != EnumC15204.f46591) {
                                                    c6619.m18126();
                                                } else if (enumC152011 == enumC152010) {
                                                    c7776.f6339.m11951(c6619.f20363, "\"{0}\" token is expected", C21639.m48906(enumC152010, new StringBuilder("\""), "\""));
                                                    throw null;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (c19317.m44505() == null) {
                                    arrayList3.add(c19317);
                                    i4 = 1;
                                    c19317 = null;
                                }
                                i4 = 1;
                                break;
                                break;
                            case 14:
                                if (i5 == 0) {
                                    c7776.f6339.m11951(c7776.f6341.f20363, "early_larval_frame must be declared before the wrapped base_frame.", new Object[0]);
                                    throw null;
                                }
                                c7776.f6341.m18126();
                                i4 = 1;
                                break;
                            case 15:
                                if (i5 != 0) {
                                    i5--;
                                    c7776.f6341.m18126();
                                    i4 = 1;
                                }
                                break;
                            case 16:
                            case 17:
                                c7776.f6341.m18126();
                                c7776.f6341.m18132(EnumC15204.f46608);
                                C6615 c66126 = c7776.f6341;
                                if (c66126.f20355 == EnumC15204.f46543) {
                                    int i6 = c66126.f20360;
                                    i3 = i6;
                                    enumC23006M51150 = EnumC23006.m51150(i6);
                                }
                                if (enumC23006M51150 == EnumC23006.UNKNOWN_TYPE) {
                                    c7776.f6339.m11951(c7776.f6341.f20363, "{0} is expected", "An integer within the range of [0 to 255]");
                                    throw null;
                                }
                                if (enumC23006M51150 == EnumC23006.EARLY_LARVAL) {
                                    if (i5 > 2) {
                                        c7776.f6339.m11951(c7776.f6341.f20363, "base_frame is expected", new Object[0]);
                                        throw null;
                                    }
                                    i5++;
                                }
                                if (c19317 == null) {
                                    c19317 = new C19316(c7776.f6339, c7776.f6340.f35018.f26843.f41195.m50043());
                                } else {
                                    EnumC15204 enumC15204M44507 = c19317.m44505();
                                    if (enumC15204M44507 == null) {
                                        arrayList3.add(c19317);
                                        c19317 = new C19316(c7776.f6339, c7776.f6340.f35018.f26843.f41195.m50043());
                                    } else {
                                        if (enumC15204M44507 != EnumC15204.f46505 && c19317.m44511() != EnumC23006.FULL_FRAME) {
                                            c7776.f6339.m11951(c7776.f6341.f20363, "{0} is expected", C4860.m14172("\"", enumC15204M44507.m35967(), "\""));
                                            throw null;
                                        }
                                        c19317.f60736 = new C5868();
                                        arrayList3.add(c19317);
                                        c19317 = new C19316(c7776.f6339, c7776.f6340.f35018.f26843.f41195.m50043());
                                        c7776.f6339.mo11949(c7776.f6341.f20363, "{0} is expected", C4860.m14172("\"", enumC15204M44507.m35967(), "\""));
                                    }
                                }
                                c19317.m44512(i3);
                                if (c19317.m44505() == null) {
                                    arrayList3.add(c19317);
                                    c19317 = null;
                                }
                                i4 = 1;
                                break;
                                break;
                            case 18:
                                if (c19317 == null || c19317.m44511() == EnumC23006.SAME_FRAME) {
                                    if (i5 > 0) {
                                        c7776.f6339.m11951(c7776.f6341.f20363, "\"{0}\" token is expected", EnumC15204.f46442.m35967());
                                        throw null;
                                    }
                                    c7776.f6339.m11951(c7776.f6341.f20363, "{0} is expected", C4860.m14172("\"", EnumC15204.f46581.m35967(), "\""));
                                    throw null;
                                }
                                EnumC15204 enumC15204M44508 = c19317.m44505();
                                if (enumC15204M44508 != EnumC15204.f46506) {
                                    c7776.f6339.m11951(c7776.f6341.f20363, "{0} is expected", C4860.m14172("\"", enumC15204M44508.m35967(), "\""));
                                    throw null;
                                }
                                c7776.f6341.m18126();
                                c7776.f6341.m18132(EnumC15204.f46608);
                                C6615 c66127 = c7776.f6341;
                                if (c66127.f20355 != EnumC15204.f46543) {
                                    c7776.f6339.m11951(c66127.f20363, "{0} is expected", "The offset_delta value");
                                    throw null;
                                }
                                c19317.m44506(c66127.f20360);
                                if (c19317.m44505() == null) {
                                    arrayList3.add(c19317);
                                    c19317 = null;
                                }
                                c7776.f6341.m18126();
                                i4 = 1;
                                break;
                                break;
                            case 19:
                                if (c19317 == null || c19317.m44511() == EnumC23006.SAME_FRAME) {
                                    if (i5 > 0) {
                                        C3917 c3918 = c7776.f6339;
                                        long j2 = c7776.f6341.f20363;
                                        Object[] objArr2 = new Object[i4];
                                        objArr2[0] = EnumC15204.f46442.m35967();
                                        c3918.m11951(j2, "\"{0}\" token is expected", objArr2);
                                        throw null;
                                    }
                                    C3917 c3919 = c7776.f6339;
                                    long j3 = c7776.f6341.f20363;
                                    Object[] objArr3 = new Object[i4];
                                    objArr3[0] = C4860.m14172("\"", EnumC15204.f46581.m35967(), "\"");
                                    c3919.m11951(j3, "{0} is expected", objArr3);
                                    throw null;
                                }
                                EnumC15204 enumC15204M44509 = c19317.m44505();
                                if (enumC15204M44509 != EnumC15204.f46477) {
                                    c7776.f6339.m11951(c7776.f6341.f20363, "{0} is expected", C4860.m14172("\"", enumC15204M44509.m35967(), "\""));
                                    throw null;
                                }
                                c7776.f6341.m18126();
                                c7776.f6341.m18132(EnumC15204.f46608);
                                c19317.f60735 = new C5868();
                                C6615 c66128 = c7776.f6341;
                                if (c66128.f20355 == EnumC15204.f46611) {
                                    if (c66128.f20350.equals(EnumC15204.f46583.m35967() + EnumC15204.f46618.m35967())) {
                                        c7776.f6341.m18126();
                                    } else {
                                        c7776.f6341.m18134(EnumC15204.f46583);
                                        while (true) {
                                            c66110 = c7776.f6341;
                                            enumC152012 = c66110.f20355;
                                            if (enumC152012 == EnumC15204.f46554) {
                                                enumC152013 = EnumC15204.f46479;
                                                if (enumC152012 == enumC152013) {
                                                    c66110.m18126();
                                                    c7776.f6341.m18134(EnumC15204.f46618);
                                                } else if (enumC152012 == EnumC15204.f46611 || !c66110.f20350.equals(EnumC15204.f46618.m35967())) {
                                                    c7776.f6340.m28688(c19317.f60735);
                                                    c66111 = c7776.f6341;
                                                    enumC152014 = c66111.f20355;
                                                    if (enumC152014 != EnumC15204.f46591) {
                                                        c66111.m18126();
                                                    } else if (enumC152014 == enumC152013) {
                                                        c7776.f6339.m11951(c66111.f20363, "\"{0}\" token is expected", enumC152013.m35967());
                                                        throw null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    c7776.f6341.m18134(EnumC15204.f46583);
                                    while (true) {
                                        c66110 = c7776.f6341;
                                        enumC152012 = c66110.f20355;
                                        if (enumC152012 == EnumC15204.f46554) {
                                            enumC152013 = EnumC15204.f46479;
                                            if (enumC152012 == enumC152013) {
                                                c66110.m18126();
                                                c7776.f6341.m18134(EnumC15204.f46618);
                                            } else {
                                                if (enumC152012 == EnumC15204.f46611) {
                                                }
                                                c7776.f6340.m28688(c19317.f60735);
                                                c66111 = c7776.f6341;
                                                enumC152014 = c66111.f20355;
                                                if (enumC152014 != EnumC15204.f46591) {
                                                    c66111.m18126();
                                                } else if (enumC152014 == enumC152013) {
                                                    c7776.f6339.m11951(c66111.f20363, "\"{0}\" token is expected", enumC152013.m35967());
                                                    throw null;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (c19317.m44505() == null) {
                                    arrayList3.add(c19317);
                                    i4 = 1;
                                    c19317 = null;
                                } else {
                                    i4 = 1;
                                }
                                break;
                                break;
                        }
                    }
                }
                c8818.m22778(arrayList3);
            } else {
                c6615.m18132(EnumC15204.f46479);
            }
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m28669() throws Throwable {
        this.f6341.m18126();
        this.f6341.m18132(EnumC15204.f46642);
        int i = 1;
        Object[] objArr = {EnumC15204.f46543};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        C11003.requireNonNull(obj);
        arrayList.add(obj);
        List listUnmodifiableList = C20195.unmodifiableList(arrayList);
        int i2 = 10;
        ArrayList arrayList2 = new ArrayList(10);
        Throwable th = null;
        C15869 c15869M28643 = null;
        while (true) {
            int i3 = C13148.f39311[this.f6341.f20355.ordinal()];
            if (i3 != i) {
                if (i3 != 32) {
                    if (i3 != 33) {
                        String str = (String) C5378.stream(listUnmodifiableList).map(new C4563(i2)).collect(C22976.joining(", "));
                        C3917 c3917 = this.f6339;
                        long j = this.f6341.f20363;
                        String str2 = listUnmodifiableList.size() != i ? "One of {0} tokens is expected" : "\"{0}\" token is expected";
                        Object[] objArr2 = new Object[i];
                        objArr2[0] = str;
                        c3917.m11951(j, str2, objArr2);
                        throw th;
                    }
                    if (listUnmodifiableList.contains(this.f6341.f20355)) {
                        if (c15869M28643 != null) {
                            this.f35026.m33156(new C9582(c15869M28643, arrayList2));
                        }
                        this.f6341.m18126();
                        return;
                    } else {
                        C3917 c3918 = this.f6339;
                        long j2 = this.f6341.f20363;
                        Object[] objArr3 = new Object[i];
                        objArr3[0] = EnumC15204.f46442.m35967();
                        c3918.m11951(j2, "\"{0}\" token is expected", objArr3);
                        throw th;
                    }
                }
                if (!listUnmodifiableList.contains(this.f6341.f20355)) {
                    Throwable th2 = th;
                    this.f6339.m11951(this.f6341.f20363, "\"{0}\" token is not expected", EnumC15204.f46450.m35967());
                    throw th2;
                }
                this.f6341.m18126();
                this.f6341.m18132(EnumC15204.f46597);
                C23732 c23732 = this.f35025;
                c23732.m52386();
                ArrayList arrayList3 = new ArrayList(i2);
                Object[] objArr4 = new Object[3];
                objArr4[0] = EnumC15204.f46579;
                objArr4[i] = EnumC15204.f46611;
                objArr4[2] = EnumC15204.f46533;
                ArrayList arrayList4 = new ArrayList(3);
                int iM23073 = 0;
                while (iM23073 < 3) {
                    Object obj2 = objArr4[iM23073];
                    iM23073 = C8954.m23073(obj2, arrayList4, obj2, iM23073, i);
                }
                List listUnmodifiableList2 = C20195.unmodifiableList(arrayList4);
                while (true) {
                    EnumC15204 enumC15204 = this.f6341.f20355;
                    EnumC15204 enumC15205 = EnumC15204.f46579;
                    EnumC15204 enumC15206 = EnumC15204.f46611;
                    if (!enumC15204.m35961(enumC15205, enumC15206, EnumC15204.f46533)) {
                        EnumC15204 enumC15207 = this.f6341.f20355;
                        EnumC15204 enumC15208 = EnumC15204.f46591;
                        if (enumC15207 != enumC15208) {
                            EnumC15204 enumC15209 = EnumC15204.f46479;
                            if (enumC15207 != enumC15209) {
                                if (arrayList3.isEmpty()) {
                                    this.f6339.m11951(this.f6341.f20363, "BootstrapMethod argument is expected", new Object[0]);
                                    throw null;
                                }
                                this.f6339.m11951(this.f6341.f20363, "One of {0} tokens is expected", (String) C5378.stream(listUnmodifiableList2).map(new C4563(10)).collect(C22976.joining(", ")));
                                throw null;
                            }
                            if (!listUnmodifiableList2.contains(enumC15207)) {
                                this.f6339.m11951(this.f6341.f20363, "\"{0}\" token is not expected", enumC15209.m35967());
                                throw null;
                            }
                            c23732.m52384();
                            this.f6341.m18126();
                            this.f35026.m33156(new C9582(c15869M28643, arrayList3));
                            arrayList2 = new ArrayList(10);
                            Object[] objArr5 = {EnumC15204.f46543, EnumC15204.f46442};
                            ArrayList arrayList5 = new ArrayList(2);
                            int iM23074 = 0;
                            while (iM23074 < 2) {
                                Object obj3 = objArr5[iM23074];
                                iM23074 = C8954.m23073(obj3, arrayList5, obj3, iM23074, 1);
                            }
                            listUnmodifiableList = C20195.unmodifiableList(arrayList5);
                            i = 1;
                            i2 = 10;
                            th = null;
                            c15869M28643 = null;
                            break;
                        }
                        if (!listUnmodifiableList2.contains(enumC15207)) {
                            this.f6339.m11951(this.f6341.f20363, "\"{0}\" token is not expected", enumC15208.m35967());
                            throw null;
                        }
                        this.f6341.m18126();
                        Object[] objArr6 = {enumC15205, enumC15206};
                        ArrayList arrayList6 = new ArrayList(2);
                        int iM23075 = 0;
                        while (iM23075 < 2) {
                            Object obj4 = objArr6[iM23075];
                            iM23075 = C8954.m23073(obj4, arrayList6, obj4, iM23075, 1);
                        }
                        listUnmodifiableList2 = C20195.unmodifiableList(arrayList6);
                    } else {
                        if (!listUnmodifiableList2.contains(this.f6341.f20355)) {
                            this.f6339.m11951(this.f6341.f20363, "BootstrapMethod argument is not expected", new Object[0]);
                            throw null;
                        }
                        arrayList3.add(c23732.m52383(null, null, false));
                        Object[] objArr7 = {EnumC15204.f46591, EnumC15204.f46479};
                        ArrayList arrayList7 = new ArrayList(2);
                        int iM23076 = 0;
                        while (iM23076 < 2) {
                            Object obj5 = objArr7[iM23076];
                            iM23076 = C8954.m23073(obj5, arrayList7, obj5, iM23076, 1);
                        }
                        listUnmodifiableList2 = C20195.unmodifiableList(arrayList7);
                    }
                }
            } else {
                if (!listUnmodifiableList.contains(this.f6341.f20355)) {
                    this.f6339.m11951(this.f6341.f20363, "\"{0}\" token is expected", EnumC15204.f46543.m35967());
                    throw null;
                }
                if (c15869M28643 != null) {
                    this.f35026.m33156(new C9582(c15869M28643, arrayList2));
                }
                C6615 c6615 = this.f6341;
                EnumC15204 enumC152010 = EnumC15204.f46543;
                c6615.m18132(enumC152010);
                C6615 c6616 = this.f6341;
                int i4 = c6616.f20360;
                c6616.m18132(EnumC15204.f46597);
                c15869M28643 = m28643();
                C6615 c6617 = this.f6341;
                if (c6617.f20355 == EnumC15204.f46579) {
                    c6617.m18126();
                    this.f6341.m18132(EnumC15204.f46479);
                }
                Object[] objArr8 = {EnumC15204.f46450, enumC152010, EnumC15204.f46442};
                ArrayList arrayList8 = new ArrayList(3);
                int iM23077 = 0;
                while (iM23077 < 3) {
                    Object obj6 = objArr8[iM23077];
                    iM23077 = C8954.m23073(obj6, arrayList8, obj6, iM23077, 1);
                }
                listUnmodifiableList = C20195.unmodifiableList(arrayList8);
                i = 1;
                th = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m28661() {
        ArrayList arrayList = new ArrayList(256);
        C15869 c15869M28643 = m28643();
        C6615 c6615 = this.f6341;
        EnumC15204 enumC15204 = c6615.f20355;
        EnumC15204 enumC15205 = EnumC15204.f46642;
        if (enumC15204 != enumC15205) {
            c6615.m18126();
        }
        C6615 c6616 = this.f6341;
        EnumC15204 enumC15206 = c6616.f20355;
        EnumC15204 enumC15207 = EnumC15204.f46479;
        C23732 c23732 = this.f35025;
        if (enumC15206 == enumC15207) {
            c6616.m18126();
            C6615 c6617 = this.f6341;
            if (c6617.f20355 == enumC15205) {
                c6617.m18126();
                c23732.m52386();
                if (this.f6341.f20355 == EnumC15204.f46442) {
                    this.f35026.m33156(new C9582(c15869M28643, Collections.EMPTY_LIST));
                    this.f6341.m18126();
                    return;
                }
                while (true) {
                    arrayList.add(c23732.m52383(null, null, false));
                    EnumC15204 enumC15208 = this.f6341.f20355;
                    EnumC15204 enumC15209 = EnumC15204.f46591;
                    EnumC15204 enumC152010 = EnumC15204.f46479;
                    if (!enumC15208.m35961(enumC15209, enumC152010)) {
                        C6615 c6618 = this.f6341;
                        EnumC15204 enumC152011 = c6618.f20355;
                        EnumC15204 enumC152012 = EnumC15204.f46442;
                        if (enumC152011 == enumC152012) {
                            c23732.m52384();
                            this.f6341.m18126();
                            break;
                        }
                        this.f6339.m11951(c6618.f20363, "One of {0} tokens is expected", enumC15209.m35962() + ", " + enumC152010.m35962() + ", or " + enumC152012.m35962());
                        throw null;
                    }
                    this.f6341.m18126();
                    if (this.f6341.f20355 == EnumC15204.f46442) {
                        c23732.m52384();
                        this.f6341.m18126();
                        break;
                    }
                }
            }
            this.f35026.m33156(new C9582(c15869M28643, arrayList));
        }
        C6615 c6619 = this.f6341;
        EnumC15204 enumC152013 = c6619.f20355;
        if (enumC152013 == EnumC15204.f46642) {
            c6619.m18126();
            c23732.m52386();
            if (this.f6341.f20355 == EnumC15204.f46442) {
                this.f35026.m33156(new C9582(c15869M28643, Collections.EMPTY_LIST));
                this.f6341.m18126();
                return;
            }
            do {
                arrayList.add(c23732.m52383(null, null, false));
                EnumC15204 enumC152014 = this.f6341.f20355;
                EnumC15204 enumC152015 = EnumC15204.f46591;
                EnumC15204 enumC152016 = EnumC15204.f46479;
                if (enumC152014.m35961(enumC152015, enumC152016)) {
                    this.f6341.m18126();
                } else {
                    C6615 c66110 = this.f6341;
                    EnumC15204 enumC152017 = c66110.f20355;
                    EnumC15204 enumC152018 = EnumC15204.f46442;
                    if (enumC152017 != enumC152018) {
                        this.f6339.m11951(c66110.f20363, "One of {0} tokens is expected", enumC152015.m35962() + ", " + enumC152016.m35962() + ", or " + enumC152018.m35962());
                        throw null;
                    }
                    c23732.m52384();
                    this.f6341.m18126();
                }
                this.f35026.m33156(new C9582(c15869M28643, arrayList));
                return;
            } while (this.f6341.f20355 != EnumC15204.f46442);
            c23732.m52384();
            this.f6341.m18126();
            this.f35026.m33156(new C9582(c15869M28643, arrayList));
            return;
        }
        if (enumC152013 != EnumC15204.f46579) {
            return;
        }
        arrayList.add(this.f35012.m9311(c6619.f20360));
        this.f6341.m18126();
        while (true) {
            C6615 c66111 = this.f6341;
            EnumC15204 enumC152019 = c66111.f20355;
            if (enumC152019 == EnumC15204.f46479) {
                this.f35026.m33156(new C9582(c15869M28643, arrayList));
                return;
            } else {
                if (enumC152019 != EnumC15204.f46579) {
                    this.f6339.m11951(c66111.f20363, "invalid.bootstrapmethod", new Object[0]);
                    throw null;
                }
                arrayList.add(this.f35012.m9311(c66111.f20360));
                this.f6341.m18126();
            }
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private C15869 m28643() {
        C15869 c15869M28681;
        C6615 c6615 = this.f6341;
        EnumC15204 enumC15204 = c6615.f20355;
        EnumC15204 enumC15205 = EnumC15204.f46579;
        if (enumC15204 == enumC15205) {
            return this.f35012.m9311(c6615.f20360);
        }
        EnumC16575 enumC16575M28695 = this.f6340.m28695();
        this.f6341.m18132(EnumC15204.f46597);
        C6615 c6616 = this.f6341;
        if (c6616.f20355 == enumC15205) {
            c15869M28681 = this.f35012.m9311(c6616.f20360);
            this.f6341.m18126();
        } else {
            c15869M28681 = this.f6340.m28681(enumC16575M28695);
        }
        this.f6341.m18132(EnumC15204.f46479);
        return c15869M28681;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m28652(Consumer consumer) {
        C6615 c6615 = this.f6341;
        if (c6615.f20355 == EnumC15204.f46597) {
            c6615.m18126();
        }
        consumer.n(this.f35025.m52383(EnumC10932.f32947, null, true));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m28677() {
        C3046 c3046 = this.f35012;
        EnumC4662 enumC4662 = EnumC4662.f14819;
        c3046.m9312(enumC4662.m13646());
        final String strM45776 = this.f6339.m45776();
        C15869 c15869M9313 = this.f35012.m9313(new Function() { // from class: l.ۘܰۚ
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
                Boolean bool;
                String str = (String) obj;
                boolean z = false;
                if (str.contains(strM45776)) {
                    Object[] objArr = {".java", ".jcod", ".jasm", ".class"};
                    ArrayList arrayList = new ArrayList(4);
                    int iM23073 = 0;
                    while (iM23073 < 4) {
                        Object obj2 = objArr[iM23073];
                        iM23073 = C8954.m23073(obj2, arrayList, obj2, iM23073, 1);
                    }
                    Iterator it = C20195.unmodifiableList(arrayList).iterator();
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
        String str = c15869M9313 != null ? (String) c15869M9313.f49042.f7866 : null;
        C15869 c15869M28690 = m28690();
        if (c15869M28690.f49042 == null && c15869M28690.f20943 != -1) {
            throw C19462.m44860(this.f6339, this.f6341.f20364, "SourceFile attribute incorrectly points to the ConstantPool", new Object[0]);
        }
        c15869M28690.toString();
        if (str != null && !str.equals(c15869M28690.f49042.f7866)) {
            this.f6339.mo11949(this.f6341.f20364, "The \"{0}\" attribute is already declared in the constant pool structure. A new value \"{1}\" is used.", enumC4662.m13646(), c15869M28690.f49042.f7866);
        }
        C13813 c13813 = this.f35026;
        c13813.f41211 = new C19460(c13813.f37150, enumC4662, c15869M28690);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x013f A[Catch: IllegalArgumentException -> 0x015d, TRY_LEAVE, TryCatch #1 {IllegalArgumentException -> 0x015d, blocks: (B:50:0x0135, B:52:0x013f, B:55:0x0155, B:56:0x015c), top: B:61:0x0135 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0155 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m28676() {
        int i;
        C13813 c13813 = this.f35026;
        C9438 c9438 = new C9438(c13813.f37150, EnumC4662.f14810);
        c9438.f28618 = new StringBuilder();
        c9438.f28620 = new ArrayList();
        c9438.f28619 = EnumC20727.NONE;
        c13813.f41201 = c9438;
        this.f6341.m18132(EnumC15204.f46642);
        boolean zIsEmpty = true;
        boolean z = true;
        while (true) {
            int i2 = C13148.f39311[this.f6341.f20355.ordinal()];
            if (i2 == 1) {
                try {
                    i = this.f6341.f20360;
                    if (c9438.f28619 != EnumC20727.UTF8) {
                        throw new IllegalArgumentException("The byte representation of the string is expected.");
                    }
                    c9438.f28620.add(Byte.valueOf((byte) i));
                    c9438.f28619 = EnumC20727.BYTE;
                    z = false;
                } catch (IllegalArgumentException unused) {
                    throw C19462.m44860(this.f6339, this.f6341.f20363, "\"{0}\" token is expected", new Object[]{EnumC15204.f46647.m35967()});
                }
            } else if (i2 != 30) {
                switch (i2) {
                    case 33:
                        if (!z) {
                            throw C19462.m44860(this.f6339, this.f6341.f20363, "\"{0}\" token is expected", new Object[]{EnumC15204.f46479.m35967()});
                        }
                        int iOrdinal = c9438.f28619.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                if (iOrdinal != 2) {
                                    throw new IncompatibleClassChangeError();
                                }
                                zIsEmpty = c9438.f28620.isEmpty();
                            } else if (c9438.f28618.length() != 0) {
                                zIsEmpty = false;
                            }
                        }
                        if (zIsEmpty) {
                            this.f6339.mo11949(this.f6341.f20363, "The SourceDebugExtension attribute has the empty debug_extension structure.", new Object[0]);
                        }
                        this.f6341.m18126();
                        return;
                    case 34:
                    case 35:
                        i = this.f6341.f20360;
                        if (c9438.f28619 != EnumC20727.UTF8) {
                            throw new IllegalArgumentException("The byte representation of the string is expected.");
                        }
                        c9438.f28620.add(Byte.valueOf((byte) i));
                        c9438.f28619 = EnumC20727.BYTE;
                        break;
                        break;
                    case 36:
                        if (!z) {
                            throw C19462.m44860(this.f6339, this.f6341.f20363, "\"{0}\" token is expected", new Object[]{EnumC15204.f46479.m35967()});
                        }
                        try {
                            String str = this.f6341.f20350;
                            if (c9438.f28619 == EnumC20727.BYTE) {
                                throw new IllegalArgumentException("The valid modified UTF-8 string is expected.");
                            }
                            c9438.f28618.append(str);
                            c9438.f28619 = EnumC20727.UTF8;
                        } catch (IllegalArgumentException unused2) {
                            throw C19462.m44860(this.f6339, this.f6341.f20363, "\"{0}\" token is expected", new Object[]{EnumC15204.f46488.m35967()});
                        }
                        break;
                        break;
                    default:
                        if (z) {
                            this.f6339.mo9065(this.f6341.f20363, "Either \"{0}\" or \"{1}\" token is expected", EnumC15204.f46647.m35967(), EnumC15204.f46442.m35967());
                        } else {
                            this.f6339.mo9065(this.f6341.f20363, "\"{0}\" token is expected", EnumC15204.f46479.m35967());
                        }
                        throw new C12136();
                }
                z = false;
            } else {
                if (z) {
                    throw C19462.m44860(this.f6339, this.f6341.f20363, "\"{0}\" token is expected", new Object[]{(c9438.f28619 == EnumC20727.BYTE ? EnumC15204.f46488 : EnumC15204.f46647).m35967()});
                }
                z = true;
            }
            this.f6341.m18126();
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m28644() {
        C15869 c15869M28682 = m28682(true);
        if (!c15869M28682.m37607().m27255(EnumC10932.f32926, EnumC10932.f32947)) {
            m28650("Either a class name or Constant Pool index expected, got {0}");
            throw null;
        }
        this.f35026.m33161(c15869M28682);
        c15869M28682.toString();
        this.f6341.m18132(EnumC15204.f46479);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m28666(Consumer consumer) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            C15869 c15869M28682 = m28682(true);
            if (!c15869M28682.m37607().m27255(EnumC10932.f32926, EnumC10932.f32947)) {
                m28650("Either a class name or Constant Pool index expected, got {0}");
                throw null;
            }
            arrayList.add(c15869M28682);
            c15869M28682.toString();
            C6615 c6615 = this.f6341;
            if (c6615.f20355 != EnumC15204.f46591) {
                c6615.m18132(EnumC15204.f46479);
                consumer.n(arrayList);
                return;
            }
            c6615.m18126();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m28653(C4682 c4682) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            C15869 c15869M28690 = m28690();
            if (!c15869M28690.m37607().m27254(EnumC10932.f32926)) {
                m28650("Either a field descriptor or Constant Pool index expected, got {0}");
                throw null;
            }
            arrayList.add(c15869M28690);
            c15869M28690.toString();
            C6615 c6615 = this.f6341;
            if (c6615.f20355 != EnumC15204.f46591) {
                c6615.m18132(EnumC15204.f46479);
                c4682.n(arrayList);
                return;
            }
            c6615.m18126();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m28673() {
        C15869 c15869M9314;
        EnumC10932 enumC10932 = EnumC10932.f32947;
        C23732 c23732 = this.f35025;
        C15869 c15869M52383 = c23732.m52383(enumC10932, null, true);
        C6615 c6615 = this.f6341;
        if (c6615.f20355 == EnumC15204.f46479) {
            this.f35026.m33157(c15869M52383, (C15869) null);
            return;
        }
        c6615.m18132(EnumC15204.f46597);
        if (this.f6341.f20355.m35961(EnumC15204.f46579, EnumC15204.f46543)) {
            int i = this.f6341.f20360;
            c15869M9314 = i != 0 ? this.f35012.m9311(i) : null;
            this.f6341.m18126();
        } else {
            c15869M9314 = this.f35012.m9314(c23732.m52381(EnumC10932.f32943));
        }
        this.f35026.m33157(c15869M52383, c15869M9314);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private void m28660() {
        C15869 c15869M28690;
        this.f6341.m18132(EnumC15204.f46642);
        C1676 c1676M33148 = this.f35026.m33148(this.f6341.f20363);
        while (true) {
            EnumC15204 enumC15204 = this.f6341.f20355;
            if (enumC15204 == EnumC15204.f46442) {
                if (c1676M33148.isEmpty()) {
                    this.f6339.mo11949(this.f6341.f20363, "Record should have at least one component", new Object[0]);
                    this.f35026.m33165();
                }
                this.f6341.m18126();
                return;
            }
            ArrayList arrayListM51696 = enumC15204 == EnumC15204.f46559 ? this.f35022.m51696() : null;
            this.f6341.m18132(EnumC15204.f46646);
            C15869 c15869M28691 = m28690();
            this.f6341.m18132(EnumC15204.f46597);
            C15869 c15869M28692 = m28690();
            int i = C13148.f39311[this.f6341.f20355.ordinal()];
            if (i == 30 || i == 31) {
                this.f6341.m18126();
                C6615 c6615 = this.f6341;
                if (c6615.f20355 == EnumC15204.f46530) {
                    c6615.m18126();
                    c15869M28690 = m28690();
                } else {
                    c1676M33148.m5677(c15869M28691, c15869M28692, null, arrayListM51696);
                }
            } else if (i != 37) {
                c15869M28690 = null;
            } else {
                this.f6341.m18126();
                C6615 c6616 = this.f6341;
                if (c6616.f20355 == EnumC15204.f46530) {
                    c6616.m18126();
                }
                c15869M28690 = m28690();
            }
            c1676M33148.m5677(c15869M28691, c15869M28692, c15869M28690, arrayListM51696);
            EnumC15204 enumC15205 = this.f6341.f20355;
            EnumC15204 enumC15206 = EnumC15204.f46591;
            EnumC15204 enumC15207 = EnumC15204.f46479;
            if (!enumC15205.m35961(enumC15206, enumC15207)) {
                this.f6339.m11951(this.f6341.f20363, "Either \"{0}\" or \"{1}\" token is expected", "<" + enumC15207.m35962() + ">", "<" + enumC15206.m35962() + ">");
                throw null;
            }
            this.f6341.m18126();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m28671(int i) {
        if (i != 0) {
            this.f6339.mo11949(this.f6341.f20363, "Modifier(s) are ignored as they cannot be applied to a group of inner classes", new Object[0]);
        }
        this.f6341.m18132(EnumC15204.f46642);
        while (true) {
            C6615 c6615 = this.f6341;
            if (c6615.f20355 == EnumC15204.f46442) {
                if (this.f35026.f41204 == null) {
                    this.f6339.mo11949(c6615.f20363, "InnerClasses group should have at least one inner class", new Object[0]);
                }
                this.f6341.m18126();
                return;
            }
            m28672(0);
            EnumC15204 enumC15204 = this.f6341.f20355;
            EnumC15204 enumC15205 = EnumC15204.f46591;
            EnumC15204 enumC15206 = EnumC15204.f46479;
            if (!enumC15204.m35961(enumC15205, enumC15206)) {
                this.f6339.m11951(this.f6341.f20363, "Either \"{0}\" or \"{1}\" token is expected", "<" + enumC15206.m35962() + ">", "<" + enumC15205.m35962() + ">");
                throw null;
            }
            this.f6341.m18126();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m28672(int i) {
        C13813 c13813 = this.f35026;
        long j = this.f6341.f20363;
        C3917 c3917 = (C3917) c13813.m30112();
        int iM16950 = EnumC6073.m16950(i, EnumC6073.f18592, EnumC6073.f18612);
        EnumC6073[] enumC6073Arr = EnumC6073.f18620;
        if (((~EnumC6073.m16931(enumC6073Arr)) & iM16950) != 0) {
            c3917.mo11949(j, "Invalid modifier(s) for an inner class {0}", EnumC6073.m16951(iM16950 & (~EnumC6073.m16931(enumC6073Arr)), EnumC20185.INNER_CLASS));
        }
        int iM28686 = m28686();
        if (i != 0 && iM28686 != 0) {
            C3917 c3918 = this.f6339;
            long j2 = this.f6341.f20363;
            String strM16932 = EnumC6073.m16932(i | iM28686, EnumC20185.INNER_CLASS);
            int length = strM16932.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iCodePointAt = strM16932.codePointAt(iCharCount);
                if (!Character.isWhitespace(iCodePointAt)) {
                    break;
                } else {
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
            while (length > iCharCount) {
                int iCodePointBefore = Character.codePointBefore(strM16932, length);
                if (!Character.isWhitespace(iCodePointBefore)) {
                    break;
                } else {
                    length -= Character.charCount(iCodePointBefore);
                }
            }
            c3918.mo11949(j2, "Combined \"{0}\" modifiers apply to the InnerClass", strM16932.substring(iCharCount, length));
        }
        int i2 = i | iM28686;
        EnumC15204 enumC15204 = this.f6341.f20355;
        if (enumC15204 == EnumC15204.f46533) {
            m28665(i2, this.f35012.m9311(0));
            return;
        }
        if (enumC15204 == EnumC15204.f46611 && enumC15204.m35966()) {
            m28647(i2, m28690());
            return;
        }
        C6615 c6615 = this.f6341;
        EnumC15204 enumC15205 = c6615.f20355;
        if (enumC15205 == EnumC15204.f46579) {
            C15869 c15869M9311 = this.f35012.m9311(c6615.f20360);
            if (!(c15869M9311.f49042 instanceof C22096)) {
                m28665(i2, this.f35012.m9311(0));
                return;
            } else {
                this.f6341.m18126();
                m28647(i2, c15869M9311);
                return;
            }
        }
        if (!enumC15205.m35966()) {
            m28658();
            throw null;
        }
        C15869 c15869M9312 = this.f35012.m9312(this.f6341.f20355.m35967());
        this.f6341.m18126();
        m28647(i2, c15869M9312);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m28647(int i, C15869 c15869) {
        C6615 c6615 = this.f6341;
        if (c6615.f20355 == EnumC15204.f46608) {
            c6615.m18126();
            m28665(i, c15869);
        } else {
            m28658();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m28665(int i, C15869 c15869) {
        C15869 c15869M52383;
        EnumC15204 enumC15204 = this.f6341.f20355;
        EnumC15204 enumC15205 = EnumC15204.f46579;
        if (enumC15204 == enumC15205 || enumC15204 == EnumC15204.f46533) {
            C23732 c23732 = this.f35025;
            C15869 c15869M52384 = enumC15204 == enumC15205 ? c23732.m52383(EnumC10932.f32947, null, false) : null;
            C6615 c6615 = this.f6341;
            EnumC15204 enumC15206 = c6615.f20355;
            EnumC15204 enumC15207 = EnumC15204.f46533;
            if (enumC15206 == enumC15207) {
                c6615.m18126();
                c15869M52384 = c23732.m52383(EnumC10932.f32947, null, true);
            }
            C6615 c6616 = this.f6341;
            EnumC15204 enumC15208 = c6616.f20355;
            EnumC15204 enumC15209 = EnumC15204.f46479;
            if (enumC15208 == enumC15209) {
                C15869 c15869M9311 = this.f35012.m9311(0);
                m28648(i, c15869, c15869M52384, c15869M9311);
                this.f35026.m33151(i, c15869, c15869M52384, c15869M9311);
                return;
            }
            if (enumC15208 != EnumC15204.f46565) {
                m28658();
                throw null;
            }
            c6616.m18126();
            C6615 c6617 = this.f6341;
            EnumC15204 enumC152010 = c6617.f20355;
            if (enumC152010 == enumC15207 || enumC152010 == enumC15205) {
                if (enumC152010 == enumC15207) {
                    c6617.m18126();
                    c15869M52383 = c23732.m52383(EnumC10932.f32947, null, true);
                } else {
                    c15869M52383 = null;
                }
                if (this.f6341.f20355 == enumC15205) {
                    c15869M52383 = c23732.m52383(EnumC10932.f32947, null, false);
                }
                if (this.f6341.f20355 == enumC15209) {
                    m28648(i, c15869, c15869M52384, c15869M52383);
                    this.f35026.m33151(i, c15869, c15869M52384, c15869M52383);
                    return;
                } else {
                    m28658();
                    throw null;
                }
            }
            m28658();
            throw null;
        }
        m28658();
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m28648(int i, C15869 c15869, C15869 c158610, C15869 c158611) {
        AbstractC2465 abstractC2465;
        this.f6339.m45775("[" + EnumC6073.m16951(i, EnumC20185.INNER_CLASS) + "], ", new Object[0]);
        if (c15869 != this.f35012.m9311(0) && (abstractC2465 = c15869.f49042) != null) {
            this.f6339.m45775(abstractC2465 + " =\n\t\t", new Object[0]);
        }
        C15869 c158612 = (C15869) ((C17157) c158610.f49042).f7866;
        AbstractC2465 abstractC2466 = c158612.f49042;
        if (abstractC2466 == null) {
            this.f6339.m45775("<#cpx-unresolved> ", new Object[0]);
        } else if (abstractC2466.f7866 == null) {
            this.f6339.m45775("<#cpx-0> ", new Object[0]);
        } else {
            this.f6339.m45775(c158612.f49042.f7866 + " ", new Object[0]);
        }
        if (c158611 != this.f35012.m9311(0) && c158611.f20943 != 0) {
            AbstractC2465 abstractC2467 = ((C15869) ((C17157) c158611.f49042).f7866).f49042;
            if (abstractC2467 == null) {
                this.f6339.m45775("\n\t\tof <#cpx-unresolved>  ", new Object[0]);
            } else {
                C22096 c22096 = (C22096) abstractC2467;
                if (c22096.f7866 == null) {
                    this.f6339.m45775("\n\t\tof <#cpx-0>  ", new Object[0]);
                } else {
                    this.f6339.m45775("\n\t\tof " + ((String) c22096.f7866), new Object[0]);
                }
            }
        }
        this.f6339.m45775("\n", new Object[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28658() {
        throw C19462.m44860(this.f6339, this.f6341.f20363, "Invalid declaration of Inner Class", new Object[0]);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m28654(EnumC15204 enumC15204, EnumC15204 enumC15205) {
        int i = 1;
        while (true) {
            this.f6341.m18126();
            C6615 c6615 = this.f6341;
            EnumC15204 enumC15206 = c6615.f20355;
            if (enumC15206 == enumC15204) {
                i++;
            } else if (enumC15206 == enumC15205) {
                i--;
                if (i == 0) {
                    return;
                }
            } else if (enumC15206 == EnumC15204.f46554) {
                this.f6339.mo9065(c6615.f20363, "Unbalanced parentheses", new Object[0]);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m28664(int i) throws Throwable {
        char c;
        C15869 c15869M52383;
        String str;
        int iM16978 = i;
        C6615 c6615 = this.f6341;
        long j = c6615.f20363;
        if (EnumC6073.m16949(i)) {
            EnumC6073.m16935(EnumC20185.VALUE_OBJECTS);
        }
        int iM16950 = EnumC6073.m16950(iM16978, EnumC6073.f18592, EnumC6073.f18612, EnumC6073.f18625);
        if (EnumC6073.m16964(iM16950, EnumC6073.f18637, EnumC6073.f18621, EnumC6073.f18626)) {
            c6615.f6339.mo11949(c6615.f20363, "Ambiguous use of similar modifiers", new Object[0]);
        }
        EnumC15204 enumC15204 = c6615.f20355;
        EnumC15204 enumC15205 = EnumC15204.f46533;
        if (enumC15204 == enumC15205 || EnumC6073.m16948(iM16950)) {
            c = 0;
        } else {
            c = 0;
            c6615.f6339.mo11949(c6615.f20363, "Expected \"{0}\" or \"{1}\" token; interpreted as \"{2}\"", enumC15205.m35967(), EnumC15204.f46491.m35967(), enumC15205.m35967());
        }
        if (EnumC6073.m16948(iM16950)) {
            if (!EnumC6073.m16952(iM16950)) {
                C3917 c3917 = c6615.f6339;
                long j2 = c6615.f20363;
                Object[] objArr = new Object[1];
                objArr[c] = EnumC6073.m16951(iM16950, EnumC20185.CLASS);
                c3917.mo11949(j2, "\"{0}\": If the ACC_INTERFACE flag is set, the ACC_ABSTRACT flag must also be set", objArr);
            }
            EnumC6073[] enumC6073Arr = new EnumC6073[4];
            enumC6073Arr[c] = EnumC6073.f18613;
            enumC6073Arr[1] = EnumC6073.f18601;
            enumC6073Arr[2] = EnumC6073.f18635;
            enumC6073Arr[3] = EnumC6073.f18593;
            if (EnumC6073.m16938(iM16950, enumC6073Arr)) {
                if (EnumC6073.m16960() == EnumC20185.VALUE_OBJECTS) {
                    C3917 c3918 = c6615.f6339;
                    long j3 = c6615.f20363;
                    Object[] objArr2 = new Object[1];
                    objArr2[c] = EnumC6073.m16951(iM16950, EnumC20185.CLASS);
                    c3918.mo11949(j3, "\"{0}\": If the ACC_INTERFACE flag is set, the ACC_FINAL, ACC_IDENTITY, ACC_ENUM, and ACC_MODULE flags must not be set.", objArr2);
                } else {
                    C3917 c3919 = c6615.f6339;
                    long j4 = c6615.f20363;
                    Object[] objArr3 = new Object[1];
                    objArr3[c] = EnumC6073.m16951(iM16950, EnumC20185.CLASS);
                    c3919.mo11949(j4, "\"{0}\": If the ACC_INTERFACE flag is set, the ACC_FINAL, ACC_SUPER, ACC_ENUM, and ACC_MODULE flags must not be set.", objArr3);
                }
            }
        } else {
            EnumC6073[] enumC6073Arr2 = new EnumC6073[2];
            enumC6073Arr2[c] = EnumC6073.f18615;
            enumC6073Arr2[1] = EnumC6073.f18593;
            if (EnumC6073.m16938(iM16950, enumC6073Arr2)) {
                C3917 c39110 = c6615.f6339;
                long j5 = c6615.f20363;
                Object[] objArr4 = new Object[1];
                objArr4[c] = EnumC6073.m16951(iM16950, EnumC20185.CLASS);
                c39110.mo11949(j5, "\"{0}\": If the ACC_INTERFACE flag is not set ACC_ANNOTATION, and ACC_MODULE flags must not be set.", objArr4);
            }
            if (EnumC6073.m16960() == EnumC20185.VALUE_OBJECTS) {
                EnumC6073[] enumC6073Arr3 = new EnumC6073[3];
                enumC6073Arr3[c] = EnumC6073.f18613;
                enumC6073Arr3[1] = EnumC6073.f18635;
                enumC6073Arr3[2] = EnumC6073.f18617;
                if (!EnumC6073.m16938(iM16950, enumC6073Arr3)) {
                    String strM16951 = EnumC6073.m16951(iM16950, EnumC20185.CLASS);
                    String strConcat = strM16951.isEmpty() ? "ACC_VALUE" : "ACC_VALUE, ".concat(strM16951);
                    C3917 c39111 = c6615.f6339;
                    long j6 = c6615.f20363;
                    Object[] objArr5 = new Object[1];
                    objArr5[c] = strConcat;
                    c39111.mo11949(j6, "\"{0}\": If the ACC_INTERFACE flag is not set a value class must have at least one of its ACC_FINAL, ACC_IDENTITY, or ACC_ABSTRACT flags set", objArr5);
                }
            }
            EnumC6073[] enumC6073Arr4 = EnumC6073.f18634;
            if (!EnumC6073.m16958(iM16950, enumC6073Arr4)) {
                C3917 c39112 = c6615.f6339;
                long j7 = c6615.f20363;
                Object[] objArr6 = new Object[1];
                objArr6[c] = EnumC6073.m16951((~EnumC6073.m16931(enumC6073Arr4)) & iM16950, EnumC20185.CLASS);
                c39112.mo11949(j7, "Invalid modifier(s) for a class: \"{0}\"", objArr6);
            }
        }
        if (EnumC6073.m16937(iM16950, EnumC6073.f18617, EnumC6073.f18613)) {
            C3917 c39113 = c6615.f6339;
            long j8 = c6615.f20363;
            String strM16952 = EnumC6073.m16951(iM16950, EnumC20185.CLASS);
            Object[] objArr7 = new Object[1];
            objArr7[c] = strM16952;
            c39113.mo11949(j8, "\"{0}\": Class cannot be both abstract and final", objArr7);
        }
        ArrayList arrayList = this.f35019;
        if (arrayList != null) {
            this.f35026.m30109(arrayList);
        }
        C6615 c6616 = this.f6341;
        EnumC15204 enumC15206 = c6616.f20355;
        if (enumC15206 == enumC15205) {
            c6616.m18126();
        } else {
            EnumC15204 enumC15207 = EnumC15204.f46559;
            if (enumC15206 == enumC15207) {
                c6616.m18126();
                C6615 c6617 = this.f6341;
                EnumC15204 enumC15208 = c6617.f20355;
                EnumC15204 enumC15209 = EnumC15204.f46491;
                if (enumC15208 != enumC15209) {
                    C3917 c39114 = this.f6339;
                    long j9 = c6617.f20364;
                    String strM35967 = enumC15207.m35967();
                    String strM35968 = enumC15209.m35967();
                    Object[] objArr8 = new Object[2];
                    objArr8[c] = strM35967;
                    objArr8[1] = strM35968;
                    throw C19462.m44860(c39114, j9, "Either \"{0}\" or \"{1}\" token is expected", objArr8);
                }
                iM16978 |= EnumC6073.f18615.m16978() | EnumC6073.f18619.m16978();
                this.f6341.m18126();
            }
        }
        EnumC10932 enumC10932 = EnumC10932.f32947;
        C23732 c23732 = this.f35025;
        C15869 c15869M52384 = c23732.m52383(enumC10932, null, true);
        C6615 c6618 = this.f6341;
        EnumC15204 enumC152010 = c6618.f20355;
        if (enumC152010 == EnumC15204.f46599) {
            c6618.m18126();
            int i2 = C13148.f39311[this.f6341.f20355.ordinal()];
            if (i2 == 2) {
                str = this.f6341.f20350;
            } else if (i2 != 4) {
                if (i2 != 36) {
                    C3917 c39115 = this.f6339;
                    long j10 = this.f6341.f20363;
                    Object[] objArr9 = new Object[1];
                    objArr9[c] = C21639.m48906(this.f6341.f20355, new StringBuilder("\""), "\"");
                    throw C19462.m44860(c39115, j10, "Either name or Constant Pool index expected, got {0}", objArr9);
                }
                str = this.f6341.f20350;
            } else {
                str = this.f6341.f20357;
            }
            this.f6341.m18126();
            this.f35026.f41199 = C20094.m46315(".", str);
        } else {
            if (enumC152010 == EnumC15204.f46443) {
                throw C19462.m44860(this.f6339, c6618.f20364, "\"{0}\" token is expected", new Object[]{C21639.m48906(EnumC15204.f46454, new StringBuilder("\""), "\"")});
            }
            if (enumC152010 == EnumC15204.f46479) {
                c6618.m18126();
            } else if (enumC152010 == EnumC15204.f46597) {
                c6618.m18126();
                C15869 c15869M28690 = m28690();
                c15869M28690.toString();
                this.f35026.m30110(c15869M28690);
            }
        }
        C6615 c6619 = this.f6341;
        if (c6619.f20355 == EnumC15204.f46535) {
            c6619.m18126();
            c15869M52383 = c23732.m52383(enumC10932, null, true);
            while (true) {
                C6615 c66110 = this.f6341;
                if (c66110.f20355 != EnumC15204.f46591) {
                    break;
                }
                c66110.m18126();
                this.f6339.mo11949(j, "Multiple inheritance is not supported", new Object[0]);
                c15869M52383 = c23732.m52383(EnumC10932.f32947, null, true);
            }
        } else {
            c15869M52383 = null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (this.f6341.f20355 == EnumC15204.f46447) {
            do {
                this.f6341.m18126();
                C15869 c15869M52385 = c23732.m52383(EnumC10932.f32947, null, true);
                if (arrayList2.contains(c15869M52385)) {
                    this.f6339.mo11949(j, "Interface {0} repeated", c15869M52385);
                } else {
                    arrayList2.add(c15869M52385);
                }
            } while (this.f6341.f20355 == EnumC15204.f46591);
        }
        EnumC15204 enumC152011 = this.f6341.f20355;
        EnumC15204 enumC152012 = EnumC15204.f46642;
        if (enumC152011 != enumC152012) {
            if (this.f35026.f41195.m50042()) {
                this.f35026.f41195.getClass();
            }
            m28675();
            if (EnumC6073.m16960() == EnumC20185.VALUE_OBJECTS && !this.f35026.f41195.m50041()) {
                this.f6339.mo11949(this.f6341.f20364, "Class file version {0} does not conform to the new kind of objects; expected version {1}", this.f35026.f41195.m50035(), C22301.m50034().m50035());
            }
        } else if (!this.f35026.f41195.m50042()) {
            this.f35026.f41195.getClass();
            this.f35026.f41195.m50039();
            this.f6339.mo11949(this.f6341.f20364, "Class file version not specified in file or by -cv parameter. Defaulting to version \"{0}\"", this.f35026.f41195.m50035());
        }
        this.f6341.m18132(enumC152012);
        C13813 c13813 = this.f35026;
        C22986 c22986 = c13813.f41206;
        c13813.f37140 = iM16978;
        if (EnumC6073.m16936(iM16978)) {
            c13813.m30108();
        }
        EnumC11698 enumC11698 = EnumC11698.HEADER;
        c22986.getClass();
        C6491 c6491 = c22986.f74008;
        C6491 c6492 = c22986.f74006;
        EnumC11698 enumC11699 = EnumC11698.CLASSFILE;
        if (enumC11698 == enumC11699) {
            c6492.f20042 = c15869M52384;
        } else {
            c6491.f20042 = c15869M52384;
        }
        if (enumC11698 == enumC11699) {
            c6492.f20043 = c15869M52383;
        } else {
            c6491.f20043 = c15869M52383;
        }
        c13813.f41209 = arrayList2;
        c13813.f41195.m50039();
        while (true) {
            C6615 c66111 = this.f6341;
            EnumC15204 enumC152013 = c66111.f20355;
            if (enumC152013 == EnumC15204.f46554 || enumC152013 == EnumC15204.f46442) {
                c66111.m18132(EnumC15204.f46442);
                m28662();
                return;
            }
            int[] iArr = C13148.f39311;
            int i3 = iArr[enumC152013.ordinal()];
            if (i3 == 30) {
                this.f6341.m18126();
            } else if (i3 != 44) {
                if (this.f6341.f20355 == EnumC15204.f46559) {
                    this.f35014 = this.f35022.m51696();
                }
                int iM28686 = m28686();
                try {
                    int i4 = iArr[this.f6341.f20355.ordinal()];
                    if (i4 != 29) {
                        switch (i4) {
                            case 53:
                                this.f6341.m18126();
                                m28670(iM28686);
                                break;
                            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                this.f6341.m18126();
                                m28667(iM28686);
                                break;
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                this.f6341.m18126();
                                if (!this.f6341.f20350.equals(EnumC15204.f46466.m35959())) {
                                    m28672(iM28686);
                                } else {
                                    m28671(iM28686);
                                }
                                break;
                            case 56:
                                if (!this.f6341.f20350.equals(EnumC15204.f46475.m35959())) {
                                    this.f6341.m18126();
                                    m28661();
                                } else {
                                    m28669();
                                }
                                break;
                            case 57:
                                this.f6341.m18126();
                                m28652(new C15264(0, this));
                                this.f6341.m18132(EnumC15204.f46479);
                                break;
                            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                this.f6341.m18126();
                                m28652(new Consumer() { // from class: l.᩸ܰۚ
                                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return C23517.$default$andThen(this, consumer);
                                    }

                                    @Override // java.util.function.Consumer
                                    /* JADX INFO: renamed from: accept */
                                    public final void n(Object obj) {
                                        C22986 c22987 = this.f69394.f35026.f41206;
                                        EnumC11698 enumC116910 = EnumC11698.HEADER;
                                        c22987.getClass();
                                        c22987.f74006.f20043 = (C15869) obj;
                                    }
                                });
                                this.f6341.m18132(EnumC15204.f46479);
                                break;
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                this.f35026.m33154(EnumC4662.f14819, this.f6341.f20363);
                                this.f6341.m18126();
                                m28677();
                                this.f6341.m18132(EnumC15204.f46479);
                                break;
                            case 60:
                                this.f35026.m33154(EnumC4662.f14810, this.f6341.f20363);
                                this.f6341.m18126();
                                m28676();
                                break;
                            case 61:
                                C13813 c13814 = this.f35026;
                                c13814.m33154(EnumC4662.f14799, this.f6341.f20363);
                                if (c13814.m33158(EnumC4662.f14798)) {
                                    this.f6339.mo11949(this.f6341.f20363, "The attribute table of a ClassFile structure must not contain both a NestMembers attribute and a NestHost attribute", new Object[0]);
                                }
                                this.f6341.m18126();
                                m28644();
                                break;
                            case 62:
                                C13813 c13815 = this.f35026;
                                c13815.m33154(EnumC4662.f14798, this.f6341.f20363);
                                if (c13815.m33158(EnumC4662.f14799)) {
                                    this.f6339.mo11949(this.f6341.f20363, "The attribute table of a ClassFile structure must not contain both a NestMembers attribute and a NestHost attribute", new Object[0]);
                                }
                                this.f6341.m18126();
                                m28666(new Consumer() { // from class: l.᩹ܰۚ
                                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return C23517.$default$andThen(this, consumer);
                                    }

                                    @Override // java.util.function.Consumer
                                    /* JADX INFO: renamed from: accept */
                                    public final void n(Object obj) {
                                        this.f72343.f35026.m33163((ArrayList) obj);
                                    }
                                });
                                break;
                            case 63:
                                this.f35026.m33154(EnumC4662.f14811, this.f6341.f20363);
                                this.f6341.m18126();
                                m28666(new Consumer() { // from class: l.᩶ܰۚ
                                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return C23517.$default$andThen(this, consumer);
                                    }

                                    @Override // java.util.function.Consumer
                                    /* JADX INFO: renamed from: accept */
                                    public final void n(Object obj) {
                                        this.f65375.f35026.m33166((ArrayList) obj);
                                    }
                                });
                                break;
                            case 64:
                                this.f35026.m33154(EnumC4662.f14787, this.f6341.f20363);
                                this.f6341.m18126();
                                m28660();
                                break;
                            case 65:
                                this.f35026.m33154(EnumC4662.f14802, this.f6341.f20363);
                                this.f6341.m18126();
                                m28653(new C4682(this));
                                break;
                            case 66:
                                this.f35026.m33154(EnumC4662.f14821, this.f6341.f20363);
                                this.f6341.m18126();
                                m28673();
                                break;
                            default:
                                this.f6339.mo9065(this.f6341.f20363, "Class member declaration expected", new Object[0]);
                                C12136 c12136 = new C12136();
                                c12136.m29561();
                                throw c12136;
                        }
                    } else {
                        this.f6341.m18126();
                        this.f35026.m30111(m28690(), this.f6341.f20363);
                        this.f6341.m18132(EnumC15204.f46479);
                    }
                } catch (C12136 e) {
                    if (e.m29560()) {
                        C12136 c12137 = new C12136();
                        c12137.m29561();
                        throw c12137;
                    }
                    while (true) {
                        int i5 = C13148.f39311[this.f6341.f20355.ordinal()];
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
                                                            m28654(EnumC15204.f46642, EnumC15204.f46442);
                                                            this.f6341.m18126();
                                                            break;
                                                        case 40:
                                                            m28654(EnumC15204.f46524, EnumC15204.f46630);
                                                            this.f6341.m18126();
                                                            break;
                                                        case 41:
                                                            m28654(EnumC15204.f46583, EnumC15204.f46618);
                                                            this.f6341.m18126();
                                                            break;
                                                        case 42:
                                                        case 43:
                                                            break;
                                                        default:
                                                            this.f6341.m18126();
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                }
                            }
                        }
                        m28662();
                        String.format("scanner position %d", Long.valueOf(this.f6341.f20363));
                        C12136 c12138 = new C12136();
                        c12138.m29561();
                        throw c12138;
                    }
                }
                this.f35014 = null;
            } else {
                this.f6341.m18126();
                m28657();
                this.f35020 = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C1426 m28659() {
        C1426 c1426 = new C1426();
        C6615 c6615 = this.f6341;
        EnumC15204 enumC15204 = c6615.f20355;
        if (enumC15204 != EnumC15204.f46611) {
            if (enumC15204 != EnumC15204.f46579) {
                throw C20094.m46318(this.f6339, c6615.f20363, "Either a module name or Constant Pool index expected, got {0}", new Object[]{C21639.m48906(this.f6341.f20355, new StringBuilder("\""), "\"")});
            }
            c1426.f20042 = Integer.valueOf(c6615.f20360);
            this.f6341.m18126();
            return c1426;
        }
        String string = "";
        while (this.f6341.f20355.m35968()) {
            c1426.f20043 = ((String) c1426.f20043) + string + this.f6341.f20357;
            this.f6341.m18131();
            EnumC15204 enumC15205 = this.f6341.f20355;
            if (enumC15205 != EnumC15204.f46599) {
                return c1426;
            }
            string = Character.toString((char) enumC15205.m35965());
            this.f6341.m18131();
        }
        throw C20094.m46318(this.f6339, this.f6341.f20363, "Either a module name or Constant Pool index expected, got {0}", new Object[]{C21639.m48906(this.f6341.f20355, new StringBuilder("\""), "\"")});
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m28678(int i) {
        C6615 c6615;
        int iM16978;
        if (i != 0) {
            this.f6339.mo11949(this.f6341.f20363, "The class access modifier(s) {0} ignored", EnumC6073.m16951(i, EnumC20185.MODULE));
        }
        ArrayList arrayList = this.f35019;
        if (arrayList != null) {
            this.f35026.m30109(arrayList);
        }
        C5660 c5660 = new C5660(this.f35026);
        this.f35023 = c5660;
        if (this.f6341.f20355 == EnumC15204.f46454) {
            c5660.m15975();
            this.f6341.m18126();
        }
        C6615 c6616 = this.f6341;
        EnumC15204 enumC15204 = c6616.f20355;
        EnumC15204 enumC15205 = EnumC15204.f46443;
        if (enumC15204 != enumC15205) {
            throw C20094.m46318(this.f6339, c6616.f20363, "\"{0}\" token is expected", new Object[]{enumC15205.m35967()});
        }
        c6616.m18131();
        C1426 c1426M28659 = m28659();
        if (c1426M28659.m4930()) {
            throw C20094.m46318(this.f6339, this.f6341.f20363, "Either name or Constant Pool index expected, got {0}", new Object[]{"\"" + this.f6341.f20355 + "\""});
        }
        if (c1426M28659.m4929() != 0) {
            this.f35023.m15973(c1426M28659.m4929());
        } else {
            this.f35023.m15974((String) c1426M28659.f20043);
        }
        EnumC15204 enumC15206 = this.f6341.f20355;
        EnumC15204 enumC15207 = EnumC15204.f46642;
        if (enumC15206 == enumC15207) {
            C22301 c22301 = this.f35026.f41195;
            if (!c22301.m50042()) {
                c22301.m50037(53, 0);
            }
            this.f6339.mo11949(this.f6341.f20363, "Class file version not specified in file or by -cv parameter. Defaulting to version \"{0}\"", this.f35026.f41195.m50035());
        } else {
            m28675();
        }
        this.f6341.m18132(enumC15207);
        C13813 c13813 = this.f35026;
        c13813.getClass();
        c13813.f37140 = EnumC6073.f18593.m16978();
        C22986 c22986 = c13813.f41206;
        EnumC11698 enumC11698 = EnumC11698.HEADER;
        C15869 c15869 = new C15869(0, null);
        c22986.getClass();
        if (enumC11698 == EnumC11698.CLASSFILE) {
            c22986.f74006.f20043 = c15869;
        } else {
            c22986.f74008.f20043 = c15869;
        }
        C22301 c22302 = c13813.f41195;
        if (!c22302.m50042()) {
            c22302.m50037(53, 0);
        }
        while (true) {
            c6615 = this.f6341;
            EnumC15204 enumC15208 = c6615.f20355;
            if (enumC15208 != EnumC15204.f46554 && enumC15208 != EnumC15204.f46442) {
                int i2 = C13148.f39311[enumC15208.ordinal()];
                if (i2 != 30) {
                    switch (i2) {
                        case 44:
                            this.f6341.m18126();
                            m28657();
                            this.f35020 = true;
                            break;
                        case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                            C22966 c22966 = this.f35023.f17476;
                            C1426 c1426 = new C1426();
                            this.f6341.m18131();
                            int i3 = 0;
                            while (true) {
                                EnumC15204 enumC15209 = this.f6341.f20355;
                                if (enumC15209 == EnumC15204.f46479) {
                                    if (!c1426.m4930()) {
                                        c22966.n(new C0569((String) c1426.f20043, c1426.m4929(), i3, null));
                                        this.f6341.m18131();
                                        break;
                                    }
                                    throw C20094.m46318(this.f6339, this.f6341.f20363, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new Object[0]);
                                }
                                int i4 = C13148.f39311[enumC15209.ordinal()];
                                if (i4 != 3 && i4 != 4) {
                                    if (i4 != 8) {
                                        if (i4 != 23) {
                                            if (i4 != 26) {
                                                if (i4 != 50) {
                                                    throw C20094.m46318(this.f6339, this.f6341.f20363, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new Object[0]);
                                                }
                                                if (EnumC6073.m16955(i3) || !c1426.m4930()) {
                                                    throw C20094.m46318(this.f6339, this.f6341.f20363, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new Object[0]);
                                                }
                                                iM16978 = EnumC6073.f18629.m16978();
                                            } else {
                                                if (EnumC6073.m16946(i3) || !c1426.m4930()) {
                                                    throw C20094.m46318(this.f6339, this.f6341.f20363, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new Object[0]);
                                                }
                                                iM16978 = EnumC6073.f18604.m16978();
                                            }
                                        } else {
                                            if (EnumC6073.m16941(i3) || !c1426.m4930()) {
                                                throw C20094.m46318(this.f6339, this.f6341.f20363, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new Object[0]);
                                            }
                                            iM16978 = EnumC6073.f18595.m16978();
                                        }
                                    } else {
                                        if (EnumC6073.m16959(i3) || !c1426.m4930()) {
                                            throw C20094.m46318(this.f6339, this.f6341.f20363, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new Object[0]);
                                        }
                                        iM16978 = EnumC6073.f18632.m16978();
                                    }
                                    i3 |= iM16978;
                                    this.f6341.m18131();
                                } else {
                                    if (!c1426.m4930()) {
                                        throw C20094.m46318(this.f6339, this.f6341.f20363, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new Object[0]);
                                    }
                                    c1426 = m28659();
                                }
                            }
                            break;
                        case 46:
                            m28651(this.f35023.f17468, new InterfaceC6093() { // from class: l.ۢܰۚ
                                @Override // l.InterfaceC6093
                                public final C1426 get() {
                                    C11738 c11738 = this.f29168;
                                    C6615 c6617 = c11738.f6341;
                                    EnumC15204 enumC152010 = c6617.f20355;
                                    String string = "";
                                    int i5 = 0;
                                    if (enumC152010 == EnumC15204.f46611) {
                                        String str = "";
                                        while (c11738.f6341.f20355.m35964()) {
                                            StringBuilder sbM19190 = C7166.m19190(string, str);
                                            sbM19190.append(c11738.f6341.f20357);
                                            string = sbM19190.toString();
                                            c11738.f6341.m18126();
                                            C6615 c6618 = c11738.f6341;
                                            if (c6618.f20355 == EnumC15204.f46599) {
                                                c11738.f6339.mo11949(c6618.f20363, "Forward slash \"/\" expected instead of dot \".\". The dot is replaced by \"/\"", new Object[0]);
                                                c11738.f6341.m18126();
                                                str = "/";
                                            }
                                        }
                                        throw C19462.m44860(c11738.f6339, c11738.f6341.f20363, "Either name or Constant Pool index expected, got {0}", new Object[]{C21639.m48906(c11738.f6341.f20355, new StringBuilder("\""), "\"")});
                                    }
                                    if (enumC152010 == EnumC15204.f46579) {
                                        i5 = c6617.f20360;
                                        c6617.m18126();
                                    }
                                    return new C1426(Integer.valueOf(i5), string);
                                }
                            }, new InterfaceC6093() { // from class: l.ۚܰۚ
                                @Override // l.InterfaceC6093
                                public final C1426 get() {
                                    return this.f16741.m28659();
                                }
                            }, EnumC15204.f46483, true, "Module statement \"exports [mandated | synthetic] PackageName [to ModuleName(1)[,ModuleName(2)[...]]];\" expected");
                            break;
                        case 47:
                            m28651(this.f35023.f17469, new InterfaceC6093() { // from class: l.ۢܰۚ
                                @Override // l.InterfaceC6093
                                public final C1426 get() {
                                    C11738 c11738 = this.f29168;
                                    C6615 c6617 = c11738.f6341;
                                    EnumC15204 enumC152010 = c6617.f20355;
                                    String string = "";
                                    int i5 = 0;
                                    if (enumC152010 == EnumC15204.f46611) {
                                        String str = "";
                                        while (c11738.f6341.f20355.m35964()) {
                                            StringBuilder sbM19190 = C7166.m19190(string, str);
                                            sbM19190.append(c11738.f6341.f20357);
                                            string = sbM19190.toString();
                                            c11738.f6341.m18126();
                                            C6615 c6618 = c11738.f6341;
                                            if (c6618.f20355 == EnumC15204.f46599) {
                                                c11738.f6339.mo11949(c6618.f20363, "Forward slash \"/\" expected instead of dot \".\". The dot is replaced by \"/\"", new Object[0]);
                                                c11738.f6341.m18126();
                                                str = "/";
                                            }
                                        }
                                        throw C19462.m44860(c11738.f6339, c11738.f6341.f20363, "Either name or Constant Pool index expected, got {0}", new Object[]{C21639.m48906(c11738.f6341.f20355, new StringBuilder("\""), "\"")});
                                    }
                                    if (enumC152010 == EnumC15204.f46579) {
                                        i5 = c6617.f20360;
                                        c6617.m18126();
                                    }
                                    return new C1426(Integer.valueOf(i5), string);
                                }
                            }, new InterfaceC6093() { // from class: l.ۚܰۚ
                                @Override // l.InterfaceC6093
                                public final C1426 get() {
                                    return this.f16741.m28659();
                                }
                            }, EnumC15204.f46483, true, "Module statement \"opens [mandated | synthetic] PackageName [to ModuleName(1)[,ModuleName(2)[...]]];\" expected");
                            break;
                        case 48:
                            m28651(this.f35023.f17471, new InterfaceC6093() { // from class: l.ۢܰۚ
                                @Override // l.InterfaceC6093
                                public final C1426 get() {
                                    C11738 c11738 = this.f29168;
                                    C6615 c6617 = c11738.f6341;
                                    EnumC15204 enumC152010 = c6617.f20355;
                                    String string = "";
                                    int i5 = 0;
                                    if (enumC152010 == EnumC15204.f46611) {
                                        String str = "";
                                        while (c11738.f6341.f20355.m35964()) {
                                            StringBuilder sbM19190 = C7166.m19190(string, str);
                                            sbM19190.append(c11738.f6341.f20357);
                                            string = sbM19190.toString();
                                            c11738.f6341.m18126();
                                            C6615 c6618 = c11738.f6341;
                                            if (c6618.f20355 == EnumC15204.f46599) {
                                                c11738.f6339.mo11949(c6618.f20363, "Forward slash \"/\" expected instead of dot \".\". The dot is replaced by \"/\"", new Object[0]);
                                                c11738.f6341.m18126();
                                                str = "/";
                                            }
                                        }
                                        throw C19462.m44860(c11738.f6339, c11738.f6341.f20363, "Either name or Constant Pool index expected, got {0}", new Object[]{C21639.m48906(c11738.f6341.f20355, new StringBuilder("\""), "\"")});
                                    }
                                    if (enumC152010 == EnumC15204.f46579) {
                                        i5 = c6617.f20360;
                                        c6617.m18126();
                                    }
                                    return new C1426(Integer.valueOf(i5), string);
                                }
                            }, new InterfaceC6093() { // from class: l.ۢܰۚ
                                @Override // l.InterfaceC6093
                                public final C1426 get() {
                                    C11738 c11738 = this.f29168;
                                    C6615 c6617 = c11738.f6341;
                                    EnumC15204 enumC152010 = c6617.f20355;
                                    String string = "";
                                    int i5 = 0;
                                    if (enumC152010 == EnumC15204.f46611) {
                                        String str = "";
                                        while (c11738.f6341.f20355.m35964()) {
                                            StringBuilder sbM19190 = C7166.m19190(string, str);
                                            sbM19190.append(c11738.f6341.f20357);
                                            string = sbM19190.toString();
                                            c11738.f6341.m18126();
                                            C6615 c6618 = c11738.f6341;
                                            if (c6618.f20355 == EnumC15204.f46599) {
                                                c11738.f6339.mo11949(c6618.f20363, "Forward slash \"/\" expected instead of dot \".\". The dot is replaced by \"/\"", new Object[0]);
                                                c11738.f6341.m18126();
                                                str = "/";
                                            }
                                        }
                                        throw C19462.m44860(c11738.f6339, c11738.f6341.f20363, "Either name or Constant Pool index expected, got {0}", new Object[]{C21639.m48906(c11738.f6341.f20355, new StringBuilder("\""), "\"")});
                                    }
                                    if (enumC152010 == EnumC15204.f46579) {
                                        i5 = c6617.f20360;
                                        c6617.m18126();
                                    }
                                    return new C1426(Integer.valueOf(i5), string);
                                }
                            }, EnumC15204.f46538, false, "Module statement \"provides ClassName with ClassName(1)[,ClassName(2)[...]]];\" expected");
                            break;
                        case 49:
                            final C11305 c11305 = this.f35023.f17474;
                            HashSet hashSetM28645 = m28645(new InterfaceC10327() { // from class: l.ܺܰۚ
                                @Override // l.InterfaceC10327
                                public final void call() {
                                    this.f49280.f6341.m18126();
                                }
                            }, new InterfaceC6093() { // from class: l.ۢܰۚ
                                @Override // l.InterfaceC6093
                                public final C1426 get() {
                                    C11738 c11738 = this.f29168;
                                    C6615 c6617 = c11738.f6341;
                                    EnumC15204 enumC152010 = c6617.f20355;
                                    String string = "";
                                    int i5 = 0;
                                    if (enumC152010 == EnumC15204.f46611) {
                                        String str = "";
                                        while (c11738.f6341.f20355.m35964()) {
                                            StringBuilder sbM19190 = C7166.m19190(string, str);
                                            sbM19190.append(c11738.f6341.f20357);
                                            string = sbM19190.toString();
                                            c11738.f6341.m18126();
                                            C6615 c6618 = c11738.f6341;
                                            if (c6618.f20355 == EnumC15204.f46599) {
                                                c11738.f6339.mo11949(c6618.f20363, "Forward slash \"/\" expected instead of dot \".\". The dot is replaced by \"/\"", new Object[0]);
                                                c11738.f6341.m18126();
                                                str = "/";
                                            }
                                        }
                                        throw C19462.m44860(c11738.f6339, c11738.f6341.f20363, "Either name or Constant Pool index expected, got {0}", new Object[]{C21639.m48906(c11738.f6341.f20355, new StringBuilder("\""), "\"")});
                                    }
                                    if (enumC152010 == EnumC15204.f46579) {
                                        i5 = c6617.f20360;
                                        c6617.m18126();
                                    }
                                    return new C1426(Integer.valueOf(i5), string);
                                }
                            }, "Module statement \"uses ClassName;\" expected", true);
                            if (hashSetM28645.size() != 1) {
                                throw C20094.m46318(this.f6339, this.f6341.f20363, "Module statement \"uses ClassName;\" expected", new Object[0]);
                            }
                            C19846.forEach(hashSetM28645, new Consumer() { // from class: l.ۖܰۚ
                                public /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return C23517.$default$andThen(this, consumer);
                                }

                                @Override // java.util.function.Consumer
                                /* JADX INFO: renamed from: accept */
                                public final void n(Object obj) {
                                    C1426 c1427 = (C1426) obj;
                                    EnumC12358 enumC12358 = EnumC12358.CONSTANT_NULL;
                                    c11305.n(new C22442(c1427.m4929(), (String) c1427.f20043));
                                }
                            });
                            this.f6341.m18126();
                            break;
                            break;
                        default:
                            throw C20094.m46318(this.f6339, this.f6341.f20363, "Module statement expected", new Object[0]);
                    }
                } else {
                    this.f6341.m18126();
                }
            }
        }
        c6615.m18132(EnumC15204.f46442);
        if (this.f35020) {
            this.f35012.m9333();
            if (this.f35026.f41211 == null) {
                String strM45777 = this.f6339.m45777();
                C13813 c13814 = this.f35026;
                C8732 c8732 = new C8732(c13814.f37150, strM45777);
                c8732.m22573(this.f35026.f37150, new C8916(0));
                c13814.f41211 = c8732;
            }
        } else {
            C13813 c13815 = this.f35026;
            if (c13815.f41211 == null) {
                C3046 c3046 = this.f35012;
                c13815.f41211 = new C19460(c3046, EnumC4662.f14819, c3046.m9312(this.f6339.m45777()));
            }
        }
        this.f35026.m33155(this.f35023);
        this.f35016.add(this.f35026);
        this.f35026 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m28651(BiConsumer biConsumer, InterfaceC6093 interfaceC6093, InterfaceC6093 interfaceC6094, EnumC15204 enumC15204, boolean z, String str) {
        int iM16978;
        boolean z2 = enumC15204 == EnumC15204.f46538;
        C1426 c1426 = new C1426();
        HashSet hashSet = new HashSet();
        this.f6341.m18126();
        int i = 0;
        while (true) {
            EnumC15204 enumC15205 = this.f6341.f20355;
            if (enumC15205 == EnumC15204.f46479) {
                if (c1426.m4930() || (hashSet.isEmpty() && !z)) {
                    throw C20094.m46318(this.f6339, this.f6341.f20363, str, new Object[0]);
                }
                if (z2) {
                    Set set = (Set) C5378.stream(hashSet).map(new C0448()).collect(C22976.toSet());
                    EnumC12358 enumC12358 = EnumC12358.CONSTANT_NULL;
                    biConsumer.accept(new C1275(c1426.m4929(), (String) c1426.f20043, i, EnumC20185.MODULE), set);
                } else {
                    Set set2 = (Set) C5378.stream(hashSet).map(new C8011(8)).collect(C22976.toSet());
                    EnumC12358 enumC12359 = EnumC12358.CONSTANT_NULL;
                    biConsumer.accept(new C1275(c1426.m4929(), (String) c1426.f20043, i, EnumC20185.MODULE), set2);
                }
                this.f6341.m18126();
                return;
            }
            int i2 = C13148.f39311[enumC15205.ordinal()];
            if (i2 != 3 && i2 != 4) {
                if (i2 != 23) {
                    if (i2 != 26) {
                        if (i2 != 51 && i2 != 52) {
                            throw C20094.m46318(this.f6339, this.f6341.f20363, str, new Object[0]);
                        }
                        hashSet = m28645(z2 ? new InterfaceC10327() { // from class: l.ᩴܰۚ
                            @Override // l.InterfaceC10327
                            public final void call() {
                                this.f59318.f6341.m18126();
                            }
                        } : new InterfaceC10327() { // from class: l.᩵ܰۚ
                            @Override // l.InterfaceC10327
                            public final void call() {
                                this.f63021.f6341.m18131();
                            }
                        }, interfaceC6094, str, false);
                    } else {
                        if (EnumC6073.m16946(i) || !c1426.m4930() || z2) {
                            throw C20094.m46318(this.f6339, this.f6341.f20363, str, new Object[0]);
                        }
                        iM16978 = EnumC6073.f18604.m16978();
                    }
                } else {
                    if (EnumC6073.m16941(i) || !c1426.m4930() || z2) {
                        throw C20094.m46318(this.f6339, this.f6341.f20363, str, new Object[0]);
                    }
                    iM16978 = EnumC6073.f18595.m16978();
                }
                i |= iM16978;
                if (z2) {
                    this.f6341.m18126();
                } else {
                    this.f6341.m18131();
                }
            } else {
                if (!c1426.m4930()) {
                    throw C20094.m46318(this.f6339, this.f6341.f20363, str, new Object[0]);
                }
                c1426 = interfaceC6093.get();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private HashSet m28645(InterfaceC10327 interfaceC10327, InterfaceC6093 interfaceC6093, String str, boolean z) {
        HashSet hashSet = new HashSet();
        interfaceC10327.call();
        boolean z2 = false;
        boolean z3 = true;
        while (true) {
            EnumC15204 enumC15204 = this.f6341.f20355;
            if (enumC15204 == EnumC15204.f46479) {
                if (hashSet.isEmpty() || z2) {
                    throw C20094.m46318(this.f6339, this.f6341.f20363, str, new Object[0]);
                }
                return hashSet;
            }
            int i = C13148.f39311[enumC15204.ordinal()];
            if (i == 3 || i == 4) {
                if (!z3 && !z2) {
                    throw C20094.m46318(this.f6339, this.f6341.f20363, str, new Object[0]);
                }
                hashSet.add(interfaceC6093.get());
                z2 = false;
                z3 = false;
            } else {
                if (i != 31) {
                    throw C20094.m46318(this.f6339, this.f6341.f20363, str, new Object[0]);
                }
                if (z2 || z3 || z) {
                    throw C20094.m46318(this.f6339, this.f6341.f20363, str, new Object[0]);
                }
                this.f6341.m18126();
                z2 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m28656() {
        while (true) {
            this.f6339.m45762(new Supplier() { // from class: l.۠ܰۚ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return "recoverFile: scanner.token=" + this.f25230.f6341.f20355;
                }
            });
            int i = C13148.f39311[this.f6341.f20355.ordinal()];
            if (i != 2 && i != 19) {
                switch (i) {
                    case 38:
                        return;
                    case 39:
                        m28654(EnumC15204.f46642, EnumC15204.f46442);
                        this.f6341.m18126();
                        break;
                    case 40:
                        m28654(EnumC15204.f46524, EnumC15204.f46630);
                        this.f6341.m18126();
                        break;
                    case 41:
                        m28654(EnumC15204.f46583, EnumC15204.f46618);
                        this.f6341.m18126();
                        break;
                    default:
                        this.f6341.m18126();
                        break;
                }
            } else {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m28662() {
        if (this.f35020) {
            this.f35012.m9333();
            this.f35026.m33164();
            if (this.f35026.f41211 == null) {
                String strM45777 = this.f6339.m45777();
                final String strM45776 = this.f6339.m45776();
                C13813 c13813 = this.f35026;
                C8732 c8732 = new C8732(c13813.f37150, strM45777);
                c8732.m22573(this.f35026.f37150, new Function() { // from class: l.ۗܰۚ
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
                        Boolean bool;
                        String str = (String) obj;
                        boolean z = false;
                        if (str.contains(strM45776)) {
                            Object[] objArr = {".java", ".jcod", ".jasm", ".class"};
                            ArrayList arrayList = new ArrayList(4);
                            int iM23073 = 0;
                            while (iM23073 < 4) {
                                Object obj2 = objArr[iM23073];
                                iM23073 = C8954.m23073(obj2, arrayList, obj2, iM23073, 1);
                            }
                            Iterator it = C20195.unmodifiableList(arrayList).iterator();
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
                c13813.f41211 = c8732;
            }
        } else {
            C13813 c13814 = this.f35026;
            if (c13814.f41211 == null) {
                C3046 c3046 = this.f35012;
                c13814.f41211 = new C19460(c3046, EnumC4662.f14819, c3046.m9312(this.f6339.m45777()));
            }
        }
        this.f35026.m33162();
        this.f35016.add(this.f35026);
        C13813 c13815 = new C13813(this.f6339, C22301.m50033(this.f35017));
        this.f35026 = c13815;
        this.f35012 = c13815.f37150;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13813[] m28685() {
        return (C13813[]) this.f35016.toArray(new C13813[0]);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m28674() {
        EnumC15204 enumC15204;
        ArrayList arrayList;
        if (this.f6341.f20355.m35961(EnumC15204.f46621, EnumC15204.f46559, EnumC15204.f46600)) {
            boolean z = true;
            while (true) {
                try {
                    EnumC15204 enumC15205 = this.f6341.f20355;
                    if (enumC15205 == EnumC15204.f46554 || !z) {
                        break;
                    }
                    int i = C13148.f39311[enumC15205.ordinal()];
                    if (i == 30) {
                        this.f6341.m18126();
                    } else if (i != 67) {
                        if (i == 43) {
                            this.f6341.m18126();
                            C6615 c6615 = this.f6341;
                            long j = c6615.f20363;
                            String str = c6615.f20357;
                            c6615.m18132(EnumC15204.f46611);
                            EnumC15204 enumC15206 = this.f6341.f20355;
                            EnumC15204 enumC15207 = EnumC15204.f46479;
                            if (enumC15206 != enumC15207) {
                                m28675();
                                this.f6341.m18132(enumC15207);
                            }
                            if (this.f35011 == null) {
                                this.f35011 = str;
                                this.f35015 = str + "/";
                            } else {
                                this.f6339.mo9065(j, "Package statement repeated", new Object[0]);
                            }
                        } else if (i == 44) {
                            this.f6341.m18126();
                            m28657();
                            this.f35020 = true;
                        }
                        z = false;
                    } else {
                        this.f35024 = this.f35022.m51696();
                    }
                } catch (C12136 unused) {
                    m28656();
                }
            }
            while (true) {
                C6615 c6616 = this.f6341;
                enumC15204 = c6616.f20355;
                if (enumC15204 != EnumC15204.f46479) {
                    break;
                } else {
                    c6616.m18126();
                }
            }
            if (enumC15204 != EnumC15204.f46554) {
                if (this.f35011 != null || (arrayList = this.f35024) == null) {
                    return;
                }
                this.f35019 = arrayList;
                this.f35024 = null;
                return;
            }
            this.f6339.m45778("Scanner:  EOF", new Object[0]);
            if (this.f6339.m45777().contains("package-info")) {
                this.f6339.m45762(new Supplier() { // from class: l.֨ܰۚ
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return C11738.m28663(this.f4171);
                    }
                });
                int iM16978 = EnumC6073.f18619.m16978() | EnumC6073.f18617.m16978();
                if (this.f35026.f41195.m50045() > 49) {
                    iM16978 |= EnumC6073.f18612.m16978();
                }
                C13813 c13813 = this.f35026;
                String strM23341 = C9045.m23341(new StringBuilder(), this.f35015, "package-info");
                c13813.f37140 = iM16978;
                c13813.f41194 = strM23341;
                c13813.f41195.m50039();
                ArrayList arrayList2 = this.f35024;
                if (arrayList2 != null) {
                    this.f35026.m30109(arrayList2);
                }
                if (this.f35020) {
                    this.f35012.m9333();
                    if (this.f35026.f41211 == null) {
                        String strM45777 = this.f6339.m45777();
                        C13813 c13814 = this.f35026;
                        C8732 c8732 = new C8732(c13814.f37150, strM45777);
                        c8732.m22573(this.f35026.f37150, new C3053(5));
                        c13814.f41211 = c8732;
                    }
                } else {
                    C13813 c13815 = this.f35026;
                    if (c13815.f41211 == null) {
                        C3046 c3046 = this.f35012;
                        c13815.f41211 = new C19460(c3046, EnumC4662.f14819, c3046.m9312(this.f6339.m45777()));
                    }
                }
                C13813 c13816 = this.f35026;
                C22986 c22986 = c13816.f41206;
                C3046 c3047 = c13816.f37150;
                String str2 = c13816.f41194;
                c3047.getClass();
                EnumC10932 enumC10932 = EnumC10932.f32947;
                c22986.m51137(c3047.m9314((AbstractC2465) new C17157(enumC10932, c3047.m9312(str2))));
                C6491 c6491 = c22986.f74008;
                C6491 c6492 = c22986.f74006;
                C15869 c15869M9314 = c3047.m9314((AbstractC2465) new C17157(enumC10932, c3047.m9312("java/lang/Object")));
                if (c6492.f20043 != null) {
                    c6492.f20043 = c15869M9314;
                } else {
                    c6491.f20043 = c15869M9314;
                }
                c3047.m9328();
                C15869 c15869M9329 = c3047.m9329(c22986.m51138());
                if (c6492.f20043 != null) {
                    c6492.f20043 = c15869M9329;
                } else {
                    c6491.f20043 = c15869M9329;
                }
                c22986.m51137(c3047.m9329(c22986.m51139()));
                c3047.m9324();
                this.f35016.add(this.f35026);
                this.f35026 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m28663(C11738 c11738) {
        return "Creating \"package-info.jasm\": package: " + c11738.f35011 + " " + c11738.f35026.f41195.m50035();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private String m28668() {
        if (!this.f6341.f20355.m35961(EnumC15204.f46569, EnumC15204.f46585)) {
            return null;
        }
        boolean z = false;
        String string = null;
        while (true) {
            EnumC15204 enumC15204 = this.f6341.f20355;
            if (enumC15204 == EnumC15204.f46554) {
                return string;
            }
            int i = C13148.f39311[enumC15204.ordinal()];
            if (i != 2 && i != 4) {
                if (i == 30) {
                    if (string == null) {
                        this.f6339.m11951(this.f6341.f20363, "\"{0}\" token is expected", z ? "CLASSNAME" : "FILENAME");
                        throw null;
                    }
                    this.f6341.m18126();
                    return string.concat(z ? ".class" : "");
                }
                switch (i) {
                    case 70:
                        if (string != null) {
                            this.f6339.m11951(this.f6341.f20363, "\"{0}\" token is expected", EnumC15204.f46479.m35967());
                            throw null;
                        }
                        break;
                        break;
                    case 71:
                        if (string != null) {
                            this.f6339.m11951(this.f6341.f20363, "\"{0}\" token is expected", EnumC15204.f46479.m35962());
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
                            this.f6339.m11951(this.f6341.f20363, "\"{0}\" token is expected", z ? "CLASSNAME" : "FILENAME");
                            throw null;
                        }
                        this.f6339.m11951(this.f6341.f20363, "\"{0}\" token is expected", EnumC15204.f46479.m35962());
                        throw null;
                }
            } else if (string == null) {
                string = this.f6341.f20350;
            } else {
                StringBuilder sbM15339 = C5368.m15339(string);
                sbM15339.append(this.f6341.f20350);
                string = sbM15339.toString();
            }
            this.f6341.m18126();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m28693() throws Throwable {
        try {
            C13813 c13813 = new C13813(this.f6339, C22301.m50033(this.f35017));
            this.f35026 = c13813;
            this.f35012 = c13813.f37150;
            String strM28668 = m28668();
            if (strM28668 != null) {
                InterfaceC1134 interfaceC1134M45780 = this.f6339.m45780();
                if (interfaceC1134M45780 instanceof AbstractC3957) {
                    ((AbstractC3957) interfaceC1134M45780).m12000(strM28668);
                }
            }
            m28674();
            while (true) {
                EnumC15204 enumC15204 = this.f6341.f20355;
                if (enumC15204 == EnumC15204.f46554) {
                    return;
                }
                try {
                    if (enumC15204 == EnumC15204.f46559) {
                        this.f35019 = this.f35022.m51696();
                    }
                    int iM28686 = m28686();
                    if (iM28686 == 0) {
                        int i = C13148.f39311[this.f6341.f20355.ordinal()];
                        if (i != 2 && i != 3 && i != 4 && i != 19) {
                            if (i == 30) {
                                this.f6341.m18126();
                            } else if (i != 36 && i != 68 && i != 69) {
                                this.f6339.mo9065(this.f6341.f20363, "Class, module or interface declaration expected", new Object[0]);
                                throw new C12136();
                            }
                        }
                    } else if (EnumC6073.m16948(iM28686) && this.f6341.f20355 != EnumC15204.f46533) {
                        iM28686 |= EnumC6073.f18617.m16978();
                    }
                    EnumC15204 enumC15205 = this.f6341.f20355;
                    if (enumC15205 == EnumC15204.f46443 || enumC15205 == EnumC15204.f46454) {
                        m28678(iM28686);
                    } else {
                        m28664(iM28686);
                    }
                    this.f35019 = null;
                } catch (C12136 e) {
                    this.f6339.m45778("^^^^^^^ Syntax Error ^^^^^^^^^^^^", new Object[0]);
                    this.f6341.f6339.getClass();
                    if (e.m29560()) {
                        return;
                    }
                    m28656();
                    return;
                }
            }
        } catch (IOException unused) {
            C3917 c3917 = this.f6339;
            c3917.mo9065(this.f6341.f20363, "I/O error in {0}", c3917.m45777());
        } catch (Error unused2) {
        }
    }
}
