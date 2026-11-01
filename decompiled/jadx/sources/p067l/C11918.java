package p067l;

import bin.p000mt.plugin.api.regex.MatcherSnapshot;

/* JADX INFO: renamed from: l.ۤۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97NX */
/* JADX INFO: loaded from: classes3.dex */
public final class C11918 implements MatcherSnapshot, InterfaceC23987 {

    /* JADX INFO: renamed from: ֫ */
    public Runnable f33157;

    /* JADX INFO: renamed from: ۧ */
    public int f33158;

    /* JADX INFO: renamed from: ܳ */
    public CharSequence f33159;

    /* JADX INFO: renamed from: ܽ */
    public int[] f33160;

    /* JADX INFO: renamed from: ܿ */
    public String f33161;

    /* JADX INFO: renamed from: ᩳ */
    public C13259 f33162;

    public C11918() {
        this.f33160 = new int[2];
    }

    public C11918(C13929 c13929) {
        this.f33160 = new int[2];
        this.f33162 = c13929.pattern();
        this.f33159 = c13929.getText();
        this.f33157 = c13929.m31672();
        int iGroupCount = c13929.groupCount();
        this.f33158 = iGroupCount;
        int i = iGroupCount + 1;
        int i2 = i * 2;
        if (this.f33160.length < i2) {
            this.f33160 = new int[i2];
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 + 1;
            this.f33160[i3] = c13929.start(i4);
            i3 += 2;
            this.f33160[i5] = c13929.end(i4);
        }
        this.f33161 = null;
    }

    @Override // bin.p000mt.plugin.api.regex.MatcherSnapshot, p067l.InterfaceC23987
    public final CharSequence getText() {
        return this.f33159;
    }

    @Override // p067l.InterfaceC23987
    /* JADX INFO: renamed from: ֫ */
    public final void mo23355() {
        Runnable runnable = this.f33157;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // bin.p000mt.plugin.api.regex.MatcherSnapshot
    public final int start() {
        return this.f33160[0];
    }

    @Override // bin.p000mt.plugin.api.regex.MatcherSnapshot
    public final int end() {
        return this.f33160[1];
    }

    @Override // bin.p000mt.plugin.api.regex.MatcherSnapshot
    public final String group() {
        return group(0);
    }

    @Override // bin.p000mt.plugin.api.regex.MatcherSnapshot, p067l.InterfaceC23987
    public final String group(int i) {
        if (i >= 0 && i <= this.f33158) {
            int i2 = i * 2;
            int[] iArr = this.f33160;
            int i3 = iArr[i2];
            int i4 = iArr[i2 + 1];
            if (i3 != -1 && i4 != -1) {
                return this.f33159.subSequence(i3, i4).toString();
            }
        }
        return "";
    }

    @Override // bin.p000mt.plugin.api.regex.MatcherSnapshot, p067l.InterfaceC23987
    public final int groupCount() {
        return this.f33158;
    }

    @Override // p067l.InterfaceC23987
    public final C13259 pattern() {
        return this.f33162;
    }

    @Override // bin.p000mt.plugin.api.regex.MatcherSnapshot
    public final String expandReplacement(String str) {
        StringBuilder sb = new StringBuilder();
        C15269.m34742(this, sb, str);
        return sb.toString();
    }

    @Override // bin.p000mt.plugin.api.regex.MatcherSnapshot
    public final void expandReplacementInto(StringBuilder sb, String str) {
        C15269.m34742(this, sb, str);
    }

    @Override // bin.p000mt.plugin.api.regex.MatcherSnapshot
    public final void prepareReplacement(String str) {
        this.f33161 = expandReplacement(str);
    }

    @Override // bin.p000mt.plugin.api.regex.MatcherSnapshot
    public final String getComputedReplacement() {
        String str = this.f33161;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Please call prepareReplacement() first");
    }

    @Override // bin.p000mt.plugin.api.regex.MatcherSnapshot
    public final void clearComputedReplacement() {
        this.f33161 = null;
    }

    @Override // bin.p000mt.plugin.api.regex.MatcherSnapshot, p067l.InterfaceC23987
    public final int end(int i) {
        if (i < 0 || i > this.f33158) {
            throw new IndexOutOfBoundsException(C20778.m46922(i, "No group "));
        }
        return this.f33160[(i * 2) + 1];
    }

    @Override // bin.p000mt.plugin.api.regex.MatcherSnapshot, p067l.InterfaceC23987
    public final int start(int i) {
        if (i < 0 || i > this.f33158) {
            throw new IndexOutOfBoundsException(C20778.m46922(i, "No group "));
        }
        return this.f33160[i * 2];
    }
}
