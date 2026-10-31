package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֫ۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1736 extends AbstractC12154 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C1736 f6002;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12050 f6003;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f6004;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f6005;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public List f6006;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte f6007;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C5969 f6008;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f6009;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f6010;

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        C12859 c12859 = new C12859(this);
        if ((this.f6009 & 1) != 0) {
            abstractC14766.mo35093(2, this.f6010);
        }
        if ((this.f6009 & 2) != 0) {
            abstractC14766.mo35093(3, this.f6004);
        }
        if ((this.f6009 & 4) != 0) {
            abstractC14766.mo35093(6, this.f6005);
        }
        if ((this.f6009 & 8) != 0) {
            abstractC14766.mo35104(7, m5804());
        }
        for (int i = 0; i < this.f6006.size(); i++) {
            abstractC14766.mo35104(EnumC3478.f11008, (InterfaceC8522) this.f6006.get(i));
        }
        c12859.m31295(536870912, abstractC14766);
        getUnknownFields().writeTo(abstractC14766);
    }

    static {
        C20663.m47279(EnumC6551.PUBLIC, C1736.class.getName());
        f6002 = new C1736();
        f6003 = new C14060();
    }

    public C1736(C7711 c7711) {
        super(c7711);
        this.f6010 = false;
        this.f6004 = false;
        this.f6005 = false;
        this.f6007 = (byte) -1;
    }

    public C1736() {
        this.f6010 = false;
        this.f6004 = false;
        this.f6005 = false;
        this.f6007 = (byte) -1;
        this.f6006 = Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC4121
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32223;
        c9766.m24773(C1736.class, C7711.class);
        return c9766;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m5808() {
        return (this.f6009 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m5806() {
        return this.f6010;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m5809() {
        return (this.f6009 & 2) != 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m5807() {
        return this.f6004;
    }

    @Deprecated
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m5802() {
        return (this.f6009 & 4) != 0;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m5803() {
        return this.f6005;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m5805() {
        return (this.f6009 & 8) != 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C5969 m5804() {
        C5969 c5969 = this.f6008;
        return c5969 == null ? C5969.getDefaultInstance() : c5969;
    }

    @Override // l.AbstractC12154, l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        byte b = this.f6007;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m5805() || m5804().isInitialized()) {
            for (int i = 0; i < this.f6006.size(); i++) {
                if (!((C1529) this.f6006.get(i)).isInitialized()) {
                    this.f6007 = (byte) 0;
                    return false;
                }
            }
            if (!m29574()) {
                this.f6007 = (byte) 0;
                return false;
            }
            this.f6007 = (byte) 1;
            return true;
        }
        this.f6007 = (byte) 0;
        return false;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35080 = (this.f6009 & 1) != 0 ? AbstractC14766.m35080(2) : 0;
        if ((2 & this.f6009) != 0) {
            iM35080 += AbstractC14766.m35080(3);
        }
        if ((this.f6009 & 4) != 0) {
            iM35080 += AbstractC14766.m35080(6);
        }
        if ((this.f6009 & 8) != 0) {
            iM35080 += AbstractC14766.m35082(7, m5804());
        }
        for (int i2 = 0; i2 < this.f6006.size(); i2++) {
            iM35080 += AbstractC14766.m35082(EnumC3478.f11008, (InterfaceC8522) this.f6006.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM35080 + m29577();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC8709
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1736)) {
            return super.equals(obj);
        }
        C1736 c1736 = (C1736) obj;
        if (m5808() != c1736.m5808()) {
            return false;
        }
        if ((m5808() && this.f6010 != c1736.f6010) || m5809() != c1736.m5809()) {
            return false;
        }
        if ((m5809() && this.f6004 != c1736.f6004) || m5802() != c1736.m5802()) {
            return false;
        }
        if ((!m5802() || this.f6005 == c1736.f6005) && m5805() == c1736.m5805()) {
            return (!m5805() || m5804().equals(c1736.m5804())) && this.f6006.equals(c1736.f6006) && getUnknownFields().equals(c1736.getUnknownFields()) && m29575().equals(c1736.m29575());
        }
        return false;
    }

    @Override // l.AbstractC8709
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C10702.f32219.hashCode() + 779;
        if (m5808()) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + C13997.m33481(this.f6010);
        }
        if (m5809()) {
            iHashCode = C4153.m12551(iHashCode, 37, 3, 53) + C13997.m33481(this.f6004);
        }
        if (m5802()) {
            iHashCode = C4153.m12551(iHashCode, 37, 6, 53) + C13997.m33481(this.f6005);
        }
        if (m5805()) {
            iHashCode = C4153.m12551(iHashCode, 37, 7, 53) + m5804().hashCode();
        }
        if (this.f6006.size() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, EnumC3478.f11008, 53) + this.f6006.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC8709.m22494(iHashCode, m29575()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C7711 newBuilder() {
        return f6002.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return f6002.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 newBuilderForType() {
        return f6002.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C7711 toBuilder() {
        int i = 0;
        if (this == f6002) {
            return new C7711(i);
        }
        C7711 c7711 = new C7711(i);
        c7711.m20628(this);
        return c7711;
    }

    @Override // l.AbstractC8709
    public final InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C7711(interfaceC9415, 0);
    }

    public static C1736 getDefaultInstance() {
        return f6002;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f6003;
    }

    @Override // l.AbstractC12154, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f6002;
    }

    @Override // l.AbstractC12154, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return f6002;
    }
}
