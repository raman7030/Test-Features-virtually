.class public final Ll/֡ᩳܳ;
.super Ljava/lang/Object;
.source "R70I"


# instance fields
.field public final ֫:Ll/ۡᩳܳ;


# direct methods
.method public constructor <init>(Ll/ۡᩳܳ;)V
    .locals 0

    .line 162
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 163
    iput-object p1, p0, Ll/֡ᩳܳ;->֫:Ll/ۡᩳܳ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 45
    iget-object v0, p0, Ll/֡ᩳܳ;->֫:Ll/ۡᩳܳ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, v0, Ll/ۡᩳܳ;->᩻:I

    return v0
.end method

.method public final ֫(II[B)V
    .locals 2

    const/4 v0, 0x0

    .line 174
    iget-object v1, p0, Ll/֡ᩳܳ;->֫:Ll/ۡᩳܳ;

    invoke-static {p1, v0, p2, v1, p3}, Ll/᩵ᩳܳ;->ۧ(IIILl/ۡᩳܳ;[B)V

    return-void
.end method

.method public final ֫(Ljava/io/OutputStream;I)V
    .locals 5

    .line 131
    invoke-virtual {p0}, Ll/֡ᩳܳ;->֫()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1, p2}, Ll/ۡܽܳ;->ܽ(III)V

    const/4 v0, 0x1

    .line 132
    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/high16 v2, 0x100000

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    new-array v2, v0, [B

    const/4 v3, 0x0

    :goto_0
    if-lez p2, :cond_0

    .line 136
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 137
    invoke-virtual {p0, v3, v4, v2}, Ll/֡ᩳܳ;->֫(II[B)V

    .line 138
    invoke-virtual {p1, v2, v1, v4}, Ljava/io/OutputStream;->write([BII)V

    add-int/2addr v3, v4

    sub-int/2addr p2, v4

    goto :goto_0

    :cond_0
    return-void
.end method
