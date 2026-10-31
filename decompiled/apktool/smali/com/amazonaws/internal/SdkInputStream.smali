.class public abstract Lcom/amazonaws/internal/SdkInputStream;
.super Ljava/io/InputStream;
.source "SdkInputStream.java"

# interfaces
.implements Lcom/amazonaws/internal/MetricAware;
.implements Ll/ܶ֨ᩴ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫()Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 38
    invoke-virtual {p0}, Lcom/amazonaws/internal/SdkInputStream;->ᩳ()Ljava/io/InputStream;

    move-result-object v0

    .line 39
    instance-of v1, v0, Lcom/amazonaws/internal/MetricAware;

    if-eqz v1, :cond_0

    .line 40
    check-cast v0, Lcom/amazonaws/internal/MetricAware;

    .line 41
    invoke-interface {v0}, Lcom/amazonaws/internal/MetricAware;->֫()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()V
    .locals 1

    .line 53
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 59
    :cond_0
    new-instance v0, Lcom/amazonaws/AbortedException;

    invoke-direct {v0}, Lcom/amazonaws/AbortedException;-><init>()V

    throw v0
.end method

.method public abstract ᩳ()Ljava/io/InputStream;
.end method
