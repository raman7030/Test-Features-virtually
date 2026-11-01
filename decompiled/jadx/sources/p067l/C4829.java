package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: YBJ2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4829 {

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f10976 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public boolean f10977;

    /* JADX INFO: renamed from: ܽ */
    public String f10978;

    /* JADX INFO: renamed from: ֫ */
    public final int m10239() {
        return this.f10976.size();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10864 m10240(int i) {
        return (C10864) this.f10976.get(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m10244() {
        return this.f10978;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10241(String str) {
        this.f10978 = str;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m10245() {
        return this.f10977;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10243(boolean z) {
        this.f10977 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10242(ArrayList arrayList) {
        ArrayList arrayList2 = this.f10976;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(500);
        sb.append('<');
        sb.append(this.f10978);
        ArrayList arrayList = this.f10976;
        if (arrayList.size() > 0 || this.f10977) {
            sb.append(' ');
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C10864 c10864M10240 = m10240(i);
            sb.append(c10864M10240.m25028());
            sb.append(C0184a.f880h);
            sb.append(c10864M10240.m25029());
            sb.append(c10864M10240.m25030());
            sb.append(c10864M10240.m25029());
            if (this.f10977 || i != arrayList.size() - 1) {
                sb.append(' ');
            }
        }
        if (this.f10977) {
            sb.append('/');
        }
        sb.append('>');
        return sb.toString();
    }
}
