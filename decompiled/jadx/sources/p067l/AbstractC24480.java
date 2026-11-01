package p067l;

import android.net.LocalServerSocket;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.᩺᩸ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: F99O */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24480 implements InterfaceC2982 {

    /* JADX INFO: renamed from: ֫ */
    public static volatile boolean f77480;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo37993(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo37994(String str, boolean z);

    /* JADX INFO: renamed from: ᩳ */
    public abstract boolean mo37995();

    /* JADX INFO: renamed from: ֫ */
    public static void m53977(LocalServerSocket localServerSocket) {
        if (localServerSocket == null) {
            return;
        }
        try {
            localServerSocket.close();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C21089 m53979(final boolean z) {
        Thread thread;
        boolean z2;
        final ServerSocket serverSocket;
        final C13752 c13752 = new C13752();
        LocalServerSocket localServerSocket = null;
        if (z || (!f77480 && mo37995())) {
            final LocalServerSocket localServerSocket2 = new LocalServerSocket(C15052.m34420());
            thread = new Thread(new Runnable() { // from class: l.۫᩸ܿ
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC24480.m53978(localServerSocket2, c13752, z);
                }
            });
            thread.start();
            try {
                mo37994(localServerSocket2.getLocalSocketAddress().getName(), z);
                z2 = true;
                serverSocket = null;
                localServerSocket = localServerSocket2;
            } catch (IOException e) {
                c13752.m31301();
                m53977(localServerSocket2);
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
                    C13752 c13753 = c13752;
                    try {
                        try {
                            try {
                                try {
                                    C15092 c15092 = new C15092(serverSocket2.accept());
                                    synchronized (c13753) {
                                        if (c13753.f38856) {
                                            z3 = false;
                                        } else {
                                            c13753.f38855 = c15092;
                                            z3 = true;
                                        }
                                    }
                                    if (!z3) {
                                        C2700.m4192(c15092);
                                        C2700.m4192(serverSocket2);
                                        return;
                                    }
                                    int i = C23770.f75593;
                                    try {
                                        c13753.m31305(new C21089(c15092, false));
                                        C2700.m4192(serverSocket2);
                                    } catch (IOException e2) {
                                        C2700.m4192(c15092);
                                        throw e2;
                                    } catch (Error e3) {
                                        e = e3;
                                        C2700.m4192(c15092);
                                        throw e;
                                    } catch (RuntimeException e4) {
                                        e = e4;
                                        C2700.m4192(c15092);
                                        throw e;
                                    }
                                } catch (RuntimeException e5) {
                                    c13753.m31304(e5);
                                    C2700.m4192(serverSocket2);
                                }
                            } catch (IOException e6) {
                                c13753.m31302(e6);
                                C2700.m4192(serverSocket2);
                            }
                        } catch (Error e7) {
                            c13753.m31303(e7);
                            C2700.m4192(serverSocket2);
                        }
                    } catch (Throwable th) {
                        C2700.m4192(serverSocket2);
                        throw th;
                    }
                }
            });
            thread.start();
            if (C12799.m29346()) {
                try {
                    C4081.f8987.submit(new Callable() { // from class: l.ۛ᩸ܿ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            AbstractC24480 abstractC24480 = this.f22499;
                            abstractC24480.getClass();
                            abstractC24480.mo37993(serverSocket.getLocalPort());
                            return null;
                        }
                    }).get();
                } catch (Throwable th) {
                    c13752.m31301();
                    C2700.m4192(serverSocket);
                    thread.interrupt();
                    try {
                        thread.join(100L);
                    } catch (InterruptedException unused2) {
                    }
                    C23770.m52824(th);
                    throw null;
                }
            } else {
                try {
                    mo37993(serverSocket.getLocalPort());
                } catch (IOException e2) {
                    c13752.m31301();
                    C2700.m4192(serverSocket);
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
        if (c13752.f38858 != null) {
            return c13752.f38858;
        }
        if (c13752.f38860 != null) {
            throw c13752.f38860;
        }
        if (c13752.f38859 != null) {
            throw c13752.f38859;
        }
        if (c13752.f38857 != null) {
            throw c13752.f38857;
        }
        c13752.m31301();
        if (z || !mo4997() || !z2) {
            m53977(localServerSocket);
            C2700.m4192(serverSocket);
            thread.interrupt();
            try {
                thread.join(100L);
            } catch (InterruptedException unused5) {
            }
            throw new IOException("Accept timeout");
        }
        if (!f77480) {
            f77480 = true;
        }
        m53977(localServerSocket);
        thread.interrupt();
        try {
            thread.join(100L);
        } catch (InterruptedException unused6) {
        }
        C21306.m48187("switch the root connection to ServerSocket");
        return m53979(false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53978(LocalServerSocket localServerSocket, C13752 c13752, boolean z) {
        boolean z2;
        try {
            try {
                C15052 c15052 = new C15052(localServerSocket.accept());
                synchronized (c13752) {
                    if (c13752.f38856) {
                        z2 = false;
                    } else {
                        c13752.f38855 = c15052;
                        z2 = true;
                    }
                }
                if (!z2) {
                    C2700.m4192(c15052);
                    m53977(localServerSocket);
                    return;
                }
                int i = C23770.f75593;
                try {
                    c13752.m31305(new C21089(c15052, z));
                    m53977(localServerSocket);
                } catch (IOException e) {
                    C2700.m4192(c15052);
                    throw e;
                } catch (Error e2) {
                    e = e2;
                    C2700.m4192(c15052);
                    throw e;
                } catch (RuntimeException e3) {
                    e = e3;
                    C2700.m4192(c15052);
                    throw e;
                }
            } catch (IOException e4) {
                c13752.m31302(e4);
                m53977(localServerSocket);
            } catch (Error e5) {
                c13752.m31303(e5);
                m53977(localServerSocket);
            } catch (RuntimeException e6) {
                c13752.m31304(e6);
                m53977(localServerSocket);
            }
        } catch (Throwable th) {
            m53977(localServerSocket);
            throw th;
        }
    }
}
