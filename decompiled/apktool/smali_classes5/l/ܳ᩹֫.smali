.class public final Ll/ܳ᩹֫;
.super Ll/ܰ۫֫;
.source "08E1"


# instance fields
.field public final ۟֫:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Ll/ۚ۫֫;Ll/ۙ۫֫;)V
    .locals 0

    .line 51
    invoke-direct {p0, p2, p3, p4}, Ll/ܰ۫֫;-><init>(Landroid/os/Handler;Ll/ۚ۫֫;Ll/ۙ۫֫;)V

    .line 52
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ll/ܳ᩹֫;->۟֫:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "MidiRenderer"

    return-object v0
.end method

.method public final ֫(Ll/֨᩸֫;)Ll/۠ᩴ֫;
    .locals 2

    .line 31
    check-cast p1, Ll/ۧ᩹֫;

    .line 91
    sget p1, Ll/ۧ᩹֫;->᩹:I

    const/4 p1, 0x2

    const v0, 0xac44

    const/4 v1, 0x4

    .line 72
    invoke-static {v1, p1, v0}, Ll/ۘ֨֫;->ܽ(III)Ll/۠ᩴ֫;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/۠ᩴ֫;)Ll/֨᩸֫;
    .locals 1

    .line 81
    new-instance p1, Ll/ۧ᩹֫;

    iget-object v0, p0, Ll/ܳ᩹֫;->۟֫:Landroid/content/Context;

    invoke-direct {p1, v0}, Ll/ۧ᩹֫;-><init>(Landroid/content/Context;)V

    return-object p1
.end method

.method public final ܿ(Ll/۠ᩴ֫;)I
    .locals 2

    const-string v0, "audio/x-exoplayer-midi"

    .line 62
    iget-object p1, p1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 66
    :cond_0
    sget p1, Ll/ۧ᩹֫;->᩹:I

    const/4 p1, 0x2

    const v0, 0xac44

    const/4 v1, 0x4

    .line 72
    invoke-static {v1, p1, v0}, Ll/ۘ֨֫;->ܽ(III)Ll/۠ᩴ֫;

    move-result-object p1

    .line 66
    invoke-virtual {p0, p1}, Ll/ܰ۫֫;->ᩳ(Ll/۠ᩴ֫;)Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method
