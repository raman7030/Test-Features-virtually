package l;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 152K */
/* JADX INFO: loaded from: classes.dex */
public final class C22514 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7906 f72857;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public View f72859;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f72860 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21809 f72856 = new C21809();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f72858 = new ArrayList();

    public C22514(C7906 c7906) {
        this.f72857 = c7906;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m50466(View view) {
        this.f72858.add(view);
        AbstractC3255 abstractC3255M31833 = C13132.m31833(view);
        if (abstractC3255M31833 != null) {
            abstractC3255M31833.onEnteredHiddenState(this.f72857.f24490);
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m50468(View view) {
        AbstractC3255 abstractC3255M31833;
        if (!this.f72858.remove(view) || (abstractC3255M31833 = C13132.m31833(view)) == null) {
            return;
        }
        abstractC3255M31833.onLeftHiddenState(this.f72857.f24490);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50473(View view, int i, boolean z) {
        int iM50467;
        C13132 c13132 = this.f72857.f24490;
        if (i >= 0) {
            iM50467 = m50467(i);
        } else {
            iM50467 = c13132.getChildCount();
        }
        this.f72856.m49161(iM50467, z);
        if (z) {
            m50466(view);
        }
        c13132.addView(view, iM50467);
        c13132.dispatchChildAttached(view);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private int m50467(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.f72857.f24490.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            C21809 c21809 = this.f72856;
            int iM49162 = i - (i2 - c21809.m49162(i2));
            if (iM49162 == 0) {
                while (c21809.m49163(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iM49162;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m50478(View view) {
        C7906 c7906 = this.f72857;
        int i = this.f72860;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            this.f72860 = 1;
            this.f72859 = view;
            int iIndexOfChild = c7906.f24490.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (this.f72856.m49165(iIndexOfChild)) {
                    m50468(view);
                }
                c7906.m21196(iIndexOfChild);
            }
        } finally {
            this.f72860 = 0;
            this.f72859 = null;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m50480(int i) {
        C7906 c7906 = this.f72857;
        int i2 = this.f72860;
        if (i2 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iM50467 = m50467(i);
            View childAt = c7906.f24490.getChildAt(iM50467);
            if (childAt != null) {
                this.f72860 = 1;
                this.f72859 = childAt;
                if (this.f72856.m49165(iM50467)) {
                    m50468(childAt);
                }
                c7906.m21196(iM50467);
            }
        } finally {
            this.f72860 = 0;
            this.f72859 = null;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final View m50476(int i) {
        return this.f72857.f24490.getChildAt(m50467(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50472(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iM50467;
        C13132 c13132 = this.f72857.f24490;
        if (i >= 0) {
            iM50467 = m50467(i);
        } else {
            iM50467 = c13132.getChildCount();
        }
        this.f72856.m49161(iM50467, z);
        if (z) {
            m50466(view);
        }
        AbstractC3255 abstractC3255M31833 = C13132.m31833(view);
        if (abstractC3255M31833 != null) {
            if (!abstractC3255M31833.isTmpDetached() && !abstractC3255M31833.shouldIgnore()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + abstractC3255M31833 + c13132.exceptionLabel());
            }
            if (C13132.sVerboseLoggingEnabled) {
                abstractC3255M31833.toString();
            }
            abstractC3255M31833.clearTmpDetachFlag();
        } else if (C13132.sDebugAssertionsEnabled) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + iM50467 + c13132.exceptionLabel());
        }
        c13132.attachViewToParent(view, iM50467, layoutParams);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m50469() {
        return this.f72857.f24490.getChildCount() - this.f72858.size();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m50474() {
        return this.f72857.f24490.getChildCount();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final View m50477(int i) {
        return this.f72857.f24490.getChildAt(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50470(int i) {
        int iM50467 = m50467(i);
        this.f72856.m49165(iM50467);
        C13132 c13132 = this.f72857.f24490;
        View childAt = c13132.getChildAt(iM50467);
        if (childAt != null) {
            AbstractC3255 abstractC3255M31833 = C13132.m31833(childAt);
            if (abstractC3255M31833 != null) {
                if (abstractC3255M31833.isTmpDetached() && !abstractC3255M31833.shouldIgnore()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + abstractC3255M31833 + c13132.exceptionLabel());
                }
                if (C13132.sVerboseLoggingEnabled) {
                    abstractC3255M31833.toString();
                }
                abstractC3255M31833.addFlags(256);
            }
        } else if (C13132.sDebugAssertionsEnabled) {
            throw new IllegalArgumentException("No view at offset " + iM50467 + c13132.exceptionLabel());
        }
        c13132.detachViewFromParent(iM50467);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m50475(View view) {
        int iIndexOfChild = this.f72857.f24490.indexOfChild(view);
        if (iIndexOfChild != -1) {
            C21809 c21809 = this.f72856;
            if (!c21809.m49163(iIndexOfChild)) {
                return iIndexOfChild - c21809.m49162(iIndexOfChild);
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50471(View view) {
        int iIndexOfChild = this.f72857.f24490.indexOfChild(view);
        if (iIndexOfChild < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        this.f72856.m49164(iIndexOfChild);
        m50466(view);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m50479(View view) {
        int iIndexOfChild = this.f72857.f24490.indexOfChild(view);
        if (iIndexOfChild < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        C21809 c21809 = this.f72856;
        if (!c21809.m49163(iIndexOfChild)) {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
        c21809.m49160(iIndexOfChild);
        m50468(view);
    }

    public final String toString() {
        return this.f72856.toString() + ", hidden list:" + this.f72858.size();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m50481(View view) {
        C21809 c21809 = this.f72856;
        C7906 c7906 = this.f72857;
        int i = this.f72860;
        if (i == 1) {
            if (this.f72859 == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        try {
            this.f72860 = 2;
            int iIndexOfChild = c7906.f24490.indexOfChild(view);
            if (iIndexOfChild == -1) {
                m50468(view);
                return true;
            }
            if (!c21809.m49163(iIndexOfChild)) {
                return false;
            }
            c21809.m49165(iIndexOfChild);
            m50468(view);
            c7906.m21196(iIndexOfChild);
            return true;
        } finally {
            this.f72860 = 0;
        }
    }
}
