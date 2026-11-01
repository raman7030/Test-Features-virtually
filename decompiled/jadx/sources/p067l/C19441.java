package p067l;

/* JADX INFO: renamed from: l.ᩳۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19441 extends AbstractC6285 implements InterfaceC5773 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۫ */
    public static final InterfaceC13820 f59213;

    /* JADX INFO: renamed from: ۬ */
    public static final C19441 f59214;

    /* JADX INFO: renamed from: ۗ */
    public C24805 f59215;

    /* JADX INFO: renamed from: ۙ */
    public int f59216;

    /* JADX INFO: renamed from: ᩶ */
    public volatile Object f59217;

    /* JADX INFO: renamed from: ᩸ */
    public int f59218;

    /* JADX INFO: renamed from: ᩹ */
    public byte f59219;

    static {
        C22006.m49606(EnumC8594.PUBLIC, C19441.class.getName());
        f59214 = new C19441();
        f59213 = new C12736();
    }

    public C19441(C18099 c18099, int i) {
        super(c18099);
        this.f59217 = "";
        this.f59216 = 0;
        this.f59219 = (byte) -1;
    }

    public C19441() {
        this.f59217 = "";
        this.f59216 = 0;
        this.f59219 = (byte) -1;
        this.f59217 = "";
    }

    @Override // p067l.AbstractC6285
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35237;
        c11650.m26787(C19441.class, C18099.class);
        return c11650;
    }

    public final boolean hasName() {
        return (this.f59218 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f59217;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f59217 = strM18427;
        }
        return strM18427;
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m44213() {
        return (this.f59218 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m44211() {
        return this.f59216;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m44212() {
        return (this.f59218 & 4) != 0;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final C24805 m44214() {
        C24805 c24805 = this.f59215;
        return c24805 == null ? C24805.getDefaultInstance() : c24805;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.f59219;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (m44212() && !m44214().isInitialized()) {
            this.f59219 = (byte) 0;
            return false;
        }
        this.f59219 = (byte) 1;
        return true;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        if ((this.f59218 & 1) != 0) {
            AbstractC6285.m14269(abstractC16402, 1, this.f59217);
        }
        if ((this.f59218 & 2) != 0) {
            abstractC16402.mo37248(2, this.f59216);
        }
        if ((this.f59218 & 4) != 0) {
            abstractC16402.mo37251(3, m44214());
        }
        getUnknownFields().writeTo(abstractC16402);
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM14254 = (this.f59218 & 1) != 0 ? AbstractC6285.m14254(1, this.f59217) : 0;
        if ((this.f59218 & 2) != 0) {
            iM14254 += AbstractC16402.m37221(2, this.f59216);
        }
        if ((this.f59218 & 4) != 0) {
            iM14254 += AbstractC16402.m37229(3, m44214());
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
        if (!(obj instanceof C19441)) {
            return super.equals(obj);
        }
        C19441 c19441 = (C19441) obj;
        if (hasName() != c19441.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(c19441.getName())) || m44213() != c19441.m44213()) {
            return false;
        }
        if ((!m44213() || this.f59216 == c19441.f59216) && m44212() == c19441.m44212()) {
            return (!m44212() || m44214().equals(c19441.m44214())) && getUnknownFields().equals(c19441.getUnknownFields());
        }
        return false;
    }

    @Override // p067l.AbstractC10645
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12539.f35235.hashCode() + 779;
        if (hasName()) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (m44213()) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + this.f59216;
        }
        if (m44212()) {
            iHashCode = C6316.m14441(iHashCode, 37, 3, 53) + m44214().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C18099 newBuilder() {
        return f59214.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return f59214.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 newBuilderForType() {
        return f59214.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C18099 toBuilder() {
        int i = 0;
        if (this == f59214) {
            return new C18099(i);
        }
        C18099 c18099 = new C18099(i);
        c18099.m41162(this);
        return c18099;
    }

    @Override // p067l.AbstractC10645
    public final InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C18099(interfaceC11316, 0);
    }

    public static C19441 getDefaultInstance() {
        return f59214;
    }

    public static InterfaceC13820 parser() {
        return f59213;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f59213;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f59214;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return f59214;
    }
}
