package p067l;

import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩹᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9PU */
/* JADX INFO: loaded from: classes2.dex */
public final class C23739 extends AbstractC22045 {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f75533;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f75534;

    @Override // p067l.InterfaceC15830
    public final InterfaceC15830 setUnknownFields(C11158 c11158) {
        return this;
    }

    public /* synthetic */ C23739(int i) {
        this(true, true);
    }

    public C23739(boolean z, boolean z2) {
        this.f75533 = z;
        this.f75534 = z2;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC10467 build() {
        buildPartial();
        throw null;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC24548 build() {
        buildPartial();
        throw null;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C21728 buildPartial() {
        return new C21728(0);
    }

    @Override // p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        throw null;
    }

    @Override // p067l.InterfaceC15830
    public final InterfaceC15830 clearField(C2479 c2479) {
        c2479.m3545();
        throw null;
    }

    @Override // p067l.InterfaceC5773
    public final Object getField(C2479 c2479) {
        c2479.m3545();
        throw null;
    }

    @Override // p067l.InterfaceC5773
    public final boolean hasField(C2479 c2479) {
        c2479.m3545();
        throw null;
    }

    @Override // p067l.InterfaceC15830
    public final InterfaceC15830 newBuilderForField(C2479 c2479) {
        c2479.m3545();
        throw null;
    }

    @Override // p067l.InterfaceC15830
    public final InterfaceC15830 setField(C2479 c2479, Object obj) {
        c2479.m3545();
        throw null;
    }

    @Override // p067l.InterfaceC15830
    public final InterfaceC15830 addRepeatedField(C2479 c2479, Object obj) {
        throw new RuntimeException("There is no repeated field in a map entry message.");
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        throw null;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        throw null;
    }

    @Override // p067l.InterfaceC5773
    public final Map getAllFields() {
        new TreeMap();
        throw null;
    }

    @Override // p067l.InterfaceC5773
    public final C11158 getUnknownFields() {
        return C11158.m25741();
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C23739 mo56039clone() {
        return new C23739(this.f75533, this.f75534);
    }

    @Override // p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        throw null;
    }
}
