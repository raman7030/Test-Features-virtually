.class public final Ll/᩻ۘܺ;
.super Ljava/lang/Object;
.source "2BFP"

# interfaces
.implements Ll/ܿۘܺ;


# instance fields
.field public final synthetic ֫:Ll/᩷ۘܺ;


# direct methods
.method public constructor <init>(Ll/᩷ۘܺ;)V
    .locals 0

    .line 418
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻ۘܺ;->֫:Ll/᩷ۘܺ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۫ۖܺ;)V
    .locals 2

    .line 421
    iget-object v0, p0, Ll/᩻ۘܺ;->֫:Ll/᩷ۘܺ;

    invoke-static {v0}, Ll/᩷ۘܺ;->֫(Ll/᩷ۘܺ;)[Ll/ܳۘܺ;

    move-result-object v0

    invoke-virtual {p1}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v1

    aput-object p1, v0, v1

    return-void
.end method

.method public final ֫(Ll/ܰۖܺ;)V
    .locals 2

    .line 426
    iget-object v0, p0, Ll/᩻ۘܺ;->֫:Ll/᩷ۘܺ;

    invoke-static {v0}, Ll/᩷ۘܺ;->֫(Ll/᩷ۘܺ;)[Ll/ܳۘܺ;

    move-result-object v0

    invoke-virtual {p1}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v1

    aput-object p1, v0, v1

    return-void
.end method

.method public final ۧ(Ll/۫ۖܺ;)V
    .locals 2

    .line 431
    invoke-virtual {p1}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 433
    iget-object v0, p0, Ll/᩻ۘܺ;->֫:Ll/᩷ۘܺ;

    invoke-static {v0}, Ll/᩷ۘܺ;->֫(Ll/᩷ۘܺ;)[Ll/ܳۘܺ;

    move-result-object v0

    invoke-virtual {p1}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v1

    aput-object p1, v0, v1

    :cond_0
    return-void
.end method
