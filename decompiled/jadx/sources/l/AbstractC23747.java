package l;

import java.util.EmptyStackException;

/* JADX INFO: renamed from: l.᩻ܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: U42S */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23747 extends AbstractC18809 implements InterfaceC1169 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f76879;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f76880;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C21115 f76882;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public InterfaceC0463 f76883;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f76884;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f76887;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f76888;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC23125 f76890;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC5403 f76886 = C7603.f23492;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f76885 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17586 f76889 = new C17586();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f76881 = 0;

    public AbstractC23747(InterfaceC23125 interfaceC23125) {
        this.f76890 = interfaceC23125;
        this.f76882 = new C21115(this, interfaceC23125);
    }

    public InterfaceC0463 nextToken() {
        int iM12831;
        InterfaceC23125 interfaceC23125 = this.f76890;
        if (interfaceC23125 == null) {
            throw new IllegalStateException("nextToken requires a non-null input stream.");
        }
        int iMo6200 = interfaceC23125.mo6200();
        while (!this.f76884) {
            try {
                this.f76883 = null;
                this.f76887 = 0;
                this.f76885 = interfaceC23125.index();
                this.f76879 = ((C4264) this.f59356).m12838();
                this.f76880 = ((C4264) this.f59356).m12841();
                while (true) {
                    this.f76888 = 0;
                    try {
                        iM12831 = ((C4264) this.f59356).m12831(interfaceC23125, this.f76881);
                    } catch (C6814 e) {
                        m52394(e);
                        if (interfaceC23125.mo6203(1) != -1) {
                            ((C4264) this.f59356).m12836(interfaceC23125);
                        }
                        iM12831 = -3;
                    }
                    if (interfaceC23125.mo6203(1) == -1) {
                        this.f76884 = true;
                    }
                    if (this.f76888 == 0) {
                        this.f76888 = iM12831;
                    }
                    int i = this.f76888;
                    if (i == -3) {
                        break;
                    }
                    if (i != -2) {
                        if (this.f76883 == null) {
                            this.f76883 = this.f76886.mo3833(this.f76882, i, null, this.f76887, this.f76885, interfaceC23125.index() - 1, this.f76880, this.f76879);
                        }
                        InterfaceC0463 interfaceC0463 = this.f76883;
                        interfaceC23125.mo6207(iMo6200);
                        return interfaceC0463;
                    }
                }
            } catch (Throwable th) {
                interfaceC23125.mo6207(iMo6200);
                throw th;
            }
        }
        m52396();
        InterfaceC0463 interfaceC0464 = this.f76883;
        interfaceC23125.mo6207(iMo6200);
        return interfaceC0464;
    }

    @Override // l.InterfaceC1169
    public final int getLine() {
        return ((C4264) this.f59356).m12841();
    }

    @Override // l.InterfaceC1169
    /* JADX INFO: renamed from: ֫ */
    public final int mo3967() {
        return ((C4264) this.f59356).m12838();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m52397() {
        return ((C4264) this.f59356).m12839(this.f76890);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m52395() {
        C17586 c17586 = this.f76889;
        if (!c17586.m41113()) {
            this.f76881 = c17586.m41115(c17586.m41114() - 1);
            return;
        }
        throw new EmptyStackException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52393(InterfaceC5403 interfaceC5403) {
        this.f76886 = interfaceC5403;
    }

    @Override // l.InterfaceC1169
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC5403 mo3968() {
        return this.f76886;
    }

    @Override // l.InterfaceC1169
    public final InterfaceC23125 getInputStream() {
        return this.f76890;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0463 m52396() {
        int iMo3967 = mo3967();
        int line = getLine();
        InterfaceC5403 interfaceC5403 = this.f76886;
        InterfaceC23125 interfaceC23125 = this.f76890;
        InterfaceC0463 interfaceC0463Mo3833 = interfaceC5403.mo3833(this.f76882, -1, null, 0, interfaceC23125.index(), interfaceC23125.index() - 1, line, iMo3967);
        this.f76883 = interfaceC0463Mo3833;
        return interfaceC0463Mo3833;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52394(C6814 c6814) {
        int i = this.f76885;
        InterfaceC23125 interfaceC23125 = this.f76890;
        String strMo12025 = interfaceC23125.mo12025(C14763.m35067(i, interfaceC23125.index()));
        StringBuilder sb = new StringBuilder("token recognition error at: '");
        StringBuilder sb2 = new StringBuilder();
        for (char c : strMo12025.toCharArray()) {
            String strValueOf = String.valueOf(c);
            if (c == -1) {
                strValueOf = "<EOF>";
            } else if (c == 13) {
                strValueOf = "\\r";
            } else if (c == 9) {
                strValueOf = "\\t";
            } else if (c == 10) {
                strValueOf = "\\n";
            }
            sb2.append(strValueOf);
        }
        sb.append(sb2.toString());
        sb.append("'");
        m43461().mo1935(this, (Object) null, this.f76880, this.f76879, sb.toString(), c6814);
    }
}
