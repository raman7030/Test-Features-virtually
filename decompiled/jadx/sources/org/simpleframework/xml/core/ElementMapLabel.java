package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import org.simpleframework.xml.ElementMap;
import org.simpleframework.xml.strategy.Type;
import org.simpleframework.xml.stream.Format;
import org.simpleframework.xml.stream.Style;

/* JADX INFO: loaded from: classes2.dex */
public class ElementMapLabel extends TemplateLabel {
    public Expression cache;
    public boolean data;
    public Decorator decorator;
    public Introspector detail;
    public Entry entry;
    public Format format;
    public boolean inline;
    public Class[] items;
    public ElementMap label;
    public String name;
    public String override;
    public String parent;
    public String path;
    public boolean required;
    public Class type;

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public boolean isCollection() {
        return true;
    }

    public ElementMapLabel(Contact contact, ElementMap elementMap, Format format) {
        this.detail = new Introspector(contact, this, format);
        this.decorator = new Qualifier(contact);
        this.entry = new Entry(contact, elementMap);
        this.required = elementMap.required();
        this.type = contact.getType();
        this.inline = elementMap.inline();
        this.override = elementMap.name();
        this.data = elementMap.data();
        this.format = format;
        this.label = elementMap;
    }

    @Override // org.simpleframework.xml.core.Label
    public Decorator getDecorator() {
        return this.decorator;
    }

    @Override // org.simpleframework.xml.core.Label
    public Converter getConverter(Context context) {
        Type map = getMap();
        if (!this.label.inline()) {
            return new CompositeMap(context, this.entry, map);
        }
        return new CompositeInlineMap(context, this.entry, map);
    }

    @Override // org.simpleframework.xml.core.Label
    public Object getEmpty(Context context) {
        MapFactory mapFactory = new MapFactory(context, new ClassType(this.type));
        if (this.label.empty()) {
            return null;
        }
        return mapFactory.getInstance();
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public Type getDependent() throws ElementException {
        Contact contact = getContact();
        if (this.items == null) {
            this.items = contact.getDependents();
        }
        Class[] clsArr = this.items;
        if (clsArr == null) {
            throw new ElementException("Unable to determine type for %s", contact);
        }
        if (clsArr.length == 0) {
            return new ClassType(Object.class);
        }
        return new ClassType(clsArr[0]);
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public String getEntry() {
        Style style = this.format.getStyle();
        if (this.detail.isEmpty(this.parent)) {
            this.parent = this.detail.getEntry();
        }
        return style.getElement(this.parent);
    }

    @Override // org.simpleframework.xml.core.Label
    public String getName() {
        if (this.name == null) {
            Style style = this.format.getStyle();
            String entry = this.entry.getEntry();
            if (!this.label.inline()) {
                entry = this.detail.getName();
            }
            this.name = style.getElement(entry);
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

    private Type getMap() {
        return new ClassType(this.type);
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
