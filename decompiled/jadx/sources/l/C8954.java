package l;

import com.tencent.mm.opensdk.utils.Log;
import java.util.ArrayList;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.ۡܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q74D */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8954 implements InterfaceC15097, InterfaceC7961, InterfaceC16743 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27202;

    public /* synthetic */ C8954(int i) {
        this.f27202 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m23073(Object obj, ArrayList arrayList, Object obj2, int i, int i2) {
        C11003.requireNonNull(obj);
        arrayList.add(obj2);
        return i + i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m23074(String str, String str2, String str3, String str4, ConfigurableProvider configurableProvider) {
        configurableProvider.addAlgorithm(str, str2);
        return str3 + str4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23075(Exception exc, StringBuilder sb, String str) {
        sb.append(exc.getMessage());
        Log.e(str, sb.toString());
    }

    @Override // l.InterfaceC16743
    /* JADX INFO: renamed from: ֫ */
    public boolean mo19255(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        InterfaceC1131 interfaceC1131 = (InterfaceC1131) obj;
        switch (this.f27202) {
            case 2:
                interfaceC1131.getClass();
                break;
            default:
                interfaceC1131.getClass();
                break;
        }
    }

    @Override // l.InterfaceC15097
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC21449 mo6247() {
        return new C16008();
    }
}
