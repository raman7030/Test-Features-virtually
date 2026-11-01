package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩺֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23932 extends AbstractC22747 {

    /* JADX INFO: renamed from: c */
    public C7087 f76043c;

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ۖܰᩴ, l.ۙ᩺ᩴ] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ۖܰᩴ] */
    /* JADX WARN: Type inference failed for: r0v6, types: [l.ۖܰᩴ] */
    @Override // p067l.AbstractC8094, p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        ?? abstractC4817;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            abstractC4817 = new AbstractC4817();
        } else {
            abstractC4817 = new C7087((int) j);
        }
        this.f76043c = abstractC4817;
    }

    @Override // p067l.AbstractC8094, p067l.InterfaceC2925
    public final void end() {
        long[] jArr = (long[]) this.f76043c.mo4230b();
        Arrays.sort(jArr);
        long length = jArr.length;
        InterfaceC2925 interfaceC2925 = this.f21348a;
        interfaceC2925.mo4231c(length);
        int i = 0;
        if (!this.f71725b) {
            int length2 = jArr.length;
            while (i < length2) {
                interfaceC2925.accept(jArr[i]);
                i++;
            }
        } else {
            int length3 = jArr.length;
            while (i < length3) {
                long j = jArr[i];
                if (interfaceC2925.mo4233f()) {
                    break;
                }
                interfaceC2925.accept(j);
                i++;
            }
        }
        interfaceC2925.end();
    }

    @Override // p067l.InterfaceC16336, p067l.InterfaceC2925
    public final void accept(long j) {
        this.f76043c.accept(j);
    }
}
