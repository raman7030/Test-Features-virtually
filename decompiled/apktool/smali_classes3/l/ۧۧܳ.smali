.class public final synthetic Ll/ۧۧܳ;
.super Ljava/lang/Object;
.source "D70T"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6

    .line 2
    check-cast p1, Ll/ۚۧܳ;

    .line 4
    check-cast p2, Ll/ۚۧܳ;

    .line 2141
    invoke-virtual {p2}, Ll/ۚۧܳ;->ᩳ()J

    move-result-wide v0

    invoke-virtual {p1}, Ll/ۚۧܳ;->ᩳ()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 2145
    :cond_0
    invoke-virtual {p1}, Ll/ۚۧܳ;->ᩳ()J

    move-result-wide v0

    invoke-virtual {p1}, Ll/ۚۧܳ;->֫()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    .line 2146
    invoke-virtual {p2}, Ll/ۚۧܳ;->ᩳ()J

    move-result-wide v2

    invoke-virtual {p2}, Ll/ۚۧܳ;->֫()I

    move-result v4

    int-to-long v4, v4

    add-long/2addr v2, v4

    .line 2147
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Long;->compare(JJ)I

    move-result v0

    if-eqz v0, :cond_1

    return v0

    .line 2149
    :cond_1
    invoke-virtual {p1}, Ll/ۚۧܳ;->֫()I

    move-result p1

    invoke-virtual {p2}, Ll/ۚۧܳ;->֫()I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method
