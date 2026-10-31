package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۗۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3126 extends AbstractC12154 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final C3126 f9769;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f9770 = 0;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12050 f9771;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public List f9772;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f9773;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f9774;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f9775;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f9776;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C5969 f9777;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public List f9778;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f9779;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C1009 f9780;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public List f9781;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f9782;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public boolean f9783;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public boolean f9784;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f9785;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f9786;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public byte f9787;

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        C12859 c12859 = new C12859(this);
        if ((this.f9786 & 1) != 0) {
            abstractC14766.mo35101(1, this.f9785);
        }
        if ((this.f9786 & 2) != 0) {
            abstractC14766.mo35093(2, this.f9782);
        }
        if ((this.f9786 & 32) != 0) {
            abstractC14766.mo35093(3, this.f9773);
        }
        if ((this.f9786 & 8) != 0) {
            abstractC14766.mo35093(5, this.f9779);
        }
        if ((this.f9786 & 4) != 0) {
            abstractC14766.mo35101(6, this.f9775);
        }
        if ((this.f9786 & 64) != 0) {
            abstractC14766.mo35093(10, this.f9784);
        }
        if ((this.f9786 & 16) != 0) {
            abstractC14766.mo35093(15, this.f9783);
        }
        if ((this.f9786 & 128) != 0) {
            abstractC14766.mo35093(16, this.f9774);
        }
        if ((this.f9786 & 256) != 0) {
            abstractC14766.mo35101(17, this.f9776);
        }
        for (int i = 0; i < this.f9772.size(); i++) {
            abstractC14766.mo35101(19, ((Integer) this.f9772.get(i)).intValue());
        }
        for (int i2 = 0; i2 < this.f9781.size(); i2++) {
            abstractC14766.mo35104(20, (InterfaceC8522) this.f9781.get(i2));
        }
        if ((this.f9786 & 512) != 0) {
            abstractC14766.mo35104(21, m9548());
        }
        if ((this.f9786 & 1024) != 0) {
            abstractC14766.mo35104(22, m9536());
        }
        for (int i3 = 0; i3 < this.f9778.size(); i3++) {
            abstractC14766.mo35104(EnumC3478.f11008, (InterfaceC8522) this.f9778.get(i3));
        }
        c12859.m31295(536870912, abstractC14766);
        getUnknownFields().writeTo(abstractC14766);
    }

    static {
        C20663.m47279(EnumC6551.PUBLIC, C3126.class.getName());
        f9769 = new C3126();
        f9771 = new C9477();
    }

    public C3126(C8771 c8771) {
        super(c8771);
        this.f9785 = 0;
        this.f9782 = false;
        this.f9775 = 0;
        this.f9779 = false;
        this.f9783 = false;
        this.f9773 = false;
        this.f9784 = false;
        this.f9774 = false;
        this.f9776 = 0;
        this.f9787 = (byte) -1;
    }

    public C3126() {
        this.f9782 = false;
        this.f9779 = false;
        this.f9783 = false;
        this.f9773 = false;
        this.f9784 = false;
        this.f9774 = false;
        this.f9787 = (byte) -1;
        this.f9785 = 0;
        this.f9775 = 0;
        this.f9776 = 0;
        List list = Collections.EMPTY_LIST;
        this.f9772 = list;
        this.f9781 = list;
        this.f9778 = list;
    }

    @Override // l.AbstractC4121
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32241;
        c9766.m24773(C3126.class, C8771.class);
        return c9766;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m9551() {
        return (this.f9786 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final EnumC2421 m9541() {
        EnumC2421 enumC2421M7847 = EnumC2421.m7847(this.f9785);
        return enumC2421M7847 == null ? EnumC2421.STRING : enumC2421M7847;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m9542() {
        return (this.f9786 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m9538() {
        return this.f9782;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m9545() {
        return (this.f9786 & 4) != 0;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final EnumC15119 m9549() {
        EnumC15119 enumC15119M35814 = EnumC15119.m35814(this.f9775);
        return enumC15119M35814 == null ? EnumC15119.JS_NORMAL : enumC15119M35814;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m9544() {
        return (this.f9786 & 8) != 0;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m9532() {
        return this.f9779;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m9543() {
        return (this.f9786 & 16) != 0;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m9540() {
        return this.f9783;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m9550() {
        return (this.f9786 & 32) != 0;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m9534() {
        return this.f9773;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m9553() {
        return (this.f9786 & 64) != 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m9546() {
        return this.f9784;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m9552() {
        return (this.f9786 & 128) != 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m9547() {
        return this.f9774;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m9539() {
        return (this.f9786 & 256) != 0;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final EnumC22176 m9533() {
        EnumC22176 enumC22176M49816 = EnumC22176.m49816(this.f9776);
        return enumC22176M49816 == null ? EnumC22176.RETENTION_UNKNOWN : enumC22176M49816;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m9535() {
        return (this.f9786 & 512) != 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C5969 m9548() {
        C5969 c5969 = this.f9777;
        return c5969 == null ? C5969.getDefaultInstance() : c5969;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m9537() {
        return (this.f9786 & 1024) != 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C1009 m9536() {
        C1009 c1009 = this.f9780;
        return c1009 == null ? C1009.getDefaultInstance() : c1009;
    }

    @Override // l.AbstractC12154, l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        byte b = this.f9787;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m9535() || m9548().isInitialized()) {
            for (int i = 0; i < this.f9778.size(); i++) {
                if (!((C1529) this.f9778.get(i)).isInitialized()) {
                    this.f9787 = (byte) 0;
                    return false;
                }
            }
            if (!m29574()) {
                this.f9787 = (byte) 0;
                return false;
            }
            this.f9787 = (byte) 1;
            return true;
        }
        this.f9787 = (byte) 0;
        return false;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35079 = (this.f9786 & 1) != 0 ? AbstractC14766.m35079(1, this.f9785) : 0;
        if ((this.f9786 & 2) != 0) {
            iM35079 += AbstractC14766.m35080(2);
        }
        if ((this.f9786 & 32) != 0) {
            iM35079 += AbstractC14766.m35080(3);
        }
        if ((this.f9786 & 8) != 0) {
            iM35079 += AbstractC14766.m35080(5);
        }
        if ((this.f9786 & 4) != 0) {
            iM35079 += AbstractC14766.m35079(6, this.f9775);
        }
        if ((this.f9786 & 64) != 0) {
            iM35079 += AbstractC14766.m35080(10);
        }
        if ((this.f9786 & 16) != 0) {
            iM35079 += AbstractC14766.m35080(15);
        }
        if ((this.f9786 & 128) != 0) {
            iM35079 += AbstractC14766.m35080(16);
        }
        if ((this.f9786 & 256) != 0) {
            iM35079 += AbstractC14766.m35079(17, this.f9776);
        }
        int iM35077 = 0;
        for (int i2 = 0; i2 < this.f9772.size(); i2++) {
            iM35077 += AbstractC14766.m35077(((Integer) this.f9772.get(i2)).intValue());
        }
        int size = (this.f9772.size() * 2) + iM35079 + iM35077;
        for (int i3 = 0; i3 < this.f9781.size(); i3++) {
            size += AbstractC14766.m35082(20, (InterfaceC8522) this.f9781.get(i3));
        }
        if ((this.f9786 & 512) != 0) {
            size += AbstractC14766.m35082(21, m9548());
        }
        if ((this.f9786 & 1024) != 0) {
            size += AbstractC14766.m35082(22, m9536());
        }
        for (int i4 = 0; i4 < this.f9778.size(); i4++) {
            size += AbstractC14766.m35082(EnumC3478.f11008, (InterfaceC8522) this.f9778.get(i4));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + size + m29577();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC8709
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3126)) {
            return super.equals(obj);
        }
        C3126 c3126 = (C3126) obj;
        if (m9551() != c3126.m9551()) {
            return false;
        }
        if ((m9551() && this.f9785 != c3126.f9785) || m9542() != c3126.m9542()) {
            return false;
        }
        if ((m9542() && this.f9782 != c3126.f9782) || m9545() != c3126.m9545()) {
            return false;
        }
        if ((m9545() && this.f9775 != c3126.f9775) || m9544() != c3126.m9544()) {
            return false;
        }
        if ((m9544() && this.f9779 != c3126.f9779) || m9543() != c3126.m9543()) {
            return false;
        }
        if ((m9543() && this.f9783 != c3126.f9783) || m9550() != c3126.m9550()) {
            return false;
        }
        if ((m9550() && this.f9773 != c3126.f9773) || m9553() != c3126.m9553()) {
            return false;
        }
        if ((m9553() && this.f9784 != c3126.f9784) || m9552() != c3126.m9552()) {
            return false;
        }
        if ((m9552() && this.f9774 != c3126.f9774) || m9539() != c3126.m9539()) {
            return false;
        }
        if ((m9539() && this.f9776 != c3126.f9776) || !this.f9772.equals(c3126.f9772) || !this.f9781.equals(c3126.f9781) || m9535() != c3126.m9535()) {
            return false;
        }
        if ((!m9535() || m9548().equals(c3126.m9548())) && m9537() == c3126.m9537()) {
            return (!m9537() || m9536().equals(c3126.m9536())) && this.f9778.equals(c3126.f9778) && getUnknownFields().equals(c3126.getUnknownFields()) && m29575().equals(c3126.m29575());
        }
        return false;
    }

    @Override // l.AbstractC8709
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C10702.f32218.hashCode() + 779;
        if (m9551()) {
            iHashCode = C4153.m12551(iHashCode, 37, 1, 53) + this.f9785;
        }
        if (m9542()) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + C13997.m33481(this.f9782);
        }
        if (m9545()) {
            iHashCode = C4153.m12551(iHashCode, 37, 6, 53) + this.f9775;
        }
        if (m9544()) {
            iHashCode = C4153.m12551(iHashCode, 37, 5, 53) + C13997.m33481(this.f9779);
        }
        if (m9543()) {
            iHashCode = C4153.m12551(iHashCode, 37, 15, 53) + C13997.m33481(this.f9783);
        }
        if (m9550()) {
            iHashCode = C4153.m12551(iHashCode, 37, 3, 53) + C13997.m33481(this.f9773);
        }
        if (m9553()) {
            iHashCode = C4153.m12551(iHashCode, 37, 10, 53) + C13997.m33481(this.f9784);
        }
        if (m9552()) {
            iHashCode = C4153.m12551(iHashCode, 37, 16, 53) + C13997.m33481(this.f9774);
        }
        if (m9539()) {
            iHashCode = C4153.m12551(iHashCode, 37, 17, 53) + this.f9776;
        }
        if (this.f9772.size() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, 19, 53) + this.f9772.hashCode();
        }
        if (this.f9781.size() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, 20, 53) + this.f9781.hashCode();
        }
        if (m9535()) {
            iHashCode = C4153.m12551(iHashCode, 37, 21, 53) + m9548().hashCode();
        }
        if (m9537()) {
            iHashCode = C4153.m12551(iHashCode, 37, 22, 53) + m9536().hashCode();
        }
        if (this.f9778.size() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, EnumC3478.f11008, 53) + this.f9778.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC8709.m22494(iHashCode, m29575()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C8771 newBuilder() {
        return f9769.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return f9769.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 newBuilderForType() {
        return f9769.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C8771 toBuilder() {
        int i = 0;
        if (this == f9769) {
            return new C8771(i);
        }
        C8771 c8771 = new C8771(i);
        c8771.m22663(this);
        return c8771;
    }

    @Override // l.AbstractC8709
    public final InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C8771(interfaceC9415, 0);
    }

    public static C3126 getDefaultInstance() {
        return f9769;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f9771;
    }

    @Override // l.AbstractC12154, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f9769;
    }

    @Override // l.AbstractC12154, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return f9769;
    }
}
