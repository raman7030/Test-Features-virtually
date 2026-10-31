package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֫ۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1529 extends AbstractC4121 implements InterfaceC3583 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C1529 f5401;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12050 f5402;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public byte f5403;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile Object f5404;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public AbstractC5886 f5405;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f5406;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f5407;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public List f5408;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public double f5409;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile Object f5410;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f5411;

    static {
        C20663.m47279(EnumC6551.PUBLIC, C1529.class.getName());
        f5401 = new C1529();
        f5402 = new C6153();
    }

    public C1529(C11798 c11798, int i) {
        super(c11798);
        this.f5404 = "";
        this.f5406 = 0L;
        this.f5407 = 0L;
        this.f5409 = 0.0d;
        this.f5405 = AbstractC5886.f18080;
        this.f5410 = "";
        this.f5403 = (byte) -1;
    }

    public C1529() {
        this.f5404 = "";
        this.f5406 = 0L;
        this.f5407 = 0L;
        this.f5409 = 0.0d;
        AbstractC5886 abstractC5886 = AbstractC5886.f18080;
        this.f5405 = abstractC5886;
        this.f5410 = "";
        this.f5403 = (byte) -1;
        this.f5408 = Collections.EMPTY_LIST;
        this.f5404 = "";
        this.f5405 = abstractC5886;
        this.f5410 = "";
    }

    @Override // l.AbstractC4121
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32244;
        c9766.m24773(C1529.class, C11798.class);
        return c9766;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m5236() {
        return (this.f5411 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m5233() {
        Object obj = this.f5404;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f5404 = strM16501;
        }
        return strM16501;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m5230() {
        return (this.f5411 & 2) != 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long m5234() {
        return this.f5406;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m5226() {
        return (this.f5411 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long m5232() {
        return this.f5407;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m5235() {
        return (this.f5411 & 8) != 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final double m5237() {
        return this.f5409;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m5227() {
        return (this.f5411 & 16) != 0;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC5886 m5228() {
        return this.f5405;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m5229() {
        return (this.f5411 & 32) != 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m5231() {
        Object obj = this.f5410;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f5410 = strM16501;
        }
        return strM16501;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        byte b = this.f5403;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f5408.size(); i++) {
            if (!((C7564) this.f5408.get(i)).isInitialized()) {
                this.f5403 = (byte) 0;
                return false;
            }
        }
        this.f5403 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        for (int i = 0; i < this.f5408.size(); i++) {
            abstractC14766.mo35104(2, (InterfaceC8522) this.f5408.get(i));
        }
        if ((this.f5411 & 1) != 0) {
            AbstractC4121.m12380(abstractC14766, 3, this.f5404);
        }
        if ((this.f5411 & 2) != 0) {
            abstractC14766.mo35102(4, this.f5406);
        }
        if ((this.f5411 & 4) != 0) {
            abstractC14766.mo35102(5, this.f5407);
        }
        if ((this.f5411 & 8) != 0) {
            double d = this.f5409;
            abstractC14766.getClass();
            abstractC14766.mo35088(6, Double.doubleToRawLongBits(d));
        }
        if ((this.f5411 & 16) != 0) {
            abstractC14766.mo35090(7, this.f5405);
        }
        if ((this.f5411 & 32) != 0) {
            AbstractC4121.m12380(abstractC14766, 8, this.f5410);
        }
        getUnknownFields().writeTo(abstractC14766);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM12365 = 0;
        for (int i2 = 0; i2 < this.f5408.size(); i2++) {
            iM12365 += AbstractC14766.m35082(2, (InterfaceC8522) this.f5408.get(i2));
        }
        if ((this.f5411 & 1) != 0) {
            iM12365 += AbstractC4121.m12365(3, this.f5404);
        }
        if ((this.f5411 & 2) != 0) {
            iM12365 += AbstractC14766.m35081(4, this.f5406);
        }
        if ((this.f5411 & 4) != 0) {
            iM12365 += AbstractC14766.m35075(5, this.f5407);
        }
        if ((this.f5411 & 8) != 0) {
            iM12365 += AbstractC14766.m35073(6) + 8;
        }
        if ((this.f5411 & 16) != 0) {
            iM12365 += AbstractC14766.m35076(7, this.f5405);
        }
        if ((this.f5411 & 32) != 0) {
            iM12365 += AbstractC4121.m12365(8, this.f5410);
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
        if (!(obj instanceof C1529)) {
            return super.equals(obj);
        }
        C1529 c1529 = (C1529) obj;
        if (!this.f5408.equals(c1529.f5408) || m5236() != c1529.m5236()) {
            return false;
        }
        if ((m5236() && !m5233().equals(c1529.m5233())) || m5230() != c1529.m5230()) {
            return false;
        }
        if ((m5230() && this.f5406 != c1529.f5406) || m5226() != c1529.m5226()) {
            return false;
        }
        if ((m5226() && this.f5407 != c1529.f5407) || m5235() != c1529.m5235()) {
            return false;
        }
        if ((m5235() && Double.doubleToLongBits(this.f5409) != Double.doubleToLongBits(c1529.f5409)) || m5227() != c1529.m5227()) {
            return false;
        }
        if ((!m5227() || this.f5405.equals(c1529.f5405)) && m5229() == c1529.m5229()) {
            return (!m5229() || m5231().equals(c1529.m5231())) && getUnknownFields().equals(c1529.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC8709
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C10702.f32246.hashCode() + 779;
        if (this.f5408.size() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + this.f5408.hashCode();
        }
        if (m5236()) {
            iHashCode = C4153.m12551(iHashCode, 37, 3, 53) + m5233().hashCode();
        }
        if (m5230()) {
            iHashCode = C4153.m12551(iHashCode, 37, 4, 53) + C13997.m33480(this.f5406);
        }
        if (m5226()) {
            iHashCode = C4153.m12551(iHashCode, 37, 5, 53) + C13997.m33480(this.f5407);
        }
        if (m5235()) {
            iHashCode = C4153.m12551(iHashCode, 37, 6, 53) + C13997.m33480(Double.doubleToLongBits(this.f5409));
        }
        if (m5227()) {
            iHashCode = C4153.m12551(iHashCode, 37, 7, 53) + this.f5405.hashCode();
        }
        if (m5229()) {
            iHashCode = C4153.m12551(iHashCode, 37, 8, 53) + m5231().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C11798 newBuilder() {
        return f5401.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return f5401.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 newBuilderForType() {
        return f5401.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C11798 toBuilder() {
        int i = 0;
        if (this == f5401) {
            return new C11798(i);
        }
        C11798 c11798 = new C11798(i);
        c11798.m28853(this);
        return c11798;
    }

    @Override // l.AbstractC8709
    public final InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C11798(interfaceC9415, 0);
    }

    public static C1529 getDefaultInstance() {
        return f5401;
    }

    public static InterfaceC12050 parser() {
        return f5402;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f5402;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f5401;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return f5401;
    }
}
