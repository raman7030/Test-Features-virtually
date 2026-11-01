package p067l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.۠ܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10228 extends AbstractC6285 implements InterfaceC5773 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۫ */
    public static final InterfaceC13820 f28342;

    /* JADX INFO: renamed from: ۬ */
    public static final C10228 f28343;

    /* JADX INFO: renamed from: ۗ */
    public C23639 f28344;

    /* JADX INFO: renamed from: ۙ */
    public volatile Object f28345;

    /* JADX INFO: renamed from: ᩶ */
    public List f28346;

    /* JADX INFO: renamed from: ᩸ */
    public int f28347;

    /* JADX INFO: renamed from: ᩹ */
    public byte f28348;

    static {
        C22006.m49606(EnumC8594.PUBLIC, C10228.class.getName());
        f28343 = new C10228();
        f28342 = new C7546();
    }

    public C10228(C3522 c3522, int i) {
        super(c3522);
        this.f28345 = "";
        this.f28348 = (byte) -1;
    }

    public C10228() {
        this.f28345 = "";
        this.f28348 = (byte) -1;
        this.f28345 = "";
        this.f28346 = Collections.EMPTY_LIST;
    }

    @Override // p067l.AbstractC6285
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35203;
        c11650.m26787(C10228.class, C3522.class);
        return c11650;
    }

    public final boolean hasName() {
        return (this.f28347 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f28345;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f28345 = strM18427;
        }
        return strM18427;
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m23845() {
        return this.f28346.size();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16262 m23844(int i) {
        return (C16262) this.f28346.get(i);
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m23846() {
        return (this.f28347 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final C23639 m23847() {
        C23639 c23639 = this.f28344;
        return c23639 == null ? C23639.getDefaultInstance() : c23639;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.f28348;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f28346.size(); i++) {
            if (!m23844(i).isInitialized()) {
                this.f28348 = (byte) 0;
                return false;
            }
        }
        if (m23846() && !m23847().isInitialized()) {
            this.f28348 = (byte) 0;
            return false;
        }
        this.f28348 = (byte) 1;
        return true;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        if ((this.f28347 & 1) != 0) {
            AbstractC6285.m14269(abstractC16402, 1, this.f28345);
        }
        for (int i = 0; i < this.f28346.size(); i++) {
            abstractC16402.mo37251(2, (InterfaceC10467) this.f28346.get(i));
        }
        if ((this.f28347 & 2) != 0) {
            abstractC16402.mo37251(3, m23847());
        }
        getUnknownFields().writeTo(abstractC16402);
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM14254 = (this.f28347 & 1) != 0 ? AbstractC6285.m14254(1, this.f28345) : 0;
        for (int i2 = 0; i2 < this.f28346.size(); i2++) {
            iM14254 += AbstractC16402.m37229(2, (InterfaceC10467) this.f28346.get(i2));
        }
        if ((this.f28347 & 2) != 0) {
            iM14254 += AbstractC16402.m37229(3, m23847());
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
        if (!(obj instanceof C10228)) {
            return super.equals(obj);
        }
        C10228 c10228 = (C10228) obj;
        if (hasName() != c10228.hasName()) {
            return false;
        }
        if ((!hasName() || getName().equals(c10228.getName())) && this.f28346.equals(c10228.f28346) && m23846() == c10228.m23846()) {
            return (!m23846() || m23847().equals(c10228.m23847())) && getUnknownFields().equals(c10228.getUnknownFields());
        }
        return false;
    }

    @Override // p067l.AbstractC10645
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12539.f35189.hashCode() + 779;
        if (hasName()) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (this.f28346.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + this.f28346.hashCode();
        }
        if (m23846()) {
            iHashCode = C6316.m14441(iHashCode, 37, 3, 53) + m23847().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C3522 newBuilder() {
        return f28343.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return f28343.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 newBuilderForType() {
        return f28343.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C3522 toBuilder() {
        int i = 0;
        if (this == f28343) {
            return new C3522(i);
        }
        C3522 c3522 = new C3522(i);
        c3522.m6300(this);
        return c3522;
    }

    @Override // p067l.AbstractC10645
    public final InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C3522(interfaceC11316, 0);
    }

    public static C10228 getDefaultInstance() {
        return f28343;
    }

    public static InterfaceC13820 parser() {
        return f28342;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f28342;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f28343;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return f28343;
    }
}
