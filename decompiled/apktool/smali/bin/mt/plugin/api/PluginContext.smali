.class public interface abstract Lbin/mt/plugin/api/PluginContext;
.super Ljava/lang/Object;
.source "PluginContext.java"


# static fields
.field public static final SDK_VERSION:I = 0x3


# virtual methods
.method public abstract cancelToast()V
.end method

.method public abstract getAssetLocalString(Ljava/lang/String;)Lbin/mt/plugin/api/LocalString;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract getAssetsAsStream(Ljava/lang/String;)Ljava/io/InputStream;
.end method

.method public abstract getClipboardText()Ljava/lang/CharSequence;
.end method

.method public abstract getCountry()Ljava/lang/String;
.end method

.method public abstract getFileLocalString(Ljava/io/File;Ljava/lang/String;)Lbin/mt/plugin/api/LocalString;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract getFilesDir()Ljava/io/File;
.end method

.method public abstract getHostPackageName()Ljava/lang/String;
.end method

.method public abstract getHostVersionCode()I
.end method

.method public abstract getHostVersionName()Ljava/lang/String;
.end method

.method public abstract getLanguage()Ljava/lang/String;
.end method

.method public abstract getLanguageCountry()Ljava/lang/String;
.end method

.method public abstract getLanguageNameLocalString()Lbin/mt/plugin/api/LocalString;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract getLocalString()Lbin/mt/plugin/api/LocalString;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract getPluginId()Ljava/lang/String;
.end method

.method public abstract getPluginName()Ljava/lang/String;
.end method

.method public abstract getPluginSdkVersion()I
.end method

.method public abstract getPluginVersionCode()I
.end method

.method public abstract getPluginVersionName()Ljava/lang/String;
.end method

.method public abstract getPreferences()Landroid/content/SharedPreferences;
.end method

.method public abstract getString(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public varargs abstract getString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
.end method

.method public varargs abstract getStringArray([Ljava/lang/String;)[Ljava/lang/String;
.end method

.method public varargs abstract getStringList([Ljava/lang/String;)Ljava/util/List;
.end method

.method public abstract getStringNullable(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract hasClipboardText()Z
.end method

.method public abstract log(Ljava/lang/String;)V
.end method

.method public abstract log(Ljava/lang/String;Ljava/lang/Throwable;)V
.end method

.method public abstract log(Ljava/lang/Throwable;)V
.end method

.method public abstract openBrowser(Ljava/lang/String;)V
.end method

.method public abstract openBuiltinBrowser(Ljava/lang/String;Z)V
.end method

.method public abstract openLogViewer()V
.end method

.method public abstract openPreference(Ljava/lang/Class;)V
.end method

.method public abstract setClipboardText(Ljava/lang/CharSequence;)Z
.end method

.method public abstract setClipboardText(Ljava/lang/CharSequence;Ljava/lang/String;)Z
.end method

.method public abstract showToast(Ljava/lang/CharSequence;)V
.end method

.method public varargs abstract showToast(Ljava/lang/CharSequence;[Ljava/lang/Object;)V
.end method

.method public abstract showToastL(Ljava/lang/CharSequence;)V
.end method

.method public varargs abstract showToastL(Ljava/lang/CharSequence;[Ljava/lang/Object;)V
.end method
