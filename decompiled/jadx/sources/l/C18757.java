package l;

/* JADX INFO: renamed from: l.ᩴ۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6P4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18757 implements InterfaceC23125 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f59262;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f59263;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CharSequence f59264;

    @Override // l.InterfaceC14574
    /* JADX INFO: renamed from: ֫ */
    public final int mo6200() {
        return -1;
    }

    @Override // l.InterfaceC14574
    /* JADX INFO: renamed from: ܽ */
    public final void mo6207(int i) {
    }

    public C18757(CharSequence charSequence) {
        this.f59264 = charSequence;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final char m43431(int i) {
        return this.f59264.charAt(i);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m43430() {
        if (Thread.currentThread().isInterrupted()) {
            throw new C3940();
        }
    }

    @Override // l.InterfaceC14574
    /* JADX INFO: renamed from: ۧ */
    public final void mo6204() {
        if (this.f59262 >= this.f59264.length()) {
            throw new IllegalStateException("Cannot consume EOF");
        }
        int i = this.f59262 + 1;
        this.f59262 = i;
        if ((i & 1023) == 0) {
            m43430();
        }
    }

    @Override // l.InterfaceC14574
    /* JADX INFO: renamed from: ۧ */
    public final int mo6203(int i) {
        int i2 = this.f59263 + 1;
        this.f59263 = i2;
        if ((i2 & 1023) == 0) {
            m43430();
        }
        if (i == 0) {
            return 0;
        }
        int i3 = this.f59262;
        if (i > 0) {
            i--;
        }
        int i4 = i3 + i;
        if (i4 < 0) {
            return -1;
        }
        CharSequence charSequence = this.f59264;
        if (i4 >= charSequence.length()) {
            return -1;
        }
        return charSequence.charAt(i4);
    }

    @Override // l.InterfaceC14574
    public final int index() {
        return this.f59262;
    }

    @Override // l.InterfaceC14574
    /* JADX INFO: renamed from: ֫ */
    public final void mo6201(int i) {
        this.f59262 = i;
    }

    @Override // l.InterfaceC14574
    public final int size() {
        return this.f59264.length();
    }

    @Override // l.InterfaceC23125
    /* JADX INFO: renamed from: ֫ */
    public final String mo12025(C14763 c14763) {
        int i = c14763.f45081;
        CharSequence charSequence = this.f59264;
        return C2732.m8476(i, Math.min(charSequence.length(), c14763.f45082 + 1), charSequence);
    }
}
