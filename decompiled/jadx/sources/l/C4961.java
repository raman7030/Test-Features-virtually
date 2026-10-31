package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۙ᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y184 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4961 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13427 f15625;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13427 f15626;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13427 f15627;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4961(AbstractActivityC3346 abstractActivityC3346, C13427 c13427, C13427 c13428, C13427 c13429) {
        super(abstractActivityC3346, -1);
        this.f15626 = c13427;
        this.f15625 = c13428;
        this.f15627 = c13429;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        if (r1.matches("\\[*([VCZBISJDF]|L[^;:()\\r\\n]+;)") == false) goto L25;
     */
    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2170() {
        String str;
        String str2;
        boolean z;
        String str3;
        String strTrim = m31260().trim();
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
                if (str3.length() > 2 && str3.startsWith("L") && str3.endsWith(l.b)) {
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
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        C13427 c13427 = this.f15626;
        c13427.f40124.setText(str3);
        C13427 c13428 = this.f15625;
        c13428.f40124.setText(str2);
        C13427 c13429 = this.f15627;
        c13429.f40124.setText(str4);
        c13427.f40123.setChecked(false);
        c13427.f40121.setChecked(false);
        c13428.f40123.setChecked(false);
        c13428.f40121.setChecked(false);
        c13429.f40123.setChecked(false);
        c13429.f40121.setChecked(false);
        m31262();
    }
}
