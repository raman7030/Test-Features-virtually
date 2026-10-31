package org.simpleframework.xml.stream;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class PrefixResolver extends LinkedHashMap implements NamespaceMap {
    public final OutputNode source;

    public PrefixResolver(OutputNode outputNode) {
        this.source = outputNode;
    }

    @Override // org.simpleframework.xml.stream.NamespaceMap
    public String getPrefix() {
        return this.source.getPrefix();
    }

    @Override // org.simpleframework.xml.stream.NamespaceMap
    public String setReference(String str) {
        return setReference(str, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.simpleframework.xml.stream.NamespaceMap
    public String setReference(String str, String str2) {
        if (resolvePrefix(str) != null) {
            return null;
        }
        return (String) put(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.simpleframework.xml.stream.NamespaceMap
    public String getPrefix(String str) {
        String str2;
        return (size() <= 0 || (str2 = (String) get(str)) == null) ? resolvePrefix(str) : str2;
    }

    @Override // org.simpleframework.xml.stream.NamespaceMap
    public String getReference(String str) {
        if (containsValue(str)) {
            Iterator it = iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = (String) get(str2);
                if (str3 != null && str3.equals(str)) {
                    return str2;
                }
            }
        }
        return resolveReference(str);
    }

    private String resolveReference(String str) {
        NamespaceMap namespaces = this.source.getNamespaces();
        if (namespaces != null) {
            return namespaces.getReference(str);
        }
        return null;
    }

    private String resolvePrefix(String str) {
        NamespaceMap namespaces = this.source.getNamespaces();
        if (namespaces == null) {
            return null;
        }
        String prefix = namespaces.getPrefix(str);
        if (containsValue(prefix)) {
            return null;
        }
        return prefix;
    }

    @Override // org.simpleframework.xml.stream.NamespaceMap, java.lang.Iterable
    public Iterator iterator() {
        return keySet().iterator();
    }
}
