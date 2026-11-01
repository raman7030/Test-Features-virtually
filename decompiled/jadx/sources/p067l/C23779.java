package p067l;

/* JADX INFO: renamed from: l.᩹᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23779 extends AbstractC6285 implements InterfaceC5773 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ */
    public static final C23779 f75625;

    /* JADX INFO: renamed from: ۬ */
    public static final InterfaceC13820 f75626;

    /* JADX INFO: renamed from: ۙ */
    public int f75627;

    /* JADX INFO: renamed from: ᩶ */
    public byte f75628;

    /* JADX INFO: renamed from: ᩸ */
    public int f75629;

    /* JADX INFO: renamed from: ᩹ */
    public int f75630;

    static {
        C22006.m49606(EnumC8594.PUBLIC, C23779.class.getName());
        f75625 = new C23779();
        f75626 = new C17072();
    }

    public C23779(C23109 c23109, int i) {
        super(c23109);
        this.f75627 = 0;
        this.f75630 = 0;
        this.f75628 = (byte) -1;
    }

    public C23779() {
        this.f75627 = 0;
        this.f75630 = 0;
        this.f75628 = (byte) -1;
    }

    @Override // p067l.AbstractC6285
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35223;
        c11650.m26787(C23779.class, C23109.class);
        return c11650;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m52868() {
        return (this.f75629 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m52870() {
        return this.f75627;
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m52869() {
        return (this.f75629 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m52867() {
        return this.f75630;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.f75628;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f75628 = (byte) 1;
        return true;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        if ((this.f75629 & 1) != 0) {
            abstractC16402.mo37248(1, this.f75627);
        }
        if ((this.f75629 & 2) != 0) {
            abstractC16402.mo37248(2, this.f75630);
        }
        getUnknownFields().writeTo(abstractC16402);
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM37221 = (this.f75629 & 1) != 0 ? AbstractC16402.m37221(1, this.f75627) : 0;
        if ((this.f75629 & 2) != 0) {
            iM37221 += AbstractC16402.m37221(2, this.f75630);
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
        if (!(obj instanceof C23779)) {
            return super.equals(obj);
        }
        C23779 c23779 = (C23779) obj;
        if (m52868() != c23779.m52868()) {
            return false;
        }
        if ((!m52868() || this.f75627 == c23779.f75627) && m52869() == c23779.m52869()) {
            return (!m52869() || this.f75630 == c23779.f75630) && getUnknownFields().equals(c23779.getUnknownFields());
        }
        return false;
    }

    @Override // p067l.AbstractC10645
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12539.f35231.hashCode() + 779;
        if (m52868()) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + this.f75627;
        }
        if (m52869()) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + this.f75630;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C23109 newBuilder() {
        return f75625.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return f75625.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 newBuilderForType() {
        return f75625.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C23109 toBuilder() {
        int i = 0;
        if (this == f75625) {
            return new C23109(i);
        }
        C23109 c23109 = new C23109(i);
        c23109.m51540(this);
        return c23109;
    }

    @Override // p067l.AbstractC10645
    public final InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C23109(interfaceC11316);
    }

    public static C23779 getDefaultInstance() {
        return f75625;
    }

    public static InterfaceC13820 parser() {
        return f75626;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f75626;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f75625;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return f75625;
    }
}
