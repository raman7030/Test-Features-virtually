.class public final Ll/ۙܿ᩻;
.super Ljava/lang/Object;
.source "98AW"

# interfaces
.implements Ll/֨ۡ᩻;


# instance fields
.field public final synthetic ᩸:Ll/۬ܿ᩻;


# direct methods
.method public constructor <init>(Ll/۬ܿ᩻;)V
    .locals 0

    .line 172
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙܿ᩻;->᩸:Ll/۬ܿ᩻;

    return-void
.end method


# virtual methods
.method public final setName(Ljava/lang/String;)V
    .locals 1

    .line 180
    iget-object v0, p0, Ll/ۙܿ᩻;->᩸:Ll/۬ܿ᩻;

    invoke-virtual {v0, p1}, Ll/᩶ܶۢ;->ۧ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setProgress(I)V
    .locals 1

    .line 200
    iget-object v0, p0, Ll/ۙܿ᩻;->᩸:Ll/۬ܿ᩻;

    invoke-virtual {v0, p1}, Ll/ۘ۠ۢ;->ۢ(I)V

    return-void
.end method

.method public final setTitle(I)V
    .locals 1

    const p1, 0x7f1202d0

    .line 175
    iget-object v0, p0, Ll/ۙܿ᩻;->᩸:Ll/۬ܿ᩻;

    invoke-virtual {v0, p1}, Ll/ۘ۠ۢ;->ۡ(I)V

    return-void
.end method

.method public final ֫()V
    .locals 1

    .line 205
    iget-object v0, p0, Ll/ۙܿ᩻;->᩸:Ll/۬ܿ᩻;

    .line 288
    invoke-virtual {v0}, Ll/ۘ۠ۢ;->cancel()V

    return-void
.end method

.method public final ֫(Ll/᩷۫ܳ;)V
    .locals 1

    .line 185
    iget-object v0, p0, Ll/ۙܿ᩻;->᩸:Ll/۬ܿ᩻;

    invoke-virtual {v0, p1}, Ll/᩶ܶۢ;->ۧ(Ll/᩷۫ܳ;)V

    return-void
.end method

.method public final ۖ֫()V
    .locals 2

    .line 190
    iget-object v0, p0, Ll/ۙܿ᩻;->᩸:Ll/۬ܿ᩻;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/᩶ܶۢ;->ᩳ(Z)V

    return-void
.end method

.method public final ۧ(J)V
    .locals 1

    .line 195
    iget-object v0, p0, Ll/ۙܿ᩻;->᩸:Ll/۬ܿ᩻;

    invoke-virtual {v0, p1, p2}, Ll/᩶ܶۢ;->֫(J)V

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 210
    iget-object v0, p0, Ll/ۙܿ᩻;->᩸:Ll/۬ܿ᩻;

    .line 301
    invoke-virtual {v0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    return v0
.end method
