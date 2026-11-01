package p067l;

/* JADX INFO: renamed from: l.֨ۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3327 extends AbstractC6285 implements InterfaceC5773 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۤ */
    public static final InterfaceC13820 f6498;

    /* JADX INFO: renamed from: ۫ */
    public static final C3327 f6499;

    /* JADX INFO: renamed from: ۗ */
    public int f6500;

    /* JADX INFO: renamed from: ۙ */
    public int f6501;

    /* JADX INFO: renamed from: ۬ */
    public byte f6502;

    /* JADX INFO: renamed from: ᩶ */
    public int f6503;

    /* JADX INFO: renamed from: ᩸ */
    public int f6504;

    /* JADX INFO: renamed from: ᩹ */
    public volatile Object f6505;

    static {
        C22006.m49606(EnumC8594.PUBLIC, C3327.class.getName());
        f6499 = new C3327();
        f6498 = new C2656();
    }

    public C3327(C7351 c7351, int i) {
        super(c7351);
        this.f6501 = 0;
        this.f6503 = 0;
        this.f6505 = "";
        this.f6500 = 0;
        this.f6502 = (byte) -1;
    }

    public C3327() {
        this.f6501 = 0;
        this.f6503 = 0;
        this.f6505 = "";
        this.f6500 = 0;
        this.f6502 = (byte) -1;
        this.f6501 = 0;
        this.f6503 = 0;
        this.f6505 = "";
        this.f6500 = 0;
    }

    @Override // p067l.AbstractC6285
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35207;
        c11650.m26787(C3327.class, C7351.class);
        return c11650;
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m5804() {
        return (this.f6504 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۢ */
    public final EnumC5674 m5807() {
        EnumC5674 enumC5674M12645 = EnumC5674.m12645(this.f6501);
        return enumC5674M12645 == null ? EnumC5674.EDITION_UNKNOWN : enumC5674M12645;
    }

    /* JADX INFO: renamed from: ۖ */
    public final boolean m5803() {
        return (this.f6504 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final EnumC5674 m5810() {
        EnumC5674 enumC5674M12645 = EnumC5674.m12645(this.f6503);
        return enumC5674M12645 == null ? EnumC5674.EDITION_UNKNOWN : enumC5674M12645;
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m5808() {
        return (this.f6504 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m5805() {
        Object obj = this.f6505;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f6505 = strM18427;
        }
        return strM18427;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final boolean m5809() {
        return (this.f6504 & 8) != 0;
    }

    /* JADX INFO: renamed from: ۡ */
    public final EnumC5674 m5806() {
        EnumC5674 enumC5674M12645 = EnumC5674.m12645(this.f6500);
        return enumC5674M12645 == null ? EnumC5674.EDITION_UNKNOWN : enumC5674M12645;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.f6502;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f6502 = (byte) 1;
        return true;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        if ((this.f6504 & 1) != 0) {
            abstractC16402.mo37248(1, this.f6501);
        }
        if ((this.f6504 & 2) != 0) {
            abstractC16402.mo37248(2, this.f6503);
        }
        if ((this.f6504 & 4) != 0) {
            AbstractC6285.m14269(abstractC16402, 3, this.f6505);
        }
        if ((this.f6504 & 8) != 0) {
            abstractC16402.mo37248(4, this.f6500);
        }
        getUnknownFields().writeTo(abstractC16402);
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM37226 = (this.f6504 & 1) != 0 ? AbstractC16402.m37226(1, this.f6501) : 0;
        if ((this.f6504 & 2) != 0) {
            iM37226 += AbstractC16402.m37226(2, this.f6503);
        }
        if ((this.f6504 & 4) != 0) {
            iM37226 += AbstractC6285.m14254(3, this.f6505);
        }
        if ((this.f6504 & 8) != 0) {
            iM37226 += AbstractC16402.m37226(4, this.f6500);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM37226;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // p067l.AbstractC10645
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3327)) {
            return super.equals(obj);
        }
        C3327 c3327 = (C3327) obj;
        if (m5804() != c3327.m5804()) {
            return false;
        }
        if ((m5804() && this.f6501 != c3327.f6501) || m5803() != c3327.m5803()) {
            return false;
        }
        if ((m5803() && this.f6503 != c3327.f6503) || m5808() != c3327.m5808()) {
            return false;
        }
        if ((!m5808() || m5805().equals(c3327.m5805())) && m5809() == c3327.m5809()) {
            return (!m5809() || this.f6500 == c3327.f6500) && getUnknownFields().equals(c3327.getUnknownFields());
        }
        return false;
    }

    @Override // p067l.AbstractC10645
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12539.f35222.hashCode() + 779;
        if (m5804()) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + this.f6501;
        }
        if (m5803()) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + this.f6503;
        }
        if (m5808()) {
            iHashCode = C6316.m14441(iHashCode, 37, 3, 53) + m5805().hashCode();
        }
        if (m5809()) {
            iHashCode = C6316.m14441(iHashCode, 37, 4, 53) + this.f6500;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C7351 newBuilder() {
        return f6499.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return f6499.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 newBuilderForType() {
        return f6499.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C7351 toBuilder() {
        int i = 0;
        if (this == f6499) {
            return new C7351(i);
        }
        C7351 c7351 = new C7351(i);
        c7351.m17032(this);
        return c7351;
    }

    @Override // p067l.AbstractC10645
    public final InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C7351(interfaceC11316, 0);
    }

    public static C3327 getDefaultInstance() {
        return f6499;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f6498;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f6499;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return f6499;
    }
}
