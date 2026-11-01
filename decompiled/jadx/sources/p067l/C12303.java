package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۤᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S776 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12303 implements InterfaceC15641 {

    /* JADX INFO: renamed from: ֫ */
    public int f34345;

    /* JADX INFO: renamed from: ۧ */
    public final C12588 f34346;

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList f34347;

    /* JADX INFO: renamed from: ᩳ */
    public final C23702 f34348;

    public C12303() {
        C12588 c12588 = new C12588(true);
        this.f34346 = c12588;
        this.f34347 = new ArrayList();
        C23702 c23702 = new C23702();
        this.f34348 = c23702;
        c12588.setOutput(c23702);
        c12588.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", false);
    }

    @Override // p067l.InterfaceC15641
    /* JADX INFO: renamed from: ۧ */
    public final void mo3702(String str) {
        this.f34345++;
        this.f34347.add(str);
        C12588 c12588 = this.f34346;
        c12588.startTag(null, str);
        if (this.f34345 == 1) {
            c12588.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        }
    }

    @Override // p067l.InterfaceC15641
    /* JADX INFO: renamed from: ֫ */
    public final void mo3698(String str) {
        this.f34346.endTag(null, str);
        C19925.m45229(this.f34347, 1);
        this.f34345--;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0042 A[PHI: r0
      0x0042: PHI (r0v31 java.lang.Integer) = (r0v27 java.lang.Integer), (r0v36 java.lang.Integer) binds: [B:89:0x012a, B:18:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0121  */
    @Override // p067l.InterfaceC15641
    /* JADX INFO: renamed from: ֫ */
    public final void mo3699(String str, String str2) {
        Integer numM35578;
        if (this.f34345 == 1 && ("public".equals(str) || "weak".equals(str) || "compact".equals(str))) {
            return;
        }
        boolean zEquals = "parent".equals(str);
        ArrayList arrayList = this.f34347;
        if (!zEquals || this.f34345 != 1 || !"complex".equals((String) C20013.m45383(arrayList, 1))) {
            if ("id".equals(str) && this.f34345 == 2) {
                String str3 = (String) arrayList.get(0);
                if ("complex".equals(str3) || "style".equals(str3) || "attr".equals(str3)) {
                    String str4 = (String) C20013.m45383(arrayList, 1);
                    str4.getClass();
                    switch (str4) {
                        case "dynamic-attribute":
                        case "fraction":
                        case "reference":
                        case "string":
                        case "id":
                        case "bool":
                        case "path":
                        case "attribute":
                        case "color":
                        case "dimen":
                        case "float":
                        case "dynamic-reference":
                        case "integer":
                            numM35578 = C15654.m35578(str2);
                            if (numM35578 != null) {
                                str2 = C15654.m35570(numM35578.intValue());
                                break;
                            }
                            break;
                    }
                }
            }
        } else {
            numM35578 = C15654.m35578(str2);
            if (numM35578 != null) {
                str2 = C15654.m35570(numM35578.intValue());
            }
        }
        this.f34346.attribute(null, str, str2);
    }

    @Override // p067l.InterfaceC15641
    public final void text(String str) {
        this.f34346.text(str);
    }
}
