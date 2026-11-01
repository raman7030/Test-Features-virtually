package p067l;

import java.net.MalformedURLException;

/* JADX INFO: renamed from: l.ܽܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 99VK */
/* JADX INFO: loaded from: classes4.dex */
public final class C18288 implements InterfaceC20106 {

    /* JADX INFO: renamed from: ᩶ */
    public C8608 f54623;

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC7799 f54624;

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC4207 f54625;

    public C18288(AbstractC4207 abstractC4207, InterfaceC7799 interfaceC7799) {
        this.f54625 = abstractC4207;
        this.f54624 = interfaceC7799;
    }

    @Override // p067l.InterfaceC20106
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC7799 mo8528() {
        return this.f54624;
    }

    @Override // p067l.InterfaceC20106
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo8533() {
        InterfaceC7799 interfaceC7799M40678;
        InterfaceC7799 interfaceC7799 = this.f54624;
        if (!(interfaceC7799 instanceof InterfaceC17876) || (interfaceC7799M40678 = ((InterfaceC17876) interfaceC7799).m40678()) == null) {
            return false;
        }
        this.f54624 = interfaceC7799M40678;
        return true;
    }

    @Override // p067l.InterfaceC20106
    public final C14642 get(String str) throws C20777 {
        try {
            return new C14642(str, this);
        } catch (MalformedURLException e) {
            throw new C20777(C21466.m48631("Invalid URL ", str), e);
        }
    }

    @Override // p067l.InterfaceC20106
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC3341 mo29602() {
        return ((C12925) this.f54625).mo29602();
    }

    @Override // p067l.InterfaceC20106
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC16751 mo29603() {
        return ((C12925) this.f54625).mo29603();
    }

    @Override // p067l.InterfaceC20106
    /* JADX INFO: renamed from: ۜ */
    public final C8608 mo29599() {
        if (this.f54623 == null) {
            this.f54623 = new C8608(this);
        }
        return this.f54623;
    }

    @Override // p067l.InterfaceC20106
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC20106 mo8531() {
        return this.f54625.mo8531();
    }

    @Override // p067l.InterfaceC20106
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC21447 mo29601() {
        return ((C12925) this.f54625).mo29601();
    }

    @Override // p067l.InterfaceC20106
    /* JADX INFO: renamed from: ᩷ */
    public final C11823 mo29604() {
        return ((C12925) this.f54625).mo29604();
    }

    @Override // p067l.InterfaceC20106
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC13400 mo29600() {
        return ((C12925) this.f54625).mo29600();
    }
}
