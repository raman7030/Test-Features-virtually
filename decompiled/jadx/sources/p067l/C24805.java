package p067l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C24805 extends AbstractC13919 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۛ */
    public static final C24805 f79264;

    /* JADX INFO: renamed from: ۨ */
    public static final InterfaceC13820 f79265;

    /* JADX INFO: renamed from: ۗ */
    public C3327 f79266;

    /* JADX INFO: renamed from: ۙ */
    public boolean f79267;

    /* JADX INFO: renamed from: ۤ */
    public List f79268;

    /* JADX INFO: renamed from: ۫ */
    public byte f79269;

    /* JADX INFO: renamed from: ۬ */
    public C8041 f79270;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f79271;

    /* JADX INFO: renamed from: ᩹ */
    public int f79272;

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        C14589 c14589 = new C14589(this);
        if ((this.f79272 & 1) != 0) {
            abstractC16402.mo37240(1, this.f79267);
        }
        if ((this.f79272 & 2) != 0) {
            abstractC16402.mo37251(2, m54499());
        }
        if ((this.f79272 & 4) != 0) {
            abstractC16402.mo37240(3, this.f79271);
        }
        if ((this.f79272 & 8) != 0) {
            abstractC16402.mo37251(4, m54498());
        }
        for (int i = 0; i < this.f79268.size(); i++) {
            abstractC16402.mo37251(EnumC5674.f13813, (InterfaceC10467) this.f79268.get(i));
        }
        c14589.m33381(536870912, abstractC16402);
        getUnknownFields().writeTo(abstractC16402);
    }

    static {
        C22006.m49606(EnumC8594.PUBLIC, C24805.class.getName());
        f79264 = new C24805();
        f79265 = new C18770();
    }

    public C24805(C16087 c16087) {
        super(c16087);
        this.f79267 = false;
        this.f79271 = false;
        this.f79269 = (byte) -1;
    }

    public C24805() {
        this.f79267 = false;
        this.f79271 = false;
        this.f79269 = (byte) -1;
        this.f79268 = Collections.EMPTY_LIST;
    }

    @Override // p067l.AbstractC6285
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35202;
        c11650.m26787(C24805.class, C16087.class);
        return c11650;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final boolean m54504() {
        return (this.f79272 & 1) != 0;
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m54502() {
        return this.f79267;
    }

    /* JADX INFO: renamed from: ۚ */
    public final boolean m54500() {
        return (this.f79272 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۘ */
    public final C8041 m54499() {
        C8041 c8041 = this.f79270;
        return c8041 == null ? C8041.getDefaultInstance() : c8041;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final boolean m54503() {
        return (this.f79272 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m54501() {
        return this.f79271;
    }

    /* JADX INFO: renamed from: ֡ */
    public final boolean m54497() {
        return (this.f79272 & 8) != 0;
    }

    /* JADX INFO: renamed from: ۖ */
    public final C3327 m54498() {
        C3327 c3327 = this.f79266;
        return c3327 == null ? C3327.getDefaultInstance() : c3327;
    }

    @Override // p067l.AbstractC13919, p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.f79269;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m54500() || m54499().isInitialized()) {
            for (int i = 0; i < this.f79268.size(); i++) {
                if (!((C3821) this.f79268.get(i)).isInitialized()) {
                    this.f79269 = (byte) 0;
                    return false;
                }
            }
            if (!m31639()) {
                this.f79269 = (byte) 0;
                return false;
            }
            this.f79269 = (byte) 1;
            return true;
        }
        this.f79269 = (byte) 0;
        return false;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM37227 = (this.f79272 & 1) != 0 ? AbstractC16402.m37227(1) : 0;
        if ((this.f79272 & 2) != 0) {
            iM37227 += AbstractC16402.m37229(2, m54499());
        }
        if ((this.f79272 & 4) != 0) {
            iM37227 += AbstractC16402.m37227(3);
        }
        if ((this.f79272 & 8) != 0) {
            iM37227 += AbstractC16402.m37229(4, m54498());
        }
        for (int i2 = 0; i2 < this.f79268.size(); i2++) {
            iM37227 += AbstractC16402.m37229(EnumC5674.f13813, (InterfaceC10467) this.f79268.get(i2));
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
        if (!(obj instanceof C24805)) {
            return super.equals(obj);
        }
        C24805 c24805 = (C24805) obj;
        if (m54504() != c24805.m54504()) {
            return false;
        }
        if ((m54504() && this.f79267 != c24805.f79267) || m54500() != c24805.m54500()) {
            return false;
        }
        if ((m54500() && !m54499().equals(c24805.m54499())) || m54503() != c24805.m54503()) {
            return false;
        }
        if ((!m54503() || this.f79271 == c24805.f79271) && m54497() == c24805.m54497()) {
            return (!m54497() || m54498().equals(c24805.m54498())) && this.f79268.equals(c24805.f79268) && getUnknownFields().equals(c24805.getUnknownFields()) && m31640().equals(c24805.m31640());
        }
        return false;
    }

    @Override // p067l.AbstractC10645
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12539.f35188.hashCode() + 779;
        if (m54504()) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + C15671.m35601(this.f79267);
        }
        if (m54500()) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + m54499().hashCode();
        }
        if (m54503()) {
            iHashCode = C6316.m14441(iHashCode, 37, 3, 53) + C15671.m35601(this.f79271);
        }
        if (m54497()) {
            iHashCode = C6316.m14441(iHashCode, 37, 4, 53) + m54498().hashCode();
        }
        if (this.f79268.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, EnumC5674.f13813, 53) + this.f79268.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC10645.m24463(iHashCode, m31640()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C16087 newBuilder() {
        return f79264.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return f79264.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 newBuilderForType() {
        return f79264.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C16087 toBuilder() {
        int i = 0;
        if (this == f79264) {
            return new C16087(i);
        }
        C16087 c16087 = new C16087(i);
        c16087.m36596(this);
        return c16087;
    }

    @Override // p067l.AbstractC10645
    public final InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C16087(interfaceC11316, 0);
    }

    public static C24805 getDefaultInstance() {
        return f79264;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f79265;
    }

    @Override // p067l.AbstractC13919, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f79264;
    }

    @Override // p067l.AbstractC13919, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return f79264;
    }
}
