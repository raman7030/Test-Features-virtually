package l;

import android.text.SpannableString;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻ᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAOV */
/* JADX INFO: loaded from: classes.dex */
public final class C23866 implements Iterable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f77190 = new ArrayList();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashSet f77191 = new HashSet();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52575(SpannableString spannableString) {
        if (this.f77191.add(spannableString.toString())) {
            this.f77190.add(spannableString);
        }
    }

    public final void clear() {
        this.f77190.clear();
        this.f77191.clear();
    }

    public final void sort(Comparator comparator) {
        Collections.sort(this.f77190, comparator);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f77190.iterator();
    }
}
