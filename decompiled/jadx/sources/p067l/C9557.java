package p067l;

/* JADX INFO: renamed from: l.۟ܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9557 extends AbstractC6285 implements InterfaceC5773 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ */
    public static final C9557 f26266;

    /* JADX INFO: renamed from: ۬ */
    public static final InterfaceC13820 f26267;

    /* JADX INFO: renamed from: ۙ */
    public volatile Object f26268;

    /* JADX INFO: renamed from: ᩶ */
    public byte f26269;

    /* JADX INFO: renamed from: ᩸ */
    public int f26270;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f26271;

    static {
        C22006.m49606(EnumC8594.PUBLIC, C9557.class.getName());
        f26266 = new C9557();
        f26267 = new C24309();
    }

    public C9557(C15591 c15591, int i) {
        super(c15591);
        this.f26268 = "";
        this.f26271 = false;
        this.f26269 = (byte) -1;
    }

    public C9557() {
        this.f26268 = "";
        this.f26271 = false;
        this.f26269 = (byte) -1;
        this.f26268 = "";
    }

    @Override // p067l.AbstractC6285
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35197;
        c11650.m26787(C9557.class, C15591.class);
        return c11650;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m22260() {
        return (this.f26270 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final String m22262() {
        Object obj = this.f26268;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f26268 = strM18427;
        }
        return strM18427;
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m22261() {
        return (this.f26270 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m22259() {
        return this.f26271;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.f26269;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m22260()) {
            this.f26269 = (byte) 0;
            return false;
        }
        if (!m22261()) {
            this.f26269 = (byte) 0;
            return false;
        }
        this.f26269 = (byte) 1;
        return true;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        if ((this.f26270 & 1) != 0) {
            AbstractC6285.m14269(abstractC16402, 1, this.f26268);
        }
        if ((this.f26270 & 2) != 0) {
            abstractC16402.mo37240(2, this.f26271);
        }
        getUnknownFields().writeTo(abstractC16402);
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM14254 = (this.f26270 & 1) != 0 ? AbstractC6285.m14254(1, this.f26268) : 0;
        if ((this.f26270 & 2) != 0) {
            iM14254 += AbstractC16402.m37227(2);
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
        if (!(obj instanceof C9557)) {
            return super.equals(obj);
        }
        C9557 c9557 = (C9557) obj;
        if (m22260() != c9557.m22260()) {
            return false;
        }
        if ((!m22260() || m22262().equals(c9557.m22262())) && m22261() == c9557.m22261()) {
            return (!m22261() || this.f26271 == c9557.f26271) && getUnknownFields().equals(c9557.getUnknownFields());
        }
        return false;
    }

    @Override // p067l.AbstractC10645
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12539.f35201.hashCode() + 779;
        if (m22260()) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + m22262().hashCode();
        }
        if (m22261()) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + C15671.m35601(this.f26271);
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C15591 newBuilder() {
        return f26266.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return f26266.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 newBuilderForType() {
        return f26266.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C15591 toBuilder() {
        int i = 0;
        if (this == f26266) {
            return new C15591(i);
        }
        C15591 c15591 = new C15591(i);
        c15591.m35443(this);
        return c15591;
    }

    @Override // p067l.AbstractC10645
    public final InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C15591(interfaceC11316, 0);
    }

    public static C9557 getDefaultInstance() {
        return f26266;
    }

    public static InterfaceC13820 parser() {
        return f26267;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f26267;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f26266;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return f26266;
    }
}
