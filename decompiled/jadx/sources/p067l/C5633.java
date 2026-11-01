package p067l;

import android.os.Message;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.ۗ᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: T8IW */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5633 implements InterfaceC9934, InterfaceC22729, InterfaceC7259 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f13658;

    public /* synthetic */ C5633(int i) {
        this.f13658 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static StringBuilder m12525(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    /* JADX INFO: renamed from: ֫ */
    public static StringBuilder m12526(String str, String str2, String str3, StringBuilder sb, ConfigurableProvider configurableProvider) {
        sb.append(str);
        configurableProvider.addAlgorithm(str2, sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        return sb2;
    }

    @Override // p067l.InterfaceC22729
    public Object apply(Object obj) {
        return (Long) obj;
    }

    @Override // p067l.InterfaceC7259
    /* JADX INFO: renamed from: ֫ */
    public void mo9163(Object obj, Message message) {
        ((C6061) obj).m13659();
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        InterfaceC3443 interfaceC3443 = (InterfaceC3443) obj;
        switch (this.f13658) {
            case 1:
                interfaceC3443.getClass();
                break;
            default:
                interfaceC3443.getClass();
                break;
        }
    }
}
