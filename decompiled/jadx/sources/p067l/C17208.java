package p067l;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܺ֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L4DX */
/* JADX INFO: loaded from: classes4.dex */
public final class C17208 {

    /* JADX INFO: renamed from: ֫ */
    public final C7088 f51221;

    /* JADX INFO: renamed from: ۖ */
    public C21904 f51222;

    /* JADX INFO: renamed from: ۘ */
    public final C11175 f51223;

    /* JADX INFO: renamed from: ۜ */
    public final AbstractC21582 f51224;

    /* JADX INFO: renamed from: ۡ */
    public boolean f51225;

    /* JADX INFO: renamed from: ۢ */
    public boolean f51226;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC18228 f51227;

    /* JADX INFO: renamed from: ܳ */
    public C24585 f51228;

    /* JADX INFO: renamed from: ܺ */
    public C7325 f51229;

    /* JADX INFO: renamed from: ܽ */
    public final Object f51230;

    /* JADX INFO: renamed from: ܿ */
    public InterfaceC20563 f51231;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f51232;

    /* JADX INFO: renamed from: ᩷ */
    public int f51233;

    /* JADX INFO: renamed from: ᩻ */
    public final C10853 f51234;

    /* JADX INFO: renamed from: ܽ */
    public final synchronized C24585 m38977() {
        return this.f51228;
    }

    public C17208(C10853 c10853, C7088 c7088, InterfaceC18228 interfaceC18228, AbstractC21582 abstractC21582, Object obj) {
        this.f51234 = c10853;
        this.f51221 = c7088;
        this.f51227 = interfaceC18228;
        this.f51224 = abstractC21582;
        this.f51223 = new C11175(c7088, AbstractC10007.f27689.mo23316(c10853), interfaceC18228, abstractC21582);
        this.f51230 = obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20563 m38970(C18724 c18724, C9833 c9833, boolean z) {
        try {
            InterfaceC20563 interfaceC20563M54217 = m38968(c9833.m23004(), c9833.m23005(), c9833.m23009(), 0, c18724.m42714(), z).m54217(c18724, c9833, this);
            synchronized (this.f51234) {
                this.f51231 = interfaceC20563M54217;
            }
            return interfaceC20563M54217;
        } catch (IOException e) {
            throw new C8492(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C24585 m38968(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        while (true) {
            C24585 c24585M38967 = m38967(i, i2, i3, i4, z);
            synchronized (this.f51234) {
                if (c24585M38967.f77860 == 0 && !c24585M38967.m54224()) {
                    return c24585M38967;
                }
                if (c24585M38967.m54222(z2)) {
                    return c24585M38967;
                }
                m38978();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C24585 m38967(int i, int i2, int i3, int i4, boolean z) {
        C24585 c24585;
        Socket socketMo23315;
        Socket socketM38966;
        C7325 c7325;
        C7325 c7325M49446;
        C24585 c24586;
        boolean z2;
        boolean z3;
        C21904 c21904;
        synchronized (this.f51234) {
            if (this.f51226) {
                throw new IllegalStateException("released");
            }
            if (this.f51231 != null) {
                throw new IllegalStateException("codec != null");
            }
            if (this.f51232) {
                throw new IOException("Canceled");
            }
            c24585 = this.f51228;
            socketMo23315 = null;
            socketM38966 = (c24585 == null || !c24585.f77851) ? null : m38966(false, false, true);
            C24585 c24587 = this.f51228;
            if (c24587 != null) {
                c24585 = null;
            } else {
                c24587 = null;
            }
            if (!this.f51225) {
                c24585 = null;
            }
            if (c24587 == null) {
                AbstractC10007.f27689.mo23317(this.f51234, this.f51221, this, null);
                c24586 = this.f51228;
                if (c24586 != null) {
                    z2 = true;
                    c7325M49446 = null;
                } else {
                    c7325 = this.f51229;
                }
            } else {
                c7325 = null;
            }
            c7325M49446 = c7325;
            c24586 = c24587;
            z2 = false;
        }
        C21407.m48497(socketM38966);
        if (c24585 != null) {
            this.f51224.getClass();
        }
        if (z2) {
            this.f51224.getClass();
        }
        if (c24586 != null) {
            this.f51229 = this.f51228.m54226();
            return c24586;
        }
        if (c7325M49446 != null || ((c21904 = this.f51222) != null && c21904.m49445())) {
            z3 = false;
        } else {
            this.f51222 = this.f51223.m25800();
            z3 = true;
        }
        synchronized (this.f51234) {
            if (this.f51232) {
                throw new IOException("Canceled");
            }
            if (z3) {
                ArrayList arrayListM49444 = this.f51222.m49444();
                int size = arrayListM49444.size();
                for (int i5 = 0; i5 < size; i5++) {
                    C7325 c7326 = (C7325) arrayListM49444.get(i5);
                    AbstractC10007.f27689.mo23317(this.f51234, this.f51221, this, c7326);
                    C24585 c24588 = this.f51228;
                    if (c24588 != null) {
                        this.f51229 = c7326;
                        z2 = true;
                        c24586 = c24588;
                        break;
                    }
                }
            }
            if (!z2) {
                if (c7325M49446 == null) {
                    c7325M49446 = this.f51222.m49446();
                }
                this.f51229 = c7325M49446;
                this.f51233 = 0;
                c24586 = new C24585(this.f51234, c7325M49446);
                m38973(c24586, false);
            }
        }
        if (z2) {
            this.f51224.getClass();
            return c24586;
        }
        c24586.m54219(i, i2, i3, i4, z, this.f51224);
        AbstractC10007.f27689.mo23316(this.f51234).m25380(c24586.m54226());
        synchronized (this.f51234) {
            this.f51225 = true;
            AbstractC10007.f27689.mo23323(this.f51234, c24586);
            if (c24586.m54224()) {
                socketMo23315 = AbstractC10007.f27689.mo23315(this.f51234, this.f51221, this);
                c24586 = this.f51228;
            }
        }
        C21407.m48497(socketMo23315);
        this.f51224.getClass();
        return c24586;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38974(boolean z, InterfaceC20563 interfaceC20563, IOException iOException) {
        C24585 c24585;
        Socket socketM38966;
        boolean z2;
        this.f51224.getClass();
        synchronized (this.f51234) {
            if (interfaceC20563 != this.f51231) {
                throw new IllegalStateException("expected " + this.f51231 + " but was " + interfaceC20563);
            }
            if (!z) {
                this.f51228.f77860++;
            }
            c24585 = this.f51228;
            socketM38966 = m38966(z, false, true);
            if (this.f51228 != null) {
                c24585 = null;
            }
            z2 = this.f51226;
        }
        C21407.m48497(socketM38966);
        if (c24585 != null) {
            this.f51224.getClass();
        }
        if (iOException != null) {
            AbstractC10007.f27689.mo23314(this.f51227, iOException);
            this.f51224.getClass();
        } else if (z2) {
            AbstractC10007.f27689.mo23314(this.f51227, (IOException) null);
            this.f51224.getClass();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC20563 m38975() {
        InterfaceC20563 interfaceC20563;
        synchronized (this.f51234) {
            interfaceC20563 = this.f51231;
        }
        return interfaceC20563;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C7325 m38980() {
        return this.f51229;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m38976() {
        C24585 c24585;
        Socket socketM38966;
        synchronized (this.f51234) {
            c24585 = this.f51228;
            socketM38966 = m38966(false, true, false);
            if (this.f51228 != null) {
                c24585 = null;
            }
        }
        C21407.m48497(socketM38966);
        if (c24585 != null) {
            AbstractC10007.f27689.mo23314(this.f51227, (IOException) null);
            this.f51224.getClass();
            this.f51224.getClass();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m38978() {
        C24585 c24585;
        Socket socketM38966;
        synchronized (this.f51234) {
            c24585 = this.f51228;
            socketM38966 = m38966(true, false, false);
            if (this.f51228 != null) {
                c24585 = null;
            }
        }
        C21407.m48497(socketM38966);
        if (c24585 != null) {
            this.f51224.getClass();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX INFO: renamed from: ֫ */
    private Socket m38966(boolean z, boolean z2, boolean z3) {
        Socket socketM54225;
        if (z3) {
            this.f51231 = null;
        }
        if (z2) {
            this.f51226 = true;
        }
        C24585 c24585 = this.f51228;
        if (c24585 != null) {
            if (z) {
                c24585.f77851 = true;
            }
            if (this.f51231 == null && (this.f51226 || c24585.f77851)) {
                ArrayList arrayList = c24585.f77857;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (((Reference) arrayList.get(i)).get() == this) {
                        arrayList.remove(i);
                        if (this.f51228.f77857.isEmpty()) {
                            this.f51228.f77862 = System.nanoTime();
                            if (AbstractC10007.f27689.mo23322(this.f51234, this.f51228)) {
                                socketM54225 = this.f51228.m54225();
                            } else {
                                socketM54225 = null;
                            }
                        } else {
                            socketM54225 = null;
                        }
                        this.f51228 = null;
                        return socketM54225;
                    }
                }
                throw new IllegalStateException();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38971() {
        InterfaceC20563 interfaceC20563;
        C24585 c24585;
        synchronized (this.f51234) {
            this.f51232 = true;
            interfaceC20563 = this.f51231;
            c24585 = this.f51228;
        }
        if (interfaceC20563 != null) {
            interfaceC20563.cancel();
        } else if (c24585 != null) {
            c24585.m54218();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0046  */
    /* JADX INFO: renamed from: ֫ */
    public final void m38972(IOException iOException) {
        C24585 c24585;
        boolean z;
        Socket socketM38966;
        synchronized (this.f51234) {
            c24585 = null;
            if (iOException instanceof C12928) {
                EnumC15197 enumC15197 = ((C12928) iOException).f36345;
                if (enumC15197 == EnumC15197.REFUSED_STREAM) {
                    int i = this.f51233 + 1;
                    this.f51233 = i;
                    if (i > 1) {
                        this.f51229 = null;
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (enumC15197 != EnumC15197.CANCEL) {
                    this.f51229 = null;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                C24585 c24586 = this.f51228;
                if (c24586 == null || (c24586.m54224() && !(iOException instanceof C23915))) {
                    z = false;
                } else {
                    if (this.f51228.f77860 == 0) {
                        C7325 c7325 = this.f51229;
                        if (c7325 != null && iOException != null) {
                            this.f51223.m25798(c7325, iOException);
                        }
                        this.f51229 = null;
                    }
                    z = true;
                }
            }
            C24585 c24587 = this.f51228;
            socketM38966 = m38966(z, false, true);
            if (this.f51228 == null && this.f51225) {
                c24585 = c24587;
            }
        }
        C21407.m48497(socketM38966);
        if (c24585 != null) {
            this.f51224.getClass();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38973(C24585 c24585, boolean z) {
        if (this.f51228 != null) {
            throw new IllegalStateException();
        }
        this.f51228 = c24585;
        this.f51225 = z;
        c24585.f77857.add(new C10504(this, this.f51230));
    }

    /* JADX INFO: renamed from: ֫ */
    public final Socket m38969(C24585 c24585) {
        if (this.f51231 != null || this.f51228.f77857.size() != 1) {
            throw new IllegalStateException();
        }
        Reference reference = (Reference) this.f51228.f77857.get(0);
        Socket socketM38966 = m38966(true, false, false);
        this.f51228 = c24585;
        c24585.f77857.add(reference);
        return socketM38966;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m38979() {
        if (this.f51229 != null) {
            return true;
        }
        C21904 c21904 = this.f51222;
        return (c21904 != null && c21904.m49445()) || this.f51223.m25799();
    }

    public final String toString() {
        C24585 c24585M38977 = m38977();
        return c24585M38977 != null ? c24585M38977.toString() : this.f51221.toString();
    }
}
