package net.engio.mbassy.bus.config;

import p067l.C22934;

/* JADX INFO: loaded from: classes.dex */
public class ConfigurationError extends RuntimeException {
    public String message;

    public ConfigurationError(String str) {
        this.message = str;
    }

    public static ConfigurationError MissingFeature(Class cls) {
        return new ConfigurationError(C22934.m51253(cls, "The expected feature ", " was missing. Use addFeature() in IBusConfiguration to add features."));
    }

    @Override // java.lang.Throwable
    public String toString() {
        return this.message;
    }
}
