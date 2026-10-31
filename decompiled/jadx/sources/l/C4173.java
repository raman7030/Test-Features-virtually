package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۘ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34R9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4173 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21107 f13605;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f13606;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f13607;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9170 f13608;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f13609;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC18990 f13610;

    public C4173(AbstractC18990 abstractC18990, ActivityC21107 activityC21107, String str, String str2, int i) {
        this.f13610 = abstractC18990;
        this.f13605 = activityC21107;
        this.f13609 = str;
        this.f13606 = str2;
        this.f13607 = i;
        this.f13608 = C9170.m23579(activityC21107);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f13605, R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C0644 c0644;
        C0644 c0645;
        C23285 c23285 = (C23285) this.f13610;
        ActivityC21107 activityC21107 = c23285.f74764;
        if (!activityC21107.f68093.f56846.isEmpty()) {
            ((C0644) activityC21107.f68093.f56846.peek()).f2493 = activityC21107.f68089.getFirstVisiblePosition();
        }
        Collection<C11258> collectionValues = c23285.f74765 ? ((C0644) activityC21107.f68093.f56846.peek()).f2492 : activityC21107.f68093.f56832.values();
        String str = this.f13609;
        String str2 = this.f13606;
        int i = this.f13607;
        if (i != 0) {
            if (i != 1) {
                c0645 = null;
            } else {
                c0644 = new C0644();
                c0644.f2494 = C16014.m37867(str, str2);
                for (C11258 c11258 : collectionValues) {
                    C7540 c7540M27863 = c11258.m27863();
                    if (c7540M27863 != null) {
                        C23062[] c23062ArrM20250 = c7540M27863.m20250();
                        int length = c23062ArrM20250.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                for (C23062 c23062 : c7540M27863.m20251()) {
                                    if ((str.length() <= 0 || c23062.f74187.f57398.m28273().equals(str)) && (str2.length() <= 0 || c23062.f74187.f57397.m50835().equals(str2))) {
                                        c0644.f2492.add(c11258);
                                        break;
                                    }
                                }
                                break;
                            }
                            C23062 c23063 = c23062ArrM20250[i2];
                            if ((str.length() <= 0 || c23063.f74187.f57398.m28273().equals(str)) && (str2.length() <= 0 || c23063.f74187.f57397.m50835().equals(str2))) {
                                c0644.f2492.add(c11258);
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
            activityC21107.f68093.f56846.push(c0645);
            activityC21107.f68093.f56833 = activityC21107.f68093.m42621();
        }
        c0644 = new C0644();
        c0644.f2494 = C16014.m37867(str, str2);
        for (C11258 c11259 : collectionValues) {
            C7540 c7540M27864 = c11259.m27863();
            if (c7540M27864 != null) {
                C13889[] c13889ArrM20249 = c7540M27864.m20249();
                int length2 = c13889ArrM20249.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        for (C13889 c13889 : c7540M27864.m20254()) {
                            if ((str.length() <= 0 || c13889.f41402.f70681.m28273().equals(str)) && (str2.length() <= 0 || c13889.f41402.f70680.m31312().equals(str2))) {
                                c0644.f2492.add(c11259);
                                break;
                            }
                        }
                        break;
                    }
                    C13889 c138810 = c13889ArrM20249[i3];
                    if ((str.length() <= 0 || c138810.f41402.f70681.m28273().equals(str)) && (str2.length() <= 0 || c138810.f41402.f70680.m31312().equals(str2))) {
                        c0644.f2492.add(c11259);
                        break;
                    }
                    i3++;
                }
            }
        }
        c0645 = c0644;
        activityC21107.f68093.f56846.push(c0645);
        activityC21107.f68093.f56833 = activityC21107.f68093.m42621();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f13608.m23581()) {
            ActivityC21107 activityC21107 = ((C23285) this.f13610).f74764;
            activityC21107.setTitle(((C0644) activityC21107.f68093.f56846.peek()).f2494);
            activityC21107.m48049(EnumC6995.SEARCH_RESULT_CLASS);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f13608.m23581()) {
            this.f13605.m10223(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
