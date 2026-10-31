.class public final Ll/۠ۡۚ;
.super Ljava/io/OutputStream;
.source "95GT"


# instance fields
.field public ᩸:I

.field public final synthetic ᩹:Ll/᩸ۡۚ;


# direct methods
.method public constructor <init>(Ll/᩸ۡۚ;I)V
    .locals 0

    .line 43
    iput-object p1, p0, Ll/۠ۡۚ;->᩹:Ll/᩸ۡۚ;

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 44
    iput p2, p0, Ll/۠ۡۚ;->᩸:I

    return-void
.end method


# virtual methods
.method public final write(I)V
    .locals 3

    .line 48
    iget v0, p0, Ll/۠ۡۚ;->᩸:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Ll/۠ۡۚ;->᩹:Ll/᩸ۡۚ;

    invoke-static {v1, v0}, Ll/᩸ۡۚ;->֫(Ll/᩸ۡۚ;I)V

    .line 49
    invoke-static {v1}, Ll/᩸ۡۚ;->֫(Ll/᩸ۡۚ;)[B

    move-result-object v0

    iget v1, p0, Ll/۠ۡۚ;->᩸:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/۠ۡۚ;->᩸:I

    int-to-byte p1, p1

    aput-byte p1, v0, v1

    return-void
.end method

.method public final write([B)V
    .locals 4

    .line 54
    iget v0, p0, Ll/۠ۡۚ;->᩸:I

    array-length v1, p1

    add-int/2addr v0, v1

    iget-object v1, p0, Ll/۠ۡۚ;->᩹:Ll/᩸ۡۚ;

    invoke-static {v1, v0}, Ll/᩸ۡۚ;->֫(Ll/᩸ۡۚ;I)V

    .line 55
    invoke-static {v1}, Ll/᩸ۡۚ;->֫(Ll/᩸ۡۚ;)[B

    move-result-object v0

    iget v1, p0, Ll/۠ۡۚ;->᩸:I

    array-length v2, p1

    const/4 v3, 0x0

    invoke-static {p1, v3, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 56
    iget v0, p0, Ll/۠ۡۚ;->᩸:I

    array-length p1, p1

    add-int/2addr v0, p1

    iput v0, p0, Ll/۠ۡۚ;->᩸:I

    return-void
.end method

.method public final write([BII)V
    .locals 2

    .line 61
    iget v0, p0, Ll/۠ۡۚ;->᩸:I

    add-int/2addr v0, p3

    iget-object v1, p0, Ll/۠ۡۚ;->᩹:Ll/᩸ۡۚ;

    invoke-static {v1, v0}, Ll/᩸ۡۚ;->֫(Ll/᩸ۡۚ;I)V

    .line 62
    invoke-static {v1}, Ll/᩸ۡۚ;->֫(Ll/᩸ۡۚ;)[B

    move-result-object v0

    iget v1, p0, Ll/۠ۡۚ;->᩸:I

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 63
    iget p1, p0, Ll/۠ۡۚ;->᩸:I

    add-int/2addr p1, p3

    iput p1, p0, Ll/۠ۡۚ;->᩸:I

    return-void
.end method
