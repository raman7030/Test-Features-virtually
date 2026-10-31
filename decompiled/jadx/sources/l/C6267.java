package l;

import com.alipay.sdk.m.p.a;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛ᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes2.dex */
public final class C6267 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public EnumC19674 f19407;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f19409;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f19406 = null;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f19408 = null;

    public C6267(EnumC19674 enumC19674, String str) {
        this.f19407 = null;
        this.f19409 = null;
        this.f19407 = enumC19674 == null ? EnumC19674.DESCENDANT : enumC19674;
        this.f19409 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17277(String str, EnumC2740 enumC2740, String str2) {
        if (this.f19406 == null) {
            this.f19406 = new ArrayList();
        }
        this.f19406.add(new C16144(str, enumC2740, str2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        EnumC19674 enumC19674 = EnumC19674.CHILD;
        EnumC19674 enumC19675 = this.f19407;
        if (enumC19675 == enumC19674) {
            sb.append("> ");
        } else if (enumC19675 == EnumC19674.FOLLOWS) {
            sb.append("+ ");
        }
        String str = this.f19409;
        if (str == null) {
            str = "*";
        }
        sb.append(str);
        ArrayList<C16144> arrayList = this.f19406;
        if (arrayList != null) {
            for (C16144 c16144 : arrayList) {
                sb.append('[');
                String str2 = c16144.f49738;
                String str3 = c16144.f49740;
                sb.append(str2);
                int iOrdinal = c16144.f49739.ordinal();
                if (iOrdinal == 1) {
                    sb.append(a.h);
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
        ArrayList<InterfaceC5562> arrayList2 = this.f19408;
        if (arrayList2 != null) {
            for (InterfaceC5562 interfaceC5562 : arrayList2) {
                sb.append(':');
                sb.append(interfaceC5562);
            }
        }
        return sb.toString();
    }
}
