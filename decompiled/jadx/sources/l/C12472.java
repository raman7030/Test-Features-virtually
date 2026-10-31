package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ܳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89CO */
/* JADX INFO: loaded from: classes4.dex */
public final class C12472 extends AbstractC10065 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC9923 f37489;

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

    public C12472(ActivityC9923 activityC9923) {
        this.f37489 = activityC9923;
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ۧ */
    public final int mo3224(AbstractC3255 abstractC3255) {
        AbstractC13882 abstractC13882 = (AbstractC13882) this.f37489.f29997.get(abstractC3255.getBindingAdapterPosition());
        abstractC13882.getClass();
        return abstractC13882 instanceof C7533 ? AbstractC10065.m25259(3, 0) : AbstractC10065.m25259(0, 0);
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3223(C13132 c13132, AbstractC3255 abstractC3255, AbstractC3255 abstractC3256) {
        int bindingAdapterPosition = abstractC3255.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC3256.getBindingAdapterPosition();
        ActivityC9923 activityC9923 = this.f37489;
        AbstractC13882 abstractC13882 = (AbstractC13882) activityC9923.f29997.get(bindingAdapterPosition2);
        abstractC13882.getClass();
        if (abstractC13882 instanceof C17683) {
            return false;
        }
        if ((abstractC13882 instanceof C6122) && abstractC13882.mo17035().f18758 == 0) {
            return false;
        }
        C6055.m16890(bindingAdapterPosition, bindingAdapterPosition2, activityC9923.f29997);
        AbstractC19902 adapter = c13132.getAdapter();
        C11003.requireNonNull(adapter);
        adapter.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        C1802.m5991(new Runnable() { // from class: l.۬ܳܿ
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList arrayList = new ArrayList();
                for (AbstractC13882 abstractC13883 : this.f39406.f37489.f29997) {
                    abstractC13883.getClass();
                    if (abstractC13883 instanceof C6122) {
                        int i = abstractC13883.mo17035().f18758;
                        if (i == 1) {
                            arrayList.add(C19095.f60135);
                        } else if (i == 2) {
                            arrayList.add(C9217.f27906);
                        }
                    } else if (abstractC13883 instanceof C7533) {
                        arrayList.add(abstractC13883.mo20218().f23177);
                    }
                }
                int i2 = -1;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    String strMo8778 = ((AbstractC2867) arrayList.get(i3)).mo8778();
                    strMo8778.getClass();
                    if (strMo8778.equals("builtin:systemTranslate")) {
                        C4711.m13807(arrayList);
                        C4711.m13809();
                    } else {
                        if (strMo8778.equals("builtin:translate")) {
                            i2 = i3;
                        }
                    }
                }
                arrayList.add(i2 + 1, new C22350(12));
                C4711.m13807(arrayList);
                C4711.m13809();
            }
        }, this, 1000L);
        return true;
    }
}
