package l;

/* JADX INFO: renamed from: l.ܺᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: U8MS */
/* JADX INFO: loaded from: classes4.dex */
public final class C16113 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C16113 f49648;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f49649;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f49650;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f49651 = 0;

    static {
        C9059 c9059 = new C9059();
        C22632.m50631(true);
        f49648 = new C16113(c9059);
        C3603.m11056(0);
        C3603.m11056(1);
        C3603.m11056(2);
        C3603.m11056(3);
    }

    public C16113(C9059 c9059) {
        c9059.getClass();
        this.f49650 = 0;
        c9059.getClass();
        this.f49649 = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16113)) {
            return false;
        }
        C16113 c16113 = (C16113) obj;
        return this.f49651 == c16113.f49651 && this.f49650 == c16113.f49650 && this.f49649 == c16113.f49649;
    }

    public final int hashCode() {
        return (((((this.f49651 + 527) * 31) + this.f49650) * 31) + this.f49649) * 31;
    }
}
