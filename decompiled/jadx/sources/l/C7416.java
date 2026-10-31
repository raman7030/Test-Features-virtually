package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import java.security.cert.Extension;

/* JADX INFO: renamed from: l.۟ۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 76WC */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7416 implements InterfaceC16724, InterfaceC15015, InterfaceC7961, InterfaceC7550, InterfaceC6474, InterfaceC17431, InterfaceC21013 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m19938(int i, int i2, int i3, int i4) {
        return ((i - i2) / i3) + i4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m19939(String str, String str2, String str3, String str4) {
        return JSON.object().add(str, str2).add(str3, str4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ Extension m19940(Object obj) {
        return (Extension) obj;
    }

    @Override // l.InterfaceC7550
    /* JADX INFO: renamed from: ֫ */
    public CharSequence mo7073(C2095 c2095) {
        return C2312.m7570();
    }

    @Override // l.InterfaceC15015
    /* JADX INFO: renamed from: ֫ */
    public void mo19193(Object obj, C5531 c5531) {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static char m19937(int i, String str) {
        return str.charAt(str.length() - i);
    }

    @Override // l.InterfaceC16724
    public Object apply(Object obj) {
        return Integer.valueOf(((C19811) obj).f63990);
    }

    @Override // l.InterfaceC6474
    /* JADX INFO: renamed from: ֫ */
    public void mo17866() {
        System.loadLibrary("mt-radare2");
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC1131) obj).getClass();
    }

    @Override // l.InterfaceC21013
    /* JADX INFO: renamed from: ۧ */
    public Object mo12796() {
        return new C23834();
    }

    @Override // l.InterfaceC17431
    /* JADX INFO: renamed from: ֫ */
    public int mo6263(int i, int i2) {
        return i2 == -12105913 ? C7191.m19267(C21943.f70274, i2, 0.85f) : i2;
    }
}
