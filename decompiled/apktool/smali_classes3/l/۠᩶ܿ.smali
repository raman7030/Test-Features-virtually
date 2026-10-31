.class public final Ll/۠᩶ܿ;
.super Ljava/io/OutputStream;
.source "N17O"


# instance fields
.field public final ᩸:Ll/ۚ᩶ܿ;


# direct methods
.method public constructor <init>(Ll/ۚ᩶ܿ;)V
    .locals 0

    .line 169
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 170
    iput-object p1, p0, Ll/۠᩶ܿ;->᩸:Ll/ۚ᩶ܿ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 190
    iget-object v0, p0, Ll/۠᩶ܿ;->᩸:Ll/ۚ᩶ܿ;

    invoke-virtual {v0}, Ll/ۚ᩶ܿ;->֫()V

    return-void
.end method

.method public final flush()V
    .locals 1

    .line 185
    iget-object v0, p0, Ll/۠᩶ܿ;->᩸:Ll/ۚ᩶ܿ;

    invoke-virtual {v0}, Ll/ۚ᩶ܿ;->ܽ()V

    return-void
.end method

.method public final write(I)V
    .locals 3

    int-to-byte p1, p1

    const/4 v0, 0x1

    new-array v1, v0, [B

    const/4 v2, 0x0

    aput-byte p1, v1, v2

    .line 175
    invoke-virtual {p0, v1, v2, v0}, Ll/۠᩶ܿ;->write([BII)V

    return-void
.end method

.method public final write([BII)V
    .locals 1

    .line 180
    iget-object v0, p0, Ll/۠᩶ܿ;->᩸:Ll/ۚ᩶ܿ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۚ᩶ܿ;->ۧ([BII)V

    return-void
.end method
