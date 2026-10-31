package org.simpleframework.xml.core;

import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.util.Cache;
import org.simpleframework.xml.util.ConcurrentCache;

/* JADX INFO: loaded from: classes2.dex */
public class DetailExtractor {
    public final Cache details;
    public final Cache fields;
    public final Cache methods;
    public final DefaultType override;
    public final Support support;

    public DetailExtractor(Support support) {
        this(support, null);
    }

    public DetailExtractor(Support support, DefaultType defaultType) {
        this.methods = new ConcurrentCache();
        this.fields = new ConcurrentCache();
        this.details = new ConcurrentCache();
        this.override = defaultType;
        this.support = support;
    }

    public Detail getDetail(Class cls) {
        Detail detail = (Detail) this.details.fetch(cls);
        if (detail != null) {
            return detail;
        }
        DetailScanner detailScanner = new DetailScanner(cls, this.override);
        this.details.cache(cls, detailScanner);
        return detailScanner;
    }

    public ContactList getFields(Class cls) {
        Detail detail;
        ContactList contactList = (ContactList) this.fields.fetch(cls);
        return (contactList != null || (detail = getDetail(cls)) == null) ? contactList : getFields(cls, detail);
    }

    private ContactList getFields(Class cls, Detail detail) {
        FieldScanner fieldScanner = new FieldScanner(detail, this.support);
        if (detail != null) {
            this.fields.cache(cls, fieldScanner);
        }
        return fieldScanner;
    }

    public ContactList getMethods(Class cls) {
        Detail detail;
        ContactList contactList = (ContactList) this.methods.fetch(cls);
        return (contactList != null || (detail = getDetail(cls)) == null) ? contactList : getMethods(cls, detail);
    }

    private ContactList getMethods(Class cls, Detail detail) {
        MethodScanner methodScanner = new MethodScanner(detail, this.support);
        if (detail != null) {
            this.methods.cache(cls, methodScanner);
        }
        return methodScanner;
    }
}
