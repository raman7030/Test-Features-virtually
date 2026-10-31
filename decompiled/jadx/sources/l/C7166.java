package l;

import android.os.Message;
import android.os.storage.StorageVolume;
import java.security.Key;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: l.۟֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: RC7A */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7166 implements InterfaceC15015, InterfaceC7961, InterfaceC21423, InterfaceC5146 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ StorageVolume m19187(Object obj) {
        return (StorageVolume) obj;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m19189(Key key, StringBuilder sb, String str) {
        sb.append(key.getClass());
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static StringBuilder m19190(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    @Override // l.InterfaceC21423
    public Object apply(Object obj) {
        return (FutureC3575) obj;
    }

    @Override // l.InterfaceC5146
    /* JADX INFO: renamed from: ֫ */
    public void mo7068(Object obj, Message message) {
        C19712.m45406((C19712) obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m19188(int i, List list) {
        return list.get(list.size() - i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Comparator m19191(InterfaceC1790 interfaceC1790, Comparator comparator) {
        return comparator instanceof InterfaceC1790 ? interfaceC1790.mo5959((InterfaceC1790) comparator) : C8200.$default$thenComparing(interfaceC1790, comparator);
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC1131) obj).getClass();
    }

    @Override // l.InterfaceC15015
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo19193(Object obj, C5531 c5531) {
        ((InterfaceC0612) obj).mo2506(new C19664(c5531));
    }
}
