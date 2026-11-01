package p067l;

import android.net.Uri;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 274F */
/* JADX INFO: loaded from: classes4.dex */
public final class C20549 {

    /* JADX INFO: renamed from: ֫ */
    public C4455 f63532;

    /* JADX INFO: renamed from: ۜ */
    public C20486 f63533;

    /* JADX INFO: renamed from: ܿ */
    public final RunnableC22041 f63537;

    /* JADX INFO: renamed from: ᩻ */
    public long f63539;

    /* JADX INFO: renamed from: ܳ */
    public final HashMap f63535 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public final HashSet f63534 = new HashSet();

    /* JADX INFO: renamed from: ᩳ */
    public final HashSet f63538 = new HashSet();

    /* JADX INFO: renamed from: ܽ */
    public final HashMap f63536 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m46475() {
        this.f63535.clear();
        this.f63534.clear();
        this.f63538.clear();
        this.f63536.clear();
        this.f63532 = null;
        this.f63533 = null;
        this.f63539++;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m46476(Uri uri, C7074 c7074) {
        C20486 c20486 = this.f63533;
        if (c7074 != null && c20486 != null) {
            C14450 c14450Mo11230 = c20486.mo11230();
            if (c14450Mo11230 != null && c14450Mo11230.f41282.isEmpty()) {
                Iterator it = c14450Mo11230.f41287.iterator();
                while (it.hasNext()) {
                    if (((C15120) it.next()).f43174.equals(uri)) {
                        if (this.f63536.get(uri) == c7074) {
                            return;
                        }
                        this.f63536.put(uri, c7074);
                        if (this.f63532 != null) {
                            this.f63532 = null;
                            this.f63537.run();
                        }
                        m46473(c20486, c14450Mo11230);
                        this.f63539++;
                        return;
                    }
                }
                return;
            }
            m46474();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m46477(C5318 c5318) {
        Uri uri = c5318.f12514;
        long j = c5318.f12521;
        long j2 = c5318.f12516;
        if (j2 == -1) {
            j2 = -1;
        }
        C19878 c19878 = new C19878(uri, j, j2);
        if (this.f63538.contains(c19878)) {
            return;
        }
        if (this.f63534.contains(c19878)) {
            if (this.f63532 != null) {
                this.f63532 = null;
                this.f63537.run();
            }
            return;
        }
        C5796 c5796 = (C5796) this.f63535.get(c19878);
        C20486 c20486 = this.f63533;
        if (c5796 != null && c20486 != null) {
            C4455 c4455 = new C4455(c5796.f14238, this.f63539, c5796.f14237, c20486.mo11224(), c19878, c5796.f14239);
            C4455 c4456 = this.f63532;
            if (c4456 != null && (!c4456.f10005.equals(c4455.f10005) || this.f63532.f10002 != c4455.f10002)) {
                this.f63537.run();
            }
            this.f63532 = c4455;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m46478(C20486 c20486) {
        this.f63533 = c20486;
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized C4455 m46479() {
        return this.f63532;
    }

    public C20549(RunnableC22041 runnableC22041) {
        this.f63537 = runnableC22041;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m46474() {
        HashMap map = this.f63535;
        boolean zIsEmpty = map.isEmpty();
        HashSet hashSet = this.f63538;
        HashSet hashSet2 = this.f63534;
        if (zIsEmpty && hashSet2.isEmpty() && hashSet.isEmpty() && this.f63532 == null) {
            return;
        }
        map.clear();
        hashSet2.clear();
        hashSet.clear();
        this.f63536.clear();
        this.f63532 = null;
        this.f63539++;
        this.f63537.run();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m46473(C20486 c20486, C14450 c14450) {
        long j;
        HashMap map = this.f63535;
        map.clear();
        HashSet hashSet = this.f63534;
        hashSet.clear();
        HashSet hashSet2 = this.f63538;
        hashSet2.clear();
        HashMap map2 = this.f63536;
        map2.clear();
        Iterator it = c14450.f41287.iterator();
        while (it.hasNext()) {
            Uri uri = ((C15120) it.next()).f43174;
            C7074 c7074Mo11225 = c20486.mo11225(uri, false);
            if (c7074Mo11225 != null) {
                String str = c7074Mo11225.f34777;
                map2.put(uri, c7074Mo11225);
                for (C23168 c23168 : c7074Mo11225.f18427) {
                    C23168 c23169 = c23168.f75742;
                    if (c23169 != null) {
                        j = -1;
                        Uri uriM24199 = C10486.m24199(str, c23169.f75749);
                        long j2 = c23169.f75748;
                        long j3 = c23169.f75747;
                        hashSet2.add(new C19878(uriM24199, j2, j3 == -1 ? -1L : j3));
                    } else {
                        j = -1;
                    }
                    Uri uriM241910 = C10486.m24199(str, c23168.f75749);
                    long j4 = c23168.f75748;
                    String str2 = str;
                    long j5 = c23168.f75747;
                    C19878 c19878 = new C19878(uriM241910, j4, j5 == j ? j : j5);
                    if (((C5796) C15525.putIfAbsent(map, c19878, new C5796(uri, c7074Mo11225, c23168))) != null) {
                        map.remove(c19878);
                        hashSet.add(c19878);
                    }
                    str = str2;
                    map2 = map2;
                    it = it;
                }
            }
        }
    }
}
