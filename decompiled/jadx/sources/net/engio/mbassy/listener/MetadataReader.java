package net.engio.mbassy.listener;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import net.engio.mbassy.common.IPredicate;
import net.engio.mbassy.common.ReflectionUtils;
import net.engio.mbassy.subscription.MessageEnvelope;

/* JADX INFO: loaded from: classes.dex */
public class MetadataReader {
    public static final IPredicate AllMessageHandlers = new IPredicate() { // from class: net.engio.mbassy.listener.MetadataReader.1
        @Override // net.engio.mbassy.common.IPredicate
        public boolean apply(Method method) {
            return ReflectionUtils.getAnnotation(method, Handler.class) != null;
        }
    };
    public final Map filterCache = new HashMap();

    private IMessageFilter[] getFilter(Handler handler) {
        if (handler.filters().length == 0) {
            return null;
        }
        IMessageFilter[] iMessageFilterArr = new IMessageFilter[handler.filters().length];
        int i = 0;
        for (Filter filter : handler.filters()) {
            IMessageFilter iMessageFilter = (IMessageFilter) this.filterCache.get(filter.value());
            if (iMessageFilter == null) {
                try {
                    iMessageFilter = (IMessageFilter) filter.value().newInstance();
                    this.filterCache.put(filter.value(), iMessageFilter);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            iMessageFilterArr[i] = iMessageFilter;
            i++;
        }
        return iMessageFilterArr;
    }

    public MessageListener getMessageListener(Class cls) {
        MessageListener messageListener = new MessageListener(cls);
        Method[] methods = ReflectionUtils.getMethods(AllMessageHandlers, cls);
        for (Method method : methods) {
            if (!ReflectionUtils.containsOverridingMethod(methods, method)) {
                Handler handler = (Handler) ReflectionUtils.getAnnotation(method, Handler.class);
                if (handler.enabled() && isValidMessageHandler(method)) {
                    Method overridingMethod = ReflectionUtils.getOverridingMethod(method, cls);
                    if (overridingMethod != null) {
                        method = overridingMethod;
                    }
                    messageListener.addHandler(new MessageHandler(MessageHandler.Properties.Create(method, handler, getFilter(handler), messageListener)));
                }
            }
        }
        return messageListener;
    }

    private boolean isValidMessageHandler(Method method) {
        if (method == null || ReflectionUtils.getAnnotation(method, Handler.class) == null) {
            return false;
        }
        if (method.getParameterTypes().length != 1) {
            System.out.println("Found no or more than one parameter in messageHandler [" + method.getName() + "]. A messageHandler must define exactly one parameter");
            return false;
        }
        Enveloped enveloped = (Enveloped) ReflectionUtils.getAnnotation(method, Enveloped.class);
        if (enveloped != null && !MessageEnvelope.class.isAssignableFrom(method.getParameterTypes()[0])) {
            System.out.println("Message envelope configured but no subclass of MessageEnvelope found as parameter");
            return false;
        }
        if (enveloped == null || enveloped.messages().length != 0) {
            return true;
        }
        System.out.println("Message envelope configured but message types defined for handler");
        return false;
    }
}
