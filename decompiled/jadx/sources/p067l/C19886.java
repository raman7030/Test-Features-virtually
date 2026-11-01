package p067l;

/* JADX INFO: renamed from: l.ᩴ֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7HH */
/* JADX INFO: loaded from: classes4.dex */
public final class C19886 {

    /* JADX INFO: renamed from: ֫ */
    public String f60419;

    /* JADX INFO: renamed from: ۧ */
    public final int f60420;

    /* JADX INFO: renamed from: ܽ */
    public int f60421 = -1;

    /* JADX INFO: renamed from: ܽ */
    public final synchronized void m45180() {
        notifyAll();
        synchronized (C20557.f63553) {
            C20557.f63553.remove(this.f60420);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final synchronized boolean m45181() {
        System.out.println("waitStatusChanged " + this.f60420);
        int i = this.f60421;
        if (i == 0 || i == 3 || i == 2) {
            return false;
        }
        try {
            wait(15000L);
        } catch (InterruptedException unused) {
        }
        return i != this.f60421;
    }

    public C19886(int i) {
        this.f60420 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m45179() {
        return this.f60421;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m45178() {
        return this.f60419;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45177(C19886 c19886, int i, String str) {
        synchronized (c19886) {
            System.out.println("update " + c19886.f60420 + " status " + i + " extra " + str);
            c19886.f60421 = i;
            c19886.f60419 = str;
            c19886.notifyAll();
        }
    }
}
