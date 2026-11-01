package org.bouncycastle.crypto.engines;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import p067l.C10965;
import p067l.C19768;
import p067l.C20778;
import p067l.C5410;

/* JADX INFO: loaded from: classes.dex */
public abstract class AEADBaseEngine implements AEADCipher {
    public int AADBufferSize;
    public int BlockSize;
    public int IV_SIZE;
    public int KEY_SIZE;
    public int MAC_SIZE;
    public AADOperator aadOperator;
    public String algorithmName;
    public DataOperator dataOperator;
    public boolean forEncryption;
    public byte[] initialAssociatedText;
    public byte[] m_aad;
    public int m_aadPos;
    public byte[] m_buf;
    public int m_bufPos;
    public int m_bufferSizeDecrypt;
    public byte[] mac;
    public AADProcessingBuffer processor;
    public int macSizeLowerBound = 0;
    public State m_state = State.Uninitialized;
    public DecryptionFailureCounter decryptionFailureCounter = null;
    public DataLimitCounter dataLimitCounter = null;

    public interface AADOperator {
        int getLen();

        void processAADByte(byte b);

        void processAADBytes(byte[] bArr, int i, int i2);

        void reset();
    }

    public class AADOperatorType {
        public static final int COUNTER = 1;
        public static final int DATA_LIMIT = 3;
        public static final int DEFAULT = 0;
        public static final int STREAM = 2;
        public final int ord;
        public static final AADOperatorType Default = new AADOperatorType(0);
        public static final AADOperatorType Counter = new AADOperatorType(1);
        public static final AADOperatorType Stream = new AADOperatorType(2);
        public static final AADOperatorType DataLimit = new AADOperatorType(3);

        public AADOperatorType(int i) {
            this.ord = i;
        }
    }

    public interface AADProcessingBuffer {
        int getUpdateOutputSize(int i);

        boolean isLengthExceedingBlockSize(int i, int i2);

        boolean isLengthWithinAvailableSpace(int i, int i2);

        void processAADByte(byte b);

        int processByte(byte b, byte[] bArr, int i);
    }

    public class BufferedAADProcessor implements AADProcessingBuffer {
        public BufferedAADProcessor() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public int getUpdateOutputSize(int i) {
            return Math.max(0, i) - 1;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public boolean isLengthExceedingBlockSize(int i, int i2) {
            return i > i2;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public boolean isLengthWithinAvailableSpace(int i, int i2) {
            return i <= i2;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public void processAADByte(byte b) {
            AEADBaseEngine aEADBaseEngine = AEADBaseEngine.this;
            if (aEADBaseEngine.m_aadPos == aEADBaseEngine.AADBufferSize) {
                aEADBaseEngine.processBufferAAD(aEADBaseEngine.m_aad, 0);
                AEADBaseEngine.this.m_aadPos = 0;
            }
            AEADBaseEngine aEADBaseEngine2 = AEADBaseEngine.this;
            byte[] bArr = aEADBaseEngine2.m_aad;
            int i = aEADBaseEngine2.m_aadPos;
            aEADBaseEngine2.m_aadPos = i + 1;
            bArr[i] = b;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public int processByte(byte b, byte[] bArr, int i) {
            AEADBaseEngine.this.checkData(false);
            int iProcessEncDecByte = AEADBaseEngine.this.processEncDecByte(bArr, i);
            AEADBaseEngine aEADBaseEngine = AEADBaseEngine.this;
            byte[] bArr2 = aEADBaseEngine.m_buf;
            int i2 = aEADBaseEngine.m_bufPos;
            aEADBaseEngine.m_bufPos = i2 + 1;
            bArr2[i2] = b;
            return iProcessEncDecByte;
        }
    }

    public class CounterAADOperator implements AADOperator {
        public int aadLen;

        public CounterAADOperator() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public int getLen() {
            return this.aadLen;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void processAADByte(byte b) {
            this.aadLen++;
            AEADBaseEngine.this.processor.processAADByte(b);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void processAADBytes(byte[] bArr, int i, int i2) {
            this.aadLen += i2;
            AEADBaseEngine.this.processAadBytes(bArr, i, i2);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void reset() {
            this.aadLen = 0;
        }
    }

    public class CounterDataOperator implements DataOperator {
        public int messegeLen;

        public CounterDataOperator() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int getLen() {
            return this.messegeLen;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processByte(byte b, byte[] bArr, int i) {
            this.messegeLen++;
            return AEADBaseEngine.this.processor.processByte(b, bArr, i);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
            this.messegeLen += i2;
            return AEADBaseEngine.this.processEncDecBytes(bArr, i, i2, bArr2, i3);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public void reset() {
            this.messegeLen = 0;
        }
    }

    public class DataLimitAADOperator implements AADOperator {
        public DataLimitAADOperator() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public int getLen() {
            return AEADBaseEngine.this.m_aadPos;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void processAADByte(byte b) {
            AEADBaseEngine.this.dataLimitCounter.increment();
            AEADBaseEngine.this.processor.processAADByte(b);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void processAADBytes(byte[] bArr, int i, int i2) {
            AEADBaseEngine.this.dataLimitCounter.increment(i2);
            AEADBaseEngine.this.processAadBytes(bArr, i, i2);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void reset() {
        }
    }

    public class DataLimitCounter {
        public long count;
        public long max;

        /* JADX INFO: renamed from: n */
        public int f80949n;

        public void increment() {
            long j = this.count + 1;
            this.count = j;
            if (j <= this.max) {
                return;
            }
            throw new IllegalStateException(C5410.m11876(this.f80949n, " bytes per key (including nonce, AAD, and message)", new StringBuilder("Total data limit exceeded: maximum 2^")));
        }

        public void increment(int i) {
            long j = this.count + ((long) i);
            this.count = j;
            if (j > this.max) {
                throw new IllegalStateException(C19768.m44906(i, "Total data limit exceeded: maximum 2^", " bytes per key (including nonce, AAD, and message)"));
            }
        }

        public void init(int i) {
            this.f80949n = i;
            this.max = 1 << i;
        }

        public void reset() {
            this.count = 0L;
        }
    }

    public class DataLimitDataOperator implements DataOperator {
        public DataLimitDataOperator() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int getLen() {
            return AEADBaseEngine.this.m_bufPos;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processByte(byte b, byte[] bArr, int i) {
            AEADBaseEngine.this.dataLimitCounter.increment();
            return AEADBaseEngine.this.processor.processByte(b, bArr, i);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
            AEADBaseEngine.this.dataLimitCounter.increment(i2);
            return AEADBaseEngine.this.processEncDecBytes(bArr, i, i2, bArr2, i3);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public void reset() {
        }
    }

    public interface DataOperator {
        int getLen();

        int processByte(byte b, byte[] bArr, int i);

        int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3);

        void reset();
    }

    public class DataOperatorType {
        public static final int COUNTER = 1;
        public static final int DATA_LIMIT = 4;
        public static final int DEFAULT = 0;
        public static final int STREAM = 2;
        public static final int STREAM_CIPHER = 3;
        public final int ord;
        public static final DataOperatorType Default = new DataOperatorType(0);
        public static final DataOperatorType Counter = new DataOperatorType(1);
        public static final DataOperatorType Stream = new DataOperatorType(2);
        public static final DataOperatorType StreamCipher = new DataOperatorType(3);
        public static final DataOperatorType DataLimit = new DataOperatorType(4);

        public DataOperatorType(int i) {
            this.ord = i;
        }
    }

    public class DecryptionFailureCounter {
        public int[] counter;

        /* JADX INFO: renamed from: n */
        public int f80950n;

        public boolean increment() {
            int i;
            int length = this.counter.length;
            do {
                length--;
                if (length < 0) {
                    break;
                }
                int[] iArr = this.counter;
                i = iArr[length] + 1;
                iArr[length] = i;
            } while (i == 0);
            int i2 = this.f80950n & 31;
            if (length <= 0) {
                if (this.counter[0] == (i2 == 0 ? 0 : 1 << i2)) {
                    return true;
                }
            }
            return false;
        }

        public void init(int i) {
            if (this.f80950n != i) {
                this.f80950n = i;
                int i2 = (i + 31) >>> 5;
                int[] iArr = this.counter;
                if (iArr == null || i2 != iArr.length) {
                    this.counter = new int[i2];
                } else {
                    reset();
                }
            }
        }

        public void reset() {
            Arrays.fill(this.counter, 0);
        }
    }

    public class DefaultAADOperator implements AADOperator {
        public DefaultAADOperator() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public int getLen() {
            return AEADBaseEngine.this.m_aadPos;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void processAADByte(byte b) {
            AEADBaseEngine.this.processor.processAADByte(b);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void processAADBytes(byte[] bArr, int i, int i2) {
            AEADBaseEngine.this.processAadBytes(bArr, i, i2);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void reset() {
        }
    }

    public class DefaultDataOperator implements DataOperator {
        public DefaultDataOperator() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int getLen() {
            return AEADBaseEngine.this.m_bufPos;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processByte(byte b, byte[] bArr, int i) {
            return AEADBaseEngine.this.processor.processByte(b, bArr, i);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
            return AEADBaseEngine.this.processEncDecBytes(bArr, i, i2, bArr2, i3);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public void reset() {
        }
    }

    public final class ErasableOutputStream extends ByteArrayOutputStream {
        public byte[] getBuf() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public class ImmediateAADProcessor implements AADProcessingBuffer {
        public ImmediateAADProcessor() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public int getUpdateOutputSize(int i) {
            return Math.max(0, i);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public boolean isLengthExceedingBlockSize(int i, int i2) {
            return i >= i2;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public boolean isLengthWithinAvailableSpace(int i, int i2) {
            return i < i2;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public void processAADByte(byte b) {
            AEADBaseEngine aEADBaseEngine = AEADBaseEngine.this;
            byte[] bArr = aEADBaseEngine.m_aad;
            int i = aEADBaseEngine.m_aadPos;
            int i2 = i + 1;
            aEADBaseEngine.m_aadPos = i2;
            bArr[i] = b;
            if (i2 == aEADBaseEngine.AADBufferSize) {
                aEADBaseEngine.processBufferAAD(bArr, 0);
                AEADBaseEngine.this.m_aadPos = 0;
            }
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public int processByte(byte b, byte[] bArr, int i) {
            AEADBaseEngine.this.checkData(false);
            AEADBaseEngine aEADBaseEngine = AEADBaseEngine.this;
            byte[] bArr2 = aEADBaseEngine.m_buf;
            int i2 = aEADBaseEngine.m_bufPos;
            aEADBaseEngine.m_bufPos = i2 + 1;
            bArr2[i2] = b;
            return aEADBaseEngine.processEncDecByte(bArr, i);
        }
    }

    public class ProcessingBufferType {
        public static final int BUFFERED = 0;
        public static final int IMMEDIATE = 1;
        public final int ord;
        public static final ProcessingBufferType Buffered = new ProcessingBufferType(0);
        public static final ProcessingBufferType Immediate = new ProcessingBufferType(1);

        public ProcessingBufferType(int i) {
            this.ord = i;
        }
    }

    public class State {
        public static final int DEC_AAD = 6;
        public static final int DEC_DATA = 7;
        public static final int DEC_FINAL = 8;
        public static final int DEC_INIT = 5;
        public static final int ENC_AAD = 2;
        public static final int ENC_DATA = 3;
        public static final int ENC_FINAL = 4;
        public static final int ENC_INIT = 1;
        public static final int UNINITIALIZED = 0;
        public final int ord;
        public static final State Uninitialized = new State(0);
        public static final State EncInit = new State(1);
        public static final State EncAad = new State(2);
        public static final State EncData = new State(3);
        public static final State EncFinal = new State(4);
        public static final State DecInit = new State(5);
        public static final State DecAad = new State(6);
        public static final State DecData = new State(7);
        public static final State DecFinal = new State(8);

        public State(int i) {
            this.ord = i;
        }
    }

    public class StreamAADOperator implements AADOperator {
        public final ErasableOutputStream stream = new ErasableOutputStream();

        public byte[] getBytes() {
            return this.stream.getBuf();
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public int getLen() {
            return this.stream.size();
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void processAADByte(byte b) throws IOException {
            this.stream.write(b);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void processAADBytes(byte[] bArr, int i, int i2) throws IOException {
            this.stream.write(bArr, i, i2);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void reset() {
            this.stream.reset();
        }
    }

    public class StreamCipherOperator implements DataOperator {
        public int len;

        public StreamCipherOperator() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int getLen() {
            return this.len;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processByte(byte b, byte[] bArr, int i) {
            if (AEADBaseEngine.this.checkData(false)) {
                this.len = 1;
                AEADBaseEngine.this.processBufferEncrypt(new byte[]{b}, 0, bArr, i);
                return 1;
            }
            AEADBaseEngine aEADBaseEngine = AEADBaseEngine.this;
            int i2 = aEADBaseEngine.m_bufPos;
            if (i2 != aEADBaseEngine.MAC_SIZE) {
                byte[] bArr2 = aEADBaseEngine.m_buf;
                aEADBaseEngine.m_bufPos = i2 + 1;
                bArr2[i2] = b;
                return 0;
            }
            this.len = 1;
            aEADBaseEngine.processBufferDecrypt(aEADBaseEngine.m_buf, 0, bArr, i);
            AEADBaseEngine aEADBaseEngine2 = AEADBaseEngine.this;
            byte[] bArr3 = aEADBaseEngine2.m_buf;
            System.arraycopy(bArr3, 1, bArr3, 0, aEADBaseEngine2.m_bufPos - 1);
            AEADBaseEngine aEADBaseEngine3 = AEADBaseEngine.this;
            aEADBaseEngine3.m_buf[aEADBaseEngine3.m_bufPos - 1] = b;
            return 1;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
            int i4 = 0;
            if (bArr == bArr2 && Arrays.segmentsOverlap(i, i2, i3, AEADBaseEngine.this.processor.getUpdateOutputSize(i2))) {
                bArr = new byte[i2];
                System.arraycopy(bArr2, i, bArr, 0, i2);
                i = 0;
            }
            if (AEADBaseEngine.this.checkData(false)) {
                this.len = i2;
                AEADBaseEngine.this.processBufferEncrypt(bArr, i, bArr2, i3);
                return i2;
            }
            AEADBaseEngine aEADBaseEngine = AEADBaseEngine.this;
            int iMax = Math.max((aEADBaseEngine.m_bufPos + i2) - aEADBaseEngine.MAC_SIZE, 0);
            int i5 = AEADBaseEngine.this.m_bufPos;
            if (i5 > 0) {
                int iMin = Math.min(iMax, i5);
                this.len = iMin;
                AEADBaseEngine aEADBaseEngine2 = AEADBaseEngine.this;
                aEADBaseEngine2.processBufferDecrypt(aEADBaseEngine2.m_buf, 0, bArr2, i3);
                iMax -= iMin;
                AEADBaseEngine aEADBaseEngine3 = AEADBaseEngine.this;
                int i6 = aEADBaseEngine3.m_bufPos - iMin;
                aEADBaseEngine3.m_bufPos = i6;
                byte[] bArr3 = aEADBaseEngine3.m_buf;
                System.arraycopy(bArr3, iMin, bArr3, 0, i6);
                i4 = iMin;
            }
            if (iMax > 0) {
                this.len = iMax;
                AEADBaseEngine.this.processBufferDecrypt(bArr, i, bArr2, i3);
                i4 += iMax;
                i2 -= iMax;
                i += iMax;
            }
            AEADBaseEngine aEADBaseEngine4 = AEADBaseEngine.this;
            System.arraycopy(bArr, i, aEADBaseEngine4.m_buf, aEADBaseEngine4.m_bufPos, i2);
            AEADBaseEngine.this.m_bufPos += i2;
            return i4;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public void reset() {
        }
    }

    public class StreamDataOperator implements DataOperator {
        public final ErasableOutputStream stream = new ErasableOutputStream();

        public StreamDataOperator() {
        }

        public byte[] getBytes() {
            return this.stream.getBuf();
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int getLen() {
            return this.stream.size();
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processByte(byte b, byte[] bArr, int i) throws IOException {
            AEADBaseEngine.this.checkData(false);
            AEADBaseEngine.this.ensureInitialized();
            this.stream.write(b);
            AEADBaseEngine.this.m_bufPos = this.stream.size();
            return 0;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException {
            AEADBaseEngine.this.checkData(false);
            AEADBaseEngine.this.ensureInitialized();
            this.stream.write(bArr, i, i2);
            AEADBaseEngine.this.m_bufPos = this.stream.size();
            return 0;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public void reset() {
            this.stream.reset();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processAadBytes(byte[] bArr, int i, int i2) {
        int i3 = this.m_aadPos;
        if (i3 > 0) {
            int i4 = this.AADBufferSize - i3;
            if (this.processor.isLengthWithinAvailableSpace(i2, i4)) {
                System.arraycopy(bArr, i, this.m_aad, this.m_aadPos, i2);
                this.m_aadPos += i2;
                return;
            } else {
                System.arraycopy(bArr, i, this.m_aad, this.m_aadPos, i4);
                i += i4;
                i2 -= i4;
                processBufferAAD(this.m_aad, 0);
            }
        }
        while (this.processor.isLengthExceedingBlockSize(i2, this.AADBufferSize)) {
            processBufferAAD(bArr, i);
            int i5 = this.AADBufferSize;
            i += i5;
            i2 -= i5;
        }
        System.arraycopy(bArr, i, this.m_aad, 0, i2);
        this.m_aadPos = i2;
    }

    public final void ensureInitialized() {
        if (this.m_state == State.Uninitialized) {
            throw new IllegalStateException("Need to call init function before operation");
        }
    }

    public final void ensureSufficientInputBuffer(byte[] bArr, int i, int i2) {
        if (i + i2 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
    }

    public final void ensureSufficientOutputBuffer(byte[] bArr, int i, int i2) {
        if (i + i2 > bArr.length) {
            throw new OutputLengthException("output buffer too short");
        }
    }

    public abstract void finishAAD(State state, boolean z);

    public void finishAAD1(State state) {
        int i = this.m_state.ord;
        if (i == 1 || i == 2 || i == 5 || i == 6) {
            processFinalAAD();
        }
        this.m_state = state;
    }

    public void finishAAD2(State state) {
        int i = this.m_state.ord;
        if (i == 2 || i == 6) {
            processFinalAAD();
        }
        this.m_aadPos = 0;
        this.m_state = state;
    }

    public void finishAAD3(State state, boolean z) {
        int i = this.m_state.ord;
        if (i == 1 || i == 2) {
            processFinalAAD();
        } else if (i == 5 || i == 6) {
            if (!z && this.dataOperator.getLen() <= this.MAC_SIZE) {
                return;
            }
            processFinalAAD();
        }
        this.m_aadPos = 0;
        this.m_state = state;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    public final int getBlockSize() {
        return this.BlockSize;
    }

    public int getIVBytesSize() {
        return this.IV_SIZE;
    }

    public int getKeyBytesSize() {
        return this.KEY_SIZE;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return this.mac;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i) {
        int iMax = Math.max(0, i);
        switch (this.m_state.ord) {
            case 3:
            case 4:
                return iMax + this.m_bufPos + this.MAC_SIZE;
            case 5:
            case 6:
            case 7:
            case 8:
                return Math.max(0, (iMax + this.m_bufPos) - this.MAC_SIZE);
            default:
                return iMax + this.MAC_SIZE;
        }
    }

    public int getTotalBytesForUpdate(int i) {
        int i2;
        int updateOutputSize = this.processor.getUpdateOutputSize(i);
        switch (this.m_state.ord) {
            case 3:
            case 4:
                i2 = updateOutputSize + this.m_bufPos;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                i2 = (updateOutputSize + this.m_bufPos) - this.MAC_SIZE;
                break;
            default:
                return updateOutputSize;
        }
        return Math.max(0, i2);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i) {
        int totalBytesForUpdate = getTotalBytesForUpdate(i);
        return totalBytesForUpdate - (totalBytesForUpdate % this.BlockSize);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        KeyParameter key;
        byte[] iv;
        this.forEncryption = z;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            key = aEADParameters.getKey();
            iv = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            int i = this.macSizeLowerBound;
            if (i == 0) {
                if (macSize != (this.MAC_SIZE << 3)) {
                    throw new IllegalArgumentException(C20778.m46922(macSize, "Invalid value for MAC size: "));
                }
            } else {
                if (macSize > 128 || macSize < (i << 3) || (macSize & 7) != 0) {
                    throw new IllegalArgumentException("MAC size must be between " + (this.macSizeLowerBound << 3) + " and 128 bits for " + this.algorithmName);
                }
                this.MAC_SIZE = macSize >>> 3;
            }
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("invalid parameters passed to " + this.algorithmName);
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            key = (KeyParameter) parametersWithIV.getParameters();
            iv = parametersWithIV.getIV();
            this.initialAssociatedText = null;
        }
        if (key == null) {
            throw new IllegalArgumentException(C10965.m25286(new StringBuilder(), this.algorithmName, " Init parameters must include a key"));
        }
        if (iv == null || iv.length != this.IV_SIZE) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.algorithmName);
            sb.append(" requires exactly ");
            throw new IllegalArgumentException(C5410.m11876(this.IV_SIZE, " bytes of IV", sb));
        }
        byte[] key2 = key.getKey();
        if (key2.length != this.KEY_SIZE) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.algorithmName);
            sb2.append(" key must be ");
            throw new IllegalArgumentException(C5410.m11876(this.KEY_SIZE, " bytes long", sb2));
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z)));
        this.m_state = z ? State.EncInit : State.DecInit;
        init(key2, iv);
        DataLimitCounter dataLimitCounter = this.dataLimitCounter;
        if (dataLimitCounter != null) {
            dataLimitCounter.increment(iv.length);
        }
        reset(true);
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    public abstract void init(byte[] bArr, byte[] bArr2);

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b) {
        checkAAD();
        this.aadOperator.processAADByte(b);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i, int i2) {
        ensureSufficientInputBuffer(bArr, i, i2);
        if (i2 <= 0) {
            return;
        }
        checkAAD();
        this.aadOperator.processAADBytes(bArr, i, i2);
    }

    public abstract void processBufferAAD(byte[] bArr, int i);

    public abstract void processBufferDecrypt(byte[] bArr, int i, byte[] bArr2, int i2);

    public abstract void processBufferEncrypt(byte[] bArr, int i, byte[] bArr2, int i2);

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b, byte[] bArr, int i) {
        return this.dataOperator.processByte(b, bArr, i);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        ensureSufficientInputBuffer(bArr, i, i2);
        return this.dataOperator.processBytes(bArr, i, i2, bArr2, i3);
    }

    public int processEncDecByte(byte[] bArr, int i) {
        if ((this.forEncryption ? this.BlockSize : this.m_bufferSizeDecrypt) - this.m_bufPos != 0) {
            return 0;
        }
        ensureSufficientOutputBuffer(bArr, i, this.BlockSize);
        if (this.forEncryption) {
            processBufferEncrypt(this.m_buf, 0, bArr, i);
        } else {
            processBufferDecrypt(this.m_buf, 0, bArr, i);
            byte[] bArr2 = this.m_buf;
            int i2 = this.BlockSize;
            System.arraycopy(bArr2, i2, bArr2, 0, this.m_bufPos - i2);
        }
        int i3 = this.m_bufPos;
        int i4 = this.BlockSize;
        this.m_bufPos = i3 - i4;
        return i4;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ed  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ed -> B:45:0x00f9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public int processEncDecBytes(byte[] r8, int r9, int r10, byte[] r11, int r12) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.engines.AEADBaseEngine.processEncDecBytes(byte[], int, int, byte[], int):int");
    }

    public abstract void processFinalAAD();

    public abstract void processFinalBlock(byte[] bArr, int i);

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true);
    }

    public void reset(boolean z) {
        ensureInitialized();
        if (z) {
            this.mac = null;
        }
        byte[] bArr = this.m_buf;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
            this.m_bufPos = 0;
        }
        byte[] bArr2 = this.m_aad;
        if (bArr2 != null) {
            Arrays.fill(bArr2, (byte) 0);
            this.m_aadPos = 0;
        }
        switch (this.m_state.ord) {
            case 1:
            case 5:
                break;
            case 2:
            case 3:
            case 4:
                this.m_state = State.EncFinal;
                return;
            case 6:
            case 7:
            case 8:
                this.m_state = State.DecFinal;
                break;
            default:
                throw new IllegalStateException(C10965.m25286(new StringBuilder(), getAlgorithmName(), " needs to be initialized"));
        }
        this.aadOperator.reset();
        this.dataOperator.reset();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x002a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    /* JADX WARN: Code duplicated, block: B:30:0x008d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
    public void setInnerMembers(ProcessingBufferType processingBufferType, AADOperatorType aADOperatorType, DataOperatorType dataOperatorType) {
        AADProcessingBuffer bufferedAADProcessor;
        int i;
        AADOperator defaultAADOperator;
        int i2;
        DataOperator defaultDataOperator;
        int i3 = processingBufferType.ord;
        if (i3 != 0) {
            if (i3 == 1) {
                bufferedAADProcessor = new ImmediateAADProcessor();
            }
            this.m_bufferSizeDecrypt = this.BlockSize + this.MAC_SIZE;
            i = aADOperatorType.ord;
            if (i != 0) {
                this.m_aad = new byte[this.AADBufferSize];
                defaultAADOperator = new DefaultAADOperator();
            } else if (i != 1) {
                this.m_aad = new byte[this.AADBufferSize];
                defaultAADOperator = new CounterAADOperator();
            } else {
                if (i != 2) {
                    if (i == 3) {
                        this.m_aad = new byte[this.AADBufferSize];
                        this.dataLimitCounter = new DataLimitCounter();
                        defaultAADOperator = new DataLimitAADOperator();
                    }
                    i2 = dataOperatorType.ord;
                    if (i2 != 0) {
                        this.m_buf = new byte[this.m_bufferSizeDecrypt];
                        defaultDataOperator = new DefaultDataOperator();
                    } else if (i2 != 1) {
                        this.m_buf = new byte[this.m_bufferSizeDecrypt];
                        defaultDataOperator = new CounterDataOperator();
                    } else if (i2 != 2) {
                        this.m_buf = new byte[this.MAC_SIZE];
                        defaultDataOperator = new StreamDataOperator();
                    } else if (i2 != 3) {
                        this.BlockSize = 0;
                        this.m_buf = new byte[this.m_bufferSizeDecrypt];
                        defaultDataOperator = new StreamCipherOperator();
                    } else {
                        if (i2 != 4) {
                            return;
                        }
                        this.m_buf = new byte[this.m_bufferSizeDecrypt];
                        defaultDataOperator = new DataLimitDataOperator();
                    }
                    this.dataOperator = defaultDataOperator;
                }
                this.AADBufferSize = 0;
                defaultAADOperator = new StreamAADOperator();
            }
            this.aadOperator = defaultAADOperator;
            i2 = dataOperatorType.ord;
            if (i2 != 0) {
                this.m_buf = new byte[this.m_bufferSizeDecrypt];
                defaultDataOperator = new DefaultDataOperator();
            } else if (i2 != 1) {
                this.m_buf = new byte[this.m_bufferSizeDecrypt];
                defaultDataOperator = new CounterDataOperator();
            } else if (i2 != 2) {
                this.m_buf = new byte[this.MAC_SIZE];
                defaultDataOperator = new StreamDataOperator();
            } else if (i2 != 3) {
                this.BlockSize = 0;
                this.m_buf = new byte[this.m_bufferSizeDecrypt];
                defaultDataOperator = new StreamCipherOperator();
            } else {
                if (i2 != 4) {
                    return;
                }
                this.m_buf = new byte[this.m_bufferSizeDecrypt];
                defaultDataOperator = new DataLimitDataOperator();
            }
            this.dataOperator = defaultDataOperator;
        }
        bufferedAADProcessor = new BufferedAADProcessor();
        this.processor = bufferedAADProcessor;
        this.m_bufferSizeDecrypt = this.BlockSize + this.MAC_SIZE;
        i = aADOperatorType.ord;
        if (i != 0) {
            this.m_aad = new byte[this.AADBufferSize];
            defaultAADOperator = new DefaultAADOperator();
        } else if (i != 1) {
            this.m_aad = new byte[this.AADBufferSize];
            defaultAADOperator = new CounterAADOperator();
        } else {
            if (i != 2) {
                if (i == 3) {
                    this.m_aad = new byte[this.AADBufferSize];
                    this.dataLimitCounter = new DataLimitCounter();
                    defaultAADOperator = new DataLimitAADOperator();
                }
                i2 = dataOperatorType.ord;
                if (i2 != 0) {
                    this.m_buf = new byte[this.m_bufferSizeDecrypt];
                    defaultDataOperator = new DefaultDataOperator();
                } else if (i2 != 1) {
                    this.m_buf = new byte[this.m_bufferSizeDecrypt];
                    defaultDataOperator = new CounterDataOperator();
                } else if (i2 != 2) {
                    this.m_buf = new byte[this.MAC_SIZE];
                    defaultDataOperator = new StreamDataOperator();
                } else if (i2 != 3) {
                    this.BlockSize = 0;
                    this.m_buf = new byte[this.m_bufferSizeDecrypt];
                    defaultDataOperator = new StreamCipherOperator();
                } else {
                    if (i2 != 4) {
                        return;
                    }
                    this.m_buf = new byte[this.m_bufferSizeDecrypt];
                    defaultDataOperator = new DataLimitDataOperator();
                }
                this.dataOperator = defaultDataOperator;
            }
            this.AADBufferSize = 0;
            defaultAADOperator = new StreamAADOperator();
        }
        this.aadOperator = defaultAADOperator;
        i2 = dataOperatorType.ord;
        if (i2 != 0) {
            this.m_buf = new byte[this.m_bufferSizeDecrypt];
            defaultDataOperator = new DefaultDataOperator();
        } else if (i2 != 1) {
            this.m_buf = new byte[this.m_bufferSizeDecrypt];
            defaultDataOperator = new CounterDataOperator();
        } else if (i2 != 2) {
            this.m_buf = new byte[this.MAC_SIZE];
            defaultDataOperator = new StreamDataOperator();
        } else if (i2 != 3) {
            this.BlockSize = 0;
            this.m_buf = new byte[this.m_bufferSizeDecrypt];
            defaultDataOperator = new StreamCipherOperator();
        } else {
            if (i2 != 4) {
                return;
            }
            this.m_buf = new byte[this.m_bufferSizeDecrypt];
            defaultDataOperator = new DataLimitDataOperator();
        }
        this.dataOperator = defaultDataOperator;
    }

    public void checkAAD() {
        State state;
        int i = this.m_state.ord;
        if (i == 1) {
            state = State.EncAad;
        } else {
            if (i == 2) {
                return;
            }
            if (i == 4) {
                throw new IllegalStateException(C10965.m25286(new StringBuilder(), getAlgorithmName(), " cannot be reused for encryption"));
            }
            if (i != 5) {
                if (i != 6) {
                    throw new IllegalStateException(C10965.m25286(new StringBuilder(), getAlgorithmName(), " needs to be initialized"));
                }
                return;
            }
            state = State.DecAad;
        }
        this.m_state = state;
    }

    public boolean checkData(boolean z) {
        switch (this.m_state.ord) {
            case 1:
            case 2:
                finishAAD(State.EncData, z);
                return true;
            case 3:
                return true;
            case 4:
                throw new IllegalStateException(C10965.m25286(new StringBuilder(), getAlgorithmName(), " cannot be reused for encryption"));
            case 5:
            case 6:
                finishAAD(State.DecData, z);
                return false;
            case 7:
                return false;
            default:
                throw new IllegalStateException(C10965.m25286(new StringBuilder(), getAlgorithmName(), " needs to be initialized"));
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i) throws InvalidCipherTextException {
        int i2;
        boolean zCheckData = checkData(true);
        int i3 = this.m_bufPos;
        int i4 = this.MAC_SIZE;
        if (zCheckData) {
            i2 = i3 + i4;
        } else {
            if (i3 < i4) {
                throw new InvalidCipherTextException("data too short");
            }
            i2 = i3 - i4;
            this.m_bufPos = i2;
        }
        ensureSufficientOutputBuffer(bArr, i, i2);
        this.mac = new byte[this.MAC_SIZE];
        processFinalBlock(bArr, i);
        if (zCheckData) {
            byte[] bArr2 = this.mac;
            int i5 = this.MAC_SIZE;
            System.arraycopy(bArr2, 0, bArr, (i + i2) - i5, i5);
        } else if (!Arrays.constantTimeAreEqual(this.MAC_SIZE, this.mac, 0, this.m_buf, this.m_bufPos)) {
            DecryptionFailureCounter decryptionFailureCounter = this.decryptionFailureCounter;
            if (decryptionFailureCounter == null || !decryptionFailureCounter.increment()) {
                throw new InvalidCipherTextException(C10965.m25286(new StringBuilder(), this.algorithmName, " mac does not match"));
            }
            throw new InvalidCipherTextException(C10965.m25286(new StringBuilder(), this.algorithmName, " decryption failure limit exceeded"));
        }
        reset(!zCheckData);
        return i2;
    }
}
