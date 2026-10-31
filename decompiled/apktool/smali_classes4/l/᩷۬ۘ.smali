.class public abstract Ll/᩷۬ۘ;
.super Ljava/lang/Object;
.source "A8VV"


# direct methods
.method public static ֫(Ljava/lang/Appendable;C)V
    .locals 0

    .line 11
    :try_start_0
    invoke-interface {p0, p1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 13
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method
