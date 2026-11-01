package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19KT */
/* JADX INFO: loaded from: classes4.dex */
public final class C18001 implements InterfaceC20132 {
    @Override // p067l.InterfaceC20132
    /* JADX INFO: renamed from: ֫ */
    public final EnumC12756 mo5892() {
        return EnumC12756.FileStreamInformation;
    }

    @Override // p067l.InterfaceC20132
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC2696 mo5891(C12181 c12181) throws C14862 {
        ArrayList arrayList = new ArrayList();
        long j = 0;
        long jM28107 = 0;
        do {
            j += jM28107;
            c12181.m28122((int) j);
            jM28107 = c12181.m28107();
            long jM28108 = c12181.m28107();
            c12181.m28115();
            c12181.m28115();
            c12181.m28098(((int) jM28108) / 2, C10169.f28135);
            arrayList.add(new C5755());
        } while (jM28107 != 0);
        return new C6112();
    }
}
