package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementArray;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;
import org.simpleframework.xml.ElementMap;
import org.simpleframework.xml.ElementMapUnion;
import org.simpleframework.xml.ElementUnion;
import org.simpleframework.xml.Text;

/* JADX INFO: loaded from: classes2.dex */
public class SignatureScanner {
    public final SignatureBuilder builder;
    public final Constructor constructor;
    public final ParameterFactory factory;
    public final ParameterMap registry;
    public final Class type;

    public SignatureScanner(Constructor constructor, ParameterMap parameterMap, Support support) {
        this.builder = new SignatureBuilder(constructor);
        this.factory = new ParameterFactory(support);
        Class declaringClass = constructor.getDeclaringClass();
        this.type = declaringClass;
        this.constructor = constructor;
        this.registry = parameterMap;
        scan(declaringClass);
    }

    public boolean isValid() {
        return this.builder.isValid();
    }

    public List getSignatures() {
        return this.builder.build();
    }

    private void scan(Class cls) {
        Class<?>[] parameterTypes = this.constructor.getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            scan(parameterTypes[i], i);
        }
    }

    private void scan(Class cls, int i) {
        Annotation[][] parameterAnnotations = this.constructor.getParameterAnnotations();
        int i2 = 0;
        while (true) {
            Annotation[] annotationArr = parameterAnnotations[i];
            if (i2 >= annotationArr.length) {
                return;
            }
            Iterator it = process(annotationArr[i2], i).iterator();
            while (it.hasNext()) {
                this.builder.insert((Parameter) it.next(), i);
            }
            i2++;
        }
    }

    private List process(Annotation annotation, int i) {
        if (annotation instanceof Attribute) {
            return create(annotation, i);
        }
        if (annotation instanceof Element) {
            return create(annotation, i);
        }
        if (annotation instanceof ElementList) {
            return create(annotation, i);
        }
        if (annotation instanceof ElementArray) {
            return create(annotation, i);
        }
        if (annotation instanceof ElementMap) {
            return create(annotation, i);
        }
        if (annotation instanceof ElementListUnion) {
            return union(annotation, i);
        }
        if (annotation instanceof ElementMapUnion) {
            return union(annotation, i);
        }
        if (annotation instanceof ElementUnion) {
            return union(annotation, i);
        }
        if (annotation instanceof Text) {
            return create(annotation, i);
        }
        return Collections.EMPTY_LIST;
    }

    private List union(Annotation annotation, int i) throws UnionException, ConstructorException {
        Signature signature = new Signature(this.constructor);
        for (Annotation annotation2 : extract(annotation)) {
            Parameter parameterFactory = this.factory.getInstance(this.constructor, annotation, annotation2, i);
            String path = parameterFactory.getPath();
            if (signature.contains(path)) {
                throw new UnionException("Annotation name '%s' used more than once in %s for %s", path, annotation, this.type);
            }
            signature.set(path, parameterFactory);
            register(parameterFactory);
        }
        return signature.getAll();
    }

    private List create(Annotation annotation, int i) throws ConstructorException {
        Parameter parameterFactory = this.factory.getInstance(this.constructor, annotation, i);
        if (parameterFactory != null) {
            register(parameterFactory);
        }
        return Collections.singletonList(parameterFactory);
    }

    private Annotation[] extract(Annotation annotation) throws UnionException {
        Method[] declaredMethods = annotation.annotationType().getDeclaredMethods();
        if (declaredMethods.length != 1) {
            throw new UnionException("Annotation '%s' is not a valid union for %s", annotation, this.type);
        }
        return (Annotation[]) declaredMethods[0].invoke(annotation, null);
    }

    private void register(Parameter parameter) throws ConstructorException {
        String path = parameter.getPath();
        Object key = parameter.getKey();
        if (this.registry.containsKey(key)) {
            validate(parameter, key);
        }
        if (this.registry.containsKey(path)) {
            validate(parameter, path);
        }
        this.registry.put(path, parameter);
        this.registry.put(key, parameter);
    }

    private void validate(Parameter parameter, Object obj) throws ConstructorException {
        Parameter parameter2 = (Parameter) this.registry.get(obj);
        if (parameter.isText() != parameter2.isText()) {
            Annotation annotation = parameter.getAnnotation();
            Annotation annotation2 = parameter2.getAnnotation();
            String path = parameter.getPath();
            if (!annotation.equals(annotation2)) {
                throw new ConstructorException("Annotations do not match for '%s' in %s", path, this.type);
            }
            if (parameter2.getType() != parameter.getType()) {
                throw new ConstructorException("Parameter types do not match for '%s' in %s", path, this.type);
            }
        }
    }
}
