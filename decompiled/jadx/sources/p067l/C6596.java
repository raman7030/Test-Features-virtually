package p067l;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۙۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A9ZK */
/* JADX INFO: loaded from: classes2.dex */
public final class C6596 {

    /* JADX INFO: renamed from: ֫ */
    public static final InterfaceC4410 f17022 = C13128.m30022(C6596.class);

    /* JADX INFO: renamed from: ֫ */
    public static C17617 m15077(InterfaceC20106 interfaceC20106, InterfaceC8035 interfaceC8035, InterfaceC6024 interfaceC6024, String str) throws C11584 {
        C19218 c19218 = (C19218) interfaceC8035;
        String strM43773 = c19218.m43773();
        int iM43771 = c19218.m43771();
        if (iM43771 != 445) {
            strM43773 = strM43773 + ":" + iM43771;
        }
        String strM25286 = C10965.m25286(C5633.m12525("ncacn_np:", strM43773, "[endpoint=", str, ",address="), interfaceC6024.mo3408(), "]");
        int i = C17617.f52650;
        if (strM25286.startsWith("ncacn_np:")) {
            return new C17617(strM25286, interfaceC20106);
        }
        throw new C11584("DCERPC transport not supported: ".concat(strM25286));
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC15983[] m15078(InterfaceC20106 interfaceC20106, InterfaceC8035 interfaceC8035, InterfaceC6024 interfaceC6024) throws C11584 {
        C17617 c17617M15077 = m15077(interfaceC20106, interfaceC8035, interfaceC6024, "\\PIPE\\netdfs");
        try {
            C6219 c6219 = new C6219(((C19218) interfaceC8035).m43773());
            c17617M15077.m40144(c6219);
            if (c6219.f15687 == 0) {
                C7560 c7560 = (C7560) c6219.f15683.f7166;
                C18368[] c18368Arr = new C18368[c7560.f19832];
                for (int i = 0; i < c7560.f19832; i++) {
                    c18368Arr[i] = new C18368(c7560.f19833[i].f50129);
                }
                c17617M15077.close();
                return c18368Arr;
            }
            throw new C5255(c6219.f15687, true);
        } catch (Throwable th) {
            try {
                c17617M15077.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static InterfaceC15983[] m15079(InterfaceC20106 interfaceC20106, InterfaceC8035 interfaceC8035, InterfaceC6024 interfaceC6024) throws C11584 {
        C17617 c17617M15077 = m15077(interfaceC20106, interfaceC8035, interfaceC6024, "\\PIPE\\srvsvc");
        try {
            C20972 c20972 = new C20972(((C19218) interfaceC8035).m43773());
            c17617M15077.m40144(c20972);
            if (c20972.f72277 != 0) {
                throw new C5255(c20972.f72277, true);
            }
            InterfaceC15983[] interfaceC15983ArrM47315 = c20972.m47315();
            c17617M15077.close();
            return interfaceC15983ArrM47315;
        } catch (Throwable th) {
            try {
                c17617M15077.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC7365 m15076(C14642 c14642) throws C20777 {
        InterfaceC15983[] interfaceC15983ArrM43252;
        C19218 c19218 = c14642.f41801;
        boolean zIsEmpty = c19218.m43768().getHost().isEmpty();
        InterfaceC4410 interfaceC4410 = f17022;
        if (zIsEmpty) {
            try {
                String strMo3408 = c19218.m43761().mo3408();
                if (strMo3408 != null) {
                    try {
                        if (strMo3408.length() != 0) {
                            C14642 c14643 = new C14642(c14642, strMo3408);
                            try {
                                C5807 c5807M33461 = c14643.m33461();
                                try {
                                    if (!c5807M33461.m13076()) {
                                        C11291 c11291 = new C11291(c14642, new C22020(c14642, c5807M33461));
                                        c5807M33461.close();
                                        c14643.close();
                                        return c11291;
                                    }
                                    throw new C2453();
                                } catch (Throwable th) {
                                    if (c5807M33461 != null) {
                                        try {
                                            c5807M33461.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                try {
                                    c14643.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        }
                    } catch (MalformedURLException | UnknownHostException e) {
                        throw new C5255("Failed to resolve child element", e);
                    }
                }
                throw new C5255("Name must not be empty");
            } catch (C20777 e2) {
                if (e2.getCause() instanceof UnknownHostException) {
                    interfaceC4410.mo9176("Failed to find master browser", (Exception) e2);
                    throw new C2453();
                }
                throw e2;
            }
        }
        if (c19218.m43766() == 2) {
            C5807 c5807M33462 = c14642.m33461();
            try {
                if (!c5807M33462.m13076()) {
                    C11291 c11292 = new C11291(c14642, new C22020(c14642, c5807M33462));
                    c5807M33462.close();
                    return c11292;
                }
                throw new C2453();
            } catch (Throwable th5) {
                if (c5807M33462 != null) {
                    try {
                        c5807M33462.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                }
                throw th5;
            }
        }
        if (c19218.m43769() == null && c19218.m43775().length() <= 1) {
            C19218 c19218Clone = c19218.clone();
            InterfaceC20106 context = c14642.getContext();
            URL urlM43768 = c19218Clone.m43768();
            if (urlM43768.getPath().lastIndexOf(47) != urlM43768.getPath().length() - 1) {
                throw new C5255(urlM43768.toString() + " directory must end with '/'");
            }
            if (c19218Clone.m43766() != 4) {
                throw new C5255("The requested list operations is invalid: " + urlM43768.toString());
            }
            HashSet hashSet = new HashSet();
            if (((C15174) context.mo29603()).m34599(c19218Clone.m43773(), context)) {
                try {
                    for (InterfaceC15983 interfaceC15983 : m15078(context, c19218Clone, c19218Clone.m43761())) {
                        if (!hashSet.contains(interfaceC15983)) {
                            hashSet.add(interfaceC15983);
                        }
                    }
                } catch (IOException e3) {
                    interfaceC4410.mo9176("DS enumeration failed", (Exception) e3);
                }
            }
            int i = C4466.f10034;
            context.mo29602().getClass();
            try {
                C5807 c5807M9412 = new C4466(context).m9412(c19218Clone, c19218Clone.m43772());
                try {
                    C24582 c24582M13074 = c5807M9412.m13074();
                    try {
                        C21901 c21901M54201 = c24582M13074.m54201();
                        try {
                            try {
                                interfaceC15983ArrM43252 = m15079(context, c19218Clone, c21901M54201.m49433());
                            } catch (IOException e4) {
                                if (c5807M9412.m13076()) {
                                    throw e4;
                                }
                                interfaceC4410.mo9176("doMsrpcShareEnum failed", (Exception) e4);
                                C4287 c4287 = new C4287(c5807M9412.m13070());
                                C13005 c13005 = new C13005(c5807M9412.m13070());
                                c5807M9412.m13063(c4287, c13005, new EnumC2572[0]);
                                if (c13005.m43253() != 0) {
                                    throw new C5255(c13005.m43253(), true);
                                }
                                interfaceC15983ArrM43252 = c13005.m43252();
                            }
                            for (InterfaceC15983 interfaceC15984 : interfaceC15983ArrM43252) {
                                if (!hashSet.contains(interfaceC15984)) {
                                    hashSet.add(interfaceC15984);
                                }
                            }
                            c21901M54201.m21114();
                            c24582M13074.m54210();
                            c5807M9412.close();
                            return new C22690(c14642, hashSet.iterator());
                        } catch (Throwable th7) {
                            try {
                                c21901M54201.m21114();
                            } catch (Throwable th8) {
                                th7.addSuppressed(th8);
                            }
                            throw th7;
                        }
                    } catch (Throwable th9) {
                        if (c24582M13074 != null) {
                            try {
                                c24582M13074.m54210();
                            } catch (Throwable th10) {
                                th9.addSuppressed(th10);
                            }
                        }
                        throw th9;
                    }
                } catch (Throwable th11) {
                    try {
                        c5807M9412.close();
                    } catch (Throwable th12) {
                        th11.addSuppressed(th12);
                    }
                    throw th11;
                }
            } catch (C5255 e5) {
                throw e5;
            } catch (IOException e6) {
                interfaceC4410.mo9176("doNetShareEnum failed", (Exception) e6);
                throw new C5255(urlM43768.toString(), e6);
            }
        }
        C5807 c5807M33463 = c14642.m33461();
        try {
            if (c5807M33463.m13076()) {
                C3914 c3914 = new C3914(c14642, new C17995(c14642, c5807M33463));
                c5807M33463.close();
                return c3914;
            }
            C3914 c3915 = new C3914(c14642, new C12632(c14642, c5807M33463));
            c5807M33463.close();
            return c3915;
        } catch (Throwable th13) {
            if (c5807M33463 != null) {
                try {
                    c5807M33463.close();
                } catch (Throwable th14) {
                    th13.addSuppressed(th14);
                }
            }
            throw th13;
        }
    }
}
