package l;

import android.view.ViewGroup;
import android.widget.ImageView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۗܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1ZO */
/* JADX INFO: loaded from: classes2.dex */
public final class C3318 extends AbstractC19902 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Main f10389;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C13132 f10390;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C16870 f10391;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C4918 f10392;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C5935 f10393;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Runnable f10394;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19547 f10396;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23968 f10398;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C16557 f10399;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C0684 f10400;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21663 f10397 = new C21663();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C4729 f10395 = new C4729(this);

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        AbstractViewOnLongClickListenerC14606 abstractViewOnLongClickListenerC14606 = (AbstractViewOnLongClickListenerC14606) abstractC3255;
        C22368 c22368M10136 = m10136(i);
        AbstractViewOnClickListenerC12490 abstractViewOnClickListenerC12490 = c22368M10136.f72478;
        if (abstractViewOnLongClickListenerC14606.f44701 != C21943.f70295) {
            abstractViewOnLongClickListenerC14606.mo32019(this.f10389.getTheme());
            abstractViewOnLongClickListenerC14606.f44701 = C21943.f70295;
        }
        int i2 = c22368M10136.f72477;
        if (i2 == -1) {
            abstractViewOnClickListenerC12490.mo15527(abstractViewOnLongClickListenerC14606);
        } else {
            abstractViewOnClickListenerC12490.mo2774(abstractViewOnLongClickListenerC14606, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r8v9, types: [l.۠ܶܳ] */
    public C3318(Main main, C16557 c16557) {
        this.f10389 = main;
        this.f10399 = c16557;
        this.f10392 = new C4918(main, this);
        this.f10398 = new C23968(main, C4925.m14327(R.string.MT_Protector), C4925.m14327(R.string.MT_Protector), this, -1);
        this.f10393 = new C5935(main, this);
        this.f10396 = new C19547(main, this);
        this.f10400 = new C0684(main, this);
        this.f10391 = new C16870(main, this);
        C12749.m31038(main, new C1514(1, this));
        C2096.m6950(main, (C8257) new InterfaceC1008() { // from class: l.۠ܶܳ
            @Override // l.InterfaceC1008
            /* JADX INFO: renamed from: ֫ */
            public final void mo1617(Object obj) {
                this.f25412.m10156();
            }
        });
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m10156() {
        C4729 c4729 = this.f10395;
        if (c4729 == null) {
            return;
        }
        c4729.m13849();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10145() {
        C16557 c16557 = this.f10399;
        if (c16557.m38954()) {
            return;
        }
        c16557.m38948();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10150(boolean z) {
        C16557 c16557 = this.f10399;
        if (c16557.m38954()) {
            c16557.m38953(z);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m10155() {
        return this.f10399.m38954();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10148(AbstractViewOnLongClickListenerC14606 abstractViewOnLongClickListenerC14606) {
        ImageView imageView = abstractViewOnLongClickListenerC14606.f44706;
        if (imageView == null) {
            return;
        }
        this.f10399.m38949(imageView, abstractViewOnLongClickListenerC14606.mo29330());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10147(C13132 c13132) {
        this.f10390 = c13132;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10152(AbstractViewOnLongClickListenerC14606 abstractViewOnLongClickListenerC14606) {
        Runnable runnable;
        Runnable runnable2;
        if (abstractViewOnLongClickListenerC14606.mo29330()) {
            boolean z = abstractViewOnLongClickListenerC14606 instanceof C16723;
            C21663 c21663 = this.f10397;
            if (z) {
                C13132 c13132 = this.f10390;
                if (c13132 != null && (runnable2 = this.f10394) != null) {
                    c13132.removeCallbacks(runnable2);
                }
                this.f10394 = null;
                c21663.m48928(abstractViewOnLongClickListenerC14606);
            } else {
                C13132 c13133 = this.f10390;
                if (c13133 != null && (runnable = this.f10394) != null) {
                    c13133.removeCallbacks(runnable);
                }
                this.f10394 = null;
                c21663.m48927();
            }
            this.f10399.m38951(abstractViewOnLongClickListenerC14606);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m10154(AbstractC3255 abstractC3255) {
        return this.f10397.m48931(abstractC3255);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10149(C16723 c16723) {
        this.f10397.m48929(c16723, c16723.itemView.getTop());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10153(C16723 c16723) {
        C21663 c21663;
        int iM48926;
        Runnable runnable;
        C13132 c13132 = this.f10390;
        if (c13132 == null || (iM48926 = (c21663 = this.f10397).m48926(c16723)) == -1) {
            return;
        }
        C13132 c13133 = this.f10390;
        if (c13133 != null && (runnable = this.f10394) != null) {
            c13133.removeCallbacks(runnable);
        }
        this.f10394 = null;
        RunnableC15311 runnableC15311 = new RunnableC15311(this, c16723, iM48926, c21663.m48933());
        this.f10394 = runnableC15311;
        c13132.postOnAnimation(runnableC15311);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10146(AbstractC3255 abstractC3255) {
        Runnable runnable;
        C21663 c21663 = this.f10397;
        if (c21663.m48932() != abstractC3255) {
            return;
        }
        C13132 c13132 = this.f10390;
        if (c13132 != null && (runnable = this.f10394) != null) {
            c13132.removeCallbacks(runnable);
        }
        this.f10394 = null;
        c21663.m48927();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10132(C3318 c3318, C16723 c16723, int i) {
        C13132 c13132 = c3318.f10390;
        if (c13132 != null && c3318.f10397.m48932() == c16723 && c16723.itemView.getParent() == c13132) {
            c13132.stopScroll();
            AbstractC22723 itemAnimator = c13132.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.mo20595();
            }
            int top = c16723.itemView.getTop() - i;
            if (top != 0) {
                c13132.scrollBy(0, top);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m10143(AbstractViewOnClickListenerC12490 abstractViewOnClickListenerC12490) {
        return this.f10395.m13846(abstractViewOnClickListenerC12490);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC17429 m10144(int i) {
        return this.f10395.m13847(i);
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return this.f10395.m13848();
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        Main main = this.f10389;
        switch (i) {
            case 0:
                return new C13195(main, C13540.m32583(viewGroup, R.layout.MT_Protector, viewGroup, false));
            case 1:
                return new C20441(main, C13540.m32583(viewGroup, R.layout.MT_Protector, viewGroup, false), this.f10392);
            case 2:
                return new C18841(main, C13540.m32583(viewGroup, R.layout.MT_Protector, viewGroup, false), this.f10396);
            case 3:
                return new C12285(main, C13540.m32583(viewGroup, R.layout.MT_Protector, viewGroup, false), this.f10393);
            case 4:
                return new C11995(main, C13540.m32583(viewGroup, R.layout.MT_Protector, viewGroup, false), this.f10391);
            case 5:
                return new C19736(main, C13540.m32583(viewGroup, R.layout.MT_Protector, viewGroup, false), this.f10400);
            case 6:
                return new C16723(main, C13540.m32583(viewGroup, R.layout.MT_Protector, viewGroup, false));
            default:
                throw new RuntimeException();
        }
    }

    @Override // l.AbstractC19902
    public final int getItemViewType(int i) {
        C22368 c22368M10136 = m10136(i);
        int i2 = c22368M10136.f72477;
        if (i2 == -1) {
            return 0;
        }
        return ((AbstractViewOnClickListenerC1201) c22368M10136.f72478.f37525.get(i2)).mo6259();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C22368 m10136(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            C4729 c4729 = this.f10395;
            if (i2 >= c4729.size()) {
                throw new IllegalArgumentException(C19370.m44628(i, "Unknown drawer position "));
            }
            AbstractViewOnClickListenerC12490 abstractViewOnClickListenerC12490 = c4729.get(i2);
            int iMo15528 = abstractViewOnClickListenerC12490.mo15528();
            if (iMo15528 != 0) {
                int i4 = iMo15528 + i3;
                if (i < i4) {
                    return new C22368(abstractViewOnClickListenerC12490, i == i3 ? -1 : (i - i3) - 1);
                }
                i3 = i4;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C0684 m10151() {
        return this.f10400;
    }
}
