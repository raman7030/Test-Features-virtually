package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۗᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 44OF */
/* JADX INFO: loaded from: classes2.dex */
public class C3391 implements InterfaceC6898, Serializable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f10724;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC4802 f10725;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f10726;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f10727;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f10728;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f10729;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f10730;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f10731;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f10732;

    public C3391(int i, String str) {
        this.f10732 = -1;
        this.f10730 = -1;
        this.f10726 = i;
        this.f10731 = 0;
        this.f10727 = str;
    }

    public C3391(InterfaceC6898 interfaceC6898) {
        this.f10732 = -1;
        this.f10731 = 0;
        this.f10730 = -1;
        this.f10727 = interfaceC6898.getText();
        this.f10726 = interfaceC6898.getType();
        this.f10724 = interfaceC6898.getLine();
        this.f10730 = interfaceC6898.mo10336();
        this.f10732 = interfaceC6898.mo10331();
        this.f10731 = interfaceC6898.mo10334();
        this.f10725 = interfaceC6898.getInputStream();
        if (interfaceC6898 instanceof C3391) {
            C3391 c3391 = (C3391) interfaceC6898;
            this.f10729 = c3391.f10729;
            this.f10728 = c3391.f10728;
        }
    }

    @Override // l.InterfaceC6898
    public final int getType() {
        return this.f10726;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10335(int i) {
        this.f10724 = i;
    }

    @Override // l.InterfaceC6898
    public final String getText() {
        String str = this.f10727;
        if (str != null) {
            return str;
        }
        InterfaceC4802 interfaceC4802 = this.f10725;
        if (interfaceC4802 == null) {
            return null;
        }
        int size = interfaceC4802.size();
        return (this.f10729 >= size || this.f10728 >= size) ? "<EOF>" : this.f10725.m14013();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10333(String str) {
        this.f10727 = str;
    }

    @Override // l.InterfaceC6898
    public final int getLine() {
        return this.f10724;
    }

    @Override // l.InterfaceC6898
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo10331() {
        return this.f10732;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10332(int i) {
        this.f10732 = i;
    }

    @Override // l.InterfaceC6898
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo10334() {
        return this.f10731;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m10339() {
        this.f10731 = 99;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m10338(int i) {
        this.f10726 = i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m10337(int i) {
        this.f10729 = i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m10340(int i) {
        this.f10728 = i;
    }

    @Override // l.InterfaceC6898
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int mo10336() {
        return this.f10730;
    }

    @Override // l.InterfaceC6898
    public final InterfaceC4802 getInputStream() {
        return this.f10725;
    }

    public final String toString() {
        String str;
        if (this.f10731 > 0) {
            str = ",channel=" + this.f10731;
        } else {
            str = "";
        }
        String text = getText();
        String strReplaceAll = text != null ? text.replaceAll("\n", "\\\\n").replaceAll("\r", "\\\\r").replaceAll("\t", "\\\\t") : "<no text>";
        StringBuilder sb = new StringBuilder("[@");
        sb.append(this.f10730);
        sb.append(",");
        sb.append(this.f10729);
        sb.append(":");
        sb.append(this.f10728);
        sb.append("='");
        sb.append(strReplaceAll);
        sb.append("',<");
        sb.append(this.f10726);
        sb.append(">");
        sb.append(str);
        sb.append(",");
        sb.append(this.f10724);
        sb.append(":");
        return C3200.m9831(this.f10732, "]", sb);
    }
}
