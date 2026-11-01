package p067l;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ܺ᩻ */
/* JADX INFO: compiled from: Y22J */
/* JADX INFO: loaded from: classes5.dex */
public final class C1648 extends C1263 implements InterfaceC1493 {

    /* JADX INFO: renamed from: ܽ֫ */
    public boolean f53176;

    /* JADX INFO: renamed from: ܿ֫ */
    public AbstractC1298 f53177;

    /* JADX INFO: renamed from: ᩳ֫ */
    public C2033 f53178;

    /* JADX INFO: renamed from: ᩻֫ */
    public int f53179 = -1;

    /* JADX INFO: renamed from: ܳ֫ */
    public int f53175 = -1;

    /* JADX INFO: renamed from: ֫ */
    public static C1648 m40440(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        int depth;
        Drawable drawableM7585;
        int next;
        int next2;
        Context context2 = context;
        Resources resources2 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlResourceParser.getName();
        if (name.equals("animated-selector")) {
            C1648 c1648 = new C1648(null, null);
            TypedArray typedArrayM11087 = C0989.m11087(resources2, theme2, attributeSet2, C1928.f72828);
            int i = 1;
            c1648.setVisible(typedArrayM11087.getBoolean(1, true), true);
            C2033 c2033 = c1648.f53178;
            c2033.f63344 |= C1613.m38859(typedArrayM11087);
            int i2 = 2;
            c2033.f63340 = typedArrayM11087.getBoolean(2, c2033.f63340);
            int i3 = 3;
            c2033.f63347 = typedArrayM11087.getBoolean(3, c2033.f63347);
            int i4 = 4;
            c2033.f63342 = typedArrayM11087.getInt(4, c2033.f63342);
            c2033.f63351 = typedArrayM11087.getInt(5, c2033.f63351);
            boolean z = false;
            c1648.setDither(typedArrayM11087.getBoolean(0, c2033.f63329));
            c1648.m47789(resources2);
            typedArrayM11087.recycle();
            int depth2 = xmlResourceParser.getDepth() + 1;
            while (true) {
                int next3 = xmlResourceParser.next();
                if (next3 == i || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == i3)) {
                    break;
                }
                if (next3 == i2 && depth <= depth2) {
                    if (!xmlResourceParser.getName().equals("item")) {
                        if (xmlResourceParser.getName().equals("transition")) {
                            TypedArray typedArrayM11088 = C0989.m11087(resources2, theme2, attributeSet2, C1928.f72830);
                            int resourceId = typedArrayM11088.getResourceId(2, -1);
                            int resourceId2 = typedArrayM11088.getResourceId(1, -1);
                            int resourceId3 = typedArrayM11088.getResourceId(z ? 1 : 0, -1);
                            drawableM7585 = resourceId3 > 0 ? C0920.m7578().m7585(context2, resourceId3) : null;
                            boolean z2 = typedArrayM11088.getBoolean(3, z);
                            typedArrayM11088.recycle();
                            if (drawableM7585 == null) {
                                do {
                                    next = xmlResourceParser.next();
                                } while (next == i4);
                                if (next != 2) {
                                    throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                                }
                                if (xmlResourceParser.getName().equals("animated-vector")) {
                                    drawableM7585 = C22505.m50464(context, resources, xmlResourceParser, attributeSet, theme);
                                } else {
                                    drawableM7585 = C1613.m38860(resources, xmlResourceParser, attributeSet, theme);
                                }
                            }
                            if (drawableM7585 == null) {
                                throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                            if (resourceId == -1 || resourceId2 == -1) {
                                throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
                            }
                            C2033 c2034 = c1648.f53178;
                            int iM46266 = c2034.m46266(drawableM7585);
                            long j = resourceId;
                            long j2 = resourceId2;
                            long j3 = (j << 32) | j2;
                            long j4 = z2 ? 8589934592L : 0L;
                            long j5 = iM46266;
                            c2034.f80591.m17610(j3, Long.valueOf(j5 | j4));
                            if (z2) {
                                c2034.f80591.m17610((j2 << 32) | j, Long.valueOf(j5 | Blake2xsDigest.MAX_NUMBER_BLOCKS | j4));
                            }
                            i = 1;
                            z = false;
                            i2 = 2;
                            i3 = 3;
                            i4 = 4;
                        }
                        context2 = context;
                        resources2 = resources;
                        attributeSet2 = attributeSet;
                        theme2 = theme;
                    } else {
                        TypedArray typedArrayM11089 = C0989.m11087(resources2, theme2, attributeSet2, C1928.f72829);
                        int resourceId4 = typedArrayM11089.getResourceId(z ? 1 : 0, z ? 1 : 0);
                        int resourceId5 = typedArrayM11089.getResourceId(i, -1);
                        drawableM7585 = resourceId5 > 0 ? C0920.m7578().m7585(context2, resourceId5) : null;
                        typedArrayM11089.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr = new int[attributeCount];
                        int i5 = 0;
                        for (int i6 = 0; i6 < attributeCount; i6++) {
                            int attributeNameResource = attributeSet2.getAttributeNameResource(i6);
                            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                                int i7 = i5 + 1;
                                if (!attributeSet2.getAttributeBooleanValue(i6, z)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr[i5] = attributeNameResource;
                                i5 = i7;
                            }
                        }
                        int[] iArrTrimStateSet = StateSet.trimStateSet(iArr, i5);
                        if (drawableM7585 == null) {
                            do {
                                next2 = xmlResourceParser.next();
                            } while (next2 == i4);
                            if (next2 != 2) {
                                throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                            if (xmlResourceParser.getName().equals("vector")) {
                                drawableM7585 = C23845.m52914(resources, xmlResourceParser, attributeSet, theme);
                            } else {
                                drawableM7585 = C1613.m38860(resources, xmlResourceParser, attributeSet, theme);
                            }
                        }
                        if (drawableM7585 == null) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        C2033 c2035 = c1648.f53178;
                        int iM46267 = c2035.m46266(drawableM7585);
                        c2035.f7918[iM46267] = iArrTrimStateSet;
                        c2035.f80590.m34390(iM46267, Integer.valueOf(resourceId4));
                    }
                    i = 1;
                    i2 = 2;
                    i3 = 3;
                    context2 = context;
                    resources2 = resources;
                    attributeSet2 = attributeSet;
                    theme2 = theme;
                }
            }
            c1648.onStateChange(c1648.getState());
            return c1648;
        }
        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    @Override // p067l.C1823, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        AbstractC1298 abstractC1298 = this.f53177;
        if (abstractC1298 != null && (visible || z2)) {
            if (z) {
                abstractC1298.mo21040();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }

    @Override // p067l.C1823, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC1298 abstractC1298 = this.f53177;
        if (abstractC1298 != null) {
            abstractC1298.mo21041();
            this.f53177 = null;
            m47791(this.f53179);
            this.f53179 = -1;
            this.f53175 = -1;
        }
    }

    public C1648(C2033 c2033, Resources resources) {
        mo24159(new C2033(c2033, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    @Override // p067l.C1263, p067l.C1823, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f53176) {
            super.mutate();
            this.f53178.mo7192();
            this.f53176 = true;
        }
        return this;
    }

    @Override // p067l.C1823
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC1788 mo40441() {
        return new C2033(this.f53178, this, null);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fe  */
    @Override // p067l.C1263, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int iM47792;
        int iIntValue;
        AbstractC1298 c1578;
        boolean z = false;
        C2033 c2033 = this.f53178;
        int iM7191 = c2033.m7191(iArr);
        if (iM7191 < 0) {
            iM7191 = c2033.m7191(StateSet.WILD_CARD);
        }
        if (iM7191 != m47792()) {
            AbstractC1298 abstractC1298 = this.f53177;
            if (abstractC1298 != null) {
                if (iM7191 != this.f53179) {
                    if (iM7191 == this.f53175 && abstractC1298.mo25634()) {
                        abstractC1298.mo25635();
                        this.f53179 = this.f53175;
                        this.f53175 = iM7191;
                    } else {
                        iM47792 = this.f53179;
                        abstractC1298.mo21041();
                    }
                }
                z = true;
            } else {
                iM47792 = m47792();
            }
            this.f53177 = null;
            this.f53175 = -1;
            this.f53179 = -1;
            C2033 c2034 = this.f53178;
            if (iM47792 < 0) {
                c2034.getClass();
                iIntValue = 0;
            } else {
                iIntValue = ((Integer) c2034.f80590.m34385(iM47792, (Integer) 0)).intValue();
            }
            int iIntValue2 = iM7191 < 0 ? 0 : ((Integer) c2034.f80590.m34385(iM7191, (Integer) 0)).intValue();
            if (iIntValue2 == 0 || iIntValue == 0) {
                if (m47791(iM7191)) {
                    z = true;
                }
            } else {
                long j = (((long) iIntValue) << 32) | ((long) iIntValue2);
                int iLongValue = (int) ((Long) c2034.f80591.m17612(j, -1L)).longValue();
                if (iLongValue < 0) {
                    if (m47791(iM7191)) {
                        z = true;
                    }
                } else {
                    boolean z2 = (((Long) c2034.f80591.m17612(j, -1L)).longValue() & 8589934592L) != 0;
                    m47791(iLongValue);
                    Object current = getCurrent();
                    if (current instanceof AnimationDrawable) {
                        c1578 = new C1893((AnimationDrawable) current, (((Long) c2034.f80591.m17612(j, -1L)).longValue() & Blake2xsDigest.MAX_NUMBER_BLOCKS) != 0, z2);
                    } else if (current instanceof C22505) {
                        c1578 = new C1193((C22505) current);
                    } else if (!(current instanceof Animatable)) {
                        if (m47791(iM7191)) {
                            z = true;
                        }
                    } else {
                        c1578 = new C1578((Animatable) current);
                    }
                    c1578.mo21040();
                    this.f53177 = c1578;
                    this.f53175 = iM47792;
                    this.f53179 = iM7191;
                    z = true;
                }
            }
        }
        Drawable current2 = getCurrent();
        return current2 != null ? current2.setState(iArr) | z : z;
    }

    @Override // p067l.C1263, p067l.C1823
    /* JADX INFO: renamed from: ֫ */
    public final void mo24159(AbstractC1788 abstractC1788) {
        super.mo24159(abstractC1788);
        if (abstractC1788 instanceof C2033) {
            this.f53178 = (C2033) abstractC1788;
        }
    }
}
