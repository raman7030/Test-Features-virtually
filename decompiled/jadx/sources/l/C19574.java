package l;

/* JADX INFO: renamed from: l.᩵ܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: PA21 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19574 extends C21690 {
    public C19574(String str) {
        String strM46315 = C20094.m46315("\\\\", str);
        C3345 c3345 = new C3345();
        this.f69571 = strM46315;
        this.f69568 = 1;
        this.f69570 = c3345;
        this.f69567 = -1;
        this.f69569 = 0;
        this.f27318 = 0;
        this.f27321 = 3;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14325[] m45020() {
        C3345 c3345 = (C3345) this.f69570;
        C18868[] c18868Arr = new C18868[c3345.f10574];
        for (int i = 0; i < c3345.f10574; i++) {
            c18868Arr[i] = new C18868(c3345.f10573[i]);
        }
        return c18868Arr;
    }
}
