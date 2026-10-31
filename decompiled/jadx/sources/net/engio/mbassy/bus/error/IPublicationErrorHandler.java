package net.engio.mbassy.bus.error;

/* JADX INFO: loaded from: classes.dex */
public interface IPublicationErrorHandler {
    void handleError(PublicationError publicationError);

    public final class ConsoleLogger implements IPublicationErrorHandler {
        public final boolean printStackTrace;

        public ConsoleLogger() {
            this(false);
        }

        public ConsoleLogger(boolean z) {
            this.printStackTrace = z;
        }

        @Override // net.engio.mbassy.bus.error.IPublicationErrorHandler
        public void handleError(PublicationError publicationError) {
            System.out.println(publicationError);
            if (!this.printStackTrace || publicationError.getCause() == null) {
                return;
            }
            publicationError.getCause().getClass();
        }
    }
}
