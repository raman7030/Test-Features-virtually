package l;

import android.view.View;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: S6AR */
/* JADX INFO: loaded from: classes4.dex */
public final class C16921 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        float fM41318 = C17648.m41318((View) obj);
        float fM41319 = C17648.m41318((View) obj2);
        if (fM41318 > fM41319) {
            return -1;
        }
        return fM41318 < fM41319 ? 1 : 0;
    }
}
