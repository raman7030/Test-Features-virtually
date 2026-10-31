package l;

import moe.shizuku.server.IShizukuApplication;

/* JADX INFO: renamed from: l.ۛۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5969 extends AbstractC12154 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f18301 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12050 f18302;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final C5969 f18303;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f18304;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f18305;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f18306;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f18307;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f18308;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte f18309;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f18310;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f18311;

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        C12859 c12859 = new C12859(this);
        if ((this.f18311 & 1) != 0) {
            abstractC14766.mo35101(1, this.f18305);
        }
        if ((this.f18311 & 2) != 0) {
            abstractC14766.mo35101(2, this.f18310);
        }
        if ((this.f18311 & 4) != 0) {
            abstractC14766.mo35101(3, this.f18307);
        }
        if ((this.f18311 & 8) != 0) {
            abstractC14766.mo35101(4, this.f18306);
        }
        if ((this.f18311 & 16) != 0) {
            abstractC14766.mo35101(5, this.f18308);
        }
        if ((this.f18311 & 32) != 0) {
            abstractC14766.mo35101(6, this.f18304);
        }
        c12859.m31295(IShizukuApplication.Stub.TRANSACTION_showPermissionConfirmation, abstractC14766);
        getUnknownFields().writeTo(abstractC14766);
    }

    static {
        C20663.m47279(EnumC6551.PUBLIC, C5969.class.getName());
        f18303 = new C5969();
        f18302 = new C19376();
    }

    public C5969(C0324 c0324) {
        super(c0324);
        this.f18305 = 0;
        this.f18310 = 0;
        this.f18307 = 0;
        this.f18306 = 0;
        this.f18308 = 0;
        this.f18304 = 0;
        this.f18309 = (byte) -1;
    }

    public C5969() {
        this.f18309 = (byte) -1;
        this.f18305 = 0;
        this.f18310 = 0;
        this.f18307 = 0;
        this.f18306 = 0;
        this.f18308 = 0;
        this.f18304 = 0;
    }

    @Override // l.AbstractC4121
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32243;
        c9766.m24773(C5969.class, C0324.class);
        return c9766;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m16723() {
        return (this.f18311 & 1) != 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC15140 m16727() {
        EnumC15140 enumC15140M35839 = EnumC15140.m35839(this.f18305);
        return enumC15140M35839 == null ? EnumC15140.FIELD_PRESENCE_UNKNOWN : enumC15140M35839;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m16719() {
        return (this.f18311 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final EnumC1030 m16725() {
        EnumC1030 enumC1030M3553 = EnumC1030.m3553(this.f18310);
        return enumC1030M3553 == null ? EnumC1030.ENUM_TYPE_UNKNOWN : enumC1030M3553;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m16726() {
        return (this.f18311 & 4) != 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final EnumC13024 m16728() {
        EnumC13024 enumC13024M31606 = EnumC13024.m31606(this.f18307);
        return enumC13024M31606 == null ? EnumC13024.REPEATED_FIELD_ENCODING_UNKNOWN : enumC13024M31606;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m16730() {
        return (this.f18311 & 8) != 0;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final EnumC10203 m16729() {
        EnumC10203 enumC10203M25606 = EnumC10203.m25606(this.f18306);
        return enumC10203M25606 == null ? EnumC10203.UTF8_VALIDATION_UNKNOWN : enumC10203M25606;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m16724() {
        return (this.f18311 & 16) != 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final EnumC4558 m16722() {
        EnumC4558 enumC4558M13408 = EnumC4558.m13408(this.f18308);
        return enumC4558M13408 == null ? EnumC4558.MESSAGE_ENCODING_UNKNOWN : enumC4558M13408;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m16720() {
        return (this.f18311 & 32) != 0;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final EnumC22197 m16721() {
        EnumC22197 enumC22197M49859 = EnumC22197.m49859(this.f18304);
        return enumC22197M49859 == null ? EnumC22197.JSON_FORMAT_UNKNOWN : enumC22197M49859;
    }

    @Override // l.AbstractC12154, l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        byte b = this.f18309;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m29574()) {
            this.f18309 = (byte) 0;
            return false;
        }
        this.f18309 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35079 = (this.f18311 & 1) != 0 ? AbstractC14766.m35079(1, this.f18305) : 0;
        if ((this.f18311 & 2) != 0) {
            iM35079 += AbstractC14766.m35079(2, this.f18310);
        }
        if ((this.f18311 & 4) != 0) {
            iM35079 += AbstractC14766.m35079(3, this.f18307);
        }
        if ((this.f18311 & 8) != 0) {
            iM35079 += AbstractC14766.m35079(4, this.f18306);
        }
        if ((this.f18311 & 16) != 0) {
            iM35079 += AbstractC14766.m35079(5, this.f18308);
        }
        if ((this.f18311 & 32) != 0) {
            iM35079 += AbstractC14766.m35079(6, this.f18304);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM35079 + m29577();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC8709
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5969)) {
            return super.equals(obj);
        }
        C5969 c5969 = (C5969) obj;
        if (m16723() != c5969.m16723()) {
            return false;
        }
        if ((m16723() && this.f18305 != c5969.f18305) || m16719() != c5969.m16719()) {
            return false;
        }
        if ((m16719() && this.f18310 != c5969.f18310) || m16726() != c5969.m16726()) {
            return false;
        }
        if ((m16726() && this.f18307 != c5969.f18307) || m16730() != c5969.m16730()) {
            return false;
        }
        if ((m16730() && this.f18306 != c5969.f18306) || m16724() != c5969.m16724()) {
            return false;
        }
        if ((!m16724() || this.f18308 == c5969.f18308) && m16720() == c5969.m16720()) {
            return (!m16720() || this.f18304 == c5969.f18304) && getUnknownFields().equals(c5969.getUnknownFields()) && m29575().equals(c5969.m29575());
        }
        return false;
    }

    @Override // l.AbstractC8709
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C10702.f32245.hashCode() + 779;
        if (m16723()) {
            iHashCode = C4153.m12551(iHashCode, 37, 1, 53) + this.f18305;
        }
        if (m16719()) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + this.f18310;
        }
        if (m16726()) {
            iHashCode = C4153.m12551(iHashCode, 37, 3, 53) + this.f18307;
        }
        if (m16730()) {
            iHashCode = C4153.m12551(iHashCode, 37, 4, 53) + this.f18306;
        }
        if (m16724()) {
            iHashCode = C4153.m12551(iHashCode, 37, 5, 53) + this.f18308;
        }
        if (m16720()) {
            iHashCode = C4153.m12551(iHashCode, 37, 6, 53) + this.f18304;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC8709.m22494(iHashCode, m29575()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5969 m16711(AbstractC5886 abstractC5886, C1570 c1570) {
        return (C5969) ((C19376) f18302).parseFrom(abstractC5886, (C17798) c1570);
    }

    public static C0324 newBuilder() {
        return f18303.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return f18303.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 newBuilderForType() {
        return f18303.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C0324 toBuilder() {
        int i = 0;
        if (this == f18303) {
            return new C0324(i);
        }
        C0324 c0324 = new C0324(i);
        c0324.m1732(this);
        return c0324;
    }

    @Override // l.AbstractC8709
    public final InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C0324(interfaceC9415, 0);
    }

    public static C5969 getDefaultInstance() {
        return f18303;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f18302;
    }

    @Override // l.AbstractC12154, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f18303;
    }

    @Override // l.AbstractC12154, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return f18303;
    }
}
