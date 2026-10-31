package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۤᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S776 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10453 implements InterfaceC13965 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f31382;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10753 f31383;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f31384;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C22447 f31385;

    public C10453() {
        C10753 c10753 = new C10753(true);
        this.f31383 = c10753;
        this.f31384 = new ArrayList();
        C22447 c22447 = new C22447();
        this.f31385 = c22447;
        c10753.setOutput(c22447);
        c10753.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", false);
    }

    @Override // l.InterfaceC13965
    /* JADX INFO: renamed from: ۧ */
    public final void mo1294(String str) {
        this.f31382++;
        this.f31384.add(str);
        C10753 c10753 = this.f31383;
        c10753.startTag(null, str);
        if (this.f31382 == 1) {
            c10753.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        }
    }

    @Override // l.InterfaceC13965
    /* JADX INFO: renamed from: ֫ */
    public final void mo1290(String str) {
        this.f31383.endTag(null, str);
        C18473.m42953(this.f31384, 1);
        this.f31382--;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0042 A[PHI: r0
      0x0042: PHI (r0v31 java.lang.Integer) = (r0v27 java.lang.Integer), (r0v36 java.lang.Integer) binds: [B:89:0x012a, B:18:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0121  */
    @Override // l.InterfaceC13965
    /* JADX INFO: renamed from: ֫ */
    public final void mo1291(String str, String str2) {
        Integer numM33458;
        if (this.f31382 == 1 && ("public".equals(str) || "weak".equals(str) || "compact".equals(str))) {
            return;
        }
        boolean zEquals = "parent".equals(str);
        ArrayList arrayList = this.f31384;
        if (!zEquals || this.f31382 != 1 || !"complex".equals((String) C18566.m43105(arrayList, 1))) {
            if ("id".equals(str) && this.f31382 == 2) {
                String str3 = (String) arrayList.get(0);
                if ("complex".equals(str3) || "style".equals(str3) || "attr".equals(str3)) {
                    String str4 = (String) C18566.m43105(arrayList, 1);
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
                            numM33458 = C13979.m33458(str2);
                            if (numM33458 != null) {
                                str2 = C13979.m33450(numM33458.intValue());
                                break;
                            }
                            break;
                    }
                }
            }
        } else {
            numM33458 = C13979.m33458(str2);
            if (numM33458 != null) {
                str2 = C13979.m33450(numM33458.intValue());
            }
        }
        this.f31383.attribute(null, str, str2);
    }

    @Override // l.InterfaceC13965
    public final void text(String str) {
        this.f31383.text(str);
    }
}
