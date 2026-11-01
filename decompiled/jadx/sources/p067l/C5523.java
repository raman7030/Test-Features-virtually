package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۗܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3OZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5523 {

    /* JADX INFO: renamed from: ֫ */
    public final int f13210;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC6864 f13211;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC13375 f13212;

    /* JADX INFO: renamed from: ֫ */
    public static C5523 m12194() {
        final C24969 c24969 = new C24969(Pattern.compile("\r\n|\n|\r"));
        C6194.m14027(c24969, "The pattern may not match the empty string: %s", !c24969.m54859("").f47813.matches());
        return new C5523(new InterfaceC6864() { // from class: l.֨ܶܺ
            @Override // p067l.InterfaceC6864
            /* JADX INFO: renamed from: ֫ */
            public final Iterator mo6289(C5523 c5523, CharSequence charSequence) {
                return new C22958(c5523, charSequence, c24969.m54859(charSequence));
            }
        });
    }

    public C5523(InterfaceC6864 interfaceC6864) {
        AbstractC13375 abstractC13375 = C12034.f33533;
        this.f13211 = interfaceC6864;
        this.f13212 = abstractC13375;
        this.f13210 = Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5523 m12195(char c) {
        final C23433 c23433 = new C23433(c);
        return new C5523(new InterfaceC6864() { // from class: l.۠ܶܺ
            @Override // p067l.InterfaceC6864
            /* JADX INFO: renamed from: ֫ */
            public final Iterator mo6289(C5523 c5523, CharSequence charSequence) {
                return new C16921(c5523, charSequence, c23433);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static Iterator m12193(C5523 c5523, CharSequence charSequence) {
        return c5523.f13211.mo6289(c5523, charSequence);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Iterable m12198(CharSequence charSequence) {
        charSequence.getClass();
        return new C23628(this, charSequence);
    }

    /* JADX INFO: renamed from: ۧ */
    public final List m12199(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itMo6289 = this.f13211.mo6289(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            AbstractC10022 abstractC10022 = (AbstractC10022) itMo6289;
            if (abstractC10022.hasNext()) {
                arrayList.add((String) abstractC10022.next());
            } else {
                return C21562.unmodifiableList(arrayList);
            }
        }
    }
}
