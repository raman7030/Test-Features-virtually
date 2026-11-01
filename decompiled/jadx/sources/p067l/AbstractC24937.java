package p067l;

import java.util.EmptyStackException;

/* JADX INFO: renamed from: l.᩻ܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: U42S */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24937 extends AbstractC20244 implements InterfaceC3479 {

    /* JADX INFO: renamed from: ۖ */
    public int f79631;

    /* JADX INFO: renamed from: ۘ */
    public int f79632;

    /* JADX INFO: renamed from: ۡ */
    public C22436 f79634;

    /* JADX INFO: renamed from: ۢ */
    public InterfaceC2808 f79635;

    /* JADX INFO: renamed from: ܳ */
    public boolean f79636;

    /* JADX INFO: renamed from: ᩳ */
    public int f79639;

    /* JADX INFO: renamed from: ᩴ */
    public int f79640;

    /* JADX INFO: renamed from: ᩻ */
    public InterfaceC24346 f79642;

    /* JADX INFO: renamed from: ܿ */
    public InterfaceC7503 f79638 = C9594.f26405;

    /* JADX INFO: renamed from: ܺ */
    public int f79637 = -1;

    /* JADX INFO: renamed from: ᩷ */
    public final C19082 f79641 = new C19082();

    /* JADX INFO: renamed from: ۜ */
    public int f79633 = 0;

    public AbstractC24937(InterfaceC24346 interfaceC24346) {
        this.f79642 = interfaceC24346;
        this.f79634 = new C22436(this, interfaceC24346);
    }

    public InterfaceC2808 nextToken() {
        int iM14695;
        InterfaceC24346 interfaceC24346 = this.f79642;
        if (interfaceC24346 == null) {
            throw new IllegalStateException("nextToken requires a non-null input stream.");
        }
        int iMo8402 = interfaceC24346.mo8402();
        while (!this.f79636) {
            try {
                this.f79635 = null;
                this.f79639 = 0;
                this.f79637 = interfaceC24346.index();
                this.f79631 = ((C6421) this.f62583).m14702();
                this.f79632 = ((C6421) this.f62583).m14705();
                while (true) {
                    this.f79640 = 0;
                    try {
                        iM14695 = ((C6421) this.f62583).m14695(interfaceC24346, this.f79633);
                    } catch (C8844 e) {
                        m54803(e);
                        if (interfaceC24346.mo8405(1) != -1) {
                            ((C6421) this.f62583).m14700(interfaceC24346);
                        }
                        iM14695 = -3;
                    }
                    if (interfaceC24346.mo8405(1) == -1) {
                        this.f79636 = true;
                    }
                    if (this.f79640 == 0) {
                        this.f79640 = iM14695;
                    }
                    int i = this.f79640;
                    if (i == -3) {
                        break;
                    }
                    if (i != -2) {
                        if (this.f79635 == null) {
                            this.f79635 = this.f79638.mo6090(this.f79634, i, null, this.f79639, this.f79637, interfaceC24346.index() - 1, this.f79632, this.f79631);
                        }
                        InterfaceC2808 interfaceC2808 = this.f79635;
                        interfaceC24346.mo8409(iMo8402);
                        return interfaceC2808;
                    }
                }
            } catch (Throwable th) {
                interfaceC24346.mo8409(iMo8402);
                throw th;
            }
        }
        m54805();
        InterfaceC2808 interfaceC2809 = this.f79635;
        interfaceC24346.mo8409(iMo8402);
        return interfaceC2809;
    }

    @Override // p067l.InterfaceC3479
    public final int getLine() {
        return ((C6421) this.f62583).m14705();
    }

    @Override // p067l.InterfaceC3479
    /* JADX INFO: renamed from: ֫ */
    public final int mo6209() {
        return ((C6421) this.f62583).m14702();
    }

    /* JADX INFO: renamed from: ܺ */
    public final String m54806() {
        return ((C6421) this.f62583).m14703(this.f79642);
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m54804() {
        C19082 c19082 = this.f79641;
        if (!c19082.m43359()) {
            this.f79633 = c19082.m43361(c19082.m43360() - 1);
            return;
        }
        throw new EmptyStackException();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54802(InterfaceC7503 interfaceC7503) {
        this.f79638 = interfaceC7503;
    }

    @Override // p067l.InterfaceC3479
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC7503 mo6210() {
        return this.f79638;
    }

    @Override // p067l.InterfaceC3479
    public final InterfaceC24346 getInputStream() {
        return this.f79642;
    }

    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC2808 m54805() {
        int iMo6209 = mo6209();
        int line = getLine();
        InterfaceC7503 interfaceC7503 = this.f79638;
        InterfaceC24346 interfaceC24346 = this.f79642;
        InterfaceC2808 interfaceC2808Mo6090 = interfaceC7503.mo6090(this.f79634, -1, null, 0, interfaceC24346.index(), interfaceC24346.index() - 1, line, iMo6209);
        this.f79635 = interfaceC2808Mo6090;
        return interfaceC2808Mo6090;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public final void m54803(C8844 c8844) {
        int i = this.f79637;
        InterfaceC24346 interfaceC24346 = this.f79642;
        String strMo13949 = interfaceC24346.mo13949(C16399.m37214(i, interfaceC24346.index()));
        StringBuilder sb = new StringBuilder("token recognition error at: '");
        StringBuilder sb2 = new StringBuilder();
        for (char c : strMo13949.toCharArray()) {
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
        m45730().mo4327(this, (Object) null, this.f79632, this.f79631, sb.toString(), c8844);
    }
}
