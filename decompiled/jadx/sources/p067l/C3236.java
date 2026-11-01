package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.֨ۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18JT */
/* JADX INFO: loaded from: classes2.dex */
public final class C3236 {

    /* JADX INFO: renamed from: ֫ */
    public final List f6269;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC20790[] f6270;

    /* JADX INFO: renamed from: ܽ */
    public final C24764 f6271;

    public C3236(List list) {
        this.f6269 = list;
        this.f6270 = new InterfaceC20790[list.size()];
        C24764 c24764 = new C24764(new InterfaceC16046() { // from class: l.ۚۚۧ
            @Override // p067l.InterfaceC16046
            /* JADX INFO: renamed from: ֫ */
            public final void mo16618(long j, C19203 c19203) {
                C9034.m20905(j, c19203, this.f18927.f6270);
            }
        });
        this.f6271 = c24764;
        c24764.m54434(3);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5587(InterfaceC23116 interfaceC23116, C20672 c20672) {
        int i = 0;
        while (true) {
            InterfaceC20790[] interfaceC20790Arr = this.f6270;
            if (i >= interfaceC20790Arr.length) {
                return;
            }
            c20672.m46737();
            InterfaceC20790 interfaceC20790Mo5732 = interfaceC23116.mo5732(c20672.m46739(), 3);
            C10307 c10307 = (C10307) this.f6269.get(i);
            String str = c10307.f28528;
            C23877.m52956("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            C3601 c3601 = new C3601();
            c3601.m6701(c20672.m46738());
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
    public final void m5586(long j, C19203 c19203) {
        if (c19203.m43703() < 9) {
            return;
        }
        int iM43739 = c19203.m43739();
        int iM437310 = c19203.m43739();
        int iM43702 = c19203.m43702();
        if (iM43739 == 434 && iM437310 == 1195456820 && iM43702 == 3) {
            this.f6271.m54435(j, c19203);
        }
    }
}
