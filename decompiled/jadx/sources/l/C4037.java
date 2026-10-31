package l;

/* JADX INFO: renamed from: l.ۘܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4037 extends AbstractC4121 implements InterfaceC3583 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final C4037 f12806;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12050 f12807;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C0508 f12808;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile Object f12809;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f12810;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte f12811;

    static {
        C20663.m47279(EnumC6551.PUBLIC, C4037.class.getName());
        f12806 = new C4037();
        f12807 = new C16030();
    }

    public C4037(C2626 c2626, int i) {
        super(c2626);
        this.f12809 = "";
        this.f12811 = (byte) -1;
    }

    public C4037() {
        this.f12809 = "";
        this.f12811 = (byte) -1;
        this.f12809 = "";
    }

    @Override // l.AbstractC4121
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32224;
        c9766.m24773(C4037.class, C2626.class);
        return c9766;
    }

    public final boolean hasName() {
        return (this.f12810 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f12809;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f12809 = strM16501;
        }
        return strM16501;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m12139() {
        return (this.f12810 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C0508 m12138() {
        C0508 c0508 = this.f12808;
        return c0508 == null ? C0508.getDefaultInstance() : c0508;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        byte b = this.f12811;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (m12139() && !m12138().isInitialized()) {
            this.f12811 = (byte) 0;
            return false;
        }
        this.f12811 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        if ((this.f12810 & 1) != 0) {
            AbstractC4121.m12380(abstractC14766, 1, this.f12809);
        }
        if ((this.f12810 & 2) != 0) {
            abstractC14766.mo35104(2, m12138());
        }
        getUnknownFields().writeTo(abstractC14766);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM12365 = (this.f12810 & 1) != 0 ? AbstractC4121.m12365(1, this.f12809) : 0;
        if ((this.f12810 & 2) != 0) {
            iM12365 += AbstractC14766.m35082(2, m12138());
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM12365;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC8709
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4037)) {
            return super.equals(obj);
        }
        C4037 c4037 = (C4037) obj;
        if (hasName() != c4037.hasName()) {
            return false;
        }
        if ((!hasName() || getName().equals(c4037.getName())) && m12139() == c4037.m12139()) {
            return (!m12139() || m12138().equals(c4037.m12138())) && getUnknownFields().equals(c4037.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC8709
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C10702.f32220.hashCode() + 779;
        if (hasName()) {
            iHashCode = C4153.m12551(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (m12139()) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + m12138().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C2626 newBuilder() {
        return f12806.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return f12806.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 newBuilderForType() {
        return f12806.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C2626 toBuilder() {
        int i = 0;
        if (this == f12806) {
            return new C2626(i);
        }
        C2626 c2626 = new C2626(i);
        c2626.m8260(this);
        return c2626;
    }

    @Override // l.AbstractC8709
    public final InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C2626(interfaceC9415, 0);
    }

    public static C4037 getDefaultInstance() {
        return f12806;
    }

    public static InterfaceC12050 parser() {
        return f12807;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f12807;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f12806;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return f12806;
    }
}
