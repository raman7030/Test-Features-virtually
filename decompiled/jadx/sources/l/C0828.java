package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.֨ۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BM7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0828 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f3001;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f3002 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f3003;

    public C0828(String str) {
        this.f3003 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3086(String str, String str2) {
        InterfaceC12344 interfaceC12344 = ApplicationC20075.f65008;
        m3089();
        if (interfaceC12344.getBoolean(str + "_empty", false)) {
            this.f3001 = "";
        } else if (!this.f3002.isEmpty()) {
            this.f3001 = (String) this.f3002.get(0);
        } else {
            this.f3001 = str2;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m3089() {
        String[] strArrMo18255 = ApplicationC20075.f65008.mo18255(this.f3003, (String[]) null);
        this.f3002 = strArrMo18255 == null ? new ArrayList() : new ArrayList(Arrays.asList(strArrMo18255));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m3082() {
        String str = this.f3001;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m3092(String str) {
        this.f3001 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3087(boolean z) {
        String str = this.f3003;
        if (str.isEmpty()) {
            return;
        }
        InterfaceC12344 interfaceC12344 = ApplicationC20075.f65008;
        String strConcat = str.concat("_empty");
        if (interfaceC12344.getBoolean(strConcat, false) != z) {
            C22870.m50970(interfaceC12344, strConcat, z);
        }
        if (z) {
            this.f3001 = null;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m3094() {
        String str = this.f3003;
        if (str.isEmpty()) {
            return;
        }
        if (this.f3002.isEmpty()) {
            ApplicationC20075.f65008.edit().remove(str).apply();
        } else {
            ApplicationC20075.f65008.edit().mo25857(str, (String[]) this.f3002.toArray(new String[0])).apply();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m3093() {
        return this.f3002.size();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m3083(int i) {
        return (String) this.f3002.get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3085(String str) {
        this.f3002.add(0, str);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m3091() {
        ArrayList arrayList = this.f3002;
        arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m3084(int i, String str) {
        return (String) this.f3002.set(i, str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m3090(int i) {
        this.f3002.remove(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m3088(String str) {
        return this.f3002.indexOf(str);
    }
}
