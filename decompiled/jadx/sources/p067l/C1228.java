package p067l;

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

/* JADX INFO: renamed from: l.۟᩻ */
/* JADX INFO: compiled from: Y55F */
/* JADX INFO: loaded from: classes3.dex */
public final class C1228 extends MenuInflater {

    /* JADX INFO: renamed from: ܳ */
    public static final Class[] f26996;

    /* JADX INFO: renamed from: ܿ */
    public static final Class[] f26997;

    /* JADX INFO: renamed from: ֫ */
    public final Object[] f26998;

    /* JADX INFO: renamed from: ۧ */
    public final Object[] f26999;

    /* JADX INFO: renamed from: ܽ */
    public Context f27000;

    /* JADX INFO: renamed from: ᩳ */
    public Object f27001;

    static {
        Class[] clsArr = {Context.class};
        f26996 = clsArr;
        f26997 = clsArr;
    }

    public C1228(Context context) {
        super(context);
        this.f27000 = context;
        Object[] objArr = {context};
        this.f26999 = objArr;
        this.f26998 = objArr;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof InterfaceMenuC1983)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.f27000.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof C0994) {
                    C0994 c0994 = (C0994) menu;
                    if (c0994.isDispatchingItemsChanged()) {
                        c0994.stopDispatchingItemsChanged();
                        z = true;
                    }
                }
                m22800(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((C0994) menu).startDispatchingItemsChanged();
                }
                layout.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((C0994) menu).startDispatchingItemsChanged();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m22800(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        C1543 c1543 = new C1543(this, menu);
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
                        c1543.m35889();
                    } else if (name2.equals("item")) {
                        if (!c1543.m35888()) {
                            AbstractC1693 abstractC1693 = c1543.f45772;
                            if (abstractC1693 != null && abstractC1693.mo30408()) {
                                c1543.m35886();
                            } else {
                                c1543.m35884();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    c1543.m35885(attributeSet);
                } else if (name3.equals("item")) {
                    c1543.m35887(attributeSet);
                } else if (name3.equals("menu")) {
                    m22800(xmlPullParser, attributeSet, c1543.m35886());
                } else {
                    z2 = true;
                    str = name3;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m22801() {
        if (this.f27001 == null) {
            this.f27001 = m22799(this.f27000);
        }
        return this.f27001;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m22799(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m22799(((ContextWrapper) obj).getBaseContext()) : obj;
    }
}
