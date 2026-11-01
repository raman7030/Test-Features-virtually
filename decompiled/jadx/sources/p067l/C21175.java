package p067l;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩵᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 0CLW */
/* JADX INFO: loaded from: classes4.dex */
public final class C21175 extends LinkedHashMap {
    public static final long serialVersionUID = 1;

    public C21175() {
        super(64, 0.75f, true);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 32;
    }
}
