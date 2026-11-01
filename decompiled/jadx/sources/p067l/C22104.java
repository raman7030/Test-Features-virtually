package p067l;

/* JADX INFO: renamed from: l.᩷ۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22104 extends AbstractC6285 implements InterfaceC5773 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֫֫ */
    public static final /* synthetic */ int f69939 = 0;

    /* JADX INFO: renamed from: ۧ֫ */
    public static final C22104 f69940;

    /* JADX INFO: renamed from: ܽ֫ */
    public static final InterfaceC13820 f69941;

    /* JADX INFO: renamed from: ۗ */
    public int f69942;

    /* JADX INFO: renamed from: ۙ */
    public volatile Object f69943;

    /* JADX INFO: renamed from: ۛ */
    public int f69944;

    /* JADX INFO: renamed from: ۟ */
    public int f69945;

    /* JADX INFO: renamed from: ۤ */
    public int f69946;

    /* JADX INFO: renamed from: ۨ */
    public C5339 f69947;

    /* JADX INFO: renamed from: ۫ */
    public volatile Object f69948;

    /* JADX INFO: renamed from: ۬ */
    public byte f69949;

    /* JADX INFO: renamed from: ܰ */
    public volatile Object f69950;

    /* JADX INFO: renamed from: ᩶ */
    public volatile Object f69951;

    /* JADX INFO: renamed from: ᩸ */
    public int f69952;

    /* JADX INFO: renamed from: ᩹ */
    public volatile Object f69953;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f69954;

    static {
        C22006.m49606(EnumC8594.PUBLIC, C22104.class.getName());
        f69940 = new C22104();
        f69941 = new C18079();
    }

    public C22104(C19421 c19421, int i) {
        super(c19421);
        this.f69948 = "";
        this.f69946 = 0;
        this.f69942 = 1;
        this.f69945 = 1;
        this.f69950 = "";
        this.f69951 = "";
        this.f69953 = "";
        this.f69944 = 0;
        this.f69943 = "";
        this.f69954 = false;
        this.f69949 = (byte) -1;
    }

    public C22104() {
        this.f69948 = "";
        this.f69946 = 0;
        this.f69942 = 1;
        this.f69945 = 1;
        this.f69950 = "";
        this.f69951 = "";
        this.f69953 = "";
        this.f69944 = 0;
        this.f69943 = "";
        this.f69954 = false;
        this.f69949 = (byte) -1;
        this.f69948 = "";
        this.f69942 = 1;
        this.f69945 = 1;
        this.f69950 = "";
        this.f69951 = "";
        this.f69953 = "";
        this.f69943 = "";
    }

    @Override // p067l.AbstractC6285
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35204;
        c11650.m26787(C22104.class, C19421.class);
        return c11650;
    }

    public final boolean hasName() {
        return (this.f69952 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f69948;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f69948 = strM18427;
        }
        return strM18427;
    }

    /* JADX INFO: renamed from: ܶ */
    public final boolean m49794() {
        return (this.f69952 & 2) != 0;
    }

    /* JADX INFO: renamed from: ܺ */
    public final int m49795() {
        return this.f69946;
    }

    /* JADX INFO: renamed from: ۠ */
    public final boolean m49791() {
        return (this.f69952 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۡ */
    public final EnumC16067 m49792() {
        EnumC16067 enumC16067M36572 = EnumC16067.m36572(this.f69942);
        return enumC16067M36572 == null ? EnumC16067.LABEL_OPTIONAL : enumC16067M36572;
    }

    public final boolean hasType() {
        return (this.f69952 & 8) != 0;
    }

    public final EnumC8692 getType() {
        EnumC8692 enumC8692M20122 = EnumC8692.m20122(this.f69945);
        return enumC8692M20122 == null ? EnumC8692.TYPE_DOUBLE : enumC8692M20122;
    }

    /* JADX INFO: renamed from: ۙ */
    public final boolean m49788() {
        return (this.f69952 & 16) != 0;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final String m49797() {
        Object obj = this.f69950;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f69950 = strM18427;
        }
        return strM18427;
    }

    /* JADX INFO: renamed from: ۚ */
    public final boolean m49789() {
        return (this.f69952 & 32) != 0;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final String m49799() {
        Object obj = this.f69951;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f69951 = strM18427;
        }
        return strM18427;
    }

    /* JADX INFO: renamed from: ֡ */
    public final boolean m49784() {
        return (this.f69952 & 64) != 0;
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m49790() {
        Object obj = this.f69953;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f69953 = strM18427;
        }
        return strM18427;
    }

    /* JADX INFO: renamed from: ᩸ */
    public final boolean m49800() {
        return (this.f69952 & 128) != 0;
    }

    /* JADX INFO: renamed from: ۖ */
    public final int m49786() {
        return this.f69944;
    }

    /* JADX INFO: renamed from: ֨ */
    public final boolean m49785() {
        return (this.f69952 & 256) != 0;
    }

    /* JADX INFO: renamed from: ۢ */
    public final String m49793() {
        Object obj = this.f69943;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f69943 = strM18427;
        }
        return strM18427;
    }

    /* JADX INFO: renamed from: ᩹ */
    public final boolean m49801() {
        return (this.f69952 & 512) != 0;
    }

    /* JADX INFO: renamed from: ۘ */
    public final C5339 m49787() {
        C5339 c5339 = this.f69947;
        return c5339 == null ? C5339.getDefaultInstance() : c5339;
    }

    /* JADX INFO: renamed from: ᩶ */
    public final boolean m49798() {
        return (this.f69952 & 1024) != 0;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final boolean m49796() {
        return this.f69954;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.f69949;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (m49801() && !m49787().isInitialized()) {
            this.f69949 = (byte) 0;
            return false;
        }
        this.f69949 = (byte) 1;
        return true;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        if ((this.f69952 & 1) != 0) {
            AbstractC6285.m14269(abstractC16402, 1, this.f69948);
        }
        if ((this.f69952 & 32) != 0) {
            AbstractC6285.m14269(abstractC16402, 2, this.f69951);
        }
        if ((this.f69952 & 2) != 0) {
            abstractC16402.mo37248(3, this.f69946);
        }
        if ((this.f69952 & 4) != 0) {
            abstractC16402.mo37248(4, this.f69942);
        }
        if ((this.f69952 & 8) != 0) {
            abstractC16402.mo37248(5, this.f69945);
        }
        if ((this.f69952 & 16) != 0) {
            AbstractC6285.m14269(abstractC16402, 6, this.f69950);
        }
        if ((this.f69952 & 64) != 0) {
            AbstractC6285.m14269(abstractC16402, 7, this.f69953);
        }
        if ((this.f69952 & 512) != 0) {
            abstractC16402.mo37251(8, m49787());
        }
        if ((this.f69952 & 128) != 0) {
            abstractC16402.mo37248(9, this.f69944);
        }
        if ((this.f69952 & 256) != 0) {
            AbstractC6285.m14269(abstractC16402, 10, this.f69943);
        }
        if ((this.f69952 & 1024) != 0) {
            abstractC16402.mo37240(17, this.f69954);
        }
        getUnknownFields().writeTo(abstractC16402);
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM14254 = (this.f69952 & 1) != 0 ? AbstractC6285.m14254(1, this.f69948) : 0;
        if ((this.f69952 & 32) != 0) {
            iM14254 += AbstractC6285.m14254(2, this.f69951);
        }
        if ((this.f69952 & 2) != 0) {
            iM14254 += AbstractC16402.m37221(3, this.f69946);
        }
        if ((this.f69952 & 4) != 0) {
            iM14254 += AbstractC16402.m37226(4, this.f69942);
        }
        if ((this.f69952 & 8) != 0) {
            iM14254 += AbstractC16402.m37226(5, this.f69945);
        }
        if ((this.f69952 & 16) != 0) {
            iM14254 += AbstractC6285.m14254(6, this.f69950);
        }
        if ((this.f69952 & 64) != 0) {
            iM14254 += AbstractC6285.m14254(7, this.f69953);
        }
        if ((this.f69952 & 512) != 0) {
            iM14254 += AbstractC16402.m37229(8, m49787());
        }
        if ((this.f69952 & 128) != 0) {
            iM14254 += AbstractC16402.m37221(9, this.f69944);
        }
        if ((this.f69952 & 256) != 0) {
            iM14254 += AbstractC6285.m14254(10, this.f69943);
        }
        if ((this.f69952 & 1024) != 0) {
            iM14254 += AbstractC16402.m37227(17);
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
        if (!(obj instanceof C22104)) {
            return super.equals(obj);
        }
        C22104 c22104 = (C22104) obj;
        if (hasName() != c22104.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(c22104.getName())) || m49794() != c22104.m49794()) {
            return false;
        }
        if ((m49794() && this.f69946 != c22104.f69946) || m49791() != c22104.m49791()) {
            return false;
        }
        if ((m49791() && this.f69942 != c22104.f69942) || hasType() != c22104.hasType()) {
            return false;
        }
        if ((hasType() && this.f69945 != c22104.f69945) || m49788() != c22104.m49788()) {
            return false;
        }
        if ((m49788() && !m49797().equals(c22104.m49797())) || m49789() != c22104.m49789()) {
            return false;
        }
        if ((m49789() && !m49799().equals(c22104.m49799())) || m49784() != c22104.m49784()) {
            return false;
        }
        if ((m49784() && !m49790().equals(c22104.m49790())) || m49800() != c22104.m49800()) {
            return false;
        }
        if ((m49800() && this.f69944 != c22104.f69944) || m49785() != c22104.m49785()) {
            return false;
        }
        if ((m49785() && !m49793().equals(c22104.m49793())) || m49801() != c22104.m49801()) {
            return false;
        }
        if ((!m49801() || m49787().equals(c22104.m49787())) && m49798() == c22104.m49798()) {
            return (!m49798() || this.f69954 == c22104.f69954) && getUnknownFields().equals(c22104.getUnknownFields());
        }
        return false;
    }

    @Override // p067l.AbstractC10645
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12539.f35214.hashCode() + 779;
        if (hasName()) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (m49794()) {
            iHashCode = C6316.m14441(iHashCode, 37, 3, 53) + this.f69946;
        }
        if (m49791()) {
            iHashCode = C6316.m14441(iHashCode, 37, 4, 53) + this.f69942;
        }
        if (hasType()) {
            iHashCode = C6316.m14441(iHashCode, 37, 5, 53) + this.f69945;
        }
        if (m49788()) {
            iHashCode = C6316.m14441(iHashCode, 37, 6, 53) + m49797().hashCode();
        }
        if (m49789()) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + m49799().hashCode();
        }
        if (m49784()) {
            iHashCode = C6316.m14441(iHashCode, 37, 7, 53) + m49790().hashCode();
        }
        if (m49800()) {
            iHashCode = C6316.m14441(iHashCode, 37, 9, 53) + this.f69944;
        }
        if (m49785()) {
            iHashCode = C6316.m14441(iHashCode, 37, 10, 53) + m49793().hashCode();
        }
        if (m49801()) {
            iHashCode = C6316.m14441(iHashCode, 37, 8, 53) + m49787().hashCode();
        }
        if (m49798()) {
            iHashCode = C6316.m14441(iHashCode, 37, 17, 53) + C15671.m35601(this.f69954);
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C19421 newBuilder() {
        return f69940.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return f69940.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 newBuilderForType() {
        return f69940.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C19421 toBuilder() {
        int i = 0;
        if (this == f69940) {
            return new C19421(i);
        }
        C19421 c19421 = new C19421(i);
        c19421.m44194(this);
        return c19421;
    }

    @Override // p067l.AbstractC10645
    public final InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C19421(interfaceC11316, 0);
    }

    public static C22104 getDefaultInstance() {
        return f69940;
    }

    public static InterfaceC13820 parser() {
        return f69941;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f69941;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f69940;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return f69940;
    }
}
