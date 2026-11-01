package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.֡ۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6BJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2678 implements Map.Entry {

    /* JADX INFO: renamed from: ᩸ */
    public Object f4492;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractC7373 f4493;

    public C2678(AbstractC7373 abstractC7373) {
        this.f4493 = abstractC7373;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f4492;
        return Integer.valueOf(this.f4493.mo9936(((Integer) obj).intValue(), obj2));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4492;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return Integer.valueOf(this.f4493.mo9937(this.f4492));
    }
}
