package com.google.android.material.carousel;

import com.google.android.material.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p067l.C0932;
import p067l.C20013;
import p067l.C21562;
import p067l.C9179;

/* JADX INFO: loaded from: classes.dex */
public class KeylineStateList {
    public static final int NO_INDEX = -1;
    public final KeylineState defaultState;
    public final float endShiftRange;
    public final List endStateSteps;
    public final float[] endStateStepsInterpolationPoints;
    public final float startShiftRange;
    public final List startStateSteps;
    public final float[] startStateStepsInterpolationPoints;

    public KeylineStateList(KeylineState keylineState, List list, List list2) {
        this.defaultState = keylineState;
        this.startStateSteps = C21562.unmodifiableList(list);
        this.endStateSteps = C21562.unmodifiableList(list2);
        float f = ((KeylineState) C9179.m21131(1, list)).getFirstKeyline().loc - keylineState.getFirstKeyline().loc;
        this.startShiftRange = f;
        float f2 = keylineState.getLastKeyline().loc - ((KeylineState) C9179.m21131(1, list2)).getLastKeyline().loc;
        this.endShiftRange = f2;
        this.startStateStepsInterpolationPoints = getStateStepInterpolationPoints(f, list, true);
        this.endStateStepsInterpolationPoints = getStateStepInterpolationPoints(f2, list2, false);
    }

    public static KeylineStateList from(Carousel carousel, KeylineState keylineState, float f, float f2, float f3) {
        return new KeylineStateList(keylineState, getStateStepsStart(carousel, keylineState, f, f2), getStateStepsEnd(carousel, keylineState, f, f3));
    }

    public KeylineState getDefaultState() {
        return this.defaultState;
    }

    public KeylineState getStartState() {
        return (KeylineState) C9179.m21131(1, this.startStateSteps);
    }

    public KeylineState getEndState() {
        return (KeylineState) C9179.m21131(1, this.endStateSteps);
    }

    public KeylineState getShiftedState(float f, float f2, float f3) {
        return getShiftedState(f, f2, f3, false);
    }

    public KeylineState getShiftedState(float f, float f2, float f3, boolean z) {
        float fLerp;
        List list;
        float[] fArr;
        float f4 = this.startShiftRange + f2;
        float f5 = f3 - this.endShiftRange;
        float f6 = getStartState().getFirstFocalKeyline().leftOrTopPaddingShift;
        float f7 = getEndState().getLastFocalKeyline().rightOrBottomPaddingShift;
        if (this.startShiftRange == f6) {
            f4 += f6;
        }
        if (this.endShiftRange == f7) {
            f5 -= f7;
        }
        if (f < f4) {
            fLerp = AnimationUtils.lerp(1.0f, 0.0f, f2, f4, f);
            list = this.startStateSteps;
            fArr = this.startStateStepsInterpolationPoints;
        } else if (f > f5) {
            fLerp = AnimationUtils.lerp(0.0f, 1.0f, f5, f3, f);
            list = this.endStateSteps;
            fArr = this.endStateStepsInterpolationPoints;
        } else {
            return this.defaultState;
        }
        if (z) {
            return closestStateStepFromInterpolation(list, fLerp, fArr);
        }
        return lerp(list, fLerp, fArr);
    }

    public static KeylineState lerp(List list, float f, float[] fArr) {
        float[] stateStepsRange = getStateStepsRange(list, f, fArr);
        return KeylineState.lerp((KeylineState) list.get((int) stateStepsRange[1]), (KeylineState) list.get((int) stateStepsRange[2]), stateStepsRange[0]);
    }

    public static float[] getStateStepsRange(List list, float f, float[] fArr) {
        int size = list.size();
        float f2 = fArr[0];
        int i = 1;
        while (i < size) {
            float f3 = fArr[i];
            if (f <= f3) {
                return new float[]{AnimationUtils.lerp(0.0f, 1.0f, f2, f3, f), i - 1, i};
            }
            i++;
            f2 = f3;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private KeylineState closestStateStepFromInterpolation(List list, float f, float[] fArr) {
        float[] stateStepsRange = getStateStepsRange(list, f, fArr);
        if (stateStepsRange[0] >= 0.5f) {
            return (KeylineState) list.get((int) stateStepsRange[2]);
        }
        return (KeylineState) list.get((int) stateStepsRange[1]);
    }

    public static float[] getStateStepInterpolationPoints(float f, List list, boolean z) {
        float f2;
        int size = list.size();
        float[] fArr = new float[size];
        int i = 1;
        while (i < size) {
            int i2 = i - 1;
            KeylineState keylineState = (KeylineState) list.get(i2);
            KeylineState keylineState2 = (KeylineState) list.get(i);
            if (z) {
                f2 = keylineState2.getFirstKeyline().loc - keylineState.getFirstKeyline().loc;
            } else {
                f2 = keylineState.getLastKeyline().loc - keylineState2.getLastKeyline().loc;
            }
            fArr[i] = i == size + (-1) ? 1.0f : fArr[i2] + (f2 / f);
            i++;
        }
        return fArr;
    }

    public static boolean isFirstFocalItemAtLeftOfContainer(KeylineState keylineState) {
        return keylineState.getFirstFocalKeyline().locOffset - (keylineState.getFirstFocalKeyline().maskedItemSize / 2.0f) >= 0.0f && keylineState.getFirstFocalKeyline() == keylineState.getFirstNonAnchorKeyline();
    }

    public static boolean isLastFocalItemVisibleAtRightOfContainer(Carousel carousel, KeylineState keylineState) {
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        return (keylineState.getLastFocalKeyline().maskedItemSize / 2.0f) + keylineState.getLastFocalKeyline().locOffset <= ((float) containerHeight) && keylineState.getLastFocalKeyline() == keylineState.getLastNonAnchorKeyline();
    }

    public static KeylineState shiftKeylineStateForPadding(KeylineState keylineState, float f, float f2, boolean z, float f3) {
        ArrayList arrayList = new ArrayList(keylineState.getKeylines());
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.getItemSize(), f2);
        float numberOfNonAnchorKeylines = f / keylineState.getNumberOfNonAnchorKeylines();
        float f4 = z ? f : 0.0f;
        int i = 0;
        while (i < arrayList.size()) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i);
            if (keyline.isAnchor) {
                builder.addKeyline(keyline.locOffset, keyline.mask, keyline.maskedItemSize, false, true, keyline.cutoff);
            } else {
                boolean z2 = i >= keylineState.getFirstFocalKeylineIndex() && i <= keylineState.getLastFocalKeylineIndex();
                float f5 = keyline.maskedItemSize - numberOfNonAnchorKeylines;
                float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(f5, keylineState.getItemSize(), f3);
                float f6 = (f5 / 2.0f) + f4;
                float f7 = f6 - keyline.locOffset;
                builder.addKeyline(f6, childMaskPercentage, f5, z2, false, keyline.cutoff, z ? f7 : 0.0f, z ? 0.0f : f7);
                f4 += f5;
            }
            i++;
        }
        return builder.build();
    }

    public static List getStateStepsStart(Carousel carousel, KeylineState keylineState, float f, float f2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineState);
        int iFindFirstNonAnchorKeylineIndex = findFirstNonAnchorKeylineIndex(keylineState);
        float containerWidth = carousel.isHorizontal() ? carousel.getContainerWidth() : carousel.getContainerHeight();
        int i = 1;
        if (!isFirstFocalItemAtLeftOfContainer(keylineState) && iFindFirstNonAnchorKeylineIndex != -1) {
            int firstFocalKeylineIndex = keylineState.getFirstFocalKeylineIndex() - iFindFirstNonAnchorKeylineIndex;
            float f3 = keylineState.getFirstKeyline().locOffset - (keylineState.getFirstKeyline().maskedItemSize / 2.0f);
            if (firstFocalKeylineIndex <= 0 && keylineState.getFirstFocalKeyline().cutoff > 0.0f) {
                arrayList.add(shiftKeylinesAndCreateKeylineState(keylineState, f3 + keylineState.getFirstFocalKeyline().cutoff, containerWidth));
                return arrayList;
            }
            float f4 = 0.0f;
            int i2 = 0;
            while (i2 < firstFocalKeylineIndex) {
                KeylineState keylineState2 = (KeylineState) C20013.m45383(arrayList, i);
                int i3 = iFindFirstNonAnchorKeylineIndex + i2;
                int size = keylineState.getKeylines().size() - i;
                float f5 = f4 + ((KeylineState.Keyline) keylineState.getKeylines().get(i3)).cutoff;
                int i4 = i3 - i;
                int i5 = i2;
                KeylineState keylineStateMoveKeylineAndCreateKeylineState = moveKeylineAndCreateKeylineState(keylineState2, iFindFirstNonAnchorKeylineIndex, i4 >= 0 ? findFirstIndexAfterLastFocalKeylineWithMask(keylineState2, ((KeylineState.Keyline) keylineState.getKeylines().get(i4)).mask) - 1 : size, f3 + f5, (keylineState.getFirstFocalKeylineIndex() - i2) - 1, (keylineState.getLastFocalKeylineIndex() - i2) - 1, containerWidth);
                if (i5 == firstFocalKeylineIndex - 1 && f2 > 0.0f) {
                    keylineStateMoveKeylineAndCreateKeylineState = shiftKeylineStateForPadding(keylineStateMoveKeylineAndCreateKeylineState, f2, containerWidth, true, f);
                }
                arrayList.add(keylineStateMoveKeylineAndCreateKeylineState);
                i2 = i5 + 1;
                f4 = f5;
                i = 1;
            }
        } else if (f2 > 0.0f) {
            arrayList.add(shiftKeylineStateForPadding(keylineState, f2, containerWidth, true, f));
        }
        return arrayList;
    }

    public static List getStateStepsEnd(Carousel carousel, KeylineState keylineState, float f, float f2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineState);
        int iFindLastNonAnchorKeylineIndex = findLastNonAnchorKeylineIndex(keylineState);
        float containerWidth = carousel.isHorizontal() ? carousel.getContainerWidth() : carousel.getContainerHeight();
        if (!isLastFocalItemVisibleAtRightOfContainer(carousel, keylineState) && iFindLastNonAnchorKeylineIndex != -1) {
            int lastFocalKeylineIndex = iFindLastNonAnchorKeylineIndex - keylineState.getLastFocalKeylineIndex();
            float f3 = keylineState.getFirstKeyline().locOffset - (keylineState.getFirstKeyline().maskedItemSize / 2.0f);
            if (lastFocalKeylineIndex <= 0 && keylineState.getLastFocalKeyline().cutoff > 0.0f) {
                arrayList.add(shiftKeylinesAndCreateKeylineState(keylineState, f3 - keylineState.getLastFocalKeyline().cutoff, containerWidth));
                return arrayList;
            }
            float f4 = 0.0f;
            int i = 0;
            while (i < lastFocalKeylineIndex) {
                KeylineState keylineState2 = (KeylineState) C20013.m45383(arrayList, 1);
                int i2 = iFindLastNonAnchorKeylineIndex - i;
                float f5 = f4 + ((KeylineState.Keyline) keylineState.getKeylines().get(i2)).cutoff;
                int i3 = i2 + 1;
                int i4 = i;
                KeylineState keylineStateMoveKeylineAndCreateKeylineState = moveKeylineAndCreateKeylineState(keylineState2, iFindLastNonAnchorKeylineIndex, i3 < keylineState.getKeylines().size() ? findLastIndexBeforeFirstFocalKeylineWithMask(keylineState2, ((KeylineState.Keyline) keylineState.getKeylines().get(i3)).mask) + 1 : 0, f3 - f5, keylineState.getFirstFocalKeylineIndex() + i + 1, keylineState.getLastFocalKeylineIndex() + i + 1, containerWidth);
                if (i4 == lastFocalKeylineIndex - 1 && f2 > 0.0f) {
                    keylineStateMoveKeylineAndCreateKeylineState = shiftKeylineStateForPadding(keylineStateMoveKeylineAndCreateKeylineState, f2, containerWidth, false, f);
                }
                arrayList.add(keylineStateMoveKeylineAndCreateKeylineState);
                i = i4 + 1;
                f4 = f5;
            }
        } else if (f2 > 0.0f) {
            arrayList.add(shiftKeylineStateForPadding(keylineState, f2, containerWidth, false, f));
        }
        return arrayList;
    }

    public static KeylineState shiftKeylinesAndCreateKeylineState(KeylineState keylineState, float f, float f2) {
        return moveKeylineAndCreateKeylineState(keylineState, 0, 0, f, keylineState.getFirstFocalKeylineIndex(), keylineState.getLastFocalKeylineIndex(), f2);
    }

    public static KeylineState moveKeylineAndCreateKeylineState(KeylineState keylineState, int i, int i2, float f, int i3, int i4, float f2) {
        ArrayList arrayList = new ArrayList(keylineState.getKeylines());
        arrayList.add(i2, (KeylineState.Keyline) arrayList.remove(i));
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.getItemSize(), f2);
        int i5 = 0;
        while (i5 < arrayList.size()) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i5);
            float f3 = keyline.maskedItemSize;
            builder.addKeyline((f3 / 2.0f) + f, keyline.mask, f3, i5 >= i3 && i5 <= i4, keyline.isAnchor, keyline.cutoff);
            f += keyline.maskedItemSize;
            i5++;
        }
        return builder.build();
    }

    public static int findFirstIndexAfterLastFocalKeylineWithMask(KeylineState keylineState, float f) {
        for (int lastFocalKeylineIndex = keylineState.getLastFocalKeylineIndex(); lastFocalKeylineIndex < keylineState.getKeylines().size(); lastFocalKeylineIndex++) {
            if (f == ((KeylineState.Keyline) keylineState.getKeylines().get(lastFocalKeylineIndex)).mask) {
                return lastFocalKeylineIndex;
            }
        }
        return keylineState.getKeylines().size() - 1;
    }

    public static int findLastIndexBeforeFirstFocalKeylineWithMask(KeylineState keylineState, float f) {
        int firstFocalKeylineIndex = keylineState.getFirstFocalKeylineIndex();
        do {
            firstFocalKeylineIndex--;
            if (firstFocalKeylineIndex < 0) {
                return 0;
            }
        } while (f != ((KeylineState.Keyline) keylineState.getKeylines().get(firstFocalKeylineIndex)).mask);
        return firstFocalKeylineIndex;
    }

    public static int findFirstNonAnchorKeylineIndex(KeylineState keylineState) {
        for (int i = 0; i < keylineState.getKeylines().size(); i++) {
            if (!((KeylineState.Keyline) keylineState.getKeylines().get(i)).isAnchor) {
                return i;
            }
        }
        return -1;
    }

    public static int findLastNonAnchorKeylineIndex(KeylineState keylineState) {
        int size = keylineState.getKeylines().size();
        do {
            size--;
            if (size < 0) {
                return -1;
            }
        } while (((KeylineState.Keyline) keylineState.getKeylines().get(size)).isAnchor);
        return size;
    }

    public Map getKeylineStateForPositionMap(int i, int i2, int i3, boolean z) {
        float itemSize = this.defaultState.getItemSize();
        HashMap map = new HashMap();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= i) {
                break;
            }
            int i6 = z ? (i - i4) - 1 : i4;
            if (i6 * itemSize * (z ? -1 : 1) > i3 - this.endShiftRange || i4 >= i - this.endStateSteps.size()) {
                Integer numValueOf = Integer.valueOf(i6);
                List list = this.endStateSteps;
                map.put(numValueOf, (KeylineState) list.get(C0932.m8234(i5, 0, list.size() - 1)));
                i5++;
            }
            i4++;
        }
        int i7 = 0;
        for (int i8 = i - 1; i8 >= 0; i8--) {
            int i9 = z ? (i - i8) - 1 : i8;
            if (i9 * itemSize * (z ? -1 : 1) < i2 + this.startShiftRange || i8 < this.startStateSteps.size()) {
                Integer numValueOf2 = Integer.valueOf(i9);
                List list2 = this.startStateSteps;
                map.put(numValueOf2, (KeylineState) list2.get(C0932.m8234(i7, 0, list2.size() - 1)));
                i7++;
            }
        }
        return map;
    }
}
