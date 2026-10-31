.class public final Ll/ܿ᩹᩻;
.super Ll/ۤۜܳ;
.source "8985"


# virtual methods
.method public final ֫(Ll/ܽۢܳ;)V
    .locals 16

    .line 215
    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f1205b1

    .line 217
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    .line 218
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-array v4, v2, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v3, v4, v5

    const v3, 0x7f110008

    invoke-virtual {v0, v3, v2, v4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x3

    .line 219
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    new-array v8, v2, [Ljava/lang/Object;

    aput-object v7, v8, v5

    invoke-virtual {v0, v3, v6, v8}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x7

    .line 220
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    new-array v10, v2, [Ljava/lang/Object;

    aput-object v9, v10, v5

    invoke-virtual {v0, v3, v8, v10}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    const/16 v10, 0xe

    .line 221
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    new-array v12, v2, [Ljava/lang/Object;

    aput-object v11, v12, v5

    invoke-virtual {v0, v3, v10, v12}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    const/16 v11, 0x1e

    .line 222
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    new-array v13, v2, [Ljava/lang/Object;

    aput-object v12, v13, v5

    invoke-virtual {v0, v3, v11, v13}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    const/16 v12, 0x3c

    .line 223
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    new-array v14, v2, [Ljava/lang/Object;

    aput-object v13, v14, v5

    invoke-virtual {v0, v3, v12, v14}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    const/16 v13, 0x5a

    .line 224
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-array v15, v2, [Ljava/lang/Object;

    aput-object v14, v15, v5

    invoke-virtual {v0, v3, v13, v15}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/16 v13, 0x8

    new-array v13, v13, [Ljava/lang/CharSequence;

    aput-object v1, v13, v5

    aput-object v4, v13, v2

    const/4 v1, 0x2

    aput-object v7, v13, v1

    aput-object v9, v13, v6

    const/4 v1, 0x4

    aput-object v10, v13, v1

    const/4 v1, 0x5

    aput-object v11, v13, v1

    const/4 v1, 0x6

    aput-object v12, v13, v1

    aput-object v3, v13, v8

    .line 226
    invoke-virtual/range {p1 .. p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v1

    const v2, 0x7f1205b0

    .line 227
    invoke-virtual {v1, v2}, Ll/᩵ۚۢ;->ۧ(I)V

    new-instance v2, Ll/۟᩸᩻;

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-direct {v2, v3, v4, v0, v13}, Ll/۟᩸᩻;-><init>(Ll/ܿ᩹᩻;Ll/ܽۢܳ;Landroid/content/res/Resources;[Ljava/lang/CharSequence;)V

    const/4 v0, -0x1

    .line 228
    invoke-virtual {v1, v13, v0, v2}, Ll/᩵ۚۢ;->֫([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V

    .line 251
    invoke-virtual {v1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method
