package com.google.android.material.bottomsheet;

import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import java.util.Iterator;
import java.util.List;
import l.AbstractC13414;
import l.C17376;
import l.C21610;
import l.C3537;

/* JADX INFO: loaded from: classes.dex */
public class InsetsAnimationCallback extends AbstractC13414 {
    public int startTranslationY;
    public int startY;
    public final int[] tmpLocation;
    public final View view;

    public InsetsAnimationCallback(View view) {
        super(0);
        this.tmpLocation = new int[2];
        this.view = view;
    }

    @Override // l.AbstractC13414
    public void onPrepare(C17376 c17376) {
        this.view.getLocationOnScreen(this.tmpLocation);
        this.startY = this.tmpLocation[1];
    }

    @Override // l.AbstractC13414
    public C3537 onStart(C17376 c17376, C3537 c3537) {
        this.view.getLocationOnScreen(this.tmpLocation);
        int i = this.startY - this.tmpLocation[1];
        this.startTranslationY = i;
        this.view.setTranslationY(i);
        return c3537;
    }

    @Override // l.AbstractC13414
    public C21610 onProgress(C21610 c21610, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17376 c17376 = (C17376) it.next();
            if ((c17376.m40725() & 8) != 0) {
                this.view.setTranslationY(AnimationUtils.lerp(this.startTranslationY, 0, c17376.m40724()));
                break;
            }
        }
        return c21610;
    }

    @Override // l.AbstractC13414
    public void onEnd(C17376 c17376) {
        this.view.setTranslationY(0.0f);
    }
}
