package p067l;

import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7F9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18104 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractC21283 f54046;

    /* JADX INFO: renamed from: ۧ */
    public C3847 f54047;

    /* JADX INFO: renamed from: ܳ */
    public final C1326 f54048;

    /* JADX INFO: renamed from: ܽ */
    public final int[] f54049;

    /* JADX INFO: renamed from: ܿ */
    public long f54050;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f54051;

    public C18104(C1326 c1326, int... iArr) {
        this.f54048 = c1326;
        this.f54049 = iArr;
        c1326.getMenu().findItem(R.id.MT_Protector).setIcon(R.drawable.MT_Protector);
        m41173(false, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41178(AbstractC21283 abstractC21283) {
        this.f54046 = abstractC21283;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41176(C3847 c3847) {
        this.f54047 = c3847;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m41180() {
        return this.f54051;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m41181() {
        m41173(this.f54051, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41174() {
        if (this.f54051) {
            return;
        }
        this.f54051 = true;
        this.f54050 = SystemClock.uptimeMillis();
        AbstractC21283 abstractC21283 = this.f54046;
        if (abstractC21283 != null) {
            abstractC21283.notifyDataSetChanged();
        }
        m41173(true, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41179(boolean z) {
        if (this.f54051) {
            this.f54051 = false;
            this.f54050 = SystemClock.uptimeMillis();
            AbstractC21283 abstractC21283 = this.f54046;
            if (abstractC21283 != null) {
                abstractC21283.notifyDataSetChanged();
            }
            m41173(false, z);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41175(ImageView imageView, boolean z) {
        imageView.animate().cancel();
        if (!z) {
            imageView.setVisibility(8);
            imageView.setAlpha(1.0f);
            return;
        }
        if (SystemClock.uptimeMillis() - this.f54050 >= 100) {
            imageView.setVisibility(this.f54051 ? 0 : 8);
            imageView.setAlpha(1.0f);
        } else if (this.f54051) {
            imageView.setVisibility(0);
            imageView.setAlpha(0.0f);
            imageView.animate().alpha(1.0f).setDuration(200L);
        } else {
            imageView.setVisibility(0);
            imageView.animate().alpha(0.0f).setDuration(200L).withEndAction(new RunnableC8368(6, imageView));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41177(AbstractC5462 abstractC5462) {
        C3847 c3847;
        if (!this.f54051 || (c3847 = this.f54047) == null) {
            return;
        }
        c3847.m7555(abstractC5462);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m41173(boolean z, boolean z2) {
        C1326 c1326 = this.f54048;
        Menu menu = c1326.getMenu();
        MenuItem menuItemFindItem = menu.findItem(R.id.MT_Protector);
        if (menuItemFindItem == null) {
            return;
        }
        ArrayList<MenuItem> arrayList = new ArrayList();
        for (int i : this.f54049) {
            MenuItem menuItemFindItem2 = menu.findItem(i);
            if (menuItemFindItem2 != null) {
                arrayList.add(menuItemFindItem2);
            }
        }
        if (z2) {
            final MenuItem[] menuItemArr = z ? (MenuItem[]) arrayList.toArray(new MenuItem[0]) : new MenuItem[]{menuItemFindItem};
            final RunnableC12711 runnableC12711 = new RunnableC12711(3, this, z ? new MenuItem[]{menuItemFindItem} : (MenuItem[]) arrayList.toArray(new MenuItem[0]));
            ArrayList arrayList2 = new ArrayList();
            for (MenuItem menuItem : menuItemArr) {
                if (menuItem.isVisible()) {
                    View viewFindViewById = c1326.findViewById(menuItem.getItemId());
                    if (viewFindViewById != null) {
                        arrayList2.add(viewFindViewById);
                    } else {
                        menuItem.setVisible(false);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                for (MenuItem menuItem2 : menuItemArr) {
                    menuItem2.setVisible(false);
                }
                runnableC12711.run();
                return;
            }
            int i2 = 0;
            while (i2 < arrayList2.size()) {
                View view = (View) arrayList2.get(i2);
                boolean z3 = i2 == arrayList2.size() - 1;
                view.animate().cancel();
                ViewPropertyAnimator duration = view.animate().alpha(0.0f).setDuration(100L);
                if (z3) {
                    duration.withEndAction(new Runnable() { // from class: l.ۧۢۡ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C18104.m41172(this.f35766, menuItemArr, runnableC12711);
                        }
                    });
                }
                i2++;
            }
            return;
        }
        View viewFindViewById2 = c1326.findViewById(menuItemFindItem.getItemId());
        if (viewFindViewById2 != null) {
            viewFindViewById2.animate().cancel();
            viewFindViewById2.setAlpha(1.0f);
        }
        for (MenuItem menuItem3 : arrayList) {
            View viewFindViewById3 = c1326.findViewById(menuItem3.getItemId());
            if (viewFindViewById3 != null) {
                viewFindViewById3.animate().cancel();
                viewFindViewById3.setAlpha(1.0f);
            }
            menuItem3.setVisible(!z);
        }
        menuItemFindItem.setVisible(z);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m41172(C18104 c18104, MenuItem[] menuItemArr, RunnableC12711 runnableC12711) {
        for (MenuItem menuItem : menuItemArr) {
            menuItem.setVisible(false);
            View viewFindViewById = c18104.f54048.findViewById(menuItem.getItemId());
            if (viewFindViewById != null) {
                viewFindViewById.setAlpha(1.0f);
            }
        }
        runnableC12711.run();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m41171(C18104 c18104, MenuItem[] menuItemArr) {
        for (MenuItem menuItem : menuItemArr) {
            menuItem.setVisible(true);
            View viewFindViewById = c18104.f54048.findViewById(menuItem.getItemId());
            if (viewFindViewById != null) {
                viewFindViewById.animate().cancel();
                viewFindViewById.setAlpha(0.0f);
                viewFindViewById.animate().alpha(1.0f).setDuration(100L);
            }
        }
    }
}
