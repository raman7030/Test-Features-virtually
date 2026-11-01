package p067l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ܶܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public final class C16928 extends AbstractC6285 implements InterfaceC23635 {
    public static final int BATCH_WRITES_FIELD_NUMBER = 2;
    public static final C16928 DEFAULT_INSTANCE;
    public static final InterfaceC13820 PARSER;
    public static final int THREADED_FIELD_NUMBER = 1;
    public static final long serialVersionUID = 0;
    public boolean batchWrites_;
    public int bitField0_;
    public byte memoizedIsInitialized;
    public boolean threaded_;

    public /* synthetic */ C16928(C10224 c10224) {
        this((AbstractC21296) c10224);
    }

    static {
        C22006.m49606(EnumC8594.PUBLIC, C16928.class.getName());
        DEFAULT_INSTANCE = new C16928();
        PARSER = new C3518();
    }

    public C16928(AbstractC21296 abstractC21296) {
        super(abstractC21296);
        this.threaded_ = false;
        this.batchWrites_ = false;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C16928() {
        this.threaded_ = false;
        this.batchWrites_ = false;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static final C19244 getDescriptor() {
        return C21624.f68172x668ec8f1;
    }

    @Override // p067l.AbstractC6285
    public C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C21624.f68173x27226e6f;
        c11650.m26787(C16928.class, C10224.class);
        return c11650;
    }

    @Override // p067l.InterfaceC23635
    public boolean hasThreaded() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p067l.InterfaceC23635
    public boolean getThreaded() {
        return this.threaded_;
    }

    @Override // p067l.InterfaceC23635
    public boolean hasBatchWrites() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p067l.InterfaceC23635
    public boolean getBatchWrites() {
        return this.batchWrites_;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public void writeTo(AbstractC16402 abstractC16402) {
        if ((this.bitField0_ & 1) != 0) {
            abstractC16402.mo37240(1, this.threaded_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC16402.mo37240(2, this.batchWrites_);
        }
        getUnknownFields().writeTo(abstractC16402);
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM37227 = (this.bitField0_ & 1) != 0 ? AbstractC16402.m37227(1) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM37227 += AbstractC16402.m37227(2);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM37227;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // p067l.AbstractC10645
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16928)) {
            return super.equals(obj);
        }
        C16928 c16928 = (C16928) obj;
        if (hasThreaded() != c16928.hasThreaded()) {
            return false;
        }
        if ((!hasThreaded() || getThreaded() == c16928.getThreaded()) && hasBatchWrites() == c16928.hasBatchWrites()) {
            return (!hasBatchWrites() || getBatchWrites() == c16928.getBatchWrites()) && getUnknownFields().equals(c16928.getUnknownFields());
        }
        return false;
    }

    @Override // p067l.AbstractC10645
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasThreaded()) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + C15671.m35601(getThreaded());
        }
        if (hasBatchWrites()) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + C15671.m35601(getBatchWrites());
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C16928 parseFrom(ByteBuffer byteBuffer) {
        return (C16928) PARSER.parseFrom(byteBuffer);
    }

    public static C16928 parseFrom(ByteBuffer byteBuffer, C19283 c19283) {
        return (C16928) PARSER.parseFrom(byteBuffer, c19283);
    }

    public static C16928 parseFrom(AbstractC7962 abstractC7962) {
        return (C16928) PARSER.parseFrom(abstractC7962);
    }

    public static C16928 parseFrom(AbstractC7962 abstractC7962, C19283 c19283) {
        return (C16928) PARSER.parseFrom(abstractC7962, c19283);
    }

    public static C16928 parseFrom(byte[] bArr) {
        return (C16928) PARSER.parseFrom(bArr);
    }

    public static C16928 parseFrom(byte[] bArr, C19283 c19283) {
        return (C16928) PARSER.parseFrom(bArr, c19283);
    }

    public static C16928 parseFrom(InputStream inputStream) {
        return (C16928) AbstractC6285.m14279(PARSER, inputStream);
    }

    public static C16928 parseFrom(InputStream inputStream, C19283 c19283) {
        return (C16928) AbstractC6285.m14280(PARSER, inputStream, c19283);
    }

    public static C16928 parseDelimitedFrom(InputStream inputStream) {
        return (C16928) AbstractC6285.m14265(PARSER, inputStream);
    }

    public static C16928 parseDelimitedFrom(InputStream inputStream, C19283 c19283) {
        return (C16928) AbstractC6285.m14266(PARSER, inputStream, c19283);
    }

    public static C16928 parseFrom(AbstractC9303 abstractC9303) {
        return (C16928) AbstractC6285.m14267(PARSER, abstractC9303);
    }

    public static C16928 parseFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        return (C16928) AbstractC6285.m14268(PARSER, abstractC9303, c19283);
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public C10224 newBuilderForType() {
        return newBuilder();
    }

    public static C10224 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C10224 newBuilder(C16928 c16928) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c16928);
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public C10224 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C10224(i) : new C10224(i).mergeFrom(this);
    }

    @Override // p067l.AbstractC10645
    public C10224 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C10224(interfaceC11316, 0);
    }

    public static C16928 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static InterfaceC13820 parser() {
        return PARSER;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public InterfaceC13820 getParserForType() {
        return PARSER;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public C16928 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
