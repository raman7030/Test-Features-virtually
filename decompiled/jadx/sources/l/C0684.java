package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֡᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 94PF */
/* JADX INFO: loaded from: classes3.dex */
public final class C0684 extends AbstractViewOnClickListenerC12490 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final AbstractC15440 f2623;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final AbstractC15440 f2624;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public List f2625;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m2772(C0684 c0684, C19736 c19736, C19736 c19737) {
        c0684.getClass();
        int bindingAdapterPosition = c19736.getBindingAdapterPosition();
        int bindingAdapterPosition2 = c19737.getBindingAdapterPosition();
        C3318 c3318 = c0684.f37526;
        int iM10143 = (bindingAdapterPosition - c3318.m10143(c0684)) - 1;
        int iM10144 = (bindingAdapterPosition2 - c3318.m10143(c0684)) - 1;
        ArrayList arrayList = c0684.f37525;
        C6055.m16890(iM10143, iM10144, arrayList);
        c3318.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        String[] strArr = (String[]) C5378.stream(arrayList).map(new C7035()).toArray(new C21147());
        int i = C15757.f48591;
        C1802.m5991(new RunnableC8885(2, strArr), C15757.class, 1000L);
    }

    static {
        AbstractC15440 abstractC15440M36526 = C16293.f50118.m36526("projects");
        f2624 = abstractC15440M36526;
        f2623 = C16293.f50116.m36514().m36526("projects");
        if (abstractC15440M36526.mo23119()) {
            abstractC15440M36526.mo23552();
            abstractC15440M36526.mo23546();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0684(Main main, C3318 c3318) {
        String strM14327 = C4925.m14327(R.string.MT_Protector);
        super(main, strM14327, strM14327, c3318);
        this.f2625 = Collections.EMPTY_LIST;
        m2773();
        main.m132().m24057(new RunnableC22511(2, this));
        main.getLifecycle().mo19833(new InterfaceC17236() { // from class: l.ۢ᩸ܳ
            @Override // l.InterfaceC17236
            /* JADX INFO: renamed from: ֫ */
            public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
                if (enumC22901 == EnumC22901.ON_RESUME) {
                    this.f29823.m2775();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m2775() {
        if (m2773()) {
            this.f37526.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m2773() {
        boolean z;
        List listM37157 = C15757.m37157(f2624, f2623);
        if (this.f2625.size() != listM37157.size() || !this.f2625.containsAll(listM37157)) {
            this.f2625 = listM37157;
            ArrayList arrayList = this.f37525;
            if (arrayList.isEmpty()) {
                z = true;
            } else {
                arrayList.clear();
                z = false;
            }
            Iterator it = listM37157.iterator();
            while (it.hasNext()) {
                arrayList.add(new C19030(this, this.f34527, (AbstractC15440) it.next()));
            }
            if (!z || !arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractViewOnClickListenerC12490
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2774(AbstractViewOnLongClickListenerC14606 abstractViewOnLongClickListenerC14606, int i) {
        C19736 c19736 = (C19736) abstractViewOnLongClickListenerC14606;
        C19030 c19030 = (C19030) this.f37525.get(i);
        c19736.f63763 = c19030;
        c19736.f44703.setText(c19030.f59950);
        c19736.f44700.setText(c19030.f59948);
        c19736.f44704.m26232(c19030.f59952);
        c19736.itemView.setOnClickListener(c19030);
        this.f37526.m10148((AbstractViewOnLongClickListenerC14606) c19736);
    }
}
