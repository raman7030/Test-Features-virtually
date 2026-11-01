package p067l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.֨ۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BM7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3155 {

    /* JADX INFO: renamed from: ֫ */
    public String f5775;

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f5776 = new ArrayList();

    /* JADX INFO: renamed from: ܽ */
    public final String f5777;

    public C3155(String str) {
        this.f5777 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5400(String str, String str2) {
        InterfaceC14100 interfaceC14100 = ApplicationC21448.f67649;
        m5403();
        if (interfaceC14100.getBoolean(str + "_empty", false)) {
            this.f5775 = "";
        } else if (!this.f5776.isEmpty()) {
            this.f5775 = (String) this.f5776.get(0);
        } else {
            this.f5775 = str2;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m5403() {
        String[] strArrMo20203 = ApplicationC21448.f67649.mo20203(this.f5777, (String[]) null);
        this.f5776 = strArrMo20203 == null ? new ArrayList() : new ArrayList(Arrays.asList(strArrMo20203));
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m5396() {
        String str = this.f5775;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m5406(String str) {
        this.f5775 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5401(boolean z) {
        String str = this.f5777;
        if (str.isEmpty()) {
            return;
        }
        InterfaceC14100 interfaceC14100 = ApplicationC21448.f67649;
        String strConcat = str.concat("_empty");
        if (interfaceC14100.getBoolean(strConcat, false) != z) {
            C24104.m53360(interfaceC14100, strConcat, z);
        }
        if (z) {
            this.f5775 = null;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m5408() {
        String str = this.f5777;
        if (str.isEmpty()) {
            return;
        }
        if (this.f5776.isEmpty()) {
            ApplicationC21448.f67649.edit().remove(str).apply();
        } else {
            ApplicationC21448.f67649.edit().mo27879(str, (String[]) this.f5776.toArray(new String[0])).apply();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m5407() {
        return this.f5776.size();
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m5397(int i) {
        return (String) this.f5776.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5399(String str) {
        this.f5776.add(0, str);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m5405() {
        ArrayList arrayList = this.f5776;
        arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m5398(int i, String str) {
        return (String) this.f5776.set(i, str);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m5404(int i) {
        this.f5776.remove(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m5402(String str) {
        return this.f5776.indexOf(str);
    }
}
