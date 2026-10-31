.class public abstract Ll/᩺ۨ᩵;
.super Ljava/lang/Object;
.source "98E7"

# interfaces
.implements Ljava/io/Closeable;


# virtual methods
.method public final close()V
    .locals 0

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 85
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "(seed=0)"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract ֫()I
.end method

.method public abstract ֫(I[B)V
.end method
