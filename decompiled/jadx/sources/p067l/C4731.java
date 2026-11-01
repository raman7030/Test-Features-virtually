package p067l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۖۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X770 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4731 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f10717;

    /* JADX INFO: renamed from: ۧ */
    public final C17384 f10718;

    /* JADX INFO: renamed from: ܳ */
    public final C16484 f10719;

    /* JADX INFO: renamed from: ܽ */
    public final C24729 f10720;

    /* JADX INFO: renamed from: ܿ */
    public final HashMap f10721 = new HashMap();

    /* JADX INFO: renamed from: ᩳ */
    public final C12954 f10722;

    public C4731(C6072 c6072, C16484 c16484, C17384 c17384, C24729 c24729) {
        String str;
        this.f10719 = c16484;
        this.f10718 = c17384;
        this.f10720 = c24729;
        this.f10722 = c24729.f78294.m41753();
        c6072.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = c17384.m39601(c16484, c24729.f78289).iterator();
        while (it.hasNext()) {
            String str2 = ((C15554) it.next()).f44436;
            if (str2.startsWith("lib/") && str2.endsWith(".so") && ((str = c24729.f78291) == null || str2.startsWith(str))) {
                arrayList.add(str2);
            }
        }
        this.f10717 = arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10024(final String str) {
        C7480.removeIf(this.f10721.keySet(), new Predicate() { // from class: l.ܺۧۜ
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
            public /* synthetic */ Predicate m39838or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((String) obj).startsWith(str + '\n');
            }
        });
    }
}
