package p067l;

/* JADX INFO: renamed from: l.۠᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10368 extends AbstractC6285 implements InterfaceC5773 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۫ */
    public static final InterfaceC13820 f28698;

    /* JADX INFO: renamed from: ۬ */
    public static final C10368 f28699;

    /* JADX INFO: renamed from: ۗ */
    public int f28700;

    /* JADX INFO: renamed from: ۙ */
    public C20112 f28701;

    /* JADX INFO: renamed from: ᩶ */
    public byte f28702;

    /* JADX INFO: renamed from: ᩸ */
    public int f28703;

    /* JADX INFO: renamed from: ᩹ */
    public int f28704;

    static {
        C22006.m49606(EnumC8594.PUBLIC, C10368.class.getName());
        f28699 = new C10368();
        f28698 = new C7686();
    }

    public C10368(C3662 c3662, int i) {
        super(c3662);
        this.f28700 = 0;
        this.f28704 = 0;
        this.f28702 = (byte) -1;
    }

    public C10368() {
        this.f28700 = 0;
        this.f28704 = 0;
        this.f28702 = (byte) -1;
    }

    @Override // p067l.AbstractC6285
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35233;
        c11650.m26787(C10368.class, C3662.class);
        return c11650;
    }

    /* JADX INFO: renamed from: ۖ */
    public final boolean m24001() {
        return (this.f28703 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۢ */
    public final int m24004() {
        return this.f28700;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m24003() {
        return (this.f28703 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m24002() {
        return this.f28704;
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m24005() {
        return (this.f28703 & 4) != 0;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final C20112 m24006() {
        C20112 c20112 = this.f28701;
        return c20112 == null ? C20112.getDefaultInstance() : c20112;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.f28702;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (m24005() && !m24006().isInitialized()) {
            this.f28702 = (byte) 0;
            return false;
        }
        this.f28702 = (byte) 1;
        return true;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        if ((this.f28703 & 1) != 0) {
            abstractC16402.mo37248(1, this.f28700);
        }
        if ((this.f28703 & 2) != 0) {
            abstractC16402.mo37248(2, this.f28704);
        }
        if ((this.f28703 & 4) != 0) {
            abstractC16402.mo37251(3, m24006());
        }
        getUnknownFields().writeTo(abstractC16402);
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM37221 = (this.f28703 & 1) != 0 ? AbstractC16402.m37221(1, this.f28700) : 0;
        if ((this.f28703 & 2) != 0) {
            iM37221 += AbstractC16402.m37221(2, this.f28704);
        }
        if ((this.f28703 & 4) != 0) {
            iM37221 += AbstractC16402.m37229(3, m24006());
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM37221;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // p067l.AbstractC10645
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10368)) {
            return super.equals(obj);
        }
        C10368 c10368 = (C10368) obj;
        if (m24001() != c10368.m24001()) {
            return false;
        }
        if ((m24001() && this.f28700 != c10368.f28700) || m24003() != c10368.m24003()) {
            return false;
        }
        if ((!m24003() || this.f28704 == c10368.f28704) && m24005() == c10368.m24005()) {
            return (!m24005() || m24006().equals(c10368.m24006())) && getUnknownFields().equals(c10368.getUnknownFields());
        }
        return false;
    }

    @Override // p067l.AbstractC10645
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12539.f35229.hashCode() + 779;
        if (m24001()) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + this.f28700;
        }
        if (m24003()) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + this.f28704;
        }
        if (m24005()) {
            iHashCode = C6316.m14441(iHashCode, 37, 3, 53) + m24006().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C3662 newBuilder() {
        return f28699.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return f28699.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 newBuilderForType() {
        return f28699.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C3662 toBuilder() {
        int i = 0;
        if (this == f28699) {
            return new C3662(i);
        }
        C3662 c3662 = new C3662(i);
        c3662.m7015(this);
        return c3662;
    }

    @Override // p067l.AbstractC10645
    public final InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C3662(interfaceC11316, 0);
    }

    public static C10368 getDefaultInstance() {
        return f28699;
    }

    public static InterfaceC13820 parser() {
        return f28698;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f28698;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f28699;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return f28699;
    }
}
