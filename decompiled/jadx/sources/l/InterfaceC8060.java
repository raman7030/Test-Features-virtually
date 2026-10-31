package l;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۠۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC8060 extends InterfaceC3583 {
    /* synthetic */ List findInitializationErrors();

    @Override // l.InterfaceC3583
    /* synthetic */ Map getAllFields();

    /* bridge */ /* synthetic */ InterfaceC8522 getDefaultInstanceForType();

    @Override // l.InterfaceC3583, l.InterfaceC8060
    /* synthetic */ InterfaceC23338 getDefaultInstanceForType();

    /* synthetic */ C17757 getDescriptorForType();

    @Override // l.InterfaceC3583
    /* synthetic */ Object getField(C0117 c0117);

    /* synthetic */ String getInitializationErrorString();

    String getName();

    AbstractC5886 getNameBytes();

    /* synthetic */ C0117 getOneofFieldDescriptor(C14934 c14934);

    String getPartitionNames(int i);

    AbstractC5886 getPartitionNamesBytes(int i);

    int getPartitionNamesCount();

    List getPartitionNamesList();

    /* synthetic */ Object getRepeatedField(C0117 c0117, int i);

    /* synthetic */ int getRepeatedFieldCount(C0117 c0117);

    long getSize();

    @Override // l.InterfaceC3583
    /* synthetic */ C9249 getUnknownFields();

    @Override // l.InterfaceC3583
    /* synthetic */ boolean hasField(C0117 c0117);

    boolean hasName();

    /* synthetic */ boolean hasOneof(C14934 c14934);

    boolean hasSize();

    /* synthetic */ boolean isInitialized();
}
