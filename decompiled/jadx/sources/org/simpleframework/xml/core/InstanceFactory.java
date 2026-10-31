package org.simpleframework.xml.core;

import java.lang.reflect.Constructor;
import org.simpleframework.xml.strategy.Value;
import org.simpleframework.xml.util.Cache;
import org.simpleframework.xml.util.ConcurrentCache;

/* JADX INFO: loaded from: classes2.dex */
public class InstanceFactory {
    public final Cache cache = new ConcurrentCache();

    public Instance getInstance(Value value) {
        return new ValueInstance(value);
    }

    public Instance getInstance(Class cls) {
        return new ClassInstance(cls);
    }

    public Object getObject(Class cls) throws NoSuchMethodException {
        Constructor declaredConstructor = (Constructor) this.cache.fetch(cls);
        if (declaredConstructor == null) {
            declaredConstructor = cls.getDeclaredConstructor(null);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            this.cache.cache(cls, declaredConstructor);
        }
        return declaredConstructor.newInstance(null);
    }

    public class ValueInstance implements Instance {
        public final Class type;
        public final Value value;

        public ValueInstance(Value value) {
            this.type = value.getType();
            this.value = value;
        }

        @Override // org.simpleframework.xml.core.Instance
        public Object getInstance() throws NoSuchMethodException {
            if (this.value.isReference()) {
                return this.value.getValue();
            }
            Object object = InstanceFactory.this.getObject(this.type);
            Value value = this.value;
            if (value != null) {
                value.setValue(object);
            }
            return object;
        }

        @Override // org.simpleframework.xml.core.Instance
        public Object setInstance(Object obj) {
            Value value = this.value;
            if (value != null) {
                value.setValue(obj);
            }
            return obj;
        }

        @Override // org.simpleframework.xml.core.Instance
        public boolean isReference() {
            return this.value.isReference();
        }

        @Override // org.simpleframework.xml.core.Instance
        public Class getType() {
            return this.type;
        }
    }

    public class ClassInstance implements Instance {
        public Class type;
        public Object value;

        @Override // org.simpleframework.xml.core.Instance
        public boolean isReference() {
            return false;
        }

        public ClassInstance(Class cls) {
            this.type = cls;
        }

        @Override // org.simpleframework.xml.core.Instance
        public Object getInstance() {
            if (this.value == null) {
                this.value = InstanceFactory.this.getObject(this.type);
            }
            return this.value;
        }

        @Override // org.simpleframework.xml.core.Instance
        public Object setInstance(Object obj) {
            this.value = obj;
            return obj;
        }

        @Override // org.simpleframework.xml.core.Instance
        public Class getType() {
            return this.type;
        }
    }
}
