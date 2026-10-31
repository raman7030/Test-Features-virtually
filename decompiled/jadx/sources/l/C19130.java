package l;

import android.net.Uri;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 274F */
/* JADX INFO: loaded from: classes4.dex */
public final class C19130 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C2196 f60300;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C19063 f60301;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final RunnableC20699 f60305;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f60307;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashMap f60303 = new HashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashSet f60302 = new HashSet();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashSet f60306 = new HashSet();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f60304 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m44181() {
        this.f60303.clear();
        this.f60302.clear();
        this.f60306.clear();
        this.f60304.clear();
        this.f60300 = null;
        this.f60301 = null;
        this.f60307++;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m44182(Uri uri, C4951 c4951) {
        C19063 c19063 = this.f60301;
        if (c4951 != null && c19063 != null) {
            C12712 c12712Mo9179 = c19063.mo9179();
            if (c12712Mo9179 != null && c12712Mo9179.f38253.isEmpty()) {
                Iterator it = c12712Mo9179.f38258.iterator();
                while (it.hasNext()) {
                    if (((C13417) it.next()).f40105.equals(uri)) {
                        if (this.f60304.get(uri) == c4951) {
                            return;
                        }
                        this.f60304.put(uri, c4951);
                        if (this.f60300 != null) {
                            this.f60300 = null;
                            this.f60305.run();
                        }
                        m44179(c19063, c12712Mo9179);
                        this.f60307++;
                        return;
                    }
                }
                return;
            }
            m44180();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m44183(C3104 c3104) {
        Uri uri = c3104.f9711;
        long j = c3104.f9718;
        long j2 = c3104.f9713;
        if (j2 == -1) {
            j2 = -1;
        }
        C18424 c18424 = new C18424(uri, j, j2);
        if (this.f60306.contains(c18424)) {
            return;
        }
        if (this.f60302.contains(c18424)) {
            if (this.f60300 != null) {
                this.f60300 = null;
                this.f60305.run();
            }
            return;
        }
        C3607 c3607 = (C3607) this.f60303.get(c18424);
        C19063 c19063 = this.f60301;
        if (c3607 != null && c19063 != null) {
            C2196 c2196 = new C2196(c3607.f11434, this.f60307, c3607.f11433, c19063.mo9173(), c18424, c3607.f11435);
            C2196 c2197 = this.f60300;
            if (c2197 != null && (!c2197.f7220.equals(c2196.f7220) || this.f60300.f7217 != c2196.f7217)) {
                this.f60305.run();
            }
            this.f60300 = c2196;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m44184(C19063 c19063) {
        this.f60301 = c19063;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized C2196 m44185() {
        return this.f60300;
    }

    public C19130(RunnableC20699 runnableC20699) {
        this.f60305 = runnableC20699;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m44180() {
        HashMap map = this.f60303;
        boolean zIsEmpty = map.isEmpty();
        HashSet hashSet = this.f60306;
        HashSet hashSet2 = this.f60302;
        if (zIsEmpty && hashSet2.isEmpty() && hashSet.isEmpty() && this.f60300 == null) {
            return;
        }
        map.clear();
        hashSet2.clear();
        hashSet.clear();
        this.f60304.clear();
        this.f60300 = null;
        this.f60307++;
        this.f60305.run();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m44179(C19063 c19063, C12712 c12712) {
        long j;
        HashMap map = this.f60303;
        map.clear();
        HashSet hashSet = this.f60302;
        hashSet.clear();
        HashSet hashSet2 = this.f60306;
        hashSet2.clear();
        HashMap map2 = this.f60304;
        map2.clear();
        Iterator it = c12712.f38258.iterator();
        while (it.hasNext()) {
            Uri uri = ((C13417) it.next()).f40105;
            C4951 c4951Mo9174 = c19063.mo9174(uri, false);
            if (c4951Mo9174 != null) {
                String str = c4951Mo9174.f31806;
                map2.put(uri, c4951Mo9174);
                for (C21885 c21885 : c4951Mo9174.f15593) {
                    C21885 c21886 = c21885.f73015;
                    if (c21886 != null) {
                        j = -1;
                        Uri uriM22231 = C8542.m22231(str, c21886.f73022);
                        long j2 = c21886.f73021;
                        long j3 = c21886.f73020;
                        hashSet2.add(new C18424(uriM22231, j2, j3 == -1 ? -1L : j3));
                    } else {
                        j = -1;
                    }
                    Uri uriM22232 = C8542.m22231(str, c21885.f73022);
                    long j4 = c21885.f73021;
                    String str2 = str;
                    long j5 = c21885.f73020;
                    C18424 c18424 = new C18424(uriM22232, j4, j5 == j ? j : j5);
                    if (((C3607) C13843.putIfAbsent(map, c18424, new C3607(uri, c4951Mo9174, c21885))) != null) {
                        map.remove(c18424);
                        hashSet.add(c18424);
                    }
                    str = str2;
                    map2 = map2;
                    it = it;
                }
            }
        }
    }
}
