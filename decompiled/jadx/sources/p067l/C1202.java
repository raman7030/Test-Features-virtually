package p067l;

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
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.۟ۚ */
/* JADX INFO: compiled from: 11CW */
/* JADX INFO: loaded from: classes2.dex */
public final class C1202 {

    /* JADX INFO: renamed from: ֡ */
    public ArrayList f25142;

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f25143;

    /* JADX INFO: renamed from: ۖ */
    public final C1342 f25144;

    /* JADX INFO: renamed from: ۘ */
    public boolean f25145;

    /* JADX INFO: renamed from: ۚ */
    public InterfaceC1832 f25146;

    /* JADX INFO: renamed from: ۜ */
    public boolean f25147;

    /* JADX INFO: renamed from: ۡ */
    public float f25148;

    /* JADX INFO: renamed from: ۢ */
    public float f25149;

    /* JADX INFO: renamed from: ۧ */
    public HashMap f25150;

    /* JADX INFO: renamed from: ܳ */
    public C1517 f25151;

    /* JADX INFO: renamed from: ܺ */
    public int f25152;

    /* JADX INFO: renamed from: ܽ */
    public SparseArray f25153;

    /* JADX INFO: renamed from: ܿ */
    public int f25154;

    /* JADX INFO: renamed from: ᩳ */
    public C1517 f25155;

    /* JADX INFO: renamed from: ᩴ */
    public boolean f25156;

    /* JADX INFO: renamed from: ᩵ */
    public C1085 f25157;

    /* JADX INFO: renamed from: ᩷ */
    public MotionEvent f25158;

    /* JADX INFO: renamed from: ᩻ */
    public SparseIntArray f25159;

    /* JADX WARN: Code duplicated, block: B:16:0x0024  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public final void m21376(int i, int i2) {
        int iM16176;
        int iM16177;
        ArrayList arrayList;
        Iterator it;
        C1517 c1517;
        C1517 c1518;
        C1517 c1519;
        C1085 c1085 = this.f25157;
        if (c1085 != null) {
            iM16176 = c1085.m16176(i);
            if (iM16176 == -1) {
                iM16176 = i;
            }
            iM16177 = this.f25157.m16176(i2);
            if (iM16177 == -1) {
            }
            arrayList = this.f25142;
            it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    c1517 = this.f25151;
                    for (C1517 c15110 : this.f25143) {
                        if (c15110.f43642 == i2) {
                            c1517 = c15110;
                        }
                    }
                    c1518 = new C1517(this, c1517);
                    c1518.f43645 = iM16176;
                    c1518.f43642 = iM16177;
                    if (iM16176 != -1) {
                        arrayList.add(c1518);
                    }
                    this.f25155 = c1518;
                    return;
                }
                c1519 = (C1517) it.next();
                if ((c1519.f43642 != iM16177 && c1519.f43645 == iM16176) || (c1519.f43642 == i2 && c1519.f43645 == i)) {
                    break;
                }
            }
            this.f25155 = c1519;
            if (c1519.f43634 != null) {
                this.f25155.f43634.m34604(this.f25156);
            }
        }
        iM16176 = i;
        iM16177 = i2;
        arrayList = this.f25142;
        it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                c1517 = this.f25151;
                while (r8.hasNext()) {
                    if (c15110.f43642 == i2) {
                        c1517 = c15110;
                    }
                }
                c1518 = new C1517(this, c1517);
                c1518.f43645 = iM16176;
                c1518.f43642 = iM16177;
                if (iM16176 != -1) {
                    arrayList.add(c1518);
                }
                this.f25155 = c1518;
                return;
            }
            c1519 = (C1517) it.next();
            if (c1519.f43642 != iM16177) {
            }
        }
        this.f25155 = c1519;
        if (c1519.f43634 != null) {
            this.f25155.f43634.m34604(this.f25156);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21380(C1517 c1517) {
        this.f25155 = c1517;
        if (c1517.f43634 != null) {
            this.f25155.f43634.m34604(this.f25156);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21379(C1342 c1342, int i) {
        View viewFindViewById;
        View viewFindViewById2;
        ArrayList<C1517> arrayList = this.f25142;
        for (C1517 c1517 : arrayList) {
            if (c1517.f43637.size() > 0) {
                Iterator it = c1517.f43637.iterator();
                while (it.hasNext()) {
                    int i2 = ((ViewOnClickListenerC1972) it.next()).f76259;
                    if (i2 != -1 && (viewFindViewById2 = c1342.findViewById(i2)) != null) {
                        viewFindViewById2.setOnClickListener(null);
                    }
                }
            }
        }
        ArrayList<C1517> arrayList2 = this.f25143;
        for (C1517 c1518 : arrayList2) {
            if (c1518.f43637.size() > 0) {
                Iterator it2 = c1518.f43637.iterator();
                while (it2.hasNext()) {
                    int i3 = ((ViewOnClickListenerC1972) it2.next()).f76259;
                    if (i3 != -1 && (viewFindViewById = c1342.findViewById(i3)) != null) {
                        viewFindViewById.setOnClickListener(null);
                    }
                }
            }
        }
        for (C1517 c1519 : arrayList) {
            if (c1519.f43637.size() > 0) {
                Iterator it3 = c1519.f43637.iterator();
                while (it3.hasNext()) {
                    ((ViewOnClickListenerC1972) it3.next()).m53192(c1342, i, c1519);
                }
            }
        }
        for (C1517 c15110 : arrayList2) {
            if (c15110.f43637.size() > 0) {
                Iterator it4 = c15110.f43637.iterator();
                while (it4.hasNext()) {
                    ((ViewOnClickListenerC1972) it4.next()).m53192(c1342, i, c15110);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m21374() {
        return this.f25142;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m21384(C1342 c1342, int i) {
        if (this.f25146 != null) {
            return false;
        }
        for (C1517 c1517 : this.f25142) {
            if (c1517.f43635 != 0 && this.f25155 != c1517) {
                if (i == c1517.f43645 && (c1517.f43635 == 4 || c1517.f43635 == 2)) {
                    EnumC1447 enumC1447 = EnumC1447.FINISHED;
                    c1342.m27336(enumC1447);
                    c1342.m27337(c1517);
                    if (c1517.f43635 != 4) {
                        c1342.m27340(1.0f);
                        c1342.m27338(true);
                        c1342.m27336(EnumC1447.SETUP);
                        c1342.m27336(EnumC1447.MOVING);
                        c1342.m27336(enumC1447);
                        c1342.m27342();
                        return true;
                    }
                    c1342.m27329(1.0f);
                    c1342.m27336(EnumC1447.SETUP);
                    c1342.m27336(EnumC1447.MOVING);
                    return true;
                }
                if (i == c1517.f43642 && (c1517.f43635 == 3 || c1517.f43635 == 1)) {
                    EnumC1447 enumC1448 = EnumC1447.FINISHED;
                    c1342.m27336(enumC1448);
                    c1342.m27337(c1517);
                    if (c1517.f43635 != 3) {
                        c1342.m27340(0.0f);
                        c1342.m27338(true);
                        c1342.m27336(EnumC1447.SETUP);
                        c1342.m27336(EnumC1447.MOVING);
                        c1342.m27336(enumC1448);
                        c1342.m27342();
                        return true;
                    }
                    c1342.m27329(0.0f);
                    c1342.m27336(EnumC1447.SETUP);
                    c1342.m27336(EnumC1447.MOVING);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21382(boolean z) {
        this.f25156 = z;
        C1517 c1517 = this.f25155;
        if (c1517 == null || c1517.f43634 == null) {
            return;
        }
        this.f25155.f43634.m34604(this.f25156);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C1202(Context context, C1342 c1342, int i) {
        C1517 c1517 = null;
        this.f25157 = null;
        this.f25155 = null;
        ArrayList arrayList = new ArrayList();
        this.f25142 = arrayList;
        this.f25151 = null;
        this.f25143 = new ArrayList();
        this.f25153 = new SparseArray();
        this.f25150 = new HashMap();
        this.f25159 = new SparseIntArray();
        this.f25154 = 400;
        this.f25152 = 0;
        this.f25147 = false;
        this.f25145 = false;
        this.f25144 = c1342;
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
                                m21368(context, xml);
                            }
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                c1517.f43640.add(new C2007(context, xml));
                            }
                            break;
                        case 269306229:
                            if (name.equals(AbstractC18164.LOG_TAG)) {
                                c1517 = new C1517(this, context, xml);
                                arrayList.add(c1517);
                                if (this.f25155 == null && !c1517.f43641) {
                                    this.f25155 = c1517;
                                    if (c1517.f43634 != null) {
                                        this.f25155.f43634.m34604(this.f25156);
                                    }
                                }
                                if (c1517.f43641) {
                                    if (c1517.f43642 == -1) {
                                        this.f25151 = c1517;
                                    } else {
                                        this.f25143.add(c1517);
                                    }
                                    arrayList.remove(c1517);
                                }
                            }
                            break;
                        case 312750793:
                            if (name.equals("OnClick")) {
                                c1517.m34804(context, xml);
                            }
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                if (c1517 == null) {
                                    context.getResources().getResourceEntryName(i);
                                    xml.getLineNumber();
                                }
                                c1517.f43634 = new C1511(context, this.f25144, xml);
                            }
                            break;
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                m21371(context, xml);
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                this.f25157 = new C1085(context, xml);
                            }
                            break;
                    }
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
        this.f25153.put(R.id.MT_Protector, new C1050());
        this.f25150.put("motion_base", Integer.valueOf(R.id.MT_Protector));
    }

    /* JADX INFO: renamed from: ۧ */
    private void m21371(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C1925.f72677);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f25154 = typedArrayObtainStyledAttributes.getInt(index, this.f25154);
            } else if (index == 1) {
                this.f25152 = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ֫ */
    private int m21366(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            identifier = -1;
        }
        return (identifier != -1 || str.length() <= 1) ? identifier : Integer.parseInt(str.substring(1));
    }

    /* JADX INFO: renamed from: ֫ */
    private void m21368(Context context, XmlResourceParser xmlResourceParser) {
        C1050 c1050 = new C1050();
        c1050.m14556();
        int attributeCount = xmlResourceParser.getAttributeCount();
        int iM21366 = -1;
        int iM21367 = -1;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            attributeName.getClass();
            if (attributeName.equals("deriveConstraintsFrom")) {
                iM21367 = m21366(context, attributeValue);
            } else if (attributeName.equals("id")) {
                iM21366 = m21366(context, attributeValue);
                int iIndexOf = attributeValue.indexOf(47);
                if (iIndexOf >= 0) {
                    attributeValue = attributeValue.substring(iIndexOf + 1);
                }
                this.f25150.put(attributeValue, Integer.valueOf(iM21366));
            }
        }
        if (iM21366 != -1) {
            int i2 = this.f25144.f33272;
            c1050.m14548(context, xmlResourceParser);
            if (iM21367 != -1) {
                this.f25159.put(iM21366, iM21367);
            }
            this.f25153.put(iM21366, c1050);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C1050 m21375(int i) {
        int iM16176;
        C1085 c1085 = this.f25157;
        if (c1085 != null && (iM16176 = c1085.m16176(i)) != -1) {
            i = iM16176;
        }
        SparseArray sparseArray = this.f25153;
        if (sparseArray.get(i) == null) {
            C0845.m3341(this.f25144.getContext(), i);
            return (C1050) sparseArray.get(sparseArray.keyAt(0));
        }
        return (C1050) sparseArray.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21381(C1797 c1797) {
        C1517 c1517 = this.f25155;
        if (c1517 != null) {
            Iterator it = c1517.f43640.iterator();
            while (it.hasNext()) {
                ((C2007) it.next()).m54336(c1797);
            }
        } else {
            C1517 c1518 = this.f25151;
            if (c1518 != null) {
                Iterator it2 = c1518.f43640.iterator();
                while (it2.hasNext()) {
                    ((C2007) it2.next()).m54336(c1797);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m21385() {
        Iterator it = this.f25142.iterator();
        while (it.hasNext()) {
            if (((C1517) it.next()).f43634 != null) {
                return true;
            }
        }
        C1517 c1517 = this.f25155;
        return (c1517 == null || c1517.f43634 == null) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21377(MotionEvent motionEvent, int i, C1342 c1342) {
        InterfaceC1832 interfaceC1832;
        InterfaceC1832 interfaceC1833;
        MotionEvent motionEvent2;
        C1517 c1517;
        int iM16176;
        Iterator it;
        RectF rectF = new RectF();
        InterfaceC1832 interfaceC1834 = this.f25146;
        C1342 c1343 = this.f25144;
        if (interfaceC1834 == null) {
            c1343.getClass();
            this.f25146 = C1062.m15031();
        }
        VelocityTracker velocityTracker = ((C1062) this.f25146).f16989;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (i != -1) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f25149 = motionEvent.getRawX();
                this.f25148 = motionEvent.getRawY();
                this.f25158 = motionEvent;
                this.f25147 = false;
                if (this.f25155.f43634 != null) {
                    RectF rectFM34602 = this.f25155.f43634.m34602(c1343, rectF);
                    if (rectFM34602 == null || rectFM34602.contains(this.f25158.getX(), this.f25158.getY())) {
                        RectF rectFM34607 = this.f25155.f43634.m34607(c1343, rectF);
                        if (rectFM34607 != null && !rectFM34607.contains(this.f25158.getX(), this.f25158.getY())) {
                            this.f25145 = true;
                        } else {
                            this.f25145 = false;
                        }
                        this.f25155.f43634.m34613(this.f25149, this.f25148);
                        return;
                    }
                    this.f25158 = null;
                    this.f25147 = true;
                    return;
                }
                return;
            }
            if (action == 2 && !this.f25147) {
                float rawY = motionEvent.getRawY() - this.f25148;
                float rawX = motionEvent.getRawX() - this.f25149;
                if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent2 = this.f25158) == null) {
                    return;
                }
                if (i != -1) {
                    C1085 c1085 = this.f25157;
                    if (c1085 == null || (iM16176 = c1085.m16176(i)) == -1) {
                        iM16176 = i;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (C1517 c1518 : this.f25142) {
                        if (c1518.f43645 == iM16176 || c1518.f43642 == iM16176) {
                            arrayList.add(c1518);
                        }
                    }
                    RectF rectF2 = new RectF();
                    Iterator it2 = arrayList.iterator();
                    float f = 0.0f;
                    c1517 = null;
                    while (it2.hasNext()) {
                        C1517 c1519 = (C1517) it2.next();
                        if (c1519.f43651 || c1519.f43634 == null) {
                            it = it2;
                        } else {
                            c1519.f43634.m34604(this.f25156);
                            RectF rectFM34608 = c1519.f43634.m34607(c1343, rectF2);
                            if (rectFM34608 != null) {
                                it = it2;
                                if (!rectFM34608.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                }
                            } else {
                                it = it2;
                            }
                            RectF rectFM34609 = c1519.f43634.m34607(c1343, rectF2);
                            if (rectFM34609 == null || rectFM34609.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                float fM34600 = c1519.f43634.m34600(rawX, rawY) * (c1519.f43642 == i ? -1.0f : 1.1f);
                                if (fM34600 > f) {
                                    f = fM34600;
                                    c1517 = c1519;
                                }
                            }
                        }
                        it2 = it;
                    }
                } else {
                    c1517 = this.f25155;
                }
                if (c1517 != null) {
                    c1342.m27337(c1517);
                    RectF rectFM346010 = this.f25155.f43634.m34607(c1343, rectF);
                    this.f25145 = (rectFM346010 == null || rectFM346010.contains(this.f25158.getX(), this.f25158.getY())) ? false : true;
                    this.f25155.f43634.m34609(this.f25149, this.f25148);
                }
            }
        }
        if (this.f25147) {
            return;
        }
        C1517 c15110 = this.f25155;
        if (c15110 != null && c15110.f43634 != null && !this.f25145) {
            this.f25155.f43634.m34603(motionEvent, this.f25146);
        }
        this.f25149 = motionEvent.getRawX();
        this.f25148 = motionEvent.getRawY();
        if (motionEvent.getAction() != 1 || (interfaceC1832 = this.f25146) == null) {
            return;
        }
        C1062 c1062 = (C1062) interfaceC1832;
        VelocityTracker velocityTracker2 = c1062.f16989;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            interfaceC1833 = null;
            c1062.f16989 = null;
        } else {
            interfaceC1833 = null;
        }
        this.f25146 = interfaceC1833;
        int i2 = c1342.f33275;
        if (i2 != -1) {
            m21384(c1342, i2);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m21387() {
        C1517 c1517 = this.f25155;
        if (c1517 == null) {
            return -1;
        }
        return c1517.f43645;
    }

    /* JADX INFO: renamed from: ܽ */
    public final Interpolator m21386() {
        int i = this.f25155.f43647;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.f25144.getContext(), this.f25155.f43646);
        }
        if (i == -1) {
            return new InterpolatorC1412(C1265.m24178(this.f25155.f43643));
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

    /* JADX INFO: renamed from: ۧ */
    public final int m21383() {
        C1517 c1517 = this.f25155;
        if (c1517 != null) {
            return c1517.f43639;
        }
        return this.f25154;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final float m21388() {
        C1517 c1517 = this.f25155;
        if (c1517 == null || c1517.f43634 == null) {
            return 0.0f;
        }
        return this.f25155.f43634.m34605();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21378(C1342 c1342) {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f25153;
            if (i < sparseArray.size()) {
                int iKeyAt = sparseArray.keyAt(i);
                SparseIntArray sparseIntArray = this.f25159;
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
                m21370(iKeyAt);
                i++;
            } else {
                for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                    ((C1050) sparseArray.valueAt(i4)).m14557(c1342);
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m21370(int i) {
        SparseIntArray sparseIntArray = this.f25159;
        int i2 = sparseIntArray.get(i);
        if (i2 > 0) {
            m21370(sparseIntArray.get(i));
            SparseArray sparseArray = this.f25153;
            C1050 c1050 = (C1050) sparseArray.get(i);
            C1050 c1051 = (C1050) sparseArray.get(i2);
            if (c1051 == null) {
                C0845.m3341(this.f25144.getContext(), i2);
            } else {
                c1050.m14549(c1051);
                sparseIntArray.put(i, -1);
            }
        }
    }
}
