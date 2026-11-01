package p067l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩺᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C24449 extends AbstractC6285 implements InterfaceC5773 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۛ */
    public static final InterfaceC13820 f77393;

    /* JADX INFO: renamed from: ۤ */
    public static final C24449 f77394;

    /* JADX INFO: renamed from: ۗ */
    public C4964 f77395;

    /* JADX INFO: renamed from: ۙ */
    public C4018 f77396;

    /* JADX INFO: renamed from: ۫ */
    public List f77397;

    /* JADX INFO: renamed from: ۬ */
    public List f77398;

    /* JADX INFO: renamed from: ᩶ */
    public volatile Object f77399;

    /* JADX INFO: renamed from: ᩸ */
    public int f77400;

    /* JADX INFO: renamed from: ᩹ */
    public byte f77401;

    static {
        C22006.m49606(EnumC8594.PUBLIC, C24449.class.getName());
        f77394 = new C24449();
        f77393 = new C15061();
    }

    public C24449(C14391 c14391, int i) {
        super(c14391);
        this.f77399 = "";
        this.f77395 = C4964.m10513();
        this.f77401 = (byte) -1;
    }

    public C24449() {
        this.f77399 = "";
        this.f77395 = C4964.m10513();
        this.f77401 = (byte) -1;
        this.f77399 = "";
        List list = Collections.EMPTY_LIST;
        this.f77397 = list;
        this.f77398 = list;
        this.f77395 = C4964.m10513();
    }

    @Override // p067l.AbstractC6285
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35227;
        c11650.m26787(C24449.class, C14391.class);
        return c11650;
    }

    public final boolean hasName() {
        return (this.f77400 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f77399;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f77399 = strM18427;
        }
        return strM18427;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m53956() {
        return this.f77397.size();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19441 m53953(int i) {
        return (C19441) this.f77397.get(i);
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m53955() {
        return (this.f77400 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۜ */
    public final C4018 m53954() {
        C4018 c4018 = this.f77396;
        return c4018 == null ? C4018.getDefaultInstance() : c4018;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.f77401;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f77397.size(); i++) {
            if (!m53953(i).isInitialized()) {
                this.f77401 = (byte) 0;
                return false;
            }
        }
        if (m53955() && !m53954().isInitialized()) {
            this.f77401 = (byte) 0;
            return false;
        }
        this.f77401 = (byte) 1;
        return true;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        if ((this.f77400 & 1) != 0) {
            AbstractC6285.m14269(abstractC16402, 1, this.f77399);
        }
        for (int i = 0; i < this.f77397.size(); i++) {
            abstractC16402.mo37251(2, (InterfaceC10467) this.f77397.get(i));
        }
        if ((this.f77400 & 2) != 0) {
            abstractC16402.mo37251(3, m53954());
        }
        for (int i2 = 0; i2 < this.f77398.size(); i2++) {
            abstractC16402.mo37251(4, (InterfaceC10467) this.f77398.get(i2));
        }
        for (int i3 = 0; i3 < this.f77395.size(); i3++) {
            AbstractC6285.m14269(abstractC16402, 5, this.f77395.mo10519(i3));
        }
        getUnknownFields().writeTo(abstractC16402);
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM14254 = (this.f77400 & 1) != 0 ? AbstractC6285.m14254(1, this.f77399) : 0;
        for (int i2 = 0; i2 < this.f77397.size(); i2++) {
            iM14254 += AbstractC16402.m37229(2, (InterfaceC10467) this.f77397.get(i2));
        }
        if ((this.f77400 & 2) != 0) {
            iM14254 += AbstractC16402.m37229(3, m53954());
        }
        for (int i3 = 0; i3 < this.f77398.size(); i3++) {
            iM14254 += AbstractC16402.m37229(4, (InterfaceC10467) this.f77398.get(i3));
        }
        int iM14284 = 0;
        for (int i4 = 0; i4 < this.f77395.size(); i4++) {
            iM14284 += AbstractC6285.m14284(this.f77395.mo10519(i4));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + this.f77395.size() + iM14254 + iM14284;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // p067l.AbstractC10645
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C24449)) {
            return super.equals(obj);
        }
        C24449 c24449 = (C24449) obj;
        if (hasName() != c24449.hasName()) {
            return false;
        }
        if ((!hasName() || getName().equals(c24449.getName())) && this.f77397.equals(c24449.f77397) && m53955() == c24449.m53955()) {
            return (!m53955() || m53954().equals(c24449.m53954())) && this.f77398.equals(c24449.f77398) && this.f77395.equals(c24449.f77395) && getUnknownFields().equals(c24449.getUnknownFields());
        }
        return false;
    }

    @Override // p067l.AbstractC10645
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12539.f35210.hashCode() + 779;
        if (hasName()) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (this.f77397.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + this.f77397.hashCode();
        }
        if (m53955()) {
            iHashCode = C6316.m14441(iHashCode, 37, 3, 53) + m53954().hashCode();
        }
        if (this.f77398.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 4, 53) + this.f77398.hashCode();
        }
        if (this.f77395.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 5, 53) + this.f77395.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C14391 newBuilder() {
        return f77394.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return f77394.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 newBuilderForType() {
        return f77394.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C14391 toBuilder() {
        int i = 0;
        if (this == f77394) {
            return new C14391(i);
        }
        C14391 c14391 = new C14391(i);
        c14391.m33009(this);
        return c14391;
    }

    @Override // p067l.AbstractC10645
    public final InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C14391(interfaceC11316, 0);
    }

    public static C24449 getDefaultInstance() {
        return f77394;
    }

    public static InterfaceC13820 parser() {
        return f77393;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f77393;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f77394;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return f77394;
    }
}
