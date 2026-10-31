package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.۠ܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8270 extends AbstractC4121 implements InterfaceC3583 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12050 f25432;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C8270 f25433;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C22381 f25434;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile Object f25435;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f25436;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f25437;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte f25438;

    static {
        C20663.m47279(EnumC6551.PUBLIC, C8270.class.getName());
        f25433 = new C8270();
        f25432 = new C5448();
    }

    public C8270(C1214 c1214, int i) {
        super(c1214);
        this.f25435 = "";
        this.f25438 = (byte) -1;
    }

    public C8270() {
        this.f25435 = "";
        this.f25438 = (byte) -1;
        this.f25435 = "";
        this.f25436 = Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC4121
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32228;
        c9766.m24773(C8270.class, C1214.class);
        return c9766;
    }

    public final boolean hasName() {
        return (this.f25437 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f25435;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f25435 = strM16501;
        }
        return strM16501;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m21875() {
        return this.f25436.size();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14619 m21874(int i) {
        return (C14619) this.f25436.get(i);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m21876() {
        return (this.f25437 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C22381 m21877() {
        C22381 c22381 = this.f25434;
        return c22381 == null ? C22381.getDefaultInstance() : c22381;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        byte b = this.f25438;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f25436.size(); i++) {
            if (!m21874(i).isInitialized()) {
                this.f25438 = (byte) 0;
                return false;
            }
        }
        if (m21876() && !m21877().isInitialized()) {
            this.f25438 = (byte) 0;
            return false;
        }
        this.f25438 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        if ((this.f25437 & 1) != 0) {
            AbstractC4121.m12380(abstractC14766, 1, this.f25435);
        }
        for (int i = 0; i < this.f25436.size(); i++) {
            abstractC14766.mo35104(2, (InterfaceC8522) this.f25436.get(i));
        }
        if ((this.f25437 & 2) != 0) {
            abstractC14766.mo35104(3, m21877());
        }
        getUnknownFields().writeTo(abstractC14766);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM12365 = (this.f25437 & 1) != 0 ? AbstractC4121.m12365(1, this.f25435) : 0;
        for (int i2 = 0; i2 < this.f25436.size(); i2++) {
            iM12365 += AbstractC14766.m35082(2, (InterfaceC8522) this.f25436.get(i2));
        }
        if ((this.f25437 & 2) != 0) {
            iM12365 += AbstractC14766.m35082(3, m21877());
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM12365;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC8709
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8270)) {
            return super.equals(obj);
        }
        C8270 c8270 = (C8270) obj;
        if (hasName() != c8270.hasName()) {
            return false;
        }
        if ((!hasName() || getName().equals(c8270.getName())) && this.f25436.equals(c8270.f25436) && m21876() == c8270.m21876()) {
            return (!m21876() || m21877().equals(c8270.m21877())) && getUnknownFields().equals(c8270.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC8709
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C10702.f32214.hashCode() + 779;
        if (hasName()) {
            iHashCode = C4153.m12551(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (this.f25436.size() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + this.f25436.hashCode();
        }
        if (m21876()) {
            iHashCode = C4153.m12551(iHashCode, 37, 3, 53) + m21877().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C1214 newBuilder() {
        return f25433.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return f25433.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 newBuilderForType() {
        return f25433.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C1214 toBuilder() {
        int i = 0;
        if (this == f25433) {
            return new C1214(i);
        }
        C1214 c1214 = new C1214(i);
        c1214.m4056(this);
        return c1214;
    }

    @Override // l.AbstractC8709
    public final InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C1214(interfaceC9415, 0);
    }

    public static C8270 getDefaultInstance() {
        return f25433;
    }

    public static InterfaceC12050 parser() {
        return f25432;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f25432;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f25433;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return f25433;
    }
}
