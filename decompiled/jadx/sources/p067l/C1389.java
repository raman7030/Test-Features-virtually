package p067l;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۧܰ */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes3.dex */
public final class C1389 extends WindowInsetsAnimation.Callback {

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f36149;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC1507 f36150;

    /* JADX INFO: renamed from: ܽ */
    public List f36151;

    /* JADX INFO: renamed from: ᩳ */
    public ArrayList f36152;

    public C1389(AbstractC1507 abstractC1507) {
        super(abstractC1507.getDispatchMode());
        this.f36149 = new HashMap();
        this.f36150 = abstractC1507;
    }

    /* JADX INFO: renamed from: ֫ */
    private C1704 m29432(WindowInsetsAnimation windowInsetsAnimation) {
        C1704 c1704 = (C1704) this.f36149.get(windowInsetsAnimation);
        if (c1704 != null) {
            return c1704;
        }
        C1704 c1704M42973 = C1704.m42973(windowInsetsAnimation);
        this.f36149.put(windowInsetsAnimation, c1704M42973);
        return c1704M42973;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f36150.onPrepare(m29432(windowInsetsAnimation));
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C1017 c1017OnStart = this.f36150.onStart(m29432(windowInsetsAnimation), C1017.m12736(bounds));
        c1017OnStart.getClass();
        C0934.m8365();
        return C1227.m22782(c1017OnStart.m12737().m29406(), c1017OnStart.m12738().m29406());
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f36152;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f36152 = arrayList2;
            this.f36151 = C21562.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
                C1704 c1704M29432 = m29432(windowInsetsAnimation);
                c1704M29432.m42975(windowInsetsAnimation.getFraction());
                this.f36152.add(c1704M29432);
            } else {
                return this.f36150.onProgress(C1914.m51162(null, windowInsets), this.f36151).m51171();
            }
        }
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f36150.onEnd(m29432(windowInsetsAnimation));
        this.f36149.remove(windowInsetsAnimation);
    }
}
