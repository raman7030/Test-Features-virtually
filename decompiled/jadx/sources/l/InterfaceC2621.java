package l;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC2621 extends InterfaceC3583 {
    /* synthetic */ List findInitializationErrors();

    @Override // l.InterfaceC3583
    /* synthetic */ Map getAllFields();

    @Override // l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    /* bridge */ /* synthetic */ InterfaceC8522 getDefaultInstanceForType();

    @Override // l.InterfaceC3583, l.InterfaceC8060
    /* synthetic */ InterfaceC23338 getDefaultInstanceForType();

    @Override // l.InterfaceC3583, l.InterfaceC8060
    /* synthetic */ C17757 getDescriptorForType();

    long getEstimateCowSize();

    long getEstimateOpCountMax();

    C12293 getFecDataExtent();

    InterfaceC5943 getFecDataExtentOrBuilder();

    C12293 getFecExtent();

    InterfaceC5943 getFecExtentOrBuilder();

    int getFecRoots();

    @Override // l.InterfaceC3583
    /* synthetic */ Object getField(C0117 c0117);

    String getFilesystemType();

    AbstractC5886 getFilesystemTypeBytes();

    String getHashTreeAlgorithm();

    AbstractC5886 getHashTreeAlgorithmBytes();

    C12293 getHashTreeDataExtent();

    InterfaceC5943 getHashTreeDataExtentOrBuilder();

    C12293 getHashTreeExtent();

    InterfaceC5943 getHashTreeExtentOrBuilder();

    AbstractC5886 getHashTreeSalt();

    /* synthetic */ String getInitializationErrorString();

    C6649 getMergeOperations(int i);

    int getMergeOperationsCount();

    List getMergeOperationsList();

    InterfaceC9472 getMergeOperationsOrBuilder(int i);

    List getMergeOperationsOrBuilderList();

    C14614 getNewPartitionInfo();

    InterfaceC6854 getNewPartitionInfoOrBuilder();

    C19555 getNewPartitionSignature(int i);

    int getNewPartitionSignatureCount();

    List getNewPartitionSignatureList();

    InterfaceC5443 getNewPartitionSignatureOrBuilder(int i);

    List getNewPartitionSignatureOrBuilderList();

    C14614 getOldPartitionInfo();

    InterfaceC6854 getOldPartitionInfoOrBuilder();

    /* synthetic */ C0117 getOneofFieldDescriptor(C14934 c14934);

    C1915 getOperations(int i);

    int getOperationsCount();

    List getOperationsList();

    InterfaceC16731 getOperationsOrBuilder(int i);

    List getOperationsOrBuilderList();

    String getPartitionName();

    AbstractC5886 getPartitionNameBytes();

    boolean getPostinstallOptional();

    String getPostinstallPath();

    AbstractC5886 getPostinstallPathBytes();

    /* synthetic */ Object getRepeatedField(C0117 c0117, int i);

    /* synthetic */ int getRepeatedFieldCount(C0117 c0117);

    boolean getRunPostinstall();

    @Override // l.InterfaceC3583
    /* synthetic */ C9249 getUnknownFields();

    String getVersion();

    AbstractC5886 getVersionBytes();

    boolean hasEstimateCowSize();

    boolean hasEstimateOpCountMax();

    boolean hasFecDataExtent();

    boolean hasFecExtent();

    boolean hasFecRoots();

    @Override // l.InterfaceC3583
    /* synthetic */ boolean hasField(C0117 c0117);

    boolean hasFilesystemType();

    boolean hasHashTreeAlgorithm();

    boolean hasHashTreeDataExtent();

    boolean hasHashTreeExtent();

    boolean hasHashTreeSalt();

    boolean hasNewPartitionInfo();

    boolean hasOldPartitionInfo();

    /* synthetic */ boolean hasOneof(C14934 c14934);

    boolean hasPartitionName();

    boolean hasPostinstallOptional();

    boolean hasPostinstallPath();

    boolean hasRunPostinstall();

    boolean hasVersion();

    @Override // l.InterfaceC15576, l.InterfaceC8060
    /* synthetic */ boolean isInitialized();
}
