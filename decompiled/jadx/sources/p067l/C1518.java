package p067l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: l.ܰۛ */
/* JADX INFO: compiled from: P5AI */
/* JADX INFO: loaded from: classes3.dex */
public final class C1518 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f43707;

    /* JADX INFO: renamed from: ۧ */
    public ViewParent f43708;

    /* JADX INFO: renamed from: ܽ */
    public ViewParent f43709;

    /* JADX INFO: renamed from: ܿ */
    public final ViewGroup f43710;

    /* JADX INFO: renamed from: ᩳ */
    public int[] f43711;

    public C1518(ViewGroup viewGroup) {
        this.f43710 = viewGroup;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34859(boolean z) {
        if (this.f43707) {
            int i = C1717.f57146;
            C1491.m33798(this.f43710);
        }
        this.f43707 = z;
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m34856(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentM34857;
        int i6;
        int i7;
        int[] iArr3;
        if (this.f43707 && (viewParentM34857 = m34857(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                ViewGroup viewGroup = this.f43710;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (this.f43711 == null) {
                        this.f43711 = new int[2];
                    }
                    int[] iArr4 = this.f43711;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentM34857 instanceof InterfaceC0931) {
                    ((InterfaceC0931) viewParentM34857).onNestedScroll(viewGroup, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (viewParentM34857 instanceof InterfaceC1203) {
                        ((InterfaceC1203) viewParentM34857).onNestedScroll(viewGroup, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            C1122.m17872(viewParentM34857, viewGroup, i, i2, i3, i4);
                        } catch (AbstractMethodError unused) {
                            C12826.toString(viewParentM34857);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m34860() {
        return this.f43707;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m34861(float f, float f2) {
        ViewParent viewParentM34857;
        if (this.f43707 && (viewParentM34857 = m34857(0)) != null) {
            try {
                return C1122.m17875(viewParentM34857, this.f43710, f, f2);
            } catch (AbstractMethodError unused) {
                C12826.toString(viewParentM34857);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m34862(float f, float f2, boolean z) {
        ViewParent viewParentM34857;
        if (this.f43707 && (viewParentM34857 = m34857(0)) != null) {
            try {
                return C1122.m17876(viewParentM34857, this.f43710, f, f2, z);
            } catch (AbstractMethodError unused) {
                C12826.toString(viewParentM34857);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m34867(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent viewParentM34857;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.f43707 || (viewParentM34857 = m34857(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f43710;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.f43711 == null) {
                this.f43711 = new int[2];
            }
            iArr3 = this.f43711;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentM34857 instanceof InterfaceC1203) {
            ((InterfaceC1203) viewParentM34857).onNestedPreScroll(viewGroup, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                C1122.m17873(viewParentM34857, viewGroup, i, i2, iArr3);
            } catch (AbstractMethodError unused) {
                C12826.toString(viewParentM34857);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m34863(int i) {
        return m34857(i) != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m34864(int i, int i2) {
        boolean zM17877;
        if (!m34863(i2)) {
            if (this.f43707) {
                ViewGroup viewGroup = this.f43710;
                View view = viewGroup;
                for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z = parent instanceof InterfaceC1203;
                    if (z) {
                        zM17877 = ((InterfaceC1203) parent).onStartNestedScroll(view, viewGroup, i, i2);
                    } else if (i2 == 0) {
                        try {
                            zM17877 = C1122.m17877(parent, view, viewGroup, i);
                        } catch (AbstractMethodError unused) {
                            C12826.toString(parent);
                            zM17877 = false;
                        }
                    } else {
                        zM17877 = false;
                    }
                    if (zM17877) {
                        if (i2 == 0) {
                            this.f43709 = parent;
                        } else if (i2 == 1) {
                            this.f43708 = parent;
                        }
                        if (z) {
                            ((InterfaceC1203) parent).onNestedScrollAccepted(view, viewGroup, i, i2);
                        } else if (i2 == 0) {
                            try {
                                C1122.m17874(parent, view, viewGroup, i);
                            } catch (AbstractMethodError unused2) {
                                C12826.toString(parent);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m34868(int i) {
        ViewParent viewParentM34857 = m34857(i);
        if (viewParentM34857 != null) {
            boolean z = viewParentM34857 instanceof InterfaceC1203;
            ViewGroup viewGroup = this.f43710;
            if (z) {
                ((InterfaceC1203) viewParentM34857).onStopNestedScroll(viewGroup, i);
            } else if (i == 0) {
                try {
                    C1122.m17871(viewParentM34857, viewGroup);
                } catch (AbstractMethodError unused) {
                    C12826.toString(viewParentM34857);
                }
            }
            if (i == 0) {
                this.f43709 = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f43708 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m34865(int i, int i2, int i3, int i4, int[] iArr) {
        return m34856(i, i2, i3, i4, iArr, 0, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m34866(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return m34856(i, i2, i3, i4, iArr, i5, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34858(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m34856(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* JADX INFO: renamed from: ܽ */
    private ViewParent m34857(int i) {
        if (i == 0) {
            return this.f43709;
        }
        if (i != 1) {
            return null;
        }
        return this.f43708;
    }
}
