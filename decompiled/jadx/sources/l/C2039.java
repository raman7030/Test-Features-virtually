package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.֫᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 0A1O */
/* JADX INFO: loaded from: classes3.dex */
public final class C2039 extends AbstractC13306 implements InterfaceC16359 {

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f6796 = C11321.m27961(C2039.class);

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public boolean f6797;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public int f6798;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public String f6799;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public int f6800;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public String f6801;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public int f6802;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public int f6803;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public int f6804;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public String f6805;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public String f6806;

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo6634(int i, byte[] bArr) {
        return 0;
    }

    public C2039(String str, InterfaceC1023 interfaceC1023) {
        super(interfaceC1023, 5);
        this.f6804 = 1179785;
        this.f6798 = 3;
        this.f6803 = 1;
        this.f6802 = 0;
        mo6630(str);
    }

    @Override // l.AbstractC13306
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC12601 mo6638(InterfaceC18663 interfaceC18663) {
        return new C11212(this.f6806, interfaceC18663.mo27540());
    }

    @Override // l.InterfaceC16359
    public final String getPath() {
        return "\\" + this.f6806;
    }

    @Override // l.InterfaceC16359
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String mo6641() {
        return this.f6805;
    }

    @Override // l.InterfaceC16359
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo6629() {
        return this.f6801;
    }

    @Override // l.InterfaceC16359
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String mo6637() {
        return this.f6799;
    }

    @Override // l.InterfaceC16359
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6631(String str, String str2, String str3) {
        this.f6799 = str;
        this.f6801 = str2;
        this.f6805 = str3;
    }

    @Override // l.InterfaceC16359
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6630(String str) {
        if (str.length() > 0 && str.charAt(0) == '\\') {
            str = str.substring(1);
        }
        if (str.length() > 1 && C7416.m19937(1, str) == '\\') {
            str = C15472.m36561(1, 0, str);
        }
        this.f6806 = str;
    }

    @Override // l.InterfaceC16359
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void mo6635() {
        m10452(268435456);
        this.f6797 = true;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m6633(int i) {
        this.f6804 = i;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m6640(int i) {
        this.f6800 = i;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m6642(int i) {
        this.f6798 = i;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m6636(int i) {
        this.f6803 = i;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m6632(int i) {
        this.f6802 = i;
    }

    @Override // l.InterfaceC7578
    public final int size() {
        int length = this.f6806.length() * 2;
        if (length == 0) {
            length++;
        }
        return AbstractC3429.m10428(AbstractC3429.m10428(length) + UMErrorCode.E_UM_BE_NOT_MAINPROCESS);
    }

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int mo6639(int i, byte[] bArr) {
        InterfaceC2148 interfaceC2148 = f6796;
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7088("Opening " + this.f6806);
            interfaceC2148.mo7088("Flags are ".concat(C12085.m29467(m10460(), 4)));
        }
        C1480.m5122(57L, i, bArr);
        bArr[i + 2] = 0;
        bArr[i + 3] = 0;
        C1480.m5124(2, i + 4, bArr);
        C1480.m5126(0L, i + 8, bArr);
        C1480.m5124(this.f6804, i + 24, bArr);
        C1480.m5124(this.f6800, i + 28, bArr);
        C1480.m5124(this.f6798, i + 32, bArr);
        C1480.m5124(this.f6803, i + 36, bArr);
        C1480.m5124(this.f6802, i + 40, bArr);
        byte[] bytes = this.f6806.getBytes(StandardCharsets.UTF_16LE);
        C1480.m5122(bytes.length, i + 46, bArr);
        int i2 = i + 48;
        int i3 = i + 52;
        int i4 = i + 56;
        C1480.m5122(i4 - m10453(), i + 44, bArr);
        System.arraycopy(bytes, 0, bArr, i4, bytes.length);
        int length = bytes.length == 0 ? i + 57 : bytes.length + i4;
        int iM10468 = length + m10468(length);
        C1480.m5124(0L, i2, bArr);
        C1480.m5124(0, i3, bArr);
        return iM10468 - i;
    }

    @Override // l.AbstractC3429
    public final String toString() {
        return "[" + super.toString() + ",name=" + this.f6806 + ",resolveDfs=" + this.f6797 + "]";
    }
}
