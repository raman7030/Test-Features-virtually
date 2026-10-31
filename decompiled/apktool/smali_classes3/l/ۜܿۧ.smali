.class public final Ll/ۜܿۧ;
.super Ll/ۘܿۧ;
.source "18UV"

# interfaces
.implements Ll/ܽ۬֫;


# static fields
.field public static final synthetic ۡ:I

.field public static final ܺ:Ll/ۤۤܺ;


# instance fields
.field public ۜ:Ljava/lang/Thread;

.field public final ۢ:Ll/ۘᩳۧ;

.field public final ܳ:Ljava/lang/Object;

.field public ܽ:Ll/ᩳᩴ֫;

.field public ܿ:Ljava/lang/Boolean;

.field public final ᩳ:Landroid/content/Context;

.field public ᩷:Ll/֫ܿۧ;

.field public ᩻:Ll/᩺ᩳۧ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 2394
    new-instance v0, Ll/ۚᩳۧ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2395
    invoke-static {v0}, Ll/ۤۤܺ;->ۧ(Ljava/util/Comparator;)Ll/ۤۤܺ;

    move-result-object v0

    sput-object v0, Ll/ۜܿۧ;->ܺ:Ll/ۤۤܺ;

    return-void
.end method

.method public constructor <init>(Landroid/content/ContextWrapper;)V
    .locals 3

    .line 2420
    new-instance v0, Ll/ۘᩳۧ;

    .line 220
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2428
    sget-object v1, Ll/᩺ᩳۧ;->ᩴ֫:Ll/᩺ᩳۧ;

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2477
    new-instance v2, Ljava/lang/Object;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v2, p0, Ll/ۜܿۧ;->ܳ:Ljava/lang/Object;

    .line 2478
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ll/ۜܿۧ;->ᩳ:Landroid/content/Context;

    .line 2479
    iput-object v0, p0, Ll/ۜܿۧ;->ۢ:Ll/ۘᩳۧ;

    if-eqz v1, :cond_0

    .line 2481
    iput-object v1, p0, Ll/ۜܿۧ;->᩻:Ll/᩺ᩳۧ;

    goto :goto_0

    .line 2483
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2019
    new-instance p1, Ll/ۨᩳۧ;

    invoke-direct {p1, v1}, Ll/ۨᩳۧ;-><init>(Ll/᩺ᩳۧ;)V

    .line 2483
    invoke-virtual {p1, v1}, Ll/ۨᩳۧ;->ۧ(Ll/ۨ᩵֫;)V

    .line 1730
    new-instance v0, Ll/᩺ᩳۧ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/᩺ᩳۧ;-><init>(Ll/ۨᩳۧ;I)V

    .line 2483
    iput-object v0, p0, Ll/ۜܿۧ;->᩻:Ll/᩺ᩳۧ;

    .line 2485
    :goto_0
    sget-object p1, Ll/ᩳᩴ֫;->ۧ:Ll/ᩳᩴ֫;

    iput-object p1, p0, Ll/ۜܿۧ;->ܽ:Ll/ᩳᩴ֫;

    .line 2486
    iget-object p1, p0, Ll/ۜܿۧ;->᩻:Ll/᩺ᩳۧ;

    iget-boolean p1, p1, Ll/᩺ᩳۧ;->ۜ֫:Z

    return-void
.end method

.method public static ֫(Ll/۠ᩴ֫;Ljava/lang/String;Z)I
    .locals 2

    .line 3407
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/۠ᩴ֫;->ۙ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x4

    return p0

    .line 3411
    :cond_0
    invoke-static {p1}, Ll/ۜܿۧ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 3412
    iget-object p0, p0, Ll/۠ᩴ֫;->ۙ:Ljava/lang/String;

    invoke-static {p0}, Ll/ۜܿۧ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    if-nez p1, :cond_1

    goto :goto_1

    .line 3417
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_4

    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_0

    .line 3421
    :cond_2
    sget-object p2, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const-string p2, "-"

    const/4 v1, 0x2

    .line 1105
    invoke-virtual {p0, p2, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p0

    .line 3421
    aget-object p0, p0, v0

    .line 1105
    invoke-virtual {p1, p2, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p1

    .line 3422
    aget-object p1, p1, v0

    .line 3423
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    return v1

    :cond_3
    return v0

    :cond_4
    :goto_0
    const/4 p0, 0x3

    return p0

    :cond_5
    :goto_1
    if-eqz p2, :cond_6

    if-nez p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    return v0
.end method

.method public static ֫(ILl/ۖܿۧ;[[[ILl/ܽܿۧ;Ljava/util/Comparator;)Landroid/util/Pair;
    .locals 17

    move-object/from16 v0, p1

    .line 3032
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 3033
    invoke-virtual/range {p1 .. p1}, Ll/ۖܿۧ;->֫()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_7

    .line 3035
    invoke-virtual {v0, v3}, Ll/ۖܿۧ;->֫(I)I

    move-result v4

    move/from16 v5, p0

    if-ne v5, v4, :cond_6

    .line 3036
    invoke-virtual {v0, v3}, Ll/ۖܿۧ;->ۧ(I)Ll/ۛܽۧ;

    move-result-object v4

    const/4 v6, 0x0

    .line 3037
    :goto_1
    iget v7, v4, Ll/ۛܽۧ;->ۧ:I

    if-ge v6, v7, :cond_6

    .line 3038
    invoke-virtual {v4, v6}, Ll/ۛܽۧ;->֫(I)Ll/۬᩵֫;

    move-result-object v7

    .line 3039
    aget-object v8, p2, v3

    aget-object v8, v8, v6

    move-object/from16 v9, p3

    .line 3040
    invoke-interface {v9, v3, v7, v8}, Ll/ܽܿۧ;->֫(ILl/۬᩵֫;[I)Ljava/util/List;

    move-result-object v8

    .line 3041
    iget v7, v7, Ll/۬᩵֫;->ᩳ:I

    new-array v10, v7, [Z

    const/4 v11, 0x0

    :goto_2
    if-ge v11, v7, :cond_5

    .line 3043
    invoke-interface {v8, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ᩳܿۧ;

    .line 3044
    invoke-virtual {v12}, Ll/ᩳܿۧ;->֫()I

    move-result v13

    .line 3045
    aget-boolean v14, v10, v11

    if-nez v14, :cond_4

    if-nez v13, :cond_0

    goto :goto_6

    :cond_0
    const/4 v14, 0x1

    if-ne v13, v14, :cond_1

    .line 3050
    invoke-static {v12}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v12

    move/from16 v16, v2

    goto :goto_5

    .line 3052
    :cond_1
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 3053
    invoke-virtual {v13, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v14, v11, 0x1

    :goto_3
    if-ge v14, v7, :cond_3

    .line 3055
    invoke-interface {v8, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v15, v16

    check-cast v15, Ll/ᩳܿۧ;

    .line 3056
    invoke-virtual {v15}, Ll/ᩳܿۧ;->֫()I

    move-result v0

    move/from16 v16, v2

    const/4 v2, 0x2

    if-ne v0, v2, :cond_2

    .line 3057
    invoke-virtual {v12, v15}, Ll/ᩳܿۧ;->֫(Ll/ᩳܿۧ;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3058
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    .line 3059
    aput-boolean v0, v10, v14

    goto :goto_4

    :cond_2
    const/4 v0, 0x1

    :goto_4
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v0, p1

    move/from16 v2, v16

    goto :goto_3

    :cond_3
    move/from16 v16, v2

    move-object v12, v13

    .line 3064
    :goto_5
    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_4
    :goto_6
    move/from16 v16, v2

    :goto_7
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v0, p1

    move/from16 v2, v16

    goto :goto_2

    :cond_5
    move/from16 v16, v2

    add-int/lit8 v6, v6, 0x1

    move-object/from16 v0, p1

    goto :goto_1

    :cond_6
    move-object/from16 v9, p3

    move/from16 v16, v2

    add-int/lit8 v3, v3, 0x1

    move-object/from16 v0, p1

    move/from16 v2, v16

    goto/16 :goto_0

    .line 3069
    :cond_7
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 v0, 0x0

    return-object v0

    :cond_8
    move-object/from16 v0, p4

    .line 3072
    invoke-static {v1, v0}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 3073
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [I

    const/4 v2, 0x0

    .line 3074
    :goto_8
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_9

    .line 3075
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳܿۧ;

    iget v3, v3, Ll/ᩳܿۧ;->ۙ:I

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_9
    const/4 v2, 0x0

    .line 3077
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳܿۧ;

    .line 3078
    new-instance v3, Ll/᩷ܿۧ;

    iget-object v4, v0, Ll/ᩳܿۧ;->᩶:Ll/۬᩵֫;

    .line 61
    invoke-direct {v3, v2, v4, v1}, Ll/᩷ܿۧ;-><init>(ILl/۬᩵֫;[I)V

    .line 3078
    iget v0, v0, Ll/ᩳܿۧ;->᩹:I

    .line 3080
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 3078
    invoke-static {v3, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 3388
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "und"

    invoke-static {p0, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/ۛܽۧ;Ll/ۨ᩵֫;Ljava/util/HashMap;)V
    .locals 4

    const/4 v0, 0x0

    .line 3157
    :goto_0
    iget v1, p0, Ll/ۛܽۧ;->ۧ:I

    if-ge v0, v1, :cond_3

    .line 3158
    invoke-virtual {p0, v0}, Ll/ۛܽۧ;->֫(I)Ll/۬᩵֫;

    move-result-object v1

    .line 3159
    iget-object v2, p1, Ll/ۨ᩵֫;->ۚ:Ll/ۢ۬ܺ;

    invoke-virtual {v2, v1}, Ll/ۢ۬ܺ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫᩵֫;

    if-nez v1, :cond_0

    goto :goto_1

    .line 3160
    :cond_0
    iget-object v2, v1, Ll/۫᩵֫;->֫:Ll/۬᩵֫;

    .line 86
    iget v3, v2, Ll/۬᩵֫;->ܿ:I

    .line 3163
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۫᩵֫;

    if-eqz v3, :cond_1

    .line 3165
    iget-object v3, v3, Ll/۫᩵֫;->ۧ:Ll/ܳ۬ܺ;

    .line 3166
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, v1, Ll/۫᩵֫;->ۧ:Ll/ܳ۬ܺ;

    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    .line 86
    :cond_1
    iget v2, v2, Ll/۬᩵֫;->ܿ:I

    .line 3167
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p2, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۜܿۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۜܿۧ;->᩻()V

    return-void
.end method

.method private ֫(Ll/᩺ᩳۧ;)V
    .locals 2

    .line 2569
    iget-object v0, p0, Ll/ۜܿۧ;->ܳ:Ljava/lang/Object;

    monitor-enter v0

    .line 2570
    :try_start_0
    iget-object v1, p0, Ll/ۜܿۧ;->᩻:Ll/᩺ᩳۧ;

    invoke-virtual {v1, p1}, Ll/᩺ᩳۧ;->equals(Ljava/lang/Object;)Z

    move-result v1

    .line 2571
    iput-object p1, p0, Ll/ۜܿۧ;->᩻:Ll/᩺ᩳۧ;

    .line 2572
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_1

    .line 2575
    iget-boolean p1, p1, Ll/᩺ᩳۧ;->ۜ֫:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/ۜܿۧ;->ᩳ:Landroid/content/Context;

    if-nez p1, :cond_0

    const-string p1, "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument."

    .line 2576
    invoke-static {p1}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 2578
    :cond_0
    invoke-virtual {p0}, Ll/ۚܿۧ;->ᩳ()V

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    .line 2572
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public static ֫(Ll/ۜܿۧ;Ll/᩺ᩳۧ;Ll/۠ᩴ֫;)Z
    .locals 5

    .line 2889
    iget-boolean p1, p1, Ll/᩺ᩳۧ;->ۜ֫:Z

    const/4 v0, 0x1

    if-eqz p1, :cond_7

    iget-object p1, p0, Ll/ۜܿۧ;->ܿ:Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    .line 2890
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_7

    :cond_0
    iget p1, p2, Ll/۠ᩴ֫;->ܿ:I

    const/4 v1, -0x1

    if-eq p1, v1, :cond_7

    const/4 v2, 0x2

    if-le p1, v2, :cond_7

    .line 3502
    iget-object p1, p2, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    const/4 v2, 0x0

    const/16 v3, 0x20

    if-nez p1, :cond_1

    goto :goto_1

    .line 3505
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v4, "audio/eac3"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_1
    const-string v4, "audio/ac4"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_2
    const-string v4, "audio/ac3"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_3
    const-string v4, "audio/eac3-joc"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    goto :goto_1

    .line 2892
    :pswitch_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v3, :cond_7

    iget-object p1, p0, Ll/ۜܿۧ;->᩷:Ll/֫ܿۧ;

    if-eqz p1, :cond_7

    .line 2893
    invoke-virtual {p1}, Ll/֫ܿۧ;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_7

    :goto_1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v3, :cond_6

    iget-object p1, p0, Ll/ۜܿۧ;->᩷:Ll/֫ܿۧ;

    if-eqz p1, :cond_6

    .line 2896
    invoke-virtual {p1}, Ll/֫ܿۧ;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Ll/ۜܿۧ;->᩷:Ll/֫ܿۧ;

    .line 2897
    invoke-virtual {p1}, Ll/֫ܿۧ;->֫()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Ll/ۜܿۧ;->᩷:Ll/֫ܿۧ;

    .line 2898
    invoke-virtual {p1}, Ll/֫ܿۧ;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Ll/ۜܿۧ;->᩷:Ll/֫ܿۧ;

    iget-object p0, p0, Ll/ۜܿۧ;->ܽ:Ll/ᩳᩴ֫;

    .line 2899
    invoke-virtual {p1, p0, p2}, Ll/֫ܿۧ;->֫(Ll/ᩳᩴ֫;Ll/۠ᩴ֫;)Z

    move-result p0

    if-eqz p0, :cond_6

    goto :goto_2

    :cond_6
    return v2

    :cond_7
    :goto_2
    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e929daa -> :sswitch_3
        0xb269698 -> :sswitch_2
        0xb269699 -> :sswitch_1
        0x59ae0c65 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static bridge synthetic ܳ()Ll/ۤۤܺ;
    .locals 1

    .line 0
    sget-object v0, Ll/ۜܿۧ;->ܺ:Ll/ۤۤܺ;

    return-object v0
.end method

.method private ᩻()V
    .locals 3

    .line 3085
    iget-object v0, p0, Ll/ۜܿۧ;->ܳ:Ljava/lang/Object;

    monitor-enter v0

    .line 3086
    :try_start_0
    iget-object v1, p0, Ll/ۜܿۧ;->᩻:Ll/᩺ᩳۧ;

    iget-boolean v1, v1, Ll/᩺ᩳۧ;->ۜ֫:Z

    if-eqz v1, :cond_0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x20

    if-lt v1, v2, :cond_0

    iget-object v1, p0, Ll/ۜܿۧ;->᩷:Ll/֫ܿۧ;

    if-eqz v1, :cond_0

    .line 3090
    invoke-virtual {v1}, Ll/֫ܿۧ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 3091
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 3093
    invoke-virtual {p0}, Ll/ۚܿۧ;->ᩳ()V

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    .line 3091
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public final ֫(Ll/ۖܿۧ;[[[I[ILl/ܺۧۧ;Ll/ۙ᩵֫;)Landroid/util/Pair;
    .locals 23

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    .line 2607
    iget-object v4, v1, Ll/ۜܿۧ;->ܳ:Ljava/lang/Object;

    move-object/from16 v16, v4

    monitor-enter v16

    .line 2608
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    iput-object v4, v1, Ll/ۜܿۧ;->ۜ:Ljava/lang/Thread;

    .line 2609
    iget-object v4, v1, Ll/ۜܿۧ;->᩻:Ll/᩺ᩳۧ;

    .line 2610
    monitor-exit v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2611
    iget-object v5, v1, Ll/ۜܿۧ;->ܿ:Ljava/lang/Boolean;

    if-nez v5, :cond_0

    iget-object v5, v1, Ll/ۜܿۧ;->ᩳ:Landroid/content/Context;

    if-eqz v5, :cond_0

    .line 2612
    invoke-static {v5}, Ll/ۘ֨֫;->ܽ(Landroid/content/Context;)Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    iput-object v5, v1, Ll/ۜܿۧ;->ܿ:Ljava/lang/Boolean;

    .line 2614
    :cond_0
    iget-boolean v5, v4, Ll/᩺ᩳۧ;->ۜ֫:Z

    const/16 v6, 0x20

    if-eqz v5, :cond_1

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v5, v6, :cond_1

    iget-object v5, v1, Ll/ۜܿۧ;->᩷:Ll/֫ܿۧ;

    if-nez v5, :cond_1

    .line 2617
    new-instance v5, Ll/֫ܿۧ;

    iget-object v6, v1, Ll/ۜܿۧ;->ᩳ:Landroid/content/Context;

    iget-object v7, v1, Ll/ۜܿۧ;->ܿ:Ljava/lang/Boolean;

    invoke-direct {v5, v6, v1, v7}, Ll/֫ܿۧ;-><init>(Landroid/content/Context;Ll/ۜܿۧ;Ljava/lang/Boolean;)V

    iput-object v5, v1, Ll/ۜܿۧ;->᩷:Ll/֫ܿۧ;

    .line 2620
    :cond_1
    invoke-virtual/range {p1 .. p1}, Ll/ۖܿۧ;->֫()I

    move-result v5

    .line 2710
    iget-object v6, v1, Ll/ۜܿۧ;->ᩳ:Landroid/content/Context;

    invoke-virtual/range {p1 .. p1}, Ll/ۖܿۧ;->֫()I

    move-result v7

    .line 2711
    new-array v8, v7, [Ll/᩷ܿۧ;

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 2846
    :goto_0
    invoke-virtual/range {p1 .. p1}, Ll/ۖܿۧ;->֫()I

    move-result v11

    const/4 v12, 0x2

    const/4 v13, 0x1

    if-ge v10, v11, :cond_3

    .line 2847
    invoke-virtual {v0, v10}, Ll/ۖܿۧ;->֫(I)I

    move-result v11

    if-ne v12, v11, :cond_2

    .line 2848
    invoke-virtual {v0, v10}, Ll/ۖܿۧ;->ۧ(I)Ll/ۛܽۧ;

    move-result-object v11

    iget v11, v11, Ll/ۛܽۧ;->ۧ:I

    if-lez v11, :cond_2

    const/4 v10, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_3
    const/4 v10, 0x0

    .line 2854
    :goto_1
    new-instance v11, Ll/᩹ᩳۧ;

    invoke-direct {v11, v1, v4, v10, v3}, Ll/᩹ᩳۧ;-><init>(Ll/ۜܿۧ;Ll/᩺ᩳۧ;Z[I)V

    new-instance v10, Ll/᩶ᩳۧ;

    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    invoke-static {v13, v0, v2, v11, v10}, Ll/ۜܿۧ;->֫(ILl/ۖܿۧ;[[[ILl/ܽܿۧ;Ljava/util/Comparator;)Landroid/util/Pair;

    move-result-object v10

    if-eqz v10, :cond_4

    .line 2722
    iget-object v11, v10, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-object v14, v10, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v14, Ll/᩷ܿۧ;

    aput-object v14, v8, v11

    :cond_4
    if-nez v10, :cond_5

    const/4 v9, 0x0

    goto :goto_2

    .line 2728
    :cond_5
    iget-object v10, v10, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v10, Ll/᩷ܿۧ;

    iget-object v11, v10, Ll/᩷ܿۧ;->֫:Ll/۬᩵֫;

    iget-object v10, v10, Ll/᩷ܿۧ;->ۧ:[I

    aget v9, v10, v9

    invoke-virtual {v11, v9}, Ll/۬᩵֫;->֫(I)Ll/۠ᩴ֫;

    move-result-object v9

    iget-object v9, v9, Ll/۠ᩴ֫;->ۙ:Ljava/lang/String;

    .line 2798
    :goto_2
    iget-object v10, v4, Ll/ۨ᩵֫;->֫:Ll/ۤ᩵֫;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2803
    iget-boolean v10, v4, Ll/ۨ᩵֫;->᩻:Z

    if-eqz v10, :cond_6

    if-eqz v6, :cond_6

    .line 2804
    invoke-static {v6}, Ll/ۘ֨֫;->֫(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object v10

    goto :goto_3

    :cond_6
    const/4 v10, 0x0

    .line 2806
    :goto_3
    new-instance v14, Ll/ܶᩳۧ;

    invoke-direct {v14, v4, v9, v3, v10}, Ll/ܶᩳۧ;-><init>(Ll/᩺ᩳۧ;Ljava/lang/String;[ILandroid/graphics/Point;)V

    new-instance v3, Ll/᩸ᩳۧ;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-static {v12, v0, v2, v14, v3}, Ll/ۜܿۧ;->֫(ILl/ۖܿۧ;[[[ILl/ܽܿۧ;Ljava/util/Comparator;)Landroid/util/Pair;

    move-result-object v3

    .line 2741
    iget-boolean v10, v4, Ll/ۨ᩵֫;->ܳ:Z

    const/4 v14, 0x4

    if-nez v10, :cond_8

    if-nez v3, :cond_7

    goto :goto_4

    :cond_7
    const/4 v10, 0x0

    goto :goto_5

    .line 2971
    :cond_8
    :goto_4
    new-instance v10, Ll/֨ᩳۧ;

    invoke-direct {v10, v4}, Ll/֨ᩳۧ;-><init>(Ll/᩺ᩳۧ;)V

    new-instance v15, Ll/۠ᩳۧ;

    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    invoke-static {v14, v0, v2, v10, v15}, Ll/ۜܿۧ;->֫(ILl/ۖܿۧ;[[[ILl/ܽܿۧ;Ljava/util/Comparator;)Landroid/util/Pair;

    move-result-object v10

    :goto_5
    if-eqz v10, :cond_9

    .line 2746
    iget-object v3, v10, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v10, v10, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v10, Ll/᩷ܿۧ;

    aput-object v10, v8, v3

    goto :goto_6

    :cond_9
    if-eqz v3, :cond_a

    .line 2748
    iget-object v10, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v3, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Ll/᩷ܿۧ;

    aput-object v3, v8, v10

    .line 2930
    :cond_a
    :goto_6
    iget-boolean v3, v4, Ll/ۨ᩵֫;->۫:Z

    if-eqz v3, :cond_e

    if-nez v6, :cond_b

    goto :goto_7

    :cond_b
    const-string v3, "captioning"

    .line 3522
    invoke-virtual {v6, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/accessibility/CaptioningManager;

    if-eqz v3, :cond_e

    .line 3523
    invoke-virtual {v3}, Landroid/view/accessibility/CaptioningManager;->isEnabled()Z

    move-result v6

    if-nez v6, :cond_c

    goto :goto_7

    .line 3526
    :cond_c
    invoke-virtual {v3}, Landroid/view/accessibility/CaptioningManager;->getLocale()Ljava/util/Locale;

    move-result-object v3

    if-nez v3, :cond_d

    goto :goto_7

    .line 3530
    :cond_d
    sget-object v6, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 980
    invoke-virtual {v3}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object v3

    goto :goto_8

    :cond_e
    :goto_7
    const/4 v3, 0x0

    .line 2933
    :goto_8
    new-instance v6, Ll/ۙᩳۧ;

    invoke-direct {v6, v4, v9, v3}, Ll/ۙᩳۧ;-><init>(Ll/᩺ᩳۧ;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Ll/ۗᩳۧ;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    const/4 v9, 0x3

    invoke-static {v9, v0, v2, v6, v3}, Ll/ۜܿۧ;->֫(ILl/ۖܿۧ;[[[ILl/ܽܿۧ;Ljava/util/Comparator;)Landroid/util/Pair;

    move-result-object v3

    if-eqz v3, :cond_f

    .line 2755
    iget-object v6, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v3, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Ll/᩷ܿۧ;

    aput-object v3, v8, v6

    :cond_f
    const/4 v3, 0x0

    :goto_9
    if-ge v3, v7, :cond_17

    .line 2759
    invoke-virtual {v0, v3}, Ll/ۖܿۧ;->֫(I)I

    move-result v6

    if-eq v6, v12, :cond_16

    if-eq v6, v13, :cond_16

    if-eq v6, v9, :cond_16

    if-eq v6, v14, :cond_16

    .line 2766
    invoke-virtual {v0, v3}, Ll/ۖܿۧ;->ۧ(I)Ll/ۛܽۧ;

    move-result-object v6

    aget-object v9, v2, v3

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 3004
    :goto_a
    iget v15, v6, Ll/ۛܽۧ;->ۧ:I

    if-ge v10, v15, :cond_14

    .line 3005
    invoke-virtual {v6, v10}, Ll/ۛܽۧ;->֫(I)Ll/۬᩵֫;

    move-result-object v15

    .line 3006
    aget-object v16, v9, v10

    const/16 v17, 0x0

    move-object/from16 p3, v6

    const/4 v11, 0x0

    .line 3007
    :goto_b
    iget v6, v15, Ll/۬᩵֫;->ᩳ:I

    if-ge v11, v6, :cond_13

    .line 3008
    aget v6, v16, v11

    move/from16 p5, v7

    iget-boolean v7, v4, Ll/᩺ᩳۧ;->ۢ֫:Z

    invoke-static {v6, v7}, Ll/ۧ۬֫;->֫(IZ)Z

    move-result v6

    if-eqz v6, :cond_11

    .line 3010
    invoke-virtual {v15, v11}, Ll/۬᩵֫;->֫(I)Ll/۠ᩴ֫;

    move-result-object v6

    .line 3011
    new-instance v7, Ll/ۛᩳۧ;

    move-object/from16 v17, v9

    aget v9, v16, v11

    invoke-direct {v7, v6, v9}, Ll/ۛᩳۧ;-><init>(Ll/۠ᩴ֫;I)V

    if-eqz v14, :cond_10

    .line 3012
    invoke-virtual {v7, v14}, Ll/ۛᩳۧ;->֫(Ll/ۛᩳۧ;)I

    move-result v6

    if-lez v6, :cond_12

    :cond_10
    move-object v14, v7

    move v12, v11

    move-object v13, v15

    goto :goto_c

    :cond_11
    move-object/from16 v17, v9

    :cond_12
    :goto_c
    add-int/lit8 v11, v11, 0x1

    move/from16 v7, p5

    move-object/from16 v9, v17

    goto :goto_b

    :cond_13
    move/from16 p5, v7

    move-object/from16 v17, v9

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v6, p3

    goto :goto_a

    :cond_14
    move/from16 p5, v7

    if-nez v13, :cond_15

    const/4 v6, 0x0

    goto :goto_d

    .line 3022
    :cond_15
    new-instance v6, Ll/᩷ܿۧ;

    filled-new-array {v12}, [I

    move-result-object v7

    const/4 v9, 0x0

    .line 61
    invoke-direct {v6, v9, v13, v7}, Ll/᩷ܿۧ;-><init>(ILl/۬᩵֫;[I)V

    .line 2765
    :goto_d
    aput-object v6, v8, v3

    goto :goto_e

    :cond_16
    move/from16 p5, v7

    :goto_e
    add-int/lit8 v3, v3, 0x1

    const/4 v9, 0x3

    const/4 v12, 0x2

    const/4 v13, 0x1

    const/4 v14, 0x4

    move/from16 v7, p5

    goto :goto_9

    .line 3113
    :cond_17
    invoke-virtual/range {p1 .. p1}, Ll/ۖܿۧ;->֫()I

    move-result v3

    .line 3116
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    const/4 v7, 0x0

    :goto_f
    if-ge v7, v3, :cond_18

    .line 3119
    invoke-virtual {v0, v7}, Ll/ۖܿۧ;->ۧ(I)Ll/ۛܽۧ;

    move-result-object v9

    .line 3118
    invoke-static {v9, v4, v6}, Ll/ۜܿۧ;->֫(Ll/ۛܽۧ;Ll/ۨ᩵֫;Ljava/util/HashMap;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_f

    .line 3122
    :cond_18
    invoke-virtual/range {p1 .. p1}, Ll/ۖܿۧ;->ۧ()Ll/ۛܽۧ;

    move-result-object v7

    .line 3121
    invoke-static {v7, v4, v6}, Ll/ۜܿۧ;->֫(Ll/ۛܽۧ;Ll/ۨ᩵֫;Ljava/util/HashMap;)V

    const/4 v7, 0x0

    :goto_10
    const/4 v9, -0x1

    if-ge v7, v3, :cond_1b

    .line 3126
    invoke-virtual {v0, v7}, Ll/ۖܿۧ;->֫(I)I

    move-result v10

    .line 3127
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v6, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/۫᩵֫;

    if-nez v10, :cond_19

    goto :goto_12

    .line 3128
    :cond_19
    iget-object v11, v10, Ll/۫᩵֫;->֫:Ll/۬᩵֫;

    iget-object v10, v10, Ll/۫᩵֫;->ۧ:Ll/ܳ۬ܺ;

    .line 3134
    invoke-virtual {v10}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_1a

    .line 3135
    invoke-virtual {v0, v7}, Ll/ۖܿۧ;->ۧ(I)Ll/ۛܽۧ;

    move-result-object v12

    invoke-virtual {v12, v11}, Ll/ۛܽۧ;->֫(Ll/۬᩵֫;)I

    move-result v12

    if-eq v12, v9, :cond_1a

    .line 3137
    new-instance v9, Ll/᩷ܿۧ;

    .line 3139
    invoke-static {v10}, Ll/۬᩺ܺ;->֫(Ljava/util/Collection;)[I

    move-result-object v10

    const/4 v12, 0x0

    .line 61
    invoke-direct {v9, v12, v11, v10}, Ll/᩷ܿۧ;-><init>(ILl/۬᩵֫;[I)V

    goto :goto_11

    :cond_1a
    const/4 v9, 0x0

    .line 3143
    :goto_11
    aput-object v9, v8, v7

    :goto_12
    add-int/lit8 v7, v7, 0x1

    goto :goto_10

    .line 3177
    :cond_1b
    invoke-virtual/range {p1 .. p1}, Ll/ۖܿۧ;->֫()I

    move-result v3

    const/4 v6, 0x0

    :goto_13
    if-ge v6, v3, :cond_1e

    .line 3179
    invoke-virtual {v0, v6}, Ll/ۖܿۧ;->ۧ(I)Ll/ۛܽۧ;

    move-result-object v7

    .line 3180
    invoke-virtual {v4, v6, v7}, Ll/᩺ᩳۧ;->ۧ(ILl/ۛܽۧ;)Z

    move-result v10

    if-nez v10, :cond_1c

    const/4 v7, 0x0

    goto :goto_14

    .line 3184
    :cond_1c
    invoke-virtual {v4, v6, v7}, Ll/᩺ᩳۧ;->֫(ILl/ۛܽۧ;)Ll/ܰᩳۧ;

    move-result-object v7

    if-nez v7, :cond_1d

    const/4 v7, 0x0

    .line 3193
    aput-object v7, v8, v6

    :goto_14
    add-int/lit8 v6, v6, 0x1

    goto :goto_13

    :cond_1d
    const/4 v7, 0x0

    .line 3186
    throw v7

    :cond_1e
    const/4 v3, 0x0

    :goto_15
    if-ge v3, v5, :cond_21

    .line 2633
    invoke-virtual {v0, v3}, Ll/ۖܿۧ;->֫(I)I

    move-result v6

    .line 2634
    invoke-virtual {v4, v3}, Ll/᩺ᩳۧ;->֫(I)Z

    move-result v7

    if-nez v7, :cond_20

    iget-object v7, v4, Ll/ۨ᩵֫;->ۧ:Ll/ۛ۬ܺ;

    .line 2635
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v7, v6}, Ll/᩺ۗܺ;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1f

    goto :goto_16

    :cond_1f
    const/4 v7, 0x0

    goto :goto_17

    :cond_20
    :goto_16
    const/4 v7, 0x0

    .line 2636
    aput-object v7, v8, v3

    :goto_17
    add-int/lit8 v3, v3, 0x1

    goto :goto_15

    :cond_21
    const/4 v7, 0x0

    .line 2641
    iget-object v3, v1, Ll/ۜܿۧ;->ۢ:Ll/ۘᩳۧ;

    .line 2643
    invoke-virtual/range {p0 .. p0}, Ll/ۚܿۧ;->֫()Ll/۬ܿۧ;

    move-result-object v6

    .line 2642
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    invoke-static {v8}, Ll/ᩴᩳۧ;->֫([Ll/᩷ܿۧ;)Ll/ܳ۬ܺ;

    move-result-object v3

    .line 240
    array-length v10, v8

    new-array v14, v10, [Ll/ۢܿۧ;

    const/4 v10, 0x0

    const/4 v15, 0x0

    .line 241
    :goto_18
    array-length v10, v8

    if-ge v15, v10, :cond_25

    .line 242
    aget-object v10, v8, v15

    if-eqz v10, :cond_24

    .line 243
    iget-object v12, v10, Ll/᩷ܿۧ;->ۧ:[I

    array-length v11, v12

    if-nez v11, :cond_22

    goto :goto_1a

    .line 247
    :cond_22
    array-length v11, v12

    const/4 v13, 0x1

    if-ne v11, v13, :cond_23

    .line 248
    new-instance v11, Ll/ۡܿۧ;

    iget-object v10, v10, Ll/᩷ܿۧ;->֫:Ll/۬᩵֫;

    const/4 v13, 0x0

    aget v12, v12, v13

    .line 63
    filled-new-array {v12}, [I

    move-result-object v12

    invoke-direct {v11, v10, v12}, Ll/֡ᩳۧ;-><init>(Ll/۬᩵֫;[I)V

    move-object/from16 p4, v8

    move-object v9, v14

    move/from16 v22, v15

    goto :goto_19

    .line 252
    :cond_23
    iget-object v11, v10, Ll/᩷ܿۧ;->֫:Ll/۬᩵֫;

    .line 257
    invoke-interface {v3, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v20, v10

    check-cast v20, Ll/ܳ۬ܺ;

    .line 279
    new-instance v21, Ll/ᩴᩳۧ;

    const/16 v10, 0x2710

    move-object/from16 p4, v8

    int-to-long v7, v10

    const/16 v10, 0x61a8

    int-to-long v1, v10

    move-object/from16 v10, v21

    move-object v13, v6

    move-object v9, v14

    move/from16 v22, v15

    move-wide v14, v7

    move-wide/from16 v16, v1

    move-wide/from16 v18, v1

    invoke-direct/range {v10 .. v20}, Ll/ᩴᩳۧ;-><init>(Ll/۬᩵֫;[ILl/۬ܿۧ;JJJLl/ܳ۬ܺ;)V

    move-object/from16 v11, v21

    .line 252
    :goto_19
    aput-object v11, v9, v22

    goto :goto_1b

    :cond_24
    :goto_1a
    move-object/from16 p4, v8

    move-object v9, v14

    move/from16 v22, v15

    :goto_1b
    add-int/lit8 v15, v22, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v8, p4

    move-object v14, v9

    const/4 v7, 0x0

    const/4 v9, -0x1

    goto :goto_18

    :cond_25
    move-object v9, v14

    .line 2648
    new-array v1, v5, [Ll/ܿ۬֫;

    const/4 v2, 0x0

    :goto_1c
    if-ge v2, v5, :cond_29

    .line 2650
    invoke-virtual {v0, v2}, Ll/ۖܿۧ;->֫(I)I

    move-result v3

    .line 2652
    invoke-virtual {v4, v2}, Ll/᩺ᩳۧ;->֫(I)Z

    move-result v6

    if-nez v6, :cond_28

    iget-object v6, v4, Ll/ۨ᩵֫;->ۧ:Ll/ۛ۬ܺ;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v6, v3}, Ll/᩺ۗܺ;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_26

    goto :goto_1d

    .line 2655
    :cond_26
    invoke-virtual {v0, v2}, Ll/ۖܿۧ;->֫(I)I

    move-result v3

    const/4 v6, -0x2

    if-eq v3, v6, :cond_27

    aget-object v3, v9, v2

    if-eqz v3, :cond_28

    .line 2657
    :cond_27
    sget-object v7, Ll/ܿ۬֫;->ܽ:Ll/ܿ۬֫;

    goto :goto_1e

    :cond_28
    :goto_1d
    const/4 v7, 0x0

    :goto_1e
    aput-object v7, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1c

    .line 2661
    :cond_29
    iget-boolean v2, v4, Ll/᩺ᩳۧ;->ۘ֫:Z

    if-eqz v2, :cond_33

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v5, -0x1

    .line 3219
    :goto_1f
    invoke-virtual/range {p1 .. p1}, Ll/ۖܿۧ;->֫()I

    move-result v6

    if-ge v3, v6, :cond_31

    .line 3220
    invoke-virtual {v0, v3}, Ll/ۖܿۧ;->֫(I)I

    move-result v6

    .line 3221
    aget-object v7, v9, v3

    const/4 v8, 0x1

    const/4 v10, 0x2

    if-eq v6, v8, :cond_2a

    if-ne v6, v10, :cond_30

    :cond_2a
    if-eqz v7, :cond_30

    .line 3224
    aget-object v8, p2, v3

    .line 3225
    invoke-virtual {v0, v3}, Ll/ۖܿۧ;->ۧ(I)Ll/ۛܽۧ;

    move-result-object v10

    .line 3269
    invoke-interface {v7}, Ll/ᩴܿۧ;->ܿ()Ll/۬᩵֫;

    move-result-object v11

    invoke-virtual {v10, v11}, Ll/ۛܽۧ;->֫(Ll/۬᩵֫;)I

    move-result v10

    const/4 v11, 0x0

    .line 3270
    :goto_20
    invoke-interface {v7}, Ll/ᩴܿۧ;->length()I

    move-result v12

    if-ge v11, v12, :cond_2c

    .line 3272
    aget-object v12, v8, v10

    invoke-interface {v7, v11}, Ll/ᩴܿۧ;->ۧ(I)I

    move-result v13

    aget v12, v12, v13

    and-int/lit8 v12, v12, 0x20

    const/16 v13, 0x20

    if-eq v12, v13, :cond_2b

    goto :goto_22

    :cond_2b
    add-int/lit8 v11, v11, 0x1

    goto :goto_20

    :cond_2c
    const/4 v7, 0x1

    if-ne v6, v7, :cond_2e

    const/4 v6, -0x1

    if-eq v5, v6, :cond_2d

    goto :goto_21

    :cond_2d
    move v5, v3

    goto :goto_22

    :cond_2e
    const/4 v6, -0x1

    if-eq v2, v6, :cond_2f

    :goto_21
    const/4 v0, 0x0

    goto :goto_23

    :cond_2f
    move v2, v3

    :cond_30
    :goto_22
    add-int/lit8 v3, v3, 0x1

    goto :goto_1f

    :cond_31
    const/4 v0, 0x1

    :goto_23
    const/4 v3, -0x1

    if-eq v5, v3, :cond_32

    if-eq v2, v3, :cond_32

    const/4 v3, 0x1

    goto :goto_24

    :cond_32
    const/4 v3, 0x0

    :goto_24
    and-int/2addr v0, v3

    if-eqz v0, :cond_33

    .line 3246
    new-instance v0, Ll/ܿ۬֫;

    const/4 v3, 0x0

    const/4 v6, 0x1

    invoke-direct {v0, v3, v6}, Ll/ܿ۬֫;-><init>(IZ)V

    .line 3248
    aput-object v0, v1, v5

    .line 3249
    aput-object v0, v1, v2

    .line 2667
    :cond_33
    iget-object v0, v4, Ll/ۨ᩵֫;->֫:Ll/ۤ᩵֫;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2676
    invoke-static {v1, v9}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    .line 2610
    :try_start_1
    monitor-exit v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final ֫(Ll/ۨ᩵֫;)V
    .locals 3

    .line 2521
    instance-of v0, p1, Ll/᩺ᩳۧ;

    if-eqz v0, :cond_0

    .line 2522
    move-object v0, p1

    check-cast v0, Ll/᩺ᩳۧ;

    invoke-direct {p0, v0}, Ll/ۜܿۧ;->֫(Ll/᩺ᩳۧ;)V

    .line 2525
    :cond_0
    new-instance v1, Ll/ۨᩳۧ;

    .line 2509
    iget-object v0, p0, Ll/ۜܿۧ;->ܳ:Ljava/lang/Object;

    monitor-enter v0

    .line 2510
    :try_start_0
    iget-object v2, p0, Ll/ۜܿۧ;->᩻:Ll/᩺ᩳۧ;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2525
    invoke-direct {v1, v2}, Ll/ۨᩳۧ;-><init>(Ll/᩺ᩳۧ;)V

    invoke-virtual {v1, p1}, Ll/ۨᩳۧ;->ۧ(Ll/ۨ᩵֫;)V

    .line 1730
    new-instance p1, Ll/᩺ᩳۧ;

    const/4 v0, 0x0

    invoke-direct {p1, v1, v0}, Ll/᩺ᩳۧ;-><init>(Ll/ۨᩳۧ;I)V

    .line 2526
    invoke-direct {p0, p1}, Ll/ۜܿۧ;->֫(Ll/᩺ᩳۧ;)V

    return-void

    :catchall_0
    move-exception p1

    .line 2511
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/ᩳᩴ֫;)V
    .locals 1

    .line 2531
    iget-object v0, p0, Ll/ۜܿۧ;->ܽ:Ll/ᩳᩴ֫;

    invoke-virtual {v0, p1}, Ll/ᩳᩴ֫;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2534
    :cond_0
    iput-object p1, p0, Ll/ۜܿۧ;->ܽ:Ll/ᩳᩴ֫;

    .line 2535
    invoke-direct {p0}, Ll/ۜܿۧ;->᩻()V

    return-void
.end method

.method public final ۧ()Ll/ۨ᩵֫;
    .locals 2

    .line 2509
    iget-object v0, p0, Ll/ۜܿۧ;->ܳ:Ljava/lang/Object;

    monitor-enter v0

    .line 2510
    :try_start_0
    iget-object v1, p0, Ll/ۜܿۧ;->᩻:Ll/᩺ᩳۧ;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 2511
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ۧ(Ll/ۙ᩹֫;)V
    .locals 2

    .line 3099
    iget-object v0, p0, Ll/ۜܿۧ;->ܳ:Ljava/lang/Object;

    monitor-enter v0

    .line 3100
    :try_start_0
    iget-object v1, p0, Ll/ۜܿۧ;->᩻:Ll/᩺ᩳۧ;

    iget-boolean v1, v1, Ll/᩺ᩳۧ;->ܽ֫:Z

    .line 3101
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 3103
    invoke-virtual {p0, p1}, Ll/ۚܿۧ;->֫(Ll/ۙ᩹֫;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 3101
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ܽ()Ll/ܽ۬֫;
    .locals 0

    return-object p0
.end method

.method public final ܿ()V
    .locals 3

    .line 2493
    iget-object v0, p0, Ll/ۜܿۧ;->ܳ:Ljava/lang/Object;

    monitor-enter v0

    .line 2494
    :try_start_0
    iget-object v1, p0, Ll/ۜܿۧ;->ۜ:Ljava/lang/Thread;

    if-eqz v1, :cond_1

    .line 2496
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "DefaultTrackSelector is accessed on the wrong thread."

    .line 2495
    invoke-static {v2, v1}, Ll/᩺֡֫;->ۧ(Ljava/lang/String;Z)V

    .line 2499
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2500
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x20

    if-lt v0, v1, :cond_2

    iget-object v0, p0, Ll/ۜܿۧ;->᩷:Ll/֫ܿۧ;

    if-eqz v0, :cond_2

    .line 2501
    invoke-virtual {v0}, Ll/֫ܿۧ;->ᩳ()V

    const/4 v0, 0x0

    .line 2502
    iput-object v0, p0, Ll/ۜܿۧ;->᩷:Ll/֫ܿۧ;

    .line 2504
    :cond_2
    invoke-super {p0}, Ll/ۚܿۧ;->ܿ()V

    return-void

    :catchall_0
    move-exception v1

    .line 2499
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
