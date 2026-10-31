package l;

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
public final class C23852 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f77172 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Logger f77173 = Logger.getLogger(C23852.class.getName());

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC6171 m52567(InterfaceC1274 interfaceC1274) {
        return new C4097(interfaceC1274);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC10405 m52568(InterfaceC5508 interfaceC5508) {
        return new C16090(interfaceC5508);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC5508 m52566(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getOutputStream() == null) {
            throw new IOException("socket's output stream == null");
        }
        C14679 c14679 = new C14679(socket);
        OutputStream outputStream = socket.getOutputStream();
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        return new C21694(c14679, new C16796(c14679, outputStream));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC1274 m52563(InputStream inputStream) {
        C15384 c15384 = new C15384();
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        return new C18208(c15384, inputStream);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC5508 m52570(File file) {
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return new C16796(new C15384(), new FileOutputStream(file));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC5508 m52565(File file) {
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return new C16796(new C15384(), new FileOutputStream(file, true));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC5508 m52564() {
        return new C17502();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC1274 m52569(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        C14679 c14679 = new C14679(socket);
        InputStream inputStream = socket.getInputStream();
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        return new C22399(c14679, new C18208(c14679, inputStream));
    }
}
