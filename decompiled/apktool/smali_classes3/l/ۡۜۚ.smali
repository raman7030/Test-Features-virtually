.class public final Ll/ۡۜۚ;
.super Ljava/lang/Object;
.source "N67V"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public final ܽ:Ll/۟ۜۚ;

.field public final ܿ:Ll/ܺۜۚ;

.field public final ᩳ:Ll/ۧ᩷ۚ;


# direct methods
.method public constructor <init>(Ll/۟ۜۚ;Ll/ܳۡۚ;Ll/ܺۜۚ;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Ll/ۡۜۚ;->ܽ:Ll/۟ۜۚ;

    .line 59
    iput-object p2, p0, Ll/ۡۜۚ;->ᩳ:Ll/ۧ᩷ۚ;

    .line 60
    iput-object p3, p0, Ll/ۡۜۚ;->ܿ:Ll/ܺۜۚ;

    return-void
.end method

.method private ᩳ(I)V
    .locals 3

    .line 141
    iget v0, p0, Ll/ۡۜۚ;->֫:I

    sub-int v0, p1, v0

    if-lez v0, :cond_0

    const/4 v1, 0x1

    .line 144
    iget-object v2, p0, Ll/ۡۜۚ;->ܿ:Ll/ܺۜۚ;

    invoke-virtual {v2, v1}, Ll/ܺۜۚ;->write(I)V

    .line 145
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    invoke-static {v2, v0}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    .line 146
    iput p1, p0, Ll/ۡۜۚ;->֫:I

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 1

    const/4 v0, 0x0

    .line 64
    iput v0, p0, Ll/ۡۜۚ;->֫:I

    .line 65
    iput p1, p0, Ll/ۡۜۚ;->ۧ:I

    return-void
.end method

.method public final ֫(II)V
    .locals 1

    .line 92
    invoke-direct {p0, p1}, Ll/ۡۜۚ;->ᩳ(I)V

    const/4 p1, 0x5

    .line 93
    iget-object v0, p0, Ll/ۡۜۚ;->ܿ:Ll/ܺۜۚ;

    invoke-virtual {v0, p1}, Ll/ܺۜۚ;->write(I)V

    .line 157
    invoke-static {v0, p2}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    return-void
.end method

.method public final ֫(IILl/۟ۢۚ;Ll/᩻ۡۚ;Ll/۟ۢۚ;)V
    .locals 2

    .line 72
    iget-object v0, p0, Ll/ۡۜۚ;->ܽ:Ll/۟ۜۚ;

    invoke-interface {v0, p3}, Ll/ۛۜۚ;->ܽ(Ljava/lang/Object;)I

    move-result p3

    .line 73
    iget-object v1, p0, Ll/ۡۜۚ;->ᩳ:Ll/ۧ᩷ۚ;

    check-cast v1, Ll/ܳۡۚ;

    invoke-virtual {v1, p4}, Ll/ܳۡۚ;->ܽ(Ljava/lang/Object;)I

    move-result p4

    .line 74
    invoke-interface {v0, p5}, Ll/ۛۜۚ;->ܽ(Ljava/lang/Object;)I

    move-result p5

    .line 76
    invoke-direct {p0, p1}, Ll/ۡۜۚ;->ᩳ(I)V

    const/4 p1, -0x1

    .line 77
    iget-object v0, p0, Ll/ۡۜۚ;->ܿ:Ll/ܺۜۚ;

    if-ne p5, p1, :cond_0

    const/4 p1, 0x3

    .line 78
    invoke-virtual {v0, p1}, Ll/ܺۜۚ;->write(I)V

    .line 157
    invoke-static {v0, p2}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    add-int/lit8 p3, p3, 0x1

    invoke-static {v0, p3}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    add-int/lit8 p4, p4, 0x1

    invoke-static {v0, p4}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    return-void

    :cond_0
    const/4 p1, 0x4

    .line 83
    invoke-virtual {v0, p1}, Ll/ܺۜۚ;->write(I)V

    .line 157
    invoke-static {v0, p2}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    add-int/lit8 p3, p3, 0x1

    invoke-static {v0, p3}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    add-int/lit8 p4, p4, 0x1

    invoke-static {v0, p4}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    add-int/lit8 p5, p5, 0x1

    invoke-static {v0, p5}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    return-void
.end method

.method public final ֫(ILl/۟ۢۚ;)V
    .locals 1

    .line 135
    invoke-direct {p0, p1}, Ll/ۡۜۚ;->ᩳ(I)V

    const/16 p1, 0x9

    .line 136
    iget-object v0, p0, Ll/ۡۜۚ;->ܿ:Ll/ܺۜۚ;

    invoke-virtual {v0, p1}, Ll/ܺۜۚ;->write(I)V

    .line 137
    iget-object p1, p0, Ll/ۡۜۚ;->ܽ:Ll/۟ۜۚ;

    invoke-interface {p1, p2}, Ll/ۛۜۚ;->ܽ(Ljava/lang/Object;)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    .line 157
    invoke-static {v0, p1}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    return-void
.end method

.method public final ۧ(I)V
    .locals 1

    .line 109
    invoke-direct {p0, p1}, Ll/ۡۜۚ;->ᩳ(I)V

    .line 110
    iget-object p1, p0, Ll/ۡۜۚ;->ܿ:Ll/ܺۜۚ;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Ll/ܺۜۚ;->write(I)V

    return-void
.end method

.method public final ۧ(II)V
    .locals 6

    .line 114
    iget v0, p0, Ll/ۡۜۚ;->ۧ:I

    sub-int v0, p2, v0

    .line 115
    iget v1, p0, Ll/ۡۜۚ;->֫:I

    sub-int v1, p1, v1

    const/4 v2, 0x0

    if-ltz v1, :cond_6

    const/4 v2, 0x2

    .line 120
    iget-object v3, p0, Ll/ۡۜۚ;->ܿ:Ll/ܺۜۚ;

    const/16 v4, 0xa

    const/4 v5, -0x4

    if-lt v0, v5, :cond_0

    if-le v0, v4, :cond_2

    :cond_0
    if-eqz v0, :cond_1

    .line 155
    invoke-virtual {v3, v2}, Ll/ܺۜۚ;->write(I)V

    .line 161
    invoke-static {v3, v0}, Ll/ܺۜۚ;->ۧ(Ljava/io/OutputStream;I)V

    .line 157
    iput p2, p0, Ll/ۡۜۚ;->ۧ:I

    :cond_1
    const/4 v0, 0x0

    :cond_2
    if-ge v0, v2, :cond_3

    const/16 p2, 0x10

    if-gt v1, p2, :cond_4

    :cond_3
    const/4 p2, 0x1

    if-le v0, p2, :cond_5

    const/16 p2, 0xf

    if-le v1, p2, :cond_5

    .line 125
    :cond_4
    invoke-direct {p0, p1}, Ll/ۡۜۚ;->ᩳ(I)V

    const/4 v1, 0x0

    :cond_5
    mul-int/lit8 p1, v1, 0xf

    add-int/2addr p1, v4

    add-int/lit8 p2, v0, 0x4

    add-int/2addr p2, p1

    int-to-byte p1, p2

    .line 162
    invoke-virtual {v3, p1}, Ll/ܺۜۚ;->write(I)V

    .line 163
    iget p1, p0, Ll/ۡۜۚ;->ۧ:I

    add-int/2addr p1, v0

    iput p1, p0, Ll/ۡۜۚ;->ۧ:I

    .line 164
    iget p1, p0, Ll/ۡۜۚ;->֫:I

    add-int/2addr p1, v1

    iput p1, p0, Ll/ۡۜۚ;->֫:I

    return-void

    .line 118
    :cond_6
    new-instance p1, Ll/ܶ᩵ۚ;

    new-array p2, v2, [Ljava/lang/Object;

    const/4 v0, 0x0

    const-string v1, "debug info items must have non-decreasing code addresses"

    .line 46
    invoke-direct {p1, v0, v1, p2}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    throw p1
.end method

.method public final ܽ(I)V
    .locals 1

    .line 104
    invoke-direct {p0, p1}, Ll/ۡۜۚ;->ᩳ(I)V

    .line 105
    iget-object p1, p0, Ll/ۡۜۚ;->ܿ:Ll/ܺۜۚ;

    const/4 v0, 0x7

    invoke-virtual {p1, v0}, Ll/ܺۜۚ;->write(I)V

    return-void
.end method

.method public final ܽ(II)V
    .locals 1

    .line 98
    invoke-direct {p0, p1}, Ll/ۡۜۚ;->ᩳ(I)V

    const/4 p1, 0x6

    .line 99
    iget-object v0, p0, Ll/ۡۜۚ;->ܿ:Ll/ܺۜۚ;

    invoke-virtual {v0, p1}, Ll/ܺۜۚ;->write(I)V

    .line 157
    invoke-static {v0, p2}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    return-void
.end method
