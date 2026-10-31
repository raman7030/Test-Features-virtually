.class public final Ll/᩹ᩴ֫;
.super Ljava/lang/Object;
.source "78PS"


# instance fields
.field public ֫:Ll/᩶ᩴ֫;

.field public ۜ:Ll/᩺ᩴ֫;

.field public ۡ:Ljava/lang/Object;

.field public ۢ:Ll/ܳ۬ܺ;

.field public ۧ:Ll/۬ᩴ֫;

.field public ܳ:Ll/ܿ᩵֫;

.field public ܺ:Landroid/net/Uri;

.field public ܽ:J

.field public ܿ:Ljava/lang/String;

.field public ᩳ:Ll/ۤᩴ֫;

.field public ᩷:Ljava/util/List;

.field public ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    new-instance v0, Ll/᩶ᩴ֫;

    invoke-direct {v0}, Ll/᩶ᩴ֫;-><init>()V

    iput-object v0, p0, Ll/᩹ᩴ֫;->֫:Ll/᩶ᩴ֫;

    .line 96
    new-instance v0, Ll/۬ᩴ֫;

    invoke-direct {v0}, Ll/۬ᩴ֫;-><init>()V

    iput-object v0, p0, Ll/᩹ᩴ֫;->ۧ:Ll/۬ᩴ֫;

    .line 97
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/᩹ᩴ֫;->᩷:Ljava/util/List;

    .line 98
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    iput-object v0, p0, Ll/᩹ᩴ֫;->ۢ:Ll/ܳ۬ܺ;

    .line 99
    new-instance v0, Ll/ۤᩴ֫;

    invoke-direct {v0}, Ll/ۤᩴ֫;-><init>()V

    iput-object v0, p0, Ll/᩹ᩴ֫;->ᩳ:Ll/ۤᩴ֫;

    .line 100
    sget-object v0, Ll/᩺ᩴ֫;->֫:Ll/᩺ᩴ֫;

    iput-object v0, p0, Ll/᩹ᩴ֫;->ۜ:Ll/᩺ᩴ֫;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 101
    iput-wide v0, p0, Ll/᩹ᩴ֫;->ܽ:J

    return-void
.end method

.method public constructor <init>(Ll/ۧ᩵֫;)V
    .locals 2

    .line 107
    invoke-direct {p0}, Ll/᩹ᩴ֫;-><init>()V

    .line 108
    iget-object v0, p1, Ll/ۧ᩵֫;->֫:Ll/ۗᩴ֫;

    .line 2033
    new-instance v1, Ll/᩶ᩴ֫;

    invoke-direct {v1, v0}, Ll/᩶ᩴ֫;-><init>(Ll/ۗᩴ֫;)V

    .line 108
    iput-object v1, p0, Ll/᩹ᩴ֫;->֫:Ll/᩶ᩴ֫;

    .line 109
    iget-object v0, p1, Ll/ۧ᩵֫;->ᩳ:Ljava/lang/String;

    iput-object v0, p0, Ll/᩹ᩴ֫;->ܿ:Ljava/lang/String;

    .line 110
    iget-object v0, p1, Ll/ۧ᩵֫;->ܿ:Ll/ܿ᩵֫;

    iput-object v0, p0, Ll/᩹ᩴ֫;->ܳ:Ll/ܿ᩵֫;

    .line 111
    iget-object v0, p1, Ll/ۧ᩵֫;->ۧ:Ll/ۛᩴ֫;

    .line 1482
    new-instance v1, Ll/ۤᩴ֫;

    invoke-direct {v1, v0}, Ll/ۤᩴ֫;-><init>(Ll/ۛᩴ֫;)V

    .line 111
    iput-object v1, p0, Ll/᩹ᩴ֫;->ᩳ:Ll/ۤᩴ֫;

    .line 112
    iget-object v0, p1, Ll/ۧ᩵֫;->ܳ:Ll/᩺ᩴ֫;

    iput-object v0, p0, Ll/᩹ᩴ֫;->ۜ:Ll/᩺ᩴ֫;

    .line 113
    iget-object p1, p1, Ll/ۧ᩵֫;->ܽ:Ll/ۨᩴ֫;

    if-eqz p1, :cond_1

    .line 116
    iget-object v0, p1, Ll/ۨᩴ֫;->ܽ:Ljava/lang/String;

    iput-object v0, p0, Ll/᩹ᩴ֫;->᩻:Ljava/lang/String;

    .line 117
    iget-object v0, p1, Ll/ۨᩴ֫;->᩻:Landroid/net/Uri;

    iput-object v0, p0, Ll/᩹ᩴ֫;->ܺ:Landroid/net/Uri;

    .line 118
    iget-object v0, p1, Ll/ۨᩴ֫;->ᩳ:Ljava/util/List;

    iput-object v0, p0, Ll/᩹ᩴ֫;->᩷:Ljava/util/List;

    .line 119
    iget-object v0, p1, Ll/ۨᩴ֫;->ܿ:Ll/ܳ۬ܺ;

    iput-object v0, p0, Ll/᩹ᩴ֫;->ۢ:Ll/ܳ۬ܺ;

    .line 120
    iget-object v0, p1, Ll/ۨᩴ֫;->ܳ:Ljava/lang/Object;

    iput-object v0, p0, Ll/᩹ᩴ֫;->ۡ:Ljava/lang/Object;

    .line 122
    iget-object v0, p1, Ll/ۨᩴ֫;->֫:Ll/۫ᩴ֫;

    if-eqz v0, :cond_0

    .line 905
    new-instance v1, Ll/۬ᩴ֫;

    invoke-direct {v1, v0}, Ll/۬ᩴ֫;-><init>(Ll/۫ᩴ֫;)V

    goto :goto_0

    .line 124
    :cond_0
    new-instance v1, Ll/۬ᩴ֫;

    invoke-direct {v1}, Ll/۬ᩴ֫;-><init>()V

    :goto_0
    iput-object v1, p0, Ll/᩹ᩴ֫;->ۧ:Ll/۬ᩴ֫;

    .line 126
    iget-wide v0, p1, Ll/ۨᩴ֫;->ۧ:J

    iput-wide v0, p0, Ll/᩹ᩴ֫;->ܽ:J

    :cond_1
    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۧ᩵֫;
    .locals 19

    move-object/from16 v0, p0

    .line 611
    iget-object v1, v0, Ll/᩹ᩴ֫;->ۧ:Ll/۬ᩴ֫;

    invoke-static {v1}, Ll/۬ᩴ֫;->ܿ(Ll/۬ᩴ֫;)Landroid/net/Uri;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v1, v0, Ll/᩹ᩴ֫;->ۧ:Ll/۬ᩴ֫;

    invoke-static {v1}, Ll/۬ᩴ֫;->ۜ(Ll/۬ᩴ֫;)Ljava/util/UUID;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 613
    iget-object v3, v0, Ll/᩹ᩴ֫;->ܺ:Landroid/net/Uri;

    const/4 v1, 0x0

    if-eqz v3, :cond_3

    .line 615
    new-instance v11, Ll/ۨᩴ֫;

    iget-object v4, v0, Ll/᩹ᩴ֫;->᩻:Ljava/lang/String;

    .line 619
    iget-object v2, v0, Ll/᩹ᩴ֫;->ۧ:Ll/۬ᩴ֫;

    invoke-static {v2}, Ll/۬ᩴ֫;->ۜ(Ll/۬ᩴ֫;)Ljava/util/UUID;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v1, v0, Ll/᩹ᩴ֫;->ۧ:Ll/۬ᩴ֫;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 825
    new-instance v2, Ll/۫ᩴ֫;

    invoke-direct {v2, v1}, Ll/۫ᩴ֫;-><init>(Ll/۬ᩴ֫;)V

    move-object v5, v2

    goto :goto_2

    :cond_2
    move-object v5, v1

    .line 619
    :goto_2
    iget-object v7, v0, Ll/᩹ᩴ֫;->ۢ:Ll/ܳ۬ܺ;

    iget-object v8, v0, Ll/᩹ᩴ֫;->ۡ:Ljava/lang/Object;

    iget-wide v9, v0, Ll/᩹ᩴ֫;->ܽ:J

    iget-object v6, v0, Ll/᩹ᩴ֫;->᩷:Ljava/util/List;

    move-object v2, v11

    invoke-direct/range {v2 .. v10}, Ll/ۨᩴ֫;-><init>(Landroid/net/Uri;Ljava/lang/String;Ll/۫ᩴ֫;Ljava/util/List;Ll/ܳ۬ܺ;Ljava/lang/Object;J)V

    move-object v15, v11

    goto :goto_3

    :cond_3
    move-object v15, v1

    .line 627
    :goto_3
    new-instance v1, Ll/ۧ᩵֫;

    .line 628
    iget-object v2, v0, Ll/᩹ᩴ֫;->ܿ:Ljava/lang/String;

    if-eqz v2, :cond_4

    :goto_4
    move-object v13, v2

    goto :goto_5

    :cond_4
    const-string v2, ""

    goto :goto_4

    .line 629
    :goto_5
    iget-object v2, v0, Ll/᩹ᩴ֫;->֫:Ll/᩶ᩴ֫;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1977
    new-instance v14, Ll/ۗᩴ֫;

    .line 2156
    invoke-direct {v14, v2}, Ll/ۙᩴ֫;-><init>(Ll/᩶ᩴ֫;)V

    .line 629
    iget-object v2, v0, Ll/᩹ᩴ֫;->ᩳ:Ll/ۤᩴ֫;

    .line 631
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1412
    new-instance v3, Ll/ۛᩴ֫;

    invoke-direct {v3, v2}, Ll/ۛᩴ֫;-><init>(Ll/ۤᩴ֫;)V

    .line 632
    iget-object v2, v0, Ll/᩹ᩴ֫;->ܳ:Ll/ܿ᩵֫;

    if-eqz v2, :cond_5

    :goto_6
    move-object/from16 v17, v2

    goto :goto_7

    :cond_5
    sget-object v2, Ll/ܿ᩵֫;->֫֫:Ll/ܿ᩵֫;

    goto :goto_6

    :goto_7
    iget-object v2, v0, Ll/᩹ᩴ֫;->ۜ:Ll/᩺ᩴ֫;

    move-object v12, v1

    move-object/from16 v16, v3

    move-object/from16 v18, v2

    invoke-direct/range {v12 .. v18}, Ll/ۧ᩵֫;-><init>(Ljava/lang/String;Ll/ۗᩴ֫;Ll/ۨᩴ֫;Ll/ۛᩴ֫;Ll/ܿ᩵֫;Ll/᩺ᩴ֫;)V

    return-object v1
.end method

.method public final ֫(Landroid/net/Uri;)V
    .locals 0

    .line 162
    iput-object p1, p0, Ll/᩹ᩴ֫;->ܺ:Landroid/net/Uri;

    return-void
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 0

    .line 570
    iput-object p1, p0, Ll/᩹ᩴ֫;->ۡ:Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    iput-object p1, p0, Ll/᩹ᩴ֫;->ܿ:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ljava/util/List;)V
    .locals 0

    .line 440
    invoke-static {p1}, Ll/ܳ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/᩹ᩴ֫;->ۢ:Ll/ܳ۬ܺ;

    return-void
.end method

.method public final ֫(Ll/ۛᩴ֫;)V
    .locals 1

    .line 1482
    new-instance v0, Ll/ۤᩴ֫;

    invoke-direct {v0, p1}, Ll/ۤᩴ֫;-><init>(Ll/ۛᩴ֫;)V

    .line 497
    iput-object v0, p0, Ll/᩹ᩴ֫;->ᩳ:Ll/ۤᩴ֫;

    return-void
.end method

.method public final ۧ()V
    .locals 1

    const-string v0, "application/x-mpegURL"

    .line 177
    iput-object v0, p0, Ll/᩹ᩴ֫;->᩻:Ljava/lang/String;

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 150
    :cond_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 162
    :goto_0
    iput-object p1, p0, Ll/᩹ᩴ֫;->ܺ:Landroid/net/Uri;

    return-void
.end method
