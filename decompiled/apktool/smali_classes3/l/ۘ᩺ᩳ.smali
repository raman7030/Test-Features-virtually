.class public final Ll/ۘ᩺ᩳ;
.super Ljava/lang/Object;
.source "G4ML"

# interfaces
.implements Ll/ۘۧܿ;


# instance fields
.field public final synthetic ֫:Ll/ܶ᩺ᩳ;

.field public final synthetic ۧ:Ll/᩹ۧܿ;


# direct methods
.method public constructor <init>(Ll/ܶ᩺ᩳ;Ll/᩹ۧܿ;)V
    .locals 0

    .line 260
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘ᩺ᩳ;->֫:Ll/ܶ᩺ᩳ;

    iput-object p2, p0, Ll/ۘ᩺ᩳ;->ۧ:Ll/᩹ۧܿ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 286
    iget-object v0, p0, Ll/ۘ᩺ᩳ;->֫:Ll/ܶ᩺ᩳ;

    iget-object v0, v0, Ll/ܶ᩺ᩳ;->ۜ:Ll/ۚۖۡ;

    invoke-virtual {v0}, Ll/ۚۖۡ;->ܳ()V

    return-void
.end method

.method public final ֫(I)V
    .locals 2

    .line 276
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const p1, 0x7f120897

    invoke-static {p1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/ۘ᩺ᩳ;->ۧ:Ll/᩹ۧܿ;

    invoke-virtual {v0, p1}, Ll/᩹ۧܿ;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/util/regex/PatternSyntaxException;)V
    .locals 1

    .line 291
    iget-object v0, p0, Ll/ۘ᩺ᩳ;->֫:Ll/ܶ᩺ᩳ;

    invoke-static {v0, p1}, Ll/ܶ᩺ᩳ;->֫(Ll/ܶ᩺ᩳ;Ljava/util/regex/PatternSyntaxException;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 2

    if-eqz p1, :cond_0

    const p1, 0x7f120a63

    goto :goto_0

    :cond_0
    const p1, 0x7f120a62

    :goto_0
    const/16 v0, 0x5dc

    .line 271
    iget-object v1, p0, Ll/ۘ᩺ᩳ;->ۧ:Ll/᩹ۧܿ;

    invoke-virtual {v1, p1, v0}, Ll/᩹ۧܿ;->֫(II)V

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 281
    iget-object v0, p0, Ll/ۘ᩺ᩳ;->֫:Ll/ܶ᩺ᩳ;

    iget-object v0, v0, Ll/ܶ᩺ᩳ;->᩷:Ll/ۚۖۡ;

    invoke-virtual {v0}, Ll/ۚۖۡ;->ܳ()V

    return-void
.end method

.method public final ۧ(Z)V
    .locals 2

    .line 296
    iget-object v0, p0, Ll/ۘ᩺ᩳ;->֫:Ll/ܶ᩺ᩳ;

    iget-object v1, v0, Ll/ܶ᩺ᩳ;->᩷:Ll/ۚۖۡ;

    invoke-virtual {v1, p1}, Ll/ۚۖۡ;->ۧ(Z)V

    .line 297
    iget-object v0, v0, Ll/ܶ᩺ᩳ;->ۜ:Ll/ۚۖۡ;

    invoke-virtual {v0, p1}, Ll/ۚۖۡ;->ܽ(Z)V

    return-void
.end method
