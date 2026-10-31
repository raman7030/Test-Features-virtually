package l;

/* JADX INFO: renamed from: l.۠᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8417 extends AbstractC4121 implements InterfaceC3583 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12050 f25784;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C8417 f25785;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f25786;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18670 f25787;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte f25788;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f25789;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f25790;

    static {
        C20663.m47279(EnumC6551.PUBLIC, C8417.class.getName());
        f25785 = new C8417();
        f25784 = new C5595();
    }

    public C8417(C1361 c1361, int i) {
        super(c1361);
        this.f25786 = 0;
        this.f25790 = 0;
        this.f25788 = (byte) -1;
    }

    public C8417() {
        this.f25786 = 0;
        this.f25790 = 0;
        this.f25788 = (byte) -1;
    }

    @Override // l.AbstractC4121
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32258;
        c9766.m24773(C8417.class, C1361.class);
        return c9766;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m22031() {
        return (this.f25789 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m22034() {
        return this.f25786;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m22033() {
        return (this.f25789 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m22032() {
        return this.f25790;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m22035() {
        return (this.f25789 & 4) != 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18670 m22036() {
        C18670 c18670 = this.f25787;
        return c18670 == null ? C18670.getDefaultInstance() : c18670;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        byte b = this.f25788;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (m22035() && !m22036().isInitialized()) {
            this.f25788 = (byte) 0;
            return false;
        }
        this.f25788 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        if ((this.f25789 & 1) != 0) {
            abstractC14766.mo35101(1, this.f25786);
        }
        if ((this.f25789 & 2) != 0) {
            abstractC14766.mo35101(2, this.f25790);
        }
        if ((this.f25789 & 4) != 0) {
            abstractC14766.mo35104(3, m22036());
        }
        getUnknownFields().writeTo(abstractC14766);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35074 = (this.f25789 & 1) != 0 ? AbstractC14766.m35074(1, this.f25786) : 0;
        if ((this.f25789 & 2) != 0) {
            iM35074 += AbstractC14766.m35074(2, this.f25790);
        }
        if ((this.f25789 & 4) != 0) {
            iM35074 += AbstractC14766.m35082(3, m22036());
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
        if (!(obj instanceof C8417)) {
            return super.equals(obj);
        }
        C8417 c8417 = (C8417) obj;
        if (m22031() != c8417.m22031()) {
            return false;
        }
        if ((m22031() && this.f25786 != c8417.f25786) || m22033() != c8417.m22033()) {
            return false;
        }
        if ((!m22033() || this.f25790 == c8417.f25790) && m22035() == c8417.m22035()) {
            return (!m22035() || m22036().equals(c8417.m22036())) && getUnknownFields().equals(c8417.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC8709
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C10702.f32254.hashCode() + 779;
        if (m22031()) {
            iHashCode = C4153.m12551(iHashCode, 37, 1, 53) + this.f25786;
        }
        if (m22033()) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + this.f25790;
        }
        if (m22035()) {
            iHashCode = C4153.m12551(iHashCode, 37, 3, 53) + m22036().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C1361 newBuilder() {
        return f25785.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return f25785.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 newBuilderForType() {
        return f25785.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C1361 toBuilder() {
        int i = 0;
        if (this == f25785) {
            return new C1361(i);
        }
        C1361 c1361 = new C1361(i);
        c1361.m4777(this);
        return c1361;
    }

    @Override // l.AbstractC8709
    public final InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C1361(interfaceC9415, 0);
    }

    public static C8417 getDefaultInstance() {
        return f25785;
    }

    public static InterfaceC12050 parser() {
        return f25784;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f25784;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f25785;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return f25785;
    }
}
