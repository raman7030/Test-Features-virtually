.class public final synthetic Ll/ܺ᩷ܿ;
.super Ljava/lang/Object;
.source "W9TA"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 2
    check-cast p1, Ljava/lang/String;

    .line 4
    check-cast p2, Ljava/lang/String;

    .line 107
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    sub-int/2addr p2, p1

    return p2
.end method
