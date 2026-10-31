.class public final synthetic Ll/֫᩺᩻;
.super Ljava/lang/Object;
.source "R78M"

# interfaces
.implements Ljava/util/function/ToIntFunction;


# virtual methods
.method public final applyAsInt(Ljava/lang/Object;)I
    .locals 0

    .line 2
    check-cast p1, Ljava/lang/String;

    .line 87
    invoke-static {p1}, Ll/ᩳ᩺᩻;->֫(Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    const p1, 0x7fffffff

    :cond_0
    return p1
.end method
