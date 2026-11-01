package p067l;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import com.alipay.sdk.p010m.p052u0.C0226b;
import com.google.android.material.chip.Chip;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ۡ᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84NK */
/* JADX INFO: loaded from: classes3.dex */
public final class C11105 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m25578(int i) {
        return i >= 28 && i <= 31;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Animator m25574(Context context, int i) throws Throwable {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, i);
        }
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                XmlResourceParser animation = resources.getAnimation(i);
                try {
                    Animator animatorM25575 = m25575(context, resources, theme, animation, Xml.asAttributeSet(animation), null, 0);
                    animation.close();
                    return animatorM25575;
                } catch (IOException e) {
                    e = e;
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                    notFoundException.initCause(e);
                    throw notFoundException;
                } catch (XmlPullParserException e2) {
                    e = e2;
                    Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                    notFoundException2.initCause(e);
                    throw notFoundException2;
                } catch (Throwable th) {
                    th = th;
                    xmlResourceParser = animation;
                    if (xmlResourceParser != null) {
                        xmlResourceParser.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (XmlPullParserException e4) {
            e = e4;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static PropertyValuesHolder m25576(TypedArray typedArray, int i, int i2, int i3, String str) {
        int color;
        int color2;
        int color3;
        PropertyValuesHolder propertyValuesHolderOfFloat;
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        boolean z = typedValuePeekValue != null;
        int i4 = z ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i3);
        boolean z2 = typedValuePeekValue2 != null;
        int i5 = z2 ? typedValuePeekValue2.type : 0;
        if (i == 4) {
            i = ((z && m25578(i4)) || (z2 && m25578(i5))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            C1703[] c1703ArrM36822 = C1563.m36822(string);
            C1703[] c1703ArrM36823 = C1563.m36822(string2);
            if (c1703ArrM36822 != null || c1703ArrM36823 != null) {
                if (c1703ArrM36822 != null) {
                    C11776 c11776 = new C11776();
                    if (c1703ArrM36823 == null) {
                        return PropertyValuesHolder.ofObject(str, c11776, c1703ArrM36822);
                    }
                    if (C1563.m36820(c1703ArrM36822, c1703ArrM36823)) {
                        return PropertyValuesHolder.ofObject(str, c11776, c1703ArrM36822, c1703ArrM36823);
                    }
                    throw new InflateException(C20865.m47154(" Can't morph from ", string, " to ", string2));
                }
                if (c1703ArrM36823 != null) {
                    return PropertyValuesHolder.ofObject(str, new C11776(), c1703ArrM36823);
                }
            }
            return null;
        }
        C17809 c17809M40425 = i == 3 ? C17809.m40425() : null;
        if (z3) {
            if (z) {
                float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                if (z2) {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
            }
            propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
        } else if (z) {
            if (i4 == 5) {
                color2 = (int) typedArray.getDimension(i2, 0.0f);
            } else {
                color2 = m25578(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
            }
            if (z2) {
                if (i5 == 5) {
                    color3 = (int) typedArray.getDimension(i3, 0.0f);
                } else {
                    color3 = m25578(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
                }
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2, color3);
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2);
            }
        } else if (z2) {
            if (i5 == 5) {
                color = (int) typedArray.getDimension(i3, 0.0f);
            } else {
                color = m25578(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
            }
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color);
        }
        if (propertyValuesHolderOfInt != null && c17809M40425 != null) {
            propertyValuesHolderOfInt.setEvaluator(c17809M40425);
        }
        return propertyValuesHolderOfInt;
    }

    /* JADX WARN: Code duplicated, block: B:195:0x0364  */
    /* JADX INFO: renamed from: ֫ */
    public static Animator m25575(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i) throws XmlPullParserException, IOException {
        int i2;
        ArrayList arrayList;
        PropertyValuesHolder[] propertyValuesHolderArr;
        String str;
        int i3;
        PropertyValuesHolder propertyValuesHolderM25576;
        int size;
        Keyframe keyframeOfFloat;
        Animator animator;
        Animator animatorM25577;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int depth = xmlPullParser.getDepth();
        Animator animator2 = null;
        ArrayList arrayList2 = null;
        while (true) {
            int next = xmlPullParser.next();
            int i4 = 3;
            boolean z = false;
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                break;
            }
            int i5 = 1;
            if (next == 1) {
                break;
            }
            int i6 = 2;
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    m25577(context, resources, theme, attributeSet, objectAnimator, xmlPullParser);
                    animatorM25577 = objectAnimator;
                } else {
                    if (name.equals("animator")) {
                        animatorM25577 = m25577(context, resources, theme, attributeSet, null, xmlPullParser);
                    } else {
                        boolean zEquals = name.equals("set");
                        String str2 = Chip.NAMESPACE_ANDROID;
                        if (zEquals) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            TypedArray typedArrayM11087 = C0989.m11087(resources2, theme2, attributeSet, C13117.f36854);
                            m25575(context, resources, theme, xmlPullParser, attributeSet, animatorSet2, xmlPullParser2.getAttributeValue(Chip.NAMESPACE_ANDROID, "ordering") != null ? typedArrayM11087.getInt(0, 0) : 0);
                            typedArrayM11087.recycle();
                            animator = animatorSet2;
                            animator2 = animator;
                            i2 = depth;
                            arrayList = arrayList2;
                        } else {
                            String str3 = "propertyValuesHolder";
                            if (!name.equals("propertyValuesHolder")) {
                                throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                            }
                            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
                            ArrayList arrayList3 = null;
                            while (true) {
                                int eventType = xmlPullParser.getEventType();
                                if (eventType == i4 || eventType == i5) {
                                    break;
                                }
                                if (eventType != i6) {
                                    xmlPullParser.next();
                                } else {
                                    if (xmlPullParser.getName().equals(str3)) {
                                        TypedArray typedArrayM11088 = C0989.m11087(resources2, theme2, attributeSetAsAttributeSet, C13117.f36856);
                                        String strM11088 = C0989.m11088(typedArrayM11088, xmlPullParser2, "propertyName", i4);
                                        int i7 = xmlPullParser2.getAttributeValue(str2, "valueType") != null ? typedArrayM11088.getInt(i6, 4) : 4;
                                        ArrayList arrayList4 = null;
                                        int i8 = i7;
                                        while (true) {
                                            int next2 = xmlPullParser.next();
                                            i3 = depth;
                                            if (next2 == 3 || next2 == 1) {
                                                break;
                                            }
                                            if (xmlPullParser.getName().equals("keyframe")) {
                                                int[] iArr = C13117.f36853;
                                                if (i8 == 4) {
                                                    TypedArray typedArrayM11089 = C0989.m11087(resources2, theme2, Xml.asAttributeSet(xmlPullParser), iArr);
                                                    TypedValue typedValuePeekValue = !C0989.m11090(xmlPullParser2, C0226b.f1011d) ? null : typedArrayM11089.peekValue(0);
                                                    int i9 = (typedValuePeekValue == null || !m25578(typedValuePeekValue.type)) ? 0 : 3;
                                                    typedArrayM11089.recycle();
                                                    i8 = i9;
                                                }
                                                TypedArray typedArrayM110810 = C0989.m11087(resources2, theme2, Xml.asAttributeSet(xmlPullParser), iArr);
                                                float f = C0989.m11090(xmlPullParser2, "fraction") ? typedArrayM110810.getFloat(3, -1.0f) : -1.0f;
                                                TypedValue typedValuePeekValue2 = !C0989.m11090(xmlPullParser2, C0226b.f1011d) ? null : typedArrayM110810.peekValue(0);
                                                boolean z2 = typedValuePeekValue2 != null;
                                                int i10 = i8 == 4 ? (z2 && m25578(typedValuePeekValue2.type)) ? 3 : 0 : i8;
                                                if (!z2) {
                                                    keyframeOfFloat = i10 == 0 ? Keyframe.ofFloat(f) : Keyframe.ofInt(f);
                                                } else if (i10 == 0) {
                                                    keyframeOfFloat = Keyframe.ofFloat(f, xmlPullParser2.getAttributeValue(str2, C0226b.f1011d) != null ? typedArrayM110810.getFloat(0, 0.0f) : 0.0f);
                                                } else if (i10 == 1 || i10 == 3) {
                                                    keyframeOfFloat = Keyframe.ofInt(f, xmlPullParser2.getAttributeValue(str2, C0226b.f1011d) != null ? typedArrayM110810.getInt(0, 0) : 0);
                                                } else {
                                                    keyframeOfFloat = null;
                                                }
                                                int resourceId = xmlPullParser2.getAttributeValue(str2, "interpolator") != null ? typedArrayM110810.getResourceId(1, 0) : 0;
                                                if (resourceId > 0) {
                                                    keyframeOfFloat.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
                                                }
                                                typedArrayM110810.recycle();
                                                if (keyframeOfFloat != null) {
                                                    if (arrayList4 == null) {
                                                        arrayList4 = new ArrayList();
                                                    }
                                                    arrayList4.add(keyframeOfFloat);
                                                }
                                                xmlPullParser.next();
                                            }
                                            resources2 = resources;
                                            theme2 = theme;
                                            depth = i3;
                                        }
                                        if (arrayList4 == null || (size = arrayList4.size()) <= 0) {
                                            str = str2;
                                            arrayList2 = arrayList2;
                                            propertyValuesHolderM25576 = null;
                                        } else {
                                            Keyframe keyframe = (Keyframe) arrayList4.get(0);
                                            Keyframe keyframe2 = (Keyframe) arrayList4.get(size - 1);
                                            float fraction = keyframe2.getFraction();
                                            str = str2;
                                            Class cls = Integer.TYPE;
                                            Class cls2 = Float.TYPE;
                                            if (fraction < 1.0f) {
                                                if (fraction < 0.0f) {
                                                    keyframe2.setFraction(1.0f);
                                                } else {
                                                    arrayList4.add(arrayList4.size(), keyframe2.getType() == cls2 ? Keyframe.ofFloat(1.0f) : keyframe2.getType() == cls ? Keyframe.ofInt(1.0f) : Keyframe.ofObject(1.0f));
                                                    size++;
                                                }
                                            }
                                            float fraction2 = keyframe.getFraction();
                                            if (fraction2 != 0.0f) {
                                                if (fraction2 < 0.0f) {
                                                    keyframe.setFraction(0.0f);
                                                } else {
                                                    arrayList4.add(0, keyframe.getType() == cls2 ? Keyframe.ofFloat(0.0f) : keyframe.getType() == cls ? Keyframe.ofInt(0.0f) : Keyframe.ofObject(0.0f));
                                                    size++;
                                                }
                                            }
                                            Keyframe[] keyframeArr = new Keyframe[size];
                                            arrayList4.toArray(keyframeArr);
                                            for (int i11 = 0; i11 < size; i11++) {
                                                Keyframe keyframe3 = keyframeArr[i11];
                                                if (keyframe3.getFraction() < 0.0f) {
                                                    if (i11 == 0) {
                                                        keyframe3.setFraction(0.0f);
                                                    } else {
                                                        int i12 = size - 1;
                                                        if (i11 == i12) {
                                                            keyframe3.setFraction(1.0f);
                                                        } else {
                                                            int i13 = i11;
                                                            for (int i14 = i11 + 1; i14 < i12 && keyframeArr[i14].getFraction() < 0.0f; i14++) {
                                                                i13 = i14;
                                                            }
                                                            float fraction3 = (keyframeArr[i13 + 1].getFraction() - keyframeArr[i11 - 1].getFraction()) / ((i13 - i11) + 2);
                                                            for (int i15 = i11; i15 <= i13; i15++) {
                                                                keyframeArr[i15].setFraction(keyframeArr[i15 - 1].getFraction() + fraction3);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            propertyValuesHolderM25576 = PropertyValuesHolder.ofKeyframe(strM11088, keyframeArr);
                                            if (i8 == 3) {
                                                propertyValuesHolderM25576.setEvaluator(C17809.m40425());
                                            }
                                        }
                                        if (propertyValuesHolderM25576 == null) {
                                            propertyValuesHolderM25576 = m25576(typedArrayM11088, i7, 0, 1, strM11088);
                                        }
                                        if (propertyValuesHolderM25576 != null) {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(propertyValuesHolderM25576);
                                        }
                                        typedArrayM11088.recycle();
                                    } else {
                                        str = str2;
                                        i3 = depth;
                                        arrayList2 = arrayList2;
                                    }
                                    xmlPullParser.next();
                                    i4 = 3;
                                    i5 = 1;
                                    i6 = 2;
                                    resources2 = resources;
                                    theme2 = theme;
                                    xmlPullParser2 = xmlPullParser;
                                    attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                                    str3 = str3;
                                    depth = i3;
                                    str2 = str;
                                    arrayList2 = arrayList2;
                                }
                            }
                            i2 = depth;
                            arrayList = arrayList2;
                            if (arrayList3 != null) {
                                int size2 = arrayList3.size();
                                propertyValuesHolderArr = new PropertyValuesHolder[size2];
                                for (int i16 = 0; i16 < size2; i16++) {
                                    propertyValuesHolderArr[i16] = (PropertyValuesHolder) arrayList3.get(i16);
                                }
                            } else {
                                propertyValuesHolderArr = null;
                            }
                            if (propertyValuesHolderArr != null && (animator2 instanceof ValueAnimator)) {
                                ((ValueAnimator) animator2).setValues(propertyValuesHolderArr);
                            }
                            z = true;
                            animator2 = animator2;
                        }
                    }
                    if (animatorSet != null || z) {
                        arrayList2 = arrayList;
                    } else {
                        arrayList2 = arrayList == null ? new ArrayList() : arrayList;
                        arrayList2.add(animator2);
                    }
                    resources2 = resources;
                    theme2 = theme;
                    xmlPullParser2 = xmlPullParser;
                    depth = i2;
                }
                animator = animatorM25577;
                animator2 = animator;
                i2 = depth;
                arrayList = arrayList2;
                if (animatorSet != null) {
                    arrayList2 = arrayList;
                } else {
                    arrayList2 = arrayList;
                }
                resources2 = resources;
                theme2 = theme;
                xmlPullParser2 = xmlPullParser;
                depth = i2;
            }
        }
        ArrayList arrayList5 = arrayList2;
        if (animatorSet != null && arrayList5 != null) {
            Animator[] animatorArr = new Animator[arrayList5.size()];
            Iterator it = arrayList5.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                animatorArr[i17] = (Animator) it.next();
                i17++;
            }
            if (i == 0) {
                animatorSet.playTogether(animatorArr);
                return animator2;
            }
            animatorSet.playSequentially(animatorArr);
        }
        return animator2;
    }

    /* JADX WARN: Code duplicated, block: B:92:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:95:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:96:0x020a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0211  */
    /* JADX INFO: renamed from: ֫ */
    public static ValueAnimator m25577(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator;
        TypedArray typedArray;
        String str;
        int i;
        TypedArray typedArray2;
        int resourceId;
        ValueAnimator valueAnimator2;
        TypedArray typedArrayM11087 = C0989.m11087(resources, theme, attributeSet, C13117.f36852);
        TypedArray typedArrayM11088 = C0989.m11087(resources, theme, attributeSet, C13117.f36851);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long jM11086 = C0989.m11086(typedArrayM11087, xmlPullParser, "duration", 1, 300);
        boolean z = false;
        long j = xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "startOffset") != null ? typedArrayM11087.getInt(2, 0) : 0;
        int i2 = xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "valueType") != null ? typedArrayM11087.getInt(7, 4) : 4;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "valueFrom") != null && xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "valueTo") != null) {
            if (i2 == 4) {
                TypedValue typedValuePeekValue = typedArrayM11087.peekValue(5);
                boolean z2 = typedValuePeekValue != null;
                int i3 = z2 ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayM11087.peekValue(6);
                boolean z3 = typedValuePeekValue2 != null;
                i2 = ((z2 && m25578(i3)) || (z3 && m25578(z3 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderM25576 = m25576(typedArrayM11087, i2, 5, 6, "");
            if (propertyValuesHolderM25576 != null) {
                valueAnimator3.setValues(propertyValuesHolderM25576);
            }
        }
        valueAnimator3.setDuration(jM11086);
        valueAnimator3.setStartDelay(j);
        valueAnimator3.setRepeatCount(xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "repeatCount") != null ? typedArrayM11087.getInt(3, 0) : 0);
        valueAnimator3.setRepeatMode(xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "repeatMode") != null ? typedArrayM11087.getInt(4, 1) : 1);
        if (typedArrayM11088 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String strM11088 = C0989.m11088(typedArrayM11088, xmlPullParser, "pathData", 1);
            if (strM11088 != null) {
                String strM11089 = C0989.m11088(typedArrayM11088, xmlPullParser, "propertyXName", 2);
                String strM110810 = C0989.m11088(typedArrayM11088, xmlPullParser, "propertyYName", 3);
                if (strM11089 == null && strM110810 == null) {
                    throw new InflateException(typedArrayM11088.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path pathM36824 = C1563.m36824(strM11088);
                PathMeasure pathMeasure = new PathMeasure(pathM36824, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float length = 0.0f;
                while (true) {
                    length += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(length));
                    if (!pathMeasure.nextContour()) {
                        break;
                    }
                    z = false;
                }
                PathMeasure pathMeasure2 = new PathMeasure(pathM36824, z);
                int iMin = Math.min(100, ((int) (length / 0.5f)) + 1);
                float[] fArr = new float[iMin];
                float[] fArr2 = new float[iMin];
                float[] fArr3 = new float[2];
                float f = length / (iMin - 1);
                float f2 = 0.0f;
                valueAnimator = valueAnimator3;
                typedArray = typedArrayM11087;
                str = Chip.NAMESPACE_ANDROID;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    if (i4 >= iMin) {
                        break;
                    }
                    int i6 = iMin;
                    pathMeasure2.getPosTan(f2 - ((Float) arrayList.get(i5)).floatValue(), fArr3, null);
                    fArr[i4] = fArr3[0];
                    fArr2[i4] = fArr3[1];
                    f2 += f;
                    int i7 = i5 + 1;
                    if (i7 < arrayList.size() && f2 > ((Float) arrayList.get(i7)).floatValue()) {
                        pathMeasure2.nextContour();
                        i5 = i7;
                    }
                    i4++;
                    iMin = i6;
                }
                PropertyValuesHolder propertyValuesHolderOfFloat = strM11089 != null ? PropertyValuesHolder.ofFloat(strM11089, fArr) : null;
                PropertyValuesHolder propertyValuesHolderOfFloat2 = strM110810 != null ? PropertyValuesHolder.ofFloat(strM110810, fArr2) : null;
                if (propertyValuesHolderOfFloat == null) {
                    objectAnimator2.setValues(propertyValuesHolderOfFloat2);
                } else if (propertyValuesHolderOfFloat2 == null) {
                    objectAnimator2.setValues(propertyValuesHolderOfFloat);
                } else {
                    objectAnimator2.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                }
            } else {
                valueAnimator = valueAnimator3;
                typedArray = typedArrayM11087;
                str = Chip.NAMESPACE_ANDROID;
                i = 0;
                objectAnimator2.setPropertyName(C0989.m11088(typedArrayM11088, xmlPullParser, "propertyName", 0));
            }
            if (xmlPullParser.getAttributeValue(str, "interpolator") != null) {
                typedArray2 = typedArray;
                resourceId = typedArray2.getResourceId(i, i);
            } else {
                typedArray2 = typedArray;
                resourceId = 0;
            }
            if (resourceId > 0) {
                valueAnimator2 = valueAnimator;
                valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
            } else {
                valueAnimator2 = valueAnimator;
            }
            typedArray2.recycle();
            if (typedArrayM11088 != null) {
                typedArrayM11088.recycle();
            }
            return valueAnimator2;
        }
        valueAnimator = valueAnimator3;
        typedArray = typedArrayM11087;
        str = Chip.NAMESPACE_ANDROID;
        i = 0;
        if (xmlPullParser.getAttributeValue(str, "interpolator") != null) {
            typedArray2 = typedArray;
            resourceId = typedArray2.getResourceId(i, i);
        } else {
            typedArray2 = typedArray;
            resourceId = 0;
        }
        if (resourceId > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator2 = valueAnimator;
        }
        typedArray2.recycle();
        if (typedArrayM11088 != null) {
            typedArrayM11088.recycle();
        }
        return valueAnimator2;
    }
}
