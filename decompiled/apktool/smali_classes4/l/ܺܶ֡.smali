.class public final Ll/ܺܶ֡;
.super Ll/ۖܶ֡;
.source "U6AJ"


# instance fields
.field public final ۧ:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 125
    invoke-direct {p0, p1}, Ll/ۖܶ֡;-><init>(I)V

    .line 126
    iput p2, p0, Ll/ܺܶ֡;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗ᩵ۚ;)V
    .locals 2

    .line 130
    iget v0, p0, Ll/ܺܶ֡;->ۧ:I

    if-ltz v0, :cond_0

    const/16 v1, 0x2b

    .line 131
    invoke-virtual {p1, v1}, Ll/ۗ᩵ۚ;->write(I)V

    .line 133
    :cond_0
    invoke-virtual {p1, v0}, Ll/ۗ᩵ۚ;->ۧ(I)V

    return-void
.end method
