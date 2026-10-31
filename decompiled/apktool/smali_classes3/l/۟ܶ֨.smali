.class public final Ll/۟ܶ֨;
.super Ljava/lang/Object;
.source "X43L"


# instance fields
.field public ֫:Ljava/util/WeakHashMap;

.field public final synthetic ۧ:Ll/ۛ᩸֨;


# direct methods
.method public constructor <init>(Ll/ۛ᩸֨;)V
    .locals 0

    .line 2931
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ܶ֨;->ۧ:Ll/ۛ᩸֨;

    .line 2933
    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, Ll/۟ܶ֨;->֫:Ljava/util/WeakHashMap;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۟ܶ֨;)Ljava/util/WeakHashMap;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟ܶ֨;->֫:Ljava/util/WeakHashMap;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ۘ֡֨;Ll/᩶֡֨;ZLjava/util/function/Predicate;)Ll/ۘ֡֨;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v4, p4

    .line 2959
    iget-object v5, v0, Ll/۟ܶ֨;->֫:Ljava/util/WeakHashMap;

    invoke-virtual {v5, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/ref/SoftReference;

    const/4 v7, 0x0

    if-eqz v6, :cond_0

    .line 2960
    invoke-virtual {v6}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map;

    goto :goto_0

    :cond_0
    move-object v6, v7

    :goto_0
    if-nez v6, :cond_1

    .line 2962
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 2963
    new-instance v8, Ljava/lang/ref/SoftReference;

    invoke-direct {v8, v6}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v5, v1, v8}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2965
    :cond_1
    invoke-interface {v6, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܰܶ֨;

    .line 2966
    iget-object v8, v2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    const/4 v9, 0x1

    iget-object v10, v0, Ll/۟ܶ֨;->ۧ:Ll/ۛ᩸֨;

    invoke-virtual {v10, v8, v9}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Z)Ll/ܿ᩵֨;

    move-result-object v8

    if-eqz v5, :cond_2

    .line 2968
    invoke-virtual {v8}, Ll/ܿ᩵֨;->ۧ()I

    move-result v9

    .line 2952
    iget-object v11, v5, Ll/ܰܶ֨;->ܽ:Ljava/util/function/Predicate;

    if-ne v11, v4, :cond_2

    iget-boolean v11, v5, Ll/ܰܶ֨;->ۧ:Z

    if-ne v11, v3, :cond_2

    iget v11, v5, Ll/ܰܶ֨;->ᩳ:I

    if-ne v11, v9, :cond_2

    .line 2974
    iget-object v1, v5, Ll/ܰܶ֨;->֫:Ll/ۘ֡֨;

    return-object v1

    .line 2979
    :cond_2
    iget-object v5, v2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    :goto_1
    sget-object v9, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    invoke-virtual {v5, v9}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v9

    if-nez v9, :cond_3

    sget-object v9, Ll/ۢ۠֨;->ۢ֫:Ll/ۢ۠֨;

    invoke-virtual {v5, v9}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v9

    if-eqz v9, :cond_7

    :cond_3
    const/4 v9, 0x0

    .line 2980
    invoke-virtual {v10, v5, v9}, Ll/ۛ᩸֨;->ۧ(Ll/ۙ֨֨;Z)Ll/ۙ֨֨;

    move-result-object v5

    .line 2981
    iget-object v9, v5, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 2983
    invoke-virtual {v9}, Ll/ۛ֡֨;->֨֫()Ll/ܰ᩵֨;

    move-result-object v9

    iget-object v11, v1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    sget-object v12, Ll/֨᩵֨;->᩶:Ll/֨᩵֨;

    invoke-virtual {v9, v11, v4, v12}, Ll/۟᩵֨;->֫(Ll/ۤܶ۠;Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;

    move-result-object v9

    .line 2983
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move-object v11, v7

    :cond_4
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ۛ֡֨;

    if-eqz v12, :cond_4

    .line 2984
    invoke-virtual {v12, v1, v2, v10, v3}, Ll/ۛ֡֨;->֫(Ll/ۛ֡֨;Ll/᩶֡֨;Ll/ۛ᩸֨;Z)Z

    move-result v13

    if-eqz v13, :cond_4

    .line 2986
    invoke-virtual {v12}, Ll/ۛ֡֨;->۬()J

    move-result-wide v13

    const-wide/16 v15, 0x400

    and-long/2addr v13, v15

    const-wide/16 v15, 0x0

    cmp-long v11, v13, v15

    if-nez v11, :cond_5

    move-object v11, v12

    goto :goto_3

    :cond_5
    move-object v11, v12

    goto :goto_2

    :cond_6
    :goto_3
    if-eqz v11, :cond_8

    .line 2994
    move-object v7, v11

    check-cast v7, Ll/ۘ֡֨;

    .line 2970
    :cond_7
    new-instance v1, Ll/ܰܶ֨;

    invoke-virtual {v8}, Ll/ܿ᩵֨;->ۧ()I

    move-result v5

    invoke-direct {v1, v7, v4, v3, v5}, Ll/ܰܶ֨;-><init>(Ll/ۘ֡֨;Ljava/util/function/Predicate;ZI)V

    invoke-interface {v6, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v7

    .line 2979
    :cond_8
    invoke-virtual {v10, v5}, Ll/ۛ᩸֨;->᩸(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v5

    goto :goto_1
.end method
