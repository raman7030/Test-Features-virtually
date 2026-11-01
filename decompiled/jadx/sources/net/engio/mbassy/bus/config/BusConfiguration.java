package net.engio.mbassy.bus.config;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.engio.mbassy.bus.error.IPublicationErrorHandler;
import p067l.C21562;

/* JADX INFO: loaded from: classes.dex */
public class BusConfiguration implements IBusConfiguration {
    public final Map properties = new HashMap();
    public final List publicationErrorHandlers = new ArrayList();

    @Override // net.engio.mbassy.bus.config.IBusConfiguration
    public IBusConfiguration setProperty(String str, Object obj) {
        this.properties.put(str, obj);
        return this;
    }

    @Override // net.engio.mbassy.bus.config.IBusConfiguration
    public Object getProperty(String str, Object obj) {
        return this.properties.containsKey(str) ? this.properties.get(str) : obj;
    }

    @Override // net.engio.mbassy.bus.config.IBusConfiguration
    public boolean hasProperty(String str) {
        return this.properties.containsKey(str);
    }

    @Override // net.engio.mbassy.bus.config.IBusConfiguration
    public Feature getFeature(Class cls) {
        return (Feature) this.properties.get(cls);
    }

    @Override // net.engio.mbassy.bus.config.IBusConfiguration
    public IBusConfiguration addFeature(Feature feature) {
        this.properties.put(feature.getClass(), feature);
        return this;
    }

    @Override // net.engio.mbassy.bus.config.IBusConfiguration
    public final BusConfiguration addPublicationErrorHandler(IPublicationErrorHandler iPublicationErrorHandler) {
        this.publicationErrorHandlers.add(iPublicationErrorHandler);
        return this;
    }

    @Override // net.engio.mbassy.bus.config.IBusConfiguration
    public Collection getRegisteredPublicationErrorHandlers() {
        return C21562.unmodifiableCollection(this.publicationErrorHandlers);
    }
}
