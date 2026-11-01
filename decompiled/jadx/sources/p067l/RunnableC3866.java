package p067l;

import android.text.TextUtils;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0249l;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.֫ۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: C538 */
/* JADX INFO: loaded from: classes2.dex */
public class RunnableC3866 extends AbstractRunnableC22643 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final String f8361;

    public RunnableC3866(C21302 c21302, String str) {
        super(c21302);
        this.f8361 = str;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0155  */
    /* JADX WARN: Code duplicated, block: B:70:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x015c  */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int i;
        String str2;
        String str3;
        String strM50693 = AbstractRunnableC22643.m50693(this.f8361);
        boolean zIsEmpty = TextUtils.isEmpty(strM50693);
        C21302 c21302 = this.f71446;
        if (!zIsEmpty) {
            String[] strArrSplit = strM50693.split(" ");
            String upperCase = strArrSplit[0].toUpperCase();
            if (upperCase.equals("HASH")) {
                if (strArrSplit.length == 1) {
                    str2 = "200 " + c21302.m48174() + "\r\n";
                } else if (strArrSplit.length == 2) {
                    String upperCase2 = strArrSplit[1].toUpperCase();
                    if (upperCase2.equals("MD5") || upperCase2.equals("SHA-1") || upperCase2.equals(XMSSKeyParameters.SHA_256) || upperCase2.equals("SHA-384") || upperCase2.equals(XMSSKeyParameters.SHA_512)) {
                        c21302.m48155(upperCase2);
                        str2 = "200 " + upperCase2 + "\r\n";
                    } else {
                        str = "501 Unknown algorithm, current selection not changed\r\n";
                    }
                } else {
                    str = "550 Malformed OPTS HASH command\r\n";
                }
                str3 = null;
            } else if (strArrSplit.length != 2) {
                str = "550 Malformed OPTS command\r\n";
            } else {
                String upperCase3 = strArrSplit[1].toUpperCase();
                if (upperCase.equals("UTF8")) {
                    if (upperCase3.equals("ON")) {
                        c21302.f67131 = C0233a.f1077D;
                    }
                    str2 = null;
                } else if (upperCase.equals("MLST")) {
                    String[] strArrSplit2 = upperCase3.split(C0249l.f1196b);
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    for (String str4 : strArrSplit2) {
                        if (str4.equalsIgnoreCase("Type")) {
                            z = true;
                        } else if (str4.equalsIgnoreCase("Size")) {
                            z2 = true;
                        } else if (str4.equalsIgnoreCase("Modify")) {
                            z3 = true;
                        } else if (str4.equalsIgnoreCase("Perm")) {
                            z4 = true;
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    if (z) {
                        strArrSplit2[0] = "Type";
                        sb.append("Type;");
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if (z2) {
                        strArrSplit2[i] = "Size";
                        sb.append("Size;");
                        i++;
                    }
                    if (z3) {
                        strArrSplit2[i] = "Modify";
                        sb.append("Modify;");
                        i++;
                    }
                    if (z4) {
                        strArrSplit2[i] = "Perm";
                        sb.append("Perm;");
                        i++;
                    }
                    String[] strArr = new String[i];
                    System.arraycopy(strArrSplit2, 0, strArr, 0, i);
                    c21302.m48159(strArr);
                    str2 = "200 MLST OPTS " + ((Object) sb) + "\r\n";
                } else {
                    str = "502 Unrecognized option\r\n";
                }
                str3 = null;
            }
            if (str3 != null) {
                c21302.m48173(str3);
                return;
            }
            if (str2 == null) {
                str2 = "200 OPTS accepted\r\n";
            }
            c21302.m48173(str2);
        }
        str = "550 Need argument to OPTS\r\n";
        str3 = str;
        str2 = null;
        if (str3 != null) {
            c21302.m48173(str3);
            return;
        }
        if (str2 == null) {
            str2 = "200 OPTS accepted\r\n";
        }
        c21302.m48173(str2);
    }
}
