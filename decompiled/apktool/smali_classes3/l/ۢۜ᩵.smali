.class public final Ll/ۢۜ᩵;
.super Ll/ۡۜ᩵;
.source "K6PM"


# static fields
.field public static final serialVersionUID:J = 0x489d6925990d6e4eL


# instance fields
.field public final ۤ:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 0

    .line 894
    invoke-direct {p0}, Ll/ۡۜ᩵;-><init>()V

    .line 895
    iput-object p1, p0, Ll/ۢۜ᩵;->ۤ:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Throwable;)V
    .locals 1

    .line 594
    sget-object v0, Ll/ܿۜ᩵;->ܳ֫:Ll/ܰ᩻᩵;

    .line 2107
    throw p1
.end method

.method public final ܽ()Z
    .locals 1

    .line 899
    iget-object v0, p0, Ll/ۢۜ᩵;->ۤ:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    const/4 v0, 0x1

    return v0
.end method

.method public final bridge synthetic ᩳ()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
