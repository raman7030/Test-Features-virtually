package l;

/* JADX INFO: renamed from: l.᩷᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes5.dex */
public final class C21084 extends AbstractC10065 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23178 f68002;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9089 f68003;

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo3225() {
        return false;
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ܽ */
    public final void mo3226(AbstractC3255 abstractC3255) {
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo3227() {
        return false;
    }

    public C21084(C9089 c9089, C23178 c23178) {
        this.f68003 = c9089;
        this.f68002 = c23178;
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ۧ */
    public final int mo3224(AbstractC3255 abstractC3255) {
        return AbstractC10065.m25259(3, 0);
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3223(C13132 c13132, AbstractC3255 abstractC3255, AbstractC3255 abstractC3256) {
        C9089 c9089 = this.f68003;
        if (c9089.m23460()) {
            return false;
        }
        int bindingAdapterPosition = abstractC3255.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC3256.getBindingAdapterPosition();
        if (!this.f68002.m51413(bindingAdapterPosition, bindingAdapterPosition2)) {
            return false;
        }
        c9089.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        C19547.f63204.mo1664(Object.class);
        return true;
    }
}
