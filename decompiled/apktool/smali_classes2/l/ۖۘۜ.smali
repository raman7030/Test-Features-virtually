.class public final Ll/ۖۘۜ;
.super Ljava/io/InputStream;
.source "S6V7"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final synthetic ᩸:Ll/ۚۘۜ;

.field public final synthetic ᩹:Ll/᩻ۖܽ;


# direct methods
.method public constructor <init>(Ll/᩻ۖܽ;Ll/ۚۘۜ;)V
    .locals 0

    .line 61
    iput-object p1, p0, Ll/ۖۘۜ;->᩹:Ll/᩻ۖܽ;

    iput-object p2, p0, Ll/ۖۘۜ;->᩸:Ll/ۚۘۜ;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 66
    iget-object v0, p0, Ll/ۖۘۜ;->᩸:Ll/ۚۘۜ;

    invoke-virtual {v0}, Ll/ۚۘۜ;->close()V

    return-void
.end method

.method public final read()I
    .locals 1

    .line 62
    iget-object v0, p0, Ll/ۖۘۜ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v0}, Ll/᩻ۖܽ;->read()I

    move-result v0

    return v0
.end method

.method public final read([BII)I
    .locals 1

    .line 64
    iget-object v0, p0, Ll/ۖۘۜ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v0, p1, p2, p3}, Ll/᩻ۖܽ;->read([BII)I

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
