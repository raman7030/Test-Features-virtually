package l;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8539 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20875 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9586 f67553;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f67556;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ArrayList f67555 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f67552 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f67551 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f67554 = 0;

    public C20875(C9586 c9586, int i) {
        this.f67553 = c9586;
        this.f67556 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m47702(int i) {
        int i2 = this.f67552;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        ArrayList arrayList = this.f67555;
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        C16640 c16640 = (C16640) view.getLayoutParams();
        this.f67552 = this.f67553.f29087.mo7485(view);
        c16640.getClass();
        return this.f67552;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m47699(int i) {
        int i2 = this.f67551;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f67555.size() == 0) {
            return i;
        }
        m47701();
        return this.f67551;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47701() {
        View view = (View) C18566.m43105(this.f67555, 1);
        C16640 c16640 = (C16640) view.getLayoutParams();
        this.f67551 = this.f67553.f29087.mo7473(view);
        c16640.getClass();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m47704() {
        this.f67555.clear();
        this.f67552 = Integer.MIN_VALUE;
        this.f67551 = Integer.MIN_VALUE;
        this.f67554 = 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m47705() {
        boolean z = this.f67553.f29101;
        ArrayList arrayList = this.f67555;
        if (z) {
            return m47700(arrayList.size() - 1, -1);
        }
        return m47700(0, arrayList.size());
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m47706() {
        boolean z = this.f67553.f29101;
        ArrayList arrayList = this.f67555;
        if (z) {
            return m47700(0, arrayList.size());
        }
        return m47700(arrayList.size() - 1, -1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m47700(int i, int i2) {
        C9586 c9586 = this.f67553;
        int iMo7478 = c9586.f29087.mo7478();
        int iMo7476 = c9586.f29087.mo7476();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.f67555.get(i);
            int iMo7485 = c9586.f29087.mo7485(view);
            int iMo7473 = c9586.f29087.mo7473(view);
            boolean z = iMo7485 <= iMo7476;
            boolean z2 = iMo7473 >= iMo7478;
            if (z && z2 && (iMo7485 < iMo7478 || iMo7473 > iMo7476)) {
                return c9586.getPosition(view);
            }
            i += i3;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final View m47703(int i, int i2) {
        C9586 c9586 = this.f67553;
        ArrayList arrayList = this.f67555;
        View view = null;
        if (i2 == -1) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                View view2 = (View) arrayList.get(i3);
                if ((c9586.f29101 && c9586.getPosition(view2) <= i) || ((!c9586.f29101 && c9586.getPosition(view2) >= i) || !view2.hasFocusable())) {
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
            if ((c9586.f29101 && c9586.getPosition(view3) >= i) || ((!c9586.f29101 && c9586.getPosition(view3) <= i) || !view3.hasFocusable())) {
                break;
            }
            size2--;
            view = view3;
        }
        return view;
    }
}
