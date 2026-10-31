.class public final Ll/ۤۗۜ;
.super Ljava/lang/Object;
.source "M799"

# interfaces
.implements Ll/۬ۗۜ;


# instance fields
.field public final ֫:Landroid/content/Context;

.field public ۧ:Ll/۬ۗۜ;

.field public final ܽ:Ll/۫֡ۜ;

.field public ᩳ:Ll/᩺ܶۜ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ll/۫֡ۜ;Ll/᩺ܶۜ;)V
    .locals 0

    .line 638
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 639
    iput-object p1, p0, Ll/ۤۗۜ;->֫:Landroid/content/Context;

    .line 640
    iput-object p2, p0, Ll/ۤۗۜ;->ܽ:Ll/۫֡ۜ;

    .line 641
    iput-object p3, p0, Ll/ۤۗۜ;->ᩳ:Ll/᩺ܶۜ;

    return-void
.end method


# virtual methods
.method public final ֫(JIILl/᩶ۗۜ;)Landroid/graphics/Bitmap;
    .locals 8

    .line 661
    iget-object v0, p0, Ll/ۤۗۜ;->ۧ:Ll/۬ۗۜ;

    if-eqz v0, :cond_0

    move-wide v1, p1

    move v3, p3

    move v4, p4

    move-object v5, p5

    .line 663
    invoke-interface/range {v0 .. v5}, Ll/۬ۗۜ;->֫(JIILl/᩶ۗۜ;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    .line 666
    :cond_0
    iget-object v0, p0, Ll/ۤۗۜ;->ᩳ:Ll/᩺ܶۜ;

    if-eqz v0, :cond_1

    move-wide v1, p1

    move v3, p3

    move v4, p4

    move-object v5, p5

    .line 669
    :try_start_0
    invoke-virtual/range {v0 .. v5}, Ll/᩺ܶۜ;->֫(JIILl/᩶ۗۜ;)Landroid/graphics/Bitmap;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/InterruptedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 678
    :catch_0
    invoke-interface {p5}, Ll/᩶ۗۜ;->֫()V

    goto :goto_0

    :catch_1
    move-exception p1

    .line 676
    throw p1

    .line 688
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ۤۗۜ;->ᩳ:Ll/᩺ܶۜ;

    const/4 v1, 0x0

    .line 689
    iput-object v1, p0, Ll/ۤۗۜ;->ᩳ:Ll/᩺ܶۜ;

    .line 690
    invoke-static {v0}, Ll/᩺ۗۜ;->֫(Ll/۬ۗۜ;)V

    .line 691
    iget-object v0, p0, Ll/ۤۗۜ;->֫:Landroid/content/Context;

    iget-object v1, p0, Ll/ۤۗۜ;->ܽ:Ll/۫֡ۜ;

    invoke-static {v0, v1}, Ll/۫ۗۜ;->֫(Landroid/content/Context;Ll/۫֡ۜ;)Ll/۬ۗۜ;

    move-result-object v2

    .line 692
    iput-object v2, p0, Ll/ۤۗۜ;->ۧ:Ll/۬ۗۜ;

    move-wide v3, p1

    move v5, p3

    move v6, p4

    move-object v7, p5

    .line 681
    invoke-interface/range {v2 .. v7}, Ll/۬ۗۜ;->֫(JIILl/᩶ۗۜ;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()V
    .locals 3

    .line 719
    iget-object v0, p0, Ll/ۤۗۜ;->ᩳ:Ll/᩺ܶۜ;

    .line 720
    iget-object v1, p0, Ll/ۤۗۜ;->ۧ:Ll/۬ۗۜ;

    const/4 v2, 0x0

    .line 721
    iput-object v2, p0, Ll/ۤۗۜ;->ᩳ:Ll/᩺ܶۜ;

    .line 722
    iput-object v2, p0, Ll/ۤۗۜ;->ۧ:Ll/۬ۗۜ;

    .line 723
    invoke-static {v0}, Ll/᩺ۗۜ;->֫(Ll/۬ۗۜ;)V

    .line 724
    invoke-static {v1}, Ll/᩺ۗۜ;->֫(Ll/۬ۗۜ;)V

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 705
    iget-object v0, p0, Ll/ۤۗۜ;->ᩳ:Ll/᩺ܶۜ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()V
    .locals 1

    .line 711
    iget-object v0, p0, Ll/ۤۗۜ;->ᩳ:Ll/᩺ܶۜ;

    if-eqz v0, :cond_0

    .line 713
    invoke-virtual {v0}, Ll/᩺ܶۜ;->ܽ()V

    :cond_0
    return-void
.end method

.method public final ᩳ()Ll/ܰۗۜ;
    .locals 1

    .line 699
    iget-object v0, p0, Ll/ۤۗۜ;->ۧ:Ll/۬ۗۜ;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll/ۤۗۜ;->ᩳ:Ll/᩺ܶۜ;

    :goto_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    .line 700
    :cond_1
    invoke-interface {v0}, Ll/۬ۗۜ;->ᩳ()Ll/ܰۗۜ;

    move-result-object v0

    return-object v0
.end method
