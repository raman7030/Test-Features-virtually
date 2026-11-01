package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.᩵᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9PI */
/* JADX INFO: loaded from: classes5.dex */
public final class C21058 extends AbstractC2951 {
    @Override // p067l.AbstractC2951
    /* JADX INFO: renamed from: ֫ */
    public final void mo4876(long j, Object obj) {
        ((InterfaceC24389) C22558.m50565(j, obj)).mo46787();
    }

    @Override // p067l.AbstractC2951
    /* JADX INFO: renamed from: ֫ */
    public final void mo4877(long j, Object obj, Object obj2) {
        InterfaceC24389 interfaceC24389Mo10520 = (InterfaceC24389) C22558.m50565(j, obj);
        InterfaceC24389 interfaceC24389 = (InterfaceC24389) C22558.m50565(j, obj2);
        int size = interfaceC24389Mo10520.size();
        int size2 = interfaceC24389.size();
        if (size > 0 && size2 > 0) {
            if (!interfaceC24389Mo10520.mo46785()) {
                interfaceC24389Mo10520 = interfaceC24389Mo10520.mo10520(size2 + size);
            }
            interfaceC24389Mo10520.addAll(interfaceC24389);
        }
        if (size > 0) {
            interfaceC24389 = interfaceC24389Mo10520;
        }
        C22558.m50555(j, obj, interfaceC24389);
    }

    @Override // p067l.AbstractC2951
    /* JADX INFO: renamed from: ۧ */
    public final List mo4878(long j, Object obj) {
        InterfaceC24389 interfaceC24389 = (InterfaceC24389) C22558.m50565(j, obj);
        if (interfaceC24389.mo46785()) {
            return interfaceC24389;
        }
        int size = interfaceC24389.size();
        InterfaceC24389 interfaceC24389Mo10520 = interfaceC24389.mo10520(size == 0 ? 10 : size * 2);
        C22558.m50555(j, obj, interfaceC24389Mo10520);
        return interfaceC24389Mo10520;
    }
}
