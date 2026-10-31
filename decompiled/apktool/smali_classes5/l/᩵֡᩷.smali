.class public final Ll/᩵֡᩷;
.super Ll/ۗܺ᩷;
.source "6AY4"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field public static final synthetic ۟ۧ:I


# instance fields
.field public ֡ۧ:I

.field public ֨ۧ:Ll/ۚ᩹᩷;

.field public ۖۧ:Ljava/lang/String;

.field public ۗۧ:I

.field public ۘۧ:Z

.field public ۙۧ:Z

.field public ۚۧ:J

.field public ۛۧ:Ll/۫ۤۧ;

.field public ۜۧ:Landroid/view/View;

.field public final ۠ۧ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final ۡۧ:I

.field public final ۢۧ:Ll/ۡۤۡ;

.field public final ۤۧ:Ljava/util/HashSet;

.field public ۨۧ:I

.field public final ۫ۧ:Ljava/util/HashSet;

.field public ۬ۧ:Ljava/util/List;

.field public ܰۧ:Ll/ܽܽ᩻;

.field public ܳۧ:Ll/ۚ᩵ܳ;

.field public ܶۧ:I

.field public ܺۧ:Landroid/widget/EditText;

.field public ܿۧ:Ll/ۧܶܿ;

.field public ᩳۧ:Ll/۫᩵᩷;

.field public ᩴۧ:Ljava/lang/String;

.field public ᩵ۧ:Ljava/util/List;

.field public ᩶ۧ:Ll/᩻ۡۡ;

.field public ᩷ۧ:Ll/᩵᩷ۡ;

.field public ᩸ۧ:Ljava/util/List;

.field public ᩹ۧ:Ll/ۖۢۡ;

.field public final ᩺ۧ:Ll/ᩳ֡᩷;

.field public ᩻ۧ:Ll/ܳ᩷ۡ;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 95
    invoke-direct {p0}, Ll/ۗܺ᩷;-><init>()V

    .line 97
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/᩵֡᩷;->۫ۧ:Ljava/util/HashSet;

    .line 98
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/᩵֡᩷;->ۤۧ:Ljava/util/HashSet;

    .line 100
    new-instance v0, Ll/ᩳ֡᩷;

    invoke-direct {v0, p0}, Ll/ᩳ֡᩷;-><init>(Ll/᩵֡᩷;)V

    iput-object v0, p0, Ll/᩵֡᩷;->᩺ۧ:Ll/ᩳ֡᩷;

    .line 103
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "fcsp"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ll/᩵֡᩷;->ۗۧ:I

    .line 108
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "fcrp"

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ll/᩵֡᩷;->ۙۧ:Z

    const-string v0, ""

    .line 127
    iput-object v0, p0, Ll/᩵֡᩷;->ۖۧ:Ljava/lang/String;

    const v0, 0x7f12070a

    .line 128
    iput v0, p0, Ll/᩵֡᩷;->ܶۧ:I

    .line 130
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const-string v1, "emptyList(...)"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Ll/᩵֡᩷;->᩸ۧ:Ljava/util/List;

    .line 131
    iput-object v0, p0, Ll/᩵֡᩷;->᩵ۧ:Ljava/util/List;

    const/4 v1, -0x1

    .line 133
    iput v1, p0, Ll/᩵֡᩷;->֡ۧ:I

    .line 137
    sget-object v1, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v3, "fltp"

    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Ll/᩵֡᩷;->ۡۧ:I

    const/4 v1, 0x1

    .line 480
    iput-boolean v1, p0, Ll/᩵֡᩷;->ۘۧ:Z

    .line 505
    iput-object v0, p0, Ll/᩵֡᩷;->۬ۧ:Ljava/util/List;

    .line 613
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ll/᩵֡᩷;->۠ۧ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1039
    invoke-static {}, Ll/ۡۤۡ;->ܳ()Ll/ۡۤۡ;

    move-result-object v0

    iput-object v0, p0, Ll/᩵֡᩷;->ۢۧ:Ll/ۡۤۡ;

    return-void
.end method

.method public static final synthetic ֡(Ll/᩵֡᩷;)I
    .locals 0

    .line 95
    iget p0, p0, Ll/᩵֡᩷;->ۗۧ:I

    return p0
.end method

.method public static final synthetic ֨(Ll/᩵֡᩷;)Ljava/util/HashSet;
    .locals 0

    .line 95
    iget-object p0, p0, Ll/᩵֡᩷;->ۤۧ:Ljava/util/HashSet;

    return-object p0
.end method

.method public static final ֫(Ll/ۗܺ᩷;Ll/᩺᩵᩷;)Ll/ۛ᩵᩷;
    .locals 2

    .line 1499
    new-instance v0, Ll/ۛ᩵᩷;

    new-instance v1, Ll/ۙ᩵᩷;

    invoke-direct {v1, p1}, Ll/ۙ᩵᩷;-><init>(Ll/᩺᩵᩷;)V

    .line 824
    invoke-static {p0, v1}, Ll/۠᩹᩷;->֫(Ll/᩻ܽ;Ll/᩵᩹᩷;)Ll/ۚ᩹᩷;

    move-result-object p0

    .line 1616
    invoke-direct {v0, p0}, Ll/ܶ᩵᩷;-><init>(Ll/ۚ᩹᩷;)V

    return-object v0
.end method

.method public static final ֫(Ll/ۡ᩻֫;Ll/᩺᩵᩷;)Ll/ۛ᩵᩷;
    .locals 2

    .line 1512
    new-instance v0, Ll/ۛ᩵᩷;

    new-instance v1, Ll/᩶᩵᩷;

    invoke-direct {v1, p1}, Ll/᩶᩵᩷;-><init>(Ll/᩺᩵᩷;)V

    invoke-static {p0, v1}, Ll/۠᩹᩷;->֫(Ll/ۡ᩻֫;Ll/᩵᩹᩷;)Ll/ۚ᩹᩷;

    move-result-object p0

    .line 1616
    invoke-direct {v0, p0}, Ll/ܶ᩵᩷;-><init>(Ll/ۚ᩹᩷;)V

    return-object v0
.end method

.method public static final ֫(Ll/᩵ᩳ;Ljava/lang/String;Ll/᩺᩵᩷;)Ll/ۛ᩵᩷;
    .locals 2

    const-string v0, "registry"

    .line 0
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1488
    new-instance v0, Ll/ۛ᩵᩷;

    new-instance v1, Ll/۬ۘ᩷;

    invoke-direct {v1, p2}, Ll/۬ۘ᩷;-><init>(Ljava/lang/Object;)V

    invoke-static {p0, p1, v1}, Ll/۠᩹᩷;->֫(Ll/᩵ᩳ;Ljava/lang/String;Ll/۬ۘ᩷;)Ll/ۚ᩹᩷;

    move-result-object p0

    .line 1616
    invoke-direct {v0, p0}, Ll/ܶ᩵᩷;-><init>(Ll/ۚ᩹᩷;)V

    return-object v0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ll/᩵֡᩷;)Ll/۠۠᩵;
    .locals 1

    .line 473
    iget-object p1, p1, Ll/᩵֡᩷;->᩺ۧ:Ll/ᩳ֡᩷;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "getName(...)"

    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ll/ᩳ֡᩷;->֫(Ljava/lang/String;)V

    .line 474
    sget-object p0, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    return-object p0
.end method

.method public static ֫(Ll/ܽܽ᩻;Ljava/lang/String;Ll/᩵֡᩷;Ljava/lang/String;)Ll/۠۠᩵;
    .locals 1

    .line 1059
    iget-object p0, p0, Ll/ܽ᩷ܳ;->ۜ:Ll/ۧ᩷ܳ;

    iget-object p0, p0, Ll/ۧ᩷ܳ;->֫:Ll/ۖ᩵;

    const/4 v0, 0x0

    .line 369
    invoke-virtual {p0, p1, v0}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 1059
    check-cast p0, Ljava/lang/Integer;

    .line 1060
    iget-object p1, p2, Ll/᩵֡᩷;->᩺ۧ:Ll/ᩳ֡᩷;

    invoke-virtual {p1, p0, p3}, Ll/ᩳ֡᩷;->֫(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 1061
    sget-object p0, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    return-object p0
.end method

.method public static ֫(Ll/᩵֡᩷;Ll/֫᩷ܳ;Ljava/lang/String;)Ll/۠۠᩵;
    .locals 0

    .line 1124
    iget-object p0, p0, Ll/᩵֡᩷;->᩺ۧ:Ll/ᩳ֡᩷;

    iget p1, p1, Ll/֫᩷ܳ;->ᩳ:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Ll/ᩳ֡᩷;->֫(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 1125
    sget-object p0, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    return-object p0
.end method

.method public static ֫(Ll/᩻᩶᩵;Ll/᩵֡᩷;)Ll/۠۠᩵;
    .locals 0

    .line 1293
    iget-object p1, p1, Ll/᩵֡᩷;->᩺ۧ:Ll/ᩳ֡᩷;

    iget-object p0, p0, Ll/᩻᩶᩵;->᩸:Ljava/lang/Object;

    if-nez p0, :cond_0

    const/4 p0, 0x0

    .line 1294
    invoke-virtual {p1, p0}, Ll/ᩳ֡᩷;->֫(I)V

    goto :goto_0

    .line 1296
    :cond_0
    check-cast p0, Ljava/lang/String;

    invoke-virtual {p1, p0}, Ll/ᩳ֡᩷;->֫(Ljava/lang/String;)V

    .line 1298
    :goto_0
    sget-object p0, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    return-object p0
.end method

.method public static final ֫(Ll/ۡ᩻֫;Ll/ۨ᩵᩷;)Ll/۬᩵᩷;
    .locals 2

    .line 1570
    new-instance v0, Ll/۬᩵᩷;

    new-instance v1, Ll/᩸᩵᩷;

    invoke-direct {v1, p1}, Ll/᩸᩵᩷;-><init>(Ll/ۨ᩵᩷;)V

    invoke-static {p0, v1}, Ll/۠᩹᩷;->֫(Ll/ۡ᩻֫;Ll/᩵᩹᩷;)Ll/ۚ᩹᩷;

    move-result-object p0

    .line 1691
    invoke-direct {v0, p0}, Ll/ܶ᩵᩷;-><init>(Ll/ۚ᩹᩷;)V

    return-object v0
.end method

.method private final ֫(Landroid/os/Bundle;)V
    .locals 11

    .line 363
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 369
    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    .line 1425
    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    const-string v2, "android.intent.action.GET_CONTENT"

    invoke-static {v1, v2}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x3

    const-string v4, "getPath(...)"

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "android.intent.extra.ALLOW_MULTIPLE"

    .line 1434
    invoke-virtual {v0, v1, v7}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 370
    :goto_0
    iput v0, p0, Ll/᩵֡᩷;->ۨۧ:I

    const-string v0, "exportSelectFile"

    .line 378
    iput-object v0, p0, Ll/᩵֡᩷;->ᩴۧ:Ljava/lang/String;

    .line 379
    sget-object v0, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    move-object v1, v6

    move-object v2, v1

    const/4 v8, 0x0

    goto :goto_2

    :cond_1
    const-string v1, "type"

    .line 381
    invoke-virtual {v0, v1, v7}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Ll/᩵֡᩷;->ۨۧ:I

    const-string v1, "initFilename"

    .line 382
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "suffixes"

    .line 383
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const-string v8, "customButtonTitle"

    .line 384
    invoke-virtual {v0, v8, v7}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v8

    const-string v9, "initPathKey"

    .line 386
    invoke-virtual {v0, v9}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    iput-object v9, p0, Ll/᩵֡᩷;->ᩴۧ:Ljava/lang/String;

    const-string v9, "initPath"

    .line 387
    invoke-virtual {v0, v9}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    sget-object v0, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 388
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v9

    if-nez v9, :cond_3

    goto :goto_1

    :cond_3
    const-string v9, "/"

    .line 449
    invoke-virtual {v0, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_4

    .line 389
    :goto_1
    sget-object v0, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 392
    :cond_4
    :goto_2
    iget-object v4, p0, Ll/᩵֡᩷;->ᩴۧ:Ljava/lang/String;

    if-eqz v4, :cond_5

    .line 393
    sget-object v9, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v9, v4, v0}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "getString(...)"

    invoke-static {v0, v4}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_5
    if-eqz p1, :cond_7

    const-string v4, "visitorData"

    .line 395
    invoke-virtual {p1, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_6

    goto :goto_3

    .line 402
    :cond_6
    new-instance v0, Ll/ܽܽ᩻;

    new-instance v9, Ll/۬ۜܽ;

    invoke-virtual {p1, v4}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object p1

    invoke-direct {v9, p1}, Ll/۬ۜܽ;-><init>([B)V

    invoke-direct {v0, v9}, Ll/ܽܽ᩻;-><init>(Ll/۬ۜܽ;)V

    goto :goto_4

    :cond_7
    :goto_3
    new-array p1, v7, [Ljava/lang/String;

    .line 396
    invoke-static {v0, p1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 397
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v4

    if-eqz v4, :cond_8

    .line 398
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۡ֫()Ljava/lang/String;

    move-result-object v0

    .line 400
    :cond_8
    new-instance p1, Ll/ܽܽ᩻;

    invoke-direct {p1, v0}, Ll/ܽܽ᩻;-><init>(Ljava/lang/String;)V

    move-object v0, p1

    .line 395
    :goto_4
    iput-object v0, p0, Ll/᩵֡᩷;->ܰۧ:Ll/ܽܽ᩻;

    .line 403
    invoke-direct {p0}, Ll/᩵֡᩷;->ܿ֫()V

    const-string p1, "filenameEditText"

    if-eqz v1, :cond_a

    .line 406
    iget-object v0, p0, Ll/᩵֡᩷;->ܺۧ:Landroid/widget/EditText;

    if-eqz v0, :cond_9

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    :cond_9
    invoke-static {p1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v6

    :cond_a
    :goto_5
    if-eqz v2, :cond_c

    .line 14060
    array-length v0, v2

    const/4 v1, 0x0

    :goto_6
    if-ge v1, v0, :cond_c

    aget-object v4, v2, v1

    const-string v9, "<this>"

    .line 1196
    invoke-static {v4, v9}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x2e

    .line 1126
    invoke-virtual {v4, v9, v7}, Ljava/lang/String;->indexOf(II)I

    move-result v9

    const-string v10, "toLowerCase(...)"

    if-ltz v9, :cond_b

    .line 410
    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v10}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "."

    invoke-virtual {v9, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v9, p0, Ll/᩵֡᩷;->ۤۧ:Ljava/util/HashSet;

    invoke-virtual {v9, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 412
    :cond_b
    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v10}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v9, p0, Ll/᩵֡᩷;->۫ۧ:Ljava/util/HashSet;

    invoke-virtual {v9, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :goto_7
    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    .line 416
    :cond_c
    iget v0, p0, Ll/᩵֡᩷;->ۨۧ:I

    const/4 v1, 0x2

    const v2, 0x7f0a0152

    const/16 v4, 0x8

    const v9, 0x7f0a00a4

    if-eqz v0, :cond_14

    if-eq v0, v5, :cond_11

    if-eq v0, v1, :cond_10

    if-eq v0, v3, :cond_d

    goto/16 :goto_9

    .line 435
    :cond_d
    invoke-virtual {p0, v9}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 436
    invoke-virtual {p0, v2}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 437
    iget-object v0, p0, Ll/᩵֡᩷;->ܺۧ:Landroid/widget/EditText;

    if-eqz v0, :cond_f

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 438
    invoke-virtual {p0, v9}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 142
    sget v0, Ll/᩹֡᩷;->ܿ:I

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    if-eqz v8, :cond_e

    goto :goto_8

    :cond_e
    const v8, 0x7f12070a

    .line 440
    :goto_8
    iput v8, p0, Ll/᩵֡᩷;->ܶۧ:I

    .line 442
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 443
    invoke-direct {p0}, Ll/᩵֡᩷;->ܳ֫()V

    goto/16 :goto_9

    .line 437
    :cond_f
    invoke-static {p1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v6

    :cond_10
    const p1, 0x7f0a00a5

    .line 447
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f0a05e2

    .line 448
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 449
    invoke-virtual {p0, v2}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 450
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 142
    sget v0, Ll/᩹֡᩷;->ܿ:I

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 452
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-eqz v8, :cond_15

    .line 454
    invoke-virtual {p1, v8}, Landroid/widget/TextView;->setText(I)V

    goto :goto_9

    .line 430
    :cond_11
    iget-object v0, p0, Ll/᩵֡᩷;->ܺۧ:Landroid/widget/EditText;

    if-eqz v0, :cond_13

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 431
    iget-object p1, p0, Ll/᩵֡᩷;->ۜۧ:Landroid/view/View;

    if-eqz p1, :cond_12

    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    goto :goto_9

    :cond_12
    const-string p1, "bottomSpace"

    invoke-static {p1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v6

    .line 430
    :cond_13
    invoke-static {p1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v6

    .line 418
    :cond_14
    invoke-virtual {p0, v9}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 419
    invoke-virtual {p0, v2}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 420
    iget-object v0, p0, Ll/᩵֡᩷;->ܺۧ:Landroid/widget/EditText;

    if-eqz v0, :cond_16

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 421
    invoke-virtual {p0, v9}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 142
    sget v0, Ll/᩹֡᩷;->ܿ:I

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 423
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-eqz v8, :cond_15

    .line 425
    invoke-virtual {p1, v8}, Landroid/widget/TextView;->setText(I)V

    .line 458
    :cond_15
    :goto_9
    iget-object p1, p0, Ll/᩵֡᩷;->᩺ۧ:Ll/ᩳ֡᩷;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2008
    new-instance v0, Ljava/lang/Thread;

    .line 2077
    iget-object v2, p1, Ll/ᩳ֡᩷;->᩻:Ll/᩵֡᩷;

    new-instance v3, Ll/ۜ۠᩷;

    const/4 v4, 0x1

    invoke-direct {v3, v4, v2, p1}, Ll/ۜ۠᩷;-><init>(ILl/ۗܺ᩷;Ljava/lang/Object;)V

    .line 2008
    invoke-direct {v0, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 2077
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 610
    invoke-static {p0, v7, v6, v1}, Ll/᩵֡᩷;->֫(Ll/᩵֡᩷;ZLl/֫᩹᩵;I)V

    .line 460
    new-instance p1, Ll/ۚ᩵ܳ;

    new-instance v0, Ll/᩷᩵᩷;

    invoke-direct {v0, p0}, Ll/᩷᩵᩷;-><init>(Ll/᩵֡᩷;)V

    invoke-direct {p1, p0, v0}, Ll/ۚ᩵ܳ;-><init>(Ll/᩵֡᩷;Ll/᩷᩵᩷;)V

    iput-object p1, p0, Ll/᩵֡᩷;->ܳۧ:Ll/ۚ᩵ܳ;

    return-void

    .line 420
    :cond_16
    invoke-static {p1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v6
.end method

.method public static ֫(Landroid/view/MenuItem;Ll/᩶ۖܳ;)V
    .locals 1

    const-string v0, "typeIcon"

    .line 6
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 537
    iget-object p1, p1, Ll/᩶ۖܳ;->ۧ:Ll/ۨܺ᩷;

    invoke-virtual {p1}, Ll/ۨܺ᩷;->ۧ()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-interface {p0, p1}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    return-void
.end method

.method public static final ֫(Landroid/widget/TextView;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1180
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1181
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method private final ֫(Ljava/lang/String;Ll/֫᩹᩵;)V
    .locals 4

    .line 1278
    iget-object v0, p0, Ll/᩵֡᩷;->ܰۧ:Ll/ܽܽ᩻;

    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    .line 1279
    iget-object v1, v0, Ll/ܽ᩷ܳ;->ۜ:Ll/ۧ᩷ܳ;

    invoke-direct {p0}, Ll/᩵֡᩷;->֫֫()Ll/֫᩷ܳ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۧ᩷ܳ;->ܽ(Ll/֫᩷ܳ;)V

    .line 817
    invoke-direct {p0}, Ll/᩵֡᩷;->ܽ֫()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 820
    :cond_0
    invoke-direct {p0}, Ll/᩵֡᩷;->ܰ()Z

    .line 821
    invoke-direct {p0}, Ll/᩵֡᩷;->ܳ֫()V

    .line 1282
    :goto_0
    new-instance v1, Ll/᩻᩶᩵;

    .line 13
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, "/"

    const/4 v3, 0x0

    .line 486
    invoke-static {p1, v2, v3}, Ll/ۗۙ᩵;->֫(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_1

    .line 1283
    invoke-virtual {v0, p1}, Ll/ܽܽ᩻;->ۧ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1284
    invoke-static {p1}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Ll/᩻᩶᩵;->᩸:Ljava/lang/Object;

    .line 1285
    invoke-static {p1}, Ll/ۢۤۡ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "getParent(...)"

    invoke-static {p1, v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1287
    :cond_1
    invoke-virtual {v0, p1}, Ll/ܽܽ᩻;->ܿ(Ljava/lang/String;)V

    .line 1288
    iget-object p1, p0, Ll/᩵֡᩷;->᩶ۧ:Ll/᩻ۡۡ;

    const/4 v0, 0x0

    const-string v2, "searchView"

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ll/᩻ۡۡ;->ܿ()Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, ""

    .line 1289
    iput-object p1, p0, Ll/᩵֡᩷;->ۖۧ:Ljava/lang/String;

    .line 1290
    iget-object p1, p0, Ll/᩵֡᩷;->᩶ۧ:Ll/᩻ۡۡ;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ll/᩻ۡۡ;->ᩳ()V

    goto :goto_1

    :cond_2
    invoke-static {v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    if-nez p2, :cond_4

    .line 1292
    new-instance p2, Ll/ܽ᩵᩷;

    invoke-direct {p2, v1, p0}, Ll/ܽ᩵᩷;-><init>(Ll/᩻᩶᩵;Ll/᩵֡᩷;)V

    :cond_4
    const/4 p1, 0x2

    const/4 v0, 0x1

    invoke-static {p0, v0, p2, p1}, Ll/᩵֡᩷;->֫(Ll/᩵֡᩷;ZLl/֫᩹᩵;I)V

    .line 1299
    invoke-direct {p0}, Ll/᩵֡᩷;->ܿ֫()V

    return-void

    .line 1288
    :cond_5
    invoke-static {v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ll/ۡۤۡ;Ll/᩵֡᩷;Ll/᩵᩷ۡ;)V
    .locals 11

    .line 230
    iget-object v0, p1, Ll/᩵֡᩷;->᩺ۧ:Ll/ᩳ֡᩷;

    invoke-virtual {p0}, Ll/ۡۤۡ;->ܽ()Z

    move-result p0

    if-eqz p0, :cond_0

    goto/16 :goto_a

    .line 1029
    :cond_0
    invoke-direct {p1}, Ll/᩵֡᩷;->ܽ֫()Z

    move-result p0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p0, :cond_1

    invoke-direct {p1}, Ll/᩵֡᩷;->ۧ֫()I

    move-result p0

    if-lez p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    const/4 v3, 0x4

    const/4 v4, 0x2

    if-eqz p0, :cond_11

    .line 232
    invoke-virtual {p2}, Ll/᩵᩷ۡ;->ᩳ()I

    move-result p0

    if-eqz p0, :cond_e

    if-eq p0, v1, :cond_b

    if-eq p0, v4, :cond_9

    const/4 p2, 0x3

    if-eq p0, p2, :cond_3

    if-eq p0, v3, :cond_2

    goto/16 :goto_a

    :cond_2
    const p0, 0x7f120912

    const p2, 0x7f120915

    .line 415
    invoke-virtual {p1, p0, p2, v2}, Ll/ۗܺ᩷;->֫(IIZ)V

    return-void

    .line 887
    :cond_3
    new-instance p0, Ljava/util/HashSet;

    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 888
    iget-object p2, p1, Ll/᩵֡᩷;->᩵ۧ:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_4
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const-string v4, "getName(...)"

    if-eqz v3, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۜܳ;

    .line 760
    invoke-interface {v3}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 889
    invoke-interface {v3}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 890
    invoke-interface {v3}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Ll/ۗ᩵᩷;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 893
    :cond_5
    invoke-virtual {p0}, Ljava/util/HashSet;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_6

    goto/16 :goto_a

    .line 897
    :cond_6
    iget-object p2, p1, Ll/᩵֡᩷;->᩵ۧ:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v3, 0x0

    :cond_7
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳۜܳ;

    .line 760
    invoke-interface {v5}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v6

    if-eqz v6, :cond_7

    .line 900
    invoke-interface {v5}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v6

    if-nez v6, :cond_7

    .line 901
    invoke-interface {v5}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v4}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6}, Ll/ۗ᩵᩷;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    .line 903
    invoke-interface {v5, v1}, Ll/ᩳۜܳ;->setChecked(Z)V

    const/4 v3, 0x1

    goto :goto_2

    .line 907
    :cond_8
    invoke-direct {p1}, Ll/᩵֡᩷;->ܳ֫()V

    if-eqz v3, :cond_24

    .line 909
    invoke-virtual {v0, v2}, Ll/ᩳ֡᩷;->֫(Z)V

    return-void

    .line 825
    :cond_9
    invoke-direct {p1}, Ll/᩵֡᩷;->ܽ֫()Z

    move-result p0

    if-nez p0, :cond_a

    goto/16 :goto_a

    .line 828
    :cond_a
    invoke-direct {p1}, Ll/᩵֡᩷;->ܰ()Z

    move-result p0

    .line 829
    invoke-direct {p1}, Ll/᩵֡᩷;->ܳ֫()V

    if-eqz p0, :cond_24

    .line 831
    invoke-virtual {v0, v2}, Ll/ᩳ֡᩷;->֫(Z)V

    return-void

    .line 851
    :cond_b
    iget-object p0, p1, Ll/᩵֡᩷;->᩵ۧ:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 p2, 0x0

    :cond_c
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۜܳ;

    .line 760
    invoke-interface {v3}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v4

    if-eqz v4, :cond_c

    .line 853
    invoke-interface {v3}, Ll/ᩳۜܳ;->isChecked()Z

    move-result p2

    xor-int/2addr p2, v1

    invoke-interface {v3, p2}, Ll/ᩳۜܳ;->setChecked(Z)V

    const/4 p2, 0x1

    goto :goto_3

    .line 857
    :cond_d
    invoke-direct {p1}, Ll/᩵֡᩷;->ܳ֫()V

    if-eqz p2, :cond_24

    .line 859
    invoke-virtual {v0, v2}, Ll/ᩳ֡᩷;->֫(Z)V

    return-void

    .line 837
    :cond_e
    iget-object p0, p1, Ll/᩵֡᩷;->᩵ۧ:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 p2, 0x0

    :cond_f
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۜܳ;

    .line 760
    invoke-interface {v3}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v4

    if-eqz v4, :cond_f

    .line 838
    invoke-interface {v3}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v4

    if-nez v4, :cond_f

    .line 839
    invoke-interface {v3, v1}, Ll/ᩳۜܳ;->setChecked(Z)V

    const/4 p2, 0x1

    goto :goto_4

    .line 843
    :cond_10
    invoke-direct {p1}, Ll/᩵֡᩷;->ܳ֫()V

    if-eqz p2, :cond_24

    .line 845
    invoke-virtual {v0, v2}, Ll/ᩳ֡᩷;->֫(Z)V

    return-void

    .line 244
    :cond_11
    invoke-virtual {p2}, Ll/᩵᩷ۡ;->ᩳ()I

    move-result p0

    const-string p2, "swipeRefreshLayout"

    const-string v0, ""

    const-string v5, "filterText"

    const-string v6, "searchView"

    const/4 v7, 0x0

    if-eqz p0, :cond_22

    if-eq p0, v1, :cond_16

    if-eq p0, v4, :cond_13

    if-eq p0, v3, :cond_12

    goto/16 :goto_a

    .line 248
    :cond_12
    invoke-direct {p1}, Ll/᩵֡᩷;->ۨ()V

    return-void

    :cond_13
    const p0, 0x7f0d00a0

    .line 1167
    invoke-virtual {p1, p0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object p0

    const p2, 0x7f0a017d

    .line 1168
    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Ll/ۤۤᩳ;

    const v0, 0x7f0a0199

    .line 1169
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1170
    new-instance v3, Ll/ܿ֡᩷;

    invoke-direct {v3, v0}, Ll/ܿ֡᩷;-><init>(Landroid/widget/TextView;)V

    invoke-virtual {p2, v3}, Ll/۫ۨᩳ;->֫(Landroid/text/TextWatcher;)V

    .line 1184
    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v3

    invoke-virtual {v3, p0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    invoke-virtual {v3, v2}, Ll/᩵ۚۢ;->֫(Z)V

    .line 1186
    iget v2, p1, Ll/᩵֡᩷;->ۨۧ:I

    if-eqz v2, :cond_14

    goto :goto_5

    :cond_14
    const/4 v1, 0x0

    :goto_5
    const v2, 0x7f12015e

    const v4, 0x7f0a0631

    if-eqz v1, :cond_15

    .line 1188
    invoke-virtual {p0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    const v4, 0x7f120203

    invoke-virtual {p0, v4}, Landroid/widget/TextView;->setText(I)V

    const p0, 0x7f1203fb

    .line 1189
    invoke-virtual {v3, p0, v7}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p0, 0x7f120393

    .line 1190
    invoke-virtual {v3, p0, v7}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 1191
    invoke-virtual {v3, v2, v7}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    goto :goto_6

    .line 1193
    :cond_15
    invoke-virtual {p0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    const v4, 0x7f1203b9

    invoke-virtual {p0, v4}, Landroid/widget/TextView;->setText(I)V

    const p0, 0x7f12070a

    .line 1194
    invoke-virtual {v3, p0, v7}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 1195
    invoke-virtual {v3, v2, v7}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 1197
    :goto_6
    invoke-virtual {v3}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p0

    .line 1198
    invoke-static {p0}, Ll/ۚۗܿ;->֫(Ll/֡ۚۢ;)V

    .line 1199
    invoke-static {p2}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    .line 1200
    invoke-virtual {p0}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v2

    new-instance v3, Ll/ܿ᩵᩷;

    invoke-direct {v3, p2, p1, p0, v0}, Ll/ܿ᩵᩷;-><init>(Ll/ۤۤᩳ;Ll/᩵֡᩷;Ll/֡ۚۢ;Landroid/widget/TextView;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-eqz v1, :cond_24

    .line 1235
    invoke-virtual {p0}, Ll/֡ۚۢ;->ܽ()Landroid/widget/Button;

    move-result-object v1

    new-instance v2, Ll/ܳ᩵᩷;

    invoke-direct {v2, p2, p1, p0, v0}, Ll/ܳ᩵᩷;-><init>(Ll/ۤۤᩳ;Ll/᩵֡᩷;Ll/֡ۚۢ;Landroid/widget/TextView;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    .line 1137
    :cond_16
    iget-object p0, p1, Ll/᩵֡᩷;->ۛۧ:Ll/۫ۤۧ;

    if-eqz p0, :cond_21

    invoke-virtual {p0}, Ll/۫ۤۧ;->ۧ()Z

    move-result p0

    if-eqz p0, :cond_17

    goto/16 :goto_a

    .line 1140
    :cond_17
    iget-object p0, p1, Ll/᩵֡᩷;->ܰۧ:Ll/ܽܽ᩻;

    if-nez p0, :cond_18

    goto/16 :goto_a

    .line 1141
    :cond_18
    iget-object p2, p0, Ll/ܽ᩷ܳ;->ۜ:Ll/ۧ᩷ܳ;

    invoke-direct {p1}, Ll/᩵֡᩷;->֫֫()Ll/֫᩷ܳ;

    move-result-object v3

    invoke-virtual {p2, v3}, Ll/ۧ᩷ܳ;->ۧ(Ll/֫᩷ܳ;)Ll/֫᩷ܳ;

    move-result-object p2

    .line 1142
    invoke-virtual {p0}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object v3

    .line 817
    invoke-direct {p1}, Ll/᩵֡᩷;->ܽ֫()Z

    move-result v8

    if-nez v8, :cond_19

    goto :goto_7

    .line 820
    :cond_19
    invoke-direct {p1}, Ll/᩵֡᩷;->ܰ()Z

    .line 821
    invoke-direct {p1}, Ll/᩵֡᩷;->ܳ֫()V

    .line 1144
    :goto_7
    iget-object v8, p2, Ll/֫᩷ܳ;->ܽ:Ljava/lang/String;

    iget-object v9, p2, Ll/֫᩷ܳ;->ۧ:Ljava/lang/String;

    invoke-virtual {p0, v8}, Ll/ܽܽ᩻;->ܿ(Ljava/lang/String;)V

    .line 1145
    invoke-virtual {p0}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object p0

    .line 1147
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v8

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v10

    if-le v8, v10, :cond_1a

    invoke-static {v3}, Ll/ۢۤۡ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 169
    invoke-virtual {p0, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1a

    .line 1148
    invoke-static {v3}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_8

    :cond_1a
    move-object p0, v7

    .line 1152
    :goto_8
    iget-boolean v3, p2, Ll/֫᩷ܳ;->֫:Z

    if-eqz v3, :cond_1d

    .line 1153
    iget-object v0, p1, Ll/᩵֡᩷;->᩶ۧ:Ll/᩻ۡۡ;

    if-eqz v0, :cond_1c

    .line 242
    invoke-virtual {v0, v9}, Ll/᩻ۡۡ;->֫(Ljava/lang/String;)V

    .line 1154
    iget-object v0, p1, Ll/᩵֡᩷;->᩶ۧ:Ll/᩻ۡۡ;

    if-eqz v0, :cond_1b

    invoke-virtual {v0, v2}, Ll/᩻ۡۡ;->ۧ(Z)V

    .line 1155
    invoke-static {v9, v5}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v9, p1, Ll/᩵֡᩷;->ۖۧ:Ljava/lang/String;

    goto :goto_9

    .line 1154
    :cond_1b
    invoke-static {v6}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v7

    .line 1153
    :cond_1c
    invoke-static {v6}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v7

    .line 1156
    :cond_1d
    iget-object v2, p1, Ll/᩵֡᩷;->᩶ۧ:Ll/᩻ۡۡ;

    if-eqz v2, :cond_20

    invoke-virtual {v2}, Ll/᩻ۡۡ;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_1f

    .line 1157
    iput-object v0, p1, Ll/᩵֡᩷;->ۖۧ:Ljava/lang/String;

    .line 1158
    iget-object v0, p1, Ll/᩵֡᩷;->᩶ۧ:Ll/᩻ۡۡ;

    if-eqz v0, :cond_1e

    invoke-virtual {v0}, Ll/᩻ۡۡ;->ᩳ()V

    goto :goto_9

    :cond_1e
    invoke-static {v6}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v7

    .line 1160
    :cond_1f
    :goto_9
    new-instance v0, Ll/ᩳ᩵᩷;

    invoke-direct {v0, p1, p2, p0}, Ll/ᩳ᩵᩷;-><init>(Ll/᩵֡᩷;Ll/֫᩷ܳ;Ljava/lang/String;)V

    invoke-static {p1, v1, v0, v4}, Ll/᩵֡᩷;->֫(Ll/᩵֡᩷;ZLl/֫᩹᩵;I)V

    .line 1163
    invoke-direct {p1}, Ll/᩵֡᩷;->ܿ֫()V

    return-void

    .line 1156
    :cond_20
    invoke-static {v6}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v7

    .line 1137
    :cond_21
    invoke-static {p2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v7

    .line 1100
    :cond_22
    iget-object p0, p1, Ll/᩵֡᩷;->ۛۧ:Ll/۫ۤۧ;

    if-eqz p0, :cond_2e

    invoke-virtual {p0}, Ll/۫ۤۧ;->ۧ()Z

    move-result p0

    if-eqz p0, :cond_23

    goto :goto_a

    .line 1103
    :cond_23
    iget-object p0, p1, Ll/᩵֡᩷;->ܰۧ:Ll/ܽܽ᩻;

    if-nez p0, :cond_25

    :cond_24
    :goto_a
    return-void

    .line 1104
    :cond_25
    iget-object p2, p0, Ll/ܽ᩷ܳ;->ۜ:Ll/ۧ᩷ܳ;

    invoke-direct {p1}, Ll/᩵֡᩷;->֫֫()Ll/֫᩷ܳ;

    move-result-object v3

    invoke-virtual {p2, v3}, Ll/ۧ᩷ܳ;->֫(Ll/֫᩷ܳ;)Ll/֫᩷ܳ;

    move-result-object p2

    .line 1105
    invoke-virtual {p0}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object v3

    .line 817
    invoke-direct {p1}, Ll/᩵֡᩷;->ܽ֫()Z

    move-result v8

    if-nez v8, :cond_26

    goto :goto_b

    .line 820
    :cond_26
    invoke-direct {p1}, Ll/᩵֡᩷;->ܰ()Z

    .line 821
    invoke-direct {p1}, Ll/᩵֡᩷;->ܳ֫()V

    .line 1107
    :goto_b
    iget-object v8, p2, Ll/֫᩷ܳ;->ܽ:Ljava/lang/String;

    iget-object v9, p2, Ll/֫᩷ܳ;->ۧ:Ljava/lang/String;

    invoke-virtual {p0, v8}, Ll/ܽܽ᩻;->ܿ(Ljava/lang/String;)V

    .line 1108
    invoke-virtual {p0}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object p0

    .line 1110
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v8

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v10

    if-le v8, v10, :cond_27

    invoke-static {v3}, Ll/ۢۤۡ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 169
    invoke-virtual {p0, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_27

    .line 1111
    invoke-static {v3}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_c

    :cond_27
    move-object p0, v7

    .line 1115
    :goto_c
    iget-boolean v3, p2, Ll/֫᩷ܳ;->֫:Z

    if-eqz v3, :cond_2a

    .line 1116
    iget-object v0, p1, Ll/᩵֡᩷;->᩶ۧ:Ll/᩻ۡۡ;

    if-eqz v0, :cond_29

    .line 242
    invoke-virtual {v0, v9}, Ll/᩻ۡۡ;->֫(Ljava/lang/String;)V

    .line 1117
    iget-object v0, p1, Ll/᩵֡᩷;->᩶ۧ:Ll/᩻ۡۡ;

    if-eqz v0, :cond_28

    invoke-virtual {v0, v2}, Ll/᩻ۡۡ;->ۧ(Z)V

    .line 1118
    invoke-static {v9, v5}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v9, p1, Ll/᩵֡᩷;->ۖۧ:Ljava/lang/String;

    goto :goto_d

    .line 1117
    :cond_28
    invoke-static {v6}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v7

    .line 1116
    :cond_29
    invoke-static {v6}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v7

    .line 1119
    :cond_2a
    iget-object v2, p1, Ll/᩵֡᩷;->᩶ۧ:Ll/᩻ۡۡ;

    if-eqz v2, :cond_2d

    invoke-virtual {v2}, Ll/᩻ۡۡ;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_2c

    .line 1120
    iput-object v0, p1, Ll/᩵֡᩷;->ۖۧ:Ljava/lang/String;

    .line 1121
    iget-object v0, p1, Ll/᩵֡᩷;->᩶ۧ:Ll/᩻ۡۡ;

    if-eqz v0, :cond_2b

    invoke-virtual {v0}, Ll/᩻ۡۡ;->ᩳ()V

    goto :goto_d

    :cond_2b
    invoke-static {v6}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v7

    .line 1123
    :cond_2c
    :goto_d
    new-instance v0, Ll/᩻᩵᩷;

    invoke-direct {v0, p1, p2, p0}, Ll/᩻᩵᩷;-><init>(Ll/᩵֡᩷;Ll/֫᩷ܳ;Ljava/lang/String;)V

    invoke-static {p1, v1, v0, v4}, Ll/᩵֡᩷;->֫(Ll/᩵֡᩷;ZLl/֫᩹᩵;I)V

    .line 1126
    invoke-direct {p1}, Ll/᩵֡᩷;->ܿ֫()V

    return-void

    .line 1119
    :cond_2d
    invoke-static {v6}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v7

    .line 1100
    :cond_2e
    invoke-static {p2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v7
.end method

.method public static ֫(Ll/ۤۤᩳ;Ll/᩵֡᩷;Ll/֡ۚۢ;Landroid/widget/TextView;)V
    .locals 5

    const-string v0, "Failed to create file: "

    .line 1236
    invoke-virtual {p0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "\\"

    const/4 v2, 0x0

    .line 1182
    invoke-static {p0, v1, v2}, Ll/ۗۙ᩵;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "/"

    invoke-static {p0, v1, v2}, Ll/ۗۙ᩵;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 1241
    :cond_0
    iget-object v1, p1, Ll/᩵֡᩷;->ܰۧ:Ll/ܽܽ᩻;

    invoke-static {v1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object v1

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 1242
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 1243
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result p0

    if-eqz p0, :cond_1

    const p0, 0x7f1208c2

    .line 1244
    invoke-static {p3, p0}, Ll/᩵֡᩷;->֫(Landroid/widget/TextView;I)V

    return-void

    :cond_1
    const p0, 0x7f1203a1

    .line 1246
    invoke-static {p3, p0}, Ll/᩵֡᩷;->֫(Landroid/widget/TextView;I)V

    return-void

    :cond_2
    const/4 p3, 0x0

    .line 1252
    :try_start_0
    iget-object v3, p1, Ll/᩵֡᩷;->ܰۧ:Ll/ܽܽ᩻;

    invoke-static {v3}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ll/ܽܽ᩻;->᩸()Ljava/lang/String;

    move-result-object v3

    .line 1253
    sget-object v4, Ll/ܽ֨ۢ;->ۗ:Ll/ܽ֨ۢ;

    .line 1251
    invoke-static {v3, v4}, Ll/ᩳ֨ۢ;->֫(Ljava/lang/String;Ll/ܽ֨ۢ;)V
    :try_end_0
    .catch Ll/֫ۛۡ; {:try_start_0 .. :try_end_0} :catch_1

    .line 1260
    :try_start_1
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۗ()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 1263
    new-instance p0, Ll/ۡ᩵᩷;

    invoke-direct {p0, v1, p1}, Ll/ۡ᩵᩷;-><init>(Ll/ܶ᩵ܿ;Ll/᩵֡᩷;)V

    const/4 v0, 0x2

    .line 610
    invoke-static {p1, v2, p0, v0}, Ll/᩵֡᩷;->֫(Ll/᩵֡᩷;ZLl/֫᩹᩵;I)V

    .line 1266
    invoke-virtual {p2}, Ll/֡ۚۢ;->dismiss()V

    return-void

    .line 1261
    :cond_3
    new-instance p2, Ljava/lang/Exception;

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    .line 546
    :goto_0
    invoke-virtual {p1, p0, p3}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void

    :cond_4
    :goto_1
    const p0, 0x7f1203ae

    .line 1238
    invoke-static {p3, p0}, Ll/᩵֡᩷;->֫(Landroid/widget/TextView;I)V

    return-void
.end method

.method public static ֫(Ll/۬۬ܿ;Ll/᩵֡᩷;Landroid/os/Bundle;)V
    .locals 0

    .line 355
    invoke-virtual {p0}, Ll/۬۬ܿ;->֫()V

    .line 356
    invoke-direct {p1, p2}, Ll/᩵֡᩷;->֫(Landroid/os/Bundle;)V

    return-void
.end method

.method public static ֫(Ll/᩵֡᩷;)V
    .locals 9

    .line 186
    iget v0, p0, Ll/᩵֡᩷;->֡ۧ:I

    .line 187
    iget-wide v1, p0, Ll/᩵֡᩷;->ۚۧ:J

    const/4 v3, -0x1

    if-eq v0, v3, :cond_6

    const-wide/16 v4, 0x0

    cmp-long v6, v1, v4

    if-nez v6, :cond_0

    goto :goto_1

    .line 191
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    cmp-long v8, v6, v1

    if-lez v8, :cond_1

    .line 192
    iput-wide v4, p0, Ll/᩵֡᩷;->ۚۧ:J

    return-void

    .line 195
    :cond_1
    iget-object v1, p0, Ll/᩵֡᩷;->᩹ۧ:Ll/ۖۢۡ;

    const/4 v2, 0x0

    const-string v4, "recyclerView"

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ll/ۖۢۡ;->֫()I

    move-result v1

    if-lt v0, v1, :cond_3

    .line 196
    iget-object v1, p0, Ll/᩵֡᩷;->᩹ۧ:Ll/ۖۢۡ;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ll/ۖۢۡ;->ۧ()I

    move-result v1

    if-le v0, v1, :cond_6

    goto :goto_0

    :cond_2
    invoke-static {v4}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v2

    .line 198
    :cond_3
    :goto_0
    iget-object v1, p0, Ll/᩵֡᩷;->᩹ۧ:Ll/ۖۢۡ;

    if-eqz v1, :cond_4

    invoke-virtual {v1, v0}, Ll/ۖۢۡ;->scrollToPosition(I)V

    .line 199
    iput v3, p0, Ll/᩵֡᩷;->֡ۧ:I

    return-void

    .line 198
    :cond_4
    invoke-static {v4}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v2

    .line 195
    :cond_5
    invoke-static {v4}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v2

    :cond_6
    :goto_1
    return-void
.end method

.method public static final ֫(Ll/᩵֡᩷;I)V
    .locals 11

    .line 917
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 918
    iget-object v1, p0, Ll/᩵֡᩷;->᩵ۧ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۜܳ;

    .line 760
    invoke-interface {v2}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 919
    invoke-interface {v2}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 920
    invoke-interface {v2}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v2

    invoke-static {p1, v2, v3}, Ll/ۚۜܳ;->֫(IJ)[J

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 923
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    return-void

    .line 927
    :cond_2
    iget-object p1, p0, Ll/᩵֡᩷;->᩵ۧ:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۜܳ;

    .line 760
    invoke-interface {v3}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 928
    invoke-interface {v3}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_1

    .line 931
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const-string v5, "iterator(...)"

    invoke-static {v4, v5}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    const-string v6, "next(...)"

    invoke-static {v5, v6}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, [J

    .line 932
    aget-wide v6, v5, v1

    invoke-interface {v3}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v8

    cmp-long v10, v6, v8

    if-gtz v10, :cond_5

    invoke-interface {v3}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v6

    const/4 v8, 0x1

    aget-wide v9, v5, v8

    cmp-long v5, v6, v9

    if-gez v5, :cond_5

    .line 933
    invoke-interface {v3, v8}, Ll/ᩳۜܳ;->setChecked(Z)V

    const/4 v2, 0x1

    goto :goto_1

    .line 939
    :cond_6
    invoke-direct {p0, v2, v1}, Ll/᩵֡᩷;->֫(ZZ)V

    return-void
.end method

.method public static ֫(Ll/᩵֡᩷;ILandroid/content/Intent;)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    if-eqz p2, :cond_1

    .line 328
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1e

    if-lt p1, v0, :cond_1

    .line 329
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    .line 330
    iget-object p0, p0, Ll/᩵֡᩷;->ܿۧ:Ll/ۧܶܿ;

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Ll/ۧܶܿ;->֫(Landroid/net/Uri;)V

    return-void

    :cond_0
    const-string p0, "androidDataGranter"

    invoke-static {p0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    :cond_1
    return-void
.end method

.method public static final synthetic ֫(Ll/᩵֡᩷;J)V
    .locals 0

    .line 95
    iput-wide p1, p0, Ll/᩵֡᩷;->ۚۧ:J

    return-void
.end method

.method public static final ֫(Ll/᩵֡᩷;JJ)V
    .locals 6

    .line 965
    iget-object v0, p0, Ll/᩵֡᩷;->᩵ۧ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۜܳ;

    .line 760
    invoke-interface {v2}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    .line 969
    :cond_1
    invoke-interface {v2}, Ll/ᩳۜܳ;->᩸֫()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v3

    cmp-long v5, p1, v3

    if-gtz v5, :cond_2

    invoke-interface {v2}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v3

    cmp-long v5, v3, p3

    if-gez v5, :cond_2

    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    .line 970
    :goto_1
    invoke-interface {v2}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v4

    if-eq v4, v3, :cond_0

    .line 971
    invoke-interface {v2, v3}, Ll/ᩳۜܳ;->setChecked(Z)V

    const/4 v1, 0x1

    goto :goto_0

    .line 975
    :cond_3
    invoke-direct {p0, v1, v3}, Ll/᩵֡᩷;->֫(ZZ)V

    return-void
.end method

.method public static final synthetic ֫(Ll/᩵֡᩷;Ljava/lang/String;)V
    .locals 0

    .line 95
    invoke-direct {p0, p1}, Ll/᩵֡᩷;->ܽ(Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Ll/᩵֡᩷;Ljava/lang/String;Ll/ܿᩴܳ;)V
    .locals 1

    if-eqz p2, :cond_0

    const p0, 0x7f1206c8

    .line 462
    invoke-static {p0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 465
    :cond_0
    iget-object p2, p0, Ll/᩵֡᩷;->᩻ۧ:Ll/ܳ᩷ۡ;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ll/ܳ᩷ۡ;->ܽ()V

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/String;

    .line 466
    invoke-static {p1, p2}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 467
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result p2

    .line 468
    new-instance v0, Ll/ܿۚᩳ;

    invoke-direct {v0, p2, p0, p1}, Ll/ܿۚᩳ;-><init>(ZLl/᩵֡᩷;Ll/ܶ᩵ܿ;)V

    const-wide/16 p0, 0xb4

    invoke-static {p0, p1, v0}, Ll/ۙ᩸᩷;->֫(JLjava/lang/Runnable;)V

    return-void

    :cond_1
    const-string p0, "bottomSlideLayout"

    .line 465
    invoke-static {p0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final ֫(Ll/᩵֡᩷;Ljava/util/List;)V
    .locals 5

    .line 737
    invoke-direct {p0}, Ll/᩵֡᩷;->ܽ֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 738
    invoke-direct {p0}, Ll/᩵֡᩷;->۟()Ljava/util/HashSet;

    move-result-object v0

    goto :goto_0

    .line 740
    :cond_0
    sget-object v0, Ll/ۖܶ᩵;->᩸:Ll/ۖܶ᩵;

    .line 742
    :goto_0
    iput-object p1, p0, Ll/᩵֡᩷;->᩸ۧ:Ljava/util/List;

    .line 743
    invoke-direct {p0}, Ll/᩵֡᩷;->ܽ֫()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    .line 797
    iget-object v1, p0, Ll/᩵֡᩷;->᩸ۧ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۜܳ;

    .line 798
    invoke-interface {v3}, Ll/ᩳۜܳ;->ܺۧ()Z

    move-result v4

    if-nez v4, :cond_1

    .line 760
    invoke-interface {v3}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 800
    invoke-interface {v3}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/4 v4, 0x1

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    invoke-interface {v3, v4}, Ll/ᩳۜܳ;->setChecked(Z)V

    goto :goto_1

    .line 746
    :cond_3
    iget-object v0, p0, Ll/᩵֡᩷;->ۖۧ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_4

    goto :goto_4

    .line 777
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 873
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ll/ᩳۜܳ;

    .line 749
    invoke-interface {v3}, Ll/ᩳۜܳ;->᩵֫()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-interface {v3}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "getName(...)"

    invoke-static {v3, v4}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Ll/᩵֡᩷;->ۖۧ:Ljava/lang/String;

    invoke-static {v3, v4, v2}, Ll/ۗۙ᩵;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 873
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    move-object p1, v0

    .line 746
    :goto_4
    iput-object p1, p0, Ll/᩵֡᩷;->᩵ۧ:Ljava/util/List;

    .line 751
    invoke-direct {p0}, Ll/᩵֡᩷;->ܳ֫()V

    .line 752
    iget-object p0, p0, Ll/᩵֡᩷;->᩺ۧ:Ll/ᩳ֡᩷;

    .line 2142
    invoke-virtual {p0, v2}, Ll/ᩳ֡᩷;->֫(Z)V

    return-void
.end method

.method public static final ֫(Ll/᩵֡᩷;Ll/ۘ֡᩷;)V
    .locals 5

    .line 983
    iget-object v0, p0, Ll/᩵֡᩷;->᩵ۧ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۜܳ;

    .line 760
    invoke-interface {v2}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    .line 987
    :cond_1
    invoke-interface {v2}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "getName(...)"

    invoke-static {v3, v4}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Ll/ۘ֡᩷;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    .line 988
    invoke-interface {v2}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v4

    if-eq v4, v3, :cond_0

    .line 989
    invoke-interface {v2, v3}, Ll/ᩳۜܳ;->setChecked(Z)V

    const/4 v1, 0x1

    goto :goto_0

    .line 993
    :cond_2
    invoke-direct {p0, v1, v3}, Ll/᩵֡᩷;->֫(ZZ)V

    return-void
.end method

.method public static final ֫(Ll/᩵֡᩷;Ll/ۤ᩵᩷;)V
    .locals 1

    .line 1033
    invoke-direct {p0}, Ll/᩵֡᩷;->ܽ֫()Z

    move-result p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    .line 1034
    invoke-virtual {p1}, Ll/ۤ᩵᩷;->ۧ()Ll/ᩳۜܳ;

    move-result-object p0

    .line 760
    invoke-interface {p0}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 1035
    invoke-virtual {p1}, Ll/ۤ᩵᩷;->ۧ()Ll/ᩳۜܳ;

    move-result-object p0

    invoke-interface {p0}, Ll/ᩳۜܳ;->isChecked()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 1036
    :goto_0
    invoke-virtual {p1}, Ll/ۤ᩵᩷;->ܿ()Landroid/view/View;

    move-result-object p1

    if-eqz p0, :cond_1

    sget v0, Ll/᩹֡᩷;->ܺ:I

    :cond_1
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method public static final ֫(Ll/᩵֡᩷;Z)V
    .locals 1

    .line 110
    iput-boolean p1, p0, Ll/᩵֡᩷;->ۙۧ:Z

    .line 111
    sget-object p0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v0, "fcrp"

    .line 0
    invoke-static {p0, v0, p1}, Ll/᩺۠ܽ;->֫(Ll/۫ۤۡ;Ljava/lang/String;Z)V

    return-void
.end method

.method public static ֫(Ll/᩵֡᩷;ZLl/֫᩹᩵;I)V
    .locals 9

    and-int/lit8 v0, p3, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    const/4 v2, 0x1

    :goto_0
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    :cond_1
    move-object v7, p2

    .line 620
    iget-object p2, p0, Ll/᩵֡᩷;->۠ۧ:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v4, p0, Ll/᩵֡᩷;->ܰۧ:Ll/ܽܽ᩻;

    if-nez v4, :cond_2

    return-void

    .line 621
    :cond_2
    invoke-virtual {p0}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p3

    const-string v0, "<get-lifecycle>(...)"

    invoke-static {p3, v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v2, :cond_3

    .line 622
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p2

    goto :goto_1

    :cond_3
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result p2

    :goto_1
    move v6, p2

    .line 623
    new-instance p2, Ll/ۖ֡᩷;

    move-object v5, p3

    check-cast v5, Ll/᩷ۡ֫;

    move-object v1, p2

    move-object v3, p0

    move v8, p1

    invoke-direct/range {v1 .. v8}, Ll/ۖ֡᩷;-><init>(ZLl/᩵֡᩷;Ll/ܽܽ᩻;Ll/᩷ۡ֫;ILl/֫᩹᩵;Z)V

    .line 733
    invoke-virtual {p2}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method

.method public static ֫(Ll/᩵᩷ۡ;Ll/᩵֡᩷;)V
    .locals 10

    .line 252
    invoke-virtual {p0}, Ll/᩵᩷ۡ;->ᩳ()I

    move-result v0

    .line 1029
    invoke-direct {p1}, Ll/᩵֡᩷;->ܽ֫()Z

    move-result v1

    const/4 v2, 0x3

    if-eqz v1, :cond_1

    invoke-direct {p1}, Ll/᩵֡᩷;->ۧ֫()I

    move-result v1

    if-lez v1, :cond_1

    if-ne v0, v2, :cond_0

    .line 867
    new-instance p0, Ll/ۚۜܳ;

    new-instance v0, Ll/ᩴ֡᩷;

    invoke-direct {v0, p1}, Ll/ᩴ֡᩷;-><init>(Ll/᩵֡᩷;)V

    invoke-direct {p0, p1, v0}, Ll/ۚۜܳ;-><init>(Ll/ۗܺ᩷;Ll/ᩴۜܳ;)V

    .line 883
    invoke-virtual {p0}, Ll/ۚۜܳ;->֫()V

    return-void

    :cond_0
    const p1, 0x7f120919

    const v1, 0x7f120912

    const v2, 0x7f120911

    const v3, 0x7f120918

    const v4, 0x7f12015e

    .line 263
    filled-new-array {v2, v3, v4, p1, v1}, [I

    move-result-object p1

    .line 265
    aget p1, p1, v0

    invoke-virtual {p0, v0, p1}, Ll/᩵᩷ۡ;->ܽ(II)V

    return-void

    .line 266
    :cond_1
    invoke-virtual {p0}, Ll/᩵᩷ۡ;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_b

    if-eqz v0, :cond_a

    const/4 v1, 0x1

    if-eq v0, v1, :cond_9

    const/4 v3, 0x2

    if-eq v0, v3, :cond_8

    if-eq v0, v2, :cond_3

    const/4 p0, 0x4

    if-eq v0, p0, :cond_2

    goto :goto_1

    .line 281
    :cond_2
    invoke-direct {p1}, Ll/᩵֡᩷;->ᩳ֫()V

    return-void

    :cond_3
    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x3

    const/4 v7, 0x0

    .line 273
    invoke-static/range {v2 .. v9}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v0

    .line 272
    invoke-virtual {p0, v0}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 275
    iget-object p0, p1, Ll/᩵֡᩷;->᩶ۧ:Ll/᩻ۡۡ;

    const-string v0, "searchView"

    const/4 v2, 0x0

    if-eqz p0, :cond_7

    invoke-virtual {p0}, Ll/᩻ۡۡ;->ܿ()Z

    move-result p0

    if-nez p0, :cond_5

    .line 276
    iget-object p0, p1, Ll/᩵֡᩷;->᩶ۧ:Ll/᩻ۡۡ;

    if-eqz p0, :cond_4

    .line 242
    invoke-virtual {p0, v2}, Ll/᩻ۡۡ;->֫(Ljava/lang/String;)V

    goto :goto_0

    .line 276
    :cond_4
    invoke-static {v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v2

    .line 278
    :cond_5
    :goto_0
    iget-object p0, p1, Ll/᩵֡᩷;->᩶ۧ:Ll/᩻ۡۡ;

    if-eqz p0, :cond_6

    .line 274
    invoke-virtual {p0, v1}, Ll/᩻ۡۡ;->ۧ(Z)V

    return-void

    .line 278
    :cond_6
    invoke-static {v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v2

    .line 275
    :cond_7
    invoke-static {v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v2

    :cond_8
    const p1, 0x7f1203b9

    .line 270
    invoke-virtual {p0, v3, p1}, Ll/᩵᩷ۡ;->ܽ(II)V

    return-void

    :cond_9
    const p1, 0x7f120404

    .line 269
    invoke-virtual {p0, v1, p1}, Ll/᩵᩷ۡ;->ܽ(II)V

    return-void

    :cond_a
    const p1, 0x7f120119

    const/4 v0, 0x0

    .line 268
    invoke-virtual {p0, v0, p1}, Ll/᩵᩷ۡ;->ܽ(II)V

    :cond_b
    :goto_1
    return-void
.end method

.method public static ֫(ZLl/᩵֡᩷;Ll/ܶ᩵ܿ;)V
    .locals 1

    if-eqz p0, :cond_0

    .line 470
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    const-string p2, "getPath(...)"

    invoke-static {p0, p2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    .line 1277
    invoke-direct {p1, p0, p2}, Ll/᩵֡᩷;->֫(Ljava/lang/String;Ll/֫᩹᩵;)V

    return-void

    .line 472
    :cond_0
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->ۡ֫()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ll/ۖ᩵᩷;

    invoke-direct {v0, p2, p1}, Ll/ۖ᩵᩷;-><init>(Ll/ܶ᩵ܿ;Ll/᩵֡᩷;)V

    invoke-direct {p1, p0, v0}, Ll/᩵֡᩷;->֫(Ljava/lang/String;Ll/֫᩹᩵;)V

    return-void
.end method

.method private final ֫(ZZ)V
    .locals 1

    .line 1000
    invoke-direct {p0}, Ll/᩵֡᩷;->ܳ֫()V

    if-eqz p1, :cond_0

    .line 1002
    iget-object p1, p0, Ll/᩵֡᩷;->᩺ۧ:Ll/ᩳ֡᩷;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ᩳ֡᩷;->֫(Z)V

    :cond_0
    if-eqz p2, :cond_1

    .line 1004
    invoke-direct {p0}, Ll/᩵֡᩷;->ۧ֫()I

    move-result p1

    if-nez p1, :cond_1

    const p1, 0x7f1206ef

    .line 1005
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    :cond_1
    return-void
.end method

.method private final ֫֫()Ll/֫᩷ܳ;
    .locals 5

    .line 1275
    new-instance v0, Ll/֫᩷ܳ;

    iget-object v1, p0, Ll/᩵֡᩷;->ܰۧ:Ll/ܽܽ᩻;

    invoke-static {v1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ll/᩵֡᩷;->᩺ۧ:Ll/ᩳ֡᩷;

    invoke-virtual {v2}, Ll/ᩳ֡᩷;->֫()I

    move-result v2

    iget-object v3, p0, Ll/᩵֡᩷;->᩶ۧ:Ll/᩻ۡۡ;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ll/᩻ۡۡ;->ܿ()Z

    move-result v3

    iget-object v4, p0, Ll/᩵֡᩷;->ۖۧ:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v4, v3}, Ll/֫᩷ܳ;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    return-object v0

    :cond_0
    const-string v0, "searchView"

    invoke-static {v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public static final synthetic ۖ(Ll/᩵֡᩷;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 95
    iget-object p0, p0, Ll/᩵֡᩷;->۠ۧ:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method public static final synthetic ۘ(Ll/᩵֡᩷;)Ljava/util/List;
    .locals 0

    .line 95
    iget-object p0, p0, Ll/᩵֡᩷;->᩸ۧ:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic ۚ(Ll/᩵֡᩷;)Ljava/util/HashSet;
    .locals 0

    .line 95
    iget-object p0, p0, Ll/᩵֡᩷;->۫ۧ:Ljava/util/HashSet;

    return-object p0
.end method

.method public static final synthetic ۜ(Ll/᩵֡᩷;)Ll/ܳ᩷ۡ;
    .locals 0

    .line 95
    iget-object p0, p0, Ll/᩵֡᩷;->᩻ۧ:Ll/ܳ᩷ۡ;

    return-object p0
.end method

.method private final ۟()Ljava/util/HashSet;
    .locals 4

    .line 764
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 765
    iget-object v1, p0, Ll/᩵֡᩷;->᩸ۧ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۜܳ;

    .line 760
    invoke-interface {v2}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 766
    invoke-interface {v2}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 767
    invoke-interface {v2}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static final synthetic ۠(Ll/᩵֡᩷;)Ll/۫ۤۧ;
    .locals 0

    .line 95
    iget-object p0, p0, Ll/᩵֡᩷;->ۛۧ:Ll/۫ۤۧ;

    return-object p0
.end method

.method public static final synthetic ۡ(Ll/᩵֡᩷;)Ljava/lang/String;
    .locals 0

    .line 95
    iget-object p0, p0, Ll/᩵֡᩷;->ۖۧ:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic ۢ(Ll/᩵֡᩷;)Landroid/widget/EditText;
    .locals 0

    .line 95
    iget-object p0, p0, Ll/᩵֡᩷;->ܺۧ:Landroid/widget/EditText;

    return-object p0
.end method

.method public static ۧ(Ll/ܶ᩵ܿ;Ll/᩵֡᩷;)Ll/۠۠᩵;
    .locals 1

    .line 1264
    iget-object p1, p1, Ll/᩵֡᩷;->᩺ۧ:Ll/ᩳ֡᩷;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "getName(...)"

    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ll/ᩳ֡᩷;->֫(Ljava/lang/String;)V

    .line 1265
    sget-object p0, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    return-object p0
.end method

.method public static ۧ(Ll/᩵֡᩷;Ll/֫᩷ܳ;Ljava/lang/String;)Ll/۠۠᩵;
    .locals 0

    .line 1161
    iget-object p0, p0, Ll/᩵֡᩷;->᩺ۧ:Ll/ᩳ֡᩷;

    iget p1, p1, Ll/֫᩷ܳ;->ᩳ:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Ll/ᩳ֡᩷;->֫(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 1162
    sget-object p0, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    return-object p0
.end method

.method public static ۧ(Ll/ۤۤᩳ;Ll/᩵֡᩷;Ll/֡ۚۢ;Landroid/widget/TextView;)V
    .locals 3

    .line 1201
    invoke-virtual {p0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "\\"

    const/4 v1, 0x0

    .line 1182
    invoke-static {p0, v0, v1}, Ll/ۗۙ᩵;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "/"

    invoke-static {p0, v0, v1}, Ll/ۗۙ᩵;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 1206
    :cond_0
    iget-object v0, p1, Ll/᩵֡᩷;->ܰۧ:Ll/ܽܽ᩻;

    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object v0

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 1207
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1208
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result p0

    if-eqz p0, :cond_1

    const p0, 0x7f1203fc

    .line 1209
    invoke-static {p3, p0}, Ll/᩵֡᩷;->֫(Landroid/widget/TextView;I)V

    return-void

    :cond_1
    const p0, 0x7f1208c1

    .line 1211
    invoke-static {p3, p0}, Ll/᩵֡᩷;->֫(Landroid/widget/TextView;I)V

    return-void

    :cond_2
    const/4 p3, 0x0

    .line 1217
    :try_start_0
    iget-object v0, p1, Ll/᩵֡᩷;->ܰۧ:Ll/ܽܽ᩻;

    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ll/ܽܽ᩻;->᩸()Ljava/lang/String;

    move-result-object v0

    .line 1218
    sget-object v2, Ll/ܽ֨ۢ;->ۗ:Ll/ܽ֨ۢ;

    .line 1216
    invoke-static {v0, v2}, Ll/ᩳ֨ۢ;->֫(Ljava/lang/String;Ll/ܽ֨ۢ;)V
    :try_end_0
    .catch Ll/֫ۛۡ; {:try_start_0 .. :try_end_0} :catch_1

    .line 1225
    :try_start_1
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۛ()V

    .line 1226
    new-instance v0, Ll/ܺ᩵᩷;

    invoke-direct {v0, p0, p1}, Ll/ܺ᩵᩷;-><init>(Ll/ܶ᩵ܿ;Ll/᩵֡᩷;)V

    const/4 p0, 0x2

    .line 610
    invoke-static {p1, v1, v0, p0}, Ll/᩵֡᩷;->֫(Ll/᩵֡᩷;ZLl/֫᩹᩵;I)V

    .line 1229
    invoke-virtual {p2}, Ll/֡ۚۢ;->dismiss()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    .line 546
    :goto_0
    invoke-virtual {p1, p0, p3}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void

    :cond_3
    :goto_1
    const p0, 0x7f1203ae

    .line 1203
    invoke-static {p3, p0}, Ll/᩵֡᩷;->֫(Landroid/widget/TextView;I)V

    return-void
.end method

.method public static ۧ(Ll/᩵֡᩷;)V
    .locals 0

    .line 165
    iget-object p0, p0, Ll/᩵֡᩷;->ܰۧ:Ll/ܽܽ᩻;

    if-eqz p0, :cond_0

    .line 166
    invoke-virtual {p0}, Ll/ܽ᩷ܳ;->ܶ()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public static final synthetic ۧ(Ll/᩵֡᩷;I)V
    .locals 0

    .line 95
    iput p1, p0, Ll/᩵֡᩷;->֡ۧ:I

    return-void
.end method

.method public static final ۧ(Ll/᩵֡᩷;JJ)V
    .locals 6

    .line 947
    iget-object v0, p0, Ll/᩵֡᩷;->᩵ۧ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۜܳ;

    .line 760
    invoke-interface {v2}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    .line 951
    :cond_1
    invoke-interface {v2}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v3

    cmp-long v5, p1, v3

    if-gtz v5, :cond_2

    invoke-interface {v2}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v3

    cmp-long v5, v3, p3

    if-gez v5, :cond_2

    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    .line 952
    :goto_1
    invoke-interface {v2}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v4

    if-eq v4, v3, :cond_0

    .line 953
    invoke-interface {v2, v3}, Ll/ᩳۜܳ;->setChecked(Z)V

    const/4 v1, 0x1

    goto :goto_0

    .line 957
    :cond_3
    invoke-direct {p0, v1, v3}, Ll/᩵֡᩷;->֫(ZZ)V

    return-void
.end method

.method public static final synthetic ۧ(Ll/᩵֡᩷;Ljava/lang/String;)V
    .locals 0

    .line 95
    iput-object p1, p0, Ll/᩵֡᩷;->ۖۧ:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic ۧ(Ll/᩵֡᩷;Ljava/util/List;)V
    .locals 0

    .line 95
    iput-object p1, p0, Ll/᩵֡᩷;->᩵ۧ:Ljava/util/List;

    return-void
.end method

.method private final ۧ֫()I
    .locals 4

    .line 788
    iget-object v0, p0, Ll/᩵֡᩷;->᩸ۧ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۜܳ;

    .line 760
    invoke-interface {v2}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 789
    invoke-interface {v2}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method private final ۨ()V
    .locals 3

    .line 1065
    invoke-direct {p0}, Ll/᩵֡᩷;->ܽ֫()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Ll/᩵֡᩷;->۟()Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 825
    invoke-direct {p0}, Ll/᩵֡᩷;->ܽ֫()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 828
    :cond_0
    invoke-direct {p0}, Ll/᩵֡᩷;->ܰ()Z

    move-result v0

    .line 829
    invoke-direct {p0}, Ll/᩵֡᩷;->ܳ֫()V

    if-eqz v0, :cond_1

    .line 831
    iget-object v0, p0, Ll/᩵֡᩷;->᩺ۧ:Ll/ᩳ֡᩷;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ᩳ֡᩷;->֫(Z)V

    :cond_1
    :goto_0
    return-void

    .line 1067
    :cond_2
    iget-object v0, p0, Ll/᩵֡᩷;->᩶ۧ:Ll/᩻ۡۡ;

    const/4 v1, 0x0

    const-string v2, "searchView"

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ll/᩻ۡۡ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1068
    iget-object v0, p0, Ll/᩵֡᩷;->᩶ۧ:Ll/᩻ۡۡ;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ll/᩻ۡۡ;->ۧ()V

    return-void

    :cond_3
    invoke-static {v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v1

    .line 1070
    :cond_4
    invoke-direct {p0}, Ll/᩵֡᩷;->᩺()V

    return-void

    .line 1067
    :cond_5
    invoke-static {v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v1
.end method

.method private final ܰ()Z
    .locals 5

    .line 807
    iget-object v0, p0, Ll/᩵֡᩷;->᩸ۧ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۜܳ;

    .line 808
    invoke-interface {v3}, Ll/ᩳۜܳ;->ܺۧ()Z

    move-result v4

    if-nez v4, :cond_0

    invoke-interface {v3}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 809
    invoke-interface {v3, v1}, Ll/ᩳۜܳ;->setChecked(Z)V

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public static final synthetic ܳ(Ll/᩵֡᩷;)Ll/۫᩵᩷;
    .locals 0

    .line 95
    iget-object p0, p0, Ll/᩵֡᩷;->ᩳۧ:Ll/۫᩵᩷;

    return-object p0
.end method

.method private final ܳ֫()V
    .locals 4

    .line 1010
    invoke-direct {p0}, Ll/᩵֡᩷;->ܽ֫()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 1013
    :cond_0
    invoke-direct {p0}, Ll/᩵֡᩷;->ۧ֫()I

    move-result v0

    const v1, 0x7f0a00a4

    .line 1014
    invoke-virtual {p0, v1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 1015
    iget v2, p0, Ll/᩵֡᩷;->ܶۧ:I

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "("

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-lez v0, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 1016
    :goto_0
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    const/4 v1, 0x0

    const-string v2, "bottomToolbar"

    if-lez v0, :cond_3

    .line 1019
    iget-object v0, p0, Ll/᩵֡᩷;->᩷ۧ:Ll/᩵᩷ۡ;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ll/᩵᩷ۡ;->ۢ()V

    return-void

    :cond_2
    invoke-static {v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v1

    .line 1021
    :cond_3
    iget-object v0, p0, Ll/᩵֡᩷;->᩷ۧ:Ll/᩵᩷ۡ;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ll/᩵᩷ۡ;->᩷()V

    return-void

    :cond_4
    invoke-static {v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v1
.end method

.method public static final synthetic ܶ(Ll/᩵֡᩷;)I
    .locals 0

    .line 95
    iget p0, p0, Ll/᩵֡᩷;->ۨۧ:I

    return p0
.end method

.method public static final synthetic ܺ(Ll/᩵֡᩷;)Ljava/util/List;
    .locals 0

    .line 95
    iget-object p0, p0, Ll/᩵֡᩷;->᩵ۧ:Ljava/util/List;

    return-object p0
.end method

.method private final ܽ(Ljava/lang/String;)V
    .locals 3

    .line 1367
    iget-object v0, p0, Ll/᩵֡᩷;->ᩴۧ:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 1368
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v1

    invoke-static {p1}, Ll/ܳۛۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    .line 1370
    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 1371
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "getIntent(...)"

    invoke-static {v1, v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1425
    invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    const-string v2, "android.intent.action.GET_CONTENT"

    invoke-static {v1, v2}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1372
    invoke-static {p1}, Ll/ۨ᩵ܿ;->֫(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const/4 p1, 0x1

    .line 1373
    invoke-virtual {v0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/4 p1, 0x2

    .line 1374
    invoke-virtual {v0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    goto :goto_0

    :cond_1
    const-string v1, "path"

    .line 1376
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1377
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "extra"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 1378
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_2
    :goto_0
    const/4 p1, -0x1

    .line 1381
    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 1382
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public static ܽ(Ll/ܶ᩵ܿ;Ll/᩵֡᩷;)V
    .locals 3

    .line 1350
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getPath(...)"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 155
    invoke-static {v0, v2}, Ll/ۡᩴܳ;->֫(Ljava/lang/String;Ll/ܿᩴܳ;)V

    .line 1351
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p0}, Ll/᩵֡᩷;->ܽ(Ljava/lang/String;)V

    return-void
.end method

.method public static ܽ(Ll/᩵֡᩷;)V
    .locals 0

    .line 170
    invoke-direct {p0}, Ll/᩵֡᩷;->ᩳ֫()V

    return-void
.end method

.method public static final ܽ(Ll/᩵֡᩷;I)V
    .locals 1

    .line 105
    iput p1, p0, Ll/᩵֡᩷;->ۗۧ:I

    .line 106
    sget-object p0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p0

    const-string v0, "fcsp"

    invoke-interface {p0, p1, v0}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    invoke-interface {p0}, Ll/۬ۤۡ;->apply()V

    return-void
.end method

.method public static synthetic ܽ(Ll/᩵֡᩷;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1277
    invoke-direct {p0, p1, v0}, Ll/᩵֡᩷;->֫(Ljava/lang/String;Ll/֫᩹᩵;)V

    return-void
.end method

.method private final ܽ֫()Z
    .locals 2

    .line 756
    iget v0, p0, Ll/᩵֡᩷;->ۨۧ:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static final synthetic ܿ(Ll/᩵֡᩷;)V
    .locals 0

    .line 95
    invoke-direct {p0}, Ll/᩵֡᩷;->᩺()V

    return-void
.end method

.method private final ܿ֫()V
    .locals 7

    .line 601
    iget-object v0, p0, Ll/᩵֡᩷;->ܰۧ:Ll/ܽܽ᩻;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 602
    invoke-virtual {v0}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object v2

    const-string v3, "getPath(...)"

    invoke-static {v2, v3}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    invoke-static {v2, v1}, Ll/ۡᩴܳ;->֫(Ljava/lang/String;Ll/ܿᩴܳ;)V

    .line 603
    iget-object v2, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    invoke-virtual {v0}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ll/ۢᩴ;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 605
    :cond_0
    iget-object v0, p0, Ll/᩵֡᩷;->᩷ۧ:Ll/᩵᩷ۡ;

    const-string v2, "bottomToolbar"

    if-eqz v0, :cond_8

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ll/᩵᩷ۡ;->֫(I)Ll/ۡ᩷ۡ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 676
    check-cast v0, Ll/ܺ᩷ۡ;

    .line 1093
    iget-object v4, p0, Ll/᩵֡᩷;->ۛۧ:Ll/۫ۤۧ;

    const-string v5, "swipeRefreshLayout"

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Ll/۫ۤۧ;->ۧ()Z

    move-result v4

    const/4 v6, 0x1

    if-eqz v4, :cond_1

    goto :goto_0

    .line 1096
    :cond_1
    iget-object v4, p0, Ll/᩵֡᩷;->ܰۧ:Ll/ܽܽ᩻;

    if-eqz v4, :cond_2

    iget-object v4, v4, Ll/ܽ᩷ܳ;->ۜ:Ll/ۧ᩷ܳ;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ll/ۧ᩷ܳ;->֫()Z

    move-result v4

    if-ne v4, v6, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v4, 0x0

    .line 605
    :goto_1
    invoke-virtual {v0, v4}, Ll/ܺ᩷ۡ;->֫(Z)V

    .line 606
    iget-object v0, p0, Ll/᩵֡᩷;->᩷ۧ:Ll/᩵᩷ۡ;

    if-eqz v0, :cond_6

    invoke-virtual {v0, v6}, Ll/᩵᩷ۡ;->֫(I)Ll/ۡ᩷ۡ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 676
    check-cast v0, Ll/ܺ᩷ۡ;

    .line 1130
    iget-object v2, p0, Ll/᩵֡᩷;->ۛۧ:Ll/۫ۤۧ;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ll/۫ۤۧ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_2

    .line 1133
    :cond_3
    iget-object v1, p0, Ll/᩵֡᩷;->ܰۧ:Ll/ܽܽ᩻;

    if-eqz v1, :cond_4

    iget-object v1, v1, Ll/ܽ᩷ܳ;->ۜ:Ll/ۧ᩷ܳ;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ll/ۧ᩷ܳ;->ۧ()Z

    move-result v1

    if-ne v1, v6, :cond_4

    const/4 v3, 0x1

    .line 606
    :cond_4
    :goto_2
    invoke-virtual {v0, v3}, Ll/ܺ᩷ۡ;->֫(Z)V

    return-void

    .line 1130
    :cond_5
    invoke-static {v5}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v1

    .line 606
    :cond_6
    invoke-static {v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v1

    .line 1093
    :cond_7
    invoke-static {v5}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v1

    .line 605
    :cond_8
    invoke-static {v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v1
.end method

.method public static ᩳ(Ll/ܶ᩵ܿ;Ll/᩵֡᩷;)Ll/۠۠᩵;
    .locals 1

    .line 1227
    iget-object p1, p1, Ll/᩵֡᩷;->᩺ۧ:Ll/ᩳ֡᩷;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "getName(...)"

    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ll/ᩳ֡᩷;->֫(Ljava/lang/String;)V

    .line 1228
    sget-object p0, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    return-object p0
.end method

.method public static final synthetic ᩳ(Ll/᩵֡᩷;)V
    .locals 0

    .line 95
    invoke-direct {p0}, Ll/᩵֡᩷;->ۨ()V

    return-void
.end method

.method private final ᩳ֫()V
    .locals 5

    .line 1303
    iget-object v0, p0, Ll/᩵֡᩷;->ܰۧ:Ll/ܽܽ᩻;

    if-nez v0, :cond_0

    return-void

    .line 1304
    :cond_0
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v1

    const-string v2, "clipboard"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type android.content.ClipboardManager"

    invoke-static {v1, v2}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/content/ClipboardManager;

    .line 1305
    new-instance v2, Ll/ܳ֡᩷;

    invoke-direct {v2, p0}, Ll/ܳ֡᩷;-><init>(Ll/᩵֡᩷;)V

    const v3, 0x7f1204cb

    .line 1315
    invoke-virtual {v2, v3}, Ll/۬ۗܿ;->ۡ(I)V

    .line 1316
    invoke-virtual {v0}, Ll/ܽ᩷ܳ;->ܶ()Ljava/lang/String;

    move-result-object v0

    const/16 v3, 0x7d0

    invoke-static {v3, v0}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    .line 1317
    invoke-virtual {v2}, Ll/۬ۗܿ;->᩵()V

    const/4 v0, 0x2

    .line 1318
    invoke-virtual {v2, v0}, Ll/۬ۗܿ;->ᩳ(I)V

    const/4 v0, 0x1

    .line 205
    invoke-virtual {v2, v0}, Ll/۬ۗܿ;->ۧ(Z)V

    .line 1320
    invoke-virtual {v2}, Ll/۬ۗܿ;->᩷()Landroid/widget/Button;

    move-result-object v0

    new-instance v3, Ll/᩶۫᩻;

    const/4 v4, 0x1

    invoke-direct {v3, v4, v1, v2}, Ll/᩶۫᩻;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static final synthetic ᩴ(Ll/᩵֡᩷;)Ll/ۖۢۡ;
    .locals 0

    .line 95
    iget-object p0, p0, Ll/᩵֡᩷;->᩹ۧ:Ll/ۖۢۡ;

    return-object p0
.end method

.method public static final synthetic ᩵(Ll/᩵֡᩷;)Z
    .locals 0

    .line 95
    iget-boolean p0, p0, Ll/᩵֡᩷;->ۙۧ:Z

    return p0
.end method

.method public static final synthetic ᩶(Ll/᩵֡᩷;)V
    .locals 0

    .line 95
    invoke-direct {p0}, Ll/᩵֡᩷;->ܳ֫()V

    return-void
.end method

.method public static final synthetic ᩷(Ll/᩵֡᩷;)I
    .locals 0

    .line 95
    iget p0, p0, Ll/᩵֡᩷;->ۡۧ:I

    return p0
.end method

.method public static final synthetic ᩸(Ll/᩵֡᩷;)Ll/ᩳ֡᩷;
    .locals 0

    .line 95
    iget-object p0, p0, Ll/᩵֡᩷;->᩺ۧ:Ll/ᩳ֡᩷;

    return-object p0
.end method

.method public static final synthetic ᩹(Ll/᩵֡᩷;)Ll/ܽܽ᩻;
    .locals 0

    .line 95
    iget-object p0, p0, Ll/᩵֡᩷;->ܰۧ:Ll/ܽܽ᩻;

    return-object p0
.end method

.method private final ᩺()V
    .locals 4

    .line 1042
    iget-object v0, p0, Ll/᩵֡᩷;->ۛۧ:Ll/۫ۤۧ;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ll/۫ۤۧ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1045
    :cond_0
    iget-object v0, p0, Ll/᩵֡᩷;->ܰۧ:Ll/ܽܽ᩻;

    if-nez v0, :cond_1

    :goto_0
    return-void

    .line 1046
    :cond_1
    invoke-virtual {v0}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object v1

    .line 1047
    invoke-static {v1}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1048
    invoke-static {v1}, Ll/ۢۤۡ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    .line 1050
    iget-object v0, p0, Ll/᩵֡᩷;->ۢۧ:Ll/ۡۤۡ;

    invoke-virtual {v0}, Ll/ۡۤۡ;->֫()Z

    move-result v0

    if-eqz v0, :cond_2

    const v0, 0x7f12079b

    .line 1051
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 1053
    :cond_2
    invoke-static {}, Ll/᩸ۚۢ;->ܽ()V

    .line 1054
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    .line 1058
    :cond_3
    new-instance v3, Ll/ۜ᩵᩷;

    invoke-direct {v3, v0, v1, p0, v2}, Ll/ۜ᩵᩷;-><init>(Ll/ܽܽ᩻;Ljava/lang/String;Ll/᩵֡᩷;Ljava/lang/String;)V

    invoke-direct {p0, v1, v3}, Ll/᩵֡᩷;->֫(Ljava/lang/String;Ll/֫᩹᩵;)V

    return-void

    :cond_4
    const-string v0, "swipeRefreshLayout"

    .line 1042
    invoke-static {v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public static final synthetic ᩻(Ll/᩵֡᩷;)Ll/ۚ᩵ܳ;
    .locals 0

    .line 95
    iget-object p0, p0, Ll/᩵֡᩷;->ܳۧ:Ll/ۚ᩵ܳ;

    return-object p0
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    .line 1330
    iget-object p1, p0, Ll/᩵֡᩷;->ܰۧ:Ll/ܽܽ᩻;

    if-nez p1, :cond_0

    goto/16 :goto_5

    .line 1331
    :cond_0
    iget v0, p0, Ll/᩵֡᩷;->ۨۧ:I

    const-string v1, "getPath(...)"

    if-eqz v0, :cond_11

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x0

    if-eq v0, v5, :cond_e

    if-ne v0, v4, :cond_d

    .line 774
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 775
    iget-object v0, p0, Ll/᩵֡᩷;->᩸ۧ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۜܳ;

    .line 760
    invoke-interface {v1}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 776
    invoke-interface {v1}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 777
    invoke-interface {v1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1338
    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_c

    .line 1386
    iget-object v0, p0, Ll/᩵֡᩷;->ᩴۧ:Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 1387
    iget-object v1, p0, Ll/᩵֡᩷;->ܰۧ:Ll/ܽܽ᩻;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    :cond_3
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ll/ܳۛۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1388
    :cond_4
    sget-object v4, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v4}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v4

    invoke-interface {v4, v0, v1}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    .line 1390
    :cond_5
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "getIntent(...)"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1425
    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.intent.action.GET_CONTENT"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "paths"

    if-eqz v0, :cond_a

    .line 1450
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 1451
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ne v4, v2, :cond_6

    .line 1452
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ll/ۨ᩵ܿ;->֫(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    goto :goto_3

    .line 1455
    :cond_6
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    add-int/lit8 v7, v3, 0x1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 1456
    invoke-static {v8}, Ll/ۨ᩵ܿ;->֫(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v8

    if-nez v3, :cond_7

    .line 1458
    invoke-static {v1, v8}, Landroid/content/ClipData;->newRawUri(Ljava/lang/CharSequence;Landroid/net/Uri;)Landroid/content/ClipData;

    move-result-object v3

    move-object v6, v3

    goto :goto_2

    :cond_7
    if-eqz v6, :cond_8

    .line 1460
    new-instance v3, Landroid/content/ClipData$Item;

    invoke-direct {v3, v8}, Landroid/content/ClipData$Item;-><init>(Landroid/net/Uri;)V

    invoke-virtual {v6, v3}, Landroid/content/ClipData;->addItem(Landroid/content/ClipData$Item;)V

    :cond_8
    :goto_2
    move v3, v7

    goto :goto_1

    .line 1463
    :cond_9
    invoke-virtual {v0, v6}, Landroid/content/Intent;->setClipData(Landroid/content/ClipData;)V

    .line 1465
    :goto_3
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_b

    .line 1466
    invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1467
    invoke-virtual {v0, v5}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    goto :goto_4

    .line 1442
    :cond_a
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    move-result-object v0

    const-string p1, "putStringArrayListExtra(...)"

    invoke-static {v0, p1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_b
    :goto_4
    const/4 p1, -0x1

    .line 1395
    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 1396
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_c
    :goto_5
    return-void

    .line 1361
    :cond_d
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 1344
    :cond_e
    invoke-virtual {p1}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/᩵֡᩷;->ܺۧ:Landroid/widget/EditText;

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 1345
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 1346
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    const v1, 0x7f120b7b

    .line 1347
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 1348
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v1, v2, v3

    const v1, 0x7f1203b5

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    .line 1349
    new-instance v1, Ll/ۨۜᩳ;

    invoke-direct {v1, v4, p1, p0}, Ll/ۨۜᩳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const p1, 0x7f12070a

    invoke-virtual {v0, p1, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    .line 1352
    invoke-virtual {v0, p1, v6}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 1353
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    .line 1355
    :cond_f
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    invoke-static {v0, v6}, Ll/ۡᩴܳ;->֫(Ljava/lang/String;Ll/ܿᩴܳ;)V

    .line 1356
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ll/᩵֡᩷;->ܽ(Ljava/lang/String;)V

    return-void

    :cond_10
    const-string p1, "filenameEditText"

    .line 1344
    invoke-static {p1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v6

    .line 1333
    :cond_11
    invoke-virtual {p1}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ll/᩵֡᩷;->ܽ(Ljava/lang/String;)V

    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 7

    .line 144
    invoke-super {p0, p1}, Ll/ۗܺ᩷;->onCreate(Landroid/os/Bundle;)V

    .line 145
    invoke-virtual {p0}, Ll/ۗܺ᩷;->֡()V

    const v0, 0x7f0d0026

    .line 146
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    .line 147
    invoke-virtual {p0}, Ll/᩻ܽ;->getOnBackPressedDispatcher()Ll/ۨܽ;

    move-result-object v0

    .line 1075
    new-instance v1, Ll/᩻֡᩷;

    invoke-direct {v1, p0}, Ll/᩻֡᩷;-><init>(Ll/᩵֡᩷;)V

    .line 147
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    invoke-virtual {v0, v1}, Ll/ۨܽ;->֫(Ll/֡ܽ;)Ll/ۙۧ;

    .line 148
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "getIntent(...)"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1425
    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.intent.action.GET_CONTENT"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f12092a

    .line 149
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setTitle(I)V

    goto :goto_0

    .line 151
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "title"

    const v2, 0x7f120393

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setTitle(I)V

    :goto_0
    const v0, 0x7f0a063a

    .line 154
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ۢᩴ;

    iput-object v0, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    .line 156
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->֫(Ll/ۢᩴ;)V

    .line 157
    invoke-virtual {p0}, Ll/֨ܿ;->ۖ()Ll/ۤᩳ;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    invoke-virtual {v1, v2}, Ll/ۤᩳ;->ܽ(Z)V

    :cond_1
    const v1, 0x7f0801a9

    .line 158
    invoke-virtual {v0, v1}, Ll/ۢᩴ;->setNavigationIcon(I)V

    .line 159
    new-instance v1, Ll/ۢ֨᩷;

    const/4 v3, 0x2

    invoke-direct {v1, p0, v3}, Ll/ۢ֨᩷;-><init>(Ll/ۗܺ᩷;I)V

    invoke-virtual {v0, v1}, Ll/ۢᩴ;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    const-string v1, "..."

    .line 160
    invoke-virtual {v0, v1}, Ll/ۢᩴ;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 161
    invoke-static {v0}, Ll/ܳܺۡ;->ܽ(Ll/ۢᩴ;)Landroid/widget/TextView;

    move-result-object v1

    .line 162
    invoke-static {v0}, Ll/ܳܺۡ;->ۧ(Ll/ۢᩴ;)Landroid/widget/TextView;

    move-result-object v0

    .line 163
    sget-object v3, Landroid/text/TextUtils$TruncateAt;->START:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 164
    new-instance v3, Ll/ۢ᩵᩷;

    invoke-direct {v3, p0}, Ll/ۢ᩵᩷;-><init>(Ll/᩵֡᩷;)V

    .line 170
    new-instance v4, Ll/ۨۖܳ;

    const/4 v5, 0x4

    invoke-direct {v4, v5, p0}, Ll/ۨۖܳ;-><init>(ILjava/lang/Object;)V

    .line 171
    invoke-virtual {v1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 172
    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 173
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 174
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    const v0, 0x7f0a01eb

    .line 177
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "view(...)"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Ll/᩵֡᩷;->ܺۧ:Landroid/widget/EditText;

    const v0, 0x7f0a0486

    .line 178
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ll/ۖۢۡ;

    iput-object v0, p0, Ll/᩵֡᩷;->᩹ۧ:Ll/ۖۢۡ;

    const v0, 0x7f0a04a1

    .line 179
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ll/۫ۤۧ;

    iput-object v0, p0, Ll/᩵֡᩷;->ۛۧ:Ll/۫ۤۧ;

    const v0, 0x7f0a0094

    .line 180
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Ll/᩵֡᩷;->ۜۧ:Landroid/view/View;

    .line 181
    new-instance v0, Ll/۫᩵᩷;

    invoke-direct {v0, p0}, Ll/۫᩵᩷;-><init>(Ll/᩵֡᩷;)V

    iput-object v0, p0, Ll/᩵֡᩷;->ᩳۧ:Ll/۫᩵᩷;

    .line 182
    iget-object v3, p0, Ll/᩵֡᩷;->᩹ۧ:Ll/ۖۢۡ;

    const/4 v4, 0x0

    const-string v5, "recyclerView"

    if-eqz v3, :cond_9

    invoke-virtual {v3, v0}, Ll/ۖۢۡ;->setAdapter(Ll/᩶ۗۧ;)V

    .line 183
    iget-object v0, p0, Ll/᩵֡᩷;->ۛۧ:Ll/۫ۤۧ;

    if-eqz v0, :cond_8

    new-instance v3, Ll/ۘ᩵᩷;

    invoke-direct {v3, p0}, Ll/ۘ᩵᩷;-><init>(Ll/ۗܺ᩷;)V

    invoke-virtual {v0, v3}, Ll/۫ۤۧ;->֫(Ll/ۙۤۧ;)V

    .line 185
    iget-object v0, p0, Ll/᩵֡᩷;->᩹ۧ:Ll/ۖۢۡ;

    if-eqz v0, :cond_7

    new-instance v3, Ll/ᩴ᩵᩷;

    const/4 v5, 0x0

    invoke-direct {v3, v5, p0}, Ll/ᩴ᩵᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    const v0, 0x7f0a0096

    .line 204
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ll/᩵᩷ۡ;

    iput-object v0, p0, Ll/᩵֡᩷;->᩷ۧ:Ll/᩵᩷ۡ;

    const v0, 0x7f0a0091

    .line 205
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ll/ܳ᩷ۡ;

    iput-object v0, p0, Ll/᩵֡᩷;->᩻ۧ:Ll/ܳ᩷ۡ;

    .line 962
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v3

    .line 963
    invoke-virtual {v3}, Landroid/view/Window;->getStatusBarColor()I

    move-result v5

    .line 964
    new-instance v6, Ll/۠ܺ᩷;

    invoke-direct {v6, v3, v5}, Ll/۠ܺ᩷;-><init>(Landroid/view/Window;I)V

    invoke-virtual {v0, v6}, Ll/ܳ᩷ۡ;->֫(Ll/᩻᩷ۡ;)V

    const v0, 0x7f0a0097

    .line 207
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/֡᩷ۡ;

    .line 208
    iget-object v3, p0, Ll/᩵֡᩷;->᩷ۧ:Ll/᩵᩷ۡ;

    const-string v5, "bottomToolbar"

    if-eqz v3, :cond_6

    invoke-virtual {v0, v3}, Ll/֡᩷ۡ;->֫(Ll/᩵᩷ۡ;)V

    .line 209
    iget-object v0, p0, Ll/᩵֡᩷;->᩷ۧ:Ll/᩵᩷ۡ;

    if-eqz v0, :cond_5

    .line 210
    iget-object v3, p0, Ll/᩵֡᩷;->᩻ۧ:Ll/ܳ᩷ۡ;

    if-eqz v3, :cond_4

    invoke-virtual {v0, v3}, Ll/᩵᩷ۡ;->֫(Ll/ܳ᩷ۡ;)V

    .line 211
    invoke-virtual {v0}, Ll/᩵᩷ۡ;->֫()V

    const v3, 0x7f0802be

    const v5, 0x7f0802c0

    .line 212
    invoke-virtual {v0, v3, v5}, Ll/᩵᩷ۡ;->֫(II)Ll/ܺ᩷ۡ;

    move-result-object v3

    const/4 v5, 0x0

    .line 213
    invoke-virtual {v3, v5}, Ll/ܺ᩷ۡ;->֫(Z)V

    const v3, 0x7f0802bf

    const v6, 0x7f0802c2

    .line 214
    invoke-virtual {v0, v3, v6}, Ll/᩵᩷ۡ;->֫(II)Ll/ܺ᩷ۡ;

    move-result-object v3

    .line 215
    invoke-virtual {v3, v5}, Ll/ܺ᩷ۡ;->֫(Z)V

    const v3, 0x7f0802bc

    const/16 v6, 0x2d

    .line 216
    invoke-virtual {v0, v3, v6}, Ll/᩵᩷ۡ;->ۧ(II)V

    .line 218
    new-instance v3, Ll/ᩴۢᩳ;

    invoke-direct {v3, v0}, Ll/ᩴۢᩳ;-><init>(Landroid/view/View;)V

    .line 217
    invoke-virtual {v0, v3}, Ll/᩵᩷ۡ;->֫(Ll/ᩴۢᩳ;)Ll/ܺ᩷ۡ;

    move-result-object v3

    .line 225
    invoke-virtual {v3}, Ll/ܺ᩷ۡ;->ܳ()V

    .line 226
    invoke-virtual {v3, v5}, Ll/ܺ᩷ۡ;->֫(Z)V

    const v3, 0x7f0802bd

    const v5, 0x7f0802c1

    .line 227
    invoke-virtual {v0, v3, v5}, Ll/᩵᩷ۡ;->֫(II)Ll/ܺ᩷ۡ;

    const/16 v3, 0xc8

    .line 228
    invoke-static {v3}, Ll/ۡۤۡ;->֫(I)Ll/ۡۤۡ;

    move-result-object v3

    .line 229
    new-instance v5, Ll/᩵᩵᩷;

    const/4 v6, 0x0

    invoke-direct {v5, v3, p0, v0, v6}, Ll/᩵᩵᩷;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 251
    new-instance v3, Ll/֡᩵᩷;

    invoke-direct {v3, v0, p0}, Ll/֡᩵᩷;-><init>(Ll/᩵᩷ۡ;Ll/᩵֡᩷;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    const v0, 0x7f0a04e6

    .line 289
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ll/᩻ۡۡ;

    iput-object v0, p0, Ll/᩵֡᩷;->᩶ۧ:Ll/᩻ۡۡ;

    .line 290
    invoke-virtual {v0, v2}, Ll/᩻ۡۡ;->֫(Z)V

    .line 291
    iget-object v0, p0, Ll/᩵֡᩷;->᩶ۧ:Ll/᩻ۡۡ;

    if-eqz v0, :cond_3

    new-instance v1, Ll/ۜ֡᩷;

    invoke-direct {v1, p0}, Ll/ۜ֡᩷;-><init>(Ll/᩵֡᩷;)V

    invoke-virtual {v0, v1}, Ll/᩻ۡۡ;->֫(Ll/ܿۡۡ;)V

    .line 320
    new-instance v0, Ll/ۧܶܿ;

    new-instance v1, Ll/ۚ᩵᩷;

    invoke-direct {v1, p0}, Ll/ۚ᩵᩷;-><init>(Ll/᩵֡᩷;)V

    invoke-direct {v0, p0, v1}, Ll/ۧܶܿ;-><init>(Ll/ۗܺ᩷;Ljava/lang/Runnable;)V

    iput-object v0, p0, Ll/᩵֡᩷;->ܿۧ:Ll/ۧܶܿ;

    .line 326
    new-instance v0, Ll/֨᩵᩷;

    invoke-direct {v0, p0}, Ll/֨᩵᩷;-><init>(Ll/᩵֡᩷;)V

    .line 824
    invoke-static {p0, v0}, Ll/۠᩹᩷;->֫(Ll/᩻ܽ;Ll/᩵᩹᩷;)Ll/ۚ᩹᩷;

    move-result-object v0

    .line 326
    iput-object v0, p0, Ll/᩵֡᩷;->֨ۧ:Ll/ۚ᩹᩷;

    .line 338
    invoke-static {p0}, Ll/֨ܶܿ;->֫(Ll/ۗܺ᩷;)V

    .line 341
    invoke-static {}, Ll/᩶ۖ᩷;->ۧ()V

    .line 344
    invoke-static {}, Ll/ۢ֨ۢ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 345
    invoke-direct {p0, p1}, Ll/᩵֡᩷;->֫(Landroid/os/Bundle;)V

    return-void

    .line 347
    :cond_2
    new-instance v0, Ll/۬۬ܿ;

    const v1, 0x7f120528

    invoke-direct {v0, p0, v1}, Ll/۬۬ܿ;-><init>(Ll/ۗܺ᩷;I)V

    const/16 v1, 0x1f4

    invoke-virtual {v0, v1}, Ll/۬۬ܿ;->ܽ(I)V

    .line 348
    new-instance v1, Ljava/lang/Thread;

    .line 358
    new-instance v2, Ll/۠᩵᩷;

    const/4 v3, 0x0

    invoke-direct {v2, v0, p0, p1, v3}, Ll/۠᩵᩷;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 348
    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 358
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    return-void

    :cond_3
    const-string p1, "searchView"

    .line 291
    invoke-static {p1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v4

    :cond_4
    const-string p1, "bottomSlideLayout"

    .line 210
    invoke-static {p1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v4

    .line 209
    :cond_5
    invoke-static {v5}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v4

    .line 208
    :cond_6
    invoke-static {v5}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v4

    .line 185
    :cond_7
    invoke-static {v5}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v4

    :cond_8
    const-string p1, "swipeRefreshLayout"

    .line 183
    invoke-static {p1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v4

    .line 182
    :cond_9
    invoke-static {v5}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v4
.end method

.method public final onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 10

    const-string v0, "menu"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 508
    invoke-virtual {p0}, Ll/֨ܿ;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0f000c

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const v0, 0x7f0a0388

    .line 509
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object p1

    invoke-static {p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    .line 510
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 511
    invoke-interface {p1}, Landroid/view/Menu;->clear()V

    const v2, 0x7f1208bf

    const v3, 0x7f12052e

    const/4 v4, 0x0

    .line 512
    invoke-interface {p1, v0, v3, v4, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    const-string v5, "add(...)"

    invoke-static {v2, v5}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 513
    sget-object v6, Ll/᩶ۖܳ;->ۘ֫:Ll/᩶ۖܳ;

    const-string v7, "ROOT"

    invoke-static {v6, v7}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v6}, Ll/᩵֡᩷;->֫(Landroid/view/MenuItem;Ll/᩶ۖܳ;)V

    const-string v2, "/"

    .line 514
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v2, 0x7f12052f

    const v6, 0x7f1209e3

    .line 515
    invoke-interface {p1, v0, v2, v4, v6}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    invoke-static {v2, v5}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 520
    sget-object v6, Ll/᩶ۖܳ;->֡֫:Ll/᩶ۖܳ;

    const-string v7, "SDCARD"

    invoke-static {v6, v7}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v6}, Ll/᩵֡᩷;->֫(Landroid/view/MenuItem;Ll/᩶ۖܳ;)V

    .line 521
    sget-object v2, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 522
    invoke-static {}, Ll/᩵᩸ܿ;->ۧ()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۘ᩸ܿ;

    .line 523
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v8

    add-int/2addr v8, v3

    iget-object v9, v6, Ll/ۘ᩸ܿ;->ۧ:Ljava/lang/String;

    invoke-interface {p1, v0, v8, v4, v9}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v8

    invoke-static {v8, v5}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 524
    sget-object v9, Ll/᩶ۖܳ;->֡֫:Ll/᩶ۖܳ;

    invoke-static {v9, v7}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8, v9}, Ll/᩵֡᩷;->֫(Landroid/view/MenuItem;Ll/᩶ۖܳ;)V

    .line 525
    iget-object v6, v6, Ll/ۘ᩸ܿ;->ܽ:Ljava/io/File;

    invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 527
    :cond_0
    invoke-static {}, Ll/ᩴܶܿ;->ܿ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۘܶܿ;

    .line 528
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v7

    add-int/2addr v7, v3

    iget-object v8, v6, Ll/ۘܶܿ;->ܿ:Ljava/lang/String;

    invoke-interface {p1, v0, v7, v4, v8}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v7

    invoke-static {v7, v5}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 529
    sget-object v8, Ll/᩶ۖܳ;->֨:Ll/᩶ۖܳ;

    const-string v9, "FOLDER"

    invoke-static {v8, v9}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v8}, Ll/᩵֡᩷;->֫(Landroid/view/MenuItem;Ll/᩶ۖܳ;)V

    .line 530
    invoke-virtual {v6}, Ll/ۘܶܿ;->֫()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 532
    :cond_1
    iput-object v1, p0, Ll/᩵֡᩷;->۬ۧ:Ljava/util/List;

    const/4 p1, 0x1

    return p1
.end method

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 7

    const-string v0, "selectedMenuItem"

    .line 6
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 541
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f0a03ae

    const v2, 0x7f0a0381

    const v3, 0x7f0a0382

    const/4 v4, 0x1

    if-ne v0, v1, :cond_0

    .line 544
    invoke-interface {p1}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object p1

    invoke-static {p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    .line 545
    invoke-interface {p1, v3}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    .line 546
    invoke-static {}, Ll/ܿۧ᩻;->ܽ()Z

    move-result v1

    .line 545
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 547
    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    .line 548
    invoke-static {}, Ll/ܿۧ᩻;->ۧ()Z

    move-result v0

    .line 547
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    return v4

    :cond_0
    const v1, 0x7f0a036d

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-ne v0, v1, :cond_1

    const/4 p1, 0x2

    .line 610
    invoke-static {p0, v5, v6, p1}, Ll/᩵֡᩷;->֫(Ll/᩵֡᩷;ZLl/֫᩹᩵;I)V

    .line 552
    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    return v4

    :cond_1
    const v1, 0x7f0a0341

    if-ne v0, v1, :cond_6

    .line 556
    invoke-static {}, Ll/ۚ֡᩷;->֫()V

    .line 557
    iget-object p1, p0, Ll/᩵֡᩷;->᩶ۧ:Ll/᩻ۡۡ;

    const-string v0, "searchView"

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ll/᩻ۡۡ;->ܿ()Z

    move-result p1

    if-nez p1, :cond_3

    .line 558
    iget-object p1, p0, Ll/᩵֡᩷;->᩶ۧ:Ll/᩻ۡۡ;

    if-eqz p1, :cond_2

    .line 242
    invoke-virtual {p1, v6}, Ll/᩻ۡۡ;->֫(Ljava/lang/String;)V

    goto :goto_0

    .line 558
    :cond_2
    invoke-static {v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v6

    .line 560
    :cond_3
    :goto_0
    iget-object p1, p0, Ll/᩵֡᩷;->᩶ۧ:Ll/᩻ۡۡ;

    if-eqz p1, :cond_4

    .line 274
    invoke-virtual {p1, v4}, Ll/᩻ۡۡ;->ۧ(Z)V

    .line 560
    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    return v4

    :cond_4
    invoke-static {v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v6

    .line 557
    :cond_5
    invoke-static {v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v6

    :cond_6
    const v1, 0x7f0a0385

    if-ne v0, v1, :cond_7

    .line 564
    new-instance p1, Ll/ۧ֡᩷;

    invoke-direct {p1, p0}, Ll/ۧ֡᩷;-><init>(Ll/᩵֡᩷;)V

    return v4

    :cond_7
    const/4 v1, 0x4

    if-ne v0, v3, :cond_8

    .line 568
    invoke-interface {p1}, Landroid/view/MenuItem;->isChecked()Z

    move-result v0

    xor-int/2addr v0, v4

    .line 569
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 570
    invoke-static {v0}, Ll/ܿۧ᩻;->ۧ(Z)V

    .line 571
    invoke-static {p0, v4, v6, v1}, Ll/᩵֡᩷;->֫(Ll/᩵֡᩷;ZLl/֫᩹᩵;I)V

    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    return v4

    :cond_8
    if-ne v0, v2, :cond_9

    .line 575
    invoke-interface {p1}, Landroid/view/MenuItem;->isChecked()Z

    move-result v0

    xor-int/2addr v0, v4

    .line 576
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 577
    invoke-static {v0}, Ll/ܿۧ᩻;->֫(Z)V

    .line 578
    invoke-static {p0, v4, v6, v1}, Ll/᩵֡᩷;->֫(Ll/᩵֡᩷;ZLl/֫᩹᩵;I)V

    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    return v4

    :cond_9
    const v1, 0x7f0a033c

    if-ne v0, v1, :cond_a

    .line 582
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    return v4

    .line 586
    :cond_a
    invoke-interface {p1}, Landroid/view/MenuItem;->getGroupId()I

    move-result p1

    const v1, 0x7f0a0388

    if-ne p1, v1, :cond_b

    const p1, 0x7f12052e

    sub-int/2addr v0, p1

    .line 588
    iget-object p1, p0, Ll/᩵֡᩷;->۬ۧ:Ljava/util/List;

    if-ltz v0, :cond_b

    .line 589
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_b

    .line 590
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 1277
    invoke-direct {p0, p1, v6}, Ll/᩵֡᩷;->֫(Ljava/lang/String;Ll/֫᩹᩵;)V

    return v4

    :cond_b
    return v5
.end method

.method public final onResume()V
    .locals 3

    .line 483
    invoke-super {p0}, Ll/ۗܺ᩷;->onResume()V

    .line 484
    iget-boolean v0, p0, Ll/᩵֡᩷;->ۘۧ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 485
    iput-boolean v0, p0, Ll/᩵֡᩷;->ۘۧ:Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    const/4 v2, 0x4

    .line 487
    invoke-static {p0, v0, v1, v2}, Ll/᩵֡᩷;->֫(Ll/᩵֡᩷;ZLl/֫᩹᩵;I)V

    .line 489
    :goto_0
    iget-object v0, p0, Ll/᩵֡᩷;->᩷ۧ:Ll/᩵᩷ۡ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/᩵᩷ۡ;->ۡ()V

    return-void

    :cond_1
    const-string v0, "bottomToolbar"

    invoke-static {v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v1
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "outState"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 493
    invoke-super {p0, p1}, Ll/᩻ܽ;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 494
    iget-object v0, p0, Ll/᩵֡᩷;->ܰۧ:Ll/ܽܽ᩻;

    if-eqz v0, :cond_0

    .line 495
    new-instance v1, Ll/ۤۜܽ;

    invoke-direct {v1}, Ll/ۤۜܽ;-><init>()V

    .line 496
    invoke-virtual {v0, v1}, Ll/ܽܽ᩻;->֫(Ll/ۤۜܽ;)V

    const-string v0, "visitorData"

    .line 497
    invoke-virtual {v1}, Ll/ۤۜܽ;->᩻()[B

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    :cond_0
    return-void
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "FilePickerActivity"

    return-object v0
.end method

.method public final ۧ(Landroid/content/Intent;)V
    .locals 1

    .line 502
    iget-object v0, p0, Ll/᩵֡᩷;->֨ۧ:Ll/ۚ᩹᩷;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/ۚ᩹᩷;->֫(Landroid/content/Intent;)V

    return-void

    :cond_0
    const-string p1, "launcherForGrantPathPrimary"

    invoke-static {p1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method
