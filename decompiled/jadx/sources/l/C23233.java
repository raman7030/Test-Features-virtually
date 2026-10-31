package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩺᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23233 extends AbstractC4121 implements InterfaceC3583 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12050 f74650;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C23233 f74651;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C2731 f74652;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C1736 f74653;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f74654;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public List f74655;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile Object f74656;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f74657;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte f74658;

    static {
        C20663.m47279(EnumC6551.PUBLIC, C23233.class.getName());
        f74651 = new C23233();
        f74650 = new C13355();
    }

    public C23233(C12650 c12650, int i) {
        super(c12650);
        this.f74656 = "";
        this.f74652 = C2731.m8466();
        this.f74658 = (byte) -1;
    }

    public C23233() {
        this.f74656 = "";
        this.f74652 = C2731.m8466();
        this.f74658 = (byte) -1;
        this.f74656 = "";
        List list = Collections.EMPTY_LIST;
        this.f74654 = list;
        this.f74655 = list;
        this.f74652 = C2731.m8466();
    }

    @Override // l.AbstractC4121
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32252;
        c9766.m24773(C23233.class, C12650.class);
        return c9766;
    }

    public final boolean hasName() {
        return (this.f74657 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f74656;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f74656 = strM16501;
        }
        return strM16501;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m51559() {
        return this.f74654.size();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17964 m51556(int i) {
        return (C17964) this.f74654.get(i);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m51558() {
        return (this.f74657 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C1736 m51557() {
        C1736 c1736 = this.f74653;
        return c1736 == null ? C1736.getDefaultInstance() : c1736;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        byte b = this.f74658;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f74654.size(); i++) {
            if (!m51556(i).isInitialized()) {
                this.f74658 = (byte) 0;
                return false;
            }
        }
        if (m51558() && !m51557().isInitialized()) {
            this.f74658 = (byte) 0;
            return false;
        }
        this.f74658 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        if ((this.f74657 & 1) != 0) {
            AbstractC4121.m12380(abstractC14766, 1, this.f74656);
        }
        for (int i = 0; i < this.f74654.size(); i++) {
            abstractC14766.mo35104(2, (InterfaceC8522) this.f74654.get(i));
        }
        if ((this.f74657 & 2) != 0) {
            abstractC14766.mo35104(3, m51557());
        }
        for (int i2 = 0; i2 < this.f74655.size(); i2++) {
            abstractC14766.mo35104(4, (InterfaceC8522) this.f74655.get(i2));
        }
        for (int i3 = 0; i3 < this.f74652.size(); i3++) {
            AbstractC4121.m12380(abstractC14766, 5, this.f74652.mo8472(i3));
        }
        getUnknownFields().writeTo(abstractC14766);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM12365 = (this.f74657 & 1) != 0 ? AbstractC4121.m12365(1, this.f74656) : 0;
        for (int i2 = 0; i2 < this.f74654.size(); i2++) {
            iM12365 += AbstractC14766.m35082(2, (InterfaceC8522) this.f74654.get(i2));
        }
        if ((this.f74657 & 2) != 0) {
            iM12365 += AbstractC14766.m35082(3, m51557());
        }
        for (int i3 = 0; i3 < this.f74655.size(); i3++) {
            iM12365 += AbstractC14766.m35082(4, (InterfaceC8522) this.f74655.get(i3));
        }
        int iM12395 = 0;
        for (int i4 = 0; i4 < this.f74652.size(); i4++) {
            iM12395 += AbstractC4121.m12395(this.f74652.mo8472(i4));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + this.f74652.size() + iM12365 + iM12395;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC8709
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C23233)) {
            return super.equals(obj);
        }
        C23233 c23233 = (C23233) obj;
        if (hasName() != c23233.hasName()) {
            return false;
        }
        if ((!hasName() || getName().equals(c23233.getName())) && this.f74654.equals(c23233.f74654) && m51558() == c23233.m51558()) {
            return (!m51558() || m51557().equals(c23233.m51557())) && this.f74655.equals(c23233.f74655) && this.f74652.equals(c23233.f74652) && getUnknownFields().equals(c23233.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC8709
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C10702.f32235.hashCode() + 779;
        if (hasName()) {
            iHashCode = C4153.m12551(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (this.f74654.size() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + this.f74654.hashCode();
        }
        if (m51558()) {
            iHashCode = C4153.m12551(iHashCode, 37, 3, 53) + m51557().hashCode();
        }
        if (this.f74655.size() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, 4, 53) + this.f74655.hashCode();
        }
        if (this.f74652.size() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, 5, 53) + this.f74652.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C12650 newBuilder() {
        return f74651.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return f74651.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 newBuilderForType() {
        return f74651.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C12650 toBuilder() {
        int i = 0;
        if (this == f74651) {
            return new C12650(i);
        }
        C12650 c12650 = new C12650(i);
        c12650.m30931(this);
        return c12650;
    }

    @Override // l.AbstractC8709
    public final InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C12650(interfaceC9415, 0);
    }

    public static C23233 getDefaultInstance() {
        return f74651;
    }

    public static InterfaceC12050 parser() {
        return f74650;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f74650;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f74651;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return f74651;
    }
}
