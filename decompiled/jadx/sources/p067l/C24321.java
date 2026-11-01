package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.᩺ܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X1VL */
/* JADX INFO: loaded from: classes.dex */
public final class C24321 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractC9476 f77069;

    /* JADX INFO: renamed from: ۜ */
    public int f77070;

    /* JADX INFO: renamed from: ۢ */
    public int f77071;

    /* JADX INFO: renamed from: ۧ */
    public final EnumC13593 f77072;

    /* JADX INFO: renamed from: ܳ */
    public int f77073;

    /* JADX INFO: renamed from: ܽ */
    public InterfaceC7568 f77074;

    /* JADX INFO: renamed from: ܿ */
    public int f77075;

    /* JADX INFO: renamed from: ᩳ */
    public final List f77076;

    /* JADX INFO: renamed from: ᩷ */
    public int f77077;

    /* JADX INFO: renamed from: ᩻ */
    public int f77078;

    public C24321(List list, EnumC13593 enumC13593) {
        this.f77076 = list;
        this.f77072 = enumC13593;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m53678(int i, List list) {
        this.f77069 = null;
        this.f77074 = null;
        AbstractC9476 abstractC9476 = (AbstractC9476) list.get(i);
        EnumC3167 enumC3167Mo6217 = abstractC9476.mo6217();
        EnumC13593 enumC13593 = this.f77072;
        EnumC3167 enumC3167 = enumC13593.f38231;
        List list2 = this.f77076;
        if (enumC3167Mo6217 == enumC3167) {
            InterfaceC7568 interfaceC7568 = (InterfaceC7568) ((InterfaceC12777) abstractC9476).getReference();
            if (!list2.contains(interfaceC7568)) {
                return false;
            }
            this.f77074 = interfaceC7568;
            this.f77069 = abstractC9476;
            InterfaceC12933 interfaceC12933 = (InterfaceC12933) abstractC9476;
            this.f77075 = interfaceC12933.mo5885();
            this.f77073 = interfaceC12933.mo5883();
            this.f77078 = interfaceC12933.mo5882();
            this.f77070 = interfaceC12933.mo5884();
            this.f77077 = interfaceC12933.mo5881();
            this.f77071 = interfaceC12933.mo5886();
            return true;
        }
        if (abstractC9476.mo6217() != enumC13593.f38232) {
            return false;
        }
        InterfaceC7568 interfaceC7569 = (InterfaceC7568) ((InterfaceC12777) abstractC9476).getReference();
        if (!list2.contains(interfaceC7569)) {
            return false;
        }
        this.f77074 = interfaceC7569;
        this.f77069 = abstractC9476;
        InterfaceC18967 interfaceC18967 = (InterfaceC18967) abstractC9476;
        int iMo11756 = interfaceC18967.mo11756();
        this.f77075 = iMo11756;
        this.f77073 = iMo11756 + 1;
        this.f77078 = iMo11756 + 2;
        this.f77070 = iMo11756 + 3;
        this.f77077 = iMo11756 + 4;
        this.f77071 = interfaceC18967.mo5886();
        return true;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m53683() {
        return this.f77075;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m53682() {
        return this.f77073;
    }

    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC8705 m53680() {
        return new C8228(this);
    }

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC7568 m53681() {
        return this.f77074;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m53679() {
        return this.f77069.m22075().m39879();
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9476 m53677() {
        return this.f77069;
    }
}
