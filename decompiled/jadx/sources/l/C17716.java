package l;

/* JADX INFO: renamed from: l.ᩳ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V89H */
/* JADX INFO: loaded from: classes5.dex */
public class C17716 implements InterfaceC18547 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C23360 f54203;

    @Override // l.InterfaceC18547
    /* JADX INFO: renamed from: ܽ */
    public final void mo5152(C15723 c15723) {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23360 m41495() {
        return this.f54203;
    }

    @Override // l.InterfaceC18547
    /* JADX INFO: renamed from: ۧ */
    public void mo5151(C15723 c15723) {
        c15723.m37107(EnumC3730.FOUR);
        if (c15723.m37111() != 0) {
            this.f54203 = new C23360();
        } else {
            this.f54203 = null;
        }
    }

    @Override // l.InterfaceC18547
    /* JADX INFO: renamed from: ֫ */
    public void mo5150(C15723 c15723) {
        C23360 c23360 = this.f54203;
        if (c23360 != null) {
            c15723.m37108(c23360);
        }
    }

    public int hashCode() {
        return C11003.hash(this.f54203);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C17716) {
            return C11003.equals(this.f54203, ((C17716) obj).f54203);
        }
        return false;
    }
}
