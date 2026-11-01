package p067l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۤۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12045 extends AbstractC6285 implements InterfaceC5773 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܽ֫ */
    public static final C12045 f33546;

    /* JADX INFO: renamed from: ᩳ֫ */
    public static final InterfaceC13820 f33547;

    /* JADX INFO: renamed from: ֫֫ */
    public volatile Object f33548;

    /* JADX INFO: renamed from: ۗ */
    public List f33549;

    /* JADX INFO: renamed from: ۙ */
    public List f33550;

    /* JADX INFO: renamed from: ۛ */
    public C9362 f33551;

    /* JADX INFO: renamed from: ۟ */
    public C12240 f33552;

    /* JADX INFO: renamed from: ۤ */
    public volatile Object f33553;

    /* JADX INFO: renamed from: ۧ֫ */
    public InterfaceC8296 f33554;

    /* JADX INFO: renamed from: ۨ */
    public volatile Object f33555;

    /* JADX INFO: renamed from: ۫ */
    public List f33556;

    /* JADX INFO: renamed from: ۬ */
    public byte f33557;

    /* JADX INFO: renamed from: ܰ */
    public List f33558;

    /* JADX INFO: renamed from: ᩶ */
    public int f33559;

    /* JADX INFO: renamed from: ᩸ */
    public int f33560;

    /* JADX INFO: renamed from: ᩹ */
    public C4964 f33561;

    /* JADX INFO: renamed from: ᩺ */
    public InterfaceC8296 f33562;

    static {
        C22006.m49606(EnumC8594.PUBLIC, C12045.class.getName());
        f33546 = new C12045();
        f33547 = new C14726();
    }

    public C12045(C14056 c14056, int i) {
        super(c14056);
        this.f33553 = "";
        this.f33555 = "";
        this.f33561 = C4964.m10513();
        this.f33562 = AbstractC6285.m14287();
        this.f33554 = AbstractC6285.m14287();
        this.f33548 = "";
        this.f33559 = 0;
        this.f33557 = (byte) -1;
    }

    public C12045() {
        this.f33553 = "";
        this.f33555 = "";
        this.f33561 = C4964.m10513();
        this.f33562 = AbstractC6285.m14287();
        this.f33554 = AbstractC6285.m14287();
        this.f33548 = "";
        this.f33559 = 0;
        this.f33557 = (byte) -1;
        this.f33553 = "";
        this.f33555 = "";
        this.f33561 = C4964.m10513();
        this.f33562 = AbstractC6285.m14287();
        this.f33554 = AbstractC6285.m14287();
        List list = Collections.EMPTY_LIST;
        this.f33556 = list;
        this.f33550 = list;
        this.f33558 = list;
        this.f33549 = list;
        this.f33548 = "";
        this.f33559 = 0;
    }

    @Override // p067l.AbstractC6285
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35234;
        c11650.m26787(C12045.class, C14056.class);
        return c11650;
    }

    public final boolean hasName() {
        return (this.f33560 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f33553;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f33553 = strM18427;
        }
        return strM18427;
    }

    /* JADX INFO: renamed from: ܶ */
    public final boolean m27595() {
        return (this.f33560 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۘ */
    public final String m27587() {
        Object obj = this.f33555;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f33555 = strM18427;
        }
        return strM18427;
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m27589() {
        return this.f33561.size();
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m27585(int i) {
        return this.f33561.get(i);
    }

    /* JADX INFO: renamed from: ᩴ */
    public final int m27600() {
        return this.f33562.size();
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m27598(int i) {
        return this.f33562.getInt(i);
    }

    /* JADX INFO: renamed from: ܺ */
    public final int m27596() {
        return this.f33556.size();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C21768 m27599(int i) {
        return (C21768) this.f33556.get(i);
    }

    /* JADX INFO: renamed from: ۢ */
    public final int m27592() {
        return this.f33550.size();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C24449 m27593(int i) {
        return (C24449) this.f33550.get(i);
    }

    /* JADX INFO: renamed from: ᩵ */
    public final int m27601() {
        return this.f33558.size();
    }

    /* JADX INFO: renamed from: ܳ */
    public final C10228 m27594(int i) {
        return (C10228) this.f33558.get(i);
    }

    /* JADX INFO: renamed from: ۡ */
    public final int m27591() {
        return this.f33549.size();
    }

    /* JADX INFO: renamed from: ܽ */
    public final C22104 m27597(int i) {
        return (C22104) this.f33549.get(i);
    }

    /* JADX INFO: renamed from: ۠ */
    public final boolean m27590() {
        return (this.f33560 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۖ */
    public final C9362 m27586() {
        C9362 c9362 = this.f33551;
        return c9362 == null ? C9362.getDefaultInstance() : c9362;
    }

    /* JADX INFO: renamed from: ᩸ */
    public final boolean m27603() {
        return (this.f33560 & 8) != 0;
    }

    /* JADX INFO: renamed from: ֡ */
    public final C12240 m27583() {
        C12240 c12240 = this.f33552;
        return c12240 == null ? C12240.getDefaultInstance() : c12240;
    }

    /* JADX INFO: renamed from: ᩹ */
    public final boolean m27604() {
        return (this.f33560 & 16) != 0;
    }

    /* JADX INFO: renamed from: ۚ */
    public final String m27588() {
        Object obj = this.f33548;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f33548 = strM18427;
        }
        return strM18427;
    }

    /* JADX INFO: renamed from: ֨ */
    public final boolean m27584() {
        return (this.f33560 & 32) != 0;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final EnumC5674 m27602() {
        EnumC5674 enumC5674M12645 = EnumC5674.m12645(this.f33559);
        return enumC5674M12645 == null ? EnumC5674.EDITION_UNKNOWN : enumC5674M12645;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.f33557;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f33556.size(); i++) {
            if (!m27599(i).isInitialized()) {
                this.f33557 = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.f33550.size(); i2++) {
            if (!m27593(i2).isInitialized()) {
                this.f33557 = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f33558.size(); i3++) {
            if (!m27594(i3).isInitialized()) {
                this.f33557 = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.f33549.size(); i4++) {
            if (!m27597(i4).isInitialized()) {
                this.f33557 = (byte) 0;
                return false;
            }
        }
        if (m27590() && !m27586().isInitialized()) {
            this.f33557 = (byte) 0;
            return false;
        }
        this.f33557 = (byte) 1;
        return true;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        if ((this.f33560 & 1) != 0) {
            AbstractC6285.m14269(abstractC16402, 1, this.f33553);
        }
        if ((this.f33560 & 2) != 0) {
            AbstractC6285.m14269(abstractC16402, 2, this.f33555);
        }
        for (int i = 0; i < this.f33561.size(); i++) {
            AbstractC6285.m14269(abstractC16402, 3, this.f33561.mo10519(i));
        }
        for (int i2 = 0; i2 < this.f33556.size(); i2++) {
            abstractC16402.mo37251(4, (InterfaceC10467) this.f33556.get(i2));
        }
        for (int i3 = 0; i3 < this.f33550.size(); i3++) {
            abstractC16402.mo37251(5, (InterfaceC10467) this.f33550.get(i3));
        }
        for (int i4 = 0; i4 < this.f33558.size(); i4++) {
            abstractC16402.mo37251(6, (InterfaceC10467) this.f33558.get(i4));
        }
        for (int i5 = 0; i5 < this.f33549.size(); i5++) {
            abstractC16402.mo37251(7, (InterfaceC10467) this.f33549.get(i5));
        }
        if ((this.f33560 & 4) != 0) {
            abstractC16402.mo37251(8, m27586());
        }
        if ((this.f33560 & 8) != 0) {
            abstractC16402.mo37251(9, m27583());
        }
        for (int i6 = 0; i6 < this.f33562.size(); i6++) {
            abstractC16402.mo37248(10, this.f33562.getInt(i6));
        }
        for (int i7 = 0; i7 < this.f33554.size(); i7++) {
            abstractC16402.mo37248(11, this.f33554.getInt(i7));
        }
        if ((this.f33560 & 16) != 0) {
            AbstractC6285.m14269(abstractC16402, 12, this.f33548);
        }
        if ((this.f33560 & 32) != 0) {
            abstractC16402.mo37248(14, this.f33559);
        }
        getUnknownFields().writeTo(abstractC16402);
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM14254 = (this.f33560 & 1) != 0 ? AbstractC6285.m14254(1, this.f33553) : 0;
        if ((this.f33560 & 2) != 0) {
            iM14254 += AbstractC6285.m14254(2, this.f33555);
        }
        int iM14284 = 0;
        for (int i2 = 0; i2 < this.f33561.size(); i2++) {
            iM14284 += AbstractC6285.m14284(this.f33561.mo10519(i2));
        }
        int size = this.f33561.size() + iM14254 + iM14284;
        for (int i3 = 0; i3 < this.f33556.size(); i3++) {
            size += AbstractC16402.m37229(4, (InterfaceC10467) this.f33556.get(i3));
        }
        for (int i4 = 0; i4 < this.f33550.size(); i4++) {
            size += AbstractC16402.m37229(5, (InterfaceC10467) this.f33550.get(i4));
        }
        for (int i5 = 0; i5 < this.f33558.size(); i5++) {
            size += AbstractC16402.m37229(6, (InterfaceC10467) this.f33558.get(i5));
        }
        for (int i6 = 0; i6 < this.f33549.size(); i6++) {
            size += AbstractC16402.m37229(7, (InterfaceC10467) this.f33549.get(i6));
        }
        if ((this.f33560 & 4) != 0) {
            size += AbstractC16402.m37229(8, m27586());
        }
        if ((this.f33560 & 8) != 0) {
            size += AbstractC16402.m37229(9, m27583());
        }
        int iM37224 = 0;
        for (int i7 = 0; i7 < this.f33562.size(); i7++) {
            iM37224 += AbstractC16402.m37224(this.f33562.getInt(i7));
        }
        int size2 = this.f33562.size() + size + iM37224;
        int iM37225 = 0;
        for (int i8 = 0; i8 < this.f33554.size(); i8++) {
            iM37225 += AbstractC16402.m37224(this.f33554.getInt(i8));
        }
        int size3 = this.f33554.size() + size2 + iM37225;
        if ((this.f33560 & 16) != 0) {
            size3 += AbstractC6285.m14254(12, this.f33548);
        }
        if ((this.f33560 & 32) != 0) {
            size3 += AbstractC16402.m37226(14, this.f33559);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + size3;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // p067l.AbstractC10645
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12045)) {
            return super.equals(obj);
        }
        C12045 c12045 = (C12045) obj;
        if (hasName() != c12045.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(c12045.getName())) || m27595() != c12045.m27595()) {
            return false;
        }
        if ((m27595() && !m27587().equals(c12045.m27587())) || !this.f33561.equals(c12045.f33561) || !this.f33562.equals(c12045.f33562) || !this.f33554.equals(c12045.f33554) || !this.f33556.equals(c12045.f33556) || !this.f33550.equals(c12045.f33550) || !this.f33558.equals(c12045.f33558) || !this.f33549.equals(c12045.f33549) || m27590() != c12045.m27590()) {
            return false;
        }
        if ((m27590() && !m27586().equals(c12045.m27586())) || m27603() != c12045.m27603()) {
            return false;
        }
        if ((m27603() && !m27583().equals(c12045.m27583())) || m27604() != c12045.m27604()) {
            return false;
        }
        if ((!m27604() || m27588().equals(c12045.m27588())) && m27584() == c12045.m27584()) {
            return (!m27584() || this.f33559 == c12045.f33559) && getUnknownFields().equals(c12045.getUnknownFields());
        }
        return false;
    }

    @Override // p067l.AbstractC10645
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12539.f35230.hashCode() + 779;
        if (hasName()) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (m27595()) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + m27587().hashCode();
        }
        if (this.f33561.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 3, 53) + this.f33561.hashCode();
        }
        if (this.f33562.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 10, 53) + this.f33562.hashCode();
        }
        if (this.f33554.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 11, 53) + this.f33554.hashCode();
        }
        if (this.f33556.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 4, 53) + this.f33556.hashCode();
        }
        if (this.f33550.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 5, 53) + this.f33550.hashCode();
        }
        if (this.f33558.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 6, 53) + this.f33558.hashCode();
        }
        if (this.f33549.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 7, 53) + this.f33549.hashCode();
        }
        if (m27590()) {
            iHashCode = C6316.m14441(iHashCode, 37, 8, 53) + m27586().hashCode();
        }
        if (m27603()) {
            iHashCode = C6316.m14441(iHashCode, 37, 9, 53) + m27583().hashCode();
        }
        if (m27604()) {
            iHashCode = C6316.m14441(iHashCode, 37, 12, 53) + m27588().hashCode();
        }
        if (m27584()) {
            iHashCode = C6316.m14441(iHashCode, 37, 14, 53) + this.f33559;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C12045 parseFrom(byte[] bArr) {
        return (C12045) ((C14726) f33547).parseFrom(bArr);
    }

    public static C14056 newBuilder() {
        return f33546.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return f33546.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 newBuilderForType() {
        return f33546.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C14056 toBuilder() {
        int i = 0;
        if (this == f33546) {
            return new C14056(i);
        }
        C14056 c14056 = new C14056(i);
        c14056.m31899(this);
        return c14056;
    }

    @Override // p067l.AbstractC10645
    public final InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C14056(interfaceC11316, 0);
    }

    public static C12045 getDefaultInstance() {
        return f33546;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f33547;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f33546;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return f33546;
    }
}
