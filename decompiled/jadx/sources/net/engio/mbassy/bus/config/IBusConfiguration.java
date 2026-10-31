package net.engio.mbassy.bus.config;

import java.util.Collection;
import net.engio.mbassy.bus.error.IPublicationErrorHandler;

/* JADX INFO: loaded from: classes.dex */
public interface IBusConfiguration {

    public final class Properties {
        public static final String AsynchronousHandlerExecutor = "bus.handlers.async-executor";
        public static final String BusId = "bus.id";
        public static final String PublicationErrorHandlers = "bus.handlers.error";
    }

    IBusConfiguration addFeature(Feature feature);

    BusConfiguration addPublicationErrorHandler(IPublicationErrorHandler iPublicationErrorHandler);

    Feature getFeature(Class cls);

    Object getProperty(String str, Object obj);

    Collection getRegisteredPublicationErrorHandlers();

    boolean hasProperty(String str);

    IBusConfiguration setProperty(String str, Object obj);
}
