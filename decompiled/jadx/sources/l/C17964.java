package l;

/* JADX INFO: renamed from: l.ᩳۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17964 extends AbstractC4121 implements InterfaceC3583 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12050 f56016;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C17964 f56017;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C23608 f56018;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f56019;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile Object f56020;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f56021;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte f56022;

    static {
        C20663.m47279(EnumC6551.PUBLIC, C17964.class.getName());
        f56017 = new C17964();
        f56016 = new C10909();
    }

    public C17964(C16552 c16552, int i) {
        super(c16552);
        this.f56020 = "";
        this.f56019 = 0;
        this.f56022 = (byte) -1;
    }

    public C17964() {
        this.f56020 = "";
        this.f56019 = 0;
        this.f56022 = (byte) -1;
        this.f56020 = "";
    }

    @Override // l.AbstractC4121
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32262;
        c9766.m24773(C17964.class, C16552.class);
        return c9766;
    }

    public final boolean hasName() {
        return (this.f56021 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f56020;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f56020 = strM16501;
        }
        return strM16501;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m41964() {
        return (this.f56021 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m41962() {
        return this.f56019;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m41963() {
        return (this.f56021 & 4) != 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23608 m41965() {
        C23608 c23608 = this.f56018;
        return c23608 == null ? C23608.getDefaultInstance() : c23608;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        byte b = this.f56022;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (m41963() && !m41965().isInitialized()) {
            this.f56022 = (byte) 0;
            return false;
        }
        this.f56022 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        if ((this.f56021 & 1) != 0) {
            AbstractC4121.m12380(abstractC14766, 1, this.f56020);
        }
        if ((this.f56021 & 2) != 0) {
            abstractC14766.mo35101(2, this.f56019);
        }
        if ((this.f56021 & 4) != 0) {
            abstractC14766.mo35104(3, m41965());
        }
        getUnknownFields().writeTo(abstractC14766);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM12365 = (this.f56021 & 1) != 0 ? AbstractC4121.m12365(1, this.f56020) : 0;
        if ((this.f56021 & 2) != 0) {
            iM12365 += AbstractC14766.m35074(2, this.f56019);
        }
        if ((this.f56021 & 4) != 0) {
            iM12365 += AbstractC14766.m35082(3, m41965());
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
        if (!(obj instanceof C17964)) {
            return super.equals(obj);
        }
        C17964 c17964 = (C17964) obj;
        if (hasName() != c17964.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(c17964.getName())) || m41964() != c17964.m41964()) {
            return false;
        }
        if ((!m41964() || this.f56019 == c17964.f56019) && m41963() == c17964.m41963()) {
            return (!m41963() || m41965().equals(c17964.m41965())) && getUnknownFields().equals(c17964.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC8709
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C10702.f32260.hashCode() + 779;
        if (hasName()) {
            iHashCode = C4153.m12551(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (m41964()) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + this.f56019;
        }
        if (m41963()) {
            iHashCode = C4153.m12551(iHashCode, 37, 3, 53) + m41965().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C16552 newBuilder() {
        return f56017.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return f56017.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 newBuilderForType() {
        return f56017.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C16552 toBuilder() {
        int i = 0;
        if (this == f56017) {
            return new C16552(i);
        }
        C16552 c16552 = new C16552(i);
        c16552.m38936(this);
        return c16552;
    }

    @Override // l.AbstractC8709
    public final InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C16552(interfaceC9415, 0);
    }

    public static C17964 getDefaultInstance() {
        return f56017;
    }

    public static InterfaceC12050 parser() {
        return f56016;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f56016;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f56017;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return f56017;
    }
}
