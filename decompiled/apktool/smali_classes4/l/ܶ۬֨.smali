.class public final Ll/ܶ۬֨;
.super Ljava/lang/Object;
.source "542M"


# static fields
.field public static final ֫֫:Ll/ۙ֨۠;

.field public static final ۧ֫:Ll/ۘ᩸֨;


# instance fields
.field public ֡:Ll/ۙᩴ֨;

.field public final ֨:Ll/᩹ܶ۠;

.field public final ֫:Z

.field public ۖ:Ll/ۙۛܽ;

.field public final ۗ:Ll/᩹ܽ۠;

.field public final ۘ:Ll/ۧ᩶۠;

.field public ۙ:Ll/ۙܶ۠;

.field public ۚ:Ljava/util/HashMap;

.field public ۛ:C

.field public ۜ:Ll/ᩳᩴ֨;

.field public final ۟:Z

.field public ۠:Ll/ۘ֡֨;

.field public final ۡ:Ll/ۛ۠۠;

.field public ۢ:[Ll/ۤܶ۠;

.field public final ۤ:Ll/᩷ۚ֨;

.field public final ۧ:Z

.field public final ۨ:Ll/ܿ۠֨;

.field public ۫:Ll/ۙܶ۠;

.field public final ۬:Ll/ܽ֡֨;

.field public ܰ:Ll/ۙܶ۠;

.field public ܳ:Ljava/util/Set;

.field public final ܶ:Ll/ۛܶ۠;

.field public final ܺ:Ll/ܰ۫֨;

.field public final ܽ:Z

.field public ܿ:Ljava/util/HashMap;

.field public ᩳ:Ll/ۘ۬֨;

.field public final ᩴ:Ll/ۜۨ֨;

.field public ᩵:Ll/۫᩸֨;

.field public final ᩶:Ll/ۛۢ۠;

.field public ᩷:Ll/ۙܶ۠;

.field public ᩸:Ll/֨᩸۠;

.field public final ᩹:Ll/᩺ᩴ֨;

.field public final ᩺:Ll/ۛ᩸֨;

.field public final ᩻:Ll/۫۫֨;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 83
    new-instance v0, Ll/ۙ֨۠;

    invoke-direct {v0}, Ll/ۙ֨۠;-><init>()V

    sput-object v0, Ll/ܶ۬֨;->֫֫:Ll/ۙ֨۠;

    .line 893
    new-instance v0, Ll/ۢ۬֨;

    .line 4899
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 893
    sput-object v0, Ll/ܶ۬֨;->ۧ֫:Ll/ۘ᩸֨;

    return-void
.end method

.method public constructor <init>(Ll/ۗ֨۠;)V
    .locals 14

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 173
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܶ۬֨;->ܿ:Ljava/util/HashMap;

    .line 445
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܶ۬֨;->ۚ:Ljava/util/HashMap;

    .line 568
    new-instance v0, Ll/᩻۬֨;

    invoke-direct {v0, p0}, Ll/᩻۬֨;-><init>(Ll/ܶ۬֨;)V

    iput-object v0, p0, Ll/ܶ۬֨;->ᩳ:Ll/ۘ۬֨;

    .line 1146
    new-instance v0, Ll/ۡ۬֨;

    .line 4899
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1146
    iput-object v0, p0, Ll/ܶ۬֨;->᩵:Ll/۫᩸֨;

    .line 1921
    new-instance v0, Ll/֨᩸۠;

    invoke-direct {v0}, Ll/֨᩸۠;-><init>()V

    iput-object v0, p0, Ll/ܶ۬֨;->᩸:Ll/֨᩸۠;

    .line 2161
    new-instance v0, Ll/ۙۛܽ;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ll/ۙۛܽ;-><init>(I)V

    iput-object v0, p0, Ll/ܶ۬֨;->ۖ:Ll/ۙۛܽ;

    .line 119
    sget-object v0, Ll/ܶ۬֨;->֫֫:Ll/ۙ֨۠;

    invoke-virtual {p1, v0, p0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;Ljava/lang/Object;)V

    .line 121
    invoke-static {p1}, Ll/ۛܶ۠;->֫(Ll/ۗ֨۠;)Ll/ۛܶ۠;

    move-result-object v0

    iput-object v0, p0, Ll/ܶ۬֨;->ܶ:Ll/ۛܶ۠;

    .line 122
    invoke-static {p1}, Ll/᩹ܶ۠;->֫(Ll/ۗ֨۠;)Ll/᩹ܶ۠;

    move-result-object v0

    iput-object v0, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    .line 123
    invoke-static {p1}, Ll/᩹ܽ۠;->֫(Ll/ۗ֨۠;)Ll/᩹ܽ۠;

    move-result-object v1

    iput-object v1, p0, Ll/ܶ۬֨;->ۗ:Ll/᩹ܽ۠;

    .line 124
    invoke-static {p1}, Ll/᩷ۚ֨;->֫(Ll/ۗ֨۠;)Ll/᩷ۚ֨;

    move-result-object v1

    iput-object v1, p0, Ll/ܶ۬֨;->ۤ:Ll/᩷ۚ֨;

    .line 125
    invoke-static {p1}, Ll/ܰ۫֨;->֫(Ll/ۗ֨۠;)Ll/ܰ۫֨;

    move-result-object v1

    iput-object v1, p0, Ll/ܶ۬֨;->ܺ:Ll/ܰ۫֨;

    .line 126
    invoke-static {p1}, Ll/۫۫֨;->֫(Ll/ۗ֨۠;)Ll/۫۫֨;

    move-result-object v1

    iput-object v1, p0, Ll/ܶ۬֨;->᩻:Ll/۫۫֨;

    .line 127
    invoke-static {p1}, Ll/ۜۨ֨;->֫(Ll/ۗ֨۠;)Ll/ۜۨ֨;

    move-result-object v1

    iput-object v1, p0, Ll/ܶ۬֨;->ᩴ:Ll/ۜۨ֨;

    .line 128
    invoke-static {p1}, Ll/ۛ᩸֨;->֫(Ll/ۗ֨۠;)Ll/ۛ᩸֨;

    move-result-object v1

    iput-object v1, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    .line 129
    invoke-static {p1}, Ll/ܿ۠֨;->֫(Ll/ۗ֨۠;)Ll/ܿ۠֨;

    move-result-object v1

    iput-object v1, p0, Ll/ܶ۬֨;->ۨ:Ll/ܿ۠֨;

    .line 130
    invoke-static {p1}, Ll/ۛ۠۠;->֫(Ll/ۗ֨۠;)Ll/ۛ۠۠;

    move-result-object v1

    iput-object v1, p0, Ll/ܶ۬֨;->ۡ:Ll/ۛ۠۠;

    .line 131
    invoke-static {p1}, Ll/ۨܶ۠;->֫(Ll/ۗ֨۠;)Ll/ۨܶ۠;

    move-result-object v1

    .line 132
    invoke-static {p1}, Ll/ۙᩴ֨;->֫(Ll/ۗ֨۠;)Ll/ۙᩴ֨;

    move-result-object v2

    iput-object v2, p0, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    .line 133
    const-class v2, Ll/ۧ᩶۠;

    invoke-virtual {p1, v2}, Ll/ۗ֨۠;->֫(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۧ᩶۠;

    iput-object v2, p0, Ll/ܶ۬֨;->ۘ:Ll/ۧ᩶۠;

    .line 135
    invoke-static {p1}, Ll/ܽ֡֨;->֫(Ll/ۗ֨۠;)Ll/ܽ֡֨;

    move-result-object v7

    iput-object v7, p0, Ll/ܶ۬֨;->۬:Ll/ܽ֡֨;

    .line 136
    invoke-static {p1}, Ll/ۧۡ۠;->֫(Ll/ۗ֨۠;)Ll/ۧۡ۠;

    const-string v2, "warnOnAccessToMembers"

    .line 137
    invoke-virtual {v1, v2}, Ll/ۨܶ۠;->ۧ(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Ll/ܶ۬֨;->۟:Z

    .line 139
    invoke-static {p1}, Ll/ۧۡ۠;->֫(Ll/ۗ֨۠;)Ll/ۧۡ۠;

    move-result-object v1

    .line 140
    invoke-virtual {v1}, Ll/ۧۡ۠;->ۚ()C

    move-result v1

    iput-char v1, p0, Ll/ܶ۬֨;->ۛ:C

    .line 142
    invoke-static {p1}, Ll/ۛۢ۠;->֫(Ll/ۗ֨۠;)Ll/ۛۢ۠;

    move-result-object v1

    iput-object v1, p0, Ll/ܶ۬֨;->᩶:Ll/ۛۢ۠;

    .line 143
    invoke-static {p1}, Ll/᩺ᩴ֨;->֫(Ll/ۗ֨۠;)Ll/᩺ᩴ֨;

    move-result-object v1

    iput-object v1, p0, Ll/ܶ۬֨;->᩹:Ll/᩺ᩴ֨;

    .line 145
    iget-object v1, p0, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    sget-object v6, Ll/᩶ᩴ֨;->۫:Ll/᩶ᩴ֨;

    invoke-virtual {v1, v6}, Ll/ۙᩴ֨;->֫(Ll/᩶ᩴ֨;)Z

    move-result v4

    .line 146
    iget-object v1, p0, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    sget-object v8, Ll/᩶ᩴ֨;->ۡ֫:Ll/᩶ᩴ֨;

    invoke-virtual {v1, v8}, Ll/ۙᩴ֨;->֫(Ll/᩶ᩴ֨;)Z

    move-result v9

    .line 147
    iget-object v1, p0, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    sget-object v10, Ll/᩶ᩴ֨;->۠֫:Ll/᩶ᩴ֨;

    invoke-virtual {v1, v10}, Ll/ۙᩴ֨;->֫(Ll/᩶ᩴ֨;)Z

    move-result v11

    .line 150
    new-instance v12, Ll/ۙܶ۠;

    const/4 v13, 0x0

    const-string v5, "deprecated"

    move-object v1, v12

    move-object v2, v0

    move-object v3, v13

    invoke-direct/range {v1 .. v6}, Ll/ۙܶ۠;-><init>(Ll/᩹ܶ۠;Ll/ܽ֡֨;ZLjava/lang/String;Ll/᩶ᩴ֨;)V

    iput-object v12, p0, Ll/ܶ۬֨;->᩷:Ll/ۙܶ۠;

    .line 152
    new-instance v12, Ll/ۙܶ۠;

    const-string v5, "removal"

    move-object v1, v12

    move v4, v9

    move-object v6, v8

    invoke-direct/range {v1 .. v6}, Ll/ۙܶ۠;-><init>(Ll/᩹ܶ۠;Ll/ܽ֡֨;ZLjava/lang/String;Ll/᩶ᩴ֨;)V

    iput-object v12, p0, Ll/ܶ۬֨;->ۙ:Ll/ۙܶ۠;

    .line 154
    new-instance v8, Ll/ۙܶ۠;

    const-string v5, "unchecked"

    move-object v1, v8

    move v4, v11

    move-object v6, v10

    invoke-direct/range {v1 .. v6}, Ll/ۙܶ۠;-><init>(Ll/᩹ܶ۠;Ll/ܽ֡֨;ZLjava/lang/String;Ll/᩶ᩴ֨;)V

    iput-object v8, p0, Ll/ܶ۬֨;->ܰ:Ll/ۙܶ۠;

    .line 156
    new-instance v8, Ll/ۙܶ۠;

    const-string v5, "sunapi"

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, v8

    invoke-direct/range {v1 .. v6}, Ll/ۙܶ۠;-><init>(Ll/᩹ܶ۠;Ll/ܽ֡֨;ZLjava/lang/String;Ll/᩶ᩴ֨;)V

    iput-object v8, p0, Ll/ܶ۬֨;->۫:Ll/ۙܶ۠;

    .line 159
    invoke-static {p1}, Ll/ᩳᩴ֨;->֫(Ll/ۗ֨۠;)Ll/ᩳᩴ֨;

    move-result-object p1

    iput-object p1, p0, Ll/ܶ۬֨;->ۜ:Ll/ᩳᩴ֨;

    .line 161
    sget-object p1, Ll/ۧ֡֨;->᩷֫:Ll/ۧ֡֨;

    invoke-virtual {p1, v7}, Ll/ۧ֡֨;->֫(Ll/ܽ֡֨;)Z

    move-result p1

    iput-boolean p1, p0, Ll/ܶ۬֨;->֫:Z

    .line 162
    sget-object p1, Ll/ۧ֡֨;->᩵֫:Ll/ۧ֡֨;

    invoke-virtual {p1, v7}, Ll/ۧ֡֨;->֫(Ll/ܽ֡֨;)Z

    move-result p1

    iput-boolean p1, p0, Ll/ܶ۬֨;->ۧ:Z

    .line 163
    sget-object p1, Ll/ۧ֡֨;->۠֫:Ll/ۧ֡֨;

    invoke-virtual {p1, v7}, Ll/ۧ֡֨;->֫(Ll/ܽ֡֨;)Z

    move-result p1

    iput-boolean p1, p0, Ll/ܶ۬֨;->ܽ:Z

    return-void
.end method

.method public static ֫(J)I
    .locals 2

    const-wide/16 v0, 0x7

    and-long/2addr p0, v0

    long-to-int p1, p0

    int-to-short p0, p1

    const/4 p1, 0x2

    if-eqz p0, :cond_2

    if-eq p0, p1, :cond_1

    const/4 p1, 0x4

    if-eq p0, p1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x3

    return p0

    :cond_2
    return p1
.end method

.method public static bridge synthetic ֫(Ll/ܶ۬֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܶ۬֨;->ᩳ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۘ֡֨;Ll/ۘ֡֨;)Ll/ۨ۠۠;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1710
    invoke-virtual/range {p0 .. p0}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v2

    .line 1711
    invoke-virtual/range {p1 .. p1}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v3

    .line 1713
    iget-object v4, v1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    invoke-virtual {v4}, Ll/ۛ֡֨;->۬()J

    move-result-wide v4

    const-wide/16 v6, 0x200

    and-long/2addr v4, v6

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x4

    const-string v13, "compiler"

    const-wide/16 v14, 0x0

    cmp-long v16, v4, v14

    if-nez v16, :cond_0

    .line 1714
    sget-object v4, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 6556
    new-instance v4, Ll/ۨ۠۠;

    new-array v5, v12, [Ljava/lang/Object;

    aput-object v0, v5, v11

    aput-object v2, v5, v10

    aput-object v1, v5, v9

    aput-object v3, v5, v8

    const-string v0, "cant.override"

    invoke-direct {v4, v13, v0, v5}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v4

    .line 1715
    :cond_0
    iget-object v4, v0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    invoke-virtual {v4}, Ll/ۛ֡֨;->۬()J

    move-result-wide v4

    and-long/2addr v4, v6

    cmp-long v6, v4, v14

    if-nez v6, :cond_1

    .line 1716
    sget-object v4, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 6548
    new-instance v4, Ll/ۨ۠۠;

    new-array v5, v12, [Ljava/lang/Object;

    aput-object v0, v5, v11

    aput-object v2, v5, v10

    aput-object v1, v5, v9

    aput-object v3, v5, v8

    const-string v0, "cant.implement"

    invoke-direct {v4, v13, v0, v5}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v4

    .line 1718
    :cond_1
    sget-object v4, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 6629
    new-instance v4, Ll/ۨ۠۠;

    new-array v5, v12, [Ljava/lang/Object;

    aput-object v0, v5, v11

    aput-object v2, v5, v10

    aput-object v1, v5, v9

    aput-object v3, v5, v8

    const-string v0, "clashes.with"

    invoke-direct {v4, v13, v0, v5}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v4
.end method

.method public static bridge synthetic ֫(Ll/ܶ۬֨;)Ll/۫۫֨;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶ۬֨;->᩻:Ll/۫۫֨;

    return-object p0
.end method

.method public static ֫(Ll/ۗ֨۠;)Ll/ܶ۬֨;
    .locals 1

    .line 112
    sget-object v0, Ll/ܶ۬֨;->֫֫:Ll/ۙ֨۠;

    invoke-virtual {p0, v0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶ۬֨;

    if-nez v0, :cond_0

    .line 114
    new-instance v0, Ll/ܶ۬֨;

    invoke-direct {v0, p0}, Ll/ܶ۬֨;-><init>(Ll/ۗ֨۠;)V

    :cond_0
    return-object v0
.end method

.method public static ֫(Ll/۠֡֨;)Ll/ܿᩴ֨;
    .locals 3

    .line 4200
    iget-object v0, p0, Ll/۠֡֨;->᩺:Ll/֡֡֨;

    iget-object v0, v0, Ll/֡֡֨;->ܰ:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿᩴ֨;

    .line 4201
    iget-object v2, v1, Ll/ܿᩴ֨;->ܽ:Ll/۠֡֨;

    if-ne v2, p0, :cond_0

    return-object v1

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private ֫(Ll/ۙ֨֨;Ljava/util/HashMap;)V
    .locals 2

    .line 2016
    sget-object v0, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    invoke-virtual {p1, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 2017
    :cond_0
    iget-object v0, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {p2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 2018
    iget-object v0, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    invoke-virtual {v0, p1}, Ll/ۛ᩸֨;->᩸(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v1

    invoke-direct {p0, v1, p2}, Ll/ܶ۬֨;->֫(Ll/ۙ֨֨;Ljava/util/HashMap;)V

    .line 2019
    invoke-virtual {v0, p1}, Ll/ۛ᩸֨;->ۖ(Ll/ۙ֨֨;)Ll/ۖܶ۠;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۙ֨֨;

    .line 2020
    invoke-direct {p0, v0, p2}, Ll/ܶ۬֨;->֫(Ll/ۙ֨֨;Ljava/util/HashMap;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method private ֫(Ll/ۙ֨֨;Ljava/util/HashMap;Ljava/util/HashMap;)V
    .locals 2

    .line 2026
    sget-object v0, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    invoke-virtual {p1, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 2027
    :cond_0
    iget-object v0, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 2028
    :cond_1
    iget-object v0, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {p3, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    .line 2029
    iget-object v0, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    invoke-virtual {v0, p1}, Ll/ۛ᩸֨;->᩸(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v1

    invoke-direct {p0, v1, p2, p3}, Ll/ܶ۬֨;->֫(Ll/ۙ֨֨;Ljava/util/HashMap;Ljava/util/HashMap;)V

    .line 2030
    invoke-virtual {v0, p1}, Ll/ۛ᩸֨;->ۖ(Ll/ۙ֨֨;)Ll/ۖܶ۠;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۙ֨֨;

    .line 2031
    invoke-direct {p0, v0, p2, p3}, Ll/ܶ۬֨;->֫(Ll/ۙ֨֨;Ljava/util/HashMap;Ljava/util/HashMap;)V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method private ֫(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)V
    .locals 3

    .line 1061
    iget-object v0, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۛ᩸֨;->ᩳ(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 1064
    :cond_0
    invoke-virtual {p2}, Ll/ۙ֨֨;->ܳ֫()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1065
    invoke-virtual {v0, p2}, Ll/ۛ᩸֨;->᩸(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v1

    const/4 v2, 0x1

    .line 1071
    invoke-virtual {v0, p1, v1, v2}, Ll/ۛ᩸֨;->ܽ(Ll/ۙ֨֨;Ll/ۙ֨֨;Z)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1066
    invoke-virtual {v0, p2}, Ll/ۛ᩸֨;->ۖ(Ll/ۙ֨֨;)Ll/ۖܶ۠;

    move-result-object p2

    .line 1240
    :goto_0
    invoke-virtual {p2}, Ll/ۖܶ۠;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1241
    iget-object v1, p2, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v1, Ll/ۙ֨֨;

    invoke-virtual {v0, p1, v1, p3}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    .line 1240
    :cond_1
    iget-object p2, p2, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method private ֫(Ll/ۚ᩵۠;Ll/ۛ֡֨;Ljava/util/HashMap;)V
    .locals 11

    if-eqz p2, :cond_1

    .line 3695
    iget-wide v0, p2, Ll/ۛ֡֨;->᩶:J

    const-wide/32 v2, 0x40000000

    and-long v4, v0, v2

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-nez v8, :cond_1

    const-wide/32 v4, 0x8000000

    and-long v8, v0, v4

    cmp-long v10, v8, v6

    if-eqz v10, :cond_0

    const/4 p3, 0x0

    .line 712
    invoke-static {p2, p1, p3}, Ll/۟ۚ۠;->֫(Ll/ۛ֡֨;Ll/ۚۚ۠;Z)Ll/ۚۚ۠;

    move-result-object p1

    .line 3697
    sget-object p3, Ll/ۛᩴ۠;->ᩳᩳ:Ll/۫۠۠;

    iget-object v0, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    invoke-virtual {v0, p1, p3}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    goto :goto_0

    :cond_0
    or-long/2addr v0, v4

    .line 3700
    iput-wide v0, p2, Ll/ۛ֡֨;->᩶:J

    .line 3701
    invoke-virtual {p3, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛ֡֨;

    invoke-direct {p0, p1, v0, p3}, Ll/ܶ۬֨;->֫(Ll/ۚ᩵۠;Ll/ۛ֡֨;Ljava/util/HashMap;)V

    .line 3702
    iget-wide v0, p2, Ll/ۛ֡֨;->᩶:J

    const-wide/32 v4, -0x8000001

    and-long/2addr v0, v4

    iput-wide v0, p2, Ll/ۛ֡֨;->᩶:J

    .line 3704
    :goto_0
    iget-wide v0, p2, Ll/ۛ֡֨;->᩶:J

    or-long/2addr v0, v2

    iput-wide v0, p2, Ll/ۛ֡֨;->᩶:J

    :cond_1
    return-void
.end method

.method private ֫(Ll/ۧ֡۠;Ll/۟᩵֨;Ll/۟᩵֨;Ll/۟᩵֨;Ll/ۛ֡֨;Z)V
    .locals 4

    .line 3836
    new-instance v0, Ll/ܰܿۢ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p5}, Ll/ܰܿۢ;-><init>(ILjava/lang/Object;)V

    .line 3837
    iget-object v2, p5, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {p2, v2, v0}, Ll/۟᩵֨;->֫(Ll/ۤܶ۠;Ljava/util/function/Predicate;)Ll/ۛ֡֨;

    move-result-object p2

    if-nez p2, :cond_0

    if-nez p6, :cond_0

    .line 3840
    iget-object p6, p5, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {p3, p6, v0}, Ll/۟᩵֨;->֫(Ll/ۤܶ۠;Ljava/util/function/Predicate;)Ll/ۛ֡֨;

    move-result-object p3

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    const/4 p6, 0x0

    const-string v2, "compiler"

    .line 3842
    iget-object v3, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    if-nez p2, :cond_3

    if-eqz p3, :cond_1

    goto :goto_1

    .line 3849
    :cond_1
    iget-object p2, p5, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {p4, p2, v0}, Ll/۟᩵֨;->֫(Ll/ۤܶ۠;Ljava/util/function/Predicate;)Ll/ۛ֡֨;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 3851
    sget-object p3, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 123
    new-instance p3, Ll/۫۠۠;

    new-array p4, v1, [Ljava/lang/Object;

    aput-object p2, p4, p6

    const-string p2, "already.defined.this.unit"

    invoke-direct {p3, v2, p2, p4}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3851
    invoke-virtual {v3, p1, p3}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    :cond_2
    return-void

    :cond_3
    :goto_1
    if-eqz p2, :cond_4

    .line 3844
    sget-object p3, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 107
    new-instance p3, Ll/۫۠۠;

    new-array p4, v1, [Ljava/lang/Object;

    aput-object p2, p4, p6

    const-string p2, "already.defined.single.import"

    invoke-direct {p3, v2, p2, p4}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3844
    invoke-virtual {v3, p1, p3}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    return-void

    .line 3846
    :cond_4
    sget-object p2, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 115
    new-instance p2, Ll/۫۠۠;

    new-array p4, v1, [Ljava/lang/Object;

    aput-object p3, p4, p6

    const-string p3, "already.defined.static.single.import"

    invoke-direct {p2, v2, p3, p4}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3846
    invoke-virtual {v3, p1, p2}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    return-void
.end method

.method private ֫(Ll/ܳۚ۠;Ll/ۙ֨֨;Ll/ۖܶ۠;)V
    .locals 6

    .line 2385
    sget-object v0, Ll/ۢ۠֨;->ۢ֫:Ll/ۢ۠֨;

    invoke-virtual {p2, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v1}, Ll/ۛ֡֨;->۬()J

    move-result-wide v1

    const-wide/32 v3, 0x10000000

    and-long/2addr v1, v3

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    goto :goto_1

    .line 2387
    :cond_0
    invoke-virtual {p3, p2}, Ll/ۖܶ۠;->contains(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    if-eqz v1, :cond_1

    .line 2388
    move-object p3, p2

    check-cast p3, Ll/ۡ֨֨;

    .line 2389
    invoke-virtual {v2, p2}, Ll/ۛ᩸֨;->ܳ(Ll/ۙ֨֨;)Ll/۫ۚ֨;

    move-result-object v0

    invoke-virtual {p3, v0}, Ll/ۡ֨֨;->ᩳ(Ll/ۙ֨֨;)V

    .line 2390
    sget-object p3, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 1026
    new-instance p3, Ll/۫۠۠;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    const-string p2, "compiler"

    const-string v1, "cyclic.inheritance"

    invoke-direct {p3, p2, v1, v0}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2390
    iget-object p2, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    invoke-virtual {p2, p1, p3}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    return-void

    .line 2391
    :cond_1
    invoke-virtual {p2, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2392
    check-cast p2, Ll/ۡ֨֨;

    .line 2393
    invoke-virtual {p3, p2}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p3

    .line 2394
    invoke-virtual {v2, p2}, Ll/ۛ᩸֨;->֫(Ll/ۡ֨֨;)Ll/ۖܶ۠;

    move-result-object p2

    invoke-virtual {p2}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۙ֨֨;

    .line 2395
    invoke-direct {p0, p1, v0, p3}, Ll/ܶ۬֨;->֫(Ll/ܳۚ۠;Ll/ۙ֨֨;Ll/ۖܶ۠;)V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public static ֫(Ll/ܶ۬֨;Ljava/util/function/Supplier;Ll/ۛ֡֨;)V
    .locals 11

    .line 3562
    invoke-interface {p1}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۗ۠۠;

    .line 228
    iget-object v0, p0, Ll/ܶ۬֨;->᩷:Ll/ۙܶ۠;

    iget-object v1, p0, Ll/ܶ۬֨;->ۙ:Ll/ۙܶ۠;

    .line 379
    iget-wide v2, p2, Ll/ۛ֡֨;->᩶:J

    const-wide/high16 v4, 0x80000000000000L

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v8, 0x1

    const-string v9, "compiler"

    cmp-long v10, v2, v4

    if-eqz v10, :cond_1

    .line 229
    iget-object p0, p0, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    sget-object v0, Ll/᩶ᩴ֨;->ۡ֫:Ll/᩶ᩴ֨;

    invoke-virtual {p0, v0}, Ll/ۙᩴ֨;->ۧ(Ll/᩶ᩴ֨;)Z

    move-result p0

    if-nez p0, :cond_3

    .line 230
    iget-object p0, p2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v0, Ll/֨ᩴ֨;->۟:Ll/֨ᩴ֨;

    if-ne p0, v0, :cond_0

    .line 231
    sget-object p0, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4333
    new-instance p0, Ll/ۧܶ۠;

    new-array v0, v8, [Ljava/lang/Object;

    aput-object p2, v0, v7

    const-string p2, "has.been.deprecated.for.removal.module"

    invoke-direct {p0, v9, p2, v0}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    invoke-virtual {v1, p1, p0}, Ll/ۙܶ۠;->֫(Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    return-void

    .line 233
    :cond_0
    invoke-virtual {p2}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object p0

    sget-object v0, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4325
    new-instance v0, Ll/ۧܶ۠;

    new-array v2, v6, [Ljava/lang/Object;

    aput-object p2, v2, v7

    aput-object p0, v2, v8

    const-string p0, "has.been.deprecated.for.removal"

    invoke-direct {v0, v9, p0, v2}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    invoke-virtual {v1, p1, v0}, Ll/ۙܶ۠;->֫(Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    return-void

    .line 236
    :cond_1
    iget-object p0, p0, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    sget-object v1, Ll/᩶ᩴ֨;->۫:Ll/᩶ᩴ֨;

    invoke-virtual {p0, v1}, Ll/ۙᩴ֨;->ۧ(Ll/᩶ᩴ֨;)Z

    move-result p0

    if-nez p0, :cond_3

    .line 237
    iget-object p0, p2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v1, Ll/֨ᩴ֨;->۟:Ll/֨ᩴ֨;

    if-ne p0, v1, :cond_2

    .line 238
    sget-object p0, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4341
    new-instance p0, Ll/ۧܶ۠;

    new-array v1, v8, [Ljava/lang/Object;

    aput-object p2, v1, v7

    const-string p2, "has.been.deprecated.module"

    invoke-direct {p0, v9, p2, v1}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    invoke-virtual {v0, p1, p0}, Ll/ۙܶ۠;->֫(Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    return-void

    .line 240
    :cond_2
    invoke-virtual {p2}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object p0

    sget-object v1, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4317
    new-instance v1, Ll/ۧܶ۠;

    new-array v2, v6, [Ljava/lang/Object;

    aput-object p2, v2, v7

    aput-object p0, v2, v8

    const-string p0, "has.been.deprecated"

    invoke-direct {v1, v9, p0, v2}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    invoke-virtual {v0, p1, v1}, Ll/ۙܶ۠;->֫(Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    :cond_3
    return-void
.end method

.method public static ֫(Ll/ܶ۬֨;Ll/ۗ۠۠;)V
    .locals 2

    .line 289
    iget-object v0, p0, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    sget-object v1, Ll/᩶ᩴ֨;->ۛ:Ll/᩶ᩴ֨;

    invoke-virtual {v0, v1}, Ll/ۙᩴ֨;->֫(Ll/᩶ᩴ֨;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 290
    iget-object p0, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    sget-object v0, Ll/ܰᩴ۠;->ᩳ:Ll/ۧܶ۠;

    invoke-virtual {p0, v1, p1, v0}, Ll/ۖ֨۠;->ۧ(Ll/᩶ᩴ֨;Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ܶ۬֨;Ll/ۗ۠۠;Ll/ۛ֡֨;)V
    .locals 3

    .line 3569
    iget-object p0, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    sget-object v0, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 5045
    new-instance v0, Ll/ۧܶ۠;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const-string p2, "compiler"

    const-string v2, "sun.proprietary"

    invoke-direct {v0, p2, v2, v1}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3569
    invoke-virtual {p0, p1, v0}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    return-void
.end method

.method public static ֫(Ll/ܶ۬֨;Ll/ۗ۠۠;Ll/۠֡֨;)V
    .locals 3

    .line 4272
    iget-object v0, p0, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    sget-object v1, Ll/᩶ᩴ֨;->ܽ֫:Ll/᩶ᩴ֨;

    invoke-virtual {v0, v1}, Ll/ۙᩴ֨;->֫(Ll/᩶ᩴ֨;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4273
    iget-object p0, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    sget-object v0, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4670
    new-instance v0, Ll/ۧܶ۠;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const-string p2, "compiler"

    const-string v2, "package.empty.or.not.found"

    invoke-direct {v0, p2, v2, v1}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4273
    invoke-virtual {p0, p1, v0}, Ll/ۖ֨۠;->ۧ(Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ܶ۬֨;Ll/ۗ۠۠;Ll/ܳ֡֨;Ll/۠֡֨;Ll/֡֡֨;)V
    .locals 4

    .line 3927
    iget-object v0, p0, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    sget-object v1, Ll/᩶ᩴ֨;->֫֫:Ll/᩶ᩴ֨;

    invoke-virtual {v0, v1}, Ll/ۙᩴ֨;->֫(Ll/᩶ᩴ֨;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3928
    iget-object p0, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    .line 3929
    sget-object v0, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4502
    new-instance v0, Ll/ۧܶ۠;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    const/4 p2, 0x1

    aput-object p3, v2, p2

    const/4 p2, 0x2

    aput-object p4, v2, p2

    const-string p2, "compiler"

    const-string p3, "missing-explicit-ctor"

    invoke-direct {v0, p2, p3, v2}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3928
    invoke-virtual {p0, v1, p1, v0}, Ll/ۖ֨۠;->ۧ(Ll/᩶ᩴ֨;Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/ܶ۬֨;Ll/ۚۚ۠;)V
    .locals 2

    .line 1330
    iget-object v0, p0, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    sget-object v1, Ll/᩶ᩴ֨;->᩵֫:Ll/᩶ᩴ֨;

    invoke-virtual {v0, v1}, Ll/ۙᩴ֨;->֫(Ll/᩶ᩴ֨;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1331
    iget-object p0, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    sget-object v0, Ll/ܰᩴ۠;->ܶ:Ll/ۧܶ۠;

    invoke-virtual {p0, v1, p1, v0}, Ll/ۖ֨۠;->ۧ(Ll/᩶ᩴ֨;Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܶ۬֨;Ll/ۚۚ۠;Ll/ܳ֡֨;)V
    .locals 0

    .line 0
    invoke-direct {p0, p2, p1}, Ll/ܶ۬֨;->ܽ(Ll/ܳ֡֨;Ll/ۗ۠۠;)V

    return-void
.end method

.method public static ֫(Ll/ܶ۬֨;Ll/ۢᩴ֨;Ll/ۗ۠۠;)V
    .locals 2

    .line 4281
    iget-object v0, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    .line 307
    iget-object p1, p1, Ll/ۢᩴ֨;->֫:Ljava/util/Set;

    sget-object v1, Ll/ۡᩴ֨;->۫:Ll/ۡᩴ֨;

    invoke-interface {p1, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 4281
    iget-object p1, p0, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    sget-object v1, Ll/᩶ᩴ֨;->ۖ֫:Ll/᩶ᩴ֨;

    invoke-virtual {p1, v1}, Ll/ۙᩴ֨;->֫(Ll/᩶ᩴ֨;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 4282
    sget-object p0, Ll/ܰᩴ۠;->۠:Ll/ۧܶ۠;

    invoke-virtual {v0, p2, p0}, Ll/ۖ֨۠;->ۧ(Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    return-void

    .line 4283
    :cond_0
    iget-object p0, p0, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    sget-object p1, Ll/᩶ᩴ֨;->ܺ֫:Ll/᩶ᩴ֨;

    invoke-virtual {p0, p1}, Ll/ۙᩴ֨;->֫(Ll/᩶ᩴ֨;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 4284
    sget-object p0, Ll/ܰᩴ۠;->֨:Ll/ۧܶ۠;

    invoke-virtual {v0, p2, p0}, Ll/ۖ֨۠;->ۧ(Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    :cond_1
    return-void
.end method

.method public static ֫(Ll/ܶ۬֨;Ll/۫᩵۠;Ll/֡֡֨;)V
    .locals 4

    .line 4262
    iget-object v0, p0, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    sget-object v1, Ll/᩶ᩴ֨;->ۧ֫:Ll/᩶ᩴ֨;

    invoke-virtual {v0, v1}, Ll/ۙᩴ֨;->֫(Ll/᩶ᩴ֨;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4263
    iget-object p0, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    sget-object v0, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4532
    new-instance v0, Ll/ۧܶ۠;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    const-string p2, "compiler"

    const-string v3, "module.not.found"

    invoke-direct {v0, p2, v3, v2}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4263
    invoke-virtual {p0, v1, p1, v0}, Ll/ۖ֨۠;->ۧ(Ll/᩶ᩴ֨;Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ܶ۬֨;Ll/۫᩵۠;Ll/ۛ֡֨;Ll/۠֡֨;Z)V
    .locals 11

    .line 4217
    iget-object v0, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    invoke-static {p2}, Ll/ܶ۬֨;->֫(Ll/ۛ֡֨;)Z

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x3

    const-string v6, "compiler"

    if-nez v1, :cond_0

    if-nez p4, :cond_0

    .line 4218
    sget-object p0, Ll/᩶ᩴ֨;->᩺:Ll/᩶ᩴ֨;

    invoke-static {p2}, Ll/᩸ᩴ֨;->֫(Ll/ۛ֡֨;)Ll/۠ᩴ֨;

    move-result-object p3

    invoke-virtual {p2}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object p4

    iget-object p4, p4, Ll/۠֡֨;->᩺:Ll/֡֡֨;

    sget-object v1, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4434
    new-instance v1, Ll/ۧܶ۠;

    new-array v5, v5, [Ljava/lang/Object;

    aput-object p3, v5, v4

    aput-object p2, v5, v3

    aput-object p4, v5, v2

    const-string p2, "leaks.not.accessible"

    invoke-direct {v1, v6, p2, v5}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4218
    invoke-virtual {v0, p0, p1, v1}, Ll/ۖ֨۠;->ۧ(Ll/᩶ᩴ֨;Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    return-void

    .line 4222
    :cond_0
    invoke-virtual {p2}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object p4

    .line 4223
    invoke-static {p4}, Ll/ܶ۬֨;->֫(Ll/۠֡֨;)Ll/ܿᩴ֨;

    move-result-object v1

    .line 4224
    invoke-static {p3}, Ll/ܶ۬֨;->֫(Ll/۠֡֨;)Ll/ܿᩴ֨;

    move-result-object v7

    if-nez v1, :cond_1

    .line 4227
    sget-object p0, Ll/᩶ᩴ֨;->᩺:Ll/᩶ᩴ֨;

    invoke-static {p2}, Ll/᩸ᩴ֨;->֫(Ll/ۛ֡֨;)Ll/۠ᩴ֨;

    move-result-object p3

    invoke-virtual {p2}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object p4

    iget-object p4, p4, Ll/۠֡֨;->᩺:Ll/֡֡֨;

    sget-object v1, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4450
    new-instance v1, Ll/ۧܶ۠;

    new-array v5, v5, [Ljava/lang/Object;

    aput-object p3, v5, v4

    aput-object p2, v5, v3

    aput-object p4, v5, v2

    const-string p2, "leaks.not.accessible.unexported"

    invoke-direct {v1, v6, p2, v5}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4227
    invoke-virtual {v0, p0, p1, v1}, Ll/ۖ֨۠;->ۧ(Ll/᩶ᩴ֨;Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    return-void

    .line 4231
    :cond_1
    iget-object v1, v1, Ll/ܿᩴ֨;->ۧ:Ll/ۖܶ۠;

    if-eqz v1, :cond_3

    .line 4232
    iget-object v7, v7, Ll/ܿᩴ֨;->ۧ:Ll/ۖܶ۠;

    if-eqz v7, :cond_2

    invoke-virtual {v1, v7}, Ljava/util/AbstractCollection;->containsAll(Ljava/util/Collection;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 4233
    :cond_2
    sget-object v1, Ll/᩶ᩴ֨;->᩺:Ll/᩶ᩴ֨;

    invoke-static {p2}, Ll/᩸ᩴ֨;->֫(Ll/ۛ֡֨;)Ll/۠ᩴ֨;

    move-result-object v7

    invoke-virtual {p2}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object v8

    iget-object v8, v8, Ll/۠֡֨;->᩺:Ll/֡֡֨;

    sget-object v9, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4458
    new-instance v9, Ll/ۧܶ۠;

    new-array v10, v5, [Ljava/lang/Object;

    aput-object v7, v10, v4

    aput-object p2, v10, v3

    aput-object v8, v10, v2

    const-string v7, "leaks.not.accessible.unexported.qualified"

    invoke-direct {v9, v6, v7, v10}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4233
    invoke-virtual {v0, v1, p1, v9}, Ll/ۖ֨۠;->ۧ(Ll/᩶ᩴ֨;Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    .line 4237
    :cond_3
    iget-object v1, p4, Ll/۠֡֨;->᩺:Ll/֡֡֨;

    iget-object p3, p3, Ll/۠֡֨;->᩺:Ll/֡֡֨;

    if-eq v1, p3, :cond_9

    iget-object p0, p0, Ll/ܶ۬֨;->ۤ:Ll/᩷ۚ֨;

    iget-object p0, p0, Ll/᩷ۚ֨;->ܿ֫:Ll/֡֡֨;

    if-eq v1, p0, :cond_9

    .line 4239
    invoke-static {p3}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p0

    .line 4241
    :cond_4
    :goto_0
    invoke-virtual {p0}, Ll/ۖܶ۠;->ܽ()Z

    move-result p3

    if-eqz p3, :cond_8

    .line 4242
    iget-object p3, p0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast p3, Ll/֡֡֨;

    .line 4243
    iget-object p0, p0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    .line 4244
    iget-object v1, p4, Ll/۠֡֨;->᩺:Ll/֡֡֨;

    if-ne p3, v1, :cond_5

    goto :goto_2

    .line 111
    :cond_5
    iget-wide v7, p3, Ll/ۛ֡֨;->᩶:J

    const-wide/high16 v9, 0x10000000000000L

    and-long/2addr v7, v9

    const-wide/16 v9, 0x0

    cmp-long v1, v7, v9

    if-eqz v1, :cond_6

    goto :goto_0

    .line 4248
    :cond_6
    iget-object p3, p3, Ll/֡֡֨;->᩻֫:Ll/ۖܶ۠;

    invoke-virtual {p3}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_7
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۢᩴ֨;

    .line 307
    iget-object v7, v1, Ll/ۢᩴ֨;->֫:Ljava/util/Set;

    sget-object v8, Ll/ۡᩴ֨;->۫:Ll/ۡᩴ֨;

    invoke-interface {v7, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    .line 4250
    iget-object v1, v1, Ll/ۢᩴ֨;->ۧ:Ll/֡֡֨;

    invoke-virtual {p0, v1}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p0

    goto :goto_1

    .line 4255
    :cond_8
    sget-object p0, Ll/᩶ᩴ֨;->᩺:Ll/᩶ᩴ֨;

    invoke-static {p2}, Ll/᩸ᩴ֨;->֫(Ll/ۛ֡֨;)Ll/۠ᩴ֨;

    move-result-object p3

    invoke-virtual {p2}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object p4

    iget-object p4, p4, Ll/۠֡֨;->᩺:Ll/֡֡֨;

    sget-object v1, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4442
    new-instance v1, Ll/ۧܶ۠;

    new-array v5, v5, [Ljava/lang/Object;

    aput-object p3, v5, v4

    aput-object p2, v5, v3

    aput-object p4, v5, v2

    const-string p2, "leaks.not.accessible.not.required.transitive"

    invoke-direct {v1, v6, p2, v5}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4255
    invoke-virtual {v0, p0, p1, v1}, Ll/ۖ֨۠;->ۧ(Ll/᩶ᩴ֨;Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    :cond_9
    :goto_2
    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܶ۬֨;Ll/ܿ᩵۠;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܶ۬֨;->ۧ(Ll/ܿ᩵۠;)Z

    return-void
.end method

.method public static ֫(Ll/ܶ۬֨;Ll/ᩳۚ۠;)V
    .locals 5

    .line 653
    iget-object v0, p0, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    sget-object v1, Ll/᩶ᩴ֨;->ۗ:Ll/᩶ᩴ֨;

    invoke-virtual {v0, v1}, Ll/ۙᩴ֨;->֫(Ll/᩶ᩴ֨;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 654
    iget-object p0, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    .line 655
    iget-object v0, p1, Ll/ᩳۚ۠;->ۗ:Ll/ۚۚ۠;

    iget-object v0, v0, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    sget-object v2, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4955
    new-instance v2, Ll/ۧܶ۠;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const-string v0, "compiler"

    const-string v4, "redundant.cast"

    invoke-direct {v2, v0, v4, v3}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 654
    invoke-virtual {p0, v1, p1, v2}, Ll/ۖ֨۠;->ۧ(Ll/᩶ᩴ֨;Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ۛ֡֨;)Z
    .locals 6

    .line 4208
    :goto_0
    iget-object v0, p0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v1, Ll/֨ᩴ֨;->ᩳ֫:Ll/֨ᩴ֨;

    if-eq v0, v1, :cond_1

    .line 4209
    invoke-virtual {p0}, Ll/ۛ֡֨;->۬()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    invoke-virtual {p0}, Ll/ۛ֡֨;->۬()J

    move-result-wide v0

    const-wide/16 v4, 0x4

    and-long/2addr v0, v4

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 p0, 0x0

    return p0

    .line 4212
    :cond_0
    iget-object p0, p0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static ֫(Ll/ۛ֡֨;Ll/۠֡֨;)Z
    .locals 4

    .line 4064
    :try_start_0
    invoke-virtual {p0}, Ll/ۛ֡֨;->۬()J

    move-result-wide v0

    const-wide/16 v2, 0x7

    and-long/2addr v0, v2

    long-to-int v1, v0

    if-eqz v1, :cond_0

    const/4 v0, 0x2

    if-eq v1, v0, :cond_1

    const/4 v0, 0x4

    if-eq v1, v0, :cond_0

    goto :goto_0

    .line 4073
    :cond_0
    invoke-virtual {p0}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object p0
    :try_end_0
    .catch Ll/᩸ۘ֨; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/᩷֡֨; {:try_start_0 .. :try_end_0} :catch_0

    if-ne p0, p1, :cond_1

    :goto_0
    const/4 p0, 0x1

    return p0

    :catch_0
    :cond_1
    const/4 p0, 0x0

    return p0

    :catch_1
    move-exception p0

    .line 4076
    throw p0
.end method

.method public static bridge synthetic ֫(Ll/ܶ۬֨;Ll/ۘ֡֨;)Z
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܶ۬֨;->ۧ(Ll/ۛ֡֨;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ֫(Ll/ܶ۬֨;Ll/ۛ֡֨;)Z
    .locals 0

    .line 0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Ll/ܶ۬֨;->֫(Ll/ۛ֡֨;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ֫(Ll/ܶ۬֨;Ll/ۤܶ۠;)Z
    .locals 0

    .line 2973
    iget-object p0, p0, Ll/ܶ۬֨;->ܶ:Ll/ۛܶ۠;

    iget-object p0, p0, Ll/ۛܶ۠;->֫֫:Ll/ۤܶ۠;

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic ֫(Ll/ܶ۬֨;Ll/ܽۘ֨;)Z
    .locals 2

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2973
    iget-object p1, p1, Ll/ۡۘ֨;->֫:Ll/ۙ֨֨;

    iget-object p1, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {p0, p1}, Ll/ܶ۬֨;->ۧ(Ll/᩶֡֨;)[Ll/ۤܶ۠;

    move-result-object p1

    invoke-static {p1}, Ll/᩹۬ᩴ;->stream([Ljava/lang/Object;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance v0, Ll/۫ۗ֨;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/۫ۗ֨;-><init>(ILjava/lang/Object;)V

    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result p0

    return p0
.end method

.method public static ֫(Ll/ܶ۬֨;ZLl/ۡۘ֨;)Z
    .locals 1

    .line 3308
    check-cast p2, Ll/ܿۘ֨;

    .line 3309
    iget-object p2, p2, Ll/ܿۘ֨;->ۧ:Ll/۫֡֨;

    iget-object p2, p2, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object p0, p0, Ll/ܶ۬֨;->ܶ:Ll/ۛܶ۠;

    iget-object v0, p0, Ll/ۛܶ۠;->֨֫:Ll/ۤܶ۠;

    if-eq p2, v0, :cond_1

    if-eqz p1, :cond_0

    iget-object p0, p0, Ll/ۛܶ۠;->ۚ֫:Ll/ۤܶ۠;

    if-ne p2, p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private ֫(Ll/᩶֡֨;Ll/᩶֡֨;Ll/۠֡֨;Ll/ۤܶ۠;Ljava/util/HashSet;)Z
    .locals 9

    if-eqz p1, :cond_5

    .line 4039
    invoke-virtual {p5, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 4043
    :cond_0
    iget-object v0, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    iget-object v1, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    invoke-virtual {v1, v0}, Ll/ۛ᩸֨;->᩸(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v0

    iget-object v3, v0, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    move-object v2, p0

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v2 .. v7}, Ll/ܶ۬֨;->֫(Ll/᩶֡֨;Ll/᩶֡֨;Ll/۠֡֨;Ll/ۤܶ۠;Ljava/util/HashSet;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 4046
    :cond_1
    iget-object v0, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v1, v0}, Ll/ۛ᩸֨;->ۖ(Ll/ۙ֨֨;)Ll/ۖܶ۠;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۙ֨֨;

    .line 4047
    iget-object v4, v2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    move-object v3, p0

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    move-object v8, p5

    invoke-direct/range {v3 .. v8}, Ll/ܶ۬֨;->֫(Ll/᩶֡֨;Ll/᩶֡֨;Ll/۠֡֨;Ll/ۤܶ۠;Ljava/util/HashSet;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    .line 4050
    :cond_3
    invoke-virtual {p1}, Ll/ۛ֡֨;->֨֫()Ll/ܰ᩵֨;

    move-result-object p1

    invoke-virtual {p1, p4}, Ll/۟᩵֨;->֫(Ll/ۤܶ۠;)Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ll/ۛ֡֨;

    .line 4051
    invoke-virtual {p4}, Ll/ۛ֡֨;->֡֫()Z

    move-result p5

    if-eqz p5, :cond_4

    .line 4052
    invoke-static {p4, p3}, Ll/ܶ۬֨;->֫(Ll/ۛ֡֨;Ll/۠֡֨;)Z

    move-result p5

    if-eqz p5, :cond_4

    .line 4053
    invoke-virtual {p4, p2, v1}, Ll/ۛ֡֨;->֫(Ll/᩶֡֨;Ll/ۛ᩸֨;)Z

    move-result p4

    if-eqz p4, :cond_4

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_5
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public static bridge synthetic ۜ(Ll/ܶ۬֨;)Ll/᩷ۚ֨;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶ۬֨;->ۤ:Ll/᩷ۚ֨;

    return-object p0
.end method

.method private ۡ(Ll/ۗ۠۠;Ll/ۙ֨֨;)Z
    .locals 11

    .line 2409
    iget-object p2, p2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 2410
    iget-wide v0, p2, Ll/ۛ֡֨;->᩶:J

    const-wide/32 v2, 0x40000000

    and-long v4, v0, v2

    const/4 v6, 0x1

    const-wide/16 v7, 0x0

    cmp-long v9, v4, v7

    if-eqz v9, :cond_0

    return v6

    :cond_0
    const-wide/32 v4, 0x8000000

    and-long/2addr v0, v4

    cmp-long v9, v0, v7

    if-eqz v9, :cond_1

    .line 2413
    move-object v0, p2

    check-cast v0, Ll/ܳ֡֨;

    invoke-direct {p0, v0, p1}, Ll/ܶ۬֨;->ܽ(Ll/ܳ֡֨;Ll/ۗ۠۠;)V

    goto :goto_2

    .line 2414
    :cond_1
    iget-object v0, p2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v0}, Ll/ۙ֨֨;->᩻֫()Z

    move-result v0

    if-nez v0, :cond_6

    const-wide/32 v0, -0x8000001

    .line 2416
    :try_start_0
    iget-wide v9, p2, Ll/ۛ֡֨;->᩶:J

    or-long/2addr v4, v9

    iput-wide v4, p2, Ll/ۛ֡֨;->᩶:J

    .line 2417
    iget-object v4, p2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    sget-object v5, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    invoke-virtual {v4, v5}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 2418
    iget-object v4, p2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    check-cast v4, Ll/᩶ۚ֨;

    .line 2419
    iget-object v5, v4, Ll/᩶ۚ֨;->ۨ:Ll/ۖܶ۠;

    const/4 v9, 0x1

    if-eqz v5, :cond_2

    .line 2420
    :goto_0
    invoke-virtual {v5}, Ll/ۖܶ۠;->ܽ()Z

    move-result v10

    if-eqz v10, :cond_2

    .line 2421
    iget-object v10, v5, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v10, Ll/ۙ֨֨;

    invoke-direct {p0, p1, v10}, Ll/ܶ۬֨;->ۡ(Ll/ۗ۠۠;Ll/ۙ֨֨;)Z

    move-result v10

    and-int/2addr v9, v10

    .line 2420
    iget-object v5, v5, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    .line 2422
    :cond_2
    iget-object v4, v4, Ll/᩶ۚ֨;->۟:Ll/ۙ֨֨;

    if-eqz v4, :cond_3

    if-eqz v4, :cond_3

    .line 2424
    sget-object v5, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    invoke-virtual {v4, v5}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 2425
    invoke-direct {p0, p1, v4}, Ll/ܶ۬֨;->ۡ(Ll/ۗ۠۠;Ll/ۙ֨֨;)Z

    move-result v4

    and-int/2addr v9, v4

    .line 2427
    :cond_3
    iget-object v4, p2, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v5, v4, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v10, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-ne v5, v10, :cond_5

    .line 2428
    iget-object v4, v4, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-direct {p0, p1, v4}, Ll/ܶ۬֨;->ۡ(Ll/ۗ۠۠;Ll/ۙ֨֨;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    and-int/2addr v9, p1

    goto :goto_1

    :cond_4
    const/4 v9, 0x1

    .line 2431
    :cond_5
    :goto_1
    iget-wide v4, p2, Ll/ۛ֡֨;->᩶:J

    and-long/2addr v0, v4

    iput-wide v0, p2, Ll/ۛ֡֨;->᩶:J

    goto :goto_3

    :catchall_0
    move-exception p1

    iget-wide v2, p2, Ll/ۛ֡֨;->᩶:J

    and-long/2addr v0, v2

    iput-wide v0, p2, Ll/ۛ֡֨;->᩶:J

    .line 2432
    throw p1

    :cond_6
    :goto_2
    const/4 v9, 0x1

    :goto_3
    if-eqz v9, :cond_8

    .line 2435
    iget-wide v0, p2, Ll/ۛ֡֨;->᩶:J

    const-wide/32 v4, 0x10000000

    and-long/2addr v0, v4

    cmp-long p1, v0, v7

    if-nez p1, :cond_7

    .line 233
    iget-object p1, p2, Ll/ۛ֡֨;->᩸:Ll/ۜ֡֨;

    invoke-interface {p1}, Ll/ۜ֡֨;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_4

    :cond_7
    const/4 v6, 0x0

    :goto_4
    move v9, v6

    :cond_8
    if-eqz v9, :cond_9

    .line 2436
    iget-wide v0, p2, Ll/ۛ֡֨;->᩶:J

    or-long/2addr v0, v2

    iput-wide v0, p2, Ll/ۛ֡֨;->᩶:J

    :cond_9
    return v9
.end method

.method public static bridge synthetic ۧ(Ll/ܶ۬֨;)Ll/ۛ۠۠;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶ۬֨;->ۡ:Ll/ۛ۠۠;

    return-object p0
.end method

.method public static ۧ(Ll/ۘ֡֨;Ll/ۘ֡֨;)Ll/ۨ۠۠;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1727
    invoke-virtual/range {p0 .. p0}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v2

    .line 1728
    invoke-virtual/range {p1 .. p1}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v3

    .line 1730
    iget-object v4, v1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    invoke-virtual {v4}, Ll/ۛ֡֨;->۬()J

    move-result-wide v4

    const-wide/16 v6, 0x200

    and-long/2addr v4, v6

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x4

    const-string v13, "compiler"

    const-wide/16 v14, 0x0

    cmp-long v16, v4, v14

    if-nez v16, :cond_0

    .line 1731
    sget-object v4, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 8292
    new-instance v4, Ll/ۨ۠۠;

    new-array v5, v12, [Ljava/lang/Object;

    aput-object v0, v5, v11

    aput-object v2, v5, v10

    aput-object v1, v5, v9

    aput-object v3, v5, v8

    const-string v0, "unchecked.override"

    invoke-direct {v4, v13, v0, v5}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v4

    .line 1732
    :cond_0
    iget-object v4, v0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    invoke-virtual {v4}, Ll/ۛ֡֨;->۬()J

    move-result-wide v4

    and-long/2addr v4, v6

    cmp-long v6, v4, v14

    if-nez v6, :cond_1

    .line 1733
    sget-object v4, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 8284
    new-instance v4, Ll/ۨ۠۠;

    new-array v5, v12, [Ljava/lang/Object;

    aput-object v0, v5, v11

    aput-object v2, v5, v10

    aput-object v1, v5, v9

    aput-object v3, v5, v8

    const-string v0, "unchecked.implement"

    invoke-direct {v4, v13, v0, v5}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v4

    .line 1735
    :cond_1
    sget-object v4, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 8276
    new-instance v4, Ll/ۨ۠۠;

    new-array v5, v12, [Ljava/lang/Object;

    aput-object v0, v5, v11

    aput-object v2, v5, v10

    aput-object v1, v5, v9

    aput-object v3, v5, v8

    const-string v0, "unchecked.clash.with"

    invoke-direct {v4, v13, v0, v5}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v4
.end method

.method private ۧ(Ll/ۛ֡֨;)Z
    .locals 7

    .line 971
    invoke-virtual {p1}, Ll/ۛ֡֨;->۬()J

    move-result-wide v0

    const-wide v2, 0x400000000L

    and-long/2addr v0, v2

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    cmp-long v5, v0, v3

    if-eqz v5, :cond_2

    .line 972
    invoke-virtual {p1}, Ll/ۛ֡֨;->ۜ֫()Z

    move-result v0

    if-nez v0, :cond_1

    .line 973
    invoke-virtual {p1}, Ll/ۛ֡֨;->۬()J

    move-result-wide v0

    .line 974
    sget-object p1, Ll/ۧ֡֨;->ᩴ֫:Ll/ۧ֡֨;

    iget-object v5, p0, Ll/ܶ۬֨;->۬:Ll/ܽ֡֨;

    invoke-virtual {p1, v5}, Ll/ۧ֡֨;->֫(Ll/ܽ֡֨;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    or-int/lit8 p1, p1, 0x18

    int-to-long v5, p1

    and-long/2addr v0, v5

    cmp-long p1, v0, v3

    if-eqz p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    return v2
.end method

.method private ۧ(Ll/ܿ᩵۠;)Z
    .locals 12

    .line 3470
    iget-object v0, p1, Ll/ܿ᩵۠;->ۗ:Ll/ۚۚ۠;

    iget-object v0, v0, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    iget-object v0, v0, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v0}, Ll/᩶֡֨;->᩹֫()Ll/᩸᩹֨;

    move-result-object v0

    .line 3473
    invoke-virtual {v0}, Ll/᩸᩹֨;->֫()Ljava/util/LinkedHashSet;

    move-result-object v1

    .line 3476
    iget-object v2, p1, Ll/ܿ᩵۠;->۬:Ll/ۖܶ۠;

    invoke-virtual {v2}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x1

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x2

    const-string v7, "compiler"

    iget-object v8, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    const/4 v9, 0x0

    if-eqz v5, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۚۚ۠;

    .line 3477
    sget-object v10, Ll/ᩴۚ۠;->ۤ:Ll/ᩴۚ۠;

    invoke-virtual {v5, v10}, Ll/ۚۚ۠;->֫(Ll/ᩴۚ۠;)Z

    move-result v10

    if-nez v10, :cond_1

    goto :goto_0

    .line 3478
    :cond_1
    check-cast v5, Ll/᩷᩵۠;

    .line 3479
    iget-object v10, v5, Ll/᩷᩵۠;->ۗ:Ll/۫᩵۠;

    invoke-static {v10}, Ll/۟ۚ۠;->᩹(Ll/ۚۚ۠;)Ll/ۛ֡֨;

    move-result-object v10

    if-eqz v10, :cond_0

    .line 3480
    iget-object v11, v10, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v11}, Ll/ۙ֨֨;->᩻֫()Z

    move-result v11

    if-eqz v11, :cond_2

    goto :goto_0

    .line 3481
    :cond_2
    invoke-interface {v1, v10}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_0

    .line 3483
    iget-object v4, v5, Ll/᩷᩵۠;->ۗ:Ll/۫᩵۠;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, v10, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v10, p1, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    .line 3484
    sget-object v11, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 1182
    new-instance v11, Ll/۫۠۠;

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v5, v6, v9

    aput-object v10, v6, v3

    const-string v5, "duplicate.annotation.member.value"

    invoke-direct {v11, v7, v5, v6}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3483
    invoke-virtual {v8, v4, v11}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    const/4 v4, 0x0

    goto :goto_0

    .line 3489
    :cond_3
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v2

    .line 3490
    invoke-virtual {v0}, Ll/᩸᩹֨;->ۧ()Ljava/util/LinkedHashSet;

    move-result-object v0

    .line 3491
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۘ֡֨;

    .line 3492
    iget-object v10, v5, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v10}, Ll/ۙ֨֨;->᩻֫()Z

    move-result v10

    if-eqz v10, :cond_5

    goto :goto_1

    .line 3495
    :cond_5
    invoke-interface {v0, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_4

    .line 3496
    iget-object v5, v5, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {v2, v5}, Ll/ۖܶ۠;->֫(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v2

    goto :goto_1

    .line 3498
    :cond_6
    invoke-virtual {v2}, Ll/ۖܶ۠;->ᩳ()Ll/ۖܶ۠;

    move-result-object v0

    .line 3499
    invoke-virtual {v0}, Ll/ۖܶ۠;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 218
    invoke-virtual {v0}, Ll/ۖܶ۠;->ۧ()I

    move-result v1

    if-le v1, v3, :cond_7

    .line 3502
    iget-object v1, p1, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    sget-object v2, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 145
    new-instance v2, Ll/۫۠۠;

    new-array v4, v6, [Ljava/lang/Object;

    aput-object v1, v4, v9

    aput-object v0, v4, v3

    const-string v0, "annotation.missing.default.value.1"

    invoke-direct {v2, v7, v0, v4}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 3503
    :cond_7
    iget-object v1, p1, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    sget-object v2, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 137
    new-instance v2, Ll/۫۠۠;

    new-array v4, v6, [Ljava/lang/Object;

    aput-object v1, v4, v9

    aput-object v0, v4, v3

    const-string v0, "annotation.missing.default.value"

    invoke-direct {v2, v7, v0, v4}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3504
    :goto_2
    invoke-virtual {v8, p1, v2}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    const/4 v4, 0x0

    :cond_8
    if-eqz v4, :cond_10

    .line 3514
    iget-object v0, p1, Ll/ܿ᩵۠;->ۗ:Ll/ۚۚ۠;

    iget-object v0, v0, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    iget-object v0, v0, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v1, p0, Ll/ܶ۬֨;->ۤ:Ll/᩷ۚ֨;

    iget-object v1, v1, Ll/᩷ۚ֨;->֫:Ll/ۙ֨֨;

    iget-object v1, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    if-ne v0, v1, :cond_f

    iget-object v0, p1, Ll/ܿ᩵۠;->۬:Ll/ۖܶ۠;

    iget-object v1, v0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    if-nez v1, :cond_9

    goto :goto_5

    .line 3519
    :cond_9
    iget-object v0, v0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/۫᩵۠;

    sget-object v1, Ll/ᩴۚ۠;->ۤ:Ll/ᩴۚ۠;

    invoke-virtual {v0, v1}, Ll/ۚۚ۠;->֫(Ll/ᩴۚ۠;)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_3

    .line 3520
    :cond_a
    iget-object p1, p1, Ll/ܿ᩵۠;->۬:Ll/ۖܶ۠;

    iget-object p1, p1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast p1, Ll/᩷᩵۠;

    .line 3521
    iget-object v0, p1, Ll/᩷᩵۠;->ۗ:Ll/۫᩵۠;

    invoke-static {v0}, Ll/۟ۚ۠;->᩹(Ll/ۚۚ۠;)Ll/ۛ֡֨;

    move-result-object v0

    .line 3522
    iget-object v0, v0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v1, p0, Ll/ܶ۬֨;->ܶ:Ll/ۛܶ۠;

    iget-object v1, v1, Ll/ۛܶ۠;->ܶܽ:Ll/ۤܶ۠;

    if-eq v0, v1, :cond_b

    goto :goto_3

    .line 3523
    :cond_b
    iget-object p1, p1, Ll/᩷᩵۠;->۬:Ll/۫᩵۠;

    .line 3524
    sget-object v0, Ll/ᩴۚ۠;->ۡۧ:Ll/ᩴۚ۠;

    invoke-virtual {p1, v0}, Ll/ۚۚ۠;->֫(Ll/ᩴۚ۠;)Z

    move-result v0

    if-nez v0, :cond_c

    :goto_3
    const/4 p1, 0x0

    goto :goto_6

    .line 3525
    :cond_c
    check-cast p1, Ll/ᩴ֡۠;

    .line 3526
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 3527
    iget-object p1, p1, Ll/ᩴ֡۠;->ۤ:Ll/ۖܶ۠;

    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x1

    :cond_d
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۚۚ۠;

    .line 3528
    invoke-static {v2}, Ll/۟ۚ۠;->᩹(Ll/ۚۚ۠;)Ll/ۛ֡֨;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    .line 3530
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Ll/ۛᩴ۠;->ܿᩳ:Ll/۫۠۠;

    invoke-virtual {v8, v2, v1}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    const/4 v1, 0x0

    goto :goto_4

    :cond_e
    move p1, v1

    goto :goto_6

    :cond_f
    :goto_5
    const/4 p1, 0x1

    :goto_6
    if-eqz p1, :cond_10

    return v3

    :cond_10
    return v9
.end method

.method public static bridge synthetic ܳ(Ll/ܶ۬֨;)Ll/ۘ֡֨;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶ۬֨;->۠:Ll/ۘ֡֨;

    return-object p0
.end method

.method public static ܽ(Ll/ۘ֡֨;Ll/ۘ֡֨;)Ll/ۨ۠۠;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1744
    invoke-virtual/range {p0 .. p0}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v2

    .line 1745
    invoke-virtual/range {p1 .. p1}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v3

    .line 1747
    iget-object v4, v1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    invoke-virtual {v4}, Ll/ۛ֡֨;->۬()J

    move-result-wide v4

    const-wide/16 v6, 0x200

    and-long/2addr v4, v6

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x4

    const-string v13, "compiler"

    const-wide/16 v14, 0x0

    cmp-long v16, v4, v14

    if-nez v16, :cond_0

    .line 1748
    sget-object v4, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 8394
    new-instance v4, Ll/ۨ۠۠;

    new-array v5, v12, [Ljava/lang/Object;

    aput-object v0, v5, v11

    aput-object v2, v5, v10

    aput-object v1, v5, v9

    aput-object v3, v5, v8

    const-string v0, "varargs.override"

    invoke-direct {v4, v13, v0, v5}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v4

    .line 1749
    :cond_0
    iget-object v4, v0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    invoke-virtual {v4}, Ll/ۛ֡֨;->۬()J

    move-result-wide v4

    and-long/2addr v4, v6

    cmp-long v6, v4, v14

    if-nez v6, :cond_1

    .line 1750
    sget-object v4, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 8386
    new-instance v4, Ll/ۨ۠۠;

    new-array v5, v12, [Ljava/lang/Object;

    aput-object v0, v5, v11

    aput-object v2, v5, v10

    aput-object v1, v5, v9

    aput-object v3, v5, v8

    const-string v0, "varargs.implement"

    invoke-direct {v4, v13, v0, v5}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v4

    .line 1752
    :cond_1
    sget-object v4, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 8378
    new-instance v4, Ll/ۨ۠۠;

    new-array v5, v12, [Ljava/lang/Object;

    aput-object v0, v5, v11

    aput-object v2, v5, v10

    aput-object v1, v5, v9

    aput-object v3, v5, v8

    const-string v0, "varargs.clash.with"

    invoke-direct {v4, v13, v0, v5}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v4
.end method

.method public static bridge synthetic ܽ(Ll/ܶ۬֨;)Ll/ܰ۫֨;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶ۬֨;->ܺ:Ll/ܰ۫֨;

    return-object p0
.end method

.method private ܽ(Ll/ܳ֡֨;Ll/ۗ۠۠;)V
    .locals 4

    .line 2442
    sget-object v0, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 1018
    new-instance v0, Ll/۫۠۠;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string v2, "compiler"

    const-string v3, "cyclic.inheritance"

    invoke-direct {v0, v2, v3, v1}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2442
    iget-object v1, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    invoke-virtual {v1, p2, v0}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    .line 2443
    iget-object p2, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    iget-object v0, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    invoke-virtual {v0, p2}, Ll/ۛ᩸֨;->ۖ(Ll/ۙ֨֨;)Ll/ۖܶ۠;

    move-result-object p2

    :goto_0
    invoke-virtual {p2}, Ll/ۖܶ۠;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2444
    iget-object v1, p2, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v1, Ll/ۙ֨֨;

    iget-object v1, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    check-cast v1, Ll/ܳ֡֨;

    sget-object v2, Ll/ۙ֨֨;->ۙ:Ll/ۨۚ֨;

    .line 3567
    new-instance v3, Ll/۫ۚ֨;

    invoke-direct {v3, v1, v2}, Ll/۫ۚ֨;-><init>(Ll/ܳ֡֨;Ll/ۙ֨֨;)V

    .line 2444
    iput-object v3, p2, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    .line 2443
    iget-object p2, p2, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    .line 2445
    :cond_0
    iget-object p2, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v0, p2}, Ll/ۛ᩸֨;->᩸(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p2

    .line 2446
    sget-object v0, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    invoke-virtual {p2, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2447
    iget-object v0, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    check-cast v0, Ll/᩶ۚ֨;

    iget-object p2, p2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    check-cast p2, Ll/ܳ֡֨;

    sget-object v1, Ll/ۙ֨֨;->ۙ:Ll/ۨۚ֨;

    .line 3567
    new-instance v2, Ll/۫ۚ֨;

    invoke-direct {v2, p2, v1}, Ll/۫ۚ֨;-><init>(Ll/ܳ֡֨;Ll/ۙ֨֨;)V

    .line 2447
    iput-object v2, v0, Ll/᩶ۚ֨;->۟:Ll/ۙ֨֨;

    .line 2448
    :cond_1
    iget-object p2, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 3567
    new-instance v0, Ll/۫ۚ֨;

    invoke-direct {v0, p1, p2}, Ll/۫ۚ֨;-><init>(Ll/ܳ֡֨;Ll/ۙ֨֨;)V

    .line 2448
    iput-object v0, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 2449
    iget-wide v0, p1, Ll/ۛ֡֨;->᩶:J

    const-wide/32 v2, 0x40000000

    or-long/2addr v0, v2

    iput-wide v0, p1, Ll/ۛ֡֨;->᩶:J

    return-void
.end method

.method public static ܽ(Ll/ۙ֨֨;)Z
    .locals 2

    .line 885
    sget-object v0, Ll/ܶ۬֨;->ۧ֫:Ll/ۘ᩸֨;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    .line 4900
    invoke-virtual {p0, v0, v1}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 885
    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private ܽ()[Ll/ۤܶ۠;
    .locals 3

    .line 3431
    iget-object v0, p0, Ll/ܶ۬֨;->ۢ:[Ll/ۤܶ۠;

    if-nez v0, :cond_2

    .line 3432
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3433
    iget-object v1, p0, Ll/ܶ۬֨;->ܶ:Ll/ۛܶ۠;

    iget-object v2, v1, Ll/ۛܶ۠;->᩺:Ll/ۤܶ۠;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3434
    iget-object v2, v1, Ll/ۛܶ۠;->֡֫:Ll/ۤܶ۠;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3435
    iget-object v2, v1, Ll/ۛܶ۠;->ۚ:Ll/ۤܶ۠;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3436
    iget-object v2, v1, Ll/ۛܶ۠;->᩶:Ll/ۤܶ۠;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3437
    iget-object v2, v1, Ll/ۛܶ۠;->᩷:Ll/ۤܶ۠;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3438
    iget-object v2, v1, Ll/ۛܶ۠;->֫:Ll/ۤܶ۠;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3439
    iget-object v2, v1, Ll/ۛܶ۠;->۠:Ll/ۤܶ۠;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3440
    iget-object v2, v1, Ll/ۛܶ۠;->ܰ:Ll/ۤܶ۠;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3441
    iget-boolean v2, p0, Ll/ܶ۬֨;->ۧ:Z

    if-eqz v2, :cond_0

    .line 3442
    iget-object v2, v1, Ll/ۛܶ۠;->֫֫:Ll/ۤܶ۠;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3444
    :cond_0
    iget-boolean v2, p0, Ll/ܶ۬֨;->֫:Z

    if-eqz v2, :cond_1

    .line 3445
    iget-object v1, v1, Ll/ۛܶ۠;->ۙ:Ll/ۤܶ۠;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    const/4 v1, 0x0

    new-array v1, v1, [Ll/ۤܶ۠;

    .line 3447
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۤܶ۠;

    iput-object v0, p0, Ll/ܶ۬֨;->ۢ:[Ll/ۤܶ۠;

    .line 3449
    :cond_2
    iget-object v0, p0, Ll/ܶ۬֨;->ۢ:[Ll/ۤܶ۠;

    return-object v0
.end method

.method public static bridge synthetic ܿ(Ll/ܶ۬֨;)Ll/᩹ܶ۠;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    return-object p0
.end method

.method private ᩳ()Ljava/util/Set;
    .locals 6

    .line 3228
    iget-object v0, p0, Ll/ܶ۬֨;->ܳ:Ljava/util/Set;

    if-nez v0, :cond_2

    .line 3229
    invoke-direct {p0}, Ll/ܶ۬֨;->ܽ()[Ll/ۤܶ۠;

    move-result-object v0

    .line 0
    new-instance v1, Ljava/util/HashSet;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(I)V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v0, v3

    invoke-static {v4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "duplicate element: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    .line 3229
    iput-object v0, p0, Ll/ܶ۬֨;->ܳ:Ljava/util/Set;

    .line 3232
    :cond_2
    iget-object v0, p0, Ll/ܶ۬֨;->ܳ:Ljava/util/Set;

    return-object v0
.end method

.method private ᩳ(Ll/ۙ֨֨;)Ll/ۙ֨֨;
    .locals 8

    .line 1082
    iget-object v0, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v0, v0, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v0}, Ll/ۙ֨֨;->ܶ()Ll/ۖܶ۠;

    move-result-object v0

    .line 1083
    invoke-virtual {p1}, Ll/ۙ֨֨;->ܶ()Ll/ۖܶ۠;

    move-result-object v1

    .line 1084
    invoke-virtual {p1}, Ll/ۙ֨֨;->ܽ֫()Ll/ۖܶ۠;

    move-result-object v2

    .line 1085
    iget-object v3, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v3, v3, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v3}, Ll/ۙ֨֨;->ܽ֫()Ll/ۖܶ۠;

    move-result-object v3

    .line 1086
    new-instance v4, Ll/ᩴܶ۠;

    invoke-direct {v4}, Ll/ᩴܶ۠;-><init>()V

    .line 1090
    :goto_0
    invoke-virtual {v2}, Ll/ۖܶ۠;->ܽ()Z

    move-result v5

    iget-object v6, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    if-eqz v5, :cond_0

    invoke-virtual {v3}, Ll/ۖܶ۠;->ܽ()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 1095
    iget-object v5, v3, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v5, Ll/ۙ֨֨;

    invoke-virtual {v5}, Ll/ۙ֨֨;->ᩳ֫()Ll/ۙ֨֨;

    move-result-object v5

    invoke-virtual {v6, v5, v0, v1}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۙ֨֨;

    move-result-object v5

    invoke-virtual {v4, v5}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    .line 1096
    iget-object v2, v2, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    .line 1097
    iget-object v3, v3, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    .line 1100
    :cond_0
    invoke-virtual {p1}, Ll/ۙ֨֨;->ܽ֫()Ll/ۖܶ۠;

    move-result-object v1

    .line 1103
    invoke-virtual {v6, p1}, Ll/ۛ᩸֨;->ۧ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۙ֨֨;->ܶ()Ll/ۖܶ۠;

    move-result-object v2

    .line 1101
    invoke-virtual {v6, v0, v0, v2}, Ll/ۛ᩸֨;->ۧ(Ll/ۖܶ۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v0

    .line 1104
    :goto_1
    invoke-virtual {v1}, Ll/ۖܶ۠;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Ll/ۖܶ۠;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1106
    iget-object v2, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v2, Ll/ۙ֨֨;

    iget-object v3, v0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v3, Ll/ۡ֨֨;

    invoke-virtual {v2, v3}, Ll/ۙ֨֨;->ܽ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    .line 1107
    iget-object v1, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    .line 1108
    iget-object v0, v0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_1

    .line 1111
    :cond_1
    invoke-virtual {p1}, Ll/ۙ֨֨;->ܽ֫()Ll/ۖܶ۠;

    move-result-object v0

    .line 1112
    invoke-virtual {v4}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v1

    .line 1114
    :goto_2
    invoke-virtual {v0}, Ll/ۖܶ۠;->ܽ()Z

    move-result v2

    iget-object v3, p0, Ll/ܶ۬֨;->᩵:Ll/۫᩸֨;

    if-eqz v2, :cond_7

    invoke-virtual {v1}, Ll/ۖܶ۠;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_7

    .line 1115
    iget-object v2, v0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v2, Ll/ۙ֨֨;

    .line 1143
    invoke-virtual {v3, v2}, Ll/۫᩸֨;->֫(Ll/ۙ֨֨;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_6

    .line 1116
    iget-object v3, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v3, Ll/ۙ֨֨;

    .line 1117
    invoke-virtual {v3}, Ll/ۙ֨֨;->᩻֫()Z

    move-result v3

    if-nez v3, :cond_6

    iget-object v3, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v3, Ll/ۙ֨֨;

    .line 683
    invoke-virtual {v2}, Ll/ۙ֨֨;->᩸֫()Z

    move-result v5

    const/4 v7, 0x1

    if-eqz v5, :cond_2

    goto :goto_3

    .line 685
    :cond_2
    sget-object v5, Ll/ۢ۠֨;->᩵֫:Ll/ۢ۠֨;

    invoke-virtual {v2, v5}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v5

    if-nez v5, :cond_3

    .line 686
    invoke-static {v2}, Ll/ۛ᩸֨;->۫(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v2

    .line 1071
    invoke-virtual {v6, v2, v3, v7}, Ll/ۛ᩸֨;->ܽ(Ll/ۙ֨֨;Ll/ۙ֨֨;Z)Z

    move-result v7

    goto :goto_3

    .line 688
    :cond_3
    invoke-virtual {v2}, Ll/ۙ֨֨;->ۜ֫()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 689
    invoke-virtual {v6, v2}, Ll/ۛ᩸֨;->ۗ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v2

    iget-object v5, v6, Ll/ۛ᩸֨;->ܿ֫:Ll/֨᩸۠;

    invoke-virtual {v6, v3, v2, v5}, Ll/ۛ᩸֨;->ܽ(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)Z

    move-result v7

    goto :goto_3

    .line 690
    :cond_4
    invoke-virtual {v2}, Ll/ۙ֨֨;->۠֫()Z

    move-result v5

    if-eqz v5, :cond_5

    .line 691
    invoke-virtual {v6, v2}, Ll/ۛ᩸֨;->ۙ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v2

    invoke-virtual {v6, v2, v3}, Ll/ۛ᩸֨;->᩻(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v2

    xor-int/2addr v7, v2

    :cond_5
    :goto_3
    if-nez v7, :cond_6

    .line 1119
    iget-object p1, v0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast p1, Ll/ۙ֨֨;

    return-object p1

    .line 1121
    :cond_6
    iget-object v0, v0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    .line 1122
    iget-object v1, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_2

    .line 1125
    :cond_7
    invoke-virtual {p1}, Ll/ۙ֨֨;->ܽ֫()Ll/ۖܶ۠;

    move-result-object v0

    .line 1126
    invoke-virtual {v4}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v1

    .line 1128
    invoke-virtual {v6, p1}, Ll/ۛ᩸֨;->ۧ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۙ֨֨;->ܽ֫()Ll/ۖܶ۠;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۙ֨֨;

    .line 1129
    sget-object v4, Ll/ۢ۠֨;->ۢ֫:Ll/ۢ۠֨;

    invoke-virtual {v2, v4}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v4

    if-eqz v4, :cond_8

    .line 1130
    invoke-virtual {v2}, Ll/ۙ֨֨;->ᩳ֫()Ll/ۙ֨֨;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۙ֨֨;->᩻֫()Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v2, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v2, Ll/ۙ֨֨;

    .line 1131
    invoke-virtual {v2}, Ll/ۙ֨֨;->᩻֫()Z

    move-result v2

    if-nez v2, :cond_8

    iget-object v2, v0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v2, Ll/ۙ֨֨;

    .line 1143
    invoke-virtual {v3, v2}, Ll/۫᩸֨;->֫(Ll/ۙ֨֨;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_8

    .line 1133
    iget-object p1, v0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast p1, Ll/ۙ֨֨;

    return-object p1

    .line 1135
    :cond_8
    iget-object v1, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    .line 1136
    iget-object v0, v0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_4

    :cond_9
    const/4 p1, 0x0

    return-object p1
.end method

.method public static bridge synthetic ᩳ(Ll/ܶ۬֨;)Ll/ۜۨ֨;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶ۬֨;->ᩴ:Ll/ۜۨ֨;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/ܶ۬֨;)Ll/ۛ᩸֨;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/ܶ۬֨;)Ll/ۛܶ۠;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶ۬֨;->ܶ:Ll/ۛܶ۠;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ۚۚ۠;JLl/ۛ֡֨;Ll/ۚۚ۠;)J
    .locals 30

    move-object/from16 v9, p0

    move-object/from16 v0, p1

    move-object/from16 v10, p4

    move-object/from16 v1, p5

    .line 1178
    sget-object v2, Ll/ۖ۬֨;->ۧ:[I

    iget-object v3, v10, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    iget-object v4, v9, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    const-wide/16 v5, 0x2000

    const-wide/16 v7, 0x0

    const/4 v11, 0x1

    if-eq v2, v11, :cond_22

    const/4 v12, 0x2

    iget-object v13, v9, Ll/ܶ۬֨;->ۜ:Ll/ᩳᩴ֨;

    const-wide/16 v14, 0x400

    const-wide/16 v16, 0x800

    const-wide/high16 v18, 0x2000000000000000L

    const-wide/16 v20, 0x4000

    if-eq v2, v12, :cond_16

    const/4 v12, 0x3

    if-ne v2, v12, :cond_15

    .line 1226
    iget-object v2, v10, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v2, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v12, Ll/ܶᩴ֨;->ܺ:Ll/ܶᩴ֨;

    invoke-virtual {v2, v12}, Ll/֨ᩴ֨;->֫(Ll/ܶᩴ֨;)Z

    move-result v2

    iget-boolean v12, v9, Ll/ܶ۬֨;->ۧ:Z

    const-wide/16 v22, 0x8

    if-nez v2, :cond_7

    .line 1227
    invoke-virtual/range {p4 .. p4}, Ll/ۛ֡֨;->ۡ֫()Z

    move-result v2

    if-eqz v2, :cond_0

    and-long v24, p2, v5

    cmp-long v2, v24, v7

    if-eqz v2, :cond_0

    goto :goto_3

    .line 1234
    :cond_0
    iget-object v2, v10, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v11, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v3, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-ne v11, v3, :cond_6

    and-long v26, p2, v22

    cmp-long v3, v26, v7

    if-eqz v3, :cond_1

    if-eqz v12, :cond_1

    and-long v26, p2, v5

    cmp-long v3, v26, v7

    if-nez v3, :cond_1

    const-wide v26, -0x3fffffffffffa1e1L    # -2.0000000000107003

    goto :goto_0

    :cond_1
    const-wide v26, -0x3fffffffffffa1e9L    # -2.0000000000106968

    :goto_0
    const-wide/16 v28, 0x200

    .line 1237
    iget-object v3, v2, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v3, v3, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v11, Ll/֨ᩴ֨;->ᩳ֫:Ll/֨ᩴ֨;

    if-eq v3, v11, :cond_4

    iget-wide v2, v2, Ll/ۛ֡֨;->᩶:J

    and-long v2, v2, v22

    cmp-long v11, v2, v7

    if-eqz v11, :cond_2

    goto :goto_1

    :cond_2
    if-nez v12, :cond_5

    and-long v2, p2, v20

    cmp-long v11, v2, v7

    if-nez v11, :cond_3

    and-long v2, p2, v18

    cmp-long v11, v2, v7

    if-eqz v11, :cond_5

    .line 1241
    :cond_3
    sget-object v2, Ll/ۛᩴ۠;->᩵ᩳ:Ll/۫۠۠;

    invoke-virtual {v4, v0, v2}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    goto :goto_2

    :cond_4
    :goto_1
    or-long v26, v26, v22

    :cond_5
    :goto_2
    const-wide v2, 0x2000000000004200L

    and-long v2, p2, v2

    cmp-long v11, v2, v7

    if-eqz v11, :cond_c

    goto :goto_7

    :cond_6
    const-wide/16 v28, 0x200

    const-wide v26, -0x3fffffffffff81efL    # -2.000000000014332

    goto :goto_6

    :cond_7
    :goto_3
    const-wide/16 v28, 0x200

    .line 453
    iget-object v2, v10, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {v2}, Ll/ۤܶ۠;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_9

    and-long v2, p2, v18

    cmp-long v11, v2, v7

    if-nez v11, :cond_8

    and-long v2, p2, v20

    cmp-long v11, v2, v7

    if-nez v11, :cond_8

    and-long v2, p2, v28

    cmp-long v11, v2, v7

    if-eqz v11, :cond_9

    :cond_8
    const/4 v2, 0x1

    goto :goto_4

    :cond_9
    const/4 v2, 0x0

    :goto_4
    and-long v26, p2, v22

    cmp-long v3, v26, v7

    if-nez v3, :cond_a

    if-eqz v2, :cond_b

    :cond_a
    if-eqz v12, :cond_b

    and-long v11, p2, v5

    cmp-long v3, v11, v7

    if-nez v3, :cond_b

    const-wide/16 v11, 0x5e18

    goto :goto_5

    :cond_b
    const-wide/16 v11, 0x5c10

    :goto_5
    move-wide/from16 v26, v11

    if-eqz v2, :cond_c

    goto :goto_7

    :cond_c
    :goto_6
    move-wide/from16 v22, v7

    :goto_7
    and-long v2, p2, v28

    cmp-long v11, v2, v7

    if-eqz v11, :cond_d

    or-long v22, v22, v14

    :cond_d
    and-long v2, p2, v20

    const-wide/16 v11, 0x10

    cmp-long v14, v2, v7

    if-eqz v14, :cond_12

    const-wide v2, 0x3ffffffffffffbefL    # 1.9999999999997689

    and-long v26, v26, v2

    .line 1348
    sget-object v2, Ll/ᩴۚ۠;->᩻֫:Ll/ᩴۚ۠;

    invoke-virtual {v1, v2}, Ll/ۚۚ۠;->֫(Ll/ᩴۚ۠;)Z

    move-result v2

    if-nez v2, :cond_e

    goto :goto_8

    .line 1368
    :cond_e
    new-instance v2, Ll/᩷۬֨;

    .line 3437
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const/4 v3, 0x0

    .line 1352
    iput-boolean v3, v2, Ll/᩷۬֨;->֫:Z

    .line 1369
    check-cast v1, Ll/ۚ᩵۠;

    .line 1370
    iget-object v1, v1, Ll/ۚ᩵۠;->ۗ:Ll/ۖܶ۠;

    invoke-virtual {v1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۚۚ۠;

    .line 1371
    invoke-virtual {v3, v2}, Ll/ۚۚ۠;->֫(Ll/֡ۚ۠;)V

    .line 1372
    iget-boolean v3, v2, Ll/᩷۬֨;->֫:Z

    if-eqz v3, :cond_f

    iget-boolean v1, v9, Ll/ܶ۬֨;->ܽ:Z

    if-eqz v1, :cond_10

    const-wide/high16 v1, 0x4000000000000000L    # 2.0

    goto :goto_9

    :cond_10
    :goto_8
    move-wide v1, v7

    goto :goto_9

    :cond_11
    move-wide v1, v11

    :goto_9
    or-long v22, v22, v1

    :cond_12
    and-long v1, p2, v18

    cmp-long v3, v1, v7

    if-eqz v3, :cond_13

    const-wide/16 v1, -0x401

    and-long v26, v26, v1

    or-long v22, v22, v11

    :cond_13
    and-long v1, p2, v16

    cmp-long v3, v1, v7

    if-eqz v3, :cond_14

    .line 1327
    invoke-virtual {v13, v0}, Ll/ᩳᩴ֨;->֫(Ll/ۗ۠۠;)Ll/ۗ۠۠;

    move-result-object v1

    .line 1329
    :try_start_0
    new-instance v2, Ll/ۛۗ֨;

    invoke-direct {v2, v9, v0}, Ll/ۛۗ֨;-><init>(Ll/ܶ۬֨;Ll/ۚۚ۠;)V

    invoke-virtual {v13, v2}, Ll/ᩳᩴ֨;->֫(Ll/ܽᩴ֨;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1335
    invoke-virtual {v13, v1}, Ll/ᩳᩴ֨;->֫(Ll/ۗ۠۠;)Ll/ۗ۠۠;

    goto :goto_a

    :catchall_0
    move-exception v0

    invoke-virtual {v13, v1}, Ll/ᩳᩴ֨;->֫(Ll/ۗ۠۠;)Ll/ۗ۠۠;

    .line 1336
    throw v0

    .line 1265
    :cond_14
    :goto_a
    iget-object v1, v10, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-wide v1, v1, Ll/ۛ֡֨;->᩶:J

    :goto_b
    and-long v1, v1, v16

    or-long v1, v22, v1

    goto/16 :goto_13

    .line 1268
    :cond_15
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_16
    const-wide/16 v28, 0x200

    .line 1190
    iget-object v1, v10, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v2, v9, Ll/ܶ۬֨;->ܶ:Ll/ۛܶ۠;

    iget-object v2, v2, Ll/ۛܶ۠;->ᩴۧ:Ll/ۤܶ۠;

    const-wide v11, 0x80000000000L

    const-wide/16 v22, 0x2

    if-ne v1, v2, :cond_18

    .line 1191
    iget-object v1, v10, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-wide v1, v1, Ll/ۛ֡֨;->᩶:J

    and-long v1, v1, v20

    cmp-long v3, v1, v7

    if-eqz v3, :cond_17

    :goto_c
    move-wide/from16 v26, v22

    goto :goto_10

    :cond_17
    const-wide/16 v1, 0x7

    goto :goto_f

    .line 1199
    :cond_18
    iget-object v1, v10, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-wide v1, v1, Ll/ۛ֡֨;->᩶:J

    and-long v20, v1, v28

    cmp-long v3, v20, v7

    if-eqz v3, :cond_1d

    and-long/2addr v1, v5

    const-wide/16 v18, 0x401

    cmp-long v3, v1, v7

    if-eqz v3, :cond_19

    goto :goto_e

    :cond_19
    const-wide v1, 0x8000000000aL

    and-long v1, p2, v1

    cmp-long v3, v1, v7

    if-eqz v3, :cond_1c

    and-long v1, p2, v22

    cmp-long v3, v1, v7

    if-eqz v3, :cond_1a

    move-wide/from16 v22, v7

    goto :goto_d

    :cond_1a
    const-wide/16 v1, 0x1

    move-wide/from16 v22, v1

    :goto_d
    and-long v1, p2, v11

    const-wide v18, 0x80000000c0bL

    cmp-long v3, v1, v7

    if-eqz v3, :cond_1b

    or-long v22, v22, v14

    :cond_1b
    move-wide/from16 v26, v18

    goto :goto_10

    :cond_1c
    :goto_e
    move-wide/from16 v22, v18

    goto :goto_c

    :cond_1d
    and-long v1, v1, v18

    cmp-long v3, v1, v7

    if-eqz v3, :cond_1e

    const-wide/16 v1, 0xc3f

    goto :goto_f

    :cond_1e
    const-wide/16 v1, 0xd3f

    :goto_f
    move-wide/from16 v26, v1

    move-wide/from16 v22, v7

    :goto_10
    and-long v1, p2, v16

    cmp-long v3, v1, v7

    if-eqz v3, :cond_1f

    .line 1327
    invoke-virtual {v13, v0}, Ll/ᩳᩴ֨;->֫(Ll/ۗ۠۠;)Ll/ۗ۠۠;

    move-result-object v1

    .line 1329
    :try_start_1
    new-instance v2, Ll/ۛۗ֨;

    invoke-direct {v2, v9, v0}, Ll/ۛۗ֨;-><init>(Ll/ܶ۬֨;Ll/ۚۚ۠;)V

    invoke-virtual {v13, v2}, Ll/ᩳᩴ֨;->֫(Ll/ܽᩴ֨;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1335
    invoke-virtual {v13, v1}, Ll/ᩳᩴ֨;->֫(Ll/ۗ۠۠;)Ll/ۗ۠۠;

    goto :goto_11

    :catchall_1
    move-exception v0

    invoke-virtual {v13, v1}, Ll/ᩳᩴ֨;->֫(Ll/ۗ۠۠;)Ll/ۗ۠۠;

    .line 1336
    throw v0

    :cond_1f
    :goto_11
    or-long v1, p2, v22

    and-long/2addr v1, v14

    cmp-long v3, v1, v7

    if-eqz v3, :cond_21

    and-long v1, p2, v11

    cmp-long v3, v1, v7

    if-eqz v3, :cond_20

    goto :goto_12

    :cond_20
    move-wide/from16 v1, v22

    goto :goto_13

    .line 1223
    :cond_21
    :goto_12
    iget-object v1, v10, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-wide v1, v1, Ll/ۛ֡֨;->᩶:J

    goto/16 :goto_b

    :goto_13
    move-wide/from16 v11, v26

    move-wide/from16 v26, v1

    goto :goto_16

    :cond_22
    const-wide/16 v28, 0x200

    .line 98
    sget-object v2, Ll/ᩴۚ۠;->᩹ܽ:Ll/ᩴۚ۠;

    invoke-virtual {v1, v2}, Ll/ۚۚ۠;->֫(Ll/ᩴۚ۠;)Z

    move-result v2

    if-eqz v2, :cond_23

    .line 99
    check-cast v1, Ll/ۢۚ۠;

    iget-object v1, v1, Ll/ۢۚ۠;->ۛ:Ll/۫᩵۠;

    if-eqz v1, :cond_23

    const-wide v1, 0x200000000L

    goto :goto_14

    .line 1182
    :cond_23
    iget-object v1, v10, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v2, v1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v3, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-eq v2, v3, :cond_24

    const-wide v1, 0x200000010L

    :goto_14
    move-wide/from16 v26, v1

    goto :goto_15

    .line 1184
    :cond_24
    iget-wide v1, v1, Ll/ۛ֡֨;->᩶:J

    and-long v1, v1, v28

    cmp-long v3, v1, v7

    if-eqz v3, :cond_25

    const-wide/16 v26, 0x19

    move-wide/from16 v11, v26

    goto :goto_16

    :cond_25
    const-wide/16 v1, 0x40df

    goto :goto_14

    :goto_15
    move-wide/from16 v11, v26

    move-wide/from16 v26, v7

    :goto_16
    const-wide v1, -0x3ffff7fffffff001L    # -2.0039062500018185

    and-long v1, p2, v1

    not-long v13, v11

    and-long/2addr v1, v13

    cmp-long v3, v1, v7

    if-eqz v3, :cond_28

    and-long v13, v1, v28

    cmp-long v3, v13, v7

    if-eqz v3, :cond_27

    and-long v1, p2, v5

    cmp-long v3, v1, v7

    if-eqz v3, :cond_26

    .line 1273
    sget-object v1, Ll/ۛᩴ۠;->ܽ:Ll/۫۠۠;

    goto :goto_17

    :cond_26
    sget-object v1, Ll/ۛᩴ۠;->ᩴۧ:Ll/۫۠۠;

    :goto_17
    invoke-virtual {v4, v0, v1}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    or-long v11, v11, v28

    goto/16 :goto_18

    .line 1278
    :cond_27
    invoke-static {v1, v2}, Ll/᩵ᩴ֨;->֫(J)Ljava/util/EnumSet;

    move-result-object v1

    sget-object v2, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2455
    new-instance v2, Ll/۫۠۠;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v1, v3, v5

    const-string v1, "compiler"

    const-string v5, "mod.not.allowed.here"

    invoke-direct {v2, v1, v5, v3}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1277
    invoke-virtual {v4, v0, v2}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    goto/16 :goto_18

    .line 1281
    :cond_28
    iget-object v1, v10, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v13, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-eq v1, v13, :cond_29

    const-wide/16 v5, 0x400

    const-wide v7, 0x8000000000aL

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    .line 1284
    invoke-virtual/range {v1 .. v8}, Ll/ܶ۬֨;->֫(Ll/ۚۚ۠;JJJ)Z

    move-result v1

    if-eqz v1, :cond_2b

    :cond_29
    const-wide/16 v5, 0xa

    const-wide v7, 0x80000000000L

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    .line 1288
    invoke-virtual/range {v1 .. v8}, Ll/ܶ۬֨;->֫(Ll/ۚۚ۠;JJJ)Z

    move-result v1

    if-eqz v1, :cond_2b

    const-wide/16 v5, 0x600

    const-wide/16 v7, 0x130

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    .line 1292
    invoke-virtual/range {v1 .. v8}, Ll/ܶ۬֨;->֫(Ll/ۚۚ۠;JJJ)Z

    move-result v1

    if-eqz v1, :cond_2b

    const-wide/16 v5, 0x1

    const-wide/16 v7, 0x6

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    .line 1296
    invoke-virtual/range {v1 .. v8}, Ll/ܶ۬֨;->֫(Ll/ۚۚ۠;JJJ)Z

    move-result v1

    if-eqz v1, :cond_2b

    const-wide/16 v5, 0x2

    const-wide/16 v7, 0x5

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    .line 1300
    invoke-virtual/range {v1 .. v8}, Ll/ܶ۬֨;->֫(Ll/ۚۚ۠;JJJ)Z

    move-result v1

    if-eqz v1, :cond_2b

    const-wide/16 v5, 0x10

    const-wide/16 v7, 0x40

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    .line 1304
    invoke-virtual/range {v1 .. v8}, Ll/ܶ۬֨;->֫(Ll/ۚۚ۠;JJJ)Z

    move-result v1

    if-eqz v1, :cond_2b

    iget-object v1, v10, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    if-eq v1, v13, :cond_2a

    const-wide/16 v5, 0x500

    const-wide/16 v7, 0x800

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    .line 1309
    invoke-virtual/range {v1 .. v8}, Ll/ܶ۬֨;->֫(Ll/ۚۚ۠;JJJ)Z

    move-result v1

    if-eqz v1, :cond_2b

    :cond_2a
    const-wide/16 v5, 0x10

    const-wide/high16 v7, -0x4000000000000000L    # -2.0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    .line 1312
    invoke-virtual/range {v1 .. v8}, Ll/ܶ۬֨;->֫(Ll/ۚۚ۠;JJJ)Z

    move-result v1

    if-eqz v1, :cond_2b

    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    const-wide v7, -0x7ffffffffffffff0L    # -7.9E-323

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    .line 1315
    invoke-virtual/range {v1 .. v8}, Ll/ܶ۬֨;->֫(Ll/ۚۚ۠;JJJ)Z

    move-result v1

    if-eqz v1, :cond_2b

    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    const-wide/16 v7, 0x2000

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    .line 1318
    invoke-virtual/range {v1 .. v8}, Ll/ܶ۬֨;->֫(Ll/ۚۚ۠;JJJ)Z

    :cond_2b
    :goto_18
    const-wide v0, 0x3ffff7fffffff000L    # 1.9980468749990905

    or-long/2addr v0, v11

    and-long v0, p2, v0

    or-long v0, v0, v26

    return-wide v0
.end method

.method public final ֫(Ll/᩶֡֨;)Ll/֫ۘ֨;
    .locals 1

    .line 3423
    invoke-virtual {p1}, Ll/᩶֡֨;->᩹֫()Ll/᩸᩹֨;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸᩹֨;->ᩳ()Ll/ܽۘ֨;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 3425
    :cond_0
    iget-object v0, p0, Ll/ܶ۬֨;->ܶ:Ll/ۛܶ۠;

    iget-object v0, v0, Ll/ۛܶ۠;->ܶܽ:Ll/ۤܶ۠;

    invoke-virtual {p1, v0}, Ll/ܽۘ֨;->֫(Ll/ۤܶ۠;)Ll/ۡۘ֨;

    move-result-object p1

    .line 3426
    instance-of v0, p1, Ll/֫ۘ֨;

    if-eqz v0, :cond_1

    check-cast p1, Ll/֫ۘ֨;

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/ۙ֨֨;Ll/ۖܶ۠;)Ll/ۖܶ۠;
    .locals 4

    .line 1598
    invoke-virtual {p2}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1601
    :cond_0
    iget-object v0, p2, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    invoke-virtual {p0, p1, v0}, Ll/ܶ۬֨;->֫(Ll/ۙ֨֨;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v0

    .line 1602
    iget-object v1, p2, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v1, Ll/ۙ֨֨;

    const/4 v2, 0x1

    .line 1071
    iget-object v3, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    invoke-virtual {v3, v1, p1, v2}, Ll/ۛ᩸֨;->ܽ(Ll/ۙ֨֨;Ll/ۙ֨֨;Z)Z

    move-result p1

    if-eqz p1, :cond_1

    return-object v0

    .line 1603
    :cond_1
    iget-object p1, p2, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    if-ne v0, p1, :cond_2

    :goto_0
    return-object p2

    .line 1604
    :cond_2
    iget-object p1, p2, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast p1, Ll/ۙ֨֨;

    invoke-virtual {v0, p1}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۘ֡֨;)Ll/ۘ֡֨;
    .locals 1

    .line 218
    iget-object v0, p0, Ll/ܶ۬֨;->۠:Ll/ۘ֡֨;

    .line 219
    iput-object p1, p0, Ll/ܶ۬֨;->۠:Ll/ۘ֡֨;

    return-object v0
.end method

.method public final ֫(Ll/ۗ۠۠;Ll/ۙ֨֨;)Ll/ۙ֨֨;
    .locals 5

    .line 710
    sget-object v0, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    invoke-virtual {p2, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Ll/ۢ۠֨;->ۗ:Ll/ۢ۠֨;

    invoke-virtual {p2, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Ll/ۢ۠֨;->۟:Ll/ۢ۠֨;

    invoke-virtual {p2, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 711
    sget-object v0, Ll/ۨᩴ۠;->ᩳۧ:Ll/ۨ۠۠;

    .line 712
    iget-object v1, p0, Ll/ܶ۬֨;->ۡ:Ll/ۛ۠۠;

    invoke-virtual {v1, v0}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object v0

    .line 734
    sget-object v2, Ll/ۢ۠֨;->ۢ֫:Ll/ۢ۠֨;

    invoke-virtual {p2, v2}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 8206
    new-instance v2, Ll/ۨ۠۠;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p2, v3, v4

    const-string p2, "compiler"

    const-string v4, "type.parameter"

    invoke-direct {v2, p2, v4, v3}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 735
    invoke-virtual {v1, v2}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object p2

    .line 711
    :cond_0
    invoke-virtual {p0, p1, v0, p2}, Ll/ܶ۬֨;->֫(Ll/ۗ۠۠;Ll/ܽܶ۠;Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    :cond_1
    return-object p2
.end method

.method public final ֫(Ll/ۗ۠۠;Ll/ۙ֨֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;
    .locals 7

    .line 3976
    new-instance v6, Ll/᩵۬֨;

    const-string v3, "unchecked.cast.to.type"

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Ll/᩵۬֨;-><init>(Ll/ܶ۬֨;Ll/ۗ۠۠;Ljava/lang/String;Ll/ۙ֨֨;Ll/ۙ֨֨;)V

    .line 636
    iget-object v0, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    invoke-virtual {v0, p2, p3, v6}, Ll/ۛ᩸֨;->ܽ(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p3

    .line 639
    :cond_0
    iget-object v1, p0, Ll/ܶ۬֨;->ۡ:Ll/ۛ۠۠;

    invoke-static {p2, p3}, Ll/ۨᩴ۠;->֫(Ll/ۙ֨֨;Ll/ۙ֨֨;)Ll/ۨ۠۠;

    move-result-object p3

    invoke-virtual {v1, p3}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object p3

    iget-object v1, p0, Ll/ܶ۬֨;->ᩳ:Ll/ۘ۬֨;

    check-cast v1, Ll/᩻۬֨;

    invoke-virtual {v1, p1, p3}, Ll/᩻۬֨;->֫(Ll/ۗ۠۠;Ll/ܽܶ۠;)V

    .line 640
    invoke-virtual {v0, p2}, Ll/ۛ᩸֨;->ܳ(Ll/ۙ֨֨;)Ll/۫ۚ֨;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۗ۠۠;Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/ۘ۬֨;)Ll/ۙ֨֨;
    .locals 9

    .line 605
    invoke-interface {p4}, Ll/ۘ۬֨;->֫()Ll/֡ۨ֨;

    move-result-object v0

    .line 165
    iget-object v1, v0, Ll/֡ۨ֨;->ᩳ:Ll/ۖܶ۠;

    invoke-virtual {p3, v1}, Ll/ۙ֨֨;->ۧ(Ll/ۖܶ۠;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, v0, Ll/֡ۨ֨;->ᩳ:Ll/ۖܶ۠;

    invoke-virtual {p2, v1}, Ll/ۙ֨֨;->ۧ(Ll/ۖܶ۠;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 607
    :cond_0
    invoke-static {p3, p2}, Ll/ۖܶ۠;->of(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v1

    new-instance v8, Ll/ܳ۬֨;

    move-object v2, v8

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v2 .. v7}, Ll/ܳ۬֨;-><init>(Ll/ܶ۬֨;Ll/ۗ۠۠;Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/ۘ۬֨;)V

    invoke-virtual {v0, v1, v8}, Ll/֡ۨ֨;->֫(Ll/ۖܶ۠;Ll/ۘۛ֨;)V

    .line 610
    :cond_1
    sget-object v0, Ll/ۢ۠֨;->۟:Ll/ۢ۠֨;

    invoke-virtual {p3, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-object p3

    .line 612
    :cond_2
    sget-object v0, Ll/ۢ۠֨;->᩻֫:Ll/ۢ۠֨;

    invoke-virtual {p3, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    .line 614
    :cond_3
    invoke-interface {p4, p1, p2, p3}, Ll/ۘ۬֨;->֫(Ll/ۗ۠۠;Ll/ۙ֨֨;Ll/ۙ֨֨;)Ll/֨᩸۠;

    move-result-object v0

    invoke-interface {p4, p2, p3, v0}, Ll/ۘ۬֨;->֫(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)Z

    move-result v0

    if-eqz v0, :cond_4

    :goto_0
    return-object p2

    .line 617
    :cond_4
    invoke-virtual {p2}, Ll/ۙ֨֨;->ۖ֫()Z

    move-result v0

    iget-object v1, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    iget-object v2, p0, Ll/ܶ۬֨;->ۡ:Ll/ۛ۠۠;

    if-eqz v0, :cond_5

    invoke-virtual {p3}, Ll/ۙ֨֨;->ۖ֫()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 618
    sget-object v0, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 7992
    new-instance v0, Ll/ۨ۠۠;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p2, v3, v4

    const/4 v4, 0x1

    aput-object p3, v3, v4

    const-string p3, "compiler"

    const-string v4, "possible.loss.of.precision"

    invoke-direct {v0, p3, v4, v3}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 618
    invoke-virtual {v2, v0}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object p3

    invoke-interface {p4, p1, p3}, Ll/ۘ۬֨;->֫(Ll/ۗ۠۠;Ll/ܽܶ۠;)V

    .line 619
    invoke-virtual {v1, p2}, Ll/ۛ᩸֨;->ܳ(Ll/ۙ֨֨;)Ll/۫ۚ֨;

    move-result-object p1

    return-object p1

    .line 621
    :cond_5
    invoke-static {p2, p3}, Ll/ۨᩴ۠;->֫(Ll/ۙ֨֨;Ll/ۙ֨֨;)Ll/ۨ۠۠;

    move-result-object p3

    invoke-virtual {v2, p3}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object p3

    invoke-interface {p4, p1, p3}, Ll/ۘ۬֨;->֫(Ll/ۗ۠۠;Ll/ܽܶ۠;)V

    .line 622
    invoke-virtual {v1, p2}, Ll/ۛ᩸֨;->ܳ(Ll/ۙ֨֨;)Ll/۫ۚ֨;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۗ۠۠;Ll/ۙ֨֨;Ll/ۤܶ۠;)Ll/ۙ֨֨;
    .locals 3

    .line 979
    sget-object v0, Ll/ۢ۠֨;->۫:Ll/ۢ۠֨;

    invoke-virtual {p2, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    iget-object v1, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    iget-object v2, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    if-eqz v0, :cond_0

    .line 980
    sget-object v0, Ll/ۨᩴ۠;->֡֫:Ll/ۨ۠۠;

    invoke-static {p3, v0}, Ll/ۛᩴ۠;->֫(Ll/ۤܶ۠;Ll/ۨ۠۠;)Ll/۫۠۠;

    move-result-object p3

    invoke-virtual {v1, p1, p3}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    .line 981
    invoke-virtual {v2, p2}, Ll/ۛ᩸֨;->ܳ(Ll/ۙ֨֨;)Ll/۫ۚ֨;

    move-result-object p1

    return-object p1

    .line 982
    :cond_0
    sget-object v0, Ll/ۢ۠֨;->ᩴ֫:Ll/ۢ۠֨;

    invoke-virtual {p2, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 983
    sget-object v0, Ll/ۨᩴ۠;->ۚ֫:Ll/ۨ۠۠;

    invoke-static {p3, v0}, Ll/ۛᩴ۠;->֫(Ll/ۤܶ۠;Ll/ۨ۠۠;)Ll/۫۠۠;

    move-result-object p3

    invoke-virtual {v1, p1, p3}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    .line 984
    invoke-virtual {v2, p2}, Ll/ۛ᩸֨;->ܳ(Ll/ۙ֨֨;)Ll/۫ۚ֨;

    move-result-object p1

    return-object p1

    .line 988
    :cond_1
    invoke-virtual {v2, p2}, Ll/ۛ᩸֨;->ܽ(Ll/ۙ֨֨;)Ll/ۖܶ۠;

    move-result-object p1

    invoke-virtual {v2, p2, p1}, Ll/ۛ᩸֨;->ܽ(Ll/ۙ֨֨;Ll/ۖܶ۠;)Ll/ۙ֨֨;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۙ֨֨;->᩶()Ll/ۙ֨֨;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۗ۠۠;Ll/ۙ֨֨;Z)Ll/ۙ֨֨;
    .locals 2

    .line 768
    invoke-virtual {p0, p1, p2}, Ll/ܶ۬֨;->ۧ(Ll/ۗ۠۠;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p2

    if-eqz p3, :cond_1

    .line 769
    invoke-virtual {p2}, Ll/ۙ֨֨;->ۘ֫()Z

    move-result p3

    if-eqz p3, :cond_1

    .line 770
    invoke-virtual {p2}, Ll/ۙ֨֨;->ܽ֫()Ll/ۖܶ۠;

    move-result-object p3

    .line 771
    :goto_0
    invoke-virtual {p3}, Ll/ۖܶ۠;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 772
    iget-object v0, p3, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ۙ֨֨;

    sget-object v1, Ll/ۢ۠֨;->᩵֫:Ll/ۢ۠֨;

    invoke-virtual {v0, v1}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 773
    iget-object p2, p0, Ll/ܶ۬֨;->ۡ:Ll/ۛ۠۠;

    sget-object v0, Ll/ۨᩴ۠;->ܿۧ:Ll/ۨ۠۠;

    .line 774
    invoke-virtual {p2, v0}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object p2

    iget-object p3, p3, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    .line 773
    invoke-virtual {p0, p1, p2, p3}, Ll/ܶ۬֨;->֫(Ll/ۗ۠۠;Ll/ܽܶ۠;Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 776
    :cond_0
    iget-object p3, p3, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    :cond_1
    return-object p2
.end method

.method public final ֫(Ll/ۗ۠۠;Ll/ܽܶ۠;Ljava/lang/Object;)Ll/ۙ֨֨;
    .locals 6

    .line 322
    instance-of v0, p3, Ll/ۙ֨֨;

    iget-object v1, p0, Ll/ܶ۬֨;->ۤ:Ll/᩷ۚ֨;

    iget-object v2, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    if-eqz v0, :cond_0

    move-object v3, p3

    check-cast v3, Ll/ۙ֨֨;

    sget-object v4, Ll/ۢ۠֨;->ᩴ֫:Ll/ۢ۠֨;

    invoke-virtual {v3, v4}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 323
    sget-object p2, Ll/ۛᩴ۠;->ۧۧ:Ll/۫۠۠;

    invoke-virtual {v2, p1, p2}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    .line 324
    iget-object p1, v1, Ll/᩷ۚ֨;->ۗ:Ll/۫ۚ֨;

    return-object p1

    .line 326
    :cond_0
    sget-object v3, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 3776
    new-instance v3, Ll/۫۠۠;

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p3, v4, v5

    const/4 v5, 0x1

    aput-object p2, v4, v5

    const-string p2, "compiler"

    const-string v5, "type.found.req"

    invoke-direct {v3, p2, v5, v4}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 326
    invoke-virtual {v2, p1, v3}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    if-eqz v0, :cond_1

    .line 327
    check-cast p3, Ll/ۙ֨֨;

    goto :goto_0

    :cond_1
    iget-object p3, v1, Ll/᩷ۚ֨;->ۗ:Ll/۫ۚ֨;

    :goto_0
    iget-object p1, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    invoke-virtual {p1, p3}, Ll/ۛ᩸֨;->ܳ(Ll/ۙ֨֨;)Ll/۫ۚ֨;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۗ۠۠;Ll/᩷֡֨;)Ll/ۙ֨֨;
    .locals 5

    .line 309
    sget-object v0, Ll/᩶۠۠;->ۗ:Ll/᩶۠۠;

    iget-object v1, p2, Ll/᩷֡֨;->ۙ:Ll/ۛ֡֨;

    .line 2575
    invoke-virtual {p2}, Ll/᩷֡֨;->֫()Ll/ܽܶ۠;

    move-result-object p2

    .line 309
    sget-object v2, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 373
    new-instance v2, Ll/۫۠۠;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object p2, v3, v1

    const-string p2, "compiler"

    const-string v1, "cant.access"

    invoke-direct {v2, p2, v1, v3}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    iget-object p2, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    invoke-virtual {p2, v0, p1, v2}, Ll/ۖ֨۠;->֫(Ll/᩶۠۠;Ll/ۗ۠۠;Ll/۫۠۠;)V

    .line 310
    iget-object p1, p0, Ll/ܶ۬֨;->ۤ:Ll/᩷ۚ֨;

    iget-object p1, p1, Ll/᩷ۚ֨;->ۗ:Ll/۫ۚ֨;

    return-object p1
.end method

.method public final ֫(Ll/᩵֡۠;Ll/ۙ֨֨;)Ll/ۙ֨֨;
    .locals 11

    .line 844
    invoke-static {p1}, Ll/۟ۚ۠;->ۖ(Ll/ۚۚ۠;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_4

    .line 845
    invoke-virtual {p2}, Ll/ۙ֨֨;->᩻֫()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_0

    .line 848
    :cond_0
    iget-object v0, p1, Ll/᩵֡۠;->ۨ:Ll/ۚ᩵۠;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const-string v4, "cant.apply.diamond.1"

    const-string v5, "compiler"

    iget-object v6, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    if-eqz v0, :cond_1

    sget-object v0, Ll/ۧ֡֨;->᩺:Ll/ۧ֡֨;

    iget-object v7, p0, Ll/ܶ۬֨;->۬:Ll/ܽ֡֨;

    invoke-virtual {v0, v7}, Ll/ۧ֡֨;->֫(Ll/ܽ֡֨;)Z

    move-result v8

    if-nez v8, :cond_1

    .line 849
    sget-object v8, Ll/᩶۠۠;->ۤ:Ll/᩶۠۠;

    iget-object v9, p1, Ll/᩵֡۠;->۫:Ll/۫᩵۠;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v7, v7, Ll/ܽ֡֨;->᩸:Ljava/lang/String;

    .line 850
    invoke-virtual {v0, v7}, Ll/ۧ֡֨;->ۧ(Ljava/lang/String;)Ll/ۨ۠۠;

    move-result-object v0

    sget-object v7, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 452
    new-instance v7, Ll/۫۠۠;

    new-array v10, v2, [Ljava/lang/Object;

    aput-object p2, v10, v3

    aput-object v0, v10, v1

    invoke-direct {v7, v5, v4, v10}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 849
    invoke-virtual {v6, v8, v9, v7}, Ll/ۖ֨۠;->֫(Ll/᩶۠۠;Ll/ۗ۠۠;Ll/۫۠۠;)V

    .line 852
    :cond_1
    iget-object v0, p2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v0, v0, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v0}, Ll/ۙ֨֨;->ܽ֫()Ll/ۖܶ۠;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v0

    iget-object v7, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    if-eqz v0, :cond_2

    .line 853
    iget-object p1, p1, Ll/᩵֡۠;->۫:Ll/۫᩵۠;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 855
    sget-object v0, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 6793
    new-instance v0, Ll/ۨ۠۠;

    new-array v8, v1, [Ljava/lang/Object;

    aput-object p2, v8, v3

    const-string v9, "diamond.non.generic"

    invoke-direct {v0, v5, v9, v8}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 854
    sget-object v8, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 452
    new-instance v8, Ll/۫۠۠;

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p2, v2, v3

    aput-object v0, v2, v1

    invoke-direct {v8, v5, v4, v2}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 853
    invoke-virtual {v6, p1, v8}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    .line 856
    invoke-virtual {v7, p2}, Ll/ۛ᩸֨;->ܳ(Ll/ۙ֨֨;)Ll/۫ۚ֨;

    move-result-object p1

    return-object p1

    .line 857
    :cond_2
    iget-object v0, p1, Ll/᩵֡۠;->ܰ:Ll/ۖܶ۠;

    if-eqz v0, :cond_3

    .line 858
    invoke-virtual {v0}, Ll/ۖܶ۠;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 859
    iget-object p1, p1, Ll/᩵֡۠;->۫:Ll/۫᩵۠;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 861
    sget-object v0, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 6743
    new-instance v0, Ll/ۨ۠۠;

    new-array v8, v1, [Ljava/lang/Object;

    aput-object p2, v8, v3

    const-string v9, "diamond.and.explicit.params"

    invoke-direct {v0, v5, v9, v8}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 860
    sget-object v8, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 452
    new-instance v8, Ll/۫۠۠;

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p2, v2, v3

    aput-object v0, v2, v1

    invoke-direct {v8, v5, v4, v2}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 859
    invoke-virtual {v6, p1, v8}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    .line 862
    invoke-virtual {v7, p2}, Ll/ۛ᩸֨;->ܳ(Ll/ۙ֨֨;)Ll/۫ۚ֨;

    move-result-object p1

    return-object p1

    :cond_3
    return-object p2

    .line 846
    :cond_4
    :goto_0
    iget-object p1, p1, Ll/᩵֡۠;->۫:Ll/۫᩵۠;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0, p1, p2, v1}, Ll/ܶ۬֨;->֫(Ll/ۗ۠۠;Ll/ۙ֨֨;Z)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۙᩴ֨;)Ll/ۙᩴ֨;
    .locals 1

    .line 212
    iget-object v0, p0, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    .line 213
    iput-object p1, p0, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    return-object v0
.end method

.method public final ֫(Ll/֡֡֨;Ll/ۤܶ۠;)Ll/ܳ֡֨;
    .locals 1

    .line 64
    new-instance v0, Ll/᩺ܶ۠;

    invoke-direct {v0, p1, p2}, Ll/᩺ܶ۠;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 496
    iget-object p1, p0, Ll/ܶ۬֨;->ܿ:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܳ֡֨;

    return-object p1
.end method

.method public final ֫(Ll/ܿ᩵۠;Ll/ۛ֡֨;)Ll/ܽ۫ᩴ;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 3347
    iget-object v1, v1, Ll/ܿ᩵۠;->ۗ:Ll/ۚۚ۠;

    iget-object v1, v1, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    iget-object v1, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v0, v1}, Ll/ܶ۬֨;->֫(Ll/᩶֡֨;)Ll/֫ۘ֨;

    move-result-object v1

    .line 3349
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    const/4 v4, 0x0

    if-nez v1, :cond_0

    .line 3352
    invoke-direct/range {p0 .. p0}, Ll/ܶ۬֨;->ܽ()[Ll/ۤܶ۠;

    move-result-object v1

    goto :goto_1

    .line 3351
    :cond_0
    iget-object v1, v1, Ll/֫ۘ֨;->ۧ:[Ll/ۡۘ֨;

    .line 3355
    array-length v5, v1

    new-array v5, v5, [Ll/ۤܶ۠;

    const/4 v6, 0x0

    .line 3356
    :goto_0
    array-length v7, v1

    if-ge v6, v7, :cond_2

    .line 3357
    aget-object v7, v1, v6

    .line 3358
    instance-of v8, v7, Ll/ܿۘ֨;

    if-eqz v8, :cond_1

    check-cast v7, Ll/ܿۘ֨;

    .line 3362
    iget-object v7, v7, Ll/ܿۘ֨;->ۧ:Ll/۫֡֨;

    iget-object v7, v7, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    aput-object v7, v5, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 3360
    :cond_1
    invoke-static {}, Ll/ܽ۫ᩴ;->empty()Ll/ܽ۫ᩴ;

    move-result-object v1

    return-object v1

    :cond_2
    move-object v1, v5

    .line 3365
    :goto_1
    array-length v5, v1

    :goto_2
    if-ge v4, v5, :cond_13

    aget-object v6, v1, v4

    .line 3366
    iget-object v7, v0, Ll/ܶ۬֨;->ܶ:Ll/ۛܶ۠;

    iget-object v8, v7, Ll/ۛܶ۠;->֡֫:Ll/ۤܶ۠;

    iget-object v9, v7, Ll/ۛܶ۠;->ۚ֫:Ll/ۤܶ۠;

    iget-object v10, v7, Ll/ۛܶ۠;->֨֫:Ll/ۤܶ۠;

    iget-object v11, v7, Ll/ۛܶ۠;->֫:Ll/ۤܶ۠;

    iget-object v12, v7, Ll/ۛܶ۠;->۠:Ll/ۤܶ۠;

    iget-object v13, v7, Ll/ۛܶ۠;->᩷:Ll/ۤܶ۠;

    iget-object v14, v7, Ll/ۛܶ۠;->ܰ:Ll/ۤܶ۠;

    iget-object v15, v7, Ll/ۛܶ۠;->᩶:Ll/ۤܶ۠;

    iget-object v0, v7, Ll/ۛܶ۠;->֫֫:Ll/ۤܶ۠;

    if-ne v6, v8, :cond_3

    .line 3367
    iget-object v0, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v6, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-ne v0, v6, :cond_11

    .line 3368
    invoke-virtual {v3, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    .line 3369
    :cond_3
    iget-object v8, v7, Ll/ۛܶ۠;->ۚ:Ll/ۤܶ۠;

    if-ne v6, v8, :cond_4

    .line 3370
    iget-object v0, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v6, Ll/֨ᩴ֨;->ۜ֫:Ll/֨ᩴ֨;

    if-ne v0, v6, :cond_11

    iget-object v0, v2, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v0, v0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v6, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-eq v0, v6, :cond_11

    .line 3371
    invoke-virtual {v3, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    :cond_4
    if-ne v6, v0, :cond_5

    .line 3373
    invoke-virtual/range {p2 .. p2}, Ll/ۛ֡֨;->֫()Ll/᩺᩸۠;

    move-result-object v6

    sget-object v7, Ll/᩺᩸۠;->ܳ֫:Ll/᩺᩸۠;

    if-ne v6, v7, :cond_11

    .line 3374
    invoke-virtual {v3, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    :cond_5
    if-ne v6, v15, :cond_6

    .line 3377
    iget-object v0, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v6, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-ne v0, v6, :cond_11

    invoke-virtual/range {p2 .. p2}, Ll/ۛ֡֨;->ۜ֫()Z

    move-result v0

    if-nez v0, :cond_11

    .line 3378
    invoke-virtual {v3, v15}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    :cond_6
    const-wide v15, 0x200000000L

    const-wide/16 v17, 0x0

    if-ne v6, v14, :cond_7

    .line 3380
    iget-object v0, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v6, Ll/֨ᩴ֨;->ۜ֫:Ll/֨ᩴ֨;

    if-ne v0, v6, :cond_11

    iget-object v0, v2, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v0, v0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v6, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-ne v0, v6, :cond_11

    .line 3381
    invoke-virtual/range {p2 .. p2}, Ll/ۛ֡֨;->۬()J

    move-result-wide v6

    and-long/2addr v6, v15

    cmp-long v0, v6, v17

    if-eqz v0, :cond_11

    .line 3382
    invoke-virtual {v3, v14}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    :cond_7
    if-ne v6, v13, :cond_8

    .line 3385
    iget-object v0, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v6, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-ne v0, v6, :cond_11

    invoke-virtual/range {p2 .. p2}, Ll/ۛ֡֨;->ۜ֫()Z

    move-result v0

    if-eqz v0, :cond_11

    .line 3386
    invoke-virtual {v3, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    :cond_8
    if-ne v6, v12, :cond_9

    .line 3388
    iget-object v0, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v6, Ll/֨ᩴ֨;->ۜ֫:Ll/֨ᩴ֨;

    if-ne v0, v6, :cond_11

    iget-object v0, v2, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v0, v0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v6, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-ne v0, v6, :cond_11

    .line 3389
    invoke-virtual/range {p2 .. p2}, Ll/ۛ֡֨;->۬()J

    move-result-wide v6

    and-long/2addr v6, v15

    cmp-long v0, v6, v17

    if-nez v0, :cond_11

    .line 3390
    invoke-virtual {v3, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    :cond_9
    if-ne v6, v11, :cond_a

    .line 3393
    iget-object v0, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v6, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-ne v0, v6, :cond_11

    invoke-virtual/range {p2 .. p2}, Ll/ۛ֡֨;->۬()J

    move-result-wide v6

    const-wide/16 v8, 0x2000

    and-long/2addr v6, v8

    cmp-long v0, v6, v17

    if-eqz v0, :cond_11

    .line 3394
    invoke-virtual {v3, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    .line 3396
    :cond_a
    iget-object v0, v7, Ll/ۛܶ۠;->᩺:Ll/ۤܶ۠;

    if-ne v6, v0, :cond_b

    .line 3397
    iget-object v6, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v7, Ll/֨ᩴ֨;->ᩳ֫:Ll/֨ᩴ֨;

    if-ne v6, v7, :cond_11

    .line 3398
    invoke-virtual {v3, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    :cond_b
    if-ne v6, v10, :cond_f

    .line 3400
    iget-object v0, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v6, Ll/֨ᩴ֨;->ۜ֫:Ll/֨ᩴ֨;

    if-ne v0, v6, :cond_c

    iget-object v0, v2, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v0, v0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v7, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-ne v0, v7, :cond_c

    iget-object v0, v2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    sget-object v7, Ll/ۢ۠֨;->᩻֫:Ll/ۢ۠֨;

    invoke-virtual {v0, v7}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_3

    .line 3403
    :cond_c
    iget-object v0, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v7, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-eq v0, v7, :cond_e

    if-eq v0, v6, :cond_e

    sget-object v6, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-ne v0, v6, :cond_d

    .line 3404
    invoke-virtual/range {p2 .. p2}, Ll/ۛ֡֨;->ۜ֫()Z

    move-result v0

    if-nez v0, :cond_d

    iget-object v0, v2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 3405
    invoke-virtual {v0}, Ll/ۙ֨֨;->۟()Ll/ۙ֨֨;

    move-result-object v0

    sget-object v7, Ll/ۢ۠֨;->ᩴ֫:Ll/ۢ۠֨;

    invoke-virtual {v0, v7}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-eqz v0, :cond_e

    :cond_d
    iget-object v0, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    if-ne v0, v6, :cond_11

    .line 3406
    invoke-virtual/range {p2 .. p2}, Ll/ۛ֡֨;->ۜ֫()Z

    move-result v0

    if-eqz v0, :cond_11

    .line 3407
    :cond_e
    invoke-virtual {v3, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_f
    if-ne v6, v9, :cond_10

    .line 3410
    iget-object v0, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v6, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-ne v0, v6, :cond_11

    iget-object v0, v2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    sget-object v6, Ll/ۢ۠֨;->ۢ֫:Ll/ۢ۠֨;

    invoke-virtual {v0, v6}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 3411
    invoke-virtual {v3, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 3412
    :cond_10
    iget-object v0, v7, Ll/ۛܶ۠;->ۙ:Ll/ۤܶ۠;

    if-ne v6, v0, :cond_12

    .line 3413
    iget-object v6, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v7, Ll/֨ᩴ֨;->۟:Ll/֨ᩴ֨;

    if-ne v6, v7, :cond_11

    .line 3414
    invoke-virtual {v3, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_11
    :goto_3
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v0, p0

    goto/16 :goto_2

    .line 3416
    :cond_12
    invoke-static {}, Ll/ܽ۫ᩴ;->empty()Ll/ܽ۫ᩴ;

    move-result-object v0

    return-object v0

    .line 3419
    :cond_13
    invoke-static {v3}, Ll/ܽ۫ᩴ;->of(Ljava/lang/Object;)Ll/ܽ۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()V
    .locals 1

    .line 476
    iget-object v0, p0, Ll/ܶ۬֨;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 477
    iget-object v0, p0, Ll/ܶ۬֨;->ۚ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public final ֫(Ljava/util/function/Supplier;Ll/ۛ֡֨;Ll/ۛ֡֨;)V
    .locals 5

    .line 379
    iget-wide v0, p3, Ll/ۛ֡֨;->᩶:J

    const-wide/high16 v2, 0x80000000000000L

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    goto :goto_0

    .line 3559
    :cond_0
    invoke-virtual {p3}, Ll/ۛ֡֨;->ۢ֫()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Ll/ۛ֡֨;->ۢ֫()Z

    move-result v0

    if-nez v0, :cond_2

    .line 3560
    :goto_0
    invoke-virtual {p3}, Ll/ۛ֡֨;->۠֫()Ll/ܳ֡֨;

    move-result-object v0

    invoke-virtual {p2}, Ll/ۛ֡֨;->۠֫()Ll/ܳ֡֨;

    move-result-object p2

    if-ne v0, p2, :cond_1

    invoke-virtual {p3}, Ll/ۛ֡֨;->۠֫()Ll/ܳ֡֨;

    move-result-object p2

    if-nez p2, :cond_2

    :cond_1
    iget-object p2, p3, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v0, Ll/֨ᩴ֨;->ᩳ֫:Ll/֨ᩴ֨;

    if-eq p2, v0, :cond_2

    .line 3562
    new-instance p2, Ll/ۙۗ֨;

    invoke-direct {p2, p0, p1, p3}, Ll/ۙۗ֨;-><init>(Ll/ܶ۬֨;Ljava/util/function/Supplier;Ll/ۛ֡֨;)V

    iget-object p1, p0, Ll/ܶ۬֨;->ۜ:Ll/ᩳᩴ֨;

    invoke-virtual {p1, p2}, Ll/ᩳᩴ֨;->֫(Ll/ܽᩴ֨;)V

    :cond_2
    return-void
.end method

.method public final ֫(Ll/֨᩵۠;)V
    .locals 6

    .line 4027
    invoke-virtual {p1}, Ll/֨᩵۠;->ܿ֫()Ll/ۖܶ۠;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧ֡۠;

    .line 4028
    iget-boolean v1, v0, Ll/ۧ֡۠;->۫:Z

    if-nez v1, :cond_0

    iget-object v1, v0, Ll/ۧ֡۠;->۬:Ll/ۚۚ۠;

    invoke-static {v1}, Ll/۟ۚ۠;->ܶ(Ll/ۚۚ۠;)Ll/ۤܶ۠;

    move-result-object v1

    iget-object v2, p0, Ll/ܶ۬֨;->ܶ:Ll/ۛܶ۠;

    iget-object v2, v2, Ll/ۛܶ۠;->ۤ֫:Ll/ۤܶ۠;

    if-ne v1, v2, :cond_0

    .line 4029
    iget-object v1, v0, Ll/ۧ֡۠;->۬:Ll/ۚۚ۠;

    check-cast v1, Ll/ۛ᩵۠;

    iget-object v1, v1, Ll/ۛ᩵۠;->۬:Ll/۫᩵۠;

    iget-object v1, v1, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    iget-object v1, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 4030
    iget-object v2, v1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v3, Ll/֨ᩴ֨;->ᩳ֫:Ll/֨ᩴ֨;

    if-ne v2, v3, :cond_0

    invoke-virtual {v1}, Ll/ۛ֡֨;->֨֫()Ll/ܰ᩵֨;

    move-result-object v2

    invoke-virtual {v2}, Ll/۟᩵֨;->֫()Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Ll/ۧ֡֨;->ܽ֫:Ll/ۧ֡֨;

    iget-object v3, p0, Ll/ܶ۬֨;->۬:Ll/ܽ֡֨;

    .line 4031
    invoke-virtual {v2, v3}, Ll/ۧ֡֨;->֫(Ll/ܽ֡֨;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ll/ۛ֡֨;->ۗ()Z

    move-result v2

    if-nez v2, :cond_0

    .line 4032
    :cond_1
    sget-object v2, Ll/᩶۠۠;->۫:Ll/᩶۠۠;

    iget v0, v0, Ll/ۚۚ۠;->᩸:I

    sget-object v3, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 1160
    new-instance v3, Ll/۫۠۠;

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const-string v1, "compiler"

    const-string v5, "doesnt.exist"

    invoke-direct {v3, v1, v5, v4}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4032
    iget-object v1, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    invoke-virtual {v1, v2, v0, v3}, Ll/ۖ֨۠;->֫(Ll/᩶۠۠;ILl/۫۠۠;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ֫(Ll/֫֡۠;)V
    .locals 3

    .line 3734
    iget-object v0, p1, Ll/֫֡۠;->۫:Ll/ۨ֡۠;

    sget-object v1, Ll/ᩴۚ۠;->ܰۧ:Ll/ᩴۚ۠;

    invoke-virtual {v0, v1}, Ll/ۚۚ۠;->֫(Ll/ᩴۚ۠;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Ll/֫֡۠;->۬:Ll/ۨ֡۠;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    sget-object v1, Ll/᩶ᩴ֨;->ۨ:Ll/᩶ᩴ֨;

    .line 3735
    invoke-virtual {v0, v1}, Ll/ۙᩴ֨;->֫(Ll/᩶ᩴ֨;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3736
    iget-object p1, p1, Ll/֫֡۠;->۫:Ll/ۨ֡۠;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Ll/ܰᩴ۠;->ܳ:Ll/ۧܶ۠;

    iget-object v2, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    invoke-virtual {v2, v1, p1, v0}, Ll/ۖ֨۠;->ۧ(Ll/᩶ᩴ֨;Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/֫ۤ֨;Ll/ۚ᩵۠;)V
    .locals 6

    .line 4083
    iget-object v0, p1, Ll/֫ۤ֨;->۫:Ll/֨᩵۠;

    .line 4085
    iget-object v1, v0, Ll/֨᩵۠;->ۛ:Ll/֡֡֨;

    iget-object v2, p0, Ll/ܶ۬֨;->ۤ:Ll/᩷ۚ֨;

    iget-object v3, v2, Ll/᩷ۚ֨;->֡ۧ:Ll/֡֡֨;

    if-eq v1, v3, :cond_2

    iget-object v2, v2, Ll/᩷ۚ֨;->ۚ֫:Ll/֡֡֨;

    if-eq v1, v2, :cond_2

    iget-object v1, p2, Ll/ۚ᩵۠;->᩺:Ll/ܳ֡֨;

    .line 1331
    invoke-virtual {v1}, Ll/ܳ֡֨;->᩶()V

    .line 1332
    iget-wide v1, v1, Ll/ۛ֡֨;->᩶:J

    const-wide/32 v3, 0x1000000

    and-long/2addr v1, v3

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    goto :goto_0

    .line 4091
    :cond_0
    iget-object v1, v0, Ll/֨᩵۠;->᩺:Ll/۠֡֨;

    invoke-static {v1}, Ll/ܶ۬֨;->֫(Ll/۠֡֨;)Ll/ܿᩴ֨;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 4093
    iget-object v1, v1, Ll/ܿᩴ֨;->ۧ:Ll/ۖܶ۠;

    if-eqz v1, :cond_1

    goto :goto_0

    .line 4097
    :cond_1
    new-instance v1, Ll/ܺ۬֨;

    invoke-direct {v1, p0, p1, p2, v0}, Ll/ܺ۬֨;-><init>(Ll/ܶ۬֨;Ll/֫ۤ֨;Ll/ۚ᩵۠;Ll/֨᩵۠;)V

    .line 826
    invoke-virtual {v1, p2}, Ll/ܺ۬֨;->֫(Ll/ۚ᩵۠;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final ֫(Ll/֫ۤ֨;Ll/ۡ֡۠;Ll/ۘ֡֨;)V
    .locals 11

    .line 2104
    iget-object v0, p3, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    check-cast v0, Ll/ܳ֡֨;

    .line 1331
    invoke-virtual {v0}, Ll/ܳ֡֨;->᩶()V

    .line 1332
    iget-wide v1, v0, Ll/ۛ֡֨;->᩶:J

    const-wide/16 v3, 0x4000

    and-long/2addr v1, v3

    const-wide/16 v3, 0x0

    .line 2105
    iget-object v5, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    const/4 v6, 0x0

    iget-object v7, p0, Ll/ܶ۬֨;->ۤ:Ll/᩷ۚ֨;

    iget-object v8, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    cmp-long v9, v1, v3

    if-eqz v9, :cond_0

    iget-object v1, p0, Ll/ܶ۬֨;->ܶ:Ll/ۛܶ۠;

    iget-object v1, v1, Ll/ۛܶ۠;->᩷ۧ:Ll/ۤܶ۠;

    iget-object v2, p3, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2106
    iget-object v1, v7, Ll/᩷ۚ֨;->᩸:Ll/ۘ֡֨;

    invoke-virtual {p3, v1, v0, v8, v6}, Ll/ۘ֡֨;->֫(Ll/ۛ֡֨;Ll/᩶֡֨;Ll/ۛ᩸֨;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2107
    sget-object p1, Ll/ۛᩴ۠;->ۢ֫:Ll/۫۠۠;

    invoke-virtual {v5, p2, p1}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    return-void

    .line 2111
    :cond_0
    iget-boolean v1, p0, Ll/ܶ۬֨;->ۧ:Z

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ll/ܳ֡֨;->ۨ֫()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2113
    invoke-virtual {v0}, Ll/ܳ֡֨;->۫֫()Ll/ۖܶ۠;

    move-result-object v1

    invoke-static {v1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    new-instance v2, Ll/᩶ۗ֨;

    invoke-direct {v2, p2}, Ll/᩶ۗ֨;-><init>(Ll/ۡ֡۠;)V

    .line 2114
    invoke-interface {v1, v2}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    invoke-interface {v1}, Ll/ܿ᩺ᩴ;->findFirst()Ll/ܽ۫ᩴ;

    move-result-object v1

    .line 2115
    invoke-virtual {v1}, Ll/ܽ۫ᩴ;->isPresent()Z

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_4

    .line 2120
    :cond_1
    iget-object v1, v0, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    :goto_0
    sget-object v2, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    invoke-virtual {v1, v2}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 2122
    iget-object v2, v0, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    if-eq v1, v2, :cond_2

    .line 2123
    invoke-virtual {p0, p2, v1, v0, p3}, Ll/ܶ۬֨;->֫(Ll/ۡ֡۠;Ll/ۙ֨֨;Ll/ܳ֡֨;Ll/ۘ֡֨;)V

    .line 2125
    :cond_2
    invoke-virtual {v8, v1}, Ll/ۛ᩸֨;->ۖ(Ll/ۙ֨֨;)Ll/ۖܶ۠;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۙ֨֨;

    .line 2126
    invoke-virtual {p0, p2, v3, v0, p3}, Ll/ܶ۬֨;->֫(Ll/ۡ֡۠;Ll/ۙ֨֨;Ll/ܳ֡֨;Ll/ۘ֡֨;)V

    goto :goto_1

    .line 2121
    :cond_3
    invoke-virtual {v8, v1}, Ll/ۛ᩸֨;->᩸(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v1

    goto :goto_0

    .line 2130
    :cond_4
    iget-object v0, v7, Ll/᩷ۚ֨;->᩶֫:Ll/ۙ֨֨;

    iget-object v0, v0, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {p3, v0}, Ll/ۛ֡֨;->֫(Ll/ۛ֡֨;)Ll/ܽۘ֨;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_5

    const/4 v0, 0x1

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    :goto_2
    if-nez v0, :cond_6

    .line 2134
    iget-object p1, p1, Ll/֫ۤ֨;->ۙ:Ljava/lang/Object;

    check-cast p1, Ll/ۡۗ֨;

    iget-boolean p1, p1, Ll/ۡۗ֨;->ᩳ:Z

    if-eqz p1, :cond_b

    .line 2135
    invoke-virtual {p3}, Ll/ۛ֡֨;->ۜ֫()Z

    move-result p1

    if-nez p1, :cond_b

    .line 415
    iget-wide v2, p3, Ll/ۛ֡֨;->᩶:J

    const-wide/16 v9, 0x7

    and-long/2addr v2, v9

    const-wide/16 v9, 0x2

    cmp-long p1, v2, v9

    if-nez p1, :cond_6

    return-void

    .line 3282
    :cond_6
    iget-object p1, p3, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v2, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-ne p1, v2, :cond_c

    invoke-virtual {p3}, Ll/ۛ֡֨;->֡֫()Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_5

    .line 3285
    :cond_7
    iget-object p1, p3, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    check-cast p1, Ll/᩶֡֨;

    .line 3286
    iget-object v2, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v8, v2}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;)Ll/ۖܶ۠;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_8
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۙ֨֨;

    .line 3287
    iget-object v4, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    if-ne v3, v4, :cond_9

    goto :goto_3

    .line 3289
    :cond_9
    iget-object v3, v3, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v3}, Ll/ۛ֡֨;->֨֫()Ll/ܰ᩵֨;

    move-result-object v3

    .line 3290
    iget-object v4, p3, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {v3, v4}, Ll/۟᩵֨;->֫(Ll/ۤܶ۠;)Ljava/lang/Iterable;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۛ֡֨;

    .line 3291
    invoke-virtual {v4}, Ll/ۛ֡֨;->֡֫()Z

    move-result v9

    if-nez v9, :cond_a

    invoke-virtual {p3, v4, p1, v8, v1}, Ll/ۘ֡֨;->֫(Ll/ۛ֡֨;Ll/᩶֡֨;Ll/ۛ᩸֨;Z)Z

    move-result v4

    if-eqz v4, :cond_a

    :cond_b
    :goto_4
    return-void

    .line 933
    :cond_c
    :goto_5
    iget-object p1, p2, Ll/ۡ֡۠;->ۤ:Ll/ۖ֡۠;

    .line 2138
    iget-object p1, p1, Ll/ۖ֡۠;->ۗ:Ll/ۖܶ۠;

    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܿ᩵۠;

    .line 2139
    iget-object v3, v2, Ll/ܿ᩵۠;->ۗ:Ll/ۚۚ۠;

    iget-object v3, v3, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    iget-object v3, v3, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v4, v7, Ll/᩷ۚ֨;->᩶֫:Ll/ۙ֨֨;

    iget-object v4, v4, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    if-ne v3, v4, :cond_d

    move-object p2, v2

    :cond_e
    if-eqz v0, :cond_10

    .line 2145
    invoke-virtual {p3}, Ll/ۛ֡֨;->֡֫()Z

    move-result p1

    if-eqz p1, :cond_f

    sget-object p1, Ll/ۛᩴ۠;->ۚᩳ:Ll/۫۠۠;

    goto :goto_6

    :cond_f
    sget-object p1, Ll/ۛᩴ۠;->۟ۧ:Ll/۫۠۠;

    goto :goto_6

    .line 2146
    :cond_10
    sget-object p1, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 227
    new-instance p1, Ll/۫۠۠;

    new-array p3, v1, [Ljava/lang/Object;

    sget-object v0, Ll/ۨᩴ۠;->ۘ:Ll/ۨ۠۠;

    aput-object v0, p3, v6

    const-string v0, "compiler"

    const-string v1, "anonymous.diamond.method.does.not.override.superclass"

    invoke-direct {p1, v0, v1, p3}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2144
    :goto_6
    invoke-virtual {v5, p2, p1}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    return-void
.end method

.method public final ֫(Ll/ۖܶ۠;)V
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 4306
    :goto_0
    invoke-virtual {p1}, Ll/ۖܶ۠;->ܽ()Z

    move-result v6

    if-eqz v6, :cond_c

    .line 4307
    iget-object v6, p1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v6, Ll/ᩴ᩵۠;

    .line 4308
    iget-object v7, v6, Ll/ᩴ᩵۠;->ۤ:Ll/ۖܶ۠;

    invoke-virtual {v7}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩵᩵۠;

    .line 4309
    invoke-virtual {v8}, Ll/᩵᩵۠;->ܿ֫()Z

    move-result v9

    iget-object v10, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    if-eqz v9, :cond_3

    .line 4310
    move-object v9, v8

    check-cast v9, Ll/۫᩵۠;

    .line 4311
    invoke-static {v9}, Ll/۟ۚ۠;->֡(Ll/ۚۚ۠;)Z

    move-result v9

    if-eqz v9, :cond_1

    if-eqz v3, :cond_0

    if-nez v4, :cond_0

    if-nez v5, :cond_0

    .line 4313
    sget-object v2, Ll/ۛᩴ۠;->֨֫:Ll/۫۠۠;

    invoke-virtual {v10, v8, v2}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    :cond_0
    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    if-eqz v3, :cond_2

    if-nez v5, :cond_2

    .line 4318
    sget-object v0, Ll/ۛᩴ۠;->֨֫:Ll/۫۠۠;

    invoke-virtual {v10, v8, v0}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    :cond_2
    const/4 v0, 0x1

    goto :goto_1

    .line 4322
    :cond_3
    sget-object v9, Ll/ᩴۚ۠;->ۡ֫:Ll/ᩴۚ۠;

    invoke-virtual {v8, v9}, Ll/ۚۚ۠;->֫(Ll/ᩴۚ۠;)Z

    move-result v9

    if-eqz v9, :cond_5

    if-eqz v3, :cond_4

    if-nez v5, :cond_4

    .line 4324
    sget-object v1, Ll/ۛᩴ۠;->֨֫:Ll/۫۠۠;

    invoke-virtual {v10, v8, v1}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    :cond_4
    const/4 v1, 0x1

    goto :goto_1

    .line 4328
    :cond_5
    sget-object v4, Ll/ᩴۚ۠;->ۛ:Ll/ᩴۚ۠;

    invoke-virtual {v8, v4}, Ll/ۚۚ۠;->֫(Ll/ᩴۚ۠;)Z

    move-result v4

    if-nez v3, :cond_6

    if-nez v0, :cond_6

    if-nez v1, :cond_6

    if-eqz v2, :cond_7

    if-eqz v4, :cond_6

    if-eqz v5, :cond_7

    .line 4331
    :cond_6
    sget-object v3, Ll/ۛᩴ۠;->۠֫:Ll/۫۠۠;

    invoke-virtual {v10, v8, v3}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    :cond_7
    const/4 v3, 0x1

    goto :goto_1

    .line 4338
    :cond_8
    iget-object v5, v6, Ll/ᩴ᩵۠;->۬:Ll/ۜۡ֨;

    sget-object v7, Ll/ۜۡ֨;->᩶:Ll/ۜۡ֨;

    if-ne v5, v7, :cond_9

    iget-boolean v5, v6, Ll/ᩴ᩵۠;->۫:Z

    goto :goto_2

    :cond_9
    const/4 v5, 0x0

    .line 4341
    :goto_2
    iget-object v7, v6, Ll/ᩴ᩵۠;->ۛ:Ll/ۖܶ۠;

    invoke-virtual {v7}, Ll/ۖܶ۠;->ܽ()Z

    move-result v7

    if-eqz v7, :cond_a

    and-int v0, v2, v5

    and-int v1, v3, v5

    and-int v2, v4, v5

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v3, v1

    move v4, v2

    const/4 v1, 0x0

    move v2, v0

    const/4 v0, 0x0

    .line 4349
    :cond_a
    iget-object v6, v6, Ll/ᩴ᩵۠;->ۛ:Ll/ۖܶ۠;

    invoke-virtual {v6}, Ll/ۖܶ۠;->ܽ()Z

    move-result v6

    if-eqz v6, :cond_b

    if-eqz v5, :cond_b

    const/4 v5, 0x1

    goto :goto_3

    :cond_b
    const/4 v5, 0x0

    .line 4306
    :goto_3
    iget-object p1, p1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto/16 :goto_0

    :cond_c
    return-void
.end method

.method public final ֫(Ll/ۖܶ۠;Ll/֫ۤ֨;)V
    .locals 2

    .line 1407
    :goto_0
    invoke-virtual {p1}, Ll/ۖܶ۠;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1408
    iget-object v0, p1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ۚۚ۠;

    const/4 v1, 0x1

    .line 1398
    invoke-virtual {p0, v0, p2, v1}, Ll/ܶ۬֨;->֫(Ll/ۚۚ۠;Ll/֫ۤ֨;Z)V

    .line 1407
    iget-object p1, p1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۖܶ۠;Ll/ۖܶ۠;)V
    .locals 2

    .line 803
    :goto_0
    invoke-virtual {p2}, Ll/ۖܶ۠;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 804
    iget-object v0, p1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/۫᩵۠;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p2, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v1, Ll/ۙ֨֨;

    invoke-virtual {p0, v0, v1}, Ll/ܶ۬֨;->᩷(Ll/ۗ۠۠;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v0

    iput-object v0, p2, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    .line 805
    iget-object p1, p1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    .line 803
    iget-object p2, p2, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۗ۠۠;Ljava/util/HashMap;Ll/ۙ֨֨;)V
    .locals 9

    .line 2817
    invoke-virtual {p3}, Ll/ۙ֨֨;->᩻֫()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    .line 2818
    :cond_0
    iget-object v0, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    invoke-virtual {v0, p3}, Ll/ۛ᩸֨;->ۖ(Ll/ۙ֨֨;)Ll/ۖܶ۠;

    move-result-object v1

    :goto_0
    invoke-virtual {v1}, Ll/ۖܶ۠;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 2819
    iget-object v2, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v2, Ll/ۙ֨֨;

    .line 2820
    sget-object v3, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    invoke-virtual {p3, v3}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v2, v3}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    .line 2822
    :cond_1
    iget-object v3, v2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {p2, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۙ֨֨;

    if-eqz v3, :cond_2

    .line 2824
    invoke-virtual {v3}, Ll/ۙ֨֨;->ܶ()Ll/ۖܶ۠;

    move-result-object v3

    .line 2825
    invoke-virtual {v2}, Ll/ۙ֨֨;->ܶ()Ll/ۖܶ۠;

    move-result-object v4

    .line 2826
    invoke-virtual {v0, v3, v4}, Ll/ۛ᩸֨;->ۧ(Ll/ۖܶ۠;Ll/ۖܶ۠;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 2827
    iget-object v5, v2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 2829
    invoke-static {v3}, Ll/ۙ֨֨;->ᩳ(Ll/ۖܶ۠;)Ljava/lang/String;

    move-result-object v3

    .line 2830
    invoke-static {v4}, Ll/ۙ֨֨;->ᩳ(Ll/ۖܶ۠;)Ljava/lang/String;

    move-result-object v4

    .line 2828
    sget-object v6, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 712
    new-instance v6, Ll/۫۠۠;

    const/4 v7, 0x3

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v5, v7, v8

    const/4 v5, 0x1

    aput-object v3, v7, v5

    const/4 v3, 0x2

    aput-object v4, v7, v3

    const-string v3, "compiler"

    const-string v4, "cant.inherit.diff.arg"

    invoke-direct {v6, v3, v4, v7}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2827
    iget-object v3, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    invoke-virtual {v3, p1, v6}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    .line 2832
    :cond_2
    invoke-virtual {p0, p1, p2, v2}, Ll/ܶ۬֨;->֫(Ll/ۗ۠۠;Ljava/util/HashMap;Ll/ۙ֨֨;)V

    .line 2818
    :goto_1
    iget-object v1, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    .line 2834
    :cond_3
    invoke-virtual {v0, p3}, Ll/ۛ᩸֨;->᩸(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v0

    .line 2835
    sget-object v1, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    invoke-virtual {p3, v1}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-virtual {v0, v1}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result p3

    if-nez p3, :cond_4

    goto :goto_2

    .line 2836
    :cond_4
    sget-object p3, Ll/ۙ֨֨;->ۙ:Ll/ۨۚ֨;

    if-eq v0, p3, :cond_5

    invoke-virtual {p0, p1, p2, v0}, Ll/ܶ۬֨;->֫(Ll/ۗ۠۠;Ljava/util/HashMap;Ll/ۙ֨֨;)V

    :cond_5
    :goto_2
    return-void
.end method

.method public final ֫(Ll/ۗ۠۠;Ll/֨֡֨;Ll/ۙ֨֨;)V
    .locals 4

    .line 3719
    invoke-virtual {p3}, Ll/ۙ֨֨;->ۗ()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3720
    invoke-virtual {p3}, Ll/ۙ֨֨;->֫֫()Ll/ۢ۠֨;

    move-result-object v0

    sget-object v1, Ll/ۢ۠֨;->ᩳ֫:Ll/ۢ۠֨;

    invoke-virtual {v0, v1}, Ll/ۢ۠֨;->ۧ(Ll/ۢ۠֨;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3721
    invoke-virtual {p3}, Ll/ۙ֨֨;->ۗ()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p3, v0, v2

    if-nez p3, :cond_1

    .line 3722
    iget p2, p2, Ll/֨֡֨;->ܽ֫:I

    const/16 p3, 0x6c

    if-eq p2, p3, :cond_0

    const/16 p3, 0x70

    if-eq p2, p3, :cond_0

    const/16 p3, 0x6d

    if-eq p2, p3, :cond_0

    const/16 p3, 0x71

    if-ne p2, p3, :cond_1

    .line 3725
    :cond_0
    new-instance p2, Ll/۟ۗ֨;

    invoke-direct {p2, p0, p1}, Ll/۟ۗ֨;-><init>(Ll/ܶ۬֨;Ll/ۗ۠۠;)V

    iget-object p1, p0, Ll/ܶ۬֨;->ۜ:Ll/ᩳᩴ֨;

    invoke-virtual {p1, p2}, Ll/ᩳᩴ֨;->֫(Ll/ܽᩴ֨;)V

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ۗ۠۠;Ll/ۛ֡֨;)V
    .locals 17

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    .line 342
    iget-object v2, v1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v2}, Ll/ۙ֨֨;->᩻֫()Z

    move-result v2

    if-nez v2, :cond_2

    .line 343
    invoke-virtual/range {p2 .. p2}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v2

    .line 344
    iget-object v3, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v4, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    const-string v10, "compiler"

    move-object/from16 v11, p0

    iget-object v12, v11, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    if-ne v3, v4, :cond_0

    move-object v3, v2

    check-cast v3, Ll/ۘ֡֨;

    .line 345
    invoke-virtual {v3}, Ll/ۘ֡֨;->᩶֫()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 347
    invoke-static/range {p2 .. p2}, Ll/᩸ᩴ֨;->֫(Ll/ۛ֡֨;)Ll/۠ᩴ֨;

    move-result-object v2

    .line 349
    invoke-virtual/range {p2 .. p2}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v3

    invoke-static {v3}, Ll/᩸ᩴ֨;->֫(Ll/ۛ֡֨;)Ll/۠ᩴ֨;

    move-result-object v3

    .line 350
    invoke-virtual/range {p2 .. p2}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۛ֡֨;->ۙ()Ll/ܳ֡֨;

    move-result-object v4

    invoke-static {v4}, Ll/᩸ᩴ֨;->֫(Ll/ۛ֡֨;)Ll/۠ᩴ֨;

    move-result-object v4

    .line 351
    invoke-virtual/range {p2 .. p2}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v13

    invoke-virtual {v13}, Ll/ۛ֡֨;->ۙ()Ll/ܳ֡֨;

    move-result-object v13

    .line 347
    sget-object v14, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 99
    new-instance v14, Ll/۫۠۠;

    const/4 v15, 0x5

    new-array v15, v15, [Ljava/lang/Object;

    aput-object v2, v15, v9

    aput-object v1, v15, v8

    aput-object v3, v15, v7

    aput-object v4, v15, v6

    aput-object v13, v15, v5

    const-string v1, "already.defined.in.clinit"

    invoke-direct {v14, v10, v1, v15}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 346
    invoke-virtual {v12, v0, v14}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    return-void

    .line 356
    :cond_0
    iget-object v2, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    if-ne v2, v4, :cond_1

    iget-object v2, v1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-wide v2, v2, Ll/ۛ֡֨;->᩶:J

    const-wide v13, 0x1000000000L

    and-long/2addr v13, v2

    const-wide/16 v15, 0x0

    cmp-long v4, v13, v15

    if-eqz v4, :cond_1

    const-wide/high16 v13, 0x2000000000000000L

    and-long/2addr v2, v13

    cmp-long v4, v2, v15

    if-nez v4, :cond_3

    .line 360
    :cond_1
    invoke-static/range {p2 .. p2}, Ll/᩸ᩴ֨;->֫(Ll/ۛ֡֨;)Ll/۠ᩴ֨;

    move-result-object v2

    .line 362
    invoke-virtual/range {p2 .. p2}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v3

    invoke-static {v3}, Ll/᩸ᩴ֨;->֫(Ll/ۛ֡֨;)Ll/۠ᩴ֨;

    move-result-object v3

    .line 363
    invoke-virtual/range {p2 .. p2}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v4

    .line 360
    sget-object v13, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 91
    new-instance v13, Ll/۫۠۠;

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v2, v5, v9

    aput-object v1, v5, v8

    aput-object v3, v5, v7

    aput-object v4, v5, v6

    const-string v1, "already.defined"

    invoke-direct {v13, v10, v1, v5}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 359
    invoke-virtual {v12, v0, v13}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    return-void

    :cond_2
    move-object/from16 v11, p0

    :cond_3
    return-void
.end method

.method public final ֫(Ll/ۗ۠۠;Ll/ۛ֡֨;Ll/ۛ֡֨;)V
    .locals 7

    .line 3581
    invoke-virtual {p3}, Ll/ۛ֡֨;->۬()J

    move-result-wide v0

    const-wide/high16 v2, 0x100000000000000L

    and-long/2addr v0, v2

    iget-object v2, p0, Ll/ܶ۬֨;->᩹:Ll/᩺ᩴ֨;

    const-wide/16 v3, 0x0

    cmp-long v5, v0, v3

    if-eqz v5, :cond_2

    invoke-virtual {p3}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object v0

    iget-object v0, v0, Ll/۠֡֨;->᩺:Ll/֡֡֨;

    invoke-virtual {p2}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object p2

    iget-object p2, p2, Ll/۠֡֨;->᩺:Ll/֡֡֨;

    if-eq v0, p2, :cond_2

    .line 3582
    invoke-virtual {p3}, Ll/ۛ֡֨;->۬()J

    move-result-wide v0

    const-wide/high16 v5, 0x400000000000000L

    and-long/2addr v0, v5

    iget-object p2, p0, Ll/ܶ۬֨;->ۜ:Ll/ᩳᩴ֨;

    cmp-long v5, v0, v3

    if-nez v5, :cond_1

    .line 3583
    invoke-virtual {v2}, Ll/᩺ᩴ֨;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3584
    sget-object p2, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2271
    new-instance p2, Ll/۫۠۠;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p3, v0, v1

    const-string p3, "compiler"

    const-string v1, "is.preview"

    invoke-direct {p2, p3, v1, v0}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3584
    iget-object p3, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    invoke-virtual {p3, p1, p2}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    goto :goto_0

    .line 3586
    :cond_0
    invoke-virtual {v2}, Ll/᩺ᩴ֨;->ۧ()V

    .line 3587
    new-instance v0, Ll/֫۬֨;

    invoke-direct {v0, p0, p1, p3}, Ll/֫۬֨;-><init>(Ll/ܶ۬֨;Ll/ۗ۠۠;Ll/ۛ֡֨;)V

    invoke-virtual {p2, v0}, Ll/ᩳᩴ֨;->֫(Ll/ܽᩴ֨;)V

    goto :goto_0

    .line 3590
    :cond_1
    new-instance v0, Ll/ۧ۬֨;

    invoke-direct {v0, p0, p1, p3}, Ll/ۧ۬֨;-><init>(Ll/ܶ۬֨;Ll/ۗ۠۠;Ll/ۛ֡֨;)V

    invoke-virtual {p2, v0}, Ll/ᩳᩴ֨;->֫(Ll/ܽᩴ֨;)V

    .line 3593
    :cond_2
    :goto_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final ֫(Ll/ۗ۠۠;Ll/۠֡֨;)V
    .locals 5

    .line 1176
    invoke-virtual {p2}, Ll/ۛ֡֨;->᩶()V

    .line 1177
    iget-object v0, p2, Ll/۠֡֨;->ۨ:Ll/ܰ᩵֨;

    .line 4269
    invoke-virtual {v0}, Ll/۟᩵֨;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1186
    invoke-virtual {p2}, Ll/ۛ֡֨;->᩶()V

    .line 1187
    iget-wide v0, p2, Ll/ۛ֡֨;->᩶:J

    const-wide/high16 v2, 0x10000000000000L

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 4271
    new-instance v0, Ll/᩺ۗ֨;

    invoke-direct {v0, p0, p1, p2}, Ll/᩺ۗ֨;-><init>(Ll/ܶ۬֨;Ll/ۗ۠۠;Ll/۠֡֨;)V

    iget-object p1, p0, Ll/ܶ۬֨;->ۜ:Ll/ᩳᩴ֨;

    invoke-virtual {p1, v0}, Ll/ᩳᩴ֨;->֫(Ll/ܽᩴ֨;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۗ۠۠;Ll/ۢᩴ֨;)V
    .locals 5

    .line 4279
    iget-object v0, p2, Ll/ۢᩴ֨;->ۧ:Ll/֡֡֨;

    .line 111
    iget-wide v0, v0, Ll/ۛ֡֨;->᩶:J

    const-wide/high16 v2, 0x10000000000000L

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 4280
    new-instance v0, Ll/ۤۗ֨;

    invoke-direct {v0, p0, p2, p1}, Ll/ۤۗ֨;-><init>(Ll/ܶ۬֨;Ll/ۢᩴ֨;Ll/ۗ۠۠;)V

    iget-object p1, p0, Ll/ܶ۬֨;->ۜ:Ll/ᩳᩴ֨;

    invoke-virtual {p1, v0}, Ll/ᩳᩴ֨;->֫(Ll/ܽᩴ֨;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۗ۠۠;Ll/ۧܶ۠;)V
    .locals 2

    .line 250
    iget-object v0, p0, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    sget-object v1, Ll/᩶ᩴ֨;->ۜ֫:Ll/᩶ᩴ֨;

    invoke-virtual {v0, v1}, Ll/ۙᩴ֨;->ۧ(Ll/᩶ᩴ֨;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 251
    iget-object v0, p0, Ll/ܶ۬֨;->᩹:Ll/᩺ᩴ֨;

    invoke-virtual {v0, p1, p2}, Ll/᩺ᩴ֨;->֫(Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۗ۠۠;Ll/۫֡֨;Ll/ܰ᩵֨;)V
    .locals 4

    .line 388
    iget-object v0, p2, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {p3, v0}, Ll/۟᩵֨;->֫(Ll/ۤܶ۠;)Ljava/lang/Iterable;

    move-result-object p3

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛ֡֨;

    .line 389
    iget-object v1, v0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v2, p2, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    if-eq v1, v2, :cond_1

    goto :goto_0

    .line 390
    :cond_1
    iget-object v2, v0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v3, Ll/֨ᩴ֨;->ۜ֫:Ll/֨ᩴ֨;

    if-ne v2, v3, :cond_0

    iget-object v1, v1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v2, Ll/ܶᩴ֨;->ܺ:Ll/ܶᩴ֨;

    .line 391
    invoke-virtual {v1, v2}, Ll/֨ᩴ֨;->֫(Ll/ܶᩴ֨;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p2, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v2, p0, Ll/ܶ۬֨;->ܶ:Ll/ۛܶ۠;

    iget-object v2, v2, Ll/ۛܶ۠;->ܳۧ:Ll/ۤܶ۠;

    if-eq v1, v2, :cond_0

    .line 393
    invoke-virtual {p0, p1, v0}, Ll/ܶ۬֨;->֫(Ll/ۗ۠۠;Ll/ۛ֡֨;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final ֫(Ll/ۘ֡۠;)V
    .locals 6

    .line 2205
    iget-object v0, p1, Ll/ۘ֡۠;->ۛ:Ll/֡֡֨;

    iget-object v0, v0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    .line 2206
    invoke-static {v0}, Ll/۫ۙ;->֫(Ljava/lang/Object;)V

    .line 2207
    iget-object v0, p0, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    sget-object v1, Ll/᩶ᩴ֨;->ۧ֫:Ll/᩶ᩴ֨;

    invoke-virtual {v0, v1}, Ll/ۙᩴ֨;->֫(Ll/᩶ᩴ֨;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2208
    iget-object p1, p1, Ll/ۘ֡۠;->ۤ:Ll/۫᩵۠;

    :goto_0
    if-eqz p1, :cond_3

    .line 2212
    sget-object v0, Ll/ۖ۬֨;->ܿ:[I

    invoke-virtual {p1}, Ll/ۚۚ۠;->ܽ֫()Ll/ᩴۚ۠;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    .line 2220
    move-object v0, p1

    check-cast v0, Ll/۟᩵۠;

    iget-object v0, v0, Ll/۟᩵۠;->ۗ:Ll/ۤܶ۠;

    const/4 v2, 0x0

    goto :goto_1

    .line 2225
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected qualified identifier: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/ۚۚ۠;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 2214
    :cond_1
    check-cast p1, Ll/ۛ᩵۠;

    .line 2215
    iget-object v0, p1, Ll/ۛ᩵۠;->ۗ:Ll/ۤܶ۠;

    .line 2217
    iget-object v2, p1, Ll/ۛ᩵۠;->۬:Ll/۫᩵۠;

    :goto_1
    if-eqz v0, :cond_2

    .line 2228
    invoke-virtual {v0}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v3

    .line 2229
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_2

    add-int/lit8 v4, v4, -0x1

    .line 2230
    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 2231
    sget-object v3, Ll/᩶ᩴ֨;->ۧ֫:Ll/᩶ᩴ֨;

    sget-object v4, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4694
    new-instance v4, Ll/ۧܶ۠;

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v1, v5

    const-string v0, "compiler"

    const-string v5, "poor.choice.for.module.name"

    invoke-direct {v4, v0, v5, v1}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2231
    iget-object v0, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    invoke-virtual {v0, v3, p1, v4}, Ll/ۖ֨۠;->ۧ(Ll/᩶ᩴ֨;Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    :cond_2
    move-object p1, v2

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final ֫(Ll/ۙ֨֨;Ll/ۛ֡֨;Ll/֫ۤ֨;Ll/ۖܶ۠;Ll/ۖܶ۠;ZLl/֡ۨ֨;)V
    .locals 19

    move-object/from16 v8, p0

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    move-object/from16 v9, p7

    .line 165
    iget-object v0, v9, Ll/֡ۨ֨;->ᩳ:Ll/ۖܶ۠;

    move-object/from16 v10, p1

    invoke-virtual {v10, v0}, Ll/ۙ֨֨;->ۧ(Ll/ۖܶ۠;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1002
    invoke-static/range {p1 .. p1}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v11

    new-instance v12, Ll/ܽ۬֨;

    move-object v0, v12

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    invoke-direct/range {v0 .. v7}, Ll/ܽ۬֨;-><init>(Ll/ܶ۬֨;Ll/ۙ֨֨;Ll/ۛ֡֨;Ll/֫ۤ֨;Ll/ۖܶ۠;Ll/ۖܶ۠;Z)V

    invoke-virtual {v9, v11, v12}, Ll/֡ۨ֨;->֫(Ll/ۖܶ۠;Ll/ۘۛ֨;)V

    return-void

    .line 1007
    :cond_0
    invoke-virtual/range {p1 .. p1}, Ll/ۙ֨֨;->ܰ()Ll/ۖܶ۠;

    move-result-object v0

    .line 1008
    iget-object v1, v6, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v1}, Ll/ۙ֨֨;->ܰ()Ll/ۖܶ۠;

    move-result-object v1

    .line 1009
    invoke-virtual {v1}, Ll/ۖܶ۠;->ۧ()I

    move-result v2

    invoke-virtual {v0}, Ll/ۖܶ۠;->ۧ()I

    move-result v3

    if-eq v2, v3, :cond_1

    move-object v1, v0

    :cond_1
    if-eqz p6, :cond_2

    .line 1010
    invoke-virtual {v0}, Ll/ۖܶ۠;->last()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۙ֨֨;

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    move-object v9, v2

    .line 1011
    iget-object v2, v6, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v3, v8, Ll/ܶ۬֨;->ܶ:Ll/ۛܶ۠;

    iget-object v3, v3, Ll/ۛܶ۠;->ᩴۧ:Ll/ۤܶ۠;

    iget-object v11, v8, Ll/ܶ۬֨;->ۤ:Ll/᩷ۚ֨;

    if-ne v2, v3, :cond_3

    iget-object v2, v6, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v3, v11, Ll/᩷ۚ֨;->᩹:Ll/ܳ֡֨;

    if-ne v2, v3, :cond_3

    .line 1012
    iget-object v0, v0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    iget-object v0, v0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    .line 1013
    iget-object v1, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    iget-object v1, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    .line 1015
    :cond_3
    invoke-virtual/range {p2 .. p2}, Ll/ۛ֡֨;->۬()J

    move-result-wide v2

    const-wide/high16 v4, 0x200000000000000L

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v12, v2, v4

    if-eqz v12, :cond_4

    .line 1016
    iget-object v0, v0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    .line 1017
    iget-object v1, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    :cond_4
    const-string v13, "compiler"

    .line 1020
    iget-object v14, v8, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    if-eqz p4, :cond_7

    move-object/from16 v4, p4

    move-object v15, v0

    move-object v5, v1

    .line 1022
    :goto_1
    iget-object v0, v15, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    if-eq v0, v9, :cond_5

    .line 1023
    iget-object v0, v4, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ll/ۚۚ۠;

    .line 1024
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v3, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    iget-object v0, v5, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    move-object/from16 v16, v0

    check-cast v16, Ll/ۙ֨֨;

    .line 3980
    new-instance v1, Ll/᩵۬֨;

    const-string v17, "unchecked.assign"

    move-object v0, v1

    move-object v12, v1

    move-object/from16 v1, p0

    move-object/from16 v18, v2

    move-object v2, v3

    move-object v10, v3

    move-object/from16 v3, v17

    move-object v7, v4

    move-object/from16 v4, v18

    move-object v6, v5

    move-object/from16 v5, v16

    invoke-direct/range {v0 .. v5}, Ll/᩵۬֨;-><init>(Ll/ܶ۬֨;Ll/ۗ۠۠;Ljava/lang/String;Ll/ۙ֨֨;Ll/ۙ֨֨;)V

    .line 1025
    iget-object v0, v10, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    iget-object v1, v15, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v1, Ll/ۙ֨֨;

    invoke-direct {v8, v0, v1, v12}, Ll/ܶ۬֨;->֫(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)V

    .line 1026
    iget-object v4, v7, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    .line 1027
    iget-object v15, v15, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    .line 1028
    iget-object v5, v6, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    move-object/from16 v10, p1

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    goto :goto_1

    :cond_5
    move-object v7, v4

    const/4 v6, 0x0

    if-eqz p6, :cond_6

    .line 1031
    invoke-virtual {v14, v9}, Ll/ۛ᩸֨;->ۜ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v9

    .line 1032
    :goto_2
    iget-object v0, v7, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    if-eqz v0, :cond_8

    .line 1033
    iget-object v0, v7, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    move-object v10, v0

    check-cast v10, Ll/ۚۚ۠;

    .line 1034
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v10, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    .line 3980
    new-instance v12, Ll/᩵۬֨;

    const-string v3, "unchecked.assign"

    move-object v0, v12

    move-object/from16 v1, p0

    move-object v2, v10

    move-object v5, v9

    invoke-direct/range {v0 .. v5}, Ll/᩵۬֨;-><init>(Ll/ܶ۬֨;Ll/ۗ۠۠;Ljava/lang/String;Ll/ۙ֨֨;Ll/ۙ֨֨;)V

    .line 1035
    iget-object v0, v10, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    invoke-direct {v8, v0, v9, v12}, Ll/ܶ۬֨;->֫(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)V

    .line 1036
    iget-object v7, v7, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_2

    .line 1038
    :cond_6
    invoke-virtual/range {p2 .. p2}, Ll/ۛ֡֨;->۬()J

    move-result-wide v0

    const-wide v2, 0x400400000000L

    and-long/2addr v0, v2

    const-wide v2, 0x400000000L

    cmp-long v4, v0, v2

    if-nez v4, :cond_8

    .line 1040
    invoke-virtual/range {p1 .. p1}, Ll/ۙ֨֨;->ܰ()Ll/ۖܶ۠;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۖܶ۠;->last()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۙ֨֨;

    .line 1041
    invoke-virtual/range {p5 .. p5}, Ll/ۖܶ۠;->last()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ֨֨;

    .line 1042
    invoke-virtual {v14, v0}, Ll/ۛ᩸֨;->ۜ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v2

    .line 1006
    iget-object v3, v14, Ll/ۛ᩸֨;->ܿ֫:Ll/֨᩸۠;

    invoke-virtual {v14, v1, v2, v3}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 1043
    invoke-virtual {v14, v0}, Ll/ۛ᩸֨;->ۢ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v2

    invoke-virtual {v14, v1}, Ll/ۛ᩸֨;->ۢ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v1

    invoke-virtual {v14, v2, v1}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v1

    if-nez v1, :cond_8

    .line 1044
    invoke-virtual/range {p4 .. p4}, Ll/ۖܶ۠;->last()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫᩵۠;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1045
    invoke-virtual {v14, v0}, Ll/ۛ᩸֨;->ۜ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v2

    sget-object v3, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4387
    new-instance v3, Ll/ۧܶ۠;

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v2, v4, v6

    const/4 v2, 0x1

    aput-object v0, v4, v2

    const-string v0, "inexact.non-varargs.call"

    invoke-direct {v3, v13, v0, v4}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1044
    iget-object v0, v8, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    invoke-virtual {v0, v1, v3}, Ll/ۖ֨۠;->ۧ(Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    goto :goto_3

    :cond_7
    const/4 v6, 0x0

    :cond_8
    :goto_3
    if-eqz p6, :cond_b

    .line 1049
    invoke-virtual/range {p1 .. p1}, Ll/ۙ֨֨;->ܰ()Ll/ۖܶ۠;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۖܶ۠;->last()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۙ֨֨;

    .line 1050
    invoke-virtual {v14, v0}, Ll/ۛ᩸֨;->֡(Ll/ۙ֨֨;)Z

    move-result v1

    if-nez v1, :cond_a

    .line 1051
    invoke-virtual/range {p2 .. p2}, Ll/ۛ֡֨;->᩹()Ll/ۛ֡֨;

    move-result-object v1

    iget-object v2, v11, Ll/᩷ۚ֨;->ܺۧ:Ll/ۙ֨֨;

    iget-object v2, v2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v1, v2}, Ll/ۛ֡֨;->֫(Ll/ۛ֡֨;)Ll/ܽۘ֨;

    move-result-object v1

    if-eqz v1, :cond_9

    move-object/from16 v1, p2

    .line 1052
    invoke-direct {v8, v1}, Ll/ܶ۬֨;->ۧ(Ll/ۛ֡֨;)Z

    move-result v1

    if-nez v1, :cond_a

    :cond_9
    move-object/from16 v1, p3

    .line 1053
    iget-object v2, v1, Ll/֫ۤ֨;->ۤ:Ll/ۚۚ۠;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 5117
    new-instance v3, Ll/ۧܶ۠;

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v0, v4, v6

    const-string v5, "unchecked.generic.array.creation"

    invoke-direct {v3, v13, v5, v4}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1053
    invoke-virtual {v8, v2, v3}, Ll/ܶ۬֨;->ۧ(Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    goto :goto_4

    :cond_a
    move-object/from16 v1, p3

    .line 1055
    :goto_4
    iget-object v1, v1, Ll/֫ۤ֨;->ۤ:Ll/ۚۚ۠;

    invoke-virtual {v14, v0}, Ll/ۛ᩸֨;->ۜ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v0

    invoke-static {v0, v1}, Ll/۟ۚ۠;->֫(Ll/ۙ֨֨;Ll/ۚۚ۠;)V

    :cond_b
    return-void
.end method

.method public final ֫(Ll/ۚۚ۠;)V
    .locals 4

    move-object v0, p1

    .line 3866
    :goto_0
    sget-object v1, Ll/ᩴۚ۠;->᩺ۧ:Ll/ᩴۚ۠;

    invoke-virtual {v0, v1}, Ll/ۚۚ۠;->֫(Ll/ᩴۚ۠;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 3867
    check-cast v0, Ll/ۛ᩵۠;

    .line 3868
    iget-object v1, v0, Ll/ۛ᩵۠;->۫:Ll/ۛ֡֨;

    iget-object v1, v1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    invoke-virtual {v1}, Ll/ۛ֡֨;->۟()Ll/ۤܶ۠;

    move-result-object v1

    iget-object v2, v0, Ll/ۛ᩵۠;->۬:Ll/۫᩵۠;

    invoke-static {v2}, Ll/۟ۚ۠;->᩹(Ll/ۚۚ۠;)Ll/ۛ֡֨;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۛ֡֨;->۟()Ll/ۤܶ۠;

    move-result-object v2

    if-eq v1, v2, :cond_0

    .line 3861
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3862
    invoke-static {p1}, Ll/۟ۚ۠;->᩹(Ll/ۚۚ۠;)Ll/ۛ֡֨;

    move-result-object v0

    sget-object v1, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 1817
    new-instance v1, Ll/۫۠۠;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const-string v0, "compiler"

    const-string v3, "import.requires.canonical"

    invoke-direct {v1, v0, v3, v2}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3861
    iget-object v0, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    invoke-virtual {v0, p1, v1}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    return-void

    .line 3870
    :cond_0
    iget-object v0, v0, Ll/ۛ᩵۠;->۬:Ll/۫᩵۠;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ۚۚ۠;Ll/֫ۤ֨;)V
    .locals 5

    .line 1548
    iget-object v0, p0, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    sget-object v1, Ll/᩶ᩴ֨;->ۢ֫:Ll/᩶ᩴ֨;

    invoke-virtual {v0, v1}, Ll/ۙᩴ֨;->֫(Ll/᩶ᩴ֨;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    sget-object v2, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    .line 1549
    invoke-virtual {v0, v2}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1550
    invoke-static {p1}, Ll/۟ۚ۠;->ۖ(Ll/ۚۚ۠;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1559
    iget-object v0, p2, Ll/֫ۤ֨;->᩹:Ll/ۚ᩵۠;

    iget-object v0, v0, Ll/ۚ᩵۠;->ۛ:Ll/ۤܶ۠;

    invoke-virtual {v0}, Ll/ۤܶ۠;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p2, p2, Ll/֫ۤ֨;->᩶:Ll/ۡ֡۠;

    if-eqz p2, :cond_0

    iget-object p2, p2, Ll/ۡ֡۠;->ۛ:Ll/ۤܶ۠;

    iget-object v0, p0, Ll/ܶ۬֨;->ܶ:Ll/ۛܶ۠;

    iget-object v0, v0, Ll/ۛܶ۠;->ᩴۧ:Ll/ۤܶ۠;

    if-ne p2, v0, :cond_0

    goto :goto_0

    .line 1551
    :cond_0
    iget-object p2, p1, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    .line 1552
    invoke-virtual {p2}, Ll/ۙ֨֨;->ۚ֫()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 1554
    iget-object p2, p1, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    iget-object v0, p2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v0, v0, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    sget-object v2, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4947
    new-instance v2, Ll/ۧܶ۠;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p2, v3, v4

    const/4 p2, 0x1

    aput-object v0, v3, p2

    const-string p2, "compiler"

    const-string v0, "raw.class.use"

    invoke-direct {v2, p2, v0, v3}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1553
    iget-object p2, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    invoke-virtual {p2, v1, p1, v2}, Ll/ۖ֨۠;->ۧ(Ll/᩶ᩴ֨;Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫(Ll/ۚۚ۠;Ll/֫ۤ֨;Ll/ܳ֡֨;)V
    .locals 5

    .line 3878
    iget-object v0, p0, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    sget-object v1, Ll/᩶ᩴ֨;->ۙ:Ll/᩶ᩴ֨;

    invoke-virtual {v0, v1}, Ll/ۙᩴ֨;->֫(Ll/᩶ᩴ֨;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1331
    invoke-virtual {p3}, Ll/ܳ֡֨;->᩶()V

    .line 1332
    iget-wide v0, p3, Ll/ۛ֡֨;->᩶:J

    const-wide v2, 0x100000000000L

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 3879
    iget-object v0, p0, Ll/ܶ۬֨;->ۗ:Ll/᩹ܽ۠;

    const/4 v1, 0x0

    .line 310
    invoke-virtual {v0, p2, p3, v1}, Ll/᩹ܽ۠;->֫(Ll/֫ۤ֨;Ll/᩶֡֨;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3880
    iget-object v0, p3, Ll/ܳ֡֨;->ᩳ֫:Ll/ᩳ᩶۠;

    iget-object p2, p2, Ll/֫ۤ֨;->۫:Ll/֨᩵۠;

    iget-object p2, p2, Ll/֨᩵۠;->ܰ:Ll/ᩳ᩶۠;

    .line 3881
    iget-object v2, p0, Ll/ܶ۬֨;->ۘ:Ll/ۧ᩶۠;

    invoke-interface {v2, v0, p2}, Ll/ۧ᩶۠;->֫(Ll/۟᩹۠;Ll/۟᩹۠;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 3883
    iget-object p2, p3, Ll/ܳ֡֨;->ᩳ֫:Ll/ᩳ᩶۠;

    .line 3884
    sget-object v0, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4115
    new-instance v0, Ll/ۧܶ۠;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p3, v2, v1

    const/4 p3, 0x1

    aput-object p2, v2, p3

    const-string p2, "compiler"

    const-string p3, "auxiliary.class.accessed.from.outside.of.its.source.file"

    invoke-direct {v0, p2, p3, v2}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3883
    iget-object p2, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    invoke-virtual {p2, p1, v0}, Ll/ۖ֨۠;->ۧ(Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۚۚ۠;Ll/֫ۤ֨;Z)V
    .locals 1

    .line 1401
    new-instance v0, Ll/۠۬֨;

    invoke-direct {v0, p0, p2}, Ll/۠۬֨;-><init>(Ll/ܶ۬֨;Ll/֫ۤ֨;)V

    const/4 p2, 0x1

    invoke-virtual {v0, p1, p3, p2}, Ll/۠۬֨;->֫(Ll/ۚۚ۠;ZZ)V

    return-void
.end method

.method public final ֫(Ll/ۚۚ۠;Ll/ۘ֡֨;Ll/ۘ֡֨;Ll/ܳ֡֨;)V
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    .line 111
    iget-wide v5, v2, Ll/ۛ֡֨;->᩶:J

    const-wide v7, 0x80001000L    # 1.060999919E-314

    and-long/2addr v7, v5

    const-wide/16 v9, 0x0

    cmp-long v11, v7, v9

    if-nez v11, :cond_19

    iget-wide v7, v3, Ll/ۛ֡֨;->᩶:J

    const-wide/16 v11, 0x1000

    and-long/2addr v11, v7

    cmp-long v13, v11, v9

    if-eqz v13, :cond_0

    goto/16 :goto_9

    :cond_0
    const-wide/16 v11, 0x8

    and-long/2addr v5, v11

    .line 1786
    iget-object v14, v1, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    const-string v15, "compiler"

    const/4 v13, 0x0

    cmp-long v17, v5, v9

    if-eqz v17, :cond_1

    and-long v5, v7, v11

    cmp-long v18, v5, v9

    if-nez v18, :cond_1

    .line 712
    invoke-static {v2, v0, v13}, Ll/۟ۚ۠;->֫(Ll/ۛ֡֨;Ll/ۚۚ۠;Z)Ll/ۚۚ۠;

    move-result-object v0

    .line 1789
    invoke-static/range {p2 .. p3}, Ll/ܶ۬֨;->֫(Ll/ۘ֡֨;Ll/ۘ֡֨;)Ll/ۨ۠۠;

    move-result-object v3

    sget-object v4, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2994
    new-instance v4, Ll/۫۠۠;

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v3, v5, v13

    const-string v3, "override.static"

    invoke-direct {v4, v15, v3, v5}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1788
    invoke-virtual {v14, v0, v4}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    .line 1790
    iget-wide v3, v2, Ll/ۛ֡֨;->᩶:J

    const-wide v5, 0x200000000000L

    or-long/2addr v3, v5

    iput-wide v3, v2, Ll/ۛ֡֨;->᩶:J

    return-void

    :cond_1
    const-wide/16 v5, 0x10

    and-long/2addr v5, v7

    const/4 v13, 0x2

    cmp-long v19, v5, v9

    if-nez v19, :cond_18

    if-nez v17, :cond_2

    and-long v5, v7, v11

    cmp-long v7, v5, v9

    if-eqz v7, :cond_2

    goto/16 :goto_8

    .line 1806
    :cond_2
    iget-object v5, v2, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    invoke-virtual {v5}, Ll/ۛ֡֨;->۬()J

    move-result-wide v5

    const-wide/16 v7, 0x2000

    and-long/2addr v5, v7

    cmp-long v7, v5, v9

    if-eqz v7, :cond_3

    goto/16 :goto_9

    .line 111
    :cond_3
    iget-wide v5, v2, Ll/ۛ֡֨;->᩶:J

    .line 1812
    invoke-static {v5, v6}, Ll/ܶ۬֨;->֫(J)I

    move-result v5

    .line 111
    iget-wide v6, v3, Ll/ۛ֡֨;->᩶:J

    .line 1812
    invoke-static {v6, v7}, Ll/ܶ۬֨;->֫(J)I

    move-result v6

    if-le v5, v6, :cond_5

    const/4 v5, 0x0

    .line 712
    invoke-static {v2, v0, v5}, Ll/۟ۚ۠;->֫(Ll/ۛ֡֨;Ll/ۚۚ۠;Z)Ll/ۚۚ۠;

    move-result-object v0

    .line 111
    iget-wide v6, v3, Ll/ۛ֡֨;->᩶:J

    const-wide/16 v11, 0x7

    and-long/2addr v6, v11

    const-string v4, "override.weaker.access"

    cmp-long v8, v6, v9

    if-nez v8, :cond_4

    .line 1815
    invoke-static/range {p2 .. p3}, Ll/ܶ۬֨;->֫(Ll/ۘ֡֨;Ll/ۘ֡֨;)Ll/ۨ۠۠;

    move-result-object v3

    sget-object v6, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 3030
    new-instance v6, Ll/۫۠۠;

    new-array v7, v13, [Ljava/lang/Object;

    aput-object v3, v7, v5

    const-string v3, "package"

    const/4 v5, 0x1

    aput-object v3, v7, v5

    invoke-direct {v6, v15, v4, v7}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    const/4 v5, 0x1

    .line 1817
    invoke-static/range {p2 .. p3}, Ll/ܶ۬֨;->֫(Ll/ۘ֡֨;Ll/ۘ֡֨;)Ll/ۨ۠۠;

    move-result-object v6

    .line 111
    iget-wide v7, v3, Ll/ۛ֡֨;->᩶:J

    and-long/2addr v7, v11

    .line 1818
    invoke-static {v7, v8}, Ll/᩵ᩴ֨;->֫(J)Ljava/util/EnumSet;

    move-result-object v3

    .line 1817
    sget-object v7, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 3021
    new-instance v7, Ll/۫۠۠;

    new-array v8, v13, [Ljava/lang/Object;

    const/4 v9, 0x0

    aput-object v6, v8, v9

    aput-object v3, v8, v5

    invoke-direct {v7, v15, v4, v8}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    move-object v6, v7

    .line 1813
    :goto_0
    invoke-virtual {v14, v0, v6}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    .line 1819
    iget-wide v3, v2, Ll/ۛ֡֨;->᩶:J

    const-wide v5, 0x200000000000L

    or-long/2addr v3, v5

    iput-wide v3, v2, Ll/ۛ֡֨;->᩶:J

    return-void

    .line 1823
    :cond_5
    iget-object v5, v4, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    iget-object v6, v1, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    invoke-virtual {v6, v2, v5}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v5

    .line 1824
    iget-object v7, v4, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v6, v3, v7}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v7

    .line 1829
    invoke-virtual {v5}, Ll/ۙ֨֨;->ܽ֫()Ll/ۖܶ۠;

    move-result-object v8

    .line 1830
    invoke-virtual {v7}, Ll/ۙ֨֨;->ܽ֫()Ll/ۖܶ۠;

    move-result-object v13

    .line 1831
    invoke-virtual {v5}, Ll/ۙ֨֨;->۟()Ll/ۙ֨֨;

    move-result-object v16

    const/16 v17, 0x2

    .line 1832
    invoke-virtual {v7}, Ll/ۙ֨֨;->۟()Ll/ۙ֨֨;

    move-result-object v9

    invoke-virtual {v6, v9, v13, v8}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۙ֨֨;

    move-result-object v9

    .line 1834
    iget-object v10, v1, Ll/ܶ۬֨;->᩸:Ll/֨᩸۠;

    invoke-virtual {v10}, Ll/֨᩸۠;->֫()V

    .line 4273
    invoke-virtual {v5}, Ll/ۙ֨֨;->۟()Ll/ۙ֨֨;

    move-result-object v11

    invoke-virtual {v6, v11, v9}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v11

    if-eqz v11, :cond_6

    goto :goto_1

    .line 4275
    :cond_6
    invoke-virtual {v5}, Ll/ۙ֨֨;->۟()Ll/ۙ֨֨;

    move-result-object v11

    invoke-virtual {v11}, Ll/ۙ֨֨;->᩵֫()Z

    move-result v11

    if-nez v11, :cond_b

    invoke-virtual {v9}, Ll/ۙ֨֨;->᩵֫()Z

    move-result v11

    if-eqz v11, :cond_7

    goto :goto_2

    :cond_7
    const/4 v11, 0x1

    .line 3255
    invoke-virtual {v6, v5, v7, v11}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۙ֨֨;Z)Z

    move-result v11

    if-eqz v11, :cond_8

    .line 4279
    invoke-virtual {v5}, Ll/ۙ֨֨;->۟()Ll/ۙ֨֨;

    move-result-object v11

    invoke-virtual {v6, v11, v9, v10}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)Z

    move-result v11

    goto :goto_3

    .line 4280
    :cond_8
    invoke-virtual {v5}, Ll/ۙ֨֨;->۟()Ll/ۙ֨֨;

    move-result-object v11

    invoke-virtual {v6, v11, v9, v10}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)Z

    move-result v11

    if-eqz v11, :cond_9

    goto :goto_1

    .line 4282
    :cond_9
    invoke-virtual {v5}, Ll/ۙ֨֨;->۟()Ll/ۙ֨֨;

    move-result-object v11

    invoke-virtual {v6, v9}, Ll/ۛ᩸֨;->ۢ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v12

    const/4 v4, 0x1

    .line 1071
    invoke-virtual {v6, v11, v12, v4}, Ll/ۛ᩸֨;->ܽ(Ll/ۙ֨֨;Ll/ۙ֨֨;Z)Z

    move-result v4

    if-nez v4, :cond_a

    goto :goto_2

    .line 4284
    :cond_a
    sget-object v4, Ll/᩶ᩴ֨;->۠֫:Ll/᩶ᩴ֨;

    invoke-virtual {v10, v4}, Ll/֨᩸۠;->ᩳ(Ll/᩶ᩴ֨;)V

    :goto_1
    const/4 v11, 0x1

    goto :goto_3

    :cond_b
    :goto_2
    const/4 v11, 0x0

    :goto_3
    const/4 v4, 0x3

    if-nez v11, :cond_d

    .line 111
    iget-wide v5, v2, Ll/ۛ֡֨;->᩶:J

    const-wide/16 v7, 0x8

    and-long/2addr v5, v7

    const-string v10, "override.incompatible.ret"

    const-wide/16 v11, 0x0

    cmp-long v13, v5, v11

    if-eqz v13, :cond_c

    iget-wide v5, v3, Ll/ۛ֡֨;->᩶:J

    and-long/2addr v5, v7

    cmp-long v7, v5, v11

    if-eqz v7, :cond_c

    const/4 v5, 0x0

    .line 712
    invoke-static {v2, v0, v5}, Ll/۟ۚ۠;->֫(Ll/ۛ֡֨;Ll/ۚۚ۠;Z)Ll/ۚۚ۠;

    move-result-object v0

    .line 1840
    invoke-virtual/range {p2 .. p2}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v6

    .line 1841
    invoke-virtual/range {p3 .. p3}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v7

    .line 1840
    sget-object v8, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 6540
    new-instance v8, Ll/ۨ۠۠;

    const/4 v11, 0x4

    new-array v11, v11, [Ljava/lang/Object;

    aput-object v2, v11, v5

    const/4 v12, 0x1

    aput-object v6, v11, v12

    aput-object v3, v11, v17

    aput-object v7, v11, v4

    const-string v3, "cant.hide"

    invoke-direct {v8, v15, v3, v11}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1840
    sget-object v3, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2940
    new-instance v3, Ll/۫۠۠;

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v8, v4, v5

    aput-object v16, v4, v12

    aput-object v9, v4, v17

    invoke-direct {v3, v15, v10, v4}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1839
    invoke-virtual {v14, v0, v3}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    .line 1842
    iget-wide v3, v2, Ll/ۛ֡֨;->᩶:J

    const-wide v5, 0x200000000000L

    or-long/2addr v3, v5

    iput-wide v3, v2, Ll/ۛ֡֨;->᩶:J

    return-void

    :cond_c
    const/4 v5, 0x0

    .line 712
    invoke-static {v2, v0, v5}, Ll/۟ۚ۠;->֫(Ll/ۛ֡֨;Ll/ۚۚ۠;Z)Ll/ۚۚ۠;

    move-result-object v0

    .line 1845
    invoke-static/range {p2 .. p3}, Ll/ܶ۬֨;->֫(Ll/ۘ֡֨;Ll/ۘ֡֨;)Ll/ۨ۠۠;

    move-result-object v3

    sget-object v6, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2940
    new-instance v6, Ll/۫۠۠;

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v3, v4, v5

    const/4 v3, 0x1

    aput-object v16, v4, v3

    aput-object v9, v4, v17

    invoke-direct {v6, v15, v10, v4}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1844
    invoke-virtual {v14, v0, v6}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    .line 1846
    iget-wide v3, v2, Ll/ۛ֡֨;->᩶:J

    const-wide v5, 0x200000000000L

    or-long/2addr v3, v5

    iput-wide v3, v2, Ll/ۛ֡֨;->᩶:J

    return-void

    .line 1849
    :cond_d
    sget-object v11, Ll/᩶ᩴ֨;->۠֫:Ll/᩶ᩴ֨;

    invoke-virtual {v10, v11}, Ll/֨᩸۠;->ۧ(Ll/᩶ᩴ֨;)Z

    move-result v10

    if-eqz v10, :cond_e

    const/4 v10, 0x0

    .line 712
    invoke-static {v2, v0, v10}, Ll/۟ۚ۠;->֫(Ll/ۛ֡֨;Ll/ۚۚ۠;Z)Ll/ۚۚ۠;

    move-result-object v10

    .line 1851
    invoke-static/range {p2 .. p3}, Ll/ܶ۬֨;->ۧ(Ll/ۘ֡֨;Ll/ۘ֡֨;)Ll/ۨ۠۠;

    move-result-object v11

    sget-object v12, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    const/4 v12, 0x0

    .line 4612
    new-instance v3, Ll/ۧܶ۠;

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v11, v4, v12

    const/4 v11, 0x1

    aput-object v16, v4, v11

    aput-object v9, v4, v17

    const-string v9, "override.unchecked.ret"

    invoke-direct {v3, v15, v9, v4}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1850
    invoke-virtual {v1, v10, v3}, Ll/ܶ۬֨;->ۧ(Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    .line 1856
    :cond_e
    invoke-virtual {v7}, Ll/ۙ֨֨;->ۧ֫()Ll/ۖܶ۠;

    move-result-object v3

    invoke-virtual {v6, v3, v13, v8}, Ll/ۛ᩸֨;->֫(Ll/ۖܶ۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v3

    .line 1857
    invoke-virtual {v5}, Ll/ۙ֨֨;->ۧ֫()Ll/ۖܶ۠;

    move-result-object v4

    invoke-virtual {v6, v3}, Ll/ۛ᩸֨;->ۧ(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v7

    invoke-virtual {v1, v4, v7}, Ll/ܶ۬֨;->ᩳ(Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v4

    .line 1858
    invoke-virtual {v5}, Ll/ۙ֨֨;->ۧ֫()Ll/ۖܶ۠;

    move-result-object v5

    invoke-virtual {v1, v5, v3}, Ll/ܶ۬֨;->ᩳ(Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v3

    .line 1859
    invoke-virtual {v4}, Ll/ۖܶ۠;->ܽ()Z

    move-result v4

    if-eqz v4, :cond_f

    const/4 v4, 0x0

    .line 712
    invoke-static {v2, v0, v4}, Ll/۟ۚ۠;->֫(Ll/ۛ֡֨;Ll/ۚۚ۠;Z)Ll/ۚۚ۠;

    move-result-object v0

    .line 1861
    invoke-static/range {p2 .. p3}, Ll/ܶ۬֨;->֫(Ll/ۘ֡֨;Ll/ۘ֡֨;)Ll/ۨ۠۠;

    move-result-object v5

    iget-object v3, v3, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v3, Ll/ۙ֨֨;

    sget-object v6, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2976
    new-instance v6, Ll/۫۠۠;

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v5, v7, v4

    const/4 v4, 0x1

    aput-object v3, v7, v4

    const-string v3, "override.meth.doesnt.throw"

    invoke-direct {v6, v15, v3, v7}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1860
    invoke-virtual {v14, v0, v6}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    .line 1862
    iget-wide v3, v2, Ll/ۛ֡֨;->᩶:J

    const-wide v5, 0x200000000000L

    or-long/2addr v3, v5

    iput-wide v3, v2, Ll/ۛ֡֨;->᩶:J

    return-void

    :cond_f
    const/4 v4, 0x0

    .line 1865
    invoke-virtual {v3}, Ll/ۖܶ۠;->ܽ()Z

    move-result v5

    if-eqz v5, :cond_10

    .line 712
    invoke-static {v2, v0, v4}, Ll/۟ۚ۠;->֫(Ll/ۛ֡֨;Ll/ۚۚ۠;Z)Ll/ۚۚ۠;

    move-result-object v0

    .line 1867
    invoke-static/range {p2 .. p3}, Ll/ܶ۬֨;->֫(Ll/ۘ֡֨;Ll/ۘ֡֨;)Ll/ۨ۠۠;

    move-result-object v2

    iget-object v3, v3, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v3, Ll/ۙ֨֨;

    sget-object v5, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4630
    new-instance v5, Ll/ۧܶ۠;

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v2, v6, v4

    const/4 v2, 0x1

    aput-object v3, v6, v2

    const-string v2, "override.unchecked.thrown"

    invoke-direct {v5, v15, v2, v6}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1866
    invoke-virtual {v1, v0, v5}, Ll/ܶ۬֨;->ۧ(Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    return-void

    .line 111
    :cond_10
    iget-wide v3, v2, Ll/ۛ֡֨;->᩶:J

    move-object/from16 v5, p3

    iget-wide v7, v5, Ll/ۛ֡֨;->᩶:J

    xor-long/2addr v3, v7

    const-wide v7, 0x400000000L

    and-long/2addr v3, v7

    const-wide/16 v9, 0x0

    cmp-long v11, v3, v9

    if-eqz v11, :cond_12

    .line 1872
    iget-object v3, v1, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    sget-object v4, Ll/᩶ᩴ֨;->ܳ֫:Ll/᩶ᩴ֨;

    .line 1873
    invoke-virtual {v3, v4}, Ll/ۙᩴ֨;->֫(Ll/᩶ᩴ֨;)Z

    move-result v3

    if-eqz v3, :cond_12

    const/4 v3, 0x0

    .line 712
    invoke-static {v2, v0, v3}, Ll/۟ۚ۠;->֫(Ll/ۛ֡֨;Ll/ۚۚ۠;Z)Ll/ۚۚ۠;

    move-result-object v4

    .line 111
    iget-wide v11, v2, Ll/ۛ֡֨;->᩶:J

    and-long/2addr v7, v11

    cmp-long v11, v7, v9

    if-eqz v11, :cond_11

    .line 1876
    invoke-static/range {p2 .. p3}, Ll/ܶ۬֨;->ܽ(Ll/ۘ֡֨;Ll/ۘ֡֨;)Ll/ۨ۠۠;

    move-result-object v7

    sget-object v8, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4662
    new-instance v8, Ll/ۧܶ۠;

    const/4 v9, 0x1

    new-array v9, v9, [Ljava/lang/Object;

    aput-object v7, v9, v3

    const-string v3, "override.varargs.missing"

    invoke-direct {v8, v15, v3, v9}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_4

    :cond_11
    const/4 v7, 0x1

    .line 1877
    invoke-static/range {p2 .. p3}, Ll/ܶ۬֨;->ܽ(Ll/ۘ֡֨;Ll/ۘ֡֨;)Ll/ۨ۠۠;

    move-result-object v8

    sget-object v9, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4646
    new-instance v9, Ll/ۧܶ۠;

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v8, v7, v3

    const-string v3, "override.varargs.extra"

    invoke-direct {v9, v15, v3, v7}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    move-object v8, v9

    .line 1874
    :goto_4
    invoke-virtual {v14, v4, v8}, Ll/ۖ֨۠;->ۧ(Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    .line 111
    :cond_12
    iget-wide v3, v5, Ll/ۛ֡֨;->᩶:J

    const-wide v7, 0x80000000L

    and-long/2addr v3, v7

    const-wide/16 v7, 0x0

    cmp-long v9, v3, v7

    if-eqz v9, :cond_13

    const/4 v3, 0x0

    .line 712
    invoke-static {v2, v0, v3}, Ll/۟ۚ۠;->֫(Ll/ۛ֡֨;Ll/ۚۚ۠;Z)Ll/ۚۚ۠;

    move-result-object v4

    .line 1883
    invoke-static/range {p2 .. p3}, Ll/ܶ۬֨;->ۧ(Ll/ۘ֡֨;Ll/ۘ֡֨;)Ll/ۨ۠۠;

    move-result-object v7

    sget-object v8, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4586
    new-instance v8, Ll/ۧܶ۠;

    const/4 v9, 0x1

    new-array v9, v9, [Ljava/lang/Object;

    aput-object v7, v9, v3

    const-string v3, "override.bridge"

    invoke-direct {v8, v15, v3, v9}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1882
    invoke-virtual {v14, v4, v8}, Ll/ۖ֨۠;->ۧ(Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    .line 1905
    :cond_13
    invoke-virtual/range {p3 .. p3}, Ll/ۛ֡֨;->ۙ()Ll/ܳ֡֨;

    move-result-object v3

    move-object/from16 v4, p4

    .line 1906
    iget-object v7, v4, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v6, v7}, Ll/ۛ᩸֨;->᩸(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v7

    .line 1907
    sget-object v8, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    invoke-virtual {v7, v8}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v8

    if-nez v8, :cond_14

    goto :goto_5

    .line 1909
    :cond_14
    iget-object v7, v7, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    check-cast v7, Ll/ܳ֡֨;

    const/4 v8, 0x0

    invoke-virtual {v5, v7, v6, v8}, Ll/ۘ֡֨;->֫(Ll/᩶֡֨;Ll/ۛ᩸֨;Z)Ll/ۘ֡֨;

    move-result-object v7

    if-eqz v3, :cond_16

    .line 1331
    invoke-virtual {v3}, Ll/ܳ֡֨;->᩶()V

    .line 1332
    iget-wide v8, v3, Ll/ۛ֡֨;->᩶:J

    const-wide/16 v10, 0x200

    and-long/2addr v8, v10

    const-wide/16 v10, 0x0

    cmp-long v12, v8, v10

    if-eqz v12, :cond_16

    .line 1912
    iget-object v4, v4, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v6, v4}, Ll/ۛ᩸֨;->ۖ(Ll/ۙ֨֨;)Ll/ۖܶ۠;

    move-result-object v4

    .line 1913
    iget-object v3, v3, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v4, v3}, Ll/ۖܶ۠;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_15

    goto :goto_6

    :cond_15
    if-eqz v7, :cond_17

    goto :goto_5

    :cond_16
    if-eq v7, v5, :cond_17

    :goto_5
    const/4 v3, 0x1

    goto :goto_7

    :cond_17
    :goto_6
    const/4 v3, 0x0

    :goto_7
    if-nez v3, :cond_19

    .line 1888
    iget-object v3, v1, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    invoke-virtual {v3, v2}, Ll/ۙᩴ֨;->֫(Ll/ۛ֡֨;)Ll/ۙᩴ֨;

    move-result-object v3

    .line 212
    iget-object v4, v1, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    .line 213
    iput-object v3, v1, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    .line 1890
    :try_start_0
    new-instance v3, Ll/۬ۗ֨;

    invoke-direct {v3, v2, v0}, Ll/۬ۗ֨;-><init>(Ll/ۘ֡֨;Ll/ۚۚ۠;)V

    invoke-virtual {v1, v3, v2, v5}, Ll/ܶ۬֨;->֫(Ljava/util/function/Supplier;Ll/ۛ֡֨;Ll/ۛ֡֨;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 213
    iput-object v4, v1, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    return-void

    :catchall_0
    move-exception v0

    iput-object v4, v1, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    .line 1893
    throw v0

    :cond_18
    :goto_8
    move-object v5, v3

    const/4 v3, 0x0

    .line 712
    invoke-static {v2, v0, v3}, Ll/۟ۚ۠;->֫(Ll/ۛ֡֨;Ll/ۚۚ۠;Z)Ll/ۚۚ۠;

    move-result-object v0

    .line 1800
    invoke-static/range {p2 .. p3}, Ll/ܶ۬֨;->֫(Ll/ۘ֡֨;Ll/ۘ֡֨;)Ll/ۨ۠۠;

    move-result-object v4

    .line 111
    iget-wide v5, v5, Ll/ۛ֡֨;->᩶:J

    const-wide/16 v7, 0x18

    and-long/2addr v5, v7

    .line 1801
    invoke-static {v5, v6}, Ll/᩵ᩴ֨;->֫(J)Ljava/util/EnumSet;

    move-result-object v5

    .line 1800
    sget-object v6, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2958
    new-instance v6, Ll/۫۠۠;

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v4, v7, v3

    const/4 v3, 0x1

    aput-object v5, v7, v3

    const-string v3, "override.meth"

    invoke-direct {v6, v15, v3, v7}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1799
    invoke-virtual {v14, v0, v6}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    .line 1802
    iget-wide v3, v2, Ll/ۛ֡֨;->᩶:J

    const-wide v5, 0x200000000000L

    or-long/2addr v3, v5

    iput-wide v3, v2, Ll/ۛ֡֨;->᩶:J

    :cond_19
    :goto_9
    return-void
.end method

.method public final ֫(Ll/ۚۚ۠;Ll/ܳ֡֨;)V
    .locals 9

    .line 2170
    iget-object v0, p0, Ll/ܶ۬֨;->ۤ:Ll/᩷ۚ֨;

    iget-object v1, v0, Ll/᩷ۚ֨;->᩸֫:Ll/ۙ֨֨;

    iget-object v2, v0, Ll/᩷ۚ֨;->᩸֫:Ll/ۙ֨֨;

    iget-object v1, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    check-cast v1, Ll/ܳ֡֨;

    if-eq p2, v1, :cond_4

    .line 2171
    invoke-virtual {p2}, Ll/ۛ֡֨;->ۘ֫()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p2}, Ll/ۛ֡֨;->ܺ֫()Z

    move-result v1

    if-nez v1, :cond_4

    .line 1331
    invoke-virtual {p2}, Ll/ܳ֡֨;->᩶()V

    .line 1332
    iget-wide v3, p2, Ll/ۛ֡֨;->᩶:J

    const-wide/16 v5, 0x2000

    and-long/2addr v3, v5

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-nez v1, :cond_4

    .line 1331
    invoke-virtual {p2}, Ll/ܳ֡֨;->᩶()V

    .line 1332
    iget-wide v3, p2, Ll/ۛ֡֨;->᩶:J

    const-wide/16 v7, 0x400

    and-long/2addr v3, v7

    cmp-long v1, v3, v5

    if-eqz v1, :cond_0

    goto/16 :goto_2

    .line 453
    :cond_0
    iget-object v1, p2, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {v1}, Ll/ۤܶ۠;->isEmpty()Z

    move-result v1

    .line 2175
    iget-object v3, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    if-eqz v1, :cond_1

    .line 2176
    iget-object v1, p2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v3, v1}, Ll/ۛ᩸֨;->ۖ(Ll/ۙ֨֨;)Ll/ۖܶ۠;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 2177
    invoke-virtual {v1}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    iget-object v1, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v1, Ll/ۙ֨֨;

    iget-object v1, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v0, v0, Ll/᩷ۚ֨;->ۚ:Ll/ۙ֨֨;

    iget-object v0, v0, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    if-ne v1, v0, :cond_1

    goto :goto_2

    .line 2185
    :cond_1
    iget-object v0, p0, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    sget-object v1, Ll/᩶ᩴ֨;->ܳ֫:Ll/᩶ᩴ֨;

    invoke-virtual {v0, v1}, Ll/ۙᩴ֨;->֫(Ll/᩶ᩴ֨;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2186
    iget-object v0, v2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 2187
    invoke-virtual {v0}, Ll/ۛ֡֨;->֨֫()Ll/ܰ᩵֨;

    move-result-object v0

    iget-object v4, p0, Ll/ܶ۬֨;->ܶ:Ll/ۛܶ۠;

    iget-object v5, v4, Ll/ۛܶ۠;->ܿۧ:Ll/ۤܶ۠;

    const/4 v6, 0x0

    .line 120
    invoke-virtual {v0, v5, v6}, Ll/۟᩵֨;->֫(Ll/ۤܶ۠;Ljava/util/function/Predicate;)Ll/ۛ֡֨;

    move-result-object v0

    .line 2187
    check-cast v0, Ll/ۘ֡֨;

    .line 2188
    iget-object v2, v2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 2189
    invoke-virtual {v2}, Ll/ۛ֡֨;->֨֫()Ll/ܰ᩵֨;

    move-result-object v2

    iget-object v4, v4, Ll/ۛܶ۠;->ۖۧ:Ll/ۤܶ۠;

    .line 120
    invoke-virtual {v2, v4, v6}, Ll/۟᩵֨;->֫(Ll/ۤܶ۠;Ljava/util/function/Predicate;)Ll/ۛ֡֨;

    move-result-object v2

    .line 2189
    check-cast v2, Ll/ۘ֡֨;

    const/4 v4, 0x0

    .line 2190
    iget-object v5, p0, Ll/ܶ۬֨;->ۖ:Ll/ۙۛܽ;

    invoke-virtual {v3, v0, p2, v4, v5}, Ll/ۛ᩸֨;->֫(Ll/ۘ֡֨;Ll/᩶֡֨;ZLjava/util/function/Predicate;)Ll/ۘ֡֨;

    move-result-object v0

    const/4 v6, 0x1

    if-eqz v0, :cond_2

    .line 2192
    iget-object v0, v0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    if-ne v0, p2, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 2194
    :goto_0
    invoke-virtual {v3, v2, p2, v4, v5}, Ll/ۛ᩸֨;->֫(Ll/ۘ֡֨;Ll/᩶֡֨;ZLjava/util/function/Predicate;)Ll/ۘ֡֨;

    move-result-object v3

    if-eq v3, v2, :cond_3

    const/4 v2, 0x1

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    if-eqz v0, :cond_4

    if-nez v2, :cond_4

    .line 2199
    sget-object v0, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4594
    new-instance v0, Ll/ۧܶ۠;

    new-array v2, v6, [Ljava/lang/Object;

    aput-object p2, v2, v4

    const-string p2, "compiler"

    const-string v3, "override.equals.but.not.hashcode"

    invoke-direct {v0, p2, v3, v2}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2198
    iget-object p2, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    invoke-virtual {p2, v1, p1, v0}, Ll/ۖ֨۠;->ۧ(Ll/᩶ᩴ֨;Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    :cond_4
    :goto_2
    return-void
.end method

.method public final ֫(Ll/ۚۚ۠;Ll/ܳ֡֨;Ll/ܳ֡֨;)V
    .locals 12

    .line 2464
    iget-object p3, p3, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    iget-object v0, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    invoke-virtual {v0, p3}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;)Ll/ۖܶ۠;

    move-result-object p3

    :goto_0
    invoke-virtual {p3}, Ll/ۖܶ۠;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 2465
    iget-object v1, p3, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v1, Ll/ۙ֨֨;

    iget-object v1, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    check-cast v1, Ll/ܳ֡֨;

    .line 1331
    invoke-virtual {v1}, Ll/ܳ֡֨;->᩶()V

    .line 1332
    iget-wide v2, v1, Ll/ۛ֡֨;->᩶:J

    const-wide/16 v4, 0x400

    and-long/2addr v2, v4

    const-wide/16 v6, 0x0

    cmp-long v8, v2, v6

    if-eqz v8, :cond_1

    .line 1336
    invoke-virtual {v1}, Ll/ܳ֡֨;->᩶()V

    .line 1337
    iget-object v1, v1, Ll/ܳ֡֨;->֫֫:Ll/ܰ᩵֨;

    .line 2467
    sget-object v2, Ll/֨᩵֨;->᩹:Ll/֨᩵֨;

    const/4 v3, 0x0

    .line 82
    invoke-virtual {v1, v3, v2}, Ll/۟᩵֨;->֫(Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;

    move-result-object v1

    .line 2467
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛ֡֨;

    .line 2468
    iget-object v3, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v6, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-ne v3, v6, :cond_0

    .line 2469
    invoke-virtual {v2}, Ll/ۛ֡֨;->۬()J

    move-result-wide v6

    const-wide/16 v8, 0x408

    and-long/2addr v6, v8

    cmp-long v3, v6, v4

    if-nez v3, :cond_0

    .line 2470
    check-cast v2, Ll/ۘ֡֨;

    const/4 v3, 0x0

    .line 2471
    invoke-virtual {v2, p2, v0, v3}, Ll/ۘ֡֨;->֫(Ll/᩶֡֨;Ll/ۛ᩸֨;Z)Ll/ۘ֡֨;

    move-result-object v3

    if-eqz v3, :cond_0

    if-eq v3, v2, :cond_0

    .line 2472
    iget-object v6, v3, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    .line 2473
    invoke-virtual {v6}, Ll/ۛ֡֨;->۬()J

    move-result-wide v6

    const-wide/16 v8, 0x200

    and-long/2addr v6, v8

    .line 1331
    invoke-virtual {p2}, Ll/ܳ֡֨;->᩶()V

    .line 1332
    iget-wide v10, p2, Ll/ۛ֡֨;->᩶:J

    and-long/2addr v8, v10

    cmp-long v10, v6, v8

    if-nez v10, :cond_0

    .line 2481
    invoke-virtual {p0, p1, v3, v2, p2}, Ll/ܶ۬֨;->֫(Ll/ۚۚ۠;Ll/ۘ֡֨;Ll/ۘ֡֨;Ll/ܳ֡֨;)V

    goto :goto_1

    .line 2464
    :cond_1
    iget-object p3, p3, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ֫(Ll/ۚ᩵۠;)V
    .locals 7

    .line 3668
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 3671
    iget-object v1, p1, Ll/ۚ᩵۠;->ۗ:Ll/ۖܶ۠;

    :goto_0
    invoke-virtual {v1}, Ll/ۖܶ۠;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 3672
    iget-object v2, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v2, Ll/ۚۚ۠;

    invoke-static {v2}, Ll/۟ۚ۠;->ܿ(Ll/ۚۚ۠;)Ll/ܺ֡۠;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_1

    .line 3674
    :cond_0
    iget-object v3, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v3, Ll/ۡ֡۠;

    .line 3675
    iget-object v4, v2, Ll/ܺ֡۠;->۫:Ll/۫᩵۠;

    invoke-static {v4}, Ll/۟ۚ۠;->ܶ(Ll/ۚۚ۠;)Ll/ۤܶ۠;

    move-result-object v4

    iget-object v5, p0, Ll/ܶ۬֨;->ܶ:Ll/ۛܶ۠;

    iget-object v5, v5, Ll/ۛܶ۠;->᩶֫:Ll/ۤܶ۠;

    if-ne v4, v5, :cond_1

    .line 3676
    iget-object v3, v3, Ll/ۡ֡۠;->۟:Ll/ۘ֡֨;

    iget-object v2, v2, Ll/ܺ֡۠;->۫:Ll/۫᩵۠;

    invoke-static {v2}, Ll/۟ۚ۠;->᩹(Ll/ۚۚ۠;)Ll/ۛ֡֨;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 3678
    :cond_1
    iget-object v2, v3, Ll/ۡ֡۠;->۟:Ll/ۘ֡֨;

    iget-wide v3, v2, Ll/ۛ֡֨;->᩶:J

    const-wide/32 v5, 0x40000000

    or-long/2addr v3, v5

    iput-wide v3, v2, Ll/ۛ֡֨;->᩶:J

    .line 3671
    :goto_1
    iget-object v1, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    new-array v2, v1, [Ll/ۛ֡֨;

    .line 3684
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ll/ۛ֡֨;

    .line 3685
    array-length v3, v2

    :goto_2
    if-ge v1, v3, :cond_3

    aget-object v4, v2, v1

    .line 3686
    invoke-direct {p0, p1, v4, v0}, Ll/ܶ۬֨;->֫(Ll/ۚ᩵۠;Ll/ۛ֡֨;Ljava/util/HashMap;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_3
    return-void
.end method

.method public final ֫(Ll/ۚ᩵۠;Ll/ܳ֡֨;)V
    .locals 5

    .line 3984
    iget-object v0, p0, Ll/ܶ۬֨;->ۤ:Ll/᩷ۚ֨;

    iget-object v1, v0, Ll/᩷ۚ֨;->ۛ:Ll/ۙ֨֨;

    iget-object v1, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {p2, v1}, Ll/ۛ֡֨;->֫(Ll/ۛ֡֨;)Ll/ܽۘ֨;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 3988
    :try_start_0
    iget-object v1, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    invoke-virtual {v1, p2}, Ll/ۛ᩸֨;->֫(Ll/᩶֡֨;)Ll/ۛ֡֨;
    :try_end_0
    .catch Ll/ۛܶ֨; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p2

    .line 3990
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 843
    iget-object v1, p1, Ll/ۚ᩵۠;->ۤ:Ll/ۖ֡۠;

    .line 3991
    iget-object v1, v1, Ll/ۖ֡۠;->ۗ:Ll/ۖܶ۠;

    invoke-virtual {v1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܿ᩵۠;

    .line 3992
    iget-object v3, v2, Ll/ܿ᩵۠;->ۗ:Ll/ۚۚ۠;

    iget-object v3, v3, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    iget-object v3, v3, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v4, v0, Ll/᩷ۚ֨;->ۛ:Ll/ۙ֨֨;

    iget-object v4, v4, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    if-ne v3, v4, :cond_0

    move-object p1, v2

    .line 3997
    :cond_1
    invoke-virtual {p2}, Ll/ۛܶ֨;->֫()Ll/ܽܶ۠;

    move-result-object p2

    sget-object v0, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 282
    new-instance v0, Ll/۫۠۠;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const-string p2, "compiler"

    const-string v2, "bad.functional.intf.anno.1"

    invoke-direct {v0, p2, v2, v1}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3997
    iget-object p2, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    invoke-virtual {p2, p1, v0}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    :cond_2
    return-void
.end method

.method public final ֫(Ll/ۚ᩵۠;Ll/ܳ֡֨;Ll/ܰ᩵֨;)V
    .locals 3

    .line 406
    iget-object v0, p2, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {p3, v0}, Ll/۟᩵֨;->֫(Ll/ۤܶ۠;)Ljava/lang/Iterable;

    move-result-object p3

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛ֡֨;

    .line 407
    iget-object v1, v0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v2, p2, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    if-eq v1, v2, :cond_1

    goto :goto_0

    .line 408
    :cond_1
    iget-object v1, v0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v2, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-ne v1, v2, :cond_0

    iget-object v1, v0, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    sget-object v2, Ll/ۢ۠֨;->ۢ֫:Ll/ۢ۠֨;

    invoke-virtual {v1, v2}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, v0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v1, v1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v2, Ll/ܶᩴ֨;->ܺ:Ll/ܶᩴ֨;

    .line 409
    invoke-virtual {v1, v2}, Ll/֨ᩴ֨;->֫(Ll/ܶᩴ֨;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p2, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v2, p0, Ll/ܶ۬֨;->ܶ:Ll/ۛܶ۠;

    iget-object v2, v2, Ll/ۛܶ۠;->ܳۧ:Ll/ۤܶ۠;

    if-eq v1, v2, :cond_0

    .line 411
    invoke-virtual {p0, p1, v0}, Ll/ܶ۬֨;->֫(Ll/ۗ۠۠;Ll/ۛ֡֨;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final ֫(Ll/ۛ֡֨;Ll/ۚۚ۠;)V
    .locals 8

    .line 3537
    iget-object v0, p0, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    sget-object v1, Ll/᩶ᩴ֨;->ۤ:Ll/᩶ᩴ֨;

    invoke-virtual {v0, v1}, Ll/ۙᩴ֨;->֫(Ll/᩶ᩴ֨;)Z

    move-result v0

    iget-object v2, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    iget-object v3, p0, Ll/ܶ۬֨;->ۤ:Ll/᩷ۚ֨;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ll/ۛ֡֨;->᩷֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3538
    invoke-virtual {p1}, Ll/ۛ֡֨;->۬()J

    move-result-wide v4

    const-wide/32 v6, 0x20000

    and-long/2addr v4, v6

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-eqz v0, :cond_0

    iget-object v0, v3, Ll/᩷ۚ֨;->֨:Ll/ۙ֨֨;

    .line 3539
    invoke-virtual {v0}, Ll/ۙ֨֨;->᩻֫()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, v3, Ll/᩷ۚ֨;->֨:Ll/ۙ֨֨;

    iget-object v0, v0, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 3540
    invoke-virtual {p1, v0}, Ll/ۛ֡֨;->֫(Ll/ۛ֡֨;)Ll/ܽۘ֨;

    move-result-object v0

    if-nez v0, :cond_0

    .line 3541
    sget-object v0, Ll/ܰᩴ۠;->ܺ:Ll/ۧܶ۠;

    invoke-virtual {v2, v1, p2, v0}, Ll/ۖ֨۠;->ۧ(Ll/᩶ᩴ֨;Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    .line 3545
    :cond_0
    iget-object v0, p0, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    sget-object v1, Ll/᩶ᩴ֨;->۫:Ll/᩶ᩴ֨;

    invoke-virtual {v0, v1}, Ll/ۙᩴ֨;->֫(Ll/᩶ᩴ֨;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ll/ۛ֡֨;->᩷֫()Z

    move-result v0

    if-nez v0, :cond_1

    .line 3546
    iget-object v0, v3, Ll/᩷ۚ֨;->֨:Ll/ۙ֨֨;

    invoke-virtual {v0}, Ll/ۙ֨֨;->᩻֫()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, v3, Ll/᩷ۚ֨;->֨:Ll/ۙ֨֨;

    iget-object v0, v0, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {p1, v0}, Ll/ۛ֡֨;->֫(Ll/ۛ֡֨;)Ll/ܽۘ֨;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3548
    invoke-static {p1}, Ll/᩸ᩴ֨;->֫(Ll/ۛ֡֨;)Ll/۠ᩴ֨;

    move-result-object p1

    sget-object v0, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4207
    new-instance v0, Ll/ۧܶ۠;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const-string p1, "compiler"

    const-string v4, "deprecated.annotation.has.no.effect"

    invoke-direct {v0, p1, v4, v3}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3547
    invoke-virtual {v2, v1, p2, v0}, Ll/ۖ֨۠;->ۧ(Ll/᩶ᩴ֨;Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ۛ֡֨;Ll/ۚۚ۠;Ll/ۖܶ۠;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 2920
    invoke-virtual/range {p3 .. p3}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_19

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܿ᩵۠;

    .line 2867
    new-instance v5, Ll/ۜ۬֨;

    invoke-direct {v5, v0}, Ll/ۜ۬֨;-><init>(Ll/ܶ۬֨;)V

    invoke-virtual {v4, v5}, Ll/ܿ᩵۠;->֫(Ll/֡ۚ۠;)V

    .line 2938
    iget-wide v5, v1, Ll/ۛ֡֨;->᩶:J

    const-wide/high16 v7, 0x2000000000000000L

    and-long/2addr v5, v7

    const/4 v9, 0x1

    const-wide/16 v10, 0x0

    cmp-long v12, v5, v10

    if-nez v12, :cond_2

    invoke-virtual/range {p1 .. p1}, Ll/ۛ֡֨;->ۙ()Ll/ܳ֡֨;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual/range {p1 .. p1}, Ll/ۛ֡֨;->ۙ()Ll/ܳ֡֨;

    move-result-object v5

    invoke-virtual {v5}, Ll/ܳ֡֨;->ۨ֫()Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v5, 0x1

    .line 2940
    :goto_2
    iget-wide v12, v1, Ll/ۛ֡֨;->᩶:J

    and-long v6, v7, v12

    cmp-long v8, v6, v10

    if-eqz v8, :cond_3

    sget-object v6, Ll/ᩴۚ۠;->᩹ܽ:Ll/ᩴۚ۠;

    .line 2941
    invoke-virtual {v2, v6}, Ll/ۚۚ۠;->֫(Ll/ᩴۚ۠;)Z

    move-result v6

    if-eqz v6, :cond_3

    iget-object v6, v1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v6, v6, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v7, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-ne v6, v7, :cond_3

    const/4 v6, 0x1

    goto :goto_3

    :cond_3
    const/4 v6, 0x0

    :goto_3
    const/4 v7, 0x2

    .line 2944
    iget-object v8, v0, Ll/ܶ۬֨;->ܶ:Ll/ۛܶ۠;

    iget-object v12, v0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    if-eqz v6, :cond_a

    .line 3315
    iget-object v13, v4, Ll/ܿ᩵۠;->ۗ:Ll/ۚۚ۠;

    iget-object v13, v13, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    iget-object v13, v13, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v0, v13}, Ll/ܶ۬֨;->ۧ(Ll/᩶֡֨;)[Ll/ۤܶ۠;

    move-result-object v13

    .line 2948
    array-length v14, v13

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/4 v15, 0x0

    :goto_4
    if-ge v15, v14, :cond_7

    aget-object v10, v13, v15

    .line 2949
    iget-object v11, v8, Ll/ۛܶ۠;->ۚ:Ll/ۤܶ۠;

    if-eq v10, v11, :cond_5

    iget-object v11, v8, Ll/ۛܶ۠;->ܰ:Ll/ۤܶ۠;

    if-eq v10, v11, :cond_5

    iget-object v11, v8, Ll/ۛܶ۠;->᩶:Ll/ۤܶ۠;

    if-eq v10, v11, :cond_5

    iget-object v11, v8, Ll/ۛܶ۠;->֨֫:Ll/ۤܶ۠;

    if-eq v10, v11, :cond_5

    iget-object v11, v8, Ll/ۛܶ۠;->֫֫:Ll/ۤܶ۠;

    if-ne v10, v11, :cond_4

    goto :goto_5

    :cond_4
    const/4 v10, 0x0

    const/16 v17, 0x0

    goto :goto_6

    :cond_5
    :goto_5
    const/4 v10, 0x1

    const/16 v17, 0x1

    :goto_6
    if-eqz v17, :cond_6

    goto :goto_7

    :cond_6
    add-int/lit8 v15, v15, 0x1

    const-wide/16 v10, 0x0

    goto :goto_4

    :cond_7
    :goto_7
    if-nez v17, :cond_8

    .line 2960
    sget-object v10, Ll/ۛᩴ۠;->ᩳ:Ll/۫۠۠;

    invoke-virtual {v12, v4, v10}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    goto :goto_8

    .line 2965
    :cond_8
    iget-object v10, v1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    check-cast v10, Ll/ܳ֡֨;

    .line 2966
    move-object v11, v1

    check-cast v11, Ll/۫֡֨;

    invoke-virtual {v10, v11}, Ll/ܳ֡֨;->֫(Ll/۫֡֨;)Ll/᩸֡֨;

    move-result-object v10

    .line 2967
    invoke-virtual {v10}, Ll/ۛ֡֨;->ܰ()Ll/ۨ֡֨;

    move-result-object v11

    if-eqz v11, :cond_9

    .line 2968
    invoke-virtual {v11}, Ll/ۨ֡֨;->ܿ()Z

    move-result v11

    if-eqz v11, :cond_a

    .line 2972
    :cond_9
    invoke-virtual/range {p1 .. p1}, Ll/ۛ֡֨;->֫֫()Ll/ۖܶ۠;

    move-result-object v11

    invoke-static {v11}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v11

    new-instance v13, Ll/ۗܿۢ;

    invoke-direct {v13, v7, v0}, Ll/ۗܿۢ;-><init>(ILjava/lang/Object;)V

    invoke-interface {v11, v13}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v11

    .line 2974
    invoke-static {}, Ll/ۖܶ۠;->ܿ()Ll/ۨۨᩴ;

    move-result-object v13

    invoke-interface {v11, v13}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ۖܶ۠;

    .line 2972
    invoke-virtual {v10, v11}, Ll/ۛ֡֨;->֫(Ll/ۖܶ۠;)V

    :cond_a
    :goto_8
    const/4 v15, 0x0

    .line 3034
    iget-object v10, v4, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    iget-object v10, v10, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v10}, Ll/᩶֡֨;->᩶֫()Z

    move-result v10

    const-string v11, "compiler"

    iget-object v13, v0, Ll/ܶ۬֨;->ۤ:Ll/᩷ۚ֨;

    if-eqz v10, :cond_16

    .line 3035
    invoke-virtual {v0, v4, v1}, Ll/ܶ۬֨;->֫(Ll/ܿ᩵۠;Ll/ۛ֡֨;)Ll/ܽ۫ᩴ;

    move-result-object v10

    .line 3036
    invoke-virtual {v10}, Ll/ܽ۫ᩴ;->isEmpty()Z

    move-result v14

    if-nez v14, :cond_16

    .line 3037
    invoke-virtual {v10}, Ll/ܽ۫ᩴ;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Set;

    .line 3038
    invoke-interface {v10}, Ljava/util/Set;->isEmpty()Z

    move-result v14

    if-nez v14, :cond_c

    .line 3039
    invoke-interface {v10}, Ljava/util/Set;->size()I

    move-result v14

    if-ne v14, v9, :cond_b

    iget-object v8, v8, Ll/ۛܶ۠;->֨֫:Ll/ۤܶ۠;

    invoke-interface {v10, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    goto :goto_9

    :cond_b
    const/4 v8, 0x0

    goto :goto_a

    :cond_c
    :goto_9
    const/4 v8, 0x1

    :goto_a
    if-eqz v5, :cond_d

    move-object v5, v10

    .line 3040
    iget-wide v9, v1, Ll/ۛ֡֨;->᩶:J

    const-wide/32 v16, 0x1000000

    and-long v9, v9, v16

    const-wide/16 v16, 0x0

    cmp-long v14, v9, v16

    if-eqz v14, :cond_e

    const/4 v9, 0x1

    goto :goto_b

    :cond_d
    move-object v5, v10

    :cond_e
    const/4 v9, 0x0

    :goto_b
    if-eqz v9, :cond_f

    if-eqz v8, :cond_f

    const/4 v8, 0x1

    goto :goto_c

    :cond_f
    const/4 v8, 0x0

    .line 3043
    :goto_c
    invoke-interface {v5}, Ljava/util/Set;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_10

    if-eqz v8, :cond_15

    :cond_10
    if-eqz v8, :cond_14

    .line 3049
    invoke-static/range {p2 .. p2}, Ll/۟ۚ۠;->᩷(Ll/ۚۚ۠;)Ll/ۖ֡۠;

    move-result-object v8

    if-eqz v8, :cond_13

    .line 3053
    invoke-interface {v5}, Ljava/util/Set;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_13

    .line 3054
    new-instance v5, Ll/ᩴܶ۠;

    invoke-direct {v5}, Ll/ᩴܶ۠;-><init>()V

    .line 3055
    iget-object v10, v8, Ll/ۖ֡۠;->ۗ:Ll/ۖܶ۠;

    invoke-virtual {v10}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_11
    :goto_d
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_12

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/ܿ᩵۠;

    if-eq v14, v4, :cond_11

    .line 227
    invoke-virtual {v5, v14}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_d

    .line 3060
    :cond_12
    invoke-virtual {v5}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v5

    iput-object v5, v8, Ll/ۖ֡۠;->ۗ:Ll/ۖܶ۠;

    .line 3063
    :cond_13
    invoke-virtual/range {p1 .. p1}, Ll/ۛ֡֨;->ܰ()Ll/ۨ֡֨;

    move-result-object v5

    iget-object v8, v4, Ll/ܿ᩵۠;->۫:Ll/ܽۘ֨;

    invoke-virtual {v5, v8}, Ll/ۨ֡֨;->֫(Ll/ܽۘ֨;)V

    goto :goto_e

    .line 3065
    :cond_14
    sget-object v5, Ll/ۛᩴ۠;->ᩳ:Ll/۫۠۠;

    invoke-virtual {v12, v4, v5}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    :cond_15
    :goto_e
    if-eqz v9, :cond_16

    if-nez v6, :cond_16

    .line 3072
    iget-object v5, v4, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    iget-object v5, v5, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v6, v13, Ll/᩷ۚ֨;->ܺۧ:Ll/ۙ֨֨;

    iget-object v6, v6, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    if-ne v5, v6, :cond_16

    sget-object v5, Ll/ᩴۚ۠;->۟֫:Ll/ᩴۚ۠;

    invoke-virtual {v2, v5}, Ll/ۚۚ۠;->֫(Ll/ᩴۚ۠;)Z

    move-result v5

    if-eqz v5, :cond_16

    .line 3073
    iget-object v5, v13, Ll/᩷ۚ֨;->ܺۧ:Ll/ۙ֨֨;

    iget-object v5, v5, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    sget-object v6, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 8402
    new-instance v6, Ll/ۨ۠۠;

    const/4 v8, 0x1

    new-array v9, v8, [Ljava/lang/Object;

    aput-object v1, v9, v15

    const-string v10, "varargs.trustme.on.non.varargs.accessor"

    invoke-direct {v6, v11, v10, v9}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3073
    sget-object v9, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 4007
    new-instance v9, Ll/۫۠۠;

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v5, v7, v15

    aput-object v6, v7, v8

    const-string v5, "varargs.invalid.trustme.anno"

    invoke-direct {v9, v11, v5, v7}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3073
    invoke-virtual {v12, v4, v9}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    .line 3078
    :cond_16
    iget-object v5, v4, Ll/ܿ᩵۠;->ۗ:Ll/ۚۚ۠;

    iget-object v5, v5, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    iget-object v5, v5, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v6, v13, Ll/᩷ۚ֨;->ۛ:Ll/ۙ֨֨;

    iget-object v6, v6, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    if-ne v5, v6, :cond_0

    .line 3079
    iget-object v5, v1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v6, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-eq v5, v6, :cond_17

    .line 3080
    sget-object v5, Ll/ۛᩴ۠;->᩵:Ll/۫۠۠;

    invoke-virtual {v12, v4, v5}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    goto/16 :goto_0

    .line 3081
    :cond_17
    invoke-virtual/range {p1 .. p1}, Ll/ۛ֡֨;->ۘ֫()Z

    move-result v5

    if-eqz v5, :cond_18

    invoke-virtual/range {p1 .. p1}, Ll/ۛ֡֨;->۬()J

    move-result-wide v5

    const-wide/16 v7, 0x2000

    and-long/2addr v5, v7

    const-wide/16 v7, 0x0

    cmp-long v9, v5, v7

    if-eqz v9, :cond_0

    .line 3082
    :cond_18
    sget-object v5, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 7792
    new-instance v5, Ll/ۨ۠۠;

    const/4 v6, 0x1

    new-array v7, v6, [Ljava/lang/Object;

    aput-object v1, v7, v15

    const-string v8, "not.a.functional.intf"

    invoke-direct {v5, v11, v8, v7}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3082
    sget-object v7, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 291
    new-instance v7, Ll/۫۠۠;

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v5, v6, v15

    const-string v5, "bad.functional.intf.anno.1"

    invoke-direct {v7, v11, v5, v6}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3082
    invoke-virtual {v12, v4, v7}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    goto/16 :goto_0

    :cond_19
    return-void
.end method

.method public final ֫(Ll/ۛ᩵۠;Ll/ۧܶ۠;)V
    .locals 2

    .line 281
    iget-object v0, p0, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    sget-object v1, Ll/᩶ᩴ֨;->ᩴ֫:Ll/᩶ᩴ֨;

    invoke-virtual {v0, v1}, Ll/ۙᩴ֨;->֫(Ll/᩶ᩴ֨;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 282
    iget-object v0, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    invoke-virtual {v0, v1, p1, p2}, Ll/ۖ֨۠;->ۧ(Ll/᩶ᩴ֨;Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۡ֡۠;)V
    .locals 11

    .line 939
    iget-object v0, p1, Ll/ۡ֡۠;->۟:Ll/ۘ֡֨;

    .line 940
    iget-object v1, p0, Ll/ܶ۬֨;->ۤ:Ll/᩷ۚ֨;

    iget-object v2, v1, Ll/᩷ۚ֨;->ܺۧ:Ll/ۙ֨֨;

    iget-object v1, v1, Ll/᩷ۚ֨;->ܺۧ:Ll/ۙ֨֨;

    iget-object v2, v2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v0, v2}, Ll/ۛ֡֨;->֫(Ll/ۛ֡֨;)Ll/ܽۘ֨;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 942
    :goto_0
    invoke-virtual {v0}, Ll/ۘ֡֨;->֡()Z

    move-result v5

    iget-object v6, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    if-eqz v5, :cond_1

    .line 943
    iget-object v5, p1, Ll/ۡ֡۠;->ۨ:Ll/ۖܶ۠;

    invoke-virtual {v5}, Ll/ۖܶ۠;->last()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۢۚ۠;

    iget-object v5, v5, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    invoke-virtual {v6, v5}, Ll/ۛ᩸֨;->ۜ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v5

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    const/4 v7, 0x2

    .line 945
    iget-object v8, p0, Ll/ܶ۬֨;->ۡ:Ll/ۛ۠۠;

    const-string v9, "compiler"

    if-eqz v2, :cond_4

    invoke-direct {p0, v0}, Ll/ܶ۬֨;->ۧ(Ll/ۛ֡֨;)Z

    move-result v10

    if-nez v10, :cond_4

    const-string v2, "varargs.invalid.trustme.anno"

    .line 946
    iget-object v6, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    if-eqz v5, :cond_3

    .line 947
    sget-object v5, Ll/ۧ֡֨;->ᩴ֫:Ll/ۧ֡֨;

    iget-object v10, p0, Ll/ܶ۬֨;->۬:Ll/ܽ֡֨;

    invoke-virtual {v5, v10}, Ll/ۧ֡֨;->֫(Ll/ܽ֡֨;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 8426
    new-instance v5, Ll/ۨ۠۠;

    new-array v10, v4, [Ljava/lang/Object;

    aput-object v0, v10, v3

    const-string v0, "varargs.trustme.on.virtual.varargs"

    invoke-direct {v5, v9, v0, v10}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 948
    invoke-virtual {v8, v5}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object v0

    goto :goto_2

    .line 8434
    :cond_2
    new-instance v5, Ll/ۨ۠۠;

    new-array v10, v4, [Ljava/lang/Object;

    aput-object v0, v10, v3

    const-string v0, "varargs.trustme.on.virtual.varargs.final.only"

    invoke-direct {v5, v9, v0, v10}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 949
    invoke-virtual {v8, v5}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object v0

    .line 950
    :goto_2
    iget-object v1, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 951
    sget-object v5, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 3999
    new-instance v5, Ll/۫۠۠;

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v1, v7, v3

    aput-object v0, v7, v4

    invoke-direct {v5, v9, v2, v7}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 950
    invoke-virtual {v6, p1, v5}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    return-void

    .line 954
    :cond_3
    iget-object v1, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 956
    sget-object v5, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 8410
    new-instance v5, Ll/ۨ۠۠;

    new-array v8, v4, [Ljava/lang/Object;

    aput-object v0, v8, v3

    const-string v0, "varargs.trustme.on.non.varargs.meth"

    invoke-direct {v5, v9, v0, v8}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 955
    sget-object v0, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 4007
    new-instance v0, Ll/۫۠۠;

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v1, v7, v3

    aput-object v5, v7, v4

    invoke-direct {v0, v9, v2, v7}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 954
    invoke-virtual {v6, p1, v0}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    return-void

    :cond_4
    if-eqz v2, :cond_5

    if-eqz v5, :cond_5

    .line 959
    invoke-virtual {v6, v5}, Ll/ۛ᩸֨;->֡(Ll/ۙ֨֨;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 960
    iget-object v0, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 962
    sget-object v1, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 8418
    new-instance v1, Ll/ۨ۠۠;

    new-array v2, v4, [Ljava/lang/Object;

    aput-object v5, v2, v3

    const-string v5, "varargs.trustme.on.reifiable.varargs"

    invoke-direct {v1, v9, v5, v2}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 962
    invoke-virtual {v8, v1}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object v1

    .line 960
    sget-object v2, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 5201
    new-instance v2, Ll/ۧܶ۠;

    new-array v5, v7, [Ljava/lang/Object;

    aput-object v0, v5, v3

    aput-object v1, v5, v4

    const-string v0, "varargs.redundant.trustme.anno"

    invoke-direct {v2, v9, v0, v5}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 960
    invoke-virtual {p0, p1, v2}, Ll/ܶ۬֨;->ܽ(Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    return-void

    :cond_5
    if-nez v2, :cond_6

    if-eqz v5, :cond_6

    .line 965
    invoke-virtual {v6, v5}, Ll/ۛ᩸֨;->֡(Ll/ۙ֨֨;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 966
    iget-object p1, p1, Ll/ۡ֡۠;->ۨ:Ll/ۖܶ۠;

    iget-object p1, p1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast p1, Ll/ۢۚ۠;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 5135
    new-instance v0, Ll/ۧܶ۠;

    new-array v1, v4, [Ljava/lang/Object;

    aput-object v5, v1, v3

    const-string v2, "unchecked.varargs.non.reifiable.type"

    invoke-direct {v0, v9, v2, v1}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 966
    invoke-virtual {p0, p1, v0}, Ll/ܶ۬֨;->ۧ(Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    :cond_6
    return-void
.end method

.method public final ֫(Ll/ۡ֡۠;Ll/ۘ֡֨;)V
    .locals 9

    .line 2906
    iget-object v0, p0, Ll/ܶ۬֨;->ۤ:Ll/᩷ۚ֨;

    iget-object v0, v0, Ll/᩷ۚ֨;->ۧ:Ll/ۙ֨֨;

    :goto_0
    sget-object v1, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    invoke-virtual {v0, v1}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 2907
    iget-object v1, v0, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v1}, Ll/ۛ֡֨;->֨֫()Ll/ܰ᩵֨;

    move-result-object v1

    .line 2908
    iget-object v2, p2, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {v1, v2}, Ll/۟᩵֨;->֫(Ll/ۤܶ۠;)Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    iget-object v3, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛ֡֨;

    .line 2909
    iget-object v4, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v5, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-ne v4, v5, :cond_0

    .line 2910
    invoke-virtual {v2}, Ll/ۛ֡֨;->۬()J

    move-result-wide v4

    const-wide/16 v6, 0x5

    and-long/2addr v4, v6

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-eqz v8, :cond_0

    iget-object v4, p2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    iget-object v5, v2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 2911
    invoke-virtual {v3, v4, v5}, Ll/ۛ᩸֨;->ۜ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 2912
    sget-object v3, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 1943
    new-instance v3, Ll/۫۠۠;

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    const/4 v2, 0x1

    aput-object v0, v4, v2

    const-string v2, "compiler"

    const-string v5, "intf.annotation.member.clash"

    invoke-direct {v3, v2, v5, v4}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2912
    iget-object v2, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    invoke-virtual {v2, p1, v3}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    goto :goto_1

    .line 2906
    :cond_1
    invoke-virtual {v3, v0}, Ll/ۛ᩸֨;->᩸(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v0

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ֫(Ll/ۡ֡۠;Ll/ۙ֨֨;)V
    .locals 12

    .line 3647
    sget-object v0, Ll/ۖ۬֨;->ᩳ:[I

    invoke-virtual {p2}, Ll/ۙ֨֨;->֫֫()Ll/ۢ۠֨;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto/16 :goto_1

    .line 3653
    :cond_0
    iget-object v0, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    invoke-virtual {v0, p2}, Ll/ۛ᩸֨;->ۜ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ll/ܶ۬֨;->֫(Ll/ۡ֡۠;Ll/ۙ֨֨;)V

    return-void

    .line 3649
    :cond_1
    iget-object v0, p2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v0}, Ll/ۛ֡֨;->۬()J

    move-result-wide v2

    const-wide/16 v4, 0x2000

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-eqz v0, :cond_6

    .line 3650
    iget-object p2, p2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 3627
    iget-wide v2, p2, Ll/ۛ֡֨;->᩶:J

    const-wide v6, 0x800000000L

    and-long v8, v2, v6

    cmp-long v0, v8, v4

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    const-wide/32 v8, 0x8000000

    and-long v10, v2, v8

    cmp-long v0, v10, v4

    if-eqz v0, :cond_3

    .line 3630
    sget-object v0, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 1010
    new-instance v0, Ll/۫۠۠;

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const-string p2, "compiler"

    const-string v2, "cyclic.annotation.element"

    invoke-direct {v0, p2, v2, v1}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3630
    iget-object p2, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    invoke-virtual {p2, p1, v0}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    return-void

    :cond_3
    or-long v0, v2, v8

    const-wide/32 v2, -0x8000001

    .line 3634
    :try_start_0
    iput-wide v0, p2, Ll/ۛ֡֨;->᩶:J

    .line 3635
    invoke-virtual {p2}, Ll/ۛ֡֨;->֨֫()Ll/ܰ᩵֨;

    move-result-object v0

    sget-object v1, Ll/֨᩵֨;->᩹:Ll/֨᩵֨;

    const/4 v4, 0x0

    .line 82
    invoke-virtual {v0, v4, v1}, Ll/۟᩵֨;->֫(Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;

    move-result-object v0

    .line 3635
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛ֡֨;

    .line 3636
    iget-object v4, v1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v5, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-eq v4, v5, :cond_4

    goto :goto_0

    .line 3638
    :cond_4
    check-cast v1, Ll/ۘ֡֨;

    iget-object v1, v1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v1}, Ll/ۙ֨֨;->۟()Ll/ۙ֨֨;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Ll/ܶ۬֨;->֫(Ll/ۡ֡۠;Ll/ۙ֨֨;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 3641
    :cond_5
    iget-wide v0, p2, Ll/ۛ֡֨;->᩶:J

    and-long/2addr v0, v2

    or-long/2addr v0, v6

    .line 3642
    iput-wide v0, p2, Ll/ۛ֡֨;->᩶:J

    return-void

    :catchall_0
    move-exception p1

    .line 3641
    iget-wide v0, p2, Ll/ۛ֡֨;->᩶:J

    and-long/2addr v0, v2

    or-long/2addr v0, v6

    .line 3642
    iput-wide v0, p2, Ll/ۛ֡֨;->᩶:J

    .line 3643
    throw p1

    :cond_6
    :goto_1
    return-void
.end method

.method public final ֫(Ll/ۡ֡۠;Ll/ۙ֨֨;Ll/ۘ֡֨;)V
    .locals 8

    .line 2589
    new-instance v0, Ll/ᩴ۬֨;

    invoke-direct {v0, p0, p2}, Ll/ᩴ۬֨;-><init>(Ll/ܶ۬֨;Ll/ۙ֨֨;)V

    .line 2591
    iget-object v1, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    const/4 v2, 0x1

    invoke-virtual {v1, p2, v2}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Z)Ll/ܿ᩵֨;

    move-result-object v3

    iget-object v4, p3, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    .line 100
    sget-object v5, Ll/֨᩵֨;->᩶:Ll/֨᩵֨;

    invoke-virtual {v3, v4, v0, v5}, Ll/ܿ᩵֨;->֫(Ll/ۤܶ۠;Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;

    move-result-object v0

    .line 2591
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛ֡֨;

    .line 2594
    iget-object v4, p3, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v1, v3, p2}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v5

    sget-object v6, Ll/ۧ֡֨;->᩹֫:Ll/ۧ֡֨;

    iget-object v7, p0, Ll/ܶ۬֨;->۬:Ll/ܽ֡֨;

    invoke-virtual {v6, v7}, Ll/ۧ֡֨;->֫(Ll/ܽ֡֨;)Z

    move-result v6

    invoke-virtual {v1, v4, v5, v6}, Ll/ۛ᩸֨;->ۧ(Ll/ۙ֨֨;Ll/ۙ֨֨;Z)Z

    move-result v4

    if-nez v4, :cond_0

    .line 2595
    invoke-virtual {v3, v1}, Ll/ۛ֡֨;->ܽ(Ll/ۛ᩸֨;)Ll/ۙ֨֨;

    move-result-object v4

    invoke-virtual {p3, v1}, Ll/ۛ֡֨;->ܽ(Ll/ۛ᩸֨;)Ll/ۙ֨֨;

    move-result-object v5

    .line 3255
    invoke-virtual {v1, v4, v5, v2}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۙ֨֨;Z)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 2597
    invoke-virtual {p3}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object p2

    invoke-virtual {v3}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v0

    sget-object v1, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2560
    new-instance v1, Ll/۫۠۠;

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p3, v4, v5

    aput-object p2, v4, v2

    const/4 p2, 0x2

    aput-object v3, v4, p2

    const/4 p2, 0x3

    aput-object v0, v4, p2

    const-string p2, "compiler"

    const-string p3, "name.clash.same.erasure.no.hide"

    invoke-direct {v1, p2, p3, v4}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2596
    iget-object p2, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    invoke-virtual {p2, p1, v1}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    return-void

    .line 2600
    :cond_1
    check-cast v3, Ll/ۘ֡֨;

    invoke-virtual {p0, p1, p2, p3, v3}, Ll/ܶ۬֨;->֫(Ll/ۡ֡۠;Ll/ۙ֨֨;Ll/ۘ֡֨;Ll/ۘ֡֨;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ֫(Ll/ۡ֡۠;Ll/ۙ֨֨;Ll/ۘ֡֨;Ll/ۘ֡֨;)V
    .locals 10

    if-eq p3, p4, :cond_4

    .line 2697
    sget-object v0, Ll/ۧ֡֨;->ۤ:Ll/ۧ֡֨;

    iget-object v1, p0, Ll/ܶ۬֨;->۬:Ll/ܽ֡֨;

    .line 2698
    invoke-virtual {v0, v1}, Ll/ۧ֡֨;->֫(Ll/ܽ֡֨;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    sget-object v1, Ll/᩶ᩴ֨;->ܿ֫:Ll/᩶ᩴ֨;

    .line 2699
    invoke-virtual {v0, v1}, Ll/ۙᩴ֨;->֫(Ll/᩶ᩴ֨;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 111
    iget-wide v0, p3, Ll/ۛ֡֨;->᩶:J

    const-wide/high16 v2, 0x1000000000000L

    and-long/2addr v0, v2

    const-wide/16 v4, 0x0

    cmp-long v6, v0, v4

    if-nez v6, :cond_4

    iget-wide v0, p4, Ll/ۛ֡֨;->᩶:J

    and-long/2addr v0, v2

    cmp-long v6, v0, v4

    if-nez v6, :cond_4

    .line 2702
    iget-object v0, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    invoke-virtual {v0, p3, p2}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v1

    .line 2703
    invoke-virtual {v0, p4, p2}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p2

    .line 2705
    sget-object v4, Ll/ۢ۠֨;->ۧ֫:Ll/ۢ۠֨;

    invoke-virtual {v1, v4}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {p2, v4}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v4

    if-eqz v4, :cond_0

    move-object v4, v1

    check-cast v4, Ll/ۤۚ֨;

    move-object v5, p2

    check-cast v5, Ll/ۤۚ֨;

    .line 2706
    invoke-virtual {v0, v4, v5}, Ll/ۛ᩸֨;->֫(Ll/ۤۚ֨;Ll/ۤۚ֨;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 2707
    iget-object v5, v5, Ll/ۤۚ֨;->ۨ:Ll/ۖܶ۠;

    iget-object v4, v4, Ll/ۤۚ֨;->ۨ:Ll/ۖܶ۠;

    invoke-virtual {v0, p2, v5, v4}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۙ֨֨;

    move-result-object p2

    .line 2710
    :cond_0
    invoke-virtual {v1}, Ll/ۙ֨֨;->ܰ()Ll/ۖܶ۠;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۖܶ۠;->ۧ()I

    move-result v4

    invoke-virtual {p2}, Ll/ۙ֨֨;->ܰ()Ll/ۖܶ۠;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۖܶ۠;->ۧ()I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 2711
    invoke-virtual {v1}, Ll/ۙ֨֨;->ܰ()Ll/ۖܶ۠;

    move-result-object v1

    iget-object v5, p0, Ll/ܶ۬֨;->ۗ:Ll/᩹ܽ۠;

    const/4 v6, 0x1

    invoke-virtual {v5, v1, p3, v4, v6}, Ll/᩹ܽ۠;->֫(Ll/ۖܶ۠;Ll/ۛ֡֨;IZ)Ll/ۖܶ۠;

    move-result-object v1

    .line 2712
    invoke-virtual {p2}, Ll/ۙ֨֨;->ܰ()Ll/ۖܶ۠;

    move-result-object p2

    invoke-virtual {v5, p2, p4, v4, v6}, Ll/᩹ܽ۠;->֫(Ll/ۖܶ۠;Ll/ۛ֡֨;IZ)Ll/ۖܶ۠;

    move-result-object p2

    .line 2714
    invoke-virtual {v1}, Ll/ۖܶ۠;->ۧ()I

    move-result v4

    invoke-virtual {p2}, Ll/ۖܶ۠;->ۧ()I

    move-result v5

    if-eq v4, v5, :cond_1

    goto/16 :goto_1

    :cond_1
    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 2716
    :goto_0
    invoke-virtual {v1}, Ll/ۖܶ۠;->ܽ()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {p2}, Ll/ۖܶ۠;->ܽ()Z

    move-result v7

    if-eqz v7, :cond_3

    .line 2717
    iget-object v7, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v7, Ll/ۙ֨֨;

    .line 2718
    iget-object v8, p2, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v8, Ll/ۙ֨֨;

    .line 1071
    invoke-virtual {v0, v8, v7, v6}, Ll/ۛ᩸֨;->ܽ(Ll/ۙ֨֨;Ll/ۙ֨֨;Z)Z

    move-result v9

    if-nez v9, :cond_2

    invoke-virtual {v0, v7, v8, v6}, Ll/ۛ᩸֨;->ܽ(Ll/ۙ֨֨;Ll/ۙ֨֨;Z)Z

    move-result v9

    if-nez v9, :cond_2

    .line 2720
    invoke-virtual {v0, v7}, Ll/ۛ᩸֨;->᩵(Ll/ۙ֨֨;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v0, v8}, Ll/ۛ᩸֨;->᩵(Ll/ۙ֨֨;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 2721
    invoke-virtual {v0, v7}, Ll/ۛ᩸֨;->ܺ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۙ֨֨;->ܰ()Ll/ۖܶ۠;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۖܶ۠;->ۧ()I

    move-result v5

    if-lez v5, :cond_4

    .line 2722
    invoke-virtual {v0, v7}, Ll/ۛ᩸֨;->ܺ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۙ֨֨;->ܰ()Ll/ۖܶ۠;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۖܶ۠;->ۧ()I

    move-result v5

    .line 2723
    invoke-virtual {v0, v8}, Ll/ۛ᩸֨;->ܺ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v7

    invoke-virtual {v7}, Ll/ۙ֨֨;->ܰ()Ll/ۖܶ۠;

    move-result-object v7

    invoke-virtual {v7}, Ll/ۖܶ۠;->ۧ()I

    move-result v7

    if-ne v5, v7, :cond_4

    const/4 v5, 0x1

    .line 2729
    :cond_2
    iget-object v1, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    .line 2730
    iget-object p2, p2, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    :cond_3
    if-eqz v5, :cond_4

    .line 2735
    iget-wide v0, p3, Ll/ۛ֡֨;->᩶:J

    or-long/2addr v0, v2

    iput-wide v0, p3, Ll/ۛ֡֨;->᩶:J

    .line 2736
    iget-wide v0, p4, Ll/ۛ֡֨;->᩶:J

    or-long/2addr v0, v2

    iput-wide v0, p4, Ll/ۛ֡֨;->᩶:J

    .line 2737
    sget-object p2, Ll/᩶ᩴ֨;->ܿ֫:Ll/᩶ᩴ֨;

    .line 2738
    invoke-virtual {p3}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v0

    .line 2739
    invoke-virtual {p4}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v1

    .line 2738
    sget-object v2, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4722
    new-instance v2, Ll/ۧܶ۠;

    const/4 v3, 0x4

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p3, v3, v4

    aput-object v0, v3, v6

    const/4 p3, 0x2

    aput-object p4, v3, p3

    const/4 p3, 0x3

    aput-object v1, v3, p3

    const-string p3, "compiler"

    const-string p4, "potentially.ambiguous.overload"

    invoke-direct {v2, p3, p4, v3}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2737
    iget-object p3, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    invoke-virtual {p3, p2, p1, v2}, Ll/ۖ֨۠;->ۧ(Ll/᩶ᩴ֨;Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public final ֫(Ll/ۡ֡۠;Ll/ۙ֨֨;Ll/ܳ֡֨;Ll/ۘ֡֨;)V
    .locals 6

    .line 2151
    iget-object p2, p2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 2152
    invoke-virtual {p2}, Ll/ۛ֡֨;->֨֫()Ll/ܰ᩵֨;

    move-result-object p2

    iget-object v0, p4, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {p2, v0}, Ll/۟᩵֨;->֫(Ll/ۤܶ۠;)Ljava/lang/Iterable;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛ֡֨;

    .line 2153
    iget-object v1, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    const/4 v2, 0x0

    invoke-virtual {p4, v0, p3, v1, v2}, Ll/ۘ֡֨;->֫(Ll/ۛ֡֨;Ll/᩶֡֨;Ll/ۛ᩸֨;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2154
    invoke-virtual {v0}, Ll/ۛ֡֨;->۬()J

    move-result-wide v1

    const-wide/16 v3, 0x400

    and-long/2addr v1, v3

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    .line 2155
    check-cast v0, Ll/ۘ֡֨;

    invoke-virtual {p0, p1, p4, v0, p3}, Ll/ܶ۬֨;->֫(Ll/ۚۚ۠;Ll/ۘ֡֨;Ll/ۘ֡֨;Ll/ܳ֡֨;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ֫(Ll/۫᩵۠;Ll/֡֡֨;)V
    .locals 2

    .line 4260
    iget-object v0, p2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v1, Ll/֨ᩴ֨;->۟:Ll/֨ᩴ֨;

    if-eq v0, v1, :cond_0

    .line 4261
    new-instance v0, Ll/ۨۗ֨;

    invoke-direct {v0, p0, p1, p2}, Ll/ۨۗ֨;-><init>(Ll/ܶ۬֨;Ll/۫᩵۠;Ll/֡֡֨;)V

    iget-object p1, p0, Ll/ܶ۬֨;->ۜ:Ll/ᩳᩴ֨;

    invoke-virtual {p1, v0}, Ll/ᩳᩴ֨;->֫(Ll/ܽᩴ֨;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/۫᩵۠;Ll/ۙ֨֨;Ljava/util/HashSet;)V
    .locals 1

    .line 2843
    invoke-virtual {p3, p2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2844
    iget-object p2, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    sget-object p3, Ll/ۛᩴ۠;->ܳᩳ:Ll/۫۠۠;

    invoke-virtual {p2, p1, p3}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    return-void

    .line 2846
    :cond_0
    invoke-virtual {p3, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/۫᩵۠;Z)V
    .locals 10

    .line 2746
    iget-boolean v0, p0, Ll/ܶ۬֨;->۟:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    sget-object v1, Ll/᩶ᩴ֨;->ۘ֫:Ll/᩶ᩴ֨;

    .line 2747
    invoke-virtual {v0, v1}, Ll/ۙᩴ֨;->֫(Ll/᩶ᩴ֨;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    .line 2748
    invoke-virtual {v0, v1}, Ll/ۙᩴ֨;->ۧ(Ll/᩶ᩴ֨;)Z

    move-result v0

    if-nez v0, :cond_7

    if-eqz p2, :cond_7

    .line 2750
    :cond_0
    invoke-static {p1}, Ll/۟ۚ۠;->᩹(Ll/ۚۚ۠;)Ll/ۛ֡֨;

    move-result-object v0

    .line 2751
    iget-object v1, v0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v2, Ll/ܶᩴ֨;->ܺ:Ll/ܶᩴ֨;

    invoke-virtual {v1, v2}, Ll/֨ᩴ֨;->֫(Ll/ܶᩴ֨;)Z

    move-result v1

    if-nez v1, :cond_1

    goto/16 :goto_1

    .line 2755
    :cond_1
    iget-object v1, v0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v2, Ll/֨ᩴ֨;->ۜ֫:Ll/֨ᩴ֨;

    const-wide/16 v3, 0x0

    if-ne v1, v2, :cond_2

    .line 2756
    invoke-virtual {v0}, Ll/ۛ֡֨;->۬()J

    move-result-wide v1

    const-wide v5, 0x200000000L

    and-long/2addr v1, v5

    cmp-long v5, v1, v3

    if-nez v5, :cond_7

    .line 2757
    invoke-virtual {v0}, Ll/ۛ֡֨;->ۡ֫()Z

    move-result v1

    if-nez v1, :cond_7

    iget-object v1, v0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v2, p0, Ll/ܶ۬֨;->ܶ:Ll/ۛܶ۠;

    iget-object v5, v2, Ll/ۛܶ۠;->᩶֫:Ll/ۤܶ۠;

    if-eq v1, v5, :cond_7

    iget-object v2, v2, Ll/ۛܶ۠;->᩹֫:Ll/ۤܶ۠;

    if-ne v1, v2, :cond_2

    goto/16 :goto_1

    .line 2764
    :cond_2
    iget-object v1, v0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v1, v1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    iget-object v2, p0, Ll/ܶ۬֨;->ۤ:Ll/᩷ۚ֨;

    iget-object v5, v2, Ll/᩷ۚ֨;->ۧۧ:Ll/ۙ֨֨;

    .line 1071
    iget-object v6, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    const/4 v7, 0x1

    invoke-virtual {v6, v1, v5, v7}, Ll/ۛ᩸֨;->ܽ(Ll/ۙ֨֨;Ll/ۙ֨֨;Z)Z

    move-result v1

    if-nez v1, :cond_7

    .line 2780
    invoke-virtual {v0}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object v1

    iget-object v2, v2, Ll/᩷ۚ֨;->۟֫:Ll/᩹֡֨;

    if-ne v1, v2, :cond_3

    goto :goto_1

    :cond_3
    move-object v1, v0

    .line 2784
    :goto_0
    iget-object v2, v1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v5, Ll/֨ᩴ֨;->ᩳ֫:Ll/֨ᩴ֨;

    if-eq v2, v5, :cond_7

    .line 2785
    invoke-virtual {v1}, Ll/ۛ֡֨;->۬()J

    move-result-wide v5

    const-wide/16 v8, 0x1

    and-long/2addr v5, v8

    cmp-long v2, v5, v3

    if-nez v2, :cond_6

    const/4 v1, 0x0

    const-string v2, "compiler"

    .line 2766
    iget-object v3, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    if-eqz p2, :cond_5

    .line 2794
    invoke-virtual {v0}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object p2

    iget-object p2, p2, Ll/۠֡֨;->ۛ:Ll/ۤܶ۠;

    invoke-virtual {p2}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v4, "java."

    .line 2795
    invoke-virtual {p2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_4

    const-string v4, "javax."

    .line 2796
    invoke-virtual {p2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_4

    const-string v4, "sun."

    .line 2797
    invoke-virtual {p2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_4

    const-string v4, ".internal."

    .line 2798
    invoke-virtual {p2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_7

    .line 2768
    :cond_4
    sget-object p2, Ll/᩶ᩴ֨;->ۘ֫:Ll/᩶ᩴ֨;

    .line 2769
    sget-object v4, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4063
    new-instance v4, Ll/ۧܶ۠;

    new-array v5, v7, [Ljava/lang/Object;

    aput-object v0, v5, v1

    const-string v0, "access.to.member.from.serializable.lambda"

    invoke-direct {v4, v2, v0, v5}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2768
    invoke-virtual {v3, p2, p1, v4}, Ll/ۖ֨۠;->ۧ(Ll/᩶ᩴ֨;Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    return-void

    .line 2773
    :cond_5
    sget-object p2, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4055
    new-instance p2, Ll/ۧܶ۠;

    new-array v4, v7, [Ljava/lang/Object;

    aput-object v0, v4, v1

    const-string v0, "access.to.member.from.serializable.element"

    invoke-direct {p2, v2, v0, v4}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2772
    invoke-virtual {v3, p1, p2}, Ll/ۖ֨۠;->ۧ(Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    return-void

    .line 2788
    :cond_6
    iget-object v1, v1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    goto :goto_0

    :cond_7
    :goto_1
    return-void
.end method

.method public final ֫(Ll/ܳ֡֨;)V
    .locals 3

    .line 469
    iget-object v0, p1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    if-eqz v0, :cond_0

    iget-object v1, v0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v2, Ll/֨ᩴ֨;->ܽ֫:Ll/֨ᩴ֨;

    if-eq v1, v2, :cond_0

    .line 470
    new-instance v1, Ll/᩺ܶ۠;

    .line 471
    invoke-virtual {v0}, Ll/ۛ֡֨;->ۙ()Ll/ܳ֡֨;

    move-result-object v0

    iget-object v0, v0, Ll/ܳ֡֨;->᩺:Ll/ۤܶ۠;

    iget-object p1, p1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-direct {v1, v0, p1}, Ll/᩺ܶ۠;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 470
    iget-object p1, p0, Ll/ܶ۬֨;->ۚ:Ljava/util/HashMap;

    invoke-virtual {p1, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ܳ֡֨;Ll/ۗ۠۠;)V
    .locals 9

    .line 2251
    iget-object v0, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    invoke-virtual {v0, p1}, Ll/ۛ᩸֨;->֫(Ll/ܳ֡֨;)Ll/ۘ֡֨;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2253
    new-instance v8, Ll/ۘ֡֨;

    .line 111
    iget-wide v3, v1, Ll/ۛ֡֨;->᩶:J

    .line 2254
    iget-object v5, v1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v2, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 2255
    invoke-virtual {v0, v1, v2}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v6

    iget-object v7, v1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Ll/ۘ֡֨;-><init>(JLl/ۤܶ۠;Ll/ۙ֨֨;Ll/ۛ֡֨;)V

    .line 2257
    invoke-virtual {v8}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v0

    sget-object v1, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 1152
    new-instance v1, Ll/۫۠۠;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object v8, v2, p1

    const/4 p1, 0x2

    aput-object v0, v2, p1

    const-string p1, "compiler"

    const-string v0, "does.not.override.abstract"

    invoke-direct {v1, p1, v0, v2}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2256
    iget-object p1, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    invoke-virtual {p1, p2, v1}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ܳ֡֨;Ll/ܽۘ֨;Ll/ܿ᩵۠;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    .line 3108
    iget-object v4, v2, Ll/ۡۘ֨;->֫:Ll/ۙ֨֨;

    iget-object v5, v0, Ll/ܶ۬֨;->ۤ:Ll/᩷ۚ֨;

    iget-object v6, v5, Ll/᩷ۚ֨;->᩺֫:Ll/ۙ֨֨;

    iget-object v7, v5, Ll/᩷ۚ֨;->ܰ:Ll/ۙ֨֨;

    iget-object v5, v5, Ll/᩷ۚ֨;->۠:Ll/ۙ֨֨;

    iget-object v8, v0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    invoke-virtual {v8, v4, v6}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v4

    invoke-static {v4}, Ll/۫ۙ;->֫(Z)V

    .line 3111
    iget-object v2, v2, Ll/ܽۘ֨;->ᩳ:Ll/ۖܶ۠;

    .line 3112
    invoke-virtual {v2}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v4

    iget-object v6, v0, Ll/ܶ۬֨;->ܶ:Ll/ۛܶ۠;

    const/4 v9, 0x0

    if-nez v4, :cond_1

    .line 3113
    iget-object v4, v2, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v4, Ll/᩺ܶ۠;

    iget-object v4, v4, Ll/᩺ܶ۠;->֫:Ljava/lang/Object;

    check-cast v4, Ll/ۘ֡֨;

    iget-object v4, v4, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v10, v6, Ll/ۛܶ۠;->ܶܽ:Ll/ۤܶ۠;

    if-ne v4, v10, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-static {v4}, Ll/۫ۙ;->֫(Z)V

    .line 3114
    iget-object v2, v2, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v2, Ll/᩺ܶ۠;

    iget-object v2, v2, Ll/᩺ܶ۠;->ۧ:Ljava/lang/Object;

    check-cast v2, Ll/ۧۘ֨;

    .line 135
    iget-object v2, v2, Ll/ۧۘ֨;->ۧ:Ll/ۙ֨֨;

    goto :goto_1

    :cond_1
    move-object v2, v9

    :goto_1
    if-nez v2, :cond_2

    goto/16 :goto_e

    .line 3122
    :cond_2
    iget-object v4, v2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 3131
    invoke-virtual {v4}, Ll/ۛ֡֨;->֨֫()Ll/ܰ᩵֨;

    move-result-object v10

    iget-object v11, v6, Ll/ۛܶ۠;->ܶܽ:Ll/ۤܶ۠;

    .line 120
    invoke-virtual {v10, v11, v9}, Ll/۟᩵֨;->֫(Ll/ۤܶ۠;Ljava/util/function/Predicate;)Ll/ۛ֡֨;

    move-result-object v9

    const/4 v10, 0x3

    .line 3132
    iget-object v11, v0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    const/4 v12, 0x0

    const-string v13, "compiler"

    if-eqz v9, :cond_5

    iget-object v14, v9, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v15, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-ne v14, v15, :cond_5

    .line 3133
    check-cast v9, Ll/ۘ֡֨;

    .line 702
    iget-object v9, v9, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 2263
    invoke-virtual {v9}, Ll/ۙ֨֨;->۟()Ll/ۙ֨֨;

    move-result-object v9

    .line 3135
    sget-object v14, Ll/ۢ۠֨;->ۗ:Ll/ۢ۠֨;

    invoke-virtual {v9, v14}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v14

    if-eqz v14, :cond_4

    move-object v14, v9

    check-cast v14, Ll/ۚۚ֨;

    iget-object v14, v14, Ll/ۚۚ֨;->ۤ:Ll/ۙ֨֨;

    iget-object v15, v1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v8, v14, v15}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v14

    if-nez v14, :cond_3

    goto :goto_2

    :cond_3
    move-object/from16 v17, v6

    goto :goto_3

    .line 3136
    :cond_4
    :goto_2
    iget-object v14, v1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 3139
    invoke-virtual {v8, v14}, Ll/ۛ᩸֨;->֨(Ll/ۙ֨֨;)Ll/ۚۚ֨;

    move-result-object v14

    .line 3137
    sget-object v15, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2217
    new-instance v15, Ll/۫۠۠;

    const/16 v16, 0x1

    move-object/from16 v17, v6

    new-array v6, v10, [Ljava/lang/Object;

    aput-object v4, v6, v12

    aput-object v9, v6, v16

    const/4 v4, 0x2

    aput-object v14, v6, v4

    const-string v4, "invalid.repeatable.annotation.value.return"

    invoke-direct {v15, v13, v4, v6}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3136
    invoke-virtual {v11, v3, v15}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    goto :goto_3

    :cond_5
    move-object/from16 v17, v6

    .line 3142
    sget-object v6, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2153
    new-instance v6, Ll/۫۠۠;

    const/4 v9, 0x1

    new-array v9, v9, [Ljava/lang/Object;

    aput-object v4, v9, v12

    const-string v4, "invalid.repeatable.annotation.no.value"

    invoke-direct {v6, v13, v4, v9}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3142
    invoke-virtual {v11, v3, v6}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    .line 3123
    :goto_3
    iget-object v4, v2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 3147
    invoke-virtual {v8, v4}, Ll/ۛ᩸֨;->ۧ(Ll/᩶֡֨;)Ll/᩻ۘ֨;

    move-result-object v6

    .line 3148
    invoke-virtual {v8, v1}, Ll/ۛ᩸֨;->ۧ(Ll/᩶֡֨;)Ll/᩻ۘ֨;

    move-result-object v8

    .line 3151
    sget-object v9, Ll/ۖ۬֨;->֫:[I

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v14

    aget v9, v9, v14

    const/4 v14, 0x1

    if-eq v9, v14, :cond_7

    const/4 v14, 0x2

    if-eq v9, v14, :cond_6

    goto :goto_5

    .line 3158
    :cond_6
    sget-object v9, Ll/᩻ۘ֨;->ۙ:Ll/᩻ۘ֨;

    if-ne v6, v9, :cond_8

    goto :goto_4

    .line 3153
    :cond_7
    sget-object v9, Ll/᩻ۘ֨;->᩶:Ll/᩻ۘ֨;

    if-eq v6, v9, :cond_8

    .line 3165
    :goto_4
    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    .line 3167
    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    .line 3164
    sget-object v9, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2209
    new-instance v9, Ll/۫۠۠;

    const/4 v14, 0x4

    new-array v14, v14, [Ljava/lang/Object;

    aput-object v4, v14, v12

    const/4 v4, 0x1

    aput-object v6, v14, v4

    const/4 v4, 0x2

    aput-object v1, v14, v4

    aput-object v8, v14, v10

    const-string v4, "invalid.repeatable.annotation.retention"

    invoke-direct {v9, v13, v4, v14}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3163
    invoke-virtual {v11, v3, v9}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    .line 3124
    :cond_8
    :goto_5
    iget-object v4, v2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 3172
    iget-object v6, v5, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v1, v6}, Ll/ۛ֡֨;->֫(Ll/ۛ֡֨;)Ll/ܽۘ֨;

    move-result-object v6

    if-eqz v6, :cond_9

    .line 3173
    iget-object v5, v5, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v4, v5}, Ll/ۛ֡֨;->֫(Ll/ۛ֡֨;)Ll/ܽۘ֨;

    move-result-object v5

    if-nez v5, :cond_9

    .line 3174
    sget-object v5, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2185
    new-instance v5, Ll/۫۠۠;

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v4, v6, v12

    const/4 v4, 0x1

    aput-object v1, v6, v4

    const-string v4, "invalid.repeatable.annotation.not.documented"

    invoke-direct {v5, v13, v4, v6}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3174
    invoke-virtual {v11, v3, v5}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    .line 3125
    :cond_9
    iget-object v4, v2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 3180
    iget-object v5, v7, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v1, v5}, Ll/ۛ֡֨;->֫(Ll/ۛ֡֨;)Ll/ܽۘ֨;

    move-result-object v5

    if-eqz v5, :cond_a

    .line 3181
    iget-object v5, v7, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v4, v5}, Ll/ۛ֡֨;->֫(Ll/ۛ֡֨;)Ll/ܽۘ֨;

    move-result-object v5

    if-nez v5, :cond_a

    .line 3182
    sget-object v5, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2193
    new-instance v5, Ll/۫۠۠;

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v4, v6, v12

    const/4 v4, 0x1

    aput-object v1, v6, v4

    const-string v4, "invalid.repeatable.annotation.not.inherited"

    invoke-direct {v5, v13, v4, v6}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3182
    invoke-virtual {v11, v3, v5}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    .line 3126
    :cond_a
    iget-object v4, v2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 3194
    invoke-virtual {v0, v4}, Ll/ܶ۬֨;->֫(Ll/᩶֡֨;)Ll/֫ۘ֨;

    move-result-object v5

    if-nez v5, :cond_b

    .line 3196
    invoke-direct/range {p0 .. p0}, Ll/ܶ۬֨;->ᩳ()Ljava/util/Set;

    move-result-object v5

    goto :goto_7

    .line 3198
    :cond_b
    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 3199
    iget-object v5, v5, Ll/֫ۘ֨;->ۧ:[Ll/ۡۘ֨;

    array-length v7, v5

    const/4 v8, 0x0

    :goto_6
    if-ge v8, v7, :cond_d

    aget-object v9, v5, v8

    .line 3200
    instance-of v10, v9, Ll/ܿۘ֨;

    if-eqz v10, :cond_c

    check-cast v9, Ll/ܿۘ֨;

    .line 3203
    iget-object v9, v9, Ll/ܿۘ֨;->ۧ:Ll/۫֡֨;

    iget-object v9, v9, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {v6, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_c
    add-int/lit8 v8, v8, 0x1

    goto :goto_6

    :cond_d
    move-object v5, v6

    .line 3208
    :goto_7
    invoke-virtual/range {p0 .. p1}, Ll/ܶ۬֨;->֫(Ll/᩶֡֨;)Ll/֫ۘ֨;

    move-result-object v6

    if-nez v6, :cond_e

    .line 3210
    invoke-direct/range {p0 .. p0}, Ll/ܶ۬֨;->ᩳ()Ljava/util/Set;

    move-result-object v6

    goto :goto_9

    .line 3212
    :cond_e
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 3213
    iget-object v6, v6, Ll/֫ۘ֨;->ۧ:[Ll/ۡۘ֨;

    array-length v8, v6

    const/4 v9, 0x0

    :goto_8
    if-ge v9, v8, :cond_10

    aget-object v10, v6, v9

    .line 3214
    instance-of v14, v10, Ll/ܿۘ֨;

    if-eqz v14, :cond_f

    check-cast v10, Ll/ܿۘ֨;

    .line 3217
    iget-object v10, v10, Ll/ܿۘ֨;->ۧ:Ll/۫֡֨;

    iget-object v10, v10, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {v7, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_f
    add-int/lit8 v9, v9, 0x1

    goto :goto_8

    :cond_10
    move-object v6, v7

    .line 3244
    :goto_9
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_16

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۤܶ۠;

    .line 3246
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_b
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_15

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۤܶ۠;

    if-ne v9, v7, :cond_11

    goto :goto_a

    :cond_11
    move-object/from16 v10, v17

    .line 3250
    iget-object v14, v10, Ll/ۛܶ۠;->֡֫:Ll/ۤܶ۠;

    iget-object v15, v10, Ll/ۛܶ۠;->֫:Ll/ۤܶ۠;

    if-ne v9, v14, :cond_12

    if-ne v7, v15, :cond_12

    move-object/from16 v17, v10

    goto :goto_a

    .line 3253
    :cond_12
    iget-object v12, v10, Ll/ۛܶ۠;->֨֫:Ll/ۤܶ۠;

    if-ne v9, v12, :cond_14

    if-eq v7, v14, :cond_13

    if-eq v7, v15, :cond_13

    iget-object v9, v10, Ll/ۛܶ۠;->ۚ֫:Ll/ۤܶ۠;

    if-ne v7, v9, :cond_14

    :cond_13
    move-object/from16 v17, v10

    const/4 v12, 0x0

    goto :goto_a

    :cond_14
    move-object/from16 v17, v10

    const/4 v12, 0x0

    goto :goto_b

    :cond_15
    move-object/from16 v10, v17

    .line 3222
    sget-object v5, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2129
    new-instance v5, Ll/۫۠۠;

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v4, v6, v7

    const/4 v4, 0x1

    aput-object v1, v6, v4

    const-string v1, "invalid.repeatable.annotation.incompatible.target"

    invoke-direct {v5, v13, v1, v6}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3222
    invoke-virtual {v11, v3, v5}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    goto :goto_c

    :cond_16
    move-object/from16 v10, v17

    .line 3127
    :goto_c
    iget-object v1, v2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 3269
    invoke-virtual {v1}, Ll/ۛ֡֨;->֨֫()Ll/ܰ᩵֨;

    move-result-object v2

    .line 3270
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    sget-object v4, Ll/֨᩵֨;->᩶:Ll/֨᩵֨;

    const/4 v5, 0x0

    invoke-virtual {v2, v5, v4}, Ll/۟᩵֨;->֫(Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;

    move-result-object v2

    .line 3270
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_18

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۛ֡֨;

    .line 3271
    iget-object v5, v4, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v6, v10, Ll/ۛܶ۠;->ܶܽ:Ll/ۤܶ۠;

    if-eq v5, v6, :cond_17

    iget-object v5, v4, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v6, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-ne v5, v6, :cond_17

    move-object v5, v4

    check-cast v5, Ll/ۘ֡֨;

    iget-object v5, v5, Ll/ۘ֡֨;->᩺:Ll/ۡۘ֨;

    if-nez v5, :cond_17

    .line 3275
    sget-object v5, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2113
    new-instance v5, Ll/۫۠۠;

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v1, v6, v7

    const/4 v8, 0x1

    aput-object v4, v6, v8

    const-string v4, "invalid.repeatable.annotation.elem.nondefault"

    invoke-direct {v5, v13, v4, v6}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3274
    invoke-virtual {v11, v3, v5}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    goto :goto_d

    :cond_17
    const/4 v7, 0x0

    goto :goto_d

    :cond_18
    :goto_e
    return-void
.end method

.method public final ֫(Ll/ܳۚ۠;Ll/ۡ֨֨;)V
    .locals 1

    .line 2380
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Ll/ܶ۬֨;->֫(Ll/ܳۚ۠;Ll/ۙ֨֨;Ll/ۖܶ۠;)V

    return-void
.end method

.method public final ֫(Ll/ᩳۚ۠;)V
    .locals 5

    .line 648
    iget-object v0, p1, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    invoke-virtual {v0}, Ll/ۙ֨֨;->᩻֫()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p1, Ll/ᩳۚ۠;->۬:Ll/۫᩵۠;

    iget-object v0, v0, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    iget-object v1, p1, Ll/ᩳۚ۠;->ۗ:Ll/ۚۚ۠;

    iget-object v1, v1, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    .line 649
    iget-object v2, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    invoke-virtual {v2, v0, v1}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Ll/ᩳۚ۠;->ۗ:Ll/ۚۚ۠;

    .line 650
    invoke-static {v0}, Ll/۟ۚ۠;->ۧ(Ll/ۚۚ۠;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 662
    iget-object v0, p1, Ll/ᩳۚ۠;->۬:Ll/۫᩵۠;

    invoke-static {v0}, Ll/۟ۚ۠;->ۧ(Ll/۫᩵۠;)Ll/۫᩵۠;

    move-result-object v0

    .line 663
    sget-object v1, Ll/ᩴۚ۠;->۬:Ll/ᩴۚ۠;

    invoke-virtual {v0, v1}, Ll/ۚۚ۠;->֫(Ll/ᩴۚ۠;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 664
    check-cast v0, Ll/ܺ֡۠;

    .line 665
    iget-object v0, v0, Ll/ܺ֡۠;->۫:Ll/۫᩵۠;

    invoke-static {v0}, Ll/۟ۚ۠;->᩹(Ll/ۚۚ۠;)Ll/ۛ֡֨;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 666
    iget-object v1, v0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v2, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-ne v1, v2, :cond_0

    .line 668
    invoke-virtual {v0}, Ll/ۛ֡֨;->۬()J

    move-result-wide v0

    const-wide v2, 0x2000000000L

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    goto :goto_0

    .line 652
    :cond_0
    new-instance v0, Ll/ܶۗ֨;

    invoke-direct {v0, p0, p1}, Ll/ܶۗ֨;-><init>(Ll/ܶ۬֨;Ll/ᩳۚ۠;)V

    iget-object p1, p0, Ll/ܶ۬֨;->ۜ:Ll/ᩳᩴ֨;

    invoke-virtual {p1, v0}, Ll/ᩳᩴ֨;->֫(Ll/ܽᩴ֨;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫(Ll/ۗ۠۠;Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/ۙ֨֨;)Z
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p4

    .line 1980
    iget-object v3, v2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v3}, Ll/ۛ֡֨;->۬()J

    move-result-wide v3

    const-wide/32 v5, 0x1000000

    and-long/2addr v3, v5

    iget-object v5, v0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    const-wide/16 v6, 0x0

    cmp-long v8, v3, v6

    if-eqz v8, :cond_0

    move-object/from16 v3, p2

    .line 1982
    invoke-virtual {v5, v3}, Ll/ۛ᩸֨;->ۧ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v3

    move-object/from16 v4, p3

    .line 1983
    invoke-virtual {v5, v4}, Ll/ۛ᩸֨;->ۧ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object/from16 v3, p2

    move-object/from16 v4, p3

    .line 1997
    :goto_0
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 1998
    invoke-direct {v0, v3, v8}, Ll/ܶ۬֨;->֫(Ll/ۙ֨֨;Ljava/util/HashMap;)V

    if-ne v3, v4, :cond_1

    move-object v3, v8

    goto :goto_1

    .line 2003
    :cond_1
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    invoke-direct {v0, v4, v8, v3}, Ll/ܶ۬֨;->֫(Ll/ۙ֨֨;Ljava/util/HashMap;Ljava/util/HashMap;)V

    .line 2005
    :goto_1
    invoke-virtual {v8}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    if-eqz v8, :cond_11

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۙ֨֨;

    .line 2006
    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_2

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ۙ֨֨;

    .line 2037
    iget-object v13, v8, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v13}, Ll/ۛ֡֨;->֨֫()Ll/ܰ᩵֨;

    move-result-object v13

    sget-object v14, Ll/֨᩵֨;->᩹:Ll/֨᩵֨;

    .line 82
    invoke-virtual {v13, v10, v14}, Ll/۟᩵֨;->֫(Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;

    move-result-object v10

    .line 2037
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_f

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ۛ֡֨;

    .line 2039
    iget-object v14, v13, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v15, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-ne v14, v15, :cond_e

    iget-object v14, v2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v13, v14, v5}, Ll/ۛ֡֨;->֫(Ll/ۛ֡֨;Ll/ۛ᩸֨;)Z

    move-result v14

    if-eqz v14, :cond_e

    .line 2040
    invoke-virtual {v13}, Ll/ۛ֡֨;->۬()J

    move-result-wide v14

    const-wide/16 v16, 0x1000

    and-long v14, v14, v16

    cmp-long v18, v14, v6

    if-eqz v18, :cond_3

    goto/16 :goto_9

    .line 2041
    :cond_3
    move-object v14, v13

    check-cast v14, Ll/ۘ֡֨;

    iget-object v15, v2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v14, v15, v5, v9}, Ll/ۘ֡֨;->֫(Ll/᩶֡֨;Ll/ۛ᩸֨;Z)Ll/ۘ֡֨;

    move-result-object v9

    iget-object v14, v5, Ll/ۛ᩸֨;->ܿ֫:Ll/֨᩸۠;

    if-eqz v9, :cond_5

    .line 111
    iget-wide v6, v9, Ll/ۛ֡֨;->᩶:J

    const-wide/16 v20, 0x400

    and-long v6, v6, v20

    const-wide/16 v18, 0x0

    cmp-long v9, v6, v18

    if-nez v9, :cond_5

    :cond_4
    move-object/from16 p3, v3

    move-object/from16 v21, v4

    move-object/from16 v23, v10

    move-object/from16 v24, v11

    const-wide/16 v18, 0x0

    goto/16 :goto_8

    .line 2043
    :cond_5
    iget-object v6, v12, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v6}, Ll/ۛ֡֨;->֨֫()Ll/ܰ᩵֨;

    move-result-object v6

    iget-object v7, v13, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {v6, v7}, Ll/۟᩵֨;->֫(Ll/ۤܶ۠;)Ljava/lang/Iterable;

    move-result-object v6

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v7, 0x0

    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۛ֡֨;

    if-ne v13, v9, :cond_6

    move-object/from16 p3, v3

    goto/16 :goto_6

    :cond_6
    const/16 v20, 0x1

    .line 2045
    iget-object v15, v9, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    move-object/from16 p3, v3

    sget-object v3, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-ne v15, v3, :cond_c

    iget-object v3, v2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v9, v3, v5}, Ll/ۛ֡֨;->֫(Ll/ۛ֡֨;Ll/ۛ᩸֨;)Z

    move-result v3

    if-eqz v3, :cond_c

    .line 2046
    invoke-virtual {v9}, Ll/ۛ֡֨;->۬()J

    move-result-wide v21

    and-long v21, v21, v16

    const-wide/16 v18, 0x0

    cmp-long v3, v21, v18

    if-eqz v3, :cond_7

    move-object/from16 v21, v4

    move-object/from16 v22, v6

    move-object/from16 v23, v10

    move-object/from16 v24, v11

    goto/16 :goto_7

    :cond_7
    if-nez v7, :cond_8

    .line 2047
    invoke-virtual {v5, v13, v8}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v3

    move-object v7, v3

    .line 2048
    :cond_8
    invoke-virtual {v5, v9, v12}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v3

    .line 2049
    invoke-virtual {v5, v7, v3}, Ll/ۛ᩸֨;->ۜ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v15

    move-object/from16 v21, v4

    const-string v4, "compiler"

    move-object/from16 v22, v6

    iget-object v6, v0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    if-eqz v15, :cond_b

    .line 2050
    invoke-virtual {v7}, Ll/ۙ֨֨;->ܽ֫()Ll/ۖܶ۠;

    move-result-object v15

    move-object/from16 v23, v10

    .line 2051
    invoke-virtual {v3}, Ll/ۙ֨֨;->ܽ֫()Ll/ۖܶ۠;

    move-result-object v10

    move-object/from16 v24, v11

    .line 2052
    invoke-virtual {v7}, Ll/ۙ֨֨;->۟()Ll/ۙ֨֨;

    move-result-object v11

    .line 2053
    invoke-virtual {v3}, Ll/ۙ֨֨;->۟()Ll/ۙ֨֨;

    move-result-object v3

    invoke-virtual {v5, v3, v10, v15}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۙ֨֨;

    move-result-object v3

    .line 2055
    invoke-virtual {v5, v11, v3}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v10

    if-nez v10, :cond_d

    .line 2056
    invoke-virtual {v11}, Ll/ۙ֨֨;->֡֫()Z

    move-result v10

    if-nez v10, :cond_9

    .line 2057
    invoke-virtual {v3}, Ll/ۙ֨֨;->֡֫()Z

    move-result v10

    if-nez v10, :cond_9

    .line 2058
    invoke-virtual {v5, v11, v3, v14}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)Z

    move-result v10

    if-nez v10, :cond_d

    .line 2059
    invoke-virtual {v5, v3, v11, v14}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)Z

    move-result v3

    if-nez v3, :cond_d

    .line 2060
    :cond_9
    invoke-virtual {v0, v13, v9, v2}, Ll/ܶ۬֨;->֫(Ll/ۛ֡֨;Ll/ۛ֡֨;Ll/ۙ֨֨;)Z

    move-result v3

    if-eqz v3, :cond_a

    goto/16 :goto_7

    .line 2062
    :cond_a
    iget-object v3, v9, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    .line 2063
    invoke-virtual {v5, v9, v12}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v7

    invoke-virtual {v7}, Ll/ۙ֨֨;->ܰ()Ll/ۖܶ۠;

    move-result-object v7

    sget-object v10, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 7175
    new-instance v10, Ll/ۨ۠۠;

    const/4 v11, 0x2

    new-array v13, v11, [Ljava/lang/Object;

    const/4 v14, 0x0

    aput-object v3, v13, v14

    aput-object v7, v13, v20

    const-string v3, "incompatible.diff.ret"

    invoke-direct {v10, v4, v3, v13}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2062
    sget-object v3, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 3819
    new-instance v3, Ll/۫۠۠;

    const/4 v7, 0x3

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v8, v7, v14

    aput-object v12, v7, v20

    aput-object v10, v7, v11

    const-string v10, "types.incompatible"

    invoke-direct {v3, v4, v10, v7}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2062
    invoke-virtual {v6, v1, v3}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    const/16 v20, 0x0

    goto :goto_5

    :cond_b
    move-object/from16 v23, v10

    move-object/from16 v24, v11

    .line 2066
    iget-object v3, v2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    check-cast v3, Ll/ܳ֡֨;

    .line 2239
    new-instance v10, Ll/ᩴ۬֨;

    iget-object v3, v3, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-direct {v10, v0, v3}, Ll/ᩴ۬֨;-><init>(Ll/ܶ۬֨;Ll/ۙ֨֨;)V

    .line 2240
    invoke-virtual {v10, v13}, Ll/ᩴ۬֨;->֫(Ll/ۛ֡֨;)Z

    move-result v3

    if-eqz v3, :cond_d

    .line 2241
    invoke-virtual {v10, v9}, Ll/ᩴ۬֨;->֫(Ll/ۛ֡֨;)Z

    move-result v3

    if-eqz v3, :cond_d

    .line 2242
    invoke-virtual {v13, v5}, Ll/ۛ֡֨;->ܽ(Ll/ۛ᩸֨;)Ll/ۙ֨֨;

    move-result-object v3

    invoke-virtual {v9, v5}, Ll/ۛ֡֨;->ܽ(Ll/ۛ᩸֨;)Ll/ۙ֨֨;

    move-result-object v10

    const/4 v11, 0x1

    .line 3255
    invoke-virtual {v5, v3, v10, v11}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۙ֨֨;Z)Z

    move-result v3

    if-eqz v3, :cond_d

    .line 2067
    invoke-virtual {v0, v13, v9, v2}, Ll/ܶ۬֨;->֫(Ll/ۛ֡֨;Ll/ۛ֡֨;Ll/ۙ֨֨;)Z

    move-result v3

    if-nez v3, :cond_d

    .line 2068
    iget-object v3, v13, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    .line 2069
    invoke-virtual {v5, v13, v2}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v7

    invoke-virtual {v7}, Ll/ۙ֨֨;->᩹()Ll/ۧ֨֨;

    move-result-object v7

    .line 1485
    iget-object v7, v7, Ll/ۧ֨֨;->ۤ:Ll/ۖܶ۠;

    .line 2069
    invoke-virtual {v13}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v10

    iget-object v11, v9, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    .line 2070
    invoke-virtual {v5, v9, v2}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v12

    invoke-virtual {v12}, Ll/ۙ֨֨;->᩹()Ll/ۧ֨֨;

    move-result-object v12

    .line 1485
    iget-object v12, v12, Ll/ۧ֨֨;->ۤ:Ll/ۖܶ۠;

    .line 2070
    invoke-virtual {v9}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v13

    .line 2068
    sget-object v14, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2568
    new-instance v14, Ll/۫۠۠;

    const/4 v15, 0x6

    new-array v15, v15, [Ljava/lang/Object;

    const/16 v20, 0x0

    aput-object v3, v15, v20

    const/4 v3, 0x1

    aput-object v7, v15, v3

    const/4 v3, 0x2

    aput-object v10, v15, v3

    const/4 v3, 0x3

    aput-object v11, v15, v3

    const/4 v3, 0x4

    aput-object v12, v15, v3

    const/4 v3, 0x5

    aput-object v13, v15, v3

    const-string v3, "name.clash.same.erasure.no.override"

    invoke-direct {v14, v4, v3, v15}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2068
    invoke-virtual {v6, v1, v14}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    :goto_5
    const/4 v15, 0x0

    goto :goto_b

    :cond_c
    :goto_6
    move-object/from16 v21, v4

    move-object/from16 v22, v6

    move-object/from16 v23, v10

    move-object/from16 v24, v11

    const-wide/16 v18, 0x0

    :cond_d
    :goto_7
    const/16 v20, 0x0

    move-object/from16 v3, p3

    move-object/from16 v4, v21

    move-object/from16 v6, v22

    move-object/from16 v10, v23

    move-object/from16 v11, v24

    goto/16 :goto_4

    :goto_8
    const/4 v9, 0x0

    goto :goto_a

    :cond_e
    :goto_9
    move-object/from16 p3, v3

    move-object/from16 v21, v4

    move-wide/from16 v18, v6

    move-object/from16 v23, v10

    move-object/from16 v24, v11

    :goto_a
    move-object/from16 v3, p3

    move-wide/from16 v6, v18

    move-object/from16 v4, v21

    move-object/from16 v10, v23

    move-object/from16 v11, v24

    goto/16 :goto_3

    :cond_f
    move-object/from16 p3, v3

    move-object/from16 v21, v4

    move-wide/from16 v18, v6

    move-object/from16 v24, v11

    const/4 v15, 0x0

    const/4 v9, 0x0

    :goto_b
    if-eqz v9, :cond_10

    goto :goto_c

    :cond_10
    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v3, p3

    move-wide/from16 v6, v18

    move-object/from16 v4, v21

    move-object/from16 v11, v24

    goto/16 :goto_2

    :cond_11
    const/4 v15, 0x0

    const/4 v9, 0x0

    :goto_c
    if-nez v9, :cond_12

    const/4 v1, 0x1

    return v1

    :cond_12
    return v15
.end method

.method public final ֫(Ll/ۗ۠۠;Ll/ۛ֡֨;Ll/ܰ᩵֨;)Z
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 3745
    iget-object v3, v2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v3}, Ll/ۙ֨֨;->᩻֫()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    goto/16 :goto_1

    .line 3747
    :cond_0
    iget-object v3, v2, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v3, v3, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v5, v0, Ll/ܶ۬֨;->ܶ:Ll/ۛܶ۠;

    iget-object v6, v5, Ll/ۛܶ۠;->۬֫:Ll/ۤܶ۠;

    const/4 v7, 0x0

    if-ne v3, v6, :cond_1

    goto/16 :goto_0

    .line 3748
    :cond_1
    iget-object v3, v2, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    sget-object v6, Ll/֨᩵֨;->᩹:Ll/֨᩵֨;

    const/4 v8, 0x0

    move-object/from16 v9, p3

    .line 107
    invoke-virtual {v9, v3, v8, v6}, Ll/۟᩵֨;->֫(Ll/ۤܶ۠;Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;

    move-result-object v3

    .line 3748
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۛ֡֨;

    if-eq v2, v6, :cond_2

    .line 3750
    invoke-virtual {v6}, Ll/ۛ֡֨;->۬()J

    move-result-wide v8

    const-wide v10, 0x40000000000L

    and-long/2addr v8, v10

    const-wide/16 v12, 0x0

    cmp-long v14, v8, v12

    if-nez v14, :cond_2

    iget-object v8, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    iget-object v9, v6, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    if-ne v8, v9, :cond_2

    iget-object v9, v2, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v14, v5, Ll/ۛܶ۠;->ܳۧ:Ll/ۤܶ۠;

    if-eq v9, v14, :cond_2

    sget-object v9, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    iget-object v14, v0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    if-ne v8, v9, :cond_3

    iget-object v8, v2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    iget-object v15, v6, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 3255
    invoke-virtual {v14, v8, v15, v4}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۙ֨֨;Z)Z

    move-result v8

    if-nez v8, :cond_3

    .line 3754
    iget-object v8, v2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 3755
    invoke-virtual {v14, v8}, Ll/ۛ᩸֨;->ۢ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v8

    iget-object v15, v6, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v14, v15}, Ll/ۛ᩸֨;->ۢ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v15

    .line 3255
    invoke-virtual {v14, v8, v15, v4}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۙ֨֨;Z)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 3756
    :cond_3
    invoke-virtual/range {p2 .. p2}, Ll/ۛ֡֨;->۬()J

    move-result-wide v15

    const-wide v17, 0x400000000L

    and-long v15, v15, v17

    invoke-virtual {v6}, Ll/ۛ֡֨;->۬()J

    move-result-wide v19

    and-long v17, v19, v17

    const/4 v3, 0x2

    const-string v5, "compiler"

    iget-object v8, v0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    cmp-long v19, v15, v17

    if-eqz v19, :cond_4

    .line 3757
    iget-wide v12, v2, Ll/ۛ֡֨;->᩶:J

    or-long v9, v10, v12

    iput-wide v9, v2, Ll/ۛ֡֨;->᩶:J

    .line 372
    iget-object v9, v2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v9}, Ll/ۙ֨֨;->᩻֫()Z

    move-result v9

    if-nez v9, :cond_9

    iget-object v9, v6, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v9}, Ll/ۙ֨֨;->᩻֫()Z

    move-result v9

    if-nez v9, :cond_9

    .line 373
    invoke-virtual {v6}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v9

    sget-object v10, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 241
    new-instance v10, Ll/۫۠۠;

    const/4 v11, 0x3

    new-array v11, v11, [Ljava/lang/Object;

    aput-object v2, v11, v7

    aput-object v6, v11, v4

    aput-object v9, v11, v3

    const-string v2, "array.and.varargs"

    invoke-direct {v10, v5, v2, v11}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 373
    invoke-virtual {v8, v1, v10}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    return v4

    .line 3760
    :cond_4
    iget-object v15, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    if-ne v15, v9, :cond_6

    iget-object v9, v2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    iget-object v15, v6, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v14, v9, v15, v7}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۙ֨֨;Z)Z

    move-result v9

    if-nez v9, :cond_6

    .line 3784
    iget-object v9, v2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v9}, Ll/ۙ֨֨;->᩻֫()Z

    move-result v9

    if-nez v9, :cond_5

    iget-object v9, v6, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v9}, Ll/ۙ֨֨;->᩻֫()Z

    move-result v9

    if-nez v9, :cond_5

    .line 3785
    sget-object v9, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2552
    new-instance v9, Ll/۫۠۠;

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v2, v3, v7

    aput-object v6, v3, v4

    const-string v6, "name.clash.same.erasure"

    invoke-direct {v9, v5, v6, v3}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3785
    invoke-virtual {v8, v1, v9}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    .line 3762
    :cond_5
    iget-wide v5, v2, Ll/ۛ֡֨;->᩶:J

    or-long/2addr v5, v10

    iput-wide v5, v2, Ll/ۛ֡֨;->᩶:J

    return v4

    .line 3764
    :cond_6
    invoke-virtual/range {p2 .. p2}, Ll/ۛ֡֨;->۬()J

    move-result-wide v3

    const-wide/high16 v14, 0x800000000000000L

    and-long/2addr v3, v14

    cmp-long v5, v3, v12

    if-eqz v5, :cond_8

    .line 3765
    invoke-virtual {v6}, Ll/ۛ֡֨;->۬()J

    move-result-wide v3

    and-long/2addr v3, v14

    cmp-long v5, v3, v12

    if-eqz v5, :cond_8

    .line 3766
    invoke-virtual {v6}, Ll/ۛ֡֨;->۬()J

    move-result-wide v3

    const-wide/high16 v14, 0x1000000000000000L

    and-long/2addr v3, v14

    cmp-long v5, v3, v12

    if-nez v5, :cond_8

    .line 3767
    iget-object v3, v2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v3}, Ll/ۙ֨֨;->᩻֫()Z

    move-result v3

    if-nez v3, :cond_7

    .line 3768
    sget-object v3, Ll/ۛᩴ۠;->ܰۧ:Ll/۫۠۠;

    invoke-virtual {v8, v1, v3}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    .line 3769
    iget-wide v3, v2, Ll/ۛ֡֨;->᩶:J

    or-long/2addr v3, v10

    iput-wide v3, v2, Ll/ۛ֡֨;->᩶:J

    :cond_7
    :goto_0
    return v7

    .line 3773
    :cond_8
    invoke-virtual {v0, v1, v6}, Ll/ܶ۬֨;->֫(Ll/ۗ۠۠;Ll/ۛ֡֨;)V

    return v7

    :cond_9
    :goto_1
    return v4
.end method

.method public final ֫(Ll/ۙ֨֨;)Z
    .locals 0

    .line 1078
    invoke-direct {p0, p1}, Ll/ܶ۬֨;->ᩳ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ll/ۚۚ۠;JJJ)Z
    .locals 8

    and-long/2addr p4, p2

    const/4 v0, 0x1

    const-wide/16 v1, 0x0

    cmp-long v3, p4, v1

    if-eqz v3, :cond_2

    and-long/2addr p2, p6

    cmp-long p6, p2, v1

    if-eqz p6, :cond_2

    const-wide/16 p6, 0x1

    move-wide v3, p6

    :goto_0
    and-long v5, v3, p4

    cmp-long v7, v5, v1

    if-nez v7, :cond_0

    shl-long/2addr v3, v0

    goto :goto_0

    .line 833
    :cond_0
    invoke-static {v3, v4}, Ll/᩵ᩴ֨;->֫(J)Ljava/util/EnumSet;

    move-result-object p4

    :goto_1
    and-long v3, p6, p2

    cmp-long p5, v3, v1

    if-nez p5, :cond_1

    shl-long/2addr p6, v0

    goto :goto_1

    .line 834
    :cond_1
    invoke-static {p6, p7}, Ll/᩵ᩴ֨;->֫(J)Ljava/util/EnumSet;

    move-result-object p2

    .line 833
    sget-object p3, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 1648
    new-instance p3, Ll/۫۠۠;

    const/4 p5, 0x2

    new-array p5, p5, [Ljava/lang/Object;

    const/4 p6, 0x0

    aput-object p4, p5, p6

    aput-object p2, p5, v0

    const-string p2, "compiler"

    const-string p4, "illegal.combination.of.modifiers"

    invoke-direct {p3, p2, p4, p5}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 832
    iget-object p2, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    invoke-virtual {p2, p1, p3}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    return p6

    :cond_2
    return v0
.end method

.method public final ֫(Ll/ۚ᩵۠;Ll/ۤܶ۠;Ll/ܰ᩵֨;)Z
    .locals 5

    .line 425
    sget-object v0, Ll/֨᩵֨;->᩹:Ll/֨᩵֨;

    const/4 v1, 0x0

    .line 107
    invoke-virtual {p3, p2, v1, v0}, Ll/۟᩵֨;->֫(Ll/ۤܶ۠;Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;

    move-result-object v0

    .line 425
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    iget-object v2, p0, Ll/ܶ۬֨;->ܶ:Ll/ۛܶ۠;

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛ֡֨;

    .line 426
    iget-object v3, v1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v4, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-ne v3, v4, :cond_0

    iget-object v3, v1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v2, v2, Ll/ۛܶ۠;->ܳۧ:Ll/ۤܶ۠;

    if-eq v3, v2, :cond_0

    .line 427
    invoke-virtual {p0, p1, v1}, Ll/ܶ۬֨;->֫(Ll/ۗ۠۠;Ll/ۛ֡֨;)V

    const/4 p1, 0x0

    return p1

    .line 431
    :cond_1
    iget-object p3, p3, Ll/۟᩵֨;->ۧ:Ll/ۛ֡֨;

    :goto_0
    const/4 v0, 0x1

    if-eqz p3, :cond_3

    .line 432
    iget-object v1, p3, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v3, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-ne v1, v3, :cond_2

    iget-object v1, p3, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    if-ne v1, p2, :cond_2

    iget-object v3, v2, Ll/ۛܶ۠;->ܳۧ:Ll/ۤܶ۠;

    if-eq v1, v3, :cond_2

    .line 433
    invoke-virtual {p0, p1, p3}, Ll/ܶ۬֨;->֫(Ll/ۗ۠۠;Ll/ۛ֡֨;)V

    return v0

    .line 431
    :cond_2
    iget-object p3, p3, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    goto :goto_0

    :cond_3
    return v0
.end method

.method public final ֫(Ll/ۛ֡֨;Ll/ۛ֡֨;Ll/ۙ֨֨;)Z
    .locals 11

    .line 2079
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 2080
    iget-object v1, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    invoke-virtual {v1, p1, p3}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v2

    .line 2081
    invoke-virtual {v1, p2, p3}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v3

    .line 2082
    invoke-direct {p0, p3, v0}, Ll/ܶ۬֨;->֫(Ll/ۙ֨֨;Ljava/util/HashMap;)V

    .line 2083
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۙ֨֨;

    .line 2084
    iget-object v4, v4, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v4}, Ll/ۛ֡֨;->֨֫()Ll/ܰ᩵֨;

    move-result-object v4

    iget-object v5, p1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {v4, v5}, Ll/۟᩵֨;->֫(Ll/ۤܶ۠;)Ljava/lang/Iterable;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۛ֡֨;

    if-eq v5, p1, :cond_1

    if-eq v5, p2, :cond_1

    .line 2085
    iget-object v6, v5, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v7, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-ne v6, v7, :cond_1

    invoke-virtual {v5}, Ll/ۛ֡֨;->۬()J

    move-result-wide v6

    const-wide v8, 0x80001000L    # 1.060999919E-314

    and-long/2addr v6, v8

    const-wide/16 v8, 0x0

    cmp-long v10, v6, v8

    if-eqz v10, :cond_2

    goto :goto_0

    .line 2086
    :cond_2
    invoke-virtual {v1, v5, p3}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v5

    .line 2087
    invoke-virtual {v1, v5, v2}, Ll/ۛ᩸֨;->ۜ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 2088
    invoke-virtual {v1, v5, v3}, Ll/ۛ᩸֨;->ۜ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 2089
    invoke-virtual {v1, v5, v2}, Ll/ۛ᩸֨;->᩷(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 2090
    invoke-virtual {v1, v5, v3}, Ll/ۛ᩸֨;->᩷(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ll/ܿ᩵۠;)Z
    .locals 2

    .line 3459
    new-instance v0, Ll/۠ܶ۠;

    iget-object v1, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    invoke-direct {v0, v1}, Ll/۠ܶ۠;-><init>(Ll/᩹ܶ۠;)V

    .line 3461
    :try_start_0
    invoke-direct {p0, p1}, Ll/ܶ۬֨;->ۧ(Ll/ܿ᩵۠;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3463
    invoke-virtual {v1, v0}, Ll/᩹ܶ۠;->֫(Ll/֨ܶ۠;)V

    return p1

    :catchall_0
    move-exception p1

    invoke-virtual {v1, v0}, Ll/᩹ܶ۠;->֫(Ll/֨ܶ۠;)V

    .line 3464
    throw p1
.end method

.method public final ֫(Ll/ܿ᩵۠;Z)Z
    .locals 1

    .line 3300
    iget-object p1, p1, Ll/ܿ᩵۠;->ۗ:Ll/ۚۚ۠;

    iget-object p1, p1, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    iget-object p1, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v0, p0, Ll/ܶ۬֨;->ۨ:Ll/ܿ۠֨;

    invoke-virtual {v0, p1}, Ll/ܿ۠֨;->֫(Ll/᩶֡֨;)Ll/ۖܶ۠;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 3303
    :cond_0
    invoke-static {p1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance v0, Ll/᩸ۗ֨;

    invoke-direct {v0, p0, p2}, Ll/᩸ۗ֨;-><init>(Ll/ܶ۬֨;Z)V

    .line 3304
    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result p1

    return p1
.end method

.method public final ۜ(Ll/ۗ۠۠;Ll/ۙ֨֨;)Ll/ۙ֨֨;
    .locals 2

    .line 815
    invoke-virtual {p2}, Ll/ۙ֨֨;->֨֫()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Ll/ۢ۠֨;->۫:Ll/ۢ۠֨;

    invoke-virtual {p2, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 818
    :cond_0
    iget-object v0, p0, Ll/ܶ۬֨;->ۡ:Ll/ۛ۠۠;

    sget-object v1, Ll/ۨᩴ۠;->ܳۧ:Ll/ۨ۠۠;

    .line 819
    invoke-virtual {v0, v1}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object v0

    .line 818
    invoke-virtual {p0, p1, v0, p2}, Ll/ܶ۬֨;->֫(Ll/ۗ۠۠;Ll/ܽܶ۠;Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    return-object p2
.end method

.method public final ۢ(Ll/ۗ۠۠;Ll/ۙ֨֨;)V
    .locals 9

    .line 2885
    invoke-virtual {p2}, Ll/ۙ֨֨;->᩵֫()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2886
    :cond_0
    iget-object v0, p0, Ll/ܶ۬֨;->ۤ:Ll/᩷ۚ֨;

    iget-object v1, v0, Ll/᩷ۚ֨;->᩻ۧ:Ll/ۙ֨֨;

    iget-object v2, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    invoke-virtual {v2, p2, v1}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 2887
    :cond_1
    iget-object v1, p2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v1}, Ll/ۛ֡֨;->۬()J

    move-result-wide v3

    const-wide/16 v5, 0x4000

    and-long/2addr v3, v5

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    goto :goto_0

    .line 2888
    :cond_2
    iget-object v1, p2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v1}, Ll/ۛ֡֨;->۬()J

    move-result-wide v3

    const-wide/16 v7, 0x2000

    and-long/2addr v3, v7

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    goto :goto_0

    .line 2889
    :cond_3
    invoke-static {p2}, Ll/ۛ᩸֨;->۬(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v1

    iget-object v1, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v0, v0, Ll/᩷ۚ֨;->ᩴ:Ll/ۙ֨֨;

    iget-object v0, v0, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    if-ne v1, v0, :cond_4

    :goto_0
    return-void

    .line 2890
    :cond_4
    invoke-virtual {v2, p2}, Ll/ۛ᩸֨;->ۘ(Ll/ۙ֨֨;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v2, p2}, Ll/ۛ᩸֨;->ۜ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v0

    invoke-virtual {v2, v0}, Ll/ۛ᩸֨;->ۘ(Ll/ۙ֨֨;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 2891
    invoke-virtual {v2, p2}, Ll/ۛ᩸֨;->ۜ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ll/ܶ۬֨;->ۢ(Ll/ۗ۠۠;Ll/ۙ֨֨;)V

    return-void

    .line 2894
    :cond_5
    iget-object p2, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    sget-object v0, Ll/ۛᩴ۠;->᩵ۧ:Ll/۫۠۠;

    invoke-virtual {p2, p1, v0}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    return-void
.end method

.method public final ۧ(Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۖܶ۠;
    .locals 1

    .line 1621
    :goto_0
    invoke-virtual {p2}, Ll/ۖܶ۠;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1622
    iget-object v0, p2, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ۙ֨֨;

    invoke-virtual {p0, v0, p1}, Ll/ܶ۬֨;->֫(Ll/ۙ֨֨;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p1

    .line 1621
    iget-object p2, p2, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    :cond_0
    return-object p1
.end method

.method public final ۧ(Ll/ۙ֨֨;Ll/ۖܶ۠;)Ll/ۖܶ۠;
    .locals 1

    .line 1592
    invoke-virtual {p0, p1, p2}, Ll/ܶ۬֨;->ᩳ(Ll/ۙ֨֨;Ll/ۖܶ۠;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p2

    :cond_0
    invoke-virtual {p0, p1, p2}, Ll/ܶ۬֨;->֫(Ll/ۙ֨֨;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p2

    invoke-virtual {p2, p1}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/ۗ۠۠;Ll/ۙ֨֨;)Ll/ۙ֨֨;
    .locals 5

    .line 724
    sget-object v0, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    invoke-virtual {p2, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Ll/ۢ۠֨;->۟:Ll/ۢ۠֨;

    invoke-virtual {p2, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 725
    sget-object v0, Ll/ۨᩴ۠;->ܽۧ:Ll/ۨ۠۠;

    .line 726
    iget-object v1, p0, Ll/ܶ۬֨;->ۡ:Ll/ۛ۠۠;

    invoke-virtual {v1, v0}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object v0

    .line 734
    sget-object v2, Ll/ۢ۠֨;->ۢ֫:Ll/ۢ۠֨;

    invoke-virtual {p2, v2}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 8206
    new-instance v2, Ll/ۨ۠۠;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p2, v3, v4

    const-string p2, "compiler"

    const-string v4, "type.parameter"

    invoke-direct {v2, p2, v4, v3}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 735
    invoke-virtual {v1, v2}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object p2

    .line 725
    :cond_0
    invoke-virtual {p0, p1, v0, p2}, Ll/ܶ۬֨;->֫(Ll/ۗ۠۠;Ll/ܽܶ۠;Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    :cond_1
    return-object p2
.end method

.method public final ۧ(Ll/ܳ֡֨;)Ll/ܳ֡֨;
    .locals 2

    .line 492
    invoke-virtual {p1}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object v0

    iget-object v0, v0, Ll/۠֡֨;->᩺:Ll/֡֡֨;

    iget-object p1, p1, Ll/ܳ֡֨;->᩺:Ll/ۤܶ۠;

    .line 64
    new-instance v1, Ll/᩺ܶ۠;

    invoke-direct {v1, v0, p1}, Ll/᩺ܶ۠;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 492
    iget-object p1, p0, Ll/ܶ۬֨;->ܿ:Ljava/util/HashMap;

    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܳ֡֨;

    return-object p1
.end method

.method public final ۧ()V
    .locals 1

    .line 297
    iget-object v0, p0, Ll/ܶ۬֨;->᩷:Ll/ۙܶ۠;

    invoke-virtual {v0}, Ll/ۙܶ۠;->֫()V

    .line 298
    iget-object v0, p0, Ll/ܶ۬֨;->ۙ:Ll/ۙܶ۠;

    invoke-virtual {v0}, Ll/ۙܶ۠;->֫()V

    .line 299
    iget-object v0, p0, Ll/ܶ۬֨;->ܰ:Ll/ۙܶ۠;

    invoke-virtual {v0}, Ll/ۙܶ۠;->֫()V

    .line 300
    iget-object v0, p0, Ll/ܶ۬֨;->۫:Ll/ۙܶ۠;

    invoke-virtual {v0}, Ll/ۙܶ۠;->֫()V

    return-void
.end method

.method public final ۧ(Ll/֨᩵۠;)V
    .locals 13

    .line 4003
    invoke-virtual {p1}, Ll/֨᩵۠;->ܿ֫()Ll/ۖܶ۠;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧ֡۠;

    .line 4004
    iget-boolean v2, v1, Ll/ۧ֡۠;->۫:Z

    if-eqz v2, :cond_0

    iget-object v2, v1, Ll/ۧ֡۠;->۬:Ll/ۚۚ۠;

    sget-object v3, Ll/ᩴۚ۠;->᩺ۧ:Ll/ᩴۚ۠;

    invoke-virtual {v2, v3}, Ll/ۚۚ۠;->֫(Ll/ᩴۚ۠;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 4006
    :cond_1
    iget-object v2, v1, Ll/ۧ֡۠;->۬:Ll/ۚۚ۠;

    check-cast v2, Ll/ۛ᩵۠;

    .line 4008
    iget-object v3, v2, Ll/ۛ᩵۠;->ۗ:Ll/ۤܶ۠;

    iget-object v4, p0, Ll/ܶ۬֨;->ܶ:Ll/ۛܶ۠;

    iget-object v4, v4, Ll/ۛܶ۠;->ۤ֫:Ll/ۤܶ۠;

    if-eq v3, v4, :cond_0

    iget-object v3, v2, Ll/ۛ᩵۠;->۬:Ll/۫᩵۠;

    invoke-static {v3}, Ll/۟ۚ۠;->᩹(Ll/ۚۚ۠;)Ll/ۛ֡֨;

    move-result-object v3

    if-eqz v3, :cond_0

    iget-object v3, v3, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v4, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-eq v3, v4, :cond_2

    goto :goto_0

    .line 4011
    :cond_2
    iget-object v3, v2, Ll/ۛ᩵۠;->۬:Ll/۫᩵۠;

    invoke-static {v3}, Ll/۟ۚ۠;->᩹(Ll/ۚۚ۠;)Ll/ۛ֡֨;

    move-result-object v3

    check-cast v3, Ll/᩶֡֨;

    .line 4012
    iget-object v7, p1, Ll/֨᩵۠;->᩺:Ll/۠֡֨;

    iget-object v8, v2, Ll/ۛ᩵۠;->ۗ:Ll/ۤܶ۠;

    new-instance v9, Ljava/util/HashSet;

    invoke-direct {v9}, Ljava/util/HashSet;-><init>()V

    move-object v4, p0

    move-object v5, v3

    move-object v6, v3

    invoke-direct/range {v4 .. v9}, Ll/ܶ۬֨;->֫(Ll/᩶֡֨;Ll/᩶֡֨;Ll/۠֡֨;Ll/ۤܶ۠;Ljava/util/HashSet;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 4013
    iget-object v2, v2, Ll/ۛ᩵۠;->ۗ:Ll/ۤܶ۠;

    .line 4018
    invoke-static {v3}, Ll/᩸ᩴ֨;->֫(Ll/ۛ֡֨;)Ll/۠ᩴ֨;

    move-result-object v4

    sget-object v5, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 7608
    new-instance v5, Ll/ۨ۠۠;

    const/4 v6, 0x3

    new-array v7, v6, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v4, v7, v8

    const/4 v4, 0x1

    aput-object v3, v7, v4

    const/4 v3, 0x2

    const/4 v9, 0x0

    aput-object v9, v7, v3

    const-string v10, "compiler"

    const-string v11, "location"

    invoke-direct {v5, v10, v11, v7}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4014
    sget-object v7, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 820
    new-instance v7, Ll/۫۠۠;

    const/4 v11, 0x5

    new-array v11, v11, [Ljava/lang/Object;

    sget-object v12, Ll/۠ᩴ֨;->ۧ֫:Ll/۠ᩴ֨;

    aput-object v12, v11, v8

    aput-object v2, v11, v4

    aput-object v9, v11, v3

    aput-object v9, v11, v6

    const/4 v2, 0x4

    aput-object v5, v11, v2

    const-string v2, "cant.resolve.location"

    invoke-direct {v7, v10, v2, v11}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4013
    iget-object v2, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    invoke-virtual {v2, v1, v7}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    goto/16 :goto_0

    :cond_3
    return-void
.end method

.method public final ۧ(Ll/ۗ۠۠;Ll/ۛ֡֨;)V
    .locals 3

    .line 336
    sget-object v0, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 749
    new-instance v0, Ll/۫۠۠;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const-string p2, "compiler"

    const-string v2, "cant.ref.before.ctor.called"

    invoke-direct {v0, p2, v2, v1}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 336
    iget-object p2, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    invoke-virtual {p2, p1, v0}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    return-void
.end method

.method public final ۧ(Ll/ۗ۠۠;Ll/ۧܶ۠;)V
    .locals 2

    .line 268
    iget-object v0, p0, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    sget-object v1, Ll/᩶ᩴ֨;->۠֫:Ll/᩶ᩴ֨;

    invoke-virtual {v0, v1}, Ll/ۙᩴ֨;->ۧ(Ll/᩶ᩴ֨;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 269
    iget-object v0, p0, Ll/ܶ۬֨;->ܰ:Ll/ۙܶ۠;

    invoke-virtual {v0, p1, p2}, Ll/ۙܶ۠;->֫(Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/ۚۚ۠;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 2880
    iget-object v0, p1, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    invoke-virtual {p0, p1, v0}, Ll/ܶ۬֨;->ۢ(Ll/ۗ۠۠;Ll/ۙ֨֨;)V

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/ۛ֡֨;Ll/ۚۚ۠;)V
    .locals 6

    .line 3575
    sget-object v0, Ll/ۛۢ۠;->ۤ:Ll/ۛۢ۠;

    iget-object v1, p0, Ll/ܶ۬֨;->᩶:Ll/ۛۢ۠;

    if-eq v1, v0, :cond_0

    invoke-virtual {p1}, Ll/ۛ֡֨;->۬()J

    move-result-wide v2

    const-wide v4, 0x200000000000L

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    .line 3576
    sget-object v0, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2828
    new-instance v0, Ll/۫۠۠;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object v1, v2, p1

    const-string p1, "compiler"

    const-string v1, "not.in.profile"

    invoke-direct {v0, p1, v1, v2}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3576
    iget-object p1, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    invoke-virtual {p1, p2, v0}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/ۡ֡۠;Ll/ۙ֨֨;Ll/ۘ֡֨;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    .line 2519
    new-instance v4, Ll/ᩴ۬֨;

    invoke-direct {v4, v0, v2}, Ll/ᩴ۬֨;-><init>(Ll/ܶ۬֨;Ll/ۙ֨֨;)V

    .line 2523
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v5

    .line 2525
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 2526
    iget-object v7, v0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    const/4 v8, 0x0

    invoke-virtual {v7, v2, v8}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Z)Ll/ܿ᩵֨;

    move-result-object v9

    iget-object v10, v3, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    .line 100
    sget-object v11, Ll/֨᩵֨;->᩶:Ll/֨᩵֨;

    invoke-virtual {v9, v10, v4, v11}, Ll/ܿ᩵֨;->֫(Ll/ۤܶ۠;Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;

    move-result-object v4

    .line 2526
    new-instance v9, Ll/ۗۗ֨;

    invoke-direct {v9, v6}, Ll/ۗۗ֨;-><init>(Ljava/util/ArrayList;)V

    invoke-static {v4, v9}, Ll/᩶֨ᩴ;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 2527
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v9, 0x0

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۛ֡֨;

    .line 2528
    iget-object v11, v2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v3, v10, v11, v7, v8}, Ll/ۘ֡֨;->֫(Ll/ۛ֡֨;Ll/᩶֡֨;Ll/ۛ᩸֨;Z)Z

    move-result v11

    if-nez v11, :cond_2

    if-ne v10, v3, :cond_1

    goto :goto_0

    :cond_1
    if-nez v9, :cond_0

    .line 2534
    check-cast v10, Ll/ۘ֡֨;

    invoke-virtual {v5, v10}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v5

    goto :goto_0

    :cond_2
    if-eq v10, v3, :cond_3

    .line 2541
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v5

    const/4 v9, 0x1

    .line 2545
    :cond_3
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_0

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ۛ֡֨;

    if-ne v12, v10, :cond_4

    goto :goto_1

    .line 2549
    :cond_4
    iget-object v8, v3, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v7, v12, v2}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v13

    sget-object v15, Ll/ۧ֡֨;->᩹֫:Ll/ۧ֡֨;

    iget-object v14, v0, Ll/ܶ۬֨;->۬:Ll/ܽ֡֨;

    invoke-virtual {v15, v14}, Ll/ۧ֡֨;->֫(Ll/ܽ֡֨;)Z

    move-result v14

    invoke-virtual {v7, v8, v13, v14}, Ll/ۛ᩸֨;->ۧ(Ll/ۙ֨֨;Ll/ۙ֨֨;Z)Z

    move-result v8

    if-nez v8, :cond_7

    .line 2550
    invoke-virtual {v12, v7}, Ll/ۛ֡֨;->ܽ(Ll/ۛ᩸֨;)Ll/ۙ֨֨;

    move-result-object v8

    invoke-virtual {v10, v7}, Ll/ۛ֡֨;->ܽ(Ll/ۛ᩸֨;)Ll/ۙ֨֨;

    move-result-object v13

    const/4 v14, 0x1

    .line 3255
    invoke-virtual {v7, v8, v13, v14}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۙ֨֨;Z)Z

    move-result v8

    if-eqz v8, :cond_7

    .line 2551
    iget-wide v4, v3, Ll/ۛ֡֨;->᩶:J

    const-wide v8, 0x40000000000L

    or-long/2addr v4, v8

    iput-wide v4, v3, Ll/ۛ֡֨;->᩶:J

    const/4 v4, 0x5

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x6

    const-string v11, "compiler"

    .line 2552
    iget-object v13, v0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    if-ne v10, v3, :cond_5

    .line 2553
    iget-object v3, v10, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    .line 2554
    invoke-virtual {v7, v10, v2}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v14

    invoke-virtual {v14}, Ll/ۙ֨֨;->᩹()Ll/ۧ֨֨;

    move-result-object v14

    .line 1485
    iget-object v14, v14, Ll/ۧ֨֨;->ۤ:Ll/ۖܶ۠;

    .line 2554
    invoke-virtual {v10}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v10

    iget-object v15, v12, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    .line 2555
    invoke-virtual {v7, v12, v2}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۙ֨֨;->᩹()Ll/ۧ֨֨;

    move-result-object v2

    .line 1485
    iget-object v2, v2, Ll/ۧ֨֨;->ۤ:Ll/ۖܶ۠;

    .line 2555
    invoke-virtual {v12}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v7

    .line 2553
    sget-object v12, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2568
    new-instance v12, Ll/۫۠۠;

    new-array v9, v9, [Ljava/lang/Object;

    const/16 v16, 0x0

    aput-object v3, v9, v16

    const/4 v3, 0x1

    aput-object v14, v9, v3

    aput-object v10, v9, v8

    aput-object v15, v9, v6

    aput-object v2, v9, v5

    aput-object v7, v9, v4

    const-string v2, "name.clash.same.erasure.no.override"

    invoke-direct {v12, v11, v2, v9}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2553
    invoke-virtual {v13, v1, v12}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    return-void

    .line 2557
    :cond_5
    move-object v3, v2

    check-cast v3, Ll/᩶ۚ֨;

    .line 2558
    invoke-virtual {v3}, Ll/ۙ֨֨;->ۡ֫()Z

    move-result v4

    if-eqz v4, :cond_6

    const-string v4, "interface"

    goto :goto_2

    :cond_6
    const-string v4, "class"

    .line 2559
    :goto_2
    iget-object v3, v3, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v3, v3, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v5, v10, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    .line 2563
    invoke-virtual {v7, v10, v2}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v6

    invoke-virtual {v6}, Ll/ۙ֨֨;->᩹()Ll/ۧ֨֨;

    move-result-object v6

    .line 1485
    iget-object v6, v6, Ll/ۧ֨֨;->ۤ:Ll/ۖܶ۠;

    .line 2564
    invoke-virtual {v10}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v10

    const/4 v15, 0x4

    iget-object v9, v12, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    .line 2566
    invoke-virtual {v7, v12, v2}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۙ֨֨;->᩹()Ll/ۧ֨֨;

    move-result-object v2

    .line 1485
    iget-object v2, v2, Ll/ۧ֨֨;->ۤ:Ll/ۖܶ۠;

    .line 2567
    invoke-virtual {v12}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v7

    .line 2559
    sget-object v12, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2578
    new-instance v12, Ll/۫۠۠;

    const/16 v17, 0x3

    const/16 v14, 0x8

    new-array v14, v14, [Ljava/lang/Object;

    const/16 v16, 0x0

    aput-object v4, v14, v16

    const/4 v4, 0x1

    aput-object v3, v14, v4

    aput-object v5, v14, v8

    aput-object v6, v14, v17

    aput-object v10, v14, v15

    const/4 v3, 0x5

    aput-object v9, v14, v3

    const/4 v3, 0x6

    aput-object v2, v14, v3

    const/4 v2, 0x7

    aput-object v7, v14, v2

    const-string v2, "name.clash.same.erasure.no.override.1"

    invoke-direct {v12, v11, v2, v14}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2559
    invoke-virtual {v13, v1, v12}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    return-void

    :cond_7
    const/4 v8, 0x0

    goto/16 :goto_1

    :cond_8
    if-nez v9, :cond_9

    .line 2575
    invoke-virtual {v5}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۘ֡֨;

    .line 2576
    invoke-virtual {v0, v1, v2, v3, v5}, Ll/ܶ۬֨;->֫(Ll/ۡ֡۠;Ll/ۙ֨֨;Ll/ۘ֡֨;Ll/ۘ֡֨;)V

    goto :goto_3

    :cond_9
    return-void
.end method

.method public final ۧ(Ll/ܳ֡֨;Ll/ۗ۠۠;)V
    .locals 12

    .line 3892
    iget-object v0, p0, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    sget-object v1, Ll/᩶ᩴ֨;->֫֫:Ll/᩶ᩴ֨;

    invoke-virtual {v0, v1}, Ll/ۙᩴ֨;->֫(Ll/᩶ᩴ֨;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1331
    invoke-virtual {p1}, Ll/ܳ֡֨;->᩶()V

    .line 1332
    iget-wide v0, p1, Ll/ۛ֡֨;->᩶:J

    const-wide v2, 0x2000000000004000L    # 1.491668146245468E-154

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_5

    .line 453
    iget-object v0, p1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {v0}, Ll/ۤܶ۠;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 1331
    invoke-virtual {p1}, Ll/ܳ֡֨;->᩶()V

    .line 1332
    iget-wide v0, p1, Ll/ۛ֡֨;->᩶:J

    const-wide/16 v4, 0x5

    and-long/2addr v0, v4

    cmp-long v6, v0, v2

    if-eqz v6, :cond_5

    .line 3895
    sget-object v0, Ll/ۧ֡֨;->᩷֫:Ll/ۧ֡֨;

    iget-object v1, p0, Ll/ܶ۬֨;->۬:Ll/ܽ֡֨;

    .line 3896
    invoke-virtual {v0, v1}, Ll/ۧ֡֨;->֫(Ll/ܽ֡֨;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 3897
    invoke-virtual {p1}, Ll/ܳ֡֨;->۬֫()Ll/᩻᩹۠;

    move-result-object v0

    .line 3898
    sget-object v1, Ll/ۖ۬֨;->ܳ:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    const/4 v1, 0x2

    if-eq v0, v1, :cond_5

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    goto :goto_1

    .line 3905
    :cond_0
    iget-object v0, p1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    :goto_0
    if-eqz v0, :cond_2

    .line 3906
    iget-object v1, v0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v6, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-ne v1, v6, :cond_2

    .line 3907
    invoke-virtual {v0}, Ll/ۛ֡֨;->۬()J

    move-result-wide v6

    and-long/2addr v6, v4

    cmp-long v1, v6, v2

    if-nez v1, :cond_1

    goto :goto_3

    .line 3909
    :cond_1
    iget-object v0, v0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    goto :goto_0

    .line 3915
    :cond_2
    :goto_1
    invoke-virtual {p1}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object v0

    .line 3916
    invoke-virtual {v0}, Ll/۠֡֨;->ۙ֫()Z

    move-result v1

    if-nez v1, :cond_5

    .line 3917
    iget-object v1, v0, Ll/۠֡֨;->᩺:Ll/֡֡֨;

    .line 3918
    iget-object v2, v1, Ll/֡֡֨;->ܰ:Ll/ۖܶ۠;

    invoke-virtual {v2}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܿᩴ֨;

    .line 3921
    iget-object v4, v3, Ll/ܿᩴ֨;->ܽ:Ll/۠֡֨;

    invoke-virtual {v4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 3922
    iget-object v3, v3, Ll/ܿᩴ֨;->ۧ:Ll/ۖܶ۠;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 3926
    :cond_4
    new-instance v3, Ll/ܰۗ֨;

    move-object v6, v3

    move-object v7, p0

    move-object v8, p2

    move-object v9, p1

    move-object v10, v0

    move-object v11, v1

    invoke-direct/range {v6 .. v11}, Ll/ܰۗ֨;-><init>(Ll/ܶ۬֨;Ll/ۗ۠۠;Ll/ܳ֡֨;Ll/۠֡֨;Ll/֡֡֨;)V

    iget-object v4, p0, Ll/ܶ۬֨;->ۜ:Ll/ᩳᩴ֨;

    invoke-virtual {v4, v3}, Ll/ᩳᩴ֨;->֫(Ll/ܽᩴ֨;)V

    goto :goto_2

    :cond_5
    :goto_3
    return-void
.end method

.method public final ۧ(Ll/ܿ᩵۠;Z)V
    .locals 3

    .line 3088
    iget-object v0, p1, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    invoke-static {v0}, Ll/۫ۙ;->֫(Ljava/lang/Object;)V

    .line 2867
    new-instance v0, Ll/ۜ۬֨;

    invoke-direct {v0, p0}, Ll/ۜ۬֨;-><init>(Ll/ܶ۬֨;)V

    invoke-virtual {p1, v0}, Ll/ܿ᩵۠;->֫(Ll/֡ۚ۠;)V

    .line 3091
    sget-object v0, Ll/ᩴۚ۠;->֨ܽ:Ll/ᩴۚ۠;

    invoke-virtual {p1, v0}, Ll/ۚۚ۠;->֫(Ll/ᩴۚ۠;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Ll/ܿ᩵۠;->ۗ:Ll/ۚۚ۠;

    iget-object v0, v0, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    .line 3092
    invoke-virtual {v0}, Ll/ۙ֨֨;->᩻֫()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3093
    invoke-virtual {p0, p1, p2}, Ll/ܶ۬֨;->֫(Ll/ܿ᩵۠;Z)Z

    move-result p2

    if-nez p2, :cond_0

    .line 3094
    iget-object p2, p1, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    sget-object v0, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 167
    new-instance v0, Ll/۫۠۠;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const-string p2, "compiler"

    const-string v2, "annotation.type.not.applicable.to.type"

    invoke-direct {v0, p2, v2, v1}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3094
    iget-object p2, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    invoke-virtual {p2, p1, v0}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/ۙ֨֨;)Z
    .locals 3

    .line 1650
    sget-object v0, Ll/ۢ۠֨;->ۢ֫:Ll/ۢ۠֨;

    invoke-virtual {p1, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    iget-object v1, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    if-eqz v0, :cond_0

    invoke-virtual {v1, p1}, Ll/ۛ᩸֨;->᩸(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܶ۬֨;->ۧ(Ll/ۙ֨֨;)Z

    move-result p1

    return p1

    .line 1651
    :cond_0
    sget-object v0, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    invoke-virtual {p1, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object p1, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    check-cast p1, Ll/ܳ֡֨;

    .line 1640
    iget-object v0, p1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v2, Ll/֨ᩴ֨;->᩺:Ll/֨ᩴ֨;

    if-eq v0, v2, :cond_2

    iget-object v0, p0, Ll/ܶ۬֨;->ۤ:Ll/᩷ۚ֨;

    iget-object v2, v0, Ll/᩷ۚ֨;->۬:Ll/ۙ֨֨;

    iget-object v2, v2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 1642
    invoke-virtual {p1, v2, v1}, Ll/ܳ֡֨;->ۧ(Ll/ۛ֡֨;Ll/ۛ᩸֨;)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v0, v0, Ll/᩷ۚ֨;->֫ۧ:Ll/ۙ֨֨;

    iget-object v0, v0, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 1643
    invoke-virtual {p1, v0, v1}, Ll/ܳ֡֨;->ۧ(Ll/ۛ֡֨;Ll/ۛ᩸֨;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1

    .line 1652
    :cond_3
    sget-object v0, Ll/ۢ۠֨;->۫:Ll/ۢ۠֨;

    invoke-virtual {p1, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result p1

    return p1
.end method

.method public final ۧ(Ll/᩶֡֨;)[Ll/ۤܶ۠;
    .locals 5

    .line 3319
    invoke-virtual {p0, p1}, Ll/ܶ۬֨;->֫(Ll/᩶֡֨;)Ll/֫ۘ֨;

    move-result-object p1

    if-nez p1, :cond_0

    .line 3322
    invoke-direct {p0}, Ll/ܶ۬֨;->ܽ()[Ll/ۤܶ۠;

    move-result-object p1

    return-object p1

    .line 3321
    :cond_0
    iget-object p1, p1, Ll/֫ۘ֨;->ۧ:[Ll/ۡۘ֨;

    .line 3325
    array-length v0, p1

    new-array v0, v0, [Ll/ۤܶ۠;

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 3326
    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_2

    .line 3327
    aget-object v3, p1, v2

    .line 3328
    instance-of v4, v3, Ll/ܿۘ֨;

    if-eqz v4, :cond_1

    check-cast v3, Ll/ܿۘ֨;

    .line 3331
    iget-object v3, v3, Ll/ܿۘ֨;->ۧ:Ll/۫֡֨;

    iget-object v3, v3, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-array p1, v1, [Ll/ۤܶ۠;

    return-object p1

    :cond_2
    return-object v0
.end method

.method public final ܳ(Ll/ۗ۠۠;Ll/ۙ֨֨;)V
    .locals 0

    .line 2375
    invoke-direct {p0, p1, p2}, Ll/ܶ۬֨;->ۡ(Ll/ۗ۠۠;Ll/ۙ֨֨;)Z

    return-void
.end method

.method public final ܽ(Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۖܶ۠;
    .locals 3

    .line 1629
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    move-object v1, p1

    .line 1630
    :goto_0
    invoke-virtual {v1}, Ll/ۖܶ۠;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1631
    iget-object v2, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v2, Ll/ۙ֨֨;

    invoke-virtual {p0, v2, p2}, Ll/ܶ۬֨;->ᩳ(Ll/ۙ֨֨;Ll/ۖܶ۠;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v2, Ll/ۙ֨֨;

    invoke-virtual {p0, v2, v0}, Ll/ܶ۬֨;->ۧ(Ll/ۙ֨֨;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v0

    .line 1630
    :cond_0
    iget-object v1, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    .line 1632
    :cond_1
    :goto_1
    invoke-virtual {p2}, Ll/ۖܶ۠;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1633
    iget-object v1, p2, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v1, Ll/ۙ֨֨;

    invoke-virtual {p0, v1, p1}, Ll/ܶ۬֨;->ᩳ(Ll/ۙ֨֨;Ll/ۖܶ۠;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p2, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v1, Ll/ۙ֨֨;

    invoke-virtual {p0, v1, v0}, Ll/ܶ۬֨;->ۧ(Ll/ۙ֨֨;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v0

    .line 1632
    :cond_2
    iget-object p2, p2, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_1

    :cond_3
    return-object v0
.end method

.method public final ܽ(Ll/ܳ֡֨;)Ll/ۤܶ۠;
    .locals 6

    .line 454
    iget-object v0, p1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    invoke-virtual {v0}, Ll/ۛ֡֨;->ۙ()Ll/ܳ֡֨;

    move-result-object v0

    iget-object v0, v0, Ll/ܳ֡֨;->᩺:Ll/ۤܶ۠;

    .line 455
    invoke-virtual {v0}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v1

    .line 456
    new-instance v2, Ll/᩺ܶ۠;

    iget-object v3, p1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-direct {v2, v0, v3}, Ll/᩺ܶ۠;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 457
    iget-object v0, p0, Ll/ܶ۬֨;->ۚ:Ljava/util/HashMap;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    if-nez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    .line 458
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 0
    :goto_0
    invoke-static {v1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 459
    iget-char v5, p0, Ll/ܶ۬֨;->ۛ:C

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v5, p1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 414
    iget-object v5, p0, Ll/ܶ۬֨;->ܶ:Ll/ۛܶ۠;

    iget-object v5, v5, Ll/ۛܶ۠;->ᩴܽ:Ll/۫ܶ۠;

    invoke-virtual {v5, v4}, Ll/۫ܶ۠;->֫(Ljava/lang/String;)Ll/ۤܶ۠;

    move-result-object v4

    .line 461
    invoke-virtual {p1}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object v5

    iget-object v5, v5, Ll/۠֡֨;->᩺:Ll/֡֡֨;

    invoke-virtual {p0, v5, v4}, Ll/ܶ۬֨;->֫(Ll/֡֡֨;Ll/ۤܶ۠;)Ll/ܳ֡֨;

    move-result-object v5

    if-nez v5, :cond_1

    add-int/lit8 v3, v3, 0x1

    .line 462
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v4

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0
.end method

.method public final ܽ(Ll/֨᩵۠;)V
    .locals 13

    .line 3795
    iget-object v0, p1, Ll/֨᩵۠;->᩺:Ll/۠֡֨;

    invoke-static {v0}, Ll/ܰ᩵֨;->ۜ(Ll/ۛ֡֨;)Ll/ܰ᩵֨;

    move-result-object v0

    .line 3796
    iget-object v1, p1, Ll/֨᩵۠;->᩺:Ll/۠֡֨;

    invoke-static {v1}, Ll/ܰ᩵֨;->ۜ(Ll/ۛ֡֨;)Ll/ܰ᩵֨;

    move-result-object v8

    .line 3797
    iget-object v9, p1, Ll/֨᩵۠;->֫֫:Ll/ܰ᩵֨;

    .line 3799
    iget-object p1, p1, Ll/֨᩵۠;->ۗ:Ll/ۖܶ۠;

    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚۚ۠;

    .line 3800
    sget-object v2, Ll/ᩴۚ۠;->ۗ֫:Ll/ᩴۚ۠;

    invoke-virtual {v1, v2}, Ll/ۚۚ۠;->֫(Ll/ᩴۚ۠;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 3803
    :cond_0
    move-object v10, v1

    check-cast v10, Ll/ۧ֡۠;

    .line 3805
    iget-object v1, v10, Ll/ۧ֡۠;->ۗ:Ll/۟᩵֨;

    if-nez v1, :cond_1

    goto :goto_0

    .line 3808
    :cond_1
    new-instance v2, Ll/᩹ۗ֨;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 75
    sget-object v3, Ll/֨᩵֨;->᩶:Ll/֨᩵֨;

    invoke-virtual {v1, v2, v3}, Ll/۟᩵֨;->֫(Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;

    move-result-object v1

    .line 3808
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Ll/ۛ֡֨;

    .line 682
    iget-boolean v1, v10, Ll/ۧ֡۠;->۫:Z

    if-eqz v1, :cond_2

    const/4 v7, 0x1

    move-object v1, p0

    move-object v2, v10

    move-object v3, v0

    move-object v4, v8

    move-object v5, v9

    move-object v6, v12

    .line 3810
    invoke-direct/range {v1 .. v7}, Ll/ܶ۬֨;->֫(Ll/ۧ֡۠;Ll/۟᩵֨;Ll/۟᩵֨;Ll/۟᩵֨;Ll/ۛ֡֨;Z)V

    .line 3811
    invoke-virtual {v8, v12}, Ll/ܰ᩵֨;->ܿ(Ll/ۛ֡֨;)V

    goto :goto_1

    :cond_2
    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, v10

    move-object v3, v0

    move-object v4, v8

    move-object v5, v9

    move-object v6, v12

    .line 3813
    invoke-direct/range {v1 .. v7}, Ll/ܶ۬֨;->֫(Ll/ۧ֡۠;Ll/۟᩵֨;Ll/۟᩵֨;Ll/۟᩵֨;Ll/ۛ֡֨;Z)V

    .line 3814
    invoke-virtual {v0, v12}, Ll/ܰ᩵֨;->ܿ(Ll/ۛ֡֨;)V

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    .line 3818
    iput-object v1, v10, Ll/ۧ֡۠;->ۗ:Ll/۟᩵֨;

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final ܽ(Ll/ۗ۠۠;Ll/ۙ֨֨;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 2495
    iget-object v3, v0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    invoke-virtual {v3, v2}, Ll/ۛ᩸֨;->ۖ(Ll/ۙ֨֨;)Ll/ۖܶ۠;

    move-result-object v4

    .line 2496
    invoke-virtual {v3, v2}, Ll/ۛ᩸֨;->᩸(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v5

    .line 2497
    sget-object v6, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    invoke-virtual {v5, v6}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v6

    const-wide/16 v7, 0x0

    if-eqz v6, :cond_0

    iget-object v6, v5, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 2498
    invoke-virtual {v6}, Ll/ۛ֡֨;->۬()J

    move-result-wide v9

    const-wide/16 v11, 0x400

    and-long/2addr v9, v11

    cmp-long v6, v9, v7

    if-eqz v6, :cond_0

    .line 2499
    invoke-virtual {v4, v5}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v4

    :cond_0
    move-object v5, v4

    .line 2500
    :goto_0
    invoke-virtual {v5}, Ll/ۖܶ۠;->ܽ()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 2501
    iget-object v6, v5, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v6, Ll/ۙ֨֨;

    invoke-virtual {v6}, Ll/ۙ֨֨;->ܽ֫()Ll/ۖܶ۠;

    move-result-object v6

    invoke-virtual {v6}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_1

    iget-object v6, v5, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v6, Ll/ۙ֨֨;

    .line 2502
    invoke-virtual {v0, v1, v6, v6, v2}, Ll/ܶ۬֨;->֫(Ll/ۗ۠۠;Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v6

    if-nez v6, :cond_1

    goto/16 :goto_7

    :cond_1
    move-object v6, v4

    :goto_1
    if-eq v6, v5, :cond_3

    .line 2505
    iget-object v9, v5, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v9, Ll/ۙ֨֨;

    iget-object v10, v6, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v10, Ll/ۙ֨֨;

    invoke-virtual {v0, v1, v9, v10, v2}, Ll/ܶ۬֨;->֫(Ll/ۗ۠۠;Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v9

    if-nez v9, :cond_2

    goto/16 :goto_7

    .line 2504
    :cond_2
    iget-object v6, v6, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_1

    .line 2500
    :cond_3
    iget-object v5, v5, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    .line 1929
    :cond_4
    invoke-virtual {v3, v2}, Ll/ۛ᩸֨;->᩸(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v4

    .line 1930
    sget-object v5, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    invoke-virtual {v4, v5}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v5

    if-nez v5, :cond_5

    goto/16 :goto_7

    :cond_5
    move-object v5, v4

    .line 1933
    :goto_2
    sget-object v6, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    invoke-virtual {v5, v6}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v6

    if-eqz v6, :cond_11

    iget-object v6, v5, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v6, v6, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v6}, Ll/ۙ֨֨;->ۘ֫()Z

    move-result v6

    if-eqz v6, :cond_11

    .line 1935
    iget-object v6, v5, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v6}, Ll/ۛ֡֨;->֨֫()Ll/ܰ᩵֨;

    move-result-object v6

    sget-object v9, Ll/֨᩵֨;->᩹:Ll/֨᩵֨;

    const/4 v10, 0x0

    .line 82
    invoke-virtual {v6, v10, v9}, Ll/۟᩵֨;->֫(Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;

    move-result-object v6

    .line 1935
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_6
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_10

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۛ֡֨;

    .line 1936
    iget-object v10, v9, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v11, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-ne v10, v11, :cond_6

    .line 1937
    invoke-virtual {v9}, Ll/ۛ֡֨;->۬()J

    move-result-wide v10

    const-wide v12, 0x80001008L    # 1.060999923E-314

    and-long/2addr v10, v12

    cmp-long v14, v10, v7

    if-nez v14, :cond_6

    iget-object v10, v2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 1938
    invoke-virtual {v9, v10, v3}, Ll/ۛ֡֨;->֫(Ll/ۛ֡֨;Ll/ۛ᩸֨;)Z

    move-result v10

    if-eqz v10, :cond_6

    move-object v10, v9

    check-cast v10, Ll/ۘ֡֨;

    iget-object v11, v2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    const/4 v14, 0x1

    .line 1939
    invoke-virtual {v10, v11, v3, v14}, Ll/ۘ֡֨;->֫(Ll/᩶֡֨;Ll/ۛ᩸֨;Z)Ll/ۘ֡֨;

    move-result-object v10

    if-eq v10, v9, :cond_7

    goto :goto_3

    .line 1943
    :cond_7
    invoke-virtual {v3, v9, v5}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v10

    .line 1944
    invoke-virtual {v10}, Ll/ۙ֨֨;->ܰ()Ll/ۖܶ۠;

    move-result-object v11

    invoke-virtual {v11}, Ll/ۖܶ۠;->ۧ()I

    move-result v11

    .line 1945
    iget-object v15, v9, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    if-ne v10, v15, :cond_8

    goto :goto_3

    :cond_8
    move-object v15, v4

    .line 1948
    :goto_4
    sget-object v7, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    invoke-virtual {v15, v7}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v7

    if-eqz v7, :cond_f

    .line 1950
    iget-object v7, v15, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v7}, Ll/ۛ֡֨;->֨֫()Ll/ܰ᩵֨;

    move-result-object v7

    iget-object v8, v9, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {v7, v8}, Ll/۟᩵֨;->֫(Ll/ۤܶ۠;)Ljava/lang/Iterable;

    move-result-object v7

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_e

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۛ֡֨;

    if-eq v8, v9, :cond_c

    .line 1951
    iget-object v12, v8, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v13, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-ne v12, v13, :cond_b

    .line 1953
    invoke-virtual {v8}, Ll/ۛ֡֨;->۬()J

    move-result-wide v12

    const-wide v18, 0x80001008L    # 1.060999923E-314

    and-long v12, v12, v18

    const-wide/16 v16, 0x0

    cmp-long v20, v12, v16

    if-nez v20, :cond_d

    iget-object v12, v8, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 1954
    invoke-virtual {v12}, Ll/ۙ֨֨;->ܰ()Ll/ۖܶ۠;

    move-result-object v12

    invoke-virtual {v12}, Ll/ۖܶ۠;->ۧ()I

    move-result v12

    if-ne v12, v11, :cond_d

    iget-object v12, v2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 1955
    invoke-virtual {v8, v12, v3}, Ll/ۛ֡֨;->֫(Ll/ۛ֡֨;Ll/ۛ᩸֨;)Z

    move-result v12

    if-eqz v12, :cond_d

    move-object v12, v8

    check-cast v12, Ll/ۘ֡֨;

    iget-object v13, v2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 1956
    invoke-virtual {v12, v13, v3, v14}, Ll/ۘ֡֨;->֫(Ll/᩶֡֨;Ll/ۛ᩸֨;Z)Ll/ۘ֡֨;

    move-result-object v12

    if-eq v12, v8, :cond_9

    goto :goto_6

    .line 1960
    :cond_9
    invoke-virtual {v3, v8, v15}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v12

    .line 1961
    invoke-virtual {v3, v10, v12}, Ll/ۛ᩸֨;->ۜ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v12

    if-eqz v12, :cond_a

    .line 1963
    sget-object v12, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 944
    new-instance v12, Ll/۫۠۠;

    const/4 v13, 0x5

    new-array v13, v13, [Ljava/lang/Object;

    const/16 v20, 0x0

    aput-object v9, v13, v20

    aput-object v5, v13, v14

    const/4 v14, 0x2

    aput-object v8, v13, v14

    const/4 v8, 0x3

    aput-object v15, v13, v8

    const/4 v8, 0x4

    aput-object v4, v13, v8

    const-string v8, "compiler"

    const-string v14, "concrete.inheritance.conflict"

    invoke-direct {v12, v8, v14, v13}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1962
    iget-object v8, v0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    invoke-virtual {v8, v1, v12}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    :cond_a
    const/4 v14, 0x1

    goto :goto_6

    :cond_b
    const-wide/16 v16, 0x0

    const-wide v18, 0x80001008L    # 1.060999923E-314

    goto :goto_6

    :cond_c
    move-wide/from16 v18, v12

    const-wide/16 v16, 0x0

    :cond_d
    :goto_6
    move-wide/from16 v12, v18

    goto/16 :goto_5

    :cond_e
    move-wide/from16 v18, v12

    const-wide/16 v16, 0x0

    .line 1949
    invoke-virtual {v3, v15}, Ll/ۛ᩸֨;->᩸(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v15

    const/4 v14, 0x1

    goto/16 :goto_4

    :cond_f
    const-wide/16 v16, 0x0

    move-wide/from16 v7, v16

    goto/16 :goto_3

    :cond_10
    move-wide/from16 v16, v7

    .line 1934
    invoke-virtual {v3, v5}, Ll/ۛ᩸֨;->᩸(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v5

    goto/16 :goto_2

    :cond_11
    :goto_7
    return-void
.end method

.method public final ܽ(Ll/ۗ۠۠;Ll/ۧܶ۠;)V
    .locals 2

    .line 276
    iget-object v0, p0, Ll/ܶ۬֨;->֡:Ll/ۙᩴ֨;

    sget-object v1, Ll/᩶ᩴ֨;->ܶ֫:Ll/᩶ᩴ֨;

    invoke-virtual {v0, v1}, Ll/ۙᩴ֨;->֫(Ll/᩶ᩴ֨;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 277
    iget-object v0, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    invoke-virtual {v0, v1, p1, p2}, Ll/ۖ֨۠;->ۧ(Ll/᩶ᩴ֨;Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    :cond_0
    return-void
.end method

.method public final ܽ(Ll/ۛ֡֨;Ll/ۚۚ۠;)V
    .locals 5

    .line 3567
    invoke-virtual {p1}, Ll/ۛ֡֨;->۬()J

    move-result-wide v0

    const-wide v2, 0x4000000000L

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 3568
    new-instance v0, Ll/ܿ۬֨;

    invoke-direct {v0, p0, p2, p1}, Ll/ܿ۬֨;-><init>(Ll/ܶ۬֨;Ll/ۗ۠۠;Ll/ۛ֡֨;)V

    iget-object p1, p0, Ll/ܶ۬֨;->ۜ:Ll/ᩳᩴ֨;

    invoke-virtual {p1, v0}, Ll/ᩳᩴ֨;->֫(Ll/ܽᩴ֨;)V

    :cond_0
    return-void
.end method

.method public final ܽ(Ll/ۙ֨֨;Ll/ۖܶ۠;)Z
    .locals 3

    .line 1583
    :goto_0
    invoke-virtual {p2}, Ll/ۖܶ۠;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1584
    iget-object v0, p2, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ۙ֨֨;

    .line 1071
    iget-object v1, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v0, v2}, Ll/ۛ᩸֨;->ܽ(Ll/ۙ֨֨;Ll/ۙ֨֨;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1584
    iget-object v0, p2, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ۙ֨֨;

    .line 1071
    invoke-virtual {v1, v0, p1, v2}, Ll/ۛ᩸֨;->ܽ(Ll/ۙ֨֨;Ll/ۙ֨֨;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 1583
    :cond_0
    iget-object p2, p2, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    :cond_1
    :goto_1
    return v2

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final ܿ(Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۖܶ۠;
    .locals 1

    .line 1612
    :goto_0
    invoke-virtual {p2}, Ll/ۖܶ۠;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1613
    iget-object v0, p2, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ۙ֨֨;

    invoke-virtual {p0, v0, p1}, Ll/ܶ۬֨;->ۧ(Ll/ۙ֨֨;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p1

    .line 1612
    iget-object p2, p2, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    :cond_0
    return-object p1
.end method

.method public final ܿ(Ll/ۗ۠۠;Ll/ۙ֨֨;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 2631
    new-instance v2, Ll/ۚ۬֨;

    invoke-direct {v2, v0, v1}, Ll/ۚ۬֨;-><init>(Ll/ܶ۬֨;Ll/ۙ֨֨;)V

    .line 2632
    iget-object v3, v0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    const/4 v4, 0x0

    invoke-virtual {v3, v1, v4}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Z)Ll/ܿ᩵֨;

    move-result-object v4

    .line 75
    sget-object v5, Ll/֨᩵֨;->᩶:Ll/֨᩵֨;

    invoke-virtual {v4, v2, v5}, Ll/ܿ᩵֨;->֫(Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;

    move-result-object v2

    .line 2632
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۛ֡֨;

    .line 2633
    iget-object v5, v4, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v6, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    const/4 v7, 0x1

    if-ne v5, v6, :cond_0

    const/4 v5, 0x1

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    :goto_1
    invoke-static {v5}, Ll/۫ۙ;->֫(Z)V

    .line 2634
    move-object v5, v4

    check-cast v5, Ll/ۘ֡֨;

    invoke-virtual {v3, v1, v5}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۘ֡֨;)Ll/ۖܶ۠;

    move-result-object v5

    .line 218
    invoke-virtual {v5}, Ll/ۖܶ۠;->ۧ()I

    move-result v6

    if-le v6, v7, :cond_5

    .line 2636
    new-instance v6, Ll/ᩴܶ۠;

    invoke-direct {v6}, Ll/ᩴܶ۠;-><init>()V

    .line 2637
    new-instance v8, Ll/ᩴܶ۠;

    invoke-direct {v8}, Ll/ᩴܶ۠;-><init>()V

    .line 2638
    invoke-virtual {v5}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۘ֡֨;

    .line 111
    iget-wide v10, v9, Ll/ۛ֡֨;->᩶:J

    const-wide v12, 0x80000000000L

    and-long/2addr v12, v10

    const-wide/16 v14, 0x0

    cmp-long v16, v12, v14

    if-eqz v16, :cond_1

    .line 2640
    invoke-virtual {v8, v9}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    const-wide/16 v12, 0x400

    and-long/2addr v10, v12

    cmp-long v12, v10, v14

    if-eqz v12, :cond_2

    .line 2642
    invoke-virtual {v6, v9}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    .line 2644
    :cond_2
    :goto_3
    invoke-virtual {v8}, Ll/ᩴܶ۠;->ᩳ()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-virtual {v8}, Ll/ᩴܶ۠;->size()I

    move-result v9

    invoke-virtual {v6}, Ll/ᩴܶ۠;->size()I

    move-result v10

    add-int/2addr v10, v9

    const/4 v9, 0x2

    if-lt v10, v9, :cond_4

    .line 2649
    invoke-virtual {v8}, Ll/ᩴܶ۠;->first()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۛ֡֨;

    .line 2651
    invoke-virtual {v8}, Ll/ᩴܶ۠;->size()I

    move-result v10

    const/4 v13, 0x6

    const/4 v14, 0x3

    const/4 v15, 0x0

    const-string v11, "compiler"

    if-le v10, v7, :cond_3

    .line 2652
    invoke-virtual {v8}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v6

    iget-object v6, v6, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    iget-object v6, v6, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v6, Ll/ۛ֡֨;

    .line 2653
    iget-object v7, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-static {v7}, Ll/᩸ᩴ֨;->֫(Ll/ۛ֡֨;)Ll/۠ᩴ֨;

    move-result-object v7

    iget-object v8, v4, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    .line 2654
    invoke-virtual {v3, v4, v1}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۙ֨֨;->ܰ()Ll/ۖܶ۠;

    move-result-object v4

    .line 2655
    invoke-virtual {v5}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v10

    invoke-virtual {v6}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v17

    .line 2653
    sget-object v18, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    const/16 v18, 0x1

    .line 7263
    new-instance v12, Ll/ۨ۠۠;

    new-array v13, v13, [Ljava/lang/Object;

    aput-object v7, v13, v15

    aput-object v1, v13, v18

    aput-object v8, v13, v9

    aput-object v4, v13, v14

    const/4 v4, 0x4

    aput-object v10, v13, v4

    const/4 v4, 0x5

    aput-object v17, v13, v4

    const-string v4, "incompatible.unrelated.defaults"

    invoke-direct {v12, v11, v4, v13}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_4

    :cond_3
    const/16 v18, 0x1

    .line 2658
    invoke-virtual {v6}, Ll/ᩴܶ۠;->first()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۛ֡֨;

    .line 2659
    iget-object v7, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-static {v7}, Ll/᩸ᩴ֨;->֫(Ll/ۛ֡֨;)Ll/۠ᩴ֨;

    move-result-object v7

    iget-object v8, v4, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    .line 2660
    invoke-virtual {v3, v4, v1}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۙ֨֨;->ܰ()Ll/ۖܶ۠;

    move-result-object v4

    .line 2661
    invoke-virtual {v5}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v9

    invoke-virtual {v6}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v10

    .line 2659
    sget-object v12, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    const/4 v12, 0x2

    .line 7129
    new-instance v14, Ll/ۨ۠۠;

    new-array v13, v13, [Ljava/lang/Object;

    aput-object v7, v13, v15

    aput-object v1, v13, v18

    aput-object v8, v13, v12

    const/4 v7, 0x3

    aput-object v4, v13, v7

    const/4 v4, 0x4

    aput-object v9, v13, v4

    const/4 v4, 0x5

    aput-object v10, v13, v4

    const-string v4, "incompatible.abstract.default"

    invoke-direct {v14, v11, v4, v13}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    move-object v12, v14

    :goto_4
    const/4 v4, 0x2

    .line 2663
    invoke-virtual {v5}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v5

    iget-object v5, v5, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v6}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v6

    iget-object v6, v6, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    sget-object v7, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 3819
    new-instance v7, Ll/۫۠۠;

    const/4 v8, 0x3

    new-array v8, v8, [Ljava/lang/Object;

    aput-object v5, v8, v15

    aput-object v6, v8, v18

    aput-object v12, v8, v4

    const-string v4, "types.incompatible"

    invoke-direct {v7, v11, v4, v8}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2663
    iget-object v4, v0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    move-object/from16 v9, p1

    invoke-virtual {v4, v9, v7}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    goto/16 :goto_0

    :cond_4
    move-object/from16 v9, p1

    const/4 v7, 0x1

    goto/16 :goto_2

    :cond_5
    move-object/from16 v9, p1

    goto/16 :goto_0

    :cond_6
    return-void
.end method

.method public final ܿ(Ll/ܳ֡֨;)V
    .locals 2

    .line 500
    invoke-virtual {p1}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object v0

    iget-object v0, v0, Ll/۠֡֨;->᩺:Ll/֡֡֨;

    iget-object p1, p1, Ll/ܳ֡֨;->᩺:Ll/ۤܶ۠;

    .line 64
    new-instance v1, Ll/᩺ܶ۠;

    invoke-direct {v1, v0, p1}, Ll/᩺ܶ۠;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 500
    iget-object p1, p0, Ll/ܶ۬֨;->ܿ:Ljava/util/HashMap;

    invoke-virtual {p1, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ᩳ(Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۖܶ۠;
    .locals 3

    .line 1681
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    .line 1682
    :goto_0
    invoke-virtual {p1}, Ll/ۖܶ۠;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1683
    iget-object v1, p1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v1, Ll/ۙ֨֨;

    .line 1673
    invoke-virtual {p0, v1}, Ll/ܶ۬֨;->ۧ(Ll/ۙ֨֨;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p0, v1, p2}, Ll/ܶ۬֨;->ᩳ(Ll/ۙ֨֨;Ll/ۖܶ۠;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 1683
    :cond_0
    iget-object v1, p1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v1, Ll/ۙ֨֨;

    invoke-virtual {v0, v1}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v0

    .line 1682
    :cond_1
    :goto_1
    iget-object p1, p1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public final ᩳ(Ll/ۗ۠۠;Ll/ۙ֨֨;)Ll/ۙ֨֨;
    .locals 9

    .line 742
    invoke-virtual {p0, p1, p2}, Ll/ܶ۬֨;->֫(Ll/ۗ۠۠;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p2

    .line 743
    sget-object v0, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    invoke-virtual {p2, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    iget-object v1, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    iget-object v2, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    if-eqz v0, :cond_2

    .line 744
    iget-object v0, p2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v0}, Ll/ۛ֡֨;->۬()J

    move-result-wide v3

    const-wide/16 v5, 0x600

    and-long/2addr v3, v5

    const/4 v0, 0x1

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-eqz v7, :cond_0

    .line 745
    iget-object v3, p2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    sget-object v4, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 46
    new-instance v4, Ll/۫۠۠;

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v3, v0, v5

    const-string v3, "compiler"

    const-string v5, "abstract.cant.be.instantiated"

    invoke-direct {v4, v3, v5, v0}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 745
    invoke-virtual {v1, p1, v4}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    .line 746
    invoke-virtual {v2, p2}, Ll/ۛ᩸֨;->ܳ(Ll/ۙ֨֨;)Ll/۫ۚ֨;

    move-result-object p1

    return-object p1

    .line 747
    :cond_0
    iget-object v3, p2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v3}, Ll/ۛ֡֨;->۬()J

    move-result-wide v3

    const-wide/16 v7, 0x4000

    and-long/2addr v3, v7

    cmp-long v7, v3, v5

    if-eqz v7, :cond_1

    .line 748
    sget-object v0, Ll/ۛᩴ۠;->ܳ֫:Ll/۫۠۠;

    invoke-virtual {v1, p1, v0}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    .line 749
    invoke-virtual {v2, p2}, Ll/ۛ᩸֨;->ܳ(Ll/ۙ֨֨;)Ll/۫ۚ֨;

    move-result-object p1

    return-object p1

    .line 751
    :cond_1
    invoke-virtual {p0, p1, p2, v0}, Ll/ܶ۬֨;->֫(Ll/ۗ۠۠;Ll/ۙ֨֨;Z)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 753
    :cond_2
    sget-object v0, Ll/ۢ۠֨;->ۗ:Ll/ۢ۠֨;

    invoke-virtual {p2, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 754
    move-object v0, p2

    check-cast v0, Ll/ۚۚ֨;

    iget-object v0, v0, Ll/ۚۚ֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v2, v0}, Ll/ۛ᩸֨;->֡(Ll/ۙ֨֨;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 755
    sget-object v0, Ll/ۛᩴ۠;->᩹֫:Ll/۫۠۠;

    invoke-virtual {v1, p1, v0}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    .line 756
    invoke-virtual {v2, p2}, Ll/ۛ᩸֨;->ܳ(Ll/ۙ֨֨;)Ll/۫ۚ֨;

    move-result-object p1

    return-object p1

    :cond_3
    return-object p2
.end method

.method public final ᩳ(Ll/ܳ֡֨;)V
    .locals 3

    .line 488
    invoke-virtual {p1}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object v0

    iget-object v0, v0, Ll/۠֡֨;->᩺:Ll/֡֡֨;

    iget-object v1, p1, Ll/ܳ֡֨;->᩺:Ll/ۤܶ۠;

    .line 64
    new-instance v2, Ll/᩺ܶ۠;

    invoke-direct {v2, v0, v1}, Ll/᩺ܶ۠;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 488
    iget-object v0, p0, Ll/ܶ۬֨;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ᩳ(Ll/ۙ֨֨;Ll/ۖܶ۠;)Z
    .locals 3

    .line 1574
    :goto_0
    invoke-virtual {p2}, Ll/ۖܶ۠;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1575
    iget-object v0, p2, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ۙ֨֨;

    .line 1071
    iget-object v1, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v0, v2}, Ll/ۛ᩸֨;->ܽ(Ll/ۙ֨֨;Ll/ۙ֨֨;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return v2

    .line 1574
    :cond_0
    iget-object p2, p2, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩷(Ll/ۗ۠۠;Ll/ۙ֨֨;)Ll/ۙ֨֨;
    .locals 2

    .line 788
    invoke-virtual {p2}, Ll/ۙ֨֨;->֨֫()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p2

    .line 791
    :cond_0
    iget-object v0, p0, Ll/ܶ۬֨;->ۡ:Ll/ۛ۠۠;

    sget-object v1, Ll/ۨᩴ۠;->ܳۧ:Ll/ۨ۠۠;

    .line 792
    invoke-virtual {v0, v1}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object v0

    .line 791
    invoke-virtual {p0, p1, v0, p2}, Ll/ܶ۬֨;->֫(Ll/ۗ۠۠;Ll/ܽܶ۠;Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1
.end method

.method public final ᩻(Ll/ۗ۠۠;Ll/ۙ֨֨;)Ll/ۙ֨֨;
    .locals 2

    .line 701
    sget-object v0, Ll/ۢ۠֨;->ᩴ֫:Ll/ۢ۠֨;

    invoke-virtual {p2, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 702
    iget-object v0, p0, Ll/ܶ۬֨;->֨:Ll/᩹ܶ۠;

    sget-object v1, Ll/ۛᩴ۠;->ۘܿ:Ll/۫۠۠;

    invoke-virtual {v0, p1, v1}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    .line 703
    iget-object p1, p0, Ll/ܶ۬֨;->᩺:Ll/ۛ᩸֨;

    invoke-virtual {p1, p2}, Ll/ۛ᩸֨;->ܳ(Ll/ۙ֨֨;)Ll/۫ۚ֨;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p2
.end method
