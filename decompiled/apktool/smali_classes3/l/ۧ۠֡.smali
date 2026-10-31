.class public final Ll/ۧ۠֡;
.super Ljava/lang/Object;
.source "X7RR"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public final ܽ:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 0

    .line 142
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 144
    iput-object p1, p0, Ll/ۧ۠֡;->ܽ:Ljava/io/OutputStream;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 132
    iget v0, p0, Ll/ۧ۠֡;->ۧ:I

    if-lez v0, :cond_0

    rsub-int/lit8 v0, v0, 0x8

    const/4 v1, 0x0

    .line 133
    invoke-virtual {p0, v0, v1}, Ll/ۧ۠֡;->֫(II)V

    :cond_0
    return-void
.end method

.method public final ֫(II)V
    .locals 3

    .line 97
    iget v0, p0, Ll/ۧ۠֡;->ۧ:I

    .line 98
    iget v1, p0, Ll/ۧ۠֡;->֫:I

    rsub-int/lit8 v2, p1, 0x20

    shl-int/2addr p2, v2

    ushr-int/2addr p2, v0

    or-int/2addr p2, v1

    add-int/2addr v0, p1

    :goto_0
    const/16 p1, 0x8

    if-lt v0, p1, :cond_0

    ushr-int/lit8 p1, p2, 0x18

    .line 102
    iget-object v1, p0, Ll/ۧ۠֡;->ܽ:Ljava/io/OutputStream;

    invoke-virtual {v1, p1}, Ljava/io/OutputStream;->write(I)V

    shl-int/lit8 p2, p2, 0x8

    add-int/lit8 v0, v0, -0x8

    goto :goto_0

    .line 107
    :cond_0
    iput p2, p0, Ll/ۧ۠֡;->֫:I

    .line 108
    iput v0, p0, Ll/ۧ۠֡;->ۧ:I

    return-void
.end method

.method public final ֫(Z)V
    .locals 3

    .line 59
    iget v0, p0, Ll/ۧ۠֡;->ۧ:I

    add-int/lit8 v0, v0, 0x1

    .line 60
    iget v1, p0, Ll/ۧ۠֡;->֫:I

    rsub-int/lit8 v2, v0, 0x20

    shl-int/2addr p1, v2

    or-int/2addr p1, v1

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    ushr-int/lit8 p1, p1, 0x18

    .line 63
    iget-object v0, p0, Ll/ۧ۠֡;->ܽ:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    const/4 v0, 0x0

    const/4 p1, 0x0

    .line 68
    :cond_0
    iput p1, p0, Ll/ۧ۠֡;->֫:I

    .line 69
    iput v0, p0, Ll/ۧ۠֡;->ۧ:I

    return-void
.end method
