package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 69DQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21158 extends AbstractC3722 {

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f66472;

    public C21158() {
        super(EnumC10428.SMB2_COMPRESSION_CAPABILITIES);
        this.f66472 = new ArrayList();
    }

    @Override // p067l.AbstractC3722
    /* JADX INFO: renamed from: ᩳ */
    public final int mo5153(C2460 c2460) {
        ArrayList arrayList = this.f66472;
        if (arrayList == null) {
            throw new IllegalStateException("Cannot write a null compressionAlgorithms array");
        }
        c2460.m28111(arrayList.size());
        c2460.m3476();
        c2460.m3477();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c2460.m28111((int) ((EnumC6089) it.next()).getValue());
        }
        return (arrayList.size() * 2) + 8;
    }

    @Override // p067l.AbstractC3722
    /* JADX INFO: renamed from: ۧ */
    public final void mo5152(C2460 c2460) throws C14862 {
        int iM28125 = c2460.m28125();
        c2460.m28121(2);
        c2460.m28121(4);
        for (int i = 0; i < iM28125; i++) {
            int iM28126 = c2460.m28125();
            EnumC6089 enumC6089 = (EnumC6089) C16873.m38440(iM28126, EnumC6089.class, null);
            if (enumC6089 == null) {
                throw new IllegalStateException(String.format("Unknown SMB3CompressionAlgorithm with value '%d'", Integer.valueOf(iM28126)));
            }
            this.f66472.add(enumC6089);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList m47771() {
        return this.f66472;
    }
}
