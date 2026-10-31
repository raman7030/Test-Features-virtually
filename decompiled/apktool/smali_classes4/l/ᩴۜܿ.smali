.class public final Ll/ᩴۜܿ;
.super Ljava/lang/Object;
.source "W6ZV"


# instance fields
.field public ֫:I

.field public ۧ:[Ll/ۨۘܽ;

.field public ܽ:[I

.field public ᩳ:I


# virtual methods
.method public final ֫(Ll/ۚ᩷ܿ;Ljava/lang/CharSequence;[I[I)Ll/ۨۘܽ;
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 23
    :goto_0
    iget v2, p0, Ll/ᩴۜܿ;->ᩳ:I

    const/4 v3, 0x1

    if-ge v1, v2, :cond_2

    .line 24
    iget-object v2, p0, Ll/ᩴۜܿ;->ۧ:[Ll/ۨۘܽ;

    aget-object v2, v2, v1

    .line 25
    iget-object v4, p0, Ll/ᩴۜܿ;->ܽ:[I

    aget v4, v4, v1

    invoke-virtual {p1}, Ll/ۚ᩷ܿ;->֫()I

    move-result v5

    if-ne v4, v5, :cond_1

    .line 27
    invoke-virtual {v2}, Ll/ۨۘܽ;->pattern()Ljava/lang/String;

    move-result-object v4

    .line 26
    invoke-virtual {p1, v4, p2, p3, p4}, Ll/ۚ᩷ܿ;->֫(Ljava/lang/String;Ljava/lang/CharSequence;[I[I)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 28
    iget-object p1, p0, Ll/ᩴۜܿ;->ܽ:[I

    aget p1, p1, v1

    if-nez v1, :cond_0

    return-object v2

    .line 59
    :cond_0
    iget-object p2, p0, Ll/ᩴۜܿ;->ۧ:[Ll/ۨۘܽ;

    invoke-static {p2, v0, p2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 60
    iget-object p2, p0, Ll/ᩴۜܿ;->ܽ:[I

    invoke-static {p2, v0, p2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 61
    iget-object p2, p0, Ll/ᩴۜܿ;->ۧ:[Ll/ۨۘܽ;

    aput-object v2, p2, v0

    .line 62
    iget-object p2, p0, Ll/ᩴۜܿ;->ܽ:[I

    aput p1, p2, v0

    return-object v2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 34
    :cond_2
    invoke-virtual {p1, p2, p3, p4}, Ll/ۚ᩷ܿ;->֫(Ljava/lang/CharSequence;[I[I)Ljava/lang/String;

    move-result-object p2

    .line 35
    invoke-virtual {p1}, Ll/ۚ᩷ܿ;->֫()I

    move-result p3

    invoke-static {p3, p2}, Ll/ۨۘܽ;->֫(ILjava/lang/String;)Ll/ۨۘܽ;

    move-result-object p2

    .line 37
    invoke-virtual {p1}, Ll/ۚ᩷ܿ;->֫()I

    move-result p1

    .line 67
    iget-object p3, p0, Ll/ᩴۜܿ;->ۧ:[Ll/ۨۘܽ;

    const/16 p4, 0x8

    if-nez p3, :cond_3

    new-array p3, p4, [Ll/ۨۘܽ;

    .line 68
    iput-object p3, p0, Ll/ᩴۜܿ;->ۧ:[Ll/ۨۘܽ;

    new-array p3, p4, [I

    .line 69
    iput-object p3, p0, Ll/ᩴۜܿ;->ܽ:[I

    .line 71
    :cond_3
    invoke-virtual {p2}, Ll/ۨۘܽ;->pattern()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p3

    .line 72
    :goto_1
    iget v1, p0, Ll/ᩴۜܿ;->ᩳ:I

    if-eq v1, p4, :cond_5

    iget v2, p0, Ll/ᩴۜܿ;->֫:I

    add-int/2addr v2, p3

    const/16 v4, 0x4000

    if-le v2, v4, :cond_4

    goto :goto_2

    .line 77
    :cond_4
    iget-object p4, p0, Ll/ᩴۜܿ;->ۧ:[Ll/ۨۘܽ;

    invoke-static {p4, v0, p4, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 78
    iget-object p4, p0, Ll/ᩴۜܿ;->ܽ:[I

    iget v1, p0, Ll/ᩴۜܿ;->ᩳ:I

    invoke-static {p4, v0, p4, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 79
    iget-object p4, p0, Ll/ᩴۜܿ;->ۧ:[Ll/ۨۘܽ;

    aput-object p2, p4, v0

    .line 80
    iget-object p4, p0, Ll/ᩴۜܿ;->ܽ:[I

    aput p1, p4, v0

    .line 81
    iget p1, p0, Ll/ᩴۜܿ;->ᩳ:I

    add-int/2addr p1, v3

    iput p1, p0, Ll/ᩴۜܿ;->ᩳ:I

    .line 82
    iget p1, p0, Ll/ᩴۜܿ;->֫:I

    add-int/2addr p1, p3

    iput p1, p0, Ll/ᩴۜܿ;->֫:I

    return-object p2

    .line 73
    :cond_5
    :goto_2
    iget-object v2, p0, Ll/ᩴۜܿ;->ۧ:[Ll/ۨۘܽ;

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ll/ᩴۜܿ;->ᩳ:I

    aget-object v4, v2, v1

    const/4 v5, 0x0

    .line 74
    aput-object v5, v2, v1

    .line 75
    iget v1, p0, Ll/ᩴۜܿ;->֫:I

    invoke-virtual {v4}, Ll/ۨۘܽ;->pattern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, p0, Ll/ᩴۜܿ;->֫:I

    goto :goto_1
.end method

.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 43
    iput-object v0, p0, Ll/ᩴۜܿ;->ۧ:[Ll/ۨۘܽ;

    .line 44
    iput-object v0, p0, Ll/ᩴۜܿ;->ܽ:[I

    const/4 v0, 0x0

    .line 45
    iput v0, p0, Ll/ᩴۜܿ;->ᩳ:I

    .line 46
    iput v0, p0, Ll/ᩴۜܿ;->֫:I

    return-void
.end method
