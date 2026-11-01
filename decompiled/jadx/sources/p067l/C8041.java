package p067l;

import moe.shizuku.server.IShizukuApplication;

/* JADX INFO: renamed from: l.ۛۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8041 extends AbstractC13919 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۨ */
    public static final /* synthetic */ int f21154 = 0;

    /* JADX INFO: renamed from: ܰ */
    public static final InterfaceC13820 f21155;

    /* JADX INFO: renamed from: ᩺ */
    public static final C8041 f21156;

    /* JADX INFO: renamed from: ۗ */
    public int f21157;

    /* JADX INFO: renamed from: ۙ */
    public int f21158;

    /* JADX INFO: renamed from: ۛ */
    public int f21159;

    /* JADX INFO: renamed from: ۤ */
    public int f21160;

    /* JADX INFO: renamed from: ۫ */
    public int f21161;

    /* JADX INFO: renamed from: ۬ */
    public byte f21162;

    /* JADX INFO: renamed from: ᩶ */
    public int f21163;

    /* JADX INFO: renamed from: ᩹ */
    public int f21164;

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        C14589 c14589 = new C14589(this);
        if ((this.f21164 & 1) != 0) {
            abstractC16402.mo37248(1, this.f21158);
        }
        if ((this.f21164 & 2) != 0) {
            abstractC16402.mo37248(2, this.f21163);
        }
        if ((this.f21164 & 4) != 0) {
            abstractC16402.mo37248(3, this.f21160);
        }
        if ((this.f21164 & 8) != 0) {
            abstractC16402.mo37248(4, this.f21159);
        }
        if ((this.f21164 & 16) != 0) {
            abstractC16402.mo37248(5, this.f21161);
        }
        if ((this.f21164 & 32) != 0) {
            abstractC16402.mo37248(6, this.f21157);
        }
        c14589.m33381(IShizukuApplication.Stub.TRANSACTION_showPermissionConfirmation, abstractC16402);
        getUnknownFields().writeTo(abstractC16402);
    }

    static {
        C22006.m49606(EnumC8594.PUBLIC, C8041.class.getName());
        f21156 = new C8041();
        f21155 = new C20783();
    }

    public C8041(C2676 c2676) {
        super(c2676);
        this.f21158 = 0;
        this.f21163 = 0;
        this.f21160 = 0;
        this.f21159 = 0;
        this.f21161 = 0;
        this.f21157 = 0;
        this.f21162 = (byte) -1;
    }

    public C8041() {
        this.f21162 = (byte) -1;
        this.f21158 = 0;
        this.f21163 = 0;
        this.f21160 = 0;
        this.f21159 = 0;
        this.f21161 = 0;
        this.f21157 = 0;
    }

    @Override // p067l.AbstractC6285
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35218;
        c11650.m26787(C8041.class, C2676.class);
        return c11650;
    }

    /* JADX INFO: renamed from: ۚ */
    public final boolean m18649() {
        return (this.f21164 & 1) != 0;
    }

    /* JADX INFO: renamed from: ܺ */
    public final EnumC16757 m18653() {
        EnumC16757 enumC16757M37997 = EnumC16757.m37997(this.f21158);
        return enumC16757M37997 == null ? EnumC16757.FIELD_PRESENCE_UNKNOWN : enumC16757M37997;
    }

    /* JADX INFO: renamed from: ֡ */
    public final boolean m18645() {
        return (this.f21164 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۡ */
    public final EnumC3347 m18651() {
        EnumC3347 enumC3347M5840 = EnumC3347.m5840(this.f21163);
        return enumC3347M5840 == null ? EnumC3347.ENUM_TYPE_UNKNOWN : enumC3347M5840;
    }

    /* JADX INFO: renamed from: ܶ */
    public final boolean m18652() {
        return (this.f21164 & 4) != 0;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final EnumC14746 m18654() {
        EnumC14746 enumC14746M33691 = EnumC14746.m33691(this.f21160);
        return enumC14746M33691 == null ? EnumC14746.REPEATED_FIELD_ENCODING_UNKNOWN : enumC14746M33691;
    }

    /* JADX INFO: renamed from: ᩸ */
    public final boolean m18656() {
        return (this.f21164 & 8) != 0;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final EnumC12065 m18655() {
        EnumC12065 enumC12065M27628 = EnumC12065.m27628(this.f21159);
        return enumC12065M27628 == null ? EnumC12065.UTF8_VALIDATION_UNKNOWN : enumC12065M27628;
    }

    /* JADX INFO: renamed from: ۠ */
    public final boolean m18650() {
        return (this.f21164 & 16) != 0;
    }

    /* JADX INFO: renamed from: ۘ */
    public final EnumC6700 m18648() {
        EnumC6700 enumC6700M15296 = EnumC6700.m15296(this.f21161);
        return enumC6700M15296 == null ? EnumC6700.MESSAGE_ENCODING_UNKNOWN : enumC6700M15296;
    }

    /* JADX INFO: renamed from: ֨ */
    public final boolean m18646() {
        return (this.f21164 & 32) != 0;
    }

    /* JADX INFO: renamed from: ۖ */
    public final EnumC23464 m18647() {
        EnumC23464 enumC23464M52186 = EnumC23464.m52186(this.f21157);
        return enumC23464M52186 == null ? EnumC23464.JSON_FORMAT_UNKNOWN : enumC23464M52186;
    }

    @Override // p067l.AbstractC13919, p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.f21162;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m31639()) {
            this.f21162 = (byte) 0;
            return false;
        }
        this.f21162 = (byte) 1;
        return true;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM37226 = (this.f21164 & 1) != 0 ? AbstractC16402.m37226(1, this.f21158) : 0;
        if ((this.f21164 & 2) != 0) {
            iM37226 += AbstractC16402.m37226(2, this.f21163);
        }
        if ((this.f21164 & 4) != 0) {
            iM37226 += AbstractC16402.m37226(3, this.f21160);
        }
        if ((this.f21164 & 8) != 0) {
            iM37226 += AbstractC16402.m37226(4, this.f21159);
        }
        if ((this.f21164 & 16) != 0) {
            iM37226 += AbstractC16402.m37226(5, this.f21161);
        }
        if ((this.f21164 & 32) != 0) {
            iM37226 += AbstractC16402.m37226(6, this.f21157);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM37226 + m31642();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // p067l.AbstractC10645
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8041)) {
            return super.equals(obj);
        }
        C8041 c8041 = (C8041) obj;
        if (m18649() != c8041.m18649()) {
            return false;
        }
        if ((m18649() && this.f21158 != c8041.f21158) || m18645() != c8041.m18645()) {
            return false;
        }
        if ((m18645() && this.f21163 != c8041.f21163) || m18652() != c8041.m18652()) {
            return false;
        }
        if ((m18652() && this.f21160 != c8041.f21160) || m18656() != c8041.m18656()) {
            return false;
        }
        if ((m18656() && this.f21159 != c8041.f21159) || m18650() != c8041.m18650()) {
            return false;
        }
        if ((!m18650() || this.f21161 == c8041.f21161) && m18646() == c8041.m18646()) {
            return (!m18646() || this.f21157 == c8041.f21157) && getUnknownFields().equals(c8041.getUnknownFields()) && m31640().equals(c8041.m31640());
        }
        return false;
    }

    @Override // p067l.AbstractC10645
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12539.f35220.hashCode() + 779;
        if (m18649()) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + this.f21158;
        }
        if (m18645()) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + this.f21163;
        }
        if (m18652()) {
            iHashCode = C6316.m14441(iHashCode, 37, 3, 53) + this.f21160;
        }
        if (m18656()) {
            iHashCode = C6316.m14441(iHashCode, 37, 4, 53) + this.f21159;
        }
        if (m18650()) {
            iHashCode = C6316.m14441(iHashCode, 37, 5, 53) + this.f21161;
        }
        if (m18646()) {
            iHashCode = C6316.m14441(iHashCode, 37, 6, 53) + this.f21157;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC10645.m24463(iHashCode, m31640()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8041 m18637(AbstractC7962 abstractC7962, C3860 c3860) {
        return (C8041) ((C20783) f21155).parseFrom(abstractC7962, (C19283) c3860);
    }

    public static C2676 newBuilder() {
        return f21156.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return f21156.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 newBuilderForType() {
        return f21156.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C2676 toBuilder() {
        int i = 0;
        if (this == f21156) {
            return new C2676(i);
        }
        C2676 c2676 = new C2676(i);
        c2676.m4130(this);
        return c2676;
    }

    @Override // p067l.AbstractC10645
    public final InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C2676(interfaceC11316, 0);
    }

    public static C8041 getDefaultInstance() {
        return f21156;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f21155;
    }

    @Override // p067l.AbstractC13919, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f21156;
    }

    @Override // p067l.AbstractC13919, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return f21156;
    }
}
