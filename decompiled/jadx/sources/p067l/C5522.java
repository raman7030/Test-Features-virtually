package p067l;

import android.view.ViewGroup;
import android.widget.ImageView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۗܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1ZO */
/* JADX INFO: loaded from: classes2.dex */
public final class C5522 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public final Main f13198;

    /* JADX INFO: renamed from: ۜ */
    public C14849 f13199;

    /* JADX INFO: renamed from: ۡ */
    public final C18402 f13200;

    /* JADX INFO: renamed from: ۢ */
    public final C7043 f13201;

    /* JADX INFO: renamed from: ۧ */
    public final C8009 f13202;

    /* JADX INFO: renamed from: ܳ */
    public Runnable f13203;

    /* JADX INFO: renamed from: ܽ */
    public final C20946 f13205;

    /* JADX INFO: renamed from: ᩳ */
    public final C25148 f13207;

    /* JADX INFO: renamed from: ᩷ */
    public final C18104 f13208;

    /* JADX INFO: renamed from: ᩻ */
    public final C3019 f13209;

    /* JADX INFO: renamed from: ܿ */
    public final C22957 f13206 = new C22957();

    /* JADX INFO: renamed from: ܺ */
    public final C6863 f13204 = new C6863(this);

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        AbstractViewOnLongClickListenerC16250 abstractViewOnLongClickListenerC16250 = (AbstractViewOnLongClickListenerC16250) abstractC5462;
        C23627 c23627M12172 = m12172(i);
        AbstractViewOnClickListenerC14239 abstractViewOnClickListenerC14239 = c23627M12172.f75204;
        if (abstractViewOnLongClickListenerC16250.f47807 != C23223.f73006) {
            abstractViewOnLongClickListenerC16250.mo34117(this.f13198.getTheme());
            abstractViewOnLongClickListenerC16250.f47807 = C23223.f73006;
        }
        int i2 = c23627M12172.f75203;
        if (i2 == -1) {
            abstractViewOnClickListenerC14239.mo17438(abstractViewOnLongClickListenerC16250);
        } else {
            abstractViewOnClickListenerC14239.mo5113(abstractViewOnLongClickListenerC16250, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r8v9, types: [l.۠ܶܳ] */
    public C5522(Main main, C18104 c18104) {
        this.f13198 = main;
        this.f13208 = c18104;
        this.f13201 = new C7043(main, this);
        this.f13207 = new C25148(main, C7050.m16224(R.string.MT_Protector), C7050.m16224(R.string.MT_Protector), this, -1);
        this.f13202 = new C8009(main, this);
        this.f13205 = new C20946(main, this);
        this.f13209 = new C3019(main, this);
        this.f13200 = new C18402(main, this);
        C14486.m33122(main, new C3807(1, this));
        C4361.m9076(main, (C10216) new InterfaceC3326() { // from class: l.۠ܶܳ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                this.f28322.m12192();
            }
        });
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m12192() {
        C6863 c6863 = this.f13204;
        if (c6863 == null) {
            return;
        }
        c6863.m15729();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12181() {
        C18104 c18104 = this.f13208;
        if (c18104.m41180()) {
            return;
        }
        c18104.m41174();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12186(boolean z) {
        C18104 c18104 = this.f13208;
        if (c18104.m41180()) {
            c18104.m41179(z);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m12191() {
        return this.f13208.m41180();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12184(AbstractViewOnLongClickListenerC16250 abstractViewOnLongClickListenerC16250) {
        ImageView imageView = abstractViewOnLongClickListenerC16250.f47812;
        if (imageView == null) {
            return;
        }
        this.f13208.m41175(imageView, abstractViewOnLongClickListenerC16250.mo31385());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12183(C14849 c14849) {
        this.f13199 = c14849;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12188(AbstractViewOnLongClickListenerC16250 abstractViewOnLongClickListenerC16250) {
        Runnable runnable;
        Runnable runnable2;
        if (abstractViewOnLongClickListenerC16250.mo31385()) {
            boolean z = abstractViewOnLongClickListenerC16250 instanceof C18262;
            C22957 c22957 = this.f13206;
            if (z) {
                C14849 c14849 = this.f13199;
                if (c14849 != null && (runnable2 = this.f13203) != null) {
                    c14849.removeCallbacks(runnable2);
                }
                this.f13203 = null;
                c22957.m51277(abstractViewOnLongClickListenerC16250);
            } else {
                C14849 c148410 = this.f13199;
                if (c148410 != null && (runnable = this.f13203) != null) {
                    c148410.removeCallbacks(runnable);
                }
                this.f13203 = null;
                c22957.m51276();
            }
            this.f13208.m41177(abstractViewOnLongClickListenerC16250);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m12190(AbstractC5462 abstractC5462) {
        return this.f13206.m51280(abstractC5462);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12185(C18262 c18262) {
        this.f13206.m51278(c18262, c18262.itemView.getTop());
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12189(C18262 c18262) {
        C22957 c22957;
        int iM51275;
        Runnable runnable;
        C14849 c14849 = this.f13199;
        if (c14849 == null || (iM51275 = (c22957 = this.f13206).m51275(c18262)) == -1) {
            return;
        }
        C14849 c148410 = this.f13199;
        if (c148410 != null && (runnable = this.f13203) != null) {
            c148410.removeCallbacks(runnable);
        }
        this.f13203 = null;
        RunnableC16920 runnableC16920 = new RunnableC16920(this, c18262, iM51275, c22957.m51282());
        this.f13203 = runnableC16920;
        c14849.postOnAnimation(runnableC16920);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12182(AbstractC5462 abstractC5462) {
        Runnable runnable;
        C22957 c22957 = this.f13206;
        if (c22957.m51281() != abstractC5462) {
            return;
        }
        C14849 c14849 = this.f13199;
        if (c14849 != null && (runnable = this.f13203) != null) {
            c14849.removeCallbacks(runnable);
        }
        this.f13203 = null;
        c22957.m51276();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m12168(C5522 c5522, C18262 c18262, int i) {
        C14849 c14849 = c5522.f13199;
        if (c14849 != null && c5522.f13206.m51281() == c18262 && c18262.itemView.getParent() == c14849) {
            c14849.stopScroll();
            AbstractC23964 itemAnimator = c14849.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.mo22575();
            }
            int top = c18262.itemView.getTop() - i;
            if (top != 0) {
                c14849.scrollBy(0, top);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m12179(AbstractViewOnClickListenerC14239 abstractViewOnClickListenerC14239) {
        return this.f13204.m15726(abstractViewOnClickListenerC14239);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC18933 m12180(int i) {
        return this.f13204.m15727(i);
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return this.f13204.m15728();
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        Main main = this.f13198;
        switch (i) {
            case 0:
                return new C14909(main, C1514.m34686(viewGroup, R.layout.MT_Protector, viewGroup, false));
            case 1:
                return new C21796(main, C1514.m34686(viewGroup, R.layout.MT_Protector, viewGroup, false), this.f13201);
            case 2:
                return new C20275(main, C1514.m34686(viewGroup, R.layout.MT_Protector, viewGroup, false), this.f13205);
            case 3:
                return new C14044(main, C1514.m34686(viewGroup, R.layout.MT_Protector, viewGroup, false), this.f13202);
            case 4:
                return new C13769(main, C1514.m34686(viewGroup, R.layout.MT_Protector, viewGroup, false), this.f13200);
            case 5:
                return new C21126(main, C1514.m34686(viewGroup, R.layout.MT_Protector, viewGroup, false), this.f13209);
            case 6:
                return new C18262(main, C1514.m34686(viewGroup, R.layout.MT_Protector, viewGroup, false));
            default:
                throw new RuntimeException();
        }
    }

    @Override // p067l.AbstractC21283
    public final int getItemViewType(int i) {
        C23627 c23627M12172 = m12172(i);
        int i2 = c23627M12172.f75203;
        if (i2 == -1) {
            return 0;
        }
        return ((AbstractViewOnClickListenerC3510) c23627M12172.f75204.f40548.get(i2)).mo8461();
    }

    /* JADX INFO: renamed from: ۧ */
    private C23627 m12172(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            C6863 c6863 = this.f13204;
            if (i2 >= c6863.size()) {
                throw new IllegalArgumentException(C20778.m46922(i, "Unknown drawer position "));
            }
            AbstractViewOnClickListenerC14239 abstractViewOnClickListenerC14239 = c6863.get(i2);
            int iMo17439 = abstractViewOnClickListenerC14239.mo17439();
            if (iMo17439 != 0) {
                int i4 = iMo17439 + i3;
                if (i < i4) {
                    return new C23627(abstractViewOnClickListenerC14239, i == i3 ? -1 : (i - i3) - 1);
                }
                i3 = i4;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C3019 m12187() {
        return this.f13209;
    }
}
