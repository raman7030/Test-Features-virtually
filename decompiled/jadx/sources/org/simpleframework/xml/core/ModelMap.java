package org.simpleframework.xml.core;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ModelMap extends LinkedHashMap implements Iterable {
    public final Detail detail;

    public ModelMap(Detail detail) {
        this.detail = detail;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ModelMap getModels() throws PathException {
        ModelMap modelMap = new ModelMap(this.detail);
        for (K k : keySet()) {
            ModelList modelListBuild = (ModelList) get(k);
            if (modelListBuild != null) {
                modelListBuild = modelListBuild.build();
            }
            if (modelMap.containsKey(k)) {
                throw new PathException("Path with name '%s' is a duplicate in %s ", k, this.detail);
            }
            modelMap.put(k, modelListBuild);
        }
        return modelMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Model lookup(String str, int i) {
        ModelList modelList = (ModelList) get(str);
        if (modelList != null) {
            return modelList.lookup(i);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void register(String str, Model model) {
        ModelList modelList = (ModelList) get(str);
        if (modelList == null) {
            modelList = new ModelList();
            put(str, modelList);
        }
        modelList.register(model);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return values().iterator();
    }
}
