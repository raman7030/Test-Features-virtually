package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BHP */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC3696 implements Runnable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C21480[][] f11658;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f11659;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f11660;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C20630 f11661;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f11662;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f11663;

    public RunnableC3696(C20630 c20630) {
        int iM47186 = c20630.m47186();
        this.f11663 = iM47186;
        this.f11661 = c20630;
        this.f11662 = iM47186;
        this.f11660 = 0;
        this.f11658 = new C21480[c20630.m47190().size()][];
        this.f11659 = new ArrayList();
        C21480[] c21480Arr = new C21480[iM47186];
        for (int i = 0; i < this.f11663; i++) {
            c21480Arr[i] = C21480.m48631(i, C7573.f23406);
        }
        this.f11658[c20630.m47198()] = c21480Arr;
    }

    public RunnableC3696(int i, C20630 c20630) {
        this(c20630);
        this.f11660 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9341 c9341 = new C9341(this);
        C20630 c20630 = this.f11661;
        c20630.m47191(c9341);
        c20630.m47197(this.f11662);
        c20630.m47184();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C18658 m11262(RunnableC3696 runnableC3696, int i) {
        ArrayList arrayList = runnableC3696.f11659;
        if (i < arrayList.size()) {
            return (C18658) arrayList.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11261(RunnableC3696 runnableC3696, C21480 c21480) {
        int iM48652 = c21480.m48652();
        C18658 c18658M48653 = c21480.m48653();
        ArrayList arrayList = runnableC3696.f11659;
        arrayList.ensureCapacity(iM48652 + 1);
        while (arrayList.size() <= iM48652) {
            arrayList.add(null);
        }
        arrayList.set(iM48652, c18658M48653);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m11264(RunnableC3696 runnableC3696, int i) {
        return i < runnableC3696.f11660;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m11267(RunnableC3696 runnableC3696, int i) {
        return i < runnableC3696.f11663;
    }
}
