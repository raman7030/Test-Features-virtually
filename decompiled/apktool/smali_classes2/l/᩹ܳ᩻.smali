.class public final Ll/᩹ܳ᩻;
.super Ljava/lang/Object;
.source "O8BF"

# interfaces
.implements Ll/᩹ۡ᩻;


# instance fields
.field public final synthetic ᩸:Ll/᩶ܳ᩻;

.field public final synthetic ᩹:Z


# direct methods
.method public constructor <init>(Ll/᩶ܳ᩻;Z)V
    .locals 0

    .line 203
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹ܳ᩻;->᩸:Ll/᩶ܳ᩻;

    iput-boolean p2, p0, Ll/᩹ܳ᩻;->᩹:Z

    return-void
.end method


# virtual methods
.method public final setName(Ljava/lang/String;)V
    .locals 1

    .line 214
    iget-object v0, p0, Ll/᩹ܳ᩻;->᩸:Ll/᩶ܳ᩻;

    invoke-virtual {v0, p1}, Ll/᩶ܶۢ;->ۧ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setProgress(I)V
    .locals 1

    .line 244
    iget-object v0, p0, Ll/᩹ܳ᩻;->᩸:Ll/᩶ܳ᩻;

    invoke-virtual {v0, p1}, Ll/ۘ۠ۢ;->ۢ(I)V

    return-void
.end method

.method public final setTitle(I)V
    .locals 1

    .line 206
    iget-boolean v0, p0, Ll/᩹ܳ᩻;->᩹:Z

    if-eqz v0, :cond_0

    const v0, 0x7f120ac2

    if-ne p1, v0, :cond_0

    const p1, 0x7f120a90

    .line 209
    :cond_0
    iget-object v0, p0, Ll/᩹ܳ᩻;->᩸:Ll/᩶ܳ᩻;

    invoke-virtual {v0, p1}, Ll/ۘ۠ۢ;->ۡ(I)V

    return-void
.end method

.method public final ֫()V
    .locals 1

    .line 249
    iget-object v0, p0, Ll/᩹ܳ᩻;->᩸:Ll/᩶ܳ᩻;

    .line 288
    invoke-virtual {v0}, Ll/ۘ۠ۢ;->cancel()V

    return-void
.end method

.method public final ֫(Ll/᩷۫ܳ;)V
    .locals 1

    .line 229
    iget-object v0, p0, Ll/᩹ܳ᩻;->᩸:Ll/᩶ܳ᩻;

    invoke-virtual {v0, p1}, Ll/᩶ܶۢ;->ۧ(Ll/᩷۫ܳ;)V

    return-void
.end method

.method public final ۖ֫()V
    .locals 2

    .line 234
    iget-object v0, p0, Ll/᩹ܳ᩻;->᩸:Ll/᩶ܳ᩻;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/᩶ܶۢ;->ᩳ(Z)V

    return-void
.end method

.method public final ۡ(Ljava/lang/String;)V
    .locals 1

    .line 224
    iget-object v0, p0, Ll/᩹ܳ᩻;->᩸:Ll/᩶ܳ᩻;

    invoke-virtual {v0, p1}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ۧ(J)V
    .locals 1

    .line 239
    iget-object v0, p0, Ll/᩹ܳ᩻;->᩸:Ll/᩶ܳ᩻;

    invoke-virtual {v0, p1, p2}, Ll/᩶ܶۢ;->֫(J)V

    return-void
.end method

.method public final ۧ(Z)V
    .locals 1

    .line 219
    iget-object v0, p0, Ll/᩹ܳ᩻;->᩸:Ll/᩶ܳ᩻;

    invoke-virtual {v0, p1}, Ll/᩶ܶۢ;->ܽ(Z)V

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 254
    iget-object v0, p0, Ll/᩹ܳ᩻;->᩸:Ll/᩶ܳ᩻;

    .line 301
    invoke-virtual {v0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    return v0
.end method
