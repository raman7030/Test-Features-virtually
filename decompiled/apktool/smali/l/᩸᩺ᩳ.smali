.class public final Ll/᩸᩺ᩳ;
.super Ljava/lang/Object;
.source "8AHY"

# interfaces
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# static fields
.field public static ۡ:Ll/ۤۤ;

.field public static final ۢ:Ll/ܶ᩵ܿ;

.field public static ܺ:Z

.field public static final synthetic ᩷:I


# instance fields
.field public final ֫:Ll/ۗܺ᩷;

.field public ۜ:Ljava/lang/String;

.field public ۧ:Z

.field public ܳ:Z

.field public ܽ:Z

.field public ܿ:Ljava/lang/String;

.field public final ᩳ:Ll/۫ۨᩳ;

.field public ᩻:Ll/᩶۟ᩳ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 57
    sget-object v0, Ll/ܽ֡ܿ;->ܿ:Ll/ܶ᩵ܿ;

    const-string v1, "edit_text_font2_custom.dat"

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    sput-object v0, Ll/᩸᩺ᩳ;->ۢ:Ll/ܶ᩵ܿ;

    return-void
.end method

.method public constructor <init>(Ll/ۗܺ᩷;Ll/۫ۨᩳ;)V
    .locals 1

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "edit_word_wrap_normal"

    .line 62
    iput-object v0, p0, Ll/᩸᩺ᩳ;->ܿ:Ljava/lang/String;

    const/4 v0, 0x1

    .line 63
    iput-boolean v0, p0, Ll/᩸᩺ᩳ;->ۧ:Z

    const-string v0, "Text"

    .line 64
    iput-object v0, p0, Ll/᩸᩺ᩳ;->ۜ:Ljava/lang/String;

    const/4 v0, 0x0

    .line 67
    iput-boolean v0, p0, Ll/᩸᩺ᩳ;->ܽ:Z

    .line 70
    iput-object p1, p0, Ll/᩸᩺ᩳ;->֫:Ll/ۗܺ᩷;

    .line 71
    iput-object p2, p0, Ll/᩸᩺ᩳ;->ᩳ:Ll/۫ۨᩳ;

    return-void
.end method

.method public static synthetic ֫(Ll/᩸᩺ᩳ;)V
    .locals 2

    .line 231
    iget-object p0, p0, Ll/᩸᩺ᩳ;->ᩳ:Ll/۫ۨᩳ;

    const/4 v0, 0x0

    invoke-virtual {p0}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Ll/۫ۨᩳ;->scrollTo(II)V

    .line 232
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public static synthetic ֫(Ll/᩸᩺ᩳ;Ll/۬۬ܿ;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    invoke-virtual {p1}, Ll/۬۬ܿ;->֫()V

    .line 344
    iget-object p0, p0, Ll/᩸᩺ᩳ;->ᩳ:Ll/۫ۨᩳ;

    const/4 p1, 0x0

    invoke-virtual {p0}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Ll/۫ۨᩳ;->scrollTo(II)V

    .line 345
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public static ۖ()I
    .locals 5

    const-string v0, "edit_text_font2"

    const/4 v1, 0x0

    .line 358
    :try_start_0
    sget-object v2, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 361
    :catch_0
    :try_start_1
    sget-object v2, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const/4 v3, 0x0

    invoke-interface {v2, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 362
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 363
    sget-object v3, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-interface {v3, v0, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 365
    :catch_1
    sget-object v2, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    .line 369
    sget-object v4, Ll/᩸᩺ᩳ;->ۢ:Ll/ܶ᩵ܿ;

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v4

    if-nez v4, :cond_0

    .line 370
    sget-object v2, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    const/4 v2, 0x0

    :cond_0
    const/4 v0, 0x1

    if-eq v2, v0, :cond_2

    if-eq v2, v3, :cond_1

    const/16 v0, 0xff

    :cond_1
    return v0

    :cond_2
    return v1
.end method

.method public static ۘ()Z
    .locals 3

    .line 472
    sget-object v0, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v1, "edit_high_light"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static declared-synchronized ۡ()Ll/ۤۤ;
    .locals 5

    .line 2
    const-class v0, Ll/᩸᩺ᩳ;

    .line 3
    monitor-enter v0

    .line 385
    :try_start_0
    sget-object v1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v2, "edit_text_font2_custom_md5"

    const-string v3, ""

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 390
    sget-object v2, Ll/᩸᩺ᩳ;->ۡ:Ll/ۤۤ;

    if-eqz v2, :cond_0

    .line 391
    iget-object v3, v2, Ll/ۤۤ;->֫:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_0

    .line 392
    monitor-exit v0

    return-object v2

    .line 394
    :cond_0
    :try_start_1
    sget-object v2, Ll/ܽ֡ܿ;->ܿ:Ll/ܶ᩵ܿ;

    const-string v3, "edit_text_font2_custom.dat"

    invoke-virtual {v2, v3}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 395
    sget-object v3, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 396
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v4, :cond_1

    .line 398
    :try_start_2
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Typeface;->createFromFile(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catch_0
    nop

    :goto_0
    if-nez v3, :cond_1

    .line 402
    :try_start_3
    sget-object v3, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 405
    :cond_1
    sget-object v2, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    if-ne v3, v2, :cond_2

    const-string v1, ""

    .line 84
    :cond_2
    new-instance v2, Ll/ۤۤ;

    invoke-direct {v2, v1, v3}, Ll/ۤۤ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 409
    sput-object v2, Ll/᩸᩺ᩳ;->ۡ:Ll/ۤۤ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 410
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v1
.end method

.method public static ܺ()F
    .locals 4

    const/high16 v0, 0x3f800000    # 1.0f

    .line 416
    :try_start_0
    sget-object v1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v2, "edit_line_spacing"

    const/16 v3, 0x64

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v2, 0x50

    if-lt v1, v2, :cond_0

    const/16 v2, 0xc8

    if-gt v1, v2, :cond_0

    int-to-float v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    :catch_0
    :cond_0
    return v0
.end method

.method public static ᩴ()Z
    .locals 3

    .line 478
    sget-object v0, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v1, "edit_magnifier"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, Ll/᩸᩺ᩳ;->ܺ:Z

    return v0
.end method

.method public static ᩵()Z
    .locals 1

    .line 482
    sget-boolean v0, Ll/᩸᩺ᩳ;->ܺ:Z

    return v0
.end method


# virtual methods
.method public final onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    if-nez v1, :cond_0

    goto/16 :goto_1

    .line 264
    :cond_0
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->hashCode()I

    move-result v2

    const-string v3, "edit_fixed_line_numbers"

    const-string v4, "edit_show_blank_symbol"

    const-string v5, "edit_show_line_numbers"

    const-string v6, "edit_auto_indent"

    const-string v7, "edit_show_unicode_special"

    const-string v8, "edit_show_ascii_control"

    const-string v9, "edit_indent_with_tabs"

    const-string v10, "edit_tab_size"

    const-string v11, "edit_pinch_to_zoom"

    const-string v12, "edit_show_indent_guides"

    const-string v13, "hide_single_space"

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/16 v16, -0x1

    sparse-switch v2, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v16, 0xf

    goto/16 :goto_0

    :sswitch_1
    const-string v2, "edit_text_font_size"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v16, 0xe

    goto/16 :goto_0

    :sswitch_2
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v16, 0xd

    goto/16 :goto_0

    :sswitch_3
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v16, 0xc

    goto/16 :goto_0

    :sswitch_4
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v16, 0xb

    goto/16 :goto_0

    :sswitch_5
    const-string v2, "edit_high_light"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v16, 0xa

    goto/16 :goto_0

    :sswitch_6
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v16, 0x9

    goto/16 :goto_0

    :sswitch_7
    const-string v2, "diff_text_font_size"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v16, 0x8

    goto :goto_0

    :sswitch_8
    const-string v2, "edit_magnifier"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    goto :goto_0

    :cond_9
    const/16 v16, 0x7

    goto :goto_0

    :sswitch_9
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    goto :goto_0

    :cond_a
    const/16 v16, 0x6

    goto :goto_0

    :sswitch_a
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    goto :goto_0

    :cond_b
    const/16 v16, 0x5

    goto :goto_0

    :sswitch_b
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    goto :goto_0

    :cond_c
    const/16 v16, 0x4

    goto :goto_0

    :sswitch_c
    invoke-virtual {v1, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    goto :goto_0

    :cond_d
    const/16 v16, 0x3

    goto :goto_0

    :sswitch_d
    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    goto :goto_0

    :cond_e
    const/16 v16, 0x2

    goto :goto_0

    :sswitch_e
    invoke-virtual {v1, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    goto :goto_0

    :cond_f
    const/16 v16, 0x1

    goto :goto_0

    :sswitch_f
    const-string v2, "edit_line_spacing"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    goto :goto_0

    :cond_10
    const/16 v16, 0x0

    :goto_0
    iget-object v1, v0, Ll/᩸᩺ᩳ;->ᩳ:Ll/۫ۨᩳ;

    packed-switch v16, :pswitch_data_0

    goto/16 :goto_1

    .line 278
    :pswitch_0
    iget-boolean v2, v0, Ll/᩸᩺ᩳ;->ܽ:Z

    if-nez v2, :cond_11

    .line 448
    sget-object v2, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    invoke-interface {v2, v3, v14}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    .line 279
    invoke-virtual {v1, v2}, Ll/۫ۨᩳ;->᩻(Z)V

    return-void

    .line 464
    :pswitch_1
    sget-object v2, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    invoke-interface {v2, v4, v14}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    .line 295
    invoke-virtual {v1, v2}, Ll/۫ۨᩳ;->ۘ(Z)V

    return-void

    .line 273
    :pswitch_2
    iget-boolean v1, v0, Ll/᩸᩺ᩳ;->ܽ:Z

    if-nez v1, :cond_11

    .line 274
    iget-object v1, v0, Ll/᩸᩺ᩳ;->᩻:Ll/᩶۟ᩳ;

    .line 444
    sget-object v2, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    invoke-interface {v2, v5, v15}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    .line 274
    iput-boolean v2, v1, Ll/᩶۟ᩳ;->᩷:Z

    return-void

    .line 490
    :pswitch_3
    sget-object v2, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    invoke-interface {v2, v6, v15}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    .line 310
    invoke-virtual {v1, v2}, Ll/۫ۨᩳ;->ܿ(Z)V

    return-void

    .line 301
    :pswitch_4
    iget-object v1, v0, Ll/᩸᩺ᩳ;->᩻:Ll/᩶۟ᩳ;

    invoke-static {}, Ll/᩸᩺ᩳ;->ۘ()Z

    move-result v2

    iput-boolean v2, v1, Ll/᩶۟ᩳ;->֫:Z

    return-void

    .line 292
    :pswitch_5
    iget-object v1, v0, Ll/᩸᩺ᩳ;->᩻:Ll/᩶۟ᩳ;

    .line 460
    sget-object v2, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    invoke-interface {v2, v7, v15}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    .line 292
    iput-boolean v2, v1, Ll/᩶۟ᩳ;->ۖ:Z

    return-void

    .line 270
    :pswitch_6
    iget-object v1, v0, Ll/᩸᩺ᩳ;->᩻:Ll/᩶۟ᩳ;

    invoke-virtual/range {p0 .. p0}, Ll/᩸᩺ᩳ;->ܳ()I

    move-result v2

    int-to-float v2, v2

    iput v2, v1, Ll/᩶۟ᩳ;->᩸:F

    return-void

    .line 304
    :pswitch_7
    invoke-static {}, Ll/᩸᩺ᩳ;->ᩴ()Z

    move-result v2

    .line 4466
    iget-object v1, v1, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    iput-boolean v2, v1, Ll/᩺֫ܿ;->֨֫:Z

    return-void

    .line 289
    :pswitch_8
    iget-object v1, v0, Ll/᩸᩺ᩳ;->᩻:Ll/᩶۟ᩳ;

    .line 456
    sget-object v2, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    invoke-interface {v2, v8, v14}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    .line 289
    iput-boolean v2, v1, Ll/᩶۟ᩳ;->᩻:Z

    return-void

    .line 494
    :pswitch_9
    sget-object v2, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    invoke-interface {v2, v9, v14}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    .line 313
    invoke-virtual {v1, v2}, Ll/۫ۨᩳ;->᩷(Z)V

    return-void

    .line 283
    :pswitch_a
    iget-object v1, v0, Ll/᩸᩺ᩳ;->᩻:Ll/᩶۟ᩳ;

    .line 440
    sget-object v2, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const/4 v3, 0x4

    invoke-interface {v2, v10, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    .line 283
    iput v2, v1, Ll/᩶۟ᩳ;->ۚ:I

    return-void

    .line 486
    :pswitch_b
    sget-object v2, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    invoke-interface {v2, v11, v15}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    .line 2046
    iget-object v1, v1, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    iput-boolean v2, v1, Ll/᩺֫ܿ;->֡ۧ:Z

    return-void

    .line 452
    :pswitch_c
    sget-object v2, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    invoke-interface {v2, v12, v15}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    .line 2317
    iget-object v3, v1, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    iget-boolean v4, v3, Ll/᩺֫ܿ;->۬ۧ:Z

    if-eq v4, v2, :cond_11

    .line 2318
    iput-boolean v2, v3, Ll/᩺֫ܿ;->۬ۧ:Z

    .line 2319
    invoke-virtual {v1}, Landroid/view/View;->postInvalidate()V

    goto :goto_1

    .line 468
    :pswitch_d
    sget-object v2, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    invoke-interface {v2, v13, v15}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    .line 298
    invoke-virtual {v1, v2}, Ll/۫ۨᩳ;->ۜ(Z)V

    return-void

    .line 266
    :pswitch_e
    iget-object v1, v0, Ll/᩸᩺ᩳ;->᩻:Ll/᩶۟ᩳ;

    invoke-static {}, Ll/᩸᩺ᩳ;->ܺ()F

    move-result v2

    iput v2, v1, Ll/᩶۟ᩳ;->ܿ:F

    :cond_11
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7df55cf3 -> :sswitch_f
        -0x7d28d5d4 -> :sswitch_e
        -0x79280183 -> :sswitch_d
        -0x6b207ce3 -> :sswitch_c
        -0x527fc300 -> :sswitch_b
        -0x175baae7 -> :sswitch_a
        -0x14737efe -> :sswitch_9
        0x1631ac09 -> :sswitch_8
        0x232c88d9 -> :sswitch_7
        0x2d58832a -> :sswitch_6
        0x3e96d18e -> :sswitch_5
        0x4f3c2a87 -> :sswitch_4
        0x56466c0c -> :sswitch_3
        0x590635f0 -> :sswitch_2
        0x61f53c34 -> :sswitch_1
        0x75b9683f -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_6
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(Ll/ۙܰᩳ;)Ll/᩶۟ᩳ;
    .locals 15

    move-object/from16 v0, p1

    .line 240
    new-instance v13, Ll/᩶۟ᩳ;

    iget-object v14, v0, Ll/ۙܰᩳ;->᩻:Ljava/lang/String;

    iget v3, v0, Ll/ۙܰᩳ;->᩷:I

    iget v1, v0, Ll/ۙܰᩳ;->ۢ:F

    iget v2, v0, Ll/ۙܰᩳ;->ܿ:F

    iget v4, v0, Ll/ۙܰᩳ;->ܳ:I

    iget-boolean v8, v0, Ll/ۙܰᩳ;->ܺ:Z

    iget-boolean v9, v0, Ll/ۙܰᩳ;->ᩳ:Z

    iget-boolean v10, v0, Ll/ۙܰᩳ;->֫:Z

    iget-boolean v11, v0, Ll/ۙܰᩳ;->ۡ:Z

    iget-boolean v12, v0, Ll/ۙܰᩳ;->ۧ:Z

    iget v5, v0, Ll/ۙܰᩳ;->ۜ:I

    iget-object v7, v0, Ll/ۙܰᩳ;->ܽ:Ljava/lang/String;

    move-object v0, v13

    move-object v6, v14

    invoke-direct/range {v0 .. v12}, Ll/᩶۟ᩳ;-><init>(FFIIILjava/lang/String;Ljava/lang/String;ZZZZZ)V

    move-object v0, p0

    .line 146
    iput-object v14, v0, Ll/᩸᩺ᩳ;->ۜ:Ljava/lang/String;

    .line 243
    invoke-virtual {p0}, Ll/᩸᩺ᩳ;->ܽ()Ll/᩶۟ᩳ;

    move-result-object v1

    .line 74
    iget v2, v1, Ll/᩶۟ᩳ;->ܶ:I

    iput v2, v13, Ll/᩶۟ᩳ;->۠:I

    .line 75
    iget v2, v1, Ll/᩶۟ᩳ;->᩹:F

    iput v2, v13, Ll/᩶۟ᩳ;->᩸:F

    .line 76
    iget v2, v1, Ll/᩶۟ᩳ;->ܳ:F

    iput v2, v13, Ll/᩶۟ᩳ;->ܿ:F

    .line 77
    iget v2, v1, Ll/᩶۟ᩳ;->᩵:I

    iput v2, v13, Ll/᩶۟ᩳ;->ᩴ:I

    .line 78
    iget-boolean v2, v1, Ll/᩶۟ᩳ;->ܺ:Z

    iput-boolean v2, v13, Ll/᩶۟ᩳ;->ۡ:Z

    .line 79
    iget-boolean v2, v1, Ll/᩶۟ᩳ;->ۢ:Z

    iput-boolean v2, v13, Ll/᩶۟ᩳ;->᩷:Z

    .line 80
    iget-boolean v2, v1, Ll/᩶۟ᩳ;->ۜ:Z

    iput-boolean v2, v13, Ll/᩶۟ᩳ;->᩻:Z

    .line 81
    iget-boolean v2, v1, Ll/᩶۟ᩳ;->ۘ:Z

    iput-boolean v2, v13, Ll/᩶۟ᩳ;->ۖ:Z

    .line 82
    iget-boolean v2, v1, Ll/᩶۟ᩳ;->ۧ:Z

    iput-boolean v2, v13, Ll/᩶۟ᩳ;->֫:Z

    .line 83
    iget v2, v1, Ll/᩶۟ᩳ;->֨:I

    iput v2, v13, Ll/᩶۟ᩳ;->ۚ:I

    .line 84
    iget-object v1, v1, Ll/᩶۟ᩳ;->ᩳ:Ljava/lang/String;

    iput-object v1, v13, Ll/᩶۟ᩳ;->ܽ:Ljava/lang/String;

    .line 244
    invoke-virtual {v13}, Ll/᩶۟ᩳ;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v13

    :cond_0
    const/4 v1, 0x0

    return-object v1
.end method

.method public final ֫()V
    .locals 6

    .line 452
    sget-object v0, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v1, "edit_show_indent_guides"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 2317
    iget-object v1, p0, Ll/᩸᩺ᩳ;->ᩳ:Ll/۫ۨᩳ;

    iget-object v3, v1, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    iget-object v4, v1, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    iget-boolean v5, v3, Ll/᩺֫ܿ;->۬ۧ:Z

    if-eq v5, v0, :cond_0

    .line 2318
    iput-boolean v0, v3, Ll/᩺֫ܿ;->۬ۧ:Z

    .line 2319
    invoke-virtual {v1}, Landroid/view/View;->postInvalidate()V

    .line 486
    :cond_0
    sget-object v0, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v3, "edit_pinch_to_zoom"

    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 2046
    iput-boolean v0, v4, Ll/᩺֫ܿ;->֡ۧ:Z

    .line 490
    sget-object v0, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v3, "edit_auto_indent"

    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 252
    invoke-virtual {v1, v0}, Ll/۫ۨᩳ;->ܿ(Z)V

    .line 253
    invoke-static {}, Ll/᩸᩺ᩳ;->ᩴ()Z

    move-result v0

    .line 4466
    iput-boolean v0, v4, Ll/᩺֫ܿ;->֨֫:Z

    .line 464
    sget-object v0, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v3, "edit_show_blank_symbol"

    const/4 v4, 0x0

    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 254
    invoke-virtual {v1, v0}, Ll/۫ۨᩳ;->ۘ(Z)V

    .line 468
    sget-object v0, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v3, "hide_single_space"

    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 255
    invoke-virtual {v1, v0}, Ll/۫ۨᩳ;->ۜ(Z)V

    .line 494
    sget-object v0, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v2, "edit_indent_with_tabs"

    invoke-interface {v0, v2, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 256
    invoke-virtual {v1, v0}, Ll/۫ۨᩳ;->᩷(Z)V

    return-void
.end method

.method public final ֫(Ljava/lang/Class;)V
    .locals 2

    .line 155
    invoke-virtual {p0}, Ll/᩸᩺ᩳ;->᩷()V

    .line 156
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Ll/᩸᩺ᩳ;->֫:Ll/ۗܺ᩷;

    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v0}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 6

    const-string v0, "syntax:"

    .line 113
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x7

    .line 114
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 146
    :goto_0
    iput-object p1, p0, Ll/᩸᩺ᩳ;->ۜ:Ljava/lang/String;

    goto :goto_1

    .line 1162
    :cond_0
    invoke-static {p1}, Ll/ۜ᩷ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶۜܿ;

    move-result-object p1

    if-nez p1, :cond_1

    const-string p1, "Text"

    goto :goto_0

    .line 1163
    :cond_1
    invoke-virtual {p1}, Ll/ܶۜܿ;->ۢ()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 109
    :goto_1
    iget-boolean p1, p0, Ll/᩸᩺ᩳ;->ܳ:Z

    const/4 v0, 0x1

    .line 118
    iget-object v1, p0, Ll/᩸᩺ᩳ;->ᩳ:Ll/۫ۨᩳ;

    if-nez p1, :cond_2

    invoke-static {}, Ll/᩸᩺ᩳ;->ۘ()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 142
    :cond_2
    iget-object p1, p0, Ll/᩸᩺ᩳ;->ۜ:Ljava/lang/String;

    .line 2070
    invoke-virtual {v1, p1, v0}, Ll/۫ۨᩳ;->֫(Ljava/lang/String;Z)V

    .line 121
    :cond_3
    iget-boolean p1, p0, Ll/᩸᩺ᩳ;->ܽ:Z

    const/4 v2, 0x0

    if-nez p1, :cond_4

    .line 444
    sget-object p1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v3, "edit_show_line_numbers"

    invoke-interface {p1, v3, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    .line 122
    invoke-virtual {v1, p1}, Ll/۫ۨᩳ;->ᩴ(Z)V

    .line 448
    sget-object p1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v3, "edit_fixed_line_numbers"

    invoke-interface {p1, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    .line 123
    invoke-virtual {v1, p1}, Ll/۫ۨᩳ;->᩻(Z)V

    .line 452
    :cond_4
    sget-object p1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v3, "edit_show_indent_guides"

    invoke-interface {p1, v3, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    .line 2317
    iget-object v3, v1, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    iget-object v4, v1, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    iget-boolean v5, v3, Ll/᩺֫ܿ;->۬ۧ:Z

    if-eq v5, p1, :cond_5

    .line 2318
    iput-boolean p1, v3, Ll/᩺֫ܿ;->۬ۧ:Z

    .line 2319
    invoke-virtual {v1}, Landroid/view/View;->postInvalidate()V

    .line 486
    :cond_5
    sget-object p1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v3, "edit_pinch_to_zoom"

    invoke-interface {p1, v3, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    .line 2046
    iput-boolean p1, v4, Ll/᩺֫ܿ;->֡ۧ:Z

    .line 490
    sget-object p1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v3, "edit_auto_indent"

    invoke-interface {p1, v3, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    .line 127
    invoke-virtual {v1, p1}, Ll/۫ۨᩳ;->ܿ(Z)V

    .line 128
    invoke-static {}, Ll/᩸᩺ᩳ;->ᩴ()Z

    move-result p1

    .line 4466
    iput-boolean p1, v4, Ll/᩺֫ܿ;->֨֫:Z

    .line 464
    sget-object p1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v3, "edit_show_blank_symbol"

    invoke-interface {p1, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    .line 129
    invoke-virtual {v1, p1}, Ll/۫ۨᩳ;->ۘ(Z)V

    .line 468
    sget-object p1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v3, "hide_single_space"

    invoke-interface {p1, v3, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    .line 130
    invoke-virtual {v1, p1}, Ll/۫ۨᩳ;->ۜ(Z)V

    .line 456
    sget-object p1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v3, "edit_show_ascii_control"

    invoke-interface {p1, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    .line 131
    invoke-virtual {v1, p1}, Ll/۫ۨᩳ;->ۖ(Z)V

    .line 460
    sget-object p1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v3, "edit_show_unicode_special"

    invoke-interface {p1, v3, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    .line 132
    invoke-virtual {v1, p1}, Ll/۫ۨᩳ;->֡(Z)V

    .line 440
    sget-object p1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v3, "edit_tab_size"

    const/4 v4, 0x4

    invoke-interface {p1, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    .line 133
    invoke-virtual {v1, p1}, Ll/۫ۨᩳ;->֡(I)V

    .line 494
    sget-object p1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v3, "edit_indent_with_tabs"

    invoke-interface {p1, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    .line 134
    invoke-virtual {v1, p1}, Ll/۫ۨᩳ;->᩷(Z)V

    .line 135
    invoke-static {}, Ll/᩸᩺ᩳ;->ۖ()I

    move-result p1

    invoke-virtual {p0}, Ll/᩸᩺ᩳ;->ܳ()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v1, v2, p1}, Ll/۫ۨᩳ;->֫(FI)V

    .line 136
    invoke-static {}, Ll/᩸᩺ᩳ;->ܺ()F

    move-result p1

    invoke-virtual {v1, p1}, Ll/۫ۨᩳ;->֫(F)V

    .line 137
    invoke-virtual {p0}, Ll/᩸᩺ᩳ;->ᩳ()I

    move-result p1

    invoke-virtual {v1, p1}, Ll/۫ۨᩳ;->᩵(I)V

    .line 101
    sget-object p1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v2, "show_soft_wrap_arrows"

    invoke-interface {p1, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    .line 138
    invoke-virtual {v1, p1}, Ll/۫ۨᩳ;->᩵(Z)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Z)V
    .locals 0

    .line 75
    iput-object p1, p0, Ll/᩸᩺ᩳ;->ܿ:Ljava/lang/String;

    .line 76
    iput-boolean p2, p0, Ll/᩸᩺ᩳ;->ۧ:Z

    return-void
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 2

    .line 181
    invoke-virtual {p0}, Ll/᩸᩺ᩳ;->ܽ()Ll/᩶۟ᩳ;

    move-result-object v0

    const v1, 0x1727271b

    .line 182
    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 183
    iget-object v1, v0, Ll/᩶۟ᩳ;->֡:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 184
    iget v1, v0, Ll/᩶۟ᩳ;->ܶ:I

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->writeByte(I)V

    .line 185
    iget v1, v0, Ll/᩶۟ᩳ;->᩹:F

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->֫(F)V

    .line 186
    iget v1, v0, Ll/᩶۟ᩳ;->᩵:I

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 187
    iget-boolean v1, v0, Ll/᩶۟ᩳ;->ۢ:Z

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->֫(Z)V

    .line 188
    iget-boolean v1, v0, Ll/᩶۟ᩳ;->ۜ:Z

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->֫(Z)V

    .line 189
    iget-boolean v1, v0, Ll/᩶۟ᩳ;->ۧ:Z

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->֫(Z)V

    const/4 v1, 0x0

    .line 190
    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 191
    iget v1, v0, Ll/᩶۟ᩳ;->֨:I

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 192
    iget-object v1, v0, Ll/᩶۟ᩳ;->ᩳ:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 193
    iget-boolean v1, v0, Ll/᩶۟ᩳ;->ܺ:Z

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->֫(Z)V

    .line 194
    iget-boolean v1, v0, Ll/᩶۟ᩳ;->ۘ:Z

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->֫(Z)V

    .line 195
    iget v0, v0, Ll/᩶۟ᩳ;->ܳ:F

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(F)V

    return-void
.end method

.method public final ֫(Ll/۬ۜܽ;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const v2, 0x1727271b

    .line 199
    invoke-virtual {v1, v2}, Ll/۬ۜܽ;->֫(I)Z

    move-result v2

    if-nez v2, :cond_1

    const v3, 0x1727271a

    .line 200
    invoke-virtual {v1, v3}, Ll/۬ۜܽ;->֫(I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v3, 0x1

    :goto_1
    if-nez v3, :cond_3

    const v4, 0x17272719

    .line 201
    invoke-virtual {v1, v4}, Ll/۬ۜܽ;->֫(I)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v4, 0x1

    :goto_3
    if-nez v4, :cond_5

    const v5, 0x17272718

    .line 202
    invoke-virtual {v1, v5}, Ll/۬ۜܽ;->֫(I)Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_4

    :cond_4
    const/4 v5, 0x0

    goto :goto_5

    :cond_5
    :goto_4
    const/4 v5, 0x1

    :goto_5
    if-nez v5, :cond_7

    const v6, 0x17272717

    .line 203
    invoke-virtual {v1, v6}, Ll/۬ۜܽ;->֫(I)Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_6

    :cond_6
    const/4 v6, 0x0

    goto :goto_7

    :cond_7
    :goto_6
    const/4 v6, 0x1

    :goto_7
    if-nez v6, :cond_9

    const v7, 0x17272716

    .line 204
    invoke-virtual {v1, v7}, Ll/۬ۜܽ;->֫(I)Z

    move-result v7

    if-eqz v7, :cond_8

    goto :goto_8

    :cond_8
    const/4 v7, 0x0

    goto :goto_9

    :cond_9
    :goto_8
    const/4 v7, 0x1

    .line 205
    :goto_9
    invoke-virtual/range {p1 .. p1}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v15

    .line 206
    invoke-virtual/range {p1 .. p1}, Ll/۬ۜܽ;->readByte()B

    move-result v8

    and-int/lit16 v11, v8, 0xff

    .line 207
    invoke-virtual/range {p1 .. p1}, Ll/۬ۜܽ;->ۜ()F

    move-result v9

    .line 208
    invoke-virtual/range {p1 .. p1}, Ll/۬ۜܽ;->readInt()I

    move-result v12

    .line 209
    invoke-virtual/range {p1 .. p1}, Ll/۬ۜܽ;->ܳ()Z

    move-result v17

    if-eqz v6, :cond_a

    .line 210
    invoke-virtual/range {p1 .. p1}, Ll/۬ۜܽ;->ܳ()Z

    move-result v6

    if-eqz v6, :cond_a

    const/4 v6, 0x1

    const/16 v18, 0x1

    goto :goto_a

    :cond_a
    const/4 v6, 0x0

    const/16 v18, 0x0

    .line 211
    :goto_a
    invoke-virtual/range {p1 .. p1}, Ll/۬ۜܽ;->ܳ()Z

    move-result v20

    if-eqz v7, :cond_b

    .line 213
    invoke-virtual/range {p1 .. p1}, Ll/۬ۜܽ;->readInt()I

    .line 215
    :cond_b
    invoke-virtual/range {p1 .. p1}, Ll/۬ۜܽ;->readInt()I

    move-result v13

    if-eqz v5, :cond_c

    .line 216
    invoke-virtual/range {p1 .. p1}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v5

    goto :goto_b

    :cond_c
    const-string v5, ""

    :goto_b
    if-eqz v4, :cond_e

    .line 217
    invoke-virtual/range {p1 .. p1}, Ll/۬ۜܽ;->ܳ()Z

    move-result v4

    if-eqz v4, :cond_d

    goto :goto_c

    :cond_d
    const/4 v4, 0x0

    const/16 v16, 0x0

    goto :goto_d

    :cond_e
    :goto_c
    const/4 v4, 0x1

    const/16 v16, 0x1

    :goto_d
    if-eqz v3, :cond_10

    .line 218
    invoke-virtual/range {p1 .. p1}, Ll/۬ۜܽ;->ܳ()Z

    move-result v3

    if-eqz v3, :cond_f

    goto :goto_e

    :cond_f
    const/4 v3, 0x0

    const/16 v19, 0x0

    goto :goto_f

    :cond_10
    :goto_e
    const/4 v3, 0x1

    const/16 v19, 0x1

    :goto_f
    if-eqz v2, :cond_11

    .line 220
    invoke-virtual/range {p1 .. p1}, Ll/۬ۜܽ;->ۜ()F

    move-result v1

    move v10, v1

    goto :goto_10

    :cond_11
    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v10, 0x3f800000    # 1.0f

    .line 240
    :goto_10
    new-instance v1, Ll/᩶۟ᩳ;

    move-object v8, v1

    move-object v14, v15

    move-object v2, v15

    move-object v15, v5

    invoke-direct/range {v8 .. v20}, Ll/᩶۟ᩳ;-><init>(FFIIILjava/lang/String;Ljava/lang/String;ZZZZZ)V

    .line 146
    iput-object v2, v0, Ll/᩸᩺ᩳ;->ۜ:Ljava/lang/String;

    .line 243
    invoke-virtual/range {p0 .. p0}, Ll/᩸᩺ᩳ;->ܽ()Ll/᩶۟ᩳ;

    move-result-object v2

    .line 74
    iget v3, v2, Ll/᩶۟ᩳ;->ܶ:I

    iput v3, v1, Ll/᩶۟ᩳ;->۠:I

    .line 75
    iget v3, v2, Ll/᩶۟ᩳ;->᩹:F

    iput v3, v1, Ll/᩶۟ᩳ;->᩸:F

    .line 76
    iget v3, v2, Ll/᩶۟ᩳ;->ܳ:F

    iput v3, v1, Ll/᩶۟ᩳ;->ܿ:F

    .line 77
    iget v3, v2, Ll/᩶۟ᩳ;->᩵:I

    iput v3, v1, Ll/᩶۟ᩳ;->ᩴ:I

    .line 78
    iget-boolean v3, v2, Ll/᩶۟ᩳ;->ܺ:Z

    iput-boolean v3, v1, Ll/᩶۟ᩳ;->ۡ:Z

    .line 79
    iget-boolean v3, v2, Ll/᩶۟ᩳ;->ۢ:Z

    iput-boolean v3, v1, Ll/᩶۟ᩳ;->᩷:Z

    .line 80
    iget-boolean v3, v2, Ll/᩶۟ᩳ;->ۜ:Z

    iput-boolean v3, v1, Ll/᩶۟ᩳ;->᩻:Z

    .line 81
    iget-boolean v3, v2, Ll/᩶۟ᩳ;->ۘ:Z

    iput-boolean v3, v1, Ll/᩶۟ᩳ;->ۖ:Z

    .line 82
    iget-boolean v3, v2, Ll/᩶۟ᩳ;->ۧ:Z

    iput-boolean v3, v1, Ll/᩶۟ᩳ;->֫:Z

    .line 83
    iget v3, v2, Ll/᩶۟ᩳ;->֨:I

    iput v3, v1, Ll/᩶۟ᩳ;->ۚ:I

    .line 84
    iget-object v2, v2, Ll/᩶۟ᩳ;->ᩳ:Ljava/lang/String;

    iput-object v2, v1, Ll/᩶۟ᩳ;->ܽ:Ljava/lang/String;

    .line 244
    invoke-virtual {v1}, Ll/᩶۟ᩳ;->֫()Z

    move-result v2

    if-eqz v2, :cond_12

    goto :goto_11

    :cond_12
    const/4 v1, 0x0

    :goto_11
    if-eqz v1, :cond_13

    .line 229
    iget-object v2, v0, Ll/᩸᩺ᩳ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v2, v1}, Ll/۫ۨᩳ;->֫(Ll/᩶۟ᩳ;)V

    .line 230
    new-instance v1, Ll/֡۫ᩳ;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v0}, Ll/֡۫ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 235
    :cond_13
    invoke-virtual/range {p0 .. p0}, Ll/᩸᩺ᩳ;->֫()V

    return-void
.end method

.method public final ֫(Z)V
    .locals 2

    .line 89
    sget-object v0, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Ll/᩸᩺ᩳ;->ܿ:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final ۜ()Z
    .locals 7

    .line 327
    iget-object v0, p0, Ll/᩸᩺ᩳ;->᩻:Ll/᩶۟ᩳ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 329
    :cond_0
    sget-object v0, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    invoke-interface {v0, p0}, Landroid/content/SharedPreferences;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 330
    iget-object v0, p0, Ll/᩸᩺ᩳ;->᩻:Ll/᩶۟ᩳ;

    const/4 v1, 0x0

    .line 332
    iput-object v1, p0, Ll/᩸᩺ᩳ;->᩻:Ll/᩶۟ᩳ;

    .line 333
    iget-object v1, p0, Ll/᩸᩺ᩳ;->֫:Ll/ۗܺ᩷;

    invoke-virtual {v1}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object v2

    invoke-virtual {v2}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v2

    sget-object v3, Ll/ܰۢ֫;->᩹:Ll/ܰۢ֫;

    invoke-virtual {v2, v3}, Ll/ܰۢ֫;->֫(Ll/ܰۢ֫;)Z

    move-result v2

    .line 334
    invoke-virtual {p0}, Ll/᩸᩺ᩳ;->ᩳ()I

    move-result v3

    iput v3, v0, Ll/᩶۟ᩳ;->ᩴ:I

    .line 101
    sget-object v3, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v4, "show_soft_wrap_arrows"

    const/4 v5, 0x1

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    .line 335
    iput-boolean v3, v0, Ll/᩶۟ᩳ;->ۡ:Z

    .line 336
    invoke-static {}, Ll/᩸᩺ᩳ;->ۖ()I

    move-result v3

    iput v3, v0, Ll/᩶۟ᩳ;->۠:I

    if-ne v3, v5, :cond_1

    .line 385
    sget-object v3, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v4, "edit_text_font2_custom_md5"

    const-string v6, ""

    invoke-interface {v3, v4, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 338
    iput-object v3, v0, Ll/᩶۟ᩳ;->ܽ:Ljava/lang/String;

    :cond_1
    if-eqz v2, :cond_2

    .line 340
    invoke-virtual {v0}, Ll/᩶۟ᩳ;->֫()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 341
    new-instance v2, Ll/۬۬ܿ;

    const v3, 0x7f120808

    invoke-direct {v2, v1, v3}, Ll/۬۬ܿ;-><init>(Ll/ۗܺ᩷;I)V

    invoke-virtual {v2}, Ll/۬۬ܿ;->ܳ()V

    .line 342
    new-instance v1, Ll/۫֨᩷;

    const/4 v3, 0x1

    invoke-direct {v1, v3, p0, v2}, Ll/۫֨᩷;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, p0, Ll/᩸᩺ᩳ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v2, v0, v1}, Ll/۫ۨᩳ;->֫(Ll/᩶۟ᩳ;Ljava/lang/Runnable;)V

    :cond_2
    return v5
.end method

.method public final ۢ()V
    .locals 1

    const/4 v0, 0x1

    .line 105
    iput-boolean v0, p0, Ll/᩸᩺ᩳ;->ܳ:Z

    return-void
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x1

    .line 80
    iput-boolean v0, p0, Ll/᩸᩺ᩳ;->ܽ:Z

    const-string v0, "edit_word_wrap_diff"

    .line 75
    iput-object v0, p0, Ll/᩸᩺ᩳ;->ܿ:Ljava/lang/String;

    const/4 v0, 0x0

    .line 76
    iput-boolean v0, p0, Ll/᩸᩺ᩳ;->ۧ:Z

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    .line 146
    iput-object p1, p0, Ll/᩸᩺ᩳ;->ۜ:Ljava/lang/String;

    return-void
.end method

.method public final ܳ()I
    .locals 3

    .line 425
    :try_start_0
    iget-boolean v0, p0, Ll/᩸᩺ᩳ;->ܽ:Z

    if-eqz v0, :cond_0

    .line 426
    sget-object v0, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v1, "diff_text_font_size"

    const-string v2, "12"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    return v0

    .line 428
    :cond_0
    sget-object v0, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v1, "edit_text_font_size"

    const-string v2, "15"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    const/16 v0, 0xf

    return v0
.end method

.method public final ܽ()Ll/᩶۟ᩳ;
    .locals 14

    .line 160
    invoke-static {}, Ll/᩸᩺ᩳ;->ۖ()I

    move-result v3

    .line 161
    invoke-virtual {p0}, Ll/᩸᩺ᩳ;->ܳ()I

    move-result v0

    .line 162
    invoke-static {}, Ll/᩸᩺ᩳ;->ܺ()F

    move-result v2

    .line 163
    invoke-virtual {p0}, Ll/᩸᩺ᩳ;->ᩳ()I

    move-result v4

    .line 101
    sget-object v1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v5, "show_soft_wrap_arrows"

    const/4 v6, 0x1

    invoke-interface {v1, v5, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v8

    .line 165
    iget-boolean v1, p0, Ll/᩸᩺ᩳ;->ܽ:Z

    const/4 v5, 0x0

    if-nez v1, :cond_1

    .line 444
    sget-object v1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v7, "edit_show_line_numbers"

    invoke-interface {v1, v7, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    const/4 v9, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    const/4 v9, 0x1

    .line 456
    :goto_1
    sget-object v1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v7, "edit_show_ascii_control"

    invoke-interface {v1, v7, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v10

    .line 460
    sget-object v1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v5, "edit_show_unicode_special"

    invoke-interface {v1, v5, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v11

    .line 168
    invoke-static {}, Ll/᩸᩺ᩳ;->ۘ()Z

    move-result v12

    .line 440
    sget-object v1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v5, "edit_tab_size"

    const/4 v7, 0x4

    invoke-interface {v1, v5, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    const-string v1, ""

    if-ne v3, v6, :cond_2

    .line 385
    sget-object v6, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v7, "edit_text_font2_custom_md5"

    invoke-interface {v6, v7, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_2
    move-object v7, v1

    .line 176
    new-instance v13, Ll/᩶۟ᩳ;

    iget-object v6, p0, Ll/᩸᩺ᩳ;->ۜ:Ljava/lang/String;

    int-to-float v1, v0

    move-object v0, v13

    invoke-direct/range {v0 .. v12}, Ll/᩶۟ᩳ;-><init>(FFIIILjava/lang/String;Ljava/lang/String;ZZZZZ)V

    return-object v13
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 142
    iget-object v0, p0, Ll/᩸᩺ᩳ;->ۜ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ()I
    .locals 3

    .line 85
    sget-object v0, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    iget-object v1, p0, Ll/᩸᩺ᩳ;->ܿ:Ljava/lang/String;

    iget-boolean v2, p0, Ll/᩸᩺ᩳ;->ۧ:Z

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 436
    sget-object v0, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v1, "edit_word_wrap_keep"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return v2

    :cond_0
    const/4 v0, 0x2

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷()V
    .locals 1

    .line 150
    invoke-virtual {p0}, Ll/᩸᩺ᩳ;->ܽ()Ll/᩶۟ᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/᩸᩺ᩳ;->᩻:Ll/᩶۟ᩳ;

    .line 151
    sget-object v0, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    invoke-interface {v0, p0}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 109
    iget-boolean v0, p0, Ll/᩸᩺ᩳ;->ܳ:Z

    return v0
.end method
