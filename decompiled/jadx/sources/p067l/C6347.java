package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ۘ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5G1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6347 extends AbstractC10818 implements InterfaceC13408 {

    /* JADX INFO: renamed from: ᩶ */
    public final String f16450;

    /* JADX INFO: renamed from: ᩸ */
    public final C14393 f16451;

    /* JADX INFO: renamed from: ᩹ */
    public int f16452;

    public C6347(String str, C14393 c14393) {
        int i;
        this.f16450 = str;
        this.f16451 = c14393;
        if (str != null && str.startsWith("call_site_")) {
            try {
                i = Integer.parseInt(str.substring(10));
            } catch (NumberFormatException unused) {
                i = -1;
            }
        } else {
            i = -1;
        }
        this.f16452 = i;
    }

    @Override // p067l.InterfaceC6227
    public final String getName() {
        return this.f16450;
    }

    @Override // p067l.InterfaceC6227
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC20980 mo14105() {
        return ((C16089) this.f16451.f41135.get(0)).f47346;
    }

    @Override // p067l.InterfaceC6227
    /* JADX INFO: renamed from: ܺ */
    public final String mo14104() {
        return ((InterfaceC19007) this.f16451.f41135.get(1)).getValue();
    }

    @Override // p067l.InterfaceC6227
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC2873 mo14103() {
        return ((C24807) this.f16451.f41135.get(2)).f79273;
    }

    @Override // p067l.InterfaceC6227
    /* JADX INFO: renamed from: ۢ */
    public final List mo14102() {
        C14393 c14393 = this.f16451;
        if (c14393.f41135.size() <= 3) {
            return AbstractC16192.m36872of();
        }
        List list = c14393.f41135;
        return list.subList(3, list.size());
    }

    @Override // p067l.InterfaceC6227
    public final int getIndex() {
        return this.f16452;
    }
}
