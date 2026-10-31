.class public abstract Ll/֫᩸ᩴ;
.super Ljava/lang/Object;
.source "N673"


# static fields
.field public static final a:Ll/᩷۠ᩴ;

.field public static final b:Z

.field public static final c:Ljava/security/SecureRandom;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 104
    invoke-static {}, Ljava/lang/System;->getSecurityManager()Ljava/lang/SecurityManager;

    move-result-object v0

    const-string v1, "java.io.tmpdir"

    if-nez v0, :cond_0

    .line 105
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 107
    :cond_0
    new-instance v0, Ll/ۢ᩹ᩴ;

    .line 63
    invoke-direct {v0}, Ll/ۢ᩹ᩴ;-><init>()V

    .line 64
    iput-object v1, v0, Ll/ۢ᩹ᩴ;->b:Ljava/lang/Object;

    .line 107
    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :goto_0
    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    .line 49
    invoke-static {v0, v1}, Ll/ۜ۠ᩴ;->of(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v0

    sput-object v0, Ll/֫᩸ᩴ;->a:Ll/᩷۠ᩴ;

    .line 52
    invoke-static {}, Ll/֫۠ᩴ;->getDefault()Ll/۟֨ᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟֨ᩴ;->supportedFileAttributeViews()Ljava/util/Set;

    move-result-object v0

    const-string v1, "posix"

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    sput-boolean v0, Ll/֫᩸ᩴ;->b:Z

    .line 55
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    sput-object v0, Ll/֫᩸ᩴ;->c:Ljava/security/SecureRandom;

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;
    .locals 12

    .line 57
    sget-object v0, Ll/֫᩸ᩴ;->c:Ljava/security/SecureRandom;

    invoke-virtual {v0}, Ljava/security/SecureRandom;->nextLong()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const-string v0, "0"

    goto :goto_1

    :cond_0
    const/16 v5, 0xa

    if-lez v4, :cond_1

    .line 0
    invoke-static {v0, v1, v5}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/16 v4, 0x40

    new-array v4, v4, [C

    const/4 v6, 0x1

    ushr-long v6, v0, v6

    const/4 v8, 0x5

    int-to-long v8, v8

    div-long/2addr v6, v8

    int-to-long v8, v5

    mul-long v10, v6, v8

    sub-long/2addr v0, v10

    long-to-int v1, v0

    invoke-static {v1, v5}, Ljava/lang/Character;->forDigit(II)C

    move-result v0

    const/16 v1, 0x3f

    aput-char v0, v4, v1

    :goto_0
    cmp-long v0, v6, v2

    if-lez v0, :cond_2

    add-int/lit8 v1, v1, -0x1

    rem-long v10, v6, v8

    long-to-int v0, v10

    invoke-static {v0, v5}, Ljava/lang/Character;->forDigit(II)C

    move-result v0

    aput-char v0, v4, v1

    div-long/2addr v6, v8

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/String;

    rsub-int/lit8 v2, v1, 0x40

    invoke-direct {v0, v4, v1, v2}, Ljava/lang/String;-><init>([CII)V

    .line 58
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 59
    invoke-interface {p2}, Ll/᩷۠ᩴ;->getFileSystem()Ll/۟֨ᩴ;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {p1, p0, v0}, Ll/۟֨ᩴ;->getPath(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p0

    .line 61
    invoke-interface {p0}, Ll/᩷۠ᩴ;->getParent()Ll/᩷۠ᩴ;

    move-result-object p1

    if-nez p1, :cond_3

    .line 63
    invoke-interface {p2, p0}, Ll/᩷۠ᩴ;->resolve(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object p0

    return-object p0

    .line 62
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid prefix or suffix"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
