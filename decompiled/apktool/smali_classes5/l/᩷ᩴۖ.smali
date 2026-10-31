.class public final Ll/᩷ᩴۖ;
.super Ljava/lang/Object;
.source "X93U"

# interfaces
.implements Ll/᩺ۘۖ;


# instance fields
.field public final ֫:Ll/֡ۖۖ;


# direct methods
.method public constructor <init>(Ll/ᩳۖۖ;I)V
    .locals 0

    .line 2203
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2204
    invoke-virtual {p1}, Ll/ᩳۖۖ;->֨()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܶۖۖ;

    .line 2205
    invoke-virtual {p1}, Ll/ܶۖۖ;->getFields()Ljava/util/List;

    move-result-object p1

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֡ۖۖ;

    iput-object p1, p0, Ll/᩷ᩴۖ;->֫:Ll/֡ۖۖ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۘᩴۖ;)Ll/֡ۖۖ;
    .locals 1

    .line 2222
    iget-object v0, p0, Ll/᩷ᩴۖ;->֫:Ll/֡ۖۖ;

    invoke-virtual {p1, v0}, Ll/ۘᩴۖ;->hasField(Ll/֡ۖۖ;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/᩶ۘۖ;)V
    .locals 1

    .line 2231
    iget-object v0, p0, Ll/᩷ᩴۖ;->֫:Ll/֡ۖۖ;

    invoke-virtual {p1, v0}, Ll/᩶ۘۖ;->clearField(Ll/֡ۖۖ;)Ll/᩶ۘۖ;

    return-void
.end method

.method public final ۧ(Ll/᩶ۘۖ;)Ll/֡ۖۖ;
    .locals 1

    .line 2226
    iget-object v0, p0, Ll/᩷ᩴۖ;->֫:Ll/֡ۖۖ;

    invoke-virtual {p1, v0}, Ll/᩶ۘۖ;->hasField(Ll/֡ۖۖ;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۧ(Ll/ۘᩴۖ;)Z
    .locals 1

    .line 2212
    iget-object v0, p0, Ll/᩷ᩴۖ;->֫:Ll/֡ۖۖ;

    invoke-virtual {p1, v0}, Ll/ۘᩴۖ;->hasField(Ll/֡ۖۖ;)Z

    move-result p1

    return p1
.end method

.method public final ܽ(Ll/᩶ۘۖ;)Z
    .locals 1

    .line 2217
    iget-object v0, p0, Ll/᩷ᩴۖ;->֫:Ll/֡ۖۖ;

    invoke-virtual {p1, v0}, Ll/᩶ۘۖ;->hasField(Ll/֡ۖۖ;)Z

    move-result p1

    return p1
.end method
