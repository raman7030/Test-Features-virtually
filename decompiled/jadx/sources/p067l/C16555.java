package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܶ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16555 extends AbstractC10677 {

    /* JADX INFO: renamed from: c */
    public C20932 f48622c;

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ۖܰᩴ, l.᩵ܳ᩵] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ۖܰᩴ] */
    /* JADX WARN: Type inference failed for: r0v6, types: [l.ۖܰᩴ] */
    @Override // p067l.AbstractC3400, p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        ?? abstractC4817;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            abstractC4817 = new AbstractC4817();
        } else {
            abstractC4817 = new C20932((int) j);
        }
        this.f48622c = abstractC4817;
    }

    @Override // p067l.AbstractC3400, p067l.InterfaceC2925
    public final void end() {
        int[] iArr = (int[]) this.f48622c.mo4230b();
        Arrays.sort(iArr);
        long length = iArr.length;
        InterfaceC2925 interfaceC2925 = this.f6750a;
        interfaceC2925.mo4231c(length);
        int i = 0;
        if (!this.f29563b) {
            int length2 = iArr.length;
            while (i < length2) {
                interfaceC2925.accept(iArr[i]);
                i++;
            }
        } else {
            int length3 = iArr.length;
            while (i < length3) {
                int i2 = iArr[i];
                if (interfaceC2925.mo4233f()) {
                    break;
                }
                interfaceC2925.accept(i2);
                i++;
            }
        }
        interfaceC2925.end();
    }

    @Override // p067l.InterfaceC12274, p067l.InterfaceC2925
    public final void accept(int i) {
        this.f48622c.accept(i);
    }
}
