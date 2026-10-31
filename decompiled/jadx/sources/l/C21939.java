package l;

import com.umeng.analytics.pro.am;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩹֡ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097P */
/* JADX INFO: loaded from: classes.dex */
public final class C21939 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f70247 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 f70250;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String f70254;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final SecureRandom f70251 = new SecureRandom();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f70253 = Pattern.compile("[0-9A-Z]+");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ConcurrentMapC10942 f70249 = new ConcurrentMapC10942();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static boolean f70248 = true;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C20177 f70252 = new C20177();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m49421() {
        f70250 = null;
        f70254 = null;
        f70248 = true;
        f70249.clear();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static void m49415() {
        f70249.clear();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m49417() {
        return C4925.f15523.getBoolean("enable_recycle_bin", true);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m49419() {
        AbstractC15440 abstractC15440M36526 = f70250;
        if (abstractC15440M36526 == null) {
            abstractC15440M36526 = C16293.m38327().m36526(".recycle");
            if (!abstractC15440M36526.mo23120()) {
                AbstractC15440 abstractC15440M36527 = C16293.m38327().m36526("recycle");
                if (abstractC15440M36527.mo23113()) {
                    abstractC15440M36527.mo23551(abstractC15440M36526);
                }
            }
            String strM39859 = abstractC15440M36526.mo36530() ? C16999.m39859(abstractC15440M36526.mo23554()) : null;
            if (strM39859 == null) {
                abstractC15440M36526 = C16293.f50120.m36526(".recycle.bin");
                strM39859 = C16999.m39859(abstractC15440M36526.mo23554());
                C11003.requireNonNull(strM39859);
            }
            if (abstractC15440M36526.mo23120()) {
                AbstractC15440 abstractC15440M36528 = abstractC15440M36526.m36526(".i");
                if (!abstractC15440M36528.mo23120()) {
                    AbstractC15440 abstractC15440M36529 = abstractC15440M36526.m36526(am.aC);
                    if (abstractC15440M36529.mo23113()) {
                        abstractC15440M36529.mo23551(abstractC15440M36528);
                    }
                }
            }
            f70250 = abstractC15440M36526;
            f70254 = strM39859;
        }
        if (f70248 && abstractC15440M36526.mo23120()) {
            try {
                abstractC15440M36526.m36526(".nomedia").m36503(new byte[0], 0, 0);
                abstractC15440M36526.m36526("README.txt").m36510("This directory stores files in the Recycle Bin. Please do not delete any files manually. If you need to delete files, you can enter the Recycle Bin from the side bar on the main interface and then delete them!\n\n此目录为回收站目录，请不要手动删除任何文件，如需删除可从主界面侧拉栏进入回收站再删除！\n");
            } catch (Exception unused) {
            }
            f70248 = false;
        }
        return abstractC15440M36526;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m49420() {
        if (f70254 == null) {
            m49419();
        }
        return f70254;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static List m49422() {
        int i = 0;
        List<C21234> list = (List) C5378.stream(m49419().m36526(".i").mo23549(true)).filter(new C18411(i)).map(new C19117()).filter(new C0065(i)).collect(C22976.toList());
        if (f70249.size() - list.size() > 50) {
            ConcurrentMapC10942 concurrentMapC10942 = new ConcurrentMapC10942(list.size());
            for (C21234 c21234 : list) {
                concurrentMapC10942.put(c21234.f68445, c21234);
            }
            f70249 = concurrentMapC10942;
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14882 m49412(final long j, boolean z, InterfaceC17066 interfaceC17066, InterfaceC7827 interfaceC7827) {
        ?? arrayList;
        InterfaceC17066 interfaceC17066M38504 = C16360.m38504(interfaceC17066);
        if (interfaceC17066M38504.mo1526()) {
            return new C14882(0, 0, true);
        }
        List<C21234> list = (List) C5378.stream(m49422()).filter(new Predicate() { // from class: l.֨֡ܿ
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
                return ((C21234) obj).m48200() < j;
            }
        }).collect(C22976.toList());
        if (!z) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            AbstractC15440 abstractC15440M49419 = m49419();
            AbstractC15440 abstractC15440M36526 = abstractC15440M49419.m36526(".i");
            arrayList = new ArrayList();
            for (AbstractC15440 abstractC15440 : abstractC15440M49419.mo23549(true)) {
                String name = abstractC15440.getName();
                if (abstractC15440.mo23113() && !name.startsWith(".") && f70253.matcher(name).matches() && !abstractC15440M36526.m36526(name).mo23120()) {
                    arrayList.add(abstractC15440);
                }
            }
        }
        int size = arrayList.size() + list.size();
        if (interfaceC7827 != null) {
            interfaceC7827.mo20925(size);
        }
        int i = 0;
        for (C21234 c21234 : list) {
            if (interfaceC17066M38504.mo1526()) {
                return new C14882(size, i, true);
            }
            if (interfaceC7827 != null) {
                interfaceC7827.mo20926(c21234.m48194());
            }
            if (!c21234.delete()) {
                i++;
                m49414(Collections.singleton(c21234.m48198()));
            }
        }
        if (interfaceC17066M38504.mo1526()) {
            return new C14882(size, i, true);
        }
        for (AbstractC15440 abstractC15441 : arrayList) {
            if (interfaceC17066M38504.mo1526()) {
                return new C14882(size, i, true);
            }
            if (interfaceC7827 != null) {
                interfaceC7827.mo20926(abstractC15441.getName());
            }
            f70252.getClass();
            abstractC15441.mo23552();
            if (abstractC15441.mo23120()) {
                i++;
            }
        }
        return new C14882(size, i, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49414(Set set) {
        AbstractC15440 abstractC15440M49419 = m49419();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC15440 abstractC15440M36526 = abstractC15440M49419.m36526(".i/" + str);
            C21234 c21234M48191 = C21234.m48191(abstractC15440M36526);
            if (c21234M48191 == null) {
                abstractC15440M36526.mo23552();
                abstractC15440M49419.m36526(str).mo23552();
                f70249.remove(str);
            } else if (!c21234M48191.m48201().mo23120()) {
                c21234M48191.delete();
                abstractC15440M49419.m36526(str).mo23552();
            } else {
                long jM36490 = c21234M48191.m48201().m36490(new C5005());
                if (c21234M48191.f68444 != jM36490) {
                    C21234 c21234M48199 = c21234M48191.m48199(jM36490);
                    f70249.put(str, c21234M48199);
                    c21234M48199.m48196();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21234 m49413(String str) {
        return C21234.m48191(m49419().m36526(".i/" + str));
    }
}
