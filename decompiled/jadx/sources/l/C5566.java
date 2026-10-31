package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۚ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5566 implements InterfaceC3449, Map.Entry, InterfaceC16241 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f17246;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21794 f17247;

    @Override // l.InterfaceC16241
    public final Object first() {
        return mo15808();
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object mo15809() {
        return mo15807();
    }

    public C5566(C21794 c21794) {
        this.f17247 = c21794;
    }

    public C5566(C21794 c21794, int i) {
        this.f17247 = c21794;
        this.f17246 = i;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f17247.f69816[this.f17246];
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object mo15808() {
        return this.f17247.f69816[this.f17246];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f17247.f69811[this.f17246];
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Object mo15807() {
        return this.f17247.f69811[this.f17246];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object[] objArr = this.f17247.f69811;
        int i = this.f17246;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C21794 c21794 = this.f17247;
        return C11003.equals(c21794.f69816[this.f17246], entry.getKey()) && C11003.equals(c21794.f69811[this.f17246], entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C21794 c21794 = this.f17247;
        Object obj = c21794.f69816[this.f17246];
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = c21794.f69811[this.f17246];
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C21794 c21794 = this.f17247;
        sb.append(c21794.f69816[this.f17246]);
        sb.append("=>");
        sb.append(c21794.f69811[this.f17246]);
        return sb.toString();
    }
}
