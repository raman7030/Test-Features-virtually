package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.strategy.Type;
import org.simpleframework.xml.stream.Format;
import org.simpleframework.xml.stream.Style;

/* JADX INFO: loaded from: classes2.dex */
public class ElementListLabel extends TemplateLabel {
    public Expression cache;
    public boolean data;
    public Decorator decorator;
    public Introspector detail;
    public String entry;
    public Format format;
    public boolean inline;
    public Class item;
    public ElementList label;
    public String name;
    public String override;
    public String path;
    public boolean required;
    public Class type;

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public boolean isCollection() {
        return true;
    }

    public ElementListLabel(Contact contact, ElementList elementList, Format format) {
        this.detail = new Introspector(contact, this, format);
        this.decorator = new Qualifier(contact);
        this.required = elementList.required();
        this.type = contact.getType();
        this.override = elementList.name();
        this.inline = elementList.inline();
        this.entry = elementList.entry();
        this.data = elementList.data();
        this.item = elementList.type();
        this.format = format;
        this.label = elementList;
    }

    @Override // org.simpleframework.xml.core.Label
    public Decorator getDecorator() {
        return this.decorator;
    }

    @Override // org.simpleframework.xml.core.Label
    public Converter getConverter(Context context) {
        String entry = getEntry();
        if (!this.label.inline()) {
            return getConverter(context, entry);
        }
        return getInlineConverter(context, entry);
    }

    private Converter getConverter(Context context, String str) throws ElementException {
        Type dependent = getDependent();
        Contact contact = getContact();
        if (!context.isPrimitive(dependent)) {
            return new CompositeList(context, contact, dependent, str);
        }
        return new PrimitiveList(context, contact, dependent, str);
    }

    private Converter getInlineConverter(Context context, String str) throws ElementException {
        Type dependent = getDependent();
        Contact contact = getContact();
        if (!context.isPrimitive(dependent)) {
            return new CompositeInlineList(context, contact, dependent, str);
        }
        return new PrimitiveInlineList(context, contact, dependent, str);
    }

    @Override // org.simpleframework.xml.core.Label
    public Object getEmpty(Context context) {
        CollectionFactory collectionFactory = new CollectionFactory(context, new ClassType(this.type));
        if (this.label.empty()) {
            return null;
        }
        return collectionFactory.getInstance();
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public Type getDependent() throws ElementException {
        Contact contact = getContact();
        if (this.item == Void.TYPE) {
            this.item = contact.getDependent();
        }
        Class cls = this.item;
        if (cls == null) {
            throw new ElementException("Unable to determine generic type for %s", contact);
        }
        return new ClassType(cls);
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public String getEntry() {
        Style style = this.format.getStyle();
        if (this.detail.isEmpty(this.entry)) {
            this.entry = this.detail.getEntry();
        }
        return style.getElement(this.entry);
    }

    @Override // org.simpleframework.xml.core.Label
    public String getName() {
        if (this.name == null) {
            this.name = this.format.getStyle().getElement(this.detail.getName());
        }
        return this.name;
    }

    @Override // org.simpleframework.xml.core.Label
    public String getPath() {
        if (this.path == null) {
            this.path = getExpression().getElement(getName());
        }
        return this.path;
    }

    @Override // org.simpleframework.xml.core.Label
    public Expression getExpression() {
        if (this.cache == null) {
            this.cache = this.detail.getExpression();
        }
        return this.cache;
    }

    @Override // org.simpleframework.xml.core.Label
    public Annotation getAnnotation() {
        return this.label;
    }

    @Override // org.simpleframework.xml.core.Label
    public Class getType() {
        return this.type;
    }

    @Override // org.simpleframework.xml.core.Label
    public Contact getContact() {
        return this.detail.getContact();
    }

    @Override // org.simpleframework.xml.core.Label
    public String getOverride() {
        return this.override;
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isData() {
        return this.data;
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isRequired() {
        return this.required;
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public boolean isInline() {
        return this.inline;
    }

    @Override // org.simpleframework.xml.core.Label
    public String toString() {
        return this.detail.toString();
    }
}
