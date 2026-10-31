package l;

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
public final class C15660 extends AbstractC10494 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0225 f48216 = new C0225();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36870(ArrayList arrayList, HashMap map, HashSet hashSet) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                for (C21802 c21802 : ((C13334) it.next()).f39897) {
                    for (AbstractC8396 abstractC8396 : c21802.f42445.mo15838()) {
                        AbstractC8396 abstractC8397 = (AbstractC8396) map.get(abstractC8396);
                        if (abstractC8397 != null) {
                            hashSet.add(abstractC8397);
                        } else {
                            hashSet.add(abstractC8396);
                        }
                    }
                    hashSet.remove(c21802.f42444);
                    c21802.f42445.mo15835((AbstractC8396[]) hashSet.toArray(new AbstractC8396[0]));
                    hashSet.clear();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36871(Map map) {
        boolean z;
        Object obj;
        ArrayList<Map.Entry> arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new C20601());
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            for (Map.Entry entry : arrayList) {
                Object value = entry.getValue();
                if ((value instanceof C18274) && (obj = map.get(value)) != null && value != obj) {
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36872(C5637 c5637) {
        boolean z;
        boolean z2;
        boolean z3;
        C8606 c8606;
        ArrayList<C21802> arrayList = new ArrayList();
        ArrayList arrayList2 = c5637.f17414;
        for (AbstractC1591 first = c5637.f17411.getFirst(); first != null; first = first.m5439()) {
            if (first.f5638 == EnumC7690.ASSIGN) {
                C21802 c21802 = (C21802) first;
                EnumC1340 enumC1340 = c21802.f42444.f25745;
                EnumC1340 enumC1341 = EnumC1340.LOCAL;
                if (enumC1340 == enumC1341 && c21802.f42445.f25745 == enumC1341) {
                    arrayList.add(c21802);
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
                C0225 c0225 = this.f48216;
                Map map2 = (Map) c0225.m1479();
                if (map2 == null) {
                    map2 = new HashMap();
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    for (C21802 c21803 : ((C13334) it.next()).f39897) {
                        C18274 c18274 = (C18274) c21803.f42444;
                        C8606 c8607 = (C8606) map2.get(c18274);
                        if (c8607 == null) {
                            c8607 = new C8606();
                            c8607.f26305 = c18274;
                            map2.put(c18274, c8607);
                        }
                        c8607.f26304 = z4;
                        AbstractC8396[] abstractC8396ArrMo15838 = c21803.f42445.mo15838();
                        int length = abstractC8396ArrMo15838.length;
                        boolean z7 = z6;
                        int i = 0;
                        while (i < length) {
                            AbstractC8396 abstractC8396 = abstractC8396ArrMo15838[i];
                            if (abstractC8396 == c18274) {
                                abstractC8396ArrMo15838 = abstractC8396ArrMo15838;
                            } else {
                                C18274 c18275 = (C18274) abstractC8396;
                                C8606 c8608 = (C8606) map2.get(c18275);
                                if (c8608 == null) {
                                    c8606 = new C8606();
                                    c8606.f26305 = c18275;
                                    map2.put(c18275, c8606);
                                } else {
                                    c8606 = c8608;
                                }
                                c8606.f26303.add(c8607);
                                c8607.f26306.add(c8606);
                            }
                            i++;
                            abstractC8396ArrMo15838 = abstractC8396ArrMo15838;
                        }
                        z4 = true;
                        z6 = z7;
                    }
                }
                z = z6;
                C5784 c5784 = new C5784();
                c5784.addAll(map2.values());
                while (!c5784.isEmpty()) {
                    C8606 c8609 = (C8606) c5784.poll();
                    for (C8606 c86010 : c8609.f26303) {
                        if (c86010.f26304 && c86010.f26306.addAll(c8609.f26306)) {
                            c5784.add(c86010);
                        }
                    }
                }
                z2 = false;
                for (C8606 c86011 : map2.values()) {
                    if (c86011.f26304) {
                        C18274 c18276 = null;
                        for (C8606 c86012 : c86011.f26306) {
                            if (!c86012.f26304) {
                                if (c18276 != null) {
                                    c18276 = null;
                                    break;
                                }
                                c18276 = c86012.f26305;
                            }
                        }
                        if (c18276 != null) {
                            map.put(c86011.f26305, c18276);
                            hashSet2.add(c86011.f26305);
                            z2 = true;
                        }
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C13334 c13334 = (C13334) it2.next();
                    Iterator it3 = c13334.f39897.iterator();
                    while (it3.hasNext()) {
                        if (hashSet2.contains(((C21802) it3.next()).f42444)) {
                            it3.remove();
                        }
                    }
                    if (c13334.f39897.size() == 0) {
                        c13334.f39897 = null;
                        it2.remove();
                    }
                }
                map2.clear();
                c0225.m1477(map2);
            } else {
                z = z6;
                z2 = false;
            }
            if (z2) {
                m36871(map);
                m36870(arrayList2, map, hashSet);
            }
            while (true) {
                if (arrayList2 != null) {
                    Iterator it4 = arrayList2.iterator();
                    z3 = false;
                    while (it4.hasNext()) {
                        C13334 c13335 = (C13334) it4.next();
                        Iterator it5 = c13335.f39897.iterator();
                        while (it5.hasNext()) {
                            C21802 c21804 = (C21802) it5.next();
                            hashSet.addAll(Arrays.asList(c21804.f42445.mo15838()));
                            hashSet.remove(c21804.f42444);
                            if (hashSet.size() == 1) {
                                it5.remove();
                                map.put((C18274) c21804.f42444, (C18274) hashSet.iterator().next());
                                z3 = true;
                            }
                            hashSet.clear();
                        }
                        if (c13335.f39897.size() == 0) {
                            c13335.f39897 = null;
                            it4.remove();
                        }
                    }
                } else {
                    z3 = false;
                }
                if (!z3) {
                    break;
                }
                m36871(map);
                m36870(arrayList2, map, hashSet);
            }
            z6 = z;
            z5 = false;
            while (true) {
                C16407 c16407 = c5637.f17411;
                HashSet hashSet3 = new HashSet();
                if (arrayList2 != null) {
                    Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        Iterator it7 = ((C13334) it6.next()).f39897.iterator();
                        while (it7.hasNext()) {
                            hashSet3.addAll(Arrays.asList(((C21802) it7.next()).f42445.mo15838()));
                        }
                    }
                }
                Iterator it8 = arrayList.iterator();
                boolean z8 = false;
                while (it8.hasNext()) {
                    C21802 c21805 = (C21802) it8.next();
                    if (!hashSet3.contains(c21805.f42444)) {
                        it8.remove();
                        c16407.m38667(c21805);
                        map.put((C18274) c21805.f42444, (C18274) c21805.f42445);
                        z8 = true;
                    }
                }
                if (z8) {
                    m36871(map);
                    for (C21802 c21806 : arrayList) {
                        AbstractC8396 abstractC8397 = (AbstractC8396) map.get(c21806.f42445);
                        if (abstractC8397 != null) {
                            c21806.f42445 = abstractC8397;
                        }
                    }
                    z5 = true;
                    z6 = true;
                }
            }
            m36870(arrayList2, map, hashSet);
            z4 = true;
        }
        Iterator it9 = map.keySet().iterator();
        while (it9.hasNext()) {
            c5637.f17415.remove((C18274) it9.next());
            z6 = true;
        }
        if (map.size() > 0) {
            C16407 c16408 = c5637.f17411;
            C9312 c9312 = new C9312(map);
            for (AbstractC1591 first2 = c16408.getFirst(); first2 != null; first2 = first2.m5439()) {
                C14996.m35536(first2, c9312, true);
            }
        }
        return z6;
    }
}
