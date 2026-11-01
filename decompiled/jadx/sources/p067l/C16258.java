package p067l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ܳܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public final class C16258 extends AbstractC6285 implements InterfaceC8883 {
    public static final C16258 DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 2;
    public static final InterfaceC13820 PARSER;
    public static final int SIZE_FIELD_NUMBER = 1;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public AbstractC7962 hash_;
    public byte memoizedIsInitialized;
    public long size_;

    public /* synthetic */ C16258(C18941 c18941) {
        this((AbstractC21296) c18941);
    }

    static {
        C22006.m49606(EnumC8594.PUBLIC, C16258.class.getName());
        DEFAULT_INSTANCE = new C16258();
        PARSER = new C19612();
    }

    public C16258(AbstractC21296 abstractC21296) {
        super(abstractC21296);
        this.size_ = 0L;
        this.hash_ = AbstractC7962.f20935;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C16258() {
        this.size_ = 0L;
        AbstractC7962 abstractC7962 = AbstractC7962.f20935;
        this.memoizedIsInitialized = (byte) -1;
        this.hash_ = abstractC7962;
    }

    public static final C19244 getDescriptor() {
        return C21624.f68164x2a74025b;
    }

    @Override // p067l.AbstractC6285
    public C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C21624.f68165xd7149dd9;
        c11650.m26787(C16258.class, C18941.class);
        return c11650;
    }

    @Override // p067l.InterfaceC8883
    public boolean hasSize() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p067l.InterfaceC8883
    public long getSize() {
        return this.size_;
    }

    @Override // p067l.InterfaceC8883
    public boolean hasHash() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p067l.InterfaceC8883
    public AbstractC7962 getHash() {
        return this.hash_;
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
            abstractC16402.mo37249(1, this.size_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC16402.mo37237(2, this.hash_);
        }
        getUnknownFields().writeTo(abstractC16402);
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM37228 = (this.bitField0_ & 1) != 0 ? AbstractC16402.m37228(1, this.size_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM37228 += AbstractC16402.m37223(2, this.hash_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM37228;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // p067l.AbstractC10645
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16258)) {
            return super.equals(obj);
        }
        C16258 c16258 = (C16258) obj;
        if (hasSize() != c16258.hasSize()) {
            return false;
        }
        if ((!hasSize() || getSize() == c16258.getSize()) && hasHash() == c16258.hasHash()) {
            return (!hasHash() || getHash().equals(c16258.getHash())) && getUnknownFields().equals(c16258.getUnknownFields());
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
        if (hasSize()) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + C15671.m35600(getSize());
        }
        if (hasHash()) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + getHash().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C16258 parseFrom(ByteBuffer byteBuffer) {
        return (C16258) PARSER.parseFrom(byteBuffer);
    }

    public static C16258 parseFrom(ByteBuffer byteBuffer, C19283 c19283) {
        return (C16258) PARSER.parseFrom(byteBuffer, c19283);
    }

    public static C16258 parseFrom(AbstractC7962 abstractC7962) {
        return (C16258) PARSER.parseFrom(abstractC7962);
    }

    public static C16258 parseFrom(AbstractC7962 abstractC7962, C19283 c19283) {
        return (C16258) PARSER.parseFrom(abstractC7962, c19283);
    }

    public static C16258 parseFrom(byte[] bArr) {
        return (C16258) PARSER.parseFrom(bArr);
    }

    public static C16258 parseFrom(byte[] bArr, C19283 c19283) {
        return (C16258) PARSER.parseFrom(bArr, c19283);
    }

    public static C16258 parseFrom(InputStream inputStream) {
        return (C16258) AbstractC6285.m14279(PARSER, inputStream);
    }

    public static C16258 parseFrom(InputStream inputStream, C19283 c19283) {
        return (C16258) AbstractC6285.m14280(PARSER, inputStream, c19283);
    }

    public static C16258 parseDelimitedFrom(InputStream inputStream) {
        return (C16258) AbstractC6285.m14265(PARSER, inputStream);
    }

    public static C16258 parseDelimitedFrom(InputStream inputStream, C19283 c19283) {
        return (C16258) AbstractC6285.m14266(PARSER, inputStream, c19283);
    }

    public static C16258 parseFrom(AbstractC9303 abstractC9303) {
        return (C16258) AbstractC6285.m14267(PARSER, abstractC9303);
    }

    public static C16258 parseFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        return (C16258) AbstractC6285.m14268(PARSER, abstractC9303, c19283);
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public C18941 newBuilderForType() {
        return newBuilder();
    }

    public static C18941 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C18941 newBuilder(C16258 c16258) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c16258);
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public C18941 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C18941(i) : new C18941(i).mergeFrom(this);
    }

    @Override // p067l.AbstractC10645
    public C18941 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C18941(interfaceC11316, 0);
    }

    public static C16258 getDefaultInstance() {
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
    public C16258 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
