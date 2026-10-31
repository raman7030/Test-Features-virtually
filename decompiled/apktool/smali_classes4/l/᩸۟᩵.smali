.class public final Ll/᩸۟᩵;
.super Ljava/lang/Object;
.source "R5PD"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 81
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    .line 83
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method
