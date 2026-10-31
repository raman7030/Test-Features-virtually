package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11CW */
/* JADX INFO: loaded from: classes3.dex */
public final class C13601 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C13477 f40556;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f40557;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C7252 f40558;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public ArrayList f40559;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f40560;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f40561;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public ArrayList f40562;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f40563;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f40564;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f40565;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f40566;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f40567;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f40568;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f40569;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f40570;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f40571;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f40572;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f40573;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m32695() {
        return this.f40566;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32692(Context context, XmlResourceParser xmlResourceParser) {
        this.f40559.add(new ViewOnClickListenerC22774(context, this, xmlResourceParser));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m32690() {
        return this.f40557;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m32693() {
        return this.f40564;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m32697() {
        return this.f40567;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C13477 m32696() {
        return this.f40556;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m32694() {
        return !this.f40573;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32691(Context context) {
        if (this.f40567 != -1) {
            context.getResources().getResourceEntryName(this.f40567);
        }
        if (this.f40564 == -1) {
            return;
        }
        context.getResources().getResourceEntryName(this.f40564);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m32698() {
        return (this.f40560 & 1) != 0;
    }

    public C13601(C7252 c7252, C13601 c13601) {
        this.f40572 = -1;
        this.f40563 = false;
        this.f40564 = -1;
        this.f40567 = -1;
        this.f40569 = 0;
        this.f40565 = null;
        this.f40568 = -1;
        this.f40561 = 400;
        this.f40571 = 0.0f;
        this.f40562 = new ArrayList();
        this.f40556 = null;
        this.f40559 = new ArrayList();
        this.f40557 = 0;
        this.f40573 = false;
        this.f40570 = -1;
        this.f40566 = 0;
        this.f40560 = 0;
        this.f40558 = c7252;
        if (c13601 != null) {
            this.f40570 = c13601.f40570;
            this.f40569 = c13601.f40569;
            this.f40565 = c13601.f40565;
            this.f40568 = c13601.f40568;
            this.f40561 = c13601.f40561;
            this.f40562 = c13601.f40562;
            this.f40571 = c13601.f40571;
            this.f40566 = c13601.f40566;
        }
    }

    public C13601(C7252 c7252, Context context, XmlResourceParser xmlResourceParser) {
        this.f40572 = -1;
        this.f40563 = false;
        this.f40564 = -1;
        this.f40567 = -1;
        this.f40569 = 0;
        this.f40565 = null;
        this.f40568 = -1;
        this.f40561 = 400;
        this.f40571 = 0.0f;
        this.f40562 = new ArrayList();
        this.f40556 = null;
        this.f40559 = new ArrayList();
        this.f40557 = 0;
        this.f40573 = false;
        this.f40570 = -1;
        this.f40566 = 0;
        this.f40560 = 0;
        this.f40561 = c7252.f22264;
        this.f40566 = c7252.f22262;
        this.f40558 = c7252;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C21840.f69974);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 2) {
                this.f40564 = typedArrayObtainStyledAttributes.getResourceId(index, this.f40564);
                if ("layout".equals(context.getResources().getResourceTypeName(this.f40564))) {
                    C4201 c4201 = new C4201();
                    c4201.m12671(context, this.f40564);
                    c7252.f22263.append(this.f40564, c4201);
                }
            } else if (index == 3) {
                this.f40567 = typedArrayObtainStyledAttributes.getResourceId(index, this.f40567);
                if ("layout".equals(context.getResources().getResourceTypeName(this.f40567))) {
                    C4201 c4202 = new C4201();
                    c4202.m12671(context, this.f40567);
                    c7252.f22263.append(this.f40567, c4202);
                }
            } else if (index == 6) {
                int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f40568 = resourceId;
                    if (resourceId != -1) {
                        this.f40569 = -2;
                    }
                } else if (i2 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f40565 = string;
                    if (string.indexOf("/") > 0) {
                        this.f40568 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f40569 = -2;
                    } else {
                        this.f40569 = -1;
                    }
                } else {
                    this.f40569 = typedArrayObtainStyledAttributes.getInteger(index, this.f40569);
                }
            } else if (index == 4) {
                this.f40561 = typedArrayObtainStyledAttributes.getInt(index, this.f40561);
            } else if (index == 8) {
                this.f40571 = typedArrayObtainStyledAttributes.getFloat(index, this.f40571);
            } else if (index == 1) {
                this.f40557 = typedArrayObtainStyledAttributes.getInteger(index, this.f40557);
            } else if (index == 0) {
                this.f40572 = typedArrayObtainStyledAttributes.getResourceId(index, this.f40572);
            } else if (index == 9) {
                this.f40573 = typedArrayObtainStyledAttributes.getBoolean(index, this.f40573);
            } else if (index == 7) {
                this.f40570 = typedArrayObtainStyledAttributes.getInteger(index, -1);
            } else if (index == 5) {
                this.f40566 = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == 10) {
                this.f40560 = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        if (this.f40567 == -1) {
            this.f40563 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
