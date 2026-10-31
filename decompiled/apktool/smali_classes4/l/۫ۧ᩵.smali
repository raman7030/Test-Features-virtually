.class public final Ll/۫ۧ᩵;
.super Ll/ᩳᩳ᩵;
.source "N673"

# interfaces
.implements Ll/ۚܽ᩵;


# instance fields
.field public final h:[D


# direct methods
.method public constructor <init>(Ll/۫ۧ᩵;Ll/ܶ۫ᩴ;JJ)V
    .locals 9

    .line 2012
    iget-object v0, p1, Ll/۫ۧ᩵;->h:[D

    array-length v8, v0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-wide v6, p5

    invoke-direct/range {v1 .. v8}, Ll/ᩳᩳ᩵;-><init>(Ll/ᩳᩳ᩵;Ll/ܶ۫ᩴ;JJI)V

    .line 2013
    iget-object p1, p1, Ll/۫ۧ᩵;->h:[D

    iput-object p1, p0, Ll/۫ۧ᩵;->h:[D

    return-void
.end method

.method public constructor <init>(Ll/ܶ۫ᩴ;Ll/ۡ᩺ᩴ;[D)V
    .locals 1

    .line 2006
    array-length v0, p3

    invoke-direct {p0, p1, p2, v0}, Ll/ᩳᩳ᩵;-><init>(Ll/ܶ۫ᩴ;Ll/ۡ᩺ᩴ;I)V

    .line 2007
    iput-object p3, p0, Ll/۫ۧ᩵;->h:[D

    return-void
.end method


# virtual methods
.method public final a(Ll/ܶ۫ᩴ;JJ)Ll/ᩳᩳ᩵;
    .locals 8

    .line 2019
    new-instance v7, Ll/۫ۧ᩵;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-direct/range {v0 .. v6}, Ll/۫ۧ᩵;-><init>(Ll/۫ۧ᩵;Ll/ܶ۫ᩴ;JJ)V

    return-object v7
.end method

.method public final accept(D)V
    .locals 3

    .line 2024
    iget v0, p0, Ll/ᩳᩳ᩵;->f:I

    iget v1, p0, Ll/ᩳᩳ᩵;->g:I

    if-ge v0, v1, :cond_0

    .line 2027
    iget-object v1, p0, Ll/۫ۧ᩵;->h:[D

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Ll/ᩳᩳ᩵;->f:I

    aput-wide p1, v1, v0

    return-void

    .line 2025
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    iget p2, p0, Ll/ᩳᩳ᩵;->f:I

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Ll/ۡ᩺ᩴ;->o(Ll/ۚܽ᩵;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic andThen(Ljava/util/function/DoubleConsumer;)Ljava/util/function/DoubleConsumer;
    .locals 0

    invoke-static {p0, p1}, Ll/ܺ᩶ᩴ;->a(Ljava/util/function/DoubleConsumer;Ljava/util/function/DoubleConsumer;)Ll/۠ۛᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic n(Ljava/lang/Double;)V
    .locals 0

    invoke-static {p0, p1}, Ll/ۡ᩺ᩴ;->n(Ll/ۚܽ᩵;Ljava/lang/Double;)V

    return-void
.end method
