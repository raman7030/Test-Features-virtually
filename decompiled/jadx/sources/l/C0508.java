package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֡ܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0508 extends AbstractC12154 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12050 f2134;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C0508 f2135;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public List f2136;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte f2137;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C5969 f2138;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f2139;

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        C12859 c12859 = new C12859(this);
        if ((this.f2139 & 1) != 0) {
            abstractC14766.mo35104(1, m2200());
        }
        for (int i = 0; i < this.f2136.size(); i++) {
            abstractC14766.mo35104(EnumC3478.f11008, (InterfaceC8522) this.f2136.get(i));
        }
        c12859.m31295(536870912, abstractC14766);
        getUnknownFields().writeTo(abstractC14766);
    }

    static {
        C20663.m47279(EnumC6551.PUBLIC, C0508.class.getName());
        f2135 = new C0508();
        f2134 = new C18854();
    }

    public C0508(C19560 c19560) {
        super(c19560);
        this.f2137 = (byte) -1;
    }

    public C0508() {
        this.f2137 = (byte) -1;
        this.f2136 = Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC4121
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32263;
        c9766.m24773(C0508.class, C19560.class);
        return c9766;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m2201() {
        return (this.f2139 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C5969 m2200() {
        C5969 c5969 = this.f2138;
        return c5969 == null ? C5969.getDefaultInstance() : c5969;
    }

    @Override // l.AbstractC12154, l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        byte b = this.f2137;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m2201() || m2200().isInitialized()) {
            for (int i = 0; i < this.f2136.size(); i++) {
                if (!((C1529) this.f2136.get(i)).isInitialized()) {
                    this.f2137 = (byte) 0;
                    return false;
                }
            }
            if (!m29574()) {
                this.f2137 = (byte) 0;
                return false;
            }
            this.f2137 = (byte) 1;
            return true;
        }
        this.f2137 = (byte) 0;
        return false;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35082 = (this.f2139 & 1) != 0 ? AbstractC14766.m35082(1, m2200()) : 0;
        for (int i2 = 0; i2 < this.f2136.size(); i2++) {
            iM35082 += AbstractC14766.m35082(EnumC3478.f11008, (InterfaceC8522) this.f2136.get(i2));
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
        if (!(obj instanceof C0508)) {
            return super.equals(obj);
        }
        C0508 c0508 = (C0508) obj;
        if (m2201() != c0508.m2201()) {
            return false;
        }
        return (!m2201() || m2200().equals(c0508.m2200())) && this.f2136.equals(c0508.f2136) && getUnknownFields().equals(c0508.getUnknownFields()) && m29575().equals(c0508.m29575());
    }

    @Override // l.AbstractC8709
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C10702.f32261.hashCode() + 779;
        if (m2201()) {
            iHashCode = C4153.m12551(iHashCode, 37, 1, 53) + m2200().hashCode();
        }
        if (this.f2136.size() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, EnumC3478.f11008, 53) + this.f2136.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC8709.m22494(iHashCode, m29575()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C19560 newBuilder() {
        return f2135.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return f2135.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 newBuilderForType() {
        return f2135.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C19560 toBuilder() {
        int i = 0;
        if (this == f2135) {
            return new C19560(i);
        }
        C19560 c19560 = new C19560(i);
        c19560.m44983(this);
        return c19560;
    }

    @Override // l.AbstractC8709
    public final InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C19560(interfaceC9415, 0);
    }

    public static C0508 getDefaultInstance() {
        return f2135;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f2134;
    }

    @Override // l.AbstractC12154, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f2135;
    }

    @Override // l.AbstractC12154, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return f2135;
    }
}
