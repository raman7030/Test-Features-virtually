.class public final Ll/ۚۧ֡;
.super Ll/ܶ۟᩵;
.source "I4F9"


# instance fields
.field public final synthetic ۗ:Ll/᩹ۧ֡;

.field public final ۙ:Z

.field public final ᩶:I

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/᩹ۧ֡;II)V
    .locals 4

    .line 379
    iput-object p1, p0, Ll/ۚۧ֡;->ۗ:Ll/᩹ۧ֡;

    .line 380
    iget-object p1, p1, Ll/᩹ۧ֡;->ۤ:Ljava/lang/String;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object v0, v2, p1

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const-string v0, "OkHttp %s ping %08x%08x"

    invoke-direct {p0, v0, v2}, Ll/ܶ۟᩵;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 381
    iput-boolean p1, p0, Ll/ۚۧ֡;->ۙ:Z

    .line 382
    iput p2, p0, Ll/ۚۧ֡;->᩹:I

    .line 383
    iput p3, p0, Ll/ۚۧ֡;->᩶:I

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 387
    iget v0, p0, Ll/ۚۧ֡;->᩹:I

    iget v1, p0, Ll/ۚۧ֡;->᩶:I

    iget-object v2, p0, Ll/ۚۧ֡;->ۗ:Ll/᩹ۧ֡;

    iget-boolean v3, p0, Ll/ۚۧ֡;->ۙ:Z

    invoke-virtual {v2, v0, v1, v3}, Ll/᩹ۧ֡;->֫(IIZ)V

    return-void
.end method
