package com.tencent.mm.opensdk.diffdev.a;

import com.tencent.mm.opensdk.utils.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:149:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x01aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x022b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x01f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x01c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x0211 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public static byte[] a(String str) throws Throwable {
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        ?? r3;
        Exception e;
        HttpURLConnection httpURLConnection;
        IOException e2;
        MalformedURLException e3;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        ?? r1 = 0;
        if (str != null) {
            int length = str.length();
            try {
                if (length != 0) {
                    try {
                        httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                        try {
                            if (httpURLConnection == null) {
                                Log.e("MicroMsg.SDK.NetUtil", "open connection failed.");
                                if (httpURLConnection != null) {
                                    try {
                                        httpURLConnection.disconnect();
                                    } catch (Throwable th2) {
                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th2.getMessage());
                                    }
                                }
                                return null;
                            }
                            httpURLConnection.setRequestMethod("GET");
                            httpURLConnection.setConnectTimeout(60000);
                            httpURLConnection.setReadTimeout(60000);
                            if (httpURLConnection.getResponseCode() >= 300) {
                                Log.e("MicroMsg.SDK.NetUtil", "httpURLConnectionGet 300");
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Throwable th3) {
                                    Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th3.getMessage());
                                }
                                return null;
                            }
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byteArrayOutputStream2 = new ByteArrayOutputStream();
                                try {
                                    byte[] bArr = new byte[1024];
                                    while (true) {
                                        int i = inputStream.read(bArr);
                                        if (i == -1) {
                                            break;
                                        }
                                        byteArrayOutputStream2.write(bArr, 0, i);
                                    }
                                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                                    Log.d("MicroMsg.SDK.NetUtil", "httpGet end");
                                    try {
                                        httpURLConnection.disconnect();
                                    } catch (Throwable th4) {
                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th4.getMessage());
                                    }
                                    try {
                                        inputStream.close();
                                    } catch (Throwable th5) {
                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th5.getMessage());
                                    }
                                    try {
                                        byteArrayOutputStream2.close();
                                    } catch (Throwable th6) {
                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th6.getMessage());
                                    }
                                    return byteArray;
                                } catch (MalformedURLException e4) {
                                    e3 = e4;
                                    Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e3.getMessage());
                                    if (httpURLConnection != null) {
                                        try {
                                            httpURLConnection.disconnect();
                                        } catch (Throwable th7) {
                                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th7.getMessage());
                                        }
                                    }
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Throwable th8) {
                                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th8.getMessage());
                                        }
                                    }
                                    if (byteArrayOutputStream2 != null) {
                                        try {
                                            byteArrayOutputStream2.close();
                                        } catch (Throwable th9) {
                                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th9.getMessage());
                                        }
                                    }
                                    return null;
                                } catch (IOException e5) {
                                    e2 = e5;
                                    Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e2.getMessage());
                                    if (httpURLConnection != null) {
                                        try {
                                            httpURLConnection.disconnect();
                                        } catch (Throwable th10) {
                                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th10.getMessage());
                                        }
                                    }
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Throwable th11) {
                                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th11.getMessage());
                                        }
                                    }
                                    if (byteArrayOutputStream2 != null) {
                                        try {
                                            byteArrayOutputStream2.close();
                                        } catch (Throwable th12) {
                                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th12.getMessage());
                                        }
                                    }
                                    return null;
                                } catch (Exception e6) {
                                    e = e6;
                                    Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e.getMessage());
                                    if (httpURLConnection != null) {
                                        try {
                                            httpURLConnection.disconnect();
                                        } catch (Throwable th13) {
                                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th13.getMessage());
                                        }
                                    }
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Throwable th14) {
                                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th14.getMessage());
                                        }
                                    }
                                    if (byteArrayOutputStream2 != null) {
                                        try {
                                            byteArrayOutputStream2.close();
                                        } catch (Throwable th15) {
                                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th15.getMessage());
                                        }
                                    }
                                    return null;
                                }
                            } catch (MalformedURLException e7) {
                                e3 = e7;
                                byteArrayOutputStream2 = null;
                            } catch (IOException e8) {
                                e2 = e8;
                                byteArrayOutputStream2 = null;
                            } catch (Exception e9) {
                                e = e9;
                                byteArrayOutputStream2 = null;
                            } catch (Throwable th16) {
                                r1 = httpURLConnection;
                                th = th16;
                                byteArrayOutputStream = null;
                                r3 = inputStream;
                                if (r1 != 0) {
                                    try {
                                        r1.disconnect();
                                    } catch (Throwable th17) {
                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th17.getMessage());
                                    }
                                }
                                if (r3 != 0) {
                                    try {
                                        r3.close();
                                    } catch (Throwable th18) {
                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th18.getMessage());
                                    }
                                }
                                if (byteArrayOutputStream == null) {
                                    throw th;
                                }
                                try {
                                    byteArrayOutputStream.close();
                                    throw th;
                                } catch (Throwable th19) {
                                    Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th19.getMessage());
                                    throw th;
                                }
                            }
                        } catch (MalformedURLException e10) {
                            e3 = e10;
                            inputStream = null;
                            byteArrayOutputStream2 = null;
                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e3.getMessage());
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (byteArrayOutputStream2 != null) {
                                byteArrayOutputStream2.close();
                            }
                            return null;
                        } catch (IOException e11) {
                            e2 = e11;
                            inputStream = null;
                            byteArrayOutputStream2 = null;
                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e2.getMessage());
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (byteArrayOutputStream2 != null) {
                                byteArrayOutputStream2.close();
                            }
                            return null;
                        } catch (Exception e12) {
                            e = e12;
                            inputStream = null;
                            byteArrayOutputStream2 = null;
                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e.getMessage());
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (byteArrayOutputStream2 != null) {
                                byteArrayOutputStream2.close();
                            }
                            return null;
                        } catch (Throwable th20) {
                            byteArrayOutputStream = null;
                            r1 = httpURLConnection;
                            th = th20;
                            r3 = 0;
                        }
                    } catch (MalformedURLException e13) {
                        e3 = e13;
                        httpURLConnection = null;
                    } catch (IOException e14) {
                        e2 = e14;
                        httpURLConnection = null;
                    } catch (Exception e15) {
                        e = e15;
                        httpURLConnection = null;
                    } catch (Throwable th21) {
                        th = th21;
                        r3 = 0;
                        byteArrayOutputStream = null;
                    }
                }
            } catch (Throwable th22) {
                r1 = str;
                th = th22;
                r3 = length;
            }
        }
        Log.e("MicroMsg.SDK.NetUtil", "httpGet, url is null");
        return null;
    }
}
