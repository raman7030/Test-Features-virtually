package l;

/* JADX INFO: renamed from: l.۫ܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12503 extends AbstractC4121 implements InterfaceC3583 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C12503 f37548;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12050 f37549;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f37550;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte f37551;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public volatile Object f37552;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC6237 f37553;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f37554;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public InterfaceC6237 f37555;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C2731 f37556;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f37557;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile Object f37558;

    static {
        C20663.m47279(EnumC6551.PUBLIC, C12503.class.getName());
        f37548 = new C12503();
        f37549 = new C3331();
    }

    public C12503(C13208 c13208, int i) {
        super(c13208);
        this.f37555 = AbstractC4121.m12398();
        this.f37550 = -1;
        this.f37553 = AbstractC4121.m12398();
        this.f37554 = -1;
        this.f37558 = "";
        this.f37552 = "";
        this.f37556 = C2731.m8466();
        this.f37551 = (byte) -1;
    }

    public C12503() {
        this.f37555 = AbstractC4121.m12398();
        this.f37550 = -1;
        this.f37553 = AbstractC4121.m12398();
        this.f37554 = -1;
        this.f37558 = "";
        this.f37552 = "";
        this.f37556 = C2731.m8466();
        this.f37551 = (byte) -1;
        this.f37555 = AbstractC4121.m12398();
        this.f37553 = AbstractC4121.m12398();
        this.f37558 = "";
        this.f37552 = "";
        this.f37556 = C2731.m8466();
    }

    @Override // l.AbstractC4121
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32269;
        c9766.m24773(C12503.class, C13208.class);
        return c9766;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m30685() {
        return (this.f37557 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m30683() {
        Object obj = this.f37558;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f37558 = strM16501;
        }
        return strM16501;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m30684() {
        return (this.f37557 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m30686() {
        Object obj = this.f37552;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f37552 = strM16501;
        }
        return strM16501;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        byte b = this.f37551;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f37551 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        getSerializedSize();
        if (this.f37555.size() > 0) {
            abstractC14766.mo35106(10);
            abstractC14766.mo35106(this.f37550);
        }
        for (int i = 0; i < this.f37555.size(); i++) {
            abstractC14766.mo35100(this.f37555.getInt(i));
        }
        if (this.f37553.size() > 0) {
            abstractC14766.mo35106(18);
            abstractC14766.mo35106(this.f37554);
        }
        for (int i2 = 0; i2 < this.f37553.size(); i2++) {
            abstractC14766.mo35100(this.f37553.getInt(i2));
        }
        if ((this.f37557 & 1) != 0) {
            AbstractC4121.m12380(abstractC14766, 3, this.f37558);
        }
        if ((this.f37557 & 2) != 0) {
            AbstractC4121.m12380(abstractC14766, 4, this.f37552);
        }
        for (int i3 = 0; i3 < this.f37556.size(); i3++) {
            AbstractC4121.m12380(abstractC14766, 6, this.f37556.mo8472(i3));
        }
        getUnknownFields().writeTo(abstractC14766);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35077 = 0;
        for (int i2 = 0; i2 < this.f37555.size(); i2++) {
            iM35077 += AbstractC14766.m35077(this.f37555.getInt(i2));
        }
        int iM35078 = this.f37555.isEmpty() ? iM35077 : AbstractC14766.m35077(iM35077) + iM35077 + 1;
        this.f37550 = iM35077;
        int iM35079 = 0;
        for (int i3 = 0; i3 < this.f37553.size(); i3++) {
            iM35079 += AbstractC14766.m35077(this.f37553.getInt(i3));
        }
        int iM12365 = iM35078 + iM35079;
        if (!this.f37553.isEmpty()) {
            iM12365 = iM12365 + 1 + AbstractC14766.m35077(iM35079);
        }
        this.f37554 = iM35079;
        if ((this.f37557 & 1) != 0) {
            iM12365 += AbstractC4121.m12365(3, this.f37558);
        }
        if ((this.f37557 & 2) != 0) {
            iM12365 += AbstractC4121.m12365(4, this.f37552);
        }
        int iM12395 = 0;
        for (int i4 = 0; i4 < this.f37556.size(); i4++) {
            iM12395 += AbstractC4121.m12395(this.f37556.mo8472(i4));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + this.f37556.size() + iM12365 + iM12395;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC8709
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12503)) {
            return super.equals(obj);
        }
        C12503 c12503 = (C12503) obj;
        if (!this.f37555.equals(c12503.f37555) || !this.f37553.equals(c12503.f37553) || m30685() != c12503.m30685()) {
            return false;
        }
        if ((!m30685() || m30683().equals(c12503.m30683())) && m30684() == c12503.m30684()) {
            return (!m30684() || m30686().equals(c12503.m30686())) && this.f37556.equals(c12503.f37556) && getUnknownFields().equals(c12503.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC8709
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C10702.f32251.hashCode() + 779;
        if (this.f37555.size() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, 1, 53) + this.f37555.hashCode();
        }
        if (this.f37553.size() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + this.f37553.hashCode();
        }
        if (m30685()) {
            iHashCode = C4153.m12551(iHashCode, 37, 3, 53) + m30683().hashCode();
        }
        if (m30684()) {
            iHashCode = C4153.m12551(iHashCode, 37, 4, 53) + m30686().hashCode();
        }
        if (this.f37556.size() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, 6, 53) + this.f37556.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C13208 newBuilder() {
        return f37548.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return f37548.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 newBuilderForType() {
        return f37548.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C13208 toBuilder() {
        int i = 0;
        if (this == f37548) {
            return new C13208(i);
        }
        C13208 c13208 = new C13208(i);
        c13208.m32045(this);
        return c13208;
    }

    @Override // l.AbstractC8709
    public final InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C13208(interfaceC9415, 0);
    }

    public static C12503 getDefaultInstance() {
        return f37548;
    }

    public static InterfaceC12050 parser() {
        return f37549;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f37549;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f37548;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return f37548;
    }
}
