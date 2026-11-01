package p067l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֫ۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4018 extends AbstractC13919 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۛ */
    public static final C4018 f8779;

    /* JADX INFO: renamed from: ۨ */
    public static final InterfaceC13820 f8780;

    /* JADX INFO: renamed from: ۗ */
    public boolean f8781;

    /* JADX INFO: renamed from: ۙ */
    public boolean f8782;

    /* JADX INFO: renamed from: ۤ */
    public List f8783;

    /* JADX INFO: renamed from: ۫ */
    public byte f8784;

    /* JADX INFO: renamed from: ۬ */
    public C8041 f8785;

    /* JADX INFO: renamed from: ᩶ */
    public int f8786;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f8787;

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        C14589 c14589 = new C14589(this);
        if ((this.f8786 & 1) != 0) {
            abstractC16402.mo37240(2, this.f8787);
        }
        if ((this.f8786 & 2) != 0) {
            abstractC16402.mo37240(3, this.f8781);
        }
        if ((this.f8786 & 4) != 0) {
            abstractC16402.mo37240(6, this.f8782);
        }
        if ((this.f8786 & 8) != 0) {
            abstractC16402.mo37251(7, m8014());
        }
        for (int i = 0; i < this.f8783.size(); i++) {
            abstractC16402.mo37251(EnumC5674.f13813, (InterfaceC10467) this.f8783.get(i));
        }
        c14589.m33381(536870912, abstractC16402);
        getUnknownFields().writeTo(abstractC16402);
    }

    static {
        C22006.m49606(EnumC8594.PUBLIC, C4018.class.getName());
        f8779 = new C4018();
        f8780 = new C15731();
    }

    public C4018(C9697 c9697) {
        super(c9697);
        this.f8787 = false;
        this.f8781 = false;
        this.f8782 = false;
        this.f8784 = (byte) -1;
    }

    public C4018() {
        this.f8787 = false;
        this.f8781 = false;
        this.f8782 = false;
        this.f8784 = (byte) -1;
        this.f8783 = Collections.EMPTY_LIST;
    }

    @Override // p067l.AbstractC6285
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35198;
        c11650.m26787(C4018.class, C9697.class);
        return c11650;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final boolean m8018() {
        return (this.f8786 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m8016() {
        return this.f8787;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final boolean m8019() {
        return (this.f8786 & 2) != 0;
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m8017() {
        return this.f8781;
    }

    @Deprecated
    /* JADX INFO: renamed from: ֡ */
    public final boolean m8012() {
        return (this.f8786 & 4) != 0;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۖ */
    public final boolean m8013() {
        return this.f8782;
    }

    /* JADX INFO: renamed from: ۚ */
    public final boolean m8015() {
        return (this.f8786 & 8) != 0;
    }

    /* JADX INFO: renamed from: ۘ */
    public final C8041 m8014() {
        C8041 c8041 = this.f8785;
        return c8041 == null ? C8041.getDefaultInstance() : c8041;
    }

    @Override // p067l.AbstractC13919, p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.f8784;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m8015() || m8014().isInitialized()) {
            for (int i = 0; i < this.f8783.size(); i++) {
                if (!((C3821) this.f8783.get(i)).isInitialized()) {
                    this.f8784 = (byte) 0;
                    return false;
                }
            }
            if (!m31639()) {
                this.f8784 = (byte) 0;
                return false;
            }
            this.f8784 = (byte) 1;
            return true;
        }
        this.f8784 = (byte) 0;
        return false;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM37227 = (this.f8786 & 1) != 0 ? AbstractC16402.m37227(2) : 0;
        if ((2 & this.f8786) != 0) {
            iM37227 += AbstractC16402.m37227(3);
        }
        if ((this.f8786 & 4) != 0) {
            iM37227 += AbstractC16402.m37227(6);
        }
        if ((this.f8786 & 8) != 0) {
            iM37227 += AbstractC16402.m37229(7, m8014());
        }
        for (int i2 = 0; i2 < this.f8783.size(); i2++) {
            iM37227 += AbstractC16402.m37229(EnumC5674.f13813, (InterfaceC10467) this.f8783.get(i2));
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
        if (!(obj instanceof C4018)) {
            return super.equals(obj);
        }
        C4018 c4018 = (C4018) obj;
        if (m8018() != c4018.m8018()) {
            return false;
        }
        if ((m8018() && this.f8787 != c4018.f8787) || m8019() != c4018.m8019()) {
            return false;
        }
        if ((m8019() && this.f8781 != c4018.f8781) || m8012() != c4018.m8012()) {
            return false;
        }
        if ((!m8012() || this.f8782 == c4018.f8782) && m8015() == c4018.m8015()) {
            return (!m8015() || m8014().equals(c4018.m8014())) && this.f8783.equals(c4018.f8783) && getUnknownFields().equals(c4018.getUnknownFields()) && m31640().equals(c4018.m31640());
        }
        return false;
    }

    @Override // p067l.AbstractC10645
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12539.f35194.hashCode() + 779;
        if (m8018()) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + C15671.m35601(this.f8787);
        }
        if (m8019()) {
            iHashCode = C6316.m14441(iHashCode, 37, 3, 53) + C15671.m35601(this.f8781);
        }
        if (m8012()) {
            iHashCode = C6316.m14441(iHashCode, 37, 6, 53) + C15671.m35601(this.f8782);
        }
        if (m8015()) {
            iHashCode = C6316.m14441(iHashCode, 37, 7, 53) + m8014().hashCode();
        }
        if (this.f8783.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, EnumC5674.f13813, 53) + this.f8783.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC10645.m24463(iHashCode, m31640()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C9697 newBuilder() {
        return f8779.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return f8779.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 newBuilderForType() {
        return f8779.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C9697 toBuilder() {
        int i = 0;
        if (this == f8779) {
            return new C9697(i);
        }
        C9697 c9697 = new C9697(i);
        c9697.m22608(this);
        return c9697;
    }

    @Override // p067l.AbstractC10645
    public final InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C9697(interfaceC11316, 0);
    }

    public static C4018 getDefaultInstance() {
        return f8779;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f8780;
    }

    @Override // p067l.AbstractC13919, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f8779;
    }

    @Override // p067l.AbstractC13919, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return f8779;
    }
}
