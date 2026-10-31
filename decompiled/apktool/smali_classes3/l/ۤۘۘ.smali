.class public final Ll/ۤۘۘ;
.super Ljava/lang/Object;
.source "I8BW"


# instance fields
.field public ֫:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۤۘۘ;->֫:J

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 37
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۤۘۘ;->֫:J

    return-void
.end method
