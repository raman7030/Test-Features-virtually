package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֡᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09JC */
/* JADX INFO: loaded from: classes2.dex */
public final class C0718 extends AbstractC1424 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public List f2706;

    public C0718() {
        super(EnumC8480.SMB2_ENCRYPTION_CAPABILITIES);
        this.f2706 = new ArrayList();
    }

    public C0718(List list) {
        super(EnumC8480.SMB2_ENCRYPTION_CAPABILITIES);
        this.f2706 = list;
    }

    @Override // l.AbstractC1424
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int mo2824(C0097 c0097) {
        List list = this.f2706;
        if (list == null || list.isEmpty()) {
            throw new IllegalStateException("Cannot serialize an empty or null cipherList");
        }
        c0097.m26086(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c0097.m26086((int) ((EnumC0386) it.next()).getValue());
        }
        return (list.size() * 2) + 2;
    }

    @Override // l.AbstractC1424
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo2823(C0097 c0097) throws C13146 {
        int iM26100 = c0097.m26100();
        for (int i = 0; i < iM26100; i++) {
            this.f2706.add((EnumC0386) C15262.m36279(c0097.m26100(), EnumC0386.class, null));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m2822() {
        return this.f2706;
    }
}
