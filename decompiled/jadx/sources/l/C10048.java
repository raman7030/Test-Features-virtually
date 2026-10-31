package l;

import bin.mt.plugin.api.regex.MatcherSnapshot;

/* JADX INFO: renamed from: l.ۤۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97NX */
/* JADX INFO: loaded from: classes3.dex */
public final class C10048 implements MatcherSnapshot, InterfaceC22747 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Runnable f30199;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f30200;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public CharSequence f30201;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f30202;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f30203;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C11459 f30204;

    public C10048() {
        this.f30202 = new int[2];
    }

    public C10048(C12164 c12164) {
        this.f30202 = new int[2];
        this.f30204 = c12164.pattern();
        this.f30201 = c12164.getText();
        this.f30199 = c12164.m29607();
        int iGroupCount = c12164.groupCount();
        this.f30200 = iGroupCount;
        int i = iGroupCount + 1;
        int i2 = i * 2;
        if (this.f30202.length < i2) {
            this.f30202 = new int[i2];
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 + 1;
            this.f30202[i3] = c12164.start(i4);
            i3 += 2;
            this.f30202[i5] = c12164.end(i4);
        }
        this.f30203 = null;
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot, l.InterfaceC22747
    public final CharSequence getText() {
        return this.f30201;
    }

    @Override // l.InterfaceC22747
    /* JADX INFO: renamed from: ֫ */
    public final void mo21388() {
        Runnable runnable = this.f30199;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot
    public final int start() {
        return this.f30202[0];
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot
    public final int end() {
        return this.f30202[1];
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot
    public final String group() {
        return group(0);
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot, l.InterfaceC22747
    public final String group(int i) {
        if (i >= 0 && i <= this.f30200) {
            int i2 = i * 2;
            int[] iArr = this.f30202;
            int i3 = iArr[i2];
            int i4 = iArr[i2 + 1];
            if (i3 != -1 && i4 != -1) {
                return this.f30201.subSequence(i3, i4).toString();
            }
        }
        return "";
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot, l.InterfaceC22747
    public final int groupCount() {
        return this.f30200;
    }

    @Override // l.InterfaceC22747
    public final C11459 pattern() {
        return this.f30204;
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot
    public final String expandReplacement(String str) {
        StringBuilder sb = new StringBuilder();
        C13574.m32630(this, sb, str);
        return sb.toString();
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot
    public final void expandReplacementInto(StringBuilder sb, String str) {
        C13574.m32630(this, sb, str);
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot
    public final void prepareReplacement(String str) {
        this.f30203 = expandReplacement(str);
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot
    public final String getComputedReplacement() {
        String str = this.f30203;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Please call prepareReplacement() first");
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot
    public final void clearComputedReplacement() {
        this.f30203 = null;
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot, l.InterfaceC22747
    public final int end(int i) {
        if (i < 0 || i > this.f30200) {
            throw new IndexOutOfBoundsException(C19370.m44628(i, "No group "));
        }
        return this.f30202[(i * 2) + 1];
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot, l.InterfaceC22747
    public final int start(int i) {
        if (i < 0 || i > this.f30200) {
            throw new IndexOutOfBoundsException(C19370.m44628(i, "No group "));
        }
        return this.f30202[i * 2];
    }
}
