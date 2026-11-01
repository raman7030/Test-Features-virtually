package net.engio.mbassy.subscription;

import java.util.Collection;
import java.util.Comparator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import net.engio.mbassy.bus.MessagePublication;
import net.engio.mbassy.dispatch.IMessageDispatcher;

/* JADX INFO: loaded from: classes.dex */
public class Subscription {
    public static final Comparator SubscriptionByPriorityDesc = new Comparator() { // from class: net.engio.mbassy.subscription.Subscription.1
        @Override // java.util.Comparator
        public int compare(Subscription subscription, Subscription subscription2) {
            int iCompareTo = Integer.valueOf(subscription2.getPriority()).compareTo(Integer.valueOf(subscription.getPriority()));
            return iCompareTo == 0 ? subscription2.f80624id.compareTo(subscription.f80624id) : iCompareTo;
        }
    };
    public final SubscriptionContext context;
    public final IMessageDispatcher dispatcher;
    public final Collection listeners;

    /* JADX INFO: renamed from: id */
    public final UUID f80624id = UUID.randomUUID();
    public final CopyOnWriteArrayList onSubscription = new CopyOnWriteArrayList();

    public Subscription(SubscriptionContext subscriptionContext, IMessageDispatcher iMessageDispatcher, Collection collection) {
        this.context = subscriptionContext;
        this.dispatcher = iMessageDispatcher;
        this.listeners = collection;
    }

    public boolean belongsTo(Class cls) {
        return this.context.getHandler().isFromListener(cls);
    }

    public boolean contains(Object obj) {
        return this.listeners.contains(obj);
    }

    public boolean handlesMessageType(Class cls) {
        return this.context.getHandler().handlesMessage(cls);
    }

    public Class[] getHandledMessageTypes() {
        return this.context.getHandler().getHandledMessages();
    }

    public void publish(MessagePublication messagePublication, Object obj) {
        if (this.listeners.isEmpty()) {
            return;
        }
        this.dispatcher.dispatch(messagePublication, obj, this.listeners);
    }

    public int getPriority() {
        return this.context.getHandler().getPriority();
    }

    public void subscribe(Object obj) {
        this.listeners.add(obj);
        for (Runnable runnable : (Runnable[]) this.onSubscription.toArray(new Runnable[0])) {
            runnable.run();
        }
    }

    public boolean unsubscribe(Object obj) {
        return this.listeners.remove(obj);
    }

    public int size() {
        return this.listeners.size();
    }

    public Handle getHandle() {
        return new Handle();
    }

    public class Handle {
        public Handle() {
        }

        public void onSubscription(Runnable runnable) {
            Subscription.this.onSubscription.add(runnable);
        }
    }
}
