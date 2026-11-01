package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.View;

/* JADX INFO: renamed from: l.᩺ۚ */
/* JADX INFO: compiled from: 11CW */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1972 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final C1517 f76257;

    /* JADX INFO: renamed from: ᩸ */
    public int f76258;

    /* JADX INFO: renamed from: ᩹ */
    public int f76259;

    public ViewOnClickListenerC1972(Context context, C1517 c1517, XmlResourceParser xmlResourceParser) {
        this.f76259 = -1;
        this.f76258 = 17;
        this.f76257 = c1517;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C1925.f72678);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f76259 = typedArrayObtainStyledAttributes.getResourceId(index, this.f76259);
            } else if (index == 0) {
                this.f76258 = typedArrayObtainStyledAttributes.getInt(index, this.f76258);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53192(C1342 c1342, int i, C1517 c1517) {
        boolean z;
        View viewFindViewById;
        int i2 = this.f76259;
        View view = c1342;
        if (i2 != -1) {
            viewFindViewById = c1342.findViewById(i2);
        }
        if (view == null) {
            view = viewFindViewById;
            return;
        }
        int i3 = c1517.f43645;
        int i4 = c1517.f43642;
        if (i3 == -1) {
            view = viewFindViewById;
            view.setOnClickListener(this);
            return;
        }
        int i5 = this.f76258;
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
        C1517 c1517 = this.f76257;
        C1342 c1342 = c1517.f43636.f25144;
        if (c1342.m27343()) {
            if (c1517.f43645 != -1) {
                C1517 c1518 = c1517.f43636.f25155;
                int i = this.f76258;
                int i2 = i & 1;
                boolean z = false;
                boolean z2 = true;
                boolean z3 = (i2 == 0 && (i & 256) == 0) ? false : true;
                int i3 = i & 16;
                if (i3 == 0 && (i & 4096) == 0) {
                    z2 = false;
                }
                if (z3 && z2) {
                    if (c1517.f43636.f25155 != c1517) {
                        c1342.m27337(c1517);
                    }
                    if (c1342.f33275 != c1342.m27339() && c1342.f33304 <= 0.5f) {
                        z2 = false;
                        z = z3;
                    }
                } else {
                    z = z3;
                }
                if (c1517 != c1518) {
                    int i4 = c1517.f43642;
                    int i5 = c1517.f43645;
                    if (i5 == -1) {
                        if (c1342.f33275 == i4) {
                            return;
                        }
                    } else {
                        int i6 = c1342.f33275;
                        if (i6 != i5 && i6 != i4) {
                            return;
                        }
                    }
                }
                if (z && i2 != 0) {
                    c1342.m27337(c1517);
                    c1342.m27329(1.0f);
                    return;
                }
                if (z2 && i3 != 0) {
                    c1342.m27337(c1517);
                    c1342.m27329(0.0f);
                    return;
                } else if (z && (i & 256) != 0) {
                    c1342.m27337(c1517);
                    c1342.m27340(1.0f);
                    return;
                } else {
                    if (!z2 || (i & 4096) == 0) {
                        return;
                    }
                    c1342.m27337(c1517);
                    c1342.m27340(0.0f);
                    return;
                }
            }
            int i7 = c1342.f33275;
            if (i7 == -1) {
                c1342.m27332(c1517.f43642);
                return;
            }
            C1517 c1519 = new C1517(c1517.f43636, c1517);
            c1519.f43645 = i7;
            c1519.f43642 = c1517.f43642;
            c1342.m27337(c1519);
            c1342.m27329(1.0f);
        }
    }
}
