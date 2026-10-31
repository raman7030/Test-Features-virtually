package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18670 extends AbstractC12154 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C18670 f58991;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f58992 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12050 f58993;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public byte f58994;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5969 f58995;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f58996;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public List f58997;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f58998;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f58999;

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        C12859 c12859 = new C12859(this);
        for (int i = 0; i < this.f58998.size(); i++) {
            abstractC14766.mo35104(2, (InterfaceC8522) this.f58998.get(i));
        }
        if ((this.f58999 & 2) != 0) {
            abstractC14766.mo35101(3, this.f58996);
        }
        if ((this.f58999 & 1) != 0) {
            abstractC14766.mo35104(50, m43286());
        }
        for (int i2 = 0; i2 < this.f58997.size(); i2++) {
            abstractC14766.mo35104(EnumC3478.f11008, (InterfaceC8522) this.f58997.get(i2));
        }
        c12859.m31295(536870912, abstractC14766);
        getUnknownFields().writeTo(abstractC14766);
    }

    static {
        C20663.m47279(EnumC6551.PUBLIC, C18670.class.getName());
        f58991 = new C18670();
        f58993 = new C6675();
    }

    public C18670(C20787 c20787) {
        super(c20787);
        this.f58996 = 1;
        this.f58994 = (byte) -1;
    }

    public C18670() {
        this.f58996 = 1;
        this.f58994 = (byte) -1;
        List list = Collections.EMPTY_LIST;
        this.f58997 = list;
        this.f58998 = list;
        this.f58996 = 1;
    }

    @Override // l.AbstractC4121
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32268;
        c9766.m24773(C18670.class, C20787.class);
        return c9766;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m43284() {
        return (this.f58999 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C5969 m43286() {
        C5969 c5969 = this.f58995;
        return c5969 == null ? C5969.getDefaultInstance() : c5969;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m43285() {
        return (this.f58999 & 2) != 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC3853 m43287() {
        EnumC3853 enumC3853M11600 = EnumC3853.m11600(this.f58996);
        return enumC3853M11600 == null ? EnumC3853.UNVERIFIED : enumC3853M11600;
    }

    @Override // l.AbstractC12154, l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        byte b = this.f58994;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f58997.size(); i++) {
            if (!((C1529) this.f58997.get(i)).isInitialized()) {
                this.f58994 = (byte) 0;
                return false;
            }
        }
        if (m43284() && !m43286().isInitialized()) {
            this.f58994 = (byte) 0;
            return false;
        }
        if (!m29574()) {
            this.f58994 = (byte) 0;
            return false;
        }
        this.f58994 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35082 = 0;
        for (int i2 = 0; i2 < this.f58998.size(); i2++) {
            iM35082 += AbstractC14766.m35082(2, (InterfaceC8522) this.f58998.get(i2));
        }
        if ((this.f58999 & 2) != 0) {
            iM35082 += AbstractC14766.m35079(3, this.f58996);
        }
        if ((this.f58999 & 1) != 0) {
            iM35082 += AbstractC14766.m35082(50, m43286());
        }
        for (int i3 = 0; i3 < this.f58997.size(); i3++) {
            iM35082 += AbstractC14766.m35082(EnumC3478.f11008, (InterfaceC8522) this.f58997.get(i3));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM35082 + m29577();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC8709
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18670)) {
            return super.equals(obj);
        }
        C18670 c18670 = (C18670) obj;
        if (!this.f58997.equals(c18670.f58997) || !this.f58998.equals(c18670.f58998) || m43284() != c18670.m43284()) {
            return false;
        }
        if ((!m43284() || m43286().equals(c18670.m43286())) && m43285() == c18670.m43285()) {
            return (!m43285() || this.f58996 == c18670.f58996) && getUnknownFields().equals(c18670.getUnknownFields()) && m29575().equals(c18670.m29575());
        }
        return false;
    }

    @Override // l.AbstractC8709
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C10702.f32250.hashCode() + 779;
        if (this.f58997.size() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, EnumC3478.f11008, 53) + this.f58997.hashCode();
        }
        if (this.f58998.size() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + this.f58998.hashCode();
        }
        if (m43284()) {
            iHashCode = C4153.m12551(iHashCode, 37, 50, 53) + m43286().hashCode();
        }
        if (m43285()) {
            iHashCode = C4153.m12551(iHashCode, 37, 3, 53) + this.f58996;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC8709.m22494(iHashCode, m29575()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C20787 newBuilder() {
        return f58991.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return f58991.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 newBuilderForType() {
        return f58991.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C20787 toBuilder() {
        int i = 0;
        if (this == f58991) {
            return new C20787(i);
        }
        C20787 c20787 = new C20787(i);
        c20787.m47586(this);
        return c20787;
    }

    @Override // l.AbstractC8709
    public final InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C20787(interfaceC9415, 0);
    }

    public static C18670 getDefaultInstance() {
        return f58991;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f58993;
    }

    @Override // l.AbstractC12154, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f58991;
    }

    @Override // l.AbstractC12154, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return f58991;
    }
}
