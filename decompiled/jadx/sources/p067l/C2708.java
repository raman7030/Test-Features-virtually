package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.֡ۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public class C2708 implements Map.Entry {

    /* JADX INFO: renamed from: a */
    public final int f4544a;

    /* JADX INFO: renamed from: b */
    public final Object f4545b;

    /* JADX INFO: renamed from: c */
    public volatile Object f4546c;

    /* JADX INFO: renamed from: d */
    public volatile C2708 f4547d;

    public C2708(int i, Object obj, Object obj2) {
        this.f4544a = i;
        this.f4545b = obj;
        this.f4546c = obj2;
    }

    public C2708(int i, Object obj, Object obj2, C2708 c2708) {
        this(i, obj, obj2);
        this.f4547d = c2708;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4545b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4546c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f4545b.hashCode() ^ this.f4546c.hashCode();
    }

    public final String toString() {
        return AbstractC17736.m40317s(this.f4545b, this.f4546c);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (value = entry.getValue()) == null) {
            return false;
        }
        Object obj2 = this.f4545b;
        if (key != obj2 && !key.equals(obj2)) {
            return false;
        }
        Object obj3 = this.f4546c;
        return value == obj3 || value.equals(obj3);
    }

    /* JADX INFO: renamed from: a */
    public C2708 mo4197a(int i, Object obj) {
        Object obj2;
        C2708 c2708 = this;
        do {
            if (c2708.f4544a == i && ((obj2 = c2708.f4545b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return c2708;
            }
            c2708 = c2708.f4547d;
        } while (c2708 != null);
        return null;
    }
}
