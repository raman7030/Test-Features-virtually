package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.۠᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5GB */
/* JADX INFO: loaded from: classes3.dex */
public final class C10370 implements Map.Entry {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C2993 f28707;

    public C10370(C2993 c2993) {
        this.f28707 = c2993;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Integer num = (Integer) obj;
        this.f28707.f5299 = num.intValue();
        return num;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f28707;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return Integer.valueOf(this.f28707.f5299);
    }
}
