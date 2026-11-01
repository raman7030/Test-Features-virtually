package p067l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֡ܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2851 extends AbstractC13919 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۫ */
    public static final InterfaceC13820 f4907;

    /* JADX INFO: renamed from: ۬ */
    public static final C2851 f4908;

    /* JADX INFO: renamed from: ۗ */
    public List f4909;

    /* JADX INFO: renamed from: ۙ */
    public byte f4910;

    /* JADX INFO: renamed from: ᩶ */
    public C8041 f4911;

    /* JADX INFO: renamed from: ᩹ */
    public int f4912;

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        C14589 c14589 = new C14589(this);
        if ((this.f4912 & 1) != 0) {
            abstractC16402.mo37251(1, m4567());
        }
        for (int i = 0; i < this.f4909.size(); i++) {
            abstractC16402.mo37251(EnumC5674.f13813, (InterfaceC10467) this.f4909.get(i));
        }
        c14589.m33381(536870912, abstractC16402);
        getUnknownFields().writeTo(abstractC16402);
    }

    static {
        C22006.m49606(EnumC8594.PUBLIC, C2851.class.getName());
        f4908 = new C2851();
        f4907 = new C20287();
    }

    public C2851(C20958 c20958) {
        super(c20958);
        this.f4910 = (byte) -1;
    }

    public C2851() {
        this.f4910 = (byte) -1;
        this.f4909 = Collections.EMPTY_LIST;
    }

    @Override // p067l.AbstractC6285
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35238;
        c11650.m26787(C2851.class, C20958.class);
        return c11650;
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m4568() {
        return (this.f4912 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۡ */
    public final C8041 m4567() {
        C8041 c8041 = this.f4911;
        return c8041 == null ? C8041.getDefaultInstance() : c8041;
    }

    @Override // p067l.AbstractC13919, p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.f4910;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m4568() || m4567().isInitialized()) {
            for (int i = 0; i < this.f4909.size(); i++) {
                if (!((C3821) this.f4909.get(i)).isInitialized()) {
                    this.f4910 = (byte) 0;
                    return false;
                }
            }
            if (!m31639()) {
                this.f4910 = (byte) 0;
                return false;
            }
            this.f4910 = (byte) 1;
            return true;
        }
        this.f4910 = (byte) 0;
        return false;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM37229 = (this.f4912 & 1) != 0 ? AbstractC16402.m37229(1, m4567()) : 0;
        for (int i2 = 0; i2 < this.f4909.size(); i2++) {
            iM37229 += AbstractC16402.m37229(EnumC5674.f13813, (InterfaceC10467) this.f4909.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM37229 + m31642();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // p067l.AbstractC10645
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2851)) {
            return super.equals(obj);
        }
        C2851 c2851 = (C2851) obj;
        if (m4568() != c2851.m4568()) {
            return false;
        }
        return (!m4568() || m4567().equals(c2851.m4567())) && this.f4909.equals(c2851.f4909) && getUnknownFields().equals(c2851.getUnknownFields()) && m31640().equals(c2851.m31640());
    }

    @Override // p067l.AbstractC10645
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12539.f35236.hashCode() + 779;
        if (m4568()) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + m4567().hashCode();
        }
        if (this.f4909.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, EnumC5674.f13813, 53) + this.f4909.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC10645.m24463(iHashCode, m31640()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C20958 newBuilder() {
        return f4908.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return f4908.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 newBuilderForType() {
        return f4908.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C20958 toBuilder() {
        int i = 0;
        if (this == f4908) {
            return new C20958(i);
        }
        C20958 c20958 = new C20958(i);
        c20958.m47278(this);
        return c20958;
    }

    @Override // p067l.AbstractC10645
    public final InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C20958(interfaceC11316, 0);
    }

    public static C2851 getDefaultInstance() {
        return f4908;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f4907;
    }

    @Override // p067l.AbstractC13919, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f4908;
    }

    @Override // p067l.AbstractC13919, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return f4908;
    }
}
