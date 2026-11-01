package p067l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֫ۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3821 extends AbstractC6285 implements InterfaceC5773 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۨ */
    public static final C3821 f8183;

    /* JADX INFO: renamed from: ᩺ */
    public static final InterfaceC13820 f8184;

    /* JADX INFO: renamed from: ۗ */
    public byte f8185;

    /* JADX INFO: renamed from: ۙ */
    public volatile Object f8186;

    /* JADX INFO: renamed from: ۛ */
    public AbstractC7962 f8187;

    /* JADX INFO: renamed from: ۤ */
    public long f8188;

    /* JADX INFO: renamed from: ۫ */
    public long f8189;

    /* JADX INFO: renamed from: ۬ */
    public List f8190;

    /* JADX INFO: renamed from: ᩶ */
    public double f8191;

    /* JADX INFO: renamed from: ᩸ */
    public volatile Object f8192;

    /* JADX INFO: renamed from: ᩹ */
    public int f8193;

    static {
        C22006.m49606(EnumC8594.PUBLIC, C3821.class.getName());
        f8183 = new C3821();
        f8184 = new C8216();
    }

    public C3821(C13581 c13581, int i) {
        super(c13581);
        this.f8186 = "";
        this.f8188 = 0L;
        this.f8189 = 0L;
        this.f8191 = 0.0d;
        this.f8187 = AbstractC7962.f20935;
        this.f8192 = "";
        this.f8185 = (byte) -1;
    }

    public C3821() {
        this.f8186 = "";
        this.f8188 = 0L;
        this.f8189 = 0L;
        this.f8191 = 0.0d;
        AbstractC7962 abstractC7962 = AbstractC7962.f20935;
        this.f8187 = abstractC7962;
        this.f8192 = "";
        this.f8185 = (byte) -1;
        this.f8190 = Collections.EMPTY_LIST;
        this.f8186 = "";
        this.f8187 = abstractC7962;
        this.f8192 = "";
    }

    @Override // p067l.AbstractC6285
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35219;
        c11650.m26787(C3821.class, C13581.class);
        return c11650;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final boolean m7464() {
        return (this.f8193 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۢ */
    public final String m7461() {
        Object obj = this.f8186;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f8186 = strM18427;
        }
        return strM18427;
    }

    /* JADX INFO: renamed from: ۚ */
    public final boolean m7458() {
        return (this.f8193 & 2) != 0;
    }

    /* JADX INFO: renamed from: ܺ */
    public final long m7462() {
        return this.f8188;
    }

    /* JADX INFO: renamed from: ֡ */
    public final boolean m7454() {
        return (this.f8193 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۡ */
    public final long m7460() {
        return this.f8189;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final boolean m7463() {
        return (this.f8193 & 8) != 0;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final double m7465() {
        return this.f8191;
    }

    /* JADX INFO: renamed from: ֨ */
    public final boolean m7455() {
        return (this.f8193 & 16) != 0;
    }

    /* JADX INFO: renamed from: ۖ */
    public final AbstractC7962 m7456() {
        return this.f8187;
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m7457() {
        return (this.f8193 & 32) != 0;
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m7459() {
        Object obj = this.f8192;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f8192 = strM18427;
        }
        return strM18427;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.f8185;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f8190.size(); i++) {
            if (!((C9557) this.f8190.get(i)).isInitialized()) {
                this.f8185 = (byte) 0;
                return false;
            }
        }
        this.f8185 = (byte) 1;
        return true;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        for (int i = 0; i < this.f8190.size(); i++) {
            abstractC16402.mo37251(2, (InterfaceC10467) this.f8190.get(i));
        }
        if ((this.f8193 & 1) != 0) {
            AbstractC6285.m14269(abstractC16402, 3, this.f8186);
        }
        if ((this.f8193 & 2) != 0) {
            abstractC16402.mo37249(4, this.f8188);
        }
        if ((this.f8193 & 4) != 0) {
            abstractC16402.mo37249(5, this.f8189);
        }
        if ((this.f8193 & 8) != 0) {
            double d = this.f8191;
            abstractC16402.getClass();
            abstractC16402.mo37235(6, Double.doubleToRawLongBits(d));
        }
        if ((this.f8193 & 16) != 0) {
            abstractC16402.mo37237(7, this.f8187);
        }
        if ((this.f8193 & 32) != 0) {
            AbstractC6285.m14269(abstractC16402, 8, this.f8192);
        }
        getUnknownFields().writeTo(abstractC16402);
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM14254 = 0;
        for (int i2 = 0; i2 < this.f8190.size(); i2++) {
            iM14254 += AbstractC16402.m37229(2, (InterfaceC10467) this.f8190.get(i2));
        }
        if ((this.f8193 & 1) != 0) {
            iM14254 += AbstractC6285.m14254(3, this.f8186);
        }
        if ((this.f8193 & 2) != 0) {
            iM14254 += AbstractC16402.m37228(4, this.f8188);
        }
        if ((this.f8193 & 4) != 0) {
            iM14254 += AbstractC16402.m37222(5, this.f8189);
        }
        if ((this.f8193 & 8) != 0) {
            iM14254 += AbstractC16402.m37220(6) + 8;
        }
        if ((this.f8193 & 16) != 0) {
            iM14254 += AbstractC16402.m37223(7, this.f8187);
        }
        if ((this.f8193 & 32) != 0) {
            iM14254 += AbstractC6285.m14254(8, this.f8192);
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
        if (!(obj instanceof C3821)) {
            return super.equals(obj);
        }
        C3821 c3821 = (C3821) obj;
        if (!this.f8190.equals(c3821.f8190) || m7464() != c3821.m7464()) {
            return false;
        }
        if ((m7464() && !m7461().equals(c3821.m7461())) || m7458() != c3821.m7458()) {
            return false;
        }
        if ((m7458() && this.f8188 != c3821.f8188) || m7454() != c3821.m7454()) {
            return false;
        }
        if ((m7454() && this.f8189 != c3821.f8189) || m7463() != c3821.m7463()) {
            return false;
        }
        if ((m7463() && Double.doubleToLongBits(this.f8191) != Double.doubleToLongBits(c3821.f8191)) || m7455() != c3821.m7455()) {
            return false;
        }
        if ((!m7455() || this.f8187.equals(c3821.f8187)) && m7457() == c3821.m7457()) {
            return (!m7457() || m7459().equals(c3821.m7459())) && getUnknownFields().equals(c3821.getUnknownFields());
        }
        return false;
    }

    @Override // p067l.AbstractC10645
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12539.f35221.hashCode() + 779;
        if (this.f8190.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + this.f8190.hashCode();
        }
        if (m7464()) {
            iHashCode = C6316.m14441(iHashCode, 37, 3, 53) + m7461().hashCode();
        }
        if (m7458()) {
            iHashCode = C6316.m14441(iHashCode, 37, 4, 53) + C15671.m35600(this.f8188);
        }
        if (m7454()) {
            iHashCode = C6316.m14441(iHashCode, 37, 5, 53) + C15671.m35600(this.f8189);
        }
        if (m7463()) {
            iHashCode = C6316.m14441(iHashCode, 37, 6, 53) + C15671.m35600(Double.doubleToLongBits(this.f8191));
        }
        if (m7455()) {
            iHashCode = C6316.m14441(iHashCode, 37, 7, 53) + this.f8187.hashCode();
        }
        if (m7457()) {
            iHashCode = C6316.m14441(iHashCode, 37, 8, 53) + m7459().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C13581 newBuilder() {
        return f8183.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return f8183.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 newBuilderForType() {
        return f8183.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C13581 toBuilder() {
        int i = 0;
        if (this == f8183) {
            return new C13581(i);
        }
        C13581 c13581 = new C13581(i);
        c13581.m30902(this);
        return c13581;
    }

    @Override // p067l.AbstractC10645
    public final InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C13581(interfaceC11316, 0);
    }

    public static C3821 getDefaultInstance() {
        return f8183;
    }

    public static InterfaceC13820 parser() {
        return f8184;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f8184;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f8183;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return f8183;
    }
}
