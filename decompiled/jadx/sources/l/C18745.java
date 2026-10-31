package l;

/* JADX INFO: renamed from: l.ᩴۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F8BR */
/* JADX INFO: loaded from: classes4.dex */
public final class C18745 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C18745 f59243 = new C18745();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC2988[] f59244;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC2821 f59245;

    public C18745() {
        AbstractC2988 abstractC2988 = C20156.f65267;
        this.f59245 = C3222.f10150;
        AbstractC2988[] abstractC2988Arr = new AbstractC2988[18];
        this.f59244 = abstractC2988Arr;
        abstractC2988Arr[9] = abstractC2988;
        for (int i = 1; i <= 17; i++) {
            if (i != 9) {
                this.f59244[i] = new C20156(i);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C18745 m43393() {
        return f59243;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC2988 m43395(int i) {
        if (i > 17) {
            i = 17;
        } else if (i < 1) {
            i = 9;
        }
        return this.f59244[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC2821 m43394() {
        return this.f59245;
    }
}
