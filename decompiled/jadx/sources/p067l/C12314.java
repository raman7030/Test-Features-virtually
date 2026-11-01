package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۤᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12314 extends AbstractC15369 {

    /* JADX INFO: renamed from: d */
    public Object[] f34368d;

    /* JADX INFO: renamed from: e */
    public int f34369e;

    @Override // p067l.AbstractC25014, p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f34368d = new Object[(int) j];
    }

    @Override // p067l.AbstractC25014, p067l.InterfaceC2925
    public final void end() {
        int i = 0;
        Arrays.sort(this.f34368d, 0, this.f34369e, this.f43910b);
        long j = this.f34369e;
        InterfaceC2925 interfaceC2925 = this.f79851a;
        interfaceC2925.mo4231c(j);
        if (!this.f43911c) {
            while (i < this.f34369e) {
                interfaceC2925.accept(this.f34368d[i]);
                i++;
            }
        } else {
            while (i < this.f34369e && !interfaceC2925.mo4233f()) {
                interfaceC2925.accept(this.f34368d[i]);
                i++;
            }
        }
        interfaceC2925.end();
        this.f34368d = null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.f34368d;
        int i = this.f34369e;
        this.f34369e = i + 1;
        objArr[i] = obj;
    }
}
