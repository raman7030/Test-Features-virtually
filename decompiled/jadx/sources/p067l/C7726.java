package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚ᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4VR */
/* JADX INFO: loaded from: classes2.dex */
public final class C7726 {

    /* JADX INFO: renamed from: ֫ */
    public String[] f20256;

    /* JADX INFO: renamed from: ۧ */
    public boolean f20259;

    /* JADX INFO: renamed from: ܳ */
    public ArrayList f20260;

    /* JADX INFO: renamed from: ܿ */
    public String f20262;

    /* JADX INFO: renamed from: ᩳ */
    public String f20263;

    /* JADX INFO: renamed from: ᩻ */
    public String f20265;

    /* JADX INFO: renamed from: ܽ */
    public ArrayList f20261 = new ArrayList();

    /* JADX INFO: renamed from: ۜ */
    public C17961 f20257 = new C17961();

    /* JADX INFO: renamed from: ᩷ */
    public ArrayList f20264 = new ArrayList();

    /* JADX INFO: renamed from: ۢ */
    public ArrayList f20258 = new ArrayList();

    public final Object clone() {
        C7726 c7726 = new C7726();
        C3702 c3702 = new C3702();
        c7726.f20263 = this.f20263;
        c7726.f20256 = this.f20256;
        c7726.f20259 = this.f20259;
        c7726.f20262 = this.f20262;
        c7726.f20265 = this.f20265;
        c7726.f20257 = this.f20257.m40877(c3702);
        Iterator it = this.f20264.iterator();
        while (it.hasNext()) {
            c7726.f20264.add(((C7055) it.next()).m16269(c3702));
        }
        Iterator it2 = this.f20258.iterator();
        if (it2.hasNext()) {
            throw null;
        }
        if (this.f20260 != null) {
            ArrayList arrayList = new ArrayList(this.f20260.size());
            Iterator it3 = this.f20260.iterator();
            while (it3.hasNext()) {
                arrayList.add(((C15041) it3.next()).mo7667(c3702));
            }
            c7726.f20260 = arrayList;
        }
        for (C19736 c19736 : this.f20261) {
            ArrayList arrayList2 = c7726.f20261;
            c19736.getClass();
            arrayList2.add(c3702.m7136(c19736));
        }
        return c7726;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("// ");
        sb.append(this.f20262);
        sb.append("\n");
        if (this.f20259) {
            sb.append(" static ");
        }
        String str = this.f20265;
        sb.append(str == null ? null : C2805.m4425(str));
        sb.append(' ');
        sb.append(this.f20263);
        sb.append('(');
        String[] strArr = this.f20256;
        if (strArr != null) {
            boolean z = true;
            for (String str2 : strArr) {
                if (z) {
                    z = false;
                } else {
                    sb.append(',');
                }
                sb.append(C2805.m4425(str2));
            }
        }
        sb.append(") {\n\n");
        sb.append(this.f20257);
        sb.append("\n");
        int size = this.f20264.size();
        ArrayList arrayList = this.f20258;
        if (size > 0 || arrayList.size() > 0) {
            sb.append("=============\n");
            Iterator it = this.f20264.iterator();
            while (it.hasNext()) {
                sb.append((C7055) it.next());
                sb.append('\n');
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                sb.append((C10408) it2.next());
                sb.append('\n');
            }
        }
        sb.append(C0249l.f1198d);
        return sb.toString();
    }
}
