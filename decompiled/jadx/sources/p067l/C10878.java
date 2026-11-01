package p067l;

import com.tencent.p062mm.opensdk.utils.Log;
import java.util.ArrayList;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.ۡܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q74D */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10878 implements InterfaceC16716, InterfaceC9934, InterfaceC18281 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f30136;

    public /* synthetic */ C10878(int i) {
        this.f30136 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m25047(Object obj, ArrayList arrayList, Object obj2, int i, int i2) {
        C12826.requireNonNull(obj);
        arrayList.add(obj2);
        return i + i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m25048(String str, String str2, String str3, String str4, ConfigurableProvider configurableProvider) {
        configurableProvider.addAlgorithm(str, str2);
        return str3 + str4;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m25049(Exception exc, StringBuilder sb, String str) {
        sb.append(exc.getMessage());
        Log.m2021e(str, sb.toString());
    }

    @Override // p067l.InterfaceC18281
    /* JADX INFO: renamed from: ֫ */
    public boolean mo21202(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        InterfaceC3443 interfaceC3443 = (InterfaceC3443) obj;
        switch (this.f30136) {
            case 2:
                interfaceC3443.getClass();
                break;
            default:
                interfaceC3443.getClass();
                break;
        }
    }

    @Override // p067l.InterfaceC16716
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC22753 mo8449() {
        return new C17582();
    }
}
