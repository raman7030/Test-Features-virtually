.class public final Ll/ۡۤܿ;
.super Ll/۟ܶۡ;
.source "964K"


# instance fields
.field public ۜ:Landroid/content/pm/PackageManager;

.field public final synthetic ۢ:Landroid/view/View;

.field public ܳ:Ljava/lang/String;

.field public final synthetic ᩷:Ll/᩵ۤܿ;

.field public ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩵ۤܿ;Landroid/view/View;)V
    .locals 0

    .line 596
    iput-object p1, p0, Ll/ۡۤܿ;->᩷:Ll/᩵ۤܿ;

    iput-object p2, p0, Ll/ۡۤܿ;->ۢ:Landroid/view/View;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    .line 599
    invoke-static {}, Ll/ۙ᩸᩷;->ۘ()Landroid/content/pm/PackageManager;

    move-result-object p1

    iput-object p1, p0, Ll/ۡۤܿ;->ۜ:Landroid/content/pm/PackageManager;

    return-void
.end method

.method public static synthetic ֫(Ll/ۡۤܿ;)V
    .locals 2

    .line 605
    iget-object v0, p0, Ll/ۡۤܿ;->᩷:Ll/᩵ۤܿ;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ll/᩵ۤܿ;->ۧ(Ll/᩵ۤܿ;Z)V

    .line 606
    iget-object p0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-virtual {p0}, Ll/۬۬ܿ;->֫()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 6

    .line 671
    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-virtual {v0}, Ll/۬۬ܿ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 673
    :cond_0
    iget-object v0, p0, Ll/ۡۤܿ;->ܳ:Ljava/lang/String;

    const v1, 0x7f1204b4

    const/4 v2, 0x0

    const v3, 0x7f120b7b

    iget-object v4, p0, Ll/ۡۤܿ;->᩷:Ll/᩵ۤܿ;

    if-nez v0, :cond_1

    .line 674
    invoke-static {v4}, Ll/᩵ۤܿ;->ܺ(Ll/᩵ۤܿ;)Ll/ܽۢܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    invoke-virtual {v0, v3}, Ll/᩵ۚۢ;->ۧ(I)V

    const v3, 0x7f12005e

    .line 675
    invoke-virtual {v0, v3}, Ll/᩵ۚۢ;->֫(I)V

    const v3, 0x7f120189

    .line 676
    invoke-virtual {v0, v3, v2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v2, Ll/ۜۤܿ;

    invoke-direct {v2, p0}, Ll/ۜۤܿ;-><init>(Ll/ۡۤܿ;)V

    .line 677
    invoke-virtual {v0, v1, v2}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 678
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v0

    .line 679
    invoke-static {v0}, Ll/ۡܶۡ;->֫(Ll/֡ۚۢ;)V

    return-void

    .line 682
    :cond_1
    iget-object v5, p0, Ll/ۡۤܿ;->᩻:Ljava/lang/String;

    if-eqz v5, :cond_2

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const v0, 0x7f120067

    goto :goto_0

    .line 684
    :cond_2
    invoke-static {v4}, Ll/᩵ۤܿ;->ۡ(Ll/᩵ۤܿ;)Z

    move-result v0

    if-eqz v0, :cond_3

    const v0, 0x7f12005d

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_4

    const/4 v0, 0x1

    .line 688
    invoke-static {v4, v0}, Ll/᩵ۤܿ;->ۧ(Ll/᩵ۤܿ;Z)V

    return-void

    .line 691
    :cond_4
    invoke-static {v4}, Ll/᩵ۤܿ;->ܺ(Ll/᩵ۤܿ;)Ll/ܽۢܳ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v4

    invoke-virtual {v4, v3}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 692
    invoke-virtual {v4, v0}, Ll/᩵ۚۢ;->֫(I)V

    new-instance v0, Ll/᩷ۤܿ;

    invoke-direct {v0, p0}, Ll/᩷ۤܿ;-><init>(Ll/ۡۤܿ;)V

    const v3, 0x7f12070a

    .line 693
    invoke-virtual {v4, v3, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f12015e

    .line 699
    invoke-virtual {v4, v0, v2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v0, Ll/ۢۤܿ;

    invoke-direct {v0, p0}, Ll/ۢۤܿ;-><init>(Ll/ۡۤܿ;)V

    .line 700
    invoke-virtual {v4, v1, v0}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 701
    invoke-virtual {v4}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v0

    .line 702
    invoke-static {v0}, Ll/ۡܶۡ;->֫(Ll/֡ۚۢ;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 709
    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-virtual {v0}, Ll/۬۬ܿ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 711
    :cond_0
    iget-object v0, p0, Ll/ۡۤܿ;->᩷:Ll/᩵ۤܿ;

    invoke-static {v0}, Ll/᩵ۤܿ;->ܺ(Ll/᩵ۤܿ;)Ll/ܽۢܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 603
    iget-object v0, p0, Ll/ۡۤܿ;->᩷:Ll/᩵ۤܿ;

    invoke-static {v0}, Ll/᩵ۤܿ;->ܺ(Ll/᩵ۤܿ;)Ll/ܽۢܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    const v1, 0x7f12006a

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    .line 604
    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    new-instance v1, Ll/᩻ۤܿ;

    invoke-direct {v1, p0}, Ll/᩻ۤܿ;-><init>(Ll/ۡۤܿ;)V

    invoke-virtual {v0, v1}, Ll/۬۬ܿ;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ܿ()V
    .locals 9

    .line 615
    iget-object v0, p0, Ll/ۡۤܿ;->ۜ:Landroid/content/pm/PackageManager;

    iget-object v1, p0, Ll/ۡۤܿ;->᩷:Ll/᩵ۤܿ;

    const/4 v2, 0x0

    :try_start_0
    invoke-static {v1}, Ll/᩵ۤܿ;->ܳ(Ll/᩵ۤܿ;)Ll/ۘܶۡ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۘܶۡ;->ܳ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    .line 616
    iget v4, v3, Landroid/content/pm/PackageInfo;->versionCode:I

    int-to-long v4, v4

    invoke-static {v1}, Ll/᩵ۤܿ;->ܳ(Ll/᩵ۤܿ;)Ll/ۘܶۡ;

    move-result-object v6

    invoke-virtual {v6}, Ll/ۘܶۡ;->᩷()J

    move-result-wide v6

    cmp-long v8, v4, v6

    if-lez v8, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-static {v1, v4}, Ll/᩵ۤܿ;->֫(Ll/᩵ۤܿ;Z)V

    .line 617
    iget-object v3, v3, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    const/4 v3, 0x0

    goto :goto_1

    .line 619
    :catch_0
    invoke-static {v1, v2}, Ll/᩵ۤܿ;->֫(Ll/᩵ۤܿ;Z)V

    const-string v3, ""

    .line 624
    :goto_1
    invoke-static {v1}, Ll/᩵ۤܿ;->ۡ(Ll/᩵ۤܿ;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {}, Ll/᩵ۤܿ;->֫()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 625
    invoke-static {}, Ll/᩷֨ܿ;->ܿ()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-static {}, Ll/᩷֨ܿ;->ܳ()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 1452
    invoke-static {}, Ll/᩵ܶ᩷;->ܽ()Ll/᩵ܶ᩷;

    move-result-object v4

    const-string v5, "disable_install_by_shizuku"

    .line 1453
    invoke-virtual {v4, v5}, Ll/᩵ܶ᩷;->֫(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 625
    invoke-static {}, Ll/᩷֨ܿ;->ᩳ()I

    move-result v4

    if-eqz v4, :cond_2

    .line 626
    :cond_1
    invoke-static {v1, v2}, Ll/᩵ۤܿ;->֫(Ll/᩵ۤܿ;Z)V

    .line 629
    :cond_2
    :goto_2
    invoke-static {v1}, Ll/᩵ۤܿ;->ۜ(Ll/᩵ۤܿ;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v4

    if-eqz v4, :cond_4

    .line 630
    iget-object v4, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-virtual {v4}, Ll/۬۬ܿ;->ᩳ()Z

    move-result v4

    if-eqz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-wide/16 v4, 0xa

    .line 632
    invoke-static {v4, v5}, Landroid/os/SystemClock;->sleep(J)V

    goto :goto_2

    .line 634
    :cond_4
    invoke-static {v1}, Ll/᩵ۤܿ;->᩻(Ll/᩵ۤܿ;)Ll/ۙۧᩳ;

    move-result-object v4

    if-eqz v4, :cond_8

    invoke-static {v1}, Ll/᩵ۤܿ;->᩻(Ll/᩵ۤܿ;)Ll/ۙۧᩳ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۙۧᩳ;->ۡ()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-static {v1}, Ll/᩵ۤܿ;->᩻(Ll/᩵ۤܿ;)Ll/ۙۧᩳ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۙۧᩳ;->ۢ()Z

    move-result v4

    if-eqz v4, :cond_8

    .line 635
    invoke-static {}, Ll/ܳۤۡ;->ۧ()Ljava/security/MessageDigest;

    move-result-object v4

    .line 636
    invoke-static {v1}, Ll/᩵ۤܿ;->᩻(Ll/᩵ۤܿ;)Ll/ۙۧᩳ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۙۧᩳ;->ۧ()[B

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/security/MessageDigest;->update([B)V

    .line 637
    invoke-virtual {v4}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v4

    invoke-static {v4}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Ll/ۡۤܿ;->ܳ:Ljava/lang/String;

    .line 641
    iget-object v4, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-virtual {v4}, Ll/۬۬ܿ;->ᩳ()Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_3

    :cond_5
    if-eqz v3, :cond_7

    .line 644
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_3

    .line 649
    :cond_6
    :try_start_1
    new-instance v4, Ll/ۙۧᩳ;

    new-array v5, v2, [Ljava/lang/String;

    invoke-static {v3, v5}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 32
    invoke-direct {v4, v3, v2}, Ll/ۙۧᩳ;-><init>(Ll/ܶ᩵ܿ;Z)V

    .line 650
    invoke-static {}, Ll/ܳۤۡ;->ۧ()Ljava/security/MessageDigest;

    move-result-object v3

    .line 651
    invoke-virtual {v4}, Ll/ۙۧᩳ;->ۧ()[B

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/security/MessageDigest;->update([B)V

    .line 652
    invoke-virtual {v3}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v3

    invoke-static {v3}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Ll/ۡۤܿ;->᩻:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    .line 658
    :catchall_1
    :cond_7
    :try_start_2
    invoke-static {v1}, Ll/᩵ۤܿ;->ܳ(Ll/᩵ۤܿ;)Ll/ۘܶۡ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۘܶۡ;->ܳ()Ljava/lang/String;

    move-result-object v1

    const/16 v3, 0x40

    invoke-virtual {v0, v1, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 659
    iget-object v1, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    if-eqz v1, :cond_8

    .line 660
    invoke-static {}, Ll/ܳۤۡ;->ۧ()Ljava/security/MessageDigest;

    move-result-object v1

    .line 661
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    aget-object v0, v0, v2

    invoke-virtual {v0}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 662
    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {v0}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۡۤܿ;->᩻:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :catchall_2
    :cond_8
    :goto_3
    return-void
.end method

.method public final ᩳ()V
    .locals 2

    .line 716
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    .line 717
    iget-object v0, p0, Ll/ۡۤܿ;->᩷:Ll/᩵ۤܿ;

    invoke-static {v0}, Ll/᩵ۤܿ;->᩷(Ll/᩵ۤܿ;)Ll/֡ۚۢ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֡ۚۢ;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 718
    iget-object v0, p0, Ll/ۡۤܿ;->ۢ:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    :cond_0
    return-void
.end method
