package l;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1AK */
/* JADX INFO: loaded from: classes.dex */
public final class C23480 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static HashMap f75337;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f75338 = new HashMap();

    static {
        HashMap map = new HashMap();
        f75337 = map;
        try {
            map.put("KeyAttribute", C7812.class.getConstructor(null));
            map.put("KeyPosition", C20659.class.getConstructor(null));
            map.put("KeyCycle", C21924.class.getConstructor(null));
            map.put("KeyTimeCycle", C15718.class.getConstructor(null));
            map.put("KeyTrigger", C3725.class.getConstructor(null));
        } catch (NoSuchMethodException unused) {
        }
    }

    public C23480(Context context, XmlResourceParser xmlResourceParser) {
        HashMap map;
        try {
            int eventType = xmlResourceParser.getEventType();
            AbstractC4990 abstractC4990 = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    HashMap map2 = f75337;
                    if (map2.containsKey(name)) {
                        try {
                            AbstractC4990 abstractC4991 = (AbstractC4990) ((Constructor) map2.get(name)).newInstance(null);
                            try {
                                abstractC4991.mo11328(context, Xml.asAttributeSet(xmlResourceParser));
                                HashMap map3 = this.f75338;
                                if (!map3.containsKey(Integer.valueOf(abstractC4991.f15713))) {
                                    map3.put(Integer.valueOf(abstractC4991.f15713), new ArrayList());
                                }
                                ((ArrayList) map3.get(Integer.valueOf(abstractC4991.f15713))).add(abstractC4991);
                            } catch (Exception unused) {
                            }
                            abstractC4990 = abstractC4991;
                        } catch (Exception unused2) {
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute") && abstractC4990 != null && (map = abstractC4990.f15711) != null) {
                        C13888.m33290(context, xmlResourceParser, map);
                    }
                } else if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException | XmlPullParserException unused3) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51934(C19248 c19248) {
        Integer numValueOf = Integer.valueOf(c19248.f60606);
        HashMap map = this.f75338;
        ArrayList arrayList = (ArrayList) map.get(numValueOf);
        if (arrayList != null) {
            c19248.m44407(arrayList);
        }
        ArrayList<AbstractC4990> arrayList2 = (ArrayList) map.get(-1);
        if (arrayList2 != null) {
            for (AbstractC4990 abstractC4990 : arrayList2) {
                String str = ((C16900) c19248.f60588.getLayoutParams()).f51940;
                String str2 = abstractC4990.f15714;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    c19248.m44408(abstractC4990);
                }
            }
        }
    }
}
