package p067l;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC18270 extends InterfaceC5773 {
    /* synthetic */ List findInitializationErrors();

    @Override // p067l.InterfaceC5773
    /* synthetic */ Map getAllFields();

    long getDataLength();

    long getDataOffset();

    AbstractC7962 getDataSha256Hash();

    @Override // p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    /* bridge */ /* synthetic */ InterfaceC10467 getDefaultInstanceForType();

    @Override // p067l.InterfaceC5773, p067l.InterfaceC10029
    /* synthetic */ InterfaceC24548 getDefaultInstanceForType();

    @Override // p067l.InterfaceC5773, p067l.InterfaceC10029
    /* synthetic */ C19244 getDescriptorForType();

    C14052 getDstExtents(int i);

    int getDstExtentsCount();

    List getDstExtentsList();

    InterfaceC8017 getDstExtentsOrBuilder(int i);

    List getDstExtentsOrBuilderList();

    long getDstLength();

    @Override // p067l.InterfaceC5773
    /* synthetic */ Object getField(C2479 c2479);

    /* synthetic */ String getInitializationErrorString();

    /* synthetic */ C2479 getOneofFieldDescriptor(C16561 c16561);

    /* synthetic */ Object getRepeatedField(C2479 c2479, int i);

    /* synthetic */ int getRepeatedFieldCount(C2479 c2479);

    C14052 getSrcExtents(int i);

    int getSrcExtentsCount();

    List getSrcExtentsList();

    InterfaceC8017 getSrcExtentsOrBuilder(int i);

    List getSrcExtentsOrBuilderList();

    long getSrcLength();

    AbstractC7962 getSrcSha256Hash();

    EnumC9358 getType();

    @Override // p067l.InterfaceC5773
    /* synthetic */ C11158 getUnknownFields();

    boolean hasDataLength();

    boolean hasDataOffset();

    boolean hasDataSha256Hash();

    boolean hasDstLength();

    @Override // p067l.InterfaceC5773
    /* synthetic */ boolean hasField(C2479 c2479);

    /* synthetic */ boolean hasOneof(C16561 c16561);

    boolean hasSrcLength();

    boolean hasSrcSha256Hash();

    boolean hasType();

    @Override // p067l.InterfaceC17171, p067l.InterfaceC10029
    /* synthetic */ boolean isInitialized();
}
