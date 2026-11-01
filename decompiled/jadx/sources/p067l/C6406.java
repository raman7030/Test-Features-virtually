package p067l;

import com.umeng.commonsdk.debug.UMLogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ۘ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0CMQ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6406 implements InterfaceC9934, InterfaceC18263, InterfaceC1209, InterfaceC22339 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f16591;

    /* JADX INFO: renamed from: ֫ */
    public static double m14667(double d, double d2, double d3, double d4) {
        return ((d * d2) + d3) / d4;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m14671(StringBuilder sb, String str) {
        sb.append(UMLogUtils.makeUrl(str));
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14673(Class cls, StringBuilder sb, String str) {
        sb.append(cls.getSimpleName());
        sb.append(str);
    }

    @Override // p067l.InterfaceC1209
    /* JADX INFO: renamed from: ֫ */
    public boolean mo14675(String str) {
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m14670(ArrayList arrayList, int i) {
        return arrayList.remove(arrayList.size() - i);
    }

    @Override // p067l.InterfaceC18263
    public Object apply(Object obj) {
        C14596 c14596 = (C14596) obj;
        switch (this.f16591) {
            case 5:
                return Long.valueOf(c14596.f41681);
            default:
                long j = c14596.f41683;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
        }
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC3443) obj).getClass();
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m14668(InterfaceC22898 interfaceC22898, String str, C23568 c23568, C23568 c23569, boolean z, boolean z2) {
        if (z2) {
            return 1;
        }
        if (interfaceC22898.mo15385()) {
            interfaceC22898.mo15380(str, c23568, c23569, z);
        }
        return interfaceC22898.mo15382();
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m14674() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14672() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m14669(Collection collection) {
        return collection instanceof InterfaceC20488 ? ((InterfaceC20488) collection).m46226() : collection.size();
    }

    @Override // p067l.InterfaceC22339
    /* JADX INFO: renamed from: ۧ */
    public Object mo14676() {
        return new LinkedHashSet();
    }
}
