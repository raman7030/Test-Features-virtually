package l;

import bin.mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14364 extends AbstractC12889 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6604 f43304;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14364(ActivityC6604 activityC6604, ActivityC6604 activityC6605) {
        super(R.layout.MT_Protector, activityC6605, "arsc_search_resource");
        this.f43304 = activityC6604;
    }

    @Override // l.AbstractC12889
    /* JADX INFO: renamed from: ֫ */
    public final void mo17649(String str, String str2, boolean z) {
        ActivityC6604 activityC6604 = this.f43304;
        activityC6604.f20336.f75581 = str2;
        if (z) {
            String lowerCase = str.toLowerCase();
            Iterator it = activityC6604.f20336.f75578.mo21936().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C8322) it.next()).mo12850().iterator();
                while (it2.hasNext()) {
                    Iterator it3 = ((C20317) it2.next()).mo2872().iterator();
                    while (it3.hasNext()) {
                        for (C18906 c18906 : ((C2678) it3.next()).mo18746()) {
                            for (C4794 c4794 : c18906.values()) {
                                if (c4794.mo5009() && c4794.mo5008().getValue().toLowerCase().contains(lowerCase)) {
                                    activityC6604.f20336.f75573.add(new C5193(c18906, c4794));
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
        Iterator it4 = activityC6604.f20336.f75578.mo21936().iterator();
        while (it4.hasNext()) {
            for (C20317 c20317 : ((C8322) it4.next()).mo12850()) {
                boolean zEquals = c20317.getTypeName().equals("style");
                Iterator it5 = c20317.mo2872().iterator();
                while (it5.hasNext()) {
                    for (C18906 c18907 : ((C2678) it5.next()).mo18746()) {
                        boolean zMo29412 = c18907.mo29412();
                        if (zEquals && zMo29412 && c18907.getParent() == i) {
                            C5193 c5193 = new C5193(c18907, null);
                            c5193.f16277 = activityC6604.getString(R.string.MT_Protector) + ": " + String.format("%08X", Integer.valueOf(i));
                            activityC6604.f20336.f75573.add(c5193);
                        }
                        Iterator it6 = c18907.values().iterator();
                        while (it6.hasNext()) {
                            C4794 c4795 = (C4794) it6.next();
                            int iMo5004 = c4795.mo5004();
                            Iterator it7 = it6;
                            if ((iMo5004 == 2 || iMo5004 == 1 || iMo5004 == 8 || iMo5004 == 7 || (iMo5004 >= 16 && iMo5004 <= 31)) && c4795.getValue() == i) {
                                activityC6604.f20336.f75573.add(new C5193(c18907, c4795));
                                break;
                            }
                            if (zMo29412 && c4795.mo5006() == i) {
                                C5193 c5194 = new C5193(c18907, null);
                                c5194.f16277 = activityC6604.getString(R.string.arsc_value_id) + ": " + String.format("%08X", Integer.valueOf(i));
                                activityC6604.f20336.f75573.add(c5194);
                                break;
                            }
                            it6 = it7;
                        }
                    }
                }
            }
        }
    }

    @Override // l.AbstractC12889
    /* JADX INFO: renamed from: ֫ */
    public final void mo17648() {
        ActivityC6604 activityC6604 = this.f43304;
        activityC6604.setTitle(activityC6604.f20336.f75581);
        activityC6604.m18107(EnumC4487.SEARCH_VALUE);
    }
}
