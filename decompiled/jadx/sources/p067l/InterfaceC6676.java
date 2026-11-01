package p067l;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙ۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC6676 extends InterfaceC5773 {
    /* synthetic */ List findInitializationErrors();

    @Override // p067l.InterfaceC5773
    /* synthetic */ Map getAllFields();

    long getCompressionFactor();

    int getCowVersion();

    @Override // p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    /* bridge */ /* synthetic */ InterfaceC10467 getDefaultInstanceForType();

    @Override // p067l.InterfaceC5773, p067l.InterfaceC10029
    /* synthetic */ InterfaceC24548 getDefaultInstanceForType();

    @Override // p067l.InterfaceC5773, p067l.InterfaceC10029
    /* synthetic */ C19244 getDescriptorForType();

    @Override // p067l.InterfaceC5773
    /* synthetic */ Object getField(C2479 c2479);

    C7347 getGroups(int i);

    int getGroupsCount();

    List getGroupsList();

    InterfaceC10029 getGroupsOrBuilder(int i);

    List getGroupsOrBuilderList();

    /* synthetic */ String getInitializationErrorString();

    /* synthetic */ C2479 getOneofFieldDescriptor(C16561 c16561);

    /* synthetic */ Object getRepeatedField(C2479 c2479, int i);

    /* synthetic */ int getRepeatedFieldCount(C2479 c2479);

    boolean getSnapshotEnabled();

    @Override // p067l.InterfaceC5773
    /* synthetic */ C11158 getUnknownFields();

    String getVabcCompressionParam();

    AbstractC7962 getVabcCompressionParamBytes();

    boolean getVabcEnabled();

    C16928 getVabcFeatureSet();

    InterfaceC23635 getVabcFeatureSetOrBuilder();

    boolean hasCompressionFactor();

    boolean hasCowVersion();

    @Override // p067l.InterfaceC5773
    /* synthetic */ boolean hasField(C2479 c2479);

    /* synthetic */ boolean hasOneof(C16561 c16561);

    boolean hasSnapshotEnabled();

    boolean hasVabcCompressionParam();

    boolean hasVabcEnabled();

    boolean hasVabcFeatureSet();

    @Override // p067l.InterfaceC17171, p067l.InterfaceC10029
    /* synthetic */ boolean isInitialized();
}
