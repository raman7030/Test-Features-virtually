package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.ۤۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5KR */
/* JADX INFO: loaded from: classes3.dex */
public final class C10018 {
    /* JADX WARN: Code duplicated, block: B:129:0x0292  */
    /* JADX WARN: Multi-variable type inference failed */
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
    public static void m25188(C5637 c5637) {
        int i;
        boolean zEquals;
        C12839 c12839;
        C12839 c128310;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4 = c5637.f17414;
        ArrayList arrayList5 = c5637.f17415;
        if (arrayList4 == null || arrayList4.size() == 0) {
            return;
        }
        for (C13334 c13334 : c5637.f17414) {
            AbstractC1591 abstractC1591M5439 = c13334.m5439();
            if (abstractC1591M5439.f5638 == EnumC7690.LABEL && (arrayList3 = ((C13334) abstractC1591M5439).f39897) != null && arrayList3.size() > 0) {
                c5637.f17411.m38662(c13334, new C10513());
            }
        }
        new C2962(c5637).m19277();
        Iterator it = arrayList5.iterator();
        while (it.hasNext()) {
            ((C18274) it.next()).f25748 = new C12134();
        }
        HashSet<AbstractC1591> hashSet = new HashSet();
        Iterator it2 = c5637.f17411.iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            AbstractC1591 abstractC1591 = (AbstractC1591) it2.next();
            EnumC7690 enumC7690 = abstractC1591.f5638;
            if ((enumC7690 == EnumC7690.ASSIGN || enumC7690 == EnumC7690.IDENTITY) && abstractC1591.mo5445().f25745 == EnumC1340.LOCAL) {
                C18274 c18274 = (C18274) abstractC1591.mo5445();
                C12134 c12134 = (C12134) c18274.f25748;
                HashSet hashSet2 = new HashSet();
                C14996.m35526(abstractC1591, hashSet);
                for (AbstractC1591 abstractC1592 : hashSet) {
                    C12839[] c12839Arr = (C12839[]) abstractC1592.f5637;
                    if (c12839Arr != null) {
                        hashSet2.clear();
                        hashSet2.add(Integer.valueOf(c18274.f56817));
                        if (abstractC1592.f5638 == EnumC7690.LABEL && (arrayList = ((C13334) abstractC1592).f39897) != null) {
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                hashSet2.add(Integer.valueOf(((C18274) ((C21802) it3.next()).f42444).f56817));
                            }
                        }
                        for (int i2 = 0; i2 < c12839Arr.length; i2++) {
                            if (!hashSet2.contains(Integer.valueOf(i2)) && (c128310 = c12839Arr[i2]) != null && c128310.f38582) {
                                C12134 c12135 = (C12134) c128310.f38581.f25748;
                                c12134.f36233.add(c12135);
                                c12135.f36233.add(c12134);
                            }
                        }
                    }
                }
                hashSet.clear();
            } else if (abstractC1591.f5638 == EnumC7690.LABEL && (arrayList2 = ((C13334) abstractC1591).f39897) != null && abstractC1591.f5637 != null) {
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    C12134 c12136 = (C12134) ((C18274) ((C21802) it4.next()).f42444).f25748;
                    for (C12839 c128311 : (C12839[]) abstractC1591.f5637) {
                        if (c128311 != null && c128311.f38582) {
                            C12134 c12137 = (C12134) c128311.f38581.f25748;
                            c12136.f36233.add(c12137);
                            c12137.f36233.add(c12136);
                        }
                    }
                }
            }
        }
        for (C13334 c13335 : c5637.f17414) {
            for (C21802 c21802 : c13335.f39897) {
                C18274 c18275 = (C18274) c21802.f42444;
                C23918 c23918 = (C23918) c21802.f42445;
                C12134 c12138 = (C12134) c18275.f25748;
                for (AbstractC8396 abstractC8396 : c23918.f17269) {
                    if (c12138.f36233.contains((C12134) ((C18274) abstractC8396).f25748)) {
                        C18274 c18276 = (C18274) c18275.clone();
                        c21802.f42444 = c18276;
                        C12134 c12139 = new C12134();
                        c18276.f25748 = c12139;
                        arrayList5.add(c18276);
                        C21802 c21802M41744 = C17819.m41744(c18275, c18276);
                        AbstractC1591 abstractC1591M54310 = c13335.m5439();
                        if (abstractC1591M54310 != null && abstractC1591M54310.f5638 == EnumC7690.IDENTITY && abstractC1591M54310.mo5444().f25745 == EnumC1340.EXCEPTION_REF) {
                            c5637.f17411.m38662(abstractC1591M54310, c21802M41744);
                        } else {
                            c5637.f17411.m38662(c13335, c21802M41744);
                        }
                        C12839[] c12839Arr2 = (C12839[]) c13335.f5637;
                        c12839Arr2[c18275.f56817].f38581 = c18276;
                        for (C12839 c128312 : c12839Arr2) {
                            if (c128312 != null && c128312.f38582) {
                                C12134 c121310 = (C12134) c128312.f38581.f25748;
                                c121310.f36233.add(c12139);
                                c12139.f36233.add(c121310);
                            }
                        }
                        break;
                    }
                }
            }
        }
        ArrayList<C13334> arrayList6 = c5637.f17414;
        ArrayList<C21802> arrayList7 = new ArrayList();
        for (C13334 c13336 : arrayList6) {
            ArrayList arrayList8 = c13336.f39897;
            C12839[] c12839Arr3 = (C12839[]) c13336.f5637;
            for (AbstractC1591 abstractC1593 : c13336.f5630) {
                if (abstractC1593.f5632) {
                    Iterator it5 = arrayList8.iterator();
                    while (it5.hasNext()) {
                        C18274 c18277 = (C18274) ((C21802) it5.next()).f42444;
                        C18274 c18278 = (C18274) c12839Arr3[c18277.f56817].f38584.get(abstractC1593);
                        if (c18278 != c18277) {
                            arrayList7.add(C17819.m41744(c18277, c18278));
                        }
                    }
                    C16407 c16407 = c5637.f17411;
                    TreeSet treeSet = abstractC1593.f5635;
                    boolean z = true;
                    if (treeSet == null || !treeSet.contains(c13336)) {
                        int i3 = C19896.f64297[abstractC1593.f5638.ordinal()];
                        if (i3 == 1 || i3 == 2) {
                            zEquals = ((InterfaceC3457) abstractC1593).mo10582().equals(c13336);
                        } else if (i3 == 3 || i3 == 4) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else {
                        zEquals = true;
                    }
                    if (zEquals) {
                        Iterator it6 = arrayList7.iterator();
                        while (it6.hasNext()) {
                            c16407.m38666(abstractC1593, (C21802) it6.next());
                        }
                    } else {
                        Iterator it7 = arrayList7.iterator();
                        while (it7.hasNext()) {
                            c16407.m38662(abstractC1593, (C21802) it7.next());
                        }
                    }
                    C12839[] c12839Arr4 = (C12839[]) abstractC1593.f5637;
                    ArrayList arrayList9 = new ArrayList(arrayList7.size());
                    for (C21802 c21803 : arrayList7) {
                        C18274 c18279 = (C18274) c21803.f42444;
                        C12839 c128313 = new C12839(i);
                        c128313.f38581 = c18279;
                        c128313.f38582 = z;
                        arrayList9.add(c128313);
                        C12134 c121311 = (C12134) c18279.f25748;
                        int i4 = ((C18274) c21803.f42445).f56817;
                        for (int i5 = 0; i5 < c12839Arr4.length; i5++) {
                            if (i5 != i4 && (c12839 = c12839Arr4[i5]) != null && c12839.f38582) {
                                C12134 c121312 = (C12134) c12839.f38581.f25748;
                                c121312.f36233.add(c121311);
                                c121311.f36233.add(c121312);
                            }
                        }
                        Iterator it8 = arrayList7.iterator();
                        while (it8.hasNext()) {
                            C12134 c121313 = (C12134) ((C18274) ((C21802) it8.next()).f42444).f25748;
                            c121313.f36233.add(c121311);
                            c121311.f36233.add(c121313);
                        }
                        i = 0;
                        z = true;
                    }
                    C12839[] c12839Arr5 = new C12839[arrayList9.size() + c12839Arr4.length];
                    System.arraycopy(c12839Arr4, 0, c12839Arr5, 0, c12839Arr4.length);
                    for (int i6 = 0; i6 < arrayList9.size(); i6++) {
                        c12839Arr5[c12839Arr4.length + i6] = (C12839) arrayList9.get(i6);
                    }
                    arrayList7.clear();
                }
                i = 0;
            }
        }
        Iterator it9 = arrayList5.iterator();
        while (it9.hasNext()) {
            ((C18274) it9.next()).f25748 = null;
        }
        Iterator it10 = c5637.f17411.iterator();
        while (it10.hasNext()) {
            ((AbstractC1591) it10.next()).f5637 = null;
        }
        Iterator it11 = c5637.f17414.iterator();
        while (it11.hasNext()) {
            ((C13334) it11.next()).f39897 = null;
        }
        c5637.f17414 = null;
    }
}
