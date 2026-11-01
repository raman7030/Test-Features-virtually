package net.engio.mbassy.bus;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import net.engio.mbassy.bus.common.PubSubSupport;
import net.engio.mbassy.bus.error.MissingPropertyException;
import p067l.C6988;

/* JADX INFO: loaded from: classes.dex */
public class BusRuntime {
    public Map properties = new HashMap();
    public PubSubSupport provider;

    public BusRuntime(PubSubSupport pubSubSupport) {
        this.provider = pubSubSupport;
    }

    public Object get(String str) {
        if (contains(str)) {
            return this.properties.get(str);
        }
        throw new MissingPropertyException(C6988.m16053("The property ", str, " is not available in this runtime"));
    }

    public PubSubSupport getProvider() {
        return this.provider;
    }

    public Collection getKeys() {
        return this.properties.keySet();
    }

    public BusRuntime add(String str, Object obj) {
        this.properties.put(str, obj);
        return this;
    }

    public boolean contains(String str) {
        return this.properties.containsKey(str);
    }
}
