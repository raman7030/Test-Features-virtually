package p067l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ܺۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 94T8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17251 extends AbstractC12342 {

    /* JADX INFO: renamed from: ֫ */
    public final C2582 f51355 = new C2582();

    /* JADX INFO: renamed from: ֫ */
    public static void m39036(ArrayList arrayList, HashMap map, HashSet hashSet) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                for (C23089 c23089 : ((C15041) it.next()).f42963) {
                    for (AbstractC10348 abstractC10348 : c23089.f45528.mo17753()) {
                        AbstractC10348 abstractC10349 = (AbstractC10348) map.get(abstractC10348);
                        if (abstractC10349 != null) {
                            hashSet.add(abstractC10349);
                        } else {
                            hashSet.add(abstractC10348);
                        }
                    }
                    hashSet.remove(c23089.f45527);
                    c23089.f45528.mo17750((AbstractC10348[]) hashSet.toArray(new AbstractC10348[0]));
                    hashSet.clear();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39037(Map map) {
        boolean z;
        Object obj;
        ArrayList<Map.Entry> arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new C21947());
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            for (Map.Entry entry : arrayList) {
                Object value = entry.getValue();
                if ((value instanceof C19736) && (obj = map.get(value)) != null && value != obj) {
                    entry.setValue(obj);
                    z = true;
                }
            }
        }
    }

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
    public final boolean m39038(C7726 c7726) {
        boolean z;
        boolean z2;
        boolean z3;
        C10547 c10547;
        ArrayList<C23089> arrayList = new ArrayList();
        ArrayList arrayList2 = c7726.f20260;
        for (AbstractC3880 first = c7726.f20257.getFirst(); first != null; first = first.m7669()) {
            if (first.f8417 == EnumC9677.ASSIGN) {
                C23089 c23089 = (C23089) first;
                EnumC3642 enumC3642 = c23089.f45527.f28658;
                EnumC3642 enumC3643 = EnumC3642.LOCAL;
                if (enumC3642 == enumC3643 && c23089.f45528.f28658 == enumC3643) {
                    arrayList.add(c23089);
                }
            }
        }
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = false;
        while (z5) {
            if (arrayList2 != null) {
                HashSet hashSet2 = new HashSet();
                C2582 c2582 = this.f51355;
                Map map2 = (Map) c2582.m3892();
                if (map2 == null) {
                    map2 = new HashMap();
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    for (C23089 c230810 : ((C15041) it.next()).f42963) {
                        C19736 c19736 = (C19736) c230810.f45527;
                        C10547 c10548 = (C10547) map2.get(c19736);
                        if (c10548 == null) {
                            c10548 = new C10547();
                            c10548.f29221 = c19736;
                            map2.put(c19736, c10548);
                        }
                        c10548.f29220 = z4;
                        AbstractC10348[] abstractC10348ArrMo17753 = c230810.f45528.mo17753();
                        int length = abstractC10348ArrMo17753.length;
                        boolean z7 = z6;
                        int i = 0;
                        while (i < length) {
                            AbstractC10348 abstractC10348 = abstractC10348ArrMo17753[i];
                            if (abstractC10348 == c19736) {
                                abstractC10348ArrMo17753 = abstractC10348ArrMo17753;
                            } else {
                                C19736 c19737 = (C19736) abstractC10348;
                                C10547 c10549 = (C10547) map2.get(c19737);
                                if (c10549 == null) {
                                    c10547 = new C10547();
                                    c10547.f29221 = c19737;
                                    map2.put(c19737, c10547);
                                } else {
                                    c10547 = c10549;
                                }
                                c10547.f29219.add(c10548);
                                c10548.f29222.add(c10547);
                            }
                            i++;
                            abstractC10348ArrMo17753 = abstractC10348ArrMo17753;
                        }
                        z4 = true;
                        z6 = z7;
                    }
                }
                z = z6;
                C7865 c7865 = new C7865();
                c7865.addAll(map2.values());
                while (!c7865.isEmpty()) {
                    C10547 c105410 = (C10547) c7865.poll();
                    for (C10547 c105411 : c105410.f29219) {
                        if (c105411.f29220 && c105411.f29222.addAll(c105410.f29222)) {
                            c7865.add(c105411);
                        }
                    }
                }
                z2 = false;
                for (C10547 c105412 : map2.values()) {
                    if (c105412.f29220) {
                        C19736 c19738 = null;
                        for (C10547 c105413 : c105412.f29222) {
                            if (!c105413.f29220) {
                                if (c19738 != null) {
                                    c19738 = null;
                                    break;
                                }
                                c19738 = c105413.f29221;
                            }
                        }
                        if (c19738 != null) {
                            map.put(c105412.f29221, c19738);
                            hashSet2.add(c105412.f29221);
                            z2 = true;
                        }
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C15041 c15041 = (C15041) it2.next();
                    Iterator it3 = c15041.f42963.iterator();
                    while (it3.hasNext()) {
                        if (hashSet2.contains(((C23089) it3.next()).f45527)) {
                            it3.remove();
                        }
                    }
                    if (c15041.f42963.size() == 0) {
                        c15041.f42963 = null;
                        it2.remove();
                    }
                }
                map2.clear();
                c2582.m3890(map2);
            } else {
                z = z6;
                z2 = false;
            }
            if (z2) {
                m39037(map);
                m39036(arrayList2, map, hashSet);
            }
            while (true) {
                if (arrayList2 != null) {
                    Iterator it4 = arrayList2.iterator();
                    z3 = false;
                    while (it4.hasNext()) {
                        C15041 c15042 = (C15041) it4.next();
                        Iterator it5 = c15042.f42963.iterator();
                        while (it5.hasNext()) {
                            C23089 c230811 = (C23089) it5.next();
                            hashSet.addAll(Arrays.asList(c230811.f45528.mo17753()));
                            hashSet.remove(c230811.f45527);
                            if (hashSet.size() == 1) {
                                it5.remove();
                                map.put((C19736) c230811.f45527, (C19736) hashSet.iterator().next());
                                z3 = true;
                            }
                            hashSet.clear();
                        }
                        if (c15042.f42963.size() == 0) {
                            c15042.f42963 = null;
                            it4.remove();
                        }
                    }
                } else {
                    z3 = false;
                }
                if (!z3) {
                    break;
                }
                m39037(map);
                m39036(arrayList2, map, hashSet);
            }
            z6 = z;
            z5 = false;
            while (true) {
                C17961 c17961 = c7726.f20257;
                HashSet hashSet3 = new HashSet();
                if (arrayList2 != null) {
                    Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        Iterator it7 = ((C15041) it6.next()).f42963.iterator();
                        while (it7.hasNext()) {
                            hashSet3.addAll(Arrays.asList(((C23089) it7.next()).f45528.mo17753()));
                        }
                    }
                }
                Iterator it8 = arrayList.iterator();
                boolean z8 = false;
                while (it8.hasNext()) {
                    C23089 c230812 = (C23089) it8.next();
                    if (!hashSet3.contains(c230812.f45527)) {
                        it8.remove();
                        c17961.m40883(c230812);
                        map.put((C19736) c230812.f45527, (C19736) c230812.f45528);
                        z8 = true;
                    }
                }
                if (z8) {
                    m39037(map);
                    for (C23089 c230813 : arrayList) {
                        AbstractC10348 abstractC10349 = (AbstractC10348) map.get(c230813.f45528);
                        if (abstractC10349 != null) {
                            c230813.f45528 = abstractC10349;
                        }
                    }
                    z5 = true;
                    z6 = true;
                }
            }
            m39036(arrayList2, map, hashSet);
            z4 = true;
        }
        Iterator it9 = map.keySet().iterator();
        while (it9.hasNext()) {
            c7726.f20261.remove((C19736) it9.next());
            z6 = true;
        }
        if (map.size() > 0) {
            C17961 c17962 = c7726.f20257;
            C11218 c11218 = new C11218(map);
            for (AbstractC3880 first2 = c17962.getFirst(); first2 != null; first2 = first2.m7669()) {
                C16620.m37692(first2, c11218, true);
            }
        }
        return z6;
    }
}
