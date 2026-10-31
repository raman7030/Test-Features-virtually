.class public final Ll/ۜۘۘ;
.super Ljava/lang/Object;
.source "N1T0"

# interfaces
.implements Ll/᩷ۘۘ;


# static fields
.field public static ۧ:[I


# instance fields
.field public ֫:I


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/16 v0, 0x100

    new-array v1, v0, [I

    .line 42
    sput-object v1, Ll/ۜۘۘ;->ۧ:[I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    const/16 v2, 0x8

    move v3, v1

    :cond_0
    :goto_1
    add-int/lit8 v2, v2, -0x1

    if-ltz v2, :cond_1

    and-int/lit8 v4, v3, 0x1

    ushr-int/lit8 v3, v3, 0x1

    if-eqz v4, :cond_0

    const v4, -0x12477ce0

    xor-int/2addr v3, v4

    goto :goto_1

    .line 51
    :cond_1
    sget-object v2, Ll/ۜۘۘ;->ۧ:[I

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 38
    iput v0, p0, Ll/ۜۘۘ;->֫:I

    return-void
.end method


# virtual methods
.method public final getValue()J
    .locals 4

    .line 75
    iget v0, p0, Ll/ۜۘۘ;->֫:I

    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    return-wide v0
.end method

.method public final reset()V
    .locals 1

    const/4 v0, 0x0

    .line 65
    iput v0, p0, Ll/ۜۘۘ;->֫:I

    return-void
.end method

.method public final update([BII)V
    .locals 3

    .line 57
    iget v0, p0, Ll/ۜۘۘ;->֫:I

    not-int v0, v0

    :goto_0
    add-int/lit8 p3, p3, -0x1

    if-ltz p3, :cond_0

    add-int/lit8 v1, p2, 0x1

    .line 59
    aget-byte p2, p1, p2

    xor-int/2addr p2, v0

    and-int/lit16 p2, p2, 0xff

    sget-object v2, Ll/ۜۘۘ;->ۧ:[I

    aget p2, v2, p2

    ushr-int/lit8 v0, v0, 0x8

    xor-int/2addr v0, p2

    move p2, v1

    goto :goto_0

    :cond_0
    not-int p1, v0

    .line 60
    iput p1, p0, Ll/ۜۘۘ;->֫:I

    return-void
.end method

.method public final ֫(J)V
    .locals 2

    const-wide v0, 0xffffffffL

    and-long/2addr p1, v0

    long-to-int p2, p1

    .line 70
    iput p2, p0, Ll/ۜۘۘ;->֫:I

    return-void
.end method
