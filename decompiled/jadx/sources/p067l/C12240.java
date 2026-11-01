package p067l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۤܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12240 extends AbstractC6285 implements InterfaceC5773 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۙ */
    public static final InterfaceC13820 f34196;

    /* JADX INFO: renamed from: ᩶ */
    public static final C12240 f34197;

    /* JADX INFO: renamed from: ᩸ */
    public List f34198;

    /* JADX INFO: renamed from: ᩹ */
    public byte f34199;

    static {
        C22006.m49606(EnumC8594.PUBLIC, C12240.class.getName());
        f34197 = new C12240();
        f34196 = new C21628();
    }

    public C12240(C6875 c6875, int i) {
        super(c6875);
        this.f34199 = (byte) -1;
    }

    public C12240() {
        this.f34199 = (byte) -1;
        this.f34198 = Collections.EMPTY_LIST;
    }

    @Override // p067l.AbstractC6285
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35240;
        c11650.m26787(C12240.class, C6875.class);
        return c11650;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.f34199;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f34199 = (byte) 1;
        return true;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        for (int i = 0; i < this.f34198.size(); i++) {
            abstractC16402.mo37251(1, (InterfaceC10467) this.f34198.get(i));
        }
        getUnknownFields().writeTo(abstractC16402);
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM37229 = 0;
        for (int i2 = 0; i2 < this.f34198.size(); i2++) {
            iM37229 += AbstractC16402.m37229(1, (InterfaceC10467) this.f34198.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM37229;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // p067l.AbstractC10645
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12240)) {
            return super.equals(obj);
        }
        C12240 c12240 = (C12240) obj;
        return this.f34198.equals(c12240.f34198) && getUnknownFields().equals(c12240.getUnknownFields());
    }

    @Override // p067l.AbstractC10645
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12539.f35246.hashCode() + 779;
        if (this.f34198.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + this.f34198.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C6875 newBuilder() {
        return f34197.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return f34197.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 newBuilderForType() {
        return f34197.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C6875 toBuilder() {
        int i = 0;
        if (this == f34197) {
            return new C6875(i);
        }
        C6875 c6875 = new C6875(i);
        c6875.m15769(this);
        return c6875;
    }

    @Override // p067l.AbstractC10645
    public final InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C6875(interfaceC11316, 0);
    }

    public static C12240 getDefaultInstance() {
        return f34197;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f34196;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f34197;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return f34197;
    }
}
