.class public final synthetic Ll/ۛۤۜ;
.super Ljava/lang/Object;
.source "77HF"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 2
    check-cast p1, Ll/ۨۤۜ;

    .line 4
    check-cast p2, Ll/ۨۤۜ;

    .line 243
    iget-wide v0, p2, Ll/ۨۤۜ;->ۧ:J

    iget-wide p1, p1, Ll/ۨۤۜ;->ۧ:J

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Long;->compare(JJ)I

    move-result p1

    return p1
.end method
