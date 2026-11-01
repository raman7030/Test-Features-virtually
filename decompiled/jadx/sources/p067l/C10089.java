package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۠ۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10089 extends AbstractRunnableC16711 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C4210 f28005;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C22830 f28006;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10089(C22830 c22830, Object[] objArr, C4210 c4210) {
        super("OkHttp %s ACK Settings", objArr);
        this.f28006 = c22830;
        this.f28005 = c4210;
    }

    @Override // p067l.AbstractRunnableC16711
    /* JADX INFO: renamed from: ֫ */
    public final void mo5904() {
        C12101[] c12101Arr;
        long j;
        C22830 c22830 = this.f28006;
        C4210 c4210 = this.f28005;
        synchronized (c22830.f71910.f74872) {
            synchronized (c22830.f71910) {
                int iM8550 = c22830.f71910.f74874.m8550();
                c22830.f71910.f74874.m8549(c4210);
                int iM8551 = c22830.f71910.f74874.m8550();
                c12101Arr = null;
                if (iM8551 == -1 || iM8551 == iM8550) {
                    j = 0;
                } else {
                    j = iM8551 - iM8550;
                    if (!c22830.f71910.f74869.isEmpty()) {
                        c12101Arr = (C12101[]) c22830.f71910.f74869.values().toArray(new C12101[c22830.f71910.f74869.size()]);
                    }
                }
            }
            try {
                C23500 c23500 = c22830.f71910;
                c23500.f74872.m18745(c23500.f74874);
            } catch (IOException unused) {
                C23500 c23501 = c22830.f71910;
                try {
                    EnumC15197 enumC15197 = EnumC15197.PROTOCOL_ERROR;
                    c23501.m52261(enumC15197, enumC15197);
                } catch (IOException unused2) {
                }
            }
        }
        if (c12101Arr != null) {
            for (C12101 c12101 : c12101Arr) {
                synchronized (c12101) {
                    c12101.f33827 += j;
                    if (j > 0) {
                        c12101.notifyAll();
                    }
                }
            }
        }
        C23500.f74864.execute(new C16793(c22830, c22830.f71910.f74873));
    }
}
