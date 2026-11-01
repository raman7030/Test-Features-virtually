package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.ᩳۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 261W */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19312 implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            C3849 c3849 = (C3849) this;
            if (C12826.equals(c3849.getKey(), entry.getKey()) && C12826.equals(c3849.getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C3849 c3849 = (C3849) this;
        Object key = c3849.getKey();
        Object value = c3849.getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C3849 c3849 = (C3849) this;
        sb.append(c3849.getKey());
        sb.append("=");
        sb.append(c3849.getValue());
        return sb.toString();
    }
}
