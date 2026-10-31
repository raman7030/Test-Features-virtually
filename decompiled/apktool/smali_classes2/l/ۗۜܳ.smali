.class public final Ll/ۗۜܳ;
.super Ll/ۤۜܳ;
.source "969A"


# instance fields
.field public final synthetic ᩳ:Z


# direct methods
.method public constructor <init>(IZ)V
    .locals 0

    .line 755
    iput-boolean p2, p0, Ll/ۗۜܳ;->ᩳ:Z

    const p2, 0x7f0801dd

    invoke-direct {p0, p1, p2}, Ll/ۤۜܳ;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܽۢܳ;)V
    .locals 2

    .line 758
    iget-boolean v0, p0, Ll/ۗۜܳ;->ᩳ:Z

    if-eqz v0, :cond_0

    .line 759
    iget-object v0, p1, Ll/ܽۢܳ;->ۡ֫:Ll/۫ۢܳ;

    invoke-virtual {p1}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽ᩷ܳ;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/۫ۢܳ;->֫(Ljava/lang/String;)V

    .line 761
    :cond_0
    invoke-virtual {p1}, Ll/ܽۢܳ;->ۗ()Ll/ۢۘܳ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۢۘܳ;->֫(Ll/ܽۢܳ;)V

    return-void
.end method
