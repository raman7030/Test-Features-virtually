package p067l;

import bin.p000mt.plus.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩻᩺ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes.dex */
public final class C25187 extends AbstractC3947 {
    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo3869(C4697 c4697) {
        return c4697.m9964("local") && !c4697.m9971();
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        String name;
        c4697.m9955("local");
        C18107 c18107M9967 = c4697.m9967();
        boolean z = !c18107M9967.m41264() && c18107M9967.m41261("local");
        boolean zAnyMatch = C7480.stream(c4697.m9957()).anyMatch(new C19744(0));
        String strSubstring = "";
        if (c4697.m9966() == 1) {
            InterfaceC19370 interfaceC19370M9961 = c4697.m9961();
            if (interfaceC19370M9961.isDirectory()) {
                name = interfaceC19370M9961.getName();
            } else {
                name = interfaceC19370M9961.getName();
                int iLastIndexOf = name.lastIndexOf(46);
                if (iLastIndexOf != -1) {
                    String strSubstring2 = name.substring(0, iLastIndexOf);
                    strSubstring = name.substring(iLastIndexOf);
                    name = strSubstring2;
                }
            }
        } else {
            name = C18524.m42109(c4697.m9974(), new String[0]).getName();
        }
        C23530 c23530 = new C23530(c4697.m9965(), z, c18107M9967, c4697);
        c23530.m49385(name, strSubstring);
        c23530.m49384(c4697.m9966(), zAnyMatch, z);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m55253(C3313 c3313, C4697 c4697, boolean z) {
        c3313.m5778("compressToAnother", z);
        if (z) {
            c3313.m5782(c4697);
        } else {
            c3313.m5789(c4697);
        }
        c3313.m5772();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4045 m55251(AbstractC5996 abstractC5996, String[] strArr, boolean z) {
        C4045 c4045 = new C4045();
        c4045.m8102(strArr, z, new C21519(abstractC5996));
        return c4045;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m55254(AbstractC5996 abstractC5996, String[] strArr, List list, int i) {
        String strM49051;
        List list2 = (List) C7480.stream(list).map(new C10119(0)).collect(C24205.toList());
        try {
            ArrayList arrayListM55249 = m55249(list, new C21545());
            boolean z = i > 1;
            if (z) {
                abstractC5996.m13472(R.string.MT_Protector);
                abstractC5996.mo13474(0);
                if (abstractC5996 instanceof AbstractC23625) {
                    ((AbstractC23625) abstractC5996).m52469(0);
                }
            }
            for (String str : strArr) {
                if (!m55256(str, list2)) {
                    AbstractC17043 abstractC17043M42109 = C18524.m42109(str, new String[0]);
                    try {
                        if (abstractC17043M42109.mo33653()) {
                            strM49051 = m55248(abstractC17043M42109.mo25505());
                        } else {
                            strM49051 = C21759.m49051(abstractC17043M42109.mo25505());
                        }
                        if (!m55256(strM49051, arrayListM55249)) {
                            if (z) {
                                abstractC5996.mo13456(abstractC17043M42109.getName());
                            }
                            EnumC18126 enumC18126M41309 = EnumC18126.m41309(abstractC17043M42109.mo25087());
                            if (abstractC17043M42109.mo25503()) {
                                enumC18126M41309.m41311(str);
                            }
                        }
                    } catch (IOException unused) {
                    }
                }
            }
        } catch (IOException unused2) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m55248(String str) {
        String strM42102 = C18524.m42102(str);
        if (strM42102 != null) {
            return new File(C17853.f53287.mo25505(), strM42102).getPath();
        }
        return C18524.m42130(str) ? C17853.f53287.mo25505() : str;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m55249(List list, C21545 c21545) {
        ArrayList arrayList = new ArrayList(list.size());
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC17043 abstractC17043 = (AbstractC17043) it.next();
            if (abstractC17043.mo33653()) {
                arrayList.add(m55248(abstractC17043.mo25505()));
            } else {
                String parent = abstractC17043.getParent();
                if (parent == null) {
                    arrayList.add(C21759.m49051(abstractC17043.mo25505()));
                } else {
                    String strM49051 = (String) map.get(parent);
                    if (strM49051 == null) {
                        strM49051 = C21759.m49051(parent);
                        map.put(parent, strM49051);
                    }
                    arrayList.add(new File(strM49051, abstractC17043.getName()).getPath());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m55256(final String str, List list) {
        if (C18524.m42130(str) || C18524.m42120(str)) {
            return C7480.stream(list).anyMatch(new C17594(str, 1));
        }
        final String strConcat = str.endsWith("/") ? str : str.concat("/");
        return C7480.stream(list).anyMatch(new Predicate() { // from class: l.ܶۨܳ
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
            public /* synthetic */ Predicate m38155or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                String str2 = (String) obj;
                return str2.equals(str) || str2.startsWith(strConcat);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m55250(List list) {
        return (List) C7480.stream(list).map(new C9668(0)).collect(C24205.toList());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m55255(C18736 c18736, boolean z, boolean z2, C18107 c18107, C18107 c18108, List list) {
        if (c18736.m42773() && z2) {
            if (z) {
                c18107 = c18108;
            }
            c18107.m41267();
            c18107.m41226((Collection) list);
            c18107.m41241();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m55252(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC17043) it.next()).mo29990();
        }
    }
}
