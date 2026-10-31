package l;

import android.net.LocalServerSocket;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.᩺᩸ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: F99O */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23265 implements InterfaceC0645 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static volatile boolean f74737;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo35835(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo35836(String str, boolean z);

    /* JADX INFO: renamed from: ᩳ */
    public abstract boolean mo35837();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51581(LocalServerSocket localServerSocket) {
        if (localServerSocket == null) {
            return;
        }
        try {
            localServerSocket.close();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19697 m51583(final boolean z) {
        Thread thread;
        boolean z2;
        final ServerSocket serverSocket;
        final C11977 c11977 = new C11977();
        LocalServerSocket localServerSocket = null;
        if (z || (!f74737 && mo35837())) {
            final LocalServerSocket localServerSocket2 = new LocalServerSocket(C13345.m32319());
            thread = new Thread(new Runnable() { // from class: l.۫᩸ܿ
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC23265.m51582(localServerSocket2, c11977, z);
                }
            });
            thread.start();
            try {
                mo35836(localServerSocket2.getLocalSocketAddress().getName(), z);
                z2 = true;
                serverSocket = null;
                localServerSocket = localServerSocket2;
            } catch (IOException e) {
                c11977.m29247();
                m51581(localServerSocket2);
                thread.interrupt();
                try {
                    thread.join(100L);
                } catch (InterruptedException unused) {
                }
                throw e;
            }
        } else {
            serverSocket = new ServerSocket(0);
            serverSocket.setSoTimeout(600);
            thread = new Thread(new Runnable() { // from class: l.ۤ᩸ܿ
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z3;
                    ServerSocket serverSocket2 = serverSocket;
                    C11977 c11978 = c11977;
                    try {
                        try {
                            try {
                                try {
                                    C13387 c13387 = new C13387(serverSocket2.accept());
                                    synchronized (c11978) {
                                        if (c11978.f35846) {
                                            z3 = false;
                                        } else {
                                            c11978.f35845 = c13387;
                                            z3 = true;
                                        }
                                    }
                                    if (!z3) {
                                        C0349.m1793(c13387);
                                        C0349.m1793(serverSocket2);
                                        return;
                                    }
                                    int i = C22518.f72867;
                                    try {
                                        c11978.m29251(new C19697(c13387, false));
                                        C0349.m1793(serverSocket2);
                                    } catch (IOException e2) {
                                        C0349.m1793(c13387);
                                        throw e2;
                                    } catch (Error e3) {
                                        e = e3;
                                        C0349.m1793(c13387);
                                        throw e;
                                    } catch (RuntimeException e4) {
                                        e = e4;
                                        C0349.m1793(c13387);
                                        throw e;
                                    }
                                } catch (RuntimeException e5) {
                                    c11978.m29250(e5);
                                    C0349.m1793(serverSocket2);
                                }
                            } catch (IOException e6) {
                                c11978.m29248(e6);
                                C0349.m1793(serverSocket2);
                            }
                        } catch (Error e7) {
                            c11978.m29249(e7);
                            C0349.m1793(serverSocket2);
                        }
                    } catch (Throwable th) {
                        C0349.m1793(serverSocket2);
                        throw th;
                    }
                }
            });
            thread.start();
            if (C10975.m27284()) {
                try {
                    C1802.f6208.submit(new Callable() { // from class: l.ۛ᩸ܿ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            AbstractC23265 abstractC23265 = this.f19628;
                            abstractC23265.getClass();
                            abstractC23265.mo35835(serverSocket.getLocalPort());
                            return null;
                        }
                    }).get();
                } catch (Throwable th) {
                    c11977.m29247();
                    C0349.m1793(serverSocket);
                    thread.interrupt();
                    try {
                        thread.join(100L);
                    } catch (InterruptedException unused2) {
                    }
                    C22518.m50482(th);
                    throw null;
                }
            } else {
                try {
                    mo35835(serverSocket.getLocalPort());
                } catch (IOException e2) {
                    c11977.m29247();
                    C0349.m1793(serverSocket);
                    thread.interrupt();
                    try {
                        thread.join(100L);
                    } catch (InterruptedException unused3) {
                    }
                    throw e2;
                }
            }
            z2 = false;
        }
        try {
            thread.join(600L);
        } catch (InterruptedException unused4) {
        }
        if (c11977.f35848 != null) {
            return c11977.f35848;
        }
        if (c11977.f35850 != null) {
            throw c11977.f35850;
        }
        if (c11977.f35849 != null) {
            throw c11977.f35849;
        }
        if (c11977.f35847 != null) {
            throw c11977.f35847;
        }
        c11977.m29247();
        if (z || !mo2657() || !z2) {
            m51581(localServerSocket);
            C0349.m1793(serverSocket);
            thread.interrupt();
            try {
                thread.join(100L);
            } catch (InterruptedException unused5) {
            }
            throw new IOException("Accept timeout");
        }
        if (!f74737) {
            f74737 = true;
        }
        m51581(localServerSocket);
        thread.interrupt();
        try {
            thread.join(100L);
        } catch (InterruptedException unused6) {
        }
        C19926.m45874("switch the root connection to ServerSocket");
        return m51583(false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51582(LocalServerSocket localServerSocket, C11977 c11977, boolean z) {
        boolean z2;
        try {
            try {
                C13345 c13345 = new C13345(localServerSocket.accept());
                synchronized (c11977) {
                    if (c11977.f35846) {
                        z2 = false;
                    } else {
                        c11977.f35845 = c13345;
                        z2 = true;
                    }
                }
                if (!z2) {
                    C0349.m1793(c13345);
                    m51581(localServerSocket);
                    return;
                }
                int i = C22518.f72867;
                try {
                    c11977.m29251(new C19697(c13345, z));
                    m51581(localServerSocket);
                } catch (IOException e) {
                    C0349.m1793(c13345);
                    throw e;
                } catch (Error e2) {
                    e = e2;
                    C0349.m1793(c13345);
                    throw e;
                } catch (RuntimeException e3) {
                    e = e3;
                    C0349.m1793(c13345);
                    throw e;
                }
            } catch (IOException e4) {
                c11977.m29248(e4);
                m51581(localServerSocket);
            } catch (Error e5) {
                c11977.m29249(e5);
                m51581(localServerSocket);
            } catch (RuntimeException e6) {
                c11977.m29250(e6);
                m51581(localServerSocket);
            }
        } catch (Throwable th) {
            m51581(localServerSocket);
            throw th;
        }
    }
}
