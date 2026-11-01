package p067l;

/* JADX INFO: renamed from: l.ܳܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16262 extends AbstractC6285 implements InterfaceC5773 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۛ */
    public static final C16262 f47819;

    /* JADX INFO: renamed from: ۨ */
    public static final InterfaceC13820 f47820;

    /* JADX INFO: renamed from: ۗ */
    public volatile Object f47821;

    /* JADX INFO: renamed from: ۙ */
    public byte f47822;

    /* JADX INFO: renamed from: ۤ */
    public boolean f47823;

    /* JADX INFO: renamed from: ۫ */
    public volatile Object f47824;

    /* JADX INFO: renamed from: ۬ */
    public C10899 f47825;

    /* JADX INFO: renamed from: ᩶ */
    public volatile Object f47826;

    /* JADX INFO: renamed from: ᩸ */
    public int f47827;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f47828;

    static {
        C22006.m49606(EnumC8594.PUBLIC, C16262.class.getName());
        f47819 = new C16262();
        f47820 = new C19616();
    }

    public C16262(C18945 c18945, int i) {
        super(c18945);
        this.f47821 = "";
        this.f47826 = "";
        this.f47824 = "";
        this.f47828 = false;
        this.f47823 = false;
        this.f47822 = (byte) -1;
    }

    public C16262() {
        this.f47821 = "";
        this.f47826 = "";
        this.f47824 = "";
        this.f47828 = false;
        this.f47823 = false;
        this.f47822 = (byte) -1;
        this.f47821 = "";
        this.f47826 = "";
        this.f47824 = "";
    }

    @Override // p067l.AbstractC6285
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35213;
        c11650.m26787(C16262.class, C18945.class);
        return c11650;
    }

    public final boolean hasName() {
        return (this.f47827 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f47821;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f47821 = strM18427;
        }
        return strM18427;
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m37051() {
        return (this.f47827 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final String m37058() {
        Object obj = this.f47826;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f47826 = strM18427;
        }
        return strM18427;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final boolean m37057() {
        return (this.f47827 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۡ */
    public final String m37053() {
        Object obj = this.f47824;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f47824 = strM18427;
        }
        return strM18427;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final boolean m37056() {
        return (this.f47827 & 8) != 0;
    }

    /* JADX INFO: renamed from: ۢ */
    public final C10899 m37054() {
        C10899 c10899 = this.f47825;
        return c10899 == null ? C10899.getDefaultInstance() : c10899;
    }

    /* JADX INFO: renamed from: ۖ */
    public final boolean m37050() {
        return (this.f47827 & 16) != 0;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m37052() {
        return this.f47828;
    }

    /* JADX INFO: renamed from: ֡ */
    public final boolean m37049() {
        return (this.f47827 & 32) != 0;
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m37055() {
        return this.f47823;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.f47822;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (m37056() && !m37054().isInitialized()) {
            this.f47822 = (byte) 0;
            return false;
        }
        this.f47822 = (byte) 1;
        return true;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        if ((this.f47827 & 1) != 0) {
            AbstractC6285.m14269(abstractC16402, 1, this.f47821);
        }
        if ((this.f47827 & 2) != 0) {
            AbstractC6285.m14269(abstractC16402, 2, this.f47826);
        }
        if ((this.f47827 & 4) != 0) {
            AbstractC6285.m14269(abstractC16402, 3, this.f47824);
        }
        if ((this.f47827 & 8) != 0) {
            abstractC16402.mo37251(4, m37054());
        }
        if ((this.f47827 & 16) != 0) {
            abstractC16402.mo37240(5, this.f47828);
        }
        if ((this.f47827 & 32) != 0) {
            abstractC16402.mo37240(6, this.f47823);
        }
        getUnknownFields().writeTo(abstractC16402);
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM14254 = (this.f47827 & 1) != 0 ? AbstractC6285.m14254(1, this.f47821) : 0;
        if ((this.f47827 & 2) != 0) {
            iM14254 += AbstractC6285.m14254(2, this.f47826);
        }
        if ((this.f47827 & 4) != 0) {
            iM14254 += AbstractC6285.m14254(3, this.f47824);
        }
        if ((this.f47827 & 8) != 0) {
            iM14254 += AbstractC16402.m37229(4, m37054());
        }
        if ((this.f47827 & 16) != 0) {
            iM14254 += AbstractC16402.m37227(5);
        }
        if ((this.f47827 & 32) != 0) {
            iM14254 += AbstractC16402.m37227(6);
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
        if (!(obj instanceof C16262)) {
            return super.equals(obj);
        }
        C16262 c16262 = (C16262) obj;
        if (hasName() != c16262.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(c16262.getName())) || m37051() != c16262.m37051()) {
            return false;
        }
        if ((m37051() && !m37058().equals(c16262.m37058())) || m37057() != c16262.m37057()) {
            return false;
        }
        if ((m37057() && !m37053().equals(c16262.m37053())) || m37056() != c16262.m37056()) {
            return false;
        }
        if ((m37056() && !m37054().equals(c16262.m37054())) || m37050() != c16262.m37050()) {
            return false;
        }
        if ((!m37050() || this.f47828 == c16262.f47828) && m37049() == c16262.m37049()) {
            return (!m37049() || this.f47823 == c16262.f47823) && getUnknownFields().equals(c16262.getUnknownFields());
        }
        return false;
    }

    @Override // p067l.AbstractC10645
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12539.f35242.hashCode() + 779;
        if (hasName()) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (m37051()) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + m37058().hashCode();
        }
        if (m37057()) {
            iHashCode = C6316.m14441(iHashCode, 37, 3, 53) + m37053().hashCode();
        }
        if (m37056()) {
            iHashCode = C6316.m14441(iHashCode, 37, 4, 53) + m37054().hashCode();
        }
        if (m37050()) {
            iHashCode = C6316.m14441(iHashCode, 37, 5, 53) + C15671.m35601(this.f47828);
        }
        if (m37049()) {
            iHashCode = C6316.m14441(iHashCode, 37, 6, 53) + C15671.m35601(this.f47823);
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C18945 newBuilder() {
        return f47819.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return f47819.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 newBuilderForType() {
        return f47819.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C18945 toBuilder() {
        int i = 0;
        if (this == f47819) {
            return new C18945(i);
        }
        C18945 c18945 = new C18945(i);
        c18945.m43034(this);
        return c18945;
    }

    @Override // p067l.AbstractC10645
    public final InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C18945(interfaceC11316, 0);
    }

    public static C16262 getDefaultInstance() {
        return f47819;
    }

    public static InterfaceC13820 parser() {
        return f47820;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f47820;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f47819;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return f47819;
    }
}
