package p067l;

/* JADX INFO: renamed from: l.ۘܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6205 extends AbstractC6285 implements InterfaceC5773 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ */
    public static final C6205 f15621;

    /* JADX INFO: renamed from: ۬ */
    public static final InterfaceC13820 f15622;

    /* JADX INFO: renamed from: ۙ */
    public C2851 f15623;

    /* JADX INFO: renamed from: ᩶ */
    public volatile Object f15624;

    /* JADX INFO: renamed from: ᩸ */
    public int f15625;

    /* JADX INFO: renamed from: ᩹ */
    public byte f15626;

    static {
        C22006.m49606(EnumC8594.PUBLIC, C6205.class.getName());
        f15621 = new C6205();
        f15622 = new C17603();
    }

    public C6205(C4864 c4864, int i) {
        super(c4864);
        this.f15624 = "";
        this.f15626 = (byte) -1;
    }

    public C6205() {
        this.f15624 = "";
        this.f15626 = (byte) -1;
        this.f15624 = "";
    }

    @Override // p067l.AbstractC6285
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35199;
        c11650.m26787(C6205.class, C4864.class);
        return c11650;
    }

    public final boolean hasName() {
        return (this.f15625 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f15624;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f15624 = strM18427;
        }
        return strM18427;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m14060() {
        return (this.f15625 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۜ */
    public final C2851 m14059() {
        C2851 c2851 = this.f15623;
        return c2851 == null ? C2851.getDefaultInstance() : c2851;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.f15626;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (m14060() && !m14059().isInitialized()) {
            this.f15626 = (byte) 0;
            return false;
        }
        this.f15626 = (byte) 1;
        return true;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        if ((this.f15625 & 1) != 0) {
            AbstractC6285.m14269(abstractC16402, 1, this.f15624);
        }
        if ((this.f15625 & 2) != 0) {
            abstractC16402.mo37251(2, m14059());
        }
        getUnknownFields().writeTo(abstractC16402);
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM14254 = (this.f15625 & 1) != 0 ? AbstractC6285.m14254(1, this.f15624) : 0;
        if ((this.f15625 & 2) != 0) {
            iM14254 += AbstractC16402.m37229(2, m14059());
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
        if (!(obj instanceof C6205)) {
            return super.equals(obj);
        }
        C6205 c6205 = (C6205) obj;
        if (hasName() != c6205.hasName()) {
            return false;
        }
        if ((!hasName() || getName().equals(c6205.getName())) && m14060() == c6205.m14060()) {
            return (!m14060() || m14059().equals(c6205.m14059())) && getUnknownFields().equals(c6205.getUnknownFields());
        }
        return false;
    }

    @Override // p067l.AbstractC10645
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12539.f35195.hashCode() + 779;
        if (hasName()) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (m14060()) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + m14059().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C4864 newBuilder() {
        return f15621.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return f15621.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 newBuilderForType() {
        return f15621.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C4864 toBuilder() {
        int i = 0;
        if (this == f15621) {
            return new C4864(i);
        }
        C4864 c4864 = new C4864(i);
        c4864.m10304(this);
        return c4864;
    }

    @Override // p067l.AbstractC10645
    public final InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C4864(interfaceC11316, 0);
    }

    public static C6205 getDefaultInstance() {
        return f15621;
    }

    public static InterfaceC13820 parser() {
        return f15622;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f15622;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f15621;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return f15621;
    }
}
