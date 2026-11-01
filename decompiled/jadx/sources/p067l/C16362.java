package p067l;

/* JADX INFO: renamed from: l.ܳ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U940 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16362 extends AbstractC6285 implements InterfaceC5773 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ */
    public static final /* synthetic */ int f48078 = 0;

    /* JADX INFO: renamed from: ۫ */
    public static final InterfaceC13820 f48079;

    /* JADX INFO: renamed from: ۬ */
    public static final C16362 f48080;

    /* JADX INFO: renamed from: ۙ */
    public int f48081;

    /* JADX INFO: renamed from: ᩶ */
    public byte f48082;

    /* JADX INFO: renamed from: ᩸ */
    public int f48083;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f48084;

    static {
        C22006.m49606(EnumC8594.PUBLIC, C16362.class.getName());
        f48080 = new C16362();
        f48079 = new C13011();
    }

    public C16362(C18374 c18374, int i) {
        super(c18374);
        this.f48084 = false;
        this.f48081 = 0;
        this.f48082 = (byte) -1;
    }

    public C16362() {
        this.f48084 = false;
        this.f48082 = (byte) -1;
        this.f48081 = 0;
    }

    @Override // p067l.AbstractC6285
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C25080.f80007;
        c11650.m26787(C16362.class, C18374.class);
        return c11650;
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m37182() {
        return (this.f48083 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m37180() {
        return this.f48084;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m37181() {
        return (this.f48083 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final EnumC19045 m37183() {
        EnumC19045 enumC19045M43273 = EnumC19045.m43273(this.f48081);
        return enumC19045M43273 == null ? EnumC19045.UTF8_VALIDATION_UNKNOWN : enumC19045M43273;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.f48082;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f48082 = (byte) 1;
        return true;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        if ((this.f48083 & 1) != 0) {
            abstractC16402.mo37240(1, this.f48084);
        }
        if ((this.f48083 & 2) != 0) {
            abstractC16402.mo37248(2, this.f48081);
        }
        getUnknownFields().writeTo(abstractC16402);
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM37227 = (this.f48083 & 1) != 0 ? AbstractC16402.m37227(1) : 0;
        if ((this.f48083 & 2) != 0) {
            iM37227 += AbstractC16402.m37226(2, this.f48081);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM37227;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // p067l.AbstractC10645
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16362)) {
            return super.equals(obj);
        }
        C16362 c16362 = (C16362) obj;
        if (m37182() != c16362.m37182()) {
            return false;
        }
        if ((!m37182() || this.f48084 == c16362.f48084) && m37181() == c16362.m37181()) {
            return (!m37181() || this.f48081 == c16362.f48081) && getUnknownFields().equals(c16362.getUnknownFields());
        }
        return false;
    }

    @Override // p067l.AbstractC10645
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C25080.f80006.hashCode() + 779;
        if (m37182()) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + C15671.m35601(this.f48084);
        }
        if (m37181()) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + this.f48081;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C18374 newBuilder() {
        return f48080.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return f48080.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 newBuilderForType() {
        return f48080.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C18374 toBuilder() {
        int i = 0;
        if (this == f48080) {
            return new C18374(i);
        }
        C18374 c18374 = new C18374(i);
        c18374.m41853(this);
        return c18374;
    }

    @Override // p067l.AbstractC10645
    public final InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C18374(interfaceC11316, 0);
    }

    public static C16362 getDefaultInstance() {
        return f48080;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f48079;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f48080;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return f48080;
    }
}
