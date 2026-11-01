package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75V0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13269 extends C21808 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractC3880 f37253;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C23997 f37254;

    public C13269(C23997 c23997) {
        this.f37254 = c23997;
    }

    @Override // p067l.C21808
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC3880 mo30320(AbstractC3880 abstractC3880) {
        C23997 c23997 = this.f37254;
        C9245[] c9245Arr = c23997.f76212;
        this.f37253 = abstractC3880;
        EnumC3031 enumC3031 = abstractC3880.f8412;
        EnumC3031 enumC3032 = EnumC3031.E2;
        C9245 c9245 = C3841.f8244;
        if (enumC3031 == enumC3032) {
            EnumC3642 enumC3642 = abstractC3880.mo7675().f28658;
            EnumC3642 enumC3643 = EnumC3642.LOCAL;
            if (enumC3642 == enumC3643) {
                C19736 c19736 = (C19736) abstractC3880.mo7675();
                if (abstractC3880.mo7674().f28658 == enumC3643) {
                    c9245Arr[c19736.f60034] = c9245Arr[((C19736) abstractC3880.mo7674()).f60034];
                    return abstractC3880;
                }
                if (abstractC3880.mo7674().f28658 == EnumC3642.NEW) {
                    c9245Arr[c19736.f60034] = new C9245((C15279) c23997.f76214.get(c19736), false);
                    return abstractC3880;
                }
                mo27265(abstractC3880.mo7674());
                c9245Arr[c19736.f60034] = c9245;
                return abstractC3880;
            }
        }
        if (abstractC3880.f8417 == EnumC9677.LABEL) {
            ArrayList arrayList = ((C15041) abstractC3880).f42963;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c9245Arr[((C19736) ((C23089) it.next()).f45527).f60034] = c9245;
                }
            }
            return abstractC3880;
        }
        super.mo30320(abstractC3880);
        return abstractC3880;
    }

    @Override // p067l.C21808
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10348 mo27265(AbstractC10348 abstractC10348) {
        C9245 c9245;
        C15279 c15279;
        C23997 c23997 = this.f37254;
        C9245[] c9245Arr = c23997.f76212;
        EnumC3642 enumC3642 = abstractC10348.f28658;
        EnumC3642 enumC3643 = EnumC3642.INVOKE_SPECIAL;
        C9245 c9246 = C3841.f8244;
        if (enumC3642 == enumC3643 && abstractC10348.mo17753().length >= 1 && "<init>".equals(((C13031) abstractC10348).f36656.m21673())) {
            AbstractC10348 abstractC10349 = abstractC10348.mo17753()[0];
            if (abstractC10349.f28658 == EnumC3642.LOCAL && (c15279 = (c9245 = c9245Arr[((C19736) abstractC10349).f60034]).f25070) != null) {
                if (c15279.f43603 != null) {
                    c15279.f43605 = true;
                } else {
                    c9245.f25069 = true;
                    c15279.f43603 = this.f37253;
                    for (int i = 0; i < c9245Arr.length; i++) {
                        C9245 c9247 = c9245Arr[i];
                        if (c9247 != null && c9247.f25070 == c15279) {
                            c9245Arr[i] = c9246;
                        }
                    }
                    c23997.f76210 = true;
                }
            }
        }
        super.mo27265(abstractC10348);
        if (abstractC10348.f28658 == EnumC3642.LOCAL) {
            int i2 = ((C19736) abstractC10348).f60034;
            C9245 c9248 = c9245Arr[i2];
            if (!c9248.f25069) {
                C15279 c152710 = c9248.f25070;
                if (c152710 != null) {
                    c152710.f43605 = true;
                }
                c9245Arr[i2] = c9246;
            }
        }
        return abstractC10348;
    }
}
