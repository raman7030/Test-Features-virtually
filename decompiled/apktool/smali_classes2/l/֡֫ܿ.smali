.class public final synthetic Ll/֡֫ܿ;
.super Ljava/lang/Object;
.source "L6NC"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 0
    iput p4, p0, Ll/֡֫ܿ;->᩸:I

    iput-object p1, p0, Ll/֡֫ܿ;->᩹:Ljava/lang/Object;

    iput-object p2, p0, Ll/֡֫ܿ;->᩶:Ljava/lang/Object;

    iput-object p3, p0, Ll/֡֫ܿ;->ۙ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 2
    iget v0, p0, Ll/֡֫ܿ;->᩸:I

    .line 4
    iget-object v1, p0, Ll/֡֫ܿ;->ۙ:Ljava/lang/Object;

    .line 6
    iget-object v2, p0, Ll/֡֫ܿ;->᩶:Ljava/lang/Object;

    .line 8
    iget-object v3, p0, Ll/֡֫ܿ;->᩹:Ljava/lang/Object;

    const/4 v4, 0x1

    packed-switch v0, :pswitch_data_0

    .line 14
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 16
    check-cast v2, Ljava/lang/String;

    .line 18
    check-cast v1, Landroid/graphics/Bitmap;

    .line 578
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    if-eqz v0, :cond_8

    .line 579
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 580
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_7

    .line 582
    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    goto/16 :goto_6

    .line 0
    :pswitch_0
    check-cast v3, Ll/ۧۗ᩻;

    check-cast v2, Ll/۫᩶᩻;

    check-cast v1, Ll/۟֨ܳ;

    .line 83
    :try_start_0
    new-instance v0, Ll/ᩳܰۡ;

    invoke-virtual {v3}, Ll/ۧۗ᩻;->ܳ֫()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ll/ᩳܰۡ;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    const-string v3, "resources.arsc"

    .line 84
    invoke-virtual {v0, v3}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v3

    if-nez v3, :cond_0

    goto/16 :goto_3

    .line 87
    :cond_0
    new-instance v5, Ll/᩺᩻ܽ;

    invoke-virtual {v0, v3}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v3

    invoke-direct {v5, v3}, Ll/᩺᩻ܽ;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v5}, Ll/᩺᩻ܽ;->ۜ()V

    .line 88
    invoke-virtual {v2}, Ll/ܺۘܳ;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 89
    invoke-virtual {v5}, Ll/ۡᩳܽ;->᩺()Ljava/lang/Iterable;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۘ᩻ܽ;

    .line 90
    invoke-interface {v5}, Ll/ۘ᩻ܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object v5

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/֡᩻ܽ;

    .line 91
    invoke-interface {v6}, Ll/֡᩻ܽ;->getTypeName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v8

    sparse-switch v8, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v8, "style"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_0

    :sswitch_1
    const-string v8, "array"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_0

    :sswitch_2
    const-string v8, "attr"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_0

    :sswitch_3
    const-string v8, "id"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_0

    :sswitch_4
    const-string v8, "plurals"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_0

    :sswitch_5
    const-string v8, "string"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_0

    .line 100
    :cond_3
    :goto_1
    invoke-interface {v6}, Ll/֡᩻ܽ;->ۢ()Ljava/lang/Iterable;

    move-result-object v6

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۜ᩻ܽ;

    .line 101
    invoke-interface {v7}, Ll/ۜ᩻ܽ;->ᩳ()Ljava/lang/Iterable;

    move-result-object v7

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_5
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩷᩻ܽ;

    .line 102
    invoke-interface {v8}, Ll/᩷᩻ܽ;->᩻֫()Z

    move-result v9

    if-nez v9, :cond_5

    .line 103
    invoke-interface {v8}, Ll/᩷᩻ܽ;->getValue()Ll/֨᩻ܽ;

    move-result-object v9

    .line 104
    invoke-interface {v9}, Ll/֨᩻ܽ;->ᩳ֫()Z

    move-result v10

    if-eqz v10, :cond_5

    .line 105
    invoke-interface {v9}, Ll/֨᩻ܽ;->ܿۧ()Ll/ۗ᩻ܽ;

    move-result-object v9

    invoke-interface {v9}, Ll/ۗ᩻ܽ;->getValue()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    .line 106
    new-instance v9, Ll/ۧ۠᩷;

    invoke-direct {v9, v4, v1, v8}, Ll/ۧ۠᩷;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v9}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    .line 118
    :cond_6
    :goto_3
    :try_start_2
    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_5

    :catchall_0
    move-exception v1

    .line 83
    :try_start_3
    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    :goto_5
    return-void

    .line 0
    :pswitch_1
    check-cast v3, Ll/֨֫ܿ;

    check-cast v2, Ljava/lang/Throwable;

    check-cast v1, Ll/ܰۗᩳ;

    invoke-static {v1, v3, v2}, Ll/֨֫ܿ;->֫(Ll/ܰۗᩳ;Ll/֨֫ܿ;Ljava/lang/Throwable;)V

    return-void

    .line 583
    :cond_7
    :goto_6
    new-instance v5, Landroid/graphics/drawable/TransitionDrawable;

    new-instance v6, Landroid/graphics/drawable/BitmapDrawable;

    .line 585
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-direct {v6, v7, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    const/4 v1, 0x2

    new-array v1, v1, [Landroid/graphics/drawable/Drawable;

    aput-object v2, v1, v3

    aput-object v6, v1, v4

    invoke-direct {v5, v1}, Landroid/graphics/drawable/TransitionDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 587
    invoke-virtual {v5, v4}, Landroid/graphics/drawable/TransitionDrawable;->setCrossFadeEnabled(Z)V

    .line 588
    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const/16 v0, 0x12c

    .line 589
    invoke-virtual {v5, v0}, Landroid/graphics/drawable/TransitionDrawable;->startTransition(I)V

    :cond_8
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        -0x352a9fef -> :sswitch_5
        -0x1c54a691 -> :sswitch_4
        0xd1b -> :sswitch_3
        0x2dd9f1 -> :sswitch_2
        0x58c7259 -> :sswitch_1
        0x68b1db1 -> :sswitch_0
    .end sparse-switch
.end method
