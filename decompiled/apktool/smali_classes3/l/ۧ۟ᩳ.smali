.class public final Ll/ۧ۟ᩳ;
.super Ljava/lang/Object;
.source "R6N8"


# instance fields
.field public ֫:Ll/۟ܰᩳ;

.field public ۧ:I


# direct methods
.method public static ֫(Ll/۟ܰᩳ;I)Ll/֫۟ᩳ;
    .locals 6

    const/4 v0, 0x0

    if-nez p0, :cond_0

    .line 267
    new-instance p0, Ll/֫۟ᩳ;

    invoke-direct {p0, v0, v0}, Ll/֫۟ᩳ;-><init>(Ll/۟ܰᩳ;Ll/۟ܰᩳ;)V

    return-object p0

    .line 268
    :cond_0
    invoke-static {p0}, Ll/ۧ۟ᩳ;->ܽ(Ll/۟ܰᩳ;)V

    .line 269
    iget-object v1, p0, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    const/4 v3, 0x0

    goto :goto_0

    .line 372
    :cond_1
    iget v3, v1, Ll/۟ܰᩳ;->ۧ:I

    :goto_0
    if-ge p1, v3, :cond_2

    .line 271
    invoke-static {v1, p1}, Ll/ۧ۟ᩳ;->֫(Ll/۟ܰᩳ;I)Ll/֫۟ᩳ;

    move-result-object p1

    .line 272
    new-instance v0, Ll/֫۟ᩳ;

    invoke-static {p1}, Ll/֫۟ᩳ;->֫(Ll/֫۟ᩳ;)Ll/۟ܰᩳ;

    move-result-object v1

    invoke-static {p1}, Ll/֫۟ᩳ;->ۧ(Ll/֫۟ᩳ;)Ll/۟ܰᩳ;

    move-result-object p1

    iget-object v2, p0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    invoke-static {p1, p0, v2}, Ll/ۧ۟ᩳ;->֫(Ll/۟ܰᩳ;Ll/۟ܰᩳ;Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ll/֫۟ᩳ;-><init>(Ll/۟ܰᩳ;Ll/۟ܰᩳ;)V

    return-object v0

    .line 274
    :cond_2
    iget v4, p0, Ll/۟ܰᩳ;->֡:I

    add-int v5, v3, v4

    if-le p1, v5, :cond_3

    .line 275
    iget-object v0, p0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    sub-int/2addr p1, v3

    sub-int/2addr p1, v4

    invoke-static {v0, p1}, Ll/ۧ۟ᩳ;->֫(Ll/۟ܰᩳ;I)Ll/֫۟ᩳ;

    move-result-object p1

    .line 276
    new-instance v0, Ll/֫۟ᩳ;

    iget-object v1, p0, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    invoke-static {p1}, Ll/֫۟ᩳ;->֫(Ll/֫۟ᩳ;)Ll/۟ܰᩳ;

    move-result-object v2

    invoke-static {v1, p0, v2}, Ll/ۧ۟ᩳ;->֫(Ll/۟ܰᩳ;Ll/۟ܰᩳ;Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object p0

    invoke-static {p1}, Ll/֫۟ᩳ;->ۧ(Ll/֫۟ᩳ;)Ll/۟ܰᩳ;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Ll/֫۟ᩳ;-><init>(Ll/۟ܰᩳ;Ll/۟ܰᩳ;)V

    return-object v0

    :cond_3
    sub-int/2addr p1, v3

    .line 279
    new-instance v3, Ll/֫۟ᩳ;

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {p0, v2, p1}, Ll/۟ܰᩳ;->֫(II)Ll/۟ܰᩳ;

    move-result-object v2

    invoke-static {v1, v2, v0}, Ll/ۧ۟ᩳ;->֫(Ll/۟ܰᩳ;Ll/۟ܰᩳ;Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object v1

    .line 280
    :goto_1
    iget v2, p0, Ll/۟ܰᩳ;->֡:I

    if-ne p1, v2, :cond_5

    iget-object p0, p0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    goto :goto_2

    :cond_5
    invoke-virtual {p0, p1, v2}, Ll/۟ܰᩳ;->֫(II)Ll/۟ܰᩳ;

    move-result-object p1

    iget-object p0, p0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    invoke-static {v0, p1, p0}, Ll/ۧ۟ᩳ;->֫(Ll/۟ܰᩳ;Ll/۟ܰᩳ;Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object p0

    :goto_2
    invoke-direct {v3, v1, p0}, Ll/֫۟ᩳ;-><init>(Ll/۟ܰᩳ;Ll/۟ܰᩳ;)V

    return-object v3
.end method

.method public static ֫(Ll/۟ܰᩳ;)Ll/۟ܰᩳ;
    .locals 5

    .line 338
    invoke-static {p0}, Ll/ۧ۟ᩳ;->ᩳ(Ll/۟ܰᩳ;)V

    .line 339
    iget-object v0, p0, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    .line 373
    :cond_0
    iget v2, v0, Ll/۟ܰᩳ;->ᩳ:I

    .line 339
    :goto_0
    iget-object v3, p0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    if-nez v3, :cond_1

    const/4 v4, 0x0

    goto :goto_1

    .line 373
    :cond_1
    iget v4, v3, Ll/۟ܰᩳ;->ᩳ:I

    :goto_1
    add-int/lit8 v4, v4, 0x1

    if-le v2, v4, :cond_5

    .line 340
    iget-object v2, v0, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    .line 373
    :cond_2
    iget v2, v2, Ll/۟ܰᩳ;->ᩳ:I

    .line 340
    :goto_2
    iget-object v3, v0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    if-nez v3, :cond_3

    goto :goto_3

    .line 373
    :cond_3
    iget v1, v3, Ll/۟ܰᩳ;->ᩳ:I

    :goto_3
    if-ge v2, v1, :cond_4

    .line 351
    invoke-static {v0}, Ll/ۧ۟ᩳ;->ܽ(Ll/۟ܰᩳ;)V

    .line 352
    iget-object v1, v0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    .line 353
    invoke-static {v1}, Ll/ۧ۟ᩳ;->ܽ(Ll/۟ܰᩳ;)V

    .line 354
    iget-object v2, v1, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    iput-object v2, v0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    .line 355
    iput-object v0, v1, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    .line 356
    invoke-static {v0}, Ll/ۧ۟ᩳ;->ᩳ(Ll/۟ܰᩳ;)V

    .line 357
    invoke-static {v1}, Ll/ۧ۟ᩳ;->ᩳ(Ll/۟ܰᩳ;)V

    .line 340
    iput-object v1, p0, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    .line 362
    :cond_4
    invoke-static {p0}, Ll/ۧ۟ᩳ;->ܽ(Ll/۟ܰᩳ;)V

    .line 363
    iget-object v0, p0, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    .line 364
    invoke-static {v0}, Ll/ۧ۟ᩳ;->ܽ(Ll/۟ܰᩳ;)V

    .line 365
    iget-object v1, v0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    iput-object v1, p0, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    .line 366
    iput-object p0, v0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    .line 367
    invoke-static {p0}, Ll/ۧ۟ᩳ;->ᩳ(Ll/۟ܰᩳ;)V

    .line 368
    invoke-static {v0}, Ll/ۧ۟ᩳ;->ᩳ(Ll/۟ܰᩳ;)V

    return-object v0

    :cond_5
    if-nez v3, :cond_6

    const/4 v2, 0x0

    goto :goto_4

    .line 373
    :cond_6
    iget v2, v3, Ll/۟ܰᩳ;->ᩳ:I

    :goto_4
    if-nez v0, :cond_7

    const/4 v0, 0x0

    goto :goto_5

    :cond_7
    iget v0, v0, Ll/۟ܰᩳ;->ᩳ:I

    :goto_5
    add-int/lit8 v0, v0, 0x1

    if-le v2, v0, :cond_b

    .line 344
    iget-object v0, v3, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    if-nez v0, :cond_8

    const/4 v0, 0x0

    goto :goto_6

    .line 373
    :cond_8
    iget v0, v0, Ll/۟ܰᩳ;->ᩳ:I

    .line 344
    :goto_6
    iget-object v2, v3, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    if-nez v2, :cond_9

    goto :goto_7

    .line 373
    :cond_9
    iget v1, v2, Ll/۟ܰᩳ;->ᩳ:I

    :goto_7
    if-ge v0, v1, :cond_a

    .line 362
    invoke-static {v3}, Ll/ۧ۟ᩳ;->ܽ(Ll/۟ܰᩳ;)V

    .line 363
    iget-object v0, v3, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    .line 364
    invoke-static {v0}, Ll/ۧ۟ᩳ;->ܽ(Ll/۟ܰᩳ;)V

    .line 365
    iget-object v1, v0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    iput-object v1, v3, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    .line 366
    iput-object v3, v0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    .line 367
    invoke-static {v3}, Ll/ۧ۟ᩳ;->ᩳ(Ll/۟ܰᩳ;)V

    .line 368
    invoke-static {v0}, Ll/ۧ۟ᩳ;->ᩳ(Ll/۟ܰᩳ;)V

    .line 344
    iput-object v0, p0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    .line 351
    :cond_a
    invoke-static {p0}, Ll/ۧ۟ᩳ;->ܽ(Ll/۟ܰᩳ;)V

    .line 352
    iget-object v0, p0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    .line 353
    invoke-static {v0}, Ll/ۧ۟ᩳ;->ܽ(Ll/۟ܰᩳ;)V

    .line 354
    iget-object v1, v0, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    iput-object v1, p0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    .line 355
    iput-object p0, v0, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    .line 356
    invoke-static {p0}, Ll/ۧ۟ᩳ;->ᩳ(Ll/۟ܰᩳ;)V

    .line 357
    invoke-static {v0}, Ll/ۧ۟ᩳ;->ᩳ(Ll/۟ܰᩳ;)V

    return-object v0

    :cond_b
    return-object p0
.end method

.method public static ֫(Ll/۟ܰᩳ;ILl/ۨܰᩳ;)Ll/۟ܰᩳ;
    .locals 4

    if-nez p0, :cond_0

    .line 151
    new-instance p0, Ll/۟ܰᩳ;

    const/16 p1, 0x8

    invoke-direct {p0, p1}, Ll/۟ܰᩳ;-><init>(I)V

    invoke-virtual {p0, p2}, Ll/۟ܰᩳ;->֫(Ll/ۨܰᩳ;)V

    return-object p0

    .line 152
    :cond_0
    invoke-static {p0}, Ll/ۧ۟ᩳ;->ܽ(Ll/۟ܰᩳ;)V

    .line 153
    iget-object v0, p0, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    .line 372
    :cond_1
    iget v2, v0, Ll/۟ܰᩳ;->ۧ:I

    :goto_0
    if-ge p1, v2, :cond_2

    .line 154
    invoke-static {v0, p1, p2}, Ll/ۧ۟ᩳ;->֫(Ll/۟ܰᩳ;ILl/ۨܰᩳ;)Ll/۟ܰᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    goto :goto_1

    .line 155
    :cond_2
    iget v0, p0, Ll/۟ܰᩳ;->֡:I

    add-int v3, v2, v0

    if-le p1, v3, :cond_3

    iget-object v1, p0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    sub-int/2addr p1, v2

    sub-int/2addr p1, v0

    invoke-static {v1, p1, p2}, Ll/ۧ۟ᩳ;->֫(Ll/۟ܰᩳ;ILl/ۨܰᩳ;)Ll/۟ܰᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    goto :goto_1

    :cond_3
    const/16 v3, 0x400

    if-ge v0, v3, :cond_4

    sub-int/2addr p1, v2

    .line 157
    invoke-virtual {p0, p1, p2}, Ll/۟ܰᩳ;->֫(ILl/ۨܰᩳ;)V

    goto :goto_1

    :cond_4
    add-int/2addr v0, v2

    if-ne p1, v0, :cond_5

    .line 159
    iget-object p1, p0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    invoke-static {p1, v1, p2}, Ll/ۧ۟ᩳ;->֫(Ll/۟ܰᩳ;ILl/ۨܰᩳ;)Ll/۟ܰᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    .line 172
    :goto_1
    invoke-static {p0}, Ll/ۧ۟ᩳ;->֫(Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object p0

    return-object p0

    :cond_5
    const/16 v0, 0x200

    .line 162
    invoke-virtual {p0, v0, v3}, Ll/۟ܰᩳ;->֫(II)Ll/۟ܰᩳ;

    move-result-object v1

    .line 163
    iget-object v3, p0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    .line 164
    iput v0, p0, Ll/۟ܰᩳ;->֡:I

    .line 165
    invoke-static {p0}, Ll/۟ܰᩳ;->֫(Ll/۟ܰᩳ;)V

    sub-int/2addr p1, v2

    .line 166
    iget v0, p0, Ll/۟ܰᩳ;->֡:I

    if-gt p1, v0, :cond_6

    invoke-virtual {p0, p1, p2}, Ll/۟ܰᩳ;->֫(ILl/ۨܰᩳ;)V

    goto :goto_2

    :cond_6
    sub-int/2addr p1, v0

    .line 167
    invoke-static {v1, p1, p2}, Ll/ۧ۟ᩳ;->֫(Ll/۟ܰᩳ;ILl/ۨܰᩳ;)Ll/۟ܰᩳ;

    move-result-object v1

    :goto_2
    const/4 p1, 0x0

    .line 168
    iput-object p1, p0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    .line 169
    invoke-static {p0}, Ll/ۧ۟ᩳ;->ᩳ(Ll/۟ܰᩳ;)V

    .line 170
    iget-object p1, p0, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    invoke-static {v1, v3}, Ll/ۧ۟ᩳ;->ᩳ(Ll/۟ܰᩳ;Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object p2

    invoke-static {p1, p0, p2}, Ll/ۧ۟ᩳ;->֫(Ll/۟ܰᩳ;Ll/۟ܰᩳ;Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/۟ܰᩳ;Ll/۟ܰᩳ;)Ll/۟ܰᩳ;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۧ۟ᩳ;->ܽ(Ll/۟ܰᩳ;Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/۟ܰᩳ;Ll/۟ܰᩳ;Ll/۟ܰᩳ;)Ll/۟ܰᩳ;
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 373
    :cond_0
    iget v1, p0, Ll/۟ܰᩳ;->ᩳ:I

    :goto_0
    if-nez p2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    iget v2, p2, Ll/۟ܰᩳ;->ᩳ:I

    :goto_1
    add-int/lit8 v2, v2, 0x1

    if-le v1, v2, :cond_2

    .line 322
    invoke-static {p0}, Ll/ۧ۟ᩳ;->ܽ(Ll/۟ܰᩳ;)V

    .line 323
    iget-object v0, p0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    invoke-static {v0, p1, p2}, Ll/ۧ۟ᩳ;->֫(Ll/۟ܰᩳ;Ll/۟ܰᩳ;Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    .line 324
    invoke-static {p0}, Ll/ۧ۟ᩳ;->֫(Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object p0

    return-object p0

    :cond_2
    if-nez p2, :cond_3

    const/4 v1, 0x0

    goto :goto_2

    .line 373
    :cond_3
    iget v1, p2, Ll/۟ܰᩳ;->ᩳ:I

    :goto_2
    if-nez p0, :cond_4

    goto :goto_3

    :cond_4
    iget v0, p0, Ll/۟ܰᩳ;->ᩳ:I

    :goto_3
    add-int/lit8 v0, v0, 0x1

    if-le v1, v0, :cond_5

    .line 327
    invoke-static {p2}, Ll/ۧ۟ᩳ;->ܽ(Ll/۟ܰᩳ;)V

    .line 328
    iget-object v0, p2, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    invoke-static {p0, p1, v0}, Ll/ۧ۟ᩳ;->֫(Ll/۟ܰᩳ;Ll/۟ܰᩳ;Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object p0

    iput-object p0, p2, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    .line 329
    invoke-static {p2}, Ll/ۧ۟ᩳ;->֫(Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object p0

    return-object p0

    .line 331
    :cond_5
    iput-object p0, p1, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    .line 332
    iput-object p2, p1, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    .line 333
    invoke-static {p1}, Ll/ۧ۟ᩳ;->ᩳ(Ll/۟ܰᩳ;)V

    return-object p1
.end method

.method private ֫(I)V
    .locals 2

    if-ltz p1, :cond_0

    .line 234
    invoke-virtual {p0}, Ll/ۧ۟ᩳ;->ۧ()I

    move-result v0

    if-ge p1, v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Line index: "

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 234
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ll/۟ܰᩳ;II)V
    .locals 5

    .line 246
    iget-object v0, p0, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    .line 372
    :cond_0
    iget v2, v0, Ll/۟ܰᩳ;->ۧ:I

    .line 246
    :goto_0
    iget v3, p0, Ll/۟ܰᩳ;->֡:I

    add-int/2addr v3, v2

    if-ge p1, v2, :cond_1

    .line 247
    invoke-static {p2, v2}, Ljava/lang/Math;->min(II)I

    move-result v4

    invoke-static {v0, p1, v4}, Ll/ۧ۟ᩳ;->֫(Ll/۟ܰᩳ;II)V

    :cond_1
    if-ge p1, v3, :cond_2

    if-le p2, v2, :cond_2

    .line 248
    invoke-static {p0}, Ll/۟ܰᩳ;->֫(Ll/۟ܰᩳ;)V

    :cond_2
    if-le p2, v3, :cond_3

    .line 249
    iget-object p0, p0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    sub-int/2addr p1, v3

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    sub-int/2addr p2, v3

    invoke-static {p0, p1, p2}, Ll/ۧ۟ᩳ;->֫(Ll/۟ܰᩳ;II)V

    :cond_3
    return-void
.end method

.method public static ֫(Ll/۟ܰᩳ;IIII)V
    .locals 5

    if-nez p1, :cond_0

    .line 225
    iget v0, p0, Ll/۟ܰᩳ;->ۧ:I

    if-ne p2, v0, :cond_0

    invoke-static {p0, p3, p4}, Ll/ۧ۟ᩳ;->ܽ(Ll/۟ܰᩳ;II)V

    return-void

    .line 226
    :cond_0
    invoke-static {p0}, Ll/ۧ۟ᩳ;->ܽ(Ll/۟ܰᩳ;)V

    .line 227
    iget-object v0, p0, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    .line 372
    :cond_1
    iget v2, v0, Ll/۟ܰᩳ;->ۧ:I

    .line 227
    :goto_0
    iget v3, p0, Ll/۟ܰᩳ;->֡:I

    add-int/2addr v3, v2

    if-ge p1, v2, :cond_2

    .line 228
    invoke-static {p2, v2}, Ljava/lang/Math;->min(II)I

    move-result v4

    invoke-static {v0, p1, v4, p3, p4}, Ll/ۧ۟ᩳ;->֫(Ll/۟ܰᩳ;IIII)V

    :cond_2
    sub-int v0, p1, v2

    .line 229
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v4, p0, Ll/۟ܰᩳ;->֡:I

    sub-int v2, p2, v2

    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-virtual {p0, v0, v2, p3, p4}, Ll/۟ܰᩳ;->֫(IIII)V

    if-le p2, v3, :cond_3

    .line 230
    iget-object p0, p0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    sub-int/2addr p1, v3

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    sub-int/2addr p2, v3

    invoke-static {p0, p1, p2, p3, p4}, Ll/ۧ۟ᩳ;->֫(Ll/۟ܰᩳ;IIII)V

    :cond_3
    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۧ۟ᩳ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۧ۟ᩳ;->ۧ:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۧ۟ᩳ;Ll/۟ܰᩳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۧ۟ᩳ;->֫:Ll/۟ܰᩳ;

    return-void
.end method

.method public static ۧ(Ll/۟ܰᩳ;)Ll/۟ܰᩳ;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    .line 254
    iget v1, p0, Ll/۟ܰᩳ;->֡:I

    invoke-virtual {p0, v0, v1}, Ll/۟ܰᩳ;->֫(II)Ll/۟ܰᩳ;

    move-result-object v0

    .line 255
    iget-object v1, p0, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    invoke-static {v1}, Ll/ۧ۟ᩳ;->ۧ(Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object v1

    iput-object v1, v0, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    .line 256
    iget-object v1, p0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    invoke-static {v1}, Ll/ۧ۟ᩳ;->ۧ(Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object v1

    iput-object v1, v0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    .line 257
    iget v1, p0, Ll/۟ܰᩳ;->ܿ:I

    iput v1, v0, Ll/۟ܰᩳ;->ܿ:I

    .line 258
    iget p0, p0, Ll/۟ܰᩳ;->ܳ:I

    iput p0, v0, Ll/۟ܰᩳ;->ܳ:I

    .line 259
    invoke-static {v0}, Ll/ۧ۟ᩳ;->ᩳ(Ll/۟ܰᩳ;)V

    return-object v0
.end method

.method public static ۧ(Ll/۟ܰᩳ;II)Ll/۟ܰᩳ;
    .locals 6

    const/4 v0, 0x0

    if-ne p1, p2, :cond_0

    return-object v0

    :cond_0
    if-nez p1, :cond_1

    .line 206
    iget v1, p0, Ll/۟ܰᩳ;->ۧ:I

    if-ne p2, v1, :cond_1

    invoke-static {p0}, Ll/ۧ۟ᩳ;->ۧ(Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object p0

    return-object p0

    .line 207
    :cond_1
    iget-object v1, p0, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    const/4 v2, 0x0

    if-nez v1, :cond_2

    const/4 v3, 0x0

    goto :goto_0

    .line 372
    :cond_2
    iget v3, v1, Ll/۟ܰᩳ;->ۧ:I

    .line 207
    :goto_0
    iget v4, p0, Ll/۟ܰᩳ;->֡:I

    add-int/2addr v4, v3

    if-ge p1, v3, :cond_3

    .line 208
    invoke-static {v3, p2}, Ljava/lang/Math;->min(II)I

    move-result v5

    invoke-static {v1, p1, v5}, Ll/ۧ۟ᩳ;->ۧ(Ll/۟ܰᩳ;II)Ll/۟ܰᩳ;

    move-result-object v1

    goto :goto_1

    :cond_3
    move-object v1, v0

    :goto_1
    if-le p2, v4, :cond_4

    .line 209
    iget-object v0, p0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    sub-int v5, p1, v4

    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    sub-int v4, p2, v4

    invoke-static {v0, v5, v4}, Ll/ۧ۟ᩳ;->ۧ(Ll/۟ܰᩳ;II)Ll/۟ܰᩳ;

    move-result-object v0

    .line 211
    :cond_4
    iget v4, p0, Ll/۟ܰᩳ;->ܿ:I

    iget v5, p0, Ll/۟ܰᩳ;->ܳ:I

    invoke-static {v1, v4, v5}, Ll/ۧ۟ᩳ;->ܽ(Ll/۟ܰᩳ;II)V

    .line 212
    iget v4, p0, Ll/۟ܰᩳ;->ܿ:I

    iget v5, p0, Ll/۟ܰᩳ;->ܳ:I

    invoke-static {v0, v4, v5}, Ll/ۧ۟ᩳ;->ܽ(Ll/۟ܰᩳ;II)V

    sub-int/2addr p1, v3

    .line 213
    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iget v2, p0, Ll/۟ܰᩳ;->֡:I

    sub-int/2addr p2, v3

    invoke-static {v2, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    if-ge p1, p2, :cond_5

    .line 214
    invoke-virtual {p0, p1, p2}, Ll/۟ܰᩳ;->֫(II)Ll/۟ܰᩳ;

    move-result-object p0

    invoke-static {v1, p0, v0}, Ll/ۧ۟ᩳ;->֫(Ll/۟ܰᩳ;Ll/۟ܰᩳ;Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object p0

    return-object p0

    :cond_5
    invoke-static {v1, v0}, Ll/ۧ۟ᩳ;->ᩳ(Ll/۟ܰᩳ;Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/۟ܰᩳ;Ll/۟ܰᩳ;)Ll/۟ܰᩳ;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۧ۟ᩳ;->ᩳ(Ll/۟ܰᩳ;Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۧ۟ᩳ;)Ll/۟ܰᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۧ۟ᩳ;->֫:Ll/۟ܰᩳ;

    return-object p0
.end method

.method public static ۧ(Ll/۟ܰᩳ;ILl/ۨܰᩳ;)V
    .locals 3

    .line 136
    invoke-static {p0}, Ll/ۧ۟ᩳ;->ܽ(Ll/۟ܰᩳ;)V

    .line 137
    iget-object v0, p0, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    if-nez v0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 372
    :cond_0
    iget v1, v0, Ll/۟ܰᩳ;->ۧ:I

    :goto_0
    if-ge p1, v1, :cond_1

    .line 138
    invoke-static {v0, p1, p2}, Ll/ۧ۟ᩳ;->ۧ(Ll/۟ܰᩳ;ILl/ۨܰᩳ;)V

    return-void

    .line 139
    :cond_1
    iget v0, p0, Ll/۟ܰᩳ;->֡:I

    add-int v2, v1, v0

    if-lt p1, v2, :cond_2

    iget-object p0, p0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    sub-int/2addr p1, v1

    sub-int/2addr p1, v0

    invoke-static {p0, p1, p2}, Ll/ۧ۟ᩳ;->ۧ(Ll/۟ܰᩳ;ILl/ۨܰᩳ;)V

    return-void

    :cond_2
    sub-int/2addr p1, v1

    .line 140
    invoke-virtual {p0, p1, p2}, Ll/۟ܰᩳ;->ܽ(ILl/ۨܰᩳ;)V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۧ۟ᩳ;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ۧ۟ᩳ;->֫(I)V

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ۧ۟ᩳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۧ۟ᩳ;->ۧ:I

    return p0
.end method

.method public static ܽ(Ll/۟ܰᩳ;Ll/۟ܰᩳ;)Ll/۟ܰᩳ;
    .locals 10

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    return-object p0

    :cond_1
    move-object v0, p0

    .line 288
    :goto_0
    iget-object v1, v0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    if-eqz v1, :cond_2

    move-object v0, v1

    goto :goto_0

    :cond_2
    move-object v1, p1

    .line 289
    :goto_1
    iget-object v2, v1, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    if-eqz v2, :cond_3

    move-object v1, v2

    goto :goto_1

    .line 290
    :cond_3
    iget v0, v0, Ll/۟ܰᩳ;->֡:I

    iget v2, v1, Ll/۟ܰᩳ;->֡:I

    add-int v3, v0, v2

    const/16 v4, 0x400

    if-le v3, v4, :cond_4

    const/16 v5, 0x200

    if-lt v0, v5, :cond_4

    if-lt v2, v5, :cond_4

    .line 292
    invoke-static {p0, p1}, Ll/ۧ۟ᩳ;->ᩳ(Ll/۟ܰᩳ;Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object p0

    return-object p0

    .line 372
    :cond_4
    iget v2, p0, Ll/۟ܰᩳ;->ۧ:I

    sub-int/2addr v2, v0

    .line 293
    invoke-static {p0, v2}, Ll/ۧ۟ᩳ;->֫(Ll/۟ܰᩳ;I)Ll/֫۟ᩳ;

    move-result-object p0

    iget v0, v1, Ll/۟ܰᩳ;->֡:I

    invoke-static {p1, v0}, Ll/ۧ۟ᩳ;->֫(Ll/۟ܰᩳ;I)Ll/֫۟ᩳ;

    move-result-object p1

    .line 294
    invoke-static {p0}, Ll/֫۟ᩳ;->ۧ(Ll/֫۟ᩳ;)Ll/۟ܰᩳ;

    move-result-object v0

    invoke-static {p1}, Ll/֫۟ᩳ;->֫(Ll/֫۟ᩳ;)Ll/۟ܰᩳ;

    move-result-object v1

    .line 295
    invoke-static {v0}, Ll/ۧ۟ᩳ;->ܽ(Ll/۟ܰᩳ;)V

    .line 296
    invoke-static {v1}, Ll/ۧ۟ᩳ;->ܽ(Ll/۟ܰᩳ;)V

    if-le v3, v4, :cond_5

    .line 297
    new-instance v2, Ll/۟ܰᩳ;

    add-int/lit8 v4, v3, 0x1

    div-int/lit8 v4, v4, 0x2

    invoke-direct {v2, v4}, Ll/۟ܰᩳ;-><init>(I)V

    goto :goto_2

    :cond_5
    const/4 v2, 0x0

    :goto_2
    if-nez v2, :cond_6

    move v4, v3

    goto :goto_3

    .line 298
    :cond_6
    div-int/lit8 v4, v3, 0x2

    .line 299
    :goto_3
    new-instance v5, Ll/۟ܰᩳ;

    invoke-direct {v5, v4}, Ll/۟ܰᩳ;-><init>(I)V

    .line 300
    new-instance v6, Ll/ۨܰᩳ;

    invoke-direct {v6}, Ll/ۨܰᩳ;-><init>()V

    const/4 v7, 0x0

    :goto_4
    if-ge v7, v3, :cond_a

    .line 302
    iget v8, v0, Ll/۟ܰᩳ;->֡:I

    if-ge v7, v8, :cond_7

    move-object v9, v0

    goto :goto_5

    :cond_7
    move-object v9, v1

    :goto_5
    if-ge v7, v8, :cond_8

    move v8, v7

    goto :goto_6

    :cond_8
    sub-int v8, v7, v8

    .line 304
    :goto_6
    invoke-virtual {v9, v8, v6}, Ll/۟ܰᩳ;->ۧ(ILl/ۨܰᩳ;)V

    if-ge v7, v4, :cond_9

    move-object v8, v5

    goto :goto_7

    :cond_9
    move-object v8, v2

    .line 305
    :goto_7
    invoke-virtual {v8, v6}, Ll/۟ܰᩳ;->֫(Ll/ۨܰᩳ;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    .line 307
    :cond_a
    invoke-static {p0}, Ll/֫۟ᩳ;->֫(Ll/֫۟ᩳ;)Ll/۟ܰᩳ;

    move-result-object p0

    invoke-static {p0, v5}, Ll/ۧ۟ᩳ;->ᩳ(Ll/۟ܰᩳ;Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object p0

    invoke-static {p1}, Ll/֫۟ᩳ;->ۧ(Ll/֫۟ᩳ;)Ll/۟ܰᩳ;

    move-result-object p1

    invoke-static {v2, p1}, Ll/ۧ۟ᩳ;->ᩳ(Ll/۟ܰᩳ;Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object p1

    invoke-static {p0, p1}, Ll/ۧ۟ᩳ;->ᩳ(Ll/۟ܰᩳ;Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(Ll/۟ܰᩳ;)V
    .locals 3

    .line 388
    iget v0, p0, Ll/۟ܰᩳ;->ܿ:I

    if-nez v0, :cond_1

    iget v1, p0, Ll/۟ܰᩳ;->ܳ:I

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 389
    :cond_1
    :goto_0
    iget-object v1, p0, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    iget v2, p0, Ll/۟ܰᩳ;->ܳ:I

    invoke-static {v1, v0, v2}, Ll/ۧ۟ᩳ;->ܽ(Ll/۟ܰᩳ;II)V

    .line 390
    iget-object v0, p0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    iget v1, p0, Ll/۟ܰᩳ;->ܿ:I

    iget v2, p0, Ll/۟ܰᩳ;->ܳ:I

    invoke-static {v0, v1, v2}, Ll/ۧ۟ᩳ;->ܽ(Ll/۟ܰᩳ;II)V

    const/4 v0, 0x0

    .line 391
    iput v0, p0, Ll/۟ܰᩳ;->ܳ:I

    iput v0, p0, Ll/۟ܰᩳ;->ܿ:I

    return-void
.end method

.method public static ܽ(Ll/۟ܰᩳ;II)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 381
    :cond_0
    iget v0, p0, Ll/۟ܰᩳ;->֫:I

    add-int/2addr v0, p1

    iput v0, p0, Ll/۟ܰᩳ;->֫:I

    .line 382
    iget v0, p0, Ll/۟ܰᩳ;->᩷:I

    add-int/2addr v0, p2

    iput v0, p0, Ll/۟ܰᩳ;->᩷:I

    .line 383
    iget v0, p0, Ll/۟ܰᩳ;->ܿ:I

    add-int/2addr v0, p1

    iput v0, p0, Ll/۟ܰᩳ;->ܿ:I

    .line 384
    iget p1, p0, Ll/۟ܰᩳ;->ܳ:I

    add-int/2addr p1, p2

    iput p1, p0, Ll/۟ܰᩳ;->ܳ:I

    return-void
.end method

.method public static ᩳ(Ll/۟ܰᩳ;Ll/۟ܰᩳ;)Ll/۟ܰᩳ;
    .locals 1

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    return-object p0

    .line 313
    :cond_1
    invoke-static {p0}, Ll/ۧ۟ᩳ;->ܽ(Ll/۟ܰᩳ;)V

    .line 314
    iget-object v0, p0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    invoke-static {v0, p0, p1}, Ll/ۧ۟ᩳ;->֫(Ll/۟ܰᩳ;Ll/۟ܰᩳ;Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object p0

    return-object p0

    .line 315
    :cond_2
    invoke-static {v0, p1}, Ll/ۧ۟ᩳ;->ᩳ(Ll/۟ܰᩳ;Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    .line 317
    iget-object v0, p0, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    invoke-static {v0, p0, p1}, Ll/ۧ۟ᩳ;->֫(Ll/۟ܰᩳ;Ll/۟ܰᩳ;Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object p0

    return-object p0
.end method

.method public static ᩳ(Ll/۟ܰᩳ;)V
    .locals 5

    .line 375
    iget-object v0, p0, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    .line 372
    :cond_0
    iget v2, v0, Ll/۟ܰᩳ;->ۧ:I

    .line 375
    :goto_0
    iget v3, p0, Ll/۟ܰᩳ;->֡:I

    add-int/2addr v2, v3

    iget-object v3, p0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    if-nez v3, :cond_1

    const/4 v4, 0x0

    goto :goto_1

    .line 372
    :cond_1
    iget v4, v3, Ll/۟ܰᩳ;->ۧ:I

    :goto_1
    add-int/2addr v2, v4

    .line 375
    iput v2, p0, Ll/۟ܰᩳ;->ۧ:I

    if-nez v0, :cond_2

    const/4 v0, 0x0

    goto :goto_2

    .line 373
    :cond_2
    iget v0, v0, Ll/۟ܰᩳ;->ᩳ:I

    :goto_2
    if-nez v3, :cond_3

    goto :goto_3

    :cond_3
    iget v1, v3, Ll/۟ܰᩳ;->ᩳ:I

    .line 376
    :goto_3
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/۟ܰᩳ;->ᩳ:I

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Ll/ۧ۟ᩳ;->֫:Ll/۟ܰᩳ;

    iget v0, p0, Ll/ۧ۟ᩳ;->ۧ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۧ۟ᩳ;->ۧ:I

    return-void
.end method

.method public final ֫(II)V
    .locals 1

    if-ltz p1, :cond_1

    if-lt p2, p1, :cond_1

    .line 239
    invoke-virtual {p0}, Ll/ۧ۟ᩳ;->ۧ()I

    move-result v0

    if-gt p2, v0, :cond_1

    if-ne p1, p2, :cond_0

    return-void

    .line 241
    :cond_0
    iget-object v0, p0, Ll/ۧ۟ᩳ;->֫:Ll/۟ܰᩳ;

    invoke-static {v0, p1, p2}, Ll/ۧ۟ᩳ;->֫(Ll/۟ܰᩳ;II)V

    .line 242
    iget p1, p0, Ll/ۧ۟ᩳ;->ۧ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۧ۟ᩳ;->ۧ:I

    return-void

    .line 239
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final ֫(IIII)V
    .locals 1

    if-ltz p1, :cond_2

    if-lt p2, p1, :cond_2

    .line 218
    invoke-virtual {p0}, Ll/ۧ۟ᩳ;->ۧ()I

    move-result v0

    if-gt p2, v0, :cond_2

    if-eq p1, p2, :cond_1

    if-nez p3, :cond_0

    if-nez p4, :cond_0

    goto :goto_0

    .line 220
    :cond_0
    iget-object v0, p0, Ll/ۧ۟ᩳ;->֫:Ll/۟ܰᩳ;

    invoke-static {v0, p1, p2, p3, p4}, Ll/ۧ۟ᩳ;->֫(Ll/۟ܰᩳ;IIII)V

    .line 221
    iget p1, p0, Ll/ۧ۟ᩳ;->ۧ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۧ۟ᩳ;->ۧ:I

    :cond_1
    :goto_0
    return-void

    .line 218
    :cond_2
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final ֫(IILl/ۧ۟ᩳ;)V
    .locals 1

    if-ltz p1, :cond_0

    if-lt p2, p1, :cond_0

    .line 187
    invoke-virtual {p3}, Ll/ۧ۟ᩳ;->ۧ()I

    move-result v0

    if-gt p2, v0, :cond_0

    .line 188
    iget-object p3, p3, Ll/ۧ۟ᩳ;->֫:Ll/۟ܰᩳ;

    invoke-static {p3, p1, p2}, Ll/ۧ۟ᩳ;->ۧ(Ll/۟ܰᩳ;II)Ll/۟ܰᩳ;

    move-result-object p1

    .line 189
    iget-object p2, p0, Ll/ۧ۟ᩳ;->֫:Ll/۟ܰᩳ;

    invoke-static {p2, p1}, Ll/ۧ۟ᩳ;->ܽ(Ll/۟ܰᩳ;Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/ۧ۟ᩳ;->֫:Ll/۟ܰᩳ;

    .line 190
    iget p1, p0, Ll/ۧ۟ᩳ;->ۧ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۧ۟ᩳ;->ۧ:I

    return-void

    .line 187
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final ֫(ILl/ۨܰᩳ;)V
    .locals 1

    if-ltz p1, :cond_0

    .line 145
    invoke-virtual {p0}, Ll/ۧ۟ᩳ;->ۧ()I

    move-result v0

    if-gt p1, v0, :cond_0

    .line 146
    iget-object v0, p0, Ll/ۧ۟ᩳ;->֫:Ll/۟ܰᩳ;

    invoke-static {v0, p1, p2}, Ll/ۧ۟ᩳ;->֫(Ll/۟ܰᩳ;ILl/ۨܰᩳ;)Ll/۟ܰᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/ۧ۟ᩳ;->֫:Ll/۟ܰᩳ;

    .line 147
    iget p1, p0, Ll/ۧ۟ᩳ;->ۧ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۧ۟ᩳ;->ۧ:I

    return-void

    .line 145
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final ֫(Ll/ۧ۟ᩳ;)Z
    .locals 1

    if-eq p1, p0, :cond_1

    .line 196
    iget-object v0, p1, Ll/ۧ۟ᩳ;->֫:Ll/۟ܰᩳ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 198
    :cond_0
    invoke-virtual {p1}, Ll/ۧ۟ᩳ;->֫()V

    .line 199
    iget-object p1, p0, Ll/ۧ۟ᩳ;->֫:Ll/۟ܰᩳ;

    invoke-static {p1, v0}, Ll/ۧ۟ᩳ;->ܽ(Ll/۟ܰᩳ;Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/ۧ۟ᩳ;->֫:Ll/۟ܰᩳ;

    .line 200
    iget p1, p0, Ll/ۧ۟ᩳ;->ۧ:I

    const/4 v0, 0x1

    add-int/2addr p1, v0

    iput p1, p0, Ll/ۧ۟ᩳ;->ۧ:I

    return v0

    .line 195
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot transfer a line table to itself"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()I
    .locals 1

    .line 12
    iget-object v0, p0, Ll/ۧ۟ᩳ;->֫:Ll/۟ܰᩳ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 372
    :cond_0
    iget v0, v0, Ll/۟ܰᩳ;->ۧ:I

    return v0
.end method

.method public final ۧ(II)I
    .locals 6

    .line 116
    invoke-direct {p0, p1}, Ll/ۧ۟ᩳ;->֫(I)V

    .line 117
    iget-object v0, p0, Ll/ۧ۟ᩳ;->֫:Ll/۟ܰᩳ;

    const/4 v1, 0x0

    .line 120
    :goto_0
    iget-object v2, v0, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    if-nez v2, :cond_0

    const/4 v3, 0x0

    goto :goto_1

    .line 372
    :cond_0
    iget v3, v2, Ll/۟ܰᩳ;->ۧ:I

    :goto_1
    const/4 v4, 0x2

    if-lt p1, v3, :cond_4

    .line 121
    iget v5, v0, Ll/۟ܰᩳ;->֡:I

    add-int/2addr v5, v3

    if-ge p1, v5, :cond_4

    sub-int/2addr p1, v3

    if-ne p2, v4, :cond_1

    .line 482
    invoke-virtual {v0, p1}, Ll/۟ܰᩳ;->ܽ(I)I

    move-result p1

    iget p2, v0, Ll/۟ܰᩳ;->᩷:I

    add-int/2addr p1, p2

    goto :goto_3

    .line 483
    :cond_1
    invoke-virtual {v0, p1}, Ll/۟ܰᩳ;->ᩳ(I)I

    move-result v2

    iget v3, v0, Ll/۟ܰᩳ;->֫:I

    add-int/2addr v2, v3

    if-nez p2, :cond_2

    move p1, v2

    goto :goto_3

    .line 472
    :cond_2
    iget-object p2, v0, Ll/۟ܰᩳ;->ۜ:[C

    if-eqz p2, :cond_3

    aget-char p1, p2, p1

    goto :goto_2

    :cond_3
    iget-object p2, v0, Ll/۟ܰᩳ;->ۚ:[I

    aget p1, p2, p1

    :goto_2
    add-int/2addr p1, v2

    :goto_3
    add-int/2addr p1, v1

    return p1

    :cond_4
    if-ne p2, v4, :cond_5

    .line 123
    iget v4, v0, Ll/۟ܰᩳ;->ܳ:I

    goto :goto_4

    :cond_5
    iget v4, v0, Ll/۟ܰᩳ;->ܿ:I

    :goto_4
    add-int/2addr v1, v4

    if-ge p1, v3, :cond_6

    move-object v0, v2

    goto :goto_0

    .line 125
    :cond_6
    iget v2, v0, Ll/۟ܰᩳ;->֡:I

    add-int/2addr v3, v2

    sub-int/2addr p1, v3

    iget-object v0, v0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    goto :goto_0
.end method

.method public final ۧ(IILl/ۧ۟ᩳ;)V
    .locals 2

    if-ltz p1, :cond_0

    if-lt p2, p1, :cond_0

    .line 177
    invoke-virtual {p0}, Ll/ۧ۟ᩳ;->ۧ()I

    move-result v0

    if-gt p2, v0, :cond_0

    .line 178
    iget-object p3, p3, Ll/ۧ۟ᩳ;->֫:Ll/۟ܰᩳ;

    invoke-static {p3}, Ll/ۧ۟ᩳ;->ۧ(Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object p3

    .line 179
    iget-object v0, p0, Ll/ۧ۟ᩳ;->֫:Ll/۟ܰᩳ;

    invoke-static {v0, p1}, Ll/ۧ۟ᩳ;->֫(Ll/۟ܰᩳ;I)Ll/֫۟ᩳ;

    move-result-object v0

    .line 180
    invoke-static {v0}, Ll/֫۟ᩳ;->ۧ(Ll/֫۟ᩳ;)Ll/۟ܰᩳ;

    move-result-object v1

    sub-int/2addr p2, p1

    invoke-static {v1, p2}, Ll/ۧ۟ᩳ;->֫(Ll/۟ܰᩳ;I)Ll/֫۟ᩳ;

    move-result-object p1

    .line 181
    invoke-static {v0}, Ll/֫۟ᩳ;->֫(Ll/֫۟ᩳ;)Ll/۟ܰᩳ;

    move-result-object p2

    invoke-static {p2, p3}, Ll/ۧ۟ᩳ;->ܽ(Ll/۟ܰᩳ;Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object p2

    invoke-static {p1}, Ll/֫۟ᩳ;->ۧ(Ll/֫۟ᩳ;)Ll/۟ܰᩳ;

    move-result-object p1

    invoke-static {p2, p1}, Ll/ۧ۟ᩳ;->ܽ(Ll/۟ܰᩳ;Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/ۧ۟ᩳ;->֫:Ll/۟ܰᩳ;

    .line 182
    iget p1, p0, Ll/ۧ۟ᩳ;->ۧ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۧ۟ᩳ;->ۧ:I

    return-void

    .line 177
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final ۧ(ILl/ۨܰᩳ;)V
    .locals 6

    .line 98
    invoke-direct {p0, p1}, Ll/ۧ۟ᩳ;->֫(I)V

    .line 99
    iget-object v0, p0, Ll/ۧ۟ᩳ;->֫:Ll/۟ܰᩳ;

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 102
    :goto_0
    iget-object v3, v0, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    if-nez v3, :cond_0

    const/4 v4, 0x0

    goto :goto_1

    .line 372
    :cond_0
    iget v4, v3, Ll/۟ܰᩳ;->ۧ:I

    :goto_1
    if-lt p1, v4, :cond_1

    .line 103
    iget v5, v0, Ll/۟ܰᩳ;->֡:I

    add-int/2addr v5, v4

    if-ge p1, v5, :cond_1

    sub-int/2addr p1, v4

    .line 104
    invoke-virtual {v0, p1, p2}, Ll/۟ܰᩳ;->ۧ(ILl/ۨܰᩳ;)V

    .line 57
    iget p1, p2, Ll/ۨܰᩳ;->᩶:I

    add-int/2addr p1, v1

    iput p1, p2, Ll/ۨܰᩳ;->᩶:I

    .line 58
    iget p1, p2, Ll/ۨܰᩳ;->᩸:I

    add-int/2addr p1, v1

    iput p1, p2, Ll/ۨܰᩳ;->᩸:I

    .line 59
    iget p1, p2, Ll/ۨܰᩳ;->᩹:I

    add-int/2addr p1, v2

    iput p1, p2, Ll/ۨܰᩳ;->᩹:I

    return-void

    .line 108
    :cond_1
    iget v5, v0, Ll/۟ܰᩳ;->ܿ:I

    add-int/2addr v1, v5

    .line 109
    iget v5, v0, Ll/۟ܰᩳ;->ܳ:I

    add-int/2addr v2, v5

    if-ge p1, v4, :cond_2

    move-object v0, v3

    goto :goto_0

    .line 111
    :cond_2
    iget v3, v0, Ll/۟ܰᩳ;->֡:I

    add-int/2addr v4, v3

    sub-int/2addr p1, v4

    iget-object v0, v0, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    goto :goto_0
.end method

.method public final ܽ(ILl/ۨܰᩳ;)V
    .locals 1

    .line 130
    invoke-direct {p0, p1}, Ll/ۧ۟ᩳ;->֫(I)V

    .line 131
    iget-object v0, p0, Ll/ۧ۟ᩳ;->֫:Ll/۟ܰᩳ;

    invoke-static {v0, p1, p2}, Ll/ۧ۟ᩳ;->ۧ(Ll/۟ܰᩳ;ILl/ۨܰᩳ;)V

    iput-object v0, p0, Ll/ۧ۟ᩳ;->֫:Ll/۟ܰᩳ;

    .line 132
    iget p1, p0, Ll/ۧ۟ᩳ;->ۧ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۧ۟ᩳ;->ۧ:I

    return-void
.end method
