package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۟᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: W92O */
/* JADX INFO: loaded from: classes3.dex */
public final class C7666 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public StringBuilder f23664;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f23665;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public StringBuilder f23667;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public char f23670;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public EnumC14015 f23671 = EnumC14015.START_DEFINITION;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f23669 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f23663 = new ArrayList();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f23666 = new ArrayList();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f23668 = false;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20471(C16300 c16300) {
        ArrayList arrayList = this.f23669;
        arrayList.add(c16300);
        if (this.f23671 == EnumC14015.PARAGRAPH) {
            return;
        }
        C17712 c17712 = new C17712();
        c17712.m41445(c16300);
        C9246 c9246M23714 = C9246.m23714(c17712);
        while (c9246M23714.m23720()) {
            int iOrdinal = this.f23671.ordinal();
            if (iOrdinal == 0) {
                m20468();
                c9246M23714.m23729();
                if (!c9246M23714.m23726('[')) {
                    this.f23671 = EnumC14015.PARAGRAPH;
                    m20468();
                    return;
                } else {
                    this.f23671 = EnumC14015.LABEL;
                    this.f23667 = new StringBuilder();
                    if (!c9246M23714.m23720()) {
                        this.f23667.append('\n');
                    }
                }
            } else {
                if (iOrdinal == 1) {
                    C20535 c20535M23724 = c9246M23714.m23724();
                    if (C7746.m20777(c9246M23714)) {
                        this.f23667.append(c9246M23714.m23718(c20535M23724, c9246M23714.m23724()).m41444());
                        if (!c9246M23714.m23720()) {
                            this.f23667.append('\n');
                        } else if (c9246M23714.m23726(']') && c9246M23714.m23726(':') && this.f23667.length() <= 999 && !C12047.m29419(this.f23667.toString()).isEmpty()) {
                            this.f23671 = EnumC14015.DESTINATION;
                            c9246M23714.m23729();
                        }
                    }
                    this.f23671 = EnumC14015.PARAGRAPH;
                    m20468();
                    return;
                }
                if (iOrdinal == 2) {
                    c9246M23714.m23729();
                    C20535 c20535M23725 = c9246M23714.m23724();
                    if (C7746.m20775(c9246M23714)) {
                        String strM41444 = c9246M23714.m23718(c20535M23725, c9246M23714.m23724()).m41444();
                        if (strM41444.startsWith("<")) {
                            strM41444 = C15472.m36561(1, 1, strM41444);
                        }
                        this.f23665 = strM41444;
                        int iM23729 = c9246M23714.m23729();
                        if (!c9246M23714.m23720()) {
                            this.f23668 = true;
                            arrayList.clear();
                        } else if (iM23729 == 0) {
                        }
                        this.f23671 = EnumC14015.START_TITLE;
                    }
                    this.f23671 = EnumC14015.PARAGRAPH;
                    m20468();
                    return;
                }
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new IllegalStateException("Unknown parsing state: " + this.f23671);
                    }
                    C20535 c20535M23726 = c9246M23714.m23724();
                    if (C7746.m20776(c9246M23714, this.f23670)) {
                        this.f23664.append(c9246M23714.m23718(c20535M23726, c9246M23714.m23724()).m41444());
                        if (c9246M23714.m23720()) {
                            c9246M23714.m23723();
                            c9246M23714.m23729();
                            if (c9246M23714.m23720()) {
                                this.f23664 = null;
                            } else {
                                this.f23668 = true;
                                arrayList.clear();
                                this.f23671 = EnumC14015.START_DEFINITION;
                            }
                        } else {
                            this.f23664.append('\n');
                        }
                    } else {
                        this.f23664 = null;
                    }
                    this.f23671 = EnumC14015.PARAGRAPH;
                    m20468();
                    return;
                }
                c9246M23714.m23729();
                if (c9246M23714.m23720()) {
                    this.f23670 = (char) 0;
                    char cM23725 = c9246M23714.m23725();
                    if (cM23725 == '\"' || cM23725 == '\'') {
                        this.f23670 = cM23725;
                    } else if (cM23725 == '(') {
                        this.f23670 = ')';
                    }
                    if (this.f23670 != 0) {
                        this.f23671 = EnumC14015.TITLE;
                        this.f23664 = new StringBuilder();
                        c9246M23714.m23723();
                        if (!c9246M23714.m23720()) {
                            this.f23664.append('\n');
                        }
                    } else {
                        this.f23671 = EnumC14015.START_DEFINITION;
                    }
                } else {
                    this.f23671 = EnumC14015.START_DEFINITION;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20472(C19954 c19954) {
        this.f23666.add(c19954);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17712 m20473() {
        return C17712.m41443(this.f23669);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList m20474() {
        return this.f23666;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m20469() {
        m20468();
        return this.f23663;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m20470(int i) {
        ArrayList arrayList = this.f23666;
        List listUnmodifiableList = C20195.unmodifiableList(new ArrayList(arrayList.subList(Math.max(arrayList.size() - i, 0), arrayList.size())));
        ArrayList arrayList2 = this.f23669;
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

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m20468() {
        if (this.f23668) {
            String strM29420 = C12047.m29420(this.f23665);
            StringBuilder sb = this.f23664;
            C3726 c3726 = new C3726(this.f23667.toString(), strM29420, sb != null ? C12047.m29420(sb.toString()) : null);
            ArrayList arrayList = this.f23666;
            c3726.m1342(arrayList);
            arrayList.clear();
            this.f23663.add(c3726);
            this.f23667 = null;
            this.f23668 = false;
            this.f23665 = null;
            this.f23664 = null;
        }
    }
}
