package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18DH */
/* JADX INFO: loaded from: classes3.dex */
public class C8968 implements InterfaceC19697 {

    /* JADX INFO: renamed from: ۧ */
    public C17684 f24298;

    /* JADX INFO: renamed from: ܽ */
    public double[] f24299 = new double[8];

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f24297 = new ArrayList();

    public C8968(C17684 c17684, double d) {
        this.f24298 = c17684;
        mo20716(d);
    }

    /* JADX INFO: renamed from: ܿ */
    public double[] mo20721() {
        return this.f24299;
    }

    /* JADX INFO: renamed from: ᩳ */
    public double mo20722() {
        return this.f24299[0];
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo20716(double d) {
        int i = 0;
        while (true) {
            double[] dArr = this.f24299;
            if (i >= dArr.length) {
                return;
            }
            dArr[i] = d;
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20712(C8968 c8968, C8968 c8969) {
        ArrayList arrayList = c8968.f24297;
        if (!arrayList.contains(c8969)) {
            arrayList.add(c8969);
        }
        ArrayList arrayList2 = c8969.f24297;
        if (arrayList2.contains(c8968)) {
            return;
        }
        arrayList2.add(c8968);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m20713(C8968 c8968) {
        ArrayList arrayList = c8968.f24297;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C8968) it.next()).f24297.remove(c8968);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8968 m20714(int i) {
        return (C8968) this.f24297.get(i);
    }

    @Override // p067l.InterfaceC19697
    /* JADX INFO: renamed from: ֫ */
    public final void mo20717(long j) {
        for (int i = 0; i < this.f24297.size(); i++) {
            m20714(i).f24298.m51438().m55055(j);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m20720() {
        return this.f24297.size();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m20719() {
        double[] dArr = this.f24299;
        double d = dArr[dArr.length - 1];
        for (int i = 0; i < dArr.length - 1; i++) {
            dArr[i] = d;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20718(C8968 c8968) {
        C17684 c17684 = this.f24298;
        C9226 c9226M51437 = c17684.m51437();
        C9226 c9226M51438 = c8968.f24298.m51437();
        if (c9226M51437 != c9226M51438 && c9226M51437 != null && c9226M51438 != null) {
            throw new RuntimeException("Connection between units on different synths.");
        }
        c17684.m51434(new C16343(this, c8968));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20715() {
        this.f24298.m51434(new C25061(this));
    }
}
