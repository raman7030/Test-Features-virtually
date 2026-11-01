package p067l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۗۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5339 extends AbstractC13919 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܳ֫ */
    public static final C5339 f12572;

    /* JADX INFO: renamed from: ܿ֫ */
    public static final /* synthetic */ int f12573 = 0;

    /* JADX INFO: renamed from: ᩻֫ */
    public static final InterfaceC13820 f12574;

    /* JADX INFO: renamed from: ֫֫ */
    public List f12575;

    /* JADX INFO: renamed from: ۗ */
    public boolean f12576;

    /* JADX INFO: renamed from: ۙ */
    public boolean f12577;

    /* JADX INFO: renamed from: ۛ */
    public int f12578;

    /* JADX INFO: renamed from: ۟ */
    public int f12579;

    /* JADX INFO: renamed from: ۤ */
    public C8041 f12580;

    /* JADX INFO: renamed from: ۧ֫ */
    public List f12581;

    /* JADX INFO: renamed from: ۨ */
    public boolean f12582;

    /* JADX INFO: renamed from: ۫ */
    public C3327 f12583;

    /* JADX INFO: renamed from: ۬ */
    public List f12584;

    /* JADX INFO: renamed from: ܰ */
    public boolean f12585;

    /* JADX INFO: renamed from: ܽ֫ */
    public boolean f12586;

    /* JADX INFO: renamed from: ᩳ֫ */
    public boolean f12587;

    /* JADX INFO: renamed from: ᩶ */
    public int f12588;

    /* JADX INFO: renamed from: ᩹ */
    public int f12589;

    /* JADX INFO: renamed from: ᩺ */
    public byte f12590;

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        C14589 c14589 = new C14589(this);
        if ((this.f12589 & 1) != 0) {
            abstractC16402.mo37248(1, this.f12588);
        }
        if ((this.f12589 & 2) != 0) {
            abstractC16402.mo37240(2, this.f12585);
        }
        if ((this.f12589 & 32) != 0) {
            abstractC16402.mo37240(3, this.f12576);
        }
        if ((this.f12589 & 8) != 0) {
            abstractC16402.mo37240(5, this.f12582);
        }
        if ((this.f12589 & 4) != 0) {
            abstractC16402.mo37248(6, this.f12578);
        }
        if ((this.f12589 & 64) != 0) {
            abstractC16402.mo37240(10, this.f12587);
        }
        if ((this.f12589 & 16) != 0) {
            abstractC16402.mo37240(15, this.f12586);
        }
        if ((this.f12589 & 128) != 0) {
            abstractC16402.mo37240(16, this.f12577);
        }
        if ((this.f12589 & 256) != 0) {
            abstractC16402.mo37248(17, this.f12579);
        }
        for (int i = 0; i < this.f12575.size(); i++) {
            abstractC16402.mo37248(19, ((Integer) this.f12575.get(i)).intValue());
        }
        for (int i2 = 0; i2 < this.f12584.size(); i2++) {
            abstractC16402.mo37251(20, (InterfaceC10467) this.f12584.get(i2));
        }
        if ((this.f12589 & 512) != 0) {
            abstractC16402.mo37251(21, m11591());
        }
        if ((this.f12589 & 1024) != 0) {
            abstractC16402.mo37251(22, m11579());
        }
        for (int i3 = 0; i3 < this.f12581.size(); i3++) {
            abstractC16402.mo37251(EnumC5674.f13813, (InterfaceC10467) this.f12581.get(i3));
        }
        c14589.m33381(536870912, abstractC16402);
        getUnknownFields().writeTo(abstractC16402);
    }

    static {
        C22006.m49606(EnumC8594.PUBLIC, C5339.class.getName());
        f12572 = new C5339();
        f12574 = new C11375();
    }

    public C5339(C10704 c10704) {
        super(c10704);
        this.f12588 = 0;
        this.f12585 = false;
        this.f12578 = 0;
        this.f12582 = false;
        this.f12586 = false;
        this.f12576 = false;
        this.f12587 = false;
        this.f12577 = false;
        this.f12579 = 0;
        this.f12590 = (byte) -1;
    }

    public C5339() {
        this.f12585 = false;
        this.f12582 = false;
        this.f12586 = false;
        this.f12576 = false;
        this.f12587 = false;
        this.f12577 = false;
        this.f12590 = (byte) -1;
        this.f12588 = 0;
        this.f12578 = 0;
        this.f12579 = 0;
        List list = Collections.EMPTY_LIST;
        this.f12575 = list;
        this.f12584 = list;
        this.f12581 = list;
    }

    @Override // p067l.AbstractC6285
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35216;
        c11650.m26787(C5339.class, C10704.class);
        return c11650;
    }

    /* JADX INFO: renamed from: ᩸ */
    public final boolean m11594() {
        return (this.f12589 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۡ */
    public final EnumC4669 m11584() {
        EnumC4669 enumC4669M9895 = EnumC4669.m9895(this.f12588);
        return enumC4669M9895 == null ? EnumC4669.STRING : enumC4669M9895;
    }

    /* JADX INFO: renamed from: ۤ */
    public final boolean m11585() {
        return (this.f12589 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۚ */
    public final boolean m11581() {
        return this.f12585;
    }

    /* JADX INFO: renamed from: ۬ */
    public final boolean m11588() {
        return (this.f12589 & 4) != 0;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final EnumC16737 m11592() {
        EnumC16737 enumC16737M37972 = EnumC16737.m37972(this.f12578);
        return enumC16737M37972 == null ? EnumC16737.JS_NORMAL : enumC16737M37972;
    }

    /* JADX INFO: renamed from: ۫ */
    public final boolean m11587() {
        return (this.f12589 & 8) != 0;
    }

    /* JADX INFO: renamed from: ֡ */
    public final boolean m11575() {
        return this.f12582;
    }

    /* JADX INFO: renamed from: ۨ */
    public final boolean m11586() {
        return (this.f12589 & 16) != 0;
    }

    /* JADX INFO: renamed from: ۠ */
    public final boolean m11583() {
        return this.f12586;
    }

    /* JADX INFO: renamed from: ᩶ */
    public final boolean m11593() {
        return (this.f12589 & 32) != 0;
    }

    /* JADX INFO: renamed from: ۖ */
    public final boolean m11577() {
        return this.f12576;
    }

    /* JADX INFO: renamed from: ᩺ */
    public final boolean m11596() {
        return (this.f12589 & 64) != 0;
    }

    /* JADX INFO: renamed from: ܶ */
    public final boolean m11589() {
        return this.f12587;
    }

    /* JADX INFO: renamed from: ᩹ */
    public final boolean m11595() {
        return (this.f12589 & 128) != 0;
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m11590() {
        return this.f12577;
    }

    /* JADX INFO: renamed from: ۛ */
    public final boolean m11582() {
        return (this.f12589 & 256) != 0;
    }

    /* JADX INFO: renamed from: ֨ */
    public final EnumC23444 m11576() {
        EnumC23444 enumC23444M52143 = EnumC23444.m52143(this.f12579);
        return enumC23444M52143 == null ? EnumC23444.RETENTION_UNKNOWN : enumC23444M52143;
    }

    /* JADX INFO: renamed from: ۗ */
    public final boolean m11578() {
        return (this.f12589 & 512) != 0;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final C8041 m11591() {
        C8041 c8041 = this.f12580;
        return c8041 == null ? C8041.getDefaultInstance() : c8041;
    }

    /* JADX INFO: renamed from: ۙ */
    public final boolean m11580() {
        return (this.f12589 & 1024) != 0;
    }

    /* JADX INFO: renamed from: ۘ */
    public final C3327 m11579() {
        C3327 c3327 = this.f12583;
        return c3327 == null ? C3327.getDefaultInstance() : c3327;
    }

    @Override // p067l.AbstractC13919, p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.f12590;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m11578() || m11591().isInitialized()) {
            for (int i = 0; i < this.f12581.size(); i++) {
                if (!((C3821) this.f12581.get(i)).isInitialized()) {
                    this.f12590 = (byte) 0;
                    return false;
                }
            }
            if (!m31639()) {
                this.f12590 = (byte) 0;
                return false;
            }
            this.f12590 = (byte) 1;
            return true;
        }
        this.f12590 = (byte) 0;
        return false;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM37226 = (this.f12589 & 1) != 0 ? AbstractC16402.m37226(1, this.f12588) : 0;
        if ((this.f12589 & 2) != 0) {
            iM37226 += AbstractC16402.m37227(2);
        }
        if ((this.f12589 & 32) != 0) {
            iM37226 += AbstractC16402.m37227(3);
        }
        if ((this.f12589 & 8) != 0) {
            iM37226 += AbstractC16402.m37227(5);
        }
        if ((this.f12589 & 4) != 0) {
            iM37226 += AbstractC16402.m37226(6, this.f12578);
        }
        if ((this.f12589 & 64) != 0) {
            iM37226 += AbstractC16402.m37227(10);
        }
        if ((this.f12589 & 16) != 0) {
            iM37226 += AbstractC16402.m37227(15);
        }
        if ((this.f12589 & 128) != 0) {
            iM37226 += AbstractC16402.m37227(16);
        }
        if ((this.f12589 & 256) != 0) {
            iM37226 += AbstractC16402.m37226(17, this.f12579);
        }
        int iM37224 = 0;
        for (int i2 = 0; i2 < this.f12575.size(); i2++) {
            iM37224 += AbstractC16402.m37224(((Integer) this.f12575.get(i2)).intValue());
        }
        int size = (this.f12575.size() * 2) + iM37226 + iM37224;
        for (int i3 = 0; i3 < this.f12584.size(); i3++) {
            size += AbstractC16402.m37229(20, (InterfaceC10467) this.f12584.get(i3));
        }
        if ((this.f12589 & 512) != 0) {
            size += AbstractC16402.m37229(21, m11591());
        }
        if ((this.f12589 & 1024) != 0) {
            size += AbstractC16402.m37229(22, m11579());
        }
        for (int i4 = 0; i4 < this.f12581.size(); i4++) {
            size += AbstractC16402.m37229(EnumC5674.f13813, (InterfaceC10467) this.f12581.get(i4));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + size + m31642();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // p067l.AbstractC10645
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5339)) {
            return super.equals(obj);
        }
        C5339 c5339 = (C5339) obj;
        if (m11594() != c5339.m11594()) {
            return false;
        }
        if ((m11594() && this.f12588 != c5339.f12588) || m11585() != c5339.m11585()) {
            return false;
        }
        if ((m11585() && this.f12585 != c5339.f12585) || m11588() != c5339.m11588()) {
            return false;
        }
        if ((m11588() && this.f12578 != c5339.f12578) || m11587() != c5339.m11587()) {
            return false;
        }
        if ((m11587() && this.f12582 != c5339.f12582) || m11586() != c5339.m11586()) {
            return false;
        }
        if ((m11586() && this.f12586 != c5339.f12586) || m11593() != c5339.m11593()) {
            return false;
        }
        if ((m11593() && this.f12576 != c5339.f12576) || m11596() != c5339.m11596()) {
            return false;
        }
        if ((m11596() && this.f12587 != c5339.f12587) || m11595() != c5339.m11595()) {
            return false;
        }
        if ((m11595() && this.f12577 != c5339.f12577) || m11582() != c5339.m11582()) {
            return false;
        }
        if ((m11582() && this.f12579 != c5339.f12579) || !this.f12575.equals(c5339.f12575) || !this.f12584.equals(c5339.f12584) || m11578() != c5339.m11578()) {
            return false;
        }
        if ((!m11578() || m11591().equals(c5339.m11591())) && m11580() == c5339.m11580()) {
            return (!m11580() || m11579().equals(c5339.m11579())) && this.f12581.equals(c5339.f12581) && getUnknownFields().equals(c5339.getUnknownFields()) && m31640().equals(c5339.m31640());
        }
        return false;
    }

    @Override // p067l.AbstractC10645
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12539.f35193.hashCode() + 779;
        if (m11594()) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + this.f12588;
        }
        if (m11585()) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + C15671.m35601(this.f12585);
        }
        if (m11588()) {
            iHashCode = C6316.m14441(iHashCode, 37, 6, 53) + this.f12578;
        }
        if (m11587()) {
            iHashCode = C6316.m14441(iHashCode, 37, 5, 53) + C15671.m35601(this.f12582);
        }
        if (m11586()) {
            iHashCode = C6316.m14441(iHashCode, 37, 15, 53) + C15671.m35601(this.f12586);
        }
        if (m11593()) {
            iHashCode = C6316.m14441(iHashCode, 37, 3, 53) + C15671.m35601(this.f12576);
        }
        if (m11596()) {
            iHashCode = C6316.m14441(iHashCode, 37, 10, 53) + C15671.m35601(this.f12587);
        }
        if (m11595()) {
            iHashCode = C6316.m14441(iHashCode, 37, 16, 53) + C15671.m35601(this.f12577);
        }
        if (m11582()) {
            iHashCode = C6316.m14441(iHashCode, 37, 17, 53) + this.f12579;
        }
        if (this.f12575.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 19, 53) + this.f12575.hashCode();
        }
        if (this.f12584.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 20, 53) + this.f12584.hashCode();
        }
        if (m11578()) {
            iHashCode = C6316.m14441(iHashCode, 37, 21, 53) + m11591().hashCode();
        }
        if (m11580()) {
            iHashCode = C6316.m14441(iHashCode, 37, 22, 53) + m11579().hashCode();
        }
        if (this.f12581.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, EnumC5674.f13813, 53) + this.f12581.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC10645.m24463(iHashCode, m31640()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C10704 newBuilder() {
        return f12572.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return f12572.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 newBuilderForType() {
        return f12572.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C10704 toBuilder() {
        int i = 0;
        if (this == f12572) {
            return new C10704(i);
        }
        C10704 c10704 = new C10704(i);
        c10704.m24633(this);
        return c10704;
    }

    @Override // p067l.AbstractC10645
    public final InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C10704(interfaceC11316, 0);
    }

    public static C5339 getDefaultInstance() {
        return f12572;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f12574;
    }

    @Override // p067l.AbstractC13919, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f12572;
    }

    @Override // p067l.AbstractC13919, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return f12572;
    }
}
