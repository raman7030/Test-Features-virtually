package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1TT */
/* JADX INFO: loaded from: classes2.dex */
public final class C7198 {

    /* JADX INFO: renamed from: ۧ */
    public static final String[] f18803 = {".*[^a-zA-Z0-9_$/].*", "[0oO]{3,}", "[Ii]{6,}"};

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f18804 = new ArrayList();

    public C7198(String str) {
        int i = 0;
        if (str.isEmpty()) {
            while (i < 3) {
                this.f18804.add(new C7894(C13259.m30304(f18803[i])));
                i++;
            }
            return;
        }
        String[] strArrSplit = str.split("\n");
        int length = strArrSplit.length;
        while (i < length) {
            this.f18804.add(new C7894(C13259.m30304(strArrSplit[i])));
            i++;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m16540(String str) {
        return m16538(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m16539(String str) {
        if (!m16538(str)) {
            int iLastIndexOf = str.lastIndexOf(47);
            if (iLastIndexOf != -1) {
                str = str.substring(iLastIndexOf + 1);
            }
            int i = 0;
            while (true) {
                int iIndexOf = str.indexOf(36, i);
                if (iIndexOf != -1) {
                    if (!m16538(str.substring(i, iIndexOf))) {
                        i++;
                    }
                } else {
                    return m16538(str.substring(i));
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m16543(String str) {
        if (m16541(str)) {
            return true;
        }
        int i = 0;
        while (true) {
            int iIndexOf = str.indexOf(47, i);
            if (iIndexOf != -1) {
                if (m16538(str.substring(i, iIndexOf))) {
                    return true;
                }
                i++;
            } else {
                return m16538(str.substring(i));
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m16541(String str) {
        if (str.length() >= 20 && (str.length() > 100 || C11567.m26619(str, '/') > 10)) {
            return true;
        }
        return m16538(str);
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m16542(String str) {
        return m16538(str);
    }

    /* JADX INFO: renamed from: ܳ */
    private boolean m16538(String str) {
        ArrayList arrayList = this.f18804;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C13929 c13929 = ((C7894) arrayList.get(i)).get();
            c13929.m56473reset((CharSequence) str);
            if (c13929.matches()) {
                return true;
            }
        }
        return false;
    }
}
