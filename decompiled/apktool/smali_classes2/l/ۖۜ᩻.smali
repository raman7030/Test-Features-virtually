.class public final Ll/ۖۜ᩻;
.super Ljava/lang/Object;
.source "5AHS"


# instance fields
.field public volatile ֫:J

.field public final ۧ:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۖۜ᩻;->ۧ:Ljava/lang/Object;

    .line 41
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۖۜ᩻;->֫:J

    return-void
.end method
