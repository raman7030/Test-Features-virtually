package l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.᩵ܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public final class C19555 extends AbstractC4121 implements InterfaceC5443 {
    public static final int DATA_FIELD_NUMBER = 2;
    public static final C19555 DEFAULT_INSTANCE;
    public static final InterfaceC12050 PARSER;
    public static final int UNPADDED_SIGNATURE_SIZE_FIELD_NUMBER = 3;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public AbstractC5886 data_;
    public byte memoizedIsInitialized;
    public int unpaddedSignatureSize_;
    public int version_;

    public /* synthetic */ C19555(C18849 c18849) {
        this((AbstractC19916) c18849);
    }

    static {
        C20663.m47279(EnumC6551.PUBLIC, C19555.class.getName());
        DEFAULT_INSTANCE = new C19555();
        PARSER = new C4032();
    }

    public C19555(AbstractC19916 abstractC19916) {
        super(abstractC19916);
        this.version_ = 0;
        this.data_ = AbstractC5886.f18080;
        this.unpaddedSignatureSize_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C19555() {
        this.version_ = 0;
        AbstractC5886 abstractC5886 = AbstractC5886.f18080;
        this.unpaddedSignatureSize_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.data_ = abstractC5886;
    }

    public static final C17757 getDescriptor() {
        return C20260.internal_static_bin_mt_manager_visitor_payload_Signatures_Signature_descriptor;
    }

    @Override // l.AbstractC4121
    public C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C20260.internal_static_bin_mt_manager_visitor_payload_Signatures_Signature_fieldAccessorTable;
        c9766.m24773(C19555.class, C18849.class);
        return c9766;
    }

    @Override // l.InterfaceC5443
    @Deprecated
    public boolean hasVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC5443
    @Deprecated
    public int getVersion() {
        return this.version_;
    }

    @Override // l.InterfaceC5443
    public boolean hasData() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC5443
    public AbstractC5886 getData() {
        return this.data_;
    }

    @Override // l.InterfaceC5443
    public boolean hasUnpaddedSignatureSize() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC5443
    public int getUnpaddedSignatureSize() {
        return this.unpaddedSignatureSize_;
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
            abstractC14766.mo35109(1, this.version_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC14766.mo35090(2, this.data_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC14766.mo35087(3, this.unpaddedSignatureSize_);
        }
        getUnknownFields().writeTo(abstractC14766);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35084 = (this.bitField0_ & 1) != 0 ? AbstractC14766.m35084(1, this.version_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM35084 += AbstractC14766.m35076(2, this.data_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM35084 += AbstractC14766.m35078(3);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM35084;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC8709
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C19555)) {
            return super.equals(obj);
        }
        C19555 c19555 = (C19555) obj;
        if (hasVersion() != c19555.hasVersion()) {
            return false;
        }
        if ((hasVersion() && getVersion() != c19555.getVersion()) || hasData() != c19555.hasData()) {
            return false;
        }
        if ((!hasData() || getData().equals(c19555.getData())) && hasUnpaddedSignatureSize() == c19555.hasUnpaddedSignatureSize()) {
            return (!hasUnpaddedSignatureSize() || getUnpaddedSignatureSize() == c19555.getUnpaddedSignatureSize()) && getUnknownFields().equals(c19555.getUnknownFields());
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
        if (hasVersion()) {
            iHashCode = C4153.m12551(iHashCode, 37, 1, 53) + getVersion();
        }
        if (hasData()) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + getData().hashCode();
        }
        if (hasUnpaddedSignatureSize()) {
            iHashCode = C4153.m12551(iHashCode, 37, 3, 53) + getUnpaddedSignatureSize();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C19555 parseFrom(ByteBuffer byteBuffer) {
        return (C19555) PARSER.parseFrom(byteBuffer);
    }

    public static C19555 parseFrom(ByteBuffer byteBuffer, C17798 c17798) {
        return (C19555) PARSER.parseFrom(byteBuffer, c17798);
    }

    public static C19555 parseFrom(AbstractC5886 abstractC5886) {
        return (C19555) PARSER.parseFrom(abstractC5886);
    }

    public static C19555 parseFrom(AbstractC5886 abstractC5886, C17798 c17798) {
        return (C19555) PARSER.parseFrom(abstractC5886, c17798);
    }

    public static C19555 parseFrom(byte[] bArr) {
        return (C19555) PARSER.parseFrom(bArr);
    }

    public static C19555 parseFrom(byte[] bArr, C17798 c17798) {
        return (C19555) PARSER.parseFrom(bArr, c17798);
    }

    public static C19555 parseFrom(InputStream inputStream) {
        return (C19555) AbstractC4121.m12390(PARSER, inputStream);
    }

    public static C19555 parseFrom(InputStream inputStream, C17798 c17798) {
        return (C19555) AbstractC4121.m12391(PARSER, inputStream, c17798);
    }

    public static C19555 parseDelimitedFrom(InputStream inputStream) {
        return (C19555) AbstractC4121.m12376(PARSER, inputStream);
    }

    public static C19555 parseDelimitedFrom(InputStream inputStream, C17798 c17798) {
        return (C19555) AbstractC4121.m12377(PARSER, inputStream, c17798);
    }

    public static C19555 parseFrom(AbstractC7297 abstractC7297) {
        return (C19555) AbstractC4121.m12378(PARSER, abstractC7297);
    }

    public static C19555 parseFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        return (C19555) AbstractC4121.m12379(PARSER, abstractC7297, c17798);
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public C18849 newBuilderForType() {
        return newBuilder();
    }

    public static C18849 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C18849 newBuilder(C19555 c19555) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c19555);
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public C18849 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C18849(i) : new C18849(i).mergeFrom(this);
    }

    @Override // l.AbstractC8709
    public C18849 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C18849(interfaceC9415, 0);
    }

    public static C19555 getDefaultInstance() {
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
    public C19555 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
