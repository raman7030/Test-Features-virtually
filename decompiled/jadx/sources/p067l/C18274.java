package p067l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܽܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18274 extends AbstractC13919 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ */
    public static final InterfaceC13820 f54554;

    /* JADX INFO: renamed from: ᩺ */
    public static final C18274 f54555;

    /* JADX INFO: renamed from: ۗ */
    public C8041 f54556;

    /* JADX INFO: renamed from: ۙ */
    public boolean f54557;

    /* JADX INFO: renamed from: ۛ */
    public boolean f54558;

    /* JADX INFO: renamed from: ۤ */
    public boolean f54559;

    /* JADX INFO: renamed from: ۨ */
    public List f54560;

    /* JADX INFO: renamed from: ۫ */
    public byte f54561;

    /* JADX INFO: renamed from: ۬ */
    public boolean f54562;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f54563;

    /* JADX INFO: renamed from: ᩹ */
    public int f54564;

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        C14589 c14589 = new C14589(this);
        if ((this.f54564 & 1) != 0) {
            abstractC16402.mo37240(1, this.f54559);
        }
        if ((this.f54564 & 2) != 0) {
            abstractC16402.mo37240(2, this.f54558);
        }
        if ((this.f54564 & 4) != 0) {
            abstractC16402.mo37240(3, this.f54557);
        }
        if ((this.f54564 & 8) != 0) {
            abstractC16402.mo37240(7, this.f54562);
        }
        if ((this.f54564 & 16) != 0) {
            abstractC16402.mo37240(11, this.f54563);
        }
        if ((this.f54564 & 32) != 0) {
            abstractC16402.mo37251(12, m41609());
        }
        for (int i = 0; i < this.f54560.size(); i++) {
            abstractC16402.mo37251(EnumC5674.f13813, (InterfaceC10467) this.f54560.get(i));
        }
        c14589.m33381(536870912, abstractC16402);
        getUnknownFields().writeTo(abstractC16402);
    }

    static {
        C22006.m49606(EnumC8594.PUBLIC, C18274.class.getName());
        f54555 = new C18274();
        f54554 = new C4193();
    }

    public C18274(C12911 c12911) {
        super(c12911);
        this.f54559 = false;
        this.f54558 = false;
        this.f54557 = false;
        this.f54562 = false;
        this.f54563 = false;
        this.f54561 = (byte) -1;
    }

    public C18274() {
        this.f54559 = false;
        this.f54558 = false;
        this.f54557 = false;
        this.f54562 = false;
        this.f54563 = false;
        this.f54561 = (byte) -1;
        this.f54560 = Collections.EMPTY_LIST;
    }

    @Override // p067l.AbstractC6285
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35206;
        c11650.m26787(C18274.class, C12911.class);
        return c11650;
    }

    /* JADX INFO: renamed from: ܶ */
    public final boolean m41614() {
        return (this.f54564 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final boolean m41616() {
        return this.f54559;
    }

    /* JADX INFO: renamed from: ᩸ */
    public final boolean m41618() {
        return (this.f54564 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final boolean m41617() {
        return this.f54558;
    }

    /* JADX INFO: renamed from: ֡ */
    public final boolean m41607() {
        return (this.f54564 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m41613() {
        return this.f54557;
    }

    /* JADX INFO: renamed from: ۠ */
    public final boolean m41612() {
        return (this.f54564 & 8) != 0;
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m41610() {
        return this.f54562;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۚ */
    public final boolean m41611() {
        return (this.f54564 & 16) != 0;
    }

    @Deprecated
    /* JADX INFO: renamed from: ܺ */
    public final boolean m41615() {
        return this.f54563;
    }

    /* JADX INFO: renamed from: ֨ */
    public final boolean m41608() {
        return (this.f54564 & 32) != 0;
    }

    /* JADX INFO: renamed from: ۖ */
    public final C8041 m41609() {
        C8041 c8041 = this.f54556;
        return c8041 == null ? C8041.getDefaultInstance() : c8041;
    }

    @Override // p067l.AbstractC13919, p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.f54561;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m41608() || m41609().isInitialized()) {
            for (int i = 0; i < this.f54560.size(); i++) {
                if (!((C3821) this.f54560.get(i)).isInitialized()) {
                    this.f54561 = (byte) 0;
                    return false;
                }
            }
            if (!m31639()) {
                this.f54561 = (byte) 0;
                return false;
            }
            this.f54561 = (byte) 1;
            return true;
        }
        this.f54561 = (byte) 0;
        return false;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM37227 = (this.f54564 & 1) != 0 ? AbstractC16402.m37227(1) : 0;
        if ((this.f54564 & 2) != 0) {
            iM37227 += AbstractC16402.m37227(2);
        }
        if ((this.f54564 & 4) != 0) {
            iM37227 += AbstractC16402.m37227(3);
        }
        if ((this.f54564 & 8) != 0) {
            iM37227 += AbstractC16402.m37227(7);
        }
        if ((this.f54564 & 16) != 0) {
            iM37227 += AbstractC16402.m37227(11);
        }
        if ((this.f54564 & 32) != 0) {
            iM37227 += AbstractC16402.m37229(12, m41609());
        }
        for (int i2 = 0; i2 < this.f54560.size(); i2++) {
            iM37227 += AbstractC16402.m37229(EnumC5674.f13813, (InterfaceC10467) this.f54560.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM37227 + m31642();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // p067l.AbstractC10645
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18274)) {
            return super.equals(obj);
        }
        C18274 c18274 = (C18274) obj;
        if (m41614() != c18274.m41614()) {
            return false;
        }
        if ((m41614() && this.f54559 != c18274.f54559) || m41618() != c18274.m41618()) {
            return false;
        }
        if ((m41618() && this.f54558 != c18274.f54558) || m41607() != c18274.m41607()) {
            return false;
        }
        if ((m41607() && this.f54557 != c18274.f54557) || m41612() != c18274.m41612()) {
            return false;
        }
        if ((m41612() && this.f54562 != c18274.f54562) || m41611() != c18274.m41611()) {
            return false;
        }
        if ((!m41611() || this.f54563 == c18274.f54563) && m41608() == c18274.m41608()) {
            return (!m41608() || m41609().equals(c18274.m41609())) && this.f54560.equals(c18274.f54560) && getUnknownFields().equals(c18274.getUnknownFields()) && m31640().equals(c18274.m31640());
        }
        return false;
    }

    @Override // p067l.AbstractC10645
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12539.f35249.hashCode() + 779;
        if (m41614()) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + C15671.m35601(this.f54559);
        }
        if (m41618()) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + C15671.m35601(this.f54558);
        }
        if (m41607()) {
            iHashCode = C6316.m14441(iHashCode, 37, 3, 53) + C15671.m35601(this.f54557);
        }
        if (m41612()) {
            iHashCode = C6316.m14441(iHashCode, 37, 7, 53) + C15671.m35601(this.f54562);
        }
        if (m41611()) {
            iHashCode = C6316.m14441(iHashCode, 37, 11, 53) + C15671.m35601(this.f54563);
        }
        if (m41608()) {
            iHashCode = C6316.m14441(iHashCode, 37, 12, 53) + m41609().hashCode();
        }
        if (this.f54560.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, EnumC5674.f13813, 53) + this.f54560.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC10645.m24463(iHashCode, m31640()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C12911 newBuilder() {
        return f54555.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return f54555.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 newBuilderForType() {
        return f54555.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C12911 toBuilder() {
        int i = 0;
        if (this == f54555) {
            return new C12911(i);
        }
        C12911 c12911 = new C12911(i);
        c12911.m29586(this);
        return c12911;
    }

    @Override // p067l.AbstractC10645
    public final InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C12911(interfaceC11316, 0);
    }

    public static C18274 getDefaultInstance() {
        return f54555;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f54554;
    }

    @Override // p067l.AbstractC13919, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f54555;
    }

    @Override // p067l.AbstractC13919, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return f54555;
    }
}
