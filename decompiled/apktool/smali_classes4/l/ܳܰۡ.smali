.class public final Ll/ܳܰۡ;
.super Ljava/lang/ThreadLocal;
.source "5AQ2"


# instance fields
.field public final ֫:Ll/ᩳܰۡ;


# direct methods
.method public constructor <init>(Ll/ᩳܰۡ;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 13
    iput-object p1, p0, Ll/ܳܰۡ;->֫:Ll/ᩳܰۡ;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 19
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Use getZipFile() instead."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final initialValue()Ljava/lang/Object;
    .locals 2

    .line 36
    :try_start_0
    iget-object v0, p0, Ll/ܳܰۡ;->֫:Ll/ᩳܰۡ;

    invoke-virtual {v0}, Ll/ᩳܰۡ;->ܽ()Ll/ᩳܰۡ;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 38
    new-instance v1, Ll/ܿܰۡ;

    .line 44
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 38
    throw v1
.end method

.method public final ֫()Ll/ᩳܰۡ;
    .locals 1

    .line 25
    :try_start_0
    invoke-super {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳܰۡ;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ll/ܿܰۡ; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/io/IOException;

    throw v0
.end method
