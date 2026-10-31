.class public final Ll/֨᩶᩻;
.super Ljava/io/FilterInputStream;
.source "81ZE"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final synthetic ᩸:Ll/ᩳܰۡ;

.field public final synthetic ᩹:Ll/֡ۛۡ;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ll/֡ۛۡ;Ll/ᩳܰۡ;)V
    .locals 0

    .line 310
    iput-object p2, p0, Ll/֨᩶᩻;->᩹:Ll/֡ۛۡ;

    iput-object p3, p0, Ll/֨᩶᩻;->᩸:Ll/ᩳܰۡ;

    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 313
    invoke-super {p0}, Ljava/io/FilterInputStream;->close()V

    .line 314
    iget-object v0, p0, Ll/֨᩶᩻;->᩹:Ll/֡ۛۡ;

    iget-object v1, p0, Ll/֨᩶᩻;->᩸:Ll/ᩳܰۡ;

    invoke-virtual {v0, v1}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 315
    invoke-static {v1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    :cond_0
    return-void
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
