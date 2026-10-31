.class public final Ll/ܺܰܺ;
.super Ljava/lang/Object;
.source "O7SL"


# static fields
.field public static final ܽ:Ll/ܺܰܺ;


# instance fields
.field public volatile ֫:Ll/ܺܰܺ;

.field public volatile ۧ:Ljava/lang/Thread;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 302
    new-instance v0, Ll/ܺܰܺ;

    .line 311
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 302
    sput-object v0, Ll/ܺܰܺ;->ܽ:Ll/ܺܰܺ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 313
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 315
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {p0, v0}, Ll/ۖܰܺ;->֫(Ll/ܺܰܺ;Ljava/lang/Thread;)V

    return-void
.end method
