package l;

/* JADX INFO: renamed from: l.ܶ֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes5.dex */
public final class C14902 extends C0085 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C17019 f45460;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10795 f45461;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f45462;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C20673 f45463;

    public C14902(C20673 c20673, C19822 c19822, C17019 c17019) {
        super(c20673);
        this.f45463 = c20673;
        this.f45461 = c19822.f75432;
        this.f45460 = c17019;
        this.f45462 = c20673.f66618;
        int unused = c17019.f52192;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14902 m35356(C5855 c5855) {
        C20673 c20673;
        int i;
        if (!(c5855 instanceof C20673) || (i = (c20673 = (C20673) c5855).f66618) <= 0 || i != c20673.f66616) {
            return null;
        }
        C5855 c5856 = c20673.f66615;
        if (!(c5856 instanceof C19822)) {
            return null;
        }
        C19822 c19822 = (C19822) c5856;
        C17019 c17019M39979 = C17019.m39979(c20673.f17958, c19822.f75432, i);
        if (c17019M39979 == null) {
            return null;
        }
        return new C14902(c20673, c19822, c17019M39979);
    }
}
