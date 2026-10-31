.class public Lorg/bouncycastle/i18n/MissingEntryException;
.super Ljava/lang/RuntimeException;


# instance fields
.field public debugMsg:Ljava/lang/String;

.field public final key:Ljava/lang/String;

.field public final loader:Ljava/lang/ClassLoader;

.field public final locale:Ljava/util/Locale;

.field public final resource:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/ClassLoader;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lorg/bouncycastle/i18n/MissingEntryException;->resource:Ljava/lang/String;

    iput-object p3, p0, Lorg/bouncycastle/i18n/MissingEntryException;->key:Ljava/lang/String;

    iput-object p4, p0, Lorg/bouncycastle/i18n/MissingEntryException;->locale:Ljava/util/Locale;

    iput-object p5, p0, Lorg/bouncycastle/i18n/MissingEntryException;->loader:Ljava/lang/ClassLoader;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/ClassLoader;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-object p3, p0, Lorg/bouncycastle/i18n/MissingEntryException;->resource:Ljava/lang/String;

    iput-object p4, p0, Lorg/bouncycastle/i18n/MissingEntryException;->key:Ljava/lang/String;

    iput-object p5, p0, Lorg/bouncycastle/i18n/MissingEntryException;->locale:Ljava/util/Locale;

    iput-object p6, p0, Lorg/bouncycastle/i18n/MissingEntryException;->loader:Ljava/lang/ClassLoader;

    return-void
.end method


# virtual methods
.method public getClassLoader()Ljava/lang/ClassLoader;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/i18n/MissingEntryException;->loader:Ljava/lang/ClassLoader;

    return-object v0
.end method

.method public getDebugMsg()Ljava/lang/String;
    .locals 4

    .line 2
    iget-object v0, p0, Lorg/bouncycastle/i18n/MissingEntryException;->debugMsg:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Can not find entry "

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    iget-object v1, p0, Lorg/bouncycastle/i18n/MissingEntryException;->key:Ljava/lang/String;

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " in resource file "

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    iget-object v1, p0, Lorg/bouncycastle/i18n/MissingEntryException;->resource:Ljava/lang/String;

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " for the locale "

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    iget-object v1, p0, Lorg/bouncycastle/i18n/MissingEntryException;->locale:Ljava/util/Locale;

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "."

    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 47
    iput-object v0, p0, Lorg/bouncycastle/i18n/MissingEntryException;->debugMsg:Ljava/lang/String;

    .line 49
    iget-object v0, p0, Lorg/bouncycastle/i18n/MissingEntryException;->loader:Ljava/lang/ClassLoader;

    .line 51
    instance-of v1, v0, Ljava/net/URLClassLoader;

    if-eqz v1, :cond_0

    .line 55
    check-cast v0, Ljava/net/URLClassLoader;

    .line 58
    invoke-virtual {v0}, Ljava/net/URLClassLoader;->getURLs()[Ljava/net/URL;

    move-result-object v0

    .line 61
    new-instance v1, Ljava/lang/StringBuilder;

    .line 64
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    iget-object v2, p0, Lorg/bouncycastle/i18n/MissingEntryException;->debugMsg:Ljava/lang/String;

    const-string v3, " The following entries in the classpath were searched: "

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lorg/bouncycastle/i18n/MissingEntryException;->debugMsg:Ljava/lang/String;

    const/4 v1, 0x0

    :goto_0
    array-length v2, v0

    if-eq v1, v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lorg/bouncycastle/i18n/MissingEntryException;->debugMsg:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v3, v0, v1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lorg/bouncycastle/i18n/MissingEntryException;->debugMsg:Ljava/lang/String;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/i18n/MissingEntryException;->debugMsg:Ljava/lang/String;

    return-object v0
.end method

.method public getKey()Ljava/lang/String;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/i18n/MissingEntryException;->key:Ljava/lang/String;

    return-object v0
.end method

.method public getLocale()Ljava/util/Locale;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/i18n/MissingEntryException;->locale:Ljava/util/Locale;

    return-object v0
.end method

.method public getResource()Ljava/lang/String;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/i18n/MissingEntryException;->resource:Ljava/lang/String;

    return-object v0
.end method
