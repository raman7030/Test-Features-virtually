package l;

/* JADX INFO: renamed from: l.᩸֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes5.dex */
public final class C21254 extends C0085 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C5855 f68574;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C17019 f68575;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C5855 f68576;

    public C21254(C5855 c5855, C17019 c17019, C5855 c5856) {
        super(c5855);
        this.f68576 = c5855;
        this.f68575 = c17019;
        int unused = c17019.f52192;
        this.f68574 = c5856;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21254 m48260(C5855 c5855, C0085 c0085) {
        C17019 c17019M39981 = C17019.m39981(c5855);
        if (c17019M39981 == null) {
            return null;
        }
        if (c17019M39981.f52192 != 0 || c17019M39981.f52191) {
            return new C21254(c5855, c17019M39981, c0085);
        }
        return null;
    }
}
