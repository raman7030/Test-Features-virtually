package l;

/* JADX INFO: renamed from: l.ܳ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U940 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14724 extends AbstractC4121 implements InterfaceC3583 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f44965 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12050 f44966;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C14724 f44967;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f44968;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte f44969;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f44970;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f44971;

    static {
        C20663.m47279(EnumC6551.PUBLIC, C14724.class.getName());
        f44967 = new C14724();
        f44966 = new C11198();
    }

    public C14724(C16841 c16841, int i) {
        super(c16841);
        this.f44971 = false;
        this.f44968 = 0;
        this.f44969 = (byte) -1;
    }

    public C14724() {
        this.f44971 = false;
        this.f44969 = (byte) -1;
        this.f44968 = 0;
    }

    @Override // l.AbstractC4121
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C23897.f77256;
        c9766.m24773(C14724.class, C16841.class);
        return c9766;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m35035() {
        return (this.f44970 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m35033() {
        return this.f44971;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m35034() {
        return (this.f44970 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC17547 m35036() {
        EnumC17547 enumC17547M41028 = EnumC17547.m41028(this.f44968);
        return enumC17547M41028 == null ? EnumC17547.UTF8_VALIDATION_UNKNOWN : enumC17547M41028;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        byte b = this.f44969;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f44969 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        if ((this.f44970 & 1) != 0) {
            abstractC14766.mo35093(1, this.f44971);
        }
        if ((this.f44970 & 2) != 0) {
            abstractC14766.mo35101(2, this.f44968);
        }
        getUnknownFields().writeTo(abstractC14766);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35080 = (this.f44970 & 1) != 0 ? AbstractC14766.m35080(1) : 0;
        if ((this.f44970 & 2) != 0) {
            iM35080 += AbstractC14766.m35079(2, this.f44968);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM35080;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC8709
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14724)) {
            return super.equals(obj);
        }
        C14724 c14724 = (C14724) obj;
        if (m35035() != c14724.m35035()) {
            return false;
        }
        if ((!m35035() || this.f44971 == c14724.f44971) && m35034() == c14724.m35034()) {
            return (!m35034() || this.f44968 == c14724.f44968) && getUnknownFields().equals(c14724.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC8709
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C23897.f77255.hashCode() + 779;
        if (m35035()) {
            iHashCode = C4153.m12551(iHashCode, 37, 1, 53) + C13997.m33481(this.f44971);
        }
        if (m35034()) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + this.f44968;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C16841 newBuilder() {
        return f44967.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return f44967.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 newBuilderForType() {
        return f44967.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C16841 toBuilder() {
        int i = 0;
        if (this == f44967) {
            return new C16841(i);
        }
        C16841 c16841 = new C16841(i);
        c16841.m39617(this);
        return c16841;
    }

    @Override // l.AbstractC8709
    public final InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C16841(interfaceC9415, 0);
    }

    public static C14724 getDefaultInstance() {
        return f44967;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f44966;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f44967;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return f44967;
    }
}
