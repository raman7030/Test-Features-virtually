package l;

/* JADX INFO: renamed from: l.ܳܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14619 extends AbstractC4121 implements InterfaceC3583 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C14619 f44712;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12050 f44713;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public volatile Object f44714;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte f44715;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f44716;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile Object f44717;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C8976 f44718;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile Object f44719;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f44720;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f44721;

    static {
        C20663.m47279(EnumC6551.PUBLIC, C14619.class.getName());
        f44712 = new C14619();
        f44713 = new C18148();
    }

    public C14619(C17442 c17442, int i) {
        super(c17442);
        this.f44714 = "";
        this.f44719 = "";
        this.f44717 = "";
        this.f44721 = false;
        this.f44716 = false;
        this.f44715 = (byte) -1;
    }

    public C14619() {
        this.f44714 = "";
        this.f44719 = "";
        this.f44717 = "";
        this.f44721 = false;
        this.f44716 = false;
        this.f44715 = (byte) -1;
        this.f44714 = "";
        this.f44719 = "";
        this.f44717 = "";
    }

    @Override // l.AbstractC4121
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32238;
        c9766.m24773(C14619.class, C17442.class);
        return c9766;
    }

    public final boolean hasName() {
        return (this.f44720 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f44714;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f44714 = strM16501;
        }
        return strM16501;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m34904() {
        return (this.f44720 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m34911() {
        Object obj = this.f44719;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f44719 = strM16501;
        }
        return strM16501;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m34910() {
        return (this.f44720 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m34906() {
        Object obj = this.f44717;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f44717 = strM16501;
        }
        return strM16501;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m34909() {
        return (this.f44720 & 8) != 0;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C8976 m34907() {
        C8976 c8976 = this.f44718;
        return c8976 == null ? C8976.getDefaultInstance() : c8976;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m34903() {
        return (this.f44720 & 16) != 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m34905() {
        return this.f44721;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m34902() {
        return (this.f44720 & 32) != 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m34908() {
        return this.f44716;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        byte b = this.f44715;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (m34909() && !m34907().isInitialized()) {
            this.f44715 = (byte) 0;
            return false;
        }
        this.f44715 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        if ((this.f44720 & 1) != 0) {
            AbstractC4121.m12380(abstractC14766, 1, this.f44714);
        }
        if ((this.f44720 & 2) != 0) {
            AbstractC4121.m12380(abstractC14766, 2, this.f44719);
        }
        if ((this.f44720 & 4) != 0) {
            AbstractC4121.m12380(abstractC14766, 3, this.f44717);
        }
        if ((this.f44720 & 8) != 0) {
            abstractC14766.mo35104(4, m34907());
        }
        if ((this.f44720 & 16) != 0) {
            abstractC14766.mo35093(5, this.f44721);
        }
        if ((this.f44720 & 32) != 0) {
            abstractC14766.mo35093(6, this.f44716);
        }
        getUnknownFields().writeTo(abstractC14766);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM12365 = (this.f44720 & 1) != 0 ? AbstractC4121.m12365(1, this.f44714) : 0;
        if ((this.f44720 & 2) != 0) {
            iM12365 += AbstractC4121.m12365(2, this.f44719);
        }
        if ((this.f44720 & 4) != 0) {
            iM12365 += AbstractC4121.m12365(3, this.f44717);
        }
        if ((this.f44720 & 8) != 0) {
            iM12365 += AbstractC14766.m35082(4, m34907());
        }
        if ((this.f44720 & 16) != 0) {
            iM12365 += AbstractC14766.m35080(5);
        }
        if ((this.f44720 & 32) != 0) {
            iM12365 += AbstractC14766.m35080(6);
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
        if (!(obj instanceof C14619)) {
            return super.equals(obj);
        }
        C14619 c14619 = (C14619) obj;
        if (hasName() != c14619.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(c14619.getName())) || m34904() != c14619.m34904()) {
            return false;
        }
        if ((m34904() && !m34911().equals(c14619.m34911())) || m34910() != c14619.m34910()) {
            return false;
        }
        if ((m34910() && !m34906().equals(c14619.m34906())) || m34909() != c14619.m34909()) {
            return false;
        }
        if ((m34909() && !m34907().equals(c14619.m34907())) || m34903() != c14619.m34903()) {
            return false;
        }
        if ((!m34903() || this.f44721 == c14619.f44721) && m34902() == c14619.m34902()) {
            return (!m34902() || this.f44716 == c14619.f44716) && getUnknownFields().equals(c14619.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC8709
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C10702.f32267.hashCode() + 779;
        if (hasName()) {
            iHashCode = C4153.m12551(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (m34904()) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + m34911().hashCode();
        }
        if (m34910()) {
            iHashCode = C4153.m12551(iHashCode, 37, 3, 53) + m34906().hashCode();
        }
        if (m34909()) {
            iHashCode = C4153.m12551(iHashCode, 37, 4, 53) + m34907().hashCode();
        }
        if (m34903()) {
            iHashCode = C4153.m12551(iHashCode, 37, 5, 53) + C13997.m33481(this.f44721);
        }
        if (m34902()) {
            iHashCode = C4153.m12551(iHashCode, 37, 6, 53) + C13997.m33481(this.f44716);
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C17442 newBuilder() {
        return f44712.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return f44712.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 newBuilderForType() {
        return f44712.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C17442 toBuilder() {
        int i = 0;
        if (this == f44712) {
            return new C17442(i);
        }
        C17442 c17442 = new C17442(i);
        c17442.m40776(this);
        return c17442;
    }

    @Override // l.AbstractC8709
    public final InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C17442(interfaceC9415, 0);
    }

    public static C14619 getDefaultInstance() {
        return f44712;
    }

    public static InterfaceC12050 parser() {
        return f44713;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f44713;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f44712;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return f44712;
    }
}
