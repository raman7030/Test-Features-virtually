package l;

import android.graphics.Rect;

/* JADX INFO: renamed from: l.ۜۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D33U */
/* JADX INFO: loaded from: classes2.dex */
public final class C6715 {
    /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14369 m18270(C13309 c13309, InterfaceC14475 interfaceC14475, InterfaceC17298 interfaceC17298, C14369 c14369, Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else if (i == 130) {
            rect2.offset(0, -(rect.height() + 1));
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        C10949 c10949 = (C10949) interfaceC14475;
        c10949.getClass();
        int iM32287 = c13309.m32287();
        Rect rect3 = new Rect();
        C14369 c143610 = null;
        for (int i2 = 0; i2 < iM32287; i2++) {
            c10949.getClass();
            C14369 c143611 = (C14369) c13309.m32290(i2);
            if (c143611 != c14369) {
                ((C1776) interfaceC17298).getClass();
                c143611.m34278(rect3);
                if (m18273(i, rect, rect3)) {
                    if (!m18273(i, rect, rect2) || m18272(i, rect, rect3, rect2)) {
                        rect2.set(rect3);
                        c143610 = c143611;
                    } else if (!m18272(i, rect, rect2, rect3)) {
                        int iM18274 = m18274(i, rect, rect3);
                        int iM18275 = m18275(i, rect, rect3);
                        int i3 = (iM18275 * iM18275) + (iM18274 * 13 * iM18274);
                        int iM18276 = m18274(i, rect, rect2);
                        int iM18277 = m18275(i, rect, rect2);
                        if (i3 < (iM18277 * iM18277) + (iM18276 * 13 * iM18276)) {
                            rect2.set(rect3);
                            c143610 = c143611;
                        }
                    }
                }
            }
        }
        return c143610;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m18272(int i, Rect rect, Rect rect2, Rect rect3) {
        int iM18274;
        int i2;
        int i3;
        boolean zM18271 = m18271(i, rect, rect2);
        if (m18271(i, rect, rect3) || !zM18271) {
            return false;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        if (rect.bottom <= rect3.top) {
                            if (i != 17 && i != 66) {
                                iM18274 = m18274(i, rect, rect2);
                                if (i != 17) {
                                    i2 = rect.left;
                                    i3 = rect3.left;
                                } else if (i != 33) {
                                    i2 = rect.top;
                                    i3 = rect3.top;
                                } else if (i != 66) {
                                    i2 = rect3.right;
                                    i3 = rect.right;
                                } else if (i == 130) {
                                    i2 = rect3.bottom;
                                    i3 = rect.bottom;
                                } else {
                                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                }
                                if (iM18274 < Math.max(1, i2 - i3)) {
                                    return false;
                                }
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else if (rect.right <= rect3.left) {
                    if (i != 17) {
                        iM18274 = m18274(i, rect, rect2);
                        if (i != 17) {
                            i2 = rect.left;
                            i3 = rect3.left;
                        } else if (i != 33) {
                            i2 = rect.top;
                            i3 = rect3.top;
                        } else if (i != 66) {
                            i2 = rect3.right;
                            i3 = rect.right;
                        } else if (i == 130) {
                            i2 = rect3.bottom;
                            i3 = rect.bottom;
                        } else {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        if (iM18274 < Math.max(1, i2 - i3)) {
                            return false;
                        }
                    }
                }
            } else if (rect.top >= rect3.bottom) {
                if (i != 17) {
                    iM18274 = m18274(i, rect, rect2);
                    if (i != 17) {
                        i2 = rect.left;
                        i3 = rect3.left;
                    } else if (i != 33) {
                        i2 = rect.top;
                        i3 = rect3.top;
                    } else if (i != 66) {
                        i2 = rect3.right;
                        i3 = rect.right;
                    } else if (i == 130) {
                        i2 = rect3.bottom;
                        i3 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    if (iM18274 < Math.max(1, i2 - i3)) {
                        return false;
                    }
                }
            }
        } else if (rect.left >= rect3.right) {
            if (i != 17) {
                iM18274 = m18274(i, rect, rect2);
                if (i != 17) {
                    i2 = rect.left;
                    i3 = rect3.left;
                } else if (i != 33) {
                    i2 = rect.top;
                    i3 = rect3.top;
                } else if (i != 66) {
                    i2 = rect3.right;
                    i3 = rect.right;
                } else if (i == 130) {
                    i2 = rect3.bottom;
                    i3 = rect.bottom;
                } else {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                if (iM18274 < Math.max(1, i2 - i3)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m18273(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        }
        if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m18271(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m18274(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return Math.max(0, i2 - i3);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m18275(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }
}
