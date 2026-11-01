package p067l;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛ᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: L51L */
/* JADX INFO: loaded from: classes3.dex */
public final class C8383 extends AbstractC21283 implements InterfaceC13568, InterfaceC23806 {

    /* JADX INFO: renamed from: ۙ */
    public ArrayList f22491;

    /* JADX INFO: renamed from: ۬ */
    public ArrayList f22492;

    /* JADX INFO: renamed from: ᩶ */
    public final ArrayList f22493;

    /* JADX INFO: renamed from: ᩹ */
    public final C9074 f22495;

    /* JADX INFO: renamed from: ۗ */
    public final Runnable f22490 = new RunnableC15088(this);

    /* JADX INFO: renamed from: ᩸ */
    public final Handler f22494 = new Handler(Looper.getMainLooper());

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        C22486 c22486 = (C22486) abstractC5462;
        C4360 c4360M19547 = m19547(i);
        c22486.m50440();
        c4360M19547.mo5137(c22486);
    }

    public C8383(C9074 c9074) {
        this.f22495 = c9074;
        c9074.m9023(this);
        this.f22491 = new ArrayList();
        this.f22492 = new ArrayList();
        this.f22493 = new ArrayList();
        setHasStableIds(c9074.m20991());
        m19550();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m19550() {
        Iterator it = this.f22491.iterator();
        while (it.hasNext()) {
            ((C4360) it.next()).m9023((C8383) null);
        }
        ArrayList arrayList = new ArrayList(this.f22491.size());
        this.f22491 = arrayList;
        C9074 c9074 = this.f22495;
        m19544(arrayList, c9074);
        this.f22492 = m19543((AbstractC5701) c9074);
        notifyDataSetChanged();
        Iterator it2 = this.f22491.iterator();
        while (it2.hasNext()) {
            ((C4360) it2.next()).getClass();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m19544(ArrayList arrayList, AbstractC5701 abstractC5701) {
        abstractC5701.m12693();
        int iM12694 = abstractC5701.m12694();
        for (int i = 0; i < iM12694; i++) {
            C4360 c4360M12696 = abstractC5701.m12696(i);
            arrayList.add(c4360M12696);
            C12407 c12407 = new C12407(c4360M12696);
            ArrayList arrayList2 = this.f22493;
            if (!arrayList2.contains(c12407)) {
                arrayList2.add(c12407);
            }
            if (c4360M12696 instanceof AbstractC5701) {
                AbstractC5701 abstractC5702 = (AbstractC5701) c4360M12696;
                if (!(abstractC5702 instanceof C9074)) {
                    m19544(arrayList, abstractC5702);
                }
            }
            c4360M12696.m9023(this);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private ArrayList m19543(AbstractC5701 abstractC5701) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iM12694 = abstractC5701.m12694();
        int i = 0;
        for (int i2 = 0; i2 < iM12694; i2++) {
            C4360 c4360M12696 = abstractC5701.m12696(i2);
            if (c4360M12696.m9031()) {
                if (!m19545(abstractC5701) || i < abstractC5701.m12692()) {
                    arrayList.add(c4360M12696);
                } else {
                    arrayList2.add(c4360M12696);
                }
                if (c4360M12696 instanceof AbstractC5701) {
                    AbstractC5701 abstractC5702 = (AbstractC5701) c4360M12696;
                    if (abstractC5702 instanceof C9074) {
                        continue;
                    } else {
                        if (m19545(abstractC5701) && m19545(abstractC5702)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (C4360 c4360 : m19543(abstractC5702)) {
                            if (!m19545(abstractC5701) || i < abstractC5701.m12692()) {
                                arrayList.add(c4360);
                            } else {
                                arrayList2.add(c4360);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        if (m19545(abstractC5701) && i > abstractC5701.m12692()) {
            C17590 c17590 = new C17590(abstractC5701.m9012(), arrayList2, abstractC5701.mo9067());
            c17590.m9028((InterfaceC24296) new C14418(this, abstractC5701));
            arrayList.add(c17590);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m19545(AbstractC5701 abstractC5701) {
        return abstractC5701.m12692() != Integer.MAX_VALUE;
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return this.f22492.size();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4360 m19547(int i) {
        if (i < 0 || i >= this.f22492.size()) {
            return null;
        }
        return (C4360) this.f22492.get(i);
    }

    @Override // p067l.AbstractC21283
    public final long getItemId(int i) {
        if (hasStableIds()) {
            return m19547(i).mo9067();
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19549(C4360 c4360) {
        int iIndexOf = this.f22492.indexOf(c4360);
        if (iIndexOf != -1) {
            notifyItemChanged(iIndexOf, c4360);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19548() {
        Handler handler = this.f22494;
        Runnable runnable = this.f22490;
        handler.removeCallbacks(runnable);
        handler.post(runnable);
    }

    @Override // p067l.AbstractC21283
    public final int getItemViewType(int i) {
        C12407 c12407 = new C12407(m19547(i));
        ArrayList arrayList = this.f22493;
        int iIndexOf = arrayList.indexOf(c12407);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = arrayList.size();
        arrayList.add(c12407);
        return size;
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C12407 c12407 = (C12407) this.f22493.get(i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, C11757.f32856);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = C22622.m50680(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(c12407.f34661, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            int i2 = C1717.f57146;
            viewInflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i3 = c12407.f34662;
            if (i3 != 0) {
                layoutInflaterFrom.inflate(i3, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new C22486(viewInflate);
    }

    @Override // p067l.InterfaceC23806
    /* JADX INFO: renamed from: ֫ */
    public final int mo19546(String str) {
        int size = this.f22492.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(str, ((C4360) this.f22492.get(i)).m9037())) {
                return i;
            }
        }
        return -1;
    }
}
