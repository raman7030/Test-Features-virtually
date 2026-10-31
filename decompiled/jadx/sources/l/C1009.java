package l;

/* JADX INFO: renamed from: l.֨ۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1009 extends AbstractC4121 implements InterfaceC3583 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12050 f3724;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C1009 f3725;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f3726;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f3727;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte f3728;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f3729;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f3730;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile Object f3731;

    static {
        C20663.m47279(EnumC6551.PUBLIC, C1009.class.getName());
        f3725 = new C1009();
        f3724 = new C0303();
    }

    public C1009(C5243 c5243, int i) {
        super(c5243);
        this.f3727 = 0;
        this.f3729 = 0;
        this.f3731 = "";
        this.f3726 = 0;
        this.f3728 = (byte) -1;
    }

    public C1009() {
        this.f3727 = 0;
        this.f3729 = 0;
        this.f3731 = "";
        this.f3726 = 0;
        this.f3728 = (byte) -1;
        this.f3727 = 0;
        this.f3729 = 0;
        this.f3731 = "";
        this.f3726 = 0;
    }

    @Override // l.AbstractC4121
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32232;
        c9766.m24773(C1009.class, C5243.class);
        return c9766;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m3517() {
        return (this.f3730 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final EnumC3478 m3520() {
        EnumC3478 enumC3478M10650 = EnumC3478.m10650(this.f3727);
        return enumC3478M10650 == null ? EnumC3478.EDITION_UNKNOWN : enumC3478M10650;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m3516() {
        return (this.f3730 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC3478 m3523() {
        EnumC3478 enumC3478M10650 = EnumC3478.m10650(this.f3729);
        return enumC3478M10650 == null ? EnumC3478.EDITION_UNKNOWN : enumC3478M10650;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m3521() {
        return (this.f3730 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m3518() {
        Object obj = this.f3731;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f3731 = strM16501;
        }
        return strM16501;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m3522() {
        return (this.f3730 & 8) != 0;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final EnumC3478 m3519() {
        EnumC3478 enumC3478M10650 = EnumC3478.m10650(this.f3726);
        return enumC3478M10650 == null ? EnumC3478.EDITION_UNKNOWN : enumC3478M10650;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        byte b = this.f3728;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f3728 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        if ((this.f3730 & 1) != 0) {
            abstractC14766.mo35101(1, this.f3727);
        }
        if ((this.f3730 & 2) != 0) {
            abstractC14766.mo35101(2, this.f3729);
        }
        if ((this.f3730 & 4) != 0) {
            AbstractC4121.m12380(abstractC14766, 3, this.f3731);
        }
        if ((this.f3730 & 8) != 0) {
            abstractC14766.mo35101(4, this.f3726);
        }
        getUnknownFields().writeTo(abstractC14766);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35079 = (this.f3730 & 1) != 0 ? AbstractC14766.m35079(1, this.f3727) : 0;
        if ((this.f3730 & 2) != 0) {
            iM35079 += AbstractC14766.m35079(2, this.f3729);
        }
        if ((this.f3730 & 4) != 0) {
            iM35079 += AbstractC4121.m12365(3, this.f3731);
        }
        if ((this.f3730 & 8) != 0) {
            iM35079 += AbstractC14766.m35079(4, this.f3726);
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
        if (!(obj instanceof C1009)) {
            return super.equals(obj);
        }
        C1009 c1009 = (C1009) obj;
        if (m3517() != c1009.m3517()) {
            return false;
        }
        if ((m3517() && this.f3727 != c1009.f3727) || m3516() != c1009.m3516()) {
            return false;
        }
        if ((m3516() && this.f3729 != c1009.f3729) || m3521() != c1009.m3521()) {
            return false;
        }
        if ((!m3521() || m3518().equals(c1009.m3518())) && m3522() == c1009.m3522()) {
            return (!m3522() || this.f3726 == c1009.f3726) && getUnknownFields().equals(c1009.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC8709
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C10702.f32247.hashCode() + 779;
        if (m3517()) {
            iHashCode = C4153.m12551(iHashCode, 37, 1, 53) + this.f3727;
        }
        if (m3516()) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + this.f3729;
        }
        if (m3521()) {
            iHashCode = C4153.m12551(iHashCode, 37, 3, 53) + m3518().hashCode();
        }
        if (m3522()) {
            iHashCode = C4153.m12551(iHashCode, 37, 4, 53) + this.f3726;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C5243 newBuilder() {
        return f3725.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return f3725.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 newBuilderForType() {
        return f3725.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C5243 toBuilder() {
        int i = 0;
        if (this == f3725) {
            return new C5243(i);
        }
        C5243 c5243 = new C5243(i);
        c5243.m15129(this);
        return c5243;
    }

    @Override // l.AbstractC8709
    public final InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C5243(interfaceC9415, 0);
    }

    public static C1009 getDefaultInstance() {
        return f3725;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f3724;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f3725;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return f3725;
    }
}
