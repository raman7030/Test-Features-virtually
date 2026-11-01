package p067l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۚ۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public final class C7347 extends AbstractC6285 implements InterfaceC10029 {
    public static final C7347 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final InterfaceC13820 PARSER;
    public static final int PARTITION_NAMES_FIELD_NUMBER = 3;
    public static final int SIZE_FIELD_NUMBER = 2;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public byte memoizedIsInitialized;
    public volatile Object name_;
    public C4964 partitionNames_;
    public long size_;

    public /* synthetic */ C7347(C2652 c2652) {
        this((AbstractC21296) c2652);
    }

    static {
        C22006.m49606(EnumC8594.PUBLIC, C7347.class.getName());
        DEFAULT_INSTANCE = new C7347();
        PARSER = new C20759();
    }

    public C7347(AbstractC21296 abstractC21296) {
        super(abstractC21296);
        this.name_ = "";
        this.size_ = 0L;
        this.partitionNames_ = C4964.m10513();
        this.memoizedIsInitialized = (byte) -1;
    }

    public C7347() {
        this.name_ = "";
        this.size_ = 0L;
        this.partitionNames_ = C4964.m10513();
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.partitionNames_ = C4964.m10513();
    }

    public static final C19244 getDescriptor() {
        return C21624.f68157x5ee982bf;
    }

    @Override // p067l.AbstractC6285
    public C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C21624.f68158xe8c57a3d;
        c11650.m26787(C7347.class, C2652.class);
        return c11650;
    }

    @Override // p067l.InterfaceC10029
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p067l.InterfaceC10029
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.name_ = strM18427;
        }
        return strM18427;
    }

    @Override // p067l.InterfaceC10029
    public AbstractC7962 getNameBytes() {
        Object obj = this.name_;
        if (obj instanceof String) {
            AbstractC7962 abstractC7962M18417 = AbstractC7962.m18417((String) obj);
            this.name_ = abstractC7962M18417;
            return abstractC7962M18417;
        }
        return (AbstractC7962) obj;
    }

    @Override // p067l.InterfaceC10029
    public boolean hasSize() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p067l.InterfaceC10029
    public long getSize() {
        return this.size_;
    }

    @Override // p067l.InterfaceC10029
    public InterfaceC9126 getPartitionNamesList() {
        return this.partitionNames_;
    }

    @Override // p067l.InterfaceC10029
    public int getPartitionNamesCount() {
        return this.partitionNames_.size();
    }

    @Override // p067l.InterfaceC10029
    public String getPartitionNames(int i) {
        return this.partitionNames_.get(i);
    }

    @Override // p067l.InterfaceC10029
    public AbstractC7962 getPartitionNamesBytes(int i) {
        return this.partitionNames_.m10515(i);
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
        if (!hasName()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public void writeTo(AbstractC16402 abstractC16402) {
        if ((this.bitField0_ & 1) != 0) {
            AbstractC6285.m14269(abstractC16402, 1, this.name_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC16402.mo37249(2, this.size_);
        }
        for (int i = 0; i < this.partitionNames_.size(); i++) {
            AbstractC6285.m14269(abstractC16402, 3, this.partitionNames_.mo10519(i));
        }
        getUnknownFields().writeTo(abstractC16402);
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM14254 = (this.bitField0_ & 1) != 0 ? AbstractC6285.m14254(1, this.name_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM14254 += AbstractC16402.m37228(2, this.size_);
        }
        int iM14284 = 0;
        for (int i2 = 0; i2 < this.partitionNames_.size(); i2++) {
            iM14284 += AbstractC6285.m14284(this.partitionNames_.mo10519(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + getPartitionNamesList().size() + iM14254 + iM14284;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // p067l.AbstractC10645
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7347)) {
            return super.equals(obj);
        }
        C7347 c7347 = (C7347) obj;
        if (hasName() != c7347.hasName()) {
            return false;
        }
        if ((!hasName() || getName().equals(c7347.getName())) && hasSize() == c7347.hasSize()) {
            return (!hasSize() || getSize() == c7347.getSize()) && getPartitionNamesList().equals(c7347.getPartitionNamesList()) && getUnknownFields().equals(c7347.getUnknownFields());
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
        if (hasName()) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (hasSize()) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + C15671.m35600(getSize());
        }
        if (getPartitionNamesCount() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 3, 53) + getPartitionNamesList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C7347 parseFrom(ByteBuffer byteBuffer) {
        return (C7347) PARSER.parseFrom(byteBuffer);
    }

    public static C7347 parseFrom(ByteBuffer byteBuffer, C19283 c19283) {
        return (C7347) PARSER.parseFrom(byteBuffer, c19283);
    }

    public static C7347 parseFrom(AbstractC7962 abstractC7962) {
        return (C7347) PARSER.parseFrom(abstractC7962);
    }

    public static C7347 parseFrom(AbstractC7962 abstractC7962, C19283 c19283) {
        return (C7347) PARSER.parseFrom(abstractC7962, c19283);
    }

    public static C7347 parseFrom(byte[] bArr) {
        return (C7347) PARSER.parseFrom(bArr);
    }

    public static C7347 parseFrom(byte[] bArr, C19283 c19283) {
        return (C7347) PARSER.parseFrom(bArr, c19283);
    }

    public static C7347 parseFrom(InputStream inputStream) {
        return (C7347) AbstractC6285.m14279(PARSER, inputStream);
    }

    public static C7347 parseFrom(InputStream inputStream, C19283 c19283) {
        return (C7347) AbstractC6285.m14280(PARSER, inputStream, c19283);
    }

    public static C7347 parseDelimitedFrom(InputStream inputStream) {
        return (C7347) AbstractC6285.m14265(PARSER, inputStream);
    }

    public static C7347 parseDelimitedFrom(InputStream inputStream, C19283 c19283) {
        return (C7347) AbstractC6285.m14266(PARSER, inputStream, c19283);
    }

    public static C7347 parseFrom(AbstractC9303 abstractC9303) {
        return (C7347) AbstractC6285.m14267(PARSER, abstractC9303);
    }

    public static C7347 parseFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        return (C7347) AbstractC6285.m14268(PARSER, abstractC9303, c19283);
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public C2652 newBuilderForType() {
        return newBuilder();
    }

    public static C2652 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C2652 newBuilder(C7347 c7347) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c7347);
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public C2652 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C2652(i) : new C2652(i).mergeFrom(this);
    }

    @Override // p067l.AbstractC10645
    public C2652 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C2652(interfaceC11316, 0);
    }

    public static C7347 getDefaultInstance() {
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
    public C7347 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
