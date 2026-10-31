.class public final Ll/᩵ܳᩴ;
.super Ll/ۘܳᩴ;
.source "1N3"

# interfaces
.implements Ll/۬᩺ۘ;
.implements Ll/۫۬ᩴ;


# instance fields
.field public final synthetic ۫:Ll/ۚܳᩴ;


# direct methods
.method public constructor <init>(Ll/ۚܳᩴ;)V
    .locals 0

    .line 1260
    iput-object p1, p0, Ll/᩵ܳᩴ;->۫:Ll/ۚܳᩴ;

    .line 1261
    invoke-direct {p0, p1}, Ll/ۘܳᩴ;-><init>(Ll/ۚܳᩴ;)V

    return-void
.end method


# virtual methods
.method public final forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 1

    .line 94
    instance-of v0, p1, Ll/᩶᩺ۘ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/᩶᩺ۘ;

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll/ۙ᩺ۘ;

    invoke-direct {v0, p1}, Ll/ۙ᩺ۘ;-><init>(Ljava/util/function/Consumer;)V

    move-object p1, v0

    .line 1259
    :goto_0
    invoke-virtual {p0, p1}, Ll/ۘܳᩴ;->forEachRemaining(Ljava/lang/Object;)V

    return-void
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 46
    invoke-virtual {p0}, Ll/᩵ܳᩴ;->nextByte()B

    move-result v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    return-object v0
.end method

.method public final nextByte()B
    .locals 2

    .line 1274
    iget-object v0, p0, Ll/᩵ܳᩴ;->۫:Ll/ۚܳᩴ;

    iget-object v0, v0, Ll/ۚܳᩴ;->ۨ:[B

    invoke-virtual {p0}, Ll/ۘܳᩴ;->֫()I

    move-result v1

    aget-byte v0, v0, v1

    return v0
.end method

.method public final ֫(ILjava/lang/Object;)V
    .locals 1

    .line 1259
    check-cast p2, Ll/᩶᩺ۘ;

    .line 1269
    iget-object v0, p0, Ll/᩵ܳᩴ;->۫:Ll/ۚܳᩴ;

    iget-object v0, v0, Ll/ۚܳᩴ;->ۨ:[B

    aget-byte p1, v0, p1

    invoke-interface {p2, p1}, Ll/᩶᩺ۘ;->֫(B)V

    return-void
.end method
