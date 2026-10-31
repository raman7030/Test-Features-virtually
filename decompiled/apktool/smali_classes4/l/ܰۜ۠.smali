.class public final Ll/ܰۜ۠;
.super Ll/֫᩷۠;
.source "M664"


# instance fields
.field public final ֫:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1261
    invoke-direct {p0}, Ll/֫᩷۠;-><init>()V

    .line 1262
    iput p1, p0, Ll/ܰۜ۠;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    const/16 v0, 0x40

    .line 1265
    iget v1, p0, Ll/ܰۜ۠;->֫:I

    if-ge v1, v0, :cond_0

    return v1

    :cond_0
    const/16 v0, 0xfb

    return v0
.end method

.method public final ֫(Ll/ܽ᩷۠;)V
    .locals 3

    .line 1269
    invoke-super {p0, p1}, Ll/֫᩷۠;->֫(Ll/ܽ᩷۠;)V

    .line 1270
    invoke-virtual {p0}, Ll/ܰۜ۠;->֫()I

    move-result v0

    const/16 v1, 0xfb

    if-ne v0, v1, :cond_0

    .line 1271
    iget-object v0, p1, Ll/ܽ᩷۠;->ܽ:Ll/ܶ֨۠;

    iget v1, p0, Ll/ܰۜ۠;->֫:I

    invoke-virtual {v0, v1}, Ll/ܶ֨۠;->ۧ(I)V

    .line 1272
    invoke-static {p1}, Ll/ܽ᩷۠;->֫(Ll/ܽ᩷۠;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 1273
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, " offset_delta="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
