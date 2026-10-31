.class public abstract Ll/۠ܶ֡;
.super Ljava/lang/Object;
.source "I4S8"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public ᩸:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput p1, p0, Ll/۠ܶ֡;->᩸:I

    return-void
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 35
    check-cast p1, Ll/۠ܶ֡;

    invoke-virtual {p0, p1}, Ll/۠ܶ֡;->֫(Ll/۠ܶ֡;)I

    move-result p1

    return p1
.end method

.method public final ֫()I
    .locals 1

    .line 43
    iget v0, p0, Ll/۠ܶ֡;->᩸:I

    return v0
.end method

.method public ֫(Ll/۠ܶ֡;)I
    .locals 4

    .line 43
    iget v0, p0, Ll/۠ܶ֡;->᩸:I

    iget v1, p1, Ll/۠ܶ֡;->᩸:I

    .line 50
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-nez v0, :cond_0

    .line 53
    invoke-virtual {p0}, Ll/۠ܶ֡;->ۧ()D

    move-result-wide v0

    invoke-virtual {p1}, Ll/۠ܶ֡;->ۧ()D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    return p1

    :cond_0
    return v0
.end method

.method public abstract ֫(Ll/ۗ᩵ۚ;)Z
.end method

.method public abstract ۧ()D
.end method

.method public ܿ()V
    .locals 0

    return-void
.end method
