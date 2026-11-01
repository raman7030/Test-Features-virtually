package p067l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۜܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: W8NJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C8866 {

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f24046 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public Map f24047;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized Map m20470() {
        if (this.f24047 == null) {
            this.f24047 = C21562.unmodifiableMap(new HashMap(this.f24046));
        }
        return this.f24047;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m20471(Map map) {
        this.f24047 = null;
        this.f24046.clear();
        this.f24046.putAll(map);
    }
}
