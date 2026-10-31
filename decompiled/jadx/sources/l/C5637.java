package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚ᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4VR */
/* JADX INFO: loaded from: classes2.dex */
public final class C5637 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String[] f17410;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f17413;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f17414;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f17416;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f17417;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f17419;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f17415 = new ArrayList();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C16407 f17411 = new C16407();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f17418 = new ArrayList();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public ArrayList f17412 = new ArrayList();

    public final Object clone() {
        C5637 c5637 = new C5637();
        C1403 c1403 = new C1403();
        c5637.f17417 = this.f17417;
        c5637.f17410 = this.f17410;
        c5637.f17413 = this.f17413;
        c5637.f17416 = this.f17416;
        c5637.f17419 = this.f17419;
        c5637.f17411 = this.f17411.m38661(c1403);
        Iterator it = this.f17418.iterator();
        while (it.hasNext()) {
            c5637.f17418.add(((C4931) it.next()).m14372(c1403));
        }
        Iterator it2 = this.f17412.iterator();
        if (it2.hasNext()) {
            throw null;
        }
        if (this.f17414 != null) {
            ArrayList arrayList = new ArrayList(this.f17414.size());
            Iterator it3 = this.f17414.iterator();
            while (it3.hasNext()) {
                arrayList.add(((C13334) it3.next()).mo5437(c1403));
            }
            c5637.f17414 = arrayList;
        }
        for (C18274 c18274 : this.f17415) {
            ArrayList arrayList2 = c5637.f17415;
            c18274.getClass();
            arrayList2.add(c1403.m4897(c18274));
        }
        return c5637;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("// ");
        sb.append(this.f17416);
        sb.append("\n");
        if (this.f17413) {
            sb.append(" static ");
        }
        String str = this.f17419;
        sb.append(str == null ? null : C0459.m2045(str));
        sb.append(' ');
        sb.append(this.f17417);
        sb.append('(');
        String[] strArr = this.f17410;
        if (strArr != null) {
            boolean z = true;
            for (String str2 : strArr) {
                if (z) {
                    z = false;
                } else {
                    sb.append(',');
                }
                sb.append(C0459.m2045(str2));
            }
        }
        sb.append(") {\n\n");
        sb.append(this.f17411);
        sb.append("\n");
        int size = this.f17418.size();
        ArrayList arrayList = this.f17412;
        if (size > 0 || arrayList.size() > 0) {
            sb.append("=============\n");
            Iterator it = this.f17418.iterator();
            while (it.hasNext()) {
                sb.append((C4931) it.next());
                sb.append('\n');
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                sb.append((C8459) it2.next());
                sb.append('\n');
            }
        }
        sb.append(l.d);
        return sb.toString();
    }
}
