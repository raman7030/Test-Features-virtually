package p067l;

import android.view.WindowInsets;

/* JADX INFO: renamed from: l.᩵ܰ */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes5.dex */
public class C1809 extends C1774 {
    public C1809(C1914 c1914, WindowInsets windowInsets) {
        super(c1914, windowInsets);
    }

    @Override // p067l.C0899
    /* JADX INFO: renamed from: ᩳ */
    public C1098 mo6186() {
        return C1098.m16648(this.f15416.getDisplayCutout());
    }

    @Override // p067l.C0899
    /* JADX INFO: renamed from: ֫ */
    public C1914 mo6174() {
        return C1914.m51162(null, this.f15416.consumeDisplayCutout());
    }

    @Override // p067l.C1039, p067l.C0899
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1809)) {
            return false;
        }
        C1809 c1809 = (C1809) obj;
        return C12826.equals(this.f15416, c1809.f15416) && C12826.equals(this.f15415, c1809.f15415);
    }

    @Override // p067l.C0899
    public int hashCode() {
        return this.f15416.hashCode();
    }
}
