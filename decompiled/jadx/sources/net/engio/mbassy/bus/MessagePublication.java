package net.engio.mbassy.bus;

import java.util.Collection;
import java.util.Iterator;
import net.engio.mbassy.bus.common.DeadMessage;
import net.engio.mbassy.bus.common.FilteredMessage;
import net.engio.mbassy.bus.error.PublicationError;
import net.engio.mbassy.subscription.Subscription;

/* JADX INFO: loaded from: classes.dex */
public class MessagePublication implements IMessagePublication {
    public volatile boolean dispatched = false;
    public PublicationError error = null;
    public final Object message;
    public final BusRuntime runtime;
    public volatile State state;
    public final Collection subscriptions;

    public enum State {
        Initial,
        Scheduled,
        Running,
        Finished
    }

    public MessagePublication(BusRuntime busRuntime, Collection collection, Object obj, State state) {
        this.state = State.Initial;
        this.runtime = busRuntime;
        this.subscriptions = collection;
        this.message = obj;
        this.state = state;
    }

    public boolean add(Subscription subscription) {
        return this.subscriptions.add(subscription);
    }

    @Override // net.engio.mbassy.bus.IMessagePublication
    public void execute() {
        this.state = State.Running;
        Iterator it = this.subscriptions.iterator();
        while (it.hasNext()) {
            ((Subscription) it.next()).publish(this, this.message);
        }
        this.state = State.Finished;
        if (this.dispatched) {
            return;
        }
        if (!isFilteredMessage() && !isDeadMessage()) {
            this.runtime.getProvider().publish(new FilteredMessage(this.message));
        } else {
            if (isDeadMessage()) {
                return;
            }
            this.runtime.getProvider().publish(new DeadMessage(this.message));
        }
    }

    @Override // net.engio.mbassy.bus.IMessagePublication
    public boolean isFinished() {
        return this.state.equals(State.Finished);
    }

    @Override // net.engio.mbassy.bus.IMessagePublication
    public boolean isRunning() {
        return this.state.equals(State.Running);
    }

    @Override // net.engio.mbassy.bus.IMessagePublication
    public boolean isScheduled() {
        return this.state.equals(State.Scheduled);
    }

    @Override // net.engio.mbassy.bus.IMessagePublication
    public boolean hasError() {
        return this.error != null;
    }

    @Override // net.engio.mbassy.bus.IMessagePublication
    public PublicationError getError() {
        return this.error;
    }

    public void markDispatched() {
        this.dispatched = true;
    }

    public void markError(PublicationError publicationError) {
        this.error = publicationError;
    }

    public MessagePublication markScheduled() {
        if (this.state.equals(State.Initial)) {
            this.state = State.Scheduled;
        }
        return this;
    }

    @Override // net.engio.mbassy.bus.IMessagePublication
    public boolean isDeadMessage() {
        return DeadMessage.class.equals(this.message.getClass());
    }

    @Override // net.engio.mbassy.bus.IMessagePublication
    public boolean isFilteredMessage() {
        return FilteredMessage.class.equals(this.message.getClass());
    }

    @Override // net.engio.mbassy.bus.IMessagePublication
    public Object getMessage() {
        return this.message;
    }

    public class Factory {
        public MessagePublication createPublication(BusRuntime busRuntime, Collection collection, Object obj) {
            return new MessagePublication(busRuntime, collection, obj, State.Initial);
        }
    }
}
