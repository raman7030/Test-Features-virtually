package l;

/* JADX INFO: renamed from: l.᩺᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23189 extends C5551 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51435(C6319 c6319, AbstractC14016 abstractC14016, InterfaceC19663 interfaceC19663, C10643 c10643, C4809 c4809) {
        for (AbstractC7667 abstractC7667 : this.f53596) {
            C12171.m29642(abstractC7667 instanceof C18957);
            C18957 c18957 = (C18957) abstractC7667;
            if (c18957.f59794 == abstractC14016 && c18957.f59793 == interfaceC19663 && c18957.f59790.f32020 == c10643.f32020) {
                return;
            }
        }
        m41026(new C18957(c6319, abstractC14016, null, interfaceC19663, c10643, c4809));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m51436() {
        return this.f53596.m43518();
    }
}
