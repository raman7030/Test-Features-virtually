package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۗᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 44OF */
/* JADX INFO: loaded from: classes2.dex */
public class C5591 implements InterfaceC8924, Serializable {

    /* JADX INFO: renamed from: ۗ */
    public int f13531;

    /* JADX INFO: renamed from: ۙ */
    public transient InterfaceC6932 f13532;

    /* JADX INFO: renamed from: ۛ */
    public int f13533;

    /* JADX INFO: renamed from: ۤ */
    public String f13534;

    /* JADX INFO: renamed from: ۫ */
    public int f13535;

    /* JADX INFO: renamed from: ۬ */
    public int f13536;

    /* JADX INFO: renamed from: ᩶ */
    public int f13537;

    /* JADX INFO: renamed from: ᩸ */
    public int f13538;

    /* JADX INFO: renamed from: ᩹ */
    public int f13539;

    public C5591(int i, String str) {
        this.f13539 = -1;
        this.f13537 = -1;
        this.f13533 = i;
        this.f13538 = 0;
        this.f13534 = str;
    }

    public C5591(InterfaceC8924 interfaceC8924) {
        this.f13539 = -1;
        this.f13538 = 0;
        this.f13537 = -1;
        this.f13534 = interfaceC8924.getText();
        this.f13533 = interfaceC8924.getType();
        this.f13531 = interfaceC8924.getLine();
        this.f13537 = interfaceC8924.mo12375();
        this.f13539 = interfaceC8924.mo12370();
        this.f13538 = interfaceC8924.mo12373();
        this.f13532 = interfaceC8924.getInputStream();
        if (interfaceC8924 instanceof C5591) {
            C5591 c5591 = (C5591) interfaceC8924;
            this.f13536 = c5591.f13536;
            this.f13535 = c5591.f13535;
        }
    }

    @Override // p067l.InterfaceC8924
    public final int getType() {
        return this.f13533;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12374(int i) {
        this.f13531 = i;
    }

    @Override // p067l.InterfaceC8924
    public final String getText() {
        String str = this.f13534;
        if (str != null) {
            return str;
        }
        InterfaceC6932 interfaceC6932 = this.f13532;
        if (interfaceC6932 == null) {
            return null;
        }
        int size = interfaceC6932.size();
        return (this.f13536 >= size || this.f13535 >= size) ? "<EOF>" : this.f13532.m15893();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12372(String str) {
        this.f13534 = str;
    }

    @Override // p067l.InterfaceC8924
    public final int getLine() {
        return this.f13531;
    }

    @Override // p067l.InterfaceC8924
    /* JADX INFO: renamed from: ֫ */
    public final int mo12370() {
        return this.f13539;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12371(int i) {
        this.f13539 = i;
    }

    @Override // p067l.InterfaceC8924
    /* JADX INFO: renamed from: ۧ */
    public final int mo12373() {
        return this.f13538;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m12378() {
        this.f13538 = 99;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m12377(int i) {
        this.f13533 = i;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m12376(int i) {
        this.f13536 = i;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m12379(int i) {
        this.f13535 = i;
    }

    @Override // p067l.InterfaceC8924
    /* JADX INFO: renamed from: ܽ */
    public final int mo12375() {
        return this.f13537;
    }

    @Override // p067l.InterfaceC8924
    public final InterfaceC6932 getInputStream() {
        return this.f13532;
    }

    public final String toString() {
        String str;
        if (this.f13538 > 0) {
            str = ",channel=" + this.f13538;
        } else {
            str = "";
        }
        String text = getText();
        String strReplaceAll = text != null ? text.replaceAll("\n", "\\\\n").replaceAll("\r", "\\\\r").replaceAll("\t", "\\\\t") : "<no text>";
        StringBuilder sb = new StringBuilder("[@");
        sb.append(this.f13537);
        sb.append(",");
        sb.append(this.f13536);
        sb.append(":");
        sb.append(this.f13535);
        sb.append("='");
        sb.append(strReplaceAll);
        sb.append("',<");
        sb.append(this.f13533);
        sb.append(">");
        sb.append(str);
        sb.append(",");
        sb.append(this.f13531);
        sb.append(":");
        return C5410.m11876(this.f13539, "]", sb);
    }
}
