package org.bouncycastle.util.test;

import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.bouncycastle.util.Strings;
import p067l.C10965;
import p067l.C5410;
import p067l.C7470;

/* JADX INFO: loaded from: classes2.dex */
public class SimpleTestResult implements TestResult {
    public static final String SEPARATOR = Strings.lineSeparator();
    public Throwable exception;
    public String message;
    public boolean success;

    public SimpleTestResult(boolean z, String str) {
        this.success = z;
        this.message = str;
    }

    public SimpleTestResult(boolean z, String str, Throwable th) {
        this.success = z;
        this.message = str;
        this.exception = th;
    }

    public static TestResult failed(Test test, String str) {
        return new SimpleTestResult(false, test.getName() + ": " + str);
    }

    public static TestResult failed(Test test, String str, Object obj, Object obj2) {
        StringBuilder sbM17248 = C7470.m17248(str);
        String str2 = SEPARATOR;
        sbM17248.append(str2);
        sbM17248.append("Expected: ");
        sbM17248.append(obj);
        sbM17248.append(str2);
        sbM17248.append("Found   : ");
        sbM17248.append(obj2);
        return failed(test, sbM17248.toString());
    }

    public static TestResult failed(Test test, String str, Throwable th) {
        return new SimpleTestResult(false, test.getName() + ": " + str, th);
    }

    public static String failedMessage(String str, String str2, String str3, String str4) {
        StringBuilder sbM11879 = C5410.m11879(str, " failing ", str2);
        String str5 = SEPARATOR;
        ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sbM11879, str5, "    expected: ", str3, str5);
        return C10965.m25286(sbM11879, "    got     : ", str4);
    }

    public static TestResult successful(Test test, String str) {
        return new SimpleTestResult(true, test.getName() + ": " + str);
    }

    @Override // org.bouncycastle.util.test.TestResult
    public Throwable getException() {
        return this.exception;
    }

    @Override // org.bouncycastle.util.test.TestResult
    public boolean isSuccessful() {
        return this.success;
    }

    @Override // org.bouncycastle.util.test.TestResult
    public String toString() {
        return this.message;
    }
}
