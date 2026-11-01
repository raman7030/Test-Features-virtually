package net.engio.mbassy.bus;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import net.engio.mbassy.bus.common.DeadMessage;
import net.engio.mbassy.bus.common.PubSubSupport;
import net.engio.mbassy.bus.config.ConfigurationError;
import net.engio.mbassy.bus.config.Feature;
import net.engio.mbassy.bus.config.IBusConfiguration;
import net.engio.mbassy.bus.error.IPublicationErrorHandler;
import net.engio.mbassy.bus.error.PublicationError;
import net.engio.mbassy.subscription.SubscriptionManager;
import p067l.C21562;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractPubSubSupport implements PubSubSupport {
    public static final String ERROR_HANDLER_MSG = "INFO: No error handler has been configured to handle exceptions during publication.\nPublication error handlers can be added by IBusConfiguration.addPublicationErrorHandler()\nFalling back to console logger.";
    public final List errorHandlers;
    public final MessagePublication.Factory publicationFactory;
    public final BusRuntime runtime;
    public final SubscriptionManager subscriptionManager;

    public AbstractPubSubSupport(IBusConfiguration iBusConfiguration) {
        ArrayList arrayList = new ArrayList();
        this.errorHandlers = arrayList;
        arrayList.addAll(iBusConfiguration.getRegisteredPublicationErrorHandlers());
        if (arrayList.isEmpty()) {
            arrayList.add(new IPublicationErrorHandler.ConsoleLogger());
            System.out.println(ERROR_HANDLER_MSG);
        }
        BusRuntime busRuntimeAdd = new BusRuntime(this).add(IBusConfiguration.Properties.PublicationErrorHandlers, iBusConfiguration.getRegisteredPublicationErrorHandlers()).add(IBusConfiguration.Properties.BusId, iBusConfiguration.getProperty(IBusConfiguration.Properties.BusId, UUID.randomUUID().toString()));
        this.runtime = busRuntimeAdd;
        Feature.SyncPubSub syncPubSub = (Feature.SyncPubSub) iBusConfiguration.getFeature(Feature.SyncPubSub.class);
        if (syncPubSub == null) {
            throw ConfigurationError.MissingFeature(Feature.SyncPubSub.class);
        }
        this.subscriptionManager = syncPubSub.getSubscriptionManagerProvider().createManager(syncPubSub.getMetadataReader(), syncPubSub.getSubscriptionFactory(), busRuntimeAdd);
        this.publicationFactory = syncPubSub.getPublicationFactory();
    }

    public MessagePublication.Factory getPublicationFactory() {
        return this.publicationFactory;
    }

    public Collection getRegisteredErrorHandlers() {
        return C21562.unmodifiableCollection(this.errorHandlers);
    }

    @Override // net.engio.mbassy.bus.common.PubSubSupport
    public boolean unsubscribe(Object obj) {
        return this.subscriptionManager.unsubscribe(obj);
    }

    @Override // net.engio.mbassy.bus.common.PubSubSupport
    public void subscribe(Object obj) {
        this.subscriptionManager.subscribe(obj);
    }

    @Override // net.engio.mbassy.bus.common.RuntimeProvider
    public BusRuntime getRuntime() {
        return this.runtime;
    }

    public MessagePublication createMessagePublication(Object obj) {
        Collection subscriptionsByMessageType = getSubscriptionsByMessageType(obj.getClass());
        if ((subscriptionsByMessageType == null || subscriptionsByMessageType.isEmpty()) && !obj.getClass().equals(DeadMessage.class)) {
            return getPublicationFactory().createPublication(this.runtime, getSubscriptionsByMessageType(DeadMessage.class), new DeadMessage(obj));
        }
        return getPublicationFactory().createPublication(this.runtime, subscriptionsByMessageType, obj);
    }

    public Collection getSubscriptionsByMessageType(Class cls) {
        return this.subscriptionManager.getSubscriptionsByMessageType(cls);
    }

    public void handlePublicationError(PublicationError publicationError) {
        Iterator it = this.errorHandlers.iterator();
        while (it.hasNext()) {
            try {
                ((IPublicationErrorHandler) it.next()).handleError(publicationError);
            } catch (Throwable unused) {
            }
        }
    }

    public String toString() {
        return getClass().getSimpleName() + MotionUtils.EASING_TYPE_FORMAT_START + this.runtime.get(IBusConfiguration.Properties.BusId) + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
