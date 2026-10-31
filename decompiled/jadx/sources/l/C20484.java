package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩶᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y184 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20484 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13427 f66035;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13427 f66036;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13427 f66037;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13427 f66038;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20484(AbstractActivityC3346 abstractActivityC3346, C13427 c13427, C13427 c13428, C13427 c13429, C13427 c134210) {
        super(abstractActivityC3346, -1);
        this.f66036 = c13427;
        this.f66035 = c13428;
        this.f66037 = c13429;
        this.f66038 = c134210;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String str;
        String str2;
        String str3;
        boolean z;
        String str4;
        String str5;
        String str6;
        String strTrim = m31260().trim();
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
                if (str6.length() > 2 && str6.startsWith("L") && str6.endsWith(l.b)) {
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
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        C13427 c13427 = this.f66036;
        c13427.f40124.setText(str6);
        C13427 c13428 = this.f66035;
        c13428.f40124.setText(str3);
        C13427 c13429 = this.f66037;
        c13429.f40124.setText(str4);
        C13427 c134210 = this.f66038;
        c134210.f40124.setText(str5);
        c13427.f40123.setChecked(false);
        c13427.f40121.setChecked(false);
        c13428.f40123.setChecked(false);
        c13428.f40121.setChecked(false);
        c13429.f40123.setChecked(false);
        c13429.f40121.setChecked(false);
        c134210.f40123.setChecked(false);
        c134210.f40121.setChecked(false);
        m31262();
    }
}
