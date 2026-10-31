package l;

import java.util.Map;

/* JADX INFO: renamed from: l.۬ܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13147 implements InterfaceC16491, Map.Entry, InterfaceC16241 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f39307;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11737 f39308;

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object setValue(Object obj) {
        char cCharValue = ((Character) obj).charValue();
        char[] cArr = this.f39308.f35005;
        int i = this.f39307;
        char c = cArr[i];
        cArr[i] = cCharValue;
        return Character.valueOf(c);
    }

    public C13147(C11737 c11737) {
        this.f39308 = c11737;
    }

    public C13147(C11737 c11737, int i) {
        this.f39308 = c11737;
        this.f39307 = i;
    }

    @Override // l.InterfaceC16491
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final char mo31876() {
        return this.f39308.f35010[this.f39307];
    }

    @Override // l.InterfaceC16241
    public final Object first() {
        return Character.valueOf(this.f39308.f35010[this.f39307]);
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ܽ */
    public final Object mo15808() {
        return Character.valueOf(this.f39308.f35010[this.f39307]);
    }

    @Override // l.InterfaceC16491
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final char mo31875() {
        return this.f39308.f35005[this.f39307];
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ܳ */
    public final Object mo15807() {
        return Character.valueOf(this.f39308.f35005[this.f39307]);
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo15809() {
        return Character.valueOf(this.f39308.f35005[this.f39307]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Character.valueOf(this.f39308.f35010[this.f39307]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getValue() {
        return Character.valueOf(this.f39308.f35005[this.f39307]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C11737 c11737 = this.f39308;
        return c11737.f35010[this.f39307] == ((Character) entry.getKey()).charValue() && c11737.f35005[this.f39307] == ((Character) entry.getValue()).charValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C11737 c11737 = this.f39308;
        char[] cArr = c11737.f35010;
        int i = this.f39307;
        return c11737.f35005[i] ^ cArr[i];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C11737 c11737 = this.f39308;
        sb.append(c11737.f35010[this.f39307]);
        sb.append("=>");
        sb.append(c11737.f35005[this.f39307]);
        return sb.toString();
    }
}
