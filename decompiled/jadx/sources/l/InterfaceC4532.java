package l;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙ۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC4532 extends InterfaceC3583 {
    /* synthetic */ List findInitializationErrors();

    @Override // l.InterfaceC3583
    /* synthetic */ Map getAllFields();

    long getCompressionFactor();

    int getCowVersion();

    @Override // l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    /* bridge */ /* synthetic */ InterfaceC8522 getDefaultInstanceForType();

    @Override // l.InterfaceC3583, l.InterfaceC8060
    /* synthetic */ InterfaceC23338 getDefaultInstanceForType();

    @Override // l.InterfaceC3583, l.InterfaceC8060
    /* synthetic */ C17757 getDescriptorForType();

    @Override // l.InterfaceC3583
    /* synthetic */ Object getField(C0117 c0117);

    C5238 getGroups(int i);

    int getGroupsCount();

    List getGroupsList();

    InterfaceC8060 getGroupsOrBuilder(int i);

    List getGroupsOrBuilderList();

    /* synthetic */ String getInitializationErrorString();

    /* synthetic */ C0117 getOneofFieldDescriptor(C14934 c14934);

    /* synthetic */ Object getRepeatedField(C0117 c0117, int i);

    /* synthetic */ int getRepeatedFieldCount(C0117 c0117);

    boolean getSnapshotEnabled();

    @Override // l.InterfaceC3583
    /* synthetic */ C9249 getUnknownFields();

    String getVabcCompressionParam();

    AbstractC5886 getVabcCompressionParamBytes();

    boolean getVabcEnabled();

    C15319 getVabcFeatureSet();

    InterfaceC22376 getVabcFeatureSetOrBuilder();

    boolean hasCompressionFactor();

    boolean hasCowVersion();

    @Override // l.InterfaceC3583
    /* synthetic */ boolean hasField(C0117 c0117);

    /* synthetic */ boolean hasOneof(C14934 c14934);

    boolean hasSnapshotEnabled();

    boolean hasVabcCompressionParam();

    boolean hasVabcEnabled();

    boolean hasVabcFeatureSet();

    @Override // l.InterfaceC15576, l.InterfaceC8060
    /* synthetic */ boolean isInitialized();
}
