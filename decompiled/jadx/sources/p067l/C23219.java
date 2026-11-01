package p067l;

import com.umeng.analytics.pro.C0655am;
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
public final class C23219 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f72959 = 0;

    /* JADX INFO: renamed from: ܳ */
    public static AbstractC17043 f72962;

    /* JADX INFO: renamed from: ᩻ */
    public static String f72966;

    /* JADX INFO: renamed from: ܽ */
    public static final SecureRandom f72963 = new SecureRandom();

    /* JADX INFO: renamed from: ᩳ */
    public static final Pattern f72965 = Pattern.compile("[0-9A-Z]+");

    /* JADX INFO: renamed from: ۧ */
    public static ConcurrentMapC12768 f72961 = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: ۜ */
    public static boolean f72960 = true;

    /* JADX INFO: renamed from: ܿ */
    public static C21545 f72964 = new C21545();

    /* JADX INFO: renamed from: ᩷ */
    public static void m51758() {
        f72962 = null;
        f72966 = null;
        f72960 = true;
        f72961.clear();
    }

    /* JADX INFO: renamed from: ۜ */
    public static void m51752() {
        f72961.clear();
    }

    /* JADX INFO: renamed from: ܳ */
    public static boolean m51754() {
        return C7050.f18355.getBoolean("enable_recycle_bin", true);
    }

    /* JADX INFO: renamed from: ܿ */
    public static AbstractC17043 m51756() {
        AbstractC17043 abstractC17043M38684 = f72962;
        if (abstractC17043M38684 == null) {
            abstractC17043M38684 = C17853.m40542().m38684(".recycle");
            if (!abstractC17043M38684.mo25094()) {
                AbstractC17043 abstractC17043M38685 = C17853.m40542().m38684("recycle");
                if (abstractC17043M38685.mo25087()) {
                    abstractC17043M38685.mo25502(abstractC17043M38684);
                }
            }
            String strM42102 = abstractC17043M38684.mo38688() ? C18524.m42102(abstractC17043M38684.mo25505()) : null;
            if (strM42102 == null) {
                abstractC17043M38684 = C17853.f53287.m38684(".recycle.bin");
                strM42102 = C18524.m42102(abstractC17043M38684.mo25505());
                C12826.requireNonNull(strM42102);
            }
            if (abstractC17043M38684.mo25094()) {
                AbstractC17043 abstractC17043M38686 = abstractC17043M38684.m38684(".i");
                if (!abstractC17043M38686.mo25094()) {
                    AbstractC17043 abstractC17043M38687 = abstractC17043M38684.m38684(C0655am.f2275aC);
                    if (abstractC17043M38687.mo25087()) {
                        abstractC17043M38687.mo25502(abstractC17043M38686);
                    }
                }
            }
            f72962 = abstractC17043M38684;
            f72966 = strM42102;
        }
        if (f72960 && abstractC17043M38684.mo25094()) {
            try {
                abstractC17043M38684.m38684(".nomedia").m38661(new byte[0], 0, 0);
                abstractC17043M38684.m38684("README.txt").m38668("This directory stores files in the Recycle Bin. Please do not delete any files manually. If you need to delete files, you can enter the Recycle Bin from the side bar on the main interface and then delete them!\n\n此目录为回收站目录，请不要手动删除任何文件，如需删除可从主界面侧拉栏进入回收站再删除！\n");
            } catch (Exception unused) {
            }
            f72960 = false;
        }
        return abstractC17043M38684;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static String m51757() {
        if (f72966 == null) {
            m51756();
        }
        return f72966;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static List m51759() {
        int i = 0;
        List<C22549> list = (List) C7480.stream(m51756().m38684(".i").mo25500(true)).filter(new C19866(i)).map(new C20537()).filter(new C2430(i)).collect(C24205.toList());
        if (f72961.size() - list.size() > 50) {
            ConcurrentMapC12768 concurrentMapC12768 = new ConcurrentMapC12768(list.size());
            for (C22549 c22549 : list) {
                concurrentMapC12768.put(c22549.f71128, c22549);
            }
            f72961 = concurrentMapC12768;
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: ֫ */
    public static C16512 m51749(final long j, boolean z, InterfaceC18588 interfaceC18588, InterfaceC9807 interfaceC9807) {
        ?? arrayList;
        InterfaceC18588 interfaceC18588M40721 = C17917.m40721(interfaceC18588);
        if (interfaceC18588M40721.mo3924()) {
            return new C16512(0, 0, true);
        }
        List<C22549> list = (List) C7480.stream(m51759()).filter(new Predicate() { // from class: l.֨֡ܿ
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
            public /* synthetic */ Predicate m5263or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((C22549) obj).m50531() < j;
            }
        }).collect(C24205.toList());
        if (!z) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            AbstractC17043 abstractC17043M51756 = m51756();
            AbstractC17043 abstractC17043M38684 = abstractC17043M51756.m38684(".i");
            arrayList = new ArrayList();
            for (AbstractC17043 abstractC17043 : abstractC17043M51756.mo25500(true)) {
                String name = abstractC17043.getName();
                if (abstractC17043.mo25087() && !name.startsWith(".") && f72965.matcher(name).matches() && !abstractC17043M38684.m38684(name).mo25094()) {
                    arrayList.add(abstractC17043);
                }
            }
        }
        int size = arrayList.size() + list.size();
        if (interfaceC9807 != null) {
            interfaceC9807.mo22890(size);
        }
        int i = 0;
        for (C22549 c22549 : list) {
            if (interfaceC18588M40721.mo3924()) {
                return new C16512(size, i, true);
            }
            if (interfaceC9807 != null) {
                interfaceC9807.mo22891(c22549.m50525());
            }
            if (!c22549.delete()) {
                i++;
                m51751(Collections.singleton(c22549.m50529()));
            }
        }
        if (interfaceC18588M40721.mo3924()) {
            return new C16512(size, i, true);
        }
        for (AbstractC17043 abstractC17044 : arrayList) {
            if (interfaceC18588M40721.mo3924()) {
                return new C16512(size, i, true);
            }
            if (interfaceC9807 != null) {
                interfaceC9807.mo22891(abstractC17044.getName());
            }
            f72964.getClass();
            abstractC17044.mo25503();
            if (abstractC17044.mo25094()) {
                i++;
            }
        }
        return new C16512(size, i, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51751(Set set) {
        AbstractC17043 abstractC17043M51756 = m51756();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC17043 abstractC17043M38684 = abstractC17043M51756.m38684(".i/" + str);
            C22549 c22549M50522 = C22549.m50522(abstractC17043M38684);
            if (c22549M50522 == null) {
                abstractC17043M38684.mo25503();
                abstractC17043M51756.m38684(str).mo25503();
                f72961.remove(str);
            } else if (!c22549M50522.m50532().mo25094()) {
                c22549M50522.delete();
                abstractC17043M51756.m38684(str).mo25503();
            } else {
                long jM38648 = c22549M50522.m50532().m38648(new C7125());
                if (c22549M50522.f71127 != jM38648) {
                    C22549 c22549M50530 = c22549M50522.m50530(jM38648);
                    f72961.put(str, c22549M50530);
                    c22549M50530.m50527();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22549 m51750(String str) {
        return C22549.m50522(m51756().m38684(".i/" + str));
    }
}
