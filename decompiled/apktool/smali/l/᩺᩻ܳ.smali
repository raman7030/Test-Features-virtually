.class public final Ll/᩺᩻ܳ;
.super Ljava/lang/Object;
.source "S6KI"


# static fields
.field public static final ܺ:Ljava/util/concurrent/ExecutorService;


# instance fields
.field public ֫:Ljava/util/List;

.field public final ۜ:Ll/۫᩻ܳ;

.field public final ۡ:Ljava/util/IdentityHashMap;

.field public ۢ:Ll/ۨ᩻ܳ;

.field public ۧ:Z

.field public ܳ:J

.field public ܽ:Ll/ۨܺ᩷;

.field public ܿ:I

.field public final ᩳ:Ljava/util/concurrent/Executor;

.field public final ᩷:Ll/ۚۢܳ;

.field public final ᩻:Ll/֨ۢܳ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x2

    .line 16
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Ll/᩺᩻ܳ;->ܺ:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public constructor <init>(Ll/ۚۢܳ;Ll/֨ۢܳ;)V
    .locals 2

    .line 33
    new-instance v0, Ll/۫᩻ܳ;

    invoke-direct {v0}, Ll/۫᩻ܳ;-><init>()V

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v1, Ljava/util/IdentityHashMap;

    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v1, p0, Ll/᩺᩻ܳ;->ۡ:Ljava/util/IdentityHashMap;

    .line 25
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, p0, Ll/᩺᩻ܳ;->֫:Ljava/util/List;

    .line 38
    sget-object v1, Ll/᩺᩻ܳ;->ܺ:Ljava/util/concurrent/ExecutorService;

    iput-object v1, p0, Ll/᩺᩻ܳ;->ᩳ:Ljava/util/concurrent/Executor;

    .line 39
    iput-object v0, p0, Ll/᩺᩻ܳ;->ۜ:Ll/۫᩻ܳ;

    .line 40
    iput-object p1, p0, Ll/᩺᩻ܳ;->᩷:Ll/ۚۢܳ;

    .line 41
    iput-object p2, p0, Ll/᩺᩻ܳ;->᩻:Ll/֨ۢܳ;

    return-void
.end method

.method public static ֫(Ll/᩺᩻ܳ;Ll/ۨ᩻ܳ;)V
    .locals 5

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 171
    :try_start_0
    iget-boolean v1, p1, Ll/ۨ᩻ܳ;->ܳ:Z

    if-nez v1, :cond_1

    .line 172
    iget v1, p1, Ll/ۨ᩻ܳ;->ܽ:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    .line 173
    iget-object v1, p1, Ll/ۨ᩻ܳ;->ᩳ:Ll/ۧۜܳ;

    iget-object v2, p1, Ll/ۨ᩻ܳ;->᩻:Ll/ܽ᩷ܳ;

    iget-object v3, p1, Ll/ۨ᩻ܳ;->ۧ:Ll/ᩳۜܳ;

    iget v4, p1, Ll/ۨ᩻ܳ;->ܿ:I

    invoke-interface {v1, v2, v3, v4}, Ll/ۧۜܳ;->֫(Ll/ܽ᩷ܳ;Ll/ᩳۜܳ;I)Ll/ۨܺ᩷;

    move-result-object v0

    goto :goto_0

    .line 174
    :cond_0
    iget-object v1, p1, Ll/ۨ᩻ܳ;->ᩳ:Ll/ۧۜܳ;

    iget-object v2, p1, Ll/ۨ᩻ܳ;->ۧ:Ll/ᩳۜܳ;

    iget v3, p1, Ll/ۨ᩻ܳ;->ܿ:I

    check-cast v1, Ll/ۘۘܳ;

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v3, v4}, Ll/ۘۘܳ;->֫(Ll/ᩳۜܳ;IZ)Ll/ۨܺ᩷;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 180
    :catchall_0
    :cond_1
    :goto_0
    iget-object v1, p0, Ll/᩺᩻ܳ;->ۜ:Ll/۫᩻ܳ;

    new-instance v2, Ll/ۤ᩻ܳ;

    invoke-direct {v2, p0, p1, v0}, Ll/ۤ᩻ܳ;-><init>(Ll/᩺᩻ܳ;Ll/ۨ᩻ܳ;Ll/ۨܺ᩷;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static ֫(Ll/᩺᩻ܳ;Ll/ۨ᩻ܳ;Ll/ۨܺ᩷;)V
    .locals 2

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    iget v0, p1, Ll/ۨ᩻ܳ;->֫:I

    iget v1, p0, Ll/᩺᩻ܳ;->ܿ:I

    if-eq v0, v1, :cond_0

    .line 182
    iget-object p2, p0, Ll/᩺᩻ܳ;->ۢ:Ll/ۨ᩻ܳ;

    if-ne p2, p1, :cond_1

    const/4 p1, 0x0

    .line 162
    iput-object p1, p0, Ll/᩺᩻ܳ;->ۢ:Ll/ۨ᩻ܳ;

    .line 163
    iput-object p1, p0, Ll/᩺᩻ܳ;->ܽ:Ll/ۨܺ᩷;

    const/4 p1, 0x0

    .line 164
    iput-boolean p1, p0, Ll/᩺᩻ܳ;->ۧ:Z

    goto :goto_0

    .line 184
    :cond_0
    iput-object p2, p0, Ll/᩺᩻ܳ;->ܽ:Ll/ۨܺ᩷;

    const/4 p1, 0x1

    .line 185
    iput-boolean p1, p0, Ll/᩺᩻ܳ;->ۧ:Z

    .line 187
    :cond_1
    :goto_0
    iget-object p0, p0, Ll/᩺᩻ܳ;->᩷:Ll/ۚۢܳ;

    const-wide/16 p1, 0x0

    invoke-virtual {p0, p1, p2}, Ll/ۚۢܳ;->accept(J)V

    return-void
.end method

.method private ֫(Ll/ᩳۜܳ;I)Z
    .locals 1

    .line 148
    iget-object v0, p0, Ll/᩺᩻ܳ;->ۡ:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۛ᩻ܳ;

    iget p1, p1, Ll/ۛ᩻ܳ;->֫:I

    and-int/2addr p1, p2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 46
    iget v0, p0, Ll/᩺᩻ܳ;->ܿ:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Ll/᩺᩻ܳ;->ܿ:I

    .line 47
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/᩺᩻ܳ;->֫:Ljava/util/List;

    .line 48
    iget-object v0, p0, Ll/᩺᩻ܳ;->ۡ:Ljava/util/IdentityHashMap;

    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->clear()V

    const-wide/16 v2, 0x0

    .line 49
    iput-wide v2, p0, Ll/᩺᩻ܳ;->ܳ:J

    .line 50
    iget-object v0, p0, Ll/᩺᩻ܳ;->ۢ:Ll/ۨ᩻ܳ;

    if-eqz v0, :cond_0

    iput-boolean v1, v0, Ll/ۨ᩻ܳ;->ܳ:Z

    .line 51
    :cond_0
    iget-boolean v0, p0, Ll/᩺᩻ܳ;->ۧ:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 162
    iput-object v0, p0, Ll/᩺᩻ܳ;->ۢ:Ll/ۨ᩻ܳ;

    .line 163
    iput-object v0, p0, Ll/᩺᩻ܳ;->ܽ:Ll/ۨܺ᩷;

    const/4 v0, 0x0

    .line 164
    iput-boolean v0, p0, Ll/᩺᩻ܳ;->ۧ:Z

    :cond_1
    return-void
.end method

.method public final ֫(Ljava/util/List;ILl/ܽ᩷ܳ;Ll/ۧۜܳ;IJ)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v6, p4

    move/from16 v2, p5

    move-wide/from16 v8, p6

    .line 57
    iget-object v3, v0, Ll/᩺᩻ܳ;->֫:Ljava/util/List;

    if-eq v3, v1, :cond_0

    .line 58
    iput-object v1, v0, Ll/᩺᩻ܳ;->֫:Ljava/util/List;

    .line 59
    iget-object v3, v0, Ll/᩺᩻ܳ;->ۡ:Ljava/util/IdentityHashMap;

    invoke-virtual {v3}, Ljava/util/IdentityHashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    .line 61
    :cond_0
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v3

    move/from16 v4, p2

    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 62
    :goto_0
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v7

    const-wide/16 v10, 0x0

    if-ge v5, v7, :cond_4

    .line 63
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ᩳۜܳ;

    .line 64
    iget-object v12, v0, Ll/᩺᩻ܳ;->ۡ:Ljava/util/IdentityHashMap;

    invoke-virtual {v12, v7}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ۛ᩻ܳ;

    if-nez v12, :cond_1

    .line 66
    new-instance v12, Ll/ۛ᩻ܳ;

    invoke-direct {v12, v4}, Ll/ۛ᩻ܳ;-><init>(I)V

    .line 67
    iget-object v13, v0, Ll/᩺᩻ܳ;->ۡ:Ljava/util/IdentityHashMap;

    invoke-virtual {v13, v7, v12}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    if-lt v5, v3, :cond_2

    const-wide/16 v10, -0x1

    .line 70
    iput-wide v10, v12, Ll/ۛ᩻ܳ;->ۧ:J

    goto :goto_1

    .line 71
    :cond_2
    iget-wide v13, v12, Ll/ۛ᩻ܳ;->ۧ:J

    cmp-long v7, v13, v10

    if-gez v7, :cond_3

    iput-wide v8, v12, Ll/ۛ᩻ܳ;->ۧ:J

    :cond_3
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 74
    :cond_4
    iget-object v5, v0, Ll/᩺᩻ܳ;->ۢ:Ll/ۨ᩻ܳ;

    const/4 v7, 0x1

    if-eqz v5, :cond_6

    iget-object v5, v5, Ll/ۨ᩻ܳ;->ۧ:Ll/ᩳۜܳ;

    invoke-interface {v1, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    iget-object v5, v0, Ll/᩺᩻ܳ;->ۢ:Ll/ۨ᩻ܳ;

    iget-object v10, v5, Ll/ۨ᩻ܳ;->ᩳ:Ll/ۧۜܳ;

    if-ne v10, v6, :cond_5

    iget-object v5, v5, Ll/ۨ᩻ܳ;->᩻:Ll/ܽ᩷ܳ;

    move-object/from16 v10, p3

    if-eq v5, v10, :cond_7

    goto :goto_2

    :cond_5
    move-object/from16 v10, p3

    .line 76
    :goto_2
    iget-object v5, v0, Ll/᩺᩻ܳ;->ۢ:Ll/ۨ᩻ܳ;

    iput-boolean v7, v5, Ll/ۨ᩻ܳ;->ܳ:Z

    goto :goto_3

    :cond_6
    move-object/from16 v10, p3

    .line 78
    :cond_7
    :goto_3
    iget-boolean v5, v0, Ll/᩺᩻ܳ;->ۧ:Z

    const/4 v11, 0x0

    if-eqz v5, :cond_9

    .line 79
    iget-object v5, v0, Ll/᩺᩻ܳ;->ۢ:Ll/ۨ᩻ܳ;

    .line 80
    iget-object v12, v0, Ll/᩺᩻ܳ;->ܽ:Ll/ۨܺ᩷;

    .line 162
    iput-object v11, v0, Ll/᩺᩻ܳ;->ۢ:Ll/ۨ᩻ܳ;

    .line 163
    iput-object v11, v0, Ll/᩺᩻ܳ;->ܽ:Ll/ۨܺ᩷;

    .line 164
    iput-boolean v4, v0, Ll/᩺᩻ܳ;->ۧ:Z

    .line 82
    iget-boolean v11, v5, Ll/ۨ᩻ܳ;->ܳ:Z

    if-nez v11, :cond_8

    iget v11, v5, Ll/ۨ᩻ܳ;->֫:I

    iget v13, v0, Ll/᩺᩻ܳ;->ܿ:I

    if-ne v11, v13, :cond_8

    if-eqz v12, :cond_9

    .line 83
    iget-object v4, v5, Ll/ۨ᩻ܳ;->ۧ:Ll/ᩳۜܳ;

    .line 156
    invoke-interface {v4}, Ll/ᩳۜܳ;->getIcon()Ll/ۨܺ᩷;

    move-result-object v5

    .line 157
    invoke-interface {v4, v12}, Ll/ᩳۜܳ;->֫(Ll/ۨܺ᩷;)V

    if-eq v5, v12, :cond_9

    .line 158
    iget-object v5, v0, Ll/᩺᩻ܳ;->᩻:Ll/֨ۢܳ;

    invoke-virtual {v5, v4}, Ll/֨ۢܳ;->accept(Ljava/lang/Object;)V

    goto :goto_4

    .line 85
    :cond_8
    iget-object v11, v0, Ll/᩺᩻ܳ;->ۡ:Ljava/util/IdentityHashMap;

    iget-object v5, v5, Ll/ۨ᩻ܳ;->ۧ:Ll/ᩳۜܳ;

    invoke-virtual {v11, v5}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۛ᩻ܳ;

    if-eqz v5, :cond_9

    .line 86
    iput v4, v5, Ll/ۛ᩻ܳ;->֫:I

    :cond_9
    :goto_4
    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_5
    const/4 v11, 0x2

    if-ge v4, v3, :cond_d

    .line 93
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ᩳۜܳ;

    .line 94
    invoke-interface {v12}, Ll/ᩳۜܳ;->᩹֫()I

    move-result v13

    if-eqz v13, :cond_c

    .line 95
    invoke-direct {v0, v12, v7}, Ll/᩺᩻ܳ;->֫(Ll/ᩳۜܳ;I)Z

    move-result v14

    if-eqz v14, :cond_a

    goto :goto_7

    .line 152
    :cond_a
    iget-object v14, v0, Ll/᩺᩻ܳ;->ۡ:Ljava/util/IdentityHashMap;

    invoke-virtual {v14, v12}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/ۛ᩻ܳ;

    iget v15, v14, Ll/ۛ᩻ܳ;->֫:I

    or-int/2addr v15, v7

    iput v15, v14, Ll/ۛ᩻ܳ;->֫:I

    .line 99
    :try_start_0
    move-object v14, v6

    check-cast v14, Ll/ۘۘܳ;

    invoke-virtual {v14, v12, v13, v7}, Ll/ۘۘܳ;->֫(Ll/ᩳۜܳ;IZ)Ll/ۨܺ᩷;

    move-result-object v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_6

    :catchall_0
    const/4 v13, 0x0

    :goto_6
    if-eqz v13, :cond_c

    .line 156
    invoke-interface {v12}, Ll/ᩳۜܳ;->getIcon()Ll/ۨܺ᩷;

    move-result-object v14

    .line 157
    invoke-interface {v12, v13}, Ll/ᩳۜܳ;->֫(Ll/ۨܺ᩷;)V

    if-eq v14, v13, :cond_b

    .line 158
    iget-object v13, v0, Ll/᩺᩻ܳ;->᩻:Ll/֨ۢܳ;

    invoke-virtual {v13, v12}, Ll/֨ۢܳ;->accept(Ljava/lang/Object;)V

    :cond_b
    add-int/lit8 v5, v5, 0x1

    if-ne v5, v11, :cond_c

    .line 107
    iget-object v4, v0, Ll/᩺᩻ܳ;->᩷:Ll/ۚۢܳ;

    const-wide/16 v12, 0x0

    invoke-virtual {v4, v12, v13}, Ll/ۚۢܳ;->accept(J)V

    goto :goto_8

    :cond_c
    :goto_7
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    .line 112
    :cond_d
    :goto_8
    iget-object v4, v0, Ll/᩺᩻ܳ;->ۢ:Ll/ۨ᩻ܳ;

    if-eqz v4, :cond_e

    goto/16 :goto_e

    :cond_e
    if-ne v2, v11, :cond_f

    goto :goto_9

    .line 114
    :cond_f
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v3

    :goto_9
    const/4 v4, 0x0

    const-wide v12, 0x7fffffffffffffffL

    :goto_a
    if-ge v4, v3, :cond_15

    .line 116
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳۜܳ;

    .line 117
    invoke-interface {v5}, Ll/ᩳۜܳ;->᩹֫()I

    move-result v7

    if-nez v7, :cond_10

    goto :goto_c

    :cond_10
    const/4 v14, 0x4

    if-ne v2, v11, :cond_12

    .line 121
    invoke-direct {v0, v5, v11}, Ll/᩺᩻ܳ;->֫(Ll/ᩳۜܳ;I)Z

    move-result v15

    if-nez v15, :cond_11

    const/4 v14, 0x2

    goto :goto_b

    .line 123
    :cond_11
    invoke-direct {v0, v5, v14}, Ll/᩺᩻ܳ;->֫(Ll/ᩳۜܳ;I)Z

    move-result v14

    if-nez v14, :cond_12

    .line 124
    iget-object v14, v0, Ll/᩺᩻ܳ;->ۡ:Ljava/util/IdentityHashMap;

    invoke-virtual {v14, v5}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/ۛ᩻ܳ;

    iget-wide v14, v14, Ll/ۛ᩻ܳ;->ۧ:J

    const-wide/16 v16, 0x78

    add-long v14, v14, v16

    cmp-long v16, v8, v14

    if-gez v16, :cond_12

    .line 126
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v12

    goto :goto_c

    :cond_12
    const/4 v14, 0x4

    .line 131
    :goto_b
    invoke-direct {v0, v5, v14}, Ll/᩺᩻ܳ;->֫(Ll/ᩳۜܳ;I)Z

    move-result v15

    if-eqz v15, :cond_13

    :goto_c
    add-int/lit8 v4, v4, 0x1

    goto :goto_a

    :cond_13
    if-ne v2, v11, :cond_14

    .line 132
    iget-wide v1, v0, Ll/᩺᩻ܳ;->ܳ:J

    cmp-long v3, v8, v1

    if-gez v3, :cond_14

    .line 133
    invoke-static {v12, v13, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v12

    goto :goto_d

    .line 152
    :cond_14
    iget-object v1, v0, Ll/᩺᩻ܳ;->ۡ:Ljava/util/IdentityHashMap;

    invoke-virtual {v1, v5}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛ᩻ܳ;

    iget v2, v1, Ll/ۛ᩻ܳ;->֫:I

    or-int/2addr v2, v14

    iput v2, v1, Ll/ۛ᩻ܳ;->֫:I

    .line 137
    new-instance v11, Ll/ۨ᩻ܳ;

    iget v12, v0, Ll/᩺᩻ܳ;->ܿ:I

    move-object v1, v11

    move-object v2, v5

    move v3, v7

    move v4, v14

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move v7, v12

    invoke-direct/range {v1 .. v7}, Ll/ۨ᩻ܳ;-><init>(Ll/ᩳۜܳ;IILl/ܽ᩷ܳ;Ll/ۧۜܳ;I)V

    .line 138
    iput-object v11, v0, Ll/᩺᩻ܳ;->ۢ:Ll/ۨ᩻ܳ;

    const-wide/16 v1, 0x50

    add-long/2addr v1, v8

    .line 139
    iput-wide v1, v0, Ll/᩺᩻ܳ;->ܳ:J

    .line 140
    iget-object v1, v0, Ll/᩺᩻ܳ;->ᩳ:Ljava/util/concurrent/Executor;

    new-instance v2, Ll/۬᩻ܳ;

    invoke-direct {v2, v0, v11}, Ll/۬᩻ܳ;-><init>(Ll/᩺᩻ܳ;Ll/ۨ᩻ܳ;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_15
    :goto_d
    const-wide v14, 0x7fffffffffffffffL

    cmp-long v1, v12, v14

    if-eqz v1, :cond_16

    .line 144
    iget-object v1, v0, Ll/᩺᩻ܳ;->᩷:Ll/ۚۢܳ;

    sub-long/2addr v12, v8

    invoke-virtual {v1, v12, v13}, Ll/ۚۢܳ;->accept(J)V

    :cond_16
    :goto_e
    return-void
.end method
