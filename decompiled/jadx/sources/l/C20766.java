package l;

/* JADX INFO: renamed from: l.᩷ۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20766 extends AbstractC4121 implements InterfaceC3583 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f67255 = 0;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final C20766 f67256;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12050 f67257;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f67258;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile Object f67259;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f67260;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f67261;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f67262;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C3126 f67263;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile Object f67264;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte f67265;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile Object f67266;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile Object f67267;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f67268;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile Object f67269;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f67270;

    static {
        C20663.m47279(EnumC6551.PUBLIC, C20766.class.getName());
        f67256 = new C20766();
        f67257 = new C16531();
    }

    public C20766(C17943 c17943, int i) {
        super(c17943);
        this.f67264 = "";
        this.f67262 = 0;
        this.f67258 = 1;
        this.f67261 = 1;
        this.f67266 = "";
        this.f67267 = "";
        this.f67269 = "";
        this.f67260 = 0;
        this.f67259 = "";
        this.f67270 = false;
        this.f67265 = (byte) -1;
    }

    public C20766() {
        this.f67264 = "";
        this.f67262 = 0;
        this.f67258 = 1;
        this.f67261 = 1;
        this.f67266 = "";
        this.f67267 = "";
        this.f67269 = "";
        this.f67260 = 0;
        this.f67259 = "";
        this.f67270 = false;
        this.f67265 = (byte) -1;
        this.f67264 = "";
        this.f67258 = 1;
        this.f67261 = 1;
        this.f67266 = "";
        this.f67267 = "";
        this.f67269 = "";
        this.f67259 = "";
    }

    @Override // l.AbstractC4121
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32229;
        c9766.m24773(C20766.class, C17943.class);
        return c9766;
    }

    public final boolean hasName() {
        return (this.f67268 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f67264;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f67264 = strM16501;
        }
        return strM16501;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m47466() {
        return (this.f67268 & 2) != 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m47467() {
        return this.f67262;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m47463() {
        return (this.f67268 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final EnumC14414 m47464() {
        EnumC14414 enumC14414M34439 = EnumC14414.m34439(this.f67258);
        return enumC14414M34439 == null ? EnumC14414.LABEL_OPTIONAL : enumC14414M34439;
    }

    public final boolean hasType() {
        return (this.f67268 & 8) != 0;
    }

    public final EnumC6654 getType() {
        EnumC6654 enumC6654M18174 = EnumC6654.m18174(this.f67261);
        return enumC6654M18174 == null ? EnumC6654.TYPE_DOUBLE : enumC6654M18174;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47460() {
        return (this.f67268 & 16) != 0;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String m47469() {
        Object obj = this.f67266;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f67266 = strM16501;
        }
        return strM16501;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m47461() {
        return (this.f67268 & 32) != 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m47471() {
        Object obj = this.f67267;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f67267 = strM16501;
        }
        return strM16501;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m47456() {
        return (this.f67268 & 64) != 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m47462() {
        Object obj = this.f67269;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f67269 = strM16501;
        }
        return strM16501;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m47472() {
        return (this.f67268 & 128) != 0;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m47458() {
        return this.f67260;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m47457() {
        return (this.f67268 & 256) != 0;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m47465() {
        Object obj = this.f67259;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f67259 = strM16501;
        }
        return strM16501;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m47473() {
        return (this.f67268 & 512) != 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C3126 m47459() {
        C3126 c3126 = this.f67263;
        return c3126 == null ? C3126.getDefaultInstance() : c3126;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m47470() {
        return (this.f67268 & 1024) != 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m47468() {
        return this.f67270;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        byte b = this.f67265;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (m47473() && !m47459().isInitialized()) {
            this.f67265 = (byte) 0;
            return false;
        }
        this.f67265 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        if ((this.f67268 & 1) != 0) {
            AbstractC4121.m12380(abstractC14766, 1, this.f67264);
        }
        if ((this.f67268 & 32) != 0) {
            AbstractC4121.m12380(abstractC14766, 2, this.f67267);
        }
        if ((this.f67268 & 2) != 0) {
            abstractC14766.mo35101(3, this.f67262);
        }
        if ((this.f67268 & 4) != 0) {
            abstractC14766.mo35101(4, this.f67258);
        }
        if ((this.f67268 & 8) != 0) {
            abstractC14766.mo35101(5, this.f67261);
        }
        if ((this.f67268 & 16) != 0) {
            AbstractC4121.m12380(abstractC14766, 6, this.f67266);
        }
        if ((this.f67268 & 64) != 0) {
            AbstractC4121.m12380(abstractC14766, 7, this.f67269);
        }
        if ((this.f67268 & 512) != 0) {
            abstractC14766.mo35104(8, m47459());
        }
        if ((this.f67268 & 128) != 0) {
            abstractC14766.mo35101(9, this.f67260);
        }
        if ((this.f67268 & 256) != 0) {
            AbstractC4121.m12380(abstractC14766, 10, this.f67259);
        }
        if ((this.f67268 & 1024) != 0) {
            abstractC14766.mo35093(17, this.f67270);
        }
        getUnknownFields().writeTo(abstractC14766);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM12365 = (this.f67268 & 1) != 0 ? AbstractC4121.m12365(1, this.f67264) : 0;
        if ((this.f67268 & 32) != 0) {
            iM12365 += AbstractC4121.m12365(2, this.f67267);
        }
        if ((this.f67268 & 2) != 0) {
            iM12365 += AbstractC14766.m35074(3, this.f67262);
        }
        if ((this.f67268 & 4) != 0) {
            iM12365 += AbstractC14766.m35079(4, this.f67258);
        }
        if ((this.f67268 & 8) != 0) {
            iM12365 += AbstractC14766.m35079(5, this.f67261);
        }
        if ((this.f67268 & 16) != 0) {
            iM12365 += AbstractC4121.m12365(6, this.f67266);
        }
        if ((this.f67268 & 64) != 0) {
            iM12365 += AbstractC4121.m12365(7, this.f67269);
        }
        if ((this.f67268 & 512) != 0) {
            iM12365 += AbstractC14766.m35082(8, m47459());
        }
        if ((this.f67268 & 128) != 0) {
            iM12365 += AbstractC14766.m35074(9, this.f67260);
        }
        if ((this.f67268 & 256) != 0) {
            iM12365 += AbstractC4121.m12365(10, this.f67259);
        }
        if ((this.f67268 & 1024) != 0) {
            iM12365 += AbstractC14766.m35080(17);
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
        if (!(obj instanceof C20766)) {
            return super.equals(obj);
        }
        C20766 c20766 = (C20766) obj;
        if (hasName() != c20766.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(c20766.getName())) || m47466() != c20766.m47466()) {
            return false;
        }
        if ((m47466() && this.f67262 != c20766.f67262) || m47463() != c20766.m47463()) {
            return false;
        }
        if ((m47463() && this.f67258 != c20766.f67258) || hasType() != c20766.hasType()) {
            return false;
        }
        if ((hasType() && this.f67261 != c20766.f67261) || m47460() != c20766.m47460()) {
            return false;
        }
        if ((m47460() && !m47469().equals(c20766.m47469())) || m47461() != c20766.m47461()) {
            return false;
        }
        if ((m47461() && !m47471().equals(c20766.m47471())) || m47456() != c20766.m47456()) {
            return false;
        }
        if ((m47456() && !m47462().equals(c20766.m47462())) || m47472() != c20766.m47472()) {
            return false;
        }
        if ((m47472() && this.f67260 != c20766.f67260) || m47457() != c20766.m47457()) {
            return false;
        }
        if ((m47457() && !m47465().equals(c20766.m47465())) || m47473() != c20766.m47473()) {
            return false;
        }
        if ((!m47473() || m47459().equals(c20766.m47459())) && m47470() == c20766.m47470()) {
            return (!m47470() || this.f67270 == c20766.f67270) && getUnknownFields().equals(c20766.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC8709
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C10702.f32239.hashCode() + 779;
        if (hasName()) {
            iHashCode = C4153.m12551(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (m47466()) {
            iHashCode = C4153.m12551(iHashCode, 37, 3, 53) + this.f67262;
        }
        if (m47463()) {
            iHashCode = C4153.m12551(iHashCode, 37, 4, 53) + this.f67258;
        }
        if (hasType()) {
            iHashCode = C4153.m12551(iHashCode, 37, 5, 53) + this.f67261;
        }
        if (m47460()) {
            iHashCode = C4153.m12551(iHashCode, 37, 6, 53) + m47469().hashCode();
        }
        if (m47461()) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + m47471().hashCode();
        }
        if (m47456()) {
            iHashCode = C4153.m12551(iHashCode, 37, 7, 53) + m47462().hashCode();
        }
        if (m47472()) {
            iHashCode = C4153.m12551(iHashCode, 37, 9, 53) + this.f67260;
        }
        if (m47457()) {
            iHashCode = C4153.m12551(iHashCode, 37, 10, 53) + m47465().hashCode();
        }
        if (m47473()) {
            iHashCode = C4153.m12551(iHashCode, 37, 8, 53) + m47459().hashCode();
        }
        if (m47470()) {
            iHashCode = C4153.m12551(iHashCode, 37, 17, 53) + C13997.m33481(this.f67270);
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C17943 newBuilder() {
        return f67256.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return f67256.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 newBuilderForType() {
        return f67256.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C17943 toBuilder() {
        int i = 0;
        if (this == f67256) {
            return new C17943(i);
        }
        C17943 c17943 = new C17943(i);
        c17943.m41945(this);
        return c17943;
    }

    @Override // l.AbstractC8709
    public final InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C17943(interfaceC9415, 0);
    }

    public static C20766 getDefaultInstance() {
        return f67256;
    }

    public static InterfaceC12050 parser() {
        return f67257;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f67257;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f67256;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return f67256;
    }
}
