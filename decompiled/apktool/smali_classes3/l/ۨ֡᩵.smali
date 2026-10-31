.class public Ll/ۨ֡᩵;
.super Ljava/lang/Object;
.source "CA02"


# instance fields
.field public ֫:J

.field public ۧ:Ll/ۧۤᩴ;


# direct methods
.method public constructor <init>(J)V
    .locals 4

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long p1, p1, v2

    add-long/2addr p1, v0

    iput-wide p1, p0, Ll/ۨ֡᩵;->֫:J

    .line 58
    new-instance p1, Ll/ۧۤᩴ;

    invoke-direct {p1}, Ll/ۧۤᩴ;-><init>()V

    iput-object p1, p0, Ll/ۨ֡᩵;->ۧ:Ll/ۧۤᩴ;

    return-void
.end method
