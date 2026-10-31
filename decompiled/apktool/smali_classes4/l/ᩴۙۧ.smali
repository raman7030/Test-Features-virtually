.class public final Ll/ᩴۙۧ;
.super Ljava/lang/Object;
.source "R5DS"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 5

    .line 190
    check-cast p1, Ll/֡ۙۧ;

    check-cast p2, Ll/֡ۙۧ;

    .line 194
    iget-object v0, p1, Ll/֡ۙۧ;->ᩳ:Ll/۬۬ۧ;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget-object v4, p2, Ll/֡ۙۧ;->ᩳ:Ll/۬۬ۧ;

    if-nez v4, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-eq v3, v4, :cond_2

    if-nez v0, :cond_3

    goto :goto_2

    .line 199
    :cond_2
    iget-boolean v0, p1, Ll/֡ۙۧ;->ۧ:Z

    iget-boolean v3, p2, Ll/֡ۙۧ;->ۧ:Z

    if-eq v0, v3, :cond_5

    if-eqz v0, :cond_4

    :cond_3
    const/4 p1, -0x1

    return p1

    :cond_4
    :goto_2
    return v2

    .line 204
    :cond_5
    iget v0, p2, Ll/֡ۙۧ;->ܿ:I

    iget v2, p1, Ll/֡ۙۧ;->ܿ:I

    sub-int/2addr v0, v2

    if-eqz v0, :cond_6

    return v0

    .line 208
    :cond_6
    iget p1, p1, Ll/֡ۙۧ;->֫:I

    iget p2, p2, Ll/֡ۙۧ;->֫:I

    sub-int/2addr p1, p2

    if-eqz p1, :cond_7

    return p1

    :cond_7
    return v1
.end method
