package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.۬ܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14863 implements InterfaceC18041, Map.Entry, InterfaceC17804 {

    /* JADX INFO: renamed from: ᩸ */
    public int f42362;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C13523 f42363;

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object setValue(Object obj) {
        char cCharValue = ((Character) obj).charValue();
        char[] cArr = this.f42363.f38005;
        int i = this.f42362;
        char c = cArr[i];
        cArr[i] = cCharValue;
        return Character.valueOf(c);
    }

    public C14863(C13523 c13523) {
        this.f42363 = c13523;
    }

    public C14863(C13523 c13523, int i) {
        this.f42363 = c13523;
        this.f42362 = i;
    }

    @Override // p067l.InterfaceC18041
    /* JADX INFO: renamed from: ܿ */
    public final char mo33969() {
        return this.f42363.f38010[this.f42362];
    }

    @Override // p067l.InterfaceC17804
    public final Object first() {
        return Character.valueOf(this.f42363.f38010[this.f42362]);
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ܽ */
    public final Object mo17723() {
        return Character.valueOf(this.f42363.f38010[this.f42362]);
    }

    @Override // p067l.InterfaceC18041
    /* JADX INFO: renamed from: ۡ */
    public final char mo33968() {
        return this.f42363.f38005[this.f42362];
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ܳ */
    public final Object mo17722() {
        return Character.valueOf(this.f42363.f38005[this.f42362]);
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo17724() {
        return Character.valueOf(this.f42363.f38005[this.f42362]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Character.valueOf(this.f42363.f38010[this.f42362]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getValue() {
        return Character.valueOf(this.f42363.f38005[this.f42362]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C13523 c13523 = this.f42363;
        return c13523.f38010[this.f42362] == ((Character) entry.getKey()).charValue() && c13523.f38005[this.f42362] == ((Character) entry.getValue()).charValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C13523 c13523 = this.f42363;
        char[] cArr = c13523.f38010;
        int i = this.f42362;
        return c13523.f38005[i] ^ cArr[i];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C13523 c13523 = this.f42363;
        sb.append(c13523.f38010[this.f42362]);
        sb.append("=>");
        sb.append(c13523.f38005[this.f42362]);
        return sb.toString();
    }
}
