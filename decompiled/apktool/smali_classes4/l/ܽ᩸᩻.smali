.class public final Ll/ܽ᩸᩻;
.super Ljava/io/FilterInputStream;
.source "18FX"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final synthetic ᩸:Ll/ܿ᩸᩻;

.field public final synthetic ᩹:Ll/ۤ᩷֡;


# direct methods
.method public constructor <init>(Ll/ܿ᩸᩻;Ljava/io/InputStream;Ll/ۤ᩷֡;)V
    .locals 0

    .line 136
    iput-object p1, p0, Ll/ܽ᩸᩻;->᩸:Ll/ܿ᩸᩻;

    iput-object p3, p0, Ll/ܽ᩸᩻;->᩹:Ll/ۤ᩷֡;

    invoke-direct {p0, p2}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 139
    invoke-super {p0}, Ljava/io/FilterInputStream;->close()V

    .line 140
    iget-object v0, p0, Ll/ܽ᩸᩻;->᩸:Ll/ܿ᩸᩻;

    invoke-virtual {v0}, Ll/ܰܺܳ;->᩻()Z

    move-result v1

    iget-object v2, p0, Ll/ܽ᩸᩻;->᩹:Ll/ۤ᩷֡;

    if-eqz v1, :cond_1

    invoke-static {v0}, Ll/ܿ᩸᩻;->֫(Ll/ܿ᩸᩻;)Ll/֡ۛۡ;

    move-result-object v0

    invoke-virtual {v0, v2}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 141
    :cond_1
    :goto_0
    invoke-static {v2}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-void
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
