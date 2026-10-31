.class public Ll/۫ܶۘ;
.super Ljava/lang/Object;
.source "51RR"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Ljava/util/List;Ll/۬ܶۘ;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    const-string v2, "openSDK_LOG.JsBridge"

    .line 94
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v3

    .line 96
    array-length v4, v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_1

    aget-object v7, v3, v6

    .line 97
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v8

    move-object/from16 v9, p1

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 98
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v8

    .line 99
    array-length v8, v8

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v10

    if-ne v8, v10, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v7, 0x0

    :goto_1
    if-eqz v7, :cond_c

    .line 111
    :try_start_0
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v3

    if-eqz v3, :cond_7

    const/4 v4, 0x1

    if-eq v3, v4, :cond_6

    const/4 v6, 0x2

    if-eq v3, v6, :cond_5

    const/4 v8, 0x3

    if-eq v3, v8, :cond_4

    const/4 v9, 0x4

    if-eq v3, v9, :cond_3

    const/4 v10, 0x5

    if-eq v3, v10, :cond_2

    .line 132
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v15, 0x6

    new-array v15, v15, [Ljava/lang/Object;

    aput-object v3, v15, v5

    aput-object v11, v15, v4

    aput-object v12, v15, v6

    aput-object v13, v15, v8

    aput-object v14, v15, v9

    aput-object v0, v15, v10

    invoke-virtual {v7, v1, v15}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto/16 :goto_2

    .line 128
    :cond_2
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    new-array v10, v10, [Ljava/lang/Object;

    aput-object v3, v10, v5

    aput-object v11, v10, v4

    aput-object v12, v10, v6

    aput-object v13, v10, v8

    aput-object v0, v10, v9

    invoke-virtual {v7, v1, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_2

    .line 125
    :cond_3
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    new-array v9, v9, [Ljava/lang/Object;

    aput-object v3, v9, v5

    aput-object v10, v9, v4

    aput-object v11, v9, v6

    aput-object v0, v9, v8

    invoke-virtual {v7, v1, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_2

    .line 122
    :cond_4
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    new-array v8, v8, [Ljava/lang/Object;

    aput-object v3, v8, v5

    aput-object v9, v8, v4

    aput-object v0, v8, v6

    invoke-virtual {v7, v1, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_2

    .line 119
    :cond_5
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v3, v6, v5

    aput-object v0, v6, v4

    invoke-virtual {v7, v1, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_2

    .line 116
    :cond_6
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    new-array v3, v4, [Ljava/lang/Object;

    aput-object v0, v3, v5

    invoke-virtual {v7, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_2
    const/4 v3, 0x0

    goto :goto_3

    :cond_7
    const/4 v3, 0x0

    .line 113
    invoke-virtual {v7, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 135
    :goto_3
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v4

    .line 136
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "-->call, result: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " | ReturnType: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "void"

    .line 137
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_b

    const-class v5, Ljava/lang/Void;

    if-ne v4, v5, :cond_8

    goto :goto_4

    .line 0
    :cond_8
    instance-of v4, v1, Ll/ۜ᩹ۘ;

    if-eqz v4, :cond_a

    if-eqz v0, :cond_9

    .line 144
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :cond_9
    move-object/from16 v4, p3

    :try_start_1
    invoke-virtual {v4, v3}, Ll/۬ܶۘ;->֫(Ljava/lang/String;)V

    :cond_a
    return-void

    :cond_b
    :goto_4
    move-object/from16 v4, p3

    .line 139
    invoke-virtual/range {p3 .. p3}, Ll/۬ܶۘ;->֫()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v0

    goto :goto_5

    :catch_1
    move-exception v0

    move-object/from16 v4, p3

    .line 152
    :goto_5
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "-->handler call mehtod ex. targetMethod: "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 154
    invoke-virtual/range {p3 .. p3}, Ll/۬ܶۘ;->ۧ()V

    return-void

    :cond_c
    move-object/from16 v4, p3

    .line 160
    invoke-virtual/range {p3 .. p3}, Ll/۬ܶۘ;->ۧ()V

    return-void
.end method
