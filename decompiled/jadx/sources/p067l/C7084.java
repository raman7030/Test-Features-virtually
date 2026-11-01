package p067l;

import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۙ᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y184 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7084 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ C15130 f18459;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C15130 f18460;

    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ C15130 f18461;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7084(AbstractActivityC5549 abstractActivityC5549, C15130 c15130, C15130 c15131, C15130 c15132) {
        super(abstractActivityC5549, -1);
        this.f18460 = c15130;
        this.f18459 = c15131;
        this.f18461 = c15132;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        if (r1.matches("\\[*([VCZBISJDF]|L[^;:()\\r\\n]+;)") == false) goto L25;
     */
    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo4537() {
        String str;
        String str2;
        boolean z;
        String str3;
        String strTrim = m33346().trim();
        String str4 = null;
        if (strTrim == null) {
            str = null;
            str2 = null;
            z = false;
            str3 = str4;
            str4 = str;
        } else {
            String[] strArrSplit = strTrim.split("->");
            if (strArrSplit.length != 2) {
                str = null;
                str2 = null;
            } else {
                str3 = strArrSplit[0];
                if (str3.length() > 2 && str3.startsWith("L") && str3.endsWith(C0249l.f1196b)) {
                    z = true;
                    String[] strArrSplit2 = strArrSplit[1].split(":");
                    if (strArrSplit2.length != 2) {
                        str2 = null;
                    } else {
                        str2 = strArrSplit2[0];
                        if (!str2.isEmpty()) {
                            str4 = strArrSplit2[1];
                        }
                    }
                    str = str4;
                    str4 = str3;
                } else {
                    str2 = null;
                    str = str4;
                    str4 = str3;
                }
            }
            z = false;
            str3 = str4;
            str4 = str;
        }
        if (!z) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        C15130 c15130 = this.f18460;
        c15130.f43193.setText(str3);
        C15130 c15131 = this.f18459;
        c15131.f43193.setText(str2);
        C15130 c15132 = this.f18461;
        c15132.f43193.setText(str4);
        c15130.f43192.setChecked(false);
        c15130.f43190.setChecked(false);
        c15131.f43192.setChecked(false);
        c15131.f43190.setChecked(false);
        c15132.f43192.setChecked(false);
        c15132.f43190.setChecked(false);
        m33348();
    }
}
