package net.engio.mbassy.bus;

import net.engio.mbassy.bus.common.ErrorHandlingSupport;
import net.engio.mbassy.bus.common.GenericMessagePublicationSupport;
import net.engio.mbassy.bus.common.PubSubSupport;
import net.engio.mbassy.bus.config.BusConfiguration;
import net.engio.mbassy.bus.config.Feature;
import net.engio.mbassy.bus.config.IBusConfiguration;
import net.engio.mbassy.bus.error.IPublicationErrorHandler;
import net.engio.mbassy.bus.error.PublicationError;
import net.engio.mbassy.bus.publication.IPublicationCommand;

/* JADX INFO: loaded from: classes2.dex */
public class SyncMessageBus extends AbstractPubSubSupport implements PubSubSupport, ErrorHandlingSupport, GenericMessagePublicationSupport {
    public SyncMessageBus() {
        super(new BusConfiguration().addFeature(Feature.SyncPubSub.Default()));
    }

    public SyncMessageBus(IPublicationErrorHandler iPublicationErrorHandler) {
        super(new BusConfiguration().addFeature(Feature.SyncPubSub.Default()).addPublicationErrorHandler(iPublicationErrorHandler));
    }

    public SyncMessageBus(IBusConfiguration iBusConfiguration) {
        super(iBusConfiguration);
    }

    @Override // net.engio.mbassy.bus.common.PubSubSupport
    public IMessagePublication publish(Object obj) {
        MessagePublication messagePublicationCreateMessagePublication = createMessagePublication(obj);
        try {
            messagePublicationCreateMessagePublication.execute();
            return messagePublicationCreateMessagePublication;
        } catch (Throwable th) {
            try {
                handlePublicationError(new PublicationError().setMessage("Error during publication of message").setCause(th).setPublication(messagePublicationCreateMessagePublication));
            } catch (Throwable unused) {
            }
            return messagePublicationCreateMessagePublication;
        }
    }

    @Override // net.engio.mbassy.bus.common.GenericMessagePublicationSupport
    public SyncPostCommand post(Object obj) {
        return new SyncPostCommand(obj);
    }

    /* JADX INFO: loaded from: classes.dex */
    public class SyncPostCommand implements IPublicationCommand {
        public Object message;

        public SyncPostCommand(Object obj) {
            this.message = obj;
        }

        @Override // net.engio.mbassy.bus.publication.IPublicationCommand
        public IMessagePublication now() {
            return SyncMessageBus.this.publish(this.message);
        }
    }
}
