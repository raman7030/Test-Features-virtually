.class public final Ll/۬ᩳ᩻;
.super Ljava/lang/Object;
.source "195F"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܽ:Ljava/lang/String;

.field public ᩳ:I


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 6

    .line 1749
    iget-object v0, p0, Ll/۬ᩳ᩻;->ܽ:Ljava/lang/String;

    const-string v1, "\n"

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const-string v2, "\r\n"

    .line 1769
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "\r"

    if-eqz v3, :cond_1

    .line 1770
    iget v3, p0, Ll/۬ᩳ᩻;->ۧ:I

    goto :goto_0

    .line 1771
    :cond_1
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 1772
    iget v3, p0, Ll/۬ᩳ᩻;->֫:I

    goto :goto_0

    .line 1774
    :cond_2
    iget v3, p0, Ll/۬ᩳ᩻;->ᩳ:I

    .line 1754
    :goto_0
    iget v5, p0, Ll/۬ᩳ᩻;->ᩳ:I

    if-le v5, v3, :cond_3

    move-object v0, v1

    move v3, v5

    .line 1758
    :cond_3
    iget v1, p0, Ll/۬ᩳ᩻;->ۧ:I

    if-le v1, v3, :cond_4

    move v3, v1

    goto :goto_1

    :cond_4
    move-object v2, v0

    .line 1762
    :goto_1
    iget v0, p0, Ll/۬ᩳ᩻;->֫:I

    if-le v0, v3, :cond_5

    return-object v4

    :cond_5
    return-object v2
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 1736
    iget-object v0, p0, Ll/۬ᩳ᩻;->ܽ:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 1737
    iput-object p1, p0, Ll/۬ᩳ᩻;->ܽ:Ljava/lang/String;

    :cond_0
    const-string v0, "\r\n"

    .line 1739
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1740
    iget p1, p0, Ll/۬ᩳ᩻;->ۧ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/۬ᩳ᩻;->ۧ:I

    return-void

    :cond_1
    const-string v0, "\r"

    .line 1741
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 1742
    iget p1, p0, Ll/۬ᩳ᩻;->֫:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/۬ᩳ᩻;->֫:I

    return-void

    .line 1744
    :cond_2
    iget p1, p0, Ll/۬ᩳ᩻;->ᩳ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/۬ᩳ᩻;->ᩳ:I

    return-void
.end method
