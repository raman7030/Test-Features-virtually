package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ܽ᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16860 extends C1110 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public AbstractC12612 f51738;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public Map f51739;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5572 f51740;

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC16860 mo8502(C1755 c1755, AbstractC12612 abstractC12612);

    /* JADX INFO: renamed from: ۧ */
    public abstract AbstractC4308 mo18876(C23420 c23420);

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC16860(C5572 c5572, AbstractC12612 abstractC12612, C1755 c1755, AbstractC12612 abstractC12613, Map map) {
        this.f51740 = c5572;
        C12399 c12399 = c5572.f17264;
        C11003.requireNonNull(c12399);
        super(c12399, abstractC12612, c1755);
        this.f51738 = abstractC12613;
        this.f51739 = map;
    }

    @Override // l.C1110
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4308 mo3823(C23420 c23420, C6755 c6755) {
        AbstractC4308 abstractC4308Mo18876;
        if (c6755.f20970 == EnumC13829.SPECULATIVE) {
            if (c23420.f75219 == AbstractC4308.f13884) {
                abstractC4308Mo18876 = super.mo3823(c23420, c6755);
            } else {
                abstractC4308Mo18876 = mo18876(c23420);
            }
            this.f51739.put(c23420, abstractC4308Mo18876);
            return abstractC4308Mo18876;
        }
        if (!((C8604) this.f4049.f6073).f26283.f23066) {
            C5572 c5572 = this.f51740;
            c5572.f17260.remove(new C0632(c5572, this.f4048));
        }
        return super.mo3823(c23420, c6755);
    }

    @Override // l.C1110
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4308 mo3821(AbstractC5698 abstractC5698, EnumC16761 enumC16761) {
        if (this.f4050.contains(abstractC5698)) {
            return super.mo3821(abstractC5698, enumC16761);
        }
        for (Map.Entry entry : this.f51739.entrySet()) {
            C6755 c6755Mo3860 = ((C23420) entry.getKey()).f75215.mo3860();
            if (c6755Mo3860.f20969 == enumC16761 && c6755Mo3860.f20972 == abstractC5698) {
                return (AbstractC4308) entry.getValue();
            }
        }
        return AbstractC4308.f13885;
    }

    @Override // l.C1110
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5144 mo3824(C6755 c6755) {
        if (this.f4050.contains(c6755.f20972)) {
            return super.mo3824(c6755);
        }
        return this.f51738;
    }
}
