package l;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37CJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C16723 extends AbstractViewOnLongClickListenerC14606 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final TextView f51354;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C1907 f51355;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractC17429 f51356;

    public C16723(AbstractActivityC3346 abstractActivityC3346, View view) {
        super(abstractActivityC3346, view);
        this.f51354 = (TextView) view.findViewById(R.id.MT_Protector);
    }

    @Override // l.AbstractViewOnLongClickListenerC14606
    /* JADX INFO: renamed from: ֫ */
    public final void mo32019(Resources.Theme theme) {
        super.mo32019(theme);
        this.f51354.setTextColor(C21943.f70269);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39361(AbstractC17429 abstractC17429, C1907 c1907) {
        this.f51356 = abstractC17429;
        this.f51355 = c1907;
    }

    @Override // l.AbstractViewOnLongClickListenerC14606
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo29330() {
        C1907 c1907 = this.f51355;
        return (c1907 == null || c1907.m6260()) ? false : true;
    }

    @Override // l.AbstractViewOnLongClickListenerC14606
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo29331(AbstractC3255 abstractC3255) {
        C1907 c1907;
        AbstractC17429 abstractC17429M10144;
        C1907 c1908;
        if (this.f51356 == null || (c1907 = this.f51355) == null || c1907.m6260()) {
            return false;
        }
        C3318 c3318 = this.f51356.f37526;
        int bindingAdapterPosition = getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        AbstractC17429 abstractC17429 = this.f51356;
        Integer numValueOf = null;
        if (abstractC3255 instanceof C16723) {
            C16723 c16723 = (C16723) abstractC3255;
            int bindingAdapterPosition2 = c16723.getBindingAdapterPosition();
            if (bindingAdapterPosition2 == -1 || (abstractC17429M10144 = c16723.f51356) == null || (c1908 = c16723.f51355) == null) {
                return false;
            }
            if (abstractC17429 == abstractC17429M10144) {
                C2096.m6947(this.f51355.f6429.f11356, c16723.f51356.f53287, c1908.m6260() ? null : Integer.valueOf(c16723.f51355.f6429.f11356));
                abstractC17429.m40770();
                ArrayList arrayList = abstractC17429.f37525;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C1907 c1909 = (C1907) arrayList.get(i);
                    if (!c1909.m6260() && c1909.f6429.f11356 == this.f51355.f6429.f11356) {
                        this.f51355 = c1909;
                        break;
                    }
                }
                c3318.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
                return true;
            }
            if (!c1908.m6260()) {
                numValueOf = Integer.valueOf(c16723.f51355.f6429.f11356);
            }
        } else {
            if (!(abstractC3255 instanceof C13195)) {
                return false;
            }
            C13195 c13195 = (C13195) abstractC3255;
            AbstractViewOnClickListenerC12490 abstractViewOnClickListenerC12490 = c13195.f39457;
            if (!(abstractViewOnClickListenerC12490 instanceof C5435)) {
                return false;
            }
            C5435 c5435 = (C5435) abstractViewOnClickListenerC12490;
            if (c13195.getBindingAdapterPosition() == -1) {
                return false;
            }
            C11080 c11080M27492 = C11080.m27492(c5435.f53287, C2096.m6965(), (this.itemView.getHeight() / 2.0f) + this.itemView.getY(), (c13195.itemView.getHeight() / 2.0f) + c13195.itemView.getY());
            abstractC17429M10144 = c3318.m10144(c11080M27492.f33269);
            if (abstractC17429M10144 == null || abstractC17429M10144 == abstractC17429) {
                return false;
            }
            if (c11080M27492.f33268) {
                Iterator it = abstractC17429M10144.f37525.iterator();
                while (it.hasNext()) {
                    C1907 c19010 = (C1907) ((AbstractViewOnClickListenerC1201) it.next());
                    if (!c19010.m6260()) {
                        numValueOf = Integer.valueOf(c19010.f6429.f11356);
                        break;
                    }
                }
            }
        }
        boolean z = abstractC17429M10144.f37522;
        C3318 c3319 = abstractC17429M10144.f37526;
        ArrayList arrayList2 = abstractC17429M10144.f37525;
        if (!z) {
            return false;
        }
        int iM10143 = (arrayList2.size() == 1 && ((C1907) arrayList2.get(0)).m6260()) ? c3319.m10143(abstractC17429M10144) + 1 : -1;
        C2096.m6947(this.f51355.f6429.f11356, abstractC17429M10144.f53287, numValueOf);
        abstractC17429.m40770();
        ArrayList arrayList3 = abstractC17429.f37525;
        abstractC17429M10144.m40770();
        int size2 = arrayList2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                i2 = -1;
                break;
            }
            C1907 c19011 = (C1907) arrayList2.get(i2);
            if (!c19011.m6260() && c19011.f6429.f11356 == this.f51355.f6429.f11356) {
                this.f51356 = abstractC17429M10144;
                this.f51355 = c19011;
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            c3318.m10156();
            return true;
        }
        C18135 c18135M42251 = C18135.m42251(bindingAdapterPosition, iM10143, c3319.m10143(abstractC17429M10144) + i2 + 1, (arrayList3.size() == 1 && ((C1907) arrayList3.get(0)).m6260()) ? abstractC17429.f37526.m10143(abstractC17429) + 1 : -1);
        boolean z2 = c18135M42251.f56419;
        if (z2) {
            c3318.m10149(this);
        }
        int i3 = c18135M42251.f56421;
        if (i3 != -1) {
            c3318.notifyItemRemoved(i3);
        }
        int i4 = c18135M42251.f56420;
        int i5 = c18135M42251.f56422;
        if (i4 != i5) {
            c3318.notifyItemMoved(i4, i5);
        } else {
            int i6 = c18135M42251.f56417;
            if (i6 != -1) {
                c3318.notifyItemChanged(i6);
            }
        }
        int i7 = c18135M42251.f56418;
        if (i7 != -1) {
            c3318.notifyItemInserted(i7);
        }
        if (z2) {
            c3318.m10153(this);
        }
        return true;
    }

    @Override // l.AbstractViewOnLongClickListenerC14606, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C1907 c1907;
        AbstractC17429 abstractC17429 = this.f51356;
        if (abstractC17429 == null || abstractC17429.f37526.m10155() || (c1907 = this.f51355) == null || c1907.m6260()) {
            return false;
        }
        AbstractActivityC3346 abstractActivityC3346 = this.f44705;
        View view2 = this.f44702;
        C21282 c21282 = new C21282(abstractActivityC3346, view2, 8388611);
        C7716.m20669(view2);
        c21282.m48306();
        C3060 c3060M48304 = c21282.m48304();
        c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c21282.m48302(new C13970(this));
        c21282.m48305();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39360(C16723 c16723, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            c16723.f51355.f6429.mo6367(c16723.f51356.f34527);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            final AbstractC17429 abstractC17429 = c16723.f51356;
            abstractC17429.getClass();
            final C1907 c1907 = c16723.f51355;
            if (c1907 == null || c1907.m6260()) {
                return;
            }
            C19258 c19258BuildDialog = abstractC17429.f34527.buildDialog();
            c19258BuildDialog.m44433(R.string.MT_Protector);
            c19258BuildDialog.m44424(C4925.m14306(R.string.MT_Protector, c16723.f44703.getText().toString()));
            c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩺۠ܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    int i2;
                    AbstractC17429 abstractC174210 = abstractC17429;
                    C1907 c1908 = c1907;
                    abstractC174210.getClass();
                    int i3 = c1908.f6429.f11356;
                    synchronized (C12749.class) {
                        Iterator it = C12749.m31046().iterator();
                        i2 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i2 = -1;
                                break;
                            } else if (((AbstractC3577) it.next()).f11356 == i3) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                    if (i2 == -1) {
                        abstractC174210.f37526.m10156();
                        return;
                    }
                    C12749.m31033(i2);
                    C2096.m6969();
                    abstractC174210.m40770();
                    abstractC174210.f37526.m10156();
                }
            });
            c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258BuildDialog.m44438();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            c16723.f51356.f37526.m10145();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            AbstractC17429 abstractC174210 = c16723.f51356;
            C1907 c1908 = c16723.f51355;
            abstractC174210.getClass();
            AbstractC3577 abstractC3577 = c1908.f6429;
            C3535 c3535 = new C3535(abstractC174210.f34527);
            c3535.m10732(abstractC3577.getName());
            C19883 icon = abstractC3577.getIcon();
            AbstractC21294 abstractC21294 = C19883.f64184;
            c3535.m10733(new C12002(icon, 0));
            c3535.m10737("open-ns");
            c3535.m10730();
            c3535.m10731(abstractC3577.f11356);
            c3535.m10736();
        }
    }
}
