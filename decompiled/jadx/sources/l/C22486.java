package l;

import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩹᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9PU */
/* JADX INFO: loaded from: classes2.dex */
public final class C22486 extends AbstractC20704 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f72807;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f72808;

    @Override // l.InterfaceC14165
    public final InterfaceC14165 setUnknownFields(C9249 c9249) {
        return this;
    }

    public /* synthetic */ C22486(int i) {
        this(true, true);
    }

    public C22486(boolean z, boolean z2) {
        this.f72807 = z;
        this.f72808 = z2;
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        buildPartial();
        throw null;
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        buildPartial();
        throw null;
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C20370 buildPartial() {
        return new C20370(0);
    }

    @Override // l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        throw null;
    }

    @Override // l.InterfaceC14165
    public final InterfaceC14165 clearField(C0117 c0117) {
        c0117.m1144();
        throw null;
    }

    @Override // l.InterfaceC3583
    public final Object getField(C0117 c0117) {
        c0117.m1144();
        throw null;
    }

    @Override // l.InterfaceC3583
    public final boolean hasField(C0117 c0117) {
        c0117.m1144();
        throw null;
    }

    @Override // l.InterfaceC14165
    public final InterfaceC14165 newBuilderForField(C0117 c0117) {
        c0117.m1144();
        throw null;
    }

    @Override // l.InterfaceC14165
    public final InterfaceC14165 setField(C0117 c0117, Object obj) {
        c0117.m1144();
        throw null;
    }

    @Override // l.InterfaceC14165
    public final InterfaceC14165 addRepeatedField(C0117 c0117, Object obj) {
        throw new RuntimeException("There is no repeated field in a map entry message.");
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        throw null;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        throw null;
    }

    @Override // l.InterfaceC3583
    public final Map getAllFields() {
        new TreeMap();
        throw null;
    }

    @Override // l.InterfaceC3583
    public final C9249 getUnknownFields() {
        return C9249.m23740();
    }

    @Override // l.AbstractC20704, l.AbstractC2359
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C22486 mo7670clone() {
        return new C22486(this.f72807, this.f72808);
    }

    @Override // l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        throw null;
    }
}
