package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֡᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09JC */
/* JADX INFO: loaded from: classes2.dex */
public final class C3051 extends AbstractC3722 {

    /* JADX INFO: renamed from: ۧ */
    public List f5478;

    public C3051() {
        super(EnumC10428.SMB2_ENCRYPTION_CAPABILITIES);
        this.f5478 = new ArrayList();
    }

    public C3051(List list) {
        super(EnumC10428.SMB2_ENCRYPTION_CAPABILITIES);
        this.f5478 = list;
    }

    @Override // p067l.AbstractC3722
    /* JADX INFO: renamed from: ᩳ */
    public final int mo5153(C2460 c2460) {
        List list = this.f5478;
        if (list == null || list.isEmpty()) {
            throw new IllegalStateException("Cannot serialize an empty or null cipherList");
        }
        c2460.m28111(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c2460.m28111((int) ((EnumC2735) it.next()).getValue());
        }
        return (list.size() * 2) + 2;
    }

    @Override // p067l.AbstractC3722
    /* JADX INFO: renamed from: ۧ */
    public final void mo5152(C2460 c2460) throws C14862 {
        int iM28125 = c2460.m28125();
        for (int i = 0; i < iM28125; i++) {
            this.f5478.add((EnumC2735) C16873.m38440(c2460.m28125(), EnumC2735.class, null));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final List m5151() {
        return this.f5478;
    }
}
