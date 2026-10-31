package l;

import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.᩸֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97QO */
/* JADX INFO: loaded from: classes5.dex */
public final class C21265 implements InterfaceC15086 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f68602;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f68603;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f68604;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f68605;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f68606;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC19920 f68607;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f68608;

    public C21265(int i, String str, String str2, int i2, int i3, boolean z, EnumC19920 enumC19920) {
        this.f68603 = i;
        this.f68606 = str;
        this.f68608 = str2;
        this.f68604 = i2;
        this.f68602 = i3;
        this.f68605 = z;
        this.f68607 = enumC19920;
    }

    @Override // l.InterfaceC15086
    public final int getIndex() {
        return this.f68603;
    }

    @Override // l.InterfaceC15086
    public final String getText() {
        return this.f68608;
    }

    @Override // l.InterfaceC15086
    /* JADX INFO: renamed from: ᩳ */
    public final String mo35701() {
        return this.f68606;
    }

    @Override // l.InterfaceC15086
    public final int length() {
        return this.f68606.length();
    }

    @Override // l.InterfaceC15086
    public final int getPosition() {
        return this.f68604;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m48284() {
        return this.f68602;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m48282() {
        return this.f68605;
    }

    @Override // l.InterfaceC15086
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo35698() {
        return C12970.m31535(this.f68608);
    }

    @Override // l.InterfaceC15086
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo35696() {
        return this.f68608.startsWith("//");
    }

    @Override // l.InterfaceC15086
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo35699() {
        return this.f68608.startsWith("/*");
    }

    @Override // l.InterfaceC15086
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo35697() {
        String str = this.f68608;
        return str.startsWith("/**") && str.charAt(3) != '*' && str.length() > 4;
    }

    @Override // l.InterfaceC15086
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo35700() {
        return mo35696() || mo35699();
    }

    public final String toString() {
        C8964 c8964M37871 = C16018.m37871(this);
        c8964M37871.m23111("index", this.f68603);
        c8964M37871.m23110((Object) this.f68608, TextBundle.TEXT_ENTRY);
        c8964M37871.m23111("position", this.f68604);
        c8964M37871.m23111("columnI", this.f68602);
        c8964M37871.m23112("isToken", this.f68605);
        return c8964M37871.toString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC19920 m48283() {
        return this.f68607;
    }
}
