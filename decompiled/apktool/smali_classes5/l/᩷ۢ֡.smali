.class public final Ll/᩷ۢ֡;
.super Ljava/io/InputStream;
.source "OJQ"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final synthetic ᩸:Ll/۠ۖܽ;


# direct methods
.method public constructor <init>(Ll/۠ۖܽ;)V
    .locals 0

    .line 97
    iput-object p1, p0, Ll/᩷ۢ֡;->᩸:Ll/۠ۖܽ;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public final read()I
    .locals 1

    .line 100
    iget-object v0, p0, Ll/᩷ۢ֡;->᩸:Ll/۠ۖܽ;

    invoke-interface {v0}, Ll/۠ۖܽ;->read()I

    move-result v0

    return v0
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
