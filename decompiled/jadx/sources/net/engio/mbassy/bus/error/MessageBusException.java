package net.engio.mbassy.bus.error;

/* JADX INFO: loaded from: classes.dex */
public class MessageBusException extends Exception {
    public MessageBusException(String str) {
        super(str);
    }

    public MessageBusException(String str, Throwable th) {
        super(str, th);
    }

    public MessageBusException(Throwable th) {
        super(th);
    }
}
