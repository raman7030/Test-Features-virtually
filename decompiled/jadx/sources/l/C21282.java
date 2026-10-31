package l;

import android.content.Context;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩸ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95GJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C21282 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View f68632;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C3060 f68633;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC14930 f68634;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C18291 f68635;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC7875 f68636;

    public C21282(Context context, View view, int i) {
        this(context, view, i, R.attr.MT_Protector);
    }

    public C21282(Context context, View view, int i, int i2) {
        this.f68632 = view;
        C3060 c3060 = new C3060(context);
        this.f68633 = c3060;
        c3060.setCallback(new C5053(this));
        C18291 c18291 = new C18291(context, c3060, view, false, i2, 0);
        this.f68635 = c18291;
        c18291.m42630(i);
        c18291.m42632(new C0819(this));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48300(int i) {
        this.f68635.m42630(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m48303() {
        return this.f68635.m42636();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C3060 m48304() {
        return this.f68633;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m48305() {
        if (!this.f68635.m42640()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48299() {
        this.f68635.m42629();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48302(InterfaceC14930 interfaceC14930) {
        this.f68634 = interfaceC14930;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48301(InterfaceC7875 interfaceC7875) {
        this.f68636 = interfaceC7875;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m48306() {
        this.f68635.m42634(true);
    }
}
