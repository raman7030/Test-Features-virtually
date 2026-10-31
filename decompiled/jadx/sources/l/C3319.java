package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۗܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3OZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3319 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f10401;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4730 f10402;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC11581 f10403;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3319 m10158() {
        final C23780 c23780 = new C23780(Pattern.compile("\r\n|\n|\r"));
        C4025.m12107(c23780, "The pattern may not match the empty string: %s", !c23780.m52450("").f44707.matches());
        return new C3319(new InterfaceC4730() { // from class: l.֨ܶܺ
            @Override // l.InterfaceC4730
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final Iterator mo4046(C3319 c3319, CharSequence charSequence) {
                return new C21664(c3319, charSequence, c23780.m52450(charSequence));
            }
        });
    }

    public C3319(InterfaceC4730 interfaceC4730) {
        AbstractC11581 abstractC11581 = C10170.f30571;
        this.f10402 = interfaceC4730;
        this.f10403 = abstractC11581;
        this.f10401 = Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3319 m10159(char c) {
        final C22164 c22164 = new C22164(c);
        return new C3319(new InterfaceC4730() { // from class: l.۠ܶܺ
            @Override // l.InterfaceC4730
            /* JADX INFO: renamed from: ֫ */
            public final Iterator mo4046(C3319 c3319, CharSequence charSequence) {
                return new C15312(c3319, charSequence, c22164);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Iterator m10157(C3319 c3319, CharSequence charSequence) {
        return c3319.f10402.mo4046(c3319, charSequence);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Iterable m10162(CharSequence charSequence) {
        charSequence.getClass();
        return new C22369(this, charSequence);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m10163(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itMo4046 = this.f10402.mo4046(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            AbstractC8053 abstractC8053 = (AbstractC8053) itMo4046;
            if (abstractC8053.hasNext()) {
                arrayList.add((String) abstractC8053.next());
            } else {
                return C20195.unmodifiableList(arrayList);
            }
        }
    }
}
