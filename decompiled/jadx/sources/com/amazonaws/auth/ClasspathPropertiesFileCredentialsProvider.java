package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import p067l.C10965;
import p067l.C6988;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ClasspathPropertiesFileCredentialsProvider implements AWSCredentialsProvider {

    /* JADX INFO: renamed from: ֫ */
    public final String f1309 = "/".concat("AwsCredentials.properties");

    @Override // com.amazonaws.auth.AWSCredentialsProvider
    /* JADX INFO: renamed from: ֫ */
    public final AWSCredentials mo1374() {
        Class<?> cls = getClass();
        String str = this.f1309;
        InputStream resourceAsStream = cls.getResourceAsStream(str);
        if (resourceAsStream == null) {
            throw new AmazonClientException(C6988.m16053("Unable to load AWS credentials from the ", str, " file on the classpath"));
        }
        try {
            return new PropertiesCredentials(resourceAsStream);
        } catch (IOException e) {
            throw new AmazonClientException(C6988.m16053("Unable to load AWS credentials from the ", str, " file on the classpath"), e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
        return C10965.m25286(sb, this.f1309, MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
