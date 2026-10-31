package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ᩳ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17707 implements InterfaceC3449, Map.Entry, InterfaceC16241 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f54184;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9241 f54185;

    @Override // l.InterfaceC16241
    public final Object first() {
        return mo15808();
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo15809() {
        return mo15807();
    }

    public C17707(C9241 c9241, int i) {
        this.f54185 = c9241;
        this.f54184 = i;
    }

    public C17707(C9241 c9241) {
        this.f54185 = c9241;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f54185.f27976[this.f54184];
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ܽ */
    public final Object mo15808() {
        return this.f54185.f27976[this.f54184];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f54185.f27983[this.f54184];
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ܳ */
    public final Object mo15807() {
        return this.f54185.f27983[this.f54184];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object[] objArr = this.f54185.f27983;
        int i = this.f54184;
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
        C9241 c9241 = this.f54185;
        return c9241.f27987.mo8734(c9241.f27976[this.f54184], entry.getKey()) && C11003.equals(c9241.f27983[this.f54184], entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C9241 c9241 = this.f54185;
        int iMo8733 = c9241.f27987.mo8733(c9241.f27976[this.f54184]);
        Object obj = c9241.f27983[this.f54184];
        return (obj == null ? 0 : obj.hashCode()) ^ iMo8733;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C9241 c9241 = this.f54185;
        sb.append(c9241.f27976[this.f54184]);
        sb.append("=>");
        sb.append(c9241.f27983[this.f54184]);
        return sb.toString();
    }
}
