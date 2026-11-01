package p067l;

import bin.p000mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16020 extends AbstractC14618 {

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ActivityC8645 f46395;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16020(ActivityC8645 activityC8645, ActivityC8645 activityC8646) {
        super(R.layout.MT_Protector, activityC8646, "arsc_search_resource");
        this.f46395 = activityC8645;
    }

    @Override // p067l.AbstractC14618
    /* JADX INFO: renamed from: ֫ */
    public final void mo19589(String str, String str2, boolean z) {
        ActivityC8645 activityC8645 = this.f46395;
        activityC8645.f23213.f78327 = str2;
        if (z) {
            String lowerCase = str.toLowerCase();
            Iterator it = activityC8645.f23213.f78324.mo23906().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C10278) it.next()).mo14714().iterator();
                while (it2.hasNext()) {
                    Iterator it3 = ((C21678) it2.next()).mo5201().iterator();
                    while (it3.hasNext()) {
                        for (C20337 c20337 : ((C4914) it3.next()).mo20696()) {
                            for (C6925 c6925 : c20337.values()) {
                                if (c6925.mo7252() && c6925.mo7251().getValue().toLowerCase().contains(lowerCase)) {
                                    activityC8645.f23213.f78319.add(new C7304(c20337, c6925));
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        int i = (int) Long.parseLong(str);
        Iterator it4 = activityC8645.f23213.f78324.mo23906().iterator();
        while (it4.hasNext()) {
            for (C21678 c21678 : ((C10278) it4.next()).mo14714()) {
                boolean zEquals = c21678.getTypeName().equals("style");
                Iterator it5 = c21678.mo5201().iterator();
                while (it5.hasNext()) {
                    for (C20337 c20338 : ((C4914) it5.next()).mo20696()) {
                        boolean zMo31474 = c20338.mo31474();
                        if (zEquals && zMo31474 && c20338.getParent() == i) {
                            C7304 c7304 = new C7304(c20338, null);
                            c7304.f19118 = activityC8645.getString(R.string.MT_Protector) + ": " + String.format("%08X", Integer.valueOf(i));
                            activityC8645.f23213.f78319.add(c7304);
                        }
                        Iterator it6 = c20338.values().iterator();
                        while (it6.hasNext()) {
                            C6925 c6926 = (C6925) it6.next();
                            int iMo7247 = c6926.mo7247();
                            Iterator it7 = it6;
                            if ((iMo7247 == 2 || iMo7247 == 1 || iMo7247 == 8 || iMo7247 == 7 || (iMo7247 >= 16 && iMo7247 <= 31)) && c6926.getValue() == i) {
                                activityC8645.f23213.f78319.add(new C7304(c20338, c6926));
                                break;
                            }
                            if (zMo31474 && c6926.mo7249() == i) {
                                C7304 c7305 = new C7304(c20338, null);
                                c7305.f19118 = activityC8645.getString(R.string.arsc_value_id) + ": " + String.format("%08X", Integer.valueOf(i));
                                activityC8645.f23213.f78319.add(c7305);
                                break;
                            }
                            it6 = it7;
                        }
                    }
                }
            }
        }
    }

    @Override // p067l.AbstractC14618
    /* JADX INFO: renamed from: ֫ */
    public final void mo19588() {
        ActivityC8645 activityC8645 = this.f46395;
        activityC8645.setTitle(activityC8645.f23213.f78327);
        activityC8645.m20059(EnumC6633.SEARCH_VALUE);
    }
}
