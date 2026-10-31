package l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y55F */
/* JADX INFO: loaded from: classes3.dex */
public final class C7790 extends MenuInflater {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Class[] f24079;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Class[] f24080;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object[] f24081;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object[] f24082;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Context f24083;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Object f24084;

    static {
        Class[] clsArr = {Context.class};
        f24079 = clsArr;
        f24080 = clsArr;
    }

    public C7790(Context context) {
        super(context);
        this.f24083 = context;
        Object[] objArr = {context};
        this.f24082 = objArr;
        this.f24081 = objArr;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof InterfaceMenuC23000)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.f24083.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof C3060) {
                    C3060 c3060 = (C3060) menu;
                    if (c3060.isDispatchingItemsChanged()) {
                        c3060.stopDispatchingItemsChanged();
                        z = true;
                    }
                }
                m20819(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((C3060) menu).startDispatchingItemsChanged();
                }
                layout.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((C3060) menu).startDispatchingItemsChanged();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20819(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        C14139 c14139 = new C14139(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                }
                throw new RuntimeException("Expecting menu, got ".concat(name));
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        str = null;
                        z2 = false;
                    } else if (name2.equals("group")) {
                        c14139.m33756();
                    } else if (name2.equals("item")) {
                        if (!c14139.m33755()) {
                            AbstractC17151 abstractC17151 = c14139.f42683;
                            if (abstractC17151 != null && abstractC17151.mo28362()) {
                                c14139.m33753();
                            } else {
                                c14139.m33751();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    c14139.m33752(attributeSet);
                } else if (name3.equals("item")) {
                    c14139.m33754(attributeSet);
                } else if (name3.equals("menu")) {
                    m20819(xmlPullParser, attributeSet, c14139.m33753());
                } else {
                    z2 = true;
                    str = name3;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m20820() {
        if (this.f24084 == null) {
            this.f24084 = m20818(this.f24083);
        }
        return this.f24084;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m20818(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m20818(((ContextWrapper) obj).getBaseContext()) : obj;
    }
}
