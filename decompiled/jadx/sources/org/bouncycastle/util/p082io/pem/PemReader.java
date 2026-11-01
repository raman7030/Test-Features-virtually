package org.bouncycastle.util.p082io.pem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.util.encoders.Base64;
import p067l.C17588;
import p067l.C6988;
import p067l.C7147;
import p067l.InterfaceC19157;
import p067l.InterfaceC20559;

/* JADX INFO: loaded from: classes2.dex */
public class PemReader extends BufferedReader implements InterfaceC20559 {
    public static final String BEGIN = "-----BEGIN ";
    public static final String END = "-----END ";
    public static final String LAX_PEM_PARSING_SYSTEM_PROPERTY_NAME = "org.bouncycastle.pemreader.lax";
    public static final Logger LOG = Logger.getLogger(PemReader.class.getName());

    public PemReader(Reader reader) {
        super(reader);
    }

    private PemObject loadObject(String str) throws IOException {
        String line;
        String strM16053 = C6988.m16053(END, str, "-----");
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList();
        while (true) {
            line = readLine();
            if (line == null) {
                break;
            }
            int iIndexOf = line.indexOf(58);
            if (iIndexOf >= 0) {
                arrayList.add(new PemHeader(line.substring(0, iIndexOf), line.substring(iIndexOf + 1).trim()));
            } else {
                if (System.getProperty(LAX_PEM_PARSING_SYSTEM_PROPERTY_NAME, "false").equalsIgnoreCase("true")) {
                    String strTrim = line.trim();
                    if (!strTrim.equals(line)) {
                        Logger logger = LOG;
                        Level level = Level.WARNING;
                        if (logger.isLoggable(level)) {
                            logger.log(level, "PEM object contains whitespaces on -----END line", (Throwable) new Exception("trace"));
                        }
                    }
                    line = strTrim;
                }
                if (line.indexOf(strM16053) == 0) {
                    break;
                }
                stringBuffer.append(line.trim());
            }
        }
        if (line != null) {
            return new PemObject(str, arrayList, Base64.decode(stringBuffer.toString()));
        }
        throw new IOException(C17588.m40053(strM16053, " not found"));
    }

    @Override // java.io.BufferedReader, p067l.InterfaceC20559
    public /* synthetic */ InterfaceC19157 lines() {
        return C7147.lines(this);
    }

    public PemObject readPemObject() throws IOException {
        String line;
        String strTrim;
        int iIndexOf;
        do {
            line = readLine();
            if (line == null) {
                break;
            }
        } while (!line.startsWith(BEGIN));
        if (line == null || (iIndexOf = (strTrim = line.substring(11).trim()).indexOf(45)) <= 0 || !strTrim.endsWith("-----") || strTrim.length() - iIndexOf != 5) {
            return null;
        }
        return loadObject(strTrim.substring(0, iIndexOf));
    }
}
