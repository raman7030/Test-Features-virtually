.class public final Ll/֨᩺֫;
.super Ljava/lang/Object;
.source "U7MS"


# instance fields
.field public final ֡:Ljava/lang/String;

.field public final ֫:Landroid/net/Uri;

.field public final ۖ:J

.field public final ۘ:Ll/ܳ۬ܺ;

.field public final ۜ:Z

.field public final ۡ:J

.field public final ۢ:J

.field public final ۧ:Landroid/net/Uri;

.field public final ܳ:J

.field public final ܺ:Ll/ܳ۬ܺ;

.field public final ܽ:Ll/ܳ۬ܺ;

.field public final ܿ:Ljava/util/List;

.field public final ᩳ:Z

.field public final ᩴ:J

.field public final ᩵:Ljava/lang/String;

.field public final ᩷:Ljava/lang/String;

.field public final ᩻:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;JJJJLjava/util/ArrayList;ZJJLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;ZLjava/lang/String;Ljava/lang/String;)V
    .locals 4

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    .line 608
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz v1, :cond_0

    if-nez v2, :cond_1

    :cond_0
    if-nez v1, :cond_2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v3, 0x1

    .line 609
    :goto_1
    invoke-static {v3}, Ll/᩺֡֫;->֫(Z)V

    move-object v3, p1

    .line 611
    iput-object v3, v0, Ll/֨᩺֫;->᩷:Ljava/lang/String;

    .line 612
    iput-object v1, v0, Ll/֨᩺֫;->ۧ:Landroid/net/Uri;

    .line 613
    iput-object v2, v0, Ll/֨᩺֫;->֫:Landroid/net/Uri;

    move-wide v1, p4

    .line 614
    iput-wide v1, v0, Ll/֨᩺֫;->ᩴ:J

    move-wide v1, p6

    .line 615
    iput-wide v1, v0, Ll/֨᩺֫;->᩻:J

    move-wide v1, p8

    .line 616
    iput-wide v1, v0, Ll/֨᩺֫;->ܳ:J

    move-wide v1, p10

    .line 617
    iput-wide v1, v0, Ll/֨᩺֫;->ۢ:J

    move-object/from16 v1, p12

    .line 618
    iput-object v1, v0, Ll/֨᩺֫;->ܿ:Ljava/util/List;

    move/from16 v1, p13

    .line 619
    iput-boolean v1, v0, Ll/֨᩺֫;->ۜ:Z

    move-wide/from16 v1, p14

    .line 620
    iput-wide v1, v0, Ll/֨᩺֫;->ۖ:J

    move-wide/from16 v1, p16

    .line 621
    iput-wide v1, v0, Ll/֨᩺֫;->ۡ:J

    .line 622
    invoke-static/range {p18 .. p18}, Ll/ܳ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object v1

    iput-object v1, v0, Ll/֨᩺֫;->ۘ:Ll/ܳ۬ܺ;

    .line 623
    invoke-static/range {p19 .. p19}, Ll/ܳ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object v1

    iput-object v1, v0, Ll/֨᩺֫;->ܺ:Ll/ܳ۬ܺ;

    .line 625
    new-instance v1, Ll/ۨ᩶ܿ;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ll/ۨ᩶ܿ;-><init>(I)V

    move-object/from16 v2, p20

    .line 626
    invoke-static {v1, v2}, Ll/ܳ۬ܺ;->֫(Ljava/util/Comparator;Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object v1

    iput-object v1, v0, Ll/֨᩺֫;->ܽ:Ll/ܳ۬ܺ;

    move/from16 v1, p21

    .line 628
    iput-boolean v1, v0, Ll/֨᩺֫;->ᩳ:Z

    move-object/from16 v1, p22

    .line 629
    iput-object v1, v0, Ll/֨᩺֫;->᩵:Ljava/lang/String;

    move-object/from16 v1, p23

    .line 630
    iput-object v1, v0, Ll/֨᩺֫;->֡:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    if-ne p0, p1, :cond_0

    goto/16 :goto_0

    .line 638
    :cond_0
    instance-of v0, p1, Ll/֨᩺֫;

    if-nez v0, :cond_1

    goto/16 :goto_1

    .line 641
    :cond_1
    check-cast p1, Ll/֨᩺֫;

    .line 642
    iget-wide v0, p0, Ll/֨᩺֫;->ᩴ:J

    iget-wide v2, p1, Ll/֨᩺֫;->ᩴ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_2

    iget-wide v0, p0, Ll/֨᩺֫;->᩻:J

    iget-wide v2, p1, Ll/֨᩺֫;->᩻:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_2

    iget-wide v0, p0, Ll/֨᩺֫;->ܳ:J

    iget-wide v2, p1, Ll/֨᩺֫;->ܳ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_2

    iget-wide v0, p0, Ll/֨᩺֫;->ۢ:J

    iget-wide v2, p1, Ll/֨᩺֫;->ۢ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_2

    iget-boolean v0, p0, Ll/֨᩺֫;->ۜ:Z

    iget-boolean v1, p1, Ll/֨᩺֫;->ۜ:Z

    if-ne v0, v1, :cond_2

    iget-wide v0, p0, Ll/֨᩺֫;->ۖ:J

    iget-wide v2, p1, Ll/֨᩺֫;->ۖ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_2

    iget-wide v0, p0, Ll/֨᩺֫;->ۡ:J

    iget-wide v2, p1, Ll/֨᩺֫;->ۡ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_2

    iget-boolean v0, p0, Ll/֨᩺֫;->ᩳ:Z

    iget-boolean v1, p1, Ll/֨᩺֫;->ᩳ:Z

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Ll/֨᩺֫;->᩷:Ljava/lang/String;

    iget-object v1, p1, Ll/֨᩺֫;->᩷:Ljava/lang/String;

    .line 650
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/֨᩺֫;->ۧ:Landroid/net/Uri;

    iget-object v1, p1, Ll/֨᩺֫;->ۧ:Landroid/net/Uri;

    .line 651
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/֨᩺֫;->֫:Landroid/net/Uri;

    iget-object v1, p1, Ll/֨᩺֫;->֫:Landroid/net/Uri;

    .line 652
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/֨᩺֫;->ܿ:Ljava/util/List;

    iget-object v1, p1, Ll/֨᩺֫;->ܿ:Ljava/util/List;

    .line 653
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/֨᩺֫;->ۘ:Ll/ܳ۬ܺ;

    iget-object v1, p1, Ll/֨᩺֫;->ۘ:Ll/ܳ۬ܺ;

    .line 654
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/֨᩺֫;->ܺ:Ll/ܳ۬ܺ;

    iget-object v1, p1, Ll/֨᩺֫;->ܺ:Ll/ܳ۬ܺ;

    .line 655
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/֨᩺֫;->ܽ:Ll/ܳ۬ܺ;

    iget-object v1, p1, Ll/֨᩺֫;->ܽ:Ll/ܳ۬ܺ;

    .line 656
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/֨᩺֫;->᩵:Ljava/lang/String;

    iget-object v1, p1, Ll/֨᩺֫;->᩵:Ljava/lang/String;

    .line 657
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/֨᩺֫;->֡:Ljava/lang/String;

    iget-object p1, p1, Ll/֨᩺֫;->֡:Ljava/lang/String;

    .line 658
    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 11

    .line 663
    iget-wide v0, p0, Ll/֨᩺֫;->ᩴ:J

    .line 667
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-wide v1, p0, Ll/֨᩺֫;->᩻:J

    .line 668
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iget-wide v2, p0, Ll/֨᩺֫;->ܳ:J

    .line 669
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-wide v3, p0, Ll/֨᩺֫;->ۢ:J

    .line 670
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget-boolean v4, p0, Ll/֨᩺֫;->ۜ:Z

    .line 672
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iget-wide v5, p0, Ll/֨᩺֫;->ۖ:J

    .line 673
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    iget-wide v6, p0, Ll/֨᩺֫;->ۡ:J

    .line 674
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    iget-boolean v7, p0, Ll/֨᩺֫;->ᩳ:Z

    .line 678
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    const/16 v8, 0x11

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    iget-object v10, p0, Ll/֨᩺֫;->᩷:Ljava/lang/String;

    aput-object v10, v8, v9

    const/4 v9, 0x1

    iget-object v10, p0, Ll/֨᩺֫;->ۧ:Landroid/net/Uri;

    aput-object v10, v8, v9

    const/4 v9, 0x2

    iget-object v10, p0, Ll/֨᩺֫;->֫:Landroid/net/Uri;

    aput-object v10, v8, v9

    const/4 v9, 0x3

    aput-object v0, v8, v9

    const/4 v0, 0x4

    aput-object v1, v8, v0

    const/4 v0, 0x5

    aput-object v2, v8, v0

    const/4 v0, 0x6

    aput-object v3, v8, v0

    const/4 v0, 0x7

    iget-object v1, p0, Ll/֨᩺֫;->ܿ:Ljava/util/List;

    aput-object v1, v8, v0

    const/16 v0, 0x8

    aput-object v4, v8, v0

    const/16 v0, 0x9

    aput-object v5, v8, v0

    const/16 v0, 0xa

    aput-object v6, v8, v0

    const/16 v0, 0xb

    iget-object v1, p0, Ll/֨᩺֫;->ۘ:Ll/ܳ۬ܺ;

    aput-object v1, v8, v0

    const/16 v0, 0xc

    iget-object v1, p0, Ll/֨᩺֫;->ܺ:Ll/ܳ۬ܺ;

    aput-object v1, v8, v0

    const/16 v0, 0xd

    iget-object v1, p0, Ll/֨᩺֫;->ܽ:Ll/ܳ۬ܺ;

    aput-object v1, v8, v0

    const/16 v0, 0xe

    aput-object v7, v8, v0

    const/16 v0, 0xf

    iget-object v1, p0, Ll/֨᩺֫;->᩵:Ljava/lang/String;

    aput-object v1, v8, v0

    const/16 v0, 0x10

    iget-object v1, p0, Ll/֨᩺֫;->֡:Ljava/lang/String;

    aput-object v1, v8, v0

    .line 663
    invoke-static {v8}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
