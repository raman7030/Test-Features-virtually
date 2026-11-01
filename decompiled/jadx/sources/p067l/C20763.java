package p067l;

/* JADX INFO: renamed from: l.᩵ۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20763 extends AbstractC6285 implements InterfaceC5773 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ */
    public static final C20763 f65265;

    /* JADX INFO: renamed from: ۬ */
    public static final InterfaceC13820 f65266;

    /* JADX INFO: renamed from: ۙ */
    public volatile Object f65267;

    /* JADX INFO: renamed from: ᩶ */
    public byte f65268;

    /* JADX INFO: renamed from: ᩸ */
    public int f65269;

    /* JADX INFO: renamed from: ᩹ */
    public int f65270;

    static {
        C22006.m49606(EnumC8594.PUBLIC, C20763.class.getName());
        f65265 = new C20763();
        f65266 = new C6010();
    }

    public C20763(C20092 c20092, int i) {
        super(c20092);
        this.f65270 = 0;
        this.f65267 = "";
        this.f65268 = (byte) -1;
    }

    public C20763() {
        this.f65270 = 0;
        this.f65267 = "";
        this.f65268 = (byte) -1;
        this.f65270 = 0;
        this.f65267 = "";
    }

    @Override // p067l.AbstractC6285
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35247;
        c11650.m26787(C20763.class, C20092.class);
        return c11650;
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m46876() {
        return (this.f65269 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۜ */
    public final EnumC5674 m46874() {
        EnumC5674 enumC5674M12645 = EnumC5674.m12645(this.f65270);
        return enumC5674M12645 == null ? EnumC5674.EDITION_UNKNOWN : enumC5674M12645;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m46875() {
        return (this.f65269 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final String m46877() {
        Object obj = this.f65267;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f65267 = strM18427;
        }
        return strM18427;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.f65268;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f65268 = (byte) 1;
        return true;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        if ((this.f65269 & 2) != 0) {
            AbstractC6285.m14269(abstractC16402, 2, this.f65267);
        }
        if ((this.f65269 & 1) != 0) {
            abstractC16402.mo37248(3, this.f65270);
        }
        getUnknownFields().writeTo(abstractC16402);
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM14254 = (this.f65269 & 2) != 0 ? AbstractC6285.m14254(2, this.f65267) : 0;
        if ((this.f65269 & 1) != 0) {
            iM14254 += AbstractC16402.m37226(3, this.f65270);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM14254;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // p067l.AbstractC10645
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C20763)) {
            return super.equals(obj);
        }
        C20763 c20763 = (C20763) obj;
        if (m46876() != c20763.m46876()) {
            return false;
        }
        if ((!m46876() || this.f65270 == c20763.f65270) && m46875() == c20763.m46875()) {
            return (!m46875() || m46877().equals(c20763.m46877())) && getUnknownFields().equals(c20763.getUnknownFields());
        }
        return false;
    }

    @Override // p067l.AbstractC10645
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12539.f35217.hashCode() + 779;
        if (m46876()) {
            iHashCode = C6316.m14441(iHashCode, 37, 3, 53) + this.f65270;
        }
        if (m46875()) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + m46877().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C20092 newBuilder() {
        return f65265.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return f65265.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 newBuilderForType() {
        return f65265.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C20092 toBuilder() {
        int i = 0;
        if (this == f65265) {
            return new C20092(i);
        }
        C20092 c20092 = new C20092(i);
        c20092.m45508(this);
        return c20092;
    }

    @Override // p067l.AbstractC10645
    public final InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C20092(interfaceC11316, 0);
    }

    public static C20763 getDefaultInstance() {
        return f65265;
    }

    public static InterfaceC13820 parser() {
        return f65266;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f65266;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f65265;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return f65265;
    }
}
