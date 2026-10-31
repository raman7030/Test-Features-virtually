package l;

/* JADX INFO: renamed from: l.᩸۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7QW */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC21592 {
    INIT(0),
    PARSE(1),
    ENTER(2),
    PROCESS(3),
    ATTR(4),
    FLOW(5),
    TRANSTYPES(6),
    TRANSPATTERNS(7),
    UNLAMBDA(8),
    LOWER(9),
    GENERATE(10);


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f69340;

    EnumC21592(int i) {
        this.f69340 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m48773(EnumC21592 enumC21592) {
        return this.f69340 > enumC21592.f69340;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC21592 m48771(EnumC21592 enumC21592, EnumC21592 enumC21593) {
        return enumC21592.f69340 > enumC21593.f69340 ? enumC21592 : enumC21593;
    }
}
