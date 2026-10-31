package l;

import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7F9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16557 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC19902 f50868;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C1556 f50869;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9762 f50870;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f50871;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f50872;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f50873;

    public C16557(C9762 c9762, int... iArr) {
        this.f50870 = c9762;
        this.f50871 = iArr;
        c9762.getMenu().findItem(R.id.MT_Protector).setIcon(R.drawable.MT_Protector);
        m38947(false, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38952(AbstractC19902 abstractC19902) {
        this.f50868 = abstractC19902;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38950(C1556 c1556) {
        this.f50869 = c1556;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m38954() {
        return this.f50873;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m38955() {
        m38947(this.f50873, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38948() {
        if (this.f50873) {
            return;
        }
        this.f50873 = true;
        this.f50872 = SystemClock.uptimeMillis();
        AbstractC19902 abstractC19902 = this.f50868;
        if (abstractC19902 != null) {
            abstractC19902.notifyDataSetChanged();
        }
        m38947(true, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38953(boolean z) {
        if (this.f50873) {
            this.f50873 = false;
            this.f50872 = SystemClock.uptimeMillis();
            AbstractC19902 abstractC19902 = this.f50868;
            if (abstractC19902 != null) {
                abstractC19902.notifyDataSetChanged();
            }
            m38947(false, z);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38949(ImageView imageView, boolean z) {
        imageView.animate().cancel();
        if (!z) {
            imageView.setVisibility(8);
            imageView.setAlpha(1.0f);
            return;
        }
        if (SystemClock.uptimeMillis() - this.f50872 >= 100) {
            imageView.setVisibility(this.f50873 ? 0 : 8);
            imageView.setAlpha(1.0f);
        } else if (this.f50873) {
            imageView.setVisibility(0);
            imageView.setAlpha(0.0f);
            imageView.animate().alpha(1.0f).setDuration(200L);
        } else {
            imageView.setVisibility(0);
            imageView.animate().alpha(0.0f).setDuration(200L).withEndAction(new RunnableC6312(6, imageView));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38951(AbstractC3255 abstractC3255) {
        C1556 c1556;
        if (!this.f50873 || (c1556 = this.f50869) == null) {
            return;
        }
        c1556.m5326(abstractC3255);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38947(boolean z, boolean z2) {
        C9762 c9762 = this.f50870;
        Menu menu = c9762.getMenu();
        MenuItem menuItemFindItem = menu.findItem(R.id.MT_Protector);
        if (menuItemFindItem == null) {
            return;
        }
        ArrayList<MenuItem> arrayList = new ArrayList();
        for (int i : this.f50871) {
            MenuItem menuItemFindItem2 = menu.findItem(i);
            if (menuItemFindItem2 != null) {
                arrayList.add(menuItemFindItem2);
            }
        }
        if (z2) {
            final MenuItem[] menuItemArr = z ? (MenuItem[]) arrayList.toArray(new MenuItem[0]) : new MenuItem[]{menuItemFindItem};
            final RunnableC10882 runnableC10882 = new RunnableC10882(3, this, z ? new MenuItem[]{menuItemFindItem} : (MenuItem[]) arrayList.toArray(new MenuItem[0]));
            ArrayList arrayList2 = new ArrayList();
            for (MenuItem menuItem : menuItemArr) {
                if (menuItem.isVisible()) {
                    View viewFindViewById = c9762.findViewById(menuItem.getItemId());
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
                runnableC10882.run();
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
                            C16557.m38946(this.f32788, menuItemArr, runnableC10882);
                        }
                    });
                }
                i2++;
            }
            return;
        }
        View viewFindViewById2 = c9762.findViewById(menuItemFindItem.getItemId());
        if (viewFindViewById2 != null) {
            viewFindViewById2.animate().cancel();
            viewFindViewById2.setAlpha(1.0f);
        }
        for (MenuItem menuItem3 : arrayList) {
            View viewFindViewById3 = c9762.findViewById(menuItem3.getItemId());
            if (viewFindViewById3 != null) {
                viewFindViewById3.animate().cancel();
                viewFindViewById3.setAlpha(1.0f);
            }
            menuItem3.setVisible(!z);
        }
        menuItemFindItem.setVisible(z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38946(C16557 c16557, MenuItem[] menuItemArr, RunnableC10882 runnableC10882) {
        for (MenuItem menuItem : menuItemArr) {
            menuItem.setVisible(false);
            View viewFindViewById = c16557.f50870.findViewById(menuItem.getItemId());
            if (viewFindViewById != null) {
                viewFindViewById.setAlpha(1.0f);
            }
        }
        runnableC10882.run();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38945(C16557 c16557, MenuItem[] menuItemArr) {
        for (MenuItem menuItem : menuItemArr) {
            menuItem.setVisible(true);
            View viewFindViewById = c16557.f50870.findViewById(menuItem.getItemId());
            if (viewFindViewById != null) {
                viewFindViewById.animate().cancel();
                viewFindViewById.setAlpha(0.0f);
                viewFindViewById.animate().alpha(1.0f).setDuration(100L);
            }
        }
    }
}
