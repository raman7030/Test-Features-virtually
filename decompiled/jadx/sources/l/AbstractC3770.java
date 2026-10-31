package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: renamed from: l.ۘۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9OM */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3770 implements InterfaceC8522 {
    public int memoizedHashCode = 0;

    @Override // l.InterfaceC8522
    public AbstractC5886 toByteString() {
        try {
            int serializedSize = getSerializedSize();
            AbstractC5886 abstractC5886 = AbstractC5886.f18080;
            C3064 c3064 = new C3064(serializedSize);
            writeTo(c3064.m9385());
            return c3064.m9384();
        } catch (IOException e) {
            throw new RuntimeException(m11422("ByteString"), e);
        }
    }

    @Override // l.InterfaceC8522
    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            int i = AbstractC14766.f45086;
            C16883 c16883 = new C16883(bArr, serializedSize);
            writeTo(c16883);
            if (c16883.mo27812() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(m11422("byte array"), e);
        }
    }

    public void writeTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int i = AbstractC14766.f45086;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        C17589 c17589 = new C17589(outputStream, serializedSize);
        writeTo(c17589);
        c17589.m41119();
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int iM35083 = AbstractC14766.m35083(serializedSize) + serializedSize;
        if (iM35083 > 4096) {
            iM35083 = 4096;
        }
        C17589 c17589 = new C17589(outputStream, iM35083);
        c17589.mo35106(serializedSize);
        writeTo(c17589);
        c17589.m41119();
    }

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    public void setMemoizedSerializedSize(int i) {
        throw new UnsupportedOperationException();
    }

    public int getSerializedSize(InterfaceC9374 interfaceC9374) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int iMo24195 = interfaceC9374.mo24195(this);
        setMemoizedSerializedSize(iMo24195);
        return iMo24195;
    }

    public C17715 newUninitializedMessageException() {
        return new C17715();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m11422(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11424(AbstractC5886 abstractC5886) {
        if (!abstractC5886.mo16500()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11423(Iterable iterable, List list) {
        AbstractC2359.m7667(iterable, list);
    }
}
