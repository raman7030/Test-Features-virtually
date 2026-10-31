package l;

/* JADX INFO: renamed from: l.ۨ᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11945 extends AbstractC4121 implements InterfaceC3583 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final C11945 f35704;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12050 f35705;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f35706;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte f35707;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f35708;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f35709;

    static {
        C20663.m47279(EnumC6551.PUBLIC, C11945.class.getName());
        f35704 = new C11945();
        f35705 = new C10534();
    }

    public C11945(C6300 c6300, int i) {
        super(c6300);
        this.f35706 = 0;
        this.f35709 = 0;
        this.f35707 = (byte) -1;
    }

    public C11945() {
        this.f35706 = 0;
        this.f35709 = 0;
        this.f35707 = (byte) -1;
    }

    @Override // l.AbstractC4121
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32237;
        c9766.m24773(C11945.class, C6300.class);
        return c9766;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m29136() {
        return (this.f35708 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m29138() {
        return this.f35706;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m29137() {
        return (this.f35708 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m29135() {
        return this.f35709;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        byte b = this.f35707;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f35707 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        if ((this.f35708 & 1) != 0) {
            abstractC14766.mo35101(1, this.f35706);
        }
        if ((this.f35708 & 2) != 0) {
            abstractC14766.mo35101(2, this.f35709);
        }
        getUnknownFields().writeTo(abstractC14766);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35074 = (this.f35708 & 1) != 0 ? AbstractC14766.m35074(1, this.f35706) : 0;
        if ((this.f35708 & 2) != 0) {
            iM35074 += AbstractC14766.m35074(2, this.f35709);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM35074;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC8709
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11945)) {
            return super.equals(obj);
        }
        C11945 c11945 = (C11945) obj;
        if (m29136() != c11945.m29136()) {
            return false;
        }
        if ((!m29136() || this.f35706 == c11945.f35706) && m29137() == c11945.m29137()) {
            return (!m29137() || this.f35709 == c11945.f35709) && getUnknownFields().equals(c11945.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC8709
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C10702.f32266.hashCode() + 779;
        if (m29136()) {
            iHashCode = C4153.m12551(iHashCode, 37, 1, 53) + this.f35706;
        }
        if (m29137()) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + this.f35709;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C6300 newBuilder() {
        return f35704.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return f35704.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 newBuilderForType() {
        return f35704.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C6300 toBuilder() {
        int i = 0;
        if (this == f35704) {
            return new C6300(i);
        }
        C6300 c6300 = new C6300(i);
        c6300.m17342(this);
        return c6300;
    }

    @Override // l.AbstractC8709
    public final InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C6300(interfaceC9415);
    }

    public static C11945 getDefaultInstance() {
        return f35704;
    }

    public static InterfaceC12050 parser() {
        return f35705;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f35705;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f35704;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return f35704;
    }
}
