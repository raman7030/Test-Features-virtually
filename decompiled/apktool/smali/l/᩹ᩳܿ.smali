.class public final Ll/᩹ᩳܿ;
.super Ll/ۧܿܿ;
.source "N7PP"


# static fields
.field public static final ۜ:Ll/᩸ᩳܿ;


# instance fields
.field public final ܳ:Lbin/mt/json/JSONObject;

.field public ᩻:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 179
    new-instance v0, Ll/᩸ᩳܿ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/᩹ᩳܿ;->ۜ:Ll/᩸ᩳܿ;

    return-void
.end method

.method public constructor <init>(Lbin/mt/json/JSONObject;)V
    .locals 1

    const/16 v0, 0x1b

    .line 45
    invoke-direct {p0, v0}, Ll/ۧܿܿ;-><init>(I)V

    .line 46
    iput-object p1, p0, Ll/᩹ᩳܿ;->ܳ:Lbin/mt/json/JSONObject;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩹ᩳܿ;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/᩹ᩳܿ;->᩻:Z

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/view/View;Ll/֫ܿܿ;)V
    .locals 17

    move-object/from16 v15, p0

    .line 63
    iget-boolean v0, v15, Ll/᩹ᩳܿ;->᩻:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 67
    :cond_0
    invoke-interface/range {p2 .. p2}, Ll/֫ܿܿ;->֫()Ll/۫ۨᩳ;

    move-result-object v14

    if-nez v14, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, "a"

    .line 71
    iget-object v1, v15, Ll/᩹ᩳܿ;->ܳ:Lbin/mt/json/JSONObject;

    invoke-virtual {v1, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "b"

    .line 72
    invoke-virtual {v1, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v2, "c"

    .line 73
    invoke-virtual {v1, v2}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    const-string v3, "d"

    .line 75
    invoke-virtual {v1, v3}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v7

    const-string v3, "e"

    .line 76
    invoke-virtual {v1, v3}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v11

    const-string v3, "f"

    const/4 v4, 0x1

    .line 77
    invoke-virtual {v1, v3, v4}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v10

    .line 78
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    :goto_0
    return-void

    :cond_2
    if-nez v10, :cond_3

    .line 82
    invoke-static {v0}, Ll/ۘ۫ۡ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_3
    if-eqz v2, :cond_4

    const/16 v1, 0x8

    .line 87
    :try_start_0
    invoke-static {v1, v0}, Ll/ۨۘܽ;->֫(ILjava/lang/String;)Ll/ۨۘܽ;

    move-result-object v0

    goto :goto_1

    :cond_4
    const/16 v1, 0x4a

    .line 89
    invoke-static {v1, v0}, Ll/ۨۘܽ;->֫(ILjava/lang/String;)Ll/ۨۘܽ;

    move-result-object v0

    :goto_1
    move-object v6, v0

    if-eqz v10, :cond_5

    .line 91
    invoke-static {v6, v9}, Ll/ܰۘܽ;->֫(Ll/ۨۘܽ;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    :cond_5
    invoke-virtual {v14}, Ll/۫ۨᩳ;->ۗ֫()[I

    move-result-object v8

    const/4 v0, 0x0

    if-nez v7, :cond_6

    .line 98
    aget v0, v8, v0

    aget v1, v8, v4

    if-ne v0, v1, :cond_6

    const v0, 0x7f1206f7

    .line 99
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    :cond_6
    const/4 v0, 0x2

    if-ne v7, v0, :cond_7

    const/4 v0, 0x1

    const/4 v12, 0x1

    goto :goto_2

    :cond_7
    const/4 v0, 0x0

    const/4 v12, 0x0

    .line 103
    :goto_2
    invoke-virtual {v14}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Ll/ۚ۫ۡ;->֫(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Ll/ۗܺ᩷;

    .line 104
    invoke-virtual {v14}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v4

    .line 105
    invoke-interface {v4}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v5

    .line 106
    new-instance v3, Ll/ܰ᩺ᩳ;

    new-instance v1, Ll/֡ᩳܿ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const v2, 0x7f1207a7

    invoke-direct {v3, v14, v0, v2, v1}, Ll/ܰ᩺ᩳ;-><init>(Ll/۫ۨᩳ;Ll/ۗܺ᩷;ILjava/util/function/BooleanSupplier;)V

    .line 108
    invoke-virtual {v14}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    invoke-static {v1}, Ll/۠֨ᩴ;->toPath(Ljava/io/File;)Ll/᩷۠ᩴ;

    move-result-object v1

    const-string v2, "replace-output"

    invoke-interface {v1, v2}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v13

    .line 109
    new-instance v16, Ll/֨ᩳܿ;

    move-object/from16 v1, v16

    move-object/from16 v2, p0

    move-object v15, v0

    invoke-direct/range {v1 .. v15}, Ll/֨ᩳܿ;-><init>(Ll/᩹ᩳܿ;Ll/ܰ᩺ᩳ;Ll/۟᩺ᩳ;ILl/ۨۘܽ;I[ILjava/lang/String;ZIZLl/᩷۠ᩴ;Ll/۫ۨᩳ;Ll/ۗܺ᩷;)V

    .line 176
    invoke-virtual/range {v16 .. v16}, Ll/۟ܶۡ;->᩻()V

    return-void

    :catch_0
    move-exception v0

    .line 94
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    return-void
.end method

.method public final ᩳ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 51
    iget-object v0, p0, Ll/᩹ᩳܿ;->ܳ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩻()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
