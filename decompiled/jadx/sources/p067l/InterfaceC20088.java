package p067l;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩴ۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC20088 extends InterfaceC5773 {
    /* synthetic */ List findInitializationErrors();

    @Override // p067l.InterfaceC5773
    /* synthetic */ Map getAllFields();

    C3994 getApexInfo(int i);

    int getApexInfoCount();

    List getApexInfoList();

    InterfaceC18075 getApexInfoOrBuilder(int i);

    List getApexInfoOrBuilderList();

    int getBlockSize();

    @Override // p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    /* bridge */ /* synthetic */ InterfaceC10467 getDefaultInstanceForType();

    @Override // p067l.InterfaceC5773, p067l.InterfaceC10029
    /* synthetic */ InterfaceC24548 getDefaultInstanceForType();

    @Override // p067l.InterfaceC5773, p067l.InterfaceC10029
    /* synthetic */ C19244 getDescriptorForType();

    C23440 getDynamicPartitionMetadata();

    InterfaceC6676 getDynamicPartitionMetadataOrBuilder();

    @Override // p067l.InterfaceC5773
    /* synthetic */ Object getField(C2479 c2479);

    /* synthetic */ String getInitializationErrorString();

    long getMaxTimestamp();

    int getMinorVersion();

    /* synthetic */ C2479 getOneofFieldDescriptor(C16561 c16561);

    boolean getPartialUpdate();

    C10895 getPartitions(int i);

    int getPartitionsCount();

    List getPartitionsList();

    InterfaceC4860 getPartitionsOrBuilder(int i);

    List getPartitionsOrBuilderList();

    /* synthetic */ Object getRepeatedField(C2479 c2479, int i);

    /* synthetic */ int getRepeatedFieldCount(C2479 c2479);

    String getSecurityPatchLevel();

    AbstractC7962 getSecurityPatchLevelBytes();

    long getSignaturesOffset();

    long getSignaturesSize();

    @Override // p067l.InterfaceC5773
    /* synthetic */ C11158 getUnknownFields();

    boolean hasBlockSize();

    boolean hasDynamicPartitionMetadata();

    @Override // p067l.InterfaceC5773
    /* synthetic */ boolean hasField(C2479 c2479);

    boolean hasMaxTimestamp();

    boolean hasMinorVersion();

    /* synthetic */ boolean hasOneof(C16561 c16561);

    boolean hasPartialUpdate();

    boolean hasSecurityPatchLevel();

    boolean hasSignaturesOffset();

    boolean hasSignaturesSize();

    @Override // p067l.InterfaceC17171, p067l.InterfaceC10029
    /* synthetic */ boolean isInitialized();
}
