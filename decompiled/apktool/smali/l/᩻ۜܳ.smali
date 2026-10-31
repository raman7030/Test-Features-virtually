.class public final synthetic Ll/᩻ۜܳ;
.super Ljava/lang/Object;
.source "C76R"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۗ:Ll/᩵ۜܳ;

.field public final synthetic ۙ:Z

.field public final synthetic ۬:Ll/֡ۚۢ;

.field public final synthetic ᩶:Landroid/widget/Spinner;

.field public final synthetic ᩸:Landroid/widget/EditText;

.field public final synthetic ᩹:Landroid/widget/EditText;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/Spinner;ZLl/᩵ۜܳ;Ll/֡ۚۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻ۜܳ;->᩸:Landroid/widget/EditText;

    iput-object p2, p0, Ll/᩻ۜܳ;->᩹:Landroid/widget/EditText;

    iput-object p3, p0, Ll/᩻ۜܳ;->᩶:Landroid/widget/Spinner;

    iput-boolean p4, p0, Ll/᩻ۜܳ;->ۙ:Z

    iput-object p5, p0, Ll/᩻ۜܳ;->ۗ:Ll/᩵ۜܳ;

    iput-object p6, p0, Ll/᩻ۜܳ;->۬:Ll/֡ۚۢ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 18

    move-object/from16 v0, p0

    .line 296
    iget-object v1, v0, Ll/᩻ۜܳ;->᩸:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 297
    iget-object v3, v0, Ll/᩻ۜܳ;->᩹:Landroid/widget/EditText;

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 298
    iget-object v5, v0, Ll/᩻ۜܳ;->᩶:Landroid/widget/Spinner;

    invoke-virtual {v5}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v5

    mul-int/lit8 v6, v5, 0xa

    const-wide/16 v7, 0x1

    shl-long v6, v7, v6

    .line 300
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_0

    const v1, 0x7f120302

    .line 301
    invoke-static {v1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 304
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    const-wide/16 v9, -0x1

    if-eqz v8, :cond_1

    move-wide v11, v9

    goto :goto_1

    .line 445
    :cond_1
    :try_start_0
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v11
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-wide v11, v9

    :goto_0
    mul-long v11, v11, v6

    .line 305
    :goto_1
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    const v13, 0x7f120b48

    const-wide/16 v14, 0x0

    if-nez v8, :cond_2

    cmp-long v8, v11, v14

    if-gez v8, :cond_2

    .line 306
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 307
    invoke-static {v13}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    goto/16 :goto_6

    .line 310
    :cond_2
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    move-wide v6, v9

    goto :goto_3

    .line 445
    :cond_3
    :try_start_1
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v16
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-wide/from16 v16, v9

    :goto_2
    mul-long v16, v16, v6

    move-wide/from16 v6, v16

    .line 311
    :goto_3
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    cmp-long v1, v6, v14

    if-gez v1, :cond_4

    .line 312
    invoke-virtual {v3}, Landroid/view/View;->requestFocus()Z

    .line 313
    invoke-static {v13}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    goto :goto_6

    :cond_4
    cmp-long v1, v11, v9

    if-nez v1, :cond_5

    goto :goto_4

    :cond_5
    move-wide v14, v11

    :goto_4
    cmp-long v1, v6, v9

    if-nez v1, :cond_6

    const-wide v8, 0x7fffffffffffffffL

    goto :goto_5

    :cond_6
    move-wide v8, v6

    :goto_5
    cmp-long v1, v14, v8

    if-ltz v1, :cond_7

    const v1, 0x7f1204c1

    .line 319
    invoke-static {v1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    goto :goto_6

    .line 322
    :cond_7
    iget-boolean v1, v0, Ll/᩻ۜܳ;->ۙ:Z

    if-eqz v1, :cond_8

    .line 323
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v1

    const-string v3, "smins"

    invoke-interface {v1, v3, v2}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v1

    const-string v2, "smaxs"

    .line 324
    invoke-interface {v1, v2, v4}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v1

    const-string v2, "ssun"

    .line 325
    invoke-interface {v1, v5, v2}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object v1

    .line 326
    invoke-interface {v1}, Ll/۬ۤۡ;->apply()V

    .line 328
    :cond_8
    iget-object v1, v0, Ll/᩻ۜܳ;->ۗ:Ll/᩵ۜܳ;

    invoke-interface {v1, v11, v12, v6, v7}, Ll/᩵ۜܳ;->֫(JJ)V

    .line 329
    iget-object v1, v0, Ll/᩻ۜܳ;->۬:Ll/֡ۚۢ;

    invoke-virtual {v1}, Ll/֡ۚۢ;->dismiss()V

    :goto_6
    return-void
.end method
