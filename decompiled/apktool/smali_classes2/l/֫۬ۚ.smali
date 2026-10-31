.class public Ll/֫۬ۚ;
.super Ljava/lang/Object;
.source "EBHF"

# interfaces
.implements Ll/᩻۬ۚ;


# instance fields
.field public ֫:[B

.field public ۧ:Z

.field public ܽ:Ljava/security/MessageDigest;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 38
    iput-boolean v0, p0, Ll/֫۬ۚ;->ۧ:Z

    const/4 v0, 0x0

    .line 39
    iput-object v0, p0, Ll/֫۬ۚ;->ܽ:Ljava/security/MessageDigest;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 38
    iput-boolean v0, p0, Ll/֫۬ۚ;->ۧ:Z

    const/4 v0, 0x0

    .line 39
    iput-object v0, p0, Ll/֫۬ۚ;->ܽ:Ljava/security/MessageDigest;

    .line 45
    iput-object p1, p0, Ll/֫۬ۚ;->֫:[B

    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "bytes/bytes"

    return-object v0
.end method

.method public final getSize()I
    .locals 1

    .line 67
    iget-object v0, p0, Ll/֫۬ۚ;->֫:[B

    array-length v0, v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 78
    invoke-virtual {p0}, Ll/֫۬ۚ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ܽ۫ᩴ;)Ljava/io/DataInputStream;
    .locals 2

    .line 87
    invoke-virtual {p0}, Ll/֫۬ۚ;->ܽ()V

    .line 89
    :try_start_0
    new-instance p1, Ljava/io/ByteArrayInputStream;

    iget-object v0, p0, Ll/֫۬ۚ;->֫:[B

    invoke-direct {p1, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 90
    iget-boolean v0, p0, Ll/֫۬ۚ;->ۧ:Z

    if-eqz v0, :cond_0

    const-string v0, "SHA-256"

    .line 91
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    iput-object v0, p0, Ll/֫۬ۚ;->ܽ:Ljava/security/MessageDigest;

    .line 92
    new-instance v0, Ljava/security/DigestInputStream;

    iget-object v1, p0, Ll/֫۬ۚ;->ܽ:Ljava/security/MessageDigest;

    invoke-direct {v0, p1, v1}, Ljava/security/DigestInputStream;-><init>(Ljava/io/InputStream;Ljava/security/MessageDigest;)V

    .line 93
    new-instance p1, Ljava/io/DataInputStream;

    invoke-direct {p1, v0}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    return-object p1

    .line 95
    :cond_0
    new-instance v0, Ljava/io/DataInputStream;

    invoke-direct {v0, p1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    .line 98
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final ֫()Ljava/util/Collection;
    .locals 5

    .line 104
    invoke-virtual {p0}, Ll/֫۬ۚ;->ܽ()V

    .line 105
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 106
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/InputStreamReader;

    new-instance v3, Ljava/io/ByteArrayInputStream;

    iget-object v4, p0, Ll/֫۬ۚ;->֫:[B

    invoke-direct {v3, v4}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    const-string v4, "utf-8"

    invoke-direct {v2, v3, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 108
    :goto_0
    :try_start_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    .line 114
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V

    return-object v0

    .line 112
    :cond_0
    :try_start_1
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 106
    :try_start_2
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v0
.end method

.method public final ֫(Z)Ll/᩻۬ۚ;
    .locals 0

    .line 56
    iput-boolean p1, p0, Ll/֫۬ۚ;->ۧ:Z

    return-object p0
.end method

.method public final ۧ()Ljava/security/MessageDigest;
    .locals 1

    .line 62
    iget-object v0, p0, Ll/֫۬ۚ;->ܽ:Ljava/security/MessageDigest;

    return-object v0
.end method

.method public ܽ()V
    .locals 0

    return-void
.end method
