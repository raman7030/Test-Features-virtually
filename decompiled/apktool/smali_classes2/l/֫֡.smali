.class public final Ll/֫֡;
.super Ljava/lang/Object;
.source "W9N5"


# static fields
.field public static final ܽ:Ll/֫֡;


# instance fields
.field public volatile ֫:Ll/֫֡;

.field public volatile ۧ:Ljava/lang/Thread;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 121
    new-instance v0, Ll/֫֡;

    .line 132
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 121
    sput-object v0, Ll/֫֡;->ܽ:Ll/֫֡;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 137
    sget-object v0, Ll/ۧ֡;->ۙ:Ll/۫᩵;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Ll/۫᩵;->֫(Ll/֫֡;Ljava/lang/Thread;)V

    return-void
.end method
