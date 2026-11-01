package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ܳۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8P7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15976 {

    /* JADX INFO: renamed from: ֫ */
    public final List f46273;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC20790[] f46274;

    /* JADX INFO: renamed from: ܽ */
    public final C24764 f46275 = new C24764(new C16624(1, this));

    public C15976(List list) {
        this.f46273 = list;
        this.f46274 = new InterfaceC20790[list.size()];
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36318(InterfaceC23116 interfaceC23116, C20672 c20672) {
        int i = 0;
        while (true) {
            InterfaceC20790[] interfaceC20790Arr = this.f46274;
            if (i >= interfaceC20790Arr.length) {
                return;
            }
            c20672.m46737();
            InterfaceC20790 interfaceC20790Mo5732 = interfaceC23116.mo5732(c20672.m46739(), 3);
            C10307 c10307 = (C10307) this.f46273.get(i);
            String str = c10307.f28528;
            C23877.m52956("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String strM46738 = c10307.f28535;
            if (strM46738 == null) {
                strM46738 = c20672.m46738();
            }
            C3601 c3601 = new C3601();
            c3601.m6701(strM46738);
            c3601.m6694("video/mp2t");
            c3601.m6697(str);
            c3601.m6698(c10307.f28542);
            c3601.m6703(c10307.f28517);
            c3601.m6674(c10307.f28512);
            c3601.m6678(c10307.f28548);
            interfaceC20790Mo5732.mo10503(c3601.m6672());
            interfaceC20790Arr[i] = interfaceC20790Mo5732;
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36316(int i) {
        this.f46275.m54434(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36317(long j, C19203 c19203) {
        this.f46275.m54435(j, c19203);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m36319() {
        this.f46275.m54436();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36315() {
        this.f46275.m54436();
    }
}
