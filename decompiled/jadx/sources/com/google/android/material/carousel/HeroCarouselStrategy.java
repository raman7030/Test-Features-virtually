package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import l.C14543;
import l.C1814;

/* JADX INFO: loaded from: classes.dex */
public class HeroCarouselStrategy extends CarouselStrategy {
    public int keylineCount = 0;
    public static final int[] SMALL_COUNTS = {1};
    public static final int[] MEDIUM_COUNTS = {0, 1};

    @Override // com.google.android.material.carousel.CarouselStrategy
    public KeylineState onFirstChildMeasuredWithMargins(Carousel carousel, View view) {
        int[] iArrDoubleCounts;
        int i;
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        C14543 c14543 = (C14543) view.getLayoutParams();
        float f = ((ViewGroup.MarginLayoutParams) c14543).topMargin + ((ViewGroup.MarginLayoutParams) c14543).bottomMargin;
        float measuredWidth = view.getMeasuredWidth() * 2;
        if (carousel.isHorizontal()) {
            f = ((ViewGroup.MarginLayoutParams) c14543).leftMargin + ((ViewGroup.MarginLayoutParams) c14543).rightMargin;
            measuredWidth = view.getMeasuredHeight() * 2;
        }
        float smallItemSizeMin = getSmallItemSizeMin() + f;
        float fMax = Math.max(getSmallItemSizeMax() + f, smallItemSizeMin);
        float f2 = containerHeight;
        float fMin = Math.min(measuredWidth + f, f2);
        float fM6035 = C1814.m6035((measuredWidth / 3.0f) + f, smallItemSizeMin + f, fMax + f);
        float f3 = (fMin + fM6035) / 2.0f;
        int[] iArr = SMALL_COUNTS;
        int[] iArr2 = f2 < 2.0f * smallItemSizeMin ? new int[]{0} : iArr;
        int iMax = (int) Math.max(1.0d, Math.floor((f2 - (CarouselStrategyHelper.maxValue(iArr) * fMax)) / fMin));
        int iCeil = (((int) Math.ceil(f2 / fMin)) - iMax) + 1;
        int[] iArr3 = new int[iCeil];
        for (int i2 = 0; i2 < iCeil; i2++) {
            iArr3[i2] = iMax + i2;
        }
        int i3 = carousel.getCarouselAlignment() == 1 ? 1 : 0;
        int[] iArrDoubleCounts2 = i3 != 0 ? CarouselStrategy.doubleCounts(iArr2) : iArr2;
        if (i3 != 0) {
            iArrDoubleCounts = CarouselStrategy.doubleCounts(MEDIUM_COUNTS);
        } else {
            iArrDoubleCounts = MEDIUM_COUNTS;
        }
        Arrangement arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f2, fM6035, smallItemSizeMin, fMax, iArrDoubleCounts2, f3, iArrDoubleCounts, fMin, iArr3);
        this.keylineCount = arrangementFindLowestCostArrangement.getItemCount();
        if (arrangementFindLowestCostArrangement.getItemCount() > carousel.getItemCount()) {
            arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f2, fM6035, smallItemSizeMin, fMax, iArr2, f3, MEDIUM_COUNTS, fMin, iArr3);
            i = 0;
        } else {
            i = i3;
        }
        return CarouselStrategyHelper.createKeylineState(view.getContext(), f, f2, arrangementFindLowestCostArrangement, i);
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean shouldRefreshKeylineState(Carousel carousel, int i) {
        if (carousel.getCarouselAlignment() == 1) {
            return (i < this.keylineCount && carousel.getItemCount() >= this.keylineCount) || (i >= this.keylineCount && carousel.getItemCount() < this.keylineCount);
        }
        return false;
    }
}
