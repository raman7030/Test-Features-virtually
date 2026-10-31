.class public final Ll/۬᩷ۜ;
.super Ljava/lang/Object;
.source "1799"

# interfaces
.implements Ll/ۧۨ֡;


# instance fields
.field public ֫:Ll/ۗ᩷ۜ;

.field public ۜ:Z

.field public final synthetic ۢ:Ll/ۤ᩷ۜ;

.field public ۧ:Ll/ܽۨ֡;

.field public ܳ:Ljava/lang/String;

.field public ܽ:Ljava/util/ArrayList;

.field public ܿ:Ll/ۡۢۜ;

.field public ᩳ:Ll/ۢۜۜ;

.field public ᩷:Ll/۫᩷ۜ;

.field public ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ۤ᩷ۜ;)V
    .locals 0

    .line 484
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬᩷ۜ;->ۢ:Ll/ۤ᩷ۜ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۢۜۜ;Ll/ۡۢۜ;Ljava/util/ArrayList;Ll/ܽۨ֡;ZLl/ۗ᩷ۜ;Ll/۫᩷ۜ;)V
    .locals 0

    .line 501
    iput-object p1, p0, Ll/۬᩷ۜ;->ᩳ:Ll/ۢۜۜ;

    .line 502
    iput-object p2, p0, Ll/۬᩷ۜ;->ܿ:Ll/ۡۢۜ;

    .line 503
    iput-object p3, p0, Ll/۬᩷ۜ;->ܽ:Ljava/util/ArrayList;

    .line 504
    iput-object p4, p0, Ll/۬᩷ۜ;->ۧ:Ll/ܽۨ֡;

    .line 505
    iput-boolean p5, p0, Ll/۬᩷ۜ;->ۜ:Z

    .line 506
    iput-object p6, p0, Ll/۬᩷ۜ;->֫:Ll/ۗ᩷ۜ;

    .line 507
    iput-object p7, p0, Ll/۬᩷ۜ;->᩷:Ll/۫᩷ۜ;

    const/4 p1, 0x0

    .line 508
    iput-object p1, p0, Ll/۬᩷ۜ;->ܳ:Ljava/lang/String;

    .line 509
    iput-object p1, p0, Ll/۬᩷ۜ;->᩻:Ljava/lang/String;

    return-void
.end method

.method public final ֫(IIILl/֨ۗ֡;)Z
    .locals 15

    move-object v0, p0

    move/from16 v8, p2

    move/from16 v6, p3

    .line 515
    iget-object v1, v0, Ll/۬᩷ۜ;->ۧ:Ll/ܽۨ֡;

    iget-object v5, v1, Ll/ܽۨ֡;->ۙ:Ll/۬ۛ֡;

    .line 517
    iget-object v1, v0, Ll/۬᩷ۜ;->ᩳ:Ll/ۢۜۜ;

    const-string v2, "dex_field"

    .line 308
    iget-object v1, v1, Ll/ۢۜۜ;->᩻:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "not_applicable"

    const-string v3, "exact_reference"

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eqz v1, :cond_4

    .line 518
    iget-object v1, v0, Ll/۬᩷ۜ;->ᩳ:Ll/ۢۜۜ;

    iget-object v4, v0, Ll/۬᩷ۜ;->֫:Ll/ۗ᩷ۜ;

    iget-object v7, v0, Ll/۬᩷ۜ;->᩷:Ll/۫᩷ۜ;

    const/4 v9, 0x2

    if-eq v8, v9, :cond_0

    goto :goto_0

    .line 244
    :cond_0
    invoke-virtual {v5}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v8

    .line 245
    invoke-virtual {v5, v6}, Ll/۬ۛ֡;->ۧ(I)I

    move-result v6

    .line 246
    invoke-virtual {v8, v6}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v10

    .line 247
    iget-object v11, v1, Ll/ۢۜۜ;->֫:Ljava/lang/String;

    iget-object v1, v1, Ll/ۢۜۜ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v14

    invoke-virtual {v5, v10, v12, v14, v11}, Ll/۬ۛ֡;->ۧ(IIILjava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_1

    goto :goto_0

    :cond_1
    add-int/lit8 v11, v6, 0x4

    .line 250
    invoke-virtual {v8, v11}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v11

    .line 251
    iget v14, v7, Ll/۫᩷ۜ;->֫:I

    iget v7, v7, Ll/۫᩷ۜ;->ۧ:I

    invoke-virtual {v5, v11, v12, v14, v1}, Ll/۬ۛ֡;->֫(IIILjava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_2

    goto :goto_0

    :cond_2
    add-int/2addr v6, v9

    .line 254
    invoke-virtual {v8, v6}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v6

    .line 256
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v8

    sub-int/2addr v8, v7

    .line 255
    invoke-virtual {v5, v6, v7, v8, v1}, Ll/۬ۛ֡;->ۧ(IIILjava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_0

    .line 259
    :cond_3
    invoke-virtual {v5, v10}, Ll/۬ۛ֡;->ۡ(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "->"

    .line 0
    invoke-static {v5, v6, v1}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 520
    :cond_4
    iget-object v1, v0, Ll/۬᩷ۜ;->ᩳ:Ll/ۢۜۜ;

    const-string v4, "dex_class"

    .line 315
    iget-object v1, v1, Ll/ۢۜۜ;->᩻:Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 521
    iget-object v1, v0, Ll/۬᩷ۜ;->ᩳ:Ll/ۢۜۜ;

    iget-object v4, v0, Ll/۬᩷ۜ;->֫:Ll/ۗ᩷ۜ;

    if-eq v8, v13, :cond_5

    goto :goto_0

    .line 274
    :cond_5
    iget-object v1, v1, Ll/ۢۜۜ;->֫:Ljava/lang/String;

    .line 469
    invoke-virtual {v5, v6, v1}, Ll/۬ۛ֡;->֫(ILjava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_6

    :goto_0
    const/4 v1, 0x0

    goto :goto_2

    .line 277
    :cond_6
    invoke-virtual {v5, v6}, Ll/۬ۛ֡;->ۡ(I)Ljava/lang/String;

    move-result-object v1

    .line 555
    :goto_1
    iput-object v1, v4, Ll/ۗ᩷ۜ;->ܽ:Ljava/lang/String;

    .line 557
    iput-object v3, v4, Ll/ۗ᩷ۜ;->ۧ:Ljava/lang/String;

    .line 558
    iput-object v2, v4, Ll/ۗ᩷ۜ;->֫:Ljava/lang/String;

    const/4 v1, 0x1

    goto :goto_2

    .line 523
    :cond_7
    iget-object v2, v0, Ll/۬᩷ۜ;->ᩳ:Ll/ۢۜۜ;

    iget-object v3, v0, Ll/۬᩷ۜ;->ܿ:Ll/ۡۢۜ;

    iget-object v4, v0, Ll/۬᩷ۜ;->ۧ:Ll/ܽۨ֡;

    iget-boolean v9, v0, Ll/۬᩷ۜ;->ۜ:Z

    iget-object v10, v0, Ll/۬᩷ۜ;->֫:Ll/ۗ᩷ۜ;

    iget-object v11, v0, Ll/۬᩷ۜ;->᩷:Ll/۫᩷ۜ;

    iget-object v1, v0, Ll/۬᩷ۜ;->ۢ:Ll/ۤ᩷ۜ;

    move/from16 v6, p3

    move-object/from16 v7, p4

    move/from16 v8, p2

    invoke-static/range {v1 .. v11}, Ll/ۤ᩷ۜ;->֫(Ll/ۤ᩷ۜ;Ll/ۢۜۜ;Ll/ۡۢۜ;Ll/ܽۨ֡;Ll/۬ۛ֡;ILl/֨ۗ֡;IZLl/ۗ᩷ۜ;Ll/۫᩷ۜ;)Z

    move-result v1

    :goto_2
    if-nez v1, :cond_8

    goto/16 :goto_4

    .line 530
    :cond_8
    iget-object v1, v0, Ll/۬᩷ۜ;->᩻:Ljava/lang/String;

    if-nez v1, :cond_a

    .line 532
    iget-object v1, v0, Ll/۬᩷ۜ;->ۧ:Ll/ܽۨ֡;

    .line 183
    iget-object v1, v1, Ll/ܽۨ֡;->᩹:Ll/۠ۛ֡;

    invoke-virtual {v1}, Ll/۠ۛ֡;->getType()Ljava/lang/String;

    move-result-object v1

    .line 532
    iput-object v1, v0, Ll/۬᩷ۜ;->ܳ:Ljava/lang/String;

    .line 533
    iget-object v1, v0, Ll/۬᩷ۜ;->ۧ:Ll/ܽۨ֡;

    .line 1187
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1188
    invoke-virtual {v1}, Ll/ܽۨ֡;->ۘ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    .line 1189
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 1191
    :cond_9
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ll/ܽۨ֡;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ll/ܽۨ֡;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 533
    iput-object v1, v0, Ll/۬᩷ۜ;->᩻:Ljava/lang/String;

    .line 535
    :cond_a
    iget-object v1, v0, Ll/۬᩷ۜ;->ܽ:Ljava/util/ArrayList;

    new-instance v10, Ll/ܺ᩷ۜ;

    iget-object v3, v0, Ll/۬᩷ۜ;->ܳ:Ljava/lang/String;

    iget-object v4, v0, Ll/۬᩷ۜ;->᩻:Ljava/lang/String;

    iget-object v2, v0, Ll/۬᩷ۜ;->֫:Ll/ۗ᩷ۜ;

    iget-object v5, v2, Ll/ۗ᩷ۜ;->ܽ:Ljava/lang/String;

    iget-object v6, v2, Ll/ۗ᩷ۜ;->ۧ:Ljava/lang/String;

    iget-object v7, v2, Ll/ۗ᩷ۜ;->֫:Ljava/lang/String;

    move-object/from16 v2, p4

    iget-object v8, v2, Ll/֨ۗ֡;->ۗ:Ljava/lang/String;

    move-object v2, v10

    move/from16 v9, p1

    invoke-direct/range {v2 .. v9}, Ll/ܺ᩷ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 538
    iget-object v1, v0, Ll/۬᩷ۜ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget-object v2, v0, Ll/۬᩷ۜ;->ᩳ:Ll/ۢۜۜ;

    iget v2, v2, Ll/ۢۜۜ;->ܽ:I

    if-ge v1, v2, :cond_b

    :goto_4
    return v13

    :cond_b
    return v12
.end method
