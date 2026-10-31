package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ᩳۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 261W */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17828 implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            C1558 c1558 = (C1558) this;
            if (C11003.equals(c1558.getKey(), entry.getKey()) && C11003.equals(c1558.getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C1558 c1558 = (C1558) this;
        Object key = c1558.getKey();
        Object value = c1558.getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C1558 c1558 = (C1558) this;
        sb.append(c1558.getKey());
        sb.append("=");
        sb.append(c1558.getValue());
        return sb.toString();
    }
}
