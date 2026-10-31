.class public abstract Ll/ܳۨ᩵;
.super Ljava/lang/Object;
.source "LAYC"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public ᩸:J

.field public ᩹:Ll/᩻ۨ᩵;


# direct methods
.method public constructor <init>()V
    .locals 3

    const-wide/16 v0, 0x0

    .line 81
    sget-object v2, Ll/ۢۨ᩵;->ܿ:Ll/᩻ۨ᩵;

    invoke-direct {p0, v0, v1, v2}, Ll/ܳۨ᩵;-><init>(JLl/᩻ۨ᩵;)V

    return-void
.end method

.method public constructor <init>(JLl/᩻ۨ᩵;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    iput-wide p1, p0, Ll/ܳۨ᩵;->᩸:J

    .line 79
    iput-object p3, p0, Ll/ܳۨ᩵;->᩹:Ll/᩻ۨ᩵;

    return-void
.end method
