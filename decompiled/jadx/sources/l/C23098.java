package l;

import java.util.List;

/* JADX INFO: renamed from: l.᩺ܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X1VL */
/* JADX INFO: loaded from: classes.dex */
public final class C23098 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC7479 f74323;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f74324;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f74325;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC11810 f74326;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f74327;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC5471 f74328;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f74329;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List f74330;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f74331;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f74332;

    public C23098(List list, EnumC11810 enumC11810) {
        this.f74330 = list;
        this.f74326 = enumC11810;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51284(int i, List list) {
        this.f74323 = null;
        this.f74328 = null;
        AbstractC7479 abstractC7479 = (AbstractC7479) list.get(i);
        EnumC0841 enumC0841Mo3975 = abstractC7479.mo3975();
        EnumC11810 enumC11810 = this.f74326;
        EnumC0841 enumC0841 = enumC11810.f35229;
        List list2 = this.f74330;
        if (enumC0841Mo3975 == enumC0841) {
            InterfaceC5471 interfaceC5471 = (InterfaceC5471) ((InterfaceC10952) abstractC7479).getReference();
            if (!list2.contains(interfaceC5471)) {
                return false;
            }
            this.f74328 = interfaceC5471;
            this.f74323 = abstractC7479;
            InterfaceC11116 interfaceC11116 = (InterfaceC11116) abstractC7479;
            this.f74329 = interfaceC11116.mo3614();
            this.f74327 = interfaceC11116.mo3612();
            this.f74332 = interfaceC11116.mo3611();
            this.f74324 = interfaceC11116.mo3613();
            this.f74331 = interfaceC11116.mo3610();
            this.f74325 = interfaceC11116.mo3615();
            return true;
        }
        if (abstractC7479.mo3975() != enumC11810.f35230) {
            return false;
        }
        InterfaceC5471 interfaceC5472 = (InterfaceC5471) ((InterfaceC10952) abstractC7479).getReference();
        if (!list2.contains(interfaceC5472)) {
            return false;
        }
        this.f74328 = interfaceC5472;
        this.f74323 = abstractC7479;
        InterfaceC17465 interfaceC17465 = (InterfaceC17465) abstractC7479;
        int iMo9712 = interfaceC17465.mo9712();
        this.f74329 = iMo9712;
        this.f74327 = iMo9712 + 1;
        this.f74332 = iMo9712 + 2;
        this.f74324 = iMo9712 + 3;
        this.f74331 = iMo9712 + 4;
        this.f74325 = interfaceC17465.mo3615();
        return true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m51289() {
        return this.f74329;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m51288() {
        return this.f74327;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6667 m51286() {
        return new C6165(this);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5471 m51287() {
        return this.f74328;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m51285() {
        return this.f74323.m20099().m37704();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC7479 m51283() {
        return this.f74323;
    }
}
