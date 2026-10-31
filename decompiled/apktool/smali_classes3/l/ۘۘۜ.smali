.class public final Ll/ۘۘۜ;
.super Ljava/io/FilterInputStream;
.source "S6V7"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final synthetic ᩸:Ll/ۚۘۜ;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ll/ۚۘۜ;)V
    .locals 0

    .line 92
    iput-object p2, p0, Ll/ۘۘۜ;->᩸:Ll/ۚۘۜ;

    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 93
    iget-object v0, p0, Ll/ۘۘۜ;->᩸:Ll/ۚۘۜ;

    invoke-virtual {v0}, Ll/ۚۘۜ;->close()V

    return-void
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
