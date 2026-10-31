package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23608 extends AbstractC12154 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C23608 f76520;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12050 f76521;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C1009 f76522;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f76523;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public List f76524;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte f76525;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C5969 f76526;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f76527;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f76528;

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        C12859 c12859 = new C12859(this);
        if ((this.f76528 & 1) != 0) {
            abstractC14766.mo35093(1, this.f76523);
        }
        if ((this.f76528 & 2) != 0) {
            abstractC14766.mo35104(2, m52096());
        }
        if ((this.f76528 & 4) != 0) {
            abstractC14766.mo35093(3, this.f76527);
        }
        if ((this.f76528 & 8) != 0) {
            abstractC14766.mo35104(4, m52095());
        }
        for (int i = 0; i < this.f76524.size(); i++) {
            abstractC14766.mo35104(EnumC3478.f11008, (InterfaceC8522) this.f76524.get(i));
        }
        c12859.m31295(536870912, abstractC14766);
        getUnknownFields().writeTo(abstractC14766);
    }

    static {
        C20663.m47279(EnumC6551.PUBLIC, C23608.class.getName());
        f76520 = new C23608();
        f76521 = new C17258();
    }

    public C23608(C14435 c14435) {
        super(c14435);
        this.f76523 = false;
        this.f76527 = false;
        this.f76525 = (byte) -1;
    }

    public C23608() {
        this.f76523 = false;
        this.f76527 = false;
        this.f76525 = (byte) -1;
        this.f76524 = Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC4121
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32227;
        c9766.m24773(C23608.class, C14435.class);
        return c9766;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m52101() {
        return (this.f76528 & 1) != 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m52099() {
        return this.f76523;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m52097() {
        return (this.f76528 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C5969 m52096() {
        C5969 c5969 = this.f76526;
        return c5969 == null ? C5969.getDefaultInstance() : c5969;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m52100() {
        return (this.f76528 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m52098() {
        return this.f76527;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m52094() {
        return (this.f76528 & 8) != 0;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C1009 m52095() {
        C1009 c1009 = this.f76522;
        return c1009 == null ? C1009.getDefaultInstance() : c1009;
    }

    @Override // l.AbstractC12154, l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        byte b = this.f76525;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m52097() || m52096().isInitialized()) {
            for (int i = 0; i < this.f76524.size(); i++) {
                if (!((C1529) this.f76524.get(i)).isInitialized()) {
                    this.f76525 = (byte) 0;
                    return false;
                }
            }
            if (!m29574()) {
                this.f76525 = (byte) 0;
                return false;
            }
            this.f76525 = (byte) 1;
            return true;
        }
        this.f76525 = (byte) 0;
        return false;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35080 = (this.f76528 & 1) != 0 ? AbstractC14766.m35080(1) : 0;
        if ((this.f76528 & 2) != 0) {
            iM35080 += AbstractC14766.m35082(2, m52096());
        }
        if ((this.f76528 & 4) != 0) {
            iM35080 += AbstractC14766.m35080(3);
        }
        if ((this.f76528 & 8) != 0) {
            iM35080 += AbstractC14766.m35082(4, m52095());
        }
        for (int i2 = 0; i2 < this.f76524.size(); i2++) {
            iM35080 += AbstractC14766.m35082(EnumC3478.f11008, (InterfaceC8522) this.f76524.get(i2));
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
        if (!(obj instanceof C23608)) {
            return super.equals(obj);
        }
        C23608 c23608 = (C23608) obj;
        if (m52101() != c23608.m52101()) {
            return false;
        }
        if ((m52101() && this.f76523 != c23608.f76523) || m52097() != c23608.m52097()) {
            return false;
        }
        if ((m52097() && !m52096().equals(c23608.m52096())) || m52100() != c23608.m52100()) {
            return false;
        }
        if ((!m52100() || this.f76527 == c23608.f76527) && m52094() == c23608.m52094()) {
            return (!m52094() || m52095().equals(c23608.m52095())) && this.f76524.equals(c23608.f76524) && getUnknownFields().equals(c23608.getUnknownFields()) && m29575().equals(c23608.m29575());
        }
        return false;
    }

    @Override // l.AbstractC8709
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C10702.f32213.hashCode() + 779;
        if (m52101()) {
            iHashCode = C4153.m12551(iHashCode, 37, 1, 53) + C13997.m33481(this.f76523);
        }
        if (m52097()) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + m52096().hashCode();
        }
        if (m52100()) {
            iHashCode = C4153.m12551(iHashCode, 37, 3, 53) + C13997.m33481(this.f76527);
        }
        if (m52094()) {
            iHashCode = C4153.m12551(iHashCode, 37, 4, 53) + m52095().hashCode();
        }
        if (this.f76524.size() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, EnumC3478.f11008, 53) + this.f76524.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC8709.m22494(iHashCode, m29575()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C14435 newBuilder() {
        return f76520.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return f76520.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 newBuilderForType() {
        return f76520.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C14435 toBuilder() {
        int i = 0;
        if (this == f76520) {
            return new C14435(i);
        }
        C14435 c14435 = new C14435(i);
        c14435.m34463(this);
        return c14435;
    }

    @Override // l.AbstractC8709
    public final InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C14435(interfaceC9415, 0);
    }

    public static C23608 getDefaultInstance() {
        return f76520;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f76521;
    }

    @Override // l.AbstractC12154, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f76520;
    }

    @Override // l.AbstractC12154, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return f76520;
    }
}
