.class public final Ll/ۧܰܺ;
.super Ljava/lang/Object;
.source "B3B1"


# static fields
.field public static final ᩳ:Ll/ۧܰܺ;


# instance fields
.field public final ֫:Ljava/util/concurrent/Executor;

.field public ۧ:Ll/ۧܰܺ;

.field public final ܽ:Ljava/lang/Runnable;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 131
    new-instance v0, Ll/ۧܰܺ;

    invoke-direct {v0}, Ll/ۧܰܺ;-><init>()V

    sput-object v0, Ll/ۧܰܺ;->ᩳ:Ll/ۧܰܺ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 146
    iput-object v0, p0, Ll/ۧܰܺ;->ܽ:Ljava/lang/Runnable;

    .line 147
    iput-object v0, p0, Ll/ۧܰܺ;->֫:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 140
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 141
    iput-object p1, p0, Ll/ۧܰܺ;->ܽ:Ljava/lang/Runnable;

    .line 142
    iput-object p2, p0, Ll/ۧܰܺ;->֫:Ljava/util/concurrent/Executor;

    return-void
.end method
