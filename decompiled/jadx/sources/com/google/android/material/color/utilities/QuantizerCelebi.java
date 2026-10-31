package com.google.android.material.color.utilities;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class QuantizerCelebi {
    public static Map quantize(int[] iArr, int i) {
        Set setKeySet = new QuantizerWu().quantize(iArr, i).colorToCount.keySet();
        int[] iArr2 = new int[setKeySet.size()];
        Iterator it = setKeySet.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr2[i2] = ((Integer) it.next()).intValue();
            i2++;
        }
        return QuantizerWsmeans.quantize(iArr, iArr2, i);
    }
}
