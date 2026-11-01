package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ۢܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes4.dex */
public final class C11566 extends AbstractC21296 implements InterfaceC4860 {
    public int bitField0_;
    public long estimateCowSize_;
    public long estimateOpCountMax_;
    public C17310 fecDataExtentBuilder_;
    public C14052 fecDataExtent_;
    public C17310 fecExtentBuilder_;
    public C14052 fecExtent_;
    public int fecRoots_;
    public Object filesystemType_;
    public Object hashTreeAlgorithm_;
    public C17310 hashTreeDataExtentBuilder_;
    public C14052 hashTreeDataExtent_;
    public C17310 hashTreeExtentBuilder_;
    public C14052 hashTreeExtent_;
    public AbstractC7962 hashTreeSalt_;
    public C15969 mergeOperationsBuilder_;
    public List mergeOperations_;
    public C17310 newPartitionInfoBuilder_;
    public C16258 newPartitionInfo_;
    public C15969 newPartitionSignatureBuilder_;
    public List newPartitionSignature_;
    public C17310 oldPartitionInfoBuilder_;
    public C16258 oldPartitionInfo_;
    public C15969 operationsBuilder_;
    public List operations_;
    public Object partitionName_;
    public boolean postinstallOptional_;
    public Object postinstallPath_;
    public boolean runPostinstall_;
    public Object version_;

    public /* synthetic */ C11566(int i) {
        this();
    }

    public /* synthetic */ C11566(InterfaceC11316 interfaceC11316, int i) {
        this(interfaceC11316);
    }

    public static final C19244 getDescriptor() {
        return C21624.f68166xfb5a5ca0;
    }

    @Override // p067l.AbstractC21296
    public C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C21624.f68167x6772e31e;
        c11650.m26787(C10895.class, C11566.class);
        return c11650;
    }

    public C11566() {
        this.partitionName_ = "";
        this.postinstallPath_ = "";
        this.filesystemType_ = "";
        List list = Collections.EMPTY_LIST;
        this.newPartitionSignature_ = list;
        this.operations_ = list;
        this.hashTreeAlgorithm_ = "";
        this.hashTreeSalt_ = AbstractC7962.f20935;
        this.fecRoots_ = 2;
        this.version_ = "";
        this.mergeOperations_ = list;
        maybeForceBuilderInitialization();
    }

    public C11566(InterfaceC11316 interfaceC11316) {
        super(interfaceC11316);
        this.partitionName_ = "";
        this.postinstallPath_ = "";
        this.filesystemType_ = "";
        List list = Collections.EMPTY_LIST;
        this.newPartitionSignature_ = list;
        this.operations_ = list;
        this.hashTreeAlgorithm_ = "";
        this.hashTreeSalt_ = AbstractC7962.f20935;
        this.fecRoots_ = 2;
        this.version_ = "";
        this.mergeOperations_ = list;
        maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (AbstractC6285.alwaysUseFieldBuilders) {
            getNewPartitionSignatureFieldBuilder();
            getOldPartitionInfoFieldBuilder();
            getNewPartitionInfoFieldBuilder();
            getOperationsFieldBuilder();
            getHashTreeDataExtentFieldBuilder();
            getHashTreeExtentFieldBuilder();
            getFecDataExtentFieldBuilder();
            getFecExtentFieldBuilder();
            getMergeOperationsFieldBuilder();
        }
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public C11566 clear() {
        super.clear();
        this.bitField0_ = 0;
        this.partitionName_ = "";
        this.runPostinstall_ = false;
        this.postinstallPath_ = "";
        this.filesystemType_ = "";
        C15969 c15969 = this.newPartitionSignatureBuilder_;
        if (c15969 == null) {
            this.newPartitionSignature_ = Collections.EMPTY_LIST;
        } else {
            this.newPartitionSignature_ = null;
            c15969.m36302();
        }
        this.bitField0_ &= -17;
        this.oldPartitionInfo_ = null;
        C17310 c17310 = this.oldPartitionInfoBuilder_;
        if (c17310 != null) {
            c17310.m39271();
            this.oldPartitionInfoBuilder_ = null;
        }
        this.newPartitionInfo_ = null;
        C17310 c17311 = this.newPartitionInfoBuilder_;
        if (c17311 != null) {
            c17311.m39271();
            this.newPartitionInfoBuilder_ = null;
        }
        C15969 c159610 = this.operationsBuilder_;
        if (c159610 == null) {
            this.operations_ = Collections.EMPTY_LIST;
        } else {
            this.operations_ = null;
            c159610.m36302();
        }
        this.bitField0_ &= -129;
        this.postinstallOptional_ = false;
        this.hashTreeDataExtent_ = null;
        C17310 c17312 = this.hashTreeDataExtentBuilder_;
        if (c17312 != null) {
            c17312.m39271();
            this.hashTreeDataExtentBuilder_ = null;
        }
        this.hashTreeExtent_ = null;
        C17310 c17313 = this.hashTreeExtentBuilder_;
        if (c17313 != null) {
            c17313.m39271();
            this.hashTreeExtentBuilder_ = null;
        }
        this.hashTreeAlgorithm_ = "";
        this.hashTreeSalt_ = AbstractC7962.f20935;
        this.fecDataExtent_ = null;
        C17310 c17314 = this.fecDataExtentBuilder_;
        if (c17314 != null) {
            c17314.m39271();
            this.fecDataExtentBuilder_ = null;
        }
        this.fecExtent_ = null;
        C17310 c17315 = this.fecExtentBuilder_;
        if (c17315 != null) {
            c17315.m39271();
            this.fecExtentBuilder_ = null;
        }
        this.fecRoots_ = 2;
        this.version_ = "";
        C15969 c159611 = this.mergeOperationsBuilder_;
        if (c159611 == null) {
            this.mergeOperations_ = Collections.EMPTY_LIST;
        } else {
            this.mergeOperations_ = null;
            c159611.m36302();
        }
        this.bitField0_ &= -131073;
        this.estimateCowSize_ = 0L;
        this.estimateOpCountMax_ = 0L;
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public C19244 getDescriptorForType() {
        return C21624.f68166xfb5a5ca0;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public C10895 getDefaultInstanceForType() {
        return C10895.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public C10895 build() {
        C10895 c10895BuildPartial = buildPartial();
        if (c10895BuildPartial.isInitialized()) {
            return c10895BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c10895BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public C10895 buildPartial() {
        C10895 c10895 = new C10895(this);
        buildPartialRepeatedFields(c10895);
        if (this.bitField0_ != 0) {
            buildPartial0(c10895);
        }
        onBuilt();
        return c10895;
    }

    private void buildPartialRepeatedFields(C10895 c10895) {
        C15969 c15969 = this.newPartitionSignatureBuilder_;
        if (c15969 == null) {
            if ((this.bitField0_ & 16) != 0) {
                this.newPartitionSignature_ = C21562.unmodifiableList(this.newPartitionSignature_);
                this.bitField0_ &= -17;
            }
            c10895.newPartitionSignature_ = this.newPartitionSignature_;
        } else {
            c10895.newPartitionSignature_ = c15969.m36296();
        }
        C15969 c159610 = this.operationsBuilder_;
        if (c159610 == null) {
            if ((this.bitField0_ & 128) != 0) {
                this.operations_ = C21562.unmodifiableList(this.operations_);
                this.bitField0_ &= -129;
            }
            c10895.operations_ = this.operations_;
        } else {
            c10895.operations_ = c159610.m36296();
        }
        C15969 c159611 = this.mergeOperationsBuilder_;
        if (c159611 == null) {
            if ((this.bitField0_ & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
                this.mergeOperations_ = C21562.unmodifiableList(this.mergeOperations_);
                this.bitField0_ &= -131073;
            }
            c10895.mergeOperations_ = this.mergeOperations_;
            return;
        }
        c10895.mergeOperations_ = c159611.m36296();
    }

    private void buildPartial0(C10895 c10895) {
        int i;
        C14052 c14052;
        C14052 c14053;
        C14052 c14054;
        C14052 c14055;
        C16258 c16258;
        C16258 c16259;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c10895.partitionName_ = this.partitionName_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c10895.runPostinstall_ = this.runPostinstall_;
            i |= 2;
        }
        if ((i2 & 4) != 0) {
            c10895.postinstallPath_ = this.postinstallPath_;
            i |= 4;
        }
        if ((i2 & 8) != 0) {
            c10895.filesystemType_ = this.filesystemType_;
            i |= 8;
        }
        if ((i2 & 32) != 0) {
            C17310 c17310 = this.oldPartitionInfoBuilder_;
            if (c17310 == null) {
                c16259 = this.oldPartitionInfo_;
            } else {
                c16259 = (C16258) c17310.m39268();
            }
            c10895.oldPartitionInfo_ = c16259;
            i |= 16;
        }
        if ((i2 & 64) != 0) {
            C17310 c17311 = this.newPartitionInfoBuilder_;
            if (c17311 == null) {
                c16258 = this.newPartitionInfo_;
            } else {
                c16258 = (C16258) c17311.m39268();
            }
            c10895.newPartitionInfo_ = c16258;
            i |= 32;
        }
        if ((i2 & 256) != 0) {
            c10895.postinstallOptional_ = this.postinstallOptional_;
            i |= 64;
        }
        if ((i2 & 512) != 0) {
            C17310 c17312 = this.hashTreeDataExtentBuilder_;
            if (c17312 == null) {
                c14055 = this.hashTreeDataExtent_;
            } else {
                c14055 = (C14052) c17312.m39268();
            }
            c10895.hashTreeDataExtent_ = c14055;
            i |= 128;
        }
        if ((i2 & 1024) != 0) {
            C17310 c17313 = this.hashTreeExtentBuilder_;
            if (c17313 == null) {
                c14054 = this.hashTreeExtent_;
            } else {
                c14054 = (C14052) c17313.m39268();
            }
            c10895.hashTreeExtent_ = c14054;
            i |= 256;
        }
        if ((i2 & 2048) != 0) {
            c10895.hashTreeAlgorithm_ = this.hashTreeAlgorithm_;
            i |= 512;
        }
        if ((i2 & 4096) != 0) {
            c10895.hashTreeSalt_ = this.hashTreeSalt_;
            i |= 1024;
        }
        if ((i2 & 8192) != 0) {
            C17310 c17314 = this.fecDataExtentBuilder_;
            if (c17314 == null) {
                c14053 = this.fecDataExtent_;
            } else {
                c14053 = (C14052) c17314.m39268();
            }
            c10895.fecDataExtent_ = c14053;
            i |= 2048;
        }
        if ((i2 & 16384) != 0) {
            C17310 c17315 = this.fecExtentBuilder_;
            if (c17315 == null) {
                c14052 = this.fecExtent_;
            } else {
                c14052 = (C14052) c17315.m39268();
            }
            c10895.fecExtent_ = c14052;
            i |= 4096;
        }
        if ((i2 & 32768) != 0) {
            c10895.fecRoots_ = this.fecRoots_;
            i |= 8192;
        }
        if ((i2 & 65536) != 0) {
            c10895.version_ = this.version_;
            i |= 16384;
        }
        if ((262144 & i2) != 0) {
            c10895.estimateCowSize_ = this.estimateCowSize_;
            i |= 32768;
        }
        if ((i2 & 524288) != 0) {
            c10895.estimateOpCountMax_ = this.estimateOpCountMax_;
            i |= 65536;
        }
        c10895.bitField0_ |= i;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public C11566 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C10895) {
            return mergeFrom((C10895) interfaceC24548);
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    public C11566 mergeFrom(C10895 c10895) {
        if (c10895 == C10895.getDefaultInstance()) {
            return this;
        }
        if (c10895.hasPartitionName()) {
            this.partitionName_ = c10895.partitionName_;
            this.bitField0_ |= 1;
            onChanged();
        }
        if (c10895.hasRunPostinstall()) {
            setRunPostinstall(c10895.getRunPostinstall());
        }
        if (c10895.hasPostinstallPath()) {
            this.postinstallPath_ = c10895.postinstallPath_;
            this.bitField0_ |= 4;
            onChanged();
        }
        if (c10895.hasFilesystemType()) {
            this.filesystemType_ = c10895.filesystemType_;
            this.bitField0_ |= 8;
            onChanged();
        }
        if (this.newPartitionSignatureBuilder_ == null) {
            if (!c10895.newPartitionSignature_.isEmpty()) {
                if (this.newPartitionSignature_.isEmpty()) {
                    this.newPartitionSignature_ = c10895.newPartitionSignature_;
                    this.bitField0_ &= -17;
                } else {
                    ensureNewPartitionSignatureIsMutable();
                    this.newPartitionSignature_.addAll(c10895.newPartitionSignature_);
                }
                onChanged();
            }
        } else if (!c10895.newPartitionSignature_.isEmpty()) {
            if (this.newPartitionSignatureBuilder_.m36307()) {
                this.newPartitionSignatureBuilder_.m36305();
                this.newPartitionSignatureBuilder_ = null;
                this.newPartitionSignature_ = c10895.newPartitionSignature_;
                this.bitField0_ &= -17;
                this.newPartitionSignatureBuilder_ = AbstractC6285.alwaysUseFieldBuilders ? getNewPartitionSignatureFieldBuilder() : null;
            } else {
                this.newPartitionSignatureBuilder_.m36294(c10895.newPartitionSignature_);
            }
        }
        if (c10895.hasOldPartitionInfo()) {
            mergeOldPartitionInfo(c10895.getOldPartitionInfo());
        }
        if (c10895.hasNewPartitionInfo()) {
            mergeNewPartitionInfo(c10895.getNewPartitionInfo());
        }
        if (this.operationsBuilder_ == null) {
            if (!c10895.operations_.isEmpty()) {
                if (this.operations_.isEmpty()) {
                    this.operations_ = c10895.operations_;
                    this.bitField0_ &= -129;
                } else {
                    ensureOperationsIsMutable();
                    this.operations_.addAll(c10895.operations_);
                }
                onChanged();
            }
        } else if (!c10895.operations_.isEmpty()) {
            if (this.operationsBuilder_.m36307()) {
                this.operationsBuilder_.m36305();
                this.operationsBuilder_ = null;
                this.operations_ = c10895.operations_;
                this.bitField0_ &= -129;
                this.operationsBuilder_ = AbstractC6285.alwaysUseFieldBuilders ? getOperationsFieldBuilder() : null;
            } else {
                this.operationsBuilder_.m36294(c10895.operations_);
            }
        }
        if (c10895.hasPostinstallOptional()) {
            setPostinstallOptional(c10895.getPostinstallOptional());
        }
        if (c10895.hasHashTreeDataExtent()) {
            mergeHashTreeDataExtent(c10895.getHashTreeDataExtent());
        }
        if (c10895.hasHashTreeExtent()) {
            mergeHashTreeExtent(c10895.getHashTreeExtent());
        }
        if (c10895.hasHashTreeAlgorithm()) {
            this.hashTreeAlgorithm_ = c10895.hashTreeAlgorithm_;
            this.bitField0_ |= 2048;
            onChanged();
        }
        if (c10895.hasHashTreeSalt()) {
            setHashTreeSalt(c10895.getHashTreeSalt());
        }
        if (c10895.hasFecDataExtent()) {
            mergeFecDataExtent(c10895.getFecDataExtent());
        }
        if (c10895.hasFecExtent()) {
            mergeFecExtent(c10895.getFecExtent());
        }
        if (c10895.hasFecRoots()) {
            setFecRoots(c10895.getFecRoots());
        }
        if (c10895.hasVersion()) {
            this.version_ = c10895.version_;
            this.bitField0_ |= 65536;
            onChanged();
        }
        if (this.mergeOperationsBuilder_ == null) {
            if (!c10895.mergeOperations_.isEmpty()) {
                if (this.mergeOperations_.isEmpty()) {
                    this.mergeOperations_ = c10895.mergeOperations_;
                    this.bitField0_ &= -131073;
                } else {
                    ensureMergeOperationsIsMutable();
                    this.mergeOperations_.addAll(c10895.mergeOperations_);
                }
                onChanged();
            }
        } else if (!c10895.mergeOperations_.isEmpty()) {
            if (this.mergeOperationsBuilder_.m36307()) {
                this.mergeOperationsBuilder_.m36305();
                this.mergeOperationsBuilder_ = null;
                this.mergeOperations_ = c10895.mergeOperations_;
                this.bitField0_ &= -131073;
                this.mergeOperationsBuilder_ = AbstractC6285.alwaysUseFieldBuilders ? getMergeOperationsFieldBuilder() : null;
            } else {
                this.mergeOperationsBuilder_.m36294(c10895.mergeOperations_);
            }
        }
        if (c10895.hasEstimateCowSize()) {
            setEstimateCowSize(c10895.getEstimateCowSize());
        }
        if (c10895.hasEstimateOpCountMax()) {
            setEstimateOpCountMax(c10895.getEstimateOpCountMax());
        }
        mergeUnknownFields(c10895.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        if (!hasPartitionName()) {
            return false;
        }
        for (int i = 0; i < getOperationsCount(); i++) {
            if (!getOperations(i).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public C11566 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    switch (iMo21535) {
                        case 0:
                            break;
                        case 10:
                            this.partitionName_ = abstractC9303.mo21534();
                            this.bitField0_ |= 1;
                            continue;
                        case 16:
                            this.runPostinstall_ = abstractC9303.mo21539();
                            this.bitField0_ |= 2;
                            continue;
                        case 26:
                            this.postinstallPath_ = abstractC9303.mo21534();
                            this.bitField0_ |= 4;
                            continue;
                        case 34:
                            this.filesystemType_ = abstractC9303.mo21534();
                            this.bitField0_ |= 8;
                            continue;
                        case 42:
                            C20954 c20954 = (C20954) abstractC9303.mo21520(C20954.parser(), c19283);
                            C15969 c15969 = this.newPartitionSignatureBuilder_;
                            if (c15969 == null) {
                                ensureNewPartitionSignatureIsMutable();
                                this.newPartitionSignature_.add(c20954);
                            } else {
                                c15969.m36299(c20954);
                                continue;
                            }
                            break;
                        case 50:
                            abstractC9303.mo21524(getOldPartitionInfoFieldBuilder().m39273(), c19283);
                            this.bitField0_ |= 32;
                            continue;
                        case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                            abstractC9303.mo21524(getNewPartitionInfoFieldBuilder().m39273(), c19283);
                            this.bitField0_ |= 64;
                            continue;
                        case 66:
                            C4189 c4189 = (C4189) abstractC9303.mo21520(C4189.parser(), c19283);
                            C15969 c159610 = this.operationsBuilder_;
                            if (c159610 == null) {
                                ensureOperationsIsMutable();
                                this.operations_.add(c4189);
                            } else {
                                c159610.m36299(c4189);
                                continue;
                            }
                            break;
                        case 72:
                            this.postinstallOptional_ = abstractC9303.mo21539();
                            this.bitField0_ |= 256;
                            continue;
                        case 82:
                            abstractC9303.mo21524(getHashTreeDataExtentFieldBuilder().m39273(), c19283);
                            this.bitField0_ |= 512;
                            continue;
                        case 90:
                            abstractC9303.mo21524(getHashTreeExtentFieldBuilder().m39273(), c19283);
                            this.bitField0_ |= 1024;
                            continue;
                        case 98:
                            this.hashTreeAlgorithm_ = abstractC9303.mo21534();
                            this.bitField0_ |= 2048;
                            continue;
                        case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                            this.hashTreeSalt_ = abstractC9303.mo21534();
                            this.bitField0_ |= 4096;
                            continue;
                        case 114:
                            abstractC9303.mo21524(getFecDataExtentFieldBuilder().m39273(), c19283);
                            this.bitField0_ |= 8192;
                            continue;
                        case 122:
                            abstractC9303.mo21524(getFecExtentFieldBuilder().m39273(), c19283);
                            this.bitField0_ |= 16384;
                            continue;
                        case 128:
                            this.fecRoots_ = abstractC9303.mo21545();
                            this.bitField0_ |= 32768;
                            continue;
                        case 138:
                            this.version_ = abstractC9303.mo21534();
                            this.bitField0_ |= 65536;
                            continue;
                        case 146:
                            C8688 c8688 = (C8688) abstractC9303.mo21520(C8688.parser(), c19283);
                            C15969 c159611 = this.mergeOperationsBuilder_;
                            if (c159611 == null) {
                                ensureMergeOperationsIsMutable();
                                this.mergeOperations_.add(c8688);
                            } else {
                                c159611.m36299(c8688);
                                continue;
                            }
                            break;
                        case 152:
                            this.estimateCowSize_ = abstractC9303.mo21546();
                            this.bitField0_ |= 262144;
                            continue;
                        case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                            this.estimateOpCountMax_ = abstractC9303.mo21546();
                            this.bitField0_ |= 524288;
                            continue;
                        default:
                            if (!super.parseUnknownField(abstractC9303, c19283, iMo21535)) {
                                break;
                            }
                            break;
                    }
                    z = true;
                } catch (C4293 e) {
                    throw e.m8712();
                }
            } catch (Throwable th) {
                onChanged();
                throw th;
            }
        }
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC4860
    public boolean hasPartitionName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p067l.InterfaceC4860
    public String getPartitionName() {
        Object obj = this.partitionName_;
        if (!(obj instanceof String)) {
            AbstractC7962 abstractC7962 = (AbstractC7962) obj;
            String strM18427 = abstractC7962.m18427();
            if (abstractC7962.mo18426()) {
                this.partitionName_ = strM18427;
            }
            return strM18427;
        }
        return (String) obj;
    }

    @Override // p067l.InterfaceC4860
    public AbstractC7962 getPartitionNameBytes() {
        Object obj = this.partitionName_;
        if (obj instanceof String) {
            AbstractC7962 abstractC7962M18417 = AbstractC7962.m18417((String) obj);
            this.partitionName_ = abstractC7962M18417;
            return abstractC7962M18417;
        }
        return (AbstractC7962) obj;
    }

    public C11566 setPartitionName(String str) {
        str.getClass();
        this.partitionName_ = str;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    public C11566 clearPartitionName() {
        this.partitionName_ = C10895.getDefaultInstance().getPartitionName();
        this.bitField0_ &= -2;
        onChanged();
        return this;
    }

    public C11566 setPartitionNameBytes(AbstractC7962 abstractC7962) {
        abstractC7962.getClass();
        this.partitionName_ = abstractC7962;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC4860
    public boolean hasRunPostinstall() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p067l.InterfaceC4860
    public boolean getRunPostinstall() {
        return this.runPostinstall_;
    }

    public C11566 setRunPostinstall(boolean z) {
        this.runPostinstall_ = z;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C11566 clearRunPostinstall() {
        this.bitField0_ &= -3;
        this.runPostinstall_ = false;
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC4860
    public boolean hasPostinstallPath() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // p067l.InterfaceC4860
    public String getPostinstallPath() {
        Object obj = this.postinstallPath_;
        if (!(obj instanceof String)) {
            AbstractC7962 abstractC7962 = (AbstractC7962) obj;
            String strM18427 = abstractC7962.m18427();
            if (abstractC7962.mo18426()) {
                this.postinstallPath_ = strM18427;
            }
            return strM18427;
        }
        return (String) obj;
    }

    @Override // p067l.InterfaceC4860
    public AbstractC7962 getPostinstallPathBytes() {
        Object obj = this.postinstallPath_;
        if (obj instanceof String) {
            AbstractC7962 abstractC7962M18417 = AbstractC7962.m18417((String) obj);
            this.postinstallPath_ = abstractC7962M18417;
            return abstractC7962M18417;
        }
        return (AbstractC7962) obj;
    }

    public C11566 setPostinstallPath(String str) {
        str.getClass();
        this.postinstallPath_ = str;
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C11566 clearPostinstallPath() {
        this.postinstallPath_ = C10895.getDefaultInstance().getPostinstallPath();
        this.bitField0_ &= -5;
        onChanged();
        return this;
    }

    public C11566 setPostinstallPathBytes(AbstractC7962 abstractC7962) {
        abstractC7962.getClass();
        this.postinstallPath_ = abstractC7962;
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC4860
    public boolean hasFilesystemType() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // p067l.InterfaceC4860
    public String getFilesystemType() {
        Object obj = this.filesystemType_;
        if (!(obj instanceof String)) {
            AbstractC7962 abstractC7962 = (AbstractC7962) obj;
            String strM18427 = abstractC7962.m18427();
            if (abstractC7962.mo18426()) {
                this.filesystemType_ = strM18427;
            }
            return strM18427;
        }
        return (String) obj;
    }

    @Override // p067l.InterfaceC4860
    public AbstractC7962 getFilesystemTypeBytes() {
        Object obj = this.filesystemType_;
        if (obj instanceof String) {
            AbstractC7962 abstractC7962M18417 = AbstractC7962.m18417((String) obj);
            this.filesystemType_ = abstractC7962M18417;
            return abstractC7962M18417;
        }
        return (AbstractC7962) obj;
    }

    public C11566 setFilesystemType(String str) {
        str.getClass();
        this.filesystemType_ = str;
        this.bitField0_ |= 8;
        onChanged();
        return this;
    }

    public C11566 clearFilesystemType() {
        this.filesystemType_ = C10895.getDefaultInstance().getFilesystemType();
        this.bitField0_ &= -9;
        onChanged();
        return this;
    }

    public C11566 setFilesystemTypeBytes(AbstractC7962 abstractC7962) {
        abstractC7962.getClass();
        this.filesystemType_ = abstractC7962;
        this.bitField0_ |= 8;
        onChanged();
        return this;
    }

    private void ensureNewPartitionSignatureIsMutable() {
        if ((this.bitField0_ & 16) == 0) {
            this.newPartitionSignature_ = new ArrayList(this.newPartitionSignature_);
            this.bitField0_ |= 16;
        }
    }

    @Override // p067l.InterfaceC4860
    public List getNewPartitionSignatureList() {
        C15969 c15969 = this.newPartitionSignatureBuilder_;
        if (c15969 == null) {
            return C21562.unmodifiableList(this.newPartitionSignature_);
        }
        return c15969.m36308();
    }

    @Override // p067l.InterfaceC4860
    public int getNewPartitionSignatureCount() {
        C15969 c15969 = this.newPartitionSignatureBuilder_;
        if (c15969 == null) {
            return this.newPartitionSignature_.size();
        }
        return c15969.m36300();
    }

    @Override // p067l.InterfaceC4860
    public C20954 getNewPartitionSignature(int i) {
        C15969 c15969 = this.newPartitionSignatureBuilder_;
        if (c15969 == null) {
            return (C20954) this.newPartitionSignature_.get(i);
        }
        return (C20954) c15969.m36297(i);
    }

    public C11566 setNewPartitionSignature(int i, C20954 c20954) {
        C15969 c15969 = this.newPartitionSignatureBuilder_;
        if (c15969 == null) {
            c20954.getClass();
            ensureNewPartitionSignatureIsMutable();
            this.newPartitionSignature_.set(i, c20954);
            onChanged();
            return this;
        }
        c15969.m36303(i, c20954);
        return this;
    }

    public C11566 setNewPartitionSignature(int i, C20283 c20283) {
        C15969 c15969 = this.newPartitionSignatureBuilder_;
        if (c15969 == null) {
            ensureNewPartitionSignatureIsMutable();
            this.newPartitionSignature_.set(i, c20283.build());
            onChanged();
            return this;
        }
        c15969.m36303(i, c20283.build());
        return this;
    }

    public C11566 addNewPartitionSignature(C20954 c20954) {
        C15969 c15969 = this.newPartitionSignatureBuilder_;
        if (c15969 == null) {
            c20954.getClass();
            ensureNewPartitionSignatureIsMutable();
            this.newPartitionSignature_.add(c20954);
            onChanged();
            return this;
        }
        c15969.m36299(c20954);
        return this;
    }

    public C11566 addNewPartitionSignature(int i, C20954 c20954) {
        C15969 c15969 = this.newPartitionSignatureBuilder_;
        if (c15969 == null) {
            c20954.getClass();
            ensureNewPartitionSignatureIsMutable();
            this.newPartitionSignature_.add(i, c20954);
            onChanged();
            return this;
        }
        c15969.m36298(i, c20954);
        return this;
    }

    public C11566 addNewPartitionSignature(C20283 c20283) {
        C15969 c15969 = this.newPartitionSignatureBuilder_;
        if (c15969 == null) {
            ensureNewPartitionSignatureIsMutable();
            this.newPartitionSignature_.add(c20283.build());
            onChanged();
            return this;
        }
        c15969.m36299(c20283.build());
        return this;
    }

    public C11566 addNewPartitionSignature(int i, C20283 c20283) {
        C15969 c15969 = this.newPartitionSignatureBuilder_;
        if (c15969 == null) {
            ensureNewPartitionSignatureIsMutable();
            this.newPartitionSignature_.add(i, c20283.build());
            onChanged();
            return this;
        }
        c15969.m36298(i, c20283.build());
        return this;
    }

    public C11566 addAllNewPartitionSignature(Iterable iterable) {
        C15969 c15969 = this.newPartitionSignatureBuilder_;
        if (c15969 == null) {
            ensureNewPartitionSignatureIsMutable();
            AbstractC4610.m9738(iterable, this.newPartitionSignature_);
            onChanged();
            return this;
        }
        c15969.m36294(iterable);
        return this;
    }

    public C11566 clearNewPartitionSignature() {
        C15969 c15969 = this.newPartitionSignatureBuilder_;
        if (c15969 == null) {
            this.newPartitionSignature_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }
        c15969.m36302();
        return this;
    }

    public C11566 removeNewPartitionSignature(int i) {
        C15969 c15969 = this.newPartitionSignatureBuilder_;
        if (c15969 == null) {
            ensureNewPartitionSignatureIsMutable();
            this.newPartitionSignature_.remove(i);
            onChanged();
            return this;
        }
        c15969.m36306(i);
        return this;
    }

    public C20283 getNewPartitionSignatureBuilder(int i) {
        return (C20283) getNewPartitionSignatureFieldBuilder().m36291(i);
    }

    @Override // p067l.InterfaceC4860
    public InterfaceC7542 getNewPartitionSignatureOrBuilder(int i) {
        C15969 c15969 = this.newPartitionSignatureBuilder_;
        if (c15969 == null) {
            return (InterfaceC7542) this.newPartitionSignature_.get(i);
        }
        return (InterfaceC7542) c15969.m36301(i);
    }

    @Override // p067l.InterfaceC4860
    public List getNewPartitionSignatureOrBuilderList() {
        C15969 c15969 = this.newPartitionSignatureBuilder_;
        if (c15969 != null) {
            return c15969.m36295();
        }
        return C21562.unmodifiableList(this.newPartitionSignature_);
    }

    public C20283 addNewPartitionSignatureBuilder() {
        return (C20283) getNewPartitionSignatureFieldBuilder().m36293(C20954.getDefaultInstance());
    }

    public C20283 addNewPartitionSignatureBuilder(int i) {
        return (C20283) getNewPartitionSignatureFieldBuilder().m36292(i, C20954.getDefaultInstance());
    }

    public List getNewPartitionSignatureBuilderList() {
        return getNewPartitionSignatureFieldBuilder().m36304();
    }

    private C15969 getNewPartitionSignatureFieldBuilder() {
        if (this.newPartitionSignatureBuilder_ == null) {
            this.newPartitionSignatureBuilder_ = new C15969(this.newPartitionSignature_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
            this.newPartitionSignature_ = null;
        }
        return this.newPartitionSignatureBuilder_;
    }

    @Override // p067l.InterfaceC4860
    public boolean hasOldPartitionInfo() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // p067l.InterfaceC4860
    public C16258 getOldPartitionInfo() {
        C17310 c17310 = this.oldPartitionInfoBuilder_;
        if (c17310 == null) {
            C16258 c16258 = this.oldPartitionInfo_;
            return c16258 == null ? C16258.getDefaultInstance() : c16258;
        }
        return (C16258) c17310.m39272();
    }

    public C11566 setOldPartitionInfo(C16258 c16258) {
        C17310 c17310 = this.oldPartitionInfoBuilder_;
        if (c17310 == null) {
            c16258.getClass();
            this.oldPartitionInfo_ = c16258;
        } else {
            c17310.m39269(c16258);
        }
        this.bitField0_ |= 32;
        onChanged();
        return this;
    }

    public C11566 setOldPartitionInfo(C18941 c18941) {
        C17310 c17310 = this.oldPartitionInfoBuilder_;
        if (c17310 == null) {
            this.oldPartitionInfo_ = c18941.build();
        } else {
            c17310.m39269(c18941.build());
        }
        this.bitField0_ |= 32;
        onChanged();
        return this;
    }

    public C11566 mergeOldPartitionInfo(C16258 c16258) {
        C16258 c16259;
        C17310 c17310 = this.oldPartitionInfoBuilder_;
        if (c17310 == null) {
            if ((this.bitField0_ & 32) != 0 && (c16259 = this.oldPartitionInfo_) != null && c16259 != C16258.getDefaultInstance()) {
                getOldPartitionInfoBuilder().mergeFrom(c16258);
            } else {
                this.oldPartitionInfo_ = c16258;
            }
        } else {
            c17310.m39267(c16258);
        }
        if (this.oldPartitionInfo_ != null) {
            this.bitField0_ |= 32;
            onChanged();
        }
        return this;
    }

    public C11566 clearOldPartitionInfo() {
        this.bitField0_ &= -33;
        this.oldPartitionInfo_ = null;
        C17310 c17310 = this.oldPartitionInfoBuilder_;
        if (c17310 != null) {
            c17310.m39271();
            this.oldPartitionInfoBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C18941 getOldPartitionInfoBuilder() {
        this.bitField0_ |= 32;
        onChanged();
        return (C18941) getOldPartitionInfoFieldBuilder().m39273();
    }

    @Override // p067l.InterfaceC4860
    public InterfaceC8883 getOldPartitionInfoOrBuilder() {
        C17310 c17310 = this.oldPartitionInfoBuilder_;
        if (c17310 != null) {
            return (InterfaceC8883) c17310.m39270();
        }
        C16258 c16258 = this.oldPartitionInfo_;
        return c16258 == null ? C16258.getDefaultInstance() : c16258;
    }

    private C17310 getOldPartitionInfoFieldBuilder() {
        if (this.oldPartitionInfoBuilder_ == null) {
            this.oldPartitionInfoBuilder_ = new C17310(getOldPartitionInfo(), getParentForChildren(), isClean());
            this.oldPartitionInfo_ = null;
        }
        return this.oldPartitionInfoBuilder_;
    }

    @Override // p067l.InterfaceC4860
    public boolean hasNewPartitionInfo() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // p067l.InterfaceC4860
    public C16258 getNewPartitionInfo() {
        C17310 c17310 = this.newPartitionInfoBuilder_;
        if (c17310 == null) {
            C16258 c16258 = this.newPartitionInfo_;
            return c16258 == null ? C16258.getDefaultInstance() : c16258;
        }
        return (C16258) c17310.m39272();
    }

    public C11566 setNewPartitionInfo(C16258 c16258) {
        C17310 c17310 = this.newPartitionInfoBuilder_;
        if (c17310 == null) {
            c16258.getClass();
            this.newPartitionInfo_ = c16258;
        } else {
            c17310.m39269(c16258);
        }
        this.bitField0_ |= 64;
        onChanged();
        return this;
    }

    public C11566 setNewPartitionInfo(C18941 c18941) {
        C17310 c17310 = this.newPartitionInfoBuilder_;
        if (c17310 == null) {
            this.newPartitionInfo_ = c18941.build();
        } else {
            c17310.m39269(c18941.build());
        }
        this.bitField0_ |= 64;
        onChanged();
        return this;
    }

    public C11566 mergeNewPartitionInfo(C16258 c16258) {
        C16258 c16259;
        C17310 c17310 = this.newPartitionInfoBuilder_;
        if (c17310 == null) {
            if ((this.bitField0_ & 64) != 0 && (c16259 = this.newPartitionInfo_) != null && c16259 != C16258.getDefaultInstance()) {
                getNewPartitionInfoBuilder().mergeFrom(c16258);
            } else {
                this.newPartitionInfo_ = c16258;
            }
        } else {
            c17310.m39267(c16258);
        }
        if (this.newPartitionInfo_ != null) {
            this.bitField0_ |= 64;
            onChanged();
        }
        return this;
    }

    public C11566 clearNewPartitionInfo() {
        this.bitField0_ &= -65;
        this.newPartitionInfo_ = null;
        C17310 c17310 = this.newPartitionInfoBuilder_;
        if (c17310 != null) {
            c17310.m39271();
            this.newPartitionInfoBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C18941 getNewPartitionInfoBuilder() {
        this.bitField0_ |= 64;
        onChanged();
        return (C18941) getNewPartitionInfoFieldBuilder().m39273();
    }

    @Override // p067l.InterfaceC4860
    public InterfaceC8883 getNewPartitionInfoOrBuilder() {
        C17310 c17310 = this.newPartitionInfoBuilder_;
        if (c17310 != null) {
            return (InterfaceC8883) c17310.m39270();
        }
        C16258 c16258 = this.newPartitionInfo_;
        return c16258 == null ? C16258.getDefaultInstance() : c16258;
    }

    private C17310 getNewPartitionInfoFieldBuilder() {
        if (this.newPartitionInfoBuilder_ == null) {
            this.newPartitionInfoBuilder_ = new C17310(getNewPartitionInfo(), getParentForChildren(), isClean());
            this.newPartitionInfo_ = null;
        }
        return this.newPartitionInfoBuilder_;
    }

    private void ensureOperationsIsMutable() {
        if ((this.bitField0_ & 128) == 0) {
            this.operations_ = new ArrayList(this.operations_);
            this.bitField0_ |= 128;
        }
    }

    @Override // p067l.InterfaceC4860
    public List getOperationsList() {
        C15969 c15969 = this.operationsBuilder_;
        if (c15969 == null) {
            return C21562.unmodifiableList(this.operations_);
        }
        return c15969.m36308();
    }

    @Override // p067l.InterfaceC4860
    public int getOperationsCount() {
        C15969 c15969 = this.operationsBuilder_;
        if (c15969 == null) {
            return this.operations_.size();
        }
        return c15969.m36300();
    }

    @Override // p067l.InterfaceC4860
    public C4189 getOperations(int i) {
        C15969 c15969 = this.operationsBuilder_;
        if (c15969 == null) {
            return (C4189) this.operations_.get(i);
        }
        return (C4189) c15969.m36297(i);
    }

    public C11566 setOperations(int i, C4189 c4189) {
        C15969 c15969 = this.operationsBuilder_;
        if (c15969 == null) {
            c4189.getClass();
            ensureOperationsIsMutable();
            this.operations_.set(i, c4189);
            onChanged();
            return this;
        }
        c15969.m36303(i, c4189);
        return this;
    }

    public C11566 setOperations(int i, C24110 c24110) {
        C15969 c15969 = this.operationsBuilder_;
        if (c15969 == null) {
            ensureOperationsIsMutable();
            this.operations_.set(i, c24110.build());
            onChanged();
            return this;
        }
        c15969.m36303(i, c24110.build());
        return this;
    }

    public C11566 addOperations(C4189 c4189) {
        C15969 c15969 = this.operationsBuilder_;
        if (c15969 == null) {
            c4189.getClass();
            ensureOperationsIsMutable();
            this.operations_.add(c4189);
            onChanged();
            return this;
        }
        c15969.m36299(c4189);
        return this;
    }

    public C11566 addOperations(int i, C4189 c4189) {
        C15969 c15969 = this.operationsBuilder_;
        if (c15969 == null) {
            c4189.getClass();
            ensureOperationsIsMutable();
            this.operations_.add(i, c4189);
            onChanged();
            return this;
        }
        c15969.m36298(i, c4189);
        return this;
    }

    public C11566 addOperations(C24110 c24110) {
        C15969 c15969 = this.operationsBuilder_;
        if (c15969 == null) {
            ensureOperationsIsMutable();
            this.operations_.add(c24110.build());
            onChanged();
            return this;
        }
        c15969.m36299(c24110.build());
        return this;
    }

    public C11566 addOperations(int i, C24110 c24110) {
        C15969 c15969 = this.operationsBuilder_;
        if (c15969 == null) {
            ensureOperationsIsMutable();
            this.operations_.add(i, c24110.build());
            onChanged();
            return this;
        }
        c15969.m36298(i, c24110.build());
        return this;
    }

    public C11566 addAllOperations(Iterable iterable) {
        C15969 c15969 = this.operationsBuilder_;
        if (c15969 == null) {
            ensureOperationsIsMutable();
            AbstractC4610.m9738(iterable, this.operations_);
            onChanged();
            return this;
        }
        c15969.m36294(iterable);
        return this;
    }

    public C11566 clearOperations() {
        C15969 c15969 = this.operationsBuilder_;
        if (c15969 == null) {
            this.operations_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -129;
            onChanged();
            return this;
        }
        c15969.m36302();
        return this;
    }

    public C11566 removeOperations(int i) {
        C15969 c15969 = this.operationsBuilder_;
        if (c15969 == null) {
            ensureOperationsIsMutable();
            this.operations_.remove(i);
            onChanged();
            return this;
        }
        c15969.m36306(i);
        return this;
    }

    public C24110 getOperationsBuilder(int i) {
        return (C24110) getOperationsFieldBuilder().m36291(i);
    }

    @Override // p067l.InterfaceC4860
    public InterfaceC18270 getOperationsOrBuilder(int i) {
        C15969 c15969 = this.operationsBuilder_;
        if (c15969 == null) {
            return (InterfaceC18270) this.operations_.get(i);
        }
        return (InterfaceC18270) c15969.m36301(i);
    }

    @Override // p067l.InterfaceC4860
    public List getOperationsOrBuilderList() {
        C15969 c15969 = this.operationsBuilder_;
        if (c15969 != null) {
            return c15969.m36295();
        }
        return C21562.unmodifiableList(this.operations_);
    }

    public C24110 addOperationsBuilder() {
        return (C24110) getOperationsFieldBuilder().m36293(C4189.getDefaultInstance());
    }

    public C24110 addOperationsBuilder(int i) {
        return (C24110) getOperationsFieldBuilder().m36292(i, C4189.getDefaultInstance());
    }

    public List getOperationsBuilderList() {
        return getOperationsFieldBuilder().m36304();
    }

    private C15969 getOperationsFieldBuilder() {
        if (this.operationsBuilder_ == null) {
            this.operationsBuilder_ = new C15969(this.operations_, (this.bitField0_ & 128) != 0, getParentForChildren(), isClean());
            this.operations_ = null;
        }
        return this.operationsBuilder_;
    }

    @Override // p067l.InterfaceC4860
    public boolean hasPostinstallOptional() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // p067l.InterfaceC4860
    public boolean getPostinstallOptional() {
        return this.postinstallOptional_;
    }

    public C11566 setPostinstallOptional(boolean z) {
        this.postinstallOptional_ = z;
        this.bitField0_ |= 256;
        onChanged();
        return this;
    }

    public C11566 clearPostinstallOptional() {
        this.bitField0_ &= -257;
        this.postinstallOptional_ = false;
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC4860
    public boolean hasHashTreeDataExtent() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // p067l.InterfaceC4860
    public C14052 getHashTreeDataExtent() {
        C17310 c17310 = this.hashTreeDataExtentBuilder_;
        if (c17310 == null) {
            C14052 c14052 = this.hashTreeDataExtent_;
            return c14052 == null ? C14052.getDefaultInstance() : c14052;
        }
        return (C14052) c17310.m39272();
    }

    public C11566 setHashTreeDataExtent(C14052 c14052) {
        C17310 c17310 = this.hashTreeDataExtentBuilder_;
        if (c17310 == null) {
            c14052.getClass();
            this.hashTreeDataExtent_ = c14052;
        } else {
            c17310.m39269(c14052);
        }
        this.bitField0_ |= 512;
        onChanged();
        return this;
    }

    public C11566 setHashTreeDataExtent(C14722 c14722) {
        C17310 c17310 = this.hashTreeDataExtentBuilder_;
        if (c17310 == null) {
            this.hashTreeDataExtent_ = c14722.build();
        } else {
            c17310.m39269(c14722.build());
        }
        this.bitField0_ |= 512;
        onChanged();
        return this;
    }

    public C11566 mergeHashTreeDataExtent(C14052 c14052) {
        C14052 c14053;
        C17310 c17310 = this.hashTreeDataExtentBuilder_;
        if (c17310 == null) {
            if ((this.bitField0_ & 512) != 0 && (c14053 = this.hashTreeDataExtent_) != null && c14053 != C14052.getDefaultInstance()) {
                getHashTreeDataExtentBuilder().mergeFrom(c14052);
            } else {
                this.hashTreeDataExtent_ = c14052;
            }
        } else {
            c17310.m39267(c14052);
        }
        if (this.hashTreeDataExtent_ != null) {
            this.bitField0_ |= 512;
            onChanged();
        }
        return this;
    }

    public C11566 clearHashTreeDataExtent() {
        this.bitField0_ &= -513;
        this.hashTreeDataExtent_ = null;
        C17310 c17310 = this.hashTreeDataExtentBuilder_;
        if (c17310 != null) {
            c17310.m39271();
            this.hashTreeDataExtentBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C14722 getHashTreeDataExtentBuilder() {
        this.bitField0_ |= 512;
        onChanged();
        return (C14722) getHashTreeDataExtentFieldBuilder().m39273();
    }

    @Override // p067l.InterfaceC4860
    public InterfaceC8017 getHashTreeDataExtentOrBuilder() {
        C17310 c17310 = this.hashTreeDataExtentBuilder_;
        if (c17310 != null) {
            return (InterfaceC8017) c17310.m39270();
        }
        C14052 c14052 = this.hashTreeDataExtent_;
        return c14052 == null ? C14052.getDefaultInstance() : c14052;
    }

    private C17310 getHashTreeDataExtentFieldBuilder() {
        if (this.hashTreeDataExtentBuilder_ == null) {
            this.hashTreeDataExtentBuilder_ = new C17310(getHashTreeDataExtent(), getParentForChildren(), isClean());
            this.hashTreeDataExtent_ = null;
        }
        return this.hashTreeDataExtentBuilder_;
    }

    @Override // p067l.InterfaceC4860
    public boolean hasHashTreeExtent() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // p067l.InterfaceC4860
    public C14052 getHashTreeExtent() {
        C17310 c17310 = this.hashTreeExtentBuilder_;
        if (c17310 == null) {
            C14052 c14052 = this.hashTreeExtent_;
            return c14052 == null ? C14052.getDefaultInstance() : c14052;
        }
        return (C14052) c17310.m39272();
    }

    public C11566 setHashTreeExtent(C14052 c14052) {
        C17310 c17310 = this.hashTreeExtentBuilder_;
        if (c17310 == null) {
            c14052.getClass();
            this.hashTreeExtent_ = c14052;
        } else {
            c17310.m39269(c14052);
        }
        this.bitField0_ |= 1024;
        onChanged();
        return this;
    }

    public C11566 setHashTreeExtent(C14722 c14722) {
        C17310 c17310 = this.hashTreeExtentBuilder_;
        if (c17310 == null) {
            this.hashTreeExtent_ = c14722.build();
        } else {
            c17310.m39269(c14722.build());
        }
        this.bitField0_ |= 1024;
        onChanged();
        return this;
    }

    public C11566 mergeHashTreeExtent(C14052 c14052) {
        C14052 c14053;
        C17310 c17310 = this.hashTreeExtentBuilder_;
        if (c17310 == null) {
            if ((this.bitField0_ & 1024) != 0 && (c14053 = this.hashTreeExtent_) != null && c14053 != C14052.getDefaultInstance()) {
                getHashTreeExtentBuilder().mergeFrom(c14052);
            } else {
                this.hashTreeExtent_ = c14052;
            }
        } else {
            c17310.m39267(c14052);
        }
        if (this.hashTreeExtent_ != null) {
            this.bitField0_ |= 1024;
            onChanged();
        }
        return this;
    }

    public C11566 clearHashTreeExtent() {
        this.bitField0_ &= -1025;
        this.hashTreeExtent_ = null;
        C17310 c17310 = this.hashTreeExtentBuilder_;
        if (c17310 != null) {
            c17310.m39271();
            this.hashTreeExtentBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C14722 getHashTreeExtentBuilder() {
        this.bitField0_ |= 1024;
        onChanged();
        return (C14722) getHashTreeExtentFieldBuilder().m39273();
    }

    @Override // p067l.InterfaceC4860
    public InterfaceC8017 getHashTreeExtentOrBuilder() {
        C17310 c17310 = this.hashTreeExtentBuilder_;
        if (c17310 != null) {
            return (InterfaceC8017) c17310.m39270();
        }
        C14052 c14052 = this.hashTreeExtent_;
        return c14052 == null ? C14052.getDefaultInstance() : c14052;
    }

    private C17310 getHashTreeExtentFieldBuilder() {
        if (this.hashTreeExtentBuilder_ == null) {
            this.hashTreeExtentBuilder_ = new C17310(getHashTreeExtent(), getParentForChildren(), isClean());
            this.hashTreeExtent_ = null;
        }
        return this.hashTreeExtentBuilder_;
    }

    @Override // p067l.InterfaceC4860
    public boolean hasHashTreeAlgorithm() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // p067l.InterfaceC4860
    public String getHashTreeAlgorithm() {
        Object obj = this.hashTreeAlgorithm_;
        if (!(obj instanceof String)) {
            AbstractC7962 abstractC7962 = (AbstractC7962) obj;
            String strM18427 = abstractC7962.m18427();
            if (abstractC7962.mo18426()) {
                this.hashTreeAlgorithm_ = strM18427;
            }
            return strM18427;
        }
        return (String) obj;
    }

    @Override // p067l.InterfaceC4860
    public AbstractC7962 getHashTreeAlgorithmBytes() {
        Object obj = this.hashTreeAlgorithm_;
        if (obj instanceof String) {
            AbstractC7962 abstractC7962M18417 = AbstractC7962.m18417((String) obj);
            this.hashTreeAlgorithm_ = abstractC7962M18417;
            return abstractC7962M18417;
        }
        return (AbstractC7962) obj;
    }

    public C11566 setHashTreeAlgorithm(String str) {
        str.getClass();
        this.hashTreeAlgorithm_ = str;
        this.bitField0_ |= 2048;
        onChanged();
        return this;
    }

    public C11566 clearHashTreeAlgorithm() {
        this.hashTreeAlgorithm_ = C10895.getDefaultInstance().getHashTreeAlgorithm();
        this.bitField0_ &= -2049;
        onChanged();
        return this;
    }

    public C11566 setHashTreeAlgorithmBytes(AbstractC7962 abstractC7962) {
        abstractC7962.getClass();
        this.hashTreeAlgorithm_ = abstractC7962;
        this.bitField0_ |= 2048;
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC4860
    public boolean hasHashTreeSalt() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // p067l.InterfaceC4860
    public AbstractC7962 getHashTreeSalt() {
        return this.hashTreeSalt_;
    }

    public C11566 setHashTreeSalt(AbstractC7962 abstractC7962) {
        abstractC7962.getClass();
        this.hashTreeSalt_ = abstractC7962;
        this.bitField0_ |= 4096;
        onChanged();
        return this;
    }

    public C11566 clearHashTreeSalt() {
        this.bitField0_ &= -4097;
        this.hashTreeSalt_ = C10895.getDefaultInstance().getHashTreeSalt();
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC4860
    public boolean hasFecDataExtent() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // p067l.InterfaceC4860
    public C14052 getFecDataExtent() {
        C17310 c17310 = this.fecDataExtentBuilder_;
        if (c17310 == null) {
            C14052 c14052 = this.fecDataExtent_;
            return c14052 == null ? C14052.getDefaultInstance() : c14052;
        }
        return (C14052) c17310.m39272();
    }

    public C11566 setFecDataExtent(C14052 c14052) {
        C17310 c17310 = this.fecDataExtentBuilder_;
        if (c17310 == null) {
            c14052.getClass();
            this.fecDataExtent_ = c14052;
        } else {
            c17310.m39269(c14052);
        }
        this.bitField0_ |= 8192;
        onChanged();
        return this;
    }

    public C11566 setFecDataExtent(C14722 c14722) {
        C17310 c17310 = this.fecDataExtentBuilder_;
        if (c17310 == null) {
            this.fecDataExtent_ = c14722.build();
        } else {
            c17310.m39269(c14722.build());
        }
        this.bitField0_ |= 8192;
        onChanged();
        return this;
    }

    public C11566 mergeFecDataExtent(C14052 c14052) {
        C14052 c14053;
        C17310 c17310 = this.fecDataExtentBuilder_;
        if (c17310 == null) {
            if ((this.bitField0_ & 8192) != 0 && (c14053 = this.fecDataExtent_) != null && c14053 != C14052.getDefaultInstance()) {
                getFecDataExtentBuilder().mergeFrom(c14052);
            } else {
                this.fecDataExtent_ = c14052;
            }
        } else {
            c17310.m39267(c14052);
        }
        if (this.fecDataExtent_ != null) {
            this.bitField0_ |= 8192;
            onChanged();
        }
        return this;
    }

    public C11566 clearFecDataExtent() {
        this.bitField0_ &= -8193;
        this.fecDataExtent_ = null;
        C17310 c17310 = this.fecDataExtentBuilder_;
        if (c17310 != null) {
            c17310.m39271();
            this.fecDataExtentBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C14722 getFecDataExtentBuilder() {
        this.bitField0_ |= 8192;
        onChanged();
        return (C14722) getFecDataExtentFieldBuilder().m39273();
    }

    @Override // p067l.InterfaceC4860
    public InterfaceC8017 getFecDataExtentOrBuilder() {
        C17310 c17310 = this.fecDataExtentBuilder_;
        if (c17310 != null) {
            return (InterfaceC8017) c17310.m39270();
        }
        C14052 c14052 = this.fecDataExtent_;
        return c14052 == null ? C14052.getDefaultInstance() : c14052;
    }

    private C17310 getFecDataExtentFieldBuilder() {
        if (this.fecDataExtentBuilder_ == null) {
            this.fecDataExtentBuilder_ = new C17310(getFecDataExtent(), getParentForChildren(), isClean());
            this.fecDataExtent_ = null;
        }
        return this.fecDataExtentBuilder_;
    }

    @Override // p067l.InterfaceC4860
    public boolean hasFecExtent() {
        return (this.bitField0_ & 16384) != 0;
    }

    @Override // p067l.InterfaceC4860
    public C14052 getFecExtent() {
        C17310 c17310 = this.fecExtentBuilder_;
        if (c17310 == null) {
            C14052 c14052 = this.fecExtent_;
            return c14052 == null ? C14052.getDefaultInstance() : c14052;
        }
        return (C14052) c17310.m39272();
    }

    public C11566 setFecExtent(C14052 c14052) {
        C17310 c17310 = this.fecExtentBuilder_;
        if (c17310 == null) {
            c14052.getClass();
            this.fecExtent_ = c14052;
        } else {
            c17310.m39269(c14052);
        }
        this.bitField0_ |= 16384;
        onChanged();
        return this;
    }

    public C11566 setFecExtent(C14722 c14722) {
        C17310 c17310 = this.fecExtentBuilder_;
        if (c17310 == null) {
            this.fecExtent_ = c14722.build();
        } else {
            c17310.m39269(c14722.build());
        }
        this.bitField0_ |= 16384;
        onChanged();
        return this;
    }

    public C11566 mergeFecExtent(C14052 c14052) {
        C14052 c14053;
        C17310 c17310 = this.fecExtentBuilder_;
        if (c17310 == null) {
            if ((this.bitField0_ & 16384) != 0 && (c14053 = this.fecExtent_) != null && c14053 != C14052.getDefaultInstance()) {
                getFecExtentBuilder().mergeFrom(c14052);
            } else {
                this.fecExtent_ = c14052;
            }
        } else {
            c17310.m39267(c14052);
        }
        if (this.fecExtent_ != null) {
            this.bitField0_ |= 16384;
            onChanged();
        }
        return this;
    }

    public C11566 clearFecExtent() {
        this.bitField0_ &= -16385;
        this.fecExtent_ = null;
        C17310 c17310 = this.fecExtentBuilder_;
        if (c17310 != null) {
            c17310.m39271();
            this.fecExtentBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C14722 getFecExtentBuilder() {
        this.bitField0_ |= 16384;
        onChanged();
        return (C14722) getFecExtentFieldBuilder().m39273();
    }

    @Override // p067l.InterfaceC4860
    public InterfaceC8017 getFecExtentOrBuilder() {
        C17310 c17310 = this.fecExtentBuilder_;
        if (c17310 != null) {
            return (InterfaceC8017) c17310.m39270();
        }
        C14052 c14052 = this.fecExtent_;
        return c14052 == null ? C14052.getDefaultInstance() : c14052;
    }

    private C17310 getFecExtentFieldBuilder() {
        if (this.fecExtentBuilder_ == null) {
            this.fecExtentBuilder_ = new C17310(getFecExtent(), getParentForChildren(), isClean());
            this.fecExtent_ = null;
        }
        return this.fecExtentBuilder_;
    }

    @Override // p067l.InterfaceC4860
    public boolean hasFecRoots() {
        return (this.bitField0_ & 32768) != 0;
    }

    @Override // p067l.InterfaceC4860
    public int getFecRoots() {
        return this.fecRoots_;
    }

    public C11566 setFecRoots(int i) {
        this.fecRoots_ = i;
        this.bitField0_ |= 32768;
        onChanged();
        return this;
    }

    public C11566 clearFecRoots() {
        this.bitField0_ &= -32769;
        this.fecRoots_ = 2;
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC4860
    public boolean hasVersion() {
        return (this.bitField0_ & 65536) != 0;
    }

    @Override // p067l.InterfaceC4860
    public String getVersion() {
        Object obj = this.version_;
        if (!(obj instanceof String)) {
            AbstractC7962 abstractC7962 = (AbstractC7962) obj;
            String strM18427 = abstractC7962.m18427();
            if (abstractC7962.mo18426()) {
                this.version_ = strM18427;
            }
            return strM18427;
        }
        return (String) obj;
    }

    @Override // p067l.InterfaceC4860
    public AbstractC7962 getVersionBytes() {
        Object obj = this.version_;
        if (obj instanceof String) {
            AbstractC7962 abstractC7962M18417 = AbstractC7962.m18417((String) obj);
            this.version_ = abstractC7962M18417;
            return abstractC7962M18417;
        }
        return (AbstractC7962) obj;
    }

    public C11566 setVersion(String str) {
        str.getClass();
        this.version_ = str;
        this.bitField0_ |= 65536;
        onChanged();
        return this;
    }

    public C11566 clearVersion() {
        this.version_ = C10895.getDefaultInstance().getVersion();
        this.bitField0_ &= -65537;
        onChanged();
        return this;
    }

    public C11566 setVersionBytes(AbstractC7962 abstractC7962) {
        abstractC7962.getClass();
        this.version_ = abstractC7962;
        this.bitField0_ |= 65536;
        onChanged();
        return this;
    }

    private void ensureMergeOperationsIsMutable() {
        if ((this.bitField0_ & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) == 0) {
            this.mergeOperations_ = new ArrayList(this.mergeOperations_);
            this.bitField0_ |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        }
    }

    @Override // p067l.InterfaceC4860
    public List getMergeOperationsList() {
        C15969 c15969 = this.mergeOperationsBuilder_;
        if (c15969 == null) {
            return C21562.unmodifiableList(this.mergeOperations_);
        }
        return c15969.m36308();
    }

    @Override // p067l.InterfaceC4860
    public int getMergeOperationsCount() {
        C15969 c15969 = this.mergeOperationsBuilder_;
        if (c15969 == null) {
            return this.mergeOperations_.size();
        }
        return c15969.m36300();
    }

    @Override // p067l.InterfaceC4860
    public C8688 getMergeOperations(int i) {
        C15969 c15969 = this.mergeOperationsBuilder_;
        if (c15969 == null) {
            return (C8688) this.mergeOperations_.get(i);
        }
        return (C8688) c15969.m36297(i);
    }

    public C11566 setMergeOperations(int i, C8688 c8688) {
        C15969 c15969 = this.mergeOperationsBuilder_;
        if (c15969 == null) {
            c8688.getClass();
            ensureMergeOperationsIsMutable();
            this.mergeOperations_.set(i, c8688);
            onChanged();
            return this;
        }
        c15969.m36303(i, c8688);
        return this;
    }

    public C11566 setMergeOperations(int i, C18746 c18746) {
        C15969 c15969 = this.mergeOperationsBuilder_;
        if (c15969 == null) {
            ensureMergeOperationsIsMutable();
            this.mergeOperations_.set(i, c18746.build());
            onChanged();
            return this;
        }
        c15969.m36303(i, c18746.build());
        return this;
    }

    public C11566 addMergeOperations(C8688 c8688) {
        C15969 c15969 = this.mergeOperationsBuilder_;
        if (c15969 == null) {
            c8688.getClass();
            ensureMergeOperationsIsMutable();
            this.mergeOperations_.add(c8688);
            onChanged();
            return this;
        }
        c15969.m36299(c8688);
        return this;
    }

    public C11566 addMergeOperations(int i, C8688 c8688) {
        C15969 c15969 = this.mergeOperationsBuilder_;
        if (c15969 == null) {
            c8688.getClass();
            ensureMergeOperationsIsMutable();
            this.mergeOperations_.add(i, c8688);
            onChanged();
            return this;
        }
        c15969.m36298(i, c8688);
        return this;
    }

    public C11566 addMergeOperations(C18746 c18746) {
        C15969 c15969 = this.mergeOperationsBuilder_;
        if (c15969 == null) {
            ensureMergeOperationsIsMutable();
            this.mergeOperations_.add(c18746.build());
            onChanged();
            return this;
        }
        c15969.m36299(c18746.build());
        return this;
    }

    public C11566 addMergeOperations(int i, C18746 c18746) {
        C15969 c15969 = this.mergeOperationsBuilder_;
        if (c15969 == null) {
            ensureMergeOperationsIsMutable();
            this.mergeOperations_.add(i, c18746.build());
            onChanged();
            return this;
        }
        c15969.m36298(i, c18746.build());
        return this;
    }

    public C11566 addAllMergeOperations(Iterable iterable) {
        C15969 c15969 = this.mergeOperationsBuilder_;
        if (c15969 == null) {
            ensureMergeOperationsIsMutable();
            AbstractC4610.m9738(iterable, this.mergeOperations_);
            onChanged();
            return this;
        }
        c15969.m36294(iterable);
        return this;
    }

    public C11566 clearMergeOperations() {
        C15969 c15969 = this.mergeOperationsBuilder_;
        if (c15969 == null) {
            this.mergeOperations_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -131073;
            onChanged();
            return this;
        }
        c15969.m36302();
        return this;
    }

    public C11566 removeMergeOperations(int i) {
        C15969 c15969 = this.mergeOperationsBuilder_;
        if (c15969 == null) {
            ensureMergeOperationsIsMutable();
            this.mergeOperations_.remove(i);
            onChanged();
            return this;
        }
        c15969.m36306(i);
        return this;
    }

    public C18746 getMergeOperationsBuilder(int i) {
        return (C18746) getMergeOperationsFieldBuilder().m36291(i);
    }

    @Override // p067l.InterfaceC4860
    public InterfaceC11371 getMergeOperationsOrBuilder(int i) {
        C15969 c15969 = this.mergeOperationsBuilder_;
        if (c15969 == null) {
            return (InterfaceC11371) this.mergeOperations_.get(i);
        }
        return (InterfaceC11371) c15969.m36301(i);
    }

    @Override // p067l.InterfaceC4860
    public List getMergeOperationsOrBuilderList() {
        C15969 c15969 = this.mergeOperationsBuilder_;
        if (c15969 != null) {
            return c15969.m36295();
        }
        return C21562.unmodifiableList(this.mergeOperations_);
    }

    public C18746 addMergeOperationsBuilder() {
        return (C18746) getMergeOperationsFieldBuilder().m36293(C8688.getDefaultInstance());
    }

    public C18746 addMergeOperationsBuilder(int i) {
        return (C18746) getMergeOperationsFieldBuilder().m36292(i, C8688.getDefaultInstance());
    }

    public List getMergeOperationsBuilderList() {
        return getMergeOperationsFieldBuilder().m36304();
    }

    private C15969 getMergeOperationsFieldBuilder() {
        if (this.mergeOperationsBuilder_ == null) {
            this.mergeOperationsBuilder_ = new C15969(this.mergeOperations_, (this.bitField0_ & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0, getParentForChildren(), isClean());
            this.mergeOperations_ = null;
        }
        return this.mergeOperationsBuilder_;
    }

    @Override // p067l.InterfaceC4860
    public boolean hasEstimateCowSize() {
        return (this.bitField0_ & 262144) != 0;
    }

    @Override // p067l.InterfaceC4860
    public long getEstimateCowSize() {
        return this.estimateCowSize_;
    }

    public C11566 setEstimateCowSize(long j) {
        this.estimateCowSize_ = j;
        this.bitField0_ |= 262144;
        onChanged();
        return this;
    }

    public C11566 clearEstimateCowSize() {
        this.bitField0_ &= -262145;
        this.estimateCowSize_ = 0L;
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC4860
    public boolean hasEstimateOpCountMax() {
        return (this.bitField0_ & 524288) != 0;
    }

    @Override // p067l.InterfaceC4860
    public long getEstimateOpCountMax() {
        return this.estimateOpCountMax_;
    }

    public C11566 setEstimateOpCountMax(long j) {
        this.estimateOpCountMax_ = j;
        this.bitField0_ |= 524288;
        onChanged();
        return this;
    }

    public C11566 clearEstimateOpCountMax() {
        this.bitField0_ &= -524289;
        this.estimateOpCountMax_ = 0L;
        onChanged();
        return this;
    }
}
