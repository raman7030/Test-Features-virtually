package p067l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܳᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L19N */
/* JADX INFO: loaded from: classes4.dex */
public final class C16334 {

    /* JADX INFO: renamed from: ֫ */
    public C12943 f48001;

    /* JADX INFO: renamed from: ۧ */
    public HashMap f48002 = new HashMap();

    public C16334(byte[] bArr) {
        C18306 c18306 = new C18306(bArr);
        this.f48001 = c18306.m41687();
        ArrayList<C12943> arrayList = new ArrayList();
        while (true) {
            C12943 c12943M41687 = c18306.m41687();
            if (c12943M41687 == null) {
                break;
            } else {
                arrayList.add(c12943M41687);
            }
        }
        for (C12943 c12943 : arrayList) {
            this.f48002.put(c12943.m29670(), c12943);
        }
    }
}
