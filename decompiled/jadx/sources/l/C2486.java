package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۖۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X770 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2486 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f7929;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15799 f7930;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C14852 f7931;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23528 f7932;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f7933 = new HashMap();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C11138 f7934;

    public C2486(C3897 c3897, C14852 c14852, C15799 c15799, C23528 c23528) {
        String str;
        this.f7931 = c14852;
        this.f7930 = c15799;
        this.f7932 = c23528;
        this.f7934 = c23528.f75548.m39517();
        c3897.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = c15799.m37430(c14852, c23528.f75543).iterator();
        while (it.hasNext()) {
            String str2 = ((C13874) it.next()).f41355;
            if (str2.startsWith("lib/") && str2.endsWith(".so") && ((str = c23528.f75545) == null || str2.startsWith(str))) {
                arrayList.add(str2);
            }
        }
        this.f7929 = arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7976(final String str) {
        C5378.removeIf(this.f7933.keySet(), new Predicate() { // from class: l.ܺۧۜ
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
                return ((String) obj).startsWith(str + '\n');
            }
        });
    }
}
