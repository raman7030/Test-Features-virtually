package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6TZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C6542 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5089 f20190;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8905 f20191;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2309 f20192;

    public C6542(C2309 c2309, C8905 c8905, boolean z) {
        Object objLast;
        C5089 c5089;
        C15713 c15713 = c8905.f27081;
        this.f20192 = c2309;
        this.f20191 = c8905;
        if (!z) {
            objLast = c15713.last();
        } else {
            objLast = c15713.get(0);
        }
        C23224 c23224 = (C23224) objLast;
        if (!z && !c23224.m51531()) {
            int iM29347 = c23224.f74636.m29347() + c23224.f74637;
            c5089 = new C5089(iM29347, iM29347);
        } else {
            c5089 = c23224.f74643;
        }
        this.f20190 = c5089;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6542 m18043(C2309 c2309, boolean z) {
        C8905 c8905M24544;
        C9611 c9611 = c2309.f7441;
        if (z) {
            C15713 c15713 = c9611.f29155;
            c8905M24544 = !c15713.isEmpty() ? (C8905) c15713.last() : null;
        } else {
            c8905M24544 = c9611.m24544();
        }
        if (c8905M24544 == null) {
            return null;
        }
        return new C6542(c2309, c8905M24544, z);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m18045() {
        return !this.f20190.equals(this.f20192.f7443);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m18044() {
        Iterator it = this.f20191.f27081.iterator();
        int i = 0;
        while (true) {
            C20654 c20654 = (C20654) it;
            if (!c20654.hasNext()) {
                return false;
            }
            if (!((C23224) c20654.next()).m51531() && (i = i + 1) >= 64) {
                return true;
            }
        }
    }
}
