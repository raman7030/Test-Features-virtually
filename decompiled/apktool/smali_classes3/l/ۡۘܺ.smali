.class public final Ll/ۡۘܺ;
.super Ljava/lang/Object;
.source "4BHP"

# interfaces
.implements Ll/᩺ۖܺ;


# instance fields
.field public final synthetic ֫:Ll/ۖۘܺ;


# direct methods
.method public constructor <init>(Ll/ۖۘܺ;)V
    .locals 0

    .line 652
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡۘܺ;->֫:Ll/ۖۘܺ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܰۖܺ;)V
    .locals 4

    .line 657
    invoke-virtual {p1}, Ll/ܰۖܺ;->ܶ()I

    move-result v0

    .line 658
    iget-object v1, p0, Ll/ۡۘܺ;->֫:Ll/ۖۘܺ;

    iget-object v2, v1, Ll/ۖۘܺ;->ܳ:Ll/ۘۘܺ;

    invoke-static {v2, v0}, Ll/ۘۘܺ;->ܽ(Ll/ۘۘܺ;I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    .line 671
    :cond_0
    invoke-static {v1}, Ll/ۖۘܺ;->ۧ(Ll/ۖۘܺ;)[Ll/᩸ۡܺ;

    move-result-object v3

    aget-object v0, v3, v0

    .line 672
    invoke-virtual {v0}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v3

    invoke-static {v2, v3}, Ll/ۘۘܺ;->ᩳ(Ll/ۘۘܺ;I)Z

    move-result v2

    if-nez v2, :cond_1

    .line 673
    invoke-static {v1}, Ll/ۖۘܺ;->֫(Ll/ۖۘܺ;)Ll/ܽۘܺ;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ll/ܰۖܺ;->֫(Ll/᩸ۡܺ;Ll/ܽۘܺ;)V

    :cond_1
    :goto_0
    return-void
.end method
