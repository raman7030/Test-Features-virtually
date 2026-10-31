package l;

/* JADX INFO: renamed from: l.֨֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes3.dex */
public final class C0791 extends C0085 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C4299 f2905;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10795 f2906;

    public C0791(C4299 c4299) {
        super(c4299);
        this.f2905 = c4299;
        this.f2906 = c4299.f20243;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0791 m2995(C5855 c5855) {
        if (!(c5855 instanceof C4299)) {
            return null;
        }
        C4299 c4299 = (C4299) c5855;
        if (c4299.f20242 > 0) {
            return new C0791(c4299);
        }
        return null;
    }
}
