package p067l;

/* JADX INFO: renamed from: l.ܺۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17428 extends AbstractC6285 implements InterfaceC5773 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۛ */
    public static final InterfaceC13820 f52088;

    /* JADX INFO: renamed from: ۤ */
    public static final C17428 f52089;

    /* JADX INFO: renamed from: ۗ */
    public boolean f52090;

    /* JADX INFO: renamed from: ۙ */
    public int f52091;

    /* JADX INFO: renamed from: ۫ */
    public volatile Object f52092;

    /* JADX INFO: renamed from: ۬ */
    public boolean f52093;

    /* JADX INFO: renamed from: ᩶ */
    public byte f52094;

    /* JADX INFO: renamed from: ᩸ */
    public int f52095;

    /* JADX INFO: renamed from: ᩹ */
    public volatile Object f52096;

    static {
        C22006.m49606(EnumC8594.PUBLIC, C17428.class.getName());
        f52089 = new C17428();
        f52088 = new C11395();
    }

    public C17428(C10724 c10724, int i) {
        super(c10724);
        this.f52091 = 0;
        this.f52096 = "";
        this.f52092 = "";
        this.f52093 = false;
        this.f52090 = false;
        this.f52094 = (byte) -1;
    }

    public C17428() {
        this.f52091 = 0;
        this.f52096 = "";
        this.f52092 = "";
        this.f52093 = false;
        this.f52090 = false;
        this.f52094 = (byte) -1;
        this.f52096 = "";
        this.f52092 = "";
    }

    @Override // p067l.AbstractC6285
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35208;
        c11650.m26787(C17428.class, C10724.class);
        return c11650;
    }

    /* JADX INFO: renamed from: ۖ */
    public final boolean m39687() {
        return (this.f52095 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m39694() {
        return this.f52091;
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m39692() {
        return (this.f52095 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m39689() {
        Object obj = this.f52096;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f52096 = strM18427;
        }
        return strM18427;
    }

    public final boolean hasType() {
        return (this.f52095 & 4) != 0;
    }

    public final String getType() {
        Object obj = this.f52092;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f52092 = strM18427;
        }
        return strM18427;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final boolean m39693() {
        return (this.f52095 & 8) != 0;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m39690() {
        return this.f52093;
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m39688() {
        return (this.f52095 & 16) != 0;
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m39691() {
        return this.f52090;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.f52094;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f52094 = (byte) 1;
        return true;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        if ((this.f52095 & 1) != 0) {
            abstractC16402.mo37248(1, this.f52091);
        }
        if ((this.f52095 & 2) != 0) {
            AbstractC6285.m14269(abstractC16402, 2, this.f52096);
        }
        if ((this.f52095 & 4) != 0) {
            AbstractC6285.m14269(abstractC16402, 3, this.f52092);
        }
        if ((this.f52095 & 8) != 0) {
            abstractC16402.mo37240(5, this.f52093);
        }
        if ((this.f52095 & 16) != 0) {
            abstractC16402.mo37240(6, this.f52090);
        }
        getUnknownFields().writeTo(abstractC16402);
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM37221 = (this.f52095 & 1) != 0 ? AbstractC16402.m37221(1, this.f52091) : 0;
        if ((this.f52095 & 2) != 0) {
            iM37221 += AbstractC6285.m14254(2, this.f52096);
        }
        if ((this.f52095 & 4) != 0) {
            iM37221 += AbstractC6285.m14254(3, this.f52092);
        }
        if ((this.f52095 & 8) != 0) {
            iM37221 += AbstractC16402.m37227(5);
        }
        if ((this.f52095 & 16) != 0) {
            iM37221 += AbstractC16402.m37227(6);
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
        if (!(obj instanceof C17428)) {
            return super.equals(obj);
        }
        C17428 c17428 = (C17428) obj;
        if (m39687() != c17428.m39687()) {
            return false;
        }
        if ((m39687() && this.f52091 != c17428.f52091) || m39692() != c17428.m39692()) {
            return false;
        }
        if ((m39692() && !m39689().equals(c17428.m39689())) || hasType() != c17428.hasType()) {
            return false;
        }
        if ((hasType() && !getType().equals(c17428.getType())) || m39693() != c17428.m39693()) {
            return false;
        }
        if ((!m39693() || this.f52093 == c17428.f52093) && m39688() == c17428.m39688()) {
            return (!m39688() || this.f52090 == c17428.f52090) && getUnknownFields().equals(c17428.getUnknownFields());
        }
        return false;
    }

    @Override // p067l.AbstractC10645
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12539.f35190.hashCode() + 779;
        if (m39687()) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + this.f52091;
        }
        if (m39692()) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + m39689().hashCode();
        }
        if (hasType()) {
            iHashCode = C6316.m14441(iHashCode, 37, 3, 53) + getType().hashCode();
        }
        if (m39693()) {
            iHashCode = C6316.m14441(iHashCode, 37, 5, 53) + C15671.m35601(this.f52093);
        }
        if (m39688()) {
            iHashCode = C6316.m14441(iHashCode, 37, 6, 53) + C15671.m35601(this.f52090);
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C10724 newBuilder() {
        return f52089.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return f52089.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 newBuilderForType() {
        return f52089.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C10724 toBuilder() {
        int i = 0;
        if (this == f52089) {
            return new C10724(i);
        }
        C10724 c10724 = new C10724(i);
        c10724.m24662(this);
        return c10724;
    }

    @Override // p067l.AbstractC10645
    public final InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C10724(interfaceC11316, 0);
    }

    public static C17428 getDefaultInstance() {
        return f52089;
    }

    public static InterfaceC13820 parser() {
        return f52088;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f52088;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f52089;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return f52089;
    }
}
