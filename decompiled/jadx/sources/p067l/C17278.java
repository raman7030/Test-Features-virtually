package p067l;

/* JADX INFO: renamed from: l.ܺۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 62A7 */
/* JADX INFO: loaded from: classes4.dex */
public class C17278 implements InterfaceC19370 {

    /* JADX INFO: renamed from: ֫֫ */
    public static final InterfaceC19370 f51496 = new C10574("..", "", null, -1, 0, false);

    /* JADX INFO: renamed from: ۗ */
    public int f51497;

    /* JADX INFO: renamed from: ۙ */
    public C13596 f51498;

    /* JADX INFO: renamed from: ۛ */
    public String f51499;

    /* JADX INFO: renamed from: ۟ */
    public long f51500;

    /* JADX INFO: renamed from: ۤ */
    public boolean f51501;

    /* JADX INFO: renamed from: ۨ */
    public String f51502;

    /* JADX INFO: renamed from: ۫ */
    public String f51503;

    /* JADX INFO: renamed from: ۬ */
    public boolean f51504;

    /* JADX INFO: renamed from: ܰ */
    public C6634 f51505;

    /* JADX INFO: renamed from: ᩶ */
    public volatile InterfaceC0923 f51506;

    /* JADX INFO: renamed from: ᩸ */
    public long f51507 = -1;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f51508;

    /* JADX INFO: renamed from: ᩺ */
    public long f51509;

    @Override // p067l.InterfaceC19370
    /* JADX INFO: renamed from: ֨ۧ */
    public C18028 mo26440() {
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo30899() {
        return this instanceof C12092;
    }

    @Override // p067l.InterfaceC19370
    /* JADX INFO: renamed from: ۗ֫ */
    public CharSequence mo31782() {
        return null;
    }

    @Override // p067l.InterfaceC19370
    /* JADX INFO: renamed from: ۙ */
    public boolean mo39134() {
        return this instanceof C20633;
    }

    @Override // p067l.InterfaceC19370
    /* JADX INFO: renamed from: ۡۧ */
    public boolean mo39138() {
        return false;
    }

    @Override // p067l.InterfaceC19370
    /* JADX INFO: renamed from: ᩴ */
    public boolean mo27882() {
        return false;
    }

    @Override // p067l.InterfaceC19370
    /* JADX INFO: renamed from: ᩵֫ */
    public boolean mo39148() {
        return this instanceof C10574;
    }

    @Override // p067l.InterfaceC19370
    /* JADX INFO: renamed from: ᩸ */
    public CharSequence mo23149() {
        return null;
    }

    public C17278(String str, String str2, String str3, long j, long j2, boolean z) {
        String strConcat = "/";
        if (str2 != null && !str2.isEmpty()) {
            str2 = str2.startsWith("/") ? str2 : "/".concat(str2);
            strConcat = !str2.endsWith("/") ? str2.concat("/") : str2;
        }
        this.f51499 = str;
        this.f51502 = strConcat;
        this.f51503 = str3;
        this.f51509 = j;
        this.f51500 = j2;
        this.f51504 = z;
    }

    @Override // p067l.InterfaceC19370
    public final String getName() {
        return this.f51499;
    }

    public final String toString() {
        return this.f51499;
    }

    @Override // p067l.InterfaceC19370
    /* JADX INFO: renamed from: ᩺ */
    public final String mo39151() {
        String str = this.f51499;
        return str.length() <= 500 ? str : str.substring(0, 500);
    }

    @Override // p067l.InterfaceC19370
    public final String getParent() {
        return this.f51502;
    }

    @Override // p067l.InterfaceC19370
    /* JADX INFO: renamed from: ܺۧ */
    public final boolean mo39147() {
        return (this instanceof C10574) || mo39138() || (this instanceof C20633);
    }

    @Override // p067l.InterfaceC19370
    /* JADX INFO: renamed from: ܶۧ */
    public AbstractC17043 mo26445() {
        return C18524.m42109(getPath(), new String[0]);
    }

    @Override // p067l.InterfaceC19370
    public final String getPath() {
        String str = this.f51499;
        boolean zIsEmpty = str.isEmpty();
        String str2 = this.f51502;
        return zIsEmpty ? C17588.m40053(str2, "/") : C17588.m40053(str2, str);
    }

    @Override // p067l.InterfaceC19370
    /* JADX INFO: renamed from: ۠ۧ */
    public int mo26443() {
        if (this instanceof C10574) {
            return 0;
        }
        if (isDirectory()) {
            return 5;
        }
        return !mo39138() ? 10 : 15;
    }

    @Override // p067l.InterfaceC19370
    /* JADX INFO: renamed from: ܺ֫ */
    public final String mo39146() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f51502);
        return C10965.m25286(sb, this.f51499, "/");
    }

    @Override // p067l.InterfaceC19370
    /* JADX INFO: renamed from: ۠֫ */
    public final String mo39137() {
        return (isDirectory() || mo39138()) ? "*/*" : mo39139().m9394();
    }

    @Override // p067l.InterfaceC19370
    /* JADX INFO: renamed from: ֨֫ */
    public final String mo39128() {
        InterfaceC0923 interfaceC0923 = this.f51506;
        if (interfaceC0923 != null) {
            return ((C4463) interfaceC0923.get()).m9398().toLowerCase();
        }
        return mo26445().m38663().toLowerCase();
    }

    @Override // p067l.InterfaceC19370
    /* JADX INFO: renamed from: ֫ */
    public final void mo39131(InterfaceC0923 interfaceC0923) {
        this.f51506 = interfaceC0923;
    }

    @Override // p067l.InterfaceC19370
    /* JADX INFO: renamed from: ۤۧ */
    public final C4463 mo39139() {
        InterfaceC0923 interfaceC0923 = this.f51506;
        if (interfaceC0923 == null) {
            return C4463.m9371(this.f51499, true);
        }
        return (C4463) interfaceC0923.get();
    }

    @Override // p067l.InterfaceC19370
    public final long getSize() {
        return this.f51509;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39129(long j) {
        this.f51507 = j;
    }

    @Override // p067l.InterfaceC19370
    /* JADX INFO: renamed from: ܳۧ */
    public final long mo39145() {
        return this.f51507;
    }

    @Override // p067l.InterfaceC19370
    public final long getTime() {
        return this.f51500;
    }

    @Override // p067l.InterfaceC19370
    public final void setTime(long j) {
        this.f51500 = j;
    }

    @Override // p067l.InterfaceC19370
    /* JADX INFO: renamed from: ۙ֫ */
    public final boolean mo39135() {
        return !mo39147() && this.f51504;
    }

    @Override // p067l.InterfaceC19370
    public final boolean isDirectory() {
        return (mo39147() || this.f51504) ? false : true;
    }

    @Override // p067l.InterfaceC19370
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo39144() {
        return this.f51503 != null;
    }

    @Override // p067l.InterfaceC19370
    /* JADX INFO: renamed from: ۧ֫ */
    public final String mo39143() {
        return this.f51503;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39130(String str) {
        this.f51503 = str;
    }

    @Override // p067l.InterfaceC19370
    public final boolean isChecked() {
        return this.f51508;
    }

    @Override // p067l.InterfaceC19370
    public final void setChecked(boolean z) {
        if (mo39147()) {
            throw new RuntimeException();
        }
        this.f51508 = z;
    }

    @Override // p067l.InterfaceC19370
    /* JADX INFO: renamed from: ᩸ۧ */
    public final boolean mo39149() {
        return this.f51501;
    }

    @Override // p067l.InterfaceC19370
    /* JADX INFO: renamed from: ۧ */
    public final void mo39142(boolean z) {
        if (mo39147()) {
            throw new RuntimeException();
        }
        this.f51501 = z;
    }

    @Override // p067l.InterfaceC19370
    public final C13596 getIcon() {
        return this.f51498;
    }

    @Override // p067l.InterfaceC19370
    /* JADX INFO: renamed from: ֫ */
    public final void mo39132(C13596 c13596) {
        this.f51498 = c13596;
        this.f51497 = 0;
    }

    @Override // p067l.InterfaceC19370
    /* JADX INFO: renamed from: ۧ */
    public final void mo39140(int i) {
        this.f51497 = i;
    }

    @Override // p067l.InterfaceC19370
    /* JADX INFO: renamed from: ᩸֫ */
    public boolean mo26449() {
        if (mo39147() || this.f51509 == -1) {
            return false;
        }
        return !isDirectory() || mo30899();
    }

    @Override // p067l.InterfaceC19370
    /* JADX INFO: renamed from: ֫ */
    public final void mo39133(C21265 c21265) {
        mo39132(c21265.f66886);
    }

    @Override // p067l.InterfaceC19370
    /* JADX INFO: renamed from: ᩹֫ */
    public final int mo39150() {
        return this.f51497;
    }

    @Override // 
    public final InterfaceC19370 clone() {
        try {
            return (InterfaceC19370) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p067l.InterfaceC19370
    /* JADX INFO: renamed from: ۧ */
    public final void mo39141(int i, Object obj) {
        C6634 c6634 = this.f51505;
        if (c6634 == null) {
            c6634 = new C6634();
            this.f51505 = c6634;
        }
        c6634.mo4686(i, obj);
    }

    @Override // p067l.InterfaceC19370
    /* JADX INFO: renamed from: ۜ */
    public final Object mo39136(int i) {
        C6634 c6634 = this.f51505;
        if (c6634 == null) {
            return null;
        }
        return c6634.get(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C17278 c17278 = (C17278) obj;
        if (this.f51509 == c17278.f51509 && this.f51500 == c17278.f51500 && this.f51504 == c17278.f51504 && this.f51499.equals(c17278.f51499) && this.f51502.equals(c17278.f51502)) {
            return C12826.equals(this.f51503, c17278.f51503);
        }
        return false;
    }

    public int hashCode() {
        int iM29411 = C12832.m29411(this.f51499.hashCode() * 31, 31, this.f51502);
        long j = this.f51509;
        int i = (iM29411 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f51500;
        int i2 = (((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f51504 ? 1 : 0)) * 31;
        String str = this.f51503;
        return i2 + (str != null ? str.hashCode() : 0);
    }
}
