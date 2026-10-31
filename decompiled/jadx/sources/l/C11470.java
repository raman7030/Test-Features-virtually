package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75V0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11470 extends C20454 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC1591 f34257;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22758 f34258;

    public C11470(C22758 c22758) {
        this.f34258 = c22758;
    }

    @Override // l.C20454
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC1591 mo28276(AbstractC1591 abstractC1591) {
        C22758 c22758 = this.f34258;
        C7236[] c7236Arr = c22758.f73486;
        this.f34257 = abstractC1591;
        EnumC0697 enumC0697 = abstractC1591.f5633;
        EnumC0697 enumC0698 = EnumC0697.E2;
        C7236 c7236 = C1550.f5463;
        if (enumC0697 == enumC0698) {
            EnumC1340 enumC1340 = abstractC1591.mo5445().f25745;
            EnumC1340 enumC1341 = EnumC1340.LOCAL;
            if (enumC1340 == enumC1341) {
                C18274 c18274 = (C18274) abstractC1591.mo5445();
                if (abstractC1591.mo5444().f25745 == enumC1341) {
                    c7236Arr[c18274.f56817] = c7236Arr[((C18274) abstractC1591.mo5444()).f56817];
                    return abstractC1591;
                }
                if (abstractC1591.mo5444().f25745 == EnumC1340.NEW) {
                    c7236Arr[c18274.f56817] = new C7236((C13585) c22758.f73488.get(c18274), false);
                    return abstractC1591;
                }
                mo25248(abstractC1591.mo5444());
                c7236Arr[c18274.f56817] = c7236;
                return abstractC1591;
            }
        }
        if (abstractC1591.f5638 == EnumC7690.LABEL) {
            ArrayList arrayList = ((C13334) abstractC1591).f39897;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c7236Arr[((C18274) ((C21802) it.next()).f42444).f56817] = c7236;
                }
            }
            return abstractC1591;
        }
        super.mo28276(abstractC1591);
        return abstractC1591;
    }

    @Override // l.C20454
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8396 mo25248(AbstractC8396 abstractC8396) {
        C7236 c7236;
        C13585 c13585;
        C22758 c22758 = this.f34258;
        C7236[] c7236Arr = c22758.f73486;
        EnumC1340 enumC1340 = abstractC8396.f25745;
        EnumC1340 enumC1341 = EnumC1340.INVOKE_SPECIAL;
        C7236 c7237 = C1550.f5463;
        if (enumC1340 == enumC1341 && abstractC8396.mo15838().length >= 1 && "<init>".equals(((C11219) abstractC8396).f33657.m19700())) {
            AbstractC8396 abstractC8397 = abstractC8396.mo15838()[0];
            if (abstractC8397.f25745 == EnumC1340.LOCAL && (c13585 = (c7236 = c7236Arr[((C18274) abstractC8397).f56817]).f22187) != null) {
                if (c13585.f40526 != null) {
                    c13585.f40528 = true;
                } else {
                    c7236.f22186 = true;
                    c13585.f40526 = this.f34257;
                    for (int i = 0; i < c7236Arr.length; i++) {
                        C7236 c7238 = c7236Arr[i];
                        if (c7238 != null && c7238.f22187 == c13585) {
                            c7236Arr[i] = c7237;
                        }
                    }
                    c22758.f73484 = true;
                }
            }
        }
        super.mo25248(abstractC8396);
        if (abstractC8396.f25745 == EnumC1340.LOCAL) {
            int i2 = ((C18274) abstractC8396).f56817;
            C7236 c7239 = c7236Arr[i2];
            if (!c7239.f22186) {
                C13585 c13586 = c7239.f22187;
                if (c13586 != null) {
                    c13586.f40528 = true;
                }
                c7236Arr[i2] = c7237;
            }
        }
        return abstractC8396;
    }
}
