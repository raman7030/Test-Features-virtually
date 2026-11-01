package p067l;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.᩻ۚ */
/* JADX INFO: compiled from: Z1AK */
/* JADX INFO: loaded from: classes.dex */
public final class C2007 {

    /* JADX INFO: renamed from: ۧ */
    public static HashMap f78085;

    /* JADX INFO: renamed from: ֫ */
    public HashMap f78086 = new HashMap();

    static {
        HashMap map = new HashMap();
        f78085 = map;
        try {
            map.put("KeyAttribute", C1230.class.getConstructor(null));
            map.put("KeyPosition", C1867.class.getConstructor(null));
            map.put("KeyCycle", C1930.class.getConstructor(null));
            map.put("KeyTimeCycle", C1622.class.getConstructor(null));
            map.put("KeyTrigger", C1027.class.getConstructor(null));
        } catch (NoSuchMethodException unused) {
        }
    }

    public C2007(Context context, XmlResourceParser xmlResourceParser) {
        HashMap map;
        try {
            int eventType = xmlResourceParser.getEventType();
            AbstractC1090 abstractC1090 = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    HashMap map2 = f78085;
                    if (map2.containsKey(name)) {
                        try {
                            AbstractC1090 abstractC1091 = (AbstractC1090) ((Constructor) map2.get(name)).newInstance(null);
                            try {
                                abstractC1091.mo13280(context, Xml.asAttributeSet(xmlResourceParser));
                                HashMap map3 = this.f78086;
                                if (!map3.containsKey(Integer.valueOf(abstractC1091.f18546))) {
                                    map3.put(Integer.valueOf(abstractC1091.f18546), new ArrayList());
                                }
                                ((ArrayList) map3.get(Integer.valueOf(abstractC1091.f18546))).add(abstractC1091);
                            } catch (Exception unused) {
                            }
                            abstractC1090 = abstractC1091;
                        } catch (Exception unused2) {
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute") && abstractC1090 != null && (map = abstractC1090.f18544) != null) {
                        C1531.m35409(context, xmlResourceParser, map);
                    }
                } else if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException | XmlPullParserException unused3) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54336(C1797 c1797) {
        Integer numValueOf = Integer.valueOf(c1797.f63837);
        HashMap map = this.f78086;
        ArrayList arrayList = (ArrayList) map.get(numValueOf);
        if (arrayList != null) {
            c1797.m46701(arrayList);
        }
        ArrayList<AbstractC1090> arrayList2 = (ArrayList) map.get(-1);
        if (arrayList2 != null) {
            for (AbstractC1090 abstractC1090 : arrayList2) {
                String str = ((C1680) c1797.f63819.getLayoutParams()).f55120;
                String str2 = abstractC1090.f18547;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    c1797.m46702(abstractC1090);
                }
            }
        }
    }
}
