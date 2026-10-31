.class public final Ll/ۢۤ֫;
.super Ljava/lang/Object;
.source "68UW"


# instance fields
.field public final ֫:Ll/ۘ֡֫;

.field public final ۜ:I

.field public final ۡ:I

.field public final ۢ:I

.field public final ۧ:I

.field public final ܳ:I

.field public final ܺ:Z

.field public final ܽ:Z

.field public final ܿ:Ll/۠ᩴ֫;

.field public final ᩳ:Z

.field public final ᩷:I

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ll/۠ᩴ֫;IIIIIIILl/ۘ֡֫;ZZZ)V
    .locals 0

    .line 2327
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2328
    iput-object p1, p0, Ll/ۢۤ֫;->ܿ:Ll/۠ᩴ֫;

    .line 2329
    iput p2, p0, Ll/ۢۤ֫;->ܳ:I

    .line 2330
    iput p3, p0, Ll/ۢۤ֫;->᩷:I

    .line 2331
    iput p4, p0, Ll/ۢۤ֫;->ۢ:I

    .line 2332
    iput p5, p0, Ll/ۢۤ֫;->ۡ:I

    .line 2333
    iput p6, p0, Ll/ۢۤ֫;->᩻:I

    .line 2334
    iput p7, p0, Ll/ۢۤ֫;->ۜ:I

    .line 2335
    iput p8, p0, Ll/ۢۤ֫;->ۧ:I

    .line 2336
    iput-object p9, p0, Ll/ۢۤ֫;->֫:Ll/ۘ֡֫;

    .line 2337
    iput-boolean p10, p0, Ll/ۢۤ֫;->ܽ:Z

    .line 2338
    iput-boolean p11, p0, Ll/ۢۤ֫;->ᩳ:Z

    .line 2339
    iput-boolean p12, p0, Ll/ۢۤ֫;->ܺ:Z

    return-void
.end method


# virtual methods
.method public final ֫()Ll/֨۫֫;
    .locals 8

    .line 2378
    new-instance v7, Ll/֨۫֫;

    iget v0, p0, Ll/ۢۤ֫;->᩷:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v6, 0x0

    :goto_0
    iget v4, p0, Ll/ۢۤ֫;->ۧ:I

    iget v1, p0, Ll/ۢۤ֫;->ۜ:I

    iget v2, p0, Ll/ۢۤ֫;->ۡ:I

    iget v3, p0, Ll/ۢۤ֫;->᩻:I

    iget-boolean v5, p0, Ll/ۢۤ֫;->ܺ:Z

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Ll/֨۫֫;-><init>(IIIIZZ)V

    return-object v7
.end method
