package l;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩴ۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC18644 extends InterfaceC3583 {
    /* synthetic */ List findInitializationErrors();

    @Override // l.InterfaceC3583
    /* synthetic */ Map getAllFields();

    C1710 getApexInfo(int i);

    int getApexInfoCount();

    List getApexInfoList();

    InterfaceC16526 getApexInfoOrBuilder(int i);

    List getApexInfoOrBuilderList();

    int getBlockSize();

    @Override // l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    /* bridge */ /* synthetic */ InterfaceC8522 getDefaultInstanceForType();

    @Override // l.InterfaceC3583, l.InterfaceC8060
    /* synthetic */ InterfaceC23338 getDefaultInstanceForType();

    @Override // l.InterfaceC3583, l.InterfaceC8060
    /* synthetic */ C17757 getDescriptorForType();

    C22171 getDynamicPartitionMetadata();

    InterfaceC4532 getDynamicPartitionMetadataOrBuilder();

    @Override // l.InterfaceC3583
    /* synthetic */ Object getField(C0117 c0117);

    /* synthetic */ String getInitializationErrorString();

    long getMaxTimestamp();

    int getMinorVersion();

    /* synthetic */ C0117 getOneofFieldDescriptor(C14934 c14934);

    boolean getPartialUpdate();

    C8971 getPartitions(int i);

    int getPartitionsCount();

    List getPartitionsList();

    InterfaceC2621 getPartitionsOrBuilder(int i);

    List getPartitionsOrBuilderList();

    /* synthetic */ Object getRepeatedField(C0117 c0117, int i);

    /* synthetic */ int getRepeatedFieldCount(C0117 c0117);

    String getSecurityPatchLevel();

    AbstractC5886 getSecurityPatchLevelBytes();

    long getSignaturesOffset();

    long getSignaturesSize();

    @Override // l.InterfaceC3583
    /* synthetic */ C9249 getUnknownFields();

    boolean hasBlockSize();

    boolean hasDynamicPartitionMetadata();

    @Override // l.InterfaceC3583
    /* synthetic */ boolean hasField(C0117 c0117);

    boolean hasMaxTimestamp();

    boolean hasMinorVersion();

    /* synthetic */ boolean hasOneof(C14934 c14934);

    boolean hasPartialUpdate();

    boolean hasSecurityPatchLevel();

    boolean hasSignaturesOffset();

    boolean hasSignaturesSize();

    @Override // l.InterfaceC15576, l.InterfaceC8060
    /* synthetic */ boolean isInitialized();
}
