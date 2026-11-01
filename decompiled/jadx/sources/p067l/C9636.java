package p067l;

import android.net.Uri;

/* JADX INFO: renamed from: l.۟ᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 78PS */
/* JADX INFO: loaded from: classes3.dex */
public final class C9636 {

    /* JADX INFO: renamed from: ֫ */
    public String f26526;

    /* JADX INFO: renamed from: ۧ */
    public String f26527;

    /* JADX INFO: renamed from: ܳ */
    public int f26528;

    /* JADX INFO: renamed from: ܽ */
    public String f26529;

    /* JADX INFO: renamed from: ܿ */
    public int f26530;

    /* JADX INFO: renamed from: ᩳ */
    public String f26531;

    /* JADX INFO: renamed from: ᩻ */
    public Uri f26532;

    public C9636(Uri uri) {
        this.f26532 = uri;
    }

    public C9636(C4292 c4292) {
        this.f26532 = c4292.f9539;
        this.f26531 = c4292.f9538;
        this.f26529 = c4292.f9536;
        this.f26528 = c4292.f9535;
        this.f26530 = c4292.f9537;
        this.f26527 = c4292.f9534;
        this.f26526 = c4292.f9533;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m22434(String str) {
        this.f26531 = C11669.m26815(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m22432() {
        this.f26528 = 1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m22433(String str) {
        this.f26527 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22431(String str) {
        this.f26526 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4292 m22430() {
        return new C4292(this);
    }
}
