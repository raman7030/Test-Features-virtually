.class public final Ll/ܶܳ᩻;
.super Ljava/lang/Object;
.source "O8BF"

# interfaces
.implements Ll/֨ۡ᩻;


# instance fields
.field public final synthetic ᩸:Ll/᩶ܳ᩻;


# direct methods
.method public constructor <init>(Ll/᩶ܳ᩻;)V
    .locals 0

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶܳ᩻;->᩸:Ll/᩶ܳ᩻;

    return-void
.end method


# virtual methods
.method public final setName(Ljava/lang/String;)V
    .locals 1

    .line 126
    iget-object v0, p0, Ll/ܶܳ᩻;->᩸:Ll/᩶ܳ᩻;

    invoke-virtual {v0, p1}, Ll/᩶ܶۢ;->ۧ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setProgress(I)V
    .locals 1

    .line 146
    iget-object v0, p0, Ll/ܶܳ᩻;->᩸:Ll/᩶ܳ᩻;

    invoke-virtual {v0, p1}, Ll/ۘ۠ۢ;->ۢ(I)V

    return-void
.end method

.method public final setTitle(I)V
    .locals 1

    const p1, 0x7f1202d0

    .line 121
    iget-object v0, p0, Ll/ܶܳ᩻;->᩸:Ll/᩶ܳ᩻;

    invoke-virtual {v0, p1}, Ll/ۘ۠ۢ;->ۡ(I)V

    return-void
.end method

.method public final ֫()V
    .locals 1

    .line 151
    iget-object v0, p0, Ll/ܶܳ᩻;->᩸:Ll/᩶ܳ᩻;

    .line 288
    invoke-virtual {v0}, Ll/ۘ۠ۢ;->cancel()V

    return-void
.end method

.method public final ֫(Ll/᩷۫ܳ;)V
    .locals 1

    .line 131
    iget-object v0, p0, Ll/ܶܳ᩻;->᩸:Ll/᩶ܳ᩻;

    invoke-virtual {v0, p1}, Ll/᩶ܶۢ;->ۧ(Ll/᩷۫ܳ;)V

    return-void
.end method

.method public final ۖ֫()V
    .locals 2

    .line 136
    iget-object v0, p0, Ll/ܶܳ᩻;->᩸:Ll/᩶ܳ᩻;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/᩶ܶۢ;->ᩳ(Z)V

    return-void
.end method

.method public final ۧ(J)V
    .locals 1

    .line 141
    iget-object v0, p0, Ll/ܶܳ᩻;->᩸:Ll/᩶ܳ᩻;

    invoke-virtual {v0, p1, p2}, Ll/᩶ܶۢ;->֫(J)V

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 156
    iget-object v0, p0, Ll/ܶܳ᩻;->᩸:Ll/᩶ܳ᩻;

    .line 301
    invoke-virtual {v0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    return v0
.end method
