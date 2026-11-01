package com.amazonaws.auth;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* JADX INFO: loaded from: classes.dex */
public class PropertiesCredentials implements AWSCredentials {

    /* JADX INFO: renamed from: ֫ */
    public final String f1316;

    /* JADX INFO: renamed from: ۧ */
    public final String f1317;

    public PropertiesCredentials(File file) throws FileNotFoundException {
        if (!file.exists()) {
            throw new FileNotFoundException("File doesn't exist:  " + file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            if (properties.getProperty("accessKey") == null || properties.getProperty("secretKey") == null) {
                throw new IllegalArgumentException("The specified file (" + file.getAbsolutePath() + ") doesn't contain the expected properties 'accessKey' and 'secretKey'.");
            }
            this.f1316 = properties.getProperty("accessKey");
            this.f1317 = properties.getProperty("secretKey");
            try {
                fileInputStream.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    public PropertiesCredentials(InputStream inputStream) {
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
            try {
                inputStream.close();
            } catch (Exception unused) {
            }
            if (properties.getProperty("accessKey") == null || properties.getProperty("secretKey") == null) {
                throw new IllegalArgumentException("The specified properties data doesn't contain the expected properties 'accessKey' and 'secretKey'.");
            }
            this.f1316 = properties.getProperty("accessKey");
            this.f1317 = properties.getProperty("secretKey");
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (Exception unused2) {
            }
            throw th;
        }
    }

    @Override // com.amazonaws.auth.AWSCredentials
    /* JADX INFO: renamed from: ֫ */
    public final String mo1372() {
        return this.f1316;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    /* JADX INFO: renamed from: ܽ */
    public final String mo1373() {
        return this.f1317;
    }
}
