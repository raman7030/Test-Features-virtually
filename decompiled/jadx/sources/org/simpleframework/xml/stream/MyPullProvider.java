package org.simpleframework.xml.stream;

import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.Field;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes2.dex */
public class MyPullProvider implements Provider {
    public final XmlPullParserFactory factory;

    public static void inject() {
        try {
            Field declaredField = NodeBuilder.class.getDeclaredField("PROVIDER");
            declaredField.setAccessible(true);
            declaredField.set(null, new MyPullProvider());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MyPullProvider() throws XmlPullParserException {
        XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
        this.factory = xmlPullParserFactoryNewInstance;
        xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        xmlPullParserFactoryNewInstance.setFeature("http://xmlpull.org/v1/doc/features.html#relaxed", true);
    }

    @Override // org.simpleframework.xml.stream.Provider
    public EventReader provide(InputStream inputStream) throws XmlPullParserException {
        XmlPullParser xmlPullParserNewPullParser = this.factory.newPullParser();
        if (inputStream != null) {
            xmlPullParserNewPullParser.setInput(inputStream, null);
        }
        return new PullReader(xmlPullParserNewPullParser);
    }

    @Override // org.simpleframework.xml.stream.Provider
    public EventReader provide(Reader reader) throws XmlPullParserException {
        XmlPullParser xmlPullParserNewPullParser = this.factory.newPullParser();
        if (reader != null) {
            xmlPullParserNewPullParser.setInput(reader);
        }
        return new PullReader(xmlPullParserNewPullParser);
    }
}
