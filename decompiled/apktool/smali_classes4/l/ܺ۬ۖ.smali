.class public final Ll/ܺ۬ۖ;
.super Ljava/io/FilterOutputStream;
.source "D9HP"


# instance fields
.field public final ᩸:Ll/۠᩵ۚ;


# direct methods
.method public constructor <init>(Ll/۠᩵ۚ;Ljava/io/ByteArrayOutputStream;)V
    .locals 0

    .line 39
    invoke-direct {p0, p2}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 40
    iput-object p1, p0, Ll/ܺ۬ۖ;->᩸:Ll/۠᩵ۚ;

    return-void
.end method


# virtual methods
.method public final write([BII)V
    .locals 1

    .line 82
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    return-void
.end method

.method public final ֫(Ll/ۚ۬ۖ;)V
    .locals 5

    .line 44
    invoke-virtual {p1}, Ll/ۚ۬ۖ;->ۧ()Ll/ۨ۬ۖ;

    move-result-object v0

    .line 76
    invoke-virtual {v0}, Ll/ۨ۬ۖ;->ۧ()Ll/᩺۬ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩺۬ۖ;->getValue()I

    move-result v1

    invoke-virtual {v0}, Ll/ۨ۬ۖ;->֫()Ll/֡۬ۖ;

    move-result-object v2

    invoke-virtual {v2}, Ll/֡۬ۖ;->getValue()I

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v0}, Ll/ۨ۬ۖ;->ܽ()I

    move-result v0

    or-int/2addr v0, v1

    int-to-byte v0, v0

    .line 77
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 46
    invoke-virtual {p1}, Ll/ۚ۬ۖ;->ۧ()Ll/ۨ۬ۖ;

    move-result-object v0

    iget-object v1, p0, Ll/ܺ۬ۖ;->᩸:Ll/۠᩵ۚ;

    invoke-virtual {v0, v1}, Ll/ۨ۬ۖ;->֫(Ll/۠᩵ۚ;)Ll/ᩴ۬ۖ;

    move-result-object v0

    .line 47
    invoke-virtual {v0, p1}, Ll/ᩴ۬ۖ;->֫(Ll/ۚ۬ۖ;)I

    move-result v1

    const/16 v2, 0x7f

    if-ge v1, v2, :cond_0

    .line 55
    invoke-virtual {p0, v1}, Ljava/io/OutputStream;->write(I)V

    goto :goto_2

    :cond_0
    const/4 v2, 0x1

    move v3, v1

    :goto_0
    const/16 v4, 0xff

    if-le v3, v4, :cond_1

    add-int/lit8 v2, v2, 0x1

    shr-int/lit8 v3, v3, 0x8

    goto :goto_0

    :cond_1
    or-int/lit16 v3, v2, 0x80

    .line 58
    invoke-virtual {p0, v3}, Ljava/io/OutputStream;->write(I)V

    :goto_1
    if-lez v2, :cond_2

    add-int/lit8 v3, v2, -0x1

    mul-int/lit8 v3, v3, 0x8

    shr-int v3, v1, v3

    .line 60
    invoke-virtual {p0, v3}, Ljava/io/OutputStream;->write(I)V

    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    .line 50
    :cond_2
    :goto_2
    invoke-virtual {v0, p1, p0}, Ll/ᩴ۬ۖ;->֫(Ll/ۚ۬ۖ;Ll/ܺ۬ۖ;)V

    return-void
.end method
