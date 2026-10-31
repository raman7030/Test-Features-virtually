package org.simpleframework.xml.core;

import org.simpleframework.xml.strategy.Type;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* JADX INFO: loaded from: classes2.dex */
public class Primitive implements Converter {
    public final Context context;
    public final String empty;
    public final Class expect;
    public final PrimitiveFactory factory;
    public final Type type;

    public Primitive(Context context, Type type) {
        this(context, type, null);
    }

    public Primitive(Context context, Type type, String str) {
        this.factory = new PrimitiveFactory(context, type);
        this.expect = type.getType();
        this.context = context;
        this.empty = str;
        this.type = type;
    }

    @Override // org.simpleframework.xml.core.Converter
    public Object read(InputNode inputNode) {
        if (inputNode.isElement()) {
            return readElement(inputNode);
        }
        return read(inputNode, this.expect);
    }

    @Override // org.simpleframework.xml.core.Converter
    public Object read(InputNode inputNode, Object obj) throws PersistenceException {
        if (obj != null) {
            throw new PersistenceException("Can not read existing %s for %s", this.expect, this.type);
        }
        return read(inputNode);
    }

    public Object read(InputNode inputNode, Class cls) {
        String value = inputNode.getValue();
        if (value == null) {
            return null;
        }
        String str = this.empty;
        if (str != null && value.equals(str)) {
            return this.empty;
        }
        return readTemplate(value, cls);
    }

    private Object readElement(InputNode inputNode) {
        Instance primitiveFactory = this.factory.getInstance(inputNode);
        if (!primitiveFactory.isReference()) {
            return readElement(inputNode, primitiveFactory);
        }
        return primitiveFactory.getInstance();
    }

    private Object readElement(InputNode inputNode, Instance instance) {
        Object obj = read(inputNode, this.expect);
        if (instance != null) {
            instance.setInstance(obj);
        }
        return obj;
    }

    private Object readTemplate(String str, Class cls) {
        String property = this.context.getProperty(str);
        if (property != null) {
            return this.factory.getInstance(property, cls);
        }
        return null;
    }

    @Override // org.simpleframework.xml.core.Converter
    public boolean validate(InputNode inputNode) {
        if (inputNode.isElement()) {
            validateElement(inputNode);
            return true;
        }
        inputNode.getValue();
        return true;
    }

    private boolean validateElement(InputNode inputNode) {
        Instance primitiveFactory = this.factory.getInstance(inputNode);
        if (primitiveFactory.isReference()) {
            return true;
        }
        primitiveFactory.setInstance(null);
        return true;
    }

    @Override // org.simpleframework.xml.core.Converter
    public void write(OutputNode outputNode, Object obj) {
        String text = this.factory.getText(obj);
        if (text != null) {
            outputNode.setValue(text);
        }
    }
}
