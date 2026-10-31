package l;

/* JADX INFO: renamed from: l.۟ܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7564 extends AbstractC4121 implements InterfaceC3583 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final C7564 f23354;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12050 f23355;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile Object f23356;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte f23357;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f23358;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f23359;

    static {
        C20663.m47279(EnumC6551.PUBLIC, C7564.class.getName());
        f23354 = new C7564();
        f23355 = new C23086();
    }

    public C7564(C13913 c13913, int i) {
        super(c13913);
        this.f23356 = "";
        this.f23359 = false;
        this.f23357 = (byte) -1;
    }

    public C7564() {
        this.f23356 = "";
        this.f23359 = false;
        this.f23357 = (byte) -1;
        this.f23356 = "";
    }

    @Override // l.AbstractC4121
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32222;
        c9766.m24773(C7564.class, C13913.class);
        return c9766;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m20283() {
        return (this.f23358 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m20285() {
        Object obj = this.f23356;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f23356 = strM16501;
        }
        return strM16501;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m20284() {
        return (this.f23358 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m20282() {
        return this.f23359;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        byte b = this.f23357;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m20283()) {
            this.f23357 = (byte) 0;
            return false;
        }
        if (!m20284()) {
            this.f23357 = (byte) 0;
            return false;
        }
        this.f23357 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        if ((this.f23358 & 1) != 0) {
            AbstractC4121.m12380(abstractC14766, 1, this.f23356);
        }
        if ((this.f23358 & 2) != 0) {
            abstractC14766.mo35093(2, this.f23359);
        }
        getUnknownFields().writeTo(abstractC14766);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM12365 = (this.f23358 & 1) != 0 ? AbstractC4121.m12365(1, this.f23356) : 0;
        if ((this.f23358 & 2) != 0) {
            iM12365 += AbstractC14766.m35080(2);
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
        if (!(obj instanceof C7564)) {
            return super.equals(obj);
        }
        C7564 c7564 = (C7564) obj;
        if (m20283() != c7564.m20283()) {
            return false;
        }
        if ((!m20283() || m20285().equals(c7564.m20285())) && m20284() == c7564.m20284()) {
            return (!m20284() || this.f23359 == c7564.f23359) && getUnknownFields().equals(c7564.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC8709
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C10702.f32226.hashCode() + 779;
        if (m20283()) {
            iHashCode = C4153.m12551(iHashCode, 37, 1, 53) + m20285().hashCode();
        }
        if (m20284()) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + C13997.m33481(this.f23359);
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C13913 newBuilder() {
        return f23354.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return f23354.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 newBuilderForType() {
        return f23354.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C13913 toBuilder() {
        int i = 0;
        if (this == f23354) {
            return new C13913(i);
        }
        C13913 c13913 = new C13913(i);
        c13913.m33324(this);
        return c13913;
    }

    @Override // l.AbstractC8709
    public final InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C13913(interfaceC9415, 0);
    }

    public static C7564 getDefaultInstance() {
        return f23354;
    }

    public static InterfaceC12050 parser() {
        return f23355;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f23355;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f23354;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return f23354;
    }
}
