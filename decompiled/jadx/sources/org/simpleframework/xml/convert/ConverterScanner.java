package org.simpleframework.xml.convert;

import java.lang.annotation.Annotation;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.strategy.Type;
import org.simpleframework.xml.strategy.Value;

/* JADX INFO: loaded from: classes2.dex */
public class ConverterScanner {
    public final ConverterFactory factory = new ConverterFactory();
    public final ScannerBuilder builder = new ScannerBuilder();

    public Converter getConverter(Type type, Value value) throws ConvertException {
        Convert convert = getConvert(type, getType(type, value));
        if (convert != null) {
            return this.factory.getInstance(convert);
        }
        return null;
    }

    public Converter getConverter(Type type, Object obj) throws ConvertException {
        Convert convert = getConvert(type, getType(type, obj));
        if (convert != null) {
            return this.factory.getInstance(convert);
        }
        return null;
    }

    private Convert getConvert(Type type, Class cls) throws ConvertException {
        Convert convert = getConvert(type);
        return convert == null ? getConvert(cls) : convert;
    }

    private Convert getConvert(Type type) throws ConvertException {
        Convert convert = (Convert) type.getAnnotation(Convert.class);
        if (convert == null || ((Element) type.getAnnotation(Element.class)) != null) {
            return convert;
        }
        throw new ConvertException("Element annotation required for %s", type);
    }

    private Convert getConvert(Class cls) throws ConvertException {
        Convert convert = (Convert) getAnnotation(cls, Convert.class);
        if (convert == null || ((Root) getAnnotation(cls, Root.class)) != null) {
            return convert;
        }
        throw new ConvertException("Root annotation required for %s", cls);
    }

    private Annotation getAnnotation(Class cls, Class cls2) {
        return this.builder.build(cls).scan(cls2);
    }

    private Class getType(Type type, Value value) {
        return value != null ? value.getType() : type.getType();
    }

    private Class getType(Type type, Object obj) {
        return obj != null ? obj.getClass() : type.getType();
    }
}
