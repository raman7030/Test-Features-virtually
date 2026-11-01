package p067l;

import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import java.lang.reflect.Array;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۤ᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: CB2D */
/* JADX INFO: loaded from: classes4.dex */
public class C12412 implements InterfaceC21800, AutoCloseable {

    /* JADX INFO: renamed from: ܿ֫ */
    public static final InputFilter[] f34665 = new InputFilter[0];

    /* JADX INFO: renamed from: ֫֫ */
    public boolean f34666;

    /* JADX INFO: renamed from: ۗ */
    public int f34667;

    /* JADX INFO: renamed from: ۙ */
    public InputFilter[] f34668;

    /* JADX INFO: renamed from: ۛ */
    public final ReentrantReadWriteLock f34669;

    /* JADX INFO: renamed from: ۟ */
    public int f34670;

    /* JADX INFO: renamed from: ۤ */
    public C19549 f34671;

    /* JADX INFO: renamed from: ۧ֫ */
    public final C24913 f34672;

    /* JADX INFO: renamed from: ۨ */
    public volatile int f34673;

    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC3221 f34674;

    /* JADX INFO: renamed from: ۬ */
    public C12610 f34675;

    /* JADX INFO: renamed from: ܰ */
    public final ReentrantReadWriteLock.ReadLock f34676;

    /* JADX INFO: renamed from: ܽ֫ */
    public final C13753 f34677;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final ReentrantReadWriteLock.WriteLock f34678;

    /* JADX INFO: renamed from: ᩶ */
    public final C5056 f34679;

    /* JADX INFO: renamed from: ᩸ */
    public volatile boolean f34680;

    /* JADX INFO: renamed from: ᩹ */
    public int f34681;

    /* JADX INFO: renamed from: ᩺ */
    public int f34682;

    @Override // android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Editable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // android.text.Editable
    public final /* bridge */ /* synthetic */ Editable insert(int i, CharSequence charSequence) {
        insert(i, charSequence);
        return this;
    }

    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC3221 m28594() {
        return this.f34674;
    }

    public C12412() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f34669 = reentrantReadWriteLock;
        this.f34676 = reentrantReadWriteLock.readLock();
        this.f34678 = reentrantReadWriteLock.writeLock();
        this.f34674 = new C15093(this);
        this.f34668 = f34665;
        C13773.m31392(0, 0, 0);
        this.f34672 = null;
        C5056 c5056 = new C5056("");
        this.f34679 = c5056;
        c5056.m10786(new C11762(0, 0, "", 0, 0), null);
        this.f34677 = new C13753(this, "", 0);
    }

    public C12412(C24913 c24913) {
        this(c24913, null);
    }

    public C12412(C24913 c24913, CharSequence charSequence) {
        C13753 c13753;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f34669 = reentrantReadWriteLock;
        this.f34676 = reentrantReadWriteLock.readLock();
        this.f34678 = reentrantReadWriteLock.writeLock();
        this.f34674 = new C15093(this);
        this.f34668 = f34665;
        this.f34672 = c24913;
        this.f34679 = null;
        if (charSequence == null) {
            c13753 = new C13753(this, null, 0);
        } else {
            c13753 = new C13753(this, charSequence, charSequence.length());
        }
        this.f34677 = c13753;
        C7205 c7205M54762 = c24913.m54762();
        this.f34666 = true;
        try {
            if (c7205M54762.m16550() >= 0) {
                setSpan(Selection.SELECTION_START, c7205M54762.m16550(), c7205M54762.m16550(), 34);
            }
            if (c7205M54762.m16548() >= 0) {
                setSpan(Selection.SELECTION_END, c7205M54762.m16548(), c7205M54762.m16548(), 34);
            }
        } finally {
            this.f34666 = false;
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C14443 m28598() {
        m28579();
        C24913 c24913 = this.f34672;
        return c24913 == null ? this.f34679.m10785() : c24913.m54760();
    }

    @Override // p067l.InterfaceC21800
    /* JADX INFO: renamed from: ۖ֫ */
    public final C9729 mo28589() {
        return m28577(false);
    }

    @Override // p067l.InterfaceC21800
    /* JADX INFO: renamed from: ܶ */
    public final C9729 mo28595() {
        return m28577(true);
    }

    /* JADX INFO: renamed from: ܽ */
    private C9729 m28577(boolean z) {
        C24913 c24913;
        this.f34676.lock();
        try {
            if (this.f34682 != 0) {
                throw new IllegalStateException("Text replacement is not published");
            }
            m28579();
            C14443 c14443M28598 = (!z || (c24913 = this.f34672) == null) ? m28598() : c24913.m54770();
            int i = this.f34673;
            this.f34676.unlock();
            return C9729.m22734(c14443M28598, i);
        } catch (Throwable th) {
            this.f34676.unlock();
            throw th;
        }
    }

    @Override // p067l.InterfaceC21800
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo28586(C9729 c9729) {
        C14443 c14443M22744 = c9729 == null ? null : c9729.m22744();
        boolean z = false;
        if (c14443M22744 == null) {
            return false;
        }
        this.f34676.lock();
        try {
            if (!this.f34680 && this.f34682 == 0 && c9729.m22747() == this.f34673) {
                C24913 c24913 = this.f34672;
                if (c24913 == null) {
                    if (this.f34679.m10787(c14443M22744)) {
                        z = true;
                    }
                } else if (c24913.m54749(c14443M22744)) {
                    z = true;
                }
            }
            return z;
        } finally {
            this.f34676.unlock();
        }
    }

    /* JADX INFO: renamed from: ۤ֫ */
    public EnumC18207 mo3997() {
        return m28578(false);
    }

    /* JADX INFO: renamed from: ۗ֫ */
    public EnumC18207 mo3995() {
        return m28578(true);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m28593(Runnable runnable) {
        ReentrantReadWriteLock.WriteLock writeLock = this.f34678;
        writeLock.lock();
        try {
            m28579();
            C24913 c24913 = this.f34672;
            if (c24913 == null) {
                throw new IllegalStateException("History requires a text session");
            }
            int i = this.f34667;
            if (i != 0 || this.f34670 != 0) {
                throw new IllegalStateException("Cannot group history during text callbacks");
            }
            this.f34667 = i + 1;
            try {
                m28588();
                c24913.m54738(runnable);
                this.f34667--;
                writeLock.unlock();
            } catch (Throwable th) {
                this.f34667--;
                throw th;
            }
        } catch (Throwable th2) {
            writeLock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۬ */
    public int mo14913() {
        return hashCode();
    }

    /* JADX INFO: renamed from: ᩳ */
    private EnumC18207 m28578(boolean z) {
        EnumC18207 enumC18207M54736;
        this.f34678.lock();
        try {
            if (this.f34680) {
                enumC18207M54736 = EnumC18207.UNAVAILABLE;
            } else {
                m28579();
                if (this.f34672 == null) {
                    throw new IllegalStateException("History requires a text session");
                }
                int i = this.f34667;
                if (i != 0 || this.f34670 != 0) {
                    throw new IllegalStateException("Cannot replay history during text callbacks");
                }
                this.f34667 = i + 1;
                try {
                    m28588();
                    enumC18207M54736 = this.f34672.m54736(z, new C14423(this));
                    this.f34667--;
                } catch (Throwable th) {
                    this.f34667--;
                    throw th;
                }
            }
            this.f34678.unlock();
            return enumC18207M54736;
        } catch (Throwable th2) {
            this.f34678.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo14910(boolean z) {
        close();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28584(C24913 c24913) {
        ReentrantReadWriteLock.WriteLock writeLock = this.f34678;
        writeLock.lock();
        try {
            m28579();
            if (this.f34672 != c24913) {
                throw new IllegalArgumentException("Text batch belongs to another session");
            }
            if (this.f34670 != 0 || this.f34667 != 0) {
                throw new IllegalStateException("Cannot publish text load during callbacks");
            }
            writeLock.unlock();
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public C7245 mo14909(C19946 c19946) {
        return c19946.m45272(this.f34674);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m28587(C24913 c24913, C2510 c2510, char[] cArr, int i, C7245 c7245, int i2) {
        ReentrantReadWriteLock.WriteLock writeLock = this.f34678;
        writeLock.lock();
        try {
            m28584(c24913);
            return this.f34672.m54748(this.f34674, c2510, cArr, i, c7245, i2);
        } finally {
            writeLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28583(C19549 c19549) {
        int length = length();
        C19549 c195410 = this.f34671;
        this.f34671 = c19549;
        this.f34670++;
        try {
            this.f34677.m31332(length, length, (CharSequence) CharBuffer.wrap(c19549.m44390(), 0, c19549.m44391()), 0, c19549.m44391(), true);
            this.f34677.getClass();
        } finally {
            this.f34671 = c195410;
            this.f34670--;
        }
    }

    @Override // p067l.InterfaceC21800
    public final void setSelection(int i) {
        setSelection(i, i);
    }

    @Override // p067l.InterfaceC21800
    public final void setSelection(int i, int i2) {
        this.f34678.lock();
        try {
            if (!this.f34680) {
                Selection.setSelection(this, Math.min(i, length()), Math.min(i2, length()));
            }
        } finally {
            this.f34678.unlock();
        }
    }

    @Override // android.text.Editable
    public C12412 replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m28573(i, i2, charSequence, i3, i4, (C12610) null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m28573(int i, int i2, CharSequence charSequence, int i3, int i4, C12610 c12610) {
        ReentrantReadWriteLock.WriteLock writeLock = this.f34678;
        if (this.f34680) {
            return;
        }
        int length = charSequence.length();
        if (this.f34680) {
            return;
        }
        if (i3 < 0 || i4 < i3 || i4 > length) {
            StringBuilder sbM49005 = C21720.m49005("start = ", i3, ", end = ", ", length = ", i4);
            sbM49005.append(length);
            throw new IndexOutOfBoundsException(sbM49005.toString());
        }
        CharSequence charSequence2 = charSequence;
        int i5 = i3;
        int length2 = i4;
        for (InputFilter inputFilter : this.f34668) {
            if (this.f34680) {
                return;
            }
            CharSequence charSequenceFilter = inputFilter.filter(charSequence2, i5, length2, this, i, i2);
            if (this.f34680) {
                return;
            }
            if (charSequenceFilter != null) {
                charSequence2 = charSequenceFilter;
                length2 = charSequenceFilter.length();
                i5 = 0;
            }
        }
        writeLock.lock();
        try {
            if (!m28576()) {
                writeLock.unlock();
                return;
            }
            m28588();
            C13773.m31392(i, i2, length());
            C13773.m31393(length(), i2 - i, length2 - i5);
            this.f34670++;
            C12610 c12611 = this.f34675;
            C19549 c19549 = this.f34671;
            this.f34675 = c12610;
            this.f34671 = null;
            try {
                this.f34677.m31332(i, i2, charSequence2, i5, length2, false);
                this.f34677.getClass();
                this.f34675 = c12611;
                this.f34671 = c19549;
                this.f34670--;
                writeLock.unlock();
            } catch (Throwable th) {
                this.f34675 = c12611;
                this.f34671 = c19549;
                this.f34670--;
                throw th;
            }
        } catch (Throwable th2) {
            writeLock.unlock();
            throw th2;
        }
    }

    @Override // p067l.InterfaceC21800
    /* JADX INFO: renamed from: ֨ۧ */
    public final int mo28581() {
        return this.f34673;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m28597() {
        if (this.f34669.isWriteLockedByCurrentThread()) {
            return (this.f34670 == 0 && this.f34667 == 0) ? false : true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [l.ۗ᩸ᩳ] */
    /* JADX WARN: Type inference failed for: r8v0, types: [l.ۙ᩸ᩳ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫ */
    public final void m28582(final int i, final int i2, final CharSequence charSequence, final int i3, final int i4) {
        this.f34682++;
        if (i != i2 || i3 != i4) {
            try {
                this.f34673++;
            } finally {
                this.f34682--;
            }
        }
        C24913 c24913 = this.f34672;
        if (c24913 == 0) {
            C5056 c5056 = this.f34679;
            c5056.getClass();
            c5056.m10786(new C11762(i, i2, charSequence, i3, i4), null);
        } else {
            C19549 c19549 = this.f34671;
            if (c19549 != null) {
                c24913.m54745(c19549);
            } else {
                C12610 c12610 = this.f34675;
                if (c12610 != null) {
                    c24913.m54743(c12610, (C7047) new Consumer() { // from class: l.ۙ᩸ᩳ
                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C24719.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            ((C17795) obj).m40406(i, i2, charSequence, i3, i4);
                        }
                    });
                } else {
                    c24913.m54742((C5706) new Consumer() { // from class: l.ۗ᩸ᩳ
                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C24719.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            ((C17795) obj).m40406(i, i2, charSequence, i3, i4);
                        }
                    });
                }
            }
        }
    }

    @Override // android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        return replace(i, i, charSequence, i2, i3);
    }

    @Override // android.text.Editable
    public final Editable delete(int i, int i2) {
        return replace(i, i2, "");
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m28591(int i) {
        replace(0, i, "");
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final void append(CharSequence charSequence) {
        insert(length(), charSequence);
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        int length = length();
        replace(length, length, charSequence, i, i2);
        return this;
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        int length = length();
        replace(length, length, charSequence, i, i2);
        return this;
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        insert(length(), (CharSequence) String.valueOf(c));
        return this;
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Appendable append(char c) {
        insert(length(), (CharSequence) String.valueOf(c));
        return this;
    }

    @Override // android.text.Editable
    public final void clear() {
        m28591(length());
    }

    @Override // android.text.Editable
    public final void setFilters(InputFilter[] inputFilterArr) {
        this.f34678.lock();
        try {
            if (!this.f34680) {
                if (inputFilterArr == null) {
                    throw new IllegalArgumentException();
                }
                this.f34668 = inputFilterArr;
            }
            this.f34678.unlock();
        } catch (Throwable th) {
            this.f34678.unlock();
            throw th;
        }
    }

    @Override // android.text.Editable
    public final InputFilter[] getFilters() {
        return this.f34668;
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        ReentrantReadWriteLock.ReadLock readLock = this.f34676;
        readLock.lock();
        try {
            m28574(i, i2, cArr, i3);
        } finally {
            readLock.unlock();
        }
    }

    @Override // p067l.InterfaceC21800
    /* JADX INFO: renamed from: ۧ */
    public final void mo28592(int i, int i2, char[] cArr, int i3) {
        m28574(i, i2, cArr, i3);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m28574(int i, int i2, char[] cArr, int i3) {
        C14443 c14443M28580 = m28580();
        try {
            if (c14443M28580 != null) {
                c14443M28580.getChars(i, i2, cArr, i3);
            } else {
                int i4 = i2 - i;
                if (i < 0 || i2 < i || i3 < 0 || i4 > cArr.length - i3) {
                    throw new IndexOutOfBoundsException("Invalid character copy range");
                }
                Arrays.fill(cArr, i3, i4 + i3, (char) 0);
            }
            if (c14443M28580 != null) {
                c14443M28580.close();
            }
        } catch (Throwable th) {
            if (c14443M28580 != null) {
                try {
                    c14443M28580.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        try {
            if (this.f34680) {
                return (char) 0;
            }
            C24913 c24913 = this.f34672;
            if (c24913 == null) {
                C13773 c13773M10784 = this.f34679.m10784(i);
                C22902 c22902 = c13773M10784.f38940;
                try {
                    return c13773M10784.m31395(i);
                } finally {
                    if (c22902 != null) {
                        c22902.m51159();
                    }
                }
            }
            return c24913.m54733(i);
        } catch (C4385 e) {
            if (this.f34680) {
                return (char) 0;
            }
            throw e;
        }
    }

    @Override // java.lang.CharSequence
    public final int length() {
        try {
            if (this.f34680) {
                return this.f34681;
            }
            C24913 c24913 = this.f34672;
            return c24913 == null ? this.f34679.length() : c24913.length();
        } catch (C4385 e) {
            if (!this.f34680) {
                throw e;
            }
            return this.f34681;
        }
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        char[] cArr = new char[i2 - i];
        getChars(i, i2, cArr, 0);
        return new String(cArr);
    }

    @Override // p067l.InterfaceC21800
    /* JADX INFO: renamed from: ۧ */
    public final String mo28590(int i, int i2) {
        return ((String) subSequence(i, i2)).toString();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        C14443 c14443M28580 = m28580();
        try {
            String str = c14443M28580 == null ? new String(new char[this.f34681]) : c14443M28580.toString();
            if (c14443M28580 != null) {
                c14443M28580.close();
            }
            return str;
        } catch (Throwable th) {
            if (c14443M28580 != null) {
                try {
                    c14443M28580.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // android.text.Editable
    public final void clearSpans() {
        C13753 c13753 = this.f34677;
        ReentrantReadWriteLock.WriteLock writeLock = this.f34678;
        writeLock.lock();
        try {
            if (m28576()) {
                c13753.m31331();
                m28588();
            }
        } finally {
            writeLock.unlock();
        }
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        C13753 c13753 = this.f34677;
        ReentrantReadWriteLock.WriteLock writeLock = this.f34678;
        writeLock.lock();
        try {
            if (m28576()) {
                c13753.m31333(obj, i, i2, i3);
                m28588();
            }
        } finally {
            writeLock.unlock();
        }
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        C13753 c13753 = this.f34677;
        ReentrantReadWriteLock.WriteLock writeLock = this.f34678;
        writeLock.lock();
        try {
            if (m28576()) {
                c13753.m31338(obj);
                m28588();
            }
        } finally {
            writeLock.unlock();
        }
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        Object[] objArrM31334;
        this.f34676.lock();
        try {
            if (this.f34680) {
                if (cls == null) {
                    cls = Object.class;
                }
                objArrM31334 = (Object[]) Array.newInstance((Class<?>) cls, 0);
            } else {
                objArrM31334 = this.f34677.m31334(i, i2, cls);
            }
            return objArrM31334;
        } finally {
            this.f34676.unlock();
        }
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        this.f34676.lock();
        try {
            if (!this.f34680) {
                return this.f34677.m31337(obj);
            }
            return -1;
        } finally {
            this.f34676.unlock();
        }
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        this.f34676.lock();
        try {
            if (!this.f34680) {
                return this.f34677.m31330(obj);
            }
            return -1;
        } finally {
            this.f34676.unlock();
        }
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        this.f34676.lock();
        try {
            if (!this.f34680) {
                return this.f34677.m31336(obj);
            }
            return 0;
        } finally {
            this.f34676.unlock();
        }
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        this.f34676.lock();
        try {
            return this.f34680 ? i2 : this.f34677.m31335(i, i2, cls);
        } finally {
            this.f34676.unlock();
        }
    }

    public final boolean equals(Object obj) {
        char cM50445;
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C12412 c12412 = (C12412) obj;
                C14443 c14443M28580 = m28580();
                try {
                    C14443 c14443M28581 = c12412.m28580();
                    try {
                        int length = c14443M28580 == null ? this.f34681 : c14443M28580.length();
                        if (length != (c14443M28581 == null ? c12412.f34681 : c14443M28581.length())) {
                            if (c14443M28581 != null) {
                                c14443M28581.close();
                            }
                            if (c14443M28580 != null) {
                                c14443M28580.close();
                                return false;
                            }
                        } else {
                            C22491 c22491Mo30001 = null;
                            C22491 c22491Mo30002 = c14443M28580 == null ? null : c14443M28580.mo30001(0);
                            if (c14443M28581 != null) {
                                try {
                                    c22491Mo30001 = c14443M28581.mo30001(0);
                                } catch (Throwable th) {
                                    if (c22491Mo30002 != null) {
                                        try {
                                            c22491Mo30002.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                    }
                                    throw th;
                                }
                            }
                            if (c22491Mo30002 == null && c22491Mo30001 == null) {
                                if (c22491Mo30001 != null) {
                                    c22491Mo30001.close();
                                }
                                if (c22491Mo30002 != null) {
                                    c22491Mo30002.close();
                                }
                                if (c14443M28581 != null) {
                                    c14443M28581.close();
                                }
                                if (c14443M28580 != null) {
                                    c14443M28580.close();
                                    return true;
                                }
                            } else {
                                for (int i = 0; i < length; i++) {
                                    char cM50446 = c22491Mo30002 == null ? (char) 0 : c22491Mo30002.m50445();
                                    if (c22491Mo30001 == null) {
                                        cM50445 = 0;
                                    } else {
                                        try {
                                            cM50445 = c22491Mo30001.m50445();
                                        } catch (Throwable th3) {
                                            if (c22491Mo30001 != null) {
                                                try {
                                                    c22491Mo30001.close();
                                                } catch (Throwable th4) {
                                                    th3.addSuppressed(th4);
                                                }
                                            }
                                            throw th3;
                                        }
                                    }
                                    if (cM50446 != cM50445) {
                                        if (c22491Mo30001 != null) {
                                            c22491Mo30001.close();
                                        }
                                        if (c22491Mo30002 != null) {
                                            c22491Mo30002.close();
                                        }
                                        if (c14443M28581 != null) {
                                            c14443M28581.close();
                                        }
                                        if (c14443M28580 != null) {
                                            c14443M28580.close();
                                            return false;
                                        }
                                    }
                                }
                                if (c22491Mo30001 != null) {
                                    c22491Mo30001.close();
                                }
                                if (c22491Mo30002 != null) {
                                    c22491Mo30002.close();
                                }
                                if (c14443M28581 != null) {
                                    c14443M28581.close();
                                }
                                if (c14443M28580 != null) {
                                    c14443M28580.close();
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        if (c14443M28581 != null) {
                            try {
                                c14443M28581.close();
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    if (c14443M28580 != null) {
                        try {
                            c14443M28580.close();
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                        }
                    }
                    throw th7;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C14443 c14443M28580 = m28580();
        int iM50445 = 0;
        if (c14443M28580 == null) {
            if (c14443M28580 != null) {
                c14443M28580.close();
            }
            return 0;
        }
        try {
            C22491 c22491Mo30001 = c14443M28580.mo30001(0);
            while (c22491Mo30001.m50444()) {
                try {
                    iM50445 = (iM50445 * 31) + c22491Mo30001.m50445();
                } catch (Throwable th) {
                    try {
                        c22491Mo30001.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            c22491Mo30001.close();
            c14443M28580.close();
            return iM50445;
        } catch (Throwable th3) {
            try {
                c14443M28580.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ܺ֫ */
    public final C23141 m28596() {
        return new C23141(this, -1);
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m28588() {
        C24913 c24913 = this.f34672;
        if (c24913 == null || this.f34666) {
            return;
        }
        c24913.m54737(Selection.getSelectionStart(this), Selection.getSelectionEnd(this));
    }

    /* JADX INFO: renamed from: ۘ */
    private boolean m28576() {
        if (this.f34680) {
            return false;
        }
        C24913 c24913 = this.f34672;
        if (c24913 == null || this.f34666) {
            return true;
        }
        c24913.m54750();
        return true;
    }

    /* JADX INFO: renamed from: ᩵ */
    private C14443 m28580() {
        if (this.f34680) {
            return null;
        }
        try {
            return m28598();
        } catch (C4385 e) {
            if (this.f34680) {
                return null;
            }
            throw e;
        }
    }

    @Override // android.text.Editable
    public final void insert(int i, CharSequence charSequence) {
        if (this.f34680) {
            return;
        }
        replace(i, i, charSequence, 0, charSequence.length());
    }

    @Override // android.text.Editable
    public final C12412 replace(int i, int i2, CharSequence charSequence) {
        return this.f34680 ? this : replace(i, i2, charSequence, 0, charSequence.length());
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m28585() {
        return this.f34680;
    }

    /* JADX INFO: renamed from: ᩴ */
    private void m28579() {
        if (this.f34680) {
            throw new C4385("Editable is closed");
        }
    }

    public void close() {
        this.f34678.lock();
        try {
            if (!this.f34680) {
                if (this.f34670 != 0 || this.f34667 != 0) {
                    throw new IllegalStateException("Cannot close during editable replacement");
                }
                C24913 c24913 = this.f34672;
                this.f34681 = c24913 == null ? this.f34679.length() : c24913.length();
                this.f34680 = true;
                C5056 c5056 = this.f34679;
                if (c5056 != null) {
                    c5056.close();
                }
            }
            this.f34678.unlock();
        } catch (Throwable th) {
            this.f34678.unlock();
            throw th;
        }
    }
}
