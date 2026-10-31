package net.engio.mbassy.listener;

import com.alipay.sdk.m.y.l;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import l.C4860;
import net.engio.mbassy.common.ReflectionUtils;
import net.engio.mbassy.dispatch.el.ElFilter;

/* JADX INFO: loaded from: classes.dex */
public class MessageHandler {
    public final boolean acceptsSubtypes;
    public final String condition;
    public final IMessageFilter[] filter;
    public final Class[] handledMessages;
    public final Method handler;
    public final Class invocation;
    public final Invoke invocationMode;
    public final boolean isEnvelope;
    public final boolean isSynchronized;
    public final MessageListener listenerConfig;
    public final int priority;

    public final class Properties {
        public static final String AcceptSubtypes = "subtypes";
        public static final String Condition = "condition";
        public static final String Enveloped = "envelope";
        public static final String Filter = "filter";
        public static final String HandledMessages = "messages";
        public static final String HandlerMethod = "handler";
        public static final String Invocation = "invocation";
        public static final String InvocationMode = "invocationMode";
        public static final String IsSynchronized = "synchronized";
        public static final String Listener = "listener";
        public static final String Priority = "priority";

        public static final Map Create(Method method, Handler handler, IMessageFilter[] iMessageFilterArr, MessageListener messageListener) {
            Class[] parameterTypes;
            if (method == null) {
                throw new IllegalArgumentException("The message handler configuration may not be null");
            }
            if (iMessageFilterArr == null) {
                iMessageFilterArr = new IMessageFilter[0];
            }
            Enveloped enveloped = (Enveloped) ReflectionUtils.getAnnotation(method, Enveloped.class);
            if (enveloped != null) {
                parameterTypes = enveloped.messages();
            } else {
                parameterTypes = method.getParameterTypes();
            }
            method.setAccessible(true);
            HashMap map = new HashMap();
            map.put(HandlerMethod, method);
            if (handler.condition().length() > 0) {
                if (!ElFilter.isELAvailable()) {
                    throw new IllegalStateException("A handler uses an EL filter but no EL implementation is available.");
                }
                IMessageFilter[] iMessageFilterArr2 = new IMessageFilter[iMessageFilterArr.length + 1];
                for (int i = 0; i < iMessageFilterArr.length; i++) {
                    iMessageFilterArr2[i] = iMessageFilterArr[i];
                }
                iMessageFilterArr2[iMessageFilterArr.length] = new ElFilter();
                iMessageFilterArr = iMessageFilterArr2;
            }
            map.put(Filter, iMessageFilterArr);
            map.put(Condition, cleanEL(handler.condition()));
            map.put(Priority, Integer.valueOf(handler.priority()));
            map.put(Invocation, handler.invocation());
            map.put(InvocationMode, handler.delivery());
            map.put(Enveloped, Boolean.valueOf(enveloped != null));
            map.put(AcceptSubtypes, Boolean.valueOf(!handler.rejectSubtypes()));
            map.put(Listener, messageListener);
            map.put(IsSynchronized, Boolean.valueOf(ReflectionUtils.getAnnotation(method, Synchronized.class) != null));
            map.put(HandledMessages, parameterTypes);
            return map;
        }

        public static String cleanEL(String str) {
            return (str.trim().startsWith("${") || str.trim().startsWith("#{")) ? str : C4860.m14172("${", str, l.d);
        }
    }

    public MessageHandler(Map map) {
        validate(map);
        this.handler = (Method) map.get(Properties.HandlerMethod);
        this.filter = (IMessageFilter[]) map.get(Properties.Filter);
        this.condition = (String) map.get(Properties.Condition);
        this.priority = ((Integer) map.get(Properties.Priority)).intValue();
        this.invocation = (Class) map.get(Properties.Invocation);
        this.invocationMode = (Invoke) map.get(Properties.InvocationMode);
        this.isEnvelope = ((Boolean) map.get(Properties.Enveloped)).booleanValue();
        this.acceptsSubtypes = ((Boolean) map.get(Properties.AcceptSubtypes)).booleanValue();
        this.listenerConfig = (MessageListener) map.get(Properties.Listener);
        this.isSynchronized = ((Boolean) map.get(Properties.IsSynchronized)).booleanValue();
        this.handledMessages = (Class[]) map.get(Properties.HandledMessages);
    }

    private void validate(Map map) {
        Object[][] objArr = {new Object[]{Properties.HandlerMethod, Method.class}, new Object[]{Properties.Priority, Integer.class}, new Object[]{Properties.Invocation, Class.class}, new Object[]{Properties.Filter, IMessageFilter[].class}, new Object[]{Properties.Condition, String.class}, new Object[]{Properties.Enveloped, Boolean.class}, new Object[]{Properties.HandledMessages, Class[].class}, new Object[]{Properties.IsSynchronized, Boolean.class}, new Object[]{Properties.Listener, MessageListener.class}, new Object[]{Properties.AcceptSubtypes, Boolean.class}};
        for (int i = 0; i < 10; i++) {
            Object[] objArr2 = objArr[i];
            if (map.get(objArr2[0]) == null || !((Class) objArr2[1]).isAssignableFrom(map.get(objArr2[0]).getClass())) {
                throw new IllegalArgumentException("Property " + objArr2[0] + " was expected to be not null and of type " + objArr2[1] + " but was: " + map.get(objArr2[0]));
            }
        }
    }

    public Annotation getAnnotation(Class cls) {
        return ReflectionUtils.getAnnotation(this.handler, cls);
    }

    public boolean isSynchronized() {
        return this.isSynchronized;
    }

    public boolean useStrongReferences() {
        return this.listenerConfig.useStrongReferences();
    }

    public boolean isFromListener(Class cls) {
        return this.listenerConfig.isFromListener(cls);
    }

    public boolean isAsynchronous() {
        return this.invocationMode.equals(Invoke.Asynchronously);
    }

    public boolean isFiltered() {
        if (this.filter.length > 0) {
            return true;
        }
        String str = this.condition;
        return str != null && str.trim().length() > 0;
    }

    public int getPriority() {
        return this.priority;
    }

    public Method getMethod() {
        return this.handler;
    }

    public IMessageFilter[] getFilter() {
        return this.filter;
    }

    public String getCondition() {
        return this.condition;
    }

    public Class[] getHandledMessages() {
        return this.handledMessages;
    }

    public boolean isEnveloped() {
        return this.isEnvelope;
    }

    public Class getHandlerInvocation() {
        return this.invocation;
    }

    public boolean handlesMessage(Class cls) {
        for (Class cls2 : this.handledMessages) {
            if (cls2.equals(cls)) {
                return true;
            }
            if (cls2.isAssignableFrom(cls) && acceptsSubtypes()) {
                return true;
            }
        }
        return false;
    }

    public boolean acceptsSubtypes() {
        return this.acceptsSubtypes;
    }
}
