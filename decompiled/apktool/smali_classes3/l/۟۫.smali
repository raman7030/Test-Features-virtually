.class public final Ll/۟۫;
.super Ljava/lang/Object;
.source "2B21"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ֫:Landroid/content/Context;

.field public final synthetic ۧ:Ljava/lang/String;

.field public final synthetic ܽ:Ll/ۨ۫;

.field public final synthetic ᩳ:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;Ll/ۨ۫;I)V
    .locals 0

    .line 194
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟۫;->ۧ:Ljava/lang/String;

    iput-object p2, p0, Ll/۟۫;->֫:Landroid/content/Context;

    iput-object p3, p0, Ll/۟۫;->ܽ:Ll/ۨ۫;

    iput p4, p0, Ll/۟۫;->ᩳ:I

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    .line 198
    :try_start_0
    iget-object v0, p0, Ll/۟۫;->ۧ:Ljava/lang/String;

    iget-object v1, p0, Ll/۟۫;->֫:Landroid/content/Context;

    iget-object v2, p0, Ll/۟۫;->ܽ:Ll/ۨ۫;

    iget v3, p0, Ll/۟۫;->ᩳ:I

    invoke-static {v0, v1, v2, v3}, Ll/ܽۤ;->֫(Ljava/lang/String;Landroid/content/Context;Ll/ۨ۫;I)Ll/ۧۤ;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    .line 200
    :catchall_0
    new-instance v0, Ll/ۧۤ;

    const/4 v1, -0x3

    invoke-direct {v0, v1}, Ll/ۧۤ;-><init>(I)V

    return-object v0
.end method
