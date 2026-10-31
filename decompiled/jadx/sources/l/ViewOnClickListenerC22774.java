package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.View;

/* JADX INFO: renamed from: l.᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11CW */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC22774 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C13601 f73527;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f73528;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f73529;

    public ViewOnClickListenerC22774(Context context, C13601 c13601, XmlResourceParser xmlResourceParser) {
        this.f73529 = -1;
        this.f73528 = 17;
        this.f73527 = c13601;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C21840.f69969);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f73529 = typedArrayObtainStyledAttributes.getResourceId(index, this.f73529);
            } else if (index == 0) {
                this.f73528 = typedArrayObtainStyledAttributes.getInt(index, this.f73528);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50849(C10075 c10075, int i, C13601 c13601) {
        boolean z;
        View viewFindViewById;
        int i2 = this.f73529;
        View view = c10075;
        if (i2 != -1) {
            viewFindViewById = c10075.findViewById(i2);
        }
        if (view == null) {
            view = viewFindViewById;
            return;
        }
        int i3 = c13601.f40567;
        int i4 = c13601.f40564;
        if (i3 == -1) {
            view = viewFindViewById;
            view.setOnClickListener(this);
            return;
        }
        int i5 = this.f73528;
        int i6 = i5 & 1;
        boolean z2 = false;
        if (i6 == 0 || i != i3) {
            view = viewFindViewById;
            z = false;
        } else {
            z = true;
        }
        boolean z3 = (i6 != 0 && i == i3) | z | ((i5 & 256) != 0 && i == i3) | ((i5 & 16) != 0 && i == i4);
        if ((i5 & 4096) != 0 && i == i4) {
            z2 = true;
        }
        if (z3 || z2) {
            view.setOnClickListener(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C13601 c13601 = this.f73527;
        C10075 c10075 = c13601.f40558.f22254;
        if (c10075.m25324()) {
            if (c13601.f40567 != -1) {
                C13601 c13602 = c13601.f40558.f22265;
                int i = this.f73528;
                int i2 = i & 1;
                boolean z = false;
                boolean z2 = true;
                boolean z3 = (i2 == 0 && (i & 256) == 0) ? false : true;
                int i3 = i & 16;
                if (i3 == 0 && (i & 4096) == 0) {
                    z2 = false;
                }
                if (z3 && z2) {
                    if (c13601.f40558.f22265 != c13601) {
                        c10075.m25318(c13601);
                    }
                    if (c10075.f30314 != c10075.m25320() && c10075.f30343 <= 0.5f) {
                        z2 = false;
                        z = z3;
                    }
                } else {
                    z = z3;
                }
                if (c13601 != c13602) {
                    int i4 = c13601.f40564;
                    int i5 = c13601.f40567;
                    if (i5 == -1) {
                        if (c10075.f30314 == i4) {
                            return;
                        }
                    } else {
                        int i6 = c10075.f30314;
                        if (i6 != i5 && i6 != i4) {
                            return;
                        }
                    }
                }
                if (z && i2 != 0) {
                    c10075.m25318(c13601);
                    c10075.m25310(1.0f);
                    return;
                }
                if (z2 && i3 != 0) {
                    c10075.m25318(c13601);
                    c10075.m25310(0.0f);
                    return;
                } else if (z && (i & 256) != 0) {
                    c10075.m25318(c13601);
                    c10075.m25321(1.0f);
                    return;
                } else {
                    if (!z2 || (i & 4096) == 0) {
                        return;
                    }
                    c10075.m25318(c13601);
                    c10075.m25321(0.0f);
                    return;
                }
            }
            int i7 = c10075.f30314;
            if (i7 == -1) {
                c10075.m25313(c13601.f40564);
                return;
            }
            C13601 c13603 = new C13601(c13601.f40558, c13601);
            c13603.f40567 = i7;
            c13603.f40564 = c13601.f40564;
            c10075.m25318(c13603);
            c10075.m25310(1.0f);
        }
    }
}
