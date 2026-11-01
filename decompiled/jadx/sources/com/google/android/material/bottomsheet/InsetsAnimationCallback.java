package com.google.android.material.bottomsheet;

import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import java.util.Iterator;
import java.util.List;
import p067l.AbstractC1507;
import p067l.C1017;
import p067l.C1704;
import p067l.C1914;

/* JADX INFO: loaded from: classes.dex */
public class InsetsAnimationCallback extends AbstractC1507 {
    public int startTranslationY;
    public int startY;
    public final int[] tmpLocation;
    public final View view;

    public InsetsAnimationCallback(View view) {
        super(0);
        this.tmpLocation = new int[2];
        this.view = view;
    }

    @Override // p067l.AbstractC1507
    public void onPrepare(C1704 c1704) {
        this.view.getLocationOnScreen(this.tmpLocation);
        this.startY = this.tmpLocation[1];
    }

    @Override // p067l.AbstractC1507
    public C1017 onStart(C1704 c1704, C1017 c1017) {
        this.view.getLocationOnScreen(this.tmpLocation);
        int i = this.startY - this.tmpLocation[1];
        this.startTranslationY = i;
        this.view.setTranslationY(i);
        return c1017;
    }

    @Override // p067l.AbstractC1507
    public C1914 onProgress(C1914 c1914, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1704 c1704 = (C1704) it.next();
            if ((c1704.m42977() & 8) != 0) {
                this.view.setTranslationY(AnimationUtils.lerp(this.startTranslationY, 0, c1704.m42976()));
                break;
            }
        }
        return c1914;
    }

    @Override // p067l.AbstractC1507
    public void onEnd(C1704 c1704) {
        this.view.setTranslationY(0.0f);
    }
}
