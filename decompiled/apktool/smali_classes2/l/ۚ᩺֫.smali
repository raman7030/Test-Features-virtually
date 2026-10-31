.class public final Ll/ۚ᩺֫;
.super Ljava/lang/Object;
.source "U7MS"


# instance fields
.field public ֡:Ljava/lang/String;

.field public ֫:Landroid/net/Uri;

.field public ۖ:J

.field public ۘ:Ljava/util/ArrayList;

.field public ۜ:Z

.field public ۡ:J

.field public ۢ:J

.field public ۧ:Landroid/net/Uri;

.field public ܳ:J

.field public ܺ:Ljava/util/ArrayList;

.field public final ܽ:Ljava/util/HashMap;

.field public ܿ:Ljava/util/ArrayList;

.field public ᩳ:Ljava/lang/Boolean;

.field public ᩴ:J

.field public ᩵:Ljava/lang/String;

.field public final ᩷:Ljava/lang/String;

.field public ᩻:J


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 715
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 716
    iput-object p1, p0, Ll/ۚ᩺֫;->᩷:Ljava/lang/String;

    .line 717
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/ۚ᩺֫;->ܽ:Ljava/util/HashMap;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 718
    iput-wide v0, p0, Ll/ۚ᩺֫;->ᩴ:J

    .line 719
    iput-wide v0, p0, Ll/ۚ᩺֫;->᩻:J

    .line 720
    iput-wide v0, p0, Ll/ۚ᩺֫;->ܳ:J

    .line 721
    iput-wide v0, p0, Ll/ۚ᩺֫;->ۢ:J

    .line 722
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۚ᩺֫;->ܿ:Ljava/util/ArrayList;

    .line 723
    iput-wide v0, p0, Ll/ۚ᩺֫;->ۖ:J

    .line 724
    iput-wide v0, p0, Ll/ۚ᩺֫;->ۡ:J

    .line 725
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۚ᩺֫;->ۘ:Ljava/util/ArrayList;

    .line 726
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۚ᩺֫;->ܺ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/֨᩺֫;
    .locals 28

    move-object/from16 v0, p0

    .line 1096
    iget-object v4, v0, Ll/ۚ᩺֫;->֫:Landroid/net/Uri;

    if-nez v4, :cond_0

    iget-object v1, v0, Ll/ۚ᩺֫;->ۧ:Landroid/net/Uri;

    if-nez v1, :cond_1

    :cond_0
    if-eqz v4, :cond_6

    iget-object v1, v0, Ll/ۚ᩺֫;->ۧ:Landroid/net/Uri;

    if-nez v1, :cond_6

    :cond_1
    iget-wide v5, v0, Ll/ۚ᩺֫;->ᩴ:J

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v5, v1

    if-eqz v3, :cond_6

    .line 1099
    new-instance v25, Ll/֨᩺֫;

    iget-object v3, v0, Ll/ۚ᩺֫;->ۧ:Landroid/net/Uri;

    iget-wide v7, v0, Ll/ۚ᩺֫;->᩻:J

    iget-wide v9, v0, Ll/ۚ᩺֫;->ܳ:J

    iget-wide v11, v0, Ll/ۚ᩺֫;->ۢ:J

    iget-object v13, v0, Ll/ۚ᩺֫;->ܿ:Ljava/util/ArrayList;

    iget-boolean v14, v0, Ll/ۚ᩺֫;->ۜ:Z

    iget-wide v1, v0, Ll/ۚ᩺֫;->ۖ:J

    move/from16 v16, v14

    iget-wide v14, v0, Ll/ۚ᩺֫;->ۡ:J

    move-wide/from16 v17, v14

    iget-object v15, v0, Ll/ۚ᩺֫;->ۘ:Ljava/util/ArrayList;

    iget-object v14, v0, Ll/ۚ᩺֫;->ܺ:Ljava/util/ArrayList;

    move-object/from16 v19, v15

    new-instance v15, Ljava/util/ArrayList;

    move-wide/from16 v20, v1

    iget-object v1, v0, Ll/ۚ᩺֫;->ܽ:Ljava/util/HashMap;

    .line 1113
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v15, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v1, v0, Ll/ۚ᩺֫;->ᩳ:Ljava/lang/Boolean;

    if-eqz v1, :cond_3

    .line 1114
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    const/16 v22, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v1, 0x1

    const/16 v22, 0x1

    .line 1115
    :goto_1
    iget-object v1, v0, Ll/ۚ᩺֫;->᩵:Ljava/lang/String;

    if-eqz v1, :cond_4

    :goto_2
    move-object/from16 v23, v1

    goto :goto_3

    :cond_4
    const-string v1, "POINT"

    goto :goto_2

    .line 1116
    :goto_3
    iget-object v1, v0, Ll/ۚ᩺֫;->֡:Ljava/lang/String;

    if-eqz v1, :cond_5

    :goto_4
    move-object/from16 v24, v1

    goto :goto_5

    :cond_5
    const-string v1, "HIGHLIGHT"

    goto :goto_4

    :goto_5
    iget-object v2, v0, Ll/ۚ᩺֫;->᩷:Ljava/lang/String;

    move-object/from16 v1, v25

    move-object/from16 v26, v14

    move/from16 v14, v16

    move-object/from16 v27, v15

    move-wide/from16 v15, v20

    move-object/from16 v20, v26

    move-object/from16 v21, v27

    invoke-direct/range {v1 .. v24}, Ll/֨᩺֫;-><init>(Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;JJJJLjava/util/ArrayList;ZJJLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;ZLjava/lang/String;Ljava/lang/String;)V

    return-object v25

    :cond_6
    const/4 v1, 0x0

    return-object v1
.end method

.method public final ֫(J)V
    .locals 5

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    return-void

    .line 823
    :cond_0
    iget-wide v2, p0, Ll/ۚ᩺֫;->ܳ:J

    cmp-long v4, v2, v0

    if-eqz v4, :cond_2

    cmp-long v0, v2, p1

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 824
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t change durationUs from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Ll/ۚ᩺֫;->ܳ:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    .line 828
    :cond_2
    iput-wide p1, p0, Ll/ۚ᩺֫;->ܳ:J

    return-void
.end method

.method public final ֫(Landroid/net/Uri;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 760
    :cond_0
    iget-object v0, p0, Ll/ۚ᩺֫;->֫:Landroid/net/Uri;

    if-eqz v0, :cond_1

    .line 762
    invoke-virtual {v0, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t change assetListUri from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ۚ᩺֫;->֫:Landroid/net/Uri;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 761
    invoke-static {v1, v0}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    .line 765
    :cond_1
    iput-object p1, p0, Ll/ۚ᩺֫;->֫:Landroid/net/Uri;

    return-void
.end method

.method public final ֫(Ljava/lang/Boolean;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 1032
    :cond_0
    iget-object v0, p0, Ll/ۚ᩺֫;->ᩳ:Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    .line 1034
    invoke-virtual {v0, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t change contentMayVary from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ۚ᩺֫;->ᩳ:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1033
    invoke-static {v1, v0}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    .line 1037
    :cond_1
    iput-object p1, p0, Ll/ۚ᩺֫;->ᩳ:Ljava/lang/Boolean;

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 1055
    :cond_0
    iget-object v0, p0, Ll/ۚ᩺֫;->᩵:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 1057
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t change timelineOccupies from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ۚ᩺֫;->᩵:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1056
    invoke-static {v1, v0}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    .line 1063
    :cond_1
    iput-object p1, p0, Ll/ۚ᩺֫;->᩵:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ljava/util/ArrayList;)V
    .locals 10

    .line 991
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 994
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 995
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡᩺֫;

    .line 996
    iget-object v2, v1, Ll/֡᩺֫;->ۧ:Ljava/lang/String;

    .line 997
    iget-object v3, p0, Ll/ۚ᩺֫;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֡᩺֫;

    if-eqz v4, :cond_1

    .line 1000
    invoke-virtual {v4, v1}, Ll/֡᩺֫;->equals(Ljava/lang/Object;)Z

    move-result v5

    const-string v6, "Can\'t change "

    const-string v7, " from "

    .line 0
    invoke-static {v6, v2, v7}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 1000
    invoke-static {v4}, Ll/֡᩺֫;->ۧ(Ll/֡᩺֫;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Ll/֡᩺֫;->֫(Ll/֡᩺֫;)D

    move-result-wide v8

    invoke-virtual {v6, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v4, " to "

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ll/֡᩺֫;->ۧ(Ll/֡᩺֫;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ll/֡᩺֫;->֫(Ll/֡᩺֫;)D

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 999
    invoke-static {v4, v5}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    .line 1012
    :cond_1
    invoke-virtual {v3, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    .line 888
    iput-boolean p1, p0, Ll/ۚ᩺֫;->ۜ:Z

    return-void
.end method

.method public final ۧ(J)V
    .locals 5

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    return-void

    .line 803
    :cond_0
    iget-wide v2, p0, Ll/ۚ᩺֫;->᩻:J

    cmp-long v4, v2, v0

    if-eqz v4, :cond_2

    cmp-long v0, v2, p1

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 804
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t change endDateUnixUs from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Ll/ۚ᩺֫;->᩻:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    .line 808
    :cond_2
    iput-wide p1, p0, Ll/ۚ᩺֫;->᩻:J

    return-void
.end method

.method public final ۧ(Landroid/net/Uri;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 740
    :cond_0
    iget-object v0, p0, Ll/ۚ᩺֫;->ۧ:Landroid/net/Uri;

    if-eqz v0, :cond_1

    .line 742
    invoke-virtual {v0, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t change assetUri from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ۚ᩺֫;->ۧ:Landroid/net/Uri;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 741
    invoke-static {v1, v0}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    .line 745
    :cond_1
    iput-object p1, p0, Ll/ۚ᩺֫;->ۧ:Landroid/net/Uri;

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 1080
    :cond_0
    iget-object v0, p0, Ll/ۚ᩺֫;->֡:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 1082
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t change timelineStyle from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ۚ᩺֫;->֡:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1081
    invoke-static {v1, v0}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    .line 1085
    :cond_1
    iput-object p1, p0, Ll/ۚ᩺֫;->֡:Ljava/lang/String;

    return-void
.end method

.method public final ۧ(Ljava/util/ArrayList;)V
    .locals 6

    .line 863
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 866
    :cond_0
    iget-object v0, p0, Ll/ۚ᩺֫;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 867
    iget-object v0, p0, Ll/ۚ᩺֫;->ܿ:Ljava/util/ArrayList;

    .line 868
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t change cue from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ۚ᩺֫;->ܿ:Ljava/util/ArrayList;

    .line 0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const-string v5, ", "

    if-eqz v4, :cond_1

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 870
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 872
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 867
    invoke-static {v1, v0}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    .line 874
    :cond_3
    iput-object p1, p0, Ll/ۚ᩺֫;->ܿ:Ljava/util/ArrayList;

    return-void
.end method

.method public final ܳ(J)V
    .locals 5

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    return-void

    .line 780
    :cond_0
    iget-wide v2, p0, Ll/ۚ᩺֫;->ᩴ:J

    cmp-long v4, v2, v0

    if-eqz v4, :cond_2

    cmp-long v0, v2, p1

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 781
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t change startDateUnixUs from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Ll/ۚ᩺֫;->ᩴ:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    .line 788
    :cond_2
    iput-wide p1, p0, Ll/ۚ᩺֫;->ᩴ:J

    return-void
.end method

.method public final ܽ(J)V
    .locals 5

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    return-void

    .line 843
    :cond_0
    iget-wide v2, p0, Ll/ۚ᩺֫;->ۢ:J

    cmp-long v4, v2, v0

    if-eqz v4, :cond_2

    cmp-long v0, v2, p1

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 844
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t change plannedDurationUs from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Ll/ۚ᩺֫;->ۢ:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    .line 851
    :cond_2
    iput-wide p1, p0, Ll/ۚ᩺֫;->ۢ:J

    return-void
.end method

.method public final ܽ(Ljava/util/ArrayList;)V
    .locals 6

    .line 964
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 967
    :cond_0
    iget-object v0, p0, Ll/ۚ᩺֫;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 968
    iget-object v0, p0, Ll/ۚ᩺֫;->ܺ:Ljava/util/ArrayList;

    .line 969
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t change restrictions from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ۚ᩺֫;->ܺ:Ljava/util/ArrayList;

    .line 0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const-string v5, ", "

    if-eqz v4, :cond_1

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 971
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 973
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 968
    invoke-static {v1, v0}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    .line 975
    :cond_3
    iput-object p1, p0, Ll/ۚ᩺֫;->ܺ:Ljava/util/ArrayList;

    return-void
.end method

.method public final ܿ(J)V
    .locals 5

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    return-void

    .line 903
    :cond_0
    iget-wide v2, p0, Ll/ۚ᩺֫;->ۖ:J

    cmp-long v4, v2, v0

    if-eqz v4, :cond_2

    cmp-long v0, v2, p1

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 904
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t change resumeOffsetUs from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Ll/ۚ᩺֫;->ۖ:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    .line 908
    :cond_2
    iput-wide p1, p0, Ll/ۚ᩺֫;->ۖ:J

    return-void
.end method

.method public final ᩳ(J)V
    .locals 5

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    return-void

    .line 923
    :cond_0
    iget-wide v2, p0, Ll/ۚ᩺֫;->ۡ:J

    cmp-long v4, v2, v0

    if-eqz v4, :cond_2

    cmp-long v0, v2, p1

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 924
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t change playoutLimitUs from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Ll/ۚ᩺֫;->ۡ:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    .line 928
    :cond_2
    iput-wide p1, p0, Ll/ۚ᩺֫;->ۡ:J

    return-void
.end method

.method public final ᩳ(Ljava/util/ArrayList;)V
    .locals 6

    .line 940
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 943
    :cond_0
    iget-object v0, p0, Ll/ۚ᩺֫;->ۘ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 944
    iget-object v0, p0, Ll/ۚ᩺֫;->ۘ:Ljava/util/ArrayList;

    .line 945
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t change snapTypes from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ۚ᩺֫;->ۘ:Ljava/util/ArrayList;

    .line 0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const-string v5, ", "

    if-eqz v4, :cond_1

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 947
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 949
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 944
    invoke-static {v1, v0}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    .line 951
    :cond_3
    iput-object p1, p0, Ll/ۚ᩺֫;->ۘ:Ljava/util/ArrayList;

    return-void
.end method
