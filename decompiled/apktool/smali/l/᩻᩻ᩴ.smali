.class public final Ll/᩻᩻ᩴ;
.super Ll/ܿ᩻ᩴ;
.source "K9H"

# interfaces
.implements Ll/֨ᩳᩴ;
.implements Ll/۫۬ᩴ;


# instance fields
.field public final synthetic ۫:Ll/᩷᩻ᩴ;


# direct methods
.method public constructor <init>(Ll/᩷᩻ᩴ;)V
    .locals 0

    .line 1260
    iput-object p1, p0, Ll/᩻᩻ᩴ;->۫:Ll/᩷᩻ᩴ;

    .line 1261
    invoke-direct {p0, p1}, Ll/ܿ᩻ᩴ;-><init>(Ll/᩷᩻ᩴ;)V

    return-void
.end method


# virtual methods
.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۚᩳᩴ;->֫(Ll/֨ᩳᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 46
    invoke-virtual {p0}, Ll/᩻᩻ᩴ;->nextFloat()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public final nextFloat()F
    .locals 2

    .line 1274
    iget-object v0, p0, Ll/᩻᩻ᩴ;->۫:Ll/᩷᩻ᩴ;

    iget-object v0, v0, Ll/᩷᩻ᩴ;->ۨ:[F

    invoke-virtual {p0}, Ll/ܿ᩻ᩴ;->֫()I

    move-result v1

    aget v0, v0, v1

    return v0
.end method

.method public final ֫(ILjava/lang/Object;)V
    .locals 1

    .line 1259
    check-cast p2, Ll/ۘᩳᩴ;

    .line 1269
    iget-object v0, p0, Ll/᩻᩻ᩴ;->۫:Ll/᩷᩻ᩴ;

    iget-object v0, v0, Ll/᩷᩻ᩴ;->ۨ:[F

    aget p1, v0, p1

    invoke-interface {p2, p1}, Ll/ۘᩳᩴ;->֫(F)V

    return-void
.end method
