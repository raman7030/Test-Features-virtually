.class public final Ll/ۗܽۢ;
.super Ljava/lang/Object;
.source "R1EE"

# interfaces
.implements Ll/᩶ۛ᩷;


# instance fields
.field public final synthetic ֫:Ljava/lang/String;

.field public final synthetic ۜ:Z

.field public final synthetic ۢ:J

.field public final synthetic ۧ:Ll/۫ۧۢ;

.field public final synthetic ܳ:Ljava/lang/String;

.field public final synthetic ܽ:Z

.field public final synthetic ܿ:Z

.field public final synthetic ᩳ:Ljava/util/function/Predicate;

.field public final synthetic ᩷:I

.field public final synthetic ᩻:Z


# direct methods
.method public constructor <init>(ILjava/lang/String;ZZZLl/۫ۧۢ;JLjava/lang/String;ZLjava/util/function/Predicate;)V
    .locals 0

    .line 623
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/ۗܽۢ;->᩷:I

    iput-object p2, p0, Ll/ۗܽۢ;->֫:Ljava/lang/String;

    iput-boolean p3, p0, Ll/ۗܽۢ;->᩻:Z

    iput-boolean p4, p0, Ll/ۗܽۢ;->ܿ:Z

    iput-boolean p5, p0, Ll/ۗܽۢ;->ܽ:Z

    iput-object p6, p0, Ll/ۗܽۢ;->ۧ:Ll/۫ۧۢ;

    iput-wide p7, p0, Ll/ۗܽۢ;->ۢ:J

    iput-object p9, p0, Ll/ۗܽۢ;->ܳ:Ljava/lang/String;

    iput-boolean p10, p0, Ll/ۗܽۢ;->ۜ:Z

    iput-object p11, p0, Ll/ۗܽۢ;->ᩳ:Ljava/util/function/Predicate;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/util/ArrayList;)Ll/֨ۛ᩷;
    .locals 3

    .line 746
    new-instance v0, Ll/֨ۛ᩷;

    iget-object v1, p0, Ll/ۗܽۢ;->ܳ:Ljava/lang/String;

    iget-object v2, p0, Ll/ۗܽۢ;->֫:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p1}, Ll/֨ۛ᩷;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method public final ֫()Ll/۠ۛ᩷;
    .locals 13

    .line 628
    new-instance v0, Ll/ۤܽۢ;

    .line 1713
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 630
    iget-boolean v1, p0, Ll/ۗܽۢ;->ܿ:Z

    iget-boolean v2, p0, Ll/ۗܽۢ;->᩻:Z

    iget-object v3, p0, Ll/ۗܽۢ;->֫:Ljava/lang/String;

    iget v4, p0, Ll/ۗܽۢ;->᩷:I

    if-eqz v4, :cond_9

    const/4 v0, 0x1

    iget-boolean v5, p0, Ll/ۗܽۢ;->ܽ:Z

    if-eq v4, v0, :cond_4

    const/4 v0, 0x2

    if-eq v4, v0, :cond_3

    const/4 v0, 0x3

    if-eq v4, v0, :cond_2

    const/4 v0, 0x4

    if-eq v4, v0, :cond_1

    const/4 v0, 0x5

    if-eq v4, v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 722
    :cond_0
    new-instance v0, Ll/᩶ܽۢ;

    iget-wide v1, p0, Ll/ۗܽۢ;->ۢ:J

    invoke-direct {v0, v1, v2}, Ll/᩶ܽۢ;-><init>(J)V

    return-object v0

    .line 661
    :cond_1
    invoke-static {v3, v2, v1}, Ll/ۗۛ᩷;->֫(Ljava/lang/String;ZZ)Ll/ܶۛ᩷;

    move-result-object v0

    .line 662
    new-instance v1, Ll/֨ܽۢ;

    invoke-direct {v1, v0, v5}, Ll/֨ܽۢ;-><init>(Ll/ܶۛ᩷;Z)V

    return-object v1

    .line 700
    :cond_2
    invoke-static {v3, v2, v1}, Ll/ۗۛ᩷;->֫(Ljava/lang/String;ZZ)Ll/ܶۛ᩷;

    move-result-object v0

    .line 701
    new-instance v1, Ll/᩸ܽۢ;

    invoke-direct {v1, v0, v5}, Ll/᩸ܽۢ;-><init>(Ll/ܶۛ᩷;Z)V

    return-object v1

    .line 711
    :cond_3
    invoke-static {v3, v2, v1}, Ll/ۗۛ᩷;->֫(Ljava/lang/String;ZZ)Ll/ܶۛ᩷;

    move-result-object v0

    .line 712
    new-instance v1, Ll/᩹ܽۢ;

    invoke-direct {v1, v0, v5}, Ll/᩹ܽۢ;-><init>(Ll/ܶۛ᩷;Z)V

    return-object v1

    .line 673
    :cond_4
    invoke-static {v3, v2, v1}, Ll/ۗۛ᩷;->ۧ(Ljava/lang/String;ZZ)Ll/ۨۘܽ;

    move-result-object v0

    .line 674
    new-instance v9, Ll/ܶۛ᩷;

    invoke-direct {v9, v0}, Ll/ܶۛ᩷;-><init>(Ll/ۨۘܽ;)V

    .line 675
    invoke-virtual {v0}, Ll/ۨۘܽ;->pattern()Ljava/lang/String;

    move-result-object v0

    if-nez v5, :cond_6

    const-string v1, "/"

    .line 676
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_0

    :cond_5
    const/4 v1, 0x0

    const/4 v11, 0x0

    goto :goto_1

    :cond_6
    :goto_0
    const/4 v1, 0x1

    const/4 v11, 0x1

    :goto_1
    if-nez v5, :cond_8

    const-string v1, "\\."

    .line 677
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_2

    :cond_7
    const/4 v0, 0x0

    const/4 v12, 0x0

    goto :goto_3

    :cond_8
    :goto_2
    const/4 v0, 0x1

    const/4 v12, 0x1

    .line 678
    :goto_3
    iget-object v0, p0, Ll/ۗܽۢ;->ۧ:Ll/۫ۧۢ;

    invoke-virtual {v0}, Ll/۫ۧۢ;->ۢ()Ljava/util/Map;

    move-result-object v8

    .line 679
    new-instance v0, Ll/۠ܽۢ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 680
    new-instance v7, Ll/ۙܽۢ;

    invoke-direct {v7, v0}, Ll/ۙܽۢ;-><init>(Ll/۠ܽۢ;)V

    .line 681
    new-instance v0, Ll/ܶܽۢ;

    iget-boolean v10, p0, Ll/ۗܽۢ;->ܽ:Z

    move-object v6, v0

    invoke-direct/range {v6 .. v12}, Ll/ܶܽۢ;-><init>(Ll/ۙܽۢ;Ljava/util/Map;Ll/ܶۛ᩷;ZZZ)V

    return-object v0

    .line 632
    :cond_9
    invoke-static {v3, v2, v1}, Ll/ۗۛ᩷;->֫(Ljava/lang/String;ZZ)Ll/ܶۛ᩷;

    move-result-object v1

    .line 633
    new-instance v2, Ll/ۚܽۢ;

    invoke-direct {v2, v0, v1}, Ll/ۚܽۢ;-><init>(Ll/ۤܽۢ;Ll/ܶۛ᩷;)V

    return-object v2
.end method

.method public final ֫(Ljava/util/concurrent/ConcurrentLinkedQueue;)V
    .locals 4

    .line 741
    iget-boolean v0, p0, Ll/ۗܽۢ;->ۜ:Z

    iget-object v1, p0, Ll/ۗܽۢ;->ᩳ:Ljava/util/function/Predicate;

    iget-object v2, p0, Ll/ۗܽۢ;->ۧ:Ll/۫ۧۢ;

    iget-object v3, p0, Ll/ۗܽۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {v2, p1, v3, v0, v1}, Ll/۫ۧۢ;->֫(Ljava/util/concurrent/ConcurrentLinkedQueue;Ljava/lang/String;ZLjava/util/function/Predicate;)V

    return-void
.end method
