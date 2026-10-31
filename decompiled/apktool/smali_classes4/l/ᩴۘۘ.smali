.class public final Ll/ᩴۘۘ;
.super Ljava/lang/Object;
.source "97UZ"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public ۗ:I

.field public ۙ:[B

.field public ᩶:J

.field public ᩸:[B

.field public ᩹:[B


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xff

    .line 59
    iput v0, p0, Ll/ᩴۘۘ;->ۗ:I

    const-wide/16 v0, 0x0

    .line 66
    iput-wide v0, p0, Ll/ᩴۘۘ;->᩶:J

    return-void
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 5

    .line 168
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩴۘۘ;

    .line 170
    iget-object v1, v0, Ll/ᩴۘۘ;->᩹:[B

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 171
    array-length v3, v1

    new-array v4, v3, [B

    .line 172
    invoke-static {v1, v2, v4, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 173
    iput-object v4, v0, Ll/ᩴۘۘ;->᩹:[B

    .line 176
    :cond_0
    iget-object v1, v0, Ll/ᩴۘۘ;->ۙ:[B

    if-eqz v1, :cond_1

    .line 177
    array-length v3, v1

    new-array v4, v3, [B

    .line 178
    invoke-static {v1, v2, v4, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 179
    iput-object v4, v0, Ll/ᩴۘۘ;->ۙ:[B

    .line 182
    :cond_1
    iget-object v1, v0, Ll/ᩴۘۘ;->᩸:[B

    if-eqz v1, :cond_2

    .line 183
    array-length v3, v1

    new-array v4, v3, [B

    .line 184
    invoke-static {v1, v2, v4, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 185
    iput-object v4, v0, Ll/ᩴۘۘ;->᩸:[B

    :cond_2
    return-object v0
.end method
