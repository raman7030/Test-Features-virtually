package l;

import java.util.HashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ۡ᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6LO */
/* JADX INFO: loaded from: classes3.dex */
public final class C9078 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object f27515;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public synchronized void m23434(C5215 c5215) {
        ((LinkedHashSet) this.f27515).remove(c5215);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public synchronized void m23436(C5215 c5215) {
        ((LinkedHashSet) this.f27515).add(c5215);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public synchronized boolean m23437(C5215 c5215) {
        return ((LinkedHashSet) this.f27515).contains(c5215);
    }

    public C9078(int i) {
        switch (i) {
            case 1:
                this.f27515 = new LinkedHashSet();
                break;
            default:
                this.f27515 = new HashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m23435(C16425 c16425) {
        Class clsM38696 = c16425.m38696();
        HashMap map = (HashMap) this.f27515;
        C16425 c16426 = (C16425) map.get(clsM38696);
        if (c16426 == null) {
            map.put(c16425.m38696(), c16425);
        } else {
            c16426.m38699(c16425);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object m23433(String str) {
        C16425 c16425 = (C16425) ((HashMap) this.f27515).get(C3726.class);
        if (c16425 == null) {
            return null;
        }
        return c16425.m38697(str);
    }
}
