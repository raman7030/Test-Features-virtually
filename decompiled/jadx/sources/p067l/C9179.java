package p067l;

import android.os.Message;
import android.os.storage.StorageVolume;
import java.security.Key;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: l.۟֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: RC7A */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9179 implements InterfaceC16638, InterfaceC9934, InterfaceC22729, InterfaceC7259 {
    /* JADX INFO: renamed from: ֫ */
    public static /* bridge */ /* synthetic */ StorageVolume m21130(Object obj) {
        return (StorageVolume) obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m21132(Key key, StringBuilder sb, String str) {
        sb.append(key.getClass());
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static StringBuilder m21133(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    @Override // p067l.InterfaceC22729
    public Object apply(Object obj) {
        return (FutureC5767) obj;
    }

    @Override // p067l.InterfaceC7259
    /* JADX INFO: renamed from: ֫ */
    public void mo9163(Object obj, Message message) {
        C21103.m47710((C21103) obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m21131(int i, List list) {
        return list.get(list.size() - i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Comparator m21134(InterfaceC4070 interfaceC4070, Comparator comparator) {
        return comparator instanceof InterfaceC4070 ? interfaceC4070.mo8154((InterfaceC4070) comparator) : C10162.$default$thenComparing(interfaceC4070, comparator);
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC3443) obj).getClass();
    }

    @Override // p067l.InterfaceC16638
    /* JADX INFO: renamed from: ֫ */
    public void mo21136(Object obj, C7625 c7625) {
        ((InterfaceC2950) obj).mo4862(new C21057(c7625));
    }
}
