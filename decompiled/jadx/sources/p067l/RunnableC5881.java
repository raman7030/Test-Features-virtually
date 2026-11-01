package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BHP */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC5881 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public final C22783[][] f14460;

    /* JADX INFO: renamed from: ۙ */
    public final ArrayList f14461;

    /* JADX INFO: renamed from: ۬ */
    public int f14462;

    /* JADX INFO: renamed from: ᩶ */
    public final C21975 f14463;

    /* JADX INFO: renamed from: ᩸ */
    public int f14464;

    /* JADX INFO: renamed from: ᩹ */
    public final int f14465;

    public RunnableC5881(C21975 c21975) {
        int iM49513 = c21975.m49513();
        this.f14465 = iM49513;
        this.f14463 = c21975;
        this.f14464 = iM49513;
        this.f14462 = 0;
        this.f14460 = new C22783[c21975.m49517().size()][];
        this.f14461 = new ArrayList();
        C22783[] c22783Arr = new C22783[iM49513];
        for (int i = 0; i < this.f14465; i++) {
            c22783Arr[i] = C22783.m50968(i, C9566.f26318);
        }
        this.f14460[c21975.m49525()] = c22783Arr;
    }

    public RunnableC5881(int i, C21975 c21975) {
        this(c21975);
        this.f14462 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11246 c11246 = new C11246(this);
        C21975 c21975 = this.f14463;
        c21975.m49518(c11246);
        c21975.m49524(this.f14464);
        c21975.m49511();
    }

    /* JADX INFO: renamed from: ۧ */
    public static C20101 m13208(RunnableC5881 runnableC5881, int i) {
        ArrayList arrayList = runnableC5881.f14461;
        if (i < arrayList.size()) {
            return (C20101) arrayList.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13207(RunnableC5881 runnableC5881, C22783 c22783) {
        int iM50989 = c22783.m50989();
        C20101 c20101M50990 = c22783.m50990();
        ArrayList arrayList = runnableC5881.f14461;
        arrayList.ensureCapacity(iM50989 + 1);
        while (arrayList.size() <= iM50989) {
            arrayList.add(null);
        }
        arrayList.set(iM50989, c20101M50990);
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m13210(RunnableC5881 runnableC5881, int i) {
        return i < runnableC5881.f14462;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m13213(RunnableC5881 runnableC5881, int i) {
        return i < runnableC5881.f14465;
    }
}
