.class public final Ll/ۗۘۘ;
.super Ll/ۖ᩹ۢ;
.source "H8DH"


# instance fields
.field public ۧ:[S

.field public ܽ:I

.field public ᩳ:I


# direct methods
.method public constructor <init>([S)V
    .locals 3

    .line 48
    array-length v0, p1

    const/4 v1, 0x3

    .line 24
    invoke-direct {p0, v1}, Ll/ۖ᩹ۢ;-><init>(I)V

    const/4 v1, 0x1

    .line 28
    iput v1, p0, Ll/ۗۘۘ;->ܽ:I

    .line 60
    new-array v2, v0, [S

    iput-object v2, p0, Ll/ۗۘۘ;->ۧ:[S

    .line 61
    iput v0, p0, Ll/ۗۘۘ;->ᩳ:I

    .line 62
    iput v1, p0, Ll/ۗۘۘ;->ܽ:I

    const/4 v0, 0x0

    .line 94
    array-length v1, p1

    .line 76
    invoke-static {p1, v0, v2, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method


# virtual methods
.method public final ֫(I)D
    .locals 4

    .line 112
    iget-object v0, p0, Ll/ۗۘۘ;->ۧ:[S

    aget-short p1, v0, p1

    sget v0, Ll/۟ۘۘ;->ۚ:I

    int-to-double v0, p1

    const-wide v2, 0x3f00002000400080L    # 3.051850947599719E-5

    mul-double v0, v0, v2

    return-wide v0
.end method

.method public final ֫(ID)D
    .locals 0

    const-wide/high16 p1, 0x3ff0000000000000L    # 1.0

    return-wide p1
.end method

.method public final ֫()I
    .locals 1

    .line 55
    iget v0, p0, Ll/ۗۘۘ;->ܽ:I

    return v0
.end method

.method public final ۧ()I
    .locals 1

    .line 50
    iget v0, p0, Ll/ۗۘۘ;->ᩳ:I

    return v0
.end method
