.class public final enum Ll/ۛ᩷ܺ;
.super Ll/۠ۢܺ;
.source "VBIK"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "FORMAT_32X"

    const/16 v1, 0x14

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ۛ᩷ܺ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 465
    invoke-direct {p0, p1, p2, v0}, Ll/۠ۢܺ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(ILl/ܺ᩷ܺ;)Ll/ۘ᩷ܺ;
    .locals 9

    .line 469
    invoke-static {p1}, Ll/۠ۢܺ;->ۧ(I)I

    move-result v2

    .line 470
    invoke-static {p1}, Ll/۠ۢܺ;->ᩳ(I)I

    move-result p1

    .line 471
    invoke-interface {p2}, Ll/ܺ᩷ܺ;->read()I

    move-result v7

    .line 472
    invoke-interface {p2}, Ll/ܺ᩷ܺ;->read()I

    move-result v8

    .line 473
    new-instance p2, Ll/۫ۢܺ;

    const/4 v4, 0x0

    int-to-long v5, p1

    const/4 v3, 0x0

    move-object v0, p2

    move-object v1, p0

    invoke-direct/range {v0 .. v8}, Ll/۫ۢܺ;-><init>(Ll/۠ۢܺ;IIIJII)V

    return-object p2
.end method

.method public ֫(Ll/ۘ᩷ܺ;Ll/ۖ᩷ܺ;)V
    .locals 4

    .line 481
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->֫()I

    move-result v0

    const/high16 v1, -0x10000

    and-int v2, v0, v1

    const/4 v3, 0x0

    if-nez v2, :cond_1

    .line 340
    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->ۧ()I

    move-result p1

    and-int v0, p1, v1

    if-nez v0, :cond_0

    .line 481
    invoke-interface {p2}, Ll/ۖ᩷ܺ;->ۧ()V

    return-void

    .line 343
    :cond_0
    new-instance p2, Ll/֡ۧܺ;

    int-to-long v0, p1

    invoke-static {v0, v1}, Ll/ܳᩴܺ;->֫(J)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Register B out of range: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 60
    invoke-direct {p2, p1, v3}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 343
    throw p2

    .line 301
    :cond_1
    new-instance p1, Ll/֡ۧܺ;

    int-to-long v0, v0

    invoke-static {v0, v1}, Ll/ܳᩴܺ;->֫(J)Ljava/lang/String;

    move-result-object p2

    const-string v0, "Register A out of range: "

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 60
    invoke-direct {p1, p2, v3}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 301
    throw p1
.end method
