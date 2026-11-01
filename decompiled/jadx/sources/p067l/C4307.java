package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.֫᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 0A1O */
/* JADX INFO: loaded from: classes3.dex */
public final class C4307 extends AbstractC15015 implements InterfaceC17916 {

    /* JADX INFO: renamed from: ۠֫ */
    public static final InterfaceC4410 f9580 = C13128.m30022(C4307.class);

    /* JADX INFO: renamed from: ֡֫ */
    public boolean f9581;

    /* JADX INFO: renamed from: ֨֫ */
    public int f9582;

    /* JADX INFO: renamed from: ۖ֫ */
    public String f9583;

    /* JADX INFO: renamed from: ۘ֫ */
    public int f9584;

    /* JADX INFO: renamed from: ۚ֫ */
    public String f9585;

    /* JADX INFO: renamed from: ۡ֫ */
    public int f9586;

    /* JADX INFO: renamed from: ۢ֫ */
    public int f9587;

    /* JADX INFO: renamed from: ܺ֫ */
    public int f9588;

    /* JADX INFO: renamed from: ᩴ֫ */
    public String f9589;

    /* JADX INFO: renamed from: ᩵֫ */
    public String f9590;

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ۧ */
    public final int mo8760(int i, byte[] bArr) {
        return 0;
    }

    public C4307(String str, InterfaceC3341 interfaceC3341) {
        super(interfaceC3341, 5);
        this.f9588 = 1179785;
        this.f9582 = 3;
        this.f9587 = 1;
        this.f9586 = 0;
        mo8756(str);
    }

    @Override // p067l.AbstractC15015
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC14345 mo8764(InterfaceC20106 interfaceC20106) {
        return new C13025(this.f9590, interfaceC20106.mo29602());
    }

    @Override // p067l.InterfaceC17916
    public final String getPath() {
        return "\\" + this.f9590;
    }

    @Override // p067l.InterfaceC17916
    /* JADX INFO: renamed from: ᩵ */
    public final String mo8767() {
        return this.f9589;
    }

    @Override // p067l.InterfaceC17916
    /* JADX INFO: renamed from: ֫ */
    public final String mo8755() {
        return this.f9585;
    }

    @Override // p067l.InterfaceC17916
    /* JADX INFO: renamed from: ܽ */
    public final String mo8763() {
        return this.f9583;
    }

    @Override // p067l.InterfaceC17916
    /* JADX INFO: renamed from: ֫ */
    public final void mo8757(String str, String str2, String str3) {
        this.f9583 = str;
        this.f9585 = str2;
        this.f9589 = str3;
    }

    @Override // p067l.InterfaceC17916
    /* JADX INFO: renamed from: ֫ */
    public final void mo8756(String str) {
        if (str.length() > 0 && str.charAt(0) == '\\') {
            str = str.substring(1);
        }
        if (str.length() > 1 && C9417.m21911(1, str) == '\\') {
            str = C17073.m38720(1, 0, str);
        }
        this.f9590 = str;
    }

    @Override // p067l.InterfaceC17916
    /* JADX INFO: renamed from: ܳ */
    public final void mo8761() {
        m12491(268435456);
        this.f9581 = true;
    }

    /* JADX INFO: renamed from: ۘ */
    public final void m8759(int i) {
        this.f9588 = i;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final void m8766(int i) {
        this.f9584 = i;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final void m8768(int i) {
        this.f9582 = i;
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m8762(int i) {
        this.f9587 = i;
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m8758(int i) {
        this.f9586 = i;
    }

    @Override // p067l.InterfaceC9571
    public final int size() {
        int length = this.f9590.length() * 2;
        if (length == 0) {
            length++;
        }
        return AbstractC5628.m12467(AbstractC5628.m12467(length) + UMErrorCode.E_UM_BE_NOT_MAINPROCESS);
    }

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ᩳ */
    public final int mo8765(int i, byte[] bArr) {
        InterfaceC4410 interfaceC4410 = f9580;
        if (interfaceC4410.mo9181()) {
            interfaceC4410.mo9183("Opening " + this.f9590);
            interfaceC4410.mo9183("Flags are ".concat(C13854.m31529(m12499(), 4)));
        }
        C3775.m7364(57L, i, bArr);
        bArr[i + 2] = 0;
        bArr[i + 3] = 0;
        C3775.m7366(2, i + 4, bArr);
        C3775.m7368(0L, i + 8, bArr);
        C3775.m7366(this.f9588, i + 24, bArr);
        C3775.m7366(this.f9584, i + 28, bArr);
        C3775.m7366(this.f9582, i + 32, bArr);
        C3775.m7366(this.f9587, i + 36, bArr);
        C3775.m7366(this.f9586, i + 40, bArr);
        byte[] bytes = this.f9590.getBytes(StandardCharsets.UTF_16LE);
        C3775.m7364(bytes.length, i + 46, bArr);
        int i2 = i + 48;
        int i3 = i + 52;
        int i4 = i + 56;
        C3775.m7364(i4 - m12492(), i + 44, bArr);
        System.arraycopy(bytes, 0, bArr, i4, bytes.length);
        int length = bytes.length == 0 ? i + 57 : bytes.length + i4;
        int iM12507 = length + m12507(length);
        C3775.m7366(0L, i2, bArr);
        C3775.m7366(0, i3, bArr);
        return iM12507 - i;
    }

    @Override // p067l.AbstractC5628
    public final String toString() {
        return "[" + super.toString() + ",name=" + this.f9590 + ",resolveDfs=" + this.f9581 + "]";
    }
}
