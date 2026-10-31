.class public abstract Ll/ܽۨ֨;
.super Ljava/lang/Object;
.source "M43N"

# interfaces
.implements Ll/۠ۛ֨;


# virtual methods
.method public ֫(Ll/֡ۛ֨;)Ll/᩵ۛ֨;
    .locals 1

    .line 1330
    iget-object v0, p1, Ll/֡ۛ֨;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1334
    iget-object p1, p1, Ll/֡ۛ֨;->֫:Ljava/util/ArrayList;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩵ۛ֨;

    return-object p1

    .line 1332
    :cond_0
    new-instance p1, Ll/֨ۛ֨;

    .line 1310
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 1332
    throw p1
.end method
