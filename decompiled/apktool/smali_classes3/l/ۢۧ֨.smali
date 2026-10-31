.class public final synthetic Ll/ۢۧ֨;
.super Ljava/lang/Object;
.source "P7DJ"

# interfaces
.implements Ljava/util/function/ToIntFunction;


# virtual methods
.method public final applyAsInt(Ljava/lang/Object;)I
    .locals 0

    .line 2
    check-cast p1, Ll/ۜۗۚ;

    .line 619
    iget-object p1, p1, Ll/ۜۗۚ;->᩸:Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    return p1
.end method
