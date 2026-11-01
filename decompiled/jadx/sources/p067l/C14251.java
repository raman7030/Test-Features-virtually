package p067l;

/* JADX INFO: renamed from: l.۫ܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14251 extends AbstractC6285 implements InterfaceC5773 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۨ */
    public static final C14251 f40572;

    /* JADX INFO: renamed from: ᩺ */
    public static final InterfaceC13820 f40573;

    /* JADX INFO: renamed from: ۗ */
    public int f40574;

    /* JADX INFO: renamed from: ۙ */
    public byte f40575;

    /* JADX INFO: renamed from: ۛ */
    public volatile Object f40576;

    /* JADX INFO: renamed from: ۤ */
    public InterfaceC8296 f40577;

    /* JADX INFO: renamed from: ۫ */
    public int f40578;

    /* JADX INFO: renamed from: ۬ */
    public InterfaceC8296 f40579;

    /* JADX INFO: renamed from: ᩶ */
    public C4964 f40580;

    /* JADX INFO: renamed from: ᩸ */
    public int f40581;

    /* JADX INFO: renamed from: ᩹ */
    public volatile Object f40582;

    static {
        C22006.m49606(EnumC8594.PUBLIC, C14251.class.getName());
        f40572 = new C14251();
        f40573 = new C5534();
    }

    public C14251(C14921 c14921, int i) {
        super(c14921);
        this.f40579 = AbstractC6285.m14287();
        this.f40574 = -1;
        this.f40577 = AbstractC6285.m14287();
        this.f40578 = -1;
        this.f40582 = "";
        this.f40576 = "";
        this.f40580 = C4964.m10513();
        this.f40575 = (byte) -1;
    }

    public C14251() {
        this.f40579 = AbstractC6285.m14287();
        this.f40574 = -1;
        this.f40577 = AbstractC6285.m14287();
        this.f40578 = -1;
        this.f40582 = "";
        this.f40576 = "";
        this.f40580 = C4964.m10513();
        this.f40575 = (byte) -1;
        this.f40579 = AbstractC6285.m14287();
        this.f40577 = AbstractC6285.m14287();
        this.f40582 = "";
        this.f40576 = "";
        this.f40580 = C4964.m10513();
    }

    @Override // p067l.AbstractC6285
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35244;
        c11650.m26787(C14251.class, C14921.class);
        return c11650;
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m32760() {
        return (this.f40581 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m32758() {
        Object obj = this.f40582;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f40582 = strM18427;
        }
        return strM18427;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m32759() {
        return (this.f40581 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final String m32761() {
        Object obj = this.f40576;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f40576 = strM18427;
        }
        return strM18427;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.f40575;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f40575 = (byte) 1;
        return true;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        getSerializedSize();
        if (this.f40579.size() > 0) {
            abstractC16402.mo37253(10);
            abstractC16402.mo37253(this.f40574);
        }
        for (int i = 0; i < this.f40579.size(); i++) {
            abstractC16402.mo37247(this.f40579.getInt(i));
        }
        if (this.f40577.size() > 0) {
            abstractC16402.mo37253(18);
            abstractC16402.mo37253(this.f40578);
        }
        for (int i2 = 0; i2 < this.f40577.size(); i2++) {
            abstractC16402.mo37247(this.f40577.getInt(i2));
        }
        if ((this.f40581 & 1) != 0) {
            AbstractC6285.m14269(abstractC16402, 3, this.f40582);
        }
        if ((this.f40581 & 2) != 0) {
            AbstractC6285.m14269(abstractC16402, 4, this.f40576);
        }
        for (int i3 = 0; i3 < this.f40580.size(); i3++) {
            AbstractC6285.m14269(abstractC16402, 6, this.f40580.mo10519(i3));
        }
        getUnknownFields().writeTo(abstractC16402);
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM37224 = 0;
        for (int i2 = 0; i2 < this.f40579.size(); i2++) {
            iM37224 += AbstractC16402.m37224(this.f40579.getInt(i2));
        }
        int iM37225 = this.f40579.isEmpty() ? iM37224 : AbstractC16402.m37224(iM37224) + iM37224 + 1;
        this.f40574 = iM37224;
        int iM37226 = 0;
        for (int i3 = 0; i3 < this.f40577.size(); i3++) {
            iM37226 += AbstractC16402.m37224(this.f40577.getInt(i3));
        }
        int iM14254 = iM37225 + iM37226;
        if (!this.f40577.isEmpty()) {
            iM14254 = iM14254 + 1 + AbstractC16402.m37224(iM37226);
        }
        this.f40578 = iM37226;
        if ((this.f40581 & 1) != 0) {
            iM14254 += AbstractC6285.m14254(3, this.f40582);
        }
        if ((this.f40581 & 2) != 0) {
            iM14254 += AbstractC6285.m14254(4, this.f40576);
        }
        int iM14284 = 0;
        for (int i4 = 0; i4 < this.f40580.size(); i4++) {
            iM14284 += AbstractC6285.m14284(this.f40580.mo10519(i4));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + this.f40580.size() + iM14254 + iM14284;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // p067l.AbstractC10645
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14251)) {
            return super.equals(obj);
        }
        C14251 c14251 = (C14251) obj;
        if (!this.f40579.equals(c14251.f40579) || !this.f40577.equals(c14251.f40577) || m32760() != c14251.m32760()) {
            return false;
        }
        if ((!m32760() || m32758().equals(c14251.m32758())) && m32759() == c14251.m32759()) {
            return (!m32759() || m32761().equals(c14251.m32761())) && this.f40580.equals(c14251.f40580) && getUnknownFields().equals(c14251.getUnknownFields());
        }
        return false;
    }

    @Override // p067l.AbstractC10645
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12539.f35226.hashCode() + 779;
        if (this.f40579.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + this.f40579.hashCode();
        }
        if (this.f40577.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + this.f40577.hashCode();
        }
        if (m32760()) {
            iHashCode = C6316.m14441(iHashCode, 37, 3, 53) + m32758().hashCode();
        }
        if (m32759()) {
            iHashCode = C6316.m14441(iHashCode, 37, 4, 53) + m32761().hashCode();
        }
        if (this.f40580.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 6, 53) + this.f40580.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C14921 newBuilder() {
        return f40572.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return f40572.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 newBuilderForType() {
        return f40572.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C14921 toBuilder() {
        int i = 0;
        if (this == f40572) {
            return new C14921(i);
        }
        C14921 c14921 = new C14921(i);
        c14921.m34143(this);
        return c14921;
    }

    @Override // p067l.AbstractC10645
    public final InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C14921(interfaceC11316, 0);
    }

    public static C14251 getDefaultInstance() {
        return f40572;
    }

    public static InterfaceC13820 parser() {
        return f40573;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f40573;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f40572;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return f40572;
    }
}
