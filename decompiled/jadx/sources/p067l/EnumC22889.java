package p067l;

/* JADX INFO: renamed from: l.᩸۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7QW */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC22889 {
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


    /* JADX INFO: renamed from: ᩸ */
    public final int f72044;

    EnumC22889(int i) {
        this.f72044 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m51120(EnumC22889 enumC22889) {
        return this.f72044 > enumC22889.f72044;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC22889 m51118(EnumC22889 enumC22889, EnumC22889 enumC228810) {
        return enumC22889.f72044 > enumC228810.f72044 ? enumC22889 : enumC228810;
    }
}
