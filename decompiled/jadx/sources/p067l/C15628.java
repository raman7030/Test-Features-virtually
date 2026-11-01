package p067l;

import java.io.Serializable;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܰܿ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 44OF */
/* JADX INFO: loaded from: classes4.dex */
public final class C15628 implements Serializable, InterfaceC2808 {

    /* JADX INFO: renamed from: ۗ */
    public C22436 f44719;

    /* JADX INFO: renamed from: ۙ */
    public int f44720;

    /* JADX INFO: renamed from: ۛ */
    public int f44721;

    /* JADX INFO: renamed from: ۤ */
    public String f44722;

    /* JADX INFO: renamed from: ۫ */
    public int f44723;

    /* JADX INFO: renamed from: ۬ */
    public int f44724;

    /* JADX INFO: renamed from: ᩶ */
    public int f44725;

    /* JADX INFO: renamed from: ᩸ */
    public int f44726;

    /* JADX INFO: renamed from: ᩹ */
    public int f44727;

    public C15628(C22436 c22436, int i, int i2, int i3, int i4) {
        this.f44727 = -1;
        this.f44725 = -1;
        this.f44719 = c22436;
        this.f44721 = i;
        this.f44726 = i2;
        this.f44724 = i3;
        this.f44723 = i4;
        Object obj = c22436.f70786;
        if (obj != null) {
            this.f44720 = ((InterfaceC3479) obj).getLine();
            this.f44727 = ((InterfaceC3479) c22436.f70786).mo6209();
        }
    }

    public C15628(InterfaceC2808 interfaceC2808) {
        this.f44727 = -1;
        this.f44726 = 0;
        this.f44725 = -1;
        this.f44721 = interfaceC2808.getType();
        this.f44720 = interfaceC2808.getLine();
        this.f44725 = interfaceC2808.mo4432();
        this.f44727 = interfaceC2808.mo4429();
        this.f44726 = interfaceC2808.mo4430();
        this.f44724 = interfaceC2808.mo4434();
        this.f44723 = interfaceC2808.mo4433();
        if (interfaceC2808 instanceof C15628) {
            C15628 c15628 = (C15628) interfaceC2808;
            this.f44722 = c15628.f44722;
            this.f44719 = c15628.f44719;
        } else {
            this.f44722 = interfaceC2808.getText();
            this.f44719 = new C22436(interfaceC2808.mo4431(), interfaceC2808.getInputStream());
        }
    }

    @Override // p067l.InterfaceC2808
    public final int getType() {
        return this.f44721;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m35512(int i) {
        this.f44720 = i;
    }

    @Override // p067l.InterfaceC2808
    public final String getText() {
        int i;
        String str = this.f44722;
        if (str != null) {
            return str;
        }
        InterfaceC24346 inputStream = getInputStream();
        if (inputStream == null) {
            return null;
        }
        int size = inputStream.size();
        int i2 = this.f44724;
        return (i2 >= size || (i = this.f44723) >= size) ? "<EOF>" : inputStream.mo13949(C16399.m37214(i2, i));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35509(String str) {
        this.f44722 = str;
    }

    @Override // p067l.InterfaceC2808
    public final int getLine() {
        return this.f44720;
    }

    @Override // p067l.InterfaceC2808
    /* JADX INFO: renamed from: ֫ */
    public final int mo4429() {
        return this.f44727;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m35510(int i) {
        this.f44727 = i;
    }

    @Override // p067l.InterfaceC2808
    /* JADX INFO: renamed from: ۧ */
    public final int mo4430() {
        return this.f44726;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35508(int i) {
        this.f44726 = i;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m35515(int i) {
        this.f44721 = i;
    }

    @Override // p067l.InterfaceC2808
    /* JADX INFO: renamed from: ᩳ */
    public final int mo4434() {
        return this.f44724;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m35514(int i) {
        this.f44724 = i;
    }

    @Override // p067l.InterfaceC2808
    /* JADX INFO: renamed from: ܿ */
    public final int mo4433() {
        return this.f44723;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m35513(int i) {
        this.f44723 = i;
    }

    @Override // p067l.InterfaceC2808
    /* JADX INFO: renamed from: ܽ */
    public final int mo4432() {
        return this.f44725;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m35511(int i) {
        this.f44725 = i;
    }

    @Override // p067l.InterfaceC2808
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC3479 mo4431() {
        return (InterfaceC3479) this.f44719.f70786;
    }

    @Override // p067l.InterfaceC2808
    public final InterfaceC24346 getInputStream() {
        return (InterfaceC24346) this.f44719.f70787;
    }

    public final String toString() {
        String str;
        if (this.f44726 > 0) {
            str = ",channel=" + this.f44726;
        } else {
            str = "";
        }
        String text = getText();
        String strReplace = text != null ? text.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t") : "<no text>";
        String strValueOf = String.valueOf(this.f44721);
        StringBuilder sb = new StringBuilder("[@");
        sb.append(this.f44725);
        sb.append(",");
        sb.append(this.f44724);
        sb.append(":");
        sb.append(this.f44723);
        sb.append("='");
        sb.append(strReplace);
        sb.append("',<");
        ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb, strValueOf, ">", str, ",");
        sb.append(this.f44720);
        sb.append(":");
        return C5410.m11876(this.f44727, "]", sb);
    }
}
