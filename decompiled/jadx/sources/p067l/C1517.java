package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰۚ */
/* JADX INFO: compiled from: 11CW */
/* JADX INFO: loaded from: classes3.dex */
public final class C1517 {

    /* JADX INFO: renamed from: ֡ */
    public C1511 f43634;

    /* JADX INFO: renamed from: ֫ */
    public int f43635;

    /* JADX INFO: renamed from: ۖ */
    public final C1202 f43636;

    /* JADX INFO: renamed from: ۘ */
    public ArrayList f43637;

    /* JADX INFO: renamed from: ۚ */
    public int f43638;

    /* JADX INFO: renamed from: ۜ */
    public int f43639;

    /* JADX INFO: renamed from: ۡ */
    public ArrayList f43640;

    /* JADX INFO: renamed from: ۢ */
    public boolean f43641;

    /* JADX INFO: renamed from: ۧ */
    public int f43642;

    /* JADX INFO: renamed from: ܳ */
    public String f43643;

    /* JADX INFO: renamed from: ܺ */
    public int f43644;

    /* JADX INFO: renamed from: ܽ */
    public int f43645;

    /* JADX INFO: renamed from: ܿ */
    public int f43646;

    /* JADX INFO: renamed from: ᩳ */
    public int f43647;

    /* JADX INFO: renamed from: ᩴ */
    public int f43648;

    /* JADX INFO: renamed from: ᩵ */
    public float f43649;

    /* JADX INFO: renamed from: ᩷ */
    public int f43650;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f43651;

    /* JADX INFO: renamed from: ܽ */
    public final int m34807() {
        return this.f43644;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34804(Context context, XmlResourceParser xmlResourceParser) {
        this.f43637.add(new ViewOnClickListenerC1972(context, this, xmlResourceParser));
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m34802() {
        return this.f43635;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m34805() {
        return this.f43642;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m34809() {
        return this.f43645;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C1511 m34808() {
        return this.f43634;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m34806() {
        return !this.f43651;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34803(Context context) {
        if (this.f43645 != -1) {
            context.getResources().getResourceEntryName(this.f43645);
        }
        if (this.f43642 == -1) {
            return;
        }
        context.getResources().getResourceEntryName(this.f43642);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m34810() {
        return (this.f43638 & 1) != 0;
    }

    public C1517(C1202 c1202, C1517 c1517) {
        this.f43650 = -1;
        this.f43641 = false;
        this.f43642 = -1;
        this.f43645 = -1;
        this.f43647 = 0;
        this.f43643 = null;
        this.f43646 = -1;
        this.f43639 = 400;
        this.f43649 = 0.0f;
        this.f43640 = new ArrayList();
        this.f43634 = null;
        this.f43637 = new ArrayList();
        this.f43635 = 0;
        this.f43651 = false;
        this.f43648 = -1;
        this.f43644 = 0;
        this.f43638 = 0;
        this.f43636 = c1202;
        if (c1517 != null) {
            this.f43648 = c1517.f43648;
            this.f43647 = c1517.f43647;
            this.f43643 = c1517.f43643;
            this.f43646 = c1517.f43646;
            this.f43639 = c1517.f43639;
            this.f43640 = c1517.f43640;
            this.f43649 = c1517.f43649;
            this.f43644 = c1517.f43644;
        }
    }

    public C1517(C1202 c1202, Context context, XmlResourceParser xmlResourceParser) {
        this.f43650 = -1;
        this.f43641 = false;
        this.f43642 = -1;
        this.f43645 = -1;
        this.f43647 = 0;
        this.f43643 = null;
        this.f43646 = -1;
        this.f43639 = 400;
        this.f43649 = 0.0f;
        this.f43640 = new ArrayList();
        this.f43634 = null;
        this.f43637 = new ArrayList();
        this.f43635 = 0;
        this.f43651 = false;
        this.f43648 = -1;
        this.f43644 = 0;
        this.f43638 = 0;
        this.f43639 = c1202.f25154;
        this.f43644 = c1202.f25152;
        this.f43636 = c1202;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C1925.f72683);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 2) {
                this.f43642 = typedArrayObtainStyledAttributes.getResourceId(index, this.f43642);
                if ("layout".equals(context.getResources().getResourceTypeName(this.f43642))) {
                    C1050 c1050 = new C1050();
                    c1050.m14547(context, this.f43642);
                    c1202.f25153.append(this.f43642, c1050);
                }
            } else if (index == 3) {
                this.f43645 = typedArrayObtainStyledAttributes.getResourceId(index, this.f43645);
                if ("layout".equals(context.getResources().getResourceTypeName(this.f43645))) {
                    C1050 c1051 = new C1050();
                    c1051.m14547(context, this.f43645);
                    c1202.f25153.append(this.f43645, c1051);
                }
            } else if (index == 6) {
                int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f43646 = resourceId;
                    if (resourceId != -1) {
                        this.f43647 = -2;
                    }
                } else if (i2 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f43643 = string;
                    if (string.indexOf("/") > 0) {
                        this.f43646 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f43647 = -2;
                    } else {
                        this.f43647 = -1;
                    }
                } else {
                    this.f43647 = typedArrayObtainStyledAttributes.getInteger(index, this.f43647);
                }
            } else if (index == 4) {
                this.f43639 = typedArrayObtainStyledAttributes.getInt(index, this.f43639);
            } else if (index == 8) {
                this.f43649 = typedArrayObtainStyledAttributes.getFloat(index, this.f43649);
            } else if (index == 1) {
                this.f43635 = typedArrayObtainStyledAttributes.getInteger(index, this.f43635);
            } else if (index == 0) {
                this.f43650 = typedArrayObtainStyledAttributes.getResourceId(index, this.f43650);
            } else if (index == 9) {
                this.f43651 = typedArrayObtainStyledAttributes.getBoolean(index, this.f43651);
            } else if (index == 7) {
                this.f43648 = typedArrayObtainStyledAttributes.getInteger(index, -1);
            } else if (index == 5) {
                this.f43644 = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == 10) {
                this.f43638 = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        if (this.f43645 == -1) {
            this.f43641 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
