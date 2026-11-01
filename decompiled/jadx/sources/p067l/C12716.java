package p067l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۧۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12716 extends AbstractC6285 implements InterfaceC5773 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۤ */
    public static final InterfaceC13820 f35700;

    /* JADX INFO: renamed from: ۫ */
    public static final C12716 f35701;

    /* JADX INFO: renamed from: ۬ */
    public static final /* synthetic */ int f35702 = 0;

    /* JADX INFO: renamed from: ۗ */
    public int f35703;

    /* JADX INFO: renamed from: ۙ */
    public byte f35704;

    /* JADX INFO: renamed from: ᩶ */
    public int f35705;

    /* JADX INFO: renamed from: ᩸ */
    public int f35706;

    /* JADX INFO: renamed from: ᩹ */
    public List f35707;

    static {
        C22006.m49606(EnumC8594.PUBLIC, C12716.class.getName());
        f35701 = new C12716();
        f35700 = new C13406();
    }

    public C12716(C24134 c24134, int i) {
        super(c24134);
        this.f35703 = 0;
        this.f35705 = 0;
        this.f35704 = (byte) -1;
    }

    public C12716() {
        this.f35703 = 0;
        this.f35705 = 0;
        this.f35704 = (byte) -1;
        this.f35707 = Collections.EMPTY_LIST;
        this.f35703 = 0;
        this.f35705 = 0;
    }

    @Override // p067l.AbstractC6285
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35196;
        c11650.m26787(C12716.class, C24134.class);
        return c11650;
    }

    /* JADX INFO: renamed from: ۜ */
    public final List m29234() {
        return this.f35707;
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m29237() {
        return (this.f35706 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۢ */
    public final EnumC5674 m29236() {
        EnumC5674 enumC5674M12645 = EnumC5674.m12645(this.f35703);
        return enumC5674M12645 == null ? EnumC5674.EDITION_UNKNOWN : enumC5674M12645;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m29235() {
        return (this.f35706 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final EnumC5674 m29238() {
        EnumC5674 enumC5674M12645 = EnumC5674.m12645(this.f35705);
        return enumC5674M12645 == null ? EnumC5674.EDITION_UNKNOWN : enumC5674M12645;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.f35704;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f35707.size(); i++) {
            if (!((C3998) this.f35707.get(i)).isInitialized()) {
                this.f35704 = (byte) 0;
                return false;
            }
        }
        this.f35704 = (byte) 1;
        return true;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        for (int i = 0; i < this.f35707.size(); i++) {
            abstractC16402.mo37251(1, (InterfaceC10467) this.f35707.get(i));
        }
        if ((this.f35706 & 1) != 0) {
            abstractC16402.mo37248(4, this.f35703);
        }
        if ((this.f35706 & 2) != 0) {
            abstractC16402.mo37248(5, this.f35705);
        }
        getUnknownFields().writeTo(abstractC16402);
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM37226 = 0;
        for (int i2 = 0; i2 < this.f35707.size(); i2++) {
            iM37226 += AbstractC16402.m37229(1, (InterfaceC10467) this.f35707.get(i2));
        }
        if ((this.f35706 & 1) != 0) {
            iM37226 += AbstractC16402.m37226(4, this.f35703);
        }
        if ((this.f35706 & 2) != 0) {
            iM37226 += AbstractC16402.m37226(5, this.f35705);
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
        if (!(obj instanceof C12716)) {
            return super.equals(obj);
        }
        C12716 c12716 = (C12716) obj;
        if (!this.f35707.equals(c12716.f35707) || m29237() != c12716.m29237()) {
            return false;
        }
        if ((!m29237() || this.f35703 == c12716.f35703) && m29235() == c12716.m29235()) {
            return (!m29235() || this.f35705 == c12716.f35705) && getUnknownFields().equals(c12716.getUnknownFields());
        }
        return false;
    }

    @Override // p067l.AbstractC10645
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12539.f35200.hashCode() + 779;
        if (this.f35707.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + this.f35707.hashCode();
        }
        if (m29237()) {
            iHashCode = C6316.m14441(iHashCode, 37, 4, 53) + this.f35703;
        }
        if (m29235()) {
            iHashCode = C6316.m14441(iHashCode, 37, 5, 53) + this.f35705;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12716 m29229(byte[] bArr, C3860 c3860) {
        return (C12716) ((C13406) f35700).parseFrom(bArr, (C19283) c3860);
    }

    public static C24134 newBuilder() {
        return f35701.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return f35701.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 newBuilderForType() {
        return f35701.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C24134 toBuilder() {
        int i = 0;
        if (this == f35701) {
            return new C24134(i);
        }
        C24134 c24134 = new C24134(i);
        c24134.m53383(this);
        return c24134;
    }

    @Override // p067l.AbstractC10645
    public final InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C24134(interfaceC11316, 0);
    }

    public static C12716 getDefaultInstance() {
        return f35701;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f35700;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f35701;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return f35701;
    }
}
