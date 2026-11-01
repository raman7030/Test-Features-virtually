package p067l;

import android.graphics.Rect;

/* JADX INFO: renamed from: l.ۜۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D33U */
/* JADX INFO: loaded from: classes2.dex */
public final class C8750 {
    /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
    /* JADX INFO: renamed from: ֫ */
    public static C1555 m20218(C1502 c1502, InterfaceC16125 interfaceC16125, InterfaceC18808 interfaceC18808, C1555 c1555, Rect rect, int i) {
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
        C12774 c12774 = (C12774) interfaceC16125;
        c12774.getClass();
        int iM34388 = c1502.m34388();
        Rect rect3 = new Rect();
        C1555 c1556 = null;
        for (int i2 = 0; i2 < iM34388; i2++) {
            c12774.getClass();
            C1555 c1557 = (C1555) c1502.m34391(i2);
            if (c1557 != c1555) {
                ((C4056) interfaceC18808).getClass();
                c1557.m36411(rect3);
                if (m20221(i, rect, rect3)) {
                    if (!m20221(i, rect, rect2) || m20220(i, rect, rect3, rect2)) {
                        rect2.set(rect3);
                        c1556 = c1557;
                    } else if (!m20220(i, rect, rect2, rect3)) {
                        int iM20222 = m20222(i, rect, rect3);
                        int iM20223 = m20223(i, rect, rect3);
                        int i3 = (iM20223 * iM20223) + (iM20222 * 13 * iM20222);
                        int iM20224 = m20222(i, rect, rect2);
                        int iM20225 = m20223(i, rect, rect2);
                        if (i3 < (iM20225 * iM20225) + (iM20224 * 13 * iM20224)) {
                            rect2.set(rect3);
                            c1556 = c1557;
                        }
                    }
                }
            }
        }
        return c1556;
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
    /* JADX INFO: renamed from: ֫ */
    public static boolean m20220(int i, Rect rect, Rect rect2, Rect rect3) {
        int iM20222;
        int i2;
        int i3;
        boolean zM20219 = m20219(i, rect, rect2);
        if (m20219(i, rect, rect3) || !zM20219) {
            return false;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        if (rect.bottom <= rect3.top) {
                            if (i != 17 && i != 66) {
                                iM20222 = m20222(i, rect, rect2);
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
                                if (iM20222 < Math.max(1, i2 - i3)) {
                                    return false;
                                }
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else if (rect.right <= rect3.left) {
                    if (i != 17) {
                        iM20222 = m20222(i, rect, rect2);
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
                        if (iM20222 < Math.max(1, i2 - i3)) {
                            return false;
                        }
                    }
                }
            } else if (rect.top >= rect3.bottom) {
                if (i != 17) {
                    iM20222 = m20222(i, rect, rect2);
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
                    if (iM20222 < Math.max(1, i2 - i3)) {
                        return false;
                    }
                }
            }
        } else if (rect.left >= rect3.right) {
            if (i != 17) {
                iM20222 = m20222(i, rect, rect2);
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
                if (iM20222 < Math.max(1, i2 - i3)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m20221(int i, Rect rect, Rect rect2) {
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

    /* JADX INFO: renamed from: ֫ */
    public static boolean m20219(int i, Rect rect, Rect rect2) {
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

    /* JADX INFO: renamed from: ܽ */
    public static int m20222(int i, Rect rect, Rect rect2) {
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

    /* JADX INFO: renamed from: ᩳ */
    public static int m20223(int i, Rect rect, Rect rect2) {
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
