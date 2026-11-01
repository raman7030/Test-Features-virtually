package p067l;

import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳ᩹ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19799 extends C19326 {

    /* JADX INFO: renamed from: ۫ */
    public final C9010 f60215;

    /* JADX INFO: renamed from: ۬ */
    public final ArrayList f60216;

    /* JADX INFO: renamed from: ۨ */
    public static final float[] f60214 = {0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: ۛ */
    public static final String[] f60212 = {"x0.5", "x0.75", "x1.0", "x1.25", "x1.5", "x2.0"};

    /* JADX INFO: renamed from: ۤ */
    public static final int[] f60213 = {15, 30, 45, 60, 90};

    /* JADX INFO: renamed from: ܿ */
    public static int m45025(int i) {
        if (i == 0) {
            return R.string.MT_Protector;
        }
        if (i == 1) {
            return R.string.MT_Protector;
        }
        if (i != 2) {
            return i != 3 ? R.string.MT_Protector : R.string.MT_Protector;
        }
        return R.string.MT_Protector;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45016(C19799 c19799, TextView textView, MenuItem menuItem) {
        c19799.getClass();
        int order = menuItem.getOrder();
        if (order < 0 || order >= 6) {
            throw new IllegalArgumentException();
        }
        ApplicationC21448.f67649.edit().mo27875(order, "mps").apply();
        textView.setText(f60212[order]);
        c19799.f60215.f24458.mo17761(f60214[order]);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45017(C19799 c19799, TextView textView, C23132 c23132, C1898[] c1898Arr, View view) {
        c19799.getClass();
        if (view.isAttachedToWindow()) {
            C1898 c1898 = new C1898(view.getContext(), view, 0);
            C0994 c0994M50638 = c1898.m50638();
            String[] strArr = f60212;
            c0994M50638.add(0, R.id.text0, 0, strArr[0]);
            c0994M50638.add(0, R.id.text1, 1, strArr[1]);
            c0994M50638.add(0, R.id.text2, 2, strArr[2]);
            c0994M50638.add(0, R.id.text3, 3, strArr[3]);
            c0994M50638.add(0, R.id.text4, 4, strArr[4]);
            c0994M50638.add(0, R.id.MT_Protector, 5, strArr[5]);
            c1898.m50636(new C8379(c19799, textView));
            c1898.m50635((InterfaceC1233) c23132);
            c1898Arr[0] = c1898;
            c1898.m50639();
        }
    }

    public C19799(C9010 c9010, List list, int i) {
        super(i, list);
        this.f60216 = new ArrayList();
        this.f60215 = c9010;
    }

    @Override // p067l.C19326
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo32634() {
        return m45020() == 2;
    }

    @Override // p067l.C19326
    /* JADX INFO: renamed from: ۧ */
    public final void mo44062(int i, int i2) {
        if (i != i2) {
            C9010 c9010 = this.f60215;
            if (c9010 != null) {
                c9010.f24450 = -1;
                c9010.f24452 = false;
                c9010.f24455 = null;
            }
            Iterator it = this.f60216.iterator();
            while (it.hasNext()) {
                ((InterfaceC13094) it.next()).mo29958(i, i2);
            }
            if (c9010 == null || !c9010.f24457) {
                return;
            }
            C10351.m23975(c9010.f24448, i2);
        }
    }

    /* JADX INFO: renamed from: ۡ */
    public static int m45020() {
        int i = ApplicationC21448.f67649.getInt("mpm", 0);
        if (i < 0 || i > 3) {
            return 0;
        }
        return i;
    }

    /* JADX INFO: renamed from: ܺ */
    public static int m45024() {
        int i = ApplicationC21448.f67649.getInt("mps", 2);
        if (i < 0 || i >= 6) {
            return 2;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۖ */
    public static int m45019() {
        int iM45020 = m45020() + 1;
        if (iM45020 > 3) {
            iM45020 = 0;
        }
        ApplicationC21448.f67649.edit().mo27875(iM45020, "mpm").apply();
        C22422.f70738.mo4067(Integer.valueOf(iM45020));
        return iM45020;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [l.۬᩸ۜ] */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.۫᩸ۜ] */
    /* JADX WARN: Type inference failed for: r5v0, types: [l.ۙ᩸ۜ] */
    /* JADX INFO: renamed from: ֫ */
    public final View m45026(final AbstractActivityC5549 abstractActivityC5549) {
        final C4376 c4376 = new C4376();
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        final C1898[] c1898Arr = new C1898[1];
        final C23132 c23132 = new C23132(c1898Arr);
        C0990 c0990 = (C0990) viewM12252.findViewById(R.id.MT_Protector);
        c0990.setChecked(ApplicationC21448.f67649.getBoolean("mbp", false));
        c0990.setOnCheckedChangeListener(new C23802(0));
        final TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        textView.setText(f60212[m45024()]);
        viewM12252.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.᩶᩸ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C19799.m45017(this.f68608, textView, c23132, c1898Arr, view);
            }
        });
        final TextView textView2 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        final RunnableC13744 runnableC13744 = new RunnableC13744(abstractActivityC5549, textView2);
        ?? r5 = new InterfaceC14374() { // from class: l.ۙ᩸ۜ
            @Override // p067l.InterfaceC14374
            /* JADX INFO: renamed from: ֫ */
            public final void mo10094() {
                C19799.m45014(abstractActivityC5549, textView2, runnableC13744);
            }
        };
        m45023(abstractActivityC5549, textView2);
        viewM12252.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ۗ᩸ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C19799.m45015(abstractActivityC5549, c4376, c23132, c1898Arr, view);
            }
        });
        final C4694 c4694 = (C4694) viewM12252.findViewById(R.id.MT_Protector);
        AbstractC23964 itemAnimator = c4694.getItemAnimator();
        itemAnimator.m53108(0L);
        itemAnimator.m53115(0L);
        itemAnimator.m53118(0L);
        itemAnimator.m53112(0L);
        final C9720 c9720 = new C9720(this);
        c4694.setAdapter(c9720);
        viewM12252.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC24472(this, new InterfaceC13094() { // from class: l.۬᩸ۜ
            @Override // p067l.InterfaceC13094
            /* JADX INFO: renamed from: ֫ */
            public final void mo29958(int i, int i2) {
                C9720 c9721 = c9720;
                c9721.notifyItemChanged(i);
                c9721.notifyItemChanged(i2);
                C4694 c4695 = c4694;
                if (c4695.m9949() || c4695.m9950()) {
                    return;
                }
                c4695.smoothScrollToPosition(i2);
            }
        }, C22422.f70726, new InterfaceC3326() { // from class: l.۫᩸ۜ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                c9720.notifyItemChanged(this.f41215.mo18261());
            }
        }, r5, runnableC13744, c1898Arr, c4376));
        c4694.scrollToPosition(mo18261());
        return viewM12252;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m45014(AbstractActivityC5549 abstractActivityC5549, TextView textView, Runnable runnable) {
        m45023(abstractActivityC5549, textView);
        m45022(runnable);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45015(final AbstractActivityC5549 abstractActivityC5549, final C4376 c4376, C23132 c23132, C1898[] c1898Arr, View view) {
        if (view.isAttachedToWindow()) {
            C1898 c1898 = new C1898(view.getContext(), view, 0);
            C0994 c0994M50638 = c1898.m50638();
            c0994M50638.add(0, 1, 0, R.string.MT_Protector);
            int i = 0;
            while (i < 5) {
                int i2 = f60213[i];
                int i3 = i + 100;
                i++;
                c0994M50638.add(0, i3, i, abstractActivityC5549.getString(R.string.MT_Protector, Integer.valueOf(i2)));
            }
            c0994M50638.add(0, 200, 6, R.string.MT_Protector);
            c1898.m50636(new InterfaceC1583() { // from class: l.ۤ᩸ۜ
                @Override // p067l.InterfaceC1583
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return C19799.m45018(abstractActivityC5549, c4376, menuItem);
                }
            });
            c1898.m50635((InterfaceC1233) c23132);
            c1898Arr[0] = c1898;
            c1898.m50639();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m45018(AbstractActivityC5549 abstractActivityC5549, C4376 c4376, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            C23092.m51503();
            return true;
        }
        if (itemId != 200) {
            int i = itemId - 100;
            if (i < 0 || i >= 5) {
                return false;
            }
            C23092.m51504(f60213[i]);
            return true;
        }
        C15754 c15754 = new C15754(abstractActivityC5549, c4376);
        c15754.m33344(R.string.MT_Protector);
        c15754.m33362(2);
        c15754.m33365(6);
        c15754.m33351(abstractActivityC5549.getString(R.string.MT_Protector));
        int iM51508 = C23092.m51508();
        if (iM51508 > 0) {
            c15754.m33336((CharSequence) String.valueOf(iM51508));
            c15754.m33367();
        }
        c4376.f9831 = c15754;
        c15754.m33352(true);
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m45023(AbstractActivityC5549 abstractActivityC5549, TextView textView) {
        int iM51508 = C23092.m51508();
        if (iM51508 > 0) {
            textView.setText(abstractActivityC5549.getString(R.string.MT_Protector, Integer.valueOf(iM51508)));
        } else {
            textView.setText(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m45022(Runnable runnable) {
        C7050.m16221().removeCallbacks(runnable);
        long jM51506 = C23092.m51506();
        if (jM51506 <= 0) {
            return;
        }
        long j = jM51506 % 60000;
        C7050.m16221().postDelayed(runnable, j != 0 ? j : 60000L);
    }
}
