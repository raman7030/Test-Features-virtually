.class public final Ll/ܳܿܽ;
.super Ljava/lang/Object;
.source "H61Y"

# interfaces
.implements Ll/᩻ܿܽ;


# instance fields
.field public final ֫:Ll/᩻ۖܽ;


# direct methods
.method public constructor <init>(Ll/᩻ۖܽ;)V
    .locals 0

    .line 418
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 419
    iput-object p1, p0, Ll/ܳܿܽ;->֫:Ll/᩻ۖܽ;

    return-void
.end method


# virtual methods
.method public final ֫(I)I
    .locals 2

    int-to-long v0, p1

    .line 434
    iget-object p1, p0, Ll/ܳܿܽ;->֫:Ll/᩻ۖܽ;

    invoke-virtual {p1, v0, v1}, Ll/᩻ۖܽ;->seek(J)V

    .line 435
    invoke-virtual {p1}, Ll/᩻ۖܽ;->ۛۧ()I

    move-result p1

    return p1
.end method

.method public final ۧ(I)I
    .locals 2

    int-to-long v0, p1

    .line 424
    iget-object p1, p0, Ll/ܳܿܽ;->֫:Ll/᩻ۖܽ;

    invoke-virtual {p1, v0, v1}, Ll/᩻ۖܽ;->seek(J)V

    .line 425
    invoke-virtual {p1}, Ll/᩻ۖܽ;->read()I

    move-result p1

    if-ltz p1, :cond_0

    and-int/lit16 p1, p1, 0xff

    return p1

    .line 427
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Unexpected end of string data"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
