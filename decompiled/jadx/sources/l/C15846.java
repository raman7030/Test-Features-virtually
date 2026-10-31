package l;

/* JADX INFO: renamed from: l.ܺۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15846 extends AbstractC4121 implements InterfaceC3583 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12050 f48950;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C15846 f48951;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f48952;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f48953;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile Object f48954;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f48955;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte f48956;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f48957;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile Object f48958;

    static {
        C20663.m47279(EnumC6551.PUBLIC, C15846.class.getName());
        f48951 = new C15846();
        f48950 = new C9498();
    }

    public C15846(C8792 c8792, int i) {
        super(c8792);
        this.f48953 = 0;
        this.f48958 = "";
        this.f48954 = "";
        this.f48955 = false;
        this.f48952 = false;
        this.f48956 = (byte) -1;
    }

    public C15846() {
        this.f48953 = 0;
        this.f48958 = "";
        this.f48954 = "";
        this.f48955 = false;
        this.f48952 = false;
        this.f48956 = (byte) -1;
        this.f48958 = "";
        this.f48954 = "";
    }

    @Override // l.AbstractC4121
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32233;
        c9766.m24773(C15846.class, C8792.class);
        return c9766;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m37515() {
        return (this.f48957 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m37522() {
        return this.f48953;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m37520() {
        return (this.f48957 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m37517() {
        Object obj = this.f48958;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f48958 = strM16501;
        }
        return strM16501;
    }

    public final boolean hasType() {
        return (this.f48957 & 4) != 0;
    }

    public final String getType() {
        Object obj = this.f48954;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f48954 = strM16501;
        }
        return strM16501;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m37521() {
        return (this.f48957 & 8) != 0;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m37518() {
        return this.f48955;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m37516() {
        return (this.f48957 & 16) != 0;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m37519() {
        return this.f48952;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        byte b = this.f48956;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f48956 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        if ((this.f48957 & 1) != 0) {
            abstractC14766.mo35101(1, this.f48953);
        }
        if ((this.f48957 & 2) != 0) {
            AbstractC4121.m12380(abstractC14766, 2, this.f48958);
        }
        if ((this.f48957 & 4) != 0) {
            AbstractC4121.m12380(abstractC14766, 3, this.f48954);
        }
        if ((this.f48957 & 8) != 0) {
            abstractC14766.mo35093(5, this.f48955);
        }
        if ((this.f48957 & 16) != 0) {
            abstractC14766.mo35093(6, this.f48952);
        }
        getUnknownFields().writeTo(abstractC14766);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35074 = (this.f48957 & 1) != 0 ? AbstractC14766.m35074(1, this.f48953) : 0;
        if ((this.f48957 & 2) != 0) {
            iM35074 += AbstractC4121.m12365(2, this.f48958);
        }
        if ((this.f48957 & 4) != 0) {
            iM35074 += AbstractC4121.m12365(3, this.f48954);
        }
        if ((this.f48957 & 8) != 0) {
            iM35074 += AbstractC14766.m35080(5);
        }
        if ((this.f48957 & 16) != 0) {
            iM35074 += AbstractC14766.m35080(6);
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
        if (!(obj instanceof C15846)) {
            return super.equals(obj);
        }
        C15846 c15846 = (C15846) obj;
        if (m37515() != c15846.m37515()) {
            return false;
        }
        if ((m37515() && this.f48953 != c15846.f48953) || m37520() != c15846.m37520()) {
            return false;
        }
        if ((m37520() && !m37517().equals(c15846.m37517())) || hasType() != c15846.hasType()) {
            return false;
        }
        if ((hasType() && !getType().equals(c15846.getType())) || m37521() != c15846.m37521()) {
            return false;
        }
        if ((!m37521() || this.f48955 == c15846.f48955) && m37516() == c15846.m37516()) {
            return (!m37516() || this.f48952 == c15846.f48952) && getUnknownFields().equals(c15846.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC8709
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C10702.f32215.hashCode() + 779;
        if (m37515()) {
            iHashCode = C4153.m12551(iHashCode, 37, 1, 53) + this.f48953;
        }
        if (m37520()) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + m37517().hashCode();
        }
        if (hasType()) {
            iHashCode = C4153.m12551(iHashCode, 37, 3, 53) + getType().hashCode();
        }
        if (m37521()) {
            iHashCode = C4153.m12551(iHashCode, 37, 5, 53) + C13997.m33481(this.f48955);
        }
        if (m37516()) {
            iHashCode = C4153.m12551(iHashCode, 37, 6, 53) + C13997.m33481(this.f48952);
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C8792 newBuilder() {
        return f48951.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return f48951.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 newBuilderForType() {
        return f48951.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C8792 toBuilder() {
        int i = 0;
        if (this == f48951) {
            return new C8792(i);
        }
        C8792 c8792 = new C8792(i);
        c8792.m22692(this);
        return c8792;
    }

    @Override // l.AbstractC8709
    public final InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C8792(interfaceC9415, 0);
    }

    public static C15846 getDefaultInstance() {
        return f48951;
    }

    public static InterfaceC12050 parser() {
        return f48950;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f48950;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f48951;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return f48951;
    }
}
