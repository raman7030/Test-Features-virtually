package p067l;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: renamed from: l.ۤᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: C42E */
/* JADX INFO: loaded from: classes3.dex */
public final class C12324 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m28398(URL[] urlArr) {
        for (URL url : urlArr) {
            try {
                if (m28397(new URL(url, "META-INF/services/" + InterfaceC23133.class.getName()))) {
                    return true;
                }
            } catch (MalformedURLException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m28395(String str) {
        throw new C14335(InterfaceC23133.class.getName() + ": " + str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m28396(URL url, String str) {
        m28395(url + ":1: " + str);
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m28397(URL url) throws Throwable {
        InputStream inputStreamOpenStream;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        String strTrim;
        int length;
        try {
            try {
                inputStreamOpenStream = url.openStream();
                try {
                    bufferedReader2 = new BufferedReader(new InputStreamReader(inputStreamOpenStream, "utf-8"));
                    do {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                try {
                                    bufferedReader2.close();
                                    if (inputStreamOpenStream != null) {
                                        try {
                                            inputStreamOpenStream.close();
                                            return false;
                                        } catch (IOException e) {
                                            m28395(C17588.m40052(": ", e));
                                            throw null;
                                        }
                                    }
                                    return false;
                                } catch (IOException e2) {
                                    m28395(C17588.m40052(": ", e2));
                                    throw null;
                                }
                            }
                            int iIndexOf = line.indexOf(35);
                            if (iIndexOf >= 0) {
                                line = line.substring(0, iIndexOf);
                            }
                            strTrim = line.trim();
                            length = strTrim.length();
                        } catch (FileNotFoundException unused) {
                            if (bufferedReader2 != null) {
                                try {
                                    bufferedReader2.close();
                                } catch (IOException e3) {
                                    m28395(C17588.m40052(": ", e3));
                                    throw null;
                                }
                            }
                            if (inputStreamOpenStream != null) {
                                try {
                                    inputStreamOpenStream.close();
                                } catch (IOException e4) {
                                    m28395(C17588.m40052(": ", e4));
                                    throw null;
                                }
                            }
                        } catch (IOException e5) {
                            e = e5;
                            m28395(": " + e);
                            throw null;
                        }
                    } while (length == 0);
                    if (strTrim.indexOf(32) >= 0 || strTrim.indexOf(9) >= 0) {
                        m28396(url, "Illegal configuration-file syntax");
                        throw null;
                    }
                    int iCodePointAt = strTrim.codePointAt(0);
                    if (!Character.isJavaIdentifierStart(iCodePointAt)) {
                        m28396(url, "Illegal provider-class name: " + strTrim);
                        throw null;
                    }
                    int iCharCount = Character.charCount(iCodePointAt);
                    while (iCharCount < length) {
                        int iCodePointAt2 = strTrim.codePointAt(iCharCount);
                        if (!Character.isJavaIdentifierPart(iCodePointAt2) && iCodePointAt2 != 46) {
                            m28396(url, "Illegal provider-class name: " + strTrim);
                            throw null;
                        }
                        iCharCount += Character.charCount(iCodePointAt2);
                    }
                    try {
                        bufferedReader2.close();
                        if (inputStreamOpenStream == null) {
                            return true;
                        }
                        try {
                            inputStreamOpenStream.close();
                            return true;
                        } catch (IOException e6) {
                            m28395(C17588.m40052(": ", e6));
                            throw null;
                        }
                    } catch (IOException e7) {
                        m28395(C17588.m40052(": ", e7));
                        throw null;
                    }
                } catch (FileNotFoundException unused2) {
                    bufferedReader2 = null;
                } catch (IOException e8) {
                    e = e8;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = null;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e9) {
                            m28395(C17588.m40052(": ", e9));
                            throw null;
                        }
                    }
                    if (inputStreamOpenStream != null) {
                        try {
                            inputStreamOpenStream.close();
                        } catch (IOException e10) {
                            m28395(C17588.m40052(": ", e10));
                            throw null;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException unused3) {
            inputStreamOpenStream = null;
            bufferedReader2 = null;
        } catch (IOException e11) {
            e = e11;
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpenStream = null;
            bufferedReader = null;
        }
    }
}
