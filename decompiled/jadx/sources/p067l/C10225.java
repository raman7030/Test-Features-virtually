package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/* JADX INFO: renamed from: l.۠ܺ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 196G */
/* JADX INFO: loaded from: classes3.dex */
public final class C10225 extends Socket {

    /* JADX INFO: renamed from: ᩸ */
    public final Socket f28338;

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f28338.close();
    }

    @Override // java.net.Socket
    public final synchronized int getReceiveBufferSize() {
        return this.f28338.getReceiveBufferSize();
    }

    @Override // java.net.Socket
    public final synchronized int getSendBufferSize() {
        return this.f28338.getSendBufferSize();
    }

    @Override // java.net.Socket
    public final synchronized int getSoTimeout() {
        return this.f28338.getSoTimeout();
    }

    @Override // java.net.Socket
    public final synchronized void setReceiveBufferSize(int i) {
        this.f28338.setReceiveBufferSize(i);
    }

    @Override // java.net.Socket
    public final synchronized void setSendBufferSize(int i) {
        this.f28338.setSendBufferSize(i);
    }

    @Override // java.net.Socket
    public final synchronized void setSoTimeout(int i) {
        this.f28338.setSoTimeout(i);
    }

    public C10225(Socket socket) {
        C12826.requireNonNull(socket, "delegate");
        this.f28338 = socket;
    }

    @Override // java.net.Socket
    public final InputStream getInputStream() {
        return new InflaterInputStream(this.f28338.getInputStream());
    }

    @Override // java.net.Socket
    public final OutputStream getOutputStream() {
        return new DeflaterOutputStream(this.f28338.getOutputStream());
    }

    @Override // java.net.Socket
    public final void bind(SocketAddress socketAddress) throws IOException {
        this.f28338.bind(socketAddress);
    }

    @Override // java.net.Socket
    public final void connect(SocketAddress socketAddress) throws IOException {
        this.f28338.connect(socketAddress);
    }

    @Override // java.net.Socket
    public final void connect(SocketAddress socketAddress, int i) throws IOException {
        this.f28338.connect(socketAddress, i);
    }

    @Override // java.net.Socket
    public final SocketChannel getChannel() {
        return this.f28338.getChannel();
    }

    @Override // java.net.Socket
    public final InetAddress getInetAddress() {
        return this.f28338.getInetAddress();
    }

    @Override // java.net.Socket
    public final boolean getKeepAlive() {
        return this.f28338.getKeepAlive();
    }

    @Override // java.net.Socket
    public final InetAddress getLocalAddress() {
        return this.f28338.getLocalAddress();
    }

    @Override // java.net.Socket
    public final int getLocalPort() {
        return this.f28338.getLocalPort();
    }

    @Override // java.net.Socket
    public final SocketAddress getLocalSocketAddress() {
        return this.f28338.getLocalSocketAddress();
    }

    @Override // java.net.Socket
    public final boolean getOOBInline() {
        return this.f28338.getOOBInline();
    }

    @Override // java.net.Socket
    public final int getPort() {
        return this.f28338.getPort();
    }

    @Override // java.net.Socket
    public final SocketAddress getRemoteSocketAddress() {
        return this.f28338.getRemoteSocketAddress();
    }

    @Override // java.net.Socket
    public final boolean getReuseAddress() {
        return this.f28338.getReuseAddress();
    }

    @Override // java.net.Socket
    public final int getSoLinger() {
        return this.f28338.getSoLinger();
    }

    @Override // java.net.Socket
    public final boolean getTcpNoDelay() {
        return this.f28338.getTcpNoDelay();
    }

    @Override // java.net.Socket
    public final int getTrafficClass() {
        return this.f28338.getTrafficClass();
    }

    @Override // java.net.Socket
    public final boolean isBound() {
        return this.f28338.isBound();
    }

    @Override // java.net.Socket
    public final boolean isClosed() {
        return this.f28338.isClosed();
    }

    @Override // java.net.Socket
    public final boolean isConnected() {
        return this.f28338.isConnected();
    }

    @Override // java.net.Socket
    public final boolean isInputShutdown() {
        return this.f28338.isInputShutdown();
    }

    @Override // java.net.Socket
    public final boolean isOutputShutdown() {
        return this.f28338.isOutputShutdown();
    }

    @Override // java.net.Socket
    public final void sendUrgentData(int i) throws IOException {
        this.f28338.sendUrgentData(i);
    }

    @Override // java.net.Socket
    public final void setKeepAlive(boolean z) throws SocketException {
        this.f28338.setKeepAlive(z);
    }

    @Override // java.net.Socket
    public final void setOOBInline(boolean z) throws SocketException {
        this.f28338.setOOBInline(z);
    }

    @Override // java.net.Socket
    public final void setPerformancePreferences(int i, int i2, int i3) {
        this.f28338.setPerformancePreferences(i, i2, i3);
    }

    @Override // java.net.Socket
    public final void setReuseAddress(boolean z) throws SocketException {
        this.f28338.setReuseAddress(z);
    }

    @Override // java.net.Socket
    public final void setSoLinger(boolean z, int i) throws SocketException {
        this.f28338.setSoLinger(z, i);
    }

    @Override // java.net.Socket
    public final void setTcpNoDelay(boolean z) throws SocketException {
        this.f28338.setTcpNoDelay(z);
    }

    @Override // java.net.Socket
    public final void setTrafficClass(int i) throws SocketException {
        this.f28338.setTrafficClass(i);
    }

    @Override // java.net.Socket
    public final void shutdownInput() throws IOException {
        this.f28338.shutdownInput();
    }

    @Override // java.net.Socket
    public final void shutdownOutput() throws IOException {
        this.f28338.shutdownOutput();
    }

    @Override // java.net.Socket
    public final String toString() {
        return this.f28338.toString();
    }
}
