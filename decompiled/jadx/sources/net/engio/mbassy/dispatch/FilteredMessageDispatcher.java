package net.engio.mbassy.dispatch;

import net.engio.mbassy.bus.MessagePublication;
import net.engio.mbassy.listener.IMessageFilter;

/* JADX INFO: loaded from: classes2.dex */
public final class FilteredMessageDispatcher extends DelegatingMessageDispatcher {
    public final IMessageFilter[] filter;

    public FilteredMessageDispatcher(IMessageDispatcher iMessageDispatcher) {
        super(iMessageDispatcher);
        this.filter = iMessageDispatcher.getContext().getHandler().getFilter();
    }

    private boolean passesFilter(Object obj) {
        IMessageFilter[] iMessageFilterArr = this.filter;
        if (iMessageFilterArr == null) {
            return true;
        }
        for (IMessageFilter iMessageFilter : iMessageFilterArr) {
            if (!iMessageFilter.accepts(obj, getContext())) {
                return false;
            }
        }
        return true;
    }

    @Override // net.engio.mbassy.dispatch.IMessageDispatcher
    public void dispatch(MessagePublication messagePublication, Object obj, Iterable iterable) {
        if (passesFilter(obj)) {
            getDelegate().dispatch(messagePublication, obj, iterable);
        }
    }
}
