.class public final synthetic Ll/ܰۤۜ;
.super Ljava/lang/Object;
.source "H74F"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 8

    .line 2
    check-cast p1, Ll/֫ۛۜ;

    .line 4
    check-cast p2, Ll/֫ۛۜ;

    .line 69
    invoke-virtual {p2}, Ll/֫ۛۜ;->֫()Ll/۠ᩴ֫;

    move-result-object v0

    .line 242
    iget v1, v0, Ll/۠ᩴ֫;->᩷֫:I

    const-wide/16 v2, -0x1

    if-lez v1, :cond_0

    iget v0, v0, Ll/۠ᩴ֫;->۠:I

    if-lez v0, :cond_0

    int-to-long v4, v1

    int-to-long v0, v0

    mul-long v4, v4, v0

    goto :goto_0

    :cond_0
    move-wide v4, v2

    .line 69
    :goto_0
    invoke-virtual {p1}, Ll/֫ۛۜ;->֫()Ll/۠ᩴ֫;

    move-result-object v0

    .line 242
    iget v1, v0, Ll/۠ᩴ֫;->᩷֫:I

    if-lez v1, :cond_1

    iget v0, v0, Ll/۠ᩴ֫;->۠:I

    if-lez v0, :cond_1

    int-to-long v1, v1

    int-to-long v6, v0

    mul-long v2, v1, v6

    .line 69
    :cond_1
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    move-result v0

    if-eqz v0, :cond_2

    return v0

    .line 73
    :cond_2
    invoke-virtual {p2}, Ll/֫ۛۜ;->֫()Ll/۠ᩴ֫;

    move-result-object v0

    .line 249
    iget v1, v0, Ll/۠ᩴ֫;->᩷֫:I

    const/4 v2, -0x1

    if-lez v1, :cond_3

    iget v0, v0, Ll/۠ᩴ֫;->۠:I

    if-lez v0, :cond_3

    .line 250
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_1

    :cond_3
    const/4 v0, -0x1

    .line 73
    :goto_1
    invoke-virtual {p1}, Ll/֫ۛۜ;->֫()Ll/۠ᩴ֫;

    move-result-object v1

    .line 249
    iget v3, v1, Ll/۠ᩴ֫;->᩷֫:I

    if-lez v3, :cond_4

    iget v1, v1, Ll/۠ᩴ֫;->۠:I

    if-lez v1, :cond_4

    .line 250
    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_2

    :cond_4
    const/4 v1, -0x1

    .line 73
    :goto_2
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_5

    return v0

    .line 77
    :cond_5
    invoke-virtual {p2}, Ll/֫ۛۜ;->֫()Ll/۠ᩴ֫;

    move-result-object v0

    .line 257
    iget v0, v0, Ll/۠ᩴ֫;->ᩳ:I

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 77
    invoke-virtual {p1}, Ll/֫ۛۜ;->֫()Ll/۠ᩴ֫;

    move-result-object v1

    .line 257
    iget v1, v1, Ll/۠ᩴ֫;->ᩳ:I

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 77
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_6

    return v0

    .line 78
    :cond_6
    invoke-virtual {p1}, Ll/֫ۛۜ;->ᩳ()I

    move-result p1

    invoke-virtual {p2}, Ll/֫ۛۜ;->ᩳ()I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method
