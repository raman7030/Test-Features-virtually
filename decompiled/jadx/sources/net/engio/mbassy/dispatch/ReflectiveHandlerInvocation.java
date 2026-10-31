package net.engio.mbassy.dispatch;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.engio.mbassy.bus.MessagePublication;
import net.engio.mbassy.bus.error.PublicationError;
import net.engio.mbassy.subscription.SubscriptionContext;

/* JADX INFO: loaded from: classes2.dex */
public class ReflectiveHandlerInvocation extends HandlerInvocation {
    public ReflectiveHandlerInvocation(SubscriptionContext subscriptionContext) {
        super(subscriptionContext);
    }

    @Override // net.engio.mbassy.dispatch.IHandlerInvocation
    public void invoke(Object obj, Object obj2, MessagePublication messagePublication) {
        Method method = getContext().getHandler().getMethod();
        try {
            method.invoke(obj, obj2);
        } catch (IllegalAccessException e) {
            handlePublicationError(messagePublication, new PublicationError(e, "Error during invocation of message handler. The class or method is not accessible", method, obj, messagePublication));
        } catch (IllegalArgumentException e2) {
            handlePublicationError(messagePublication, new PublicationError(e2, "Error during invocation of message handler. Wrong arguments passed to method. Was: " + obj2.getClass() + "Expected: " + method.getParameterTypes()[0], method, obj, messagePublication));
        } catch (InvocationTargetException e3) {
            handlePublicationError(messagePublication, new PublicationError(e3, "Error during invocation of message handler. There might be an access rights problem. Do you use non public inner classes?", method, obj, messagePublication));
        } catch (Throwable th) {
            handlePublicationError(messagePublication, new PublicationError(th, "Error during invocation of message handler. The handler code threw an exception", method, obj, messagePublication));
        }
    }
}
