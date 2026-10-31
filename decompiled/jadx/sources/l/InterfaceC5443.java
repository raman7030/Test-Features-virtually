package l;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۚܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC5443 extends InterfaceC3583 {
    /* synthetic */ List findInitializationErrors();

    @Override // l.InterfaceC3583
    /* synthetic */ Map getAllFields();

    AbstractC5886 getData();

    @Override // l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    /* bridge */ /* synthetic */ InterfaceC8522 getDefaultInstanceForType();

    @Override // l.InterfaceC3583, l.InterfaceC8060
    /* synthetic */ InterfaceC23338 getDefaultInstanceForType();

    @Override // l.InterfaceC3583, l.InterfaceC8060
    /* synthetic */ C17757 getDescriptorForType();

    @Override // l.InterfaceC3583
    /* synthetic */ Object getField(C0117 c0117);

    /* synthetic */ String getInitializationErrorString();

    /* synthetic */ C0117 getOneofFieldDescriptor(C14934 c14934);

    /* synthetic */ Object getRepeatedField(C0117 c0117, int i);

    /* synthetic */ int getRepeatedFieldCount(C0117 c0117);

    @Override // l.InterfaceC3583
    /* synthetic */ C9249 getUnknownFields();

    int getUnpaddedSignatureSize();

    @Deprecated
    int getVersion();

    boolean hasData();

    @Override // l.InterfaceC3583
    /* synthetic */ boolean hasField(C0117 c0117);

    /* synthetic */ boolean hasOneof(C14934 c14934);

    boolean hasUnpaddedSignatureSize();

    @Deprecated
    boolean hasVersion();

    @Override // l.InterfaceC15576, l.InterfaceC8060
    /* synthetic */ boolean isInitialized();
}
