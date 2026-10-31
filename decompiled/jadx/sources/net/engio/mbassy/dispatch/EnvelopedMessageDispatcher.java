package net.engio.mbassy.dispatch;

import net.engio.mbassy.bus.MessagePublication;
import net.engio.mbassy.subscription.MessageEnvelope;

/* JADX INFO: loaded from: classes2.dex */
public class EnvelopedMessageDispatcher extends DelegatingMessageDispatcher {
    public EnvelopedMessageDispatcher(IMessageDispatcher iMessageDispatcher) {
        super(iMessageDispatcher);
    }

    @Override // net.engio.mbassy.dispatch.IMessageDispatcher
    public void dispatch(MessagePublication messagePublication, Object obj, Iterable iterable) {
        getDelegate().dispatch(messagePublication, new MessageEnvelope(obj), iterable);
    }
}
