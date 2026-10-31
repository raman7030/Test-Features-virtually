.class public Ll/᩻ۜ֫;
.super Ljava/lang/Object;
.source "O5NM"

# interfaces
.implements Ll/ܿۡ֫;


# virtual methods
.method public final ֫(Ll/᩻ۡ֫;Ll/᩺ۢ֫;)V
    .locals 1

    .line 958
    sget-object p1, Ll/᩺ۢ֫;->ۤ:Ll/᩺ۢ֫;

    const/4 v0, 0x0

    if-eq p2, p1, :cond_1

    .line 969
    sget-object p1, Ll/᩺ۢ֫;->ۗ:Ll/᩺ۢ֫;

    if-eq p2, p1, :cond_0

    return-void

    .line 970
    :cond_0
    throw v0

    .line 106
    :cond_1
    throw v0
.end method
