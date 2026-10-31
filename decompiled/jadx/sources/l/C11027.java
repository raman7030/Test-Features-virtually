package l;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۧܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes3.dex */
public final class C11027 extends WindowInsetsAnimation.Callback {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f33154;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC13414 f33155;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public List f33156;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f33157;

    public C11027(AbstractC13414 abstractC13414) {
        super(abstractC13414.getDispatchMode());
        this.f33154 = new HashMap();
        this.f33155 = abstractC13414;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C17376 m27370(WindowInsetsAnimation windowInsetsAnimation) {
        C17376 c17376 = (C17376) this.f33154.get(windowInsetsAnimation);
        if (c17376 != null) {
            return c17376;
        }
        C17376 c17376M40721 = C17376.m40721(windowInsetsAnimation);
        this.f33154.put(windowInsetsAnimation, c17376M40721);
        return c17376M40721;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f33155.onPrepare(m27370(windowInsetsAnimation));
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C3537 c3537OnStart = this.f33155.onStart(m27370(windowInsetsAnimation), C3537.m10740(bounds));
        c3537OnStart.getClass();
        C1854.m6163();
        return C7770.m20801(c3537OnStart.m10756().m27344(), c3537OnStart.m10757().m27344());
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f33157;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f33157 = arrayList2;
            this.f33156 = C20195.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
                C17376 c17376M27370 = m27370(windowInsetsAnimation);
                c17376M27370.m40723(windowInsetsAnimation.getFraction());
                this.f33157.add(c17376M27370);
            } else {
                return this.f33155.onProgress(C21610.m48814(null, windowInsets), this.f33156).m48823();
            }
        }
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f33155.onEnd(m27370(windowInsetsAnimation));
        this.f33154.remove(windowInsetsAnimation);
    }
}
