package net.engio.mbassy.listener;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import net.engio.mbassy.common.IPredicate;
import net.engio.mbassy.common.ReflectionUtils;

/* JADX INFO: loaded from: classes.dex */
public class MessageListener {
    public ArrayList handlers = new ArrayList();
    public Listener listenerAnnotation;
    public Class listenerDefinition;

    public static IPredicate ForMessage(final Class cls) {
        return new IPredicate() { // from class: net.engio.mbassy.listener.MessageListener.1
            @Override // net.engio.mbassy.common.IPredicate
            public boolean apply(MessageHandler messageHandler) {
                return messageHandler.handlesMessage(cls);
            }
        };
    }

    public MessageListener(Class cls) {
        this.listenerDefinition = cls;
        this.listenerAnnotation = (Listener) ReflectionUtils.getAnnotation(cls, Listener.class);
    }

    public boolean isFromListener(Class cls) {
        return this.listenerDefinition.equals(cls);
    }

    public boolean useStrongReferences() {
        Listener listener = this.listenerAnnotation;
        return listener != null && listener.references().equals(References.Strong);
    }

    public MessageListener addHandlers(Collection collection) {
        this.handlers.addAll(collection);
        return this;
    }

    public boolean addHandler(MessageHandler messageHandler) {
        return this.handlers.add(messageHandler);
    }

    public MessageHandler[] getHandlers() {
        return (MessageHandler[]) this.handlers.toArray(new MessageHandler[this.handlers.size()]);
    }

    public List getHandlers(IPredicate iPredicate) {
        ArrayList arrayList = new ArrayList();
        for (MessageHandler messageHandler : this.handlers) {
            if (iPredicate.apply(messageHandler)) {
                arrayList.add(messageHandler);
            }
        }
        return arrayList;
    }

    public boolean handles(Class cls) {
        return !getHandlers(ForMessage(cls)).isEmpty();
    }

    public Class getListerDefinition() {
        return this.listenerDefinition;
    }
}
