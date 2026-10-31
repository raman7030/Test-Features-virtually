.class public final synthetic Ll/ۧܽۢ;
.super Ljava/lang/Object;
.source "R1EE"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:Ll/ۗܿۢ;

.field public final synthetic ۙ:Ll/۫ۧۢ;

.field public final synthetic ۛ:Z

.field public final synthetic ۤ:Ljava/lang/String;

.field public final synthetic ۫:Z

.field public final synthetic ۬:Ll/᩸ۛ᩷;

.field public final synthetic ᩶:Z

.field public final synthetic ᩸:Ljava/lang/String;

.field public final synthetic ᩹:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ZZLl/۫ۧۢ;Ll/ۗܿۢ;Ll/᩸ۛ᩷;ZLjava/lang/String;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧܽۢ;->᩸:Ljava/lang/String;

    iput-boolean p2, p0, Ll/ۧܽۢ;->᩹:Z

    iput-boolean p3, p0, Ll/ۧܽۢ;->᩶:Z

    iput-object p4, p0, Ll/ۧܽۢ;->ۙ:Ll/۫ۧۢ;

    iput-object p5, p0, Ll/ۧܽۢ;->ۗ:Ll/ۗܿۢ;

    iput-object p6, p0, Ll/ۧܽۢ;->۬:Ll/᩸ۛ᩷;

    iput-boolean p7, p0, Ll/ۧܽۢ;->۫:Z

    iput-object p8, p0, Ll/ۧܽۢ;->ۤ:Ljava/lang/String;

    iput-boolean p9, p0, Ll/ۧܽۢ;->ۛ:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 16

    move-object/from16 v0, p0

    .line 847
    new-instance v11, Ll/᩹ۛ᩷;

    .line 180
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 851
    iget-object v1, v0, Ll/ۧܽۢ;->᩸:Ljava/lang/String;

    iget-boolean v8, v0, Ll/ۧܽۢ;->᩹:Z

    iget-boolean v2, v0, Ll/ۧܽۢ;->᩶:Z

    invoke-static {v1, v8, v2}, Ll/ۗۛ᩷;->֫(Ljava/lang/String;ZZ)Ll/ܶۛ᩷;

    move-result-object v5

    .line 854
    new-instance v2, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 855
    iget-object v12, v0, Ll/ۧܽۢ;->ۙ:Ll/۫ۧۢ;

    const-string v1, ""

    const/4 v13, 0x1

    iget-object v3, v0, Ll/ۧܽۢ;->ۗ:Ll/ۗܿۢ;

    invoke-virtual {v12, v2, v1, v13, v3}, Ll/۫ۧۢ;->֫(Ljava/util/concurrent/ConcurrentLinkedQueue;Ljava/lang/String;ZLjava/util/function/Predicate;)V

    .line 859
    iget-object v14, v0, Ll/ۧܽۢ;->۬:Ll/᩸ۛ᩷;

    const/4 v15, 0x0

    invoke-interface {v14, v15}, Ll/᩸ۛ᩷;->ۧ(I)V

    .line 860
    new-instance v4, Ll/᩵ۛۡ;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result v1

    int-to-long v6, v1

    invoke-direct {v4, v6, v7}, Ll/᩵ۛۡ;-><init>(J)V

    new-instance v1, Ll/᩸᩸ۜ;

    invoke-direct {v1, v14}, Ll/᩸᩸ۜ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v4, v1}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    .line 863
    new-instance v10, Ll/ܳܽۢ;

    iget-boolean v6, v0, Ll/ۧܽۢ;->۫:Z

    iget-object v7, v0, Ll/ۧܽۢ;->ۤ:Ljava/lang/String;

    iget-boolean v9, v0, Ll/ۧܽۢ;->ۛ:Z

    move-object v1, v10

    move-object v3, v14

    move-object v13, v10

    move-object v10, v11

    invoke-direct/range {v1 .. v10}, Ll/ܳܽۢ;-><init>(Ljava/util/concurrent/ConcurrentLinkedQueue;Ll/᩸ۛ᩷;Ll/᩵ۛۡ;Ll/ܶۛ᩷;ZLjava/lang/String;ZZLl/᩹ۛ᩷;)V

    .line 884
    invoke-virtual {v12}, Ll/۫ۧۢ;->֨()V

    .line 885
    invoke-virtual {v12, v15}, Ll/۫ۧۢ;->֫(Z)V

    .line 887
    sget v1, Ll/ܿ᩸ۡ;->֫:I

    int-to-float v1, v1

    const v2, 0x3f28f5c3    # 0.66f

    mul-float v1, v1, v2

    float-to-int v1, v1

    invoke-static {v1, v13}, Ll/ۗۛ᩷;->֫(ILjava/lang/Runnable;)V

    const/4 v1, 0x1

    .line 889
    invoke-virtual {v12, v1}, Ll/۫ۧۢ;->֫(Z)V

    .line 890
    invoke-virtual {v12}, Ll/۫ۧۢ;->ܶ()V

    .line 892
    new-instance v1, Ll/ᩳ᩹᩷;

    const/4 v2, 0x2

    invoke-direct {v1, v2, v14, v11}, Ll/ᩳ᩹᩷;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method
