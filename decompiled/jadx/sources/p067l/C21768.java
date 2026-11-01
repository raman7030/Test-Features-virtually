package p067l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩶᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21768 extends AbstractC6285 implements InterfaceC5773 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֫֫ */
    public static final InterfaceC13820 f68528;

    /* JADX INFO: renamed from: ۟ */
    public static final C21768 f68529;

    /* JADX INFO: renamed from: ۗ */
    public List f68530;

    /* JADX INFO: renamed from: ۙ */
    public List f68531;

    /* JADX INFO: renamed from: ۛ */
    public List f68532;

    /* JADX INFO: renamed from: ۤ */
    public List f68533;

    /* JADX INFO: renamed from: ۨ */
    public C18274 f68534;

    /* JADX INFO: renamed from: ۫ */
    public volatile Object f68535;

    /* JADX INFO: renamed from: ۬ */
    public byte f68536;

    /* JADX INFO: renamed from: ܰ */
    public List f68537;

    /* JADX INFO: renamed from: ᩶ */
    public List f68538;

    /* JADX INFO: renamed from: ᩸ */
    public int f68539;

    /* JADX INFO: renamed from: ᩹ */
    public List f68540;

    /* JADX INFO: renamed from: ᩺ */
    public C4964 f68541;

    static {
        C22006.m49606(EnumC8594.PUBLIC, C21768.class.getName());
        f68529 = new C21768();
        f68528 = new C21098();
    }

    public C21768(C2991 c2991, int i) {
        super(c2991);
        this.f68535 = "";
        this.f68541 = C4964.m10513();
        this.f68536 = (byte) -1;
    }

    public C21768() {
        this.f68535 = "";
        this.f68541 = C4964.m10513();
        this.f68536 = (byte) -1;
        this.f68535 = "";
        List list = Collections.EMPTY_LIST;
        this.f68530 = list;
        this.f68531 = list;
        this.f68533 = list;
        this.f68540 = list;
        this.f68538 = list;
        this.f68532 = list;
        this.f68537 = list;
        this.f68541 = C4964.m10513();
    }

    @Override // p067l.AbstractC6285
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35205;
        c11650.m26787(C21768.class, C2991.class);
        return c11650;
    }

    public final boolean hasName() {
        return (this.f68539 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f68535;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f68535 = strM18427;
        }
        return strM18427;
    }

    /* JADX INFO: renamed from: ܺ */
    public final int m49084() {
        return this.f68530.size();
    }

    /* JADX INFO: renamed from: ܽ */
    public final C22104 m49085(int i) {
        return (C22104) this.f68530.get(i);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m49090() {
        return this.f68531.size();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C22104 m49083(int i) {
        return (C22104) this.f68531.get(i);
    }

    /* JADX INFO: renamed from: ۖ */
    public final int m49078() {
        return this.f68533.size();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C21768 m49087(int i) {
        return (C21768) this.f68533.get(i);
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m49080() {
        return this.f68540.size();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24449 m49077(int i) {
        return (C24449) this.f68540.get(i);
    }

    /* JADX INFO: renamed from: ۡ */
    public final List m49081() {
        return this.f68538;
    }

    /* JADX INFO: renamed from: ۢ */
    public final int m49082() {
        return this.f68538.size();
    }

    /* JADX INFO: renamed from: ۘ */
    public final int m49079() {
        return this.f68532.size();
    }

    /* JADX INFO: renamed from: ܿ */
    public final C6205 m49086(int i) {
        return (C6205) this.f68532.get(i);
    }

    /* JADX INFO: renamed from: ᩵ */
    public final boolean m49089() {
        return (this.f68539 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final C18274 m49088() {
        C18274 c18274 = this.f68534;
        return c18274 == null ? C18274.getDefaultInstance() : c18274;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.f68536;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f68530.size(); i++) {
            if (!m49085(i).isInitialized()) {
                this.f68536 = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.f68531.size(); i2++) {
            if (!m49083(i2).isInitialized()) {
                this.f68536 = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f68533.size(); i3++) {
            if (!m49087(i3).isInitialized()) {
                this.f68536 = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.f68540.size(); i4++) {
            if (!m49077(i4).isInitialized()) {
                this.f68536 = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < this.f68538.size(); i5++) {
            if (!((C10368) this.f68538.get(i5)).isInitialized()) {
                this.f68536 = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.f68532.size(); i6++) {
            if (!m49086(i6).isInitialized()) {
                this.f68536 = (byte) 0;
                return false;
            }
        }
        if (m49089() && !m49088().isInitialized()) {
            this.f68536 = (byte) 0;
            return false;
        }
        this.f68536 = (byte) 1;
        return true;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        if ((this.f68539 & 1) != 0) {
            AbstractC6285.m14269(abstractC16402, 1, this.f68535);
        }
        for (int i = 0; i < this.f68530.size(); i++) {
            abstractC16402.mo37251(2, (InterfaceC10467) this.f68530.get(i));
        }
        for (int i2 = 0; i2 < this.f68533.size(); i2++) {
            abstractC16402.mo37251(3, (InterfaceC10467) this.f68533.get(i2));
        }
        for (int i3 = 0; i3 < this.f68540.size(); i3++) {
            abstractC16402.mo37251(4, (InterfaceC10467) this.f68540.get(i3));
        }
        for (int i4 = 0; i4 < this.f68538.size(); i4++) {
            abstractC16402.mo37251(5, (InterfaceC10467) this.f68538.get(i4));
        }
        for (int i5 = 0; i5 < this.f68531.size(); i5++) {
            abstractC16402.mo37251(6, (InterfaceC10467) this.f68531.get(i5));
        }
        if ((this.f68539 & 2) != 0) {
            abstractC16402.mo37251(7, m49088());
        }
        for (int i6 = 0; i6 < this.f68532.size(); i6++) {
            abstractC16402.mo37251(8, (InterfaceC10467) this.f68532.get(i6));
        }
        for (int i7 = 0; i7 < this.f68537.size(); i7++) {
            abstractC16402.mo37251(9, (InterfaceC10467) this.f68537.get(i7));
        }
        for (int i8 = 0; i8 < this.f68541.size(); i8++) {
            AbstractC6285.m14269(abstractC16402, 10, this.f68541.mo10519(i8));
        }
        getUnknownFields().writeTo(abstractC16402);
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM14254 = (this.f68539 & 1) != 0 ? AbstractC6285.m14254(1, this.f68535) : 0;
        for (int i2 = 0; i2 < this.f68530.size(); i2++) {
            iM14254 += AbstractC16402.m37229(2, (InterfaceC10467) this.f68530.get(i2));
        }
        for (int i3 = 0; i3 < this.f68533.size(); i3++) {
            iM14254 += AbstractC16402.m37229(3, (InterfaceC10467) this.f68533.get(i3));
        }
        for (int i4 = 0; i4 < this.f68540.size(); i4++) {
            iM14254 += AbstractC16402.m37229(4, (InterfaceC10467) this.f68540.get(i4));
        }
        for (int i5 = 0; i5 < this.f68538.size(); i5++) {
            iM14254 += AbstractC16402.m37229(5, (InterfaceC10467) this.f68538.get(i5));
        }
        for (int i6 = 0; i6 < this.f68531.size(); i6++) {
            iM14254 += AbstractC16402.m37229(6, (InterfaceC10467) this.f68531.get(i6));
        }
        if ((this.f68539 & 2) != 0) {
            iM14254 += AbstractC16402.m37229(7, m49088());
        }
        for (int i7 = 0; i7 < this.f68532.size(); i7++) {
            iM14254 += AbstractC16402.m37229(8, (InterfaceC10467) this.f68532.get(i7));
        }
        for (int i8 = 0; i8 < this.f68537.size(); i8++) {
            iM14254 += AbstractC16402.m37229(9, (InterfaceC10467) this.f68537.get(i8));
        }
        int iM14284 = 0;
        for (int i9 = 0; i9 < this.f68541.size(); i9++) {
            iM14284 += AbstractC6285.m14284(this.f68541.mo10519(i9));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + this.f68541.size() + iM14254 + iM14284;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // p067l.AbstractC10645
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C21768)) {
            return super.equals(obj);
        }
        C21768 c21768 = (C21768) obj;
        if (hasName() != c21768.hasName()) {
            return false;
        }
        if ((!hasName() || getName().equals(c21768.getName())) && this.f68530.equals(c21768.f68530) && this.f68531.equals(c21768.f68531) && this.f68533.equals(c21768.f68533) && this.f68540.equals(c21768.f68540) && this.f68538.equals(c21768.f68538) && this.f68532.equals(c21768.f68532) && m49089() == c21768.m49089()) {
            return (!m49089() || m49088().equals(c21768.m49088())) && this.f68537.equals(c21768.f68537) && this.f68541.equals(c21768.f68541) && getUnknownFields().equals(c21768.getUnknownFields());
        }
        return false;
    }

    @Override // p067l.AbstractC10645
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12539.f35248.hashCode() + 779;
        if (hasName()) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (this.f68530.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + this.f68530.hashCode();
        }
        if (this.f68531.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 6, 53) + this.f68531.hashCode();
        }
        if (this.f68533.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 3, 53) + this.f68533.hashCode();
        }
        if (this.f68540.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 4, 53) + this.f68540.hashCode();
        }
        if (this.f68538.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 5, 53) + this.f68538.hashCode();
        }
        if (this.f68532.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 8, 53) + this.f68532.hashCode();
        }
        if (m49089()) {
            iHashCode = C6316.m14441(iHashCode, 37, 7, 53) + m49088().hashCode();
        }
        if (this.f68537.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 9, 53) + this.f68537.hashCode();
        }
        if (this.f68541.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 10, 53) + this.f68541.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C2991 newBuilder() {
        return f68529.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return f68529.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 newBuilderForType() {
        return f68529.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C2991 toBuilder() {
        int i = 0;
        if (this == f68529) {
            return new C2991(i);
        }
        C2991 c2991 = new C2991(i);
        c2991.m5025(this);
        return c2991;
    }

    @Override // p067l.AbstractC10645
    public final InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C2991(interfaceC11316, 0);
    }

    public static C21768 getDefaultInstance() {
        return f68529;
    }

    public static InterfaceC13820 parser() {
        return f68528;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f68528;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f68529;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return f68529;
    }
}
