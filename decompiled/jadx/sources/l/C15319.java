package l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ܶܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public final class C15319 extends AbstractC4121 implements InterfaceC22376 {
    public static final int BATCH_WRITES_FIELD_NUMBER = 2;
    public static final C15319 DEFAULT_INSTANCE;
    public static final InterfaceC12050 PARSER;
    public static final int THREADED_FIELD_NUMBER = 1;
    public static final long serialVersionUID = 0;
    public boolean batchWrites_;
    public int bitField0_;
    public byte memoizedIsInitialized;
    public boolean threaded_;

    public /* synthetic */ C15319(C8265 c8265) {
        this((AbstractC19916) c8265);
    }

    static {
        C20663.m47279(EnumC6551.PUBLIC, C15319.class.getName());
        DEFAULT_INSTANCE = new C15319();
        PARSER = new C1209();
    }

    public C15319(AbstractC19916 abstractC19916) {
        super(abstractC19916);
        this.threaded_ = false;
        this.batchWrites_ = false;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C15319() {
        this.threaded_ = false;
        this.batchWrites_ = false;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static final C17757 getDescriptor() {
        return C20260.internal_static_bin_mt_manager_visitor_payload_VABCFeatureSet_descriptor;
    }

    @Override // l.AbstractC4121
    public C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C20260.internal_static_bin_mt_manager_visitor_payload_VABCFeatureSet_fieldAccessorTable;
        c9766.m24773(C15319.class, C8265.class);
        return c9766;
    }

    @Override // l.InterfaceC22376
    public boolean hasThreaded() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC22376
    public boolean getThreaded() {
        return this.threaded_;
    }

    @Override // l.InterfaceC22376
    public boolean hasBatchWrites() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC22376
    public boolean getBatchWrites() {
        return this.batchWrites_;
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
            abstractC14766.mo35093(1, this.threaded_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC14766.mo35093(2, this.batchWrites_);
        }
        getUnknownFields().writeTo(abstractC14766);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35080 = (this.bitField0_ & 1) != 0 ? AbstractC14766.m35080(1) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM35080 += AbstractC14766.m35080(2);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM35080;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC8709
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15319)) {
            return super.equals(obj);
        }
        C15319 c15319 = (C15319) obj;
        if (hasThreaded() != c15319.hasThreaded()) {
            return false;
        }
        if ((!hasThreaded() || getThreaded() == c15319.getThreaded()) && hasBatchWrites() == c15319.hasBatchWrites()) {
            return (!hasBatchWrites() || getBatchWrites() == c15319.getBatchWrites()) && getUnknownFields().equals(c15319.getUnknownFields());
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
        if (hasThreaded()) {
            iHashCode = C4153.m12551(iHashCode, 37, 1, 53) + C13997.m33481(getThreaded());
        }
        if (hasBatchWrites()) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + C13997.m33481(getBatchWrites());
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C15319 parseFrom(ByteBuffer byteBuffer) {
        return (C15319) PARSER.parseFrom(byteBuffer);
    }

    public static C15319 parseFrom(ByteBuffer byteBuffer, C17798 c17798) {
        return (C15319) PARSER.parseFrom(byteBuffer, c17798);
    }

    public static C15319 parseFrom(AbstractC5886 abstractC5886) {
        return (C15319) PARSER.parseFrom(abstractC5886);
    }

    public static C15319 parseFrom(AbstractC5886 abstractC5886, C17798 c17798) {
        return (C15319) PARSER.parseFrom(abstractC5886, c17798);
    }

    public static C15319 parseFrom(byte[] bArr) {
        return (C15319) PARSER.parseFrom(bArr);
    }

    public static C15319 parseFrom(byte[] bArr, C17798 c17798) {
        return (C15319) PARSER.parseFrom(bArr, c17798);
    }

    public static C15319 parseFrom(InputStream inputStream) {
        return (C15319) AbstractC4121.m12390(PARSER, inputStream);
    }

    public static C15319 parseFrom(InputStream inputStream, C17798 c17798) {
        return (C15319) AbstractC4121.m12391(PARSER, inputStream, c17798);
    }

    public static C15319 parseDelimitedFrom(InputStream inputStream) {
        return (C15319) AbstractC4121.m12376(PARSER, inputStream);
    }

    public static C15319 parseDelimitedFrom(InputStream inputStream, C17798 c17798) {
        return (C15319) AbstractC4121.m12377(PARSER, inputStream, c17798);
    }

    public static C15319 parseFrom(AbstractC7297 abstractC7297) {
        return (C15319) AbstractC4121.m12378(PARSER, abstractC7297);
    }

    public static C15319 parseFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        return (C15319) AbstractC4121.m12379(PARSER, abstractC7297, c17798);
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public C8265 newBuilderForType() {
        return newBuilder();
    }

    public static C8265 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C8265 newBuilder(C15319 c15319) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c15319);
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public C8265 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C8265(i) : new C8265(i).mergeFrom(this);
    }

    @Override // l.AbstractC8709
    public C8265 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C8265(interfaceC9415, 0);
    }

    public static C15319 getDefaultInstance() {
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
    public C15319 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
