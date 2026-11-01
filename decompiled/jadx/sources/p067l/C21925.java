package p067l;

/* JADX INFO: renamed from: l.᩷ۖ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: B410 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21925 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC11083 f68939;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC19740 f68940;

    /* JADX INFO: renamed from: ܽ */
    public EnumC8513 f68941;

    /* JADX INFO: renamed from: ᩳ */
    public InterfaceC17406 f68942;

    public C21925(EnumC8513 enumC8513) {
        this(enumC8513, null, null, null);
    }

    public C21925(EnumC8513 enumC8513, InterfaceC19740 interfaceC19740) {
        this(enumC8513, interfaceC19740, null, null);
    }

    public C21925(EnumC8513 enumC8513, InterfaceC17406 interfaceC17406, InterfaceC11083 interfaceC11083) {
        this(enumC8513, interfaceC17406.mo6846(), interfaceC17406, interfaceC11083);
    }

    public C21925(EnumC8513 enumC8513, InterfaceC19740 interfaceC19740, InterfaceC17406 interfaceC17406, InterfaceC11083 interfaceC11083) {
        this.f68941 = enumC8513;
        this.f68940 = interfaceC19740;
        this.f68942 = interfaceC17406;
        this.f68939 = interfaceC11083;
    }

    public final String toString() {
        return "TaskEvent[" + this.f68941 + "," + this.f68940 + "," + this.f68939 + "]";
    }

    public C21925(EnumC8513 enumC8513, C3626 c3626) {
        this(enumC8513, c3626.f7516, c3626, null);
    }
}
