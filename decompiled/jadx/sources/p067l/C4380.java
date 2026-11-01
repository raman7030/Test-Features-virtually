package p067l;

import android.content.Context;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.֫᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R52G */
/* JADX INFO: loaded from: classes2.dex */
public final class C4380 {

    /* JADX INFO: renamed from: ܳ */
    public static final Class[] f9853 = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: ܿ */
    public static final HashMap f9854 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public final Context f9856;

    /* JADX INFO: renamed from: ᩳ */
    public C19132 f9858;

    /* JADX INFO: renamed from: ֫ */
    public final Object[] f9855 = new Object[2];

    /* JADX INFO: renamed from: ܽ */
    public String[] f9857 = {C4360.class.getPackage().getName() + ".", C3038.class.getPackage().getName() + "."};

    public C4380(Context context, C19132 c19132) {
        this.f9856 = context;
        this.f9858 = c19132;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5701 m9126(int i, C9074 c9074) {
        XmlResourceParser xml = this.f9856.getResources().getXml(i);
        try {
            return m9127(xml, c9074);
        } finally {
            xml.close();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5701 m9127(XmlResourceParser xmlResourceParser, AbstractC5701 abstractC5701) {
        int next;
        synchronized (this.f9855) {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
            this.f9855[0] = this.f9856;
            do {
                try {
                    try {
                        try {
                            next = xmlResourceParser.next();
                            if (next == 2) {
                                break;
                            }
                        } catch (XmlPullParserException e) {
                            InflateException inflateException = new InflateException(e.getMessage());
                            inflateException.initCause(e);
                            throw inflateException;
                        }
                    } catch (InflateException e2) {
                        throw e2;
                    }
                } catch (IOException e3) {
                    InflateException inflateException2 = new InflateException(xmlResourceParser.getPositionDescription() + ": " + e3.getMessage());
                    inflateException2.initCause(e3);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(xmlResourceParser.getPositionDescription() + ": No start tag found!");
            }
            AbstractC5701 abstractC5702 = (AbstractC5701) m9123(xmlResourceParser.getName(), attributeSetAsAttributeSet);
            if (abstractC5701 == null) {
                abstractC5702.m9026(this.f9858);
                abstractC5701 = abstractC5702;
            }
            m9125(xmlResourceParser, abstractC5701, attributeSetAsAttributeSet);
        }
        return abstractC5701;
    }

    /* JADX INFO: renamed from: ֫ */
    private C4360 m9124(String str, String[] strArr, AttributeSet attributeSet) throws ClassNotFoundException {
        Class<?> cls;
        HashMap map = f9854;
        Constructor<?> constructor = (Constructor) map.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.f9856.getClassLoader();
                    if (strArr == null || strArr.length == 0) {
                        cls = Class.forName(str, false, classLoader);
                    } else {
                        cls = null;
                        ClassNotFoundException e = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e2) {
                                e = e2;
                            }
                        }
                        if (cls == null) {
                            if (e == null) {
                                throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                            }
                            throw e;
                        }
                    }
                    constructor = cls.getConstructor(f9853);
                    constructor.setAccessible(true);
                    map.put(str, constructor);
                } catch (ClassNotFoundException e3) {
                    throw e3;
                }
            } catch (Exception e4) {
                InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                inflateException.initCause(e4);
                throw inflateException;
            }
        }
        Object[] objArr = this.f9855;
        objArr[1] = attributeSet;
        return (C4360) constructor.newInstance(objArr);
    }

    /* JADX INFO: renamed from: ֫ */
    private C4360 m9123(String str, AttributeSet attributeSet) {
        try {
            if (-1 == str.indexOf(46)) {
                return m9124(str, this.f9857, attributeSet);
            }
            return m9124(str, (String[]) null, attributeSet);
        } catch (InflateException e) {
            throw e;
        } catch (ClassNotFoundException e2) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e2);
            throw inflateException;
        } catch (Exception e3) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e3);
            throw inflateException2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m9125(XmlPullParser xmlPullParser, C4360 c4360, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                boolean zEquals = "intent".equals(name);
                Context context = this.f9856;
                if (zEquals) {
                    try {
                        c4360.m9016(Intent.parseIntent(context.getResources(), xmlPullParser, attributeSet));
                    } catch (IOException e) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    context.getResources().parseBundleExtra("extra", attributeSet, c4360.m9039());
                    try {
                        int depth2 = xmlPullParser.getDepth();
                        while (true) {
                            int next2 = xmlPullParser.next();
                            if (next2 == 1 || (next2 == 3 && xmlPullParser.getDepth() <= depth2)) {
                                break;
                            }
                        }
                    } catch (IOException e2) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e2);
                        throw xmlPullParserException2;
                    }
                } else {
                    C4360 c4360M9123 = m9123(name, attributeSet);
                    ((AbstractC5701) c4360).m12691(c4360M9123);
                    m9125(xmlPullParser, c4360M9123, attributeSet);
                }
            }
        }
    }
}
