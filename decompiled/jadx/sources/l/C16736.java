package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܽܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16736 extends AbstractC12154 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12050 f51371;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final C16736 f51372;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C5969 f51373;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f51374;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f51375;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f51376;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public List f51377;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte f51378;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f51379;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f51380;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f51381;

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        C12859 c12859 = new C12859(this);
        if ((this.f51381 & 1) != 0) {
            abstractC14766.mo35093(1, this.f51376);
        }
        if ((this.f51381 & 2) != 0) {
            abstractC14766.mo35093(2, this.f51375);
        }
        if ((this.f51381 & 4) != 0) {
            abstractC14766.mo35093(3, this.f51374);
        }
        if ((this.f51381 & 8) != 0) {
            abstractC14766.mo35093(7, this.f51379);
        }
        if ((this.f51381 & 16) != 0) {
            abstractC14766.mo35093(11, this.f51380);
        }
        if ((this.f51381 & 32) != 0) {
            abstractC14766.mo35104(12, m39373());
        }
        for (int i = 0; i < this.f51377.size(); i++) {
            abstractC14766.mo35104(EnumC3478.f11008, (InterfaceC8522) this.f51377.get(i));
        }
        c12859.m31295(536870912, abstractC14766);
        getUnknownFields().writeTo(abstractC14766);
    }

    static {
        C20663.m47279(EnumC6551.PUBLIC, C16736.class.getName());
        f51372 = new C16736();
        f51371 = new C1920();
    }

    public C16736(C11093 c11093) {
        super(c11093);
        this.f51376 = false;
        this.f51375 = false;
        this.f51374 = false;
        this.f51379 = false;
        this.f51380 = false;
        this.f51378 = (byte) -1;
    }

    public C16736() {
        this.f51376 = false;
        this.f51375 = false;
        this.f51374 = false;
        this.f51379 = false;
        this.f51380 = false;
        this.f51378 = (byte) -1;
        this.f51377 = Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC4121
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32231;
        c9766.m24773(C16736.class, C11093.class);
        return c9766;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m39378() {
        return (this.f51381 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m39380() {
        return this.f51376;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m39382() {
        return (this.f51381 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m39381() {
        return this.f51375;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m39371() {
        return (this.f51381 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m39377() {
        return this.f51374;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m39376() {
        return (this.f51381 & 8) != 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m39374() {
        return this.f51379;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m39375() {
        return (this.f51381 & 16) != 0;
    }

    @Deprecated
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m39379() {
        return this.f51380;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m39372() {
        return (this.f51381 & 32) != 0;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C5969 m39373() {
        C5969 c5969 = this.f51373;
        return c5969 == null ? C5969.getDefaultInstance() : c5969;
    }

    @Override // l.AbstractC12154, l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        byte b = this.f51378;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m39372() || m39373().isInitialized()) {
            for (int i = 0; i < this.f51377.size(); i++) {
                if (!((C1529) this.f51377.get(i)).isInitialized()) {
                    this.f51378 = (byte) 0;
                    return false;
                }
            }
            if (!m29574()) {
                this.f51378 = (byte) 0;
                return false;
            }
            this.f51378 = (byte) 1;
            return true;
        }
        this.f51378 = (byte) 0;
        return false;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35080 = (this.f51381 & 1) != 0 ? AbstractC14766.m35080(1) : 0;
        if ((this.f51381 & 2) != 0) {
            iM35080 += AbstractC14766.m35080(2);
        }
        if ((this.f51381 & 4) != 0) {
            iM35080 += AbstractC14766.m35080(3);
        }
        if ((this.f51381 & 8) != 0) {
            iM35080 += AbstractC14766.m35080(7);
        }
        if ((this.f51381 & 16) != 0) {
            iM35080 += AbstractC14766.m35080(11);
        }
        if ((this.f51381 & 32) != 0) {
            iM35080 += AbstractC14766.m35082(12, m39373());
        }
        for (int i2 = 0; i2 < this.f51377.size(); i2++) {
            iM35080 += AbstractC14766.m35082(EnumC3478.f11008, (InterfaceC8522) this.f51377.get(i2));
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
        if (!(obj instanceof C16736)) {
            return super.equals(obj);
        }
        C16736 c16736 = (C16736) obj;
        if (m39378() != c16736.m39378()) {
            return false;
        }
        if ((m39378() && this.f51376 != c16736.f51376) || m39382() != c16736.m39382()) {
            return false;
        }
        if ((m39382() && this.f51375 != c16736.f51375) || m39371() != c16736.m39371()) {
            return false;
        }
        if ((m39371() && this.f51374 != c16736.f51374) || m39376() != c16736.m39376()) {
            return false;
        }
        if ((m39376() && this.f51379 != c16736.f51379) || m39375() != c16736.m39375()) {
            return false;
        }
        if ((!m39375() || this.f51380 == c16736.f51380) && m39372() == c16736.m39372()) {
            return (!m39372() || m39373().equals(c16736.m39373())) && this.f51377.equals(c16736.f51377) && getUnknownFields().equals(c16736.getUnknownFields()) && m29575().equals(c16736.m29575());
        }
        return false;
    }

    @Override // l.AbstractC8709
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C10702.f32274.hashCode() + 779;
        if (m39378()) {
            iHashCode = C4153.m12551(iHashCode, 37, 1, 53) + C13997.m33481(this.f51376);
        }
        if (m39382()) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + C13997.m33481(this.f51375);
        }
        if (m39371()) {
            iHashCode = C4153.m12551(iHashCode, 37, 3, 53) + C13997.m33481(this.f51374);
        }
        if (m39376()) {
            iHashCode = C4153.m12551(iHashCode, 37, 7, 53) + C13997.m33481(this.f51379);
        }
        if (m39375()) {
            iHashCode = C4153.m12551(iHashCode, 37, 11, 53) + C13997.m33481(this.f51380);
        }
        if (m39372()) {
            iHashCode = C4153.m12551(iHashCode, 37, 12, 53) + m39373().hashCode();
        }
        if (this.f51377.size() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, EnumC3478.f11008, 53) + this.f51377.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC8709.m22494(iHashCode, m29575()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C11093 newBuilder() {
        return f51372.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return f51372.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 newBuilderForType() {
        return f51372.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C11093 toBuilder() {
        int i = 0;
        if (this == f51372) {
            return new C11093(i);
        }
        C11093 c11093 = new C11093(i);
        c11093.m27524(this);
        return c11093;
    }

    @Override // l.AbstractC8709
    public final InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C11093(interfaceC9415, 0);
    }

    public static C16736 getDefaultInstance() {
        return f51372;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f51371;
    }

    @Override // l.AbstractC12154, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f51372;
    }

    @Override // l.AbstractC12154, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return f51372;
    }
}
