.class public final enum Ll/ܿۢܺ;
.super Ll/۠ۢܺ;
.source "VBIK"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "FORMAT_10X"

    const/4 v1, 0x1

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ܿۢܺ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 48
    invoke-direct {p0, p1, p2, v0}, Ll/۠ۢܺ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(ILl/ܺ᩷ܺ;)Ll/ۘ᩷ܺ;
    .locals 7

    .line 52
    invoke-static {p1}, Ll/۠ۢܺ;->ۧ(I)I

    move-result v2

    .line 53
    invoke-static {p1}, Ll/۠ۢܺ;->ᩳ(I)I

    move-result p1

    .line 54
    new-instance p2, Ll/ۤۢܺ;

    const/4 v4, 0x0

    int-to-long v5, p1

    const/4 v3, 0x0

    move-object v0, p2

    move-object v1, p0

    .line 30
    invoke-direct/range {v0 .. v6}, Ll/ۘ᩷ܺ;-><init>(Ll/۠ۢܺ;IIIJ)V

    return-object p2
.end method

.method public ֫(Ll/ۘ᩷ܺ;Ll/ۖ᩷ܺ;)V
    .locals 0

    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p2}, Ll/ۖ᩷ܺ;->֫()V

    return-void
.end method
