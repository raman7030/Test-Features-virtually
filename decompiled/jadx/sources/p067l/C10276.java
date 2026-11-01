package p067l;

/* JADX INFO: renamed from: l.۠ܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56MU */
/* JADX INFO: loaded from: classes4.dex */
public final class C10276 extends AbstractC10484 {

    /* JADX INFO: renamed from: ֫ */
    public final C23687 f28439 = new C23687();

    /* JADX INFO: renamed from: ۧ */
    public boolean f28440 = true;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ String f28441;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ boolean f28442;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ String f28443;

    public C10276(String str, String str2, boolean z) {
        this.f28442 = z;
        this.f28441 = str;
        this.f28443 = str2;
    }

    @Override // p067l.InterfaceC4449
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC13147 mo9302() {
        return this.f28439;
    }

    @Override // p067l.InterfaceC4449
    /* JADX INFO: renamed from: ֫ */
    public final C16359 mo9295(InterfaceC20543 interfaceC20543) {
        if (this.f28442) {
            return null;
        }
        if (interfaceC20543.getLine().m40550().toString().substring(interfaceC20543.getIndex()).trim().equals(this.f28441)) {
            return new C16359(-1, -1, true);
        }
        return C16359.m37169(interfaceC20543.getIndex());
    }

    @Override // p067l.AbstractC10484, p067l.InterfaceC4449
    /* JADX INFO: renamed from: ֫ */
    public final void mo9297(C17859 c17859) {
        boolean z = this.f28440;
        C23687 c23687 = this.f28439;
        if (z) {
            this.f28440 = false;
            if (this.f28442) {
                StringBuilder sb = c23687.f75407;
                String str = this.f28443;
                sb.append((CharSequence) str, 2, str.length() - 2);
                return;
            }
            return;
        }
        StringBuilder sb2 = c23687.f75407;
        sb2.append(c17859.m40550());
        sb2.append('\n');
    }
}
