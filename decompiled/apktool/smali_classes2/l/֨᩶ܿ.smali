.class public final Ll/֨᩶ܿ;
.super Ljava/io/InputStream;
.source "N17O"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final ᩸:Ll/ۚ᩶ܿ;


# direct methods
.method public constructor <init>(Ll/ۚ᩶ܿ;)V
    .locals 0

    .line 144
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 145
    iput-object p1, p0, Ll/֨᩶ܿ;->᩸:Ll/ۚ᩶ܿ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 162
    iget-object v0, p0, Ll/֨᩶ܿ;->᩸:Ll/ۚ᩶ܿ;

    invoke-virtual {v0}, Ll/ۚ᩶ܿ;->֫()V

    return-void
.end method

.method public final read()I
    .locals 4

    const/4 v0, 0x1

    new-array v1, v0, [B

    .line 157
    iget-object v2, p0, Ll/֨᩶ܿ;->᩸:Ll/ۚ᩶ܿ;

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3, v0}, Ll/ۚ᩶ܿ;->֫([BII)I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    return v2

    .line 152
    :cond_0
    aget-byte v0, v1, v3

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([BII)I
    .locals 1

    .line 157
    iget-object v0, p0, Ll/֨᩶ܿ;->᩸:Ll/ۚ᩶ܿ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۚ᩶ܿ;->֫([BII)I

    move-result p1

    return p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
