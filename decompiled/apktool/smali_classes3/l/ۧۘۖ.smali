.class public final Ll/ۧۘۖ;
.super Ljava/lang/Object;
.source "K9P0"


# static fields
.field public static final ֫:Ljava/lang/Class;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 28
    :try_start_0
    const-class v0, Ll/֫ۘۖ;

    sget-object v1, Ll/֫ۘۖ;->ۜ:Ll/֫ۘۖ;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    .line 24
    :goto_0
    sput-object v0, Ll/ۧۘۖ;->֫:Ljava/lang/Class;

    return-void
.end method
