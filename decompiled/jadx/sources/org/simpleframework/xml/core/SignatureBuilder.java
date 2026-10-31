package org.simpleframework.xml.core;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class SignatureBuilder {
    public final Constructor factory;
    public final ParameterTable table = new ParameterTable();

    public SignatureBuilder(Constructor constructor) {
        this.factory = constructor;
    }

    public boolean isValid() {
        return this.factory.getParameterTypes().length == this.table.width();
    }

    public void insert(Parameter parameter, int i) {
        this.table.insert(parameter, i);
    }

    public List build() {
        return build(new ParameterTable());
    }

    private List build(ParameterTable parameterTable) {
        if (this.table.isEmpty()) {
            return create();
        }
        build(parameterTable, 0);
        return create(parameterTable);
    }

    private List create() {
        ArrayList arrayList = new ArrayList();
        Signature signature = new Signature(this.factory);
        if (isValid()) {
            arrayList.add(signature);
        }
        return arrayList;
    }

    private List create(ParameterTable parameterTable) throws ConstructorException {
        ArrayList arrayList = new ArrayList();
        int iHeight = parameterTable.height();
        int iWidth = parameterTable.width();
        for (int i = 0; i < iHeight; i++) {
            Signature signature = new Signature(this.factory);
            for (int i2 = 0; i2 < iWidth; i2++) {
                Parameter parameter = parameterTable.get(i2, i);
                String path = parameter.getPath();
                if (signature.contains(parameter.getKey())) {
                    throw new ConstructorException("Parameter '%s' is a duplicate in %s", path, this.factory);
                }
                signature.add(parameter);
            }
            arrayList.add(signature);
        }
        return arrayList;
    }

    private void build(ParameterTable parameterTable, int i) {
        build(parameterTable, new ParameterList(), i);
    }

    private void build(ParameterTable parameterTable, ParameterList parameterList, int i) {
        ParameterList parameterList2 = this.table.get(i);
        int size = parameterList2.size();
        if (this.table.width() - 1 <= i) {
            populate(parameterTable, parameterList, i);
            return;
        }
        for (int i2 = 0; i2 < size; i2++) {
            ParameterList parameterList3 = new ParameterList(parameterList);
            if (parameterList != null) {
                parameterList3.add((Parameter) parameterList2.get(i2));
                build(parameterTable, parameterList3, i + 1);
            }
        }
    }

    private void populate(ParameterTable parameterTable, ParameterList parameterList, int i) {
        ParameterList parameterList2 = this.table.get(i);
        int size = parameterList.size();
        int size2 = parameterList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            for (int i3 = 0; i3 < size; i3++) {
                parameterTable.get(i3).add((Parameter) parameterList.get(i3));
            }
            parameterTable.get(i).add((Parameter) parameterList2.get(i2));
        }
    }

    public class ParameterTable extends ArrayList {
        /* JADX INFO: Access modifiers changed from: private */
        public int height() {
            if (width() > 0) {
                return get(0).size();
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int width() {
            return size();
        }

        public void insert(Parameter parameter, int i) {
            ParameterList parameterList = get(i);
            if (parameterList != null) {
                parameterList.add(parameter);
            }
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public ParameterList get(int i) {
            for (int size = size(); size <= i; size++) {
                add(new ParameterList());
            }
            return (ParameterList) super.get(i);
        }

        public Parameter get(int i, int i2) {
            return (Parameter) get(i).get(i2);
        }
    }

    public class ParameterList extends ArrayList {
        public ParameterList() {
        }

        public ParameterList(ParameterList parameterList) {
            super(parameterList);
        }
    }
}
