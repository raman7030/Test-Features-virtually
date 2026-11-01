package p067l;

/* JADX INFO: renamed from: l.֫ۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3998 extends AbstractC6285 implements InterfaceC5773 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۫ */
    public static final InterfaceC13820 f8702;

    /* JADX INFO: renamed from: ۬ */
    public static final C3998 f8703;

    /* JADX INFO: renamed from: ۗ */
    public C8041 f8704;

    /* JADX INFO: renamed from: ۙ */
    public byte f8705;

    /* JADX INFO: renamed from: ᩶ */
    public C8041 f8706;

    /* JADX INFO: renamed from: ᩸ */
    public int f8707;

    /* JADX INFO: renamed from: ᩹ */
    public int f8708;

    static {
        C22006.m49606(EnumC8594.PUBLIC, C3998.class.getName());
        f8703 = new C3998();
        f8702 = new C15416();
    }

    public C3998(C9382 c9382, int i) {
        super(c9382);
        this.f8708 = 0;
        this.f8705 = (byte) -1;
    }

    public C3998() {
        this.f8705 = (byte) -1;
        this.f8708 = 0;
    }

    @Override // p067l.AbstractC6285
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35239;
        c11650.m26787(C3998.class, C9382.class);
        return c11650;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m7963() {
        return (this.f8707 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۜ */
    public final EnumC5674 m7962() {
        EnumC5674 enumC5674M12645 = EnumC5674.m12645(this.f8708);
        return enumC5674M12645 == null ? EnumC5674.EDITION_UNKNOWN : enumC5674M12645;
    }

    /* JADX INFO: renamed from: ۖ */
    public final boolean m7961() {
        return (this.f8707 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۢ */
    public final C8041 m7964() {
        C8041 c8041 = this.f8704;
        return c8041 == null ? C8041.getDefaultInstance() : c8041;
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m7965() {
        return (this.f8707 & 4) != 0;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final C8041 m7966() {
        C8041 c8041 = this.f8706;
        return c8041 == null ? C8041.getDefaultInstance() : c8041;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.f8705;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (m7961() && !m7964().isInitialized()) {
            this.f8705 = (byte) 0;
            return false;
        }
        if (m7965() && !m7966().isInitialized()) {
            this.f8705 = (byte) 0;
            return false;
        }
        this.f8705 = (byte) 1;
        return true;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        if ((this.f8707 & 1) != 0) {
            abstractC16402.mo37248(3, this.f8708);
        }
        if ((this.f8707 & 2) != 0) {
            abstractC16402.mo37251(4, m7964());
        }
        if ((this.f8707 & 4) != 0) {
            abstractC16402.mo37251(5, m7966());
        }
        getUnknownFields().writeTo(abstractC16402);
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM37226 = (this.f8707 & 1) != 0 ? AbstractC16402.m37226(3, this.f8708) : 0;
        if ((this.f8707 & 2) != 0) {
            iM37226 += AbstractC16402.m37229(4, m7964());
        }
        if ((this.f8707 & 4) != 0) {
            iM37226 += AbstractC16402.m37229(5, m7966());
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
        if (!(obj instanceof C3998)) {
            return super.equals(obj);
        }
        C3998 c3998 = (C3998) obj;
        if (m7963() != c3998.m7963()) {
            return false;
        }
        if ((m7963() && this.f8708 != c3998.f8708) || m7961() != c3998.m7961()) {
            return false;
        }
        if ((!m7961() || m7964().equals(c3998.m7964())) && m7965() == c3998.m7965()) {
            return (!m7965() || m7966().equals(c3998.m7966())) && getUnknownFields().equals(c3998.getUnknownFields());
        }
        return false;
    }

    @Override // p067l.AbstractC10645
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12539.f35245.hashCode() + 779;
        if (m7963()) {
            iHashCode = C6316.m14441(iHashCode, 37, 3, 53) + this.f8708;
        }
        if (m7961()) {
            iHashCode = C6316.m14441(iHashCode, 37, 4, 53) + m7964().hashCode();
        }
        if (m7965()) {
            iHashCode = C6316.m14441(iHashCode, 37, 5, 53) + m7966().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C9382 newBuilder() {
        return f8703.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return f8703.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 newBuilderForType() {
        return f8703.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C9382 toBuilder() {
        int i = 0;
        if (this == f8703) {
            return new C9382(i);
        }
        C9382 c9382 = new C9382(i);
        c9382.m21811(this);
        return c9382;
    }

    @Override // p067l.AbstractC10645
    public final InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C9382(interfaceC11316, 0);
    }

    public static C3998 getDefaultInstance() {
        return f8703;
    }

    public static InterfaceC13820 parser() {
        return f8702;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f8702;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f8703;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return f8703;
    }
}
