.class public final Ll/ۙ۫ܳ;
.super Ljava/lang/Object;
.source "J4L7"

# interfaces
.implements Ll/ۗ᩻ܳ;


# instance fields
.field public final synthetic ᩸:Ll/ۗ۫ܳ;

.field public final synthetic ᩹:Ll/ۚܺܽ;


# direct methods
.method public constructor <init>(Ll/ۗ۫ܳ;Ll/ۚܺܽ;)V
    .locals 0

    .line 157
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙ۫ܳ;->᩸:Ll/ۗ۫ܳ;

    iput-object p2, p0, Ll/ۙ۫ܳ;->᩹:Ll/ۚܺܽ;

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 1

    .line 170
    iget-object v0, p0, Ll/ۙ۫ܳ;->᩸:Ll/ۗ۫ܳ;

    iget-object v0, v0, Ll/ۗ۫ܳ;->᩻:Ll/᩺ۤܿ;

    invoke-virtual {v0, p1}, Ll/᩺ۤܿ;->ۧ(I)V

    return-void
.end method

.method public final ֫(I[B)V
    .locals 2

    .line 160
    new-instance v0, Ljava/io/ByteArrayInputStream;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1, p1}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    const/4 p1, 0x0

    iget-object p2, p0, Ll/ۙ۫ܳ;->᩹:Ll/ۚܺܽ;

    invoke-virtual {p2, v0, p1}, Ll/ۚܺܽ;->֫(Ljava/io/InputStream;Ll/᩵ۛۡ;)V

    return-void
.end method

.method public final ֫(Ljava/nio/ByteBuffer;)V
    .locals 1

    .line 165
    iget-object v0, p0, Ll/ۙ۫ܳ;->᩹:Ll/ۚܺܽ;

    invoke-virtual {v0, p1}, Ll/ۚܺܽ;->֫(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public final ܳ֫()V
    .locals 2

    .line 175
    iget-object v0, p0, Ll/ۙ۫ܳ;->᩸:Ll/ۗ۫ܳ;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll/ۗ۫ܳ;->ܳ:Z

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 180
    iget-object v0, p0, Ll/ۙ۫ܳ;->᩸:Ll/ۗ۫ܳ;

    iget-object v0, v0, Ll/ۗ۫ܳ;->᩻:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->᩻()Z

    move-result v0

    return v0
.end method
