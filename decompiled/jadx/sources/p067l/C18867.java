package p067l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܿ۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4XC */
/* JADX INFO: loaded from: classes5.dex */
public final class C18867 implements InterfaceC20645 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ HashMap f56353;

    public C18867(HashMap map) {
        this.f56353 = map;
    }

    @Override // p067l.InterfaceC20645
    /* JADX INFO: renamed from: ֫ */
    public final void mo42940(AbstractC3880 abstractC3880) {
        C24902 c24902;
        int iIntValue;
        EnumC9677 enumC9677 = abstractC3880.f8417;
        EnumC9677 enumC9678 = EnumC9677.ASSIGN;
        HashMap map = this.f56353;
        if (enumC9677 == enumC9678) {
            if (abstractC3880.mo7674().f28658 == EnumC3642.NEW_ARRAY && abstractC3880.mo7675().f28658 == EnumC3642.LOCAL) {
                C17723 c17723 = (C17723) abstractC3880.mo7674();
                AbstractC10348 abstractC10348 = c17723.f66218;
                if (abstractC10348.f28658 != EnumC3642.CONSTANT || (iIntValue = ((Number) ((C13761) abstractC10348).f38899).intValue()) < 0) {
                    return;
                }
                C19736 c19736 = (C19736) abstractC3880.mo7675();
                String str = c17723.f52945;
                C24902 c24903 = new C24902();
                c24903.f79525 = new ArrayList();
                c24903.f79527 = new ArrayList();
                c24903.f79526 = iIntValue;
                c24903.f79528 = str;
                c24903.f79524 = (C23089) abstractC3880;
                map.put(c19736, c24903);
                return;
            }
            if (abstractC3880.mo7675().f28658 == EnumC3642.ARRAY) {
                C14431 c14431 = (C14431) abstractC3880.mo7675();
                AbstractC10348 abstractC10349 = c14431.f5200;
                if (abstractC10349.f28658 == EnumC3642.LOCAL) {
                    C19736 c19737 = (C19736) abstractC10349;
                    C24902 c24904 = (C24902) map.get(c19737);
                    if (c24904 != null) {
                        if (c14431.f5201.f28658 == EnumC3642.CONSTANT) {
                            c24904.f79525.add(abstractC3880);
                            return;
                        } else {
                            map.remove(c19737);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (enumC9677 == EnumC9677.FILL_ARRAY_DATA && abstractC3880.mo7675().f28658 == EnumC3642.LOCAL && (c24902 = (C24902) map.get((C19736) abstractC3880.mo7675())) != null) {
            c24902.f79525.add(abstractC3880);
        }
    }
}
