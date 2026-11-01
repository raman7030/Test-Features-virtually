package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 44FR */
/* JADX INFO: loaded from: classes3.dex */
public final class C14205 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f40477 = new ArrayList(20);

    /* JADX INFO: renamed from: ֫ */
    public final void m32678(String str) {
        int iIndexOf = str.indexOf(":", 1);
        if (iIndexOf != -1) {
            m32681(str.substring(0, iIndexOf), str.substring(iIndexOf + 1));
        } else if (str.startsWith(":")) {
            m32681("", str.substring(1));
        } else {
            m32681("", str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32679(String str, String str2) {
        C12194.m28160(str);
        C12194.m28158(str2, str);
        m32681(str, str2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m32681(String str, String str2) {
        ArrayList arrayList = this.f40477;
        arrayList.add(str);
        arrayList.add(str2.trim());
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m32682(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f40477;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m32680(String str) {
        ArrayList arrayList = this.f40477;
        int size = arrayList.size();
        do {
            size -= 2;
            if (size < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase((String) arrayList.get(size)));
        return (String) arrayList.get(size + 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12194 m32677() {
        return new C12194(this);
    }
}
