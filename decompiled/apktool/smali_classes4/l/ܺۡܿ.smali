.class public final Ll/ܺۡܿ;
.super Ljava/lang/Object;
.source "Q6ZO"


# instance fields
.field public final ֫:Z

.field public final ۧ:Ll/ᩳۢܿ;

.field public final ܳ:Ll/ۢۖܿ;

.field public final ܽ:Ll/᩺ۢܿ;

.field public final ܿ:Z

.field public final ᩳ:Ll/᩺ۖܿ;

.field public final ᩻:Ll/۟ۖܿ;


# direct methods
.method public constructor <init>(Ll/᩺ۢܿ;Ll/ۢۖܿ;Ll/ᩳۢܿ;Ll/۟ۖܿ;Ll/᩺ۖܿ;ZZ)V
    .locals 1

    .line 493
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "definition"

    .line 494
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ܺۡܿ;->ܽ:Ll/᩺ۢܿ;

    .line 495
    iput-object p2, p0, Ll/ܺۡܿ;->ܳ:Ll/ۢۖܿ;

    .line 496
    iput-object p3, p0, Ll/ܺۡܿ;->ۧ:Ll/ᩳۢܿ;

    .line 497
    iput-object p4, p0, Ll/ܺۡܿ;->᩻:Ll/۟ۖܿ;

    .line 498
    iput-object p5, p0, Ll/ܺۡܿ;->ᩳ:Ll/᩺ۖܿ;

    .line 499
    iput-boolean p6, p0, Ll/ܺۡܿ;->ܿ:Z

    .line 500
    iput-boolean p7, p0, Ll/ܺۡܿ;->֫:Z

    return-void
.end method

.method public static ֫(Ll/᩺ۢܿ;)Ll/ܺۡܿ;
    .locals 9

    .line 504
    new-instance v8, Ll/ܺۡܿ;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v8

    move-object v1, p0

    invoke-direct/range {v0 .. v7}, Ll/ܺۡܿ;-><init>(Ll/᩺ۢܿ;Ll/ۢۖܿ;Ll/ᩳۢܿ;Ll/۟ۖܿ;Ll/᩺ۖܿ;ZZ)V

    return-object v8
.end method

.method public static ֫(Ll/᩺ۢܿ;Ll/۟ۖܿ;Ll/᩺ۖܿ;)Ll/ܺۡܿ;
    .locals 9

    .line 517
    new-instance v8, Ll/ܺۡܿ;

    invoke-virtual {p1}, Ll/۟ۖܿ;->ܽ()Ll/ۢۖܿ;

    move-result-object v2

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v3, 0x0

    move-object v0, v8

    move-object v1, p0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v7}, Ll/ܺۡܿ;-><init>(Ll/᩺ۢܿ;Ll/ۢۖܿ;Ll/ᩳۢܿ;Ll/۟ۖܿ;Ll/᩺ۖܿ;ZZ)V

    return-object v8
.end method

.method public static ֫(Ll/᩺ۢܿ;Ll/ۢۖܿ;Ll/ᩳۢܿ;Ll/᩺ۖܿ;)Ll/ܺۡܿ;
    .locals 9

    .line 510
    new-instance v8, Ll/ܺۡܿ;

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v4, 0x0

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v7}, Ll/ܺۡܿ;-><init>(Ll/᩺ۢܿ;Ll/ۢۖܿ;Ll/ᩳۢܿ;Ll/۟ۖܿ;Ll/᩺ۖܿ;ZZ)V

    return-object v8
.end method


# virtual methods
.method public final ֫()Ll/ᩳۢܿ;
    .locals 1

    .line 532
    iget-object v0, p0, Ll/ܺۡܿ;->ۧ:Ll/ᩳۢܿ;

    return-object v0
.end method

.method public final ۧ()Ll/᩺ۢܿ;
    .locals 1

    .line 522
    iget-object v0, p0, Ll/ܺۡܿ;->ܽ:Ll/᩺ۢܿ;

    return-object v0
.end method

.method public final ܳ()Z
    .locals 1

    .line 551
    iget-boolean v0, p0, Ll/ܺۡܿ;->֫:Z

    return v0
.end method

.method public final ܽ()Ll/᩺ۖܿ;
    .locals 1

    .line 543
    iget-object v0, p0, Ll/ܺۡܿ;->ᩳ:Ll/᩺ۖܿ;

    return-object v0
.end method

.method public final ܿ()Ll/۟ۖܿ;
    .locals 1

    .line 537
    iget-object v0, p0, Ll/ܺۡܿ;->᩻:Ll/۟ۖܿ;

    return-object v0
.end method

.method public final ᩳ()Ll/ۢۖܿ;
    .locals 1

    .line 527
    iget-object v0, p0, Ll/ܺۡܿ;->ܳ:Ll/ۢۖܿ;

    return-object v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 547
    iget-boolean v0, p0, Ll/ܺۡܿ;->ܿ:Z

    return v0
.end method
