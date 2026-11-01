package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۘ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34R9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6335 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ ActivityC22429 f16418;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ String f16419;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ int f16420;

    /* JADX INFO: renamed from: ܳ */
    public final C11084 f16421;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ String f16422;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ AbstractC20417 f16423;

    public C6335(AbstractC20417 abstractC20417, ActivityC22429 activityC22429, String str, String str2, int i) {
        this.f16423 = abstractC20417;
        this.f16418 = activityC22429;
        this.f16422 = str;
        this.f16419 = str2;
        this.f16420 = i;
        this.f16421 = C11084.m25530(activityC22429);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f16418, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C2981 c2981;
        C2981 c2982;
        C24499 c24499 = (C24499) this.f16423;
        ActivityC22429 activityC22429 = c24499.f77508;
        if (!activityC22429.f70775.f60063.isEmpty()) {
            ((C2981) activityC22429.f70775.f60063.peek()).f5265 = activityC22429.f70771.getFirstVisiblePosition();
        }
        Collection<C13068> collectionValues = c24499.f77509 ? ((C2981) activityC22429.f70775.f60063.peek()).f5264 : activityC22429.f70775.f60049.values();
        String str = this.f16422;
        String str2 = this.f16419;
        int i = this.f16420;
        if (i != 0) {
            if (i != 1) {
                c2982 = null;
            } else {
                c2981 = new C2981();
                c2981.f5266 = C17588.m40053(str, str2);
                for (C13068 c13068 : collectionValues) {
                    C9534 c9534M29924 = c13068.m29924();
                    if (c9534M29924 != null) {
                        C24286[] c24286ArrM22226 = c9534M29924.m22226();
                        int length = c24286ArrM22226.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                for (C24286 c24286 : c9534M29924.m22227()) {
                                    if ((str.length() <= 0 || c24286.f76932.f60619.m30317().equals(str)) && (str2.length() <= 0 || c24286.f76932.f60618.m53168().equals(str2))) {
                                        c2981.f5264.add(c13068);
                                        break;
                                    }
                                }
                                break;
                            }
                            C24286 c24287 = c24286ArrM22226[i2];
                            if ((str.length() <= 0 || c24287.f76932.f60619.m30317().equals(str)) && (str2.length() <= 0 || c24287.f76932.f60618.m53168().equals(str2))) {
                                c2981.f5264.add(c13068);
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
            activityC22429.f70775.f60063.push(c2982);
            activityC22429.f70775.f60050 = activityC22429.f70775.m44881();
        }
        c2981 = new C2981();
        c2981.f5266 = C17588.m40053(str, str2);
        for (C13068 c13069 : collectionValues) {
            C9534 c9534M29925 = c13069.m29924();
            if (c9534M29925 != null) {
                C15568[] c15568ArrM22225 = c9534M29925.m22225();
                int length2 = c15568ArrM22225.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        for (C15568 c15568 : c9534M29925.m22230()) {
                            if ((str.length() <= 0 || c15568.f44483.f73398.m30317().equals(str)) && (str2.length() <= 0 || c15568.f44483.f73397.m33398().equals(str2))) {
                                c2981.f5264.add(c13069);
                                break;
                            }
                        }
                        break;
                    }
                    C15568 c15569 = c15568ArrM22225[i3];
                    if ((str.length() <= 0 || c15569.f44483.f73398.m30317().equals(str)) && (str2.length() <= 0 || c15569.f44483.f73397.m33398().equals(str2))) {
                        c2981.f5264.add(c13069);
                        break;
                    }
                    i3++;
                }
            }
        }
        c2982 = c2981;
        activityC22429.f70775.f60063.push(c2982);
        activityC22429.f70775.f60050 = activityC22429.f70775.m44881();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f16421.m25532()) {
            ActivityC22429 activityC22429 = ((C24499) this.f16423).f77508;
            activityC22429.setTitle(((C2981) activityC22429.f70775.f60063.peek()).f5266);
            activityC22429.m50379(EnumC9017.SEARCH_RESULT_CLASS);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (this.f16421.m25532()) {
            this.f16418.m12259(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
