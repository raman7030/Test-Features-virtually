package l;

import com.umeng.commonsdk.debug.UMLogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ۘ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0CMQ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4248 implements InterfaceC7961, InterfaceC16724, InterfaceC7397, InterfaceC21013 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f13774;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static double m12787(double d, double d2, double d3, double d4) {
        return ((d * d2) + d3) / d4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m12791(StringBuilder sb, String str) {
        sb.append(UMLogUtils.makeUrl(str));
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12793(Class cls, StringBuilder sb, String str) {
        sb.append(cls.getSimpleName());
        sb.append(str);
    }

    @Override // l.InterfaceC7397
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo12795(String str) {
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m12790(ArrayList arrayList, int i) {
        return arrayList.remove(arrayList.size() - i);
    }

    @Override // l.InterfaceC16724
    public Object apply(Object obj) {
        C12866 c12866 = (C12866) obj;
        switch (this.f13774) {
            case 5:
                return Long.valueOf(c12866.f38637);
            default:
                long j = c12866.f38639;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
        }
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC1131) obj).getClass();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m12788(InterfaceC21601 interfaceC21601, String str, C22306 c22306, C22306 c22307, boolean z, boolean z2) {
        if (z2) {
            return 1;
        }
        if (interfaceC21601.mo13496()) {
            interfaceC21601.mo13491(str, c22306, c22307, z);
        }
        return interfaceC21601.mo13493();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m12794() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12792() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m12789(Collection collection) {
        return collection instanceof InterfaceC19065 ? ((InterfaceC19065) collection).m43932() : collection.size();
    }

    @Override // l.InterfaceC21013
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object mo12796() {
        return new LinkedHashSet();
    }
}
