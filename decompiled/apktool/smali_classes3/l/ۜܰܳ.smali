.class public final Ll/ۜܰܳ;
.super Ljava/lang/Object;
.source "A1YB"

# interfaces
.implements Ll/᩷᩻ᩳ;


# instance fields
.field public final synthetic ۗ:Ljava/util/List;

.field public final synthetic ۙ:I

.field public final synthetic ᩶:Ll/ܶ᩵ܿ;

.field public final synthetic ᩸:Ll/ܺܰܳ;

.field public final synthetic ᩹:Ll/ܶ᩵ܿ;


# direct methods
.method public constructor <init>(Ll/ܺܰܳ;Ljava/util/ArrayList;Ll/ܶ᩵ܿ;ILl/ܶ᩵ܿ;)V
    .locals 0

    .line 677
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜܰܳ;->᩸:Ll/ܺܰܳ;

    iput-object p2, p0, Ll/ۜܰܳ;->ۗ:Ljava/util/List;

    iput-object p3, p0, Ll/ۜܰܳ;->᩹:Ll/ܶ᩵ܿ;

    iput p4, p0, Ll/ۜܰܳ;->ۙ:I

    iput-object p5, p0, Ll/ۜܰܳ;->᩶:Ll/ܶ᩵ܿ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܶ᩵ܿ;)V
    .locals 2

    .line 680
    iget-object v0, p0, Ll/ۜܰܳ;->᩸:Ll/ܺܰܳ;

    iget-object v0, v0, Ll/ܺܰܳ;->᩹֫:Ll/ܽ֫᩻;

    invoke-virtual {v0, p1}, Ll/ܽ֫᩻;->֫(Ll/ܶ᩵ܿ;)V

    .line 681
    iget-object v0, p0, Ll/ۜܰܳ;->ۗ:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 682
    new-instance v1, Ll/ۡܰܳ;

    invoke-direct {v1, p1}, Ll/ۡܰܳ;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final ֫(Lnet/sf/sevenzipjbinding/IInArchive;)V
    .locals 11

    .line 689
    iget-object v0, p0, Ll/ۜܰܳ;->᩸:Ll/ܺܰܳ;

    iget-object v1, p0, Ll/ۜܰܳ;->᩹:Ll/ܶ᩵ܿ;

    :try_start_0
    invoke-interface {p1}, Lnet/sf/sevenzipjbinding/IInArchive;->getNumberOfItems()I

    move-result v2

    .line 690
    new-array v5, v2, [Ljava/lang/String;

    .line 691
    new-array v6, v2, [Ll/ۢܰܳ;

    .line 692
    sget v3, Ll/ܺܰܳ;->᩶֫:I

    .line 959
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v3

    .line 960
    invoke-static {v3}, Ll/ܿ֡ܿ;->ᩳ(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-static {v3}, Ll/ܿ֡ܿ;->ۧ(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x0

    :goto_1
    if-ge v4, v2, :cond_4

    .line 694
    invoke-static {p1, v4}, Ll/ۘܳᩳ;->֫(Lnet/sf/sevenzipjbinding/IInArchive;I)Ll/ۘܳᩳ;

    move-result-object v7

    if-eqz v3, :cond_1

    .line 695
    invoke-virtual {v7}, Ll/ۘܳᩳ;->ᩳ()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_1

    const/4 v8, 0x1

    goto :goto_2

    :cond_1
    const/4 v8, 0x0

    .line 696
    :goto_2
    invoke-virtual {v7}, Ll/ۘܳᩳ;->ܿ()Ljava/lang/String;

    move-result-object v9

    if-eqz v8, :cond_2

    const/4 v10, 0x0

    goto :goto_3

    .line 697
    :cond_2
    invoke-virtual {v7}, Ll/ۘܳᩳ;->ۢ()Z

    move-result v10

    .line 696
    :goto_3
    invoke-static {v9, v10}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v9

    .line 698
    aput-object v9, v5, v4

    if-eqz v8, :cond_3

    .line 700
    new-instance v8, Ll/ۢܰܳ;

    .line 701
    invoke-virtual {v7}, Ll/ۘܳᩳ;->ᩳ()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Ll/ܿ֡ܿ;->ܽ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 702
    invoke-virtual {v7}, Ll/ۘܳᩳ;->ۢ()Z

    move-result v7

    invoke-direct {v8, v9, v10, v7}, Ll/ۢܰܳ;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    aput-object v8, v6, v4

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 705
    :cond_4
    invoke-static {v0, v1}, Ll/ܺܰܳ;->ۧ(Ll/ܺܰܳ;Ll/ܶ᩵ܿ;)V

    .line 706
    iget v2, p0, Ll/ۜܰܳ;->ۙ:I

    iget-object v4, p0, Ll/ۜܰܳ;->᩶:Ll/ܶ᩵ܿ;

    move-object v3, p1

    invoke-static/range {v0 .. v6}, Ll/ܺܰܳ;->֫(Ll/ܺܰܳ;Ll/ܶ᩵ܿ;ILnet/sf/sevenzipjbinding/IInArchive;Ll/ܶ᩵ܿ;[Ljava/lang/String;[Ll/ۢܰܳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 708
    invoke-static {p1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {p1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 709
    throw v0
.end method

.method public final ܽ()V
    .locals 1

    .line 714
    iget-object v0, p0, Ll/ۜܰܳ;->᩸:Ll/ܺܰܳ;

    .line 288
    invoke-virtual {v0}, Ll/ۘ۠ۢ;->cancel()V

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 719
    iget-object v0, p0, Ll/ۜܰܳ;->᩸:Ll/ܺܰܳ;

    .line 301
    invoke-virtual {v0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    return v0
.end method
