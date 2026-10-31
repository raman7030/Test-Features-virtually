package net.engio.mbassy.bus;

import net.engio.mbassy.bus.error.PublicationError;

/* JADX INFO: loaded from: classes.dex */
public interface IMessagePublication {
    void execute();

    PublicationError getError();

    Object getMessage();

    boolean hasError();

    boolean isDeadMessage();

    boolean isFilteredMessage();

    boolean isFinished();

    boolean isRunning();

    boolean isScheduled();
}
