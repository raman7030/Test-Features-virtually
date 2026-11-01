package p067l;

/* JADX INFO: renamed from: l.᩷᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: D906 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22396 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC4449[] f70660;

    /* JADX INFO: renamed from: ܽ */
    public int f70662 = -1;

    /* JADX INFO: renamed from: ۧ */
    public int f70661 = -1;

    /* JADX INFO: renamed from: ᩳ */
    public int f70663 = 0;

    public C22396(InterfaceC4449... interfaceC4449Arr) {
        this.f70660 = interfaceC4449Arr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC4449[] m50302() {
        return this.f70660;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m50305() {
        return this.f70662;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m50303() {
        return this.f70661;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m50307() {
        return this.f70663;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C22396 m50304(int i) {
        this.f70662 = i;
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C22396 m50301(int i) {
        this.f70661 = i;
        return this;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C22396 m50306(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("Lines must be >= 1");
        }
        this.f70663 = i;
        return this;
    }
}
