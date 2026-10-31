.class public final Ll/ܿܽᩳ;
.super Ljava/io/OutputStream;
.source "51WE"


# instance fields
.field public final synthetic ᩸:Ll/ܳܽᩳ;

.field public final synthetic ᩹:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>(Ll/ܳܽᩳ;Ljava/io/OutputStream;)V
    .locals 0

    .line 85
    iput-object p1, p0, Ll/ܿܽᩳ;->᩸:Ll/ܳܽᩳ;

    iput-object p2, p0, Ll/ܿܽᩳ;->᩹:Ljava/io/OutputStream;

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public final write(I)V
    .locals 1

    .line 94
    iget-object v0, p0, Ll/ܿܽᩳ;->᩹:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 95
    iget-object p1, p0, Ll/ܿܽᩳ;->᩸:Ll/ܳܽᩳ;

    invoke-static {p1}, Ll/ܳܽᩳ;->֫(Ll/ܳܽᩳ;)Ll/᩻ܽᩳ;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ll/᩻ܽᩳ;->֫(I)V

    return-void
.end method

.method public final write([BII)V
    .locals 1

    .line 88
    iget-object v0, p0, Ll/ܿܽᩳ;->᩹:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 89
    iget-object p1, p0, Ll/ܿܽᩳ;->᩸:Ll/ܳܽᩳ;

    invoke-static {p1}, Ll/ܳܽᩳ;->֫(Ll/ܳܽᩳ;)Ll/᩻ܽᩳ;

    move-result-object p1

    invoke-virtual {p1, p3}, Ll/᩻ܽᩳ;->֫(I)V

    return-void
.end method
