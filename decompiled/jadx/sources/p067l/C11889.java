package p067l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.ۤۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5KR */
/* JADX INFO: loaded from: classes3.dex */
public final class C11889 {
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
    /* JADX INFO: renamed from: ֫ */
    public static void m27205(C7726 c7726) {
        int i;
        boolean zEquals;
        C14570 c14570;
        C14570 c14571;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4 = c7726.f20260;
        ArrayList arrayList5 = c7726.f20261;
        if (arrayList4 == null || arrayList4.size() == 0) {
            return;
        }
        for (C15041 c15041 : c7726.f20260) {
            AbstractC3880 abstractC3880M7669 = c15041.m7669();
            if (abstractC3880M7669.f8417 == EnumC9677.LABEL && (arrayList3 = ((C15041) abstractC3880M7669).f42963) != null && arrayList3.size() > 0) {
                c7726.f20257.m40878(c15041, new C12360());
            }
        }
        new C5183(c7726).m21224();
        Iterator it = arrayList5.iterator();
        while (it.hasNext()) {
            ((C19736) it.next()).f28661 = new C13900();
        }
        HashSet<AbstractC3880> hashSet = new HashSet();
        Iterator it2 = c7726.f20257.iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            AbstractC3880 abstractC3880 = (AbstractC3880) it2.next();
            EnumC9677 enumC9677 = abstractC3880.f8417;
            if ((enumC9677 == EnumC9677.ASSIGN || enumC9677 == EnumC9677.IDENTITY) && abstractC3880.mo7675().f28658 == EnumC3642.LOCAL) {
                C19736 c19736 = (C19736) abstractC3880.mo7675();
                C13900 c13900 = (C13900) c19736.f28661;
                HashSet hashSet2 = new HashSet();
                C16620.m37682(abstractC3880, hashSet);
                for (AbstractC3880 abstractC3881 : hashSet) {
                    C14570[] c14570Arr = (C14570[]) abstractC3881.f8416;
                    if (c14570Arr != null) {
                        hashSet2.clear();
                        hashSet2.add(Integer.valueOf(c19736.f60034));
                        if (abstractC3881.f8417 == EnumC9677.LABEL && (arrayList = ((C15041) abstractC3881).f42963) != null) {
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                hashSet2.add(Integer.valueOf(((C19736) ((C23089) it3.next()).f45527).f60034));
                            }
                        }
                        for (int i2 = 0; i2 < c14570Arr.length; i2++) {
                            if (!hashSet2.contains(Integer.valueOf(i2)) && (c14571 = c14570Arr[i2]) != null && c14571.f41624) {
                                C13900 c13901 = (C13900) c14571.f41623.f28661;
                                c13900.f39245.add(c13901);
                                c13901.f39245.add(c13900);
                            }
                        }
                    }
                }
                hashSet.clear();
            } else if (abstractC3880.f8417 == EnumC9677.LABEL && (arrayList2 = ((C15041) abstractC3880).f42963) != null && abstractC3880.f8416 != null) {
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    C13900 c13902 = (C13900) ((C19736) ((C23089) it4.next()).f45527).f28661;
                    for (C14570 c14572 : (C14570[]) abstractC3880.f8416) {
                        if (c14572 != null && c14572.f41624) {
                            C13900 c13903 = (C13900) c14572.f41623.f28661;
                            c13902.f39245.add(c13903);
                            c13903.f39245.add(c13902);
                        }
                    }
                }
            }
        }
        for (C15041 c15042 : c7726.f20260) {
            for (C23089 c23089 : c15042.f42963) {
                C19736 c19737 = (C19736) c23089.f45527;
                C25100 c25100 = (C25100) c23089.f45528;
                C13900 c13904 = (C13900) c19737.f28661;
                for (AbstractC10348 abstractC10348 : c25100.f20109) {
                    if (c13904.f39245.contains((C13900) ((C19736) abstractC10348).f28661)) {
                        C19736 c19738 = (C19736) c19737.clone();
                        c23089.f45527 = c19738;
                        C13900 c13905 = new C13900();
                        c19738.f28661 = c13905;
                        arrayList5.add(c19738);
                        C23089 c23089M43990 = C19303.m43990(c19737, c19738);
                        AbstractC3880 abstractC3880M76610 = c15042.m7669();
                        if (abstractC3880M76610 != null && abstractC3880M76610.f8417 == EnumC9677.IDENTITY && abstractC3880M76610.mo7674().f28658 == EnumC3642.EXCEPTION_REF) {
                            c7726.f20257.m40878(abstractC3880M76610, c23089M43990);
                        } else {
                            c7726.f20257.m40878(c15042, c23089M43990);
                        }
                        C14570[] c14570Arr2 = (C14570[]) c15042.f8416;
                        c14570Arr2[c19737.f60034].f41623 = c19738;
                        for (C14570 c14573 : c14570Arr2) {
                            if (c14573 != null && c14573.f41624) {
                                C13900 c13906 = (C13900) c14573.f41623.f28661;
                                c13906.f39245.add(c13905);
                                c13905.f39245.add(c13906);
                            }
                        }
                        break;
                    }
                }
            }
        }
        ArrayList<C15041> arrayList6 = c7726.f20260;
        ArrayList<C23089> arrayList7 = new ArrayList();
        for (C15041 c15043 : arrayList6) {
            ArrayList arrayList8 = c15043.f42963;
            C14570[] c14570Arr3 = (C14570[]) c15043.f8416;
            for (AbstractC3880 abstractC3882 : c15043.f8409) {
                if (abstractC3882.f8411) {
                    Iterator it5 = arrayList8.iterator();
                    while (it5.hasNext()) {
                        C19736 c19739 = (C19736) ((C23089) it5.next()).f45527;
                        C19736 c197310 = (C19736) c14570Arr3[c19739.f60034].f41626.get(abstractC3882);
                        if (c197310 != c19739) {
                            arrayList7.add(C19303.m43990(c19739, c197310));
                        }
                    }
                    C17961 c17961 = c7726.f20257;
                    TreeSet treeSet = abstractC3882.f8414;
                    boolean z = true;
                    if (treeSet == null || !treeSet.contains(c15043)) {
                        int i3 = C21277.f66932[abstractC3882.f8417.ordinal()];
                        if (i3 == 1 || i3 == 2) {
                            zEquals = ((InterfaceC5654) abstractC3882).mo12590().equals(c15043);
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
                            c17961.m40882(abstractC3882, (C23089) it6.next());
                        }
                    } else {
                        Iterator it7 = arrayList7.iterator();
                        while (it7.hasNext()) {
                            c17961.m40878(abstractC3882, (C23089) it7.next());
                        }
                    }
                    C14570[] c14570Arr4 = (C14570[]) abstractC3882.f8416;
                    ArrayList arrayList9 = new ArrayList(arrayList7.size());
                    for (C23089 c230810 : arrayList7) {
                        C19736 c197311 = (C19736) c230810.f45527;
                        C14570 c14574 = new C14570(i);
                        c14574.f41623 = c197311;
                        c14574.f41624 = z;
                        arrayList9.add(c14574);
                        C13900 c13907 = (C13900) c197311.f28661;
                        int i4 = ((C19736) c230810.f45528).f60034;
                        for (int i5 = 0; i5 < c14570Arr4.length; i5++) {
                            if (i5 != i4 && (c14570 = c14570Arr4[i5]) != null && c14570.f41624) {
                                C13900 c13908 = (C13900) c14570.f41623.f28661;
                                c13908.f39245.add(c13907);
                                c13907.f39245.add(c13908);
                            }
                        }
                        Iterator it8 = arrayList7.iterator();
                        while (it8.hasNext()) {
                            C13900 c13909 = (C13900) ((C19736) ((C23089) it8.next()).f45527).f28661;
                            c13909.f39245.add(c13907);
                            c13907.f39245.add(c13909);
                        }
                        i = 0;
                        z = true;
                    }
                    C14570[] c14570Arr5 = new C14570[arrayList9.size() + c14570Arr4.length];
                    System.arraycopy(c14570Arr4, 0, c14570Arr5, 0, c14570Arr4.length);
                    for (int i6 = 0; i6 < arrayList9.size(); i6++) {
                        c14570Arr5[c14570Arr4.length + i6] = (C14570) arrayList9.get(i6);
                    }
                    arrayList7.clear();
                }
                i = 0;
            }
        }
        Iterator it9 = arrayList5.iterator();
        while (it9.hasNext()) {
            ((C19736) it9.next()).f28661 = null;
        }
        Iterator it10 = c7726.f20257.iterator();
        while (it10.hasNext()) {
            ((AbstractC3880) it10.next()).f8416 = null;
        }
        Iterator it11 = c7726.f20260.iterator();
        while (it11.hasNext()) {
            ((C15041) it11.next()).f42963 = null;
        }
        c7726.f20260 = null;
    }
}
