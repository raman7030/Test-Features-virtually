package l;

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
public final class C2116 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Class[] f7068 = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final HashMap f7069 = new HashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Context f7071;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C17638 f7073;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object[] f7070 = new Object[2];

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String[] f7072 = {C2095.class.getPackage().getName() + ".", C0704.class.getPackage().getName() + "."};

    public C2116(Context context, C17638 c17638) {
        this.f7071 = context;
        this.f7073 = c17638;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC3506 m7015(int i, C7055 c7055) {
        XmlResourceParser xml = this.f7071.getResources().getXml(i);
        try {
            return m7016(xml, c7055);
        } finally {
            xml.close();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC3506 m7016(XmlResourceParser xmlResourceParser, AbstractC3506 abstractC3506) {
        int next;
        synchronized (this.f7070) {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
            this.f7070[0] = this.f7071;
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
            AbstractC3506 abstractC3507 = (AbstractC3506) m7012(xmlResourceParser.getName(), attributeSetAsAttributeSet);
            if (abstractC3506 == null) {
                abstractC3507.m6900(this.f7073);
                abstractC3506 = abstractC3507;
            }
            m7014(xmlResourceParser, abstractC3506, attributeSetAsAttributeSet);
        }
        return abstractC3506;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C2095 m7013(String str, String[] strArr, AttributeSet attributeSet) throws ClassNotFoundException {
        Class<?> cls;
        HashMap map = f7069;
        Constructor<?> constructor = (Constructor) map.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.f7071.getClassLoader();
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
                    constructor = cls.getConstructor(f7068);
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
        Object[] objArr = this.f7070;
        objArr[1] = attributeSet;
        return (C2095) constructor.newInstance(objArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C2095 m7012(String str, AttributeSet attributeSet) {
        try {
            if (-1 == str.indexOf(46)) {
                return m7013(str, this.f7072, attributeSet);
            }
            return m7013(str, (String[]) null, attributeSet);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m7014(XmlPullParser xmlPullParser, C2095 c2095, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                boolean zEquals = "intent".equals(name);
                Context context = this.f7071;
                if (zEquals) {
                    try {
                        c2095.m6890(Intent.parseIntent(context.getResources(), xmlPullParser, attributeSet));
                    } catch (IOException e) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    context.getResources().parseBundleExtra("extra", attributeSet, c2095.m6913());
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
                    C2095 c2095M7012 = m7012(name, attributeSet);
                    ((AbstractC3506) c2095).m10696(c2095M7012);
                    m7014(xmlPullParser, c2095M7012, attributeSet);
                }
            }
        }
    }
}
