package p067l;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: renamed from: l.᩷ۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: QA30 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22138 implements Map.Entry, Serializable, Cloneable {
    public static final long serialVersionUID = 9188503522395855322L;

    /* JADX INFO: renamed from: ᩸ */
    public final String f70022;

    /* JADX INFO: renamed from: ᩹ */
    public final String f70023;

    public final Object clone() {
        return this;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C22138(String str) {
        str = str == null ? "" : str;
        this.f70023 = str;
        this.f70022 = str.toLowerCase();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f70022;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f70023;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.f70022.equals(entry.getKey()) && this.f70023.equals(entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.f70022;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f70023;
        return (str2 != null ? str2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return this.f70022 + "=" + this.f70023;
    }
}
