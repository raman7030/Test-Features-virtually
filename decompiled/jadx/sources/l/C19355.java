package l;

/* JADX INFO: renamed from: l.᩵ۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19355 extends AbstractC4121 implements InterfaceC3583 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final C19355 f62652;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12050 f62653;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile Object f62654;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte f62655;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f62656;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f62657;

    static {
        C20663.m47279(EnumC6551.PUBLIC, C19355.class.getName());
        f62652 = new C19355();
        f62653 = new C3832();
    }

    public C19355(C18649 c18649, int i) {
        super(c18649);
        this.f62657 = 0;
        this.f62654 = "";
        this.f62655 = (byte) -1;
    }

    public C19355() {
        this.f62657 = 0;
        this.f62654 = "";
        this.f62655 = (byte) -1;
        this.f62657 = 0;
        this.f62654 = "";
    }

    @Override // l.AbstractC4121
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32272;
        c9766.m24773(C19355.class, C18649.class);
        return c9766;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m44582() {
        return (this.f62656 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final EnumC3478 m44580() {
        EnumC3478 enumC3478M10650 = EnumC3478.m10650(this.f62657);
        return enumC3478M10650 == null ? EnumC3478.EDITION_UNKNOWN : enumC3478M10650;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m44581() {
        return (this.f62656 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m44583() {
        Object obj = this.f62654;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f62654 = strM16501;
        }
        return strM16501;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        byte b = this.f62655;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f62655 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        if ((this.f62656 & 2) != 0) {
            AbstractC4121.m12380(abstractC14766, 2, this.f62654);
        }
        if ((this.f62656 & 1) != 0) {
            abstractC14766.mo35101(3, this.f62657);
        }
        getUnknownFields().writeTo(abstractC14766);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM12365 = (this.f62656 & 2) != 0 ? AbstractC4121.m12365(2, this.f62654) : 0;
        if ((this.f62656 & 1) != 0) {
            iM12365 += AbstractC14766.m35079(3, this.f62657);
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
        if (!(obj instanceof C19355)) {
            return super.equals(obj);
        }
        C19355 c19355 = (C19355) obj;
        if (m44582() != c19355.m44582()) {
            return false;
        }
        if ((!m44582() || this.f62657 == c19355.f62657) && m44581() == c19355.m44581()) {
            return (!m44581() || m44583().equals(c19355.m44583())) && getUnknownFields().equals(c19355.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC8709
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C10702.f32242.hashCode() + 779;
        if (m44582()) {
            iHashCode = C4153.m12551(iHashCode, 37, 3, 53) + this.f62657;
        }
        if (m44581()) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + m44583().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C18649 newBuilder() {
        return f62652.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return f62652.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 newBuilderForType() {
        return f62652.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C18649 toBuilder() {
        int i = 0;
        if (this == f62652) {
            return new C18649(i);
        }
        C18649 c18649 = new C18649(i);
        c18649.m43242(this);
        return c18649;
    }

    @Override // l.AbstractC8709
    public final InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C18649(interfaceC9415, 0);
    }

    public static C19355 getDefaultInstance() {
        return f62652;
    }

    public static InterfaceC12050 parser() {
        return f62653;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f62653;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f62652;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return f62652;
    }
}
