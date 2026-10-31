package l;

import com.alipay.sdk.m.p.a;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: YBJ2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2589 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f8184 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f8185;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f8186;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m8200() {
        return this.f8184.size();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8939 m8201(int i) {
        return (C8939) this.f8184.get(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m8205() {
        return this.f8186;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8202(String str) {
        this.f8186 = str;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m8206() {
        return this.f8185;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8204(boolean z) {
        this.f8185 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8203(ArrayList arrayList) {
        ArrayList arrayList2 = this.f8184;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(500);
        sb.append('<');
        sb.append(this.f8186);
        ArrayList arrayList = this.f8184;
        if (arrayList.size() > 0 || this.f8185) {
            sb.append(' ');
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C8939 c8939M8201 = m8201(i);
            sb.append(c8939M8201.m23054());
            sb.append(a.h);
            sb.append(c8939M8201.m23055());
            sb.append(c8939M8201.m23056());
            sb.append(c8939M8201.m23055());
            if (this.f8185 || i != arrayList.size() - 1) {
                sb.append(' ');
            }
        }
        if (this.f8185) {
            sb.append('/');
        }
        sb.append('>');
        return sb.toString();
    }
}
