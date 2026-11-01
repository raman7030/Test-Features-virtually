package p067l;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8539 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22208 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C11479 f70239;

    /* JADX INFO: renamed from: ᩳ */
    public final int f70242;

    /* JADX INFO: renamed from: ܿ */
    public ArrayList f70241 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public int f70238 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ֫ */
    public int f70237 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ܽ */
    public int f70240 = 0;

    public C22208(C11479 c11479, int i) {
        this.f70239 = c11479;
        this.f70242 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m50032(int i) {
        int i2 = this.f70238;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        ArrayList arrayList = this.f70241;
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        C18183 c18183 = (C18183) view.getLayoutParams();
        this.f70238 = this.f70239.f32034.mo9567(view);
        c18183.getClass();
        return this.f70238;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m50029(int i) {
        int i2 = this.f70237;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f70241.size() == 0) {
            return i;
        }
        m50031();
        return this.f70237;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50031() {
        View view = (View) C20013.m45383(this.f70241, 1);
        C18183 c18183 = (C18183) view.getLayoutParams();
        this.f70237 = this.f70239.f32034.mo9555(view);
        c18183.getClass();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m50034() {
        this.f70241.clear();
        this.f70238 = Integer.MIN_VALUE;
        this.f70237 = Integer.MIN_VALUE;
        this.f70240 = 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m50035() {
        boolean z = this.f70239.f32048;
        ArrayList arrayList = this.f70241;
        if (z) {
            return m50030(arrayList.size() - 1, -1);
        }
        return m50030(0, arrayList.size());
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m50036() {
        boolean z = this.f70239.f32048;
        ArrayList arrayList = this.f70241;
        if (z) {
            return m50030(0, arrayList.size());
        }
        return m50030(arrayList.size() - 1, -1);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m50030(int i, int i2) {
        C11479 c11479 = this.f70239;
        int iMo9560 = c11479.f32034.mo9560();
        int iMo9558 = c11479.f32034.mo9558();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.f70241.get(i);
            int iMo9567 = c11479.f32034.mo9567(view);
            int iMo9555 = c11479.f32034.mo9555(view);
            boolean z = iMo9567 <= iMo9558;
            boolean z2 = iMo9555 >= iMo9560;
            if (z && z2 && (iMo9567 < iMo9560 || iMo9555 > iMo9558)) {
                return c11479.getPosition(view);
            }
            i += i3;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final View m50033(int i, int i2) {
        C11479 c11479 = this.f70239;
        ArrayList arrayList = this.f70241;
        View view = null;
        if (i2 == -1) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                View view2 = (View) arrayList.get(i3);
                if ((c11479.f32048 && c11479.getPosition(view2) <= i) || ((!c11479.f32048 && c11479.getPosition(view2) >= i) || !view2.hasFocusable())) {
                    break;
                }
                i3++;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size() - 1;
        while (size2 >= 0) {
            View view3 = (View) arrayList.get(size2);
            if ((c11479.f32048 && c11479.getPosition(view3) >= i) || ((!c11479.f32048 && c11479.getPosition(view3) <= i) || !view3.hasFocusable())) {
                break;
            }
            size2--;
            view = view3;
        }
        return view;
    }
}
