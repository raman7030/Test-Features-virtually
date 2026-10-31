.class public final enum Ll/֨ۢܺ;
.super Ll/۠ۢܺ;
.source "VBIK"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "FORMAT_22X"

    const/16 v1, 0x8

    .line 0
    invoke-direct {p0, v0, v1}, Ll/֨ۢܺ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 185
    invoke-direct {p0, p1, p2, v0}, Ll/۠ۢܺ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(ILl/ܺ᩷ܺ;)Ll/ۘ᩷ܺ;
    .locals 9

    .line 189
    invoke-static {p1}, Ll/۠ۢܺ;->ۧ(I)I

    move-result v2

    .line 190
    invoke-static {p1}, Ll/۠ۢܺ;->ᩳ(I)I

    move-result v7

    .line 191
    invoke-interface {p2}, Ll/ܺ᩷ܺ;->read()I

    move-result v8

    .line 192
    new-instance p1, Ll/۫ۢܺ;

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    move-object v1, p0

    invoke-direct/range {v0 .. v8}, Ll/۫ۢܺ;-><init>(Ll/۠ۢܺ;IIIJII)V

    return-object p1
.end method

.method public ֫(Ll/ۘ᩷ܺ;Ll/ۖ᩷ܺ;)V
    .locals 2

    .line 201
    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->ܺ()I

    move-result v0

    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->֫()I

    move-result v1

    invoke-static {v0, v1}, Ll/۠ۢܺ;->ۧ(II)S

    .line 340
    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->ۧ()I

    move-result p1

    const/high16 v0, -0x10000

    and-int/2addr v0, p1

    if-nez v0, :cond_0

    .line 200
    invoke-interface {p2}, Ll/ۖ᩷ܺ;->ܺ()V

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

    const/4 v0, 0x0

    .line 60
    invoke-direct {p2, p1, v0}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 343
    throw p2
.end method
