.class public final Ll/ۘ۠ܿ;
.super Ljava/lang/Object;
.source "313O"


# static fields
.field public static final ۢ:Ll/֨᩵;


# instance fields
.field public final ֫:Ll/ۗܺ᩷;

.field public final ۜ:Ll/ۡۡۡ;

.field public final ۧ:Landroid/view/View;

.field public final ܳ:Ll/ۛ֨ܿ;

.field public ܽ:Ljava/lang/String;

.field public final ܿ:Ll/֡ۚۢ;

.field public ᩳ:Ljava/util/ArrayList;

.field public ᩷:Z

.field public ᩻:Ll/ܺ۠ܿ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 576
    new-instance v0, Ll/֨᩵;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Ll/֨᩵;-><init>(I)V

    sput-object v0, Ll/ۘ۠ܿ;->ۢ:Ll/֨᩵;

    return-void
.end method

.method public constructor <init>(Ll/ۗܺ᩷;Ll/ۛ֨ܿ;)V
    .locals 7

    .line 225
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۘ۠ܿ;->ᩳ:Ljava/util/ArrayList;

    .line 226
    iput-object p1, p0, Ll/ۘ۠ܿ;->֫:Ll/ۗܺ᩷;

    .line 227
    iput-object p2, p0, Ll/ۘ۠ܿ;->ܳ:Ll/ۛ֨ܿ;

    const v0, 0x7f0d00ef

    .line 228
    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll/ۘ۠ܿ;->ۧ:Landroid/view/View;

    .line 229
    new-instance v1, Ll/ۜ۠ܿ;

    invoke-direct {v1, p0}, Ll/ۜ۠ܿ;-><init>(Ll/ۘ۠ܿ;)V

    const v2, 0x7f0a02e2

    .line 230
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/ۡۡۡ;

    iput-object v2, p0, Ll/ۘ۠ܿ;->ۜ:Ll/ۡۡۡ;

    .line 231
    new-instance v3, Ll/᩸ۙۧ;

    const/4 v4, 0x3

    invoke-direct {v3, p1, v4}, Ll/᩸ۙۧ;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v2, v3}, Ll/۬۬ۧ;->setLayoutManager(Ll/ܿ۬ۧ;)V

    .line 232
    invoke-virtual {v2, v1}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    .line 233
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    const v5, 0x7f0d00f0

    const/4 v6, 0x0

    invoke-virtual {v3, v5, v2, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 234
    invoke-virtual {v3, v6, v6}, Landroid/view/View;->measure(II)V

    .line 235
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    sget-object v5, Ll/ۢ֨ܿ;->ۧ:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    div-int/2addr v5, v4

    mul-int v5, v5, v3

    invoke-virtual {v2, v5}, Ll/ۡۡۡ;->֫(I)V

    .line 236
    invoke-static {v2}, Ll/ۙ᩸ۡ;->֫(Ll/۬۬ۧ;)V

    const v2, 0x7f0a0257

    .line 238
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f0a0631

    .line 239
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    const v4, 0x7f0a04e6

    .line 240
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Ll/᩻ۡۡ;

    .line 241
    new-instance v5, Ll/ܽ۠ܿ;

    invoke-direct {v5, v1, v2, v3}, Ll/ܽ۠ܿ;-><init>(Ll/ۜ۠ܿ;Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {v4, v5}, Ll/᩻ۡۡ;->֫(Ll/ܿۡۡ;)V

    .line 260
    new-instance v1, Ll/۬᩸ۢ;

    const/4 v3, 0x1

    invoke-direct {v1, v3, p1}, Ll/۬᩸ۢ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 269
    sget v1, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v1, Ll/᩵ۚۢ;

    invoke-direct {v1, p1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 270
    invoke-virtual {v1, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const p1, 0x7f120189

    const/4 v0, 0x0

    .line 271
    invoke-virtual {v1, p1, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f120758

    .line 272
    invoke-virtual {v1, p1, v0}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f120a9f

    .line 273
    invoke-virtual {v1, p1, v0}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 274
    invoke-virtual {v1}, Ll/᩵ۚۢ;->֫()Ll/֡ۚۢ;

    move-result-object p1

    iput-object p1, p0, Ll/ۘ۠ܿ;->ܿ:Ll/֡ۚۢ;

    .line 275
    invoke-virtual {p2}, Ll/ۛ֨ܿ;->֫()Ljava/lang/String;

    move-result-object p1

    const-string p2, "*/*"

    .line 276
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p1, "built-in"

    .line 277
    iput-object p1, p0, Ll/ۘ۠ܿ;->ܽ:Ljava/lang/String;

    return-void

    :cond_0
    const-string p2, "text/"

    .line 278
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    const-string p1, "text/*"

    .line 279
    iput-object p1, p0, Ll/ۘ۠ܿ;->ܽ:Ljava/lang/String;

    return-void

    :cond_1
    const-string p2, "image/"

    .line 280
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    const-string p1, "image/*"

    .line 281
    iput-object p1, p0, Ll/ۘ۠ܿ;->ܽ:Ljava/lang/String;

    return-void

    :cond_2
    const-string p2, "video/"

    .line 282
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    const-string p1, "video/*"

    .line 283
    iput-object p1, p0, Ll/ۘ۠ܿ;->ܽ:Ljava/lang/String;

    return-void

    :cond_3
    const-string p2, "audio/"

    .line 284
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "audio/*"

    .line 285
    iput-object p1, p0, Ll/ۘ۠ܿ;->ܽ:Ljava/lang/String;

    return-void

    :cond_4
    const-string p1, "default"

    .line 287
    iput-object p1, p0, Ll/ۘ۠ܿ;->ܽ:Ljava/lang/String;

    .line 288
    iput-boolean v3, p0, Ll/ۘ۠ܿ;->᩷:Z

    return-void
.end method

.method public static bridge synthetic ֫()Ll/֨᩵;
    .locals 1

    .line 0
    sget-object v0, Ll/ۘ۠ܿ;->ۢ:Ll/֨᩵;

    return-object v0
.end method

.method private ֫(Ll/ۗۜ;IILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 351
    invoke-interface {p1, p2, p3, v0, p3}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    .line 352
    iget-object p2, p0, Ll/ۘ۠ܿ;->ܽ:Ljava/lang/String;

    .line 52
    invoke-static {p2, p4}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    .line 353
    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;Ll/ۖۙ᩷;)V
    .locals 5

    .line 177
    new-instance v0, Ll/ۘ۠ܿ;

    .line 122
    sget-object v1, Ll/ܽ֡ܿ;->ܿ:Ll/ܶ᩵ܿ;

    const-string v2, "a.apk"

    invoke-virtual {v1, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    const-string v2, "application/vnd.android.package-archive"

    .line 177
    invoke-static {p0, v1, v2}, Ll/ۛ֨ܿ;->֫(Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ۛ֨ܿ;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ll/ۘ۠ܿ;-><init>(Ll/ۗܺ᩷;Ll/ۛ֨ܿ;)V

    const-string v1, "default"

    .line 178
    iput-object v1, v0, Ll/ۘ۠ܿ;->ܽ:Ljava/lang/String;

    const/4 v1, 0x1

    .line 179
    iput-boolean v1, v0, Ll/ۘ۠ܿ;->᩷:Z

    const v1, 0x7f0a0257

    .line 180
    iget-object v2, v0, Ll/ۘ۠ܿ;->ۧ:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/4 v3, 0x4

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    const v1, 0x7f0a04e6

    .line 181
    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 182
    iget-object v1, v0, Ll/ۘ۠ܿ;->ܿ:Ll/֡ۚۢ;

    const/4 v3, -0x2

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4, v4}, Ll/֡ۚۢ;->֫(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    const v3, 0x7f1208b4

    .line 183
    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    const/4 v3, -0x3

    invoke-virtual {v1, v3, p0, v4}, Ll/֡ۚۢ;->֫(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    const p0, 0x7f0a0631

    .line 184
    invoke-virtual {v2, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    const v1, 0x7f12021b

    .line 185
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(I)V

    const p0, 0x7f0a029f

    .line 186
    invoke-virtual {v2, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    const v1, 0x7f12021c

    .line 187
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(I)V

    const/4 v1, 0x0

    .line 188
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 189
    new-instance p0, Ll/ۧ۠ܿ;

    invoke-direct {p0, p1}, Ll/ۧ۠ܿ;-><init>(Ll/ۖۙ᩷;)V

    iput-object p0, v0, Ll/ۘ۠ܿ;->᩻:Ll/ܺ۠ܿ;

    .line 211
    new-instance p0, Ll/ۨ֨ܿ;

    invoke-direct {p0, v0, p1, v1}, Ll/ۨ֨ܿ;-><init>(Ljava/lang/Object;Ljava/lang/Comparable;I)V

    .line 297
    new-instance p1, Ll/ܳ۠ܿ;

    invoke-direct {p1, v0, p0}, Ll/ܳ۠ܿ;-><init>(Ll/ۘ۠ܿ;Ljava/lang/Runnable;)V

    .line 346
    invoke-virtual {p1}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method

.method public static ֫(Ll/ۘ۠ܿ;)V
    .locals 3

    const-string v0, "filetransfer.apk"

    .line 474
    iget-object p0, p0, Ll/ۘ۠ܿ;->֫:Ll/ۗܺ᩷;

    :try_start_0
    sget-object v1, Ll/ܽ֡ܿ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-virtual {v1, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 475
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/ܶ᩵ܿ;->֫(Ljava/io/InputStream;)V

    .line 476
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۠ۧ()Landroid/net/Uri;

    move-result-object v0

    .line 477
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "application/vnd.android.package-archive"

    .line 478
    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v2, 0x10000000

    .line 479
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 480
    invoke-static {v1, v0}, Ll/ۖ᩺ۘ;->֫(Landroid/content/Intent;Landroid/net/Uri;)V

    .line 481
    invoke-virtual {p0, v1}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const/4 v1, 0x0

    .line 546
    invoke-virtual {p0, v0, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public static ֫(Ll/ۘ۠ܿ;Landroid/view/MenuItem;)V
    .locals 1

    .line 371
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x7f120aa2

    if-ne p1, v0, :cond_0

    const-string p1, "built-in"

    goto :goto_0

    :cond_0
    const v0, 0x7f120aa5

    if-ne p1, v0, :cond_1

    const-string p1, "default"

    goto :goto_0

    :cond_1
    const v0, 0x7f120aa6

    if-ne p1, v0, :cond_2

    const-string p1, "text/*"

    goto :goto_0

    :cond_2
    const v0, 0x7f120aa4

    if-ne p1, v0, :cond_3

    const-string p1, "image/*"

    goto :goto_0

    :cond_3
    const v0, 0x7f120aa7

    if-ne p1, v0, :cond_4

    const-string p1, "video/*"

    goto :goto_0

    :cond_4
    const v0, 0x7f120aa1

    if-ne p1, v0, :cond_5

    const-string p1, "audio/*"

    goto :goto_0

    :cond_5
    const-string p1, "*/*"

    .line 387
    :goto_0
    iget-object v0, p0, Ll/ۘ۠ܿ;->ܽ:Ljava/lang/String;

    .line 52
    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 388
    iput-object p1, p0, Ll/ۘ۠ܿ;->ܽ:Ljava/lang/String;

    .line 397
    new-instance p1, Ll/᩻۠ܿ;

    invoke-direct {p1, p0}, Ll/᩻۠ܿ;-><init>(Ll/ۘ۠ܿ;)V

    .line 426
    invoke-virtual {p1}, Ll/۟ܶۡ;->᩻()V

    :cond_6
    return-void
.end method

.method public static ֫(Ll/ۘ۠ܿ;Landroid/view/View;)V
    .locals 4

    .line 358
    new-instance v0, Ll/᩸ۖ;

    iget-object v1, p0, Ll/ۘ۠ܿ;->֫:Ll/ۗܺ᩷;

    const/4 v2, 0x0

    .line 68
    invoke-direct {v0, v1, p1, v2}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 359
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p1

    .line 360
    invoke-static {p1}, Ll/᩹ۛ;->֫(Landroid/view/Menu;)V

    const v1, 0x7f120aa2

    const-string v2, "built-in"

    const v3, 0x7f0a02fd

    .line 361
    invoke-direct {p0, p1, v3, v1, v2}, Ll/ۘ۠ܿ;->֫(Ll/ۗۜ;IILjava/lang/String;)V

    .line 362
    iget-boolean v1, p0, Ll/ۘ۠ܿ;->᩷:Z

    const v2, 0x7f0a02fe

    if-eqz v1, :cond_0

    const v1, 0x7f120aa5

    const-string v3, "default"

    .line 363
    invoke-direct {p0, p1, v2, v1, v3}, Ll/ۘ۠ܿ;->֫(Ll/ۗۜ;IILjava/lang/String;)V

    :cond_0
    const v1, 0x7f120aa6

    const-string v3, "text/*"

    .line 364
    invoke-direct {p0, p1, v2, v1, v3}, Ll/ۘ۠ܿ;->֫(Ll/ۗۜ;IILjava/lang/String;)V

    const v1, 0x7f120aa4

    const-string v3, "image/*"

    .line 365
    invoke-direct {p0, p1, v2, v1, v3}, Ll/ۘ۠ܿ;->֫(Ll/ۗۜ;IILjava/lang/String;)V

    const v1, 0x7f120aa7

    const-string v3, "video/*"

    .line 366
    invoke-direct {p0, p1, v2, v1, v3}, Ll/ۘ۠ܿ;->֫(Ll/ۗۜ;IILjava/lang/String;)V

    const v1, 0x7f120aa1

    const-string v3, "audio/*"

    .line 367
    invoke-direct {p0, p1, v2, v1, v3}, Ll/ۘ۠ܿ;->֫(Ll/ۗۜ;IILjava/lang/String;)V

    const v1, 0x7f120aa0

    const-string v3, "*/*"

    .line 368
    invoke-direct {p0, p1, v2, v1, v3}, Ll/ۘ۠ܿ;->֫(Ll/ۗۜ;IILjava/lang/String;)V

    .line 369
    new-instance p1, Ll/۫᩸ۢ;

    const/4 v1, 0x2

    invoke-direct {p1, v1, p0}, Ll/۫᩸ۢ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, p1}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 393
    invoke-virtual {v0}, Ll/᩸ۖ;->ܿ()V

    return-void
.end method

.method public static synthetic ֫(Ll/ۘ۠ܿ;Ll/ۖۙ᩷;)V
    .locals 3

    .line 212
    iget-object v0, p0, Ll/ۘ۠ܿ;->ܿ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v0

    .line 213
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "dsai"

    invoke-interface {v1, v2}, Ll/۫ۤۡ;->contains(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 214
    new-instance v1, Ll/ۙ᩹ۜ;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p1, p0}, Ll/ۙ᩹ۜ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :cond_0
    const/16 p0, 0x8

    .line 220
    invoke-virtual {v0, p0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public static ֫(Ll/ۘ۠ܿ;Z)V
    .locals 3

    .line 469
    iget-object v0, p0, Ll/ۘ۠ܿ;->֫:Ll/ۗܺ᩷;

    sget v1, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v1, Ll/᩵ۚۢ;

    invoke-direct {v1, v0}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    const v0, 0x7f120491

    .line 470
    invoke-virtual {v1, v0}, Ll/᩵ۚۢ;->ۧ(I)V

    const v0, 0x7f1204b5

    .line 471
    invoke-virtual {v1, v0}, Ll/᩵ۚۢ;->֫(I)V

    new-instance v0, Ll/᩷۫᩷;

    const/4 v2, 0x2

    invoke-direct {v0, v2, p0}, Ll/᩷۫᩷;-><init>(ILjava/lang/Object;)V

    const p0, 0x7f1204b2

    .line 472
    invoke-virtual {v1, p0, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p0, 0x7f12015e

    const/4 v0, 0x0

    .line 486
    invoke-virtual {v1, p0, v0}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    if-eqz p1, :cond_0

    .line 488
    new-instance p0, Ll/᩺֨ܿ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const p1, 0x7f120a78

    invoke-virtual {v1, p1, p0}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 490
    :cond_0
    invoke-virtual {v1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method

.method public static ֫(Ll/ܽۢܳ;Ll/ܶ᩵ܿ;)V
    .locals 4

    .line 136
    invoke-virtual {p0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p0

    .line 137
    new-instance v0, Ll/ۘ۠ܿ;

    .line 122
    sget-object v1, Ll/ܽ֡ܿ;->ܿ:Ll/ܶ᩵ܿ;

    const-string v2, "a.apk"

    invoke-virtual {v1, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    const-string v2, "application/vnd.android.package-archive"

    .line 137
    invoke-static {p0, v1, v2}, Ll/ۛ֨ܿ;->֫(Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ۛ֨ܿ;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ll/ۘ۠ܿ;-><init>(Ll/ۗܺ᩷;Ll/ۛ֨ܿ;)V

    const-string v1, "default"

    .line 138
    iput-object v1, v0, Ll/ۘ۠ܿ;->ܽ:Ljava/lang/String;

    const/4 v1, 0x1

    .line 139
    iput-boolean v1, v0, Ll/ۘ۠ܿ;->᩷:Z

    const v1, 0x7f0a0257

    .line 140
    iget-object v2, v0, Ll/ۘ۠ܿ;->ۧ:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/4 v3, 0x4

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    const v1, 0x7f0a04e6

    .line 141
    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 142
    iget-object v1, v0, Ll/ۘ۠ܿ;->ܿ:Ll/֡ۚۢ;

    const/4 v2, -0x2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v3}, Ll/֡ۚۢ;->֫(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    const/4 v2, -0x3

    .line 143
    invoke-virtual {v1, v2, v3, v3}, Ll/֡ۚۢ;->֫(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 144
    new-instance v1, Ll/֫۠ܿ;

    invoke-direct {v1, p1, p0}, Ll/֫۠ܿ;-><init>(Ll/ܶ᩵ܿ;Lbin/mt/plus/Main;)V

    iput-object v1, v0, Ll/ۘ۠ܿ;->᩻:Ll/ܺ۠ܿ;

    .line 297
    new-instance p0, Ll/ܳ۠ܿ;

    invoke-direct {p0, v0, v3}, Ll/ܳ۠ܿ;-><init>(Ll/ۘ۠ܿ;Ljava/lang/Runnable;)V

    .line 346
    invoke-virtual {p0}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method

.method public static ֫(Ll/ܽۢܳ;Ll/ᩳۜܳ;Z)V
    .locals 5

    .line 78
    invoke-virtual {p0}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ܽ᩷ܳ;->ۧ(Ll/ᩳۜܳ;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 79
    invoke-interface {p1}, Ll/ᩳۜܳ;->۠֫()Ljava/lang/String;

    move-result-object v1

    .line 80
    new-instance v2, Ll/ۘ۠ܿ;

    invoke-virtual {p0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v3

    invoke-virtual {p0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v4

    invoke-static {v4, v0, v1}, Ll/ۛ֨ܿ;->֫(Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ۛ֨ܿ;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Ll/ۘ۠ܿ;-><init>(Ll/ۗܺ᩷;Ll/ۛ֨ܿ;)V

    .line 81
    new-instance v0, Ll/۟֨ܿ;

    invoke-direct {v0, p0, p1}, Ll/۟֨ܿ;-><init>(Ll/ܽۢܳ;Ll/ᩳۜܳ;)V

    iput-object v0, v2, Ll/ۘ۠ܿ;->᩻:Ll/ܺ۠ܿ;

    if-eqz p2, :cond_0

    const-string p0, "built-in"

    .line 129
    iput-object p0, v2, Ll/ۘ۠ܿ;->ܽ:Ljava/lang/String;

    const-string p0, "*/*"

    .line 130
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    iput-boolean p0, v2, Ll/ۘ۠ܿ;->᩷:Z

    .line 297
    :cond_0
    new-instance p0, Ll/ܳ۠ܿ;

    const/4 p1, 0x0

    invoke-direct {p0, v2, p1}, Ll/ܳ۠ܿ;-><init>(Ll/ۘ۠ܿ;Ljava/lang/Runnable;)V

    .line 346
    invoke-virtual {p0}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method

.method public static ۜ(Ll/ۘ۠ܿ;)V
    .locals 13

    .line 430
    iget-object v0, p0, Ll/ۘ۠ܿ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const-string v1, "built-in"

    .line 431
    iget-object v2, p0, Ll/ۘ۠ܿ;->ܽ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 432
    invoke-static {}, Ll/ܿۙ᩷;->ۡ֫()[I

    move-result-object p0

    array-length v1, p0

    :goto_0
    if-ge v2, v1, :cond_6

    aget v3, p0, v2

    .line 433
    new-instance v4, Ll/ۡ۠ܿ;

    invoke-static {v3}, Ll/ۢ֨ܿ;->֫(I)Ll/ۢ֨ܿ;

    move-result-object v3

    .line 586
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 587
    iput-object v3, v4, Ll/ۡ۠ܿ;->ۧ:Ll/ۢ֨ܿ;

    .line 588
    invoke-virtual {v3}, Ll/ۢ֨ܿ;->֫()Ll/᩶ۖܳ;

    move-result-object v5

    .line 248
    iget-object v5, v5, Ll/᩶ۖܳ;->ᩳ:Ll/ۨܺ᩷;

    .line 588
    invoke-virtual {v5}, Ll/ۨܺ᩷;->ۧ()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    iput-object v5, v4, Ll/ۡ۠ܿ;->ܽ:Landroid/graphics/drawable/Drawable;

    .line 589
    invoke-virtual {v3}, Ll/ۢ֨ܿ;->ۧ()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v4, Ll/ۡ۠ܿ;->ᩳ:Ljava/lang/String;

    .line 433
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 436
    :cond_0
    iget-object v1, p0, Ll/ۘ۠ܿ;->ܳ:Ll/ۛ֨ܿ;

    iget-object v2, p0, Ll/ۘ۠ܿ;->ܽ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ll/ۛ֨ܿ;->֫(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 437
    iget-object p0, p0, Ll/ۘ۠ܿ;->֫:Ll/ۗܺ᩷;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    .line 438
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗ֨ܿ;

    .line 439
    new-instance v3, Ll/ۡ۠ܿ;

    .line 592
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 593
    iput-object p0, v3, Ll/ۡ۠ܿ;->ܿ:Landroid/content/pm/PackageManager;

    .line 594
    iput-object v2, v3, Ll/ۡ۠ܿ;->֫:Ll/ۗ֨ܿ;

    .line 595
    invoke-virtual {v2, p0}, Ll/ۗ֨ܿ;->ۧ(Landroid/content/pm/PackageManager;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v3, Ll/ۡ۠ܿ;->ᩳ:Ljava/lang/String;

    .line 596
    new-instance v2, Ll/ۢ۠ܿ;

    invoke-direct {v2, v3}, Ll/ۢ۠ܿ;-><init>(Ll/ۡ۠ܿ;)V

    iput-object v2, v3, Ll/ۡ۠ܿ;->ܳ:Ll/ۢ۠ܿ;

    .line 439
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 446
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p0

    new-array v1, p0, [Z

    const/4 v2, 0x0

    :goto_2
    add-int/lit8 v3, p0, -0x1

    if-ge v2, v3, :cond_6

    .line 448
    aget-boolean v3, v1, v2

    if-eqz v3, :cond_2

    goto :goto_4

    .line 450
    :cond_2
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۡ۠ܿ;

    .line 452
    iget-object v4, v3, Ll/ۡ۠ܿ;->֫:Ll/ۗ֨ܿ;

    invoke-virtual {v4}, Ll/ۗ֨ܿ;->ܿ()Ljava/lang/String;

    move-result-object v4

    add-int/lit8 v5, v2, 0x1

    const/4 v6, 0x0

    :goto_3
    const/16 v7, 0x29

    const-string v8, "\n("

    if-ge v5, p0, :cond_4

    .line 454
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۡ۠ܿ;

    .line 455
    iget-object v10, v9, Ll/ۡ۠ܿ;->ᩳ:Ljava/lang/String;

    iget-object v11, v9, Ll/ۡ۠ܿ;->֫:Ll/ۗ֨ܿ;

    iget-object v12, v3, Ll/ۡ۠ܿ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    .line 456
    invoke-virtual {v11}, Ll/ۗ֨ܿ;->ܿ()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_3

    .line 457
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v10, v9, Ll/ۡ۠ܿ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ll/ۗ֨ܿ;->ܿ()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v9, Ll/ۡ۠ܿ;->ᩳ:Ljava/lang/String;

    const/4 v6, 0x1

    .line 458
    aput-boolean v6, v1, v5

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_4
    if-eqz v6, :cond_5

    .line 464
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v3, Ll/ۡ۠ܿ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v3, Ll/ۡ۠ܿ;->֫:Ll/ۗ֨ܿ;

    invoke-virtual {v5}, Ll/ۗ֨ܿ;->ܿ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Ll/ۡ۠ܿ;->ᩳ:Ljava/lang/String;

    :cond_5
    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_2

    :cond_6
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۘ۠ܿ;)Ll/ۗܺ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘ۠ܿ;->֫:Ll/ۗܺ᩷;

    return-object p0
.end method

.method public static synthetic ۧ(Ll/ۘ۠ܿ;Ll/ۖۙ᩷;)V
    .locals 2

    .line 215
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    const-string v1, "dsai"

    invoke-interface {v0, v1}, Ll/۬ۤۡ;->remove(Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    .line 216
    invoke-virtual {p1}, Ll/ۖۙ᩷;->۬()V

    .line 217
    iget-object p0, p0, Ll/ۘ۠ܿ;->ܿ:Ll/֡ۚۢ;

    invoke-virtual {p0}, Ll/֡ۚۢ;->dismiss()V

    return-void
.end method

.method public static bridge synthetic ܳ(Ll/ۘ۠ܿ;)Ll/ܺ۠ܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘ۠ܿ;->᩻:Ll/ܺ۠ܿ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۘ۠ܿ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘ۠ܿ;->ᩳ:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ۘ۠ܿ;)Ll/ۛ֨ܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘ۠ܿ;->ܳ:Ll/ۛ֨ܿ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۘ۠ܿ;)Ll/֡ۚۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘ۠ܿ;->ܿ:Ll/֡ۚۢ;

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/ۘ۠ܿ;)Ll/ۡۡۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘ۠ܿ;->ۜ:Ll/ۡۡۡ;

    return-object p0
.end method
