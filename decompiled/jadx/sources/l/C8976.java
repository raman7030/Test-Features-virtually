package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۡܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8976 extends AbstractC12154 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C8976 f27264;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f27265 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12050 f27266;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f27267;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5969 f27268;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f27269;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte f27270;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f27271;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f27272;

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        C12859 c12859 = new C12859(this);
        if ((this.f27272 & 1) != 0) {
            abstractC14766.mo35093(33, this.f27271);
        }
        if ((this.f27272 & 2) != 0) {
            abstractC14766.mo35101(34, this.f27267);
        }
        if ((this.f27272 & 4) != 0) {
            abstractC14766.mo35104(35, m23196());
        }
        for (int i = 0; i < this.f27269.size(); i++) {
            abstractC14766.mo35104(EnumC3478.f11008, (InterfaceC8522) this.f27269.get(i));
        }
        c12859.m31295(536870912, abstractC14766);
        getUnknownFields().writeTo(abstractC14766);
    }

    static {
        C20663.m47279(EnumC6551.PUBLIC, C8976.class.getName());
        f27264 = new C8976();
        f27266 = new C23792();
    }

    public C8976(C6859 c6859) {
        super(c6859);
        this.f27271 = false;
        this.f27267 = 0;
        this.f27270 = (byte) -1;
    }

    public C8976() {
        this.f27271 = false;
        this.f27270 = (byte) -1;
        this.f27267 = 0;
        this.f27269 = Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC4121
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32253;
        c9766.m24773(C8976.class, C6859.class);
        return c9766;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m23194() {
        return (this.f27272 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m23195() {
        return this.f27271;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m23198() {
        return (this.f27272 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final EnumC9682 m23193() {
        EnumC9682 enumC9682M24620 = EnumC9682.m24620(this.f27267);
        return enumC9682M24620 == null ? EnumC9682.IDEMPOTENCY_UNKNOWN : enumC9682M24620;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m23197() {
        return (this.f27272 & 4) != 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C5969 m23196() {
        C5969 c5969 = this.f27268;
        return c5969 == null ? C5969.getDefaultInstance() : c5969;
    }

    @Override // l.AbstractC12154, l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        byte b = this.f27270;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m23197() || m23196().isInitialized()) {
            for (int i = 0; i < this.f27269.size(); i++) {
                if (!((C1529) this.f27269.get(i)).isInitialized()) {
                    this.f27270 = (byte) 0;
                    return false;
                }
            }
            if (!m29574()) {
                this.f27270 = (byte) 0;
                return false;
            }
            this.f27270 = (byte) 1;
            return true;
        }
        this.f27270 = (byte) 0;
        return false;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35080 = (this.f27272 & 1) != 0 ? AbstractC14766.m35080(33) : 0;
        if ((this.f27272 & 2) != 0) {
            iM35080 += AbstractC14766.m35079(34, this.f27267);
        }
        if ((this.f27272 & 4) != 0) {
            iM35080 += AbstractC14766.m35082(35, m23196());
        }
        for (int i2 = 0; i2 < this.f27269.size(); i2++) {
            iM35080 += AbstractC14766.m35082(EnumC3478.f11008, (InterfaceC8522) this.f27269.get(i2));
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
        if (!(obj instanceof C8976)) {
            return super.equals(obj);
        }
        C8976 c8976 = (C8976) obj;
        if (m23194() != c8976.m23194()) {
            return false;
        }
        if ((m23194() && this.f27271 != c8976.f27271) || m23198() != c8976.m23198()) {
            return false;
        }
        if ((!m23198() || this.f27267 == c8976.f27267) && m23197() == c8976.m23197()) {
            return (!m23197() || m23196().equals(c8976.m23196())) && this.f27269.equals(c8976.f27269) && getUnknownFields().equals(c8976.getUnknownFields()) && m29575().equals(c8976.m29575());
        }
        return false;
    }

    @Override // l.AbstractC8709
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C10702.f32236.hashCode() + 779;
        if (m23194()) {
            iHashCode = C4153.m12551(iHashCode, 37, 33, 53) + C13997.m33481(this.f27271);
        }
        if (m23198()) {
            iHashCode = C4153.m12551(iHashCode, 37, 34, 53) + this.f27267;
        }
        if (m23197()) {
            iHashCode = C4153.m12551(iHashCode, 37, 35, 53) + m23196().hashCode();
        }
        if (this.f27269.size() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, EnumC3478.f11008, 53) + this.f27269.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC8709.m22494(iHashCode, m29575()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C6859 newBuilder() {
        return f27264.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return f27264.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 newBuilderForType() {
        return f27264.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C6859 toBuilder() {
        int i = 0;
        if (this == f27264) {
            return new C6859(i);
        }
        C6859 c6859 = new C6859(i);
        c6859.m18546(this);
        return c6859;
    }

    @Override // l.AbstractC8709
    public final InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C6859(interfaceC9415, 0);
    }

    public static C8976 getDefaultInstance() {
        return f27264;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f27266;
    }

    @Override // l.AbstractC12154, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f27264;
    }

    @Override // l.AbstractC12154, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return f27264;
    }
}
