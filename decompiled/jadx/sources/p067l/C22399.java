package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩷᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C22399 implements Map.Entry {

    /* JADX INFO: renamed from: ᩸ */
    public Map.Entry f70668;

    public C22399() {
        throw null;
    }

    public C22399(Map.Entry entry) {
        this.f70668 = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f70668.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C10999 c10999 = (C10999) this.f70668.getValue();
        if (c10999 == null) {
            return null;
        }
        return c10999.m25389();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C10999 m50309() {
        return (C10999) this.f70668.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof InterfaceC10467)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        return ((C10999) this.f70668.getValue()).m40240((InterfaceC10467) obj);
    }
}
