package net.engio.mbassy.bus.error;

import java.lang.reflect.Method;
import l.C3200;
import net.engio.mbassy.bus.IMessagePublication;
import net.engio.mbassy.subscription.SubscriptionContext;

/* JADX INFO: loaded from: classes.dex */
public class PublicationError {
    public Throwable cause;
    public String errorMsg;
    public Method handler;
    public Object listener;
    public Object message;
    public IMessagePublication publication;

    public PublicationError(Throwable th, String str, Method method, Object obj, IMessagePublication iMessagePublication) {
        this.cause = th;
        this.errorMsg = str;
        this.handler = method;
        this.listener = obj;
        this.publication = iMessagePublication;
        this.message = iMessagePublication != null ? iMessagePublication.getMessage() : null;
    }

    public PublicationError(Throwable th, String str, IMessagePublication iMessagePublication) {
        this.cause = th;
        this.errorMsg = str;
    }

    public PublicationError(Throwable th, String str, SubscriptionContext subscriptionContext) {
        this.cause = th;
        this.errorMsg = str;
        this.handler = subscriptionContext.getHandler().getMethod();
    }

    public PublicationError(Throwable th, String str) {
        this.cause = th;
        this.errorMsg = str;
    }

    public PublicationError() {
    }

    public Throwable getCause() {
        return this.cause;
    }

    public PublicationError setCause(Throwable th) {
        this.cause = th;
        return this;
    }

    public String getMessage() {
        return this.errorMsg;
    }

    public PublicationError setMessage(String str) {
        this.errorMsg = str;
        return this;
    }

    public PublicationError setPublishedMessage(Object obj) {
        this.message = obj;
        return this;
    }

    public Method getHandler() {
        return this.handler;
    }

    public PublicationError setHandler(Method method) {
        this.handler = method;
        return this;
    }

    public Object getListener() {
        return this.listener;
    }

    public PublicationError setListener(Object obj) {
        this.listener = obj;
        return this;
    }

    public Object getPublishedMessage() {
        return this.message;
    }

    public PublicationError setPublication(IMessagePublication iMessagePublication) {
        this.publication = iMessagePublication;
        return this;
    }

    public String toString() {
        String property = System.getProperty("line.separator");
        StringBuilder sbM9834 = C3200.m9834("PublicationError{", property, "\tcause=");
        sbM9834.append(this.cause);
        sbM9834.append(property);
        sbM9834.append("\tmessage='");
        sbM9834.append(this.errorMsg);
        sbM9834.append('\'');
        sbM9834.append(property);
        sbM9834.append("\thandler=");
        sbM9834.append(this.handler);
        sbM9834.append(property);
        sbM9834.append("\tlistener=");
        sbM9834.append(this.listener);
        sbM9834.append(property);
        sbM9834.append("\tpublishedMessage=");
        sbM9834.append(getPublishedMessage());
        sbM9834.append('}');
        return sbM9834.toString();
    }
}
