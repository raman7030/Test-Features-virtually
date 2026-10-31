package l;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M7MY */
/* JADX INFO: loaded from: classes2.dex */
public final class C3914 extends LinkedHashMap {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 4;
    }
}
