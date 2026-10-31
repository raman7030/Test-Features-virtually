.class public final Ll/ۧܶܿ;
.super Ljava/lang/Object;
.source "TA2U"


# static fields
.field public static ܳ:Ll/ܰ۠ܿ;

.field public static ܿ:Ll/֡֡᩷;

.field public static ᩳ:Z

.field public static ᩻:Ljava/util/List;


# instance fields
.field public final ֫:Ll/ۗܺ᩷;

.field public ۧ:Ll/֡ۚۢ;

.field public final ܽ:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Ljava/lang/Runnable;)V
    .locals 2

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    iput-object p1, p0, Ll/ۧܶܿ;->֫:Ll/ۗܺ᩷;

    .line 67
    iput-object p2, p0, Ll/ۧܶܿ;->ܽ:Ljava/lang/Runnable;

    .line 68
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1e

    if-lt p2, v0, :cond_0

    .line 69
    new-instance p2, Ll/ܶ֡ۚ;

    const/4 v0, 0x2

    invoke-direct {p2, v0, p0}, Ll/ܶ֡ۚ;-><init>(ILjava/lang/Object;)V

    .line 824
    invoke-static {}, Ll/۬۠ܿ;->ۤۧ()Ll/ۚۡ֫;

    move-result-object v0

    new-instance v1, Ll/᩹۠ܿ;

    invoke-direct {v1, p1, p2}, Ll/᩹۠ܿ;-><init>(Ll/۬ܺ᩷;Ll/ܶ֡ۚ;)V

    new-instance p2, Ll/ۗ۠ܿ;

    invoke-direct {p2, v1}, Ll/ۗ۠ܿ;-><init>(Ll/᩹۠ܿ;)V

    invoke-virtual {v0, p1, p2}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ֫()Ll/᩺۠ܿ;
    .locals 1

    .line 0
    sget-object v0, Ll/ۧܶܿ;->ܿ:Ll/֡֡᩷;

    return-object v0
.end method

.method public static ֫(Ll/֡֡᩷;)V
    .locals 0

    .line 349
    sput-object p0, Ll/ۧܶܿ;->ܿ:Ll/֡֡᩷;

    return-void
.end method

.method public static synthetic ֫(Ll/ۧܶܿ;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 85
    sput-boolean v0, Ll/ۧܶܿ;->ᩳ:Z

    .line 86
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ll/ۧܶܿ;->᩻:Ljava/util/List;

    .line 87
    invoke-direct {p0, p1}, Ll/ۧܶܿ;->ܽ(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۧܶܿ;Ll/֡ۚۢ;)V
    .locals 1

    .line 180
    iget-object v0, p0, Ll/ۧܶܿ;->ۧ:Ll/֡ۚۢ;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    .line 181
    iput-object p1, p0, Ll/ۧܶܿ;->ۧ:Ll/֡ۚۢ;

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/ۧܶܿ;Ll/ܰ۠ܿ;)V
    .locals 2

    .line 174
    invoke-static {p1}, Ll/ܰ۠ܿ;->֫(Ll/ܰ۠ܿ;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const-string v1, "package"

    invoke-static {v1, p1, v0}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 175
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.DELETE"

    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 176
    iget-object p0, p0, Ll/ۧܶܿ;->֫:Ll/ۗܺ᩷;

    invoke-interface {p0, v0}, Ll/۬ܺ᩷;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static ۧ()Ll/ܰ۠ܿ;
    .locals 8

    .line 324
    sget-object v0, Ll/ۧܶܿ;->ܳ:Ll/ܰ۠ܿ;

    :try_start_0
    const-string v1, "com.google.android.documentsui"

    .line 326
    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/String;)Landroid/content/pm/PackageInfo;

    move-result-object v1

    if-eqz v0, :cond_0

    .line 327
    invoke-static {v0, v1}, Ll/ܰ۠ܿ;->֫(Ll/ܰ۠ܿ;Landroid/content/pm/PackageInfo;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v0

    .line 330
    :cond_0
    invoke-static {v1}, Ll/ܰ۠ܿ;->֫(Landroid/content/pm/PackageInfo;)Ll/ܰ۠ܿ;

    move-result-object v1

    sput-object v1, Ll/ۧܶܿ;->ܳ:Ll/ܰ۠ܿ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    :try_start_1
    const-string v1, "com.android.documentsui"

    .line 335
    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/String;)Landroid/content/pm/PackageInfo;

    move-result-object v1

    if-eqz v0, :cond_1

    .line 336
    invoke-static {v0, v1}, Ll/ܰ۠ܿ;->֫(Ll/ܰ۠ܿ;Landroid/content/pm/PackageInfo;)Z

    move-result v2

    if-eqz v2, :cond_1

    return-object v0

    .line 339
    :cond_1
    invoke-static {v1}, Ll/ܰ۠ܿ;->֫(Landroid/content/pm/PackageInfo;)Ll/ܰ۠ܿ;

    move-result-object v0

    sput-object v0, Ll/ۧܶܿ;->ܳ:Ll/ܰ۠ܿ;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    .line 343
    :catch_1
    new-instance v0, Ll/ܰ۠ܿ;

    const/4 v5, 0x1

    const-wide/16 v6, 0x0

    const-string v2, "com.android.documentsui"

    const/4 v3, 0x0

    const/4 v4, 0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Ll/ܰ۠ܿ;-><init>(Ljava/lang/String;ZZZJ)V

    return-object v0
.end method

.method public static synthetic ۧ(Ll/ۧܶܿ;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 147
    sput-boolean v0, Ll/ۧܶܿ;->ᩳ:Z

    .line 148
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ll/ۧܶܿ;->᩻:Ljava/util/List;

    .line 149
    invoke-direct {p0, p1}, Ll/ۧܶܿ;->ܽ(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic ۧ(Ll/ۧܶܿ;Ll/֡ۚۢ;)V
    .locals 1

    .line 93
    iget-object v0, p0, Ll/ۧܶܿ;->ۧ:Ll/֡ۚۢ;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    .line 94
    iput-object p1, p0, Ll/ۧܶܿ;->ۧ:Ll/֡ۚۢ;

    :cond_0
    return-void
.end method

.method public static ܽ()Ljava/lang/String;
    .locals 1

    :try_start_0
    const-string v0, "com.google.android.documentsui"

    .line 309
    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/String;)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    :try_start_1
    const-string v0, "com.android.documentsui"

    .line 314
    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/String;)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    :catch_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private ܽ(Ljava/lang/String;)V
    .locals 5

    .line 245
    iget-object v0, p0, Ll/ۧܶܿ;->֫:Ll/ۗܺ᩷;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.OPEN_DOCUMENT_TREE"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/16 v2, 0xc3

    .line 246
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 250
    invoke-static {}, Ll/ۧܶܿ;->ܽ()Ljava/lang/String;

    move-result-object v2

    .line 251
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 252
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "primary:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v3, 0x1

    invoke-static {p1, v3}, Ll/ܳܶܿ;->֫(Ljava/lang/String;Z)Landroid/net/Uri;

    move-result-object p1

    const-string v3, "android.provider.extra.INITIAL_URI"

    .line 253
    invoke-virtual {v1, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 255
    :try_start_0
    invoke-interface {v0, v1}, Ll/۬ܺ᩷;->ۧ(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    if-nez v2, :cond_0

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    goto :goto_0

    .line 260
    :cond_0
    invoke-virtual {v0, v2}, Ll/ۗܺ᩷;->֫(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public static synthetic ܽ(Ll/ۧܶܿ;Ll/֡ۚۢ;)V
    .locals 1

    .line 155
    iget-object v0, p0, Ll/ۧܶܿ;->ۧ:Ll/֡ۚۢ;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    .line 156
    iput-object p1, p0, Ll/ۧܶܿ;->ۧ:Ll/֡ۚۢ;

    :cond_0
    return-void
.end method

.method public static ܿ()Z
    .locals 1

    .line 353
    sget-object v0, Ll/ۧܶܿ;->ܿ:Ll/֡֡᩷;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0}, Ll/᩺۠ܿ;->֫()Z

    move-result v0

    return v0
.end method

.method public static synthetic ᩳ(Ll/ۧܶܿ;Ll/֡ۚۢ;)V
    .locals 1

    .line 229
    iget-object v0, p0, Ll/ۧܶܿ;->ۧ:Ll/֡ۚۢ;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    .line 230
    iput-object p1, p0, Ll/ۧܶܿ;->ۧ:Ll/֡ۚۢ;

    :cond_0
    return-void
.end method

.method public static ᩳ()Z
    .locals 2

    .line 46
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 49
    :cond_0
    invoke-static {}, Ll/۟۠ܿ;->֫()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 54
    :cond_1
    invoke-static {}, Ll/᩹᩶ܿ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 55
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v0

    invoke-interface {v0}, Ll/֡᩶ܿ;->֫()Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    const/4 v0, 0x0

    return v0

    :cond_2
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public final ֫(Landroid/net/Uri;)V
    .locals 11

    .line 267
    sget-object v0, Ll/ۧܶܿ;->᩻:Ljava/util/List;

    if-eqz v0, :cond_5

    .line 268
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 271
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 272
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "primary:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v1}, Ll/ܳܶܿ;->֫(Ljava/lang/String;Z)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    .line 273
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    .line 274
    sget-boolean v5, Ll/ۧܶܿ;->ᩳ:Z

    const/4 v6, 0x1

    const/4 v7, 0x3

    iget-object v8, p0, Ll/ۧܶܿ;->ܽ:Ljava/lang/Runnable;

    const v9, 0x7f120426

    const v10, 0x7f120427

    if-eqz v5, :cond_3

    .line 275
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 301
    sget-object v3, Ll/۬۠ܿ;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v3, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    invoke-static {}, Ll/ۙ᩸᩷;->ᩳ()Landroid/content/ContentResolver;

    move-result-object v2

    invoke-virtual {v2, p1, v7}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V

    new-array p1, v6, [Ljava/lang/Object;

    aput-object v4, p1, v1

    .line 277
    invoke-static {v10, p1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    goto :goto_0

    :cond_1
    new-array p1, v6, [Ljava/lang/Object;

    aput-object v4, p1, v1

    .line 279
    invoke-static {v9, p1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩸ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    .line 281
    :goto_0
    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 282
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 283
    invoke-interface {v8}, Ljava/lang/Runnable;->run()V

    return-void

    .line 285
    :cond_2
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, p1}, Ll/ۧܶܿ;->ܽ(Ljava/lang/String;)V

    return-void

    .line 287
    :cond_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v6, :cond_5

    .line 288
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 301
    sget-object v0, Ll/۬۠ܿ;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    invoke-static {}, Ll/ۙ᩸᩷;->ᩳ()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, p1, v7}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V

    .line 290
    invoke-interface {v8}, Ljava/lang/Runnable;->run()V

    new-array p1, v6, [Ljava/lang/Object;

    aput-object v4, p1, v1

    .line 291
    invoke-static {v10, p1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    return-void

    .line 293
    :cond_4
    invoke-virtual {p0, v2}, Ll/ۧܶܿ;->֫(Ljava/lang/String;)V

    new-array p1, v6, [Ljava/lang/Object;

    aput-object v4, p1, v1

    .line 294
    invoke-static {v9, p1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩸ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    :cond_5
    :goto_1
    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 13

    .line 75
    invoke-static {}, Ll/ۧܶܿ;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 78
    :cond_0
    invoke-static {}, Ll/ܿ֡ܿ;->ᩳ()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const v3, 0x7f12015e

    const v4, 0x7f12070a

    const v5, 0x7f120491

    const-string v6, "Android/data"

    const v7, 0x7f120049

    iget-object v8, p0, Ll/ۧܶܿ;->֫:Ll/ۗܺ᩷;

    const-string v9, "xxx"

    if-eqz v0, :cond_1

    .line 79
    invoke-static {v7}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    .line 80
    invoke-virtual {v0, v9, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 81
    invoke-virtual {v8}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v6

    .line 82
    invoke-virtual {v6, v5}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 83
    invoke-virtual {v6, v0}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance v0, Ll/ۜ᩷ᩳ;

    invoke-direct {v0, v1, p0, p1}, Ll/ۜ᩷ᩳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 84
    invoke-virtual {v6, v4, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 89
    invoke-virtual {v6, v3, v2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 90
    invoke-virtual {v6}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p1

    .line 91
    iput-object p1, p0, Ll/ۧܶܿ;->ۧ:Ll/֡ۚۢ;

    .line 92
    new-instance v0, Ll/۫۠ܿ;

    invoke-direct {v0, p0, p1}, Ll/۫۠ܿ;-><init>(Ll/ۧܶܿ;Ll/֡ۚۢ;)V

    invoke-virtual {p1, v0}, Ll/֡ۚۢ;->֫(Landroid/content/DialogInterface$OnDismissListener;)V

    return-void

    .line 99
    :cond_1
    invoke-static {}, Ll/ۧܶܿ;->ۧ()Ll/ܰ۠ܿ;

    move-result-object v0

    .line 100
    invoke-virtual {p1, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    const/4 v10, 0x0

    if-nez v6, :cond_3

    const-string v6, "Android/obb"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_0

    :cond_2
    const/4 v6, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v6, 0x1

    :goto_1
    const/16 v11, 0x21

    if-eqz v6, :cond_7

    .line 102
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ne v12, v11, :cond_6

    .line 103
    invoke-virtual {v0}, Ll/ܰ۠ܿ;->֫()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {v0}, Ll/ܰ۠ܿ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_8

    :cond_4
    const-string v0, "forbid_tip_"

    .line 105
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 106
    sget-object v2, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 107
    sget-object v1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1, v0, v10}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 108
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f12011d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 109
    invoke-static {v0, v9}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_5

    add-int/lit8 v2, v1, 0x3

    .line 111
    invoke-virtual {v0, v1, v2, p1}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const v0, 0x7f120a76

    .line 425
    invoke-virtual {v8, v0, p1, v10}, Ll/ۗܺ᩷;->֫(ILjava/lang/String;Z)V

    return-void

    :cond_6
    const/16 v10, 0x22

    if-lt v12, v10, :cond_7

    goto :goto_2

    .line 0
    :cond_7
    sget-object v10, Ll/۬۠ܿ;->᩺:Ll/᩶۠ܿ;

    invoke-static {p1}, Ll/᩶۠ܿ;->ۧ(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_9

    :cond_8
    :goto_2
    return-void

    .line 125
    :cond_9
    iget-object v10, p0, Ll/ۧܶܿ;->ۧ:Ll/֡ۚۢ;

    if-eqz v10, :cond_a

    invoke-virtual {v10}, Ll/֡ۚۢ;->ۜ()Z

    move-result v10

    if-eqz v10, :cond_a

    .line 126
    iget-object v10, p0, Ll/ۧܶܿ;->ۧ:Ll/֡ۚۢ;

    invoke-virtual {v10}, Ll/֡ۚۢ;->dismiss()V

    .line 129
    :cond_a
    invoke-virtual {v0, v6}, Ll/ܰ۠ܿ;->֫(Z)Z

    move-result v10

    if-nez v10, :cond_c

    .line 131
    invoke-virtual {v0}, Ll/ܰ۠ܿ;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_b

    .line 132
    new-instance v2, Ll/᩻ۚܿ;

    invoke-direct {v2, v1, p0, p1}, Ll/᩻ۚܿ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, p1, v6, v0, v2}, Ll/ۧܶܿ;->֫(Ljava/lang/String;ZLl/ܰ۠ܿ;Ljava/lang/Runnable;)V

    return-void

    .line 134
    :cond_b
    invoke-virtual {p0, p1}, Ll/ۧܶܿ;->ۧ(Ljava/lang/String;)V

    return-void

    .line 138
    :cond_c
    invoke-static {v7}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    .line 139
    invoke-virtual {v0, v9, p1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 140
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ne v6, v11, :cond_d

    const-string v6, "Android 11"

    const-string v7, "Android 13"

    .line 141
    invoke-virtual {v0, v6, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 143
    :cond_d
    invoke-virtual {v8}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v6

    .line 144
    invoke-virtual {v6, v5}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 145
    invoke-virtual {v6, v0}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance v0, Ll/ۡ᩸ܳ;

    invoke-direct {v0, v1, p0, p1}, Ll/ۡ᩸ܳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 146
    invoke-virtual {v6, v4, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 151
    invoke-virtual {v6, v3, v2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 152
    invoke-virtual {v6}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p1

    .line 153
    iput-object p1, p0, Ll/ۧܶܿ;->ۧ:Ll/֡ۚۢ;

    .line 154
    new-instance v0, Ll/ۤ۠ܿ;

    invoke-direct {v0, p0, p1}, Ll/ۤ۠ܿ;-><init>(Ll/ۧܶܿ;Ll/֡ۚۢ;)V

    invoke-virtual {p1, v0}, Ll/֡ۚۢ;->֫(Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;ZLl/ܰ۠ܿ;Ljava/lang/Runnable;)V
    .locals 3

    const v0, 0x7f12004b

    .line 165
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "xxx"

    .line 166
    invoke-virtual {v0, v1, p1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 167
    iget-object v0, p0, Ll/ۧܶܿ;->֫:Ll/ۗܺ᩷;

    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    const v1, 0x7f120491

    .line 168
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 169
    invoke-virtual {v0, p1}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    const p1, 0x7f12070a

    const/4 v1, 0x0

    .line 170
    invoke-virtual {v0, p1, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    .line 171
    invoke-virtual {v0, p1, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 172
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p1

    .line 173
    invoke-virtual {p1}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Ll/ᩳ۠ۢ;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0, p3}, Ll/ᩳ۠ۢ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 178
    iput-object p1, p0, Ll/ۧܶܿ;->ۧ:Ll/֡ۚۢ;

    .line 179
    new-instance p3, Ll/᩷᩶ܳ;

    const/4 v0, 0x1

    invoke-direct {p3, v0, p0, p1}, Ll/᩷᩶ܳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, p3}, Ll/֡ۚۢ;->֫(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 184
    sget-object p3, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ll/ۨ۠ܿ;

    invoke-direct {v0, p1, p2, p4}, Ll/ۨ۠ܿ;-><init>(Ll/֡ۚۢ;ZLjava/lang/Runnable;)V

    invoke-interface {p3, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public final ֫(Ljava/util/LinkedHashSet;)V
    .locals 1

    .line 238
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0, p1}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    sput-object v0, Ll/ۧܶܿ;->᩻:Ljava/util/List;

    const/4 p1, 0x1

    .line 239
    sput-boolean p1, Ll/ۧܶܿ;->ᩳ:Z

    const/4 p1, 0x0

    .line 240
    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, p1}, Ll/ۧܶܿ;->ܽ(Ljava/lang/String;)V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 2

    .line 200
    iget-object v0, p0, Ll/ۧܶܿ;->ۧ:Ll/֡ۚۢ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/֡ۚۢ;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 201
    iget-object v0, p0, Ll/ۧܶܿ;->ۧ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->dismiss()V

    :cond_0
    const v0, 0x7f12004a

    .line 203
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "xxx"

    .line 204
    invoke-virtual {v0, v1, p1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 205
    iget-object v0, p0, Ll/ۧܶܿ;->֫:Ll/ۗܺ᩷;

    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    const v1, 0x7f120a76

    .line 206
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 207
    invoke-virtual {v0, p1}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    const p1, 0x7f120189

    const/4 v1, 0x0

    .line 208
    invoke-virtual {v0, p1, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 210
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p1

    .line 227
    iput-object p1, p0, Ll/ۧܶܿ;->ۧ:Ll/֡ۚۢ;

    .line 228
    new-instance v0, Ll/ۛ۠ܿ;

    invoke-direct {v0, p0, p1}, Ll/ۛ۠ܿ;-><init>(Ll/ۧܶܿ;Ll/֡ۚۢ;)V

    invoke-virtual {p1, v0}, Ll/֡ۚۢ;->֫(Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method
