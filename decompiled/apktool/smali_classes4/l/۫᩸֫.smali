.class public final Ll/۫᩸֫;
.super Ll/ܶܳۧ;
.source "98FL"


# direct methods
.method public constructor <init>(JLandroid/os/Handler;Ll/ܽۜۧ;I)V
    .locals 0

    .line 69
    invoke-direct/range {p0 .. p5}, Ll/ܶܳۧ;-><init>(JLandroid/os/Handler;Ll/ܽۜۧ;I)V

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "ExperimentalFfmpegVideoRenderer"

    return-object v0
.end method

.method public final ֫(Ll/۠ᩴ֫;)I
    .locals 0

    const/4 p1, 0x0

    .line 245
    invoke-static {p1, p1, p1, p1}, Ll/ۧ۬֫;->֫(IIII)I

    move-result p1

    return p1
.end method

.method public final ֫(Ljava/lang/String;Ll/۠ᩴ֫;Ll/۠ᩴ֫;)Ll/۬᩹֫;
    .locals 8

    .line 130
    iget-object v0, p2, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    iget-object v1, p3, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    .line 132
    new-instance v7, Ll/۬᩹֫;

    if-eqz v0, :cond_0

    const/4 v1, 0x3

    const/4 v5, 0x3

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    const/4 v5, 0x0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x0

    const/4 v6, 0x0

    goto :goto_1

    :cond_1
    const/16 v0, 0x8

    const/16 v6, 0x8

    :goto_1
    move-object v1, v7

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    .line 137
    invoke-direct/range {v1 .. v6}, Ll/۬᩹֫;-><init>(Ljava/lang/String;Ll/۠ᩴ֫;Ll/۠ᩴ֫;II)V

    return-object v7
.end method

.method public final ۧ(Ll/۠ᩴ֫;)Ll/֨᩸֫;
    .locals 0

    const-string p1, "createFfmpegVideoDecoder"

    .line 38
    invoke-static {p1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 49
    invoke-static {}, Landroid/os/Trace;->endSection()V

    const/4 p1, 0x0

    return-object p1
.end method
