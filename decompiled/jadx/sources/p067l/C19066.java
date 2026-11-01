package p067l;

import com.thegrizzlylabs.sardineandroid.model.EntityWithAnyElement;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import javax.xml.namespace.QName;
import org.simpleframework.xml.convert.Converter;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: l.ܿ᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0ACF */
/* JADX INFO: loaded from: classes5.dex */
public final class C19066 implements Converter {

    /* JADX INFO: renamed from: ֫ */
    public Class f56876;

    /* JADX INFO: renamed from: ۧ */
    public Persister f56877;

    @Override // org.simpleframework.xml.convert.Converter
    public final void write(OutputNode outputNode, Object obj) throws IllegalAccessException, InvocationTargetException {
        EntityWithAnyElement entityWithAnyElement = (EntityWithAnyElement) obj;
        for (Element element : entityWithAnyElement.getAny()) {
            OutputNode child = outputNode.getChild(element.getNodeName());
            child.getNamespaces().setReference(element.getNamespaceURI(), element.getPrefix());
            child.setValue(element.getTextContent());
            child.commit();
        }
        HashMap mapM43302 = m43302();
        for (String str : mapM43302.keySet()) {
            String name = ((Field) mapM43302.get(str)).getName();
            Object objInvoke = this.f56876.getMethod("get" + (name.substring(0, 1).toUpperCase() + name.substring(1)), null).invoke(entityWithAnyElement, null);
            if (objInvoke != null) {
                if (objInvoke instanceof String) {
                    OutputNode child2 = outputNode.getChild(str);
                    child2.setReference("DAV:");
                    child2.setValue((String) objInvoke);
                } else {
                    this.f56877.write(objInvoke, outputNode);
                }
            }
        }
    }

    public C19066(Persister persister, Class cls) {
        this.f56877 = persister;
        this.f56876 = cls;
    }

    /* JADX INFO: renamed from: ֫ */
    private HashMap m43302() {
        HashMap map = new HashMap();
        for (Field field : this.f56876.getDeclaredFields()) {
            org.simpleframework.xml.Element element = (org.simpleframework.xml.Element) field.getAnnotation(org.simpleframework.xml.Element.class);
            if (element != null) {
                map.put(element.name().equals("") ? field.getName() : element.name(), field);
            }
        }
        return map;
    }

    @Override // org.simpleframework.xml.convert.Converter
    public final Object read(InputNode inputNode) throws IllegalAccessException, InvocationTargetException {
        HashMap mapM43302 = m43302();
        Class cls = this.f56876;
        EntityWithAnyElement entityWithAnyElement = (EntityWithAnyElement) cls.newInstance();
        List any = entityWithAnyElement.getAny();
        while (true) {
            InputNode next = inputNode.getNext();
            if (next == null) {
                return entityWithAnyElement;
            }
            if (mapM43302.containsKey(next.getName())) {
                Field field = (Field) mapM43302.get(next.getName());
                String name = field.getName();
                cls.getMethod(C21466.m48631("set", name.substring(0, 1).toUpperCase() + name.substring(1)), field.getType()).invoke(entityWithAnyElement, this.f56877.read((Class) field.getType(), next));
            } else if (next.getPrefix() == null || next.getPrefix().isEmpty()) {
                while (next.getNext() != null) {
                }
            } else {
                Element elementM37197 = C16383.m37197(new QName(next.getReference(), next.getName(), next.getPrefix()));
                elementM37197.setTextContent(next.getValue());
                any.add(elementM37197);
            }
        }
    }
}
