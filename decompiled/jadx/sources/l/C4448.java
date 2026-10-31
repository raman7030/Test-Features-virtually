package l;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۙۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A9ZK */
/* JADX INFO: loaded from: classes2.dex */
public final class C4448 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f14198 = C11321.m27961(C4448.class);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16044 m13196(InterfaceC18663 interfaceC18663, InterfaceC5962 interfaceC5962, InterfaceC3846 interfaceC3846, String str) throws C9696 {
        C17729 c17729 = (C17729) interfaceC5962;
        String strM41527 = c17729.m41527();
        int iM41525 = c17729.m41525();
        if (iM41525 != 445) {
            strM41527 = strM41527 + ":" + iM41525;
        }
        String strM23341 = C9045.m23341(C3435.m10501("ncacn_np:", strM41527, "[endpoint=", str, ",address="), interfaceC3846.mo1012(), "]");
        int i = C16044.f49486;
        if (strM23341.startsWith("ncacn_np:")) {
            return new C16044(strM23341, interfaceC18663);
        }
        throw new C9696("DCERPC transport not supported: ".concat(strM23341));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC14325[] m13197(InterfaceC18663 interfaceC18663, InterfaceC5962 interfaceC5962, InterfaceC3846 interfaceC3846) throws C9696 {
        C16044 c16044M13196 = m13196(interfaceC18663, interfaceC5962, interfaceC3846, "\\PIPE\\netdfs");
        try {
            C4051 c4051 = new C4051(((C17729) interfaceC5962).m41527());
            c16044M13196.m37957(c4051);
            if (c4051.f12873 == 0) {
                C5462 c5462 = (C5462) c4051.f12869.f4396;
                C16834[] c16834Arr = new C16834[c5462.f16991];
                for (int i = 0; i < c5462.f16991; i++) {
                    c16834Arr[i] = new C16834(c5462.f16992[i].f47004);
                }
                c16044M13196.close();
                return c16834Arr;
            }
            throw new C3037(c4051.f12873, true);
        } catch (Throwable th) {
            try {
                c16044M13196.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC14325[] m13198(InterfaceC18663 interfaceC18663, InterfaceC5962 interfaceC5962, InterfaceC3846 interfaceC3846) throws C9696 {
        C16044 c16044M13196 = m13196(interfaceC18663, interfaceC5962, interfaceC3846, "\\PIPE\\srvsvc");
        try {
            C19574 c19574 = new C19574(((C17729) interfaceC5962).m41527());
            c16044M13196.m37957(c19574);
            if (c19574.f69572 != 0) {
                throw new C3037(c19574.f69572, true);
            }
            InterfaceC14325[] interfaceC14325ArrM45020 = c19574.m45020();
            c16044M13196.close();
            return interfaceC14325ArrM45020;
        } catch (Throwable th) {
            try {
                c16044M13196.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC5257 m13195(C12914 c12914) throws C19369 {
        InterfaceC14325[] interfaceC14325ArrM41007;
        C17729 c17729 = c12914.f38759;
        boolean zIsEmpty = c17729.m41522().getHost().isEmpty();
        InterfaceC2148 interfaceC2148 = f14198;
        if (zIsEmpty) {
            try {
                String strMo1012 = c17729.m41515().mo1012();
                if (strMo1012 != null) {
                    try {
                        if (strMo1012.length() != 0) {
                            C12914 c12915 = new C12914(c12914, strMo1012);
                            try {
                                C3618 c3618M31375 = c12915.m31375();
                                try {
                                    if (!c3618M31375.m11100()) {
                                        C9388 c9388 = new C9388(c12914, new C20677(c12914, c3618M31375));
                                        c3618M31375.close();
                                        c12915.close();
                                        return c9388;
                                    }
                                    throw new C0089();
                                } catch (Throwable th) {
                                    if (c3618M31375 != null) {
                                        try {
                                            c3618M31375.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                try {
                                    c12915.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        }
                    } catch (MalformedURLException | UnknownHostException e) {
                        throw new C3037("Failed to resolve child element", e);
                    }
                }
                throw new C3037("Name must not be empty");
            } catch (C19369 e2) {
                if (e2.getCause() instanceof UnknownHostException) {
                    interfaceC2148.mo7081("Failed to find master browser", (Exception) e2);
                    throw new C0089();
                }
                throw e2;
            }
        }
        if (c17729.m41520() == 2) {
            C3618 c3618M31376 = c12914.m31375();
            try {
                if (!c3618M31376.m11100()) {
                    C9388 c9389 = new C9388(c12914, new C20677(c12914, c3618M31376));
                    c3618M31376.close();
                    return c9389;
                }
                throw new C0089();
            } catch (Throwable th5) {
                if (c3618M31376 != null) {
                    try {
                        c3618M31376.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                }
                throw th5;
            }
        }
        if (c17729.m41523() == null && c17729.m41529().length() <= 1) {
            C17729 c17729Clone = c17729.clone();
            InterfaceC18663 context = c12914.getContext();
            URL urlM41522 = c17729Clone.m41522();
            if (urlM41522.getPath().lastIndexOf(47) != urlM41522.getPath().length() - 1) {
                throw new C3037(urlM41522.toString() + " directory must end with '/'");
            }
            if (c17729Clone.m41520() != 4) {
                throw new C3037("The requested list operations is invalid: " + urlM41522.toString());
            }
            HashSet hashSet = new HashSet();
            if (((C13474) context.mo27541()).m32497(c17729Clone.m41527(), context)) {
                try {
                    for (InterfaceC14325 interfaceC14325 : m13197(context, c17729Clone, c17729Clone.m41515())) {
                        if (!hashSet.contains(interfaceC14325)) {
                            hashSet.add(interfaceC14325);
                        }
                    }
                } catch (IOException e3) {
                    interfaceC2148.mo7081("DS enumeration failed", (Exception) e3);
                }
            }
            int i = C2207.f7246;
            context.mo27540().getClass();
            try {
                C3618 c3618M7329 = new C2207(context).m7329(c17729Clone, c17729Clone.m41526());
                try {
                    C23373 c23373M11098 = c3618M7329.m11098();
                    try {
                        C20552 c20552M51804 = c23373M11098.m51804();
                        try {
                            try {
                                interfaceC14325ArrM41007 = m13198(context, c17729Clone, c20552M51804.m47109());
                            } catch (IOException e4) {
                                if (c3618M7329.m11100()) {
                                    throw e4;
                                }
                                interfaceC2148.mo7081("doMsrpcShareEnum failed", (Exception) e4);
                                C2018 c2018 = new C2018(c3618M7329.m11094());
                                C11191 c11191 = new C11191(c3618M7329.m11094());
                                c3618M7329.m11087(c2018, c11191, new EnumC0214[0]);
                                if (c11191.m41008() != 0) {
                                    throw new C3037(c11191.m41008(), true);
                                }
                                interfaceC14325ArrM41007 = c11191.m41007();
                            }
                            for (InterfaceC14325 interfaceC14326 : interfaceC14325ArrM41007) {
                                if (!hashSet.contains(interfaceC14326)) {
                                    hashSet.add(interfaceC14326);
                                }
                            }
                            c20552M51804.m19171();
                            c23373M11098.m51813();
                            c3618M7329.close();
                            return new C21382(c12914, hashSet.iterator());
                        } catch (Throwable th7) {
                            try {
                                c20552M51804.m19171();
                            } catch (Throwable th8) {
                                th7.addSuppressed(th8);
                            }
                            throw th7;
                        }
                    } catch (Throwable th9) {
                        if (c23373M11098 != null) {
                            try {
                                c23373M11098.m51813();
                            } catch (Throwable th10) {
                                th9.addSuppressed(th10);
                            }
                        }
                        throw th9;
                    }
                } catch (Throwable th11) {
                    try {
                        c3618M7329.close();
                    } catch (Throwable th12) {
                        th11.addSuppressed(th12);
                    }
                    throw th11;
                }
            } catch (C3037 e5) {
                throw e5;
            } catch (IOException e6) {
                interfaceC2148.mo7081("doNetShareEnum failed", (Exception) e6);
                throw new C3037(urlM41522.toString(), e6);
            }
        }
        C3618 c3618M31377 = c12914.m31375();
        try {
            if (c3618M31377.m11100()) {
                C1626 c1626 = new C1626(c12914, new C16442(c12914, c3618M31377));
                c3618M31377.close();
                return c1626;
            }
            C1626 c1627 = new C1626(c12914, new C10799(c12914, c3618M31377));
            c3618M31377.close();
            return c1627;
        } catch (Throwable th13) {
            if (c3618M31377 != null) {
                try {
                    c3618M31377.close();
                } catch (Throwable th14) {
                    th13.addSuppressed(th14);
                }
            }
            throw th13;
        }
    }
}
