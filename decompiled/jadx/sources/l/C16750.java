package l;

import java.net.MalformedURLException;

/* JADX INFO: renamed from: l.ܽܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 99VK */
/* JADX INFO: loaded from: classes4.dex */
public final class C16750 implements InterfaceC18663 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C6565 f51440;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC5714 f51441;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC1934 f51442;

    public C16750(AbstractC1934 abstractC1934, InterfaceC5714 interfaceC5714) {
        this.f51442 = abstractC1934;
        this.f51441 = interfaceC5714;
    }

    @Override // l.InterfaceC18663
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC5714 mo6355() {
        return this.f51441;
    }

    @Override // l.InterfaceC18663
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo6360() {
        InterfaceC5714 interfaceC5714M38463;
        InterfaceC5714 interfaceC5714 = this.f51441;
        if (!(interfaceC5714 instanceof InterfaceC16317) || (interfaceC5714M38463 = ((InterfaceC16317) interfaceC5714).m38463()) == null) {
            return false;
        }
        this.f51441 = interfaceC5714M38463;
        return true;
    }

    @Override // l.InterfaceC18663
    public final C12914 get(String str) throws C19369 {
        try {
            return new C12914(str, this);
        } catch (MalformedURLException e) {
            throw new C19369(C20094.m46315("Invalid URL ", str), e);
        }
    }

    @Override // l.InterfaceC18663
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC1023 mo27540() {
        return ((C11107) this.f51442).mo27540();
    }

    @Override // l.InterfaceC18663
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC15133 mo27541() {
        return ((C11107) this.f51442).mo27541();
    }

    @Override // l.InterfaceC18663
    /* JADX INFO: renamed from: ۜ */
    public final C6565 mo27537() {
        if (this.f51440 == null) {
            this.f51440 = new C6565(this);
        }
        return this.f51440;
    }

    @Override // l.InterfaceC18663
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC18663 mo6358() {
        return this.f51442.mo6358();
    }

    @Override // l.InterfaceC18663
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC20074 mo27539() {
        return ((C11107) this.f51442).mo27539();
    }

    @Override // l.InterfaceC18663
    /* JADX INFO: renamed from: ᩷ */
    public final C9948 mo27542() {
        return ((C11107) this.f51442).mo27542();
    }

    @Override // l.InterfaceC18663
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC11607 mo27538() {
        return ((C11107) this.f51442).mo27538();
    }
}
