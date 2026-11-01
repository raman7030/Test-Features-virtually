package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ۘ᩸ */
/* JADX INFO: compiled from: R1K2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1050 {

    /* JADX INFO: renamed from: ܿ */
    public static SparseIntArray f16479;

    /* JADX INFO: renamed from: ᩳ */
    public static final int[] f16480 = {0, 4, 8};

    /* JADX INFO: renamed from: ܽ */
    public HashMap f16483 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public boolean f16482 = true;

    /* JADX INFO: renamed from: ֫ */
    public HashMap f16481 = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f16479 = sparseIntArray;
        sparseIntArray.append(77, 25);
        sparseIntArray.append(78, 26);
        sparseIntArray.append(80, 29);
        sparseIntArray.append(81, 30);
        sparseIntArray.append(87, 36);
        sparseIntArray.append(86, 35);
        sparseIntArray.append(59, 4);
        sparseIntArray.append(58, 3);
        sparseIntArray.append(56, 1);
        sparseIntArray.append(95, 6);
        sparseIntArray.append(96, 7);
        sparseIntArray.append(66, 17);
        sparseIntArray.append(67, 18);
        sparseIntArray.append(68, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(82, 32);
        sparseIntArray.append(83, 33);
        sparseIntArray.append(65, 10);
        sparseIntArray.append(64, 9);
        sparseIntArray.append(99, 13);
        sparseIntArray.append(IShizukuService.Stub.TRANSACTION_attachUserService, 16);
        sparseIntArray.append(100, 14);
        sparseIntArray.append(97, 11);
        sparseIntArray.append(101, 15);
        sparseIntArray.append(98, 12);
        sparseIntArray.append(90, 40);
        sparseIntArray.append(75, 39);
        sparseIntArray.append(74, 41);
        sparseIntArray.append(89, 42);
        sparseIntArray.append(73, 20);
        sparseIntArray.append(88, 37);
        sparseIntArray.append(63, 5);
        sparseIntArray.append(76, 82);
        sparseIntArray.append(85, 82);
        sparseIntArray.append(79, 82);
        sparseIntArray.append(57, 82);
        sparseIntArray.append(55, 82);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(91, 54);
        sparseIntArray.append(69, 55);
        sparseIntArray.append(92, 56);
        sparseIntArray.append(70, 57);
        sparseIntArray.append(93, 58);
        sparseIntArray.append(71, 59);
        sparseIntArray.append(60, 61);
        sparseIntArray.append(62, 62);
        sparseIntArray.append(61, 63);
        sparseIntArray.append(27, 64);
        sparseIntArray.append(IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 65);
        sparseIntArray.append(34, 66);
        sparseIntArray.append(108, 67);
        sparseIntArray.append(IShizukuService.Stub.TRANSACTION_isHidden, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, 68);
        sparseIntArray.append(94, 69);
        sparseIntArray.append(72, 70);
        sparseIntArray.append(31, 71);
        sparseIntArray.append(29, 72);
        sparseIntArray.append(30, 73);
        sparseIntArray.append(32, 74);
        sparseIntArray.append(28, 75);
        sparseIntArray.append(IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, 76);
        sparseIntArray.append(84, 77);
        sparseIntArray.append(109, 78);
        sparseIntArray.append(54, 80);
        sparseIntArray.append(53, 81);
    }

    /* JADX INFO: renamed from: ܽ */
    public final C1890 m14560(int i) {
        return m14543(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14549(C1050 c1050) {
        HashMap map = c1050.f16481;
        for (Integer num : map.keySet()) {
            num.getClass();
            C1890 c1890 = (C1890) map.get(num);
            HashMap map2 = this.f16481;
            if (!map2.containsKey(num)) {
                map2.put(num, new C1890());
            }
            C1890 c1891 = (C1890) map2.get(num);
            C1330 c1330 = c1891.f70840;
            if (!c1330.f32704) {
                c1330.m26933(c1890.f70840);
            }
            C1645 c1645 = c1891.f70844;
            if (!c1645.f53036) {
                C1645 c1646 = c1890.f70844;
                c1645.f53036 = c1646.f53036;
                c1645.f53038 = c1646.f53038;
                c1645.f53035 = c1646.f53035;
                c1645.f53037 = c1646.f53037;
                c1645.f53039 = c1646.f53039;
            }
            C0980 c0980 = c1891.f70842;
            if (!c0980.f11494) {
                c0980.m10680(c1890.f70842);
            }
            C1295 c1295 = c1891.f70845;
            if (!c1295.f30613) {
                c1295.m25459(c1890.f70845);
            }
            for (String str : c1890.f70841.keySet()) {
                if (!c1891.f70841.containsKey(str)) {
                    c1891.f70841.put(str, c1890.f70841.get(str));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m14557(C1342 c1342) {
        int childCount = c1342.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c1342.getChildAt(i);
            C1680 c1680 = (C1680) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f16482 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            Integer numValueOf = Integer.valueOf(id);
            HashMap map = this.f16481;
            if (!map.containsKey(numValueOf)) {
                map.put(Integer.valueOf(id), new C1890());
            }
            C1890 c1890 = (C1890) map.get(Integer.valueOf(id));
            C1330 c1330 = c1890.f70840;
            C1645 c1645 = c1890.f70844;
            C0980 c0980 = c1890.f70842;
            if (!c1330.f32704) {
                c1890.m50415(id, c1680);
                if (childAt instanceof AbstractC1216) {
                    AbstractC1216 abstractC1216 = (AbstractC1216) childAt;
                    c1330.f32724 = Arrays.copyOf(abstractC1216.f26210, abstractC1216.f26211);
                    if (childAt instanceof C1146) {
                        C1146 c1146 = (C1146) childAt;
                        c1330.f32727 = c1146.m18978();
                        c1330.f32741 = c1146.m18976();
                        c1330.f32745 = c1146.m18977();
                    }
                }
                c1330.f32704 = true;
            }
            if (!c1645.f53036) {
                c1645.f53038 = childAt.getVisibility();
                c1645.f53035 = childAt.getAlpha();
                c1645.f53036 = true;
            }
            if (!c0980.f11494) {
                c0980.f11494 = true;
                c0980.f11496 = childAt.getRotation();
                c0980.f11495 = childAt.getRotationX();
                c0980.f11492 = childAt.getRotationY();
                c0980.f11498 = childAt.getScaleX();
                c0980.f11488 = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c0980.f11497 = pivotX;
                    c0980.f11490 = pivotY;
                }
                c0980.f11489 = childAt.getTranslationX();
                c0980.f11493 = childAt.getTranslationY();
                c0980.f11487 = childAt.getTranslationZ();
                if (c0980.f11486) {
                    c0980.f11491 = childAt.getElevation();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m14561(C1715 c1715) {
        C1050 c1050 = this;
        int childCount = c1715.getChildCount();
        HashMap map = c1050.f16481;
        map.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = c1715.getChildAt(i);
            C1680 c1680 = (C1680) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c1050.f16482 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new C1890());
            }
            C1890 c1890 = (C1890) map.get(Integer.valueOf(id));
            HashMap map2 = new HashMap();
            Class<?> cls = childAt.getClass();
            HashMap map3 = c1050.f16483;
            for (String str : map3.keySet()) {
                C1531 c1531 = (C1531) map3.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        map2.put(str, new C1531(c1531, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        map2.put(str, new C1531(c1531, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                    }
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            }
            c1890.f70841 = map2;
            C1645 c1645 = c1890.f70844;
            C1330 c1330 = c1890.f70840;
            C0980 c0980 = c1890.f70842;
            c1890.m50415(id, c1680);
            c1645.f53038 = childAt.getVisibility();
            c1645.f53035 = childAt.getAlpha();
            c0980.f11496 = childAt.getRotation();
            c0980.f11495 = childAt.getRotationX();
            c0980.f11492 = childAt.getRotationY();
            c0980.f11498 = childAt.getScaleX();
            c0980.f11488 = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                c0980.f11497 = pivotX;
                c0980.f11490 = pivotY;
            }
            c0980.f11489 = childAt.getTranslationX();
            c0980.f11493 = childAt.getTranslationY();
            c0980.f11487 = childAt.getTranslationZ();
            if (c0980.f11486) {
                c0980.f11491 = childAt.getElevation();
            }
            if (childAt instanceof C1146) {
                C1146 c1146 = (C1146) childAt;
                c1330.f32727 = c1146.m18978();
                c1330.f32724 = Arrays.copyOf(c1146.f26210, c1146.f26211);
                c1330.f32741 = c1146.m18976();
                c1330.f32745 = c1146.m18977();
            }
            i++;
            c1050 = this;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14553(C1820 c1820) {
        int childCount = c1820.getChildCount();
        HashMap map = this.f16481;
        map.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = c1820.getChildAt(i);
            C1785 c1785 = (C1785) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f16482 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new C1890());
            }
            C1890 c1890 = (C1890) map.get(Integer.valueOf(id));
            if (childAt instanceof AbstractC1216) {
                C1890.m50419(c1890, (AbstractC1216) childAt, id, c1785);
            }
            c1890.m50416(id, c1785);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14552(C1715 c1715) {
        m14558(c1715);
        c1715.setConstraintSet(null);
        c1715.requestLayout();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14551(C1342 c1342) {
        int childCount = c1342.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c1342.getChildAt(i);
            int id = childAt.getId();
            Integer numValueOf = Integer.valueOf(id);
            HashMap map = this.f16481;
            if (!map.containsKey(numValueOf)) {
                C0845.m3343(childAt);
            } else {
                if (this.f16482 && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (map.containsKey(Integer.valueOf(id))) {
                    C1531.m35410(childAt, ((C1890) map.get(Integer.valueOf(id))).f70841);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14550(AbstractC1216 abstractC1216, C1591 c1591, C1785 c1785, SparseArray sparseArray) {
        int id = abstractC1216.getId();
        Integer numValueOf = Integer.valueOf(id);
        HashMap map = this.f16481;
        if (map.containsKey(numValueOf)) {
            C1890 c1890 = (C1890) map.get(Integer.valueOf(id));
            if (c1591 instanceof C1486) {
                abstractC1216.mo18973(c1890, (C1486) c1591, c1785, sparseArray);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14546(int i, C1785 c1785) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f16481;
        if (map.containsKey(numValueOf)) {
            ((C1890) map.get(Integer.valueOf(i))).m50420(c1785);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m14558(C1715 c1715) {
        int childCount = c1715.getChildCount();
        HashMap map = this.f16481;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = c1715.getChildAt(i);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                C0845.m3343(childAt);
            } else {
                if (this.f16482 && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && map.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C1890 c1890 = (C1890) map.get(Integer.valueOf(id));
                    if (childAt instanceof C1146) {
                        c1890.f70840.f32760 = 1;
                    }
                    C1330 c1330 = c1890.f70840;
                    C1645 c1645 = c1890.f70844;
                    C0980 c0980 = c1890.f70842;
                    int i2 = c1330.f32760;
                    if (i2 != -1 && i2 == 1) {
                        C1146 c1146 = (C1146) childAt;
                        c1146.setId(id);
                        c1146.m18975(c1330.f32741);
                        c1146.m18971(c1330.f32745);
                        c1146.m18974(c1330.f32727);
                        int[] iArr = c1330.f32724;
                        if (iArr != null) {
                            c1146.m22209(iArr);
                        } else {
                            String str = c1330.f32753;
                            if (str != null) {
                                int[] iArrM14540 = m14540(c1146, str);
                                c1330.f32724 = iArrM14540;
                                c1146.m22209(iArrM14540);
                            }
                        }
                    }
                    C1680 c1680 = (C1680) childAt.getLayoutParams();
                    c1680.m42001();
                    c1890.m50420(c1680);
                    C1531.m35410(childAt, c1890.f70841);
                    childAt.setLayoutParams(c1680);
                    if (c1645.f53039 == 0) {
                        childAt.setVisibility(c1645.f53038);
                    }
                    childAt.setAlpha(c1645.f53035);
                    childAt.setRotation(c0980.f11496);
                    childAt.setRotationX(c0980.f11495);
                    childAt.setRotationY(c0980.f11492);
                    childAt.setScaleX(c0980.f11498);
                    childAt.setScaleY(c0980.f11488);
                    if (!Float.isNaN(c0980.f11497)) {
                        childAt.setPivotX(c0980.f11497);
                    }
                    if (!Float.isNaN(c0980.f11490)) {
                        childAt.setPivotY(c0980.f11490);
                    }
                    childAt.setTranslationX(c0980.f11489);
                    childAt.setTranslationY(c0980.f11493);
                    childAt.setTranslationZ(c0980.f11487);
                    if (c0980.f11486) {
                        childAt.setElevation(c0980.f11491);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            C1890 c1891 = (C1890) map.get(num);
            C1330 c1331 = c1891.f70840;
            int i3 = c1331.f32760;
            if (i3 != -1 && i3 == 1) {
                C1146 c1147 = new C1146(c1715.getContext());
                c1147.setId(num.intValue());
                int[] iArr2 = c1331.f32724;
                if (iArr2 != null) {
                    c1147.m22209(iArr2);
                } else {
                    String str2 = c1331.f32753;
                    if (str2 != null) {
                        int[] iArrM14541 = m14540(c1147, str2);
                        c1331.f32724 = iArrM14541;
                        c1147.m22209(iArrM14541);
                    }
                }
                c1147.m18975(c1331.f32741);
                c1147.m18971(c1331.f32745);
                C1680 c1680GenerateDefaultLayoutParams = c1715.generateDefaultLayoutParams();
                c1147.m22212();
                c1891.m50420(c1680GenerateDefaultLayoutParams);
                c1715.addView(c1147, c1680GenerateDefaultLayoutParams);
            }
            if (c1331.f32717) {
                View c0910 = new C0910(c1715.getContext());
                c0910.setId(num.intValue());
                C1680 c1680GenerateDefaultLayoutParams2 = c1715.generateDefaultLayoutParams();
                c1891.m50420(c1680GenerateDefaultLayoutParams2);
                c1715.addView(c0910, c1680GenerateDefaultLayoutParams2);
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m14562(int i) {
        return m14543(i).f70844.f53039;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m14563(int i) {
        return m14543(i).f70844.f53038;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m14555(int i) {
        return m14543(i).f70840.f32735;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m14559(int i) {
        return m14543(i).f70840.f32722;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14545(int i, int i2, int i3, float f) {
        C1330 c1330 = m14543(i).f70840;
        c1330.f32734 = i2;
        c1330.f32759 = i3;
        c1330.f32742 = f;
    }

    /* JADX INFO: renamed from: ᩻ */
    private C1890 m14543(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f16481;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i), new C1890());
        }
        return (C1890) map.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14547(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C1890 c1890M14539 = m14539(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        c1890M14539.f70840.f32717 = true;
                    }
                    this.f16481.put(Integer.valueOf(c1890M14539.f70843), c1890M14539);
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ֫ */
    public final void m14548(Context context, XmlResourceParser xmlResourceParser) {
        try {
            int eventType = xmlResourceParser.getEventType();
            C1890 c1890M14539 = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -2025855158:
                            if (!name.equals("Layout")) {
                                continue;
                            } else {
                                if (c1890M14539 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                c1890M14539.f70840.m26932(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1984451626:
                            if (!name.equals("Motion")) {
                                continue;
                            } else {
                                if (c1890M14539 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                c1890M14539.f70845.m25458(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1269513683:
                            if (!name.equals("PropertySet")) {
                                continue;
                            } else {
                                if (c1890M14539 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                c1890M14539.f70844.m40338(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1238332596:
                            if (!name.equals("Transform")) {
                                continue;
                            } else {
                                if (c1890M14539 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                c1890M14539.f70842.m10679(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -71750448:
                            if (name.equals("Guideline")) {
                                c1890M14539 = m14539(context, Xml.asAttributeSet(xmlResourceParser));
                                C1330 c1330 = c1890M14539.f70840;
                                c1330.f32717 = true;
                                c1330.f32704 = true;
                            }
                            break;
                        case 1331510167:
                            if (name.equals("Barrier")) {
                                c1890M14539 = m14539(context, Xml.asAttributeSet(xmlResourceParser));
                                c1890M14539.f70840.f32760 = 1;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                continue;
                            } else {
                                if (c1890M14539 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                C1531.m35409(context, xmlResourceParser, c1890M14539.f70841);
                            }
                            break;
                        case 1803088381:
                            if (name.equals("Constraint")) {
                                c1890M14539 = m14539(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                    }
                } else if (eventType != 3) {
                    continue;
                } else {
                    String name2 = xmlResourceParser.getName();
                    if ("ConstraintSet".equals(name2)) {
                        return;
                    }
                    if (name2.equalsIgnoreCase("Constraint")) {
                        this.f16481.put(Integer.valueOf(c1890M14539.f70843), c1890M14539);
                        c1890M14539 = null;
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m14541(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1890 m14539(Context context, AttributeSet attributeSet) {
        C1890 c1890 = new C1890();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1925.f72679);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            C1645 c1645 = c1890.f70844;
            C1295 c1295 = c1890.f70845;
            C0980 c0980 = c1890.f70842;
            C1330 c1330 = c1890.f70840;
            if (index != 1 && 23 != index && 24 != index) {
                c1295.f30613 = true;
                c1330.f32704 = true;
                c1645.f53036 = true;
                c0980.f11494 = true;
            }
            SparseIntArray sparseIntArray = f16479;
            switch (sparseIntArray.get(index)) {
                case 1:
                    c1330.f32703 = m14541(typedArrayObtainStyledAttributes, index, c1330.f32703);
                    break;
                case 2:
                    c1330.f32726 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1330.f32726);
                    break;
                case 3:
                    c1330.f32740 = m14541(typedArrayObtainStyledAttributes, index, c1330.f32740);
                    break;
                case 4:
                    c1330.f32744 = m14541(typedArrayObtainStyledAttributes, index, c1330.f32744);
                    break;
                case 5:
                    c1330.f32723 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    c1330.f32721 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1330.f32721);
                    break;
                case 7:
                    c1330.f32738 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1330.f32738);
                    break;
                case 8:
                    c1330.f32705 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1330.f32705);
                    break;
                case 9:
                    c1330.f32709 = m14541(typedArrayObtainStyledAttributes, index, c1330.f32709);
                    break;
                case 10:
                    c1330.f32746 = m14541(typedArrayObtainStyledAttributes, index, c1330.f32746);
                    break;
                case 11:
                    c1330.f32748 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1330.f32748);
                    break;
                case 12:
                    c1330.f32699 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1330.f32699);
                    break;
                case 13:
                    c1330.f32713 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1330.f32713);
                    break;
                case 14:
                    c1330.f32701 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1330.f32701);
                    break;
                case 15:
                    c1330.f32719 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1330.f32719);
                    break;
                case 16:
                    c1330.f32736 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1330.f32736);
                    break;
                case 17:
                    c1330.f32754 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1330.f32754);
                    break;
                case 18:
                    c1330.f32756 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1330.f32756);
                    break;
                case 19:
                    c1330.f32750 = typedArrayObtainStyledAttributes.getFloat(index, c1330.f32750);
                    break;
                case 20:
                    c1330.f32725 = typedArrayObtainStyledAttributes.getFloat(index, c1330.f32725);
                    break;
                case 21:
                    c1330.f32735 = typedArrayObtainStyledAttributes.getLayoutDimension(index, c1330.f32735);
                    break;
                case 22:
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, c1645.f53038);
                    c1645.f53038 = i2;
                    c1645.f53038 = f16480[i2];
                    break;
                case 23:
                    c1330.f32722 = typedArrayObtainStyledAttributes.getLayoutDimension(index, c1330.f32722);
                    break;
                case 24:
                    c1330.f32758 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1330.f32758);
                    break;
                case 25:
                    c1330.f32733 = m14541(typedArrayObtainStyledAttributes, index, c1330.f32733);
                    break;
                case 26:
                    c1330.f32718 = m14541(typedArrayObtainStyledAttributes, index, c1330.f32718);
                    break;
                case 27:
                    c1330.f32739 = typedArrayObtainStyledAttributes.getInt(index, c1330.f32739);
                    break;
                case 28:
                    c1330.f32706 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1330.f32706);
                    break;
                case 29:
                    c1330.f32710 = m14541(typedArrayObtainStyledAttributes, index, c1330.f32710);
                    break;
                case 30:
                    c1330.f32747 = m14541(typedArrayObtainStyledAttributes, index, c1330.f32747);
                    break;
                case 31:
                    c1330.f32749 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1330.f32749);
                    break;
                case 32:
                    c1330.f32700 = m14541(typedArrayObtainStyledAttributes, index, c1330.f32700);
                    break;
                case 33:
                    c1330.f32714 = m14541(typedArrayObtainStyledAttributes, index, c1330.f32714);
                    break;
                case 34:
                    c1330.f32702 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1330.f32702);
                    break;
                case 35:
                    c1330.f32720 = m14541(typedArrayObtainStyledAttributes, index, c1330.f32720);
                    break;
                case 36:
                    c1330.f32737 = m14541(typedArrayObtainStyledAttributes, index, c1330.f32737);
                    break;
                case 37:
                    c1330.f32755 = typedArrayObtainStyledAttributes.getFloat(index, c1330.f32755);
                    break;
                case 38:
                    c1890.f70843 = typedArrayObtainStyledAttributes.getResourceId(index, c1890.f70843);
                    break;
                case 39:
                    c1330.f32728 = typedArrayObtainStyledAttributes.getFloat(index, c1330.f32728);
                    break;
                case 40:
                    c1330.f32751 = typedArrayObtainStyledAttributes.getFloat(index, c1330.f32751);
                    break;
                case 41:
                    c1330.f32715 = typedArrayObtainStyledAttributes.getInt(index, c1330.f32715);
                    break;
                case 42:
                    c1330.f32757 = typedArrayObtainStyledAttributes.getInt(index, c1330.f32757);
                    break;
                case 43:
                    c1645.f53035 = typedArrayObtainStyledAttributes.getFloat(index, c1645.f53035);
                    break;
                case 44:
                    c0980.f11486 = true;
                    c0980.f11491 = typedArrayObtainStyledAttributes.getDimension(index, c0980.f11491);
                    break;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    c0980.f11495 = typedArrayObtainStyledAttributes.getFloat(index, c0980.f11495);
                    break;
                case 46:
                    c0980.f11492 = typedArrayObtainStyledAttributes.getFloat(index, c0980.f11492);
                    break;
                case 47:
                    c0980.f11498 = typedArrayObtainStyledAttributes.getFloat(index, c0980.f11498);
                    break;
                case 48:
                    c0980.f11488 = typedArrayObtainStyledAttributes.getFloat(index, c0980.f11488);
                    break;
                case 49:
                    c0980.f11497 = typedArrayObtainStyledAttributes.getDimension(index, c0980.f11497);
                    break;
                case 50:
                    c0980.f11490 = typedArrayObtainStyledAttributes.getDimension(index, c0980.f11490);
                    break;
                case 51:
                    c0980.f11489 = typedArrayObtainStyledAttributes.getDimension(index, c0980.f11489);
                    break;
                case 52:
                    c0980.f11493 = typedArrayObtainStyledAttributes.getDimension(index, c0980.f11493);
                    break;
                case 53:
                    c0980.f11487 = typedArrayObtainStyledAttributes.getDimension(index, c0980.f11487);
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    c1330.f32712 = typedArrayObtainStyledAttributes.getInt(index, c1330.f32712);
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    c1330.f32711 = typedArrayObtainStyledAttributes.getInt(index, c1330.f32711);
                    break;
                case 56:
                    c1330.f32708 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1330.f32708);
                    break;
                case 57:
                    c1330.f32707 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1330.f32707);
                    break;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    c1330.f32732 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1330.f32732);
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    c1330.f32731 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1330.f32731);
                    break;
                case 60:
                    c0980.f11496 = typedArrayObtainStyledAttributes.getFloat(index, c0980.f11496);
                    break;
                case 61:
                    c1330.f32734 = m14541(typedArrayObtainStyledAttributes, index, c1330.f32734);
                    break;
                case 62:
                    c1330.f32759 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1330.f32759);
                    break;
                case 63:
                    c1330.f32742 = typedArrayObtainStyledAttributes.getFloat(index, c1330.f32742);
                    break;
                case 64:
                    c1295.f30612 = m14541(typedArrayObtainStyledAttributes, index, c1295.f30612);
                    break;
                case 65:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        c1295.f30618 = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        c1295.f30618 = C1265.f28949[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    c1295.f30615 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 67:
                    c1295.f30614 = typedArrayObtainStyledAttributes.getFloat(index, c1295.f30614);
                    break;
                case 68:
                    c1645.f53037 = typedArrayObtainStyledAttributes.getFloat(index, c1645.f53037);
                    break;
                case 69:
                    c1330.f32730 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    c1330.f32729 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    break;
                case 72:
                    c1330.f32741 = typedArrayObtainStyledAttributes.getInt(index, c1330.f32741);
                    break;
                case 73:
                    c1330.f32745 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1330.f32745);
                    break;
                case 74:
                    c1330.f32753 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 75:
                    c1330.f32727 = typedArrayObtainStyledAttributes.getBoolean(index, c1330.f32727);
                    break;
                case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                    c1295.f30616 = typedArrayObtainStyledAttributes.getInt(index, c1295.f30616);
                    break;
                case 77:
                    c1330.f32743 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 78:
                    c1645.f53039 = typedArrayObtainStyledAttributes.getInt(index, c1645.f53039);
                    break;
                case 79:
                    c1295.f30617 = typedArrayObtainStyledAttributes.getFloat(index, c1295.f30617);
                    break;
                case 80:
                    c1330.f32752 = typedArrayObtainStyledAttributes.getBoolean(index, c1330.f32752);
                    break;
                case 81:
                    c1330.f32716 = typedArrayObtainStyledAttributes.getBoolean(index, c1330.f32716);
                    break;
                case 82:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c1890;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int[] m14540(C1146 c1146, String str) {
        int iIntValue;
        Object designInformation;
        String[] strArrSplit = str.split(",");
        Context context = c1146.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = C1610.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && c1146.isInEditMode() && (c1146.getParent() instanceof C1715) && (designInformation = ((C1715) c1146.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) {
                iIntValue = ((Integer) designInformation).intValue();
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C1890 m14544(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f16481;
        if (map.containsKey(numValueOf)) {
            return (C1890) map.get(Integer.valueOf(i));
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int[] m14554() {
        Integer[] numArr = (Integer[]) this.f16481.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m14556() {
        this.f16482 = false;
    }
}
