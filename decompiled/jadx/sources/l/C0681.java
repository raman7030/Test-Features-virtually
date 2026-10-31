package l;

import android.text.SpannableString;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.֡᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H540 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0681 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public SparseArray f2617 = new SparseArray();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f2618 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2763(SpannableString spannableString, int i) {
        SparseArray sparseArray = this.f2617;
        C19733 c19733 = (C19733) sparseArray.get(i);
        if (c19733 == null) {
            c19733 = new C19733(0);
            sparseArray.put(i, c19733);
        }
        C19027 c19027 = new C19027();
        c19027.f59944 = spannableString;
        if (c19733.f63756 == null) {
            c19733.f63757 = c19027;
            c19733.f63756 = c19027;
        } else {
            c19733.f63757.f59943 = c19027;
            c19733.f63757 = c19027;
        }
        this.f2618++;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m2762() {
        return this.f2618;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList m2765() {
        ArrayList arrayList = new ArrayList(this.f2618);
        m2764(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2764(ArrayList arrayList) {
        SparseArray sparseArray = this.f2617;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = sparseArray.keyAt(i);
        }
        Arrays.sort(iArr);
        for (int i2 = 0; i2 < size; i2++) {
            C19733 c19733 = (C19733) sparseArray.get(iArr[i2]);
            if (c19733 != null) {
                for (C19027 c19027 = c19733.f63756; c19027 != null; c19027 = c19027.f59943) {
                    arrayList.add(c19027.f59944);
                }
            }
        }
    }
}
