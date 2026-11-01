package p067l;

/* JADX INFO: renamed from: l.᩵ܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: PA21 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20972 extends C22983 {
    public C20972(String str) {
        String strM48631 = C21466.m48631("\\\\", str);
        C5548 c5548 = new C5548();
        this.f72276 = strM48631;
        this.f72273 = 1;
        this.f72275 = c5548;
        this.f72272 = -1;
        this.f72274 = 0;
        this.f30252 = 0;
        this.f30255 = 3;
    }

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC15983[] m47315() {
        C5548 c5548 = (C5548) this.f72275;
        C20301[] c20301Arr = new C20301[c5548.f13383];
        for (int i = 0; i < c5548.f13383; i++) {
            c20301Arr[i] = new C20301(c5548.f13382[i]);
        }
        return c20301Arr;
    }
}
