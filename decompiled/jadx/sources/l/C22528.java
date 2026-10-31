package l;

/* JADX INFO: renamed from: l.᩹᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22528 extends AbstractC4121 implements InterfaceC3583 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final C22528 f72898;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12050 f72899;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f72900;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte f72901;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f72902;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f72903;

    static {
        C20663.m47279(EnumC6551.PUBLIC, C22528.class.getName());
        f72898 = new C22528();
        f72899 = new C15471();
    }

    public C22528(C21823 c21823, int i) {
        super(c21823);
        this.f72900 = 0;
        this.f72903 = 0;
        this.f72901 = (byte) -1;
    }

    public C22528() {
        this.f72900 = 0;
        this.f72903 = 0;
        this.f72901 = (byte) -1;
    }

    @Override // l.AbstractC4121
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32248;
        c9766.m24773(C22528.class, C21823.class);
        return c9766;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m50526() {
        return (this.f72902 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m50528() {
        return this.f72900;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m50527() {
        return (this.f72902 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m50525() {
        return this.f72903;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        byte b = this.f72901;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f72901 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        if ((this.f72902 & 1) != 0) {
            abstractC14766.mo35101(1, this.f72900);
        }
        if ((this.f72902 & 2) != 0) {
            abstractC14766.mo35101(2, this.f72903);
        }
        getUnknownFields().writeTo(abstractC14766);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35074 = (this.f72902 & 1) != 0 ? AbstractC14766.m35074(1, this.f72900) : 0;
        if ((this.f72902 & 2) != 0) {
            iM35074 += AbstractC14766.m35074(2, this.f72903);
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
        if (!(obj instanceof C22528)) {
            return super.equals(obj);
        }
        C22528 c22528 = (C22528) obj;
        if (m50526() != c22528.m50526()) {
            return false;
        }
        if ((!m50526() || this.f72900 == c22528.f72900) && m50527() == c22528.m50527()) {
            return (!m50527() || this.f72903 == c22528.f72903) && getUnknownFields().equals(c22528.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC8709
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C10702.f32256.hashCode() + 779;
        if (m50526()) {
            iHashCode = C4153.m12551(iHashCode, 37, 1, 53) + this.f72900;
        }
        if (m50527()) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + this.f72903;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C21823 newBuilder() {
        return f72898.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return f72898.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 newBuilderForType() {
        return f72898.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C21823 toBuilder() {
        int i = 0;
        if (this == f72898) {
            return new C21823(i);
        }
        C21823 c21823 = new C21823(i);
        c21823.m49189(this);
        return c21823;
    }

    @Override // l.AbstractC8709
    public final InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C21823(interfaceC9415);
    }

    public static C22528 getDefaultInstance() {
        return f72898;
    }

    public static InterfaceC12050 parser() {
        return f72899;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f72899;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f72898;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return f72898;
    }
}
