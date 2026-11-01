package p067l;

import android.text.SpannableString;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻ᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAOV */
/* JADX INFO: loaded from: classes.dex */
public final class C25051 implements Iterable {

    /* JADX INFO: renamed from: ᩸ */
    public final ArrayList f79940 = new ArrayList();

    /* JADX INFO: renamed from: ᩹ */
    public final HashSet f79941 = new HashSet();

    /* JADX INFO: renamed from: ֫ */
    public final void m54984(SpannableString spannableString) {
        if (this.f79941.add(spannableString.toString())) {
            this.f79940.add(spannableString);
        }
    }

    public final void clear() {
        this.f79940.clear();
        this.f79941.clear();
    }

    public final void sort(Comparator comparator) {
        Collections.sort(this.f79940, comparator);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f79940.iterator();
    }
}
