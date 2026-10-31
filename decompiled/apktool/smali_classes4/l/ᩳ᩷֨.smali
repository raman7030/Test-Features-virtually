.class public abstract Ll/ᩳ᩷֨;
.super Ljava/lang/Object;
.source "R1T1"


# instance fields
.field public final ֫:I

.field public final ۧ:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    iput p1, p0, Ll/ᩳ᩷֨;->֫:I

    const/4 p1, 0x1

    shl-int p2, p1, p2

    sub-int/2addr p2, p1

    .line 93
    iput p2, p0, Ll/ᩳ᩷֨;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫(II)I
    .locals 2

    .line 97
    iget v0, p0, Ll/ᩳ᩷֨;->֫:I

    rsub-int/lit8 v1, v0, 0x8

    shr-int/2addr p1, v1

    .line 98
    iget v1, p0, Ll/ᩳ᩷֨;->ۧ:I

    and-int/2addr p2, v1

    shl-int/2addr p2, v0

    add-int/2addr p1, p2

    return p1
.end method
