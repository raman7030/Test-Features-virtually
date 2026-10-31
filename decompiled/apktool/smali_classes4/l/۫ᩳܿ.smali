.class public final Ll/۫ᩳܿ;
.super Ll/۟ܶۡ;
.source "J7R3"


# instance fields
.field public final synthetic ۜ:Landroid/widget/Button;

.field public final ܳ:Ljava/util/ArrayList;

.field public final synthetic ᩻:Ll/֡ܳܿ;


# direct methods
.method public constructor <init>(Landroid/widget/Button;Ll/֡ܳܿ;)V
    .locals 0

    .line 257
    iput-object p1, p0, Ll/۫ᩳܿ;->ۜ:Landroid/widget/Button;

    iput-object p2, p0, Ll/۫ᩳܿ;->᩻:Ll/֡ܳܿ;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    .line 258
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/۫ᩳܿ;->ܳ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 14

    .line 293
    iget-object v0, p0, Ll/۫ᩳܿ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    iget-object v6, p0, Ll/۫ᩳܿ;->᩻:Ll/֡ܳܿ;

    if-eqz v1, :cond_0

    const v0, 0x7f120a5e

    .line 294
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 295
    new-instance v0, Landroid/content/Intent;

    const-class v1, Ll/᩺ܿ᩷;

    invoke-direct {v0, v6, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v6, v0}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V

    return-void

    .line 298
    :cond_0
    iget-object v1, p0, Ll/۫ᩳܿ;->ۜ:Landroid/widget/Button;

    const v2, 0x7f0a05cd

    invoke-virtual {v1, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨᩳܿ;

    if-nez v1, :cond_1

    .line 299
    new-instance v1, Lbin/mt/json/JSONObject;

    invoke-direct {v1}, Lbin/mt/json/JSONObject;-><init>()V

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ll/ۨᩳܿ;->ᩳ()Lbin/mt/json/JSONObject;

    move-result-object v1

    :goto_0
    const-string v2, "a"

    .line 300
    invoke-virtual {v1, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "b"

    .line 301
    invoke-virtual {v1, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "c"

    .line 302
    invoke-virtual {v1, v4}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v12

    const v1, 0x7f0d0100

    .line 303
    invoke-virtual {v6, v1}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v1

    const v4, 0x7f0a0551

    .line 304
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Spinner;

    const v5, 0x7f0a040f

    .line 305
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/FrameLayout;

    .line 306
    new-instance v13, Ll/۬ᩳܿ;

    move-object v7, v13

    move-object v8, p0

    move-object v9, v5

    move-object v10, v2

    move-object v11, v3

    invoke-direct/range {v7 .. v12}, Ll/۬ᩳܿ;-><init>(Ll/۫ᩳܿ;Landroid/widget/FrameLayout;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONObject;)V

    invoke-virtual {v4, v13}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 333
    new-instance v7, Ll/᩶ۡۡ;

    invoke-direct {v7, v6, v0}, Ll/᩶ۡۡ;-><init>(Landroid/content/Context;Ljava/util/List;)V

    invoke-virtual {v4, v7}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    if-eqz v2, :cond_3

    if-eqz v3, :cond_3

    const-string v7, "/"

    .line 0
    invoke-static {v2, v7, v3}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    .line 336
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v3, v7, :cond_3

    .line 337
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۛᩳܿ;

    invoke-virtual {v7}, Ll/ۛᩳܿ;->֫()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 338
    invoke-virtual {v4, v3}, Landroid/widget/AdapterView;->setSelection(I)V

    goto :goto_2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 343
    :cond_3
    :goto_2
    invoke-virtual {v6}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    .line 344
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v1, 0x7f12070a

    const/4 v2, 0x0

    .line 345
    invoke-virtual {v0, v1, v2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v1, 0x7f12015e

    .line 346
    invoke-virtual {v0, v1, v2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 347
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v8

    .line 348
    invoke-virtual {v8}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Ll/ۗᩳܿ;

    iget-object v7, p0, Ll/۫ᩳܿ;->ۜ:Landroid/widget/Button;

    move-object v2, v1

    move-object v3, p0

    invoke-direct/range {v2 .. v8}, Ll/ۗᩳܿ;-><init>(Ll/۫ᩳܿ;Landroid/widget/Spinner;Landroid/widget/FrameLayout;Ll/֡ܳܿ;Landroid/widget/Button;Ll/֡ۚۢ;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 381
    iget-object v0, p0, Ll/۫ᩳܿ;->᩻:Ll/֡ܳܿ;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 262
    iget-object v0, p0, Ll/۫ᩳܿ;->ۜ:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 263
    iget-object v0, p0, Ll/۫ᩳܿ;->᩻:Ll/֡ܳܿ;

    const/16 v1, 0x64

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->ۧ(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 14

    .line 268
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 269
    invoke-static {}, Ll/۬ܿ᩷;->֫()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽܳ᩷;

    .line 270
    invoke-virtual {v2, v0}, Ll/ܽܳ᩷;->ۧ(Ljava/util/ArrayList;)V

    .line 271
    invoke-virtual {v2}, Ll/ܽܳ᩷;->ۖ()Ljava/lang/String;

    move-result-object v9

    .line 272
    invoke-virtual {v2}, Ll/ܽܳ᩷;->ۡ()Ljava/lang/String;

    move-result-object v10

    .line 273
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    .line 275
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbin/mt/plugin/api/editor/TextEditorFunction;

    .line 276
    invoke-virtual {v2}, Ll/ܽܳ᩷;->ۧ()Lbin/mt/plugin/api/PluginContext;

    move-result-object v5

    invoke-interface {v4, v5}, Lbin/mt/plugin/api/editor/TextEditorFunction;->init(Lbin/mt/plugin/api/PluginContext;)V

    .line 277
    invoke-interface {v4}, Lbin/mt/plugin/api/editor/TextEditorFunction;->isEnabled()Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_1

    .line 280
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    .line 281
    invoke-virtual {v2}, Ll/ܽܳ᩷;->ۧ()Lbin/mt/plugin/api/PluginContext;

    move-result-object v3

    invoke-interface {v4}, Lbin/mt/plugin/api/editor/TextEditorFunction;->name()Ljava/lang/String;

    move-result-object v5

    .line 182
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v7

    const/4 v8, 0x3

    if-lt v7, v8, :cond_1

    const/4 v7, 0x0

    invoke-virtual {v5, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0x7b

    if-ne v7, v8, :cond_1

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v7

    add-int/lit8 v7, v7, -0x1

    invoke-virtual {v5, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0x7d

    if-ne v7, v8, :cond_1

    .line 183
    check-cast v3, Ll/ۤ᩻᩷;

    invoke-virtual {v3, v5}, Ll/ۤ᩻᩷;->getStringNullable(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    move-object v7, v3

    goto :goto_2

    :cond_1
    move-object v7, v5

    .line 282
    :goto_2
    iget-object v12, p0, Ll/۫ᩳܿ;->ܳ:Ljava/util/ArrayList;

    new-instance v13, Ll/ۛᩳܿ;

    .line 84
    new-instance v8, Ll/ۤۤ;

    invoke-direct {v8, v2, v4}, Ll/ۤۤ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v3, v13

    move-object v4, v9

    move-object v5, v10

    .line 282
    invoke-direct/range {v3 .. v8}, Ll/ۛᩳܿ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ۤۤ;)V

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v3

    .line 284
    invoke-virtual {v2, v3}, Ll/ܽܳ᩷;->֫(Ljava/lang/Throwable;)V

    goto :goto_1

    .line 287
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    goto/16 :goto_0

    :cond_3
    return-void
.end method

.method public final ᩳ()V
    .locals 2

    .line 386
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    .line 387
    iget-object v0, p0, Ll/۫ᩳܿ;->ۜ:Landroid/widget/Button;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method
