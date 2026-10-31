.class public final Ll/᩷᩵֫;
.super Ljava/lang/Object;
.source "U8ON"


# instance fields
.field public final ֫:I

.field public final ۧ:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 847
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 848
    iput p1, p0, Ll/᩷᩵֫;->ۧ:I

    .line 849
    iput p2, p0, Ll/᩷᩵֫;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    const/4 v0, 0x2

    .line 855
    iget v1, p0, Ll/᩷᩵֫;->֫:I

    if-eq v1, v0, :cond_5

    const/4 v0, 0x5

    if-eq v1, v0, :cond_4

    const/16 v0, 0x1d

    if-eq v1, v0, :cond_3

    const/16 v0, 0x2a

    if-eq v1, v0, :cond_2

    const/16 v0, 0x16

    if-eq v1, v0, :cond_1

    const/16 v0, 0x17

    if-eq v1, v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/16 v0, 0xf

    return v0

    :cond_1
    const/high16 v0, 0x40000000    # 2.0f

    return v0

    :cond_2
    const/16 v0, 0x10

    return v0

    :cond_3
    const/16 v0, 0xc

    return v0

    :cond_4
    const/16 v0, 0xb

    return v0

    :cond_5
    const/16 v0, 0xa

    return v0
.end method
