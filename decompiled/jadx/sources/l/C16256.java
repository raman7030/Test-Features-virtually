package l;

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

/* JADX INFO: renamed from: l.ܺ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y22J */
/* JADX INFO: loaded from: classes5.dex */
public final class C16256 extends C8496 implements InterfaceC13122 {

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public boolean f50007;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public AbstractC9202 f50008;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public C24018 f50009;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public int f50010 = -1;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public int f50006 = -1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16256 m38226(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        int depth;
        Drawable drawableM5356;
        int next;
        int next2;
        Context context2 = context;
        Resources resources2 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlResourceParser.getName();
        if (name.equals("animated-selector")) {
            C16256 c16256 = new C16256(null, null);
            TypedArray typedArrayM9019 = C2958.m9019(resources2, theme2, attributeSet2, C21902.f70114);
            int i = 1;
            c16256.setVisible(typedArrayM9019.getBoolean(1, true), true);
            C24018 c24018 = c16256.f50009;
            c24018.f60110 |= C15550.m36698(typedArrayM9019);
            int i2 = 2;
            c24018.f60106 = typedArrayM9019.getBoolean(2, c24018.f60106);
            int i3 = 3;
            c24018.f60113 = typedArrayM9019.getBoolean(3, c24018.f60113);
            int i4 = 4;
            c24018.f60108 = typedArrayM9019.getInt(4, c24018.f60108);
            c24018.f60117 = typedArrayM9019.getInt(5, c24018.f60117);
            boolean z = false;
            c16256.setDither(typedArrayM9019.getBoolean(0, c24018.f60095));
            c16256.m45478(resources2);
            typedArrayM9019.recycle();
            int depth2 = xmlResourceParser.getDepth() + 1;
            while (true) {
                int next3 = xmlResourceParser.next();
                if (next3 == i || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == i3)) {
                    break;
                }
                if (next3 == i2 && depth <= depth2) {
                    if (!xmlResourceParser.getName().equals("item")) {
                        if (xmlResourceParser.getName().equals("transition")) {
                            TypedArray typedArrayM90110 = C2958.m9019(resources2, theme2, attributeSet2, C21902.f70116);
                            int resourceId = typedArrayM90110.getResourceId(2, -1);
                            int resourceId2 = typedArrayM90110.getResourceId(1, -1);
                            int resourceId3 = typedArrayM90110.getResourceId(z ? 1 : 0, -1);
                            drawableM5356 = resourceId3 > 0 ? C1566.m5349().m5356(context2, resourceId3) : null;
                            boolean z2 = typedArrayM90110.getBoolean(3, z);
                            typedArrayM90110.recycle();
                            if (drawableM5356 == null) {
                                do {
                                    next = xmlResourceParser.next();
                                } while (next == i4);
                                if (next != 2) {
                                    throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                                }
                                if (xmlResourceParser.getName().equals("animated-vector")) {
                                    drawableM5356 = C21187.m48134(context, resources, xmlResourceParser, attributeSet, theme);
                                } else {
                                    drawableM5356 = C15550.m36699(resources, xmlResourceParser, attributeSet, theme);
                                }
                            }
                            if (drawableM5356 == null) {
                                throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                            if (resourceId == -1 || resourceId2 == -1) {
                                throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
                            }
                            C24018 c24019 = c16256.f50009;
                            int iM43972 = c24019.m43972(drawableM5356);
                            long j = resourceId;
                            long j2 = resourceId2;
                            long j3 = (j << 32) | j2;
                            long j4 = z2 ? 8589934592L : 0L;
                            long j5 = iM43972;
                            c24019.f77839.m15695(j3, Long.valueOf(j5 | j4));
                            if (z2) {
                                c24019.f77839.m15695((j2 << 32) | j, Long.valueOf(j5 | Blake2xsDigest.MAX_NUMBER_BLOCKS | j4));
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
                        TypedArray typedArrayM90111 = C2958.m9019(resources2, theme2, attributeSet2, C21902.f70115);
                        int resourceId4 = typedArrayM90111.getResourceId(z ? 1 : 0, z ? 1 : 0);
                        int resourceId5 = typedArrayM90111.getResourceId(i, -1);
                        drawableM5356 = resourceId5 > 0 ? C1566.m5349().m5356(context2, resourceId5) : null;
                        typedArrayM90111.recycle();
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
                        if (drawableM5356 == null) {
                            do {
                                next2 = xmlResourceParser.next();
                            } while (next2 == i4);
                            if (next2 != 2) {
                                throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                            if (xmlResourceParser.getName().equals("vector")) {
                                drawableM5356 = C22597.m50572(resources, xmlResourceParser, attributeSet, theme);
                            } else {
                                drawableM5356 = C15550.m36699(resources, xmlResourceParser, attributeSet, theme);
                            }
                        }
                        if (drawableM5356 == null) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        C24018 c240110 = c16256.f50009;
                        int iM43973 = c240110.m43972(drawableM5356);
                        c240110.f5145[iM43973] = iArrTrimStateSet;
                        c240110.f77838.m32289(iM43973, Integer.valueOf(resourceId4));
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
            c16256.onStateChange(c16256.getState());
            return c16256;
        }
        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    @Override // l.C19786, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        AbstractC9202 abstractC9202 = this.f50008;
        if (abstractC9202 != null && (visible || z2)) {
            if (z) {
                abstractC9202.mo19082();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }

    @Override // l.C19786, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC9202 abstractC9202 = this.f50008;
        if (abstractC9202 != null) {
            abstractC9202.mo19083();
            this.f50008 = null;
            m45480(this.f50010);
            this.f50010 = -1;
            this.f50006 = -1;
        }
    }

    public C16256(C24018 c24018, Resources resources) {
        mo22191(new C24018(c24018, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    @Override // l.C8496, l.C19786, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f50007) {
            super.mutate();
            this.f50009.mo4949();
            this.f50007 = true;
        }
        return this;
    }

    @Override // l.C19786
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC19080 mo38227() {
        return new C24018(this.f50009, this, null);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fe  */
    @Override // l.C8496, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int iM45481;
        int iIntValue;
        AbstractC9202 c14845;
        boolean z = false;
        C24018 c24018 = this.f50009;
        int iM4948 = c24018.m4948(iArr);
        if (iM4948 < 0) {
            iM4948 = c24018.m4948(StateSet.WILD_CARD);
        }
        if (iM4948 != m45481()) {
            AbstractC9202 abstractC9202 = this.f50008;
            if (abstractC9202 != null) {
                if (iM4948 != this.f50010) {
                    if (iM4948 == this.f50006 && abstractC9202.mo23635()) {
                        abstractC9202.mo23636();
                        this.f50010 = this.f50006;
                        this.f50006 = iM4948;
                    } else {
                        iM45481 = this.f50010;
                        abstractC9202.mo19083();
                    }
                }
                z = true;
            } else {
                iM45481 = m45481();
            }
            this.f50008 = null;
            this.f50006 = -1;
            this.f50010 = -1;
            C24018 c24019 = this.f50009;
            if (iM45481 < 0) {
                c24019.getClass();
                iIntValue = 0;
            } else {
                iIntValue = ((Integer) c24019.f77838.m32284(iM45481, (Integer) 0)).intValue();
            }
            int iIntValue2 = iM4948 < 0 ? 0 : ((Integer) c24019.f77838.m32284(iM4948, (Integer) 0)).intValue();
            if (iIntValue2 == 0 || iIntValue == 0) {
                if (m45480(iM4948)) {
                    z = true;
                }
            } else {
                long j = (((long) iIntValue) << 32) | ((long) iIntValue2);
                int iLongValue = (int) ((Long) c24019.f77839.m15697(j, -1L)).longValue();
                if (iLongValue < 0) {
                    if (m45480(iM4948)) {
                        z = true;
                    }
                } else {
                    boolean z2 = (((Long) c24019.f77839.m15697(j, -1L)).longValue() & 8589934592L) != 0;
                    m45480(iLongValue);
                    Object current = getCurrent();
                    if (current instanceof AnimationDrawable) {
                        c14845 = new C21197((AnimationDrawable) current, (((Long) c24019.f77839.m15697(j, -1L)).longValue() & Blake2xsDigest.MAX_NUMBER_BLOCKS) != 0, z2);
                    } else if (current instanceof C21187) {
                        c14845 = new C7085((C21187) current);
                    } else if (!(current instanceof Animatable)) {
                        if (m45480(iM4948)) {
                            z = true;
                        }
                    } else {
                        c14845 = new C14845((Animatable) current);
                    }
                    c14845.mo19082();
                    this.f50008 = c14845;
                    this.f50006 = iM45481;
                    this.f50010 = iM4948;
                    z = true;
                }
            }
        }
        Drawable current2 = getCurrent();
        return current2 != null ? current2.setState(iArr) | z : z;
    }

    @Override // l.C8496, l.C19786
    /* JADX INFO: renamed from: ֫ */
    public final void mo22191(AbstractC19080 abstractC19080) {
        super.mo22191(abstractC19080);
        if (abstractC19080 instanceof C24018) {
            this.f50009 = (C24018) abstractC19080;
        }
    }
}
