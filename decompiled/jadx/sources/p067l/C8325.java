package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛ᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes2.dex */
public final class C8325 {

    /* JADX INFO: renamed from: ۧ */
    public EnumC21067 f22270;

    /* JADX INFO: renamed from: ᩳ */
    public String f22272;

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f22269 = null;

    /* JADX INFO: renamed from: ܽ */
    public ArrayList f22271 = null;

    public C8325(EnumC21067 enumC21067, String str) {
        this.f22270 = null;
        this.f22272 = null;
        this.f22270 = enumC21067 == null ? EnumC21067.DESCENDANT : enumC21067;
        this.f22272 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19215(String str, EnumC4973 enumC4973, String str2) {
        if (this.f22269 == null) {
            this.f22269 = new ArrayList();
        }
        this.f22269.add(new C17712(str, enumC4973, str2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        EnumC21067 enumC21067 = EnumC21067.CHILD;
        EnumC21067 enumC21068 = this.f22270;
        if (enumC21068 == enumC21067) {
            sb.append("> ");
        } else if (enumC21068 == EnumC21067.FOLLOWS) {
            sb.append("+ ");
        }
        String str = this.f22272;
        if (str == null) {
            str = "*";
        }
        sb.append(str);
        ArrayList<C17712> arrayList = this.f22269;
        if (arrayList != null) {
            for (C17712 c17712 : arrayList) {
                sb.append('[');
                String str2 = c17712.f52904;
                String str3 = c17712.f52906;
                sb.append(str2);
                int iOrdinal = c17712.f52905.ordinal();
                if (iOrdinal == 1) {
                    sb.append(C0184a.f880h);
                    sb.append(str3);
                } else if (iOrdinal == 2) {
                    sb.append("~=");
                    sb.append(str3);
                } else if (iOrdinal == 3) {
                    sb.append("|=");
                    sb.append(str3);
                }
                sb.append(']');
            }
        }
        ArrayList<InterfaceC7655> arrayList2 = this.f22271;
        if (arrayList2 != null) {
            for (InterfaceC7655 interfaceC7655 : arrayList2) {
                sb.append(':');
                sb.append(interfaceC7655);
            }
        }
        return sb.toString();
    }
}
