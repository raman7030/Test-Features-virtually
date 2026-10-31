package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
public class SessionManager {
    public ThreadLocal local = new ThreadLocal();

    public Session open() {
        return open(true);
    }

    public Session open(boolean z) {
        Reference reference = (Reference) this.local.get();
        if (reference != null) {
            return reference.get();
        }
        return create(z);
    }

    private Session create(boolean z) {
        Reference reference = new Reference(z);
        this.local.set(reference);
        return reference.get();
    }

    public void close() throws PersistenceException {
        Reference reference = (Reference) this.local.get();
        if (reference == null) {
            throw new PersistenceException("Session does not exist", new Object[0]);
        }
        if (reference.clear() == 0) {
            this.local.remove();
        }
    }

    public class Reference {
        public int count;
        public Session session;

        public Reference(boolean z) {
            this.session = new Session(z);
        }

        public Session get() {
            int i = this.count;
            if (i >= 0) {
                this.count = i + 1;
            }
            return this.session;
        }

        public int clear() {
            int i = this.count - 1;
            this.count = i;
            return i;
        }
    }
}
