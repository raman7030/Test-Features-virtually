.class public final Ll/ᩴۧܿ;
.super Ljava/lang/Object;
.source "44TS"

# interfaces
.implements Ll/᩺ۘܽ;


# instance fields
.field public final synthetic ֫:Ll/᩵ۧܿ;

.field public final synthetic ۧ:Ll/۟᩸ᩳ;


# direct methods
.method public constructor <init>(Ll/᩵ۧܿ;Ll/۟᩸ᩳ;)V
    .locals 0

    .line 773
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴۧܿ;->֫:Ll/᩵ۧܿ;

    iput-object p2, p0, Ll/ᩴۧܿ;->ۧ:Ll/۟᩸ᩳ;

    return-void
.end method


# virtual methods
.method public final end(I)I
    .locals 1

    .line 779
    iget-object v0, p0, Ll/ᩴۧܿ;->֫:Ll/᩵ۧܿ;

    invoke-static {v0}, Ll/᩵ۧܿ;->ۧ(Ll/᩵ۧܿ;)[I

    move-result-object v0

    mul-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x1

    aget p1, v0, p1

    return p1
.end method

.method public final getText()Ljava/lang/CharSequence;
    .locals 1

    .line 777
    iget-object v0, p0, Ll/ᩴۧܿ;->ۧ:Ll/۟᩸ᩳ;

    return-object v0
.end method

.method public final group(I)Ljava/lang/String;
    .locals 2

    if-ltz p1, :cond_2

    .line 783
    iget-object v0, p0, Ll/ᩴۧܿ;->֫:Ll/᩵ۧܿ;

    invoke-static {v0}, Ll/᩵ۧܿ;->֫(Ll/᩵ۧܿ;)I

    move-result v0

    if-le p1, v0, :cond_0

    goto :goto_0

    .line 784
    :cond_0
    invoke-virtual {p0, p1}, Ll/ᩴۧܿ;->start(I)I

    move-result v0

    invoke-virtual {p0, p1}, Ll/ᩴۧܿ;->end(I)I

    move-result p1

    if-ltz v0, :cond_2

    if-gez p1, :cond_1

    goto :goto_0

    .line 785
    :cond_1
    iget-object v1, p0, Ll/ᩴۧܿ;->ۧ:Ll/۟᩸ᩳ;

    invoke-virtual {v1, v0, p1}, Ll/۟᩸ᩳ;->subSequence(II)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    const-string p1, ""

    return-object p1
.end method

.method public final groupCount()I
    .locals 1

    .line 780
    iget-object v0, p0, Ll/ᩴۧܿ;->֫:Ll/᩵ۧܿ;

    invoke-static {v0}, Ll/᩵ۧܿ;->֫(Ll/᩵ۧܿ;)I

    move-result v0

    return v0
.end method

.method public final pattern()Ll/ۨۘܽ;
    .locals 1

    .line 781
    iget-object v0, p0, Ll/ᩴۧܿ;->֫:Ll/᩵ۧܿ;

    invoke-static {v0}, Ll/᩵ۧܿ;->ܽ(Ll/᩵ۧܿ;)Ll/ۨۘܽ;

    move-result-object v0

    return-object v0
.end method

.method public final start(I)I
    .locals 1

    .line 778
    iget-object v0, p0, Ll/ᩴۧܿ;->֫:Ll/᩵ۧܿ;

    invoke-static {v0}, Ll/᩵ۧܿ;->ۧ(Ll/᩵ۧܿ;)[I

    move-result-object v0

    mul-int/lit8 p1, p1, 0x2

    aget p1, v0, p1

    return p1
.end method

.method public final ֫()V
    .locals 0

    return-void
.end method
