package p067l;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC4860 extends InterfaceC5773 {
    /* synthetic */ List findInitializationErrors();

    @Override // p067l.InterfaceC5773
    /* synthetic */ Map getAllFields();

    @Override // p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    /* bridge */ /* synthetic */ InterfaceC10467 getDefaultInstanceForType();

    @Override // p067l.InterfaceC5773, p067l.InterfaceC10029
    /* synthetic */ InterfaceC24548 getDefaultInstanceForType();

    @Override // p067l.InterfaceC5773, p067l.InterfaceC10029
    /* synthetic */ C19244 getDescriptorForType();

    long getEstimateCowSize();

    long getEstimateOpCountMax();

    C14052 getFecDataExtent();

    InterfaceC8017 getFecDataExtentOrBuilder();

    C14052 getFecExtent();

    InterfaceC8017 getFecExtentOrBuilder();

    int getFecRoots();

    @Override // p067l.InterfaceC5773
    /* synthetic */ Object getField(C2479 c2479);

    String getFilesystemType();

    AbstractC7962 getFilesystemTypeBytes();

    String getHashTreeAlgorithm();

    AbstractC7962 getHashTreeAlgorithmBytes();

    C14052 getHashTreeDataExtent();

    InterfaceC8017 getHashTreeDataExtentOrBuilder();

    C14052 getHashTreeExtent();

    InterfaceC8017 getHashTreeExtentOrBuilder();

    AbstractC7962 getHashTreeSalt();

    /* synthetic */ String getInitializationErrorString();

    C8688 getMergeOperations(int i);

    int getMergeOperationsCount();

    List getMergeOperationsList();

    InterfaceC11371 getMergeOperationsOrBuilder(int i);

    List getMergeOperationsOrBuilderList();

    C16258 getNewPartitionInfo();

    InterfaceC8883 getNewPartitionInfoOrBuilder();

    C20954 getNewPartitionSignature(int i);

    int getNewPartitionSignatureCount();

    List getNewPartitionSignatureList();

    InterfaceC7542 getNewPartitionSignatureOrBuilder(int i);

    List getNewPartitionSignatureOrBuilderList();

    C16258 getOldPartitionInfo();

    InterfaceC8883 getOldPartitionInfoOrBuilder();

    /* synthetic */ C2479 getOneofFieldDescriptor(C16561 c16561);

    C4189 getOperations(int i);

    int getOperationsCount();

    List getOperationsList();

    InterfaceC18270 getOperationsOrBuilder(int i);

    List getOperationsOrBuilderList();

    String getPartitionName();

    AbstractC7962 getPartitionNameBytes();

    boolean getPostinstallOptional();

    String getPostinstallPath();

    AbstractC7962 getPostinstallPathBytes();

    /* synthetic */ Object getRepeatedField(C2479 c2479, int i);

    /* synthetic */ int getRepeatedFieldCount(C2479 c2479);

    boolean getRunPostinstall();

    @Override // p067l.InterfaceC5773
    /* synthetic */ C11158 getUnknownFields();

    String getVersion();

    AbstractC7962 getVersionBytes();

    boolean hasEstimateCowSize();

    boolean hasEstimateOpCountMax();

    boolean hasFecDataExtent();

    boolean hasFecExtent();

    boolean hasFecRoots();

    @Override // p067l.InterfaceC5773
    /* synthetic */ boolean hasField(C2479 c2479);

    boolean hasFilesystemType();

    boolean hasHashTreeAlgorithm();

    boolean hasHashTreeDataExtent();

    boolean hasHashTreeExtent();

    boolean hasHashTreeSalt();

    boolean hasNewPartitionInfo();

    boolean hasOldPartitionInfo();

    /* synthetic */ boolean hasOneof(C16561 c16561);

    boolean hasPartitionName();

    boolean hasPostinstallOptional();

    boolean hasPostinstallPath();

    boolean hasRunPostinstall();

    boolean hasVersion();

    @Override // p067l.InterfaceC17171, p067l.InterfaceC10029
    /* synthetic */ boolean isInitialized();
}
