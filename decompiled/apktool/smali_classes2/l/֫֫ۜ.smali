.class public final Ll/֫֫ۜ;
.super Ljava/lang/Object;
.source "N75Z"


# static fields
.field public static final ֫:Ljava/util/Set;

.field public static final ۧ:Ljava/util/Set;

.field public static final ܳ:Ljava/util/Set;

.field public static final ܽ:Ljava/util/Set;

.field public static final ܿ:Ljava/util/Set;

.field public static final ᩳ:Ljava/util/Set;

.field public static final ᩻:Ljava/util/Set;


# direct methods
.method public static constructor <clinit>()V
    .locals 17

    const/4 v0, 0x3

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "function_symbol"

    aput-object v3, v1, v2

    const/4 v4, 0x1

    const-string v5, "executable_symbol"

    aput-object v5, v1, v4

    const/4 v6, 0x2

    const-string v7, "requested_address"

    aput-object v7, v1, v6

    .line 0
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7, v0}, Ljava/util/HashSet;-><init>(I)V

    const/4 v8, 0x0

    :goto_0
    const-string v9, "duplicate element: "

    if-ge v8, v0, :cond_1

    aget-object v10, v1, v8

    invoke-static {v10}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v7, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {v10, v9}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {v7}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    .line 16
    sput-object v1, Ll/֫֫ۜ;->ܳ:Ljava/util/Set;

    new-array v1, v0, [Ljava/lang/Object;

    aput-object v3, v1, v2

    aput-object v5, v1, v4

    const-string v3, "executable_mapping"

    aput-object v3, v1, v6

    .line 0
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v0}, Ljava/util/HashSet;-><init>(I)V

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v0, :cond_3

    aget-object v7, v1, v5

    invoke-static {v7}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {v7, v9}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-static {v3}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    .line 18
    sput-object v1, Ll/֫֫ۜ;->֫:Ljava/util/Set;

    const/16 v1, 0x8

    new-array v3, v1, [Ljava/lang/Object;

    const-string v5, "fallthrough"

    aput-object v5, v3, v2

    const-string v7, "conditional_jump"

    aput-object v7, v3, v4

    const-string v7, "jump"

    aput-object v7, v3, v6

    const-string v8, "indirect_jump"

    aput-object v8, v3, v0

    const-string v8, "return"

    const/4 v10, 0x4

    aput-object v8, v3, v10

    const-string v8, "trap"

    const/4 v11, 0x5

    aput-object v8, v3, v11

    const-string v8, "invalid"

    const/4 v12, 0x6

    aput-object v8, v3, v12

    const-string v8, "budget_boundary"

    const/4 v13, 0x7

    aput-object v8, v3, v13

    .line 0
    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8, v1}, Ljava/util/HashSet;-><init>(I)V

    const/4 v14, 0x0

    :goto_2
    if-ge v14, v1, :cond_5

    aget-object v15, v3, v14

    invoke-static {v15}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v8, v15}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_4

    add-int/lit8 v14, v14, 0x1

    goto :goto_2

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {v15, v9}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    invoke-static {v8}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    .line 20
    sput-object v1, Ll/֫֫ۜ;->᩻:Ljava/util/Set;

    new-array v1, v10, [Ljava/lang/Object;

    aput-object v5, v1, v2

    const-string v3, "branch_true"

    aput-object v3, v1, v4

    const-string v3, "branch_false"

    aput-object v3, v1, v6

    aput-object v7, v1, v0

    .line 0
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v10}, Ljava/util/HashSet;-><init>(I)V

    const/4 v5, 0x0

    :goto_3
    if-ge v5, v10, :cond_7

    aget-object v7, v1, v5

    invoke-static {v7}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {v7, v9}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    invoke-static {v3}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    .line 23
    sput-object v1, Ll/֫֫ۜ;->ۧ:Ljava/util/Set;

    new-array v1, v6, [Ljava/lang/Object;

    const-string v3, "outside_function_boundary"

    aput-object v3, v1, v2

    const-string v3, "other_function_symbol"

    aput-object v3, v1, v4

    .line 0
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v6}, Ljava/util/HashSet;-><init>(I)V

    const/4 v5, 0x0

    :goto_4
    if-ge v5, v6, :cond_9

    aget-object v7, v1, v5

    invoke-static {v7}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {v7, v9}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    invoke-static {v3}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    .line 25
    sput-object v1, Ll/֫֫ۜ;->ܽ:Ljava/util/Set;

    new-array v1, v13, [Ljava/lang/Object;

    const-string v3, "target_not_executable"

    aput-object v3, v1, v2

    const-string v5, "unaligned_or_overlapping_target"

    aput-object v5, v1, v4

    const-string v7, "instruction_mode_transition"

    aput-object v7, v1, v6

    const-string v8, "max_blocks_reached"

    aput-object v8, v1, v0

    const-string v8, "max_analysis_bytes_reached"

    aput-object v8, v1, v10

    const-string v8, "max_instructions_reached"

    aput-object v8, v1, v11

    const-string v8, "invalid_instruction"

    aput-object v8, v1, v12

    .line 0
    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8, v13}, Ljava/util/HashSet;-><init>(I)V

    const/4 v10, 0x0

    :goto_5
    if-ge v10, v13, :cond_b

    aget-object v11, v1, v10

    invoke-static {v11}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v8, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {v11, v9}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    invoke-static {v8}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    .line 27
    sput-object v1, Ll/֫֫ۜ;->ܿ:Ljava/util/Set;

    new-array v1, v0, [Ljava/lang/Object;

    aput-object v3, v1, v2

    aput-object v5, v1, v4

    aput-object v7, v1, v6

    .line 0
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v0}, Ljava/util/HashSet;-><init>(I)V

    :goto_6
    if-ge v2, v0, :cond_d

    aget-object v4, v1, v2

    invoke-static {v4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {v4, v9}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    invoke-static {v3}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    .line 31
    sput-object v0, Ll/֫֫ۜ;->ᩳ:Ljava/util/Set;

    return-void
.end method

.method public static ֫(JJ)J
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-ltz v2, :cond_0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_0

    const-wide v0, 0x7fffffffffffffffL

    sub-long/2addr v0, p0

    cmp-long v2, v0, p2

    if-ltz v2, :cond_0

    add-long/2addr p0, p2

    return-wide p0

    .line 389
    :cond_0
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ll/᩹ۧۜ;Ll/۟۟᩻;Ll/᩵۟᩻;)Lbin/mt/json/JSONObject;
    .locals 45

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    .line 44
    iget-object v2, v0, Ll/۟۟᩻;->ۙ:Ljava/lang/String;

    iget-wide v3, v0, Ll/۟۟᩻;->᩹:J

    invoke-static {v2}, Ll/ۨ۟᩻;->ᩳ(Ljava/lang/String;)Ll/ۨ۟᩻;

    move-result-object v2

    .line 45
    invoke-static {v2, v1}, Ll/᩵֫ۜ;->֫(Ll/ۨ۟᩻;Ll/᩵۟᩻;)Ljava/lang/String;

    move-result-object v5

    iget-wide v6, v1, Ll/᩵۟᩻;->֫:J

    const-string v8, "virtual"

    .line 46
    iget-object v9, v1, Ll/᩵۟᩻;->ܽ:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    const-string v9, "thumb"

    .line 50
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    const-wide/16 v9, -0x2

    and-long/2addr v6, v9

    :cond_0
    invoke-virtual {v2}, Ll/ۨ۟᩻;->֫()Ljava/lang/String;

    move-result-object v9

    .line 51
    invoke-virtual {v2, v5}, Ll/ۨ۟᩻;->֫(Ljava/lang/String;)I

    move-result v15

    .line 54
    :try_start_0
    iget-object v10, v0, Ll/۟۟᩻;->ۙ:Ljava/lang/String;

    iget v0, v1, Ll/᩵۟᩻;->ۜ:I

    iget v14, v1, Ll/᩵۟᩻;->᩷:I

    iget v13, v1, Ll/᩵۟᩻;->ۢ:I

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-wide v11, v6

    move/from16 v18, v13

    move v13, v8

    move/from16 v17, v14

    move-object v14, v9

    move/from16 p0, v15

    move/from16 v16, v0

    .line 96
    invoke-static/range {v10 .. v18}, Ll/ܺܺۢ;->֫(Ljava/lang/String;JZLjava/lang/String;IIII)Ll/ܿۖۢ;

    move-result-object v10
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    iget-object v0, v10, Ll/ܿۖۢ;->᩻:Ll/ܽۖۢ;

    iget-object v11, v10, Ll/ܿۖۢ;->ۜ:Ll/ۘܺۢ;

    if-eqz v11, :cond_43

    .line 61
    iget-object v12, v10, Ll/ܿۖۢ;->ۧ:Ljava/lang/String;

    invoke-virtual {v9, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_43

    iget v12, v10, Ll/ܿۖۢ;->ܽ:I

    move/from16 v13, p0

    if-ne v13, v12, :cond_43

    .line 66
    invoke-static {v11}, Ll/۫֫ۜ;->ܽ(Ll/ۘܺۢ;)V

    .line 67
    iget-boolean v12, v11, Ll/ۘܺۢ;->ۧ:Z

    if-eqz v12, :cond_42

    .line 71
    iget-boolean v12, v11, Ll/ۘܺۢ;->ܳ:Z

    if-eqz v12, :cond_41

    iget-boolean v12, v11, Ll/ۘܺۢ;->ܿ:Z

    if-eqz v12, :cond_41

    const-wide/16 v12, 0x0

    cmp-long v14, v3, v12

    if-ltz v14, :cond_40

    .line 92
    iget-wide v14, v11, Ll/ۘܺۢ;->ۡ:J

    cmp-long v16, v14, v12

    if-lez v16, :cond_40

    iget-wide v12, v11, Ll/ۘܺۢ;->᩻:J

    cmp-long v16, v12, v14

    if-gez v16, :cond_40

    move-object/from16 v16, v2

    iget-wide v1, v11, Ll/ۘܺۢ;->ۜ:J

    cmp-long v17, v1, v12

    if-ltz v17, :cond_40

    sub-long/2addr v1, v12

    .line 97
    invoke-static {v1, v2, v14, v15}, Ll/֫֫ۜ;->֫(JJ)J

    move-result-wide v1

    cmp-long v12, v1, v3

    if-gtz v12, :cond_3f

    .line 76
    iget-boolean v1, v11, Ll/ۘܺۢ;->ᩳ:Z

    if-ne v1, v8, :cond_3e

    iget-wide v1, v11, Ll/ۘܺۢ;->ܽ:J

    cmp-long v12, v1, v6

    if-nez v12, :cond_3e

    .line 79
    iget-wide v12, v11, Ll/ۘܺۢ;->ܺ:J

    const-wide/16 v1, 0x0

    cmp-long v14, v12, v1

    if-ltz v14, :cond_3d

    if-eqz v8, :cond_1

    cmp-long v1, v12, v6

    if-nez v1, :cond_3d

    :cond_1
    if-eqz v0, :cond_3c

    .line 105
    iget-wide v1, v0, Ll/ܽۖۢ;->֫:J

    iget-wide v6, v0, Ll/ܽۖۢ;->᩻:J

    iget-object v8, v0, Ll/ܽۖۢ;->ᩳ:Ljava/lang/String;

    iget-object v14, v0, Ll/ܽۖۢ;->ܽ:Ljava/lang/String;

    move-object v15, v9

    move-object/from16 v17, v10

    iget-wide v9, v0, Ll/ܽۖۢ;->ۜ:J

    move-object/from16 v18, v15

    iget-object v15, v0, Ll/ܽۖۢ;->ۧ:Ljava/lang/String;

    move-object/from16 v19, v11

    iget-object v11, v0, Ll/ܽۖۢ;->ܳ:Ljava/lang/String;

    const-wide/16 v20, 0x0

    cmp-long v22, v6, v20

    if-ltz v22, :cond_3c

    move-object/from16 v22, v8

    move-wide/from16 v23, v9

    iget-wide v8, v0, Ll/ܽۖۢ;->ܿ:J

    cmp-long v0, v8, v20

    if-ltz v0, :cond_3c

    cmp-long v0, v8, v3

    if-gez v0, :cond_3c

    cmp-long v0, v1, v20

    if-lez v0, :cond_3c

    cmp-long v0, v6, v1

    if-gez v0, :cond_3c

    cmp-long v0, v12, v6

    if-ltz v0, :cond_3c

    cmp-long v0, v12, v1

    if-gez v0, :cond_3c

    sget-object v0, Ll/֫֫ۜ;->ܳ:Ljava/util/Set;

    .line 111
    invoke-interface {v0, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3c

    sget-object v0, Ll/֫֫ۜ;->֫:Ljava/util/Set;

    .line 112
    invoke-interface {v0, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3c

    const-wide/16 v8, 0x0

    cmp-long v0, v23, v8

    if-ltz v0, :cond_3c

    .line 113
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v8

    const/16 v9, 0x1000

    if-gt v8, v9, :cond_3c

    const-string v8, "requested_address"

    .line 116
    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    xor-int/lit8 v9, v8, 0x1

    if-lez v0, :cond_2

    const/4 v10, 0x1

    goto :goto_0

    :cond_2
    const/4 v10, 0x0

    :goto_0
    if-ne v9, v10, :cond_3b

    if-nez v8, :cond_3

    .line 118
    invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_3b

    :cond_3
    if-eqz v8, :cond_4

    .line 119
    invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_3b

    invoke-virtual {v14}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_3b

    if-nez v0, :cond_3b

    const-string v0, "executable_mapping"

    .line 120
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3b

    :cond_4
    move-wide/from16 v9, v23

    .line 123
    invoke-static {v6, v7, v9, v10}, Ll/֫֫ۜ;->֫(JJ)J

    move-result-wide v9

    if-nez v8, :cond_6

    cmp-long v0, v9, v1

    if-nez v0, :cond_5

    goto :goto_1

    .line 125
    :cond_5
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_6
    :goto_1
    const-string v0, "function_symbol"

    .line 127
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    .line 128
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-ne v8, v0, :cond_3a

    const-string v0, "executable_symbol"

    .line 129
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    .line 130
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-ne v8, v0, :cond_3a

    move-object/from16 v9, v17

    .line 139
    iget-object v0, v9, Ll/ܿۖۢ;->֫:Ll/ܰܺۢ;

    iget-object v8, v9, Ll/ܿۖۢ;->ܳ:Ljava/util/List;

    iget-object v10, v9, Ll/ܿۖۢ;->ܿ:Ljava/util/List;

    iget-object v11, v9, Ll/ܿۖۢ;->᩷:Ljava/util/List;

    iget-object v14, v9, Ll/ܿۖۢ;->ᩳ:Ljava/util/List;

    if-eqz v0, :cond_39

    .line 140
    iget v15, v0, Ll/ܰܺۢ;->֫:I

    move-object/from16 v17, v9

    iget v9, v0, Ll/ܰܺۢ;->᩻:I

    move-wide/from16 v20, v12

    iget v12, v0, Ll/ܰܺۢ;->ۧ:I

    if-ltz v12, :cond_39

    move-object/from16 v13, p2

    move-object/from16 v22, v5

    iget v5, v13, Ll/᩵۟᩻;->ۜ:I

    if-gt v12, v5, :cond_39

    if-ltz v9, :cond_39

    iget v5, v13, Ll/᩵۟᩻;->ۢ:I

    if-gt v9, v5, :cond_39

    .line 144
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v5

    if-ne v15, v5, :cond_39

    iget v5, v0, Ll/ܰܺۢ;->ܿ:I

    move/from16 v23, v9

    .line 145
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v9

    if-ne v5, v9, :cond_39

    iget v5, v0, Ll/ܰܺۢ;->ܳ:I

    .line 146
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    if-ne v5, v9, :cond_39

    iget v5, v0, Ll/ܰܺۢ;->ۜ:I

    .line 147
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v9

    if-ne v5, v9, :cond_39

    iget v5, v13, Ll/᩵۟᩻;->᩷:I

    if-gt v15, v5, :cond_39

    .line 151
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 152
    new-instance v9, Ljava/util/HashSet;

    invoke-direct {v9}, Ljava/util/HashSet;-><init>()V

    .line 156
    invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    const-wide/16 v24, -0x1

    const/16 v26, 0x0

    move-object/from16 v26, v0

    move-object/from16 v27, v14

    move-wide/from16 v28, v24

    const/4 v0, 0x0

    const-wide/16 v13, 0x0

    :goto_2
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v30

    if-eqz v30, :cond_11

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v30

    move-object/from16 v31, v15

    move-object/from16 v15, v30

    check-cast v15, Ll/۟ܺۢ;

    move-object/from16 v30, v10

    move-object/from16 v32, v11

    .line 157
    iget-wide v10, v15, Ll/۟ܺۢ;->ܿ:J

    move/from16 v33, v12

    move-wide/from16 v34, v13

    iget-wide v12, v15, Ll/۟ܺۢ;->ᩳ:J

    iget v14, v15, Ll/۟ܺۢ;->ۧ:I

    move-object/from16 v36, v8

    move-object/from16 v37, v9

    iget-wide v8, v15, Ll/۟ܺۢ;->ܽ:J

    cmp-long v38, v10, v6

    if-ltz v38, :cond_10

    cmp-long v38, v10, v1

    if-gez v38, :cond_10

    const-wide/16 v38, 0x0

    cmp-long v40, v12, v38

    if-ltz v40, :cond_10

    cmp-long v40, v8, v38

    if-lez v40, :cond_10

    if-lez v14, :cond_10

    move-wide/from16 v38, v6

    sget-object v6, Ll/֫֫ۜ;->᩻:Ljava/util/Set;

    iget-object v7, v15, Ll/۟ܺۢ;->ܳ:Ljava/lang/String;

    .line 160
    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_10

    .line 161
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_10

    .line 164
    invoke-static {v10, v11, v8, v9}, Ll/֫֫ۜ;->֫(JJ)J

    move-result-wide v6

    .line 165
    invoke-static {v12, v13, v8, v9}, Ll/֫֫ۜ;->֫(JJ)J

    move-result-wide v12

    cmp-long v40, v6, v1

    if-gtz v40, :cond_f

    cmp-long v40, v12, v3

    if-gtz v40, :cond_f

    const-wide/16 v12, 0x0

    cmp-long v40, v28, v12

    if-ltz v40, :cond_7

    cmp-long v12, v10, v28

    if-ltz v12, :cond_f

    .line 189
    :cond_7
    iget-object v12, v15, Ll/۟ܺۢ;->֫:Ljava/lang/String;

    const-string v13, "\\n"

    const/4 v15, -0x1

    invoke-virtual {v12, v13, v15}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v12

    .line 190
    array-length v13, v12

    if-ne v13, v14, :cond_e

    const/4 v13, 0x0

    move-wide/from16 v28, v24

    .line 194
    :goto_3
    array-length v15, v12

    if-ge v13, v15, :cond_c

    .line 195
    aget-object v15, v12, v13

    move-wide/from16 v40, v3

    const-string v3, ": "

    .line 196
    invoke-virtual {v15, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    const/4 v4, 0x2

    if-le v3, v4, :cond_b

    const/16 v4, 0xd

    .line 197
    invoke-virtual {v15, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-gez v4, :cond_b

    const/16 v4, 0xa

    invoke-virtual {v15, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-gez v4, :cond_b

    const-string v4, "0x"

    .line 198
    invoke-virtual {v15, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_b

    const/4 v4, 0x0

    move-object/from16 v42, v12

    invoke-virtual {v15, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v12

    .line 199
    invoke-virtual {v15, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v12, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    add-int/lit8 v4, v3, 0x2

    .line 200
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v12

    if-ge v4, v12, :cond_b

    const/4 v4, 0x2

    .line 205
    :try_start_1
    invoke-virtual {v15, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x10

    invoke-static {v3, v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v3
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    cmp-long v12, v3, v10

    if-ltz v12, :cond_a

    cmp-long v15, v3, v6

    if-gez v15, :cond_a

    if-nez v13, :cond_8

    if-nez v12, :cond_a

    :cond_8
    const-wide/16 v43, 0x0

    cmp-long v12, v28, v43

    if-ltz v12, :cond_9

    cmp-long v12, v3, v28

    if-lez v12, :cond_a

    .line 212
    :cond_9
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    move-object/from16 v15, v37

    invoke-virtual {v15, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    add-int/lit8 v13, v13, 0x1

    move-wide/from16 v28, v3

    move-object/from16 v37, v15

    move-wide/from16 v3, v40

    move-object/from16 v12, v42

    goto :goto_3

    .line 213
    :cond_a
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 207
    :catch_0
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 201
    :cond_b
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_c
    move-wide/from16 v40, v3

    move-wide/from16 v3, v34

    move-object/from16 v15, v37

    .line 173
    invoke-static {v3, v4, v8, v9}, Ll/֫֫ۜ;->֫(JJ)J

    move-result-wide v3

    if-ltz v0, :cond_d

    if-ltz v14, :cond_d

    const v8, 0x7fffffff

    sub-int/2addr v8, v0

    if-lt v8, v14, :cond_d

    add-int/2addr v0, v14

    move-wide v13, v3

    move-wide/from16 v28, v6

    move-object v9, v15

    move-object/from16 v10, v30

    move-object/from16 v15, v31

    move-object/from16 v11, v32

    move/from16 v12, v33

    move-object/from16 v8, v36

    move-wide/from16 v6, v38

    move-wide/from16 v3, v40

    goto/16 :goto_2

    .line 396
    :cond_d
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 191
    :cond_e
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 169
    :cond_f
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 162
    :cond_10
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_11
    move-wide/from16 v38, v6

    move-object/from16 v36, v8

    move-object v15, v9

    move-object/from16 v30, v10

    move-object/from16 v32, v11

    move v6, v12

    move-wide v3, v13

    int-to-long v6, v6

    cmp-long v8, v3, v6

    if-nez v8, :cond_38

    move/from16 v3, v23

    if-ne v0, v3, :cond_38

    .line 221
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 223
    invoke-interface/range {v30 .. v30}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    sget-object v7, Ll/֫֫ۜ;->ۧ:Ljava/util/Set;

    const-string v8, "\u0000"

    if-eqz v6, :cond_18

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/֫ۖۢ;

    .line 224
    iget-wide v9, v6, Ll/֫ۖۢ;->֫:J

    iget-object v11, v6, Ll/֫ۖۢ;->ۧ:Ljava/lang/String;

    iget-wide v12, v6, Ll/֫ۖۢ;->ܽ:J

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_17

    .line 225
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_17

    .line 226
    invoke-interface {v7, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_17

    .line 229
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 231
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v9, v10}, Ll/֫֫ۜ;->֫(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "fallthrough"

    .line 375
    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_12

    const/16 v8, 0x30

    goto :goto_5

    :cond_12
    const-string v8, "branch_true"

    .line 378
    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_13

    const/16 v8, 0x31

    goto :goto_5

    :cond_13
    const-string v8, "branch_false"

    .line 381
    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_14

    const/16 v8, 0x32

    goto :goto_5

    :cond_14
    const/16 v8, 0x33

    .line 231
    :goto_5
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 232
    invoke-static {v12, v13}, Ll/֫֫ۜ;->֫(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 233
    invoke-virtual {v0, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_16

    if-eqz v4, :cond_15

    .line 234
    invoke-virtual {v4, v7}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v4

    if-gtz v4, :cond_16

    :cond_15
    move-object v4, v7

    goto/16 :goto_4

    .line 235
    :cond_16
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 227
    :cond_17
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 246
    :cond_18
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 248
    invoke-interface/range {v36 .. v36}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_21

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۧۖۢ;

    .line 249
    iget-wide v9, v6, Ll/ۧۖۢ;->ܽ:J

    iget-object v11, v6, Ll/ۧۖۢ;->֫:Ljava/lang/String;

    iget-wide v12, v6, Ll/ۧۖۢ;->ᩳ:J

    iget-object v6, v6, Ll/ۧۖۢ;->ۧ:Ljava/lang/String;

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    invoke-virtual {v15, v14}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_20

    .line 250
    invoke-interface {v7, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_20

    sget-object v14, Ll/֫֫ۜ;->ܽ:Ljava/util/Set;

    .line 251
    invoke-interface {v14, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_20

    const-wide/16 v28, 0x0

    cmp-long v14, v12, v28

    if-ltz v14, :cond_20

    .line 354
    invoke-interface/range {v27 .. v27}, Ljava/util/List;->size()I

    move-result v14

    const/16 v23, 0x0

    move-object/from16 v23, v3

    const/4 v3, 0x0

    :goto_7
    if-ge v3, v14, :cond_1a

    move-object/from16 v28, v5

    const/4 v5, 0x2

    .line 355
    invoke-static {v14, v3, v5, v3}, Ll/۟ۤ᩻;->֫(IIII)I

    move-result v5

    move/from16 v29, v14

    move-object/from16 v14, v27

    .line 357
    invoke-interface {v14, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v27

    move-object/from16 v37, v15

    move-object/from16 v15, v27

    check-cast v15, Ll/۟ܺۢ;

    move-object/from16 v27, v7

    move-object/from16 v30, v8

    iget-wide v7, v15, Ll/۟ܺۢ;->ܿ:J

    cmp-long v15, v7, v12

    if-gtz v15, :cond_19

    add-int/lit8 v5, v5, 0x1

    move v3, v5

    goto :goto_8

    :cond_19
    move/from16 v29, v5

    :goto_8
    move-object/from16 v7, v27

    move-object/from16 v5, v28

    move-object/from16 v8, v30

    move-object/from16 v15, v37

    move-object/from16 v27, v14

    move/from16 v14, v29

    goto :goto_7

    :cond_1a
    move-object/from16 v28, v5

    move-object/from16 v30, v8

    move-object/from16 v37, v15

    move-object/from16 v14, v27

    move-object/from16 v27, v7

    if-nez v3, :cond_1b

    move-object v5, v14

    goto :goto_9

    :cond_1b
    add-int/lit8 v3, v3, -0x1

    .line 366
    invoke-interface {v14, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۟ܺۢ;

    .line 367
    iget-wide v7, v3, Ll/۟ܺۢ;->ܿ:J

    move-object v5, v14

    iget-wide v14, v3, Ll/۟ܺۢ;->ܽ:J

    invoke-static {v7, v8, v14, v15}, Ll/֫֫ۜ;->֫(JJ)J

    move-result-wide v7

    cmp-long v3, v12, v7

    if-ltz v3, :cond_20

    :goto_9
    const-string v3, "outside_function_boundary"

    .line 256
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1d

    cmp-long v3, v12, v38

    if-ltz v3, :cond_1d

    cmp-long v3, v12, v1

    if-ltz v3, :cond_1c

    goto :goto_a

    .line 259
    :cond_1c
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 261
    :cond_1d
    :goto_a
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-object/from16 v7, v30

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 263
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v9, v10}, Ll/֫֫ۜ;->֫(J)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    invoke-static {v12, v13}, Ll/֫֫ۜ;->֫(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 265
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1f

    if-eqz v4, :cond_1e

    .line 266
    invoke-virtual {v4, v6}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v3

    if-gtz v3, :cond_1f

    :cond_1e
    move-object v4, v6

    move-object v8, v7

    move-object/from16 v3, v23

    move-object/from16 v7, v27

    move-object/from16 v15, v37

    move-object/from16 v27, v5

    move-object/from16 v5, v28

    goto/16 :goto_6

    .line 267
    :cond_1f
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 254
    :cond_20
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_21
    move-object/from16 v28, v5

    move-object/from16 v27, v7

    move-object v7, v8

    move-object/from16 v37, v15

    .line 277
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 279
    invoke-interface/range {v32 .. v32}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const-string v4, "invalid_instruction"

    const-string v5, "indirect_target"

    if-eqz v3, :cond_2b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۖۢ;

    .line 280
    iget-object v6, v3, Ll/ᩳۖۢ;->֫:Ljava/lang/String;

    iget-wide v8, v3, Ll/ᩳۖۢ;->ܿ:J

    iget-wide v10, v3, Ll/ᩳۖۢ;->ᩳ:J

    iget-object v12, v3, Ll/ᩳۖۢ;->ܽ:Ljava/lang/String;

    iget-boolean v3, v3, Ll/ᩳۖۢ;->ۧ:Z

    const-string v13, "decode"

    invoke-virtual {v13, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    const-string v14, "indirect_jump"

    .line 281
    invoke-virtual {v14, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    move-object/from16 v15, v27

    .line 282
    invoke-interface {v15, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v13, :cond_23

    if-nez v3, :cond_22

    .line 284
    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_22

    cmp-long v4, v10, v38

    if-nez v4, :cond_22

    move-object/from16 v13, v28

    move-object/from16 v5, v37

    goto :goto_c

    .line 286
    :cond_22
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_23
    if-eqz v14, :cond_25

    if-nez v3, :cond_24

    .line 289
    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_24

    .line 290
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    move-object/from16 v5, v37

    invoke-virtual {v5, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_24

    move-object/from16 v13, v28

    goto :goto_c

    .line 291
    :cond_24
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_25
    move-object/from16 v5, v37

    if-eqz v23, :cond_2a

    if-eqz v3, :cond_2a

    const-wide/16 v13, 0x0

    cmp-long v4, v8, v13

    if-ltz v4, :cond_2a

    .line 293
    sget-object v4, Ll/֫֫ۜ;->ܿ:Ljava/util/Set;

    .line 294
    invoke-interface {v4, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2a

    .line 295
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2a

    .line 296
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    move-object/from16 v13, v28

    invoke-virtual {v13, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2a

    .line 299
    :goto_c
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v37, v5

    if-eqz v3, :cond_26

    move-wide v5, v8

    goto :goto_d

    :cond_26
    move-wide/from16 v5, v24

    .line 300
    :goto_d
    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 301
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v10, v11}, Ll/֫֫ۜ;->֫(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v3, :cond_27

    goto :goto_e

    :cond_27
    move-wide/from16 v8, v24

    .line 302
    :goto_e
    invoke-static {v8, v9}, Ll/֫֫ۜ;->֫(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 303
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_29

    if-eqz v2, :cond_28

    .line 304
    invoke-virtual {v2, v3}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v2

    if-gtz v2, :cond_29

    :cond_28
    move-object v2, v3

    move-object/from16 v28, v13

    move-object/from16 v27, v15

    goto/16 :goto_b

    .line 305
    :cond_29
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 297
    :cond_2a
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_2b
    move-object/from16 v0, v26

    .line 314
    iget-object v1, v0, Ll/ܰܺۢ;->ܽ:Ljava/lang/String;

    invoke-static {v1}, Ll/۫֫ۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 321
    invoke-interface/range {v32 .. v32}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    const-string v13, "max_instructions_reached"

    const-string v14, "max_blocks_reached"

    const-string v15, "max_analysis_bytes_reached"

    if-eqz v12, :cond_2c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ᩳۖۢ;

    .line 322
    iget-object v12, v12, Ll/ᩳۖۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v6, v15

    .line 323
    invoke-virtual {v14, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v7, v14

    .line 324
    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v8, v13

    .line 325
    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v9, v13

    .line 326
    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v10, v13

    .line 327
    sget-object v13, Ll/֫֫ۜ;->ᩳ:Ljava/util/Set;

    invoke-interface {v13, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v11, v12

    goto :goto_f

    :cond_2c
    if-nez v6, :cond_2e

    if-nez v7, :cond_2e

    if-eqz v8, :cond_2d

    goto :goto_10

    :cond_2d
    const/4 v3, 0x0

    goto :goto_11

    :cond_2e
    :goto_10
    const/4 v3, 0x1

    .line 330
    :goto_11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v5

    const-string v12, "complete"

    sparse-switch v5, :sswitch_data_0

    goto :goto_12

    :sswitch_0
    invoke-virtual {v1, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2f

    goto :goto_12

    :cond_2f
    const/4 v4, 0x6

    goto :goto_13

    :sswitch_1
    invoke-virtual {v1, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_30

    goto :goto_12

    :cond_30
    const/4 v4, 0x5

    goto :goto_13

    :sswitch_2
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_31

    goto :goto_12

    :cond_31
    const/4 v4, 0x4

    goto :goto_13

    :sswitch_3
    const-string v4, "unresolved_indirect_flow"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_32

    goto :goto_12

    :cond_32
    const/4 v4, 0x3

    goto :goto_13

    :sswitch_4
    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_33

    goto :goto_12

    :cond_33
    const/4 v4, 0x2

    goto :goto_13

    :sswitch_5
    invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_34

    goto :goto_12

    :cond_34
    const/4 v4, 0x1

    goto :goto_13

    :sswitch_6
    const-string v4, "invalid_control_flow_target"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_35

    goto :goto_12

    :cond_35
    const/4 v4, 0x0

    goto :goto_13

    :goto_12
    const/4 v4, -0x1

    :goto_13
    packed-switch v4, :pswitch_data_0

    goto :goto_15

    :pswitch_0
    if-eqz v6, :cond_36

    if-nez v7, :cond_36

    if-nez v8, :cond_36

    goto :goto_14

    :pswitch_1
    if-eqz v8, :cond_36

    if-nez v7, :cond_36

    if-nez v6, :cond_36

    goto :goto_14

    :pswitch_2
    if-nez v3, :cond_36

    if-eqz v9, :cond_36

    goto :goto_14

    :pswitch_3
    if-nez v3, :cond_36

    if-nez v9, :cond_36

    if-eqz v10, :cond_36

    goto :goto_14

    .line 331
    :pswitch_4
    invoke-interface/range {v32 .. v32}, Ljava/util/List;->isEmpty()Z

    move-result v7

    goto :goto_16

    :pswitch_5
    if-nez v3, :cond_36

    if-nez v9, :cond_36

    if-nez v10, :cond_36

    if-eqz v11, :cond_36

    :goto_14
    const/4 v7, 0x1

    goto :goto_16

    :cond_36
    :goto_15
    const/4 v7, 0x0

    .line 344
    :goto_16
    :pswitch_6
    invoke-virtual {v12, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v2, :cond_37

    if-eqz v7, :cond_37

    .line 345
    iget-boolean v0, v0, Ll/ܰܺۢ;->ᩳ:Z

    if-ne v0, v1, :cond_37

    move-object/from16 v0, v16

    .line 138
    iget v6, v0, Ll/ۨ۟᩻;->֫:I

    move-object/from16 v1, v22

    .line 86
    invoke-virtual {v0, v1}, Ll/ۨ۟᩻;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 87
    invoke-virtual {v0, v1}, Ll/ۨ۟᩻;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v0, p2

    move-wide/from16 v2, v20

    move-object/from16 v4, v19

    move-object/from16 v5, v18

    move-object/from16 v9, v17

    .line 85
    invoke-static/range {v0 .. v9}, Ll/۫֫ۜ;->֫(Ll/᩵۟᩻;Ljava/lang/String;JLl/ۘܺۢ;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ll/ܿۖۢ;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0

    .line 347
    :cond_37
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 177
    :cond_38
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 149
    :cond_39
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 131
    :cond_3a
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 121
    :cond_3b
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 114
    :cond_3c
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 81
    :cond_3d
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 77
    :cond_3e
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 98
    :cond_3f
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 94
    :cond_40
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_41
    const-string v0, "NATIVE_ADDRESS_NOT_EXECUTABLE"

    const-string v1, "Native address is not in loaded executable file-backed bytes."

    .line 72
    invoke-static {v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_42
    const-string v0, "NATIVE_ADDRESS_NOT_MAPPED"

    const-string v1, "Native address is not mapped in the ELF file."

    .line 68
    invoke-static {v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 63
    :cond_43
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catch_1
    const-string v0, "NATIVE_ANALYZER_FAILED"

    const-string v1, "Native ELF function CFG analysis failed."

    .line 58
    invoke-static {v0, v1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :sswitch_data_0
    .sparse-switch
        -0x7a402468 -> :sswitch_6
        -0x25ae482c -> :sswitch_5
        -0x23bacec7 -> :sswitch_4
        -0x11dabcaf -> :sswitch_3
        0x1cbf0246 -> :sswitch_2
        0x66a7a8b3 -> :sswitch_1
        0x7df35e96 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_6
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(J)Ljava/lang/String;
    .locals 1

    .line 371
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    const/4 p1, 0x1

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p0, p1, v0

    const-string p0, "%016x"

    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
