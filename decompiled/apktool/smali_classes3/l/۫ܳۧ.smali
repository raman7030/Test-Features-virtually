.class public final Ll/۫ܳۧ;
.super Ljava/lang/Object;
.source "D8IT"


# instance fields
.field public ֫:Ll/۠ᩴ֫;

.field public final synthetic ۧ:Ll/ۤܳۧ;


# direct methods
.method public constructor <init>(Ll/ۤܳۧ;)V
    .locals 0

    .line 266
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ܳۧ;->ۧ:Ll/ۤܳۧ;

    return-void
.end method


# virtual methods
.method public final ֫(JJZ)V
    .locals 8

    .line 283
    iget-object v0, p0, Ll/۫ܳۧ;->ۧ:Ll/ۤܳۧ;

    if-eqz p5, :cond_0

    invoke-static {v0}, Ll/ۤܳۧ;->ᩳ(Ll/ۤܳۧ;)Landroid/view/Surface;

    move-result-object p5

    if-eqz p5, :cond_0

    .line 284
    invoke-static {v0}, Ll/ۤܳۧ;->ܽ(Ll/ۤܳۧ;)Ljava/util/concurrent/Executor;

    move-result-object p5

    new-instance v1, Ll/ۙܳۧ;

    invoke-direct {v1, p0}, Ll/ۙܳۧ;-><init>(Ll/۫ܳۧ;)V

    invoke-interface {p5, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 288
    :cond_0
    iget-object p5, p0, Ll/۫ܳۧ;->֫:Ll/۠ᩴ֫;

    if-nez p5, :cond_1

    new-instance p5, Ll/֨ᩴ֫;

    invoke-direct {p5}, Ll/֨ᩴ֫;-><init>()V

    invoke-virtual {p5}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p5

    :cond_1
    move-object v6, p5

    .line 289
    invoke-static {v0}, Ll/ۤܳۧ;->ܳ(Ll/ۤܳۧ;)Ll/᩹᩻ۧ;

    move-result-object v1

    const/4 v7, 0x0

    move-wide v2, p3

    move-wide v4, p1

    invoke-interface/range {v1 .. v7}, Ll/᩹᩻ۧ;->֫(JJLl/۠ᩴ֫;Landroid/media/MediaFormat;)V

    .line 294
    invoke-static {v0}, Ll/ۤܳۧ;->ܿ(Ll/ۤܳۧ;)Ljava/util/ArrayDeque;

    move-result-object p3

    invoke-virtual {p3}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ܳۜۧ;

    invoke-interface {p3, p1, p2}, Ll/ܳۜۧ;->֫(J)V

    return-void
.end method

.method public final ֫(Ll/ۜ֡֫;)V
    .locals 2

    .line 272
    new-instance v0, Ll/֨ᩴ֫;

    invoke-direct {v0}, Ll/֨ᩴ֫;-><init>()V

    iget v1, p1, Ll/ۜ֡֫;->ܽ:I

    .line 274
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ۙ(I)V

    iget v1, p1, Ll/ۜ֡֫;->֫:I

    .line 275
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ۡ(I)V

    const-string v1, "video/raw"

    .line 276
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 277
    invoke-virtual {v0}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v0

    iput-object v0, p0, Ll/۫ܳۧ;->֫:Ll/۠ᩴ֫;

    .line 278
    iget-object v0, p0, Ll/۫ܳۧ;->ۧ:Ll/ۤܳۧ;

    invoke-static {v0}, Ll/ۤܳۧ;->ܽ(Ll/ۤܳۧ;)Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Ll/۬ܳۧ;

    invoke-direct {v1, p0, p1}, Ll/۬ܳۧ;-><init>(Ll/۫ܳۧ;Ll/ۜ֡֫;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
