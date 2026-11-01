package p067l;

import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩶᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y184 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21837 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ C15130 f68712;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C15130 f68713;

    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ C15130 f68714;

    /* JADX INFO: renamed from: ܽ֫ */
    public final /* synthetic */ C15130 f68715;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21837(AbstractActivityC5549 abstractActivityC5549, C15130 c15130, C15130 c15131, C15130 c15132, C15130 c15133) {
        super(abstractActivityC5549, -1);
        this.f68713 = c15130;
        this.f68712 = c15131;
        this.f68714 = c15132;
        this.f68715 = c15133;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String str;
        String str2;
        String str3;
        boolean z;
        String str4;
        String str5;
        String str6;
        String strTrim = m33346().trim();
        String str7 = null;
        if (strTrim == null) {
            str = null;
            str2 = null;
            str3 = null;
            z = false;
            String str8 = str7;
            str4 = str;
            str5 = str2;
            str6 = str8;
        } else {
            String[] strArrSplit = strTrim.split("->");
            if (strArrSplit.length != 2) {
                str = null;
                str2 = null;
                str3 = null;
            } else {
                str6 = strArrSplit[0];
                if (str6.length() > 2 && str6.startsWith("L") && str6.endsWith(C0249l.f1196b)) {
                    z = true;
                    String[] strArrSplit2 = strArrSplit[1].split("\\(");
                    if (strArrSplit2.length != 2) {
                        str = null;
                        str3 = null;
                        str7 = str6;
                        str2 = null;
                    } else {
                        str3 = strArrSplit2[0];
                        if (str3.isEmpty()) {
                            str = null;
                            str7 = str6;
                            str2 = null;
                        } else {
                            String[] strArrSplit3 = strArrSplit2[1].split("\\)");
                            if (strArrSplit3.length != 2) {
                                str = null;
                                str7 = str6;
                                str2 = null;
                            } else {
                                str4 = strArrSplit3[0];
                                str5 = strArrSplit3[1];
                                if (!str4.matches("(\\[*([CZBISJDF]|L[^;:()\\r\\n]+;))*") || !str5.matches("\\[*([VCZBISJDF]|L[^;:()\\r\\n]+;)")) {
                                    str2 = str5;
                                    str = str4;
                                    str7 = str6;
                                }
                            }
                        }
                    }
                } else {
                    str = null;
                    str3 = null;
                    str7 = str6;
                    str2 = null;
                }
            }
            z = false;
            String str9 = str7;
            str4 = str;
            str5 = str2;
            str6 = str9;
        }
        if (!z) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        C15130 c15130 = this.f68713;
        c15130.f43193.setText(str6);
        C15130 c15131 = this.f68712;
        c15131.f43193.setText(str3);
        C15130 c15132 = this.f68714;
        c15132.f43193.setText(str4);
        C15130 c15133 = this.f68715;
        c15133.f43193.setText(str5);
        c15130.f43192.setChecked(false);
        c15130.f43190.setChecked(false);
        c15131.f43192.setChecked(false);
        c15131.f43190.setChecked(false);
        c15132.f43192.setChecked(false);
        c15132.f43190.setChecked(false);
        c15133.f43192.setChecked(false);
        c15133.f43190.setChecked(false);
        m33348();
    }
}
