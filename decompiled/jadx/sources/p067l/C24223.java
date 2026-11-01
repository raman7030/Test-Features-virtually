package p067l;

import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes.dex */
public final class C24223 implements InterfaceC2746 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C9471 f76771;

    /* JADX INFO: renamed from: ᩶ */
    public final boolean f76772;

    /* JADX INFO: renamed from: ᩸ */
    public final C14146 f76773;

    /* JADX INFO: renamed from: ᩹ */
    public final C14146 f76774;

    public C24223(C9471 c9471, boolean z) {
        this.f76771 = c9471;
        this.f76772 = z;
        if (z) {
            this.f76774 = c9471.f25944;
            this.f76773 = c9471.f25963;
        } else {
            this.f76774 = c9471.f25963;
            this.f76773 = c9471.f25944;
        }
    }

    @Override // p067l.InterfaceC2746
    /* JADX INFO: renamed from: ֫ */
    public final void mo3487(ArrayList arrayList) {
        C14146 c14146 = this.f76774;
        c14146.m32382(arrayList);
        if (this.f76773.m32505()) {
            return;
        }
        C9471 c9471 = this.f76771;
        if (c9471.f25931 == null) {
            return;
        }
        int[] iArrM32433 = c14146.m32433();
        for (InterfaceC2812 interfaceC2812 : c9471.f25931) {
            boolean z = this.f76772;
            int iMo17389 = interfaceC2812.mo17389(z);
            int iMo17394 = interfaceC2812.mo17394(z);
            int i = iArrM32433[0];
            if (iMo17389 < iArrM32433[1] && i < iMo17394) {
                arrayList.add(new C22940(R.string.MT_Protector, c9471.f25957 ? z ? R.drawable.MT_Protector : R.drawable.MT_Protector : z ? R.drawable.MT_Protector : R.drawable.MT_Protector, new InterfaceC1489() { // from class: l.ۨ۫ᩳ
                    @Override // p067l.InterfaceC1489
                    public final void accept(Object obj) {
                        C24223 c24223 = this.f37919;
                        C9471 c9472 = c24223.f76771;
                        C14146 c14147 = c24223.f76774;
                        boolean z2 = c24223.f76772;
                        C14146 c14148 = c24223.f76773;
                        if (c14148.m32505()) {
                            return;
                        }
                        int[] iArrM32434 = c14147.m32433();
                        C17441 c17441 = new C17441();
                        C17441 c17442 = new C17441();
                        for (InterfaceC2812 interfaceC2813 : c9472.f25931) {
                            int iMo173810 = interfaceC2813.mo17389(z2);
                            int iMo17395 = interfaceC2813.mo17394(z2);
                            int i2 = iArrM32434[0];
                            if (iMo173810 < iArrM32434[1] && i2 < iMo17395) {
                                boolean z3 = !z2;
                                int iMo173811 = interfaceC2813.mo17389(z3);
                                int iMo17396 = interfaceC2813.mo17394(z3);
                                if (interfaceC2813.mo4446(z2) == interfaceC2813.mo4450(z2) && iMo17395 == c14147.m32500().length() && iMo173811 > 0) {
                                    iMo173811--;
                                }
                                if (interfaceC2813.mo4446(z3) == interfaceC2813.mo4450(z3) && iMo17396 == c14148.m32500().length() && iMo173810 > 0) {
                                    iMo173810--;
                                }
                                c17441.add(iMo173810);
                                c17441.add(iMo17395);
                                c17442.add(iMo173811);
                                c17442.add(iMo17396);
                            }
                        }
                        if (c17441.isEmpty()) {
                            return;
                        }
                        c17441.mo5834((InterfaceC6713) null);
                        c17442.mo5834((InterfaceC6713) null);
                        c14148.m32500().replace(c17442.getInt(0), c17442.getInt(c17442.size() - 1), c14147.m32500().mo28590(c17441.getInt(0), c17441.getInt(c17441.size() - 1)));
                        c9472.m21997(c14147.m32508(), c14147.m32512(), z2);
                        c14148.requestFocus();
                    }
                }));
                return;
            }
        }
    }
}
