package p067l;

/* JADX INFO: renamed from: l.ۨ᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13721 extends AbstractC6285 implements InterfaceC5773 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ */
    public static final C13721 f38715;

    /* JADX INFO: renamed from: ۬ */
    public static final InterfaceC13820 f38716;

    /* JADX INFO: renamed from: ۙ */
    public int f38717;

    /* JADX INFO: renamed from: ᩶ */
    public byte f38718;

    /* JADX INFO: renamed from: ᩸ */
    public int f38719;

    /* JADX INFO: renamed from: ᩹ */
    public int f38720;

    static {
        C22006.m49606(EnumC8594.PUBLIC, C13721.class.getName());
        f38715 = new C13721();
        f38716 = new C12380();
    }

    public C13721(C8356 c8356, int i) {
        super(c8356);
        this.f38717 = 0;
        this.f38720 = 0;
        this.f38718 = (byte) -1;
    }

    public C13721() {
        this.f38717 = 0;
        this.f38720 = 0;
        this.f38718 = (byte) -1;
    }

    @Override // p067l.AbstractC6285
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35212;
        c11650.m26787(C13721.class, C8356.class);
        return c11650;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m31190() {
        return (this.f38719 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m31192() {
        return this.f38717;
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m31191() {
        return (this.f38719 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m31189() {
        return this.f38720;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.f38718;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f38718 = (byte) 1;
        return true;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        if ((this.f38719 & 1) != 0) {
            abstractC16402.mo37248(1, this.f38717);
        }
        if ((this.f38719 & 2) != 0) {
            abstractC16402.mo37248(2, this.f38720);
        }
        getUnknownFields().writeTo(abstractC16402);
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM37221 = (this.f38719 & 1) != 0 ? AbstractC16402.m37221(1, this.f38717) : 0;
        if ((this.f38719 & 2) != 0) {
            iM37221 += AbstractC16402.m37221(2, this.f38720);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM37221;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // p067l.AbstractC10645
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13721)) {
            return super.equals(obj);
        }
        C13721 c13721 = (C13721) obj;
        if (m31190() != c13721.m31190()) {
            return false;
        }
        if ((!m31190() || this.f38717 == c13721.f38717) && m31191() == c13721.m31191()) {
            return (!m31191() || this.f38720 == c13721.f38720) && getUnknownFields().equals(c13721.getUnknownFields());
        }
        return false;
    }

    @Override // p067l.AbstractC10645
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12539.f35241.hashCode() + 779;
        if (m31190()) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + this.f38717;
        }
        if (m31191()) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + this.f38720;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C8356 newBuilder() {
        return f38715.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return f38715.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 newBuilderForType() {
        return f38715.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C8356 toBuilder() {
        int i = 0;
        if (this == f38715) {
            return new C8356(i);
        }
        C8356 c8356 = new C8356(i);
        c8356.m19282(this);
        return c8356;
    }

    @Override // p067l.AbstractC10645
    public final InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C8356(interfaceC11316);
    }

    public static C13721 getDefaultInstance() {
        return f38715;
    }

    public static InterfaceC13820 parser() {
        return f38716;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f38716;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f38715;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return f38715;
    }
}
