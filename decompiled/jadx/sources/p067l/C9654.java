package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۟᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: W92O */
/* JADX INFO: loaded from: classes3.dex */
public final class C9654 {

    /* JADX INFO: renamed from: ۜ */
    public StringBuilder f26578;

    /* JADX INFO: renamed from: ۧ */
    public String f26579;

    /* JADX INFO: renamed from: ܽ */
    public StringBuilder f26581;

    /* JADX INFO: renamed from: ᩷ */
    public char f26584;

    /* JADX INFO: renamed from: ᩻ */
    public EnumC15688 f26585 = EnumC15688.START_DEFINITION;

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList f26583 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f26577 = new ArrayList();

    /* JADX INFO: renamed from: ܳ */
    public final ArrayList f26580 = new ArrayList();

    /* JADX INFO: renamed from: ܿ */
    public boolean f26582 = false;

    /* JADX INFO: renamed from: ֫ */
    public final void m22451(C17859 c17859) {
        ArrayList arrayList = this.f26583;
        arrayList.add(c17859);
        if (this.f26585 == EnumC15688.PARAGRAPH) {
            return;
        }
        C19201 c19201 = new C19201();
        c19201.m43691(c17859);
        C11155 c11155M25715 = C11155.m25715(c19201);
        while (c11155M25715.m25721()) {
            int iOrdinal = this.f26585.ordinal();
            if (iOrdinal == 0) {
                m22448();
                c11155M25715.m25730();
                if (!c11155M25715.m25727('[')) {
                    this.f26585 = EnumC15688.PARAGRAPH;
                    m22448();
                    return;
                } else {
                    this.f26585 = EnumC15688.LABEL;
                    this.f26581 = new StringBuilder();
                    if (!c11155M25715.m25721()) {
                        this.f26581.append('\n');
                    }
                }
            } else {
                if (iOrdinal == 1) {
                    C21884 c21884M25725 = c11155M25715.m25725();
                    if (C9731.m22758(c11155M25715)) {
                        this.f26581.append(c11155M25715.m25719(c21884M25725, c11155M25715.m25725()).m43690());
                        if (!c11155M25715.m25721()) {
                            this.f26581.append('\n');
                        } else if (c11155M25715.m25727(']') && c11155M25715.m25727(':') && this.f26581.length() <= 999 && !C13817.m31481(this.f26581.toString()).isEmpty()) {
                            this.f26585 = EnumC15688.DESTINATION;
                            c11155M25715.m25730();
                        }
                    }
                    this.f26585 = EnumC15688.PARAGRAPH;
                    m22448();
                    return;
                }
                if (iOrdinal == 2) {
                    c11155M25715.m25730();
                    C21884 c21884M25726 = c11155M25715.m25725();
                    if (C9731.m22756(c11155M25715)) {
                        String strM43690 = c11155M25715.m25719(c21884M25726, c11155M25715.m25725()).m43690();
                        if (strM43690.startsWith("<")) {
                            strM43690 = C17073.m38720(1, 1, strM43690);
                        }
                        this.f26579 = strM43690;
                        int iM25730 = c11155M25715.m25730();
                        if (!c11155M25715.m25721()) {
                            this.f26582 = true;
                            arrayList.clear();
                        } else if (iM25730 == 0) {
                        }
                        this.f26585 = EnumC15688.START_TITLE;
                    }
                    this.f26585 = EnumC15688.PARAGRAPH;
                    m22448();
                    return;
                }
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new IllegalStateException("Unknown parsing state: " + this.f26585);
                    }
                    C21884 c21884M25727 = c11155M25715.m25725();
                    if (C9731.m22757(c11155M25715, this.f26584)) {
                        this.f26578.append(c11155M25715.m25719(c21884M25727, c11155M25715.m25725()).m43690());
                        if (c11155M25715.m25721()) {
                            c11155M25715.m25724();
                            c11155M25715.m25730();
                            if (c11155M25715.m25721()) {
                                this.f26578 = null;
                            } else {
                                this.f26582 = true;
                                arrayList.clear();
                                this.f26585 = EnumC15688.START_DEFINITION;
                            }
                        } else {
                            this.f26578.append('\n');
                        }
                    } else {
                        this.f26578 = null;
                    }
                    this.f26585 = EnumC15688.PARAGRAPH;
                    m22448();
                    return;
                }
                c11155M25715.m25730();
                if (c11155M25715.m25721()) {
                    this.f26584 = (char) 0;
                    char cM25726 = c11155M25715.m25726();
                    if (cM25726 == '\"' || cM25726 == '\'') {
                        this.f26584 = cM25726;
                    } else if (cM25726 == '(') {
                        this.f26584 = ')';
                    }
                    if (this.f26584 != 0) {
                        this.f26585 = EnumC15688.TITLE;
                        this.f26578 = new StringBuilder();
                        c11155M25715.m25724();
                        if (!c11155M25715.m25721()) {
                            this.f26578.append('\n');
                        }
                    } else {
                        this.f26585 = EnumC15688.START_DEFINITION;
                    }
                } else {
                    this.f26585 = EnumC15688.START_DEFINITION;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22452(C21332 c21332) {
        this.f26580.add(c21332);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C19201 m22453() {
        return C19201.m43689(this.f26583);
    }

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList m22454() {
        return this.f26580;
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m22449() {
        m22448();
        return this.f26577;
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m22450(int i) {
        ArrayList arrayList = this.f26580;
        List listUnmodifiableList = C21562.unmodifiableList(new ArrayList(arrayList.subList(Math.max(arrayList.size() - i, 0), arrayList.size())));
        ArrayList arrayList2 = this.f26583;
        if (i >= arrayList2.size()) {
            arrayList2.clear();
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.remove(arrayList2.size() - 1);
            }
        }
        if (i >= arrayList.size()) {
            arrayList.clear();
            return listUnmodifiableList;
        }
        for (int i3 = 0; i3 < i; i3++) {
            arrayList.remove(arrayList.size() - 1);
        }
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m22448() {
        if (this.f26582) {
            String strM31482 = C13817.m31482(this.f26579);
            StringBuilder sb = this.f26578;
            C5909 c5909 = new C5909(this.f26581.toString(), strM31482, sb != null ? C13817.m31482(sb.toString()) : null);
            ArrayList arrayList = this.f26580;
            c5909.m3755(arrayList);
            arrayList.clear();
            this.f26577.add(c5909);
            this.f26581 = null;
            this.f26582 = false;
            this.f26579 = null;
            this.f26578 = null;
        }
    }
}
