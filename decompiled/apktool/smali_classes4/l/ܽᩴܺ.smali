.class public final Ll/ܽᩴܺ;
.super Ljava/lang/Object;
.source "J5T5"


# instance fields
.field public ֫:I

.field public final ۧ:I


# direct methods
.method public constructor <init>(IILjava/lang/String;)V
    .locals 0

    .line 642
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 643
    iput p1, p0, Ll/ܽᩴܺ;->ۧ:I

    .line 644
    iput p2, p0, Ll/ܽᩴܺ;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 694
    iget v0, p0, Ll/ܽᩴܺ;->֫:I

    return v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 676
    iput p1, p0, Ll/ܽᩴܺ;->֫:I

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 685
    iget v0, p0, Ll/ܽᩴܺ;->ۧ:I

    return v0
.end method

.method public final ۧ(I)V
    .locals 2

    .line 665
    iget v0, p0, Ll/ܽᩴܺ;->֫:I

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_0

    .line 666
    iput p1, p0, Ll/ܽᩴܺ;->֫:I

    :cond_0
    return-void
.end method
