package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳ᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes5.dex */
public final class C18335 extends AbstractC9163 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4224 f56986;

    @Override // l.AbstractC9163
    /* JADX INFO: renamed from: ֫ */
    public final void mo19027(AbstractC5144 abstractC5144, AbstractC5144 abstractC5145, boolean z) {
        C2609 c2609Mo12938;
        C2609 c2609Mo12939;
        C19110 c19110 = (C19110) abstractC5144;
        C19110 c19111 = (C19110) abstractC5145;
        if (z) {
            return;
        }
        if (c19110.f60195 != null) {
            if (c19111.f60195.f17183.m8249()) {
                c2609Mo12938 = ((AbstractC12612) c19111.f60195.f17183.get(0)).f16086.mo12938();
            } else {
                c2609Mo12938 = c19111.f60195.f17184.f16086.mo12938();
            }
            if (c19110.f60195.f17183.m8249()) {
                c2609Mo12939 = ((AbstractC12612) c19110.f60195.f17183.get(0)).f16086.mo12938();
            } else {
                c2609Mo12939 = c19110.f60195.f17184.f16086.mo12938();
            }
        } else {
            c2609Mo12938 = c19111.f16086.mo12938();
            c2609Mo12939 = c19110.f16086.mo12938();
        }
        Iterator it = c2609Mo12938.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C4224 c4224 = this.f56986;
            if (zHasNext) {
                if (!c4224.f13706.m17550((AbstractC4308) it.next(), (AbstractC4308) c2609Mo12939.f8240)) {
                    return;
                } else {
                    c2609Mo12939 = c2609Mo12939.f8241;
                }
            } else {
                c4224.f13703.m7285(c19110.f60196, C14001.f42346);
                return;
            }
        }
    }

    @Override // l.AbstractC9163
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo19028(AbstractC5144 abstractC5144) {
        C19110 c19110 = (C19110) abstractC5144;
        if (!c19110.f60196.m14709(EnumC18550.f57521) || C7260.m19449(c19110)) {
            return false;
        }
        return c19110.f60195 == null || this.f56986.f13700;
    }

    @Override // l.AbstractC9163
    /* JADX INFO: renamed from: ۧ */
    public final C2609 mo19029(AbstractC5144 abstractC5144) {
        C19110 c19110 = (C19110) abstractC5144;
        if (c19110.f60196.m14709(EnumC18550.f57521)) {
            C19110 c19111 = (C19110) this.f56986.f13705.mo8690((AbstractC5144) c19110, (Object) null);
            ((C16432) c19111.f60196).f50541 = C2609.m8239();
            return C2609.of((Object) c19111);
        }
        return C2609.of((Object) c19110);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18335(C4224 c4224) {
        super(c4224, EnumC11280.DIAMOND, EnumC18550.f57548);
        this.f56986 = c4224;
    }
}
