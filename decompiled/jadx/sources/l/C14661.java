package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ܳܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AZL */
/* JADX INFO: loaded from: classes4.dex */
public final class C14661 implements Map.Entry {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C14661 f44804;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C14661 f44805;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Object f44806;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C14661 f44807;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C14661 f44808;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C14661 f44809;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f44810;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f44811;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f44812;

    public C14661(boolean z) {
        this.f44810 = null;
        this.f44811 = z;
        this.f44808 = this;
        this.f44804 = this;
    }

    public C14661(boolean z, C14661 c14661, Object obj, C14661 c14662, C14661 c14663) {
        this.f44809 = c14661;
        this.f44810 = obj;
        this.f44811 = z;
        this.f44812 = 1;
        this.f44804 = c14662;
        this.f44808 = c14663;
        c14663.f44804 = this;
        c14662.f44808 = this;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f44810;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f44806;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f44811) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f44806;
        this.f44806 = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f44810;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f44806;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f44810;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f44806;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return this.f44810 + "=" + this.f44806;
    }
}
