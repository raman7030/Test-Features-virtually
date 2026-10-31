package l;

/* JADX INFO: renamed from: l.֫ۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1715 extends AbstractC4121 implements InterfaceC3583 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12050 f5924;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C1715 f5925;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C5969 f5926;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte f5927;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C5969 f5928;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f5929;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f5930;

    static {
        C20663.m47279(EnumC6551.PUBLIC, C1715.class.getName());
        f5925 = new C1715();
        f5924 = new C13729();
    }

    public C1715(C7380 c7380, int i) {
        super(c7380);
        this.f5930 = 0;
        this.f5927 = (byte) -1;
    }

    public C1715() {
        this.f5927 = (byte) -1;
        this.f5930 = 0;
    }

    @Override // l.AbstractC4121
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32264;
        c9766.m24773(C1715.class, C7380.class);
        return c9766;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m5753() {
        return (this.f5929 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final EnumC3478 m5752() {
        EnumC3478 enumC3478M10650 = EnumC3478.m10650(this.f5930);
        return enumC3478M10650 == null ? EnumC3478.EDITION_UNKNOWN : enumC3478M10650;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m5751() {
        return (this.f5929 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C5969 m5754() {
        C5969 c5969 = this.f5926;
        return c5969 == null ? C5969.getDefaultInstance() : c5969;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m5755() {
        return (this.f5929 & 4) != 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5969 m5756() {
        C5969 c5969 = this.f5928;
        return c5969 == null ? C5969.getDefaultInstance() : c5969;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        byte b = this.f5927;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (m5751() && !m5754().isInitialized()) {
            this.f5927 = (byte) 0;
            return false;
        }
        if (m5755() && !m5756().isInitialized()) {
            this.f5927 = (byte) 0;
            return false;
        }
        this.f5927 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        if ((this.f5929 & 1) != 0) {
            abstractC14766.mo35101(3, this.f5930);
        }
        if ((this.f5929 & 2) != 0) {
            abstractC14766.mo35104(4, m5754());
        }
        if ((this.f5929 & 4) != 0) {
            abstractC14766.mo35104(5, m5756());
        }
        getUnknownFields().writeTo(abstractC14766);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35079 = (this.f5929 & 1) != 0 ? AbstractC14766.m35079(3, this.f5930) : 0;
        if ((this.f5929 & 2) != 0) {
            iM35079 += AbstractC14766.m35082(4, m5754());
        }
        if ((this.f5929 & 4) != 0) {
            iM35079 += AbstractC14766.m35082(5, m5756());
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM35079;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC8709
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1715)) {
            return super.equals(obj);
        }
        C1715 c1715 = (C1715) obj;
        if (m5753() != c1715.m5753()) {
            return false;
        }
        if ((m5753() && this.f5930 != c1715.f5930) || m5751() != c1715.m5751()) {
            return false;
        }
        if ((!m5751() || m5754().equals(c1715.m5754())) && m5755() == c1715.m5755()) {
            return (!m5755() || m5756().equals(c1715.m5756())) && getUnknownFields().equals(c1715.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC8709
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C10702.f32270.hashCode() + 779;
        if (m5753()) {
            iHashCode = C4153.m12551(iHashCode, 37, 3, 53) + this.f5930;
        }
        if (m5751()) {
            iHashCode = C4153.m12551(iHashCode, 37, 4, 53) + m5754().hashCode();
        }
        if (m5755()) {
            iHashCode = C4153.m12551(iHashCode, 37, 5, 53) + m5756().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C7380 newBuilder() {
        return f5925.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return f5925.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 newBuilderForType() {
        return f5925.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C7380 toBuilder() {
        int i = 0;
        if (this == f5925) {
            return new C7380(i);
        }
        C7380 c7380 = new C7380(i);
        c7380.m19838(this);
        return c7380;
    }

    @Override // l.AbstractC8709
    public final InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C7380(interfaceC9415, 0);
    }

    public static C1715 getDefaultInstance() {
        return f5925;
    }

    public static InterfaceC12050 parser() {
        return f5924;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f5924;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f5925;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return f5925;
    }
}
