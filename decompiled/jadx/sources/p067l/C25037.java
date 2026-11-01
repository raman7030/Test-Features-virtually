package p067l;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.᩻ᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J4DP */
/* JADX INFO: loaded from: classes.dex */
public final class C25037 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f79922 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final Logger f79923 = Logger.getLogger(C25037.class.getName());

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC8233 m54976(InterfaceC3579 interfaceC3579) {
        return new C6262(interfaceC3579);
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC12257 m54977(InterfaceC7603 interfaceC7603) {
        return new C17660(interfaceC7603);
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC7603 m54975(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getOutputStream() == null) {
            throw new IOException("socket's output stream == null");
        }
        C16319 c16319 = new C16319(socket);
        OutputStream outputStream = socket.getOutputStream();
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        return new C22986(c16319, new C18331(c16319, outputStream));
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC3579 m54972(InputStream inputStream) {
        C16989 c16989 = new C16989();
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        return new C19673(c16989, inputStream);
    }

    /* JADX INFO: renamed from: ۧ */
    public static InterfaceC7603 m54979(File file) {
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return new C18331(new C16989(), new FileOutputStream(file));
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC7603 m54974(File file) {
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return new C18331(new C16989(), new FileOutputStream(file, true));
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC7603 m54973() {
        return new C19002();
    }

    /* JADX INFO: renamed from: ۧ */
    public static InterfaceC3579 m54978(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        C16319 c16319 = new C16319(socket);
        InputStream inputStream = socket.getInputStream();
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        return new C23656(c16319, new C19673(c16319, inputStream));
    }
}
