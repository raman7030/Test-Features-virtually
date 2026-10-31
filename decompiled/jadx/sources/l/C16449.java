package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19KT */
/* JADX INFO: loaded from: classes4.dex */
public final class C16449 implements InterfaceC18691 {
    @Override // l.InterfaceC18691
    /* JADX INFO: renamed from: ֫ */
    public final EnumC10930 mo3621() {
        return EnumC10930.FileStreamInformation;
    }

    @Override // l.InterfaceC18691
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC0345 mo3620(C10325 c10325) throws C13146 {
        ArrayList arrayList = new ArrayList();
        long j = 0;
        long jM26082 = 0;
        do {
            j += jM26082;
            c10325.m26097((int) j);
            jM26082 = c10325.m26082();
            long jM26083 = c10325.m26082();
            c10325.m26090();
            c10325.m26090();
            c10325.m26073(((int) jM26083) / 2, C8208.f25225);
            arrayList.add(new C3563());
        } while (jM26082 != 0);
        return new C3939();
    }
}
