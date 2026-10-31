package l;

import java.util.List;

/* JADX INFO: renamed from: l.᩵᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9PI */
/* JADX INFO: loaded from: classes5.dex */
public final class C19665 extends AbstractC0613 {
    @Override // l.AbstractC0613
    /* JADX INFO: renamed from: ֫ */
    public final void mo2520(long j, Object obj) {
        ((InterfaceC23170) C21244.m48234(j, obj)).mo44493();
    }

    @Override // l.AbstractC0613
    /* JADX INFO: renamed from: ֫ */
    public final void mo2521(long j, Object obj, Object obj2) {
        InterfaceC23170 interfaceC23170Mo8473 = (InterfaceC23170) C21244.m48234(j, obj);
        InterfaceC23170 interfaceC23170 = (InterfaceC23170) C21244.m48234(j, obj2);
        int size = interfaceC23170Mo8473.size();
        int size2 = interfaceC23170.size();
        if (size > 0 && size2 > 0) {
            if (!interfaceC23170Mo8473.mo44491()) {
                interfaceC23170Mo8473 = interfaceC23170Mo8473.mo8473(size2 + size);
            }
            interfaceC23170Mo8473.addAll(interfaceC23170);
        }
        if (size > 0) {
            interfaceC23170 = interfaceC23170Mo8473;
        }
        C21244.m48224(j, obj, interfaceC23170);
    }

    @Override // l.AbstractC0613
    /* JADX INFO: renamed from: ۧ */
    public final List mo2522(long j, Object obj) {
        InterfaceC23170 interfaceC23170 = (InterfaceC23170) C21244.m48234(j, obj);
        if (interfaceC23170.mo44491()) {
            return interfaceC23170;
        }
        int size = interfaceC23170.size();
        InterfaceC23170 interfaceC23170Mo8473 = interfaceC23170.mo8473(size == 0 ? 10 : size * 2);
        C21244.m48224(j, obj, interfaceC23170Mo8473);
        return interfaceC23170Mo8473;
    }
}
