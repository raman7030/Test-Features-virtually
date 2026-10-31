.class public final Ll/ܽ۬ۚ;
.super Ljava/lang/Object;
.source "K7EM"

# interfaces
.implements Ll/᩻۬ۚ;


# instance fields
.field public ֫:Ll/ۧ۬ۚ;

.field public ۧ:Z

.field public final ܽ:Ljava/lang/String;

.field public ᩳ:Ljava/security/MessageDigest;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 43
    iput-boolean v0, p0, Ll/ܽ۬ۚ;->ۧ:Z

    const/4 v0, 0x0

    .line 45
    iput-object v0, p0, Ll/ܽ۬ۚ;->ᩳ:Ljava/security/MessageDigest;

    .line 46
    iput-object v0, p0, Ll/ܽ۬ۚ;->֫:Ll/ۧ۬ۚ;

    .line 49
    iput-object p1, p0, Ll/ܽ۬ۚ;->ܽ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Ll/ܽ۬ۚ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final getSize()I
    .locals 1

    .line 73
    iget-object v0, p0, Ll/ܽ۬ۚ;->֫:Ll/ۧ۬ۚ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۧ۬ۚ;->size()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Ll/ܽ۬ۚ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ll/ܽ۫ᩴ;)Ljava/io/DataInputStream;
    .locals 4

    .line 79
    iget-object v0, p0, Ll/ܽ۬ۚ;->ܽ:Ljava/lang/String;

    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    .line 80
    iget-boolean v2, p0, Ll/ܽ۬ۚ;->ۧ:Z

    if-eqz v2, :cond_0

    .line 81
    new-instance v2, Ll/ۧ۬ۚ;

    invoke-direct {v2, v1}, Ll/ۧ۬ۚ;-><init>(Ljava/io/FileInputStream;)V

    iput-object v2, p0, Ll/ܽ۬ۚ;->֫:Ll/ۧ۬ۚ;

    const-string v1, "SHA-256"

    .line 82
    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v1

    iput-object v1, p0, Ll/ܽ۬ۚ;->ᩳ:Ljava/security/MessageDigest;

    .line 83
    new-instance v1, Ljava/security/DigestInputStream;

    iget-object v2, p0, Ll/ܽ۬ۚ;->֫:Ll/ۧ۬ۚ;

    iget-object v3, p0, Ll/ܽ۬ۚ;->ᩳ:Ljava/security/MessageDigest;

    invoke-direct {v1, v2, v3}, Ljava/security/DigestInputStream;-><init>(Ljava/io/InputStream;Ljava/security/MessageDigest;)V

    .line 84
    new-instance v2, Ljava/io/DataInputStream;

    invoke-direct {v2, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    return-object v2

    .line 86
    :cond_0
    new-instance v2, Ljava/io/DataInputStream;

    invoke-direct {v2, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    move-exception p1

    .line 106
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception v1

    const-string v2, "^[A-Za-z]+:.*"

    .line 89
    invoke-virtual {v0, v2}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v1, 0x0

    .line 91
    :try_start_1
    new-instance v2, Ljava/net/URI;

    invoke-direct {v2, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 92
    invoke-virtual {v2}, Ljava/net/URI;->toURL()Ljava/net/URL;

    move-result-object v2

    .line 93
    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v2

    .line 94
    invoke-virtual {v2, v1}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 95
    new-instance v3, Ljava/io/DataInputStream;

    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/net/URISyntaxException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    return-object v3

    :catch_2
    move-exception v2

    goto :goto_0

    :catch_3
    move-exception v2

    .line 97
    :goto_0
    invoke-virtual {p1}, Ll/ܽ۫ᩴ;->isPresent()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 98
    invoke-virtual {p1}, Ll/ܽ۫ᩴ;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩶ۗۚ;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, v1

    const-string v0, "Cannot read {0}"

    invoke-virtual {p1, v0, v3}, Ll/᩶ۗۚ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    :cond_1
    throw v2

    .line 103
    :cond_2
    throw v1
.end method

.method public final ֫()Ljava/util/Collection;
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 58
    iget-object v1, p0, Ll/ܽ۬ۚ;->ܽ:Ljava/lang/String;

    invoke-static {v1, v0}, Ll/ۡ۠ᩴ;->get(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ܿ۠ᩴ;->readAllLines(Ll/᩷۠ᩴ;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Z)Ll/᩻۬ۚ;
    .locals 0

    .line 62
    iput-boolean p1, p0, Ll/ܽ۬ۚ;->ۧ:Z

    return-object p0
.end method

.method public final ۧ()Ljava/security/MessageDigest;
    .locals 1

    .line 68
    iget-object v0, p0, Ll/ܽ۬ۚ;->ᩳ:Ljava/security/MessageDigest;

    return-object v0
.end method
