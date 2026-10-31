package net.engio.mbassy.bus.common;

/* JADX INFO: loaded from: classes.dex */
public abstract class PublicationEvent {
    public Object relatedMessage;

    public PublicationEvent(Object obj) {
        this.relatedMessage = obj;
    }

    public Object getMessage() {
        return this.relatedMessage;
    }
}
