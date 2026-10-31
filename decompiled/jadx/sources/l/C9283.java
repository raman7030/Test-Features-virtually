package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۢ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes3.dex */
public final class C9283 implements InterfaceC11553, Map.Entry, InterfaceC16241 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f28123;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19161 f28124;

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo15809() {
        return mo15807();
    }

    public C9283(C19161 c19161, int i) {
        this.f28124 = c19161;
        this.f28123 = i;
    }

    public C9283(C19161 c19161) {
        this.f28124 = c19161;
    }

    @Override // l.InterfaceC11553
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final char mo23816() {
        return this.f28124.f60376[this.f28123];
    }

    @Override // l.InterfaceC16241
    public final Object first() {
        return Character.valueOf(this.f28124.f60376[this.f28123]);
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ܽ */
    public final Object mo15808() {
        return Character.valueOf(this.f28124.f60376[this.f28123]);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f28124.f60386[this.f28123];
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ܳ */
    public final Object mo15807() {
        return this.f28124.f60386[this.f28123];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object[] objArr = this.f28124.f60386;
        int i = this.f28123;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Character.valueOf(this.f28124.f60376[this.f28123]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C19161 c19161 = this.f28124;
        return c19161.f60376[this.f28123] == ((Character) entry.getKey()).charValue() && C11003.equals(c19161.f60386[this.f28123], entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C19161 c19161 = this.f28124;
        char[] cArr = c19161.f60376;
        int i = this.f28123;
        char c = cArr[i];
        Object obj = c19161.f60386[i];
        return (obj == null ? 0 : obj.hashCode()) ^ c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C19161 c19161 = this.f28124;
        sb.append(c19161.f60376[this.f28123]);
        sb.append("=>");
        sb.append(c19161.f60386[this.f28123]);
        return sb.toString();
    }
}
