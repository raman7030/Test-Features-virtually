package l;

import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes.dex */
public final class C22995 implements InterfaceC0397 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7473 f74036;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f74037;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12392 f74038;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C12392 f74039;

    public C22995(C7473 c7473, boolean z) {
        this.f74036 = c7473;
        this.f74037 = z;
        if (z) {
            this.f74039 = c7473.f23032;
            this.f74038 = c7473.f23051;
        } else {
            this.f74039 = c7473.f23051;
            this.f74038 = c7473.f23032;
        }
    }

    @Override // l.InterfaceC0397
    /* JADX INFO: renamed from: ֫ */
    public final void mo1091(ArrayList arrayList) {
        C12392 c12392 = this.f74039;
        c12392.m30318(arrayList);
        if (this.f74038.m30441()) {
            return;
        }
        C7473 c7473 = this.f74036;
        if (c7473.f23019 == null) {
            return;
        }
        int[] iArrM30369 = c12392.m30369();
        for (InterfaceC0467 interfaceC0467 : c7473.f23019) {
            boolean z = this.f74037;
            int iMo15478 = interfaceC0467.mo15478(z);
            int iMo15483 = interfaceC0467.mo15483(z);
            int i = iArrM30369[0];
            if (iMo15478 < iArrM30369[1] && i < iMo15483) {
                arrayList.add(new C21645(R.string.MT_Protector, c7473.f23045 ? z ? R.drawable.MT_Protector : R.drawable.MT_Protector : z ? R.drawable.MT_Protector : R.drawable.MT_Protector, new InterfaceC13041() { // from class: l.ۨ۫ᩳ
                    @Override // l.InterfaceC13041
                    public final void accept(Object obj) {
                        C22995 c22995 = this.f34921;
                        C7473 c7474 = c22995.f74036;
                        C12392 c12393 = c22995.f74039;
                        boolean z2 = c22995.f74037;
                        C12392 c12394 = c22995.f74038;
                        if (c12394.m30441()) {
                            return;
                        }
                        int[] iArrM303610 = c12393.m30369();
                        C15859 c15859 = new C15859();
                        C15859 c158510 = new C15859();
                        for (InterfaceC0467 interfaceC0468 : c7474.f23019) {
                            int iMo15479 = interfaceC0468.mo15478(z2);
                            int iMo15484 = interfaceC0468.mo15483(z2);
                            int i2 = iArrM303610[0];
                            if (iMo15479 < iArrM303610[1] && i2 < iMo15484) {
                                boolean z3 = !z2;
                                int iMo154710 = interfaceC0468.mo15478(z3);
                                int iMo15485 = interfaceC0468.mo15483(z3);
                                if (interfaceC0468.mo2066(z2) == interfaceC0468.mo2070(z2) && iMo15484 == c12393.m30436().length() && iMo154710 > 0) {
                                    iMo154710--;
                                }
                                if (interfaceC0468.mo2066(z3) == interfaceC0468.mo2070(z3) && iMo15485 == c12394.m30436().length() && iMo15479 > 0) {
                                    iMo15479--;
                                }
                                c15859.add(iMo15479);
                                c15859.add(iMo15484);
                                c158510.add(iMo154710);
                                c158510.add(iMo15485);
                            }
                        }
                        if (c15859.isEmpty()) {
                            return;
                        }
                        c15859.mo3547((InterfaceC4571) null);
                        c158510.mo3547((InterfaceC4571) null);
                        c12394.m30436().replace(c158510.getInt(0), c158510.getInt(c158510.size() - 1), c12393.m30436().mo26557(c15859.getInt(0), c15859.getInt(c15859.size() - 1)));
                        c7474.m20022(c12393.m30444(), c12393.m30448(), z2);
                        c12394.requestFocus();
                    }
                }));
                return;
            }
        }
    }
}
