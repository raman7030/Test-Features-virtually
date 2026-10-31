.class public final Ll/֨ۡۚ;
.super Ljava/lang/Object;
.source "Y17M"

# interfaces
.implements Ll/ۚۡۚ;


# instance fields
.field public final ᩸:Ll/᩻ۖܽ;


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;)V
    .locals 2

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "rw"

    .line 16
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object p1

    iput-object p1, p0, Ll/֨ۡۚ;->᩸:Ll/᩻ۖܽ;

    const-wide/16 v0, 0x0

    .line 17
    invoke-virtual {p1, v0, v1}, Ll/᩻ۖܽ;->setLength(J)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 34
    iget-object v0, p0, Ll/֨ۡۚ;->᩸:Ll/᩻ۖܽ;

    invoke-virtual {v0}, Ll/᩻ۖܽ;->close()V

    return-void
.end method

.method public final ֨(I)Ljava/io/OutputStream;
    .locals 4

    .line 23
    new-instance v0, Ll/֨ۖܽ;

    iget-object v1, p0, Ll/֨ۡۚ;->᩸:Ll/᩻ۖܽ;

    int-to-long v2, p1

    invoke-direct {v0, v2, v3, v1}, Ll/֨ۖܽ;-><init>(JLl/᩻ۖܽ;)V

    return-object v0
.end method

.method public final ۚ(I)Ljava/io/InputStream;
    .locals 4

    .line 29
    new-instance v0, Ll/ۚۖܽ;

    iget-object v1, p0, Ll/֨ۡۚ;->᩸:Ll/᩻ۖܽ;

    int-to-long v2, p1

    invoke-direct {v0, v2, v3, v1}, Ll/ۚۖܽ;-><init>(JLl/᩻ۖܽ;)V

    return-object v0
.end method
