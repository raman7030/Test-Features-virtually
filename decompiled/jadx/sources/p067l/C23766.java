package p067l;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 152K */
/* JADX INFO: loaded from: classes.dex */
public final class C23766 {

    /* JADX INFO: renamed from: ۧ */
    public final C9882 f75583;

    /* JADX INFO: renamed from: ܿ */
    public View f75585;

    /* JADX INFO: renamed from: ᩳ */
    public int f75586 = 0;

    /* JADX INFO: renamed from: ֫ */
    public final C23096 f75582 = new C23096();

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList f75584 = new ArrayList();

    public C23766(C9882 c9882) {
        this.f75583 = c9882;
    }

    /* JADX INFO: renamed from: ܳ */
    private void m52808(View view) {
        this.f75584.add(view);
        AbstractC5462 abstractC5462M33925 = C14849.m33925(view);
        if (abstractC5462M33925 != null) {
            abstractC5462M33925.onEnteredHiddenState(this.f75583.f27406);
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m52810(View view) {
        AbstractC5462 abstractC5462M33925;
        if (!this.f75584.remove(view) || (abstractC5462M33925 = C14849.m33925(view)) == null) {
            return;
        }
        abstractC5462M33925.onLeftHiddenState(this.f75583.f27406);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52815(View view, int i, boolean z) {
        int iM52809;
        C14849 c14849 = this.f75583.f27406;
        if (i >= 0) {
            iM52809 = m52809(i);
        } else {
            iM52809 = c14849.getChildCount();
        }
        this.f75582.m51512(iM52809, z);
        if (z) {
            m52808(view);
        }
        c14849.addView(view, iM52809);
        c14849.dispatchChildAttached(view);
    }

    /* JADX INFO: renamed from: ܿ */
    private int m52809(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.f75583.f27406.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            C23096 c23096 = this.f75582;
            int iM51513 = i - (i2 - c23096.m51513(i2));
            if (iM51513 == 0) {
                while (c23096.m51514(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iM51513;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m52820(View view) {
        C9882 c9882 = this.f75583;
        int i = this.f75586;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            this.f75586 = 1;
            this.f75585 = view;
            int iIndexOfChild = c9882.f27406.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (this.f75582.m51516(iIndexOfChild)) {
                    m52810(view);
                }
                c9882.m23162(iIndexOfChild);
            }
        } finally {
            this.f75586 = 0;
            this.f75585 = null;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m52822(int i) {
        C9882 c9882 = this.f75583;
        int i2 = this.f75586;
        if (i2 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iM52809 = m52809(i);
            View childAt = c9882.f27406.getChildAt(iM52809);
            if (childAt != null) {
                this.f75586 = 1;
                this.f75585 = childAt;
                if (this.f75582.m51516(iM52809)) {
                    m52810(childAt);
                }
                c9882.m23162(iM52809);
            }
        } finally {
            this.f75586 = 0;
            this.f75585 = null;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final View m52818(int i) {
        return this.f75583.f27406.getChildAt(m52809(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52814(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iM52809;
        C14849 c14849 = this.f75583.f27406;
        if (i >= 0) {
            iM52809 = m52809(i);
        } else {
            iM52809 = c14849.getChildCount();
        }
        this.f75582.m51512(iM52809, z);
        if (z) {
            m52808(view);
        }
        AbstractC5462 abstractC5462M33925 = C14849.m33925(view);
        if (abstractC5462M33925 != null) {
            if (!abstractC5462M33925.isTmpDetached() && !abstractC5462M33925.shouldIgnore()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + abstractC5462M33925 + c14849.exceptionLabel());
            }
            if (C14849.sVerboseLoggingEnabled) {
                abstractC5462M33925.toString();
            }
            abstractC5462M33925.clearTmpDetachFlag();
        } else if (C14849.sDebugAssertionsEnabled) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + iM52809 + c14849.exceptionLabel());
        }
        c14849.attachViewToParent(view, iM52809, layoutParams);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m52811() {
        return this.f75583.f27406.getChildCount() - this.f75584.size();
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m52816() {
        return this.f75583.f27406.getChildCount();
    }

    /* JADX INFO: renamed from: ܽ */
    public final View m52819(int i) {
        return this.f75583.f27406.getChildAt(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52812(int i) {
        int iM52809 = m52809(i);
        this.f75582.m51516(iM52809);
        C14849 c14849 = this.f75583.f27406;
        View childAt = c14849.getChildAt(iM52809);
        if (childAt != null) {
            AbstractC5462 abstractC5462M33925 = C14849.m33925(childAt);
            if (abstractC5462M33925 != null) {
                if (abstractC5462M33925.isTmpDetached() && !abstractC5462M33925.shouldIgnore()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + abstractC5462M33925 + c14849.exceptionLabel());
                }
                if (C14849.sVerboseLoggingEnabled) {
                    abstractC5462M33925.toString();
                }
                abstractC5462M33925.addFlags(256);
            }
        } else if (C14849.sDebugAssertionsEnabled) {
            throw new IllegalArgumentException("No view at offset " + iM52809 + c14849.exceptionLabel());
        }
        c14849.detachViewFromParent(iM52809);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m52817(View view) {
        int iIndexOfChild = this.f75583.f27406.indexOfChild(view);
        if (iIndexOfChild != -1) {
            C23096 c23096 = this.f75582;
            if (!c23096.m51514(iIndexOfChild)) {
                return iIndexOfChild - c23096.m51513(iIndexOfChild);
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52813(View view) {
        int iIndexOfChild = this.f75583.f27406.indexOfChild(view);
        if (iIndexOfChild < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        this.f75582.m51515(iIndexOfChild);
        m52808(view);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m52821(View view) {
        int iIndexOfChild = this.f75583.f27406.indexOfChild(view);
        if (iIndexOfChild < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        C23096 c23096 = this.f75582;
        if (!c23096.m51514(iIndexOfChild)) {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
        c23096.m51511(iIndexOfChild);
        m52810(view);
    }

    public final String toString() {
        return this.f75582.toString() + ", hidden list:" + this.f75584.size();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m52823(View view) {
        C23096 c23096 = this.f75582;
        C9882 c9882 = this.f75583;
        int i = this.f75586;
        if (i == 1) {
            if (this.f75585 == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        try {
            this.f75586 = 2;
            int iIndexOfChild = c9882.f27406.indexOfChild(view);
            if (iIndexOfChild == -1) {
                m52810(view);
                return true;
            }
            if (!c23096.m51514(iIndexOfChild)) {
                return false;
            }
            c23096.m51516(iIndexOfChild);
            m52810(view);
            c9882.m23162(iIndexOfChild);
            return true;
        } finally {
            this.f75586 = 0;
        }
    }
}
