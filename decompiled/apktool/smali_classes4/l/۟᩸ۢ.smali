.class public Ll/۟᩸ۢ;
.super Ll/ۗܺ᩷;
.source "N1TT"

# interfaces
.implements Ll/ۡ᩹ۢ;
.implements Landroid/view/View$OnLayoutChangeListener;


# static fields
.field public static final synthetic ۖۧ:I


# instance fields
.field public ۜۧ:I

.field public ۡۧ:Ll/֡᩶ۢ;

.field public ۢۧ:Ljava/util/ArrayList;

.field public ܳۧ:Landroid/view/View;

.field public ܺۧ:Ll/ܺ᩹ۢ;

.field public ܿۧ:Landroid/widget/TextView;

.field public ᩳۧ:Ll/ۨ᩹ۢ;

.field public ᩷ۧ:Ll/ۚ᩹᩷;

.field public ᩻ۧ:Landroid/content/ServiceConnection;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 53
    invoke-direct {p0}, Ll/ۗܺ᩷;-><init>()V

    .line 350
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۟᩸ۢ;->ۢۧ:Ljava/util/ArrayList;

    .line 351
    new-instance v0, Ll/᩺᩸ۢ;

    invoke-direct {v0, p0}, Ll/᩺᩸ۢ;-><init>(Ll/۟᩸ۢ;)V

    iput-object v0, p0, Ll/۟᩸ۢ;->᩻ۧ:Landroid/content/ServiceConnection;

    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;Z)V
    .locals 5

    .line 83
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 84
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    const v3, 0x7f06039a

    if-ge v1, v2, :cond_0

    .line 85
    invoke-virtual {p0}, Ll/֨ܿ;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v2, 0x7f06039b

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    invoke-static {p1, v2, v4}, Ll/ۙۗ;->֫(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    goto :goto_1

    .line 87
    :cond_0
    invoke-virtual {p0}, Ll/֨ܿ;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    invoke-static {v2, v3, v4}, Ll/ۙۗ;->֫(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 88
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    const/16 v4, 0x1a

    if-lt v1, v4, :cond_1

    const/16 v4, 0x2010

    goto :goto_0

    :cond_1
    const/16 v4, 0x2000

    :goto_0
    if-eqz p1, :cond_2

    .line 94
    invoke-virtual {v2}, Landroid/view/View;->getSystemUiVisibility()I

    move-result p1

    not-int v4, v4

    and-int/2addr p1, v4

    invoke-virtual {v2, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    goto :goto_1

    .line 96
    :cond_2
    invoke-virtual {v2}, Landroid/view/View;->getSystemUiVisibility()I

    move-result p1

    or-int/2addr p1, v4

    invoke-virtual {v2, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    :goto_1
    const/16 p1, 0x1b

    if-lt v1, p1, :cond_3

    .line 100
    invoke-virtual {p0}, Ll/֨ܿ;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p0

    invoke-static {p1, v3, p0}, Ll/ۙۗ;->֫(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)I

    move-result p0

    invoke-virtual {v0, p0}, Landroid/view/Window;->setNavigationBarColor(I)V

    :cond_3
    return-void
.end method

.method public static synthetic ֫(Ll/۟᩸ۢ;)V
    .locals 3

    .line 127
    iget-object v0, p0, Ll/۟᩸ۢ;->ᩳۧ:Ll/ۨ᩹ۢ;

    if-eqz v0, :cond_0

    .line 128
    invoke-virtual {v0}, Ll/ۨ᩹ۢ;->ܳ()Ljava/lang/String;

    move-result-object v0

    .line 129
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "\n"

    .line 130
    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    .line 131
    iget-object v2, p0, Ll/۟᩸ۢ;->ᩳۧ:Ll/ۨ᩹ۢ;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-virtual {v2, v0}, Ll/ۨ᩹ۢ;->ۧ(I)V

    .line 132
    iget-object v0, p0, Ll/۟᩸ۢ;->ᩳۧ:Ll/ۨ᩹ۢ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/۟᩸ۢ;->ܿۧ:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\r"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۨ᩹ۢ;->֫(Ljava/lang/String;)V

    .line 135
    :cond_0
    iget-object p0, p0, Ll/۟᩸ۢ;->ܳۧ:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public static synthetic ֫(Ll/۟᩸ۢ;Landroid/content/DialogInterface;I)V
    .locals 1

    .line 297
    iget-object v0, p0, Ll/۟᩸ۢ;->ᩳۧ:Ll/ۨ᩹ۢ;

    iget-object p0, p0, Ll/۟᩸ۢ;->ۡۧ:Ll/֡᩶ۢ;

    invoke-virtual {v0, p0, p2}, Ll/ۨ᩹ۢ;->֫(Ll/֡᩶ۢ;I)V

    .line 298
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method

.method public static ֫(Ll/۟᩸ۢ;Landroid/view/MenuItem;)V
    .locals 5

    .line 244
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x104000b

    if-ne v0, v1, :cond_0

    .line 246
    iget-object p0, p0, Ll/۟᩸ۢ;->ۡۧ:Ll/֡᩶ۢ;

    invoke-virtual {p0}, Ll/֡᩶ۢ;->ܽ()V

    return-void

    :cond_0
    const v1, 0x7f120949

    if-ne v0, v1, :cond_1

    .line 248
    iget-object p0, p0, Ll/۟᩸ۢ;->᩷ۧ:Ll/ۚ᩹᩷;

    const-class p1, Ll/ۘ᩹ۢ;

    invoke-virtual {p0, p1}, Ll/ۚ᩹᩷;->֫(Ljava/lang/Class;)V

    return-void

    :cond_1
    const v1, 0x7f120a48

    const/4 v2, 0x0

    const v3, 0x7f12015e

    const v4, 0x7f120b7b

    if-ne v0, v1, :cond_2

    .line 250
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    .line 251
    invoke-virtual {p1, v4}, Ll/᩵ۚۢ;->ۧ(I)V

    const v0, 0x7f120a49

    .line 252
    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->֫(I)V

    new-instance v0, Ll/᩹᩸ۢ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/᩹᩸ۢ;-><init>(ILjava/lang/Object;)V

    const p0, 0x7f12070a

    .line 253
    invoke-virtual {p1, p0, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 258
    invoke-virtual {p1, v3, v2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 259
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    :cond_2
    const v1, 0x7f120a3f

    if-ne v0, v1, :cond_3

    .line 261
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    .line 262
    invoke-virtual {p1, v4}, Ll/᩵ۚۢ;->ۧ(I)V

    const v0, 0x7f120a41

    .line 263
    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->֫(I)V

    new-instance v0, Ll/᩶۫ܿ;

    const/4 v4, 0x2

    invoke-direct {v0, v4, p0}, Ll/᩶۫ܿ;-><init>(ILjava/lang/Object;)V

    .line 264
    invoke-virtual {p1, v1, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 269
    invoke-virtual {p1, v3, v2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v0, Ll/᩶᩸ۢ;

    invoke-direct {v0, p0}, Ll/᩶᩸ۢ;-><init>(Ll/۟᩸ۢ;)V

    const p0, 0x7f12062a

    .line 270
    invoke-virtual {p1, p0, v0}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 271
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    :cond_3
    const v1, 0x7f120b76

    if-ne v0, v1, :cond_6

    .line 273
    iget-object v0, p0, Ll/۟᩸ۢ;->ᩳۧ:Ll/ۨ᩹ۢ;

    .line 311
    iget-object v0, v0, Ll/ۨ᩹ۢ;->᩷:Ll/᩺᩹ۢ;

    invoke-static {v0}, Ll/᩺᩹ۢ;->ܽ(Ll/᩺᩹ۢ;)Landroid/os/PowerManager$WakeLock;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v1, :cond_5

    invoke-static {v0}, Ll/᩺᩹ۢ;->ᩳ(Ll/᩺᩹ۢ;)Landroid/net/wifi/WifiManager$WifiLock;

    move-result-object v0

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    const v0, 0x7f08021b

    .line 277
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 278
    iget-object p0, p0, Ll/۟᩸ۢ;->ᩳۧ:Ll/ۨ᩹ۢ;

    invoke-virtual {p0, v2}, Ll/ۨ᩹ۢ;->֫(Z)V

    return-void

    :cond_5
    :goto_0
    const v0, 0x7f08024f

    .line 274
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 275
    iget-object p0, p0, Ll/۟᩸ۢ;->ᩳۧ:Ll/ۨ᩹ۢ;

    invoke-virtual {p0, v2}, Ll/ۨ᩹ۢ;->ۧ(Z)V

    :cond_6
    return-void
.end method

.method public static synthetic ֫(Ll/۟᩸ۢ;Ljava/lang/Runnable;)V
    .locals 1

    .line 444
    iget-object v0, p0, Ll/۟᩸ۢ;->ᩳۧ:Ll/ۨ᩹ۢ;

    if-eqz v0, :cond_0

    .line 445
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    .line 447
    :cond_0
    iget-object p0, p0, Ll/۟᩸ۢ;->ۢۧ:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic ֫(Ll/۟᩸ۢ;Ljava/lang/String;)V
    .locals 3

    const/16 v0, 0xf

    :goto_0
    if-lez v0, :cond_2

    .line 383
    iget-object v1, p0, Ll/۟᩸ۢ;->ᩳۧ:Ll/ۨ᩹ۢ;

    if-nez v1, :cond_0

    goto :goto_1

    .line 387
    :cond_0
    invoke-virtual {v1}, Ll/ۨ᩹ۢ;->ܳ()Ljava/lang/String;

    move-result-object v1

    .line 388
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 389
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    .line 390
    new-instance v0, Ll/ܰ֨ۡ;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0, p1}, Ll/ܰ֨ۡ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    :cond_1
    const-wide/16 v1, 0xc8

    .line 415
    invoke-static {v1, v2}, Landroid/os/SystemClock;->sleep(J)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public static ֫(Ll/۟᩸ۢ;Ll/֡ۚۢ;Landroid/view/MenuItem;)V
    .locals 4

    .line 313
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result p2

    const v0, 0x7f120a46

    if-ne p2, v0, :cond_0

    .line 315
    iget-object p2, p0, Ll/۟᩸ۢ;->ᩳۧ:Ll/ۨ᩹ۢ;

    iget-object v0, p0, Ll/۟᩸ۢ;->ۡۧ:Ll/֡᩶ۢ;

    .line 288
    sget-object v1, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v2, "term_create_session_as_root"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    .line 315
    iget p0, p0, Ll/۟᩸ۢ;->ۜۧ:I

    int-to-float p0, p0

    const/4 v2, 0x1

    invoke-virtual {p2, v0, v1, v2, p0}, Ll/ۨ᩹ۢ;->֫(Ll/֡᩶ۢ;ZZF)V

    .line 316
    invoke-virtual {p1}, Ll/֡ۚۢ;->dismiss()V

    return-void

    :cond_0
    const v0, 0x7f120a40

    if-ne p2, v0, :cond_1

    .line 318
    iget-object p1, p0, Ll/۟᩸ۢ;->ᩳۧ:Ll/ۨ᩹ۢ;

    invoke-virtual {p1}, Ll/ۨ᩹ۢ;->֫()V

    .line 319
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_1
    const v0, 0x7f120a42

    if-ne p2, v0, :cond_2

    .line 321
    iget-object p0, p0, Ll/۟᩸ۢ;->ᩳۧ:Ll/ۨ᩹ۢ;

    invoke-virtual {p0}, Ll/ۨ᩹ۢ;->ۧ()V

    .line 322
    invoke-virtual {p1}, Ll/֡ۚۢ;->dismiss()V

    :cond_2
    return-void
.end method

.method public static ֫(Ll/۟᩸ۢ;Ll/֡ۚۢ;Landroid/view/View;)V
    .locals 5

    .line 306
    new-instance v0, Ll/᩸ۖ;

    const/4 v1, 0x0

    .line 68
    invoke-direct {v0, p0, p2, v1}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 307
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p2

    .line 308
    invoke-static {}, Ll/֫᩸ۢ;->ۧ()Ll/۟ܶۢ;

    move-result-object v2

    if-eqz v2, :cond_0

    const v2, 0x7f120a46

    .line 309
    invoke-interface {p2, v1, v2, v1, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    :cond_0
    const v2, 0x7f120a42

    .line 310
    invoke-interface {p2, v1, v2, v1, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    iget-object v3, p0, Ll/۟᩸ۢ;->ᩳۧ:Ll/ۨ᩹ۢ;

    invoke-virtual {v3}, Ll/ۨ᩹ۢ;->ᩳ()I

    move-result v3

    const/4 v4, 0x1

    if-le v3, v4, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    invoke-interface {v2, v4}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    const v2, 0x7f120a40

    .line 311
    invoke-interface {p2, v1, v2, v1, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 312
    new-instance p2, Ll/ۙ᩸ۢ;

    invoke-direct {p2, p0, p1}, Ll/ۙ᩸ۢ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, p2}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 326
    invoke-virtual {v0}, Ll/᩸ۖ;->ܿ()V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۟᩸ۢ;Ll/ۨ᩹ۢ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/۟᩸ۢ;->ᩳۧ:Ll/ۨ᩹ۢ;

    return-void
.end method

.method public static synthetic ֫(Ll/۟᩸ۢ;[Ljava/lang/CharSequence;Ll/֡ۚۢ;I)V
    .locals 7

    .line 330
    new-instance v6, Ll/ۛ᩸ۢ;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p0

    move v3, p3

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Ll/ۛ᩸ۢ;-><init>(Ll/۟᩸ۢ;Ll/۟᩸ۢ;I[Ljava/lang/CharSequence;Ll/֡ۚۢ;)V

    const p1, 0x7f120a4b

    .line 341
    invoke-virtual {v6, p1}, Ll/֫ۛܿ;->֫(I)V

    iget-object p0, p0, Ll/۟᩸ۢ;->ᩳۧ:Ll/ۨ᩹ۢ;

    .line 342
    invoke-virtual {p0, p3}, Ll/ۨ᩹ۢ;->֫(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v6, p0}, Ll/֫ۛܿ;->ۧ(Ljava/lang/String;)V

    .line 343
    invoke-virtual {v6}, Ll/֫ۛܿ;->ᩳ()V

    .line 344
    invoke-virtual {v6}, Ll/֫ۛܿ;->ܿ()V

    .line 345
    invoke-virtual {v6}, Ll/֫ۛܿ;->᩻()V

    return-void
.end method

.method public static bridge synthetic ۖ(Ll/۟᩸ۢ;)Ll/֡᩶ۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟᩸ۢ;->ۡۧ:Ll/֡᩶ۢ;

    return-object p0
.end method

.method public static bridge synthetic ۘ(Ll/۟᩸ۢ;)Ll/ܺ᩹ۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟᩸ۢ;->ܺۧ:Ll/ܺ᩹ۢ;

    return-object p0
.end method

.method public static ۜ(Ll/۟᩸ۢ;)V
    .locals 5

    .line 376
    iget-object v0, p0, Ll/۟᩸ۢ;->ᩳۧ:Ll/ۨ᩹ۢ;

    iget-object v1, p0, Ll/۟᩸ۢ;->ۡۧ:Ll/֡᩶ۢ;

    .line 288
    sget-object v2, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v3, "term_create_session_as_root"

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    .line 376
    invoke-virtual {v0, v1, v2}, Ll/ۨ᩹ۢ;->֫(Ll/֡᩶ۢ;Z)V

    .line 377
    invoke-virtual {p0}, Ll/ۗܺ᩷;->᩶()Z

    move-result v0

    if-nez v0, :cond_0

    .line 378
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "PATH"

    .line 379
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 380
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 381
    sget-object v1, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Ll/᩸᩸ۢ;

    invoke-direct {v2, p0, v0}, Ll/᩸᩸ۢ;-><init>(Ll/۟᩸ۢ;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    :cond_0
    return-void
.end method

.method public static bridge synthetic ۡ(Ll/۟᩸ۢ;)Landroid/view/View;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟᩸ۢ;->ܳۧ:Landroid/view/View;

    return-object p0
.end method

.method public static bridge synthetic ۢ(Ll/۟᩸ۢ;)Ll/ۨ᩹ۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟᩸ۢ;->ᩳۧ:Ll/ۨ᩹ۢ;

    return-object p0
.end method

.method public static synthetic ۧ(Ll/۟᩸ۢ;)V
    .locals 0

    .line 114
    iget-object p0, p0, Ll/۟᩸ۢ;->ᩳۧ:Ll/ۨ᩹ۢ;

    invoke-virtual {p0}, Ll/ۨ᩹ۢ;->᩷()V

    return-void
.end method

.method public static synthetic ۧ(Ll/۟᩸ۢ;Ljava/lang/String;)V
    .locals 3

    .line 391
    iget-object v0, p0, Ll/۟᩸ۢ;->ܿۧ:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "cd "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ll/ۢ֨ۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 392
    iget-object p1, p0, Ll/۟᩸ۢ;->ܳۧ:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 393
    iget-object p1, p0, Ll/۟᩸ۢ;->ܳۧ:Landroid/view/View;

    const v0, 0x7f0a00ca

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const/4 v0, 0x5

    .line 394
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 395
    new-instance v0, Ll/ܰ᩸ۢ;

    invoke-direct {v0, p0, p1}, Ll/ܰ᩸ۢ;-><init>(Ll/۟᩸ۢ;Landroid/widget/TextView;)V

    .line 411
    invoke-virtual {v0}, Ll/ܰ᩸ۢ;->run()V

    return-void
.end method

.method private ۨ()V
    .locals 3

    .line 203
    :try_start_0
    sget-object v0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v1, "term_font_size"

    const-string v2, "12"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/16 v0, 0xc

    .line 193
    :goto_0
    iput v0, p0, Ll/۟᩸ۢ;->ۜۧ:I

    .line 194
    iget-object v1, p0, Ll/۟᩸ۢ;->ۡۧ:Ll/֡᩶ۢ;

    int-to-float v0, v0

    invoke-virtual {v1, v0}, Ll/֡᩶ۢ;->֫(F)V

    .line 195
    iget-object v0, p0, Ll/۟᩸ۢ;->ۡۧ:Ll/֡᩶ۢ;

    invoke-static {}, Ll/ܳ᩹ۢ;->֫()Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/֡᩶ۢ;->֫(Landroid/graphics/Typeface;)V

    return-void
.end method

.method public static ܳ(Ll/۟᩸ۢ;)V
    .locals 3

    .line 119
    invoke-direct {p0}, Ll/۟᩸ۢ;->ۨ()V

    .line 121
    invoke-virtual {p0}, Ll/֨ܿ;->ܺ()Ll/۬ܿ;

    move-result-object p0

    .line 77
    sget-object v0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    if-eqz v0, :cond_0

    const-string v1, "term_keep_dark"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    goto :goto_0

    :cond_0
    const/16 v0, -0x64

    .line 121
    :goto_0
    invoke-virtual {p0, v0}, Ll/۬ܿ;->ᩳ(I)V

    return-void
.end method

.method public static bridge synthetic ܺ(Ll/۟᩸ۢ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟᩸ۢ;->ۢۧ:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static ܽ(Ll/۟᩸ۢ;)V
    .locals 5

    .line 301
    iget-object v0, p0, Ll/۟᩸ۢ;->ᩳۧ:Ll/ۨ᩹ۢ;

    iget-object v1, p0, Ll/۟᩸ۢ;->ۡۧ:Ll/֡᩶ۢ;

    .line 288
    sget-object v2, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v3, "term_create_session_as_root"

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    .line 301
    iget p0, p0, Ll/۟᩸ۢ;->ۜۧ:I

    int-to-float p0, p0

    invoke-virtual {v0, v1, v2, v4, p0}, Ll/ۨ᩹ۢ;->֫(Ll/֡᩶ۢ;ZZF)V

    return-void
.end method

.method public static synthetic ܿ(Ll/۟᩸ۢ;)V
    .locals 3

    .line 213
    iget-object v0, p0, Ll/۟᩸ۢ;->ۡۧ:Ll/֡᩶ۢ;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    const v1, 0x7f0a02af

    invoke-virtual {p0, v1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    sub-int/2addr v0, v1

    .line 214
    iget-object p0, p0, Ll/۟᩸ۢ;->ᩳۧ:Ll/ۨ᩹ۢ;

    const/4 v1, 0x1

    const/16 v2, 0x31

    invoke-virtual {p0, v2, v0, v1}, Ll/ۨ᩹ۢ;->֫(IIZ)V

    return-void
.end method

.method public static synthetic ᩳ(Ll/۟᩸ۢ;)V
    .locals 1

    .line 137
    iget-object p0, p0, Ll/۟᩸ۢ;->ܳۧ:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public static ᩷(Ll/۟᩸ۢ;)V
    .locals 4

    .line 254
    iget-object v0, p0, Ll/۟᩸ۢ;->ᩳۧ:Ll/ۨ᩹ۢ;

    if-eqz v0, :cond_0

    .line 255
    iget-object p0, p0, Ll/۟᩸ۢ;->ۡۧ:Ll/֡᩶ۢ;

    .line 288
    sget-object v1, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v2, "term_create_session_as_root"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    .line 255
    invoke-virtual {v0, p0, v1}, Ll/ۨ᩹ۢ;->ۧ(Ll/֡᩶ۢ;Z)V

    :cond_0
    return-void
.end method

.method public static synthetic ᩻(Ll/۟᩸ۢ;)V
    .locals 2

    .line 265
    iget-object v0, p0, Ll/۟᩸ۢ;->ᩳۧ:Ll/ۨ᩹ۢ;

    if-eqz v0, :cond_0

    iget-object v1, p0, Ll/۟᩸ۢ;->ۡۧ:Ll/֡᩶ۢ;

    invoke-virtual {v0, v1}, Ll/ۨ᩹ۢ;->֫(Ll/֡᩶ۢ;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 267
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    const/4 v0, 0x0

    .line 106
    iput-boolean v0, p0, Ll/ۗܺ᩷;->ۗ֫:Z

    .line 107
    invoke-static {}, Ll/ᩳ۬᩷;->ۢ֫()I

    move-result v1

    invoke-virtual {p0, v1}, Ll/֨ܿ;->setTheme(I)V

    .line 108
    invoke-super {p0, p1}, Ll/ۗܺ᩷;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0d0052

    .line 109
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f120a4d

    .line 110
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    .line 112
    invoke-static {p0}, Ll/᩸֡᩷;->֫(Landroid/content/Context;)Z

    move-result p1

    sput-boolean p1, Ll/ۧ᩹ۢ;->ܽ:Z

    .line 113
    invoke-static {p0, p1}, Ll/۟᩸ۢ;->֫(Ll/ۗܺ᩷;Z)V

    .line 114
    new-instance p1, Ll/ۗ᩸ۢ;

    const/4 v1, 0x0

    invoke-direct {p1, v1, p0}, Ll/ۗ᩸ۢ;-><init>(ILjava/lang/Object;)V

    .line 443
    new-instance v1, Ll/ᩳ᩹᩷;

    const/4 v2, 0x3

    invoke-direct {v1, v2, p0, p1}, Ll/ᩳ᩹᩷;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 116
    new-instance p1, Ll/ܺ᩹ۢ;

    invoke-direct {p1, p0, p0}, Ll/ܺ᩹ۢ;-><init>(Ll/ۗܺ᩷;Ll/ۡ᩹ۢ;)V

    iput-object p1, p0, Ll/۟᩸ۢ;->ܺۧ:Ll/ܺ᩹ۢ;

    .line 118
    new-instance p1, Ll/۟ۢۡ;

    const/4 v1, 0x6

    invoke-direct {p1, v1, p0}, Ll/۟ۢۡ;-><init>(ILjava/lang/Object;)V

    .line 824
    invoke-static {p0, p1}, Ll/۠᩹᩷;->֫(Ll/᩻ܽ;Ll/᩵᩹᩷;)Ll/ۚ᩹᩷;

    move-result-object p1

    .line 118
    iput-object p1, p0, Ll/۟᩸ۢ;->᩷ۧ:Ll/ۚ᩹᩷;

    const p1, 0x7f0a00cd

    .line 124
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Ll/۟᩸ۢ;->ܳۧ:Landroid/view/View;

    const v1, 0x7f0a00cb

    .line 125
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/۟᩸ۢ;->ܿۧ:Landroid/widget/TextView;

    .line 126
    iget-object p1, p0, Ll/۟᩸ۢ;->ܳۧ:Landroid/view/View;

    const v1, 0x7f0a00cc

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance v1, Ll/۬᩸ۢ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0}, Ll/۬᩸ۢ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 137
    iget-object p1, p0, Ll/۟᩸ۢ;->ܳۧ:Landroid/view/View;

    const v1, 0x7f0a00ca

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance v1, Ll/ۧۡۡ;

    const/4 v2, 0x5

    invoke-direct {v1, v2, p0}, Ll/ۧۡۡ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 424
    new-instance p1, Landroid/content/Intent;

    const-class v1, Ll/᩺᩹ۢ;

    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-static {p0, p1}, Ll/֨ۙ;->֫(Landroid/content/Context;Landroid/content/Intent;)V

    .line 425
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v1, p0, Ll/۟᩸ۢ;->᩻ۧ:Landroid/content/ServiceConnection;

    const/16 v2, 0x40

    invoke-virtual {p0, p1, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    const p1, 0x7f0a05bd

    .line 141
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/֡᩶ۢ;

    iput-object p1, p0, Ll/۟᩸ۢ;->ۡۧ:Ll/֡᩶ۢ;

    .line 142
    invoke-virtual {p1, p0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 143
    invoke-direct {p0}, Ll/۟᩸ۢ;->ۨ()V

    .line 144
    iget-object p1, p0, Ll/۟᩸ۢ;->ۡۧ:Ll/֡᩶ۢ;

    new-instance v1, Ll/ۤ᩸ۢ;

    invoke-direct {v1, p0}, Ll/ۤ᩸ۢ;-><init>(Ll/۟᩸ۢ;)V

    invoke-virtual {p1, v1}, Ll/֡᩶ۢ;->֫(Ll/ۚ᩶ۢ;)V

    .line 186
    new-instance p1, Ll/᩷ۛ᩻;

    const/16 v1, 0x8

    invoke-direct {p1, v1, p0}, Ll/᩷ۛ᩻;-><init>(ILjava/lang/Object;)V

    .line 77
    invoke-static {p0, p1, v0}, Ll/ۘ᩸ۢ;->֫(Ll/ۗܺ᩷;Ljava/lang/Runnable;Z)V

    return-void
.end method

.method public final onDestroy()V
    .locals 3

    .line 430
    invoke-super {p0}, Ll/ۗܺ᩷;->onDestroy()V

    .line 431
    iget-object v0, p0, Ll/۟᩸ۢ;->᩻ۧ:Landroid/content/ServiceConnection;

    invoke-virtual {p0, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 432
    iget-object v0, p0, Ll/۟᩸ۢ;->ᩳۧ:Ll/ۨ᩹ۢ;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 433
    invoke-virtual {v0, v1, v1, v1}, Ll/ۨ᩹ۢ;->֫(IIZ)V

    .line 435
    :cond_0
    iget-object v0, p0, Ll/۟᩸ۢ;->ᩳۧ:Ll/ۨ᩹ۢ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/ۨ᩹ۢ;->᩻()Z

    move-result v0

    if-nez v0, :cond_1

    .line 436
    new-instance v0, Landroid/content/Intent;

    const-class v1, Ll/᩺᩹ۢ;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "bin.mt.term.TerminalService.ACTION_EXIT"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    invoke-static {p0, v0}, Ll/֨ۙ;->֫(Landroid/content/Context;Landroid/content/Intent;)V

    .line 439
    :cond_1
    new-instance v0, Ll/֡ۡ᩷;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ll/֡ۡ᩷;-><init>(I)V

    const-wide/16 v1, 0x1f4

    invoke-static {v1, v2, v0}, Ll/ۙ᩸᩷;->֫(JLjava/lang/Runnable;)V

    return-void
.end method

.method public final onPostResume()V
    .locals 3

    .line 211
    invoke-super {p0}, Ll/֨ܿ;->onPostResume()V

    .line 212
    new-instance v0, Ll/ۚ᩸ۢ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/ۚ᩸ۢ;-><init>(ILjava/lang/Object;)V

    .line 443
    new-instance v1, Ll/ᩳ᩹᩷;

    const/4 v2, 0x3

    invoke-direct {v1, v2, p0, v0}, Ll/ᩳ᩹᩷;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ֫(Landroid/view/View;)V
    .locals 5

    .line 226
    new-instance v0, Ll/᩸ۖ;

    const/4 v1, 0x0

    .line 68
    invoke-direct {v0, p0, p1, v1}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 227
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p1

    .line 228
    iget-object v2, p0, Ll/۟᩸ۢ;->ᩳۧ:Ll/ۨ᩹ۢ;

    if-eqz v2, :cond_2

    .line 311
    iget-object v2, v2, Ll/ۨ᩹ۢ;->᩷:Ll/᩺᩹ۢ;

    invoke-static {v2}, Ll/᩺᩹ۢ;->ܽ(Ll/᩺᩹ۢ;)Landroid/os/PowerManager$WakeLock;

    move-result-object v3

    const v4, 0x7f120b76

    if-nez v3, :cond_1

    invoke-static {v2}, Ll/᩺᩹ۢ;->ᩳ(Ll/᩺᩹ۢ;)Landroid/net/wifi/WifiManager$WifiLock;

    move-result-object v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 232
    :cond_0
    invoke-virtual {p1, v1, v4, v1, v4}, Ll/ۗۜ;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    const v3, 0x7f08024f

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    goto :goto_1

    .line 230
    :cond_1
    :goto_0
    invoke-virtual {p1, v1, v4, v1, v4}, Ll/ۗۜ;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    const v3, 0x7f08021b

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    :goto_1
    const v2, 0x7f120a3f

    .line 234
    invoke-virtual {p1, v1, v2, v1, v2}, Ll/ۗۜ;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    const v3, 0x7f0801dd

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const v2, 0x7f120a48

    .line 235
    invoke-virtual {p1, v1, v2, v1, v2}, Ll/ۗۜ;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    const v3, 0x7f08022b

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    :cond_2
    const v2, 0x7f120949

    .line 237
    invoke-virtual {p1, v1, v2, v1, v2}, Ll/ۗۜ;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    const v3, 0x7f08023d

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 238
    iget-object v2, p0, Ll/۟᩸ۢ;->ᩳۧ:Ll/ۨ᩹ۢ;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ll/ۨ᩹ۢ;->ۜ()Z

    move-result v2

    if-eqz v2, :cond_3

    const v2, 0x104000b

    .line 239
    invoke-virtual {p1, v1, v2, v1, v2}, Ll/ۗۜ;->add(IIII)Landroid/view/MenuItem;

    move-result-object v1

    const v2, 0x7f080225

    .line 240
    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    move-result-object v1

    iget-object v2, p0, Ll/۟᩸ۢ;->ۡۧ:Ll/֡᩶ۢ;

    .line 241
    invoke-virtual {v2}, Ll/֡᩶ۢ;->֫()Z

    move-result v2

    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 243
    :cond_3
    new-instance v1, Ll/۫᩸ۢ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0}, Ll/۫᩸ۢ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    const/4 v1, 0x1

    .line 283
    invoke-virtual {p1, v1}, Ll/ۗۜ;->setOptionalIconsVisible(Z)V

    .line 284
    invoke-virtual {v0}, Ll/᩸ۖ;->ܿ()V

    return-void
.end method

.method public final ۘ()I
    .locals 3

    .line 77
    sget-object v0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    if-eqz v0, :cond_0

    const-string v1, "term_keep_dark"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    return v0

    :cond_0
    const/16 v0, -0x64

    return v0
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "TerminalActivity"

    return-object v0
.end method

.method public final ܳ()V
    .locals 5

    .line 293
    iget-object v0, p0, Ll/۟᩸ۢ;->ᩳۧ:Ll/ۨ᩹ۢ;

    if-nez v0, :cond_0

    return-void

    .line 295
    :cond_0
    invoke-virtual {v0}, Ll/ۨ᩹ۢ;->ܿ()[Ljava/lang/CharSequence;

    move-result-object v0

    .line 296
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v1

    iget-object v2, p0, Ll/۟᩸ۢ;->ᩳۧ:Ll/ۨ᩹ۢ;

    invoke-virtual {v2}, Ll/ۨ᩹ۢ;->ܽ()I

    move-result v2

    new-instance v3, Ll/ۢܰܿ;

    const/4 v4, 0x2

    invoke-direct {v3, p0, v4}, Ll/ۢܰܿ;-><init>(Ll/ۗܺ᩷;I)V

    invoke-virtual {v1, v0, v2, v3}, Ll/᩵ۚۢ;->֫([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V

    const v2, 0x7f120a4a

    .line 299
    invoke-virtual {v1, v2}, Ll/᩵ۚۢ;->ۧ(I)V

    const v2, 0x7f120189

    const/4 v3, 0x0

    .line 300
    invoke-virtual {v1, v2, v3}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v2, Ll/֨᩸ۢ;

    invoke-direct {v2, p0}, Ll/֨᩸ۢ;-><init>(Ll/۟᩸ۢ;)V

    const v4, 0x7f120a45

    .line 301
    invoke-virtual {v1, v4, v2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v2, 0x7f120634

    .line 302
    invoke-virtual {v1, v2, v3}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 303
    invoke-virtual {v1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v1

    .line 305
    invoke-virtual {v1}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v2

    new-instance v3, Ll/۠᩸ۢ;

    invoke-direct {v3, p0, v1}, Ll/۠᩸ۢ;-><init>(Ll/۟᩸ۢ;Ll/֡ۚۢ;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 329
    invoke-virtual {v1}, Ll/֡ۚۢ;->ۧ()Ll/ۖܿ;

    move-result-object v2

    new-instance v3, Ll/ܶ᩸ۢ;

    invoke-direct {v3, p0, v0, v1}, Ll/ܶ᩸ۢ;-><init>(Ll/۟᩸ۢ;[Ljava/lang/CharSequence;Ll/֡ۚۢ;)V

    invoke-virtual {v2, v3}, Ll/ۢۢۡ;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    return-void
.end method
