package p067l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: renamed from: l.ۘۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9OM */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5951 implements InterfaceC10467 {
    public int memoizedHashCode = 0;

    @Override // p067l.InterfaceC10467
    public AbstractC7962 toByteString() {
        try {
            int serializedSize = getSerializedSize();
            AbstractC7962 abstractC7962 = AbstractC7962.f20935;
            C5280 c5280 = new C5280(serializedSize);
            writeTo(c5280.m11427());
            return c5280.m11426();
        } catch (IOException e) {
            throw new RuntimeException(m13358("ByteString"), e);
        }
    }

    @Override // p067l.InterfaceC10467
    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            int i = AbstractC16402.f48200;
            C18414 c18414 = new C18414(bArr, serializedSize);
            writeTo(c18414);
            if (c18414.mo29874() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(m13358("byte array"), e);
        }
    }

    public void writeTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int i = AbstractC16402.f48200;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        C19085 c19085 = new C19085(outputStream, serializedSize);
        writeTo(c19085);
        c19085.m43365();
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int iM37230 = AbstractC16402.m37230(serializedSize) + serializedSize;
        if (iM37230 > 4096) {
            iM37230 = 4096;
        }
        C19085 c19085 = new C19085(outputStream, iM37230);
        c19085.mo37253(serializedSize);
        writeTo(c19085);
        c19085.m43365();
    }

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    public void setMemoizedSerializedSize(int i) {
        throw new UnsupportedOperationException();
    }

    public int getSerializedSize(InterfaceC11277 interfaceC11277) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int iMo26205 = interfaceC11277.mo26205(this);
        setMemoizedSerializedSize(iMo26205);
        return iMo26205;
    }

    public C19204 newUninitializedMessageException() {
        return new C19204();
    }

    /* JADX INFO: renamed from: ֫ */
    private String m13358(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13360(AbstractC7962 abstractC7962) {
        if (!abstractC7962.mo18426()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13359(Iterable iterable, List list) {
        AbstractC4610.m9738(iterable, list);
    }
}
