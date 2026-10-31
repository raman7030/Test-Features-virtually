.class public final synthetic Ll/۫ᩴܳ;
.super Ljava/lang/Object;
.source "715M"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 2
    check-cast p1, Ll/ۤᩴܳ;

    .line 4
    check-cast p2, Ll/ۤᩴܳ;

    .line 880
    iget v0, p1, Ll/ۤᩴܳ;->ۧ:I

    iget v1, p2, Ll/ۤᩴܳ;->ۧ:I

    if-eq v0, v1, :cond_0

    sub-int/2addr v0, v1

    return v0

    .line 883
    :cond_0
    iget p1, p1, Ll/ۤᩴܳ;->ܽ:I

    iget p2, p2, Ll/ۤᩴܳ;->ܽ:I

    sub-int/2addr p1, p2

    return p1
.end method
