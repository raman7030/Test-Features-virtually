package l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ܳܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public final class C14614 extends AbstractC4121 implements InterfaceC6854 {
    public static final C14614 DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 2;
    public static final InterfaceC12050 PARSER;
    public static final int SIZE_FIELD_NUMBER = 1;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public AbstractC5886 hash_;
    public byte memoizedIsInitialized;
    public long size_;

    public /* synthetic */ C14614(C17437 c17437) {
        this((AbstractC19916) c17437);
    }

    static {
        C20663.m47279(EnumC6551.PUBLIC, C14614.class.getName());
        DEFAULT_INSTANCE = new C14614();
        PARSER = new C18143();
    }

    public C14614(AbstractC19916 abstractC19916) {
        super(abstractC19916);
        this.size_ = 0L;
        this.hash_ = AbstractC5886.f18080;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C14614() {
        this.size_ = 0L;
        AbstractC5886 abstractC5886 = AbstractC5886.f18080;
        this.memoizedIsInitialized = (byte) -1;
        this.hash_ = abstractC5886;
    }

    public static final C17757 getDescriptor() {
        return C20260.internal_static_bin_mt_manager_visitor_payload_PartitionInfo_descriptor;
    }

    @Override // l.AbstractC4121
    public C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C20260.internal_static_bin_mt_manager_visitor_payload_PartitionInfo_fieldAccessorTable;
        c9766.m24773(C14614.class, C17437.class);
        return c9766;
    }

    @Override // l.InterfaceC6854
    public boolean hasSize() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC6854
    public long getSize() {
        return this.size_;
    }

    @Override // l.InterfaceC6854
    public boolean hasHash() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC6854
    public AbstractC5886 getHash() {
        return this.hash_;
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
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public void writeTo(AbstractC14766 abstractC14766) {
        if ((this.bitField0_ & 1) != 0) {
            abstractC14766.mo35102(1, this.size_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC14766.mo35090(2, this.hash_);
        }
        getUnknownFields().writeTo(abstractC14766);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35081 = (this.bitField0_ & 1) != 0 ? AbstractC14766.m35081(1, this.size_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM35081 += AbstractC14766.m35076(2, this.hash_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM35081;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC8709
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14614)) {
            return super.equals(obj);
        }
        C14614 c14614 = (C14614) obj;
        if (hasSize() != c14614.hasSize()) {
            return false;
        }
        if ((!hasSize() || getSize() == c14614.getSize()) && hasHash() == c14614.hasHash()) {
            return (!hasHash() || getHash().equals(c14614.getHash())) && getUnknownFields().equals(c14614.getUnknownFields());
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
        if (hasSize()) {
            iHashCode = C4153.m12551(iHashCode, 37, 1, 53) + C13997.m33480(getSize());
        }
        if (hasHash()) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + getHash().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C14614 parseFrom(ByteBuffer byteBuffer) {
        return (C14614) PARSER.parseFrom(byteBuffer);
    }

    public static C14614 parseFrom(ByteBuffer byteBuffer, C17798 c17798) {
        return (C14614) PARSER.parseFrom(byteBuffer, c17798);
    }

    public static C14614 parseFrom(AbstractC5886 abstractC5886) {
        return (C14614) PARSER.parseFrom(abstractC5886);
    }

    public static C14614 parseFrom(AbstractC5886 abstractC5886, C17798 c17798) {
        return (C14614) PARSER.parseFrom(abstractC5886, c17798);
    }

    public static C14614 parseFrom(byte[] bArr) {
        return (C14614) PARSER.parseFrom(bArr);
    }

    public static C14614 parseFrom(byte[] bArr, C17798 c17798) {
        return (C14614) PARSER.parseFrom(bArr, c17798);
    }

    public static C14614 parseFrom(InputStream inputStream) {
        return (C14614) AbstractC4121.m12390(PARSER, inputStream);
    }

    public static C14614 parseFrom(InputStream inputStream, C17798 c17798) {
        return (C14614) AbstractC4121.m12391(PARSER, inputStream, c17798);
    }

    public static C14614 parseDelimitedFrom(InputStream inputStream) {
        return (C14614) AbstractC4121.m12376(PARSER, inputStream);
    }

    public static C14614 parseDelimitedFrom(InputStream inputStream, C17798 c17798) {
        return (C14614) AbstractC4121.m12377(PARSER, inputStream, c17798);
    }

    public static C14614 parseFrom(AbstractC7297 abstractC7297) {
        return (C14614) AbstractC4121.m12378(PARSER, abstractC7297);
    }

    public static C14614 parseFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        return (C14614) AbstractC4121.m12379(PARSER, abstractC7297, c17798);
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public C17437 newBuilderForType() {
        return newBuilder();
    }

    public static C17437 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C17437 newBuilder(C14614 c14614) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c14614);
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public C17437 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C17437(i) : new C17437(i).mergeFrom(this);
    }

    @Override // l.AbstractC8709
    public C17437 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C17437(interfaceC9415, 0);
    }

    public static C14614 getDefaultInstance() {
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
    public C14614 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
