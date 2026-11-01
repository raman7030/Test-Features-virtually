package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import java.security.cert.Extension;

/* JADX INFO: renamed from: l.۟ۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 76WC */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9417 implements InterfaceC18263, InterfaceC16638, InterfaceC9934, InterfaceC9544, InterfaceC8521, InterfaceC18935, InterfaceC22339 {
    /* JADX INFO: renamed from: ֫ */
    public static int m21912(int i, int i2, int i3, int i4) {
        return ((i - i2) / i3) + i4;
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m21913(String str, String str2, String str3, String str4) {
        return JSON.object().add(str, str2).add(str3, str4);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* bridge */ /* synthetic */ Extension m21914(Object obj) {
        return (Extension) obj;
    }

    @Override // p067l.InterfaceC9544
    /* JADX INFO: renamed from: ֫ */
    public CharSequence mo9168(C4360 c4360) {
        return C4566.m9640();
    }

    @Override // p067l.InterfaceC16638
    /* JADX INFO: renamed from: ֫ */
    public void mo21136(Object obj, C7625 c7625) {
    }

    /* JADX INFO: renamed from: ֫ */
    public static char m21911(int i, String str) {
        return str.charAt(str.length() - i);
    }

    @Override // p067l.InterfaceC18263
    public Object apply(Object obj) {
        return Integer.valueOf(((C21196) obj).f66627);
    }

    @Override // p067l.InterfaceC8521
    /* JADX INFO: renamed from: ֫ */
    public void mo19814() {
        System.loadLibrary("mt-radare2");
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC3443) obj).getClass();
    }

    @Override // p067l.InterfaceC22339
    /* JADX INFO: renamed from: ۧ */
    public Object mo14676() {
        return new C25020();
    }

    @Override // p067l.InterfaceC18935
    /* JADX INFO: renamed from: ֫ */
    public int mo8465(int i, int i2) {
        return i2 == -12105913 ? C1199.m21214(C23223.f72985, i2, 0.85f) : i2;
    }
}
