.class public final Ll/ۨ᩵;
.super Ljava/lang/Object;
.source "W9N5"


# static fields
.field public static final ᩳ:Ll/ۨ᩵;


# instance fields
.field public final ֫:Ljava/util/concurrent/Executor;

.field public ۧ:Ll/ۨ᩵;

.field public final ܽ:Ljava/lang/Runnable;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 202
    new-instance v0, Ll/ۨ᩵;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Ll/ۨ᩵;-><init>(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    sput-object v0, Ll/ۨ᩵;->ᩳ:Ll/ۨ᩵;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 210
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 211
    iput-object p1, p0, Ll/ۨ᩵;->ܽ:Ljava/lang/Runnable;

    .line 212
    iput-object p2, p0, Ll/ۨ᩵;->֫:Ljava/util/concurrent/Executor;

    return-void
.end method
