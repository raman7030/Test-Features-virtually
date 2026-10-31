.class public final Ll/ᩴᩳ֡;
.super Ljava/lang/Object;
.source "D4F3"


# instance fields
.field public final ֫:[B

.field public ۧ:I

.field public ܳ:Ll/ᩴᩳ֡;

.field public ܽ:Ll/ᩴᩳ֡;

.field public ܿ:I

.field public ᩳ:Z

.field public ᩻:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2000

    new-array v0, v0, [B

    .line 63
    iput-object v0, p0, Ll/ᩴᩳ֡;->֫:[B

    const/4 v0, 0x1

    .line 64
    iput-boolean v0, p0, Ll/ᩴᩳ֡;->ᩳ:Z

    const/4 v0, 0x0

    .line 65
    iput-boolean v0, p0, Ll/ᩴᩳ֡;->᩻:Z

    return-void
.end method

.method public constructor <init>([BII)V
    .locals 0

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    iput-object p1, p0, Ll/ᩴᩳ֡;->֫:[B

    .line 70
    iput p2, p0, Ll/ᩴᩳ֡;->ܿ:I

    .line 71
    iput p3, p0, Ll/ᩴᩳ֡;->ۧ:I

    const/4 p1, 0x1

    .line 72
    iput-boolean p1, p0, Ll/ᩴᩳ֡;->᩻:Z

    const/4 p1, 0x0

    .line 73
    iput-boolean p1, p0, Ll/ᩴᩳ֡;->ᩳ:Z

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ᩴᩳ֡;
    .locals 4

    .line 96
    iget-object v0, p0, Ll/ᩴᩳ֡;->ܽ:Ll/ᩴᩳ֡;

    const/4 v1, 0x0

    if-eq v0, p0, :cond_0

    move-object v2, v0

    goto :goto_0

    :cond_0
    move-object v2, v1

    .line 97
    :goto_0
    iget-object v3, p0, Ll/ᩴᩳ֡;->ܳ:Ll/ᩴᩳ֡;

    iput-object v0, v3, Ll/ᩴᩳ֡;->ܽ:Ll/ᩴᩳ֡;

    .line 98
    iget-object v0, p0, Ll/ᩴᩳ֡;->ܽ:Ll/ᩴᩳ֡;

    iput-object v3, v0, Ll/ᩴᩳ֡;->ܳ:Ll/ᩴᩳ֡;

    .line 99
    iput-object v1, p0, Ll/ᩴᩳ֡;->ܽ:Ll/ᩴᩳ֡;

    .line 100
    iput-object v1, p0, Ll/ᩴᩳ֡;->ܳ:Ll/ᩴᩳ֡;

    return-object v2
.end method

.method public final ֫(Ll/ᩴᩳ֡;)V
    .locals 1

    .line 109
    iput-object p0, p1, Ll/ᩴᩳ֡;->ܳ:Ll/ᩴᩳ֡;

    .line 110
    iget-object v0, p0, Ll/ᩴᩳ֡;->ܽ:Ll/ᩴᩳ֡;

    iput-object v0, p1, Ll/ᩴᩳ֡;->ܽ:Ll/ᩴᩳ֡;

    .line 111
    iget-object v0, p0, Ll/ᩴᩳ֡;->ܽ:Ll/ᩴᩳ֡;

    iput-object p1, v0, Ll/ᩴᩳ֡;->ܳ:Ll/ᩴᩳ֡;

    .line 112
    iput-object p1, p0, Ll/ᩴᩳ֡;->ܽ:Ll/ᩴᩳ֡;

    return-void
.end method

.method public final ֫(Ll/ᩴᩳ֡;I)V
    .locals 5

    .line 163
    iget-boolean v0, p1, Ll/ᩴᩳ֡;->ᩳ:Z

    iget-object v1, p1, Ll/ᩴᩳ֡;->֫:[B

    if-eqz v0, :cond_3

    .line 164
    iget v0, p1, Ll/ᩴᩳ֡;->ۧ:I

    add-int v2, v0, p2

    const/16 v3, 0x2000

    if-le v2, v3, :cond_2

    .line 166
    iget-boolean v4, p1, Ll/ᩴᩳ֡;->᩻:Z

    if-nez v4, :cond_1

    .line 167
    iget v4, p1, Ll/ᩴᩳ֡;->ܿ:I

    sub-int/2addr v2, v4

    if-gt v2, v3, :cond_0

    sub-int/2addr v0, v4

    const/4 v2, 0x0

    .line 168
    invoke-static {v1, v4, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 169
    iget v0, p1, Ll/ᩴᩳ֡;->ۧ:I

    iget v3, p1, Ll/ᩴᩳ֡;->ܿ:I

    sub-int/2addr v0, v3

    iput v0, p1, Ll/ᩴᩳ֡;->ۧ:I

    .line 170
    iput v2, p1, Ll/ᩴᩳ֡;->ܿ:I

    goto :goto_0

    .line 167
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 166
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 173
    :cond_2
    :goto_0
    iget v0, p0, Ll/ᩴᩳ֡;->ܿ:I

    iget v2, p1, Ll/ᩴᩳ֡;->ۧ:I

    iget-object v3, p0, Ll/ᩴᩳ֡;->֫:[B

    invoke-static {v3, v0, v1, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 174
    iget v0, p1, Ll/ᩴᩳ֡;->ۧ:I

    add-int/2addr v0, p2

    iput v0, p1, Ll/ᩴᩳ֡;->ۧ:I

    .line 175
    iget p1, p0, Ll/ᩴᩳ֡;->ܿ:I

    add-int/2addr p1, p2

    iput p1, p0, Ll/ᩴᩳ֡;->ܿ:I

    return-void

    .line 163
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final ۧ()Ll/ᩴᩳ֡;
    .locals 4

    const/4 v0, 0x1

    .line 82
    iput-boolean v0, p0, Ll/ᩴᩳ֡;->᩻:Z

    .line 83
    new-instance v0, Ll/ᩴᩳ֡;

    iget v1, p0, Ll/ᩴᩳ֡;->ܿ:I

    iget v2, p0, Ll/ᩴᩳ֡;->ۧ:I

    iget-object v3, p0, Ll/ᩴᩳ֡;->֫:[B

    invoke-direct {v0, v3, v1, v2}, Ll/ᩴᩳ֡;-><init>([BII)V

    return-object v0
.end method
