.class public abstract Ll/ܶ᩶ۚ;
.super Ljava/lang/Object;
.source "L57K"


# instance fields
.field public final ֫:I

.field public ۧ:Ll/ܶ᩶ۚ;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/high16 v0, 0x90000

    const/4 v1, 0x0

    .line 72
    invoke-direct {p0, v0, v1}, Ll/ܶ᩶ۚ;-><init>(ILl/ܶ᩶ۚ;)V

    return-void
.end method

.method public constructor <init>(ILl/ܶ᩶ۚ;)V
    .locals 2

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x90000

    const/high16 v1, 0x10a0000

    if-eq p1, v0, :cond_1

    const/high16 v0, 0x80000

    if-eq p1, v0, :cond_1

    const/high16 v0, 0x70000

    if-eq p1, v0, :cond_1

    const/high16 v0, 0x60000

    if-eq p1, v0, :cond_1

    const/high16 v0, 0x50000

    if-eq p1, v0, :cond_1

    const/high16 v0, 0x40000

    if-eq p1, v0, :cond_1

    if-ne p1, v1, :cond_0

    goto :goto_0

    .line 91
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unsupported api "

    .line 0
    invoke-static {p1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 91
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    if-ne p1, v1, :cond_2

    .line 94
    invoke-static {p0}, Ll/ۢ᩶ۚ;->֫(Ljava/lang/Object;)V

    .line 96
    :cond_2
    iput p1, p0, Ll/ܶ᩶ۚ;->֫:I

    .line 97
    iput-object p2, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    return-void
.end method


# virtual methods
.method public ֫()Ll/ܰ᩹ۚ;
    .locals 1

    .line 139
    iget-object v0, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-eqz v0, :cond_0

    .line 140
    invoke-virtual {v0}, Ll/ܶ᩶ۚ;->֫()Ll/ܰ᩹ۚ;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public ֫(ILjava/lang/String;Z)Ll/ܰ᩹ۚ;
    .locals 1

    .line 223
    iget-object v0, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-eqz v0, :cond_0

    .line 224
    invoke-virtual {v0, p1, p2, p3}, Ll/ܶ᩶ۚ;->֫(ILjava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public ֫(ILl/᩺᩶ۚ;Ljava/lang/String;Z)Ll/ܰ᩹ۚ;
    .locals 2

    .line 642
    iget v0, p0, Ll/ܶ᩶ۚ;->֫:I

    const/high16 v1, 0x50000

    if-lt v0, v1, :cond_1

    .line 645
    iget-object v0, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-eqz v0, :cond_0

    .line 646
    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ܶ᩶ۚ;->֫(ILl/᩺᩶ۚ;Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1

    .line 643
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "This feature requires ASM5"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ֫(ILl/᩺᩶ۚ;[Ll/֨᩶ۚ;[Ll/֨᩶ۚ;[ILjava/lang/String;Z)Ll/ܰ᩹ۚ;
    .locals 11

    move-object v0, p0

    .line 754
    iget v1, v0, Ll/ܶ᩶ۚ;->֫:I

    const/high16 v2, 0x50000

    if-lt v1, v2, :cond_1

    .line 757
    iget-object v3, v0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-eqz v3, :cond_0

    move v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move/from16 v10, p7

    .line 758
    invoke-virtual/range {v3 .. v10}, Ll/ܶ᩶ۚ;->֫(ILl/᩺᩶ۚ;[Ll/֨᩶ۚ;[Ll/֨᩶ۚ;[ILjava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object v1

    return-object v1

    :cond_0
    const/4 v1, 0x0

    return-object v1

    .line 755
    :cond_1
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    const-string v2, "This feature requires ASM5"

    invoke-direct {v1, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public ֫(Ljava/lang/String;Z)Ll/ܰ᩹ۚ;
    .locals 1

    .line 154
    iget-object v0, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-eqz v0, :cond_0

    .line 155
    invoke-virtual {v0, p1, p2}, Ll/ܶ᩶ۚ;->֫(Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public ֫(I)V
    .locals 1

    .line 336
    iget-object v0, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-eqz v0, :cond_0

    .line 337
    invoke-virtual {v0, p1}, Ll/ܶ᩶ۚ;->֫(I)V

    :cond_0
    return-void
.end method

.method public ֫(II)V
    .locals 1

    .line 574
    iget-object v0, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-eqz v0, :cond_0

    .line 575
    invoke-virtual {v0, p1, p2}, Ll/ܶ᩶ۚ;->֫(II)V

    :cond_0
    return-void
.end method

.method public ֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 6

    .line 312
    iget-object v0, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-eqz v0, :cond_0

    move v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 313
    invoke-virtual/range {v0 .. v5}, Ll/ܶ᩶ۚ;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public varargs ֫(IILl/֨᩶ۚ;[Ll/֨᩶ۚ;)V
    .locals 1

    .line 590
    iget-object v0, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-eqz v0, :cond_0

    .line 591
    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ܶ᩶ۚ;->֫(IILl/֨᩶ۚ;[Ll/֨᩶ۚ;)V

    :cond_0
    return-void
.end method

.method public ֫(ILjava/lang/String;)V
    .locals 1

    .line 616
    iget-object v0, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-eqz v0, :cond_0

    .line 617
    invoke-virtual {v0, p1, p2}, Ll/ܶ᩶ۚ;->֫(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public ֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 6

    .line 443
    iget v0, p0, Ll/ܶ᩶ۚ;->֫:I

    const/high16 v1, 0x50000

    if-ge v0, v1, :cond_2

    and-int/lit16 v0, p1, 0x100

    if-nez v0, :cond_2

    const/16 v0, 0xb9

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-ne p5, v0, :cond_1

    .line 447
    invoke-virtual {p0, p2, p1, p3, p4}, Ll/ܶ᩶ۚ;->ۧ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    return-void

    .line 445
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "INVOKESPECIAL/STATIC on interfaces requires ASM5"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 450
    :cond_2
    iget-object v0, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-eqz v0, :cond_3

    and-int/lit16 v1, p1, -0x101

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    .line 451
    invoke-virtual/range {v0 .. v5}, Ll/ܶ᩶ۚ;->֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    :cond_3
    return-void
.end method

.method public ֫(ILl/֨᩶ۚ;)V
    .locals 1

    .line 490
    iget-object v0, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-eqz v0, :cond_0

    .line 491
    invoke-virtual {v0, p1, p2}, Ll/ܶ᩶ۚ;->֫(ILl/֨᩶ۚ;)V

    :cond_0
    return-void
.end method

.method public ֫(IZ)V
    .locals 1

    .line 202
    iget-object v0, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-eqz v0, :cond_0

    .line 203
    invoke-virtual {v0, p1, p2}, Ll/ܶ᩶ۚ;->֫(IZ)V

    :cond_0
    return-void
.end method

.method public ֫(Ljava/lang/Object;)V
    .locals 3

    const/high16 v0, 0x50000

    .line 554
    iget v1, p0, Ll/ܶ᩶ۚ;->֫:I

    if-ge v1, v0, :cond_1

    instance-of v0, p1, Ll/֡᩶ۚ;

    if-nez v0, :cond_0

    instance-of v0, p1, Ll/ۨ᩶ۚ;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Ll/ۨ᩶ۚ;

    .line 556
    invoke-virtual {v0}, Ll/ۨ᩶ۚ;->ܿ()I

    move-result v0

    const/16 v2, 0xb

    if-eq v0, v2, :cond_0

    goto :goto_0

    .line 557
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "This feature requires ASM5"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    const/high16 v0, 0x70000

    if-ge v1, v0, :cond_3

    .line 559
    instance-of v0, p1, Ll/᩷᩶ۚ;

    if-nez v0, :cond_2

    goto :goto_1

    .line 560
    :cond_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "This feature requires ASM7"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 562
    :cond_3
    :goto_1
    iget-object v0, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-eqz v0, :cond_4

    .line 563
    invoke-virtual {v0, p1}, Ll/ܶ᩶ۚ;->֫(Ljava/lang/Object;)V

    :cond_4
    return-void
.end method

.method public ֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 403
    iget-object v0, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-eqz v0, :cond_0

    .line 404
    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ܶ᩶ۚ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/֨᩶ۚ;Ll/֨᩶ۚ;I)V
    .locals 7

    .line 721
    iget-object v0, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-eqz v0, :cond_0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    .line 722
    invoke-virtual/range {v0 .. v6}, Ll/ܶ᩶ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/֨᩶ۚ;Ll/֨᩶ۚ;I)V

    :cond_0
    return-void
.end method

.method public varargs ֫(Ljava/lang/String;Ljava/lang/String;Ll/֡᩶ۚ;[Ljava/lang/Object;)V
    .locals 2

    .line 471
    iget v0, p0, Ll/ܶ᩶ۚ;->֫:I

    const/high16 v1, 0x50000

    if-lt v0, v1, :cond_1

    .line 474
    iget-object v0, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-eqz v0, :cond_0

    .line 475
    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ܶ᩶ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/֡᩶ۚ;[Ljava/lang/Object;)V

    :cond_0
    return-void

    .line 472
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "This feature requires ASM5"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ֫(Ll/֨᩶ۚ;)V
    .locals 1

    .line 501
    iget-object v0, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-eqz v0, :cond_0

    .line 502
    invoke-virtual {v0, p1}, Ll/ܶ᩶ۚ;->֫(Ll/֨᩶ۚ;)V

    :cond_0
    return-void
.end method

.method public ֫(Ll/֨᩶ۚ;Ll/֨᩶ۚ;Ll/֨᩶ۚ;Ljava/lang/String;)V
    .locals 1

    .line 669
    iget-object v0, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-eqz v0, :cond_0

    .line 670
    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ܶ᩶ۚ;->֫(Ll/֨᩶ۚ;Ll/֨᩶ۚ;Ll/֨᩶ۚ;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public ֫(Ll/֨᩶ۚ;[I[Ll/֨᩶ۚ;)V
    .locals 1

    .line 604
    iget-object v0, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-eqz v0, :cond_0

    .line 605
    invoke-virtual {v0, p1, p2, p3}, Ll/ܶ᩶ۚ;->֫(Ll/֨᩶ۚ;[I[Ll/֨᩶ۚ;)V

    :cond_0
    return-void
.end method

.method public ֫(Ll/ܽ᩶ۚ;)V
    .locals 1

    .line 235
    iget-object v0, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-eqz v0, :cond_0

    .line 236
    invoke-virtual {v0, p1}, Ll/ܶ᩶ۚ;->֫(Ll/ܽ᩶ۚ;)V

    :cond_0
    return-void
.end method

.method public ۧ(ILl/᩺᩶ۚ;Ljava/lang/String;Z)Ll/ܰ᩹ۚ;
    .locals 2

    .line 691
    iget v0, p0, Ll/ܶ᩶ۚ;->֫:I

    const/high16 v1, 0x50000

    if-lt v0, v1, :cond_1

    .line 694
    iget-object v0, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-eqz v0, :cond_0

    .line 695
    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ܶ᩶ۚ;->ۧ(ILl/᩺᩶ۚ;Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1

    .line 692
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "This feature requires ASM5"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۧ()V
    .locals 1

    .line 242
    iget-object v0, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-eqz v0, :cond_0

    .line 243
    invoke-virtual {v0}, Ll/ܶ᩶ۚ;->ۧ()V

    :cond_0
    return-void
.end method

.method public ۧ(II)V
    .locals 1

    .line 356
    iget-object v0, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-eqz v0, :cond_0

    .line 357
    invoke-virtual {v0, p1, p2}, Ll/ܶ᩶ۚ;->ۧ(II)V

    :cond_0
    return-void
.end method

.method public ۧ(ILjava/lang/String;)V
    .locals 2

    .line 122
    iget v0, p0, Ll/ܶ᩶ۚ;->֫:I

    const/high16 v1, 0x50000

    if-lt v0, v1, :cond_1

    .line 125
    iget-object v0, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-eqz v0, :cond_0

    .line 126
    invoke-virtual {v0, p1, p2}, Ll/ܶ᩶ۚ;->ۧ(ILjava/lang/String;)V

    :cond_0
    return-void

    .line 123
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "This feature requires ASM5"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۧ(ILl/֨᩶ۚ;)V
    .locals 1

    .line 774
    iget-object v0, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-eqz v0, :cond_0

    .line 775
    invoke-virtual {v0, p1, p2}, Ll/ܶ᩶ۚ;->ۧ(ILl/֨᩶ۚ;)V

    :cond_0
    return-void
.end method

.method public final ۧ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 7
    .annotation runtime Ljava/lang/Deprecated;
        forRemoval = false
    .end annotation

    .line 422
    iget v0, p0, Ll/ܶ᩶ۚ;->֫:I

    const/high16 v1, 0x50000

    if-ge v0, v1, :cond_0

    const/16 v0, 0x100

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    or-int v2, p2, v0

    const/16 v0, 0xb9

    if-ne p2, v0, :cond_1

    const/4 p2, 0x1

    const/4 v6, 0x1

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    const/4 v6, 0x0

    :goto_1
    move-object v1, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p4

    .line 423
    invoke-virtual/range {v1 .. v6}, Ll/ܶ᩶ۚ;->֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public ܽ(ILl/᩺᩶ۚ;Ljava/lang/String;Z)Ll/ܰ᩹ۚ;
    .locals 2

    .line 178
    iget v0, p0, Ll/ܶ᩶ۚ;->֫:I

    const/high16 v1, 0x50000

    if-lt v0, v1, :cond_1

    .line 181
    iget-object v0, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-eqz v0, :cond_0

    .line 182
    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ܶ᩶ۚ;->ܽ(ILl/᩺᩶ۚ;Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1

    .line 179
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "This feature requires ASM5"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ܽ()V
    .locals 1

    .line 796
    iget-object v0, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-eqz v0, :cond_0

    .line 797
    invoke-virtual {v0}, Ll/ܶ᩶ۚ;->ܽ()V

    :cond_0
    return-void
.end method

.method public ܽ(II)V
    .locals 1

    .line 786
    iget-object v0, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-eqz v0, :cond_0

    .line 787
    invoke-virtual {v0, p1, p2}, Ll/ܶ᩶ۚ;->ܽ(II)V

    :cond_0
    return-void
.end method

.method public ܽ(ILjava/lang/String;)V
    .locals 1

    .line 386
    iget-object v0, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-eqz v0, :cond_0

    .line 387
    invoke-virtual {v0, p1, p2}, Ll/ܶ᩶ۚ;->ܽ(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public ᩳ(II)V
    .locals 1

    .line 371
    iget-object v0, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-eqz v0, :cond_0

    .line 372
    invoke-virtual {v0, p1, p2}, Ll/ܶ᩶ۚ;->ᩳ(II)V

    :cond_0
    return-void
.end method
