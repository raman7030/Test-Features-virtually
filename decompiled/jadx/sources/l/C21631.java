package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.᩸ܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: OARO */
/* JADX INFO: loaded from: classes4.dex */
public final class C21631 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int[] f69443;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC13868 f69444;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C20701[] f69445;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC19081[] f69446;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f69447;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f69448;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C9412[] f69450;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f69449 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f69442 = new ArrayList();

    public C21631(EnumC13868 enumC13868, int i) {
        new LinkedHashMap();
        this.f69447 = new ArrayList();
        this.f69444 = enumC13868;
        this.f69448 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23936 m48895(AbstractC23041 abstractC23041, C19515 c19515) {
        C9203 c9203 = new C9203(this);
        C23936 c23936 = new C23936(new int[0]);
        c9203.m23637(abstractC23041, c19515 != null ? AbstractC16466.m38769(abstractC23041.f74149, c19515) : null, c23936, new HashSet(), new BitSet());
        return c23936;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23936 m48894(AbstractC23041 abstractC23041) {
        C23936 c23936 = abstractC23041.f74152;
        if (c23936 != null) {
            return c23936;
        }
        C23936 c23936M48895 = m48895(abstractC23041, (C19515) null);
        abstractC23041.f74152 = c23936M48895;
        c23936M48895.m52726();
        return abstractC23041.f74152;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC7086 m48892(int i) {
        ArrayList arrayList = this.f69442;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (AbstractC7086) arrayList.get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23936 m48893(int i, C19515 c19515) {
        if (i >= 0) {
            ArrayList arrayList = this.f69449;
            if (i < arrayList.size()) {
                C23936 c23936M48894 = m48894((AbstractC23041) arrayList.get(i));
                if (!c23936M48894.m52723(-2)) {
                    return c23936M48894;
                }
                C23936 c23936 = new C23936(new int[0]);
                c23936.m52721(c23936M48894);
                c23936.m52724();
                while (c19515 != null && c19515.f63074 >= 0 && c23936M48894.m52723(-2)) {
                    c23936M48894 = m48894(((C8706) ((AbstractC23041) arrayList.get(c19515.f63074)).m51211(0)).f26506);
                    c23936.m52721(c23936M48894);
                    c23936.m52724();
                    c19515 = c19515.f63075;
                }
                if (c23936M48894.m52723(-2)) {
                    c23936.m52719(-1);
                }
                return c23936;
            }
        }
        throw new IllegalArgumentException("Invalid state number.");
    }
}
