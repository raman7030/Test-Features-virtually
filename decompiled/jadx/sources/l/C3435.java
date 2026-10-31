package l;

import android.os.Message;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.ۗ᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: T8IW */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3435 implements InterfaceC7961, InterfaceC21423, InterfaceC5146 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10855;

    public /* synthetic */ C3435(int i) {
        this.f10855 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static StringBuilder m10501(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static StringBuilder m10502(String str, String str2, String str3, StringBuilder sb, ConfigurableProvider configurableProvider) {
        sb.append(str);
        configurableProvider.addAlgorithm(str2, sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        return sb2;
    }

    @Override // l.InterfaceC21423
    public Object apply(Object obj) {
        return (Long) obj;
    }

    @Override // l.InterfaceC5146
    /* JADX INFO: renamed from: ֫ */
    public void mo7068(Object obj, Message message) {
        ((C3885) obj).m11723();
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        InterfaceC1131 interfaceC1131 = (InterfaceC1131) obj;
        switch (this.f10855) {
            case 1:
                interfaceC1131.getClass();
                break;
            default:
                interfaceC1131.getClass();
                break;
        }
    }
}
