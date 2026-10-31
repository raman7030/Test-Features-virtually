.class public final Ll/۠ܿۖ;
.super Ll/ܶܿۖ;
.source "A87D"


# virtual methods
.method public final ֫(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3

    .line 121
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Cannot allocate "

    const-string v2, ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly."

    .line 0
    invoke-static {p1, v1, v2}, Ll/᩸ܳۡ;->֫(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 121
    invoke-direct {v0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
