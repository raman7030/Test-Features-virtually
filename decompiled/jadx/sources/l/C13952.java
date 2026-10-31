package l;

import java.io.Serializable;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܰܿ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 44OF */
/* JADX INFO: loaded from: classes4.dex */
public final class C13952 implements Serializable, InterfaceC0463 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C21115 f41638;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f41639;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f41640;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f41641;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f41642;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f41643;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f41644;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f41645;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f41646;

    public C13952(C21115 c21115, int i, int i2, int i3, int i4) {
        this.f41646 = -1;
        this.f41644 = -1;
        this.f41638 = c21115;
        this.f41640 = i;
        this.f41645 = i2;
        this.f41643 = i3;
        this.f41642 = i4;
        Object obj = c21115.f68104;
        if (obj != null) {
            this.f41639 = ((InterfaceC1169) obj).getLine();
            this.f41646 = ((InterfaceC1169) c21115.f68104).mo3967();
        }
    }

    public C13952(InterfaceC0463 interfaceC0463) {
        this.f41646 = -1;
        this.f41645 = 0;
        this.f41644 = -1;
        this.f41640 = interfaceC0463.getType();
        this.f41639 = interfaceC0463.getLine();
        this.f41644 = interfaceC0463.mo2052();
        this.f41646 = interfaceC0463.mo2049();
        this.f41645 = interfaceC0463.mo2050();
        this.f41643 = interfaceC0463.mo2054();
        this.f41642 = interfaceC0463.mo2053();
        if (interfaceC0463 instanceof C13952) {
            C13952 c13952 = (C13952) interfaceC0463;
            this.f41641 = c13952.f41641;
            this.f41638 = c13952.f41638;
        } else {
            this.f41641 = interfaceC0463.getText();
            this.f41638 = new C21115(interfaceC0463.mo2051(), interfaceC0463.getInputStream());
        }
    }

    @Override // l.InterfaceC0463
    public final int getType() {
        return this.f41640;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m33393(int i) {
        this.f41639 = i;
    }

    @Override // l.InterfaceC0463
    public final String getText() {
        int i;
        String str = this.f41641;
        if (str != null) {
            return str;
        }
        InterfaceC23125 inputStream = getInputStream();
        if (inputStream == null) {
            return null;
        }
        int size = inputStream.size();
        int i2 = this.f41643;
        return (i2 >= size || (i = this.f41642) >= size) ? "<EOF>" : inputStream.mo12025(C14763.m35067(i2, i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33390(String str) {
        this.f41641 = str;
    }

    @Override // l.InterfaceC0463
    public final int getLine() {
        return this.f41639;
    }

    @Override // l.InterfaceC0463
    /* JADX INFO: renamed from: ֫ */
    public final int mo2049() {
        return this.f41646;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m33391(int i) {
        this.f41646 = i;
    }

    @Override // l.InterfaceC0463
    /* JADX INFO: renamed from: ۧ */
    public final int mo2050() {
        return this.f41645;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33389(int i) {
        this.f41645 = i;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m33396(int i) {
        this.f41640 = i;
    }

    @Override // l.InterfaceC0463
    /* JADX INFO: renamed from: ᩳ */
    public final int mo2054() {
        return this.f41643;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m33395(int i) {
        this.f41643 = i;
    }

    @Override // l.InterfaceC0463
    /* JADX INFO: renamed from: ܿ */
    public final int mo2053() {
        return this.f41642;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m33394(int i) {
        this.f41642 = i;
    }

    @Override // l.InterfaceC0463
    /* JADX INFO: renamed from: ܽ */
    public final int mo2052() {
        return this.f41644;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m33392(int i) {
        this.f41644 = i;
    }

    @Override // l.InterfaceC0463
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC1169 mo2051() {
        return (InterfaceC1169) this.f41638.f68104;
    }

    @Override // l.InterfaceC0463
    public final InterfaceC23125 getInputStream() {
        return (InterfaceC23125) this.f41638.f68105;
    }

    public final String toString() {
        String str;
        if (this.f41645 > 0) {
            str = ",channel=" + this.f41645;
        } else {
            str = "";
        }
        String text = getText();
        String strReplace = text != null ? text.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t") : "<no text>";
        String strValueOf = String.valueOf(this.f41640);
        StringBuilder sb = new StringBuilder("[@");
        sb.append(this.f41644);
        sb.append(",");
        sb.append(this.f41643);
        sb.append(":");
        sb.append(this.f41642);
        sb.append("='");
        sb.append(strReplace);
        sb.append("',<");
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, strValueOf, ">", str, ",");
        sb.append(this.f41639);
        sb.append(":");
        return C3200.m9831(this.f41646, "]", sb);
    }
}
