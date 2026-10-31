package net.engio.mbassy.bus;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import l.C4860;
import net.engio.mbassy.bus.common.PubSubSupport;
import net.engio.mbassy.bus.error.MissingPropertyException;

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
        throw new MissingPropertyException(C4860.m14172("The property ", str, " is not available in this runtime"));
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
