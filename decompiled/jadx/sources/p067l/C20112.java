package p067l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20112 extends AbstractC13919 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۛ */
    public static final C20112 f62214;

    /* JADX INFO: renamed from: ۤ */
    public static final /* synthetic */ int f62215 = 0;

    /* JADX INFO: renamed from: ۨ */
    public static final InterfaceC13820 f62216;

    /* JADX INFO: renamed from: ۗ */
    public byte f62217;

    /* JADX INFO: renamed from: ۙ */
    public C8041 f62218;

    /* JADX INFO: renamed from: ۫ */
    public int f62219;

    /* JADX INFO: renamed from: ۬ */
    public List f62220;

    /* JADX INFO: renamed from: ᩶ */
    public List f62221;

    /* JADX INFO: renamed from: ᩹ */
    public int f62222;

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        C14589 c14589 = new C14589(this);
        for (int i = 0; i < this.f62221.size(); i++) {
            abstractC16402.mo37251(2, (InterfaceC10467) this.f62221.get(i));
        }
        if ((this.f62222 & 2) != 0) {
            abstractC16402.mo37248(3, this.f62219);
        }
        if ((this.f62222 & 1) != 0) {
            abstractC16402.mo37251(50, m45552());
        }
        for (int i2 = 0; i2 < this.f62220.size(); i2++) {
            abstractC16402.mo37251(EnumC5674.f13813, (InterfaceC10467) this.f62220.get(i2));
        }
        c14589.m33381(536870912, abstractC16402);
        getUnknownFields().writeTo(abstractC16402);
    }

    static {
        C22006.m49606(EnumC8594.PUBLIC, C20112.class.getName());
        f62214 = new C20112();
        f62216 = new C8712();
    }

    public C20112(C22124 c22124) {
        super(c22124);
        this.f62219 = 1;
        this.f62217 = (byte) -1;
    }

    public C20112() {
        this.f62219 = 1;
        this.f62217 = (byte) -1;
        List list = Collections.EMPTY_LIST;
        this.f62220 = list;
        this.f62221 = list;
        this.f62219 = 1;
    }

    @Override // p067l.AbstractC6285
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35243;
        c11650.m26787(C20112.class, C22124.class);
        return c11650;
    }

    /* JADX INFO: renamed from: ۖ */
    public final boolean m45550() {
        return (this.f62222 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۡ */
    public final C8041 m45552() {
        C8041 c8041 = this.f62218;
        return c8041 == null ? C8041.getDefaultInstance() : c8041;
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m45551() {
        return (this.f62222 & 2) != 0;
    }

    /* JADX INFO: renamed from: ܺ */
    public final EnumC6030 m45553() {
        EnumC6030 enumC6030M13536 = EnumC6030.m13536(this.f62219);
        return enumC6030M13536 == null ? EnumC6030.UNVERIFIED : enumC6030M13536;
    }

    @Override // p067l.AbstractC13919, p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.f62217;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f62220.size(); i++) {
            if (!((C3821) this.f62220.get(i)).isInitialized()) {
                this.f62217 = (byte) 0;
                return false;
            }
        }
        if (m45550() && !m45552().isInitialized()) {
            this.f62217 = (byte) 0;
            return false;
        }
        if (!m31639()) {
            this.f62217 = (byte) 0;
            return false;
        }
        this.f62217 = (byte) 1;
        return true;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM37229 = 0;
        for (int i2 = 0; i2 < this.f62221.size(); i2++) {
            iM37229 += AbstractC16402.m37229(2, (InterfaceC10467) this.f62221.get(i2));
        }
        if ((this.f62222 & 2) != 0) {
            iM37229 += AbstractC16402.m37226(3, this.f62219);
        }
        if ((this.f62222 & 1) != 0) {
            iM37229 += AbstractC16402.m37229(50, m45552());
        }
        for (int i3 = 0; i3 < this.f62220.size(); i3++) {
            iM37229 += AbstractC16402.m37229(EnumC5674.f13813, (InterfaceC10467) this.f62220.get(i3));
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
        if (!(obj instanceof C20112)) {
            return super.equals(obj);
        }
        C20112 c20112 = (C20112) obj;
        if (!this.f62220.equals(c20112.f62220) || !this.f62221.equals(c20112.f62221) || m45550() != c20112.m45550()) {
            return false;
        }
        if ((!m45550() || m45552().equals(c20112.m45552())) && m45551() == c20112.m45551()) {
            return (!m45551() || this.f62219 == c20112.f62219) && getUnknownFields().equals(c20112.getUnknownFields()) && m31640().equals(c20112.m31640());
        }
        return false;
    }

    @Override // p067l.AbstractC10645
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12539.f35225.hashCode() + 779;
        if (this.f62220.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, EnumC5674.f13813, 53) + this.f62220.hashCode();
        }
        if (this.f62221.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + this.f62221.hashCode();
        }
        if (m45550()) {
            iHashCode = C6316.m14441(iHashCode, 37, 50, 53) + m45552().hashCode();
        }
        if (m45551()) {
            iHashCode = C6316.m14441(iHashCode, 37, 3, 53) + this.f62219;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC10645.m24463(iHashCode, m31640()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C22124 newBuilder() {
        return f62214.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return f62214.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 newBuilderForType() {
        return f62214.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C22124 toBuilder() {
        int i = 0;
        if (this == f62214) {
            return new C22124(i);
        }
        C22124 c22124 = new C22124(i);
        c22124.m49914(this);
        return c22124;
    }

    @Override // p067l.AbstractC10645
    public final InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C22124(interfaceC11316, 0);
    }

    public static C20112 getDefaultInstance() {
        return f62214;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f62216;
    }

    @Override // p067l.AbstractC13919, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f62214;
    }

    @Override // p067l.AbstractC13919, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return f62214;
    }
}
