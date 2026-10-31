package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩶᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20412 extends AbstractC4121 implements InterfaceC3583 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12050 f65852;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final C20412 f65853;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public List f65854;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f65855;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public List f65856;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public List f65857;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C16736 f65858;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile Object f65859;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte f65860;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public List f65861;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f65862;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f65863;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public List f65864;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C2731 f65865;

    static {
        C20663.m47279(EnumC6551.PUBLIC, C20412.class.getName());
        f65853 = new C20412();
        f65852 = new C19707();
    }

    public C20412(C0655 c0655, int i) {
        super(c0655);
        this.f65859 = "";
        this.f65865 = C2731.m8466();
        this.f65860 = (byte) -1;
    }

    public C20412() {
        this.f65859 = "";
        this.f65865 = C2731.m8466();
        this.f65860 = (byte) -1;
        this.f65859 = "";
        List list = Collections.EMPTY_LIST;
        this.f65854 = list;
        this.f65855 = list;
        this.f65857 = list;
        this.f65864 = list;
        this.f65862 = list;
        this.f65856 = list;
        this.f65861 = list;
        this.f65865 = C2731.m8466();
    }

    @Override // l.AbstractC4121
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32230;
        c9766.m24773(C20412.class, C0655.class);
        return c9766;
    }

    public final boolean hasName() {
        return (this.f65863 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f65859;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f65859 = strM16501;
        }
        return strM16501;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m46761() {
        return this.f65854.size();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20766 m46762(int i) {
        return (C20766) this.f65854.get(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m46767() {
        return this.f65855.size();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20766 m46760(int i) {
        return (C20766) this.f65855.get(i);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m46755() {
        return this.f65857.size();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C20412 m46764(int i) {
        return (C20412) this.f65857.get(i);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m46757() {
        return this.f65864.size();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23233 m46754(int i) {
        return (C23233) this.f65864.get(i);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final List m46758() {
        return this.f65862;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m46759() {
        return this.f65862.size();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m46756() {
        return this.f65856.size();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C4037 m46763(int i) {
        return (C4037) this.f65856.get(i);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m46766() {
        return (this.f65863 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C16736 m46765() {
        C16736 c16736 = this.f65858;
        return c16736 == null ? C16736.getDefaultInstance() : c16736;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        byte b = this.f65860;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f65854.size(); i++) {
            if (!m46762(i).isInitialized()) {
                this.f65860 = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.f65855.size(); i2++) {
            if (!m46760(i2).isInitialized()) {
                this.f65860 = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f65857.size(); i3++) {
            if (!m46764(i3).isInitialized()) {
                this.f65860 = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.f65864.size(); i4++) {
            if (!m46754(i4).isInitialized()) {
                this.f65860 = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < this.f65862.size(); i5++) {
            if (!((C8417) this.f65862.get(i5)).isInitialized()) {
                this.f65860 = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.f65856.size(); i6++) {
            if (!m46763(i6).isInitialized()) {
                this.f65860 = (byte) 0;
                return false;
            }
        }
        if (m46766() && !m46765().isInitialized()) {
            this.f65860 = (byte) 0;
            return false;
        }
        this.f65860 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        if ((this.f65863 & 1) != 0) {
            AbstractC4121.m12380(abstractC14766, 1, this.f65859);
        }
        for (int i = 0; i < this.f65854.size(); i++) {
            abstractC14766.mo35104(2, (InterfaceC8522) this.f65854.get(i));
        }
        for (int i2 = 0; i2 < this.f65857.size(); i2++) {
            abstractC14766.mo35104(3, (InterfaceC8522) this.f65857.get(i2));
        }
        for (int i3 = 0; i3 < this.f65864.size(); i3++) {
            abstractC14766.mo35104(4, (InterfaceC8522) this.f65864.get(i3));
        }
        for (int i4 = 0; i4 < this.f65862.size(); i4++) {
            abstractC14766.mo35104(5, (InterfaceC8522) this.f65862.get(i4));
        }
        for (int i5 = 0; i5 < this.f65855.size(); i5++) {
            abstractC14766.mo35104(6, (InterfaceC8522) this.f65855.get(i5));
        }
        if ((this.f65863 & 2) != 0) {
            abstractC14766.mo35104(7, m46765());
        }
        for (int i6 = 0; i6 < this.f65856.size(); i6++) {
            abstractC14766.mo35104(8, (InterfaceC8522) this.f65856.get(i6));
        }
        for (int i7 = 0; i7 < this.f65861.size(); i7++) {
            abstractC14766.mo35104(9, (InterfaceC8522) this.f65861.get(i7));
        }
        for (int i8 = 0; i8 < this.f65865.size(); i8++) {
            AbstractC4121.m12380(abstractC14766, 10, this.f65865.mo8472(i8));
        }
        getUnknownFields().writeTo(abstractC14766);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM12365 = (this.f65863 & 1) != 0 ? AbstractC4121.m12365(1, this.f65859) : 0;
        for (int i2 = 0; i2 < this.f65854.size(); i2++) {
            iM12365 += AbstractC14766.m35082(2, (InterfaceC8522) this.f65854.get(i2));
        }
        for (int i3 = 0; i3 < this.f65857.size(); i3++) {
            iM12365 += AbstractC14766.m35082(3, (InterfaceC8522) this.f65857.get(i3));
        }
        for (int i4 = 0; i4 < this.f65864.size(); i4++) {
            iM12365 += AbstractC14766.m35082(4, (InterfaceC8522) this.f65864.get(i4));
        }
        for (int i5 = 0; i5 < this.f65862.size(); i5++) {
            iM12365 += AbstractC14766.m35082(5, (InterfaceC8522) this.f65862.get(i5));
        }
        for (int i6 = 0; i6 < this.f65855.size(); i6++) {
            iM12365 += AbstractC14766.m35082(6, (InterfaceC8522) this.f65855.get(i6));
        }
        if ((this.f65863 & 2) != 0) {
            iM12365 += AbstractC14766.m35082(7, m46765());
        }
        for (int i7 = 0; i7 < this.f65856.size(); i7++) {
            iM12365 += AbstractC14766.m35082(8, (InterfaceC8522) this.f65856.get(i7));
        }
        for (int i8 = 0; i8 < this.f65861.size(); i8++) {
            iM12365 += AbstractC14766.m35082(9, (InterfaceC8522) this.f65861.get(i8));
        }
        int iM12395 = 0;
        for (int i9 = 0; i9 < this.f65865.size(); i9++) {
            iM12395 += AbstractC4121.m12395(this.f65865.mo8472(i9));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + this.f65865.size() + iM12365 + iM12395;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC8709
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C20412)) {
            return super.equals(obj);
        }
        C20412 c20412 = (C20412) obj;
        if (hasName() != c20412.hasName()) {
            return false;
        }
        if ((!hasName() || getName().equals(c20412.getName())) && this.f65854.equals(c20412.f65854) && this.f65855.equals(c20412.f65855) && this.f65857.equals(c20412.f65857) && this.f65864.equals(c20412.f65864) && this.f65862.equals(c20412.f65862) && this.f65856.equals(c20412.f65856) && m46766() == c20412.m46766()) {
            return (!m46766() || m46765().equals(c20412.m46765())) && this.f65861.equals(c20412.f65861) && this.f65865.equals(c20412.f65865) && getUnknownFields().equals(c20412.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC8709
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C10702.f32273.hashCode() + 779;
        if (hasName()) {
            iHashCode = C4153.m12551(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (this.f65854.size() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + this.f65854.hashCode();
        }
        if (this.f65855.size() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, 6, 53) + this.f65855.hashCode();
        }
        if (this.f65857.size() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, 3, 53) + this.f65857.hashCode();
        }
        if (this.f65864.size() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, 4, 53) + this.f65864.hashCode();
        }
        if (this.f65862.size() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, 5, 53) + this.f65862.hashCode();
        }
        if (this.f65856.size() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, 8, 53) + this.f65856.hashCode();
        }
        if (m46766()) {
            iHashCode = C4153.m12551(iHashCode, 37, 7, 53) + m46765().hashCode();
        }
        if (this.f65861.size() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, 9, 53) + this.f65861.hashCode();
        }
        if (this.f65865.size() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, 10, 53) + this.f65865.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C0655 newBuilder() {
        return f65853.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return f65853.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 newBuilderForType() {
        return f65853.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C0655 toBuilder() {
        int i = 0;
        if (this == f65853) {
            return new C0655(i);
        }
        C0655 c0655 = new C0655(i);
        c0655.m2685(this);
        return c0655;
    }

    @Override // l.AbstractC8709
    public final InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C0655(interfaceC9415, 0);
    }

    public static C20412 getDefaultInstance() {
        return f65853;
    }

    public static InterfaceC12050 parser() {
        return f65852;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f65852;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f65853;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return f65853;
    }
}
