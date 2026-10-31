package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۤܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10387 extends AbstractC4121 implements InterfaceC3583 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12050 f31231;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C10387 f31232;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public List f31233;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte f31234;

    static {
        C20663.m47279(EnumC6551.PUBLIC, C10387.class.getName());
        f31232 = new C10387();
        f31231 = new C20265();
    }

    public C10387(C4742 c4742, int i) {
        super(c4742);
        this.f31234 = (byte) -1;
    }

    public C10387() {
        this.f31234 = (byte) -1;
        this.f31233 = Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC4121
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32265;
        c9766.m24773(C10387.class, C4742.class);
        return c9766;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        byte b = this.f31234;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f31234 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        for (int i = 0; i < this.f31233.size(); i++) {
            abstractC14766.mo35104(1, (InterfaceC8522) this.f31233.get(i));
        }
        getUnknownFields().writeTo(abstractC14766);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35082 = 0;
        for (int i2 = 0; i2 < this.f31233.size(); i2++) {
            iM35082 += AbstractC14766.m35082(1, (InterfaceC8522) this.f31233.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM35082;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC8709
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10387)) {
            return super.equals(obj);
        }
        C10387 c10387 = (C10387) obj;
        return this.f31233.equals(c10387.f31233) && getUnknownFields().equals(c10387.getUnknownFields());
    }

    @Override // l.AbstractC8709
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C10702.f32271.hashCode() + 779;
        if (this.f31233.size() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, 1, 53) + this.f31233.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C4742 newBuilder() {
        return f31232.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return f31232.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 newBuilderForType() {
        return f31232.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C4742 toBuilder() {
        int i = 0;
        if (this == f31232) {
            return new C4742(i);
        }
        C4742 c4742 = new C4742(i);
        c4742.m13889(this);
        return c4742;
    }

    @Override // l.AbstractC8709
    public final InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C4742(interfaceC9415, 0);
    }

    public static C10387 getDefaultInstance() {
        return f31232;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f31231;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f31232;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return f31232;
    }
}
