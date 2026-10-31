.class public final Ll/ۢ۬ۖ;
.super Ljava/lang/Object;
.source "Y9IP"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ᩸:Ll/ۡ۬ۖ;


# direct methods
.method public constructor <init>(Ll/ۡ۬ۖ;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢ۬ۖ;->᩸:Ll/ۡ۬ۖ;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    const/4 v0, 0x0

    .line 73
    :try_start_0
    iget-object v1, p0, Ll/ۢ۬ۖ;->᩸:Ll/ۡ۬ۖ;

    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    move-result v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-lez v1, :cond_0

    const/4 v0, 0x1

    :catch_0
    :cond_0
    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 83
    :try_start_0
    iget-object v0, p0, Ll/ۢ۬ۖ;->᩸:Ll/ۡ۬ۖ;

    invoke-virtual {v0}, Ll/ۡ۬ۖ;->readObject()Ll/ۚ۬ۖ;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 85
    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final remove()V
    .locals 2

    .line 91
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Remove not supported on ASN.1 InputStream iterator"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
