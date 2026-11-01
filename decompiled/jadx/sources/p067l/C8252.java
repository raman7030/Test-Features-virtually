package p067l;

import bin.p000mt.plus.Main;
import com.alipay.sdk.p010m.p035m.C0168b;

/* JADX INFO: renamed from: l.ۛܽ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: B942 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8252 extends AbstractC3947 {
    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo3869(C4697 c4697) {
        return (c4697.m9964("local") || c4697.m9964(C0168b.f616k)) && c4697.m9966() == 1;
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        Main mainM9965 = c4697.m9965();
        InterfaceC19370 interfaceC19370M9961 = c4697.m9961();
        if (interfaceC19370M9961 instanceof AbstractC18707) {
            C5729 c5729 = new C5729(mainM9965);
            C17278 c17278 = (C17278) interfaceC19370M9961;
            c5729.m12729(c17278.mo39151());
            C5880.f14458.getClass();
            c5729.m12730(new C13776(C5463.m12008(interfaceC19370M9961)));
            c5729.m12734("open-ns");
            c5729.m12735(c17278.getPath());
            c5729.m12727();
            c5729.m12728(((C7367) c4697.m9970()).m17071());
            c5729.m12731(c17278.isDirectory());
            c5729.m12733();
            return;
        }
        String[] strArr = interfaceC19370M9961.isDirectory() ? new String[]{"goto", "locate"} : new String[]{"locate", "locate-click", "edit-text", "exec-script", "preview-html"};
        C5729 c57210 = new C5729(mainM9965);
        c57210.m12729(interfaceC19370M9961.mo39151());
        c57210.m12730(new C13776(C22179.f70167.mo13204(interfaceC19370M9961)));
        c57210.m12732(strArr);
        c57210.m12735(interfaceC19370M9961.getPath());
        c57210.m12727();
        c57210.m12733();
    }
}
