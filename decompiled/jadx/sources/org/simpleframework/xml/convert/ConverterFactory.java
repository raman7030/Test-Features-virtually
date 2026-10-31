package org.simpleframework.xml.convert;

import java.lang.reflect.Constructor;
import org.simpleframework.xml.util.Cache;
import org.simpleframework.xml.util.ConcurrentCache;

/* JADX INFO: loaded from: classes2.dex */
public class ConverterFactory {
    public final Cache cache = new ConcurrentCache();

    public Converter getInstance(Class cls) {
        Converter converter = (Converter) this.cache.fetch(cls);
        return converter == null ? getConverter(cls) : converter;
    }

    public Converter getInstance(Convert convert) throws ConvertException {
        Class clsValue = convert.value();
        if (clsValue.isInterface()) {
            throw new ConvertException("Can not instantiate %s", clsValue);
        }
        return getInstance(clsValue);
    }

    private Converter getConverter(Class cls) throws ConvertException, NoSuchMethodException {
        Constructor constructor = getConstructor(cls);
        if (constructor == null) {
            throw new ConvertException("No default constructor for %s", cls);
        }
        return getConverter(cls, constructor);
    }

    private Converter getConverter(Class cls, Constructor constructor) {
        Converter converter = (Converter) constructor.newInstance(null);
        if (converter != null) {
            this.cache.cache(cls, converter);
        }
        return converter;
    }

    private Constructor getConstructor(Class cls) throws NoSuchMethodException {
        Constructor declaredConstructor = cls.getDeclaredConstructor(null);
        if (!declaredConstructor.isAccessible()) {
            declaredConstructor.setAccessible(true);
        }
        return declaredConstructor;
    }
}
