package l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۚ۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public final class C5238 extends AbstractC4121 implements InterfaceC8060 {
    public static final C5238 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final InterfaceC12050 PARSER;
    public static final int PARTITION_NAMES_FIELD_NUMBER = 3;
    public static final int SIZE_FIELD_NUMBER = 2;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public byte memoizedIsInitialized;
    public volatile Object name_;
    public C2731 partitionNames_;
    public long size_;

    public /* synthetic */ C5238(C0298 c0298) {
        this((AbstractC19916) c0298);
    }

    static {
        C20663.m47279(EnumC6551.PUBLIC, C5238.class.getName());
        DEFAULT_INSTANCE = new C5238();
        PARSER = new C19350();
    }

    public C5238(AbstractC19916 abstractC19916) {
        super(abstractC19916);
        this.name_ = "";
        this.size_ = 0L;
        this.partitionNames_ = C2731.m8466();
        this.memoizedIsInitialized = (byte) -1;
    }

    public C5238() {
        this.name_ = "";
        this.size_ = 0L;
        this.partitionNames_ = C2731.m8466();
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.partitionNames_ = C2731.m8466();
    }

    public static final C17757 getDescriptor() {
        return C20260.internal_static_bin_mt_manager_visitor_payload_DynamicPartitionGroup_descriptor;
    }

    @Override // l.AbstractC4121
    public C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C20260.internal_static_bin_mt_manager_visitor_payload_DynamicPartitionGroup_fieldAccessorTable;
        c9766.m24773(C5238.class, C0298.class);
        return c9766;
    }

    @Override // l.InterfaceC8060
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC8060
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.name_ = strM16501;
        }
        return strM16501;
    }

    @Override // l.InterfaceC8060
    public AbstractC5886 getNameBytes() {
        Object obj = this.name_;
        if (obj instanceof String) {
            AbstractC5886 abstractC5886M16491 = AbstractC5886.m16491((String) obj);
            this.name_ = abstractC5886M16491;
            return abstractC5886M16491;
        }
        return (AbstractC5886) obj;
    }

    @Override // l.InterfaceC8060
    public boolean hasSize() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC8060
    public long getSize() {
        return this.size_;
    }

    @Override // l.InterfaceC8060
    public InterfaceC7111 getPartitionNamesList() {
        return this.partitionNames_;
    }

    @Override // l.InterfaceC8060
    public int getPartitionNamesCount() {
        return this.partitionNames_.size();
    }

    @Override // l.InterfaceC8060
    public String getPartitionNames(int i) {
        return this.partitionNames_.get(i);
    }

    @Override // l.InterfaceC8060
    public AbstractC5886 getPartitionNamesBytes(int i) {
        return this.partitionNames_.m8468(i);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
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

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public void writeTo(AbstractC14766 abstractC14766) {
        if ((this.bitField0_ & 1) != 0) {
            AbstractC4121.m12380(abstractC14766, 1, this.name_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC14766.mo35102(2, this.size_);
        }
        for (int i = 0; i < this.partitionNames_.size(); i++) {
            AbstractC4121.m12380(abstractC14766, 3, this.partitionNames_.mo8472(i));
        }
        getUnknownFields().writeTo(abstractC14766);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM12365 = (this.bitField0_ & 1) != 0 ? AbstractC4121.m12365(1, this.name_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM12365 += AbstractC14766.m35081(2, this.size_);
        }
        int iM12395 = 0;
        for (int i2 = 0; i2 < this.partitionNames_.size(); i2++) {
            iM12395 += AbstractC4121.m12395(this.partitionNames_.mo8472(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + getPartitionNamesList().size() + iM12365 + iM12395;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC8709
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5238)) {
            return super.equals(obj);
        }
        C5238 c5238 = (C5238) obj;
        if (hasName() != c5238.hasName()) {
            return false;
        }
        if ((!hasName() || getName().equals(c5238.getName())) && hasSize() == c5238.hasSize()) {
            return (!hasSize() || getSize() == c5238.getSize()) && getPartitionNamesList().equals(c5238.getPartitionNamesList()) && getUnknownFields().equals(c5238.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC8709
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasName()) {
            iHashCode = C4153.m12551(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (hasSize()) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + C13997.m33480(getSize());
        }
        if (getPartitionNamesCount() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, 3, 53) + getPartitionNamesList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C5238 parseFrom(ByteBuffer byteBuffer) {
        return (C5238) PARSER.parseFrom(byteBuffer);
    }

    public static C5238 parseFrom(ByteBuffer byteBuffer, C17798 c17798) {
        return (C5238) PARSER.parseFrom(byteBuffer, c17798);
    }

    public static C5238 parseFrom(AbstractC5886 abstractC5886) {
        return (C5238) PARSER.parseFrom(abstractC5886);
    }

    public static C5238 parseFrom(AbstractC5886 abstractC5886, C17798 c17798) {
        return (C5238) PARSER.parseFrom(abstractC5886, c17798);
    }

    public static C5238 parseFrom(byte[] bArr) {
        return (C5238) PARSER.parseFrom(bArr);
    }

    public static C5238 parseFrom(byte[] bArr, C17798 c17798) {
        return (C5238) PARSER.parseFrom(bArr, c17798);
    }

    public static C5238 parseFrom(InputStream inputStream) {
        return (C5238) AbstractC4121.m12390(PARSER, inputStream);
    }

    public static C5238 parseFrom(InputStream inputStream, C17798 c17798) {
        return (C5238) AbstractC4121.m12391(PARSER, inputStream, c17798);
    }

    public static C5238 parseDelimitedFrom(InputStream inputStream) {
        return (C5238) AbstractC4121.m12376(PARSER, inputStream);
    }

    public static C5238 parseDelimitedFrom(InputStream inputStream, C17798 c17798) {
        return (C5238) AbstractC4121.m12377(PARSER, inputStream, c17798);
    }

    public static C5238 parseFrom(AbstractC7297 abstractC7297) {
        return (C5238) AbstractC4121.m12378(PARSER, abstractC7297);
    }

    public static C5238 parseFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        return (C5238) AbstractC4121.m12379(PARSER, abstractC7297, c17798);
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public C0298 newBuilderForType() {
        return newBuilder();
    }

    public static C0298 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C0298 newBuilder(C5238 c5238) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c5238);
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public C0298 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C0298(i) : new C0298(i).mergeFrom(this);
    }

    @Override // l.AbstractC8709
    public C0298 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C0298(interfaceC9415, 0);
    }

    public static C5238 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static InterfaceC12050 parser() {
        return PARSER;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public InterfaceC12050 getParserForType() {
        return PARSER;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public C5238 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
