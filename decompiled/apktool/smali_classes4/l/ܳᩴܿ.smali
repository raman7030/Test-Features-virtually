.class public final Ll/ܳᩴܿ;
.super Ljava/lang/Object;
.source "B9A2"


# static fields
.field public static ֫:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    .line 30
    invoke-static {}, Ll/ܳᩴܿ;->ᩳ()V

    return-void
.end method

.method public static ֫()Ljava/util/List;
    .locals 1

    .line 57
    sget-object v0, Ll/ܳᩴܿ;->֫:Ljava/util/ArrayList;

    return-object v0
.end method

.method public static ֫(Ll/۫ۨᩳ;)V
    .locals 4

    .line 38
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "stid"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 39
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 40
    sget-object v1, Ll/ܳᩴܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽᩴܿ;

    .line 41
    invoke-interface {v2}, Ll/ܽᩴܿ;->֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 42
    invoke-interface {v2, p0}, Ll/ܽᩴܿ;->֫(Ll/۫ۨᩳ;)Z

    move-result p0

    if-nez p0, :cond_2

    .line 43
    invoke-static {}, Ll/ܳᩴܿ;->ܽ()Ljava/util/ArrayList;

    move-result-object p0

    sput-object p0, Ll/ܳᩴܿ;->֫:Ljava/util/ArrayList;

    return-void

    .line 49
    :cond_1
    sget-object v0, Ll/ܳᩴܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 50
    sget-object v0, Ll/ܳᩴܿ;->֫:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽᩴܿ;

    invoke-interface {v0, p0}, Ll/ܽᩴܿ;->֫(Ll/۫ۨᩳ;)Z

    move-result p0

    if-nez p0, :cond_2

    .line 51
    invoke-static {}, Ll/ܳᩴܿ;->ܽ()Ljava/util/ArrayList;

    move-result-object p0

    sput-object p0, Ll/ܳᩴܿ;->֫:Ljava/util/ArrayList;

    :cond_2
    return-void
.end method

.method public static ۧ()Z
    .locals 1

    .line 34
    sget-object v0, Ll/ܳᩴܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public static ܽ()Ljava/util/ArrayList;
    .locals 17

    .line 65
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 67
    :try_start_0
    new-instance v1, Ll/ᩳᩴܿ;

    invoke-static {}, Ll/ۙ᩸᩷;->ۘ()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-direct {v1, v2}, Ll/ᩳᩴܿ;-><init>(Landroid/content/pm/PackageManager;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 70
    :goto_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-lt v1, v2, :cond_6

    .line 71
    invoke-static {}, Ll/ۙ᩸᩷;->ۘ()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 72
    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.PROCESS_TEXT"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v3, "text/plain"

    .line 73
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v3, 0x10000

    .line 74
    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v2

    .line 75
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 76
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/pm/ResolveInfo;

    .line 77
    invoke-virtual {v4, v1}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v5

    if-eqz v5, :cond_4

    .line 79
    invoke-interface {v5}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v5

    .line 80
    iget-object v6, v4, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v6, v6, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    const-string v7, "Translate"

    .line 81
    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_3

    const-string v8, "\u7ffb\u8bd1"

    .line 82
    invoke-virtual {v5, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_3

    const-string v9, "\u7ffb\u8b6f"

    .line 83
    invoke-virtual {v5, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_3

    const-string v10, "\u041f\u0435\u0440\u0435\u0432\u0435\u0441\u0442\u0438"

    .line 84
    invoke-virtual {v5, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_3

    const-string v11, "\u041f\u0435\u0440\u0430\u043a\u043b\u0430\u0441\u0446\u0456"

    .line 85
    invoke-virtual {v5, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_3

    const-string v12, "T\u0259rc\u00fcm\u0259 etm\u0259k"

    .line 86
    invoke-virtual {v5, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v13

    if-nez v13, :cond_3

    const-string v13, "Traducir"

    .line 87
    invoke-virtual {v5, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v14

    if-nez v14, :cond_3

    const-string v14, "Menerjemahkan"

    .line 88
    invoke-virtual {v5, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v15

    if-nez v15, :cond_3

    const-string v15, "\u00c7evir"

    .line 89
    invoke-virtual {v5, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v16

    if-eqz v16, :cond_0

    goto :goto_3

    .line 92
    :cond_0
    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v16

    if-nez v16, :cond_1

    move-object/from16 v16, v1

    const-string v1, "Translation"

    invoke-virtual {v6, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "Translator"

    .line 93
    invoke-virtual {v6, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, ".translate."

    invoke-virtual {v6, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 94
    invoke-static {v5, v7}, Ll/ۢܺ֡;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 95
    invoke-static {v5, v8}, Ll/ۢܺ֡;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 96
    invoke-static {v5, v9}, Ll/ۢܺ֡;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 97
    invoke-static {v5, v10}, Ll/ۢܺ֡;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 98
    invoke-static {v5, v11}, Ll/ۢܺ֡;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 99
    invoke-static {v5, v12}, Ll/ۢܺ֡;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 100
    invoke-static {v5, v13}, Ll/ۢܺ֡;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 101
    invoke-static {v5, v14}, Ll/ۢܺ֡;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 102
    invoke-static {v5, v15}, Ll/ۢܺ֡;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_2

    :cond_1
    move-object/from16 v16, v1

    .line 104
    :cond_2
    :goto_2
    new-instance v1, Ll/ܿᩴܿ;

    invoke-direct {v1, v4}, Ll/ܿᩴܿ;-><init>(Landroid/content/pm/ResolveInfo;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_3
    :goto_3
    move-object/from16 v16, v1

    add-int/lit8 v1, v3, 0x1

    .line 91
    new-instance v5, Ll/ܿᩴܿ;

    invoke-direct {v5, v4}, Ll/ܿᩴܿ;-><init>(Landroid/content/pm/ResolveInfo;)V

    invoke-virtual {v0, v3, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    move v3, v1

    goto :goto_4

    :cond_4
    move-object/from16 v16, v1

    :cond_5
    :goto_4
    move-object/from16 v1, v16

    goto/16 :goto_1

    :cond_6
    return-object v0
.end method

.method public static ᩳ()V
    .locals 1

    .line 61
    invoke-static {}, Ll/ܳᩴܿ;->ܽ()Ljava/util/ArrayList;

    move-result-object v0

    sput-object v0, Ll/ܳᩴܿ;->֫:Ljava/util/ArrayList;

    return-void
.end method
