.class public final Ll/ᩴ֨ۖ;
.super Ljava/lang/Object;
.source "S9OW"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public ᩸:Ljava/util/Iterator;


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 149
    iget-object v0, p0, Ll/ᩴ֨ۖ;->᩸:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 154
    iget-object v0, p0, Ll/ᩴ֨ۖ;->᩸:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final remove()V
    .locals 1

    .line 159
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
