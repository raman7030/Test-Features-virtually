package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11CW */
/* JADX INFO: loaded from: classes2.dex */
public final class C7252 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ArrayList f22252;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f22253;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C10075 f22254;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f22255;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC19953 f22256;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f22257;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f22258;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f22259;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public HashMap f22260;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C13601 f22261;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f22262;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public SparseArray f22263;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f22264;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C13601 f22265;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f22266;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C4906 f22267;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public MotionEvent f22268;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public SparseIntArray f22269;

    /* JADX WARN: Code duplicated, block: B:16:0x0024  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19410(int i, int i2) {
        int iM14279;
        int iM142710;
        ArrayList arrayList;
        Iterator it;
        C13601 c13601;
        C13601 c13602;
        C13601 c13603;
        C4906 c4906 = this.f22267;
        if (c4906 != null) {
            iM14279 = c4906.m14279(i);
            if (iM14279 == -1) {
                iM14279 = i;
            }
            iM142710 = this.f22267.m14279(i2);
            if (iM142710 == -1) {
            }
            arrayList = this.f22252;
            it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    c13601 = this.f22261;
                    for (C13601 c13604 : this.f22253) {
                        if (c13604.f40564 == i2) {
                            c13601 = c13604;
                        }
                    }
                    c13602 = new C13601(this, c13601);
                    c13602.f40567 = iM14279;
                    c13602.f40564 = iM142710;
                    if (iM14279 != -1) {
                        arrayList.add(c13602);
                    }
                    this.f22265 = c13602;
                    return;
                }
                c13603 = (C13601) it.next();
                if ((c13603.f40564 != iM142710 && c13603.f40567 == iM14279) || (c13603.f40564 == i2 && c13603.f40567 == i)) {
                    break;
                }
            }
            this.f22265 = c13603;
            if (c13603.f40556 != null) {
                this.f22265.f40556.m32502(this.f22266);
            }
        }
        iM14279 = i;
        iM142710 = i2;
        arrayList = this.f22252;
        it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                c13601 = this.f22261;
                while (r8.hasNext()) {
                    if (c13604.f40564 == i2) {
                        c13601 = c13604;
                    }
                }
                c13602 = new C13601(this, c13601);
                c13602.f40567 = iM14279;
                c13602.f40564 = iM142710;
                if (iM14279 != -1) {
                    arrayList.add(c13602);
                }
                this.f22265 = c13602;
                return;
            }
            c13603 = (C13601) it.next();
            if (c13603.f40564 != iM142710) {
            }
        }
        this.f22265 = c13603;
        if (c13603.f40556 != null) {
            this.f22265.f40556.m32502(this.f22266);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19414(C13601 c13601) {
        this.f22265 = c13601;
        if (c13601.f40556 != null) {
            this.f22265.f40556.m32502(this.f22266);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19413(C10075 c10075, int i) {
        View viewFindViewById;
        View viewFindViewById2;
        ArrayList<C13601> arrayList = this.f22252;
        for (C13601 c13601 : arrayList) {
            if (c13601.f40559.size() > 0) {
                Iterator it = c13601.f40559.iterator();
                while (it.hasNext()) {
                    int i2 = ((ViewOnClickListenerC22774) it.next()).f73529;
                    if (i2 != -1 && (viewFindViewById2 = c10075.findViewById(i2)) != null) {
                        viewFindViewById2.setOnClickListener(null);
                    }
                }
            }
        }
        ArrayList<C13601> arrayList2 = this.f22253;
        for (C13601 c13602 : arrayList2) {
            if (c13602.f40559.size() > 0) {
                Iterator it2 = c13602.f40559.iterator();
                while (it2.hasNext()) {
                    int i3 = ((ViewOnClickListenerC22774) it2.next()).f73529;
                    if (i3 != -1 && (viewFindViewById = c10075.findViewById(i3)) != null) {
                        viewFindViewById.setOnClickListener(null);
                    }
                }
            }
        }
        for (C13601 c13603 : arrayList) {
            if (c13603.f40559.size() > 0) {
                Iterator it3 = c13603.f40559.iterator();
                while (it3.hasNext()) {
                    ((ViewOnClickListenerC22774) it3.next()).m50849(c10075, i, c13603);
                }
            }
        }
        for (C13601 c13604 : arrayList2) {
            if (c13604.f40559.size() > 0) {
                Iterator it4 = c13604.f40559.iterator();
                while (it4.hasNext()) {
                    ((ViewOnClickListenerC22774) it4.next()).m50849(c10075, i, c13604);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m19408() {
        return this.f22252;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m19418(C10075 c10075, int i) {
        if (this.f22256 != null) {
            return false;
        }
        for (C13601 c13601 : this.f22252) {
            if (c13601.f40557 != 0 && this.f22265 != c13601) {
                if (i == c13601.f40567 && (c13601.f40557 == 4 || c13601.f40557 == 2)) {
                    EnumC12191 enumC12191 = EnumC12191.FINISHED;
                    c10075.m25317(enumC12191);
                    c10075.m25318(c13601);
                    if (c13601.f40557 != 4) {
                        c10075.m25321(1.0f);
                        c10075.m25319(true);
                        c10075.m25317(EnumC12191.SETUP);
                        c10075.m25317(EnumC12191.MOVING);
                        c10075.m25317(enumC12191);
                        c10075.m25323();
                        return true;
                    }
                    c10075.m25310(1.0f);
                    c10075.m25317(EnumC12191.SETUP);
                    c10075.m25317(EnumC12191.MOVING);
                    return true;
                }
                if (i == c13601.f40564 && (c13601.f40557 == 3 || c13601.f40557 == 1)) {
                    EnumC12191 enumC12192 = EnumC12191.FINISHED;
                    c10075.m25317(enumC12192);
                    c10075.m25318(c13601);
                    if (c13601.f40557 != 3) {
                        c10075.m25321(0.0f);
                        c10075.m25319(true);
                        c10075.m25317(EnumC12191.SETUP);
                        c10075.m25317(EnumC12191.MOVING);
                        c10075.m25317(enumC12192);
                        c10075.m25323();
                        return true;
                    }
                    c10075.m25310(0.0f);
                    c10075.m25317(EnumC12191.SETUP);
                    c10075.m25317(EnumC12191.MOVING);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19416(boolean z) {
        this.f22266 = z;
        C13601 c13601 = this.f22265;
        if (c13601 == null || c13601.f40556 == null) {
            return;
        }
        this.f22265.f40556.m32502(this.f22266);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C7252(Context context, C10075 c10075, int i) {
        C13601 c13601 = null;
        this.f22267 = null;
        this.f22265 = null;
        ArrayList arrayList = new ArrayList();
        this.f22252 = arrayList;
        this.f22261 = null;
        this.f22253 = new ArrayList();
        this.f22263 = new SparseArray();
        this.f22260 = new HashMap();
        this.f22269 = new SparseIntArray();
        this.f22264 = 400;
        this.f22262 = 0;
        this.f22257 = false;
        this.f22255 = false;
        this.f22254 = c10075;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                m19402(context, xml);
                            }
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                c13601.f40562.add(new C23480(context, xml));
                            }
                            break;
                        case 269306229:
                            if (name.equals(AbstractC16620.LOG_TAG)) {
                                c13601 = new C13601(this, context, xml);
                                arrayList.add(c13601);
                                if (this.f22265 == null && !c13601.f40563) {
                                    this.f22265 = c13601;
                                    if (c13601.f40556 != null) {
                                        this.f22265.f40556.m32502(this.f22266);
                                    }
                                }
                                if (c13601.f40563) {
                                    if (c13601.f40564 == -1) {
                                        this.f22261 = c13601;
                                    } else {
                                        this.f22253.add(c13601);
                                    }
                                    arrayList.remove(c13601);
                                }
                            }
                            break;
                        case 312750793:
                            if (name.equals("OnClick")) {
                                c13601.m32692(context, xml);
                            }
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                if (c13601 == null) {
                                    context.getResources().getResourceEntryName(i);
                                    xml.getLineNumber();
                                }
                                c13601.f40556 = new C13477(context, this.f22254, xml);
                            }
                            break;
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                m19405(context, xml);
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                this.f22267 = new C4906(context, xml);
                            }
                            break;
                    }
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
        this.f22263.put(R.id.MT_Protector, new C4201());
        this.f22260.put("motion_base", Integer.valueOf(R.id.MT_Protector));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m19405(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C21840.f69968);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f22264 = typedArrayObtainStyledAttributes.getInt(index, this.f22264);
            } else if (index == 1) {
                this.f22262 = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m19400(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            identifier = -1;
        }
        return (identifier != -1 || str.length() <= 1) ? identifier : Integer.parseInt(str.substring(1));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m19402(Context context, XmlResourceParser xmlResourceParser) {
        C4201 c4201 = new C4201();
        c4201.m12680();
        int attributeCount = xmlResourceParser.getAttributeCount();
        int iM19400 = -1;
        int iM19401 = -1;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            attributeName.getClass();
            if (attributeName.equals("deriveConstraintsFrom")) {
                iM19401 = m19400(context, attributeValue);
            } else if (attributeName.equals("id")) {
                iM19400 = m19400(context, attributeValue);
                int iIndexOf = attributeValue.indexOf(47);
                if (iIndexOf >= 0) {
                    attributeValue = attributeValue.substring(iIndexOf + 1);
                }
                this.f22260.put(attributeValue, Integer.valueOf(iM19400));
            }
        }
        if (iM19400 != -1) {
            int i2 = this.f22254.f30311;
            c4201.m12672(context, xmlResourceParser);
            if (iM19401 != -1) {
                this.f22269.put(iM19400, iM19401);
            }
            this.f22263.put(iM19400, c4201);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4201 m19409(int i) {
        int iM14279;
        C4906 c4906 = this.f22267;
        if (c4906 != null && (iM14279 = c4906.m14279(i)) != -1) {
            i = iM14279;
        }
        SparseArray sparseArray = this.f22263;
        if (sparseArray.get(i) == null) {
            C0050.m931(this.f22254.getContext(), i);
            return (C4201) sparseArray.get(sparseArray.keyAt(0));
        }
        return (C4201) sparseArray.get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19415(C19248 c19248) {
        C13601 c13601 = this.f22265;
        if (c13601 != null) {
            Iterator it = c13601.f40562.iterator();
            while (it.hasNext()) {
                ((C23480) it.next()).m51934(c19248);
            }
        } else {
            C13601 c13602 = this.f22261;
            if (c13602 != null) {
                Iterator it2 = c13602.f40562.iterator();
                while (it2.hasNext()) {
                    ((C23480) it2.next()).m51934(c19248);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m19419() {
        Iterator it = this.f22252.iterator();
        while (it.hasNext()) {
            if (((C13601) it.next()).f40556 != null) {
                return true;
            }
        }
        C13601 c13601 = this.f22265;
        return (c13601 == null || c13601.f40556 == null) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19411(MotionEvent motionEvent, int i, C10075 c10075) {
        InterfaceC19953 interfaceC19953;
        InterfaceC19953 interfaceC19954;
        MotionEvent motionEvent2;
        C13601 c13601;
        int iM14279;
        Iterator it;
        RectF rectF = new RectF();
        InterfaceC19953 interfaceC19955 = this.f22256;
        C10075 c10076 = this.f22254;
        if (interfaceC19955 == null) {
            c10076.getClass();
            this.f22256 = C4430.m13150();
        }
        VelocityTracker velocityTracker = ((C4430) this.f22256).f14164;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (i != -1) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f22259 = motionEvent.getRawX();
                this.f22258 = motionEvent.getRawY();
                this.f22268 = motionEvent;
                this.f22257 = false;
                if (this.f22265.f40556 != null) {
                    RectF rectFM32500 = this.f22265.f40556.m32500(c10076, rectF);
                    if (rectFM32500 == null || rectFM32500.contains(this.f22268.getX(), this.f22268.getY())) {
                        RectF rectFM32505 = this.f22265.f40556.m32505(c10076, rectF);
                        if (rectFM32505 != null && !rectFM32505.contains(this.f22268.getX(), this.f22268.getY())) {
                            this.f22255 = true;
                        } else {
                            this.f22255 = false;
                        }
                        this.f22265.f40556.m32511(this.f22259, this.f22258);
                        return;
                    }
                    this.f22268 = null;
                    this.f22257 = true;
                    return;
                }
                return;
            }
            if (action == 2 && !this.f22257) {
                float rawY = motionEvent.getRawY() - this.f22258;
                float rawX = motionEvent.getRawX() - this.f22259;
                if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent2 = this.f22268) == null) {
                    return;
                }
                if (i != -1) {
                    C4906 c4906 = this.f22267;
                    if (c4906 == null || (iM14279 = c4906.m14279(i)) == -1) {
                        iM14279 = i;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (C13601 c13602 : this.f22252) {
                        if (c13602.f40567 == iM14279 || c13602.f40564 == iM14279) {
                            arrayList.add(c13602);
                        }
                    }
                    RectF rectF2 = new RectF();
                    Iterator it2 = arrayList.iterator();
                    float f = 0.0f;
                    c13601 = null;
                    while (it2.hasNext()) {
                        C13601 c13603 = (C13601) it2.next();
                        if (c13603.f40573 || c13603.f40556 == null) {
                            it = it2;
                        } else {
                            c13603.f40556.m32502(this.f22266);
                            RectF rectFM32506 = c13603.f40556.m32505(c10076, rectF2);
                            if (rectFM32506 != null) {
                                it = it2;
                                if (!rectFM32506.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                }
                            } else {
                                it = it2;
                            }
                            RectF rectFM32507 = c13603.f40556.m32505(c10076, rectF2);
                            if (rectFM32507 == null || rectFM32507.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                float fM32498 = c13603.f40556.m32498(rawX, rawY) * (c13603.f40564 == i ? -1.0f : 1.1f);
                                if (fM32498 > f) {
                                    f = fM32498;
                                    c13601 = c13603;
                                }
                            }
                        }
                        it2 = it;
                    }
                } else {
                    c13601 = this.f22265;
                }
                if (c13601 != null) {
                    c10075.m25318(c13601);
                    RectF rectFM32508 = this.f22265.f40556.m32505(c10076, rectF);
                    this.f22255 = (rectFM32508 == null || rectFM32508.contains(this.f22268.getX(), this.f22268.getY())) ? false : true;
                    this.f22265.f40556.m32507(this.f22259, this.f22258);
                }
            }
        }
        if (this.f22257) {
            return;
        }
        C13601 c13604 = this.f22265;
        if (c13604 != null && c13604.f40556 != null && !this.f22255) {
            this.f22265.f40556.m32501(motionEvent, this.f22256);
        }
        this.f22259 = motionEvent.getRawX();
        this.f22258 = motionEvent.getRawY();
        if (motionEvent.getAction() != 1 || (interfaceC19953 = this.f22256) == null) {
            return;
        }
        C4430 c4430 = (C4430) interfaceC19953;
        VelocityTracker velocityTracker2 = c4430.f14164;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            interfaceC19954 = null;
            c4430.f14164 = null;
        } else {
            interfaceC19954 = null;
        }
        this.f22256 = interfaceC19954;
        int i2 = c10075.f30314;
        if (i2 != -1) {
            m19418(c10075, i2);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m19421() {
        C13601 c13601 = this.f22265;
        if (c13601 == null) {
            return -1;
        }
        return c13601.f40567;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Interpolator m19420() {
        int i = this.f22265.f40569;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.f22254.getContext(), this.f22265.f40568);
        }
        if (i == -1) {
            return new InterpolatorC11486(C8518.m22210(this.f22265.f40565));
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new AnticipateInterpolator();
        }
        if (i != 5) {
            return null;
        }
        return new BounceInterpolator();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m19417() {
        C13601 c13601 = this.f22265;
        if (c13601 != null) {
            return c13601.f40561;
        }
        return this.f22264;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float m19422() {
        C13601 c13601 = this.f22265;
        if (c13601 == null || c13601.f40556 == null) {
            return 0.0f;
        }
        return this.f22265.f40556.m32503();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19412(C10075 c10075) {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f22263;
            if (i < sparseArray.size()) {
                int iKeyAt = sparseArray.keyAt(i);
                SparseIntArray sparseIntArray = this.f22269;
                int i2 = sparseIntArray.get(iKeyAt);
                int size = sparseIntArray.size();
                while (i2 > 0) {
                    if (i2 == iKeyAt) {
                        return;
                    }
                    int i3 = size - 1;
                    if (size < 0) {
                        return;
                    }
                    i2 = sparseIntArray.get(i2);
                    size = i3;
                }
                m19404(iKeyAt);
                i++;
            } else {
                for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                    ((C4201) sparseArray.valueAt(i4)).m12681(c10075);
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m19404(int i) {
        SparseIntArray sparseIntArray = this.f22269;
        int i2 = sparseIntArray.get(i);
        if (i2 > 0) {
            m19404(sparseIntArray.get(i));
            SparseArray sparseArray = this.f22263;
            C4201 c4201 = (C4201) sparseArray.get(i);
            C4201 c4202 = (C4201) sparseArray.get(i2);
            if (c4202 == null) {
                C0050.m931(this.f22254.getContext(), i2);
            } else {
                c4201.m12673(c4202);
                sparseIntArray.put(i, -1);
            }
        }
    }
}
