package l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩷᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C21076 implements Map.Entry {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Map.Entry f67985;

    public C21076() {
        throw null;
    }

    public C21076(Map.Entry entry) {
        this.f67985 = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f67985.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C9081 c9081 = (C9081) this.f67985.getValue();
        if (c9081 == null) {
            return null;
        }
        return c9081.m23442();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9081 m47979() {
        return (C9081) this.f67985.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof InterfaceC8522)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        return ((C9081) this.f67985.getValue()).m38048((InterfaceC8522) obj);
    }
}
